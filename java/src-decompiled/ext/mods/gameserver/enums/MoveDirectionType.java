// Bytecode for: ext.mods.gameserver.enums.MoveDirectionType
// File: ext\mods\gameserver\enums\MoveDirectionType.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/enums/MoveDirectionType.class
  Last modified 9 de jul de 2026; size 3409 bytes
  MD5 checksum 14eb5665e28abca78ff47915c5bbae21
  Compiled from "MoveDirectionType.java"
public final class ext.mods.gameserver.enums.MoveDirectionType extends java.lang.Enum<ext.mods.gameserver.enums.MoveDirectionType>
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/gameserver/enums/MoveDirectionType
  super_class: #38                        // java/lang/Enum
  interfaces: 0, fields: 19, methods: 16, attributes: 2
Constant pool:
    #1 = Class              #2            // ext/mods/gameserver/enums/MoveDirectionType
    #2 = Utf8               ext/mods/gameserver/enums/MoveDirectionType
    #3 = Fieldref           #1.#4         // ext/mods/gameserver/enums/MoveDirectionType.N:Lext/mods/gameserver/enums/MoveDirectionType;
    #4 = NameAndType        #5:#6         // N:Lext/mods/gameserver/enums/MoveDirectionType;
    #5 = Utf8               N
    #6 = Utf8               Lext/mods/gameserver/enums/MoveDirectionType;
    #7 = Fieldref           #1.#8         // ext/mods/gameserver/enums/MoveDirectionType.S:Lext/mods/gameserver/enums/MoveDirectionType;
    #8 = NameAndType        #9:#6         // S:Lext/mods/gameserver/enums/MoveDirectionType;
    #9 = Utf8               S
   #10 = Fieldref           #1.#11        // ext/mods/gameserver/enums/MoveDirectionType.W:Lext/mods/gameserver/enums/MoveDirectionType;
   #11 = NameAndType        #12:#6        // W:Lext/mods/gameserver/enums/MoveDirectionType;
   #12 = Utf8               W
   #13 = Fieldref           #1.#14        // ext/mods/gameserver/enums/MoveDirectionType.E:Lext/mods/gameserver/enums/MoveDirectionType;
   #14 = NameAndType        #15:#6        // E:Lext/mods/gameserver/enums/MoveDirectionType;
   #15 = Utf8               E
   #16 = Fieldref           #1.#17        // ext/mods/gameserver/enums/MoveDirectionType.NW:Lext/mods/gameserver/enums/MoveDirectionType;
   #17 = NameAndType        #18:#6        // NW:Lext/mods/gameserver/enums/MoveDirectionType;
   #18 = Utf8               NW
   #19 = Fieldref           #1.#20        // ext/mods/gameserver/enums/MoveDirectionType.SW:Lext/mods/gameserver/enums/MoveDirectionType;
   #20 = NameAndType        #21:#6        // SW:Lext/mods/gameserver/enums/MoveDirectionType;
   #21 = Utf8               SW
   #22 = Fieldref           #1.#23        // ext/mods/gameserver/enums/MoveDirectionType.NE:Lext/mods/gameserver/enums/MoveDirectionType;
   #23 = NameAndType        #24:#6        // NE:Lext/mods/gameserver/enums/MoveDirectionType;
   #24 = Utf8               NE
   #25 = Fieldref           #1.#26        // ext/mods/gameserver/enums/MoveDirectionType.SE:Lext/mods/gameserver/enums/MoveDirectionType;
   #26 = NameAndType        #27:#6        // SE:Lext/mods/gameserver/enums/MoveDirectionType;
   #27 = Utf8               SE
   #28 = Fieldref           #1.#29        // ext/mods/gameserver/enums/MoveDirectionType.$VALUES:[Lext/mods/gameserver/enums/MoveDirectionType;
   #29 = NameAndType        #30:#31       // $VALUES:[Lext/mods/gameserver/enums/MoveDirectionType;
   #30 = Utf8               $VALUES
   #31 = Utf8               [Lext/mods/gameserver/enums/MoveDirectionType;
   #32 = Methodref          #33.#34       // "[Lext/mods/gameserver/enums/MoveDirectionType;".clone:()Ljava/lang/Object;
   #33 = Class              #31           // "[Lext/mods/gameserver/enums/MoveDirectionType;"
   #34 = NameAndType        #35:#36       // clone:()Ljava/lang/Object;
   #35 = Utf8               clone
   #36 = Utf8               ()Ljava/lang/Object;
   #37 = Methodref          #38.#39       // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #38 = Class              #40           // java/lang/Enum
   #39 = NameAndType        #41:#42       // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #40 = Utf8               java/lang/Enum
   #41 = Utf8               valueOf
   #42 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #43 = Methodref          #38.#44       // java/lang/Enum."<init>":(Ljava/lang/String;I)V
   #44 = NameAndType        #45:#46       // "<init>":(Ljava/lang/String;I)V
   #45 = Utf8               <init>
   #46 = Utf8               (Ljava/lang/String;I)V
   #47 = Class              #48           // ext/mods/gameserver/geoengine/geodata/GeoStructure
   #48 = Utf8               ext/mods/gameserver/geoengine/geodata/GeoStructure
   #49 = Fieldref           #1.#50        // ext/mods/gameserver/enums/MoveDirectionType._stepX:I
   #50 = NameAndType        #51:#52       // _stepX:I
   #51 = Utf8               _stepX
   #52 = Utf8               I
   #53 = Fieldref           #1.#54        // ext/mods/gameserver/enums/MoveDirectionType._stepY:I
   #54 = NameAndType        #55:#52       // _stepY:I
   #55 = Utf8               _stepY
   #56 = Fieldref           #1.#57        // ext/mods/gameserver/enums/MoveDirectionType._signumX:I
   #57 = NameAndType        #58:#52       // _signumX:I
   #58 = Utf8               _signumX
   #59 = Fieldref           #1.#60        // ext/mods/gameserver/enums/MoveDirectionType._signumY:I
   #60 = NameAndType        #61:#52       // _signumY:I
   #61 = Utf8               _signumY
   #62 = Fieldref           #1.#63        // ext/mods/gameserver/enums/MoveDirectionType._offsetX:I
   #63 = NameAndType        #64:#52       // _offsetX:I
   #64 = Utf8               _offsetX
   #65 = Fieldref           #1.#66        // ext/mods/gameserver/enums/MoveDirectionType._offsetY:I
   #66 = NameAndType        #67:#52       // _offsetY:I
   #67 = Utf8               _offsetY
   #68 = Fieldref           #1.#69        // ext/mods/gameserver/enums/MoveDirectionType._directionX:B
   #69 = NameAndType        #70:#71       // _directionX:B
   #70 = Utf8               _directionX
   #71 = Utf8               B
   #72 = Fieldref           #1.#73        // ext/mods/gameserver/enums/MoveDirectionType._directionY:B
   #73 = NameAndType        #74:#71       // _directionY:B
   #74 = Utf8               _directionY
   #75 = String             #12           // W
   #76 = String             #77           // -
   #77 = Utf8               -
   #78 = String             #15           // E
   #79 = Fieldref           #1.#80        // ext/mods/gameserver/enums/MoveDirectionType._symbolX:Ljava/lang/String;
   #80 = NameAndType        #81:#82       // _symbolX:Ljava/lang/String;
   #81 = Utf8               _symbolX
   #82 = Utf8               Ljava/lang/String;
   #83 = String             #5            // N
   #84 = String             #9            // S
   #85 = Fieldref           #1.#86        // ext/mods/gameserver/enums/MoveDirectionType._symbolY:Ljava/lang/String;
   #86 = NameAndType        #87:#82       // _symbolY:Ljava/lang/String;
   #87 = Utf8               _symbolY
   #88 = Methodref          #1.#89        // ext/mods/gameserver/enums/MoveDirectionType."<init>":(Ljava/lang/String;III)V
   #89 = NameAndType        #45:#90       // "<init>":(Ljava/lang/String;III)V
   #90 = Utf8               (Ljava/lang/String;III)V
   #91 = String             #18           // NW
   #92 = String             #21           // SW
   #93 = String             #24           // NE
   #94 = String             #27           // SE
   #95 = Methodref          #1.#96        // ext/mods/gameserver/enums/MoveDirectionType.$values:()[Lext/mods/gameserver/enums/MoveDirectionType;
   #96 = NameAndType        #97:#98       // $values:()[Lext/mods/gameserver/enums/MoveDirectionType;
   #97 = Utf8               $values
   #98 = Utf8               ()[Lext/mods/gameserver/enums/MoveDirectionType;
   #99 = Utf8               values
  #100 = Utf8               Code
  #101 = Utf8               LineNumberTable
  #102 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/enums/MoveDirectionType;
  #103 = Utf8               LocalVariableTable
  #104 = Utf8               name
  #105 = Utf8               MethodParameters
  #106 = Utf8               this
  #107 = Utf8               signumX
  #108 = Utf8               signumY
  #109 = Utf8               StackMapTable
  #110 = Class              #111          // java/lang/String
  #111 = Utf8               java/lang/String
  #112 = Utf8               Signature
  #113 = Utf8               (II)V
  #114 = Utf8               getStepX
  #115 = Utf8               ()I
  #116 = Utf8               getStepY
  #117 = Utf8               getSignumX
  #118 = Utf8               getSignumY
  #119 = Utf8               getOffsetX
  #120 = Utf8               getOffsetY
  #121 = Utf8               getDirectionX
  #122 = Utf8               ()B
  #123 = Utf8               getDirectionY
  #124 = Utf8               getSymbolX
  #125 = Utf8               ()Ljava/lang/String;
  #126 = Utf8               getSymbolY
  #127 = Utf8               getDirection
  #128 = Utf8               (II)Lext/mods/gameserver/enums/MoveDirectionType;
  #129 = Utf8               gdx
  #130 = Utf8               gdy
  #131 = Utf8               <clinit>
  #132 = Utf8               ()V
  #133 = Utf8               Ljava/lang/Enum<Lext/mods/gameserver/enums/MoveDirectionType;>;
  #134 = Utf8               SourceFile
  #135 = Utf8               MoveDirectionType.java
{
  public static final ext.mods.gameserver.enums.MoveDirectionType N;
    descriptor: Lext/mods/gameserver/enums/MoveDirectionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.MoveDirectionType S;
    descriptor: Lext/mods/gameserver/enums/MoveDirectionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.MoveDirectionType W;
    descriptor: Lext/mods/gameserver/enums/MoveDirectionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.MoveDirectionType E;
    descriptor: Lext/mods/gameserver/enums/MoveDirectionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.MoveDirectionType NW;
    descriptor: Lext/mods/gameserver/enums/MoveDirectionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.MoveDirectionType SW;
    descriptor: Lext/mods/gameserver/enums/MoveDirectionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.MoveDirectionType NE;
    descriptor: Lext/mods/gameserver/enums/MoveDirectionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.MoveDirectionType SE;
    descriptor: Lext/mods/gameserver/enums/MoveDirectionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  final int _stepX;
    descriptor: I
    flags: (0x0010) ACC_FINAL

  final int _stepY;
    descriptor: I
    flags: (0x0010) ACC_FINAL

  final int _signumX;
    descriptor: I
    flags: (0x0010) ACC_FINAL

  final int _signumY;
    descriptor: I
    flags: (0x0010) ACC_FINAL

  final int _offsetX;
    descriptor: I
    flags: (0x0010) ACC_FINAL

  final int _offsetY;
    descriptor: I
    flags: (0x0010) ACC_FINAL

  final byte _directionX;
    descriptor: B
    flags: (0x0010) ACC_FINAL

  final byte _directionY;
    descriptor: B
    flags: (0x0010) ACC_FINAL

  final java.lang.String _symbolX;
    descriptor: Ljava/lang/String;
    flags: (0x0010) ACC_FINAL

  final java.lang.String _symbolY;
    descriptor: Ljava/lang/String;
    flags: (0x0010) ACC_FINAL

  public static ext.mods.gameserver.enums.MoveDirectionType[] values();
    descriptor: ()[Lext/mods/gameserver/enums/MoveDirectionType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #28                 // Field $VALUES:[Lext/mods/gameserver/enums/MoveDirectionType;
         3: invokevirtual #32                 // Method "[Lext/mods/gameserver/enums/MoveDirectionType;".clone:()Ljava/lang/Object;
         6: checkcast     #33                 // class "[Lext/mods/gameserver/enums/MoveDirectionType;"
         9: areturn
      LineNumberTable:
        line 25: 0

  public static ext.mods.gameserver.enums.MoveDirectionType valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/enums/MoveDirectionType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/gameserver/enums/MoveDirectionType
         2: aload_0
         3: invokestatic  #37                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/gameserver/enums/MoveDirectionType
         9: areturn
      LineNumberTable:
        line 25: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  name   Ljava/lang/String;
    MethodParameters:
      Name                           Flags
      <no name>                      mandated

  public final int getStepX();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #49                 // Field _stepX:I
         4: ireturn
      LineNumberTable:
        line 67: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/enums/MoveDirectionType;

  public final int getStepY();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #53                 // Field _stepY:I
         4: ireturn
      LineNumberTable:
        line 72: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/enums/MoveDirectionType;

  public final int getSignumX();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #56                 // Field _signumX:I
         4: ireturn
      LineNumberTable:
        line 77: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/enums/MoveDirectionType;

  public final int getSignumY();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #59                 // Field _signumY:I
         4: ireturn
      LineNumberTable:
        line 82: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/enums/MoveDirectionType;

  public final int getOffsetX();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #62                 // Field _offsetX:I
         4: ireturn
      LineNumberTable:
        line 87: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/enums/MoveDirectionType;

  public final int getOffsetY();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #65                 // Field _offsetY:I
         4: ireturn
      LineNumberTable:
        line 92: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/enums/MoveDirectionType;

  public final byte getDirectionX();
    descriptor: ()B
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #68                 // Field _directionX:B
         4: ireturn
      LineNumberTable:
        line 97: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/enums/MoveDirectionType;

  public final byte getDirectionY();
    descriptor: ()B
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #72                 // Field _directionY:B
         4: ireturn
      LineNumberTable:
        line 102: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/enums/MoveDirectionType;

  public final java.lang.String getSymbolX();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #79                 // Field _symbolX:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 107: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/enums/MoveDirectionType;

  public final java.lang.String getSymbolY();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #85                 // Field _symbolY:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 112: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/enums/MoveDirectionType;

  public static final ext.mods.gameserver.enums.MoveDirectionType getDirection(int, int);
    descriptor: (II)Lext/mods/gameserver/enums/MoveDirectionType;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=1, locals=2, args_size=2
         0: iload_0
         1: ifne          18
         4: iload_1
         5: ifge          14
         8: getstatic     #3                  // Field N:Lext/mods/gameserver/enums/MoveDirectionType;
        11: goto          17
        14: getstatic     #7                  // Field S:Lext/mods/gameserver/enums/MoveDirectionType;
        17: areturn
        18: iload_1
        19: ifne          36
        22: iload_0
        23: ifge          32
        26: getstatic     #10                 // Field W:Lext/mods/gameserver/enums/MoveDirectionType;
        29: goto          35
        32: getstatic     #13                 // Field E:Lext/mods/gameserver/enums/MoveDirectionType;
        35: areturn
        36: iload_0
        37: ifle          54
        40: iload_1
        41: ifge          50
        44: getstatic     #22                 // Field NE:Lext/mods/gameserver/enums/MoveDirectionType;
        47: goto          53
        50: getstatic     #25                 // Field SE:Lext/mods/gameserver/enums/MoveDirectionType;
        53: areturn
        54: iload_1
        55: ifge          64
        58: getstatic     #16                 // Field NW:Lext/mods/gameserver/enums/MoveDirectionType;
        61: goto          67
        64: getstatic     #19                 // Field SW:Lext/mods/gameserver/enums/MoveDirectionType;
        67: areturn
      LineNumberTable:
        line 122: 0
        line 123: 4
        line 125: 18
        line 126: 22
        line 128: 36
        line 129: 40
        line 131: 54
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      68     0   gdx   I
            0      68     1   gdy   I
      StackMapTable: number_of_entries = 11
        frame_type = 14 /* same */
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/enums/MoveDirectionType ]
        frame_type = 0 /* same */
        frame_type = 13 /* same */
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/enums/MoveDirectionType ]
        frame_type = 0 /* same */
        frame_type = 13 /* same */
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/enums/MoveDirectionType ]
        frame_type = 0 /* same */
        frame_type = 9 /* same */
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/enums/MoveDirectionType ]

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=6, locals=0, args_size=0
         0: new           #1                  // class ext/mods/gameserver/enums/MoveDirectionType
         3: dup
         4: ldc           #83                 // String N
         6: iconst_0
         7: iconst_0
         8: iconst_m1
         9: invokespecial #88                 // Method "<init>":(Ljava/lang/String;III)V
        12: putstatic     #3                  // Field N:Lext/mods/gameserver/enums/MoveDirectionType;
        15: new           #1                  // class ext/mods/gameserver/enums/MoveDirectionType
        18: dup
        19: ldc           #84                 // String S
        21: iconst_1
        22: iconst_0
        23: iconst_1
        24: invokespecial #88                 // Method "<init>":(Ljava/lang/String;III)V
        27: putstatic     #7                  // Field S:Lext/mods/gameserver/enums/MoveDirectionType;
        30: new           #1                  // class ext/mods/gameserver/enums/MoveDirectionType
        33: dup
        34: ldc           #75                 // String W
        36: iconst_2
        37: iconst_m1
        38: iconst_0
        39: invokespecial #88                 // Method "<init>":(Ljava/lang/String;III)V
        42: putstatic     #10                 // Field W:Lext/mods/gameserver/enums/MoveDirectionType;
        45: new           #1                  // class ext/mods/gameserver/enums/MoveDirectionType
        48: dup
        49: ldc           #78                 // String E
        51: iconst_3
        52: iconst_1
        53: iconst_0
        54: invokespecial #88                 // Method "<init>":(Ljava/lang/String;III)V
        57: putstatic     #13                 // Field E:Lext/mods/gameserver/enums/MoveDirectionType;
        60: new           #1                  // class ext/mods/gameserver/enums/MoveDirectionType
        63: dup
        64: ldc           #91                 // String NW
        66: iconst_4
        67: iconst_m1
        68: iconst_m1
        69: invokespecial #88                 // Method "<init>":(Ljava/lang/String;III)V
        72: putstatic     #16                 // Field NW:Lext/mods/gameserver/enums/MoveDirectionType;
        75: new           #1                  // class ext/mods/gameserver/enums/MoveDirectionType
        78: dup
        79: ldc           #92                 // String SW
        81: iconst_5
        82: iconst_m1
        83: iconst_1
        84: invokespecial #88                 // Method "<init>":(Ljava/lang/String;III)V
        87: putstatic     #19                 // Field SW:Lext/mods/gameserver/enums/MoveDirectionType;
        90: new           #1                  // class ext/mods/gameserver/enums/MoveDirectionType
        93: dup
        94: ldc           #93                 // String NE
        96: bipush        6
        98: iconst_1
        99: iconst_m1
       100: invokespecial #88                 // Method "<init>":(Ljava/lang/String;III)V
       103: putstatic     #22                 // Field NE:Lext/mods/gameserver/enums/MoveDirectionType;
       106: new           #1                  // class ext/mods/gameserver/enums/MoveDirectionType
       109: dup
       110: ldc           #94                 // String SE
       112: bipush        7
       114: iconst_1
       115: iconst_1
       116: invokespecial #88                 // Method "<init>":(Ljava/lang/String;III)V
       119: putstatic     #25                 // Field SE:Lext/mods/gameserver/enums/MoveDirectionType;
       122: invokestatic  #95                 // Method $values:()[Lext/mods/gameserver/enums/MoveDirectionType;
       125: putstatic     #28                 // Field $VALUES:[Lext/mods/gameserver/enums/MoveDirectionType;
       128: return
      LineNumberTable:
        line 27: 0
        line 28: 15
        line 29: 30
        line 30: 45
        line 31: 60
        line 32: 75
        line 33: 90
        line 34: 106
        line 25: 122
}
Signature: #133                         // Ljava/lang/Enum<Lext/mods/gameserver/enums/MoveDirectionType;>;
SourceFile: "MoveDirectionType.java"
