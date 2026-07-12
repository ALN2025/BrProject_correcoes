/*
 * Copyright (c) Dev A.L.N. Todos os direitos reservados.
 */

package net.sf.donationmanager;

import com.google.zxing.WriterException;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Currency;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

import ext.mods.commons.data.Pagination;
import ext.mods.commons.logging.CLogger;
import ext.mods.commons.pool.ThreadPool;
import ext.mods.commons.util.ArraysUtil;

import net.sf.donationmanager.paymenthandlers.MercadoPago;
import net.sf.donationmanager.paymenthandlers.binance.Binance;
import net.sf.donationmanager.paymenthandlers.paypal.PayPal;
import net.sf.donationmanager.purchase.Purchase;
import net.sf.donationmanager.purchase.PaymentMethod;
import net.sf.donationmanager.purchase.PurchaseStatus;
import net.sf.donationmanager.tasks.CryptoCurrencyTask;
import net.sf.donationmanager.tasks.DonationAutomaticPaymentTask;
import net.sf.donationmanager.tasks.DonationTaskManager;
import ext.mods.Config;
import ext.mods.gameserver.data.HTMLData;
import ext.mods.gameserver.data.xml.ItemData;
import ext.mods.gameserver.model.World;
import ext.mods.gameserver.model.actor.Player;
import ext.mods.commons.lang.StringUtil;
import ext.mods.gameserver.network.serverpackets.ActionFailed;
import ext.mods.gameserver.network.serverpackets.NpcHtmlMessage;
import ext.mods.gameserver.network.serverpackets.PledgeCrest;
import ext.mods.gameserver.network.serverpackets.ShowCalculator;
import ext.mods.gameserver.network.serverpackets.TutorialCloseHtml;
import ext.mods.donation.DonationAnnounce;
import ext.mods.gameserver.enums.FloodProtector;

public class DonationManager
{
	private static final CLogger LOGGER = new CLogger(DonationManager.class.getName());

	private static final int HTML_ID = 9999;
	private static final String HTML_PATH = "html/mods/donation/";
	
	/** Memória do jogador: {@code pt} ou {@code en} — pastas sob {@code mods/donation/} (.pix / .pay). */
	public static final String MEMO_DONATION_HTML_LOCALE = "donation_html_locale";
	
	private static String donationHtmlFile(Player player, String file)
	{
		return HTML_PATH + getDonationHtmlSubfolder(player) + (file == null ? "" : file);
	}
	
	/** Ex.: {@code pt/} ou {@code en/}, ou vazio (HTML na raiz de donation). */
	public static String getDonationHtmlSubfolder(Player player)
	{
		if (player == null)
			return "";
		final Object o = player.getMemos().get(MEMO_DONATION_HTML_LOCALE);
		if (!(o instanceof String))
			return "";
		String s = ((String) o).trim().toLowerCase(java.util.Locale.ENGLISH);
		if (s.isEmpty())
			return "";
		if (!s.matches("[a-z]{2}"))
			return "";
		return s + "/";
	}
	
	/** {@code true} quando a loja usa a pasta {@code html/mods/donation/en/} ({@code .pay}). */
	public static boolean isDonationEnglish(Player player)
	{
		return "en/".equals(getDonationHtmlSubfolder(player));
	}
	
	static String dt(Player player, String pt, String en)
	{
		return isDonationEnglish(player) ? en : pt;
	}
	
	private static String htmlCalculator(Player player)
	{
		return "<tr><td align=center><a action=\"bypass donation calculator\">" + dt(player, "Calculadora", "Calculator") + "</a></td></tr>";
	}
	
	private static String htmlCheckButton(Player player)
	{
		return "<td><button value=\"" + dt(player, "Paguei", "I Paid") + "\" action=\"bypass -h donation check %id%\" width=75 height=21 back=L2UI_ch3.Btn1_normalOn fore=L2UI_ch3.Btn1_normal></td>";
	}
	
	private static String purchaseStatusLabel(Player player, PurchaseStatus status)
	{
		if (!isDonationEnglish(player))
			return status.getDesc();
		
		return switch (status)
		{
			case PENDING -> "Awaiting confirmation";
			case CREATED -> "Purchase created. Awaiting payment";
			case WAITING -> "Awaiting payment";
			case CANCELED -> "Canceled by player";
			case EXPIRED -> "Payment deadline expired";
			case COMPLETED -> "Payment received and items delivered";
			case FAILED -> "Payment failed";
			case REFUNDED -> "Refunded";
			case OFFLINE -> "Player was offline and did not receive items";
			case HIDDEN -> "Purchase hidden from player";
			case FINISHING -> "Running final checks before closing";
		};
	}
	
	private static String purchaseStatusShort(Player player, PurchaseStatus status)
	{
		if (!isDonationEnglish(player))
			return status.getName();
		
		return switch (status)
		{
			case PENDING -> "Pending";
			case CREATED -> "Created";
			case WAITING -> "Waiting";
			case CANCELED -> "Canceled";
			case EXPIRED -> "Expired";
			case COMPLETED -> "Completed";
			case FAILED -> "Failed";
			case REFUNDED -> "Refunded";
			case OFFLINE -> "Offline";
			case HIDDEN -> "Hidden";
			case FINISHING -> "Finishing";
		};
	}
	
	private static final String HTML_EMPTY_TABLE = "<table><tr><td></td></tr><tr><td width=70>---</td><td width=115>---</td><td width=50>---</td><td width=75>---</td></tr><tr><td></td></tr></table>";
	private static final String HTML_LINE = "<img src=L2UI.SquareGray width=280 height=1>";
	public static final String HTML_PURCHASE_MESSAGE = "<br><table bgcolor=000000 cellpadding=4><tr><td align=center width=280><font color=ff0000>%s</font></td></tr><tr><td>%s</td></tr></table>";
	private static final String HTML_BANNER = "<tr><td></td><td><table bgcolor=ff0000><tr><td width=265 align=center>%s</td></tr></table></td></tr>";
	private static final String HTML_CHOICE_CHECKBOX = "<td fixwidth=1><button action=\"bypass donation %s_selector %s\" width=14 height=14 back=L2UI.control.checkBox_%s fore=L2UI.control.checkBox_%3$s></td><td align=left width=%d valign=top>%s</td>";
	@SuppressWarnings("unused")
	private static final String HTML_CHOICE_CLEAR = "<td align=center><button value=\"-\" action=\"bypass donation clear_selectors\" width=25 height=17 back=sek.cbui94 fore=sek.cbui92></td>";
	private static final String HTML_INPUT_BOX = "<edit var=\"Quantity\" type=number width=50 height=13 length=3>";
	private static final String HTML_SEARCH_CRYPTO = "<td width=14><button action=\"bypass donation search\" width=14 height=14 back=L2UI_ch3.QuestWndPlusBtn_over fore=L2UI_ch3.QuestWndPlusBtn></td>";
	private static final String HTML_QRCODE_BUTTON = "<td><button value=\"QR Code\" action=\"bypass donation qrcode %id%\" width=75 height=21 back=L2UI_ch3.Btn1_normalOn fore=L2UI_ch3.Btn1_normal></td>";
	private static final String HTML_LINK_BUTTON = "<td><button value=\"Link\" action=\"bypass donation link %id% false\" width=75 height=21 back=L2UI_ch3.Btn1_normalOn fore=L2UI_ch3.Btn1_normal></td>";
	private static final String HTML_REFRESH_BUTTON = "<td><table><tr><td><button action=\"bypass -h donation index\" width=14 height=14 back=L2UI_ch3.ShortcutWnd.shortcut_rotate_over fore=L2UI_ch3.ShortcutWnd.shortcut_rotate></td></tr></table></td>";

