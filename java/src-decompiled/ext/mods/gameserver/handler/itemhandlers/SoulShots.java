// Bytecode for: ext.mods.gameserver.handler.itemhandlers.SoulShots
// File: ext\mods\gameserver\handler\itemhandlers\SoulShots.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/itemhandlers/SoulShots.class
  Last modified 9 de jul de 2026; size 3511 bytes
  MD5 checksum 67a0a7838f8802f1c21328a7f47a604a
  Compiled from "SoulShots.java"
public class ext.mods.gameserver.handler.itemhandlers.SoulShots implements ext.mods.gameserver.handler.IItemHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #141                        // ext/mods/gameserver/handler/itemhandlers/SoulShots
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
   #17 = Methodref          #18.#19       // ext/mods/gameserver/model/item/kind/Weapon.getSoulShotCount:()I
   #18 = Class              #20           // ext/mods/gameserver/model/item/kind/Weapon
   #19 = NameAndType        #21:#22       // getSoulShotCount:()I
   #20 = Utf8               ext/mods/gameserver/model/item/kind/Weapon
   #21 = Utf8               getSoulShotCount
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
   #44 = Fieldref           #45.#46       // ext/mods/gameserver/network/SystemMessageId.CANNOT_USE_SOULSHOTS:Lext/mods/gameserver/network/SystemMessageId;
   #45 = Class              #47           // ext/mods/gameserver/network/SystemMessageId
   #46 = NameAndType        #48:#49       // CANNOT_USE_SOULSHOTS:Lext/mods/gameserver/network/SystemMessageId;
   #47 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #48 = Utf8               CANNOT_USE_SOULSHOTS
   #49 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #50 = Methodref          #7.#51        // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #51 = NameAndType        #52:#53       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #52 = Utf8               sendPacket
   #53 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #54 = Methodref          #18.#55       // ext/mods/gameserver/model/item/kind/Weapon.getCrystalType:()Lext/mods/gameserver/enums/items/CrystalType;
   #55 = NameAndType        #56:#57       // getCrystalType:()Lext/mods/gameserver/enums/items/CrystalType;
   #56 = Utf8               getCrystalType
   #57 = Utf8               ()Lext/mods/gameserver/enums/items/CrystalType;
   #58 = Methodref          #28.#59       // ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
   #59 = NameAndType        #60:#61       // getItem:()Lext/mods/gameserver/model/item/kind/Item;
   #60 = Utf8               getItem
   #61 = Utf8               ()Lext/mods/gameserver/model/item/kind/Item;
   #62 = Methodref          #63.#55       // ext/mods/gameserver/model/item/kind/Item.getCrystalType:()Lext/mods/gameserver/enums/items/CrystalType;
   #63 = Class              #64           // ext/mods/gameserver/model/item/kind/Item
   #64 = Utf8               ext/mods/gameserver/model/item/kind/Item
   #65 = Fieldref           #45.#66       // ext/mods/gameserver/network/SystemMessageId.SOULSHOTS_GRADE_MISMATCH:Lext/mods/gameserver/network/SystemMessageId;
   #66 = NameAndType        #67:#49       // SOULSHOTS_GRADE_MISMATCH:Lext/mods/gameserver/network/SystemMessageId;
   #67 = Utf8               SOULSHOTS_GRADE_MISMATCH
   #68 = Fieldref           #69.#70       // ext/mods/gameserver/enums/items/ShotType.SOULSHOT:Lext/mods/gameserver/enums/items/ShotType;
   #69 = Class              #71           // ext/mods/gameserver/enums/items/ShotType
   #70 = NameAndType        #72:#73       // SOULSHOT:Lext/mods/gameserver/enums/items/ShotType;
   #71 = Utf8               ext/mods/gameserver/enums/items/ShotType
   #72 = Utf8               SOULSHOT
   #73 = Utf8               Lext/mods/gameserver/enums/items/ShotType;
   #74 = Methodref          #7.#75        // ext/mods/gameserver/model/actor/Player.isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
   #75 = NameAndType        #76:#77       // isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
   #76 = Utf8               isChargedShot
   #77 = Utf8               (Lext/mods/gameserver/enums/items/ShotType;)Z
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
   #90 = Methodref          #18.#91       // ext/mods/gameserver/model/item/kind/Weapon.getReducedSoulShot:()I
   #91 = NameAndType        #92:#22       // getReducedSoulShot:()I
   #92 = Utf8               getReducedSoulShot
   #93 = Methodref          #94.#95       // ext/mods/commons/random/Rnd.get:(I)I
   #94 = Class              #96           // ext/mods/commons/random/Rnd
   #95 = NameAndType        #97:#98       // get:(I)I
   #96 = Utf8               ext/mods/commons/random/Rnd
   #97 = Utf8               get
   #98 = Utf8               (I)I
   #99 = Methodref          #18.#100      // ext/mods/gameserver/model/item/kind/Weapon.getReducedSoulShotChance:()I
  #100 = NameAndType        #101:#22      // getReducedSoulShotChance:()I
  #101 = Utf8               getReducedSoulShotChance
  #102 = Methodref          #28.#103      // ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
  #103 = NameAndType        #104:#22      // getObjectId:()I
  #104 = Utf8               getObjectId
  #105 = Methodref          #7.#106       // ext/mods/gameserver/model/actor/Player.destroyItem:(IIZ)Z
  #106 = NameAndType        #107:#108     // destroyItem:(IIZ)Z
  #107 = Utf8               destroyItem
  #108 = Utf8               (IIZ)Z
  #109 = Methodref          #7.#110       // ext/mods/gameserver/model/actor/Player.disableAutoShot:(I)Z
  #110 = NameAndType        #111:#112     // disableAutoShot:(I)Z
  #111 = Utf8               disableAutoShot
  #112 = Utf8               (I)Z
  #113 = Fieldref           #45.#114      // ext/mods/gameserver/network/SystemMessageId.NOT_ENOUGH_SOULSHOTS:Lext/mods/gameserver/network/SystemMessageId;
  #114 = NameAndType        #115:#49      // NOT_ENOUGH_SOULSHOTS:Lext/mods/gameserver/network/SystemMessageId;
  #115 = Utf8               NOT_ENOUGH_SOULSHOTS
  #116 = Methodref          #63.#117      // ext/mods/gameserver/model/item/kind/Item.getSkills:()[Lext/mods/gameserver/model/holder/IntIntHolder;
  #117 = NameAndType        #118:#119     // getSkills:()[Lext/mods/gameserver/model/holder/IntIntHolder;
  #118 = Utf8               getSkills
  #119 = Utf8               ()[Lext/mods/gameserver/model/holder/IntIntHolder;
  #120 = Methodref          #28.#121      // ext/mods/gameserver/model/item/instance/ItemInstance.setChargedShot:(Lext/mods/gameserver/enums/items/ShotType;Z)V
  #121 = NameAndType        #122:#123     // setChargedShot:(Lext/mods/gameserver/enums/items/ShotType;Z)V
  #122 = Utf8               setChargedShot
  #123 = Utf8               (Lext/mods/gameserver/enums/items/ShotType;Z)V
  #124 = Fieldref           #45.#125      // ext/mods/gameserver/network/SystemMessageId.ENABLED_SOULSHOT:Lext/mods/gameserver/network/SystemMessageId;
  #125 = NameAndType        #126:#49      // ENABLED_SOULSHOT:Lext/mods/gameserver/network/SystemMessageId;
  #126 = Utf8               ENABLED_SOULSHOT
  #127 = Class              #128          // ext/mods/gameserver/network/serverpackets/MagicSkillUse
  #128 = Utf8               ext/mods/gameserver/network/serverpackets/MagicSkillUse
  #129 = Methodref          #130.#131     // ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
  #130 = Class              #132          // ext/mods/gameserver/model/holder/IntIntHolder
  #131 = NameAndType        #133:#22      // getId:()I
  #132 = Utf8               ext/mods/gameserver/model/holder/IntIntHolder
  #133 = Utf8               getId
  #134 = Methodref          #127.#135     // ext/mods/gameserver/network/serverpackets/MagicSkillUse."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
  #135 = NameAndType        #5:#136       // "<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
  #136 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
  #137 = Methodref          #7.#138       // ext/mods/gameserver/model/actor/Player.broadcastPacketInRadius:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;I)V
  #138 = NameAndType        #139:#140     // broadcastPacketInRadius:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;I)V
  #139 = Utf8               broadcastPacketInRadius
  #140 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;I)V
  #141 = Class              #142          // ext/mods/gameserver/handler/itemhandlers/SoulShots
  #142 = Utf8               ext/mods/gameserver/handler/itemhandlers/SoulShots
  #143 = Class              #144          // ext/mods/gameserver/handler/IItemHandler
  #144 = Utf8               ext/mods/gameserver/handler/IItemHandler
  #145 = Utf8               Code
  #146 = Utf8               LineNumberTable
  #147 = Utf8               LocalVariableTable
  #148 = Utf8               this
  #149 = Utf8               Lext/mods/gameserver/handler/itemhandlers/SoulShots;
  #150 = Utf8               useItem
  #151 = Utf8               (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
  #152 = Utf8               player
  #153 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #154 = Utf8               playable
  #155 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #156 = Utf8               item
  #157 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #158 = Utf8               forceUse
  #159 = Utf8               weaponInst
  #160 = Utf8               weaponItem
  #161 = Utf8               Lext/mods/gameserver/model/item/kind/Weapon;
  #162 = Utf8               infinitySS
  #163 = Utf8               ssCount
  #164 = Utf8               I
  #165 = Utf8               skills
  #166 = Utf8               [Lext/mods/gameserver/model/holder/IntIntHolder;
  #167 = Utf8               StackMapTable
  #168 = Utf8               SourceFile
  #169 = Utf8               SoulShots.java
{
  public ext.mods.gameserver.handler.itemhandlers.SoulShots();
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
            0       5     0  this   Lext/mods/gameserver/handler/itemhandlers/SoulShots;

  public void useItem(ext.mods.gameserver.model.actor.Playable, ext.mods.gameserver.model.item.instance.ItemInstance, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=9, locals=10, args_size=4
         0: aload_1
         1: instanceof    #7                  // class ext/mods/gameserver/model/actor/Player
         4: ifeq          16
         7: aload_1
         8: checkcast     #7                  // class ext/mods/gameserver/model/actor/Player
        11: astore        4
        13: goto          17
        16: return
        17: aload         4
        19: invokevirtual #9                  // Method ext/mods/gameserver/model/actor/Player.getActiveWeaponInstance:()Lext/mods/gameserver/model/item/instance/ItemInstance;
        22: astore        5
        24: aload         4
        26: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Player.getActiveWeaponItem:()Lext/mods/gameserver/model/item/kind/Weapon;
        29: astore        6
        31: aload         5
        33: ifnull        44
        36: aload         6
        38: invokevirtual #17                 // Method ext/mods/gameserver/model/item/kind/Weapon.getSoulShotCount:()I
        41: ifne          73
        44: aload         4
        46: invokevirtual #23                 // Method ext/mods/gameserver/model/actor/Player.getAutoSoulShot:()Ljava/util/Set;
        49: aload_2
        50: invokevirtual #27                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
        53: invokestatic  #32                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        56: invokeinterface #38,  2           // InterfaceMethod java/util/Set.contains:(Ljava/lang/Object;)Z
        61: ifne          72
        64: aload         4
        66: getstatic     #44                 // Field ext/mods/gameserver/network/SystemMessageId.CANNOT_USE_SOULSHOTS:Lext/mods/gameserver/network/SystemMessageId;
        69: invokevirtual #50                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        72: return
        73: aload         6
        75: invokevirtual #54                 // Method ext/mods/gameserver/model/item/kind/Weapon.getCrystalType:()Lext/mods/gameserver/enums/items/CrystalType;
        78: aload_2
        79: invokevirtual #58                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
        82: invokevirtual #62                 // Method ext/mods/gameserver/model/item/kind/Item.getCrystalType:()Lext/mods/gameserver/enums/items/CrystalType;
        85: if_acmpeq     117
        88: aload         4
        90: invokevirtual #23                 // Method ext/mods/gameserver/model/actor/Player.getAutoSoulShot:()Ljava/util/Set;
        93: aload_2
        94: invokevirtual #27                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
        97: invokestatic  #32                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       100: invokeinterface #38,  2           // InterfaceMethod java/util/Set.contains:(Ljava/lang/Object;)Z
       105: ifne          116
       108: aload         4
       110: getstatic     #65                 // Field ext/mods/gameserver/network/SystemMessageId.SOULSHOTS_GRADE_MISMATCH:Lext/mods/gameserver/network/SystemMessageId;
       113: invokevirtual #50                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       116: return
       117: aload         4
       119: getstatic     #68                 // Field ext/mods/gameserver/enums/items/ShotType.SOULSHOT:Lext/mods/gameserver/enums/items/ShotType;
       122: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Player.isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
       125: ifeq          129
       128: return
       129: getstatic     #78                 // Field ext/mods/Config.INFINITY_SS:Z
       132: ifeq          153
       135: getstatic     #84                 // Field ext/mods/Config.INFINITY_SS_PREMIUM_ONLY:Z
       138: ifeq          149
       141: aload         4
       143: invokevirtual #87                 // Method ext/mods/gameserver/model/actor/Player.getPremiumService:()I
       146: ifle          153
       149: iconst_1
       150: goto          154
       153: iconst_0
       154: istore        7
       156: aload         6
       158: invokevirtual #17                 // Method ext/mods/gameserver/model/item/kind/Weapon.getSoulShotCount:()I
       161: istore        8
       163: aload         6
       165: invokevirtual #90                 // Method ext/mods/gameserver/model/item/kind/Weapon.getReducedSoulShot:()I
       168: ifle          191
       171: bipush        100
       173: invokestatic  #93                 // Method ext/mods/commons/random/Rnd.get:(I)I
       176: aload         6
       178: invokevirtual #99                 // Method ext/mods/gameserver/model/item/kind/Weapon.getReducedSoulShotChance:()I
       181: if_icmpge     191
       184: aload         6
       186: invokevirtual #90                 // Method ext/mods/gameserver/model/item/kind/Weapon.getReducedSoulShot:()I
       189: istore        8
       191: iload         7
       193: ifne          232
       196: aload         4
       198: aload_2
       199: invokevirtual #102                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
       202: iload         8
       204: iconst_0
       205: invokevirtual #105                // Method ext/mods/gameserver/model/actor/Player.destroyItem:(IIZ)Z
       208: ifne          232
       211: aload         4
       213: aload_2
       214: invokevirtual #27                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
       217: invokevirtual #109                // Method ext/mods/gameserver/model/actor/Player.disableAutoShot:(I)Z
       220: ifne          231
       223: aload         4
       225: getstatic     #113                // Field ext/mods/gameserver/network/SystemMessageId.NOT_ENOUGH_SOULSHOTS:Lext/mods/gameserver/network/SystemMessageId;
       228: invokevirtual #50                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       231: return
       232: aload_2
       233: invokevirtual #58                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
       236: invokevirtual #116                // Method ext/mods/gameserver/model/item/kind/Item.getSkills:()[Lext/mods/gameserver/model/holder/IntIntHolder;
       239: astore        9
       241: aload         5
       243: getstatic     #68                 // Field ext/mods/gameserver/enums/items/ShotType.SOULSHOT:Lext/mods/gameserver/enums/items/ShotType;
       246: iconst_1
       247: invokevirtual #120                // Method ext/mods/gameserver/model/item/instance/ItemInstance.setChargedShot:(Lext/mods/gameserver/enums/items/ShotType;Z)V
       250: aload         4
       252: getstatic     #124                // Field ext/mods/gameserver/network/SystemMessageId.ENABLED_SOULSHOT:Lext/mods/gameserver/network/SystemMessageId;
       255: invokevirtual #50                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       258: aload         4
       260: new           #127                // class ext/mods/gameserver/network/serverpackets/MagicSkillUse
       263: dup
       264: aload         4
       266: aload         4
       268: aload         9
       270: iconst_0
       271: aaload
       272: invokevirtual #129                // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
       275: iconst_1
       276: iconst_0
       277: iconst_0
       278: invokespecial #134                // Method ext/mods/gameserver/network/serverpackets/MagicSkillUse."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
       281: sipush        600
       284: invokevirtual #137                // Method ext/mods/gameserver/model/actor/Player.broadcastPacketInRadius:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;I)V
       287: return
      LineNumberTable:
        line 38: 0
        line 39: 16
        line 41: 17
        line 42: 24
        line 44: 31
        line 46: 44
        line 47: 64
        line 49: 72
        line 52: 73
        line 54: 88
        line 55: 108
        line 57: 116
        line 60: 117
        line 61: 128
        line 63: 129
        line 64: 156
        line 65: 163
        line 66: 184
        line 68: 191
        line 70: 211
        line 71: 223
        line 73: 231
        line 76: 232
        line 78: 241
        line 79: 250
        line 80: 258
        line 81: 287
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           13       3     4 player   Lext/mods/gameserver/model/actor/Player;
            0     288     0  this   Lext/mods/gameserver/handler/itemhandlers/SoulShots;
            0     288     1 playable   Lext/mods/gameserver/model/actor/Playable;
            0     288     2  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0     288     3 forceUse   Z
           17     271     4 player   Lext/mods/gameserver/model/actor/Player;
           24     264     5 weaponInst   Lext/mods/gameserver/model/item/instance/ItemInstance;
           31     257     6 weaponItem   Lext/mods/gameserver/model/item/kind/Weapon;
          156     132     7 infinitySS   Z
          163     125     8 ssCount   I
          241      47     9 skills   [Lext/mods/gameserver/model/holder/IntIntHolder;
      StackMapTable: number_of_entries = 14
        frame_type = 16 /* same */
        frame_type = 252 /* append */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 253 /* append */
          offset_delta = 26
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/model/item/kind/Weapon ]
        frame_type = 27 /* same */
        frame_type = 0 /* same */
        frame_type = 42 /* same */
        frame_type = 0 /* same */
        frame_type = 11 /* same */
        frame_type = 19 /* same */
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 253 /* append */
          offset_delta = 36
          locals = [ int, int ]
        frame_type = 39 /* same */
        frame_type = 0 /* same */
}
SourceFile: "SoulShots.java"
