// Bytecode for: ext.mods.gameserver.enums.skills.SkillType
// File: ext\mods\gameserver\enums\skills\SkillType.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/enums/skills/SkillType.class
  Last modified 9 de jul de 2026; size 8707 bytes
  MD5 checksum 8d04c9c9c330738160ea13dce8a5d599
  Compiled from "SkillType.java"
public final class ext.mods.gameserver.enums.skills.SkillType extends java.lang.Enum<ext.mods.gameserver.enums.skills.SkillType>
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/gameserver/enums/skills/SkillType
  super_class: #305                       // java/lang/Enum
  interfaces: 0, fields: 99, methods: 7, attributes: 2
Constant pool:
    #1 = Class              #2            // ext/mods/gameserver/enums/skills/SkillType
    #2 = Utf8               ext/mods/gameserver/enums/skills/SkillType
    #3 = Fieldref           #1.#4         // ext/mods/gameserver/enums/skills/SkillType.PDAM:Lext/mods/gameserver/enums/skills/SkillType;
    #4 = NameAndType        #5:#6         // PDAM:Lext/mods/gameserver/enums/skills/SkillType;
    #5 = Utf8               PDAM
    #6 = Utf8               Lext/mods/gameserver/enums/skills/SkillType;
    #7 = Fieldref           #1.#8         // ext/mods/gameserver/enums/skills/SkillType.FATAL:Lext/mods/gameserver/enums/skills/SkillType;
    #8 = NameAndType        #9:#6         // FATAL:Lext/mods/gameserver/enums/skills/SkillType;
    #9 = Utf8               FATAL
   #10 = Fieldref           #1.#11        // ext/mods/gameserver/enums/skills/SkillType.MDAM:Lext/mods/gameserver/enums/skills/SkillType;
   #11 = NameAndType        #12:#6        // MDAM:Lext/mods/gameserver/enums/skills/SkillType;
   #12 = Utf8               MDAM
   #13 = Fieldref           #1.#14        // ext/mods/gameserver/enums/skills/SkillType.CPDAMPERCENT:Lext/mods/gameserver/enums/skills/SkillType;
   #14 = NameAndType        #15:#6        // CPDAMPERCENT:Lext/mods/gameserver/enums/skills/SkillType;
   #15 = Utf8               CPDAMPERCENT
   #16 = Fieldref           #1.#17        // ext/mods/gameserver/enums/skills/SkillType.MANADAM:Lext/mods/gameserver/enums/skills/SkillType;
   #17 = NameAndType        #18:#6        // MANADAM:Lext/mods/gameserver/enums/skills/SkillType;
   #18 = Utf8               MANADAM
   #19 = Fieldref           #1.#20        // ext/mods/gameserver/enums/skills/SkillType.DOT:Lext/mods/gameserver/enums/skills/SkillType;
   #20 = NameAndType        #21:#6        // DOT:Lext/mods/gameserver/enums/skills/SkillType;
   #21 = Utf8               DOT
   #22 = Fieldref           #1.#23        // ext/mods/gameserver/enums/skills/SkillType.MDOT:Lext/mods/gameserver/enums/skills/SkillType;
   #23 = NameAndType        #24:#6        // MDOT:Lext/mods/gameserver/enums/skills/SkillType;
   #24 = Utf8               MDOT
   #25 = Fieldref           #1.#26        // ext/mods/gameserver/enums/skills/SkillType.DRAIN_SOUL:Lext/mods/gameserver/enums/skills/SkillType;
   #26 = NameAndType        #27:#6        // DRAIN_SOUL:Lext/mods/gameserver/enums/skills/SkillType;
   #27 = Utf8               DRAIN_SOUL
   #28 = Fieldref           #1.#29        // ext/mods/gameserver/enums/skills/SkillType.DRAIN:Lext/mods/gameserver/enums/skills/SkillType;
   #29 = NameAndType        #30:#6        // DRAIN:Lext/mods/gameserver/enums/skills/SkillType;
   #30 = Utf8               DRAIN
   #31 = Fieldref           #1.#32        // ext/mods/gameserver/enums/skills/SkillType.DEATHLINK:Lext/mods/gameserver/enums/skills/SkillType;
   #32 = NameAndType        #33:#6        // DEATHLINK:Lext/mods/gameserver/enums/skills/SkillType;
   #33 = Utf8               DEATHLINK
   #34 = Fieldref           #1.#35        // ext/mods/gameserver/enums/skills/SkillType.BLOW:Lext/mods/gameserver/enums/skills/SkillType;
   #35 = NameAndType        #36:#6        // BLOW:Lext/mods/gameserver/enums/skills/SkillType;
   #36 = Utf8               BLOW
   #37 = Fieldref           #1.#38        // ext/mods/gameserver/enums/skills/SkillType.SIGNET:Lext/mods/gameserver/enums/skills/SkillType;
   #38 = NameAndType        #39:#6        // SIGNET:Lext/mods/gameserver/enums/skills/SkillType;
   #39 = Utf8               SIGNET
   #40 = Fieldref           #1.#41        // ext/mods/gameserver/enums/skills/SkillType.SIGNET_CASTTIME:Lext/mods/gameserver/enums/skills/SkillType;
   #41 = NameAndType        #42:#6        // SIGNET_CASTTIME:Lext/mods/gameserver/enums/skills/SkillType;
   #42 = Utf8               SIGNET_CASTTIME
   #43 = Fieldref           #1.#44        // ext/mods/gameserver/enums/skills/SkillType.SEED:Lext/mods/gameserver/enums/skills/SkillType;
   #44 = NameAndType        #45:#6        // SEED:Lext/mods/gameserver/enums/skills/SkillType;
   #45 = Utf8               SEED
   #46 = Fieldref           #1.#47        // ext/mods/gameserver/enums/skills/SkillType.REAL_DAMAGE:Lext/mods/gameserver/enums/skills/SkillType;
   #47 = NameAndType        #48:#6        // REAL_DAMAGE:Lext/mods/gameserver/enums/skills/SkillType;
   #48 = Utf8               REAL_DAMAGE
   #49 = Fieldref           #1.#50        // ext/mods/gameserver/enums/skills/SkillType.BLEED:Lext/mods/gameserver/enums/skills/SkillType;
   #50 = NameAndType        #51:#6        // BLEED:Lext/mods/gameserver/enums/skills/SkillType;
   #51 = Utf8               BLEED
   #52 = Fieldref           #1.#53        // ext/mods/gameserver/enums/skills/SkillType.POISON:Lext/mods/gameserver/enums/skills/SkillType;
   #53 = NameAndType        #54:#6        // POISON:Lext/mods/gameserver/enums/skills/SkillType;
   #54 = Utf8               POISON
   #55 = Fieldref           #1.#56        // ext/mods/gameserver/enums/skills/SkillType.STUN:Lext/mods/gameserver/enums/skills/SkillType;
   #56 = NameAndType        #57:#6        // STUN:Lext/mods/gameserver/enums/skills/SkillType;
   #57 = Utf8               STUN
   #58 = Fieldref           #1.#59        // ext/mods/gameserver/enums/skills/SkillType.ROOT:Lext/mods/gameserver/enums/skills/SkillType;
   #59 = NameAndType        #60:#6        // ROOT:Lext/mods/gameserver/enums/skills/SkillType;
   #60 = Utf8               ROOT
   #61 = Fieldref           #1.#62        // ext/mods/gameserver/enums/skills/SkillType.CONFUSION:Lext/mods/gameserver/enums/skills/SkillType;
   #62 = NameAndType        #63:#6        // CONFUSION:Lext/mods/gameserver/enums/skills/SkillType;
   #63 = Utf8               CONFUSION
   #64 = Fieldref           #1.#65        // ext/mods/gameserver/enums/skills/SkillType.FEAR:Lext/mods/gameserver/enums/skills/SkillType;
   #65 = NameAndType        #66:#6        // FEAR:Lext/mods/gameserver/enums/skills/SkillType;
   #66 = Utf8               FEAR
   #67 = Fieldref           #1.#68        // ext/mods/gameserver/enums/skills/SkillType.SLEEP:Lext/mods/gameserver/enums/skills/SkillType;
   #68 = NameAndType        #69:#6        // SLEEP:Lext/mods/gameserver/enums/skills/SkillType;
   #69 = Utf8               SLEEP
   #70 = Fieldref           #1.#71        // ext/mods/gameserver/enums/skills/SkillType.MUTE:Lext/mods/gameserver/enums/skills/SkillType;
   #71 = NameAndType        #72:#6        // MUTE:Lext/mods/gameserver/enums/skills/SkillType;
   #72 = Utf8               MUTE
   #73 = Fieldref           #1.#74        // ext/mods/gameserver/enums/skills/SkillType.PARALYZE:Lext/mods/gameserver/enums/skills/SkillType;
   #74 = NameAndType        #75:#6        // PARALYZE:Lext/mods/gameserver/enums/skills/SkillType;
   #75 = Utf8               PARALYZE
   #76 = Fieldref           #1.#77        // ext/mods/gameserver/enums/skills/SkillType.WEAKNESS:Lext/mods/gameserver/enums/skills/SkillType;
   #77 = NameAndType        #78:#6        // WEAKNESS:Lext/mods/gameserver/enums/skills/SkillType;
   #78 = Utf8               WEAKNESS
   #79 = Fieldref           #1.#80        // ext/mods/gameserver/enums/skills/SkillType.HEAL:Lext/mods/gameserver/enums/skills/SkillType;
   #80 = NameAndType        #81:#6        // HEAL:Lext/mods/gameserver/enums/skills/SkillType;
   #81 = Utf8               HEAL
   #82 = Fieldref           #1.#83        // ext/mods/gameserver/enums/skills/SkillType.MANAHEAL:Lext/mods/gameserver/enums/skills/SkillType;
   #83 = NameAndType        #84:#6        // MANAHEAL:Lext/mods/gameserver/enums/skills/SkillType;
   #84 = Utf8               MANAHEAL
   #85 = Fieldref           #1.#86        // ext/mods/gameserver/enums/skills/SkillType.COMBATPOINTHEAL:Lext/mods/gameserver/enums/skills/SkillType;
   #86 = NameAndType        #87:#6        // COMBATPOINTHEAL:Lext/mods/gameserver/enums/skills/SkillType;
   #87 = Utf8               COMBATPOINTHEAL
   #88 = Fieldref           #1.#89        // ext/mods/gameserver/enums/skills/SkillType.HOT:Lext/mods/gameserver/enums/skills/SkillType;
   #89 = NameAndType        #90:#6        // HOT:Lext/mods/gameserver/enums/skills/SkillType;
   #90 = Utf8               HOT
   #91 = Fieldref           #1.#92        // ext/mods/gameserver/enums/skills/SkillType.MPHOT:Lext/mods/gameserver/enums/skills/SkillType;
   #92 = NameAndType        #93:#6        // MPHOT:Lext/mods/gameserver/enums/skills/SkillType;
   #93 = Utf8               MPHOT
   #94 = Fieldref           #1.#95        // ext/mods/gameserver/enums/skills/SkillType.BALANCE_LIFE:Lext/mods/gameserver/enums/skills/SkillType;
   #95 = NameAndType        #96:#6        // BALANCE_LIFE:Lext/mods/gameserver/enums/skills/SkillType;
   #96 = Utf8               BALANCE_LIFE
   #97 = Fieldref           #1.#98        // ext/mods/gameserver/enums/skills/SkillType.HEAL_STATIC:Lext/mods/gameserver/enums/skills/SkillType;
   #98 = NameAndType        #99:#6        // HEAL_STATIC:Lext/mods/gameserver/enums/skills/SkillType;
   #99 = Utf8               HEAL_STATIC
  #100 = Fieldref           #1.#101       // ext/mods/gameserver/enums/skills/SkillType.MANARECHARGE:Lext/mods/gameserver/enums/skills/SkillType;
  #101 = NameAndType        #102:#6       // MANARECHARGE:Lext/mods/gameserver/enums/skills/SkillType;
  #102 = Utf8               MANARECHARGE
  #103 = Fieldref           #1.#104       // ext/mods/gameserver/enums/skills/SkillType.HEAL_PERCENT:Lext/mods/gameserver/enums/skills/SkillType;
  #104 = NameAndType        #105:#6       // HEAL_PERCENT:Lext/mods/gameserver/enums/skills/SkillType;
  #105 = Utf8               HEAL_PERCENT
  #106 = Fieldref           #1.#107       // ext/mods/gameserver/enums/skills/SkillType.MANAHEAL_PERCENT:Lext/mods/gameserver/enums/skills/SkillType;
  #107 = NameAndType        #108:#6       // MANAHEAL_PERCENT:Lext/mods/gameserver/enums/skills/SkillType;
  #108 = Utf8               MANAHEAL_PERCENT
  #109 = Fieldref           #1.#110       // ext/mods/gameserver/enums/skills/SkillType.GIVE_SP:Lext/mods/gameserver/enums/skills/SkillType;
  #110 = NameAndType        #111:#6       // GIVE_SP:Lext/mods/gameserver/enums/skills/SkillType;
  #111 = Utf8               GIVE_SP
  #112 = Fieldref           #1.#113       // ext/mods/gameserver/enums/skills/SkillType.AGGDAMAGE:Lext/mods/gameserver/enums/skills/SkillType;
  #113 = NameAndType        #114:#6       // AGGDAMAGE:Lext/mods/gameserver/enums/skills/SkillType;
  #114 = Utf8               AGGDAMAGE
  #115 = Fieldref           #1.#116       // ext/mods/gameserver/enums/skills/SkillType.AGGREDUCE:Lext/mods/gameserver/enums/skills/SkillType;
  #116 = NameAndType        #117:#6       // AGGREDUCE:Lext/mods/gameserver/enums/skills/SkillType;
  #117 = Utf8               AGGREDUCE
  #118 = Fieldref           #1.#119       // ext/mods/gameserver/enums/skills/SkillType.AGGREMOVE:Lext/mods/gameserver/enums/skills/SkillType;
  #119 = NameAndType        #120:#6       // AGGREMOVE:Lext/mods/gameserver/enums/skills/SkillType;
  #120 = Utf8               AGGREMOVE
  #121 = Fieldref           #1.#122       // ext/mods/gameserver/enums/skills/SkillType.AGGREDUCE_CHAR:Lext/mods/gameserver/enums/skills/SkillType;
  #122 = NameAndType        #123:#6       // AGGREDUCE_CHAR:Lext/mods/gameserver/enums/skills/SkillType;
  #123 = Utf8               AGGREDUCE_CHAR
  #124 = Fieldref           #1.#125       // ext/mods/gameserver/enums/skills/SkillType.AGGDEBUFF:Lext/mods/gameserver/enums/skills/SkillType;
  #125 = NameAndType        #126:#6       // AGGDEBUFF:Lext/mods/gameserver/enums/skills/SkillType;
  #126 = Utf8               AGGDEBUFF
  #127 = Fieldref           #1.#128       // ext/mods/gameserver/enums/skills/SkillType.FISHING:Lext/mods/gameserver/enums/skills/SkillType;
  #128 = NameAndType        #129:#6       // FISHING:Lext/mods/gameserver/enums/skills/SkillType;
  #129 = Utf8               FISHING
  #130 = Fieldref           #1.#131       // ext/mods/gameserver/enums/skills/SkillType.PUMPING:Lext/mods/gameserver/enums/skills/SkillType;
  #131 = NameAndType        #132:#6       // PUMPING:Lext/mods/gameserver/enums/skills/SkillType;
  #132 = Utf8               PUMPING
  #133 = Fieldref           #1.#134       // ext/mods/gameserver/enums/skills/SkillType.REELING:Lext/mods/gameserver/enums/skills/SkillType;
  #134 = NameAndType        #135:#6       // REELING:Lext/mods/gameserver/enums/skills/SkillType;
  #135 = Utf8               REELING
  #136 = Fieldref           #1.#137       // ext/mods/gameserver/enums/skills/SkillType.UNLOCK:Lext/mods/gameserver/enums/skills/SkillType;
  #137 = NameAndType        #138:#6       // UNLOCK:Lext/mods/gameserver/enums/skills/SkillType;
  #138 = Utf8               UNLOCK
  #139 = Fieldref           #1.#140       // ext/mods/gameserver/enums/skills/SkillType.UNLOCK_SPECIAL:Lext/mods/gameserver/enums/skills/SkillType;
  #140 = NameAndType        #141:#6       // UNLOCK_SPECIAL:Lext/mods/gameserver/enums/skills/SkillType;
  #141 = Utf8               UNLOCK_SPECIAL
  #142 = Fieldref           #1.#143       // ext/mods/gameserver/enums/skills/SkillType.DELUXE_KEY_UNLOCK:Lext/mods/gameserver/enums/skills/SkillType;
  #143 = NameAndType        #144:#6       // DELUXE_KEY_UNLOCK:Lext/mods/gameserver/enums/skills/SkillType;
  #144 = Utf8               DELUXE_KEY_UNLOCK
  #145 = Fieldref           #1.#146       // ext/mods/gameserver/enums/skills/SkillType.ENCHANT_ARMOR:Lext/mods/gameserver/enums/skills/SkillType;
  #146 = NameAndType        #147:#6       // ENCHANT_ARMOR:Lext/mods/gameserver/enums/skills/SkillType;
  #147 = Utf8               ENCHANT_ARMOR
  #148 = Fieldref           #1.#149       // ext/mods/gameserver/enums/skills/SkillType.ENCHANT_WEAPON:Lext/mods/gameserver/enums/skills/SkillType;
  #149 = NameAndType        #150:#6       // ENCHANT_WEAPON:Lext/mods/gameserver/enums/skills/SkillType;
  #150 = Utf8               ENCHANT_WEAPON
  #151 = Fieldref           #1.#152       // ext/mods/gameserver/enums/skills/SkillType.SOULSHOT:Lext/mods/gameserver/enums/skills/SkillType;
  #152 = NameAndType        #153:#6       // SOULSHOT:Lext/mods/gameserver/enums/skills/SkillType;
  #153 = Utf8               SOULSHOT
  #154 = Fieldref           #1.#155       // ext/mods/gameserver/enums/skills/SkillType.SPIRITSHOT:Lext/mods/gameserver/enums/skills/SkillType;
  #155 = NameAndType        #156:#6       // SPIRITSHOT:Lext/mods/gameserver/enums/skills/SkillType;
  #156 = Utf8               SPIRITSHOT
  #157 = Fieldref           #1.#158       // ext/mods/gameserver/enums/skills/SkillType.SIEGE_FLAG:Lext/mods/gameserver/enums/skills/SkillType;
  #158 = NameAndType        #159:#6       // SIEGE_FLAG:Lext/mods/gameserver/enums/skills/SkillType;
  #159 = Utf8               SIEGE_FLAG
  #160 = Fieldref           #1.#161       // ext/mods/gameserver/enums/skills/SkillType.TAKE_CASTLE:Lext/mods/gameserver/enums/skills/SkillType;
  #161 = NameAndType        #162:#6       // TAKE_CASTLE:Lext/mods/gameserver/enums/skills/SkillType;
  #162 = Utf8               TAKE_CASTLE
  #163 = Fieldref           #1.#164       // ext/mods/gameserver/enums/skills/SkillType.SOW:Lext/mods/gameserver/enums/skills/SkillType;
  #164 = NameAndType        #165:#6       // SOW:Lext/mods/gameserver/enums/skills/SkillType;
  #165 = Utf8               SOW
  #166 = Fieldref           #1.#167       // ext/mods/gameserver/enums/skills/SkillType.HARVEST:Lext/mods/gameserver/enums/skills/SkillType;
  #167 = NameAndType        #168:#6       // HARVEST:Lext/mods/gameserver/enums/skills/SkillType;
  #168 = Utf8               HARVEST
  #169 = Fieldref           #1.#170       // ext/mods/gameserver/enums/skills/SkillType.GET_PLAYER:Lext/mods/gameserver/enums/skills/SkillType;
  #170 = NameAndType        #171:#6       // GET_PLAYER:Lext/mods/gameserver/enums/skills/SkillType;
  #171 = Utf8               GET_PLAYER
  #172 = Fieldref           #1.#173       // ext/mods/gameserver/enums/skills/SkillType.DUMMY:Lext/mods/gameserver/enums/skills/SkillType;
  #173 = NameAndType        #174:#6       // DUMMY:Lext/mods/gameserver/enums/skills/SkillType;
  #174 = Utf8               DUMMY
  #175 = Fieldref           #1.#176       // ext/mods/gameserver/enums/skills/SkillType.INSTANT_JUMP:Lext/mods/gameserver/enums/skills/SkillType;
  #176 = NameAndType        #177:#6       // INSTANT_JUMP:Lext/mods/gameserver/enums/skills/SkillType;
  #177 = Utf8               INSTANT_JUMP
  #178 = Fieldref           #1.#179       // ext/mods/gameserver/enums/skills/SkillType.COMMON_CRAFT:Lext/mods/gameserver/enums/skills/SkillType;
  #179 = NameAndType        #180:#6       // COMMON_CRAFT:Lext/mods/gameserver/enums/skills/SkillType;
  #180 = Utf8               COMMON_CRAFT
  #181 = Fieldref           #1.#182       // ext/mods/gameserver/enums/skills/SkillType.DWARVEN_CRAFT:Lext/mods/gameserver/enums/skills/SkillType;
  #182 = NameAndType        #183:#6       // DWARVEN_CRAFT:Lext/mods/gameserver/enums/skills/SkillType;
  #183 = Utf8               DWARVEN_CRAFT
  #184 = Fieldref           #1.#185       // ext/mods/gameserver/enums/skills/SkillType.CREATE_ITEM:Lext/mods/gameserver/enums/skills/SkillType;
  #185 = NameAndType        #186:#6       // CREATE_ITEM:Lext/mods/gameserver/enums/skills/SkillType;
  #186 = Utf8               CREATE_ITEM
  #187 = Fieldref           #1.#188       // ext/mods/gameserver/enums/skills/SkillType.EXTRACTABLE:Lext/mods/gameserver/enums/skills/SkillType;
  #188 = NameAndType        #189:#6       // EXTRACTABLE:Lext/mods/gameserver/enums/skills/SkillType;
  #189 = Utf8               EXTRACTABLE
  #190 = Fieldref           #1.#191       // ext/mods/gameserver/enums/skills/SkillType.EXTRACTABLE_FISH:Lext/mods/gameserver/enums/skills/SkillType;
  #191 = NameAndType        #192:#6       // EXTRACTABLE_FISH:Lext/mods/gameserver/enums/skills/SkillType;
  #192 = Utf8               EXTRACTABLE_FISH
  #193 = Fieldref           #1.#194       // ext/mods/gameserver/enums/skills/SkillType.SUMMON:Lext/mods/gameserver/enums/skills/SkillType;
  #194 = NameAndType        #195:#6       // SUMMON:Lext/mods/gameserver/enums/skills/SkillType;
  #195 = Utf8               SUMMON
  #196 = Fieldref           #1.#197       // ext/mods/gameserver/enums/skills/SkillType.FEED_PET:Lext/mods/gameserver/enums/skills/SkillType;
  #197 = NameAndType        #198:#6       // FEED_PET:Lext/mods/gameserver/enums/skills/SkillType;
  #198 = Utf8               FEED_PET
  #199 = Fieldref           #1.#200       // ext/mods/gameserver/enums/skills/SkillType.STRIDER_SIEGE_ASSAULT:Lext/mods/gameserver/enums/skills/SkillType;
  #200 = NameAndType        #201:#6       // STRIDER_SIEGE_ASSAULT:Lext/mods/gameserver/enums/skills/SkillType;
  #201 = Utf8               STRIDER_SIEGE_ASSAULT
  #202 = Fieldref           #1.#203       // ext/mods/gameserver/enums/skills/SkillType.ERASE:Lext/mods/gameserver/enums/skills/SkillType;
  #203 = NameAndType        #204:#6       // ERASE:Lext/mods/gameserver/enums/skills/SkillType;
  #204 = Utf8               ERASE
  #205 = Fieldref           #1.#206       // ext/mods/gameserver/enums/skills/SkillType.BETRAY:Lext/mods/gameserver/enums/skills/SkillType;
  #206 = NameAndType        #207:#6       // BETRAY:Lext/mods/gameserver/enums/skills/SkillType;
  #207 = Utf8               BETRAY
  #208 = Fieldref           #1.#209       // ext/mods/gameserver/enums/skills/SkillType.SPAWN:Lext/mods/gameserver/enums/skills/SkillType;
  #209 = NameAndType        #210:#6       // SPAWN:Lext/mods/gameserver/enums/skills/SkillType;
  #210 = Utf8               SPAWN
  #211 = Fieldref           #1.#212       // ext/mods/gameserver/enums/skills/SkillType.CANCEL:Lext/mods/gameserver/enums/skills/SkillType;
  #212 = NameAndType        #213:#6       // CANCEL:Lext/mods/gameserver/enums/skills/SkillType;
  #213 = Utf8               CANCEL
  #214 = Fieldref           #1.#215       // ext/mods/gameserver/enums/skills/SkillType.MAGE_BANE:Lext/mods/gameserver/enums/skills/SkillType;
  #215 = NameAndType        #216:#6       // MAGE_BANE:Lext/mods/gameserver/enums/skills/SkillType;
  #216 = Utf8               MAGE_BANE
  #217 = Fieldref           #1.#218       // ext/mods/gameserver/enums/skills/SkillType.WARRIOR_BANE:Lext/mods/gameserver/enums/skills/SkillType;
  #218 = NameAndType        #219:#6       // WARRIOR_BANE:Lext/mods/gameserver/enums/skills/SkillType;
  #219 = Utf8               WARRIOR_BANE
  #220 = Fieldref           #1.#221       // ext/mods/gameserver/enums/skills/SkillType.NEGATE:Lext/mods/gameserver/enums/skills/SkillType;
  #221 = NameAndType        #222:#6       // NEGATE:Lext/mods/gameserver/enums/skills/SkillType;
  #222 = Utf8               NEGATE
  #223 = Fieldref           #1.#224       // ext/mods/gameserver/enums/skills/SkillType.CANCEL_DEBUFF:Lext/mods/gameserver/enums/skills/SkillType;
  #224 = NameAndType        #225:#6       // CANCEL_DEBUFF:Lext/mods/gameserver/enums/skills/SkillType;
  #225 = Utf8               CANCEL_DEBUFF
  #226 = Fieldref           #1.#227       // ext/mods/gameserver/enums/skills/SkillType.BUFF:Lext/mods/gameserver/enums/skills/SkillType;
  #227 = NameAndType        #228:#6       // BUFF:Lext/mods/gameserver/enums/skills/SkillType;
  #228 = Utf8               BUFF
  #229 = Fieldref           #1.#230       // ext/mods/gameserver/enums/skills/SkillType.SONIC:Lext/mods/gameserver/enums/skills/SkillType;
  #230 = NameAndType        #231:#6       // SONIC:Lext/mods/gameserver/enums/skills/SkillType;
  #231 = Utf8               SONIC
  #232 = Fieldref           #1.#233       // ext/mods/gameserver/enums/skills/SkillType.FORCE:Lext/mods/gameserver/enums/skills/SkillType;
  #233 = NameAndType        #234:#6       // FORCE:Lext/mods/gameserver/enums/skills/SkillType;
  #234 = Utf8               FORCE
  #235 = Fieldref           #1.#236       // ext/mods/gameserver/enums/skills/SkillType.DEBUFF:Lext/mods/gameserver/enums/skills/SkillType;
  #236 = NameAndType        #237:#6       // DEBUFF:Lext/mods/gameserver/enums/skills/SkillType;
  #237 = Utf8               DEBUFF
  #238 = Fieldref           #1.#239       // ext/mods/gameserver/enums/skills/SkillType.PASSIVE:Lext/mods/gameserver/enums/skills/SkillType;
  #239 = NameAndType        #240:#6       // PASSIVE:Lext/mods/gameserver/enums/skills/SkillType;
  #240 = Utf8               PASSIVE
  #241 = Fieldref           #1.#242       // ext/mods/gameserver/enums/skills/SkillType.CONT:Lext/mods/gameserver/enums/skills/SkillType;
  #242 = NameAndType        #243:#6       // CONT:Lext/mods/gameserver/enums/skills/SkillType;
  #243 = Utf8               CONT
  #244 = Fieldref           #1.#245       // ext/mods/gameserver/enums/skills/SkillType.RESURRECT:Lext/mods/gameserver/enums/skills/SkillType;
  #245 = NameAndType        #246:#6       // RESURRECT:Lext/mods/gameserver/enums/skills/SkillType;
  #246 = Utf8               RESURRECT
  #247 = Fieldref           #1.#248       // ext/mods/gameserver/enums/skills/SkillType.CHARGEDAM:Lext/mods/gameserver/enums/skills/SkillType;
  #248 = NameAndType        #249:#6       // CHARGEDAM:Lext/mods/gameserver/enums/skills/SkillType;
  #249 = Utf8               CHARGEDAM
  #250 = Fieldref           #1.#251       // ext/mods/gameserver/enums/skills/SkillType.LUCK:Lext/mods/gameserver/enums/skills/SkillType;
  #251 = NameAndType        #252:#6       // LUCK:Lext/mods/gameserver/enums/skills/SkillType;
  #252 = Utf8               LUCK
  #253 = Fieldref           #1.#254       // ext/mods/gameserver/enums/skills/SkillType.RECALL:Lext/mods/gameserver/enums/skills/SkillType;
  #254 = NameAndType        #255:#6       // RECALL:Lext/mods/gameserver/enums/skills/SkillType;
  #255 = Utf8               RECALL
  #256 = Fieldref           #1.#257       // ext/mods/gameserver/enums/skills/SkillType.TELEPORT:Lext/mods/gameserver/enums/skills/SkillType;
  #257 = NameAndType        #258:#6       // TELEPORT:Lext/mods/gameserver/enums/skills/SkillType;
  #258 = Utf8               TELEPORT
  #259 = Fieldref           #1.#260       // ext/mods/gameserver/enums/skills/SkillType.SUMMON_FRIEND:Lext/mods/gameserver/enums/skills/SkillType;
  #260 = NameAndType        #261:#6       // SUMMON_FRIEND:Lext/mods/gameserver/enums/skills/SkillType;
  #261 = Utf8               SUMMON_FRIEND
  #262 = Fieldref           #1.#263       // ext/mods/gameserver/enums/skills/SkillType.SUMMON_PARTY:Lext/mods/gameserver/enums/skills/SkillType;
  #263 = NameAndType        #264:#6       // SUMMON_PARTY:Lext/mods/gameserver/enums/skills/SkillType;
  #264 = Utf8               SUMMON_PARTY
  #265 = Fieldref           #1.#266       // ext/mods/gameserver/enums/skills/SkillType.SUMMON_CREATURE:Lext/mods/gameserver/enums/skills/SkillType;
  #266 = NameAndType        #267:#6       // SUMMON_CREATURE:Lext/mods/gameserver/enums/skills/SkillType;
  #267 = Utf8               SUMMON_CREATURE
  #268 = Fieldref           #1.#269       // ext/mods/gameserver/enums/skills/SkillType.REFLECT:Lext/mods/gameserver/enums/skills/SkillType;
  #269 = NameAndType        #270:#6       // REFLECT:Lext/mods/gameserver/enums/skills/SkillType;
  #270 = Utf8               REFLECT
  #271 = Fieldref           #1.#272       // ext/mods/gameserver/enums/skills/SkillType.SPOIL:Lext/mods/gameserver/enums/skills/SkillType;
  #272 = NameAndType        #273:#6       // SPOIL:Lext/mods/gameserver/enums/skills/SkillType;
  #273 = Utf8               SPOIL
  #274 = Fieldref           #1.#275       // ext/mods/gameserver/enums/skills/SkillType.SWEEP:Lext/mods/gameserver/enums/skills/SkillType;
  #275 = NameAndType        #276:#6       // SWEEP:Lext/mods/gameserver/enums/skills/SkillType;
  #276 = Utf8               SWEEP
  #277 = Fieldref           #1.#278       // ext/mods/gameserver/enums/skills/SkillType.FAKE_DEATH:Lext/mods/gameserver/enums/skills/SkillType;
  #278 = NameAndType        #279:#6       // FAKE_DEATH:Lext/mods/gameserver/enums/skills/SkillType;
  #279 = Utf8               FAKE_DEATH
  #280 = Fieldref           #1.#281       // ext/mods/gameserver/enums/skills/SkillType.BEAST_FEED:Lext/mods/gameserver/enums/skills/SkillType;
  #281 = NameAndType        #282:#6       // BEAST_FEED:Lext/mods/gameserver/enums/skills/SkillType;
  #282 = Utf8               BEAST_FEED
  #283 = Fieldref           #1.#284       // ext/mods/gameserver/enums/skills/SkillType.FUSION:Lext/mods/gameserver/enums/skills/SkillType;
  #284 = NameAndType        #285:#6       // FUSION:Lext/mods/gameserver/enums/skills/SkillType;
  #285 = Utf8               FUSION
  #286 = Fieldref           #1.#287       // ext/mods/gameserver/enums/skills/SkillType.CHANGE_APPEARANCE:Lext/mods/gameserver/enums/skills/SkillType;
  #287 = NameAndType        #288:#6       // CHANGE_APPEARANCE:Lext/mods/gameserver/enums/skills/SkillType;
  #288 = Utf8               CHANGE_APPEARANCE
  #289 = Fieldref           #1.#290       // ext/mods/gameserver/enums/skills/SkillType.COREDONE:Lext/mods/gameserver/enums/skills/SkillType;
  #290 = NameAndType        #291:#6       // COREDONE:Lext/mods/gameserver/enums/skills/SkillType;
  #291 = Utf8               COREDONE
  #292 = Fieldref           #1.#293       // ext/mods/gameserver/enums/skills/SkillType.NOTDONE:Lext/mods/gameserver/enums/skills/SkillType;
  #293 = NameAndType        #294:#6       // NOTDONE:Lext/mods/gameserver/enums/skills/SkillType;
  #294 = Utf8               NOTDONE
  #295 = Fieldref           #1.#296       // ext/mods/gameserver/enums/skills/SkillType.$VALUES:[Lext/mods/gameserver/enums/skills/SkillType;
  #296 = NameAndType        #297:#298     // $VALUES:[Lext/mods/gameserver/enums/skills/SkillType;
  #297 = Utf8               $VALUES
  #298 = Utf8               [Lext/mods/gameserver/enums/skills/SkillType;
  #299 = Methodref          #300.#301     // "[Lext/mods/gameserver/enums/skills/SkillType;".clone:()Ljava/lang/Object;
  #300 = Class              #298          // "[Lext/mods/gameserver/enums/skills/SkillType;"
  #301 = NameAndType        #302:#303     // clone:()Ljava/lang/Object;
  #302 = Utf8               clone
  #303 = Utf8               ()Ljava/lang/Object;
  #304 = Methodref          #305.#306     // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #305 = Class              #307          // java/lang/Enum
  #306 = NameAndType        #308:#309     // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #307 = Utf8               java/lang/Enum
  #308 = Utf8               valueOf
  #309 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #310 = Fieldref           #1.#311       // ext/mods/gameserver/enums/skills/SkillType._class:Ljava/lang/Class;
  #311 = NameAndType        #312:#313     // _class:Ljava/lang/Class;
  #312 = Utf8               _class
  #313 = Utf8               Ljava/lang/Class;
  #314 = Class              #315          // java/lang/Class
  #315 = Utf8               java/lang/Class
  #316 = Class              #317          // ext/mods/commons/data/StatSet
  #317 = Utf8               ext/mods/commons/data/StatSet
  #318 = Methodref          #314.#319     // java/lang/Class.getConstructor:([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
  #319 = NameAndType        #320:#321     // getConstructor:([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
  #320 = Utf8               getConstructor
  #321 = Utf8               ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
  #322 = Class              #323          // java/lang/Object
  #323 = Utf8               java/lang/Object
  #324 = Methodref          #325.#326     // java/lang/reflect/Constructor.newInstance:([Ljava/lang/Object;)Ljava/lang/Object;
  #325 = Class              #327          // java/lang/reflect/Constructor
  #326 = NameAndType        #328:#329     // newInstance:([Ljava/lang/Object;)Ljava/lang/Object;
  #327 = Utf8               java/lang/reflect/Constructor
  #328 = Utf8               newInstance
  #329 = Utf8               ([Ljava/lang/Object;)Ljava/lang/Object;
  #330 = Class              #331          // ext/mods/gameserver/skills/L2Skill
  #331 = Utf8               ext/mods/gameserver/skills/L2Skill
  #332 = Class              #333          // java/lang/Exception
  #333 = Utf8               java/lang/Exception
  #334 = Class              #335          // java/lang/RuntimeException
  #335 = Utf8               java/lang/RuntimeException
  #336 = Methodref          #334.#337     // java/lang/RuntimeException."<init>":(Ljava/lang/Throwable;)V
  #337 = NameAndType        #338:#339     // "<init>":(Ljava/lang/Throwable;)V
  #338 = Utf8               <init>
  #339 = Utf8               (Ljava/lang/Throwable;)V
  #340 = Methodref          #305.#341     // java/lang/Enum."<init>":(Ljava/lang/String;I)V
  #341 = NameAndType        #338:#342     // "<init>":(Ljava/lang/String;I)V
  #342 = Utf8               (Ljava/lang/String;I)V
  #343 = Class              #344          // ext/mods/gameserver/skills/l2skills/L2SkillDefault
  #344 = Utf8               ext/mods/gameserver/skills/l2skills/L2SkillDefault
  #345 = String             #5            // PDAM
  #346 = Methodref          #1.#341       // ext/mods/gameserver/enums/skills/SkillType."<init>":(Ljava/lang/String;I)V
  #347 = String             #9            // FATAL
  #348 = String             #12           // MDAM
  #349 = String             #15           // CPDAMPERCENT
  #350 = String             #18           // MANADAM
  #351 = String             #21           // DOT
  #352 = String             #24           // MDOT
  #353 = String             #27           // DRAIN_SOUL
  #354 = String             #30           // DRAIN
  #355 = Class              #356          // ext/mods/gameserver/skills/l2skills/L2SkillDrain
  #356 = Utf8               ext/mods/gameserver/skills/l2skills/L2SkillDrain
  #357 = Methodref          #1.#358       // ext/mods/gameserver/enums/skills/SkillType."<init>":(Ljava/lang/String;ILjava/lang/Class;)V
  #358 = NameAndType        #338:#359     // "<init>":(Ljava/lang/String;ILjava/lang/Class;)V
  #359 = Utf8               (Ljava/lang/String;ILjava/lang/Class;)V
  #360 = String             #33           // DEATHLINK
  #361 = String             #36           // BLOW
  #362 = String             #39           // SIGNET
  #363 = Class              #364          // ext/mods/gameserver/skills/l2skills/L2SkillSignet
  #364 = Utf8               ext/mods/gameserver/skills/l2skills/L2SkillSignet
  #365 = String             #42           // SIGNET_CASTTIME
  #366 = Class              #367          // ext/mods/gameserver/skills/l2skills/L2SkillSignetCasttime
  #367 = Utf8               ext/mods/gameserver/skills/l2skills/L2SkillSignetCasttime
  #368 = String             #45           // SEED
  #369 = Class              #370          // ext/mods/gameserver/skills/l2skills/L2SkillSeed
  #370 = Utf8               ext/mods/gameserver/skills/l2skills/L2SkillSeed
  #371 = String             #48           // REAL_DAMAGE
  #372 = String             #51           // BLEED
  #373 = String             #54           // POISON
  #374 = String             #57           // STUN
  #375 = String             #60           // ROOT
  #376 = String             #63           // CONFUSION
  #377 = String             #66           // FEAR
  #378 = String             #69           // SLEEP
  #379 = String             #72           // MUTE
  #380 = String             #75           // PARALYZE
  #381 = String             #78           // WEAKNESS
  #382 = String             #81           // HEAL
  #383 = String             #84           // MANAHEAL
  #384 = String             #87           // COMBATPOINTHEAL
  #385 = String             #90           // HOT
  #386 = String             #93           // MPHOT
  #387 = String             #96           // BALANCE_LIFE
  #388 = String             #99           // HEAL_STATIC
  #389 = String             #102          // MANARECHARGE
  #390 = String             #105          // HEAL_PERCENT
  #391 = String             #108          // MANAHEAL_PERCENT
  #392 = String             #111          // GIVE_SP
  #393 = String             #114          // AGGDAMAGE
  #394 = String             #117          // AGGREDUCE
  #395 = String             #120          // AGGREMOVE
  #396 = String             #123          // AGGREDUCE_CHAR
  #397 = String             #126          // AGGDEBUFF
  #398 = String             #129          // FISHING
  #399 = String             #132          // PUMPING
  #400 = String             #135          // REELING
  #401 = String             #138          // UNLOCK
  #402 = String             #141          // UNLOCK_SPECIAL
  #403 = String             #144          // DELUXE_KEY_UNLOCK
  #404 = String             #147          // ENCHANT_ARMOR
  #405 = String             #150          // ENCHANT_WEAPON
  #406 = String             #153          // SOULSHOT
  #407 = String             #156          // SPIRITSHOT
  #408 = String             #159          // SIEGE_FLAG
  #409 = Class              #410          // ext/mods/gameserver/skills/l2skills/L2SkillSiegeFlag
  #410 = Utf8               ext/mods/gameserver/skills/l2skills/L2SkillSiegeFlag
  #411 = String             #162          // TAKE_CASTLE
  #412 = String             #165          // SOW
  #413 = String             #168          // HARVEST
  #414 = String             #171          // GET_PLAYER
  #415 = String             #174          // DUMMY
  #416 = String             #177          // INSTANT_JUMP
  #417 = String             #180          // COMMON_CRAFT
  #418 = String             #183          // DWARVEN_CRAFT
  #419 = String             #186          // CREATE_ITEM
  #420 = Class              #421          // ext/mods/gameserver/skills/l2skills/L2SkillCreateItem
  #421 = Utf8               ext/mods/gameserver/skills/l2skills/L2SkillCreateItem
  #422 = String             #189          // EXTRACTABLE
  #423 = String             #192          // EXTRACTABLE_FISH
  #424 = String             #195          // SUMMON
  #425 = Class              #426          // ext/mods/gameserver/skills/l2skills/L2SkillSummon
  #426 = Utf8               ext/mods/gameserver/skills/l2skills/L2SkillSummon
  #427 = String             #198          // FEED_PET
  #428 = String             #201          // STRIDER_SIEGE_ASSAULT
  #429 = String             #204          // ERASE
  #430 = String             #207          // BETRAY
  #431 = String             #210          // SPAWN
  #432 = Class              #433          // ext/mods/gameserver/skills/l2skills/L2SkillSpawn
  #433 = Utf8               ext/mods/gameserver/skills/l2skills/L2SkillSpawn
  #434 = String             #213          // CANCEL
  #435 = String             #216          // MAGE_BANE
  #436 = String             #219          // WARRIOR_BANE
  #437 = String             #222          // NEGATE
  #438 = String             #225          // CANCEL_DEBUFF
  #439 = String             #228          // BUFF
  #440 = String             #231          // SONIC
  #441 = String             #234          // FORCE
  #442 = String             #237          // DEBUFF
  #443 = String             #240          // PASSIVE
  #444 = String             #243          // CONT
  #445 = String             #246          // RESURRECT
  #446 = String             #249          // CHARGEDAM
  #447 = Class              #448          // ext/mods/gameserver/skills/l2skills/L2SkillChargeDmg
  #448 = Utf8               ext/mods/gameserver/skills/l2skills/L2SkillChargeDmg
  #449 = String             #252          // LUCK
  #450 = String             #255          // RECALL
  #451 = Class              #452          // ext/mods/gameserver/skills/l2skills/L2SkillTeleport
  #452 = Utf8               ext/mods/gameserver/skills/l2skills/L2SkillTeleport
  #453 = String             #258          // TELEPORT
  #454 = String             #261          // SUMMON_FRIEND
  #455 = String             #264          // SUMMON_PARTY
  #456 = String             #267          // SUMMON_CREATURE
  #457 = String             #270          // REFLECT
  #458 = String             #273          // SPOIL
  #459 = String             #276          // SWEEP
  #460 = String             #279          // FAKE_DEATH
  #461 = String             #282          // BEAST_FEED
  #462 = String             #285          // FUSION
  #463 = String             #288          // CHANGE_APPEARANCE
  #464 = Class              #465          // ext/mods/gameserver/skills/l2skills/L2SkillAppearance
  #465 = Utf8               ext/mods/gameserver/skills/l2skills/L2SkillAppearance
  #466 = String             #291          // COREDONE
  #467 = String             #294          // NOTDONE
  #468 = Methodref          #1.#469       // ext/mods/gameserver/enums/skills/SkillType.$values:()[Lext/mods/gameserver/enums/skills/SkillType;
  #469 = NameAndType        #470:#471     // $values:()[Lext/mods/gameserver/enums/skills/SkillType;
  #470 = Utf8               $values
  #471 = Utf8               ()[Lext/mods/gameserver/enums/skills/SkillType;
  #472 = Utf8               Signature
  #473 = Utf8               Ljava/lang/Class<+Lext/mods/gameserver/skills/L2Skill;>;
  #474 = Utf8               values
  #475 = Utf8               Code
  #476 = Utf8               LineNumberTable
  #477 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/enums/skills/SkillType;
  #478 = Utf8               LocalVariableTable
  #479 = Utf8               name
  #480 = Utf8               Ljava/lang/String;
  #481 = Utf8               MethodParameters
  #482 = Utf8               makeSkill
  #483 = Utf8               (Lext/mods/commons/data/StatSet;)Lext/mods/gameserver/skills/L2Skill;
  #484 = Utf8               c
  #485 = Utf8               Ljava/lang/reflect/Constructor;
  #486 = Utf8               e
  #487 = Utf8               Ljava/lang/Exception;
  #488 = Utf8               this
  #489 = Utf8               set
  #490 = Utf8               Lext/mods/commons/data/StatSet;
  #491 = Utf8               LocalVariableTypeTable
  #492 = Utf8               Ljava/lang/reflect/Constructor<+Lext/mods/gameserver/skills/L2Skill;>;
  #493 = Utf8               StackMapTable
  #494 = Utf8               ()V
  #495 = Utf8               classType
  #496 = Utf8               (Ljava/lang/Class<+Lext/mods/gameserver/skills/L2Skill;>;)V
  #497 = Utf8               <clinit>
  #498 = Utf8               Ljava/lang/Enum<Lext/mods/gameserver/enums/skills/SkillType;>;
  #499 = Utf8               SourceFile
  #500 = Utf8               SkillType.java
{
  public static final ext.mods.gameserver.enums.skills.SkillType PDAM;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType FATAL;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType MDAM;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType CPDAMPERCENT;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType MANADAM;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType DOT;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType MDOT;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType DRAIN_SOUL;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType DRAIN;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType DEATHLINK;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType BLOW;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType SIGNET;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType SIGNET_CASTTIME;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType SEED;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType REAL_DAMAGE;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType BLEED;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType POISON;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType STUN;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType ROOT;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType CONFUSION;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType FEAR;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType SLEEP;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType MUTE;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType PARALYZE;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType WEAKNESS;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType HEAL;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType MANAHEAL;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType COMBATPOINTHEAL;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType HOT;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType MPHOT;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType BALANCE_LIFE;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType HEAL_STATIC;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType MANARECHARGE;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType HEAL_PERCENT;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType MANAHEAL_PERCENT;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType GIVE_SP;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType AGGDAMAGE;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType AGGREDUCE;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType AGGREMOVE;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType AGGREDUCE_CHAR;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType AGGDEBUFF;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType FISHING;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType PUMPING;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType REELING;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType UNLOCK;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType UNLOCK_SPECIAL;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType DELUXE_KEY_UNLOCK;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType ENCHANT_ARMOR;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType ENCHANT_WEAPON;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType SOULSHOT;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType SPIRITSHOT;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType SIEGE_FLAG;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType TAKE_CASTLE;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType SOW;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType HARVEST;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType GET_PLAYER;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType DUMMY;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType INSTANT_JUMP;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType COMMON_CRAFT;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType DWARVEN_CRAFT;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType CREATE_ITEM;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType EXTRACTABLE;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType EXTRACTABLE_FISH;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType SUMMON;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType FEED_PET;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType STRIDER_SIEGE_ASSAULT;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType ERASE;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType BETRAY;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType SPAWN;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType CANCEL;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType MAGE_BANE;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType WARRIOR_BANE;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType NEGATE;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType CANCEL_DEBUFF;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType BUFF;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType SONIC;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType FORCE;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType DEBUFF;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType PASSIVE;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType CONT;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType RESURRECT;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType CHARGEDAM;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType LUCK;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType RECALL;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType TELEPORT;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType SUMMON_FRIEND;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType SUMMON_PARTY;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType SUMMON_CREATURE;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType REFLECT;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType SPOIL;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType SWEEP;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType FAKE_DEATH;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType BEAST_FEED;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType FUSION;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType CHANGE_APPEARANCE;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType COREDONE;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.SkillType NOTDONE;
    descriptor: Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static ext.mods.gameserver.enums.skills.SkillType[] values();
    descriptor: ()[Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #295                // Field $VALUES:[Lext/mods/gameserver/enums/skills/SkillType;
         3: invokevirtual #299                // Method "[Lext/mods/gameserver/enums/skills/SkillType;".clone:()Ljava/lang/Object;
         6: checkcast     #300                // class "[Lext/mods/gameserver/enums/skills/SkillType;"
         9: areturn
      LineNumberTable:
        line 38: 0

  public static ext.mods.gameserver.enums.skills.SkillType valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/gameserver/enums/skills/SkillType
         2: aload_0
         3: invokestatic  #304                // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/gameserver/enums/skills/SkillType
         9: areturn
      LineNumberTable:
        line 38: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  name   Ljava/lang/String;
    MethodParameters:
      Name                           Flags
      <no name>                      mandated

  public ext.mods.gameserver.skills.L2Skill makeSkill(ext.mods.commons.data.StatSet);
    descriptor: (Lext/mods/commons/data/StatSet;)Lext/mods/gameserver/skills/L2Skill;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=3, args_size=2
         0: aload_0
         1: getfield      #310                // Field _class:Ljava/lang/Class;
         4: iconst_1
         5: anewarray     #314                // class java/lang/Class
         8: dup
         9: iconst_0
        10: ldc_w         #316                // class ext/mods/commons/data/StatSet
        13: aastore
        14: invokevirtual #318                // Method java/lang/Class.getConstructor:([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
        17: astore_2
        18: aload_2
        19: iconst_1
        20: anewarray     #322                // class java/lang/Object
        23: dup
        24: iconst_0
        25: aload_1
        26: aastore
        27: invokevirtual #324                // Method java/lang/reflect/Constructor.newInstance:([Ljava/lang/Object;)Ljava/lang/Object;
        30: checkcast     #330                // class ext/mods/gameserver/skills/L2Skill
        33: areturn
        34: astore_2
        35: new           #334                // class java/lang/RuntimeException
        38: dup
        39: aload_2
        40: invokespecial #336                // Method java/lang/RuntimeException."<init>":(Ljava/lang/Throwable;)V
        43: athrow
      Exception table:
         from    to  target type
             0    33    34   Class java/lang/Exception
      LineNumberTable:
        line 159: 0
        line 161: 18
        line 163: 34
        line 165: 35
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           18      16     2     c   Ljava/lang/reflect/Constructor;
           35       9     2     e   Ljava/lang/Exception;
            0      44     0  this   Lext/mods/gameserver/enums/skills/SkillType;
            0      44     1   set   Lext/mods/commons/data/StatSet;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           18      16     2     c   Ljava/lang/reflect/Constructor<+Lext/mods/gameserver/skills/L2Skill;>;
      StackMapTable: number_of_entries = 1
        frame_type = 98 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=5, locals=0, args_size=0
         0: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
         3: dup
         4: ldc_w         #345                // String PDAM
         7: iconst_0
         8: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
        11: putstatic     #3                  // Field PDAM:Lext/mods/gameserver/enums/skills/SkillType;
        14: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
        17: dup
        18: ldc_w         #347                // String FATAL
        21: iconst_1
        22: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
        25: putstatic     #7                  // Field FATAL:Lext/mods/gameserver/enums/skills/SkillType;
        28: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
        31: dup
        32: ldc_w         #348                // String MDAM
        35: iconst_2
        36: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
        39: putstatic     #10                 // Field MDAM:Lext/mods/gameserver/enums/skills/SkillType;
        42: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
        45: dup
        46: ldc_w         #349                // String CPDAMPERCENT
        49: iconst_3
        50: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
        53: putstatic     #13                 // Field CPDAMPERCENT:Lext/mods/gameserver/enums/skills/SkillType;
        56: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
        59: dup
        60: ldc_w         #350                // String MANADAM
        63: iconst_4
        64: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
        67: putstatic     #16                 // Field MANADAM:Lext/mods/gameserver/enums/skills/SkillType;
        70: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
        73: dup
        74: ldc_w         #351                // String DOT
        77: iconst_5
        78: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
        81: putstatic     #19                 // Field DOT:Lext/mods/gameserver/enums/skills/SkillType;
        84: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
        87: dup
        88: ldc_w         #352                // String MDOT
        91: bipush        6
        93: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
        96: putstatic     #22                 // Field MDOT:Lext/mods/gameserver/enums/skills/SkillType;
        99: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
       102: dup
       103: ldc_w         #353                // String DRAIN_SOUL
       106: bipush        7
       108: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
       111: putstatic     #25                 // Field DRAIN_SOUL:Lext/mods/gameserver/enums/skills/SkillType;
       114: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
       117: dup
       118: ldc_w         #354                // String DRAIN
       121: bipush        8
       123: ldc_w         #355                // class ext/mods/gameserver/skills/l2skills/L2SkillDrain
       126: invokespecial #357                // Method "<init>":(Ljava/lang/String;ILjava/lang/Class;)V
       129: putstatic     #28                 // Field DRAIN:Lext/mods/gameserver/enums/skills/SkillType;
       132: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
       135: dup
       136: ldc_w         #360                // String DEATHLINK
       139: bipush        9
       141: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
       144: putstatic     #31                 // Field DEATHLINK:Lext/mods/gameserver/enums/skills/SkillType;
       147: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
       150: dup
       151: ldc_w         #361                // String BLOW
       154: bipush        10
       156: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
       159: putstatic     #34                 // Field BLOW:Lext/mods/gameserver/enums/skills/SkillType;
       162: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
       165: dup
       166: ldc_w         #362                // String SIGNET
       169: bipush        11
       171: ldc_w         #363                // class ext/mods/gameserver/skills/l2skills/L2SkillSignet
       174: invokespecial #357                // Method "<init>":(Ljava/lang/String;ILjava/lang/Class;)V
       177: putstatic     #37                 // Field SIGNET:Lext/mods/gameserver/enums/skills/SkillType;
       180: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
       183: dup
       184: ldc_w         #365                // String SIGNET_CASTTIME
       187: bipush        12
       189: ldc_w         #366                // class ext/mods/gameserver/skills/l2skills/L2SkillSignetCasttime
       192: invokespecial #357                // Method "<init>":(Ljava/lang/String;ILjava/lang/Class;)V
       195: putstatic     #40                 // Field SIGNET_CASTTIME:Lext/mods/gameserver/enums/skills/SkillType;
       198: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
       201: dup
       202: ldc_w         #368                // String SEED
       205: bipush        13
       207: ldc_w         #369                // class ext/mods/gameserver/skills/l2skills/L2SkillSeed
       210: invokespecial #357                // Method "<init>":(Ljava/lang/String;ILjava/lang/Class;)V
       213: putstatic     #43                 // Field SEED:Lext/mods/gameserver/enums/skills/SkillType;
       216: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
       219: dup
       220: ldc_w         #371                // String REAL_DAMAGE
       223: bipush        14
       225: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
       228: putstatic     #46                 // Field REAL_DAMAGE:Lext/mods/gameserver/enums/skills/SkillType;
       231: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
       234: dup
       235: ldc_w         #372                // String BLEED
       238: bipush        15
       240: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
       243: putstatic     #49                 // Field BLEED:Lext/mods/gameserver/enums/skills/SkillType;
       246: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
       249: dup
       250: ldc_w         #373                // String POISON
       253: bipush        16
       255: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
       258: putstatic     #52                 // Field POISON:Lext/mods/gameserver/enums/skills/SkillType;
       261: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
       264: dup
       265: ldc_w         #374                // String STUN
       268: bipush        17
       270: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
       273: putstatic     #55                 // Field STUN:Lext/mods/gameserver/enums/skills/SkillType;
       276: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
       279: dup
       280: ldc_w         #375                // String ROOT
       283: bipush        18
       285: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
       288: putstatic     #58                 // Field ROOT:Lext/mods/gameserver/enums/skills/SkillType;
       291: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
       294: dup
       295: ldc_w         #376                // String CONFUSION
       298: bipush        19
       300: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
       303: putstatic     #61                 // Field CONFUSION:Lext/mods/gameserver/enums/skills/SkillType;
       306: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
       309: dup
       310: ldc_w         #377                // String FEAR
       313: bipush        20
       315: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
       318: putstatic     #64                 // Field FEAR:Lext/mods/gameserver/enums/skills/SkillType;
       321: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
       324: dup
       325: ldc_w         #378                // String SLEEP
       328: bipush        21
       330: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
       333: putstatic     #67                 // Field SLEEP:Lext/mods/gameserver/enums/skills/SkillType;
       336: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
       339: dup
       340: ldc_w         #379                // String MUTE
       343: bipush        22
       345: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
       348: putstatic     #70                 // Field MUTE:Lext/mods/gameserver/enums/skills/SkillType;
       351: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
       354: dup
       355: ldc_w         #380                // String PARALYZE
       358: bipush        23
       360: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
       363: putstatic     #73                 // Field PARALYZE:Lext/mods/gameserver/enums/skills/SkillType;
       366: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
       369: dup
       370: ldc_w         #381                // String WEAKNESS
       373: bipush        24
       375: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
       378: putstatic     #76                 // Field WEAKNESS:Lext/mods/gameserver/enums/skills/SkillType;
       381: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
       384: dup
       385: ldc_w         #382                // String HEAL
       388: bipush        25
       390: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
       393: putstatic     #79                 // Field HEAL:Lext/mods/gameserver/enums/skills/SkillType;
       396: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
       399: dup
       400: ldc_w         #383                // String MANAHEAL
       403: bipush        26
       405: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
       408: putstatic     #82                 // Field MANAHEAL:Lext/mods/gameserver/enums/skills/SkillType;
       411: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
       414: dup
       415: ldc_w         #384                // String COMBATPOINTHEAL
       418: bipush        27
       420: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
       423: putstatic     #85                 // Field COMBATPOINTHEAL:Lext/mods/gameserver/enums/skills/SkillType;
       426: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
       429: dup
       430: ldc_w         #385                // String HOT
       433: bipush        28
       435: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
       438: putstatic     #88                 // Field HOT:Lext/mods/gameserver/enums/skills/SkillType;
       441: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
       444: dup
       445: ldc_w         #386                // String MPHOT
       448: bipush        29
       450: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
       453: putstatic     #91                 // Field MPHOT:Lext/mods/gameserver/enums/skills/SkillType;
       456: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
       459: dup
       460: ldc_w         #387                // String BALANCE_LIFE
       463: bipush        30
       465: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
       468: putstatic     #94                 // Field BALANCE_LIFE:Lext/mods/gameserver/enums/skills/SkillType;
       471: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
       474: dup
       475: ldc_w         #388                // String HEAL_STATIC
       478: bipush        31
       480: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
       483: putstatic     #97                 // Field HEAL_STATIC:Lext/mods/gameserver/enums/skills/SkillType;
       486: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
       489: dup
       490: ldc_w         #389                // String MANARECHARGE
       493: bipush        32
       495: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
       498: putstatic     #100                // Field MANARECHARGE:Lext/mods/gameserver/enums/skills/SkillType;
       501: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
       504: dup
       505: ldc_w         #390                // String HEAL_PERCENT
       508: bipush        33
       510: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
       513: putstatic     #103                // Field HEAL_PERCENT:Lext/mods/gameserver/enums/skills/SkillType;
       516: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
       519: dup
       520: ldc_w         #391                // String MANAHEAL_PERCENT
       523: bipush        34
       525: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
       528: putstatic     #106                // Field MANAHEAL_PERCENT:Lext/mods/gameserver/enums/skills/SkillType;
       531: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
       534: dup
       535: ldc_w         #392                // String GIVE_SP
       538: bipush        35
       540: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
       543: putstatic     #109                // Field GIVE_SP:Lext/mods/gameserver/enums/skills/SkillType;
       546: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
       549: dup
       550: ldc_w         #393                // String AGGDAMAGE
       553: bipush        36
       555: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
       558: putstatic     #112                // Field AGGDAMAGE:Lext/mods/gameserver/enums/skills/SkillType;
       561: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
       564: dup
       565: ldc_w         #394                // String AGGREDUCE
       568: bipush        37
       570: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
       573: putstatic     #115                // Field AGGREDUCE:Lext/mods/gameserver/enums/skills/SkillType;
       576: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
       579: dup
       580: ldc_w         #395                // String AGGREMOVE
       583: bipush        38
       585: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
       588: putstatic     #118                // Field AGGREMOVE:Lext/mods/gameserver/enums/skills/SkillType;
       591: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
       594: dup
       595: ldc_w         #396                // String AGGREDUCE_CHAR
       598: bipush        39
       600: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
       603: putstatic     #121                // Field AGGREDUCE_CHAR:Lext/mods/gameserver/enums/skills/SkillType;
       606: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
       609: dup
       610: ldc_w         #397                // String AGGDEBUFF
       613: bipush        40
       615: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
       618: putstatic     #124                // Field AGGDEBUFF:Lext/mods/gameserver/enums/skills/SkillType;
       621: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
       624: dup
       625: ldc_w         #398                // String FISHING
       628: bipush        41
       630: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
       633: putstatic     #127                // Field FISHING:Lext/mods/gameserver/enums/skills/SkillType;
       636: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
       639: dup
       640: ldc_w         #399                // String PUMPING
       643: bipush        42
       645: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
       648: putstatic     #130                // Field PUMPING:Lext/mods/gameserver/enums/skills/SkillType;
       651: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
       654: dup
       655: ldc_w         #400                // String REELING
       658: bipush        43
       660: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
       663: putstatic     #133                // Field REELING:Lext/mods/gameserver/enums/skills/SkillType;
       666: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
       669: dup
       670: ldc_w         #401                // String UNLOCK
       673: bipush        44
       675: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
       678: putstatic     #136                // Field UNLOCK:Lext/mods/gameserver/enums/skills/SkillType;
       681: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
       684: dup
       685: ldc_w         #402                // String UNLOCK_SPECIAL
       688: bipush        45
       690: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
       693: putstatic     #139                // Field UNLOCK_SPECIAL:Lext/mods/gameserver/enums/skills/SkillType;
       696: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
       699: dup
       700: ldc_w         #403                // String DELUXE_KEY_UNLOCK
       703: bipush        46
       705: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
       708: putstatic     #142                // Field DELUXE_KEY_UNLOCK:Lext/mods/gameserver/enums/skills/SkillType;
       711: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
       714: dup
       715: ldc_w         #404                // String ENCHANT_ARMOR
       718: bipush        47
       720: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
       723: putstatic     #145                // Field ENCHANT_ARMOR:Lext/mods/gameserver/enums/skills/SkillType;
       726: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
       729: dup
       730: ldc_w         #405                // String ENCHANT_WEAPON
       733: bipush        48
       735: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
       738: putstatic     #148                // Field ENCHANT_WEAPON:Lext/mods/gameserver/enums/skills/SkillType;
       741: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
       744: dup
       745: ldc_w         #406                // String SOULSHOT
       748: bipush        49
       750: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
       753: putstatic     #151                // Field SOULSHOT:Lext/mods/gameserver/enums/skills/SkillType;
       756: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
       759: dup
       760: ldc_w         #407                // String SPIRITSHOT
       763: bipush        50
       765: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
       768: putstatic     #154                // Field SPIRITSHOT:Lext/mods/gameserver/enums/skills/SkillType;
       771: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
       774: dup
       775: ldc_w         #408                // String SIEGE_FLAG
       778: bipush        51
       780: ldc_w         #409                // class ext/mods/gameserver/skills/l2skills/L2SkillSiegeFlag
       783: invokespecial #357                // Method "<init>":(Ljava/lang/String;ILjava/lang/Class;)V
       786: putstatic     #157                // Field SIEGE_FLAG:Lext/mods/gameserver/enums/skills/SkillType;
       789: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
       792: dup
       793: ldc_w         #411                // String TAKE_CASTLE
       796: bipush        52
       798: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
       801: putstatic     #160                // Field TAKE_CASTLE:Lext/mods/gameserver/enums/skills/SkillType;
       804: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
       807: dup
       808: ldc_w         #412                // String SOW
       811: bipush        53
       813: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
       816: putstatic     #163                // Field SOW:Lext/mods/gameserver/enums/skills/SkillType;
       819: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
       822: dup
       823: ldc_w         #413                // String HARVEST
       826: bipush        54
       828: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
       831: putstatic     #166                // Field HARVEST:Lext/mods/gameserver/enums/skills/SkillType;
       834: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
       837: dup
       838: ldc_w         #414                // String GET_PLAYER
       841: bipush        55
       843: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
       846: putstatic     #169                // Field GET_PLAYER:Lext/mods/gameserver/enums/skills/SkillType;
       849: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
       852: dup
       853: ldc_w         #415                // String DUMMY
       856: bipush        56
       858: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
       861: putstatic     #172                // Field DUMMY:Lext/mods/gameserver/enums/skills/SkillType;
       864: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
       867: dup
       868: ldc_w         #416                // String INSTANT_JUMP
       871: bipush        57
       873: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
       876: putstatic     #175                // Field INSTANT_JUMP:Lext/mods/gameserver/enums/skills/SkillType;
       879: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
       882: dup
       883: ldc_w         #417                // String COMMON_CRAFT
       886: bipush        58
       888: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
       891: putstatic     #178                // Field COMMON_CRAFT:Lext/mods/gameserver/enums/skills/SkillType;
       894: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
       897: dup
       898: ldc_w         #418                // String DWARVEN_CRAFT
       901: bipush        59
       903: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
       906: putstatic     #181                // Field DWARVEN_CRAFT:Lext/mods/gameserver/enums/skills/SkillType;
       909: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
       912: dup
       913: ldc_w         #419                // String CREATE_ITEM
       916: bipush        60
       918: ldc_w         #420                // class ext/mods/gameserver/skills/l2skills/L2SkillCreateItem
       921: invokespecial #357                // Method "<init>":(Ljava/lang/String;ILjava/lang/Class;)V
       924: putstatic     #184                // Field CREATE_ITEM:Lext/mods/gameserver/enums/skills/SkillType;
       927: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
       930: dup
       931: ldc_w         #422                // String EXTRACTABLE
       934: bipush        61
       936: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
       939: putstatic     #187                // Field EXTRACTABLE:Lext/mods/gameserver/enums/skills/SkillType;
       942: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
       945: dup
       946: ldc_w         #423                // String EXTRACTABLE_FISH
       949: bipush        62
       951: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
       954: putstatic     #190                // Field EXTRACTABLE_FISH:Lext/mods/gameserver/enums/skills/SkillType;
       957: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
       960: dup
       961: ldc_w         #424                // String SUMMON
       964: bipush        63
       966: ldc_w         #425                // class ext/mods/gameserver/skills/l2skills/L2SkillSummon
       969: invokespecial #357                // Method "<init>":(Ljava/lang/String;ILjava/lang/Class;)V
       972: putstatic     #193                // Field SUMMON:Lext/mods/gameserver/enums/skills/SkillType;
       975: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
       978: dup
       979: ldc_w         #427                // String FEED_PET
       982: bipush        64
       984: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
       987: putstatic     #196                // Field FEED_PET:Lext/mods/gameserver/enums/skills/SkillType;
       990: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
       993: dup
       994: ldc_w         #428                // String STRIDER_SIEGE_ASSAULT
       997: bipush        65
       999: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
      1002: putstatic     #199                // Field STRIDER_SIEGE_ASSAULT:Lext/mods/gameserver/enums/skills/SkillType;
      1005: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
      1008: dup
      1009: ldc_w         #429                // String ERASE
      1012: bipush        66
      1014: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
      1017: putstatic     #202                // Field ERASE:Lext/mods/gameserver/enums/skills/SkillType;
      1020: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
      1023: dup
      1024: ldc_w         #430                // String BETRAY
      1027: bipush        67
      1029: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
      1032: putstatic     #205                // Field BETRAY:Lext/mods/gameserver/enums/skills/SkillType;
      1035: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
      1038: dup
      1039: ldc_w         #431                // String SPAWN
      1042: bipush        68
      1044: ldc_w         #432                // class ext/mods/gameserver/skills/l2skills/L2SkillSpawn
      1047: invokespecial #357                // Method "<init>":(Ljava/lang/String;ILjava/lang/Class;)V
      1050: putstatic     #208                // Field SPAWN:Lext/mods/gameserver/enums/skills/SkillType;
      1053: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
      1056: dup
      1057: ldc_w         #434                // String CANCEL
      1060: bipush        69
      1062: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
      1065: putstatic     #211                // Field CANCEL:Lext/mods/gameserver/enums/skills/SkillType;
      1068: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
      1071: dup
      1072: ldc_w         #435                // String MAGE_BANE
      1075: bipush        70
      1077: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
      1080: putstatic     #214                // Field MAGE_BANE:Lext/mods/gameserver/enums/skills/SkillType;
      1083: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
      1086: dup
      1087: ldc_w         #436                // String WARRIOR_BANE
      1090: bipush        71
      1092: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
      1095: putstatic     #217                // Field WARRIOR_BANE:Lext/mods/gameserver/enums/skills/SkillType;
      1098: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
      1101: dup
      1102: ldc_w         #437                // String NEGATE
      1105: bipush        72
      1107: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
      1110: putstatic     #220                // Field NEGATE:Lext/mods/gameserver/enums/skills/SkillType;
      1113: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
      1116: dup
      1117: ldc_w         #438                // String CANCEL_DEBUFF
      1120: bipush        73
      1122: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
      1125: putstatic     #223                // Field CANCEL_DEBUFF:Lext/mods/gameserver/enums/skills/SkillType;
      1128: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
      1131: dup
      1132: ldc_w         #439                // String BUFF
      1135: bipush        74
      1137: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
      1140: putstatic     #226                // Field BUFF:Lext/mods/gameserver/enums/skills/SkillType;
      1143: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
      1146: dup
      1147: ldc_w         #440                // String SONIC
      1150: bipush        75
      1152: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
      1155: putstatic     #229                // Field SONIC:Lext/mods/gameserver/enums/skills/SkillType;
      1158: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
      1161: dup
      1162: ldc_w         #441                // String FORCE
      1165: bipush        76
      1167: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
      1170: putstatic     #232                // Field FORCE:Lext/mods/gameserver/enums/skills/SkillType;
      1173: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
      1176: dup
      1177: ldc_w         #442                // String DEBUFF
      1180: bipush        77
      1182: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
      1185: putstatic     #235                // Field DEBUFF:Lext/mods/gameserver/enums/skills/SkillType;
      1188: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
      1191: dup
      1192: ldc_w         #443                // String PASSIVE
      1195: bipush        78
      1197: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
      1200: putstatic     #238                // Field PASSIVE:Lext/mods/gameserver/enums/skills/SkillType;
      1203: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
      1206: dup
      1207: ldc_w         #444                // String CONT
      1210: bipush        79
      1212: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
      1215: putstatic     #241                // Field CONT:Lext/mods/gameserver/enums/skills/SkillType;
      1218: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
      1221: dup
      1222: ldc_w         #445                // String RESURRECT
      1225: bipush        80
      1227: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
      1230: putstatic     #244                // Field RESURRECT:Lext/mods/gameserver/enums/skills/SkillType;
      1233: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
      1236: dup
      1237: ldc_w         #446                // String CHARGEDAM
      1240: bipush        81
      1242: ldc_w         #447                // class ext/mods/gameserver/skills/l2skills/L2SkillChargeDmg
      1245: invokespecial #357                // Method "<init>":(Ljava/lang/String;ILjava/lang/Class;)V
      1248: putstatic     #247                // Field CHARGEDAM:Lext/mods/gameserver/enums/skills/SkillType;
      1251: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
      1254: dup
      1255: ldc_w         #449                // String LUCK
      1258: bipush        82
      1260: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
      1263: putstatic     #250                // Field LUCK:Lext/mods/gameserver/enums/skills/SkillType;
      1266: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
      1269: dup
      1270: ldc_w         #450                // String RECALL
      1273: bipush        83
      1275: ldc_w         #451                // class ext/mods/gameserver/skills/l2skills/L2SkillTeleport
      1278: invokespecial #357                // Method "<init>":(Ljava/lang/String;ILjava/lang/Class;)V
      1281: putstatic     #253                // Field RECALL:Lext/mods/gameserver/enums/skills/SkillType;
      1284: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
      1287: dup
      1288: ldc_w         #453                // String TELEPORT
      1291: bipush        84
      1293: ldc_w         #451                // class ext/mods/gameserver/skills/l2skills/L2SkillTeleport
      1296: invokespecial #357                // Method "<init>":(Ljava/lang/String;ILjava/lang/Class;)V
      1299: putstatic     #256                // Field TELEPORT:Lext/mods/gameserver/enums/skills/SkillType;
      1302: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
      1305: dup
      1306: ldc_w         #454                // String SUMMON_FRIEND
      1309: bipush        85
      1311: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
      1314: putstatic     #259                // Field SUMMON_FRIEND:Lext/mods/gameserver/enums/skills/SkillType;
      1317: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
      1320: dup
      1321: ldc_w         #455                // String SUMMON_PARTY
      1324: bipush        86
      1326: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
      1329: putstatic     #262                // Field SUMMON_PARTY:Lext/mods/gameserver/enums/skills/SkillType;
      1332: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
      1335: dup
      1336: ldc_w         #456                // String SUMMON_CREATURE
      1339: bipush        87
      1341: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
      1344: putstatic     #265                // Field SUMMON_CREATURE:Lext/mods/gameserver/enums/skills/SkillType;
      1347: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
      1350: dup
      1351: ldc_w         #457                // String REFLECT
      1354: bipush        88
      1356: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
      1359: putstatic     #268                // Field REFLECT:Lext/mods/gameserver/enums/skills/SkillType;
      1362: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
      1365: dup
      1366: ldc_w         #458                // String SPOIL
      1369: bipush        89
      1371: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
      1374: putstatic     #271                // Field SPOIL:Lext/mods/gameserver/enums/skills/SkillType;
      1377: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
      1380: dup
      1381: ldc_w         #459                // String SWEEP
      1384: bipush        90
      1386: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
      1389: putstatic     #274                // Field SWEEP:Lext/mods/gameserver/enums/skills/SkillType;
      1392: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
      1395: dup
      1396: ldc_w         #460                // String FAKE_DEATH
      1399: bipush        91
      1401: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
      1404: putstatic     #277                // Field FAKE_DEATH:Lext/mods/gameserver/enums/skills/SkillType;
      1407: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
      1410: dup
      1411: ldc_w         #461                // String BEAST_FEED
      1414: bipush        92
      1416: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
      1419: putstatic     #280                // Field BEAST_FEED:Lext/mods/gameserver/enums/skills/SkillType;
      1422: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
      1425: dup
      1426: ldc_w         #462                // String FUSION
      1429: bipush        93
      1431: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
      1434: putstatic     #283                // Field FUSION:Lext/mods/gameserver/enums/skills/SkillType;
      1437: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
      1440: dup
      1441: ldc_w         #463                // String CHANGE_APPEARANCE
      1444: bipush        94
      1446: ldc_w         #464                // class ext/mods/gameserver/skills/l2skills/L2SkillAppearance
      1449: invokespecial #357                // Method "<init>":(Ljava/lang/String;ILjava/lang/Class;)V
      1452: putstatic     #286                // Field CHANGE_APPEARANCE:Lext/mods/gameserver/enums/skills/SkillType;
      1455: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
      1458: dup
      1459: ldc_w         #466                // String COREDONE
      1462: bipush        95
      1464: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
      1467: putstatic     #289                // Field COREDONE:Lext/mods/gameserver/enums/skills/SkillType;
      1470: new           #1                  // class ext/mods/gameserver/enums/skills/SkillType
      1473: dup
      1474: ldc_w         #467                // String NOTDONE
      1477: bipush        96
      1479: invokespecial #346                // Method "<init>":(Ljava/lang/String;I)V
      1482: putstatic     #292                // Field NOTDONE:Lext/mods/gameserver/enums/skills/SkillType;
      1485: invokestatic  #468                // Method $values:()[Lext/mods/gameserver/enums/skills/SkillType;
      1488: putstatic     #295                // Field $VALUES:[Lext/mods/gameserver/enums/skills/SkillType;
      1491: return
      LineNumberTable:
        line 40: 0
        line 41: 14
        line 42: 28
        line 43: 42
        line 44: 56
        line 45: 70
        line 46: 84
        line 47: 99
        line 48: 114
        line 49: 132
        line 50: 147
        line 51: 162
        line 52: 180
        line 53: 198
        line 54: 216
        line 56: 231
        line 57: 246
        line 58: 261
        line 59: 276
        line 60: 291
        line 61: 306
        line 62: 321
        line 63: 336
        line 64: 351
        line 65: 366
        line 67: 381
        line 68: 396
        line 69: 411
        line 70: 426
        line 71: 441
        line 72: 456
        line 73: 471
        line 74: 486
        line 75: 501
        line 76: 516
        line 78: 531
        line 80: 546
        line 81: 561
        line 82: 576
        line 83: 591
        line 84: 606
        line 86: 621
        line 87: 636
        line 88: 651
        line 90: 666
        line 91: 681
        line 92: 696
        line 93: 711
        line 94: 726
        line 95: 741
        line 96: 756
        line 97: 771
        line 98: 789
        line 99: 804
        line 100: 819
        line 101: 834
        line 102: 849
        line 103: 864
        line 105: 879
        line 106: 894
        line 107: 909
        line 108: 927
        line 109: 942
        line 111: 957
        line 112: 975
        line 113: 990
        line 114: 1005
        line 115: 1020
        line 116: 1035
        line 118: 1053
        line 119: 1068
        line 120: 1083
        line 122: 1098
        line 123: 1113
        line 125: 1128
        line 126: 1143
        line 127: 1158
        line 128: 1173
        line 129: 1188
        line 130: 1203
        line 132: 1218
        line 133: 1233
        line 134: 1251
        line 135: 1266
        line 136: 1284
        line 137: 1302
        line 138: 1317
        line 139: 1332
        line 140: 1347
        line 141: 1362
        line 142: 1377
        line 143: 1392
        line 144: 1407
        line 145: 1422
        line 147: 1437
        line 149: 1455
        line 151: 1470
        line 38: 1485
}
Signature: #498                         // Ljava/lang/Enum<Lext/mods/gameserver/enums/skills/SkillType;>;
SourceFile: "SkillType.java"