	/** Caixinhas marcadas do checkout (PIX+BRL ou PayPal+USD) — so leitura, sem bypass. */
	private static void appendLocaleCheckoutMarkers(StringBuilder sb, Player player, CheckoutChoice cc)
	{
		if (cc.getGateway() == null || cc.getCurrency() == null)
			return;
		
		final PaymentMethod pm = PaymentMethod.valueOf(cc.getGateway());
		sb.append("<tr>");
		sb.append(String.format(
			"<td fixwidth=1><button action=\" \" width=14 height=14 back=L2UI.control.checkBox_checked fore=L2UI.control.checkBox_checked></td><td align=left width=%d valign=top>%s</td>",
			pm.getHtmlColumnWidth(), pm.getDisplayName()));
		sb.append(String.format(
			"<td fixwidth=1><button action=\" \" width=14 height=14 back=L2UI.control.checkBox_checked fore=L2UI.control.checkBox_checked></td><td align=left width=32 valign=top>%s</td>",
			cc.getCurrency()));
		sb.append("</tr>");
	}

	private static final String EMAIL_PATTERN = "^[A-Za-z0-9+_.-]+@(.+)$";
	private static final String CURRENCY_CODE_PATERN = "^[a-zA-Z]{3,6}$";

	private final static Map<Integer, Purchase> _waitingPurchases = new ConcurrentHashMap<>();
	private final static Map<Integer, CheckoutChoice> _checkoutChoice = new ConcurrentHashMap<>();
	private final static Map<String, IPaymentHandler> _paymentHandlers = new HashMap<>();
	
	public DonationManager()
	{
		// Tasks
		DonationTaskManager.getInstance();
		DonationAutomaticPaymentTask.getInstance();
		CurrencyManager.getInstance();
		
		// Handlers
		registerPaymentHandler("MP", new MercadoPago());
		registerPaymentHandler("PAYPAL", new PayPal());
		registerPaymentHandler("BINANCE", new Binance());
		
		// Banco de dados
		DonationData.getInstance().restore();
	}
	
	private static void registerPaymentHandler(String id, IPaymentHandler handler)
	{
		_paymentHandlers.put(id, handler);
	}
	
	public IPaymentHandler getPaymentHandler(String id)
	{
		return _paymentHandlers.get(id);
	}
	
	public void reload()
	{
		_paymentHandlers.values().forEach(IPaymentHandler::reload);
		_checkoutChoice.clear();
		CurrencyManager.getInstance().reload();
	}
	
	public boolean isEnabled()
	{
		if (!Config.DONATION_ENABLED || Config.DONATION_PURCHASABLE_ITEM == 0 || ItemData.getInstance().getTemplate(Config.DONATION_PURCHASABLE_ITEM) == null)
			return false;
		
		if ((Config.DONATION_MP_PIX || Config.DONATION_MP_LINK) && Config.DONATION_MP_TOKEN.isEmpty())
			return false;
		
		if (Config.DONATION_PAYPAL_LINK && (Config.DONATION_PAYPAL_CLIENT_ID.isEmpty() || Config.DONATION_PAYPAL_CLIENT_SECRET.isEmpty() || Config.DONATION_PAYPAL_ACCOUNT_EMAIL.isEmpty()))
			return false;
		
		if (Config.DONATION_BINANCE_PAY && (Config.DONATION_BINANCE_API_KEY.isEmpty() || Config.DONATION_BINANCE_SECRET_KEY.isEmpty()))
			return false;
		
		return true;
	}
	
	private static CheckoutChoice getChoice(int playerId)
	{
		return _checkoutChoice.computeIfAbsent(playerId, k -> new CheckoutChoice());
	}
	
	/** Aplica PIX+BRL (pt) ou PayPal+USD (en) antes de abrir a loja. */
	public void prepareShopForLocale(Player player)
	{
		if (player == null)
			return;
		
		CheckoutChoice.ensureCheckoutMatchesLocale(player, getChoice(player.getObjectId()));
	}
	
	public void handleBypass(Player player, String command)
	{
		try
		{
			final StringTokenizer st = new StringTokenizer(command, " ");
			final String action = st.nextToken();

			if (action.equals("htm"))
			{
				final String file = st.nextToken();
				if (file.equals("info.htm"))
					showCustomWindow(player, file);
			}
			else if (action.equals("email"))
			{
				final String next = st.nextToken();
				if (next.equals("view"))
				{
					// Remover compras pendentes
					if (_waitingPurchases.containsKey(player.getObjectId()))
						_waitingPurchases.remove(player.getObjectId());

					showEmailWindow(player, (String) player.getMemos().get("donation_email"));
				}
				else if (next.equals("set"))
					setPlayerEmail(player, st.hasMoreTokens() ? st.nextToken() : null);
			}
			else if (action.equals("index"))
			{
				if (st.countTokens() == 2)
					showIndexWindow(player, Boolean.valueOf(st.nextToken()), Boolean.valueOf(st.nextToken()));
				else
					showIndexWindow(player);
			}
			else if (action.equals("gateway_selector"))
				getChoice(player.getObjectId()).changeGatewayChoice(player, st.nextToken());
			else if (action.equals("currency_selector"))
				getChoice(player.getObjectId()).changeCurrencyChoice(player, st.nextToken());
			else if (action.equals("custom_selector"))
				getChoice(player.getObjectId()).changeCustom(player, st.nextToken());
			else if (action.equals("clear_selectors"))
			{
				final CheckoutChoice cc = getChoice(player.getObjectId());
				cc.setCurrency(null);
				cc.setGateway(null);
				showIndexWindow(player);
			}
			else if (action.equals("checkout_pix"))
			{
				final CheckoutChoice cc = getChoice(player.getObjectId());
				player.getMemos().set(MEMO_DONATION_HTML_LOCALE, "pt");
				cc.setGateway(PaymentMethod.MP_PIX.name());
				cc.setCurrency(PaymentMethod.MP_PIX.getMainCurrency());
				showIndexWindow(player);
			}
			else if (action.equals("checkout_intl"))
			{
				final CheckoutChoice cc = getChoice(player.getObjectId());
				player.getMemos().set(MEMO_DONATION_HTML_LOCALE, "en");
				cc.setGateway(PaymentMethod.PAYPAL.name());
				final List<String> currencies = PaymentMethod.PAYPAL.getAllCurrencies();
				cc.setCurrency(currencies.contains("USD") ? "USD" : PaymentMethod.PAYPAL.getMainCurrency());
				showIndexWindow(player);
			}
			else if (action.equals("clear_cryptos"))
			{
				getChoice(player.getObjectId()).getCustomCryptos().clear();
				showSearchWindow(player, null, null);
			}
			else if (action.equals("buy"))
				newPurchase(player, st.hasMoreTokens() ? Integer.valueOf(st.nextToken()) : 0);
			else if (action.equals("calculator"))
			{
				if (Config.DONATION_CALCULATOR)
					player.sendPacket(new ShowCalculator(4393));
			}
			else if (action.equals("search"))
			{
				if (st.hasMoreTokens())
					searchCriptoCurrency(player, st.nextToken().toUpperCase());
				else
					showSearchWindow(player, null, null);
			}
			else
			{
				final int id = Integer.valueOf(st.nextToken());
				if (action.equals("check"))
					checkPaymentStatus(player, id);
				else if (action.equals("status"))
					showPurchaseStatusWindow(player, id);
				else if (action.equals("hide"))
					hidePurchase(player, id);
				else if (action.equals("history"))
					showPurchaseHistoryWindow(player, id);
				else if (action.equals("cancel"))
					cancelPurchase(player, id);
				else if (action.equals("qrcode"))
					showQrCodeWindow(player, id);
				else if (action.equals("link"))
					showLinkWindow(player, id, st.nextToken().equals("true"));
				else if (action.equals("confirm"))
					showConfirmActionWindow(player, id, st.nextToken());
				else if (action.equals("closeqr"))
				{
					if (Config.DONATION_ENABLED)
					{
						showPurchaseStatusWindow(player, id);
						player.sendPacket(TutorialCloseHtml.STATIC_PACKET);
					}
				}
				else if (action.equals("terms"))
					handleTermsActions(player, id, st.nextToken());	
			}
		}
		catch (Exception e)
		{
			// Não existem problemas no bypass, por que um player causaria isso?
			if (!player.isGM())
				player.logout(true);
			
			LOGGER.warn("Falha ao lidar com o bypass do DonationManager. Player: {}, Command: {}", e, player.getName(), command);
		}
	}
	
