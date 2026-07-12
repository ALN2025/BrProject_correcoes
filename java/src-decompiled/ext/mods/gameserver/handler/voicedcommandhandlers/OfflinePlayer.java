// Bytecode for: ext.mods.gameserver.handler.voicedcommandhandlers.OfflinePlayer
// File: ext\mods\gameserver\handler\voicedcommandhandlers\OfflinePlayer.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/voicedcommandhandlers/OfflinePlayer.class
  Last modified 9 de jul de 2026; size 4130 bytes
  MD5 checksum 6b86cbfc4df0206c03ce9cdddc7ca96f
  Compiled from "OfflinePlayer.java"
public class ext.mods.gameserver.handler.voicedcommandhandlers.OfflinePlayer implements ext.mods.gameserver.handler.IVoicedCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #141                        // ext/mods/gameserver/handler/voicedcommandhandlers/OfflinePlayer
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 4, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/Config.OFFLINE_TRADE_ENABLE:Z
    #8 = Class              #10           // ext/mods/Config
    #9 = NameAndType        #11:#12       // OFFLINE_TRADE_ENABLE:Z
   #10 = Utf8               ext/mods/Config
   #11 = Utf8               OFFLINE_TRADE_ENABLE
   #12 = Utf8               Z
   #13 = Methodref          #14.#15       // ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
   #14 = Class              #16           // ext/mods/gameserver/model/actor/Player
   #15 = NameAndType        #17:#18       // getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
   #16 = Utf8               ext/mods/gameserver/model/actor/Player
   #17 = Utf8               getSysString
   #18 = Utf8               (I[Ljava/lang/Object;)Ljava/lang/String;
   #19 = Methodref          #14.#20       // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
   #20 = NameAndType        #21:#22       // sendMessage:(Ljava/lang/String;)V
   #21 = Utf8               sendMessage
   #22 = Utf8               (Ljava/lang/String;)V
   #23 = Methodref          #14.#24       // ext/mods/gameserver/model/actor/Player.isInStoreMode:()Z
   #24 = NameAndType        #25:#26       // isInStoreMode:()Z
   #25 = Utf8               isInStoreMode
   #26 = Utf8               ()Z
   #27 = Methodref          #14.#28       // ext/mods/gameserver/model/actor/Player.isCrafting:()Z
   #28 = NameAndType        #29:#26       // isCrafting:()Z
   #29 = Utf8               isCrafting
   #30 = Methodref          #14.#31       // ext/mods/gameserver/model/actor/Player.isSitting:()Z
   #31 = NameAndType        #32:#26       // isSitting:()Z
   #32 = Utf8               isSitting
   #33 = Fieldref           #34.#35       // ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #34 = Class              #36           // ext/mods/gameserver/network/serverpackets/ActionFailed
   #35 = NameAndType        #37:#38       // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #36 = Utf8               ext/mods/gameserver/network/serverpackets/ActionFailed
   #37 = Utf8               STATIC_PACKET
   #38 = Utf8               Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #39 = Methodref          #14.#40       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #40 = NameAndType        #41:#42       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #41 = Utf8               sendPacket
   #42 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #43 = Methodref          #14.#44       // ext/mods/gameserver/model/actor/Player.getBuyList:()Lext/mods/gameserver/model/trade/TradeList;
   #44 = NameAndType        #45:#46       // getBuyList:()Lext/mods/gameserver/model/trade/TradeList;
   #45 = Utf8               getBuyList
   #46 = Utf8               ()Lext/mods/gameserver/model/trade/TradeList;
   #47 = Methodref          #14.#48       // ext/mods/gameserver/model/actor/Player.getSellList:()Lext/mods/gameserver/model/trade/TradeList;
   #48 = NameAndType        #49:#46       // getSellList:()Lext/mods/gameserver/model/trade/TradeList;
   #49 = Utf8               getSellList
   #50 = Methodref          #51.#52       // ext/mods/gameserver/taskmanager/AttackStanceTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/AttackStanceTaskManager;
   #51 = Class              #53           // ext/mods/gameserver/taskmanager/AttackStanceTaskManager
   #52 = NameAndType        #54:#55       // getInstance:()Lext/mods/gameserver/taskmanager/AttackStanceTaskManager;
   #53 = Utf8               ext/mods/gameserver/taskmanager/AttackStanceTaskManager
   #54 = Utf8               getInstance
   #55 = Utf8               ()Lext/mods/gameserver/taskmanager/AttackStanceTaskManager;
   #56 = Methodref          #51.#57       // ext/mods/gameserver/taskmanager/AttackStanceTaskManager.isInAttackStance:(Lext/mods/gameserver/model/actor/Creature;)Z
   #57 = NameAndType        #58:#59       // isInAttackStance:(Lext/mods/gameserver/model/actor/Creature;)Z
   #58 = Utf8               isInAttackStance
   #59 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
   #60 = Fieldref           #61.#62       // ext/mods/gameserver/network/SystemMessageId.CANT_OPERATE_PRIVATE_STORE_DURING_COMBAT:Lext/mods/gameserver/network/SystemMessageId;
   #61 = Class              #63           // ext/mods/gameserver/network/SystemMessageId
   #62 = NameAndType        #64:#65       // CANT_OPERATE_PRIVATE_STORE_DURING_COMBAT:Lext/mods/gameserver/network/SystemMessageId;
   #63 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #64 = Utf8               CANT_OPERATE_PRIVATE_STORE_DURING_COMBAT
   #65 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #66 = Methodref          #14.#67       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #67 = NameAndType        #41:#68       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #68 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #69 = Methodref          #14.#70       // ext/mods/gameserver/model/actor/Player.isInCombat:()Z
   #70 = NameAndType        #71:#26       // isInCombat:()Z
   #71 = Utf8               isInCombat
   #72 = Methodref          #14.#73       // ext/mods/gameserver/model/actor/Player.isGM:()Z
   #73 = NameAndType        #74:#26       // isGM:()Z
   #74 = Utf8               isGM
   #75 = Methodref          #14.#76       // ext/mods/gameserver/model/actor/Player.isTeleporting:()Z
   #76 = NameAndType        #77:#26       // isTeleporting:()Z
   #77 = Utf8               isTeleporting
   #78 = Methodref          #14.#79       // ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
   #79 = NameAndType        #80:#26       // isInOlympiadMode:()Z
   #80 = Utf8               isInOlympiadMode
   #81 = Methodref          #82.#83       // ext/mods/gameserver/model/olympiad/OlympiadManager.getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadManager;
   #82 = Class              #84           // ext/mods/gameserver/model/olympiad/OlympiadManager
   #83 = NameAndType        #54:#85       // getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadManager;
   #84 = Utf8               ext/mods/gameserver/model/olympiad/OlympiadManager
   #85 = Utf8               ()Lext/mods/gameserver/model/olympiad/OlympiadManager;
   #86 = Methodref          #82.#87       // ext/mods/gameserver/model/olympiad/OlympiadManager.isRegistered:(Lext/mods/gameserver/model/actor/Player;)Z
   #87 = NameAndType        #88:#89       // isRegistered:(Lext/mods/gameserver/model/actor/Player;)Z
   #88 = Utf8               isRegistered
   #89 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
   #90 = Methodref          #14.#91       // ext/mods/gameserver/model/actor/Player.isFestivalParticipant:()Z
   #91 = NameAndType        #92:#26       // isFestivalParticipant:()Z
   #92 = Utf8               isFestivalParticipant
   #93 = Methodref          #94.#95       // ext/mods/gameserver/data/manager/FestivalOfDarknessManager.getInstance:()Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
   #94 = Class              #96           // ext/mods/gameserver/data/manager/FestivalOfDarknessManager
   #95 = NameAndType        #54:#97       // getInstance:()Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
   #96 = Utf8               ext/mods/gameserver/data/manager/FestivalOfDarknessManager
   #97 = Utf8               ()Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
   #98 = Methodref          #94.#99       // ext/mods/gameserver/data/manager/FestivalOfDarknessManager.isFestivalInitialized:()Z
   #99 = NameAndType        #100:#26      // isFestivalInitialized:()Z
  #100 = Utf8               isFestivalInitialized
  #101 = Methodref          #14.#102      // ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
  #102 = NameAndType        #103:#104     // getParty:()Lext/mods/gameserver/model/group/Party;
  #103 = Utf8               getParty
  #104 = Utf8               ()Lext/mods/gameserver/model/group/Party;
  #105 = Methodref          #14.#106      // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
  #106 = NameAndType        #107:#108     // getName:()Ljava/lang/String;
  #107 = Utf8               getName
  #108 = Utf8               ()Ljava/lang/String;
  #109 = Methodref          #110.#111     // ext/mods/gameserver/network/serverpackets/SystemMessage.sendString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #110 = Class              #112          // ext/mods/gameserver/network/serverpackets/SystemMessage
  #111 = NameAndType        #113:#114     // sendString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #112 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #113 = Utf8               sendString
  #114 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #115 = Methodref          #116.#117     // ext/mods/gameserver/model/group/Party.broadcastToPartyMembers:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #116 = Class              #118          // ext/mods/gameserver/model/group/Party
  #117 = NameAndType        #119:#120     // broadcastToPartyMembers:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #118 = Utf8               ext/mods/gameserver/model/group/Party
  #119 = Utf8               broadcastToPartyMembers
  #120 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #121 = Methodref          #122.#123     // ext/mods/gameserver/data/sql/OfflineTradersTable.offlineMode:(Lext/mods/gameserver/model/actor/Player;)Z
  #122 = Class              #124          // ext/mods/gameserver/data/sql/OfflineTradersTable
  #123 = NameAndType        #125:#89      // offlineMode:(Lext/mods/gameserver/model/actor/Player;)Z
  #124 = Utf8               ext/mods/gameserver/data/sql/OfflineTradersTable
  #125 = Utf8               offlineMode
  #126 = Fieldref           #8.#127       // ext/mods/Config.OFFLINE_CRAFT_ENABLE:Z
  #127 = NameAndType        #128:#12      // OFFLINE_CRAFT_ENABLE:Z
  #128 = Utf8               OFFLINE_CRAFT_ENABLE
  #129 = Methodref          #14.#130      // ext/mods/gameserver/model/actor/Player.logout:(Z)V
  #130 = NameAndType        #131:#132     // logout:(Z)V
  #131 = Utf8               logout
  #132 = Utf8               (Z)V
  #133 = Methodref          #122.#134     // ext/mods/gameserver/data/sql/OfflineTradersTable.getInstance:()Lext/mods/gameserver/data/sql/OfflineTradersTable;
  #134 = NameAndType        #54:#135      // getInstance:()Lext/mods/gameserver/data/sql/OfflineTradersTable;
  #135 = Utf8               ()Lext/mods/gameserver/data/sql/OfflineTradersTable;
  #136 = Methodref          #122.#137     // ext/mods/gameserver/data/sql/OfflineTradersTable.saveOfflineTraders:(Lext/mods/gameserver/model/actor/Player;)V
  #137 = NameAndType        #138:#139     // saveOfflineTraders:(Lext/mods/gameserver/model/actor/Player;)V
  #138 = Utf8               saveOfflineTraders
  #139 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #140 = Fieldref           #141.#142     // ext/mods/gameserver/handler/voicedcommandhandlers/OfflinePlayer.VOICED_COMMANDS:[Ljava/lang/String;
  #141 = Class              #143          // ext/mods/gameserver/handler/voicedcommandhandlers/OfflinePlayer
  #142 = NameAndType        #144:#145     // VOICED_COMMANDS:[Ljava/lang/String;
  #143 = Utf8               ext/mods/gameserver/handler/voicedcommandhandlers/OfflinePlayer
  #144 = Utf8               VOICED_COMMANDS
  #145 = Utf8               [Ljava/lang/String;
  #146 = Class              #147          // java/lang/String
  #147 = Utf8               java/lang/String
  #148 = String             #149          // offline
  #149 = Utf8               offline
  #150 = Class              #151          // ext/mods/gameserver/handler/IVoicedCommandHandler
  #151 = Utf8               ext/mods/gameserver/handler/IVoicedCommandHandler
  #152 = Utf8               Code
  #153 = Utf8               LineNumberTable
  #154 = Utf8               LocalVariableTable
  #155 = Utf8               this
  #156 = Utf8               Lext/mods/gameserver/handler/voicedcommandhandlers/OfflinePlayer;
  #157 = Utf8               useVoicedCommand
  #158 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
  #159 = Utf8               playerParty
  #160 = Utf8               Lext/mods/gameserver/model/group/Party;
  #161 = Utf8               command
  #162 = Utf8               Ljava/lang/String;
  #163 = Utf8               player
  #164 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #165 = Utf8               target
  #166 = Utf8               storeListBuy
  #167 = Utf8               Lext/mods/gameserver/model/trade/TradeList;
  #168 = Utf8               storeListSell
  #169 = Utf8               StackMapTable
  #170 = Class              #171          // ext/mods/gameserver/model/trade/TradeList
  #171 = Utf8               ext/mods/gameserver/model/trade/TradeList
  #172 = Utf8               getVoicedCommandList
  #173 = Utf8               ()[Ljava/lang/String;
  #174 = Utf8               <clinit>
  #175 = Utf8               SourceFile
  #176 = Utf8               OfflinePlayer.java
{
  public ext.mods.gameserver.handler.voicedcommandhandlers.OfflinePlayer();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 33: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/OfflinePlayer;

  public boolean useVoicedCommand(java.lang.String, ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=8, locals=7, args_size=4
         0: getstatic     #7                  // Field ext/mods/Config.OFFLINE_TRADE_ENABLE:Z
         3: ifne          23
         6: aload_2
         7: aload_2
         8: sipush        10200
        11: iconst_0
        12: anewarray     #2                  // class java/lang/Object
        15: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
        18: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        21: iconst_0
        22: ireturn
        23: aload_2
        24: ifnonnull     29
        27: iconst_0
        28: ireturn
        29: aload_2
        30: invokevirtual #23                 // Method ext/mods/gameserver/model/actor/Player.isInStoreMode:()Z
        33: ifne          43
        36: aload_2
        37: invokevirtual #27                 // Method ext/mods/gameserver/model/actor/Player.isCrafting:()Z
        40: ifeq          50
        43: aload_2
        44: invokevirtual #30                 // Method ext/mods/gameserver/model/actor/Player.isSitting:()Z
        47: ifne          74
        50: aload_2
        51: aload_2
        52: sipush        10080
        55: iconst_0
        56: anewarray     #2                  // class java/lang/Object
        59: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
        62: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        65: aload_2
        66: getstatic     #33                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
        69: invokevirtual #39                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        72: iconst_0
        73: ireturn
        74: aload_2
        75: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Player.getBuyList:()Lext/mods/gameserver/model/trade/TradeList;
        78: astore        4
        80: aload         4
        82: ifnonnull     109
        85: aload_2
        86: aload_2
        87: sipush        10081
        90: iconst_0
        91: anewarray     #2                  // class java/lang/Object
        94: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
        97: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       100: aload_2
       101: getstatic     #33                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       104: invokevirtual #39                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       107: iconst_0
       108: ireturn
       109: aload_2
       110: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/Player.getSellList:()Lext/mods/gameserver/model/trade/TradeList;
       113: astore        5
       115: aload         5
       117: ifnonnull     144
       120: aload_2
       121: aload_2
       122: sipush        10082
       125: iconst_0
       126: anewarray     #2                  // class java/lang/Object
       129: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       132: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       135: aload_2
       136: getstatic     #33                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       139: invokevirtual #39                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       142: iconst_0
       143: ireturn
       144: invokestatic  #50                 // Method ext/mods/gameserver/taskmanager/AttackStanceTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/AttackStanceTaskManager;
       147: aload_2
       148: invokevirtual #56                 // Method ext/mods/gameserver/taskmanager/AttackStanceTaskManager.isInAttackStance:(Lext/mods/gameserver/model/actor/Creature;)Z
       151: ifeq          170
       154: aload_2
       155: getstatic     #60                 // Field ext/mods/gameserver/network/SystemMessageId.CANT_OPERATE_PRIVATE_STORE_DURING_COMBAT:Lext/mods/gameserver/network/SystemMessageId;
       158: invokevirtual #66                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       161: aload_2
       162: getstatic     #33                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       165: invokevirtual #39                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       168: iconst_0
       169: ireturn
       170: aload_2
       171: invokevirtual #69                 // Method ext/mods/gameserver/model/actor/Player.isInCombat:()Z
       174: ifeq          208
       177: aload_2
       178: invokevirtual #72                 // Method ext/mods/gameserver/model/actor/Player.isGM:()Z
       181: ifne          208
       184: aload_2
       185: aload_2
       186: sipush        10083
       189: iconst_0
       190: anewarray     #2                  // class java/lang/Object
       193: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       196: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       199: aload_2
       200: getstatic     #33                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       203: invokevirtual #39                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       206: iconst_0
       207: ireturn
       208: aload_2
       209: invokevirtual #75                 // Method ext/mods/gameserver/model/actor/Player.isTeleporting:()Z
       212: ifeq          246
       215: aload_2
       216: invokevirtual #72                 // Method ext/mods/gameserver/model/actor/Player.isGM:()Z
       219: ifne          246
       222: aload_2
       223: aload_2
       224: sipush        10084
       227: iconst_0
       228: anewarray     #2                  // class java/lang/Object
       231: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       234: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       237: aload_2
       238: getstatic     #33                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       241: invokevirtual #39                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       244: iconst_0
       245: ireturn
       246: aload_2
       247: invokevirtual #78                 // Method ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
       250: ifne          263
       253: invokestatic  #81                 // Method ext/mods/gameserver/model/olympiad/OlympiadManager.getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadManager;
       256: aload_2
       257: invokevirtual #86                 // Method ext/mods/gameserver/model/olympiad/OlympiadManager.isRegistered:(Lext/mods/gameserver/model/actor/Player;)Z
       260: ifeq          280
       263: aload_2
       264: aload_2
       265: sipush        10085
       268: iconst_0
       269: anewarray     #2                  // class java/lang/Object
       272: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       275: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       278: iconst_0
       279: ireturn
       280: aload_2
       281: invokevirtual #90                 // Method ext/mods/gameserver/model/actor/Player.isFestivalParticipant:()Z
       284: ifeq          353
       287: invokestatic  #93                 // Method ext/mods/gameserver/data/manager/FestivalOfDarknessManager.getInstance:()Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
       290: invokevirtual #98                 // Method ext/mods/gameserver/data/manager/FestivalOfDarknessManager.isFestivalInitialized:()Z
       293: ifeq          313
       296: aload_2
       297: aload_2
       298: sipush        10086
       301: iconst_0
       302: anewarray     #2                  // class java/lang/Object
       305: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       308: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       311: iconst_0
       312: ireturn
       313: aload_2
       314: invokevirtual #101                // Method ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
       317: astore        6
       319: aload         6
       321: ifnull        353
       324: aload_2
       325: invokevirtual #101                // Method ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
       328: aload_2
       329: aload_2
       330: sipush        10173
       333: iconst_1
       334: anewarray     #2                  // class java/lang/Object
       337: dup
       338: iconst_0
       339: aload_2
       340: invokevirtual #105                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       343: aastore
       344: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       347: invokestatic  #109                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.sendString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       350: invokevirtual #115                // Method ext/mods/gameserver/model/group/Party.broadcastToPartyMembers:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       353: aload_2
       354: invokestatic  #121                // Method ext/mods/gameserver/data/sql/OfflineTradersTable.offlineMode:(Lext/mods/gameserver/model/actor/Player;)Z
       357: ifne          377
       360: aload_2
       361: aload_2
       362: sipush        10087
       365: iconst_0
       366: anewarray     #2                  // class java/lang/Object
       369: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       372: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       375: iconst_0
       376: ireturn
       377: aload_2
       378: invokevirtual #23                 // Method ext/mods/gameserver/model/actor/Player.isInStoreMode:()Z
       381: ifeq          390
       384: getstatic     #7                  // Field ext/mods/Config.OFFLINE_TRADE_ENABLE:Z
       387: ifne          403
       390: aload_2
       391: invokevirtual #27                 // Method ext/mods/gameserver/model/actor/Player.isCrafting:()Z
       394: ifeq          410
       397: getstatic     #126                // Field ext/mods/Config.OFFLINE_CRAFT_ENABLE:Z
       400: ifeq          410
       403: aload_2
       404: iconst_0
       405: invokevirtual #129                // Method ext/mods/gameserver/model/actor/Player.logout:(Z)V
       408: iconst_1
       409: ireturn
       410: invokestatic  #133                // Method ext/mods/gameserver/data/sql/OfflineTradersTable.getInstance:()Lext/mods/gameserver/data/sql/OfflineTradersTable;
       413: aload_2
       414: invokevirtual #136                // Method ext/mods/gameserver/data/sql/OfflineTradersTable.saveOfflineTraders:(Lext/mods/gameserver/model/actor/Player;)V
       417: iconst_0
       418: ireturn
      LineNumberTable:
        line 43: 0
        line 45: 6
        line 46: 21
        line 49: 23
        line 50: 27
        line 52: 29
        line 54: 50
        line 55: 65
        line 56: 72
        line 59: 74
        line 60: 80
        line 62: 85
        line 63: 100
        line 64: 107
        line 67: 109
        line 68: 115
        line 70: 120
        line 71: 135
        line 72: 142
        line 75: 144
        line 77: 154
        line 78: 161
        line 79: 168
        line 82: 170
        line 84: 184
        line 85: 199
        line 86: 206
        line 89: 208
        line 91: 222
        line 92: 237
        line 93: 244
        line 96: 246
        line 98: 263
        line 99: 278
        line 102: 280
        line 104: 287
        line 106: 296
        line 107: 311
        line 110: 313
        line 111: 319
        line 112: 324
        line 115: 353
        line 117: 360
        line 118: 375
        line 121: 377
        line 123: 403
        line 124: 408
        line 127: 410
        line 128: 417
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          319      34     6 playerParty   Lext/mods/gameserver/model/group/Party;
            0     419     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/OfflinePlayer;
            0     419     1 command   Ljava/lang/String;
            0     419     2 player   Lext/mods/gameserver/model/actor/Player;
            0     419     3 target   Ljava/lang/String;
           80     339     4 storeListBuy   Lext/mods/gameserver/model/trade/TradeList;
          115     304     5 storeListSell   Lext/mods/gameserver/model/trade/TradeList;
      StackMapTable: number_of_entries = 18
        frame_type = 23 /* same */
        frame_type = 5 /* same */
        frame_type = 13 /* same */
        frame_type = 6 /* same */
        frame_type = 23 /* same */
        frame_type = 252 /* append */
          offset_delta = 34
          locals = [ class ext/mods/gameserver/model/trade/TradeList ]
        frame_type = 252 /* append */
          offset_delta = 34
          locals = [ class ext/mods/gameserver/model/trade/TradeList ]
        frame_type = 25 /* same */
        frame_type = 37 /* same */
        frame_type = 37 /* same */
        frame_type = 16 /* same */
        frame_type = 16 /* same */
        frame_type = 32 /* same */
        frame_type = 39 /* same */
        frame_type = 23 /* same */
        frame_type = 12 /* same */
        frame_type = 12 /* same */
        frame_type = 6 /* same */

  public java.lang.String[] getVoicedCommandList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #140                // Field VOICED_COMMANDS:[Ljava/lang/String;
         3: areturn
      LineNumberTable:
        line 134: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/voicedcommandhandlers/OfflinePlayer;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: anewarray     #146                // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc           #148                // String offline
         8: aastore
         9: putstatic     #140                // Field VOICED_COMMANDS:[Ljava/lang/String;
        12: return
      LineNumberTable:
        line 35: 0
}
SourceFile: "OfflinePlayer.java"
