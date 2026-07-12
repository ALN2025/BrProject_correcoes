// Bytecode for: ext.mods.gameserver.enums.StatusType
// File: ext\mods\gameserver\enums\StatusType.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/enums/StatusType.class
  Last modified 9 de jul de 2026; size 2817 bytes
  MD5 checksum bc141592d838c24bc2ea504a6693f3aa
  Compiled from "StatusType.java"
public final class ext.mods.gameserver.enums.StatusType extends java.lang.Enum<ext.mods.gameserver.enums.StatusType>
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/gameserver/enums/StatusType
  super_class: #98                        // java/lang/Enum
  interfaces: 0, fields: 31, methods: 6, attributes: 2
Constant pool:
    #1 = Class              #2            // ext/mods/gameserver/enums/StatusType
    #2 = Utf8               ext/mods/gameserver/enums/StatusType
    #3 = Fieldref           #1.#4         // ext/mods/gameserver/enums/StatusType.LEVEL:Lext/mods/gameserver/enums/StatusType;
    #4 = NameAndType        #5:#6         // LEVEL:Lext/mods/gameserver/enums/StatusType;
    #5 = Utf8               LEVEL
    #6 = Utf8               Lext/mods/gameserver/enums/StatusType;
    #7 = Fieldref           #1.#8         // ext/mods/gameserver/enums/StatusType.EXP:Lext/mods/gameserver/enums/StatusType;
    #8 = NameAndType        #9:#6         // EXP:Lext/mods/gameserver/enums/StatusType;
    #9 = Utf8               EXP
   #10 = Fieldref           #1.#11        // ext/mods/gameserver/enums/StatusType.STR:Lext/mods/gameserver/enums/StatusType;
   #11 = NameAndType        #12:#6        // STR:Lext/mods/gameserver/enums/StatusType;
   #12 = Utf8               STR
   #13 = Fieldref           #1.#14        // ext/mods/gameserver/enums/StatusType.DEX:Lext/mods/gameserver/enums/StatusType;
   #14 = NameAndType        #15:#6        // DEX:Lext/mods/gameserver/enums/StatusType;
   #15 = Utf8               DEX
   #16 = Fieldref           #1.#17        // ext/mods/gameserver/enums/StatusType.CON:Lext/mods/gameserver/enums/StatusType;
   #17 = NameAndType        #18:#6        // CON:Lext/mods/gameserver/enums/StatusType;
   #18 = Utf8               CON
   #19 = Fieldref           #1.#20        // ext/mods/gameserver/enums/StatusType.INT:Lext/mods/gameserver/enums/StatusType;
   #20 = NameAndType        #21:#6        // INT:Lext/mods/gameserver/enums/StatusType;
   #21 = Utf8               INT
   #22 = Fieldref           #1.#23        // ext/mods/gameserver/enums/StatusType.WIT:Lext/mods/gameserver/enums/StatusType;
   #23 = NameAndType        #24:#6        // WIT:Lext/mods/gameserver/enums/StatusType;
   #24 = Utf8               WIT
   #25 = Fieldref           #1.#26        // ext/mods/gameserver/enums/StatusType.MEN:Lext/mods/gameserver/enums/StatusType;
   #26 = NameAndType        #27:#6        // MEN:Lext/mods/gameserver/enums/StatusType;
   #27 = Utf8               MEN
   #28 = Fieldref           #1.#29        // ext/mods/gameserver/enums/StatusType.CUR_HP:Lext/mods/gameserver/enums/StatusType;
   #29 = NameAndType        #30:#6        // CUR_HP:Lext/mods/gameserver/enums/StatusType;
   #30 = Utf8               CUR_HP
   #31 = Fieldref           #1.#32        // ext/mods/gameserver/enums/StatusType.MAX_HP:Lext/mods/gameserver/enums/StatusType;
   #32 = NameAndType        #33:#6        // MAX_HP:Lext/mods/gameserver/enums/StatusType;
   #33 = Utf8               MAX_HP
   #34 = Fieldref           #1.#35        // ext/mods/gameserver/enums/StatusType.CUR_MP:Lext/mods/gameserver/enums/StatusType;
   #35 = NameAndType        #36:#6        // CUR_MP:Lext/mods/gameserver/enums/StatusType;
   #36 = Utf8               CUR_MP
   #37 = Fieldref           #1.#38        // ext/mods/gameserver/enums/StatusType.MAX_MP:Lext/mods/gameserver/enums/StatusType;
   #38 = NameAndType        #39:#6        // MAX_MP:Lext/mods/gameserver/enums/StatusType;
   #39 = Utf8               MAX_MP
   #40 = Fieldref           #1.#41        // ext/mods/gameserver/enums/StatusType.SP:Lext/mods/gameserver/enums/StatusType;
   #41 = NameAndType        #42:#6        // SP:Lext/mods/gameserver/enums/StatusType;
   #42 = Utf8               SP
   #43 = Fieldref           #1.#44        // ext/mods/gameserver/enums/StatusType.CUR_LOAD:Lext/mods/gameserver/enums/StatusType;
   #44 = NameAndType        #45:#6        // CUR_LOAD:Lext/mods/gameserver/enums/StatusType;
   #45 = Utf8               CUR_LOAD
   #46 = Fieldref           #1.#47        // ext/mods/gameserver/enums/StatusType.MAX_LOAD:Lext/mods/gameserver/enums/StatusType;
   #47 = NameAndType        #48:#6        // MAX_LOAD:Lext/mods/gameserver/enums/StatusType;
   #48 = Utf8               MAX_LOAD
   #49 = Fieldref           #1.#50        // ext/mods/gameserver/enums/StatusType.P_ATK:Lext/mods/gameserver/enums/StatusType;
   #50 = NameAndType        #51:#6        // P_ATK:Lext/mods/gameserver/enums/StatusType;
   #51 = Utf8               P_ATK
   #52 = Fieldref           #1.#53        // ext/mods/gameserver/enums/StatusType.ATK_SPD:Lext/mods/gameserver/enums/StatusType;
   #53 = NameAndType        #54:#6        // ATK_SPD:Lext/mods/gameserver/enums/StatusType;
   #54 = Utf8               ATK_SPD
   #55 = Fieldref           #1.#56        // ext/mods/gameserver/enums/StatusType.P_DEF:Lext/mods/gameserver/enums/StatusType;
   #56 = NameAndType        #57:#6        // P_DEF:Lext/mods/gameserver/enums/StatusType;
   #57 = Utf8               P_DEF
   #58 = Fieldref           #1.#59        // ext/mods/gameserver/enums/StatusType.EVASION:Lext/mods/gameserver/enums/StatusType;
   #59 = NameAndType        #60:#6        // EVASION:Lext/mods/gameserver/enums/StatusType;
   #60 = Utf8               EVASION
   #61 = Fieldref           #1.#62        // ext/mods/gameserver/enums/StatusType.ACCURACY:Lext/mods/gameserver/enums/StatusType;
   #62 = NameAndType        #63:#6        // ACCURACY:Lext/mods/gameserver/enums/StatusType;
   #63 = Utf8               ACCURACY
   #64 = Fieldref           #1.#65        // ext/mods/gameserver/enums/StatusType.CRITICAL:Lext/mods/gameserver/enums/StatusType;
   #65 = NameAndType        #66:#6        // CRITICAL:Lext/mods/gameserver/enums/StatusType;
   #66 = Utf8               CRITICAL
   #67 = Fieldref           #1.#68        // ext/mods/gameserver/enums/StatusType.M_ATK:Lext/mods/gameserver/enums/StatusType;
   #68 = NameAndType        #69:#6        // M_ATK:Lext/mods/gameserver/enums/StatusType;
   #69 = Utf8               M_ATK
   #70 = Fieldref           #1.#71        // ext/mods/gameserver/enums/StatusType.CAST_SPD:Lext/mods/gameserver/enums/StatusType;
   #71 = NameAndType        #72:#6        // CAST_SPD:Lext/mods/gameserver/enums/StatusType;
   #72 = Utf8               CAST_SPD
   #73 = Fieldref           #1.#74        // ext/mods/gameserver/enums/StatusType.M_DEF:Lext/mods/gameserver/enums/StatusType;
   #74 = NameAndType        #75:#6        // M_DEF:Lext/mods/gameserver/enums/StatusType;
   #75 = Utf8               M_DEF
   #76 = Fieldref           #1.#77        // ext/mods/gameserver/enums/StatusType.PVP_FLAG:Lext/mods/gameserver/enums/StatusType;
   #77 = NameAndType        #78:#6        // PVP_FLAG:Lext/mods/gameserver/enums/StatusType;
   #78 = Utf8               PVP_FLAG
   #79 = Fieldref           #1.#80        // ext/mods/gameserver/enums/StatusType.KARMA:Lext/mods/gameserver/enums/StatusType;
   #80 = NameAndType        #81:#6        // KARMA:Lext/mods/gameserver/enums/StatusType;
   #81 = Utf8               KARMA
   #82 = Fieldref           #1.#83        // ext/mods/gameserver/enums/StatusType.CUR_CP:Lext/mods/gameserver/enums/StatusType;
   #83 = NameAndType        #84:#6        // CUR_CP:Lext/mods/gameserver/enums/StatusType;
   #84 = Utf8               CUR_CP
   #85 = Fieldref           #1.#86        // ext/mods/gameserver/enums/StatusType.MAX_CP:Lext/mods/gameserver/enums/StatusType;
   #86 = NameAndType        #87:#6        // MAX_CP:Lext/mods/gameserver/enums/StatusType;
   #87 = Utf8               MAX_CP
   #88 = Fieldref           #1.#89        // ext/mods/gameserver/enums/StatusType.$VALUES:[Lext/mods/gameserver/enums/StatusType;
   #89 = NameAndType        #90:#91       // $VALUES:[Lext/mods/gameserver/enums/StatusType;
   #90 = Utf8               $VALUES
   #91 = Utf8               [Lext/mods/gameserver/enums/StatusType;
   #92 = Methodref          #93.#94       // "[Lext/mods/gameserver/enums/StatusType;".clone:()Ljava/lang/Object;
   #93 = Class              #91           // "[Lext/mods/gameserver/enums/StatusType;"
   #94 = NameAndType        #95:#96       // clone:()Ljava/lang/Object;
   #95 = Utf8               clone
   #96 = Utf8               ()Ljava/lang/Object;
   #97 = Methodref          #98.#99       // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #98 = Class              #100          // java/lang/Enum
   #99 = NameAndType        #101:#102     // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #100 = Utf8               java/lang/Enum
  #101 = Utf8               valueOf
  #102 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #103 = Methodref          #98.#104      // java/lang/Enum."<init>":(Ljava/lang/String;I)V
  #104 = NameAndType        #105:#106     // "<init>":(Ljava/lang/String;I)V
  #105 = Utf8               <init>
  #106 = Utf8               (Ljava/lang/String;I)V
  #107 = Fieldref           #1.#108       // ext/mods/gameserver/enums/StatusType._id:I
  #108 = NameAndType        #109:#110     // _id:I
  #109 = Utf8               _id
  #110 = Utf8               I
  #111 = String             #5            // LEVEL
  #112 = Methodref          #1.#113       // ext/mods/gameserver/enums/StatusType."<init>":(Ljava/lang/String;II)V
  #113 = NameAndType        #105:#114     // "<init>":(Ljava/lang/String;II)V
  #114 = Utf8               (Ljava/lang/String;II)V
  #115 = String             #9            // EXP
  #116 = String             #12           // STR
  #117 = String             #15           // DEX
  #118 = String             #18           // CON
  #119 = String             #21           // INT
  #120 = String             #24           // WIT
  #121 = String             #27           // MEN
  #122 = String             #30           // CUR_HP
  #123 = String             #33           // MAX_HP
  #124 = String             #36           // CUR_MP
  #125 = String             #39           // MAX_MP
  #126 = String             #42           // SP
  #127 = String             #45           // CUR_LOAD
  #128 = String             #48           // MAX_LOAD
  #129 = String             #51           // P_ATK
  #130 = String             #54           // ATK_SPD
  #131 = String             #57           // P_DEF
  #132 = String             #60           // EVASION
  #133 = String             #63           // ACCURACY
  #134 = String             #66           // CRITICAL
  #135 = String             #69           // M_ATK
  #136 = String             #72           // CAST_SPD
  #137 = String             #75           // M_DEF
  #138 = String             #78           // PVP_FLAG
  #139 = String             #81           // KARMA
  #140 = String             #84           // CUR_CP
  #141 = String             #87           // MAX_CP
  #142 = Methodref          #1.#143       // ext/mods/gameserver/enums/StatusType.$values:()[Lext/mods/gameserver/enums/StatusType;
  #143 = NameAndType        #144:#145     // $values:()[Lext/mods/gameserver/enums/StatusType;
  #144 = Utf8               $values
  #145 = Utf8               ()[Lext/mods/gameserver/enums/StatusType;
  #146 = Methodref          #1.#147       // ext/mods/gameserver/enums/StatusType.values:()[Lext/mods/gameserver/enums/StatusType;
  #147 = NameAndType        #148:#145     // values:()[Lext/mods/gameserver/enums/StatusType;
  #148 = Utf8               values
  #149 = Fieldref           #1.#150       // ext/mods/gameserver/enums/StatusType.VALUES:[Lext/mods/gameserver/enums/StatusType;
  #150 = NameAndType        #151:#91      // VALUES:[Lext/mods/gameserver/enums/StatusType;
  #151 = Utf8               VALUES
  #152 = Utf8               Code
  #153 = Utf8               LineNumberTable
  #154 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/enums/StatusType;
  #155 = Utf8               LocalVariableTable
  #156 = Utf8               name
  #157 = Utf8               Ljava/lang/String;
  #158 = Utf8               MethodParameters
  #159 = Utf8               this
  #160 = Utf8               id
  #161 = Utf8               Signature
  #162 = Utf8               (I)V
  #163 = Utf8               getId
  #164 = Utf8               ()I
  #165 = Utf8               <clinit>
  #166 = Utf8               ()V
  #167 = Utf8               Ljava/lang/Enum<Lext/mods/gameserver/enums/StatusType;>;
  #168 = Utf8               SourceFile
  #169 = Utf8               StatusType.java
{
  public static final ext.mods.gameserver.enums.StatusType LEVEL;
    descriptor: Lext/mods/gameserver/enums/StatusType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.StatusType EXP;
    descriptor: Lext/mods/gameserver/enums/StatusType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.StatusType STR;
    descriptor: Lext/mods/gameserver/enums/StatusType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.StatusType DEX;
    descriptor: Lext/mods/gameserver/enums/StatusType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.StatusType CON;
    descriptor: Lext/mods/gameserver/enums/StatusType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.StatusType INT;
    descriptor: Lext/mods/gameserver/enums/StatusType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.StatusType WIT;
    descriptor: Lext/mods/gameserver/enums/StatusType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.StatusType MEN;
    descriptor: Lext/mods/gameserver/enums/StatusType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.StatusType CUR_HP;
    descriptor: Lext/mods/gameserver/enums/StatusType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.StatusType MAX_HP;
    descriptor: Lext/mods/gameserver/enums/StatusType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.StatusType CUR_MP;
    descriptor: Lext/mods/gameserver/enums/StatusType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.StatusType MAX_MP;
    descriptor: Lext/mods/gameserver/enums/StatusType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.StatusType SP;
    descriptor: Lext/mods/gameserver/enums/StatusType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.StatusType CUR_LOAD;
    descriptor: Lext/mods/gameserver/enums/StatusType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.StatusType MAX_LOAD;
    descriptor: Lext/mods/gameserver/enums/StatusType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.StatusType P_ATK;
    descriptor: Lext/mods/gameserver/enums/StatusType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.StatusType ATK_SPD;
    descriptor: Lext/mods/gameserver/enums/StatusType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.StatusType P_DEF;
    descriptor: Lext/mods/gameserver/enums/StatusType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.StatusType EVASION;
    descriptor: Lext/mods/gameserver/enums/StatusType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.StatusType ACCURACY;
    descriptor: Lext/mods/gameserver/enums/StatusType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.StatusType CRITICAL;
    descriptor: Lext/mods/gameserver/enums/StatusType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.StatusType M_ATK;
    descriptor: Lext/mods/gameserver/enums/StatusType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.StatusType CAST_SPD;
    descriptor: Lext/mods/gameserver/enums/StatusType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.StatusType M_DEF;
    descriptor: Lext/mods/gameserver/enums/StatusType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.StatusType PVP_FLAG;
    descriptor: Lext/mods/gameserver/enums/StatusType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.StatusType KARMA;
    descriptor: Lext/mods/gameserver/enums/StatusType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.StatusType CUR_CP;
    descriptor: Lext/mods/gameserver/enums/StatusType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.StatusType MAX_CP;
    descriptor: Lext/mods/gameserver/enums/StatusType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.StatusType[] VALUES;
    descriptor: [Lext/mods/gameserver/enums/StatusType;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL

  public static ext.mods.gameserver.enums.StatusType[] values();
    descriptor: ()[Lext/mods/gameserver/enums/StatusType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #88                 // Field $VALUES:[Lext/mods/gameserver/enums/StatusType;
         3: invokevirtual #92                 // Method "[Lext/mods/gameserver/enums/StatusType;".clone:()Ljava/lang/Object;
         6: checkcast     #93                 // class "[Lext/mods/gameserver/enums/StatusType;"
         9: areturn
      LineNumberTable:
        line 20: 0

  public static ext.mods.gameserver.enums.StatusType valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/enums/StatusType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/gameserver/enums/StatusType
         2: aload_0
         3: invokestatic  #97                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/gameserver/enums/StatusType
         9: areturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  name   Ljava/lang/String;
    MethodParameters:
      Name                           Flags
      <no name>                      mandated

  public int getId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #107                // Field _id:I
         4: ireturn
      LineNumberTable:
        line 66: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/enums/StatusType;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=5, locals=0, args_size=0
         0: new           #1                  // class ext/mods/gameserver/enums/StatusType
         3: dup
         4: ldc           #111                // String LEVEL
         6: iconst_0
         7: iconst_1
         8: invokespecial #112                // Method "<init>":(Ljava/lang/String;II)V
        11: putstatic     #3                  // Field LEVEL:Lext/mods/gameserver/enums/StatusType;
        14: new           #1                  // class ext/mods/gameserver/enums/StatusType
        17: dup
        18: ldc           #115                // String EXP
        20: iconst_1
        21: iconst_2
        22: invokespecial #112                // Method "<init>":(Ljava/lang/String;II)V
        25: putstatic     #7                  // Field EXP:Lext/mods/gameserver/enums/StatusType;
        28: new           #1                  // class ext/mods/gameserver/enums/StatusType
        31: dup
        32: ldc           #116                // String STR
        34: iconst_2
        35: iconst_3
        36: invokespecial #112                // Method "<init>":(Ljava/lang/String;II)V
        39: putstatic     #10                 // Field STR:Lext/mods/gameserver/enums/StatusType;
        42: new           #1                  // class ext/mods/gameserver/enums/StatusType
        45: dup
        46: ldc           #117                // String DEX
        48: iconst_3
        49: iconst_4
        50: invokespecial #112                // Method "<init>":(Ljava/lang/String;II)V
        53: putstatic     #13                 // Field DEX:Lext/mods/gameserver/enums/StatusType;
        56: new           #1                  // class ext/mods/gameserver/enums/StatusType
        59: dup
        60: ldc           #118                // String CON
        62: iconst_4
        63: iconst_5
        64: invokespecial #112                // Method "<init>":(Ljava/lang/String;II)V
        67: putstatic     #16                 // Field CON:Lext/mods/gameserver/enums/StatusType;
        70: new           #1                  // class ext/mods/gameserver/enums/StatusType
        73: dup
        74: ldc           #119                // String INT
        76: iconst_5
        77: bipush        6
        79: invokespecial #112                // Method "<init>":(Ljava/lang/String;II)V
        82: putstatic     #19                 // Field INT:Lext/mods/gameserver/enums/StatusType;
        85: new           #1                  // class ext/mods/gameserver/enums/StatusType
        88: dup
        89: ldc           #120                // String WIT
        91: bipush        6
        93: bipush        7
        95: invokespecial #112                // Method "<init>":(Ljava/lang/String;II)V
        98: putstatic     #22                 // Field WIT:Lext/mods/gameserver/enums/StatusType;
       101: new           #1                  // class ext/mods/gameserver/enums/StatusType
       104: dup
       105: ldc           #121                // String MEN
       107: bipush        7
       109: bipush        8
       111: invokespecial #112                // Method "<init>":(Ljava/lang/String;II)V
       114: putstatic     #25                 // Field MEN:Lext/mods/gameserver/enums/StatusType;
       117: new           #1                  // class ext/mods/gameserver/enums/StatusType
       120: dup
       121: ldc           #122                // String CUR_HP
       123: bipush        8
       125: bipush        9
       127: invokespecial #112                // Method "<init>":(Ljava/lang/String;II)V
       130: putstatic     #28                 // Field CUR_HP:Lext/mods/gameserver/enums/StatusType;
       133: new           #1                  // class ext/mods/gameserver/enums/StatusType
       136: dup
       137: ldc           #123                // String MAX_HP
       139: bipush        9
       141: bipush        10
       143: invokespecial #112                // Method "<init>":(Ljava/lang/String;II)V
       146: putstatic     #31                 // Field MAX_HP:Lext/mods/gameserver/enums/StatusType;
       149: new           #1                  // class ext/mods/gameserver/enums/StatusType
       152: dup
       153: ldc           #124                // String CUR_MP
       155: bipush        10
       157: bipush        11
       159: invokespecial #112                // Method "<init>":(Ljava/lang/String;II)V
       162: putstatic     #34                 // Field CUR_MP:Lext/mods/gameserver/enums/StatusType;
       165: new           #1                  // class ext/mods/gameserver/enums/StatusType
       168: dup
       169: ldc           #125                // String MAX_MP
       171: bipush        11
       173: bipush        12
       175: invokespecial #112                // Method "<init>":(Ljava/lang/String;II)V
       178: putstatic     #37                 // Field MAX_MP:Lext/mods/gameserver/enums/StatusType;
       181: new           #1                  // class ext/mods/gameserver/enums/StatusType
       184: dup
       185: ldc           #126                // String SP
       187: bipush        12
       189: bipush        13
       191: invokespecial #112                // Method "<init>":(Ljava/lang/String;II)V
       194: putstatic     #40                 // Field SP:Lext/mods/gameserver/enums/StatusType;
       197: new           #1                  // class ext/mods/gameserver/enums/StatusType
       200: dup
       201: ldc           #127                // String CUR_LOAD
       203: bipush        13
       205: bipush        14
       207: invokespecial #112                // Method "<init>":(Ljava/lang/String;II)V
       210: putstatic     #43                 // Field CUR_LOAD:Lext/mods/gameserver/enums/StatusType;
       213: new           #1                  // class ext/mods/gameserver/enums/StatusType
       216: dup
       217: ldc           #128                // String MAX_LOAD
       219: bipush        14
       221: bipush        15
       223: invokespecial #112                // Method "<init>":(Ljava/lang/String;II)V
       226: putstatic     #46                 // Field MAX_LOAD:Lext/mods/gameserver/enums/StatusType;
       229: new           #1                  // class ext/mods/gameserver/enums/StatusType
       232: dup
       233: ldc           #129                // String P_ATK
       235: bipush        15
       237: bipush        17
       239: invokespecial #112                // Method "<init>":(Ljava/lang/String;II)V
       242: putstatic     #49                 // Field P_ATK:Lext/mods/gameserver/enums/StatusType;
       245: new           #1                  // class ext/mods/gameserver/enums/StatusType
       248: dup
       249: ldc           #130                // String ATK_SPD
       251: bipush        16
       253: bipush        18
       255: invokespecial #112                // Method "<init>":(Ljava/lang/String;II)V
       258: putstatic     #52                 // Field ATK_SPD:Lext/mods/gameserver/enums/StatusType;
       261: new           #1                  // class ext/mods/gameserver/enums/StatusType
       264: dup
       265: ldc           #131                // String P_DEF
       267: bipush        17
       269: bipush        19
       271: invokespecial #112                // Method "<init>":(Ljava/lang/String;II)V
       274: putstatic     #55                 // Field P_DEF:Lext/mods/gameserver/enums/StatusType;
       277: new           #1                  // class ext/mods/gameserver/enums/StatusType
       280: dup
       281: ldc           #132                // String EVASION
       283: bipush        18
       285: bipush        20
       287: invokespecial #112                // Method "<init>":(Ljava/lang/String;II)V
       290: putstatic     #58                 // Field EVASION:Lext/mods/gameserver/enums/StatusType;
       293: new           #1                  // class ext/mods/gameserver/enums/StatusType
       296: dup
       297: ldc           #133                // String ACCURACY
       299: bipush        19
       301: bipush        21
       303: invokespecial #112                // Method "<init>":(Ljava/lang/String;II)V
       306: putstatic     #61                 // Field ACCURACY:Lext/mods/gameserver/enums/StatusType;
       309: new           #1                  // class ext/mods/gameserver/enums/StatusType
       312: dup
       313: ldc           #134                // String CRITICAL
       315: bipush        20
       317: bipush        22
       319: invokespecial #112                // Method "<init>":(Ljava/lang/String;II)V
       322: putstatic     #64                 // Field CRITICAL:Lext/mods/gameserver/enums/StatusType;
       325: new           #1                  // class ext/mods/gameserver/enums/StatusType
       328: dup
       329: ldc           #135                // String M_ATK
       331: bipush        21
       333: bipush        23
       335: invokespecial #112                // Method "<init>":(Ljava/lang/String;II)V
       338: putstatic     #67                 // Field M_ATK:Lext/mods/gameserver/enums/StatusType;
       341: new           #1                  // class ext/mods/gameserver/enums/StatusType
       344: dup
       345: ldc           #136                // String CAST_SPD
       347: bipush        22
       349: bipush        24
       351: invokespecial #112                // Method "<init>":(Ljava/lang/String;II)V
       354: putstatic     #70                 // Field CAST_SPD:Lext/mods/gameserver/enums/StatusType;
       357: new           #1                  // class ext/mods/gameserver/enums/StatusType
       360: dup
       361: ldc           #137                // String M_DEF
       363: bipush        23
       365: bipush        25
       367: invokespecial #112                // Method "<init>":(Ljava/lang/String;II)V
       370: putstatic     #73                 // Field M_DEF:Lext/mods/gameserver/enums/StatusType;
       373: new           #1                  // class ext/mods/gameserver/enums/StatusType
       376: dup
       377: ldc           #138                // String PVP_FLAG
       379: bipush        24
       381: bipush        26
       383: invokespecial #112                // Method "<init>":(Ljava/lang/String;II)V
       386: putstatic     #76                 // Field PVP_FLAG:Lext/mods/gameserver/enums/StatusType;
       389: new           #1                  // class ext/mods/gameserver/enums/StatusType
       392: dup
       393: ldc           #139                // String KARMA
       395: bipush        25
       397: bipush        27
       399: invokespecial #112                // Method "<init>":(Ljava/lang/String;II)V
       402: putstatic     #79                 // Field KARMA:Lext/mods/gameserver/enums/StatusType;
       405: new           #1                  // class ext/mods/gameserver/enums/StatusType
       408: dup
       409: ldc           #140                // String CUR_CP
       411: bipush        26
       413: bipush        33
       415: invokespecial #112                // Method "<init>":(Ljava/lang/String;II)V
       418: putstatic     #82                 // Field CUR_CP:Lext/mods/gameserver/enums/StatusType;
       421: new           #1                  // class ext/mods/gameserver/enums/StatusType
       424: dup
       425: ldc           #141                // String MAX_CP
       427: bipush        27
       429: bipush        34
       431: invokespecial #112                // Method "<init>":(Ljava/lang/String;II)V
       434: putstatic     #85                 // Field MAX_CP:Lext/mods/gameserver/enums/StatusType;
       437: invokestatic  #142                // Method $values:()[Lext/mods/gameserver/enums/StatusType;
       440: putstatic     #88                 // Field $VALUES:[Lext/mods/gameserver/enums/StatusType;
       443: invokestatic  #146                // Method values:()[Lext/mods/gameserver/enums/StatusType;
       446: putstatic     #149                // Field VALUES:[Lext/mods/gameserver/enums/StatusType;
       449: return
      LineNumberTable:
        line 22: 0
        line 23: 14
        line 24: 28
        line 25: 42
        line 26: 56
        line 27: 70
        line 28: 85
        line 29: 101
        line 31: 117
        line 32: 133
        line 33: 149
        line 34: 165
        line 36: 181
        line 37: 197
        line 38: 213
        line 40: 229
        line 41: 245
        line 42: 261
        line 43: 277
        line 44: 293
        line 45: 309
        line 46: 325
        line 47: 341
        line 48: 357
        line 49: 373
        line 50: 389
        line 52: 405
        line 53: 421
        line 20: 437
        line 55: 443
}
Signature: #167                         // Ljava/lang/Enum<Lext/mods/gameserver/enums/StatusType;>;
SourceFile: "StatusType.java"