	/**
	 * Entrega a compra feita por um player que estava offline no momento em que os itens seriam entregues
	 * @param player
	 */
	public void offlinePlayer(Player player)
	{
		for (Purchase p : DonationData.getInstance().getPurchases(player.getObjectId()))
		{
			if (p.getStatus() != PurchaseStatus.OFFLINE)
				continue;

			player.addItem(p.getProductId(), p.getQuantity(), true);
			p.changeStatus(PurchaseStatus.COMPLETED);
			if (Config.ANNOUNCE_DONATOR_ITEM_GLOBAL)
				DonationAnnounce.announceCompleted(player.getName());
		}
	}
	
	public Map<Integer, Purchase> getWaitingPurchases()
	{
		return _waitingPurchases;
	}

	public void showIndexWindow(Player player)
	{
		showIndexWindow(player, false, false);
	}
	
	public void showIndexWindow(Player player, boolean showGatewaySelector, boolean showCurrencySelector)
	{
		if (!isEnabled())
		{
			showCustomWindow(player, player.isGM() ? "index_disabled.htm" : "index_disabled_player.htm");
			return;
		}
		
		final NpcHtmlMessage html = new NpcHtmlMessage(0);
		html.setItemId(HTML_ID);
		html.setFile(player.getLocale(), donationHtmlFile(player, "index_single.htm"));
		
		final StringBuilder sb = new StringBuilder();
		final CheckoutChoice cc = getChoice(player.getObjectId());
		if (cc.getGateway() == null && cc.getCurrency() == null)
			cc.applyDefaultCheckoutWhenMultipleGateways(player);
		final Set<String> currencySet = new HashSet<>();
		String bannerMsg;
		
		if (showCurrencySelector || !showGatewaySelector && cc.getGateway() != null && cc.getCurrency() == null)
		{
			sb.append("<tr>");
			
			// Exibir somente as currencies compatíveis com o checkout selecionado (se houver um)
			for (PaymentMethod pm : PaymentMethod.values())
			{
				if (!pm.isEnabled())
					continue;
				
				if (cc.getGateway() != null && !pm.name().equals(cc.getGateway()))
					continue;

				// As cripto só são exibidas quando a binance está selecionada
				if (pm == PaymentMethod.BINANCE && !pm.name().equals(cc.getGateway()))
					continue;
				
				// Se o player não fez uma escolha, exibimos as moedas padrão
				if (pm == PaymentMethod.BINANCE && cc.getCustomCryptos().isEmpty())
					cc.getCustomCryptos().addAll(CurrencyManager.DEFAULT_CRYPTO_CURRENCIES);
				
				for (String currency : pm == PaymentMethod.BINANCE ? cc.getCustomCryptos() : pm.getAllCurrencies())
				{
					if (!CurrencyManager.getInstance().isExchangeAvailable(pm, currency))
						continue;
					
					if (currencySet.contains(currency))
						continue;
					
					if (!currencySet.isEmpty() && currencySet.size() % (pm == PaymentMethod.BINANCE ? 4 : 5) == 0)
						sb.append("</tr><tr>");
					
					sb.append(String.format(HTML_CHOICE_CHECKBOX, "currency", currency, currency.equals(cc.getCurrency()) ? "checked" : "unable", 32, currency));
					currencySet.add(currency);
					
					if (Config.DONATION_BINANCE_PAY_CURRENCY[0].isEmpty() && "BINANCE".equals(cc.getGateway()) && cc.getCustomCryptos().size() == currencySet.size())
					{
						// Opção para pesquisar por moedas
						sb.append(HTML_SEARCH_CRYPTO);
					}
				}
			}
			
			if (currencySet.isEmpty())
			{
				sb.append("<td width=80 height=20 align=center>").append(dt(player, "Indisponível", "Unavailable")).append("</td>");
			}
			
			sb.append("</tr>");
			bannerMsg = dt(player, "Escolha uma moeda de pagamento", "Choose a payment currency");
		}
		else if (showGatewaySelector || !showCurrencySelector && (cc.getGateway() == null || cc.getCurrency() == null))
		{
			sb.append("<tr>");
			
			// Exibir somente gateways compatíveis com a moeda selecionada
			for (PaymentMethod pm : PaymentMethod.values())
			{
				if (!pm.isEnabled())
					continue;
				
				if (cc.getCurrency() != null && !pm.getAllCurrencies().contains(cc.getCurrency()))
					continue;
				
				sb.append(String.format(HTML_CHOICE_CHECKBOX, "gateway", pm.name(), pm.name().equals(cc.getGateway()) ? "checked" : "unable", pm.getHtmlColumnWidth(), pm.getDisplayName()));
			}
			
			sb.append("</tr>");
			bannerMsg = dt(player, "Escolha um método de pagamento", "Choose a payment method");
		}
		else
		{
			bannerMsg = dt(player, "Escolha quanto deseja comprar", "Choose how much to buy");
			appendLocaleCheckoutMarkers(sb, player, cc);
		}
		
		String price = "";
		String quantity = "";
		
		// Já temos as informações necessárias, podemos formatar os valores
		if (cc.getGateway() != null && cc.getCurrency() != null)
		{
			final PaymentMethod pm = PaymentMethod.valueOf(cc.getGateway());
			
			// Sem checkboxes duplicados — Pagamento BRL / International ja indicam a escolha.
			if (pm == PaymentMethod.BINANCE)
			{
				if (Config.DONATION_DROPDOWN)
				{
					final StringBuilder sb2 = new StringBuilder();
					for (int qnt : pm.getDropdown())
						sb2.append(String.format("%d (%s);", qnt, pm.getPrice(cc.getCurrency(), qnt).toString()));
						
					quantity = sb2.toString();
				}
				
				price = "- " + cc.getGatewayPrice() + dt(player, " (unidade)", " (each)");
			}
			else
			{
				// O símbolo do euro (€) não está disponível no cliente
				final NumberFormat nf = NumberFormat.getCurrencyInstance(isDonationEnglish(player) ? java.util.Locale.US : java.util.Locale.forLanguageTag("pt-BR"));
				nf.setCurrency(Currency.getInstance(cc.getCurrency()));
				
				if (Config.DONATION_DROPDOWN)
				{
					// Infelizmente não podemos exibir o símbolo da moeda no dropdown porque o cliente não o permite no bypass
					final StringBuilder sb2 = new StringBuilder();
					for (int qnt : pm.getDropdown())
						sb2.append(String.format("%d (%s);", qnt, pm.getPrice(cc.getCurrency(), qnt)));
					
					quantity = sb2.toString();
				}
				
				price = "- " + nf.format(cc.getGatewayPrice()) + dt(player, " (unidade)", " (each)");
			}
			
			html.replace("%gateway%", dt(player, "Pagamento", "Payment"));
			html.replace("%currency%", dt(player, "Moeda", "Currency"));
			final String mainCurrency = pm.getMainCurrency();
			html.replace("%refresh%", mainCurrency != null && cc.getCurrency() != null && !mainCurrency.equals(cc.getCurrency()) ? HTML_REFRESH_BUTTON : "");
		}
		else
		{
			html.replace("%gateway%", cc.getGateway() == null ? dt(player, "Pagamento", "Payment") : cc.getGatewayName());
			html.replace("%currency%", cc.getCurrency() == null ? dt(player, "Moeda", "Currency") : cc.getCurrency());
			html.replace("%refresh%", "");
		}
		
		if (Config.DONATION_DROPDOWN)
			quantity = String.format("<combobox var=Quantity list=\"%s\" width=105>", quantity);
		else
			quantity = HTML_INPUT_BOX;
		
		final var itemTemplate = ItemData.getInstance().getTemplate(Config.DONATION_PURCHASABLE_ITEM);
		html.replace("%icon%", itemTemplate != null ? itemTemplate.getIcon() : "icon.etc_coins_gold_i00");
		html.replace("%item_name%", itemTemplate != null ? itemTemplate.getName() : "Coin of Luck");
		html.replace("%price%", price != null ? price : "");
		html.replace("%list%", sb.toString());
		html.replace("%banner%", String.format(HTML_BANNER, bannerMsg != null ? bannerMsg : ""));
		html.replace("%gateway_selector%", String.valueOf(!showGatewaySelector));
		html.replace("%currency_selector%", String.valueOf(!showCurrencySelector));
		html.replace("%calculator%", Config.DONATION_CALCULATOR ? htmlCalculator(player) : "");
		html.replace("%quantity%", quantity.isEmpty() ? "<combobox var=Quantity list=\"\" width=90>" : quantity);
		html.replace("%clear_selectors%", "");
		player.sendPacket(html);
		player.sendPacket(ActionFailed.STATIC_PACKET);
	}

