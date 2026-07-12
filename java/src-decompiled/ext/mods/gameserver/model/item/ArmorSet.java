// Bytecode for: ext.mods.gameserver.model.item.ArmorSet
// File: ext\mods\gameserver\model\item\ArmorSet.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/item/ArmorSet.class
  Last modified 9 de jul de 2026; size 4283 bytes
  MD5 checksum 09759a5985074450200ef89ad386d1a4
  Compiled from "ArmorSet.java"
public final class ext.mods.gameserver.model.item.ArmorSet
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/item/ArmorSet
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 6, methods: 12, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/item/ArmorSet._set:[I
    #8 = Class              #10           // ext/mods/gameserver/model/item/ArmorSet
    #9 = NameAndType        #11:#12       // _set:[I
   #10 = Utf8               ext/mods/gameserver/model/item/ArmorSet
   #11 = Utf8               _set
   #12 = Utf8               [I
   #13 = String             #14           // name
   #14 = Utf8               name
   #15 = Methodref          #16.#17       // ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;)Ljava/lang/String;
   #16 = Class              #18           // ext/mods/commons/data/StatSet
   #17 = NameAndType        #19:#20       // getString:(Ljava/lang/String;)Ljava/lang/String;
   #18 = Utf8               ext/mods/commons/data/StatSet
   #19 = Utf8               getString
   #20 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #21 = Fieldref           #8.#22        // ext/mods/gameserver/model/item/ArmorSet._name:Ljava/lang/String;
   #22 = NameAndType        #23:#24       // _name:Ljava/lang/String;
   #23 = Utf8               _name
   #24 = Utf8               Ljava/lang/String;
   #25 = String             #26           // chest
   #26 = Utf8               chest
   #27 = Methodref          #16.#28       // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
   #28 = NameAndType        #29:#30       // getInteger:(Ljava/lang/String;)I
   #29 = Utf8               getInteger
   #30 = Utf8               (Ljava/lang/String;)I
   #31 = String             #32           // legs
   #32 = Utf8               legs
   #33 = String             #34           // head
   #34 = Utf8               head
   #35 = String             #36           // gloves
   #36 = Utf8               gloves
   #37 = String             #38           // feet
   #38 = Utf8               feet
   #39 = String             #40           // skillId
   #40 = Utf8               skillId
   #41 = Fieldref           #8.#42        // ext/mods/gameserver/model/item/ArmorSet._skillId:I
   #42 = NameAndType        #43:#44       // _skillId:I
   #43 = Utf8               _skillId
   #44 = Utf8               I
   #45 = String             #46           // shield
   #46 = Utf8               shield
   #47 = Fieldref           #8.#48        // ext/mods/gameserver/model/item/ArmorSet._shield:I
   #48 = NameAndType        #49:#44       // _shield:I
   #49 = Utf8               _shield
   #50 = String             #51           // shieldSkillId
   #51 = Utf8               shieldSkillId
   #52 = Fieldref           #8.#53        // ext/mods/gameserver/model/item/ArmorSet._shieldSkillId:I
   #53 = NameAndType        #54:#44       // _shieldSkillId:I
   #54 = Utf8               _shieldSkillId
   #55 = String             #56           // enchant6Skill
   #56 = Utf8               enchant6Skill
   #57 = Fieldref           #8.#58        // ext/mods/gameserver/model/item/ArmorSet._enchant6Skill:I
   #58 = NameAndType        #59:#44       // _enchant6Skill:I
   #59 = Utf8               _enchant6Skill
   #60 = Methodref          #61.#62       // ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #61 = Class              #63           // ext/mods/gameserver/model/actor/Player
   #62 = NameAndType        #64:#65       // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #63 = Utf8               ext/mods/gameserver/model/actor/Player
   #64 = Utf8               getInventory
   #65 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #66 = Fieldref           #67.#68       // ext/mods/gameserver/enums/Paperdoll.LEGS:Lext/mods/gameserver/enums/Paperdoll;
   #67 = Class              #69           // ext/mods/gameserver/enums/Paperdoll
   #68 = NameAndType        #70:#71       // LEGS:Lext/mods/gameserver/enums/Paperdoll;
   #69 = Utf8               ext/mods/gameserver/enums/Paperdoll
   #70 = Utf8               LEGS
   #71 = Utf8               Lext/mods/gameserver/enums/Paperdoll;
   #72 = Methodref          #73.#74       // ext/mods/gameserver/model/itemcontainer/PcInventory.getItemFrom:(Lext/mods/gameserver/enums/Paperdoll;)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #73 = Class              #75           // ext/mods/gameserver/model/itemcontainer/PcInventory
   #74 = NameAndType        #76:#77       // getItemFrom:(Lext/mods/gameserver/enums/Paperdoll;)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #75 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
   #76 = Utf8               getItemFrom
   #77 = Utf8               (Lext/mods/gameserver/enums/Paperdoll;)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #78 = Methodref          #79.#80       // ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
   #79 = Class              #81           // ext/mods/gameserver/model/item/instance/ItemInstance
   #80 = NameAndType        #82:#83       // getItemId:()I
   #81 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
   #82 = Utf8               getItemId
   #83 = Utf8               ()I
   #84 = Fieldref           #67.#85       // ext/mods/gameserver/enums/Paperdoll.HEAD:Lext/mods/gameserver/enums/Paperdoll;
   #85 = NameAndType        #86:#71       // HEAD:Lext/mods/gameserver/enums/Paperdoll;
   #86 = Utf8               HEAD
   #87 = Fieldref           #67.#88       // ext/mods/gameserver/enums/Paperdoll.GLOVES:Lext/mods/gameserver/enums/Paperdoll;
   #88 = NameAndType        #89:#71       // GLOVES:Lext/mods/gameserver/enums/Paperdoll;
   #89 = Utf8               GLOVES
   #90 = Fieldref           #67.#91       // ext/mods/gameserver/enums/Paperdoll.FEET:Lext/mods/gameserver/enums/Paperdoll;
   #91 = NameAndType        #92:#71       // FEET:Lext/mods/gameserver/enums/Paperdoll;
   #92 = Utf8               FEET
   #93 = Fieldref           #94.#95       // ext/mods/gameserver/model/item/ArmorSet$1.$SwitchMap$ext$mods$gameserver$enums$Paperdoll:[I
   #94 = Class              #96           // ext/mods/gameserver/model/item/ArmorSet$1
   #95 = NameAndType        #97:#12       // $SwitchMap$ext$mods$gameserver$enums$Paperdoll:[I
   #96 = Utf8               ext/mods/gameserver/model/item/ArmorSet$1
   #97 = Utf8               $SwitchMap$ext$mods$gameserver$enums$Paperdoll
   #98 = Methodref          #67.#99       // ext/mods/gameserver/enums/Paperdoll.ordinal:()I
   #99 = NameAndType        #100:#83      // ordinal:()I
  #100 = Utf8               ordinal
  #101 = Methodref          #61.#102      // ext/mods/gameserver/model/actor/Player.getSecondaryWeaponInstance:()Lext/mods/gameserver/model/item/instance/ItemInstance;
  #102 = NameAndType        #103:#104     // getSecondaryWeaponInstance:()Lext/mods/gameserver/model/item/instance/ItemInstance;
  #103 = Utf8               getSecondaryWeaponInstance
  #104 = Utf8               ()Lext/mods/gameserver/model/item/instance/ItemInstance;
  #105 = Fieldref           #67.#106      // ext/mods/gameserver/enums/Paperdoll.CHEST:Lext/mods/gameserver/enums/Paperdoll;
  #106 = NameAndType        #107:#71      // CHEST:Lext/mods/gameserver/enums/Paperdoll;
  #107 = Utf8               CHEST
  #108 = Methodref          #79.#109      // ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
  #109 = NameAndType        #110:#83      // getEnchantLevel:()I
  #110 = Utf8               getEnchantLevel
  #111 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #112 = Utf8               Code
  #113 = Utf8               LineNumberTable
  #114 = Utf8               LocalVariableTable
  #115 = Utf8               this
  #116 = Utf8               Lext/mods/gameserver/model/item/ArmorSet;
  #117 = Utf8               set
  #118 = Utf8               Lext/mods/commons/data/StatSet;
  #119 = Utf8               toString
  #120 = Utf8               ()Ljava/lang/String;
  #121 = Utf8               getSetItemsId
  #122 = Utf8               ()[I
  #123 = Utf8               getShield
  #124 = Utf8               getSkillId
  #125 = Utf8               getShieldSkillId
  #126 = Utf8               getEnchant6skillId
  #127 = Utf8               containsAll
  #128 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
  #129 = Utf8               player
  #130 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #131 = Utf8               legsItem
  #132 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #133 = Utf8               headItem
  #134 = Utf8               glovesItem
  #135 = Utf8               feetItem
  #136 = Utf8               StackMapTable
  #137 = Utf8               containsItem
  #138 = Utf8               (Lext/mods/gameserver/enums/Paperdoll;I)Z
  #139 = Utf8               slot
  #140 = Utf8               itemId
  #141 = Utf8               containsShield
  #142 = Utf8               item
  #143 = Utf8               (I)Z
  #144 = Utf8               shieldId
  #145 = Utf8               isEnchanted6
  #146 = Utf8               chestItem
  #147 = Utf8               SourceFile
  #148 = Utf8               ArmorSet.java
  #149 = Utf8               NestMembers
  #150 = Utf8               InnerClasses
{
  public ext.mods.gameserver.model.item.ArmorSet(ext.mods.commons.data.StatSet);
    descriptor: (Lext/mods/commons/data/StatSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iconst_5
         6: newarray       int
         8: putfield      #7                  // Field _set:[I
        11: aload_0
        12: aload_1
        13: ldc           #13                 // String name
        15: invokevirtual #15                 // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;)Ljava/lang/String;
        18: putfield      #21                 // Field _name:Ljava/lang/String;
        21: aload_0
        22: getfield      #7                  // Field _set:[I
        25: iconst_0
        26: aload_1
        27: ldc           #25                 // String chest
        29: invokevirtual #27                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        32: iastore
        33: aload_0
        34: getfield      #7                  // Field _set:[I
        37: iconst_1
        38: aload_1
        39: ldc           #31                 // String legs
        41: invokevirtual #27                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        44: iastore
        45: aload_0
        46: getfield      #7                  // Field _set:[I
        49: iconst_2
        50: aload_1
        51: ldc           #33                 // String head
        53: invokevirtual #27                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        56: iastore
        57: aload_0
        58: getfield      #7                  // Field _set:[I
        61: iconst_3
        62: aload_1
        63: ldc           #35                 // String gloves
        65: invokevirtual #27                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        68: iastore
        69: aload_0
        70: getfield      #7                  // Field _set:[I
        73: iconst_4
        74: aload_1
        75: ldc           #37                 // String feet
        77: invokevirtual #27                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        80: iastore
        81: aload_0
        82: aload_1
        83: ldc           #39                 // String skillId
        85: invokevirtual #27                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        88: putfield      #41                 // Field _skillId:I
        91: aload_0
        92: aload_1
        93: ldc           #45                 // String shield
        95: invokevirtual #27                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        98: putfield      #47                 // Field _shield:I
       101: aload_0
       102: aload_1
       103: ldc           #50                 // String shieldSkillId
       105: invokevirtual #27                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
       108: putfield      #52                 // Field _shieldSkillId:I
       111: aload_0
       112: aload_1
       113: ldc           #55                 // String enchant6Skill
       115: invokevirtual #27                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
       118: putfield      #57                 // Field _enchant6Skill:I
       121: return
      LineNumberTable:
        line 38: 0
        line 30: 4
        line 39: 11
        line 41: 21
        line 42: 33
        line 43: 45
        line 44: 57
        line 45: 69
        line 47: 81
        line 48: 91
        line 49: 101
        line 50: 111
        line 51: 121
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     122     0  this   Lext/mods/gameserver/model/item/ArmorSet;
            0     122     1   set   Lext/mods/commons/data/StatSet;

  public java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #21                 // Field _name:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 56: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/ArmorSet;

  public int[] getSetItemsId();
    descriptor: ()[I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _set:[I
         4: areturn
      LineNumberTable:
        line 61: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/ArmorSet;

  public int getShield();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #47                 // Field _shield:I
         4: ireturn
      LineNumberTable:
        line 66: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/ArmorSet;

  public int getSkillId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #41                 // Field _skillId:I
         4: ireturn
      LineNumberTable:
        line 71: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/ArmorSet;

  public int getShieldSkillId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #52                 // Field _shieldSkillId:I
         4: ireturn
      LineNumberTable:
        line 76: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/ArmorSet;

  public int getEnchant6skillId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #57                 // Field _enchant6Skill:I
         4: ireturn
      LineNumberTable:
        line 81: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/ArmorSet;

  public boolean containsAll(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=10, args_size=2
         0: iconst_0
         1: istore_2
         2: aload_1
         3: invokevirtual #60                 // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
         6: getstatic     #66                 // Field ext/mods/gameserver/enums/Paperdoll.LEGS:Lext/mods/gameserver/enums/Paperdoll;
         9: invokevirtual #72                 // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemFrom:(Lext/mods/gameserver/enums/Paperdoll;)Lext/mods/gameserver/model/item/instance/ItemInstance;
        12: astore_3
        13: aload_3
        14: ifnull        22
        17: aload_3
        18: invokevirtual #78                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
        21: istore_2
        22: aload_0
        23: getfield      #7                  // Field _set:[I
        26: iconst_1
        27: iaload
        28: ifeq          43
        31: aload_0
        32: getfield      #7                  // Field _set:[I
        35: iconst_1
        36: iaload
        37: iload_2
        38: if_icmpeq     43
        41: iconst_0
        42: ireturn
        43: iconst_0
        44: istore        4
        46: aload_1
        47: invokevirtual #60                 // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
        50: getstatic     #84                 // Field ext/mods/gameserver/enums/Paperdoll.HEAD:Lext/mods/gameserver/enums/Paperdoll;
        53: invokevirtual #72                 // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemFrom:(Lext/mods/gameserver/enums/Paperdoll;)Lext/mods/gameserver/model/item/instance/ItemInstance;
        56: astore        5
        58: aload         5
        60: ifnull        70
        63: aload         5
        65: invokevirtual #78                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
        68: istore        4
        70: aload_0
        71: getfield      #7                  // Field _set:[I
        74: iconst_2
        75: iaload
        76: ifeq          92
        79: aload_0
        80: getfield      #7                  // Field _set:[I
        83: iconst_2
        84: iaload
        85: iload         4
        87: if_icmpeq     92
        90: iconst_0
        91: ireturn
        92: iconst_0
        93: istore        6
        95: aload_1
        96: invokevirtual #60                 // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
        99: getstatic     #87                 // Field ext/mods/gameserver/enums/Paperdoll.GLOVES:Lext/mods/gameserver/enums/Paperdoll;
       102: invokevirtual #72                 // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemFrom:(Lext/mods/gameserver/enums/Paperdoll;)Lext/mods/gameserver/model/item/instance/ItemInstance;
       105: astore        7
       107: aload         7
       109: ifnull        119
       112: aload         7
       114: invokevirtual #78                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
       117: istore        6
       119: aload_0
       120: getfield      #7                  // Field _set:[I
       123: iconst_3
       124: iaload
       125: ifeq          141
       128: aload_0
       129: getfield      #7                  // Field _set:[I
       132: iconst_3
       133: iaload
       134: iload         6
       136: if_icmpeq     141
       139: iconst_0
       140: ireturn
       141: iconst_0
       142: istore        8
       144: aload_1
       145: invokevirtual #60                 // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       148: getstatic     #90                 // Field ext/mods/gameserver/enums/Paperdoll.FEET:Lext/mods/gameserver/enums/Paperdoll;
       151: invokevirtual #72                 // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemFrom:(Lext/mods/gameserver/enums/Paperdoll;)Lext/mods/gameserver/model/item/instance/ItemInstance;
       154: astore        9
       156: aload         9
       158: ifnull        168
       161: aload         9
       163: invokevirtual #78                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
       166: istore        8
       168: aload_0
       169: getfield      #7                  // Field _set:[I
       172: iconst_4
       173: iaload
       174: ifeq          190
       177: aload_0
       178: getfield      #7                  // Field _set:[I
       181: iconst_4
       182: iaload
       183: iload         8
       185: if_icmpeq     190
       188: iconst_0
       189: ireturn
       190: iconst_1
       191: ireturn
      LineNumberTable:
        line 90: 0
        line 91: 2
        line 92: 13
        line 93: 17
        line 95: 22
        line 96: 41
        line 98: 43
        line 99: 46
        line 100: 58
        line 101: 63
        line 103: 70
        line 104: 90
        line 106: 92
        line 107: 95
        line 108: 107
        line 109: 112
        line 111: 119
        line 112: 139
        line 114: 141
        line 115: 144
        line 116: 156
        line 117: 161
        line 119: 168
        line 120: 188
        line 122: 190
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     192     0  this   Lext/mods/gameserver/model/item/ArmorSet;
            0     192     1 player   Lext/mods/gameserver/model/actor/Player;
            2     190     2  legs   I
           13     179     3 legsItem   Lext/mods/gameserver/model/item/instance/ItemInstance;
           46     146     4  head   I
           58     134     5 headItem   Lext/mods/gameserver/model/item/instance/ItemInstance;
           95      97     6 gloves   I
          107      85     7 glovesItem   Lext/mods/gameserver/model/item/instance/ItemInstance;
          144      48     8  feet   I
          156      36     9 feetItem   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 8
        frame_type = 253 /* append */
          offset_delta = 22
          locals = [ int, class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 20 /* same */
        frame_type = 253 /* append */
          offset_delta = 26
          locals = [ int, class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 21 /* same */
        frame_type = 253 /* append */
          offset_delta = 26
          locals = [ int, class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 21 /* same */
        frame_type = 253 /* append */
          offset_delta = 26
          locals = [ int, class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 21 /* same */

  public boolean containsItem(ext.mods.gameserver.enums.Paperdoll, int);
    descriptor: (Lext/mods/gameserver/enums/Paperdoll;I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=3
         0: getstatic     #93                 // Field ext/mods/gameserver/model/item/ArmorSet$1.$SwitchMap$ext$mods$gameserver$enums$Paperdoll:[I
         3: aload_1
         4: invokevirtual #98                 // Method ext/mods/gameserver/enums/Paperdoll.ordinal:()I
         7: iaload
         8: tableswitch   { // 1 to 5

                       1: 44

                       2: 60

                       3: 76

                       4: 92

                       5: 108
                 default: 124
            }
        44: aload_0
        45: getfield      #7                  // Field _set:[I
        48: iconst_0
        49: iaload
        50: iload_2
        51: if_icmpne     58
        54: iconst_1
        55: goto          59
        58: iconst_0
        59: ireturn
        60: aload_0
        61: getfield      #7                  // Field _set:[I
        64: iconst_1
        65: iaload
        66: iload_2
        67: if_icmpne     74
        70: iconst_1
        71: goto          75
        74: iconst_0
        75: ireturn
        76: aload_0
        77: getfield      #7                  // Field _set:[I
        80: iconst_2
        81: iaload
        82: iload_2
        83: if_icmpne     90
        86: iconst_1
        87: goto          91
        90: iconst_0
        91: ireturn
        92: aload_0
        93: getfield      #7                  // Field _set:[I
        96: iconst_3
        97: iaload
        98: iload_2
        99: if_icmpne     106
       102: iconst_1
       103: goto          107
       106: iconst_0
       107: ireturn
       108: aload_0
       109: getfield      #7                  // Field _set:[I
       112: iconst_4
       113: iaload
       114: iload_2
       115: if_icmpne     122
       118: iconst_1
       119: goto          123
       122: iconst_0
       123: ireturn
       124: iconst_0
       125: ireturn
      LineNumberTable:
        line 127: 0
        line 130: 44
        line 133: 60
        line 136: 76
        line 139: 92
        line 142: 108
        line 145: 124
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     126     0  this   Lext/mods/gameserver/model/item/ArmorSet;
            0     126     1  slot   Lext/mods/gameserver/enums/Paperdoll;
            0     126     2 itemId   I
      StackMapTable: number_of_entries = 16
        frame_type = 44 /* same */
        frame_type = 13 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 0 /* same */
        frame_type = 13 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 0 /* same */
        frame_type = 13 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 0 /* same */
        frame_type = 13 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 0 /* same */
        frame_type = 13 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 0 /* same */

  public boolean containsShield(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_1
         1: invokevirtual #101                // Method ext/mods/gameserver/model/actor/Player.getSecondaryWeaponInstance:()Lext/mods/gameserver/model/item/instance/ItemInstance;
         4: astore_2
         5: aload_2
         6: ifnull        24
         9: aload_2
        10: invokevirtual #78                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
        13: aload_0
        14: getfield      #47                 // Field _shield:I
        17: if_icmpne     24
        20: iconst_1
        21: goto          25
        24: iconst_0
        25: ireturn
      LineNumberTable:
        line 151: 0
        line 152: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/model/item/ArmorSet;
            0      26     1 player   Lext/mods/gameserver/model/actor/Player;
            5      21     2  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 24
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean containsShield(int);
    descriptor: (I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #47                 // Field _shield:I
         4: ifeq          19
         7: aload_0
         8: getfield      #47                 // Field _shield:I
        11: iload_1
        12: if_icmpne     19
        15: iconst_1
        16: goto          20
        19: iconst_0
        20: ireturn
      LineNumberTable:
        line 157: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/gameserver/model/item/ArmorSet;
            0      21     1 shieldId   I
      StackMapTable: number_of_entries = 2
        frame_type = 19 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean isEnchanted6(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=11, args_size=2
         0: aload_1
         1: invokevirtual #60                 // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
         4: getstatic     #105                // Field ext/mods/gameserver/enums/Paperdoll.CHEST:Lext/mods/gameserver/enums/Paperdoll;
         7: invokevirtual #72                 // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemFrom:(Lext/mods/gameserver/enums/Paperdoll;)Lext/mods/gameserver/model/item/instance/ItemInstance;
        10: astore_2
        11: aload_2
        12: invokevirtual #108                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
        15: bipush        6
        17: if_icmpge     22
        20: iconst_0
        21: ireturn
        22: iconst_0
        23: istore_3
        24: aload_1
        25: invokevirtual #60                 // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
        28: getstatic     #66                 // Field ext/mods/gameserver/enums/Paperdoll.LEGS:Lext/mods/gameserver/enums/Paperdoll;
        31: invokevirtual #72                 // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemFrom:(Lext/mods/gameserver/enums/Paperdoll;)Lext/mods/gameserver/model/item/instance/ItemInstance;
        34: astore        4
        36: aload         4
        38: ifnull        56
        41: aload         4
        43: invokevirtual #108                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
        46: iconst_5
        47: if_icmple     56
        50: aload         4
        52: invokevirtual #78                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
        55: istore_3
        56: aload_0
        57: getfield      #7                  // Field _set:[I
        60: iconst_1
        61: iaload
        62: ifeq          77
        65: aload_0
        66: getfield      #7                  // Field _set:[I
        69: iconst_1
        70: iaload
        71: iload_3
        72: if_icmpeq     77
        75: iconst_0
        76: ireturn
        77: iconst_0
        78: istore        5
        80: aload_1
        81: invokevirtual #60                 // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
        84: getstatic     #84                 // Field ext/mods/gameserver/enums/Paperdoll.HEAD:Lext/mods/gameserver/enums/Paperdoll;
        87: invokevirtual #72                 // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemFrom:(Lext/mods/gameserver/enums/Paperdoll;)Lext/mods/gameserver/model/item/instance/ItemInstance;
        90: astore        6
        92: aload         6
        94: ifnull        113
        97: aload         6
        99: invokevirtual #108                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
       102: iconst_5
       103: if_icmple     113
       106: aload         6
       108: invokevirtual #78                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
       111: istore        5
       113: aload_0
       114: getfield      #7                  // Field _set:[I
       117: iconst_2
       118: iaload
       119: ifeq          135
       122: aload_0
       123: getfield      #7                  // Field _set:[I
       126: iconst_2
       127: iaload
       128: iload         5
       130: if_icmpeq     135
       133: iconst_0
       134: ireturn
       135: iconst_0
       136: istore        7
       138: aload_1
       139: invokevirtual #60                 // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       142: getstatic     #87                 // Field ext/mods/gameserver/enums/Paperdoll.GLOVES:Lext/mods/gameserver/enums/Paperdoll;
       145: invokevirtual #72                 // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemFrom:(Lext/mods/gameserver/enums/Paperdoll;)Lext/mods/gameserver/model/item/instance/ItemInstance;
       148: astore        8
       150: aload         8
       152: ifnull        171
       155: aload         8
       157: invokevirtual #108                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
       160: iconst_5
       161: if_icmple     171
       164: aload         8
       166: invokevirtual #78                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
       169: istore        7
       171: aload_0
       172: getfield      #7                  // Field _set:[I
       175: iconst_3
       176: iaload
       177: ifeq          193
       180: aload_0
       181: getfield      #7                  // Field _set:[I
       184: iconst_3
       185: iaload
       186: iload         7
       188: if_icmpeq     193
       191: iconst_0
       192: ireturn
       193: iconst_0
       194: istore        9
       196: aload_1
       197: invokevirtual #60                 // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       200: getstatic     #90                 // Field ext/mods/gameserver/enums/Paperdoll.FEET:Lext/mods/gameserver/enums/Paperdoll;
       203: invokevirtual #72                 // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemFrom:(Lext/mods/gameserver/enums/Paperdoll;)Lext/mods/gameserver/model/item/instance/ItemInstance;
       206: astore        10
       208: aload         10
       210: ifnull        229
       213: aload         10
       215: invokevirtual #108                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
       218: iconst_5
       219: if_icmple     229
       222: aload         10
       224: invokevirtual #78                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
       227: istore        9
       229: aload_0
       230: getfield      #7                  // Field _set:[I
       233: iconst_4
       234: iaload
       235: ifeq          251
       238: aload_0
       239: getfield      #7                  // Field _set:[I
       242: iconst_4
       243: iaload
       244: iload         9
       246: if_icmpeq     251
       249: iconst_0
       250: ireturn
       251: iconst_1
       252: ireturn
      LineNumberTable:
        line 166: 0
        line 167: 11
        line 168: 20
        line 170: 22
        line 171: 24
        line 172: 36
        line 173: 50
        line 175: 56
        line 176: 75
        line 178: 77
        line 179: 80
        line 180: 92
        line 181: 106
        line 183: 113
        line 184: 133
        line 186: 135
        line 187: 138
        line 188: 150
        line 189: 164
        line 191: 171
        line 192: 191
        line 194: 193
        line 195: 196
        line 196: 208
        line 197: 222
        line 199: 229
        line 200: 249
        line 202: 251
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     253     0  this   Lext/mods/gameserver/model/item/ArmorSet;
            0     253     1 player   Lext/mods/gameserver/model/actor/Player;
           11     242     2 chestItem   Lext/mods/gameserver/model/item/instance/ItemInstance;
           24     229     3  legs   I
           36     217     4 legsItem   Lext/mods/gameserver/model/item/instance/ItemInstance;
           80     173     5  head   I
           92     161     6 headItem   Lext/mods/gameserver/model/item/instance/ItemInstance;
          138     115     7 gloves   I
          150     103     8 glovesItem   Lext/mods/gameserver/model/item/instance/ItemInstance;
          196      57     9  feet   I
          208      45    10 feetItem   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 9
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 253 /* append */
          offset_delta = 33
          locals = [ int, class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 20 /* same */
        frame_type = 253 /* append */
          offset_delta = 35
          locals = [ int, class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 21 /* same */
        frame_type = 253 /* append */
          offset_delta = 35
          locals = [ int, class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 21 /* same */
        frame_type = 253 /* append */
          offset_delta = 35
          locals = [ int, class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 21 /* same */
}
SourceFile: "ArmorSet.java"
NestMembers:
  ext/mods/gameserver/model/item/ArmorSet$1
InnerClasses:
  static #94;                             // class ext/mods/gameserver/model/item/ArmorSet$1
