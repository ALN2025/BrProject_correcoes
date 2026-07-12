// Bytecode for: ext.mods.gameserver.enums.PeriodType
// File: ext\mods\gameserver\enums\PeriodType.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/enums/PeriodType.class
  Last modified 9 de jul de 2026; size 2174 bytes
  MD5 checksum 74952908b1099996f98c8a95eae65501
  Compiled from "PeriodType.java"
public final class ext.mods.gameserver.enums.PeriodType extends java.lang.Enum<ext.mods.gameserver.enums.PeriodType>
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/gameserver/enums/PeriodType
  super_class: #26                        // java/lang/Enum
  interfaces: 0, fields: 8, methods: 7, attributes: 2
Constant pool:
    #1 = Class              #2            // ext/mods/gameserver/enums/PeriodType
    #2 = Utf8               ext/mods/gameserver/enums/PeriodType
    #3 = Fieldref           #1.#4         // ext/mods/gameserver/enums/PeriodType.RECRUITING:Lext/mods/gameserver/enums/PeriodType;
    #4 = NameAndType        #5:#6         // RECRUITING:Lext/mods/gameserver/enums/PeriodType;
    #5 = Utf8               RECRUITING
    #6 = Utf8               Lext/mods/gameserver/enums/PeriodType;
    #7 = Fieldref           #1.#8         // ext/mods/gameserver/enums/PeriodType.COMPETITION:Lext/mods/gameserver/enums/PeriodType;
    #8 = NameAndType        #9:#6         // COMPETITION:Lext/mods/gameserver/enums/PeriodType;
    #9 = Utf8               COMPETITION
   #10 = Fieldref           #1.#11        // ext/mods/gameserver/enums/PeriodType.RESULTS:Lext/mods/gameserver/enums/PeriodType;
   #11 = NameAndType        #12:#6        // RESULTS:Lext/mods/gameserver/enums/PeriodType;
   #12 = Utf8               RESULTS
   #13 = Fieldref           #1.#14        // ext/mods/gameserver/enums/PeriodType.SEAL_VALIDATION:Lext/mods/gameserver/enums/PeriodType;
   #14 = NameAndType        #15:#6        // SEAL_VALIDATION:Lext/mods/gameserver/enums/PeriodType;
   #15 = Utf8               SEAL_VALIDATION
   #16 = Fieldref           #1.#17        // ext/mods/gameserver/enums/PeriodType.$VALUES:[Lext/mods/gameserver/enums/PeriodType;
   #17 = NameAndType        #18:#19       // $VALUES:[Lext/mods/gameserver/enums/PeriodType;
   #18 = Utf8               $VALUES
   #19 = Utf8               [Lext/mods/gameserver/enums/PeriodType;
   #20 = Methodref          #21.#22       // "[Lext/mods/gameserver/enums/PeriodType;".clone:()Ljava/lang/Object;
   #21 = Class              #19           // "[Lext/mods/gameserver/enums/PeriodType;"
   #22 = NameAndType        #23:#24       // clone:()Ljava/lang/Object;
   #23 = Utf8               clone
   #24 = Utf8               ()Ljava/lang/Object;
   #25 = Methodref          #26.#27       // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #26 = Class              #28           // java/lang/Enum
   #27 = NameAndType        #29:#30       // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #28 = Utf8               java/lang/Enum
   #29 = Utf8               valueOf
   #30 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #31 = Methodref          #26.#32       // java/lang/Enum."<init>":(Ljava/lang/String;I)V
   #32 = NameAndType        #33:#34       // "<init>":(Ljava/lang/String;I)V
   #33 = Utf8               <init>
   #34 = Utf8               (Ljava/lang/String;I)V
   #35 = Fieldref           #1.#36        // ext/mods/gameserver/enums/PeriodType._name:Ljava/lang/String;
   #36 = NameAndType        #37:#38       // _name:Ljava/lang/String;
   #37 = Utf8               _name
   #38 = Utf8               Ljava/lang/String;
   #39 = Fieldref           #1.#40        // ext/mods/gameserver/enums/PeriodType._smId:Lext/mods/gameserver/network/SystemMessageId;
   #40 = NameAndType        #41:#42       // _smId:Lext/mods/gameserver/network/SystemMessageId;
   #41 = Utf8               _smId
   #42 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #43 = String             #5            // RECRUITING
   #44 = String             #45           // Quest Event Initialization
   #45 = Utf8               Quest Event Initialization
   #46 = Fieldref           #47.#48       // ext/mods/gameserver/network/SystemMessageId.PREPARATIONS_PERIOD_BEGUN:Lext/mods/gameserver/network/SystemMessageId;
   #47 = Class              #49           // ext/mods/gameserver/network/SystemMessageId
   #48 = NameAndType        #50:#42       // PREPARATIONS_PERIOD_BEGUN:Lext/mods/gameserver/network/SystemMessageId;
   #49 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #50 = Utf8               PREPARATIONS_PERIOD_BEGUN
   #51 = Methodref          #1.#52        // ext/mods/gameserver/enums/PeriodType."<init>":(Ljava/lang/String;ILjava/lang/String;Lext/mods/gameserver/network/SystemMessageId;)V
   #52 = NameAndType        #33:#53       // "<init>":(Ljava/lang/String;ILjava/lang/String;Lext/mods/gameserver/network/SystemMessageId;)V
   #53 = Utf8               (Ljava/lang/String;ILjava/lang/String;Lext/mods/gameserver/network/SystemMessageId;)V
   #54 = String             #9            // COMPETITION
   #55 = String             #56           // Competition (Quest Event)
   #56 = Utf8               Competition (Quest Event)
   #57 = Fieldref           #47.#58       // ext/mods/gameserver/network/SystemMessageId.COMPETITION_PERIOD_BEGUN:Lext/mods/gameserver/network/SystemMessageId;
   #58 = NameAndType        #59:#42       // COMPETITION_PERIOD_BEGUN:Lext/mods/gameserver/network/SystemMessageId;
   #59 = Utf8               COMPETITION_PERIOD_BEGUN
   #60 = String             #12           // RESULTS
   #61 = String             #62           // Quest Event Results
   #62 = Utf8               Quest Event Results
   #63 = Fieldref           #47.#64       // ext/mods/gameserver/network/SystemMessageId.RESULTS_PERIOD_BEGUN:Lext/mods/gameserver/network/SystemMessageId;
   #64 = NameAndType        #65:#42       // RESULTS_PERIOD_BEGUN:Lext/mods/gameserver/network/SystemMessageId;
   #65 = Utf8               RESULTS_PERIOD_BEGUN
   #66 = String             #15           // SEAL_VALIDATION
   #67 = String             #68           // Seal Validation
   #68 = Utf8               Seal Validation
   #69 = Fieldref           #47.#70       // ext/mods/gameserver/network/SystemMessageId.VALIDATION_PERIOD_BEGUN:Lext/mods/gameserver/network/SystemMessageId;
   #70 = NameAndType        #71:#42       // VALIDATION_PERIOD_BEGUN:Lext/mods/gameserver/network/SystemMessageId;
   #71 = Utf8               VALIDATION_PERIOD_BEGUN
   #72 = Methodref          #1.#73        // ext/mods/gameserver/enums/PeriodType.$values:()[Lext/mods/gameserver/enums/PeriodType;
   #73 = NameAndType        #74:#75       // $values:()[Lext/mods/gameserver/enums/PeriodType;
   #74 = Utf8               $values
   #75 = Utf8               ()[Lext/mods/gameserver/enums/PeriodType;
   #76 = Methodref          #1.#77        // ext/mods/gameserver/enums/PeriodType.values:()[Lext/mods/gameserver/enums/PeriodType;
   #77 = NameAndType        #78:#75       // values:()[Lext/mods/gameserver/enums/PeriodType;
   #78 = Utf8               values
   #79 = Fieldref           #1.#80        // ext/mods/gameserver/enums/PeriodType.VALUES:[Lext/mods/gameserver/enums/PeriodType;
   #80 = NameAndType        #81:#19       // VALUES:[Lext/mods/gameserver/enums/PeriodType;
   #81 = Utf8               VALUES
   #82 = Utf8               Code
   #83 = Utf8               LineNumberTable
   #84 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/enums/PeriodType;
   #85 = Utf8               LocalVariableTable
   #86 = Utf8               name
   #87 = Utf8               MethodParameters
   #88 = Utf8               this
   #89 = Utf8               smId
   #90 = Utf8               Signature
   #91 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/network/SystemMessageId;)V
   #92 = Utf8               getName
   #93 = Utf8               ()Ljava/lang/String;
   #94 = Utf8               getMessageId
   #95 = Utf8               ()Lext/mods/gameserver/network/SystemMessageId;
   #96 = Utf8               <clinit>
   #97 = Utf8               ()V
   #98 = Utf8               Ljava/lang/Enum<Lext/mods/gameserver/enums/PeriodType;>;
   #99 = Utf8               SourceFile
  #100 = Utf8               PeriodType.java
{
  public static final ext.mods.gameserver.enums.PeriodType RECRUITING;
    descriptor: Lext/mods/gameserver/enums/PeriodType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.PeriodType COMPETITION;
    descriptor: Lext/mods/gameserver/enums/PeriodType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.PeriodType RESULTS;
    descriptor: Lext/mods/gameserver/enums/PeriodType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.PeriodType SEAL_VALIDATION;
    descriptor: Lext/mods/gameserver/enums/PeriodType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.PeriodType[] VALUES;
    descriptor: [Lext/mods/gameserver/enums/PeriodType;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL

  public static ext.mods.gameserver.enums.PeriodType[] values();
    descriptor: ()[Lext/mods/gameserver/enums/PeriodType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #16                 // Field $VALUES:[Lext/mods/gameserver/enums/PeriodType;
         3: invokevirtual #20                 // Method "[Lext/mods/gameserver/enums/PeriodType;".clone:()Ljava/lang/Object;
         6: checkcast     #21                 // class "[Lext/mods/gameserver/enums/PeriodType;"
         9: areturn
      LineNumberTable:
        line 22: 0

  public static ext.mods.gameserver.enums.PeriodType valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/enums/PeriodType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/gameserver/enums/PeriodType
         2: aload_0
         3: invokestatic  #25                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/gameserver/enums/PeriodType
         9: areturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  name   Ljava/lang/String;
    MethodParameters:
      Name                           Flags
      <no name>                      mandated

  public java.lang.String getName();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #35                 // Field _name:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 40: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/enums/PeriodType;

  public ext.mods.gameserver.network.SystemMessageId getMessageId();
    descriptor: ()Lext/mods/gameserver/network/SystemMessageId;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #39                 // Field _smId:Lext/mods/gameserver/network/SystemMessageId;
         4: areturn
      LineNumberTable:
        line 45: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/enums/PeriodType;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=6, locals=0, args_size=0
         0: new           #1                  // class ext/mods/gameserver/enums/PeriodType
         3: dup
         4: ldc           #43                 // String RECRUITING
         6: iconst_0
         7: ldc           #44                 // String Quest Event Initialization
         9: getstatic     #46                 // Field ext/mods/gameserver/network/SystemMessageId.PREPARATIONS_PERIOD_BEGUN:Lext/mods/gameserver/network/SystemMessageId;
        12: invokespecial #51                 // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Lext/mods/gameserver/network/SystemMessageId;)V
        15: putstatic     #3                  // Field RECRUITING:Lext/mods/gameserver/enums/PeriodType;
        18: new           #1                  // class ext/mods/gameserver/enums/PeriodType
        21: dup
        22: ldc           #54                 // String COMPETITION
        24: iconst_1
        25: ldc           #55                 // String Competition (Quest Event)
        27: getstatic     #57                 // Field ext/mods/gameserver/network/SystemMessageId.COMPETITION_PERIOD_BEGUN:Lext/mods/gameserver/network/SystemMessageId;
        30: invokespecial #51                 // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Lext/mods/gameserver/network/SystemMessageId;)V
        33: putstatic     #7                  // Field COMPETITION:Lext/mods/gameserver/enums/PeriodType;
        36: new           #1                  // class ext/mods/gameserver/enums/PeriodType
        39: dup
        40: ldc           #60                 // String RESULTS
        42: iconst_2
        43: ldc           #61                 // String Quest Event Results
        45: getstatic     #63                 // Field ext/mods/gameserver/network/SystemMessageId.RESULTS_PERIOD_BEGUN:Lext/mods/gameserver/network/SystemMessageId;
        48: invokespecial #51                 // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Lext/mods/gameserver/network/SystemMessageId;)V
        51: putstatic     #10                 // Field RESULTS:Lext/mods/gameserver/enums/PeriodType;
        54: new           #1                  // class ext/mods/gameserver/enums/PeriodType
        57: dup
        58: ldc           #66                 // String SEAL_VALIDATION
        60: iconst_3
        61: ldc           #67                 // String Seal Validation
        63: getstatic     #69                 // Field ext/mods/gameserver/network/SystemMessageId.VALIDATION_PERIOD_BEGUN:Lext/mods/gameserver/network/SystemMessageId;
        66: invokespecial #51                 // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Lext/mods/gameserver/network/SystemMessageId;)V
        69: putstatic     #13                 // Field SEAL_VALIDATION:Lext/mods/gameserver/enums/PeriodType;
        72: invokestatic  #72                 // Method $values:()[Lext/mods/gameserver/enums/PeriodType;
        75: putstatic     #16                 // Field $VALUES:[Lext/mods/gameserver/enums/PeriodType;
        78: invokestatic  #76                 // Method values:()[Lext/mods/gameserver/enums/PeriodType;
        81: putstatic     #79                 // Field VALUES:[Lext/mods/gameserver/enums/PeriodType;
        84: return
      LineNumberTable:
        line 24: 0
        line 25: 18
        line 26: 36
        line 27: 54
        line 22: 72
        line 48: 78
}
Signature: #98                          // Ljava/lang/Enum<Lext/mods/gameserver/enums/PeriodType;>;
SourceFile: "PeriodType.java"
