// Bytecode for: ext.mods.gameserver.network.clientpackets.Logout
// File: ext\mods\gameserver\network\clientpackets\Logout.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/network/clientpackets/Logout.class
  Last modified 9 de jul de 2026; size 3383 bytes
  MD5 checksum 00e9255b2fa70182f813469886945258
  Compiled from "Logout.java"
public final class ext.mods.gameserver.network.clientpackets.Logout extends ext.mods.gameserver.network.clientpackets.L2GameClientPacket
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/network/clientpackets/Logout
  super_class: #2                         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
  interfaces: 0, fields: 0, methods: 3, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
    #2 = Class              #4            // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               ext/mods/gameserver/network/clientpackets/L2GameClientPacket
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/network/clientpackets/Logout.getClient:()Lext/mods/commons/mmocore/MMOClient;
    #8 = Class              #10           // ext/mods/gameserver/network/clientpackets/Logout
    #9 = NameAndType        #11:#12       // getClient:()Lext/mods/commons/mmocore/MMOClient;
   #10 = Utf8               ext/mods/gameserver/network/clientpackets/Logout
   #11 = Utf8               getClient
   #12 = Utf8               ()Lext/mods/commons/mmocore/MMOClient;
   #13 = Class              #14           // ext/mods/gameserver/network/GameClient
   #14 = Utf8               ext/mods/gameserver/network/GameClient
   #15 = Methodref          #13.#16       // ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
   #16 = NameAndType        #17:#18       // getPlayer:()Lext/mods/gameserver/model/actor/Player;
   #17 = Utf8               getPlayer
   #18 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #19 = Methodref          #20.#21       // ext/mods/gameserver/model/actor/Player.getActiveEnchantItem:()Lext/mods/gameserver/model/item/instance/ItemInstance;
   #20 = Class              #22           // ext/mods/gameserver/model/actor/Player
   #21 = NameAndType        #23:#24       // getActiveEnchantItem:()Lext/mods/gameserver/model/item/instance/ItemInstance;
   #22 = Utf8               ext/mods/gameserver/model/actor/Player
   #23 = Utf8               getActiveEnchantItem
   #24 = Utf8               ()Lext/mods/gameserver/model/item/instance/ItemInstance;
   #25 = Methodref          #20.#26       // ext/mods/gameserver/model/actor/Player.isLocked:()Z
   #26 = NameAndType        #27:#28       // isLocked:()Z
   #27 = Utf8               isLocked
   #28 = Utf8               ()Z
   #29 = Fieldref           #30.#31       // ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #30 = Class              #32           // ext/mods/gameserver/network/serverpackets/ActionFailed
   #31 = NameAndType        #33:#34       // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #32 = Utf8               ext/mods/gameserver/network/serverpackets/ActionFailed
   #33 = Utf8               STATIC_PACKET
   #34 = Utf8               Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #35 = Methodref          #20.#36       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #36 = NameAndType        #37:#38       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #37 = Utf8               sendPacket
   #38 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #39 = Fieldref           #40.#41       // ext/mods/gameserver/enums/ZoneId.NO_RESTART:Lext/mods/gameserver/enums/ZoneId;
   #40 = Class              #42           // ext/mods/gameserver/enums/ZoneId
   #41 = NameAndType        #43:#44       // NO_RESTART:Lext/mods/gameserver/enums/ZoneId;
   #42 = Utf8               ext/mods/gameserver/enums/ZoneId
   #43 = Utf8               NO_RESTART
   #44 = Utf8               Lext/mods/gameserver/enums/ZoneId;
   #45 = Methodref          #20.#46       // ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
   #46 = NameAndType        #47:#48       // isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
   #47 = Utf8               isInsideZone
   #48 = Utf8               (Lext/mods/gameserver/enums/ZoneId;)Z
   #49 = Fieldref           #50.#51       // ext/mods/gameserver/network/SystemMessageId.NO_LOGOUT_HERE:Lext/mods/gameserver/network/SystemMessageId;
   #50 = Class              #52           // ext/mods/gameserver/network/SystemMessageId
   #51 = NameAndType        #53:#54       // NO_LOGOUT_HERE:Lext/mods/gameserver/network/SystemMessageId;
   #52 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #53 = Utf8               NO_LOGOUT_HERE
   #54 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #55 = Methodref          #20.#56       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #56 = NameAndType        #37:#57       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #57 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #58 = Methodref          #59.#60       // ext/mods/gameserver/taskmanager/AttackStanceTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/AttackStanceTaskManager;
   #59 = Class              #61           // ext/mods/gameserver/taskmanager/AttackStanceTaskManager
   #60 = NameAndType        #62:#63       // getInstance:()Lext/mods/gameserver/taskmanager/AttackStanceTaskManager;
   #61 = Utf8               ext/mods/gameserver/taskmanager/AttackStanceTaskManager
   #62 = Utf8               getInstance
   #63 = Utf8               ()Lext/mods/gameserver/taskmanager/AttackStanceTaskManager;
   #64 = Methodref          #59.#65       // ext/mods/gameserver/taskmanager/AttackStanceTaskManager.isInAttackStance:(Lext/mods/gameserver/model/actor/Creature;)Z
   #65 = NameAndType        #66:#67       // isInAttackStance:(Lext/mods/gameserver/model/actor/Creature;)Z
   #66 = Utf8               isInAttackStance
   #67 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
   #68 = Methodref          #20.#69       // ext/mods/gameserver/model/actor/Player.isGM:()Z
   #69 = NameAndType        #70:#28       // isGM:()Z
   #70 = Utf8               isGM
   #71 = Fieldref           #50.#72       // ext/mods/gameserver/network/SystemMessageId.CANT_LOGOUT_WHILE_FIGHTING:Lext/mods/gameserver/network/SystemMessageId;
   #72 = NameAndType        #73:#54       // CANT_LOGOUT_WHILE_FIGHTING:Lext/mods/gameserver/network/SystemMessageId;
   #73 = Utf8               CANT_LOGOUT_WHILE_FIGHTING
   #74 = Methodref          #20.#75       // ext/mods/gameserver/model/actor/Player.isFestivalParticipant:()Z
   #75 = NameAndType        #76:#28       // isFestivalParticipant:()Z
   #76 = Utf8               isFestivalParticipant
   #77 = Methodref          #78.#79       // ext/mods/gameserver/data/manager/FestivalOfDarknessManager.getInstance:()Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
   #78 = Class              #80           // ext/mods/gameserver/data/manager/FestivalOfDarknessManager
   #79 = NameAndType        #62:#81       // getInstance:()Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
   #80 = Utf8               ext/mods/gameserver/data/manager/FestivalOfDarknessManager
   #81 = Utf8               ()Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
   #82 = Methodref          #78.#83       // ext/mods/gameserver/data/manager/FestivalOfDarknessManager.isFestivalInitialized:()Z
   #83 = NameAndType        #84:#28       // isFestivalInitialized:()Z
   #84 = Utf8               isFestivalInitialized
   #85 = Methodref          #86.#87       // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
   #86 = Class              #88           // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent
   #87 = NameAndType        #62:#89       // getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
   #88 = Utf8               ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent
   #89 = Utf8               ()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
   #90 = Methodref          #86.#91       // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.onLogout:(Lext/mods/gameserver/model/actor/Player;)V
   #91 = NameAndType        #92:#93       // onLogout:(Lext/mods/gameserver/model/actor/Player;)V
   #92 = Utf8               onLogout
   #93 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #94 = Methodref          #95.#96       // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
   #95 = Class              #97           // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent
   #96 = NameAndType        #62:#98       // getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
   #97 = Utf8               ext/mods/gameserver/model/entity/events/deathmatch/DMEvent
   #98 = Utf8               ()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
   #99 = Methodref          #95.#91       // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.onLogout:(Lext/mods/gameserver/model/actor/Player;)V
  #100 = Methodref          #101.#102     // ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
  #101 = Class              #103          // ext/mods/gameserver/model/entity/events/lastman/LMEvent
  #102 = NameAndType        #62:#104      // getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
  #103 = Utf8               ext/mods/gameserver/model/entity/events/lastman/LMEvent
  #104 = Utf8               ()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
  #105 = Methodref          #101.#91      // ext/mods/gameserver/model/entity/events/lastman/LMEvent.onLogout:(Lext/mods/gameserver/model/actor/Player;)V
  #106 = Methodref          #107.#108     // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
  #107 = Class              #109          // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent
  #108 = NameAndType        #62:#110      // getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
  #109 = Utf8               ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent
  #110 = Utf8               ()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
  #111 = Methodref          #107.#91      // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.onLogout:(Lext/mods/gameserver/model/actor/Player;)V
  #112 = Methodref          #20.#113      // ext/mods/gameserver/model/actor/Player.removeFromBossZone:()V
  #113 = NameAndType        #114:#6       // removeFromBossZone:()V
  #114 = Utf8               removeFromBossZone
  #115 = Methodref          #116.#117     // ext/mods/gameserver/data/manager/AntiFeedManager.getInstance:()Lext/mods/gameserver/data/manager/AntiFeedManager;
  #116 = Class              #118          // ext/mods/gameserver/data/manager/AntiFeedManager
  #117 = NameAndType        #62:#119      // getInstance:()Lext/mods/gameserver/data/manager/AntiFeedManager;
  #118 = Utf8               ext/mods/gameserver/data/manager/AntiFeedManager
  #119 = Utf8               ()Lext/mods/gameserver/data/manager/AntiFeedManager;
  #120 = Methodref          #20.#121      // ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
  #121 = NameAndType        #11:#122      // getClient:()Lext/mods/gameserver/network/GameClient;
  #122 = Utf8               ()Lext/mods/gameserver/network/GameClient;
  #123 = Methodref          #116.#124     // ext/mods/gameserver/data/manager/AntiFeedManager.onDisconnect:(Lext/mods/gameserver/network/GameClient;)V
  #124 = NameAndType        #125:#126     // onDisconnect:(Lext/mods/gameserver/network/GameClient;)V
  #125 = Utf8               onDisconnect
  #126 = Utf8               (Lext/mods/gameserver/network/GameClient;)V
  #127 = Methodref          #128.#129     // ext/mods/Safedisconect/SafeDisconnectManager.getInstance:()Lext/mods/Safedisconect/SafeDisconnectManager;
  #128 = Class              #130          // ext/mods/Safedisconect/SafeDisconnectManager
  #129 = NameAndType        #62:#131      // getInstance:()Lext/mods/Safedisconect/SafeDisconnectManager;
  #130 = Utf8               ext/mods/Safedisconect/SafeDisconnectManager
  #131 = Utf8               ()Lext/mods/Safedisconect/SafeDisconnectManager;
  #132 = Methodref          #128.#133     // ext/mods/Safedisconect/SafeDisconnectManager.markExpectedLogout:(Lext/mods/gameserver/model/actor/Player;)V
  #133 = NameAndType        #134:#93      // markExpectedLogout:(Lext/mods/gameserver/model/actor/Player;)V
  #134 = Utf8               markExpectedLogout
  #135 = Methodref          #20.#136      // ext/mods/gameserver/model/actor/Player.logout:(Z)V
  #136 = NameAndType        #137:#138     // logout:(Z)V
  #137 = Utf8               logout
  #138 = Utf8               (Z)V
  #139 = Utf8               Code
  #140 = Utf8               LineNumberTable
  #141 = Utf8               LocalVariableTable
  #142 = Utf8               this
  #143 = Utf8               Lext/mods/gameserver/network/clientpackets/Logout;
  #144 = Utf8               readImpl
  #145 = Utf8               runImpl
  #146 = Utf8               player
  #147 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #148 = Utf8               StackMapTable
  #149 = Utf8               SourceFile
  #150 = Utf8               Logout.java
{
  public ext.mods.gameserver.network.clientpackets.Logout();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
         4: return
      LineNumberTable:
        line 33: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/network/clientpackets/Logout;

  protected void readImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=0, locals=1, args_size=1
         0: return
      LineNumberTable:
        line 38: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/network/clientpackets/Logout;

  protected void runImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=2, args_size=1
         0: aload_0
         1: invokevirtual #7                  // Method getClient:()Lext/mods/commons/mmocore/MMOClient;
         4: checkcast     #13                 // class ext/mods/gameserver/network/GameClient
         7: invokevirtual #15                 // Method ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        10: astore_1
        11: aload_1
        12: ifnonnull     16
        15: return
        16: aload_1
        17: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Player.getActiveEnchantItem:()Lext/mods/gameserver/model/item/instance/ItemInstance;
        20: ifnonnull     30
        23: aload_1
        24: invokevirtual #25                 // Method ext/mods/gameserver/model/actor/Player.isLocked:()Z
        27: ifeq          38
        30: aload_1
        31: getstatic     #29                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
        34: invokevirtual #35                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        37: return
        38: aload_1
        39: getstatic     #39                 // Field ext/mods/gameserver/enums/ZoneId.NO_RESTART:Lext/mods/gameserver/enums/ZoneId;
        42: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
        45: ifeq          63
        48: aload_1
        49: getstatic     #49                 // Field ext/mods/gameserver/network/SystemMessageId.NO_LOGOUT_HERE:Lext/mods/gameserver/network/SystemMessageId;
        52: invokevirtual #55                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        55: aload_1
        56: getstatic     #29                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
        59: invokevirtual #35                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        62: return
        63: invokestatic  #58                 // Method ext/mods/gameserver/taskmanager/AttackStanceTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/AttackStanceTaskManager;
        66: aload_1
        67: invokevirtual #64                 // Method ext/mods/gameserver/taskmanager/AttackStanceTaskManager.isInAttackStance:(Lext/mods/gameserver/model/actor/Creature;)Z
        70: ifeq          95
        73: aload_1
        74: invokevirtual #68                 // Method ext/mods/gameserver/model/actor/Player.isGM:()Z
        77: ifne          95
        80: aload_1
        81: getstatic     #71                 // Field ext/mods/gameserver/network/SystemMessageId.CANT_LOGOUT_WHILE_FIGHTING:Lext/mods/gameserver/network/SystemMessageId;
        84: invokevirtual #55                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        87: aload_1
        88: getstatic     #29                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
        91: invokevirtual #35                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        94: return
        95: aload_1
        96: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.isFestivalParticipant:()Z
        99: ifeq          126
       102: invokestatic  #77                 // Method ext/mods/gameserver/data/manager/FestivalOfDarknessManager.getInstance:()Lext/mods/gameserver/data/manager/FestivalOfDarknessManager;
       105: invokevirtual #82                 // Method ext/mods/gameserver/data/manager/FestivalOfDarknessManager.isFestivalInitialized:()Z
       108: ifeq          126
       111: aload_1
       112: getstatic     #49                 // Field ext/mods/gameserver/network/SystemMessageId.NO_LOGOUT_HERE:Lext/mods/gameserver/network/SystemMessageId;
       115: invokevirtual #55                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       118: aload_1
       119: getstatic     #29                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       122: invokevirtual #35                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       125: return
       126: invokestatic  #85                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
       129: aload_1
       130: invokevirtual #90                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.onLogout:(Lext/mods/gameserver/model/actor/Player;)V
       133: invokestatic  #94                 // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
       136: aload_1
       137: invokevirtual #99                 // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.onLogout:(Lext/mods/gameserver/model/actor/Player;)V
       140: invokestatic  #100                // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
       143: aload_1
       144: invokevirtual #105                // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.onLogout:(Lext/mods/gameserver/model/actor/Player;)V
       147: invokestatic  #106                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
       150: aload_1
       151: invokevirtual #111                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.onLogout:(Lext/mods/gameserver/model/actor/Player;)V
       154: aload_1
       155: invokevirtual #112                // Method ext/mods/gameserver/model/actor/Player.removeFromBossZone:()V
       158: invokestatic  #115                // Method ext/mods/gameserver/data/manager/AntiFeedManager.getInstance:()Lext/mods/gameserver/data/manager/AntiFeedManager;
       161: aload_1
       162: invokevirtual #120                // Method ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
       165: invokevirtual #123                // Method ext/mods/gameserver/data/manager/AntiFeedManager.onDisconnect:(Lext/mods/gameserver/network/GameClient;)V
       168: invokestatic  #127                // Method ext/mods/Safedisconect/SafeDisconnectManager.getInstance:()Lext/mods/Safedisconect/SafeDisconnectManager;
       171: aload_1
       172: invokevirtual #132                // Method ext/mods/Safedisconect/SafeDisconnectManager.markExpectedLogout:(Lext/mods/gameserver/model/actor/Player;)V
       175: aload_1
       176: iconst_1
       177: invokevirtual #135                // Method ext/mods/gameserver/model/actor/Player.logout:(Z)V
       180: return
      LineNumberTable:
        line 43: 0
        line 44: 11
        line 45: 15
        line 47: 16
        line 49: 30
        line 50: 37
        line 53: 38
        line 55: 48
        line 56: 55
        line 57: 62
        line 60: 63
        line 62: 80
        line 63: 87
        line 64: 94
        line 67: 95
        line 69: 111
        line 70: 118
        line 71: 125
        line 74: 126
        line 75: 133
        line 76: 140
        line 77: 147
        line 79: 154
        line 80: 158
        line 81: 168
        line 82: 175
        line 83: 180
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     181     0  this   Lext/mods/gameserver/network/clientpackets/Logout;
           11     170     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 6
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 13 /* same */
        frame_type = 7 /* same */
        frame_type = 24 /* same */
        frame_type = 31 /* same */
        frame_type = 30 /* same */
}
SourceFile: "Logout.java"
