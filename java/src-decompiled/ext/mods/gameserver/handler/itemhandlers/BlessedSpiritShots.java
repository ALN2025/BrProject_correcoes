// Bytecode for: ext.mods.gameserver.handler.itemhandlers.BlessedSpiritShots
// File: ext\mods\gameserver\handler\itemhandlers\BlessedSpiritShots.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/itemhandlers/BlessedSpiritShots.class
  Last modified 9 de jul de 2026; size 3357 bytes
  MD5 checksum 79c15ec6cbe71c4942df763f5f983c35
  Compiled from "BlessedSpiritShots.java"
public class ext.mods.gameserver.handler.itemhandlers.BlessedSpiritShots implements ext.mods.gameserver.handler.IItemHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #129                        // ext/mods/gameserver/handler/itemhandlers/BlessedSpiritShots
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 0, methods: 2, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // ext/mods/gameserver/model/actor/Player
    #8 = Utf8               ext/mods/gameserver/model/actor/Player
    #9 = Methodref          #7.#10        // ext/mods/gameserver/model/actor/Player.getActiveWeaponInstance:()Lext/mods/gameserver/model/item/instance/ItemInstance;
   #10 = NameAndType        #11:#12       // getActiveWeaponInstance:()Lext/mods/gameserver/model/item/instance/ItemInstance;
   #11 = Utf8               getActiveWeaponInstance
   #12 = Utf8               ()Lext/mods/gameserver/model/item/instance/ItemInstance;
   #13 = Methodref          #7.#14        // ext/mods/gameserver/model/actor/Player.getActiveWeaponItem:()Lext/mods/gameserver/model/item/kind/Weapon;
   #14 = NameAndType        #15:#16       // getActiveWeaponItem:()Lext/mods/gameserver/model/item/kind/Weapon;
   #15 = Utf8               getActiveWeaponItem
   #16 = Utf8               ()Lext/mods/gameserver/model/item/kind/Weapon;
   #17 = Methodref          #18.#19       // ext/mods/gameserver/model/item/kind/Weapon.getSpiritShotCount:()I
   #18 = Class              #20           // ext/mods/gameserver/model/item/kind/Weapon
   #19 = NameAndType        #21:#22       // getSpiritShotCount:()I
   #20 = Utf8               ext/mods/gameserver/model/item/kind/Weapon
   #21 = Utf8               getSpiritShotCount
   #22 = Utf8               ()I
   #23 = Methodref          #7.#24        // ext/mods/gameserver/model/actor/Player.getAutoSoulShot:()Ljava/util/Set;
   #24 = NameAndType        #25:#26       // getAutoSoulShot:()Ljava/util/Set;
   #25 = Utf8               getAutoSoulShot
   #26 = Utf8               ()Ljava/util/Set;
   #27 = Methodref          #28.#29       // ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
   #28 = Class              #30           // ext/mods/gameserver/model/item/instance/ItemInstance
   #29 = NameAndType        #31:#22       // getItemId:()I
   #30 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
   #31 = Utf8               getItemId
   #32 = Methodref          #33.#34       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #33 = Class              #35           // java/lang/Integer
   #34 = NameAndType        #36:#37       // valueOf:(I)Ljava/lang/Integer;
   #35 = Utf8               java/lang/Integer
   #36 = Utf8               valueOf
   #37 = Utf8               (I)Ljava/lang/Integer;
   #38 = InterfaceMethodref #39.#40       // java/util/Set.contains:(Ljava/lang/Object;)Z
   #39 = Class              #41           // java/util/Set
   #40 = NameAndType        #42:#43       // contains:(Ljava/lang/Object;)Z
   #41 = Utf8               java/util/Set
   #42 = Utf8               contains
   #43 = Utf8               (Ljava/lang/Object;)Z
   #44 = Fieldref           #45.#46       // ext/mods/gameserver/network/SystemMessageId.CANNOT_USE_SPIRITSHOTS:Lext/mods/gameserver/network/SystemMessageId;
   #45 = Class              #47           // ext/mods/gameserver/network/SystemMessageId
   #46 = NameAndType        #48:#49       // CANNOT_USE_SPIRITSHOTS:Lext/mods/gameserver/network/SystemMessageId;
   #47 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #48 = Utf8               CANNOT_USE_SPIRITSHOTS
   #49 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #50 = Methodref          #7.#51        // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #51 = NameAndType        #52:#53       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #52 = Utf8               sendPacket
   #53 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #54 = Fieldref           #55.#56       // ext/mods/gameserver/enums/items/ShotType.BLESSED_SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
   #55 = Class              #57           // ext/mods/gameserver/enums/items/ShotType
   #56 = NameAndType        #58:#59       // BLESSED_SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
   #57 = Utf8               ext/mods/gameserver/enums/items/ShotType
   #58 = Utf8               BLESSED_SPIRITSHOT
   #59 = Utf8               Lext/mods/gameserver/enums/items/ShotType;
   #60 = Methodref          #7.#61        // ext/mods/gameserver/model/actor/Player.isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
   #61 = NameAndType        #62:#63       // isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
   #62 = Utf8               isChargedShot
   #63 = Utf8               (Lext/mods/gameserver/enums/items/ShotType;)Z
   #64 = Methodref          #18.#65       // ext/mods/gameserver/model/item/kind/Weapon.getCrystalType:()Lext/mods/gameserver/enums/items/CrystalType;
   #65 = NameAndType        #66:#67       // getCrystalType:()Lext/mods/gameserver/enums/items/CrystalType;
   #66 = Utf8               getCrystalType
   #67 = Utf8               ()Lext/mods/gameserver/enums/items/CrystalType;
   #68 = Methodref          #28.#69       // ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
   #69 = NameAndType        #70:#71       // getItem:()Lext/mods/gameserver/model/item/kind/Item;
   #70 = Utf8               getItem
   #71 = Utf8               ()Lext/mods/gameserver/model/item/kind/Item;
   #72 = Methodref          #73.#65       // ext/mods/gameserver/model/item/kind/Item.getCrystalType:()Lext/mods/gameserver/enums/items/CrystalType;
   #73 = Class              #74           // ext/mods/gameserver/model/item/kind/Item
   #74 = Utf8               ext/mods/gameserver/model/item/kind/Item
   #75 = Fieldref           #45.#76       // ext/mods/gameserver/network/SystemMessageId.SPIRITSHOTS_GRADE_MISMATCH:Lext/mods/gameserver/network/SystemMessageId;
   #76 = NameAndType        #77:#49       // SPIRITSHOTS_GRADE_MISMATCH:Lext/mods/gameserver/network/SystemMessageId;
   #77 = Utf8               SPIRITSHOTS_GRADE_MISMATCH
   #78 = Fieldref           #79.#80       // ext/mods/Config.INFINITY_SS:Z
   #79 = Class              #81           // ext/mods/Config
   #80 = NameAndType        #82:#83       // INFINITY_SS:Z
   #81 = Utf8               ext/mods/Config
   #82 = Utf8               INFINITY_SS
   #83 = Utf8               Z
   #84 = Fieldref           #79.#85       // ext/mods/Config.INFINITY_SS_PREMIUM_ONLY:Z
   #85 = NameAndType        #86:#83       // INFINITY_SS_PREMIUM_ONLY:Z
   #86 = Utf8               INFINITY_SS_PREMIUM_ONLY
   #87 = Methodref          #7.#88        // ext/mods/gameserver/model/actor/Player.getPremiumService:()I
   #88 = NameAndType        #89:#22       // getPremiumService:()I
   #89 = Utf8               getPremiumService
   #90 = Methodref          #28.#91       // ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
   #91 = NameAndType        #92:#22       // getObjectId:()I
   #92 = Utf8               getObjectId
   #93 = Methodref          #7.#94        // ext/mods/gameserver/model/actor/Player.destroyItem:(IIZ)Z
   #94 = NameAndType        #95:#96       // destroyItem:(IIZ)Z
   #95 = Utf8               destroyItem
   #96 = Utf8               (IIZ)Z
   #97 = Methodref          #7.#98        // ext/mods/gameserver/model/actor/Player.disableAutoShot:(I)Z
   #98 = NameAndType        #99:#100      // disableAutoShot:(I)Z
   #99 = Utf8               disableAutoShot
  #100 = Utf8               (I)Z
  #101 = Fieldref           #45.#102      // ext/mods/gameserver/network/SystemMessageId.NOT_ENOUGH_SPIRITSHOTS:Lext/mods/gameserver/network/SystemMessageId;
  #102 = NameAndType        #103:#49      // NOT_ENOUGH_SPIRITSHOTS:Lext/mods/gameserver/network/SystemMessageId;
  #103 = Utf8               NOT_ENOUGH_SPIRITSHOTS
  #104 = Methodref          #73.#105      // ext/mods/gameserver/model/item/kind/Item.getSkills:()[Lext/mods/gameserver/model/holder/IntIntHolder;
  #105 = NameAndType        #106:#107     // getSkills:()[Lext/mods/gameserver/model/holder/IntIntHolder;
  #106 = Utf8               getSkills
  #107 = Utf8               ()[Lext/mods/gameserver/model/holder/IntIntHolder;
  #108 = Fieldref           #45.#109      // ext/mods/gameserver/network/SystemMessageId.ENABLED_SPIRITSHOT:Lext/mods/gameserver/network/SystemMessageId;
  #109 = NameAndType        #110:#49      // ENABLED_SPIRITSHOT:Lext/mods/gameserver/network/SystemMessageId;
  #110 = Utf8               ENABLED_SPIRITSHOT
  #111 = Methodref          #7.#112       // ext/mods/gameserver/model/actor/Player.setChargedShot:(Lext/mods/gameserver/enums/items/ShotType;Z)V
  #112 = NameAndType        #113:#114     // setChargedShot:(Lext/mods/gameserver/enums/items/ShotType;Z)V
  #113 = Utf8               setChargedShot
  #114 = Utf8               (Lext/mods/gameserver/enums/items/ShotType;Z)V
  #115 = Class              #116          // ext/mods/gameserver/network/serverpackets/MagicSkillUse
  #116 = Utf8               ext/mods/gameserver/network/serverpackets/MagicSkillUse
  #117 = Methodref          #118.#119     // ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
  #118 = Class              #120          // ext/mods/gameserver/model/holder/IntIntHolder
  #119 = NameAndType        #121:#22      // getId:()I
  #120 = Utf8               ext/mods/gameserver/model/holder/IntIntHolder
  #121 = Utf8               getId
  #122 = Methodref          #115.#123     // ext/mods/gameserver/network/serverpackets/MagicSkillUse."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
  #123 = NameAndType        #5:#124       // "<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
  #124 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
  #125 = Methodref          #7.#126       // ext/mods/gameserver/model/actor/Player.broadcastPacketInRadius:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;I)V
  #126 = NameAndType        #127:#128     // broadcastPacketInRadius:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;I)V
  #127 = Utf8               broadcastPacketInRadius
  #128 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;I)V
  #129 = Class              #130          // ext/mods/gameserver/handler/itemhandlers/BlessedSpiritShots
  #130 = Utf8               ext/mods/gameserver/handler/itemhandlers/BlessedSpiritShots
  #131 = Class              #132          // ext/mods/gameserver/handler/IItemHandler
  #132 = Utf8               ext/mods/gameserver/handler/IItemHandler
  #133 = Utf8               Code
  #134 = Utf8               LineNumberTable
  #135 = Utf8               LocalVariableTable
  #136 = Utf8               this
  #137 = Utf8               Lext/mods/gameserver/handler/itemhandlers/BlessedSpiritShots;
  #138 = Utf8               useItem
  #139 = Utf8               (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
  #140 = Utf8               playable
  #141 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #142 = Utf8               item
  #143 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #144 = Utf8               forceUse
  #145 = Utf8               player
  #146 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #147 = Utf8               weaponInst
  #148 = Utf8               weaponItem
  #149 = Utf8               Lext/mods/gameserver/model/item/kind/Weapon;
  #150 = Utf8               infinitySS
  #151 = Utf8               skills
  #152 = Utf8               [Lext/mods/gameserver/model/holder/IntIntHolder;
  #153 = Utf8               StackMapTable
  #154 = Utf8               SourceFile
  #155 = Utf8               BlessedSpiritShots.java
{
  public ext.mods.gameserver.handler.itemhandlers.BlessedSpiritShots();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 31: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/itemhandlers/BlessedSpiritShots;

  public void useItem(ext.mods.gameserver.model.actor.Playable, ext.mods.gameserver.model.item.instance.ItemInstance, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=9, locals=9, args_size=4
         0: aload_1
         1: instanceof    #7                  // class ext/mods/gameserver/model/actor/Player
         4: ifne          8
         7: return
         8: aload_1
         9: checkcast     #7                  // class ext/mods/gameserver/model/actor/Player
        12: astore        4
        14: aload         4
        16: invokevirtual #9                  // Method ext/mods/gameserver/model/actor/Player.getActiveWeaponInstance:()Lext/mods/gameserver/model/item/instance/ItemInstance;
        19: astore        5
        21: aload         4
        23: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Player.getActiveWeaponItem:()Lext/mods/gameserver/model/item/kind/Weapon;
        26: astore        6
        28: aload         5
        30: ifnull        46
        33: aload         6
        35: ifnull        46
        38: aload         6
        40: invokevirtual #17                 // Method ext/mods/gameserver/model/item/kind/Weapon.getSpiritShotCount:()I
        43: ifne          75
        46: aload         4
        48: invokevirtual #23                 // Method ext/mods/gameserver/model/actor/Player.getAutoSoulShot:()Ljava/util/Set;
        51: aload_2
        52: invokevirtual #27                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
        55: invokestatic  #32                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        58: invokeinterface #38,  2           // InterfaceMethod java/util/Set.contains:(Ljava/lang/Object;)Z
        63: ifne          74
        66: aload         4
        68: getstatic     #44                 // Field ext/mods/gameserver/network/SystemMessageId.CANNOT_USE_SPIRITSHOTS:Lext/mods/gameserver/network/SystemMessageId;
        71: invokevirtual #50                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        74: return
        75: aload         4
        77: getstatic     #54                 // Field ext/mods/gameserver/enums/items/ShotType.BLESSED_SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
        80: invokevirtual #60                 // Method ext/mods/gameserver/model/actor/Player.isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
        83: ifeq          87
        86: return
        87: aload         6
        89: invokevirtual #64                 // Method ext/mods/gameserver/model/item/kind/Weapon.getCrystalType:()Lext/mods/gameserver/enums/items/CrystalType;
        92: aload_2
        93: invokevirtual #68                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
        96: invokevirtual #72                 // Method ext/mods/gameserver/model/item/kind/Item.getCrystalType:()Lext/mods/gameserver/enums/items/CrystalType;
        99: if_acmpeq     131
       102: aload         4
       104: invokevirtual #23                 // Method ext/mods/gameserver/model/actor/Player.getAutoSoulShot:()Ljava/util/Set;
       107: aload_2
       108: invokevirtual #27                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
       111: invokestatic  #32                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       114: invokeinterface #38,  2           // InterfaceMethod java/util/Set.contains:(Ljava/lang/Object;)Z
       119: ifne          130
       122: aload         4
       124: getstatic     #75                 // Field ext/mods/gameserver/network/SystemMessageId.SPIRITSHOTS_GRADE_MISMATCH:Lext/mods/gameserver/network/SystemMessageId;
       127: invokevirtual #50                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       130: return
       131: getstatic     #78                 // Field ext/mods/Config.INFINITY_SS:Z
       134: ifeq          155
       137: getstatic     #84                 // Field ext/mods/Config.INFINITY_SS_PREMIUM_ONLY:Z
       140: ifeq          151
       143: aload         4
       145: invokevirtual #87                 // Method ext/mods/gameserver/model/actor/Player.getPremiumService:()I
       148: ifle          155
       151: iconst_1
       152: goto          156
       155: iconst_0
       156: istore        7
       158: iload         7
       160: ifne          202
       163: aload         4
       165: aload_2
       166: invokevirtual #90                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
       169: aload         6
       171: invokevirtual #17                 // Method ext/mods/gameserver/model/item/kind/Weapon.getSpiritShotCount:()I
       174: iconst_0
       175: invokevirtual #93                 // Method ext/mods/gameserver/model/actor/Player.destroyItem:(IIZ)Z
       178: ifne          202
       181: aload         4
       183: aload_2
       184: invokevirtual #27                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
       187: invokevirtual #97                 // Method ext/mods/gameserver/model/actor/Player.disableAutoShot:(I)Z
       190: ifne          201
       193: aload         4
       195: getstatic     #101                // Field ext/mods/gameserver/network/SystemMessageId.NOT_ENOUGH_SPIRITSHOTS:Lext/mods/gameserver/network/SystemMessageId;
       198: invokevirtual #50                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       201: return
       202: aload_2
       203: invokevirtual #68                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
       206: invokevirtual #104                // Method ext/mods/gameserver/model/item/kind/Item.getSkills:()[Lext/mods/gameserver/model/holder/IntIntHolder;
       209: astore        8
       211: aload         4
       213: getstatic     #108                // Field ext/mods/gameserver/network/SystemMessageId.ENABLED_SPIRITSHOT:Lext/mods/gameserver/network/SystemMessageId;
       216: invokevirtual #50                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       219: aload         4
       221: getstatic     #54                 // Field ext/mods/gameserver/enums/items/ShotType.BLESSED_SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
       224: iconst_1
       225: invokevirtual #111                // Method ext/mods/gameserver/model/actor/Player.setChargedShot:(Lext/mods/gameserver/enums/items/ShotType;Z)V
       228: aload         4
       230: new           #115                // class ext/mods/gameserver/network/serverpackets/MagicSkillUse
       233: dup
       234: aload         4
       236: aload         4
       238: aload         8
       240: iconst_0
       241: aaload
       242: invokevirtual #117                // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
       245: iconst_1
       246: iconst_0
       247: iconst_0
       248: invokespecial #122                // Method ext/mods/gameserver/network/serverpackets/MagicSkillUse."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
       251: sipush        600
       254: invokevirtual #125                // Method ext/mods/gameserver/model/actor/Player.broadcastPacketInRadius:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;I)V
       257: return
      LineNumberTable:
        line 36: 0
        line 37: 7
        line 39: 8
        line 40: 14
        line 41: 21
        line 43: 28
        line 45: 46
        line 46: 66
        line 48: 74
        line 51: 75
        line 52: 86
        line 54: 87
        line 56: 102
        line 57: 122
        line 59: 130
        line 62: 131
        line 63: 158
        line 65: 181
        line 66: 193
        line 68: 201
        line 71: 202
        line 73: 211
        line 74: 219
        line 75: 228
        line 76: 257
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     258     0  this   Lext/mods/gameserver/handler/itemhandlers/BlessedSpiritShots;
            0     258     1 playable   Lext/mods/gameserver/model/actor/Playable;
            0     258     2  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0     258     3 forceUse   Z
           14     244     4 player   Lext/mods/gameserver/model/actor/Player;
           21     237     5 weaponInst   Lext/mods/gameserver/model/item/instance/ItemInstance;
           28     230     6 weaponItem   Lext/mods/gameserver/model/item/kind/Weapon;
          158     100     7 infinitySS   Z
          211      47     8 skills   [Lext/mods/gameserver/model/holder/IntIntHolder;
      StackMapTable: number_of_entries = 12
        frame_type = 8 /* same */
        frame_type = 254 /* append */
          offset_delta = 37
          locals = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/model/item/kind/Weapon ]
        frame_type = 27 /* same */
        frame_type = 0 /* same */
        frame_type = 11 /* same */
        frame_type = 42 /* same */
        frame_type = 0 /* same */
        frame_type = 19 /* same */
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 44
          locals = [ int ]
        frame_type = 0 /* same */
}
SourceFile: "BlessedSpiritShots.java"
