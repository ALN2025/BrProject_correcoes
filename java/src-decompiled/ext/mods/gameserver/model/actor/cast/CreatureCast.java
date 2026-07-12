// Bytecode for: ext.mods.gameserver.model.actor.cast.CreatureCast
// File: ext\mods\gameserver\model\actor\cast\CreatureCast.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/cast/CreatureCast.class
  Last modified 9 de jul de 2026; size 14636 bytes
  MD5 checksum 3d308837f1e66661aff49657e6d62ded
  Compiled from "CreatureCast.java"
public class ext.mods.gameserver.model.actor.cast.CreatureCast<T extends ext.mods.gameserver.model.actor.Creature> extends java.lang.Object
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/actor/cast/CreatureCast
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 10, methods: 21, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/actor/cast/CreatureCast._actor:Lext/mods/gameserver/model/actor/Creature;
    #8 = Class              #10           // ext/mods/gameserver/model/actor/cast/CreatureCast
    #9 = NameAndType        #11:#12       // _actor:Lext/mods/gameserver/model/actor/Creature;
   #10 = Utf8               ext/mods/gameserver/model/actor/cast/CreatureCast
   #11 = Utf8               _actor
   #12 = Utf8               Lext/mods/gameserver/model/actor/Creature;
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/model/actor/cast/CreatureCast._castInterruptTime:J
   #14 = NameAndType        #15:#16       // _castInterruptTime:J
   #15 = Utf8               _castInterruptTime
   #16 = Utf8               J
   #17 = Methodref          #18.#19       // java/lang/System.currentTimeMillis:()J
   #18 = Class              #20           // java/lang/System
   #19 = NameAndType        #21:#22       // currentTimeMillis:()J
   #20 = Utf8               java/lang/System
   #21 = Utf8               currentTimeMillis
   #22 = Utf8               ()J
   #23 = Fieldref           #8.#24        // ext/mods/gameserver/model/actor/cast/CreatureCast._isCastingNow:Z
   #24 = NameAndType        #25:#26       // _isCastingNow:Z
   #25 = Utf8               _isCastingNow
   #26 = Utf8               Z
   #27 = Fieldref           #8.#28        // ext/mods/gameserver/model/actor/cast/CreatureCast._skill:Lext/mods/gameserver/skills/L2Skill;
   #28 = NameAndType        #29:#30       // _skill:Lext/mods/gameserver/skills/L2Skill;
   #29 = Utf8               _skill
   #30 = Utf8               Lext/mods/gameserver/skills/L2Skill;
   #31 = Methodref          #8.#32        // ext/mods/gameserver/model/actor/cast/CreatureCast.canAbortCast:()Z
   #32 = NameAndType        #33:#34       // canAbortCast:()Z
   #33 = Utf8               canAbortCast
   #34 = Utf8               ()Z
   #35 = Methodref          #8.#36        // ext/mods/gameserver/model/actor/cast/CreatureCast.stop:()V
   #36 = NameAndType        #37:#6        // stop:()V
   #37 = Utf8               stop
   #38 = Fieldref           #39.#40       // ext/mods/gameserver/network/SystemMessageId.CASTING_INTERRUPTED:Lext/mods/gameserver/network/SystemMessageId;
   #39 = Class              #41           // ext/mods/gameserver/network/SystemMessageId
   #40 = NameAndType        #42:#43       // CASTING_INTERRUPTED:Lext/mods/gameserver/network/SystemMessageId;
   #41 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #42 = Utf8               CASTING_INTERRUPTED
   #43 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #44 = Methodref          #45.#46       // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #45 = Class              #47           // ext/mods/gameserver/network/serverpackets/SystemMessage
   #46 = NameAndType        #48:#49       // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #47 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
   #48 = Utf8               getSystemMessage
   #49 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #50 = Methodref          #51.#52       // ext/mods/gameserver/model/actor/Creature.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #51 = Class              #53           // ext/mods/gameserver/model/actor/Creature
   #52 = NameAndType        #54:#55       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #53 = Utf8               ext/mods/gameserver/model/actor/Creature
   #54 = Utf8               sendPacket
   #55 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #56 = Class              #57           // ext/mods/gameserver/network/serverpackets/MagicSkillUse
   #57 = Utf8               ext/mods/gameserver/network/serverpackets/MagicSkillUse
   #58 = Fieldref           #8.#59        // ext/mods/gameserver/model/actor/cast/CreatureCast._target:Lext/mods/gameserver/model/actor/Creature;
   #59 = NameAndType        #60:#12       // _target:Lext/mods/gameserver/model/actor/Creature;
   #60 = Utf8               _target
   #61 = Methodref          #62.#63       // ext/mods/gameserver/skills/L2Skill.getId:()I
   #62 = Class              #64           // ext/mods/gameserver/skills/L2Skill
   #63 = NameAndType        #65:#66       // getId:()I
   #64 = Utf8               ext/mods/gameserver/skills/L2Skill
   #65 = Utf8               getId
   #66 = Utf8               ()I
   #67 = Methodref          #62.#68       // ext/mods/gameserver/skills/L2Skill.getLevel:()I
   #68 = NameAndType        #69:#66       // getLevel:()I
   #69 = Utf8               getLevel
   #70 = Fieldref           #8.#71        // ext/mods/gameserver/model/actor/cast/CreatureCast._hitTime:I
   #71 = NameAndType        #72:#73       // _hitTime:I
   #72 = Utf8               _hitTime
   #73 = Utf8               I
   #74 = Methodref          #62.#75       // ext/mods/gameserver/skills/L2Skill.getReuseDelay:()I
   #75 = NameAndType        #76:#66       // getReuseDelay:()I
   #76 = Utf8               getReuseDelay
   #77 = Methodref          #56.#78       // ext/mods/gameserver/network/serverpackets/MagicSkillUse."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIIIZ)V
   #78 = NameAndType        #5:#79        // "<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIIIZ)V
   #79 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIIIZ)V
   #80 = Methodref          #81.#52       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #81 = Class              #82           // ext/mods/gameserver/model/actor/Player
   #82 = Utf8               ext/mods/gameserver/model/actor/Player
   #83 = Methodref          #62.#84       // ext/mods/gameserver/skills/L2Skill.getHitTime:()I
   #84 = NameAndType        #85:#66       // getHitTime:()I
   #85 = Utf8               getHitTime
   #86 = Methodref          #62.#87       // ext/mods/gameserver/skills/L2Skill.getCoolTime:()I
   #87 = NameAndType        #88:#66       // getCoolTime:()I
   #88 = Utf8               getCoolTime
   #89 = Methodref          #62.#90       // ext/mods/gameserver/skills/L2Skill.isStaticHitTime:()Z
   #90 = NameAndType        #91:#34       // isStaticHitTime:()Z
   #91 = Utf8               isStaticHitTime
   #92 = Methodref          #93.#94       // ext/mods/gameserver/skills/Formulas.calcAtkSpd:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;D)I
   #93 = Class              #95           // ext/mods/gameserver/skills/Formulas
   #94 = NameAndType        #96:#97       // calcAtkSpd:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;D)I
   #95 = Utf8               ext/mods/gameserver/skills/Formulas
   #96 = Utf8               calcAtkSpd
   #97 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;D)I
   #98 = Methodref          #62.#99       // ext/mods/gameserver/skills/L2Skill.isMagic:()Z
   #99 = NameAndType        #100:#34      // isMagic:()Z
  #100 = Utf8               isMagic
  #101 = Fieldref           #102.#103     // ext/mods/gameserver/enums/items/ShotType.SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
  #102 = Class              #104          // ext/mods/gameserver/enums/items/ShotType
  #103 = NameAndType        #105:#106     // SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
  #104 = Utf8               ext/mods/gameserver/enums/items/ShotType
  #105 = Utf8               SPIRITSHOT
  #106 = Utf8               Lext/mods/gameserver/enums/items/ShotType;
  #107 = Methodref          #51.#108      // ext/mods/gameserver/model/actor/Creature.isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
  #108 = NameAndType        #109:#110     // isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
  #109 = Utf8               isChargedShot
  #110 = Utf8               (Lext/mods/gameserver/enums/items/ShotType;)Z
  #111 = Fieldref           #102.#112     // ext/mods/gameserver/enums/items/ShotType.BLESSED_SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
  #112 = NameAndType        #113:#106     // BLESSED_SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
  #113 = Utf8               BLESSED_SPIRITSHOT
  #114 = Double             0.7d
  #116 = Fieldref           #117.#118     // ext/mods/Config.HIT_TIME:Z
  #117 = Class              #119          // ext/mods/Config
  #118 = NameAndType        #120:#26      // HIT_TIME:Z
  #119 = Utf8               ext/mods/Config
  #120 = Utf8               HIT_TIME
  #121 = Methodref          #62.#122      // ext/mods/gameserver/skills/L2Skill.isStaticReuse:()Z
  #122 = NameAndType        #123:#34      // isStaticReuse:()Z
  #123 = Utf8               isStaticReuse
  #124 = Methodref          #51.#125      // ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
  #125 = NameAndType        #126:#127     // getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
  #126 = Utf8               getStatus
  #127 = Utf8               ()Lext/mods/gameserver/model/actor/status/CreatureStatus;
  #128 = Fieldref           #129.#130     // ext/mods/gameserver/enums/skills/Stats.MAGIC_REUSE_RATE:Lext/mods/gameserver/enums/skills/Stats;
  #129 = Class              #131          // ext/mods/gameserver/enums/skills/Stats
  #130 = NameAndType        #132:#133     // MAGIC_REUSE_RATE:Lext/mods/gameserver/enums/skills/Stats;
  #131 = Utf8               ext/mods/gameserver/enums/skills/Stats
  #132 = Utf8               MAGIC_REUSE_RATE
  #133 = Utf8               Lext/mods/gameserver/enums/skills/Stats;
  #134 = Fieldref           #129.#135     // ext/mods/gameserver/enums/skills/Stats.P_REUSE:Lext/mods/gameserver/enums/skills/Stats;
  #135 = NameAndType        #136:#133     // P_REUSE:Lext/mods/gameserver/enums/skills/Stats;
  #136 = Utf8               P_REUSE
  #137 = Methodref          #138.#139     // ext/mods/gameserver/model/actor/status/CreatureStatus.calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
  #138 = Class              #140          // ext/mods/gameserver/model/actor/status/CreatureStatus
  #139 = NameAndType        #141:#142     // calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
  #140 = Utf8               ext/mods/gameserver/model/actor/status/CreatureStatus
  #141 = Utf8               calcStat
  #142 = Utf8               (Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
  #143 = Double             333.0d
  #145 = Methodref          #138.#146     // ext/mods/gameserver/model/actor/status/CreatureStatus.getMAtkSpd:()I
  #146 = NameAndType        #147:#66      // getMAtkSpd:()I
  #147 = Utf8               getMAtkSpd
  #148 = Methodref          #138.#149     // ext/mods/gameserver/model/actor/status/CreatureStatus.getPAtkSpd:()I
  #149 = NameAndType        #150:#66      // getPAtkSpd:()I
  #150 = Utf8               getPAtkSpd
  #151 = Class              #152          // ext/mods/gameserver/model/actor/Npc
  #152 = Utf8               ext/mods/gameserver/model/actor/Npc
  #153 = Methodref          #154.#155     // java/lang/Math.max:(II)I
  #154 = Class              #156          // java/lang/Math
  #155 = NameAndType        #157:#158     // max:(II)I
  #156 = Utf8               java/lang/Math
  #157 = Utf8               max
  #158 = Utf8               (II)I
  #159 = Methodref          #93.#160      // ext/mods/gameserver/skills/Formulas.calcSkillMastery:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
  #160 = NameAndType        #161:#162     // calcSkillMastery:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
  #161 = Utf8               calcSkillMastery
  #162 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
  #163 = Methodref          #51.#164      // ext/mods/gameserver/model/actor/Creature.addTimeStamp:(Lext/mods/gameserver/skills/L2Skill;J)V
  #164 = NameAndType        #165:#166     // addTimeStamp:(Lext/mods/gameserver/skills/L2Skill;J)V
  #165 = Utf8               addTimeStamp
  #166 = Utf8               (Lext/mods/gameserver/skills/L2Skill;J)V
  #167 = Methodref          #51.#168      // ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
  #168 = NameAndType        #169:#170     // getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
  #169 = Utf8               getActingPlayer
  #170 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #171 = Fieldref           #39.#172      // ext/mods/gameserver/network/SystemMessageId.SKILL_READY_TO_USE_AGAIN:Lext/mods/gameserver/network/SystemMessageId;
  #172 = NameAndType        #173:#43      // SKILL_READY_TO_USE_AGAIN:Lext/mods/gameserver/network/SystemMessageId;
  #173 = Utf8               SKILL_READY_TO_USE_AGAIN
  #174 = Methodref          #81.#175      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #175 = NameAndType        #54:#176      // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #176 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #177 = Methodref          #51.#178      // ext/mods/gameserver/model/actor/Creature.disableSkill:(Lext/mods/gameserver/skills/L2Skill;J)V
  #178 = NameAndType        #179:#166     // disableSkill:(Lext/mods/gameserver/skills/L2Skill;J)V
  #179 = Utf8               disableSkill
  #180 = Methodref          #138.#181     // ext/mods/gameserver/model/actor/status/CreatureStatus.getMpInitialConsume:(Lext/mods/gameserver/skills/L2Skill;)I
  #181 = NameAndType        #182:#183     // getMpInitialConsume:(Lext/mods/gameserver/skills/L2Skill;)I
  #182 = Utf8               getMpInitialConsume
  #183 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)I
  #184 = Methodref          #138.#185     // ext/mods/gameserver/model/actor/status/CreatureStatus.reduceMp:(D)D
  #185 = NameAndType        #186:#187     // reduceMp:(D)D
  #186 = Utf8               reduceMp
  #187 = Utf8               (D)D
  #188 = Methodref          #51.#189      // ext/mods/gameserver/model/actor/Creature.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #189 = NameAndType        #190:#55      // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #190 = Utf8               broadcastPacket
  #191 = Fieldref           #39.#192      // ext/mods/gameserver/network/SystemMessageId.USE_S1:Lext/mods/gameserver/network/SystemMessageId;
  #192 = NameAndType        #193:#43      // USE_S1:Lext/mods/gameserver/network/SystemMessageId;
  #193 = Utf8               USE_S1
  #194 = Methodref          #45.#195      // ext/mods/gameserver/network/serverpackets/SystemMessage.addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #195 = NameAndType        #196:#197     // addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #196 = Utf8               addSkillName
  #197 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #198 = Long               200l
  #200 = Methodref          #8.#201       // ext/mods/gameserver/model/actor/cast/CreatureCast.setCastTask:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/instance/ItemInstance;IIJ)V
  #201 = NameAndType        #202:#203     // setCastTask:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/instance/ItemInstance;IIJ)V
  #202 = Utf8               setCastTask
  #203 = Utf8               (Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/instance/ItemInstance;IIJ)V
  #204 = Class              #205          // ext/mods/gameserver/network/serverpackets/SetupGauge
  #205 = Utf8               ext/mods/gameserver/network/serverpackets/SetupGauge
  #206 = Fieldref           #207.#208     // ext/mods/gameserver/enums/GaugeColor.BLUE:Lext/mods/gameserver/enums/GaugeColor;
  #207 = Class              #209          // ext/mods/gameserver/enums/GaugeColor
  #208 = NameAndType        #210:#211     // BLUE:Lext/mods/gameserver/enums/GaugeColor;
  #209 = Utf8               ext/mods/gameserver/enums/GaugeColor
  #210 = Utf8               BLUE
  #211 = Utf8               Lext/mods/gameserver/enums/GaugeColor;
  #212 = Methodref          #204.#213     // ext/mods/gameserver/network/serverpackets/SetupGauge."<init>":(Lext/mods/gameserver/enums/GaugeColor;I)V
  #213 = NameAndType        #5:#214       // "<init>":(Lext/mods/gameserver/enums/GaugeColor;I)V
  #214 = Utf8               (Lext/mods/gameserver/enums/GaugeColor;I)V
  #215 = InvokeDynamic      #0:#216       // #0:run:(Lext/mods/gameserver/model/actor/cast/CreatureCast;)Ljava/lang/Runnable;
  #216 = NameAndType        #217:#218     // run:(Lext/mods/gameserver/model/actor/cast/CreatureCast;)Ljava/lang/Runnable;
  #217 = Utf8               run
  #218 = Utf8               (Lext/mods/gameserver/model/actor/cast/CreatureCast;)Ljava/lang/Runnable;
  #219 = Methodref          #220.#221     // ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #220 = Class              #222          // ext/mods/commons/pool/ThreadPool
  #221 = NameAndType        #223:#224     // schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #222 = Utf8               ext/mods/commons/pool/ThreadPool
  #223 = Utf8               schedule
  #224 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #225 = Fieldref           #8.#226       // ext/mods/gameserver/model/actor/cast/CreatureCast._castTask:Ljava/util/concurrent/ScheduledFuture;
  #226 = NameAndType        #227:#228     // _castTask:Ljava/util/concurrent/ScheduledFuture;
  #227 = Utf8               _castTask
  #228 = Utf8               Ljava/util/concurrent/ScheduledFuture;
  #229 = Methodref          #8.#230       // ext/mods/gameserver/model/actor/cast/CreatureCast.isCastingNow:()Z
  #230 = NameAndType        #231:#34      // isCastingNow:()Z
  #231 = Utf8               isCastingNow
  #232 = Methodref          #62.#233      // ext/mods/gameserver/skills/L2Skill.getEffectRange:()I
  #233 = NameAndType        #234:#66      // getEffectRange:()I
  #234 = Utf8               getEffectRange
  #235 = Methodref          #62.#236      // ext/mods/gameserver/skills/L2Skill.getCastRange:()I
  #236 = NameAndType        #237:#66      // getCastRange:()I
  #237 = Utf8               getCastRange
  #238 = Methodref          #62.#239      // ext/mods/gameserver/skills/L2Skill.getSkillRadius:()I
  #239 = NameAndType        #240:#66      // getSkillRadius:()I
  #240 = Utf8               getSkillRadius
  #241 = Methodref          #51.#242      // ext/mods/gameserver/model/actor/Creature.getAI:()Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
  #242 = NameAndType        #243:#244     // getAI:()Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
  #243 = Utf8               getAI
  #244 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
  #245 = Methodref          #246.#247     // ext/mods/gameserver/model/actor/ai/type/CreatureAI.isTargetLost:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/skills/L2Skill;)Z
  #246 = Class              #248          // ext/mods/gameserver/model/actor/ai/type/CreatureAI
  #247 = NameAndType        #249:#250     // isTargetLost:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/skills/L2Skill;)Z
  #248 = Utf8               ext/mods/gameserver/model/actor/ai/type/CreatureAI
  #249 = Utf8               isTargetLost
  #250 = Utf8               (Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/skills/L2Skill;)Z
  #251 = Methodref          #51.#252      // ext/mods/gameserver/model/actor/Creature.isInStrictRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
  #252 = NameAndType        #253:#254     // isInStrictRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
  #253 = Utf8               isInStrictRadius
  #254 = Utf8               (Lext/mods/gameserver/model/WorldObject;I)Z
  #255 = Fieldref           #39.#256      // ext/mods/gameserver/network/SystemMessageId.DIST_TOO_FAR_CASTING_STOPPED:Lext/mods/gameserver/network/SystemMessageId;
  #256 = NameAndType        #257:#43      // DIST_TOO_FAR_CASTING_STOPPED:Lext/mods/gameserver/network/SystemMessageId;
  #257 = Utf8               DIST_TOO_FAR_CASTING_STOPPED
  #258 = Methodref          #62.#259      // ext/mods/gameserver/skills/L2Skill.isOffensive:()Z
  #259 = NameAndType        #260:#34      // isOffensive:()Z
  #260 = Utf8               isOffensive
  #261 = Methodref          #51.#262      // ext/mods/gameserver/model/actor/Creature.distance2D:(Lext/mods/gameserver/model/WorldObject;)D
  #262 = NameAndType        #263:#264     // distance2D:(Lext/mods/gameserver/model/WorldObject;)D
  #263 = Utf8               distance2D
  #264 = Utf8               (Lext/mods/gameserver/model/WorldObject;)D
  #265 = Double             400.0d
  #267 = Methodref          #268.#269     // ext/mods/gameserver/model/actor/move/MovementIntegration.canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
  #268 = Class              #270          // ext/mods/gameserver/model/actor/move/MovementIntegration
  #269 = NameAndType        #271:#272     // canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
  #270 = Utf8               ext/mods/gameserver/model/actor/move/MovementIntegration
  #271 = Utf8               canSeeTarget
  #272 = Utf8               (Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
  #273 = Fieldref           #39.#274      // ext/mods/gameserver/network/SystemMessageId.CANT_SEE_TARGET:Lext/mods/gameserver/network/SystemMessageId;
  #274 = NameAndType        #275:#43      // CANT_SEE_TARGET:Lext/mods/gameserver/network/SystemMessageId;
  #275 = Utf8               CANT_SEE_TARGET
  #276 = Methodref          #62.#277      // ext/mods/gameserver/skills/L2Skill.getTargetList:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)[Lext/mods/gameserver/model/actor/Creature;
  #277 = NameAndType        #278:#279     // getTargetList:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)[Lext/mods/gameserver/model/actor/Creature;
  #278 = Utf8               getTargetList
  #279 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)[Lext/mods/gameserver/model/actor/Creature;
  #280 = Fieldref           #8.#281       // ext/mods/gameserver/model/actor/cast/CreatureCast._targets:[Lext/mods/gameserver/model/actor/Creature;
  #281 = NameAndType        #282:#283     // _targets:[Lext/mods/gameserver/model/actor/Creature;
  #282 = Utf8               _targets
  #283 = Utf8               [Lext/mods/gameserver/model/actor/Creature;
  #284 = Class              #285          // ext/mods/gameserver/network/serverpackets/MagicSkillLaunched
  #285 = Utf8               ext/mods/gameserver/network/serverpackets/MagicSkillLaunched
  #286 = Methodref          #284.#287     // ext/mods/gameserver/network/serverpackets/MagicSkillLaunched."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/actor/Creature;)V
  #287 = NameAndType        #5:#288       // "<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/actor/Creature;)V
  #288 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/actor/Creature;)V
  #289 = InvokeDynamic      #1:#216       // #1:run:(Lext/mods/gameserver/model/actor/cast/CreatureCast;)Ljava/lang/Runnable;
  #290 = Long               400l
  #292 = Methodref          #138.#293     // ext/mods/gameserver/model/actor/status/CreatureStatus.getMpConsume:(Lext/mods/gameserver/skills/L2Skill;)I
  #293 = NameAndType        #294:#183     // getMpConsume:(Lext/mods/gameserver/skills/L2Skill;)I
  #294 = Utf8               getMpConsume
  #295 = Methodref          #138.#296     // ext/mods/gameserver/model/actor/status/CreatureStatus.getMp:()D
  #296 = NameAndType        #297:#298     // getMp:()D
  #297 = Utf8               getMp
  #298 = Utf8               ()D
  #299 = Fieldref           #39.#300      // ext/mods/gameserver/network/SystemMessageId.NOT_ENOUGH_MP:Lext/mods/gameserver/network/SystemMessageId;
  #300 = NameAndType        #301:#43      // NOT_ENOUGH_MP:Lext/mods/gameserver/network/SystemMessageId;
  #301 = Utf8               NOT_ENOUGH_MP
  #302 = Methodref          #62.#303      // ext/mods/gameserver/skills/L2Skill.getHpConsume:()I
  #303 = NameAndType        #304:#66      // getHpConsume:()I
  #304 = Utf8               getHpConsume
  #305 = Methodref          #138.#306     // ext/mods/gameserver/model/actor/status/CreatureStatus.getHp:()D
  #306 = NameAndType        #307:#298     // getHp:()D
  #307 = Utf8               getHp
  #308 = Fieldref           #39.#309      // ext/mods/gameserver/network/SystemMessageId.NOT_ENOUGH_HP:Lext/mods/gameserver/network/SystemMessageId;
  #309 = NameAndType        #310:#43      // NOT_ENOUGH_HP:Lext/mods/gameserver/network/SystemMessageId;
  #310 = Utf8               NOT_ENOUGH_HP
  #311 = Methodref          #138.#312     // ext/mods/gameserver/model/actor/status/CreatureStatus.reduceHp:(DLext/mods/gameserver/model/actor/Creature;Z)V
  #312 = NameAndType        #313:#314     // reduceHp:(DLext/mods/gameserver/model/actor/Creature;Z)V
  #313 = Utf8               reduceHp
  #314 = Utf8               (DLext/mods/gameserver/model/actor/Creature;Z)V
  #315 = Fieldref           #8.#316       // ext/mods/gameserver/model/actor/cast/CreatureCast._item:Lext/mods/gameserver/model/item/instance/ItemInstance;
  #316 = NameAndType        #317:#318     // _item:Lext/mods/gameserver/model/item/instance/ItemInstance;
  #317 = Utf8               _item
  #318 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #319 = Methodref          #8.#320       // ext/mods/gameserver/model/actor/cast/CreatureCast.callSkill:(Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #320 = NameAndType        #321:#322     // callSkill:(Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #321 = Utf8               callSkill
  #322 = Utf8               (Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #323 = InvokeDynamic      #2:#216       // #2:run:(Lext/mods/gameserver/model/actor/cast/CreatureCast;)Ljava/lang/Runnable;
  #324 = Fieldref           #8.#325       // ext/mods/gameserver/model/actor/cast/CreatureCast._coolTime:I
  #325 = NameAndType        #326:#73      // _coolTime:I
  #326 = Utf8               _coolTime
  #327 = Class              #328          // ext/mods/gameserver/model/actor/Playable
  #328 = Utf8               ext/mods/gameserver/model/actor/Playable
  #329 = Methodref          #62.#330      // ext/mods/gameserver/skills/L2Skill.useSoulShot:()Z
  #330 = NameAndType        #331:#34      // useSoulShot:()Z
  #331 = Utf8               useSoulShot
  #332 = Methodref          #62.#333      // ext/mods/gameserver/skills/L2Skill.useSpiritShot:()Z
  #333 = NameAndType        #334:#34      // useSpiritShot:()Z
  #334 = Utf8               useSpiritShot
  #335 = Methodref          #51.#336      // ext/mods/gameserver/model/actor/Creature.rechargeShots:(ZZ)V
  #336 = NameAndType        #337:#338     // rechargeShots:(ZZ)V
  #337 = Utf8               rechargeShots
  #338 = Utf8               (ZZ)V
  #339 = Methodref          #246.#340     // ext/mods/gameserver/model/actor/ai/type/CreatureAI.startAttackStance:()V
  #340 = NameAndType        #341:#6       // startAttackStance:()V
  #341 = Utf8               startAttackStance
  #342 = Methodref          #8.#343       // ext/mods/gameserver/model/actor/cast/CreatureCast.notifyCastFinishToAI:(Z)V
  #343 = NameAndType        #344:#345     // notifyCastFinishToAI:(Z)V
  #344 = Utf8               notifyCastFinishToAI
  #345 = Utf8               (Z)V
  #346 = Class              #347          // ext/mods/gameserver/network/serverpackets/MagicSkillCanceled
  #347 = Utf8               ext/mods/gameserver/network/serverpackets/MagicSkillCanceled
  #348 = Methodref          #51.#349      // ext/mods/gameserver/model/actor/Creature.getObjectId:()I
  #349 = NameAndType        #350:#66      // getObjectId:()I
  #350 = Utf8               getObjectId
  #351 = Methodref          #346.#352     // ext/mods/gameserver/network/serverpackets/MagicSkillCanceled."<init>":(I)V
  #352 = NameAndType        #5:#353       // "<init>":(I)V
  #353 = Utf8               (I)V
  #354 = InterfaceMethodref #355.#356     // java/util/concurrent/ScheduledFuture.cancel:(Z)Z
  #355 = Class              #357          // java/util/concurrent/ScheduledFuture
  #356 = NameAndType        #358:#359     // cancel:(Z)Z
  #357 = Utf8               java/util/concurrent/ScheduledFuture
  #358 = Utf8               cancel
  #359 = Utf8               (Z)Z
  #360 = Fieldref           #361.#362     // ext/mods/gameserver/enums/AiEventType.FINISHED_CASTING:Lext/mods/gameserver/enums/AiEventType;
  #361 = Class              #363          // ext/mods/gameserver/enums/AiEventType
  #362 = NameAndType        #364:#365     // FINISHED_CASTING:Lext/mods/gameserver/enums/AiEventType;
  #363 = Utf8               ext/mods/gameserver/enums/AiEventType
  #364 = Utf8               FINISHED_CASTING
  #365 = Utf8               Lext/mods/gameserver/enums/AiEventType;
  #366 = Methodref          #246.#367     // ext/mods/gameserver/model/actor/ai/type/CreatureAI.notifyEvent:(Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
  #367 = NameAndType        #368:#369     // notifyEvent:(Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
  #368 = Utf8               notifyEvent
  #369 = Utf8               (Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
  #370 = Methodref          #51.#371      // ext/mods/gameserver/model/actor/Creature.getActiveWeaponItem:()Lext/mods/gameserver/model/item/kind/Weapon;
  #371 = NameAndType        #372:#373     // getActiveWeaponItem:()Lext/mods/gameserver/model/item/kind/Weapon;
  #372 = Utf8               getActiveWeaponItem
  #373 = Utf8               ()Lext/mods/gameserver/model/item/kind/Weapon;
  #374 = Methodref          #51.#375      // ext/mods/gameserver/model/actor/Creature.isDead:()Z
  #375 = NameAndType        #376:#34      // isDead:()Z
  #376 = Utf8               isDead
  #377 = Methodref          #378.#379     // ext/mods/gameserver/model/item/kind/Weapon.castSkillOnMagic:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #378 = Class              #380          // ext/mods/gameserver/model/item/kind/Weapon
  #379 = NameAndType        #381:#382     // castSkillOnMagic:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #380 = Utf8               ext/mods/gameserver/model/item/kind/Weapon
  #381 = Utf8               castSkillOnMagic
  #382 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #383 = Fieldref           #361.#384     // ext/mods/gameserver/enums/AiEventType.ATTACKED:Lext/mods/gameserver/enums/AiEventType;
  #384 = NameAndType        #385:#365     // ATTACKED:Lext/mods/gameserver/enums/AiEventType;
  #385 = Utf8               ATTACKED
  #386 = Methodref          #387.#388     // ext/mods/gameserver/handler/SkillHandler.getInstance:()Lext/mods/gameserver/handler/SkillHandler;
  #387 = Class              #389          // ext/mods/gameserver/handler/SkillHandler
  #388 = NameAndType        #390:#391     // getInstance:()Lext/mods/gameserver/handler/SkillHandler;
  #389 = Utf8               ext/mods/gameserver/handler/SkillHandler
  #390 = Utf8               getInstance
  #391 = Utf8               ()Lext/mods/gameserver/handler/SkillHandler;
  #392 = Methodref          #62.#393      // ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
  #393 = NameAndType        #394:#395     // getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
  #394 = Utf8               getSkillType
  #395 = Utf8               ()Lext/mods/gameserver/enums/skills/SkillType;
  #396 = Methodref          #387.#397     // ext/mods/gameserver/handler/SkillHandler.getHandler:(Ljava/lang/Object;)Lext/mods/gameserver/handler/ISkillHandler;
  #397 = NameAndType        #398:#399     // getHandler:(Ljava/lang/Object;)Lext/mods/gameserver/handler/ISkillHandler;
  #398 = Utf8               getHandler
  #399 = Utf8               (Ljava/lang/Object;)Lext/mods/gameserver/handler/ISkillHandler;
  #400 = InterfaceMethodref #401.#402     // ext/mods/gameserver/handler/ISkillHandler.useSkill:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #401 = Class              #403          // ext/mods/gameserver/handler/ISkillHandler
  #402 = NameAndType        #404:#405     // useSkill:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #403 = Utf8               ext/mods/gameserver/handler/ISkillHandler
  #404 = Utf8               useSkill
  #405 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #406 = Methodref          #62.#407      // ext/mods/gameserver/skills/L2Skill.useSkill:(Lext/mods/gameserver/model/actor/Creature;[Lext/mods/gameserver/model/WorldObject;)V
  #407 = NameAndType        #404:#408     // useSkill:(Lext/mods/gameserver/model/actor/Creature;[Lext/mods/gameserver/model/WorldObject;)V
  #408 = Utf8               (Lext/mods/gameserver/model/actor/Creature;[Lext/mods/gameserver/model/WorldObject;)V
  #409 = Methodref          #51.#410      // ext/mods/gameserver/model/actor/Creature.isSkillDisabled:(Lext/mods/gameserver/skills/L2Skill;)Z
  #410 = NameAndType        #411:#412     // isSkillDisabled:(Lext/mods/gameserver/skills/L2Skill;)Z
  #411 = Utf8               isSkillDisabled
  #412 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)Z
  #413 = Methodref          #8.#414       // ext/mods/gameserver/model/actor/cast/CreatureCast.meetsHpMpConditions:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
  #414 = NameAndType        #415:#162     // meetsHpMpConditions:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
  #415 = Utf8               meetsHpMpConditions
  #416 = Methodref          #62.#417      // ext/mods/gameserver/skills/L2Skill.isMagic2:()Z
  #417 = NameAndType        #418:#34      // isMagic2:()Z
  #418 = Utf8               isMagic2
  #419 = Methodref          #51.#420      // ext/mods/gameserver/model/actor/Creature.isMuted:()Z
  #420 = NameAndType        #421:#34      // isMuted:()Z
  #421 = Utf8               isMuted
  #422 = Methodref          #51.#423      // ext/mods/gameserver/model/actor/Creature.isPhysicalMuted:()Z
  #423 = NameAndType        #424:#34      // isPhysicalMuted:()Z
  #424 = Utf8               isPhysicalMuted
  #425 = Methodref          #8.#426       // ext/mods/gameserver/model/actor/cast/CreatureCast.meetsHpMpDisabledConditions:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
  #426 = NameAndType        #427:#162     // meetsHpMpDisabledConditions:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
  #427 = Utf8               meetsHpMpDisabledConditions
  #428 = Methodref          #51.#429      // ext/mods/gameserver/model/actor/Creature.getCollisionRadius:()D
  #429 = NameAndType        #430:#298     // getCollisionRadius:()D
  #430 = Utf8               getCollisionRadius
  #431 = Fieldref           #39.#432      // ext/mods/gameserver/network/SystemMessageId.TARGET_TOO_FAR:Lext/mods/gameserver/network/SystemMessageId;
  #432 = NameAndType        #433:#43      // TARGET_TOO_FAR:Lext/mods/gameserver/network/SystemMessageId;
  #433 = Utf8               TARGET_TOO_FAR
  #434 = Methodref          #268.#435     // ext/mods/gameserver/model/actor/move/MovementIntegration.canCastOnTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;I)Z
  #435 = NameAndType        #436:#437     // canCastOnTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;I)Z
  #436 = Utf8               canCastOnTarget
  #437 = Utf8               (Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;I)Z
  #438 = Methodref          #62.#439      // ext/mods/gameserver/skills/L2Skill.getWeaponDependancy:(Lext/mods/gameserver/model/actor/Creature;)Z
  #439 = NameAndType        #440:#441     // getWeaponDependancy:(Lext/mods/gameserver/model/actor/Creature;)Z
  #440 = Utf8               getWeaponDependancy
  #441 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
  #442 = Utf8               Signature
  #443 = Utf8               TT;
  #444 = Utf8               Ljava/util/concurrent/ScheduledFuture<*>;
  #445 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
  #446 = Utf8               Code
  #447 = Utf8               LineNumberTable
  #448 = Utf8               LocalVariableTable
  #449 = Utf8               this
  #450 = Utf8               Lext/mods/gameserver/model/actor/cast/CreatureCast;
  #451 = Utf8               actor
  #452 = Utf8               LocalVariableTypeTable
  #453 = Utf8               Lext/mods/gameserver/model/actor/cast/CreatureCast<TT;>;
  #454 = Utf8               (TT;)V
  #455 = Utf8               StackMapTable
  #456 = Utf8               getCurrentSkill
  #457 = Utf8               ()Lext/mods/gameserver/skills/L2Skill;
  #458 = Utf8               interrupt
  #459 = Utf8               describeCastTo
  #460 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #461 = Utf8               player
  #462 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #463 = Utf8               doFusionCast
  #464 = Utf8               (Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;)V
  #465 = Utf8               skill
  #466 = Utf8               target
  #467 = Utf8               doInstantCast
  #468 = Utf8               (Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #469 = Utf8               itemSkill
  #470 = Utf8               item
  #471 = Utf8               doToggleCast
  #472 = Utf8               doCast
  #473 = Utf8               (Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #474 = Utf8               itemInstance
  #475 = Utf8               hitTime
  #476 = Utf8               coolTime
  #477 = Utf8               reuseDelay
  #478 = Utf8               skillMastery
  #479 = Utf8               initMpConsume
  #480 = Utf8               castInterruptTime
  #481 = Class              #482          // ext/mods/gameserver/model/item/instance/ItemInstance
  #482 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
  #483 = Class              #484          // java/lang/Runnable
  #484 = Utf8               java/lang/Runnable
  #485 = Utf8               onMagicLaunch
  #486 = Utf8               skillRange
  #487 = Utf8               distance
  #488 = Utf8               D
  #489 = Utf8               escapeRange
  #490 = Utf8               onMagicHitTimer
  #491 = Utf8               mpConsume
  #492 = Utf8               hpConsume
  #493 = Utf8               onMagicFinalizer
  #494 = Utf8               isInterrupted
  #495 = Utf8               activeWeaponItem
  #496 = Utf8               Lext/mods/gameserver/model/item/kind/Weapon;
  #497 = Utf8               targets
  #498 = Utf8               handler
  #499 = Utf8               Lext/mods/gameserver/handler/ISkillHandler;
  #500 = Class              #283          // "[Lext/mods/gameserver/model/actor/Creature;"
  #501 = Utf8               canAttemptCast
  #502 = Utf8               initialMpConsume
  #503 = Utf8               canCast
  #504 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZI)Z
  #505 = Utf8               totalRange
  #506 = Utf8               isCtrlPressed
  #507 = Utf8               itemObjectId
  #508 = Utf8               <T:Lext/mods/gameserver/model/actor/Creature;>Ljava/lang/Object;
  #509 = Utf8               SourceFile
  #510 = Utf8               CreatureCast.java
  #511 = Utf8               BootstrapMethods
  #512 = MethodType         #6            //  ()V
  #513 = MethodHandle       5:#514        // REF_invokeVirtual ext/mods/gameserver/model/actor/cast/CreatureCast.onMagicLaunch:()V
  #514 = Methodref          #8.#515       // ext/mods/gameserver/model/actor/cast/CreatureCast.onMagicLaunch:()V
  #515 = NameAndType        #485:#6       // onMagicLaunch:()V
  #516 = MethodHandle       5:#517        // REF_invokeVirtual ext/mods/gameserver/model/actor/cast/CreatureCast.onMagicHitTimer:()V
  #517 = Methodref          #8.#518       // ext/mods/gameserver/model/actor/cast/CreatureCast.onMagicHitTimer:()V
  #518 = NameAndType        #490:#6       // onMagicHitTimer:()V
  #519 = MethodHandle       5:#520        // REF_invokeVirtual ext/mods/gameserver/model/actor/cast/CreatureCast.onMagicFinalizer:()V
  #520 = Methodref          #8.#521       // ext/mods/gameserver/model/actor/cast/CreatureCast.onMagicFinalizer:()V
  #521 = NameAndType        #493:#6       // onMagicFinalizer:()V
  #522 = MethodHandle       6:#523        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #523 = Methodref          #524.#525     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #524 = Class              #526          // java/lang/invoke/LambdaMetafactory
  #525 = NameAndType        #527:#528     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #526 = Utf8               java/lang/invoke/LambdaMetafactory
  #527 = Utf8               metafactory
  #528 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #529 = Utf8               InnerClasses
  #530 = Class              #531          // java/lang/invoke/MethodHandles$Lookup
  #531 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #532 = Class              #533          // java/lang/invoke/MethodHandles
  #533 = Utf8               java/lang/invoke/MethodHandles
  #534 = Utf8               Lookup
{
  protected final T _actor;
    descriptor: Lext/mods/gameserver/model/actor/Creature;
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Signature: #443                         // TT;

  protected long _castInterruptTime;
    descriptor: J
    flags: (0x0004) ACC_PROTECTED

  protected ext.mods.gameserver.model.actor.Creature[] _targets;
    descriptor: [Lext/mods/gameserver/model/actor/Creature;
    flags: (0x0004) ACC_PROTECTED

  protected ext.mods.gameserver.model.actor.Creature _target;
    descriptor: Lext/mods/gameserver/model/actor/Creature;
    flags: (0x0004) ACC_PROTECTED

  protected ext.mods.gameserver.skills.L2Skill _skill;
    descriptor: Lext/mods/gameserver/skills/L2Skill;
    flags: (0x0004) ACC_PROTECTED

  protected ext.mods.gameserver.model.item.instance.ItemInstance _item;
    descriptor: Lext/mods/gameserver/model/item/instance/ItemInstance;
    flags: (0x0004) ACC_PROTECTED

  protected int _hitTime;
    descriptor: I
    flags: (0x0004) ACC_PROTECTED

  protected int _coolTime;
    descriptor: I
    flags: (0x0004) ACC_PROTECTED

  protected java.util.concurrent.ScheduledFuture<?> _castTask;
    descriptor: Ljava/util/concurrent/ScheduledFuture;
    flags: (0x0004) ACC_PROTECTED
    Signature: #444                         // Ljava/util/concurrent/ScheduledFuture<*>;

  protected boolean _isCastingNow;
    descriptor: Z
    flags: (0x0004) ACC_PROTECTED

  public ext.mods.gameserver.model.actor.cast.CreatureCast(T);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         9: return
      LineNumberTable:
        line 84: 0
        line 85: 4
        line 86: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/actor/cast/CreatureCast;
            0      10     1 actor   Lext/mods/gameserver/model/actor/Creature;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/actor/cast/CreatureCast<TT;>;
            0      10     1 actor   TT;
    Signature: #454                         // (TT;)V

  public final boolean canAbortCast();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _castInterruptTime:J
         4: invokestatic  #17                 // Method java/lang/System.currentTimeMillis:()J
         7: lcmp
         8: ifle          15
        11: iconst_1
        12: goto          16
        15: iconst_0
        16: ireturn
      LineNumberTable:
        line 90: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/actor/cast/CreatureCast;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/actor/cast/CreatureCast<TT;>;
      StackMapTable: number_of_entries = 2
        frame_type = 15 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public final boolean isCastingNow();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #23                 // Field _isCastingNow:Z
         4: ireturn
      LineNumberTable:
        line 95: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/cast/CreatureCast;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/cast/CreatureCast<TT;>;

  public final ext.mods.gameserver.skills.L2Skill getCurrentSkill();
    descriptor: ()Lext/mods/gameserver/skills/L2Skill;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #27                 // Field _skill:Lext/mods/gameserver/skills/L2Skill;
         4: areturn
      LineNumberTable:
        line 100: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/cast/CreatureCast;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/cast/CreatureCast<TT;>;

  public void interrupt();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #31                 // Method canAbortCast:()Z
         4: ifeq          24
         7: aload_0
         8: invokevirtual #35                 // Method stop:()V
        11: aload_0
        12: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        15: getstatic     #38                 // Field ext/mods/gameserver/network/SystemMessageId.CASTING_INTERRUPTED:Lext/mods/gameserver/network/SystemMessageId;
        18: invokestatic  #44                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        21: invokevirtual #50                 // Method ext/mods/gameserver/model/actor/Creature.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        24: return
      LineNumberTable:
        line 108: 0
        line 110: 7
        line 111: 11
        line 113: 24
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/gameserver/model/actor/cast/CreatureCast;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/gameserver/model/actor/cast/CreatureCast<TT;>;
      StackMapTable: number_of_entries = 1
        frame_type = 24 /* same */

  public void describeCastTo(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=10, locals=2, args_size=2
         0: aload_0
         1: getfield      #27                 // Field _skill:Lext/mods/gameserver/skills/L2Skill;
         4: ifnull        52
         7: aload_1
         8: new           #56                 // class ext/mods/gameserver/network/serverpackets/MagicSkillUse
        11: dup
        12: aload_0
        13: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        16: aload_0
        17: getfield      #58                 // Field _target:Lext/mods/gameserver/model/actor/Creature;
        20: aload_0
        21: getfield      #27                 // Field _skill:Lext/mods/gameserver/skills/L2Skill;
        24: invokevirtual #61                 // Method ext/mods/gameserver/skills/L2Skill.getId:()I
        27: aload_0
        28: getfield      #27                 // Field _skill:Lext/mods/gameserver/skills/L2Skill;
        31: invokevirtual #67                 // Method ext/mods/gameserver/skills/L2Skill.getLevel:()I
        34: aload_0
        35: getfield      #70                 // Field _hitTime:I
        38: aload_0
        39: getfield      #27                 // Field _skill:Lext/mods/gameserver/skills/L2Skill;
        42: invokevirtual #74                 // Method ext/mods/gameserver/skills/L2Skill.getReuseDelay:()I
        45: iconst_0
        46: invokespecial #77                 // Method ext/mods/gameserver/network/serverpackets/MagicSkillUse."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIIIZ)V
        49: invokevirtual #80                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        52: return
      LineNumberTable:
        line 121: 0
        line 123: 7
        line 125: 52
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      53     0  this   Lext/mods/gameserver/model/actor/cast/CreatureCast;
            0      53     1 player   Lext/mods/gameserver/model/actor/Player;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      53     0  this   Lext/mods/gameserver/model/actor/cast/CreatureCast<TT;>;
      StackMapTable: number_of_entries = 1
        frame_type = 52 /* same */

  public void doFusionCast(ext.mods.gameserver.skills.L2Skill, ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=3, args_size=3
         0: return
      LineNumberTable:
        line 127: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/cast/CreatureCast;
            0       1     1 skill   Lext/mods/gameserver/skills/L2Skill;
            0       1     2 target   Lext/mods/gameserver/model/actor/Creature;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/cast/CreatureCast<TT;>;

  public void doInstantCast(ext.mods.gameserver.skills.L2Skill, ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=3, args_size=3
         0: return
      LineNumberTable:
        line 129: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/cast/CreatureCast;
            0       1     1 itemSkill   Lext/mods/gameserver/skills/L2Skill;
            0       1     2  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/cast/CreatureCast<TT;>;

  public void doToggleCast(ext.mods.gameserver.skills.L2Skill, ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=3, args_size=3
         0: return
      LineNumberTable:
        line 131: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/cast/CreatureCast;
            0       1     1 skill   Lext/mods/gameserver/skills/L2Skill;
            0       1     2 target   Lext/mods/gameserver/model/actor/Creature;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/cast/CreatureCast<TT;>;

  public void doCast(ext.mods.gameserver.skills.L2Skill, ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=10, locals=13, args_size=4
         0: aload_1
         1: invokevirtual #83                 // Method ext/mods/gameserver/skills/L2Skill.getHitTime:()I
         4: istore        4
         6: aload_1
         7: invokevirtual #86                 // Method ext/mods/gameserver/skills/L2Skill.getCoolTime:()I
        10: istore        5
        12: aload_1
        13: invokevirtual #89                 // Method ext/mods/gameserver/skills/L2Skill.isStaticHitTime:()Z
        16: ifne          132
        19: aload_0
        20: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        23: aload_1
        24: iload         4
        26: i2d
        27: invokestatic  #92                 // Method ext/mods/gameserver/skills/Formulas.calcAtkSpd:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;D)I
        30: istore        4
        32: iload         5
        34: ifle          50
        37: aload_0
        38: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        41: aload_1
        42: iload         5
        44: i2d
        45: invokestatic  #92                 // Method ext/mods/gameserver/skills/Formulas.calcAtkSpd:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;D)I
        48: istore        5
        50: aload_1
        51: invokevirtual #98                 // Method ext/mods/gameserver/skills/L2Skill.isMagic:()Z
        54: ifeq          103
        57: aload_0
        58: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        61: getstatic     #101                // Field ext/mods/gameserver/enums/items/ShotType.SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
        64: invokevirtual #107                // Method ext/mods/gameserver/model/actor/Creature.isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
        67: ifne          83
        70: aload_0
        71: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        74: getstatic     #111                // Field ext/mods/gameserver/enums/items/ShotType.BLESSED_SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
        77: invokevirtual #107                // Method ext/mods/gameserver/model/actor/Creature.isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
        80: ifeq          103
        83: ldc2_w        #114                // double 0.7d
        86: iload         4
        88: i2d
        89: dmul
        90: d2i
        91: istore        4
        93: ldc2_w        #114                // double 0.7d
        96: iload         5
        98: i2d
        99: dmul
       100: d2i
       101: istore        5
       103: getstatic     #116                // Field ext/mods/Config.HIT_TIME:Z
       106: ifeq          132
       109: aload_1
       110: invokevirtual #83                 // Method ext/mods/gameserver/skills/L2Skill.getHitTime:()I
       113: sipush        500
       116: if_icmplt     132
       119: iload         4
       121: sipush        500
       124: if_icmpge     132
       127: sipush        500
       130: istore        4
       132: aload_1
       133: invokevirtual #74                 // Method ext/mods/gameserver/skills/L2Skill.getReuseDelay:()I
       136: istore        6
       138: aload_1
       139: invokevirtual #121                // Method ext/mods/gameserver/skills/L2Skill.isStaticReuse:()Z
       142: ifne          223
       145: iload         6
       147: i2d
       148: aload_0
       149: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       152: invokevirtual #124                // Method ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
       155: aload_1
       156: invokevirtual #98                 // Method ext/mods/gameserver/skills/L2Skill.isMagic:()Z
       159: ifeq          168
       162: getstatic     #128                // Field ext/mods/gameserver/enums/skills/Stats.MAGIC_REUSE_RATE:Lext/mods/gameserver/enums/skills/Stats;
       165: goto          171
       168: getstatic     #134                // Field ext/mods/gameserver/enums/skills/Stats.P_REUSE:Lext/mods/gameserver/enums/skills/Stats;
       171: dconst_1
       172: aconst_null
       173: aconst_null
       174: invokevirtual #137                // Method ext/mods/gameserver/model/actor/status/CreatureStatus.calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
       177: dmul
       178: d2i
       179: istore        6
       181: iload         6
       183: i2d
       184: ldc2_w        #143                // double 333.0d
       187: aload_1
       188: invokevirtual #98                 // Method ext/mods/gameserver/skills/L2Skill.isMagic:()Z
       191: ifeq          207
       194: aload_0
       195: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       198: invokevirtual #124                // Method ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
       201: invokevirtual #145                // Method ext/mods/gameserver/model/actor/status/CreatureStatus.getMAtkSpd:()I
       204: goto          217
       207: aload_0
       208: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       211: invokevirtual #124                // Method ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
       214: invokevirtual #148                // Method ext/mods/gameserver/model/actor/status/CreatureStatus.getPAtkSpd:()I
       217: i2d
       218: ddiv
       219: dmul
       220: d2i
       221: istore        6
       223: aload_0
       224: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       227: instanceof    #151                // class ext/mods/gameserver/model/actor/Npc
       230: ifeq          245
       233: sipush        3000
       236: iload         6
       238: iconst_2
       239: imul
       240: invokestatic  #153                // Method java/lang/Math.max:(II)I
       243: istore        6
       245: aload_0
       246: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       249: aload_1
       250: invokestatic  #159                // Method ext/mods/gameserver/skills/Formulas.calcSkillMastery:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
       253: istore        7
       255: iload         6
       257: sipush        30000
       260: if_icmple     279
       263: iload         7
       265: ifne          279
       268: aload_0
       269: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       272: aload_1
       273: iload         6
       275: i2l
       276: invokevirtual #163                // Method ext/mods/gameserver/model/actor/Creature.addTimeStamp:(Lext/mods/gameserver/skills/L2Skill;J)V
       279: iload         6
       281: bipush        10
       283: if_icmple     329
       286: iload         7
       288: ifeq          318
       291: bipush        100
       293: istore        6
       295: aload_0
       296: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       299: invokevirtual #167                // Method ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
       302: ifnull        318
       305: aload_0
       306: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       309: invokevirtual #167                // Method ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
       312: getstatic     #171                // Field ext/mods/gameserver/network/SystemMessageId.SKILL_READY_TO_USE_AGAIN:Lext/mods/gameserver/network/SystemMessageId;
       315: invokevirtual #174                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       318: aload_0
       319: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       322: aload_1
       323: iload         6
       325: i2l
       326: invokevirtual #177                // Method ext/mods/gameserver/model/actor/Creature.disableSkill:(Lext/mods/gameserver/skills/L2Skill;J)V
       329: aload_0
       330: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       333: invokevirtual #124                // Method ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
       336: aload_1
       337: invokevirtual #180                // Method ext/mods/gameserver/model/actor/status/CreatureStatus.getMpInitialConsume:(Lext/mods/gameserver/skills/L2Skill;)I
       340: istore        8
       342: iload         8
       344: ifle          361
       347: aload_0
       348: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       351: invokevirtual #124                // Method ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
       354: iload         8
       356: i2d
       357: invokevirtual #184                // Method ext/mods/gameserver/model/actor/status/CreatureStatus.reduceMp:(D)D
       360: pop2
       361: aload_0
       362: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       365: new           #56                 // class ext/mods/gameserver/network/serverpackets/MagicSkillUse
       368: dup
       369: aload_0
       370: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       373: aload_2
       374: aload_1
       375: invokevirtual #61                 // Method ext/mods/gameserver/skills/L2Skill.getId:()I
       378: aload_1
       379: invokevirtual #67                 // Method ext/mods/gameserver/skills/L2Skill.getLevel:()I
       382: iload         4
       384: iload         6
       386: iconst_0
       387: invokespecial #77                 // Method ext/mods/gameserver/network/serverpackets/MagicSkillUse."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIIIZ)V
       390: invokevirtual #188                // Method ext/mods/gameserver/model/actor/Creature.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       393: aload_3
       394: ifnonnull     414
       397: aload_0
       398: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       401: getstatic     #191                // Field ext/mods/gameserver/network/SystemMessageId.USE_S1:Lext/mods/gameserver/network/SystemMessageId;
       404: invokestatic  #44                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       407: aload_1
       408: invokevirtual #194                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       411: invokevirtual #50                 // Method ext/mods/gameserver/model/actor/Creature.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       414: invokestatic  #17                 // Method java/lang/System.currentTimeMillis:()J
       417: iload         4
       419: i2l
       420: ladd
       421: ldc2_w        #198                // long 200l
       424: lsub
       425: lstore        9
       427: aload_0
       428: aload_1
       429: aload_2
       430: aload_3
       431: iload         4
       433: iload         5
       435: lload         9
       437: invokevirtual #200                // Method setCastTask:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/instance/ItemInstance;IIJ)V
       440: aload_0
       441: getfield      #70                 // Field _hitTime:I
       444: sipush        410
       447: if_icmple     493
       450: aload_0
       451: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       454: astore        12
       456: aload         12
       458: instanceof    #81                 // class ext/mods/gameserver/model/actor/Player
       461: ifeq          490
       464: aload         12
       466: checkcast     #81                 // class ext/mods/gameserver/model/actor/Player
       469: astore        11
       471: aload         11
       473: new           #204                // class ext/mods/gameserver/network/serverpackets/SetupGauge
       476: dup
       477: getstatic     #206                // Field ext/mods/gameserver/enums/GaugeColor.BLUE:Lext/mods/gameserver/enums/GaugeColor;
       480: aload_0
       481: getfield      #70                 // Field _hitTime:I
       484: invokespecial #212                // Method ext/mods/gameserver/network/serverpackets/SetupGauge."<init>":(Lext/mods/gameserver/enums/GaugeColor;I)V
       487: invokevirtual #80                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       490: goto          498
       493: aload_0
       494: iconst_0
       495: putfield      #70                 // Field _hitTime:I
       498: aload_0
       499: aload_0
       500: invokedynamic #215,  0            // InvokeDynamic #0:run:(Lext/mods/gameserver/model/actor/cast/CreatureCast;)Ljava/lang/Runnable;
       505: iload         4
       507: sipush        410
       510: if_icmple     523
       513: iload         4
       515: sipush        400
       518: isub
       519: i2l
       520: goto          524
       523: lconst_0
       524: invokestatic  #219                // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
       527: putfield      #225                // Field _castTask:Ljava/util/concurrent/ScheduledFuture;
       530: return
      LineNumberTable:
        line 135: 0
        line 136: 6
        line 137: 12
        line 139: 19
        line 140: 32
        line 141: 37
        line 143: 50
        line 145: 83
        line 146: 93
        line 149: 103
        line 151: 109
        line 152: 127
        line 156: 132
        line 157: 138
        line 159: 145
        line 160: 181
        line 163: 223
        line 165: 233
        line 168: 245
        line 169: 255
        line 170: 268
        line 172: 279
        line 174: 286
        line 176: 291
        line 177: 295
        line 178: 305
        line 180: 318
        line 183: 329
        line 184: 342
        line 185: 347
        line 187: 361
        line 189: 393
        line 190: 397
        line 192: 414
        line 194: 427
        line 196: 440
        line 198: 450
        line 199: 471
        line 202: 493
        line 204: 498
        line 205: 530
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          471      19    11 player   Lext/mods/gameserver/model/actor/Player;
            0     531     0  this   Lext/mods/gameserver/model/actor/cast/CreatureCast;
            0     531     1 skill   Lext/mods/gameserver/skills/L2Skill;
            0     531     2 target   Lext/mods/gameserver/model/actor/Creature;
            0     531     3 itemInstance   Lext/mods/gameserver/model/item/instance/ItemInstance;
            6     525     4 hitTime   I
           12     519     5 coolTime   I
          138     393     6 reuseDelay   I
          255     276     7 skillMastery   Z
          342     189     8 initMpConsume   I
          427     104     9 castInterruptTime   J
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0     531     0  this   Lext/mods/gameserver/model/actor/cast/CreatureCast<TT;>;
      StackMapTable: number_of_entries = 20
        frame_type = 253 /* append */
          offset_delta = 50
          locals = [ int, int ]
        frame_type = 32 /* same */
        frame_type = 19 /* same */
        frame_type = 28 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 35
          locals = [ class ext/mods/gameserver/model/actor/cast/CreatureCast, class ext/mods/gameserver/skills/L2Skill, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/model/item/instance/ItemInstance, int, int, int ]
          stack = [ double, class ext/mods/gameserver/model/actor/status/CreatureStatus ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/actor/cast/CreatureCast, class ext/mods/gameserver/skills/L2Skill, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/model/item/instance/ItemInstance, int, int, int ]
          stack = [ double, class ext/mods/gameserver/model/actor/status/CreatureStatus, class ext/mods/gameserver/enums/skills/Stats ]
        frame_type = 255 /* full_frame */
          offset_delta = 35
          locals = [ class ext/mods/gameserver/model/actor/cast/CreatureCast, class ext/mods/gameserver/skills/L2Skill, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/model/item/instance/ItemInstance, int, int, int ]
          stack = [ double, double ]
        frame_type = 255 /* full_frame */
          offset_delta = 9
          locals = [ class ext/mods/gameserver/model/actor/cast/CreatureCast, class ext/mods/gameserver/skills/L2Skill, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/model/item/instance/ItemInstance, int, int, int ]
          stack = [ double, double, int ]
        frame_type = 5 /* same */
        frame_type = 21 /* same */
        frame_type = 252 /* append */
          offset_delta = 33
          locals = [ int ]
        frame_type = 38 /* same */
        frame_type = 10 /* same */
        frame_type = 252 /* append */
          offset_delta = 31
          locals = [ int ]
        frame_type = 52 /* same */
        frame_type = 252 /* append */
          offset_delta = 75
          locals = [ long ]
        frame_type = 2 /* same */
        frame_type = 4 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 24
          locals = [ class ext/mods/gameserver/model/actor/cast/CreatureCast, class ext/mods/gameserver/skills/L2Skill, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/model/item/instance/ItemInstance, int, int, int, int, int, long ]
          stack = [ class ext/mods/gameserver/model/actor/cast/CreatureCast, class java/lang/Runnable ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/cast/CreatureCast, class ext/mods/gameserver/skills/L2Skill, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/model/item/instance/ItemInstance, int, int, int, int, int, long ]
          stack = [ class ext/mods/gameserver/model/actor/cast/CreatureCast, class java/lang/Runnable, long ]

  protected void onMagicHitTimer();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=5, locals=5, args_size=1
         0: aload_0
         1: invokevirtual #229                // Method isCastingNow:()Z
         4: ifne          8
         7: return
         8: aload_0
         9: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        12: invokevirtual #124                // Method ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
        15: aload_0
        16: getfield      #27                 // Field _skill:Lext/mods/gameserver/skills/L2Skill;
        19: invokevirtual #292                // Method ext/mods/gameserver/model/actor/status/CreatureStatus.getMpConsume:(Lext/mods/gameserver/skills/L2Skill;)I
        22: i2d
        23: dstore_1
        24: dload_1
        25: dconst_0
        26: dcmpl
        27: ifle          75
        30: dload_1
        31: aload_0
        32: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        35: invokevirtual #124                // Method ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
        38: invokevirtual #295                // Method ext/mods/gameserver/model/actor/status/CreatureStatus.getMp:()D
        41: dcmpl
        42: ifle          63
        45: aload_0
        46: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        49: getstatic     #299                // Field ext/mods/gameserver/network/SystemMessageId.NOT_ENOUGH_MP:Lext/mods/gameserver/network/SystemMessageId;
        52: invokestatic  #44                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        55: invokevirtual #50                 // Method ext/mods/gameserver/model/actor/Creature.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        58: aload_0
        59: invokevirtual #35                 // Method stop:()V
        62: return
        63: aload_0
        64: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        67: invokevirtual #124                // Method ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
        70: dload_1
        71: invokevirtual #184                // Method ext/mods/gameserver/model/actor/status/CreatureStatus.reduceMp:(D)D
        74: pop2
        75: aload_0
        76: getfield      #27                 // Field _skill:Lext/mods/gameserver/skills/L2Skill;
        79: invokevirtual #302                // Method ext/mods/gameserver/skills/L2Skill.getHpConsume:()I
        82: i2d
        83: dstore_3
        84: dload_3
        85: dconst_0
        86: dcmpl
        87: ifle          139
        90: dload_3
        91: aload_0
        92: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        95: invokevirtual #124                // Method ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
        98: invokevirtual #305                // Method ext/mods/gameserver/model/actor/status/CreatureStatus.getHp:()D
       101: dcmpl
       102: ifle          123
       105: aload_0
       106: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       109: getstatic     #308                // Field ext/mods/gameserver/network/SystemMessageId.NOT_ENOUGH_HP:Lext/mods/gameserver/network/SystemMessageId;
       112: invokestatic  #44                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       115: invokevirtual #50                 // Method ext/mods/gameserver/model/actor/Creature.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       118: aload_0
       119: invokevirtual #35                 // Method stop:()V
       122: return
       123: aload_0
       124: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       127: invokevirtual #124                // Method ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
       130: dload_3
       131: aload_0
       132: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       135: iconst_1
       136: invokevirtual #311                // Method ext/mods/gameserver/model/actor/status/CreatureStatus.reduceHp:(DLext/mods/gameserver/model/actor/Creature;Z)V
       139: aload_0
       140: aload_0
       141: getfield      #27                 // Field _skill:Lext/mods/gameserver/skills/L2Skill;
       144: aload_0
       145: getfield      #280                // Field _targets:[Lext/mods/gameserver/model/actor/Creature;
       148: aload_0
       149: getfield      #315                // Field _item:Lext/mods/gameserver/model/item/instance/ItemInstance;
       152: invokevirtual #319                // Method callSkill:(Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
       155: aload_0
       156: aload_0
       157: invokedynamic #323,  0            // InvokeDynamic #2:run:(Lext/mods/gameserver/model/actor/cast/CreatureCast;)Ljava/lang/Runnable;
       162: aload_0
       163: getfield      #70                 // Field _hitTime:I
       166: ifeq          176
       169: aload_0
       170: getfield      #324                // Field _coolTime:I
       173: ifne          180
       176: lconst_0
       177: goto          185
       180: aload_0
       181: getfield      #324                // Field _coolTime:I
       184: i2l
       185: invokestatic  #219                // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
       188: putfield      #225                // Field _castTask:Ljava/util/concurrent/ScheduledFuture;
       191: return
      LineNumberTable:
        line 257: 0
        line 258: 7
        line 260: 8
        line 261: 24
        line 263: 30
        line 265: 45
        line 266: 58
        line 267: 62
        line 269: 63
        line 272: 75
        line 273: 84
        line 275: 90
        line 277: 105
        line 278: 118
        line 279: 122
        line 281: 123
        line 284: 139
        line 285: 155
        line 286: 191
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     192     0  this   Lext/mods/gameserver/model/actor/cast/CreatureCast;
           24     168     1 mpConsume   D
           84     108     3 hpConsume   D
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0     192     0  this   Lext/mods/gameserver/model/actor/cast/CreatureCast<TT;>;
      StackMapTable: number_of_entries = 8
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 54
          locals = [ double ]
        frame_type = 11 /* same */
        frame_type = 252 /* append */
          offset_delta = 47
          locals = [ double ]
        frame_type = 15 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 36
          locals = [ class ext/mods/gameserver/model/actor/cast/CreatureCast, double, double ]
          stack = [ class ext/mods/gameserver/model/actor/cast/CreatureCast, class java/lang/Runnable ]
        frame_type = 255 /* full_frame */
          offset_delta = 3
          locals = [ class ext/mods/gameserver/model/actor/cast/CreatureCast, double, double ]
          stack = [ class ext/mods/gameserver/model/actor/cast/CreatureCast, class java/lang/Runnable ]
        frame_type = 255 /* full_frame */
          offset_delta = 4
          locals = [ class ext/mods/gameserver/model/actor/cast/CreatureCast, double, double ]
          stack = [ class ext/mods/gameserver/model/actor/cast/CreatureCast, class java/lang/Runnable, long ]

  protected final void onMagicFinalizer();
    descriptor: ()V
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #229                // Method isCastingNow:()Z
         4: ifne          8
         7: return
         8: aload_0
         9: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        12: instanceof    #327                // class ext/mods/gameserver/model/actor/Playable
        15: ifeq          39
        18: aload_0
        19: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        22: aload_0
        23: getfield      #27                 // Field _skill:Lext/mods/gameserver/skills/L2Skill;
        26: invokevirtual #329                // Method ext/mods/gameserver/skills/L2Skill.useSoulShot:()Z
        29: aload_0
        30: getfield      #27                 // Field _skill:Lext/mods/gameserver/skills/L2Skill;
        33: invokevirtual #332                // Method ext/mods/gameserver/skills/L2Skill.useSpiritShot:()Z
        36: invokevirtual #335                // Method ext/mods/gameserver/model/actor/Creature.rechargeShots:(ZZ)V
        39: aload_0
        40: getfield      #27                 // Field _skill:Lext/mods/gameserver/skills/L2Skill;
        43: invokevirtual #258                // Method ext/mods/gameserver/skills/L2Skill.isOffensive:()Z
        46: ifeq          67
        49: aload_0
        50: getfield      #280                // Field _targets:[Lext/mods/gameserver/model/actor/Creature;
        53: arraylength
        54: ifeq          67
        57: aload_0
        58: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        61: invokevirtual #241                // Method ext/mods/gameserver/model/actor/Creature.getAI:()Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
        64: invokevirtual #339                // Method ext/mods/gameserver/model/actor/ai/type/CreatureAI.startAttackStance:()V
        67: aload_0
        68: iconst_0
        69: putfield      #23                 // Field _isCastingNow:Z
        72: aload_0
        73: iconst_0
        74: invokevirtual #342                // Method notifyCastFinishToAI:(Z)V
        77: return
      LineNumberTable:
        line 290: 0
        line 291: 7
        line 293: 8
        line 294: 18
        line 296: 39
        line 297: 57
        line 299: 67
        line 300: 72
        line 301: 77
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      78     0  this   Lext/mods/gameserver/model/actor/cast/CreatureCast;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      78     0  this   Lext/mods/gameserver/model/actor/cast/CreatureCast<TT;>;
      StackMapTable: number_of_entries = 3
        frame_type = 8 /* same */
        frame_type = 30 /* same */
        frame_type = 27 /* same */

  public void stop();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #229                // Method isCastingNow:()Z
         4: ifeq          61
         7: aload_0
         8: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        11: new           #346                // class ext/mods/gameserver/network/serverpackets/MagicSkillCanceled
        14: dup
        15: aload_0
        16: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        19: invokevirtual #348                // Method ext/mods/gameserver/model/actor/Creature.getObjectId:()I
        22: invokespecial #351                // Method ext/mods/gameserver/network/serverpackets/MagicSkillCanceled."<init>":(I)V
        25: invokevirtual #188                // Method ext/mods/gameserver/model/actor/Creature.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        28: aload_0
        29: getfield      #225                // Field _castTask:Ljava/util/concurrent/ScheduledFuture;
        32: ifnull        51
        35: aload_0
        36: getfield      #225                // Field _castTask:Ljava/util/concurrent/ScheduledFuture;
        39: iconst_0
        40: invokeinterface #354,  2          // InterfaceMethod java/util/concurrent/ScheduledFuture.cancel:(Z)Z
        45: pop
        46: aload_0
        47: aconst_null
        48: putfield      #225                // Field _castTask:Ljava/util/concurrent/ScheduledFuture;
        51: aload_0
        52: iconst_1
        53: invokevirtual #342                // Method notifyCastFinishToAI:(Z)V
        56: aload_0
        57: iconst_0
        58: putfield      #23                 // Field _isCastingNow:Z
        61: return
      LineNumberTable:
        line 305: 0
        line 307: 7
        line 308: 28
        line 310: 35
        line 311: 46
        line 313: 51
        line 314: 56
        line 316: 61
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      62     0  this   Lext/mods/gameserver/model/actor/cast/CreatureCast;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      62     0  this   Lext/mods/gameserver/model/actor/cast/CreatureCast<TT;>;
      StackMapTable: number_of_entries = 2
        frame_type = 51 /* same */
        frame_type = 9 /* same */

  protected void notifyCastFinishToAI(boolean);
    descriptor: (Z)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: invokevirtual #241                // Method ext/mods/gameserver/model/actor/Creature.getAI:()Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
         7: getstatic     #360                // Field ext/mods/gameserver/enums/AiEventType.FINISHED_CASTING:Lext/mods/gameserver/enums/AiEventType;
        10: aconst_null
        11: aconst_null
        12: invokevirtual #366                // Method ext/mods/gameserver/model/actor/ai/type/CreatureAI.notifyEvent:(Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
        15: return
      LineNumberTable:
        line 320: 0
        line 321: 15
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/model/actor/cast/CreatureCast;
            0      16     1 isInterrupted   Z
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/model/actor/cast/CreatureCast<TT;>;

  protected void setCastTask(ext.mods.gameserver.skills.L2Skill, ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.model.item.instance.ItemInstance, int, int, long);
    descriptor: (Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/instance/ItemInstance;IIJ)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=8, args_size=7
         0: aload_0
         1: aload_1
         2: putfield      #27                 // Field _skill:Lext/mods/gameserver/skills/L2Skill;
         5: aload_0
         6: aload_2
         7: putfield      #58                 // Field _target:Lext/mods/gameserver/model/actor/Creature;
        10: aload_0
        11: aload_3
        12: putfield      #315                // Field _item:Lext/mods/gameserver/model/item/instance/ItemInstance;
        15: aload_0
        16: iload         4
        18: putfield      #70                 // Field _hitTime:I
        21: aload_0
        22: iload         5
        24: putfield      #324                // Field _coolTime:I
        27: aload_0
        28: lload         6
        30: putfield      #13                 // Field _castInterruptTime:J
        33: aload_0
        34: iconst_1
        35: putfield      #23                 // Field _isCastingNow:Z
        38: return
      LineNumberTable:
        line 325: 0
        line 326: 5
        line 327: 10
        line 328: 15
        line 329: 21
        line 330: 27
        line 331: 33
        line 332: 38
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      39     0  this   Lext/mods/gameserver/model/actor/cast/CreatureCast;
            0      39     1 skill   Lext/mods/gameserver/skills/L2Skill;
            0      39     2 target   Lext/mods/gameserver/model/actor/Creature;
            0      39     3  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0      39     4 hitTime   I
            0      39     5 coolTime   I
            0      39     6 castInterruptTime   J
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      39     0  this   Lext/mods/gameserver/model/actor/cast/CreatureCast<TT;>;

  public void callSkill(ext.mods.gameserver.skills.L2Skill, ext.mods.gameserver.model.actor.Creature[], ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=9, args_size=4
         0: aload_2
         1: astore        4
         3: aload         4
         5: arraylength
         6: istore        5
         8: iconst_0
         9: istore        6
        11: iload         6
        13: iload         5
        15: if_icmpge     65
        18: aload         4
        20: iload         6
        22: aaload
        23: astore        7
        25: aload_0
        26: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        29: invokevirtual #370                // Method ext/mods/gameserver/model/actor/Creature.getActiveWeaponItem:()Lext/mods/gameserver/model/item/kind/Weapon;
        32: astore        8
        34: aload         8
        36: ifnull        59
        39: aload         7
        41: invokevirtual #374                // Method ext/mods/gameserver/model/actor/Creature.isDead:()Z
        44: ifne          59
        47: aload         8
        49: aload_0
        50: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        53: aload         7
        55: aload_1
        56: invokevirtual #377                // Method ext/mods/gameserver/model/item/kind/Weapon.castSkillOnMagic:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
        59: iinc          6, 1
        62: goto          11
        65: aload_1
        66: invokevirtual #258                // Method ext/mods/gameserver/skills/L2Skill.isOffensive:()Z
        69: ifeq          119
        72: aload_2
        73: astore        4
        75: aload         4
        77: arraylength
        78: istore        5
        80: iconst_0
        81: istore        6
        83: iload         6
        85: iload         5
        87: if_icmpge     119
        90: aload         4
        92: iload         6
        94: aaload
        95: astore        7
        97: aload         7
        99: invokevirtual #241                // Method ext/mods/gameserver/model/actor/Creature.getAI:()Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
       102: getstatic     #383                // Field ext/mods/gameserver/enums/AiEventType.ATTACKED:Lext/mods/gameserver/enums/AiEventType;
       105: aload_0
       106: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       109: aconst_null
       110: invokevirtual #366                // Method ext/mods/gameserver/model/actor/ai/type/CreatureAI.notifyEvent:(Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
       113: iinc          6, 1
       116: goto          83
       119: invokestatic  #386                // Method ext/mods/gameserver/handler/SkillHandler.getInstance:()Lext/mods/gameserver/handler/SkillHandler;
       122: aload_1
       123: invokevirtual #392                // Method ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
       126: invokevirtual #396                // Method ext/mods/gameserver/handler/SkillHandler.getHandler:(Ljava/lang/Object;)Lext/mods/gameserver/handler/ISkillHandler;
       129: astore        4
       131: aload         4
       133: ifnull        153
       136: aload         4
       138: aload_0
       139: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       142: aload_1
       143: aload_2
       144: aload_3
       145: invokeinterface #400,  5          // InterfaceMethod ext/mods/gameserver/handler/ISkillHandler.useSkill:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
       150: goto          162
       153: aload_1
       154: aload_0
       155: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       158: aload_2
       159: invokevirtual #406                // Method ext/mods/gameserver/skills/L2Skill.useSkill:(Lext/mods/gameserver/model/actor/Creature;[Lext/mods/gameserver/model/WorldObject;)V
       162: return
      LineNumberTable:
        line 336: 0
        line 338: 25
        line 339: 34
        line 340: 47
        line 336: 59
        line 343: 65
        line 345: 72
        line 346: 97
        line 345: 113
        line 349: 119
        line 350: 131
        line 351: 136
        line 353: 153
        line 354: 162
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           34      25     8 activeWeaponItem   Lext/mods/gameserver/model/item/kind/Weapon;
           25      34     7 target   Lext/mods/gameserver/model/actor/Creature;
           97      16     7 target   Lext/mods/gameserver/model/actor/Creature;
            0     163     0  this   Lext/mods/gameserver/model/actor/cast/CreatureCast;
            0     163     1 skill   Lext/mods/gameserver/skills/L2Skill;
            0     163     2 targets   [Lext/mods/gameserver/model/actor/Creature;
            0     163     3 itemInstance   Lext/mods/gameserver/model/item/instance/ItemInstance;
          131      32     4 handler   Lext/mods/gameserver/handler/ISkillHandler;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0     163     0  this   Lext/mods/gameserver/model/actor/cast/CreatureCast<TT;>;
      StackMapTable: number_of_entries = 7
        frame_type = 254 /* append */
          offset_delta = 11
          locals = [ class "[Lext/mods/gameserver/model/actor/Creature;", int, int ]
        frame_type = 47 /* same */
        frame_type = 248 /* chop */
          offset_delta = 5
        frame_type = 254 /* append */
          offset_delta = 17
          locals = [ class "[Lext/mods/gameserver/model/actor/Creature;", int, int ]
        frame_type = 248 /* chop */
          offset_delta = 35
        frame_type = 252 /* append */
          offset_delta = 33
          locals = [ class ext/mods/gameserver/handler/ISkillHandler ]
        frame_type = 8 /* same */

  public boolean canAttemptCast(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=3
         0: aload_0
         1: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: aload_2
         5: invokevirtual #409                // Method ext/mods/gameserver/model/actor/Creature.isSkillDisabled:(Lext/mods/gameserver/skills/L2Skill;)Z
         8: ifeq          13
        11: iconst_0
        12: ireturn
        13: iconst_1
        14: ireturn
      LineNumberTable:
        line 358: 0
        line 359: 11
        line 360: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/model/actor/cast/CreatureCast;
            0      15     1 target   Lext/mods/gameserver/model/actor/Creature;
            0      15     2 skill   Lext/mods/gameserver/skills/L2Skill;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/model/actor/cast/CreatureCast<TT;>;
      StackMapTable: number_of_entries = 1
        frame_type = 13 /* same */

  public boolean meetsHpMpConditions(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=3
         0: aload_1
         1: ifnull        8
         4: aload_2
         5: ifnonnull     10
         8: iconst_0
         9: ireturn
        10: aload_0
        11: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        14: invokevirtual #124                // Method ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
        17: aload_2
        18: invokevirtual #180                // Method ext/mods/gameserver/model/actor/status/CreatureStatus.getMpInitialConsume:(Lext/mods/gameserver/skills/L2Skill;)I
        21: istore_3
        22: aload_0
        23: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        26: invokevirtual #124                // Method ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
        29: aload_2
        30: invokevirtual #292                // Method ext/mods/gameserver/model/actor/status/CreatureStatus.getMpConsume:(Lext/mods/gameserver/skills/L2Skill;)I
        33: istore        4
        35: iload_3
        36: ifgt          44
        39: iload         4
        41: ifle          77
        44: aload_0
        45: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        48: invokevirtual #124                // Method ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
        51: invokevirtual #295                // Method ext/mods/gameserver/model/actor/status/CreatureStatus.getMp:()D
        54: d2i
        55: iload_3
        56: iload         4
        58: iadd
        59: if_icmpge     77
        62: aload_0
        63: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        66: getstatic     #299                // Field ext/mods/gameserver/network/SystemMessageId.NOT_ENOUGH_MP:Lext/mods/gameserver/network/SystemMessageId;
        69: invokestatic  #44                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        72: invokevirtual #50                 // Method ext/mods/gameserver/model/actor/Creature.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        75: iconst_0
        76: ireturn
        77: aload_2
        78: invokevirtual #302                // Method ext/mods/gameserver/skills/L2Skill.getHpConsume:()I
        81: ifle          117
        84: aload_0
        85: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        88: invokevirtual #124                // Method ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
        91: invokevirtual #305                // Method ext/mods/gameserver/model/actor/status/CreatureStatus.getHp:()D
        94: d2i
        95: aload_2
        96: invokevirtual #302                // Method ext/mods/gameserver/skills/L2Skill.getHpConsume:()I
        99: if_icmpgt     117
       102: aload_0
       103: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       106: getstatic     #308                // Field ext/mods/gameserver/network/SystemMessageId.NOT_ENOUGH_HP:Lext/mods/gameserver/network/SystemMessageId;
       109: invokestatic  #44                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       112: invokevirtual #50                 // Method ext/mods/gameserver/model/actor/Creature.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       115: iconst_0
       116: ireturn
       117: iconst_1
       118: ireturn
      LineNumberTable:
        line 365: 0
        line 366: 8
        line 367: 10
        line 368: 22
        line 369: 35
        line 371: 62
        line 372: 75
        line 374: 77
        line 376: 102
        line 377: 115
        line 379: 117
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     119     0  this   Lext/mods/gameserver/model/actor/cast/CreatureCast;
            0     119     1 target   Lext/mods/gameserver/model/actor/Creature;
            0     119     2 skill   Lext/mods/gameserver/skills/L2Skill;
           22      97     3 initialMpConsume   I
           35      84     4 mpConsume   I
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0     119     0  this   Lext/mods/gameserver/model/actor/cast/CreatureCast<TT;>;
      StackMapTable: number_of_entries = 5
        frame_type = 8 /* same */
        frame_type = 1 /* same */
        frame_type = 253 /* append */
          offset_delta = 33
          locals = [ int, int ]
        frame_type = 32 /* same */
        frame_type = 39 /* same */

  public boolean meetsHpMpDisabledConditions(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: aload_2
         3: invokevirtual #413                // Method meetsHpMpConditions:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
         6: ifne          11
         9: iconst_0
        10: ireturn
        11: aload_2
        12: invokevirtual #416                // Method ext/mods/gameserver/skills/L2Skill.isMagic2:()Z
        15: ifne          54
        18: aload_2
        19: invokevirtual #98                 // Method ext/mods/gameserver/skills/L2Skill.isMagic:()Z
        22: ifeq          35
        25: aload_0
        26: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        29: invokevirtual #419                // Method ext/mods/gameserver/model/actor/Creature.isMuted:()Z
        32: ifne          52
        35: aload_2
        36: invokevirtual #98                 // Method ext/mods/gameserver/skills/L2Skill.isMagic:()Z
        39: ifne          54
        42: aload_0
        43: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        46: invokevirtual #422                // Method ext/mods/gameserver/model/actor/Creature.isPhysicalMuted:()Z
        49: ifeq          54
        52: iconst_0
        53: ireturn
        54: iconst_1
        55: ireturn
      LineNumberTable:
        line 384: 0
        line 385: 9
        line 386: 11
        line 387: 52
        line 388: 54
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      56     0  this   Lext/mods/gameserver/model/actor/cast/CreatureCast;
            0      56     1 target   Lext/mods/gameserver/model/actor/Creature;
            0      56     2 skill   Lext/mods/gameserver/skills/L2Skill;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      56     0  this   Lext/mods/gameserver/model/actor/cast/CreatureCast<TT;>;
      StackMapTable: number_of_entries = 4
        frame_type = 11 /* same */
        frame_type = 23 /* same */
        frame_type = 16 /* same */
        frame_type = 1 /* same */

  public boolean canCast(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill, boolean, int);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZI)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=9, args_size=5
         0: aload_0
         1: aload_1
         2: aload_2
         3: invokevirtual #425                // Method meetsHpMpDisabledConditions:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
         6: ifne          11
         9: iconst_0
        10: ireturn
        11: aload_2
        12: invokevirtual #258                // Method ext/mods/gameserver/skills/L2Skill.isOffensive:()Z
        15: ifeq          141
        18: aload_1
        19: aload_0
        20: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        23: if_acmpeq     141
        26: aload_2
        27: invokevirtual #235                // Method ext/mods/gameserver/skills/L2Skill.getCastRange:()I
        30: ifle          141
        33: aload_2
        34: invokevirtual #235                // Method ext/mods/gameserver/skills/L2Skill.getCastRange:()I
        37: istore        5
        39: iload         5
        41: i2d
        42: aload_0
        43: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        46: invokevirtual #428                // Method ext/mods/gameserver/model/actor/Creature.getCollisionRadius:()D
        49: dadd
        50: aload_1
        51: invokevirtual #428                // Method ext/mods/gameserver/model/actor/Creature.getCollisionRadius:()D
        54: dadd
        55: d2i
        56: istore        6
        58: aload_0
        59: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        62: aload_1
        63: iload         6
        65: invokevirtual #251                // Method ext/mods/gameserver/model/actor/Creature.isInStrictRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
        68: ifne          86
        71: aload_0
        72: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        75: getstatic     #431                // Field ext/mods/gameserver/network/SystemMessageId.TARGET_TOO_FAR:Lext/mods/gameserver/network/SystemMessageId;
        78: invokestatic  #44                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        81: invokevirtual #50                 // Method ext/mods/gameserver/model/actor/Creature.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        84: iconst_0
        85: ireturn
        86: aload_0
        87: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        90: aload_1
        91: invokevirtual #261                // Method ext/mods/gameserver/model/actor/Creature.distance2D:(Lext/mods/gameserver/model/WorldObject;)D
        94: dstore        7
        96: iload         5
        98: sipush        300
       101: if_icmpge     113
       104: dload         7
       106: ldc2_w        #265                // double 400.0d
       109: dcmpl
       110: ifle          141
       113: aload_0
       114: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       117: aload_1
       118: iload         5
       120: invokestatic  #434                // Method ext/mods/gameserver/model/actor/move/MovementIntegration.canCastOnTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;I)Z
       123: ifne          141
       126: aload_0
       127: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       130: getstatic     #273                // Field ext/mods/gameserver/network/SystemMessageId.CANT_SEE_TARGET:Lext/mods/gameserver/network/SystemMessageId;
       133: invokestatic  #44                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       136: invokevirtual #50                 // Method ext/mods/gameserver/model/actor/Creature.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       139: iconst_0
       140: ireturn
       141: aload_2
       142: aload_0
       143: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       146: invokevirtual #438                // Method ext/mods/gameserver/skills/L2Skill.getWeaponDependancy:(Lext/mods/gameserver/model/actor/Creature;)Z
       149: ireturn
      LineNumberTable:
        line 393: 0
        line 394: 9
        line 395: 11
        line 397: 33
        line 398: 39
        line 399: 58
        line 401: 71
        line 402: 84
        line 404: 86
        line 405: 96
        line 407: 113
        line 409: 126
        line 410: 139
        line 414: 141
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           39     102     5 skillRange   I
           58      83     6 totalRange   I
           96      45     7 distance   D
            0     150     0  this   Lext/mods/gameserver/model/actor/cast/CreatureCast;
            0     150     1 target   Lext/mods/gameserver/model/actor/Creature;
            0     150     2 skill   Lext/mods/gameserver/skills/L2Skill;
            0     150     3 isCtrlPressed   Z
            0     150     4 itemObjectId   I
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0     150     0  this   Lext/mods/gameserver/model/actor/cast/CreatureCast<TT;>;
      StackMapTable: number_of_entries = 4
        frame_type = 11 /* same */
        frame_type = 253 /* append */
          offset_delta = 74
          locals = [ int, int ]
        frame_type = 252 /* append */
          offset_delta = 26
          locals = [ double ]
        frame_type = 248 /* chop */
          offset_delta = 27
}
Signature: #508                         // <T:Lext/mods/gameserver/model/actor/Creature;>Ljava/lang/Object;
SourceFile: "CreatureCast.java"
BootstrapMethods:
  0: #522 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #512 ()V
      #513 REF_invokeVirtual ext/mods/gameserver/model/actor/cast/CreatureCast.onMagicLaunch:()V
      #512 ()V
  1: #522 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #512 ()V
      #516 REF_invokeVirtual ext/mods/gameserver/model/actor/cast/CreatureCast.onMagicHitTimer:()V
      #512 ()V
  2: #522 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #512 ()V
      #519 REF_invokeVirtual ext/mods/gameserver/model/actor/cast/CreatureCast.onMagicFinalizer:()V
      #512 ()V
InnerClasses:
  public static final #534= #530 of #532; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
