// Bytecode for: ext.mods.gameserver.enums.actors.NpcSkillType
// File: ext\mods\gameserver\enums\actors\NpcSkillType.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/enums/actors/NpcSkillType.class
  Last modified 9 de jul de 2026; size 9999 bytes
  MD5 checksum c6dfc97dbccd5f2813854330249349bd
  Compiled from "NpcSkillType.java"
public final class ext.mods.gameserver.enums.actors.NpcSkillType extends java.lang.Enum<ext.mods.gameserver.enums.actors.NpcSkillType>
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/gameserver/enums/actors/NpcSkillType
  super_class: #437                       // java/lang/Enum
  interfaces: 0, fields: 142, methods: 5, attributes: 2
Constant pool:
    #1 = Class              #2            // ext/mods/gameserver/enums/actors/NpcSkillType
    #2 = Utf8               ext/mods/gameserver/enums/actors/NpcSkillType
    #3 = Fieldref           #1.#4         // ext/mods/gameserver/enums/actors/NpcSkillType.PASSIVE:Lext/mods/gameserver/enums/actors/NpcSkillType;
    #4 = NameAndType        #5:#6         // PASSIVE:Lext/mods/gameserver/enums/actors/NpcSkillType;
    #5 = Utf8               PASSIVE
    #6 = Utf8               Lext/mods/gameserver/enums/actors/NpcSkillType;
    #7 = Fieldref           #1.#8         // ext/mods/gameserver/enums/actors/NpcSkillType.AFFLICT_SKILL1:Lext/mods/gameserver/enums/actors/NpcSkillType;
    #8 = NameAndType        #9:#6         // AFFLICT_SKILL1:Lext/mods/gameserver/enums/actors/NpcSkillType;
    #9 = Utf8               AFFLICT_SKILL1
   #10 = Fieldref           #1.#11        // ext/mods/gameserver/enums/actors/NpcSkillType.AFFLICT_SKILL2:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #11 = NameAndType        #12:#6        // AFFLICT_SKILL2:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #12 = Utf8               AFFLICT_SKILL2
   #13 = Fieldref           #1.#14        // ext/mods/gameserver/enums/actors/NpcSkillType.AFFLICT_SKILL3:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #14 = NameAndType        #15:#6        // AFFLICT_SKILL3:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #15 = Utf8               AFFLICT_SKILL3
   #16 = Fieldref           #1.#17        // ext/mods/gameserver/enums/actors/NpcSkillType.ARROW_DEFENCE_MODE:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #17 = NameAndType        #18:#6        // ARROW_DEFENCE_MODE:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #18 = Utf8               ARROW_DEFENCE_MODE
   #19 = Fieldref           #1.#20        // ext/mods/gameserver/enums/actors/NpcSkillType.ARROW_NORMAL_MODE:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #20 = NameAndType        #21:#6        // ARROW_NORMAL_MODE:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #21 = Utf8               ARROW_NORMAL_MODE
   #22 = Fieldref           #1.#23        // ext/mods/gameserver/enums/actors/NpcSkillType.BIG_BODY_SKILL:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #23 = NameAndType        #24:#6        // BIG_BODY_SKILL:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #24 = Utf8               BIG_BODY_SKILL
   #25 = Fieldref           #1.#26        // ext/mods/gameserver/enums/actors/NpcSkillType.BOMB:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #26 = NameAndType        #27:#6        // BOMB:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #27 = Utf8               BOMB
   #28 = Fieldref           #1.#29        // ext/mods/gameserver/enums/actors/NpcSkillType.BOMBER:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #29 = NameAndType        #30:#6        // BOMBER:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #30 = Utf8               BOMBER
   #31 = Fieldref           #1.#32        // ext/mods/gameserver/enums/actors/NpcSkillType.BUFF:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #32 = NameAndType        #33:#6        // BUFF:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #33 = Utf8               BUFF
   #34 = Fieldref           #1.#35        // ext/mods/gameserver/enums/actors/NpcSkillType.BUFF1:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #35 = NameAndType        #36:#6        // BUFF1:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #36 = Utf8               BUFF1
   #37 = Fieldref           #1.#38        // ext/mods/gameserver/enums/actors/NpcSkillType.BUFF2:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #38 = NameAndType        #39:#6        // BUFF2:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #39 = Utf8               BUFF2
   #40 = Fieldref           #1.#41        // ext/mods/gameserver/enums/actors/NpcSkillType.BUFF3:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #41 = NameAndType        #42:#6        // BUFF3:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #42 = Utf8               BUFF3
   #43 = Fieldref           #1.#44        // ext/mods/gameserver/enums/actors/NpcSkillType.BUFF4:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #44 = NameAndType        #45:#6        // BUFF4:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #45 = Utf8               BUFF4
   #46 = Fieldref           #1.#47        // ext/mods/gameserver/enums/actors/NpcSkillType.BUFF5:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #47 = NameAndType        #48:#6        // BUFF5:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #48 = Utf8               BUFF5
   #49 = Fieldref           #1.#50        // ext/mods/gameserver/enums/actors/NpcSkillType.BUFF6:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #50 = NameAndType        #51:#6        // BUFF6:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #51 = Utf8               BUFF6
   #52 = Fieldref           #1.#53        // ext/mods/gameserver/enums/actors/NpcSkillType.BUFF_ULTIMATE_SHIELD:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #53 = NameAndType        #54:#6        // BUFF_ULTIMATE_SHIELD:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #54 = Utf8               BUFF_ULTIMATE_SHIELD
   #55 = Fieldref           #1.#56        // ext/mods/gameserver/enums/actors/NpcSkillType.CANCEL:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #56 = NameAndType        #57:#6        // CANCEL:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #57 = Utf8               CANCEL
   #58 = Fieldref           #1.#59        // ext/mods/gameserver/enums/actors/NpcSkillType.CANCEL_MAGIC:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #59 = NameAndType        #60:#6        // CANCEL_MAGIC:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #60 = Utf8               CANCEL_MAGIC
   #61 = Fieldref           #1.#62        // ext/mods/gameserver/enums/actors/NpcSkillType.CAPTURE_CANCEL_A:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #62 = NameAndType        #63:#6        // CAPTURE_CANCEL_A:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #63 = Utf8               CAPTURE_CANCEL_A
   #64 = Fieldref           #1.#65        // ext/mods/gameserver/enums/actors/NpcSkillType.CAPTURE_CANCEL_B:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #65 = NameAndType        #66:#6        // CAPTURE_CANCEL_B:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #66 = Utf8               CAPTURE_CANCEL_B
   #67 = Fieldref           #1.#68        // ext/mods/gameserver/enums/actors/NpcSkillType.CAPTURE_CANCEL_C:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #68 = NameAndType        #69:#6        // CAPTURE_CANCEL_C:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #69 = Utf8               CAPTURE_CANCEL_C
   #70 = Fieldref           #1.#71        // ext/mods/gameserver/enums/actors/NpcSkillType.CAPTURE_CANCEL_ALL:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #71 = NameAndType        #72:#6        // CAPTURE_CANCEL_ALL:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #72 = Utf8               CAPTURE_CANCEL_ALL
   #73 = Fieldref           #1.#74        // ext/mods/gameserver/enums/actors/NpcSkillType.CHECK_MAGIC:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #74 = NameAndType        #75:#6        // CHECK_MAGIC:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #75 = Utf8               CHECK_MAGIC
   #76 = Fieldref           #1.#77        // ext/mods/gameserver/enums/actors/NpcSkillType.CHECK_MAGIC1:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #77 = NameAndType        #78:#6        // CHECK_MAGIC1:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #78 = Utf8               CHECK_MAGIC1
   #79 = Fieldref           #1.#80        // ext/mods/gameserver/enums/actors/NpcSkillType.CHECK_MAGIC2:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #80 = NameAndType        #81:#6        // CHECK_MAGIC2:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #81 = Utf8               CHECK_MAGIC2
   #82 = Fieldref           #1.#83        // ext/mods/gameserver/enums/actors/NpcSkillType.CHECK_SKILL1:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #83 = NameAndType        #84:#6        // CHECK_SKILL1:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #84 = Utf8               CHECK_SKILL1
   #85 = Fieldref           #1.#86        // ext/mods/gameserver/enums/actors/NpcSkillType.CHECK_SKILL2:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #86 = NameAndType        #87:#6        // CHECK_SKILL2:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #87 = Utf8               CHECK_SKILL2
   #88 = Fieldref           #1.#89        // ext/mods/gameserver/enums/actors/NpcSkillType.CLAN_BUF1:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #89 = NameAndType        #90:#6        // CLAN_BUF1:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #90 = Utf8               CLAN_BUF1
   #91 = Fieldref           #1.#92        // ext/mods/gameserver/enums/actors/NpcSkillType.CLAN_BUFF1:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #92 = NameAndType        #93:#6        // CLAN_BUFF1:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #93 = Utf8               CLAN_BUFF1
   #94 = Fieldref           #1.#95        // ext/mods/gameserver/enums/actors/NpcSkillType.CLEAR_CORPSE:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #95 = NameAndType        #96:#6        // CLEAR_CORPSE:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #96 = Utf8               CLEAR_CORPSE
   #97 = Fieldref           #1.#98        // ext/mods/gameserver/enums/actors/NpcSkillType.CRAZY_MODE:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #98 = NameAndType        #99:#6        // CRAZY_MODE:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #99 = Utf8               CRAZY_MODE
  #100 = Fieldref           #1.#101       // ext/mods/gameserver/enums/actors/NpcSkillType.DD_MAGIC:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #101 = NameAndType        #102:#6       // DD_MAGIC:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #102 = Utf8               DD_MAGIC
  #103 = Fieldref           #1.#104       // ext/mods/gameserver/enums/actors/NpcSkillType.DD_MAGIC1:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #104 = NameAndType        #105:#6       // DD_MAGIC1:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #105 = Utf8               DD_MAGIC1
  #106 = Fieldref           #1.#107       // ext/mods/gameserver/enums/actors/NpcSkillType.DD_MAGIC2:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #107 = NameAndType        #108:#6       // DD_MAGIC2:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #108 = Utf8               DD_MAGIC2
  #109 = Fieldref           #1.#110       // ext/mods/gameserver/enums/actors/NpcSkillType.DD_MAGIC3:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #110 = NameAndType        #111:#6       // DD_MAGIC3:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #111 = Utf8               DD_MAGIC3
  #112 = Fieldref           #1.#113       // ext/mods/gameserver/enums/actors/NpcSkillType.DD_MAGIC_SLOW:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #113 = NameAndType        #114:#6       // DD_MAGIC_SLOW:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #114 = Utf8               DD_MAGIC_SLOW
  #115 = Fieldref           #1.#116       // ext/mods/gameserver/enums/actors/NpcSkillType.DD_MAGIC_A:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #116 = NameAndType        #117:#6       // DD_MAGIC_A:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #117 = Utf8               DD_MAGIC_A
  #118 = Fieldref           #1.#119       // ext/mods/gameserver/enums/actors/NpcSkillType.DD_PHYSIC1:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #119 = NameAndType        #120:#6       // DD_PHYSIC1:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #120 = Utf8               DD_PHYSIC1
  #121 = Fieldref           #1.#122       // ext/mods/gameserver/enums/actors/NpcSkillType.DD_PHYSIC2:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #122 = NameAndType        #123:#6       // DD_PHYSIC2:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #123 = Utf8               DD_PHYSIC2
  #124 = Fieldref           #1.#125       // ext/mods/gameserver/enums/actors/NpcSkillType.DD_PHYSIC3:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #125 = NameAndType        #126:#6       // DD_PHYSIC3:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #126 = Utf8               DD_PHYSIC3
  #127 = Fieldref           #1.#128       // ext/mods/gameserver/enums/actors/NpcSkillType.DEBUFF:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #128 = NameAndType        #129:#6       // DEBUFF:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #129 = Utf8               DEBUFF
  #130 = Fieldref           #1.#131       // ext/mods/gameserver/enums/actors/NpcSkillType.DEBUFF_A:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #131 = NameAndType        #132:#6       // DEBUFF_A:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #132 = Utf8               DEBUFF_A
  #133 = Fieldref           #1.#134       // ext/mods/gameserver/enums/actors/NpcSkillType.DEFENCE_MODE:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #134 = NameAndType        #135:#6       // DEFENCE_MODE:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #135 = Utf8               DEFENCE_MODE
  #136 = Fieldref           #1.#137       // ext/mods/gameserver/enums/actors/NpcSkillType.DEBUFF1:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #137 = NameAndType        #138:#6       // DEBUFF1:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #138 = Utf8               DEBUFF1
  #139 = Fieldref           #1.#140       // ext/mods/gameserver/enums/actors/NpcSkillType.DEBUFF1_CANCEL:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #140 = NameAndType        #141:#6       // DEBUFF1_CANCEL:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #141 = Utf8               DEBUFF1_CANCEL
  #142 = Fieldref           #1.#143       // ext/mods/gameserver/enums/actors/NpcSkillType.DEBUFF2:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #143 = NameAndType        #144:#6       // DEBUFF2:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #144 = Utf8               DEBUFF2
  #145 = Fieldref           #1.#146       // ext/mods/gameserver/enums/actors/NpcSkillType.DEBUFF2_CANCEL:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #146 = NameAndType        #147:#6       // DEBUFF2_CANCEL:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #147 = Utf8               DEBUFF2_CANCEL
  #148 = Fieldref           #1.#149       // ext/mods/gameserver/enums/actors/NpcSkillType.DEBUFF3:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #149 = NameAndType        #150:#6       // DEBUFF3:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #150 = Utf8               DEBUFF3
  #151 = Fieldref           #1.#152       // ext/mods/gameserver/enums/actors/NpcSkillType.DEBUFF_CANCEL:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #152 = NameAndType        #153:#6       // DEBUFF_CANCEL:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #153 = Utf8               DEBUFF_CANCEL
  #154 = Fieldref           #1.#155       // ext/mods/gameserver/enums/actors/NpcSkillType.DISPELL:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #155 = NameAndType        #156:#6       // DISPELL:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #156 = Utf8               DISPELL
  #157 = Fieldref           #1.#158       // ext/mods/gameserver/enums/actors/NpcSkillType.DEBUFF4:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #158 = NameAndType        #159:#6       // DEBUFF4:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #159 = Utf8               DEBUFF4
  #160 = Fieldref           #1.#161       // ext/mods/gameserver/enums/actors/NpcSkillType.DEBUFF5:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #161 = NameAndType        #162:#6       // DEBUFF5:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #162 = Utf8               DEBUFF5
  #163 = Fieldref           #1.#164       // ext/mods/gameserver/enums/actors/NpcSkillType.EFFECT_SKILL:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #164 = NameAndType        #165:#6       // EFFECT_SKILL:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #165 = Utf8               EFFECT_SKILL
  #166 = Fieldref           #1.#167       // ext/mods/gameserver/enums/actors/NpcSkillType.EFFECT_SKILL2:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #167 = NameAndType        #168:#6       // EFFECT_SKILL2:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #168 = Utf8               EFFECT_SKILL2
  #169 = Fieldref           #1.#170       // ext/mods/gameserver/enums/actors/NpcSkillType.FURY:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #170 = NameAndType        #171:#6       // FURY:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #171 = Utf8               FURY
  #172 = Fieldref           #1.#173       // ext/mods/gameserver/enums/actors/NpcSkillType.HEAL:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #173 = NameAndType        #174:#6       // HEAL:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #174 = Utf8               HEAL
  #175 = Fieldref           #1.#176       // ext/mods/gameserver/enums/actors/NpcSkillType.HEAL1:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #176 = NameAndType        #177:#6       // HEAL1:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #177 = Utf8               HEAL1
  #178 = Fieldref           #1.#179       // ext/mods/gameserver/enums/actors/NpcSkillType.HEAL2:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #179 = NameAndType        #180:#6       // HEAL2:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #180 = Utf8               HEAL2
  #181 = Fieldref           #1.#182       // ext/mods/gameserver/enums/actors/NpcSkillType.HEAL_MAGIC:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #182 = NameAndType        #183:#6       // HEAL_MAGIC:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #183 = Utf8               HEAL_MAGIC
  #184 = Fieldref           #1.#185       // ext/mods/gameserver/enums/actors/NpcSkillType.HEAL_MAGIC_A:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #185 = NameAndType        #186:#6       // HEAL_MAGIC_A:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #186 = Utf8               HEAL_MAGIC_A
  #187 = Fieldref           #1.#188       // ext/mods/gameserver/enums/actors/NpcSkillType.HERO_SKILL:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #188 = NameAndType        #189:#6       // HERO_SKILL:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #189 = Utf8               HERO_SKILL
  #190 = Fieldref           #1.#191       // ext/mods/gameserver/enums/actors/NpcSkillType.HOLD_MAGIC:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #191 = NameAndType        #192:#6       // HOLD_MAGIC:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #192 = Utf8               HOLD_MAGIC
  #193 = Fieldref           #1.#194       // ext/mods/gameserver/enums/actors/NpcSkillType.LONG_RANGE_DD_MAGIC1:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #194 = NameAndType        #195:#6       // LONG_RANGE_DD_MAGIC1:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #195 = Utf8               LONG_RANGE_DD_MAGIC1
  #196 = Fieldref           #1.#197       // ext/mods/gameserver/enums/actors/NpcSkillType.LONG_RANGE_PHYSICAL_SPECIAL:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #197 = NameAndType        #198:#6       // LONG_RANGE_PHYSICAL_SPECIAL:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #198 = Utf8               LONG_RANGE_PHYSICAL_SPECIAL
  #199 = Fieldref           #1.#200       // ext/mods/gameserver/enums/actors/NpcSkillType.LONG_RANGE_PHYSICAL_SPECIAL_A:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #200 = NameAndType        #201:#6       // LONG_RANGE_PHYSICAL_SPECIAL_A:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #201 = Utf8               LONG_RANGE_PHYSICAL_SPECIAL_A
  #202 = Fieldref           #1.#203       // ext/mods/gameserver/enums/actors/NpcSkillType.MAGIC_HEAL:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #203 = NameAndType        #204:#6       // MAGIC_HEAL:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #204 = Utf8               MAGIC_HEAL
  #205 = Fieldref           #1.#206       // ext/mods/gameserver/enums/actors/NpcSkillType.MAGIC_SLEEP:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #206 = NameAndType        #207:#6       // MAGIC_SLEEP:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #207 = Utf8               MAGIC_SLEEP
  #208 = Fieldref           #1.#209       // ext/mods/gameserver/enums/actors/NpcSkillType.MOB_HATE:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #209 = NameAndType        #210:#6       // MOB_HATE:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #210 = Utf8               MOB_HATE
  #211 = Fieldref           #1.#212       // ext/mods/gameserver/enums/actors/NpcSkillType.NORMAL_BODY_SKILL:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #212 = NameAndType        #213:#6       // NORMAL_BODY_SKILL:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #213 = Utf8               NORMAL_BODY_SKILL
  #214 = Fieldref           #1.#215       // ext/mods/gameserver/enums/actors/NpcSkillType.PHYSICAL_SPECIAL:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #215 = NameAndType        #216:#6       // PHYSICAL_SPECIAL:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #216 = Utf8               PHYSICAL_SPECIAL
  #217 = Fieldref           #1.#218       // ext/mods/gameserver/enums/actors/NpcSkillType.PHYSICAL_SPECIAL1:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #218 = NameAndType        #219:#6       // PHYSICAL_SPECIAL1:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #219 = Utf8               PHYSICAL_SPECIAL1
  #220 = Fieldref           #1.#221       // ext/mods/gameserver/enums/actors/NpcSkillType.PHYSICAL_SPECIAL2:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #221 = NameAndType        #222:#6       // PHYSICAL_SPECIAL2:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #222 = Utf8               PHYSICAL_SPECIAL2
  #223 = Fieldref           #1.#224       // ext/mods/gameserver/enums/actors/NpcSkillType.PHYSICAL_SPECIAL3:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #224 = NameAndType        #225:#6       // PHYSICAL_SPECIAL3:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #225 = Utf8               PHYSICAL_SPECIAL3
  #226 = Fieldref           #1.#227       // ext/mods/gameserver/enums/actors/NpcSkillType.PHYSICAL_SPECIAL_RANGE:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #227 = NameAndType        #228:#6       // PHYSICAL_SPECIAL_RANGE:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #228 = Utf8               PHYSICAL_SPECIAL_RANGE
  #229 = Fieldref           #1.#230       // ext/mods/gameserver/enums/actors/NpcSkillType.PHYSICAL_SPECIAL_A:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #230 = NameAndType        #231:#6       // PHYSICAL_SPECIAL_A:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #231 = Utf8               PHYSICAL_SPECIAL_A
  #232 = Fieldref           #1.#233       // ext/mods/gameserver/enums/actors/NpcSkillType.PHYSICAL_SPECIAL_B:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #233 = NameAndType        #234:#6       // PHYSICAL_SPECIAL_B:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #234 = Utf8               PHYSICAL_SPECIAL_B
  #235 = Fieldref           #1.#236       // ext/mods/gameserver/enums/actors/NpcSkillType.RANGE_BUFF:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #236 = NameAndType        #237:#6       // RANGE_BUFF:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #237 = Utf8               RANGE_BUFF
  #238 = Fieldref           #1.#239       // ext/mods/gameserver/enums/actors/NpcSkillType.RANGE_DD:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #239 = NameAndType        #240:#6       // RANGE_DD:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #240 = Utf8               RANGE_DD
  #241 = Fieldref           #1.#242       // ext/mods/gameserver/enums/actors/NpcSkillType.RANGE_DD_MAGIC1:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #242 = NameAndType        #243:#6       // RANGE_DD_MAGIC1:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #243 = Utf8               RANGE_DD_MAGIC1
  #244 = Fieldref           #1.#245       // ext/mods/gameserver/enums/actors/NpcSkillType.RANGE_DD_MAGIC_A:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #245 = NameAndType        #246:#6       // RANGE_DD_MAGIC_A:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #246 = Utf8               RANGE_DD_MAGIC_A
  #247 = Fieldref           #1.#248       // ext/mods/gameserver/enums/actors/NpcSkillType.RANGE_DEBUFF:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #248 = NameAndType        #249:#6       // RANGE_DEBUFF:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #249 = Utf8               RANGE_DEBUFF
  #250 = Fieldref           #1.#251       // ext/mods/gameserver/enums/actors/NpcSkillType.RANGE_HOLD_A:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #251 = NameAndType        #252:#6       // RANGE_HOLD_A:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #252 = Utf8               RANGE_HOLD_A
  #253 = Fieldref           #1.#254       // ext/mods/gameserver/enums/actors/NpcSkillType.RANGE_PHYSICAL_SPECIAL:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #254 = NameAndType        #255:#6       // RANGE_PHYSICAL_SPECIAL:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #255 = Utf8               RANGE_PHYSICAL_SPECIAL
  #256 = Fieldref           #1.#257       // ext/mods/gameserver/enums/actors/NpcSkillType.SELF_BUFF:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #257 = NameAndType        #258:#6       // SELF_BUFF:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #258 = Utf8               SELF_BUFF
  #259 = Fieldref           #1.#260       // ext/mods/gameserver/enums/actors/NpcSkillType.SELF_BUFF1:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #260 = NameAndType        #261:#6       // SELF_BUFF1:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #261 = Utf8               SELF_BUFF1
  #262 = Fieldref           #1.#263       // ext/mods/gameserver/enums/actors/NpcSkillType.SELF_BUFF2:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #263 = NameAndType        #264:#6       // SELF_BUFF2:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #264 = Utf8               SELF_BUFF2
  #265 = Fieldref           #1.#266       // ext/mods/gameserver/enums/actors/NpcSkillType.SELF_BUFF3:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #266 = NameAndType        #267:#6       // SELF_BUFF3:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #267 = Utf8               SELF_BUFF3
  #268 = Fieldref           #1.#269       // ext/mods/gameserver/enums/actors/NpcSkillType.SELF_BUFF4:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #269 = NameAndType        #270:#6       // SELF_BUFF4:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #270 = Utf8               SELF_BUFF4
  #271 = Fieldref           #1.#272       // ext/mods/gameserver/enums/actors/NpcSkillType.SELF_BUFF_A:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #272 = NameAndType        #273:#6       // SELF_BUFF_A:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #273 = Utf8               SELF_BUFF_A
  #274 = Fieldref           #1.#275       // ext/mods/gameserver/enums/actors/NpcSkillType.SELF_DEBUFF1:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #275 = NameAndType        #276:#6       // SELF_DEBUFF1:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #276 = Utf8               SELF_DEBUFF1
  #277 = Fieldref           #1.#278       // ext/mods/gameserver/enums/actors/NpcSkillType.SELF_DEBUFF2:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #278 = NameAndType        #279:#6       // SELF_DEBUFF2:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #279 = Utf8               SELF_DEBUFF2
  #280 = Fieldref           #1.#281       // ext/mods/gameserver/enums/actors/NpcSkillType.SELF_DEBUFF3:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #281 = NameAndType        #282:#6       // SELF_DEBUFF3:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #282 = Utf8               SELF_DEBUFF3
  #283 = Fieldref           #1.#284       // ext/mods/gameserver/enums/actors/NpcSkillType.SELF_EXPLOSION:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #284 = NameAndType        #285:#6       // SELF_EXPLOSION:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #285 = Utf8               SELF_EXPLOSION
  #286 = Fieldref           #1.#287       // ext/mods/gameserver/enums/actors/NpcSkillType.SELF_MAGIC_HEAL:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #287 = NameAndType        #288:#6       // SELF_MAGIC_HEAL:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #288 = Utf8               SELF_MAGIC_HEAL
  #289 = Fieldref           #1.#290       // ext/mods/gameserver/enums/actors/NpcSkillType.SELF_RANGE_BUFF:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #290 = NameAndType        #291:#6       // SELF_RANGE_BUFF:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #291 = Utf8               SELF_RANGE_BUFF
  #292 = Fieldref           #1.#293       // ext/mods/gameserver/enums/actors/NpcSkillType.SELF_RANGE_BUFF1:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #293 = NameAndType        #294:#6       // SELF_RANGE_BUFF1:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #294 = Utf8               SELF_RANGE_BUFF1
  #295 = Fieldref           #1.#296       // ext/mods/gameserver/enums/actors/NpcSkillType.SELF_RANGE_BUFF_A:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #296 = NameAndType        #297:#6       // SELF_RANGE_BUFF_A:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #297 = Utf8               SELF_RANGE_BUFF_A
  #298 = Fieldref           #1.#299       // ext/mods/gameserver/enums/actors/NpcSkillType.SELF_RANGE_CANCEL_A:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #299 = NameAndType        #300:#6       // SELF_RANGE_CANCEL_A:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #300 = Utf8               SELF_RANGE_CANCEL_A
  #301 = Fieldref           #1.#302       // ext/mods/gameserver/enums/actors/NpcSkillType.SELF_RANGE_CANCEL_A1:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #302 = NameAndType        #303:#6       // SELF_RANGE_CANCEL_A1:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #303 = Utf8               SELF_RANGE_CANCEL_A1
  #304 = Fieldref           #1.#305       // ext/mods/gameserver/enums/actors/NpcSkillType.SELF_RANGE_CANCEL_A2:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #305 = NameAndType        #306:#6       // SELF_RANGE_CANCEL_A2:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #306 = Utf8               SELF_RANGE_CANCEL_A2
  #307 = Fieldref           #1.#308       // ext/mods/gameserver/enums/actors/NpcSkillType.SELF_RANGE_DD_MAGIC:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #308 = NameAndType        #309:#6       // SELF_RANGE_DD_MAGIC:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #309 = Utf8               SELF_RANGE_DD_MAGIC
  #310 = Fieldref           #1.#311       // ext/mods/gameserver/enums/actors/NpcSkillType.SELF_RANGE_DD_MAGIC1:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #311 = NameAndType        #312:#6       // SELF_RANGE_DD_MAGIC1:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #312 = Utf8               SELF_RANGE_DD_MAGIC1
  #313 = Fieldref           #1.#314       // ext/mods/gameserver/enums/actors/NpcSkillType.SELF_RANGE_DD_MAGIC2:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #314 = NameAndType        #315:#6       // SELF_RANGE_DD_MAGIC2:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #315 = Utf8               SELF_RANGE_DD_MAGIC2
  #316 = Fieldref           #1.#317       // ext/mods/gameserver/enums/actors/NpcSkillType.SELF_RANGE_DD_MAGIC3:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #317 = NameAndType        #318:#6       // SELF_RANGE_DD_MAGIC3:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #318 = Utf8               SELF_RANGE_DD_MAGIC3
  #319 = Fieldref           #1.#320       // ext/mods/gameserver/enums/actors/NpcSkillType.SELF_RANGE_DEBUFF:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #320 = NameAndType        #321:#6       // SELF_RANGE_DEBUFF:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #321 = Utf8               SELF_RANGE_DEBUFF
  #322 = Fieldref           #1.#323       // ext/mods/gameserver/enums/actors/NpcSkillType.SELF_RANGE_DEBUFF1:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #323 = NameAndType        #324:#6       // SELF_RANGE_DEBUFF1:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #324 = Utf8               SELF_RANGE_DEBUFF1
  #325 = Fieldref           #1.#326       // ext/mods/gameserver/enums/actors/NpcSkillType.SELF_RANGE_DEBUFF_ANOTHER_A:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #326 = NameAndType        #327:#6       // SELF_RANGE_DEBUFF_ANOTHER_A:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #327 = Utf8               SELF_RANGE_DEBUFF_ANOTHER_A
  #328 = Fieldref           #1.#329       // ext/mods/gameserver/enums/actors/NpcSkillType.SELF_RANGE_DEBUFF_A:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #329 = NameAndType        #330:#6       // SELF_RANGE_DEBUFF_A:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #330 = Utf8               SELF_RANGE_DEBUFF_A
  #331 = Fieldref           #1.#332       // ext/mods/gameserver/enums/actors/NpcSkillType.SELF_RANGE_PHYSICAL_SPECIAL:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #332 = NameAndType        #333:#6       // SELF_RANGE_PHYSICAL_SPECIAL:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #333 = Utf8               SELF_RANGE_PHYSICAL_SPECIAL
  #334 = Fieldref           #1.#335       // ext/mods/gameserver/enums/actors/NpcSkillType.SELF_RANGE_PHYSICAL_SPECIAL_A:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #335 = NameAndType        #336:#6       // SELF_RANGE_PHYSICAL_SPECIAL_A:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #336 = Utf8               SELF_RANGE_PHYSICAL_SPECIAL_A
  #337 = Fieldref           #1.#338       // ext/mods/gameserver/enums/actors/NpcSkillType.SET_CURSE:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #338 = NameAndType        #339:#6       // SET_CURSE:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #339 = Utf8               SET_CURSE
  #340 = Fieldref           #1.#341       // ext/mods/gameserver/enums/actors/NpcSkillType.SKILL01_ID:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #341 = NameAndType        #342:#6       // SKILL01_ID:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #342 = Utf8               SKILL01_ID
  #343 = Fieldref           #1.#344       // ext/mods/gameserver/enums/actors/NpcSkillType.SKILL02_ID:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #344 = NameAndType        #345:#6       // SKILL02_ID:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #345 = Utf8               SKILL02_ID
  #346 = Fieldref           #1.#347       // ext/mods/gameserver/enums/actors/NpcSkillType.SKILL03_ID:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #347 = NameAndType        #348:#6       // SKILL03_ID:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #348 = Utf8               SKILL03_ID
  #349 = Fieldref           #1.#350       // ext/mods/gameserver/enums/actors/NpcSkillType.SKILL04_ID:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #350 = NameAndType        #351:#6       // SKILL04_ID:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #351 = Utf8               SKILL04_ID
  #352 = Fieldref           #1.#353       // ext/mods/gameserver/enums/actors/NpcSkillType.SKILL05_ID:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #353 = NameAndType        #354:#6       // SKILL05_ID:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #354 = Utf8               SKILL05_ID
  #355 = Fieldref           #1.#356       // ext/mods/gameserver/enums/actors/NpcSkillType.SKILL06_ID:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #356 = NameAndType        #357:#6       // SKILL06_ID:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #357 = Utf8               SKILL06_ID
  #358 = Fieldref           #1.#359       // ext/mods/gameserver/enums/actors/NpcSkillType.SLEEP_MAGIC:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #359 = NameAndType        #360:#6       // SLEEP_MAGIC:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #360 = Utf8               SLEEP_MAGIC
  #361 = Fieldref           #1.#362       // ext/mods/gameserver/enums/actors/NpcSkillType.SPECIAL_ATTACK:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #362 = NameAndType        #363:#6       // SPECIAL_ATTACK:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #363 = Utf8               SPECIAL_ATTACK
  #364 = Fieldref           #1.#365       // ext/mods/gameserver/enums/actors/NpcSkillType.SPECIAL_SKILL:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #365 = NameAndType        #366:#6       // SPECIAL_SKILL:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #366 = Utf8               SPECIAL_SKILL
  #367 = Fieldref           #1.#368       // ext/mods/gameserver/enums/actors/NpcSkillType.STATUS_EFFECT:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #368 = NameAndType        #369:#6       // STATUS_EFFECT:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #369 = Utf8               STATUS_EFFECT
  #370 = Fieldref           #1.#371       // ext/mods/gameserver/enums/actors/NpcSkillType.SUMMON_EFFECT:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #371 = NameAndType        #372:#6       // SUMMON_EFFECT:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #372 = Utf8               SUMMON_EFFECT
  #373 = Fieldref           #1.#374       // ext/mods/gameserver/enums/actors/NpcSkillType.SUMMON_HEAL1:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #374 = NameAndType        #375:#6       // SUMMON_HEAL1:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #375 = Utf8               SUMMON_HEAL1
  #376 = Fieldref           #1.#377       // ext/mods/gameserver/enums/actors/NpcSkillType.SUMMON_HEAL2:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #377 = NameAndType        #378:#6       // SUMMON_HEAL2:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #378 = Utf8               SUMMON_HEAL2
  #379 = Fieldref           #1.#380       // ext/mods/gameserver/enums/actors/NpcSkillType.SUMMON_MAGIC:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #380 = NameAndType        #381:#6       // SUMMON_MAGIC:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #381 = Utf8               SUMMON_MAGIC
  #382 = Fieldref           #1.#383       // ext/mods/gameserver/enums/actors/NpcSkillType.SUMMON_MODE:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #383 = NameAndType        #384:#6       // SUMMON_MODE:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #384 = Utf8               SUMMON_MODE
  #385 = Fieldref           #1.#386       // ext/mods/gameserver/enums/actors/NpcSkillType.TELEPORT_EFFECT:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #386 = NameAndType        #387:#6       // TELEPORT_EFFECT:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #387 = Utf8               TELEPORT_EFFECT
  #388 = Fieldref           #1.#389       // ext/mods/gameserver/enums/actors/NpcSkillType.WEAK_MODE_FALSE:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #389 = NameAndType        #390:#6       // WEAK_MODE_FALSE:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #390 = Utf8               WEAK_MODE_FALSE
  #391 = Fieldref           #1.#392       // ext/mods/gameserver/enums/actors/NpcSkillType.WEAK_MODE_TRUE:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #392 = NameAndType        #393:#6       // WEAK_MODE_TRUE:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #393 = Utf8               WEAK_MODE_TRUE
  #394 = Fieldref           #1.#395       // ext/mods/gameserver/enums/actors/NpcSkillType.W_CLAN_BUFF:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #395 = NameAndType        #396:#6       // W_CLAN_BUFF:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #396 = Utf8               W_CLAN_BUFF
  #397 = Fieldref           #1.#398       // ext/mods/gameserver/enums/actors/NpcSkillType.W_FIEND_ARCHER:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #398 = NameAndType        #399:#6       // W_FIEND_ARCHER:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #399 = Utf8               W_FIEND_ARCHER
  #400 = Fieldref           #1.#401       // ext/mods/gameserver/enums/actors/NpcSkillType.W_LONG_RANGE_DD_MAGIC:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #401 = NameAndType        #402:#6       // W_LONG_RANGE_DD_MAGIC:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #402 = Utf8               W_LONG_RANGE_DD_MAGIC
  #403 = Fieldref           #1.#404       // ext/mods/gameserver/enums/actors/NpcSkillType.W_LONG_RANGE_DD_MAGIC1:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #404 = NameAndType        #405:#6       // W_LONG_RANGE_DD_MAGIC1:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #405 = Utf8               W_LONG_RANGE_DD_MAGIC1
  #406 = Fieldref           #1.#407       // ext/mods/gameserver/enums/actors/NpcSkillType.W_LONG_RANGE_DD_MAGIC2:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #407 = NameAndType        #408:#6       // W_LONG_RANGE_DD_MAGIC2:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #408 = Utf8               W_LONG_RANGE_DD_MAGIC2
  #409 = Fieldref           #1.#410       // ext/mods/gameserver/enums/actors/NpcSkillType.W_MIDDLE_RANGE_DD_MAGIC:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #410 = NameAndType        #411:#6       // W_MIDDLE_RANGE_DD_MAGIC:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #411 = Utf8               W_MIDDLE_RANGE_DD_MAGIC
  #412 = Fieldref           #1.#413       // ext/mods/gameserver/enums/actors/NpcSkillType.W_RANGE_DEBUFF:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #413 = NameAndType        #414:#6       // W_RANGE_DEBUFF:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #414 = Utf8               W_RANGE_DEBUFF
  #415 = Fieldref           #1.#416       // ext/mods/gameserver/enums/actors/NpcSkillType.W_RANGE_HEAL:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #416 = NameAndType        #417:#6       // W_RANGE_HEAL:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #417 = Utf8               W_RANGE_HEAL
  #418 = Fieldref           #1.#419       // ext/mods/gameserver/enums/actors/NpcSkillType.W_SELF_RANGE_DD_MAGIC:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #419 = NameAndType        #420:#6       // W_SELF_RANGE_DD_MAGIC:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #420 = Utf8               W_SELF_RANGE_DD_MAGIC
  #421 = Fieldref           #1.#422       // ext/mods/gameserver/enums/actors/NpcSkillType.W_SELF_RANGE_DEBUFF:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #422 = NameAndType        #423:#6       // W_SELF_RANGE_DEBUFF:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #423 = Utf8               W_SELF_RANGE_DEBUFF
  #424 = Fieldref           #1.#425       // ext/mods/gameserver/enums/actors/NpcSkillType.W_SHORT_RANGE_DD_MAGIC:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #425 = NameAndType        #426:#6       // W_SHORT_RANGE_DD_MAGIC:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #426 = Utf8               W_SHORT_RANGE_DD_MAGIC
  #427 = Fieldref           #1.#428       // ext/mods/gameserver/enums/actors/NpcSkillType.$VALUES:[Lext/mods/gameserver/enums/actors/NpcSkillType;
  #428 = NameAndType        #429:#430     // $VALUES:[Lext/mods/gameserver/enums/actors/NpcSkillType;
  #429 = Utf8               $VALUES
  #430 = Utf8               [Lext/mods/gameserver/enums/actors/NpcSkillType;
  #431 = Methodref          #432.#433     // "[Lext/mods/gameserver/enums/actors/NpcSkillType;".clone:()Ljava/lang/Object;
  #432 = Class              #430          // "[Lext/mods/gameserver/enums/actors/NpcSkillType;"
  #433 = NameAndType        #434:#435     // clone:()Ljava/lang/Object;
  #434 = Utf8               clone
  #435 = Utf8               ()Ljava/lang/Object;
  #436 = Methodref          #437.#438     // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #437 = Class              #439          // java/lang/Enum
  #438 = NameAndType        #440:#441     // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #439 = Utf8               java/lang/Enum
  #440 = Utf8               valueOf
  #441 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #442 = Methodref          #437.#443     // java/lang/Enum."<init>":(Ljava/lang/String;I)V
  #443 = NameAndType        #444:#445     // "<init>":(Ljava/lang/String;I)V
  #444 = Utf8               <init>
  #445 = Utf8               (Ljava/lang/String;I)V
  #446 = String             #5            // PASSIVE
  #447 = Methodref          #1.#443       // ext/mods/gameserver/enums/actors/NpcSkillType."<init>":(Ljava/lang/String;I)V
  #448 = String             #9            // AFFLICT_SKILL1
  #449 = String             #12           // AFFLICT_SKILL2
  #450 = String             #15           // AFFLICT_SKILL3
  #451 = String             #18           // ARROW_DEFENCE_MODE
  #452 = String             #21           // ARROW_NORMAL_MODE
  #453 = String             #24           // BIG_BODY_SKILL
  #454 = String             #27           // BOMB
  #455 = String             #30           // BOMBER
  #456 = String             #33           // BUFF
  #457 = String             #36           // BUFF1
  #458 = String             #39           // BUFF2
  #459 = String             #42           // BUFF3
  #460 = String             #45           // BUFF4
  #461 = String             #48           // BUFF5
  #462 = String             #51           // BUFF6
  #463 = String             #54           // BUFF_ULTIMATE_SHIELD
  #464 = String             #57           // CANCEL
  #465 = String             #60           // CANCEL_MAGIC
  #466 = String             #63           // CAPTURE_CANCEL_A
  #467 = String             #66           // CAPTURE_CANCEL_B
  #468 = String             #69           // CAPTURE_CANCEL_C
  #469 = String             #72           // CAPTURE_CANCEL_ALL
  #470 = String             #75           // CHECK_MAGIC
  #471 = String             #78           // CHECK_MAGIC1
  #472 = String             #81           // CHECK_MAGIC2
  #473 = String             #84           // CHECK_SKILL1
  #474 = String             #87           // CHECK_SKILL2
  #475 = String             #90           // CLAN_BUF1
  #476 = String             #93           // CLAN_BUFF1
  #477 = String             #96           // CLEAR_CORPSE
  #478 = String             #99           // CRAZY_MODE
  #479 = String             #102          // DD_MAGIC
  #480 = String             #105          // DD_MAGIC1
  #481 = String             #108          // DD_MAGIC2
  #482 = String             #111          // DD_MAGIC3
  #483 = String             #114          // DD_MAGIC_SLOW
  #484 = String             #117          // DD_MAGIC_A
  #485 = String             #120          // DD_PHYSIC1
  #486 = String             #123          // DD_PHYSIC2
  #487 = String             #126          // DD_PHYSIC3
  #488 = String             #129          // DEBUFF
  #489 = String             #132          // DEBUFF_A
  #490 = String             #135          // DEFENCE_MODE
  #491 = String             #138          // DEBUFF1
  #492 = String             #141          // DEBUFF1_CANCEL
  #493 = String             #144          // DEBUFF2
  #494 = String             #147          // DEBUFF2_CANCEL
  #495 = String             #150          // DEBUFF3
  #496 = String             #153          // DEBUFF_CANCEL
  #497 = String             #156          // DISPELL
  #498 = String             #159          // DEBUFF4
  #499 = String             #162          // DEBUFF5
  #500 = String             #165          // EFFECT_SKILL
  #501 = String             #168          // EFFECT_SKILL2
  #502 = String             #171          // FURY
  #503 = String             #174          // HEAL
  #504 = String             #177          // HEAL1
  #505 = String             #180          // HEAL2
  #506 = String             #183          // HEAL_MAGIC
  #507 = String             #186          // HEAL_MAGIC_A
  #508 = String             #189          // HERO_SKILL
  #509 = String             #192          // HOLD_MAGIC
  #510 = String             #195          // LONG_RANGE_DD_MAGIC1
  #511 = String             #198          // LONG_RANGE_PHYSICAL_SPECIAL
  #512 = String             #201          // LONG_RANGE_PHYSICAL_SPECIAL_A
  #513 = String             #204          // MAGIC_HEAL
  #514 = String             #207          // MAGIC_SLEEP
  #515 = String             #210          // MOB_HATE
  #516 = String             #213          // NORMAL_BODY_SKILL
  #517 = String             #216          // PHYSICAL_SPECIAL
  #518 = String             #219          // PHYSICAL_SPECIAL1
  #519 = String             #222          // PHYSICAL_SPECIAL2
  #520 = String             #225          // PHYSICAL_SPECIAL3
  #521 = String             #228          // PHYSICAL_SPECIAL_RANGE
  #522 = String             #231          // PHYSICAL_SPECIAL_A
  #523 = String             #234          // PHYSICAL_SPECIAL_B
  #524 = String             #237          // RANGE_BUFF
  #525 = String             #240          // RANGE_DD
  #526 = String             #243          // RANGE_DD_MAGIC1
  #527 = String             #246          // RANGE_DD_MAGIC_A
  #528 = String             #249          // RANGE_DEBUFF
  #529 = String             #252          // RANGE_HOLD_A
  #530 = String             #255          // RANGE_PHYSICAL_SPECIAL
  #531 = String             #258          // SELF_BUFF
  #532 = String             #261          // SELF_BUFF1
  #533 = String             #264          // SELF_BUFF2
  #534 = String             #267          // SELF_BUFF3
  #535 = String             #270          // SELF_BUFF4
  #536 = String             #273          // SELF_BUFF_A
  #537 = String             #276          // SELF_DEBUFF1
  #538 = String             #279          // SELF_DEBUFF2
  #539 = String             #282          // SELF_DEBUFF3
  #540 = String             #285          // SELF_EXPLOSION
  #541 = String             #288          // SELF_MAGIC_HEAL
  #542 = String             #291          // SELF_RANGE_BUFF
  #543 = String             #294          // SELF_RANGE_BUFF1
  #544 = String             #297          // SELF_RANGE_BUFF_A
  #545 = String             #300          // SELF_RANGE_CANCEL_A
  #546 = String             #303          // SELF_RANGE_CANCEL_A1
  #547 = String             #306          // SELF_RANGE_CANCEL_A2
  #548 = String             #309          // SELF_RANGE_DD_MAGIC
  #549 = String             #312          // SELF_RANGE_DD_MAGIC1
  #550 = String             #315          // SELF_RANGE_DD_MAGIC2
  #551 = String             #318          // SELF_RANGE_DD_MAGIC3
  #552 = String             #321          // SELF_RANGE_DEBUFF
  #553 = String             #324          // SELF_RANGE_DEBUFF1
  #554 = String             #327          // SELF_RANGE_DEBUFF_ANOTHER_A
  #555 = String             #330          // SELF_RANGE_DEBUFF_A
  #556 = String             #333          // SELF_RANGE_PHYSICAL_SPECIAL
  #557 = String             #336          // SELF_RANGE_PHYSICAL_SPECIAL_A
  #558 = String             #339          // SET_CURSE
  #559 = String             #342          // SKILL01_ID
  #560 = String             #345          // SKILL02_ID
  #561 = String             #348          // SKILL03_ID
  #562 = String             #351          // SKILL04_ID
  #563 = String             #354          // SKILL05_ID
  #564 = String             #357          // SKILL06_ID
  #565 = String             #360          // SLEEP_MAGIC
  #566 = String             #363          // SPECIAL_ATTACK
  #567 = String             #366          // SPECIAL_SKILL
  #568 = String             #369          // STATUS_EFFECT
  #569 = String             #372          // SUMMON_EFFECT
  #570 = String             #375          // SUMMON_HEAL1
  #571 = String             #378          // SUMMON_HEAL2
  #572 = String             #381          // SUMMON_MAGIC
  #573 = String             #384          // SUMMON_MODE
  #574 = String             #387          // TELEPORT_EFFECT
  #575 = String             #390          // WEAK_MODE_FALSE
  #576 = String             #393          // WEAK_MODE_TRUE
  #577 = String             #396          // W_CLAN_BUFF
  #578 = String             #399          // W_FIEND_ARCHER
  #579 = String             #402          // W_LONG_RANGE_DD_MAGIC
  #580 = String             #405          // W_LONG_RANGE_DD_MAGIC1
  #581 = String             #408          // W_LONG_RANGE_DD_MAGIC2
  #582 = String             #411          // W_MIDDLE_RANGE_DD_MAGIC
  #583 = String             #414          // W_RANGE_DEBUFF
  #584 = String             #417          // W_RANGE_HEAL
  #585 = String             #420          // W_SELF_RANGE_DD_MAGIC
  #586 = String             #423          // W_SELF_RANGE_DEBUFF
  #587 = String             #426          // W_SHORT_RANGE_DD_MAGIC
  #588 = Methodref          #1.#589       // ext/mods/gameserver/enums/actors/NpcSkillType.$values:()[Lext/mods/gameserver/enums/actors/NpcSkillType;
  #589 = NameAndType        #590:#591     // $values:()[Lext/mods/gameserver/enums/actors/NpcSkillType;
  #590 = Utf8               $values
  #591 = Utf8               ()[Lext/mods/gameserver/enums/actors/NpcSkillType;
  #592 = Utf8               values
  #593 = Utf8               Code
  #594 = Utf8               LineNumberTable
  #595 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/enums/actors/NpcSkillType;
  #596 = Utf8               LocalVariableTable
  #597 = Utf8               name
  #598 = Utf8               Ljava/lang/String;
  #599 = Utf8               MethodParameters
  #600 = Utf8               this
  #601 = Utf8               Signature
  #602 = Utf8               ()V
  #603 = Utf8               <clinit>
  #604 = Utf8               Ljava/lang/Enum<Lext/mods/gameserver/enums/actors/NpcSkillType;>;
  #605 = Utf8               SourceFile
  #606 = Utf8               NpcSkillType.java
{
  public static final ext.mods.gameserver.enums.actors.NpcSkillType PASSIVE;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType AFFLICT_SKILL1;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType AFFLICT_SKILL2;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType AFFLICT_SKILL3;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType ARROW_DEFENCE_MODE;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType ARROW_NORMAL_MODE;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType BIG_BODY_SKILL;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType BOMB;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType BOMBER;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType BUFF;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType BUFF1;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType BUFF2;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType BUFF3;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType BUFF4;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType BUFF5;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType BUFF6;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType BUFF_ULTIMATE_SHIELD;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType CANCEL;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType CANCEL_MAGIC;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType CAPTURE_CANCEL_A;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType CAPTURE_CANCEL_B;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType CAPTURE_CANCEL_C;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType CAPTURE_CANCEL_ALL;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType CHECK_MAGIC;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType CHECK_MAGIC1;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType CHECK_MAGIC2;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType CHECK_SKILL1;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType CHECK_SKILL2;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType CLAN_BUF1;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType CLAN_BUFF1;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType CLEAR_CORPSE;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType CRAZY_MODE;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType DD_MAGIC;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType DD_MAGIC1;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType DD_MAGIC2;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType DD_MAGIC3;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType DD_MAGIC_SLOW;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType DD_MAGIC_A;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType DD_PHYSIC1;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType DD_PHYSIC2;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType DD_PHYSIC3;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType DEBUFF;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType DEBUFF_A;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType DEFENCE_MODE;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType DEBUFF1;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType DEBUFF1_CANCEL;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType DEBUFF2;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType DEBUFF2_CANCEL;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType DEBUFF3;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType DEBUFF_CANCEL;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType DISPELL;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType DEBUFF4;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType DEBUFF5;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType EFFECT_SKILL;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType EFFECT_SKILL2;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType FURY;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType HEAL;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType HEAL1;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType HEAL2;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType HEAL_MAGIC;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType HEAL_MAGIC_A;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType HERO_SKILL;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType HOLD_MAGIC;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType LONG_RANGE_DD_MAGIC1;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType LONG_RANGE_PHYSICAL_SPECIAL;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType LONG_RANGE_PHYSICAL_SPECIAL_A;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType MAGIC_HEAL;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType MAGIC_SLEEP;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType MOB_HATE;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType NORMAL_BODY_SKILL;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType PHYSICAL_SPECIAL;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType PHYSICAL_SPECIAL1;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType PHYSICAL_SPECIAL2;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType PHYSICAL_SPECIAL3;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType PHYSICAL_SPECIAL_RANGE;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType PHYSICAL_SPECIAL_A;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType PHYSICAL_SPECIAL_B;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType RANGE_BUFF;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType RANGE_DD;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType RANGE_DD_MAGIC1;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType RANGE_DD_MAGIC_A;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType RANGE_DEBUFF;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType RANGE_HOLD_A;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType RANGE_PHYSICAL_SPECIAL;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType SELF_BUFF;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType SELF_BUFF1;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType SELF_BUFF2;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType SELF_BUFF3;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType SELF_BUFF4;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType SELF_BUFF_A;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType SELF_DEBUFF1;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType SELF_DEBUFF2;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType SELF_DEBUFF3;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType SELF_EXPLOSION;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType SELF_MAGIC_HEAL;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType SELF_RANGE_BUFF;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType SELF_RANGE_BUFF1;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType SELF_RANGE_BUFF_A;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType SELF_RANGE_CANCEL_A;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType SELF_RANGE_CANCEL_A1;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType SELF_RANGE_CANCEL_A2;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType SELF_RANGE_DD_MAGIC;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType SELF_RANGE_DD_MAGIC1;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType SELF_RANGE_DD_MAGIC2;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType SELF_RANGE_DD_MAGIC3;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType SELF_RANGE_DEBUFF;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType SELF_RANGE_DEBUFF1;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType SELF_RANGE_DEBUFF_ANOTHER_A;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType SELF_RANGE_DEBUFF_A;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType SELF_RANGE_PHYSICAL_SPECIAL;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType SELF_RANGE_PHYSICAL_SPECIAL_A;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType SET_CURSE;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType SKILL01_ID;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType SKILL02_ID;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType SKILL03_ID;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType SKILL04_ID;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType SKILL05_ID;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType SKILL06_ID;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType SLEEP_MAGIC;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType SPECIAL_ATTACK;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType SPECIAL_SKILL;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType STATUS_EFFECT;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType SUMMON_EFFECT;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType SUMMON_HEAL1;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType SUMMON_HEAL2;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType SUMMON_MAGIC;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType SUMMON_MODE;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType TELEPORT_EFFECT;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType WEAK_MODE_FALSE;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType WEAK_MODE_TRUE;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType W_CLAN_BUFF;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType W_FIEND_ARCHER;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType W_LONG_RANGE_DD_MAGIC;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType W_LONG_RANGE_DD_MAGIC1;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType W_LONG_RANGE_DD_MAGIC2;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType W_MIDDLE_RANGE_DD_MAGIC;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType W_RANGE_DEBUFF;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType W_RANGE_HEAL;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType W_SELF_RANGE_DD_MAGIC;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType W_SELF_RANGE_DEBUFF;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.actors.NpcSkillType W_SHORT_RANGE_DD_MAGIC;
    descriptor: Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static ext.mods.gameserver.enums.actors.NpcSkillType[] values();
    descriptor: ()[Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #427                // Field $VALUES:[Lext/mods/gameserver/enums/actors/NpcSkillType;
         3: invokevirtual #431                // Method "[Lext/mods/gameserver/enums/actors/NpcSkillType;".clone:()Ljava/lang/Object;
         6: checkcast     #432                // class "[Lext/mods/gameserver/enums/actors/NpcSkillType;"
         9: areturn
      LineNumberTable:
        line 20: 0

  public static ext.mods.gameserver.enums.actors.NpcSkillType valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/enums/actors/NpcSkillType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
         2: aload_0
         3: invokestatic  #436                // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
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
         0: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
         3: dup
         4: ldc_w         #446                // String PASSIVE
         7: iconst_0
         8: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
        11: putstatic     #3                  // Field PASSIVE:Lext/mods/gameserver/enums/actors/NpcSkillType;
        14: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
        17: dup
        18: ldc_w         #448                // String AFFLICT_SKILL1
        21: iconst_1
        22: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
        25: putstatic     #7                  // Field AFFLICT_SKILL1:Lext/mods/gameserver/enums/actors/NpcSkillType;
        28: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
        31: dup
        32: ldc_w         #449                // String AFFLICT_SKILL2
        35: iconst_2
        36: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
        39: putstatic     #10                 // Field AFFLICT_SKILL2:Lext/mods/gameserver/enums/actors/NpcSkillType;
        42: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
        45: dup
        46: ldc_w         #450                // String AFFLICT_SKILL3
        49: iconst_3
        50: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
        53: putstatic     #13                 // Field AFFLICT_SKILL3:Lext/mods/gameserver/enums/actors/NpcSkillType;
        56: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
        59: dup
        60: ldc_w         #451                // String ARROW_DEFENCE_MODE
        63: iconst_4
        64: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
        67: putstatic     #16                 // Field ARROW_DEFENCE_MODE:Lext/mods/gameserver/enums/actors/NpcSkillType;
        70: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
        73: dup
        74: ldc_w         #452                // String ARROW_NORMAL_MODE
        77: iconst_5
        78: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
        81: putstatic     #19                 // Field ARROW_NORMAL_MODE:Lext/mods/gameserver/enums/actors/NpcSkillType;
        84: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
        87: dup
        88: ldc_w         #453                // String BIG_BODY_SKILL
        91: bipush        6
        93: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
        96: putstatic     #22                 // Field BIG_BODY_SKILL:Lext/mods/gameserver/enums/actors/NpcSkillType;
        99: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
       102: dup
       103: ldc_w         #454                // String BOMB
       106: bipush        7
       108: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
       111: putstatic     #25                 // Field BOMB:Lext/mods/gameserver/enums/actors/NpcSkillType;
       114: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
       117: dup
       118: ldc_w         #455                // String BOMBER
       121: bipush        8
       123: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
       126: putstatic     #28                 // Field BOMBER:Lext/mods/gameserver/enums/actors/NpcSkillType;
       129: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
       132: dup
       133: ldc_w         #456                // String BUFF
       136: bipush        9
       138: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
       141: putstatic     #31                 // Field BUFF:Lext/mods/gameserver/enums/actors/NpcSkillType;
       144: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
       147: dup
       148: ldc_w         #457                // String BUFF1
       151: bipush        10
       153: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
       156: putstatic     #34                 // Field BUFF1:Lext/mods/gameserver/enums/actors/NpcSkillType;
       159: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
       162: dup
       163: ldc_w         #458                // String BUFF2
       166: bipush        11
       168: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
       171: putstatic     #37                 // Field BUFF2:Lext/mods/gameserver/enums/actors/NpcSkillType;
       174: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
       177: dup
       178: ldc_w         #459                // String BUFF3
       181: bipush        12
       183: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
       186: putstatic     #40                 // Field BUFF3:Lext/mods/gameserver/enums/actors/NpcSkillType;
       189: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
       192: dup
       193: ldc_w         #460                // String BUFF4
       196: bipush        13
       198: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
       201: putstatic     #43                 // Field BUFF4:Lext/mods/gameserver/enums/actors/NpcSkillType;
       204: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
       207: dup
       208: ldc_w         #461                // String BUFF5
       211: bipush        14
       213: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
       216: putstatic     #46                 // Field BUFF5:Lext/mods/gameserver/enums/actors/NpcSkillType;
       219: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
       222: dup
       223: ldc_w         #462                // String BUFF6
       226: bipush        15
       228: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
       231: putstatic     #49                 // Field BUFF6:Lext/mods/gameserver/enums/actors/NpcSkillType;
       234: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
       237: dup
       238: ldc_w         #463                // String BUFF_ULTIMATE_SHIELD
       241: bipush        16
       243: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
       246: putstatic     #52                 // Field BUFF_ULTIMATE_SHIELD:Lext/mods/gameserver/enums/actors/NpcSkillType;
       249: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
       252: dup
       253: ldc_w         #464                // String CANCEL
       256: bipush        17
       258: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
       261: putstatic     #55                 // Field CANCEL:Lext/mods/gameserver/enums/actors/NpcSkillType;
       264: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
       267: dup
       268: ldc_w         #465                // String CANCEL_MAGIC
       271: bipush        18
       273: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
       276: putstatic     #58                 // Field CANCEL_MAGIC:Lext/mods/gameserver/enums/actors/NpcSkillType;
       279: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
       282: dup
       283: ldc_w         #466                // String CAPTURE_CANCEL_A
       286: bipush        19
       288: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
       291: putstatic     #61                 // Field CAPTURE_CANCEL_A:Lext/mods/gameserver/enums/actors/NpcSkillType;
       294: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
       297: dup
       298: ldc_w         #467                // String CAPTURE_CANCEL_B
       301: bipush        20
       303: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
       306: putstatic     #64                 // Field CAPTURE_CANCEL_B:Lext/mods/gameserver/enums/actors/NpcSkillType;
       309: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
       312: dup
       313: ldc_w         #468                // String CAPTURE_CANCEL_C
       316: bipush        21
       318: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
       321: putstatic     #67                 // Field CAPTURE_CANCEL_C:Lext/mods/gameserver/enums/actors/NpcSkillType;
       324: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
       327: dup
       328: ldc_w         #469                // String CAPTURE_CANCEL_ALL
       331: bipush        22
       333: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
       336: putstatic     #70                 // Field CAPTURE_CANCEL_ALL:Lext/mods/gameserver/enums/actors/NpcSkillType;
       339: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
       342: dup
       343: ldc_w         #470                // String CHECK_MAGIC
       346: bipush        23
       348: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
       351: putstatic     #73                 // Field CHECK_MAGIC:Lext/mods/gameserver/enums/actors/NpcSkillType;
       354: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
       357: dup
       358: ldc_w         #471                // String CHECK_MAGIC1
       361: bipush        24
       363: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
       366: putstatic     #76                 // Field CHECK_MAGIC1:Lext/mods/gameserver/enums/actors/NpcSkillType;
       369: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
       372: dup
       373: ldc_w         #472                // String CHECK_MAGIC2
       376: bipush        25
       378: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
       381: putstatic     #79                 // Field CHECK_MAGIC2:Lext/mods/gameserver/enums/actors/NpcSkillType;
       384: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
       387: dup
       388: ldc_w         #473                // String CHECK_SKILL1
       391: bipush        26
       393: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
       396: putstatic     #82                 // Field CHECK_SKILL1:Lext/mods/gameserver/enums/actors/NpcSkillType;
       399: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
       402: dup
       403: ldc_w         #474                // String CHECK_SKILL2
       406: bipush        27
       408: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
       411: putstatic     #85                 // Field CHECK_SKILL2:Lext/mods/gameserver/enums/actors/NpcSkillType;
       414: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
       417: dup
       418: ldc_w         #475                // String CLAN_BUF1
       421: bipush        28
       423: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
       426: putstatic     #88                 // Field CLAN_BUF1:Lext/mods/gameserver/enums/actors/NpcSkillType;
       429: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
       432: dup
       433: ldc_w         #476                // String CLAN_BUFF1
       436: bipush        29
       438: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
       441: putstatic     #91                 // Field CLAN_BUFF1:Lext/mods/gameserver/enums/actors/NpcSkillType;
       444: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
       447: dup
       448: ldc_w         #477                // String CLEAR_CORPSE
       451: bipush        30
       453: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
       456: putstatic     #94                 // Field CLEAR_CORPSE:Lext/mods/gameserver/enums/actors/NpcSkillType;
       459: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
       462: dup
       463: ldc_w         #478                // String CRAZY_MODE
       466: bipush        31
       468: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
       471: putstatic     #97                 // Field CRAZY_MODE:Lext/mods/gameserver/enums/actors/NpcSkillType;
       474: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
       477: dup
       478: ldc_w         #479                // String DD_MAGIC
       481: bipush        32
       483: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
       486: putstatic     #100                // Field DD_MAGIC:Lext/mods/gameserver/enums/actors/NpcSkillType;
       489: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
       492: dup
       493: ldc_w         #480                // String DD_MAGIC1
       496: bipush        33
       498: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
       501: putstatic     #103                // Field DD_MAGIC1:Lext/mods/gameserver/enums/actors/NpcSkillType;
       504: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
       507: dup
       508: ldc_w         #481                // String DD_MAGIC2
       511: bipush        34
       513: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
       516: putstatic     #106                // Field DD_MAGIC2:Lext/mods/gameserver/enums/actors/NpcSkillType;
       519: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
       522: dup
       523: ldc_w         #482                // String DD_MAGIC3
       526: bipush        35
       528: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
       531: putstatic     #109                // Field DD_MAGIC3:Lext/mods/gameserver/enums/actors/NpcSkillType;
       534: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
       537: dup
       538: ldc_w         #483                // String DD_MAGIC_SLOW
       541: bipush        36
       543: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
       546: putstatic     #112                // Field DD_MAGIC_SLOW:Lext/mods/gameserver/enums/actors/NpcSkillType;
       549: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
       552: dup
       553: ldc_w         #484                // String DD_MAGIC_A
       556: bipush        37
       558: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
       561: putstatic     #115                // Field DD_MAGIC_A:Lext/mods/gameserver/enums/actors/NpcSkillType;
       564: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
       567: dup
       568: ldc_w         #485                // String DD_PHYSIC1
       571: bipush        38
       573: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
       576: putstatic     #118                // Field DD_PHYSIC1:Lext/mods/gameserver/enums/actors/NpcSkillType;
       579: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
       582: dup
       583: ldc_w         #486                // String DD_PHYSIC2
       586: bipush        39
       588: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
       591: putstatic     #121                // Field DD_PHYSIC2:Lext/mods/gameserver/enums/actors/NpcSkillType;
       594: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
       597: dup
       598: ldc_w         #487                // String DD_PHYSIC3
       601: bipush        40
       603: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
       606: putstatic     #124                // Field DD_PHYSIC3:Lext/mods/gameserver/enums/actors/NpcSkillType;
       609: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
       612: dup
       613: ldc_w         #488                // String DEBUFF
       616: bipush        41
       618: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
       621: putstatic     #127                // Field DEBUFF:Lext/mods/gameserver/enums/actors/NpcSkillType;
       624: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
       627: dup
       628: ldc_w         #489                // String DEBUFF_A
       631: bipush        42
       633: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
       636: putstatic     #130                // Field DEBUFF_A:Lext/mods/gameserver/enums/actors/NpcSkillType;
       639: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
       642: dup
       643: ldc_w         #490                // String DEFENCE_MODE
       646: bipush        43
       648: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
       651: putstatic     #133                // Field DEFENCE_MODE:Lext/mods/gameserver/enums/actors/NpcSkillType;
       654: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
       657: dup
       658: ldc_w         #491                // String DEBUFF1
       661: bipush        44
       663: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
       666: putstatic     #136                // Field DEBUFF1:Lext/mods/gameserver/enums/actors/NpcSkillType;
       669: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
       672: dup
       673: ldc_w         #492                // String DEBUFF1_CANCEL
       676: bipush        45
       678: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
       681: putstatic     #139                // Field DEBUFF1_CANCEL:Lext/mods/gameserver/enums/actors/NpcSkillType;
       684: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
       687: dup
       688: ldc_w         #493                // String DEBUFF2
       691: bipush        46
       693: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
       696: putstatic     #142                // Field DEBUFF2:Lext/mods/gameserver/enums/actors/NpcSkillType;
       699: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
       702: dup
       703: ldc_w         #494                // String DEBUFF2_CANCEL
       706: bipush        47
       708: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
       711: putstatic     #145                // Field DEBUFF2_CANCEL:Lext/mods/gameserver/enums/actors/NpcSkillType;
       714: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
       717: dup
       718: ldc_w         #495                // String DEBUFF3
       721: bipush        48
       723: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
       726: putstatic     #148                // Field DEBUFF3:Lext/mods/gameserver/enums/actors/NpcSkillType;
       729: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
       732: dup
       733: ldc_w         #496                // String DEBUFF_CANCEL
       736: bipush        49
       738: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
       741: putstatic     #151                // Field DEBUFF_CANCEL:Lext/mods/gameserver/enums/actors/NpcSkillType;
       744: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
       747: dup
       748: ldc_w         #497                // String DISPELL
       751: bipush        50
       753: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
       756: putstatic     #154                // Field DISPELL:Lext/mods/gameserver/enums/actors/NpcSkillType;
       759: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
       762: dup
       763: ldc_w         #498                // String DEBUFF4
       766: bipush        51
       768: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
       771: putstatic     #157                // Field DEBUFF4:Lext/mods/gameserver/enums/actors/NpcSkillType;
       774: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
       777: dup
       778: ldc_w         #499                // String DEBUFF5
       781: bipush        52
       783: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
       786: putstatic     #160                // Field DEBUFF5:Lext/mods/gameserver/enums/actors/NpcSkillType;
       789: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
       792: dup
       793: ldc_w         #500                // String EFFECT_SKILL
       796: bipush        53
       798: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
       801: putstatic     #163                // Field EFFECT_SKILL:Lext/mods/gameserver/enums/actors/NpcSkillType;
       804: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
       807: dup
       808: ldc_w         #501                // String EFFECT_SKILL2
       811: bipush        54
       813: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
       816: putstatic     #166                // Field EFFECT_SKILL2:Lext/mods/gameserver/enums/actors/NpcSkillType;
       819: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
       822: dup
       823: ldc_w         #502                // String FURY
       826: bipush        55
       828: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
       831: putstatic     #169                // Field FURY:Lext/mods/gameserver/enums/actors/NpcSkillType;
       834: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
       837: dup
       838: ldc_w         #503                // String HEAL
       841: bipush        56
       843: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
       846: putstatic     #172                // Field HEAL:Lext/mods/gameserver/enums/actors/NpcSkillType;
       849: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
       852: dup
       853: ldc_w         #504                // String HEAL1
       856: bipush        57
       858: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
       861: putstatic     #175                // Field HEAL1:Lext/mods/gameserver/enums/actors/NpcSkillType;
       864: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
       867: dup
       868: ldc_w         #505                // String HEAL2
       871: bipush        58
       873: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
       876: putstatic     #178                // Field HEAL2:Lext/mods/gameserver/enums/actors/NpcSkillType;
       879: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
       882: dup
       883: ldc_w         #506                // String HEAL_MAGIC
       886: bipush        59
       888: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
       891: putstatic     #181                // Field HEAL_MAGIC:Lext/mods/gameserver/enums/actors/NpcSkillType;
       894: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
       897: dup
       898: ldc_w         #507                // String HEAL_MAGIC_A
       901: bipush        60
       903: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
       906: putstatic     #184                // Field HEAL_MAGIC_A:Lext/mods/gameserver/enums/actors/NpcSkillType;
       909: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
       912: dup
       913: ldc_w         #508                // String HERO_SKILL
       916: bipush        61
       918: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
       921: putstatic     #187                // Field HERO_SKILL:Lext/mods/gameserver/enums/actors/NpcSkillType;
       924: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
       927: dup
       928: ldc_w         #509                // String HOLD_MAGIC
       931: bipush        62
       933: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
       936: putstatic     #190                // Field HOLD_MAGIC:Lext/mods/gameserver/enums/actors/NpcSkillType;
       939: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
       942: dup
       943: ldc_w         #510                // String LONG_RANGE_DD_MAGIC1
       946: bipush        63
       948: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
       951: putstatic     #193                // Field LONG_RANGE_DD_MAGIC1:Lext/mods/gameserver/enums/actors/NpcSkillType;
       954: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
       957: dup
       958: ldc_w         #511                // String LONG_RANGE_PHYSICAL_SPECIAL
       961: bipush        64
       963: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
       966: putstatic     #196                // Field LONG_RANGE_PHYSICAL_SPECIAL:Lext/mods/gameserver/enums/actors/NpcSkillType;
       969: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
       972: dup
       973: ldc_w         #512                // String LONG_RANGE_PHYSICAL_SPECIAL_A
       976: bipush        65
       978: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
       981: putstatic     #199                // Field LONG_RANGE_PHYSICAL_SPECIAL_A:Lext/mods/gameserver/enums/actors/NpcSkillType;
       984: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
       987: dup
       988: ldc_w         #513                // String MAGIC_HEAL
       991: bipush        66
       993: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
       996: putstatic     #202                // Field MAGIC_HEAL:Lext/mods/gameserver/enums/actors/NpcSkillType;
       999: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      1002: dup
      1003: ldc_w         #514                // String MAGIC_SLEEP
      1006: bipush        67
      1008: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      1011: putstatic     #205                // Field MAGIC_SLEEP:Lext/mods/gameserver/enums/actors/NpcSkillType;
      1014: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      1017: dup
      1018: ldc_w         #515                // String MOB_HATE
      1021: bipush        68
      1023: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      1026: putstatic     #208                // Field MOB_HATE:Lext/mods/gameserver/enums/actors/NpcSkillType;
      1029: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      1032: dup
      1033: ldc_w         #516                // String NORMAL_BODY_SKILL
      1036: bipush        69
      1038: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      1041: putstatic     #211                // Field NORMAL_BODY_SKILL:Lext/mods/gameserver/enums/actors/NpcSkillType;
      1044: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      1047: dup
      1048: ldc_w         #517                // String PHYSICAL_SPECIAL
      1051: bipush        70
      1053: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      1056: putstatic     #214                // Field PHYSICAL_SPECIAL:Lext/mods/gameserver/enums/actors/NpcSkillType;
      1059: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      1062: dup
      1063: ldc_w         #518                // String PHYSICAL_SPECIAL1
      1066: bipush        71
      1068: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      1071: putstatic     #217                // Field PHYSICAL_SPECIAL1:Lext/mods/gameserver/enums/actors/NpcSkillType;
      1074: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      1077: dup
      1078: ldc_w         #519                // String PHYSICAL_SPECIAL2
      1081: bipush        72
      1083: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      1086: putstatic     #220                // Field PHYSICAL_SPECIAL2:Lext/mods/gameserver/enums/actors/NpcSkillType;
      1089: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      1092: dup
      1093: ldc_w         #520                // String PHYSICAL_SPECIAL3
      1096: bipush        73
      1098: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      1101: putstatic     #223                // Field PHYSICAL_SPECIAL3:Lext/mods/gameserver/enums/actors/NpcSkillType;
      1104: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      1107: dup
      1108: ldc_w         #521                // String PHYSICAL_SPECIAL_RANGE
      1111: bipush        74
      1113: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      1116: putstatic     #226                // Field PHYSICAL_SPECIAL_RANGE:Lext/mods/gameserver/enums/actors/NpcSkillType;
      1119: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      1122: dup
      1123: ldc_w         #522                // String PHYSICAL_SPECIAL_A
      1126: bipush        75
      1128: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      1131: putstatic     #229                // Field PHYSICAL_SPECIAL_A:Lext/mods/gameserver/enums/actors/NpcSkillType;
      1134: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      1137: dup
      1138: ldc_w         #523                // String PHYSICAL_SPECIAL_B
      1141: bipush        76
      1143: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      1146: putstatic     #232                // Field PHYSICAL_SPECIAL_B:Lext/mods/gameserver/enums/actors/NpcSkillType;
      1149: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      1152: dup
      1153: ldc_w         #524                // String RANGE_BUFF
      1156: bipush        77
      1158: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      1161: putstatic     #235                // Field RANGE_BUFF:Lext/mods/gameserver/enums/actors/NpcSkillType;
      1164: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      1167: dup
      1168: ldc_w         #525                // String RANGE_DD
      1171: bipush        78
      1173: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      1176: putstatic     #238                // Field RANGE_DD:Lext/mods/gameserver/enums/actors/NpcSkillType;
      1179: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      1182: dup
      1183: ldc_w         #526                // String RANGE_DD_MAGIC1
      1186: bipush        79
      1188: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      1191: putstatic     #241                // Field RANGE_DD_MAGIC1:Lext/mods/gameserver/enums/actors/NpcSkillType;
      1194: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      1197: dup
      1198: ldc_w         #527                // String RANGE_DD_MAGIC_A
      1201: bipush        80
      1203: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      1206: putstatic     #244                // Field RANGE_DD_MAGIC_A:Lext/mods/gameserver/enums/actors/NpcSkillType;
      1209: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      1212: dup
      1213: ldc_w         #528                // String RANGE_DEBUFF
      1216: bipush        81
      1218: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      1221: putstatic     #247                // Field RANGE_DEBUFF:Lext/mods/gameserver/enums/actors/NpcSkillType;
      1224: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      1227: dup
      1228: ldc_w         #529                // String RANGE_HOLD_A
      1231: bipush        82
      1233: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      1236: putstatic     #250                // Field RANGE_HOLD_A:Lext/mods/gameserver/enums/actors/NpcSkillType;
      1239: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      1242: dup
      1243: ldc_w         #530                // String RANGE_PHYSICAL_SPECIAL
      1246: bipush        83
      1248: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      1251: putstatic     #253                // Field RANGE_PHYSICAL_SPECIAL:Lext/mods/gameserver/enums/actors/NpcSkillType;
      1254: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      1257: dup
      1258: ldc_w         #531                // String SELF_BUFF
      1261: bipush        84
      1263: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      1266: putstatic     #256                // Field SELF_BUFF:Lext/mods/gameserver/enums/actors/NpcSkillType;
      1269: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      1272: dup
      1273: ldc_w         #532                // String SELF_BUFF1
      1276: bipush        85
      1278: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      1281: putstatic     #259                // Field SELF_BUFF1:Lext/mods/gameserver/enums/actors/NpcSkillType;
      1284: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      1287: dup
      1288: ldc_w         #533                // String SELF_BUFF2
      1291: bipush        86
      1293: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      1296: putstatic     #262                // Field SELF_BUFF2:Lext/mods/gameserver/enums/actors/NpcSkillType;
      1299: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      1302: dup
      1303: ldc_w         #534                // String SELF_BUFF3
      1306: bipush        87
      1308: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      1311: putstatic     #265                // Field SELF_BUFF3:Lext/mods/gameserver/enums/actors/NpcSkillType;
      1314: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      1317: dup
      1318: ldc_w         #535                // String SELF_BUFF4
      1321: bipush        88
      1323: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      1326: putstatic     #268                // Field SELF_BUFF4:Lext/mods/gameserver/enums/actors/NpcSkillType;
      1329: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      1332: dup
      1333: ldc_w         #536                // String SELF_BUFF_A
      1336: bipush        89
      1338: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      1341: putstatic     #271                // Field SELF_BUFF_A:Lext/mods/gameserver/enums/actors/NpcSkillType;
      1344: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      1347: dup
      1348: ldc_w         #537                // String SELF_DEBUFF1
      1351: bipush        90
      1353: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      1356: putstatic     #274                // Field SELF_DEBUFF1:Lext/mods/gameserver/enums/actors/NpcSkillType;
      1359: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      1362: dup
      1363: ldc_w         #538                // String SELF_DEBUFF2
      1366: bipush        91
      1368: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      1371: putstatic     #277                // Field SELF_DEBUFF2:Lext/mods/gameserver/enums/actors/NpcSkillType;
      1374: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      1377: dup
      1378: ldc_w         #539                // String SELF_DEBUFF3
      1381: bipush        92
      1383: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      1386: putstatic     #280                // Field SELF_DEBUFF3:Lext/mods/gameserver/enums/actors/NpcSkillType;
      1389: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      1392: dup
      1393: ldc_w         #540                // String SELF_EXPLOSION
      1396: bipush        93
      1398: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      1401: putstatic     #283                // Field SELF_EXPLOSION:Lext/mods/gameserver/enums/actors/NpcSkillType;
      1404: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      1407: dup
      1408: ldc_w         #541                // String SELF_MAGIC_HEAL
      1411: bipush        94
      1413: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      1416: putstatic     #286                // Field SELF_MAGIC_HEAL:Lext/mods/gameserver/enums/actors/NpcSkillType;
      1419: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      1422: dup
      1423: ldc_w         #542                // String SELF_RANGE_BUFF
      1426: bipush        95
      1428: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      1431: putstatic     #289                // Field SELF_RANGE_BUFF:Lext/mods/gameserver/enums/actors/NpcSkillType;
      1434: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      1437: dup
      1438: ldc_w         #543                // String SELF_RANGE_BUFF1
      1441: bipush        96
      1443: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      1446: putstatic     #292                // Field SELF_RANGE_BUFF1:Lext/mods/gameserver/enums/actors/NpcSkillType;
      1449: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      1452: dup
      1453: ldc_w         #544                // String SELF_RANGE_BUFF_A
      1456: bipush        97
      1458: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      1461: putstatic     #295                // Field SELF_RANGE_BUFF_A:Lext/mods/gameserver/enums/actors/NpcSkillType;
      1464: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      1467: dup
      1468: ldc_w         #545                // String SELF_RANGE_CANCEL_A
      1471: bipush        98
      1473: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      1476: putstatic     #298                // Field SELF_RANGE_CANCEL_A:Lext/mods/gameserver/enums/actors/NpcSkillType;
      1479: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      1482: dup
      1483: ldc_w         #546                // String SELF_RANGE_CANCEL_A1
      1486: bipush        99
      1488: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      1491: putstatic     #301                // Field SELF_RANGE_CANCEL_A1:Lext/mods/gameserver/enums/actors/NpcSkillType;
      1494: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      1497: dup
      1498: ldc_w         #547                // String SELF_RANGE_CANCEL_A2
      1501: bipush        100
      1503: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      1506: putstatic     #304                // Field SELF_RANGE_CANCEL_A2:Lext/mods/gameserver/enums/actors/NpcSkillType;
      1509: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      1512: dup
      1513: ldc_w         #548                // String SELF_RANGE_DD_MAGIC
      1516: bipush        101
      1518: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      1521: putstatic     #307                // Field SELF_RANGE_DD_MAGIC:Lext/mods/gameserver/enums/actors/NpcSkillType;
      1524: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      1527: dup
      1528: ldc_w         #549                // String SELF_RANGE_DD_MAGIC1
      1531: bipush        102
      1533: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      1536: putstatic     #310                // Field SELF_RANGE_DD_MAGIC1:Lext/mods/gameserver/enums/actors/NpcSkillType;
      1539: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      1542: dup
      1543: ldc_w         #550                // String SELF_RANGE_DD_MAGIC2
      1546: bipush        103
      1548: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      1551: putstatic     #313                // Field SELF_RANGE_DD_MAGIC2:Lext/mods/gameserver/enums/actors/NpcSkillType;
      1554: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      1557: dup
      1558: ldc_w         #551                // String SELF_RANGE_DD_MAGIC3
      1561: bipush        104
      1563: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      1566: putstatic     #316                // Field SELF_RANGE_DD_MAGIC3:Lext/mods/gameserver/enums/actors/NpcSkillType;
      1569: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      1572: dup
      1573: ldc_w         #552                // String SELF_RANGE_DEBUFF
      1576: bipush        105
      1578: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      1581: putstatic     #319                // Field SELF_RANGE_DEBUFF:Lext/mods/gameserver/enums/actors/NpcSkillType;
      1584: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      1587: dup
      1588: ldc_w         #553                // String SELF_RANGE_DEBUFF1
      1591: bipush        106
      1593: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      1596: putstatic     #322                // Field SELF_RANGE_DEBUFF1:Lext/mods/gameserver/enums/actors/NpcSkillType;
      1599: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      1602: dup
      1603: ldc_w         #554                // String SELF_RANGE_DEBUFF_ANOTHER_A
      1606: bipush        107
      1608: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      1611: putstatic     #325                // Field SELF_RANGE_DEBUFF_ANOTHER_A:Lext/mods/gameserver/enums/actors/NpcSkillType;
      1614: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      1617: dup
      1618: ldc_w         #555                // String SELF_RANGE_DEBUFF_A
      1621: bipush        108
      1623: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      1626: putstatic     #328                // Field SELF_RANGE_DEBUFF_A:Lext/mods/gameserver/enums/actors/NpcSkillType;
      1629: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      1632: dup
      1633: ldc_w         #556                // String SELF_RANGE_PHYSICAL_SPECIAL
      1636: bipush        109
      1638: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      1641: putstatic     #331                // Field SELF_RANGE_PHYSICAL_SPECIAL:Lext/mods/gameserver/enums/actors/NpcSkillType;
      1644: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      1647: dup
      1648: ldc_w         #557                // String SELF_RANGE_PHYSICAL_SPECIAL_A
      1651: bipush        110
      1653: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      1656: putstatic     #334                // Field SELF_RANGE_PHYSICAL_SPECIAL_A:Lext/mods/gameserver/enums/actors/NpcSkillType;
      1659: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      1662: dup
      1663: ldc_w         #558                // String SET_CURSE
      1666: bipush        111
      1668: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      1671: putstatic     #337                // Field SET_CURSE:Lext/mods/gameserver/enums/actors/NpcSkillType;
      1674: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      1677: dup
      1678: ldc_w         #559                // String SKILL01_ID
      1681: bipush        112
      1683: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      1686: putstatic     #340                // Field SKILL01_ID:Lext/mods/gameserver/enums/actors/NpcSkillType;
      1689: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      1692: dup
      1693: ldc_w         #560                // String SKILL02_ID
      1696: bipush        113
      1698: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      1701: putstatic     #343                // Field SKILL02_ID:Lext/mods/gameserver/enums/actors/NpcSkillType;
      1704: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      1707: dup
      1708: ldc_w         #561                // String SKILL03_ID
      1711: bipush        114
      1713: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      1716: putstatic     #346                // Field SKILL03_ID:Lext/mods/gameserver/enums/actors/NpcSkillType;
      1719: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      1722: dup
      1723: ldc_w         #562                // String SKILL04_ID
      1726: bipush        115
      1728: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      1731: putstatic     #349                // Field SKILL04_ID:Lext/mods/gameserver/enums/actors/NpcSkillType;
      1734: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      1737: dup
      1738: ldc_w         #563                // String SKILL05_ID
      1741: bipush        116
      1743: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      1746: putstatic     #352                // Field SKILL05_ID:Lext/mods/gameserver/enums/actors/NpcSkillType;
      1749: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      1752: dup
      1753: ldc_w         #564                // String SKILL06_ID
      1756: bipush        117
      1758: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      1761: putstatic     #355                // Field SKILL06_ID:Lext/mods/gameserver/enums/actors/NpcSkillType;
      1764: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      1767: dup
      1768: ldc_w         #565                // String SLEEP_MAGIC
      1771: bipush        118
      1773: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      1776: putstatic     #358                // Field SLEEP_MAGIC:Lext/mods/gameserver/enums/actors/NpcSkillType;
      1779: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      1782: dup
      1783: ldc_w         #566                // String SPECIAL_ATTACK
      1786: bipush        119
      1788: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      1791: putstatic     #361                // Field SPECIAL_ATTACK:Lext/mods/gameserver/enums/actors/NpcSkillType;
      1794: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      1797: dup
      1798: ldc_w         #567                // String SPECIAL_SKILL
      1801: bipush        120
      1803: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      1806: putstatic     #364                // Field SPECIAL_SKILL:Lext/mods/gameserver/enums/actors/NpcSkillType;
      1809: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      1812: dup
      1813: ldc_w         #568                // String STATUS_EFFECT
      1816: bipush        121
      1818: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      1821: putstatic     #367                // Field STATUS_EFFECT:Lext/mods/gameserver/enums/actors/NpcSkillType;
      1824: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      1827: dup
      1828: ldc_w         #569                // String SUMMON_EFFECT
      1831: bipush        122
      1833: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      1836: putstatic     #370                // Field SUMMON_EFFECT:Lext/mods/gameserver/enums/actors/NpcSkillType;
      1839: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      1842: dup
      1843: ldc_w         #570                // String SUMMON_HEAL1
      1846: bipush        123
      1848: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      1851: putstatic     #373                // Field SUMMON_HEAL1:Lext/mods/gameserver/enums/actors/NpcSkillType;
      1854: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      1857: dup
      1858: ldc_w         #571                // String SUMMON_HEAL2
      1861: bipush        124
      1863: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      1866: putstatic     #376                // Field SUMMON_HEAL2:Lext/mods/gameserver/enums/actors/NpcSkillType;
      1869: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      1872: dup
      1873: ldc_w         #572                // String SUMMON_MAGIC
      1876: bipush        125
      1878: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      1881: putstatic     #379                // Field SUMMON_MAGIC:Lext/mods/gameserver/enums/actors/NpcSkillType;
      1884: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      1887: dup
      1888: ldc_w         #573                // String SUMMON_MODE
      1891: bipush        126
      1893: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      1896: putstatic     #382                // Field SUMMON_MODE:Lext/mods/gameserver/enums/actors/NpcSkillType;
      1899: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      1902: dup
      1903: ldc_w         #574                // String TELEPORT_EFFECT
      1906: bipush        127
      1908: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      1911: putstatic     #385                // Field TELEPORT_EFFECT:Lext/mods/gameserver/enums/actors/NpcSkillType;
      1914: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      1917: dup
      1918: ldc_w         #575                // String WEAK_MODE_FALSE
      1921: sipush        128
      1924: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      1927: putstatic     #388                // Field WEAK_MODE_FALSE:Lext/mods/gameserver/enums/actors/NpcSkillType;
      1930: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      1933: dup
      1934: ldc_w         #576                // String WEAK_MODE_TRUE
      1937: sipush        129
      1940: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      1943: putstatic     #391                // Field WEAK_MODE_TRUE:Lext/mods/gameserver/enums/actors/NpcSkillType;
      1946: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      1949: dup
      1950: ldc_w         #577                // String W_CLAN_BUFF
      1953: sipush        130
      1956: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      1959: putstatic     #394                // Field W_CLAN_BUFF:Lext/mods/gameserver/enums/actors/NpcSkillType;
      1962: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      1965: dup
      1966: ldc_w         #578                // String W_FIEND_ARCHER
      1969: sipush        131
      1972: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      1975: putstatic     #397                // Field W_FIEND_ARCHER:Lext/mods/gameserver/enums/actors/NpcSkillType;
      1978: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      1981: dup
      1982: ldc_w         #579                // String W_LONG_RANGE_DD_MAGIC
      1985: sipush        132
      1988: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      1991: putstatic     #400                // Field W_LONG_RANGE_DD_MAGIC:Lext/mods/gameserver/enums/actors/NpcSkillType;
      1994: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      1997: dup
      1998: ldc_w         #580                // String W_LONG_RANGE_DD_MAGIC1
      2001: sipush        133
      2004: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      2007: putstatic     #403                // Field W_LONG_RANGE_DD_MAGIC1:Lext/mods/gameserver/enums/actors/NpcSkillType;
      2010: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      2013: dup
      2014: ldc_w         #581                // String W_LONG_RANGE_DD_MAGIC2
      2017: sipush        134
      2020: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      2023: putstatic     #406                // Field W_LONG_RANGE_DD_MAGIC2:Lext/mods/gameserver/enums/actors/NpcSkillType;
      2026: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      2029: dup
      2030: ldc_w         #582                // String W_MIDDLE_RANGE_DD_MAGIC
      2033: sipush        135
      2036: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      2039: putstatic     #409                // Field W_MIDDLE_RANGE_DD_MAGIC:Lext/mods/gameserver/enums/actors/NpcSkillType;
      2042: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      2045: dup
      2046: ldc_w         #583                // String W_RANGE_DEBUFF
      2049: sipush        136
      2052: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      2055: putstatic     #412                // Field W_RANGE_DEBUFF:Lext/mods/gameserver/enums/actors/NpcSkillType;
      2058: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      2061: dup
      2062: ldc_w         #584                // String W_RANGE_HEAL
      2065: sipush        137
      2068: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      2071: putstatic     #415                // Field W_RANGE_HEAL:Lext/mods/gameserver/enums/actors/NpcSkillType;
      2074: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      2077: dup
      2078: ldc_w         #585                // String W_SELF_RANGE_DD_MAGIC
      2081: sipush        138
      2084: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      2087: putstatic     #418                // Field W_SELF_RANGE_DD_MAGIC:Lext/mods/gameserver/enums/actors/NpcSkillType;
      2090: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      2093: dup
      2094: ldc_w         #586                // String W_SELF_RANGE_DEBUFF
      2097: sipush        139
      2100: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      2103: putstatic     #421                // Field W_SELF_RANGE_DEBUFF:Lext/mods/gameserver/enums/actors/NpcSkillType;
      2106: new           #1                  // class ext/mods/gameserver/enums/actors/NpcSkillType
      2109: dup
      2110: ldc_w         #587                // String W_SHORT_RANGE_DD_MAGIC
      2113: sipush        140
      2116: invokespecial #447                // Method "<init>":(Ljava/lang/String;I)V
      2119: putstatic     #424                // Field W_SHORT_RANGE_DD_MAGIC:Lext/mods/gameserver/enums/actors/NpcSkillType;
      2122: invokestatic  #588                // Method $values:()[Lext/mods/gameserver/enums/actors/NpcSkillType;
      2125: putstatic     #427                // Field $VALUES:[Lext/mods/gameserver/enums/actors/NpcSkillType;
      2128: return
      LineNumberTable:
        line 22: 0
        line 23: 14
        line 24: 28
        line 25: 42
        line 26: 56
        line 27: 70
        line 28: 84
        line 29: 99
        line 30: 114
        line 31: 129
        line 32: 144
        line 33: 159
        line 34: 174
        line 35: 189
        line 36: 204
        line 37: 219
        line 38: 234
        line 39: 249
        line 40: 264
        line 41: 279
        line 42: 294
        line 43: 309
        line 44: 324
        line 45: 339
        line 46: 354
        line 47: 369
        line 48: 384
        line 49: 399
        line 50: 414
        line 51: 429
        line 52: 444
        line 53: 459
        line 54: 474
        line 55: 489
        line 56: 504
        line 57: 519
        line 58: 534
        line 59: 549
        line 60: 564
        line 61: 579
        line 62: 594
        line 63: 609
        line 64: 624
        line 65: 639
        line 66: 654
        line 67: 669
        line 68: 684
        line 69: 699
        line 70: 714
        line 71: 729
        line 72: 744
        line 73: 759
        line 74: 774
        line 75: 789
        line 76: 804
        line 77: 819
        line 78: 834
        line 79: 849
        line 80: 864
        line 81: 879
        line 82: 894
        line 83: 909
        line 84: 924
        line 85: 939
        line 86: 954
        line 87: 969
        line 88: 984
        line 89: 999
        line 90: 1014
        line 91: 1029
        line 92: 1044
        line 93: 1059
        line 94: 1074
        line 95: 1089
        line 96: 1104
        line 97: 1119
        line 98: 1134
        line 99: 1149
        line 100: 1164
        line 101: 1179
        line 102: 1194
        line 103: 1209
        line 104: 1224
        line 105: 1239
        line 106: 1254
        line 107: 1269
        line 108: 1284
        line 109: 1299
        line 110: 1314
        line 111: 1329
        line 112: 1344
        line 113: 1359
        line 114: 1374
        line 115: 1389
        line 116: 1404
        line 117: 1419
        line 118: 1434
        line 119: 1449
        line 120: 1464
        line 121: 1479
        line 122: 1494
        line 123: 1509
        line 124: 1524
        line 125: 1539
        line 126: 1554
        line 127: 1569
        line 128: 1584
        line 129: 1599
        line 130: 1614
        line 131: 1629
        line 132: 1644
        line 133: 1659
        line 134: 1674
        line 135: 1689
        line 136: 1704
        line 137: 1719
        line 138: 1734
        line 139: 1749
        line 140: 1764
        line 141: 1779
        line 142: 1794
        line 143: 1809
        line 144: 1824
        line 145: 1839
        line 146: 1854
        line 147: 1869
        line 148: 1884
        line 149: 1899
        line 150: 1914
        line 151: 1930
        line 152: 1946
        line 153: 1962
        line 154: 1978
        line 155: 1994
        line 156: 2010
        line 157: 2026
        line 158: 2042
        line 159: 2058
        line 160: 2074
        line 161: 2090
        line 162: 2106
        line 20: 2122
}
Signature: #604                         // Ljava/lang/Enum<Lext/mods/gameserver/enums/actors/NpcSkillType;>;
SourceFile: "NpcSkillType.java"
