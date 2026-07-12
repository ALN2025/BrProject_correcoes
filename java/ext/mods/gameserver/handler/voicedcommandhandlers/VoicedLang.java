package ext.mods.gameserver.handler.voicedcommandhandlers;

import ext.mods.gameserver.model.actor.Player;
import ext.mods.gameserver.handler.IVoicedCommandHandler;
import java.util.Locale;

/**
 * Handler for voice language selection command.
 * Allows players to switch between Portuguese (pt-BR), English (en-US), and Russian (ru-RU).
 * Default language is Portuguese.
 */
public class VoicedLang implements IVoicedCommandHandler
{
	private static final String[] VOICED_COMMANDS = { "voiced_lang" };

	private static final String DEFAULT_LANG = "pt_BR";
	private static final String LANG_EN_US = "en_US";
	private static final String LANG_RU_RU = "ru_RU";
	
	@Override
	public boolean useVoicedCommand(String command, Player player, String args)
	{
		if (!command.equalsIgnoreCase("voiced_lang"))
		{
			return false;
		}
		
		if (args == null || args.isEmpty())
		{
			player.sendMessage("Usage: voiced_lang <language>");
			return false;
		}
		
		// allow optional second token 'open' to request the menu to reopen after change
		String[] parts = args.trim().split("\\s+", 2);
		String language = normalizeCode(parts[0]);
		boolean openMenu = parts.length > 1 && parts[1].toLowerCase().contains("open");

		// Validate language selection
		if (!isValidLanguage(language))
		{
			player.sendMessage("Invalid language. Available options: pt_BR, en_US, ru_RU");
			return false;
		}

		boolean persisted = false;
		Locale locale = toLocale(language);
		try
		{
			player.setLocale(locale);
			persisted = true;
		}
		catch (Throwable t)
		{
			// fallback if setLocale is unavailable
		}

		String langName = getLanguageName(language);
		player.sendMessage("Voice language changed to: " + langName + (persisted ? ". Reopen the menu to apply." : ". Reopen the menu or use //rr html to reload."));

		if (openMenu)
		{
			try
			{
				// Try to invoke Menu voiced handler to refresh menu for player
				ext.mods.gameserver.handler.voicedcommandhandlers.Menu menu = new ext.mods.gameserver.handler.voicedcommandhandlers.Menu();
				menu.useVoicedCommand("menu", player, null);
			}
			catch (Throwable t)
			{
				// ignore - best effort
			}
		}

		return true;
	}

	/**
	 * Normalize incoming codes to underscore format used in html locales (pt_BR, en_US, ru_RU)
	 */
	private String normalizeCode(String code)
	{
		if (code == null) return DEFAULT_LANG;
		String c = code.trim().replace('-', '_');
		c = c.replaceAll("\\s+", "");
		if (c.equalsIgnoreCase("pt") || c.equalsIgnoreCase("ptbr") || c.equalsIgnoreCase("pt_br") || c.equalsIgnoreCase("pt-br")) return DEFAULT_LANG;
		if (c.equalsIgnoreCase("en") || c.equalsIgnoreCase("en_us") || c.equalsIgnoreCase("en-us")) return LANG_EN_US;
		if (c.equalsIgnoreCase("ru") || c.equalsIgnoreCase("ru_ru") || c.equalsIgnoreCase("ru-ru")) return LANG_RU_RU;
		return c;
	}

	private Locale toLocale(String code)
	{
		if (code == null) return new Locale("pt", "BR");
		String normalized = code.trim().replace('-', '_').toLowerCase();
		switch (normalized)
		{
			case "pt_br":
				return new Locale("pt", "BR");
			case "en_us":
				return new Locale("en", "US");
			case "ru_ru":
				return new Locale("ru", "RU");
			default:
				return new Locale(normalized);
		}
	}
	
	@Override
	public String[] getVoicedCommandList()
	{
		return VOICED_COMMANDS;
	}
	
	/**
	 * Check if language code is valid
	 */
	private boolean isValidLanguage(String lang)
	{
		return lang.equals(DEFAULT_LANG) || lang.equals(LANG_EN_US) || lang.equals(LANG_RU_RU);
	}
	
	/**
	 * Get human-readable language name
	 */
	private String getLanguageName(String lang)
	{
		String l = lang.toLowerCase().replace('-', '_');
		if (l.equals(DEFAULT_LANG.toLowerCase())) return "Português";
		if (l.equals(LANG_EN_US.toLowerCase())) return "English";
		if (l.equals(LANG_RU_RU.toLowerCase())) return "Русский";
		return lang;
	}
}

