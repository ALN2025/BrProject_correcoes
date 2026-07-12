// Bytecode for: ext.mods.gameserver.enums.items.WeaponType
// File: ext\mods\gameserver\enums\items\WeaponType.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/enums/items/WeaponType.class
  Last modified 9 de jul de 2026; size 2925 bytes
  MD5 checksum be0964c6bbe6a076fbbd44daf15ab5a2
  Compiled from "WeaponType.java"
public final class ext.mods.gameserver.enums.items.WeaponType extends java.lang.Enum<ext.mods.gameserver.enums.items.WeaponType> implements ext.mods.gameserver.enums.items.ItemType
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/gameserver/enums/items/WeaponType
  super_class: #56                        // java/lang/Enum
  interfaces: 1, fields: 19, methods: 8, attributes: 2
Constant pool:
    #1 = Class              #2            // ext/mods/gameserver/enums/items/WeaponType
    #2 = Utf8               ext/mods/gameserver/enums/items/WeaponType
    #3 = Fieldref           #1.#4         // ext/mods/gameserver/enums/items/WeaponType.NONE:Lext/mods/gameserver/enums/items/WeaponType;
    #4 = NameAndType        #5:#6         // NONE:Lext/mods/gameserver/enums/items/WeaponType;
    #5 = Utf8               NONE
    #6 = Utf8               Lext/mods/gameserver/enums/items/WeaponType;
    #7 = Fieldref           #1.#8         // ext/mods/gameserver/enums/items/WeaponType.SWORD:Lext/mods/gameserver/enums/items/WeaponType;
    #8 = NameAndType        #9:#6         // SWORD:Lext/mods/gameserver/enums/items/WeaponType;
    #9 = Utf8               SWORD
   #10 = Fieldref           #1.#11        // ext/mods/gameserver/enums/items/WeaponType.BLUNT:Lext/mods/gameserver/enums/items/WeaponType;
   #11 = NameAndType        #12:#6        // BLUNT:Lext/mods/gameserver/enums/items/WeaponType;
   #12 = Utf8               BLUNT
   #13 = Fieldref           #1.#14        // ext/mods/gameserver/enums/items/WeaponType.DAGGER:Lext/mods/gameserver/enums/items/WeaponType;
   #14 = NameAndType        #15:#6        // DAGGER:Lext/mods/gameserver/enums/items/WeaponType;
   #15 = Utf8               DAGGER
   #16 = Fieldref           #1.#17        // ext/mods/gameserver/enums/items/WeaponType.BOW:Lext/mods/gameserver/enums/items/WeaponType;
   #17 = NameAndType        #18:#6        // BOW:Lext/mods/gameserver/enums/items/WeaponType;
   #18 = Utf8               BOW
   #19 = Fieldref           #1.#20        // ext/mods/gameserver/enums/items/WeaponType.POLE:Lext/mods/gameserver/enums/items/WeaponType;
   #20 = NameAndType        #21:#6        // POLE:Lext/mods/gameserver/enums/items/WeaponType;
   #21 = Utf8               POLE
   #22 = Fieldref           #1.#23        // ext/mods/gameserver/enums/items/WeaponType.ETC:Lext/mods/gameserver/enums/items/WeaponType;
   #23 = NameAndType        #24:#6        // ETC:Lext/mods/gameserver/enums/items/WeaponType;
   #24 = Utf8               ETC
   #25 = Fieldref           #1.#26        // ext/mods/gameserver/enums/items/WeaponType.FIST:Lext/mods/gameserver/enums/items/WeaponType;
   #26 = NameAndType        #27:#6        // FIST:Lext/mods/gameserver/enums/items/WeaponType;
   #27 = Utf8               FIST
   #28 = Fieldref           #1.#29        // ext/mods/gameserver/enums/items/WeaponType.DUAL:Lext/mods/gameserver/enums/items/WeaponType;
   #29 = NameAndType        #30:#6        // DUAL:Lext/mods/gameserver/enums/items/WeaponType;
   #30 = Utf8               DUAL
   #31 = Fieldref           #1.#32        // ext/mods/gameserver/enums/items/WeaponType.DUALFIST:Lext/mods/gameserver/enums/items/WeaponType;
   #32 = NameAndType        #33:#6        // DUALFIST:Lext/mods/gameserver/enums/items/WeaponType;
   #33 = Utf8               DUALFIST
   #34 = Fieldref           #1.#35        // ext/mods/gameserver/enums/items/WeaponType.BIGSWORD:Lext/mods/gameserver/enums/items/WeaponType;
   #35 = NameAndType        #36:#6        // BIGSWORD:Lext/mods/gameserver/enums/items/WeaponType;
   #36 = Utf8               BIGSWORD
   #37 = Fieldref           #1.#38        // ext/mods/gameserver/enums/items/WeaponType.FISHINGROD:Lext/mods/gameserver/enums/items/WeaponType;
   #38 = NameAndType        #39:#6        // FISHINGROD:Lext/mods/gameserver/enums/items/WeaponType;
   #39 = Utf8               FISHINGROD
   #40 = Fieldref           #1.#41        // ext/mods/gameserver/enums/items/WeaponType.BIGBLUNT:Lext/mods/gameserver/enums/items/WeaponType;
   #41 = NameAndType        #42:#6        // BIGBLUNT:Lext/mods/gameserver/enums/items/WeaponType;
   #42 = Utf8               BIGBLUNT
   #43 = Fieldref           #1.#44        // ext/mods/gameserver/enums/items/WeaponType.PET:Lext/mods/gameserver/enums/items/WeaponType;
   #44 = NameAndType        #45:#6        // PET:Lext/mods/gameserver/enums/items/WeaponType;
   #45 = Utf8               PET
   #46 = Fieldref           #1.#47        // ext/mods/gameserver/enums/items/WeaponType.$VALUES:[Lext/mods/gameserver/enums/items/WeaponType;
   #47 = NameAndType        #48:#49       // $VALUES:[Lext/mods/gameserver/enums/items/WeaponType;
   #48 = Utf8               $VALUES
   #49 = Utf8               [Lext/mods/gameserver/enums/items/WeaponType;
   #50 = Methodref          #51.#52       // "[Lext/mods/gameserver/enums/items/WeaponType;".clone:()Ljava/lang/Object;
   #51 = Class              #49           // "[Lext/mods/gameserver/enums/items/WeaponType;"
   #52 = NameAndType        #53:#54       // clone:()Ljava/lang/Object;
   #53 = Utf8               clone
   #54 = Utf8               ()Ljava/lang/Object;
   #55 = Methodref          #56.#57       // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #56 = Class              #58           // java/lang/Enum
   #57 = NameAndType        #59:#60       // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #58 = Utf8               java/lang/Enum
   #59 = Utf8               valueOf
   #60 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
   #61 = Methodref          #56.#62       // java/lang/Enum."<init>":(Ljava/lang/String;I)V
   #62 = NameAndType        #63:#64       // "<init>":(Ljava/lang/String;I)V
   #63 = Utf8               <init>
   #64 = Utf8               (Ljava/lang/String;I)V
   #65 = Methodref          #1.#66        // ext/mods/gameserver/enums/items/WeaponType.ordinal:()I
   #66 = NameAndType        #67:#68       // ordinal:()I
   #67 = Utf8               ordinal
   #68 = Utf8               ()I
   #69 = Fieldref           #1.#70        // ext/mods/gameserver/enums/items/WeaponType._mask:I
   #70 = NameAndType        #71:#72       // _mask:I
   #71 = Utf8               _mask
   #72 = Utf8               I
   #73 = Fieldref           #1.#74        // ext/mods/gameserver/enums/items/WeaponType._range:I
   #74 = NameAndType        #75:#72       // _range:I
   #75 = Utf8               _range
   #76 = Fieldref           #1.#77        // ext/mods/gameserver/enums/items/WeaponType._vulnStat:Lext/mods/gameserver/enums/skills/Stats;
   #77 = NameAndType        #78:#79       // _vulnStat:Lext/mods/gameserver/enums/skills/Stats;
   #78 = Utf8               _vulnStat
   #79 = Utf8               Lext/mods/gameserver/enums/skills/Stats;
   #80 = String             #5            // NONE
   #81 = Methodref          #1.#82        // ext/mods/gameserver/enums/items/WeaponType."<init>":(Ljava/lang/String;IILext/mods/gameserver/enums/skills/Stats;)V
   #82 = NameAndType        #63:#83       // "<init>":(Ljava/lang/String;IILext/mods/gameserver/enums/skills/Stats;)V
   #83 = Utf8               (Ljava/lang/String;IILext/mods/gameserver/enums/skills/Stats;)V
   #84 = String             #9            // SWORD
   #85 = Fieldref           #86.#87       // ext/mods/gameserver/enums/skills/Stats.SWORD_WPN_VULN:Lext/mods/gameserver/enums/skills/Stats;
   #86 = Class              #88           // ext/mods/gameserver/enums/skills/Stats
   #87 = NameAndType        #89:#79       // SWORD_WPN_VULN:Lext/mods/gameserver/enums/skills/Stats;
   #88 = Utf8               ext/mods/gameserver/enums/skills/Stats
   #89 = Utf8               SWORD_WPN_VULN
   #90 = String             #12           // BLUNT
   #91 = Fieldref           #86.#92       // ext/mods/gameserver/enums/skills/Stats.BLUNT_WPN_VULN:Lext/mods/gameserver/enums/skills/Stats;
   #92 = NameAndType        #93:#79       // BLUNT_WPN_VULN:Lext/mods/gameserver/enums/skills/Stats;
   #93 = Utf8               BLUNT_WPN_VULN
   #94 = String             #15           // DAGGER
   #95 = Fieldref           #86.#96       // ext/mods/gameserver/enums/skills/Stats.DAGGER_WPN_VULN:Lext/mods/gameserver/enums/skills/Stats;
   #96 = NameAndType        #97:#79       // DAGGER_WPN_VULN:Lext/mods/gameserver/enums/skills/Stats;
   #97 = Utf8               DAGGER_WPN_VULN
   #98 = String             #18           // BOW
   #99 = Fieldref           #86.#100      // ext/mods/gameserver/enums/skills/Stats.BOW_WPN_VULN:Lext/mods/gameserver/enums/skills/Stats;
  #100 = NameAndType        #101:#79      // BOW_WPN_VULN:Lext/mods/gameserver/enums/skills/Stats;
  #101 = Utf8               BOW_WPN_VULN
  #102 = String             #21           // POLE
  #103 = Fieldref           #86.#104      // ext/mods/gameserver/enums/skills/Stats.POLE_WPN_VULN:Lext/mods/gameserver/enums/skills/Stats;
  #104 = NameAndType        #105:#79      // POLE_WPN_VULN:Lext/mods/gameserver/enums/skills/Stats;
  #105 = Utf8               POLE_WPN_VULN
  #106 = String             #24           // ETC
  #107 = String             #27           // FIST
  #108 = String             #30           // DUAL
  #109 = Fieldref           #86.#110      // ext/mods/gameserver/enums/skills/Stats.DUAL_WPN_VULN:Lext/mods/gameserver/enums/skills/Stats;
  #110 = NameAndType        #111:#79      // DUAL_WPN_VULN:Lext/mods/gameserver/enums/skills/Stats;
  #111 = Utf8               DUAL_WPN_VULN
  #112 = String             #33           // DUALFIST
  #113 = Fieldref           #86.#114      // ext/mods/gameserver/enums/skills/Stats.DUALFIST_WPN_VULN:Lext/mods/gameserver/enums/skills/Stats;
  #114 = NameAndType        #115:#79      // DUALFIST_WPN_VULN:Lext/mods/gameserver/enums/skills/Stats;
  #115 = Utf8               DUALFIST_WPN_VULN
  #116 = String             #36           // BIGSWORD
  #117 = Fieldref           #86.#118      // ext/mods/gameserver/enums/skills/Stats.BIGSWORD_WPN_VULN:Lext/mods/gameserver/enums/skills/Stats;
  #118 = NameAndType        #119:#79      // BIGSWORD_WPN_VULN:Lext/mods/gameserver/enums/skills/Stats;
  #119 = Utf8               BIGSWORD_WPN_VULN
  #120 = String             #39           // FISHINGROD
  #121 = String             #42           // BIGBLUNT
  #122 = Fieldref           #86.#123      // ext/mods/gameserver/enums/skills/Stats.BIGBLUNT_WPN_VULN:Lext/mods/gameserver/enums/skills/Stats;
  #123 = NameAndType        #124:#79      // BIGBLUNT_WPN_VULN:Lext/mods/gameserver/enums/skills/Stats;
  #124 = Utf8               BIGBLUNT_WPN_VULN
  #125 = String             #45           // PET
  #126 = Methodref          #1.#127       // ext/mods/gameserver/enums/items/WeaponType.$values:()[Lext/mods/gameserver/enums/items/WeaponType;
  #127 = NameAndType        #128:#129     // $values:()[Lext/mods/gameserver/enums/items/WeaponType;
  #128 = Utf8               $values
  #129 = Utf8               ()[Lext/mods/gameserver/enums/items/WeaponType;
  #130 = Methodref          #1.#131       // ext/mods/gameserver/enums/items/WeaponType.values:()[Lext/mods/gameserver/enums/items/WeaponType;
  #131 = NameAndType        #132:#129     // values:()[Lext/mods/gameserver/enums/items/WeaponType;
  #132 = Utf8               values
  #133 = Fieldref           #1.#134       // ext/mods/gameserver/enums/items/WeaponType.VALUES:[Lext/mods/gameserver/enums/items/WeaponType;
  #134 = NameAndType        #135:#49      // VALUES:[Lext/mods/gameserver/enums/items/WeaponType;
  #135 = Utf8               VALUES
  #136 = Class              #137          // ext/mods/gameserver/enums/items/ItemType
  #137 = Utf8               ext/mods/gameserver/enums/items/ItemType
  #138 = Utf8               Code
  #139 = Utf8               LineNumberTable
  #140 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/enums/items/WeaponType;
  #141 = Utf8               LocalVariableTable
  #142 = Utf8               name
  #143 = Utf8               Ljava/lang/String;
  #144 = Utf8               MethodParameters
  #145 = Utf8               this
  #146 = Utf8               range
  #147 = Utf8               stat
  #148 = Utf8               Signature
  #149 = Utf8               (ILext/mods/gameserver/enums/skills/Stats;)V
  #150 = Utf8               mask
  #151 = Utf8               getRange
  #152 = Utf8               getVulnStat
  #153 = Utf8               ()Lext/mods/gameserver/enums/skills/Stats;
  #154 = Utf8               <clinit>
  #155 = Utf8               ()V
  #156 = Utf8               Ljava/lang/Enum<Lext/mods/gameserver/enums/items/WeaponType;>;Lext/mods/gameserver/enums/items/ItemType;
  #157 = Utf8               SourceFile
  #158 = Utf8               WeaponType.java
{
  public static final ext.mods.gameserver.enums.items.WeaponType NONE;
    descriptor: Lext/mods/gameserver/enums/items/WeaponType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.WeaponType SWORD;
    descriptor: Lext/mods/gameserver/enums/items/WeaponType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.WeaponType BLUNT;
    descriptor: Lext/mods/gameserver/enums/items/WeaponType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.WeaponType DAGGER;
    descriptor: Lext/mods/gameserver/enums/items/WeaponType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.WeaponType BOW;
    descriptor: Lext/mods/gameserver/enums/items/WeaponType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.WeaponType POLE;
    descriptor: Lext/mods/gameserver/enums/items/WeaponType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.WeaponType ETC;
    descriptor: Lext/mods/gameserver/enums/items/WeaponType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.WeaponType FIST;
    descriptor: Lext/mods/gameserver/enums/items/WeaponType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.WeaponType DUAL;
    descriptor: Lext/mods/gameserver/enums/items/WeaponType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.WeaponType DUALFIST;
    descriptor: Lext/mods/gameserver/enums/items/WeaponType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.WeaponType BIGSWORD;
    descriptor: Lext/mods/gameserver/enums/items/WeaponType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.WeaponType FISHINGROD;
    descriptor: Lext/mods/gameserver/enums/items/WeaponType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.WeaponType BIGBLUNT;
    descriptor: Lext/mods/gameserver/enums/items/WeaponType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.WeaponType PET;
    descriptor: Lext/mods/gameserver/enums/items/WeaponType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.items.WeaponType[] VALUES;
    descriptor: [Lext/mods/gameserver/enums/items/WeaponType;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL

  public static ext.mods.gameserver.enums.items.WeaponType[] values();
    descriptor: ()[Lext/mods/gameserver/enums/items/WeaponType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #46                 // Field $VALUES:[Lext/mods/gameserver/enums/items/WeaponType;
         3: invokevirtual #50                 // Method "[Lext/mods/gameserver/enums/items/WeaponType;".clone:()Ljava/lang/Object;
         6: checkcast     #51                 // class "[Lext/mods/gameserver/enums/items/WeaponType;"
         9: areturn
      LineNumberTable:
        line 22: 0

  public static ext.mods.gameserver.enums.items.WeaponType valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/enums/items/WeaponType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/gameserver/enums/items/WeaponType
         2: aload_0
         3: invokestatic  #55                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/gameserver/enums/items/WeaponType
         9: areturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  name   Ljava/lang/String;
    MethodParameters:
      Name                           Flags
      <no name>                      mandated

  public int mask();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #69                 // Field _mask:I
         4: ireturn
      LineNumberTable:
        line 57: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/enums/items/WeaponType;

  public int getRange();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #73                 // Field _range:I
         4: ireturn
      LineNumberTable:
        line 62: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/enums/items/WeaponType;

  public ext.mods.gameserver.enums.skills.Stats getVulnStat();
    descriptor: ()Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #76                 // Field _vulnStat:Lext/mods/gameserver/enums/skills/Stats;
         4: areturn
      LineNumberTable:
        line 67: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/enums/items/WeaponType;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=6, locals=0, args_size=0
         0: new           #1                  // class ext/mods/gameserver/enums/items/WeaponType
         3: dup
         4: ldc           #80                 // String NONE
         6: iconst_0
         7: bipush        40
         9: aconst_null
        10: invokespecial #81                 // Method "<init>":(Ljava/lang/String;IILext/mods/gameserver/enums/skills/Stats;)V
        13: putstatic     #3                  // Field NONE:Lext/mods/gameserver/enums/items/WeaponType;
        16: new           #1                  // class ext/mods/gameserver/enums/items/WeaponType
        19: dup
        20: ldc           #84                 // String SWORD
        22: iconst_1
        23: bipush        40
        25: getstatic     #85                 // Field ext/mods/gameserver/enums/skills/Stats.SWORD_WPN_VULN:Lext/mods/gameserver/enums/skills/Stats;
        28: invokespecial #81                 // Method "<init>":(Ljava/lang/String;IILext/mods/gameserver/enums/skills/Stats;)V
        31: putstatic     #7                  // Field SWORD:Lext/mods/gameserver/enums/items/WeaponType;
        34: new           #1                  // class ext/mods/gameserver/enums/items/WeaponType
        37: dup
        38: ldc           #90                 // String BLUNT
        40: iconst_2
        41: bipush        40
        43: getstatic     #91                 // Field ext/mods/gameserver/enums/skills/Stats.BLUNT_WPN_VULN:Lext/mods/gameserver/enums/skills/Stats;
        46: invokespecial #81                 // Method "<init>":(Ljava/lang/String;IILext/mods/gameserver/enums/skills/Stats;)V
        49: putstatic     #10                 // Field BLUNT:Lext/mods/gameserver/enums/items/WeaponType;
        52: new           #1                  // class ext/mods/gameserver/enums/items/WeaponType
        55: dup
        56: ldc           #94                 // String DAGGER
        58: iconst_3
        59: bipush        40
        61: getstatic     #95                 // Field ext/mods/gameserver/enums/skills/Stats.DAGGER_WPN_VULN:Lext/mods/gameserver/enums/skills/Stats;
        64: invokespecial #81                 // Method "<init>":(Ljava/lang/String;IILext/mods/gameserver/enums/skills/Stats;)V
        67: putstatic     #13                 // Field DAGGER:Lext/mods/gameserver/enums/items/WeaponType;
        70: new           #1                  // class ext/mods/gameserver/enums/items/WeaponType
        73: dup
        74: ldc           #98                 // String BOW
        76: iconst_4
        77: sipush        500
        80: getstatic     #99                 // Field ext/mods/gameserver/enums/skills/Stats.BOW_WPN_VULN:Lext/mods/gameserver/enums/skills/Stats;
        83: invokespecial #81                 // Method "<init>":(Ljava/lang/String;IILext/mods/gameserver/enums/skills/Stats;)V
        86: putstatic     #16                 // Field BOW:Lext/mods/gameserver/enums/items/WeaponType;
        89: new           #1                  // class ext/mods/gameserver/enums/items/WeaponType
        92: dup
        93: ldc           #102                // String POLE
        95: iconst_5
        96: bipush        66
        98: getstatic     #103                // Field ext/mods/gameserver/enums/skills/Stats.POLE_WPN_VULN:Lext/mods/gameserver/enums/skills/Stats;
       101: invokespecial #81                 // Method "<init>":(Ljava/lang/String;IILext/mods/gameserver/enums/skills/Stats;)V
       104: putstatic     #19                 // Field POLE:Lext/mods/gameserver/enums/items/WeaponType;
       107: new           #1                  // class ext/mods/gameserver/enums/items/WeaponType
       110: dup
       111: ldc           #106                // String ETC
       113: bipush        6
       115: bipush        40
       117: aconst_null
       118: invokespecial #81                 // Method "<init>":(Ljava/lang/String;IILext/mods/gameserver/enums/skills/Stats;)V
       121: putstatic     #22                 // Field ETC:Lext/mods/gameserver/enums/items/WeaponType;
       124: new           #1                  // class ext/mods/gameserver/enums/items/WeaponType
       127: dup
       128: ldc           #107                // String FIST
       130: bipush        7
       132: bipush        40
       134: aconst_null
       135: invokespecial #81                 // Method "<init>":(Ljava/lang/String;IILext/mods/gameserver/enums/skills/Stats;)V
       138: putstatic     #25                 // Field FIST:Lext/mods/gameserver/enums/items/WeaponType;
       141: new           #1                  // class ext/mods/gameserver/enums/items/WeaponType
       144: dup
       145: ldc           #108                // String DUAL
       147: bipush        8
       149: bipush        40
       151: getstatic     #109                // Field ext/mods/gameserver/enums/skills/Stats.DUAL_WPN_VULN:Lext/mods/gameserver/enums/skills/Stats;
       154: invokespecial #81                 // Method "<init>":(Ljava/lang/String;IILext/mods/gameserver/enums/skills/Stats;)V
       157: putstatic     #28                 // Field DUAL:Lext/mods/gameserver/enums/items/WeaponType;
       160: new           #1                  // class ext/mods/gameserver/enums/items/WeaponType
       163: dup
       164: ldc           #112                // String DUALFIST
       166: bipush        9
       168: bipush        40
       170: getstatic     #113                // Field ext/mods/gameserver/enums/skills/Stats.DUALFIST_WPN_VULN:Lext/mods/gameserver/enums/skills/Stats;
       173: invokespecial #81                 // Method "<init>":(Ljava/lang/String;IILext/mods/gameserver/enums/skills/Stats;)V
       176: putstatic     #31                 // Field DUALFIST:Lext/mods/gameserver/enums/items/WeaponType;
       179: new           #1                  // class ext/mods/gameserver/enums/items/WeaponType
       182: dup
       183: ldc           #116                // String BIGSWORD
       185: bipush        10
       187: bipush        40
       189: getstatic     #117                // Field ext/mods/gameserver/enums/skills/Stats.BIGSWORD_WPN_VULN:Lext/mods/gameserver/enums/skills/Stats;
       192: invokespecial #81                 // Method "<init>":(Ljava/lang/String;IILext/mods/gameserver/enums/skills/Stats;)V
       195: putstatic     #34                 // Field BIGSWORD:Lext/mods/gameserver/enums/items/WeaponType;
       198: new           #1                  // class ext/mods/gameserver/enums/items/WeaponType
       201: dup
       202: ldc           #120                // String FISHINGROD
       204: bipush        11
       206: bipush        40
       208: aconst_null
       209: invokespecial #81                 // Method "<init>":(Ljava/lang/String;IILext/mods/gameserver/enums/skills/Stats;)V
       212: putstatic     #37                 // Field FISHINGROD:Lext/mods/gameserver/enums/items/WeaponType;
       215: new           #1                  // class ext/mods/gameserver/enums/items/WeaponType
       218: dup
       219: ldc           #121                // String BIGBLUNT
       221: bipush        12
       223: bipush        40
       225: getstatic     #122                // Field ext/mods/gameserver/enums/skills/Stats.BIGBLUNT_WPN_VULN:Lext/mods/gameserver/enums/skills/Stats;
       228: invokespecial #81                 // Method "<init>":(Ljava/lang/String;IILext/mods/gameserver/enums/skills/Stats;)V
       231: putstatic     #40                 // Field BIGBLUNT:Lext/mods/gameserver/enums/items/WeaponType;
       234: new           #1                  // class ext/mods/gameserver/enums/items/WeaponType
       237: dup
       238: ldc           #125                // String PET
       240: bipush        13
       242: bipush        40
       244: aconst_null
       245: invokespecial #81                 // Method "<init>":(Ljava/lang/String;IILext/mods/gameserver/enums/skills/Stats;)V
       248: putstatic     #43                 // Field PET:Lext/mods/gameserver/enums/items/WeaponType;
       251: invokestatic  #126                // Method $values:()[Lext/mods/gameserver/enums/items/WeaponType;
       254: putstatic     #46                 // Field $VALUES:[Lext/mods/gameserver/enums/items/WeaponType;
       257: invokestatic  #130                // Method values:()[Lext/mods/gameserver/enums/items/WeaponType;
       260: putstatic     #133                // Field VALUES:[Lext/mods/gameserver/enums/items/WeaponType;
       263: return
      LineNumberTable:
        line 24: 0
        line 25: 16
        line 26: 34
        line 27: 52
        line 28: 70
        line 29: 89
        line 30: 107
        line 31: 124
        line 32: 141
        line 33: 160
        line 34: 179
        line 35: 198
        line 36: 215
        line 37: 234
        line 22: 251
        line 39: 257
}
Signature: #156                         // Ljava/lang/Enum<Lext/mods/gameserver/enums/items/WeaponType;>;Lext/mods/gameserver/enums/items/ItemType;
SourceFile: "WeaponType.java"
