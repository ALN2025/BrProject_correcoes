// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.model.Direction
// File: ext\mods\gameserver\geoengine\pathfinding\model\Direction.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/model/Direction.class
  Last modified 9 de jul de 2026; size 3103 bytes
  MD5 checksum a9f04b5b8085c0541fda306c3a4be96c
  Compiled from "Location.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.model.Direction extends java.lang.Enum<ext.mods.gameserver.geoengine.pathfinding.model.Direction>
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/model/Direction
  super_class: #5                         // java/lang/Enum
  interfaces: 0, fields: 14, methods: 9, attributes: 4
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/Direction
    #2 = Class              #1            // ext/mods/gameserver/geoengine/pathfinding/model/Direction
    #3 = Utf8               Ljava/lang/Enum<Lext/mods/gameserver/geoengine/pathfinding/model/Direction;>;
    #4 = Utf8               java/lang/Enum
    #5 = Class              #4            // java/lang/Enum
    #6 = Utf8               <init>
    #7 = Utf8               (Ljava/lang/String;IIII)V
    #8 = Utf8               (III)V
    #9 = Utf8               (Ljava/lang/String;I)V
   #10 = NameAndType        #6:#9         // "<init>":(Ljava/lang/String;I)V
   #11 = Methodref          #5.#10        // java/lang/Enum."<init>":(Ljava/lang/String;I)V
   #12 = Utf8               dx
   #13 = Utf8               I
   #14 = NameAndType        #12:#13       // dx:I
   #15 = Fieldref           #2.#14        // ext/mods/gameserver/geoengine/pathfinding/model/Direction.dx:I
   #16 = Utf8               dy
   #17 = NameAndType        #16:#13       // dy:I
   #18 = Fieldref           #2.#17        // ext/mods/gameserver/geoengine/pathfinding/model/Direction.dy:I
   #19 = Utf8               cost
   #20 = NameAndType        #19:#13       // cost:I
   #21 = Fieldref           #2.#20        // ext/mods/gameserver/geoengine/pathfinding/model/Direction.cost:I
   #22 = Utf8               this
   #23 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
   #24 = Utf8               $enum$name
   #25 = Utf8               Ljava/lang/String;
   #26 = Utf8               $enum$ordinal
   #27 = Utf8               getDx
   #28 = Utf8               ()I
   #29 = Utf8               getDy
   #30 = Utf8               getCost
   #31 = Utf8               values
   #32 = Utf8               ()[Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
   #33 = Utf8               $VALUES
   #34 = Utf8               [Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
   #35 = NameAndType        #33:#34       // $VALUES:[Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
   #36 = Fieldref           #2.#35        // ext/mods/gameserver/geoengine/pathfinding/model/Direction.$VALUES:[Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
   #37 = Utf8               java/lang/Object
   #38 = Class              #37           // java/lang/Object
   #39 = Utf8               clone
   #40 = Utf8               ()Ljava/lang/Object;
   #41 = NameAndType        #39:#40       // clone:()Ljava/lang/Object;
   #42 = Methodref          #38.#41       // java/lang/Object.clone:()Ljava/lang/Object;
   #43 = Class              #34           // "[Lext/mods/gameserver/geoengine/pathfinding/model/Direction;"
   #44 = Utf8               valueOf
   #45 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
   #46 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #47 = NameAndType        #44:#46       // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #48 = Methodref          #5.#47        // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #49 = Utf8               value
   #50 = Utf8               getEntries
   #51 = Utf8               ()Lkotlin/enums/EnumEntries;
   #52 = Utf8               ()Lkotlin/enums/EnumEntries<Lext/mods/gameserver/geoengine/pathfinding/model/Direction;>;
   #53 = Utf8               Lorg/jetbrains/annotations/NotNull;
   #54 = Utf8               $ENTRIES
   #55 = Utf8               Lkotlin/enums/EnumEntries;
   #56 = NameAndType        #54:#55       // $ENTRIES:Lkotlin/enums/EnumEntries;
   #57 = Fieldref           #2.#56        // ext/mods/gameserver/geoengine/pathfinding/model/Direction.$ENTRIES:Lkotlin/enums/EnumEntries;
   #58 = Utf8               $values
   #59 = Utf8               N
   #60 = NameAndType        #59:#23       // N:Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
   #61 = Fieldref           #2.#60        // ext/mods/gameserver/geoengine/pathfinding/model/Direction.N:Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
   #62 = Utf8               NE
   #63 = NameAndType        #62:#23       // NE:Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
   #64 = Fieldref           #2.#63        // ext/mods/gameserver/geoengine/pathfinding/model/Direction.NE:Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
   #65 = Utf8               E
   #66 = NameAndType        #65:#23       // E:Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
   #67 = Fieldref           #2.#66        // ext/mods/gameserver/geoengine/pathfinding/model/Direction.E:Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
   #68 = Utf8               SE
   #69 = NameAndType        #68:#23       // SE:Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
   #70 = Fieldref           #2.#69        // ext/mods/gameserver/geoengine/pathfinding/model/Direction.SE:Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
   #71 = Utf8               S
   #72 = NameAndType        #71:#23       // S:Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
   #73 = Fieldref           #2.#72        // ext/mods/gameserver/geoengine/pathfinding/model/Direction.S:Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
   #74 = Utf8               SW
   #75 = NameAndType        #74:#23       // SW:Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
   #76 = Fieldref           #2.#75        // ext/mods/gameserver/geoengine/pathfinding/model/Direction.SW:Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
   #77 = Utf8               W
   #78 = NameAndType        #77:#23       // W:Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
   #79 = Fieldref           #2.#78        // ext/mods/gameserver/geoengine/pathfinding/model/Direction.W:Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
   #80 = Utf8               NW
   #81 = NameAndType        #80:#23       // NW:Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
   #82 = Fieldref           #2.#81        // ext/mods/gameserver/geoengine/pathfinding/model/Direction.NW:Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
   #83 = Utf8               <clinit>
   #84 = Utf8               ()V
   #85 = String             #59           // N
   #86 = NameAndType        #6:#7         // "<init>":(Ljava/lang/String;IIII)V
   #87 = Methodref          #2.#86        // ext/mods/gameserver/geoengine/pathfinding/model/Direction."<init>":(Ljava/lang/String;IIII)V
   #88 = String             #62           // NE
   #89 = String             #65           // E
   #90 = String             #68           // SE
   #91 = String             #71           // S
   #92 = String             #74           // SW
   #93 = String             #77           // W
   #94 = String             #80           // NW
   #95 = NameAndType        #58:#32       // $values:()[Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
   #96 = Methodref          #2.#95        // ext/mods/gameserver/geoengine/pathfinding/model/Direction.$values:()[Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
   #97 = Utf8               [Ljava/lang/Enum;
   #98 = Class              #97           // "[Ljava/lang/Enum;"
   #99 = Utf8               kotlin/enums/EnumEntriesKt
  #100 = Class              #99           // kotlin/enums/EnumEntriesKt
  #101 = Utf8               enumEntries
  #102 = Utf8               ([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;
  #103 = NameAndType        #101:#102     // enumEntries:([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;
  #104 = Methodref          #100.#103     // kotlin/enums/EnumEntriesKt.enumEntries:([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;
  #105 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/Direction$Companion
  #106 = Class              #105          // ext/mods/gameserver/geoengine/pathfinding/model/Direction$Companion
  #107 = Utf8               (Lkotlin/jvm/internal/DefaultConstructorMarker;)V
  #108 = NameAndType        #6:#107       // "<init>":(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
  #109 = Methodref          #106.#108     // ext/mods/gameserver/geoengine/pathfinding/model/Direction$Companion."<init>":(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
  #110 = Utf8               Companion
  #111 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/Direction$Companion;
  #112 = NameAndType        #110:#111     // Companion:Lext/mods/gameserver/geoengine/pathfinding/model/Direction$Companion;
  #113 = Fieldref           #2.#112       // ext/mods/gameserver/geoengine/pathfinding/model/Direction.Companion:Lext/mods/gameserver/geoengine/pathfinding/model/Direction$Companion;
  #114 = Utf8               Lkotlin/Metadata;
  #115 = Utf8               mv
  #116 = Integer            2
  #117 = Integer            3
  #118 = Integer            0
  #119 = Utf8               k
  #120 = Integer            1
  #121 = Utf8               xi
  #122 = Integer            48
  #123 = Utf8               d1
  #124 = Utf8               \u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0014B!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0015
  #125 = Utf8               d2
  #126 = Utf8
  #127 = Utf8               Brproject
  #128 = Utf8               Location.kt
  #129 = Utf8               RuntimeInvisibleAnnotations
  #130 = Utf8               Code
  #131 = Utf8               LineNumberTable
  #132 = Utf8               LocalVariableTable
  #133 = Utf8               Signature
  #134 = Utf8               InnerClasses
  #135 = Utf8               SourceFile
  #136 = Utf8               RuntimeVisibleAnnotations
{
  public static final ext.mods.gameserver.geoengine.pathfinding.model.Direction$Companion Companion;
    descriptor: Lext/mods/gameserver/geoengine/pathfinding/model/Direction$Companion;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    RuntimeInvisibleAnnotations:
      0: #53()
        org.jetbrains.annotations.NotNull

  public static final ext.mods.gameserver.geoengine.pathfinding.model.Direction N;
    descriptor: Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.geoengine.pathfinding.model.Direction NE;
    descriptor: Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.geoengine.pathfinding.model.Direction E;
    descriptor: Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.geoengine.pathfinding.model.Direction SE;
    descriptor: Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.geoengine.pathfinding.model.Direction S;
    descriptor: Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.geoengine.pathfinding.model.Direction SW;
    descriptor: Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.geoengine.pathfinding.model.Direction W;
    descriptor: Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.geoengine.pathfinding.model.Direction NW;
    descriptor: Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public final int getDx();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #15                 // Field dx:I
         4: ireturn
      LineNumberTable:
        line 136: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/Direction;

  public final int getDy();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #18                 // Field dy:I
         4: ireturn
      LineNumberTable:
        line 136: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/Direction;

  public final int getCost();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #21                 // Field cost:I
         4: ireturn
      LineNumberTable:
        line 136: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/model/Direction;

  public static ext.mods.gameserver.geoengine.pathfinding.model.Direction[] values();
    descriptor: ()[Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #36                 // Field $VALUES:[Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
         3: invokevirtual #42                 // Method java/lang/Object.clone:()Ljava/lang/Object;
         6: checkcast     #43                 // class "[Lext/mods/gameserver/geoengine/pathfinding/model/Direction;"
         9: areturn

  public static ext.mods.gameserver.geoengine.pathfinding.model.Direction valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #2                  // class ext/mods/gameserver/geoengine/pathfinding/model/Direction
         2: aload_0
         3: invokestatic  #48                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #2                  // class ext/mods/gameserver/geoengine/pathfinding/model/Direction
         9: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0 value   Ljava/lang/String;

  public static kotlin.enums.EnumEntries<ext.mods.gameserver.geoengine.pathfinding.model.Direction> getEntries();
    descriptor: ()Lkotlin/enums/EnumEntries;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #57                 // Field $ENTRIES:Lkotlin/enums/EnumEntries;
         3: areturn
    Signature: #52                          // ()Lkotlin/enums/EnumEntries<Lext/mods/gameserver/geoengine/pathfinding/model/Direction;>;
    RuntimeInvisibleAnnotations:
      0: #53()
        org.jetbrains.annotations.NotNull

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=7, locals=0, args_size=0
         0: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/model/Direction
         3: dup
         4: ldc           #85                 // String N
         6: iconst_0
         7: iconst_0
         8: iconst_m1
         9: bipush        10
        11: invokespecial #87                 // Method "<init>":(Ljava/lang/String;IIII)V
        14: putstatic     #61                 // Field N:Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
        17: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/model/Direction
        20: dup
        21: ldc           #88                 // String NE
        23: iconst_1
        24: iconst_1
        25: iconst_m1
        26: bipush        14
        28: invokespecial #87                 // Method "<init>":(Ljava/lang/String;IIII)V
        31: putstatic     #64                 // Field NE:Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
        34: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/model/Direction
        37: dup
        38: ldc           #89                 // String E
        40: iconst_2
        41: iconst_1
        42: iconst_0
        43: bipush        10
        45: invokespecial #87                 // Method "<init>":(Ljava/lang/String;IIII)V
        48: putstatic     #67                 // Field E:Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
        51: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/model/Direction
        54: dup
        55: ldc           #90                 // String SE
        57: iconst_3
        58: iconst_1
        59: iconst_1
        60: bipush        14
        62: invokespecial #87                 // Method "<init>":(Ljava/lang/String;IIII)V
        65: putstatic     #70                 // Field SE:Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
        68: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/model/Direction
        71: dup
        72: ldc           #91                 // String S
        74: iconst_4
        75: iconst_0
        76: iconst_1
        77: bipush        10
        79: invokespecial #87                 // Method "<init>":(Ljava/lang/String;IIII)V
        82: putstatic     #73                 // Field S:Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
        85: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/model/Direction
        88: dup
        89: ldc           #92                 // String SW
        91: iconst_5
        92: iconst_m1
        93: iconst_1
        94: bipush        14
        96: invokespecial #87                 // Method "<init>":(Ljava/lang/String;IIII)V
        99: putstatic     #76                 // Field SW:Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
       102: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/model/Direction
       105: dup
       106: ldc           #93                 // String W
       108: bipush        6
       110: iconst_m1
       111: iconst_0
       112: bipush        10
       114: invokespecial #87                 // Method "<init>":(Ljava/lang/String;IIII)V
       117: putstatic     #79                 // Field W:Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
       120: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/model/Direction
       123: dup
       124: ldc           #94                 // String NW
       126: bipush        7
       128: iconst_m1
       129: iconst_m1
       130: bipush        14
       132: invokespecial #87                 // Method "<init>":(Ljava/lang/String;IIII)V
       135: putstatic     #82                 // Field NW:Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
       138: invokestatic  #96                 // Method $values:()[Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
       141: putstatic     #36                 // Field $VALUES:[Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
       144: getstatic     #36                 // Field $VALUES:[Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
       147: checkcast     #98                 // class "[Ljava/lang/Enum;"
       150: invokestatic  #104                // Method kotlin/enums/EnumEntriesKt.enumEntries:([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;
       153: putstatic     #57                 // Field $ENTRIES:Lkotlin/enums/EnumEntries;
       156: new           #106                // class ext/mods/gameserver/geoengine/pathfinding/model/Direction$Companion
       159: dup
       160: aconst_null
       161: invokespecial #109                // Method ext/mods/gameserver/geoengine/pathfinding/model/Direction$Companion."<init>":(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
       164: putstatic     #113                // Field Companion:Lext/mods/gameserver/geoengine/pathfinding/model/Direction$Companion;
       167: return
      LineNumberTable:
        line 137: 0
        line 138: 17
        line 139: 34
        line 140: 51
        line 141: 68
        line 142: 85
        line 143: 102
        line 144: 120
}
InnerClasses:
  public static final #110= #106 of #2;   // Companion=class ext/mods/gameserver/geoengine/pathfinding/model/Direction$Companion of class ext/mods/gameserver/geoengine/pathfinding/model/Direction
Signature: #3                           // Ljava/lang/Enum<Lext/mods/gameserver/geoengine/pathfinding/model/Direction;>;
SourceFile: "Location.kt"
RuntimeVisibleAnnotations:
  0: #114(#115=[I#116,I#117,I#118],#119=I#120,#121=I#122,#123=[s#124],#125=[s#23,s#126,s#12,s#126,s#16,s#19,s#6,s#7,s#27,s#28,s#29,s#30,s#59,s#62,s#65,s#68,s#71,s#74,s#77,s#80,s#110,s#127])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0014B!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0015"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/model/Direction;","","dx","","dy","cost","<init>","(Ljava/lang/String;IIII)V","getDx","()I","getDy","getCost","N","NE","E","SE","S","SW","W","NW","Companion","Brproject"]
    )
