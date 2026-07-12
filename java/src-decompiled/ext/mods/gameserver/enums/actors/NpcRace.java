// Bytecode for: ext.mods.gameserver.enums.actors.NpcRace
// File: ext\mods\gameserver\enums\actors\NpcRace.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/enums/actors/NpcRace.class
  Last modified 9 de jul de 2026; size 4021 bytes
  MD5 checksum ddab42a05cfa8e290ea4b2b1ba901c9a
  Compiled from "NpcRace.java"
public final class ext.mods.gameserver.enums.actors.NpcRace extends java.lang.Enum<ext.mods.gameserver.enums.actors.NpcRace>
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/gameserver/enums/actors/NpcRace
  super_class: #89                        // java/lang/Enum
  interfaces: 0, fields: 30, methods: 9, attributes: 2
Constant pool:
    #1 = Class              #2            // ext/mods/gameserver/enums/actors/NpcRace
    #2 = Utf8               ext/mods/gameserver/enums/actors/NpcRace
    #3 = Fieldref           #1.#4         // ext/mods/gameserver/enums/actors/NpcRace.DUMMY:Lext/mods/gameserver/enums/actors/NpcRace;
    #4 = NameAndType        #5:#6         // DUMMY:Lext/mods/gameserver/enums/actors/NpcRace;
    #5 = Utf8               DUMMY
    #6 = Utf8               Lext/mods/gameserver/enums/actors/NpcRace;
    #7 = Fieldref           #1.#8         // ext/mods/gameserver/enums/actors/NpcRace.UNDEAD:Lext/mods/gameserver/enums/actors/NpcRace;
    #8 = NameAndType        #9:#6         // UNDEAD:Lext/mods/gameserver/enums/actors/NpcRace;
    #9 = Utf8               UNDEAD
   #10 = Fieldref           #1.#11        // ext/mods/gameserver/enums/actors/NpcRace.MAGIC_CREATURE:Lext/mods/gameserver/enums/actors/NpcRace;
   #11 = NameAndType        #12:#6        // MAGIC_CREATURE:Lext/mods/gameserver/enums/actors/NpcRace;
   #12 = Utf8               MAGIC_CREATURE
   #13 = Fieldref           #1.#14        // ext/mods/gameserver/enums/actors/NpcRace.BEAST:Lext/mods/gameserver/enums/actors/NpcRace;
   #14 = NameAndType        #15:#6        // BEAST:Lext/mods/gameserver/enums/actors/NpcRace;
   #15 = Utf8               BEAST
   #16 = Fieldref           #1.#17        // ext/mods/gameserver/enums/actors/NpcRace.ANIMAL:Lext/mods/gameserver/enums/actors/NpcRace;
   #17 = NameAndType        #18:#6        // ANIMAL:Lext/mods/gameserver/enums/actors/NpcRace;
   #18 = Utf8               ANIMAL
   #19 = Fieldref           #1.#20        // ext/mods/gameserver/enums/actors/NpcRace.PLANT:Lext/mods/gameserver/enums/actors/NpcRace;
   #20 = NameAndType        #21:#6        // PLANT:Lext/mods/gameserver/enums/actors/NpcRace;
   #21 = Utf8               PLANT
   #22 = Fieldref           #1.#23        // ext/mods/gameserver/enums/actors/NpcRace.HUMANOID:Lext/mods/gameserver/enums/actors/NpcRace;
   #23 = NameAndType        #24:#6        // HUMANOID:Lext/mods/gameserver/enums/actors/NpcRace;
   #24 = Utf8               HUMANOID
   #25 = Fieldref           #1.#26        // ext/mods/gameserver/enums/actors/NpcRace.SPIRIT:Lext/mods/gameserver/enums/actors/NpcRace;
   #26 = NameAndType        #27:#6        // SPIRIT:Lext/mods/gameserver/enums/actors/NpcRace;
   #27 = Utf8               SPIRIT
   #28 = Fieldref           #1.#29        // ext/mods/gameserver/enums/actors/NpcRace.ANGEL:Lext/mods/gameserver/enums/actors/NpcRace;
   #29 = NameAndType        #30:#6        // ANGEL:Lext/mods/gameserver/enums/actors/NpcRace;
   #30 = Utf8               ANGEL
   #31 = Fieldref           #1.#32        // ext/mods/gameserver/enums/actors/NpcRace.DEMON:Lext/mods/gameserver/enums/actors/NpcRace;
   #32 = NameAndType        #33:#6        // DEMON:Lext/mods/gameserver/enums/actors/NpcRace;
   #33 = Utf8               DEMON
   #34 = Fieldref           #1.#35        // ext/mods/gameserver/enums/actors/NpcRace.DRAGON:Lext/mods/gameserver/enums/actors/NpcRace;
   #35 = NameAndType        #36:#6        // DRAGON:Lext/mods/gameserver/enums/actors/NpcRace;
   #36 = Utf8               DRAGON
   #37 = Fieldref           #1.#38        // ext/mods/gameserver/enums/actors/NpcRace.GIANT:Lext/mods/gameserver/enums/actors/NpcRace;
   #38 = NameAndType        #39:#6        // GIANT:Lext/mods/gameserver/enums/actors/NpcRace;
   #39 = Utf8               GIANT
   #40 = Fieldref           #1.#41        // ext/mods/gameserver/enums/actors/NpcRace.BUG:Lext/mods/gameserver/enums/actors/NpcRace;
   #41 = NameAndType        #42:#6        // BUG:Lext/mods/gameserver/enums/actors/NpcRace;
   #42 = Utf8               BUG
   #43 = Fieldref           #1.#44        // ext/mods/gameserver/enums/actors/NpcRace.FAIRIE:Lext/mods/gameserver/enums/actors/NpcRace;
   #44 = NameAndType        #45:#6        // FAIRIE:Lext/mods/gameserver/enums/actors/NpcRace;
   #45 = Utf8               FAIRIE
   #46 = Fieldref           #1.#47        // ext/mods/gameserver/enums/actors/NpcRace.HUMAN:Lext/mods/gameserver/enums/actors/NpcRace;
   #47 = NameAndType        #48:#6        // HUMAN:Lext/mods/gameserver/enums/actors/NpcRace;
   #48 = Utf8               HUMAN
   #49 = Fieldref           #1.#50        // ext/mods/gameserver/enums/actors/NpcRace.ELVE:Lext/mods/gameserver/enums/actors/NpcRace;
   #50 = NameAndType        #51:#6        // ELVE:Lext/mods/gameserver/enums/actors/NpcRace;
   #51 = Utf8               ELVE
   #52 = Fieldref           #1.#53        // ext/mods/gameserver/enums/actors/NpcRace.DARKELVE:Lext/mods/gameserver/enums/actors/NpcRace;
   #53 = NameAndType        #54:#6        // DARKELVE:Lext/mods/gameserver/enums/actors/NpcRace;
   #54 = Utf8               DARKELVE
   #55 = Fieldref           #1.#56        // ext/mods/gameserver/enums/actors/NpcRace.ORC:Lext/mods/gameserver/enums/actors/NpcRace;
   #56 = NameAndType        #57:#6        // ORC:Lext/mods/gameserver/enums/actors/NpcRace;
   #57 = Utf8               ORC
   #58 = Fieldref           #1.#59        // ext/mods/gameserver/enums/actors/NpcRace.DWARVE:Lext/mods/gameserver/enums/actors/NpcRace;
   #59 = NameAndType        #60:#6        // DWARVE:Lext/mods/gameserver/enums/actors/NpcRace;
   #60 = Utf8               DWARVE
   #61 = Fieldref           #1.#62        // ext/mods/gameserver/enums/actors/NpcRace.OTHER:Lext/mods/gameserver/enums/actors/NpcRace;
   #62 = NameAndType        #63:#6        // OTHER:Lext/mods/gameserver/enums/actors/NpcRace;
   #63 = Utf8               OTHER
   #64 = Fieldref           #1.#65        // ext/mods/gameserver/enums/actors/NpcRace.NON_LIVING_BEING:Lext/mods/gameserver/enums/actors/NpcRace;
   #65 = NameAndType        #66:#6        // NON_LIVING_BEING:Lext/mods/gameserver/enums/actors/NpcRace;
   #66 = Utf8               NON_LIVING_BEING
   #67 = Fieldref           #1.#68        // ext/mods/gameserver/enums/actors/NpcRace.SIEGE_WEAPON:Lext/mods/gameserver/enums/actors/NpcRace;
   #68 = NameAndType        #69:#6        // SIEGE_WEAPON:Lext/mods/gameserver/enums/actors/NpcRace;
   #69 = Utf8               SIEGE_WEAPON
   #70 = Fieldref           #1.#71        // ext/mods/gameserver/enums/actors/NpcRace.DEFENDING_ARMY:Lext/mods/gameserver/enums/actors/NpcRace;
   #71 = NameAndType        #72:#6        // DEFENDING_ARMY:Lext/mods/gameserver/enums/actors/NpcRace;
   #72 = Utf8               DEFENDING_ARMY
   #73 = Fieldref           #1.#74        // ext/mods/gameserver/enums/actors/NpcRace.MERCENARIE:Lext/mods/gameserver/enums/actors/NpcRace;
   #74 = NameAndType        #75:#6        // MERCENARIE:Lext/mods/gameserver/enums/actors/NpcRace;
   #75 = Utf8               MERCENARIE
   #76 = Fieldref           #1.#77        // ext/mods/gameserver/enums/actors/NpcRace.UNKNOWN_CREATURE:Lext/mods/gameserver/enums/actors/NpcRace;
   #77 = NameAndType        #78:#6        // UNKNOWN_CREATURE:Lext/mods/gameserver/enums/actors/NpcRace;
   #78 = Utf8               UNKNOWN_CREATURE
   #79 = Fieldref           #1.#80        // ext/mods/gameserver/enums/actors/NpcRace.$VALUES:[Lext/mods/gameserver/enums/actors/NpcRace;
   #80 = NameAndType        #81:#82       // $VALUES:[Lext/mods/gameserver/enums/actors/NpcRace;
   #81 = Utf8               $VALUES
   #82 = Utf8               [Lext/mods/gameserver/enums/actors/NpcRace;
   #83 = Methodref          #84.#85       // "[Lext/mods/gameserver/enums/actors/NpcRace;".clone:()Ljava/lang/Object;
   #84 = Class              #82           // "[Lext/mods/gameserver/enums/actors/NpcRace;"
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
   #98 = Fieldref           #1.#99        // ext/mods/gameserver/enums/actors/NpcRace._atkStat:Lext/mods/gameserver/enums/skills/Stats;
   #99 = NameAndType        #100:#101     // _atkStat:Lext/mods/gameserver/enums/skills/Stats;
  #100 = Utf8               _atkStat
  #101 = Utf8               Lext/mods/gameserver/enums/skills/Stats;
  #102 = Fieldref           #1.#103       // ext/mods/gameserver/enums/actors/NpcRace._resStat:Lext/mods/gameserver/enums/skills/Stats;
  #103 = NameAndType        #104:#101     // _resStat:Lext/mods/gameserver/enums/skills/Stats;
  #104 = Utf8               _resStat
  #105 = Fieldref           #1.#106       // ext/mods/gameserver/enums/actors/NpcRace._secondarySkillId:I
  #106 = NameAndType        #107:#108     // _secondarySkillId:I
  #107 = Utf8               _secondarySkillId
  #108 = Utf8               I
  #109 = Fieldref           #1.#110       // ext/mods/gameserver/enums/actors/NpcRace.VALUES:[Lext/mods/gameserver/enums/actors/NpcRace;
  #110 = NameAndType        #111:#82      // VALUES:[Lext/mods/gameserver/enums/actors/NpcRace;
  #111 = Utf8               VALUES
  #112 = Methodref          #1.#113       // ext/mods/gameserver/enums/actors/NpcRace.getSecondarySkillId:()I
  #113 = NameAndType        #114:#115     // getSecondarySkillId:()I
  #114 = Utf8               getSecondarySkillId
  #115 = Utf8               ()I
  #116 = String             #5            // DUMMY
  #117 = Methodref          #1.#118       // ext/mods/gameserver/enums/actors/NpcRace."<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/skills/Stats;Lext/mods/gameserver/enums/skills/Stats;I)V
  #118 = NameAndType        #96:#119      // "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/skills/Stats;Lext/mods/gameserver/enums/skills/Stats;I)V
  #119 = Utf8               (Ljava/lang/String;ILext/mods/gameserver/enums/skills/Stats;Lext/mods/gameserver/enums/skills/Stats;I)V
  #120 = String             #9            // UNDEAD
  #121 = String             #12           // MAGIC_CREATURE
  #122 = Fieldref           #123.#124     // ext/mods/gameserver/enums/skills/Stats.PATK_MCREATURES:Lext/mods/gameserver/enums/skills/Stats;
  #123 = Class              #125          // ext/mods/gameserver/enums/skills/Stats
  #124 = NameAndType        #126:#101     // PATK_MCREATURES:Lext/mods/gameserver/enums/skills/Stats;
  #125 = Utf8               ext/mods/gameserver/enums/skills/Stats
  #126 = Utf8               PATK_MCREATURES
  #127 = Fieldref           #123.#128     // ext/mods/gameserver/enums/skills/Stats.PDEF_MCREATURES:Lext/mods/gameserver/enums/skills/Stats;
  #128 = NameAndType        #129:#101     // PDEF_MCREATURES:Lext/mods/gameserver/enums/skills/Stats;
  #129 = Utf8               PDEF_MCREATURES
  #130 = String             #15           // BEAST
  #131 = Fieldref           #123.#132     // ext/mods/gameserver/enums/skills/Stats.PATK_BEASTS:Lext/mods/gameserver/enums/skills/Stats;
  #132 = NameAndType        #133:#101     // PATK_BEASTS:Lext/mods/gameserver/enums/skills/Stats;
  #133 = Utf8               PATK_BEASTS
  #134 = Fieldref           #123.#135     // ext/mods/gameserver/enums/skills/Stats.PDEF_BEASTS:Lext/mods/gameserver/enums/skills/Stats;
  #135 = NameAndType        #136:#101     // PDEF_BEASTS:Lext/mods/gameserver/enums/skills/Stats;
  #136 = Utf8               PDEF_BEASTS
  #137 = String             #18           // ANIMAL
  #138 = Fieldref           #123.#139     // ext/mods/gameserver/enums/skills/Stats.PATK_ANIMALS:Lext/mods/gameserver/enums/skills/Stats;
  #139 = NameAndType        #140:#101     // PATK_ANIMALS:Lext/mods/gameserver/enums/skills/Stats;
  #140 = Utf8               PATK_ANIMALS
  #141 = Fieldref           #123.#142     // ext/mods/gameserver/enums/skills/Stats.PDEF_ANIMALS:Lext/mods/gameserver/enums/skills/Stats;
  #142 = NameAndType        #143:#101     // PDEF_ANIMALS:Lext/mods/gameserver/enums/skills/Stats;
  #143 = Utf8               PDEF_ANIMALS
  #144 = String             #21           // PLANT
  #145 = Fieldref           #123.#146     // ext/mods/gameserver/enums/skills/Stats.PATK_PLANTS:Lext/mods/gameserver/enums/skills/Stats;
  #146 = NameAndType        #147:#101     // PATK_PLANTS:Lext/mods/gameserver/enums/skills/Stats;
  #147 = Utf8               PATK_PLANTS
  #148 = Fieldref           #123.#149     // ext/mods/gameserver/enums/skills/Stats.PDEF_PLANTS:Lext/mods/gameserver/enums/skills/Stats;
  #149 = NameAndType        #150:#101     // PDEF_PLANTS:Lext/mods/gameserver/enums/skills/Stats;
  #150 = Utf8               PDEF_PLANTS
  #151 = String             #24           // HUMANOID
  #152 = String             #27           // SPIRIT
  #153 = String             #30           // ANGEL
  #154 = String             #33           // DEMON
  #155 = String             #36           // DRAGON
  #156 = Fieldref           #123.#157     // ext/mods/gameserver/enums/skills/Stats.PATK_DRAGONS:Lext/mods/gameserver/enums/skills/Stats;
  #157 = NameAndType        #158:#101     // PATK_DRAGONS:Lext/mods/gameserver/enums/skills/Stats;
  #158 = Utf8               PATK_DRAGONS
  #159 = Fieldref           #123.#160     // ext/mods/gameserver/enums/skills/Stats.PDEF_DRAGONS:Lext/mods/gameserver/enums/skills/Stats;
  #160 = NameAndType        #161:#101     // PDEF_DRAGONS:Lext/mods/gameserver/enums/skills/Stats;
  #161 = Utf8               PDEF_DRAGONS
  #162 = String             #39           // GIANT
  #163 = Fieldref           #123.#164     // ext/mods/gameserver/enums/skills/Stats.PATK_GIANTS:Lext/mods/gameserver/enums/skills/Stats;
  #164 = NameAndType        #165:#101     // PATK_GIANTS:Lext/mods/gameserver/enums/skills/Stats;
  #165 = Utf8               PATK_GIANTS
  #166 = Fieldref           #123.#167     // ext/mods/gameserver/enums/skills/Stats.PDEF_GIANTS:Lext/mods/gameserver/enums/skills/Stats;
  #167 = NameAndType        #168:#101     // PDEF_GIANTS:Lext/mods/gameserver/enums/skills/Stats;
  #168 = Utf8               PDEF_GIANTS
  #169 = String             #42           // BUG
  #170 = Fieldref           #123.#171     // ext/mods/gameserver/enums/skills/Stats.PATK_INSECTS:Lext/mods/gameserver/enums/skills/Stats;
  #171 = NameAndType        #172:#101     // PATK_INSECTS:Lext/mods/gameserver/enums/skills/Stats;
  #172 = Utf8               PATK_INSECTS
  #173 = Fieldref           #123.#174     // ext/mods/gameserver/enums/skills/Stats.PDEF_INSECTS:Lext/mods/gameserver/enums/skills/Stats;
  #174 = NameAndType        #175:#101     // PDEF_INSECTS:Lext/mods/gameserver/enums/skills/Stats;
  #175 = Utf8               PDEF_INSECTS
  #176 = String             #45           // FAIRIE
  #177 = String             #48           // HUMAN
  #178 = String             #51           // ELVE
  #179 = String             #54           // DARKELVE
  #180 = String             #57           // ORC
  #181 = String             #60           // DWARVE
  #182 = String             #63           // OTHER
  #183 = String             #66           // NON_LIVING_BEING
  #184 = String             #69           // SIEGE_WEAPON
  #185 = String             #72           // DEFENDING_ARMY
  #186 = String             #75           // MERCENARIE
  #187 = String             #78           // UNKNOWN_CREATURE
  #188 = Methodref          #1.#189       // ext/mods/gameserver/enums/actors/NpcRace.$values:()[Lext/mods/gameserver/enums/actors/NpcRace;
  #189 = NameAndType        #190:#191     // $values:()[Lext/mods/gameserver/enums/actors/NpcRace;
  #190 = Utf8               $values
  #191 = Utf8               ()[Lext/mods/gameserver/enums/actors/NpcRace;
  #192 = Methodref          #1.#193       // ext/mods/gameserver/enums/actors/NpcRace.values:()[Lext/mods/gameserver/enums/actors/NpcRace;
  #193 = NameAndType        #194:#191     // values:()[Lext/mods/gameserver/enums/actors/NpcRace;
  #194 = Utf8               values
  #195 = Utf8               Code
  #196 = Utf8               LineNumberTable
  #197 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/enums/actors/NpcRace;
  #198 = Utf8               LocalVariableTable
  #199 = Utf8               name
  #200 = Utf8               Ljava/lang/String;
  #201 = Utf8               MethodParameters
  #202 = Utf8               this
  #203 = Utf8               atkStat
  #204 = Utf8               resStat
  #205 = Utf8               secondarySkillId
  #206 = Utf8               Signature
  #207 = Utf8               (Lext/mods/gameserver/enums/skills/Stats;Lext/mods/gameserver/enums/skills/Stats;I)V
  #208 = Utf8               getAtkStat
  #209 = Utf8               ()Lext/mods/gameserver/enums/skills/Stats;
  #210 = Utf8               getResStat
  #211 = Utf8               retrieveBySecondarySkillId
  #212 = Utf8               (I)Lext/mods/gameserver/enums/actors/NpcRace;
  #213 = Utf8               nr
  #214 = Utf8               skillId
  #215 = Utf8               StackMapTable
  #216 = Utf8               <clinit>
  #217 = Utf8               ()V
  #218 = Utf8               Ljava/lang/Enum<Lext/mods/gameserver/enums/actors/NpcRace;>;
  #219 = Utf8               SourceFile
  #220 = Utf8               NpcRace.java
{
  public static final ext.mods.gameserver.enums.actors.NpcRace DUMMY;
    descriptor: Lext/mods/gameserver/enums/actors/NpcRace;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcRace UNDEAD;
    descriptor: Lext/mods/gameserver/enums/actors/NpcRace;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcRace MAGIC_CREATURE;
    descriptor: Lext/mods/gameserver/enums/actors/NpcRace;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcRace BEAST;
    descriptor: Lext/mods/gameserver/enums/actors/NpcRace;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcRace ANIMAL;
    descriptor: Lext/mods/gameserver/enums/actors/NpcRace;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcRace PLANT;
    descriptor: Lext/mods/gameserver/enums/actors/NpcRace;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcRace HUMANOID;
    descriptor: Lext/mods/gameserver/enums/actors/NpcRace;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcRace SPIRIT;
    descriptor: Lext/mods/gameserver/enums/actors/NpcRace;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcRace ANGEL;
    descriptor: Lext/mods/gameserver/enums/actors/NpcRace;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcRace DEMON;
    descriptor: Lext/mods/gameserver/enums/actors/NpcRace;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcRace DRAGON;
    descriptor: Lext/mods/gameserver/enums/actors/NpcRace;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcRace GIANT;
    descriptor: Lext/mods/gameserver/enums/actors/NpcRace;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcRace BUG;
    descriptor: Lext/mods/gameserver/enums/actors/NpcRace;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcRace FAIRIE;
    descriptor: Lext/mods/gameserver/enums/actors/NpcRace;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcRace HUMAN;
    descriptor: Lext/mods/gameserver/enums/actors/NpcRace;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcRace ELVE;
    descriptor: Lext/mods/gameserver/enums/actors/NpcRace;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcRace DARKELVE;
    descriptor: Lext/mods/gameserver/enums/actors/NpcRace;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcRace ORC;
    descriptor: Lext/mods/gameserver/enums/actors/NpcRace;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcRace DWARVE;
    descriptor: Lext/mods/gameserver/enums/actors/NpcRace;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcRace OTHER;
    descriptor: Lext/mods/gameserver/enums/actors/NpcRace;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcRace NON_LIVING_BEING;
    descriptor: Lext/mods/gameserver/enums/actors/NpcRace;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcRace SIEGE_WEAPON;
    descriptor: Lext/mods/gameserver/enums/actors/NpcRace;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcRace DEFENDING_ARMY;
    descriptor: Lext/mods/gameserver/enums/actors/NpcRace;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcRace MERCENARIE;
    descriptor: Lext/mods/gameserver/enums/actors/NpcRace;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcRace UNKNOWN_CREATURE;
    descriptor: Lext/mods/gameserver/enums/actors/NpcRace;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcRace[] VALUES;
    descriptor: [Lext/mods/gameserver/enums/actors/NpcRace;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL

  public static ext.mods.gameserver.enums.actors.NpcRace[] values();
    descriptor: ()[Lext/mods/gameserver/enums/actors/NpcRace;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #79                 // Field $VALUES:[Lext/mods/gameserver/enums/actors/NpcRace;
         3: invokevirtual #83                 // Method "[Lext/mods/gameserver/enums/actors/NpcRace;".clone:()Ljava/lang/Object;
         6: checkcast     #84                 // class "[Lext/mods/gameserver/enums/actors/NpcRace;"
         9: areturn
      LineNumberTable:
        line 22: 0

  public static ext.mods.gameserver.enums.actors.NpcRace valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/enums/actors/NpcRace;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/gameserver/enums/actors/NpcRace
         2: aload_0
         3: invokestatic  #88                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/gameserver/enums/actors/NpcRace
         9: areturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  name   Ljava/lang/String;
    MethodParameters:
      Name                           Flags
      <no name>                      mandated

  public ext.mods.gameserver.enums.skills.Stats getAtkStat();
    descriptor: ()Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #98                 // Field _atkStat:Lext/mods/gameserver/enums/skills/Stats;
         4: areturn
      LineNumberTable:
        line 65: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/enums/actors/NpcRace;

  public ext.mods.gameserver.enums.skills.Stats getResStat();
    descriptor: ()Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #102                // Field _resStat:Lext/mods/gameserver/enums/skills/Stats;
         4: areturn
      LineNumberTable:
        line 70: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/enums/actors/NpcRace;

  public int getSecondarySkillId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #105                // Field _secondarySkillId:I
         4: ireturn
      LineNumberTable:
        line 75: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/enums/actors/NpcRace;

  public static ext.mods.gameserver.enums.actors.NpcRace retrieveBySecondarySkillId(int);
    descriptor: (I)Lext/mods/gameserver/enums/actors/NpcRace;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=5, args_size=1
         0: getstatic     #109                // Field VALUES:[Lext/mods/gameserver/enums/actors/NpcRace;
         3: astore_1
         4: aload_1
         5: arraylength
         6: istore_2
         7: iconst_0
         8: istore_3
         9: iload_3
        10: iload_2
        11: if_icmpge     37
        14: aload_1
        15: iload_3
        16: aaload
        17: astore        4
        19: aload         4
        21: invokevirtual #112                // Method getSecondarySkillId:()I
        24: iload_0
        25: if_icmpne     31
        28: aload         4
        30: areturn
        31: iinc          3, 1
        34: goto          9
        37: getstatic     #3                  // Field DUMMY:Lext/mods/gameserver/enums/actors/NpcRace;
        40: areturn
      LineNumberTable:
        line 80: 0
        line 82: 19
        line 83: 28
        line 80: 31
        line 85: 37
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           19      12     4    nr   Lext/mods/gameserver/enums/actors/NpcRace;
            0      41     0 skillId   I
      StackMapTable: number_of_entries = 3
        frame_type = 254 /* append */
          offset_delta = 9
          locals = [ class "[Lext/mods/gameserver/enums/actors/NpcRace;", int, int ]
        frame_type = 21 /* same */
        frame_type = 248 /* chop */
          offset_delta = 5

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=7, locals=0, args_size=0
         0: new           #1                  // class ext/mods/gameserver/enums/actors/NpcRace
         3: dup
         4: ldc           #116                // String DUMMY
         6: iconst_0
         7: aconst_null
         8: aconst_null
         9: iconst_m1
        10: invokespecial #117                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/skills/Stats;Lext/mods/gameserver/enums/skills/Stats;I)V
        13: putstatic     #3                  // Field DUMMY:Lext/mods/gameserver/enums/actors/NpcRace;
        16: new           #1                  // class ext/mods/gameserver/enums/actors/NpcRace
        19: dup
        20: ldc           #120                // String UNDEAD
        22: iconst_1
        23: aconst_null
        24: aconst_null
        25: sipush        4290
        28: invokespecial #117                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/skills/Stats;Lext/mods/gameserver/enums/skills/Stats;I)V
        31: putstatic     #7                  // Field UNDEAD:Lext/mods/gameserver/enums/actors/NpcRace;
        34: new           #1                  // class ext/mods/gameserver/enums/actors/NpcRace
        37: dup
        38: ldc           #121                // String MAGIC_CREATURE
        40: iconst_2
        41: getstatic     #122                // Field ext/mods/gameserver/enums/skills/Stats.PATK_MCREATURES:Lext/mods/gameserver/enums/skills/Stats;
        44: getstatic     #127                // Field ext/mods/gameserver/enums/skills/Stats.PDEF_MCREATURES:Lext/mods/gameserver/enums/skills/Stats;
        47: sipush        4291
        50: invokespecial #117                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/skills/Stats;Lext/mods/gameserver/enums/skills/Stats;I)V
        53: putstatic     #10                 // Field MAGIC_CREATURE:Lext/mods/gameserver/enums/actors/NpcRace;
        56: new           #1                  // class ext/mods/gameserver/enums/actors/NpcRace
        59: dup
        60: ldc           #130                // String BEAST
        62: iconst_3
        63: getstatic     #131                // Field ext/mods/gameserver/enums/skills/Stats.PATK_BEASTS:Lext/mods/gameserver/enums/skills/Stats;
        66: getstatic     #134                // Field ext/mods/gameserver/enums/skills/Stats.PDEF_BEASTS:Lext/mods/gameserver/enums/skills/Stats;
        69: sipush        4292
        72: invokespecial #117                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/skills/Stats;Lext/mods/gameserver/enums/skills/Stats;I)V
        75: putstatic     #13                 // Field BEAST:Lext/mods/gameserver/enums/actors/NpcRace;
        78: new           #1                  // class ext/mods/gameserver/enums/actors/NpcRace
        81: dup
        82: ldc           #137                // String ANIMAL
        84: iconst_4
        85: getstatic     #138                // Field ext/mods/gameserver/enums/skills/Stats.PATK_ANIMALS:Lext/mods/gameserver/enums/skills/Stats;
        88: getstatic     #141                // Field ext/mods/gameserver/enums/skills/Stats.PDEF_ANIMALS:Lext/mods/gameserver/enums/skills/Stats;
        91: sipush        4293
        94: invokespecial #117                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/skills/Stats;Lext/mods/gameserver/enums/skills/Stats;I)V
        97: putstatic     #16                 // Field ANIMAL:Lext/mods/gameserver/enums/actors/NpcRace;
       100: new           #1                  // class ext/mods/gameserver/enums/actors/NpcRace
       103: dup
       104: ldc           #144                // String PLANT
       106: iconst_5
       107: getstatic     #145                // Field ext/mods/gameserver/enums/skills/Stats.PATK_PLANTS:Lext/mods/gameserver/enums/skills/Stats;
       110: getstatic     #148                // Field ext/mods/gameserver/enums/skills/Stats.PDEF_PLANTS:Lext/mods/gameserver/enums/skills/Stats;
       113: sipush        4294
       116: invokespecial #117                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/skills/Stats;Lext/mods/gameserver/enums/skills/Stats;I)V
       119: putstatic     #19                 // Field PLANT:Lext/mods/gameserver/enums/actors/NpcRace;
       122: new           #1                  // class ext/mods/gameserver/enums/actors/NpcRace
       125: dup
       126: ldc           #151                // String HUMANOID
       128: bipush        6
       130: aconst_null
       131: aconst_null
       132: sipush        4295
       135: invokespecial #117                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/skills/Stats;Lext/mods/gameserver/enums/skills/Stats;I)V
       138: putstatic     #22                 // Field HUMANOID:Lext/mods/gameserver/enums/actors/NpcRace;
       141: new           #1                  // class ext/mods/gameserver/enums/actors/NpcRace
       144: dup
       145: ldc           #152                // String SPIRIT
       147: bipush        7
       149: aconst_null
       150: aconst_null
       151: sipush        4296
       154: invokespecial #117                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/skills/Stats;Lext/mods/gameserver/enums/skills/Stats;I)V
       157: putstatic     #25                 // Field SPIRIT:Lext/mods/gameserver/enums/actors/NpcRace;
       160: new           #1                  // class ext/mods/gameserver/enums/actors/NpcRace
       163: dup
       164: ldc           #153                // String ANGEL
       166: bipush        8
       168: aconst_null
       169: aconst_null
       170: sipush        4297
       173: invokespecial #117                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/skills/Stats;Lext/mods/gameserver/enums/skills/Stats;I)V
       176: putstatic     #28                 // Field ANGEL:Lext/mods/gameserver/enums/actors/NpcRace;
       179: new           #1                  // class ext/mods/gameserver/enums/actors/NpcRace
       182: dup
       183: ldc           #154                // String DEMON
       185: bipush        9
       187: aconst_null
       188: aconst_null
       189: sipush        4298
       192: invokespecial #117                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/skills/Stats;Lext/mods/gameserver/enums/skills/Stats;I)V
       195: putstatic     #31                 // Field DEMON:Lext/mods/gameserver/enums/actors/NpcRace;
       198: new           #1                  // class ext/mods/gameserver/enums/actors/NpcRace
       201: dup
       202: ldc           #155                // String DRAGON
       204: bipush        10
       206: getstatic     #156                // Field ext/mods/gameserver/enums/skills/Stats.PATK_DRAGONS:Lext/mods/gameserver/enums/skills/Stats;
       209: getstatic     #159                // Field ext/mods/gameserver/enums/skills/Stats.PDEF_DRAGONS:Lext/mods/gameserver/enums/skills/Stats;
       212: sipush        4299
       215: invokespecial #117                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/skills/Stats;Lext/mods/gameserver/enums/skills/Stats;I)V
       218: putstatic     #34                 // Field DRAGON:Lext/mods/gameserver/enums/actors/NpcRace;
       221: new           #1                  // class ext/mods/gameserver/enums/actors/NpcRace
       224: dup
       225: ldc           #162                // String GIANT
       227: bipush        11
       229: getstatic     #163                // Field ext/mods/gameserver/enums/skills/Stats.PATK_GIANTS:Lext/mods/gameserver/enums/skills/Stats;
       232: getstatic     #166                // Field ext/mods/gameserver/enums/skills/Stats.PDEF_GIANTS:Lext/mods/gameserver/enums/skills/Stats;
       235: sipush        4300
       238: invokespecial #117                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/skills/Stats;Lext/mods/gameserver/enums/skills/Stats;I)V
       241: putstatic     #37                 // Field GIANT:Lext/mods/gameserver/enums/actors/NpcRace;
       244: new           #1                  // class ext/mods/gameserver/enums/actors/NpcRace
       247: dup
       248: ldc           #169                // String BUG
       250: bipush        12
       252: getstatic     #170                // Field ext/mods/gameserver/enums/skills/Stats.PATK_INSECTS:Lext/mods/gameserver/enums/skills/Stats;
       255: getstatic     #173                // Field ext/mods/gameserver/enums/skills/Stats.PDEF_INSECTS:Lext/mods/gameserver/enums/skills/Stats;
       258: sipush        4301
       261: invokespecial #117                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/skills/Stats;Lext/mods/gameserver/enums/skills/Stats;I)V
       264: putstatic     #40                 // Field BUG:Lext/mods/gameserver/enums/actors/NpcRace;
       267: new           #1                  // class ext/mods/gameserver/enums/actors/NpcRace
       270: dup
       271: ldc           #176                // String FAIRIE
       273: bipush        13
       275: aconst_null
       276: aconst_null
       277: sipush        4302
       280: invokespecial #117                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/skills/Stats;Lext/mods/gameserver/enums/skills/Stats;I)V
       283: putstatic     #43                 // Field FAIRIE:Lext/mods/gameserver/enums/actors/NpcRace;
       286: new           #1                  // class ext/mods/gameserver/enums/actors/NpcRace
       289: dup
       290: ldc           #177                // String HUMAN
       292: bipush        14
       294: aconst_null
       295: aconst_null
       296: iconst_m1
       297: invokespecial #117                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/skills/Stats;Lext/mods/gameserver/enums/skills/Stats;I)V
       300: putstatic     #46                 // Field HUMAN:Lext/mods/gameserver/enums/actors/NpcRace;
       303: new           #1                  // class ext/mods/gameserver/enums/actors/NpcRace
       306: dup
       307: ldc           #178                // String ELVE
       309: bipush        15
       311: aconst_null
       312: aconst_null
       313: iconst_m1
       314: invokespecial #117                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/skills/Stats;Lext/mods/gameserver/enums/skills/Stats;I)V
       317: putstatic     #49                 // Field ELVE:Lext/mods/gameserver/enums/actors/NpcRace;
       320: new           #1                  // class ext/mods/gameserver/enums/actors/NpcRace
       323: dup
       324: ldc           #179                // String DARKELVE
       326: bipush        16
       328: aconst_null
       329: aconst_null
       330: iconst_m1
       331: invokespecial #117                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/skills/Stats;Lext/mods/gameserver/enums/skills/Stats;I)V
       334: putstatic     #52                 // Field DARKELVE:Lext/mods/gameserver/enums/actors/NpcRace;
       337: new           #1                  // class ext/mods/gameserver/enums/actors/NpcRace
       340: dup
       341: ldc           #180                // String ORC
       343: bipush        17
       345: aconst_null
       346: aconst_null
       347: iconst_m1
       348: invokespecial #117                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/skills/Stats;Lext/mods/gameserver/enums/skills/Stats;I)V
       351: putstatic     #55                 // Field ORC:Lext/mods/gameserver/enums/actors/NpcRace;
       354: new           #1                  // class ext/mods/gameserver/enums/actors/NpcRace
       357: dup
       358: ldc           #181                // String DWARVE
       360: bipush        18
       362: aconst_null
       363: aconst_null
       364: iconst_m1
       365: invokespecial #117                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/skills/Stats;Lext/mods/gameserver/enums/skills/Stats;I)V
       368: putstatic     #58                 // Field DWARVE:Lext/mods/gameserver/enums/actors/NpcRace;
       371: new           #1                  // class ext/mods/gameserver/enums/actors/NpcRace
       374: dup
       375: ldc           #182                // String OTHER
       377: bipush        19
       379: aconst_null
       380: aconst_null
       381: iconst_m1
       382: invokespecial #117                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/skills/Stats;Lext/mods/gameserver/enums/skills/Stats;I)V
       385: putstatic     #61                 // Field OTHER:Lext/mods/gameserver/enums/actors/NpcRace;
       388: new           #1                  // class ext/mods/gameserver/enums/actors/NpcRace
       391: dup
       392: ldc           #183                // String NON_LIVING_BEING
       394: bipush        20
       396: aconst_null
       397: aconst_null
       398: iconst_m1
       399: invokespecial #117                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/skills/Stats;Lext/mods/gameserver/enums/skills/Stats;I)V
       402: putstatic     #64                 // Field NON_LIVING_BEING:Lext/mods/gameserver/enums/actors/NpcRace;
       405: new           #1                  // class ext/mods/gameserver/enums/actors/NpcRace
       408: dup
       409: ldc           #184                // String SIEGE_WEAPON
       411: bipush        21
       413: aconst_null
       414: aconst_null
       415: iconst_m1
       416: invokespecial #117                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/skills/Stats;Lext/mods/gameserver/enums/skills/Stats;I)V
       419: putstatic     #67                 // Field SIEGE_WEAPON:Lext/mods/gameserver/enums/actors/NpcRace;
       422: new           #1                  // class ext/mods/gameserver/enums/actors/NpcRace
       425: dup
       426: ldc           #185                // String DEFENDING_ARMY
       428: bipush        22
       430: aconst_null
       431: aconst_null
       432: iconst_m1
       433: invokespecial #117                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/skills/Stats;Lext/mods/gameserver/enums/skills/Stats;I)V
       436: putstatic     #70                 // Field DEFENDING_ARMY:Lext/mods/gameserver/enums/actors/NpcRace;
       439: new           #1                  // class ext/mods/gameserver/enums/actors/NpcRace
       442: dup
       443: ldc           #186                // String MERCENARIE
       445: bipush        23
       447: aconst_null
       448: aconst_null
       449: iconst_m1
       450: invokespecial #117                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/skills/Stats;Lext/mods/gameserver/enums/skills/Stats;I)V
       453: putstatic     #73                 // Field MERCENARIE:Lext/mods/gameserver/enums/actors/NpcRace;
       456: new           #1                  // class ext/mods/gameserver/enums/actors/NpcRace
       459: dup
       460: ldc           #187                // String UNKNOWN_CREATURE
       462: bipush        24
       464: aconst_null
       465: aconst_null
       466: iconst_m1
       467: invokespecial #117                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/skills/Stats;Lext/mods/gameserver/enums/skills/Stats;I)V
       470: putstatic     #76                 // Field UNKNOWN_CREATURE:Lext/mods/gameserver/enums/actors/NpcRace;
       473: invokestatic  #188                // Method $values:()[Lext/mods/gameserver/enums/actors/NpcRace;
       476: putstatic     #79                 // Field $VALUES:[Lext/mods/gameserver/enums/actors/NpcRace;
       479: invokestatic  #192                // Method values:()[Lext/mods/gameserver/enums/actors/NpcRace;
       482: putstatic     #109                // Field VALUES:[Lext/mods/gameserver/enums/actors/NpcRace;
       485: return
      LineNumberTable:
        line 24: 0
        line 25: 16
        line 26: 34
        line 27: 56
        line 28: 78
        line 29: 100
        line 30: 122
        line 31: 141
        line 32: 160
        line 33: 179
        line 34: 198
        line 35: 221
        line 36: 244
        line 37: 267
        line 38: 286
        line 39: 303
        line 40: 320
        line 41: 337
        line 42: 354
        line 43: 371
        line 44: 388
        line 45: 405
        line 46: 422
        line 47: 439
        line 48: 456
        line 22: 473
        line 50: 479
}
Signature: #218                         // Ljava/lang/Enum<Lext/mods/gameserver/enums/actors/NpcRace;>;
SourceFile: "NpcRace.java"
