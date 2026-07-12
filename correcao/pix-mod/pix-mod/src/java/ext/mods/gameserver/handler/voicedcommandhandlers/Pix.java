/*
 * Copyright (c) Dev A.L.N. Todos os direitos reservados.
 */
package ext.mods.gameserver.handler.voicedcommandhandlers;

import ext.mods.Config;
import ext.mods.gameserver.handler.IVoicedCommandHandler;
import ext.mods.gameserver.model.actor.Player;

import net.sf.donationmanager.DonationManager;

/**
 * Comandos <b>.pix</b> (PT) e <b>.pay</b> (EN) — abre o DonationManager in-game.
 */
public class Pix implements IVoicedCommandHandler
{
	private static final String[] VOICED_COMMANDS =
	{
		"pix",
		"pay"
	};
	
	@Override
	public boolean useVoicedCommand(String command, Player player, String target)
	{
		if (!Config.ENABLE_PIX_MOD || !Config.DONATION_ENABLED)
		{
			player.sendMessage("Sistema PIX desativado.");
			return false;
		}
		
		final String locale = "pay".equalsIgnoreCase(command) ? "en" : "pt";
		player.getMemos().set(DonationManager.MEMO_DONATION_HTML_LOCALE, locale);
		DonationManager.getInstance().showIndexWindow(player);
		return true;
	}
	
	@Override
	public String[] getVoicedCommandList()
	{
		return VOICED_COMMANDS;
	}
}
