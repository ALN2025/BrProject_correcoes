// Bytecode for: ext.mods.gameserver.enums.skills.EffectType
// File: ext\mods\gameserver\enums\skills\EffectType.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/enums/skills/EffectType.class
  Last modified 9 de jul de 2026; size 4310 bytes
  MD5 checksum 90c245a5bace2813a7de1bfc90e20098
  Compiled from "EffectType.java"
public final class ext.mods.gameserver.enums.skills.EffectType extends java.lang.Enum<ext.mods.gameserver.enums.skills.EffectType>
  minor version: 0
  major version: 69
  flags: (0x4031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER, ACC_ENUM
  this_class: #1                          // ext/mods/gameserver/enums/skills/EffectType
  super_class: #167                       // java/lang/Enum
  interfaces: 0, fields: 52, methods: 6, attributes: 2
Constant pool:
    #1 = Class              #2            // ext/mods/gameserver/enums/skills/EffectType
    #2 = Utf8               ext/mods/gameserver/enums/skills/EffectType
    #3 = Fieldref           #1.#4         // ext/mods/gameserver/enums/skills/EffectType.BLOCK_BUFF:Lext/mods/gameserver/enums/skills/EffectType;
    #4 = NameAndType        #5:#6         // BLOCK_BUFF:Lext/mods/gameserver/enums/skills/EffectType;
    #5 = Utf8               BLOCK_BUFF
    #6 = Utf8               Lext/mods/gameserver/enums/skills/EffectType;
    #7 = Fieldref           #1.#8         // ext/mods/gameserver/enums/skills/EffectType.BLOCK_DEBUFF:Lext/mods/gameserver/enums/skills/EffectType;
    #8 = NameAndType        #9:#6         // BLOCK_DEBUFF:Lext/mods/gameserver/enums/skills/EffectType;
    #9 = Utf8               BLOCK_DEBUFF
   #10 = Fieldref           #1.#11        // ext/mods/gameserver/enums/skills/EffectType.BUFF:Lext/mods/gameserver/enums/skills/EffectType;
   #11 = NameAndType        #12:#6        // BUFF:Lext/mods/gameserver/enums/skills/EffectType;
   #12 = Utf8               BUFF
   #13 = Fieldref           #1.#14        // ext/mods/gameserver/enums/skills/EffectType.DEBUFF:Lext/mods/gameserver/enums/skills/EffectType;
   #14 = NameAndType        #15:#6        // DEBUFF:Lext/mods/gameserver/enums/skills/EffectType;
   #15 = Utf8               DEBUFF
   #16 = Fieldref           #1.#17        // ext/mods/gameserver/enums/skills/EffectType.CANCEL:Lext/mods/gameserver/enums/skills/EffectType;
   #17 = NameAndType        #18:#6        // CANCEL:Lext/mods/gameserver/enums/skills/EffectType;
   #18 = Utf8               CANCEL
   #19 = Fieldref           #1.#20        // ext/mods/gameserver/enums/skills/EffectType.CANCEL_DEBUFF:Lext/mods/gameserver/enums/skills/EffectType;
   #20 = NameAndType        #21:#6        // CANCEL_DEBUFF:Lext/mods/gameserver/enums/skills/EffectType;
   #21 = Utf8               CANCEL_DEBUFF
   #22 = Fieldref           #1.#23        // ext/mods/gameserver/enums/skills/EffectType.NEGATE:Lext/mods/gameserver/enums/skills/EffectType;
   #23 = NameAndType        #24:#6        // NEGATE:Lext/mods/gameserver/enums/skills/EffectType;
   #24 = Utf8               NEGATE
   #25 = Fieldref           #1.#26        // ext/mods/gameserver/enums/skills/EffectType.CLAN_GATE:Lext/mods/gameserver/enums/skills/EffectType;
   #26 = NameAndType        #27:#6        // CLAN_GATE:Lext/mods/gameserver/enums/skills/EffectType;
   #27 = Utf8               CLAN_GATE
   #28 = Fieldref           #1.#29        // ext/mods/gameserver/enums/skills/EffectType.CHANCE_SKILL_TRIGGER:Lext/mods/gameserver/enums/skills/EffectType;
   #29 = NameAndType        #30:#6        // CHANCE_SKILL_TRIGGER:Lext/mods/gameserver/enums/skills/EffectType;
   #30 = Utf8               CHANCE_SKILL_TRIGGER
   #31 = Fieldref           #1.#32        // ext/mods/gameserver/enums/skills/EffectType.INCREASE_CHARGES:Lext/mods/gameserver/enums/skills/EffectType;
   #32 = NameAndType        #33:#6        // INCREASE_CHARGES:Lext/mods/gameserver/enums/skills/EffectType;
   #33 = Utf8               INCREASE_CHARGES
   #34 = Fieldref           #1.#35        // ext/mods/gameserver/enums/skills/EffectType.DMG_OVER_TIME:Lext/mods/gameserver/enums/skills/EffectType;
   #35 = NameAndType        #36:#6        // DMG_OVER_TIME:Lext/mods/gameserver/enums/skills/EffectType;
   #36 = Utf8               DMG_OVER_TIME
   #37 = Fieldref           #1.#38        // ext/mods/gameserver/enums/skills/EffectType.HEAL:Lext/mods/gameserver/enums/skills/EffectType;
   #38 = NameAndType        #39:#6        // HEAL:Lext/mods/gameserver/enums/skills/EffectType;
   #39 = Utf8               HEAL
   #40 = Fieldref           #1.#41        // ext/mods/gameserver/enums/skills/EffectType.HEAL_OVER_TIME:Lext/mods/gameserver/enums/skills/EffectType;
   #41 = NameAndType        #42:#6        // HEAL_OVER_TIME:Lext/mods/gameserver/enums/skills/EffectType;
   #42 = Utf8               HEAL_OVER_TIME
   #43 = Fieldref           #1.#44        // ext/mods/gameserver/enums/skills/EffectType.MANA_DMG_OVER_TIME:Lext/mods/gameserver/enums/skills/EffectType;
   #44 = NameAndType        #45:#6        // MANA_DMG_OVER_TIME:Lext/mods/gameserver/enums/skills/EffectType;
   #45 = Utf8               MANA_DMG_OVER_TIME
   #46 = Fieldref           #1.#47        // ext/mods/gameserver/enums/skills/EffectType.MANA_HEAL:Lext/mods/gameserver/enums/skills/EffectType;
   #47 = NameAndType        #48:#6        // MANA_HEAL:Lext/mods/gameserver/enums/skills/EffectType;
   #48 = Utf8               MANA_HEAL
   #49 = Fieldref           #1.#50        // ext/mods/gameserver/enums/skills/EffectType.MANA_HEAL_OVER_TIME:Lext/mods/gameserver/enums/skills/EffectType;
   #50 = NameAndType        #51:#6        // MANA_HEAL_OVER_TIME:Lext/mods/gameserver/enums/skills/EffectType;
   #51 = Utf8               MANA_HEAL_OVER_TIME
   #52 = Fieldref           #1.#53        // ext/mods/gameserver/enums/skills/EffectType.ABORT_CAST:Lext/mods/gameserver/enums/skills/EffectType;
   #53 = NameAndType        #54:#6        // ABORT_CAST:Lext/mods/gameserver/enums/skills/EffectType;
   #54 = Utf8               ABORT_CAST
   #55 = Fieldref           #1.#56        // ext/mods/gameserver/enums/skills/EffectType.BLUFF:Lext/mods/gameserver/enums/skills/EffectType;
   #56 = NameAndType        #57:#6        // BLUFF:Lext/mods/gameserver/enums/skills/EffectType;
   #57 = Utf8               BLUFF
   #58 = Fieldref           #1.#59        // ext/mods/gameserver/enums/skills/EffectType.BETRAY:Lext/mods/gameserver/enums/skills/EffectType;
   #59 = NameAndType        #60:#6        // BETRAY:Lext/mods/gameserver/enums/skills/EffectType;
   #60 = Utf8               BETRAY
   #61 = Fieldref           #1.#62        // ext/mods/gameserver/enums/skills/EffectType.STUN:Lext/mods/gameserver/enums/skills/EffectType;
   #62 = NameAndType        #63:#6        // STUN:Lext/mods/gameserver/enums/skills/EffectType;
   #63 = Utf8               STUN
   #64 = Fieldref           #1.#65        // ext/mods/gameserver/enums/skills/EffectType.ROOT:Lext/mods/gameserver/enums/skills/EffectType;
   #65 = NameAndType        #66:#6        // ROOT:Lext/mods/gameserver/enums/skills/EffectType;
   #66 = Utf8               ROOT
   #67 = Fieldref           #1.#68        // ext/mods/gameserver/enums/skills/EffectType.SLEEP:Lext/mods/gameserver/enums/skills/EffectType;
   #68 = NameAndType        #69:#6        // SLEEP:Lext/mods/gameserver/enums/skills/EffectType;
   #69 = Utf8               SLEEP
   #70 = Fieldref           #1.#71        // ext/mods/gameserver/enums/skills/EffectType.MUTE:Lext/mods/gameserver/enums/skills/EffectType;
   #71 = NameAndType        #72:#6        // MUTE:Lext/mods/gameserver/enums/skills/EffectType;
   #72 = Utf8               MUTE
   #73 = Fieldref           #1.#74        // ext/mods/gameserver/enums/skills/EffectType.PHYSICAL_MUTE:Lext/mods/gameserver/enums/skills/EffectType;
   #74 = NameAndType        #75:#6        // PHYSICAL_MUTE:Lext/mods/gameserver/enums/skills/EffectType;
   #75 = Utf8               PHYSICAL_MUTE
   #76 = Fieldref           #1.#77        // ext/mods/gameserver/enums/skills/EffectType.SILENCE_MAGIC_PHYSICAL:Lext/mods/gameserver/enums/skills/EffectType;
   #77 = NameAndType        #78:#6        // SILENCE_MAGIC_PHYSICAL:Lext/mods/gameserver/enums/skills/EffectType;
   #78 = Utf8               SILENCE_MAGIC_PHYSICAL
   #79 = Fieldref           #1.#80        // ext/mods/gameserver/enums/skills/EffectType.FEAR:Lext/mods/gameserver/enums/skills/EffectType;
   #80 = NameAndType        #81:#6        // FEAR:Lext/mods/gameserver/enums/skills/EffectType;
   #81 = Utf8               FEAR
   #82 = Fieldref           #1.#83        // ext/mods/gameserver/enums/skills/EffectType.PARALYZE:Lext/mods/gameserver/enums/skills/EffectType;
   #83 = NameAndType        #84:#6        // PARALYZE:Lext/mods/gameserver/enums/skills/EffectType;
   #84 = Utf8               PARALYZE
   #85 = Fieldref           #1.#86        // ext/mods/gameserver/enums/skills/EffectType.PETRIFICATION:Lext/mods/gameserver/enums/skills/EffectType;
   #86 = NameAndType        #87:#6        // PETRIFICATION:Lext/mods/gameserver/enums/skills/EffectType;
   #87 = Utf8               PETRIFICATION
   #88 = Fieldref           #1.#89        // ext/mods/gameserver/enums/skills/EffectType.IMMOBILE_UNTIL_ATTACKED:Lext/mods/gameserver/enums/skills/EffectType;
   #89 = NameAndType        #90:#6        // IMMOBILE_UNTIL_ATTACKED:Lext/mods/gameserver/enums/skills/EffectType;
   #90 = Utf8               IMMOBILE_UNTIL_ATTACKED
   #91 = Fieldref           #1.#92        // ext/mods/gameserver/enums/skills/EffectType.STUN_SELF:Lext/mods/gameserver/enums/skills/EffectType;
   #92 = NameAndType        #93:#6        // STUN_SELF:Lext/mods/gameserver/enums/skills/EffectType;
   #93 = Utf8               STUN_SELF
   #94 = Fieldref           #1.#95        // ext/mods/gameserver/enums/skills/EffectType.CONFUSION:Lext/mods/gameserver/enums/skills/EffectType;
   #95 = NameAndType        #96:#6        // CONFUSION:Lext/mods/gameserver/enums/skills/EffectType;
   #96 = Utf8               CONFUSION
   #97 = Fieldref           #1.#98        // ext/mods/gameserver/enums/skills/EffectType.DISTRUST:Lext/mods/gameserver/enums/skills/EffectType;
   #98 = NameAndType        #99:#6        // DISTRUST:Lext/mods/gameserver/enums/skills/EffectType;
   #99 = Utf8               DISTRUST
  #100 = Fieldref           #1.#101       // ext/mods/gameserver/enums/skills/EffectType.RANDOMIZE_HATE:Lext/mods/gameserver/enums/skills/EffectType;
  #101 = NameAndType        #102:#6       // RANDOMIZE_HATE:Lext/mods/gameserver/enums/skills/EffectType;
  #102 = Utf8               RANDOMIZE_HATE
  #103 = Fieldref           #1.#104       // ext/mods/gameserver/enums/skills/EffectType.FAKE_DEATH:Lext/mods/gameserver/enums/skills/EffectType;
  #104 = NameAndType        #105:#6       // FAKE_DEATH:Lext/mods/gameserver/enums/skills/EffectType;
  #105 = Utf8               FAKE_DEATH
  #106 = Fieldref           #1.#107       // ext/mods/gameserver/enums/skills/EffectType.SILENT_MOVE:Lext/mods/gameserver/enums/skills/EffectType;
  #107 = NameAndType        #108:#6       // SILENT_MOVE:Lext/mods/gameserver/enums/skills/EffectType;
  #108 = Utf8               SILENT_MOVE
  #109 = Fieldref           #1.#110       // ext/mods/gameserver/enums/skills/EffectType.POLEARM_TARGET_SINGLE:Lext/mods/gameserver/enums/skills/EffectType;
  #110 = NameAndType        #111:#6       // POLEARM_TARGET_SINGLE:Lext/mods/gameserver/enums/skills/EffectType;
  #111 = Utf8               POLEARM_TARGET_SINGLE
  #112 = Fieldref           #1.#113       // ext/mods/gameserver/enums/skills/EffectType.SEED:Lext/mods/gameserver/enums/skills/EffectType;
  #113 = NameAndType        #114:#6       // SEED:Lext/mods/gameserver/enums/skills/EffectType;
  #114 = Utf8               SEED
  #115 = Fieldref           #1.#116       // ext/mods/gameserver/enums/skills/EffectType.SPOIL:Lext/mods/gameserver/enums/skills/EffectType;
  #116 = NameAndType        #117:#6       // SPOIL:Lext/mods/gameserver/enums/skills/EffectType;
  #117 = Utf8               SPOIL
  #118 = Fieldref           #1.#119       // ext/mods/gameserver/enums/skills/EffectType.REMOVE_TARGET:Lext/mods/gameserver/enums/skills/EffectType;
  #119 = NameAndType        #120:#6       // REMOVE_TARGET:Lext/mods/gameserver/enums/skills/EffectType;
  #120 = Utf8               REMOVE_TARGET
  #121 = Fieldref           #1.#122       // ext/mods/gameserver/enums/skills/EffectType.TARGET_ME:Lext/mods/gameserver/enums/skills/EffectType;
  #122 = NameAndType        #123:#6       // TARGET_ME:Lext/mods/gameserver/enums/skills/EffectType;
  #123 = Utf8               TARGET_ME
  #124 = Fieldref           #1.#125       // ext/mods/gameserver/enums/skills/EffectType.RELAXING:Lext/mods/gameserver/enums/skills/EffectType;
  #125 = NameAndType        #126:#6       // RELAXING:Lext/mods/gameserver/enums/skills/EffectType;
  #126 = Utf8               RELAXING
  #127 = Fieldref           #1.#128       // ext/mods/gameserver/enums/skills/EffectType.NOBLESSE_BLESSING:Lext/mods/gameserver/enums/skills/EffectType;
  #128 = NameAndType        #129:#6       // NOBLESSE_BLESSING:Lext/mods/gameserver/enums/skills/EffectType;
  #129 = Utf8               NOBLESSE_BLESSING
  #130 = Fieldref           #1.#131       // ext/mods/gameserver/enums/skills/EffectType.PROTECTION_BLESSING:Lext/mods/gameserver/enums/skills/EffectType;
  #131 = NameAndType        #132:#6       // PROTECTION_BLESSING:Lext/mods/gameserver/enums/skills/EffectType;
  #132 = Utf8               PROTECTION_BLESSING
  #133 = Fieldref           #1.#134       // ext/mods/gameserver/enums/skills/EffectType.FUSION:Lext/mods/gameserver/enums/skills/EffectType;
  #134 = NameAndType        #135:#6       // FUSION:Lext/mods/gameserver/enums/skills/EffectType;
  #135 = Utf8               FUSION
  #136 = Fieldref           #1.#137       // ext/mods/gameserver/enums/skills/EffectType.CHARM_OF_COURAGE:Lext/mods/gameserver/enums/skills/EffectType;
  #137 = NameAndType        #138:#6       // CHARM_OF_COURAGE:Lext/mods/gameserver/enums/skills/EffectType;
  #138 = Utf8               CHARM_OF_COURAGE
  #139 = Fieldref           #1.#140       // ext/mods/gameserver/enums/skills/EffectType.CHARM_OF_LUCK:Lext/mods/gameserver/enums/skills/EffectType;
  #140 = NameAndType        #141:#6       // CHARM_OF_LUCK:Lext/mods/gameserver/enums/skills/EffectType;
  #141 = Utf8               CHARM_OF_LUCK
  #142 = Fieldref           #1.#143       // ext/mods/gameserver/enums/skills/EffectType.INVINCIBLE:Lext/mods/gameserver/enums/skills/EffectType;
  #143 = NameAndType        #144:#6       // INVINCIBLE:Lext/mods/gameserver/enums/skills/EffectType;
  #144 = Utf8               INVINCIBLE
  #145 = Fieldref           #1.#146       // ext/mods/gameserver/enums/skills/EffectType.PHOENIX_BLESSING:Lext/mods/gameserver/enums/skills/EffectType;
  #146 = NameAndType        #147:#6       // PHOENIX_BLESSING:Lext/mods/gameserver/enums/skills/EffectType;
  #147 = Utf8               PHOENIX_BLESSING
  #148 = Fieldref           #1.#149       // ext/mods/gameserver/enums/skills/EffectType.THROW_UP:Lext/mods/gameserver/enums/skills/EffectType;
  #149 = NameAndType        #150:#6       // THROW_UP:Lext/mods/gameserver/enums/skills/EffectType;
  #150 = Utf8               THROW_UP
  #151 = Fieldref           #1.#152       // ext/mods/gameserver/enums/skills/EffectType.SIGNET_GROUND:Lext/mods/gameserver/enums/skills/EffectType;
  #152 = NameAndType        #153:#6       // SIGNET_GROUND:Lext/mods/gameserver/enums/skills/EffectType;
  #153 = Utf8               SIGNET_GROUND
  #154 = Fieldref           #1.#155       // ext/mods/gameserver/enums/skills/EffectType.SIGNET_EFFECT:Lext/mods/gameserver/enums/skills/EffectType;
  #155 = NameAndType        #156:#6       // SIGNET_EFFECT:Lext/mods/gameserver/enums/skills/EffectType;
  #156 = Utf8               SIGNET_EFFECT
  #157 = Fieldref           #1.#158       // ext/mods/gameserver/enums/skills/EffectType.$VALUES:[Lext/mods/gameserver/enums/skills/EffectType;
  #158 = NameAndType        #159:#160     // $VALUES:[Lext/mods/gameserver/enums/skills/EffectType;
  #159 = Utf8               $VALUES
  #160 = Utf8               [Lext/mods/gameserver/enums/skills/EffectType;
  #161 = Methodref          #162.#163     // "[Lext/mods/gameserver/enums/skills/EffectType;".clone:()Ljava/lang/Object;
  #162 = Class              #160          // "[Lext/mods/gameserver/enums/skills/EffectType;"
  #163 = NameAndType        #164:#165     // clone:()Ljava/lang/Object;
  #164 = Utf8               clone
  #165 = Utf8               ()Ljava/lang/Object;
  #166 = Methodref          #167.#168     // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #167 = Class              #169          // java/lang/Enum
  #168 = NameAndType        #170:#171     // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #169 = Utf8               java/lang/Enum
  #170 = Utf8               valueOf
  #171 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
  #172 = Methodref          #167.#173     // java/lang/Enum."<init>":(Ljava/lang/String;I)V
  #173 = NameAndType        #174:#175     // "<init>":(Ljava/lang/String;I)V
  #174 = Utf8               <init>
  #175 = Utf8               (Ljava/lang/String;I)V
  #176 = String             #5            // BLOCK_BUFF
  #177 = Methodref          #1.#173       // ext/mods/gameserver/enums/skills/EffectType."<init>":(Ljava/lang/String;I)V
  #178 = String             #9            // BLOCK_DEBUFF
  #179 = String             #12           // BUFF
  #180 = String             #15           // DEBUFF
  #181 = String             #18           // CANCEL
  #182 = String             #21           // CANCEL_DEBUFF
  #183 = String             #24           // NEGATE
  #184 = String             #27           // CLAN_GATE
  #185 = String             #30           // CHANCE_SKILL_TRIGGER
  #186 = String             #33           // INCREASE_CHARGES
  #187 = String             #36           // DMG_OVER_TIME
  #188 = String             #39           // HEAL
  #189 = String             #42           // HEAL_OVER_TIME
  #190 = String             #45           // MANA_DMG_OVER_TIME
  #191 = String             #48           // MANA_HEAL
  #192 = String             #51           // MANA_HEAL_OVER_TIME
  #193 = String             #54           // ABORT_CAST
  #194 = String             #57           // BLUFF
  #195 = String             #60           // BETRAY
  #196 = String             #63           // STUN
  #197 = String             #66           // ROOT
  #198 = String             #69           // SLEEP
  #199 = String             #72           // MUTE
  #200 = String             #75           // PHYSICAL_MUTE
  #201 = String             #78           // SILENCE_MAGIC_PHYSICAL
  #202 = String             #81           // FEAR
  #203 = String             #84           // PARALYZE
  #204 = String             #87           // PETRIFICATION
  #205 = String             #90           // IMMOBILE_UNTIL_ATTACKED
  #206 = String             #93           // STUN_SELF
  #207 = String             #96           // CONFUSION
  #208 = String             #99           // DISTRUST
  #209 = String             #102          // RANDOMIZE_HATE
  #210 = String             #105          // FAKE_DEATH
  #211 = String             #108          // SILENT_MOVE
  #212 = String             #111          // POLEARM_TARGET_SINGLE
  #213 = String             #114          // SEED
  #214 = String             #117          // SPOIL
  #215 = String             #120          // REMOVE_TARGET
  #216 = String             #123          // TARGET_ME
  #217 = String             #126          // RELAXING
  #218 = String             #129          // NOBLESSE_BLESSING
  #219 = String             #132          // PROTECTION_BLESSING
  #220 = String             #135          // FUSION
  #221 = String             #138          // CHARM_OF_COURAGE
  #222 = String             #141          // CHARM_OF_LUCK
  #223 = String             #144          // INVINCIBLE
  #224 = String             #147          // PHOENIX_BLESSING
  #225 = String             #150          // THROW_UP
  #226 = String             #153          // SIGNET_GROUND
  #227 = String             #156          // SIGNET_EFFECT
  #228 = Methodref          #1.#229       // ext/mods/gameserver/enums/skills/EffectType.$values:()[Lext/mods/gameserver/enums/skills/EffectType;
  #229 = NameAndType        #230:#231     // $values:()[Lext/mods/gameserver/enums/skills/EffectType;
  #230 = Utf8               $values
  #231 = Utf8               ()[Lext/mods/gameserver/enums/skills/EffectType;
  #232 = Utf8               values
  #233 = Utf8               Code
  #234 = Utf8               LineNumberTable
  #235 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/enums/skills/EffectType;
  #236 = Utf8               LocalVariableTable
  #237 = Utf8               name
  #238 = Utf8               Ljava/lang/String;
  #239 = Utf8               MethodParameters
  #240 = Utf8               this
  #241 = Utf8               Signature
  #242 = Utf8               ()V
  #243 = Utf8               isntCancellable
  #244 = Utf8               (Lext/mods/gameserver/enums/skills/EffectType;)Z
  #245 = Utf8               type
  #246 = Utf8               StackMapTable
  #247 = Utf8               <clinit>
  #248 = Utf8               Ljava/lang/Enum<Lext/mods/gameserver/enums/skills/EffectType;>;
  #249 = Utf8               SourceFile
  #250 = Utf8               EffectType.java
{
  public static final ext.mods.gameserver.enums.skills.EffectType BLOCK_BUFF;
    descriptor: Lext/mods/gameserver/enums/skills/EffectType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.EffectType BLOCK_DEBUFF;
    descriptor: Lext/mods/gameserver/enums/skills/EffectType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.EffectType BUFF;
    descriptor: Lext/mods/gameserver/enums/skills/EffectType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.EffectType DEBUFF;
    descriptor: Lext/mods/gameserver/enums/skills/EffectType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.EffectType CANCEL;
    descriptor: Lext/mods/gameserver/enums/skills/EffectType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.EffectType CANCEL_DEBUFF;
    descriptor: Lext/mods/gameserver/enums/skills/EffectType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.EffectType NEGATE;
    descriptor: Lext/mods/gameserver/enums/skills/EffectType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.EffectType CLAN_GATE;
    descriptor: Lext/mods/gameserver/enums/skills/EffectType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.EffectType CHANCE_SKILL_TRIGGER;
    descriptor: Lext/mods/gameserver/enums/skills/EffectType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.EffectType INCREASE_CHARGES;
    descriptor: Lext/mods/gameserver/enums/skills/EffectType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.EffectType DMG_OVER_TIME;
    descriptor: Lext/mods/gameserver/enums/skills/EffectType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.EffectType HEAL;
    descriptor: Lext/mods/gameserver/enums/skills/EffectType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.EffectType HEAL_OVER_TIME;
    descriptor: Lext/mods/gameserver/enums/skills/EffectType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.EffectType MANA_DMG_OVER_TIME;
    descriptor: Lext/mods/gameserver/enums/skills/EffectType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.EffectType MANA_HEAL;
    descriptor: Lext/mods/gameserver/enums/skills/EffectType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.EffectType MANA_HEAL_OVER_TIME;
    descriptor: Lext/mods/gameserver/enums/skills/EffectType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.EffectType ABORT_CAST;
    descriptor: Lext/mods/gameserver/enums/skills/EffectType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.EffectType BLUFF;
    descriptor: Lext/mods/gameserver/enums/skills/EffectType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.EffectType BETRAY;
    descriptor: Lext/mods/gameserver/enums/skills/EffectType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.EffectType STUN;
    descriptor: Lext/mods/gameserver/enums/skills/EffectType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.EffectType ROOT;
    descriptor: Lext/mods/gameserver/enums/skills/EffectType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.EffectType SLEEP;
    descriptor: Lext/mods/gameserver/enums/skills/EffectType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.EffectType MUTE;
    descriptor: Lext/mods/gameserver/enums/skills/EffectType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.EffectType PHYSICAL_MUTE;
    descriptor: Lext/mods/gameserver/enums/skills/EffectType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.EffectType SILENCE_MAGIC_PHYSICAL;
    descriptor: Lext/mods/gameserver/enums/skills/EffectType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.EffectType FEAR;
    descriptor: Lext/mods/gameserver/enums/skills/EffectType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.EffectType PARALYZE;
    descriptor: Lext/mods/gameserver/enums/skills/EffectType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.EffectType PETRIFICATION;
    descriptor: Lext/mods/gameserver/enums/skills/EffectType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.EffectType IMMOBILE_UNTIL_ATTACKED;
    descriptor: Lext/mods/gameserver/enums/skills/EffectType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.EffectType STUN_SELF;
    descriptor: Lext/mods/gameserver/enums/skills/EffectType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.EffectType CONFUSION;
    descriptor: Lext/mods/gameserver/enums/skills/EffectType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.EffectType DISTRUST;
    descriptor: Lext/mods/gameserver/enums/skills/EffectType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.EffectType RANDOMIZE_HATE;
    descriptor: Lext/mods/gameserver/enums/skills/EffectType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.EffectType FAKE_DEATH;
    descriptor: Lext/mods/gameserver/enums/skills/EffectType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.EffectType SILENT_MOVE;
    descriptor: Lext/mods/gameserver/enums/skills/EffectType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.EffectType POLEARM_TARGET_SINGLE;
    descriptor: Lext/mods/gameserver/enums/skills/EffectType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.EffectType SEED;
    descriptor: Lext/mods/gameserver/enums/skills/EffectType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.EffectType SPOIL;
    descriptor: Lext/mods/gameserver/enums/skills/EffectType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.EffectType REMOVE_TARGET;
    descriptor: Lext/mods/gameserver/enums/skills/EffectType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.EffectType TARGET_ME;
    descriptor: Lext/mods/gameserver/enums/skills/EffectType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.EffectType RELAXING;
    descriptor: Lext/mods/gameserver/enums/skills/EffectType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.EffectType NOBLESSE_BLESSING;
    descriptor: Lext/mods/gameserver/enums/skills/EffectType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.EffectType PROTECTION_BLESSING;
    descriptor: Lext/mods/gameserver/enums/skills/EffectType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.EffectType FUSION;
    descriptor: Lext/mods/gameserver/enums/skills/EffectType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.EffectType CHARM_OF_COURAGE;
    descriptor: Lext/mods/gameserver/enums/skills/EffectType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.EffectType CHARM_OF_LUCK;
    descriptor: Lext/mods/gameserver/enums/skills/EffectType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.EffectType INVINCIBLE;
    descriptor: Lext/mods/gameserver/enums/skills/EffectType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.EffectType PHOENIX_BLESSING;
    descriptor: Lext/mods/gameserver/enums/skills/EffectType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.EffectType THROW_UP;
    descriptor: Lext/mods/gameserver/enums/skills/EffectType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.EffectType SIGNET_GROUND;
    descriptor: Lext/mods/gameserver/enums/skills/EffectType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static final ext.mods.gameserver.enums.skills.EffectType SIGNET_EFFECT;
    descriptor: Lext/mods/gameserver/enums/skills/EffectType;
    flags: (0x4019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

  public static ext.mods.gameserver.enums.skills.EffectType[] values();
    descriptor: ()[Lext/mods/gameserver/enums/skills/EffectType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #157                // Field $VALUES:[Lext/mods/gameserver/enums/skills/EffectType;
         3: invokevirtual #161                // Method "[Lext/mods/gameserver/enums/skills/EffectType;".clone:()Ljava/lang/Object;
         6: checkcast     #162                // class "[Lext/mods/gameserver/enums/skills/EffectType;"
         9: areturn
      LineNumberTable:
        line 20: 0

  public static ext.mods.gameserver.enums.skills.EffectType valueOf(java.lang.String);
    descriptor: (Ljava/lang/String;)Lext/mods/gameserver/enums/skills/EffectType;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: ldc           #1                  // class ext/mods/gameserver/enums/skills/EffectType
         2: aload_0
         3: invokestatic  #166                // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
         6: checkcast     #1                  // class ext/mods/gameserver/enums/skills/EffectType
         9: areturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  name   Ljava/lang/String;
    MethodParameters:
      Name                           Flags
      <no name>                      mandated

  public static boolean isntCancellable(ext.mods.gameserver.enums.skills.EffectType);
    descriptor: (Lext/mods/gameserver/enums/skills/EffectType;)Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getstatic     #136                // Field CHARM_OF_COURAGE:Lext/mods/gameserver/enums/skills/EffectType;
         4: if_acmpeq     28
         7: aload_0
         8: getstatic     #139                // Field CHARM_OF_LUCK:Lext/mods/gameserver/enums/skills/EffectType;
        11: if_acmpeq     28
        14: aload_0
        15: getstatic     #127                // Field NOBLESSE_BLESSING:Lext/mods/gameserver/enums/skills/EffectType;
        18: if_acmpeq     28
        21: aload_0
        22: getstatic     #130                // Field PROTECTION_BLESSING:Lext/mods/gameserver/enums/skills/EffectType;
        25: if_acmpne     32
        28: iconst_1
        29: goto          33
        32: iconst_0
        33: ireturn
      LineNumberTable:
        line 90: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      34     0  type   Lext/mods/gameserver/enums/skills/EffectType;
      StackMapTable: number_of_entries = 3
        frame_type = 28 /* same */
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: new           #1                  // class ext/mods/gameserver/enums/skills/EffectType
         3: dup
         4: ldc           #176                // String BLOCK_BUFF
         6: iconst_0
         7: invokespecial #177                // Method "<init>":(Ljava/lang/String;I)V
        10: putstatic     #3                  // Field BLOCK_BUFF:Lext/mods/gameserver/enums/skills/EffectType;
        13: new           #1                  // class ext/mods/gameserver/enums/skills/EffectType
        16: dup
        17: ldc           #178                // String BLOCK_DEBUFF
        19: iconst_1
        20: invokespecial #177                // Method "<init>":(Ljava/lang/String;I)V
        23: putstatic     #7                  // Field BLOCK_DEBUFF:Lext/mods/gameserver/enums/skills/EffectType;
        26: new           #1                  // class ext/mods/gameserver/enums/skills/EffectType
        29: dup
        30: ldc           #179                // String BUFF
        32: iconst_2
        33: invokespecial #177                // Method "<init>":(Ljava/lang/String;I)V
        36: putstatic     #10                 // Field BUFF:Lext/mods/gameserver/enums/skills/EffectType;
        39: new           #1                  // class ext/mods/gameserver/enums/skills/EffectType
        42: dup
        43: ldc           #180                // String DEBUFF
        45: iconst_3
        46: invokespecial #177                // Method "<init>":(Ljava/lang/String;I)V
        49: putstatic     #13                 // Field DEBUFF:Lext/mods/gameserver/enums/skills/EffectType;
        52: new           #1                  // class ext/mods/gameserver/enums/skills/EffectType
        55: dup
        56: ldc           #181                // String CANCEL
        58: iconst_4
        59: invokespecial #177                // Method "<init>":(Ljava/lang/String;I)V
        62: putstatic     #16                 // Field CANCEL:Lext/mods/gameserver/enums/skills/EffectType;
        65: new           #1                  // class ext/mods/gameserver/enums/skills/EffectType
        68: dup
        69: ldc           #182                // String CANCEL_DEBUFF
        71: iconst_5
        72: invokespecial #177                // Method "<init>":(Ljava/lang/String;I)V
        75: putstatic     #19                 // Field CANCEL_DEBUFF:Lext/mods/gameserver/enums/skills/EffectType;
        78: new           #1                  // class ext/mods/gameserver/enums/skills/EffectType
        81: dup
        82: ldc           #183                // String NEGATE
        84: bipush        6
        86: invokespecial #177                // Method "<init>":(Ljava/lang/String;I)V
        89: putstatic     #22                 // Field NEGATE:Lext/mods/gameserver/enums/skills/EffectType;
        92: new           #1                  // class ext/mods/gameserver/enums/skills/EffectType
        95: dup
        96: ldc           #184                // String CLAN_GATE
        98: bipush        7
       100: invokespecial #177                // Method "<init>":(Ljava/lang/String;I)V
       103: putstatic     #25                 // Field CLAN_GATE:Lext/mods/gameserver/enums/skills/EffectType;
       106: new           #1                  // class ext/mods/gameserver/enums/skills/EffectType
       109: dup
       110: ldc           #185                // String CHANCE_SKILL_TRIGGER
       112: bipush        8
       114: invokespecial #177                // Method "<init>":(Ljava/lang/String;I)V
       117: putstatic     #28                 // Field CHANCE_SKILL_TRIGGER:Lext/mods/gameserver/enums/skills/EffectType;
       120: new           #1                  // class ext/mods/gameserver/enums/skills/EffectType
       123: dup
       124: ldc           #186                // String INCREASE_CHARGES
       126: bipush        9
       128: invokespecial #177                // Method "<init>":(Ljava/lang/String;I)V
       131: putstatic     #31                 // Field INCREASE_CHARGES:Lext/mods/gameserver/enums/skills/EffectType;
       134: new           #1                  // class ext/mods/gameserver/enums/skills/EffectType
       137: dup
       138: ldc           #187                // String DMG_OVER_TIME
       140: bipush        10
       142: invokespecial #177                // Method "<init>":(Ljava/lang/String;I)V
       145: putstatic     #34                 // Field DMG_OVER_TIME:Lext/mods/gameserver/enums/skills/EffectType;
       148: new           #1                  // class ext/mods/gameserver/enums/skills/EffectType
       151: dup
       152: ldc           #188                // String HEAL
       154: bipush        11
       156: invokespecial #177                // Method "<init>":(Ljava/lang/String;I)V
       159: putstatic     #37                 // Field HEAL:Lext/mods/gameserver/enums/skills/EffectType;
       162: new           #1                  // class ext/mods/gameserver/enums/skills/EffectType
       165: dup
       166: ldc           #189                // String HEAL_OVER_TIME
       168: bipush        12
       170: invokespecial #177                // Method "<init>":(Ljava/lang/String;I)V
       173: putstatic     #40                 // Field HEAL_OVER_TIME:Lext/mods/gameserver/enums/skills/EffectType;
       176: new           #1                  // class ext/mods/gameserver/enums/skills/EffectType
       179: dup
       180: ldc           #190                // String MANA_DMG_OVER_TIME
       182: bipush        13
       184: invokespecial #177                // Method "<init>":(Ljava/lang/String;I)V
       187: putstatic     #43                 // Field MANA_DMG_OVER_TIME:Lext/mods/gameserver/enums/skills/EffectType;
       190: new           #1                  // class ext/mods/gameserver/enums/skills/EffectType
       193: dup
       194: ldc           #191                // String MANA_HEAL
       196: bipush        14
       198: invokespecial #177                // Method "<init>":(Ljava/lang/String;I)V
       201: putstatic     #46                 // Field MANA_HEAL:Lext/mods/gameserver/enums/skills/EffectType;
       204: new           #1                  // class ext/mods/gameserver/enums/skills/EffectType
       207: dup
       208: ldc           #192                // String MANA_HEAL_OVER_TIME
       210: bipush        15
       212: invokespecial #177                // Method "<init>":(Ljava/lang/String;I)V
       215: putstatic     #49                 // Field MANA_HEAL_OVER_TIME:Lext/mods/gameserver/enums/skills/EffectType;
       218: new           #1                  // class ext/mods/gameserver/enums/skills/EffectType
       221: dup
       222: ldc           #193                // String ABORT_CAST
       224: bipush        16
       226: invokespecial #177                // Method "<init>":(Ljava/lang/String;I)V
       229: putstatic     #52                 // Field ABORT_CAST:Lext/mods/gameserver/enums/skills/EffectType;
       232: new           #1                  // class ext/mods/gameserver/enums/skills/EffectType
       235: dup
       236: ldc           #194                // String BLUFF
       238: bipush        17
       240: invokespecial #177                // Method "<init>":(Ljava/lang/String;I)V
       243: putstatic     #55                 // Field BLUFF:Lext/mods/gameserver/enums/skills/EffectType;
       246: new           #1                  // class ext/mods/gameserver/enums/skills/EffectType
       249: dup
       250: ldc           #195                // String BETRAY
       252: bipush        18
       254: invokespecial #177                // Method "<init>":(Ljava/lang/String;I)V
       257: putstatic     #58                 // Field BETRAY:Lext/mods/gameserver/enums/skills/EffectType;
       260: new           #1                  // class ext/mods/gameserver/enums/skills/EffectType
       263: dup
       264: ldc           #196                // String STUN
       266: bipush        19
       268: invokespecial #177                // Method "<init>":(Ljava/lang/String;I)V
       271: putstatic     #61                 // Field STUN:Lext/mods/gameserver/enums/skills/EffectType;
       274: new           #1                  // class ext/mods/gameserver/enums/skills/EffectType
       277: dup
       278: ldc           #197                // String ROOT
       280: bipush        20
       282: invokespecial #177                // Method "<init>":(Ljava/lang/String;I)V
       285: putstatic     #64                 // Field ROOT:Lext/mods/gameserver/enums/skills/EffectType;
       288: new           #1                  // class ext/mods/gameserver/enums/skills/EffectType
       291: dup
       292: ldc           #198                // String SLEEP
       294: bipush        21
       296: invokespecial #177                // Method "<init>":(Ljava/lang/String;I)V
       299: putstatic     #67                 // Field SLEEP:Lext/mods/gameserver/enums/skills/EffectType;
       302: new           #1                  // class ext/mods/gameserver/enums/skills/EffectType
       305: dup
       306: ldc           #199                // String MUTE
       308: bipush        22
       310: invokespecial #177                // Method "<init>":(Ljava/lang/String;I)V
       313: putstatic     #70                 // Field MUTE:Lext/mods/gameserver/enums/skills/EffectType;
       316: new           #1                  // class ext/mods/gameserver/enums/skills/EffectType
       319: dup
       320: ldc           #200                // String PHYSICAL_MUTE
       322: bipush        23
       324: invokespecial #177                // Method "<init>":(Ljava/lang/String;I)V
       327: putstatic     #73                 // Field PHYSICAL_MUTE:Lext/mods/gameserver/enums/skills/EffectType;
       330: new           #1                  // class ext/mods/gameserver/enums/skills/EffectType
       333: dup
       334: ldc           #201                // String SILENCE_MAGIC_PHYSICAL
       336: bipush        24
       338: invokespecial #177                // Method "<init>":(Ljava/lang/String;I)V
       341: putstatic     #76                 // Field SILENCE_MAGIC_PHYSICAL:Lext/mods/gameserver/enums/skills/EffectType;
       344: new           #1                  // class ext/mods/gameserver/enums/skills/EffectType
       347: dup
       348: ldc           #202                // String FEAR
       350: bipush        25
       352: invokespecial #177                // Method "<init>":(Ljava/lang/String;I)V
       355: putstatic     #79                 // Field FEAR:Lext/mods/gameserver/enums/skills/EffectType;
       358: new           #1                  // class ext/mods/gameserver/enums/skills/EffectType
       361: dup
       362: ldc           #203                // String PARALYZE
       364: bipush        26
       366: invokespecial #177                // Method "<init>":(Ljava/lang/String;I)V
       369: putstatic     #82                 // Field PARALYZE:Lext/mods/gameserver/enums/skills/EffectType;
       372: new           #1                  // class ext/mods/gameserver/enums/skills/EffectType
       375: dup
       376: ldc           #204                // String PETRIFICATION
       378: bipush        27
       380: invokespecial #177                // Method "<init>":(Ljava/lang/String;I)V
       383: putstatic     #85                 // Field PETRIFICATION:Lext/mods/gameserver/enums/skills/EffectType;
       386: new           #1                  // class ext/mods/gameserver/enums/skills/EffectType
       389: dup
       390: ldc           #205                // String IMMOBILE_UNTIL_ATTACKED
       392: bipush        28
       394: invokespecial #177                // Method "<init>":(Ljava/lang/String;I)V
       397: putstatic     #88                 // Field IMMOBILE_UNTIL_ATTACKED:Lext/mods/gameserver/enums/skills/EffectType;
       400: new           #1                  // class ext/mods/gameserver/enums/skills/EffectType
       403: dup
       404: ldc           #206                // String STUN_SELF
       406: bipush        29
       408: invokespecial #177                // Method "<init>":(Ljava/lang/String;I)V
       411: putstatic     #91                 // Field STUN_SELF:Lext/mods/gameserver/enums/skills/EffectType;
       414: new           #1                  // class ext/mods/gameserver/enums/skills/EffectType
       417: dup
       418: ldc           #207                // String CONFUSION
       420: bipush        30
       422: invokespecial #177                // Method "<init>":(Ljava/lang/String;I)V
       425: putstatic     #94                 // Field CONFUSION:Lext/mods/gameserver/enums/skills/EffectType;
       428: new           #1                  // class ext/mods/gameserver/enums/skills/EffectType
       431: dup
       432: ldc           #208                // String DISTRUST
       434: bipush        31
       436: invokespecial #177                // Method "<init>":(Ljava/lang/String;I)V
       439: putstatic     #97                 // Field DISTRUST:Lext/mods/gameserver/enums/skills/EffectType;
       442: new           #1                  // class ext/mods/gameserver/enums/skills/EffectType
       445: dup
       446: ldc           #209                // String RANDOMIZE_HATE
       448: bipush        32
       450: invokespecial #177                // Method "<init>":(Ljava/lang/String;I)V
       453: putstatic     #100                // Field RANDOMIZE_HATE:Lext/mods/gameserver/enums/skills/EffectType;
       456: new           #1                  // class ext/mods/gameserver/enums/skills/EffectType
       459: dup
       460: ldc           #210                // String FAKE_DEATH
       462: bipush        33
       464: invokespecial #177                // Method "<init>":(Ljava/lang/String;I)V
       467: putstatic     #103                // Field FAKE_DEATH:Lext/mods/gameserver/enums/skills/EffectType;
       470: new           #1                  // class ext/mods/gameserver/enums/skills/EffectType
       473: dup
       474: ldc           #211                // String SILENT_MOVE
       476: bipush        34
       478: invokespecial #177                // Method "<init>":(Ljava/lang/String;I)V
       481: putstatic     #106                // Field SILENT_MOVE:Lext/mods/gameserver/enums/skills/EffectType;
       484: new           #1                  // class ext/mods/gameserver/enums/skills/EffectType
       487: dup
       488: ldc           #212                // String POLEARM_TARGET_SINGLE
       490: bipush        35
       492: invokespecial #177                // Method "<init>":(Ljava/lang/String;I)V
       495: putstatic     #109                // Field POLEARM_TARGET_SINGLE:Lext/mods/gameserver/enums/skills/EffectType;
       498: new           #1                  // class ext/mods/gameserver/enums/skills/EffectType
       501: dup
       502: ldc           #213                // String SEED
       504: bipush        36
       506: invokespecial #177                // Method "<init>":(Ljava/lang/String;I)V
       509: putstatic     #112                // Field SEED:Lext/mods/gameserver/enums/skills/EffectType;
       512: new           #1                  // class ext/mods/gameserver/enums/skills/EffectType
       515: dup
       516: ldc           #214                // String SPOIL
       518: bipush        37
       520: invokespecial #177                // Method "<init>":(Ljava/lang/String;I)V
       523: putstatic     #115                // Field SPOIL:Lext/mods/gameserver/enums/skills/EffectType;
       526: new           #1                  // class ext/mods/gameserver/enums/skills/EffectType
       529: dup
       530: ldc           #215                // String REMOVE_TARGET
       532: bipush        38
       534: invokespecial #177                // Method "<init>":(Ljava/lang/String;I)V
       537: putstatic     #118                // Field REMOVE_TARGET:Lext/mods/gameserver/enums/skills/EffectType;
       540: new           #1                  // class ext/mods/gameserver/enums/skills/EffectType
       543: dup
       544: ldc           #216                // String TARGET_ME
       546: bipush        39
       548: invokespecial #177                // Method "<init>":(Ljava/lang/String;I)V
       551: putstatic     #121                // Field TARGET_ME:Lext/mods/gameserver/enums/skills/EffectType;
       554: new           #1                  // class ext/mods/gameserver/enums/skills/EffectType
       557: dup
       558: ldc           #217                // String RELAXING
       560: bipush        40
       562: invokespecial #177                // Method "<init>":(Ljava/lang/String;I)V
       565: putstatic     #124                // Field RELAXING:Lext/mods/gameserver/enums/skills/EffectType;
       568: new           #1                  // class ext/mods/gameserver/enums/skills/EffectType
       571: dup
       572: ldc           #218                // String NOBLESSE_BLESSING
       574: bipush        41
       576: invokespecial #177                // Method "<init>":(Ljava/lang/String;I)V
       579: putstatic     #127                // Field NOBLESSE_BLESSING:Lext/mods/gameserver/enums/skills/EffectType;
       582: new           #1                  // class ext/mods/gameserver/enums/skills/EffectType
       585: dup
       586: ldc           #219                // String PROTECTION_BLESSING
       588: bipush        42
       590: invokespecial #177                // Method "<init>":(Ljava/lang/String;I)V
       593: putstatic     #130                // Field PROTECTION_BLESSING:Lext/mods/gameserver/enums/skills/EffectType;
       596: new           #1                  // class ext/mods/gameserver/enums/skills/EffectType
       599: dup
       600: ldc           #220                // String FUSION
       602: bipush        43
       604: invokespecial #177                // Method "<init>":(Ljava/lang/String;I)V
       607: putstatic     #133                // Field FUSION:Lext/mods/gameserver/enums/skills/EffectType;
       610: new           #1                  // class ext/mods/gameserver/enums/skills/EffectType
       613: dup
       614: ldc           #221                // String CHARM_OF_COURAGE
       616: bipush        44
       618: invokespecial #177                // Method "<init>":(Ljava/lang/String;I)V
       621: putstatic     #136                // Field CHARM_OF_COURAGE:Lext/mods/gameserver/enums/skills/EffectType;
       624: new           #1                  // class ext/mods/gameserver/enums/skills/EffectType
       627: dup
       628: ldc           #222                // String CHARM_OF_LUCK
       630: bipush        45
       632: invokespecial #177                // Method "<init>":(Ljava/lang/String;I)V
       635: putstatic     #139                // Field CHARM_OF_LUCK:Lext/mods/gameserver/enums/skills/EffectType;
       638: new           #1                  // class ext/mods/gameserver/enums/skills/EffectType
       641: dup
       642: ldc           #223                // String INVINCIBLE
       644: bipush        46
       646: invokespecial #177                // Method "<init>":(Ljava/lang/String;I)V
       649: putstatic     #142                // Field INVINCIBLE:Lext/mods/gameserver/enums/skills/EffectType;
       652: new           #1                  // class ext/mods/gameserver/enums/skills/EffectType
       655: dup
       656: ldc           #224                // String PHOENIX_BLESSING
       658: bipush        47
       660: invokespecial #177                // Method "<init>":(Ljava/lang/String;I)V
       663: putstatic     #145                // Field PHOENIX_BLESSING:Lext/mods/gameserver/enums/skills/EffectType;
       666: new           #1                  // class ext/mods/gameserver/enums/skills/EffectType
       669: dup
       670: ldc           #225                // String THROW_UP
       672: bipush        48
       674: invokespecial #177                // Method "<init>":(Ljava/lang/String;I)V
       677: putstatic     #148                // Field THROW_UP:Lext/mods/gameserver/enums/skills/EffectType;
       680: new           #1                  // class ext/mods/gameserver/enums/skills/EffectType
       683: dup
       684: ldc           #226                // String SIGNET_GROUND
       686: bipush        49
       688: invokespecial #177                // Method "<init>":(Ljava/lang/String;I)V
       691: putstatic     #151                // Field SIGNET_GROUND:Lext/mods/gameserver/enums/skills/EffectType;
       694: new           #1                  // class ext/mods/gameserver/enums/skills/EffectType
       697: dup
       698: ldc           #227                // String SIGNET_EFFECT
       700: bipush        50
       702: invokespecial #177                // Method "<init>":(Ljava/lang/String;I)V
       705: putstatic     #154                // Field SIGNET_EFFECT:Lext/mods/gameserver/enums/skills/EffectType;
       708: invokestatic  #228                // Method $values:()[Lext/mods/gameserver/enums/skills/EffectType;
       711: putstatic     #157                // Field $VALUES:[Lext/mods/gameserver/enums/skills/EffectType;
       714: return
      LineNumberTable:
        line 22: 0
        line 23: 13
        line 25: 26
        line 26: 39
        line 28: 52
        line 30: 65
        line 31: 78
        line 33: 92
        line 34: 106
        line 35: 120
        line 37: 134
        line 38: 148
        line 39: 162
        line 41: 176
        line 42: 190
        line 43: 204
        line 45: 218
        line 46: 232
        line 47: 246
        line 48: 260
        line 49: 274
        line 50: 288
        line 51: 302
        line 52: 316
        line 53: 330
        line 54: 344
        line 55: 358
        line 56: 372
        line 57: 386
        line 58: 400
        line 59: 414
        line 60: 428
        line 61: 442
        line 63: 456
        line 64: 470
        line 66: 484
        line 68: 498
        line 69: 512
        line 71: 526
        line 72: 540
        line 74: 554
        line 75: 568
        line 76: 582
        line 77: 596
        line 78: 610
        line 79: 624
        line 80: 638
        line 81: 652
        line 83: 666
        line 85: 680
        line 86: 694
        line 20: 708
}
Signature: #248                         // Ljava/lang/Enum<Lext/mods/gameserver/enums/skills/EffectType;>;
SourceFile: "EffectType.java"
