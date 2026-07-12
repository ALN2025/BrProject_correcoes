// Bytecode for: ext.mods.gameserver.handler.skillhandlers.Pdam
// File: ext\mods\gameserver\handler\skillhandlers\Pdam.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/skillhandlers/Pdam.class
  Last modified 9 de jul de 2026; size 9016 bytes
  MD5 checksum c1fde8a9c92951438159d1d82aab7350
  Compiled from "Pdam.java"
public class ext.mods.gameserver.handler.skillhandlers.Pdam implements ext.mods.gameserver.handler.ISkillHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #37                         // ext/mods/gameserver/handler/skillhandlers/Pdam
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 3, methods: 4, attributes: 1
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
   #17 = Fieldref           #18.#19       // ext/mods/gameserver/enums/items/ShotType.SOULSHOT:Lext/mods/gameserver/enums/items/ShotType;
   #18 = Class              #20           // ext/mods/gameserver/enums/items/ShotType
   #19 = NameAndType        #21:#22       // SOULSHOT:Lext/mods/gameserver/enums/items/ShotType;
   #20 = Utf8               ext/mods/gameserver/enums/items/ShotType
   #21 = Utf8               SOULSHOT
   #22 = Utf8               Lext/mods/gameserver/enums/items/ShotType;
   #23 = Methodref          #8.#24        // ext/mods/gameserver/model/actor/Creature.isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
   #24 = NameAndType        #25:#26       // isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
   #25 = Utf8               isChargedShot
   #26 = Utf8               (Lext/mods/gameserver/enums/items/ShotType;)Z
   #27 = Methodref          #8.#28        // ext/mods/gameserver/model/actor/Creature.getActiveWeaponInstance:()Lext/mods/gameserver/model/item/instance/ItemInstance;
   #28 = NameAndType        #29:#30       // getActiveWeaponInstance:()Lext/mods/gameserver/model/item/instance/ItemInstance;
   #29 = Utf8               getActiveWeaponInstance
   #30 = Utf8               ()Lext/mods/gameserver/model/item/instance/ItemInstance;
   #31 = Methodref          #32.#33       // ext/mods/gameserver/skills/L2Skill.getId:()I
   #32 = Class              #34           // ext/mods/gameserver/skills/L2Skill
   #33 = NameAndType        #35:#36       // getId:()I
   #34 = Utf8               ext/mods/gameserver/skills/L2Skill
   #35 = Utf8               getId
   #36 = Utf8               ()I
   #37 = Class              #38           // ext/mods/gameserver/handler/skillhandlers/Pdam
   #38 = Utf8               ext/mods/gameserver/handler/skillhandlers/Pdam
   #39 = Methodref          #32.#40       // ext/mods/gameserver/skills/L2Skill.getMaxCharges:()I
   #40 = NameAndType        #41:#36       // getMaxCharges:()I
   #41 = Utf8               getMaxCharges
   #42 = Methodref          #43.#44       // ext/mods/gameserver/model/actor/Player.getCharges:()I
   #43 = Class              #45           // ext/mods/gameserver/model/actor/Player
   #44 = NameAndType        #46:#36       // getCharges:()I
   #45 = Utf8               ext/mods/gameserver/model/actor/Player
   #46 = Utf8               getCharges
   #47 = Methodref          #43.#48       // ext/mods/gameserver/model/actor/Player.increaseCharges:(II)V
   #48 = NameAndType        #49:#50       // increaseCharges:(II)V
   #49 = Utf8               increaseCharges
   #50 = Utf8               (II)V
   #51 = Fieldref           #52.#53       // ext/mods/gameserver/network/SystemMessageId.FORCE_MAXLEVEL_REACHED:Lext/mods/gameserver/network/SystemMessageId;
   #52 = Class              #54           // ext/mods/gameserver/network/SystemMessageId
   #53 = NameAndType        #55:#56       // FORCE_MAXLEVEL_REACHED:Lext/mods/gameserver/network/SystemMessageId;
   #54 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #55 = Utf8               FORCE_MAXLEVEL_REACHED
   #56 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #57 = Methodref          #43.#58       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #58 = NameAndType        #59:#60       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #59 = Utf8               sendPacket
   #60 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #61 = Methodref          #8.#62        // ext/mods/gameserver/model/actor/Creature.isDead:()Z
   #62 = NameAndType        #63:#12       // isDead:()Z
   #63 = Utf8               isDead
   #64 = Class              #65           // ext/mods/gameserver/model/actor/Playable
   #65 = Utf8               ext/mods/gameserver/model/actor/Playable
   #66 = Fieldref           #67.#68       // ext/mods/gameserver/skills/effects/EffectFear.DOESNT_AFFECT_PLAYABLE:[I
   #67 = Class              #69           // ext/mods/gameserver/skills/effects/EffectFear
   #68 = NameAndType        #70:#71       // DOESNT_AFFECT_PLAYABLE:[I
   #69 = Utf8               ext/mods/gameserver/skills/effects/EffectFear
   #70 = Utf8               DOESNT_AFFECT_PLAYABLE
   #71 = Utf8               [I
   #72 = Methodref          #73.#74       // ext/mods/commons/util/ArraysUtil.contains:([II)Z
   #73 = Class              #75           // ext/mods/commons/util/ArraysUtil
   #74 = NameAndType        #76:#77       // contains:([II)Z
   #75 = Utf8               ext/mods/commons/util/ArraysUtil
   #76 = Utf8               contains
   #77 = Utf8               ([II)Z
   #78 = Methodref          #79.#80       // ext/mods/gameserver/model/item/instance/ItemInstance.getItemType:()Lext/mods/gameserver/enums/items/ItemType;
   #79 = Class              #81           // ext/mods/gameserver/model/item/instance/ItemInstance
   #80 = NameAndType        #82:#83       // getItemType:()Lext/mods/gameserver/enums/items/ItemType;
   #81 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
   #82 = Utf8               getItemType
   #83 = Utf8               ()Lext/mods/gameserver/enums/items/ItemType;
   #84 = Fieldref           #85.#86       // ext/mods/gameserver/enums/items/WeaponType.BOW:Lext/mods/gameserver/enums/items/WeaponType;
   #85 = Class              #87           // ext/mods/gameserver/enums/items/WeaponType
   #86 = NameAndType        #88:#89       // BOW:Lext/mods/gameserver/enums/items/WeaponType;
   #87 = Utf8               ext/mods/gameserver/enums/items/WeaponType
   #88 = Utf8               BOW
   #89 = Utf8               Lext/mods/gameserver/enums/items/WeaponType;
   #90 = Methodref          #91.#92       // ext/mods/gameserver/skills/Formulas.calcPhysicalSkillEvasion:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
   #91 = Class              #93           // ext/mods/gameserver/skills/Formulas
   #92 = NameAndType        #94:#95       // calcPhysicalSkillEvasion:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
   #93 = Utf8               ext/mods/gameserver/skills/Formulas
   #94 = Utf8               calcPhysicalSkillEvasion
   #95 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
   #96 = Fieldref           #52.#97       // ext/mods/gameserver/network/SystemMessageId.S1_DODGES_ATTACK:Lext/mods/gameserver/network/SystemMessageId;
   #97 = NameAndType        #98:#56       // S1_DODGES_ATTACK:Lext/mods/gameserver/network/SystemMessageId;
   #98 = Utf8               S1_DODGES_ATTACK
   #99 = Methodref          #100.#101     // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #100 = Class              #102          // ext/mods/gameserver/network/serverpackets/SystemMessage
  #101 = NameAndType        #103:#104     // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #102 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #103 = Utf8               getSystemMessage
  #104 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #105 = Methodref          #100.#106     // ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #106 = NameAndType        #107:#108     // addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #107 = Utf8               addCharName
  #108 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #109 = Methodref          #43.#110      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #110 = NameAndType        #59:#111      // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #111 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #112 = Fieldref           #52.#113      // ext/mods/gameserver/network/SystemMessageId.AVOIDED_S1_ATTACK:Lext/mods/gameserver/network/SystemMessageId;
  #113 = NameAndType        #114:#56      // AVOIDED_S1_ATTACK:Lext/mods/gameserver/network/SystemMessageId;
  #114 = Utf8               AVOIDED_S1_ATTACK
  #115 = Methodref          #32.#116      // ext/mods/gameserver/skills/L2Skill.getBaseCritRate:()I
  #116 = NameAndType        #117:#36      // getBaseCritRate:()I
  #117 = Utf8               getBaseCritRate
  #118 = Methodref          #91.#119      // ext/mods/gameserver/skills/Formulas.getSTRBonus:(Lext/mods/gameserver/model/actor/Creature;)D
  #119 = NameAndType        #120:#121     // getSTRBonus:(Lext/mods/gameserver/model/actor/Creature;)D
  #120 = Utf8               getSTRBonus
  #121 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)D
  #122 = Methodref          #91.#123      // ext/mods/gameserver/skills/Formulas.calcCrit:(D)Z
  #123 = NameAndType        #124:#125     // calcCrit:(D)Z
  #124 = Utf8               calcCrit
  #125 = Utf8               (D)Z
  #126 = Methodref          #91.#127      // ext/mods/gameserver/skills/Formulas.calcShldUse:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Lext/mods/gameserver/enums/skills/ShieldDefense;
  #127 = NameAndType        #128:#129     // calcShldUse:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Lext/mods/gameserver/enums/skills/ShieldDefense;
  #128 = Utf8               calcShldUse
  #129 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Lext/mods/gameserver/enums/skills/ShieldDefense;
  #130 = Methodref          #91.#131      // ext/mods/gameserver/skills/Formulas.calcSkillReflect:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)B
  #131 = NameAndType        #132:#133     // calcSkillReflect:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)B
  #132 = Utf8               calcSkillReflect
  #133 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)B
  #134 = Methodref          #32.#135      // ext/mods/gameserver/skills/L2Skill.hasEffects:()Z
  #135 = NameAndType        #136:#12      // hasEffects:()Z
  #136 = Utf8               hasEffects
  #137 = Fieldref           #138.#139     // ext/mods/gameserver/enums/skills/EffectType.BLOCK_DEBUFF:Lext/mods/gameserver/enums/skills/EffectType;
  #138 = Class              #140          // ext/mods/gameserver/enums/skills/EffectType
  #139 = NameAndType        #141:#142     // BLOCK_DEBUFF:Lext/mods/gameserver/enums/skills/EffectType;
  #140 = Utf8               ext/mods/gameserver/enums/skills/EffectType
  #141 = Utf8               BLOCK_DEBUFF
  #142 = Utf8               Lext/mods/gameserver/enums/skills/EffectType;
  #143 = Methodref          #8.#144       // ext/mods/gameserver/model/actor/Creature.getFirstEffect:(Lext/mods/gameserver/enums/skills/EffectType;)Lext/mods/gameserver/skills/AbstractEffect;
  #144 = NameAndType        #145:#146     // getFirstEffect:(Lext/mods/gameserver/enums/skills/EffectType;)Lext/mods/gameserver/skills/AbstractEffect;
  #145 = Utf8               getFirstEffect
  #146 = Utf8               (Lext/mods/gameserver/enums/skills/EffectType;)Lext/mods/gameserver/skills/AbstractEffect;
  #147 = Methodref          #8.#148       // ext/mods/gameserver/model/actor/Creature.stopSkillEffects:(I)V
  #148 = NameAndType        #149:#150     // stopSkillEffects:(I)V
  #149 = Utf8               stopSkillEffects
  #150 = Utf8               (I)V
  #151 = Methodref          #32.#152      // ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #152 = NameAndType        #153:#154     // getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #153 = Utf8               getEffects
  #154 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #155 = Methodref          #32.#156      // ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Ljava/util/List;
  #156 = NameAndType        #153:#157     // getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Ljava/util/List;
  #157 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Ljava/util/List;
  #158 = Methodref          #91.#159      // ext/mods/gameserver/skills/Formulas.calcPhysicalSkillDamage:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/enums/skills/ShieldDefense;ZZ)D
  #159 = NameAndType        #160:#161     // calcPhysicalSkillDamage:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/enums/skills/ShieldDefense;ZZ)D
  #160 = Utf8               calcPhysicalSkillDamage
  #161 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/enums/skills/ShieldDefense;ZZ)D
  #162 = Fieldref           #52.#163      // ext/mods/gameserver/network/SystemMessageId.COUNTERED_S1_ATTACK:Lext/mods/gameserver/network/SystemMessageId;
  #163 = NameAndType        #164:#56      // COUNTERED_S1_ATTACK:Lext/mods/gameserver/network/SystemMessageId;
  #164 = Utf8               COUNTERED_S1_ATTACK
  #165 = Fieldref           #52.#166      // ext/mods/gameserver/network/SystemMessageId.S1_PERFORMING_COUNTERATTACK:Lext/mods/gameserver/network/SystemMessageId;
  #166 = NameAndType        #167:#56      // S1_PERFORMING_COUNTERATTACK:Lext/mods/gameserver/network/SystemMessageId;
  #167 = Utf8               S1_PERFORMING_COUNTERATTACK
  #168 = Methodref          #8.#169       // ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
  #169 = NameAndType        #170:#171     // getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
  #170 = Utf8               getStatus
  #171 = Utf8               ()Lext/mods/gameserver/model/actor/status/CreatureStatus;
  #172 = Fieldref           #173.#174     // ext/mods/gameserver/enums/skills/Stats.COUNTER_SKILL_PHYSICAL:Lext/mods/gameserver/enums/skills/Stats;
  #173 = Class              #175          // ext/mods/gameserver/enums/skills/Stats
  #174 = NameAndType        #176:#177     // COUNTER_SKILL_PHYSICAL:Lext/mods/gameserver/enums/skills/Stats;
  #175 = Utf8               ext/mods/gameserver/enums/skills/Stats
  #176 = Utf8               COUNTER_SKILL_PHYSICAL
  #177 = Utf8               Lext/mods/gameserver/enums/skills/Stats;
  #178 = Methodref          #179.#180     // ext/mods/gameserver/model/actor/status/CreatureStatus.calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
  #179 = Class              #181          // ext/mods/gameserver/model/actor/status/CreatureStatus
  #180 = NameAndType        #182:#183     // calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
  #181 = Utf8               ext/mods/gameserver/model/actor/status/CreatureStatus
  #182 = Utf8               calcStat
  #183 = Utf8               (Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
  #184 = Double             100.0d
  #186 = Methodref          #8.#187       // ext/mods/gameserver/model/actor/Creature.reduceCurrentHp:(DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #187 = NameAndType        #188:#189     // reduceCurrentHp:(DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #188 = Utf8               reduceCurrentHp
  #189 = Utf8               (DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #190 = Methodref          #8.#191       // ext/mods/gameserver/model/actor/Creature.sendDamageMessage:(Lext/mods/gameserver/model/actor/Creature;IZZZ)V
  #191 = NameAndType        #192:#193     // sendDamageMessage:(Lext/mods/gameserver/model/actor/Creature;IZZZ)V
  #192 = Utf8               sendDamageMessage
  #193 = Utf8               (Lext/mods/gameserver/model/actor/Creature;IZZZ)V
  #194 = Methodref          #91.#195      // ext/mods/gameserver/skills/Formulas.calcCastBreak:(Lext/mods/gameserver/model/actor/Creature;D)V
  #195 = NameAndType        #196:#197     // calcCastBreak:(Lext/mods/gameserver/model/actor/Creature;D)V
  #196 = Utf8               calcCastBreak
  #197 = Utf8               (Lext/mods/gameserver/model/actor/Creature;D)V
  #198 = Methodref          #91.#199      // ext/mods/gameserver/skills/Formulas.calcLethalHit:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #199 = NameAndType        #200:#201     // calcLethalHit:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #200 = Utf8               calcLethalHit
  #201 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #202 = Fieldref           #52.#203      // ext/mods/gameserver/network/SystemMessageId.ATTACK_FAILED:Lext/mods/gameserver/network/SystemMessageId;
  #203 = NameAndType        #204:#56      // ATTACK_FAILED:Lext/mods/gameserver/network/SystemMessageId;
  #204 = Utf8               ATTACK_FAILED
  #205 = Methodref          #8.#110       // ext/mods/gameserver/model/actor/Creature.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #206 = Methodref          #32.#207      // ext/mods/gameserver/skills/L2Skill.hasSelfEffects:()Z
  #207 = NameAndType        #208:#12      // hasSelfEffects:()Z
  #208 = Utf8               hasSelfEffects
  #209 = Methodref          #8.#210       // ext/mods/gameserver/model/actor/Creature.getFirstEffect:(I)Lext/mods/gameserver/skills/AbstractEffect;
  #210 = NameAndType        #145:#211     // getFirstEffect:(I)Lext/mods/gameserver/skills/AbstractEffect;
  #211 = Utf8               (I)Lext/mods/gameserver/skills/AbstractEffect;
  #212 = Methodref          #213.#214     // ext/mods/gameserver/skills/AbstractEffect.isSelfEffect:()Z
  #213 = Class              #215          // ext/mods/gameserver/skills/AbstractEffect
  #214 = NameAndType        #216:#12      // isSelfEffect:()Z
  #215 = Utf8               ext/mods/gameserver/skills/AbstractEffect
  #216 = Utf8               isSelfEffect
  #217 = Methodref          #213.#218     // ext/mods/gameserver/skills/AbstractEffect.exit:()V
  #218 = NameAndType        #219:#6       // exit:()V
  #219 = Utf8               exit
  #220 = Methodref          #32.#221      // ext/mods/gameserver/skills/L2Skill.getEffectsSelf:(Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #221 = NameAndType        #222:#223     // getEffectsSelf:(Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #222 = Utf8               getEffectsSelf
  #223 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #224 = Methodref          #32.#225      // ext/mods/gameserver/skills/L2Skill.getFlyType:()Lext/mods/gameserver/enums/skills/FlyType;
  #225 = NameAndType        #226:#227     // getFlyType:()Lext/mods/gameserver/enums/skills/FlyType;
  #226 = Utf8               getFlyType
  #227 = Utf8               ()Lext/mods/gameserver/enums/skills/FlyType;
  #228 = Fieldref           #229.#230     // ext/mods/gameserver/enums/skills/FlyType.CHARGE:Lext/mods/gameserver/enums/skills/FlyType;
  #229 = Class              #231          // ext/mods/gameserver/enums/skills/FlyType
  #230 = NameAndType        #232:#233     // CHARGE:Lext/mods/gameserver/enums/skills/FlyType;
  #231 = Utf8               ext/mods/gameserver/enums/skills/FlyType
  #232 = Utf8               CHARGE
  #233 = Utf8               Lext/mods/gameserver/enums/skills/FlyType;
  #234 = Methodref          #8.#235       // ext/mods/gameserver/model/actor/Creature.getHeading:()I
  #235 = NameAndType        #236:#36      // getHeading:()I
  #236 = Utf8               getHeading
  #237 = Methodref          #8.#238       // ext/mods/gameserver/model/actor/Creature.getX:()I
  #238 = NameAndType        #239:#36      // getX:()I
  #239 = Utf8               getX
  #240 = Methodref          #8.#241       // ext/mods/gameserver/model/actor/Creature.getY:()I
  #241 = NameAndType        #242:#36      // getY:()I
  #242 = Utf8               getY
  #243 = Methodref          #244.#238     // ext/mods/gameserver/model/WorldObject.getX:()I
  #244 = Class              #245          // ext/mods/gameserver/model/WorldObject
  #245 = Utf8               ext/mods/gameserver/model/WorldObject
  #246 = Methodref          #244.#241     // ext/mods/gameserver/model/WorldObject.getY:()I
  #247 = Methodref          #248.#249     // ext/mods/commons/math/MathUtil.calculateHeadingFrom:(IIII)I
  #248 = Class              #250          // ext/mods/commons/math/MathUtil
  #249 = NameAndType        #251:#252     // calculateHeadingFrom:(IIII)I
  #250 = Utf8               ext/mods/commons/math/MathUtil
  #251 = Utf8               calculateHeadingFrom
  #252 = Utf8               (IIII)I
  #253 = Methodref          #32.#254      // ext/mods/gameserver/skills/L2Skill.getFlyRadius:()I
  #254 = NameAndType        #255:#36      // getFlyRadius:()I
  #255 = Utf8               getFlyRadius
  #256 = Methodref          #248.#257     // ext/mods/commons/math/MathUtil.getNewLocationByDistanceAndHeading:(IIII)Lext/mods/gameserver/model/location/Point2D;
  #257 = NameAndType        #258:#259     // getNewLocationByDistanceAndHeading:(IIII)Lext/mods/gameserver/model/location/Point2D;
  #258 = Utf8               getNewLocationByDistanceAndHeading
  #259 = Utf8               (IIII)Lext/mods/gameserver/model/location/Point2D;
  #260 = Methodref          #261.#262     // ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
  #261 = Class              #263          // ext/mods/gameserver/geoengine/GeoEngine
  #262 = NameAndType        #264:#265     // getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
  #263 = Utf8               ext/mods/gameserver/geoengine/GeoEngine
  #264 = Utf8               getInstance
  #265 = Utf8               ()Lext/mods/gameserver/geoengine/GeoEngine;
  #266 = Methodref          #267.#238     // ext/mods/gameserver/model/location/Point2D.getX:()I
  #267 = Class              #268          // ext/mods/gameserver/model/location/Point2D
  #268 = Utf8               ext/mods/gameserver/model/location/Point2D
  #269 = Methodref          #267.#241     // ext/mods/gameserver/model/location/Point2D.getY:()I
  #270 = Methodref          #8.#271       // ext/mods/gameserver/model/actor/Creature.getZ:()I
  #271 = NameAndType        #272:#36      // getZ:()I
  #272 = Utf8               getZ
  #273 = Methodref          #261.#274     // ext/mods/gameserver/geoengine/GeoEngine.getValidLocation:(Lext/mods/gameserver/model/WorldObject;III)Lext/mods/gameserver/model/location/Location;
  #274 = NameAndType        #275:#276     // getValidLocation:(Lext/mods/gameserver/model/WorldObject;III)Lext/mods/gameserver/model/location/Location;
  #275 = Utf8               getValidLocation
  #276 = Utf8               (Lext/mods/gameserver/model/WorldObject;III)Lext/mods/gameserver/model/location/Location;
  #277 = Class              #278          // ext/mods/gameserver/network/serverpackets/FlyToLocation
  #278 = Utf8               ext/mods/gameserver/network/serverpackets/FlyToLocation
  #279 = Methodref          #280.#238     // ext/mods/gameserver/model/location/Location.getX:()I
  #280 = Class              #281          // ext/mods/gameserver/model/location/Location
  #281 = Utf8               ext/mods/gameserver/model/location/Location
  #282 = Methodref          #280.#241     // ext/mods/gameserver/model/location/Location.getY:()I
  #283 = Methodref          #280.#271     // ext/mods/gameserver/model/location/Location.getZ:()I
  #284 = Methodref          #277.#285     // ext/mods/gameserver/network/serverpackets/FlyToLocation."<init>":(Lext/mods/gameserver/model/actor/Creature;IIILext/mods/gameserver/enums/skills/FlyType;)V
  #285 = NameAndType        #5:#286       // "<init>":(Lext/mods/gameserver/model/actor/Creature;IIILext/mods/gameserver/enums/skills/FlyType;)V
  #286 = Utf8               (Lext/mods/gameserver/model/actor/Creature;IIILext/mods/gameserver/enums/skills/FlyType;)V
  #287 = Methodref          #8.#288       // ext/mods/gameserver/model/actor/Creature.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #288 = NameAndType        #289:#111     // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #289 = Utf8               broadcastPacket
  #290 = Methodref          #8.#291       // ext/mods/gameserver/model/actor/Creature.setXYZ:(III)V
  #291 = NameAndType        #292:#293     // setXYZ:(III)V
  #292 = Utf8               setXYZ
  #293 = Utf8               (III)V
  #294 = Class              #295          // ext/mods/gameserver/network/serverpackets/ValidateLocation
  #295 = Utf8               ext/mods/gameserver/network/serverpackets/ValidateLocation
  #296 = Methodref          #294.#297     // ext/mods/gameserver/network/serverpackets/ValidateLocation."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
  #297 = NameAndType        #5:#298       // "<init>":(Lext/mods/gameserver/model/actor/Creature;)V
  #298 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
  #299 = Methodref          #32.#300      // ext/mods/gameserver/skills/L2Skill.isSuicideAttack:()Z
  #300 = NameAndType        #301:#12      // isSuicideAttack:()Z
  #301 = Utf8               isSuicideAttack
  #302 = Methodref          #8.#303       // ext/mods/gameserver/model/actor/Creature.doDie:(Lext/mods/gameserver/model/actor/Creature;)Z
  #303 = NameAndType        #304:#305     // doDie:(Lext/mods/gameserver/model/actor/Creature;)Z
  #304 = Utf8               doDie
  #305 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
  #306 = Methodref          #32.#307      // ext/mods/gameserver/skills/L2Skill.isStaticReuse:()Z
  #307 = NameAndType        #308:#12      // isStaticReuse:()Z
  #308 = Utf8               isStaticReuse
  #309 = Methodref          #8.#310       // ext/mods/gameserver/model/actor/Creature.setChargedShot:(Lext/mods/gameserver/enums/items/ShotType;Z)V
  #310 = NameAndType        #311:#312     // setChargedShot:(Lext/mods/gameserver/enums/items/ShotType;Z)V
  #311 = Utf8               setChargedShot
  #312 = Utf8               (Lext/mods/gameserver/enums/items/ShotType;Z)V
  #313 = Fieldref           #37.#314      // ext/mods/gameserver/handler/skillhandlers/Pdam.SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
  #314 = NameAndType        #315:#316     // SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
  #315 = Utf8               SKILL_IDS
  #316 = Utf8               [Lext/mods/gameserver/enums/skills/SkillType;
  #317 = Class              #318          // ext/mods/gameserver/enums/skills/SkillType
  #318 = Utf8               ext/mods/gameserver/enums/skills/SkillType
  #319 = Fieldref           #317.#320     // ext/mods/gameserver/enums/skills/SkillType.PDAM:Lext/mods/gameserver/enums/skills/SkillType;
  #320 = NameAndType        #321:#322     // PDAM:Lext/mods/gameserver/enums/skills/SkillType;
  #321 = Utf8               PDAM
  #322 = Utf8               Lext/mods/gameserver/enums/skills/SkillType;
  #323 = Fieldref           #317.#324     // ext/mods/gameserver/enums/skills/SkillType.FATAL:Lext/mods/gameserver/enums/skills/SkillType;
  #324 = NameAndType        #325:#322     // FATAL:Lext/mods/gameserver/enums/skills/SkillType;
  #325 = Utf8               FATAL
  #326 = Class              #327          // ext/mods/gameserver/handler/ISkillHandler
  #327 = Utf8               ext/mods/gameserver/handler/ISkillHandler
  #328 = Utf8               SONIC_RAGE
  #329 = Utf8               I
  #330 = Utf8               ConstantValue
  #331 = Integer            345
  #332 = Utf8               RAGING_FORCE
  #333 = Integer            346
  #334 = Utf8               Code
  #335 = Utf8               LineNumberTable
  #336 = Utf8               LocalVariableTable
  #337 = Utf8               this
  #338 = Utf8               Lext/mods/gameserver/handler/skillhandlers/Pdam;
  #339 = Utf8               useSkill
  #340 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #341 = Utf8               maxCharges
  #342 = Utf8               player
  #343 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #344 = Utf8               targetPlayer
  #345 = Utf8               targetCreature
  #346 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #347 = Utf8               isCrit
  #348 = Utf8               Z
  #349 = Utf8               sDef
  #350 = Utf8               Lext/mods/gameserver/enums/skills/ShieldDefense;
  #351 = Utf8               reflect
  #352 = Utf8               B
  #353 = Utf8               damage
  #354 = Utf8               D
  #355 = Utf8               target
  #356 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #357 = Utf8               effect
  #358 = Utf8               Lext/mods/gameserver/skills/AbstractEffect;
  #359 = Utf8               heading
  #360 = Utf8               chargePoint
  #361 = Utf8               Lext/mods/gameserver/model/location/Point2D;
  #362 = Utf8               chargeLoc
  #363 = Utf8               Lext/mods/gameserver/model/location/Location;
  #364 = Utf8               creature
  #365 = Utf8               skill
  #366 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #367 = Utf8               targets
  #368 = Utf8               [Lext/mods/gameserver/model/WorldObject;
  #369 = Utf8               item
  #370 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #371 = Utf8               playeractor
  #372 = Utf8               ss
  #373 = Utf8               weapon
  #374 = Utf8               StackMapTable
  #375 = Class              #368          // "[Lext/mods/gameserver/model/WorldObject;"
  #376 = Class              #377          // ext/mods/gameserver/enums/skills/ShieldDefense
  #377 = Utf8               ext/mods/gameserver/enums/skills/ShieldDefense
  #378 = Utf8               getSkillIds
  #379 = Utf8               ()[Lext/mods/gameserver/enums/skills/SkillType;
  #380 = Utf8               <clinit>
  #381 = Utf8               SourceFile
  #382 = Utf8               Pdam.java
{
  public ext.mods.gameserver.handler.skillhandlers.Pdam();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 48: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/skillhandlers/Pdam;

  public void useSkill(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill, ext.mods.gameserver.model.WorldObject[], ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=8, locals=19, args_size=5
         0: aload_1
         1: invokevirtual #7                  // Method ext/mods/gameserver/model/actor/Creature.isAlikeDead:()Z
         4: ifeq          8
         7: return
         8: aload_1
         9: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
        12: astore        5
        14: aload_1
        15: getstatic     #17                 // Field ext/mods/gameserver/enums/items/ShotType.SOULSHOT:Lext/mods/gameserver/enums/items/ShotType;
        18: invokevirtual #23                 // Method ext/mods/gameserver/model/actor/Creature.isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
        21: istore        6
        23: aload_1
        24: invokevirtual #27                 // Method ext/mods/gameserver/model/actor/Creature.getActiveWeaponInstance:()Lext/mods/gameserver/model/item/instance/ItemInstance;
        27: astore        7
        29: aload         5
        31: ifnull        98
        34: aload_2
        35: invokevirtual #31                 // Method ext/mods/gameserver/skills/L2Skill.getId:()I
        38: sipush        345
        41: if_icmpeq     54
        44: aload_2
        45: invokevirtual #31                 // Method ext/mods/gameserver/skills/L2Skill.getId:()I
        48: sipush        346
        51: if_icmpne     98
        54: aload_2
        55: invokevirtual #39                 // Method ext/mods/gameserver/skills/L2Skill.getMaxCharges:()I
        58: istore        8
        60: iload         8
        62: ifgt          69
        65: bipush        8
        67: istore        8
        69: aload         5
        71: invokevirtual #42                 // Method ext/mods/gameserver/model/actor/Player.getCharges:()I
        74: iload         8
        76: if_icmpge     90
        79: aload         5
        81: iconst_1
        82: iload         8
        84: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/Player.increaseCharges:(II)V
        87: goto          98
        90: aload         5
        92: getstatic     #51                 // Field ext/mods/gameserver/network/SystemMessageId.FORCE_MAXLEVEL_REACHED:Lext/mods/gameserver/network/SystemMessageId;
        95: invokevirtual #57                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        98: aload_3
        99: astore        8
       101: aload         8
       103: arraylength
       104: istore        9
       106: iconst_0
       107: istore        10
       109: iload         10
       111: iload         9
       113: if_icmpge     566
       116: aload         8
       118: iload         10
       120: aaload
       121: astore        11
       123: aload         11
       125: instanceof    #8                  // class ext/mods/gameserver/model/actor/Creature
       128: ifeq          560
       131: aload         11
       133: checkcast     #8                  // class ext/mods/gameserver/model/actor/Creature
       136: astore        12
       138: aload         12
       140: invokevirtual #61                 // Method ext/mods/gameserver/model/actor/Creature.isDead:()Z
       143: ifeq          149
       146: goto          560
       149: aload         11
       151: instanceof    #64                 // class ext/mods/gameserver/model/actor/Playable
       154: ifeq          173
       157: getstatic     #66                 // Field ext/mods/gameserver/skills/effects/EffectFear.DOESNT_AFFECT_PLAYABLE:[I
       160: aload_2
       161: invokevirtual #31                 // Method ext/mods/gameserver/skills/L2Skill.getId:()I
       164: invokestatic  #72                 // Method ext/mods/commons/util/ArraysUtil.contains:([II)Z
       167: ifeq          173
       170: goto          560
       173: aload         7
       175: ifnull        260
       178: aload         7
       180: invokevirtual #78                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemType:()Lext/mods/gameserver/enums/items/ItemType;
       183: getstatic     #84                 // Field ext/mods/gameserver/enums/items/WeaponType.BOW:Lext/mods/gameserver/enums/items/WeaponType;
       186: if_acmpeq     260
       189: aload         12
       191: aload_2
       192: invokestatic  #90                 // Method ext/mods/gameserver/skills/Formulas.calcPhysicalSkillEvasion:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
       195: ifeq          260
       198: aload_1
       199: instanceof    #43                 // class ext/mods/gameserver/model/actor/Player
       202: ifeq          227
       205: aload_1
       206: checkcast     #43                 // class ext/mods/gameserver/model/actor/Player
       209: astore        13
       211: aload         13
       213: getstatic     #96                 // Field ext/mods/gameserver/network/SystemMessageId.S1_DODGES_ATTACK:Lext/mods/gameserver/network/SystemMessageId;
       216: invokestatic  #99                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       219: aload         12
       221: invokevirtual #105                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       224: invokevirtual #109                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       227: aload         11
       229: instanceof    #43                 // class ext/mods/gameserver/model/actor/Player
       232: ifeq          257
       235: aload         11
       237: checkcast     #43                 // class ext/mods/gameserver/model/actor/Player
       240: astore        13
       242: aload         13
       244: getstatic     #112                // Field ext/mods/gameserver/network/SystemMessageId.AVOIDED_S1_ATTACK:Lext/mods/gameserver/network/SystemMessageId;
       247: invokestatic  #99                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       250: aload_1
       251: invokevirtual #105                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       254: invokevirtual #109                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       257: goto          560
       260: aload_2
       261: invokevirtual #115                // Method ext/mods/gameserver/skills/L2Skill.getBaseCritRate:()I
       264: ifle          290
       267: aload_2
       268: invokevirtual #115                // Method ext/mods/gameserver/skills/L2Skill.getBaseCritRate:()I
       271: bipush        10
       273: imul
       274: i2d
       275: aload_1
       276: invokestatic  #118                // Method ext/mods/gameserver/skills/Formulas.getSTRBonus:(Lext/mods/gameserver/model/actor/Creature;)D
       279: dmul
       280: invokestatic  #122                // Method ext/mods/gameserver/skills/Formulas.calcCrit:(D)Z
       283: ifeq          290
       286: iconst_1
       287: goto          291
       290: iconst_0
       291: istore        13
       293: aload_1
       294: aload         12
       296: aload_2
       297: iload         13
       299: invokestatic  #126                // Method ext/mods/gameserver/skills/Formulas.calcShldUse:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Lext/mods/gameserver/enums/skills/ShieldDefense;
       302: astore        14
       304: aload         12
       306: aload_2
       307: invokestatic  #130                // Method ext/mods/gameserver/skills/Formulas.calcSkillReflect:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)B
       310: istore        15
       312: aload_2
       313: invokevirtual #134                // Method ext/mods/gameserver/skills/L2Skill.hasEffects:()Z
       316: ifeq          376
       319: aload         12
       321: getstatic     #137                // Field ext/mods/gameserver/enums/skills/EffectType.BLOCK_DEBUFF:Lext/mods/gameserver/enums/skills/EffectType;
       324: invokevirtual #143                // Method ext/mods/gameserver/model/actor/Creature.getFirstEffect:(Lext/mods/gameserver/enums/skills/EffectType;)Lext/mods/gameserver/skills/AbstractEffect;
       327: ifnonnull     376
       330: iload         15
       332: iconst_1
       333: iand
       334: ifeq          356
       337: aload_1
       338: aload_2
       339: invokevirtual #31                 // Method ext/mods/gameserver/skills/L2Skill.getId:()I
       342: invokevirtual #147                // Method ext/mods/gameserver/model/actor/Creature.stopSkillEffects:(I)V
       345: aload_2
       346: aload         12
       348: aload_1
       349: invokevirtual #151                // Method ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
       352: pop
       353: goto          376
       356: aload         12
       358: aload_2
       359: invokevirtual #31                 // Method ext/mods/gameserver/skills/L2Skill.getId:()I
       362: invokevirtual #147                // Method ext/mods/gameserver/model/actor/Creature.stopSkillEffects:(I)V
       365: aload_2
       366: aload_1
       367: aload         12
       369: aload         14
       371: iconst_0
       372: invokevirtual #155                // Method ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Ljava/util/List;
       375: pop
       376: aload_1
       377: aload         12
       379: aload_2
       380: aload         14
       382: iload         13
       384: iload         6
       386: invokestatic  #158                // Method ext/mods/gameserver/skills/Formulas.calcPhysicalSkillDamage:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/enums/skills/ShieldDefense;ZZ)D
       389: dstore        16
       391: dload         16
       393: dconst_0
       394: dcmpl
       395: ifle          550
       398: iload         15
       400: iconst_2
       401: iand
       402: ifeq          512
       405: aload         11
       407: instanceof    #43                 // class ext/mods/gameserver/model/actor/Player
       410: ifeq          435
       413: aload         11
       415: checkcast     #43                 // class ext/mods/gameserver/model/actor/Player
       418: astore        18
       420: aload         18
       422: getstatic     #162                // Field ext/mods/gameserver/network/SystemMessageId.COUNTERED_S1_ATTACK:Lext/mods/gameserver/network/SystemMessageId;
       425: invokestatic  #99                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       428: aload_1
       429: invokevirtual #105                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       432: invokevirtual #109                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       435: aload_1
       436: instanceof    #43                 // class ext/mods/gameserver/model/actor/Player
       439: ifeq          464
       442: aload_1
       443: checkcast     #43                 // class ext/mods/gameserver/model/actor/Player
       446: astore        18
       448: aload         18
       450: getstatic     #165                // Field ext/mods/gameserver/network/SystemMessageId.S1_PERFORMING_COUNTERATTACK:Lext/mods/gameserver/network/SystemMessageId;
       453: invokestatic  #99                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       456: aload         12
       458: invokevirtual #105                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       461: invokevirtual #109                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       464: dload         16
       466: aload         12
       468: invokevirtual #168                // Method ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
       471: getstatic     #172                // Field ext/mods/gameserver/enums/skills/Stats.COUNTER_SKILL_PHYSICAL:Lext/mods/gameserver/enums/skills/Stats;
       474: dconst_0
       475: aload         12
       477: aconst_null
       478: invokevirtual #178                // Method ext/mods/gameserver/model/actor/status/CreatureStatus.calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
       481: ldc2_w        #184                // double 100.0d
       484: ddiv
       485: dmul
       486: dstore        16
       488: aload_1
       489: dload         16
       491: aload         12
       493: aload_2
       494: invokevirtual #186                // Method ext/mods/gameserver/model/actor/Creature.reduceCurrentHp:(DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
       497: aload         12
       499: aload_1
       500: dload         16
       502: d2i
       503: iconst_0
       504: iconst_0
       505: iconst_0
       506: invokevirtual #190                // Method ext/mods/gameserver/model/actor/Creature.sendDamageMessage:(Lext/mods/gameserver/model/actor/Creature;IZZZ)V
       509: goto          540
       512: aload         12
       514: dload         16
       516: invokestatic  #194                // Method ext/mods/gameserver/skills/Formulas.calcCastBreak:(Lext/mods/gameserver/model/actor/Creature;D)V
       519: aload         12
       521: dload         16
       523: aload_1
       524: aload_2
       525: invokevirtual #186                // Method ext/mods/gameserver/model/actor/Creature.reduceCurrentHp:(DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
       528: aload_1
       529: aload         12
       531: dload         16
       533: d2i
       534: iconst_0
       535: iconst_0
       536: iconst_0
       537: invokevirtual #190                // Method ext/mods/gameserver/model/actor/Creature.sendDamageMessage:(Lext/mods/gameserver/model/actor/Creature;IZZZ)V
       540: aload_1
       541: aload         12
       543: aload_2
       544: invokestatic  #198                // Method ext/mods/gameserver/skills/Formulas.calcLethalHit:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
       547: goto          560
       550: aload_1
       551: getstatic     #202                // Field ext/mods/gameserver/network/SystemMessageId.ATTACK_FAILED:Lext/mods/gameserver/network/SystemMessageId;
       554: invokestatic  #99                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       557: invokevirtual #205                // Method ext/mods/gameserver/model/actor/Creature.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       560: iinc          10, 1
       563: goto          109
       566: aload_2
       567: invokevirtual #206                // Method ext/mods/gameserver/skills/L2Skill.hasSelfEffects:()Z
       570: ifeq          607
       573: aload_1
       574: aload_2
       575: invokevirtual #31                 // Method ext/mods/gameserver/skills/L2Skill.getId:()I
       578: invokevirtual #209                // Method ext/mods/gameserver/model/actor/Creature.getFirstEffect:(I)Lext/mods/gameserver/skills/AbstractEffect;
       581: astore        8
       583: aload         8
       585: ifnull        601
       588: aload         8
       590: invokevirtual #212                // Method ext/mods/gameserver/skills/AbstractEffect.isSelfEffect:()Z
       593: ifeq          601
       596: aload         8
       598: invokevirtual #217                // Method ext/mods/gameserver/skills/AbstractEffect.exit:()V
       601: aload_2
       602: aload_1
       603: invokevirtual #220                // Method ext/mods/gameserver/skills/L2Skill.getEffectsSelf:(Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
       606: pop
       607: aload_2
       608: invokevirtual #224                // Method ext/mods/gameserver/skills/L2Skill.getFlyType:()Lext/mods/gameserver/enums/skills/FlyType;
       611: getstatic     #228                // Field ext/mods/gameserver/enums/skills/FlyType.CHARGE:Lext/mods/gameserver/enums/skills/FlyType;
       614: if_acmpne     756
       617: aload_1
       618: invokevirtual #234                // Method ext/mods/gameserver/model/actor/Creature.getHeading:()I
       621: istore        8
       623: aload_3
       624: arraylength
       625: ifle          653
       628: aload_1
       629: invokevirtual #237                // Method ext/mods/gameserver/model/actor/Creature.getX:()I
       632: aload_1
       633: invokevirtual #240                // Method ext/mods/gameserver/model/actor/Creature.getY:()I
       636: aload_3
       637: iconst_0
       638: aaload
       639: invokevirtual #243                // Method ext/mods/gameserver/model/WorldObject.getX:()I
       642: aload_3
       643: iconst_0
       644: aaload
       645: invokevirtual #246                // Method ext/mods/gameserver/model/WorldObject.getY:()I
       648: invokestatic  #247                // Method ext/mods/commons/math/MathUtil.calculateHeadingFrom:(IIII)I
       651: istore        8
       653: aload_1
       654: invokevirtual #237                // Method ext/mods/gameserver/model/actor/Creature.getX:()I
       657: aload_1
       658: invokevirtual #240                // Method ext/mods/gameserver/model/actor/Creature.getY:()I
       661: iload         8
       663: aload_2
       664: invokevirtual #253                // Method ext/mods/gameserver/skills/L2Skill.getFlyRadius:()I
       667: invokestatic  #256                // Method ext/mods/commons/math/MathUtil.getNewLocationByDistanceAndHeading:(IIII)Lext/mods/gameserver/model/location/Point2D;
       670: astore        9
       672: invokestatic  #260                // Method ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
       675: aload_1
       676: aload         9
       678: invokevirtual #266                // Method ext/mods/gameserver/model/location/Point2D.getX:()I
       681: aload         9
       683: invokevirtual #269                // Method ext/mods/gameserver/model/location/Point2D.getY:()I
       686: aload_1
       687: invokevirtual #270                // Method ext/mods/gameserver/model/actor/Creature.getZ:()I
       690: invokevirtual #273                // Method ext/mods/gameserver/geoengine/GeoEngine.getValidLocation:(Lext/mods/gameserver/model/WorldObject;III)Lext/mods/gameserver/model/location/Location;
       693: astore        10
       695: aload_1
       696: new           #277                // class ext/mods/gameserver/network/serverpackets/FlyToLocation
       699: dup
       700: aload_1
       701: aload         10
       703: invokevirtual #279                // Method ext/mods/gameserver/model/location/Location.getX:()I
       706: aload         10
       708: invokevirtual #282                // Method ext/mods/gameserver/model/location/Location.getY:()I
       711: aload         10
       713: invokevirtual #283                // Method ext/mods/gameserver/model/location/Location.getZ:()I
       716: getstatic     #228                // Field ext/mods/gameserver/enums/skills/FlyType.CHARGE:Lext/mods/gameserver/enums/skills/FlyType;
       719: invokespecial #284                // Method ext/mods/gameserver/network/serverpackets/FlyToLocation."<init>":(Lext/mods/gameserver/model/actor/Creature;IIILext/mods/gameserver/enums/skills/FlyType;)V
       722: invokevirtual #287                // Method ext/mods/gameserver/model/actor/Creature.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       725: aload_1
       726: aload         10
       728: invokevirtual #279                // Method ext/mods/gameserver/model/location/Location.getX:()I
       731: aload         10
       733: invokevirtual #282                // Method ext/mods/gameserver/model/location/Location.getY:()I
       736: aload         10
       738: invokevirtual #283                // Method ext/mods/gameserver/model/location/Location.getZ:()I
       741: invokevirtual #290                // Method ext/mods/gameserver/model/actor/Creature.setXYZ:(III)V
       744: aload_1
       745: new           #294                // class ext/mods/gameserver/network/serverpackets/ValidateLocation
       748: dup
       749: aload_1
       750: invokespecial #296                // Method ext/mods/gameserver/network/serverpackets/ValidateLocation."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
       753: invokevirtual #287                // Method ext/mods/gameserver/model/actor/Creature.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       756: aload_2
       757: invokevirtual #299                // Method ext/mods/gameserver/skills/L2Skill.isSuicideAttack:()Z
       760: ifeq          769
       763: aload_1
       764: aload_1
       765: invokevirtual #302                // Method ext/mods/gameserver/model/actor/Creature.doDie:(Lext/mods/gameserver/model/actor/Creature;)Z
       768: pop
       769: aload_1
       770: getstatic     #17                 // Field ext/mods/gameserver/enums/items/ShotType.SOULSHOT:Lext/mods/gameserver/enums/items/ShotType;
       773: aload_2
       774: invokevirtual #306                // Method ext/mods/gameserver/skills/L2Skill.isStaticReuse:()Z
       777: invokevirtual #309                // Method ext/mods/gameserver/model/actor/Creature.setChargedShot:(Lext/mods/gameserver/enums/items/ShotType;Z)V
       780: return
      LineNumberTable:
        line 62: 0
        line 63: 7
        line 65: 8
        line 66: 14
        line 67: 23
        line 69: 29
        line 71: 54
        line 72: 60
        line 74: 69
        line 76: 79
        line 80: 90
        line 84: 98
        line 86: 123
        line 89: 138
        line 90: 146
        line 92: 149
        line 93: 170
        line 95: 173
        line 97: 198
        line 98: 211
        line 100: 227
        line 101: 242
        line 103: 257
        line 106: 260
        line 107: 293
        line 108: 304
        line 110: 312
        line 112: 330
        line 114: 337
        line 116: 345
        line 120: 356
        line 122: 365
        line 126: 376
        line 128: 391
        line 130: 398
        line 132: 405
        line 133: 420
        line 135: 435
        line 136: 448
        line 138: 464
        line 140: 488
        line 142: 497
        line 146: 512
        line 148: 519
        line 150: 528
        line 153: 540
        line 156: 550
        line 84: 560
        line 159: 566
        line 161: 573
        line 162: 583
        line 163: 596
        line 165: 601
        line 168: 607
        line 170: 617
        line 171: 623
        line 172: 628
        line 174: 653
        line 176: 672
        line 178: 695
        line 180: 725
        line 182: 744
        line 185: 756
        line 186: 763
        line 188: 769
        line 189: 780
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           60      38     8 maxCharges   I
          211      16    13 player   Lext/mods/gameserver/model/actor/Player;
          242      15    13 targetPlayer   Lext/mods/gameserver/model/actor/Player;
          420      15    18 targetPlayer   Lext/mods/gameserver/model/actor/Player;
          448      16    18 player   Lext/mods/gameserver/model/actor/Player;
          138     422    12 targetCreature   Lext/mods/gameserver/model/actor/Creature;
          293     267    13 isCrit   Z
          304     256    14  sDef   Lext/mods/gameserver/enums/skills/ShieldDefense;
          312     248    15 reflect   B
          391     169    16 damage   D
          123     437    11 target   Lext/mods/gameserver/model/WorldObject;
          583      24     8 effect   Lext/mods/gameserver/skills/AbstractEffect;
          623     133     8 heading   I
          672      84     9 chargePoint   Lext/mods/gameserver/model/location/Point2D;
          695      61    10 chargeLoc   Lext/mods/gameserver/model/location/Location;
            0     781     0  this   Lext/mods/gameserver/handler/skillhandlers/Pdam;
            0     781     1 creature   Lext/mods/gameserver/model/actor/Creature;
            0     781     2 skill   Lext/mods/gameserver/skills/L2Skill;
            0     781     3 targets   [Lext/mods/gameserver/model/WorldObject;
            0     781     4  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
           14     767     5 playeractor   Lext/mods/gameserver/model/actor/Player;
           23     758     6    ss   Z
           29     752     7 weapon   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 27
        frame_type = 8 /* same */
        frame_type = 254 /* append */
          offset_delta = 45
          locals = [ class ext/mods/gameserver/model/actor/Player, int, class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 252 /* append */
          offset_delta = 14
          locals = [ int ]
        frame_type = 20 /* same */
        frame_type = 250 /* chop */
          offset_delta = 7
        frame_type = 254 /* append */
          offset_delta = 10
          locals = [ class "[Lext/mods/gameserver/model/WorldObject;", int, int ]
        frame_type = 253 /* append */
          offset_delta = 39
          locals = [ class ext/mods/gameserver/model/WorldObject, class ext/mods/gameserver/model/actor/Creature ]
        frame_type = 23 /* same */
        frame_type = 53 /* same */
        frame_type = 29 /* same */
        frame_type = 2 /* same */
        frame_type = 29 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 254 /* append */
          offset_delta = 64
          locals = [ int, class ext/mods/gameserver/enums/skills/ShieldDefense, int ]
        frame_type = 19 /* same */
        frame_type = 252 /* append */
          offset_delta = 58
          locals = [ double ]
        frame_type = 28 /* same */
        frame_type = 47 /* same */
        frame_type = 27 /* same */
        frame_type = 9 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 9
          locals = [ class ext/mods/gameserver/handler/skillhandlers/Pdam, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/skills/L2Skill, class "[Lext/mods/gameserver/model/WorldObject;", class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/model/actor/Player, int, class ext/mods/gameserver/model/item/instance/ItemInstance, class "[Lext/mods/gameserver/model/WorldObject;", int, int ]
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

  public ext.mods.gameserver.enums.skills.SkillType[] getSkillIds();
    descriptor: ()[Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #313                // Field SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
         3: areturn
      LineNumberTable:
        line 194: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/skillhandlers/Pdam;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_2
         1: anewarray     #317                // class ext/mods/gameserver/enums/skills/SkillType
         4: dup
         5: iconst_0
         6: getstatic     #319                // Field ext/mods/gameserver/enums/skills/SkillType.PDAM:Lext/mods/gameserver/enums/skills/SkillType;
         9: aastore
        10: dup
        11: iconst_1
        12: getstatic     #323                // Field ext/mods/gameserver/enums/skills/SkillType.FATAL:Lext/mods/gameserver/enums/skills/SkillType;
        15: aastore
        16: putstatic     #313                // Field SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
        19: return
      LineNumberTable:
        line 50: 0
}
SourceFile: "Pdam.java"
