// Bytecode for: ext.mods.gameserver.enums.skills.SkillTargetType
// File: ext\mods\gameserver\enums\skills\SkillTargetType.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/enums/skills/SkillTargetType.class
  Last modified 9 de jul de 2026; size 2759 bytes
  MD5 checksum 08188701b8b6d11ee0af99c7c2499379
  Compiled from "SkillTargetType.java"
public final class ext.mods.gameserver.enums.skills.SkillTargetType extends java.lang.Enum<ext.mods.gameserver.enums.skills.SkillTargetType>
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/gameserver/enums/skills/SkillTargetType
  super_class: #101                       // java/lang/Enum
  interfaces: 0, fields: 30, methods: 5, attributes: 2
Constant pool:
    #1 = Class              #2            // ext/mods/gameserver/enums/skills/SkillTargetType
    #2 = Utf8               ext/mods/gameserver/enums/skills/SkillTargetType
    #3 = Fieldref           #1.#4         // ext/mods/gameserver/enums/skills/SkillTargetType.NONE:Lext/mods/gameserver/enums/skills/SkillTargetType;
    #4 = NameAndType        #5:#6         // NONE:Lext/mods/gameserver/enums/skills/SkillTargetType;
    #5 = Utf8               NONE
    #6 = Utf8               Lext/mods/gameserver/enums/skills/SkillTargetType;
    #7 = Fieldref           #1.#8         // ext/mods/gameserver/enums/skills/SkillTargetType.SELF:Lext/mods/gameserver/enums/skills/SkillTargetType;
    #8 = NameAndType        #9:#6         // SELF:Lext/mods/gameserver/enums/skills/SkillTargetType;
    #9 = Utf8               SELF
   #10 = Fieldref           #1.#11        // ext/mods/gameserver/enums/skills/SkillTargetType.ONE:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #11 = NameAndType        #12:#6        // ONE:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #12 = Utf8               ONE
   #13 = Fieldref           #1.#14        // ext/mods/gameserver/enums/skills/SkillTargetType.PARTY:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #14 = NameAndType        #15:#6        // PARTY:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #15 = Utf8               PARTY
   #16 = Fieldref           #1.#17        // ext/mods/gameserver/enums/skills/SkillTargetType.ALLY:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #17 = NameAndType        #18:#6        // ALLY:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #18 = Utf8               ALLY
   #19 = Fieldref           #1.#20        // ext/mods/gameserver/enums/skills/SkillTargetType.CLAN:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #20 = NameAndType        #21:#6        // CLAN:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #21 = Utf8               CLAN
   #22 = Fieldref           #1.#23        // ext/mods/gameserver/enums/skills/SkillTargetType.AREA:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #23 = NameAndType        #24:#6        // AREA:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #24 = Utf8               AREA
   #25 = Fieldref           #1.#26        // ext/mods/gameserver/enums/skills/SkillTargetType.MONSTER_AREA:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #26 = NameAndType        #27:#6        // MONSTER_AREA:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #27 = Utf8               MONSTER_AREA
   #28 = Fieldref           #1.#29        // ext/mods/gameserver/enums/skills/SkillTargetType.FRONT_AREA:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #29 = NameAndType        #30:#6        // FRONT_AREA:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #30 = Utf8               FRONT_AREA
   #31 = Fieldref           #1.#32        // ext/mods/gameserver/enums/skills/SkillTargetType.AURA:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #32 = NameAndType        #33:#6        // AURA:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #33 = Utf8               AURA
   #34 = Fieldref           #1.#35        // ext/mods/gameserver/enums/skills/SkillTargetType.FRONT_AURA:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #35 = NameAndType        #36:#6        // FRONT_AURA:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #36 = Utf8               FRONT_AURA
   #37 = Fieldref           #1.#38        // ext/mods/gameserver/enums/skills/SkillTargetType.BEHIND_AURA:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #38 = NameAndType        #39:#6        // BEHIND_AURA:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #39 = Utf8               BEHIND_AURA
   #40 = Fieldref           #1.#41        // ext/mods/gameserver/enums/skills/SkillTargetType.CORPSE:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #41 = NameAndType        #42:#6        // CORPSE:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #42 = Utf8               CORPSE
   #43 = Fieldref           #1.#44        // ext/mods/gameserver/enums/skills/SkillTargetType.UNDEAD:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #44 = NameAndType        #45:#6        // UNDEAD:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #45 = Utf8               UNDEAD
   #46 = Fieldref           #1.#47        // ext/mods/gameserver/enums/skills/SkillTargetType.AURA_UNDEAD:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #47 = NameAndType        #48:#6        // AURA_UNDEAD:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #48 = Utf8               AURA_UNDEAD
   #49 = Fieldref           #1.#50        // ext/mods/gameserver/enums/skills/SkillTargetType.CORPSE_ALLY:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #50 = NameAndType        #51:#6        // CORPSE_ALLY:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #51 = Utf8               CORPSE_ALLY
   #52 = Fieldref           #1.#53        // ext/mods/gameserver/enums/skills/SkillTargetType.CORPSE_PLAYER:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #53 = NameAndType        #54:#6        // CORPSE_PLAYER:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #54 = Utf8               CORPSE_PLAYER
   #55 = Fieldref           #1.#56        // ext/mods/gameserver/enums/skills/SkillTargetType.CORPSE_PET:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #56 = NameAndType        #57:#6        // CORPSE_PET:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #57 = Utf8               CORPSE_PET
   #58 = Fieldref           #1.#59        // ext/mods/gameserver/enums/skills/SkillTargetType.AREA_CORPSE_MOB:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #59 = NameAndType        #60:#6        // AREA_CORPSE_MOB:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #60 = Utf8               AREA_CORPSE_MOB
   #61 = Fieldref           #1.#62        // ext/mods/gameserver/enums/skills/SkillTargetType.CORPSE_MOB:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #62 = NameAndType        #63:#6        // CORPSE_MOB:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #63 = Utf8               CORPSE_MOB
   #64 = Fieldref           #1.#65        // ext/mods/gameserver/enums/skills/SkillTargetType.UNLOCKABLE:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #65 = NameAndType        #66:#6        // UNLOCKABLE:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #66 = Utf8               UNLOCKABLE
   #67 = Fieldref           #1.#68        // ext/mods/gameserver/enums/skills/SkillTargetType.HOLY:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #68 = NameAndType        #69:#6        // HOLY:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #69 = Utf8               HOLY
   #70 = Fieldref           #1.#71        // ext/mods/gameserver/enums/skills/SkillTargetType.PARTY_MEMBER:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #71 = NameAndType        #72:#6        // PARTY_MEMBER:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #72 = Utf8               PARTY_MEMBER
   #73 = Fieldref           #1.#74        // ext/mods/gameserver/enums/skills/SkillTargetType.PARTY_OTHER:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #74 = NameAndType        #75:#6        // PARTY_OTHER:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #75 = Utf8               PARTY_OTHER
   #76 = Fieldref           #1.#77        // ext/mods/gameserver/enums/skills/SkillTargetType.SUMMON:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #77 = NameAndType        #78:#6        // SUMMON:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #78 = Utf8               SUMMON
   #79 = Fieldref           #1.#80        // ext/mods/gameserver/enums/skills/SkillTargetType.AREA_SUMMON:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #80 = NameAndType        #81:#6        // AREA_SUMMON:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #81 = Utf8               AREA_SUMMON
   #82 = Fieldref           #1.#83        // ext/mods/gameserver/enums/skills/SkillTargetType.ENEMY_SUMMON:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #83 = NameAndType        #84:#6        // ENEMY_SUMMON:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #84 = Utf8               ENEMY_SUMMON
   #85 = Fieldref           #1.#86        // ext/mods/gameserver/enums/skills/SkillTargetType.OWNER_PET:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #86 = NameAndType        #87:#6        // OWNER_PET:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #87 = Utf8               OWNER_PET
   #88 = Fieldref           #1.#89        // ext/mods/gameserver/enums/skills/SkillTargetType.GROUND:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #89 = NameAndType        #90:#6        // GROUND:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #90 = Utf8               GROUND
   #91 = Fieldref           #1.#92        // ext/mods/gameserver/enums/skills/SkillTargetType.$VALUES:[Lext/mods/gameserver/enums/skills/SkillTargetType;
   #92 = NameAndType        #93:#94       // $VALUES:[Lext/mods/gameserver/enums/skills/SkillTargetType;
   #93 = Utf8               $VALUES
   #94 = Utf8               [Lext/mods/gameserver/enums/skills/SkillTargetType;
   #95 = Methodref          #96.#97       // "[Lext/mods/gameserver/enums/skills/SkillTargetType;".clone:()Ljava/lang/Object;
   #96 = Class              #94           // "[Lext/mods/gameserver/enums/skills/SkillTargetType;"
   #97 = NameAndType        #98:#99       // clone:()Ljava/lang/Object;
   #98 = Utf8               clone
   #99 = Utf8               ()Ljava/lang/Object;
  #100 = Methodref          #101.#102     // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #101 = Class              #103          // java/lang/Enum
  #102 = NameAndType        #104:#105     // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #103 = Utf8               java/lang/Enum
  #104 = Utf8               valueOf
  #105 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #106 = Methodref          #101.#107     // java/lang/Enum."<init>":(Ljava/lang/String;I)V
  #107 = NameAndType        #108:#109     // "<init>":(Ljava/lang/String;I)V
  #108 = Utf8               <init>
  #109 = Utf8               (Ljava/lang/String;I)V
  #110 = String             #5            // NONE
  #111 = Methodref          #1.#107       // ext/mods/gameserver/enums/skills/SkillTargetType."<init>":(Ljava/lang/String;I)V
  #112 = String             #9            // SELF
  #113 = String             #12           // ONE
  #114 = String             #15           // PARTY
  #115 = String             #18           // ALLY
  #116 = String             #21           // CLAN
  #117 = String             #24           // AREA
  #118 = String             #27           // MONSTER_AREA
  #119 = String             #30           // FRONT_AREA
  #120 = String             #33           // AURA
  #121 = String             #36           // FRONT_AURA
  #122 = String             #39           // BEHIND_AURA
  #123 = String             #42           // CORPSE
  #124 = String             #45           // UNDEAD
  #125 = String             #48           // AURA_UNDEAD
  #126 = String             #51           // CORPSE_ALLY
  #127 = String             #54           // CORPSE_PLAYER
  #128 = String             #57           // CORPSE_PET
  #129 = String             #60           // AREA_CORPSE_MOB
  #130 = String             #63           // CORPSE_MOB
  #131 = String             #66           // UNLOCKABLE
  #132 = String             #69           // HOLY
  #133 = String             #72           // PARTY_MEMBER
  #134 = String             #75           // PARTY_OTHER
  #135 = String             #78           // SUMMON
  #136 = String             #81           // AREA_SUMMON
  #137 = String             #84           // ENEMY_SUMMON
  #138 = String             #87           // OWNER_PET
  #139 = String             #90           // GROUND
  #140 = Methodref          #1.#141       // ext/mods/gameserver/enums/skills/SkillTargetType.$values:()[Lext/mods/gameserver/enums/skills/SkillTargetType;
  #141 = NameAndType        #142:#143     // $values:()[Lext/mods/gameserver/enums/skills/SkillTargetType;
  #142 = Utf8               $values
  #143 = Utf8               ()[Lext/mods/gameserver/enums/skills/SkillTargetType;
  #144 = Utf8               values
  #145 = Utf8               Code
  #146 = Utf8               LineNumberTable
  #147 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/enums/skills/SkillTargetType;
  #148 = Utf8               LocalVariableTable
  #149 = Utf8               name
  #150 = Utf8               Ljava/lang/String;
  #151 = Utf8               MethodParameters
  #152 = Utf8               this
  #153 = Utf8               Signature
  #154 = Utf8               ()V
  #155 = Utf8               <clinit>
  #156 = Utf8               Ljava/lang/Enum<Lext/mods/gameserver/enums/skills/SkillTargetType;>;
  #157 = Utf8               SourceFile
  #158 = Utf8               SkillTargetType.java
{
  public static final ext.mods.gameserver.enums.skills.SkillTargetType NONE;
    descriptor: Lext/mods/gameserver/enums/skills/SkillTargetType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillTargetType SELF;
    descriptor: Lext/mods/gameserver/enums/skills/SkillTargetType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillTargetType ONE;
    descriptor: Lext/mods/gameserver/enums/skills/SkillTargetType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillTargetType PARTY;
    descriptor: Lext/mods/gameserver/enums/skills/SkillTargetType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillTargetType ALLY;
    descriptor: Lext/mods/gameserver/enums/skills/SkillTargetType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillTargetType CLAN;
    descriptor: Lext/mods/gameserver/enums/skills/SkillTargetType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillTargetType AREA;
    descriptor: Lext/mods/gameserver/enums/skills/SkillTargetType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillTargetType MONSTER_AREA;
    descriptor: Lext/mods/gameserver/enums/skills/SkillTargetType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillTargetType FRONT_AREA;
    descriptor: Lext/mods/gameserver/enums/skills/SkillTargetType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillTargetType AURA;
    descriptor: Lext/mods/gameserver/enums/skills/SkillTargetType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillTargetType FRONT_AURA;
    descriptor: Lext/mods/gameserver/enums/skills/SkillTargetType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillTargetType BEHIND_AURA;
    descriptor: Lext/mods/gameserver/enums/skills/SkillTargetType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillTargetType CORPSE;
    descriptor: Lext/mods/gameserver/enums/skills/SkillTargetType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillTargetType UNDEAD;
    descriptor: Lext/mods/gameserver/enums/skills/SkillTargetType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillTargetType AURA_UNDEAD;
    descriptor: Lext/mods/gameserver/enums/skills/SkillTargetType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillTargetType CORPSE_ALLY;
    descriptor: Lext/mods/gameserver/enums/skills/SkillTargetType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillTargetType CORPSE_PLAYER;
    descriptor: Lext/mods/gameserver/enums/skills/SkillTargetType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillTargetType CORPSE_PET;
    descriptor: Lext/mods/gameserver/enums/skills/SkillTargetType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillTargetType AREA_CORPSE_MOB;
    descriptor: Lext/mods/gameserver/enums/skills/SkillTargetType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillTargetType CORPSE_MOB;
    descriptor: Lext/mods/gameserver/enums/skills/SkillTargetType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillTargetType UNLOCKABLE;
    descriptor: Lext/mods/gameserver/enums/skills/SkillTargetType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillTargetType HOLY;
    descriptor: Lext/mods/gameserver/enums/skills/SkillTargetType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillTargetType PARTY_MEMBER;
    descriptor: Lext/mods/gameserver/enums/skills/SkillTargetType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillTargetType PARTY_OTHER;
    descriptor: Lext/mods/gameserver/enums/skills/SkillTargetType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillTargetType SUMMON;
    descriptor: Lext/mods/gameserver/enums/skills/SkillTargetType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillTargetType AREA_SUMMON;
    descriptor: Lext/mods/gameserver/enums/skills/SkillTargetType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillTargetType ENEMY_SUMMON;
    descriptor: Lext/mods/gameserver/enums/skills/SkillTargetType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillTargetType OWNER_PET;
    descriptor: Lext/mods/gameserver/enums/skills/SkillTargetType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillTargetType GROUND;
    descriptor: Lext/mods/gameserver/enums/skills/SkillTargetType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static ext.mods.gameserver.enums.skills.SkillTargetType[] values();
    descriptor: ()[Lext/mods/gameserver/enums/skills/SkillTargetType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #91                 // Field $VALUES:[Lext/mods/gameserver/enums/skills/SkillTargetType;
         3: invokevirtual #95                 // Method "[Lext/mods/gameserver/enums/skills/SkillTargetType;".clone:()Ljava/lang/Object;
         6: checkcast     #96                 // class "[Lext/mods/gameserver/enums/skills/SkillTargetType;"
         9: areturn
      LineNumberTable:
        line 20: 0

  public static ext.mods.gameserver.enums.skills.SkillTargetType valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/enums/skills/SkillTargetType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/gameserver/enums/skills/SkillTargetType
         2: aload_0
         3: invokestatic  #100                // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/gameserver/enums/skills/SkillTargetType
         9: areturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  name   Ljava/lang/String;
    MethodParameters:
      Name                           Flags
      <no name>                      mandated

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: new           #1                  // class ext/mods/gameserver/enums/skills/SkillTargetType
         3: dup
         4: ldc           #110                // String NONE
         6: iconst_0
         7: invokespecial #111                // Method "<init>":(Ljava/lang/String;I)V
        10: putstatic     #3                  // Field NONE:Lext/mods/gameserver/enums/skills/SkillTargetType;
        13: new           #1                  // class ext/mods/gameserver/enums/skills/SkillTargetType
        16: dup
        17: ldc           #112                // String SELF
        19: iconst_1
        20: invokespecial #111                // Method "<init>":(Ljava/lang/String;I)V
        23: putstatic     #7                  // Field SELF:Lext/mods/gameserver/enums/skills/SkillTargetType;
        26: new           #1                  // class ext/mods/gameserver/enums/skills/SkillTargetType
        29: dup
        30: ldc           #113                // String ONE
        32: iconst_2
        33: invokespecial #111                // Method "<init>":(Ljava/lang/String;I)V
        36: putstatic     #10                 // Field ONE:Lext/mods/gameserver/enums/skills/SkillTargetType;
        39: new           #1                  // class ext/mods/gameserver/enums/skills/SkillTargetType
        42: dup
        43: ldc           #114                // String PARTY
        45: iconst_3
        46: invokespecial #111                // Method "<init>":(Ljava/lang/String;I)V
        49: putstatic     #13                 // Field PARTY:Lext/mods/gameserver/enums/skills/SkillTargetType;
        52: new           #1                  // class ext/mods/gameserver/enums/skills/SkillTargetType
        55: dup
        56: ldc           #115                // String ALLY
        58: iconst_4
        59: invokespecial #111                // Method "<init>":(Ljava/lang/String;I)V
        62: putstatic     #16                 // Field ALLY:Lext/mods/gameserver/enums/skills/SkillTargetType;
        65: new           #1                  // class ext/mods/gameserver/enums/skills/SkillTargetType
        68: dup
        69: ldc           #116                // String CLAN
        71: iconst_5
        72: invokespecial #111                // Method "<init>":(Ljava/lang/String;I)V
        75: putstatic     #19                 // Field CLAN:Lext/mods/gameserver/enums/skills/SkillTargetType;
        78: new           #1                  // class ext/mods/gameserver/enums/skills/SkillTargetType
        81: dup
        82: ldc           #117                // String AREA
        84: bipush        6
        86: invokespecial #111                // Method "<init>":(Ljava/lang/String;I)V
        89: putstatic     #22                 // Field AREA:Lext/mods/gameserver/enums/skills/SkillTargetType;
        92: new           #1                  // class ext/mods/gameserver/enums/skills/SkillTargetType
        95: dup
        96: ldc           #118                // String MONSTER_AREA
        98: bipush        7
       100: invokespecial #111                // Method "<init>":(Ljava/lang/String;I)V
       103: putstatic     #25                 // Field MONSTER_AREA:Lext/mods/gameserver/enums/skills/SkillTargetType;
       106: new           #1                  // class ext/mods/gameserver/enums/skills/SkillTargetType
       109: dup
       110: ldc           #119                // String FRONT_AREA
       112: bipush        8
       114: invokespecial #111                // Method "<init>":(Ljava/lang/String;I)V
       117: putstatic     #28                 // Field FRONT_AREA:Lext/mods/gameserver/enums/skills/SkillTargetType;
       120: new           #1                  // class ext/mods/gameserver/enums/skills/SkillTargetType
       123: dup
       124: ldc           #120                // String AURA
       126: bipush        9
       128: invokespecial #111                // Method "<init>":(Ljava/lang/String;I)V
       131: putstatic     #31                 // Field AURA:Lext/mods/gameserver/enums/skills/SkillTargetType;
       134: new           #1                  // class ext/mods/gameserver/enums/skills/SkillTargetType
       137: dup
       138: ldc           #121                // String FRONT_AURA
       140: bipush        10
       142: invokespecial #111                // Method "<init>":(Ljava/lang/String;I)V
       145: putstatic     #34                 // Field FRONT_AURA:Lext/mods/gameserver/enums/skills/SkillTargetType;
       148: new           #1                  // class ext/mods/gameserver/enums/skills/SkillTargetType
       151: dup
       152: ldc           #122                // String BEHIND_AURA
       154: bipush        11
       156: invokespecial #111                // Method "<init>":(Ljava/lang/String;I)V
       159: putstatic     #37                 // Field BEHIND_AURA:Lext/mods/gameserver/enums/skills/SkillTargetType;
       162: new           #1                  // class ext/mods/gameserver/enums/skills/SkillTargetType
       165: dup
       166: ldc           #123                // String CORPSE
       168: bipush        12
       170: invokespecial #111                // Method "<init>":(Ljava/lang/String;I)V
       173: putstatic     #40                 // Field CORPSE:Lext/mods/gameserver/enums/skills/SkillTargetType;
       176: new           #1                  // class ext/mods/gameserver/enums/skills/SkillTargetType
       179: dup
       180: ldc           #124                // String UNDEAD
       182: bipush        13
       184: invokespecial #111                // Method "<init>":(Ljava/lang/String;I)V
       187: putstatic     #43                 // Field UNDEAD:Lext/mods/gameserver/enums/skills/SkillTargetType;
       190: new           #1                  // class ext/mods/gameserver/enums/skills/SkillTargetType
       193: dup
       194: ldc           #125                // String AURA_UNDEAD
       196: bipush        14
       198: invokespecial #111                // Method "<init>":(Ljava/lang/String;I)V
       201: putstatic     #46                 // Field AURA_UNDEAD:Lext/mods/gameserver/enums/skills/SkillTargetType;
       204: new           #1                  // class ext/mods/gameserver/enums/skills/SkillTargetType
       207: dup
       208: ldc           #126                // String CORPSE_ALLY
       210: bipush        15
       212: invokespecial #111                // Method "<init>":(Ljava/lang/String;I)V
       215: putstatic     #49                 // Field CORPSE_ALLY:Lext/mods/gameserver/enums/skills/SkillTargetType;
       218: new           #1                  // class ext/mods/gameserver/enums/skills/SkillTargetType
       221: dup
       222: ldc           #127                // String CORPSE_PLAYER
       224: bipush        16
       226: invokespecial #111                // Method "<init>":(Ljava/lang/String;I)V
       229: putstatic     #52                 // Field CORPSE_PLAYER:Lext/mods/gameserver/enums/skills/SkillTargetType;
       232: new           #1                  // class ext/mods/gameserver/enums/skills/SkillTargetType
       235: dup
       236: ldc           #128                // String CORPSE_PET
       238: bipush        17
       240: invokespecial #111                // Method "<init>":(Ljava/lang/String;I)V
       243: putstatic     #55                 // Field CORPSE_PET:Lext/mods/gameserver/enums/skills/SkillTargetType;
       246: new           #1                  // class ext/mods/gameserver/enums/skills/SkillTargetType
       249: dup
       250: ldc           #129                // String AREA_CORPSE_MOB
       252: bipush        18
       254: invokespecial #111                // Method "<init>":(Ljava/lang/String;I)V
       257: putstatic     #58                 // Field AREA_CORPSE_MOB:Lext/mods/gameserver/enums/skills/SkillTargetType;
       260: new           #1                  // class ext/mods/gameserver/enums/skills/SkillTargetType
       263: dup
       264: ldc           #130                // String CORPSE_MOB
       266: bipush        19
       268: invokespecial #111                // Method "<init>":(Ljava/lang/String;I)V
       271: putstatic     #61                 // Field CORPSE_MOB:Lext/mods/gameserver/enums/skills/SkillTargetType;
       274: new           #1                  // class ext/mods/gameserver/enums/skills/SkillTargetType
       277: dup
       278: ldc           #131                // String UNLOCKABLE
       280: bipush        20
       282: invokespecial #111                // Method "<init>":(Ljava/lang/String;I)V
       285: putstatic     #64                 // Field UNLOCKABLE:Lext/mods/gameserver/enums/skills/SkillTargetType;
       288: new           #1                  // class ext/mods/gameserver/enums/skills/SkillTargetType
       291: dup
       292: ldc           #132                // String HOLY
       294: bipush        21
       296: invokespecial #111                // Method "<init>":(Ljava/lang/String;I)V
       299: putstatic     #67                 // Field HOLY:Lext/mods/gameserver/enums/skills/SkillTargetType;
       302: new           #1                  // class ext/mods/gameserver/enums/skills/SkillTargetType
       305: dup
       306: ldc           #133                // String PARTY_MEMBER
       308: bipush        22
       310: invokespecial #111                // Method "<init>":(Ljava/lang/String;I)V
       313: putstatic     #70                 // Field PARTY_MEMBER:Lext/mods/gameserver/enums/skills/SkillTargetType;
       316: new           #1                  // class ext/mods/gameserver/enums/skills/SkillTargetType
       319: dup
       320: ldc           #134                // String PARTY_OTHER
       322: bipush        23
       324: invokespecial #111                // Method "<init>":(Ljava/lang/String;I)V
       327: putstatic     #73                 // Field PARTY_OTHER:Lext/mods/gameserver/enums/skills/SkillTargetType;
       330: new           #1                  // class ext/mods/gameserver/enums/skills/SkillTargetType
       333: dup
       334: ldc           #135                // String SUMMON
       336: bipush        24
       338: invokespecial #111                // Method "<init>":(Ljava/lang/String;I)V
       341: putstatic     #76                 // Field SUMMON:Lext/mods/gameserver/enums/skills/SkillTargetType;
       344: new           #1                  // class ext/mods/gameserver/enums/skills/SkillTargetType
       347: dup
       348: ldc           #136                // String AREA_SUMMON
       350: bipush        25
       352: invokespecial #111                // Method "<init>":(Ljava/lang/String;I)V
       355: putstatic     #79                 // Field AREA_SUMMON:Lext/mods/gameserver/enums/skills/SkillTargetType;
       358: new           #1                  // class ext/mods/gameserver/enums/skills/SkillTargetType
       361: dup
       362: ldc           #137                // String ENEMY_SUMMON
       364: bipush        26
       366: invokespecial #111                // Method "<init>":(Ljava/lang/String;I)V
       369: putstatic     #82                 // Field ENEMY_SUMMON:Lext/mods/gameserver/enums/skills/SkillTargetType;
       372: new           #1                  // class ext/mods/gameserver/enums/skills/SkillTargetType
       375: dup
       376: ldc           #138                // String OWNER_PET
       378: bipush        27
       380: invokespecial #111                // Method "<init>":(Ljava/lang/String;I)V
       383: putstatic     #85                 // Field OWNER_PET:Lext/mods/gameserver/enums/skills/SkillTargetType;
       386: new           #1                  // class ext/mods/gameserver/enums/skills/SkillTargetType
       389: dup
       390: ldc           #139                // String GROUND
       392: bipush        28
       394: invokespecial #111                // Method "<init>":(Ljava/lang/String;I)V
       397: putstatic     #88                 // Field GROUND:Lext/mods/gameserver/enums/skills/SkillTargetType;
       400: invokestatic  #140                // Method $values:()[Lext/mods/gameserver/enums/skills/SkillTargetType;
       403: putstatic     #91                 // Field $VALUES:[Lext/mods/gameserver/enums/skills/SkillTargetType;
       406: return
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
        line 40: 246
        line 41: 260
        line 42: 274
        line 43: 288
        line 44: 302
        line 45: 316
        line 46: 330
        line 47: 344
        line 48: 358
        line 49: 372
        line 50: 386
        line 20: 400
}
Signature: #156                         // Ljava/lang/Enum<Lext/mods/gameserver/enums/skills/SkillTargetType;>;
SourceFile: "SkillTargetType.java"
