// Bytecode for: ext.mods.gameserver.enums.PrivilegeType
// File: ext\mods\gameserver\enums\PrivilegeType.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/enums/PrivilegeType.class
  Last modified 9 de jul de 2026; size 2857 bytes
  MD5 checksum 7dc724926076feb3076a4a8fcf4215af
  Compiled from "PrivilegeType.java"
public final class ext.mods.gameserver.enums.PrivilegeType extends java.lang.Enum<ext.mods.gameserver.enums.PrivilegeType>
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/gameserver/enums/PrivilegeType
  super_class: #86                        // java/lang/Enum
  interfaces: 0, fields: 26, methods: 6, attributes: 2
Constant pool:
    #1 = Class              #2            // ext/mods/gameserver/enums/PrivilegeType
    #2 = Utf8               ext/mods/gameserver/enums/PrivilegeType
    #3 = Fieldref           #1.#4         // ext/mods/gameserver/enums/PrivilegeType.NONE:Lext/mods/gameserver/enums/PrivilegeType;
    #4 = NameAndType        #5:#6         // NONE:Lext/mods/gameserver/enums/PrivilegeType;
    #5 = Utf8               NONE
    #6 = Utf8               Lext/mods/gameserver/enums/PrivilegeType;
    #7 = Fieldref           #1.#8         // ext/mods/gameserver/enums/PrivilegeType.SP_INVITE:Lext/mods/gameserver/enums/PrivilegeType;
    #8 = NameAndType        #9:#6         // SP_INVITE:Lext/mods/gameserver/enums/PrivilegeType;
    #9 = Utf8               SP_INVITE
   #10 = Fieldref           #1.#11        // ext/mods/gameserver/enums/PrivilegeType.SP_MANAGE_TITLES:Lext/mods/gameserver/enums/PrivilegeType;
   #11 = NameAndType        #12:#6        // SP_MANAGE_TITLES:Lext/mods/gameserver/enums/PrivilegeType;
   #12 = Utf8               SP_MANAGE_TITLES
   #13 = Fieldref           #1.#14        // ext/mods/gameserver/enums/PrivilegeType.SP_WAREHOUSE_SEARCH:Lext/mods/gameserver/enums/PrivilegeType;
   #14 = NameAndType        #15:#6        // SP_WAREHOUSE_SEARCH:Lext/mods/gameserver/enums/PrivilegeType;
   #15 = Utf8               SP_WAREHOUSE_SEARCH
   #16 = Fieldref           #1.#17        // ext/mods/gameserver/enums/PrivilegeType.SP_MANAGE_RANKS:Lext/mods/gameserver/enums/PrivilegeType;
   #17 = NameAndType        #18:#6        // SP_MANAGE_RANKS:Lext/mods/gameserver/enums/PrivilegeType;
   #18 = Utf8               SP_MANAGE_RANKS
   #19 = Fieldref           #1.#20        // ext/mods/gameserver/enums/PrivilegeType.SP_CLAN_WAR:Lext/mods/gameserver/enums/PrivilegeType;
   #20 = NameAndType        #21:#6        // SP_CLAN_WAR:Lext/mods/gameserver/enums/PrivilegeType;
   #21 = Utf8               SP_CLAN_WAR
   #22 = Fieldref           #1.#23        // ext/mods/gameserver/enums/PrivilegeType.SP_DISMISS:Lext/mods/gameserver/enums/PrivilegeType;
   #23 = NameAndType        #24:#6        // SP_DISMISS:Lext/mods/gameserver/enums/PrivilegeType;
   #24 = Utf8               SP_DISMISS
   #25 = Fieldref           #1.#26        // ext/mods/gameserver/enums/PrivilegeType.SP_EDIT_CREST:Lext/mods/gameserver/enums/PrivilegeType;
   #26 = NameAndType        #27:#6        // SP_EDIT_CREST:Lext/mods/gameserver/enums/PrivilegeType;
   #27 = Utf8               SP_EDIT_CREST
   #28 = Fieldref           #1.#29        // ext/mods/gameserver/enums/PrivilegeType.SP_MASTER_RIGHTS:Lext/mods/gameserver/enums/PrivilegeType;
   #29 = NameAndType        #30:#6        // SP_MASTER_RIGHTS:Lext/mods/gameserver/enums/PrivilegeType;
   #30 = Utf8               SP_MASTER_RIGHTS
   #31 = Fieldref           #1.#32        // ext/mods/gameserver/enums/PrivilegeType.SP_MANAGE_LEVELS:Lext/mods/gameserver/enums/PrivilegeType;
   #32 = NameAndType        #33:#6        // SP_MANAGE_LEVELS:Lext/mods/gameserver/enums/PrivilegeType;
   #33 = Utf8               SP_MANAGE_LEVELS
   #34 = Fieldref           #1.#35        // ext/mods/gameserver/enums/PrivilegeType.CHP_ENTRY_EXIT_RIGHTS:Lext/mods/gameserver/enums/PrivilegeType;
   #35 = NameAndType        #36:#6        // CHP_ENTRY_EXIT_RIGHTS:Lext/mods/gameserver/enums/PrivilegeType;
   #36 = Utf8               CHP_ENTRY_EXIT_RIGHTS
   #37 = Fieldref           #1.#38        // ext/mods/gameserver/enums/PrivilegeType.CHP_USE_FUNCTIONS:Lext/mods/gameserver/enums/PrivilegeType;
   #38 = NameAndType        #39:#6        // CHP_USE_FUNCTIONS:Lext/mods/gameserver/enums/PrivilegeType;
   #39 = Utf8               CHP_USE_FUNCTIONS
   #40 = Fieldref           #1.#41        // ext/mods/gameserver/enums/PrivilegeType.CHP_AUCTION:Lext/mods/gameserver/enums/PrivilegeType;
   #41 = NameAndType        #42:#6        // CHP_AUCTION:Lext/mods/gameserver/enums/PrivilegeType;
   #42 = Utf8               CHP_AUCTION
   #43 = Fieldref           #1.#44        // ext/mods/gameserver/enums/PrivilegeType.CHP_RIGHT_TO_DISMISS:Lext/mods/gameserver/enums/PrivilegeType;
   #44 = NameAndType        #45:#6        // CHP_RIGHT_TO_DISMISS:Lext/mods/gameserver/enums/PrivilegeType;
   #45 = Utf8               CHP_RIGHT_TO_DISMISS
   #46 = Fieldref           #1.#47        // ext/mods/gameserver/enums/PrivilegeType.CHP_SET_FUNCTIONS:Lext/mods/gameserver/enums/PrivilegeType;
   #47 = NameAndType        #48:#6        // CHP_SET_FUNCTIONS:Lext/mods/gameserver/enums/PrivilegeType;
   #48 = Utf8               CHP_SET_FUNCTIONS
   #49 = Fieldref           #1.#50        // ext/mods/gameserver/enums/PrivilegeType.CP_ENTRY_EXIT_RIGHTS:Lext/mods/gameserver/enums/PrivilegeType;
   #50 = NameAndType        #51:#6        // CP_ENTRY_EXIT_RIGHTS:Lext/mods/gameserver/enums/PrivilegeType;
   #51 = Utf8               CP_ENTRY_EXIT_RIGHTS
   #52 = Fieldref           #1.#53        // ext/mods/gameserver/enums/PrivilegeType.CP_MANOR_ADMINISTRATION:Lext/mods/gameserver/enums/PrivilegeType;
   #53 = NameAndType        #54:#6        // CP_MANOR_ADMINISTRATION:Lext/mods/gameserver/enums/PrivilegeType;
   #54 = Utf8               CP_MANOR_ADMINISTRATION
   #55 = Fieldref           #1.#56        // ext/mods/gameserver/enums/PrivilegeType.CP_MANAGE_SIEGE_WAR:Lext/mods/gameserver/enums/PrivilegeType;
   #56 = NameAndType        #57:#6        // CP_MANAGE_SIEGE_WAR:Lext/mods/gameserver/enums/PrivilegeType;
   #57 = Utf8               CP_MANAGE_SIEGE_WAR
   #58 = Fieldref           #1.#59        // ext/mods/gameserver/enums/PrivilegeType.CP_USE_FUNCTIONS:Lext/mods/gameserver/enums/PrivilegeType;
   #59 = NameAndType        #60:#6        // CP_USE_FUNCTIONS:Lext/mods/gameserver/enums/PrivilegeType;
   #60 = Utf8               CP_USE_FUNCTIONS
   #61 = Fieldref           #1.#62        // ext/mods/gameserver/enums/PrivilegeType.CP_RIGHT_TO_DISMISS:Lext/mods/gameserver/enums/PrivilegeType;
   #62 = NameAndType        #63:#6        // CP_RIGHT_TO_DISMISS:Lext/mods/gameserver/enums/PrivilegeType;
   #63 = Utf8               CP_RIGHT_TO_DISMISS
   #64 = Fieldref           #1.#65        // ext/mods/gameserver/enums/PrivilegeType.CP_MANAGE_TAXES:Lext/mods/gameserver/enums/PrivilegeType;
   #65 = NameAndType        #66:#6        // CP_MANAGE_TAXES:Lext/mods/gameserver/enums/PrivilegeType;
   #66 = Utf8               CP_MANAGE_TAXES
   #67 = Fieldref           #1.#68        // ext/mods/gameserver/enums/PrivilegeType.CP_MERCENARIES:Lext/mods/gameserver/enums/PrivilegeType;
   #68 = NameAndType        #69:#6        // CP_MERCENARIES:Lext/mods/gameserver/enums/PrivilegeType;
   #69 = Utf8               CP_MERCENARIES
   #70 = Fieldref           #1.#71        // ext/mods/gameserver/enums/PrivilegeType.CP_SET_FUNCTIONS:Lext/mods/gameserver/enums/PrivilegeType;
   #71 = NameAndType        #72:#6        // CP_SET_FUNCTIONS:Lext/mods/gameserver/enums/PrivilegeType;
   #72 = Utf8               CP_SET_FUNCTIONS
   #73 = Fieldref           #1.#74        // ext/mods/gameserver/enums/PrivilegeType.ALL:Lext/mods/gameserver/enums/PrivilegeType;
   #74 = NameAndType        #75:#6        // ALL:Lext/mods/gameserver/enums/PrivilegeType;
   #75 = Utf8               ALL
   #76 = Fieldref           #1.#77        // ext/mods/gameserver/enums/PrivilegeType.$VALUES:[Lext/mods/gameserver/enums/PrivilegeType;
   #77 = NameAndType        #78:#79       // $VALUES:[Lext/mods/gameserver/enums/PrivilegeType;
   #78 = Utf8               $VALUES
   #79 = Utf8               [Lext/mods/gameserver/enums/PrivilegeType;
   #80 = Methodref          #81.#82       // "[Lext/mods/gameserver/enums/PrivilegeType;".clone:()Ljava/lang/Object;
   #81 = Class              #79           // "[Lext/mods/gameserver/enums/PrivilegeType;"
   #82 = NameAndType        #83:#84       // clone:()Ljava/lang/Object;
   #83 = Utf8               clone
   #84 = Utf8               ()Ljava/lang/Object;
   #85 = Methodref          #86.#87       // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #86 = Class              #88           // java/lang/Enum
   #87 = NameAndType        #89:#90       // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #88 = Utf8               java/lang/Enum
   #89 = Utf8               valueOf
   #90 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #91 = Methodref          #86.#92       // java/lang/Enum."<init>":(Ljava/lang/String;I)V
   #92 = NameAndType        #93:#94       // "<init>":(Ljava/lang/String;I)V
   #93 = Utf8               <init>
   #94 = Utf8               (Ljava/lang/String;I)V
   #95 = Fieldref           #1.#96        // ext/mods/gameserver/enums/PrivilegeType._mask:I
   #96 = NameAndType        #97:#98       // _mask:I
   #97 = Utf8               _mask
   #98 = Utf8               I
   #99 = String             #5            // NONE
  #100 = Methodref          #1.#101       // ext/mods/gameserver/enums/PrivilegeType."<init>":(Ljava/lang/String;II)V
  #101 = NameAndType        #93:#102      // "<init>":(Ljava/lang/String;II)V
  #102 = Utf8               (Ljava/lang/String;II)V
  #103 = String             #9            // SP_INVITE
  #104 = String             #12           // SP_MANAGE_TITLES
  #105 = String             #15           // SP_WAREHOUSE_SEARCH
  #106 = String             #18           // SP_MANAGE_RANKS
  #107 = String             #21           // SP_CLAN_WAR
  #108 = String             #24           // SP_DISMISS
  #109 = String             #27           // SP_EDIT_CREST
  #110 = String             #30           // SP_MASTER_RIGHTS
  #111 = String             #33           // SP_MANAGE_LEVELS
  #112 = String             #36           // CHP_ENTRY_EXIT_RIGHTS
  #113 = String             #39           // CHP_USE_FUNCTIONS
  #114 = String             #42           // CHP_AUCTION
  #115 = String             #45           // CHP_RIGHT_TO_DISMISS
  #116 = String             #48           // CHP_SET_FUNCTIONS
  #117 = String             #51           // CP_ENTRY_EXIT_RIGHTS
  #118 = Integer            32768
  #119 = String             #54           // CP_MANOR_ADMINISTRATION
  #120 = Integer            65536
  #121 = String             #57           // CP_MANAGE_SIEGE_WAR
  #122 = Integer            131072
  #123 = String             #60           // CP_USE_FUNCTIONS
  #124 = Integer            262144
  #125 = String             #63           // CP_RIGHT_TO_DISMISS
  #126 = Integer            524288
  #127 = String             #66           // CP_MANAGE_TAXES
  #128 = Integer            1048576
  #129 = String             #69           // CP_MERCENARIES
  #130 = Integer            2097152
  #131 = String             #72           // CP_SET_FUNCTIONS
  #132 = Integer            4194304
  #133 = String             #75           // ALL
  #134 = Integer            8388606
  #135 = Methodref          #1.#136       // ext/mods/gameserver/enums/PrivilegeType.$values:()[Lext/mods/gameserver/enums/PrivilegeType;
  #136 = NameAndType        #137:#138     // $values:()[Lext/mods/gameserver/enums/PrivilegeType;
  #137 = Utf8               $values
  #138 = Utf8               ()[Lext/mods/gameserver/enums/PrivilegeType;
  #139 = Utf8               values
  #140 = Utf8               Code
  #141 = Utf8               LineNumberTable
  #142 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/enums/PrivilegeType;
  #143 = Utf8               LocalVariableTable
  #144 = Utf8               name
  #145 = Utf8               Ljava/lang/String;
  #146 = Utf8               MethodParameters
  #147 = Utf8               this
  #148 = Utf8               mask
  #149 = Utf8               Signature
  #150 = Utf8               (I)V
  #151 = Utf8               getMask
  #152 = Utf8               ()I
  #153 = Utf8               <clinit>
  #154 = Utf8               ()V
  #155 = Utf8               Ljava/lang/Enum<Lext/mods/gameserver/enums/PrivilegeType;>;
  #156 = Utf8               SourceFile
  #157 = Utf8               PrivilegeType.java
{
  public static final ext.mods.gameserver.enums.PrivilegeType NONE;
    descriptor: Lext/mods/gameserver/enums/PrivilegeType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.PrivilegeType SP_INVITE;
    descriptor: Lext/mods/gameserver/enums/PrivilegeType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.PrivilegeType SP_MANAGE_TITLES;
    descriptor: Lext/mods/gameserver/enums/PrivilegeType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.PrivilegeType SP_WAREHOUSE_SEARCH;
    descriptor: Lext/mods/gameserver/enums/PrivilegeType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.PrivilegeType SP_MANAGE_RANKS;
    descriptor: Lext/mods/gameserver/enums/PrivilegeType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.PrivilegeType SP_CLAN_WAR;
    descriptor: Lext/mods/gameserver/enums/PrivilegeType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.PrivilegeType SP_DISMISS;
    descriptor: Lext/mods/gameserver/enums/PrivilegeType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.PrivilegeType SP_EDIT_CREST;
    descriptor: Lext/mods/gameserver/enums/PrivilegeType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.PrivilegeType SP_MASTER_RIGHTS;
    descriptor: Lext/mods/gameserver/enums/PrivilegeType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.PrivilegeType SP_MANAGE_LEVELS;
    descriptor: Lext/mods/gameserver/enums/PrivilegeType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.PrivilegeType CHP_ENTRY_EXIT_RIGHTS;
    descriptor: Lext/mods/gameserver/enums/PrivilegeType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.PrivilegeType CHP_USE_FUNCTIONS;
    descriptor: Lext/mods/gameserver/enums/PrivilegeType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.PrivilegeType CHP_AUCTION;
    descriptor: Lext/mods/gameserver/enums/PrivilegeType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.PrivilegeType CHP_RIGHT_TO_DISMISS;
    descriptor: Lext/mods/gameserver/enums/PrivilegeType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.PrivilegeType CHP_SET_FUNCTIONS;
    descriptor: Lext/mods/gameserver/enums/PrivilegeType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.PrivilegeType CP_ENTRY_EXIT_RIGHTS;
    descriptor: Lext/mods/gameserver/enums/PrivilegeType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.PrivilegeType CP_MANOR_ADMINISTRATION;
    descriptor: Lext/mods/gameserver/enums/PrivilegeType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.PrivilegeType CP_MANAGE_SIEGE_WAR;
    descriptor: Lext/mods/gameserver/enums/PrivilegeType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.PrivilegeType CP_USE_FUNCTIONS;
    descriptor: Lext/mods/gameserver/enums/PrivilegeType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.PrivilegeType CP_RIGHT_TO_DISMISS;
    descriptor: Lext/mods/gameserver/enums/PrivilegeType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.PrivilegeType CP_MANAGE_TAXES;
    descriptor: Lext/mods/gameserver/enums/PrivilegeType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.PrivilegeType CP_MERCENARIES;
    descriptor: Lext/mods/gameserver/enums/PrivilegeType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.PrivilegeType CP_SET_FUNCTIONS;
    descriptor: Lext/mods/gameserver/enums/PrivilegeType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.PrivilegeType ALL;
    descriptor: Lext/mods/gameserver/enums/PrivilegeType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static ext.mods.gameserver.enums.PrivilegeType[] values();
    descriptor: ()[Lext/mods/gameserver/enums/PrivilegeType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #76                 // Field $VALUES:[Lext/mods/gameserver/enums/PrivilegeType;
         3: invokevirtual #80                 // Method "[Lext/mods/gameserver/enums/PrivilegeType;".clone:()Ljava/lang/Object;
         6: checkcast     #81                 // class "[Lext/mods/gameserver/enums/PrivilegeType;"
         9: areturn
      LineNumberTable:
        line 20: 0

  public static ext.mods.gameserver.enums.PrivilegeType valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/enums/PrivilegeType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/gameserver/enums/PrivilegeType
         2: aload_0
         3: invokestatic  #85                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/gameserver/enums/PrivilegeType
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
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #95                 // Field _mask:I
         4: ireturn
      LineNumberTable:
        line 60: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/enums/PrivilegeType;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=5, locals=0, args_size=0
         0: new           #1                  // class ext/mods/gameserver/enums/PrivilegeType
         3: dup
         4: ldc           #99                 // String NONE
         6: iconst_0
         7: iconst_0
         8: invokespecial #100                // Method "<init>":(Ljava/lang/String;II)V
        11: putstatic     #3                  // Field NONE:Lext/mods/gameserver/enums/PrivilegeType;
        14: new           #1                  // class ext/mods/gameserver/enums/PrivilegeType
        17: dup
        18: ldc           #103                // String SP_INVITE
        20: iconst_1
        21: iconst_2
        22: invokespecial #100                // Method "<init>":(Ljava/lang/String;II)V
        25: putstatic     #7                  // Field SP_INVITE:Lext/mods/gameserver/enums/PrivilegeType;
        28: new           #1                  // class ext/mods/gameserver/enums/PrivilegeType
        31: dup
        32: ldc           #104                // String SP_MANAGE_TITLES
        34: iconst_2
        35: iconst_4
        36: invokespecial #100                // Method "<init>":(Ljava/lang/String;II)V
        39: putstatic     #10                 // Field SP_MANAGE_TITLES:Lext/mods/gameserver/enums/PrivilegeType;
        42: new           #1                  // class ext/mods/gameserver/enums/PrivilegeType
        45: dup
        46: ldc           #105                // String SP_WAREHOUSE_SEARCH
        48: iconst_3
        49: bipush        8
        51: invokespecial #100                // Method "<init>":(Ljava/lang/String;II)V
        54: putstatic     #13                 // Field SP_WAREHOUSE_SEARCH:Lext/mods/gameserver/enums/PrivilegeType;
        57: new           #1                  // class ext/mods/gameserver/enums/PrivilegeType
        60: dup
        61: ldc           #106                // String SP_MANAGE_RANKS
        63: iconst_4
        64: bipush        16
        66: invokespecial #100                // Method "<init>":(Ljava/lang/String;II)V
        69: putstatic     #16                 // Field SP_MANAGE_RANKS:Lext/mods/gameserver/enums/PrivilegeType;
        72: new           #1                  // class ext/mods/gameserver/enums/PrivilegeType
        75: dup
        76: ldc           #107                // String SP_CLAN_WAR
        78: iconst_5
        79: bipush        32
        81: invokespecial #100                // Method "<init>":(Ljava/lang/String;II)V
        84: putstatic     #19                 // Field SP_CLAN_WAR:Lext/mods/gameserver/enums/PrivilegeType;
        87: new           #1                  // class ext/mods/gameserver/enums/PrivilegeType
        90: dup
        91: ldc           #108                // String SP_DISMISS
        93: bipush        6
        95: bipush        64
        97: invokespecial #100                // Method "<init>":(Ljava/lang/String;II)V
       100: putstatic     #22                 // Field SP_DISMISS:Lext/mods/gameserver/enums/PrivilegeType;
       103: new           #1                  // class ext/mods/gameserver/enums/PrivilegeType
       106: dup
       107: ldc           #109                // String SP_EDIT_CREST
       109: bipush        7
       111: sipush        128
       114: invokespecial #100                // Method "<init>":(Ljava/lang/String;II)V
       117: putstatic     #25                 // Field SP_EDIT_CREST:Lext/mods/gameserver/enums/PrivilegeType;
       120: new           #1                  // class ext/mods/gameserver/enums/PrivilegeType
       123: dup
       124: ldc           #110                // String SP_MASTER_RIGHTS
       126: bipush        8
       128: sipush        256
       131: invokespecial #100                // Method "<init>":(Ljava/lang/String;II)V
       134: putstatic     #28                 // Field SP_MASTER_RIGHTS:Lext/mods/gameserver/enums/PrivilegeType;
       137: new           #1                  // class ext/mods/gameserver/enums/PrivilegeType
       140: dup
       141: ldc           #111                // String SP_MANAGE_LEVELS
       143: bipush        9
       145: sipush        512
       148: invokespecial #100                // Method "<init>":(Ljava/lang/String;II)V
       151: putstatic     #31                 // Field SP_MANAGE_LEVELS:Lext/mods/gameserver/enums/PrivilegeType;
       154: new           #1                  // class ext/mods/gameserver/enums/PrivilegeType
       157: dup
       158: ldc           #112                // String CHP_ENTRY_EXIT_RIGHTS
       160: bipush        10
       162: sipush        1024
       165: invokespecial #100                // Method "<init>":(Ljava/lang/String;II)V
       168: putstatic     #34                 // Field CHP_ENTRY_EXIT_RIGHTS:Lext/mods/gameserver/enums/PrivilegeType;
       171: new           #1                  // class ext/mods/gameserver/enums/PrivilegeType
       174: dup
       175: ldc           #113                // String CHP_USE_FUNCTIONS
       177: bipush        11
       179: sipush        2048
       182: invokespecial #100                // Method "<init>":(Ljava/lang/String;II)V
       185: putstatic     #37                 // Field CHP_USE_FUNCTIONS:Lext/mods/gameserver/enums/PrivilegeType;
       188: new           #1                  // class ext/mods/gameserver/enums/PrivilegeType
       191: dup
       192: ldc           #114                // String CHP_AUCTION
       194: bipush        12
       196: sipush        4096
       199: invokespecial #100                // Method "<init>":(Ljava/lang/String;II)V
       202: putstatic     #40                 // Field CHP_AUCTION:Lext/mods/gameserver/enums/PrivilegeType;
       205: new           #1                  // class ext/mods/gameserver/enums/PrivilegeType
       208: dup
       209: ldc           #115                // String CHP_RIGHT_TO_DISMISS
       211: bipush        13
       213: sipush        8192
       216: invokespecial #100                // Method "<init>":(Ljava/lang/String;II)V
       219: putstatic     #43                 // Field CHP_RIGHT_TO_DISMISS:Lext/mods/gameserver/enums/PrivilegeType;
       222: new           #1                  // class ext/mods/gameserver/enums/PrivilegeType
       225: dup
       226: ldc           #116                // String CHP_SET_FUNCTIONS
       228: bipush        14
       230: sipush        16384
       233: invokespecial #100                // Method "<init>":(Ljava/lang/String;II)V
       236: putstatic     #46                 // Field CHP_SET_FUNCTIONS:Lext/mods/gameserver/enums/PrivilegeType;
       239: new           #1                  // class ext/mods/gameserver/enums/PrivilegeType
       242: dup
       243: ldc           #117                // String CP_ENTRY_EXIT_RIGHTS
       245: bipush        15
       247: ldc           #118                // int 32768
       249: invokespecial #100                // Method "<init>":(Ljava/lang/String;II)V
       252: putstatic     #49                 // Field CP_ENTRY_EXIT_RIGHTS:Lext/mods/gameserver/enums/PrivilegeType;
       255: new           #1                  // class ext/mods/gameserver/enums/PrivilegeType
       258: dup
       259: ldc           #119                // String CP_MANOR_ADMINISTRATION
       261: bipush        16
       263: ldc           #120                // int 65536
       265: invokespecial #100                // Method "<init>":(Ljava/lang/String;II)V
       268: putstatic     #52                 // Field CP_MANOR_ADMINISTRATION:Lext/mods/gameserver/enums/PrivilegeType;
       271: new           #1                  // class ext/mods/gameserver/enums/PrivilegeType
       274: dup
       275: ldc           #121                // String CP_MANAGE_SIEGE_WAR
       277: bipush        17
       279: ldc           #122                // int 131072
       281: invokespecial #100                // Method "<init>":(Ljava/lang/String;II)V
       284: putstatic     #55                 // Field CP_MANAGE_SIEGE_WAR:Lext/mods/gameserver/enums/PrivilegeType;
       287: new           #1                  // class ext/mods/gameserver/enums/PrivilegeType
       290: dup
       291: ldc           #123                // String CP_USE_FUNCTIONS
       293: bipush        18
       295: ldc           #124                // int 262144
       297: invokespecial #100                // Method "<init>":(Ljava/lang/String;II)V
       300: putstatic     #58                 // Field CP_USE_FUNCTIONS:Lext/mods/gameserver/enums/PrivilegeType;
       303: new           #1                  // class ext/mods/gameserver/enums/PrivilegeType
       306: dup
       307: ldc           #125                // String CP_RIGHT_TO_DISMISS
       309: bipush        19
       311: ldc           #126                // int 524288
       313: invokespecial #100                // Method "<init>":(Ljava/lang/String;II)V
       316: putstatic     #61                 // Field CP_RIGHT_TO_DISMISS:Lext/mods/gameserver/enums/PrivilegeType;
       319: new           #1                  // class ext/mods/gameserver/enums/PrivilegeType
       322: dup
       323: ldc           #127                // String CP_MANAGE_TAXES
       325: bipush        20
       327: ldc           #128                // int 1048576
       329: invokespecial #100                // Method "<init>":(Ljava/lang/String;II)V
       332: putstatic     #64                 // Field CP_MANAGE_TAXES:Lext/mods/gameserver/enums/PrivilegeType;
       335: new           #1                  // class ext/mods/gameserver/enums/PrivilegeType
       338: dup
       339: ldc           #129                // String CP_MERCENARIES
       341: bipush        21
       343: ldc           #130                // int 2097152
       345: invokespecial #100                // Method "<init>":(Ljava/lang/String;II)V
       348: putstatic     #67                 // Field CP_MERCENARIES:Lext/mods/gameserver/enums/PrivilegeType;
       351: new           #1                  // class ext/mods/gameserver/enums/PrivilegeType
       354: dup
       355: ldc           #131                // String CP_SET_FUNCTIONS
       357: bipush        22
       359: ldc           #132                // int 4194304
       361: invokespecial #100                // Method "<init>":(Ljava/lang/String;II)V
       364: putstatic     #70                 // Field CP_SET_FUNCTIONS:Lext/mods/gameserver/enums/PrivilegeType;
       367: new           #1                  // class ext/mods/gameserver/enums/PrivilegeType
       370: dup
       371: ldc           #133                // String ALL
       373: bipush        23
       375: ldc           #134                // int 8388606
       377: invokespecial #100                // Method "<init>":(Ljava/lang/String;II)V
       380: putstatic     #73                 // Field ALL:Lext/mods/gameserver/enums/PrivilegeType;
       383: invokestatic  #135                // Method $values:()[Lext/mods/gameserver/enums/PrivilegeType;
       386: putstatic     #76                 // Field $VALUES:[Lext/mods/gameserver/enums/PrivilegeType;
       389: return
      LineNumberTable:
        line 22: 0
        line 24: 14
        line 25: 28
        line 26: 42
        line 27: 57
        line 28: 72
        line 29: 87
        line 30: 103
        line 31: 120
        line 32: 137
        line 34: 154
        line 35: 171
        line 36: 188
        line 37: 205
        line 38: 222
        line 40: 239
        line 41: 255
        line 42: 271
        line 43: 287
        line 44: 303
        line 45: 319
        line 46: 335
        line 47: 351
        line 49: 367
        line 20: 383
}
Signature: #155                         // Ljava/lang/Enum<Lext/mods/gameserver/enums/PrivilegeType;>;
SourceFile: "PrivilegeType.java"
