// Bytecode for: ext.mods.gameserver.enums.FestivalType
// File: ext\mods\gameserver\enums\FestivalType.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/enums/FestivalType.class
  Last modified 9 de jul de 2026; size 2018 bytes
  MD5 checksum 03359c02ebb49b817e5348d8d497c992
  Compiled from "FestivalType.java"
public final class ext.mods.gameserver.enums.FestivalType extends java.lang.Enum<ext.mods.gameserver.enums.FestivalType>
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/gameserver/enums/FestivalType
  super_class: #29                        // java/lang/Enum
  interfaces: 0, fields: 10, methods: 8, attributes: 2
Constant pool:
   #1 = Class              #2             // ext/mods/gameserver/enums/FestivalType
   #2 = Utf8               ext/mods/gameserver/enums/FestivalType
   #3 = Fieldref           #1.#4          // ext/mods/gameserver/enums/FestivalType.MAX_31:Lext/mods/gameserver/enums/FestivalType;
   #4 = NameAndType        #5:#6          // MAX_31:Lext/mods/gameserver/enums/FestivalType;
   #5 = Utf8               MAX_31
   #6 = Utf8               Lext/mods/gameserver/enums/FestivalType;
   #7 = Fieldref           #1.#8          // ext/mods/gameserver/enums/FestivalType.MAX_42:Lext/mods/gameserver/enums/FestivalType;
   #8 = NameAndType        #9:#6          // MAX_42:Lext/mods/gameserver/enums/FestivalType;
   #9 = Utf8               MAX_42
  #10 = Fieldref           #1.#11         // ext/mods/gameserver/enums/FestivalType.MAX_53:Lext/mods/gameserver/enums/FestivalType;
  #11 = NameAndType        #12:#6         // MAX_53:Lext/mods/gameserver/enums/FestivalType;
  #12 = Utf8               MAX_53
  #13 = Fieldref           #1.#14         // ext/mods/gameserver/enums/FestivalType.MAX_64:Lext/mods/gameserver/enums/FestivalType;
  #14 = NameAndType        #15:#6         // MAX_64:Lext/mods/gameserver/enums/FestivalType;
  #15 = Utf8               MAX_64
  #16 = Fieldref           #1.#17         // ext/mods/gameserver/enums/FestivalType.MAX_NONE:Lext/mods/gameserver/enums/FestivalType;
  #17 = NameAndType        #18:#6         // MAX_NONE:Lext/mods/gameserver/enums/FestivalType;
  #18 = Utf8               MAX_NONE
  #19 = Fieldref           #1.#20         // ext/mods/gameserver/enums/FestivalType.$VALUES:[Lext/mods/gameserver/enums/FestivalType;
  #20 = NameAndType        #21:#22        // $VALUES:[Lext/mods/gameserver/enums/FestivalType;
  #21 = Utf8               $VALUES
  #22 = Utf8               [Lext/mods/gameserver/enums/FestivalType;
  #23 = Methodref          #24.#25        // "[Lext/mods/gameserver/enums/FestivalType;".clone:()Ljava/lang/Object;
  #24 = Class              #22            // "[Lext/mods/gameserver/enums/FestivalType;"
  #25 = NameAndType        #26:#27        // clone:()Ljava/lang/Object;
  #26 = Utf8               clone
  #27 = Utf8               ()Ljava/lang/Object;
  #28 = Methodref          #29.#30        // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #29 = Class              #31            // java/lang/Enum
  #30 = NameAndType        #32:#33        // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #31 = Utf8               java/lang/Enum
  #32 = Utf8               valueOf
  #33 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #34 = Methodref          #29.#35        // java/lang/Enum."<init>":(Ljava/lang/String;I)V
  #35 = NameAndType        #36:#37        // "<init>":(Ljava/lang/String;I)V
  #36 = Utf8               <init>
  #37 = Utf8               (Ljava/lang/String;I)V
  #38 = Fieldref           #1.#39         // ext/mods/gameserver/enums/FestivalType._maxScore:I
  #39 = NameAndType        #40:#41        // _maxScore:I
  #40 = Utf8               _maxScore
  #41 = Utf8               I
  #42 = Fieldref           #1.#43         // ext/mods/gameserver/enums/FestivalType._name:Ljava/lang/String;
  #43 = NameAndType        #44:#45        // _name:Ljava/lang/String;
  #44 = Utf8               _name
  #45 = Utf8               Ljava/lang/String;
  #46 = Fieldref           #1.#47         // ext/mods/gameserver/enums/FestivalType._maxLevel:I
  #47 = NameAndType        #48:#41        // _maxLevel:I
  #48 = Utf8               _maxLevel
  #49 = String             #5             // MAX_31
  #50 = String             #51            // Level 31 or lower
  #51 = Utf8               Level 31 or lower
  #52 = Methodref          #1.#53         // ext/mods/gameserver/enums/FestivalType."<init>":(Ljava/lang/String;IILjava/lang/String;I)V
  #53 = NameAndType        #36:#54        // "<init>":(Ljava/lang/String;IILjava/lang/String;I)V
  #54 = Utf8               (Ljava/lang/String;IILjava/lang/String;I)V
  #55 = String             #9             // MAX_42
  #56 = String             #57            // Level 42 or lower
  #57 = Utf8               Level 42 or lower
  #58 = String             #12            // MAX_53
  #59 = String             #60            // Level 53 or lower
  #60 = Utf8               Level 53 or lower
  #61 = String             #15            // MAX_64
  #62 = String             #63            // Level 64 or lower
  #63 = Utf8               Level 64 or lower
  #64 = String             #18            // MAX_NONE
  #65 = String             #66            // No Level Limit
  #66 = Utf8               No Level Limit
  #67 = Methodref          #1.#68         // ext/mods/gameserver/enums/FestivalType.$values:()[Lext/mods/gameserver/enums/FestivalType;
  #68 = NameAndType        #69:#70        // $values:()[Lext/mods/gameserver/enums/FestivalType;
  #69 = Utf8               $values
  #70 = Utf8               ()[Lext/mods/gameserver/enums/FestivalType;
  #71 = Methodref          #1.#72         // ext/mods/gameserver/enums/FestivalType.values:()[Lext/mods/gameserver/enums/FestivalType;
  #72 = NameAndType        #73:#70        // values:()[Lext/mods/gameserver/enums/FestivalType;
  #73 = Utf8               values
  #74 = Fieldref           #1.#75         // ext/mods/gameserver/enums/FestivalType.VALUES:[Lext/mods/gameserver/enums/FestivalType;
  #75 = NameAndType        #76:#22        // VALUES:[Lext/mods/gameserver/enums/FestivalType;
  #76 = Utf8               VALUES
  #77 = Utf8               Code
  #78 = Utf8               LineNumberTable
  #79 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/enums/FestivalType;
  #80 = Utf8               LocalVariableTable
  #81 = Utf8               name
  #82 = Utf8               MethodParameters
  #83 = Utf8               this
  #84 = Utf8               maxScore
  #85 = Utf8               maxLevel
  #86 = Utf8               Signature
  #87 = Utf8               (ILjava/lang/String;I)V
  #88 = Utf8               getMaxScore
  #89 = Utf8               ()I
  #90 = Utf8               getName
  #91 = Utf8               ()Ljava/lang/String;
  #92 = Utf8               getMaxLevel
  #93 = Utf8               <clinit>
  #94 = Utf8               ()V
  #95 = Utf8               Ljava/lang/Enum<Lext/mods/gameserver/enums/FestivalType;>;
  #96 = Utf8               SourceFile
  #97 = Utf8               FestivalType.java
{
  public static final ext.mods.gameserver.enums.FestivalType MAX_31;
    descriptor: Lext/mods/gameserver/enums/FestivalType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.FestivalType MAX_42;
    descriptor: Lext/mods/gameserver/enums/FestivalType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.FestivalType MAX_53;
    descriptor: Lext/mods/gameserver/enums/FestivalType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.FestivalType MAX_64;
    descriptor: Lext/mods/gameserver/enums/FestivalType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.FestivalType MAX_NONE;
    descriptor: Lext/mods/gameserver/enums/FestivalType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.FestivalType[] VALUES;
    descriptor: [Lext/mods/gameserver/enums/FestivalType;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL

  public static ext.mods.gameserver.enums.FestivalType[] values();
    descriptor: ()[Lext/mods/gameserver/enums/FestivalType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #19                 // Field $VALUES:[Lext/mods/gameserver/enums/FestivalType;
         3: invokevirtual #23                 // Method "[Lext/mods/gameserver/enums/FestivalType;".clone:()Ljava/lang/Object;
         6: checkcast     #24                 // class "[Lext/mods/gameserver/enums/FestivalType;"
         9: areturn
      LineNumberTable:
        line 20: 0

  public static ext.mods.gameserver.enums.FestivalType valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/enums/FestivalType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/gameserver/enums/FestivalType
         2: aload_0
         3: invokestatic  #28                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/gameserver/enums/FestivalType
         9: areturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  name   Ljava/lang/String;
    MethodParameters:
      Name                           Flags
      <no name>                      mandated

  public int getMaxScore();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #38                 // Field _maxScore:I
         4: ireturn
      LineNumberTable:
        line 41: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/enums/FestivalType;

  public java.lang.String getName();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #42                 // Field _name:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 46: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/enums/FestivalType;

  public int getMaxLevel();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #46                 // Field _maxLevel:I
         4: ireturn
      LineNumberTable:
        line 51: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/enums/FestivalType;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=7, locals=0, args_size=0
         0: new           #1                  // class ext/mods/gameserver/enums/FestivalType
         3: dup
         4: ldc           #49                 // String MAX_31
         6: iconst_0
         7: bipush        60
         9: ldc           #50                 // String Level 31 or lower
        11: bipush        31
        13: invokespecial #52                 // Method "<init>":(Ljava/lang/String;IILjava/lang/String;I)V
        16: putstatic     #3                  // Field MAX_31:Lext/mods/gameserver/enums/FestivalType;
        19: new           #1                  // class ext/mods/gameserver/enums/FestivalType
        22: dup
        23: ldc           #55                 // String MAX_42
        25: iconst_1
        26: bipush        70
        28: ldc           #56                 // String Level 42 or lower
        30: bipush        42
        32: invokespecial #52                 // Method "<init>":(Ljava/lang/String;IILjava/lang/String;I)V
        35: putstatic     #7                  // Field MAX_42:Lext/mods/gameserver/enums/FestivalType;
        38: new           #1                  // class ext/mods/gameserver/enums/FestivalType
        41: dup
        42: ldc           #58                 // String MAX_53
        44: iconst_2
        45: bipush        100
        47: ldc           #59                 // String Level 53 or lower
        49: bipush        53
        51: invokespecial #52                 // Method "<init>":(Ljava/lang/String;IILjava/lang/String;I)V
        54: putstatic     #10                 // Field MAX_53:Lext/mods/gameserver/enums/FestivalType;
        57: new           #1                  // class ext/mods/gameserver/enums/FestivalType
        60: dup
        61: ldc           #61                 // String MAX_64
        63: iconst_3
        64: bipush        120
        66: ldc           #62                 // String Level 64 or lower
        68: bipush        64
        70: invokespecial #52                 // Method "<init>":(Ljava/lang/String;IILjava/lang/String;I)V
        73: putstatic     #13                 // Field MAX_64:Lext/mods/gameserver/enums/FestivalType;
        76: new           #1                  // class ext/mods/gameserver/enums/FestivalType
        79: dup
        80: ldc           #64                 // String MAX_NONE
        82: iconst_4
        83: sipush        150
        86: ldc           #65                 // String No Level Limit
        88: bipush        80
        90: invokespecial #52                 // Method "<init>":(Ljava/lang/String;IILjava/lang/String;I)V
        93: putstatic     #16                 // Field MAX_NONE:Lext/mods/gameserver/enums/FestivalType;
        96: invokestatic  #67                 // Method $values:()[Lext/mods/gameserver/enums/FestivalType;
        99: putstatic     #19                 // Field $VALUES:[Lext/mods/gameserver/enums/FestivalType;
       102: invokestatic  #71                 // Method values:()[Lext/mods/gameserver/enums/FestivalType;
       105: putstatic     #74                 // Field VALUES:[Lext/mods/gameserver/enums/FestivalType;
       108: return
      LineNumberTable:
        line 22: 0
        line 23: 19
        line 24: 38
        line 25: 57
        line 26: 76
        line 20: 96
        line 54: 102
}
Signature: #95                          // Ljava/lang/Enum<Lext/mods/gameserver/enums/FestivalType;>;
SourceFile: "FestivalType.java"
