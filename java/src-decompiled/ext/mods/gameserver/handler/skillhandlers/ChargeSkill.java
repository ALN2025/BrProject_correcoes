// Bytecode for: ext.mods.gameserver.handler.skillhandlers.ChargeSkill
// File: ext\mods\gameserver\handler\skillhandlers\ChargeSkill.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/skillhandlers/ChargeSkill.class
  Last modified 9 de jul de 2026; size 7982 bytes
  MD5 checksum ece4ffb944a17e6fff4efb2184b5435f
  Compiled from "ChargeSkill.java"
public class ext.mods.gameserver.handler.skillhandlers.ChargeSkill implements ext.mods.gameserver.handler.ISkillHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #24                         // ext/mods/gameserver/handler/skillhandlers/ChargeSkill
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 3, methods: 8, attributes: 1
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
   #17 = Methodref          #18.#19       // ext/mods/gameserver/skills/L2Skill.getId:()I
   #18 = Class              #20           // ext/mods/gameserver/skills/L2Skill
   #19 = NameAndType        #21:#22       // getId:()I
   #20 = Utf8               ext/mods/gameserver/skills/L2Skill
   #21 = Utf8               getId
   #22 = Utf8               ()I
   #23 = Methodref          #24.#25       // ext/mods/gameserver/handler/skillhandlers/ChargeSkill.isChargeAccumulatingSkill:(I)Z
   #24 = Class              #26           // ext/mods/gameserver/handler/skillhandlers/ChargeSkill
   #25 = NameAndType        #27:#28       // isChargeAccumulatingSkill:(I)Z
   #26 = Utf8               ext/mods/gameserver/handler/skillhandlers/ChargeSkill
   #27 = Utf8               isChargeAccumulatingSkill
   #28 = Utf8               (I)Z
   #29 = Methodref          #24.#30       // ext/mods/gameserver/handler/skillhandlers/ChargeSkill.handleChargeIncrease:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)V
   #30 = NameAndType        #31:#32       // handleChargeIncrease:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)V
   #31 = Utf8               handleChargeIncrease
   #32 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)V
   #33 = Methodref          #18.#34       // ext/mods/gameserver/skills/L2Skill.getPower:()D
   #34 = NameAndType        #35:#36       // getPower:()D
   #35 = Utf8               getPower
   #36 = Utf8               ()D
   #37 = Methodref          #18.#38       // ext/mods/gameserver/skills/L2Skill.isOffensive:()Z
   #38 = NameAndType        #39:#12       // isOffensive:()Z
   #39 = Utf8               isOffensive
   #40 = Methodref          #24.#41       // ext/mods/gameserver/handler/skillhandlers/ChargeSkill.handlePhysicalDamage:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;)V
   #41 = NameAndType        #42:#43       // handlePhysicalDamage:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;)V
   #42 = Utf8               handlePhysicalDamage
   #43 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;)V
   #44 = Methodref          #24.#45       // ext/mods/gameserver/handler/skillhandlers/ChargeSkill.handleBuffEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;)V
   #45 = NameAndType        #46:#43       // handleBuffEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;)V
   #46 = Utf8               handleBuffEffects
   #47 = Methodref          #18.#48       // ext/mods/gameserver/skills/L2Skill.hasSelfEffects:()Z
   #48 = NameAndType        #49:#12       // hasSelfEffects:()Z
   #49 = Utf8               hasSelfEffects
   #50 = Methodref          #8.#51        // ext/mods/gameserver/model/actor/Creature.getFirstEffect:(I)Lext/mods/gameserver/skills/AbstractEffect;
   #51 = NameAndType        #52:#53       // getFirstEffect:(I)Lext/mods/gameserver/skills/AbstractEffect;
   #52 = Utf8               getFirstEffect
   #53 = Utf8               (I)Lext/mods/gameserver/skills/AbstractEffect;
   #54 = Methodref          #55.#56       // ext/mods/gameserver/skills/AbstractEffect.isSelfEffect:()Z
   #55 = Class              #57           // ext/mods/gameserver/skills/AbstractEffect
   #56 = NameAndType        #58:#12       // isSelfEffect:()Z
   #57 = Utf8               ext/mods/gameserver/skills/AbstractEffect
   #58 = Utf8               isSelfEffect
   #59 = Methodref          #55.#60       // ext/mods/gameserver/skills/AbstractEffect.exit:()V
   #60 = NameAndType        #61:#6        // exit:()V
   #61 = Utf8               exit
   #62 = Methodref          #18.#63       // ext/mods/gameserver/skills/L2Skill.getEffectsSelf:(Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
   #63 = NameAndType        #64:#65       // getEffectsSelf:(Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
   #64 = Utf8               getEffectsSelf
   #65 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
   #66 = Methodref          #18.#67       // ext/mods/gameserver/skills/L2Skill.getMaxCharges:()I
   #67 = NameAndType        #68:#22       // getMaxCharges:()I
   #68 = Utf8               getMaxCharges
   #69 = Methodref          #70.#71       // ext/mods/gameserver/model/actor/Player.getCharges:()I
   #70 = Class              #72           // ext/mods/gameserver/model/actor/Player
   #71 = NameAndType        #73:#22       // getCharges:()I
   #72 = Utf8               ext/mods/gameserver/model/actor/Player
   #73 = Utf8               getCharges
   #74 = Fieldref           #75.#76       // ext/mods/gameserver/network/SystemMessageId.FORCE_MAXLEVEL_REACHED:Lext/mods/gameserver/network/SystemMessageId;
   #75 = Class              #77           // ext/mods/gameserver/network/SystemMessageId
   #76 = NameAndType        #78:#79       // FORCE_MAXLEVEL_REACHED:Lext/mods/gameserver/network/SystemMessageId;
   #77 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #78 = Utf8               FORCE_MAXLEVEL_REACHED
   #79 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #80 = Methodref          #70.#81       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #81 = NameAndType        #82:#83       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #82 = Utf8               sendPacket
   #83 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #84 = Methodref          #18.#85       // ext/mods/gameserver/skills/L2Skill.getNumCharges:()I
   #85 = NameAndType        #86:#22       // getNumCharges:()I
   #86 = Utf8               getNumCharges
   #87 = Methodref          #88.#89       // java/lang/Math.max:(II)I
   #88 = Class              #90           // java/lang/Math
   #89 = NameAndType        #91:#92       // max:(II)I
   #90 = Utf8               java/lang/Math
   #91 = Utf8               max
   #92 = Utf8               (II)I
   #93 = Methodref          #70.#94       // ext/mods/gameserver/model/actor/Player.increaseCharges:(II)V
   #94 = NameAndType        #95:#96       // increaseCharges:(II)V
   #95 = Utf8               increaseCharges
   #96 = Utf8               (II)V
   #97 = Fieldref           #98.#99       // ext/mods/gameserver/enums/items/ShotType.SOULSHOT:Lext/mods/gameserver/enums/items/ShotType;
   #98 = Class              #100          // ext/mods/gameserver/enums/items/ShotType
   #99 = NameAndType        #101:#102     // SOULSHOT:Lext/mods/gameserver/enums/items/ShotType;
  #100 = Utf8               ext/mods/gameserver/enums/items/ShotType
  #101 = Utf8               SOULSHOT
  #102 = Utf8               Lext/mods/gameserver/enums/items/ShotType;
  #103 = Methodref          #8.#104       // ext/mods/gameserver/model/actor/Creature.isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
  #104 = NameAndType        #105:#106     // isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
  #105 = Utf8               isChargedShot
  #106 = Utf8               (Lext/mods/gameserver/enums/items/ShotType;)Z
  #107 = Methodref          #8.#108       // ext/mods/gameserver/model/actor/Creature.getActiveWeaponInstance:()Lext/mods/gameserver/model/item/instance/ItemInstance;
  #108 = NameAndType        #109:#110     // getActiveWeaponInstance:()Lext/mods/gameserver/model/item/instance/ItemInstance;
  #109 = Utf8               getActiveWeaponInstance
  #110 = Utf8               ()Lext/mods/gameserver/model/item/instance/ItemInstance;
  #111 = Methodref          #8.#112       // ext/mods/gameserver/model/actor/Creature.isDead:()Z
  #112 = NameAndType        #113:#12      // isDead:()Z
  #113 = Utf8               isDead
  #114 = Class              #115          // ext/mods/gameserver/model/actor/Playable
  #115 = Utf8               ext/mods/gameserver/model/actor/Playable
  #116 = Fieldref           #117.#118     // ext/mods/gameserver/skills/effects/EffectFear.DOESNT_AFFECT_PLAYABLE:[I
  #117 = Class              #119          // ext/mods/gameserver/skills/effects/EffectFear
  #118 = NameAndType        #120:#121     // DOESNT_AFFECT_PLAYABLE:[I
  #119 = Utf8               ext/mods/gameserver/skills/effects/EffectFear
  #120 = Utf8               DOESNT_AFFECT_PLAYABLE
  #121 = Utf8               [I
  #122 = Methodref          #123.#124     // ext/mods/commons/util/ArraysUtil.contains:([II)Z
  #123 = Class              #125          // ext/mods/commons/util/ArraysUtil
  #124 = NameAndType        #126:#127     // contains:([II)Z
  #125 = Utf8               ext/mods/commons/util/ArraysUtil
  #126 = Utf8               contains
  #127 = Utf8               ([II)Z
  #128 = Methodref          #129.#130     // ext/mods/gameserver/model/item/instance/ItemInstance.getItemType:()Lext/mods/gameserver/enums/items/ItemType;
  #129 = Class              #131          // ext/mods/gameserver/model/item/instance/ItemInstance
  #130 = NameAndType        #132:#133     // getItemType:()Lext/mods/gameserver/enums/items/ItemType;
  #131 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
  #132 = Utf8               getItemType
  #133 = Utf8               ()Lext/mods/gameserver/enums/items/ItemType;
  #134 = Fieldref           #135.#136     // ext/mods/gameserver/enums/items/WeaponType.BOW:Lext/mods/gameserver/enums/items/WeaponType;
  #135 = Class              #137          // ext/mods/gameserver/enums/items/WeaponType
  #136 = NameAndType        #138:#139     // BOW:Lext/mods/gameserver/enums/items/WeaponType;
  #137 = Utf8               ext/mods/gameserver/enums/items/WeaponType
  #138 = Utf8               BOW
  #139 = Utf8               Lext/mods/gameserver/enums/items/WeaponType;
  #140 = Methodref          #141.#142     // ext/mods/gameserver/skills/Formulas.calcPhysicalSkillEvasion:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
  #141 = Class              #143          // ext/mods/gameserver/skills/Formulas
  #142 = NameAndType        #144:#145     // calcPhysicalSkillEvasion:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
  #143 = Utf8               ext/mods/gameserver/skills/Formulas
  #144 = Utf8               calcPhysicalSkillEvasion
  #145 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
  #146 = Fieldref           #75.#147      // ext/mods/gameserver/network/SystemMessageId.S1_DODGES_ATTACK:Lext/mods/gameserver/network/SystemMessageId;
  #147 = NameAndType        #148:#79      // S1_DODGES_ATTACK:Lext/mods/gameserver/network/SystemMessageId;
  #148 = Utf8               S1_DODGES_ATTACK
  #149 = Methodref          #150.#151     // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #150 = Class              #152          // ext/mods/gameserver/network/serverpackets/SystemMessage
  #151 = NameAndType        #153:#154     // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #152 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #153 = Utf8               getSystemMessage
  #154 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #155 = Methodref          #150.#156     // ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #156 = NameAndType        #157:#158     // addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #157 = Utf8               addCharName
  #158 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #159 = Methodref          #70.#160      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #160 = NameAndType        #82:#161      // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #161 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #162 = Methodref          #18.#163      // ext/mods/gameserver/skills/L2Skill.getBaseCritRate:()I
  #163 = NameAndType        #164:#22      // getBaseCritRate:()I
  #164 = Utf8               getBaseCritRate
  #165 = Methodref          #141.#166     // ext/mods/gameserver/skills/Formulas.getSTRBonus:(Lext/mods/gameserver/model/actor/Creature;)D
  #166 = NameAndType        #167:#168     // getSTRBonus:(Lext/mods/gameserver/model/actor/Creature;)D
  #167 = Utf8               getSTRBonus
  #168 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)D
  #169 = Methodref          #141.#170     // ext/mods/gameserver/skills/Formulas.calcCrit:(D)Z
  #170 = NameAndType        #171:#172     // calcCrit:(D)Z
  #171 = Utf8               calcCrit
  #172 = Utf8               (D)Z
  #173 = Methodref          #141.#174     // ext/mods/gameserver/skills/Formulas.calcShldUse:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Lext/mods/gameserver/enums/skills/ShieldDefense;
  #174 = NameAndType        #175:#176     // calcShldUse:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Lext/mods/gameserver/enums/skills/ShieldDefense;
  #175 = Utf8               calcShldUse
  #176 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Lext/mods/gameserver/enums/skills/ShieldDefense;
  #177 = Methodref          #141.#178     // ext/mods/gameserver/skills/Formulas.calcSkillReflect:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)B
  #178 = NameAndType        #179:#180     // calcSkillReflect:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)B
  #179 = Utf8               calcSkillReflect
  #180 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)B
  #181 = Methodref          #18.#182      // ext/mods/gameserver/skills/L2Skill.hasEffects:()Z
  #182 = NameAndType        #183:#12      // hasEffects:()Z
  #183 = Utf8               hasEffects
  #184 = Fieldref           #185.#186     // ext/mods/gameserver/enums/skills/EffectType.BLOCK_DEBUFF:Lext/mods/gameserver/enums/skills/EffectType;
  #185 = Class              #187          // ext/mods/gameserver/enums/skills/EffectType
  #186 = NameAndType        #188:#189     // BLOCK_DEBUFF:Lext/mods/gameserver/enums/skills/EffectType;
  #187 = Utf8               ext/mods/gameserver/enums/skills/EffectType
  #188 = Utf8               BLOCK_DEBUFF
  #189 = Utf8               Lext/mods/gameserver/enums/skills/EffectType;
  #190 = Methodref          #8.#191       // ext/mods/gameserver/model/actor/Creature.getFirstEffect:(Lext/mods/gameserver/enums/skills/EffectType;)Lext/mods/gameserver/skills/AbstractEffect;
  #191 = NameAndType        #52:#192      // getFirstEffect:(Lext/mods/gameserver/enums/skills/EffectType;)Lext/mods/gameserver/skills/AbstractEffect;
  #192 = Utf8               (Lext/mods/gameserver/enums/skills/EffectType;)Lext/mods/gameserver/skills/AbstractEffect;
  #193 = Methodref          #8.#194       // ext/mods/gameserver/model/actor/Creature.stopSkillEffects:(I)V
  #194 = NameAndType        #195:#196     // stopSkillEffects:(I)V
  #195 = Utf8               stopSkillEffects
  #196 = Utf8               (I)V
  #197 = Methodref          #18.#198      // ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #198 = NameAndType        #199:#200     // getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #199 = Utf8               getEffects
  #200 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #201 = Methodref          #18.#202      // ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Ljava/util/List;
  #202 = NameAndType        #199:#203     // getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Ljava/util/List;
  #203 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Ljava/util/List;
  #204 = Methodref          #141.#205     // ext/mods/gameserver/skills/Formulas.calcPhysicalSkillDamage:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/enums/skills/ShieldDefense;ZZ)D
  #205 = NameAndType        #206:#207     // calcPhysicalSkillDamage:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/enums/skills/ShieldDefense;ZZ)D
  #206 = Utf8               calcPhysicalSkillDamage
  #207 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/enums/skills/ShieldDefense;ZZ)D
  #208 = Methodref          #141.#209     // ext/mods/gameserver/skills/Formulas.calcCastBreak:(Lext/mods/gameserver/model/actor/Creature;D)V
  #209 = NameAndType        #210:#211     // calcCastBreak:(Lext/mods/gameserver/model/actor/Creature;D)V
  #210 = Utf8               calcCastBreak
  #211 = Utf8               (Lext/mods/gameserver/model/actor/Creature;D)V
  #212 = Methodref          #8.#213       // ext/mods/gameserver/model/actor/Creature.reduceCurrentHp:(DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #213 = NameAndType        #214:#215     // reduceCurrentHp:(DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #214 = Utf8               reduceCurrentHp
  #215 = Utf8               (DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #216 = Methodref          #8.#217       // ext/mods/gameserver/model/actor/Creature.sendDamageMessage:(Lext/mods/gameserver/model/actor/Creature;IZZZ)V
  #217 = NameAndType        #218:#219     // sendDamageMessage:(Lext/mods/gameserver/model/actor/Creature;IZZZ)V
  #218 = Utf8               sendDamageMessage
  #219 = Utf8               (Lext/mods/gameserver/model/actor/Creature;IZZZ)V
  #220 = Methodref          #141.#221     // ext/mods/gameserver/skills/Formulas.calcLethalHit:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #221 = NameAndType        #222:#223     // calcLethalHit:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #222 = Utf8               calcLethalHit
  #223 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #224 = Fieldref           #75.#225      // ext/mods/gameserver/network/SystemMessageId.ATTACK_FAILED:Lext/mods/gameserver/network/SystemMessageId;
  #225 = NameAndType        #226:#79      // ATTACK_FAILED:Lext/mods/gameserver/network/SystemMessageId;
  #226 = Utf8               ATTACK_FAILED
  #227 = Methodref          #8.#160       // ext/mods/gameserver/model/actor/Creature.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #228 = Methodref          #18.#229      // ext/mods/gameserver/skills/L2Skill.isStaticReuse:()Z
  #229 = NameAndType        #230:#12      // isStaticReuse:()Z
  #230 = Utf8               isStaticReuse
  #231 = Methodref          #8.#232       // ext/mods/gameserver/model/actor/Creature.setChargedShot:(Lext/mods/gameserver/enums/items/ShotType;Z)V
  #232 = NameAndType        #233:#234     // setChargedShot:(Lext/mods/gameserver/enums/items/ShotType;Z)V
  #233 = Utf8               setChargedShot
  #234 = Utf8               (Lext/mods/gameserver/enums/items/ShotType;Z)V
  #235 = Methodref          #18.#236      // ext/mods/gameserver/skills/L2Skill.getTargetType:()Lext/mods/gameserver/enums/skills/SkillTargetType;
  #236 = NameAndType        #237:#238     // getTargetType:()Lext/mods/gameserver/enums/skills/SkillTargetType;
  #237 = Utf8               getTargetType
  #238 = Utf8               ()Lext/mods/gameserver/enums/skills/SkillTargetType;
  #239 = Methodref          #240.#241     // ext/mods/gameserver/enums/skills/SkillTargetType.toString:()Ljava/lang/String;
  #240 = Class              #242          // ext/mods/gameserver/enums/skills/SkillTargetType
  #241 = NameAndType        #243:#244     // toString:()Ljava/lang/String;
  #242 = Utf8               ext/mods/gameserver/enums/skills/SkillTargetType
  #243 = Utf8               toString
  #244 = Utf8               ()Ljava/lang/String;
  #245 = String             #246          // SELF
  #246 = Utf8               SELF
  #247 = Methodref          #248.#249     // java/lang/String.equals:(Ljava/lang/Object;)Z
  #248 = Class              #250          // java/lang/String
  #249 = NameAndType        #251:#252     // equals:(Ljava/lang/Object;)Z
  #250 = Utf8               java/lang/String
  #251 = Utf8               equals
  #252 = Utf8               (Ljava/lang/Object;)Z
  #253 = Fieldref           #24.#254      // ext/mods/gameserver/handler/skillhandlers/ChargeSkill.SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
  #254 = NameAndType        #255:#256     // SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
  #255 = Utf8               SKILL_IDS
  #256 = Utf8               [Lext/mods/gameserver/enums/skills/SkillType;
  #257 = Class              #258          // ext/mods/gameserver/enums/skills/SkillType
  #258 = Utf8               ext/mods/gameserver/enums/skills/SkillType
  #259 = Fieldref           #257.#260     // ext/mods/gameserver/enums/skills/SkillType.SONIC:Lext/mods/gameserver/enums/skills/SkillType;
  #260 = NameAndType        #261:#262     // SONIC:Lext/mods/gameserver/enums/skills/SkillType;
  #261 = Utf8               SONIC
  #262 = Utf8               Lext/mods/gameserver/enums/skills/SkillType;
  #263 = Fieldref           #257.#264     // ext/mods/gameserver/enums/skills/SkillType.FORCE:Lext/mods/gameserver/enums/skills/SkillType;
  #264 = NameAndType        #265:#262     // FORCE:Lext/mods/gameserver/enums/skills/SkillType;
  #265 = Utf8               FORCE
  #266 = Class              #267          // ext/mods/gameserver/handler/ISkillHandler
  #267 = Utf8               ext/mods/gameserver/handler/ISkillHandler
  #268 = Utf8               SONIC_FOCUS
  #269 = Utf8               I
  #270 = Utf8               ConstantValue
  #271 = Integer            8
  #272 = Utf8               FOCUSED_FORCE
  #273 = Integer            50
  #274 = Utf8               Code
  #275 = Utf8               LineNumberTable
  #276 = Utf8               LocalVariableTable
  #277 = Utf8               this
  #278 = Utf8               Lext/mods/gameserver/handler/skillhandlers/ChargeSkill;
  #279 = Utf8               useSkill
  #280 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #281 = Utf8               effect
  #282 = Utf8               Lext/mods/gameserver/skills/AbstractEffect;
  #283 = Utf8               creature
  #284 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #285 = Utf8               skill
  #286 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #287 = Utf8               targets
  #288 = Utf8               [Lext/mods/gameserver/model/WorldObject;
  #289 = Utf8               item
  #290 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #291 = Utf8               player
  #292 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #293 = Utf8               StackMapTable
  #294 = Utf8               addCharges
  #295 = Utf8               maxCharges
  #296 = Utf8               target
  #297 = Utf8               isCrit
  #298 = Utf8               Z
  #299 = Utf8               sDef
  #300 = Utf8               Lext/mods/gameserver/enums/skills/ShieldDefense;
  #301 = Utf8               reflect
  #302 = Utf8               B
  #303 = Utf8               damage
  #304 = Utf8               D
  #305 = Utf8               obj
  #306 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #307 = Utf8               ss
  #308 = Utf8               weapon
  #309 = Class              #288          // "[Lext/mods/gameserver/model/WorldObject;"
  #310 = Class              #311          // ext/mods/gameserver/model/WorldObject
  #311 = Utf8               ext/mods/gameserver/model/WorldObject
  #312 = Class              #313          // ext/mods/gameserver/enums/skills/ShieldDefense
  #313 = Utf8               ext/mods/gameserver/enums/skills/ShieldDefense
  #314 = Utf8               skillId
  #315 = Utf8               getSkillIds
  #316 = Utf8               ()[Lext/mods/gameserver/enums/skills/SkillType;
  #317 = Utf8               <clinit>
  #318 = Utf8               SourceFile
  #319 = Utf8               ChargeSkill.java
{
  public ext.mods.gameserver.handler.skillhandlers.ChargeSkill();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 44: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/skillhandlers/ChargeSkill;

  public void useSkill(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill, ext.mods.gameserver.model.WorldObject[], ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=7, args_size=5
         0: aload_1
         1: ifnull        15
         4: aload_1
         5: invokevirtual #7                  // Method ext/mods/gameserver/model/actor/Creature.isAlikeDead:()Z
         8: ifne          15
        11: aload_2
        12: ifnonnull     16
        15: return
        16: aload_1
        17: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
        20: astore        5
        22: aload         5
        24: ifnull        45
        27: aload_0
        28: aload_2
        29: invokevirtual #17                 // Method ext/mods/gameserver/skills/L2Skill.getId:()I
        32: invokevirtual #23                 // Method isChargeAccumulatingSkill:(I)Z
        35: ifeq          45
        38: aload_0
        39: aload         5
        41: aload_2
        42: invokevirtual #29                 // Method handleChargeIncrease:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)V
        45: aload_2
        46: invokevirtual #33                 // Method ext/mods/gameserver/skills/L2Skill.getPower:()D
        49: dconst_0
        50: dcmpl
        51: ifgt          61
        54: aload_2
        55: invokevirtual #37                 // Method ext/mods/gameserver/skills/L2Skill.isOffensive:()Z
        58: ifeq          71
        61: aload_0
        62: aload_1
        63: aload_2
        64: aload_3
        65: invokevirtual #40                 // Method handlePhysicalDamage:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;)V
        68: goto          78
        71: aload_0
        72: aload_1
        73: aload_2
        74: aload_3
        75: invokevirtual #44                 // Method handleBuffEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;)V
        78: aload_2
        79: invokevirtual #47                 // Method ext/mods/gameserver/skills/L2Skill.hasSelfEffects:()Z
        82: ifeq          119
        85: aload_1
        86: aload_2
        87: invokevirtual #17                 // Method ext/mods/gameserver/skills/L2Skill.getId:()I
        90: invokevirtual #50                 // Method ext/mods/gameserver/model/actor/Creature.getFirstEffect:(I)Lext/mods/gameserver/skills/AbstractEffect;
        93: astore        6
        95: aload         6
        97: ifnull        113
       100: aload         6
       102: invokevirtual #54                 // Method ext/mods/gameserver/skills/AbstractEffect.isSelfEffect:()Z
       105: ifeq          113
       108: aload         6
       110: invokevirtual #59                 // Method ext/mods/gameserver/skills/AbstractEffect.exit:()V
       113: aload_2
       114: aload_1
       115: invokevirtual #62                 // Method ext/mods/gameserver/skills/L2Skill.getEffectsSelf:(Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
       118: pop
       119: return
      LineNumberTable:
        line 58: 0
        line 59: 15
        line 61: 16
        line 63: 22
        line 65: 38
        line 68: 45
        line 70: 61
        line 74: 71
        line 77: 78
        line 79: 85
        line 80: 95
        line 81: 108
        line 83: 113
        line 85: 119
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           95      24     6 effect   Lext/mods/gameserver/skills/AbstractEffect;
            0     120     0  this   Lext/mods/gameserver/handler/skillhandlers/ChargeSkill;
            0     120     1 creature   Lext/mods/gameserver/model/actor/Creature;
            0     120     2 skill   Lext/mods/gameserver/skills/L2Skill;
            0     120     3 targets   [Lext/mods/gameserver/model/WorldObject;
            0     120     4  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
           22      98     5 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 8
        frame_type = 15 /* same */
        frame_type = 0 /* same */
        frame_type = 252 /* append */
          offset_delta = 28
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 15 /* same */
        frame_type = 9 /* same */
        frame_type = 6 /* same */
        frame_type = 252 /* append */
          offset_delta = 34
          locals = [ class ext/mods/gameserver/skills/AbstractEffect ]
        frame_type = 250 /* chop */
          offset_delta = 5

  public ext.mods.gameserver.enums.skills.SkillType[] getSkillIds();
    descriptor: ()[Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #253                // Field SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
         3: areturn
      LineNumberTable:
        line 192: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/skillhandlers/ChargeSkill;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_2
         1: anewarray     #257                // class ext/mods/gameserver/enums/skills/SkillType
         4: dup
         5: iconst_0
         6: getstatic     #259                // Field ext/mods/gameserver/enums/skills/SkillType.SONIC:Lext/mods/gameserver/enums/skills/SkillType;
         9: aastore
        10: dup
        11: iconst_1
        12: getstatic     #263                // Field ext/mods/gameserver/enums/skills/SkillType.FORCE:Lext/mods/gameserver/enums/skills/SkillType;
        15: aastore
        16: putstatic     #253                // Field SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
        19: return
      LineNumberTable:
        line 46: 0
}
SourceFile: "ChargeSkill.java"
