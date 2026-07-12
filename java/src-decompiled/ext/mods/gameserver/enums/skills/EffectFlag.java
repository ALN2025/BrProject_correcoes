// Bytecode for: ext.mods.gameserver.enums.skills.EffectFlag
// File: ext\mods\gameserver\enums\skills\EffectFlag.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/enums/skills/EffectFlag.class
  Last modified 9 de jul de 2026; size 2225 bytes
  MD5 checksum ae67059a12e2a5c5d5b171b2bcb834f9
  Compiled from "EffectFlag.java"
public final class ext.mods.gameserver.enums.skills.EffectFlag extends java.lang.Enum<ext.mods.gameserver.enums.skills.EffectFlag>
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/gameserver/enums/skills/EffectFlag
  super_class: #68                        // java/lang/Enum
  interfaces: 0, fields: 19, methods: 6, attributes: 2
Constant pool:
    #1 = Class              #2            // ext/mods/gameserver/enums/skills/EffectFlag
    #2 = Utf8               ext/mods/gameserver/enums/skills/EffectFlag
    #3 = Fieldref           #1.#4         // ext/mods/gameserver/enums/skills/EffectFlag.NONE:Lext/mods/gameserver/enums/skills/EffectFlag;
    #4 = NameAndType        #5:#6         // NONE:Lext/mods/gameserver/enums/skills/EffectFlag;
    #5 = Utf8               NONE
    #6 = Utf8               Lext/mods/gameserver/enums/skills/EffectFlag;
    #7 = Fieldref           #1.#8         // ext/mods/gameserver/enums/skills/EffectFlag.CHARM_OF_COURAGE:Lext/mods/gameserver/enums/skills/EffectFlag;
    #8 = NameAndType        #9:#6         // CHARM_OF_COURAGE:Lext/mods/gameserver/enums/skills/EffectFlag;
    #9 = Utf8               CHARM_OF_COURAGE
   #10 = Fieldref           #1.#11        // ext/mods/gameserver/enums/skills/EffectFlag.CHARM_OF_LUCK:Lext/mods/gameserver/enums/skills/EffectFlag;
   #11 = NameAndType        #12:#6        // CHARM_OF_LUCK:Lext/mods/gameserver/enums/skills/EffectFlag;
   #12 = Utf8               CHARM_OF_LUCK
   #13 = Fieldref           #1.#14        // ext/mods/gameserver/enums/skills/EffectFlag.PHOENIX_BLESSING:Lext/mods/gameserver/enums/skills/EffectFlag;
   #14 = NameAndType        #15:#6        // PHOENIX_BLESSING:Lext/mods/gameserver/enums/skills/EffectFlag;
   #15 = Utf8               PHOENIX_BLESSING
   #16 = Fieldref           #1.#17        // ext/mods/gameserver/enums/skills/EffectFlag.NOBLESS_BLESSING:Lext/mods/gameserver/enums/skills/EffectFlag;
   #17 = NameAndType        #18:#6        // NOBLESS_BLESSING:Lext/mods/gameserver/enums/skills/EffectFlag;
   #18 = Utf8               NOBLESS_BLESSING
   #19 = Fieldref           #1.#20        // ext/mods/gameserver/enums/skills/EffectFlag.SILENT_MOVE:Lext/mods/gameserver/enums/skills/EffectFlag;
   #20 = NameAndType        #21:#6        // SILENT_MOVE:Lext/mods/gameserver/enums/skills/EffectFlag;
   #21 = Utf8               SILENT_MOVE
   #22 = Fieldref           #1.#23        // ext/mods/gameserver/enums/skills/EffectFlag.PROTECTION_BLESSING:Lext/mods/gameserver/enums/skills/EffectFlag;
   #23 = NameAndType        #24:#6        // PROTECTION_BLESSING:Lext/mods/gameserver/enums/skills/EffectFlag;
   #24 = Utf8               PROTECTION_BLESSING
   #25 = Fieldref           #1.#26        // ext/mods/gameserver/enums/skills/EffectFlag.RELAXING:Lext/mods/gameserver/enums/skills/EffectFlag;
   #26 = NameAndType        #27:#6        // RELAXING:Lext/mods/gameserver/enums/skills/EffectFlag;
   #27 = Utf8               RELAXING
   #28 = Fieldref           #1.#29        // ext/mods/gameserver/enums/skills/EffectFlag.FEAR:Lext/mods/gameserver/enums/skills/EffectFlag;
   #29 = NameAndType        #30:#6        // FEAR:Lext/mods/gameserver/enums/skills/EffectFlag;
   #30 = Utf8               FEAR
   #31 = Fieldref           #1.#32        // ext/mods/gameserver/enums/skills/EffectFlag.CONFUSED:Lext/mods/gameserver/enums/skills/EffectFlag;
   #32 = NameAndType        #33:#6        // CONFUSED:Lext/mods/gameserver/enums/skills/EffectFlag;
   #33 = Utf8               CONFUSED
   #34 = Fieldref           #1.#35        // ext/mods/gameserver/enums/skills/EffectFlag.MUTED:Lext/mods/gameserver/enums/skills/EffectFlag;
   #35 = NameAndType        #36:#6        // MUTED:Lext/mods/gameserver/enums/skills/EffectFlag;
   #36 = Utf8               MUTED
   #37 = Fieldref           #1.#38        // ext/mods/gameserver/enums/skills/EffectFlag.PHYSICAL_MUTED:Lext/mods/gameserver/enums/skills/EffectFlag;
   #38 = NameAndType        #39:#6        // PHYSICAL_MUTED:Lext/mods/gameserver/enums/skills/EffectFlag;
   #39 = Utf8               PHYSICAL_MUTED
   #40 = Fieldref           #1.#41        // ext/mods/gameserver/enums/skills/EffectFlag.ROOTED:Lext/mods/gameserver/enums/skills/EffectFlag;
   #41 = NameAndType        #42:#6        // ROOTED:Lext/mods/gameserver/enums/skills/EffectFlag;
   #42 = Utf8               ROOTED
   #43 = Fieldref           #1.#44        // ext/mods/gameserver/enums/skills/EffectFlag.SLEEP:Lext/mods/gameserver/enums/skills/EffectFlag;
   #44 = NameAndType        #45:#6        // SLEEP:Lext/mods/gameserver/enums/skills/EffectFlag;
   #45 = Utf8               SLEEP
   #46 = Fieldref           #1.#47        // ext/mods/gameserver/enums/skills/EffectFlag.STUNNED:Lext/mods/gameserver/enums/skills/EffectFlag;
   #47 = NameAndType        #48:#6        // STUNNED:Lext/mods/gameserver/enums/skills/EffectFlag;
   #48 = Utf8               STUNNED
   #49 = Fieldref           #1.#50        // ext/mods/gameserver/enums/skills/EffectFlag.BETRAYED:Lext/mods/gameserver/enums/skills/EffectFlag;
   #50 = NameAndType        #51:#6        // BETRAYED:Lext/mods/gameserver/enums/skills/EffectFlag;
   #51 = Utf8               BETRAYED
   #52 = Fieldref           #1.#53        // ext/mods/gameserver/enums/skills/EffectFlag.MEDITATING:Lext/mods/gameserver/enums/skills/EffectFlag;
   #53 = NameAndType        #54:#6        // MEDITATING:Lext/mods/gameserver/enums/skills/EffectFlag;
   #54 = Utf8               MEDITATING
   #55 = Fieldref           #1.#56        // ext/mods/gameserver/enums/skills/EffectFlag.PARALYZED:Lext/mods/gameserver/enums/skills/EffectFlag;
   #56 = NameAndType        #57:#6        // PARALYZED:Lext/mods/gameserver/enums/skills/EffectFlag;
   #57 = Utf8               PARALYZED
   #58 = Fieldref           #1.#59        // ext/mods/gameserver/enums/skills/EffectFlag.$VALUES:[Lext/mods/gameserver/enums/skills/EffectFlag;
   #59 = NameAndType        #60:#61       // $VALUES:[Lext/mods/gameserver/enums/skills/EffectFlag;
   #60 = Utf8               $VALUES
   #61 = Utf8               [Lext/mods/gameserver/enums/skills/EffectFlag;
   #62 = Methodref          #63.#64       // "[Lext/mods/gameserver/enums/skills/EffectFlag;".clone:()Ljava/lang/Object;
   #63 = Class              #61           // "[Lext/mods/gameserver/enums/skills/EffectFlag;"
   #64 = NameAndType        #65:#66       // clone:()Ljava/lang/Object;
   #65 = Utf8               clone
   #66 = Utf8               ()Ljava/lang/Object;
   #67 = Methodref          #68.#69       // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #68 = Class              #70           // java/lang/Enum
   #69 = NameAndType        #71:#72       // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #70 = Utf8               java/lang/Enum
   #71 = Utf8               valueOf
   #72 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #73 = Methodref          #68.#74       // java/lang/Enum."<init>":(Ljava/lang/String;I)V
   #74 = NameAndType        #75:#76       // "<init>":(Ljava/lang/String;I)V
   #75 = Utf8               <init>
   #76 = Utf8               (Ljava/lang/String;I)V
   #77 = Methodref          #1.#78        // ext/mods/gameserver/enums/skills/EffectFlag.ordinal:()I
   #78 = NameAndType        #79:#80       // ordinal:()I
   #79 = Utf8               ordinal
   #80 = Utf8               ()I
   #81 = String             #5            // NONE
   #82 = Methodref          #1.#74        // ext/mods/gameserver/enums/skills/EffectFlag."<init>":(Ljava/lang/String;I)V
   #83 = String             #9            // CHARM_OF_COURAGE
   #84 = String             #12           // CHARM_OF_LUCK
   #85 = String             #15           // PHOENIX_BLESSING
   #86 = String             #18           // NOBLESS_BLESSING
   #87 = String             #21           // SILENT_MOVE
   #88 = String             #24           // PROTECTION_BLESSING
   #89 = String             #27           // RELAXING
   #90 = String             #30           // FEAR
   #91 = String             #33           // CONFUSED
   #92 = String             #36           // MUTED
   #93 = String             #39           // PHYSICAL_MUTED
   #94 = String             #42           // ROOTED
   #95 = String             #45           // SLEEP
   #96 = String             #48           // STUNNED
   #97 = String             #51           // BETRAYED
   #98 = String             #54           // MEDITATING
   #99 = String             #57           // PARALYZED
  #100 = Methodref          #1.#101       // ext/mods/gameserver/enums/skills/EffectFlag.$values:()[Lext/mods/gameserver/enums/skills/EffectFlag;
  #101 = NameAndType        #102:#103     // $values:()[Lext/mods/gameserver/enums/skills/EffectFlag;
  #102 = Utf8               $values
  #103 = Utf8               ()[Lext/mods/gameserver/enums/skills/EffectFlag;
  #104 = Utf8               values
  #105 = Utf8               Code
  #106 = Utf8               LineNumberTable
  #107 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/enums/skills/EffectFlag;
  #108 = Utf8               LocalVariableTable
  #109 = Utf8               name
  #110 = Utf8               Ljava/lang/String;
  #111 = Utf8               MethodParameters
  #112 = Utf8               this
  #113 = Utf8               Signature
  #114 = Utf8               ()V
  #115 = Utf8               getMask
  #116 = Utf8               <clinit>
  #117 = Utf8               Ljava/lang/Enum<Lext/mods/gameserver/enums/skills/EffectFlag;>;
  #118 = Utf8               SourceFile
  #119 = Utf8               EffectFlag.java
{
  public static final ext.mods.gameserver.enums.skills.EffectFlag NONE;
    descriptor: Lext/mods/gameserver/enums/skills/EffectFlag;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.EffectFlag CHARM_OF_COURAGE;
    descriptor: Lext/mods/gameserver/enums/skills/EffectFlag;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.EffectFlag CHARM_OF_LUCK;
    descriptor: Lext/mods/gameserver/enums/skills/EffectFlag;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.EffectFlag PHOENIX_BLESSING;
    descriptor: Lext/mods/gameserver/enums/skills/EffectFlag;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.EffectFlag NOBLESS_BLESSING;
    descriptor: Lext/mods/gameserver/enums/skills/EffectFlag;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.EffectFlag SILENT_MOVE;
    descriptor: Lext/mods/gameserver/enums/skills/EffectFlag;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.EffectFlag PROTECTION_BLESSING;
    descriptor: Lext/mods/gameserver/enums/skills/EffectFlag;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.EffectFlag RELAXING;
    descriptor: Lext/mods/gameserver/enums/skills/EffectFlag;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.EffectFlag FEAR;
    descriptor: Lext/mods/gameserver/enums/skills/EffectFlag;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.EffectFlag CONFUSED;
    descriptor: Lext/mods/gameserver/enums/skills/EffectFlag;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.EffectFlag MUTED;
    descriptor: Lext/mods/gameserver/enums/skills/EffectFlag;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.EffectFlag PHYSICAL_MUTED;
    descriptor: Lext/mods/gameserver/enums/skills/EffectFlag;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.EffectFlag ROOTED;
    descriptor: Lext/mods/gameserver/enums/skills/EffectFlag;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.EffectFlag SLEEP;
    descriptor: Lext/mods/gameserver/enums/skills/EffectFlag;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.EffectFlag STUNNED;
    descriptor: Lext/mods/gameserver/enums/skills/EffectFlag;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.EffectFlag BETRAYED;
    descriptor: Lext/mods/gameserver/enums/skills/EffectFlag;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.EffectFlag MEDITATING;
    descriptor: Lext/mods/gameserver/enums/skills/EffectFlag;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.EffectFlag PARALYZED;
    descriptor: Lext/mods/gameserver/enums/skills/EffectFlag;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static ext.mods.gameserver.enums.skills.EffectFlag[] values();
    descriptor: ()[Lext/mods/gameserver/enums/skills/EffectFlag;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #58                 // Field $VALUES:[Lext/mods/gameserver/enums/skills/EffectFlag;
         3: invokevirtual #62                 // Method "[Lext/mods/gameserver/enums/skills/EffectFlag;".clone:()Ljava/lang/Object;
         6: checkcast     #63                 // class "[Lext/mods/gameserver/enums/skills/EffectFlag;"
         9: areturn
      LineNumberTable:
        line 20: 0

  public static ext.mods.gameserver.enums.skills.EffectFlag valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/enums/skills/EffectFlag;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/gameserver/enums/skills/EffectFlag
         2: aload_0
         3: invokestatic  #67                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/gameserver/enums/skills/EffectFlag
         9: areturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  name   Ljava/lang/String;
    MethodParameters:
      Name                           Flags
      <no name>                      mandated

  public int getMask();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: iconst_1
         1: aload_0
         2: invokevirtual #77                 // Method ordinal:()I
         5: ishl
         6: ireturn
      LineNumberTable:
        line 43: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/enums/skills/EffectFlag;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: new           #1                  // class ext/mods/gameserver/enums/skills/EffectFlag
         3: dup
         4: ldc           #81                 // String NONE
         6: iconst_0
         7: invokespecial #82                 // Method "<init>":(Ljava/lang/String;I)V
        10: putstatic     #3                  // Field NONE:Lext/mods/gameserver/enums/skills/EffectFlag;
        13: new           #1                  // class ext/mods/gameserver/enums/skills/EffectFlag
        16: dup
        17: ldc           #83                 // String CHARM_OF_COURAGE
        19: iconst_1
        20: invokespecial #82                 // Method "<init>":(Ljava/lang/String;I)V
        23: putstatic     #7                  // Field CHARM_OF_COURAGE:Lext/mods/gameserver/enums/skills/EffectFlag;
        26: new           #1                  // class ext/mods/gameserver/enums/skills/EffectFlag
        29: dup
        30: ldc           #84                 // String CHARM_OF_LUCK
        32: iconst_2
        33: invokespecial #82                 // Method "<init>":(Ljava/lang/String;I)V
        36: putstatic     #10                 // Field CHARM_OF_LUCK:Lext/mods/gameserver/enums/skills/EffectFlag;
        39: new           #1                  // class ext/mods/gameserver/enums/skills/EffectFlag
        42: dup
        43: ldc           #85                 // String PHOENIX_BLESSING
        45: iconst_3
        46: invokespecial #82                 // Method "<init>":(Ljava/lang/String;I)V
        49: putstatic     #13                 // Field PHOENIX_BLESSING:Lext/mods/gameserver/enums/skills/EffectFlag;
        52: new           #1                  // class ext/mods/gameserver/enums/skills/EffectFlag
        55: dup
        56: ldc           #86                 // String NOBLESS_BLESSING
        58: iconst_4
        59: invokespecial #82                 // Method "<init>":(Ljava/lang/String;I)V
        62: putstatic     #16                 // Field NOBLESS_BLESSING:Lext/mods/gameserver/enums/skills/EffectFlag;
        65: new           #1                  // class ext/mods/gameserver/enums/skills/EffectFlag
        68: dup
        69: ldc           #87                 // String SILENT_MOVE
        71: iconst_5
        72: invokespecial #82                 // Method "<init>":(Ljava/lang/String;I)V
        75: putstatic     #19                 // Field SILENT_MOVE:Lext/mods/gameserver/enums/skills/EffectFlag;
        78: new           #1                  // class ext/mods/gameserver/enums/skills/EffectFlag
        81: dup
        82: ldc           #88                 // String PROTECTION_BLESSING
        84: bipush        6
        86: invokespecial #82                 // Method "<init>":(Ljava/lang/String;I)V
        89: putstatic     #22                 // Field PROTECTION_BLESSING:Lext/mods/gameserver/enums/skills/EffectFlag;
        92: new           #1                  // class ext/mods/gameserver/enums/skills/EffectFlag
        95: dup
        96: ldc           #89                 // String RELAXING
        98: bipush        7
       100: invokespecial #82                 // Method "<init>":(Ljava/lang/String;I)V
       103: putstatic     #25                 // Field RELAXING:Lext/mods/gameserver/enums/skills/EffectFlag;
       106: new           #1                  // class ext/mods/gameserver/enums/skills/EffectFlag
       109: dup
       110: ldc           #90                 // String FEAR
       112: bipush        8
       114: invokespecial #82                 // Method "<init>":(Ljava/lang/String;I)V
       117: putstatic     #28                 // Field FEAR:Lext/mods/gameserver/enums/skills/EffectFlag;
       120: new           #1                  // class ext/mods/gameserver/enums/skills/EffectFlag
       123: dup
       124: ldc           #91                 // String CONFUSED
       126: bipush        9
       128: invokespecial #82                 // Method "<init>":(Ljava/lang/String;I)V
       131: putstatic     #31                 // Field CONFUSED:Lext/mods/gameserver/enums/skills/EffectFlag;
       134: new           #1                  // class ext/mods/gameserver/enums/skills/EffectFlag
       137: dup
       138: ldc           #92                 // String MUTED
       140: bipush        10
       142: invokespecial #82                 // Method "<init>":(Ljava/lang/String;I)V
       145: putstatic     #34                 // Field MUTED:Lext/mods/gameserver/enums/skills/EffectFlag;
       148: new           #1                  // class ext/mods/gameserver/enums/skills/EffectFlag
       151: dup
       152: ldc           #93                 // String PHYSICAL_MUTED
       154: bipush        11
       156: invokespecial #82                 // Method "<init>":(Ljava/lang/String;I)V
       159: putstatic     #37                 // Field PHYSICAL_MUTED:Lext/mods/gameserver/enums/skills/EffectFlag;
       162: new           #1                  // class ext/mods/gameserver/enums/skills/EffectFlag
       165: dup
       166: ldc           #94                 // String ROOTED
       168: bipush        12
       170: invokespecial #82                 // Method "<init>":(Ljava/lang/String;I)V
       173: putstatic     #40                 // Field ROOTED:Lext/mods/gameserver/enums/skills/EffectFlag;
       176: new           #1                  // class ext/mods/gameserver/enums/skills/EffectFlag
       179: dup
       180: ldc           #95                 // String SLEEP
       182: bipush        13
       184: invokespecial #82                 // Method "<init>":(Ljava/lang/String;I)V
       187: putstatic     #43                 // Field SLEEP:Lext/mods/gameserver/enums/skills/EffectFlag;
       190: new           #1                  // class ext/mods/gameserver/enums/skills/EffectFlag
       193: dup
       194: ldc           #96                 // String STUNNED
       196: bipush        14
       198: invokespecial #82                 // Method "<init>":(Ljava/lang/String;I)V
       201: putstatic     #46                 // Field STUNNED:Lext/mods/gameserver/enums/skills/EffectFlag;
       204: new           #1                  // class ext/mods/gameserver/enums/skills/EffectFlag
       207: dup
       208: ldc           #97                 // String BETRAYED
       210: bipush        15
       212: invokespecial #82                 // Method "<init>":(Ljava/lang/String;I)V
       215: putstatic     #49                 // Field BETRAYED:Lext/mods/gameserver/enums/skills/EffectFlag;
       218: new           #1                  // class ext/mods/gameserver/enums/skills/EffectFlag
       221: dup
       222: ldc           #98                 // String MEDITATING
       224: bipush        16
       226: invokespecial #82                 // Method "<init>":(Ljava/lang/String;I)V
       229: putstatic     #52                 // Field MEDITATING:Lext/mods/gameserver/enums/skills/EffectFlag;
       232: new           #1                  // class ext/mods/gameserver/enums/skills/EffectFlag
       235: dup
       236: ldc           #99                 // String PARALYZED
       238: bipush        17
       240: invokespecial #82                 // Method "<init>":(Ljava/lang/String;I)V
       243: putstatic     #55                 // Field PARALYZED:Lext/mods/gameserver/enums/skills/EffectFlag;
       246: invokestatic  #100                // Method $values:()[Lext/mods/gameserver/enums/skills/EffectFlag;
       249: putstatic     #58                 // Field $VALUES:[Lext/mods/gameserver/enums/skills/EffectFlag;
       252: return
      LineNumberTable:
        line 22: 0
        line 23: 13
        line 24: 26
        line 25: 39
        line 26: 52
        line 27: 65
        line 28: 78
        line 29: 92
        line 30: 106
        line 31: 120
        line 32: 134
        line 33: 148
        line 34: 162
        line 35: 176
        line 36: 190
        line 37: 204
        line 38: 218
        line 39: 232
        line 20: 246
}
Signature: #117                         // Ljava/lang/Enum<Lext/mods/gameserver/enums/skills/EffectFlag;>;
SourceFile: "EffectFlag.java"
