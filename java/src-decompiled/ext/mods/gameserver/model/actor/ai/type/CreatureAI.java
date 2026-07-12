// Bytecode for: ext.mods.gameserver.model.actor.ai.type.CreatureAI
// File: ext\mods\gameserver\model\actor\ai\type\CreatureAI.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/ai/type/CreatureAI.class
  Last modified 9 de jul de 2026; size 11592 bytes
  MD5 checksum cda88535879737d5606282039b779f4f
  Compiled from "CreatureAI.java"
public class ext.mods.gameserver.model.actor.ai.type.CreatureAI<T extends ext.mods.gameserver.model.actor.Creature> extends ext.mods.gameserver.model.actor.ai.type.AbstractAI<T>
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/actor/ai/type/CreatureAI
  super_class: #2                         // ext/mods/gameserver/model/actor/ai/type/AbstractAI
  interfaces: 0, fields: 0, methods: 37, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/actor/ai/type/AbstractAI."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
    #2 = Class              #4            // ext/mods/gameserver/model/actor/ai/type/AbstractAI
    #3 = NameAndType        #5:#6         // "<init>":(Lext/mods/gameserver/model/actor/Creature;)V
    #4 = Utf8               ext/mods/gameserver/model/actor/ai/type/AbstractAI
    #5 = Utf8               <init>
    #6 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/actor/ai/type/CreatureAI._actor:Lext/mods/gameserver/model/actor/Creature;
    #8 = Class              #10           // ext/mods/gameserver/model/actor/ai/type/CreatureAI
    #9 = NameAndType        #11:#12       // _actor:Lext/mods/gameserver/model/actor/Creature;
   #10 = Utf8               ext/mods/gameserver/model/actor/ai/type/CreatureAI
   #11 = Utf8               _actor
   #12 = Utf8               Lext/mods/gameserver/model/actor/Creature;
   #13 = Class              #14           // ext/mods/gameserver/model/actor/Npc
   #14 = Utf8               ext/mods/gameserver/model/actor/Npc
   #15 = Fieldref           #8.#16        // ext/mods/gameserver/model/actor/ai/type/CreatureAI._currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
   #16 = NameAndType        #17:#18       // _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
   #17 = Utf8               _currentIntention
   #18 = Utf8               Lext/mods/gameserver/model/actor/ai/Intention;
   #19 = Methodref          #20.#21       // ext/mods/gameserver/model/actor/ai/Intention.getFinalTarget:()Lext/mods/gameserver/model/actor/Creature;
   #20 = Class              #22           // ext/mods/gameserver/model/actor/ai/Intention
   #21 = NameAndType        #23:#24       // getFinalTarget:()Lext/mods/gameserver/model/actor/Creature;
   #22 = Utf8               ext/mods/gameserver/model/actor/ai/Intention
   #23 = Utf8               getFinalTarget
   #24 = Utf8               ()Lext/mods/gameserver/model/actor/Creature;
   #25 = Methodref          #20.#26       // ext/mods/gameserver/model/actor/ai/Intention.getType:()Lext/mods/gameserver/enums/IntentionType;
   #26 = NameAndType        #27:#28       // getType:()Lext/mods/gameserver/enums/IntentionType;
   #27 = Utf8               getType
   #28 = Utf8               ()Lext/mods/gameserver/enums/IntentionType;
   #29 = Fieldref           #30.#31       // ext/mods/gameserver/enums/IntentionType.ATTACK:Lext/mods/gameserver/enums/IntentionType;
   #30 = Class              #32           // ext/mods/gameserver/enums/IntentionType
   #31 = NameAndType        #33:#34       // ATTACK:Lext/mods/gameserver/enums/IntentionType;
   #32 = Utf8               ext/mods/gameserver/enums/IntentionType
   #33 = Utf8               ATTACK
   #34 = Utf8               Lext/mods/gameserver/enums/IntentionType;
   #35 = Methodref          #36.#37       // ext/mods/gameserver/model/actor/Creature.isAlikeDead:()Z
   #36 = Class              #38           // ext/mods/gameserver/model/actor/Creature
   #37 = NameAndType        #39:#40       // isAlikeDead:()Z
   #38 = Utf8               ext/mods/gameserver/model/actor/Creature
   #39 = Utf8               isAlikeDead
   #40 = Utf8               ()Z
   #41 = Methodref          #13.#42       // ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #42 = NameAndType        #43:#44       // getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #43 = Utf8               getTemplate
   #44 = Utf8               ()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #45 = Methodref          #46.#47       // ext/mods/gameserver/model/actor/template/NpcTemplate.getAggroRange:()I
   #46 = Class              #48           // ext/mods/gameserver/model/actor/template/NpcTemplate
   #47 = NameAndType        #49:#50       // getAggroRange:()I
   #48 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
   #49 = Utf8               getAggroRange
   #50 = Utf8               ()I
   #51 = Methodref          #13.#52       // ext/mods/gameserver/model/actor/Npc.getSeeRange:()I
   #52 = NameAndType        #53:#50       // getSeeRange:()I
   #53 = Utf8               getSeeRange
   #54 = Methodref          #13.#55       // ext/mods/gameserver/model/actor/Npc.isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
   #55 = NameAndType        #56:#57       // isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
   #56 = Utf8               isIn3DRadius
   #57 = Utf8               (Lext/mods/gameserver/model/WorldObject;I)Z
   #58 = Methodref          #13.#59       // ext/mods/gameserver/model/actor/Npc.knows:(Lext/mods/gameserver/model/WorldObject;)Z
   #59 = NameAndType        #60:#61       // knows:(Lext/mods/gameserver/model/WorldObject;)Z
   #60 = Utf8               knows
   #61 = Utf8               (Lext/mods/gameserver/model/WorldObject;)Z
   #62 = Methodref          #13.#63       // ext/mods/gameserver/model/actor/Npc.refreshKnownlist:()V
   #63 = NameAndType        #64:#65       // refreshKnownlist:()V
   #64 = Utf8               refreshKnownlist
   #65 = Utf8               ()V
   #66 = InvokeDynamic      #0:#67        // #0:run:(Lext/mods/gameserver/model/actor/ai/type/CreatureAI;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Npc;I)Ljava/lang/Runnable;
   #67 = NameAndType        #68:#69       // run:(Lext/mods/gameserver/model/actor/ai/type/CreatureAI;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Npc;I)Ljava/lang/Runnable;
   #68 = Utf8               run
   #69 = Utf8               (Lext/mods/gameserver/model/actor/ai/type/CreatureAI;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Npc;I)Ljava/lang/Runnable;
   #70 = Long               100l
   #72 = Methodref          #73.#74       // ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #73 = Class              #75           // ext/mods/commons/pool/ThreadPool
   #74 = NameAndType        #76:#77       // schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #75 = Utf8               ext/mods/commons/pool/ThreadPool
   #76 = Utf8               schedule
   #77 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #78 = Fieldref           #8.#79        // ext/mods/gameserver/model/actor/ai/type/CreatureAI._nextIntention:Lext/mods/gameserver/model/actor/ai/Intention;
   #79 = NameAndType        #80:#18       // _nextIntention:Lext/mods/gameserver/model/actor/ai/Intention;
   #80 = Utf8               _nextIntention
   #81 = Methodref          #20.#82       // ext/mods/gameserver/model/actor/ai/Intention.isBlank:()Z
   #82 = NameAndType        #83:#40       // isBlank:()Z
   #83 = Utf8               isBlank
   #84 = Fieldref           #85.#86       // ext/mods/gameserver/enums/AiEventType.THINK:Lext/mods/gameserver/enums/AiEventType;
   #85 = Class              #87           // ext/mods/gameserver/enums/AiEventType
   #86 = NameAndType        #88:#89       // THINK:Lext/mods/gameserver/enums/AiEventType;
   #87 = Utf8               ext/mods/gameserver/enums/AiEventType
   #88 = Utf8               THINK
   #89 = Utf8               Lext/mods/gameserver/enums/AiEventType;
   #90 = Methodref          #8.#91        // ext/mods/gameserver/model/actor/ai/type/CreatureAI.notifyEvent:(Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
   #91 = NameAndType        #92:#93       // notifyEvent:(Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
   #92 = Utf8               notifyEvent
   #93 = Utf8               (Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
   #94 = Methodref          #8.#95        // ext/mods/gameserver/model/actor/ai/type/CreatureAI.doIntention:(Lext/mods/gameserver/model/actor/ai/Intention;)V
   #95 = NameAndType        #96:#97       // doIntention:(Lext/mods/gameserver/model/actor/ai/Intention;)V
   #96 = Utf8               doIntention
   #97 = Utf8               (Lext/mods/gameserver/model/actor/ai/Intention;)V
   #98 = Methodref          #8.#99        // ext/mods/gameserver/model/actor/ai/type/CreatureAI.doIdleIntention:()V
   #99 = NameAndType        #100:#65      // doIdleIntention:()V
  #100 = Utf8               doIdleIntention
  #101 = Fieldref           #30.#102      // ext/mods/gameserver/enums/IntentionType.FOLLOW:Lext/mods/gameserver/enums/IntentionType;
  #102 = NameAndType        #103:#34      // FOLLOW:Lext/mods/gameserver/enums/IntentionType;
  #103 = Utf8               FOLLOW
  #104 = Fieldref           #30.#105      // ext/mods/gameserver/enums/IntentionType.MOVE_TO:Lext/mods/gameserver/enums/IntentionType;
  #105 = NameAndType        #106:#34      // MOVE_TO:Lext/mods/gameserver/enums/IntentionType;
  #106 = Utf8               MOVE_TO
  #107 = Class              #108          // ext/mods/gameserver/network/serverpackets/MoveToLocation
  #108 = Utf8               ext/mods/gameserver/network/serverpackets/MoveToLocation
  #109 = Methodref          #36.#110      // ext/mods/gameserver/model/actor/Creature.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #110 = NameAndType        #111:#112     // getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #111 = Utf8               getPosition
  #112 = Utf8               ()Lext/mods/gameserver/model/location/SpawnLocation;
  #113 = Methodref          #107.#114     // ext/mods/gameserver/network/serverpackets/MoveToLocation."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/location/Location;)V
  #114 = NameAndType        #5:#115       // "<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/location/Location;)V
  #115 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/location/Location;)V
  #116 = Methodref          #36.#117      // ext/mods/gameserver/model/actor/Creature.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #117 = NameAndType        #118:#119     // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #118 = Utf8               broadcastPacket
  #119 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #120 = Methodref          #8.#121       // ext/mods/gameserver/model/actor/ai/type/CreatureAI.stopAITask:()V
  #121 = NameAndType        #122:#65      // stopAITask:()V
  #122 = Utf8               stopAITask
  #123 = Class              #124          // ext/mods/gameserver/network/serverpackets/Die
  #124 = Utf8               ext/mods/gameserver/network/serverpackets/Die
  #125 = Methodref          #123.#3       // ext/mods/gameserver/network/serverpackets/Die."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
  #126 = Methodref          #8.#127       // ext/mods/gameserver/model/actor/ai/type/CreatureAI.stopAttackStance:()V
  #127 = NameAndType        #128:#65      // stopAttackStance:()V
  #128 = Utf8               stopAttackStance
  #129 = Methodref          #36.#130      // ext/mods/gameserver/model/actor/Creature.denyAiAction:()Z
  #130 = NameAndType        #131:#40      // denyAiAction:()Z
  #131 = Utf8               denyAiAction
  #132 = Methodref          #36.#59       // ext/mods/gameserver/model/actor/Creature.knows:(Lext/mods/gameserver/model/WorldObject;)Z
  #133 = Methodref          #36.#134      // ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
  #134 = NameAndType        #135:#136     // getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
  #135 = Utf8               getStatus
  #136 = Utf8               ()Lext/mods/gameserver/model/actor/status/CreatureStatus;
  #137 = Methodref          #138.#139     // ext/mods/gameserver/model/actor/status/CreatureStatus.getPhysicalAttackRange:()I
  #138 = Class              #140          // ext/mods/gameserver/model/actor/status/CreatureStatus
  #139 = NameAndType        #141:#50      // getPhysicalAttackRange:()I
  #140 = Utf8               ext/mods/gameserver/model/actor/status/CreatureStatus
  #141 = Utf8               getPhysicalAttackRange
  #142 = Methodref          #36.#143      // ext/mods/gameserver/model/actor/Creature.getCollisionRadius:()D
  #143 = NameAndType        #144:#145     // getCollisionRadius:()D
  #144 = Utf8               getCollisionRadius
  #145 = Utf8               ()D
  #146 = Methodref          #36.#147      // ext/mods/gameserver/model/actor/Creature.distance3D:(Lext/mods/gameserver/model/WorldObject;)D
  #147 = NameAndType        #148:#149     // distance3D:(Lext/mods/gameserver/model/WorldObject;)D
  #148 = Utf8               distance3D
  #149 = Utf8               (Lext/mods/gameserver/model/WorldObject;)D
  #150 = Methodref          #36.#151      // ext/mods/gameserver/model/actor/Creature.getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
  #151 = NameAndType        #152:#153     // getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
  #152 = Utf8               getMove
  #153 = Utf8               ()Lext/mods/gameserver/model/actor/move/CreatureMove;
  #154 = Methodref          #155.#156     // ext/mods/gameserver/model/actor/move/CreatureMove.maybeStartOffensiveFollow:(Lext/mods/gameserver/model/actor/Creature;I)Z
  #155 = Class              #157          // ext/mods/gameserver/model/actor/move/CreatureMove
  #156 = NameAndType        #158:#159     // maybeStartOffensiveFollow:(Lext/mods/gameserver/model/actor/Creature;I)Z
  #157 = Utf8               ext/mods/gameserver/model/actor/move/CreatureMove
  #158 = Utf8               maybeStartOffensiveFollow
  #159 = Utf8               (Lext/mods/gameserver/model/actor/Creature;I)Z
  #160 = Methodref          #36.#161      // ext/mods/gameserver/model/actor/Creature.getAttack:()Lext/mods/gameserver/model/actor/attack/CreatureAttack;
  #161 = NameAndType        #162:#163     // getAttack:()Lext/mods/gameserver/model/actor/attack/CreatureAttack;
  #162 = Utf8               getAttack
  #163 = Utf8               ()Lext/mods/gameserver/model/actor/attack/CreatureAttack;
  #164 = Methodref          #165.#166     // ext/mods/gameserver/model/actor/attack/CreatureAttack.isAttackingNow:()Z
  #165 = Class              #167          // ext/mods/gameserver/model/actor/attack/CreatureAttack
  #166 = NameAndType        #168:#40      // isAttackingNow:()Z
  #167 = Utf8               ext/mods/gameserver/model/actor/attack/CreatureAttack
  #168 = Utf8               isAttackingNow
  #169 = Methodref          #165.#170     // ext/mods/gameserver/model/actor/attack/CreatureAttack.isBowCoolingDown:()Z
  #170 = NameAndType        #171:#40      // isBowCoolingDown:()Z
  #171 = Utf8               isBowCoolingDown
  #172 = Methodref          #165.#173     // ext/mods/gameserver/model/actor/attack/CreatureAttack.canAttack:(Lext/mods/gameserver/model/actor/Creature;)Z
  #173 = NameAndType        #174:#175     // canAttack:(Lext/mods/gameserver/model/actor/Creature;)Z
  #174 = Utf8               canAttack
  #175 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
  #176 = Methodref          #155.#177     // ext/mods/gameserver/model/actor/move/CreatureMove.startOffensiveFollow:(Lext/mods/gameserver/model/actor/Creature;I)V
  #177 = NameAndType        #178:#179     // startOffensiveFollow:(Lext/mods/gameserver/model/actor/Creature;I)V
  #178 = Utf8               startOffensiveFollow
  #179 = Utf8               (Lext/mods/gameserver/model/actor/Creature;I)V
  #180 = Methodref          #36.#181      // ext/mods/gameserver/model/actor/Creature.isMoving:()Z
  #181 = NameAndType        #182:#40      // isMoving:()Z
  #182 = Utf8               isMoving
  #183 = Methodref          #155.#184     // ext/mods/gameserver/model/actor/move/CreatureMove.stop:()V
  #184 = NameAndType        #185:#65      // stop:()V
  #185 = Utf8               stop
  #186 = Methodref          #187.#188     // ext/mods/gameserver/model/location/SpawnLocation.setHeadingTo:(Lext/mods/gameserver/model/WorldObject;)V
  #187 = Class              #189          // ext/mods/gameserver/model/location/SpawnLocation
  #188 = NameAndType        #190:#191     // setHeadingTo:(Lext/mods/gameserver/model/WorldObject;)V
  #189 = Utf8               ext/mods/gameserver/model/location/SpawnLocation
  #190 = Utf8               setHeadingTo
  #191 = Utf8               (Lext/mods/gameserver/model/WorldObject;)V
  #192 = Methodref          #36.#193      // ext/mods/gameserver/model/actor/Creature.rechargeShots:(ZZ)V
  #193 = NameAndType        #194:#195     // rechargeShots:(ZZ)V
  #194 = Utf8               rechargeShots
  #195 = Utf8               (ZZ)V
  #196 = Methodref          #165.#197     // ext/mods/gameserver/model/actor/attack/CreatureAttack.doAttack:(Lext/mods/gameserver/model/actor/Creature;)V
  #197 = NameAndType        #198:#6       // doAttack:(Lext/mods/gameserver/model/actor/Creature;)V
  #198 = Utf8               doAttack
  #199 = Methodref          #36.#200      // ext/mods/gameserver/model/actor/Creature.getAllSkillsDisabled:()Z
  #200 = NameAndType        #201:#40      // getAllSkillsDisabled:()Z
  #201 = Utf8               getAllSkillsDisabled
  #202 = Methodref          #36.#203      // ext/mods/gameserver/model/actor/Creature.getCast:()Lext/mods/gameserver/model/actor/cast/CreatureCast;
  #203 = NameAndType        #204:#205     // getCast:()Lext/mods/gameserver/model/actor/cast/CreatureCast;
  #204 = Utf8               getCast
  #205 = Utf8               ()Lext/mods/gameserver/model/actor/cast/CreatureCast;
  #206 = Methodref          #207.#208     // ext/mods/gameserver/model/actor/cast/CreatureCast.isCastingNow:()Z
  #207 = Class              #209          // ext/mods/gameserver/model/actor/cast/CreatureCast
  #208 = NameAndType        #210:#40      // isCastingNow:()Z
  #209 = Utf8               ext/mods/gameserver/model/actor/cast/CreatureCast
  #210 = Utf8               isCastingNow
  #211 = Methodref          #20.#212      // ext/mods/gameserver/model/actor/ai/Intention.getSkill:()Lext/mods/gameserver/skills/L2Skill;
  #212 = NameAndType        #213:#214     // getSkill:()Lext/mods/gameserver/skills/L2Skill;
  #213 = Utf8               getSkill
  #214 = Utf8               ()Lext/mods/gameserver/skills/L2Skill;
  #215 = Methodref          #8.#216       // ext/mods/gameserver/model/actor/ai/type/CreatureAI.isTargetLost:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/skills/L2Skill;)Z
  #216 = NameAndType        #217:#218     // isTargetLost:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/skills/L2Skill;)Z
  #217 = Utf8               isTargetLost
  #218 = Utf8               (Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/skills/L2Skill;)Z
  #219 = Methodref          #207.#220     // ext/mods/gameserver/model/actor/cast/CreatureCast.canAttemptCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
  #220 = NameAndType        #221:#222     // canAttemptCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
  #221 = Utf8               canAttemptCast
  #222 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
  #223 = Methodref          #224.#225     // ext/mods/gameserver/skills/L2Skill.getCastRange:()I
  #224 = Class              #226          // ext/mods/gameserver/skills/L2Skill
  #225 = NameAndType        #227:#50      // getCastRange:()I
  #226 = Utf8               ext/mods/gameserver/skills/L2Skill
  #227 = Utf8               getCastRange
  #228 = Methodref          #36.#229      // ext/mods/gameserver/model/actor/Creature.setWalkOrRun:(Z)V
  #229 = NameAndType        #230:#231     // setWalkOrRun:(Z)V
  #230 = Utf8               setWalkOrRun
  #231 = Utf8               (Z)V
  #232 = Methodref          #224.#233     // ext/mods/gameserver/skills/L2Skill.getHitTime:()I
  #233 = NameAndType        #234:#50      // getHitTime:()I
  #234 = Utf8               getHitTime
  #235 = Methodref          #20.#236      // ext/mods/gameserver/model/actor/ai/Intention.isCtrlPressed:()Z
  #236 = NameAndType        #237:#40      // isCtrlPressed:()Z
  #237 = Utf8               isCtrlPressed
  #238 = Methodref          #20.#239      // ext/mods/gameserver/model/actor/ai/Intention.getItemObjectId:()I
  #239 = NameAndType        #240:#50      // getItemObjectId:()I
  #240 = Utf8               getItemObjectId
  #241 = Methodref          #207.#242     // ext/mods/gameserver/model/actor/cast/CreatureCast.canCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZI)Z
  #242 = NameAndType        #243:#244     // canCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZI)Z
  #243 = Utf8               canCast
  #244 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZI)Z
  #245 = Methodref          #224.#246     // ext/mods/gameserver/skills/L2Skill.isToggle:()Z
  #246 = NameAndType        #247:#40      // isToggle:()Z
  #247 = Utf8               isToggle
  #248 = Methodref          #20.#249      // ext/mods/gameserver/model/actor/ai/Intention.canMoveToTarget:()Z
  #249 = NameAndType        #250:#40      // canMoveToTarget:()Z
  #250 = Utf8               canMoveToTarget
  #251 = Class              #252          // ext/mods/gameserver/network/serverpackets/MoveToPawn
  #252 = Utf8               ext/mods/gameserver/network/serverpackets/MoveToPawn
  #253 = Methodref          #251.#254     // ext/mods/gameserver/network/serverpackets/MoveToPawn."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/WorldObject;I)V
  #254 = NameAndType        #5:#255       // "<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/WorldObject;I)V
  #255 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/WorldObject;I)V
  #256 = Methodref          #207.#257     // ext/mods/gameserver/model/actor/cast/CreatureCast.doCast:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #257 = NameAndType        #258:#259     // doCast:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #258 = Utf8               doCast
  #259 = Utf8               (Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #260 = Methodref          #36.#261      // ext/mods/gameserver/model/actor/Creature.isMovementDisabled:()Z
  #261 = NameAndType        #262:#40      // isMovementDisabled:()Z
  #262 = Utf8               isMovementDisabled
  #263 = Methodref          #20.#264      // ext/mods/gameserver/model/actor/ai/Intention.getLoc:()Lext/mods/gameserver/model/location/Location;
  #264 = NameAndType        #265:#266     // getLoc:()Lext/mods/gameserver/model/location/Location;
  #265 = Utf8               getLoc
  #266 = Utf8               ()Lext/mods/gameserver/model/location/Location;
  #267 = Methodref          #36.#268      // ext/mods/gameserver/model/actor/Creature.distance2D:(Lext/mods/gameserver/model/location/Location;)D
  #268 = NameAndType        #269:#270     // distance2D:(Lext/mods/gameserver/model/location/Location;)D
  #269 = Utf8               distance2D
  #270 = Utf8               (Lext/mods/gameserver/model/location/Location;)D
  #271 = Methodref          #36.#272      // ext/mods/gameserver/model/actor/Creature.fleeFrom:(Lext/mods/gameserver/model/actor/Creature;I)V
  #272 = NameAndType        #273:#179     // fleeFrom:(Lext/mods/gameserver/model/actor/Creature;I)V
  #273 = Utf8               fleeFrom
  #274 = Methodref          #20.#275      // ext/mods/gameserver/model/actor/ai/Intention.isShiftPressed:()Z
  #275 = NameAndType        #276:#40      // isShiftPressed:()Z
  #276 = Utf8               isShiftPressed
  #277 = Methodref          #155.#278     // ext/mods/gameserver/model/actor/move/CreatureMove.maybeStartFriendlyFollow:(Lext/mods/gameserver/model/actor/Creature;I)Z
  #278 = NameAndType        #279:#159     // maybeStartFriendlyFollow:(Lext/mods/gameserver/model/actor/Creature;I)Z
  #279 = Utf8               maybeStartFriendlyFollow
  #280 = Methodref          #155.#281     // ext/mods/gameserver/model/actor/move/CreatureMove.maybeMoveToLocation:(Lext/mods/gameserver/model/location/Location;IZZ)Z
  #281 = NameAndType        #282:#283     // maybeMoveToLocation:(Lext/mods/gameserver/model/location/Location;IZZ)Z
  #282 = Utf8               maybeMoveToLocation
  #283 = Utf8               (Lext/mods/gameserver/model/location/Location;IZZ)Z
  #284 = Class              #285          // ext/mods/gameserver/network/serverpackets/SocialAction
  #285 = Utf8               ext/mods/gameserver/network/serverpackets/SocialAction
  #286 = Methodref          #284.#287     // ext/mods/gameserver/network/serverpackets/SocialAction."<init>":(Lext/mods/gameserver/model/actor/Creature;I)V
  #287 = NameAndType        #5:#179       // "<init>":(Lext/mods/gameserver/model/actor/Creature;I)V
  #288 = Methodref          #8.#289       // ext/mods/gameserver/model/actor/ai/type/CreatureAI.startAttackStance:()V
  #289 = NameAndType        #290:#65      // startAttackStance:()V
  #290 = Utf8               startAttackStance
  #291 = Utf8               Code
  #292 = Utf8               LineNumberTable
  #293 = Utf8               LocalVariableTable
  #294 = Utf8               this
  #295 = Utf8               Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
  #296 = Utf8               actor
  #297 = Utf8               LocalVariableTypeTable
  #298 = Utf8               Lext/mods/gameserver/model/actor/ai/type/CreatureAI<TT;>;
  #299 = Utf8               TT;
  #300 = Utf8               Signature
  #301 = Utf8               (TT;)V
  #302 = Utf8               onEvtFinishedAttack
  #303 = Utf8               aggroRange
  #304 = Utf8               I
  #305 = Utf8               target
  #306 = Utf8               npc
  #307 = Utf8               Lext/mods/gameserver/model/actor/Npc;
  #308 = Utf8               StackMapTable
  #309 = Utf8               onEvtFinishedAttackBow
  #310 = Utf8               onEvtBowAttackReuse
  #311 = Utf8               onEvtFinishedCasting
  #312 = Utf8               onEvtArrived
  #313 = Utf8               onEvtArrivedBlocked
  #314 = Utf8               onEvtDead
  #315 = Utf8               onEvtTeleported
  #316 = Utf8               thinkAttack
  #317 = Utf8               attackRange
  #318 = Utf8               totalRange
  #319 = Utf8               dist
  #320 = Utf8               D
  #321 = Utf8               thinkCast
  #322 = Utf8               skill
  #323 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #324 = Utf8               thinkFakeDeath
  #325 = Utf8               thinkFlee
  #326 = Utf8               distance
  #327 = Utf8               passedDistance
  #328 = Utf8               thinkFollow
  #329 = Utf8               Z
  #330 = Utf8               thinkIdle
  #331 = Utf8               thinkInteract
  #332 = Utf8               thinkMoveRoute
  #333 = Utf8               thinkMoveTo
  #334 = Utf8               thinkNothing
  #335 = Utf8               thinkPickUp
  #336 = Utf8               ()Lext/mods/gameserver/model/item/instance/ItemInstance;
  #337 = Utf8               thinkSit
  #338 = Utf8               thinkSocial
  #339 = Utf8               thinkStand
  #340 = Utf8               thinkUseItem
  #341 = Utf8               thinkWander
  #342 = Utf8               onEvtSatDown
  #343 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #344 = Utf8               onEvtStoodUp
  #345 = Utf8               onEvtAttacked
  #346 = Utf8               attacker
  #347 = Utf8               onEvtAggression
  #348 = Utf8               aggro
  #349 = Utf8               onEvtEvaded
  #350 = Utf8               onEvtOwnerAttacked
  #351 = Utf8               onEvtCancel
  #352 = Utf8               getFollowStatus
  #353 = Utf8               setFollowStatus
  #354 = Utf8               followStatus
  #355 = Utf8               canDoInteract
  #356 = Utf8               canAttemptInteract
  #357 = Utf8               lambda$onEvtFinishedAttack$0
  #358 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Npc;I)V
  #359 = Utf8               <T:Lext/mods/gameserver/model/actor/Creature;>Lext/mods/gameserver/model/actor/ai/type/AbstractAI<TT;>;
  #360 = Utf8               SourceFile
  #361 = Utf8               CreatureAI.java
  #362 = Utf8               BootstrapMethods
  #363 = MethodType         #65           //  ()V
  #364 = MethodHandle       5:#365        // REF_invokeVirtual ext/mods/gameserver/model/actor/ai/type/CreatureAI.lambda$onEvtFinishedAttack$0:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Npc;I)V
  #365 = Methodref          #8.#366       // ext/mods/gameserver/model/actor/ai/type/CreatureAI.lambda$onEvtFinishedAttack$0:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Npc;I)V
  #366 = NameAndType        #357:#358     // lambda$onEvtFinishedAttack$0:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Npc;I)V
  #367 = MethodHandle       6:#368        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #368 = Methodref          #369.#370     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #369 = Class              #371          // java/lang/invoke/LambdaMetafactory
  #370 = NameAndType        #372:#373     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #371 = Utf8               java/lang/invoke/LambdaMetafactory
  #372 = Utf8               metafactory
  #373 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #374 = Utf8               InnerClasses
  #375 = Class              #376          // java/lang/invoke/MethodHandles$Lookup
  #376 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #377 = Class              #378          // java/lang/invoke/MethodHandles
  #378 = Utf8               java/lang/invoke/MethodHandles
  #379 = Utf8               Lookup
{
  public ext.mods.gameserver.model.actor.ai.type.CreatureAI(T);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #1                  // Method ext/mods/gameserver/model/actor/ai/type/AbstractAI."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
         5: return
      LineNumberTable:
        line 39: 0
        line 40: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
            0       6     1 actor   Lext/mods/gameserver/model/actor/Creature;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI<TT;>;
            0       6     1 actor   TT;
    Signature: #301                         // (TT;)V

  protected void onEvtFinishedAttack();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=4, locals=4, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: astore_2
         5: aload_2
         6: instanceof    #13                 // class ext/mods/gameserver/model/actor/Npc
         9: ifeq          115
        12: aload_2
        13: checkcast     #13                 // class ext/mods/gameserver/model/actor/Npc
        16: astore_1
        17: aload_0
        18: getfield      #15                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        21: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/ai/Intention.getFinalTarget:()Lext/mods/gameserver/model/actor/Creature;
        24: astore_2
        25: aload_0
        26: getfield      #15                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        29: invokevirtual #25                 // Method ext/mods/gameserver/model/actor/ai/Intention.getType:()Lext/mods/gameserver/enums/IntentionType;
        32: getstatic     #29                 // Field ext/mods/gameserver/enums/IntentionType.ATTACK:Lext/mods/gameserver/enums/IntentionType;
        35: if_acmpne     115
        38: aload_2
        39: ifnull        115
        42: aload_2
        43: invokevirtual #35                 // Method ext/mods/gameserver/model/actor/Creature.isAlikeDead:()Z
        46: ifne          115
        49: aload_1
        50: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
        53: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getAggroRange:()I
        56: ifle          69
        59: aload_1
        60: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
        63: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getAggroRange:()I
        66: goto          73
        69: aload_1
        70: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/Npc.getSeeRange:()I
        73: istore_3
        74: aload_1
        75: aload_2
        76: iload_3
        77: bipush        100
        79: iadd
        80: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/Npc.isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
        83: ifeq          115
        86: aload_1
        87: aload_2
        88: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Npc.knows:(Lext/mods/gameserver/model/WorldObject;)Z
        91: ifne          98
        94: aload_1
        95: invokevirtual #62                 // Method ext/mods/gameserver/model/actor/Npc.refreshKnownlist:()V
        98: aload_0
        99: aload_2
       100: aload_1
       101: iload_3
       102: invokedynamic #66,  0             // InvokeDynamic #0:run:(Lext/mods/gameserver/model/actor/ai/type/CreatureAI;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Npc;I)Ljava/lang/Runnable;
       107: ldc2_w        #70                 // long 100l
       110: invokestatic  #72                 // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
       113: pop
       114: return
       115: aload_0
       116: getfield      #78                 // Field _nextIntention:Lext/mods/gameserver/model/actor/ai/Intention;
       119: invokevirtual #81                 // Method ext/mods/gameserver/model/actor/ai/Intention.isBlank:()Z
       122: ifeq          137
       125: aload_0
       126: getstatic     #84                 // Field ext/mods/gameserver/enums/AiEventType.THINK:Lext/mods/gameserver/enums/AiEventType;
       129: aconst_null
       130: aconst_null
       131: invokevirtual #90                 // Method notifyEvent:(Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
       134: goto          145
       137: aload_0
       138: aload_0
       139: getfield      #78                 // Field _nextIntention:Lext/mods/gameserver/model/actor/ai/Intention;
       142: invokevirtual #94                 // Method doIntention:(Lext/mods/gameserver/model/actor/ai/Intention;)V
       145: return
      LineNumberTable:
        line 45: 0
        line 47: 17
        line 48: 25
        line 50: 49
        line 51: 74
        line 53: 86
        line 54: 94
        line 56: 98
        line 65: 114
        line 70: 115
        line 71: 125
        line 73: 137
        line 74: 145
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           74      41     3 aggroRange   I
           25      90     2 target   Lext/mods/gameserver/model/actor/Creature;
           17      98     1   npc   Lext/mods/gameserver/model/actor/Npc;
            0     146     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0     146     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI<TT;>;
      StackMapTable: number_of_entries = 6
        frame_type = 253 /* append */
          offset_delta = 69
          locals = [ class ext/mods/gameserver/model/actor/Npc, class ext/mods/gameserver/model/actor/Creature ]
        frame_type = 67 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 24
          locals = [ int ]
        frame_type = 248 /* chop */
          offset_delta = 16
        frame_type = 21 /* same */
        frame_type = 7 /* same */

  protected void onEvtFinishedAttackBow();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #78                 // Field _nextIntention:Lext/mods/gameserver/model/actor/ai/Intention;
         4: invokevirtual #81                 // Method ext/mods/gameserver/model/actor/ai/Intention.isBlank:()Z
         7: ifne          18
        10: aload_0
        11: aload_0
        12: getfield      #78                 // Field _nextIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        15: invokevirtual #94                 // Method doIntention:(Lext/mods/gameserver/model/actor/ai/Intention;)V
        18: return
      LineNumberTable:
        line 79: 0
        line 80: 10
        line 81: 18
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI<TT;>;
      StackMapTable: number_of_entries = 1
        frame_type = 18 /* same */

  protected void onEvtBowAttackReuse();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: getfield      #78                 // Field _nextIntention:Lext/mods/gameserver/model/actor/ai/Intention;
         4: invokevirtual #81                 // Method ext/mods/gameserver/model/actor/ai/Intention.isBlank:()Z
         7: ifeq          19
        10: aload_0
        11: getstatic     #84                 // Field ext/mods/gameserver/enums/AiEventType.THINK:Lext/mods/gameserver/enums/AiEventType;
        14: aconst_null
        15: aconst_null
        16: invokevirtual #90                 // Method notifyEvent:(Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
        19: return
      LineNumberTable:
        line 86: 0
        line 87: 10
        line 88: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI<TT;>;
      StackMapTable: number_of_entries = 1
        frame_type = 19 /* same */

  protected void onEvtFinishedCasting();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #78                 // Field _nextIntention:Lext/mods/gameserver/model/actor/ai/Intention;
         4: invokevirtual #81                 // Method ext/mods/gameserver/model/actor/ai/Intention.isBlank:()Z
         7: ifeq          17
        10: aload_0
        11: invokevirtual #98                 // Method doIdleIntention:()V
        14: goto          25
        17: aload_0
        18: aload_0
        19: getfield      #78                 // Field _nextIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        22: invokevirtual #94                 // Method doIntention:(Lext/mods/gameserver/model/actor/ai/Intention;)V
        25: return
      LineNumberTable:
        line 93: 0
        line 94: 10
        line 96: 17
        line 97: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI<TT;>;
      StackMapTable: number_of_entries = 2
        frame_type = 17 /* same */
        frame_type = 7 /* same */

  protected void onEvtArrived();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: getfield      #15                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
         4: invokevirtual #25                 // Method ext/mods/gameserver/model/actor/ai/Intention.getType:()Lext/mods/gameserver/enums/IntentionType;
         7: getstatic     #101                // Field ext/mods/gameserver/enums/IntentionType.FOLLOW:Lext/mods/gameserver/enums/IntentionType;
        10: if_acmpne     14
        13: return
        14: aload_0
        15: getfield      #78                 // Field _nextIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        18: invokevirtual #81                 // Method ext/mods/gameserver/model/actor/ai/Intention.isBlank:()Z
        21: ifeq          56
        24: aload_0
        25: getfield      #15                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        28: invokevirtual #25                 // Method ext/mods/gameserver/model/actor/ai/Intention.getType:()Lext/mods/gameserver/enums/IntentionType;
        31: getstatic     #104                // Field ext/mods/gameserver/enums/IntentionType.MOVE_TO:Lext/mods/gameserver/enums/IntentionType;
        34: if_acmpne     44
        37: aload_0
        38: invokevirtual #98                 // Method doIdleIntention:()V
        41: goto          64
        44: aload_0
        45: getstatic     #84                 // Field ext/mods/gameserver/enums/AiEventType.THINK:Lext/mods/gameserver/enums/AiEventType;
        48: aconst_null
        49: aconst_null
        50: invokevirtual #90                 // Method notifyEvent:(Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
        53: goto          64
        56: aload_0
        57: aload_0
        58: getfield      #78                 // Field _nextIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        61: invokevirtual #94                 // Method doIntention:(Lext/mods/gameserver/model/actor/ai/Intention;)V
        64: return
      LineNumberTable:
        line 102: 0
        line 103: 13
        line 105: 14
        line 107: 24
        line 108: 37
        line 110: 44
        line 113: 56
        line 114: 64
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      65     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      65     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI<TT;>;
      StackMapTable: number_of_entries = 4
        frame_type = 14 /* same */
        frame_type = 29 /* same */
        frame_type = 11 /* same */
        frame_type = 7 /* same */

  protected void onEvtArrivedBlocked();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=5, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: new           #107                // class ext/mods/gameserver/network/serverpackets/MoveToLocation
         7: dup
         8: aload_0
         9: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        12: aload_0
        13: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        16: invokevirtual #109                // Method ext/mods/gameserver/model/actor/Creature.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
        19: invokespecial #113                // Method ext/mods/gameserver/network/serverpackets/MoveToLocation."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/location/Location;)V
        22: invokevirtual #116                // Method ext/mods/gameserver/model/actor/Creature.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        25: return
      LineNumberTable:
        line 119: 0
        line 120: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI<TT;>;

  protected void onEvtDead();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #120                // Method stopAITask:()V
         4: aload_0
         5: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         8: new           #123                // class ext/mods/gameserver/network/serverpackets/Die
        11: dup
        12: aload_0
        13: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        16: invokespecial #125                // Method ext/mods/gameserver/network/serverpackets/Die."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
        19: invokevirtual #116                // Method ext/mods/gameserver/model/actor/Creature.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        22: aload_0
        23: invokevirtual #126                // Method stopAttackStance:()V
        26: aload_0
        27: invokevirtual #98                 // Method doIdleIntention:()V
        30: return
      LineNumberTable:
        line 125: 0
        line 127: 4
        line 129: 22
        line 131: 26
        line 132: 30
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      31     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI<TT;>;

  protected void onEvtTeleported();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #98                 // Method doIdleIntention:()V
         4: return
      LineNumberTable:
        line 137: 0
        line 138: 4
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI<TT;>;

  public void thinkAttack();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=6, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: invokevirtual #129                // Method ext/mods/gameserver/model/actor/Creature.denyAiAction:()Z
         7: ifeq          11
        10: return
        11: aload_0
        12: getfield      #15                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        15: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/ai/Intention.getFinalTarget:()Lext/mods/gameserver/model/actor/Creature;
        18: astore_1
        19: aload_1
        20: ifnull        41
        23: aload_1
        24: invokevirtual #35                 // Method ext/mods/gameserver/model/actor/Creature.isAlikeDead:()Z
        27: ifne          41
        30: aload_0
        31: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        34: aload_1
        35: invokevirtual #132                // Method ext/mods/gameserver/model/actor/Creature.knows:(Lext/mods/gameserver/model/WorldObject;)Z
        38: ifne          46
        41: aload_0
        42: invokevirtual #98                 // Method doIdleIntention:()V
        45: return
        46: aload_0
        47: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        50: invokevirtual #133                // Method ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
        53: invokevirtual #137                // Method ext/mods/gameserver/model/actor/status/CreatureStatus.getPhysicalAttackRange:()I
        56: istore_2
        57: iload_2
        58: i2d
        59: aload_0
        60: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        63: invokevirtual #142                // Method ext/mods/gameserver/model/actor/Creature.getCollisionRadius:()D
        66: dadd
        67: aload_1
        68: invokevirtual #142                // Method ext/mods/gameserver/model/actor/Creature.getCollisionRadius:()D
        71: dadd
        72: d2i
        73: istore_3
        74: aload_0
        75: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        78: aload_1
        79: invokevirtual #146                // Method ext/mods/gameserver/model/actor/Creature.distance3D:(Lext/mods/gameserver/model/WorldObject;)D
        82: dstore        4
        84: dload         4
        86: iload_3
        87: i2d
        88: dcmpl
        89: ifle          106
        92: aload_0
        93: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        96: invokevirtual #150                // Method ext/mods/gameserver/model/actor/Creature.getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
        99: aload_1
       100: iload_2
       101: invokevirtual #154                // Method ext/mods/gameserver/model/actor/move/CreatureMove.maybeStartOffensiveFollow:(Lext/mods/gameserver/model/actor/Creature;I)Z
       104: pop
       105: return
       106: aload_0
       107: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       110: invokevirtual #160                // Method ext/mods/gameserver/model/actor/Creature.getAttack:()Lext/mods/gameserver/model/actor/attack/CreatureAttack;
       113: invokevirtual #164                // Method ext/mods/gameserver/model/actor/attack/CreatureAttack.isAttackingNow:()Z
       116: ifne          132
       119: aload_0
       120: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       123: invokevirtual #160                // Method ext/mods/gameserver/model/actor/Creature.getAttack:()Lext/mods/gameserver/model/actor/attack/CreatureAttack;
       126: invokevirtual #169                // Method ext/mods/gameserver/model/actor/attack/CreatureAttack.isBowCoolingDown:()Z
       129: ifeq          133
       132: return
       133: aload_0
       134: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       137: invokevirtual #160                // Method ext/mods/gameserver/model/actor/Creature.getAttack:()Lext/mods/gameserver/model/actor/attack/CreatureAttack;
       140: aload_1
       141: invokevirtual #172                // Method ext/mods/gameserver/model/actor/attack/CreatureAttack.canAttack:(Lext/mods/gameserver/model/actor/Creature;)Z
       144: ifne          197
       147: aload_0
       148: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       151: instanceof    #13                 // class ext/mods/gameserver/model/actor/Npc
       154: ifeq          183
       157: dload         4
       159: iload_3
       160: bipush        100
       162: iadd
       163: i2d
       164: dcmpg
       165: ifgt          183
       168: aload_0
       169: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       172: invokevirtual #150                // Method ext/mods/gameserver/model/actor/Creature.getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
       175: aload_1
       176: iload_2
       177: invokevirtual #176                // Method ext/mods/gameserver/model/actor/move/CreatureMove.startOffensiveFollow:(Lext/mods/gameserver/model/actor/Creature;I)V
       180: goto          196
       183: aload_0
       184: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       187: invokevirtual #150                // Method ext/mods/gameserver/model/actor/Creature.getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
       190: aload_1
       191: iload_2
       192: invokevirtual #154                // Method ext/mods/gameserver/model/actor/move/CreatureMove.maybeStartOffensiveFollow:(Lext/mods/gameserver/model/actor/Creature;I)Z
       195: pop
       196: return
       197: aload_0
       198: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       201: invokevirtual #180                // Method ext/mods/gameserver/model/actor/Creature.isMoving:()Z
       204: ifeq          217
       207: aload_0
       208: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       211: invokevirtual #150                // Method ext/mods/gameserver/model/actor/Creature.getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
       214: invokevirtual #183                // Method ext/mods/gameserver/model/actor/move/CreatureMove.stop:()V
       217: aload_0
       218: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       221: invokevirtual #109                // Method ext/mods/gameserver/model/actor/Creature.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
       224: aload_1
       225: invokevirtual #186                // Method ext/mods/gameserver/model/location/SpawnLocation.setHeadingTo:(Lext/mods/gameserver/model/WorldObject;)V
       228: aload_0
       229: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       232: iconst_1
       233: iconst_0
       234: invokevirtual #192                // Method ext/mods/gameserver/model/actor/Creature.rechargeShots:(ZZ)V
       237: aload_0
       238: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       241: invokevirtual #160                // Method ext/mods/gameserver/model/actor/Creature.getAttack:()Lext/mods/gameserver/model/actor/attack/CreatureAttack;
       244: aload_1
       245: invokevirtual #196                // Method ext/mods/gameserver/model/actor/attack/CreatureAttack.doAttack:(Lext/mods/gameserver/model/actor/Creature;)V
       248: return
      LineNumberTable:
        line 142: 0
        line 143: 10
        line 146: 11
        line 147: 19
        line 148: 41
        line 149: 45
        line 152: 46
        line 153: 57
        line 154: 74
        line 155: 84
        line 156: 92
        line 157: 105
        line 160: 106
        line 161: 132
        line 164: 133
        line 165: 147
        line 166: 168
        line 168: 183
        line 170: 196
        line 174: 197
        line 175: 207
        line 178: 217
        line 180: 228
        line 181: 237
        line 182: 248
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     249     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
           19     230     1 target   Lext/mods/gameserver/model/actor/Creature;
           57     192     2 attackRange   I
           74     175     3 totalRange   I
           84     165     4  dist   D
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0     249     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI<TT;>;
      StackMapTable: number_of_entries = 10
        frame_type = 11 /* same */
        frame_type = 252 /* append */
          offset_delta = 29
          locals = [ class ext/mods/gameserver/model/actor/Creature ]
        frame_type = 4 /* same */
        frame_type = 254 /* append */
          offset_delta = 59
          locals = [ int, int, double ]
        frame_type = 25 /* same */
        frame_type = 0 /* same */
        frame_type = 49 /* same */
        frame_type = 12 /* same */
        frame_type = 0 /* same */
        frame_type = 19 /* same */

  protected void thinkCast();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=7, locals=3, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: invokevirtual #129                // Method ext/mods/gameserver/model/actor/Creature.denyAiAction:()Z
         7: ifne          33
        10: aload_0
        11: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        14: invokevirtual #199                // Method ext/mods/gameserver/model/actor/Creature.getAllSkillsDisabled:()Z
        17: ifne          33
        20: aload_0
        21: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        24: invokevirtual #202                // Method ext/mods/gameserver/model/actor/Creature.getCast:()Lext/mods/gameserver/model/actor/cast/CreatureCast;
        27: invokevirtual #206                // Method ext/mods/gameserver/model/actor/cast/CreatureCast.isCastingNow:()Z
        30: ifeq          34
        33: return
        34: aload_0
        35: getfield      #15                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        38: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/ai/Intention.getFinalTarget:()Lext/mods/gameserver/model/actor/Creature;
        41: astore_1
        42: aload_0
        43: getfield      #15                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        46: invokevirtual #211                // Method ext/mods/gameserver/model/actor/ai/Intention.getSkill:()Lext/mods/gameserver/skills/L2Skill;
        49: astore_2
        50: aload_0
        51: aload_1
        52: aload_2
        53: invokevirtual #215                // Method isTargetLost:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/skills/L2Skill;)Z
        56: ifeq          60
        59: return
        60: aload_0
        61: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        64: invokevirtual #202                // Method ext/mods/gameserver/model/actor/Creature.getCast:()Lext/mods/gameserver/model/actor/cast/CreatureCast;
        67: aload_1
        68: aload_2
        69: invokevirtual #219                // Method ext/mods/gameserver/model/actor/cast/CreatureCast.canAttemptCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
        72: ifne          76
        75: return
        76: aload_0
        77: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        80: invokevirtual #150                // Method ext/mods/gameserver/model/actor/Creature.getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
        83: aload_1
        84: aload_2
        85: invokevirtual #223                // Method ext/mods/gameserver/skills/L2Skill.getCastRange:()I
        88: invokevirtual #154                // Method ext/mods/gameserver/model/actor/move/CreatureMove.maybeStartOffensiveFollow:(Lext/mods/gameserver/model/actor/Creature;I)Z
        91: ifeq          103
        94: aload_0
        95: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        98: iconst_1
        99: invokevirtual #228                // Method ext/mods/gameserver/model/actor/Creature.setWalkOrRun:(Z)V
       102: return
       103: aload_2
       104: invokevirtual #232                // Method ext/mods/gameserver/skills/L2Skill.getHitTime:()I
       107: bipush        50
       109: if_icmple     141
       112: aload_0
       113: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       116: invokevirtual #150                // Method ext/mods/gameserver/model/actor/Creature.getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
       119: invokevirtual #183                // Method ext/mods/gameserver/model/actor/move/CreatureMove.stop:()V
       122: aload_1
       123: aload_0
       124: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       127: if_acmpeq     141
       130: aload_0
       131: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       134: invokevirtual #109                // Method ext/mods/gameserver/model/actor/Creature.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
       137: aload_1
       138: invokevirtual #186                // Method ext/mods/gameserver/model/location/SpawnLocation.setHeadingTo:(Lext/mods/gameserver/model/WorldObject;)V
       141: aload_0
       142: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       145: invokevirtual #202                // Method ext/mods/gameserver/model/actor/Creature.getCast:()Lext/mods/gameserver/model/actor/cast/CreatureCast;
       148: aload_1
       149: aload_2
       150: aload_0
       151: getfield      #15                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
       154: invokevirtual #235                // Method ext/mods/gameserver/model/actor/ai/Intention.isCtrlPressed:()Z
       157: aload_0
       158: getfield      #15                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
       161: invokevirtual #238                // Method ext/mods/gameserver/model/actor/ai/Intention.getItemObjectId:()I
       164: invokevirtual #241                // Method ext/mods/gameserver/model/actor/cast/CreatureCast.canCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZI)Z
       167: ifne          228
       170: aload_2
       171: invokevirtual #245                // Method ext/mods/gameserver/skills/L2Skill.isToggle:()Z
       174: ifne          181
       177: aload_0
       178: invokevirtual #98                 // Method doIdleIntention:()V
       181: aload_1
       182: aload_0
       183: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       186: if_acmpeq     227
       189: aload_0
       190: getfield      #15                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
       193: invokevirtual #248                // Method ext/mods/gameserver/model/actor/ai/Intention.canMoveToTarget:()Z
       196: ifeq          227
       199: aload_0
       200: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       203: new           #251                // class ext/mods/gameserver/network/serverpackets/MoveToPawn
       206: dup
       207: aload_0
       208: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       211: aload_1
       212: aload_0
       213: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       216: aload_1
       217: invokevirtual #146                // Method ext/mods/gameserver/model/actor/Creature.distance3D:(Lext/mods/gameserver/model/WorldObject;)D
       220: d2i
       221: invokespecial #253                // Method ext/mods/gameserver/network/serverpackets/MoveToPawn."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/WorldObject;I)V
       224: invokevirtual #116                // Method ext/mods/gameserver/model/actor/Creature.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       227: return
       228: aload_0
       229: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       232: invokevirtual #202                // Method ext/mods/gameserver/model/actor/Creature.getCast:()Lext/mods/gameserver/model/actor/cast/CreatureCast;
       235: aload_2
       236: aload_1
       237: aconst_null
       238: invokevirtual #256                // Method ext/mods/gameserver/model/actor/cast/CreatureCast.doCast:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
       241: return
      LineNumberTable:
        line 187: 0
        line 188: 33
        line 190: 34
        line 191: 42
        line 193: 50
        line 194: 59
        line 196: 60
        line 197: 75
        line 199: 76
        line 201: 94
        line 202: 102
        line 205: 103
        line 207: 112
        line 209: 122
        line 210: 130
        line 213: 141
        line 215: 170
        line 216: 177
        line 218: 181
        line 219: 199
        line 221: 227
        line 224: 228
        line 225: 241
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     242     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
           42     200     1 target   Lext/mods/gameserver/model/actor/Creature;
           50     192     2 skill   Lext/mods/gameserver/skills/L2Skill;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0     242     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI<TT;>;
      StackMapTable: number_of_entries = 9
        frame_type = 33 /* same */
        frame_type = 0 /* same */
        frame_type = 253 /* append */
          offset_delta = 25
          locals = [ class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/skills/L2Skill ]
        frame_type = 15 /* same */
        frame_type = 26 /* same */
        frame_type = 37 /* same */
        frame_type = 39 /* same */
        frame_type = 45 /* same */
        frame_type = 0 /* same */

  protected void thinkFakeDeath();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=0, locals=1, args_size=1
         0: return
      LineNumberTable:
        line 230: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI<TT;>;

  protected void thinkFlee();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=4, locals=5, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: invokevirtual #260                // Method ext/mods/gameserver/model/actor/Creature.isMovementDisabled:()Z
         7: ifeq          11
        10: return
        11: aload_0
        12: getfield      #15                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        15: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/ai/Intention.getFinalTarget:()Lext/mods/gameserver/model/actor/Creature;
        18: astore_1
        19: aload_0
        20: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        23: aload_1
        24: if_acmpne     28
        27: return
        28: aload_0
        29: getfield      #15                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        32: invokevirtual #238                // Method ext/mods/gameserver/model/actor/ai/Intention.getItemObjectId:()I
        35: istore_2
        36: iload_2
        37: bipush        10
        39: if_icmpge     43
        42: return
        43: aload_0
        44: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        47: aload_0
        48: getfield      #15                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        51: invokevirtual #263                // Method ext/mods/gameserver/model/actor/ai/Intention.getLoc:()Lext/mods/gameserver/model/location/Location;
        54: invokevirtual #267                // Method ext/mods/gameserver/model/actor/Creature.distance2D:(Lext/mods/gameserver/model/location/Location;)D
        57: dstore_3
        58: dload_3
        59: iload_2
        60: i2d
        61: dcmpl
        62: iflt          66
        65: return
        66: aload_0
        67: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        70: aload_1
        71: iload_2
        72: invokevirtual #271                // Method ext/mods/gameserver/model/actor/Creature.fleeFrom:(Lext/mods/gameserver/model/actor/Creature;I)V
        75: return
      LineNumberTable:
        line 235: 0
        line 236: 10
        line 238: 11
        line 239: 19
        line 240: 27
        line 242: 28
        line 243: 36
        line 244: 42
        line 246: 43
        line 247: 58
        line 248: 65
        line 250: 66
        line 251: 75
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      76     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
           19      57     1 target   Lext/mods/gameserver/model/actor/Creature;
           36      40     2 distance   I
           58      18     3 passedDistance   D
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      76     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI<TT;>;
      StackMapTable: number_of_entries = 4
        frame_type = 11 /* same */
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/actor/Creature ]
        frame_type = 252 /* append */
          offset_delta = 14
          locals = [ int ]
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ double ]

  protected void thinkFollow();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=3, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: invokevirtual #129                // Method ext/mods/gameserver/model/actor/Creature.denyAiAction:()Z
         7: ifne          20
        10: aload_0
        11: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        14: invokevirtual #260                // Method ext/mods/gameserver/model/actor/Creature.isMovementDisabled:()Z
        17: ifeq          21
        20: return
        21: aload_0
        22: getfield      #15                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        25: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/ai/Intention.getFinalTarget:()Lext/mods/gameserver/model/actor/Creature;
        28: astore_1
        29: aload_0
        30: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        33: aload_1
        34: if_acmpne     38
        37: return
        38: aload_0
        39: getfield      #15                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        42: invokevirtual #274                // Method ext/mods/gameserver/model/actor/ai/Intention.isShiftPressed:()Z
        45: istore_2
        46: iload_2
        47: ifeq          51
        50: return
        51: aload_0
        52: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        55: invokevirtual #150                // Method ext/mods/gameserver/model/actor/Creature.getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
        58: aload_1
        59: bipush        70
        61: invokevirtual #277                // Method ext/mods/gameserver/model/actor/move/CreatureMove.maybeStartFriendlyFollow:(Lext/mods/gameserver/model/actor/Creature;I)Z
        64: pop
        65: return
      LineNumberTable:
        line 256: 0
        line 257: 20
        line 259: 21
        line 260: 29
        line 261: 37
        line 263: 38
        line 264: 46
        line 265: 50
        line 267: 51
        line 268: 65
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      66     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
           29      37     1 target   Lext/mods/gameserver/model/actor/Creature;
           46      20     2 isShiftPressed   Z
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      66     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI<TT;>;
      StackMapTable: number_of_entries = 4
        frame_type = 20 /* same */
        frame_type = 0 /* same */
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/actor/Creature ]
        frame_type = 252 /* append */
          offset_delta = 12
          locals = [ int ]

  protected void thinkIdle();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: invokevirtual #150                // Method ext/mods/gameserver/model/actor/Creature.getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
         7: invokevirtual #183                // Method ext/mods/gameserver/model/actor/move/CreatureMove.stop:()V
        10: return
      LineNumberTable:
        line 273: 0
        line 274: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI<TT;>;

  protected void thinkInteract();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=0, locals=1, args_size=1
         0: return
      LineNumberTable:
        line 279: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI<TT;>;

  protected void thinkMoveRoute();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=0, locals=1, args_size=1
         0: return
      LineNumberTable:
        line 284: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI<TT;>;

  protected void thinkMoveTo();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=5, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: invokevirtual #129                // Method ext/mods/gameserver/model/actor/Creature.denyAiAction:()Z
         7: ifne          20
        10: aload_0
        11: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        14: invokevirtual #260                // Method ext/mods/gameserver/model/actor/Creature.isMovementDisabled:()Z
        17: ifeq          21
        20: return
        21: aload_0
        22: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        25: invokevirtual #150                // Method ext/mods/gameserver/model/actor/Creature.getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
        28: aload_0
        29: getfield      #15                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        32: invokevirtual #263                // Method ext/mods/gameserver/model/actor/ai/Intention.getLoc:()Lext/mods/gameserver/model/location/Location;
        35: iconst_0
        36: iconst_1
        37: iconst_0
        38: invokevirtual #280                // Method ext/mods/gameserver/model/actor/move/CreatureMove.maybeMoveToLocation:(Lext/mods/gameserver/model/location/Location;IZZ)Z
        41: pop
        42: return
      LineNumberTable:
        line 289: 0
        line 290: 20
        line 292: 21
        line 293: 42
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      43     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      43     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI<TT;>;
      StackMapTable: number_of_entries = 2
        frame_type = 20 /* same */
        frame_type = 0 /* same */

  protected void thinkNothing();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=0, locals=1, args_size=1
         0: return
      LineNumberTable:
        line 298: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI<TT;>;

  protected ext.mods.gameserver.model.item.instance.ItemInstance thinkPickUp();
    descriptor: ()Lext/mods/gameserver/model/item/instance/ItemInstance;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: aconst_null
         1: areturn
      LineNumberTable:
        line 303: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI<TT;>;

  protected void thinkSit();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=0, locals=1, args_size=1
         0: return
      LineNumberTable:
        line 309: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI<TT;>;

  protected void thinkSocial();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=5, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: invokevirtual #129                // Method ext/mods/gameserver/model/actor/Creature.denyAiAction:()Z
         7: ifeq          11
        10: return
        11: aload_0
        12: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        15: new           #284                // class ext/mods/gameserver/network/serverpackets/SocialAction
        18: dup
        19: aload_0
        20: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        23: aload_0
        24: getfield      #15                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        27: invokevirtual #238                // Method ext/mods/gameserver/model/actor/ai/Intention.getItemObjectId:()I
        30: invokespecial #286                // Method ext/mods/gameserver/network/serverpackets/SocialAction."<init>":(Lext/mods/gameserver/model/actor/Creature;I)V
        33: invokevirtual #116                // Method ext/mods/gameserver/model/actor/Creature.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        36: return
      LineNumberTable:
        line 314: 0
        line 315: 10
        line 317: 11
        line 318: 36
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      37     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      37     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI<TT;>;
      StackMapTable: number_of_entries = 1
        frame_type = 11 /* same */

  protected void thinkStand();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=0, locals=1, args_size=1
         0: return
      LineNumberTable:
        line 323: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI<TT;>;

  protected void thinkUseItem();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=0, locals=1, args_size=1
         0: return
      LineNumberTable:
        line 328: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI<TT;>;

  protected void thinkWander();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=0, locals=1, args_size=1
         0: return
      LineNumberTable:
        line 333: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI<TT;>;

  protected void onEvtSatDown(ext.mods.gameserver.model.WorldObject);
    descriptor: (Lext/mods/gameserver/model/WorldObject;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=0, locals=2, args_size=2
         0: return
      LineNumberTable:
        line 338: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
            0       1     1 target   Lext/mods/gameserver/model/WorldObject;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI<TT;>;

  protected void onEvtStoodUp();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=0, locals=1, args_size=1
         0: return
      LineNumberTable:
        line 343: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI<TT;>;

  protected void onEvtAttacked(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #288                // Method startAttackStance:()V
         4: return
      LineNumberTable:
        line 348: 0
        line 349: 4
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
            0       5     1 attacker   Lext/mods/gameserver/model/actor/Creature;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI<TT;>;

  protected void onEvtAggression(ext.mods.gameserver.model.actor.Creature, int);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;I)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=0, locals=3, args_size=3
         0: return
      LineNumberTable:
        line 354: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
            0       1     1 target   Lext/mods/gameserver/model/actor/Creature;
            0       1     2 aggro   I
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI<TT;>;

  protected void onEvtEvaded(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=0, locals=2, args_size=2
         0: return
      LineNumberTable:
        line 359: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
            0       1     1 attacker   Lext/mods/gameserver/model/actor/Creature;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI<TT;>;

  protected void onEvtOwnerAttacked(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=0, locals=2, args_size=2
         0: return
      LineNumberTable:
        line 364: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
            0       1     1 attacker   Lext/mods/gameserver/model/actor/Creature;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI<TT;>;

  protected void onEvtCancel();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=0, locals=1, args_size=1
         0: return
      LineNumberTable:
        line 369: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI<TT;>;

  public boolean getFollowStatus();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: iconst_0
         1: ireturn
      LineNumberTable:
        line 373: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI<TT;>;

  public void setFollowStatus(boolean);
    descriptor: (Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=2, args_size=2
         0: return
      LineNumberTable:
        line 378: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
            0       1     1 followStatus   Z
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI<TT;>;

  public boolean canDoInteract(ext.mods.gameserver.model.WorldObject);
    descriptor: (Lext/mods/gameserver/model/WorldObject;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=2, args_size=2
         0: iconst_0
         1: ireturn
      LineNumberTable:
        line 382: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
            0       2     1 target   Lext/mods/gameserver/model/WorldObject;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI<TT;>;

  public boolean canAttemptInteract();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: iconst_0
         1: ireturn
      LineNumberTable:
        line 387: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/ai/type/CreatureAI<TT;>;
}
Signature: #359                         // <T:Lext/mods/gameserver/model/actor/Creature;>Lext/mods/gameserver/model/actor/ai/type/AbstractAI<TT;>;
SourceFile: "CreatureAI.java"
BootstrapMethods:
  0: #367 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #363 ()V
      #364 REF_invokeVirtual ext/mods/gameserver/model/actor/ai/type/CreatureAI.lambda$onEvtFinishedAttack$0:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Npc;I)V
      #363 ()V
InnerClasses:
  public static final #379= #375 of #377; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