	public void deleteOrExpire(Purchase purchase)
	{
		if (Config.DONATION_DELETE_INACTIVE)
			DonationData.getInstance().delete(purchase, true, true);
		else
		{
			purchase.changeStatus(PurchaseStatus.EXPIRED);
			DonationData.getInstance().delete(purchase, false, true); // true porque não precisamos salvar, já pagamento não foi feito
		}
	}
	
	private static Purchase getPurchase(int playerId, int purchaseId)
	{
		return DonationData.getInstance().getPurchases(playerId).stream().filter(p -> p.getId() == purchaseId).findFirst().orElse(null);
	}
	
	public void showCustomWindow(Player player, String file, String replace)
	{
		if (player == null || !player.isOnline())
			return;

		final NpcHtmlMessage html = new NpcHtmlMessage(0);
		html.setFile(player.getLocale(), donationHtmlFile(player, file));
		html.setItemId(HTML_ID);
		html.replace("%replace%", replace != null ? replace : "");
		player.sendPacket(html);
		player.sendPacket(ActionFailed.STATIC_PACKET);
	}
	
	public void showCustomWindow(Player player, String file)
	{
		showCustomWindow(player, file, null);
	}

	public void showCustomWindow(int playerId, String file)
	{
		showCustomWindow(World.getInstance().getPlayer(playerId), file, null);
	}

	private static void showFloodWindow(Player player, int purchaseId)
	{
		final NpcHtmlMessage html = new NpcHtmlMessage(0);
		html.setFile(player.getLocale(), donationHtmlFile(player, "flood.htm"));
		html.setItemId(HTML_ID);
		html.replace("%id%", purchaseId);
		html.replace("%bypass%", "bypass donation " + (purchaseId != 0 ? "status " + purchaseId : "index"));
		player.sendPacket(html);
		player.sendPacket(ActionFailed.STATIC_PACKET);
	}

	private void showConfirmActionWindow(Player player, int purchaseId, String action)
	{
		if (!isEnabled())
		{
			showIndexWindow(player);
			return;
		}
		
		if (!action.equals("cancel") && !action.equals("hide"))
			return;
		
		final Purchase p = getPurchase(player.getObjectId(), purchaseId);
		if (p == null)
			return;
		
		final NpcHtmlMessage html = new NpcHtmlMessage(0);
		html.setFile(player.getLocale(), donationHtmlFile(player, "action.htm"));
		html.setItemId(HTML_ID);
		html.replace("%action%", action);
		html.replace("%purchase%", purchaseId);
		player.sendPacket(html);
		player.sendPacket(ActionFailed.STATIC_PACKET);
	}

	private static void showEmailWindow(Player player, String address)
	{
		final NpcHtmlMessage html = new NpcHtmlMessage(0);
		html.setFile(player.getLocale(), donationHtmlFile(player, "email.htm"));
		html.setItemId(HTML_ID);

		if (_waitingPurchases.containsKey(player.getObjectId()))
			html.replace("%address%", "<tr><td>" + dt(player, "Você será <font color=LEVEL>redirecionado ao pagamento</font> logo após concluir essa etapa.", "You will be <font color=LEVEL>redirected to payment</font> right after completing this step.") + "</td></tr>");
		else if (address == null)
			html.replace("%address%", "<tr><td align=center>" + dt(player, "Por favor, insira um endereço válido.", "Please enter a valid email address.") + "</td></tr>");
		else
			html.replace("%address%", "<tr><td align=center>" + dt(player, "Endereço atual:", "Current address:") + "</td></tr><tr><td align=center><font color=LEVEL>" + address + "</font></td></tr>");

		player.sendPacket(html);
		player.sendPacket(ActionFailed.STATIC_PACKET);
	}

