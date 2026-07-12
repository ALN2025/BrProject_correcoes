// Bytecode for: ext.mods.gameserver.model.records.Henna
// File: ext\mods\gameserver\model\records\Henna.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/records/Henna.class
  Last modified 9 de jul de 2026; size 3586 bytes
  MD5 checksum 040c8e5bf127a5638a68dbd545962e88
  Compiled from "Henna.java"
public final class ext.mods.gameserver.model.records.Henna extends java.lang.Record
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/records/Henna
  super_class: #2                         // java/lang/Record
  interfaces: 0, fields: 12, methods: 17, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Record."<init>":()V
    #2 = Class              #4            // java/lang/Record
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Record
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/records/Henna.symbolId:I
    #8 = Class              #10           // ext/mods/gameserver/model/records/Henna
    #9 = NameAndType        #11:#12       // symbolId:I
   #10 = Utf8               ext/mods/gameserver/model/records/Henna
   #11 = Utf8               symbolId
   #12 = Utf8               I
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/model/records/Henna.dyeId:I
   #14 = NameAndType        #15:#12       // dyeId:I
   #15 = Utf8               dyeId
   #16 = Fieldref           #8.#17        // ext/mods/gameserver/model/records/Henna.drawPrice:I
   #17 = NameAndType        #18:#12       // drawPrice:I
   #18 = Utf8               drawPrice
   #19 = Fieldref           #8.#20        // ext/mods/gameserver/model/records/Henna.INT:I
   #20 = NameAndType        #21:#12       // INT:I
   #21 = Utf8               INT
   #22 = Fieldref           #8.#23        // ext/mods/gameserver/model/records/Henna.STR:I
   #23 = NameAndType        #24:#12       // STR:I
   #24 = Utf8               STR
   #25 = Fieldref           #8.#26        // ext/mods/gameserver/model/records/Henna.CON:I
   #26 = NameAndType        #27:#12       // CON:I
   #27 = Utf8               CON
   #28 = Fieldref           #8.#29        // ext/mods/gameserver/model/records/Henna.MEN:I
   #29 = NameAndType        #30:#12       // MEN:I
   #30 = Utf8               MEN
   #31 = Fieldref           #8.#32        // ext/mods/gameserver/model/records/Henna.DEX:I
   #32 = NameAndType        #33:#12       // DEX:I
   #33 = Utf8               DEX
   #34 = Fieldref           #8.#35        // ext/mods/gameserver/model/records/Henna.WIT:I
   #35 = NameAndType        #36:#12       // WIT:I
   #36 = Utf8               WIT
   #37 = Fieldref           #8.#38        // ext/mods/gameserver/model/records/Henna.classes:[I
   #38 = NameAndType        #39:#40       // classes:[I
   #39 = Utf8               classes
   #40 = Utf8               [I
   #41 = String             #11           // symbolId
   #42 = Methodref          #43.#44       // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
   #43 = Class              #45           // ext/mods/commons/data/StatSet
   #44 = NameAndType        #46:#47       // getInteger:(Ljava/lang/String;)I
   #45 = Utf8               ext/mods/commons/data/StatSet
   #46 = Utf8               getInteger
   #47 = Utf8               (Ljava/lang/String;)I
   #48 = String             #15           // dyeId
   #49 = String             #50           // price
   #50 = Utf8               price
   #51 = Methodref          #43.#52       // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
   #52 = NameAndType        #46:#53       // getInteger:(Ljava/lang/String;I)I
   #53 = Utf8               (Ljava/lang/String;I)I
   #54 = String             #21           // INT
   #55 = String             #24           // STR
   #56 = String             #27           // CON
   #57 = String             #30           // MEN
   #58 = String             #33           // DEX
   #59 = String             #36           // WIT
   #60 = String             #39           // classes
   #61 = Methodref          #43.#62       // ext/mods/commons/data/StatSet.getIntegerArray:(Ljava/lang/String;)[I
   #62 = NameAndType        #63:#64       // getIntegerArray:(Ljava/lang/String;)[I
   #63 = Utf8               getIntegerArray
   #64 = Utf8               (Ljava/lang/String;)[I
   #65 = Methodref          #8.#66        // ext/mods/gameserver/model/records/Henna."<init>":(IIIIIIIII[I)V
   #66 = NameAndType        #5:#67        // "<init>":(IIIIIIIII[I)V
   #67 = Utf8               (IIIIIIIII[I)V
   #68 = Methodref          #69.#70       // ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
   #69 = Class              #71           // ext/mods/gameserver/model/actor/Player
   #70 = NameAndType        #72:#73       // getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
   #71 = Utf8               ext/mods/gameserver/model/actor/Player
   #72 = Utf8               getClassId
   #73 = Utf8               ()Lext/mods/gameserver/enums/actors/ClassId;
   #74 = Methodref          #75.#76       // ext/mods/gameserver/enums/actors/ClassId.getId:()I
   #75 = Class              #77           // ext/mods/gameserver/enums/actors/ClassId
   #76 = NameAndType        #78:#79       // getId:()I
   #77 = Utf8               ext/mods/gameserver/enums/actors/ClassId
   #78 = Utf8               getId
   #79 = Utf8               ()I
   #80 = Methodref          #81.#82       // ext/mods/commons/util/ArraysUtil.contains:([II)Z
   #81 = Class              #83           // ext/mods/commons/util/ArraysUtil
   #82 = NameAndType        #84:#85       // contains:([II)Z
   #83 = Utf8               ext/mods/commons/util/ArraysUtil
   #84 = Utf8               contains
   #85 = Utf8               ([II)Z
   #86 = InvokeDynamic      #0:#87        // #0:toString:(Lext/mods/gameserver/model/records/Henna;)Ljava/lang/String;
   #87 = NameAndType        #88:#89       // toString:(Lext/mods/gameserver/model/records/Henna;)Ljava/lang/String;
   #88 = Utf8               toString
   #89 = Utf8               (Lext/mods/gameserver/model/records/Henna;)Ljava/lang/String;
   #90 = InvokeDynamic      #0:#91        // #0:hashCode:(Lext/mods/gameserver/model/records/Henna;)I
   #91 = NameAndType        #92:#93       // hashCode:(Lext/mods/gameserver/model/records/Henna;)I
   #92 = Utf8               hashCode
   #93 = Utf8               (Lext/mods/gameserver/model/records/Henna;)I
   #94 = InvokeDynamic      #0:#95        // #0:equals:(Lext/mods/gameserver/model/records/Henna;Ljava/lang/Object;)Z
   #95 = NameAndType        #96:#97       // equals:(Lext/mods/gameserver/model/records/Henna;Ljava/lang/Object;)Z
   #96 = Utf8               equals
   #97 = Utf8               (Lext/mods/gameserver/model/records/Henna;Ljava/lang/Object;)Z
   #98 = Utf8               DRAW_AMOUNT
   #99 = Utf8               ConstantValue
  #100 = Integer            10
  #101 = Utf8               REMOVE_AMOUNT
  #102 = Integer            5
  #103 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #104 = Utf8               Code
  #105 = Utf8               LineNumberTable
  #106 = Utf8               LocalVariableTable
  #107 = Utf8               this
  #108 = Utf8               Lext/mods/gameserver/model/records/Henna;
  #109 = Utf8               set
  #110 = Utf8               Lext/mods/commons/data/StatSet;
  #111 = Utf8               MethodParameters
  #112 = Utf8               getRemovePrice
  #113 = Utf8               canBeUsedBy
  #114 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
  #115 = Utf8               player
  #116 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #117 = Utf8               ()Ljava/lang/String;
  #118 = Utf8               (Ljava/lang/Object;)Z
  #119 = Utf8               o
  #120 = Utf8               Ljava/lang/Object;
  #121 = Utf8               ()[I
  #122 = Utf8               SourceFile
  #123 = Utf8               Henna.java
  #124 = Utf8               Record
  #125 = Utf8               BootstrapMethods
  #126 = String             #127          // symbolId;dyeId;drawPrice;INT;STR;CON;MEN;DEX;WIT;classes
  #127 = Utf8               symbolId;dyeId;drawPrice;INT;STR;CON;MEN;DEX;WIT;classes
  #128 = MethodHandle       1:#7          // REF_getField ext/mods/gameserver/model/records/Henna.symbolId:I
  #129 = MethodHandle       1:#13         // REF_getField ext/mods/gameserver/model/records/Henna.dyeId:I
  #130 = MethodHandle       1:#16         // REF_getField ext/mods/gameserver/model/records/Henna.drawPrice:I
  #131 = MethodHandle       1:#19         // REF_getField ext/mods/gameserver/model/records/Henna.INT:I
  #132 = MethodHandle       1:#22         // REF_getField ext/mods/gameserver/model/records/Henna.STR:I
  #133 = MethodHandle       1:#25         // REF_getField ext/mods/gameserver/model/records/Henna.CON:I
  #134 = MethodHandle       1:#28         // REF_getField ext/mods/gameserver/model/records/Henna.MEN:I
  #135 = MethodHandle       1:#31         // REF_getField ext/mods/gameserver/model/records/Henna.DEX:I
  #136 = MethodHandle       1:#34         // REF_getField ext/mods/gameserver/model/records/Henna.WIT:I
  #137 = MethodHandle       1:#37         // REF_getField ext/mods/gameserver/model/records/Henna.classes:[I
  #138 = MethodHandle       6:#139        // REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #139 = Methodref          #140.#141     // java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #140 = Class              #142          // java/lang/runtime/ObjectMethods
  #141 = NameAndType        #143:#144     // bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #142 = Utf8               java/lang/runtime/ObjectMethods
  #143 = Utf8               bootstrap
  #144 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
  #145 = Utf8               InnerClasses
  #146 = Class              #147          // java/lang/invoke/MethodHandles$Lookup
  #147 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #148 = Class              #149          // java/lang/invoke/MethodHandles
  #149 = Utf8               java/lang/invoke/MethodHandles
  #150 = Utf8               Lookup
{
  public static final int DRAW_AMOUNT;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 10

  public static final int REMOVE_AMOUNT;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 5

  public ext.mods.gameserver.model.records.Henna(ext.mods.commons.data.StatSet);
    descriptor: (Lext/mods/commons/data/StatSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=12, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: ldc           #41                 // String symbolId
         4: invokevirtual #42                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
         7: aload_1
         8: ldc           #48                 // String dyeId
        10: invokevirtual #42                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        13: aload_1
        14: ldc           #49                 // String price
        16: iconst_0
        17: invokevirtual #51                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        20: aload_1
        21: ldc           #54                 // String INT
        23: iconst_0
        24: invokevirtual #51                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        27: aload_1
        28: ldc           #55                 // String STR
        30: iconst_0
        31: invokevirtual #51                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        34: aload_1
        35: ldc           #56                 // String CON
        37: iconst_0
        38: invokevirtual #51                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        41: aload_1
        42: ldc           #57                 // String MEN
        44: iconst_0
        45: invokevirtual #51                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        48: aload_1
        49: ldc           #58                 // String DEX
        51: iconst_0
        52: invokevirtual #51                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        55: aload_1
        56: ldc           #59                 // String WIT
        58: iconst_0
        59: invokevirtual #51                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        62: aload_1
        63: ldc           #60                 // String classes
        65: invokevirtual #61                 // Method ext/mods/commons/data/StatSet.getIntegerArray:(Ljava/lang/String;)[I
        68: invokespecial #65                 // Method "<init>":(IIIIIIIII[I)V
        71: return
      LineNumberTable:
        line 33: 0
        line 34: 71
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      72     0  this   Lext/mods/gameserver/model/records/Henna;
            0      72     1   set   Lext/mods/commons/data/StatSet;

  public ext.mods.gameserver.model.records.Henna(int, int, int, int, int, int, int, int, int, int[]);
    descriptor: (IIIIIIIII[I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=11, args_size=11
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Record."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #7                  // Field symbolId:I
         9: aload_0
        10: iload_2
        11: putfield      #13                 // Field dyeId:I
        14: aload_0
        15: iload_3
        16: putfield      #16                 // Field drawPrice:I
        19: aload_0
        20: iload         4
        22: putfield      #19                 // Field INT:I
        25: aload_0
        26: iload         5
        28: putfield      #22                 // Field STR:I
        31: aload_0
        32: iload         6
        34: putfield      #25                 // Field CON:I
        37: aload_0
        38: iload         7
        40: putfield      #28                 // Field MEN:I
        43: aload_0
        44: iload         8
        46: putfield      #31                 // Field DEX:I
        49: aload_0
        50: iload         9
        52: putfield      #34                 // Field WIT:I
        55: aload_0
        56: aload         10
        58: putfield      #37                 // Field classes:[I
        61: return
      LineNumberTable:
        line 25: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      62     0  this   Lext/mods/gameserver/model/records/Henna;
            0      62     1 symbolId   I
            0      62     2 dyeId   I
            0      62     3 drawPrice   I
            0      62     4   INT   I
            0      62     5   STR   I
            0      62     6   CON   I
            0      62     7   MEN   I
            0      62     8   DEX   I
            0      62     9   WIT   I
            0      62    10 classes   [I
    MethodParameters:
      Name                           Flags
      symbolId
      dyeId
      drawPrice
      INT
      STR
      CON
      MEN
      DEX
      WIT
      classes

  public int getRemovePrice();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field drawPrice:I
         4: iconst_5
         5: idiv
         6: ireturn
      LineNumberTable:
        line 38: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/records/Henna;

  public boolean canBeUsedBy(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #37                 // Field classes:[I
         4: aload_1
         5: invokevirtual #68                 // Method ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
         8: invokevirtual #74                 // Method ext/mods/gameserver/enums/actors/ClassId.getId:()I
        11: invokestatic  #80                 // Method ext/mods/commons/util/ArraysUtil.contains:([II)Z
        14: ireturn
      LineNumberTable:
        line 43: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/model/records/Henna;
            0      15     1 player   Lext/mods/gameserver/model/actor/Player;

  public final java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #86,  0             // InvokeDynamic #0:toString:(Lext/mods/gameserver/model/records/Henna;)Ljava/lang/String;
         6: areturn
      LineNumberTable:
        line 25: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/records/Henna;

  public final int hashCode();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #90,  0             // InvokeDynamic #0:hashCode:(Lext/mods/gameserver/model/records/Henna;)I
         6: ireturn
      LineNumberTable:
        line 25: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/records/Henna;

  public final boolean equals(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokedynamic #94,  0             // InvokeDynamic #0:equals:(Lext/mods/gameserver/model/records/Henna;Ljava/lang/Object;)Z
         7: ireturn
      LineNumberTable:
        line 25: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/records/Henna;
            0       8     1     o   Ljava/lang/Object;

  public int symbolId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field symbolId:I
         4: ireturn
      LineNumberTable:
        line 25: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/Henna;

  public int dyeId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field dyeId:I
         4: ireturn
      LineNumberTable:
        line 25: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/Henna;

  public int drawPrice();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field drawPrice:I
         4: ireturn
      LineNumberTable:
        line 25: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/Henna;

  public int INT();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field INT:I
         4: ireturn
      LineNumberTable:
        line 25: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/Henna;

  public int STR();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field STR:I
         4: ireturn
      LineNumberTable:
        line 25: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/Henna;

  public int CON();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #25                 // Field CON:I
         4: ireturn
      LineNumberTable:
        line 25: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/Henna;

  public int MEN();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #28                 // Field MEN:I
         4: ireturn
      LineNumberTable:
        line 25: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/Henna;

  public int DEX();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #31                 // Field DEX:I
         4: ireturn
      LineNumberTable:
        line 25: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/Henna;

  public int WIT();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #34                 // Field WIT:I
         4: ireturn
      LineNumberTable:
        line 25: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/Henna;

  public int[] classes();
    descriptor: ()[I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #37                 // Field classes:[I
         4: areturn
      LineNumberTable:
        line 25: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/records/Henna;
}
SourceFile: "Henna.java"
  Record: length = 0x3E (unknown attribute)
   00 0A 00 0B 00 0C 00 00 00 0F 00 0C 00 00 00 12
   00 0C 00 00 00 15 00 0C 00 00 00 18 00 0C 00 00
   00 1B 00 0C 00 00 00 1E 00 0C 00 00 00 21 00 0C
   00 00 00 24 00 0C 00 00 00 27 00 28 00 00
BootstrapMethods:
  0: #138 REF_invokeStatic java/lang/runtime/ObjectMethods.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/TypeDescriptor;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/Object;
    Method arguments:
      #8 ext/mods/gameserver/model/records/Henna
      #126 symbolId;dyeId;drawPrice;INT;STR;CON;MEN;DEX;WIT;classes
      #128 REF_getField ext/mods/gameserver/model/records/Henna.symbolId:I
      #129 REF_getField ext/mods/gameserver/model/records/Henna.dyeId:I
      #130 REF_getField ext/mods/gameserver/model/records/Henna.drawPrice:I
      #131 REF_getField ext/mods/gameserver/model/records/Henna.INT:I
      #132 REF_getField ext/mods/gameserver/model/records/Henna.STR:I
      #133 REF_getField ext/mods/gameserver/model/records/Henna.CON:I
      #134 REF_getField ext/mods/gameserver/model/records/Henna.MEN:I
      #135 REF_getField ext/mods/gameserver/model/records/Henna.DEX:I
      #136 REF_getField ext/mods/gameserver/model/records/Henna.WIT:I
      #137 REF_getField ext/mods/gameserver/model/records/Henna.classes:[I
InnerClasses:
  public static final #150= #146 of #148; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
