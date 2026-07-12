// Bytecode for: ext.mods.gameserver.model.records.custom.EnchantScroll
// File: ext\mods\gameserver\model\records\custom\EnchantScroll.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/records/custom/EnchantScroll.class
  Last modified 9 de jul de 2026; size 5134 bytes
  MD5 checksum 2d06f9059e6a96ee83a1f48a5f45d4a2
  Compiled from "EnchantScroll.java"
public final class ext.mods.gameserver.model.records.custom.EnchantScroll extends java.lang.Record
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/records/custom/EnchantScroll
  super_class: #2                         // java/lang/Record
  interfaces: 0, fields: 12, methods: 20, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Record."<init>":()V
    #2 = Class              #4            // java/lang/Record
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Record
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/records/custom/EnchantScroll.scrollId:I
    #8 = Class              #10           // ext/mods/gameserver/model/records/custom/EnchantScroll
    #9 = NameAndType        #11:#12       // scrollId:I
   #10 = Utf8               ext/mods/gameserver/model/records/custom/EnchantScroll
   #11 = Utf8               scrollId
   #12 = Utf8               I
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/model/records/custom/EnchantScroll.grade:Lext/mods/gameserver/enums/items/CrystalType;
   #14 = NameAndType        #15:#16       // grade:Lext/mods/gameserver/enums/items/CrystalType;
   #15 = Utf8               grade
   #16 = Utf8               Lext/mods/gameserver/enums/items/CrystalType;
   #17 = Fieldref           #8.#18        // ext/mods/gameserver/model/records/custom/EnchantScroll.isWeapon:Z
   #18 = NameAndType        #19:#20       // isWeapon:Z
   #19 = Utf8               isWeapon
   #20 = Utf8               Z
   #21 = Fieldref           #8.#22        // ext/mods/gameserver/model/records/custom/EnchantScroll.cristalize:Z
   #22 = NameAndType        #23:#20       // cristalize:Z
   #23 = Utf8               cristalize
   #24 = Fieldref           #8.#25        // ext/mods/gameserver/model/records/custom/EnchantScroll.returnVal:I
   #25 = NameAndType        #26:#12       // returnVal:I
   #26 = Utf8               returnVal
   #27 = Fieldref           #8.#28        // ext/mods/gameserver/model/records/custom/EnchantScroll.chance:[I
   #28 = NameAndType        #29:#30       // chance:[I
   #29 = Utf8               chance
   #30 = Utf8               [I
   #31 = Fieldref           #8.#32        // ext/mods/gameserver/model/records/custom/EnchantScroll.chanceF:[I
   #32 = NameAndType        #33:#30       // chanceF:[I
   #33 = Utf8               chanceF
   #34 = Fieldref           #8.#35        // ext/mods/gameserver/model/records/custom/EnchantScroll.chanceM:[I
   #35 = NameAndType        #36:#30       // chanceM:[I
   #36 = Utf8               chanceM
   #37 = Fieldref           #8.#38        // ext/mods/gameserver/model/records/custom/EnchantScroll.message:Z
   #38 = NameAndType        #39:#20       // message:Z
   #39 = Utf8               message
   #40 = Fieldref           #8.#41        // ext/mods/gameserver/model/records/custom/EnchantScroll.enchants:[I
   #41 = NameAndType        #42:#30       // enchants:[I
   #42 = Utf8               enchants
   #43 = Fieldref           #8.#44        // ext/mods/gameserver/model/records/custom/EnchantScroll.enchantAmount:I
   #44 = NameAndType        #45:#12       // enchantAmount:I
   #45 = Utf8               enchantAmount
   #46 = Fieldref           #8.#47        // ext/mods/gameserver/model/records/custom/EnchantScroll.returnOnFail:I
   #47 = NameAndType        #48:#12       // returnOnFail:I
   #48 = Utf8               returnOnFail
   #49 = String             #50           // id
   #50 = Utf8               id
   #51 = Methodref          #52.#53       // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
   #52 = Class              #54           // ext/mods/commons/data/StatSet
   #53 = NameAndType        #55:#56       // getInteger:(Ljava/lang/String;)I
   #54 = Utf8               ext/mods/commons/data/StatSet
   #55 = Utf8               getInteger
   #56 = Utf8               (Ljava/lang/String;)I
   #57 = String             #15           // grade
   #58 = Class              #59           // ext/mods/gameserver/enums/items/CrystalType
   #59 = Utf8               ext/mods/gameserver/enums/items/CrystalType
   #60 = Fieldref           #58.#61       // ext/mods/gameserver/enums/items/CrystalType.NONE:Lext/mods/gameserver/enums/items/CrystalType;
   #61 = NameAndType        #62:#16       // NONE:Lext/mods/gameserver/enums/items/CrystalType;
   #62 = Utf8               NONE
   #63 = Methodref          #52.#64       // ext/mods/commons/data/StatSet.getEnum:(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Enum;)Ljava/lang/Enum;
   #64 = NameAndType        #65:#66       // getEnum:(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Enum;)Ljava/lang/Enum;
   #65 = Utf8               getEnum
   #66 = Utf8               (Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Enum;)Ljava/lang/Enum;
   #67 = String             #19           // isWeapon
   #68 = Methodref          #52.#69       // ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;)Z
   #69 = NameAndType        #70:#71       // getBool:(Ljava/lang/String;)Z
   #70 = Utf8               getBool
   #71 = Utf8               (Ljava/lang/String;)Z
   #72 = String             #73           // crystalize
   #73 = Utf8               crystalize
   #74 = Methodref          #52.#75       // ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;Z)Z
   #75 = NameAndType        #70:#76       // getBool:(Ljava/lang/String;Z)Z
   #76 = Utf8               (Ljava/lang/String;Z)Z
   #77 = String             #78           // return
   #78 = Utf8               return
   #79 = Methodref          #52.#80       // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
   #80 = NameAndType        #55:#81       // getInteger:(Ljava/lang/String;I)I
   #81 = Utf8               (Ljava/lang/String;I)I
   #82 = String             #83           // rate
   #83 = Utf8               rate
   #84 = Fieldref           #85.#86       // ext/mods/commons/util/ArraysUtil.EMPTY_INT_ARRAY:[I
   #85 = Class              #87           // ext/mods/commons/util/ArraysUtil
   #86 = NameAndType        #88:#30       // EMPTY_INT_ARRAY:[I
   #87 = Utf8               ext/mods/commons/util/ArraysUtil
   #88 = Utf8               EMPTY_INT_ARRAY
   #89 = Methodref          #52.#90       // ext/mods/commons/data/StatSet.getIntegerArray:(Ljava/lang/String;[I)[I
   #90 = NameAndType        #91:#92       // getIntegerArray:(Ljava/lang/String;[I)[I
   #91 = Utf8               getIntegerArray
   #92 = Utf8               (Ljava/lang/String;[I)[I
   #93 = String             #94           // rateF
   #94 = Utf8               rateF
   #95 = String             #96           // rateM
   #96 = Utf8               rateM
   #97 = String             #39           // message
   #98 = String             #42           // enchants
   #99 = String             #45           // enchantAmount
  #100 = String             #48           // returnOnFail
  #101 = Methodref          #8.#102       // ext/mods/gameserver/model/records/custom/EnchantScroll."<init>":(ILext/mods/gameserver/enums/items/CrystalType;ZZI[I[I[IZ[III)V
  #102 = NameAndType        #5:#103       // "<init>":(ILext/mods/gameserver/enums/items/CrystalType;ZZI[I[I[IZ[III)V
  #103 = Utf8               (ILext/mods/gameserver/enums/items/CrystalType;ZZI[I[I[IZ[III)V
  #104 = Methodref          #105.#106     // ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
  #105 = Class              #107          // ext/mods/gameserver/model/item/instance/ItemInstance
  #106 = NameAndType        #108:#109     // getEnchantLevel:()I
  #107 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
  #108 = Utf8               getEnchantLevel
  #109 = Utf8               ()I
  #110 = Methodref          #105.#111     // ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
  #111 = NameAndType        #112:#113     // getItem:()Lext/mods/gameserver/model/item/kind/Item;
  #112 = Utf8               getItem
  #113 = Utf8               ()Lext/mods/gameserver/model/item/kind/Item;
  #114 = Methodref          #115.#116     // ext/mods/gameserver/model/item/kind/Item.getBodyPart:()I
  #115 = Class              #117          // ext/mods/gameserver/model/item/kind/Item
  #116 = NameAndType        #118:#109     // getBodyPart:()I
  #117 = Utf8               ext/mods/gameserver/model/item/kind/Item
  #118 = Utf8               getBodyPart
  #119 = Integer            32768
  #120 = Methodref          #115.#121     // ext/mods/gameserver/model/item/kind/Item.getType2:()I
  #121 = NameAndType        #122:#109     // getType2:()I
  #122 = Utf8               getType2
  #123 = Methodref          #105.#124     // ext/mods/gameserver/model/item/instance/ItemInstance.isWeapon:()Z
  #124 = NameAndType        #19:#125      // isWeapon:()Z
  #125 = Utf8               ()Z
  #126 = Class              #127          // ext/mods/gameserver/model/item/kind/Weapon
  #127 = Utf8               ext/mods/gameserver/model/item/kind/Weapon
  #128 = Methodref          #126.#129     // ext/mods/gameserver/model/item/kind/Weapon.isMagical:()Z
  #129 = NameAndType        #130:#125     // isMagical:()Z
  #130 = Utf8               isMagical
  #131 = Methodref          #85.#132      // ext/mods/commons/util/ArraysUtil.contains:([II)Z
  #132 = NameAndType        #133:#134     // contains:([II)Z
  #133 = Utf8               contains
  #134 = Utf8               ([II)Z
  #135 = Methodref          #115.#136     // ext/mods/gameserver/model/item/kind/Item.getCrystalType:()Lext/mods/gameserver/enums/items/CrystalType;
  #136 = NameAndType        #137:#138     // getCrystalType:()Lext/mods/gameserver/enums/items/CrystalType;
  #137 = Utf8               getCrystalType
  #138 = Utf8               ()Lext/mods/gameserver/enums/items/CrystalType;
  #139 = Methodref          #8.#140       // ext/mods/gameserver/model/records/custom/EnchantScroll.getChance:(Lext/mods/gameserver/model/item/instance/ItemInstance;)I
  #140 = NameAndType        #141:#142     // getChance:(Lext/mods/gameserver/model/item/instance/ItemInstance;)I
  #141 = Utf8               getChance
  #142 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;)I
  #143 = InvokeDynamic      #0:#144       // #0:toString:(Lext/mods/gameserver/model/records/custom/EnchantScroll;)Ljava/lang/String;
  #144 = NameAndType        #145:#146     // toString:(Lext/mods/gameserver/model/records/custom/EnchantScroll;)Ljava/lang/String;
  #145 = Utf8               toString
  #146 = Utf8               (Lext/mods/gameserver/model/records/custom/EnchantScroll;)Ljava/lang/String;
  #147 = InvokeDynamic      #0:#148       // #0:hashCode:(Lext/mods/gameserver/model/records/custom/EnchantScroll;)I
  #148 = NameAndType        #149:#150     // hashCode:(Lext/mods/gameserver/model/records/custom/EnchantScroll;)I
  #149 = Utf8               hashCode
  #150 = Utf8               (Lext/mods/gameserver/model/records/custom/EnchantScroll;)I
  #151 = InvokeDynamic      #0:#152       // #0:equals:(Lext/mods/gameserver/model/records/custom/EnchantScroll;Ljava/lang/Object;)Z
  #152 = NameAndType        #153:#154     // equals:(Lext/mods/gameserver/model/records/custom/EnchantScroll;Ljava/lang/Object;)Z
  #153 = Utf8               equals
  #154 = Utf8               (Lext/mods/gameserver/model/records/custom/EnchantScroll;Ljava/lang/Object;)Z
  #155 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #156 = Utf8               Code
  #157 = Utf8               LineNumberTable
  #158 = Utf8               LocalVariableTable
  #159 = Utf8               this
  #160 = Utf8               Lext/mods/gameserver/model/records/custom/EnchantScroll;
  #161 = Utf8               set
  #162 = Utf8               Lext/mods/commons/data/StatSet;
  #163 = Utf8               MethodParameters
  #164 = Utf8               item
  #165 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #166 = Utf8               level
  #167 = Utf8               StackMapTable
  #168 = Utf8               announceTheEnchant
  #169 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
  #170 = Utf8               isValid
  #171 = Utf8               ()Ljava/lang/String;
  #172 = Utf8               (Ljava/lang/Object;)Z
  #173 = Utf8               o
  #174 = Utf8               Ljava/lang/Object;
  #175 = Utf8               ()[I
  #176 = Utf8               SourceFile
  #177 = Utf8               EnchantScroll.java
  #178 = Utf8               Record
  #179 = Utf8               BootstrapMethods
  #180 = String             #181          // scrollId;grade;isWeapon;cristalize;returnVal;chance;chanceF;chanceM;message;enchants;enchantAmount;returnOnFail
  #181 = Utf8               scrollId;grade;isWeapon;cristalize;returnVal;chance;chanceF;chanceM;message;enchants;enchantAmount;returnOnFail
  #182 = MethodHandle       1:#7          // REF_getField ext/mods/gameserver/model/records/custom/EnchantScroll.scrollId:I
  #183 = MethodHandle       1:#13         // REF_getField ext/mods/gameserver/model/records/custom/EnchantScroll.grade:Lext/mods/gameserver/enums/items/CrystalType;
  #184 = MethodHandle       1:#17         // REF_getField ext/mods/gameserver/model/records/custom/EnchantScroll.isWeapon:Z
  #185 = MethodHandle       1:#21         // REF_getField ext/mods/gameserver/model/records/custom/EnchantScroll.cristalize:Z
  #186 = MethodHandle       1:#24         // REF_getField ext/mods/gameserver/model/records/custom/EnchantScroll.returnVal:I
  #187 = MethodHandle       1:#27         // REF_getField ext/mods/gameserver/model/records/custom/EnchantScroll.chance:[I
  #188 = MethodHandle       1:#31         // REF_getField ext/mods/gameserver/model/records/custom/EnchantScroll.chanceF:[I
  #189 = MethodHandle       1:#34         // REF_getField ext/mods/gameserver/model/records/custom/EnchantScroll.chanceM:[I
  #190 = MethodHandle       1:#37         // REF_getField ext/mods/gameserver/model/records/custom/EnchantScroll.message:Z
  #191 = MethodHandle       1:#40         // REF_getField ext/mods/gameserver/model/records/custom/EnchantScroll.enchants:[I
  #192 = MethodHandle       1:#43         // REF_getField ext/mods/gameserver/model/records/custom/EnchantScroll.enchantAmount:I
  #193 = MethodHandle       1:#46         // REF_getField ext/mods/gameserver/model/records/custom/EnchantScroll.returnOnFail:I
  #194 = MethodHandle       6:#195        // REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #195 = Methodref          #196.#197     // java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #196 = Class              #198          // java/lang/runtime/ObjectMethods
  #197 = NameAndType        #199:#200     // bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #198 = Utf8               java/lang/runtime/ObjectMethods
  #199 = Utf8               bootstrap
  #200 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #201 = Utf8               InnerClasses
  #202 = Class              #203          // java/lang/invoke/MethodHandles$Lookup
  #203 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #204 = Class              #205          // java/lang/invoke/MethodHandles
  #205 = Utf8               java/lang/invoke/MethodHandles
  #206 = Utf8               Lookup
{
  public ext.mods.gameserver.model.records.custom.EnchantScroll(ext.mods.commons.data.StatSet);
    descriptor: (Lext/mods/commons/data/StatSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=15, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: ldc           #49                 // String id
         4: invokevirtual #51                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
         7: aload_1
         8: ldc           #57                 // String grade
        10: ldc           #58                 // class ext/mods/gameserver/enums/items/CrystalType
        12: getstatic     #60                 // Field ext/mods/gameserver/enums/items/CrystalType.NONE:Lext/mods/gameserver/enums/items/CrystalType;
        15: invokevirtual #63                 // Method ext/mods/commons/data/StatSet.getEnum:(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Enum;)Ljava/lang/Enum;
        18: checkcast     #58                 // class ext/mods/gameserver/enums/items/CrystalType
        21: aload_1
        22: ldc           #67                 // String isWeapon
        24: invokevirtual #68                 // Method ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;)Z
        27: aload_1
        28: ldc           #72                 // String crystalize
        30: iconst_1
        31: invokevirtual #74                 // Method ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;Z)Z
        34: aload_1
        35: ldc           #77                 // String return
        37: iconst_0
        38: invokevirtual #79                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        41: aload_1
        42: ldc           #82                 // String rate
        44: getstatic     #84                 // Field ext/mods/commons/util/ArraysUtil.EMPTY_INT_ARRAY:[I
        47: invokevirtual #89                 // Method ext/mods/commons/data/StatSet.getIntegerArray:(Ljava/lang/String;[I)[I
        50: aload_1
        51: ldc           #93                 // String rateF
        53: getstatic     #84                 // Field ext/mods/commons/util/ArraysUtil.EMPTY_INT_ARRAY:[I
        56: invokevirtual #89                 // Method ext/mods/commons/data/StatSet.getIntegerArray:(Ljava/lang/String;[I)[I
        59: aload_1
        60: ldc           #95                 // String rateM
        62: getstatic     #84                 // Field ext/mods/commons/util/ArraysUtil.EMPTY_INT_ARRAY:[I
        65: invokevirtual #89                 // Method ext/mods/commons/data/StatSet.getIntegerArray:(Ljava/lang/String;[I)[I
        68: aload_1
        69: ldc           #97                 // String message
        71: iconst_0
        72: invokevirtual #74                 // Method ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;Z)Z
        75: aload_1
        76: ldc           #98                 // String enchants
        78: getstatic     #84                 // Field ext/mods/commons/util/ArraysUtil.EMPTY_INT_ARRAY:[I
        81: invokevirtual #89                 // Method ext/mods/commons/data/StatSet.getIntegerArray:(Ljava/lang/String;[I)[I
        84: aload_1
        85: ldc           #99                 // String enchantAmount
        87: iconst_1
        88: invokevirtual #79                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        91: aload_1
        92: ldc           #100                // String returnOnFail
        94: iconst_m1
        95: invokevirtual #79                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        98: invokespecial #101                // Method "<init>":(ILext/mods/gameserver/enums/items/CrystalType;ZZI[I[I[IZ[III)V
       101: return
      LineNumberTable:
        line 32: 0
        line 33: 101
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     102     0  this   Lext/mods/gameserver/model/records/custom/EnchantScroll;
            0     102     1   set   Lext/mods/commons/data/StatSet;

  public ext.mods.gameserver.model.records.custom.EnchantScroll(int, ext.mods.gameserver.enums.items.CrystalType, boolean, boolean, int, int[], int[], int[], boolean, int[], int, int);
    descriptor: (ILext/mods/gameserver/enums/items/CrystalType;ZZI[I[I[IZ[III)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=13, args_size=13
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Record."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #7                  // Field scrollId:I
         9: aload_0
        10: aload_2
        11: putfield      #13                 // Field grade:Lext/mods/gameserver/enums/items/CrystalType;
        14: aload_0
        15: iload_3
        16: putfield      #17                 // Field isWeapon:Z
        19: aload_0
        20: iload         4
        22: putfield      #21                 // Field cristalize:Z
        25: aload_0
        26: iload         5
        28: putfield      #24                 // Field returnVal:I
        31: aload_0
        32: aload         6
        34: putfield      #27                 // Field chance:[I
        37: aload_0
        38: aload         7
        40: putfield      #31                 // Field chanceF:[I
        43: aload_0
        44: aload         8
        46: putfield      #34                 // Field chanceM:[I
        49: aload_0
        50: iload         9
        52: putfield      #37                 // Field message:Z
        55: aload_0
        56: aload         10
        58: putfield      #40                 // Field enchants:[I
        61: aload_0
        62: iload         11
        64: putfield      #43                 // Field enchantAmount:I
        67: aload_0
        68: iload         12
        70: putfield      #46                 // Field returnOnFail:I
        73: return
      LineNumberTable:
        line 28: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      74     0  this   Lext/mods/gameserver/model/records/custom/EnchantScroll;
            0      74     1 scrollId   I
            0      74     2 grade   Lext/mods/gameserver/enums/items/CrystalType;
            0      74     3 isWeapon   Z
            0      74     4 cristalize   Z
            0      74     5 returnVal   I
            0      74     6 chance   [I
            0      74     7 chanceF   [I
            0      74     8 chanceM   [I
            0      74     9 message   Z
            0      74    10 enchants   [I
            0      74    11 enchantAmount   I
            0      74    12 returnOnFail   I
    MethodParameters:
      Name                           Flags
      scrollId
      grade
      isWeapon
      cristalize
      returnVal
      chance
      chanceF
      chanceM
      message
      enchants
      enchantAmount
      returnOnFail

  public int getChance(ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/item/instance/ItemInstance;)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_1
         1: invokevirtual #104                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
         4: istore_2
         5: aload_1
         6: invokevirtual #110                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
         9: invokevirtual #114                // Method ext/mods/gameserver/model/item/kind/Item.getBodyPart:()I
        12: ldc           #119                // int 32768
        14: if_icmpne     25
        17: iload_2
        18: iconst_4
        19: if_icmpgt     25
        22: bipush        100
        24: ireturn
        25: aload_0
        26: getfield      #27                 // Field chance:[I
        29: getstatic     #84                 // Field ext/mods/commons/util/ArraysUtil.EMPTY_INT_ARRAY:[I
        32: if_acmpne     114
        35: aload_1
        36: invokevirtual #110                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
        39: invokevirtual #120                // Method ext/mods/gameserver/model/item/kind/Item.getType2:()I
        42: ifne          114
        45: aload_0
        46: getfield      #17                 // Field isWeapon:Z
        49: ifeq          114
        52: aload_1
        53: invokevirtual #123                // Method ext/mods/gameserver/model/item/instance/ItemInstance.isWeapon:()Z
        56: ifeq          114
        59: aload_1
        60: invokevirtual #110                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
        63: checkcast     #126                // class ext/mods/gameserver/model/item/kind/Weapon
        66: invokevirtual #128                // Method ext/mods/gameserver/model/item/kind/Weapon.isMagical:()Z
        69: ifeq          94
        72: iload_2
        73: aload_0
        74: getfield      #34                 // Field chanceM:[I
        77: arraylength
        78: if_icmplt     85
        81: iconst_0
        82: goto          113
        85: aload_0
        86: getfield      #34                 // Field chanceM:[I
        89: iload_2
        90: iaload
        91: goto          113
        94: iload_2
        95: aload_0
        96: getfield      #31                 // Field chanceF:[I
        99: arraylength
       100: if_icmplt     107
       103: iconst_0
       104: goto          113
       107: aload_0
       108: getfield      #31                 // Field chanceF:[I
       111: iload_2
       112: iaload
       113: ireturn
       114: iload_2
       115: aload_0
       116: getfield      #27                 // Field chance:[I
       119: arraylength
       120: if_icmplt     127
       123: iconst_0
       124: goto          133
       127: aload_0
       128: getfield      #27                 // Field chance:[I
       131: iload_2
       132: iaload
       133: ireturn
      LineNumberTable:
        line 37: 0
        line 39: 5
        line 40: 22
        line 42: 25
        line 43: 59
        line 45: 114
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     134     0  this   Lext/mods/gameserver/model/records/custom/EnchantScroll;
            0     134     1  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            5     129     2 level   I
      StackMapTable: number_of_entries = 8
        frame_type = 252 /* append */
          offset_delta = 25
          locals = [ int ]
        frame_type = 59 /* same */
        frame_type = 8 /* same */
        frame_type = 12 /* same */
        frame_type = 69 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 0 /* same */
        frame_type = 12 /* same */
        frame_type = 69 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean announceTheEnchant(ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: ifnull        29
         4: aload_0
         5: getfield      #37                 // Field message:Z
         8: ifeq          29
        11: aload_0
        12: getfield      #40                 // Field enchants:[I
        15: aload_1
        16: invokevirtual #104                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
        19: invokestatic  #131                // Method ext/mods/commons/util/ArraysUtil.contains:([II)Z
        22: ifeq          29
        25: iconst_1
        26: goto          30
        29: iconst_0
        30: ireturn
      LineNumberTable:
        line 50: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0  this   Lext/mods/gameserver/model/records/custom/EnchantScroll;
            0      31     1  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 2
        frame_type = 29 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean isValid(ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #13                 // Field grade:Lext/mods/gameserver/enums/items/CrystalType;
         4: aload_1
         5: invokevirtual #110                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
         8: invokevirtual #135                // Method ext/mods/gameserver/model/item/kind/Item.getCrystalType:()Lext/mods/gameserver/enums/items/CrystalType;
        11: if_acmpeq     16
        14: iconst_0
        15: ireturn
        16: aload_0
        17: aload_1
        18: invokevirtual #139                // Method getChance:(Lext/mods/gameserver/model/item/instance/ItemInstance;)I
        21: ifne          26
        24: iconst_0
        25: ireturn
        26: aload_1
        27: invokevirtual #110                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
        30: invokevirtual #120                // Method ext/mods/gameserver/model/item/kind/Item.getType2:()I
        33: tableswitch   { // 0 to 2

                       0: 60

                       1: 65

                       2: 65
                 default: 78
            }
        60: aload_0
        61: getfield      #17                 // Field isWeapon:Z
        64: ireturn
        65: aload_0
        66: getfield      #17                 // Field isWeapon:Z
        69: ifne          76
        72: iconst_1
        73: goto          77
        76: iconst_0
        77: ireturn
        78: iconst_0
        79: ireturn
      LineNumberTable:
        line 55: 0
        line 56: 14
        line 58: 16
        line 59: 24
        line 61: 26
        line 64: 60
        line 67: 65
        line 69: 78
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      80     0  this   Lext/mods/gameserver/model/records/custom/EnchantScroll;
            0      80     1  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 7
        frame_type = 16 /* same */
        frame_type = 9 /* same */
        frame_type = 33 /* same */
        frame_type = 4 /* same */
        frame_type = 10 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 0 /* same */

  public final java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #143,  0            // InvokeDynamic #0:toString:(Lext/mods/gameserver/model/records/custom/EnchantScroll;)Ljava/lang/String;
         6: areturn
      LineNumberTable:
        line 28: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/records/custom/EnchantScroll;

  public final int hashCode();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #147,  0            // InvokeDynamic #0:hashCode:(Lext/mods/gameserver/model/records/custom/EnchantScroll;)I
         6: ireturn
      LineNumberTable:
        line 28: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/records/custom/EnchantScroll;

  public final boolean equals(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokedynamic #151,  0            // InvokeDynamic #0:equals:(Lext/mods/gameserver/model/records/custom/EnchantScroll;Ljava/lang/Object;)Z
         7: ireturn
      LineNumberTable:
        line 28: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/records/custom/EnchantScroll;
            0       8     1     o   Ljava/lang/Object;

  public int scrollId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field scrollId:I
         4: ireturn
      LineNumberTable:
        line 28: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/custom/EnchantScroll;

  public ext.mods.gameserver.enums.items.CrystalType grade();
    descriptor: ()Lext/mods/gameserver/enums/items/CrystalType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field grade:Lext/mods/gameserver/enums/items/CrystalType;
         4: areturn
      LineNumberTable:
        line 28: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/custom/EnchantScroll;

  public boolean isWeapon();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #17                 // Field isWeapon:Z
         4: ireturn
      LineNumberTable:
        line 28: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/custom/EnchantScroll;

  public boolean cristalize();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #21                 // Field cristalize:Z
         4: ireturn
      LineNumberTable:
        line 28: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/custom/EnchantScroll;

  public int returnVal();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #24                 // Field returnVal:I
         4: ireturn
      LineNumberTable:
        line 28: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/custom/EnchantScroll;

  public int[] chance();
    descriptor: ()[I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #27                 // Field chance:[I
         4: areturn
      LineNumberTable:
        line 28: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/custom/EnchantScroll;

  public int[] chanceF();
    descriptor: ()[I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #31                 // Field chanceF:[I
         4: areturn
      LineNumberTable:
        line 28: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/custom/EnchantScroll;

  public int[] chanceM();
    descriptor: ()[I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #34                 // Field chanceM:[I
         4: areturn
      LineNumberTable:
        line 28: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/custom/EnchantScroll;

  public boolean message();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #37                 // Field message:Z
         4: ireturn
      LineNumberTable:
        line 28: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/custom/EnchantScroll;

  public int[] enchants();
    descriptor: ()[I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #40                 // Field enchants:[I
         4: areturn
      LineNumberTable:
        line 28: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/custom/EnchantScroll;

  public int enchantAmount();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #43                 // Field enchantAmount:I
         4: ireturn
      LineNumberTable:
        line 28: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/custom/EnchantScroll;

  public int returnOnFail();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #46                 // Field returnOnFail:I
         4: ireturn
      LineNumberTable:
        line 28: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/custom/EnchantScroll;
}
SourceFile: "EnchantScroll.java"
  Record: length = 0x4A (unknown attribute)
   00 0C 00 0B 00 0C 00 00 00 0F 00 10 00 00 00 13
   00 14 00 00 00 17 00 14 00 00 00 1A 00 0C 00 00
   00 1D 00 1E 00 00 00 21 00 1E 00 00 00 24 00 1E
   00 00 00 27 00 14 00 00 00 2A 00 1E 00 00 00 2D
   00 0C 00 00 00 30 00 0C 00 00
BootstrapMethods:
  0: #194 REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
    Method arguments:
      #8 ext/mods/gameserver/model/records/custom/EnchantScroll
      #180 scrollId;grade;isWeapon;cristalize;returnVal;chance;chanceF;chanceM;message;enchants;enchantAmount;returnOnFail
      #182 REF_getField ext/mods/gameserver/model/records/custom/EnchantScroll.scrollId:I
      #183 REF_getField ext/mods/gameserver/model/records/custom/EnchantScroll.grade:Lext/mods/gameserver/enums/items/CrystalType;
      #184 REF_getField ext/mods/gameserver/model/records/custom/EnchantScroll.isWeapon:Z
      #185 REF_getField ext/mods/gameserver/model/records/custom/EnchantScroll.cristalize:Z
      #186 REF_getField ext/mods/gameserver/model/records/custom/EnchantScroll.returnVal:I
      #187 REF_getField ext/mods/gameserver/model/records/custom/EnchantScroll.chance:[I
      #188 REF_getField ext/mods/gameserver/model/records/custom/EnchantScroll.chanceF:[I
      #189 REF_getField ext/mods/gameserver/model/records/custom/EnchantScroll.chanceM:[I
      #190 REF_getField ext/mods/gameserver/model/records/custom/EnchantScroll.message:Z
      #191 REF_getField ext/mods/gameserver/model/records/custom/EnchantScroll.enchants:[I
      #192 REF_getField ext/mods/gameserver/model/records/custom/EnchantScroll.enchantAmount:I
      #193 REF_getField ext/mods/gameserver/model/records/custom/EnchantScroll.returnOnFail:I
InnerClasses:
  public static final #206= #202 of #204; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