	private void showPurchaseStatusWindow(Player player, int id)
	{
		final Purchase p = getPurchase(player.getObjectId(), id);
		if (p == null)
			return;

		showPurchaseStatusWindow(player, p);
	}

	public void showPurchaseStatusWindow(Player player, Purchase p)
	{
		if (player == null || !player.isOnline())
			return;
		
//		if (!isEnabled())
//		{
//			showIndexWindow(player);
//			return;
//		}

		final NpcHtmlMessage html = new NpcHtmlMessage(0);
		final long expiration = TimeUnit.MILLISECONDS.toMinutes(p.getExpiration() - System.currentTimeMillis());
		
		if (p.getStatus() == PurchaseStatus.WAITING || p.getStatus() == PurchaseStatus.CREATED || p.getStatus() == PurchaseStatus.PENDING)
		{
			html.setFile(player.getLocale(), donationHtmlFile(player, "status_waiting.htm"));
			if (p.getMessage() != null)
			{
				html.replace("%msg%", p.getMessage());
				p.setMessage(null);
			}
			else
				html.replace("%msg%", "");
			
			if (p.getPaymentMethod().sendMail())
				html.replace("%link%", HTML_LINK_BUTTON);
			else
				html.replace("%link%", "");

			if (p.getStatus() == PurchaseStatus.WAITING)
				html.replace("%check%", htmlCheckButton(player));
			else
				html.replace("%check%", "");

			html.replace("%qrcode%", HTML_QRCODE_BUTTON);
		}
		else
		{
			html.setFile(player.getLocale(), donationHtmlFile(player, "status_others.htm"));
			html.replace("%hide%", Config.DONATION_HIDE_ENDED ? "<td width=52><a action=\"bypass donation confirm %id% hide\">" + dt(player, "Excluir", "Delete") + "</a></td>"  : "");
		}
		
		if (Config.DONATION_REQUIRE_TERMS)
		{
			// essa compra foi feita quando essa config estava desativada
			if (!p.agreedTerms() && p.getStatus() != PurchaseStatus.PENDING)
				html.replace("%terms%", "");
			else
			{
				// Buscamos a tabela de um arquivo diferente
				html.replace("%terms%", HTMLData.getInstance().getHtm(player.getLocale(), donationHtmlFile(player, "table_terms.htm")));
				
				if (!p.agreedTerms())
				{
					html.replace("%bgcolor%", "bgcolor=ff0000");
					html.replace("%terms_cb%", "unable");
					html.replace("%bypass%", "action=\"bypass donation terms %id% checkbox\"");
				}
				else
				{
					html.replace("%terms_cb%", "checked");
					html.replace("%bgcolor%", "");
					html.replace("%bypass%", p.getStatus() == PurchaseStatus.PENDING ? "action=\"bypass donation terms %id% checkbox\"" : "");
				}
			}
		}
		else
			html.replace("%terms%", "");

		html.setItemId(HTML_ID);
		html.replace("%id%", p.getId());
		html.replace("%id_externo%", p.getPaymentId() == null ? "0" : p.getPaymentId());
		html.replace("%payment%", p.getPaymentMethod().getName());
		html.replace("%payment_type%", p.getPaymentMethod().getTypeName());
		html.replace("%currency%", p.getPaymentMethod() == PaymentMethod.MP_PIX ? "" : String.format("(%s)", p.getCurrency()));
		html.replace("%email%", p.getPlayerEmail());
		html.replace("%status%", purchaseStatusLabel(player, p.getStatus()));
		html.replace("%date%", new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(p.getDate()));
		html.replace("%expiration%", expiration > 1 ? expiration + dt(player, " minutos", " minutes") : dt(player, " menos de 1 minuto", " less than 1 minute"));
		html.replace("%player%", player.getName());
		html.replace("%resume%", p.resume());
		player.sendPacket(html);
		player.sendPacket(ActionFailed.STATIC_PACKET);
	}

	private static void showPurchaseHistoryWindow(Player player, int page)
	{
//		if (!isEnabled())
//		{
//			showIndexWindow(player);
//			return;
//		}
		
		final NpcHtmlMessage html = new NpcHtmlMessage(0);
		html.setFile(player.getLocale(), donationHtmlFile(player, "history.htm"));
		html.setItemId(HTML_ID);

		final Pagination<Purchase> pagination = new Pagination<>(DonationData.getInstance().getPurchases(player.getObjectId()).stream(), page, 9, p -> p.getStatus() != PurchaseStatus.HIDDEN, Comparator.comparing(Purchase::getDate).reversed());
		for (Purchase p : pagination)
		{
			final String price = p.getFormatedPrice();
			pagination.append("<table><tr><td></td></tr><tr><td width=70>");
			pagination.append(new SimpleDateFormat("dd-MM-yyyy").format(p.getDate()));
			pagination.append("</td><td width=90>");
			pagination.append(StringUtil.trimAndDress(p.getProductName(), 12));
			pagination.append("</td><td width=75>");
			pagination.append(price.length() > 10 ? "..." : price);
			pagination.append("</td><td width=75>");
			pagination.append(String.format("<a action=\"bypass donation status %d %d\">", p.getId(), page), purchaseStatusShort(player, p.getStatus()), "<a>");
			pagination.append("</td></tr><tr><td></td></tr></table>");
			pagination.append(HTML_LINE);
		}

		if (pagination.isEmpty())
			pagination.append(HTML_EMPTY_TABLE);
		else if (pagination.totalEntries() > 9)
			pagination.generatePages("bypass donation history %page%");

		html.replace("%table%", pagination.getContent());
		player.sendPacket(html);
		player.sendPacket(ActionFailed.STATIC_PACKET);
	}

	public void showCheckoutWindow(Purchase purchase)
	{
		showCheckoutWindow(World.getInstance().getPlayer(purchase.getPlayerId()), purchase);
	}
	
