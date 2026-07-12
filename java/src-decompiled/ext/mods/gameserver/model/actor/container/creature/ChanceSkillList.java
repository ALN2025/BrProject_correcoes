// Bytecode for: ext.mods.gameserver.model.actor.container.creature.ChanceSkillList
// File: ext\mods\gameserver\model\actor\container\creature\ChanceSkillList.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/container/creature/ChanceSkillList.class
  Last modified 9 de jul de 2026; size 7521 bytes
  MD5 checksum 9e7a7089f068a74e81961c99e4be69ca
  Compiled from "ChanceSkillList.java"
public class ext.mods.gameserver.model.actor.container.creature.ChanceSkillList extends java.util.concurrent.ConcurrentHashMap<ext.mods.gameserver.skills.IChanceSkillTrigger, ext.mods.gameserver.skills.ChanceCondition>
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/actor/container/creature/ChanceSkillList
  super_class: #2                         // java/util/concurrent/ConcurrentHashMap
  interfaces: 0, fields: 2, methods: 9, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/util/concurrent/ConcurrentHashMap."<init>":()V
    #2 = Class              #4            // java/util/concurrent/ConcurrentHashMap
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/util/concurrent/ConcurrentHashMap
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/actor/container/creature/ChanceSkillList._owner:Lext/mods/gameserver/model/actor/Creature;
    #8 = Class              #10           // ext/mods/gameserver/model/actor/container/creature/ChanceSkillList
    #9 = NameAndType        #11:#12       // _owner:Lext/mods/gameserver/model/actor/Creature;
   #10 = Utf8               ext/mods/gameserver/model/actor/container/creature/ChanceSkillList
   #11 = Utf8               _owner
   #12 = Utf8               Lext/mods/gameserver/model/actor/Creature;
   #13 = Class              #14           // ext/mods/gameserver/enums/skills/TriggerType
   #14 = Utf8               ext/mods/gameserver/enums/skills/TriggerType
   #15 = Methodref          #16.#17       // java/util/EnumSet.noneOf:(Ljava/lang/Class;)Ljava/util/EnumSet;
   #16 = Class              #18           // java/util/EnumSet
   #17 = NameAndType        #19:#20       // noneOf:(Ljava/lang/Class;)Ljava/util/EnumSet;
   #18 = Utf8               java/util/EnumSet
   #19 = Utf8               noneOf
   #20 = Utf8               (Ljava/lang/Class;)Ljava/util/EnumSet;
   #21 = Fieldref           #13.#22       // ext/mods/gameserver/enums/skills/TriggerType.ON_HIT:Lext/mods/gameserver/enums/skills/TriggerType;
   #22 = NameAndType        #23:#24       // ON_HIT:Lext/mods/gameserver/enums/skills/TriggerType;
   #23 = Utf8               ON_HIT
   #24 = Utf8               Lext/mods/gameserver/enums/skills/TriggerType;
   #25 = Methodref          #16.#26       // java/util/EnumSet.add:(Ljava/lang/Object;)Z
   #26 = NameAndType        #27:#28       // add:(Ljava/lang/Object;)Z
   #27 = Utf8               add
   #28 = Utf8               (Ljava/lang/Object;)Z
   #29 = Fieldref           #13.#30       // ext/mods/gameserver/enums/skills/TriggerType.ON_CRIT:Lext/mods/gameserver/enums/skills/TriggerType;
   #30 = NameAndType        #31:#24       // ON_CRIT:Lext/mods/gameserver/enums/skills/TriggerType;
   #31 = Utf8               ON_CRIT
   #32 = Methodref          #8.#33        // ext/mods/gameserver/model/actor/container/creature/ChanceSkillList.onChanceSkillEvent:(Ljava/util/Set;Lext/mods/gameserver/model/actor/Creature;)V
   #33 = NameAndType        #34:#35       // onChanceSkillEvent:(Ljava/util/Set;Lext/mods/gameserver/model/actor/Creature;)V
   #34 = Utf8               onChanceSkillEvent
   #35 = Utf8               (Ljava/util/Set;Lext/mods/gameserver/model/actor/Creature;)V
   #36 = Fieldref           #13.#37       // ext/mods/gameserver/enums/skills/TriggerType.ON_ATTACKED:Lext/mods/gameserver/enums/skills/TriggerType;
   #37 = NameAndType        #38:#24       // ON_ATTACKED:Lext/mods/gameserver/enums/skills/TriggerType;
   #38 = Utf8               ON_ATTACKED
   #39 = Fieldref           #13.#40       // ext/mods/gameserver/enums/skills/TriggerType.ON_ATTACKED_HIT:Lext/mods/gameserver/enums/skills/TriggerType;
   #40 = NameAndType        #41:#24       // ON_ATTACKED_HIT:Lext/mods/gameserver/enums/skills/TriggerType;
   #41 = Utf8               ON_ATTACKED_HIT
   #42 = Methodref          #43.#44       // ext/mods/gameserver/skills/L2Skill.isDamage:()Z
   #43 = Class              #45           // ext/mods/gameserver/skills/L2Skill
   #44 = NameAndType        #46:#47       // isDamage:()Z
   #45 = Utf8               ext/mods/gameserver/skills/L2Skill
   #46 = Utf8               isDamage
   #47 = Utf8               ()Z
   #48 = Fieldref           #13.#49       // ext/mods/gameserver/enums/skills/TriggerType.ON_MAGIC_OFFENSIVE:Lext/mods/gameserver/enums/skills/TriggerType;
   #49 = NameAndType        #50:#24       // ON_MAGIC_OFFENSIVE:Lext/mods/gameserver/enums/skills/TriggerType;
   #50 = Utf8               ON_MAGIC_OFFENSIVE
   #51 = Methodref          #43.#52       // ext/mods/gameserver/skills/L2Skill.isOffensive:()Z
   #52 = NameAndType        #53:#47       // isOffensive:()Z
   #53 = Utf8               isOffensive
   #54 = Fieldref           #13.#55       // ext/mods/gameserver/enums/skills/TriggerType.ON_MAGIC_GOOD:Lext/mods/gameserver/enums/skills/TriggerType;
   #55 = NameAndType        #56:#24       // ON_MAGIC_GOOD:Lext/mods/gameserver/enums/skills/TriggerType;
   #56 = Utf8               ON_MAGIC_GOOD
   #57 = Methodref          #58.#59       // ext/mods/gameserver/model/actor/Creature.isDead:()Z
   #58 = Class              #60           // ext/mods/gameserver/model/actor/Creature
   #59 = NameAndType        #61:#47       // isDead:()Z
   #60 = Utf8               ext/mods/gameserver/model/actor/Creature
   #61 = Utf8               isDead
   #62 = Methodref          #8.#63        // ext/mods/gameserver/model/actor/container/creature/ChanceSkillList.entrySet:()Ljava/util/Set;
   #63 = NameAndType        #64:#65       // entrySet:()Ljava/util/Set;
   #64 = Utf8               entrySet
   #65 = Utf8               ()Ljava/util/Set;
   #66 = InterfaceMethodref #67.#68       // java/util/Set.iterator:()Ljava/util/Iterator;
   #67 = Class              #69           // java/util/Set
   #68 = NameAndType        #70:#71       // iterator:()Ljava/util/Iterator;
   #69 = Utf8               java/util/Set
   #70 = Utf8               iterator
   #71 = Utf8               ()Ljava/util/Iterator;
   #72 = InterfaceMethodref #73.#74       // java/util/Iterator.hasNext:()Z
   #73 = Class              #75           // java/util/Iterator
   #74 = NameAndType        #76:#47       // hasNext:()Z
   #75 = Utf8               java/util/Iterator
   #76 = Utf8               hasNext
   #77 = InterfaceMethodref #73.#78       // java/util/Iterator.next:()Ljava/lang/Object;
   #78 = NameAndType        #79:#80       // next:()Ljava/lang/Object;
   #79 = Utf8               next
   #80 = Utf8               ()Ljava/lang/Object;
   #81 = Class              #82           // java/util/Map$Entry
   #82 = Utf8               java/util/Map$Entry
   #83 = InterfaceMethodref #81.#84       // java/util/Map$Entry.getValue:()Ljava/lang/Object;
   #84 = NameAndType        #85:#80       // getValue:()Ljava/lang/Object;
   #85 = Utf8               getValue
   #86 = Class              #87           // ext/mods/gameserver/skills/ChanceCondition
   #87 = Utf8               ext/mods/gameserver/skills/ChanceCondition
   #88 = Methodref          #86.#89       // ext/mods/gameserver/skills/ChanceCondition.trigger:(Ljava/util/Set;)Z
   #89 = NameAndType        #90:#91       // trigger:(Ljava/util/Set;)Z
   #90 = Utf8               trigger
   #91 = Utf8               (Ljava/util/Set;)Z
   #92 = InterfaceMethodref #81.#93       // java/util/Map$Entry.getKey:()Ljava/lang/Object;
   #93 = NameAndType        #94:#80       // getKey:()Ljava/lang/Object;
   #94 = Utf8               getKey
   #95 = Class              #96           // ext/mods/gameserver/skills/IChanceSkillTrigger
   #96 = Utf8               ext/mods/gameserver/skills/IChanceSkillTrigger
   #97 = Methodref          #8.#98        // ext/mods/gameserver/model/actor/container/creature/ChanceSkillList.makeCast:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;)V
   #98 = NameAndType        #99:#100      // makeCast:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;)V
   #99 = Utf8               makeCast
  #100 = Utf8               (Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;)V
  #101 = Class              #102          // ext/mods/gameserver/skills/effects/EffectChanceSkillTrigger
  #102 = Utf8               ext/mods/gameserver/skills/effects/EffectChanceSkillTrigger
  #103 = Methodref          #8.#104       // ext/mods/gameserver/model/actor/container/creature/ChanceSkillList.makeCast:(Lext/mods/gameserver/skills/effects/EffectChanceSkillTrigger;Lext/mods/gameserver/model/actor/Creature;)V
  #104 = NameAndType        #99:#105      // makeCast:(Lext/mods/gameserver/skills/effects/EffectChanceSkillTrigger;Lext/mods/gameserver/model/actor/Creature;)V
  #105 = Utf8               (Lext/mods/gameserver/skills/effects/EffectChanceSkillTrigger;Lext/mods/gameserver/model/actor/Creature;)V
  #106 = Methodref          #43.#107      // ext/mods/gameserver/skills/L2Skill.getWeaponDependancy:(Lext/mods/gameserver/model/actor/Creature;)Z
  #107 = NameAndType        #108:#109     // getWeaponDependancy:(Lext/mods/gameserver/model/actor/Creature;)Z
  #108 = Utf8               getWeaponDependancy
  #109 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
  #110 = Methodref          #43.#111      // ext/mods/gameserver/skills/L2Skill.checkCondition:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Z)Z
  #111 = NameAndType        #112:#113     // checkCondition:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Z)Z
  #112 = Utf8               checkCondition
  #113 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Z)Z
  #114 = Methodref          #43.#115      // ext/mods/gameserver/skills/L2Skill.triggersChanceSkill:()Z
  #115 = NameAndType        #116:#47      // triggersChanceSkill:()Z
  #116 = Utf8               triggersChanceSkill
  #117 = Methodref          #118.#119     // ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
  #118 = Class              #120          // ext/mods/gameserver/data/SkillTable
  #119 = NameAndType        #121:#122     // getInstance:()Lext/mods/gameserver/data/SkillTable;
  #120 = Utf8               ext/mods/gameserver/data/SkillTable
  #121 = Utf8               getInstance
  #122 = Utf8               ()Lext/mods/gameserver/data/SkillTable;
  #123 = Methodref          #43.#124      // ext/mods/gameserver/skills/L2Skill.getTriggeredChanceId:()I
  #124 = NameAndType        #125:#126     // getTriggeredChanceId:()I
  #125 = Utf8               getTriggeredChanceId
  #126 = Utf8               ()I
  #127 = Methodref          #43.#128      // ext/mods/gameserver/skills/L2Skill.getTriggeredChanceLevel:()I
  #128 = NameAndType        #129:#126     // getTriggeredChanceLevel:()I
  #129 = Utf8               getTriggeredChanceLevel
  #130 = Methodref          #118.#131     // ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
  #131 = NameAndType        #132:#133     // getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
  #132 = Utf8               getInfo
  #133 = Utf8               (II)Lext/mods/gameserver/skills/L2Skill;
  #134 = Methodref          #43.#135      // ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
  #135 = NameAndType        #136:#137     // getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
  #136 = Utf8               getSkillType
  #137 = Utf8               ()Lext/mods/gameserver/enums/skills/SkillType;
  #138 = Fieldref           #139.#140     // ext/mods/gameserver/enums/skills/SkillType.NOTDONE:Lext/mods/gameserver/enums/skills/SkillType;
  #139 = Class              #141          // ext/mods/gameserver/enums/skills/SkillType
  #140 = NameAndType        #142:#143     // NOTDONE:Lext/mods/gameserver/enums/skills/SkillType;
  #141 = Utf8               ext/mods/gameserver/enums/skills/SkillType
  #142 = Utf8               NOTDONE
  #143 = Utf8               Lext/mods/gameserver/enums/skills/SkillType;
  #144 = Methodref          #58.#145      // ext/mods/gameserver/model/actor/Creature.isSkillDisabled:(Lext/mods/gameserver/skills/L2Skill;)Z
  #145 = NameAndType        #146:#147     // isSkillDisabled:(Lext/mods/gameserver/skills/L2Skill;)Z
  #146 = Utf8               isSkillDisabled
  #147 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)Z
  #148 = Methodref          #43.#149      // ext/mods/gameserver/skills/L2Skill.getReuseDelay:()I
  #149 = NameAndType        #150:#126     // getReuseDelay:()I
  #150 = Utf8               getReuseDelay
  #151 = Methodref          #58.#152      // ext/mods/gameserver/model/actor/Creature.disableSkill:(Lext/mods/gameserver/skills/L2Skill;J)V
  #152 = NameAndType        #153:#154     // disableSkill:(Lext/mods/gameserver/skills/L2Skill;J)V
  #153 = Utf8               disableSkill
  #154 = Utf8               (Lext/mods/gameserver/skills/L2Skill;J)V
  #155 = Methodref          #43.#156      // ext/mods/gameserver/skills/L2Skill.getTargetList:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)[Lext/mods/gameserver/model/actor/Creature;
  #156 = NameAndType        #157:#158     // getTargetList:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)[Lext/mods/gameserver/model/actor/Creature;
  #157 = Utf8               getTargetList
  #158 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)[Lext/mods/gameserver/model/actor/Creature;
  #159 = Class              #160          // ext/mods/gameserver/network/serverpackets/MagicSkillLaunched
  #160 = Utf8               ext/mods/gameserver/network/serverpackets/MagicSkillLaunched
  #161 = Methodref          #159.#162     // ext/mods/gameserver/network/serverpackets/MagicSkillLaunched."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/actor/Creature;)V
  #162 = NameAndType        #5:#163       // "<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/actor/Creature;)V
  #163 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/actor/Creature;)V
  #164 = Methodref          #58.#165      // ext/mods/gameserver/model/actor/Creature.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #165 = NameAndType        #166:#167     // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #166 = Utf8               broadcastPacket
  #167 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #168 = Class              #169          // ext/mods/gameserver/network/serverpackets/MagicSkillUse
  #169 = Utf8               ext/mods/gameserver/network/serverpackets/MagicSkillUse
  #170 = Methodref          #43.#171      // ext/mods/gameserver/skills/L2Skill.getId:()I
  #171 = NameAndType        #172:#126     // getId:()I
  #172 = Utf8               getId
  #173 = Methodref          #43.#174      // ext/mods/gameserver/skills/L2Skill.getLevel:()I
  #174 = NameAndType        #175:#126     // getLevel:()I
  #175 = Utf8               getLevel
  #176 = Methodref          #168.#177     // ext/mods/gameserver/network/serverpackets/MagicSkillUse."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
  #177 = NameAndType        #5:#178       // "<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
  #178 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
  #179 = Methodref          #180.#181     // ext/mods/gameserver/handler/SkillHandler.getInstance:()Lext/mods/gameserver/handler/SkillHandler;
  #180 = Class              #182          // ext/mods/gameserver/handler/SkillHandler
  #181 = NameAndType        #121:#183     // getInstance:()Lext/mods/gameserver/handler/SkillHandler;
  #182 = Utf8               ext/mods/gameserver/handler/SkillHandler
  #183 = Utf8               ()Lext/mods/gameserver/handler/SkillHandler;
  #184 = Methodref          #180.#185     // ext/mods/gameserver/handler/SkillHandler.getHandler:(Ljava/lang/Object;)Lext/mods/gameserver/handler/ISkillHandler;
  #185 = NameAndType        #186:#187     // getHandler:(Ljava/lang/Object;)Lext/mods/gameserver/handler/ISkillHandler;
  #186 = Utf8               getHandler
  #187 = Utf8               (Ljava/lang/Object;)Lext/mods/gameserver/handler/ISkillHandler;
  #188 = InterfaceMethodref #189.#190     // ext/mods/gameserver/handler/ISkillHandler.useSkill:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #189 = Class              #191          // ext/mods/gameserver/handler/ISkillHandler
  #190 = NameAndType        #192:#193     // useSkill:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #191 = Utf8               ext/mods/gameserver/handler/ISkillHandler
  #192 = Utf8               useSkill
  #193 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #194 = Methodref          #43.#195      // ext/mods/gameserver/skills/L2Skill.useSkill:(Lext/mods/gameserver/model/actor/Creature;[Lext/mods/gameserver/model/WorldObject;)V
  #195 = NameAndType        #192:#196     // useSkill:(Lext/mods/gameserver/model/actor/Creature;[Lext/mods/gameserver/model/WorldObject;)V
  #196 = Utf8               (Lext/mods/gameserver/model/actor/Creature;[Lext/mods/gameserver/model/WorldObject;)V
  #197 = Methodref          #101.#115     // ext/mods/gameserver/skills/effects/EffectChanceSkillTrigger.triggersChanceSkill:()Z
  #198 = Methodref          #101.#124     // ext/mods/gameserver/skills/effects/EffectChanceSkillTrigger.getTriggeredChanceId:()I
  #199 = Methodref          #101.#128     // ext/mods/gameserver/skills/effects/EffectChanceSkillTrigger.getTriggeredChanceLevel:()I
  #200 = Methodref          #43.#201      // ext/mods/gameserver/skills/L2Skill.getTargetType:()Lext/mods/gameserver/enums/skills/SkillTargetType;
  #201 = NameAndType        #202:#203     // getTargetType:()Lext/mods/gameserver/enums/skills/SkillTargetType;
  #202 = Utf8               getTargetType
  #203 = Utf8               ()Lext/mods/gameserver/enums/skills/SkillTargetType;
  #204 = Fieldref           #205.#206     // ext/mods/gameserver/enums/skills/SkillTargetType.SELF:Lext/mods/gameserver/enums/skills/SkillTargetType;
  #205 = Class              #207          // ext/mods/gameserver/enums/skills/SkillTargetType
  #206 = NameAndType        #208:#209     // SELF:Lext/mods/gameserver/enums/skills/SkillTargetType;
  #207 = Utf8               ext/mods/gameserver/enums/skills/SkillTargetType
  #208 = Utf8               SELF
  #209 = Utf8               Lext/mods/gameserver/enums/skills/SkillTargetType;
  #210 = Methodref          #101.#211     // ext/mods/gameserver/skills/effects/EffectChanceSkillTrigger.getEffector:()Lext/mods/gameserver/model/actor/Creature;
  #211 = NameAndType        #212:#213     // getEffector:()Lext/mods/gameserver/model/actor/Creature;
  #212 = Utf8               getEffector
  #213 = Utf8               ()Lext/mods/gameserver/model/actor/Creature;
  #214 = Utf8               serialVersionUID
  #215 = Utf8               J
  #216 = Utf8               ConstantValue
  #217 = Long               1l
  #219 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
  #220 = Utf8               Code
  #221 = Utf8               LineNumberTable
  #222 = Utf8               LocalVariableTable
  #223 = Utf8               this
  #224 = Utf8               Lext/mods/gameserver/model/actor/container/creature/ChanceSkillList;
  #225 = Utf8               owner
  #226 = Utf8               getOwner
  #227 = Utf8               onTargetHit
  #228 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Z)V
  #229 = Utf8               target
  #230 = Utf8               isCrit
  #231 = Utf8               Z
  #232 = Utf8               triggers
  #233 = Utf8               Ljava/util/EnumSet;
  #234 = Utf8               LocalVariableTypeTable
  #235 = Utf8               Ljava/util/EnumSet<Lext/mods/gameserver/enums/skills/TriggerType;>;
  #236 = Utf8               StackMapTable
  #237 = Utf8               onSelfHit
  #238 = Utf8               onSkillTargetHit
  #239 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #240 = Utf8               skill
  #241 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #242 = Utf8               onSkillSelfHit
  #243 = Utf8               ecst
  #244 = Utf8               Lext/mods/gameserver/skills/effects/EffectChanceSkillTrigger;
  #245 = Utf8               Lext/mods/gameserver/skills/IChanceSkillTrigger;
  #246 = Utf8               cond
  #247 = Utf8               Lext/mods/gameserver/skills/ChanceCondition;
  #248 = Utf8               entry
  #249 = Utf8               Ljava/util/Map$Entry;
  #250 = Utf8               Ljava/util/Set;
  #251 = Utf8               Ljava/util/Map$Entry<Lext/mods/gameserver/skills/IChanceSkillTrigger;Lext/mods/gameserver/skills/ChanceCondition;>;
  #252 = Utf8               Ljava/util/Set<Lext/mods/gameserver/enums/skills/TriggerType;>;
  #253 = Utf8               Signature
  #254 = Utf8               (Ljava/util/Set<Lext/mods/gameserver/enums/skills/TriggerType;>;Lext/mods/gameserver/model/actor/Creature;)V
  #255 = Utf8               targets
  #256 = Utf8               [Lext/mods/gameserver/model/actor/Creature;
  #257 = Utf8               firstTarget
  #258 = Utf8               handler
  #259 = Utf8               Lext/mods/gameserver/handler/ISkillHandler;
  #260 = Class              #256          // "[Lext/mods/gameserver/model/actor/Creature;"
  #261 = Utf8               effect
  #262 = Utf8               triggered
  #263 = Utf8               caster
  #264 = Utf8               Ljava/util/concurrent/ConcurrentHashMap<Lext/mods/gameserver/skills/IChanceSkillTrigger;Lext/mods/gameserver/skills/ChanceCondition;>;
  #265 = Utf8               SourceFile
  #266 = Utf8               ChanceSkillList.java
  #267 = Utf8               InnerClasses
  #268 = Class              #269          // java/util/Map
  #269 = Utf8               java/util/Map
  #270 = Utf8               Entry
{
  public ext.mods.gameserver.model.actor.container.creature.ChanceSkillList(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #7                  // Field _owner:Lext/mods/gameserver/model/actor/Creature;
         9: return
      LineNumberTable:
        line 47: 0
        line 49: 4
        line 50: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/actor/container/creature/ChanceSkillList;
            0      10     1 owner   Lext/mods/gameserver/model/actor/Creature;

  public ext.mods.gameserver.model.actor.Creature getOwner();
    descriptor: ()Lext/mods/gameserver/model/actor/Creature;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _owner:Lext/mods/gameserver/model/actor/Creature;
         4: areturn
      LineNumberTable:
        line 54: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/container/creature/ChanceSkillList;

  public void onTargetHit(ext.mods.gameserver.model.actor.Creature, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=3
         0: ldc           #13                 // class ext/mods/gameserver/enums/skills/TriggerType
         2: invokestatic  #15                 // Method java/util/EnumSet.noneOf:(Ljava/lang/Class;)Ljava/util/EnumSet;
         5: astore_3
         6: aload_3
         7: getstatic     #21                 // Field ext/mods/gameserver/enums/skills/TriggerType.ON_HIT:Lext/mods/gameserver/enums/skills/TriggerType;
        10: invokevirtual #25                 // Method java/util/EnumSet.add:(Ljava/lang/Object;)Z
        13: pop
        14: iload_2
        15: ifeq          26
        18: aload_3
        19: getstatic     #29                 // Field ext/mods/gameserver/enums/skills/TriggerType.ON_CRIT:Lext/mods/gameserver/enums/skills/TriggerType;
        22: invokevirtual #25                 // Method java/util/EnumSet.add:(Ljava/lang/Object;)Z
        25: pop
        26: aload_0
        27: aload_3
        28: aload_1
        29: invokevirtual #32                 // Method onChanceSkillEvent:(Ljava/util/Set;Lext/mods/gameserver/model/actor/Creature;)V
        32: return
      LineNumberTable:
        line 59: 0
        line 61: 6
        line 63: 14
        line 64: 18
        line 66: 26
        line 67: 32
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      33     0  this   Lext/mods/gameserver/model/actor/container/creature/ChanceSkillList;
            0      33     1 target   Lext/mods/gameserver/model/actor/Creature;
            0      33     2 isCrit   Z
            6      27     3 triggers   Ljava/util/EnumSet;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            6      27     3 triggers   Ljava/util/EnumSet<Lext/mods/gameserver/enums/skills/TriggerType;>;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 26
          locals = [ class java/util/EnumSet ]

  public void onSelfHit(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=2
         0: ldc           #13                 // class ext/mods/gameserver/enums/skills/TriggerType
         2: invokestatic  #15                 // Method java/util/EnumSet.noneOf:(Ljava/lang/Class;)Ljava/util/EnumSet;
         5: astore_2
         6: aload_2
         7: getstatic     #36                 // Field ext/mods/gameserver/enums/skills/TriggerType.ON_ATTACKED:Lext/mods/gameserver/enums/skills/TriggerType;
        10: invokevirtual #25                 // Method java/util/EnumSet.add:(Ljava/lang/Object;)Z
        13: pop
        14: aload_2
        15: getstatic     #39                 // Field ext/mods/gameserver/enums/skills/TriggerType.ON_ATTACKED_HIT:Lext/mods/gameserver/enums/skills/TriggerType;
        18: invokevirtual #25                 // Method java/util/EnumSet.add:(Ljava/lang/Object;)Z
        21: pop
        22: aload_0
        23: aload_2
        24: aload_1
        25: invokevirtual #32                 // Method onChanceSkillEvent:(Ljava/util/Set;Lext/mods/gameserver/model/actor/Creature;)V
        28: return
      LineNumberTable:
        line 71: 0
        line 73: 6
        line 74: 14
        line 76: 22
        line 77: 28
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      29     0  this   Lext/mods/gameserver/model/actor/container/creature/ChanceSkillList;
            0      29     1 target   Lext/mods/gameserver/model/actor/Creature;
            6      23     2 triggers   Ljava/util/EnumSet;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            6      23     2 triggers   Ljava/util/EnumSet<Lext/mods/gameserver/enums/skills/TriggerType;>;

  public void onSkillTargetHit(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=3
         0: ldc           #13                 // class ext/mods/gameserver/enums/skills/TriggerType
         2: invokestatic  #15                 // Method java/util/EnumSet.noneOf:(Ljava/lang/Class;)Ljava/util/EnumSet;
         5: astore_3
         6: aload_2
         7: invokevirtual #42                 // Method ext/mods/gameserver/skills/L2Skill.isDamage:()Z
        10: ifeq          24
        13: aload_3
        14: getstatic     #48                 // Field ext/mods/gameserver/enums/skills/TriggerType.ON_MAGIC_OFFENSIVE:Lext/mods/gameserver/enums/skills/TriggerType;
        17: invokevirtual #25                 // Method java/util/EnumSet.add:(Ljava/lang/Object;)Z
        20: pop
        21: goto          39
        24: aload_2
        25: invokevirtual #51                 // Method ext/mods/gameserver/skills/L2Skill.isOffensive:()Z
        28: ifne          39
        31: aload_3
        32: getstatic     #54                 // Field ext/mods/gameserver/enums/skills/TriggerType.ON_MAGIC_GOOD:Lext/mods/gameserver/enums/skills/TriggerType;
        35: invokevirtual #25                 // Method java/util/EnumSet.add:(Ljava/lang/Object;)Z
        38: pop
        39: aload_0
        40: aload_3
        41: aload_1
        42: invokevirtual #32                 // Method onChanceSkillEvent:(Ljava/util/Set;Lext/mods/gameserver/model/actor/Creature;)V
        45: return
      LineNumberTable:
        line 81: 0
        line 83: 6
        line 84: 13
        line 85: 24
        line 86: 31
        line 88: 39
        line 89: 45
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      46     0  this   Lext/mods/gameserver/model/actor/container/creature/ChanceSkillList;
            0      46     1 target   Lext/mods/gameserver/model/actor/Creature;
            0      46     2 skill   Lext/mods/gameserver/skills/L2Skill;
            6      40     3 triggers   Ljava/util/EnumSet;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            6      40     3 triggers   Ljava/util/EnumSet<Lext/mods/gameserver/enums/skills/TriggerType;>;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 24
          locals = [ class java/util/EnumSet ]
        frame_type = 14 /* same */

  public void onSkillSelfHit(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=3
         0: ldc           #13                 // class ext/mods/gameserver/enums/skills/TriggerType
         2: invokestatic  #15                 // Method java/util/EnumSet.noneOf:(Ljava/lang/Class;)Ljava/util/EnumSet;
         5: astore_3
         6: aload_2
         7: invokevirtual #42                 // Method ext/mods/gameserver/skills/L2Skill.isDamage:()Z
        10: ifeq          21
        13: aload_3
        14: getstatic     #36                 // Field ext/mods/gameserver/enums/skills/TriggerType.ON_ATTACKED:Lext/mods/gameserver/enums/skills/TriggerType;
        17: invokevirtual #25                 // Method java/util/EnumSet.add:(Ljava/lang/Object;)Z
        20: pop
        21: aload_0
        22: aload_3
        23: aload_1
        24: invokevirtual #32                 // Method onChanceSkillEvent:(Ljava/util/Set;Lext/mods/gameserver/model/actor/Creature;)V
        27: return
      LineNumberTable:
        line 93: 0
        line 94: 6
        line 95: 13
        line 97: 21
        line 98: 27
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lext/mods/gameserver/model/actor/container/creature/ChanceSkillList;
            0      28     1 target   Lext/mods/gameserver/model/actor/Creature;
            0      28     2 skill   Lext/mods/gameserver/skills/L2Skill;
            6      22     3 triggers   Ljava/util/EnumSet;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            6      22     3 triggers   Ljava/util/EnumSet<Lext/mods/gameserver/enums/skills/TriggerType;>;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 21
          locals = [ class java/util/EnumSet ]

  public void onChanceSkillEvent(java.util.Set<ext.mods.gameserver.enums.skills.TriggerType>, ext.mods.gameserver.model.actor.Creature);
    descriptor: (Ljava/util/Set;Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=9, args_size=3
         0: aload_0
         1: getfield      #7                  // Field _owner:Lext/mods/gameserver/model/actor/Creature;
         4: invokevirtual #57                 // Method ext/mods/gameserver/model/actor/Creature.isDead:()Z
         7: ifeq          11
        10: return
        11: aload_0
        12: invokevirtual #62                 // Method entrySet:()Ljava/util/Set;
        15: invokeinterface #66,  1           // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
        20: astore_3
        21: aload_3
        22: invokeinterface #72,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        27: ifeq          129
        30: aload_3
        31: invokeinterface #77,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        36: checkcast     #81                 // class java/util/Map$Entry
        39: astore        4
        41: aload         4
        43: invokeinterface #83,  1           // InterfaceMethod java/util/Map$Entry.getValue:()Ljava/lang/Object;
        48: checkcast     #86                 // class ext/mods/gameserver/skills/ChanceCondition
        51: astore        5
        53: aload         5
        55: ifnull        126
        58: aload         5
        60: aload_1
        61: invokevirtual #88                 // Method ext/mods/gameserver/skills/ChanceCondition.trigger:(Ljava/util/Set;)Z
        64: ifeq          126
        67: aload         4
        69: invokeinterface #92,  1           // InterfaceMethod java/util/Map$Entry.getKey:()Ljava/lang/Object;
        74: checkcast     #95                 // class ext/mods/gameserver/skills/IChanceSkillTrigger
        77: astore        6
        79: aload         6
        81: instanceof    #43                 // class ext/mods/gameserver/skills/L2Skill
        84: ifeq          104
        87: aload         6
        89: checkcast     #43                 // class ext/mods/gameserver/skills/L2Skill
        92: astore        7
        94: aload_0
        95: aload         7
        97: aload_2
        98: invokevirtual #97                 // Method makeCast:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;)V
       101: goto          126
       104: aload         6
       106: instanceof    #101                // class ext/mods/gameserver/skills/effects/EffectChanceSkillTrigger
       109: ifeq          126
       112: aload         6
       114: checkcast     #101                // class ext/mods/gameserver/skills/effects/EffectChanceSkillTrigger
       117: astore        8
       119: aload_0
       120: aload         8
       122: aload_2
       123: invokevirtual #103                // Method makeCast:(Lext/mods/gameserver/skills/effects/EffectChanceSkillTrigger;Lext/mods/gameserver/model/actor/Creature;)V
       126: goto          21
       129: return
      LineNumberTable:
        line 102: 0
        line 103: 10
        line 105: 11
        line 107: 41
        line 108: 53
        line 110: 67
        line 111: 79
        line 112: 94
        line 113: 104
        line 114: 119
        line 116: 126
        line 117: 129
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           94      10     7 skill   Lext/mods/gameserver/skills/L2Skill;
          119       7     8  ecst   Lext/mods/gameserver/skills/effects/EffectChanceSkillTrigger;
           79      47     6 trigger   Lext/mods/gameserver/skills/IChanceSkillTrigger;
           53      73     5  cond   Lext/mods/gameserver/skills/ChanceCondition;
           41      85     4 entry   Ljava/util/Map$Entry;
            0     130     0  this   Lext/mods/gameserver/model/actor/container/creature/ChanceSkillList;
            0     130     1 triggers   Ljava/util/Set;
            0     130     2 target   Lext/mods/gameserver/model/actor/Creature;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           41      85     4 entry   Ljava/util/Map$Entry<Lext/mods/gameserver/skills/IChanceSkillTrigger;Lext/mods/gameserver/skills/ChanceCondition;>;
            0     130     1 triggers   Ljava/util/Set<Lext/mods/gameserver/enums/skills/TriggerType;>;
      StackMapTable: number_of_entries = 5
        frame_type = 11 /* same */
        frame_type = 252 /* append */
          offset_delta = 9
          locals = [ class java/util/Iterator ]
        frame_type = 254 /* append */
          offset_delta = 82
          locals = [ class java/util/Map$Entry, class ext/mods/gameserver/skills/ChanceCondition, class ext/mods/gameserver/skills/IChanceSkillTrigger ]
        frame_type = 248 /* chop */
          offset_delta = 21
        frame_type = 250 /* chop */
          offset_delta = 2
    Signature: #254                         // (Ljava/util/Set<Lext/mods/gameserver/enums/skills/TriggerType;>;Lext/mods/gameserver/model/actor/Creature;)V
}
Signature: #264                         // Ljava/util/concurrent/ConcurrentHashMap<Lext/mods/gameserver/skills/IChanceSkillTrigger;Lext/mods/gameserver/skills/ChanceCondition;>;
SourceFile: "ChanceSkillList.java"
InnerClasses:
  public static #270= #81 of #268;        // Entry=class java/util/Map$Entry of class java/util/Map
