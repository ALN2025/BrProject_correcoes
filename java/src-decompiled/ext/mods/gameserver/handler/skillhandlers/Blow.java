// Bytecode for: ext.mods.gameserver.handler.skillhandlers.Blow
// File: ext\mods\gameserver\handler\skillhandlers\Blow.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/skillhandlers/Blow.class
  Last modified 9 de jul de 2026; size 6759 bytes
  MD5 checksum 8750e2053b28699562e45b0982d77bc0
  Compiled from "Blow.java"
public class ext.mods.gameserver.handler.skillhandlers.Blow implements ext.mods.gameserver.handler.ISkillHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #189                        // ext/mods/gameserver/handler/skillhandlers/Blow
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 4, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/model/actor/Creature.isAlikeDead:()Z
    #8 = Class              #10           // ext/mods/gameserver/model/actor/Creature
    #9 = NameAndType        #11:#12       // isAlikeDead:()Z
   #10 = Utf8               ext/mods/gameserver/model/actor/Creature
   #11 = Utf8               isAlikeDead
   #12 = Utf8               ()Z
   #13 = Fieldref           #14.#15       // ext/mods/gameserver/enums/items/ShotType.SOULSHOT:Lext/mods/gameserver/enums/items/ShotType;
   #14 = Class              #16           // ext/mods/gameserver/enums/items/ShotType
   #15 = NameAndType        #17:#18       // SOULSHOT:Lext/mods/gameserver/enums/items/ShotType;
   #16 = Utf8               ext/mods/gameserver/enums/items/ShotType
   #17 = Utf8               SOULSHOT
   #18 = Utf8               Lext/mods/gameserver/enums/items/ShotType;
   #19 = Methodref          #8.#20        // ext/mods/gameserver/model/actor/Creature.isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
   #20 = NameAndType        #21:#22       // isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
   #21 = Utf8               isChargedShot
   #22 = Utf8               (Lext/mods/gameserver/enums/items/ShotType;)Z
   #23 = Methodref          #24.#25       // ext/mods/gameserver/skills/Formulas.calcBlowRate:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
   #24 = Class              #26           // ext/mods/gameserver/skills/Formulas
   #25 = NameAndType        #27:#28       // calcBlowRate:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
   #26 = Utf8               ext/mods/gameserver/skills/Formulas
   #27 = Utf8               calcBlowRate
   #28 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
   #29 = Methodref          #24.#30       // ext/mods/gameserver/skills/Formulas.calcPhysicalSkillEvasion:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
   #30 = NameAndType        #31:#32       // calcPhysicalSkillEvasion:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
   #31 = Utf8               calcPhysicalSkillEvasion
   #32 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
   #33 = Class              #34           // ext/mods/gameserver/model/actor/Player
   #34 = Utf8               ext/mods/gameserver/model/actor/Player
   #35 = Fieldref           #36.#37       // ext/mods/gameserver/network/SystemMessageId.S1_DODGES_ATTACK:Lext/mods/gameserver/network/SystemMessageId;
   #36 = Class              #38           // ext/mods/gameserver/network/SystemMessageId
   #37 = NameAndType        #39:#40       // S1_DODGES_ATTACK:Lext/mods/gameserver/network/SystemMessageId;
   #38 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #39 = Utf8               S1_DODGES_ATTACK
   #40 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #41 = Methodref          #42.#43       // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #42 = Class              #44           // ext/mods/gameserver/network/serverpackets/SystemMessage
   #43 = NameAndType        #45:#46       // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #44 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
   #45 = Utf8               getSystemMessage
   #46 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #47 = Methodref          #42.#48       // ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #48 = NameAndType        #49:#50       // addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #49 = Utf8               addCharName
   #50 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #51 = Methodref          #33.#52       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #52 = NameAndType        #53:#54       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #53 = Utf8               sendPacket
   #54 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #55 = Fieldref           #36.#56       // ext/mods/gameserver/network/SystemMessageId.AVOIDED_S1_ATTACK:Lext/mods/gameserver/network/SystemMessageId;
   #56 = NameAndType        #57:#40       // AVOIDED_S1_ATTACK:Lext/mods/gameserver/network/SystemMessageId;
   #57 = Utf8               AVOIDED_S1_ATTACK
   #58 = Methodref          #59.#60       // ext/mods/gameserver/skills/L2Skill.getBaseCritRate:()I
   #59 = Class              #61           // ext/mods/gameserver/skills/L2Skill
   #60 = NameAndType        #62:#63       // getBaseCritRate:()I
   #61 = Utf8               ext/mods/gameserver/skills/L2Skill
   #62 = Utf8               getBaseCritRate
   #63 = Utf8               ()I
   #64 = Methodref          #24.#65       // ext/mods/gameserver/skills/Formulas.getSTRBonus:(Lext/mods/gameserver/model/actor/Creature;)D
   #65 = NameAndType        #66:#67       // getSTRBonus:(Lext/mods/gameserver/model/actor/Creature;)D
   #66 = Utf8               getSTRBonus
   #67 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)D
   #68 = Methodref          #24.#69       // ext/mods/gameserver/skills/Formulas.calcCrit:(D)Z
   #69 = NameAndType        #70:#71       // calcCrit:(D)Z
   #70 = Utf8               calcCrit
   #71 = Utf8               (D)Z
   #72 = Methodref          #24.#73       // ext/mods/gameserver/skills/Formulas.calcShldUse:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Lext/mods/gameserver/enums/skills/ShieldDefense;
   #73 = NameAndType        #74:#75       // calcShldUse:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Lext/mods/gameserver/enums/skills/ShieldDefense;
   #74 = Utf8               calcShldUse
   #75 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Lext/mods/gameserver/enums/skills/ShieldDefense;
   #76 = Methodref          #24.#77       // ext/mods/gameserver/skills/Formulas.calcSkillReflect:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)B
   #77 = NameAndType        #78:#79       // calcSkillReflect:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)B
   #78 = Utf8               calcSkillReflect
   #79 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)B
   #80 = Methodref          #59.#81       // ext/mods/gameserver/skills/L2Skill.hasEffects:()Z
   #81 = NameAndType        #82:#12       // hasEffects:()Z
   #82 = Utf8               hasEffects
   #83 = Methodref          #59.#84       // ext/mods/gameserver/skills/L2Skill.getId:()I
   #84 = NameAndType        #85:#63       // getId:()I
   #85 = Utf8               getId
   #86 = Methodref          #8.#87        // ext/mods/gameserver/model/actor/Creature.stopSkillEffects:(I)V
   #87 = NameAndType        #88:#89       // stopSkillEffects:(I)V
   #88 = Utf8               stopSkillEffects
   #89 = Utf8               (I)V
   #90 = Methodref          #59.#91       // ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
   #91 = NameAndType        #92:#93       // getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
   #92 = Utf8               getEffects
   #93 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
   #94 = Methodref          #24.#95       // ext/mods/gameserver/skills/Formulas.calcSkillSuccess:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Z
   #95 = NameAndType        #96:#97       // calcSkillSuccess:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Z
   #96 = Utf8               calcSkillSuccess
   #97 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Z
   #98 = Methodref          #59.#99       // ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Ljava/util/List;
   #99 = NameAndType        #92:#100      // getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Ljava/util/List;
  #100 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Ljava/util/List;
  #101 = Fieldref           #36.#102      // ext/mods/gameserver/network/SystemMessageId.S1_RESISTED_YOUR_S2:Lext/mods/gameserver/network/SystemMessageId;
  #102 = NameAndType        #103:#40      // S1_RESISTED_YOUR_S2:Lext/mods/gameserver/network/SystemMessageId;
  #103 = Utf8               S1_RESISTED_YOUR_S2
  #104 = Methodref          #42.#105      // ext/mods/gameserver/network/serverpackets/SystemMessage.addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #105 = NameAndType        #106:#107     // addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #106 = Utf8               addSkillName
  #107 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #108 = Methodref          #8.#52        // ext/mods/gameserver/model/actor/Creature.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #109 = Methodref          #24.#110      // ext/mods/gameserver/skills/Formulas.calcBlowDamage:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)D
  #110 = NameAndType        #111:#112     // calcBlowDamage:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)D
  #111 = Utf8               calcBlowDamage
  #112 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)D
  #113 = Class              #114          // ext/mods/gameserver/network/serverpackets/PlaySound
  #114 = Utf8               ext/mods/gameserver/network/serverpackets/PlaySound
  #115 = String             #116          // skillsound.critical_hit_02
  #116 = Utf8               skillsound.critical_hit_02
  #117 = Methodref          #113.#118     // ext/mods/gameserver/network/serverpackets/PlaySound."<init>":(Ljava/lang/String;)V
  #118 = NameAndType        #5:#119       // "<init>":(Ljava/lang/String;)V
  #119 = Utf8               (Ljava/lang/String;)V
  #120 = Double             2.0d
  #122 = Fieldref           #36.#123      // ext/mods/gameserver/network/SystemMessageId.COUNTERED_S1_ATTACK:Lext/mods/gameserver/network/SystemMessageId;
  #123 = NameAndType        #124:#40      // COUNTERED_S1_ATTACK:Lext/mods/gameserver/network/SystemMessageId;
  #124 = Utf8               COUNTERED_S1_ATTACK
  #125 = Fieldref           #36.#126      // ext/mods/gameserver/network/SystemMessageId.S1_PERFORMING_COUNTERATTACK:Lext/mods/gameserver/network/SystemMessageId;
  #126 = NameAndType        #127:#40      // S1_PERFORMING_COUNTERATTACK:Lext/mods/gameserver/network/SystemMessageId;
  #127 = Utf8               S1_PERFORMING_COUNTERATTACK
  #128 = Methodref          #8.#129       // ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
  #129 = NameAndType        #130:#131     // getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
  #130 = Utf8               getStatus
  #131 = Utf8               ()Lext/mods/gameserver/model/actor/status/CreatureStatus;
  #132 = Fieldref           #133.#134     // ext/mods/gameserver/enums/skills/Stats.COUNTER_SKILL_PHYSICAL:Lext/mods/gameserver/enums/skills/Stats;
  #133 = Class              #135          // ext/mods/gameserver/enums/skills/Stats
  #134 = NameAndType        #136:#137     // COUNTER_SKILL_PHYSICAL:Lext/mods/gameserver/enums/skills/Stats;
  #135 = Utf8               ext/mods/gameserver/enums/skills/Stats
  #136 = Utf8               COUNTER_SKILL_PHYSICAL
  #137 = Utf8               Lext/mods/gameserver/enums/skills/Stats;
  #138 = Methodref          #139.#140     // ext/mods/gameserver/model/actor/status/CreatureStatus.calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
  #139 = Class              #141          // ext/mods/gameserver/model/actor/status/CreatureStatus
  #140 = NameAndType        #142:#143     // calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
  #141 = Utf8               ext/mods/gameserver/model/actor/status/CreatureStatus
  #142 = Utf8               calcStat
  #143 = Utf8               (Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
  #144 = Double             100.0d
  #146 = Methodref          #8.#147       // ext/mods/gameserver/model/actor/Creature.reduceCurrentHp:(DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #147 = NameAndType        #148:#149     // reduceCurrentHp:(DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #148 = Utf8               reduceCurrentHp
  #149 = Utf8               (DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #150 = Methodref          #8.#151       // ext/mods/gameserver/model/actor/Creature.sendDamageMessage:(Lext/mods/gameserver/model/actor/Creature;IZZZ)V
  #151 = NameAndType        #152:#153     // sendDamageMessage:(Lext/mods/gameserver/model/actor/Creature;IZZZ)V
  #152 = Utf8               sendDamageMessage
  #153 = Utf8               (Lext/mods/gameserver/model/actor/Creature;IZZZ)V
  #154 = Methodref          #24.#155      // ext/mods/gameserver/skills/Formulas.calcCastBreak:(Lext/mods/gameserver/model/actor/Creature;D)V
  #155 = NameAndType        #156:#157     // calcCastBreak:(Lext/mods/gameserver/model/actor/Creature;D)V
  #156 = Utf8               calcCastBreak
  #157 = Utf8               (Lext/mods/gameserver/model/actor/Creature;D)V
  #158 = Methodref          #59.#159      // ext/mods/gameserver/skills/L2Skill.isStaticReuse:()Z
  #159 = NameAndType        #160:#12      // isStaticReuse:()Z
  #160 = Utf8               isStaticReuse
  #161 = Methodref          #8.#162       // ext/mods/gameserver/model/actor/Creature.setChargedShot:(Lext/mods/gameserver/enums/items/ShotType;Z)V
  #162 = NameAndType        #163:#164     // setChargedShot:(Lext/mods/gameserver/enums/items/ShotType;Z)V
  #163 = Utf8               setChargedShot
  #164 = Utf8               (Lext/mods/gameserver/enums/items/ShotType;Z)V
  #165 = Methodref          #24.#166      // ext/mods/gameserver/skills/Formulas.calcLethalHit:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #166 = NameAndType        #167:#168     // calcLethalHit:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #167 = Utf8               calcLethalHit
  #168 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #169 = Methodref          #59.#170      // ext/mods/gameserver/skills/L2Skill.hasSelfEffects:()Z
  #170 = NameAndType        #171:#12      // hasSelfEffects:()Z
  #171 = Utf8               hasSelfEffects
  #172 = Methodref          #8.#173       // ext/mods/gameserver/model/actor/Creature.getFirstEffect:(I)Lext/mods/gameserver/skills/AbstractEffect;
  #173 = NameAndType        #174:#175     // getFirstEffect:(I)Lext/mods/gameserver/skills/AbstractEffect;
  #174 = Utf8               getFirstEffect
  #175 = Utf8               (I)Lext/mods/gameserver/skills/AbstractEffect;
  #176 = Methodref          #177.#178     // ext/mods/gameserver/skills/AbstractEffect.isSelfEffect:()Z
  #177 = Class              #179          // ext/mods/gameserver/skills/AbstractEffect
  #178 = NameAndType        #180:#12      // isSelfEffect:()Z
  #179 = Utf8               ext/mods/gameserver/skills/AbstractEffect
  #180 = Utf8               isSelfEffect
  #181 = Methodref          #177.#182     // ext/mods/gameserver/skills/AbstractEffect.exit:()V
  #182 = NameAndType        #183:#6       // exit:()V
  #183 = Utf8               exit
  #184 = Methodref          #59.#185      // ext/mods/gameserver/skills/L2Skill.getEffectsSelf:(Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #185 = NameAndType        #186:#187     // getEffectsSelf:(Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #186 = Utf8               getEffectsSelf
  #187 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #188 = Fieldref           #189.#190     // ext/mods/gameserver/handler/skillhandlers/Blow.SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
  #189 = Class              #191          // ext/mods/gameserver/handler/skillhandlers/Blow
  #190 = NameAndType        #192:#193     // SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
  #191 = Utf8               ext/mods/gameserver/handler/skillhandlers/Blow
  #192 = Utf8               SKILL_IDS
  #193 = Utf8               [Lext/mods/gameserver/enums/skills/SkillType;
  #194 = Class              #195          // ext/mods/gameserver/enums/skills/SkillType
  #195 = Utf8               ext/mods/gameserver/enums/skills/SkillType
  #196 = Fieldref           #194.#197     // ext/mods/gameserver/enums/skills/SkillType.BLOW:Lext/mods/gameserver/enums/skills/SkillType;
  #197 = NameAndType        #198:#199     // BLOW:Lext/mods/gameserver/enums/skills/SkillType;
  #198 = Utf8               BLOW
  #199 = Utf8               Lext/mods/gameserver/enums/skills/SkillType;
  #200 = Class              #201          // ext/mods/gameserver/handler/ISkillHandler
  #201 = Utf8               ext/mods/gameserver/handler/ISkillHandler
  #202 = Utf8               Code
  #203 = Utf8               LineNumberTable
  #204 = Utf8               LocalVariableTable
  #205 = Utf8               this
  #206 = Utf8               Lext/mods/gameserver/handler/skillhandlers/Blow;
  #207 = Utf8               useSkill
  #208 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #209 = Utf8               player
  #210 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #211 = Utf8               targetPlayer
  #212 = Utf8               counteredPercent
  #213 = Utf8               D
  #214 = Utf8               isCrit
  #215 = Utf8               Z
  #216 = Utf8               sDef
  #217 = Utf8               Lext/mods/gameserver/enums/skills/ShieldDefense;
  #218 = Utf8               reflect
  #219 = Utf8               B
  #220 = Utf8               damage
  #221 = Utf8               effect
  #222 = Utf8               Lext/mods/gameserver/skills/AbstractEffect;
  #223 = Utf8               targetCreature
  #224 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #225 = Utf8               obj
  #226 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #227 = Utf8               creature
  #228 = Utf8               skill
  #229 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #230 = Utf8               targets
  #231 = Utf8               [Lext/mods/gameserver/model/WorldObject;
  #232 = Utf8               item
  #233 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #234 = Utf8               ss
  #235 = Utf8               StackMapTable
  #236 = Class              #231          // "[Lext/mods/gameserver/model/WorldObject;"
  #237 = Class              #238          // ext/mods/gameserver/model/item/instance/ItemInstance
  #238 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
  #239 = Class              #240          // ext/mods/gameserver/model/WorldObject
  #240 = Utf8               ext/mods/gameserver/model/WorldObject
  #241 = Class              #242          // ext/mods/gameserver/enums/skills/ShieldDefense
  #242 = Utf8               ext/mods/gameserver/enums/skills/ShieldDefense
  #243 = Utf8               getSkillIds
  #244 = Utf8               ()[Lext/mods/gameserver/enums/skills/SkillType;
  #245 = Utf8               <clinit>
  #246 = Utf8               SourceFile
  #247 = Utf8               Blow.java
{
  public ext.mods.gameserver.handler.skillhandlers.Blow();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 36: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/skillhandlers/Blow;

  public void useSkill(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill, ext.mods.gameserver.model.WorldObject[], ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=18, args_size=5
         0: aload_1
         1: invokevirtual #7                  // Method ext/mods/gameserver/model/actor/Creature.isAlikeDead:()Z
         4: ifeq          8
         7: return
         8: aload_1
         9: getstatic     #13                 // Field ext/mods/gameserver/enums/items/ShotType.SOULSHOT:Lext/mods/gameserver/enums/items/ShotType;
        12: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Creature.isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
        15: istore        5
        17: aload_3
        18: astore        6
        20: aload         6
        22: arraylength
        23: istore        7
        25: iconst_0
        26: istore        8
        28: iload         8
        30: iload         7
        32: if_icmpge     540
        35: aload         6
        37: iload         8
        39: aaload
        40: astore        9
        42: aload         9
        44: instanceof    #8                  // class ext/mods/gameserver/model/actor/Creature
        47: ifeq          534
        50: aload         9
        52: checkcast     #8                  // class ext/mods/gameserver/model/actor/Creature
        55: astore        10
        57: aload         10
        59: invokevirtual #7                  // Method ext/mods/gameserver/model/actor/Creature.isAlikeDead:()Z
        62: ifeq          68
        65: goto          534
        68: aload_1
        69: aload         10
        71: aload_2
        72: invokestatic  #23                 // Method ext/mods/gameserver/skills/Formulas.calcBlowRate:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
        75: ifeq          486
        78: aload         10
        80: aload_2
        81: invokestatic  #29                 // Method ext/mods/gameserver/skills/Formulas.calcPhysicalSkillEvasion:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
        84: ifeq          149
        87: aload_1
        88: instanceof    #33                 // class ext/mods/gameserver/model/actor/Player
        91: ifeq          116
        94: aload_1
        95: checkcast     #33                 // class ext/mods/gameserver/model/actor/Player
        98: astore        11
       100: aload         11
       102: getstatic     #35                 // Field ext/mods/gameserver/network/SystemMessageId.S1_DODGES_ATTACK:Lext/mods/gameserver/network/SystemMessageId;
       105: invokestatic  #41                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       108: aload         10
       110: invokevirtual #47                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       113: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       116: aload         10
       118: instanceof    #33                 // class ext/mods/gameserver/model/actor/Player
       121: ifeq          146
       124: aload         10
       126: checkcast     #33                 // class ext/mods/gameserver/model/actor/Player
       129: astore        11
       131: aload         11
       133: getstatic     #55                 // Field ext/mods/gameserver/network/SystemMessageId.AVOIDED_S1_ATTACK:Lext/mods/gameserver/network/SystemMessageId;
       136: invokestatic  #41                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       139: aload_1
       140: invokevirtual #47                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       143: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       146: goto          534
       149: aload_2
       150: invokevirtual #58                 // Method ext/mods/gameserver/skills/L2Skill.getBaseCritRate:()I
       153: ifle          179
       156: aload_2
       157: invokevirtual #58                 // Method ext/mods/gameserver/skills/L2Skill.getBaseCritRate:()I
       160: bipush        10
       162: imul
       163: i2d
       164: aload_1
       165: invokestatic  #64                 // Method ext/mods/gameserver/skills/Formulas.getSTRBonus:(Lext/mods/gameserver/model/actor/Creature;)D
       168: dmul
       169: invokestatic  #68                 // Method ext/mods/gameserver/skills/Formulas.calcCrit:(D)Z
       172: ifeq          179
       175: iconst_1
       176: goto          180
       179: iconst_0
       180: istore        11
       182: aload_1
       183: aload         10
       185: aload_2
       186: iload         11
       188: invokestatic  #72                 // Method ext/mods/gameserver/skills/Formulas.calcShldUse:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Lext/mods/gameserver/enums/skills/ShieldDefense;
       191: astore        12
       193: aload         10
       195: aload_2
       196: invokestatic  #76                 // Method ext/mods/gameserver/skills/Formulas.calcSkillReflect:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)B
       199: istore        13
       201: aload_2
       202: invokevirtual #80                 // Method ext/mods/gameserver/skills/L2Skill.hasEffects:()Z
       205: ifeq          288
       208: iload         13
       210: iconst_1
       211: if_icmpne     233
       214: aload_1
       215: aload_2
       216: invokevirtual #83                 // Method ext/mods/gameserver/skills/L2Skill.getId:()I
       219: invokevirtual #86                 // Method ext/mods/gameserver/model/actor/Creature.stopSkillEffects:(I)V
       222: aload_2
       223: aload         10
       225: aload_1
       226: invokevirtual #90                 // Method ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
       229: pop
       230: goto          288
       233: aload         10
       235: aload_2
       236: invokevirtual #83                 // Method ext/mods/gameserver/skills/L2Skill.getId:()I
       239: invokevirtual #86                 // Method ext/mods/gameserver/model/actor/Creature.stopSkillEffects:(I)V
       242: aload_1
       243: aload         10
       245: aload_2
       246: aload         12
       248: iconst_1
       249: invokestatic  #94                 // Method ext/mods/gameserver/skills/Formulas.calcSkillSuccess:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Z
       252: ifeq          269
       255: aload_2
       256: aload_1
       257: aload         10
       259: aload         12
       261: iconst_0
       262: invokevirtual #98                 // Method ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Ljava/util/List;
       265: pop
       266: goto          288
       269: aload_1
       270: getstatic     #101                // Field ext/mods/gameserver/network/SystemMessageId.S1_RESISTED_YOUR_S2:Lext/mods/gameserver/network/SystemMessageId;
       273: invokestatic  #41                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       276: aload         10
       278: invokevirtual #47                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       281: aload_2
       282: invokevirtual #104                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       285: invokevirtual #108                // Method ext/mods/gameserver/model/actor/Creature.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       288: aload_1
       289: aload         10
       291: aload_2
       292: aload         12
       294: iload         5
       296: invokestatic  #109                // Method ext/mods/gameserver/skills/Formulas.calcBlowDamage:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)D
       299: d2i
       300: i2d
       301: dstore        14
       303: aload_1
       304: new           #113                // class ext/mods/gameserver/network/serverpackets/PlaySound
       307: dup
       308: ldc           #115                // String skillsound.critical_hit_02
       310: invokespecial #117                // Method ext/mods/gameserver/network/serverpackets/PlaySound."<init>":(Ljava/lang/String;)V
       313: invokevirtual #108                // Method ext/mods/gameserver/model/actor/Creature.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       316: iload         11
       318: ifeq          329
       321: dload         14
       323: ldc2_w        #120                // double 2.0d
       326: dmul
       327: dstore        14
       329: iload         13
       331: iconst_2
       332: iand
       333: ifeq          447
       336: aload         10
       338: instanceof    #33                 // class ext/mods/gameserver/model/actor/Player
       341: ifeq          366
       344: aload         10
       346: checkcast     #33                 // class ext/mods/gameserver/model/actor/Player
       349: astore        16
       351: aload         16
       353: getstatic     #122                // Field ext/mods/gameserver/network/SystemMessageId.COUNTERED_S1_ATTACK:Lext/mods/gameserver/network/SystemMessageId;
       356: invokestatic  #41                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       359: aload_1
       360: invokevirtual #47                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       363: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       366: aload_1
       367: instanceof    #33                 // class ext/mods/gameserver/model/actor/Player
       370: ifeq          395
       373: aload_1
       374: checkcast     #33                 // class ext/mods/gameserver/model/actor/Player
       377: astore        16
       379: aload         16
       381: getstatic     #125                // Field ext/mods/gameserver/network/SystemMessageId.S1_PERFORMING_COUNTERATTACK:Lext/mods/gameserver/network/SystemMessageId;
       384: invokestatic  #41                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       387: aload         10
       389: invokevirtual #47                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       392: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       395: aload         10
       397: invokevirtual #128                // Method ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
       400: getstatic     #132                // Field ext/mods/gameserver/enums/skills/Stats.COUNTER_SKILL_PHYSICAL:Lext/mods/gameserver/enums/skills/Stats;
       403: dconst_0
       404: aload         10
       406: aconst_null
       407: invokevirtual #138                // Method ext/mods/gameserver/model/actor/status/CreatureStatus.calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
       410: ldc2_w        #144                // double 100.0d
       413: ddiv
       414: dstore        16
       416: dload         14
       418: dload         16
       420: dmul
       421: dstore        14
       423: aload_1
       424: dload         14
       426: aload         10
       428: aload_2
       429: invokevirtual #146                // Method ext/mods/gameserver/model/actor/Creature.reduceCurrentHp:(DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
       432: aload         10
       434: aload_1
       435: dload         14
       437: d2i
       438: iconst_0
       439: iconst_1
       440: iconst_0
       441: invokevirtual #150                // Method ext/mods/gameserver/model/actor/Creature.sendDamageMessage:(Lext/mods/gameserver/model/actor/Creature;IZZZ)V
       444: goto          475
       447: aload         10
       449: dload         14
       451: invokestatic  #154                // Method ext/mods/gameserver/skills/Formulas.calcCastBreak:(Lext/mods/gameserver/model/actor/Creature;D)V
       454: aload         10
       456: dload         14
       458: aload_1
       459: aload_2
       460: invokevirtual #146                // Method ext/mods/gameserver/model/actor/Creature.reduceCurrentHp:(DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
       463: aload_1
       464: aload         10
       466: dload         14
       468: d2i
       469: iconst_0
       470: iconst_1
       471: iconst_0
       472: invokevirtual #150                // Method ext/mods/gameserver/model/actor/Creature.sendDamageMessage:(Lext/mods/gameserver/model/actor/Creature;IZZZ)V
       475: aload_1
       476: getstatic     #13                 // Field ext/mods/gameserver/enums/items/ShotType.SOULSHOT:Lext/mods/gameserver/enums/items/ShotType;
       479: aload_2
       480: invokevirtual #158                // Method ext/mods/gameserver/skills/L2Skill.isStaticReuse:()Z
       483: invokevirtual #161                // Method ext/mods/gameserver/model/actor/Creature.setChargedShot:(Lext/mods/gameserver/enums/items/ShotType;Z)V
       486: aload_1
       487: aload         10
       489: aload_2
       490: invokestatic  #165                // Method ext/mods/gameserver/skills/Formulas.calcLethalHit:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
       493: aload_2
       494: invokevirtual #169                // Method ext/mods/gameserver/skills/L2Skill.hasSelfEffects:()Z
       497: ifeq          534
       500: aload_1
       501: aload_2
       502: invokevirtual #83                 // Method ext/mods/gameserver/skills/L2Skill.getId:()I
       505: invokevirtual #172                // Method ext/mods/gameserver/model/actor/Creature.getFirstEffect:(I)Lext/mods/gameserver/skills/AbstractEffect;
       508: astore        11
       510: aload         11
       512: ifnull        528
       515: aload         11
       517: invokevirtual #176                // Method ext/mods/gameserver/skills/AbstractEffect.isSelfEffect:()Z
       520: ifeq          528
       523: aload         11
       525: invokevirtual #181                // Method ext/mods/gameserver/skills/AbstractEffect.exit:()V
       528: aload_2
       529: aload_1
       530: invokevirtual #184                // Method ext/mods/gameserver/skills/L2Skill.getEffectsSelf:(Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
       533: pop
       534: iinc          8, 1
       537: goto          28
       540: return
      LineNumberTable:
        line 46: 0
        line 47: 7
        line 49: 8
        line 51: 17
        line 53: 42
        line 56: 57
        line 57: 65
        line 59: 68
        line 61: 78
        line 63: 87
        line 64: 100
        line 66: 116
        line 67: 131
        line 69: 146
        line 72: 149
        line 73: 182
        line 74: 193
        line 76: 201
        line 78: 208
        line 80: 214
        line 82: 222
        line 86: 233
        line 88: 242
        line 89: 255
        line 91: 269
        line 95: 288
        line 96: 303
        line 98: 316
        line 99: 321
        line 101: 329
        line 103: 336
        line 104: 351
        line 106: 366
        line 107: 379
        line 109: 395
        line 111: 416
        line 113: 423
        line 115: 432
        line 116: 444
        line 119: 447
        line 121: 454
        line 123: 463
        line 126: 475
        line 129: 486
        line 131: 493
        line 133: 500
        line 134: 510
        line 135: 523
        line 137: 528
        line 51: 534
        line 140: 540
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          100      16    11 player   Lext/mods/gameserver/model/actor/Player;
          131      15    11 targetPlayer   Lext/mods/gameserver/model/actor/Player;
          351      15    16 targetPlayer   Lext/mods/gameserver/model/actor/Player;
          379      16    16 player   Lext/mods/gameserver/model/actor/Player;
          416      28    16 counteredPercent   D
          182     304    11 isCrit   Z
          193     293    12  sDef   Lext/mods/gameserver/enums/skills/ShieldDefense;
          201     285    13 reflect   B
          303     183    14 damage   D
          510      24    11 effect   Lext/mods/gameserver/skills/AbstractEffect;
           57     477    10 targetCreature   Lext/mods/gameserver/model/actor/Creature;
           42     492     9   obj   Lext/mods/gameserver/model/WorldObject;
            0     541     0  this   Lext/mods/gameserver/handler/skillhandlers/Blow;
            0     541     1 creature   Lext/mods/gameserver/model/actor/Creature;
            0     541     2 skill   Lext/mods/gameserver/skills/L2Skill;
            0     541     3 targets   [Lext/mods/gameserver/model/WorldObject;
            0     541     4  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
           17     524     5    ss   Z
      StackMapTable: number_of_entries = 20
        frame_type = 8 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/handler/skillhandlers/Blow, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/skills/L2Skill, class "[Lext/mods/gameserver/model/WorldObject;", class ext/mods/gameserver/model/item/instance/ItemInstance, int, class "[Lext/mods/gameserver/model/WorldObject;", int, int ]
          stack = []
        frame_type = 253 /* append */
          offset_delta = 39
          locals = [ class ext/mods/gameserver/model/WorldObject, class ext/mods/gameserver/model/actor/Creature ]
        frame_type = 47 /* same */
        frame_type = 29 /* same */
        frame_type = 2 /* same */
        frame_type = 29 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 254 /* append */
          offset_delta = 52
          locals = [ int, class ext/mods/gameserver/enums/skills/ShieldDefense, int ]
        frame_type = 35 /* same */
        frame_type = 18 /* same */
        frame_type = 252 /* append */
          offset_delta = 40
          locals = [ double ]
        frame_type = 36 /* same */
        frame_type = 28 /* same */
        frame_type = 51 /* same */
        frame_type = 27 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 10
          locals = [ class ext/mods/gameserver/handler/skillhandlers/Blow, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/skills/L2Skill, class "[Lext/mods/gameserver/model/WorldObject;", class ext/mods/gameserver/model/item/instance/ItemInstance, int, class "[Lext/mods/gameserver/model/WorldObject;", int, int, class ext/mods/gameserver/model/WorldObject, class ext/mods/gameserver/model/actor/Creature ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 41
          locals = [ class ext/mods/gameserver/skills/AbstractEffect ]
        frame_type = 248 /* chop */
          offset_delta = 5
        frame_type = 248 /* chop */
          offset_delta = 5

  public ext.mods.gameserver.enums.skills.SkillType[] getSkillIds();
    descriptor: ()[Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #188                // Field SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
         3: areturn
      LineNumberTable:
        line 145: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/skillhandlers/Blow;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: anewarray     #194                // class ext/mods/gameserver/enums/skills/SkillType
         4: dup
         5: iconst_0
         6: getstatic     #196                // Field ext/mods/gameserver/enums/skills/SkillType.BLOW:Lext/mods/gameserver/enums/skills/SkillType;
         9: aastore
        10: putstatic     #188                // Field SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
        13: return
      LineNumberTable:
        line 38: 0
}
SourceFile: "Blow.java"