	public void showCheckoutWindow(Player player, Purchase purchase)
	{
		if (player == null || !player.isOnline())
			return;
		
		if (!isEnabled())
		{
			showIndexWindow(player);
			return;
		}
		
		String msg = null;
		final boolean en = isDonationEnglish(player);
		switch (purchase.getPaymentMethod())
		{
			case BINANCE:
				msg = en
					? "Use the Binance app to scan the code.<br1>\nYou can also request an email with a link to the payment page."
					: "Use o aplicativo da Binance para escanear o código.<br1>\nVocê também pode solicitar um e-mail contendo um link para à página de pagamento.";
				break;
			case MP_LINK:
			case PAYPAL:
				msg = en
					? "Use your phone camera to scan the code and pay in the app or browser.<br1>You can also request an email with a link to the payment page."
					: "Use a câmera do seu celular para escanear o código e fazer o pagamento através do seu celular (no aplicativo ou navegador)<br1>Você também pode solicitar um e-mail contendo um link para à página de pagamento.";
				break;
			case MP_PIX:
				msg = en
					? "Use your bank app to scan the PIX code.<br1>Mercado Pago will also email you a copy-paste code."
					: "Use o aplicativo do seu banco para escanear o código do PIX.<br1>O MercadoPago irá lhe enviar um e-mail com o código \"cópia e cola\", você pode utilizá-lo também.";
				break;
		}

		final NpcHtmlMessage html = new NpcHtmlMessage(0);
		html.setFile(player.getLocale(), donationHtmlFile(player, purchase.wantQrCode() ? "checkout_qrcode.htm" : "checkout_link.htm"));
		html.setItemId(HTML_ID);
		html.replace("%id%", purchase.getId());
		html.replace("%resume%", purchase.resume());
		html.replace("%msg%", msg);
		html.replace("%payment%", purchase.getPaymentMethod().getName());
		player.sendPacket(html);
		player.sendPacket(ActionFailed.STATIC_PACKET);
	}

	private void showQrCodeWindow(Player player, int purchaseId)
	{
		final Purchase p = getPurchase(player.getObjectId(), purchaseId);
		if (p == null)
			return;

		showQrCodeWindow(player, p);
	}

	public void showQrCodeWindow(Player player, Purchase p)
	{
		if (player == null || !player.isOnline())
			return;
		
		if (!isEnabled())
		{
			showIndexWindow(player);
			return;
		}
		
		if (!p.agreedTerms() || p.getStatus() != PurchaseStatus.WAITING && p.getStatus() != PurchaseStatus.CREATED && p.getStatus() != PurchaseStatus.PENDING)
		{
			showPurchaseStatusWindow(player, p);
			return;
		}

		if (p.getStatus() == PurchaseStatus.CREATED || p.getStatus() == PurchaseStatus.PENDING)
		{
			if (!isThreadSafe(player.getObjectId()))
				return;
			
			// Pediu o QRCODE, vamos dar prioridade a isso
			p.setWantQrCode(true);
			
			p.getPaymentHandler().sendPurchase(p);
			showCustomWindow(player, "requesting.htm");
			return;
		}
		
		if (p.getQrCode() == null)
			return;

		try
		{
			final byte[] qrCode = DDSConverter.createQRCode(p.getQrCode());
			final NpcHtmlMessage html = new NpcHtmlMessage(0);
			html.setFile(player.getLocale(), donationHtmlFile(player, "qrcode.htm"));
			
			if (p.getPaymentMethod() == PaymentMethod.MP_PIX)
			{
				final StringBuilder sb = new StringBuilder();
				if (!Config.DONATION_MP_PIX_ACCOUNT_OWNER.isEmpty())
					sb.append("<tr><td align=center>").append(dt(player, "TITULAR: ", "HOLDER: ")).append(Config.DONATION_MP_PIX_ACCOUNT_OWNER.toUpperCase()).append("</td></tr>");
				
				if (!Config.DONATION_MP_PIX_ACCOUNT_CPF.isEmpty())
					sb.append("<tr><td align=center>").append(dt(player, "CPF: ", "TAX ID: ")).append(Config.DONATION_MP_PIX_ACCOUNT_CPF).append("</td></tr>");
				
				if (!Config.DONATION_MP_PIX_ACCOUNT_BANK.isEmpty())
					sb.append("<tr><td align=center>").append(dt(player, "BANCO: ", "BANK: ")).append(Config.DONATION_MP_PIX_ACCOUNT_BANK.toUpperCase()).append("</td></tr>");
				
				html.replace("%info%", sb.length() == 0 ? "" : "<br><br><table width=280 cellpadding=4>" + sb.toString() + "</table>");
			}
			else
				html.replace("%info%", "");
			
			html.replace("%purchase%", String.valueOf(p.getId()));
			html.replace("%serverId%", String.valueOf(Config.SERVER_ID));
			html.setItemId(HTML_ID);
			player.sendPacket(new PledgeCrest(p.getId(), qrCode));
			player.sendPacket(html);
			player.sendPacket(ActionFailed.STATIC_PACKET);
		}
		catch (WriterException e)
		{
		}
	}

	private void showLinkWindow(Player player, int purchaseId, boolean sendMail)
	{
		final Purchase p = getPurchase(player.getObjectId(), purchaseId);
		if (p == null)
			return;
		
		if (!isEnabled())
		{
			showIndexWindow(player);
			return;
		}
		
		if (!isThreadSafe(player.getObjectId()))
			return;

		if (!p.agreedTerms() || p.getStatus() != PurchaseStatus.WAITING && p.getStatus() != PurchaseStatus.CREATED && p.getStatus() != PurchaseStatus.PENDING)
		{
			showPurchaseStatusWindow(player, p);
			return;
		}

		if (p.getStatus() == PurchaseStatus.CREATED || p.getStatus() == PurchaseStatus.PENDING)
		{
			// Pediu o LINK, então vamos dar prioridade a isso
			if (p.getPaymentMethod().sendMail())
				p.setWantQrCode(false);
			
			showCustomWindow(player, "requesting.htm");
			p.getPaymentHandler().sendPurchase(p);
			return;
		}

		final NpcHtmlMessage html = new NpcHtmlMessage(0);
		html.setFile(player.getLocale(), donationHtmlFile(player, "link.htm"));
		html.setItemId(HTML_ID);
		html.replace("%id%", p.getId());
		html.replace("%resend%", String.format("<td width=64><a action=\"bypass -h donation link %d true\">%s</a></td>", p.getId(), p.getEmailCoint() == 0 ? dt(player, "Enviar", "Send") : dt(player, "Reenviar", "Resend")));

		if (sendMail)
		{
			final int maxEmails = p.getPaymentMethod() == PaymentMethod.PAYPAL ? 2 : Config.DONATION_MAXIMUM_NUMBER_EMAILS;
			
			if (p.getEmailCoint() >= maxEmails || maxEmails == 0)
				html.replace("%msg%", dt(player, "Não é possível enviar um novo e-mail.", "Cannot send another email."));
			else
			{
				if (p.getExpiration() - System.currentTimeMillis() < TimeUnit.MINUTES.toMillis(1))
					html.replace("%msg%", dt(player, "Não foi possível enviar um novo e-mail.", "Could not send a new email."));
				else if (p.getLastEmailTime() != 0 && p.getLastEmailTime() + TimeUnit.MINUTES.toMillis(2) > System.currentTimeMillis())
					html.replace("%msg%", dt(player, "Aguarde antes de enviar um novo e-mail.", "Please wait before sending another email."));
				else
				{
					html.replace("%msg%", dt(player, "E-mail reenviado!", "Email resent!"));
					p.getPaymentHandler().resendEmail(p);
				}
			}
			
			html.replace("%font%", "FF0000");
		}
		else
		{
			html.replace("%font%", "LEVEL");
			html.replace("%msg%", p.getEmailCoint() == 0 ? dt(player, "Solicitar e-mail para pagamento", "Request payment email") : dt(player, "Já enviamos seu e-mail.", "We already sent your email."));
		}

		player.sendPacket(html);
		player.sendPacket(ActionFailed.STATIC_PACKET);
	}
	
