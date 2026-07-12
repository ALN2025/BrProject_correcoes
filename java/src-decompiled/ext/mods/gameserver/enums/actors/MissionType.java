// Bytecode for: ext.mods.gameserver.enums.actors.MissionType
// File: ext\mods\gameserver\enums\actors\MissionType.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/enums/actors/MissionType.class
  Last modified 9 de jul de 2026; size 3929 bytes
  MD5 checksum d6d75ea78cf6116cf8f981881c9023a1
  Compiled from "MissionType.java"
public final class ext.mods.gameserver.enums.actors.MissionType extends java.lang.Enum<ext.mods.gameserver.enums.actors.MissionType>
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/gameserver/enums/actors/MissionType
  super_class: #161                       // java/lang/Enum
  interfaces: 0, fields: 50, methods: 5, attributes: 2
Constant pool:
    #1 = Class              #2            // ext/mods/gameserver/enums/actors/MissionType
    #2 = Utf8               ext/mods/gameserver/enums/actors/MissionType
    #3 = Fieldref           #1.#4         // ext/mods/gameserver/enums/actors/MissionType.PVP:Lext/mods/gameserver/enums/actors/MissionType;
    #4 = NameAndType        #5:#6         // PVP:Lext/mods/gameserver/enums/actors/MissionType;
    #5 = Utf8               PVP
    #6 = Utf8               Lext/mods/gameserver/enums/actors/MissionType;
    #7 = Fieldref           #1.#8         // ext/mods/gameserver/enums/actors/MissionType.PK:Lext/mods/gameserver/enums/actors/MissionType;
    #8 = NameAndType        #9:#6         // PK:Lext/mods/gameserver/enums/actors/MissionType;
    #9 = Utf8               PK
   #10 = Fieldref           #1.#11        // ext/mods/gameserver/enums/actors/MissionType.DEATHS:Lext/mods/gameserver/enums/actors/MissionType;
   #11 = NameAndType        #12:#6        // DEATHS:Lext/mods/gameserver/enums/actors/MissionType;
   #12 = Utf8               DEATHS
   #13 = Fieldref           #1.#14        // ext/mods/gameserver/enums/actors/MissionType.GUARD:Lext/mods/gameserver/enums/actors/MissionType;
   #14 = NameAndType        #15:#6        // GUARD:Lext/mods/gameserver/enums/actors/MissionType;
   #15 = Utf8               GUARD
   #16 = Fieldref           #1.#17        // ext/mods/gameserver/enums/actors/MissionType.DUAL_WON:Lext/mods/gameserver/enums/actors/MissionType;
   #17 = NameAndType        #18:#6        // DUAL_WON:Lext/mods/gameserver/enums/actors/MissionType;
   #18 = Utf8               DUAL_WON
   #19 = Fieldref           #1.#20        // ext/mods/gameserver/enums/actors/MissionType.SUBCLASS:Lext/mods/gameserver/enums/actors/MissionType;
   #20 = NameAndType        #21:#6        // SUBCLASS:Lext/mods/gameserver/enums/actors/MissionType;
   #21 = Utf8               SUBCLASS
   #22 = Fieldref           #1.#23        // ext/mods/gameserver/enums/actors/MissionType.LEADER:Lext/mods/gameserver/enums/actors/MissionType;
   #23 = NameAndType        #24:#6        // LEADER:Lext/mods/gameserver/enums/actors/MissionType;
   #24 = Utf8               LEADER
   #25 = Fieldref           #1.#26        // ext/mods/gameserver/enums/actors/MissionType.ACADEMY:Lext/mods/gameserver/enums/actors/MissionType;
   #26 = NameAndType        #27:#6        // ACADEMY:Lext/mods/gameserver/enums/actors/MissionType;
   #27 = Utf8               ACADEMY
   #28 = Fieldref           #1.#29        // ext/mods/gameserver/enums/actors/MissionType.CLAN_LEVEL_UP:Lext/mods/gameserver/enums/actors/MissionType;
   #29 = NameAndType        #30:#6        // CLAN_LEVEL_UP:Lext/mods/gameserver/enums/actors/MissionType;
   #30 = Utf8               CLAN_LEVEL_UP
   #31 = Fieldref           #1.#32        // ext/mods/gameserver/enums/actors/MissionType.CASTLE:Lext/mods/gameserver/enums/actors/MissionType;
   #32 = NameAndType        #33:#6        // CASTLE:Lext/mods/gameserver/enums/actors/MissionType;
   #33 = Utf8               CASTLE
   #34 = Fieldref           #1.#35        // ext/mods/gameserver/enums/actors/MissionType.NOBLE:Lext/mods/gameserver/enums/actors/MissionType;
   #35 = NameAndType        #36:#6        // NOBLE:Lext/mods/gameserver/enums/actors/MissionType;
   #36 = Utf8               NOBLE
   #37 = Fieldref           #1.#38        // ext/mods/gameserver/enums/actors/MissionType.HEROIC:Lext/mods/gameserver/enums/actors/MissionType;
   #38 = NameAndType        #39:#6        // HEROIC:Lext/mods/gameserver/enums/actors/MissionType;
   #39 = Utf8               HEROIC
   #40 = Fieldref           #1.#41        // ext/mods/gameserver/enums/actors/MissionType.MARRIED:Lext/mods/gameserver/enums/actors/MissionType;
   #41 = NameAndType        #42:#6        // MARRIED:Lext/mods/gameserver/enums/actors/MissionType;
   #42 = Utf8               MARRIED
   #43 = Fieldref           #1.#44        // ext/mods/gameserver/enums/actors/MissionType.MONSTER:Lext/mods/gameserver/enums/actors/MissionType;
   #44 = NameAndType        #45:#6        // MONSTER:Lext/mods/gameserver/enums/actors/MissionType;
   #45 = Utf8               MONSTER
   #46 = Fieldref           #1.#47        // ext/mods/gameserver/enums/actors/MissionType.RAIDBOSS:Lext/mods/gameserver/enums/actors/MissionType;
   #47 = NameAndType        #48:#6        // RAIDBOSS:Lext/mods/gameserver/enums/actors/MissionType;
   #48 = Utf8               RAIDBOSS
   #49 = Fieldref           #1.#50        // ext/mods/gameserver/enums/actors/MissionType.GRANDBOSS:Lext/mods/gameserver/enums/actors/MissionType;
   #50 = NameAndType        #51:#6        // GRANDBOSS:Lext/mods/gameserver/enums/actors/MissionType;
   #51 = Utf8               GRANDBOSS
   #52 = Fieldref           #1.#53        // ext/mods/gameserver/enums/actors/MissionType.QUEEN_ANT:Lext/mods/gameserver/enums/actors/MissionType;
   #53 = NameAndType        #54:#6        // QUEEN_ANT:Lext/mods/gameserver/enums/actors/MissionType;
   #54 = Utf8               QUEEN_ANT
   #55 = Fieldref           #1.#56        // ext/mods/gameserver/enums/actors/MissionType.CORE:Lext/mods/gameserver/enums/actors/MissionType;
   #56 = NameAndType        #57:#6        // CORE:Lext/mods/gameserver/enums/actors/MissionType;
   #57 = Utf8               CORE
   #58 = Fieldref           #1.#59        // ext/mods/gameserver/enums/actors/MissionType.ORFEN:Lext/mods/gameserver/enums/actors/MissionType;
   #59 = NameAndType        #60:#6        // ORFEN:Lext/mods/gameserver/enums/actors/MissionType;
   #60 = Utf8               ORFEN
   #61 = Fieldref           #1.#62        // ext/mods/gameserver/enums/actors/MissionType.ZAKEN:Lext/mods/gameserver/enums/actors/MissionType;
   #62 = NameAndType        #63:#6        // ZAKEN:Lext/mods/gameserver/enums/actors/MissionType;
   #63 = Utf8               ZAKEN
   #64 = Fieldref           #1.#65        // ext/mods/gameserver/enums/actors/MissionType.BAIUM:Lext/mods/gameserver/enums/actors/MissionType;
   #65 = NameAndType        #66:#6        // BAIUM:Lext/mods/gameserver/enums/actors/MissionType;
   #66 = Utf8               BAIUM
   #67 = Fieldref           #1.#68        // ext/mods/gameserver/enums/actors/MissionType.ANTHARAS:Lext/mods/gameserver/enums/actors/MissionType;
   #68 = NameAndType        #69:#6        // ANTHARAS:Lext/mods/gameserver/enums/actors/MissionType;
   #69 = Utf8               ANTHARAS
   #70 = Fieldref           #1.#71        // ext/mods/gameserver/enums/actors/MissionType.VALAKAS:Lext/mods/gameserver/enums/actors/MissionType;
   #71 = NameAndType        #72:#6        // VALAKAS:Lext/mods/gameserver/enums/actors/MissionType;
   #72 = Utf8               VALAKAS
   #73 = Fieldref           #1.#74        // ext/mods/gameserver/enums/actors/MissionType.HALISHA:Lext/mods/gameserver/enums/actors/MissionType;
   #74 = NameAndType        #75:#6        // HALISHA:Lext/mods/gameserver/enums/actors/MissionType;
   #75 = Utf8               HALISHA
   #76 = Fieldref           #1.#77        // ext/mods/gameserver/enums/actors/MissionType.ENCHANT_SKILL:Lext/mods/gameserver/enums/actors/MissionType;
   #77 = NameAndType        #78:#6        // ENCHANT_SKILL:Lext/mods/gameserver/enums/actors/MissionType;
   #78 = Utf8               ENCHANT_SKILL
   #79 = Fieldref           #1.#80        // ext/mods/gameserver/enums/actors/MissionType.ENCHANT_WEAPON:Lext/mods/gameserver/enums/actors/MissionType;
   #80 = NameAndType        #81:#6        // ENCHANT_WEAPON:Lext/mods/gameserver/enums/actors/MissionType;
   #81 = Utf8               ENCHANT_WEAPON
   #82 = Fieldref           #1.#83        // ext/mods/gameserver/enums/actors/MissionType.ENCHANT_OTHER:Lext/mods/gameserver/enums/actors/MissionType;
   #83 = NameAndType        #84:#6        // ENCHANT_OTHER:Lext/mods/gameserver/enums/actors/MissionType;
   #84 = Utf8               ENCHANT_OTHER
   #85 = Fieldref           #1.#86        // ext/mods/gameserver/enums/actors/MissionType.ENCHANT_SUCCESS:Lext/mods/gameserver/enums/actors/MissionType;
   #86 = NameAndType        #87:#6        // ENCHANT_SUCCESS:Lext/mods/gameserver/enums/actors/MissionType;
   #87 = Utf8               ENCHANT_SUCCESS
   #88 = Fieldref           #1.#89        // ext/mods/gameserver/enums/actors/MissionType.ENCHANT_FAILED:Lext/mods/gameserver/enums/actors/MissionType;
   #89 = NameAndType        #90:#6        // ENCHANT_FAILED:Lext/mods/gameserver/enums/actors/MissionType;
   #90 = Utf8               ENCHANT_FAILED
   #91 = Fieldref           #1.#92        // ext/mods/gameserver/enums/actors/MissionType.CURSED_WEAPON:Lext/mods/gameserver/enums/actors/MissionType;
   #92 = NameAndType        #93:#6        // CURSED_WEAPON:Lext/mods/gameserver/enums/actors/MissionType;
   #93 = Utf8               CURSED_WEAPON
   #94 = Fieldref           #1.#95        // ext/mods/gameserver/enums/actors/MissionType.AUGMENT:Lext/mods/gameserver/enums/actors/MissionType;
   #95 = NameAndType        #96:#6        // AUGMENT:Lext/mods/gameserver/enums/actors/MissionType;
   #96 = Utf8               AUGMENT
   #97 = Fieldref           #1.#98        // ext/mods/gameserver/enums/actors/MissionType.KARMA:Lext/mods/gameserver/enums/actors/MissionType;
   #98 = NameAndType        #99:#6        // KARMA:Lext/mods/gameserver/enums/actors/MissionType;
   #99 = Utf8               KARMA
  #100 = Fieldref           #1.#101       // ext/mods/gameserver/enums/actors/MissionType.OLYMPIAD_FIGHT:Lext/mods/gameserver/enums/actors/MissionType;
  #101 = NameAndType        #102:#6       // OLYMPIAD_FIGHT:Lext/mods/gameserver/enums/actors/MissionType;
  #102 = Utf8               OLYMPIAD_FIGHT
  #103 = Fieldref           #1.#104       // ext/mods/gameserver/enums/actors/MissionType.OLYMPIAD_FIGHT_WON:Lext/mods/gameserver/enums/actors/MissionType;
  #104 = NameAndType        #105:#6       // OLYMPIAD_FIGHT_WON:Lext/mods/gameserver/enums/actors/MissionType;
  #105 = Utf8               OLYMPIAD_FIGHT_WON
  #106 = Fieldref           #1.#107       // ext/mods/gameserver/enums/actors/MissionType.OLYMPIAD_FIGHT_LOST:Lext/mods/gameserver/enums/actors/MissionType;
  #107 = NameAndType        #108:#6       // OLYMPIAD_FIGHT_LOST:Lext/mods/gameserver/enums/actors/MissionType;
  #108 = Utf8               OLYMPIAD_FIGHT_LOST
  #109 = Fieldref           #1.#110       // ext/mods/gameserver/enums/actors/MissionType.SPOIL:Lext/mods/gameserver/enums/actors/MissionType;
  #110 = NameAndType        #111:#6       // SPOIL:Lext/mods/gameserver/enums/actors/MissionType;
  #111 = Utf8               SPOIL
  #112 = Fieldref           #1.#113       // ext/mods/gameserver/enums/actors/MissionType.FISHING:Lext/mods/gameserver/enums/actors/MissionType;
  #113 = NameAndType        #114:#6       // FISHING:Lext/mods/gameserver/enums/actors/MissionType;
  #114 = Utf8               FISHING
  #115 = Fieldref           #1.#116       // ext/mods/gameserver/enums/actors/MissionType.RECIPE_LEARN:Lext/mods/gameserver/enums/actors/MissionType;
  #116 = NameAndType        #117:#6       // RECIPE_LEARN:Lext/mods/gameserver/enums/actors/MissionType;
  #117 = Utf8               RECIPE_LEARN
  #118 = Fieldref           #1.#119       // ext/mods/gameserver/enums/actors/MissionType.CRAFT_SUCCESS:Lext/mods/gameserver/enums/actors/MissionType;
  #119 = NameAndType        #120:#6       // CRAFT_SUCCESS:Lext/mods/gameserver/enums/actors/MissionType;
  #120 = Utf8               CRAFT_SUCCESS
  #121 = Fieldref           #1.#122       // ext/mods/gameserver/enums/actors/MissionType.CRAFT_FAIL:Lext/mods/gameserver/enums/actors/MissionType;
  #122 = NameAndType        #123:#6       // CRAFT_FAIL:Lext/mods/gameserver/enums/actors/MissionType;
  #123 = Utf8               CRAFT_FAIL
  #124 = Fieldref           #1.#125       // ext/mods/gameserver/enums/actors/MissionType.TYRANNOSAURUS:Lext/mods/gameserver/enums/actors/MissionType;
  #125 = NameAndType        #126:#6       // TYRANNOSAURUS:Lext/mods/gameserver/enums/actors/MissionType;
  #126 = Utf8               TYRANNOSAURUS
  #127 = Fieldref           #1.#128       // ext/mods/gameserver/enums/actors/MissionType.SPAWN_CHRISTMAS_TREE:Lext/mods/gameserver/enums/actors/MissionType;
  #128 = NameAndType        #129:#6       // SPAWN_CHRISTMAS_TREE:Lext/mods/gameserver/enums/actors/MissionType;
  #129 = Utf8               SPAWN_CHRISTMAS_TREE
  #130 = Fieldref           #1.#131       // ext/mods/gameserver/enums/actors/MissionType.RESSURECT:Lext/mods/gameserver/enums/actors/MissionType;
  #131 = NameAndType        #132:#6       // RESSURECT:Lext/mods/gameserver/enums/actors/MissionType;
  #132 = Utf8               RESSURECT
  #133 = Fieldref           #1.#134       // ext/mods/gameserver/enums/actors/MissionType.RESSURECTED:Lext/mods/gameserver/enums/actors/MissionType;
  #134 = NameAndType        #135:#6       // RESSURECTED:Lext/mods/gameserver/enums/actors/MissionType;
  #135 = Utf8               RESSURECTED
  #136 = Fieldref           #1.#137       // ext/mods/gameserver/enums/actors/MissionType.RECOMMEND:Lext/mods/gameserver/enums/actors/MissionType;
  #137 = NameAndType        #138:#6       // RECOMMEND:Lext/mods/gameserver/enums/actors/MissionType;
  #138 = Utf8               RECOMMEND
  #139 = Fieldref           #1.#140       // ext/mods/gameserver/enums/actors/MissionType.RECOMMENDED:Lext/mods/gameserver/enums/actors/MissionType;
  #140 = NameAndType        #141:#6       // RECOMMENDED:Lext/mods/gameserver/enums/actors/MissionType;
  #141 = Utf8               RECOMMENDED
  #142 = Fieldref           #1.#143       // ext/mods/gameserver/enums/actors/MissionType.LOTTERY_WIN:Lext/mods/gameserver/enums/actors/MissionType;
  #143 = NameAndType        #144:#6       // LOTTERY_WIN:Lext/mods/gameserver/enums/actors/MissionType;
  #144 = Utf8               LOTTERY_WIN
  #145 = Fieldref           #1.#146       // ext/mods/gameserver/enums/actors/MissionType.ENTER_RIFT:Lext/mods/gameserver/enums/actors/MissionType;
  #146 = NameAndType        #147:#6       // ENTER_RIFT:Lext/mods/gameserver/enums/actors/MissionType;
  #147 = Utf8               ENTER_RIFT
  #148 = Fieldref           #1.#149       // ext/mods/gameserver/enums/actors/MissionType.QUEST_COMPLETE:Lext/mods/gameserver/enums/actors/MissionType;
  #149 = NameAndType        #150:#6       // QUEST_COMPLETE:Lext/mods/gameserver/enums/actors/MissionType;
  #150 = Utf8               QUEST_COMPLETE
  #151 = Fieldref           #1.#152       // ext/mods/gameserver/enums/actors/MissionType.$VALUES:[Lext/mods/gameserver/enums/actors/MissionType;
  #152 = NameAndType        #153:#154     // $VALUES:[Lext/mods/gameserver/enums/actors/MissionType;
  #153 = Utf8               $VALUES
  #154 = Utf8               [Lext/mods/gameserver/enums/actors/MissionType;
  #155 = Methodref          #156.#157     // "[Lext/mods/gameserver/enums/actors/MissionType;".clone:()Ljava/lang/Object;
  #156 = Class              #154          // "[Lext/mods/gameserver/enums/actors/MissionType;"
  #157 = NameAndType        #158:#159     // clone:()Ljava/lang/Object;
  #158 = Utf8               clone
  #159 = Utf8               ()Ljava/lang/Object;
  #160 = Methodref          #161.#162     // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #161 = Class              #163          // java/lang/Enum
  #162 = NameAndType        #164:#165     // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #163 = Utf8               java/lang/Enum
  #164 = Utf8               valueOf
  #165 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #166 = Methodref          #161.#167     // java/lang/Enum."<init>":(Ljava/lang/String;I)V
  #167 = NameAndType        #168:#169     // "<init>":(Ljava/lang/String;I)V
  #168 = Utf8               <init>
  #169 = Utf8               (Ljava/lang/String;I)V
  #170 = String             #5            // PVP
  #171 = Methodref          #1.#167       // ext/mods/gameserver/enums/actors/MissionType."<init>":(Ljava/lang/String;I)V
  #172 = String             #9            // PK
  #173 = String             #12           // DEATHS
  #174 = String             #15           // GUARD
  #175 = String             #18           // DUAL_WON
  #176 = String             #21           // SUBCLASS
  #177 = String             #24           // LEADER
  #178 = String             #27           // ACADEMY
  #179 = String             #30           // CLAN_LEVEL_UP
  #180 = String             #33           // CASTLE
  #181 = String             #36           // NOBLE
  #182 = String             #39           // HEROIC
  #183 = String             #42           // MARRIED
  #184 = String             #45           // MONSTER
  #185 = String             #48           // RAIDBOSS
  #186 = String             #51           // GRANDBOSS
  #187 = String             #54           // QUEEN_ANT
  #188 = String             #57           // CORE
  #189 = String             #60           // ORFEN
  #190 = String             #63           // ZAKEN
  #191 = String             #66           // BAIUM
  #192 = String             #69           // ANTHARAS
  #193 = String             #72           // VALAKAS
  #194 = String             #75           // HALISHA
  #195 = String             #78           // ENCHANT_SKILL
  #196 = String             #81           // ENCHANT_WEAPON
  #197 = String             #84           // ENCHANT_OTHER
  #198 = String             #87           // ENCHANT_SUCCESS
  #199 = String             #90           // ENCHANT_FAILED
  #200 = String             #93           // CURSED_WEAPON
  #201 = String             #96           // AUGMENT
  #202 = String             #99           // KARMA
  #203 = String             #102          // OLYMPIAD_FIGHT
  #204 = String             #105          // OLYMPIAD_FIGHT_WON
  #205 = String             #108          // OLYMPIAD_FIGHT_LOST
  #206 = String             #111          // SPOIL
  #207 = String             #114          // FISHING
  #208 = String             #117          // RECIPE_LEARN
  #209 = String             #120          // CRAFT_SUCCESS
  #210 = String             #123          // CRAFT_FAIL
  #211 = String             #126          // TYRANNOSAURUS
  #212 = String             #129          // SPAWN_CHRISTMAS_TREE
  #213 = String             #132          // RESSURECT
  #214 = String             #135          // RESSURECTED
  #215 = String             #138          // RECOMMEND
  #216 = String             #141          // RECOMMENDED
  #217 = String             #144          // LOTTERY_WIN
  #218 = String             #147          // ENTER_RIFT
  #219 = String             #150          // QUEST_COMPLETE
  #220 = Methodref          #1.#221       // ext/mods/gameserver/enums/actors/MissionType.$values:()[Lext/mods/gameserver/enums/actors/MissionType;
  #221 = NameAndType        #222:#223     // $values:()[Lext/mods/gameserver/enums/actors/MissionType;
  #222 = Utf8               $values
  #223 = Utf8               ()[Lext/mods/gameserver/enums/actors/MissionType;
  #224 = Utf8               values
  #225 = Utf8               Code
  #226 = Utf8               LineNumberTable
  #227 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/enums/actors/MissionType;
  #228 = Utf8               LocalVariableTable
  #229 = Utf8               name
  #230 = Utf8               Ljava/lang/String;
  #231 = Utf8               MethodParameters
  #232 = Utf8               this
  #233 = Utf8               Signature
  #234 = Utf8               ()V
  #235 = Utf8               <clinit>
  #236 = Utf8               Ljava/lang/Enum<Lext/mods/gameserver/enums/actors/MissionType;>;
  #237 = Utf8               SourceFile
  #238 = Utf8               MissionType.java
{
  public static final ext.mods.gameserver.enums.actors.MissionType PVP;
    descriptor: Lext/mods/gameserver/enums/actors/MissionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.MissionType PK;
    descriptor: Lext/mods/gameserver/enums/actors/MissionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.MissionType DEATHS;
    descriptor: Lext/mods/gameserver/enums/actors/MissionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.MissionType GUARD;
    descriptor: Lext/mods/gameserver/enums/actors/MissionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.MissionType DUAL_WON;
    descriptor: Lext/mods/gameserver/enums/actors/MissionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.MissionType SUBCLASS;
    descriptor: Lext/mods/gameserver/enums/actors/MissionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.MissionType LEADER;
    descriptor: Lext/mods/gameserver/enums/actors/MissionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.MissionType ACADEMY;
    descriptor: Lext/mods/gameserver/enums/actors/MissionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.MissionType CLAN_LEVEL_UP;
    descriptor: Lext/mods/gameserver/enums/actors/MissionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.MissionType CASTLE;
    descriptor: Lext/mods/gameserver/enums/actors/MissionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.MissionType NOBLE;
    descriptor: Lext/mods/gameserver/enums/actors/MissionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.MissionType HEROIC;
    descriptor: Lext/mods/gameserver/enums/actors/MissionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.MissionType MARRIED;
    descriptor: Lext/mods/gameserver/enums/actors/MissionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.MissionType MONSTER;
    descriptor: Lext/mods/gameserver/enums/actors/MissionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.MissionType RAIDBOSS;
    descriptor: Lext/mods/gameserver/enums/actors/MissionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.MissionType GRANDBOSS;
    descriptor: Lext/mods/gameserver/enums/actors/MissionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.MissionType QUEEN_ANT;
    descriptor: Lext/mods/gameserver/enums/actors/MissionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.MissionType CORE;
    descriptor: Lext/mods/gameserver/enums/actors/MissionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.MissionType ORFEN;
    descriptor: Lext/mods/gameserver/enums/actors/MissionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.MissionType ZAKEN;
    descriptor: Lext/mods/gameserver/enums/actors/MissionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.MissionType BAIUM;
    descriptor: Lext/mods/gameserver/enums/actors/MissionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.MissionType ANTHARAS;
    descriptor: Lext/mods/gameserver/enums/actors/MissionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.MissionType VALAKAS;
    descriptor: Lext/mods/gameserver/enums/actors/MissionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.MissionType HALISHA;
    descriptor: Lext/mods/gameserver/enums/actors/MissionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.MissionType ENCHANT_SKILL;
    descriptor: Lext/mods/gameserver/enums/actors/MissionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.MissionType ENCHANT_WEAPON;
    descriptor: Lext/mods/gameserver/enums/actors/MissionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.MissionType ENCHANT_OTHER;
    descriptor: Lext/mods/gameserver/enums/actors/MissionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.MissionType ENCHANT_SUCCESS;
    descriptor: Lext/mods/gameserver/enums/actors/MissionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.MissionType ENCHANT_FAILED;
    descriptor: Lext/mods/gameserver/enums/actors/MissionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.MissionType CURSED_WEAPON;
    descriptor: Lext/mods/gameserver/enums/actors/MissionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.MissionType AUGMENT;
    descriptor: Lext/mods/gameserver/enums/actors/MissionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.MissionType KARMA;
    descriptor: Lext/mods/gameserver/enums/actors/MissionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.MissionType OLYMPIAD_FIGHT;
    descriptor: Lext/mods/gameserver/enums/actors/MissionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.MissionType OLYMPIAD_FIGHT_WON;
    descriptor: Lext/mods/gameserver/enums/actors/MissionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.MissionType OLYMPIAD_FIGHT_LOST;
    descriptor: Lext/mods/gameserver/enums/actors/MissionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.MissionType SPOIL;
    descriptor: Lext/mods/gameserver/enums/actors/MissionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.MissionType FISHING;
    descriptor: Lext/mods/gameserver/enums/actors/MissionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.MissionType RECIPE_LEARN;
    descriptor: Lext/mods/gameserver/enums/actors/MissionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.MissionType CRAFT_SUCCESS;
    descriptor: Lext/mods/gameserver/enums/actors/MissionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.MissionType CRAFT_FAIL;
    descriptor: Lext/mods/gameserver/enums/actors/MissionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.MissionType TYRANNOSAURUS;
    descriptor: Lext/mods/gameserver/enums/actors/MissionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.MissionType SPAWN_CHRISTMAS_TREE;
    descriptor: Lext/mods/gameserver/enums/actors/MissionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.MissionType RESSURECT;
    descriptor: Lext/mods/gameserver/enums/actors/MissionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.MissionType RESSURECTED;
    descriptor: Lext/mods/gameserver/enums/actors/MissionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.MissionType RECOMMEND;
    descriptor: Lext/mods/gameserver/enums/actors/MissionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.MissionType RECOMMENDED;
    descriptor: Lext/mods/gameserver/enums/actors/MissionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.MissionType LOTTERY_WIN;
    descriptor: Lext/mods/gameserver/enums/actors/MissionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.MissionType ENTER_RIFT;
    descriptor: Lext/mods/gameserver/enums/actors/MissionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.MissionType QUEST_COMPLETE;
    descriptor: Lext/mods/gameserver/enums/actors/MissionType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static ext.mods.gameserver.enums.actors.MissionType[] values();
    descriptor: ()[Lext/mods/gameserver/enums/actors/MissionType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #151                // Field $VALUES:[Lext/mods/gameserver/enums/actors/MissionType;
         3: invokevirtual #155                // Method "[Lext/mods/gameserver/enums/actors/MissionType;".clone:()Ljava/lang/Object;
         6: checkcast     #156                // class "[Lext/mods/gameserver/enums/actors/MissionType;"
         9: areturn
      LineNumberTable:
        line 20: 0

  public static ext.mods.gameserver.enums.actors.MissionType valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/enums/actors/MissionType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/gameserver/enums/actors/MissionType
         2: aload_0
         3: invokestatic  #160                // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/gameserver/enums/actors/MissionType
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
         0: new           #1                  // class ext/mods/gameserver/enums/actors/MissionType
         3: dup
         4: ldc           #170                // String PVP
         6: iconst_0
         7: invokespecial #171                // Method "<init>":(Ljava/lang/String;I)V
        10: putstatic     #3                  // Field PVP:Lext/mods/gameserver/enums/actors/MissionType;
        13: new           #1                  // class ext/mods/gameserver/enums/actors/MissionType
        16: dup
        17: ldc           #172                // String PK
        19: iconst_1
        20: invokespecial #171                // Method "<init>":(Ljava/lang/String;I)V
        23: putstatic     #7                  // Field PK:Lext/mods/gameserver/enums/actors/MissionType;
        26: new           #1                  // class ext/mods/gameserver/enums/actors/MissionType
        29: dup
        30: ldc           #173                // String DEATHS
        32: iconst_2
        33: invokespecial #171                // Method "<init>":(Ljava/lang/String;I)V
        36: putstatic     #10                 // Field DEATHS:Lext/mods/gameserver/enums/actors/MissionType;
        39: new           #1                  // class ext/mods/gameserver/enums/actors/MissionType
        42: dup
        43: ldc           #174                // String GUARD
        45: iconst_3
        46: invokespecial #171                // Method "<init>":(Ljava/lang/String;I)V
        49: putstatic     #13                 // Field GUARD:Lext/mods/gameserver/enums/actors/MissionType;
        52: new           #1                  // class ext/mods/gameserver/enums/actors/MissionType
        55: dup
        56: ldc           #175                // String DUAL_WON
        58: iconst_4
        59: invokespecial #171                // Method "<init>":(Ljava/lang/String;I)V
        62: putstatic     #16                 // Field DUAL_WON:Lext/mods/gameserver/enums/actors/MissionType;
        65: new           #1                  // class ext/mods/gameserver/enums/actors/MissionType
        68: dup
        69: ldc           #176                // String SUBCLASS
        71: iconst_5
        72: invokespecial #171                // Method "<init>":(Ljava/lang/String;I)V
        75: putstatic     #19                 // Field SUBCLASS:Lext/mods/gameserver/enums/actors/MissionType;
        78: new           #1                  // class ext/mods/gameserver/enums/actors/MissionType
        81: dup
        82: ldc           #177                // String LEADER
        84: bipush        6
        86: invokespecial #171                // Method "<init>":(Ljava/lang/String;I)V
        89: putstatic     #22                 // Field LEADER:Lext/mods/gameserver/enums/actors/MissionType;
        92: new           #1                  // class ext/mods/gameserver/enums/actors/MissionType
        95: dup
        96: ldc           #178                // String ACADEMY
        98: bipush        7
       100: invokespecial #171                // Method "<init>":(Ljava/lang/String;I)V
       103: putstatic     #25                 // Field ACADEMY:Lext/mods/gameserver/enums/actors/MissionType;
       106: new           #1                  // class ext/mods/gameserver/enums/actors/MissionType
       109: dup
       110: ldc           #179                // String CLAN_LEVEL_UP
       112: bipush        8
       114: invokespecial #171                // Method "<init>":(Ljava/lang/String;I)V
       117: putstatic     #28                 // Field CLAN_LEVEL_UP:Lext/mods/gameserver/enums/actors/MissionType;
       120: new           #1                  // class ext/mods/gameserver/enums/actors/MissionType
       123: dup
       124: ldc           #180                // String CASTLE
       126: bipush        9
       128: invokespecial #171                // Method "<init>":(Ljava/lang/String;I)V
       131: putstatic     #31                 // Field CASTLE:Lext/mods/gameserver/enums/actors/MissionType;
       134: new           #1                  // class ext/mods/gameserver/enums/actors/MissionType
       137: dup
       138: ldc           #181                // String NOBLE
       140: bipush        10
       142: invokespecial #171                // Method "<init>":(Ljava/lang/String;I)V
       145: putstatic     #34                 // Field NOBLE:Lext/mods/gameserver/enums/actors/MissionType;
       148: new           #1                  // class ext/mods/gameserver/enums/actors/MissionType
       151: dup
       152: ldc           #182                // String HEROIC
       154: bipush        11
       156: invokespecial #171                // Method "<init>":(Ljava/lang/String;I)V
       159: putstatic     #37                 // Field HEROIC:Lext/mods/gameserver/enums/actors/MissionType;
       162: new           #1                  // class ext/mods/gameserver/enums/actors/MissionType
       165: dup
       166: ldc           #183                // String MARRIED
       168: bipush        12
       170: invokespecial #171                // Method "<init>":(Ljava/lang/String;I)V
       173: putstatic     #40                 // Field MARRIED:Lext/mods/gameserver/enums/actors/MissionType;
       176: new           #1                  // class ext/mods/gameserver/enums/actors/MissionType
       179: dup
       180: ldc           #184                // String MONSTER
       182: bipush        13
       184: invokespecial #171                // Method "<init>":(Ljava/lang/String;I)V
       187: putstatic     #43                 // Field MONSTER:Lext/mods/gameserver/enums/actors/MissionType;
       190: new           #1                  // class ext/mods/gameserver/enums/actors/MissionType
       193: dup
       194: ldc           #185                // String RAIDBOSS
       196: bipush        14
       198: invokespecial #171                // Method "<init>":(Ljava/lang/String;I)V
       201: putstatic     #46                 // Field RAIDBOSS:Lext/mods/gameserver/enums/actors/MissionType;
       204: new           #1                  // class ext/mods/gameserver/enums/actors/MissionType
       207: dup
       208: ldc           #186                // String GRANDBOSS
       210: bipush        15
       212: invokespecial #171                // Method "<init>":(Ljava/lang/String;I)V
       215: putstatic     #49                 // Field GRANDBOSS:Lext/mods/gameserver/enums/actors/MissionType;
       218: new           #1                  // class ext/mods/gameserver/enums/actors/MissionType
       221: dup
       222: ldc           #187                // String QUEEN_ANT
       224: bipush        16
       226: invokespecial #171                // Method "<init>":(Ljava/lang/String;I)V
       229: putstatic     #52                 // Field QUEEN_ANT:Lext/mods/gameserver/enums/actors/MissionType;
       232: new           #1                  // class ext/mods/gameserver/enums/actors/MissionType
       235: dup
       236: ldc           #188                // String CORE
       238: bipush        17
       240: invokespecial #171                // Method "<init>":(Ljava/lang/String;I)V
       243: putstatic     #55                 // Field CORE:Lext/mods/gameserver/enums/actors/MissionType;
       246: new           #1                  // class ext/mods/gameserver/enums/actors/MissionType
       249: dup
       250: ldc           #189                // String ORFEN
       252: bipush        18
       254: invokespecial #171                // Method "<init>":(Ljava/lang/String;I)V
       257: putstatic     #58                 // Field ORFEN:Lext/mods/gameserver/enums/actors/MissionType;
       260: new           #1                  // class ext/mods/gameserver/enums/actors/MissionType
       263: dup
       264: ldc           #190                // String ZAKEN
       266: bipush        19
       268: invokespecial #171                // Method "<init>":(Ljava/lang/String;I)V
       271: putstatic     #61                 // Field ZAKEN:Lext/mods/gameserver/enums/actors/MissionType;
       274: new           #1                  // class ext/mods/gameserver/enums/actors/MissionType
       277: dup
       278: ldc           #191                // String BAIUM
       280: bipush        20
       282: invokespecial #171                // Method "<init>":(Ljava/lang/String;I)V
       285: putstatic     #64                 // Field BAIUM:Lext/mods/gameserver/enums/actors/MissionType;
       288: new           #1                  // class ext/mods/gameserver/enums/actors/MissionType
       291: dup
       292: ldc           #192                // String ANTHARAS
       294: bipush        21
       296: invokespecial #171                // Method "<init>":(Ljava/lang/String;I)V
       299: putstatic     #67                 // Field ANTHARAS:Lext/mods/gameserver/enums/actors/MissionType;
       302: new           #1                  // class ext/mods/gameserver/enums/actors/MissionType
       305: dup
       306: ldc           #193                // String VALAKAS
       308: bipush        22
       310: invokespecial #171                // Method "<init>":(Ljava/lang/String;I)V
       313: putstatic     #70                 // Field VALAKAS:Lext/mods/gameserver/enums/actors/MissionType;
       316: new           #1                  // class ext/mods/gameserver/enums/actors/MissionType
       319: dup
       320: ldc           #194                // String HALISHA
       322: bipush        23
       324: invokespecial #171                // Method "<init>":(Ljava/lang/String;I)V
       327: putstatic     #73                 // Field HALISHA:Lext/mods/gameserver/enums/actors/MissionType;
       330: new           #1                  // class ext/mods/gameserver/enums/actors/MissionType
       333: dup
       334: ldc           #195                // String ENCHANT_SKILL
       336: bipush        24
       338: invokespecial #171                // Method "<init>":(Ljava/lang/String;I)V
       341: putstatic     #76                 // Field ENCHANT_SKILL:Lext/mods/gameserver/enums/actors/MissionType;
       344: new           #1                  // class ext/mods/gameserver/enums/actors/MissionType
       347: dup
       348: ldc           #196                // String ENCHANT_WEAPON
       350: bipush        25
       352: invokespecial #171                // Method "<init>":(Ljava/lang/String;I)V
       355: putstatic     #79                 // Field ENCHANT_WEAPON:Lext/mods/gameserver/enums/actors/MissionType;
       358: new           #1                  // class ext/mods/gameserver/enums/actors/MissionType
       361: dup
       362: ldc           #197                // String ENCHANT_OTHER
       364: bipush        26
       366: invokespecial #171                // Method "<init>":(Ljava/lang/String;I)V
       369: putstatic     #82                 // Field ENCHANT_OTHER:Lext/mods/gameserver/enums/actors/MissionType;
       372: new           #1                  // class ext/mods/gameserver/enums/actors/MissionType
       375: dup
       376: ldc           #198                // String ENCHANT_SUCCESS
       378: bipush        27
       380: invokespecial #171                // Method "<init>":(Ljava/lang/String;I)V
       383: putstatic     #85                 // Field ENCHANT_SUCCESS:Lext/mods/gameserver/enums/actors/MissionType;
       386: new           #1                  // class ext/mods/gameserver/enums/actors/MissionType
       389: dup
       390: ldc           #199                // String ENCHANT_FAILED
       392: bipush        28
       394: invokespecial #171                // Method "<init>":(Ljava/lang/String;I)V
       397: putstatic     #88                 // Field ENCHANT_FAILED:Lext/mods/gameserver/enums/actors/MissionType;
       400: new           #1                  // class ext/mods/gameserver/enums/actors/MissionType
       403: dup
       404: ldc           #200                // String CURSED_WEAPON
       406: bipush        29
       408: invokespecial #171                // Method "<init>":(Ljava/lang/String;I)V
       411: putstatic     #91                 // Field CURSED_WEAPON:Lext/mods/gameserver/enums/actors/MissionType;
       414: new           #1                  // class ext/mods/gameserver/enums/actors/MissionType
       417: dup
       418: ldc           #201                // String AUGMENT
       420: bipush        30
       422: invokespecial #171                // Method "<init>":(Ljava/lang/String;I)V
       425: putstatic     #94                 // Field AUGMENT:Lext/mods/gameserver/enums/actors/MissionType;
       428: new           #1                  // class ext/mods/gameserver/enums/actors/MissionType
       431: dup
       432: ldc           #202                // String KARMA
       434: bipush        31
       436: invokespecial #171                // Method "<init>":(Ljava/lang/String;I)V
       439: putstatic     #97                 // Field KARMA:Lext/mods/gameserver/enums/actors/MissionType;
       442: new           #1                  // class ext/mods/gameserver/enums/actors/MissionType
       445: dup
       446: ldc           #203                // String OLYMPIAD_FIGHT
       448: bipush        32
       450: invokespecial #171                // Method "<init>":(Ljava/lang/String;I)V
       453: putstatic     #100                // Field OLYMPIAD_FIGHT:Lext/mods/gameserver/enums/actors/MissionType;
       456: new           #1                  // class ext/mods/gameserver/enums/actors/MissionType
       459: dup
       460: ldc           #204                // String OLYMPIAD_FIGHT_WON
       462: bipush        33
       464: invokespecial #171                // Method "<init>":(Ljava/lang/String;I)V
       467: putstatic     #103                // Field OLYMPIAD_FIGHT_WON:Lext/mods/gameserver/enums/actors/MissionType;
       470: new           #1                  // class ext/mods/gameserver/enums/actors/MissionType
       473: dup
       474: ldc           #205                // String OLYMPIAD_FIGHT_LOST
       476: bipush        34
       478: invokespecial #171                // Method "<init>":(Ljava/lang/String;I)V
       481: putstatic     #106                // Field OLYMPIAD_FIGHT_LOST:Lext/mods/gameserver/enums/actors/MissionType;
       484: new           #1                  // class ext/mods/gameserver/enums/actors/MissionType
       487: dup
       488: ldc           #206                // String SPOIL
       490: bipush        35
       492: invokespecial #171                // Method "<init>":(Ljava/lang/String;I)V
       495: putstatic     #109                // Field SPOIL:Lext/mods/gameserver/enums/actors/MissionType;
       498: new           #1                  // class ext/mods/gameserver/enums/actors/MissionType
       501: dup
       502: ldc           #207                // String FISHING
       504: bipush        36
       506: invokespecial #171                // Method "<init>":(Ljava/lang/String;I)V
       509: putstatic     #112                // Field FISHING:Lext/mods/gameserver/enums/actors/MissionType;
       512: new           #1                  // class ext/mods/gameserver/enums/actors/MissionType
       515: dup
       516: ldc           #208                // String RECIPE_LEARN
       518: bipush        37
       520: invokespecial #171                // Method "<init>":(Ljava/lang/String;I)V
       523: putstatic     #115                // Field RECIPE_LEARN:Lext/mods/gameserver/enums/actors/MissionType;
       526: new           #1                  // class ext/mods/gameserver/enums/actors/MissionType
       529: dup
       530: ldc           #209                // String CRAFT_SUCCESS
       532: bipush        38
       534: invokespecial #171                // Method "<init>":(Ljava/lang/String;I)V
       537: putstatic     #118                // Field CRAFT_SUCCESS:Lext/mods/gameserver/enums/actors/MissionType;
       540: new           #1                  // class ext/mods/gameserver/enums/actors/MissionType
       543: dup
       544: ldc           #210                // String CRAFT_FAIL
       546: bipush        39
       548: invokespecial #171                // Method "<init>":(Ljava/lang/String;I)V
       551: putstatic     #121                // Field CRAFT_FAIL:Lext/mods/gameserver/enums/actors/MissionType;
       554: new           #1                  // class ext/mods/gameserver/enums/actors/MissionType
       557: dup
       558: ldc           #211                // String TYRANNOSAURUS
       560: bipush        40
       562: invokespecial #171                // Method "<init>":(Ljava/lang/String;I)V
       565: putstatic     #124                // Field TYRANNOSAURUS:Lext/mods/gameserver/enums/actors/MissionType;
       568: new           #1                  // class ext/mods/gameserver/enums/actors/MissionType
       571: dup
       572: ldc           #212                // String SPAWN_CHRISTMAS_TREE
       574: bipush        41
       576: invokespecial #171                // Method "<init>":(Ljava/lang/String;I)V
       579: putstatic     #127                // Field SPAWN_CHRISTMAS_TREE:Lext/mods/gameserver/enums/actors/MissionType;
       582: new           #1                  // class ext/mods/gameserver/enums/actors/MissionType
       585: dup
       586: ldc           #213                // String RESSURECT
       588: bipush        42
       590: invokespecial #171                // Method "<init>":(Ljava/lang/String;I)V
       593: putstatic     #130                // Field RESSURECT:Lext/mods/gameserver/enums/actors/MissionType;
       596: new           #1                  // class ext/mods/gameserver/enums/actors/MissionType
       599: dup
       600: ldc           #214                // String RESSURECTED
       602: bipush        43
       604: invokespecial #171                // Method "<init>":(Ljava/lang/String;I)V
       607: putstatic     #133                // Field RESSURECTED:Lext/mods/gameserver/enums/actors/MissionType;
       610: new           #1                  // class ext/mods/gameserver/enums/actors/MissionType
       613: dup
       614: ldc           #215                // String RECOMMEND
       616: bipush        44
       618: invokespecial #171                // Method "<init>":(Ljava/lang/String;I)V
       621: putstatic     #136                // Field RECOMMEND:Lext/mods/gameserver/enums/actors/MissionType;
       624: new           #1                  // class ext/mods/gameserver/enums/actors/MissionType
       627: dup
       628: ldc           #216                // String RECOMMENDED
       630: bipush        45
       632: invokespecial #171                // Method "<init>":(Ljava/lang/String;I)V
       635: putstatic     #139                // Field RECOMMENDED:Lext/mods/gameserver/enums/actors/MissionType;
       638: new           #1                  // class ext/mods/gameserver/enums/actors/MissionType
       641: dup
       642: ldc           #217                // String LOTTERY_WIN
       644: bipush        46
       646: invokespecial #171                // Method "<init>":(Ljava/lang/String;I)V
       649: putstatic     #142                // Field LOTTERY_WIN:Lext/mods/gameserver/enums/actors/MissionType;
       652: new           #1                  // class ext/mods/gameserver/enums/actors/MissionType
       655: dup
       656: ldc           #218                // String ENTER_RIFT
       658: bipush        47
       660: invokespecial #171                // Method "<init>":(Ljava/lang/String;I)V
       663: putstatic     #145                // Field ENTER_RIFT:Lext/mods/gameserver/enums/actors/MissionType;
       666: new           #1                  // class ext/mods/gameserver/enums/actors/MissionType
       669: dup
       670: ldc           #219                // String QUEST_COMPLETE
       672: bipush        48
       674: invokespecial #171                // Method "<init>":(Ljava/lang/String;I)V
       677: putstatic     #148                // Field QUEST_COMPLETE:Lext/mods/gameserver/enums/actors/MissionType;
       680: invokestatic  #220                // Method $values:()[Lext/mods/gameserver/enums/actors/MissionType;
       683: putstatic     #151                // Field $VALUES:[Lext/mods/gameserver/enums/actors/MissionType;
       686: return
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
        line 51: 400
        line 52: 414
        line 53: 428
        line 54: 442
        line 55: 456
        line 56: 470
        line 57: 484
        line 58: 498
        line 59: 512
        line 60: 526
        line 61: 540
        line 62: 554
        line 63: 568
        line 64: 582
        line 65: 596
        line 66: 610
        line 67: 624
        line 68: 638
        line 69: 652
        line 70: 666
        line 20: 680
}
Signature: #236                         // Ljava/lang/Enum<Lext/mods/gameserver/enums/actors/MissionType;>;
SourceFile: "MissionType.java"
