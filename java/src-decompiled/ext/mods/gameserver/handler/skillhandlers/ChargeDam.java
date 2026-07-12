// Bytecode for: ext.mods.gameserver.handler.skillhandlers.ChargeDam
// File: ext\mods\gameserver\handler\skillhandlers\ChargeDam.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/skillhandlers/ChargeDam.class
  Last modified 9 de jul de 2026; size 11037 bytes
  MD5 checksum 1debd7a54be3e992fb7eb5f8b94a1fa5
  Compiled from "ChargeDam.java"
public class ext.mods.gameserver.handler.skillhandlers.ChargeDam implements ext.mods.gameserver.handler.ISkillHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #79                         // ext/mods/gameserver/handler/skillhandlers/ChargeDam
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 5, attributes: 1
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
   #13 = Methodref          #8.#14        // ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
   #14 = NameAndType        #15:#16       // getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
   #15 = Utf8               getActingPlayer
   #16 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #17 = Methodref          #18.#19       // ext/mods/gameserver/skills/L2Skill.getNumCharges:()I
   #18 = Class              #20           // ext/mods/gameserver/skills/L2Skill
   #19 = NameAndType        #21:#22       // getNumCharges:()I
   #20 = Utf8               ext/mods/gameserver/skills/L2Skill
   #21 = Utf8               getNumCharges
   #22 = Utf8               ()I
   #23 = Methodref          #24.#25       // ext/mods/gameserver/model/actor/Player.decreaseCharges:(I)Z
   #24 = Class              #26           // ext/mods/gameserver/model/actor/Player
   #25 = NameAndType        #27:#28       // decreaseCharges:(I)Z
   #26 = Utf8               ext/mods/gameserver/model/actor/Player
   #27 = Utf8               decreaseCharges
   #28 = Utf8               (I)Z
   #29 = Fieldref           #30.#31       // ext/mods/gameserver/enums/items/ShotType.SOULSHOT:Lext/mods/gameserver/enums/items/ShotType;
   #30 = Class              #32           // ext/mods/gameserver/enums/items/ShotType
   #31 = NameAndType        #33:#34       // SOULSHOT:Lext/mods/gameserver/enums/items/ShotType;
   #32 = Utf8               ext/mods/gameserver/enums/items/ShotType
   #33 = Utf8               SOULSHOT
   #34 = Utf8               Lext/mods/gameserver/enums/items/ShotType;
   #35 = Methodref          #8.#36        // ext/mods/gameserver/model/actor/Creature.isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
   #36 = NameAndType        #37:#38       // isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
   #37 = Utf8               isChargedShot
   #38 = Utf8               (Lext/mods/gameserver/enums/items/ShotType;)Z
   #39 = Fieldref           #30.#40       // ext/mods/gameserver/enums/items/ShotType.BLESSED_SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
   #40 = NameAndType        #41:#34       // BLESSED_SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
   #41 = Utf8               BLESSED_SPIRITSHOT
   #42 = Methodref          #8.#43        // ext/mods/gameserver/model/actor/Creature.getActiveWeaponInstance:()Lext/mods/gameserver/model/item/instance/ItemInstance;
   #43 = NameAndType        #44:#45       // getActiveWeaponInstance:()Lext/mods/gameserver/model/item/instance/ItemInstance;
   #44 = Utf8               getActiveWeaponInstance
   #45 = Utf8               ()Lext/mods/gameserver/model/item/instance/ItemInstance;
   #46 = Methodref          #8.#47        // ext/mods/gameserver/model/actor/Creature.isDead:()Z
   #47 = NameAndType        #48:#12       // isDead:()Z
   #48 = Utf8               isDead
   #49 = Methodref          #8.#50        // ext/mods/gameserver/model/actor/Creature.isInvul:()Z
   #50 = NameAndType        #51:#12       // isInvul:()Z
   #51 = Utf8               isInvul
   #52 = Methodref          #8.#53        // ext/mods/gameserver/model/actor/Creature.isParalyzed:()Z
   #53 = NameAndType        #54:#12       // isParalyzed:()Z
   #54 = Utf8               isParalyzed
   #55 = Class              #56           // ext/mods/gameserver/model/actor/Playable
   #56 = Utf8               ext/mods/gameserver/model/actor/Playable
   #57 = Fieldref           #58.#59       // ext/mods/gameserver/skills/effects/EffectFear.DOESNT_AFFECT_PLAYABLE:[I
   #58 = Class              #60           // ext/mods/gameserver/skills/effects/EffectFear
   #59 = NameAndType        #61:#62       // DOESNT_AFFECT_PLAYABLE:[I
   #60 = Utf8               ext/mods/gameserver/skills/effects/EffectFear
   #61 = Utf8               DOESNT_AFFECT_PLAYABLE
   #62 = Utf8               [I
   #63 = Methodref          #18.#64       // ext/mods/gameserver/skills/L2Skill.getId:()I
   #64 = NameAndType        #65:#22       // getId:()I
   #65 = Utf8               getId
   #66 = Methodref          #67.#68       // ext/mods/commons/util/ArraysUtil.contains:([II)Z
   #67 = Class              #69           // ext/mods/commons/util/ArraysUtil
   #68 = NameAndType        #70:#71       // contains:([II)Z
   #69 = Utf8               ext/mods/commons/util/ArraysUtil
   #70 = Utf8               contains
   #71 = Utf8               ([II)Z
   #72 = Methodref          #73.#74       // ext/mods/gameserver/skills/Formulas.calcShldUse:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Lext/mods/gameserver/enums/skills/ShieldDefense;
   #73 = Class              #75           // ext/mods/gameserver/skills/Formulas
   #74 = NameAndType        #76:#77       // calcShldUse:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Lext/mods/gameserver/enums/skills/ShieldDefense;
   #75 = Utf8               ext/mods/gameserver/skills/Formulas
   #76 = Utf8               calcShldUse
   #77 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Lext/mods/gameserver/enums/skills/ShieldDefense;
   #78 = Methodref          #79.#80       // ext/mods/gameserver/handler/skillhandlers/ChargeDam.handleNegateLogic:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)V
   #79 = Class              #81           // ext/mods/gameserver/handler/skillhandlers/ChargeDam
   #80 = NameAndType        #82:#83       // handleNegateLogic:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)V
   #81 = Utf8               ext/mods/gameserver/handler/skillhandlers/ChargeDam
   #82 = Utf8               handleNegateLogic
   #83 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)V
   #84 = Methodref          #18.#85       // ext/mods/gameserver/skills/L2Skill.getPower:()D
   #85 = NameAndType        #86:#87       // getPower:()D
   #86 = Utf8               getPower
   #87 = Utf8               ()D
   #88 = Methodref          #89.#90       // ext/mods/gameserver/model/item/instance/ItemInstance.getItemType:()Lext/mods/gameserver/enums/items/ItemType;
   #89 = Class              #91           // ext/mods/gameserver/model/item/instance/ItemInstance
   #90 = NameAndType        #92:#93       // getItemType:()Lext/mods/gameserver/enums/items/ItemType;
   #91 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
   #92 = Utf8               getItemType
   #93 = Utf8               ()Lext/mods/gameserver/enums/items/ItemType;
   #94 = Fieldref           #95.#96       // ext/mods/gameserver/enums/items/WeaponType.BOW:Lext/mods/gameserver/enums/items/WeaponType;
   #95 = Class              #97           // ext/mods/gameserver/enums/items/WeaponType
   #96 = NameAndType        #98:#99       // BOW:Lext/mods/gameserver/enums/items/WeaponType;
   #97 = Utf8               ext/mods/gameserver/enums/items/WeaponType
   #98 = Utf8               BOW
   #99 = Utf8               Lext/mods/gameserver/enums/items/WeaponType;
  #100 = Methodref          #73.#101      // ext/mods/gameserver/skills/Formulas.calcPhysicalSkillEvasion:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
  #101 = NameAndType        #102:#103     // calcPhysicalSkillEvasion:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
  #102 = Utf8               calcPhysicalSkillEvasion
  #103 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
  #104 = Fieldref           #105.#106     // ext/mods/gameserver/network/SystemMessageId.S1_DODGES_ATTACK:Lext/mods/gameserver/network/SystemMessageId;
  #105 = Class              #107          // ext/mods/gameserver/network/SystemMessageId
  #106 = NameAndType        #108:#109     // S1_DODGES_ATTACK:Lext/mods/gameserver/network/SystemMessageId;
  #107 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #108 = Utf8               S1_DODGES_ATTACK
  #109 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #110 = Methodref          #111.#112     // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #111 = Class              #113          // ext/mods/gameserver/network/serverpackets/SystemMessage
  #112 = NameAndType        #114:#115     // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #113 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #114 = Utf8               getSystemMessage
  #115 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #116 = Methodref          #111.#117     // ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #117 = NameAndType        #118:#119     // addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #118 = Utf8               addCharName
  #119 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #120 = Methodref          #24.#121      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #121 = NameAndType        #122:#123     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #122 = Utf8               sendPacket
  #123 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #124 = Fieldref           #105.#125     // ext/mods/gameserver/network/SystemMessageId.AVOIDED_S1_ATTACK:Lext/mods/gameserver/network/SystemMessageId;
  #125 = NameAndType        #126:#109     // AVOIDED_S1_ATTACK:Lext/mods/gameserver/network/SystemMessageId;
  #126 = Utf8               AVOIDED_S1_ATTACK
  #127 = Methodref          #73.#128      // ext/mods/gameserver/skills/Formulas.calcSkillReflect:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)B
  #128 = NameAndType        #129:#130     // calcSkillReflect:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)B
  #129 = Utf8               calcSkillReflect
  #130 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)B
  #131 = Methodref          #18.#132      // ext/mods/gameserver/skills/L2Skill.hasEffects:()Z
  #132 = NameAndType        #133:#12      // hasEffects:()Z
  #133 = Utf8               hasEffects
  #134 = Fieldref           #135.#136     // ext/mods/gameserver/enums/skills/EffectType.BLOCK_DEBUFF:Lext/mods/gameserver/enums/skills/EffectType;
  #135 = Class              #137          // ext/mods/gameserver/enums/skills/EffectType
  #136 = NameAndType        #138:#139     // BLOCK_DEBUFF:Lext/mods/gameserver/enums/skills/EffectType;
  #137 = Utf8               ext/mods/gameserver/enums/skills/EffectType
  #138 = Utf8               BLOCK_DEBUFF
  #139 = Utf8               Lext/mods/gameserver/enums/skills/EffectType;
  #140 = Methodref          #8.#141       // ext/mods/gameserver/model/actor/Creature.getFirstEffect:(Lext/mods/gameserver/enums/skills/EffectType;)Lext/mods/gameserver/skills/AbstractEffect;
  #141 = NameAndType        #142:#143     // getFirstEffect:(Lext/mods/gameserver/enums/skills/EffectType;)Lext/mods/gameserver/skills/AbstractEffect;
  #142 = Utf8               getFirstEffect
  #143 = Utf8               (Lext/mods/gameserver/enums/skills/EffectType;)Lext/mods/gameserver/skills/AbstractEffect;
  #144 = Methodref          #8.#145       // ext/mods/gameserver/model/actor/Creature.stopSkillEffects:(I)V
  #145 = NameAndType        #146:#147     // stopSkillEffects:(I)V
  #146 = Utf8               stopSkillEffects
  #147 = Utf8               (I)V
  #148 = Methodref          #18.#149      // ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #149 = NameAndType        #150:#151     // getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #150 = Utf8               getEffects
  #151 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #152 = Methodref          #18.#153      // ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Ljava/util/List;
  #153 = NameAndType        #150:#154     // getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Ljava/util/List;
  #154 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Ljava/util/List;
  #155 = Methodref          #18.#156      // ext/mods/gameserver/skills/L2Skill.getBaseCritRate:()I
  #156 = NameAndType        #157:#22      // getBaseCritRate:()I
  #157 = Utf8               getBaseCritRate
  #158 = Methodref          #73.#159      // ext/mods/gameserver/skills/Formulas.getSTRBonus:(Lext/mods/gameserver/model/actor/Creature;)D
  #159 = NameAndType        #160:#161     // getSTRBonus:(Lext/mods/gameserver/model/actor/Creature;)D
  #160 = Utf8               getSTRBonus
  #161 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)D
  #162 = Methodref          #73.#163      // ext/mods/gameserver/skills/Formulas.calcCrit:(D)Z
  #163 = NameAndType        #164:#165     // calcCrit:(D)Z
  #164 = Utf8               calcCrit
  #165 = Utf8               (D)Z
  #166 = Methodref          #73.#167      // ext/mods/gameserver/skills/Formulas.calcPhysicalSkillDamage:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/enums/skills/ShieldDefense;ZZ)D
  #167 = NameAndType        #168:#169     // calcPhysicalSkillDamage:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/enums/skills/ShieldDefense;ZZ)D
  #168 = Utf8               calcPhysicalSkillDamage
  #169 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/enums/skills/ShieldDefense;ZZ)D
  #170 = Fieldref           #105.#171     // ext/mods/gameserver/network/SystemMessageId.COUNTERED_S1_ATTACK:Lext/mods/gameserver/network/SystemMessageId;
  #171 = NameAndType        #172:#109     // COUNTERED_S1_ATTACK:Lext/mods/gameserver/network/SystemMessageId;
  #172 = Utf8               COUNTERED_S1_ATTACK
  #173 = Methodref          #8.#174       // ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
  #174 = NameAndType        #175:#176     // getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
  #175 = Utf8               getStatus
  #176 = Utf8               ()Lext/mods/gameserver/model/actor/status/CreatureStatus;
  #177 = Fieldref           #178.#179     // ext/mods/gameserver/enums/skills/Stats.COUNTER_SKILL_PHYSICAL:Lext/mods/gameserver/enums/skills/Stats;
  #178 = Class              #180          // ext/mods/gameserver/enums/skills/Stats
  #179 = NameAndType        #181:#182     // COUNTER_SKILL_PHYSICAL:Lext/mods/gameserver/enums/skills/Stats;
  #180 = Utf8               ext/mods/gameserver/enums/skills/Stats
  #181 = Utf8               COUNTER_SKILL_PHYSICAL
  #182 = Utf8               Lext/mods/gameserver/enums/skills/Stats;
  #183 = Methodref          #184.#185     // ext/mods/gameserver/model/actor/status/CreatureStatus.calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
  #184 = Class              #186          // ext/mods/gameserver/model/actor/status/CreatureStatus
  #185 = NameAndType        #187:#188     // calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
  #186 = Utf8               ext/mods/gameserver/model/actor/status/CreatureStatus
  #187 = Utf8               calcStat
  #188 = Utf8               (Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
  #189 = Double             100.0d
  #191 = Methodref          #8.#192       // ext/mods/gameserver/model/actor/Creature.reduceCurrentHp:(DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #192 = NameAndType        #193:#194     // reduceCurrentHp:(DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #193 = Utf8               reduceCurrentHp
  #194 = Utf8               (DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #195 = Methodref          #8.#196       // ext/mods/gameserver/model/actor/Creature.sendDamageMessage:(Lext/mods/gameserver/model/actor/Creature;IZZZ)V
  #196 = NameAndType        #197:#198     // sendDamageMessage:(Lext/mods/gameserver/model/actor/Creature;IZZZ)V
  #197 = Utf8               sendDamageMessage
  #198 = Utf8               (Lext/mods/gameserver/model/actor/Creature;IZZZ)V
  #199 = Methodref          #73.#200      // ext/mods/gameserver/skills/Formulas.calcCastBreak:(Lext/mods/gameserver/model/actor/Creature;D)V
  #200 = NameAndType        #201:#202     // calcCastBreak:(Lext/mods/gameserver/model/actor/Creature;D)V
  #201 = Utf8               calcCastBreak
  #202 = Utf8               (Lext/mods/gameserver/model/actor/Creature;D)V
  #203 = Methodref          #73.#204      // ext/mods/gameserver/skills/Formulas.calcLethalHit:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #204 = NameAndType        #205:#206     // calcLethalHit:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #205 = Utf8               calcLethalHit
  #206 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #207 = Fieldref           #105.#208     // ext/mods/gameserver/network/SystemMessageId.ATTACK_FAILED:Lext/mods/gameserver/network/SystemMessageId;
  #208 = NameAndType        #209:#109     // ATTACK_FAILED:Lext/mods/gameserver/network/SystemMessageId;
  #209 = Utf8               ATTACK_FAILED
  #210 = Methodref          #8.#121       // ext/mods/gameserver/model/actor/Creature.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #211 = Methodref          #18.#212      // ext/mods/gameserver/skills/L2Skill.hasSelfEffects:()Z
  #212 = NameAndType        #213:#12      // hasSelfEffects:()Z
  #213 = Utf8               hasSelfEffects
  #214 = Methodref          #8.#215       // ext/mods/gameserver/model/actor/Creature.getFirstEffect:(I)Lext/mods/gameserver/skills/AbstractEffect;
  #215 = NameAndType        #142:#216     // getFirstEffect:(I)Lext/mods/gameserver/skills/AbstractEffect;
  #216 = Utf8               (I)Lext/mods/gameserver/skills/AbstractEffect;
  #217 = Methodref          #218.#219     // ext/mods/gameserver/skills/AbstractEffect.isSelfEffect:()Z
  #218 = Class              #220          // ext/mods/gameserver/skills/AbstractEffect
  #219 = NameAndType        #221:#12      // isSelfEffect:()Z
  #220 = Utf8               ext/mods/gameserver/skills/AbstractEffect
  #221 = Utf8               isSelfEffect
  #222 = Methodref          #218.#223     // ext/mods/gameserver/skills/AbstractEffect.exit:()V
  #223 = NameAndType        #224:#6       // exit:()V
  #224 = Utf8               exit
  #225 = Methodref          #18.#226      // ext/mods/gameserver/skills/L2Skill.getEffectsSelf:(Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #226 = NameAndType        #227:#228     // getEffectsSelf:(Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #227 = Utf8               getEffectsSelf
  #228 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #229 = Methodref          #18.#230      // ext/mods/gameserver/skills/L2Skill.getFlyType:()Lext/mods/gameserver/enums/skills/FlyType;
  #230 = NameAndType        #231:#232     // getFlyType:()Lext/mods/gameserver/enums/skills/FlyType;
  #231 = Utf8               getFlyType
  #232 = Utf8               ()Lext/mods/gameserver/enums/skills/FlyType;
  #233 = Fieldref           #234.#235     // ext/mods/gameserver/enums/skills/FlyType.CHARGE:Lext/mods/gameserver/enums/skills/FlyType;
  #234 = Class              #236          // ext/mods/gameserver/enums/skills/FlyType
  #235 = NameAndType        #237:#238     // CHARGE:Lext/mods/gameserver/enums/skills/FlyType;
  #236 = Utf8               ext/mods/gameserver/enums/skills/FlyType
  #237 = Utf8               CHARGE
  #238 = Utf8               Lext/mods/gameserver/enums/skills/FlyType;
  #239 = Methodref          #8.#240       // ext/mods/gameserver/model/actor/Creature.getHeading:()I
  #240 = NameAndType        #241:#22      // getHeading:()I
  #241 = Utf8               getHeading
  #242 = Methodref          #8.#243       // ext/mods/gameserver/model/actor/Creature.getX:()I
  #243 = NameAndType        #244:#22      // getX:()I
  #244 = Utf8               getX
  #245 = Methodref          #8.#246       // ext/mods/gameserver/model/actor/Creature.getY:()I
  #246 = NameAndType        #247:#22      // getY:()I
  #247 = Utf8               getY
  #248 = Methodref          #249.#243     // ext/mods/gameserver/model/WorldObject.getX:()I
  #249 = Class              #250          // ext/mods/gameserver/model/WorldObject
  #250 = Utf8               ext/mods/gameserver/model/WorldObject
  #251 = Methodref          #249.#246     // ext/mods/gameserver/model/WorldObject.getY:()I
  #252 = Methodref          #253.#254     // ext/mods/commons/math/MathUtil.calculateHeadingFrom:(IIII)I
  #253 = Class              #255          // ext/mods/commons/math/MathUtil
  #254 = NameAndType        #256:#257     // calculateHeadingFrom:(IIII)I
  #255 = Utf8               ext/mods/commons/math/MathUtil
  #256 = Utf8               calculateHeadingFrom
  #257 = Utf8               (IIII)I
  #258 = Methodref          #18.#259      // ext/mods/gameserver/skills/L2Skill.getFlyRadius:()I
  #259 = NameAndType        #260:#22      // getFlyRadius:()I
  #260 = Utf8               getFlyRadius
  #261 = Methodref          #253.#262     // ext/mods/commons/math/MathUtil.getNewLocationByDistanceAndHeading:(IIII)Lext/mods/gameserver/model/location/Point2D;
  #262 = NameAndType        #263:#264     // getNewLocationByDistanceAndHeading:(IIII)Lext/mods/gameserver/model/location/Point2D;
  #263 = Utf8               getNewLocationByDistanceAndHeading
  #264 = Utf8               (IIII)Lext/mods/gameserver/model/location/Point2D;
  #265 = Methodref          #266.#267     // ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
  #266 = Class              #268          // ext/mods/gameserver/geoengine/GeoEngine
  #267 = NameAndType        #269:#270     // getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
  #268 = Utf8               ext/mods/gameserver/geoengine/GeoEngine
  #269 = Utf8               getInstance
  #270 = Utf8               ()Lext/mods/gameserver/geoengine/GeoEngine;
  #271 = Methodref          #272.#243     // ext/mods/gameserver/model/location/Point2D.getX:()I
  #272 = Class              #273          // ext/mods/gameserver/model/location/Point2D
  #273 = Utf8               ext/mods/gameserver/model/location/Point2D
  #274 = Methodref          #272.#246     // ext/mods/gameserver/model/location/Point2D.getY:()I
  #275 = Methodref          #8.#276       // ext/mods/gameserver/model/actor/Creature.getZ:()I
  #276 = NameAndType        #277:#22      // getZ:()I
  #277 = Utf8               getZ
  #278 = Methodref          #266.#279     // ext/mods/gameserver/geoengine/GeoEngine.getValidLocation:(Lext/mods/gameserver/model/WorldObject;III)Lext/mods/gameserver/model/location/Location;
  #279 = NameAndType        #280:#281     // getValidLocation:(Lext/mods/gameserver/model/WorldObject;III)Lext/mods/gameserver/model/location/Location;
  #280 = Utf8               getValidLocation
  #281 = Utf8               (Lext/mods/gameserver/model/WorldObject;III)Lext/mods/gameserver/model/location/Location;
  #282 = Class              #283          // ext/mods/gameserver/network/serverpackets/FlyToLocation
  #283 = Utf8               ext/mods/gameserver/network/serverpackets/FlyToLocation
  #284 = Methodref          #285.#243     // ext/mods/gameserver/model/location/Location.getX:()I
  #285 = Class              #286          // ext/mods/gameserver/model/location/Location
  #286 = Utf8               ext/mods/gameserver/model/location/Location
  #287 = Methodref          #285.#246     // ext/mods/gameserver/model/location/Location.getY:()I
  #288 = Methodref          #285.#276     // ext/mods/gameserver/model/location/Location.getZ:()I
  #289 = Methodref          #282.#290     // ext/mods/gameserver/network/serverpackets/FlyToLocation."<init>":(Lext/mods/gameserver/model/actor/Creature;IIILext/mods/gameserver/enums/skills/FlyType;)V
  #290 = NameAndType        #5:#291       // "<init>":(Lext/mods/gameserver/model/actor/Creature;IIILext/mods/gameserver/enums/skills/FlyType;)V
  #291 = Utf8               (Lext/mods/gameserver/model/actor/Creature;IIILext/mods/gameserver/enums/skills/FlyType;)V
  #292 = Methodref          #8.#293       // ext/mods/gameserver/model/actor/Creature.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #293 = NameAndType        #294:#123     // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #294 = Utf8               broadcastPacket
  #295 = Methodref          #8.#296       // ext/mods/gameserver/model/actor/Creature.setXYZ:(III)V
  #296 = NameAndType        #297:#298     // setXYZ:(III)V
  #297 = Utf8               setXYZ
  #298 = Utf8               (III)V
  #299 = Class              #300          // ext/mods/gameserver/network/serverpackets/ValidateLocation
  #300 = Utf8               ext/mods/gameserver/network/serverpackets/ValidateLocation
  #301 = Methodref          #299.#302     // ext/mods/gameserver/network/serverpackets/ValidateLocation."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
  #302 = NameAndType        #5:#303       // "<init>":(Lext/mods/gameserver/model/actor/Creature;)V
  #303 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
  #304 = Methodref          #18.#305      // ext/mods/gameserver/skills/L2Skill.isSuicideAttack:()Z
  #305 = NameAndType        #306:#12      // isSuicideAttack:()Z
  #306 = Utf8               isSuicideAttack
  #307 = Methodref          #8.#308       // ext/mods/gameserver/model/actor/Creature.doDie:(Lext/mods/gameserver/model/actor/Creature;)Z
  #308 = NameAndType        #309:#310     // doDie:(Lext/mods/gameserver/model/actor/Creature;)Z
  #309 = Utf8               doDie
  #310 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
  #311 = Methodref          #18.#312      // ext/mods/gameserver/skills/L2Skill.isStaticReuse:()Z
  #312 = NameAndType        #313:#12      // isStaticReuse:()Z
  #313 = Utf8               isStaticReuse
  #314 = Methodref          #8.#315       // ext/mods/gameserver/model/actor/Creature.setChargedShot:(Lext/mods/gameserver/enums/items/ShotType;Z)V
  #315 = NameAndType        #316:#317     // setChargedShot:(Lext/mods/gameserver/enums/items/ShotType;Z)V
  #316 = Utf8               setChargedShot
  #317 = Utf8               (Lext/mods/gameserver/enums/items/ShotType;Z)V
  #318 = Fieldref           #30.#319      // ext/mods/gameserver/enums/items/ShotType.SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
  #319 = NameAndType        #320:#34      // SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
  #320 = Utf8               SPIRITSHOT
  #321 = Class              #322          // java/util/ArrayList
  #322 = Utf8               java/util/ArrayList
  #323 = Methodref          #321.#3       // java/util/ArrayList."<init>":()V
  #324 = Methodref          #18.#325      // ext/mods/gameserver/skills/L2Skill.getNegateId:()[I
  #325 = NameAndType        #326:#327     // getNegateId:()[I
  #326 = Utf8               getNegateId
  #327 = Utf8               ()[I
  #328 = InterfaceMethodref #329.#330     // java/util/List.add:(Ljava/lang/Object;)Z
  #329 = Class              #331          // java/util/List
  #330 = NameAndType        #332:#333     // add:(Ljava/lang/Object;)Z
  #331 = Utf8               java/util/List
  #332 = Utf8               add
  #333 = Utf8               (Ljava/lang/Object;)Z
  #334 = Methodref          #18.#335      // ext/mods/gameserver/skills/L2Skill.getNegateStats:()[Lext/mods/gameserver/enums/skills/SkillType;
  #335 = NameAndType        #336:#337     // getNegateStats:()[Lext/mods/gameserver/enums/skills/SkillType;
  #336 = Utf8               getNegateStats
  #337 = Utf8               ()[Lext/mods/gameserver/enums/skills/SkillType;
  #338 = Methodref          #8.#339       // ext/mods/gameserver/model/actor/Creature.getAllEffects:()[Lext/mods/gameserver/skills/AbstractEffect;
  #339 = NameAndType        #340:#341     // getAllEffects:()[Lext/mods/gameserver/skills/AbstractEffect;
  #340 = Utf8               getAllEffects
  #341 = Utf8               ()[Lext/mods/gameserver/skills/AbstractEffect;
  #342 = Methodref          #218.#343     // ext/mods/gameserver/skills/AbstractEffect.getTemplate:()Lext/mods/gameserver/skills/effects/EffectTemplate;
  #343 = NameAndType        #344:#345     // getTemplate:()Lext/mods/gameserver/skills/effects/EffectTemplate;
  #344 = Utf8               getTemplate
  #345 = Utf8               ()Lext/mods/gameserver/skills/effects/EffectTemplate;
  #346 = Methodref          #347.#348     // ext/mods/gameserver/skills/effects/EffectTemplate.getStackOrder:()F
  #347 = Class              #349          // ext/mods/gameserver/skills/effects/EffectTemplate
  #348 = NameAndType        #350:#351     // getStackOrder:()F
  #349 = Utf8               ext/mods/gameserver/skills/effects/EffectTemplate
  #350 = Utf8               getStackOrder
  #351 = Utf8               ()F
  #352 = Float              99.0f
  #353 = Methodref          #218.#354     // ext/mods/gameserver/skills/AbstractEffect.getSkill:()Lext/mods/gameserver/skills/L2Skill;
  #354 = NameAndType        #355:#356     // getSkill:()Lext/mods/gameserver/skills/L2Skill;
  #355 = Utf8               getSkill
  #356 = Utf8               ()Lext/mods/gameserver/skills/L2Skill;
  #357 = Methodref          #18.#358      // ext/mods/gameserver/skills/L2Skill.getNegateLvl:()I
  #358 = NameAndType        #359:#22      // getNegateLvl:()I
  #359 = Utf8               getNegateLvl
  #360 = Methodref          #18.#361      // ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
  #361 = NameAndType        #362:#363     // getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
  #362 = Utf8               getSkillType
  #363 = Utf8               ()Lext/mods/gameserver/enums/skills/SkillType;
  #364 = Methodref          #18.#365      // ext/mods/gameserver/skills/L2Skill.getEffectType:()Lext/mods/gameserver/enums/skills/SkillType;
  #365 = NameAndType        #366:#363     // getEffectType:()Lext/mods/gameserver/enums/skills/SkillType;
  #366 = Utf8               getEffectType
  #367 = Methodref          #18.#368      // ext/mods/gameserver/skills/L2Skill.getEffectAbnormalLvl:()I
  #368 = NameAndType        #369:#22      // getEffectAbnormalLvl:()I
  #369 = Utf8               getEffectAbnormalLvl
  #370 = Methodref          #18.#371      // ext/mods/gameserver/skills/L2Skill.getAbnormalLvl:()I
  #371 = NameAndType        #372:#22      // getAbnormalLvl:()I
  #372 = Utf8               getAbnormalLvl
  #373 = InterfaceMethodref #329.#374     // java/util/List.isEmpty:()Z
  #374 = NameAndType        #375:#12      // isEmpty:()Z
  #375 = Utf8               isEmpty
  #376 = Methodref          #377.#378     // ext/mods/gameserver/cancelmanager/CancelReturnManager.onNegate:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Ljava/util/List;)V
  #377 = Class              #379          // ext/mods/gameserver/cancelmanager/CancelReturnManager
  #378 = NameAndType        #380:#381     // onNegate:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Ljava/util/List;)V
  #379 = Utf8               ext/mods/gameserver/cancelmanager/CancelReturnManager
  #380 = Utf8               onNegate
  #381 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Ljava/util/List;)V
  #382 = Fieldref           #79.#383      // ext/mods/gameserver/handler/skillhandlers/ChargeDam.SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
  #383 = NameAndType        #384:#385     // SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
  #384 = Utf8               SKILL_IDS
  #385 = Utf8               [Lext/mods/gameserver/enums/skills/SkillType;
  #386 = Class              #387          // ext/mods/gameserver/enums/skills/SkillType
  #387 = Utf8               ext/mods/gameserver/enums/skills/SkillType
  #388 = Fieldref           #386.#389     // ext/mods/gameserver/enums/skills/SkillType.CHARGEDAM:Lext/mods/gameserver/enums/skills/SkillType;
  #389 = NameAndType        #390:#391     // CHARGEDAM:Lext/mods/gameserver/enums/skills/SkillType;
  #390 = Utf8               CHARGEDAM
  #391 = Utf8               Lext/mods/gameserver/enums/skills/SkillType;
  #392 = Class              #393          // ext/mods/gameserver/handler/ISkillHandler
  #393 = Utf8               ext/mods/gameserver/handler/ISkillHandler
  #394 = Utf8               Code
  #395 = Utf8               LineNumberTable
  #396 = Utf8               LocalVariableTable
  #397 = Utf8               this
  #398 = Utf8               Lext/mods/gameserver/handler/skillhandlers/ChargeDam;
  #399 = Utf8               useSkill
  #400 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #401 = Utf8               chargesNeeded
  #402 = Utf8               I
  #403 = Utf8               targetPlayer
  #404 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #405 = Utf8               isCrit
  #406 = Utf8               Z
  #407 = Utf8               damage
  #408 = Utf8               D
  #409 = Utf8               targetCreature
  #410 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #411 = Utf8               sDef
  #412 = Utf8               Lext/mods/gameserver/enums/skills/ShieldDefense;
  #413 = Utf8               reflect
  #414 = Utf8               B
  #415 = Utf8               target
  #416 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #417 = Utf8               effect
  #418 = Utf8               Lext/mods/gameserver/skills/AbstractEffect;
  #419 = Utf8               heading
  #420 = Utf8               chargePoint
  #421 = Utf8               Lext/mods/gameserver/model/location/Point2D;
  #422 = Utf8               chargeLoc
  #423 = Utf8               Lext/mods/gameserver/model/location/Location;
  #424 = Utf8               creature
  #425 = Utf8               skill
  #426 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #427 = Utf8               targets
  #428 = Utf8               [Lext/mods/gameserver/model/WorldObject;
  #429 = Utf8               item
  #430 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #431 = Utf8               player
  #432 = Utf8               ss
  #433 = Utf8               bss
  #434 = Utf8               weapon
  #435 = Utf8               StackMapTable
  #436 = Class              #428          // "[Lext/mods/gameserver/model/WorldObject;"
  #437 = Class              #438          // ext/mods/gameserver/enums/skills/ShieldDefense
  #438 = Utf8               ext/mods/gameserver/enums/skills/ShieldDefense
  #439 = Utf8               id
  #440 = Utf8               skillType
  #441 = Utf8               effectSkill
  #442 = Utf8               bsps
  #443 = Utf8               removedEffects
  #444 = Utf8               Ljava/util/List;
  #445 = Utf8               LocalVariableTypeTable
  #446 = Utf8               Ljava/util/List<Lext/mods/gameserver/skills/AbstractEffect;>;
  #447 = Class              #62           // "[I"
  #448 = Class              #449          // "[Lext/mods/gameserver/skills/AbstractEffect;"
  #449 = Utf8               [Lext/mods/gameserver/skills/AbstractEffect;
  #450 = Class              #385          // "[Lext/mods/gameserver/enums/skills/SkillType;"
  #451 = Utf8               getSkillIds
  #452 = Utf8               <clinit>
  #453 = Utf8               SourceFile
  #454 = Utf8               ChargeDam.java
{
  public ext.mods.gameserver.handler.skillhandlers.ChargeDam();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 56: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/skillhandlers/ChargeDam;

  public void useSkill(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill, ext.mods.gameserver.model.WorldObject[], ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=8, locals=20, args_size=5
         0: aload_1
         1: ifnull        11
         4: aload_1
         5: invokevirtual #7                  // Method ext/mods/gameserver/model/actor/Creature.isAlikeDead:()Z
         8: ifeq          12
        11: return
        12: aload_1
        13: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
        16: astore        5
        18: aload         5
        20: ifnull        45
        23: aload_2
        24: invokevirtual #17                 // Method ext/mods/gameserver/skills/L2Skill.getNumCharges:()I
        27: istore        6
        29: iload         6
        31: ifle          45
        34: aload         5
        36: iload         6
        38: invokevirtual #23                 // Method ext/mods/gameserver/model/actor/Player.decreaseCharges:(I)Z
        41: ifne          45
        44: return
        45: aload_1
        46: getstatic     #29                 // Field ext/mods/gameserver/enums/items/ShotType.SOULSHOT:Lext/mods/gameserver/enums/items/ShotType;
        49: invokevirtual #35                 // Method ext/mods/gameserver/model/actor/Creature.isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
        52: istore        6
        54: aload_1
        55: getstatic     #39                 // Field ext/mods/gameserver/enums/items/ShotType.BLESSED_SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
        58: invokevirtual #35                 // Method ext/mods/gameserver/model/actor/Creature.isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
        61: istore        7
        63: aload_1
        64: invokevirtual #42                 // Method ext/mods/gameserver/model/actor/Creature.getActiveWeaponInstance:()Lext/mods/gameserver/model/item/instance/ItemInstance;
        67: astore        8
        69: aload_3
        70: astore        9
        72: aload         9
        74: arraylength
        75: istore        10
        77: iconst_0
        78: istore        11
        80: iload         11
        82: iload         10
        84: if_icmpge     546
        87: aload         9
        89: iload         11
        91: aaload
        92: astore        12
        94: aload         12
        96: instanceof    #8                  // class ext/mods/gameserver/model/actor/Creature
        99: ifeq          540
       102: aload         12
       104: checkcast     #8                  // class ext/mods/gameserver/model/actor/Creature
       107: astore        13
       109: aload         13
       111: invokevirtual #46                 // Method ext/mods/gameserver/model/actor/Creature.isDead:()Z
       114: ifne          540
       117: aload         13
       119: invokevirtual #49                 // Method ext/mods/gameserver/model/actor/Creature.isInvul:()Z
       122: ifeq          136
       125: aload         13
       127: invokevirtual #52                 // Method ext/mods/gameserver/model/actor/Creature.isParalyzed:()Z
       130: ifne          136
       133: goto          540
       136: aload         12
       138: instanceof    #55                 // class ext/mods/gameserver/model/actor/Playable
       141: ifeq          160
       144: getstatic     #57                 // Field ext/mods/gameserver/skills/effects/EffectFear.DOESNT_AFFECT_PLAYABLE:[I
       147: aload_2
       148: invokevirtual #63                 // Method ext/mods/gameserver/skills/L2Skill.getId:()I
       151: invokestatic  #66                 // Method ext/mods/commons/util/ArraysUtil.contains:([II)Z
       154: ifeq          160
       157: goto          540
       160: aload_1
       161: aload         13
       163: aload_2
       164: iconst_0
       165: invokestatic  #72                 // Method ext/mods/gameserver/skills/Formulas.calcShldUse:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Lext/mods/gameserver/enums/skills/ShieldDefense;
       168: astore        14
       170: aload_0
       171: aload_1
       172: aload_2
       173: aload         13
       175: aload         14
       177: iload         7
       179: invokevirtual #78                 // Method handleNegateLogic:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)V
       182: aload_2
       183: invokevirtual #84                 // Method ext/mods/gameserver/skills/L2Skill.getPower:()D
       186: dconst_0
       187: dcmpl
       188: ifle          270
       191: aload         8
       193: ifnull        270
       196: aload         8
       198: invokevirtual #88                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemType:()Lext/mods/gameserver/enums/items/ItemType;
       201: getstatic     #94                 // Field ext/mods/gameserver/enums/items/WeaponType.BOW:Lext/mods/gameserver/enums/items/WeaponType;
       204: if_acmpeq     270
       207: aload         13
       209: aload_2
       210: invokestatic  #100                // Method ext/mods/gameserver/skills/Formulas.calcPhysicalSkillEvasion:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
       213: ifeq          270
       216: aload         5
       218: ifnull        237
       221: aload         5
       223: getstatic     #104                // Field ext/mods/gameserver/network/SystemMessageId.S1_DODGES_ATTACK:Lext/mods/gameserver/network/SystemMessageId;
       226: invokestatic  #110                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       229: aload         13
       231: invokevirtual #116                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       234: invokevirtual #120                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       237: aload         12
       239: instanceof    #24                 // class ext/mods/gameserver/model/actor/Player
       242: ifeq          267
       245: aload         12
       247: checkcast     #24                 // class ext/mods/gameserver/model/actor/Player
       250: astore        15
       252: aload         15
       254: getstatic     #124                // Field ext/mods/gameserver/network/SystemMessageId.AVOIDED_S1_ATTACK:Lext/mods/gameserver/network/SystemMessageId;
       257: invokestatic  #110                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       260: aload_1
       261: invokevirtual #116                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       264: invokevirtual #120                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       267: goto          540
       270: aload         13
       272: aload_2
       273: invokestatic  #127                // Method ext/mods/gameserver/skills/Formulas.calcSkillReflect:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)B
       276: istore        15
       278: aload_2
       279: invokevirtual #131                // Method ext/mods/gameserver/skills/L2Skill.hasEffects:()Z
       282: ifeq          342
       285: aload         13
       287: getstatic     #134                // Field ext/mods/gameserver/enums/skills/EffectType.BLOCK_DEBUFF:Lext/mods/gameserver/enums/skills/EffectType;
       290: invokevirtual #140                // Method ext/mods/gameserver/model/actor/Creature.getFirstEffect:(Lext/mods/gameserver/enums/skills/EffectType;)Lext/mods/gameserver/skills/AbstractEffect;
       293: ifnonnull     342
       296: iload         15
       298: iconst_1
       299: iand
       300: ifeq          322
       303: aload_1
       304: aload_2
       305: invokevirtual #63                 // Method ext/mods/gameserver/skills/L2Skill.getId:()I
       308: invokevirtual #144                // Method ext/mods/gameserver/model/actor/Creature.stopSkillEffects:(I)V
       311: aload_2
       312: aload         13
       314: aload_1
       315: invokevirtual #148                // Method ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
       318: pop
       319: goto          342
       322: aload         13
       324: aload_2
       325: invokevirtual #63                 // Method ext/mods/gameserver/skills/L2Skill.getId:()I
       328: invokevirtual #144                // Method ext/mods/gameserver/model/actor/Creature.stopSkillEffects:(I)V
       331: aload_2
       332: aload_1
       333: aload         13
       335: aload         14
       337: iconst_0
       338: invokevirtual #152                // Method ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Ljava/util/List;
       341: pop
       342: aload_2
       343: invokevirtual #84                 // Method ext/mods/gameserver/skills/L2Skill.getPower:()D
       346: dconst_0
       347: dcmpl
       348: ifle          540
       351: aload_2
       352: invokevirtual #155                // Method ext/mods/gameserver/skills/L2Skill.getBaseCritRate:()I
       355: ifle          381
       358: aload_2
       359: invokevirtual #155                // Method ext/mods/gameserver/skills/L2Skill.getBaseCritRate:()I
       362: bipush        10
       364: imul
       365: i2d
       366: aload_1
       367: invokestatic  #158                // Method ext/mods/gameserver/skills/Formulas.getSTRBonus:(Lext/mods/gameserver/model/actor/Creature;)D
       370: dmul
       371: invokestatic  #162                // Method ext/mods/gameserver/skills/Formulas.calcCrit:(D)Z
       374: ifeq          381
       377: iconst_1
       378: goto          382
       381: iconst_0
       382: istore        16
       384: aload_1
       385: aload         13
       387: aload_2
       388: aload         14
       390: iload         16
       392: iload         6
       394: invokestatic  #166                // Method ext/mods/gameserver/skills/Formulas.calcPhysicalSkillDamage:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/enums/skills/ShieldDefense;ZZ)D
       397: dstore        17
       399: dload         17
       401: dconst_0
       402: dcmpl
       403: ifle          530
       406: iload         15
       408: iconst_2
       409: iand
       410: ifeq          491
       413: aload         12
       415: instanceof    #24                 // class ext/mods/gameserver/model/actor/Player
       418: ifeq          443
       421: aload         12
       423: checkcast     #24                 // class ext/mods/gameserver/model/actor/Player
       426: astore        19
       428: aload         19
       430: getstatic     #170                // Field ext/mods/gameserver/network/SystemMessageId.COUNTERED_S1_ATTACK:Lext/mods/gameserver/network/SystemMessageId;
       433: invokestatic  #110                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       436: aload_1
       437: invokevirtual #116                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       440: invokevirtual #120                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       443: dload         17
       445: aload         13
       447: invokevirtual #173                // Method ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
       450: getstatic     #177                // Field ext/mods/gameserver/enums/skills/Stats.COUNTER_SKILL_PHYSICAL:Lext/mods/gameserver/enums/skills/Stats;
       453: dconst_0
       454: aload         13
       456: aconst_null
       457: invokevirtual #183                // Method ext/mods/gameserver/model/actor/status/CreatureStatus.calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
       460: ldc2_w        #189                // double 100.0d
       463: ddiv
       464: dmul
       465: dstore        17
       467: aload_1
       468: dload         17
       470: aload         13
       472: aload_2
       473: invokevirtual #191                // Method ext/mods/gameserver/model/actor/Creature.reduceCurrentHp:(DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
       476: aload         13
       478: aload_1
       479: dload         17
       481: d2i
       482: iconst_0
       483: iconst_0
       484: iconst_0
       485: invokevirtual #195                // Method ext/mods/gameserver/model/actor/Creature.sendDamageMessage:(Lext/mods/gameserver/model/actor/Creature;IZZZ)V
       488: goto          520
       491: aload         13
       493: dload         17
       495: invokestatic  #199                // Method ext/mods/gameserver/skills/Formulas.calcCastBreak:(Lext/mods/gameserver/model/actor/Creature;D)V
       498: aload         13
       500: dload         17
       502: aload_1
       503: aload_2
       504: invokevirtual #191                // Method ext/mods/gameserver/model/actor/Creature.reduceCurrentHp:(DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
       507: aload_1
       508: aload         13
       510: dload         17
       512: d2i
       513: iconst_0
       514: iload         16
       516: iconst_0
       517: invokevirtual #195                // Method ext/mods/gameserver/model/actor/Creature.sendDamageMessage:(Lext/mods/gameserver/model/actor/Creature;IZZZ)V
       520: aload_1
       521: aload         13
       523: aload_2
       524: invokestatic  #203                // Method ext/mods/gameserver/skills/Formulas.calcLethalHit:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
       527: goto          540
       530: aload_1
       531: getstatic     #207                // Field ext/mods/gameserver/network/SystemMessageId.ATTACK_FAILED:Lext/mods/gameserver/network/SystemMessageId;
       534: invokestatic  #110                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       537: invokevirtual #210                // Method ext/mods/gameserver/model/actor/Creature.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       540: iinc          11, 1
       543: goto          80
       546: aload_2
       547: invokevirtual #211                // Method ext/mods/gameserver/skills/L2Skill.hasSelfEffects:()Z
       550: ifeq          587
       553: aload_1
       554: aload_2
       555: invokevirtual #63                 // Method ext/mods/gameserver/skills/L2Skill.getId:()I
       558: invokevirtual #214                // Method ext/mods/gameserver/model/actor/Creature.getFirstEffect:(I)Lext/mods/gameserver/skills/AbstractEffect;
       561: astore        9
       563: aload         9
       565: ifnull        581
       568: aload         9
       570: invokevirtual #217                // Method ext/mods/gameserver/skills/AbstractEffect.isSelfEffect:()Z
       573: ifeq          581
       576: aload         9
       578: invokevirtual #222                // Method ext/mods/gameserver/skills/AbstractEffect.exit:()V
       581: aload_2
       582: aload_1
       583: invokevirtual #225                // Method ext/mods/gameserver/skills/L2Skill.getEffectsSelf:(Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
       586: pop
       587: aload_2
       588: invokevirtual #229                // Method ext/mods/gameserver/skills/L2Skill.getFlyType:()Lext/mods/gameserver/enums/skills/FlyType;
       591: getstatic     #233                // Field ext/mods/gameserver/enums/skills/FlyType.CHARGE:Lext/mods/gameserver/enums/skills/FlyType;
       594: if_acmpne     736
       597: aload_1
       598: invokevirtual #239                // Method ext/mods/gameserver/model/actor/Creature.getHeading:()I
       601: istore        9
       603: aload_3
       604: arraylength
       605: ifle          633
       608: aload_1
       609: invokevirtual #242                // Method ext/mods/gameserver/model/actor/Creature.getX:()I
       612: aload_1
       613: invokevirtual #245                // Method ext/mods/gameserver/model/actor/Creature.getY:()I
       616: aload_3
       617: iconst_0
       618: aaload
       619: invokevirtual #248                // Method ext/mods/gameserver/model/WorldObject.getX:()I
       622: aload_3
       623: iconst_0
       624: aaload
       625: invokevirtual #251                // Method ext/mods/gameserver/model/WorldObject.getY:()I
       628: invokestatic  #252                // Method ext/mods/commons/math/MathUtil.calculateHeadingFrom:(IIII)I
       631: istore        9
       633: aload_1
       634: invokevirtual #242                // Method ext/mods/gameserver/model/actor/Creature.getX:()I
       637: aload_1
       638: invokevirtual #245                // Method ext/mods/gameserver/model/actor/Creature.getY:()I
       641: iload         9
       643: aload_2
       644: invokevirtual #258                // Method ext/mods/gameserver/skills/L2Skill.getFlyRadius:()I
       647: invokestatic  #261                // Method ext/mods/commons/math/MathUtil.getNewLocationByDistanceAndHeading:(IIII)Lext/mods/gameserver/model/location/Point2D;
       650: astore        10
       652: invokestatic  #265                // Method ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
       655: aload_1
       656: aload         10
       658: invokevirtual #271                // Method ext/mods/gameserver/model/location/Point2D.getX:()I
       661: aload         10
       663: invokevirtual #274                // Method ext/mods/gameserver/model/location/Point2D.getY:()I
       666: aload_1
       667: invokevirtual #275                // Method ext/mods/gameserver/model/actor/Creature.getZ:()I
       670: invokevirtual #278                // Method ext/mods/gameserver/geoengine/GeoEngine.getValidLocation:(Lext/mods/gameserver/model/WorldObject;III)Lext/mods/gameserver/model/location/Location;
       673: astore        11
       675: aload_1
       676: new           #282                // class ext/mods/gameserver/network/serverpackets/FlyToLocation
       679: dup
       680: aload_1
       681: aload         11
       683: invokevirtual #284                // Method ext/mods/gameserver/model/location/Location.getX:()I
       686: aload         11
       688: invokevirtual #287                // Method ext/mods/gameserver/model/location/Location.getY:()I
       691: aload         11
       693: invokevirtual #288                // Method ext/mods/gameserver/model/location/Location.getZ:()I
       696: getstatic     #233                // Field ext/mods/gameserver/enums/skills/FlyType.CHARGE:Lext/mods/gameserver/enums/skills/FlyType;
       699: invokespecial #289                // Method ext/mods/gameserver/network/serverpackets/FlyToLocation."<init>":(Lext/mods/gameserver/model/actor/Creature;IIILext/mods/gameserver/enums/skills/FlyType;)V
       702: invokevirtual #292                // Method ext/mods/gameserver/model/actor/Creature.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       705: aload_1
       706: aload         11
       708: invokevirtual #284                // Method ext/mods/gameserver/model/location/Location.getX:()I
       711: aload         11
       713: invokevirtual #287                // Method ext/mods/gameserver/model/location/Location.getY:()I
       716: aload         11
       718: invokevirtual #288                // Method ext/mods/gameserver/model/location/Location.getZ:()I
       721: invokevirtual #295                // Method ext/mods/gameserver/model/actor/Creature.setXYZ:(III)V
       724: aload_1
       725: new           #299                // class ext/mods/gameserver/network/serverpackets/ValidateLocation
       728: dup
       729: aload_1
       730: invokespecial #301                // Method ext/mods/gameserver/network/serverpackets/ValidateLocation."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
       733: invokevirtual #292                // Method ext/mods/gameserver/model/actor/Creature.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       736: aload_2
       737: invokevirtual #304                // Method ext/mods/gameserver/skills/L2Skill.isSuicideAttack:()Z
       740: ifeq          749
       743: aload_1
       744: aload_1
       745: invokevirtual #307                // Method ext/mods/gameserver/model/actor/Creature.doDie:(Lext/mods/gameserver/model/actor/Creature;)Z
       748: pop
       749: aload_2
       750: invokevirtual #84                 // Method ext/mods/gameserver/skills/L2Skill.getPower:()D
       753: dconst_0
       754: dcmpl
       755: ifle          772
       758: aload_1
       759: getstatic     #29                 // Field ext/mods/gameserver/enums/items/ShotType.SOULSHOT:Lext/mods/gameserver/enums/items/ShotType;
       762: aload_2
       763: invokevirtual #311                // Method ext/mods/gameserver/skills/L2Skill.isStaticReuse:()Z
       766: invokevirtual #314                // Method ext/mods/gameserver/model/actor/Creature.setChargedShot:(Lext/mods/gameserver/enums/items/ShotType;Z)V
       769: goto          794
       772: aload_1
       773: iload         7
       775: ifeq          784
       778: getstatic     #39                 // Field ext/mods/gameserver/enums/items/ShotType.BLESSED_SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
       781: goto          787
       784: getstatic     #318                // Field ext/mods/gameserver/enums/items/ShotType.SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
       787: aload_2
       788: invokevirtual #311                // Method ext/mods/gameserver/skills/L2Skill.isStaticReuse:()Z
       791: invokevirtual #314                // Method ext/mods/gameserver/model/actor/Creature.setChargedShot:(Lext/mods/gameserver/enums/items/ShotType;Z)V
       794: return
      LineNumberTable:
        line 66: 0
        line 67: 11
        line 69: 12
        line 71: 18
        line 73: 23
        line 74: 29
        line 76: 34
        line 78: 44
        line 83: 45
        line 84: 54
        line 85: 63
        line 87: 69
        line 89: 94
        line 92: 109
        line 93: 133
        line 95: 136
        line 96: 157
        line 98: 160
        line 100: 170
        line 102: 182
        line 104: 216
        line 105: 221
        line 107: 237
        line 108: 252
        line 110: 267
        line 113: 270
        line 114: 278
        line 116: 296
        line 118: 303
        line 119: 311
        line 123: 322
        line 124: 331
        line 128: 342
        line 130: 351
        line 131: 384
        line 133: 399
        line 135: 406
        line 137: 413
        line 138: 428
        line 140: 443
        line 141: 467
        line 142: 476
        line 146: 491
        line 147: 498
        line 148: 507
        line 150: 520
        line 154: 530
        line 87: 540
        line 159: 546
        line 161: 553
        line 162: 563
        line 163: 576
        line 165: 581
        line 168: 587
        line 170: 597
        line 171: 603
        line 172: 608
        line 174: 633
        line 175: 652
        line 177: 675
        line 178: 705
        line 179: 724
        line 182: 736
        line 183: 743
        line 185: 749
        line 186: 758
        line 188: 772
        line 189: 794
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           29      16     6 chargesNeeded   I
          252      15    15 targetPlayer   Lext/mods/gameserver/model/actor/Player;
          428      15    19 targetPlayer   Lext/mods/gameserver/model/actor/Player;
          384     156    16 isCrit   Z
          399     141    17 damage   D
          109     431    13 targetCreature   Lext/mods/gameserver/model/actor/Creature;
          170     370    14  sDef   Lext/mods/gameserver/enums/skills/ShieldDefense;
          278     262    15 reflect   B
           94     446    12 target   Lext/mods/gameserver/model/WorldObject;
          563      24     9 effect   Lext/mods/gameserver/skills/AbstractEffect;
          603     133     9 heading   I
          652      84    10 chargePoint   Lext/mods/gameserver/model/location/Point2D;
          675      61    11 chargeLoc   Lext/mods/gameserver/model/location/Location;
            0     795     0  this   Lext/mods/gameserver/handler/skillhandlers/ChargeDam;
            0     795     1 creature   Lext/mods/gameserver/model/actor/Creature;
            0     795     2 skill   Lext/mods/gameserver/skills/L2Skill;
            0     795     3 targets   [Lext/mods/gameserver/model/WorldObject;
            0     795     4  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
           18     777     5 player   Lext/mods/gameserver/model/actor/Player;
           54     741     6    ss   Z
           63     732     7   bss   Z
           69     726     8 weapon   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 28
        frame_type = 11 /* same */
        frame_type = 0 /* same */
        frame_type = 252 /* append */
          offset_delta = 32
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 255 /* full_frame */
          offset_delta = 34
          locals = [ class ext/mods/gameserver/handler/skillhandlers/ChargeDam, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/skills/L2Skill, class "[Lext/mods/gameserver/model/WorldObject;", class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/model/actor/Player, int, int, class ext/mods/gameserver/model/item/instance/ItemInstance, class "[Lext/mods/gameserver/model/WorldObject;", int, int ]
          stack = []
        frame_type = 253 /* append */
          offset_delta = 55
          locals = [ class ext/mods/gameserver/model/WorldObject, class ext/mods/gameserver/model/actor/Creature ]
        frame_type = 23 /* same */
        frame_type = 252 /* append */
          offset_delta = 76
          locals = [ class ext/mods/gameserver/enums/skills/ShieldDefense ]
        frame_type = 29 /* same */
        frame_type = 2 /* same */
        frame_type = 252 /* append */
          offset_delta = 51
          locals = [ int ]
        frame_type = 19 /* same */
        frame_type = 38 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 253 /* append */
          offset_delta = 60
          locals = [ int, double ]
        frame_type = 47 /* same */
        frame_type = 28 /* same */
        frame_type = 9 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 9
          locals = [ class ext/mods/gameserver/handler/skillhandlers/ChargeDam, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/skills/L2Skill, class "[Lext/mods/gameserver/model/WorldObject;", class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/model/actor/Player, int, int, class ext/mods/gameserver/model/item/instance/ItemInstance, class "[Lext/mods/gameserver/model/WorldObject;", int, int ]
          stack = []
        frame_type = 248 /* chop */
          offset_delta = 5
        frame_type = 252 /* append */
          offset_delta = 34
          locals = [ class ext/mods/gameserver/skills/AbstractEffect ]
        frame_type = 250 /* chop */
          offset_delta = 5
        frame_type = 252 /* append */
          offset_delta = 45
          locals = [ int ]
        frame_type = 250 /* chop */
          offset_delta = 102
        frame_type = 12 /* same */
        frame_type = 22 /* same */
        frame_type = 75 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/actor/Creature ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/handler/skillhandlers/ChargeDam, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/skills/L2Skill, class "[Lext/mods/gameserver/model/WorldObject;", class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/model/actor/Player, int, int, class ext/mods/gameserver/model/item/instance/ItemInstance ]
          stack = [ class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/enums/items/ShotType ]
        frame_type = 6 /* same */

  public ext.mods.gameserver.enums.skills.SkillType[] getSkillIds();
    descriptor: ()[Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #382                // Field SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
         3: areturn
      LineNumberTable:
        line 258: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/skillhandlers/ChargeDam;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: anewarray     #386                // class ext/mods/gameserver/enums/skills/SkillType
         4: dup
         5: iconst_0
         6: getstatic     #388                // Field ext/mods/gameserver/enums/skills/SkillType.CHARGEDAM:Lext/mods/gameserver/enums/skills/SkillType;
         9: aastore
        10: putstatic     #382                // Field SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
        13: return
      LineNumberTable:
        line 58: 0
}
SourceFile: "ChargeDam.java"
