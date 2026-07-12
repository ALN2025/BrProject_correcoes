// Bytecode for: ext.mods.gameserver.network.clientpackets.AbstractRefinePacket
// File: ext\mods\gameserver\network\clientpackets\AbstractRefinePacket.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/network/clientpackets/AbstractRefinePacket.class
  Last modified 9 de jul de 2026; size 5511 bytes
  MD5 checksum c97272a25ef8faa542c781d4eb0b4ef7
  Compiled from "AbstractRefinePacket.java"
public abstract class ext.mods.gameserver.network.clientpackets.AbstractRefinePacket extends ext.mods.gameserver.network.clientpackets.L2GameClientPacket
  minor version: 0
  major version: 69
  flags: (0x0421) ACC_PUBLIC, ACC_SUPER, ACC_ABSTRACT
  this_class: #8                          // ext/mods/gameserver/network/clientpackets/AbstractRefinePacket
  super_class: #2                         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
  interfaces: 0, fields: 5, methods: 7, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
    #2 = Class              #4            // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               ext/mods/gameserver/network/clientpackets/L2GameClientPacket
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/network/clientpackets/AbstractRefinePacket._lifeStones:Ljava/util/Map;
    #8 = Class              #10           // ext/mods/gameserver/network/clientpackets/AbstractRefinePacket
    #9 = NameAndType        #11:#12       // _lifeStones:Ljava/util/Map;
   #10 = Utf8               ext/mods/gameserver/network/clientpackets/AbstractRefinePacket
   #11 = Utf8               _lifeStones
   #12 = Utf8               Ljava/util/Map;
   #13 = Methodref          #14.#15       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #14 = Class              #16           // java/lang/Integer
   #15 = NameAndType        #17:#18       // valueOf:(I)Ljava/lang/Integer;
   #16 = Utf8               java/lang/Integer
   #17 = Utf8               valueOf
   #18 = Utf8               (I)Ljava/lang/Integer;
   #19 = InterfaceMethodref #20.#21       // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
   #20 = Class              #22           // java/util/Map
   #21 = NameAndType        #23:#24       // get:(Ljava/lang/Object;)Ljava/lang/Object;
   #22 = Utf8               java/util/Map
   #23 = Utf8               get
   #24 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #25 = Class              #26           // ext/mods/gameserver/model/item/LifeStone
   #26 = Utf8               ext/mods/gameserver/model/item/LifeStone
   #27 = Methodref          #8.#28        // ext/mods/gameserver/network/clientpackets/AbstractRefinePacket.isValid:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
   #28 = NameAndType        #29:#30       // isValid:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
   #29 = Utf8               isValid
   #30 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
   #31 = Methodref          #32.#33       // ext/mods/gameserver/model/item/instance/ItemInstance.getOwnerId:()I
   #32 = Class              #34           // ext/mods/gameserver/model/item/instance/ItemInstance
   #33 = NameAndType        #35:#36       // getOwnerId:()I
   #34 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
   #35 = Utf8               getOwnerId
   #36 = Utf8               ()I
   #37 = Methodref          #38.#39       // ext/mods/gameserver/model/actor/Player.getObjectId:()I
   #38 = Class              #40           // ext/mods/gameserver/model/actor/Player
   #39 = NameAndType        #41:#36       // getObjectId:()I
   #40 = Utf8               ext/mods/gameserver/model/actor/Player
   #41 = Utf8               getObjectId
   #42 = Methodref          #32.#43       // ext/mods/gameserver/model/item/instance/ItemInstance.getLocation:()Lext/mods/gameserver/enums/items/ItemLocation;
   #43 = NameAndType        #44:#45       // getLocation:()Lext/mods/gameserver/enums/items/ItemLocation;
   #44 = Utf8               getLocation
   #45 = Utf8               ()Lext/mods/gameserver/enums/items/ItemLocation;
   #46 = Fieldref           #47.#48       // ext/mods/gameserver/enums/items/ItemLocation.INVENTORY:Lext/mods/gameserver/enums/items/ItemLocation;
   #47 = Class              #49           // ext/mods/gameserver/enums/items/ItemLocation
   #48 = NameAndType        #50:#51       // INVENTORY:Lext/mods/gameserver/enums/items/ItemLocation;
   #49 = Utf8               ext/mods/gameserver/enums/items/ItemLocation
   #50 = Utf8               INVENTORY
   #51 = Utf8               Lext/mods/gameserver/enums/items/ItemLocation;
   #52 = Methodref          #32.#53       // ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
   #53 = NameAndType        #54:#55       // getItem:()Lext/mods/gameserver/model/item/kind/Item;
   #54 = Utf8               getItem
   #55 = Utf8               ()Lext/mods/gameserver/model/item/kind/Item;
   #56 = Methodref          #57.#58       // ext/mods/gameserver/model/item/kind/Item.getCrystalType:()Lext/mods/gameserver/enums/items/CrystalType;
   #57 = Class              #59           // ext/mods/gameserver/model/item/kind/Item
   #58 = NameAndType        #60:#61       // getCrystalType:()Lext/mods/gameserver/enums/items/CrystalType;
   #59 = Utf8               ext/mods/gameserver/model/item/kind/Item
   #60 = Utf8               getCrystalType
   #61 = Utf8               ()Lext/mods/gameserver/enums/items/CrystalType;
   #62 = Methodref          #63.#64       // ext/mods/gameserver/enums/items/CrystalType.getGemstoneId:()I
   #63 = Class              #65           // ext/mods/gameserver/enums/items/CrystalType
   #64 = NameAndType        #66:#36       // getGemstoneId:()I
   #65 = Utf8               ext/mods/gameserver/enums/items/CrystalType
   #66 = Utf8               getGemstoneId
   #67 = Methodref          #32.#68       // ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
   #68 = NameAndType        #69:#36       // getItemId:()I
   #69 = Utf8               getItemId
   #70 = Methodref          #32.#71       // ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
   #71 = NameAndType        #72:#36       // getCount:()I
   #72 = Utf8               getCount
   #73 = Methodref          #63.#74       // ext/mods/gameserver/enums/items/CrystalType.getGemstoneCount:()I
   #74 = NameAndType        #75:#36       // getGemstoneCount:()I
   #75 = Utf8               getGemstoneCount
   #76 = Methodref          #8.#77        // ext/mods/gameserver/network/clientpackets/AbstractRefinePacket.isValid:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
   #77 = NameAndType        #29:#78       // isValid:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
   #78 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
   #79 = Methodref          #38.#80       // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #80 = NameAndType        #81:#82       // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #81 = Utf8               getStatus
   #82 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #83 = Methodref          #84.#85       // ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
   #84 = Class              #86           // ext/mods/gameserver/model/actor/status/PlayerStatus
   #85 = NameAndType        #87:#36       // getLevel:()I
   #86 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
   #87 = Utf8               getLevel
   #88 = Methodref          #25.#89       // ext/mods/gameserver/model/item/LifeStone.getPlayerLevel:()I
   #89 = NameAndType        #90:#36       // getPlayerLevel:()I
   #90 = Utf8               getPlayerLevel
   #91 = Fieldref           #92.#93       // ext/mods/gameserver/network/SystemMessageId.HARDENER_LEVEL_TOO_HIGH:Lext/mods/gameserver/network/SystemMessageId;
   #92 = Class              #94           // ext/mods/gameserver/network/SystemMessageId
   #93 = NameAndType        #95:#96       // HARDENER_LEVEL_TOO_HIGH:Lext/mods/gameserver/network/SystemMessageId;
   #94 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #95 = Utf8               HARDENER_LEVEL_TOO_HIGH
   #96 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #97 = Methodref          #38.#98       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #98 = NameAndType        #99:#100      // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #99 = Utf8               sendPacket
  #100 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #101 = Methodref          #8.#102       // ext/mods/gameserver/network/clientpackets/AbstractRefinePacket.isValid:(Lext/mods/gameserver/model/actor/Player;)Z
  #102 = NameAndType        #29:#103      // isValid:(Lext/mods/gameserver/model/actor/Player;)Z
  #103 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
  #104 = Methodref          #32.#105      // ext/mods/gameserver/model/item/instance/ItemInstance.isAugmented:()Z
  #105 = NameAndType        #106:#107     // isAugmented:()Z
  #106 = Utf8               isAugmented
  #107 = Utf8               ()Z
  #108 = Methodref          #32.#109      // ext/mods/gameserver/model/item/instance/ItemInstance.isHeroItem:()Z
  #109 = NameAndType        #110:#107     // isHeroItem:()Z
  #110 = Utf8               isHeroItem
  #111 = Methodref          #32.#112      // ext/mods/gameserver/model/item/instance/ItemInstance.isShadowItem:()Z
  #112 = NameAndType        #113:#107     // isShadowItem:()Z
  #113 = Utf8               isShadowItem
  #114 = Fieldref           #63.#115      // ext/mods/gameserver/enums/items/CrystalType.C:Lext/mods/gameserver/enums/items/CrystalType;
  #115 = NameAndType        #116:#117     // C:Lext/mods/gameserver/enums/items/CrystalType;
  #116 = Utf8               C
  #117 = Utf8               Lext/mods/gameserver/enums/items/CrystalType;
  #118 = Methodref          #63.#119      // ext/mods/gameserver/enums/items/CrystalType.isLesser:(Lext/mods/gameserver/enums/items/CrystalType;)Z
  #119 = NameAndType        #120:#121     // isLesser:(Lext/mods/gameserver/enums/items/CrystalType;)Z
  #120 = Utf8               isLesser
  #121 = Utf8               (Lext/mods/gameserver/enums/items/CrystalType;)Z
  #122 = Fieldref           #47.#123      // ext/mods/gameserver/enums/items/ItemLocation.PAPERDOLL:Lext/mods/gameserver/enums/items/ItemLocation;
  #123 = NameAndType        #124:#51      // PAPERDOLL:Lext/mods/gameserver/enums/items/ItemLocation;
  #124 = Utf8               PAPERDOLL
  #125 = Class              #126          // ext/mods/gameserver/model/item/kind/Weapon
  #126 = Utf8               ext/mods/gameserver/model/item/kind/Weapon
  #127 = Methodref          #125.#128     // ext/mods/gameserver/model/item/kind/Weapon.getItemType:()Lext/mods/gameserver/enums/items/WeaponType;
  #128 = NameAndType        #129:#130     // getItemType:()Lext/mods/gameserver/enums/items/WeaponType;
  #129 = Utf8               getItemType
  #130 = Utf8               ()Lext/mods/gameserver/enums/items/WeaponType;
  #131 = Fieldref           #132.#133     // ext/mods/gameserver/enums/items/WeaponType.NONE:Lext/mods/gameserver/enums/items/WeaponType;
  #132 = Class              #134          // ext/mods/gameserver/enums/items/WeaponType
  #133 = NameAndType        #135:#136     // NONE:Lext/mods/gameserver/enums/items/WeaponType;
  #134 = Utf8               ext/mods/gameserver/enums/items/WeaponType
  #135 = Utf8               NONE
  #136 = Utf8               Lext/mods/gameserver/enums/items/WeaponType;
  #137 = Fieldref           #132.#138     // ext/mods/gameserver/enums/items/WeaponType.FISHINGROD:Lext/mods/gameserver/enums/items/WeaponType;
  #138 = NameAndType        #139:#136     // FISHINGROD:Lext/mods/gameserver/enums/items/WeaponType;
  #139 = Utf8               FISHINGROD
  #140 = Methodref          #38.#141      // ext/mods/gameserver/model/actor/Player.isOperating:()Z
  #141 = NameAndType        #142:#107     // isOperating:()Z
  #142 = Utf8               isOperating
  #143 = Fieldref           #92.#144      // ext/mods/gameserver/network/SystemMessageId.YOU_CANNOT_AUGMENT_ITEMS_WHILE_A_PRIVATE_STORE_OR_PRIVATE_WORKSHOP_IS_IN_OPERATION:Lext/mods/gameserver/network/SystemMessageId;
  #144 = NameAndType        #145:#96      // YOU_CANNOT_AUGMENT_ITEMS_WHILE_A_PRIVATE_STORE_OR_PRIVATE_WORKSHOP_IS_IN_OPERATION:Lext/mods/gameserver/network/SystemMessageId;
  #145 = Utf8               YOU_CANNOT_AUGMENT_ITEMS_WHILE_A_PRIVATE_STORE_OR_PRIVATE_WORKSHOP_IS_IN_OPERATION
  #146 = Methodref          #38.#147      // ext/mods/gameserver/model/actor/Player.isProcessingTransaction:()Z
  #147 = NameAndType        #148:#107     // isProcessingTransaction:()Z
  #148 = Utf8               isProcessingTransaction
  #149 = Fieldref           #92.#150      // ext/mods/gameserver/network/SystemMessageId.YOU_CANNOT_AUGMENT_ITEMS_WHILE_TRADING:Lext/mods/gameserver/network/SystemMessageId;
  #150 = NameAndType        #151:#96      // YOU_CANNOT_AUGMENT_ITEMS_WHILE_TRADING:Lext/mods/gameserver/network/SystemMessageId;
  #151 = Utf8               YOU_CANNOT_AUGMENT_ITEMS_WHILE_TRADING
  #152 = Methodref          #38.#153      // ext/mods/gameserver/model/actor/Player.isDead:()Z
  #153 = NameAndType        #154:#107     // isDead:()Z
  #154 = Utf8               isDead
  #155 = Fieldref           #92.#156      // ext/mods/gameserver/network/SystemMessageId.YOU_CANNOT_AUGMENT_ITEMS_WHILE_DEAD:Lext/mods/gameserver/network/SystemMessageId;
  #156 = NameAndType        #157:#96      // YOU_CANNOT_AUGMENT_ITEMS_WHILE_DEAD:Lext/mods/gameserver/network/SystemMessageId;
  #157 = Utf8               YOU_CANNOT_AUGMENT_ITEMS_WHILE_DEAD
  #158 = Methodref          #38.#159      // ext/mods/gameserver/model/actor/Player.isParalyzed:()Z
  #159 = NameAndType        #160:#107     // isParalyzed:()Z
  #160 = Utf8               isParalyzed
  #161 = Fieldref           #92.#162      // ext/mods/gameserver/network/SystemMessageId.YOU_CANNOT_AUGMENT_ITEMS_WHILE_PARALYZED:Lext/mods/gameserver/network/SystemMessageId;
  #162 = NameAndType        #163:#96      // YOU_CANNOT_AUGMENT_ITEMS_WHILE_PARALYZED:Lext/mods/gameserver/network/SystemMessageId;
  #163 = Utf8               YOU_CANNOT_AUGMENT_ITEMS_WHILE_PARALYZED
  #164 = Methodref          #38.#165      // ext/mods/gameserver/model/actor/Player.isFishing:()Z
  #165 = NameAndType        #166:#107     // isFishing:()Z
  #166 = Utf8               isFishing
  #167 = Fieldref           #92.#168      // ext/mods/gameserver/network/SystemMessageId.YOU_CANNOT_AUGMENT_ITEMS_WHILE_FISHING:Lext/mods/gameserver/network/SystemMessageId;
  #168 = NameAndType        #169:#96      // YOU_CANNOT_AUGMENT_ITEMS_WHILE_FISHING:Lext/mods/gameserver/network/SystemMessageId;
  #169 = Utf8               YOU_CANNOT_AUGMENT_ITEMS_WHILE_FISHING
  #170 = Methodref          #38.#171      // ext/mods/gameserver/model/actor/Player.isSitting:()Z
  #171 = NameAndType        #172:#107     // isSitting:()Z
  #172 = Utf8               isSitting
  #173 = Fieldref           #92.#174      // ext/mods/gameserver/network/SystemMessageId.YOU_CANNOT_AUGMENT_ITEMS_WHILE_SITTING_DOWN:Lext/mods/gameserver/network/SystemMessageId;
  #174 = NameAndType        #175:#96      // YOU_CANNOT_AUGMENT_ITEMS_WHILE_SITTING_DOWN:Lext/mods/gameserver/network/SystemMessageId;
  #175 = Utf8               YOU_CANNOT_AUGMENT_ITEMS_WHILE_SITTING_DOWN
  #176 = Methodref          #38.#177      // ext/mods/gameserver/model/actor/Player.isCursedWeaponEquipped:()Z
  #177 = NameAndType        #178:#107     // isCursedWeaponEquipped:()Z
  #178 = Utf8               isCursedWeaponEquipped
  #179 = Class              #180          // java/util/HashMap
  #180 = Utf8               java/util/HashMap
  #181 = Methodref          #179.#3       // java/util/HashMap."<init>":()V
  #182 = Methodref          #25.#183      // ext/mods/gameserver/model/item/LifeStone."<init>":(II)V
  #183 = NameAndType        #5:#184       // "<init>":(II)V
  #184 = Utf8               (II)V
  #185 = InterfaceMethodref #20.#186      // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #186 = NameAndType        #187:#188     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #187 = Utf8               put
  #188 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #189 = Utf8               GRADE_NONE
  #190 = Utf8               I
  #191 = Utf8               ConstantValue
  #192 = Integer            0
  #193 = Utf8               GRADE_MID
  #194 = Integer            1
  #195 = Utf8               GRADE_HIGH
  #196 = Integer            2
  #197 = Utf8               GRADE_TOP
  #198 = Integer            3
  #199 = Utf8               Signature
  #200 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/item/LifeStone;>;
  #201 = Utf8               Code
  #202 = Utf8               LineNumberTable
  #203 = Utf8               LocalVariableTable
  #204 = Utf8               this
  #205 = Utf8               Lext/mods/gameserver/network/clientpackets/AbstractRefinePacket;
  #206 = Utf8               getLifeStone
  #207 = Utf8               (I)Lext/mods/gameserver/model/item/LifeStone;
  #208 = Utf8               itemId
  #209 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
  #210 = Utf8               player
  #211 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #212 = Utf8               item
  #213 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #214 = Utf8               refinerItem
  #215 = Utf8               gemstoneItem
  #216 = Utf8               grade
  #217 = Utf8               StackMapTable
  #218 = Utf8               ls
  #219 = Utf8               Lext/mods/gameserver/model/item/LifeStone;
  #220 = Utf8               weapon
  #221 = Utf8               Lext/mods/gameserver/model/item/kind/Weapon;
  #222 = Utf8               <clinit>
  #223 = Utf8               i
  #224 = Utf8               SourceFile
  #225 = Utf8               AbstractRefinePacket.java
{
  public static final int GRADE_NONE;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 0

  public static final int GRADE_MID;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 1

  public static final int GRADE_HIGH;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 2

  public static final int GRADE_TOP;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 3

  public ext.mods.gameserver.network.clientpackets.AbstractRefinePacket();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
         4: return
      LineNumberTable:
        line 32: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/network/clientpackets/AbstractRefinePacket;

  protected static final ext.mods.gameserver.model.item.LifeStone getLifeStone(int);
    descriptor: (I)Lext/mods/gameserver/model/item/LifeStone;
    flags: (0x001c) ACC_PROTECTED, ACC_STATIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: getstatic     #7                  // Field _lifeStones:Ljava/util/Map;
         3: iload_0
         4: invokestatic  #13                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         7: invokeinterface #19,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        12: checkcast     #25                 // class ext/mods/gameserver/model/item/LifeStone
        15: areturn
      LineNumberTable:
        line 60: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0 itemId   I

  protected static final boolean isValid(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.item.instance.ItemInstance, ext.mods.gameserver.model.item.instance.ItemInstance, ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
    flags: (0x001c) ACC_PROTECTED, ACC_STATIC, ACC_FINAL
    Code:
      stack=3, locals=5, args_size=4
         0: aload_0
         1: aload_1
         2: aload_2
         3: invokestatic  #27                 // Method isValid:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
         6: ifne          11
         9: iconst_0
        10: ireturn
        11: aload_3
        12: invokevirtual #31                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getOwnerId:()I
        15: aload_0
        16: invokevirtual #37                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        19: if_icmpeq     24
        22: iconst_0
        23: ireturn
        24: aload_3
        25: invokevirtual #42                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getLocation:()Lext/mods/gameserver/enums/items/ItemLocation;
        28: getstatic     #46                 // Field ext/mods/gameserver/enums/items/ItemLocation.INVENTORY:Lext/mods/gameserver/enums/items/ItemLocation;
        31: if_acmpeq     36
        34: iconst_0
        35: ireturn
        36: aload_1
        37: invokevirtual #52                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
        40: invokevirtual #56                 // Method ext/mods/gameserver/model/item/kind/Item.getCrystalType:()Lext/mods/gameserver/enums/items/CrystalType;
        43: astore        4
        45: aload         4
        47: invokevirtual #62                 // Method ext/mods/gameserver/enums/items/CrystalType.getGemstoneId:()I
        50: aload_3
        51: invokevirtual #67                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
        54: if_icmpeq     59
        57: iconst_0
        58: ireturn
        59: aload_3
        60: invokevirtual #70                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
        63: aload         4
        65: invokevirtual #73                 // Method ext/mods/gameserver/enums/items/CrystalType.getGemstoneCount:()I
        68: if_icmplt     75
        71: iconst_1
        72: goto          76
        75: iconst_0
        76: ireturn
      LineNumberTable:
        line 72: 0
        line 73: 9
        line 75: 11
        line 76: 22
        line 78: 24
        line 79: 34
        line 81: 36
        line 83: 45
        line 84: 57
        line 86: 59
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      77     0 player   Lext/mods/gameserver/model/actor/Player;
            0      77     1  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0      77     2 refinerItem   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0      77     3 gemstoneItem   Lext/mods/gameserver/model/item/instance/ItemInstance;
           45      32     4 grade   Lext/mods/gameserver/enums/items/CrystalType;
      StackMapTable: number_of_entries = 6
        frame_type = 11 /* same */
        frame_type = 12 /* same */
        frame_type = 11 /* same */
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ class ext/mods/gameserver/enums/items/CrystalType ]
        frame_type = 15 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  protected static final boolean isValid(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.item.instance.ItemInstance, ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
    flags: (0x001c) ACC_PROTECTED, ACC_STATIC, ACC_FINAL
    Code:
      stack=2, locals=4, args_size=3
         0: aload_2
         1: ifnonnull     6
         4: iconst_0
         5: ireturn
         6: aload_0
         7: aload_1
         8: invokestatic  #76                 // Method isValid:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
        11: ifne          16
        14: iconst_0
        15: ireturn
        16: aload_2
        17: invokevirtual #31                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getOwnerId:()I
        20: aload_0
        21: invokevirtual #37                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        24: if_icmpeq     29
        27: iconst_0
        28: ireturn
        29: aload_2
        30: invokevirtual #42                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getLocation:()Lext/mods/gameserver/enums/items/ItemLocation;
        33: getstatic     #46                 // Field ext/mods/gameserver/enums/items/ItemLocation.INVENTORY:Lext/mods/gameserver/enums/items/ItemLocation;
        36: if_acmpeq     41
        39: iconst_0
        40: ireturn
        41: getstatic     #7                  // Field _lifeStones:Ljava/util/Map;
        44: aload_2
        45: invokevirtual #67                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
        48: invokestatic  #13                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        51: invokeinterface #19,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        56: checkcast     #25                 // class ext/mods/gameserver/model/item/LifeStone
        59: astore_3
        60: aload_3
        61: ifnonnull     66
        64: iconst_0
        65: ireturn
        66: aload_0
        67: invokevirtual #79                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
        70: invokevirtual #83                 // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
        73: aload_3
        74: invokevirtual #88                 // Method ext/mods/gameserver/model/item/LifeStone.getPlayerLevel:()I
        77: if_icmpge     89
        80: aload_0
        81: getstatic     #91                 // Field ext/mods/gameserver/network/SystemMessageId.HARDENER_LEVEL_TOO_HIGH:Lext/mods/gameserver/network/SystemMessageId;
        84: invokevirtual #97                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        87: iconst_0
        88: ireturn
        89: iconst_1
        90: ireturn
      LineNumberTable:
        line 97: 0
        line 98: 4
        line 100: 6
        line 101: 14
        line 103: 16
        line 104: 27
        line 106: 29
        line 107: 39
        line 109: 41
        line 110: 60
        line 111: 64
        line 113: 66
        line 115: 80
        line 116: 87
        line 119: 89
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      91     0 player   Lext/mods/gameserver/model/actor/Player;
            0      91     1  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0      91     2 refinerItem   Lext/mods/gameserver/model/item/instance/ItemInstance;
           60      31     3    ls   Lext/mods/gameserver/model/item/LifeStone;
      StackMapTable: number_of_entries = 6
        frame_type = 6 /* same */
        frame_type = 9 /* same */
        frame_type = 12 /* same */
        frame_type = 11 /* same */
        frame_type = 252 /* append */
          offset_delta = 24
          locals = [ class ext/mods/gameserver/model/item/LifeStone ]
        frame_type = 22 /* same */

  protected static final boolean isValid(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
    flags: (0x001c) ACC_PROTECTED, ACC_STATIC, ACC_FINAL
    Code:
      stack=2, locals=4, args_size=2
         0: aload_1
         1: ifnonnull     6
         4: iconst_0
         5: ireturn
         6: aload_0
         7: invokestatic  #101                // Method isValid:(Lext/mods/gameserver/model/actor/Player;)Z
        10: ifne          15
        13: iconst_0
        14: ireturn
        15: aload_1
        16: invokevirtual #31                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getOwnerId:()I
        19: aload_0
        20: invokevirtual #37                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        23: if_icmpne     63
        26: aload_1
        27: invokevirtual #104                // Method ext/mods/gameserver/model/item/instance/ItemInstance.isAugmented:()Z
        30: ifne          63
        33: aload_1
        34: invokevirtual #108                // Method ext/mods/gameserver/model/item/instance/ItemInstance.isHeroItem:()Z
        37: ifne          63
        40: aload_1
        41: invokevirtual #111                // Method ext/mods/gameserver/model/item/instance/ItemInstance.isShadowItem:()Z
        44: ifne          63
        47: aload_1
        48: invokevirtual #52                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
        51: invokevirtual #56                 // Method ext/mods/gameserver/model/item/kind/Item.getCrystalType:()Lext/mods/gameserver/enums/items/CrystalType;
        54: getstatic     #114                // Field ext/mods/gameserver/enums/items/CrystalType.C:Lext/mods/gameserver/enums/items/CrystalType;
        57: invokevirtual #118                // Method ext/mods/gameserver/enums/items/CrystalType.isLesser:(Lext/mods/gameserver/enums/items/CrystalType;)Z
        60: ifeq          65
        63: iconst_0
        64: ireturn
        65: aload_1
        66: invokevirtual #42                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getLocation:()Lext/mods/gameserver/enums/items/ItemLocation;
        69: getstatic     #46                 // Field ext/mods/gameserver/enums/items/ItemLocation.INVENTORY:Lext/mods/gameserver/enums/items/ItemLocation;
        72: if_acmpeq     87
        75: aload_1
        76: invokevirtual #42                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getLocation:()Lext/mods/gameserver/enums/items/ItemLocation;
        79: getstatic     #122                // Field ext/mods/gameserver/enums/items/ItemLocation.PAPERDOLL:Lext/mods/gameserver/enums/items/ItemLocation;
        82: if_acmpeq     87
        85: iconst_0
        86: ireturn
        87: aload_1
        88: invokevirtual #52                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
        91: astore_3
        92: aload_3
        93: instanceof    #125                // class ext/mods/gameserver/model/item/kind/Weapon
        96: ifeq          107
        99: aload_3
       100: checkcast     #125                // class ext/mods/gameserver/model/item/kind/Weapon
       103: astore_2
       104: goto          109
       107: iconst_0
       108: ireturn
       109: aload_2
       110: invokevirtual #127                // Method ext/mods/gameserver/model/item/kind/Weapon.getItemType:()Lext/mods/gameserver/enums/items/WeaponType;
       113: getstatic     #131                // Field ext/mods/gameserver/enums/items/WeaponType.NONE:Lext/mods/gameserver/enums/items/WeaponType;
       116: if_acmpeq     133
       119: aload_2
       120: invokevirtual #127                // Method ext/mods/gameserver/model/item/kind/Weapon.getItemType:()Lext/mods/gameserver/enums/items/WeaponType;
       123: getstatic     #137                // Field ext/mods/gameserver/enums/items/WeaponType.FISHINGROD:Lext/mods/gameserver/enums/items/WeaponType;
       126: if_acmpeq     133
       129: iconst_1
       130: goto          134
       133: iconst_0
       134: ireturn
      LineNumberTable:
        line 129: 0
        line 130: 4
        line 132: 6
        line 133: 13
        line 135: 15
        line 136: 63
        line 138: 65
        line 139: 85
        line 141: 87
        line 142: 107
        line 144: 109
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          104       3     2 weapon   Lext/mods/gameserver/model/item/kind/Weapon;
            0     135     0 player   Lext/mods/gameserver/model/actor/Player;
            0     135     1  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
          109      26     2 weapon   Lext/mods/gameserver/model/item/kind/Weapon;
      StackMapTable: number_of_entries = 9
        frame_type = 6 /* same */
        frame_type = 8 /* same */
        frame_type = 47 /* same */
        frame_type = 1 /* same */
        frame_type = 21 /* same */
        frame_type = 19 /* same */
        frame_type = 252 /* append */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/model/item/kind/Weapon ]
        frame_type = 23 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  protected static final boolean isValid(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Z
    flags: (0x001c) ACC_PROTECTED, ACC_STATIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: ifnonnull     6
         4: iconst_0
         5: ireturn
         6: aload_0
         7: invokevirtual #140                // Method ext/mods/gameserver/model/actor/Player.isOperating:()Z
        10: ifeq          22
        13: aload_0
        14: getstatic     #143                // Field ext/mods/gameserver/network/SystemMessageId.YOU_CANNOT_AUGMENT_ITEMS_WHILE_A_PRIVATE_STORE_OR_PRIVATE_WORKSHOP_IS_IN_OPERATION:Lext/mods/gameserver/network/SystemMessageId;
        17: invokevirtual #97                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        20: iconst_0
        21: ireturn
        22: aload_0
        23: invokevirtual #146                // Method ext/mods/gameserver/model/actor/Player.isProcessingTransaction:()Z
        26: ifeq          38
        29: aload_0
        30: getstatic     #149                // Field ext/mods/gameserver/network/SystemMessageId.YOU_CANNOT_AUGMENT_ITEMS_WHILE_TRADING:Lext/mods/gameserver/network/SystemMessageId;
        33: invokevirtual #97                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        36: iconst_0
        37: ireturn
        38: aload_0
        39: invokevirtual #152                // Method ext/mods/gameserver/model/actor/Player.isDead:()Z
        42: ifeq          54
        45: aload_0
        46: getstatic     #155                // Field ext/mods/gameserver/network/SystemMessageId.YOU_CANNOT_AUGMENT_ITEMS_WHILE_DEAD:Lext/mods/gameserver/network/SystemMessageId;
        49: invokevirtual #97                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        52: iconst_0
        53: ireturn
        54: aload_0
        55: invokevirtual #158                // Method ext/mods/gameserver/model/actor/Player.isParalyzed:()Z
        58: ifeq          70
        61: aload_0
        62: getstatic     #161                // Field ext/mods/gameserver/network/SystemMessageId.YOU_CANNOT_AUGMENT_ITEMS_WHILE_PARALYZED:Lext/mods/gameserver/network/SystemMessageId;
        65: invokevirtual #97                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        68: iconst_0
        69: ireturn
        70: aload_0
        71: invokevirtual #164                // Method ext/mods/gameserver/model/actor/Player.isFishing:()Z
        74: ifeq          86
        77: aload_0
        78: getstatic     #167                // Field ext/mods/gameserver/network/SystemMessageId.YOU_CANNOT_AUGMENT_ITEMS_WHILE_FISHING:Lext/mods/gameserver/network/SystemMessageId;
        81: invokevirtual #97                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        84: iconst_0
        85: ireturn
        86: aload_0
        87: invokevirtual #170                // Method ext/mods/gameserver/model/actor/Player.isSitting:()Z
        90: ifeq          102
        93: aload_0
        94: getstatic     #173                // Field ext/mods/gameserver/network/SystemMessageId.YOU_CANNOT_AUGMENT_ITEMS_WHILE_SITTING_DOWN:Lext/mods/gameserver/network/SystemMessageId;
        97: invokevirtual #97                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       100: iconst_0
       101: ireturn
       102: aload_0
       103: invokevirtual #176                // Method ext/mods/gameserver/model/actor/Player.isCursedWeaponEquipped:()Z
       106: ifne          113
       109: iconst_1
       110: goto          114
       113: iconst_0
       114: ireturn
      LineNumberTable:
        line 153: 0
        line 154: 4
        line 156: 6
        line 158: 13
        line 159: 20
        line 162: 22
        line 164: 29
        line 165: 36
        line 168: 38
        line 170: 45
        line 171: 52
        line 174: 54
        line 176: 61
        line 177: 68
        line 180: 70
        line 182: 77
        line 183: 84
        line 186: 86
        line 188: 93
        line 189: 100
        line 192: 102
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     115     0 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 9
        frame_type = 6 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 10 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=6, locals=2, args_size=0
         0: new           #179                // class java/util/HashMap
         3: dup
         4: invokespecial #181                // Method java/util/HashMap."<init>":()V
         7: putstatic     #7                  // Field _lifeStones:Ljava/util/Map;
        10: sipush        8723
        13: istore_0
        14: iconst_0
        15: istore_1
        16: iload_1
        17: bipush        10
        19: if_icmpge     53
        22: getstatic     #7                  // Field _lifeStones:Ljava/util/Map;
        25: iload_0
        26: invokestatic  #13                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        29: new           #25                 // class ext/mods/gameserver/model/item/LifeStone
        32: dup
        33: iconst_0
        34: iload_1
        35: invokespecial #182                // Method ext/mods/gameserver/model/item/LifeStone."<init>":(II)V
        38: invokeinterface #185,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        43: pop
        44: iinc          1, 1
        47: iinc          0, 1
        50: goto          16
        53: iconst_0
        54: istore_1
        55: iload_1
        56: bipush        10
        58: if_icmpge     92
        61: getstatic     #7                  // Field _lifeStones:Ljava/util/Map;
        64: iload_0
        65: invokestatic  #13                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        68: new           #25                 // class ext/mods/gameserver/model/item/LifeStone
        71: dup
        72: iconst_1
        73: iload_1
        74: invokespecial #182                // Method ext/mods/gameserver/model/item/LifeStone."<init>":(II)V
        77: invokeinterface #185,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        82: pop
        83: iinc          1, 1
        86: iinc          0, 1
        89: goto          55
        92: iconst_0
        93: istore_1
        94: iload_1
        95: bipush        10
        97: if_icmpge     131
       100: getstatic     #7                  // Field _lifeStones:Ljava/util/Map;
       103: iload_0
       104: invokestatic  #13                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       107: new           #25                 // class ext/mods/gameserver/model/item/LifeStone
       110: dup
       111: iconst_2
       112: iload_1
       113: invokespecial #182                // Method ext/mods/gameserver/model/item/LifeStone."<init>":(II)V
       116: invokeinterface #185,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       121: pop
       122: iinc          1, 1
       125: iinc          0, 1
       128: goto          94
       131: iconst_0
       132: istore_1
       133: iload_1
       134: bipush        10
       136: if_icmpge     170
       139: getstatic     #7                  // Field _lifeStones:Ljava/util/Map;
       142: iload_0
       143: invokestatic  #13                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       146: new           #25                 // class ext/mods/gameserver/model/item/LifeStone
       149: dup
       150: iconst_3
       151: iload_1
       152: invokespecial #182                // Method ext/mods/gameserver/model/item/LifeStone."<init>":(II)V
       155: invokeinterface #185,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       160: pop
       161: iinc          1, 1
       164: iinc          0, 1
       167: goto          133
       170: return
      LineNumberTable:
        line 39: 0
        line 43: 10
        line 45: 14
        line 46: 22
        line 45: 44
        line 48: 53
        line 49: 61
        line 48: 83
        line 51: 92
        line 52: 100
        line 51: 122
        line 54: 131
        line 55: 139
        line 54: 161
        line 56: 170
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           16      37     1     i   I
           55      37     1     i   I
           94      37     1     i   I
          133      37     1     i   I
           14     156     0 itemId   I
      StackMapTable: number_of_entries = 8
        frame_type = 253 /* append */
          offset_delta = 16
          locals = [ int, int ]
        frame_type = 250 /* chop */
          offset_delta = 36
        frame_type = 252 /* append */
          offset_delta = 1
          locals = [ int ]
        frame_type = 250 /* chop */
          offset_delta = 36
        frame_type = 252 /* append */
          offset_delta = 1
          locals = [ int ]
        frame_type = 250 /* chop */
          offset_delta = 36
        frame_type = 252 /* append */
          offset_delta = 1
          locals = [ int ]
        frame_type = 249 /* chop */
          offset_delta = 36
}
SourceFile: "AbstractRefinePacket.java"