	public void showSearchWindow(Player player, String msg, String search)
	{
//		if (!isEnabled())
//		{
//			showIndexWindow(player);
//			return;
//		}
		
		final PaymentMethod pm = PaymentMethod.valueOf("BINANCE");
		if (!Config.DONATION_BINANCE_PAY && pm.getAltCurrencies() != null)
			return;
		
		final List<String> customs = getChoice(player.getObjectId()).getCustomCryptos();
		final StringBuilder sb1 = new StringBuilder();
		int count1 = 0;

		// Moedas em comum para todos
		for (String currency : CurrencyManager.DEFAULT_CRYPTO_CURRENCIES)
		{
			final String column = String.format(HTML_CHOICE_CHECKBOX, "custom", currency, customs.contains(currency) ? "checked" : "unable", 115, String.format("%s (%s)", currency, CurrencyManager.getInstance().convert(pm, currency, 1)));
			sb1.append(count1 % 2 == 0 ? "<tr>" + column : column + "</tr>");
			count1++;
		}
		
		// Moedas customs de todos os usuários
		final StringBuilder sb2 = new StringBuilder();
		int count2 = 0;
		
		for (Entry<String, BigDecimal> entry : CurrencyManager.getInstance().getCryptoExchangeRates().entrySet())
		{
			if (CurrencyManager.DEFAULT_CRYPTO_CURRENCIES.contains(entry.getKey()))
				continue;
			
			final String column = String.format(HTML_CHOICE_CHECKBOX, "custom", entry.getKey(), customs.contains(entry.getKey()) ? "checked" : "unable", 125, String.format("<font color=%s> %s (%s)</font>", entry.getKey().equals(search) ? "ff0000" : "ffffff", entry.getKey(), entry.getValue().toString()));
			sb2.append(count2 % 2 == 0 ? "<tr>" + column : column + "</tr>");
			count2++;
		}
		
		final NpcHtmlMessage html = new NpcHtmlMessage(0);
		html.setFile(player.getLocale(), donationHtmlFile(player, "search.htm"));
		html.setItemId(HTML_ID);
		html.replace("%list%", sb1.toString());
		
		// Paginação para moedas customizadas
		final Pagination<Entry<String, BigDecimal>> pagination = new Pagination<>(CurrencyManager.getInstance().getCryptoExchangeRates().entrySet().stream(), 1, 8, entry -> !CurrencyManager.DEFAULT_CRYPTO_CURRENCIES.contains(entry.getKey()));
		final StringBuilder sb3 = new StringBuilder();
		for (Entry<String, BigDecimal> entry : pagination)
		{
			final String column = String.format(HTML_CHOICE_CHECKBOX, "custom", entry.getKey(), customs.contains(entry.getKey()) ? "checked" : "unable", 125, String.format("<font color=%s> %s (%s)</font>", entry.getKey().equals(search) ? "ff0000" : "ffffff", entry.getKey(), entry.getValue().toString()));
			sb3.append(sb3.length() % 2 == 0 ? "<tr>" + column : column + "</tr>");
		}
		
		if (!pagination.isEmpty() && pagination.totalEntries() > 8)
			pagination.generatePages("bypass donation search %page%");
		
		html.replace("%result%", sb3.toString().isEmpty() ? sb2.toString() : sb3.toString());
		html.replace("%msg%", msg != null ? msg + "<br>" : "");
		html.replace("%clean%", customs.isEmpty() ? "" : "<td width=35><a action=\"bypass donation clear_cryptos\">" + dt(player, "Limpar", "Clear") + "</a></td>");
		player.sendPacket(html);
	}

	private void setPlayerEmail(Player player, String email)
	{
		if (email == null || email.equals("0") || email.length() > 44 || email.length() < 6)
		{
			showEmailWindow(player, null);
			return;
		}

		if (!email.matches(EMAIL_PATTERN))
		{
			showEmailWindow(player, null);
			return;
		}

		final String domain = email.substring(email.indexOf("@") + 1);
		if (!ArraysUtil.contains(Config.DONATION_ALLOWED_EMAILS, domain))
		{
			showEmailWindow(player, null);
			return;
		}

		final Purchase p = _waitingPurchases.get(player.getObjectId());
		if (p != null)
		{
			p.setPlayerEmail(email);
			DonationData.getInstance().store(p);
			showPurchaseStatusWindow(player, p);
		}
		else
			showEmailWindow(player, email);

		player.getMemos().set("donation_email", email);
	}

	private void hidePurchase(Player player, int purchaseId)
	{
		if (!isEnabled())
		{
			showIndexWindow(player);
			return;
		}
		
		if (!Config.DONATION_HIDE_ENDED)
			return;
		
		final Purchase p = getPurchase(player.getObjectId(), purchaseId);
		if (p == null)
			return;

		if (p.getStatus() != PurchaseStatus.COMPLETED && Config.DONATION_DELETE_INACTIVE)
			DonationData.getInstance().delete(p, true, true);
		else
			p.changeStatus(PurchaseStatus.HIDDEN);
		
		showPurchaseHistoryWindow(player, 1);
	}

	private void cancelPurchase(Player player, int id)
	{
		if (!isEnabled())
		{
			showIndexWindow(player);
			return;
		}
		
		final Purchase p = getPurchase(player.getObjectId(), id);
		if (p == null)
			return;
		
		if (p.getStatus() == PurchaseStatus.HIDDEN)
		{
			showPurchaseHistoryWindow(player, 1);
			return;
		}
		
		if (p.isBusy())
		{
			showCustomWindow(player, "busy.htm");
			return;
		}

		if (p.getStatus() != PurchaseStatus.PENDING && p.getStatus() != PurchaseStatus.CREATED && p.getStatus() != PurchaseStatus.WAITING)
		{
			showPurchaseStatusWindow(player, p);
			return;
		}
		
		if (!isThreadSafe(player.getObjectId()))
			return;
		
		if (p.getQrCode() != null)
			player.sendPacket(TutorialCloseHtml.STATIC_PACKET);
			
		if (Config.DONATION_DELETE_INACTIVE)
		{
			DonationData.getInstance().delete(p, true, true);
			showIndexWindow(player);
		}
		else
		{
			p.changeStatus(PurchaseStatus.CANCELED);
			DonationData.getInstance().delete(p, false, true);
			showPurchaseStatusWindow(player, p);
		}
		
		// é importante que o ID do pagamento esteja disponível no closePurchase()
		DonationTaskManager.getInstance().remove(p);
		p.getPaymentHandler().closePurchase(p);
	}
	
	private void searchCriptoCurrency(Player player, String search)
	{
//		if (!isEnabled())
//		{
//			showIndexWindow(player);
//			return;
//		}
		
		if (!Config.DONATION_BINANCE_PAY)
			return;
		
		if (!search.matches(CURRENCY_CODE_PATERN))
		{
			showSearchWindow(player, dt(player, "inválido", "invalid"), null);
			return;
		}
		
		if (CurrencyManager.getInstance().isCryptoAvailable(search))
		{
			showSearchWindow(player, null, search);
			return;
		}
		
		showCustomWindow(player, "requesting.htm");
		ThreadPool.execute(() -> CryptoCurrencyTask.getInstance().search(player.getObjectId(), search));
	}
	
