// Bytecode for: ext.mods.gameserver.enums.ZoneId
// File: ext\mods\gameserver\enums\ZoneId.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/enums/ZoneId.class
  Last modified 9 de jul de 2026; size 2668 bytes
  MD5 checksum f9e2e94e04f06a3b949479fe7cc81fe4
  Compiled from "ZoneId.java"
public final class ext.mods.gameserver.enums.ZoneId extends java.lang.Enum<ext.mods.gameserver.enums.ZoneId>
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/gameserver/enums/ZoneId
  super_class: #89                        // java/lang/Enum
  interfaces: 0, fields: 28, methods: 6, attributes: 2
Constant pool:
    #1 = Class              #2            // ext/mods/gameserver/enums/ZoneId
    #2 = Utf8               ext/mods/gameserver/enums/ZoneId
    #3 = Fieldref           #1.#4         // ext/mods/gameserver/enums/ZoneId.PVP:Lext/mods/gameserver/enums/ZoneId;
    #4 = NameAndType        #5:#6         // PVP:Lext/mods/gameserver/enums/ZoneId;
    #5 = Utf8               PVP
    #6 = Utf8               Lext/mods/gameserver/enums/ZoneId;
    #7 = Fieldref           #1.#8         // ext/mods/gameserver/enums/ZoneId.PEACE:Lext/mods/gameserver/enums/ZoneId;
    #8 = NameAndType        #9:#6         // PEACE:Lext/mods/gameserver/enums/ZoneId;
    #9 = Utf8               PEACE
   #10 = Fieldref           #1.#11        // ext/mods/gameserver/enums/ZoneId.SIEGE:Lext/mods/gameserver/enums/ZoneId;
   #11 = NameAndType        #12:#6        // SIEGE:Lext/mods/gameserver/enums/ZoneId;
   #12 = Utf8               SIEGE
   #13 = Fieldref           #1.#14        // ext/mods/gameserver/enums/ZoneId.MOTHER_TREE:Lext/mods/gameserver/enums/ZoneId;
   #14 = NameAndType        #15:#6        // MOTHER_TREE:Lext/mods/gameserver/enums/ZoneId;
   #15 = Utf8               MOTHER_TREE
   #16 = Fieldref           #1.#17        // ext/mods/gameserver/enums/ZoneId.CLAN_HALL:Lext/mods/gameserver/enums/ZoneId;
   #17 = NameAndType        #18:#6        // CLAN_HALL:Lext/mods/gameserver/enums/ZoneId;
   #18 = Utf8               CLAN_HALL
   #19 = Fieldref           #1.#20        // ext/mods/gameserver/enums/ZoneId.NO_LANDING:Lext/mods/gameserver/enums/ZoneId;
   #20 = NameAndType        #21:#6        // NO_LANDING:Lext/mods/gameserver/enums/ZoneId;
   #21 = Utf8               NO_LANDING
   #22 = Fieldref           #1.#23        // ext/mods/gameserver/enums/ZoneId.WATER:Lext/mods/gameserver/enums/ZoneId;
   #23 = NameAndType        #24:#6        // WATER:Lext/mods/gameserver/enums/ZoneId;
   #24 = Utf8               WATER
   #25 = Fieldref           #1.#26        // ext/mods/gameserver/enums/ZoneId.JAIL:Lext/mods/gameserver/enums/ZoneId;
   #26 = NameAndType        #27:#6        // JAIL:Lext/mods/gameserver/enums/ZoneId;
   #27 = Utf8               JAIL
   #28 = Fieldref           #1.#29        // ext/mods/gameserver/enums/ZoneId.MONSTER_TRACK:Lext/mods/gameserver/enums/ZoneId;
   #29 = NameAndType        #30:#6        // MONSTER_TRACK:Lext/mods/gameserver/enums/ZoneId;
   #30 = Utf8               MONSTER_TRACK
   #31 = Fieldref           #1.#32        // ext/mods/gameserver/enums/ZoneId.CASTLE:Lext/mods/gameserver/enums/ZoneId;
   #32 = NameAndType        #33:#6        // CASTLE:Lext/mods/gameserver/enums/ZoneId;
   #33 = Utf8               CASTLE
   #34 = Fieldref           #1.#35        // ext/mods/gameserver/enums/ZoneId.SWAMP:Lext/mods/gameserver/enums/ZoneId;
   #35 = NameAndType        #36:#6        // SWAMP:Lext/mods/gameserver/enums/ZoneId;
   #36 = Utf8               SWAMP
   #37 = Fieldref           #1.#38        // ext/mods/gameserver/enums/ZoneId.NO_SUMMON_FRIEND:Lext/mods/gameserver/enums/ZoneId;
   #38 = NameAndType        #39:#6        // NO_SUMMON_FRIEND:Lext/mods/gameserver/enums/ZoneId;
   #39 = Utf8               NO_SUMMON_FRIEND
   #40 = Fieldref           #1.#41        // ext/mods/gameserver/enums/ZoneId.NO_STORE:Lext/mods/gameserver/enums/ZoneId;
   #41 = NameAndType        #42:#6        // NO_STORE:Lext/mods/gameserver/enums/ZoneId;
   #42 = Utf8               NO_STORE
   #43 = Fieldref           #1.#44        // ext/mods/gameserver/enums/ZoneId.TOWN:Lext/mods/gameserver/enums/ZoneId;
   #44 = NameAndType        #45:#6        // TOWN:Lext/mods/gameserver/enums/ZoneId;
   #45 = Utf8               TOWN
   #46 = Fieldref           #1.#47        // ext/mods/gameserver/enums/ZoneId.HQ:Lext/mods/gameserver/enums/ZoneId;
   #47 = NameAndType        #48:#6        // HQ:Lext/mods/gameserver/enums/ZoneId;
   #48 = Utf8               HQ
   #49 = Fieldref           #1.#50        // ext/mods/gameserver/enums/ZoneId.DANGER_AREA:Lext/mods/gameserver/enums/ZoneId;
   #50 = NameAndType        #51:#6        // DANGER_AREA:Lext/mods/gameserver/enums/ZoneId;
   #51 = Utf8               DANGER_AREA
   #52 = Fieldref           #1.#53        // ext/mods/gameserver/enums/ZoneId.CAST_ON_ARTIFACT:Lext/mods/gameserver/enums/ZoneId;
   #53 = NameAndType        #54:#6        // CAST_ON_ARTIFACT:Lext/mods/gameserver/enums/ZoneId;
   #54 = Utf8               CAST_ON_ARTIFACT
   #55 = Fieldref           #1.#56        // ext/mods/gameserver/enums/ZoneId.NO_RESTART:Lext/mods/gameserver/enums/ZoneId;
   #56 = NameAndType        #57:#6        // NO_RESTART:Lext/mods/gameserver/enums/ZoneId;
   #57 = Utf8               NO_RESTART
   #58 = Fieldref           #1.#59        // ext/mods/gameserver/enums/ZoneId.SCRIPT:Lext/mods/gameserver/enums/ZoneId;
   #59 = NameAndType        #60:#6        // SCRIPT:Lext/mods/gameserver/enums/ZoneId;
   #60 = Utf8               SCRIPT
   #61 = Fieldref           #1.#62        // ext/mods/gameserver/enums/ZoneId.BOSS:Lext/mods/gameserver/enums/ZoneId;
   #62 = NameAndType        #63:#6        // BOSS:Lext/mods/gameserver/enums/ZoneId;
   #63 = Utf8               BOSS
   #64 = Fieldref           #1.#65        // ext/mods/gameserver/enums/ZoneId.PAGAN:Lext/mods/gameserver/enums/ZoneId;
   #65 = NameAndType        #66:#6        // PAGAN:Lext/mods/gameserver/enums/ZoneId;
   #66 = Utf8               PAGAN
   #67 = Fieldref           #1.#68        // ext/mods/gameserver/enums/ZoneId.SSQ:Lext/mods/gameserver/enums/ZoneId;
   #68 = NameAndType        #69:#6        // SSQ:Lext/mods/gameserver/enums/ZoneId;
   #69 = Utf8               SSQ
   #70 = Fieldref           #1.#71        // ext/mods/gameserver/enums/ZoneId.AUTO_FARM:Lext/mods/gameserver/enums/ZoneId;
   #71 = NameAndType        #72:#6        // AUTO_FARM:Lext/mods/gameserver/enums/ZoneId;
   #72 = Utf8               AUTO_FARM
   #73 = Fieldref           #1.#74        // ext/mods/gameserver/enums/ZoneId.RANDOM:Lext/mods/gameserver/enums/ZoneId;
   #74 = NameAndType        #75:#6        // RANDOM:Lext/mods/gameserver/enums/ZoneId;
   #75 = Utf8               RANDOM
   #76 = Fieldref           #1.#77        // ext/mods/gameserver/enums/ZoneId.COLISION:Lext/mods/gameserver/enums/ZoneId;
   #77 = NameAndType        #78:#6        // COLISION:Lext/mods/gameserver/enums/ZoneId;
   #78 = Utf8               COLISION
   #79 = Fieldref           #1.#80        // ext/mods/gameserver/enums/ZoneId.$VALUES:[Lext/mods/gameserver/enums/ZoneId;
   #80 = NameAndType        #81:#82       // $VALUES:[Lext/mods/gameserver/enums/ZoneId;
   #81 = Utf8               $VALUES
   #82 = Utf8               [Lext/mods/gameserver/enums/ZoneId;
   #83 = Methodref          #84.#85       // "[Lext/mods/gameserver/enums/ZoneId;".clone:()Ljava/lang/Object;
   #84 = Class              #82           // "[Lext/mods/gameserver/enums/ZoneId;"
   #85 = NameAndType        #86:#87       // clone:()Ljava/lang/Object;
   #86 = Utf8               clone
   #87 = Utf8               ()Ljava/lang/Object;
   #88 = Methodref          #89.#90       // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #89 = Class              #91           // java/lang/Enum
   #90 = NameAndType        #92:#93       // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #91 = Utf8               java/lang/Enum
   #92 = Utf8               valueOf
   #93 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #94 = Methodref          #89.#95       // java/lang/Enum."<init>":(Ljava/lang/String;I)V
   #95 = NameAndType        #96:#97       // "<init>":(Ljava/lang/String;I)V
   #96 = Utf8               <init>
   #97 = Utf8               (Ljava/lang/String;I)V
   #98 = Fieldref           #1.#99        // ext/mods/gameserver/enums/ZoneId._id:I
   #99 = NameAndType        #100:#101     // _id:I
  #100 = Utf8               _id
  #101 = Utf8               I
  #102 = String             #5            // PVP
  #103 = Methodref          #1.#104       // ext/mods/gameserver/enums/ZoneId."<init>":(Ljava/lang/String;II)V
  #104 = NameAndType        #96:#105      // "<init>":(Ljava/lang/String;II)V
  #105 = Utf8               (Ljava/lang/String;II)V
  #106 = String             #9            // PEACE
  #107 = String             #12           // SIEGE
  #108 = String             #15           // MOTHER_TREE
  #109 = String             #18           // CLAN_HALL
  #110 = String             #21           // NO_LANDING
  #111 = String             #24           // WATER
  #112 = String             #27           // JAIL
  #113 = String             #30           // MONSTER_TRACK
  #114 = String             #33           // CASTLE
  #115 = String             #36           // SWAMP
  #116 = String             #39           // NO_SUMMON_FRIEND
  #117 = String             #42           // NO_STORE
  #118 = String             #45           // TOWN
  #119 = String             #48           // HQ
  #120 = String             #51           // DANGER_AREA
  #121 = String             #54           // CAST_ON_ARTIFACT
  #122 = String             #57           // NO_RESTART
  #123 = String             #60           // SCRIPT
  #124 = String             #63           // BOSS
  #125 = String             #66           // PAGAN
  #126 = String             #69           // SSQ
  #127 = String             #72           // AUTO_FARM
  #128 = String             #75           // RANDOM
  #129 = String             #78           // COLISION
  #130 = Methodref          #1.#131       // ext/mods/gameserver/enums/ZoneId.$values:()[Lext/mods/gameserver/enums/ZoneId;
  #131 = NameAndType        #132:#133     // $values:()[Lext/mods/gameserver/enums/ZoneId;
  #132 = Utf8               $values
  #133 = Utf8               ()[Lext/mods/gameserver/enums/ZoneId;
  #134 = Methodref          #1.#135       // ext/mods/gameserver/enums/ZoneId.values:()[Lext/mods/gameserver/enums/ZoneId;
  #135 = NameAndType        #136:#133     // values:()[Lext/mods/gameserver/enums/ZoneId;
  #136 = Utf8               values
  #137 = Fieldref           #1.#138       // ext/mods/gameserver/enums/ZoneId.VALUES:[Lext/mods/gameserver/enums/ZoneId;
  #138 = NameAndType        #139:#82      // VALUES:[Lext/mods/gameserver/enums/ZoneId;
  #139 = Utf8               VALUES
  #140 = Utf8               Code
  #141 = Utf8               LineNumberTable
  #142 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/enums/ZoneId;
  #143 = Utf8               LocalVariableTable
  #144 = Utf8               name
  #145 = Utf8               Ljava/lang/String;
  #146 = Utf8               MethodParameters
  #147 = Utf8               this
  #148 = Utf8               id
  #149 = Utf8               Signature
  #150 = Utf8               (I)V
  #151 = Utf8               getId
  #152 = Utf8               ()I
  #153 = Utf8               <clinit>
  #154 = Utf8               ()V
  #155 = Utf8               Ljava/lang/Enum<Lext/mods/gameserver/enums/ZoneId;>;
  #156 = Utf8               SourceFile
  #157 = Utf8               ZoneId.java
{
  public static final ext.mods.gameserver.enums.ZoneId PVP;
    descriptor: Lext/mods/gameserver/enums/ZoneId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.ZoneId PEACE;
    descriptor: Lext/mods/gameserver/enums/ZoneId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.ZoneId SIEGE;
    descriptor: Lext/mods/gameserver/enums/ZoneId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.ZoneId MOTHER_TREE;
    descriptor: Lext/mods/gameserver/enums/ZoneId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.ZoneId CLAN_HALL;
    descriptor: Lext/mods/gameserver/enums/ZoneId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.ZoneId NO_LANDING;
    descriptor: Lext/mods/gameserver/enums/ZoneId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.ZoneId WATER;
    descriptor: Lext/mods/gameserver/enums/ZoneId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.ZoneId JAIL;
    descriptor: Lext/mods/gameserver/enums/ZoneId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.ZoneId MONSTER_TRACK;
    descriptor: Lext/mods/gameserver/enums/ZoneId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.ZoneId CASTLE;
    descriptor: Lext/mods/gameserver/enums/ZoneId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.ZoneId SWAMP;
    descriptor: Lext/mods/gameserver/enums/ZoneId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.ZoneId NO_SUMMON_FRIEND;
    descriptor: Lext/mods/gameserver/enums/ZoneId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.ZoneId NO_STORE;
    descriptor: Lext/mods/gameserver/enums/ZoneId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.ZoneId TOWN;
    descriptor: Lext/mods/gameserver/enums/ZoneId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.ZoneId HQ;
    descriptor: Lext/mods/gameserver/enums/ZoneId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.ZoneId DANGER_AREA;
    descriptor: Lext/mods/gameserver/enums/ZoneId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.ZoneId CAST_ON_ARTIFACT;
    descriptor: Lext/mods/gameserver/enums/ZoneId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.ZoneId NO_RESTART;
    descriptor: Lext/mods/gameserver/enums/ZoneId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.ZoneId SCRIPT;
    descriptor: Lext/mods/gameserver/enums/ZoneId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.ZoneId BOSS;
    descriptor: Lext/mods/gameserver/enums/ZoneId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.ZoneId PAGAN;
    descriptor: Lext/mods/gameserver/enums/ZoneId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.ZoneId SSQ;
    descriptor: Lext/mods/gameserver/enums/ZoneId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.ZoneId AUTO_FARM;
    descriptor: Lext/mods/gameserver/enums/ZoneId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.ZoneId RANDOM;
    descriptor: Lext/mods/gameserver/enums/ZoneId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.ZoneId COLISION;
    descriptor: Lext/mods/gameserver/enums/ZoneId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.ZoneId[] VALUES;
    descriptor: [Lext/mods/gameserver/enums/ZoneId;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL

  public static ext.mods.gameserver.enums.ZoneId[] values();
    descriptor: ()[Lext/mods/gameserver/enums/ZoneId;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #79                 // Field $VALUES:[Lext/mods/gameserver/enums/ZoneId;
         3: invokevirtual #83                 // Method "[Lext/mods/gameserver/enums/ZoneId;".clone:()Ljava/lang/Object;
         6: checkcast     #84                 // class "[Lext/mods/gameserver/enums/ZoneId;"
         9: areturn
      LineNumberTable:
        line 20: 0

  public static ext.mods.gameserver.enums.ZoneId valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/enums/ZoneId;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/gameserver/enums/ZoneId
         2: aload_0
         3: invokestatic  #88                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/gameserver/enums/ZoneId
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
         1: getfield      #98                 // Field _id:I
         4: ireturn
      LineNumberTable:
        line 57: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/enums/ZoneId;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=5, locals=0, args_size=0
         0: new           #1                  // class ext/mods/gameserver/enums/ZoneId
         3: dup
         4: ldc           #102                // String PVP
         6: iconst_0
         7: iconst_0
         8: invokespecial #103                // Method "<init>":(Ljava/lang/String;II)V
        11: putstatic     #3                  // Field PVP:Lext/mods/gameserver/enums/ZoneId;
        14: new           #1                  // class ext/mods/gameserver/enums/ZoneId
        17: dup
        18: ldc           #106                // String PEACE
        20: iconst_1
        21: iconst_1
        22: invokespecial #103                // Method "<init>":(Ljava/lang/String;II)V
        25: putstatic     #7                  // Field PEACE:Lext/mods/gameserver/enums/ZoneId;
        28: new           #1                  // class ext/mods/gameserver/enums/ZoneId
        31: dup
        32: ldc           #107                // String SIEGE
        34: iconst_2
        35: iconst_2
        36: invokespecial #103                // Method "<init>":(Ljava/lang/String;II)V
        39: putstatic     #10                 // Field SIEGE:Lext/mods/gameserver/enums/ZoneId;
        42: new           #1                  // class ext/mods/gameserver/enums/ZoneId
        45: dup
        46: ldc           #108                // String MOTHER_TREE
        48: iconst_3
        49: iconst_3
        50: invokespecial #103                // Method "<init>":(Ljava/lang/String;II)V
        53: putstatic     #13                 // Field MOTHER_TREE:Lext/mods/gameserver/enums/ZoneId;
        56: new           #1                  // class ext/mods/gameserver/enums/ZoneId
        59: dup
        60: ldc           #109                // String CLAN_HALL
        62: iconst_4
        63: iconst_4
        64: invokespecial #103                // Method "<init>":(Ljava/lang/String;II)V
        67: putstatic     #16                 // Field CLAN_HALL:Lext/mods/gameserver/enums/ZoneId;
        70: new           #1                  // class ext/mods/gameserver/enums/ZoneId
        73: dup
        74: ldc           #110                // String NO_LANDING
        76: iconst_5
        77: iconst_5
        78: invokespecial #103                // Method "<init>":(Ljava/lang/String;II)V
        81: putstatic     #19                 // Field NO_LANDING:Lext/mods/gameserver/enums/ZoneId;
        84: new           #1                  // class ext/mods/gameserver/enums/ZoneId
        87: dup
        88: ldc           #111                // String WATER
        90: bipush        6
        92: bipush        6
        94: invokespecial #103                // Method "<init>":(Ljava/lang/String;II)V
        97: putstatic     #22                 // Field WATER:Lext/mods/gameserver/enums/ZoneId;
       100: new           #1                  // class ext/mods/gameserver/enums/ZoneId
       103: dup
       104: ldc           #112                // String JAIL
       106: bipush        7
       108: bipush        7
       110: invokespecial #103                // Method "<init>":(Ljava/lang/String;II)V
       113: putstatic     #25                 // Field JAIL:Lext/mods/gameserver/enums/ZoneId;
       116: new           #1                  // class ext/mods/gameserver/enums/ZoneId
       119: dup
       120: ldc           #113                // String MONSTER_TRACK
       122: bipush        8
       124: bipush        8
       126: invokespecial #103                // Method "<init>":(Ljava/lang/String;II)V
       129: putstatic     #28                 // Field MONSTER_TRACK:Lext/mods/gameserver/enums/ZoneId;
       132: new           #1                  // class ext/mods/gameserver/enums/ZoneId
       135: dup
       136: ldc           #114                // String CASTLE
       138: bipush        9
       140: bipush        9
       142: invokespecial #103                // Method "<init>":(Ljava/lang/String;II)V
       145: putstatic     #31                 // Field CASTLE:Lext/mods/gameserver/enums/ZoneId;
       148: new           #1                  // class ext/mods/gameserver/enums/ZoneId
       151: dup
       152: ldc           #115                // String SWAMP
       154: bipush        10
       156: bipush        10
       158: invokespecial #103                // Method "<init>":(Ljava/lang/String;II)V
       161: putstatic     #34                 // Field SWAMP:Lext/mods/gameserver/enums/ZoneId;
       164: new           #1                  // class ext/mods/gameserver/enums/ZoneId
       167: dup
       168: ldc           #116                // String NO_SUMMON_FRIEND
       170: bipush        11
       172: bipush        11
       174: invokespecial #103                // Method "<init>":(Ljava/lang/String;II)V
       177: putstatic     #37                 // Field NO_SUMMON_FRIEND:Lext/mods/gameserver/enums/ZoneId;
       180: new           #1                  // class ext/mods/gameserver/enums/ZoneId
       183: dup
       184: ldc           #117                // String NO_STORE
       186: bipush        12
       188: bipush        12
       190: invokespecial #103                // Method "<init>":(Ljava/lang/String;II)V
       193: putstatic     #40                 // Field NO_STORE:Lext/mods/gameserver/enums/ZoneId;
       196: new           #1                  // class ext/mods/gameserver/enums/ZoneId
       199: dup
       200: ldc           #118                // String TOWN
       202: bipush        13
       204: bipush        13
       206: invokespecial #103                // Method "<init>":(Ljava/lang/String;II)V
       209: putstatic     #43                 // Field TOWN:Lext/mods/gameserver/enums/ZoneId;
       212: new           #1                  // class ext/mods/gameserver/enums/ZoneId
       215: dup
       216: ldc           #119                // String HQ
       218: bipush        14
       220: bipush        14
       222: invokespecial #103                // Method "<init>":(Ljava/lang/String;II)V
       225: putstatic     #46                 // Field HQ:Lext/mods/gameserver/enums/ZoneId;
       228: new           #1                  // class ext/mods/gameserver/enums/ZoneId
       231: dup
       232: ldc           #120                // String DANGER_AREA
       234: bipush        15
       236: bipush        15
       238: invokespecial #103                // Method "<init>":(Ljava/lang/String;II)V
       241: putstatic     #49                 // Field DANGER_AREA:Lext/mods/gameserver/enums/ZoneId;
       244: new           #1                  // class ext/mods/gameserver/enums/ZoneId
       247: dup
       248: ldc           #121                // String CAST_ON_ARTIFACT
       250: bipush        16
       252: bipush        16
       254: invokespecial #103                // Method "<init>":(Ljava/lang/String;II)V
       257: putstatic     #52                 // Field CAST_ON_ARTIFACT:Lext/mods/gameserver/enums/ZoneId;
       260: new           #1                  // class ext/mods/gameserver/enums/ZoneId
       263: dup
       264: ldc           #122                // String NO_RESTART
       266: bipush        17
       268: bipush        17
       270: invokespecial #103                // Method "<init>":(Ljava/lang/String;II)V
       273: putstatic     #55                 // Field NO_RESTART:Lext/mods/gameserver/enums/ZoneId;
       276: new           #1                  // class ext/mods/gameserver/enums/ZoneId
       279: dup
       280: ldc           #123                // String SCRIPT
       282: bipush        18
       284: bipush        18
       286: invokespecial #103                // Method "<init>":(Ljava/lang/String;II)V
       289: putstatic     #58                 // Field SCRIPT:Lext/mods/gameserver/enums/ZoneId;
       292: new           #1                  // class ext/mods/gameserver/enums/ZoneId
       295: dup
       296: ldc           #124                // String BOSS
       298: bipush        19
       300: bipush        19
       302: invokespecial #103                // Method "<init>":(Ljava/lang/String;II)V
       305: putstatic     #61                 // Field BOSS:Lext/mods/gameserver/enums/ZoneId;
       308: new           #1                  // class ext/mods/gameserver/enums/ZoneId
       311: dup
       312: ldc           #125                // String PAGAN
       314: bipush        20
       316: bipush        20
       318: invokespecial #103                // Method "<init>":(Ljava/lang/String;II)V
       321: putstatic     #64                 // Field PAGAN:Lext/mods/gameserver/enums/ZoneId;
       324: new           #1                  // class ext/mods/gameserver/enums/ZoneId
       327: dup
       328: ldc           #126                // String SSQ
       330: bipush        21
       332: bipush        21
       334: invokespecial #103                // Method "<init>":(Ljava/lang/String;II)V
       337: putstatic     #67                 // Field SSQ:Lext/mods/gameserver/enums/ZoneId;
       340: new           #1                  // class ext/mods/gameserver/enums/ZoneId
       343: dup
       344: ldc           #127                // String AUTO_FARM
       346: bipush        22
       348: bipush        22
       350: invokespecial #103                // Method "<init>":(Ljava/lang/String;II)V
       353: putstatic     #70                 // Field AUTO_FARM:Lext/mods/gameserver/enums/ZoneId;
       356: new           #1                  // class ext/mods/gameserver/enums/ZoneId
       359: dup
       360: ldc           #128                // String RANDOM
       362: bipush        23
       364: bipush        23
       366: invokespecial #103                // Method "<init>":(Ljava/lang/String;II)V
       369: putstatic     #73                 // Field RANDOM:Lext/mods/gameserver/enums/ZoneId;
       372: new           #1                  // class ext/mods/gameserver/enums/ZoneId
       375: dup
       376: ldc           #129                // String COLISION
       378: bipush        24
       380: bipush        24
       382: invokespecial #103                // Method "<init>":(Ljava/lang/String;II)V
       385: putstatic     #76                 // Field COLISION:Lext/mods/gameserver/enums/ZoneId;
       388: invokestatic  #130                // Method $values:()[Lext/mods/gameserver/enums/ZoneId;
       391: putstatic     #79                 // Field $VALUES:[Lext/mods/gameserver/enums/ZoneId;
       394: invokestatic  #134                // Method values:()[Lext/mods/gameserver/enums/ZoneId;
       397: putstatic     #137                // Field VALUES:[Lext/mods/gameserver/enums/ZoneId;
       400: return
      LineNumberTable:
        line 22: 0
        line 23: 14
        line 24: 28
        line 25: 42
        line 26: 56
        line 27: 70
        line 28: 84
        line 29: 100
        line 30: 116
        line 31: 132
        line 32: 148
        line 33: 164
        line 34: 180
        line 35: 196
        line 36: 212
        line 37: 228
        line 38: 244
        line 39: 260
        line 40: 276
        line 41: 292
        line 42: 308
        line 43: 324
        line 44: 340
        line 45: 356
        line 46: 372
        line 20: 388
        line 60: 394
}
Signature: #155                         // Ljava/lang/Enum<Lext/mods/gameserver/enums/ZoneId;>;
SourceFile: "ZoneId.java"
