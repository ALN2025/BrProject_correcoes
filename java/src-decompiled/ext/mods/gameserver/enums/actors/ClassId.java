// Bytecode for: ext.mods.gameserver.enums.actors.ClassId
// File: ext\mods\gameserver\enums\actors\ClassId.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/enums/actors/ClassId.class
  Last modified 9 de jul de 2026; size 18189 bytes
  MD5 checksum a6a1cf1f7675998fee33982f0e18128f
  Compiled from "ClassId.java"
public final class ext.mods.gameserver.enums.actors.ClassId extends java.lang.Enum<ext.mods.gameserver.enums.actors.ClassId>
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/gameserver/enums/actors/ClassId
  super_class: #371                       // java/lang/Enum
  interfaces: 0, fields: 134, methods: 17, attributes: 2
Constant pool:
    #1 = Class              #2            // ext/mods/gameserver/enums/actors/ClassId
    #2 = Utf8               ext/mods/gameserver/enums/actors/ClassId
    #3 = Fieldref           #1.#4         // ext/mods/gameserver/enums/actors/ClassId.HUMAN_FIGHTER:Lext/mods/gameserver/enums/actors/ClassId;
    #4 = NameAndType        #5:#6         // HUMAN_FIGHTER:Lext/mods/gameserver/enums/actors/ClassId;
    #5 = Utf8               HUMAN_FIGHTER
    #6 = Utf8               Lext/mods/gameserver/enums/actors/ClassId;
    #7 = Fieldref           #1.#8         // ext/mods/gameserver/enums/actors/ClassId.WARRIOR:Lext/mods/gameserver/enums/actors/ClassId;
    #8 = NameAndType        #9:#6         // WARRIOR:Lext/mods/gameserver/enums/actors/ClassId;
    #9 = Utf8               WARRIOR
   #10 = Fieldref           #1.#11        // ext/mods/gameserver/enums/actors/ClassId.GLADIATOR:Lext/mods/gameserver/enums/actors/ClassId;
   #11 = NameAndType        #12:#6        // GLADIATOR:Lext/mods/gameserver/enums/actors/ClassId;
   #12 = Utf8               GLADIATOR
   #13 = Fieldref           #1.#14        // ext/mods/gameserver/enums/actors/ClassId.WARLORD:Lext/mods/gameserver/enums/actors/ClassId;
   #14 = NameAndType        #15:#6        // WARLORD:Lext/mods/gameserver/enums/actors/ClassId;
   #15 = Utf8               WARLORD
   #16 = Fieldref           #1.#17        // ext/mods/gameserver/enums/actors/ClassId.KNIGHT:Lext/mods/gameserver/enums/actors/ClassId;
   #17 = NameAndType        #18:#6        // KNIGHT:Lext/mods/gameserver/enums/actors/ClassId;
   #18 = Utf8               KNIGHT
   #19 = Fieldref           #1.#20        // ext/mods/gameserver/enums/actors/ClassId.PALADIN:Lext/mods/gameserver/enums/actors/ClassId;
   #20 = NameAndType        #21:#6        // PALADIN:Lext/mods/gameserver/enums/actors/ClassId;
   #21 = Utf8               PALADIN
   #22 = Fieldref           #1.#23        // ext/mods/gameserver/enums/actors/ClassId.DARK_AVENGER:Lext/mods/gameserver/enums/actors/ClassId;
   #23 = NameAndType        #24:#6        // DARK_AVENGER:Lext/mods/gameserver/enums/actors/ClassId;
   #24 = Utf8               DARK_AVENGER
   #25 = Fieldref           #1.#26        // ext/mods/gameserver/enums/actors/ClassId.ROGUE:Lext/mods/gameserver/enums/actors/ClassId;
   #26 = NameAndType        #27:#6        // ROGUE:Lext/mods/gameserver/enums/actors/ClassId;
   #27 = Utf8               ROGUE
   #28 = Fieldref           #1.#29        // ext/mods/gameserver/enums/actors/ClassId.TREASURE_HUNTER:Lext/mods/gameserver/enums/actors/ClassId;
   #29 = NameAndType        #30:#6        // TREASURE_HUNTER:Lext/mods/gameserver/enums/actors/ClassId;
   #30 = Utf8               TREASURE_HUNTER
   #31 = Fieldref           #1.#32        // ext/mods/gameserver/enums/actors/ClassId.HAWKEYE:Lext/mods/gameserver/enums/actors/ClassId;
   #32 = NameAndType        #33:#6        // HAWKEYE:Lext/mods/gameserver/enums/actors/ClassId;
   #33 = Utf8               HAWKEYE
   #34 = Fieldref           #1.#35        // ext/mods/gameserver/enums/actors/ClassId.HUMAN_MYSTIC:Lext/mods/gameserver/enums/actors/ClassId;
   #35 = NameAndType        #36:#6        // HUMAN_MYSTIC:Lext/mods/gameserver/enums/actors/ClassId;
   #36 = Utf8               HUMAN_MYSTIC
   #37 = Fieldref           #1.#38        // ext/mods/gameserver/enums/actors/ClassId.HUMAN_WIZARD:Lext/mods/gameserver/enums/actors/ClassId;
   #38 = NameAndType        #39:#6        // HUMAN_WIZARD:Lext/mods/gameserver/enums/actors/ClassId;
   #39 = Utf8               HUMAN_WIZARD
   #40 = Fieldref           #1.#41        // ext/mods/gameserver/enums/actors/ClassId.SORCERER:Lext/mods/gameserver/enums/actors/ClassId;
   #41 = NameAndType        #42:#6        // SORCERER:Lext/mods/gameserver/enums/actors/ClassId;
   #42 = Utf8               SORCERER
   #43 = Fieldref           #1.#44        // ext/mods/gameserver/enums/actors/ClassId.NECROMANCER:Lext/mods/gameserver/enums/actors/ClassId;
   #44 = NameAndType        #45:#6        // NECROMANCER:Lext/mods/gameserver/enums/actors/ClassId;
   #45 = Utf8               NECROMANCER
   #46 = Fieldref           #1.#47        // ext/mods/gameserver/enums/actors/ClassId.WARLOCK:Lext/mods/gameserver/enums/actors/ClassId;
   #47 = NameAndType        #48:#6        // WARLOCK:Lext/mods/gameserver/enums/actors/ClassId;
   #48 = Utf8               WARLOCK
   #49 = Fieldref           #1.#50        // ext/mods/gameserver/enums/actors/ClassId.CLERIC:Lext/mods/gameserver/enums/actors/ClassId;
   #50 = NameAndType        #51:#6        // CLERIC:Lext/mods/gameserver/enums/actors/ClassId;
   #51 = Utf8               CLERIC
   #52 = Fieldref           #1.#53        // ext/mods/gameserver/enums/actors/ClassId.BISHOP:Lext/mods/gameserver/enums/actors/ClassId;
   #53 = NameAndType        #54:#6        // BISHOP:Lext/mods/gameserver/enums/actors/ClassId;
   #54 = Utf8               BISHOP
   #55 = Fieldref           #1.#56        // ext/mods/gameserver/enums/actors/ClassId.PROPHET:Lext/mods/gameserver/enums/actors/ClassId;
   #56 = NameAndType        #57:#6        // PROPHET:Lext/mods/gameserver/enums/actors/ClassId;
   #57 = Utf8               PROPHET
   #58 = Fieldref           #1.#59        // ext/mods/gameserver/enums/actors/ClassId.ELVEN_FIGHTER:Lext/mods/gameserver/enums/actors/ClassId;
   #59 = NameAndType        #60:#6        // ELVEN_FIGHTER:Lext/mods/gameserver/enums/actors/ClassId;
   #60 = Utf8               ELVEN_FIGHTER
   #61 = Fieldref           #1.#62        // ext/mods/gameserver/enums/actors/ClassId.ELVEN_KNIGHT:Lext/mods/gameserver/enums/actors/ClassId;
   #62 = NameAndType        #63:#6        // ELVEN_KNIGHT:Lext/mods/gameserver/enums/actors/ClassId;
   #63 = Utf8               ELVEN_KNIGHT
   #64 = Fieldref           #1.#65        // ext/mods/gameserver/enums/actors/ClassId.TEMPLE_KNIGHT:Lext/mods/gameserver/enums/actors/ClassId;
   #65 = NameAndType        #66:#6        // TEMPLE_KNIGHT:Lext/mods/gameserver/enums/actors/ClassId;
   #66 = Utf8               TEMPLE_KNIGHT
   #67 = Fieldref           #1.#68        // ext/mods/gameserver/enums/actors/ClassId.SWORD_SINGER:Lext/mods/gameserver/enums/actors/ClassId;
   #68 = NameAndType        #69:#6        // SWORD_SINGER:Lext/mods/gameserver/enums/actors/ClassId;
   #69 = Utf8               SWORD_SINGER
   #70 = Fieldref           #1.#71        // ext/mods/gameserver/enums/actors/ClassId.ELVEN_SCOUT:Lext/mods/gameserver/enums/actors/ClassId;
   #71 = NameAndType        #72:#6        // ELVEN_SCOUT:Lext/mods/gameserver/enums/actors/ClassId;
   #72 = Utf8               ELVEN_SCOUT
   #73 = Fieldref           #1.#74        // ext/mods/gameserver/enums/actors/ClassId.PLAINS_WALKER:Lext/mods/gameserver/enums/actors/ClassId;
   #74 = NameAndType        #75:#6        // PLAINS_WALKER:Lext/mods/gameserver/enums/actors/ClassId;
   #75 = Utf8               PLAINS_WALKER
   #76 = Fieldref           #1.#77        // ext/mods/gameserver/enums/actors/ClassId.SILVER_RANGER:Lext/mods/gameserver/enums/actors/ClassId;
   #77 = NameAndType        #78:#6        // SILVER_RANGER:Lext/mods/gameserver/enums/actors/ClassId;
   #78 = Utf8               SILVER_RANGER
   #79 = Fieldref           #1.#80        // ext/mods/gameserver/enums/actors/ClassId.ELVEN_MYSTIC:Lext/mods/gameserver/enums/actors/ClassId;
   #80 = NameAndType        #81:#6        // ELVEN_MYSTIC:Lext/mods/gameserver/enums/actors/ClassId;
   #81 = Utf8               ELVEN_MYSTIC
   #82 = Fieldref           #1.#83        // ext/mods/gameserver/enums/actors/ClassId.ELVEN_WIZARD:Lext/mods/gameserver/enums/actors/ClassId;
   #83 = NameAndType        #84:#6        // ELVEN_WIZARD:Lext/mods/gameserver/enums/actors/ClassId;
   #84 = Utf8               ELVEN_WIZARD
   #85 = Fieldref           #1.#86        // ext/mods/gameserver/enums/actors/ClassId.SPELLSINGER:Lext/mods/gameserver/enums/actors/ClassId;
   #86 = NameAndType        #87:#6        // SPELLSINGER:Lext/mods/gameserver/enums/actors/ClassId;
   #87 = Utf8               SPELLSINGER
   #88 = Fieldref           #1.#89        // ext/mods/gameserver/enums/actors/ClassId.ELEMENTAL_SUMMONER:Lext/mods/gameserver/enums/actors/ClassId;
   #89 = NameAndType        #90:#6        // ELEMENTAL_SUMMONER:Lext/mods/gameserver/enums/actors/ClassId;
   #90 = Utf8               ELEMENTAL_SUMMONER
   #91 = Fieldref           #1.#92        // ext/mods/gameserver/enums/actors/ClassId.ELVEN_ORACLE:Lext/mods/gameserver/enums/actors/ClassId;
   #92 = NameAndType        #93:#6        // ELVEN_ORACLE:Lext/mods/gameserver/enums/actors/ClassId;
   #93 = Utf8               ELVEN_ORACLE
   #94 = Fieldref           #1.#95        // ext/mods/gameserver/enums/actors/ClassId.ELVEN_ELDER:Lext/mods/gameserver/enums/actors/ClassId;
   #95 = NameAndType        #96:#6        // ELVEN_ELDER:Lext/mods/gameserver/enums/actors/ClassId;
   #96 = Utf8               ELVEN_ELDER
   #97 = Fieldref           #1.#98        // ext/mods/gameserver/enums/actors/ClassId.DARK_FIGHTER:Lext/mods/gameserver/enums/actors/ClassId;
   #98 = NameAndType        #99:#6        // DARK_FIGHTER:Lext/mods/gameserver/enums/actors/ClassId;
   #99 = Utf8               DARK_FIGHTER
  #100 = Fieldref           #1.#101       // ext/mods/gameserver/enums/actors/ClassId.PALUS_KNIGHT:Lext/mods/gameserver/enums/actors/ClassId;
  #101 = NameAndType        #102:#6       // PALUS_KNIGHT:Lext/mods/gameserver/enums/actors/ClassId;
  #102 = Utf8               PALUS_KNIGHT
  #103 = Fieldref           #1.#104       // ext/mods/gameserver/enums/actors/ClassId.SHILLIEN_KNIGHT:Lext/mods/gameserver/enums/actors/ClassId;
  #104 = NameAndType        #105:#6       // SHILLIEN_KNIGHT:Lext/mods/gameserver/enums/actors/ClassId;
  #105 = Utf8               SHILLIEN_KNIGHT
  #106 = Fieldref           #1.#107       // ext/mods/gameserver/enums/actors/ClassId.BLADEDANCER:Lext/mods/gameserver/enums/actors/ClassId;
  #107 = NameAndType        #108:#6       // BLADEDANCER:Lext/mods/gameserver/enums/actors/ClassId;
  #108 = Utf8               BLADEDANCER
  #109 = Fieldref           #1.#110       // ext/mods/gameserver/enums/actors/ClassId.ASSASSIN:Lext/mods/gameserver/enums/actors/ClassId;
  #110 = NameAndType        #111:#6       // ASSASSIN:Lext/mods/gameserver/enums/actors/ClassId;
  #111 = Utf8               ASSASSIN
  #112 = Fieldref           #1.#113       // ext/mods/gameserver/enums/actors/ClassId.ABYSS_WALKER:Lext/mods/gameserver/enums/actors/ClassId;
  #113 = NameAndType        #114:#6       // ABYSS_WALKER:Lext/mods/gameserver/enums/actors/ClassId;
  #114 = Utf8               ABYSS_WALKER
  #115 = Fieldref           #1.#116       // ext/mods/gameserver/enums/actors/ClassId.PHANTOM_RANGER:Lext/mods/gameserver/enums/actors/ClassId;
  #116 = NameAndType        #117:#6       // PHANTOM_RANGER:Lext/mods/gameserver/enums/actors/ClassId;
  #117 = Utf8               PHANTOM_RANGER
  #118 = Fieldref           #1.#119       // ext/mods/gameserver/enums/actors/ClassId.DARK_MYSTIC:Lext/mods/gameserver/enums/actors/ClassId;
  #119 = NameAndType        #120:#6       // DARK_MYSTIC:Lext/mods/gameserver/enums/actors/ClassId;
  #120 = Utf8               DARK_MYSTIC
  #121 = Fieldref           #1.#122       // ext/mods/gameserver/enums/actors/ClassId.DARK_WIZARD:Lext/mods/gameserver/enums/actors/ClassId;
  #122 = NameAndType        #123:#6       // DARK_WIZARD:Lext/mods/gameserver/enums/actors/ClassId;
  #123 = Utf8               DARK_WIZARD
  #124 = Fieldref           #1.#125       // ext/mods/gameserver/enums/actors/ClassId.SPELLHOWLER:Lext/mods/gameserver/enums/actors/ClassId;
  #125 = NameAndType        #126:#6       // SPELLHOWLER:Lext/mods/gameserver/enums/actors/ClassId;
  #126 = Utf8               SPELLHOWLER
  #127 = Fieldref           #1.#128       // ext/mods/gameserver/enums/actors/ClassId.PHANTOM_SUMMONER:Lext/mods/gameserver/enums/actors/ClassId;
  #128 = NameAndType        #129:#6       // PHANTOM_SUMMONER:Lext/mods/gameserver/enums/actors/ClassId;
  #129 = Utf8               PHANTOM_SUMMONER
  #130 = Fieldref           #1.#131       // ext/mods/gameserver/enums/actors/ClassId.SHILLIEN_ORACLE:Lext/mods/gameserver/enums/actors/ClassId;
  #131 = NameAndType        #132:#6       // SHILLIEN_ORACLE:Lext/mods/gameserver/enums/actors/ClassId;
  #132 = Utf8               SHILLIEN_ORACLE
  #133 = Fieldref           #1.#134       // ext/mods/gameserver/enums/actors/ClassId.SHILLIEN_ELDER:Lext/mods/gameserver/enums/actors/ClassId;
  #134 = NameAndType        #135:#6       // SHILLIEN_ELDER:Lext/mods/gameserver/enums/actors/ClassId;
  #135 = Utf8               SHILLIEN_ELDER
  #136 = Fieldref           #1.#137       // ext/mods/gameserver/enums/actors/ClassId.ORC_FIGHTER:Lext/mods/gameserver/enums/actors/ClassId;
  #137 = NameAndType        #138:#6       // ORC_FIGHTER:Lext/mods/gameserver/enums/actors/ClassId;
  #138 = Utf8               ORC_FIGHTER
  #139 = Fieldref           #1.#140       // ext/mods/gameserver/enums/actors/ClassId.ORC_RAIDER:Lext/mods/gameserver/enums/actors/ClassId;
  #140 = NameAndType        #141:#6       // ORC_RAIDER:Lext/mods/gameserver/enums/actors/ClassId;
  #141 = Utf8               ORC_RAIDER
  #142 = Fieldref           #1.#143       // ext/mods/gameserver/enums/actors/ClassId.DESTROYER:Lext/mods/gameserver/enums/actors/ClassId;
  #143 = NameAndType        #144:#6       // DESTROYER:Lext/mods/gameserver/enums/actors/ClassId;
  #144 = Utf8               DESTROYER
  #145 = Fieldref           #1.#146       // ext/mods/gameserver/enums/actors/ClassId.MONK:Lext/mods/gameserver/enums/actors/ClassId;
  #146 = NameAndType        #147:#6       // MONK:Lext/mods/gameserver/enums/actors/ClassId;
  #147 = Utf8               MONK
  #148 = Fieldref           #1.#149       // ext/mods/gameserver/enums/actors/ClassId.TYRANT:Lext/mods/gameserver/enums/actors/ClassId;
  #149 = NameAndType        #150:#6       // TYRANT:Lext/mods/gameserver/enums/actors/ClassId;
  #150 = Utf8               TYRANT
  #151 = Fieldref           #1.#152       // ext/mods/gameserver/enums/actors/ClassId.ORC_MYSTIC:Lext/mods/gameserver/enums/actors/ClassId;
  #152 = NameAndType        #153:#6       // ORC_MYSTIC:Lext/mods/gameserver/enums/actors/ClassId;
  #153 = Utf8               ORC_MYSTIC
  #154 = Fieldref           #1.#155       // ext/mods/gameserver/enums/actors/ClassId.ORC_SHAMAN:Lext/mods/gameserver/enums/actors/ClassId;
  #155 = NameAndType        #156:#6       // ORC_SHAMAN:Lext/mods/gameserver/enums/actors/ClassId;
  #156 = Utf8               ORC_SHAMAN
  #157 = Fieldref           #1.#158       // ext/mods/gameserver/enums/actors/ClassId.OVERLORD:Lext/mods/gameserver/enums/actors/ClassId;
  #158 = NameAndType        #159:#6       // OVERLORD:Lext/mods/gameserver/enums/actors/ClassId;
  #159 = Utf8               OVERLORD
  #160 = Fieldref           #1.#161       // ext/mods/gameserver/enums/actors/ClassId.WARCRYER:Lext/mods/gameserver/enums/actors/ClassId;
  #161 = NameAndType        #162:#6       // WARCRYER:Lext/mods/gameserver/enums/actors/ClassId;
  #162 = Utf8               WARCRYER
  #163 = Fieldref           #1.#164       // ext/mods/gameserver/enums/actors/ClassId.DWARVEN_FIGHTER:Lext/mods/gameserver/enums/actors/ClassId;
  #164 = NameAndType        #165:#6       // DWARVEN_FIGHTER:Lext/mods/gameserver/enums/actors/ClassId;
  #165 = Utf8               DWARVEN_FIGHTER
  #166 = Fieldref           #1.#167       // ext/mods/gameserver/enums/actors/ClassId.SCAVENGER:Lext/mods/gameserver/enums/actors/ClassId;
  #167 = NameAndType        #168:#6       // SCAVENGER:Lext/mods/gameserver/enums/actors/ClassId;
  #168 = Utf8               SCAVENGER
  #169 = Fieldref           #1.#170       // ext/mods/gameserver/enums/actors/ClassId.BOUNTY_HUNTER:Lext/mods/gameserver/enums/actors/ClassId;
  #170 = NameAndType        #171:#6       // BOUNTY_HUNTER:Lext/mods/gameserver/enums/actors/ClassId;
  #171 = Utf8               BOUNTY_HUNTER
  #172 = Fieldref           #1.#173       // ext/mods/gameserver/enums/actors/ClassId.ARTISAN:Lext/mods/gameserver/enums/actors/ClassId;
  #173 = NameAndType        #174:#6       // ARTISAN:Lext/mods/gameserver/enums/actors/ClassId;
  #174 = Utf8               ARTISAN
  #175 = Fieldref           #1.#176       // ext/mods/gameserver/enums/actors/ClassId.WARSMITH:Lext/mods/gameserver/enums/actors/ClassId;
  #176 = NameAndType        #177:#6       // WARSMITH:Lext/mods/gameserver/enums/actors/ClassId;
  #177 = Utf8               WARSMITH
  #178 = Fieldref           #1.#179       // ext/mods/gameserver/enums/actors/ClassId.DUMMY_1:Lext/mods/gameserver/enums/actors/ClassId;
  #179 = NameAndType        #180:#6       // DUMMY_1:Lext/mods/gameserver/enums/actors/ClassId;
  #180 = Utf8               DUMMY_1
  #181 = Fieldref           #1.#182       // ext/mods/gameserver/enums/actors/ClassId.DUMMY_2:Lext/mods/gameserver/enums/actors/ClassId;
  #182 = NameAndType        #183:#6       // DUMMY_2:Lext/mods/gameserver/enums/actors/ClassId;
  #183 = Utf8               DUMMY_2
  #184 = Fieldref           #1.#185       // ext/mods/gameserver/enums/actors/ClassId.DUMMY_3:Lext/mods/gameserver/enums/actors/ClassId;
  #185 = NameAndType        #186:#6       // DUMMY_3:Lext/mods/gameserver/enums/actors/ClassId;
  #186 = Utf8               DUMMY_3
  #187 = Fieldref           #1.#188       // ext/mods/gameserver/enums/actors/ClassId.DUMMY_4:Lext/mods/gameserver/enums/actors/ClassId;
  #188 = NameAndType        #189:#6       // DUMMY_4:Lext/mods/gameserver/enums/actors/ClassId;
  #189 = Utf8               DUMMY_4
  #190 = Fieldref           #1.#191       // ext/mods/gameserver/enums/actors/ClassId.DUMMY_5:Lext/mods/gameserver/enums/actors/ClassId;
  #191 = NameAndType        #192:#6       // DUMMY_5:Lext/mods/gameserver/enums/actors/ClassId;
  #192 = Utf8               DUMMY_5
  #193 = Fieldref           #1.#194       // ext/mods/gameserver/enums/actors/ClassId.DUMMY_6:Lext/mods/gameserver/enums/actors/ClassId;
  #194 = NameAndType        #195:#6       // DUMMY_6:Lext/mods/gameserver/enums/actors/ClassId;
  #195 = Utf8               DUMMY_6
  #196 = Fieldref           #1.#197       // ext/mods/gameserver/enums/actors/ClassId.DUMMY_7:Lext/mods/gameserver/enums/actors/ClassId;
  #197 = NameAndType        #198:#6       // DUMMY_7:Lext/mods/gameserver/enums/actors/ClassId;
  #198 = Utf8               DUMMY_7
  #199 = Fieldref           #1.#200       // ext/mods/gameserver/enums/actors/ClassId.DUMMY_8:Lext/mods/gameserver/enums/actors/ClassId;
  #200 = NameAndType        #201:#6       // DUMMY_8:Lext/mods/gameserver/enums/actors/ClassId;
  #201 = Utf8               DUMMY_8
  #202 = Fieldref           #1.#203       // ext/mods/gameserver/enums/actors/ClassId.DUMMY_9:Lext/mods/gameserver/enums/actors/ClassId;
  #203 = NameAndType        #204:#6       // DUMMY_9:Lext/mods/gameserver/enums/actors/ClassId;
  #204 = Utf8               DUMMY_9
  #205 = Fieldref           #1.#206       // ext/mods/gameserver/enums/actors/ClassId.DUMMY_10:Lext/mods/gameserver/enums/actors/ClassId;
  #206 = NameAndType        #207:#6       // DUMMY_10:Lext/mods/gameserver/enums/actors/ClassId;
  #207 = Utf8               DUMMY_10
  #208 = Fieldref           #1.#209       // ext/mods/gameserver/enums/actors/ClassId.DUMMY_11:Lext/mods/gameserver/enums/actors/ClassId;
  #209 = NameAndType        #210:#6       // DUMMY_11:Lext/mods/gameserver/enums/actors/ClassId;
  #210 = Utf8               DUMMY_11
  #211 = Fieldref           #1.#212       // ext/mods/gameserver/enums/actors/ClassId.DUMMY_12:Lext/mods/gameserver/enums/actors/ClassId;
  #212 = NameAndType        #213:#6       // DUMMY_12:Lext/mods/gameserver/enums/actors/ClassId;
  #213 = Utf8               DUMMY_12
  #214 = Fieldref           #1.#215       // ext/mods/gameserver/enums/actors/ClassId.DUMMY_13:Lext/mods/gameserver/enums/actors/ClassId;
  #215 = NameAndType        #216:#6       // DUMMY_13:Lext/mods/gameserver/enums/actors/ClassId;
  #216 = Utf8               DUMMY_13
  #217 = Fieldref           #1.#218       // ext/mods/gameserver/enums/actors/ClassId.DUMMY_14:Lext/mods/gameserver/enums/actors/ClassId;
  #218 = NameAndType        #219:#6       // DUMMY_14:Lext/mods/gameserver/enums/actors/ClassId;
  #219 = Utf8               DUMMY_14
  #220 = Fieldref           #1.#221       // ext/mods/gameserver/enums/actors/ClassId.DUMMY_15:Lext/mods/gameserver/enums/actors/ClassId;
  #221 = NameAndType        #222:#6       // DUMMY_15:Lext/mods/gameserver/enums/actors/ClassId;
  #222 = Utf8               DUMMY_15
  #223 = Fieldref           #1.#224       // ext/mods/gameserver/enums/actors/ClassId.DUMMY_16:Lext/mods/gameserver/enums/actors/ClassId;
  #224 = NameAndType        #225:#6       // DUMMY_16:Lext/mods/gameserver/enums/actors/ClassId;
  #225 = Utf8               DUMMY_16
  #226 = Fieldref           #1.#227       // ext/mods/gameserver/enums/actors/ClassId.DUMMY_17:Lext/mods/gameserver/enums/actors/ClassId;
  #227 = NameAndType        #228:#6       // DUMMY_17:Lext/mods/gameserver/enums/actors/ClassId;
  #228 = Utf8               DUMMY_17
  #229 = Fieldref           #1.#230       // ext/mods/gameserver/enums/actors/ClassId.DUMMY_18:Lext/mods/gameserver/enums/actors/ClassId;
  #230 = NameAndType        #231:#6       // DUMMY_18:Lext/mods/gameserver/enums/actors/ClassId;
  #231 = Utf8               DUMMY_18
  #232 = Fieldref           #1.#233       // ext/mods/gameserver/enums/actors/ClassId.DUMMY_19:Lext/mods/gameserver/enums/actors/ClassId;
  #233 = NameAndType        #234:#6       // DUMMY_19:Lext/mods/gameserver/enums/actors/ClassId;
  #234 = Utf8               DUMMY_19
  #235 = Fieldref           #1.#236       // ext/mods/gameserver/enums/actors/ClassId.DUMMY_20:Lext/mods/gameserver/enums/actors/ClassId;
  #236 = NameAndType        #237:#6       // DUMMY_20:Lext/mods/gameserver/enums/actors/ClassId;
  #237 = Utf8               DUMMY_20
  #238 = Fieldref           #1.#239       // ext/mods/gameserver/enums/actors/ClassId.DUMMY_21:Lext/mods/gameserver/enums/actors/ClassId;
  #239 = NameAndType        #240:#6       // DUMMY_21:Lext/mods/gameserver/enums/actors/ClassId;
  #240 = Utf8               DUMMY_21
  #241 = Fieldref           #1.#242       // ext/mods/gameserver/enums/actors/ClassId.DUMMY_22:Lext/mods/gameserver/enums/actors/ClassId;
  #242 = NameAndType        #243:#6       // DUMMY_22:Lext/mods/gameserver/enums/actors/ClassId;
  #243 = Utf8               DUMMY_22
  #244 = Fieldref           #1.#245       // ext/mods/gameserver/enums/actors/ClassId.DUMMY_23:Lext/mods/gameserver/enums/actors/ClassId;
  #245 = NameAndType        #246:#6       // DUMMY_23:Lext/mods/gameserver/enums/actors/ClassId;
  #246 = Utf8               DUMMY_23
  #247 = Fieldref           #1.#248       // ext/mods/gameserver/enums/actors/ClassId.DUMMY_24:Lext/mods/gameserver/enums/actors/ClassId;
  #248 = NameAndType        #249:#6       // DUMMY_24:Lext/mods/gameserver/enums/actors/ClassId;
  #249 = Utf8               DUMMY_24
  #250 = Fieldref           #1.#251       // ext/mods/gameserver/enums/actors/ClassId.DUMMY_25:Lext/mods/gameserver/enums/actors/ClassId;
  #251 = NameAndType        #252:#6       // DUMMY_25:Lext/mods/gameserver/enums/actors/ClassId;
  #252 = Utf8               DUMMY_25
  #253 = Fieldref           #1.#254       // ext/mods/gameserver/enums/actors/ClassId.DUMMY_26:Lext/mods/gameserver/enums/actors/ClassId;
  #254 = NameAndType        #255:#6       // DUMMY_26:Lext/mods/gameserver/enums/actors/ClassId;
  #255 = Utf8               DUMMY_26
  #256 = Fieldref           #1.#257       // ext/mods/gameserver/enums/actors/ClassId.DUMMY_27:Lext/mods/gameserver/enums/actors/ClassId;
  #257 = NameAndType        #258:#6       // DUMMY_27:Lext/mods/gameserver/enums/actors/ClassId;
  #258 = Utf8               DUMMY_27
  #259 = Fieldref           #1.#260       // ext/mods/gameserver/enums/actors/ClassId.DUMMY_28:Lext/mods/gameserver/enums/actors/ClassId;
  #260 = NameAndType        #261:#6       // DUMMY_28:Lext/mods/gameserver/enums/actors/ClassId;
  #261 = Utf8               DUMMY_28
  #262 = Fieldref           #1.#263       // ext/mods/gameserver/enums/actors/ClassId.DUMMY_29:Lext/mods/gameserver/enums/actors/ClassId;
  #263 = NameAndType        #264:#6       // DUMMY_29:Lext/mods/gameserver/enums/actors/ClassId;
  #264 = Utf8               DUMMY_29
  #265 = Fieldref           #1.#266       // ext/mods/gameserver/enums/actors/ClassId.DUMMY_30:Lext/mods/gameserver/enums/actors/ClassId;
  #266 = NameAndType        #267:#6       // DUMMY_30:Lext/mods/gameserver/enums/actors/ClassId;
  #267 = Utf8               DUMMY_30
  #268 = Fieldref           #1.#269       // ext/mods/gameserver/enums/actors/ClassId.DUELIST:Lext/mods/gameserver/enums/actors/ClassId;
  #269 = NameAndType        #270:#6       // DUELIST:Lext/mods/gameserver/enums/actors/ClassId;
  #270 = Utf8               DUELIST
  #271 = Fieldref           #1.#272       // ext/mods/gameserver/enums/actors/ClassId.DREADNOUGHT:Lext/mods/gameserver/enums/actors/ClassId;
  #272 = NameAndType        #273:#6       // DREADNOUGHT:Lext/mods/gameserver/enums/actors/ClassId;
  #273 = Utf8               DREADNOUGHT
  #274 = Fieldref           #1.#275       // ext/mods/gameserver/enums/actors/ClassId.PHOENIX_KNIGHT:Lext/mods/gameserver/enums/actors/ClassId;
  #275 = NameAndType        #276:#6       // PHOENIX_KNIGHT:Lext/mods/gameserver/enums/actors/ClassId;
  #276 = Utf8               PHOENIX_KNIGHT
  #277 = Fieldref           #1.#278       // ext/mods/gameserver/enums/actors/ClassId.HELL_KNIGHT:Lext/mods/gameserver/enums/actors/ClassId;
  #278 = NameAndType        #279:#6       // HELL_KNIGHT:Lext/mods/gameserver/enums/actors/ClassId;
  #279 = Utf8               HELL_KNIGHT
  #280 = Fieldref           #1.#281       // ext/mods/gameserver/enums/actors/ClassId.SAGGITARIUS:Lext/mods/gameserver/enums/actors/ClassId;
  #281 = NameAndType        #282:#6       // SAGGITARIUS:Lext/mods/gameserver/enums/actors/ClassId;
  #282 = Utf8               SAGGITARIUS
  #283 = Fieldref           #1.#284       // ext/mods/gameserver/enums/actors/ClassId.ADVENTURER:Lext/mods/gameserver/enums/actors/ClassId;
  #284 = NameAndType        #285:#6       // ADVENTURER:Lext/mods/gameserver/enums/actors/ClassId;
  #285 = Utf8               ADVENTURER
  #286 = Fieldref           #1.#287       // ext/mods/gameserver/enums/actors/ClassId.ARCHMAGE:Lext/mods/gameserver/enums/actors/ClassId;
  #287 = NameAndType        #288:#6       // ARCHMAGE:Lext/mods/gameserver/enums/actors/ClassId;
  #288 = Utf8               ARCHMAGE
  #289 = Fieldref           #1.#290       // ext/mods/gameserver/enums/actors/ClassId.SOULTAKER:Lext/mods/gameserver/enums/actors/ClassId;
  #290 = NameAndType        #291:#6       // SOULTAKER:Lext/mods/gameserver/enums/actors/ClassId;
  #291 = Utf8               SOULTAKER
  #292 = Fieldref           #1.#293       // ext/mods/gameserver/enums/actors/ClassId.ARCANA_LORD:Lext/mods/gameserver/enums/actors/ClassId;
  #293 = NameAndType        #294:#6       // ARCANA_LORD:Lext/mods/gameserver/enums/actors/ClassId;
  #294 = Utf8               ARCANA_LORD
  #295 = Fieldref           #1.#296       // ext/mods/gameserver/enums/actors/ClassId.CARDINAL:Lext/mods/gameserver/enums/actors/ClassId;
  #296 = NameAndType        #297:#6       // CARDINAL:Lext/mods/gameserver/enums/actors/ClassId;
  #297 = Utf8               CARDINAL
  #298 = Fieldref           #1.#299       // ext/mods/gameserver/enums/actors/ClassId.HIEROPHANT:Lext/mods/gameserver/enums/actors/ClassId;
  #299 = NameAndType        #300:#6       // HIEROPHANT:Lext/mods/gameserver/enums/actors/ClassId;
  #300 = Utf8               HIEROPHANT
  #301 = Fieldref           #1.#302       // ext/mods/gameserver/enums/actors/ClassId.EVAS_TEMPLAR:Lext/mods/gameserver/enums/actors/ClassId;
  #302 = NameAndType        #303:#6       // EVAS_TEMPLAR:Lext/mods/gameserver/enums/actors/ClassId;
  #303 = Utf8               EVAS_TEMPLAR
  #304 = Fieldref           #1.#305       // ext/mods/gameserver/enums/actors/ClassId.SWORD_MUSE:Lext/mods/gameserver/enums/actors/ClassId;
  #305 = NameAndType        #306:#6       // SWORD_MUSE:Lext/mods/gameserver/enums/actors/ClassId;
  #306 = Utf8               SWORD_MUSE
  #307 = Fieldref           #1.#308       // ext/mods/gameserver/enums/actors/ClassId.WIND_RIDER:Lext/mods/gameserver/enums/actors/ClassId;
  #308 = NameAndType        #309:#6       // WIND_RIDER:Lext/mods/gameserver/enums/actors/ClassId;
  #309 = Utf8               WIND_RIDER
  #310 = Fieldref           #1.#311       // ext/mods/gameserver/enums/actors/ClassId.MOONLIGHT_SENTINEL:Lext/mods/gameserver/enums/actors/ClassId;
  #311 = NameAndType        #312:#6       // MOONLIGHT_SENTINEL:Lext/mods/gameserver/enums/actors/ClassId;
  #312 = Utf8               MOONLIGHT_SENTINEL
  #313 = Fieldref           #1.#314       // ext/mods/gameserver/enums/actors/ClassId.MYSTIC_MUSE:Lext/mods/gameserver/enums/actors/ClassId;
  #314 = NameAndType        #315:#6       // MYSTIC_MUSE:Lext/mods/gameserver/enums/actors/ClassId;
  #315 = Utf8               MYSTIC_MUSE
  #316 = Fieldref           #1.#317       // ext/mods/gameserver/enums/actors/ClassId.ELEMENTAL_MASTER:Lext/mods/gameserver/enums/actors/ClassId;
  #317 = NameAndType        #318:#6       // ELEMENTAL_MASTER:Lext/mods/gameserver/enums/actors/ClassId;
  #318 = Utf8               ELEMENTAL_MASTER
  #319 = Fieldref           #1.#320       // ext/mods/gameserver/enums/actors/ClassId.EVAS_SAINT:Lext/mods/gameserver/enums/actors/ClassId;
  #320 = NameAndType        #321:#6       // EVAS_SAINT:Lext/mods/gameserver/enums/actors/ClassId;
  #321 = Utf8               EVAS_SAINT
  #322 = Fieldref           #1.#323       // ext/mods/gameserver/enums/actors/ClassId.SHILLIEN_TEMPLAR:Lext/mods/gameserver/enums/actors/ClassId;
  #323 = NameAndType        #324:#6       // SHILLIEN_TEMPLAR:Lext/mods/gameserver/enums/actors/ClassId;
  #324 = Utf8               SHILLIEN_TEMPLAR
  #325 = Fieldref           #1.#326       // ext/mods/gameserver/enums/actors/ClassId.SPECTRAL_DANCER:Lext/mods/gameserver/enums/actors/ClassId;
  #326 = NameAndType        #327:#6       // SPECTRAL_DANCER:Lext/mods/gameserver/enums/actors/ClassId;
  #327 = Utf8               SPECTRAL_DANCER
  #328 = Fieldref           #1.#329       // ext/mods/gameserver/enums/actors/ClassId.GHOST_HUNTER:Lext/mods/gameserver/enums/actors/ClassId;
  #329 = NameAndType        #330:#6       // GHOST_HUNTER:Lext/mods/gameserver/enums/actors/ClassId;
  #330 = Utf8               GHOST_HUNTER
  #331 = Fieldref           #1.#332       // ext/mods/gameserver/enums/actors/ClassId.GHOST_SENTINEL:Lext/mods/gameserver/enums/actors/ClassId;
  #332 = NameAndType        #333:#6       // GHOST_SENTINEL:Lext/mods/gameserver/enums/actors/ClassId;
  #333 = Utf8               GHOST_SENTINEL
  #334 = Fieldref           #1.#335       // ext/mods/gameserver/enums/actors/ClassId.STORM_SCREAMER:Lext/mods/gameserver/enums/actors/ClassId;
  #335 = NameAndType        #336:#6       // STORM_SCREAMER:Lext/mods/gameserver/enums/actors/ClassId;
  #336 = Utf8               STORM_SCREAMER
  #337 = Fieldref           #1.#338       // ext/mods/gameserver/enums/actors/ClassId.SPECTRAL_MASTER:Lext/mods/gameserver/enums/actors/ClassId;
  #338 = NameAndType        #339:#6       // SPECTRAL_MASTER:Lext/mods/gameserver/enums/actors/ClassId;
  #339 = Utf8               SPECTRAL_MASTER
  #340 = Fieldref           #1.#341       // ext/mods/gameserver/enums/actors/ClassId.SHILLIEN_SAINT:Lext/mods/gameserver/enums/actors/ClassId;
  #341 = NameAndType        #342:#6       // SHILLIEN_SAINT:Lext/mods/gameserver/enums/actors/ClassId;
  #342 = Utf8               SHILLIEN_SAINT
  #343 = Fieldref           #1.#344       // ext/mods/gameserver/enums/actors/ClassId.TITAN:Lext/mods/gameserver/enums/actors/ClassId;
  #344 = NameAndType        #345:#6       // TITAN:Lext/mods/gameserver/enums/actors/ClassId;
  #345 = Utf8               TITAN
  #346 = Fieldref           #1.#347       // ext/mods/gameserver/enums/actors/ClassId.GRAND_KHAVATARI:Lext/mods/gameserver/enums/actors/ClassId;
  #347 = NameAndType        #348:#6       // GRAND_KHAVATARI:Lext/mods/gameserver/enums/actors/ClassId;
  #348 = Utf8               GRAND_KHAVATARI
  #349 = Fieldref           #1.#350       // ext/mods/gameserver/enums/actors/ClassId.DOMINATOR:Lext/mods/gameserver/enums/actors/ClassId;
  #350 = NameAndType        #351:#6       // DOMINATOR:Lext/mods/gameserver/enums/actors/ClassId;
  #351 = Utf8               DOMINATOR
  #352 = Fieldref           #1.#353       // ext/mods/gameserver/enums/actors/ClassId.DOOMCRYER:Lext/mods/gameserver/enums/actors/ClassId;
  #353 = NameAndType        #354:#6       // DOOMCRYER:Lext/mods/gameserver/enums/actors/ClassId;
  #354 = Utf8               DOOMCRYER
  #355 = Fieldref           #1.#356       // ext/mods/gameserver/enums/actors/ClassId.FORTUNE_SEEKER:Lext/mods/gameserver/enums/actors/ClassId;
  #356 = NameAndType        #357:#6       // FORTUNE_SEEKER:Lext/mods/gameserver/enums/actors/ClassId;
  #357 = Utf8               FORTUNE_SEEKER
  #358 = Fieldref           #1.#359       // ext/mods/gameserver/enums/actors/ClassId.MAESTRO:Lext/mods/gameserver/enums/actors/ClassId;
  #359 = NameAndType        #360:#6       // MAESTRO:Lext/mods/gameserver/enums/actors/ClassId;
  #360 = Utf8               MAESTRO
  #361 = Fieldref           #1.#362       // ext/mods/gameserver/enums/actors/ClassId.$VALUES:[Lext/mods/gameserver/enums/actors/ClassId;
  #362 = NameAndType        #363:#364     // $VALUES:[Lext/mods/gameserver/enums/actors/ClassId;
  #363 = Utf8               $VALUES
  #364 = Utf8               [Lext/mods/gameserver/enums/actors/ClassId;
  #365 = Methodref          #366.#367     // "[Lext/mods/gameserver/enums/actors/ClassId;".clone:()Ljava/lang/Object;
  #366 = Class              #364          // "[Lext/mods/gameserver/enums/actors/ClassId;"
  #367 = NameAndType        #368:#369     // clone:()Ljava/lang/Object;
  #368 = Utf8               clone
  #369 = Utf8               ()Ljava/lang/Object;
  #370 = Methodref          #371.#372     // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #371 = Class              #373          // java/lang/Enum
  #372 = NameAndType        #374:#375     // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #373 = Utf8               java/lang/Enum
  #374 = Utf8               valueOf
  #375 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #376 = Methodref          #371.#377     // java/lang/Enum."<init>":(Ljava/lang/String;I)V
  #377 = NameAndType        #378:#379     // "<init>":(Ljava/lang/String;I)V
  #378 = Utf8               <init>
  #379 = Utf8               (Ljava/lang/String;I)V
  #380 = Methodref          #1.#381       // ext/mods/gameserver/enums/actors/ClassId.ordinal:()I
  #381 = NameAndType        #382:#383     // ordinal:()I
  #382 = Utf8               ordinal
  #383 = Utf8               ()I
  #384 = Fieldref           #1.#385       // ext/mods/gameserver/enums/actors/ClassId._id:I
  #385 = NameAndType        #386:#387     // _id:I
  #386 = Utf8               _id
  #387 = Utf8               I
  #388 = Fieldref           #1.#389       // ext/mods/gameserver/enums/actors/ClassId._race:Lext/mods/gameserver/enums/actors/ClassRace;
  #389 = NameAndType        #390:#391     // _race:Lext/mods/gameserver/enums/actors/ClassRace;
  #390 = Utf8               _race
  #391 = Utf8               Lext/mods/gameserver/enums/actors/ClassRace;
  #392 = Fieldref           #1.#393       // ext/mods/gameserver/enums/actors/ClassId._type:Lext/mods/gameserver/enums/actors/ClassType;
  #393 = NameAndType        #394:#395     // _type:Lext/mods/gameserver/enums/actors/ClassType;
  #394 = Utf8               _type
  #395 = Utf8               Lext/mods/gameserver/enums/actors/ClassType;
  #396 = Fieldref           #1.#397       // ext/mods/gameserver/enums/actors/ClassId._level:I
  #397 = NameAndType        #398:#387     // _level:I
  #398 = Utf8               _level
  #399 = Fieldref           #1.#400       // ext/mods/gameserver/enums/actors/ClassId._name:Ljava/lang/String;
  #400 = NameAndType        #401:#402     // _name:Ljava/lang/String;
  #401 = Utf8               _name
  #402 = Utf8               Ljava/lang/String;
  #403 = Fieldref           #1.#404       // ext/mods/gameserver/enums/actors/ClassId._parent:Lext/mods/gameserver/enums/actors/ClassId;
  #404 = NameAndType        #405:#6       // _parent:Lext/mods/gameserver/enums/actors/ClassId;
  #405 = Utf8               _parent
  #406 = Methodref          #1.#407       // ext/mods/gameserver/enums/actors/ClassId.isChildOf:(Lext/mods/gameserver/enums/actors/ClassId;)Z
  #407 = NameAndType        #408:#409     // isChildOf:(Lext/mods/gameserver/enums/actors/ClassId;)Z
  #408 = Utf8               isChildOf
  #409 = Utf8               (Lext/mods/gameserver/enums/actors/ClassId;)Z
  #410 = Fieldref           #1.#411       // ext/mods/gameserver/enums/actors/ClassId._subclasses:Ljava/util/EnumSet;
  #411 = NameAndType        #412:#413     // _subclasses:Ljava/util/EnumSet;
  #412 = Utf8               _subclasses
  #413 = Utf8               Ljava/util/EnumSet;
  #414 = Methodref          #415.#416     // java/util/EnumSet.noneOf:(Ljava/lang/Class;)Ljava/util/EnumSet;
  #415 = Class              #417          // java/util/EnumSet
  #416 = NameAndType        #418:#419     // noneOf:(Ljava/lang/Class;)Ljava/util/EnumSet;
  #417 = Utf8               java/util/EnumSet
  #418 = Utf8               noneOf
  #419 = Utf8               (Ljava/lang/Class;)Ljava/util/EnumSet;
  #420 = Fieldref           #1.#421       // ext/mods/gameserver/enums/actors/ClassId.VALUES:[Lext/mods/gameserver/enums/actors/ClassId;
  #421 = NameAndType        #422:#364     // VALUES:[Lext/mods/gameserver/enums/actors/ClassId;
  #422 = Utf8               VALUES
  #423 = Fieldref           #424.#425     // ext/mods/Config.CLASS_OVERLORD:Z
  #424 = Class              #426          // ext/mods/Config
  #425 = NameAndType        #427:#428     // CLASS_OVERLORD:Z
  #426 = Utf8               ext/mods/Config
  #427 = Utf8               CLASS_OVERLORD
  #428 = Utf8               Z
  #429 = Fieldref           #424.#430     // ext/mods/Config.RACE_ELF:Z
  #430 = NameAndType        #431:#428     // RACE_ELF:Z
  #431 = Utf8               RACE_ELF
  #432 = Fieldref           #433.#434     // ext/mods/gameserver/enums/actors/ClassRace.ELF:Lext/mods/gameserver/enums/actors/ClassRace;
  #433 = Class              #435          // ext/mods/gameserver/enums/actors/ClassRace
  #434 = NameAndType        #436:#391     // ELF:Lext/mods/gameserver/enums/actors/ClassRace;
  #435 = Utf8               ext/mods/gameserver/enums/actors/ClassRace
  #436 = Utf8               ELF
  #437 = Fieldref           #433.#438     // ext/mods/gameserver/enums/actors/ClassRace.DARK_ELF:Lext/mods/gameserver/enums/actors/ClassRace;
  #438 = NameAndType        #439:#391     // DARK_ELF:Lext/mods/gameserver/enums/actors/ClassRace;
  #439 = Utf8               DARK_ELF
  #440 = Methodref          #415.#441     // java/util/EnumSet.add:(Ljava/lang/Object;)Z
  #441 = NameAndType        #442:#443     // add:(Ljava/lang/Object;)Z
  #442 = Utf8               add
  #443 = Utf8               (Ljava/lang/Object;)Z
  #444 = Fieldref           #424.#445     // ext/mods/Config.RESTRICTED_CLASSES:Z
  #445 = NameAndType        #446:#428     // RESTRICTED_CLASSES:Z
  #446 = Utf8               RESTRICTED_CLASSES
  #447 = Methodref          #415.#448     // java/util/EnumSet.of:(Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;
  #448 = NameAndType        #449:#450     // of:(Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;
  #449 = Utf8               of
  #450 = Utf8               (Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;
  #451 = Methodref          #415.#452     // java/util/EnumSet.removeAll:(Ljava/util/Collection;)Z
  #452 = NameAndType        #453:#454     // removeAll:(Ljava/util/Collection;)Z
  #453 = Utf8               removeAll
  #454 = Utf8               (Ljava/util/Collection;)Z
  #455 = Methodref          #415.#456     // java/util/EnumSet.of:(Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;
  #456 = NameAndType        #449:#457     // of:(Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;
  #457 = Utf8               (Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;
  #458 = Methodref          #459.#460     // ext/mods/gameserver/model/actor/Player.getBaseClass:()I
  #459 = Class              #461          // ext/mods/gameserver/model/actor/Player
  #460 = NameAndType        #462:#383     // getBaseClass:()I
  #461 = Utf8               ext/mods/gameserver/model/actor/Player
  #462 = Utf8               getBaseClass
  #463 = Methodref          #464.#465     // java/util/Collections.emptySet:()Ljava/util/Set;
  #464 = Class              #466          // java/util/Collections
  #465 = NameAndType        #467:#468     // emptySet:()Ljava/util/Set;
  #466 = Utf8               java/util/Collections
  #467 = Utf8               emptySet
  #468 = Utf8               ()Ljava/util/Set;
  #469 = Methodref          #415.#470     // java/util/EnumSet.copyOf:(Ljava/util/EnumSet;)Ljava/util/EnumSet;
  #470 = NameAndType        #471:#472     // copyOf:(Ljava/util/EnumSet;)Ljava/util/EnumSet;
  #471 = Utf8               copyOf
  #472 = Utf8               (Ljava/util/EnumSet;)Ljava/util/EnumSet;
  #473 = Methodref          #474.#475     // java/lang/String.hashCode:()I
  #474 = Class              #476          // java/lang/String
  #475 = NameAndType        #477:#383     // hashCode:()I
  #476 = Utf8               java/lang/String
  #477 = Utf8               hashCode
  #478 = String             #479          // @attacker_group
  #479 = Utf8               @attacker_group
  #480 = Methodref          #474.#481     // java/lang/String.equals:(Ljava/lang/Object;)Z
  #481 = NameAndType        #482:#443     // equals:(Ljava/lang/Object;)Z
  #482 = Utf8               equals
  #483 = String             #484          // @fighter_group
  #484 = Utf8               @fighter_group
  #485 = String             #486          // @mage_group
  #486 = Utf8               @mage_group
  #487 = String             #488          // @wizard_group
  #488 = Utf8               @wizard_group
  #489 = String             #490          // @cleric_group
  #490 = Utf8               @cleric_group
  #491 = String             #492          // @subjob_group_knight
  #492 = Utf8               @subjob_group_knight
  #493 = Fieldref           #1.#494       // ext/mods/gameserver/enums/actors/ClassId.ATTACKER_GROUP:Ljava/util/Set;
  #494 = NameAndType        #495:#496     // ATTACKER_GROUP:Ljava/util/Set;
  #495 = Utf8               ATTACKER_GROUP
  #496 = Utf8               Ljava/util/Set;
  #497 = Methodref          #459.#498     // ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
  #498 = NameAndType        #499:#500     // getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
  #499 = Utf8               getClassId
  #500 = Utf8               ()Lext/mods/gameserver/enums/actors/ClassId;
  #501 = InterfaceMethodref #502.#503     // java/util/Set.contains:(Ljava/lang/Object;)Z
  #502 = Class              #504          // java/util/Set
  #503 = NameAndType        #505:#443     // contains:(Ljava/lang/Object;)Z
  #504 = Utf8               java/util/Set
  #505 = Utf8               contains
  #506 = Fieldref           #1.#507       // ext/mods/gameserver/enums/actors/ClassId.FIGHTER_GROUP:Ljava/util/Set;
  #507 = NameAndType        #508:#496     // FIGHTER_GROUP:Ljava/util/Set;
  #508 = Utf8               FIGHTER_GROUP
  #509 = Fieldref           #1.#510       // ext/mods/gameserver/enums/actors/ClassId.MAGE_GROUP:Ljava/util/Set;
  #510 = NameAndType        #511:#496     // MAGE_GROUP:Ljava/util/Set;
  #511 = Utf8               MAGE_GROUP
  #512 = Fieldref           #1.#513       // ext/mods/gameserver/enums/actors/ClassId.WIZARD_GROUP:Ljava/util/Set;
  #513 = NameAndType        #514:#496     // WIZARD_GROUP:Ljava/util/Set;
  #514 = Utf8               WIZARD_GROUP
  #515 = Fieldref           #1.#516       // ext/mods/gameserver/enums/actors/ClassId.CLERIC_GROUP:Ljava/util/Set;
  #516 = NameAndType        #517:#496     // CLERIC_GROUP:Ljava/util/Set;
  #517 = Utf8               CLERIC_GROUP
  #518 = Fieldref           #1.#519       // ext/mods/gameserver/enums/actors/ClassId.SUBJOB_KNIGHT_GROUP:Ljava/util/Set;
  #519 = NameAndType        #520:#496     // SUBJOB_KNIGHT_GROUP:Ljava/util/Set;
  #520 = Utf8               SUBJOB_KNIGHT_GROUP
  #521 = String             #522          // @fighter
  #522 = Utf8               @fighter
  #523 = String             #524          // @mage
  #524 = Utf8               @mage
  #525 = String             #526          // @swordsinger
  #526 = Utf8               @swordsinger
  #527 = String             #528          // @elven_wizard
  #528 = Utf8               @elven_wizard
  #529 = String             #5            // HUMAN_FIGHTER
  #530 = Fieldref           #433.#531     // ext/mods/gameserver/enums/actors/ClassRace.HUMAN:Lext/mods/gameserver/enums/actors/ClassRace;
  #531 = NameAndType        #532:#391     // HUMAN:Lext/mods/gameserver/enums/actors/ClassRace;
  #532 = Utf8               HUMAN
  #533 = Fieldref           #534.#535     // ext/mods/gameserver/enums/actors/ClassType.FIGHTER:Lext/mods/gameserver/enums/actors/ClassType;
  #534 = Class              #536          // ext/mods/gameserver/enums/actors/ClassType
  #535 = NameAndType        #537:#395     // FIGHTER:Lext/mods/gameserver/enums/actors/ClassType;
  #536 = Utf8               ext/mods/gameserver/enums/actors/ClassType
  #537 = Utf8               FIGHTER
  #538 = String             #539          // Human Fighter
  #539 = Utf8               Human Fighter
  #540 = Methodref          #1.#541       // ext/mods/gameserver/enums/actors/ClassId."<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
  #541 = NameAndType        #378:#542     // "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
  #542 = Utf8               (Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
  #543 = String             #9            // WARRIOR
  #544 = String             #545          // Warrior
  #545 = Utf8               Warrior
  #546 = String             #12           // GLADIATOR
  #547 = String             #548          // Gladiator
  #548 = Utf8               Gladiator
  #549 = String             #15           // WARLORD
  #550 = String             #551          // Warlord
  #551 = Utf8               Warlord
  #552 = String             #18           // KNIGHT
  #553 = String             #554          // Human Knight
  #554 = Utf8               Human Knight
  #555 = String             #21           // PALADIN
  #556 = String             #557          // Paladin
  #557 = Utf8               Paladin
  #558 = String             #24           // DARK_AVENGER
  #559 = String             #560          // Dark Avenger
  #560 = Utf8               Dark Avenger
  #561 = String             #27           // ROGUE
  #562 = String             #563          // Rogue
  #563 = Utf8               Rogue
  #564 = String             #30           // TREASURE_HUNTER
  #565 = String             #566          // Treasure Hunter
  #566 = Utf8               Treasure Hunter
  #567 = String             #33           // HAWKEYE
  #568 = String             #569          // Hawkeye
  #569 = Utf8               Hawkeye
  #570 = String             #36           // HUMAN_MYSTIC
  #571 = Fieldref           #534.#572     // ext/mods/gameserver/enums/actors/ClassType.MYSTIC:Lext/mods/gameserver/enums/actors/ClassType;
  #572 = NameAndType        #573:#395     // MYSTIC:Lext/mods/gameserver/enums/actors/ClassType;
  #573 = Utf8               MYSTIC
  #574 = String             #575          // Human Mystic
  #575 = Utf8               Human Mystic
  #576 = String             #39           // HUMAN_WIZARD
  #577 = String             #578          // Human Wizard
  #578 = Utf8               Human Wizard
  #579 = String             #42           // SORCERER
  #580 = String             #581          // Sorcerer
  #581 = Utf8               Sorcerer
  #582 = String             #45           // NECROMANCER
  #583 = String             #584          // Necromancer
  #584 = Utf8               Necromancer
  #585 = String             #48           // WARLOCK
  #586 = String             #587          // Warlock
  #587 = Utf8               Warlock
  #588 = String             #51           // CLERIC
  #589 = Fieldref           #534.#590     // ext/mods/gameserver/enums/actors/ClassType.PRIEST:Lext/mods/gameserver/enums/actors/ClassType;
  #590 = NameAndType        #591:#395     // PRIEST:Lext/mods/gameserver/enums/actors/ClassType;
  #591 = Utf8               PRIEST
  #592 = String             #593          // Cleric
  #593 = Utf8               Cleric
  #594 = String             #54           // BISHOP
  #595 = String             #596          // Bishop
  #596 = Utf8               Bishop
  #597 = String             #57           // PROPHET
  #598 = String             #599          // Prophet
  #599 = Utf8               Prophet
  #600 = String             #60           // ELVEN_FIGHTER
  #601 = String             #602          // Elven Fighter
  #602 = Utf8               Elven Fighter
  #603 = String             #63           // ELVEN_KNIGHT
  #604 = String             #605          // Elven Knight
  #605 = Utf8               Elven Knight
  #606 = String             #66           // TEMPLE_KNIGHT
  #607 = String             #608          // Temple Knight
  #608 = Utf8               Temple Knight
  #609 = String             #69           // SWORD_SINGER
  #610 = String             #611          // Sword Singer
  #611 = Utf8               Sword Singer
  #612 = String             #72           // ELVEN_SCOUT
  #613 = String             #614          // Elven Scout
  #614 = Utf8               Elven Scout
  #615 = String             #75           // PLAINS_WALKER
  #616 = String             #617          // Plains Walker
  #617 = Utf8               Plains Walker
  #618 = String             #78           // SILVER_RANGER
  #619 = String             #620          // Silver Ranger
  #620 = Utf8               Silver Ranger
  #621 = String             #81           // ELVEN_MYSTIC
  #622 = String             #623          // Elven Mystic
  #623 = Utf8               Elven Mystic
  #624 = String             #84           // ELVEN_WIZARD
  #625 = String             #626          // Elven Wizard
  #626 = Utf8               Elven Wizard
  #627 = String             #87           // SPELLSINGER
  #628 = String             #629          // Spellsinger
  #629 = Utf8               Spellsinger
  #630 = String             #90           // ELEMENTAL_SUMMONER
  #631 = String             #632          // Elemental Summoner
  #632 = Utf8               Elemental Summoner
  #633 = String             #93           // ELVEN_ORACLE
  #634 = String             #635          // Elven Oracle
  #635 = Utf8               Elven Oracle
  #636 = String             #96           // ELVEN_ELDER
  #637 = String             #638          // Elven Elder
  #638 = Utf8               Elven Elder
  #639 = String             #99           // DARK_FIGHTER
  #640 = String             #641          // Dark Fighter
  #641 = Utf8               Dark Fighter
  #642 = String             #102          // PALUS_KNIGHT
  #643 = String             #644          // Palus Knight
  #644 = Utf8               Palus Knight
  #645 = String             #105          // SHILLIEN_KNIGHT
  #646 = String             #647          // Shillien Knight
  #647 = Utf8               Shillien Knight
  #648 = String             #108          // BLADEDANCER
  #649 = String             #650          // Bladedancer
  #650 = Utf8               Bladedancer
  #651 = String             #111          // ASSASSIN
  #652 = String             #653          // Assassin
  #653 = Utf8               Assassin
  #654 = String             #114          // ABYSS_WALKER
  #655 = String             #656          // Abyss Walker
  #656 = Utf8               Abyss Walker
  #657 = String             #117          // PHANTOM_RANGER
  #658 = String             #659          // Phantom Ranger
  #659 = Utf8               Phantom Ranger
  #660 = String             #120          // DARK_MYSTIC
  #661 = String             #662          // Dark Mystic
  #662 = Utf8               Dark Mystic
  #663 = String             #123          // DARK_WIZARD
  #664 = String             #665          // Dark Wizard
  #665 = Utf8               Dark Wizard
  #666 = String             #126          // SPELLHOWLER
  #667 = String             #668          // Spellhowler
  #668 = Utf8               Spellhowler
  #669 = String             #129          // PHANTOM_SUMMONER
  #670 = String             #671          // Phantom Summoner
  #671 = Utf8               Phantom Summoner
  #672 = String             #132          // SHILLIEN_ORACLE
  #673 = String             #674          // Shillien Oracle
  #674 = Utf8               Shillien Oracle
  #675 = String             #135          // SHILLIEN_ELDER
  #676 = String             #677          // Shillien Elder
  #677 = Utf8               Shillien Elder
  #678 = String             #138          // ORC_FIGHTER
  #679 = Fieldref           #433.#680     // ext/mods/gameserver/enums/actors/ClassRace.ORC:Lext/mods/gameserver/enums/actors/ClassRace;
  #680 = NameAndType        #681:#391     // ORC:Lext/mods/gameserver/enums/actors/ClassRace;
  #681 = Utf8               ORC
  #682 = String             #683          // Orc Fighter
  #683 = Utf8               Orc Fighter
  #684 = String             #141          // ORC_RAIDER
  #685 = String             #686          // Orc Raider
  #686 = Utf8               Orc Raider
  #687 = String             #144          // DESTROYER
  #688 = String             #689          // Destroyer
  #689 = Utf8               Destroyer
  #690 = String             #147          // MONK
  #691 = String             #692          // Monk
  #692 = Utf8               Monk
  #693 = String             #150          // TYRANT
  #694 = String             #695          // Tyrant
  #695 = Utf8               Tyrant
  #696 = String             #153          // ORC_MYSTIC
  #697 = String             #698          // Orc Mystic
  #698 = Utf8               Orc Mystic
  #699 = String             #156          // ORC_SHAMAN
  #700 = String             #701          // Orc Shaman
  #701 = Utf8               Orc Shaman
  #702 = String             #159          // OVERLORD
  #703 = String             #704          // Overlord
  #704 = Utf8               Overlord
  #705 = String             #162          // WARCRYER
  #706 = String             #707          // Warcryer
  #707 = Utf8               Warcryer
  #708 = String             #165          // DWARVEN_FIGHTER
  #709 = Fieldref           #433.#710     // ext/mods/gameserver/enums/actors/ClassRace.DWARF:Lext/mods/gameserver/enums/actors/ClassRace;
  #710 = NameAndType        #711:#391     // DWARF:Lext/mods/gameserver/enums/actors/ClassRace;
  #711 = Utf8               DWARF
  #712 = String             #713          // Dwarven Fighter
  #713 = Utf8               Dwarven Fighter
  #714 = String             #168          // SCAVENGER
  #715 = String             #716          // Scavenger
  #716 = Utf8               Scavenger
  #717 = String             #171          // BOUNTY_HUNTER
  #718 = String             #719          // Bounty Hunter
  #719 = Utf8               Bounty Hunter
  #720 = String             #174          // ARTISAN
  #721 = String             #722          // Artisan
  #722 = Utf8               Artisan
  #723 = String             #177          // WARSMITH
  #724 = String             #725          // Warsmith
  #725 = Utf8               Warsmith
  #726 = String             #180          // DUMMY_1
  #727 = String             #728          // dummy 1
  #728 = Utf8               dummy 1
  #729 = String             #183          // DUMMY_2
  #730 = String             #731          // dummy 2
  #731 = Utf8               dummy 2
  #732 = String             #186          // DUMMY_3
  #733 = String             #734          // dummy 3
  #734 = Utf8               dummy 3
  #735 = String             #189          // DUMMY_4
  #736 = String             #737          // dummy 4
  #737 = Utf8               dummy 4
  #738 = String             #192          // DUMMY_5
  #739 = String             #740          // dummy 5
  #740 = Utf8               dummy 5
  #741 = String             #195          // DUMMY_6
  #742 = String             #743          // dummy 6
  #743 = Utf8               dummy 6
  #744 = String             #198          // DUMMY_7
  #745 = String             #746          // dummy 7
  #746 = Utf8               dummy 7
  #747 = String             #201          // DUMMY_8
  #748 = String             #749          // dummy 8
  #749 = Utf8               dummy 8
  #750 = String             #204          // DUMMY_9
  #751 = String             #752          // dummy 9
  #752 = Utf8               dummy 9
  #753 = String             #207          // DUMMY_10
  #754 = String             #755          // dummy 10
  #755 = Utf8               dummy 10
  #756 = String             #210          // DUMMY_11
  #757 = String             #758          // dummy 11
  #758 = Utf8               dummy 11
  #759 = String             #213          // DUMMY_12
  #760 = String             #761          // dummy 12
  #761 = Utf8               dummy 12
  #762 = String             #216          // DUMMY_13
  #763 = String             #764          // dummy 13
  #764 = Utf8               dummy 13
  #765 = String             #219          // DUMMY_14
  #766 = String             #767          // dummy 14
  #767 = Utf8               dummy 14
  #768 = String             #222          // DUMMY_15
  #769 = String             #770          // dummy 15
  #770 = Utf8               dummy 15
  #771 = String             #225          // DUMMY_16
  #772 = String             #773          // dummy 16
  #773 = Utf8               dummy 16
  #774 = String             #228          // DUMMY_17
  #775 = String             #776          // dummy 17
  #776 = Utf8               dummy 17
  #777 = String             #231          // DUMMY_18
  #778 = String             #779          // dummy 18
  #779 = Utf8               dummy 18
  #780 = String             #234          // DUMMY_19
  #781 = String             #782          // dummy 19
  #782 = Utf8               dummy 19
  #783 = String             #237          // DUMMY_20
  #784 = String             #785          // dummy 20
  #785 = Utf8               dummy 20
  #786 = String             #240          // DUMMY_21
  #787 = String             #788          // dummy 21
  #788 = Utf8               dummy 21
  #789 = String             #243          // DUMMY_22
  #790 = String             #791          // dummy 22
  #791 = Utf8               dummy 22
  #792 = String             #246          // DUMMY_23
  #793 = String             #794          // dummy 23
  #794 = Utf8               dummy 23
  #795 = String             #249          // DUMMY_24
  #796 = String             #797          // dummy 24
  #797 = Utf8               dummy 24
  #798 = String             #252          // DUMMY_25
  #799 = String             #800          // dummy 25
  #800 = Utf8               dummy 25
  #801 = String             #255          // DUMMY_26
  #802 = String             #803          // dummy 26
  #803 = Utf8               dummy 26
  #804 = String             #258          // DUMMY_27
  #805 = String             #806          // dummy 27
  #806 = Utf8               dummy 27
  #807 = String             #261          // DUMMY_28
  #808 = String             #809          // dummy 28
  #809 = Utf8               dummy 28
  #810 = String             #264          // DUMMY_29
  #811 = String             #812          // dummy 29
  #812 = Utf8               dummy 29
  #813 = String             #267          // DUMMY_30
  #814 = String             #815          // dummy 30
  #815 = Utf8               dummy 30
  #816 = String             #270          // DUELIST
  #817 = String             #818          // Duelist
  #818 = Utf8               Duelist
  #819 = String             #273          // DREADNOUGHT
  #820 = String             #821          // Dreadnought
  #821 = Utf8               Dreadnought
  #822 = String             #276          // PHOENIX_KNIGHT
  #823 = String             #824          // Phoenix Knight
  #824 = Utf8               Phoenix Knight
  #825 = String             #279          // HELL_KNIGHT
  #826 = String             #827          // Hell Knight
  #827 = Utf8               Hell Knight
  #828 = String             #282          // SAGGITARIUS
  #829 = String             #830          // Sagittarius
  #830 = Utf8               Sagittarius
  #831 = String             #285          // ADVENTURER
  #832 = String             #833          // Adventurer
  #833 = Utf8               Adventurer
  #834 = String             #288          // ARCHMAGE
  #835 = String             #836          // Archmage
  #836 = Utf8               Archmage
  #837 = String             #291          // SOULTAKER
  #838 = String             #839          // Soultaker
  #839 = Utf8               Soultaker
  #840 = String             #294          // ARCANA_LORD
  #841 = String             #842          // Arcana Lord
  #842 = Utf8               Arcana Lord
  #843 = String             #297          // CARDINAL
  #844 = String             #845          // Cardinal
  #845 = Utf8               Cardinal
  #846 = String             #300          // HIEROPHANT
  #847 = String             #848          // Hierophant
  #848 = Utf8               Hierophant
  #849 = String             #303          // EVAS_TEMPLAR
  #850 = String             #851          // Eva\'s Templar
  #851 = Utf8               Eva\'s Templar
  #852 = String             #306          // SWORD_MUSE
  #853 = String             #854          // Sword Muse
  #854 = Utf8               Sword Muse
  #855 = String             #309          // WIND_RIDER
  #856 = String             #857          // Wind Rider
  #857 = Utf8               Wind Rider
  #858 = String             #312          // MOONLIGHT_SENTINEL
  #859 = String             #860          // Moonlight Sentinel
  #860 = Utf8               Moonlight Sentinel
  #861 = String             #315          // MYSTIC_MUSE
  #862 = String             #863          // Mystic Muse
  #863 = Utf8               Mystic Muse
  #864 = String             #318          // ELEMENTAL_MASTER
  #865 = String             #866          // Elemental Master
  #866 = Utf8               Elemental Master
  #867 = String             #321          // EVAS_SAINT
  #868 = String             #869          // Eva\'s Saint
  #869 = Utf8               Eva\'s Saint
  #870 = String             #324          // SHILLIEN_TEMPLAR
  #871 = String             #872          // Shillien Templar
  #872 = Utf8               Shillien Templar
  #873 = String             #327          // SPECTRAL_DANCER
  #874 = String             #875          // Spectral Dancer
  #875 = Utf8               Spectral Dancer
  #876 = String             #330          // GHOST_HUNTER
  #877 = String             #878          // Ghost Hunter
  #878 = Utf8               Ghost Hunter
  #879 = String             #333          // GHOST_SENTINEL
  #880 = String             #881          // Ghost Sentinel
  #881 = Utf8               Ghost Sentinel
  #882 = String             #336          // STORM_SCREAMER
  #883 = String             #884          // Storm Screamer
  #884 = Utf8               Storm Screamer
  #885 = String             #339          // SPECTRAL_MASTER
  #886 = String             #887          // Spectral Master
  #887 = Utf8               Spectral Master
  #888 = String             #342          // SHILLIEN_SAINT
  #889 = String             #890          // Shillien Saint
  #890 = Utf8               Shillien Saint
  #891 = String             #345          // TITAN
  #892 = String             #893          // Titan
  #893 = Utf8               Titan
  #894 = String             #348          // GRAND_KHAVATARI
  #895 = String             #896          // Grand Khavatari
  #896 = Utf8               Grand Khavatari
  #897 = String             #351          // DOMINATOR
  #898 = String             #899          // Dominator
  #899 = Utf8               Dominator
  #900 = String             #354          // DOOMCRYER
  #901 = String             #902          // Doom Cryer
  #902 = Utf8               Doom Cryer
  #903 = String             #357          // FORTUNE_SEEKER
  #904 = String             #905          // Fortune Seeker
  #905 = Utf8               Fortune Seeker
  #906 = String             #360          // MAESTRO
  #907 = String             #908          // Maestro
  #908 = Utf8               Maestro
  #909 = Methodref          #1.#910       // ext/mods/gameserver/enums/actors/ClassId.$values:()[Lext/mods/gameserver/enums/actors/ClassId;
  #910 = NameAndType        #911:#912     // $values:()[Lext/mods/gameserver/enums/actors/ClassId;
  #911 = Utf8               $values
  #912 = Utf8               ()[Lext/mods/gameserver/enums/actors/ClassId;
  #913 = Methodref          #1.#914       // ext/mods/gameserver/enums/actors/ClassId.values:()[Lext/mods/gameserver/enums/actors/ClassId;
  #914 = NameAndType        #915:#912     // values:()[Lext/mods/gameserver/enums/actors/ClassId;
  #915 = Utf8               values
  #916 = Methodref          #415.#917     // java/util/EnumSet.of:(Ljava/lang/Enum;[Ljava/lang/Enum;)Ljava/util/EnumSet;
  #917 = NameAndType        #449:#918     // of:(Ljava/lang/Enum;[Ljava/lang/Enum;)Ljava/util/EnumSet;
  #918 = Utf8               (Ljava/lang/Enum;[Ljava/lang/Enum;)Ljava/util/EnumSet;
  #919 = Methodref          #1.#920       // ext/mods/gameserver/enums/actors/ClassId.createSubclasses:()V
  #920 = NameAndType        #921:#922     // createSubclasses:()V
  #921 = Utf8               createSubclasses
  #922 = Utf8               ()V
  #923 = Utf8               Signature
  #924 = Utf8               Ljava/util/Set<Lext/mods/gameserver/enums/actors/ClassId;>;
  #925 = Utf8               Ljava/util/EnumSet<Lext/mods/gameserver/enums/actors/ClassId;>;
  #926 = Utf8               Code
  #927 = Utf8               LineNumberTable
  #928 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/enums/actors/ClassId;
  #929 = Utf8               LocalVariableTable
  #930 = Utf8               name
  #931 = Utf8               MethodParameters
  #932 = Utf8               this
  #933 = Utf8               race
  #934 = Utf8               type
  #935 = Utf8               level
  #936 = Utf8               parent
  #937 = Utf8               (Lext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
  #938 = Utf8               toString
  #939 = Utf8               ()Ljava/lang/String;
  #940 = Utf8               getId
  #941 = Utf8               getRace
  #942 = Utf8               ()Lext/mods/gameserver/enums/actors/ClassRace;
  #943 = Utf8               getType
  #944 = Utf8               ()Lext/mods/gameserver/enums/actors/ClassType;
  #945 = Utf8               getLevel
  #946 = Utf8               getParent
  #947 = Utf8               classId
  #948 = Utf8               StackMapTable
  #949 = Utf8               equalsOrIsChildOf
  #950 = Utf8               getAvailableSubclasses
  #951 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/util/Set;
  #952 = Utf8               player
  #953 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #954 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/util/Set<Lext/mods/gameserver/enums/actors/ClassId;>;
  #955 = Utf8               isInGroup
  #956 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
  #957 = Utf8               occupation
  #958 = Utf8               isSameOccupation
  #959 = Utf8               <clinit>
  #960 = Utf8               Ljava/lang/Enum<Lext/mods/gameserver/enums/actors/ClassId;>;
  #961 = Utf8               SourceFile
  #962 = Utf8               ClassId.java
{
  public static final ext.mods.gameserver.enums.actors.ClassId HUMAN_FIGHTER;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId WARRIOR;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId GLADIATOR;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId WARLORD;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId KNIGHT;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId PALADIN;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId DARK_AVENGER;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId ROGUE;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId TREASURE_HUNTER;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId HAWKEYE;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId HUMAN_MYSTIC;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId HUMAN_WIZARD;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId SORCERER;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId NECROMANCER;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId WARLOCK;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId CLERIC;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId BISHOP;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId PROPHET;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId ELVEN_FIGHTER;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId ELVEN_KNIGHT;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId TEMPLE_KNIGHT;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId SWORD_SINGER;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId ELVEN_SCOUT;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId PLAINS_WALKER;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId SILVER_RANGER;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId ELVEN_MYSTIC;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId ELVEN_WIZARD;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId SPELLSINGER;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId ELEMENTAL_SUMMONER;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId ELVEN_ORACLE;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId ELVEN_ELDER;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId DARK_FIGHTER;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId PALUS_KNIGHT;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId SHILLIEN_KNIGHT;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId BLADEDANCER;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId ASSASSIN;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId ABYSS_WALKER;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId PHANTOM_RANGER;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId DARK_MYSTIC;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId DARK_WIZARD;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId SPELLHOWLER;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId PHANTOM_SUMMONER;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId SHILLIEN_ORACLE;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId SHILLIEN_ELDER;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId ORC_FIGHTER;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId ORC_RAIDER;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId DESTROYER;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId MONK;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId TYRANT;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId ORC_MYSTIC;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId ORC_SHAMAN;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId OVERLORD;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId WARCRYER;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId DWARVEN_FIGHTER;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId SCAVENGER;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId BOUNTY_HUNTER;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId ARTISAN;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId WARSMITH;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId DUMMY_1;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId DUMMY_2;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId DUMMY_3;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId DUMMY_4;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId DUMMY_5;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId DUMMY_6;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId DUMMY_7;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId DUMMY_8;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId DUMMY_9;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId DUMMY_10;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId DUMMY_11;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId DUMMY_12;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId DUMMY_13;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId DUMMY_14;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId DUMMY_15;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId DUMMY_16;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId DUMMY_17;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId DUMMY_18;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId DUMMY_19;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId DUMMY_20;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId DUMMY_21;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId DUMMY_22;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId DUMMY_23;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId DUMMY_24;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId DUMMY_25;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId DUMMY_26;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId DUMMY_27;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId DUMMY_28;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId DUMMY_29;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId DUMMY_30;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId DUELIST;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId DREADNOUGHT;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId PHOENIX_KNIGHT;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId HELL_KNIGHT;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId SAGGITARIUS;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId ADVENTURER;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId ARCHMAGE;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId SOULTAKER;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId ARCANA_LORD;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId CARDINAL;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId HIEROPHANT;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId EVAS_TEMPLAR;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId SWORD_MUSE;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId WIND_RIDER;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId MOONLIGHT_SENTINEL;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId MYSTIC_MUSE;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId ELEMENTAL_MASTER;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId EVAS_SAINT;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId SHILLIEN_TEMPLAR;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId SPECTRAL_DANCER;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId GHOST_HUNTER;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId GHOST_SENTINEL;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId STORM_SCREAMER;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId SPECTRAL_MASTER;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId SHILLIEN_SAINT;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId TITAN;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId GRAND_KHAVATARI;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId DOMINATOR;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId DOOMCRYER;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId FORTUNE_SEEKER;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId MAESTRO;
    descriptor: Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.ClassId[] VALUES;
    descriptor: [Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL

  public static ext.mods.gameserver.enums.actors.ClassId[] values();
    descriptor: ()[Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #361                // Field $VALUES:[Lext/mods/gameserver/enums/actors/ClassId;
         3: invokevirtual #365                // Method "[Lext/mods/gameserver/enums/actors/ClassId;".clone:()Ljava/lang/Object;
         6: checkcast     #366                // class "[Lext/mods/gameserver/enums/actors/ClassId;"
         9: areturn
      LineNumberTable:
        line 36: 0

  public static ext.mods.gameserver.enums.actors.ClassId valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/gameserver/enums/actors/ClassId
         2: aload_0
         3: invokestatic  #370                // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/gameserver/enums/actors/ClassId
         9: areturn
      LineNumberTable:
        line 36: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  name   Ljava/lang/String;
    MethodParameters:
      Name                           Flags
      <no name>                      mandated

  public java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #399                // Field _name:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 202: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/enums/actors/ClassId;

  public final int getId();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #384                // Field _id:I
         4: ireturn
      LineNumberTable:
        line 210: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/enums/actors/ClassId;

  public final ext.mods.gameserver.enums.actors.ClassRace getRace();
    descriptor: ()Lext/mods/gameserver/enums/actors/ClassRace;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #388                // Field _race:Lext/mods/gameserver/enums/actors/ClassRace;
         4: areturn
      LineNumberTable:
        line 218: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/enums/actors/ClassId;

  public final ext.mods.gameserver.enums.actors.ClassType getType();
    descriptor: ()Lext/mods/gameserver/enums/actors/ClassType;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #392                // Field _type:Lext/mods/gameserver/enums/actors/ClassType;
         4: areturn
      LineNumberTable:
        line 226: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/enums/actors/ClassId;

  public final int getLevel();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #396                // Field _level:I
         4: ireturn
      LineNumberTable:
        line 234: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/enums/actors/ClassId;

  public final ext.mods.gameserver.enums.actors.ClassId getParent();
    descriptor: ()Lext/mods/gameserver/enums/actors/ClassId;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #403                // Field _parent:Lext/mods/gameserver/enums/actors/ClassId;
         4: areturn
      LineNumberTable:
        line 242: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/enums/actors/ClassId;

  public final boolean isChildOf(ext.mods.gameserver.enums.actors.ClassId);
    descriptor: (Lext/mods/gameserver/enums/actors/ClassId;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #403                // Field _parent:Lext/mods/gameserver/enums/actors/ClassId;
         4: ifnonnull     9
         7: iconst_0
         8: ireturn
         9: aload_0
        10: getfield      #403                // Field _parent:Lext/mods/gameserver/enums/actors/ClassId;
        13: aload_1
        14: if_acmpne     19
        17: iconst_1
        18: ireturn
        19: aload_0
        20: getfield      #403                // Field _parent:Lext/mods/gameserver/enums/actors/ClassId;
        23: aload_1
        24: invokevirtual #406                // Method isChildOf:(Lext/mods/gameserver/enums/actors/ClassId;)Z
        27: ireturn
      LineNumberTable:
        line 251: 0
        line 252: 7
        line 254: 9
        line 255: 17
        line 257: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lext/mods/gameserver/enums/actors/ClassId;
            0      28     1 classId   Lext/mods/gameserver/enums/actors/ClassId;
      StackMapTable: number_of_entries = 2
        frame_type = 9 /* same */
        frame_type = 9 /* same */

  public final boolean equalsOrIsChildOf(ext.mods.gameserver.enums.actors.ClassId);
    descriptor: (Lext/mods/gameserver/enums/actors/ClassId;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: if_acmpeq     13
         5: aload_0
         6: aload_1
         7: invokevirtual #406                // Method isChildOf:(Lext/mods/gameserver/enums/actors/ClassId;)Z
        10: ifeq          17
        13: iconst_1
        14: goto          18
        17: iconst_0
        18: ireturn
      LineNumberTable:
        line 266: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/enums/actors/ClassId;
            0      19     1 classId   Lext/mods/gameserver/enums/actors/ClassId;
      StackMapTable: number_of_entries = 3
        frame_type = 13 /* same */
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public static final java.util.Set<ext.mods.gameserver.enums.actors.ClassId> getAvailableSubclasses(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Ljava/util/Set;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=1
         0: getstatic     #420                // Field VALUES:[Lext/mods/gameserver/enums/actors/ClassId;
         3: aload_0
         4: invokevirtual #458                // Method ext/mods/gameserver/model/actor/Player.getBaseClass:()I
         7: aaload
         8: astore_1
         9: aload_1
        10: getfield      #396                // Field _level:I
        13: iconst_2
        14: if_icmpge     21
        17: invokestatic  #463                // Method java/util/Collections.emptySet:()Ljava/util/Set;
        20: areturn
        21: aload_1
        22: getfield      #396                // Field _level:I
        25: iconst_3
        26: if_icmpne     34
        29: aload_1
        30: getfield      #403                // Field _parent:Lext/mods/gameserver/enums/actors/ClassId;
        33: astore_1
        34: aload_1
        35: getfield      #410                // Field _subclasses:Ljava/util/EnumSet;
        38: invokestatic  #469                // Method java/util/EnumSet.copyOf:(Ljava/util/EnumSet;)Ljava/util/EnumSet;
        41: areturn
      LineNumberTable:
        line 344: 0
        line 345: 9
        line 346: 17
        line 348: 21
        line 349: 29
        line 351: 34
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      42     0 player   Lext/mods/gameserver/model/actor/Player;
            9      33     1 classId   Lext/mods/gameserver/enums/actors/ClassId;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 21
          locals = [ class ext/mods/gameserver/enums/actors/ClassId ]
        frame_type = 12 /* same */
    Signature: #954                         // (Lext/mods/gameserver/model/actor/Player;)Ljava/util/Set<Lext/mods/gameserver/enums/actors/ClassId;>;

  public static final boolean isInGroup(ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=2, locals=4, args_size=2
         0: aload_0
         1: ifnull        8
         4: aload_1
         5: ifnonnull     10
         8: iconst_0
         9: ireturn
        10: aload_1
        11: astore_2
        12: iconst_m1
        13: istore_3
        14: aload_2
        15: invokevirtual #473                // Method java/lang/String.hashCode:()I
        18: lookupswitch  { // 6

             -1966819280: 136

             -1446697227: 76

             -1127501390: 106

               783970365: 91

              1073469327: 151

              1933787883: 121
                 default: 163
            }
        76: aload_2
        77: ldc_w         #478                // String @attacker_group
        80: invokevirtual #480                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        83: ifeq          163
        86: iconst_0
        87: istore_3
        88: goto          163
        91: aload_2
        92: ldc_w         #483                // String @fighter_group
        95: invokevirtual #480                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        98: ifeq          163
       101: iconst_1
       102: istore_3
       103: goto          163
       106: aload_2
       107: ldc_w         #485                // String @mage_group
       110: invokevirtual #480                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       113: ifeq          163
       116: iconst_2
       117: istore_3
       118: goto          163
       121: aload_2
       122: ldc_w         #487                // String @wizard_group
       125: invokevirtual #480                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       128: ifeq          163
       131: iconst_3
       132: istore_3
       133: goto          163
       136: aload_2
       137: ldc_w         #489                // String @cleric_group
       140: invokevirtual #480                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       143: ifeq          163
       146: iconst_4
       147: istore_3
       148: goto          163
       151: aload_2
       152: ldc_w         #491                // String @subjob_group_knight
       155: invokevirtual #480                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       158: ifeq          163
       161: iconst_5
       162: istore_3
       163: iload_3
       164: tableswitch   { // 0 to 5

                       0: 204

                       1: 217

                       2: 230

                       3: 243

                       4: 256

                       5: 269
                 default: 282
            }
       204: getstatic     #493                // Field ATTACKER_GROUP:Ljava/util/Set;
       207: aload_0
       208: invokevirtual #497                // Method ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
       211: invokeinterface #501,  2          // InterfaceMethod java/util/Set.contains:(Ljava/lang/Object;)Z
       216: ireturn
       217: getstatic     #506                // Field FIGHTER_GROUP:Ljava/util/Set;
       220: aload_0
       221: invokevirtual #497                // Method ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
       224: invokeinterface #501,  2          // InterfaceMethod java/util/Set.contains:(Ljava/lang/Object;)Z
       229: ireturn
       230: getstatic     #509                // Field MAGE_GROUP:Ljava/util/Set;
       233: aload_0
       234: invokevirtual #497                // Method ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
       237: invokeinterface #501,  2          // InterfaceMethod java/util/Set.contains:(Ljava/lang/Object;)Z
       242: ireturn
       243: getstatic     #512                // Field WIZARD_GROUP:Ljava/util/Set;
       246: aload_0
       247: invokevirtual #497                // Method ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
       250: invokeinterface #501,  2          // InterfaceMethod java/util/Set.contains:(Ljava/lang/Object;)Z
       255: ireturn
       256: getstatic     #515                // Field CLERIC_GROUP:Ljava/util/Set;
       259: aload_0
       260: invokevirtual #497                // Method ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
       263: invokeinterface #501,  2          // InterfaceMethod java/util/Set.contains:(Ljava/lang/Object;)Z
       268: ireturn
       269: getstatic     #518                // Field SUBJOB_KNIGHT_GROUP:Ljava/util/Set;
       272: aload_0
       273: invokevirtual #497                // Method ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
       276: invokeinterface #501,  2          // InterfaceMethod java/util/Set.contains:(Ljava/lang/Object;)Z
       281: ireturn
       282: iconst_0
       283: ireturn
      LineNumberTable:
        line 356: 0
        line 357: 8
        line 359: 10
        line 362: 204
        line 365: 217
        line 368: 230
        line 371: 243
        line 374: 256
        line 377: 269
        line 380: 282
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     284     0 player   Lext/mods/gameserver/model/actor/Player;
            0     284     1 occupation   Ljava/lang/String;
      StackMapTable: number_of_entries = 16
        frame_type = 8 /* same */
        frame_type = 1 /* same */
        frame_type = 253 /* append */
          offset_delta = 65
          locals = [ class java/lang/String, int ]
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 11 /* same */
        frame_type = 40 /* same */
        frame_type = 12 /* same */
        frame_type = 12 /* same */
        frame_type = 12 /* same */
        frame_type = 12 /* same */
        frame_type = 12 /* same */
        frame_type = 249 /* chop */
          offset_delta = 12

  public static final boolean isSameOccupation(ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=2, locals=4, args_size=2
         0: aload_0
         1: ifnull        8
         4: aload_1
         5: ifnonnull     10
         8: iconst_0
         9: ireturn
        10: aload_1
        11: astore_2
        12: iconst_m1
        13: istore_3
        14: aload_2
        15: invokevirtual #473                // Method java/lang/String.hashCode:()I
        18: lookupswitch  { // 4

             -1469070798: 105

              -988796803: 60

                62449074: 75

              1566769017: 90
                 default: 117
            }
        60: aload_2
        61: ldc_w         #521                // String @fighter
        64: invokevirtual #480                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        67: ifeq          117
        70: iconst_0
        71: istore_3
        72: goto          117
        75: aload_2
        76: ldc_w         #523                // String @mage
        79: invokevirtual #480                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        82: ifeq          117
        85: iconst_1
        86: istore_3
        87: goto          117
        90: aload_2
        91: ldc_w         #525                // String @swordsinger
        94: invokevirtual #480                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        97: ifeq          117
       100: iconst_2
       101: istore_3
       102: goto          117
       105: aload_2
       106: ldc_w         #527                // String @elven_wizard
       109: invokevirtual #480                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       112: ifeq          117
       115: iconst_3
       116: istore_3
       117: iload_3
       118: tableswitch   { // 0 to 3

                       0: 148

                       1: 164

                       2: 180

                       3: 196
                 default: 212
            }
       148: aload_0
       149: invokevirtual #497                // Method ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
       152: getstatic     #3                  // Field HUMAN_FIGHTER:Lext/mods/gameserver/enums/actors/ClassId;
       155: if_acmpne     162
       158: iconst_1
       159: goto          163
       162: iconst_0
       163: ireturn
       164: aload_0
       165: invokevirtual #497                // Method ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
       168: getstatic     #34                 // Field HUMAN_MYSTIC:Lext/mods/gameserver/enums/actors/ClassId;
       171: if_acmpne     178
       174: iconst_1
       175: goto          179
       178: iconst_0
       179: ireturn
       180: aload_0
       181: invokevirtual #497                // Method ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
       184: getstatic     #67                 // Field SWORD_SINGER:Lext/mods/gameserver/enums/actors/ClassId;
       187: if_acmpne     194
       190: iconst_1
       191: goto          195
       194: iconst_0
       195: ireturn
       196: aload_0
       197: invokevirtual #497                // Method ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
       200: getstatic     #82                 // Field ELVEN_WIZARD:Lext/mods/gameserver/enums/actors/ClassId;
       203: if_acmpne     210
       206: iconst_1
       207: goto          211
       210: iconst_0
       211: ireturn
       212: iconst_0
       213: ireturn
      LineNumberTable:
        line 385: 0
        line 386: 8
        line 388: 10
        line 391: 148
        line 394: 164
        line 397: 180
        line 400: 196
        line 402: 212
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     214     0 player   Lext/mods/gameserver/model/actor/Player;
            0     214     1 occupation   Ljava/lang/String;
      StackMapTable: number_of_entries = 20
        frame_type = 8 /* same */
        frame_type = 1 /* same */
        frame_type = 253 /* append */
          offset_delta = 49
          locals = [ class java/lang/String, int ]
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 11 /* same */
        frame_type = 30 /* same */
        frame_type = 13 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 0 /* same */
        frame_type = 13 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 0 /* same */
        frame_type = 13 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 0 /* same */
        frame_type = 13 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 249 /* chop */
          offset_delta = 0

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=9, locals=4, args_size=0
         0: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
         3: dup
         4: ldc_w         #529                // String HUMAN_FIGHTER
         7: iconst_0
         8: getstatic     #530                // Field ext/mods/gameserver/enums/actors/ClassRace.HUMAN:Lext/mods/gameserver/enums/actors/ClassRace;
        11: getstatic     #533                // Field ext/mods/gameserver/enums/actors/ClassType.FIGHTER:Lext/mods/gameserver/enums/actors/ClassType;
        14: iconst_0
        15: ldc_w         #538                // String Human Fighter
        18: aconst_null
        19: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
        22: putstatic     #3                  // Field HUMAN_FIGHTER:Lext/mods/gameserver/enums/actors/ClassId;
        25: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
        28: dup
        29: ldc_w         #543                // String WARRIOR
        32: iconst_1
        33: getstatic     #530                // Field ext/mods/gameserver/enums/actors/ClassRace.HUMAN:Lext/mods/gameserver/enums/actors/ClassRace;
        36: getstatic     #533                // Field ext/mods/gameserver/enums/actors/ClassType.FIGHTER:Lext/mods/gameserver/enums/actors/ClassType;
        39: iconst_1
        40: ldc_w         #544                // String Warrior
        43: getstatic     #3                  // Field HUMAN_FIGHTER:Lext/mods/gameserver/enums/actors/ClassId;
        46: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
        49: putstatic     #7                  // Field WARRIOR:Lext/mods/gameserver/enums/actors/ClassId;
        52: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
        55: dup
        56: ldc_w         #546                // String GLADIATOR
        59: iconst_2
        60: getstatic     #530                // Field ext/mods/gameserver/enums/actors/ClassRace.HUMAN:Lext/mods/gameserver/enums/actors/ClassRace;
        63: getstatic     #533                // Field ext/mods/gameserver/enums/actors/ClassType.FIGHTER:Lext/mods/gameserver/enums/actors/ClassType;
        66: iconst_2
        67: ldc_w         #547                // String Gladiator
        70: getstatic     #7                  // Field WARRIOR:Lext/mods/gameserver/enums/actors/ClassId;
        73: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
        76: putstatic     #10                 // Field GLADIATOR:Lext/mods/gameserver/enums/actors/ClassId;
        79: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
        82: dup
        83: ldc_w         #549                // String WARLORD
        86: iconst_3
        87: getstatic     #530                // Field ext/mods/gameserver/enums/actors/ClassRace.HUMAN:Lext/mods/gameserver/enums/actors/ClassRace;
        90: getstatic     #533                // Field ext/mods/gameserver/enums/actors/ClassType.FIGHTER:Lext/mods/gameserver/enums/actors/ClassType;
        93: iconst_2
        94: ldc_w         #550                // String Warlord
        97: getstatic     #7                  // Field WARRIOR:Lext/mods/gameserver/enums/actors/ClassId;
       100: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
       103: putstatic     #13                 // Field WARLORD:Lext/mods/gameserver/enums/actors/ClassId;
       106: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
       109: dup
       110: ldc_w         #552                // String KNIGHT
       113: iconst_4
       114: getstatic     #530                // Field ext/mods/gameserver/enums/actors/ClassRace.HUMAN:Lext/mods/gameserver/enums/actors/ClassRace;
       117: getstatic     #533                // Field ext/mods/gameserver/enums/actors/ClassType.FIGHTER:Lext/mods/gameserver/enums/actors/ClassType;
       120: iconst_1
       121: ldc_w         #553                // String Human Knight
       124: getstatic     #3                  // Field HUMAN_FIGHTER:Lext/mods/gameserver/enums/actors/ClassId;
       127: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
       130: putstatic     #16                 // Field KNIGHT:Lext/mods/gameserver/enums/actors/ClassId;
       133: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
       136: dup
       137: ldc_w         #555                // String PALADIN
       140: iconst_5
       141: getstatic     #530                // Field ext/mods/gameserver/enums/actors/ClassRace.HUMAN:Lext/mods/gameserver/enums/actors/ClassRace;
       144: getstatic     #533                // Field ext/mods/gameserver/enums/actors/ClassType.FIGHTER:Lext/mods/gameserver/enums/actors/ClassType;
       147: iconst_2
       148: ldc_w         #556                // String Paladin
       151: getstatic     #16                 // Field KNIGHT:Lext/mods/gameserver/enums/actors/ClassId;
       154: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
       157: putstatic     #19                 // Field PALADIN:Lext/mods/gameserver/enums/actors/ClassId;
       160: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
       163: dup
       164: ldc_w         #558                // String DARK_AVENGER
       167: bipush        6
       169: getstatic     #530                // Field ext/mods/gameserver/enums/actors/ClassRace.HUMAN:Lext/mods/gameserver/enums/actors/ClassRace;
       172: getstatic     #533                // Field ext/mods/gameserver/enums/actors/ClassType.FIGHTER:Lext/mods/gameserver/enums/actors/ClassType;
       175: iconst_2
       176: ldc_w         #559                // String Dark Avenger
       179: getstatic     #16                 // Field KNIGHT:Lext/mods/gameserver/enums/actors/ClassId;
       182: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
       185: putstatic     #22                 // Field DARK_AVENGER:Lext/mods/gameserver/enums/actors/ClassId;
       188: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
       191: dup
       192: ldc_w         #561                // String ROGUE
       195: bipush        7
       197: getstatic     #530                // Field ext/mods/gameserver/enums/actors/ClassRace.HUMAN:Lext/mods/gameserver/enums/actors/ClassRace;
       200: getstatic     #533                // Field ext/mods/gameserver/enums/actors/ClassType.FIGHTER:Lext/mods/gameserver/enums/actors/ClassType;
       203: iconst_1
       204: ldc_w         #562                // String Rogue
       207: getstatic     #3                  // Field HUMAN_FIGHTER:Lext/mods/gameserver/enums/actors/ClassId;
       210: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
       213: putstatic     #25                 // Field ROGUE:Lext/mods/gameserver/enums/actors/ClassId;
       216: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
       219: dup
       220: ldc_w         #564                // String TREASURE_HUNTER
       223: bipush        8
       225: getstatic     #530                // Field ext/mods/gameserver/enums/actors/ClassRace.HUMAN:Lext/mods/gameserver/enums/actors/ClassRace;
       228: getstatic     #533                // Field ext/mods/gameserver/enums/actors/ClassType.FIGHTER:Lext/mods/gameserver/enums/actors/ClassType;
       231: iconst_2
       232: ldc_w         #565                // String Treasure Hunter
       235: getstatic     #25                 // Field ROGUE:Lext/mods/gameserver/enums/actors/ClassId;
       238: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
       241: putstatic     #28                 // Field TREASURE_HUNTER:Lext/mods/gameserver/enums/actors/ClassId;
       244: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
       247: dup
       248: ldc_w         #567                // String HAWKEYE
       251: bipush        9
       253: getstatic     #530                // Field ext/mods/gameserver/enums/actors/ClassRace.HUMAN:Lext/mods/gameserver/enums/actors/ClassRace;
       256: getstatic     #533                // Field ext/mods/gameserver/enums/actors/ClassType.FIGHTER:Lext/mods/gameserver/enums/actors/ClassType;
       259: iconst_2
       260: ldc_w         #568                // String Hawkeye
       263: getstatic     #25                 // Field ROGUE:Lext/mods/gameserver/enums/actors/ClassId;
       266: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
       269: putstatic     #31                 // Field HAWKEYE:Lext/mods/gameserver/enums/actors/ClassId;
       272: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
       275: dup
       276: ldc_w         #570                // String HUMAN_MYSTIC
       279: bipush        10
       281: getstatic     #530                // Field ext/mods/gameserver/enums/actors/ClassRace.HUMAN:Lext/mods/gameserver/enums/actors/ClassRace;
       284: getstatic     #571                // Field ext/mods/gameserver/enums/actors/ClassType.MYSTIC:Lext/mods/gameserver/enums/actors/ClassType;
       287: iconst_0
       288: ldc_w         #574                // String Human Mystic
       291: aconst_null
       292: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
       295: putstatic     #34                 // Field HUMAN_MYSTIC:Lext/mods/gameserver/enums/actors/ClassId;
       298: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
       301: dup
       302: ldc_w         #576                // String HUMAN_WIZARD
       305: bipush        11
       307: getstatic     #530                // Field ext/mods/gameserver/enums/actors/ClassRace.HUMAN:Lext/mods/gameserver/enums/actors/ClassRace;
       310: getstatic     #571                // Field ext/mods/gameserver/enums/actors/ClassType.MYSTIC:Lext/mods/gameserver/enums/actors/ClassType;
       313: iconst_1
       314: ldc_w         #577                // String Human Wizard
       317: getstatic     #34                 // Field HUMAN_MYSTIC:Lext/mods/gameserver/enums/actors/ClassId;
       320: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
       323: putstatic     #37                 // Field HUMAN_WIZARD:Lext/mods/gameserver/enums/actors/ClassId;
       326: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
       329: dup
       330: ldc_w         #579                // String SORCERER
       333: bipush        12
       335: getstatic     #530                // Field ext/mods/gameserver/enums/actors/ClassRace.HUMAN:Lext/mods/gameserver/enums/actors/ClassRace;
       338: getstatic     #571                // Field ext/mods/gameserver/enums/actors/ClassType.MYSTIC:Lext/mods/gameserver/enums/actors/ClassType;
       341: iconst_2
       342: ldc_w         #580                // String Sorcerer
       345: getstatic     #37                 // Field HUMAN_WIZARD:Lext/mods/gameserver/enums/actors/ClassId;
       348: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
       351: putstatic     #40                 // Field SORCERER:Lext/mods/gameserver/enums/actors/ClassId;
       354: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
       357: dup
       358: ldc_w         #582                // String NECROMANCER
       361: bipush        13
       363: getstatic     #530                // Field ext/mods/gameserver/enums/actors/ClassRace.HUMAN:Lext/mods/gameserver/enums/actors/ClassRace;
       366: getstatic     #571                // Field ext/mods/gameserver/enums/actors/ClassType.MYSTIC:Lext/mods/gameserver/enums/actors/ClassType;
       369: iconst_2
       370: ldc_w         #583                // String Necromancer
       373: getstatic     #37                 // Field HUMAN_WIZARD:Lext/mods/gameserver/enums/actors/ClassId;
       376: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
       379: putstatic     #43                 // Field NECROMANCER:Lext/mods/gameserver/enums/actors/ClassId;
       382: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
       385: dup
       386: ldc_w         #585                // String WARLOCK
       389: bipush        14
       391: getstatic     #530                // Field ext/mods/gameserver/enums/actors/ClassRace.HUMAN:Lext/mods/gameserver/enums/actors/ClassRace;
       394: getstatic     #571                // Field ext/mods/gameserver/enums/actors/ClassType.MYSTIC:Lext/mods/gameserver/enums/actors/ClassType;
       397: iconst_2
       398: ldc_w         #586                // String Warlock
       401: getstatic     #37                 // Field HUMAN_WIZARD:Lext/mods/gameserver/enums/actors/ClassId;
       404: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
       407: putstatic     #46                 // Field WARLOCK:Lext/mods/gameserver/enums/actors/ClassId;
       410: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
       413: dup
       414: ldc_w         #588                // String CLERIC
       417: bipush        15
       419: getstatic     #530                // Field ext/mods/gameserver/enums/actors/ClassRace.HUMAN:Lext/mods/gameserver/enums/actors/ClassRace;
       422: getstatic     #589                // Field ext/mods/gameserver/enums/actors/ClassType.PRIEST:Lext/mods/gameserver/enums/actors/ClassType;
       425: iconst_1
       426: ldc_w         #592                // String Cleric
       429: getstatic     #34                 // Field HUMAN_MYSTIC:Lext/mods/gameserver/enums/actors/ClassId;
       432: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
       435: putstatic     #49                 // Field CLERIC:Lext/mods/gameserver/enums/actors/ClassId;
       438: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
       441: dup
       442: ldc_w         #594                // String BISHOP
       445: bipush        16
       447: getstatic     #530                // Field ext/mods/gameserver/enums/actors/ClassRace.HUMAN:Lext/mods/gameserver/enums/actors/ClassRace;
       450: getstatic     #589                // Field ext/mods/gameserver/enums/actors/ClassType.PRIEST:Lext/mods/gameserver/enums/actors/ClassType;
       453: iconst_2
       454: ldc_w         #595                // String Bishop
       457: getstatic     #49                 // Field CLERIC:Lext/mods/gameserver/enums/actors/ClassId;
       460: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
       463: putstatic     #52                 // Field BISHOP:Lext/mods/gameserver/enums/actors/ClassId;
       466: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
       469: dup
       470: ldc_w         #597                // String PROPHET
       473: bipush        17
       475: getstatic     #530                // Field ext/mods/gameserver/enums/actors/ClassRace.HUMAN:Lext/mods/gameserver/enums/actors/ClassRace;
       478: getstatic     #589                // Field ext/mods/gameserver/enums/actors/ClassType.PRIEST:Lext/mods/gameserver/enums/actors/ClassType;
       481: iconst_2
       482: ldc_w         #598                // String Prophet
       485: getstatic     #49                 // Field CLERIC:Lext/mods/gameserver/enums/actors/ClassId;
       488: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
       491: putstatic     #55                 // Field PROPHET:Lext/mods/gameserver/enums/actors/ClassId;
       494: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
       497: dup
       498: ldc_w         #600                // String ELVEN_FIGHTER
       501: bipush        18
       503: getstatic     #432                // Field ext/mods/gameserver/enums/actors/ClassRace.ELF:Lext/mods/gameserver/enums/actors/ClassRace;
       506: getstatic     #533                // Field ext/mods/gameserver/enums/actors/ClassType.FIGHTER:Lext/mods/gameserver/enums/actors/ClassType;
       509: iconst_0
       510: ldc_w         #601                // String Elven Fighter
       513: aconst_null
       514: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
       517: putstatic     #58                 // Field ELVEN_FIGHTER:Lext/mods/gameserver/enums/actors/ClassId;
       520: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
       523: dup
       524: ldc_w         #603                // String ELVEN_KNIGHT
       527: bipush        19
       529: getstatic     #432                // Field ext/mods/gameserver/enums/actors/ClassRace.ELF:Lext/mods/gameserver/enums/actors/ClassRace;
       532: getstatic     #533                // Field ext/mods/gameserver/enums/actors/ClassType.FIGHTER:Lext/mods/gameserver/enums/actors/ClassType;
       535: iconst_1
       536: ldc_w         #604                // String Elven Knight
       539: getstatic     #58                 // Field ELVEN_FIGHTER:Lext/mods/gameserver/enums/actors/ClassId;
       542: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
       545: putstatic     #61                 // Field ELVEN_KNIGHT:Lext/mods/gameserver/enums/actors/ClassId;
       548: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
       551: dup
       552: ldc_w         #606                // String TEMPLE_KNIGHT
       555: bipush        20
       557: getstatic     #432                // Field ext/mods/gameserver/enums/actors/ClassRace.ELF:Lext/mods/gameserver/enums/actors/ClassRace;
       560: getstatic     #533                // Field ext/mods/gameserver/enums/actors/ClassType.FIGHTER:Lext/mods/gameserver/enums/actors/ClassType;
       563: iconst_2
       564: ldc_w         #607                // String Temple Knight
       567: getstatic     #61                 // Field ELVEN_KNIGHT:Lext/mods/gameserver/enums/actors/ClassId;
       570: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
       573: putstatic     #64                 // Field TEMPLE_KNIGHT:Lext/mods/gameserver/enums/actors/ClassId;
       576: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
       579: dup
       580: ldc_w         #609                // String SWORD_SINGER
       583: bipush        21
       585: getstatic     #432                // Field ext/mods/gameserver/enums/actors/ClassRace.ELF:Lext/mods/gameserver/enums/actors/ClassRace;
       588: getstatic     #533                // Field ext/mods/gameserver/enums/actors/ClassType.FIGHTER:Lext/mods/gameserver/enums/actors/ClassType;
       591: iconst_2
       592: ldc_w         #610                // String Sword Singer
       595: getstatic     #61                 // Field ELVEN_KNIGHT:Lext/mods/gameserver/enums/actors/ClassId;
       598: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
       601: putstatic     #67                 // Field SWORD_SINGER:Lext/mods/gameserver/enums/actors/ClassId;
       604: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
       607: dup
       608: ldc_w         #612                // String ELVEN_SCOUT
       611: bipush        22
       613: getstatic     #432                // Field ext/mods/gameserver/enums/actors/ClassRace.ELF:Lext/mods/gameserver/enums/actors/ClassRace;
       616: getstatic     #533                // Field ext/mods/gameserver/enums/actors/ClassType.FIGHTER:Lext/mods/gameserver/enums/actors/ClassType;
       619: iconst_1
       620: ldc_w         #613                // String Elven Scout
       623: getstatic     #58                 // Field ELVEN_FIGHTER:Lext/mods/gameserver/enums/actors/ClassId;
       626: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
       629: putstatic     #70                 // Field ELVEN_SCOUT:Lext/mods/gameserver/enums/actors/ClassId;
       632: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
       635: dup
       636: ldc_w         #615                // String PLAINS_WALKER
       639: bipush        23
       641: getstatic     #432                // Field ext/mods/gameserver/enums/actors/ClassRace.ELF:Lext/mods/gameserver/enums/actors/ClassRace;
       644: getstatic     #533                // Field ext/mods/gameserver/enums/actors/ClassType.FIGHTER:Lext/mods/gameserver/enums/actors/ClassType;
       647: iconst_2
       648: ldc_w         #616                // String Plains Walker
       651: getstatic     #70                 // Field ELVEN_SCOUT:Lext/mods/gameserver/enums/actors/ClassId;
       654: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
       657: putstatic     #73                 // Field PLAINS_WALKER:Lext/mods/gameserver/enums/actors/ClassId;
       660: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
       663: dup
       664: ldc_w         #618                // String SILVER_RANGER
       667: bipush        24
       669: getstatic     #432                // Field ext/mods/gameserver/enums/actors/ClassRace.ELF:Lext/mods/gameserver/enums/actors/ClassRace;
       672: getstatic     #533                // Field ext/mods/gameserver/enums/actors/ClassType.FIGHTER:Lext/mods/gameserver/enums/actors/ClassType;
       675: iconst_2
       676: ldc_w         #619                // String Silver Ranger
       679: getstatic     #70                 // Field ELVEN_SCOUT:Lext/mods/gameserver/enums/actors/ClassId;
       682: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
       685: putstatic     #76                 // Field SILVER_RANGER:Lext/mods/gameserver/enums/actors/ClassId;
       688: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
       691: dup
       692: ldc_w         #621                // String ELVEN_MYSTIC
       695: bipush        25
       697: getstatic     #432                // Field ext/mods/gameserver/enums/actors/ClassRace.ELF:Lext/mods/gameserver/enums/actors/ClassRace;
       700: getstatic     #571                // Field ext/mods/gameserver/enums/actors/ClassType.MYSTIC:Lext/mods/gameserver/enums/actors/ClassType;
       703: iconst_0
       704: ldc_w         #622                // String Elven Mystic
       707: aconst_null
       708: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
       711: putstatic     #79                 // Field ELVEN_MYSTIC:Lext/mods/gameserver/enums/actors/ClassId;
       714: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
       717: dup
       718: ldc_w         #624                // String ELVEN_WIZARD
       721: bipush        26
       723: getstatic     #432                // Field ext/mods/gameserver/enums/actors/ClassRace.ELF:Lext/mods/gameserver/enums/actors/ClassRace;
       726: getstatic     #571                // Field ext/mods/gameserver/enums/actors/ClassType.MYSTIC:Lext/mods/gameserver/enums/actors/ClassType;
       729: iconst_1
       730: ldc_w         #625                // String Elven Wizard
       733: getstatic     #79                 // Field ELVEN_MYSTIC:Lext/mods/gameserver/enums/actors/ClassId;
       736: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
       739: putstatic     #82                 // Field ELVEN_WIZARD:Lext/mods/gameserver/enums/actors/ClassId;
       742: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
       745: dup
       746: ldc_w         #627                // String SPELLSINGER
       749: bipush        27
       751: getstatic     #432                // Field ext/mods/gameserver/enums/actors/ClassRace.ELF:Lext/mods/gameserver/enums/actors/ClassRace;
       754: getstatic     #571                // Field ext/mods/gameserver/enums/actors/ClassType.MYSTIC:Lext/mods/gameserver/enums/actors/ClassType;
       757: iconst_2
       758: ldc_w         #628                // String Spellsinger
       761: getstatic     #82                 // Field ELVEN_WIZARD:Lext/mods/gameserver/enums/actors/ClassId;
       764: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
       767: putstatic     #85                 // Field SPELLSINGER:Lext/mods/gameserver/enums/actors/ClassId;
       770: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
       773: dup
       774: ldc_w         #630                // String ELEMENTAL_SUMMONER
       777: bipush        28
       779: getstatic     #432                // Field ext/mods/gameserver/enums/actors/ClassRace.ELF:Lext/mods/gameserver/enums/actors/ClassRace;
       782: getstatic     #571                // Field ext/mods/gameserver/enums/actors/ClassType.MYSTIC:Lext/mods/gameserver/enums/actors/ClassType;
       785: iconst_2
       786: ldc_w         #631                // String Elemental Summoner
       789: getstatic     #82                 // Field ELVEN_WIZARD:Lext/mods/gameserver/enums/actors/ClassId;
       792: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
       795: putstatic     #88                 // Field ELEMENTAL_SUMMONER:Lext/mods/gameserver/enums/actors/ClassId;
       798: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
       801: dup
       802: ldc_w         #633                // String ELVEN_ORACLE
       805: bipush        29
       807: getstatic     #432                // Field ext/mods/gameserver/enums/actors/ClassRace.ELF:Lext/mods/gameserver/enums/actors/ClassRace;
       810: getstatic     #589                // Field ext/mods/gameserver/enums/actors/ClassType.PRIEST:Lext/mods/gameserver/enums/actors/ClassType;
       813: iconst_1
       814: ldc_w         #634                // String Elven Oracle
       817: getstatic     #79                 // Field ELVEN_MYSTIC:Lext/mods/gameserver/enums/actors/ClassId;
       820: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
       823: putstatic     #91                 // Field ELVEN_ORACLE:Lext/mods/gameserver/enums/actors/ClassId;
       826: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
       829: dup
       830: ldc_w         #636                // String ELVEN_ELDER
       833: bipush        30
       835: getstatic     #432                // Field ext/mods/gameserver/enums/actors/ClassRace.ELF:Lext/mods/gameserver/enums/actors/ClassRace;
       838: getstatic     #589                // Field ext/mods/gameserver/enums/actors/ClassType.PRIEST:Lext/mods/gameserver/enums/actors/ClassType;
       841: iconst_2
       842: ldc_w         #637                // String Elven Elder
       845: getstatic     #91                 // Field ELVEN_ORACLE:Lext/mods/gameserver/enums/actors/ClassId;
       848: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
       851: putstatic     #94                 // Field ELVEN_ELDER:Lext/mods/gameserver/enums/actors/ClassId;
       854: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
       857: dup
       858: ldc_w         #639                // String DARK_FIGHTER
       861: bipush        31
       863: getstatic     #437                // Field ext/mods/gameserver/enums/actors/ClassRace.DARK_ELF:Lext/mods/gameserver/enums/actors/ClassRace;
       866: getstatic     #533                // Field ext/mods/gameserver/enums/actors/ClassType.FIGHTER:Lext/mods/gameserver/enums/actors/ClassType;
       869: iconst_0
       870: ldc_w         #640                // String Dark Fighter
       873: aconst_null
       874: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
       877: putstatic     #97                 // Field DARK_FIGHTER:Lext/mods/gameserver/enums/actors/ClassId;
       880: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
       883: dup
       884: ldc_w         #642                // String PALUS_KNIGHT
       887: bipush        32
       889: getstatic     #437                // Field ext/mods/gameserver/enums/actors/ClassRace.DARK_ELF:Lext/mods/gameserver/enums/actors/ClassRace;
       892: getstatic     #533                // Field ext/mods/gameserver/enums/actors/ClassType.FIGHTER:Lext/mods/gameserver/enums/actors/ClassType;
       895: iconst_1
       896: ldc_w         #643                // String Palus Knight
       899: getstatic     #97                 // Field DARK_FIGHTER:Lext/mods/gameserver/enums/actors/ClassId;
       902: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
       905: putstatic     #100                // Field PALUS_KNIGHT:Lext/mods/gameserver/enums/actors/ClassId;
       908: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
       911: dup
       912: ldc_w         #645                // String SHILLIEN_KNIGHT
       915: bipush        33
       917: getstatic     #437                // Field ext/mods/gameserver/enums/actors/ClassRace.DARK_ELF:Lext/mods/gameserver/enums/actors/ClassRace;
       920: getstatic     #533                // Field ext/mods/gameserver/enums/actors/ClassType.FIGHTER:Lext/mods/gameserver/enums/actors/ClassType;
       923: iconst_2
       924: ldc_w         #646                // String Shillien Knight
       927: getstatic     #100                // Field PALUS_KNIGHT:Lext/mods/gameserver/enums/actors/ClassId;
       930: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
       933: putstatic     #103                // Field SHILLIEN_KNIGHT:Lext/mods/gameserver/enums/actors/ClassId;
       936: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
       939: dup
       940: ldc_w         #648                // String BLADEDANCER
       943: bipush        34
       945: getstatic     #437                // Field ext/mods/gameserver/enums/actors/ClassRace.DARK_ELF:Lext/mods/gameserver/enums/actors/ClassRace;
       948: getstatic     #533                // Field ext/mods/gameserver/enums/actors/ClassType.FIGHTER:Lext/mods/gameserver/enums/actors/ClassType;
       951: iconst_2
       952: ldc_w         #649                // String Bladedancer
       955: getstatic     #100                // Field PALUS_KNIGHT:Lext/mods/gameserver/enums/actors/ClassId;
       958: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
       961: putstatic     #106                // Field BLADEDANCER:Lext/mods/gameserver/enums/actors/ClassId;
       964: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
       967: dup
       968: ldc_w         #651                // String ASSASSIN
       971: bipush        35
       973: getstatic     #437                // Field ext/mods/gameserver/enums/actors/ClassRace.DARK_ELF:Lext/mods/gameserver/enums/actors/ClassRace;
       976: getstatic     #533                // Field ext/mods/gameserver/enums/actors/ClassType.FIGHTER:Lext/mods/gameserver/enums/actors/ClassType;
       979: iconst_1
       980: ldc_w         #652                // String Assassin
       983: getstatic     #97                 // Field DARK_FIGHTER:Lext/mods/gameserver/enums/actors/ClassId;
       986: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
       989: putstatic     #109                // Field ASSASSIN:Lext/mods/gameserver/enums/actors/ClassId;
       992: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
       995: dup
       996: ldc_w         #654                // String ABYSS_WALKER
       999: bipush        36
      1001: getstatic     #437                // Field ext/mods/gameserver/enums/actors/ClassRace.DARK_ELF:Lext/mods/gameserver/enums/actors/ClassRace;
      1004: getstatic     #533                // Field ext/mods/gameserver/enums/actors/ClassType.FIGHTER:Lext/mods/gameserver/enums/actors/ClassType;
      1007: iconst_2
      1008: ldc_w         #655                // String Abyss Walker
      1011: getstatic     #109                // Field ASSASSIN:Lext/mods/gameserver/enums/actors/ClassId;
      1014: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      1017: putstatic     #112                // Field ABYSS_WALKER:Lext/mods/gameserver/enums/actors/ClassId;
      1020: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      1023: dup
      1024: ldc_w         #657                // String PHANTOM_RANGER
      1027: bipush        37
      1029: getstatic     #437                // Field ext/mods/gameserver/enums/actors/ClassRace.DARK_ELF:Lext/mods/gameserver/enums/actors/ClassRace;
      1032: getstatic     #533                // Field ext/mods/gameserver/enums/actors/ClassType.FIGHTER:Lext/mods/gameserver/enums/actors/ClassType;
      1035: iconst_2
      1036: ldc_w         #658                // String Phantom Ranger
      1039: getstatic     #109                // Field ASSASSIN:Lext/mods/gameserver/enums/actors/ClassId;
      1042: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      1045: putstatic     #115                // Field PHANTOM_RANGER:Lext/mods/gameserver/enums/actors/ClassId;
      1048: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      1051: dup
      1052: ldc_w         #660                // String DARK_MYSTIC
      1055: bipush        38
      1057: getstatic     #437                // Field ext/mods/gameserver/enums/actors/ClassRace.DARK_ELF:Lext/mods/gameserver/enums/actors/ClassRace;
      1060: getstatic     #571                // Field ext/mods/gameserver/enums/actors/ClassType.MYSTIC:Lext/mods/gameserver/enums/actors/ClassType;
      1063: iconst_0
      1064: ldc_w         #661                // String Dark Mystic
      1067: aconst_null
      1068: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      1071: putstatic     #118                // Field DARK_MYSTIC:Lext/mods/gameserver/enums/actors/ClassId;
      1074: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      1077: dup
      1078: ldc_w         #663                // String DARK_WIZARD
      1081: bipush        39
      1083: getstatic     #437                // Field ext/mods/gameserver/enums/actors/ClassRace.DARK_ELF:Lext/mods/gameserver/enums/actors/ClassRace;
      1086: getstatic     #571                // Field ext/mods/gameserver/enums/actors/ClassType.MYSTIC:Lext/mods/gameserver/enums/actors/ClassType;
      1089: iconst_1
      1090: ldc_w         #664                // String Dark Wizard
      1093: getstatic     #118                // Field DARK_MYSTIC:Lext/mods/gameserver/enums/actors/ClassId;
      1096: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      1099: putstatic     #121                // Field DARK_WIZARD:Lext/mods/gameserver/enums/actors/ClassId;
      1102: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      1105: dup
      1106: ldc_w         #666                // String SPELLHOWLER
      1109: bipush        40
      1111: getstatic     #437                // Field ext/mods/gameserver/enums/actors/ClassRace.DARK_ELF:Lext/mods/gameserver/enums/actors/ClassRace;
      1114: getstatic     #571                // Field ext/mods/gameserver/enums/actors/ClassType.MYSTIC:Lext/mods/gameserver/enums/actors/ClassType;
      1117: iconst_2
      1118: ldc_w         #667                // String Spellhowler
      1121: getstatic     #121                // Field DARK_WIZARD:Lext/mods/gameserver/enums/actors/ClassId;
      1124: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      1127: putstatic     #124                // Field SPELLHOWLER:Lext/mods/gameserver/enums/actors/ClassId;
      1130: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      1133: dup
      1134: ldc_w         #669                // String PHANTOM_SUMMONER
      1137: bipush        41
      1139: getstatic     #437                // Field ext/mods/gameserver/enums/actors/ClassRace.DARK_ELF:Lext/mods/gameserver/enums/actors/ClassRace;
      1142: getstatic     #571                // Field ext/mods/gameserver/enums/actors/ClassType.MYSTIC:Lext/mods/gameserver/enums/actors/ClassType;
      1145: iconst_2
      1146: ldc_w         #670                // String Phantom Summoner
      1149: getstatic     #121                // Field DARK_WIZARD:Lext/mods/gameserver/enums/actors/ClassId;
      1152: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      1155: putstatic     #127                // Field PHANTOM_SUMMONER:Lext/mods/gameserver/enums/actors/ClassId;
      1158: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      1161: dup
      1162: ldc_w         #672                // String SHILLIEN_ORACLE
      1165: bipush        42
      1167: getstatic     #437                // Field ext/mods/gameserver/enums/actors/ClassRace.DARK_ELF:Lext/mods/gameserver/enums/actors/ClassRace;
      1170: getstatic     #589                // Field ext/mods/gameserver/enums/actors/ClassType.PRIEST:Lext/mods/gameserver/enums/actors/ClassType;
      1173: iconst_1
      1174: ldc_w         #673                // String Shillien Oracle
      1177: getstatic     #118                // Field DARK_MYSTIC:Lext/mods/gameserver/enums/actors/ClassId;
      1180: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      1183: putstatic     #130                // Field SHILLIEN_ORACLE:Lext/mods/gameserver/enums/actors/ClassId;
      1186: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      1189: dup
      1190: ldc_w         #675                // String SHILLIEN_ELDER
      1193: bipush        43
      1195: getstatic     #437                // Field ext/mods/gameserver/enums/actors/ClassRace.DARK_ELF:Lext/mods/gameserver/enums/actors/ClassRace;
      1198: getstatic     #589                // Field ext/mods/gameserver/enums/actors/ClassType.PRIEST:Lext/mods/gameserver/enums/actors/ClassType;
      1201: iconst_2
      1202: ldc_w         #676                // String Shillien Elder
      1205: getstatic     #130                // Field SHILLIEN_ORACLE:Lext/mods/gameserver/enums/actors/ClassId;
      1208: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      1211: putstatic     #133                // Field SHILLIEN_ELDER:Lext/mods/gameserver/enums/actors/ClassId;
      1214: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      1217: dup
      1218: ldc_w         #678                // String ORC_FIGHTER
      1221: bipush        44
      1223: getstatic     #679                // Field ext/mods/gameserver/enums/actors/ClassRace.ORC:Lext/mods/gameserver/enums/actors/ClassRace;
      1226: getstatic     #533                // Field ext/mods/gameserver/enums/actors/ClassType.FIGHTER:Lext/mods/gameserver/enums/actors/ClassType;
      1229: iconst_0
      1230: ldc_w         #682                // String Orc Fighter
      1233: aconst_null
      1234: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      1237: putstatic     #136                // Field ORC_FIGHTER:Lext/mods/gameserver/enums/actors/ClassId;
      1240: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      1243: dup
      1244: ldc_w         #684                // String ORC_RAIDER
      1247: bipush        45
      1249: getstatic     #679                // Field ext/mods/gameserver/enums/actors/ClassRace.ORC:Lext/mods/gameserver/enums/actors/ClassRace;
      1252: getstatic     #533                // Field ext/mods/gameserver/enums/actors/ClassType.FIGHTER:Lext/mods/gameserver/enums/actors/ClassType;
      1255: iconst_1
      1256: ldc_w         #685                // String Orc Raider
      1259: getstatic     #136                // Field ORC_FIGHTER:Lext/mods/gameserver/enums/actors/ClassId;
      1262: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      1265: putstatic     #139                // Field ORC_RAIDER:Lext/mods/gameserver/enums/actors/ClassId;
      1268: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      1271: dup
      1272: ldc_w         #687                // String DESTROYER
      1275: bipush        46
      1277: getstatic     #679                // Field ext/mods/gameserver/enums/actors/ClassRace.ORC:Lext/mods/gameserver/enums/actors/ClassRace;
      1280: getstatic     #533                // Field ext/mods/gameserver/enums/actors/ClassType.FIGHTER:Lext/mods/gameserver/enums/actors/ClassType;
      1283: iconst_2
      1284: ldc_w         #688                // String Destroyer
      1287: getstatic     #139                // Field ORC_RAIDER:Lext/mods/gameserver/enums/actors/ClassId;
      1290: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      1293: putstatic     #142                // Field DESTROYER:Lext/mods/gameserver/enums/actors/ClassId;
      1296: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      1299: dup
      1300: ldc_w         #690                // String MONK
      1303: bipush        47
      1305: getstatic     #679                // Field ext/mods/gameserver/enums/actors/ClassRace.ORC:Lext/mods/gameserver/enums/actors/ClassRace;
      1308: getstatic     #533                // Field ext/mods/gameserver/enums/actors/ClassType.FIGHTER:Lext/mods/gameserver/enums/actors/ClassType;
      1311: iconst_1
      1312: ldc_w         #691                // String Monk
      1315: getstatic     #136                // Field ORC_FIGHTER:Lext/mods/gameserver/enums/actors/ClassId;
      1318: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      1321: putstatic     #145                // Field MONK:Lext/mods/gameserver/enums/actors/ClassId;
      1324: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      1327: dup
      1328: ldc_w         #693                // String TYRANT
      1331: bipush        48
      1333: getstatic     #679                // Field ext/mods/gameserver/enums/actors/ClassRace.ORC:Lext/mods/gameserver/enums/actors/ClassRace;
      1336: getstatic     #533                // Field ext/mods/gameserver/enums/actors/ClassType.FIGHTER:Lext/mods/gameserver/enums/actors/ClassType;
      1339: iconst_2
      1340: ldc_w         #694                // String Tyrant
      1343: getstatic     #145                // Field MONK:Lext/mods/gameserver/enums/actors/ClassId;
      1346: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      1349: putstatic     #148                // Field TYRANT:Lext/mods/gameserver/enums/actors/ClassId;
      1352: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      1355: dup
      1356: ldc_w         #696                // String ORC_MYSTIC
      1359: bipush        49
      1361: getstatic     #679                // Field ext/mods/gameserver/enums/actors/ClassRace.ORC:Lext/mods/gameserver/enums/actors/ClassRace;
      1364: getstatic     #571                // Field ext/mods/gameserver/enums/actors/ClassType.MYSTIC:Lext/mods/gameserver/enums/actors/ClassType;
      1367: iconst_0
      1368: ldc_w         #697                // String Orc Mystic
      1371: aconst_null
      1372: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      1375: putstatic     #151                // Field ORC_MYSTIC:Lext/mods/gameserver/enums/actors/ClassId;
      1378: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      1381: dup
      1382: ldc_w         #699                // String ORC_SHAMAN
      1385: bipush        50
      1387: getstatic     #679                // Field ext/mods/gameserver/enums/actors/ClassRace.ORC:Lext/mods/gameserver/enums/actors/ClassRace;
      1390: getstatic     #571                // Field ext/mods/gameserver/enums/actors/ClassType.MYSTIC:Lext/mods/gameserver/enums/actors/ClassType;
      1393: iconst_1
      1394: ldc_w         #700                // String Orc Shaman
      1397: getstatic     #151                // Field ORC_MYSTIC:Lext/mods/gameserver/enums/actors/ClassId;
      1400: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      1403: putstatic     #154                // Field ORC_SHAMAN:Lext/mods/gameserver/enums/actors/ClassId;
      1406: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      1409: dup
      1410: ldc_w         #702                // String OVERLORD
      1413: bipush        51
      1415: getstatic     #679                // Field ext/mods/gameserver/enums/actors/ClassRace.ORC:Lext/mods/gameserver/enums/actors/ClassRace;
      1418: getstatic     #571                // Field ext/mods/gameserver/enums/actors/ClassType.MYSTIC:Lext/mods/gameserver/enums/actors/ClassType;
      1421: iconst_2
      1422: ldc_w         #703                // String Overlord
      1425: getstatic     #154                // Field ORC_SHAMAN:Lext/mods/gameserver/enums/actors/ClassId;
      1428: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      1431: putstatic     #157                // Field OVERLORD:Lext/mods/gameserver/enums/actors/ClassId;
      1434: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      1437: dup
      1438: ldc_w         #705                // String WARCRYER
      1441: bipush        52
      1443: getstatic     #679                // Field ext/mods/gameserver/enums/actors/ClassRace.ORC:Lext/mods/gameserver/enums/actors/ClassRace;
      1446: getstatic     #571                // Field ext/mods/gameserver/enums/actors/ClassType.MYSTIC:Lext/mods/gameserver/enums/actors/ClassType;
      1449: iconst_2
      1450: ldc_w         #706                // String Warcryer
      1453: getstatic     #154                // Field ORC_SHAMAN:Lext/mods/gameserver/enums/actors/ClassId;
      1456: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      1459: putstatic     #160                // Field WARCRYER:Lext/mods/gameserver/enums/actors/ClassId;
      1462: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      1465: dup
      1466: ldc_w         #708                // String DWARVEN_FIGHTER
      1469: bipush        53
      1471: getstatic     #709                // Field ext/mods/gameserver/enums/actors/ClassRace.DWARF:Lext/mods/gameserver/enums/actors/ClassRace;
      1474: getstatic     #533                // Field ext/mods/gameserver/enums/actors/ClassType.FIGHTER:Lext/mods/gameserver/enums/actors/ClassType;
      1477: iconst_0
      1478: ldc_w         #712                // String Dwarven Fighter
      1481: aconst_null
      1482: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      1485: putstatic     #163                // Field DWARVEN_FIGHTER:Lext/mods/gameserver/enums/actors/ClassId;
      1488: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      1491: dup
      1492: ldc_w         #714                // String SCAVENGER
      1495: bipush        54
      1497: getstatic     #709                // Field ext/mods/gameserver/enums/actors/ClassRace.DWARF:Lext/mods/gameserver/enums/actors/ClassRace;
      1500: getstatic     #533                // Field ext/mods/gameserver/enums/actors/ClassType.FIGHTER:Lext/mods/gameserver/enums/actors/ClassType;
      1503: iconst_1
      1504: ldc_w         #715                // String Scavenger
      1507: getstatic     #163                // Field DWARVEN_FIGHTER:Lext/mods/gameserver/enums/actors/ClassId;
      1510: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      1513: putstatic     #166                // Field SCAVENGER:Lext/mods/gameserver/enums/actors/ClassId;
      1516: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      1519: dup
      1520: ldc_w         #717                // String BOUNTY_HUNTER
      1523: bipush        55
      1525: getstatic     #709                // Field ext/mods/gameserver/enums/actors/ClassRace.DWARF:Lext/mods/gameserver/enums/actors/ClassRace;
      1528: getstatic     #533                // Field ext/mods/gameserver/enums/actors/ClassType.FIGHTER:Lext/mods/gameserver/enums/actors/ClassType;
      1531: iconst_2
      1532: ldc_w         #718                // String Bounty Hunter
      1535: getstatic     #166                // Field SCAVENGER:Lext/mods/gameserver/enums/actors/ClassId;
      1538: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      1541: putstatic     #169                // Field BOUNTY_HUNTER:Lext/mods/gameserver/enums/actors/ClassId;
      1544: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      1547: dup
      1548: ldc_w         #720                // String ARTISAN
      1551: bipush        56
      1553: getstatic     #709                // Field ext/mods/gameserver/enums/actors/ClassRace.DWARF:Lext/mods/gameserver/enums/actors/ClassRace;
      1556: getstatic     #533                // Field ext/mods/gameserver/enums/actors/ClassType.FIGHTER:Lext/mods/gameserver/enums/actors/ClassType;
      1559: iconst_1
      1560: ldc_w         #721                // String Artisan
      1563: getstatic     #163                // Field DWARVEN_FIGHTER:Lext/mods/gameserver/enums/actors/ClassId;
      1566: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      1569: putstatic     #172                // Field ARTISAN:Lext/mods/gameserver/enums/actors/ClassId;
      1572: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      1575: dup
      1576: ldc_w         #723                // String WARSMITH
      1579: bipush        57
      1581: getstatic     #709                // Field ext/mods/gameserver/enums/actors/ClassRace.DWARF:Lext/mods/gameserver/enums/actors/ClassRace;
      1584: getstatic     #533                // Field ext/mods/gameserver/enums/actors/ClassType.FIGHTER:Lext/mods/gameserver/enums/actors/ClassType;
      1587: iconst_2
      1588: ldc_w         #724                // String Warsmith
      1591: getstatic     #172                // Field ARTISAN:Lext/mods/gameserver/enums/actors/ClassId;
      1594: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      1597: putstatic     #175                // Field WARSMITH:Lext/mods/gameserver/enums/actors/ClassId;
      1600: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      1603: dup
      1604: ldc_w         #726                // String DUMMY_1
      1607: bipush        58
      1609: aconst_null
      1610: aconst_null
      1611: iconst_m1
      1612: ldc_w         #727                // String dummy 1
      1615: aconst_null
      1616: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      1619: putstatic     #178                // Field DUMMY_1:Lext/mods/gameserver/enums/actors/ClassId;
      1622: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      1625: dup
      1626: ldc_w         #729                // String DUMMY_2
      1629: bipush        59
      1631: aconst_null
      1632: aconst_null
      1633: iconst_m1
      1634: ldc_w         #730                // String dummy 2
      1637: aconst_null
      1638: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      1641: putstatic     #181                // Field DUMMY_2:Lext/mods/gameserver/enums/actors/ClassId;
      1644: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      1647: dup
      1648: ldc_w         #732                // String DUMMY_3
      1651: bipush        60
      1653: aconst_null
      1654: aconst_null
      1655: iconst_m1
      1656: ldc_w         #733                // String dummy 3
      1659: aconst_null
      1660: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      1663: putstatic     #184                // Field DUMMY_3:Lext/mods/gameserver/enums/actors/ClassId;
      1666: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      1669: dup
      1670: ldc_w         #735                // String DUMMY_4
      1673: bipush        61
      1675: aconst_null
      1676: aconst_null
      1677: iconst_m1
      1678: ldc_w         #736                // String dummy 4
      1681: aconst_null
      1682: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      1685: putstatic     #187                // Field DUMMY_4:Lext/mods/gameserver/enums/actors/ClassId;
      1688: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      1691: dup
      1692: ldc_w         #738                // String DUMMY_5
      1695: bipush        62
      1697: aconst_null
      1698: aconst_null
      1699: iconst_m1
      1700: ldc_w         #739                // String dummy 5
      1703: aconst_null
      1704: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      1707: putstatic     #190                // Field DUMMY_5:Lext/mods/gameserver/enums/actors/ClassId;
      1710: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      1713: dup
      1714: ldc_w         #741                // String DUMMY_6
      1717: bipush        63
      1719: aconst_null
      1720: aconst_null
      1721: iconst_m1
      1722: ldc_w         #742                // String dummy 6
      1725: aconst_null
      1726: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      1729: putstatic     #193                // Field DUMMY_6:Lext/mods/gameserver/enums/actors/ClassId;
      1732: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      1735: dup
      1736: ldc_w         #744                // String DUMMY_7
      1739: bipush        64
      1741: aconst_null
      1742: aconst_null
      1743: iconst_m1
      1744: ldc_w         #745                // String dummy 7
      1747: aconst_null
      1748: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      1751: putstatic     #196                // Field DUMMY_7:Lext/mods/gameserver/enums/actors/ClassId;
      1754: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      1757: dup
      1758: ldc_w         #747                // String DUMMY_8
      1761: bipush        65
      1763: aconst_null
      1764: aconst_null
      1765: iconst_m1
      1766: ldc_w         #748                // String dummy 8
      1769: aconst_null
      1770: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      1773: putstatic     #199                // Field DUMMY_8:Lext/mods/gameserver/enums/actors/ClassId;
      1776: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      1779: dup
      1780: ldc_w         #750                // String DUMMY_9
      1783: bipush        66
      1785: aconst_null
      1786: aconst_null
      1787: iconst_m1
      1788: ldc_w         #751                // String dummy 9
      1791: aconst_null
      1792: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      1795: putstatic     #202                // Field DUMMY_9:Lext/mods/gameserver/enums/actors/ClassId;
      1798: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      1801: dup
      1802: ldc_w         #753                // String DUMMY_10
      1805: bipush        67
      1807: aconst_null
      1808: aconst_null
      1809: iconst_m1
      1810: ldc_w         #754                // String dummy 10
      1813: aconst_null
      1814: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      1817: putstatic     #205                // Field DUMMY_10:Lext/mods/gameserver/enums/actors/ClassId;
      1820: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      1823: dup
      1824: ldc_w         #756                // String DUMMY_11
      1827: bipush        68
      1829: aconst_null
      1830: aconst_null
      1831: iconst_m1
      1832: ldc_w         #757                // String dummy 11
      1835: aconst_null
      1836: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      1839: putstatic     #208                // Field DUMMY_11:Lext/mods/gameserver/enums/actors/ClassId;
      1842: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      1845: dup
      1846: ldc_w         #759                // String DUMMY_12
      1849: bipush        69
      1851: aconst_null
      1852: aconst_null
      1853: iconst_m1
      1854: ldc_w         #760                // String dummy 12
      1857: aconst_null
      1858: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      1861: putstatic     #211                // Field DUMMY_12:Lext/mods/gameserver/enums/actors/ClassId;
      1864: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      1867: dup
      1868: ldc_w         #762                // String DUMMY_13
      1871: bipush        70
      1873: aconst_null
      1874: aconst_null
      1875: iconst_m1
      1876: ldc_w         #763                // String dummy 13
      1879: aconst_null
      1880: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      1883: putstatic     #214                // Field DUMMY_13:Lext/mods/gameserver/enums/actors/ClassId;
      1886: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      1889: dup
      1890: ldc_w         #765                // String DUMMY_14
      1893: bipush        71
      1895: aconst_null
      1896: aconst_null
      1897: iconst_m1
      1898: ldc_w         #766                // String dummy 14
      1901: aconst_null
      1902: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      1905: putstatic     #217                // Field DUMMY_14:Lext/mods/gameserver/enums/actors/ClassId;
      1908: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      1911: dup
      1912: ldc_w         #768                // String DUMMY_15
      1915: bipush        72
      1917: aconst_null
      1918: aconst_null
      1919: iconst_m1
      1920: ldc_w         #769                // String dummy 15
      1923: aconst_null
      1924: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      1927: putstatic     #220                // Field DUMMY_15:Lext/mods/gameserver/enums/actors/ClassId;
      1930: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      1933: dup
      1934: ldc_w         #771                // String DUMMY_16
      1937: bipush        73
      1939: aconst_null
      1940: aconst_null
      1941: iconst_m1
      1942: ldc_w         #772                // String dummy 16
      1945: aconst_null
      1946: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      1949: putstatic     #223                // Field DUMMY_16:Lext/mods/gameserver/enums/actors/ClassId;
      1952: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      1955: dup
      1956: ldc_w         #774                // String DUMMY_17
      1959: bipush        74
      1961: aconst_null
      1962: aconst_null
      1963: iconst_m1
      1964: ldc_w         #775                // String dummy 17
      1967: aconst_null
      1968: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      1971: putstatic     #226                // Field DUMMY_17:Lext/mods/gameserver/enums/actors/ClassId;
      1974: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      1977: dup
      1978: ldc_w         #777                // String DUMMY_18
      1981: bipush        75
      1983: aconst_null
      1984: aconst_null
      1985: iconst_m1
      1986: ldc_w         #778                // String dummy 18
      1989: aconst_null
      1990: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      1993: putstatic     #229                // Field DUMMY_18:Lext/mods/gameserver/enums/actors/ClassId;
      1996: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      1999: dup
      2000: ldc_w         #780                // String DUMMY_19
      2003: bipush        76
      2005: aconst_null
      2006: aconst_null
      2007: iconst_m1
      2008: ldc_w         #781                // String dummy 19
      2011: aconst_null
      2012: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      2015: putstatic     #232                // Field DUMMY_19:Lext/mods/gameserver/enums/actors/ClassId;
      2018: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      2021: dup
      2022: ldc_w         #783                // String DUMMY_20
      2025: bipush        77
      2027: aconst_null
      2028: aconst_null
      2029: iconst_m1
      2030: ldc_w         #784                // String dummy 20
      2033: aconst_null
      2034: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      2037: putstatic     #235                // Field DUMMY_20:Lext/mods/gameserver/enums/actors/ClassId;
      2040: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      2043: dup
      2044: ldc_w         #786                // String DUMMY_21
      2047: bipush        78
      2049: aconst_null
      2050: aconst_null
      2051: iconst_m1
      2052: ldc_w         #787                // String dummy 21
      2055: aconst_null
      2056: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      2059: putstatic     #238                // Field DUMMY_21:Lext/mods/gameserver/enums/actors/ClassId;
      2062: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      2065: dup
      2066: ldc_w         #789                // String DUMMY_22
      2069: bipush        79
      2071: aconst_null
      2072: aconst_null
      2073: iconst_m1
      2074: ldc_w         #790                // String dummy 22
      2077: aconst_null
      2078: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      2081: putstatic     #241                // Field DUMMY_22:Lext/mods/gameserver/enums/actors/ClassId;
      2084: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      2087: dup
      2088: ldc_w         #792                // String DUMMY_23
      2091: bipush        80
      2093: aconst_null
      2094: aconst_null
      2095: iconst_m1
      2096: ldc_w         #793                // String dummy 23
      2099: aconst_null
      2100: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      2103: putstatic     #244                // Field DUMMY_23:Lext/mods/gameserver/enums/actors/ClassId;
      2106: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      2109: dup
      2110: ldc_w         #795                // String DUMMY_24
      2113: bipush        81
      2115: aconst_null
      2116: aconst_null
      2117: iconst_m1
      2118: ldc_w         #796                // String dummy 24
      2121: aconst_null
      2122: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      2125: putstatic     #247                // Field DUMMY_24:Lext/mods/gameserver/enums/actors/ClassId;
      2128: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      2131: dup
      2132: ldc_w         #798                // String DUMMY_25
      2135: bipush        82
      2137: aconst_null
      2138: aconst_null
      2139: iconst_m1
      2140: ldc_w         #799                // String dummy 25
      2143: aconst_null
      2144: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      2147: putstatic     #250                // Field DUMMY_25:Lext/mods/gameserver/enums/actors/ClassId;
      2150: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      2153: dup
      2154: ldc_w         #801                // String DUMMY_26
      2157: bipush        83
      2159: aconst_null
      2160: aconst_null
      2161: iconst_m1
      2162: ldc_w         #802                // String dummy 26
      2165: aconst_null
      2166: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      2169: putstatic     #253                // Field DUMMY_26:Lext/mods/gameserver/enums/actors/ClassId;
      2172: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      2175: dup
      2176: ldc_w         #804                // String DUMMY_27
      2179: bipush        84
      2181: aconst_null
      2182: aconst_null
      2183: iconst_m1
      2184: ldc_w         #805                // String dummy 27
      2187: aconst_null
      2188: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      2191: putstatic     #256                // Field DUMMY_27:Lext/mods/gameserver/enums/actors/ClassId;
      2194: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      2197: dup
      2198: ldc_w         #807                // String DUMMY_28
      2201: bipush        85
      2203: aconst_null
      2204: aconst_null
      2205: iconst_m1
      2206: ldc_w         #808                // String dummy 28
      2209: aconst_null
      2210: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      2213: putstatic     #259                // Field DUMMY_28:Lext/mods/gameserver/enums/actors/ClassId;
      2216: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      2219: dup
      2220: ldc_w         #810                // String DUMMY_29
      2223: bipush        86
      2225: aconst_null
      2226: aconst_null
      2227: iconst_m1
      2228: ldc_w         #811                // String dummy 29
      2231: aconst_null
      2232: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      2235: putstatic     #262                // Field DUMMY_29:Lext/mods/gameserver/enums/actors/ClassId;
      2238: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      2241: dup
      2242: ldc_w         #813                // String DUMMY_30
      2245: bipush        87
      2247: aconst_null
      2248: aconst_null
      2249: iconst_m1
      2250: ldc_w         #814                // String dummy 30
      2253: aconst_null
      2254: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      2257: putstatic     #265                // Field DUMMY_30:Lext/mods/gameserver/enums/actors/ClassId;
      2260: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      2263: dup
      2264: ldc_w         #816                // String DUELIST
      2267: bipush        88
      2269: getstatic     #530                // Field ext/mods/gameserver/enums/actors/ClassRace.HUMAN:Lext/mods/gameserver/enums/actors/ClassRace;
      2272: getstatic     #533                // Field ext/mods/gameserver/enums/actors/ClassType.FIGHTER:Lext/mods/gameserver/enums/actors/ClassType;
      2275: iconst_3
      2276: ldc_w         #817                // String Duelist
      2279: getstatic     #10                 // Field GLADIATOR:Lext/mods/gameserver/enums/actors/ClassId;
      2282: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      2285: putstatic     #268                // Field DUELIST:Lext/mods/gameserver/enums/actors/ClassId;
      2288: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      2291: dup
      2292: ldc_w         #819                // String DREADNOUGHT
      2295: bipush        89
      2297: getstatic     #530                // Field ext/mods/gameserver/enums/actors/ClassRace.HUMAN:Lext/mods/gameserver/enums/actors/ClassRace;
      2300: getstatic     #533                // Field ext/mods/gameserver/enums/actors/ClassType.FIGHTER:Lext/mods/gameserver/enums/actors/ClassType;
      2303: iconst_3
      2304: ldc_w         #820                // String Dreadnought
      2307: getstatic     #13                 // Field WARLORD:Lext/mods/gameserver/enums/actors/ClassId;
      2310: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      2313: putstatic     #271                // Field DREADNOUGHT:Lext/mods/gameserver/enums/actors/ClassId;
      2316: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      2319: dup
      2320: ldc_w         #822                // String PHOENIX_KNIGHT
      2323: bipush        90
      2325: getstatic     #530                // Field ext/mods/gameserver/enums/actors/ClassRace.HUMAN:Lext/mods/gameserver/enums/actors/ClassRace;
      2328: getstatic     #533                // Field ext/mods/gameserver/enums/actors/ClassType.FIGHTER:Lext/mods/gameserver/enums/actors/ClassType;
      2331: iconst_3
      2332: ldc_w         #823                // String Phoenix Knight
      2335: getstatic     #19                 // Field PALADIN:Lext/mods/gameserver/enums/actors/ClassId;
      2338: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      2341: putstatic     #274                // Field PHOENIX_KNIGHT:Lext/mods/gameserver/enums/actors/ClassId;
      2344: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      2347: dup
      2348: ldc_w         #825                // String HELL_KNIGHT
      2351: bipush        91
      2353: getstatic     #530                // Field ext/mods/gameserver/enums/actors/ClassRace.HUMAN:Lext/mods/gameserver/enums/actors/ClassRace;
      2356: getstatic     #533                // Field ext/mods/gameserver/enums/actors/ClassType.FIGHTER:Lext/mods/gameserver/enums/actors/ClassType;
      2359: iconst_3
      2360: ldc_w         #826                // String Hell Knight
      2363: getstatic     #22                 // Field DARK_AVENGER:Lext/mods/gameserver/enums/actors/ClassId;
      2366: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      2369: putstatic     #277                // Field HELL_KNIGHT:Lext/mods/gameserver/enums/actors/ClassId;
      2372: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      2375: dup
      2376: ldc_w         #828                // String SAGGITARIUS
      2379: bipush        92
      2381: getstatic     #530                // Field ext/mods/gameserver/enums/actors/ClassRace.HUMAN:Lext/mods/gameserver/enums/actors/ClassRace;
      2384: getstatic     #533                // Field ext/mods/gameserver/enums/actors/ClassType.FIGHTER:Lext/mods/gameserver/enums/actors/ClassType;
      2387: iconst_3
      2388: ldc_w         #829                // String Sagittarius
      2391: getstatic     #31                 // Field HAWKEYE:Lext/mods/gameserver/enums/actors/ClassId;
      2394: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      2397: putstatic     #280                // Field SAGGITARIUS:Lext/mods/gameserver/enums/actors/ClassId;
      2400: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      2403: dup
      2404: ldc_w         #831                // String ADVENTURER
      2407: bipush        93
      2409: getstatic     #530                // Field ext/mods/gameserver/enums/actors/ClassRace.HUMAN:Lext/mods/gameserver/enums/actors/ClassRace;
      2412: getstatic     #533                // Field ext/mods/gameserver/enums/actors/ClassType.FIGHTER:Lext/mods/gameserver/enums/actors/ClassType;
      2415: iconst_3
      2416: ldc_w         #832                // String Adventurer
      2419: getstatic     #28                 // Field TREASURE_HUNTER:Lext/mods/gameserver/enums/actors/ClassId;
      2422: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      2425: putstatic     #283                // Field ADVENTURER:Lext/mods/gameserver/enums/actors/ClassId;
      2428: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      2431: dup
      2432: ldc_w         #834                // String ARCHMAGE
      2435: bipush        94
      2437: getstatic     #530                // Field ext/mods/gameserver/enums/actors/ClassRace.HUMAN:Lext/mods/gameserver/enums/actors/ClassRace;
      2440: getstatic     #571                // Field ext/mods/gameserver/enums/actors/ClassType.MYSTIC:Lext/mods/gameserver/enums/actors/ClassType;
      2443: iconst_3
      2444: ldc_w         #835                // String Archmage
      2447: getstatic     #40                 // Field SORCERER:Lext/mods/gameserver/enums/actors/ClassId;
      2450: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      2453: putstatic     #286                // Field ARCHMAGE:Lext/mods/gameserver/enums/actors/ClassId;
      2456: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      2459: dup
      2460: ldc_w         #837                // String SOULTAKER
      2463: bipush        95
      2465: getstatic     #530                // Field ext/mods/gameserver/enums/actors/ClassRace.HUMAN:Lext/mods/gameserver/enums/actors/ClassRace;
      2468: getstatic     #571                // Field ext/mods/gameserver/enums/actors/ClassType.MYSTIC:Lext/mods/gameserver/enums/actors/ClassType;
      2471: iconst_3
      2472: ldc_w         #838                // String Soultaker
      2475: getstatic     #43                 // Field NECROMANCER:Lext/mods/gameserver/enums/actors/ClassId;
      2478: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      2481: putstatic     #289                // Field SOULTAKER:Lext/mods/gameserver/enums/actors/ClassId;
      2484: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      2487: dup
      2488: ldc_w         #840                // String ARCANA_LORD
      2491: bipush        96
      2493: getstatic     #530                // Field ext/mods/gameserver/enums/actors/ClassRace.HUMAN:Lext/mods/gameserver/enums/actors/ClassRace;
      2496: getstatic     #571                // Field ext/mods/gameserver/enums/actors/ClassType.MYSTIC:Lext/mods/gameserver/enums/actors/ClassType;
      2499: iconst_3
      2500: ldc_w         #841                // String Arcana Lord
      2503: getstatic     #46                 // Field WARLOCK:Lext/mods/gameserver/enums/actors/ClassId;
      2506: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      2509: putstatic     #292                // Field ARCANA_LORD:Lext/mods/gameserver/enums/actors/ClassId;
      2512: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      2515: dup
      2516: ldc_w         #843                // String CARDINAL
      2519: bipush        97
      2521: getstatic     #530                // Field ext/mods/gameserver/enums/actors/ClassRace.HUMAN:Lext/mods/gameserver/enums/actors/ClassRace;
      2524: getstatic     #589                // Field ext/mods/gameserver/enums/actors/ClassType.PRIEST:Lext/mods/gameserver/enums/actors/ClassType;
      2527: iconst_3
      2528: ldc_w         #844                // String Cardinal
      2531: getstatic     #52                 // Field BISHOP:Lext/mods/gameserver/enums/actors/ClassId;
      2534: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      2537: putstatic     #295                // Field CARDINAL:Lext/mods/gameserver/enums/actors/ClassId;
      2540: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      2543: dup
      2544: ldc_w         #846                // String HIEROPHANT
      2547: bipush        98
      2549: getstatic     #530                // Field ext/mods/gameserver/enums/actors/ClassRace.HUMAN:Lext/mods/gameserver/enums/actors/ClassRace;
      2552: getstatic     #589                // Field ext/mods/gameserver/enums/actors/ClassType.PRIEST:Lext/mods/gameserver/enums/actors/ClassType;
      2555: iconst_3
      2556: ldc_w         #847                // String Hierophant
      2559: getstatic     #55                 // Field PROPHET:Lext/mods/gameserver/enums/actors/ClassId;
      2562: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      2565: putstatic     #298                // Field HIEROPHANT:Lext/mods/gameserver/enums/actors/ClassId;
      2568: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      2571: dup
      2572: ldc_w         #849                // String EVAS_TEMPLAR
      2575: bipush        99
      2577: getstatic     #432                // Field ext/mods/gameserver/enums/actors/ClassRace.ELF:Lext/mods/gameserver/enums/actors/ClassRace;
      2580: getstatic     #533                // Field ext/mods/gameserver/enums/actors/ClassType.FIGHTER:Lext/mods/gameserver/enums/actors/ClassType;
      2583: iconst_3
      2584: ldc_w         #850                // String Eva\'s Templar
      2587: getstatic     #64                 // Field TEMPLE_KNIGHT:Lext/mods/gameserver/enums/actors/ClassId;
      2590: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      2593: putstatic     #301                // Field EVAS_TEMPLAR:Lext/mods/gameserver/enums/actors/ClassId;
      2596: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      2599: dup
      2600: ldc_w         #852                // String SWORD_MUSE
      2603: bipush        100
      2605: getstatic     #432                // Field ext/mods/gameserver/enums/actors/ClassRace.ELF:Lext/mods/gameserver/enums/actors/ClassRace;
      2608: getstatic     #533                // Field ext/mods/gameserver/enums/actors/ClassType.FIGHTER:Lext/mods/gameserver/enums/actors/ClassType;
      2611: iconst_3
      2612: ldc_w         #853                // String Sword Muse
      2615: getstatic     #67                 // Field SWORD_SINGER:Lext/mods/gameserver/enums/actors/ClassId;
      2618: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      2621: putstatic     #304                // Field SWORD_MUSE:Lext/mods/gameserver/enums/actors/ClassId;
      2624: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      2627: dup
      2628: ldc_w         #855                // String WIND_RIDER
      2631: bipush        101
      2633: getstatic     #432                // Field ext/mods/gameserver/enums/actors/ClassRace.ELF:Lext/mods/gameserver/enums/actors/ClassRace;
      2636: getstatic     #533                // Field ext/mods/gameserver/enums/actors/ClassType.FIGHTER:Lext/mods/gameserver/enums/actors/ClassType;
      2639: iconst_3
      2640: ldc_w         #856                // String Wind Rider
      2643: getstatic     #73                 // Field PLAINS_WALKER:Lext/mods/gameserver/enums/actors/ClassId;
      2646: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      2649: putstatic     #307                // Field WIND_RIDER:Lext/mods/gameserver/enums/actors/ClassId;
      2652: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      2655: dup
      2656: ldc_w         #858                // String MOONLIGHT_SENTINEL
      2659: bipush        102
      2661: getstatic     #432                // Field ext/mods/gameserver/enums/actors/ClassRace.ELF:Lext/mods/gameserver/enums/actors/ClassRace;
      2664: getstatic     #533                // Field ext/mods/gameserver/enums/actors/ClassType.FIGHTER:Lext/mods/gameserver/enums/actors/ClassType;
      2667: iconst_3
      2668: ldc_w         #859                // String Moonlight Sentinel
      2671: getstatic     #76                 // Field SILVER_RANGER:Lext/mods/gameserver/enums/actors/ClassId;
      2674: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      2677: putstatic     #310                // Field MOONLIGHT_SENTINEL:Lext/mods/gameserver/enums/actors/ClassId;
      2680: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      2683: dup
      2684: ldc_w         #861                // String MYSTIC_MUSE
      2687: bipush        103
      2689: getstatic     #432                // Field ext/mods/gameserver/enums/actors/ClassRace.ELF:Lext/mods/gameserver/enums/actors/ClassRace;
      2692: getstatic     #571                // Field ext/mods/gameserver/enums/actors/ClassType.MYSTIC:Lext/mods/gameserver/enums/actors/ClassType;
      2695: iconst_3
      2696: ldc_w         #862                // String Mystic Muse
      2699: getstatic     #85                 // Field SPELLSINGER:Lext/mods/gameserver/enums/actors/ClassId;
      2702: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      2705: putstatic     #313                // Field MYSTIC_MUSE:Lext/mods/gameserver/enums/actors/ClassId;
      2708: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      2711: dup
      2712: ldc_w         #864                // String ELEMENTAL_MASTER
      2715: bipush        104
      2717: getstatic     #432                // Field ext/mods/gameserver/enums/actors/ClassRace.ELF:Lext/mods/gameserver/enums/actors/ClassRace;
      2720: getstatic     #571                // Field ext/mods/gameserver/enums/actors/ClassType.MYSTIC:Lext/mods/gameserver/enums/actors/ClassType;
      2723: iconst_3
      2724: ldc_w         #865                // String Elemental Master
      2727: getstatic     #88                 // Field ELEMENTAL_SUMMONER:Lext/mods/gameserver/enums/actors/ClassId;
      2730: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      2733: putstatic     #316                // Field ELEMENTAL_MASTER:Lext/mods/gameserver/enums/actors/ClassId;
      2736: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      2739: dup
      2740: ldc_w         #867                // String EVAS_SAINT
      2743: bipush        105
      2745: getstatic     #432                // Field ext/mods/gameserver/enums/actors/ClassRace.ELF:Lext/mods/gameserver/enums/actors/ClassRace;
      2748: getstatic     #589                // Field ext/mods/gameserver/enums/actors/ClassType.PRIEST:Lext/mods/gameserver/enums/actors/ClassType;
      2751: iconst_3
      2752: ldc_w         #868                // String Eva\'s Saint
      2755: getstatic     #94                 // Field ELVEN_ELDER:Lext/mods/gameserver/enums/actors/ClassId;
      2758: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      2761: putstatic     #319                // Field EVAS_SAINT:Lext/mods/gameserver/enums/actors/ClassId;
      2764: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      2767: dup
      2768: ldc_w         #870                // String SHILLIEN_TEMPLAR
      2771: bipush        106
      2773: getstatic     #437                // Field ext/mods/gameserver/enums/actors/ClassRace.DARK_ELF:Lext/mods/gameserver/enums/actors/ClassRace;
      2776: getstatic     #533                // Field ext/mods/gameserver/enums/actors/ClassType.FIGHTER:Lext/mods/gameserver/enums/actors/ClassType;
      2779: iconst_3
      2780: ldc_w         #871                // String Shillien Templar
      2783: getstatic     #103                // Field SHILLIEN_KNIGHT:Lext/mods/gameserver/enums/actors/ClassId;
      2786: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      2789: putstatic     #322                // Field SHILLIEN_TEMPLAR:Lext/mods/gameserver/enums/actors/ClassId;
      2792: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      2795: dup
      2796: ldc_w         #873                // String SPECTRAL_DANCER
      2799: bipush        107
      2801: getstatic     #437                // Field ext/mods/gameserver/enums/actors/ClassRace.DARK_ELF:Lext/mods/gameserver/enums/actors/ClassRace;
      2804: getstatic     #533                // Field ext/mods/gameserver/enums/actors/ClassType.FIGHTER:Lext/mods/gameserver/enums/actors/ClassType;
      2807: iconst_3
      2808: ldc_w         #874                // String Spectral Dancer
      2811: getstatic     #106                // Field BLADEDANCER:Lext/mods/gameserver/enums/actors/ClassId;
      2814: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      2817: putstatic     #325                // Field SPECTRAL_DANCER:Lext/mods/gameserver/enums/actors/ClassId;
      2820: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      2823: dup
      2824: ldc_w         #876                // String GHOST_HUNTER
      2827: bipush        108
      2829: getstatic     #437                // Field ext/mods/gameserver/enums/actors/ClassRace.DARK_ELF:Lext/mods/gameserver/enums/actors/ClassRace;
      2832: getstatic     #533                // Field ext/mods/gameserver/enums/actors/ClassType.FIGHTER:Lext/mods/gameserver/enums/actors/ClassType;
      2835: iconst_3
      2836: ldc_w         #877                // String Ghost Hunter
      2839: getstatic     #112                // Field ABYSS_WALKER:Lext/mods/gameserver/enums/actors/ClassId;
      2842: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      2845: putstatic     #328                // Field GHOST_HUNTER:Lext/mods/gameserver/enums/actors/ClassId;
      2848: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      2851: dup
      2852: ldc_w         #879                // String GHOST_SENTINEL
      2855: bipush        109
      2857: getstatic     #437                // Field ext/mods/gameserver/enums/actors/ClassRace.DARK_ELF:Lext/mods/gameserver/enums/actors/ClassRace;
      2860: getstatic     #533                // Field ext/mods/gameserver/enums/actors/ClassType.FIGHTER:Lext/mods/gameserver/enums/actors/ClassType;
      2863: iconst_3
      2864: ldc_w         #880                // String Ghost Sentinel
      2867: getstatic     #115                // Field PHANTOM_RANGER:Lext/mods/gameserver/enums/actors/ClassId;
      2870: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      2873: putstatic     #331                // Field GHOST_SENTINEL:Lext/mods/gameserver/enums/actors/ClassId;
      2876: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      2879: dup
      2880: ldc_w         #882                // String STORM_SCREAMER
      2883: bipush        110
      2885: getstatic     #437                // Field ext/mods/gameserver/enums/actors/ClassRace.DARK_ELF:Lext/mods/gameserver/enums/actors/ClassRace;
      2888: getstatic     #571                // Field ext/mods/gameserver/enums/actors/ClassType.MYSTIC:Lext/mods/gameserver/enums/actors/ClassType;
      2891: iconst_3
      2892: ldc_w         #883                // String Storm Screamer
      2895: getstatic     #124                // Field SPELLHOWLER:Lext/mods/gameserver/enums/actors/ClassId;
      2898: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      2901: putstatic     #334                // Field STORM_SCREAMER:Lext/mods/gameserver/enums/actors/ClassId;
      2904: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      2907: dup
      2908: ldc_w         #885                // String SPECTRAL_MASTER
      2911: bipush        111
      2913: getstatic     #437                // Field ext/mods/gameserver/enums/actors/ClassRace.DARK_ELF:Lext/mods/gameserver/enums/actors/ClassRace;
      2916: getstatic     #571                // Field ext/mods/gameserver/enums/actors/ClassType.MYSTIC:Lext/mods/gameserver/enums/actors/ClassType;
      2919: iconst_3
      2920: ldc_w         #886                // String Spectral Master
      2923: getstatic     #127                // Field PHANTOM_SUMMONER:Lext/mods/gameserver/enums/actors/ClassId;
      2926: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      2929: putstatic     #337                // Field SPECTRAL_MASTER:Lext/mods/gameserver/enums/actors/ClassId;
      2932: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      2935: dup
      2936: ldc_w         #888                // String SHILLIEN_SAINT
      2939: bipush        112
      2941: getstatic     #437                // Field ext/mods/gameserver/enums/actors/ClassRace.DARK_ELF:Lext/mods/gameserver/enums/actors/ClassRace;
      2944: getstatic     #589                // Field ext/mods/gameserver/enums/actors/ClassType.PRIEST:Lext/mods/gameserver/enums/actors/ClassType;
      2947: iconst_3
      2948: ldc_w         #889                // String Shillien Saint
      2951: getstatic     #133                // Field SHILLIEN_ELDER:Lext/mods/gameserver/enums/actors/ClassId;
      2954: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      2957: putstatic     #340                // Field SHILLIEN_SAINT:Lext/mods/gameserver/enums/actors/ClassId;
      2960: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      2963: dup
      2964: ldc_w         #891                // String TITAN
      2967: bipush        113
      2969: getstatic     #679                // Field ext/mods/gameserver/enums/actors/ClassRace.ORC:Lext/mods/gameserver/enums/actors/ClassRace;
      2972: getstatic     #533                // Field ext/mods/gameserver/enums/actors/ClassType.FIGHTER:Lext/mods/gameserver/enums/actors/ClassType;
      2975: iconst_3
      2976: ldc_w         #892                // String Titan
      2979: getstatic     #142                // Field DESTROYER:Lext/mods/gameserver/enums/actors/ClassId;
      2982: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      2985: putstatic     #343                // Field TITAN:Lext/mods/gameserver/enums/actors/ClassId;
      2988: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      2991: dup
      2992: ldc_w         #894                // String GRAND_KHAVATARI
      2995: bipush        114
      2997: getstatic     #679                // Field ext/mods/gameserver/enums/actors/ClassRace.ORC:Lext/mods/gameserver/enums/actors/ClassRace;
      3000: getstatic     #533                // Field ext/mods/gameserver/enums/actors/ClassType.FIGHTER:Lext/mods/gameserver/enums/actors/ClassType;
      3003: iconst_3
      3004: ldc_w         #895                // String Grand Khavatari
      3007: getstatic     #148                // Field TYRANT:Lext/mods/gameserver/enums/actors/ClassId;
      3010: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      3013: putstatic     #346                // Field GRAND_KHAVATARI:Lext/mods/gameserver/enums/actors/ClassId;
      3016: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      3019: dup
      3020: ldc_w         #897                // String DOMINATOR
      3023: bipush        115
      3025: getstatic     #679                // Field ext/mods/gameserver/enums/actors/ClassRace.ORC:Lext/mods/gameserver/enums/actors/ClassRace;
      3028: getstatic     #571                // Field ext/mods/gameserver/enums/actors/ClassType.MYSTIC:Lext/mods/gameserver/enums/actors/ClassType;
      3031: iconst_3
      3032: ldc_w         #898                // String Dominator
      3035: getstatic     #157                // Field OVERLORD:Lext/mods/gameserver/enums/actors/ClassId;
      3038: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      3041: putstatic     #349                // Field DOMINATOR:Lext/mods/gameserver/enums/actors/ClassId;
      3044: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      3047: dup
      3048: ldc_w         #900                // String DOOMCRYER
      3051: bipush        116
      3053: getstatic     #679                // Field ext/mods/gameserver/enums/actors/ClassRace.ORC:Lext/mods/gameserver/enums/actors/ClassRace;
      3056: getstatic     #571                // Field ext/mods/gameserver/enums/actors/ClassType.MYSTIC:Lext/mods/gameserver/enums/actors/ClassType;
      3059: iconst_3
      3060: ldc_w         #901                // String Doom Cryer
      3063: getstatic     #160                // Field WARCRYER:Lext/mods/gameserver/enums/actors/ClassId;
      3066: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      3069: putstatic     #352                // Field DOOMCRYER:Lext/mods/gameserver/enums/actors/ClassId;
      3072: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      3075: dup
      3076: ldc_w         #903                // String FORTUNE_SEEKER
      3079: bipush        117
      3081: getstatic     #709                // Field ext/mods/gameserver/enums/actors/ClassRace.DWARF:Lext/mods/gameserver/enums/actors/ClassRace;
      3084: getstatic     #533                // Field ext/mods/gameserver/enums/actors/ClassType.FIGHTER:Lext/mods/gameserver/enums/actors/ClassType;
      3087: iconst_3
      3088: ldc_w         #904                // String Fortune Seeker
      3091: getstatic     #169                // Field BOUNTY_HUNTER:Lext/mods/gameserver/enums/actors/ClassId;
      3094: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      3097: putstatic     #355                // Field FORTUNE_SEEKER:Lext/mods/gameserver/enums/actors/ClassId;
      3100: new           #1                  // class ext/mods/gameserver/enums/actors/ClassId
      3103: dup
      3104: ldc_w         #906                // String MAESTRO
      3107: bipush        118
      3109: getstatic     #709                // Field ext/mods/gameserver/enums/actors/ClassRace.DWARF:Lext/mods/gameserver/enums/actors/ClassRace;
      3112: getstatic     #533                // Field ext/mods/gameserver/enums/actors/ClassType.FIGHTER:Lext/mods/gameserver/enums/actors/ClassType;
      3115: iconst_3
      3116: ldc_w         #907                // String Maestro
      3119: getstatic     #175                // Field WARSMITH:Lext/mods/gameserver/enums/actors/ClassId;
      3122: invokespecial #540                // Method "<init>":(Ljava/lang/String;ILext/mods/gameserver/enums/actors/ClassRace;Lext/mods/gameserver/enums/actors/ClassType;ILjava/lang/String;Lext/mods/gameserver/enums/actors/ClassId;)V
      3125: putstatic     #358                // Field MAESTRO:Lext/mods/gameserver/enums/actors/ClassId;
      3128: invokestatic  #909                // Method $values:()[Lext/mods/gameserver/enums/actors/ClassId;
      3131: putstatic     #361                // Field $VALUES:[Lext/mods/gameserver/enums/actors/ClassId;
      3134: invokestatic  #913                // Method values:()[Lext/mods/gameserver/enums/actors/ClassId;
      3137: putstatic     #420                // Field VALUES:[Lext/mods/gameserver/enums/actors/ClassId;
      3140: getstatic     #3                  // Field HUMAN_FIGHTER:Lext/mods/gameserver/enums/actors/ClassId;
      3143: bipush        30
      3145: anewarray     #1                  // class ext/mods/gameserver/enums/actors/ClassId
      3148: dup
      3149: iconst_0
      3150: getstatic     #7                  // Field WARRIOR:Lext/mods/gameserver/enums/actors/ClassId;
      3153: aastore
      3154: dup
      3155: iconst_1
      3156: getstatic     #10                 // Field GLADIATOR:Lext/mods/gameserver/enums/actors/ClassId;
      3159: aastore
      3160: dup
      3161: iconst_2
      3162: getstatic     #13                 // Field WARLORD:Lext/mods/gameserver/enums/actors/ClassId;
      3165: aastore
      3166: dup
      3167: iconst_3
      3168: getstatic     #25                 // Field ROGUE:Lext/mods/gameserver/enums/actors/ClassId;
      3171: aastore
      3172: dup
      3173: iconst_4
      3174: getstatic     #28                 // Field TREASURE_HUNTER:Lext/mods/gameserver/enums/actors/ClassId;
      3177: aastore
      3178: dup
      3179: iconst_5
      3180: getstatic     #31                 // Field HAWKEYE:Lext/mods/gameserver/enums/actors/ClassId;
      3183: aastore
      3184: dup
      3185: bipush        6
      3187: getstatic     #58                 // Field ELVEN_FIGHTER:Lext/mods/gameserver/enums/actors/ClassId;
      3190: aastore
      3191: dup
      3192: bipush        7
      3194: getstatic     #70                 // Field ELVEN_SCOUT:Lext/mods/gameserver/enums/actors/ClassId;
      3197: aastore
      3198: dup
      3199: bipush        8
      3201: getstatic     #73                 // Field PLAINS_WALKER:Lext/mods/gameserver/enums/actors/ClassId;
      3204: aastore
      3205: dup
      3206: bipush        9
      3208: getstatic     #76                 // Field SILVER_RANGER:Lext/mods/gameserver/enums/actors/ClassId;
      3211: aastore
      3212: dup
      3213: bipush        10
      3215: getstatic     #97                 // Field DARK_FIGHTER:Lext/mods/gameserver/enums/actors/ClassId;
      3218: aastore
      3219: dup
      3220: bipush        11
      3222: getstatic     #109                // Field ASSASSIN:Lext/mods/gameserver/enums/actors/ClassId;
      3225: aastore
      3226: dup
      3227: bipush        12
      3229: getstatic     #112                // Field ABYSS_WALKER:Lext/mods/gameserver/enums/actors/ClassId;
      3232: aastore
      3233: dup
      3234: bipush        13
      3236: getstatic     #115                // Field PHANTOM_RANGER:Lext/mods/gameserver/enums/actors/ClassId;
      3239: aastore
      3240: dup
      3241: bipush        14
      3243: getstatic     #136                // Field ORC_FIGHTER:Lext/mods/gameserver/enums/actors/ClassId;
      3246: aastore
      3247: dup
      3248: bipush        15
      3250: getstatic     #139                // Field ORC_RAIDER:Lext/mods/gameserver/enums/actors/ClassId;
      3253: aastore
      3254: dup
      3255: bipush        16
      3257: getstatic     #142                // Field DESTROYER:Lext/mods/gameserver/enums/actors/ClassId;
      3260: aastore
      3261: dup
      3262: bipush        17
      3264: getstatic     #145                // Field MONK:Lext/mods/gameserver/enums/actors/ClassId;
      3267: aastore
      3268: dup
      3269: bipush        18
      3271: getstatic     #148                // Field TYRANT:Lext/mods/gameserver/enums/actors/ClassId;
      3274: aastore
      3275: dup
      3276: bipush        19
      3278: getstatic     #163                // Field DWARVEN_FIGHTER:Lext/mods/gameserver/enums/actors/ClassId;
      3281: aastore
      3282: dup
      3283: bipush        20
      3285: getstatic     #268                // Field DUELIST:Lext/mods/gameserver/enums/actors/ClassId;
      3288: aastore
      3289: dup
      3290: bipush        21
      3292: getstatic     #271                // Field DREADNOUGHT:Lext/mods/gameserver/enums/actors/ClassId;
      3295: aastore
      3296: dup
      3297: bipush        22
      3299: getstatic     #283                // Field ADVENTURER:Lext/mods/gameserver/enums/actors/ClassId;
      3302: aastore
      3303: dup
      3304: bipush        23
      3306: getstatic     #280                // Field SAGGITARIUS:Lext/mods/gameserver/enums/actors/ClassId;
      3309: aastore
      3310: dup
      3311: bipush        24
      3313: getstatic     #310                // Field MOONLIGHT_SENTINEL:Lext/mods/gameserver/enums/actors/ClassId;
      3316: aastore
      3317: dup
      3318: bipush        25
      3320: getstatic     #307                // Field WIND_RIDER:Lext/mods/gameserver/enums/actors/ClassId;
      3323: aastore
      3324: dup
      3325: bipush        26
      3327: getstatic     #328                // Field GHOST_HUNTER:Lext/mods/gameserver/enums/actors/ClassId;
      3330: aastore
      3331: dup
      3332: bipush        27
      3334: getstatic     #331                // Field GHOST_SENTINEL:Lext/mods/gameserver/enums/actors/ClassId;
      3337: aastore
      3338: dup
      3339: bipush        28
      3341: getstatic     #343                // Field TITAN:Lext/mods/gameserver/enums/actors/ClassId;
      3344: aastore
      3345: dup
      3346: bipush        29
      3348: getstatic     #346                // Field GRAND_KHAVATARI:Lext/mods/gameserver/enums/actors/ClassId;
      3351: aastore
      3352: invokestatic  #916                // Method java/util/EnumSet.of:(Ljava/lang/Enum;[Ljava/lang/Enum;)Ljava/util/EnumSet;
      3355: putstatic     #493                // Field ATTACKER_GROUP:Ljava/util/Set;
      3358: getstatic     #3                  // Field HUMAN_FIGHTER:Lext/mods/gameserver/enums/actors/ClassId;
      3361: bipush        51
      3363: anewarray     #1                  // class ext/mods/gameserver/enums/actors/ClassId
      3366: dup
      3367: iconst_0
      3368: getstatic     #7                  // Field WARRIOR:Lext/mods/gameserver/enums/actors/ClassId;
      3371: aastore
      3372: dup
      3373: iconst_1
      3374: getstatic     #10                 // Field GLADIATOR:Lext/mods/gameserver/enums/actors/ClassId;
      3377: aastore
      3378: dup
      3379: iconst_2
      3380: getstatic     #13                 // Field WARLORD:Lext/mods/gameserver/enums/actors/ClassId;
      3383: aastore
      3384: dup
      3385: iconst_3
      3386: getstatic     #16                 // Field KNIGHT:Lext/mods/gameserver/enums/actors/ClassId;
      3389: aastore
      3390: dup
      3391: iconst_4
      3392: getstatic     #19                 // Field PALADIN:Lext/mods/gameserver/enums/actors/ClassId;
      3395: aastore
      3396: dup
      3397: iconst_5
      3398: getstatic     #22                 // Field DARK_AVENGER:Lext/mods/gameserver/enums/actors/ClassId;
      3401: aastore
      3402: dup
      3403: bipush        6
      3405: getstatic     #25                 // Field ROGUE:Lext/mods/gameserver/enums/actors/ClassId;
      3408: aastore
      3409: dup
      3410: bipush        7
      3412: getstatic     #28                 // Field TREASURE_HUNTER:Lext/mods/gameserver/enums/actors/ClassId;
      3415: aastore
      3416: dup
      3417: bipush        8
      3419: getstatic     #31                 // Field HAWKEYE:Lext/mods/gameserver/enums/actors/ClassId;
      3422: aastore
      3423: dup
      3424: bipush        9
      3426: getstatic     #58                 // Field ELVEN_FIGHTER:Lext/mods/gameserver/enums/actors/ClassId;
      3429: aastore
      3430: dup
      3431: bipush        10
      3433: getstatic     #61                 // Field ELVEN_KNIGHT:Lext/mods/gameserver/enums/actors/ClassId;
      3436: aastore
      3437: dup
      3438: bipush        11
      3440: getstatic     #64                 // Field TEMPLE_KNIGHT:Lext/mods/gameserver/enums/actors/ClassId;
      3443: aastore
      3444: dup
      3445: bipush        12
      3447: getstatic     #67                 // Field SWORD_SINGER:Lext/mods/gameserver/enums/actors/ClassId;
      3450: aastore
      3451: dup
      3452: bipush        13
      3454: getstatic     #70                 // Field ELVEN_SCOUT:Lext/mods/gameserver/enums/actors/ClassId;
      3457: aastore
      3458: dup
      3459: bipush        14
      3461: getstatic     #73                 // Field PLAINS_WALKER:Lext/mods/gameserver/enums/actors/ClassId;
      3464: aastore
      3465: dup
      3466: bipush        15
      3468: getstatic     #76                 // Field SILVER_RANGER:Lext/mods/gameserver/enums/actors/ClassId;
      3471: aastore
      3472: dup
      3473: bipush        16
      3475: getstatic     #97                 // Field DARK_FIGHTER:Lext/mods/gameserver/enums/actors/ClassId;
      3478: aastore
      3479: dup
      3480: bipush        17
      3482: getstatic     #100                // Field PALUS_KNIGHT:Lext/mods/gameserver/enums/actors/ClassId;
      3485: aastore
      3486: dup
      3487: bipush        18
      3489: getstatic     #103                // Field SHILLIEN_KNIGHT:Lext/mods/gameserver/enums/actors/ClassId;
      3492: aastore
      3493: dup
      3494: bipush        19
      3496: getstatic     #106                // Field BLADEDANCER:Lext/mods/gameserver/enums/actors/ClassId;
      3499: aastore
      3500: dup
      3501: bipush        20
      3503: getstatic     #109                // Field ASSASSIN:Lext/mods/gameserver/enums/actors/ClassId;
      3506: aastore
      3507: dup
      3508: bipush        21
      3510: getstatic     #112                // Field ABYSS_WALKER:Lext/mods/gameserver/enums/actors/ClassId;
      3513: aastore
      3514: dup
      3515: bipush        22
      3517: getstatic     #115                // Field PHANTOM_RANGER:Lext/mods/gameserver/enums/actors/ClassId;
      3520: aastore
      3521: dup
      3522: bipush        23
      3524: getstatic     #136                // Field ORC_FIGHTER:Lext/mods/gameserver/enums/actors/ClassId;
      3527: aastore
      3528: dup
      3529: bipush        24
      3531: getstatic     #139                // Field ORC_RAIDER:Lext/mods/gameserver/enums/actors/ClassId;
      3534: aastore
      3535: dup
      3536: bipush        25
      3538: getstatic     #142                // Field DESTROYER:Lext/mods/gameserver/enums/actors/ClassId;
      3541: aastore
      3542: dup
      3543: bipush        26
      3545: getstatic     #145                // Field MONK:Lext/mods/gameserver/enums/actors/ClassId;
      3548: aastore
      3549: dup
      3550: bipush        27
      3552: getstatic     #148                // Field TYRANT:Lext/mods/gameserver/enums/actors/ClassId;
      3555: aastore
      3556: dup
      3557: bipush        28
      3559: getstatic     #163                // Field DWARVEN_FIGHTER:Lext/mods/gameserver/enums/actors/ClassId;
      3562: aastore
      3563: dup
      3564: bipush        29
      3566: getstatic     #166                // Field SCAVENGER:Lext/mods/gameserver/enums/actors/ClassId;
      3569: aastore
      3570: dup
      3571: bipush        30
      3573: getstatic     #169                // Field BOUNTY_HUNTER:Lext/mods/gameserver/enums/actors/ClassId;
      3576: aastore
      3577: dup
      3578: bipush        31
      3580: getstatic     #172                // Field ARTISAN:Lext/mods/gameserver/enums/actors/ClassId;
      3583: aastore
      3584: dup
      3585: bipush        32
      3587: getstatic     #175                // Field WARSMITH:Lext/mods/gameserver/enums/actors/ClassId;
      3590: aastore
      3591: dup
      3592: bipush        33
      3594: getstatic     #268                // Field DUELIST:Lext/mods/gameserver/enums/actors/ClassId;
      3597: aastore
      3598: dup
      3599: bipush        34
      3601: getstatic     #271                // Field DREADNOUGHT:Lext/mods/gameserver/enums/actors/ClassId;
      3604: aastore
      3605: dup
      3606: bipush        35
      3608: getstatic     #274                // Field PHOENIX_KNIGHT:Lext/mods/gameserver/enums/actors/ClassId;
      3611: aastore
      3612: dup
      3613: bipush        36
      3615: getstatic     #277                // Field HELL_KNIGHT:Lext/mods/gameserver/enums/actors/ClassId;
      3618: aastore
      3619: dup
      3620: bipush        37
      3622: getstatic     #280                // Field SAGGITARIUS:Lext/mods/gameserver/enums/actors/ClassId;
      3625: aastore
      3626: dup
      3627: bipush        38
      3629: getstatic     #283                // Field ADVENTURER:Lext/mods/gameserver/enums/actors/ClassId;
      3632: aastore
      3633: dup
      3634: bipush        39
      3636: getstatic     #301                // Field EVAS_TEMPLAR:Lext/mods/gameserver/enums/actors/ClassId;
      3639: aastore
      3640: dup
      3641: bipush        40
      3643: getstatic     #304                // Field SWORD_MUSE:Lext/mods/gameserver/enums/actors/ClassId;
      3646: aastore
      3647: dup
      3648: bipush        41
      3650: getstatic     #307                // Field WIND_RIDER:Lext/mods/gameserver/enums/actors/ClassId;
      3653: aastore
      3654: dup
      3655: bipush        42
      3657: getstatic     #310                // Field MOONLIGHT_SENTINEL:Lext/mods/gameserver/enums/actors/ClassId;
      3660: aastore
      3661: dup
      3662: bipush        43
      3664: getstatic     #322                // Field SHILLIEN_TEMPLAR:Lext/mods/gameserver/enums/actors/ClassId;
      3667: aastore
      3668: dup
      3669: bipush        44
      3671: getstatic     #325                // Field SPECTRAL_DANCER:Lext/mods/gameserver/enums/actors/ClassId;
      3674: aastore
      3675: dup
      3676: bipush        45
      3678: getstatic     #328                // Field GHOST_HUNTER:Lext/mods/gameserver/enums/actors/ClassId;
      3681: aastore
      3682: dup
      3683: bipush        46
      3685: getstatic     #331                // Field GHOST_SENTINEL:Lext/mods/gameserver/enums/actors/ClassId;
      3688: aastore
      3689: dup
      3690: bipush        47
      3692: getstatic     #343                // Field TITAN:Lext/mods/gameserver/enums/actors/ClassId;
      3695: aastore
      3696: dup
      3697: bipush        48
      3699: getstatic     #346                // Field GRAND_KHAVATARI:Lext/mods/gameserver/enums/actors/ClassId;
      3702: aastore
      3703: dup
      3704: bipush        49
      3706: getstatic     #355                // Field FORTUNE_SEEKER:Lext/mods/gameserver/enums/actors/ClassId;
      3709: aastore
      3710: dup
      3711: bipush        50
      3713: getstatic     #358                // Field MAESTRO:Lext/mods/gameserver/enums/actors/ClassId;
      3716: aastore
      3717: invokestatic  #916                // Method java/util/EnumSet.of:(Ljava/lang/Enum;[Ljava/lang/Enum;)Ljava/util/EnumSet;
      3720: putstatic     #506                // Field FIGHTER_GROUP:Ljava/util/Set;
      3723: getstatic     #34                 // Field HUMAN_MYSTIC:Lext/mods/gameserver/enums/actors/ClassId;
      3726: bipush        36
      3728: anewarray     #1                  // class ext/mods/gameserver/enums/actors/ClassId
      3731: dup
      3732: iconst_0
      3733: getstatic     #37                 // Field HUMAN_WIZARD:Lext/mods/gameserver/enums/actors/ClassId;
      3736: aastore
      3737: dup
      3738: iconst_1
      3739: getstatic     #40                 // Field SORCERER:Lext/mods/gameserver/enums/actors/ClassId;
      3742: aastore
      3743: dup
      3744: iconst_2
      3745: getstatic     #43                 // Field NECROMANCER:Lext/mods/gameserver/enums/actors/ClassId;
      3748: aastore
      3749: dup
      3750: iconst_3
      3751: getstatic     #46                 // Field WARLOCK:Lext/mods/gameserver/enums/actors/ClassId;
      3754: aastore
      3755: dup
      3756: iconst_4
      3757: getstatic     #49                 // Field CLERIC:Lext/mods/gameserver/enums/actors/ClassId;
      3760: aastore
      3761: dup
      3762: iconst_5
      3763: getstatic     #52                 // Field BISHOP:Lext/mods/gameserver/enums/actors/ClassId;
      3766: aastore
      3767: dup
      3768: bipush        6
      3770: getstatic     #55                 // Field PROPHET:Lext/mods/gameserver/enums/actors/ClassId;
      3773: aastore
      3774: dup
      3775: bipush        7
      3777: getstatic     #79                 // Field ELVEN_MYSTIC:Lext/mods/gameserver/enums/actors/ClassId;
      3780: aastore
      3781: dup
      3782: bipush        8
      3784: getstatic     #82                 // Field ELVEN_WIZARD:Lext/mods/gameserver/enums/actors/ClassId;
      3787: aastore
      3788: dup
      3789: bipush        9
      3791: getstatic     #85                 // Field SPELLSINGER:Lext/mods/gameserver/enums/actors/ClassId;
      3794: aastore
      3795: dup
      3796: bipush        10
      3798: getstatic     #88                 // Field ELEMENTAL_SUMMONER:Lext/mods/gameserver/enums/actors/ClassId;
      3801: aastore
      3802: dup
      3803: bipush        11
      3805: getstatic     #91                 // Field ELVEN_ORACLE:Lext/mods/gameserver/enums/actors/ClassId;
      3808: aastore
      3809: dup
      3810: bipush        12
      3812: getstatic     #94                 // Field ELVEN_ELDER:Lext/mods/gameserver/enums/actors/ClassId;
      3815: aastore
      3816: dup
      3817: bipush        13
      3819: getstatic     #118                // Field DARK_MYSTIC:Lext/mods/gameserver/enums/actors/ClassId;
      3822: aastore
      3823: dup
      3824: bipush        14
      3826: getstatic     #121                // Field DARK_WIZARD:Lext/mods/gameserver/enums/actors/ClassId;
      3829: aastore
      3830: dup
      3831: bipush        15
      3833: getstatic     #124                // Field SPELLHOWLER:Lext/mods/gameserver/enums/actors/ClassId;
      3836: aastore
      3837: dup
      3838: bipush        16
      3840: getstatic     #127                // Field PHANTOM_SUMMONER:Lext/mods/gameserver/enums/actors/ClassId;
      3843: aastore
      3844: dup
      3845: bipush        17
      3847: getstatic     #130                // Field SHILLIEN_ORACLE:Lext/mods/gameserver/enums/actors/ClassId;
      3850: aastore
      3851: dup
      3852: bipush        18
      3854: getstatic     #133                // Field SHILLIEN_ELDER:Lext/mods/gameserver/enums/actors/ClassId;
      3857: aastore
      3858: dup
      3859: bipush        19
      3861: getstatic     #151                // Field ORC_MYSTIC:Lext/mods/gameserver/enums/actors/ClassId;
      3864: aastore
      3865: dup
      3866: bipush        20
      3868: getstatic     #154                // Field ORC_SHAMAN:Lext/mods/gameserver/enums/actors/ClassId;
      3871: aastore
      3872: dup
      3873: bipush        21
      3875: getstatic     #157                // Field OVERLORD:Lext/mods/gameserver/enums/actors/ClassId;
      3878: aastore
      3879: dup
      3880: bipush        22
      3882: getstatic     #160                // Field WARCRYER:Lext/mods/gameserver/enums/actors/ClassId;
      3885: aastore
      3886: dup
      3887: bipush        23
      3889: getstatic     #286                // Field ARCHMAGE:Lext/mods/gameserver/enums/actors/ClassId;
      3892: aastore
      3893: dup
      3894: bipush        24
      3896: getstatic     #289                // Field SOULTAKER:Lext/mods/gameserver/enums/actors/ClassId;
      3899: aastore
      3900: dup
      3901: bipush        25
      3903: getstatic     #292                // Field ARCANA_LORD:Lext/mods/gameserver/enums/actors/ClassId;
      3906: aastore
      3907: dup
      3908: bipush        26
      3910: getstatic     #295                // Field CARDINAL:Lext/mods/gameserver/enums/actors/ClassId;
      3913: aastore
      3914: dup
      3915: bipush        27
      3917: getstatic     #298                // Field HIEROPHANT:Lext/mods/gameserver/enums/actors/ClassId;
      3920: aastore
      3921: dup
      3922: bipush        28
      3924: getstatic     #313                // Field MYSTIC_MUSE:Lext/mods/gameserver/enums/actors/ClassId;
      3927: aastore
      3928: dup
      3929: bipush        29
      3931: getstatic     #316                // Field ELEMENTAL_MASTER:Lext/mods/gameserver/enums/actors/ClassId;
      3934: aastore
      3935: dup
      3936: bipush        30
      3938: getstatic     #319                // Field EVAS_SAINT:Lext/mods/gameserver/enums/actors/ClassId;
      3941: aastore
      3942: dup
      3943: bipush        31
      3945: getstatic     #334                // Field STORM_SCREAMER:Lext/mods/gameserver/enums/actors/ClassId;
      3948: aastore
      3949: dup
      3950: bipush        32
      3952: getstatic     #337                // Field SPECTRAL_MASTER:Lext/mods/gameserver/enums/actors/ClassId;
      3955: aastore
      3956: dup
      3957: bipush        33
      3959: getstatic     #340                // Field SHILLIEN_SAINT:Lext/mods/gameserver/enums/actors/ClassId;
      3962: aastore
      3963: dup
      3964: bipush        34
      3966: getstatic     #349                // Field DOMINATOR:Lext/mods/gameserver/enums/actors/ClassId;
      3969: aastore
      3970: dup
      3971: bipush        35
      3973: getstatic     #352                // Field DOOMCRYER:Lext/mods/gameserver/enums/actors/ClassId;
      3976: aastore
      3977: invokestatic  #916                // Method java/util/EnumSet.of:(Ljava/lang/Enum;[Ljava/lang/Enum;)Ljava/util/EnumSet;
      3980: putstatic     #509                // Field MAGE_GROUP:Ljava/util/Set;
      3983: getstatic     #34                 // Field HUMAN_MYSTIC:Lext/mods/gameserver/enums/actors/ClassId;
      3986: bipush        25
      3988: anewarray     #1                  // class ext/mods/gameserver/enums/actors/ClassId
      3991: dup
      3992: iconst_0
      3993: getstatic     #37                 // Field HUMAN_WIZARD:Lext/mods/gameserver/enums/actors/ClassId;
      3996: aastore
      3997: dup
      3998: iconst_1
      3999: getstatic     #40                 // Field SORCERER:Lext/mods/gameserver/enums/actors/ClassId;
      4002: aastore
      4003: dup
      4004: iconst_2
      4005: getstatic     #43                 // Field NECROMANCER:Lext/mods/gameserver/enums/actors/ClassId;
      4008: aastore
      4009: dup
      4010: iconst_3
      4011: getstatic     #46                 // Field WARLOCK:Lext/mods/gameserver/enums/actors/ClassId;
      4014: aastore
      4015: dup
      4016: iconst_4
      4017: getstatic     #79                 // Field ELVEN_MYSTIC:Lext/mods/gameserver/enums/actors/ClassId;
      4020: aastore
      4021: dup
      4022: iconst_5
      4023: getstatic     #82                 // Field ELVEN_WIZARD:Lext/mods/gameserver/enums/actors/ClassId;
      4026: aastore
      4027: dup
      4028: bipush        6
      4030: getstatic     #85                 // Field SPELLSINGER:Lext/mods/gameserver/enums/actors/ClassId;
      4033: aastore
      4034: dup
      4035: bipush        7
      4037: getstatic     #88                 // Field ELEMENTAL_SUMMONER:Lext/mods/gameserver/enums/actors/ClassId;
      4040: aastore
      4041: dup
      4042: bipush        8
      4044: getstatic     #118                // Field DARK_MYSTIC:Lext/mods/gameserver/enums/actors/ClassId;
      4047: aastore
      4048: dup
      4049: bipush        9
      4051: getstatic     #121                // Field DARK_WIZARD:Lext/mods/gameserver/enums/actors/ClassId;
      4054: aastore
      4055: dup
      4056: bipush        10
      4058: getstatic     #124                // Field SPELLHOWLER:Lext/mods/gameserver/enums/actors/ClassId;
      4061: aastore
      4062: dup
      4063: bipush        11
      4065: getstatic     #127                // Field PHANTOM_SUMMONER:Lext/mods/gameserver/enums/actors/ClassId;
      4068: aastore
      4069: dup
      4070: bipush        12
      4072: getstatic     #151                // Field ORC_MYSTIC:Lext/mods/gameserver/enums/actors/ClassId;
      4075: aastore
      4076: dup
      4077: bipush        13
      4079: getstatic     #154                // Field ORC_SHAMAN:Lext/mods/gameserver/enums/actors/ClassId;
      4082: aastore
      4083: dup
      4084: bipush        14
      4086: getstatic     #157                // Field OVERLORD:Lext/mods/gameserver/enums/actors/ClassId;
      4089: aastore
      4090: dup
      4091: bipush        15
      4093: getstatic     #160                // Field WARCRYER:Lext/mods/gameserver/enums/actors/ClassId;
      4096: aastore
      4097: dup
      4098: bipush        16
      4100: getstatic     #286                // Field ARCHMAGE:Lext/mods/gameserver/enums/actors/ClassId;
      4103: aastore
      4104: dup
      4105: bipush        17
      4107: getstatic     #289                // Field SOULTAKER:Lext/mods/gameserver/enums/actors/ClassId;
      4110: aastore
      4111: dup
      4112: bipush        18
      4114: getstatic     #292                // Field ARCANA_LORD:Lext/mods/gameserver/enums/actors/ClassId;
      4117: aastore
      4118: dup
      4119: bipush        19
      4121: getstatic     #313                // Field MYSTIC_MUSE:Lext/mods/gameserver/enums/actors/ClassId;
      4124: aastore
      4125: dup
      4126: bipush        20
      4128: getstatic     #316                // Field ELEMENTAL_MASTER:Lext/mods/gameserver/enums/actors/ClassId;
      4131: aastore
      4132: dup
      4133: bipush        21
      4135: getstatic     #334                // Field STORM_SCREAMER:Lext/mods/gameserver/enums/actors/ClassId;
      4138: aastore
      4139: dup
      4140: bipush        22
      4142: getstatic     #337                // Field SPECTRAL_MASTER:Lext/mods/gameserver/enums/actors/ClassId;
      4145: aastore
      4146: dup
      4147: bipush        23
      4149: getstatic     #349                // Field DOMINATOR:Lext/mods/gameserver/enums/actors/ClassId;
      4152: aastore
      4153: dup
      4154: bipush        24
      4156: getstatic     #352                // Field DOOMCRYER:Lext/mods/gameserver/enums/actors/ClassId;
      4159: aastore
      4160: invokestatic  #916                // Method java/util/EnumSet.of:(Ljava/lang/Enum;[Ljava/lang/Enum;)Ljava/util/EnumSet;
      4163: putstatic     #512                // Field WIZARD_GROUP:Ljava/util/Set;
      4166: getstatic     #34                 // Field HUMAN_MYSTIC:Lext/mods/gameserver/enums/actors/ClassId;
      4169: bipush        12
      4171: anewarray     #1                  // class ext/mods/gameserver/enums/actors/ClassId
      4174: dup
      4175: iconst_0
      4176: getstatic     #49                 // Field CLERIC:Lext/mods/gameserver/enums/actors/ClassId;
      4179: aastore
      4180: dup
      4181: iconst_1
      4182: getstatic     #52                 // Field BISHOP:Lext/mods/gameserver/enums/actors/ClassId;
      4185: aastore
      4186: dup
      4187: iconst_2
      4188: getstatic     #55                 // Field PROPHET:Lext/mods/gameserver/enums/actors/ClassId;
      4191: aastore
      4192: dup
      4193: iconst_3
      4194: getstatic     #79                 // Field ELVEN_MYSTIC:Lext/mods/gameserver/enums/actors/ClassId;
      4197: aastore
      4198: dup
      4199: iconst_4
      4200: getstatic     #91                 // Field ELVEN_ORACLE:Lext/mods/gameserver/enums/actors/ClassId;
      4203: aastore
      4204: dup
      4205: iconst_5
      4206: getstatic     #94                 // Field ELVEN_ELDER:Lext/mods/gameserver/enums/actors/ClassId;
      4209: aastore
      4210: dup
      4211: bipush        6
      4213: getstatic     #118                // Field DARK_MYSTIC:Lext/mods/gameserver/enums/actors/ClassId;
      4216: aastore
      4217: dup
      4218: bipush        7
      4220: getstatic     #130                // Field SHILLIEN_ORACLE:Lext/mods/gameserver/enums/actors/ClassId;
      4223: aastore
      4224: dup
      4225: bipush        8
      4227: getstatic     #133                // Field SHILLIEN_ELDER:Lext/mods/gameserver/enums/actors/ClassId;
      4230: aastore
      4231: dup
      4232: bipush        9
      4234: getstatic     #295                // Field CARDINAL:Lext/mods/gameserver/enums/actors/ClassId;
      4237: aastore
      4238: dup
      4239: bipush        10
      4241: getstatic     #298                // Field HIEROPHANT:Lext/mods/gameserver/enums/actors/ClassId;
      4244: aastore
      4245: dup
      4246: bipush        11
      4248: getstatic     #319                // Field EVAS_SAINT:Lext/mods/gameserver/enums/actors/ClassId;
      4251: aastore
      4252: invokestatic  #916                // Method java/util/EnumSet.of:(Ljava/lang/Enum;[Ljava/lang/Enum;)Ljava/util/EnumSet;
      4255: putstatic     #515                // Field CLERIC_GROUP:Ljava/util/Set;
      4258: getstatic     #19                 // Field PALADIN:Lext/mods/gameserver/enums/actors/ClassId;
      4261: bipush        7
      4263: anewarray     #1                  // class ext/mods/gameserver/enums/actors/ClassId
      4266: dup
      4267: iconst_0
      4268: getstatic     #22                 // Field DARK_AVENGER:Lext/mods/gameserver/enums/actors/ClassId;
      4271: aastore
      4272: dup
      4273: iconst_1
      4274: getstatic     #103                // Field SHILLIEN_KNIGHT:Lext/mods/gameserver/enums/actors/ClassId;
      4277: aastore
      4278: dup
      4279: iconst_2
      4280: getstatic     #64                 // Field TEMPLE_KNIGHT:Lext/mods/gameserver/enums/actors/ClassId;
      4283: aastore
      4284: dup
      4285: iconst_3
      4286: getstatic     #274                // Field PHOENIX_KNIGHT:Lext/mods/gameserver/enums/actors/ClassId;
      4289: aastore
      4290: dup
      4291: iconst_4
      4292: getstatic     #277                // Field HELL_KNIGHT:Lext/mods/gameserver/enums/actors/ClassId;
      4295: aastore
      4296: dup
      4297: iconst_5
      4298: getstatic     #322                // Field SHILLIEN_TEMPLAR:Lext/mods/gameserver/enums/actors/ClassId;
      4301: aastore
      4302: dup
      4303: bipush        6
      4305: getstatic     #301                // Field EVAS_TEMPLAR:Lext/mods/gameserver/enums/actors/ClassId;
      4308: aastore
      4309: invokestatic  #916                // Method java/util/EnumSet.of:(Ljava/lang/Enum;[Ljava/lang/Enum;)Ljava/util/EnumSet;
      4312: putstatic     #518                // Field SUBJOB_KNIGHT_GROUP:Ljava/util/Set;
      4315: getstatic     #420                // Field VALUES:[Lext/mods/gameserver/enums/actors/ClassId;
      4318: astore_0
      4319: aload_0
      4320: arraylength
      4321: istore_1
      4322: iconst_0
      4323: istore_2
      4324: iload_2
      4325: iload_1
      4326: if_icmpge     4343
      4329: aload_0
      4330: iload_2
      4331: aaload
      4332: astore_3
      4333: aload_3
      4334: invokevirtual #919                // Method createSubclasses:()V
      4337: iinc          2, 1
      4340: goto          4324
      4343: return
      LineNumberTable:
        line 38: 0
        line 39: 25
        line 40: 52
        line 41: 79
        line 42: 106
        line 43: 133
        line 44: 160
        line 45: 188
        line 46: 216
        line 47: 244
        line 49: 272
        line 50: 298
        line 51: 326
        line 52: 354
        line 53: 382
        line 54: 410
        line 55: 438
        line 56: 466
        line 58: 494
        line 59: 520
        line 60: 548
        line 61: 576
        line 62: 604
        line 63: 632
        line 64: 660
        line 66: 688
        line 67: 714
        line 68: 742
        line 69: 770
        line 70: 798
        line 71: 826
        line 73: 854
        line 74: 880
        line 75: 908
        line 76: 936
        line 77: 964
        line 78: 992
        line 79: 1020
        line 81: 1048
        line 82: 1074
        line 83: 1102
        line 84: 1130
        line 85: 1158
        line 86: 1186
        line 88: 1214
        line 89: 1240
        line 90: 1268
        line 91: 1296
        line 92: 1324
        line 94: 1352
        line 95: 1378
        line 96: 1406
        line 97: 1434
        line 99: 1462
        line 100: 1488
        line 101: 1516
        line 102: 1544
        line 103: 1572
        line 105: 1600
        line 106: 1622
        line 107: 1644
        line 108: 1666
        line 109: 1688
        line 110: 1710
        line 111: 1732
        line 112: 1754
        line 113: 1776
        line 114: 1798
        line 115: 1820
        line 116: 1842
        line 117: 1864
        line 118: 1886
        line 119: 1908
        line 120: 1930
        line 121: 1952
        line 122: 1974
        line 123: 1996
        line 124: 2018
        line 125: 2040
        line 126: 2062
        line 127: 2084
        line 128: 2106
        line 129: 2128
        line 130: 2150
        line 131: 2172
        line 132: 2194
        line 133: 2216
        line 134: 2238
        line 136: 2260
        line 137: 2288
        line 138: 2316
        line 139: 2344
        line 140: 2372
        line 141: 2400
        line 142: 2428
        line 143: 2456
        line 144: 2484
        line 145: 2512
        line 146: 2540
        line 148: 2568
        line 149: 2596
        line 150: 2624
        line 151: 2652
        line 152: 2680
        line 153: 2708
        line 154: 2736
        line 156: 2764
        line 157: 2792
        line 158: 2820
        line 159: 2848
        line 160: 2876
        line 161: 2904
        line 162: 2932
        line 164: 2960
        line 165: 2988
        line 166: 3016
        line 167: 3044
        line 169: 3072
        line 170: 3100
        line 36: 3128
        line 172: 3134
        line 174: 3140
        line 175: 3358
        line 176: 3723
        line 177: 3983
        line 178: 4166
        line 179: 4258
        line 407: 4315
        line 408: 4333
        line 407: 4337
        line 409: 4343
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
         4333       4     3 classId   Lext/mods/gameserver/enums/actors/ClassId;
      StackMapTable: number_of_entries = 2
        frame_type = 254 /* append */
          offset_delta = 4324
          locals = [ class "[Lext/mods/gameserver/enums/actors/ClassId;", int, int ]
        frame_type = 248 /* chop */
          offset_delta = 18
}
Signature: #960                         // Ljava/lang/Enum<Lext/mods/gameserver/enums/actors/ClassId;>;
SourceFile: "ClassId.java"