	private void handleTermsActions(Player player, int id, String target)
	{
		if (!isEnabled())
		{
			showIndexWindow(player);
			return;
		}
		
		final Purchase p = getPurchase(player.getObjectId(), id);
		if (p == null)
			return;
		
		if (target.equals("htm"))
		{
			showCustomWindow(player, "terms.htm", String.valueOf(id));
			return;
		}
		
		if (target.equals("checkbox"))
		{
			p.setTermsStatus(!p.agreedTerms());
			showPurchaseStatusWindow(player, p);
		}
	}

	private void newPurchase(Player player, int quantity)
	{
		if (!isEnabled())
		{
			showIndexWindow(player);
			return;
		}
		
		if (!isThreadSafe(player.getObjectId()))
			return;
		
		if (quantity == 0)
		{
			showIndexWindow(player);
			return;
		}
		
		final CheckoutChoice cc = getChoice(player.getObjectId());
		if (cc.getGateway() == null || cc.getCurrency() == null)
		{
			showIndexWindow(player);
			return;
		}
		
		final String email = (String) player.getMemos().get("donation_email");

		// Se ainda estamos definindo o e-mail, não consideramos flood
		if (email != null && (player.getClient() == null || !player.getClient().performAction(FloodProtector.DONATION_PAY)))
		{
			showFloodWindow(player, 0);
			return;
		}

		// A compra sempre é salva. Vamos utilizá-la para o bypass de continuar a compra caso o email não exista
		final Purchase purchase = new Purchase(player.getObjectId(), quantity, email, player.getClient().getConnection().getInetAddress().getHostAddress(), cc);
		if (email == null)
		{
			_waitingPurchases.put(player.getObjectId(), purchase);
			showEmailWindow(player, null);
		}
		else
		{
			DonationData.getInstance().store(purchase);
			showPurchaseStatusWindow(player, purchase);
		}
		
		player.sendPacket(TutorialCloseHtml.STATIC_PACKET);
	}
	
	/*
	 * Um player pesquisou por uma moeda na Binance, e a busca foi concluída, vamos exibir o resultado
	 */
	public void onSearchCrypto(int playerId, String search)
	{
		final Player player = World.getInstance().getPlayer(playerId);
		if (player == null || !player.isOnline())
			return;
		
		if (!isEnabled())
		{
			showIndexWindow(player);
			return;
		}
		
		if (!CurrencyManager.getInstance().isCryptoAvailable(search))
		{
			showSearchWindow(player, dt(player, "Não foi possível encontrar a moeda " + search + ".", "Could not find currency " + search + "."), null);
			return;
		}
		
		showSearchWindow(player, null, search);
	}

	public void onCompletedPayment(Purchase p)
	{
		if (p.getPaymentId() == null)
			return;

		final Player player = World.getInstance().getPlayer(p.getPlayerId());
		if (player != null && player.isOnline())
		{
			player.sendPacket(TutorialCloseHtml.STATIC_PACKET);
			p.changeStatus(PurchaseStatus.COMPLETED);

			final NpcHtmlMessage html = new NpcHtmlMessage(0);
			html.setFile(player.getLocale(), donationHtmlFile(player, "thankyou.htm"));
			html.setItemId(HTML_ID);
			html.replace("%icon%", ItemData.getInstance().getTemplate(p.getProductId()).getIcon());
			html.replace("%resume%", p.resume());
			player.addItem(p.getProductId(), p.getQuantity(), true);
			if (Config.ANNOUNCE_DONATOR_ITEM_GLOBAL)
				DonationAnnounce.announceCompleted(player.getName());
			player.sendPacket(html);
		}
		else
		{
			// Vai receber no próximo login
			p.changeStatus(PurchaseStatus.OFFLINE);
		}
		
		if (Config.DONATION_DELETE_PAYMENT_DATA)
			DonationData.getInstance().delete(p, false, true);
	}

	private void checkPaymentStatus(Player player, int purchaseId)
	{
//		if (!isEnabled())
//		{
//			showIndexWindow(player);
//			return;
//		}
		
		final Purchase purchase = getPurchase(player.getObjectId(), purchaseId);
		if (purchase == null || purchase.getStatus() != PurchaseStatus.WAITING)
			return;
		
		if (!isThreadSafe(player.getObjectId()))
			return;
		
		if (purchase.getStatus() != PurchaseStatus.WAITING)
		{
			player.sendPacket(TutorialCloseHtml.STATIC_PACKET);
			showPurchaseStatusWindow(player, purchase);
			return;
		}

		if (player.getClient() == null || !player.getClient().performAction(FloodProtector.DONATION_CHECK))
		{
			showFloodWindow(player, purchaseId);
			return;
		}

		purchase.getPaymentHandler().checkPurchase(purchase);
		showCustomWindow(player, "requesting.htm");
	}

	/**
	 * @param p
	 * @param clear : Caso não seja possível criar a no serviço de pagamento, não salvamos ela
	 */
	public void handleException(Purchase p, boolean clear)
	{
		if (clear && Config.DONATION_DELETE_INACTIVE)
			DonationData.getInstance().delete(p, true, true);
		else
			p.changeStatus(PurchaseStatus.FAILED);

		showCustomWindow(p.getPlayerId(), "exception.htm");
	}
	
	/*
	 * Deleta ou expira uma purchase e a remove da task
	 */
	public void inactivePurchase(Purchase p)
	{
		DonationTaskManager.getInstance().remove(p);
		deleteOrExpire(p);
	}
	
	public void onPaymentNotFound(Purchase p)
	{
		final Player player = World.getInstance().getPlayer(p.getPlayerId());
		if (player == null || !player.isOnline())
			return;
			
		p.setMessagePaymentNotFound();
		DonationManager.getInstance().showPurchaseStatusWindow(player, p);
	}
	
	public void onPaymentFailed(Purchase p)
	{
		p.changeStatus(PurchaseStatus.FAILED);
		
		final Player player = World.getInstance().getPlayer(p.getPlayerId());
		if (player == null || !player.isOnline())
			return;
		
		player.sendPacket(TutorialCloseHtml.STATIC_PACKET);
		DonationManager.getInstance().showPurchaseStatusWindow(player, p);
	}
	
	/*
	 * Para evitar problemas de concorrência
	 * Seria melhor verificar apenas pela purchase atual ao invés de todas?
	 */
	public boolean isThreadSafe(int playerId)
	{
		if (DonationData.getInstance().getPurchases(playerId).stream().anyMatch(Purchase::isBusy))
		{
			showCustomWindow(playerId, "busy.htm");
			return false;
		}
		
		return true;
	}

	public static DonationManager getInstance()
	{
		return SingletonHolder.INSTANCE;
	}

	private static class SingletonHolder
	{
		protected static final DonationManager INSTANCE = new DonationManager();
	}
}
