package ext.mods.gameserver.managers;

import ext.mods.Config;
import ext.mods.gameserver.model.actor.Player;
import ext.mods.gameserver.model.item.instance.ItemInstance;
import ext.mods.commons.logging.CLogger;

/**
 * Manager para dar itens iniciais aos jogadores
 * Dev ⩿ A.L.N/⪀ - Para configurar itens que jogadores recebem ao nascer
 */
public class StartingItemsManager {
    
    private static final CLogger LOGGER = new CLogger(StartingItemsManager.class.getName());
    private static StartingItemsManager _instance;
    
    public static StartingItemsManager getInstance() {
        if (_instance == null) {
            _instance = new StartingItemsManager();
        }
        return _instance;
    }
    
    private StartingItemsManager() {}
    
    /**
     * Adiciona itens iniciais ao jogador quando nasce/cria personagem
     */
    public void giveStartingItems(Player player) {
        if (player == null) {
            return;
        }
        
        LOGGER.info("Dando itens iniciais para jogador: " + player.getName());
        
        try {
            // Itens para todos os personagens
            giveItemsFromConfig(player, "StartingItems_All");
            
            // Itens específicos por raça
            giveRaceSpecificItems(player);
            
            player.sendMessage("Você recebeu seus itens iniciais!");
            player.getInventory().updateWeight();
            
        } catch (Exception e) {
            LOGGER.error("Erro ao dar itens iniciais para " + player.getName() + ": " + e.getMessage(), e);
        }
    }
    
    /**
     * Dá itens específicos da raça/classe do jogador
     */
    private void giveRaceSpecificItems(Player player) {
        String raceName = player.getRace().name();
        String className = player.getClassId().name();
        
        // Tenta encontrar configuração específica: StartingItems_Race_Class
        String raceClassKey = "StartingItems_" + raceName + "_" + className;
        giveItemsFromConfig(player, raceClassKey);
        
        // Se não encontrou, tenta apenas por raça: StartingItems_Race
        String raceOnlyKey = "StartingItems_" + raceName;
        giveItemsFromConfig(player, raceOnlyKey);
    }
    
    /**
     * Processa itens de uma configuração específica
     */
    private void giveItemsFromConfig(Player player, String configKey) {
        String itemsConfig = Config.getProperty(configKey, "");
        
        if (itemsConfig == null || itemsConfig.trim().isEmpty()) {
            return; // Nenhum item configurado para esta chave
        }
        
        LOGGER.debug("Processando itens da configuração: " + configKey + " = " + itemsConfig);
        
        // Processa formato: itemId:quantidade,itemId:quantidade,...
        String[] items = itemsConfig.split(",");
        
        for (String itemData : items) {
            try {
                String[] parts = itemData.split(":");
                if (parts.length == 2) {
                    int itemId = Integer.parseInt(parts[0].trim());
                    int quantity = Integer.parseInt(parts[1].trim());
                    
                    if (itemId > 0 && quantity > 0) {
                        giveItemToPlayer(player, itemId, quantity);
                    }
                }
            } catch (NumberFormatException e) {
                LOGGER.warn("Formato inválido na configuração de itens: " + itemData + " (chave: " + configKey + ")");
            } catch (Exception e) {
                LOGGER.error("Erro ao processar item: " + itemData, e);
            }
        }
    }
    
    /**
     * Dá um item específico ao jogador
     */
    private void giveItemToPlayer(Player player, int itemId, int quantity) {
        try {
            ItemInstance item = player.getInventory().addItem("StartingItem", itemId, quantity, player, null);
            
            if (item != null) {
                LOGGER.debug("Item dado: " + item.getName() + " (ID: " + itemId + ") x" + quantity + " para " + player.getName());
                player.sendMessage("Recebido: " + item.getName() + " x" + quantity);
            } else {
                LOGGER.warn("Falha ao dar item ID " + itemId + " para " + player.getName());
            }
            
        } catch (Exception e) {
            LOGGER.error("Erro ao dar item " + itemId + " para " + player.getName() + ": " + e.getMessage(), e);
        }
    }
}