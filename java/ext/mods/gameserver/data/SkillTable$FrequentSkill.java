// Bytecode for: ext.mods.gameserver.data.SkillTable$FrequentSkill
// File: ext\mods\gameserver\data\SkillTable$FrequentSkill.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/SkillTable$FrequentSkill.class
  Last modified 9 de jul de 2026; size 4637 bytes
  MD5 checksum c75aa97f85fbd8e60ffc0f8efd44fd61
  Compiled from "SkillTable.java"
public final class ext.mods.gameserver.data.SkillTable$FrequentSkill extends java.lang.Enum<ext.mods.gameserver.data.SkillTable$FrequentSkill>
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/gameserver/data/SkillTable$FrequentSkill
  super_class: #149                       // java/lang/Enum
  interfaces: 0, fields: 49, methods: 6, attributes: 4
Constant pool:
    #1 = Class              #2            // ext/mods/gameserver/data/SkillTable$FrequentSkill
    #2 = Utf8               ext/mods/gameserver/data/SkillTable$FrequentSkill
    #3 = Fieldref           #1.#4         // ext/mods/gameserver/data/SkillTable$FrequentSkill.LUCKY:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
    #4 = NameAndType        #5:#6         // LUCKY:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
    #5 = Utf8               LUCKY
    #6 = Utf8               Lext/mods/gameserver/data/SkillTable$FrequentSkill;
    #7 = Fieldref           #1.#8         // ext/mods/gameserver/data/SkillTable$FrequentSkill.BLESSING_OF_PROTECTION:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
    #8 = NameAndType        #9:#6         // BLESSING_OF_PROTECTION:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
    #9 = Utf8               BLESSING_OF_PROTECTION
   #10 = Fieldref           #1.#11        // ext/mods/gameserver/data/SkillTable$FrequentSkill.SEAL_OF_RULER:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
   #11 = NameAndType        #12:#6        // SEAL_OF_RULER:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
   #12 = Utf8               SEAL_OF_RULER
   #13 = Fieldref           #1.#14        // ext/mods/gameserver/data/SkillTable$FrequentSkill.BUILD_HEADQUARTERS:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
   #14 = NameAndType        #15:#6        // BUILD_HEADQUARTERS:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
   #15 = Utf8               BUILD_HEADQUARTERS
   #16 = Fieldref           #1.#17        // ext/mods/gameserver/data/SkillTable$FrequentSkill.STRIDER_SIEGE_ASSAULT:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
   #17 = NameAndType        #18:#6        // STRIDER_SIEGE_ASSAULT:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
   #18 = Utf8               STRIDER_SIEGE_ASSAULT
   #19 = Fieldref           #1.#20        // ext/mods/gameserver/data/SkillTable$FrequentSkill.DWARVEN_CRAFT:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
   #20 = NameAndType        #21:#6        // DWARVEN_CRAFT:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
   #21 = Utf8               DWARVEN_CRAFT
   #22 = Fieldref           #1.#23        // ext/mods/gameserver/data/SkillTable$FrequentSkill.COMMON_CRAFT:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
   #23 = NameAndType        #24:#6        // COMMON_CRAFT:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
   #24 = Utf8               COMMON_CRAFT
   #25 = Fieldref           #1.#26        // ext/mods/gameserver/data/SkillTable$FrequentSkill.HARVEST:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
   #26 = NameAndType        #27:#6        // HARVEST:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
   #27 = Utf8               HARVEST
   #28 = Fieldref           #1.#29        // ext/mods/gameserver/data/SkillTable$FrequentSkill.FIREWORK:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
   #29 = NameAndType        #30:#6        // FIREWORK:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
   #30 = Utf8               FIREWORK
   #31 = Fieldref           #1.#32        // ext/mods/gameserver/data/SkillTable$FrequentSkill.LARGE_FIREWORK:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
   #32 = NameAndType        #33:#6        // LARGE_FIREWORK:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
   #33 = Utf8               LARGE_FIREWORK
   #34 = Fieldref           #1.#35        // ext/mods/gameserver/data/SkillTable$FrequentSkill.SPECIAL_TREE_RECOVERY_BONUS:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
   #35 = NameAndType        #36:#6        // SPECIAL_TREE_RECOVERY_BONUS:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
   #36 = Utf8               SPECIAL_TREE_RECOVERY_BONUS
   #37 = Fieldref           #1.#38        // ext/mods/gameserver/data/SkillTable$FrequentSkill.ANTHARAS_JUMP:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
   #38 = NameAndType        #39:#6        // ANTHARAS_JUMP:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
   #39 = Utf8               ANTHARAS_JUMP
   #40 = Fieldref           #1.#41        // ext/mods/gameserver/data/SkillTable$FrequentSkill.ANTHARAS_TAIL:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
   #41 = NameAndType        #42:#6        // ANTHARAS_TAIL:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
   #42 = Utf8               ANTHARAS_TAIL
   #43 = Fieldref           #1.#44        // ext/mods/gameserver/data/SkillTable$FrequentSkill.ANTHARAS_FEAR:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
   #44 = NameAndType        #45:#6        // ANTHARAS_FEAR:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
   #45 = Utf8               ANTHARAS_FEAR
   #46 = Fieldref           #1.#47        // ext/mods/gameserver/data/SkillTable$FrequentSkill.ANTHARAS_DEBUFF:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
   #47 = NameAndType        #48:#6        // ANTHARAS_DEBUFF:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
   #48 = Utf8               ANTHARAS_DEBUFF
   #49 = Fieldref           #1.#50        // ext/mods/gameserver/data/SkillTable$FrequentSkill.ANTHARAS_MOUTH:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
   #50 = NameAndType        #51:#6        // ANTHARAS_MOUTH:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
   #51 = Utf8               ANTHARAS_MOUTH
   #52 = Fieldref           #1.#53        // ext/mods/gameserver/data/SkillTable$FrequentSkill.ANTHARAS_BREATH:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
   #53 = NameAndType        #54:#6        // ANTHARAS_BREATH:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
   #54 = Utf8               ANTHARAS_BREATH
   #55 = Fieldref           #1.#56        // ext/mods/gameserver/data/SkillTable$FrequentSkill.ANTHARAS_NORMAL_ATTACK:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
   #56 = NameAndType        #57:#6        // ANTHARAS_NORMAL_ATTACK:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
   #57 = Utf8               ANTHARAS_NORMAL_ATTACK
   #58 = Fieldref           #1.#59        // ext/mods/gameserver/data/SkillTable$FrequentSkill.ANTHARAS_NORMAL_ATTACK_EX:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
   #59 = NameAndType        #60:#6        // ANTHARAS_NORMAL_ATTACK_EX:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
   #60 = Utf8               ANTHARAS_NORMAL_ATTACK_EX
   #61 = Fieldref           #1.#62        // ext/mods/gameserver/data/SkillTable$FrequentSkill.ANTHARAS_SHORT_FEAR:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
   #62 = NameAndType        #63:#6        // ANTHARAS_SHORT_FEAR:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
   #63 = Utf8               ANTHARAS_SHORT_FEAR
   #64 = Fieldref           #1.#65        // ext/mods/gameserver/data/SkillTable$FrequentSkill.ANTHARAS_METEOR:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
   #65 = NameAndType        #66:#6        // ANTHARAS_METEOR:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
   #66 = Utf8               ANTHARAS_METEOR
   #67 = Fieldref           #1.#68        // ext/mods/gameserver/data/SkillTable$FrequentSkill.QUEEN_ANT_BRANDISH:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
   #68 = NameAndType        #69:#6        // QUEEN_ANT_BRANDISH:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
   #69 = Utf8               QUEEN_ANT_BRANDISH
   #70 = Fieldref           #1.#71        // ext/mods/gameserver/data/SkillTable$FrequentSkill.QUEEN_ANT_STRIKE:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
   #71 = NameAndType        #72:#6        // QUEEN_ANT_STRIKE:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
   #72 = Utf8               QUEEN_ANT_STRIKE
   #73 = Fieldref           #1.#74        // ext/mods/gameserver/data/SkillTable$FrequentSkill.QUEEN_ANT_SPRINKLE:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
   #74 = NameAndType        #75:#6        // QUEEN_ANT_SPRINKLE:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
   #75 = Utf8               QUEEN_ANT_SPRINKLE
   #76 = Fieldref           #1.#77        // ext/mods/gameserver/data/SkillTable$FrequentSkill.NURSE_HEAL_1:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
   #77 = NameAndType        #78:#6        // NURSE_HEAL_1:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
   #78 = Utf8               NURSE_HEAL_1
   #79 = Fieldref           #1.#80        // ext/mods/gameserver/data/SkillTable$FrequentSkill.NURSE_HEAL_2:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
   #80 = NameAndType        #81:#6        // NURSE_HEAL_2:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
   #81 = Utf8               NURSE_HEAL_2
   #82 = Fieldref           #1.#83        // ext/mods/gameserver/data/SkillTable$FrequentSkill.ZAKEN_TELE:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
   #83 = NameAndType        #84:#6        // ZAKEN_TELE:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
   #84 = Utf8               ZAKEN_TELE
   #85 = Fieldref           #1.#86        // ext/mods/gameserver/data/SkillTable$FrequentSkill.ZAKEN_MASS_TELE:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
   #86 = NameAndType        #87:#6        // ZAKEN_MASS_TELE:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
   #87 = Utf8               ZAKEN_MASS_TELE
   #88 = Fieldref           #1.#89        // ext/mods/gameserver/data/SkillTable$FrequentSkill.ZAKEN_DRAIN:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
   #89 = NameAndType        #90:#6        // ZAKEN_DRAIN:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
   #90 = Utf8               ZAKEN_DRAIN
   #91 = Fieldref           #1.#92        // ext/mods/gameserver/data/SkillTable$FrequentSkill.ZAKEN_HOLD:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
   #92 = NameAndType        #93:#6        // ZAKEN_HOLD:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
   #93 = Utf8               ZAKEN_HOLD
   #94 = Fieldref           #1.#95        // ext/mods/gameserver/data/SkillTable$FrequentSkill.ZAKEN_DUAL_ATTACK:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
   #95 = NameAndType        #96:#6        // ZAKEN_DUAL_ATTACK:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
   #96 = Utf8               ZAKEN_DUAL_ATTACK
   #97 = Fieldref           #1.#98        // ext/mods/gameserver/data/SkillTable$FrequentSkill.ZAKEN_MASS_DUAL_ATTACK:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
   #98 = NameAndType        #99:#6        // ZAKEN_MASS_DUAL_ATTACK:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
   #99 = Utf8               ZAKEN_MASS_DUAL_ATTACK
  #100 = Fieldref           #1.#101       // ext/mods/gameserver/data/SkillTable$FrequentSkill.ZAKEN_SELF_TELE:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
  #101 = NameAndType        #102:#6       // ZAKEN_SELF_TELE:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
  #102 = Utf8               ZAKEN_SELF_TELE
  #103 = Fieldref           #1.#104       // ext/mods/gameserver/data/SkillTable$FrequentSkill.ZAKEN_NIGHT_TO_DAY:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
  #104 = NameAndType        #105:#6       // ZAKEN_NIGHT_TO_DAY:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
  #105 = Utf8               ZAKEN_NIGHT_TO_DAY
  #106 = Fieldref           #1.#107       // ext/mods/gameserver/data/SkillTable$FrequentSkill.ZAKEN_DAY_TO_NIGHT:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
  #107 = NameAndType        #108:#6       // ZAKEN_DAY_TO_NIGHT:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
  #108 = Utf8               ZAKEN_DAY_TO_NIGHT
  #109 = Fieldref           #1.#110       // ext/mods/gameserver/data/SkillTable$FrequentSkill.ZAKEN_REGEN_NIGHT:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
  #110 = NameAndType        #111:#6       // ZAKEN_REGEN_NIGHT:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
  #111 = Utf8               ZAKEN_REGEN_NIGHT
  #112 = Fieldref           #1.#113       // ext/mods/gameserver/data/SkillTable$FrequentSkill.ZAKEN_REGEN_DAY:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
  #113 = NameAndType        #114:#6       // ZAKEN_REGEN_DAY:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
  #114 = Utf8               ZAKEN_REGEN_DAY
  #115 = Fieldref           #1.#116       // ext/mods/gameserver/data/SkillTable$FrequentSkill.RAID_CURSE:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
  #116 = NameAndType        #117:#6       // RAID_CURSE:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
  #117 = Utf8               RAID_CURSE
  #118 = Fieldref           #1.#119       // ext/mods/gameserver/data/SkillTable$FrequentSkill.RAID_CURSE2:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
  #119 = NameAndType        #120:#6       // RAID_CURSE2:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
  #120 = Utf8               RAID_CURSE2
  #121 = Fieldref           #1.#122       // ext/mods/gameserver/data/SkillTable$FrequentSkill.RAID_ANTI_STRIDER_SLOW:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
  #122 = NameAndType        #123:#6       // RAID_ANTI_STRIDER_SLOW:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
  #123 = Utf8               RAID_ANTI_STRIDER_SLOW
  #124 = Fieldref           #1.#125       // ext/mods/gameserver/data/SkillTable$FrequentSkill.WYVERN_BREATH:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
  #125 = NameAndType        #126:#6       // WYVERN_BREATH:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
  #126 = Utf8               WYVERN_BREATH
  #127 = Fieldref           #1.#128       // ext/mods/gameserver/data/SkillTable$FrequentSkill.ARENA_CP_RECOVERY:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
  #128 = NameAndType        #129:#6       // ARENA_CP_RECOVERY:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
  #129 = Utf8               ARENA_CP_RECOVERY
  #130 = Fieldref           #1.#131       // ext/mods/gameserver/data/SkillTable$FrequentSkill.FAKE_PETRIFICATION:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
  #131 = NameAndType        #132:#6       // FAKE_PETRIFICATION:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
  #132 = Utf8               FAKE_PETRIFICATION
  #133 = Fieldref           #1.#134       // ext/mods/gameserver/data/SkillTable$FrequentSkill.THE_VICTOR_OF_WAR:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
  #134 = NameAndType        #135:#6       // THE_VICTOR_OF_WAR:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
  #135 = Utf8               THE_VICTOR_OF_WAR
  #136 = Fieldref           #1.#137       // ext/mods/gameserver/data/SkillTable$FrequentSkill.THE_VANQUISHED_OF_WAR:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
  #137 = NameAndType        #138:#6       // THE_VANQUISHED_OF_WAR:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
  #138 = Utf8               THE_VANQUISHED_OF_WAR
  #139 = Fieldref           #1.#140       // ext/mods/gameserver/data/SkillTable$FrequentSkill.$VALUES:[Lext/mods/gameserver/data/SkillTable$FrequentSkill;
  #140 = NameAndType        #141:#142     // $VALUES:[Lext/mods/gameserver/data/SkillTable$FrequentSkill;
  #141 = Utf8               $VALUES
  #142 = Utf8               [Lext/mods/gameserver/data/SkillTable$FrequentSkill;
  #143 = Methodref          #144.#145     // "[Lext/mods/gameserver/data/SkillTable$FrequentSkill;".clone:()Ljava/lang/Object;
  #144 = Class              #142          // "[Lext/mods/gameserver/data/SkillTable$FrequentSkill;"
  #145 = NameAndType        #146:#147     // clone:()Ljava/lang/Object;
  #146 = Utf8               clone
  #147 = Utf8               ()Ljava/lang/Object;
  #148 = Methodref          #149.#150     // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #149 = Class              #151          // java/lang/Enum
  #150 = NameAndType        #152:#153     // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #151 = Utf8               java/lang/Enum
  #152 = Utf8               valueOf
  #153 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #154 = Methodref          #149.#155     // java/lang/Enum."<init>":(Ljava/lang/String;I)V
  #155 = NameAndType        #156:#157     // "<init>":(Ljava/lang/String;I)V
  #156 = Utf8               <init>
  #157 = Utf8               (Ljava/lang/String;I)V
  #158 = Fieldref           #1.#159       // ext/mods/gameserver/data/SkillTable$FrequentSkill._skill:Lext/mods/gameserver/skills/L2Skill;
  #159 = NameAndType        #160:#161     // _skill:Lext/mods/gameserver/skills/L2Skill;
  #160 = Utf8               _skill
  #161 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #162 = Fieldref           #1.#163       // ext/mods/gameserver/data/SkillTable$FrequentSkill._id:I
  #163 = NameAndType        #164:#165     // _id:I
  #164 = Utf8               _id
  #165 = Utf8               I
  #166 = Fieldref           #1.#167       // ext/mods/gameserver/data/SkillTable$FrequentSkill._level:I
  #167 = NameAndType        #168:#165     // _level:I
  #168 = Utf8               _level
  #169 = String             #5            // LUCKY
  #170 = Methodref          #1.#171       // ext/mods/gameserver/data/SkillTable$FrequentSkill."<init>":(Ljava/lang/String;III)V
  #171 = NameAndType        #156:#172     // "<init>":(Ljava/lang/String;III)V
  #172 = Utf8               (Ljava/lang/String;III)V
  #173 = String             #9            // BLESSING_OF_PROTECTION
  #174 = String             #12           // SEAL_OF_RULER
  #175 = String             #15           // BUILD_HEADQUARTERS
  #176 = String             #18           // STRIDER_SIEGE_ASSAULT
  #177 = String             #21           // DWARVEN_CRAFT
  #178 = String             #24           // COMMON_CRAFT
  #179 = String             #27           // HARVEST
  #180 = String             #30           // FIREWORK
  #181 = String             #33           // LARGE_FIREWORK
  #182 = String             #36           // SPECIAL_TREE_RECOVERY_BONUS
  #183 = String             #39           // ANTHARAS_JUMP
  #184 = String             #42           // ANTHARAS_TAIL
  #185 = String             #45           // ANTHARAS_FEAR
  #186 = String             #48           // ANTHARAS_DEBUFF
  #187 = String             #51           // ANTHARAS_MOUTH
  #188 = String             #54           // ANTHARAS_BREATH
  #189 = String             #57           // ANTHARAS_NORMAL_ATTACK
  #190 = String             #60           // ANTHARAS_NORMAL_ATTACK_EX
  #191 = String             #63           // ANTHARAS_SHORT_FEAR
  #192 = String             #66           // ANTHARAS_METEOR
  #193 = String             #69           // QUEEN_ANT_BRANDISH
  #194 = String             #72           // QUEEN_ANT_STRIKE
  #195 = String             #75           // QUEEN_ANT_SPRINKLE
  #196 = String             #78           // NURSE_HEAL_1
  #197 = String             #81           // NURSE_HEAL_2
  #198 = String             #84           // ZAKEN_TELE
  #199 = String             #87           // ZAKEN_MASS_TELE
  #200 = String             #90           // ZAKEN_DRAIN
  #201 = String             #93           // ZAKEN_HOLD
  #202 = String             #96           // ZAKEN_DUAL_ATTACK
  #203 = String             #99           // ZAKEN_MASS_DUAL_ATTACK
  #204 = String             #102          // ZAKEN_SELF_TELE
  #205 = String             #105          // ZAKEN_NIGHT_TO_DAY
  #206 = String             #108          // ZAKEN_DAY_TO_NIGHT
  #207 = String             #111          // ZAKEN_REGEN_NIGHT
  #208 = String             #114          // ZAKEN_REGEN_DAY
  #209 = String             #117          // RAID_CURSE
  #210 = String             #120          // RAID_CURSE2
  #211 = String             #123          // RAID_ANTI_STRIDER_SLOW
  #212 = String             #126          // WYVERN_BREATH
  #213 = String             #129          // ARENA_CP_RECOVERY
  #214 = String             #132          // FAKE_PETRIFICATION
  #215 = String             #135          // THE_VICTOR_OF_WAR
  #216 = String             #138          // THE_VANQUISHED_OF_WAR
  #217 = Methodref          #1.#218       // ext/mods/gameserver/data/SkillTable$FrequentSkill.$values:()[Lext/mods/gameserver/data/SkillTable$FrequentSkill;
  #218 = NameAndType        #219:#220     // $values:()[Lext/mods/gameserver/data/SkillTable$FrequentSkill;
  #219 = Utf8               $values
  #220 = Utf8               ()[Lext/mods/gameserver/data/SkillTable$FrequentSkill;
  #221 = Utf8               values
  #222 = Utf8               Code
  #223 = Utf8               LineNumberTable
  #224 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/data/SkillTable$FrequentSkill;
  #225 = Utf8               LocalVariableTable
  #226 = Utf8               name
  #227 = Utf8               Ljava/lang/String;
  #228 = Utf8               MethodParameters
  #229 = Utf8               this
  #230 = Utf8               id
  #231 = Utf8               level
  #232 = Utf8               Signature
  #233 = Utf8               (II)V
  #234 = Utf8               getSkill
  #235 = Utf8               ()Lext/mods/gameserver/skills/L2Skill;
  #236 = Utf8               <clinit>
  #237 = Utf8               ()V
  #238 = Utf8               Ljava/lang/Enum<Lext/mods/gameserver/data/SkillTable$FrequentSkill;>;
  #239 = Utf8               SourceFile
  #240 = Utf8               SkillTable.java
  #241 = Utf8               NestHost
  #242 = Class              #243          // ext/mods/gameserver/data/SkillTable
  #243 = Utf8               ext/mods/gameserver/data/SkillTable
  #244 = Utf8               InnerClasses
  #245 = Utf8               FrequentSkill
{
  public static final ext.mods.gameserver.data.SkillTable$FrequentSkill LUCKY;
    descriptor: Lext/mods/gameserver/data/SkillTable$FrequentSkill;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.data.SkillTable$FrequentSkill BLESSING_OF_PROTECTION;
    descriptor: Lext/mods/gameserver/data/SkillTable$FrequentSkill;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.data.SkillTable$FrequentSkill SEAL_OF_RULER;
    descriptor: Lext/mods/gameserver/data/SkillTable$FrequentSkill;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.data.SkillTable$FrequentSkill BUILD_HEADQUARTERS;
    descriptor: Lext/mods/gameserver/data/SkillTable$FrequentSkill;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.data.SkillTable$FrequentSkill STRIDER_SIEGE_ASSAULT;
    descriptor: Lext/mods/gameserver/data/SkillTable$FrequentSkill;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.data.SkillTable$FrequentSkill DWARVEN_CRAFT;
    descriptor: Lext/mods/gameserver/data/SkillTable$FrequentSkill;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.data.SkillTable$FrequentSkill COMMON_CRAFT;
    descriptor: Lext/mods/gameserver/data/SkillTable$FrequentSkill;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.data.SkillTable$FrequentSkill HARVEST;
    descriptor: Lext/mods/gameserver/data/SkillTable$FrequentSkill;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.data.SkillTable$FrequentSkill FIREWORK;
    descriptor: Lext/mods/gameserver/data/SkillTable$FrequentSkill;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.data.SkillTable$FrequentSkill LARGE_FIREWORK;
    descriptor: Lext/mods/gameserver/data/SkillTable$FrequentSkill;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.data.SkillTable$FrequentSkill SPECIAL_TREE_RECOVERY_BONUS;
    descriptor: Lext/mods/gameserver/data/SkillTable$FrequentSkill;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.data.SkillTable$FrequentSkill ANTHARAS_JUMP;
    descriptor: Lext/mods/gameserver/data/SkillTable$FrequentSkill;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.data.SkillTable$FrequentSkill ANTHARAS_TAIL;
    descriptor: Lext/mods/gameserver/data/SkillTable$FrequentSkill;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.data.SkillTable$FrequentSkill ANTHARAS_FEAR;
    descriptor: Lext/mods/gameserver/data/SkillTable$FrequentSkill;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.data.SkillTable$FrequentSkill ANTHARAS_DEBUFF;
    descriptor: Lext/mods/gameserver/data/SkillTable$FrequentSkill;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.data.SkillTable$FrequentSkill ANTHARAS_MOUTH;
    descriptor: Lext/mods/gameserver/data/SkillTable$FrequentSkill;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.data.SkillTable$FrequentSkill ANTHARAS_BREATH;
    descriptor: Lext/mods/gameserver/data/SkillTable$FrequentSkill;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.data.SkillTable$FrequentSkill ANTHARAS_NORMAL_ATTACK;
    descriptor: Lext/mods/gameserver/data/SkillTable$FrequentSkill;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.data.SkillTable$FrequentSkill ANTHARAS_NORMAL_ATTACK_EX;
    descriptor: Lext/mods/gameserver/data/SkillTable$FrequentSkill;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.data.SkillTable$FrequentSkill ANTHARAS_SHORT_FEAR;
    descriptor: Lext/mods/gameserver/data/SkillTable$FrequentSkill;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.data.SkillTable$FrequentSkill ANTHARAS_METEOR;
    descriptor: Lext/mods/gameserver/data/SkillTable$FrequentSkill;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.data.SkillTable$FrequentSkill QUEEN_ANT_BRANDISH;
    descriptor: Lext/mods/gameserver/data/SkillTable$FrequentSkill;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.data.SkillTable$FrequentSkill QUEEN_ANT_STRIKE;
    descriptor: Lext/mods/gameserver/data/SkillTable$FrequentSkill;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.data.SkillTable$FrequentSkill QUEEN_ANT_SPRINKLE;
    descriptor: Lext/mods/gameserver/data/SkillTable$FrequentSkill;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.data.SkillTable$FrequentSkill NURSE_HEAL_1;
    descriptor: Lext/mods/gameserver/data/SkillTable$FrequentSkill;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.data.SkillTable$FrequentSkill NURSE_HEAL_2;
    descriptor: Lext/mods/gameserver/data/SkillTable$FrequentSkill;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.data.SkillTable$FrequentSkill ZAKEN_TELE;
    descriptor: Lext/mods/gameserver/data/SkillTable$FrequentSkill;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.data.SkillTable$FrequentSkill ZAKEN_MASS_TELE;
    descriptor: Lext/mods/gameserver/data/SkillTable$FrequentSkill;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.data.SkillTable$FrequentSkill ZAKEN_DRAIN;
    descriptor: Lext/mods/gameserver/data/SkillTable$FrequentSkill;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.data.SkillTable$FrequentSkill ZAKEN_HOLD;
    descriptor: Lext/mods/gameserver/data/SkillTable$FrequentSkill;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.data.SkillTable$FrequentSkill ZAKEN_DUAL_ATTACK;
    descriptor: Lext/mods/gameserver/data/SkillTable$FrequentSkill;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.data.SkillTable$FrequentSkill ZAKEN_MASS_DUAL_ATTACK;
    descriptor: Lext/mods/gameserver/data/SkillTable$FrequentSkill;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.data.SkillTable$FrequentSkill ZAKEN_SELF_TELE;
    descriptor: Lext/mods/gameserver/data/SkillTable$FrequentSkill;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.data.SkillTable$FrequentSkill ZAKEN_NIGHT_TO_DAY;
    descriptor: Lext/mods/gameserver/data/SkillTable$FrequentSkill;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.data.SkillTable$FrequentSkill ZAKEN_DAY_TO_NIGHT;
    descriptor: Lext/mods/gameserver/data/SkillTable$FrequentSkill;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.data.SkillTable$FrequentSkill ZAKEN_REGEN_NIGHT;
    descriptor: Lext/mods/gameserver/data/SkillTable$FrequentSkill;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.data.SkillTable$FrequentSkill ZAKEN_REGEN_DAY;
    descriptor: Lext/mods/gameserver/data/SkillTable$FrequentSkill;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.data.SkillTable$FrequentSkill RAID_CURSE;
    descriptor: Lext/mods/gameserver/data/SkillTable$FrequentSkill;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.data.SkillTable$FrequentSkill RAID_CURSE2;
    descriptor: Lext/mods/gameserver/data/SkillTable$FrequentSkill;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.data.SkillTable$FrequentSkill RAID_ANTI_STRIDER_SLOW;
    descriptor: Lext/mods/gameserver/data/SkillTable$FrequentSkill;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.data.SkillTable$FrequentSkill WYVERN_BREATH;
    descriptor: Lext/mods/gameserver/data/SkillTable$FrequentSkill;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.data.SkillTable$FrequentSkill ARENA_CP_RECOVERY;
    descriptor: Lext/mods/gameserver/data/SkillTable$FrequentSkill;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.data.SkillTable$FrequentSkill FAKE_PETRIFICATION;
    descriptor: Lext/mods/gameserver/data/SkillTable$FrequentSkill;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.data.SkillTable$FrequentSkill THE_VICTOR_OF_WAR;
    descriptor: Lext/mods/gameserver/data/SkillTable$FrequentSkill;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.data.SkillTable$FrequentSkill THE_VANQUISHED_OF_WAR;
    descriptor: Lext/mods/gameserver/data/SkillTable$FrequentSkill;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  protected final int _id;
    descriptor: I
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL

  protected final int _level;
    descriptor: I
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL

  protected ext.mods.gameserver.skills.L2Skill _skill;
    descriptor: Lext/mods/gameserver/skills/L2Skill;
    flags: (0x0004) ACC_PROTECTED

  public static ext.mods.gameserver.data.SkillTable$FrequentSkill[] values();
    descriptor: ()[Lext/mods/gameserver/data/SkillTable$FrequentSkill;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #139                // Field $VALUES:[Lext/mods/gameserver/data/SkillTable$FrequentSkill;
         3: invokevirtual #143                // Method "[Lext/mods/gameserver/data/SkillTable$FrequentSkill;".clone:()Ljava/lang/Object;
         6: checkcast     #144                // class "[Lext/mods/gameserver/data/SkillTable$FrequentSkill;"
         9: areturn
      LineNumberTable:
        line 238: 0

  public static ext.mods.gameserver.data.SkillTable$FrequentSkill valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/data/SkillTable$FrequentSkill;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/gameserver/data/SkillTable$FrequentSkill
         2: aload_0
         3: invokestatic  #148                // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/gameserver/data/SkillTable$FrequentSkill
         9: areturn
      LineNumberTable:
        line 238: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  name   Ljava/lang/String;
    MethodParameters:
      Name                           Flags
      <no name>                      mandated

  public ext.mods.gameserver.skills.L2Skill getSkill();
    descriptor: ()Lext/mods/gameserver/skills/L2Skill;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #158                // Field _skill:Lext/mods/gameserver/skills/L2Skill;
         4: areturn
      LineNumberTable:
        line 308: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/data/SkillTable$FrequentSkill;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=6, locals=0, args_size=0
         0: new           #1                  // class ext/mods/gameserver/data/SkillTable$FrequentSkill
         3: dup
         4: ldc           #169                // String LUCKY
         6: iconst_0
         7: sipush        194
        10: iconst_1
        11: invokespecial #170                // Method "<init>":(Ljava/lang/String;III)V
        14: putstatic     #3                  // Field LUCKY:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
        17: new           #1                  // class ext/mods/gameserver/data/SkillTable$FrequentSkill
        20: dup
        21: ldc           #173                // String BLESSING_OF_PROTECTION
        23: iconst_1
        24: sipush        5182
        27: iconst_1
        28: invokespecial #170                // Method "<init>":(Ljava/lang/String;III)V
        31: putstatic     #7                  // Field BLESSING_OF_PROTECTION:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
        34: new           #1                  // class ext/mods/gameserver/data/SkillTable$FrequentSkill
        37: dup
        38: ldc           #174                // String SEAL_OF_RULER
        40: iconst_2
        41: sipush        246
        44: iconst_1
        45: invokespecial #170                // Method "<init>":(Ljava/lang/String;III)V
        48: putstatic     #10                 // Field SEAL_OF_RULER:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
        51: new           #1                  // class ext/mods/gameserver/data/SkillTable$FrequentSkill
        54: dup
        55: ldc           #175                // String BUILD_HEADQUARTERS
        57: iconst_3
        58: sipush        247
        61: iconst_1
        62: invokespecial #170                // Method "<init>":(Ljava/lang/String;III)V
        65: putstatic     #13                 // Field BUILD_HEADQUARTERS:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
        68: new           #1                  // class ext/mods/gameserver/data/SkillTable$FrequentSkill
        71: dup
        72: ldc           #176                // String STRIDER_SIEGE_ASSAULT
        74: iconst_4
        75: sipush        325
        78: iconst_1
        79: invokespecial #170                // Method "<init>":(Ljava/lang/String;III)V
        82: putstatic     #16                 // Field STRIDER_SIEGE_ASSAULT:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
        85: new           #1                  // class ext/mods/gameserver/data/SkillTable$FrequentSkill
        88: dup
        89: ldc           #177                // String DWARVEN_CRAFT
        91: iconst_5
        92: sipush        1321
        95: iconst_1
        96: invokespecial #170                // Method "<init>":(Ljava/lang/String;III)V
        99: putstatic     #19                 // Field DWARVEN_CRAFT:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
       102: new           #1                  // class ext/mods/gameserver/data/SkillTable$FrequentSkill
       105: dup
       106: ldc           #178                // String COMMON_CRAFT
       108: bipush        6
       110: sipush        1322
       113: iconst_1
       114: invokespecial #170                // Method "<init>":(Ljava/lang/String;III)V
       117: putstatic     #22                 // Field COMMON_CRAFT:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
       120: new           #1                  // class ext/mods/gameserver/data/SkillTable$FrequentSkill
       123: dup
       124: ldc           #179                // String HARVEST
       126: bipush        7
       128: sipush        2098
       131: iconst_1
       132: invokespecial #170                // Method "<init>":(Ljava/lang/String;III)V
       135: putstatic     #25                 // Field HARVEST:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
       138: new           #1                  // class ext/mods/gameserver/data/SkillTable$FrequentSkill
       141: dup
       142: ldc           #180                // String FIREWORK
       144: bipush        8
       146: sipush        5965
       149: iconst_1
       150: invokespecial #170                // Method "<init>":(Ljava/lang/String;III)V
       153: putstatic     #28                 // Field FIREWORK:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
       156: new           #1                  // class ext/mods/gameserver/data/SkillTable$FrequentSkill
       159: dup
       160: ldc           #181                // String LARGE_FIREWORK
       162: bipush        9
       164: sipush        2025
       167: iconst_1
       168: invokespecial #170                // Method "<init>":(Ljava/lang/String;III)V
       171: putstatic     #31                 // Field LARGE_FIREWORK:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
       174: new           #1                  // class ext/mods/gameserver/data/SkillTable$FrequentSkill
       177: dup
       178: ldc           #182                // String SPECIAL_TREE_RECOVERY_BONUS
       180: bipush        10
       182: sipush        2139
       185: iconst_1
       186: invokespecial #170                // Method "<init>":(Ljava/lang/String;III)V
       189: putstatic     #34                 // Field SPECIAL_TREE_RECOVERY_BONUS:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
       192: new           #1                  // class ext/mods/gameserver/data/SkillTable$FrequentSkill
       195: dup
       196: ldc           #183                // String ANTHARAS_JUMP
       198: bipush        11
       200: sipush        4106
       203: iconst_1
       204: invokespecial #170                // Method "<init>":(Ljava/lang/String;III)V
       207: putstatic     #37                 // Field ANTHARAS_JUMP:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
       210: new           #1                  // class ext/mods/gameserver/data/SkillTable$FrequentSkill
       213: dup
       214: ldc           #184                // String ANTHARAS_TAIL
       216: bipush        12
       218: sipush        4107
       221: iconst_1
       222: invokespecial #170                // Method "<init>":(Ljava/lang/String;III)V
       225: putstatic     #40                 // Field ANTHARAS_TAIL:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
       228: new           #1                  // class ext/mods/gameserver/data/SkillTable$FrequentSkill
       231: dup
       232: ldc           #185                // String ANTHARAS_FEAR
       234: bipush        13
       236: sipush        4108
       239: iconst_1
       240: invokespecial #170                // Method "<init>":(Ljava/lang/String;III)V
       243: putstatic     #43                 // Field ANTHARAS_FEAR:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
       246: new           #1                  // class ext/mods/gameserver/data/SkillTable$FrequentSkill
       249: dup
       250: ldc           #186                // String ANTHARAS_DEBUFF
       252: bipush        14
       254: sipush        4109
       257: iconst_1
       258: invokespecial #170                // Method "<init>":(Ljava/lang/String;III)V
       261: putstatic     #46                 // Field ANTHARAS_DEBUFF:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
       264: new           #1                  // class ext/mods/gameserver/data/SkillTable$FrequentSkill
       267: dup
       268: ldc           #187                // String ANTHARAS_MOUTH
       270: bipush        15
       272: sipush        4110
       275: iconst_1
       276: invokespecial #170                // Method "<init>":(Ljava/lang/String;III)V
       279: putstatic     #49                 // Field ANTHARAS_MOUTH:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
       282: new           #1                  // class ext/mods/gameserver/data/SkillTable$FrequentSkill
       285: dup
       286: ldc           #188                // String ANTHARAS_BREATH
       288: bipush        16
       290: sipush        4111
       293: iconst_1
       294: invokespecial #170                // Method "<init>":(Ljava/lang/String;III)V
       297: putstatic     #52                 // Field ANTHARAS_BREATH:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
       300: new           #1                  // class ext/mods/gameserver/data/SkillTable$FrequentSkill
       303: dup
       304: ldc           #189                // String ANTHARAS_NORMAL_ATTACK
       306: bipush        17
       308: sipush        4112
       311: iconst_1
       312: invokespecial #170                // Method "<init>":(Ljava/lang/String;III)V
       315: putstatic     #55                 // Field ANTHARAS_NORMAL_ATTACK:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
       318: new           #1                  // class ext/mods/gameserver/data/SkillTable$FrequentSkill
       321: dup
       322: ldc           #190                // String ANTHARAS_NORMAL_ATTACK_EX
       324: bipush        18
       326: sipush        4113
       329: iconst_1
       330: invokespecial #170                // Method "<init>":(Ljava/lang/String;III)V
       333: putstatic     #58                 // Field ANTHARAS_NORMAL_ATTACK_EX:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
       336: new           #1                  // class ext/mods/gameserver/data/SkillTable$FrequentSkill
       339: dup
       340: ldc           #191                // String ANTHARAS_SHORT_FEAR
       342: bipush        19
       344: sipush        5092
       347: iconst_1
       348: invokespecial #170                // Method "<init>":(Ljava/lang/String;III)V
       351: putstatic     #61                 // Field ANTHARAS_SHORT_FEAR:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
       354: new           #1                  // class ext/mods/gameserver/data/SkillTable$FrequentSkill
       357: dup
       358: ldc           #192                // String ANTHARAS_METEOR
       360: bipush        20
       362: sipush        5093
       365: iconst_1
       366: invokespecial #170                // Method "<init>":(Ljava/lang/String;III)V
       369: putstatic     #64                 // Field ANTHARAS_METEOR:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
       372: new           #1                  // class ext/mods/gameserver/data/SkillTable$FrequentSkill
       375: dup
       376: ldc           #193                // String QUEEN_ANT_BRANDISH
       378: bipush        21
       380: sipush        4017
       383: iconst_1
       384: invokespecial #170                // Method "<init>":(Ljava/lang/String;III)V
       387: putstatic     #67                 // Field QUEEN_ANT_BRANDISH:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
       390: new           #1                  // class ext/mods/gameserver/data/SkillTable$FrequentSkill
       393: dup
       394: ldc           #194                // String QUEEN_ANT_STRIKE
       396: bipush        22
       398: sipush        4018
       401: iconst_1
       402: invokespecial #170                // Method "<init>":(Ljava/lang/String;III)V
       405: putstatic     #70                 // Field QUEEN_ANT_STRIKE:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
       408: new           #1                  // class ext/mods/gameserver/data/SkillTable$FrequentSkill
       411: dup
       412: ldc           #195                // String QUEEN_ANT_SPRINKLE
       414: bipush        23
       416: sipush        4019
       419: iconst_1
       420: invokespecial #170                // Method "<init>":(Ljava/lang/String;III)V
       423: putstatic     #73                 // Field QUEEN_ANT_SPRINKLE:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
       426: new           #1                  // class ext/mods/gameserver/data/SkillTable$FrequentSkill
       429: dup
       430: ldc           #196                // String NURSE_HEAL_1
       432: bipush        24
       434: sipush        4020
       437: iconst_1
       438: invokespecial #170                // Method "<init>":(Ljava/lang/String;III)V
       441: putstatic     #76                 // Field NURSE_HEAL_1:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
       444: new           #1                  // class ext/mods/gameserver/data/SkillTable$FrequentSkill
       447: dup
       448: ldc           #197                // String NURSE_HEAL_2
       450: bipush        25
       452: sipush        4024
       455: iconst_1
       456: invokespecial #170                // Method "<init>":(Ljava/lang/String;III)V
       459: putstatic     #79                 // Field NURSE_HEAL_2:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
       462: new           #1                  // class ext/mods/gameserver/data/SkillTable$FrequentSkill
       465: dup
       466: ldc           #198                // String ZAKEN_TELE
       468: bipush        26
       470: sipush        4216
       473: iconst_1
       474: invokespecial #170                // Method "<init>":(Ljava/lang/String;III)V
       477: putstatic     #82                 // Field ZAKEN_TELE:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
       480: new           #1                  // class ext/mods/gameserver/data/SkillTable$FrequentSkill
       483: dup
       484: ldc           #199                // String ZAKEN_MASS_TELE
       486: bipush        27
       488: sipush        4217
       491: iconst_1
       492: invokespecial #170                // Method "<init>":(Ljava/lang/String;III)V
       495: putstatic     #85                 // Field ZAKEN_MASS_TELE:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
       498: new           #1                  // class ext/mods/gameserver/data/SkillTable$FrequentSkill
       501: dup
       502: ldc           #200                // String ZAKEN_DRAIN
       504: bipush        28
       506: sipush        4218
       509: iconst_1
       510: invokespecial #170                // Method "<init>":(Ljava/lang/String;III)V
       513: putstatic     #88                 // Field ZAKEN_DRAIN:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
       516: new           #1                  // class ext/mods/gameserver/data/SkillTable$FrequentSkill
       519: dup
       520: ldc           #201                // String ZAKEN_HOLD
       522: bipush        29
       524: sipush        4219
       527: iconst_1
       528: invokespecial #170                // Method "<init>":(Ljava/lang/String;III)V
       531: putstatic     #91                 // Field ZAKEN_HOLD:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
       534: new           #1                  // class ext/mods/gameserver/data/SkillTable$FrequentSkill
       537: dup
       538: ldc           #202                // String ZAKEN_DUAL_ATTACK
       540: bipush        30
       542: sipush        4220
       545: iconst_1
       546: invokespecial #170                // Method "<init>":(Ljava/lang/String;III)V
       549: putstatic     #94                 // Field ZAKEN_DUAL_ATTACK:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
       552: new           #1                  // class ext/mods/gameserver/data/SkillTable$FrequentSkill
       555: dup
       556: ldc           #203                // String ZAKEN_MASS_DUAL_ATTACK
       558: bipush        31
       560: sipush        4221
       563: iconst_1
       564: invokespecial #170                // Method "<init>":(Ljava/lang/String;III)V
       567: putstatic     #97                 // Field ZAKEN_MASS_DUAL_ATTACK:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
       570: new           #1                  // class ext/mods/gameserver/data/SkillTable$FrequentSkill
       573: dup
       574: ldc           #204                // String ZAKEN_SELF_TELE
       576: bipush        32
       578: sipush        4222
       581: iconst_1
       582: invokespecial #170                // Method "<init>":(Ljava/lang/String;III)V
       585: putstatic     #100                // Field ZAKEN_SELF_TELE:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
       588: new           #1                  // class ext/mods/gameserver/data/SkillTable$FrequentSkill
       591: dup
       592: ldc           #205                // String ZAKEN_NIGHT_TO_DAY
       594: bipush        33
       596: sipush        4223
       599: iconst_1
       600: invokespecial #170                // Method "<init>":(Ljava/lang/String;III)V
       603: putstatic     #103                // Field ZAKEN_NIGHT_TO_DAY:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
       606: new           #1                  // class ext/mods/gameserver/data/SkillTable$FrequentSkill
       609: dup
       610: ldc           #206                // String ZAKEN_DAY_TO_NIGHT
       612: bipush        34
       614: sipush        4224
       617: iconst_1
       618: invokespecial #170                // Method "<init>":(Ljava/lang/String;III)V
       621: putstatic     #106                // Field ZAKEN_DAY_TO_NIGHT:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
       624: new           #1                  // class ext/mods/gameserver/data/SkillTable$FrequentSkill
       627: dup
       628: ldc           #207                // String ZAKEN_REGEN_NIGHT
       630: bipush        35
       632: sipush        4227
       635: iconst_1
       636: invokespecial #170                // Method "<init>":(Ljava/lang/String;III)V
       639: putstatic     #109                // Field ZAKEN_REGEN_NIGHT:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
       642: new           #1                  // class ext/mods/gameserver/data/SkillTable$FrequentSkill
       645: dup
       646: ldc           #208                // String ZAKEN_REGEN_DAY
       648: bipush        36
       650: sipush        4242
       653: iconst_1
       654: invokespecial #170                // Method "<init>":(Ljava/lang/String;III)V
       657: putstatic     #112                // Field ZAKEN_REGEN_DAY:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
       660: new           #1                  // class ext/mods/gameserver/data/SkillTable$FrequentSkill
       663: dup
       664: ldc           #209                // String RAID_CURSE
       666: bipush        37
       668: sipush        4215
       671: iconst_1
       672: invokespecial #170                // Method "<init>":(Ljava/lang/String;III)V
       675: putstatic     #115                // Field RAID_CURSE:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
       678: new           #1                  // class ext/mods/gameserver/data/SkillTable$FrequentSkill
       681: dup
       682: ldc           #210                // String RAID_CURSE2
       684: bipush        38
       686: sipush        4515
       689: iconst_1
       690: invokespecial #170                // Method "<init>":(Ljava/lang/String;III)V
       693: putstatic     #118                // Field RAID_CURSE2:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
       696: new           #1                  // class ext/mods/gameserver/data/SkillTable$FrequentSkill
       699: dup
       700: ldc           #211                // String RAID_ANTI_STRIDER_SLOW
       702: bipush        39
       704: sipush        4258
       707: iconst_1
       708: invokespecial #170                // Method "<init>":(Ljava/lang/String;III)V
       711: putstatic     #121                // Field RAID_ANTI_STRIDER_SLOW:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
       714: new           #1                  // class ext/mods/gameserver/data/SkillTable$FrequentSkill
       717: dup
       718: ldc           #212                // String WYVERN_BREATH
       720: bipush        40
       722: sipush        4289
       725: iconst_1
       726: invokespecial #170                // Method "<init>":(Ljava/lang/String;III)V
       729: putstatic     #124                // Field WYVERN_BREATH:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
       732: new           #1                  // class ext/mods/gameserver/data/SkillTable$FrequentSkill
       735: dup
       736: ldc           #213                // String ARENA_CP_RECOVERY
       738: bipush        41
       740: sipush        4380
       743: iconst_1
       744: invokespecial #170                // Method "<init>":(Ljava/lang/String;III)V
       747: putstatic     #127                // Field ARENA_CP_RECOVERY:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
       750: new           #1                  // class ext/mods/gameserver/data/SkillTable$FrequentSkill
       753: dup
       754: ldc           #214                // String FAKE_PETRIFICATION
       756: bipush        42
       758: sipush        4616
       761: iconst_1
       762: invokespecial #170                // Method "<init>":(Ljava/lang/String;III)V
       765: putstatic     #130                // Field FAKE_PETRIFICATION:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
       768: new           #1                  // class ext/mods/gameserver/data/SkillTable$FrequentSkill
       771: dup
       772: ldc           #215                // String THE_VICTOR_OF_WAR
       774: bipush        43
       776: sipush        5074
       779: iconst_1
       780: invokespecial #170                // Method "<init>":(Ljava/lang/String;III)V
       783: putstatic     #133                // Field THE_VICTOR_OF_WAR:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
       786: new           #1                  // class ext/mods/gameserver/data/SkillTable$FrequentSkill
       789: dup
       790: ldc           #216                // String THE_VANQUISHED_OF_WAR
       792: bipush        44
       794: sipush        5075
       797: iconst_1
       798: invokespecial #170                // Method "<init>":(Ljava/lang/String;III)V
       801: putstatic     #136                // Field THE_VANQUISHED_OF_WAR:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
       804: invokestatic  #217                // Method $values:()[Lext/mods/gameserver/data/SkillTable$FrequentSkill;
       807: putstatic     #139                // Field $VALUES:[Lext/mods/gameserver/data/SkillTable$FrequentSkill;
       810: return
      LineNumberTable:
        line 240: 0
        line 241: 17
        line 243: 34
        line 244: 51
        line 245: 68
        line 247: 85
        line 248: 102
        line 250: 120
        line 252: 138
        line 253: 156
        line 254: 174
        line 256: 192
        line 257: 210
        line 258: 228
        line 259: 246
        line 260: 264
        line 261: 282
        line 262: 300
        line 263: 318
        line 264: 336
        line 265: 354
        line 267: 372
        line 268: 390
        line 269: 408
        line 270: 426
        line 271: 444
        line 273: 462
        line 274: 480
        line 275: 498
        line 276: 516
        line 277: 534
        line 278: 552
        line 279: 570
        line 280: 588
        line 281: 606
        line 282: 624
        line 283: 642
        line 285: 660
        line 286: 678
        line 287: 696
        line 289: 714
        line 290: 732
        line 291: 750
        line 293: 768
        line 294: 786
        line 238: 804
}
Signature: #238                         // Ljava/lang/Enum<Lext/mods/gameserver/data/SkillTable$FrequentSkill;>;
SourceFile: "SkillTable.java"
NestHost: class ext/mods/gameserver/data/SkillTable
InnerClasses:
  public static final #245= #1 of #242;   // FrequentSkill=class ext/mods/gameserver/data/SkillTable$FrequentSkill of class ext/mods/gameserver/data/SkillTable
