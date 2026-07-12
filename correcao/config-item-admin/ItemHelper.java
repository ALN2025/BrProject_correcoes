package ext.mods.gameserver.helpers;

import ext.mods.Config;
import ext.mods.gameserver.model.actor.Player;
import ext.mods.gameserver.model.item.instance.ItemInstance;

/**
 * Helper para gerenciar exibição de itens
 * Dev ⩿ A.L.N/⪀ - Para mostrar ID do item apenas para admins
 */
public class ItemHelper {
    
    /**
     * Retorna o nome do item formatado conforme nível de acesso
     * Se for admin: "Nome do Item (ID: 1234)"
     * Se for jogador normal: "Nome do Item"
     */
    public static String getFormattedItemName(Player player, ItemInstance item) {
        if (item == null || player == null) {
            return "Item Desconhecido";
        }
        
        String itemName = item.getName();
        
        // Verifica se o jogador tem permissão para ver ID
        if (canSeeItemId(player)) {
            return itemName + " (ID: " + item.getItemId() + ")";
        }
        
        return itemName; // Apenas nome para jogadores normais
    }
    
    /**
     * Verifica se jogador pode ver ID do item
     * Baseado na configuração em players.properties
     */
    public static boolean canSeeItemId(Player player) {
        // Configuração do arquivo players.properties
        boolean adminOnly = Config.SHOW_ITEM_ID_FOR_ADMIN_ONLY;
        int minLevel = Config.MINIMUM_ACCESS_LEVEL_TO_SEE_ITEM_ID;
        
        if (!adminOnly) {
            return true; // Todos podem ver
        }
        
        // Apenas admins com nível suficiente podem ver
        return player.getAccessLevel() >= minLevel;
    }
    
    /**
     * Verifica se jogador é admin (nível de acesso >= 1)
     */
    public static boolean isAdmin(Player player) {
        return player != null && player.getAccessLevel() >= 1;
    }
}