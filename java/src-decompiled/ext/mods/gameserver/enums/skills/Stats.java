// Bytecode for: ext.mods.gameserver.enums.skills.Stats
// File: ext\mods\gameserver\enums\skills\Stats.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/enums/skills/Stats.class
  Last modified 9 de jul de 2026; size 12713 bytes
  MD5 checksum 6e9236c503cda2f8a68729480e0551d5
  Compiled from "Stats.java"
public final class ext.mods.gameserver.enums.skills.Stats extends java.lang.Enum<ext.mods.gameserver.enums.skills.Stats>
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/gameserver/enums/skills/Stats
  super_class: #395                       // java/lang/Enum
  interfaces: 0, fields: 132, methods: 8, attributes: 4
Constant pool:
    #1 = Class              #2            // ext/mods/gameserver/enums/skills/Stats
    #2 = Utf8               ext/mods/gameserver/enums/skills/Stats
    #3 = Fieldref           #1.#4         // ext/mods/gameserver/enums/skills/Stats.MAX_HP:Lext/mods/gameserver/enums/skills/Stats;
    #4 = NameAndType        #5:#6         // MAX_HP:Lext/mods/gameserver/enums/skills/Stats;
    #5 = Utf8               MAX_HP
    #6 = Utf8               Lext/mods/gameserver/enums/skills/Stats;
    #7 = Fieldref           #1.#8         // ext/mods/gameserver/enums/skills/Stats.MAX_MP:Lext/mods/gameserver/enums/skills/Stats;
    #8 = NameAndType        #9:#6         // MAX_MP:Lext/mods/gameserver/enums/skills/Stats;
    #9 = Utf8               MAX_MP
   #10 = Fieldref           #1.#11        // ext/mods/gameserver/enums/skills/Stats.MAX_CP:Lext/mods/gameserver/enums/skills/Stats;
   #11 = NameAndType        #12:#6        // MAX_CP:Lext/mods/gameserver/enums/skills/Stats;
   #12 = Utf8               MAX_CP
   #13 = Fieldref           #1.#14        // ext/mods/gameserver/enums/skills/Stats.REGENERATE_HP_RATE:Lext/mods/gameserver/enums/skills/Stats;
   #14 = NameAndType        #15:#6        // REGENERATE_HP_RATE:Lext/mods/gameserver/enums/skills/Stats;
   #15 = Utf8               REGENERATE_HP_RATE
   #16 = Fieldref           #1.#17        // ext/mods/gameserver/enums/skills/Stats.REGENERATE_CP_RATE:Lext/mods/gameserver/enums/skills/Stats;
   #17 = NameAndType        #18:#6        // REGENERATE_CP_RATE:Lext/mods/gameserver/enums/skills/Stats;
   #18 = Utf8               REGENERATE_CP_RATE
   #19 = Fieldref           #1.#20        // ext/mods/gameserver/enums/skills/Stats.REGENERATE_MP_RATE:Lext/mods/gameserver/enums/skills/Stats;
   #20 = NameAndType        #21:#6        // REGENERATE_MP_RATE:Lext/mods/gameserver/enums/skills/Stats;
   #21 = Utf8               REGENERATE_MP_RATE
   #22 = Fieldref           #1.#23        // ext/mods/gameserver/enums/skills/Stats.RECHARGE_MP_RATE:Lext/mods/gameserver/enums/skills/Stats;
   #23 = NameAndType        #24:#6        // RECHARGE_MP_RATE:Lext/mods/gameserver/enums/skills/Stats;
   #24 = Utf8               RECHARGE_MP_RATE
   #25 = Fieldref           #1.#26        // ext/mods/gameserver/enums/skills/Stats.HEAL_EFFECTIVNESS:Lext/mods/gameserver/enums/skills/Stats;
   #26 = NameAndType        #27:#6        // HEAL_EFFECTIVNESS:Lext/mods/gameserver/enums/skills/Stats;
   #27 = Utf8               HEAL_EFFECTIVNESS
   #28 = Fieldref           #1.#29        // ext/mods/gameserver/enums/skills/Stats.HEAL_PROFICIENCY:Lext/mods/gameserver/enums/skills/Stats;
   #29 = NameAndType        #30:#6        // HEAL_PROFICIENCY:Lext/mods/gameserver/enums/skills/Stats;
   #30 = Utf8               HEAL_PROFICIENCY
   #31 = Fieldref           #1.#32        // ext/mods/gameserver/enums/skills/Stats.POWER_DEFENCE:Lext/mods/gameserver/enums/skills/Stats;
   #32 = NameAndType        #33:#6        // POWER_DEFENCE:Lext/mods/gameserver/enums/skills/Stats;
   #33 = Utf8               POWER_DEFENCE
   #34 = Fieldref           #1.#35        // ext/mods/gameserver/enums/skills/Stats.MAGIC_DEFENCE:Lext/mods/gameserver/enums/skills/Stats;
   #35 = NameAndType        #36:#6        // MAGIC_DEFENCE:Lext/mods/gameserver/enums/skills/Stats;
   #36 = Utf8               MAGIC_DEFENCE
   #37 = Fieldref           #1.#38        // ext/mods/gameserver/enums/skills/Stats.POWER_ATTACK:Lext/mods/gameserver/enums/skills/Stats;
   #38 = NameAndType        #39:#6        // POWER_ATTACK:Lext/mods/gameserver/enums/skills/Stats;
   #39 = Utf8               POWER_ATTACK
   #40 = Fieldref           #1.#41        // ext/mods/gameserver/enums/skills/Stats.MAGIC_ATTACK:Lext/mods/gameserver/enums/skills/Stats;
   #41 = NameAndType        #42:#6        // MAGIC_ATTACK:Lext/mods/gameserver/enums/skills/Stats;
   #42 = Utf8               MAGIC_ATTACK
   #43 = Fieldref           #1.#44        // ext/mods/gameserver/enums/skills/Stats.POWER_ATTACK_SPEED:Lext/mods/gameserver/enums/skills/Stats;
   #44 = NameAndType        #45:#6        // POWER_ATTACK_SPEED:Lext/mods/gameserver/enums/skills/Stats;
   #45 = Utf8               POWER_ATTACK_SPEED
   #46 = Fieldref           #1.#47        // ext/mods/gameserver/enums/skills/Stats.MAGIC_ATTACK_SPEED:Lext/mods/gameserver/enums/skills/Stats;
   #47 = NameAndType        #48:#6        // MAGIC_ATTACK_SPEED:Lext/mods/gameserver/enums/skills/Stats;
   #48 = Utf8               MAGIC_ATTACK_SPEED
   #49 = Fieldref           #1.#50        // ext/mods/gameserver/enums/skills/Stats.MAGIC_REUSE_RATE:Lext/mods/gameserver/enums/skills/Stats;
   #50 = NameAndType        #51:#6        // MAGIC_REUSE_RATE:Lext/mods/gameserver/enums/skills/Stats;
   #51 = Utf8               MAGIC_REUSE_RATE
   #52 = Fieldref           #1.#53        // ext/mods/gameserver/enums/skills/Stats.P_REUSE:Lext/mods/gameserver/enums/skills/Stats;
   #53 = NameAndType        #54:#6        // P_REUSE:Lext/mods/gameserver/enums/skills/Stats;
   #54 = Utf8               P_REUSE
   #55 = Fieldref           #1.#56        // ext/mods/gameserver/enums/skills/Stats.SHIELD_DEFENCE:Lext/mods/gameserver/enums/skills/Stats;
   #56 = NameAndType        #57:#6        // SHIELD_DEFENCE:Lext/mods/gameserver/enums/skills/Stats;
   #57 = Utf8               SHIELD_DEFENCE
   #58 = Fieldref           #1.#59        // ext/mods/gameserver/enums/skills/Stats.SHIELD_DEFENCE_ANGLE:Lext/mods/gameserver/enums/skills/Stats;
   #59 = NameAndType        #60:#6        // SHIELD_DEFENCE_ANGLE:Lext/mods/gameserver/enums/skills/Stats;
   #60 = Utf8               SHIELD_DEFENCE_ANGLE
   #61 = Fieldref           #1.#62        // ext/mods/gameserver/enums/skills/Stats.SHIELD_RATE:Lext/mods/gameserver/enums/skills/Stats;
   #62 = NameAndType        #63:#6        // SHIELD_RATE:Lext/mods/gameserver/enums/skills/Stats;
   #63 = Utf8               SHIELD_RATE
   #64 = Fieldref           #1.#65        // ext/mods/gameserver/enums/skills/Stats.CRITICAL_DAMAGE:Lext/mods/gameserver/enums/skills/Stats;
   #65 = NameAndType        #66:#6        // CRITICAL_DAMAGE:Lext/mods/gameserver/enums/skills/Stats;
   #66 = Utf8               CRITICAL_DAMAGE
   #67 = Fieldref           #1.#68        // ext/mods/gameserver/enums/skills/Stats.CRITICAL_DAMAGE_POS:Lext/mods/gameserver/enums/skills/Stats;
   #68 = NameAndType        #69:#6        // CRITICAL_DAMAGE_POS:Lext/mods/gameserver/enums/skills/Stats;
   #69 = Utf8               CRITICAL_DAMAGE_POS
   #70 = Fieldref           #1.#71        // ext/mods/gameserver/enums/skills/Stats.CRITICAL_DAMAGE_ADD:Lext/mods/gameserver/enums/skills/Stats;
   #71 = NameAndType        #72:#6        // CRITICAL_DAMAGE_ADD:Lext/mods/gameserver/enums/skills/Stats;
   #72 = Utf8               CRITICAL_DAMAGE_ADD
   #73 = Fieldref           #1.#74        // ext/mods/gameserver/enums/skills/Stats.PVP_PHYSICAL_DMG:Lext/mods/gameserver/enums/skills/Stats;
   #74 = NameAndType        #75:#6        // PVP_PHYSICAL_DMG:Lext/mods/gameserver/enums/skills/Stats;
   #75 = Utf8               PVP_PHYSICAL_DMG
   #76 = Fieldref           #1.#77        // ext/mods/gameserver/enums/skills/Stats.PVP_MAGICAL_DMG:Lext/mods/gameserver/enums/skills/Stats;
   #77 = NameAndType        #78:#6        // PVP_MAGICAL_DMG:Lext/mods/gameserver/enums/skills/Stats;
   #78 = Utf8               PVP_MAGICAL_DMG
   #79 = Fieldref           #1.#80        // ext/mods/gameserver/enums/skills/Stats.PVP_PHYS_SKILL_DMG:Lext/mods/gameserver/enums/skills/Stats;
   #80 = NameAndType        #81:#6        // PVP_PHYS_SKILL_DMG:Lext/mods/gameserver/enums/skills/Stats;
   #81 = Utf8               PVP_PHYS_SKILL_DMG
   #82 = Fieldref           #1.#83        // ext/mods/gameserver/enums/skills/Stats.PVP_PHYS_SKILL_DEF:Lext/mods/gameserver/enums/skills/Stats;
   #83 = NameAndType        #84:#6        // PVP_PHYS_SKILL_DEF:Lext/mods/gameserver/enums/skills/Stats;
   #84 = Utf8               PVP_PHYS_SKILL_DEF
   #85 = Fieldref           #1.#86        // ext/mods/gameserver/enums/skills/Stats.EVASION_RATE:Lext/mods/gameserver/enums/skills/Stats;
   #86 = NameAndType        #87:#6        // EVASION_RATE:Lext/mods/gameserver/enums/skills/Stats;
   #87 = Utf8               EVASION_RATE
   #88 = Fieldref           #1.#89        // ext/mods/gameserver/enums/skills/Stats.P_SKILL_EVASION:Lext/mods/gameserver/enums/skills/Stats;
   #89 = NameAndType        #90:#6        // P_SKILL_EVASION:Lext/mods/gameserver/enums/skills/Stats;
   #90 = Utf8               P_SKILL_EVASION
   #91 = Fieldref           #1.#92        // ext/mods/gameserver/enums/skills/Stats.CRITICAL_RATE:Lext/mods/gameserver/enums/skills/Stats;
   #92 = NameAndType        #93:#6        // CRITICAL_RATE:Lext/mods/gameserver/enums/skills/Stats;
   #93 = Utf8               CRITICAL_RATE
   #94 = Fieldref           #1.#95        // ext/mods/gameserver/enums/skills/Stats.BLOW_RATE:Lext/mods/gameserver/enums/skills/Stats;
   #95 = NameAndType        #96:#6        // BLOW_RATE:Lext/mods/gameserver/enums/skills/Stats;
   #96 = Utf8               BLOW_RATE
   #97 = Fieldref           #1.#98        // ext/mods/gameserver/enums/skills/Stats.LETHAL_RATE:Lext/mods/gameserver/enums/skills/Stats;
   #98 = NameAndType        #99:#6        // LETHAL_RATE:Lext/mods/gameserver/enums/skills/Stats;
   #99 = Utf8               LETHAL_RATE
  #100 = Fieldref           #1.#101       // ext/mods/gameserver/enums/skills/Stats.MCRITICAL_RATE:Lext/mods/gameserver/enums/skills/Stats;
  #101 = NameAndType        #102:#6       // MCRITICAL_RATE:Lext/mods/gameserver/enums/skills/Stats;
  #102 = Utf8               MCRITICAL_RATE
  #103 = Fieldref           #1.#104       // ext/mods/gameserver/enums/skills/Stats.ATTACK_CANCEL:Lext/mods/gameserver/enums/skills/Stats;
  #104 = NameAndType        #105:#6       // ATTACK_CANCEL:Lext/mods/gameserver/enums/skills/Stats;
  #105 = Utf8               ATTACK_CANCEL
  #106 = Fieldref           #1.#107       // ext/mods/gameserver/enums/skills/Stats.ACCURACY_COMBAT:Lext/mods/gameserver/enums/skills/Stats;
  #107 = NameAndType        #108:#6       // ACCURACY_COMBAT:Lext/mods/gameserver/enums/skills/Stats;
  #108 = Utf8               ACCURACY_COMBAT
  #109 = Fieldref           #1.#110       // ext/mods/gameserver/enums/skills/Stats.POWER_ATTACK_RANGE:Lext/mods/gameserver/enums/skills/Stats;
  #110 = NameAndType        #111:#6       // POWER_ATTACK_RANGE:Lext/mods/gameserver/enums/skills/Stats;
  #111 = Utf8               POWER_ATTACK_RANGE
  #112 = Fieldref           #1.#113       // ext/mods/gameserver/enums/skills/Stats.POWER_ATTACK_ANGLE:Lext/mods/gameserver/enums/skills/Stats;
  #113 = NameAndType        #114:#6       // POWER_ATTACK_ANGLE:Lext/mods/gameserver/enums/skills/Stats;
  #114 = Utf8               POWER_ATTACK_ANGLE
  #115 = Fieldref           #1.#116       // ext/mods/gameserver/enums/skills/Stats.ATTACK_COUNT_MAX:Lext/mods/gameserver/enums/skills/Stats;
  #116 = NameAndType        #117:#6       // ATTACK_COUNT_MAX:Lext/mods/gameserver/enums/skills/Stats;
  #117 = Utf8               ATTACK_COUNT_MAX
  #118 = Fieldref           #1.#119       // ext/mods/gameserver/enums/skills/Stats.RUN_SPEED:Lext/mods/gameserver/enums/skills/Stats;
  #119 = NameAndType        #120:#6       // RUN_SPEED:Lext/mods/gameserver/enums/skills/Stats;
  #120 = Utf8               RUN_SPEED
  #121 = Fieldref           #1.#122       // ext/mods/gameserver/enums/skills/Stats.STAT_STR:Lext/mods/gameserver/enums/skills/Stats;
  #122 = NameAndType        #123:#6       // STAT_STR:Lext/mods/gameserver/enums/skills/Stats;
  #123 = Utf8               STAT_STR
  #124 = Fieldref           #1.#125       // ext/mods/gameserver/enums/skills/Stats.STAT_CON:Lext/mods/gameserver/enums/skills/Stats;
  #125 = NameAndType        #126:#6       // STAT_CON:Lext/mods/gameserver/enums/skills/Stats;
  #126 = Utf8               STAT_CON
  #127 = Fieldref           #1.#128       // ext/mods/gameserver/enums/skills/Stats.STAT_DEX:Lext/mods/gameserver/enums/skills/Stats;
  #128 = NameAndType        #129:#6       // STAT_DEX:Lext/mods/gameserver/enums/skills/Stats;
  #129 = Utf8               STAT_DEX
  #130 = Fieldref           #1.#131       // ext/mods/gameserver/enums/skills/Stats.STAT_INT:Lext/mods/gameserver/enums/skills/Stats;
  #131 = NameAndType        #132:#6       // STAT_INT:Lext/mods/gameserver/enums/skills/Stats;
  #132 = Utf8               STAT_INT
  #133 = Fieldref           #1.#134       // ext/mods/gameserver/enums/skills/Stats.STAT_WIT:Lext/mods/gameserver/enums/skills/Stats;
  #134 = NameAndType        #135:#6       // STAT_WIT:Lext/mods/gameserver/enums/skills/Stats;
  #135 = Utf8               STAT_WIT
  #136 = Fieldref           #1.#137       // ext/mods/gameserver/enums/skills/Stats.STAT_MEN:Lext/mods/gameserver/enums/skills/Stats;
  #137 = NameAndType        #138:#6       // STAT_MEN:Lext/mods/gameserver/enums/skills/Stats;
  #138 = Utf8               STAT_MEN
  #139 = Fieldref           #1.#140       // ext/mods/gameserver/enums/skills/Stats.BREATH:Lext/mods/gameserver/enums/skills/Stats;
  #140 = NameAndType        #141:#6       // BREATH:Lext/mods/gameserver/enums/skills/Stats;
  #141 = Utf8               BREATH
  #142 = Fieldref           #1.#143       // ext/mods/gameserver/enums/skills/Stats.FALL:Lext/mods/gameserver/enums/skills/Stats;
  #143 = NameAndType        #144:#6       // FALL:Lext/mods/gameserver/enums/skills/Stats;
  #144 = Utf8               FALL
  #145 = Fieldref           #1.#146       // ext/mods/gameserver/enums/skills/Stats.AGGRESSION:Lext/mods/gameserver/enums/skills/Stats;
  #146 = NameAndType        #147:#6       // AGGRESSION:Lext/mods/gameserver/enums/skills/Stats;
  #147 = Utf8               AGGRESSION
  #148 = Fieldref           #1.#149       // ext/mods/gameserver/enums/skills/Stats.BLEED:Lext/mods/gameserver/enums/skills/Stats;
  #149 = NameAndType        #150:#6       // BLEED:Lext/mods/gameserver/enums/skills/Stats;
  #150 = Utf8               BLEED
  #151 = Fieldref           #1.#152       // ext/mods/gameserver/enums/skills/Stats.POISON:Lext/mods/gameserver/enums/skills/Stats;
  #152 = NameAndType        #153:#6       // POISON:Lext/mods/gameserver/enums/skills/Stats;
  #153 = Utf8               POISON
  #154 = Fieldref           #1.#155       // ext/mods/gameserver/enums/skills/Stats.STUN:Lext/mods/gameserver/enums/skills/Stats;
  #155 = NameAndType        #156:#6       // STUN:Lext/mods/gameserver/enums/skills/Stats;
  #156 = Utf8               STUN
  #157 = Fieldref           #1.#158       // ext/mods/gameserver/enums/skills/Stats.ROOT:Lext/mods/gameserver/enums/skills/Stats;
  #158 = NameAndType        #159:#6       // ROOT:Lext/mods/gameserver/enums/skills/Stats;
  #159 = Utf8               ROOT
  #160 = Fieldref           #1.#161       // ext/mods/gameserver/enums/skills/Stats.MOVEMENT:Lext/mods/gameserver/enums/skills/Stats;
  #161 = NameAndType        #162:#6       // MOVEMENT:Lext/mods/gameserver/enums/skills/Stats;
  #162 = Utf8               MOVEMENT
  #163 = Fieldref           #1.#164       // ext/mods/gameserver/enums/skills/Stats.CONFUSION:Lext/mods/gameserver/enums/skills/Stats;
  #164 = NameAndType        #165:#6       // CONFUSION:Lext/mods/gameserver/enums/skills/Stats;
  #165 = Utf8               CONFUSION
  #166 = Fieldref           #1.#167       // ext/mods/gameserver/enums/skills/Stats.SLEEP:Lext/mods/gameserver/enums/skills/Stats;
  #167 = NameAndType        #168:#6       // SLEEP:Lext/mods/gameserver/enums/skills/Stats;
  #168 = Utf8               SLEEP
  #169 = Fieldref           #1.#170       // ext/mods/gameserver/enums/skills/Stats.FIRE_RES:Lext/mods/gameserver/enums/skills/Stats;
  #170 = NameAndType        #171:#6       // FIRE_RES:Lext/mods/gameserver/enums/skills/Stats;
  #171 = Utf8               FIRE_RES
  #172 = Fieldref           #1.#173       // ext/mods/gameserver/enums/skills/Stats.WATER_RES:Lext/mods/gameserver/enums/skills/Stats;
  #173 = NameAndType        #174:#6       // WATER_RES:Lext/mods/gameserver/enums/skills/Stats;
  #174 = Utf8               WATER_RES
  #175 = Fieldref           #1.#176       // ext/mods/gameserver/enums/skills/Stats.WIND_RES:Lext/mods/gameserver/enums/skills/Stats;
  #176 = NameAndType        #177:#6       // WIND_RES:Lext/mods/gameserver/enums/skills/Stats;
  #177 = Utf8               WIND_RES
  #178 = Fieldref           #1.#179       // ext/mods/gameserver/enums/skills/Stats.EARTH_RES:Lext/mods/gameserver/enums/skills/Stats;
  #179 = NameAndType        #180:#6       // EARTH_RES:Lext/mods/gameserver/enums/skills/Stats;
  #180 = Utf8               EARTH_RES
  #181 = Fieldref           #1.#182       // ext/mods/gameserver/enums/skills/Stats.HOLY_RES:Lext/mods/gameserver/enums/skills/Stats;
  #182 = NameAndType        #183:#6       // HOLY_RES:Lext/mods/gameserver/enums/skills/Stats;
  #183 = Utf8               HOLY_RES
  #184 = Fieldref           #1.#185       // ext/mods/gameserver/enums/skills/Stats.DARK_RES:Lext/mods/gameserver/enums/skills/Stats;
  #185 = NameAndType        #186:#6       // DARK_RES:Lext/mods/gameserver/enums/skills/Stats;
  #186 = Utf8               DARK_RES
  #187 = Fieldref           #1.#188       // ext/mods/gameserver/enums/skills/Stats.VALAKAS_RES:Lext/mods/gameserver/enums/skills/Stats;
  #188 = NameAndType        #189:#6       // VALAKAS_RES:Lext/mods/gameserver/enums/skills/Stats;
  #189 = Utf8               VALAKAS_RES
  #190 = Fieldref           #1.#191       // ext/mods/gameserver/enums/skills/Stats.FIRE_POWER:Lext/mods/gameserver/enums/skills/Stats;
  #191 = NameAndType        #192:#6       // FIRE_POWER:Lext/mods/gameserver/enums/skills/Stats;
  #192 = Utf8               FIRE_POWER
  #193 = Fieldref           #1.#194       // ext/mods/gameserver/enums/skills/Stats.WATER_POWER:Lext/mods/gameserver/enums/skills/Stats;
  #194 = NameAndType        #195:#6       // WATER_POWER:Lext/mods/gameserver/enums/skills/Stats;
  #195 = Utf8               WATER_POWER
  #196 = Fieldref           #1.#197       // ext/mods/gameserver/enums/skills/Stats.WIND_POWER:Lext/mods/gameserver/enums/skills/Stats;
  #197 = NameAndType        #198:#6       // WIND_POWER:Lext/mods/gameserver/enums/skills/Stats;
  #198 = Utf8               WIND_POWER
  #199 = Fieldref           #1.#200       // ext/mods/gameserver/enums/skills/Stats.EARTH_POWER:Lext/mods/gameserver/enums/skills/Stats;
  #200 = NameAndType        #201:#6       // EARTH_POWER:Lext/mods/gameserver/enums/skills/Stats;
  #201 = Utf8               EARTH_POWER
  #202 = Fieldref           #1.#203       // ext/mods/gameserver/enums/skills/Stats.HOLY_POWER:Lext/mods/gameserver/enums/skills/Stats;
  #203 = NameAndType        #204:#6       // HOLY_POWER:Lext/mods/gameserver/enums/skills/Stats;
  #204 = Utf8               HOLY_POWER
  #205 = Fieldref           #1.#206       // ext/mods/gameserver/enums/skills/Stats.DARK_POWER:Lext/mods/gameserver/enums/skills/Stats;
  #206 = NameAndType        #207:#6       // DARK_POWER:Lext/mods/gameserver/enums/skills/Stats;
  #207 = Utf8               DARK_POWER
  #208 = Fieldref           #1.#209       // ext/mods/gameserver/enums/skills/Stats.VALAKAS_POWER:Lext/mods/gameserver/enums/skills/Stats;
  #209 = NameAndType        #210:#6       // VALAKAS_POWER:Lext/mods/gameserver/enums/skills/Stats;
  #210 = Utf8               VALAKAS_POWER
  #211 = Fieldref           #1.#212       // ext/mods/gameserver/enums/skills/Stats.BLEED_VULN:Lext/mods/gameserver/enums/skills/Stats;
  #212 = NameAndType        #213:#6       // BLEED_VULN:Lext/mods/gameserver/enums/skills/Stats;
  #213 = Utf8               BLEED_VULN
  #214 = Fieldref           #1.#215       // ext/mods/gameserver/enums/skills/Stats.POISON_VULN:Lext/mods/gameserver/enums/skills/Stats;
  #215 = NameAndType        #216:#6       // POISON_VULN:Lext/mods/gameserver/enums/skills/Stats;
  #216 = Utf8               POISON_VULN
  #217 = Fieldref           #1.#218       // ext/mods/gameserver/enums/skills/Stats.STUN_VULN:Lext/mods/gameserver/enums/skills/Stats;
  #218 = NameAndType        #219:#6       // STUN_VULN:Lext/mods/gameserver/enums/skills/Stats;
  #219 = Utf8               STUN_VULN
  #220 = Fieldref           #1.#221       // ext/mods/gameserver/enums/skills/Stats.PARALYZE_VULN:Lext/mods/gameserver/enums/skills/Stats;
  #221 = NameAndType        #222:#6       // PARALYZE_VULN:Lext/mods/gameserver/enums/skills/Stats;
  #222 = Utf8               PARALYZE_VULN
  #223 = Fieldref           #1.#224       // ext/mods/gameserver/enums/skills/Stats.ROOT_VULN:Lext/mods/gameserver/enums/skills/Stats;
  #224 = NameAndType        #225:#6       // ROOT_VULN:Lext/mods/gameserver/enums/skills/Stats;
  #225 = Utf8               ROOT_VULN
  #226 = Fieldref           #1.#227       // ext/mods/gameserver/enums/skills/Stats.SLEEP_VULN:Lext/mods/gameserver/enums/skills/Stats;
  #227 = NameAndType        #228:#6       // SLEEP_VULN:Lext/mods/gameserver/enums/skills/Stats;
  #228 = Utf8               SLEEP_VULN
  #229 = Fieldref           #1.#230       // ext/mods/gameserver/enums/skills/Stats.DAMAGE_ZONE_VULN:Lext/mods/gameserver/enums/skills/Stats;
  #230 = NameAndType        #231:#6       // DAMAGE_ZONE_VULN:Lext/mods/gameserver/enums/skills/Stats;
  #231 = Utf8               DAMAGE_ZONE_VULN
  #232 = Fieldref           #1.#233       // ext/mods/gameserver/enums/skills/Stats.CRIT_VULN:Lext/mods/gameserver/enums/skills/Stats;
  #233 = NameAndType        #234:#6       // CRIT_VULN:Lext/mods/gameserver/enums/skills/Stats;
  #234 = Utf8               CRIT_VULN
  #235 = Fieldref           #1.#236       // ext/mods/gameserver/enums/skills/Stats.CANCEL_VULN:Lext/mods/gameserver/enums/skills/Stats;
  #236 = NameAndType        #237:#6       // CANCEL_VULN:Lext/mods/gameserver/enums/skills/Stats;
  #237 = Utf8               CANCEL_VULN
  #238 = Fieldref           #1.#239       // ext/mods/gameserver/enums/skills/Stats.DERANGEMENT_VULN:Lext/mods/gameserver/enums/skills/Stats;
  #239 = NameAndType        #240:#6       // DERANGEMENT_VULN:Lext/mods/gameserver/enums/skills/Stats;
  #240 = Utf8               DERANGEMENT_VULN
  #241 = Fieldref           #1.#242       // ext/mods/gameserver/enums/skills/Stats.DEBUFF_VULN:Lext/mods/gameserver/enums/skills/Stats;
  #242 = NameAndType        #243:#6       // DEBUFF_VULN:Lext/mods/gameserver/enums/skills/Stats;
  #243 = Utf8               DEBUFF_VULN
  #244 = Fieldref           #1.#245       // ext/mods/gameserver/enums/skills/Stats.SWORD_WPN_VULN:Lext/mods/gameserver/enums/skills/Stats;
  #245 = NameAndType        #246:#6       // SWORD_WPN_VULN:Lext/mods/gameserver/enums/skills/Stats;
  #246 = Utf8               SWORD_WPN_VULN
  #247 = Fieldref           #1.#248       // ext/mods/gameserver/enums/skills/Stats.BLUNT_WPN_VULN:Lext/mods/gameserver/enums/skills/Stats;
  #248 = NameAndType        #249:#6       // BLUNT_WPN_VULN:Lext/mods/gameserver/enums/skills/Stats;
  #249 = Utf8               BLUNT_WPN_VULN
  #250 = Fieldref           #1.#251       // ext/mods/gameserver/enums/skills/Stats.DAGGER_WPN_VULN:Lext/mods/gameserver/enums/skills/Stats;
  #251 = NameAndType        #252:#6       // DAGGER_WPN_VULN:Lext/mods/gameserver/enums/skills/Stats;
  #252 = Utf8               DAGGER_WPN_VULN
  #253 = Fieldref           #1.#254       // ext/mods/gameserver/enums/skills/Stats.BOW_WPN_VULN:Lext/mods/gameserver/enums/skills/Stats;
  #254 = NameAndType        #255:#6       // BOW_WPN_VULN:Lext/mods/gameserver/enums/skills/Stats;
  #255 = Utf8               BOW_WPN_VULN
  #256 = Fieldref           #1.#257       // ext/mods/gameserver/enums/skills/Stats.POLE_WPN_VULN:Lext/mods/gameserver/enums/skills/Stats;
  #257 = NameAndType        #258:#6       // POLE_WPN_VULN:Lext/mods/gameserver/enums/skills/Stats;
  #258 = Utf8               POLE_WPN_VULN
  #259 = Fieldref           #1.#260       // ext/mods/gameserver/enums/skills/Stats.DUAL_WPN_VULN:Lext/mods/gameserver/enums/skills/Stats;
  #260 = NameAndType        #261:#6       // DUAL_WPN_VULN:Lext/mods/gameserver/enums/skills/Stats;
  #261 = Utf8               DUAL_WPN_VULN
  #262 = Fieldref           #1.#263       // ext/mods/gameserver/enums/skills/Stats.DUALFIST_WPN_VULN:Lext/mods/gameserver/enums/skills/Stats;
  #263 = NameAndType        #264:#6       // DUALFIST_WPN_VULN:Lext/mods/gameserver/enums/skills/Stats;
  #264 = Utf8               DUALFIST_WPN_VULN
  #265 = Fieldref           #1.#266       // ext/mods/gameserver/enums/skills/Stats.BIGSWORD_WPN_VULN:Lext/mods/gameserver/enums/skills/Stats;
  #266 = NameAndType        #267:#6       // BIGSWORD_WPN_VULN:Lext/mods/gameserver/enums/skills/Stats;
  #267 = Utf8               BIGSWORD_WPN_VULN
  #268 = Fieldref           #1.#269       // ext/mods/gameserver/enums/skills/Stats.BIGBLUNT_WPN_VULN:Lext/mods/gameserver/enums/skills/Stats;
  #269 = NameAndType        #270:#6       // BIGBLUNT_WPN_VULN:Lext/mods/gameserver/enums/skills/Stats;
  #270 = Utf8               BIGBLUNT_WPN_VULN
  #271 = Fieldref           #1.#272       // ext/mods/gameserver/enums/skills/Stats.REFLECT_DAMAGE_PERCENT:Lext/mods/gameserver/enums/skills/Stats;
  #272 = NameAndType        #273:#6       // REFLECT_DAMAGE_PERCENT:Lext/mods/gameserver/enums/skills/Stats;
  #273 = Utf8               REFLECT_DAMAGE_PERCENT
  #274 = Fieldref           #1.#275       // ext/mods/gameserver/enums/skills/Stats.REFLECT_SKILL_MAGIC:Lext/mods/gameserver/enums/skills/Stats;
  #275 = NameAndType        #276:#6       // REFLECT_SKILL_MAGIC:Lext/mods/gameserver/enums/skills/Stats;
  #276 = Utf8               REFLECT_SKILL_MAGIC
  #277 = Fieldref           #1.#278       // ext/mods/gameserver/enums/skills/Stats.REFLECT_SKILL_PHYSIC:Lext/mods/gameserver/enums/skills/Stats;
  #278 = NameAndType        #279:#6       // REFLECT_SKILL_PHYSIC:Lext/mods/gameserver/enums/skills/Stats;
  #279 = Utf8               REFLECT_SKILL_PHYSIC
  #280 = Fieldref           #1.#281       // ext/mods/gameserver/enums/skills/Stats.COUNTER_SKILL_PHYSICAL:Lext/mods/gameserver/enums/skills/Stats;
  #281 = NameAndType        #282:#6       // COUNTER_SKILL_PHYSICAL:Lext/mods/gameserver/enums/skills/Stats;
  #282 = Utf8               COUNTER_SKILL_PHYSICAL
  #283 = Fieldref           #1.#284       // ext/mods/gameserver/enums/skills/Stats.ABSORB_DAMAGE_PERCENT:Lext/mods/gameserver/enums/skills/Stats;
  #284 = NameAndType        #285:#6       // ABSORB_DAMAGE_PERCENT:Lext/mods/gameserver/enums/skills/Stats;
  #285 = Utf8               ABSORB_DAMAGE_PERCENT
  #286 = Fieldref           #1.#287       // ext/mods/gameserver/enums/skills/Stats.TRANSFER_DAMAGE_PERCENT:Lext/mods/gameserver/enums/skills/Stats;
  #287 = NameAndType        #288:#6       // TRANSFER_DAMAGE_PERCENT:Lext/mods/gameserver/enums/skills/Stats;
  #288 = Utf8               TRANSFER_DAMAGE_PERCENT
  #289 = Fieldref           #1.#290       // ext/mods/gameserver/enums/skills/Stats.PATK_PLANTS:Lext/mods/gameserver/enums/skills/Stats;
  #290 = NameAndType        #291:#6       // PATK_PLANTS:Lext/mods/gameserver/enums/skills/Stats;
  #291 = Utf8               PATK_PLANTS
  #292 = Fieldref           #1.#293       // ext/mods/gameserver/enums/skills/Stats.PATK_INSECTS:Lext/mods/gameserver/enums/skills/Stats;
  #293 = NameAndType        #294:#6       // PATK_INSECTS:Lext/mods/gameserver/enums/skills/Stats;
  #294 = Utf8               PATK_INSECTS
  #295 = Fieldref           #1.#296       // ext/mods/gameserver/enums/skills/Stats.PATK_ANIMALS:Lext/mods/gameserver/enums/skills/Stats;
  #296 = NameAndType        #297:#6       // PATK_ANIMALS:Lext/mods/gameserver/enums/skills/Stats;
  #297 = Utf8               PATK_ANIMALS
  #298 = Fieldref           #1.#299       // ext/mods/gameserver/enums/skills/Stats.PATK_BEASTS:Lext/mods/gameserver/enums/skills/Stats;
  #299 = NameAndType        #300:#6       // PATK_BEASTS:Lext/mods/gameserver/enums/skills/Stats;
  #300 = Utf8               PATK_BEASTS
  #301 = Fieldref           #1.#302       // ext/mods/gameserver/enums/skills/Stats.PATK_DRAGONS:Lext/mods/gameserver/enums/skills/Stats;
  #302 = NameAndType        #303:#6       // PATK_DRAGONS:Lext/mods/gameserver/enums/skills/Stats;
  #303 = Utf8               PATK_DRAGONS
  #304 = Fieldref           #1.#305       // ext/mods/gameserver/enums/skills/Stats.PATK_GIANTS:Lext/mods/gameserver/enums/skills/Stats;
  #305 = NameAndType        #306:#6       // PATK_GIANTS:Lext/mods/gameserver/enums/skills/Stats;
  #306 = Utf8               PATK_GIANTS
  #307 = Fieldref           #1.#308       // ext/mods/gameserver/enums/skills/Stats.PATK_MCREATURES:Lext/mods/gameserver/enums/skills/Stats;
  #308 = NameAndType        #309:#6       // PATK_MCREATURES:Lext/mods/gameserver/enums/skills/Stats;
  #309 = Utf8               PATK_MCREATURES
  #310 = Fieldref           #1.#311       // ext/mods/gameserver/enums/skills/Stats.PDEF_PLANTS:Lext/mods/gameserver/enums/skills/Stats;
  #311 = NameAndType        #312:#6       // PDEF_PLANTS:Lext/mods/gameserver/enums/skills/Stats;
  #312 = Utf8               PDEF_PLANTS
  #313 = Fieldref           #1.#314       // ext/mods/gameserver/enums/skills/Stats.PDEF_INSECTS:Lext/mods/gameserver/enums/skills/Stats;
  #314 = NameAndType        #315:#6       // PDEF_INSECTS:Lext/mods/gameserver/enums/skills/Stats;
  #315 = Utf8               PDEF_INSECTS
  #316 = Fieldref           #1.#317       // ext/mods/gameserver/enums/skills/Stats.PDEF_ANIMALS:Lext/mods/gameserver/enums/skills/Stats;
  #317 = NameAndType        #318:#6       // PDEF_ANIMALS:Lext/mods/gameserver/enums/skills/Stats;
  #318 = Utf8               PDEF_ANIMALS
  #319 = Fieldref           #1.#320       // ext/mods/gameserver/enums/skills/Stats.PDEF_BEASTS:Lext/mods/gameserver/enums/skills/Stats;
  #320 = NameAndType        #321:#6       // PDEF_BEASTS:Lext/mods/gameserver/enums/skills/Stats;
  #321 = Utf8               PDEF_BEASTS
  #322 = Fieldref           #1.#323       // ext/mods/gameserver/enums/skills/Stats.PDEF_DRAGONS:Lext/mods/gameserver/enums/skills/Stats;
  #323 = NameAndType        #324:#6       // PDEF_DRAGONS:Lext/mods/gameserver/enums/skills/Stats;
  #324 = Utf8               PDEF_DRAGONS
  #325 = Fieldref           #1.#326       // ext/mods/gameserver/enums/skills/Stats.PDEF_GIANTS:Lext/mods/gameserver/enums/skills/Stats;
  #326 = NameAndType        #327:#6       // PDEF_GIANTS:Lext/mods/gameserver/enums/skills/Stats;
  #327 = Utf8               PDEF_GIANTS
  #328 = Fieldref           #1.#329       // ext/mods/gameserver/enums/skills/Stats.PDEF_MCREATURES:Lext/mods/gameserver/enums/skills/Stats;
  #329 = NameAndType        #330:#6       // PDEF_MCREATURES:Lext/mods/gameserver/enums/skills/Stats;
  #330 = Utf8               PDEF_MCREATURES
  #331 = Fieldref           #1.#332       // ext/mods/gameserver/enums/skills/Stats.WEIGHT_LIMIT:Lext/mods/gameserver/enums/skills/Stats;
  #332 = NameAndType        #333:#6       // WEIGHT_LIMIT:Lext/mods/gameserver/enums/skills/Stats;
  #333 = Utf8               WEIGHT_LIMIT
  #334 = Fieldref           #1.#335       // ext/mods/gameserver/enums/skills/Stats.WEIGHT_PENALTY:Lext/mods/gameserver/enums/skills/Stats;
  #335 = NameAndType        #336:#6       // WEIGHT_PENALTY:Lext/mods/gameserver/enums/skills/Stats;
  #336 = Utf8               WEIGHT_PENALTY
  #337 = Fieldref           #1.#338       // ext/mods/gameserver/enums/skills/Stats.INV_LIM:Lext/mods/gameserver/enums/skills/Stats;
  #338 = NameAndType        #339:#6       // INV_LIM:Lext/mods/gameserver/enums/skills/Stats;
  #339 = Utf8               INV_LIM
  #340 = Fieldref           #1.#341       // ext/mods/gameserver/enums/skills/Stats.WH_LIM:Lext/mods/gameserver/enums/skills/Stats;
  #341 = NameAndType        #342:#6       // WH_LIM:Lext/mods/gameserver/enums/skills/Stats;
  #342 = Utf8               WH_LIM
  #343 = Fieldref           #1.#344       // ext/mods/gameserver/enums/skills/Stats.FREIGHT_LIM:Lext/mods/gameserver/enums/skills/Stats;
  #344 = NameAndType        #345:#6       // FREIGHT_LIM:Lext/mods/gameserver/enums/skills/Stats;
  #345 = Utf8               FREIGHT_LIM
  #346 = Fieldref           #1.#347       // ext/mods/gameserver/enums/skills/Stats.P_SELL_LIM:Lext/mods/gameserver/enums/skills/Stats;
  #347 = NameAndType        #348:#6       // P_SELL_LIM:Lext/mods/gameserver/enums/skills/Stats;
  #348 = Utf8               P_SELL_LIM
  #349 = Fieldref           #1.#350       // ext/mods/gameserver/enums/skills/Stats.P_BUY_LIM:Lext/mods/gameserver/enums/skills/Stats;
  #350 = NameAndType        #351:#6       // P_BUY_LIM:Lext/mods/gameserver/enums/skills/Stats;
  #351 = Utf8               P_BUY_LIM
  #352 = Fieldref           #1.#353       // ext/mods/gameserver/enums/skills/Stats.REC_D_LIM:Lext/mods/gameserver/enums/skills/Stats;
  #353 = NameAndType        #354:#6       // REC_D_LIM:Lext/mods/gameserver/enums/skills/Stats;
  #354 = Utf8               REC_D_LIM
  #355 = Fieldref           #1.#356       // ext/mods/gameserver/enums/skills/Stats.REC_C_LIM:Lext/mods/gameserver/enums/skills/Stats;
  #356 = NameAndType        #357:#6       // REC_C_LIM:Lext/mods/gameserver/enums/skills/Stats;
  #357 = Utf8               REC_C_LIM
  #358 = Fieldref           #1.#359       // ext/mods/gameserver/enums/skills/Stats.PHYSICAL_MP_CONSUME_RATE:Lext/mods/gameserver/enums/skills/Stats;
  #359 = NameAndType        #360:#6       // PHYSICAL_MP_CONSUME_RATE:Lext/mods/gameserver/enums/skills/Stats;
  #360 = Utf8               PHYSICAL_MP_CONSUME_RATE
  #361 = Fieldref           #1.#362       // ext/mods/gameserver/enums/skills/Stats.MAGICAL_MP_CONSUME_RATE:Lext/mods/gameserver/enums/skills/Stats;
  #362 = NameAndType        #363:#6       // MAGICAL_MP_CONSUME_RATE:Lext/mods/gameserver/enums/skills/Stats;
  #363 = Utf8               MAGICAL_MP_CONSUME_RATE
  #364 = Fieldref           #1.#365       // ext/mods/gameserver/enums/skills/Stats.DANCE_MP_CONSUME_RATE:Lext/mods/gameserver/enums/skills/Stats;
  #365 = NameAndType        #366:#6       // DANCE_MP_CONSUME_RATE:Lext/mods/gameserver/enums/skills/Stats;
  #366 = Utf8               DANCE_MP_CONSUME_RATE
  #367 = Fieldref           #1.#368       // ext/mods/gameserver/enums/skills/Stats.XP_RATE:Lext/mods/gameserver/enums/skills/Stats;
  #368 = NameAndType        #369:#6       // XP_RATE:Lext/mods/gameserver/enums/skills/Stats;
  #369 = Utf8               XP_RATE
  #370 = Fieldref           #1.#371       // ext/mods/gameserver/enums/skills/Stats.SP_RATE:Lext/mods/gameserver/enums/skills/Stats;
  #371 = NameAndType        #372:#6       // SP_RATE:Lext/mods/gameserver/enums/skills/Stats;
  #372 = Utf8               SP_RATE
  #373 = Fieldref           #1.#374       // ext/mods/gameserver/enums/skills/Stats.DROP_RATE:Lext/mods/gameserver/enums/skills/Stats;
  #374 = NameAndType        #375:#6       // DROP_RATE:Lext/mods/gameserver/enums/skills/Stats;
  #375 = Utf8               DROP_RATE
  #376 = Fieldref           #1.#377       // ext/mods/gameserver/enums/skills/Stats.SPOIL_RATE:Lext/mods/gameserver/enums/skills/Stats;
  #377 = NameAndType        #378:#6       // SPOIL_RATE:Lext/mods/gameserver/enums/skills/Stats;
  #378 = Utf8               SPOIL_RATE
  #379 = Fieldref           #1.#380       // ext/mods/gameserver/enums/skills/Stats.CURRENCY_RATE:Lext/mods/gameserver/enums/skills/Stats;
  #380 = NameAndType        #381:#6       // CURRENCY_RATE:Lext/mods/gameserver/enums/skills/Stats;
  #381 = Utf8               CURRENCY_RATE
  #382 = Fieldref           #1.#383       // ext/mods/gameserver/enums/skills/Stats.SKILL_MASTERY:Lext/mods/gameserver/enums/skills/Stats;
  #383 = NameAndType        #384:#6       // SKILL_MASTERY:Lext/mods/gameserver/enums/skills/Stats;
  #384 = Utf8               SKILL_MASTERY
  #385 = Fieldref           #1.#386       // ext/mods/gameserver/enums/skills/Stats.$VALUES:[Lext/mods/gameserver/enums/skills/Stats;
  #386 = NameAndType        #387:#388     // $VALUES:[Lext/mods/gameserver/enums/skills/Stats;
  #387 = Utf8               $VALUES
  #388 = Utf8               [Lext/mods/gameserver/enums/skills/Stats;
  #389 = Methodref          #390.#391     // "[Lext/mods/gameserver/enums/skills/Stats;".clone:()Ljava/lang/Object;
  #390 = Class              #388          // "[Lext/mods/gameserver/enums/skills/Stats;"
  #391 = NameAndType        #392:#393     // clone:()Ljava/lang/Object;
  #392 = Utf8               clone
  #393 = Utf8               ()Ljava/lang/Object;
  #394 = Methodref          #395.#396     // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #395 = Class              #397          // java/lang/Enum
  #396 = NameAndType        #398:#399     // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #397 = Utf8               java/lang/Enum
  #398 = Utf8               valueOf
  #399 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #400 = Methodref          #395.#401     // java/lang/Enum."<init>":(Ljava/lang/String;I)V
  #401 = NameAndType        #402:#403     // "<init>":(Ljava/lang/String;I)V
  #402 = Utf8               <init>
  #403 = Utf8               (Ljava/lang/String;I)V
  #404 = Fieldref           #1.#405       // ext/mods/gameserver/enums/skills/Stats._name:Ljava/lang/String;
  #405 = NameAndType        #406:#407     // _name:Ljava/lang/String;
  #406 = Utf8               _name
  #407 = Utf8               Ljava/lang/String;
  #408 = Fieldref           #1.#409       // ext/mods/gameserver/enums/skills/Stats._cantBeNegative:Z
  #409 = NameAndType        #410:#411     // _cantBeNegative:Z
  #410 = Utf8               _cantBeNegative
  #411 = Utf8               Z
  #412 = Methodref          #413.#414     // java/lang/String.intern:()Ljava/lang/String;
  #413 = Class              #415          // java/lang/String
  #414 = NameAndType        #416:#417     // intern:()Ljava/lang/String;
  #415 = Utf8               java/lang/String
  #416 = Utf8               intern
  #417 = Utf8               ()Ljava/lang/String;
  #418 = Fieldref           #1.#419       // ext/mods/gameserver/enums/skills/Stats.VALUES:[Lext/mods/gameserver/enums/skills/Stats;
  #419 = NameAndType        #420:#388     // VALUES:[Lext/mods/gameserver/enums/skills/Stats;
  #420 = Utf8               VALUES
  #421 = Methodref          #1.#422       // ext/mods/gameserver/enums/skills/Stats.getName:()Ljava/lang/String;
  #422 = NameAndType        #423:#417     // getName:()Ljava/lang/String;
  #423 = Utf8               getName
  #424 = Methodref          #413.#425     // java/lang/String.equals:(Ljava/lang/Object;)Z
  #425 = NameAndType        #426:#427     // equals:(Ljava/lang/Object;)Z
  #426 = Utf8               equals
  #427 = Utf8               (Ljava/lang/Object;)Z
  #428 = Class              #429          // java/util/NoSuchElementException
  #429 = Utf8               java/util/NoSuchElementException
  #430 = InvokeDynamic      #0:#431       // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #431 = NameAndType        #432:#433     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #432 = Utf8               makeConcatWithConstants
  #433 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #434 = Methodref          #428.#435     // java/util/NoSuchElementException."<init>":(Ljava/lang/String;)V
  #435 = NameAndType        #402:#436     // "<init>":(Ljava/lang/String;)V
  #436 = Utf8               (Ljava/lang/String;)V
  #437 = String             #5            // MAX_HP
  #438 = String             #439          // maxHp
  #439 = Utf8               maxHp
  #440 = Methodref          #1.#441       // ext/mods/gameserver/enums/skills/Stats."<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
  #441 = NameAndType        #402:#442     // "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
  #442 = Utf8               (Ljava/lang/String;ILjava/lang/String;Z)V
  #443 = String             #9            // MAX_MP
  #444 = String             #445          // maxMp
  #445 = Utf8               maxMp
  #446 = String             #12           // MAX_CP
  #447 = String             #448          // maxCp
  #448 = Utf8               maxCp
  #449 = String             #15           // REGENERATE_HP_RATE
  #450 = String             #451          // regHp
  #451 = Utf8               regHp
  #452 = String             #18           // REGENERATE_CP_RATE
  #453 = String             #454          // regCp
  #454 = Utf8               regCp
  #455 = String             #21           // REGENERATE_MP_RATE
  #456 = String             #457          // regMp
  #457 = Utf8               regMp
  #458 = String             #24           // RECHARGE_MP_RATE
  #459 = String             #460          // gainMp
  #460 = Utf8               gainMp
  #461 = String             #27           // HEAL_EFFECTIVNESS
  #462 = String             #463          // gainHp
  #463 = Utf8               gainHp
  #464 = String             #30           // HEAL_PROFICIENCY
  #465 = String             #466          // giveHp
  #466 = Utf8               giveHp
  #467 = String             #33           // POWER_DEFENCE
  #468 = String             #469          // pDef
  #469 = Utf8               pDef
  #470 = String             #36           // MAGIC_DEFENCE
  #471 = String             #472          // mDef
  #472 = Utf8               mDef
  #473 = String             #39           // POWER_ATTACK
  #474 = String             #475          // pAtk
  #475 = Utf8               pAtk
  #476 = String             #42           // MAGIC_ATTACK
  #477 = String             #478          // mAtk
  #478 = Utf8               mAtk
  #479 = String             #45           // POWER_ATTACK_SPEED
  #480 = String             #481          // pAtkSpd
  #481 = Utf8               pAtkSpd
  #482 = String             #48           // MAGIC_ATTACK_SPEED
  #483 = String             #484          // mAtkSpd
  #484 = Utf8               mAtkSpd
  #485 = String             #51           // MAGIC_REUSE_RATE
  #486 = String             #487          // mReuse
  #487 = Utf8               mReuse
  #488 = String             #54           // P_REUSE
  #489 = String             #490          // pReuse
  #490 = Utf8               pReuse
  #491 = String             #57           // SHIELD_DEFENCE
  #492 = String             #493          // sDef
  #493 = Utf8               sDef
  #494 = String             #60           // SHIELD_DEFENCE_ANGLE
  #495 = String             #496          // shieldDefAngle
  #496 = Utf8               shieldDefAngle
  #497 = String             #63           // SHIELD_RATE
  #498 = String             #499          // rShld
  #499 = Utf8               rShld
  #500 = String             #66           // CRITICAL_DAMAGE
  #501 = String             #502          // cAtk
  #502 = Utf8               cAtk
  #503 = String             #69           // CRITICAL_DAMAGE_POS
  #504 = String             #505          // cAtkPos
  #505 = Utf8               cAtkPos
  #506 = String             #72           // CRITICAL_DAMAGE_ADD
  #507 = String             #508          // cAtkAdd
  #508 = Utf8               cAtkAdd
  #509 = String             #75           // PVP_PHYSICAL_DMG
  #510 = String             #511          // pvpPhysDmg
  #511 = Utf8               pvpPhysDmg
  #512 = String             #78           // PVP_MAGICAL_DMG
  #513 = String             #514          // pvpMagicalDmg
  #514 = Utf8               pvpMagicalDmg
  #515 = String             #81           // PVP_PHYS_SKILL_DMG
  #516 = String             #517          // pvpPhysSkillsDmg
  #517 = Utf8               pvpPhysSkillsDmg
  #518 = String             #84           // PVP_PHYS_SKILL_DEF
  #519 = String             #520          // pvpPhysSkillsDef
  #520 = Utf8               pvpPhysSkillsDef
  #521 = String             #87           // EVASION_RATE
  #522 = String             #523          // rEvas
  #523 = Utf8               rEvas
  #524 = String             #90           // P_SKILL_EVASION
  #525 = String             #526          // pSkillEvas
  #526 = Utf8               pSkillEvas
  #527 = String             #93           // CRITICAL_RATE
  #528 = String             #529          // rCrit
  #529 = Utf8               rCrit
  #530 = String             #96           // BLOW_RATE
  #531 = String             #532          // blowRate
  #532 = Utf8               blowRate
  #533 = String             #99           // LETHAL_RATE
  #534 = String             #535          // lethalRate
  #535 = Utf8               lethalRate
  #536 = String             #102          // MCRITICAL_RATE
  #537 = String             #538          // mCritRate
  #538 = Utf8               mCritRate
  #539 = String             #105          // ATTACK_CANCEL
  #540 = String             #541          // cancel
  #541 = Utf8               cancel
  #542 = String             #108          // ACCURACY_COMBAT
  #543 = String             #544          // accCombat
  #544 = Utf8               accCombat
  #545 = String             #111          // POWER_ATTACK_RANGE
  #546 = String             #547          // pAtkRange
  #547 = Utf8               pAtkRange
  #548 = String             #114          // POWER_ATTACK_ANGLE
  #549 = String             #550          // pAtkAngle
  #550 = Utf8               pAtkAngle
  #551 = String             #117          // ATTACK_COUNT_MAX
  #552 = String             #553          // atkCountMax
  #553 = Utf8               atkCountMax
  #554 = String             #120          // RUN_SPEED
  #555 = String             #556          // runSpd
  #556 = Utf8               runSpd
  #557 = String             #123          // STAT_STR
  #558 = String             #559          // STR
  #559 = Utf8               STR
  #560 = String             #126          // STAT_CON
  #561 = String             #562          // CON
  #562 = Utf8               CON
  #563 = String             #129          // STAT_DEX
  #564 = String             #565          // DEX
  #565 = Utf8               DEX
  #566 = String             #132          // STAT_INT
  #567 = String             #568          // INT
  #568 = Utf8               INT
  #569 = String             #135          // STAT_WIT
  #570 = String             #571          // WIT
  #571 = Utf8               WIT
  #572 = String             #138          // STAT_MEN
  #573 = String             #574          // MEN
  #574 = Utf8               MEN
  #575 = String             #141          // BREATH
  #576 = String             #577          // breath
  #577 = Utf8               breath
  #578 = String             #144          // FALL
  #579 = String             #580          // fall
  #580 = Utf8               fall
  #581 = String             #147          // AGGRESSION
  #582 = String             #583          // aggression
  #583 = Utf8               aggression
  #584 = String             #150          // BLEED
  #585 = String             #586          // bleed
  #586 = Utf8               bleed
  #587 = String             #153          // POISON
  #588 = String             #589          // poison
  #589 = Utf8               poison
  #590 = String             #156          // STUN
  #591 = String             #592          // stun
  #592 = Utf8               stun
  #593 = String             #159          // ROOT
  #594 = String             #595          // root
  #595 = Utf8               root
  #596 = String             #162          // MOVEMENT
  #597 = String             #598          // movement
  #598 = Utf8               movement
  #599 = String             #165          // CONFUSION
  #600 = String             #601          // confusion
  #601 = Utf8               confusion
  #602 = String             #168          // SLEEP
  #603 = String             #604          // sleep
  #604 = Utf8               sleep
  #605 = String             #171          // FIRE_RES
  #606 = String             #607          // fireRes
  #607 = Utf8               fireRes
  #608 = String             #174          // WATER_RES
  #609 = String             #610          // waterRes
  #610 = Utf8               waterRes
  #611 = String             #177          // WIND_RES
  #612 = String             #613          // windRes
  #613 = Utf8               windRes
  #614 = String             #180          // EARTH_RES
  #615 = String             #616          // earthRes
  #616 = Utf8               earthRes
  #617 = String             #183          // HOLY_RES
  #618 = String             #619          // holyRes
  #619 = Utf8               holyRes
  #620 = String             #186          // DARK_RES
  #621 = String             #622          // darkRes
  #622 = Utf8               darkRes
  #623 = String             #189          // VALAKAS_RES
  #624 = String             #625          // valakasRes
  #625 = Utf8               valakasRes
  #626 = String             #192          // FIRE_POWER
  #627 = String             #628          // firePower
  #628 = Utf8               firePower
  #629 = String             #195          // WATER_POWER
  #630 = String             #631          // waterPower
  #631 = Utf8               waterPower
  #632 = String             #198          // WIND_POWER
  #633 = String             #634          // windPower
  #634 = Utf8               windPower
  #635 = String             #201          // EARTH_POWER
  #636 = String             #637          // earthPower
  #637 = Utf8               earthPower
  #638 = String             #204          // HOLY_POWER
  #639 = String             #640          // holyPower
  #640 = Utf8               holyPower
  #641 = String             #207          // DARK_POWER
  #642 = String             #643          // darkPower
  #643 = Utf8               darkPower
  #644 = String             #210          // VALAKAS_POWER
  #645 = String             #646          // valakasPower
  #646 = Utf8               valakasPower
  #647 = String             #213          // BLEED_VULN
  #648 = String             #649          // bleedVuln
  #649 = Utf8               bleedVuln
  #650 = String             #216          // POISON_VULN
  #651 = String             #652          // poisonVuln
  #652 = Utf8               poisonVuln
  #653 = String             #219          // STUN_VULN
  #654 = String             #655          // stunVuln
  #655 = Utf8               stunVuln
  #656 = String             #222          // PARALYZE_VULN
  #657 = String             #658          // paralyzeVuln
  #658 = Utf8               paralyzeVuln
  #659 = String             #225          // ROOT_VULN
  #660 = String             #661          // rootVuln
  #661 = Utf8               rootVuln
  #662 = String             #228          // SLEEP_VULN
  #663 = String             #664          // sleepVuln
  #664 = Utf8               sleepVuln
  #665 = String             #231          // DAMAGE_ZONE_VULN
  #666 = String             #667          // damageZoneVuln
  #667 = Utf8               damageZoneVuln
  #668 = String             #234          // CRIT_VULN
  #669 = String             #670          // critVuln
  #670 = Utf8               critVuln
  #671 = String             #237          // CANCEL_VULN
  #672 = String             #673          // cancelVuln
  #673 = Utf8               cancelVuln
  #674 = String             #240          // DERANGEMENT_VULN
  #675 = String             #676          // derangementVuln
  #676 = Utf8               derangementVuln
  #677 = String             #243          // DEBUFF_VULN
  #678 = String             #679          // debuffVuln
  #679 = Utf8               debuffVuln
  #680 = String             #246          // SWORD_WPN_VULN
  #681 = String             #682          // swordWpnVuln
  #682 = Utf8               swordWpnVuln
  #683 = String             #249          // BLUNT_WPN_VULN
  #684 = String             #685          // bluntWpnVuln
  #685 = Utf8               bluntWpnVuln
  #686 = String             #252          // DAGGER_WPN_VULN
  #687 = String             #688          // daggerWpnVuln
  #688 = Utf8               daggerWpnVuln
  #689 = String             #255          // BOW_WPN_VULN
  #690 = String             #691          // bowWpnVuln
  #691 = Utf8               bowWpnVuln
  #692 = String             #258          // POLE_WPN_VULN
  #693 = String             #694          // poleWpnVuln
  #694 = Utf8               poleWpnVuln
  #695 = String             #261          // DUAL_WPN_VULN
  #696 = String             #697          // dualWpnVuln
  #697 = Utf8               dualWpnVuln
  #698 = String             #264          // DUALFIST_WPN_VULN
  #699 = String             #700          // dualFistWpnVuln
  #700 = Utf8               dualFistWpnVuln
  #701 = String             #267          // BIGSWORD_WPN_VULN
  #702 = String             #703          // bigSwordWpnVuln
  #703 = Utf8               bigSwordWpnVuln
  #704 = String             #270          // BIGBLUNT_WPN_VULN
  #705 = String             #706          // bigBluntWpnVuln
  #706 = Utf8               bigBluntWpnVuln
  #707 = String             #273          // REFLECT_DAMAGE_PERCENT
  #708 = String             #709          // reflectDam
  #709 = Utf8               reflectDam
  #710 = String             #276          // REFLECT_SKILL_MAGIC
  #711 = String             #712          // reflectSkillMagic
  #712 = Utf8               reflectSkillMagic
  #713 = String             #279          // REFLECT_SKILL_PHYSIC
  #714 = String             #715          // reflectSkillPhysic
  #715 = Utf8               reflectSkillPhysic
  #716 = String             #282          // COUNTER_SKILL_PHYSICAL
  #717 = String             #718          // counterSkill
  #718 = Utf8               counterSkill
  #719 = String             #285          // ABSORB_DAMAGE_PERCENT
  #720 = String             #721          // absorbDam
  #721 = Utf8               absorbDam
  #722 = String             #288          // TRANSFER_DAMAGE_PERCENT
  #723 = String             #724          // transDam
  #724 = Utf8               transDam
  #725 = String             #291          // PATK_PLANTS
  #726 = String             #727          // pAtk-plants
  #727 = Utf8               pAtk-plants
  #728 = String             #294          // PATK_INSECTS
  #729 = String             #730          // pAtk-insects
  #730 = Utf8               pAtk-insects
  #731 = String             #297          // PATK_ANIMALS
  #732 = String             #733          // pAtk-animals
  #733 = Utf8               pAtk-animals
  #734 = String             #300          // PATK_BEASTS
  #735 = String             #736          // pAtk-beasts
  #736 = Utf8               pAtk-beasts
  #737 = String             #303          // PATK_DRAGONS
  #738 = String             #739          // pAtk-dragons
  #739 = Utf8               pAtk-dragons
  #740 = String             #306          // PATK_GIANTS
  #741 = String             #742          // pAtk-giants
  #742 = Utf8               pAtk-giants
  #743 = String             #309          // PATK_MCREATURES
  #744 = String             #745          // pAtk-magicCreature
  #745 = Utf8               pAtk-magicCreature
  #746 = String             #312          // PDEF_PLANTS
  #747 = String             #748          // pDef-plants
  #748 = Utf8               pDef-plants
  #749 = String             #315          // PDEF_INSECTS
  #750 = String             #751          // pDef-insects
  #751 = Utf8               pDef-insects
  #752 = String             #318          // PDEF_ANIMALS
  #753 = String             #754          // pDef-animals
  #754 = Utf8               pDef-animals
  #755 = String             #321          // PDEF_BEASTS
  #756 = String             #757          // pDef-beasts
  #757 = Utf8               pDef-beasts
  #758 = String             #324          // PDEF_DRAGONS
  #759 = String             #760          // pDef-dragons
  #760 = Utf8               pDef-dragons
  #761 = String             #327          // PDEF_GIANTS
  #762 = String             #763          // pDef-giants
  #763 = Utf8               pDef-giants
  #764 = String             #330          // PDEF_MCREATURES
  #765 = String             #766          // pDef-magicCreature
  #766 = Utf8               pDef-magicCreature
  #767 = String             #333          // WEIGHT_LIMIT
  #768 = String             #769          // weightLimit
  #769 = Utf8               weightLimit
  #770 = String             #336          // WEIGHT_PENALTY
  #771 = String             #772          // weightPenalty
  #772 = Utf8               weightPenalty
  #773 = String             #339          // INV_LIM
  #774 = String             #775          // inventoryLimit
  #775 = Utf8               inventoryLimit
  #776 = String             #342          // WH_LIM
  #777 = String             #778          // whLimit
  #778 = Utf8               whLimit
  #779 = String             #345          // FREIGHT_LIM
  #780 = String             #781          // FreightLimit
  #781 = Utf8               FreightLimit
  #782 = String             #348          // P_SELL_LIM
  #783 = String             #784          // PrivateSellLimit
  #784 = Utf8               PrivateSellLimit
  #785 = String             #351          // P_BUY_LIM
  #786 = String             #787          // PrivateBuyLimit
  #787 = Utf8               PrivateBuyLimit
  #788 = String             #354          // REC_D_LIM
  #789 = String             #790          // DwarfRecipeLimit
  #790 = Utf8               DwarfRecipeLimit
  #791 = String             #357          // REC_C_LIM
  #792 = String             #793          // CommonRecipeLimit
  #793 = Utf8               CommonRecipeLimit
  #794 = String             #360          // PHYSICAL_MP_CONSUME_RATE
  #795 = String             #796          // PhysicalMpConsumeRate
  #796 = Utf8               PhysicalMpConsumeRate
  #797 = String             #363          // MAGICAL_MP_CONSUME_RATE
  #798 = String             #799          // MagicalMpConsumeRate
  #799 = Utf8               MagicalMpConsumeRate
  #800 = String             #366          // DANCE_MP_CONSUME_RATE
  #801 = String             #802          // DanceMpConsumeRate
  #802 = Utf8               DanceMpConsumeRate
  #803 = String             #369          // XP_RATE
  #804 = String             #805          // xpGain
  #805 = Utf8               xpGain
  #806 = String             #372          // SP_RATE
  #807 = String             #808          // spGain
  #808 = Utf8               spGain
  #809 = String             #375          // DROP_RATE
  #810 = String             #811          // dropRate
  #811 = Utf8               dropRate
  #812 = String             #378          // SPOIL_RATE
  #813 = String             #814          // spoilRate
  #814 = Utf8               spoilRate
  #815 = String             #381          // CURRENCY_RATE
  #816 = String             #817          // adenaRate
  #817 = Utf8               adenaRate
  #818 = String             #384          // SKILL_MASTERY
  #819 = String             #820          // skillMastery
  #820 = Utf8               skillMastery
  #821 = Methodref          #1.#822       // ext/mods/gameserver/enums/skills/Stats.$values:()[Lext/mods/gameserver/enums/skills/Stats;
  #822 = NameAndType        #823:#824     // $values:()[Lext/mods/gameserver/enums/skills/Stats;
  #823 = Utf8               $values
  #824 = Utf8               ()[Lext/mods/gameserver/enums/skills/Stats;
  #825 = Methodref          #1.#826       // ext/mods/gameserver/enums/skills/Stats.values:()[Lext/mods/gameserver/enums/skills/Stats;
  #826 = NameAndType        #827:#824     // values:()[Lext/mods/gameserver/enums/skills/Stats;
  #827 = Utf8               values
  #828 = Fieldref           #1.#829       // ext/mods/gameserver/enums/skills/Stats.NUM_STATS:I
  #829 = NameAndType        #830:#831     // NUM_STATS:I
  #830 = Utf8               NUM_STATS
  #831 = Utf8               I
  #832 = Utf8               Code
  #833 = Utf8               LineNumberTable
  #834 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/enums/skills/Stats;
  #835 = Utf8               LocalVariableTable
  #836 = Utf8               name
  #837 = Utf8               MethodParameters
  #838 = Utf8               this
  #839 = Utf8               cantBeNegative
  #840 = Utf8               Signature
  #841 = Utf8               (Ljava/lang/String;Z)V
  #842 = Utf8               ()Z
  #843 = Utf8               valueOfXml
  #844 = Utf8               stat
  #845 = Utf8               StackMapTable
  #846 = Utf8               <clinit>
  #847 = Utf8               ()V
  #848 = Utf8               Ljava/lang/Enum<Lext/mods/gameserver/enums/skills/Stats;>;
  #849 = Utf8               SourceFile
  #850 = Utf8               Stats.java
  #851 = Utf8               BootstrapMethods
  #852 = String             #853          // Unknown name \'\u0001\' for enum Stats
  #853 = Utf8               Unknown name \'\u0001\' for enum Stats
  #854 = MethodHandle       6:#855        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #855 = Methodref          #856.#857     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #856 = Class              #858          // java/lang/invoke/StringConcatFactory
  #857 = NameAndType        #432:#859     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #858 = Utf8               java/lang/invoke/StringConcatFactory
  #859 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #860 = Utf8               InnerClasses
  #861 = Class              #862          // java/lang/invoke/MethodHandles$Lookup
  #862 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #863 = Class              #864          // java/lang/invoke/MethodHandles
  #864 = Utf8               java/lang/invoke/MethodHandles
  #865 = Utf8               Lookup
{
  public static final ext.mods.gameserver.enums.skills.Stats MAX_HP;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats MAX_MP;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats MAX_CP;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats REGENERATE_HP_RATE;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats REGENERATE_CP_RATE;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats REGENERATE_MP_RATE;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats RECHARGE_MP_RATE;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats HEAL_EFFECTIVNESS;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats HEAL_PROFICIENCY;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats POWER_DEFENCE;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats MAGIC_DEFENCE;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats POWER_ATTACK;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats MAGIC_ATTACK;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats POWER_ATTACK_SPEED;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats MAGIC_ATTACK_SPEED;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats MAGIC_REUSE_RATE;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats P_REUSE;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats SHIELD_DEFENCE;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats SHIELD_DEFENCE_ANGLE;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats SHIELD_RATE;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats CRITICAL_DAMAGE;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats CRITICAL_DAMAGE_POS;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats CRITICAL_DAMAGE_ADD;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats PVP_PHYSICAL_DMG;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats PVP_MAGICAL_DMG;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats PVP_PHYS_SKILL_DMG;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats PVP_PHYS_SKILL_DEF;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats EVASION_RATE;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats P_SKILL_EVASION;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats CRITICAL_RATE;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats BLOW_RATE;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats LETHAL_RATE;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats MCRITICAL_RATE;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats ATTACK_CANCEL;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats ACCURACY_COMBAT;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats POWER_ATTACK_RANGE;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats POWER_ATTACK_ANGLE;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats ATTACK_COUNT_MAX;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats RUN_SPEED;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats STAT_STR;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats STAT_CON;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats STAT_DEX;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats STAT_INT;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats STAT_WIT;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats STAT_MEN;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats BREATH;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats FALL;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats AGGRESSION;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats BLEED;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats POISON;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats STUN;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats ROOT;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats MOVEMENT;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats CONFUSION;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats SLEEP;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats FIRE_RES;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats WATER_RES;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats WIND_RES;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats EARTH_RES;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats HOLY_RES;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats DARK_RES;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats VALAKAS_RES;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats FIRE_POWER;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats WATER_POWER;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats WIND_POWER;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats EARTH_POWER;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats HOLY_POWER;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats DARK_POWER;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats VALAKAS_POWER;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats BLEED_VULN;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats POISON_VULN;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats STUN_VULN;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats PARALYZE_VULN;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats ROOT_VULN;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats SLEEP_VULN;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats DAMAGE_ZONE_VULN;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats CRIT_VULN;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats CANCEL_VULN;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats DERANGEMENT_VULN;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats DEBUFF_VULN;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats SWORD_WPN_VULN;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats BLUNT_WPN_VULN;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats DAGGER_WPN_VULN;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats BOW_WPN_VULN;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats POLE_WPN_VULN;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats DUAL_WPN_VULN;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats DUALFIST_WPN_VULN;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats BIGSWORD_WPN_VULN;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats BIGBLUNT_WPN_VULN;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats REFLECT_DAMAGE_PERCENT;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats REFLECT_SKILL_MAGIC;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats REFLECT_SKILL_PHYSIC;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats COUNTER_SKILL_PHYSICAL;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats ABSORB_DAMAGE_PERCENT;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats TRANSFER_DAMAGE_PERCENT;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats PATK_PLANTS;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats PATK_INSECTS;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats PATK_ANIMALS;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats PATK_BEASTS;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats PATK_DRAGONS;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats PATK_GIANTS;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats PATK_MCREATURES;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats PDEF_PLANTS;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats PDEF_INSECTS;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats PDEF_ANIMALS;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats PDEF_BEASTS;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats PDEF_DRAGONS;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats PDEF_GIANTS;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats PDEF_MCREATURES;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats WEIGHT_LIMIT;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats WEIGHT_PENALTY;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats INV_LIM;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats WH_LIM;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats FREIGHT_LIM;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats P_SELL_LIM;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats P_BUY_LIM;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats REC_D_LIM;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats REC_C_LIM;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats PHYSICAL_MP_CONSUME_RATE;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats MAGICAL_MP_CONSUME_RATE;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats DANCE_MP_CONSUME_RATE;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats XP_RATE;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats SP_RATE;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats DROP_RATE;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats SPOIL_RATE;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats CURRENCY_RATE;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats SKILL_MASTERY;
    descriptor: Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.Stats[] VALUES;
    descriptor: [Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL

  public static final int NUM_STATS;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL

  public static ext.mods.gameserver.enums.skills.Stats[] values();
    descriptor: ()[Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #385                // Field $VALUES:[Lext/mods/gameserver/enums/skills/Stats;
         3: invokevirtual #389                // Method "[Lext/mods/gameserver/enums/skills/Stats;".clone:()Ljava/lang/Object;
         6: checkcast     #390                // class "[Lext/mods/gameserver/enums/skills/Stats;"
         9: areturn
      LineNumberTable:
        line 22: 0

  public static ext.mods.gameserver.enums.skills.Stats valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/gameserver/enums/skills/Stats
         2: aload_0
         3: invokestatic  #394                // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/gameserver/enums/skills/Stats
         9: areturn
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  name   Ljava/lang/String;
    MethodParameters:
      Name                           Flags
      <no name>                      mandated

  public java.lang.String getName();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #404                // Field _name:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 188: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/enums/skills/Stats;

  public boolean cantBeNegative();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #408                // Field _cantBeNegative:Z
         4: ireturn
      LineNumberTable:
        line 193: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/enums/skills/Stats;

  public static ext.mods.gameserver.enums.skills.Stats valueOfXml(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/enums/skills/Stats;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=3, locals=5, args_size=1
         0: aload_0
         1: invokevirtual #412                // Method java/lang/String.intern:()Ljava/lang/String;
         4: astore_0
         5: getstatic     #418                // Field VALUES:[Lext/mods/gameserver/enums/skills/Stats;
         8: astore_1
         9: aload_1
        10: arraylength
        11: istore_2
        12: iconst_0
        13: istore_3
        14: iload_3
        15: iload_2
        16: if_icmpge     45
        19: aload_1
        20: iload_3
        21: aaload
        22: astore        4
        24: aload         4
        26: invokevirtual #421                // Method getName:()Ljava/lang/String;
        29: aload_0
        30: invokevirtual #424                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        33: ifeq          39
        36: aload         4
        38: areturn
        39: iinc          3, 1
        42: goto          14
        45: new           #428                // class java/util/NoSuchElementException
        48: dup
        49: aload_0
        50: invokedynamic #430,  0            // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        55: invokespecial #434                // Method java/util/NoSuchElementException."<init>":(Ljava/lang/String;)V
        58: athrow
      LineNumberTable:
        line 198: 0
        line 199: 5
        line 201: 24
        line 202: 36
        line 199: 39
        line 204: 45
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           24      15     4  stat   Lext/mods/gameserver/enums/skills/Stats;
            0      59     0  name   Ljava/lang/String;
      StackMapTable: number_of_entries = 3
        frame_type = 254 /* append */
          offset_delta = 14
          locals = [ class "[Lext/mods/gameserver/enums/skills/Stats;", int, int ]
        frame_type = 24 /* same */
        frame_type = 248 /* chop */
          offset_delta = 5

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=6, locals=0, args_size=0
         0: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
         3: dup
         4: ldc_w         #437                // String MAX_HP
         7: iconst_0
         8: ldc_w         #438                // String maxHp
        11: iconst_1
        12: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
        15: putstatic     #3                  // Field MAX_HP:Lext/mods/gameserver/enums/skills/Stats;
        18: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
        21: dup
        22: ldc_w         #443                // String MAX_MP
        25: iconst_1
        26: ldc_w         #444                // String maxMp
        29: iconst_1
        30: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
        33: putstatic     #7                  // Field MAX_MP:Lext/mods/gameserver/enums/skills/Stats;
        36: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
        39: dup
        40: ldc_w         #446                // String MAX_CP
        43: iconst_2
        44: ldc_w         #447                // String maxCp
        47: iconst_1
        48: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
        51: putstatic     #10                 // Field MAX_CP:Lext/mods/gameserver/enums/skills/Stats;
        54: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
        57: dup
        58: ldc_w         #449                // String REGENERATE_HP_RATE
        61: iconst_3
        62: ldc_w         #450                // String regHp
        65: iconst_0
        66: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
        69: putstatic     #13                 // Field REGENERATE_HP_RATE:Lext/mods/gameserver/enums/skills/Stats;
        72: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
        75: dup
        76: ldc_w         #452                // String REGENERATE_CP_RATE
        79: iconst_4
        80: ldc_w         #453                // String regCp
        83: iconst_0
        84: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
        87: putstatic     #16                 // Field REGENERATE_CP_RATE:Lext/mods/gameserver/enums/skills/Stats;
        90: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
        93: dup
        94: ldc_w         #455                // String REGENERATE_MP_RATE
        97: iconst_5
        98: ldc_w         #456                // String regMp
       101: iconst_0
       102: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
       105: putstatic     #19                 // Field REGENERATE_MP_RATE:Lext/mods/gameserver/enums/skills/Stats;
       108: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
       111: dup
       112: ldc_w         #458                // String RECHARGE_MP_RATE
       115: bipush        6
       117: ldc_w         #459                // String gainMp
       120: iconst_0
       121: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
       124: putstatic     #22                 // Field RECHARGE_MP_RATE:Lext/mods/gameserver/enums/skills/Stats;
       127: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
       130: dup
       131: ldc_w         #461                // String HEAL_EFFECTIVNESS
       134: bipush        7
       136: ldc_w         #462                // String gainHp
       139: iconst_0
       140: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
       143: putstatic     #25                 // Field HEAL_EFFECTIVNESS:Lext/mods/gameserver/enums/skills/Stats;
       146: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
       149: dup
       150: ldc_w         #464                // String HEAL_PROFICIENCY
       153: bipush        8
       155: ldc_w         #465                // String giveHp
       158: iconst_0
       159: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
       162: putstatic     #28                 // Field HEAL_PROFICIENCY:Lext/mods/gameserver/enums/skills/Stats;
       165: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
       168: dup
       169: ldc_w         #467                // String POWER_DEFENCE
       172: bipush        9
       174: ldc_w         #468                // String pDef
       177: iconst_1
       178: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
       181: putstatic     #31                 // Field POWER_DEFENCE:Lext/mods/gameserver/enums/skills/Stats;
       184: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
       187: dup
       188: ldc_w         #470                // String MAGIC_DEFENCE
       191: bipush        10
       193: ldc_w         #471                // String mDef
       196: iconst_1
       197: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
       200: putstatic     #34                 // Field MAGIC_DEFENCE:Lext/mods/gameserver/enums/skills/Stats;
       203: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
       206: dup
       207: ldc_w         #473                // String POWER_ATTACK
       210: bipush        11
       212: ldc_w         #474                // String pAtk
       215: iconst_1
       216: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
       219: putstatic     #37                 // Field POWER_ATTACK:Lext/mods/gameserver/enums/skills/Stats;
       222: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
       225: dup
       226: ldc_w         #476                // String MAGIC_ATTACK
       229: bipush        12
       231: ldc_w         #477                // String mAtk
       234: iconst_1
       235: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
       238: putstatic     #40                 // Field MAGIC_ATTACK:Lext/mods/gameserver/enums/skills/Stats;
       241: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
       244: dup
       245: ldc_w         #479                // String POWER_ATTACK_SPEED
       248: bipush        13
       250: ldc_w         #480                // String pAtkSpd
       253: iconst_1
       254: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
       257: putstatic     #43                 // Field POWER_ATTACK_SPEED:Lext/mods/gameserver/enums/skills/Stats;
       260: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
       263: dup
       264: ldc_w         #482                // String MAGIC_ATTACK_SPEED
       267: bipush        14
       269: ldc_w         #483                // String mAtkSpd
       272: iconst_1
       273: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
       276: putstatic     #46                 // Field MAGIC_ATTACK_SPEED:Lext/mods/gameserver/enums/skills/Stats;
       279: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
       282: dup
       283: ldc_w         #485                // String MAGIC_REUSE_RATE
       286: bipush        15
       288: ldc_w         #486                // String mReuse
       291: iconst_0
       292: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
       295: putstatic     #49                 // Field MAGIC_REUSE_RATE:Lext/mods/gameserver/enums/skills/Stats;
       298: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
       301: dup
       302: ldc_w         #488                // String P_REUSE
       305: bipush        16
       307: ldc_w         #489                // String pReuse
       310: iconst_0
       311: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
       314: putstatic     #52                 // Field P_REUSE:Lext/mods/gameserver/enums/skills/Stats;
       317: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
       320: dup
       321: ldc_w         #491                // String SHIELD_DEFENCE
       324: bipush        17
       326: ldc_w         #492                // String sDef
       329: iconst_1
       330: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
       333: putstatic     #55                 // Field SHIELD_DEFENCE:Lext/mods/gameserver/enums/skills/Stats;
       336: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
       339: dup
       340: ldc_w         #494                // String SHIELD_DEFENCE_ANGLE
       343: bipush        18
       345: ldc_w         #495                // String shieldDefAngle
       348: iconst_0
       349: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
       352: putstatic     #58                 // Field SHIELD_DEFENCE_ANGLE:Lext/mods/gameserver/enums/skills/Stats;
       355: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
       358: dup
       359: ldc_w         #497                // String SHIELD_RATE
       362: bipush        19
       364: ldc_w         #498                // String rShld
       367: iconst_0
       368: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
       371: putstatic     #61                 // Field SHIELD_RATE:Lext/mods/gameserver/enums/skills/Stats;
       374: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
       377: dup
       378: ldc_w         #500                // String CRITICAL_DAMAGE
       381: bipush        20
       383: ldc_w         #501                // String cAtk
       386: iconst_0
       387: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
       390: putstatic     #64                 // Field CRITICAL_DAMAGE:Lext/mods/gameserver/enums/skills/Stats;
       393: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
       396: dup
       397: ldc_w         #503                // String CRITICAL_DAMAGE_POS
       400: bipush        21
       402: ldc_w         #504                // String cAtkPos
       405: iconst_0
       406: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
       409: putstatic     #67                 // Field CRITICAL_DAMAGE_POS:Lext/mods/gameserver/enums/skills/Stats;
       412: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
       415: dup
       416: ldc_w         #506                // String CRITICAL_DAMAGE_ADD
       419: bipush        22
       421: ldc_w         #507                // String cAtkAdd
       424: iconst_0
       425: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
       428: putstatic     #70                 // Field CRITICAL_DAMAGE_ADD:Lext/mods/gameserver/enums/skills/Stats;
       431: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
       434: dup
       435: ldc_w         #509                // String PVP_PHYSICAL_DMG
       438: bipush        23
       440: ldc_w         #510                // String pvpPhysDmg
       443: iconst_0
       444: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
       447: putstatic     #73                 // Field PVP_PHYSICAL_DMG:Lext/mods/gameserver/enums/skills/Stats;
       450: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
       453: dup
       454: ldc_w         #512                // String PVP_MAGICAL_DMG
       457: bipush        24
       459: ldc_w         #513                // String pvpMagicalDmg
       462: iconst_0
       463: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
       466: putstatic     #76                 // Field PVP_MAGICAL_DMG:Lext/mods/gameserver/enums/skills/Stats;
       469: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
       472: dup
       473: ldc_w         #515                // String PVP_PHYS_SKILL_DMG
       476: bipush        25
       478: ldc_w         #516                // String pvpPhysSkillsDmg
       481: iconst_0
       482: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
       485: putstatic     #79                 // Field PVP_PHYS_SKILL_DMG:Lext/mods/gameserver/enums/skills/Stats;
       488: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
       491: dup
       492: ldc_w         #518                // String PVP_PHYS_SKILL_DEF
       495: bipush        26
       497: ldc_w         #519                // String pvpPhysSkillsDef
       500: iconst_0
       501: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
       504: putstatic     #82                 // Field PVP_PHYS_SKILL_DEF:Lext/mods/gameserver/enums/skills/Stats;
       507: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
       510: dup
       511: ldc_w         #521                // String EVASION_RATE
       514: bipush        27
       516: ldc_w         #522                // String rEvas
       519: iconst_0
       520: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
       523: putstatic     #85                 // Field EVASION_RATE:Lext/mods/gameserver/enums/skills/Stats;
       526: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
       529: dup
       530: ldc_w         #524                // String P_SKILL_EVASION
       533: bipush        28
       535: ldc_w         #525                // String pSkillEvas
       538: iconst_0
       539: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
       542: putstatic     #88                 // Field P_SKILL_EVASION:Lext/mods/gameserver/enums/skills/Stats;
       545: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
       548: dup
       549: ldc_w         #527                // String CRITICAL_RATE
       552: bipush        29
       554: ldc_w         #528                // String rCrit
       557: iconst_0
       558: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
       561: putstatic     #91                 // Field CRITICAL_RATE:Lext/mods/gameserver/enums/skills/Stats;
       564: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
       567: dup
       568: ldc_w         #530                // String BLOW_RATE
       571: bipush        30
       573: ldc_w         #531                // String blowRate
       576: iconst_0
       577: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
       580: putstatic     #94                 // Field BLOW_RATE:Lext/mods/gameserver/enums/skills/Stats;
       583: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
       586: dup
       587: ldc_w         #533                // String LETHAL_RATE
       590: bipush        31
       592: ldc_w         #534                // String lethalRate
       595: iconst_0
       596: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
       599: putstatic     #97                 // Field LETHAL_RATE:Lext/mods/gameserver/enums/skills/Stats;
       602: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
       605: dup
       606: ldc_w         #536                // String MCRITICAL_RATE
       609: bipush        32
       611: ldc_w         #537                // String mCritRate
       614: iconst_0
       615: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
       618: putstatic     #100                // Field MCRITICAL_RATE:Lext/mods/gameserver/enums/skills/Stats;
       621: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
       624: dup
       625: ldc_w         #539                // String ATTACK_CANCEL
       628: bipush        33
       630: ldc_w         #540                // String cancel
       633: iconst_0
       634: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
       637: putstatic     #103                // Field ATTACK_CANCEL:Lext/mods/gameserver/enums/skills/Stats;
       640: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
       643: dup
       644: ldc_w         #542                // String ACCURACY_COMBAT
       647: bipush        34
       649: ldc_w         #543                // String accCombat
       652: iconst_0
       653: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
       656: putstatic     #106                // Field ACCURACY_COMBAT:Lext/mods/gameserver/enums/skills/Stats;
       659: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
       662: dup
       663: ldc_w         #545                // String POWER_ATTACK_RANGE
       666: bipush        35
       668: ldc_w         #546                // String pAtkRange
       671: iconst_0
       672: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
       675: putstatic     #109                // Field POWER_ATTACK_RANGE:Lext/mods/gameserver/enums/skills/Stats;
       678: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
       681: dup
       682: ldc_w         #548                // String POWER_ATTACK_ANGLE
       685: bipush        36
       687: ldc_w         #549                // String pAtkAngle
       690: iconst_0
       691: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
       694: putstatic     #112                // Field POWER_ATTACK_ANGLE:Lext/mods/gameserver/enums/skills/Stats;
       697: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
       700: dup
       701: ldc_w         #551                // String ATTACK_COUNT_MAX
       704: bipush        37
       706: ldc_w         #552                // String atkCountMax
       709: iconst_0
       710: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
       713: putstatic     #115                // Field ATTACK_COUNT_MAX:Lext/mods/gameserver/enums/skills/Stats;
       716: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
       719: dup
       720: ldc_w         #554                // String RUN_SPEED
       723: bipush        38
       725: ldc_w         #555                // String runSpd
       728: iconst_0
       729: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
       732: putstatic     #118                // Field RUN_SPEED:Lext/mods/gameserver/enums/skills/Stats;
       735: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
       738: dup
       739: ldc_w         #557                // String STAT_STR
       742: bipush        39
       744: ldc_w         #558                // String STR
       747: iconst_1
       748: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
       751: putstatic     #121                // Field STAT_STR:Lext/mods/gameserver/enums/skills/Stats;
       754: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
       757: dup
       758: ldc_w         #560                // String STAT_CON
       761: bipush        40
       763: ldc_w         #561                // String CON
       766: iconst_1
       767: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
       770: putstatic     #124                // Field STAT_CON:Lext/mods/gameserver/enums/skills/Stats;
       773: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
       776: dup
       777: ldc_w         #563                // String STAT_DEX
       780: bipush        41
       782: ldc_w         #564                // String DEX
       785: iconst_1
       786: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
       789: putstatic     #127                // Field STAT_DEX:Lext/mods/gameserver/enums/skills/Stats;
       792: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
       795: dup
       796: ldc_w         #566                // String STAT_INT
       799: bipush        42
       801: ldc_w         #567                // String INT
       804: iconst_1
       805: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
       808: putstatic     #130                // Field STAT_INT:Lext/mods/gameserver/enums/skills/Stats;
       811: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
       814: dup
       815: ldc_w         #569                // String STAT_WIT
       818: bipush        43
       820: ldc_w         #570                // String WIT
       823: iconst_1
       824: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
       827: putstatic     #133                // Field STAT_WIT:Lext/mods/gameserver/enums/skills/Stats;
       830: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
       833: dup
       834: ldc_w         #572                // String STAT_MEN
       837: bipush        44
       839: ldc_w         #573                // String MEN
       842: iconst_1
       843: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
       846: putstatic     #136                // Field STAT_MEN:Lext/mods/gameserver/enums/skills/Stats;
       849: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
       852: dup
       853: ldc_w         #575                // String BREATH
       856: bipush        45
       858: ldc_w         #576                // String breath
       861: iconst_0
       862: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
       865: putstatic     #139                // Field BREATH:Lext/mods/gameserver/enums/skills/Stats;
       868: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
       871: dup
       872: ldc_w         #578                // String FALL
       875: bipush        46
       877: ldc_w         #579                // String fall
       880: iconst_0
       881: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
       884: putstatic     #142                // Field FALL:Lext/mods/gameserver/enums/skills/Stats;
       887: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
       890: dup
       891: ldc_w         #581                // String AGGRESSION
       894: bipush        47
       896: ldc_w         #582                // String aggression
       899: iconst_0
       900: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
       903: putstatic     #145                // Field AGGRESSION:Lext/mods/gameserver/enums/skills/Stats;
       906: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
       909: dup
       910: ldc_w         #584                // String BLEED
       913: bipush        48
       915: ldc_w         #585                // String bleed
       918: iconst_0
       919: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
       922: putstatic     #148                // Field BLEED:Lext/mods/gameserver/enums/skills/Stats;
       925: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
       928: dup
       929: ldc_w         #587                // String POISON
       932: bipush        49
       934: ldc_w         #588                // String poison
       937: iconst_0
       938: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
       941: putstatic     #151                // Field POISON:Lext/mods/gameserver/enums/skills/Stats;
       944: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
       947: dup
       948: ldc_w         #590                // String STUN
       951: bipush        50
       953: ldc_w         #591                // String stun
       956: iconst_0
       957: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
       960: putstatic     #154                // Field STUN:Lext/mods/gameserver/enums/skills/Stats;
       963: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
       966: dup
       967: ldc_w         #593                // String ROOT
       970: bipush        51
       972: ldc_w         #594                // String root
       975: iconst_0
       976: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
       979: putstatic     #157                // Field ROOT:Lext/mods/gameserver/enums/skills/Stats;
       982: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
       985: dup
       986: ldc_w         #596                // String MOVEMENT
       989: bipush        52
       991: ldc_w         #597                // String movement
       994: iconst_0
       995: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
       998: putstatic     #160                // Field MOVEMENT:Lext/mods/gameserver/enums/skills/Stats;
      1001: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      1004: dup
      1005: ldc_w         #599                // String CONFUSION
      1008: bipush        53
      1010: ldc_w         #600                // String confusion
      1013: iconst_0
      1014: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      1017: putstatic     #163                // Field CONFUSION:Lext/mods/gameserver/enums/skills/Stats;
      1020: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      1023: dup
      1024: ldc_w         #602                // String SLEEP
      1027: bipush        54
      1029: ldc_w         #603                // String sleep
      1032: iconst_0
      1033: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      1036: putstatic     #166                // Field SLEEP:Lext/mods/gameserver/enums/skills/Stats;
      1039: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      1042: dup
      1043: ldc_w         #605                // String FIRE_RES
      1046: bipush        55
      1048: ldc_w         #606                // String fireRes
      1051: iconst_0
      1052: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      1055: putstatic     #169                // Field FIRE_RES:Lext/mods/gameserver/enums/skills/Stats;
      1058: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      1061: dup
      1062: ldc_w         #608                // String WATER_RES
      1065: bipush        56
      1067: ldc_w         #609                // String waterRes
      1070: iconst_0
      1071: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      1074: putstatic     #172                // Field WATER_RES:Lext/mods/gameserver/enums/skills/Stats;
      1077: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      1080: dup
      1081: ldc_w         #611                // String WIND_RES
      1084: bipush        57
      1086: ldc_w         #612                // String windRes
      1089: iconst_0
      1090: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      1093: putstatic     #175                // Field WIND_RES:Lext/mods/gameserver/enums/skills/Stats;
      1096: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      1099: dup
      1100: ldc_w         #614                // String EARTH_RES
      1103: bipush        58
      1105: ldc_w         #615                // String earthRes
      1108: iconst_0
      1109: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      1112: putstatic     #178                // Field EARTH_RES:Lext/mods/gameserver/enums/skills/Stats;
      1115: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      1118: dup
      1119: ldc_w         #617                // String HOLY_RES
      1122: bipush        59
      1124: ldc_w         #618                // String holyRes
      1127: iconst_0
      1128: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      1131: putstatic     #181                // Field HOLY_RES:Lext/mods/gameserver/enums/skills/Stats;
      1134: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      1137: dup
      1138: ldc_w         #620                // String DARK_RES
      1141: bipush        60
      1143: ldc_w         #621                // String darkRes
      1146: iconst_0
      1147: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      1150: putstatic     #184                // Field DARK_RES:Lext/mods/gameserver/enums/skills/Stats;
      1153: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      1156: dup
      1157: ldc_w         #623                // String VALAKAS_RES
      1160: bipush        61
      1162: ldc_w         #624                // String valakasRes
      1165: iconst_0
      1166: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      1169: putstatic     #187                // Field VALAKAS_RES:Lext/mods/gameserver/enums/skills/Stats;
      1172: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      1175: dup
      1176: ldc_w         #626                // String FIRE_POWER
      1179: bipush        62
      1181: ldc_w         #627                // String firePower
      1184: iconst_0
      1185: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      1188: putstatic     #190                // Field FIRE_POWER:Lext/mods/gameserver/enums/skills/Stats;
      1191: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      1194: dup
      1195: ldc_w         #629                // String WATER_POWER
      1198: bipush        63
      1200: ldc_w         #630                // String waterPower
      1203: iconst_0
      1204: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      1207: putstatic     #193                // Field WATER_POWER:Lext/mods/gameserver/enums/skills/Stats;
      1210: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      1213: dup
      1214: ldc_w         #632                // String WIND_POWER
      1217: bipush        64
      1219: ldc_w         #633                // String windPower
      1222: iconst_0
      1223: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      1226: putstatic     #196                // Field WIND_POWER:Lext/mods/gameserver/enums/skills/Stats;
      1229: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      1232: dup
      1233: ldc_w         #635                // String EARTH_POWER
      1236: bipush        65
      1238: ldc_w         #636                // String earthPower
      1241: iconst_0
      1242: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      1245: putstatic     #199                // Field EARTH_POWER:Lext/mods/gameserver/enums/skills/Stats;
      1248: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      1251: dup
      1252: ldc_w         #638                // String HOLY_POWER
      1255: bipush        66
      1257: ldc_w         #639                // String holyPower
      1260: iconst_0
      1261: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      1264: putstatic     #202                // Field HOLY_POWER:Lext/mods/gameserver/enums/skills/Stats;
      1267: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      1270: dup
      1271: ldc_w         #641                // String DARK_POWER
      1274: bipush        67
      1276: ldc_w         #642                // String darkPower
      1279: iconst_0
      1280: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      1283: putstatic     #205                // Field DARK_POWER:Lext/mods/gameserver/enums/skills/Stats;
      1286: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      1289: dup
      1290: ldc_w         #644                // String VALAKAS_POWER
      1293: bipush        68
      1295: ldc_w         #645                // String valakasPower
      1298: iconst_0
      1299: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      1302: putstatic     #208                // Field VALAKAS_POWER:Lext/mods/gameserver/enums/skills/Stats;
      1305: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      1308: dup
      1309: ldc_w         #647                // String BLEED_VULN
      1312: bipush        69
      1314: ldc_w         #648                // String bleedVuln
      1317: iconst_0
      1318: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      1321: putstatic     #211                // Field BLEED_VULN:Lext/mods/gameserver/enums/skills/Stats;
      1324: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      1327: dup
      1328: ldc_w         #650                // String POISON_VULN
      1331: bipush        70
      1333: ldc_w         #651                // String poisonVuln
      1336: iconst_0
      1337: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      1340: putstatic     #214                // Field POISON_VULN:Lext/mods/gameserver/enums/skills/Stats;
      1343: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      1346: dup
      1347: ldc_w         #653                // String STUN_VULN
      1350: bipush        71
      1352: ldc_w         #654                // String stunVuln
      1355: iconst_0
      1356: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      1359: putstatic     #217                // Field STUN_VULN:Lext/mods/gameserver/enums/skills/Stats;
      1362: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      1365: dup
      1366: ldc_w         #656                // String PARALYZE_VULN
      1369: bipush        72
      1371: ldc_w         #657                // String paralyzeVuln
      1374: iconst_0
      1375: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      1378: putstatic     #220                // Field PARALYZE_VULN:Lext/mods/gameserver/enums/skills/Stats;
      1381: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      1384: dup
      1385: ldc_w         #659                // String ROOT_VULN
      1388: bipush        73
      1390: ldc_w         #660                // String rootVuln
      1393: iconst_0
      1394: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      1397: putstatic     #223                // Field ROOT_VULN:Lext/mods/gameserver/enums/skills/Stats;
      1400: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      1403: dup
      1404: ldc_w         #662                // String SLEEP_VULN
      1407: bipush        74
      1409: ldc_w         #663                // String sleepVuln
      1412: iconst_0
      1413: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      1416: putstatic     #226                // Field SLEEP_VULN:Lext/mods/gameserver/enums/skills/Stats;
      1419: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      1422: dup
      1423: ldc_w         #665                // String DAMAGE_ZONE_VULN
      1426: bipush        75
      1428: ldc_w         #666                // String damageZoneVuln
      1431: iconst_0
      1432: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      1435: putstatic     #229                // Field DAMAGE_ZONE_VULN:Lext/mods/gameserver/enums/skills/Stats;
      1438: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      1441: dup
      1442: ldc_w         #668                // String CRIT_VULN
      1445: bipush        76
      1447: ldc_w         #669                // String critVuln
      1450: iconst_0
      1451: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      1454: putstatic     #232                // Field CRIT_VULN:Lext/mods/gameserver/enums/skills/Stats;
      1457: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      1460: dup
      1461: ldc_w         #671                // String CANCEL_VULN
      1464: bipush        77
      1466: ldc_w         #672                // String cancelVuln
      1469: iconst_0
      1470: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      1473: putstatic     #235                // Field CANCEL_VULN:Lext/mods/gameserver/enums/skills/Stats;
      1476: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      1479: dup
      1480: ldc_w         #674                // String DERANGEMENT_VULN
      1483: bipush        78
      1485: ldc_w         #675                // String derangementVuln
      1488: iconst_0
      1489: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      1492: putstatic     #238                // Field DERANGEMENT_VULN:Lext/mods/gameserver/enums/skills/Stats;
      1495: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      1498: dup
      1499: ldc_w         #677                // String DEBUFF_VULN
      1502: bipush        79
      1504: ldc_w         #678                // String debuffVuln
      1507: iconst_0
      1508: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      1511: putstatic     #241                // Field DEBUFF_VULN:Lext/mods/gameserver/enums/skills/Stats;
      1514: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      1517: dup
      1518: ldc_w         #680                // String SWORD_WPN_VULN
      1521: bipush        80
      1523: ldc_w         #681                // String swordWpnVuln
      1526: iconst_0
      1527: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      1530: putstatic     #244                // Field SWORD_WPN_VULN:Lext/mods/gameserver/enums/skills/Stats;
      1533: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      1536: dup
      1537: ldc_w         #683                // String BLUNT_WPN_VULN
      1540: bipush        81
      1542: ldc_w         #684                // String bluntWpnVuln
      1545: iconst_0
      1546: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      1549: putstatic     #247                // Field BLUNT_WPN_VULN:Lext/mods/gameserver/enums/skills/Stats;
      1552: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      1555: dup
      1556: ldc_w         #686                // String DAGGER_WPN_VULN
      1559: bipush        82
      1561: ldc_w         #687                // String daggerWpnVuln
      1564: iconst_0
      1565: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      1568: putstatic     #250                // Field DAGGER_WPN_VULN:Lext/mods/gameserver/enums/skills/Stats;
      1571: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      1574: dup
      1575: ldc_w         #689                // String BOW_WPN_VULN
      1578: bipush        83
      1580: ldc_w         #690                // String bowWpnVuln
      1583: iconst_0
      1584: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      1587: putstatic     #253                // Field BOW_WPN_VULN:Lext/mods/gameserver/enums/skills/Stats;
      1590: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      1593: dup
      1594: ldc_w         #692                // String POLE_WPN_VULN
      1597: bipush        84
      1599: ldc_w         #693                // String poleWpnVuln
      1602: iconst_0
      1603: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      1606: putstatic     #256                // Field POLE_WPN_VULN:Lext/mods/gameserver/enums/skills/Stats;
      1609: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      1612: dup
      1613: ldc_w         #695                // String DUAL_WPN_VULN
      1616: bipush        85
      1618: ldc_w         #696                // String dualWpnVuln
      1621: iconst_0
      1622: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      1625: putstatic     #259                // Field DUAL_WPN_VULN:Lext/mods/gameserver/enums/skills/Stats;
      1628: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      1631: dup
      1632: ldc_w         #698                // String DUALFIST_WPN_VULN
      1635: bipush        86
      1637: ldc_w         #699                // String dualFistWpnVuln
      1640: iconst_0
      1641: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      1644: putstatic     #262                // Field DUALFIST_WPN_VULN:Lext/mods/gameserver/enums/skills/Stats;
      1647: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      1650: dup
      1651: ldc_w         #701                // String BIGSWORD_WPN_VULN
      1654: bipush        87
      1656: ldc_w         #702                // String bigSwordWpnVuln
      1659: iconst_0
      1660: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      1663: putstatic     #265                // Field BIGSWORD_WPN_VULN:Lext/mods/gameserver/enums/skills/Stats;
      1666: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      1669: dup
      1670: ldc_w         #704                // String BIGBLUNT_WPN_VULN
      1673: bipush        88
      1675: ldc_w         #705                // String bigBluntWpnVuln
      1678: iconst_0
      1679: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      1682: putstatic     #268                // Field BIGBLUNT_WPN_VULN:Lext/mods/gameserver/enums/skills/Stats;
      1685: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      1688: dup
      1689: ldc_w         #707                // String REFLECT_DAMAGE_PERCENT
      1692: bipush        89
      1694: ldc_w         #708                // String reflectDam
      1697: iconst_0
      1698: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      1701: putstatic     #271                // Field REFLECT_DAMAGE_PERCENT:Lext/mods/gameserver/enums/skills/Stats;
      1704: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      1707: dup
      1708: ldc_w         #710                // String REFLECT_SKILL_MAGIC
      1711: bipush        90
      1713: ldc_w         #711                // String reflectSkillMagic
      1716: iconst_0
      1717: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      1720: putstatic     #274                // Field REFLECT_SKILL_MAGIC:Lext/mods/gameserver/enums/skills/Stats;
      1723: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      1726: dup
      1727: ldc_w         #713                // String REFLECT_SKILL_PHYSIC
      1730: bipush        91
      1732: ldc_w         #714                // String reflectSkillPhysic
      1735: iconst_0
      1736: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      1739: putstatic     #277                // Field REFLECT_SKILL_PHYSIC:Lext/mods/gameserver/enums/skills/Stats;
      1742: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      1745: dup
      1746: ldc_w         #716                // String COUNTER_SKILL_PHYSICAL
      1749: bipush        92
      1751: ldc_w         #717                // String counterSkill
      1754: iconst_0
      1755: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      1758: putstatic     #280                // Field COUNTER_SKILL_PHYSICAL:Lext/mods/gameserver/enums/skills/Stats;
      1761: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      1764: dup
      1765: ldc_w         #719                // String ABSORB_DAMAGE_PERCENT
      1768: bipush        93
      1770: ldc_w         #720                // String absorbDam
      1773: iconst_0
      1774: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      1777: putstatic     #283                // Field ABSORB_DAMAGE_PERCENT:Lext/mods/gameserver/enums/skills/Stats;
      1780: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      1783: dup
      1784: ldc_w         #722                // String TRANSFER_DAMAGE_PERCENT
      1787: bipush        94
      1789: ldc_w         #723                // String transDam
      1792: iconst_0
      1793: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      1796: putstatic     #286                // Field TRANSFER_DAMAGE_PERCENT:Lext/mods/gameserver/enums/skills/Stats;
      1799: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      1802: dup
      1803: ldc_w         #725                // String PATK_PLANTS
      1806: bipush        95
      1808: ldc_w         #726                // String pAtk-plants
      1811: iconst_0
      1812: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      1815: putstatic     #289                // Field PATK_PLANTS:Lext/mods/gameserver/enums/skills/Stats;
      1818: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      1821: dup
      1822: ldc_w         #728                // String PATK_INSECTS
      1825: bipush        96
      1827: ldc_w         #729                // String pAtk-insects
      1830: iconst_0
      1831: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      1834: putstatic     #292                // Field PATK_INSECTS:Lext/mods/gameserver/enums/skills/Stats;
      1837: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      1840: dup
      1841: ldc_w         #731                // String PATK_ANIMALS
      1844: bipush        97
      1846: ldc_w         #732                // String pAtk-animals
      1849: iconst_0
      1850: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      1853: putstatic     #295                // Field PATK_ANIMALS:Lext/mods/gameserver/enums/skills/Stats;
      1856: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      1859: dup
      1860: ldc_w         #734                // String PATK_BEASTS
      1863: bipush        98
      1865: ldc_w         #735                // String pAtk-beasts
      1868: iconst_0
      1869: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      1872: putstatic     #298                // Field PATK_BEASTS:Lext/mods/gameserver/enums/skills/Stats;
      1875: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      1878: dup
      1879: ldc_w         #737                // String PATK_DRAGONS
      1882: bipush        99
      1884: ldc_w         #738                // String pAtk-dragons
      1887: iconst_0
      1888: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      1891: putstatic     #301                // Field PATK_DRAGONS:Lext/mods/gameserver/enums/skills/Stats;
      1894: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      1897: dup
      1898: ldc_w         #740                // String PATK_GIANTS
      1901: bipush        100
      1903: ldc_w         #741                // String pAtk-giants
      1906: iconst_0
      1907: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      1910: putstatic     #304                // Field PATK_GIANTS:Lext/mods/gameserver/enums/skills/Stats;
      1913: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      1916: dup
      1917: ldc_w         #743                // String PATK_MCREATURES
      1920: bipush        101
      1922: ldc_w         #744                // String pAtk-magicCreature
      1925: iconst_0
      1926: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      1929: putstatic     #307                // Field PATK_MCREATURES:Lext/mods/gameserver/enums/skills/Stats;
      1932: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      1935: dup
      1936: ldc_w         #746                // String PDEF_PLANTS
      1939: bipush        102
      1941: ldc_w         #747                // String pDef-plants
      1944: iconst_0
      1945: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      1948: putstatic     #310                // Field PDEF_PLANTS:Lext/mods/gameserver/enums/skills/Stats;
      1951: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      1954: dup
      1955: ldc_w         #749                // String PDEF_INSECTS
      1958: bipush        103
      1960: ldc_w         #750                // String pDef-insects
      1963: iconst_0
      1964: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      1967: putstatic     #313                // Field PDEF_INSECTS:Lext/mods/gameserver/enums/skills/Stats;
      1970: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      1973: dup
      1974: ldc_w         #752                // String PDEF_ANIMALS
      1977: bipush        104
      1979: ldc_w         #753                // String pDef-animals
      1982: iconst_0
      1983: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      1986: putstatic     #316                // Field PDEF_ANIMALS:Lext/mods/gameserver/enums/skills/Stats;
      1989: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      1992: dup
      1993: ldc_w         #755                // String PDEF_BEASTS
      1996: bipush        105
      1998: ldc_w         #756                // String pDef-beasts
      2001: iconst_0
      2002: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      2005: putstatic     #319                // Field PDEF_BEASTS:Lext/mods/gameserver/enums/skills/Stats;
      2008: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      2011: dup
      2012: ldc_w         #758                // String PDEF_DRAGONS
      2015: bipush        106
      2017: ldc_w         #759                // String pDef-dragons
      2020: iconst_0
      2021: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      2024: putstatic     #322                // Field PDEF_DRAGONS:Lext/mods/gameserver/enums/skills/Stats;
      2027: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      2030: dup
      2031: ldc_w         #761                // String PDEF_GIANTS
      2034: bipush        107
      2036: ldc_w         #762                // String pDef-giants
      2039: iconst_0
      2040: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      2043: putstatic     #325                // Field PDEF_GIANTS:Lext/mods/gameserver/enums/skills/Stats;
      2046: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      2049: dup
      2050: ldc_w         #764                // String PDEF_MCREATURES
      2053: bipush        108
      2055: ldc_w         #765                // String pDef-magicCreature
      2058: iconst_0
      2059: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      2062: putstatic     #328                // Field PDEF_MCREATURES:Lext/mods/gameserver/enums/skills/Stats;
      2065: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      2068: dup
      2069: ldc_w         #767                // String WEIGHT_LIMIT
      2072: bipush        109
      2074: ldc_w         #768                // String weightLimit
      2077: iconst_0
      2078: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      2081: putstatic     #331                // Field WEIGHT_LIMIT:Lext/mods/gameserver/enums/skills/Stats;
      2084: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      2087: dup
      2088: ldc_w         #770                // String WEIGHT_PENALTY
      2091: bipush        110
      2093: ldc_w         #771                // String weightPenalty
      2096: iconst_0
      2097: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      2100: putstatic     #334                // Field WEIGHT_PENALTY:Lext/mods/gameserver/enums/skills/Stats;
      2103: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      2106: dup
      2107: ldc_w         #773                // String INV_LIM
      2110: bipush        111
      2112: ldc_w         #774                // String inventoryLimit
      2115: iconst_0
      2116: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      2119: putstatic     #337                // Field INV_LIM:Lext/mods/gameserver/enums/skills/Stats;
      2122: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      2125: dup
      2126: ldc_w         #776                // String WH_LIM
      2129: bipush        112
      2131: ldc_w         #777                // String whLimit
      2134: iconst_0
      2135: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      2138: putstatic     #340                // Field WH_LIM:Lext/mods/gameserver/enums/skills/Stats;
      2141: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      2144: dup
      2145: ldc_w         #779                // String FREIGHT_LIM
      2148: bipush        113
      2150: ldc_w         #780                // String FreightLimit
      2153: iconst_0
      2154: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      2157: putstatic     #343                // Field FREIGHT_LIM:Lext/mods/gameserver/enums/skills/Stats;
      2160: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      2163: dup
      2164: ldc_w         #782                // String P_SELL_LIM
      2167: bipush        114
      2169: ldc_w         #783                // String PrivateSellLimit
      2172: iconst_0
      2173: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      2176: putstatic     #346                // Field P_SELL_LIM:Lext/mods/gameserver/enums/skills/Stats;
      2179: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      2182: dup
      2183: ldc_w         #785                // String P_BUY_LIM
      2186: bipush        115
      2188: ldc_w         #786                // String PrivateBuyLimit
      2191: iconst_0
      2192: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      2195: putstatic     #349                // Field P_BUY_LIM:Lext/mods/gameserver/enums/skills/Stats;
      2198: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      2201: dup
      2202: ldc_w         #788                // String REC_D_LIM
      2205: bipush        116
      2207: ldc_w         #789                // String DwarfRecipeLimit
      2210: iconst_0
      2211: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      2214: putstatic     #352                // Field REC_D_LIM:Lext/mods/gameserver/enums/skills/Stats;
      2217: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      2220: dup
      2221: ldc_w         #791                // String REC_C_LIM
      2224: bipush        117
      2226: ldc_w         #792                // String CommonRecipeLimit
      2229: iconst_0
      2230: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      2233: putstatic     #355                // Field REC_C_LIM:Lext/mods/gameserver/enums/skills/Stats;
      2236: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      2239: dup
      2240: ldc_w         #794                // String PHYSICAL_MP_CONSUME_RATE
      2243: bipush        118
      2245: ldc_w         #795                // String PhysicalMpConsumeRate
      2248: iconst_0
      2249: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      2252: putstatic     #358                // Field PHYSICAL_MP_CONSUME_RATE:Lext/mods/gameserver/enums/skills/Stats;
      2255: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      2258: dup
      2259: ldc_w         #797                // String MAGICAL_MP_CONSUME_RATE
      2262: bipush        119
      2264: ldc_w         #798                // String MagicalMpConsumeRate
      2267: iconst_0
      2268: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      2271: putstatic     #361                // Field MAGICAL_MP_CONSUME_RATE:Lext/mods/gameserver/enums/skills/Stats;
      2274: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      2277: dup
      2278: ldc_w         #800                // String DANCE_MP_CONSUME_RATE
      2281: bipush        120
      2283: ldc_w         #801                // String DanceMpConsumeRate
      2286: iconst_0
      2287: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      2290: putstatic     #364                // Field DANCE_MP_CONSUME_RATE:Lext/mods/gameserver/enums/skills/Stats;
      2293: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      2296: dup
      2297: ldc_w         #803                // String XP_RATE
      2300: bipush        121
      2302: ldc_w         #804                // String xpGain
      2305: iconst_0
      2306: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      2309: putstatic     #367                // Field XP_RATE:Lext/mods/gameserver/enums/skills/Stats;
      2312: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      2315: dup
      2316: ldc_w         #806                // String SP_RATE
      2319: bipush        122
      2321: ldc_w         #807                // String spGain
      2324: iconst_0
      2325: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      2328: putstatic     #370                // Field SP_RATE:Lext/mods/gameserver/enums/skills/Stats;
      2331: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      2334: dup
      2335: ldc_w         #809                // String DROP_RATE
      2338: bipush        123
      2340: ldc_w         #810                // String dropRate
      2343: iconst_0
      2344: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      2347: putstatic     #373                // Field DROP_RATE:Lext/mods/gameserver/enums/skills/Stats;
      2350: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      2353: dup
      2354: ldc_w         #812                // String SPOIL_RATE
      2357: bipush        124
      2359: ldc_w         #813                // String spoilRate
      2362: iconst_0
      2363: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      2366: putstatic     #376                // Field SPOIL_RATE:Lext/mods/gameserver/enums/skills/Stats;
      2369: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      2372: dup
      2373: ldc_w         #815                // String CURRENCY_RATE
      2376: bipush        125
      2378: ldc_w         #816                // String adenaRate
      2381: iconst_0
      2382: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      2385: putstatic     #379                // Field CURRENCY_RATE:Lext/mods/gameserver/enums/skills/Stats;
      2388: new           #1                  // class ext/mods/gameserver/enums/skills/Stats
      2391: dup
      2392: ldc_w         #818                // String SKILL_MASTERY
      2395: bipush        126
      2397: ldc_w         #819                // String skillMastery
      2400: iconst_0
      2401: invokespecial #440                // Method "<init>":(Ljava/lang/String;ILjava/lang/String;Z)V
      2404: putstatic     #382                // Field SKILL_MASTERY:Lext/mods/gameserver/enums/skills/Stats;
      2407: invokestatic  #821                // Method $values:()[Lext/mods/gameserver/enums/skills/Stats;
      2410: putstatic     #385                // Field $VALUES:[Lext/mods/gameserver/enums/skills/Stats;
      2413: invokestatic  #825                // Method values:()[Lext/mods/gameserver/enums/skills/Stats;
      2416: putstatic     #418                // Field VALUES:[Lext/mods/gameserver/enums/skills/Stats;
      2419: getstatic     #418                // Field VALUES:[Lext/mods/gameserver/enums/skills/Stats;
      2422: arraylength
      2423: putstatic     #828                // Field NUM_STATS:I
      2426: return
      LineNumberTable:
        line 24: 0
        line 25: 18
        line 26: 36
        line 27: 54
        line 28: 72
        line 29: 90
        line 30: 108
        line 31: 127
        line 32: 146
        line 34: 165
        line 35: 184
        line 36: 203
        line 37: 222
        line 38: 241
        line 39: 260
        line 40: 279
        line 41: 298
        line 42: 317
        line 43: 336
        line 44: 355
        line 46: 374
        line 47: 393
        line 48: 412
        line 50: 431
        line 51: 450
        line 52: 469
        line 53: 488
        line 55: 507
        line 56: 526
        line 57: 545
        line 58: 564
        line 59: 583
        line 60: 602
        line 61: 621
        line 63: 640
        line 64: 659
        line 65: 678
        line 66: 697
        line 68: 716
        line 70: 735
        line 71: 754
        line 72: 773
        line 73: 792
        line 74: 811
        line 75: 830
        line 77: 849
        line 78: 868
        line 80: 887
        line 81: 906
        line 82: 925
        line 83: 944
        line 84: 963
        line 85: 982
        line 86: 1001
        line 87: 1020
        line 89: 1039
        line 90: 1058
        line 91: 1077
        line 92: 1096
        line 93: 1115
        line 94: 1134
        line 95: 1153
        line 97: 1172
        line 98: 1191
        line 99: 1210
        line 100: 1229
        line 101: 1248
        line 102: 1267
        line 103: 1286
        line 105: 1305
        line 106: 1324
        line 107: 1343
        line 108: 1362
        line 109: 1381
        line 110: 1400
        line 111: 1419
        line 112: 1438
        line 113: 1457
        line 114: 1476
        line 115: 1495
        line 117: 1514
        line 118: 1533
        line 119: 1552
        line 120: 1571
        line 121: 1590
        line 122: 1609
        line 123: 1628
        line 124: 1647
        line 125: 1666
        line 127: 1685
        line 128: 1704
        line 129: 1723
        line 130: 1742
        line 131: 1761
        line 132: 1780
        line 134: 1799
        line 135: 1818
        line 136: 1837
        line 137: 1856
        line 138: 1875
        line 139: 1894
        line 140: 1913
        line 142: 1932
        line 143: 1951
        line 144: 1970
        line 145: 1989
        line 146: 2008
        line 147: 2027
        line 148: 2046
        line 150: 2065
        line 151: 2084
        line 152: 2103
        line 153: 2122
        line 154: 2141
        line 155: 2160
        line 156: 2179
        line 157: 2198
        line 158: 2217
        line 160: 2236
        line 161: 2255
        line 162: 2274
        line 164: 2293
        line 165: 2312
        line 166: 2331
        line 167: 2350
        line 168: 2369
        line 170: 2388
        line 22: 2407
        line 172: 2413
        line 174: 2419
}
Signature: #848                         // Ljava/lang/Enum<Lext/mods/gameserver/enums/skills/Stats;>;
SourceFile: "Stats.java"
BootstrapMethods:
  0: #854 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #852 Unknown name \'\u0001\' for enum Stats
InnerClasses:
  public static final #865= #861 of #863; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
