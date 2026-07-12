// Bytecode for: ext.mods.gameserver.enums.actors.WeightPenalty
// File: ext\mods\gameserver\enums\actors\WeightPenalty.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/enums/actors/WeightPenalty.class
  Last modified 9 de jul de 2026; size 1800 bytes
  MD5 checksum 2426f3772d1d396ed776abd7e034b6d1
  Compiled from "WeightPenalty.java"
public final class ext.mods.gameserver.enums.actors.WeightPenalty extends java.lang.Enum<ext.mods.gameserver.enums.actors.WeightPenalty>
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/gameserver/enums/actors/WeightPenalty
  super_class: #29                        // java/lang/Enum
  interfaces: 0, fields: 8, methods: 7, attributes: 2
Constant pool:
   #1 = Class              #2             // ext/mods/gameserver/enums/actors/WeightPenalty
   #2 = Utf8               ext/mods/gameserver/enums/actors/WeightPenalty
   #3 = Fieldref           #1.#4          // ext/mods/gameserver/enums/actors/WeightPenalty.NONE:Lext/mods/gameserver/enums/actors/WeightPenalty;
   #4 = NameAndType        #5:#6          // NONE:Lext/mods/gameserver/enums/actors/WeightPenalty;
   #5 = Utf8               NONE
   #6 = Utf8               Lext/mods/gameserver/enums/actors/WeightPenalty;
   #7 = Fieldref           #1.#8          // ext/mods/gameserver/enums/actors/WeightPenalty.LEVEL_1:Lext/mods/gameserver/enums/actors/WeightPenalty;
   #8 = NameAndType        #9:#6          // LEVEL_1:Lext/mods/gameserver/enums/actors/WeightPenalty;
   #9 = Utf8               LEVEL_1
  #10 = Fieldref           #1.#11         // ext/mods/gameserver/enums/actors/WeightPenalty.LEVEL_2:Lext/mods/gameserver/enums/actors/WeightPenalty;
  #11 = NameAndType        #12:#6         // LEVEL_2:Lext/mods/gameserver/enums/actors/WeightPenalty;
  #12 = Utf8               LEVEL_2
  #13 = Fieldref           #1.#14         // ext/mods/gameserver/enums/actors/WeightPenalty.LEVEL_3:Lext/mods/gameserver/enums/actors/WeightPenalty;
  #14 = NameAndType        #15:#6         // LEVEL_3:Lext/mods/gameserver/enums/actors/WeightPenalty;
  #15 = Utf8               LEVEL_3
  #16 = Fieldref           #1.#17         // ext/mods/gameserver/enums/actors/WeightPenalty.LEVEL_4:Lext/mods/gameserver/enums/actors/WeightPenalty;
  #17 = NameAndType        #18:#6         // LEVEL_4:Lext/mods/gameserver/enums/actors/WeightPenalty;
  #18 = Utf8               LEVEL_4
  #19 = Fieldref           #1.#20         // ext/mods/gameserver/enums/actors/WeightPenalty.$VALUES:[Lext/mods/gameserver/enums/actors/WeightPenalty;
  #20 = NameAndType        #21:#22        // $VALUES:[Lext/mods/gameserver/enums/actors/WeightPenalty;
  #21 = Utf8               $VALUES
  #22 = Utf8               [Lext/mods/gameserver/enums/actors/WeightPenalty;
  #23 = Methodref          #24.#25        // "[Lext/mods/gameserver/enums/actors/WeightPenalty;".clone:()Ljava/lang/Object;
  #24 = Class              #22            // "[Lext/mods/gameserver/enums/actors/WeightPenalty;"
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
  #38 = Fieldref           #1.#39         // ext/mods/gameserver/enums/actors/WeightPenalty._speedMultiplier:D
  #39 = NameAndType        #40:#41        // _speedMultiplier:D
  #40 = Utf8               _speedMultiplier
  #41 = Utf8               D
  #42 = Fieldref           #1.#43         // ext/mods/gameserver/enums/actors/WeightPenalty._regenerationMultiplier:D
  #43 = NameAndType        #44:#41        // _regenerationMultiplier:D
  #44 = Utf8               _regenerationMultiplier
  #45 = String             #5             // NONE
  #46 = Methodref          #1.#47         // ext/mods/gameserver/enums/actors/WeightPenalty."<init>":(Ljava/lang/String;IDD)V
  #47 = NameAndType        #36:#48        // "<init>":(Ljava/lang/String;IDD)V
  #48 = Utf8               (Ljava/lang/String;IDD)V
  #49 = String             #9             // LEVEL_1
  #50 = Double             0.5d
  #52 = String             #12            // LEVEL_2
  #53 = String             #15            // LEVEL_3
  #54 = String             #18            // LEVEL_4
  #55 = Double             0.1d
  #57 = Methodref          #1.#58         // ext/mods/gameserver/enums/actors/WeightPenalty.$values:()[Lext/mods/gameserver/enums/actors/WeightPenalty;
  #58 = NameAndType        #59:#60        // $values:()[Lext/mods/gameserver/enums/actors/WeightPenalty;
  #59 = Utf8               $values
  #60 = Utf8               ()[Lext/mods/gameserver/enums/actors/WeightPenalty;
  #61 = Utf8               values
  #62 = Utf8               Code
  #63 = Utf8               LineNumberTable
  #64 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/enums/actors/WeightPenalty;
  #65 = Utf8               LocalVariableTable
  #66 = Utf8               name
  #67 = Utf8               Ljava/lang/String;
  #68 = Utf8               MethodParameters
  #69 = Utf8               this
  #70 = Utf8               speedMultiplier
  #71 = Utf8               regenerationMultiplier
  #72 = Utf8               Signature
  #73 = Utf8               (DD)V
  #74 = Utf8               getSpeedMultiplier
  #75 = Utf8               ()D
  #76 = Utf8               getRegenerationMultiplier
  #77 = Utf8               <clinit>
  #78 = Utf8               ()V
  #79 = Utf8               Ljava/lang/Enum<Lext/mods/gameserver/enums/actors/WeightPenalty;>;
  #80 = Utf8               SourceFile
  #81 = Utf8               WeightPenalty.java
{
  public static final ext.mods.gameserver.enums.actors.WeightPenalty NONE;
    descriptor: Lext/mods/gameserver/enums/actors/WeightPenalty;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.WeightPenalty LEVEL_1;
    descriptor: Lext/mods/gameserver/enums/actors/WeightPenalty;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.WeightPenalty LEVEL_2;
    descriptor: Lext/mods/gameserver/enums/actors/WeightPenalty;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.WeightPenalty LEVEL_3;
    descriptor: Lext/mods/gameserver/enums/actors/WeightPenalty;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.WeightPenalty LEVEL_4;
    descriptor: Lext/mods/gameserver/enums/actors/WeightPenalty;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static ext.mods.gameserver.enums.actors.WeightPenalty[] values();
    descriptor: ()[Lext/mods/gameserver/enums/actors/WeightPenalty;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #19                 // Field $VALUES:[Lext/mods/gameserver/enums/actors/WeightPenalty;
         3: invokevirtual #23                 // Method "[Lext/mods/gameserver/enums/actors/WeightPenalty;".clone:()Ljava/lang/Object;
         6: checkcast     #24                 // class "[Lext/mods/gameserver/enums/actors/WeightPenalty;"
         9: areturn
      LineNumberTable:
        line 20: 0

  public static ext.mods.gameserver.enums.actors.WeightPenalty valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/enums/actors/WeightPenalty;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/gameserver/enums/actors/WeightPenalty
         2: aload_0
         3: invokestatic  #28                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/gameserver/enums/actors/WeightPenalty
         9: areturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  name   Ljava/lang/String;
    MethodParameters:
      Name                           Flags
      <no name>                      mandated

  public double getSpeedMultiplier();
    descriptor: ()D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #38                 // Field _speedMultiplier:D
         4: dreturn
      LineNumberTable:
        line 39: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/enums/actors/WeightPenalty;

  public double getRegenerationMultiplier();
    descriptor: ()D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #42                 // Field _regenerationMultiplier:D
         4: dreturn
      LineNumberTable:
        line 44: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/enums/actors/WeightPenalty;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=8, locals=0, args_size=0
         0: new           #1                  // class ext/mods/gameserver/enums/actors/WeightPenalty
         3: dup
         4: ldc           #45                 // String NONE
         6: iconst_0
         7: dconst_1
         8: dconst_1
         9: invokespecial #46                 // Method "<init>":(Ljava/lang/String;IDD)V
        12: putstatic     #3                  // Field NONE:Lext/mods/gameserver/enums/actors/WeightPenalty;
        15: new           #1                  // class ext/mods/gameserver/enums/actors/WeightPenalty
        18: dup
        19: ldc           #49                 // String LEVEL_1
        21: iconst_1
        22: dconst_1
        23: ldc2_w        #50                 // double 0.5d
        26: invokespecial #46                 // Method "<init>":(Ljava/lang/String;IDD)V
        29: putstatic     #7                  // Field LEVEL_1:Lext/mods/gameserver/enums/actors/WeightPenalty;
        32: new           #1                  // class ext/mods/gameserver/enums/actors/WeightPenalty
        35: dup
        36: ldc           #52                 // String LEVEL_2
        38: iconst_2
        39: ldc2_w        #50                 // double 0.5d
        42: ldc2_w        #50                 // double 0.5d
        45: invokespecial #46                 // Method "<init>":(Ljava/lang/String;IDD)V
        48: putstatic     #10                 // Field LEVEL_2:Lext/mods/gameserver/enums/actors/WeightPenalty;
        51: new           #1                  // class ext/mods/gameserver/enums/actors/WeightPenalty
        54: dup
        55: ldc           #53                 // String LEVEL_3
        57: iconst_3
        58: ldc2_w        #50                 // double 0.5d
        61: ldc2_w        #50                 // double 0.5d
        64: invokespecial #46                 // Method "<init>":(Ljava/lang/String;IDD)V
        67: putstatic     #13                 // Field LEVEL_3:Lext/mods/gameserver/enums/actors/WeightPenalty;
        70: new           #1                  // class ext/mods/gameserver/enums/actors/WeightPenalty
        73: dup
        74: ldc           #54                 // String LEVEL_4
        76: iconst_4
        77: dconst_0
        78: ldc2_w        #55                 // double 0.1d
        81: invokespecial #46                 // Method "<init>":(Ljava/lang/String;IDD)V
        84: putstatic     #16                 // Field LEVEL_4:Lext/mods/gameserver/enums/actors/WeightPenalty;
        87: invokestatic  #57                 // Method $values:()[Lext/mods/gameserver/enums/actors/WeightPenalty;
        90: putstatic     #19                 // Field $VALUES:[Lext/mods/gameserver/enums/actors/WeightPenalty;
        93: return
      LineNumberTable:
        line 22: 0
        line 23: 15
        line 24: 32
        line 25: 51
        line 26: 70
        line 20: 87
}
Signature: #79                          // Ljava/lang/Enum<Lext/mods/gameserver/enums/actors/WeightPenalty;>;
SourceFile: "WeightPenalty.java"
