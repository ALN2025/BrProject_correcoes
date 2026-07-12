// Bytecode for: ext.mods.gameserver.network.clientpackets.RequestAutoSoulShot
// File: ext\mods\gameserver\network\clientpackets\RequestAutoSoulShot.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/network/clientpackets/RequestAutoSoulShot.class
  Last modified 9 de jul de 2026; size 4053 bytes
  MD5 checksum 366f5cae57232298656d992ff67b3ce4
  Compiled from "RequestAutoSoulShot.java"
public final class ext.mods.gameserver.network.clientpackets.RequestAutoSoulShot extends ext.mods.gameserver.network.clientpackets.L2GameClientPacket
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/network/clientpackets/RequestAutoSoulShot
  super_class: #2                         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
  interfaces: 0, fields: 2, methods: 3, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
    #2 = Class              #4            // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               ext/mods/gameserver/network/clientpackets/L2GameClientPacket
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/network/clientpackets/RequestAutoSoulShot.readD:()I
    #8 = Class              #10           // ext/mods/gameserver/network/clientpackets/RequestAutoSoulShot
    #9 = NameAndType        #11:#12       // readD:()I
   #10 = Utf8               ext/mods/gameserver/network/clientpackets/RequestAutoSoulShot
   #11 = Utf8               readD
   #12 = Utf8               ()I
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/network/clientpackets/RequestAutoSoulShot._itemId:I
   #14 = NameAndType        #15:#16       // _itemId:I
   #15 = Utf8               _itemId
   #16 = Utf8               I
   #17 = Fieldref           #8.#18        // ext/mods/gameserver/network/clientpackets/RequestAutoSoulShot._type:I
   #18 = NameAndType        #19:#16       // _type:I
   #19 = Utf8               _type
   #20 = Methodref          #8.#21        // ext/mods/gameserver/network/clientpackets/RequestAutoSoulShot.getClient:()Lext/mods/commons/mmocore/MMOClient;
   #21 = NameAndType        #22:#23       // getClient:()Lext/mods/commons/mmocore/MMOClient;
   #22 = Utf8               getClient
   #23 = Utf8               ()Lext/mods/commons/mmocore/MMOClient;
   #24 = Class              #25           // ext/mods/gameserver/network/GameClient
   #25 = Utf8               ext/mods/gameserver/network/GameClient
   #26 = Methodref          #24.#27       // ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
   #27 = NameAndType        #28:#29       // getPlayer:()Lext/mods/gameserver/model/actor/Player;
   #28 = Utf8               getPlayer
   #29 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #30 = Methodref          #31.#32       // ext/mods/gameserver/model/actor/Player.isOperating:()Z
   #31 = Class              #33           // ext/mods/gameserver/model/actor/Player
   #32 = NameAndType        #34:#35       // isOperating:()Z
   #33 = Utf8               ext/mods/gameserver/model/actor/Player
   #34 = Utf8               isOperating
   #35 = Utf8               ()Z
   #36 = Methodref          #31.#37       // ext/mods/gameserver/model/actor/Player.getActiveRequester:()Lext/mods/gameserver/model/actor/Player;
   #37 = NameAndType        #38:#29       // getActiveRequester:()Lext/mods/gameserver/model/actor/Player;
   #38 = Utf8               getActiveRequester
   #39 = Methodref          #31.#40       // ext/mods/gameserver/model/actor/Player.isDead:()Z
   #40 = NameAndType        #41:#35       // isDead:()Z
   #41 = Utf8               isDead
   #42 = Methodref          #31.#43       // ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #43 = NameAndType        #44:#45       // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #44 = Utf8               getInventory
   #45 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #46 = Methodref          #47.#48       // ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #47 = Class              #49           // ext/mods/gameserver/model/itemcontainer/PcInventory
   #48 = NameAndType        #50:#51       // getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #49 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
   #50 = Utf8               getItemByItemId
   #51 = Utf8               (I)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #52 = Methodref          #31.#53       // ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
   #53 = NameAndType        #54:#55       // getSummon:()Lext/mods/gameserver/model/actor/Summon;
   #54 = Utf8               getSummon
   #55 = Utf8               ()Lext/mods/gameserver/model/actor/Summon;
   #56 = Methodref          #31.#57       // ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
   #57 = NameAndType        #58:#35       // isInOlympiadMode:()Z
   #58 = Utf8               isInOlympiadMode
   #59 = Fieldref           #60.#61       // ext/mods/gameserver/network/SystemMessageId.THIS_ITEM_IS_NOT_AVAILABLE_FOR_THE_OLYMPIAD_EVENT:Lext/mods/gameserver/network/SystemMessageId;
   #60 = Class              #62           // ext/mods/gameserver/network/SystemMessageId
   #61 = NameAndType        #63:#64       // THIS_ITEM_IS_NOT_AVAILABLE_FOR_THE_OLYMPIAD_EVENT:Lext/mods/gameserver/network/SystemMessageId;
   #62 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #63 = Utf8               THIS_ITEM_IS_NOT_AVAILABLE_FOR_THE_OLYMPIAD_EVENT
   #64 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #65 = Methodref          #31.#66       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #66 = NameAndType        #67:#68       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #67 = Utf8               sendPacket
   #68 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #69 = Methodref          #70.#71       // ext/mods/gameserver/model/actor/Summon.getSoulShotsPerHit:()I
   #70 = Class              #72           // ext/mods/gameserver/model/actor/Summon
   #71 = NameAndType        #73:#12       // getSoulShotsPerHit:()I
   #72 = Utf8               ext/mods/gameserver/model/actor/Summon
   #73 = Utf8               getSoulShotsPerHit
   #74 = Methodref          #75.#76       // ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
   #75 = Class              #77           // ext/mods/gameserver/model/item/instance/ItemInstance
   #76 = NameAndType        #78:#12       // getCount:()I
   #77 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
   #78 = Utf8               getCount
   #79 = Fieldref           #60.#80       // ext/mods/gameserver/network/SystemMessageId.NOT_ENOUGH_SOULSHOTS_FOR_PET:Lext/mods/gameserver/network/SystemMessageId;
   #80 = NameAndType        #81:#64       // NOT_ENOUGH_SOULSHOTS_FOR_PET:Lext/mods/gameserver/network/SystemMessageId;
   #81 = Utf8               NOT_ENOUGH_SOULSHOTS_FOR_PET
   #82 = Methodref          #70.#83       // ext/mods/gameserver/model/actor/Summon.getSpiritShotsPerHit:()I
   #83 = NameAndType        #84:#12       // getSpiritShotsPerHit:()I
   #84 = Utf8               getSpiritShotsPerHit
   #85 = Fieldref           #60.#86       // ext/mods/gameserver/network/SystemMessageId.NOT_ENOUGH_SPIRITSHOTS_FOR_PET:Lext/mods/gameserver/network/SystemMessageId;
   #86 = NameAndType        #87:#64       // NOT_ENOUGH_SPIRITSHOTS_FOR_PET:Lext/mods/gameserver/network/SystemMessageId;
   #87 = Utf8               NOT_ENOUGH_SPIRITSHOTS_FOR_PET
   #88 = Methodref          #31.#89       // ext/mods/gameserver/model/actor/Player.addAutoSoulShot:(I)V
   #89 = NameAndType        #90:#91       // addAutoSoulShot:(I)V
   #90 = Utf8               addAutoSoulShot
   #91 = Utf8               (I)V
   #92 = Class              #93           // ext/mods/gameserver/network/serverpackets/ExAutoSoulShot
   #93 = Utf8               ext/mods/gameserver/network/serverpackets/ExAutoSoulShot
   #94 = Methodref          #92.#95       // ext/mods/gameserver/network/serverpackets/ExAutoSoulShot."<init>":(II)V
   #95 = NameAndType        #5:#96        // "<init>":(II)V
   #96 = Utf8               (II)V
   #97 = Methodref          #31.#98       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #98 = NameAndType        #67:#99       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #99 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #100 = Fieldref           #60.#101      // ext/mods/gameserver/network/SystemMessageId.USE_OF_S1_WILL_BE_AUTO:Lext/mods/gameserver/network/SystemMessageId;
  #101 = NameAndType        #102:#64      // USE_OF_S1_WILL_BE_AUTO:Lext/mods/gameserver/network/SystemMessageId;
  #102 = Utf8               USE_OF_S1_WILL_BE_AUTO
  #103 = Methodref          #104.#105     // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #104 = Class              #106          // ext/mods/gameserver/network/serverpackets/SystemMessage
  #105 = NameAndType        #107:#108     // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #106 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #107 = Utf8               getSystemMessage
  #108 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #109 = Methodref          #104.#110     // ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #110 = NameAndType        #111:#112     // addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #111 = Utf8               addItemName
  #112 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #113 = Methodref          #31.#114      // ext/mods/gameserver/model/actor/Player.rechargeShots:(ZZ)V
  #114 = NameAndType        #115:#116     // rechargeShots:(ZZ)V
  #115 = Utf8               rechargeShots
  #116 = Utf8               (ZZ)V
  #117 = Methodref          #70.#114      // ext/mods/gameserver/model/actor/Summon.rechargeShots:(ZZ)V
  #118 = Fieldref           #60.#119      // ext/mods/gameserver/network/SystemMessageId.NO_SERVITOR_CANNOT_AUTOMATE_USE:Lext/mods/gameserver/network/SystemMessageId;
  #119 = NameAndType        #120:#64      // NO_SERVITOR_CANNOT_AUTOMATE_USE:Lext/mods/gameserver/network/SystemMessageId;
  #120 = Utf8               NO_SERVITOR_CANNOT_AUTOMATE_USE
  #121 = Methodref          #31.#122      // ext/mods/gameserver/model/actor/Player.getActiveWeaponInstance:()Lext/mods/gameserver/model/item/instance/ItemInstance;
  #122 = NameAndType        #123:#124     // getActiveWeaponInstance:()Lext/mods/gameserver/model/item/instance/ItemInstance;
  #123 = Utf8               getActiveWeaponInstance
  #124 = Utf8               ()Lext/mods/gameserver/model/item/instance/ItemInstance;
  #125 = Methodref          #75.#126      // ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
  #126 = NameAndType        #127:#128     // getItem:()Lext/mods/gameserver/model/item/kind/Item;
  #127 = Utf8               getItem
  #128 = Utf8               ()Lext/mods/gameserver/model/item/kind/Item;
  #129 = Methodref          #130.#131     // ext/mods/gameserver/model/item/kind/Item.getCrystalType:()Lext/mods/gameserver/enums/items/CrystalType;
  #130 = Class              #132          // ext/mods/gameserver/model/item/kind/Item
  #131 = NameAndType        #133:#134     // getCrystalType:()Lext/mods/gameserver/enums/items/CrystalType;
  #132 = Utf8               ext/mods/gameserver/model/item/kind/Item
  #133 = Utf8               getCrystalType
  #134 = Utf8               ()Lext/mods/gameserver/enums/items/CrystalType;
  #135 = Methodref          #31.#136      // ext/mods/gameserver/model/actor/Player.getActiveWeaponItem:()Lext/mods/gameserver/model/item/kind/Weapon;
  #136 = NameAndType        #137:#138     // getActiveWeaponItem:()Lext/mods/gameserver/model/item/kind/Weapon;
  #137 = Utf8               getActiveWeaponItem
  #138 = Utf8               ()Lext/mods/gameserver/model/item/kind/Weapon;
  #139 = Methodref          #140.#131     // ext/mods/gameserver/model/item/kind/Weapon.getCrystalType:()Lext/mods/gameserver/enums/items/CrystalType;
  #140 = Class              #141          // ext/mods/gameserver/model/item/kind/Weapon
  #141 = Utf8               ext/mods/gameserver/model/item/kind/Weapon
  #142 = Fieldref           #60.#143      // ext/mods/gameserver/network/SystemMessageId.SPIRITSHOTS_GRADE_MISMATCH:Lext/mods/gameserver/network/SystemMessageId;
  #143 = NameAndType        #144:#64      // SPIRITSHOTS_GRADE_MISMATCH:Lext/mods/gameserver/network/SystemMessageId;
  #144 = Utf8               SPIRITSHOTS_GRADE_MISMATCH
  #145 = Fieldref           #60.#146      // ext/mods/gameserver/network/SystemMessageId.SOULSHOTS_GRADE_MISMATCH:Lext/mods/gameserver/network/SystemMessageId;
  #146 = NameAndType        #147:#64      // SOULSHOTS_GRADE_MISMATCH:Lext/mods/gameserver/network/SystemMessageId;
  #147 = Utf8               SOULSHOTS_GRADE_MISMATCH
  #148 = Methodref          #149.#150     // ext/mods/extensions/listener/manager/PlayerListenerManager.getInstance:()Lext/mods/extensions/listener/manager/PlayerListenerManager;
  #149 = Class              #151          // ext/mods/extensions/listener/manager/PlayerListenerManager
  #150 = NameAndType        #152:#153     // getInstance:()Lext/mods/extensions/listener/manager/PlayerListenerManager;
  #151 = Utf8               ext/mods/extensions/listener/manager/PlayerListenerManager
  #152 = Utf8               getInstance
  #153 = Utf8               ()Lext/mods/extensions/listener/manager/PlayerListenerManager;
  #154 = Methodref          #149.#155     // ext/mods/extensions/listener/manager/PlayerListenerManager.notifyAutoSoulShot:(Lext/mods/gameserver/model/actor/Player;IZ)V
  #155 = NameAndType        #156:#157     // notifyAutoSoulShot:(Lext/mods/gameserver/model/actor/Player;IZ)V
  #156 = Utf8               notifyAutoSoulShot
  #157 = Utf8               (Lext/mods/gameserver/model/actor/Player;IZ)V
  #158 = Methodref          #31.#159      // ext/mods/gameserver/model/actor/Player.removeAutoSoulShot:(I)Z
  #159 = NameAndType        #160:#161     // removeAutoSoulShot:(I)Z
  #160 = Utf8               removeAutoSoulShot
  #161 = Utf8               (I)Z
  #162 = Fieldref           #60.#163      // ext/mods/gameserver/network/SystemMessageId.AUTO_USE_OF_S1_CANCELLED:Lext/mods/gameserver/network/SystemMessageId;
  #163 = NameAndType        #164:#64      // AUTO_USE_OF_S1_CANCELLED:Lext/mods/gameserver/network/SystemMessageId;
  #164 = Utf8               AUTO_USE_OF_S1_CANCELLED
  #165 = Utf8               Code
  #166 = Utf8               LineNumberTable
  #167 = Utf8               LocalVariableTable
  #168 = Utf8               this
  #169 = Utf8               Lext/mods/gameserver/network/clientpackets/RequestAutoSoulShot;
  #170 = Utf8               readImpl
  #171 = Utf8               runImpl
  #172 = Utf8               item
  #173 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #174 = Utf8               player
  #175 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #176 = Utf8               StackMapTable
  #177 = Utf8               SourceFile
  #178 = Utf8               RequestAutoSoulShot.java
{
  public ext.mods.gameserver.network.clientpackets.RequestAutoSoulShot();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
         4: return
      LineNumberTable:
        line 27: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/network/clientpackets/RequestAutoSoulShot;

  protected void readImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: aload_0
         2: invokevirtual #7                  // Method readD:()I
         5: putfield      #13                 // Field _itemId:I
         8: aload_0
         9: aload_0
        10: invokevirtual #7                  // Method readD:()I
        13: putfield      #17                 // Field _type:I
        16: return
      LineNumberTable:
        line 35: 0
        line 36: 8
        line 37: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/network/clientpackets/RequestAutoSoulShot;

  protected void runImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=5, locals=3, args_size=1
         0: aload_0
         1: invokevirtual #20                 // Method getClient:()Lext/mods/commons/mmocore/MMOClient;
         4: checkcast     #24                 // class ext/mods/gameserver/network/GameClient
         7: invokevirtual #26                 // Method ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        10: astore_1
        11: aload_1
        12: ifnonnull     16
        15: return
        16: aload_1
        17: invokevirtual #30                 // Method ext/mods/gameserver/model/actor/Player.isOperating:()Z
        20: ifne          516
        23: aload_1
        24: invokevirtual #36                 // Method ext/mods/gameserver/model/actor/Player.getActiveRequester:()Lext/mods/gameserver/model/actor/Player;
        27: ifnonnull     516
        30: aload_1
        31: invokevirtual #39                 // Method ext/mods/gameserver/model/actor/Player.isDead:()Z
        34: ifne          516
        37: aload_1
        38: invokevirtual #42                 // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
        41: aload_0
        42: getfield      #13                 // Field _itemId:I
        45: invokevirtual #46                 // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
        48: astore_2
        49: aload_2
        50: ifnonnull     54
        53: return
        54: aload_0
        55: getfield      #17                 // Field _type:I
        58: iconst_1
        59: if_icmpne     464
        62: aload_0
        63: getfield      #13                 // Field _itemId:I
        66: sipush        6535
        69: if_icmplt     82
        72: aload_0
        73: getfield      #13                 // Field _itemId:I
        76: sipush        6540
        79: if_icmple     449
        82: aload_0
        83: getfield      #13                 // Field _itemId:I
        86: sipush        6645
        89: if_icmpeq     112
        92: aload_0
        93: getfield      #13                 // Field _itemId:I
        96: sipush        6646
        99: if_icmpeq     112
       102: aload_0
       103: getfield      #13                 // Field _itemId:I
       106: sipush        6647
       109: if_icmpne     270
       112: aload_1
       113: invokevirtual #52                 // Method ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
       116: ifnull        260
       119: aload_0
       120: getfield      #13                 // Field _itemId:I
       123: sipush        6647
       126: if_icmpne     144
       129: aload_1
       130: invokevirtual #56                 // Method ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
       133: ifeq          144
       136: aload_1
       137: getstatic     #59                 // Field ext/mods/gameserver/network/SystemMessageId.THIS_ITEM_IS_NOT_AVAILABLE_FOR_THE_OLYMPIAD_EVENT:Lext/mods/gameserver/network/SystemMessageId;
       140: invokevirtual #65                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       143: return
       144: aload_0
       145: getfield      #13                 // Field _itemId:I
       148: sipush        6645
       151: if_icmpne     176
       154: aload_1
       155: invokevirtual #52                 // Method ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
       158: invokevirtual #69                 // Method ext/mods/gameserver/model/actor/Summon.getSoulShotsPerHit:()I
       161: aload_2
       162: invokevirtual #74                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
       165: if_icmple     198
       168: aload_1
       169: getstatic     #79                 // Field ext/mods/gameserver/network/SystemMessageId.NOT_ENOUGH_SOULSHOTS_FOR_PET:Lext/mods/gameserver/network/SystemMessageId;
       172: invokevirtual #65                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       175: return
       176: aload_1
       177: invokevirtual #52                 // Method ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
       180: invokevirtual #82                 // Method ext/mods/gameserver/model/actor/Summon.getSpiritShotsPerHit:()I
       183: aload_2
       184: invokevirtual #74                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
       187: if_icmple     198
       190: aload_1
       191: getstatic     #85                 // Field ext/mods/gameserver/network/SystemMessageId.NOT_ENOUGH_SPIRITSHOTS_FOR_PET:Lext/mods/gameserver/network/SystemMessageId;
       194: invokevirtual #65                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       197: return
       198: aload_1
       199: aload_0
       200: getfield      #13                 // Field _itemId:I
       203: invokevirtual #88                 // Method ext/mods/gameserver/model/actor/Player.addAutoSoulShot:(I)V
       206: aload_1
       207: new           #92                 // class ext/mods/gameserver/network/serverpackets/ExAutoSoulShot
       210: dup
       211: aload_0
       212: getfield      #13                 // Field _itemId:I
       215: aload_0
       216: getfield      #17                 // Field _type:I
       219: invokespecial #94                 // Method ext/mods/gameserver/network/serverpackets/ExAutoSoulShot."<init>":(II)V
       222: invokevirtual #97                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       225: aload_1
       226: getstatic     #100                // Field ext/mods/gameserver/network/SystemMessageId.USE_OF_S1_WILL_BE_AUTO:Lext/mods/gameserver/network/SystemMessageId;
       229: invokestatic  #103                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       232: aload_0
       233: getfield      #13                 // Field _itemId:I
       236: invokevirtual #109                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       239: invokevirtual #97                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       242: aload_1
       243: iconst_1
       244: iconst_1
       245: invokevirtual #113                // Method ext/mods/gameserver/model/actor/Player.rechargeShots:(ZZ)V
       248: aload_1
       249: invokevirtual #52                 // Method ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
       252: iconst_1
       253: iconst_1
       254: invokevirtual #117                // Method ext/mods/gameserver/model/actor/Summon.rechargeShots:(ZZ)V
       257: goto          449
       260: aload_1
       261: getstatic     #118                // Field ext/mods/gameserver/network/SystemMessageId.NO_SERVITOR_CANNOT_AUTOMATE_USE:Lext/mods/gameserver/network/SystemMessageId;
       264: invokevirtual #65                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       267: goto          449
       270: aload_0
       271: getfield      #13                 // Field _itemId:I
       274: sipush        3947
       277: if_icmplt     305
       280: aload_0
       281: getfield      #13                 // Field _itemId:I
       284: sipush        3952
       287: if_icmpgt     305
       290: aload_1
       291: invokevirtual #56                 // Method ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
       294: ifeq          305
       297: aload_1
       298: getstatic     #59                 // Field ext/mods/gameserver/network/SystemMessageId.THIS_ITEM_IS_NOT_AVAILABLE_FOR_THE_OLYMPIAD_EVENT:Lext/mods/gameserver/network/SystemMessageId;
       301: invokevirtual #65                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       304: return
       305: aload_1
       306: aload_0
       307: getfield      #13                 // Field _itemId:I
       310: invokevirtual #88                 // Method ext/mods/gameserver/model/actor/Player.addAutoSoulShot:(I)V
       313: aload_1
       314: new           #92                 // class ext/mods/gameserver/network/serverpackets/ExAutoSoulShot
       317: dup
       318: aload_0
       319: getfield      #13                 // Field _itemId:I
       322: aload_0
       323: getfield      #17                 // Field _type:I
       326: invokespecial #94                 // Method ext/mods/gameserver/network/serverpackets/ExAutoSoulShot."<init>":(II)V
       329: invokevirtual #97                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       332: aload_1
       333: invokevirtual #121                // Method ext/mods/gameserver/model/actor/Player.getActiveWeaponInstance:()Lext/mods/gameserver/model/item/instance/ItemInstance;
       336: ifnull        365
       339: aload_2
       340: invokevirtual #125                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
       343: invokevirtual #129                // Method ext/mods/gameserver/model/item/kind/Item.getCrystalType:()Lext/mods/gameserver/enums/items/CrystalType;
       346: aload_1
       347: invokevirtual #135                // Method ext/mods/gameserver/model/actor/Player.getActiveWeaponItem:()Lext/mods/gameserver/model/item/kind/Weapon;
       350: invokevirtual #139                // Method ext/mods/gameserver/model/item/kind/Weapon.getCrystalType:()Lext/mods/gameserver/enums/items/CrystalType;
       353: if_acmpne     365
       356: aload_1
       357: iconst_1
       358: iconst_1
       359: invokevirtual #113                // Method ext/mods/gameserver/model/actor/Player.rechargeShots:(ZZ)V
       362: goto          432
       365: aload_0
       366: getfield      #13                 // Field _itemId:I
       369: sipush        2509
       372: if_icmplt     385
       375: aload_0
       376: getfield      #13                 // Field _itemId:I
       379: sipush        2514
       382: if_icmple     415
       385: aload_0
       386: getfield      #13                 // Field _itemId:I
       389: sipush        3947
       392: if_icmplt     405
       395: aload_0
       396: getfield      #13                 // Field _itemId:I
       399: sipush        3952
       402: if_icmple     415
       405: aload_0
       406: getfield      #13                 // Field _itemId:I
       409: sipush        5790
       412: if_icmpne     425
       415: aload_1
       416: getstatic     #142                // Field ext/mods/gameserver/network/SystemMessageId.SPIRITSHOTS_GRADE_MISMATCH:Lext/mods/gameserver/network/SystemMessageId;
       419: invokevirtual #65                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       422: goto          432
       425: aload_1
       426: getstatic     #145                // Field ext/mods/gameserver/network/SystemMessageId.SOULSHOTS_GRADE_MISMATCH:Lext/mods/gameserver/network/SystemMessageId;
       429: invokevirtual #65                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       432: aload_1
       433: getstatic     #100                // Field ext/mods/gameserver/network/SystemMessageId.USE_OF_S1_WILL_BE_AUTO:Lext/mods/gameserver/network/SystemMessageId;
       436: invokestatic  #103                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       439: aload_0
       440: getfield      #13                 // Field _itemId:I
       443: invokevirtual #109                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       446: invokevirtual #97                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       449: invokestatic  #148                // Method ext/mods/extensions/listener/manager/PlayerListenerManager.getInstance:()Lext/mods/extensions/listener/manager/PlayerListenerManager;
       452: aload_1
       453: aload_0
       454: getfield      #13                 // Field _itemId:I
       457: iconst_1
       458: invokevirtual #154                // Method ext/mods/extensions/listener/manager/PlayerListenerManager.notifyAutoSoulShot:(Lext/mods/gameserver/model/actor/Player;IZ)V
       461: goto          516
       464: aload_0
       465: getfield      #17                 // Field _type:I
       468: ifne          516
       471: aload_1
       472: aload_0
       473: getfield      #13                 // Field _itemId:I
       476: invokevirtual #158                // Method ext/mods/gameserver/model/actor/Player.removeAutoSoulShot:(I)Z
       479: pop
       480: aload_1
       481: new           #92                 // class ext/mods/gameserver/network/serverpackets/ExAutoSoulShot
       484: dup
       485: aload_0
       486: getfield      #13                 // Field _itemId:I
       489: aload_0
       490: getfield      #17                 // Field _type:I
       493: invokespecial #94                 // Method ext/mods/gameserver/network/serverpackets/ExAutoSoulShot."<init>":(II)V
       496: invokevirtual #97                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       499: aload_1
       500: getstatic     #162                // Field ext/mods/gameserver/network/SystemMessageId.AUTO_USE_OF_S1_CANCELLED:Lext/mods/gameserver/network/SystemMessageId;
       503: invokestatic  #103                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       506: aload_0
       507: getfield      #13                 // Field _itemId:I
       510: invokevirtual #109                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       513: invokevirtual #97                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       516: return
      LineNumberTable:
        line 42: 0
        line 43: 11
        line 44: 15
        line 46: 16
        line 48: 37
        line 49: 49
        line 50: 53
        line 52: 54
        line 54: 62
        line 56: 82
        line 58: 112
        line 60: 119
        line 62: 136
        line 63: 143
        line 66: 144
        line 68: 154
        line 70: 168
        line 71: 175
        line 76: 176
        line 78: 190
        line 79: 197
        line 83: 198
        line 84: 206
        line 85: 225
        line 86: 242
        line 87: 248
        line 90: 260
        line 94: 270
        line 96: 297
        line 97: 304
        line 100: 305
        line 101: 313
        line 103: 332
        line 104: 356
        line 107: 365
        line 108: 415
        line 110: 425
        line 113: 432
        line 117: 449
        line 119: 464
        line 121: 471
        line 122: 480
        line 123: 499
        line 127: 516
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           49     467     2  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0     517     0  this   Lext/mods/gameserver/network/clientpackets/RequestAutoSoulShot;
           11     506     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 19
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 252 /* append */
          offset_delta = 37
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 27 /* same */
        frame_type = 29 /* same */
        frame_type = 31 /* same */
        frame_type = 31 /* same */
        frame_type = 21 /* same */
        frame_type = 61 /* same */
        frame_type = 9 /* same */
        frame_type = 34 /* same */
        frame_type = 59 /* same */
        frame_type = 19 /* same */
        frame_type = 19 /* same */
        frame_type = 9 /* same */
        frame_type = 9 /* same */
        frame_type = 6 /* same */
        frame_type = 16 /* same */
        frame_type = 14 /* same */
        frame_type = 250 /* chop */
          offset_delta = 51
}
SourceFile: "RequestAutoSoulShot.java"
