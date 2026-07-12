// Bytecode for: ext.mods.gameserver.model.actor.attack.CreatureAttack
// File: ext\mods\gameserver\model\actor\attack\CreatureAttack.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/attack/CreatureAttack.class
  Last modified 9 de jul de 2026; size 18465 bytes
  MD5 checksum dea88a3d263cc56a6a8db64b1a757f26
  Compiled from "CreatureAttack.java"
public class ext.mods.gameserver.model.actor.attack.CreatureAttack<T extends ext.mods.gameserver.model.actor.Creature> extends java.lang.Object
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/actor/attack/CreatureAttack
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 9, methods: 25, attributes: 5
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/actor/attack/CreatureAttack._actor:Lext/mods/gameserver/model/actor/Creature;
    #8 = Class              #10           // ext/mods/gameserver/model/actor/attack/CreatureAttack
    #9 = NameAndType        #11:#12       // _actor:Lext/mods/gameserver/model/actor/Creature;
   #10 = Utf8               ext/mods/gameserver/model/actor/attack/CreatureAttack
   #11 = Utf8               _actor
   #12 = Utf8               Lext/mods/gameserver/model/actor/Creature;
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/model/actor/attack/CreatureAttack._isAttackingNow:Z
   #14 = NameAndType        #15:#16       // _isAttackingNow:Z
   #15 = Utf8               _isAttackingNow
   #16 = Utf8               Z
   #17 = Fieldref           #8.#18        // ext/mods/gameserver/model/actor/attack/CreatureAttack._isBowCoolingDown:Z
   #18 = NameAndType        #19:#16       // _isBowCoolingDown:Z
   #19 = Utf8               _isBowCoolingDown
   #20 = Methodref          #21.#22       // ext/mods/gameserver/model/actor/Creature.isAttackingDisabled:()Z
   #21 = Class              #23           // ext/mods/gameserver/model/actor/Creature
   #22 = NameAndType        #24:#25       // isAttackingDisabled:()Z
   #23 = Utf8               ext/mods/gameserver/model/actor/Creature
   #24 = Utf8               isAttackingDisabled
   #25 = Utf8               ()Z
   #26 = Methodref          #21.#27       // ext/mods/gameserver/model/actor/Creature.isDead:()Z
   #27 = NameAndType        #28:#25       // isDead:()Z
   #28 = Utf8               isDead
   #29 = Methodref          #21.#30       // ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
   #30 = NameAndType        #31:#32       // getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
   #31 = Utf8               getStatus
   #32 = Utf8               ()Lext/mods/gameserver/model/actor/status/CreatureStatus;
   #33 = Methodref          #34.#35       // ext/mods/gameserver/model/actor/status/CreatureStatus.getPhysicalAttackRange:()I
   #34 = Class              #36           // ext/mods/gameserver/model/actor/status/CreatureStatus
   #35 = NameAndType        #37:#38       // getPhysicalAttackRange:()I
   #36 = Utf8               ext/mods/gameserver/model/actor/status/CreatureStatus
   #37 = Utf8               getPhysicalAttackRange
   #38 = Utf8               ()I
   #39 = Methodref          #21.#40       // ext/mods/gameserver/model/actor/Creature.distance2D:(Lext/mods/gameserver/model/WorldObject;)D
   #40 = NameAndType        #41:#42       // distance2D:(Lext/mods/gameserver/model/WorldObject;)D
   #41 = Utf8               distance2D
   #42 = Utf8               (Lext/mods/gameserver/model/WorldObject;)D
   #43 = Methodref          #21.#44       // ext/mods/gameserver/model/actor/Creature.getCollisionRadius:()D
   #44 = NameAndType        #45:#46       // getCollisionRadius:()D
   #45 = Utf8               getCollisionRadius
   #46 = Utf8               ()D
   #47 = Methodref          #21.#48       // ext/mods/gameserver/model/actor/Creature.getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
   #48 = NameAndType        #49:#50       // getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
   #49 = Utf8               getMove
   #50 = Utf8               ()Lext/mods/gameserver/model/actor/move/CreatureMove;
   #51 = Methodref          #52.#53       // ext/mods/gameserver/model/actor/move/CreatureMove.maybeStartOffensiveFollow:(Lext/mods/gameserver/model/actor/Creature;I)Z
   #52 = Class              #54           // ext/mods/gameserver/model/actor/move/CreatureMove
   #53 = NameAndType        #55:#56       // maybeStartOffensiveFollow:(Lext/mods/gameserver/model/actor/Creature;I)Z
   #54 = Utf8               ext/mods/gameserver/model/actor/move/CreatureMove
   #55 = Utf8               maybeStartOffensiveFollow
   #56 = Utf8               (Lext/mods/gameserver/model/actor/Creature;I)Z
   #57 = Methodref          #21.#58       // ext/mods/gameserver/model/actor/Creature.isMovementDisabled:()Z
   #58 = NameAndType        #59:#25       // isMovementDisabled:()Z
   #59 = Utf8               isMovementDisabled
   #60 = Methodref          #21.#61       // ext/mods/gameserver/model/actor/Creature.knows:(Lext/mods/gameserver/model/WorldObject;)Z
   #61 = NameAndType        #62:#63       // knows:(Lext/mods/gameserver/model/WorldObject;)Z
   #62 = Utf8               knows
   #63 = Utf8               (Lext/mods/gameserver/model/WorldObject;)Z
   #64 = Methodref          #21.#65       // ext/mods/gameserver/model/actor/Creature.isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
   #65 = NameAndType        #66:#67       // isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
   #66 = Utf8               isAttackableBy
   #67 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
   #68 = Class              #69           // ext/mods/gameserver/model/actor/Player
   #69 = Utf8               ext/mods/gameserver/model/actor/Player
   #70 = Double             150.0d
   #72 = Methodref          #73.#74       // ext/mods/gameserver/model/actor/move/MovementIntegration.canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
   #73 = Class              #75           // ext/mods/gameserver/model/actor/move/MovementIntegration
   #74 = NameAndType        #76:#77       // canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
   #75 = Utf8               ext/mods/gameserver/model/actor/move/MovementIntegration
   #76 = Utf8               canSeeTarget
   #77 = Utf8               (Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
   #78 = Fieldref           #79.#80       // ext/mods/gameserver/network/SystemMessageId.CANT_SEE_TARGET:Lext/mods/gameserver/network/SystemMessageId;
   #79 = Class              #81           // ext/mods/gameserver/network/SystemMessageId
   #80 = NameAndType        #82:#83       // CANT_SEE_TARGET:Lext/mods/gameserver/network/SystemMessageId;
   #81 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #82 = Utf8               CANT_SEE_TARGET
   #83 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #84 = Methodref          #85.#86       // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #85 = Class              #87           // ext/mods/gameserver/network/serverpackets/SystemMessage
   #86 = NameAndType        #88:#89       // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #87 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
   #88 = Utf8               getSystemMessage
   #89 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #90 = Methodref          #21.#91       // ext/mods/gameserver/model/actor/Creature.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #91 = NameAndType        #92:#93       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #92 = Utf8               sendPacket
   #93 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #94 = Methodref          #8.#95        // ext/mods/gameserver/model/actor/attack/CreatureAttack.isAttackingNow:()Z
   #95 = NameAndType        #96:#25       // isAttackingNow:()Z
   #96 = Utf8               isAttackingNow
   #97 = Fieldref           #8.#98        // ext/mods/gameserver/model/actor/attack/CreatureAttack._hitHolders:[Lext/mods/gameserver/model/actor/attack/CreatureAttack$HitHolder;
   #98 = NameAndType        #99:#100      // _hitHolders:[Lext/mods/gameserver/model/actor/attack/CreatureAttack$HitHolder;
   #99 = Utf8               _hitHolders
  #100 = Utf8               [Lext/mods/gameserver/model/actor/attack/CreatureAttack$HitHolder;
  #101 = Fieldref           #102.#103     // ext/mods/gameserver/model/actor/attack/CreatureAttack$HitHolder._target:Lext/mods/gameserver/model/actor/Creature;
  #102 = Class              #104          // ext/mods/gameserver/model/actor/attack/CreatureAttack$HitHolder
  #103 = NameAndType        #105:#12      // _target:Lext/mods/gameserver/model/actor/Creature;
  #104 = Utf8               ext/mods/gameserver/model/actor/attack/CreatureAttack$HitHolder
  #105 = Utf8               _target
  #106 = Methodref          #8.#107       // ext/mods/gameserver/model/actor/attack/CreatureAttack.stop:()V
  #107 = NameAndType        #108:#6       // stop:()V
  #108 = Utf8               stop
  #109 = Methodref          #8.#110       // ext/mods/gameserver/model/actor/attack/CreatureAttack.isTargetInMeleeRange:(Lext/mods/gameserver/model/actor/Creature;)Z
  #110 = NameAndType        #111:#67      // isTargetInMeleeRange:(Lext/mods/gameserver/model/actor/Creature;)Z
  #111 = Utf8               isTargetInMeleeRange
  #112 = Class              #113          // ext/mods/gameserver/model/actor/Npc
  #113 = Utf8               ext/mods/gameserver/model/actor/Npc
  #114 = Fieldref           #115.#116     // ext/mods/Config.DEBUG_MELEE_ATTACK:Z
  #115 = Class              #117          // ext/mods/Config
  #116 = NameAndType        #118:#16      // DEBUG_MELEE_ATTACK:Z
  #117 = Utf8               ext/mods/Config
  #118 = Utf8               DEBUG_MELEE_ATTACK
  #119 = Fieldref           #8.#120       // ext/mods/gameserver/model/actor/attack/CreatureAttack.LOGGER:Lext/mods/commons/logging/CLogger;
  #120 = NameAndType        #121:#122     // LOGGER:Lext/mods/commons/logging/CLogger;
  #121 = Utf8               LOGGER
  #122 = Utf8               Lext/mods/commons/logging/CLogger;
  #123 = String             #124          // [MeleeDebug] onHitTimer: outOfRangeHit npc={} target={} dist={}
  #124 = Utf8               [MeleeDebug] onHitTimer: outOfRangeHit npc={} target={} dist={}
  #125 = Methodref          #21.#126      // ext/mods/gameserver/model/actor/Creature.getObjectId:()I
  #126 = NameAndType        #127:#38      // getObjectId:()I
  #127 = Utf8               getObjectId
  #128 = Methodref          #129.#130     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #129 = Class              #131          // java/lang/Integer
  #130 = NameAndType        #132:#133     // valueOf:(I)Ljava/lang/Integer;
  #131 = Utf8               java/lang/Integer
  #132 = Utf8               valueOf
  #133 = Utf8               (I)Ljava/lang/Integer;
  #134 = Methodref          #135.#136     // java/lang/Double.valueOf:(D)Ljava/lang/Double;
  #135 = Class              #137          // java/lang/Double
  #136 = NameAndType        #132:#138     // valueOf:(D)Ljava/lang/Double;
  #137 = Utf8               java/lang/Double
  #138 = Utf8               (D)Ljava/lang/Double;
  #139 = Methodref          #140.#141     // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #140 = Class              #142          // ext/mods/commons/logging/CLogger
  #141 = NameAndType        #143:#144     // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #142 = Utf8               ext/mods/commons/logging/CLogger
  #143 = Utf8               info
  #144 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
  #145 = Double             300.0d
  #147 = Methodref          #8.#148       // ext/mods/gameserver/model/actor/attack/CreatureAttack.clearAttackTask:(Z)V
  #148 = NameAndType        #149:#150     // clearAttackTask:(Z)V
  #149 = Utf8               clearAttackTask
  #150 = Utf8               (Z)V
  #151 = Fieldref           #8.#152       // ext/mods/gameserver/model/actor/attack/CreatureAttack._isHit:Z
  #152 = NameAndType        #153:#16      // _isHit:Z
  #153 = Utf8               _isHit
  #154 = Fieldref           #155.#156     // ext/mods/gameserver/enums/items/ShotType.SOULSHOT:Lext/mods/gameserver/enums/items/ShotType;
  #155 = Class              #157          // ext/mods/gameserver/enums/items/ShotType
  #156 = NameAndType        #158:#159     // SOULSHOT:Lext/mods/gameserver/enums/items/ShotType;
  #157 = Utf8               ext/mods/gameserver/enums/items/ShotType
  #158 = Utf8               SOULSHOT
  #159 = Utf8               Lext/mods/gameserver/enums/items/ShotType;
  #160 = Methodref          #21.#161      // ext/mods/gameserver/model/actor/Creature.setChargedShot:(Lext/mods/gameserver/enums/items/ShotType;Z)V
  #161 = NameAndType        #162:#163     // setChargedShot:(Lext/mods/gameserver/enums/items/ShotType;Z)V
  #162 = Utf8               setChargedShot
  #163 = Utf8               (Lext/mods/gameserver/enums/items/ShotType;Z)V
  #164 = Class              #165          // ext/mods/gameserver/model/actor/Playable
  #165 = Utf8               ext/mods/gameserver/model/actor/Playable
  #166 = Methodref          #21.#167      // ext/mods/gameserver/model/actor/Creature.rechargeShots:(ZZ)V
  #167 = NameAndType        #168:#169     // rechargeShots:(ZZ)V
  #168 = Utf8               rechargeShots
  #169 = Utf8               (ZZ)V
  #170 = Long               150l
  #172 = Fieldref           #8.#173       // ext/mods/gameserver/model/actor/attack/CreatureAttack._afterAttackDelay:I
  #173 = NameAndType        #174:#175     // _afterAttackDelay:I
  #174 = Utf8               _afterAttackDelay
  #175 = Utf8               I
  #176 = Methodref          #177.#178     // java/lang/Math.max:(JJ)J
  #177 = Class              #179          // java/lang/Math
  #178 = NameAndType        #180:#181     // max:(JJ)J
  #179 = Utf8               java/lang/Math
  #180 = Utf8               max
  #181 = Utf8               (JJ)J
  #182 = Fieldref           #183.#184     // ext/mods/gameserver/model/actor/attack/CreatureAttack$1.$SwitchMap$ext$mods$gameserver$enums$items$WeaponType:[I
  #183 = Class              #185          // ext/mods/gameserver/model/actor/attack/CreatureAttack$1
  #184 = NameAndType        #186:#187     // $SwitchMap$ext$mods$gameserver$enums$items$WeaponType:[I
  #185 = Utf8               ext/mods/gameserver/model/actor/attack/CreatureAttack$1
  #186 = Utf8               $SwitchMap$ext$mods$gameserver$enums$items$WeaponType
  #187 = Utf8               [I
  #188 = Fieldref           #8.#189       // ext/mods/gameserver/model/actor/attack/CreatureAttack._weaponType:Lext/mods/gameserver/enums/items/WeaponType;
  #189 = NameAndType        #190:#191     // _weaponType:Lext/mods/gameserver/enums/items/WeaponType;
  #190 = Utf8               _weaponType
  #191 = Utf8               Lext/mods/gameserver/enums/items/WeaponType;
  #192 = Methodref          #193.#194     // ext/mods/gameserver/enums/items/WeaponType.ordinal:()I
  #193 = Class              #195          // ext/mods/gameserver/enums/items/WeaponType
  #194 = NameAndType        #196:#38      // ordinal:()I
  #195 = Utf8               ext/mods/gameserver/enums/items/WeaponType
  #196 = Utf8               ordinal
  #197 = Methodref          #8.#198       // ext/mods/gameserver/model/actor/attack/CreatureAttack.doHit:(Lext/mods/gameserver/model/actor/attack/CreatureAttack$HitHolder;)V
  #198 = NameAndType        #199:#200     // doHit:(Lext/mods/gameserver/model/actor/attack/CreatureAttack$HitHolder;)V
  #199 = Utf8               doHit
  #200 = Utf8               (Lext/mods/gameserver/model/actor/attack/CreatureAttack$HitHolder;)V
  #201 = InvokeDynamic      #0:#202       // #0:run:(Lext/mods/gameserver/model/actor/attack/CreatureAttack;)Ljava/lang/Runnable;
  #202 = NameAndType        #203:#204     // run:(Lext/mods/gameserver/model/actor/attack/CreatureAttack;)Ljava/lang/Runnable;
  #203 = Utf8               run
  #204 = Utf8               (Lext/mods/gameserver/model/actor/attack/CreatureAttack;)Ljava/lang/Runnable;
  #205 = Methodref          #206.#207     // ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #206 = Class              #208          // ext/mods/commons/pool/ThreadPool
  #207 = NameAndType        #209:#210     // schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #208 = Utf8               ext/mods/commons/pool/ThreadPool
  #209 = Utf8               schedule
  #210 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #211 = Fieldref           #8.#212       // ext/mods/gameserver/model/actor/attack/CreatureAttack._attackTask:Ljava/util/concurrent/ScheduledFuture;
  #212 = NameAndType        #213:#214     // _attackTask:Ljava/util/concurrent/ScheduledFuture;
  #213 = Utf8               _attackTask
  #214 = Utf8               Ljava/util/concurrent/ScheduledFuture;
  #215 = Methodref          #8.#216       // ext/mods/gameserver/model/actor/attack/CreatureAttack.onFinishedAttackBow:(Lext/mods/gameserver/model/actor/Creature;)V
  #216 = NameAndType        #217:#218     // onFinishedAttackBow:(Lext/mods/gameserver/model/actor/Creature;)V
  #217 = Utf8               onFinishedAttackBow
  #218 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
  #219 = InvokeDynamic      #1:#220       // #1:run:(Lext/mods/gameserver/model/actor/attack/CreatureAttack;Lext/mods/gameserver/model/actor/Creature;J)Ljava/lang/Runnable;
  #220 = NameAndType        #203:#221     // run:(Lext/mods/gameserver/model/actor/attack/CreatureAttack;Lext/mods/gameserver/model/actor/Creature;J)Ljava/lang/Runnable;
  #221 = Utf8               (Lext/mods/gameserver/model/actor/attack/CreatureAttack;Lext/mods/gameserver/model/actor/Creature;J)Ljava/lang/Runnable;
  #222 = Long               2l
  #224 = InvokeDynamic      #2:#225       // #2:run:(Lext/mods/gameserver/model/actor/attack/CreatureAttack;Lext/mods/gameserver/model/actor/Creature;)Ljava/lang/Runnable;
  #225 = NameAndType        #203:#226     // run:(Lext/mods/gameserver/model/actor/attack/CreatureAttack;Lext/mods/gameserver/model/actor/Creature;)Ljava/lang/Runnable;
  #226 = Utf8               (Lext/mods/gameserver/model/actor/attack/CreatureAttack;Lext/mods/gameserver/model/actor/Creature;)Ljava/lang/Runnable;
  #227 = InvokeDynamic      #3:#225       // #3:run:(Lext/mods/gameserver/model/actor/attack/CreatureAttack;Lext/mods/gameserver/model/actor/Creature;)Ljava/lang/Runnable;
  #228 = Fieldref           #193.#229     // ext/mods/gameserver/enums/items/WeaponType.BOW:Lext/mods/gameserver/enums/items/WeaponType;
  #229 = NameAndType        #230:#191     // BOW:Lext/mods/gameserver/enums/items/WeaponType;
  #230 = Utf8               BOW
  #231 = Methodref          #52.#232      // ext/mods/gameserver/model/actor/move/CreatureMove.repositionAfterAttack:(Lext/mods/gameserver/model/actor/Creature;)V
  #232 = NameAndType        #233:#218     // repositionAfterAttack:(Lext/mods/gameserver/model/actor/Creature;)V
  #233 = Utf8               repositionAfterAttack
  #234 = Methodref          #21.#235      // ext/mods/gameserver/model/actor/Creature.getAI:()Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
  #235 = NameAndType        #236:#237     // getAI:()Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
  #236 = Utf8               getAI
  #237 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
  #238 = Class              #239          // ext/mods/gameserver/model/actor/ai/type/NpcAI
  #239 = Utf8               ext/mods/gameserver/model/actor/ai/type/NpcAI
  #240 = Methodref          #238.#241     // ext/mods/gameserver/model/actor/ai/type/NpcAI.runAI:(Z)V
  #241 = NameAndType        #242:#150     // runAI:(Z)V
  #242 = Utf8               runAI
  #243 = Fieldref           #244.#245     // ext/mods/gameserver/enums/AiEventType.FINISHED_ATTACK_BOW:Lext/mods/gameserver/enums/AiEventType;
  #244 = Class              #246          // ext/mods/gameserver/enums/AiEventType
  #245 = NameAndType        #247:#248     // FINISHED_ATTACK_BOW:Lext/mods/gameserver/enums/AiEventType;
  #246 = Utf8               ext/mods/gameserver/enums/AiEventType
  #247 = Utf8               FINISHED_ATTACK_BOW
  #248 = Utf8               Lext/mods/gameserver/enums/AiEventType;
  #249 = Methodref          #250.#251     // ext/mods/gameserver/model/actor/ai/type/CreatureAI.notifyEvent:(Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
  #250 = Class              #252          // ext/mods/gameserver/model/actor/ai/type/CreatureAI
  #251 = NameAndType        #253:#254     // notifyEvent:(Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
  #252 = Utf8               ext/mods/gameserver/model/actor/ai/type/CreatureAI
  #253 = Utf8               notifyEvent
  #254 = Utf8               (Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
  #255 = Fieldref           #244.#256     // ext/mods/gameserver/enums/AiEventType.FINISHED_ATTACK:Lext/mods/gameserver/enums/AiEventType;
  #256 = NameAndType        #257:#248     // FINISHED_ATTACK:Lext/mods/gameserver/enums/AiEventType;
  #257 = Utf8               FINISHED_ATTACK
  #258 = Fieldref           #102.#259     // ext/mods/gameserver/model/actor/attack/CreatureAttack$HitHolder._miss:Z
  #259 = NameAndType        #260:#16      // _miss:Z
  #260 = Utf8               _miss
  #261 = Methodref          #250.#262     // ext/mods/gameserver/model/actor/ai/type/CreatureAI.startAttackStance:()V
  #262 = NameAndType        #263:#6       // startAttackStance:()V
  #263 = Utf8               startAttackStance
  #264 = Fieldref           #244.#265     // ext/mods/gameserver/enums/AiEventType.EVADED:Lext/mods/gameserver/enums/AiEventType;
  #265 = NameAndType        #266:#248     // EVADED:Lext/mods/gameserver/enums/AiEventType;
  #266 = Utf8               EVADED
  #267 = Fieldref           #102.#268     // ext/mods/gameserver/model/actor/attack/CreatureAttack$HitHolder._damage:I
  #268 = NameAndType        #269:#175     // _damage:I
  #269 = Utf8               _damage
  #270 = Fieldref           #102.#271     // ext/mods/gameserver/model/actor/attack/CreatureAttack$HitHolder._crit:Z
  #271 = NameAndType        #272:#16      // _crit:Z
  #272 = Utf8               _crit
  #273 = Methodref          #21.#274      // ext/mods/gameserver/model/actor/Creature.sendDamageMessage:(Lext/mods/gameserver/model/actor/Creature;IZZZ)V
  #274 = NameAndType        #275:#276     // sendDamageMessage:(Lext/mods/gameserver/model/actor/Creature;IZZZ)V
  #275 = Utf8               sendDamageMessage
  #276 = Utf8               (Lext/mods/gameserver/model/actor/Creature;IZZZ)V
  #277 = String             #278          // [MeleeDebug] doHit: npc={} target={} dmg={} crit={} miss={}
  #278 = Utf8               [MeleeDebug] doHit: npc={} target={} dmg={} crit={} miss={}
  #279 = Methodref          #280.#281     // java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
  #280 = Class              #282          // java/lang/Boolean
  #281 = NameAndType        #132:#283     // valueOf:(Z)Ljava/lang/Boolean;
  #282 = Utf8               java/lang/Boolean
  #283 = Utf8               (Z)Ljava/lang/Boolean;
  #284 = Fieldref           #244.#285     // ext/mods/gameserver/enums/AiEventType.ATTACKED:Lext/mods/gameserver/enums/AiEventType;
  #285 = NameAndType        #286:#248     // ATTACKED:Lext/mods/gameserver/enums/AiEventType;
  #286 = Utf8               ATTACKED
  #287 = Methodref          #21.#288      // ext/mods/gameserver/model/actor/Creature.reduceCurrentHp:(DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #288 = NameAndType        #289:#290     // reduceCurrentHp:(DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #289 = Utf8               reduceCurrentHp
  #290 = Utf8               (DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #291 = Fieldref           #292.#293     // ext/mods/gameserver/enums/skills/Stats.REFLECT_DAMAGE_PERCENT:Lext/mods/gameserver/enums/skills/Stats;
  #292 = Class              #294          // ext/mods/gameserver/enums/skills/Stats
  #293 = NameAndType        #295:#296     // REFLECT_DAMAGE_PERCENT:Lext/mods/gameserver/enums/skills/Stats;
  #294 = Utf8               ext/mods/gameserver/enums/skills/Stats
  #295 = Utf8               REFLECT_DAMAGE_PERCENT
  #296 = Utf8               Lext/mods/gameserver/enums/skills/Stats;
  #297 = Methodref          #34.#298      // ext/mods/gameserver/model/actor/status/CreatureStatus.calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
  #298 = NameAndType        #299:#300     // calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
  #299 = Utf8               calcStat
  #300 = Utf8               (Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
  #301 = Methodref          #21.#302      // ext/mods/gameserver/model/actor/Creature.isInvul:()Z
  #302 = NameAndType        #303:#25      // isInvul:()Z
  #303 = Utf8               isInvul
  #304 = Double             100.0d
  #306 = Methodref          #34.#307      // ext/mods/gameserver/model/actor/status/CreatureStatus.getMaxHp:()I
  #307 = NameAndType        #308:#38      // getMaxHp:()I
  #308 = Utf8               getMaxHp
  #309 = Methodref          #177.#310     // java/lang/Math.min:(II)I
  #310 = NameAndType        #311:#312     // min:(II)I
  #311 = Utf8               min
  #312 = Utf8               (II)I
  #313 = Methodref          #21.#314      // ext/mods/gameserver/model/actor/Creature.reduceCurrentHp:(DLext/mods/gameserver/model/actor/Creature;ZZLext/mods/gameserver/skills/L2Skill;)V
  #314 = NameAndType        #289:#315     // reduceCurrentHp:(DLext/mods/gameserver/model/actor/Creature;ZZLext/mods/gameserver/skills/L2Skill;)V
  #315 = Utf8               (DLext/mods/gameserver/model/actor/Creature;ZZLext/mods/gameserver/skills/L2Skill;)V
  #316 = Fieldref           #292.#317     // ext/mods/gameserver/enums/skills/Stats.ABSORB_DAMAGE_PERCENT:Lext/mods/gameserver/enums/skills/Stats;
  #317 = NameAndType        #318:#296     // ABSORB_DAMAGE_PERCENT:Lext/mods/gameserver/enums/skills/Stats;
  #318 = Utf8               ABSORB_DAMAGE_PERCENT
  #319 = Methodref          #34.#320      // ext/mods/gameserver/model/actor/status/CreatureStatus.addHp:(D)D
  #320 = NameAndType        #321:#322     // addHp:(D)D
  #321 = Utf8               addHp
  #322 = Utf8               (D)D
  #323 = Methodref          #324.#325     // ext/mods/gameserver/skills/Formulas.calcCastBreak:(Lext/mods/gameserver/model/actor/Creature;D)V
  #324 = Class              #326          // ext/mods/gameserver/skills/Formulas
  #325 = NameAndType        #327:#328     // calcCastBreak:(Lext/mods/gameserver/model/actor/Creature;D)V
  #326 = Utf8               ext/mods/gameserver/skills/Formulas
  #327 = Utf8               calcCastBreak
  #328 = Utf8               (Lext/mods/gameserver/model/actor/Creature;D)V
  #329 = Methodref          #21.#330      // ext/mods/gameserver/model/actor/Creature.getChanceSkills:()Lext/mods/gameserver/model/actor/container/creature/ChanceSkillList;
  #330 = NameAndType        #331:#332     // getChanceSkills:()Lext/mods/gameserver/model/actor/container/creature/ChanceSkillList;
  #331 = Utf8               getChanceSkills
  #332 = Utf8               ()Lext/mods/gameserver/model/actor/container/creature/ChanceSkillList;
  #333 = Methodref          #334.#335     // ext/mods/gameserver/model/actor/container/creature/ChanceSkillList.onTargetHit:(Lext/mods/gameserver/model/actor/Creature;Z)V
  #334 = Class              #336          // ext/mods/gameserver/model/actor/container/creature/ChanceSkillList
  #335 = NameAndType        #337:#338     // onTargetHit:(Lext/mods/gameserver/model/actor/Creature;Z)V
  #336 = Utf8               ext/mods/gameserver/model/actor/container/creature/ChanceSkillList
  #337 = Utf8               onTargetHit
  #338 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Z)V
  #339 = Methodref          #334.#340     // ext/mods/gameserver/model/actor/container/creature/ChanceSkillList.onSelfHit:(Lext/mods/gameserver/model/actor/Creature;)V
  #340 = NameAndType        #341:#218     // onSelfHit:(Lext/mods/gameserver/model/actor/Creature;)V
  #341 = Utf8               onSelfHit
  #342 = Methodref          #21.#343      // ext/mods/gameserver/model/actor/Creature.getActiveWeaponItem:()Lext/mods/gameserver/model/item/kind/Weapon;
  #343 = NameAndType        #344:#345     // getActiveWeaponItem:()Lext/mods/gameserver/model/item/kind/Weapon;
  #344 = Utf8               getActiveWeaponItem
  #345 = Utf8               ()Lext/mods/gameserver/model/item/kind/Weapon;
  #346 = Methodref          #347.#348     // ext/mods/gameserver/model/item/kind/Weapon.castSkillOnCrit:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)V
  #347 = Class              #349          // ext/mods/gameserver/model/item/kind/Weapon
  #348 = NameAndType        #350:#351     // castSkillOnCrit:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)V
  #349 = Utf8               ext/mods/gameserver/model/item/kind/Weapon
  #350 = Utf8               castSkillOnCrit
  #351 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)V
  #352 = String             #353          // [MeleeDebug] doAttack: npc={} target={} moving={} dist={}
  #353 = Utf8               [MeleeDebug] doAttack: npc={} target={} moving={} dist={}
  #354 = Methodref          #21.#355      // ext/mods/gameserver/model/actor/Creature.isMoving:()Z
  #355 = NameAndType        #356:#25      // isMoving:()Z
  #356 = Utf8               isMoving
  #357 = Methodref          #324.#358     // ext/mods/gameserver/skills/Formulas.calculateTimeBetweenAttacks:(Lext/mods/gameserver/model/actor/Creature;)I
  #358 = NameAndType        #359:#360     // calculateTimeBetweenAttacks:(Lext/mods/gameserver/model/actor/Creature;)I
  #359 = Utf8               calculateTimeBetweenAttacks
  #360 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)I
  #361 = Methodref          #21.#362      // ext/mods/gameserver/model/actor/Creature.isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
  #362 = NameAndType        #363:#364     // isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
  #363 = Utf8               isChargedShot
  #364 = Utf8               (Lext/mods/gameserver/enums/items/ShotType;)Z
  #365 = Methodref          #21.#366      // ext/mods/gameserver/model/actor/Creature.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #366 = NameAndType        #367:#368     // getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #367 = Utf8               getPosition
  #368 = Utf8               ()Lext/mods/gameserver/model/location/SpawnLocation;
  #369 = Methodref          #370.#371     // ext/mods/gameserver/model/location/SpawnLocation.setHeadingTo:(Lext/mods/gameserver/model/WorldObject;)V
  #370 = Class              #372          // ext/mods/gameserver/model/location/SpawnLocation
  #371 = NameAndType        #373:#374     // setHeadingTo:(Lext/mods/gameserver/model/WorldObject;)V
  #372 = Utf8               ext/mods/gameserver/model/location/SpawnLocation
  #373 = Utf8               setHeadingTo
  #374 = Utf8               (Lext/mods/gameserver/model/WorldObject;)V
  #375 = Methodref          #21.#376      // ext/mods/gameserver/model/actor/Creature.getAttackType:()Lext/mods/gameserver/enums/items/WeaponType;
  #376 = NameAndType        #377:#378     // getAttackType:()Lext/mods/gameserver/enums/items/WeaponType;
  #377 = Utf8               getAttackType
  #378 = Utf8               ()Lext/mods/gameserver/enums/items/WeaponType;
  #379 = Methodref          #8.#380       // ext/mods/gameserver/model/actor/attack/CreatureAttack.doAttackHitByBow:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/kind/Weapon;IZ)[Lext/mods/gameserver/model/actor/attack/CreatureAttack$HitHolder;
  #380 = NameAndType        #381:#382     // doAttackHitByBow:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/kind/Weapon;IZ)[Lext/mods/gameserver/model/actor/attack/CreatureAttack$HitHolder;
  #381 = Utf8               doAttackHitByBow
  #382 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/kind/Weapon;IZ)[Lext/mods/gameserver/model/actor/attack/CreatureAttack$HitHolder;
  #383 = Methodref          #8.#384       // ext/mods/gameserver/model/actor/attack/CreatureAttack.doAttackHitByDual:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/kind/Weapon;IZ)[Lext/mods/gameserver/model/actor/attack/CreatureAttack$HitHolder;
  #384 = NameAndType        #385:#382     // doAttackHitByDual:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/kind/Weapon;IZ)[Lext/mods/gameserver/model/actor/attack/CreatureAttack$HitHolder;
  #385 = Utf8               doAttackHitByDual
  #386 = Methodref          #8.#387       // ext/mods/gameserver/model/actor/attack/CreatureAttack.doAttackHitByPole:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/kind/Weapon;IZ)[Lext/mods/gameserver/model/actor/attack/CreatureAttack$HitHolder;
  #387 = NameAndType        #388:#382     // doAttackHitByPole:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/kind/Weapon;IZ)[Lext/mods/gameserver/model/actor/attack/CreatureAttack$HitHolder;
  #388 = Utf8               doAttackHitByPole
  #389 = Methodref          #8.#390       // ext/mods/gameserver/model/actor/attack/CreatureAttack.doAttackHitSimple:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/kind/Weapon;IZ)[Lext/mods/gameserver/model/actor/attack/CreatureAttack$HitHolder;
  #390 = NameAndType        #391:#382     // doAttackHitSimple:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/kind/Weapon;IZ)[Lext/mods/gameserver/model/actor/attack/CreatureAttack$HitHolder;
  #391 = Utf8               doAttackHitSimple
  #392 = Class              #393          // ext/mods/gameserver/network/serverpackets/Attack
  #393 = Utf8               ext/mods/gameserver/network/serverpackets/Attack
  #394 = Methodref          #392.#395     // ext/mods/gameserver/network/serverpackets/Attack."<init>":(Lext/mods/gameserver/model/actor/Creature;[Lext/mods/gameserver/model/actor/attack/CreatureAttack$HitHolder;)V
  #395 = NameAndType        #5:#396       // "<init>":(Lext/mods/gameserver/model/actor/Creature;[Lext/mods/gameserver/model/actor/attack/CreatureAttack$HitHolder;)V
  #396 = Utf8               (Lext/mods/gameserver/model/actor/Creature;[Lext/mods/gameserver/model/actor/attack/CreatureAttack$HitHolder;)V
  #397 = Methodref          #21.#398      // ext/mods/gameserver/model/actor/Creature.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #398 = NameAndType        #399:#93      // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #399 = Utf8               broadcastPacket
  #400 = Fieldref           #115.#401     // ext/mods/Config.INFINITY_ARROWS:Z
  #401 = NameAndType        #402:#16      // INFINITY_ARROWS:Z
  #402 = Utf8               INFINITY_ARROWS
  #403 = Fieldref           #115.#404     // ext/mods/Config.INFINITY_ARROWS_PREMIUM_ONLY:Z
  #404 = NameAndType        #405:#16      // INFINITY_ARROWS_PREMIUM_ONLY:Z
  #405 = Utf8               INFINITY_ARROWS_PREMIUM_ONLY
  #406 = Methodref          #164.#407     // ext/mods/gameserver/model/actor/Playable.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
  #407 = NameAndType        #408:#409     // getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
  #408 = Utf8               getActingPlayer
  #409 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #410 = Methodref          #68.#411      // ext/mods/gameserver/model/actor/Player.getPremiumService:()I
  #411 = NameAndType        #412:#38      // getPremiumService:()I
  #412 = Utf8               getPremiumService
  #413 = Methodref          #21.#414      // ext/mods/gameserver/model/actor/Creature.reduceArrowCount:()V
  #414 = NameAndType        #415:#6       // reduceArrowCount:()V
  #415 = Utf8               reduceArrowCount
  #416 = Methodref          #347.#417     // ext/mods/gameserver/model/item/kind/Weapon.getMpConsume:()I
  #417 = NameAndType        #418:#38      // getMpConsume:()I
  #418 = Utf8               getMpConsume
  #419 = Methodref          #34.#420      // ext/mods/gameserver/model/actor/status/CreatureStatus.reduceMp:(D)D
  #420 = NameAndType        #421:#322     // reduceMp:(D)D
  #421 = Utf8               reduceMp
  #422 = Methodref          #8.#423       // ext/mods/gameserver/model/actor/attack/CreatureAttack.getHitHolder:(Lext/mods/gameserver/model/actor/Creature;ZZ)Lext/mods/gameserver/model/actor/attack/CreatureAttack$HitHolder;
  #423 = NameAndType        #424:#425     // getHitHolder:(Lext/mods/gameserver/model/actor/Creature;ZZ)Lext/mods/gameserver/model/actor/attack/CreatureAttack$HitHolder;
  #424 = Utf8               getHitHolder
  #425 = Utf8               (Lext/mods/gameserver/model/actor/Creature;ZZ)Lext/mods/gameserver/model/actor/attack/CreatureAttack$HitHolder;
  #426 = Methodref          #347.#427     // ext/mods/gameserver/model/item/kind/Weapon.getReuseDelay:()I
  #427 = NameAndType        #428:#38      // getReuseDelay:()I
  #428 = Utf8               getReuseDelay
  #429 = Methodref          #34.#430      // ext/mods/gameserver/model/actor/status/CreatureStatus.getPAtkSpd:()I
  #430 = NameAndType        #431:#38      // getPAtkSpd:()I
  #431 = Utf8               getPAtkSpd
  #432 = Methodref          #177.#433     // java/lang/Math.max:(II)I
  #433 = NameAndType        #180:#312     // max:(II)I
  #434 = Methodref          #8.#435       // ext/mods/gameserver/model/actor/attack/CreatureAttack.setAttackTask:([Lext/mods/gameserver/model/actor/attack/CreatureAttack$HitHolder;Lext/mods/gameserver/model/item/kind/Weapon;IZ)V
  #435 = NameAndType        #436:#437     // setAttackTask:([Lext/mods/gameserver/model/actor/attack/CreatureAttack$HitHolder;Lext/mods/gameserver/model/item/kind/Weapon;IZ)V
  #436 = Utf8               setAttackTask
  #437 = Utf8               ([Lext/mods/gameserver/model/actor/attack/CreatureAttack$HitHolder;Lext/mods/gameserver/model/item/kind/Weapon;IZ)V
  #438 = InvokeDynamic      #4:#202       // #4:run:(Lext/mods/gameserver/model/actor/attack/CreatureAttack;)Ljava/lang/Runnable;
  #439 = Fieldref           #79.#440      // ext/mods/gameserver/network/SystemMessageId.GETTING_READY_TO_SHOOT_AN_ARROW:Lext/mods/gameserver/network/SystemMessageId;
  #440 = NameAndType        #441:#83      // GETTING_READY_TO_SHOOT_AN_ARROW:Lext/mods/gameserver/network/SystemMessageId;
  #441 = Utf8               GETTING_READY_TO_SHOOT_AN_ARROW
  #442 = Class              #443          // ext/mods/gameserver/network/serverpackets/SetupGauge
  #443 = Utf8               ext/mods/gameserver/network/serverpackets/SetupGauge
  #444 = Fieldref           #445.#446     // ext/mods/gameserver/enums/GaugeColor.RED:Lext/mods/gameserver/enums/GaugeColor;
  #445 = Class              #447          // ext/mods/gameserver/enums/GaugeColor
  #446 = NameAndType        #448:#449     // RED:Lext/mods/gameserver/enums/GaugeColor;
  #447 = Utf8               ext/mods/gameserver/enums/GaugeColor
  #448 = Utf8               RED
  #449 = Utf8               Lext/mods/gameserver/enums/GaugeColor;
  #450 = Methodref          #442.#451     // ext/mods/gameserver/network/serverpackets/SetupGauge."<init>":(Lext/mods/gameserver/enums/GaugeColor;I)V
  #451 = NameAndType        #5:#452       // "<init>":(Lext/mods/gameserver/enums/GaugeColor;I)V
  #452 = Utf8               (Lext/mods/gameserver/enums/GaugeColor;I)V
  #453 = Class              #454          // java/util/ArrayList
  #454 = Utf8               java/util/ArrayList
  #455 = Methodref          #453.#3       // java/util/ArrayList."<init>":()V
  #456 = Methodref          #453.#457     // java/util/ArrayList.add:(Ljava/lang/Object;)Z
  #457 = NameAndType        #458:#459     // add:(Ljava/lang/Object;)Z
  #458 = Utf8               add
  #459 = Utf8               (Ljava/lang/Object;)Z
  #460 = Fieldref           #461.#462     // ext/mods/gameserver/enums/skills/EffectType.POLEARM_TARGET_SINGLE:Lext/mods/gameserver/enums/skills/EffectType;
  #461 = Class              #463          // ext/mods/gameserver/enums/skills/EffectType
  #462 = NameAndType        #464:#465     // POLEARM_TARGET_SINGLE:Lext/mods/gameserver/enums/skills/EffectType;
  #463 = Utf8               ext/mods/gameserver/enums/skills/EffectType
  #464 = Utf8               POLEARM_TARGET_SINGLE
  #465 = Utf8               Lext/mods/gameserver/enums/skills/EffectType;
  #466 = Methodref          #21.#467      // ext/mods/gameserver/model/actor/Creature.getFirstEffect:(Lext/mods/gameserver/enums/skills/EffectType;)Lext/mods/gameserver/skills/AbstractEffect;
  #467 = NameAndType        #468:#469     // getFirstEffect:(Lext/mods/gameserver/enums/skills/EffectType;)Lext/mods/gameserver/skills/AbstractEffect;
  #468 = Utf8               getFirstEffect
  #469 = Utf8               (Lext/mods/gameserver/enums/skills/EffectType;)Lext/mods/gameserver/skills/AbstractEffect;
  #470 = Fieldref           #292.#471     // ext/mods/gameserver/enums/skills/Stats.ATTACK_COUNT_MAX:Lext/mods/gameserver/enums/skills/Stats;
  #471 = NameAndType        #472:#296     // ATTACK_COUNT_MAX:Lext/mods/gameserver/enums/skills/Stats;
  #472 = Utf8               ATTACK_COUNT_MAX
  #473 = Fieldref           #292.#474     // ext/mods/gameserver/enums/skills/Stats.POWER_ATTACK_ANGLE:Lext/mods/gameserver/enums/skills/Stats;
  #474 = NameAndType        #475:#296     // POWER_ATTACK_ANGLE:Lext/mods/gameserver/enums/skills/Stats;
  #475 = Utf8               POWER_ATTACK_ANGLE
  #476 = Double             120.0d
  #478 = Methodref          #21.#479      // ext/mods/gameserver/model/actor/Creature.getKnownTypeInRadius:(Ljava/lang/Class;I)Ljava/util/List;
  #479 = NameAndType        #480:#481     // getKnownTypeInRadius:(Ljava/lang/Class;I)Ljava/util/List;
  #480 = Utf8               getKnownTypeInRadius
  #481 = Utf8               (Ljava/lang/Class;I)Ljava/util/List;
  #482 = InterfaceMethodref #483.#484     // java/util/List.iterator:()Ljava/util/Iterator;
  #483 = Class              #485          // java/util/List
  #484 = NameAndType        #486:#487     // iterator:()Ljava/util/Iterator;
  #485 = Utf8               java/util/List
  #486 = Utf8               iterator
  #487 = Utf8               ()Ljava/util/Iterator;
  #488 = InterfaceMethodref #489.#490     // java/util/Iterator.hasNext:()Z
  #489 = Class              #491          // java/util/Iterator
  #490 = NameAndType        #492:#25      // hasNext:()Z
  #491 = Utf8               java/util/Iterator
  #492 = Utf8               hasNext
  #493 = InterfaceMethodref #489.#494     // java/util/Iterator.next:()Ljava/lang/Object;
  #494 = NameAndType        #495:#496     // next:()Ljava/lang/Object;
  #495 = Utf8               next
  #496 = Utf8               ()Ljava/lang/Object;
  #497 = Methodref          #21.#498      // ext/mods/gameserver/model/actor/Creature.isFacing:(Lext/mods/gameserver/model/WorldObject;I)Z
  #498 = NameAndType        #499:#500     // isFacing:(Lext/mods/gameserver/model/WorldObject;I)Z
  #499 = Utf8               isFacing
  #500 = Utf8               (Lext/mods/gameserver/model/WorldObject;I)Z
  #501 = Methodref          #453.#502     // java/util/ArrayList.size:()I
  #502 = NameAndType        #503:#38      // size:()I
  #503 = Utf8               size
  #504 = Methodref          #453.#505     // java/util/ArrayList.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
  #505 = NameAndType        #506:#507     // toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
  #506 = Utf8               toArray
  #507 = Utf8               ([Ljava/lang/Object;)[Ljava/lang/Object;
  #508 = Class              #100          // "[Lext/mods/gameserver/model/actor/attack/CreatureAttack$HitHolder;"
  #509 = Fieldref           #510.#511     // ext/mods/gameserver/enums/skills/ShieldDefense.FAILED:Lext/mods/gameserver/enums/skills/ShieldDefense;
  #510 = Class              #512          // ext/mods/gameserver/enums/skills/ShieldDefense
  #511 = NameAndType        #513:#514     // FAILED:Lext/mods/gameserver/enums/skills/ShieldDefense;
  #512 = Utf8               ext/mods/gameserver/enums/skills/ShieldDefense
  #513 = Utf8               FAILED
  #514 = Utf8               Lext/mods/gameserver/enums/skills/ShieldDefense;
  #515 = Methodref          #324.#516     // ext/mods/gameserver/skills/Formulas.calcHitMiss:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Z
  #516 = NameAndType        #517:#518     // calcHitMiss:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Z
  #517 = Utf8               calcHitMiss
  #518 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Z
  #519 = Methodref          #324.#520     // ext/mods/gameserver/skills/Formulas.calcCrit:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
  #520 = NameAndType        #521:#522     // calcCrit:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
  #521 = Utf8               calcCrit
  #522 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
  #523 = Methodref          #324.#524     // ext/mods/gameserver/skills/Formulas.calcShldUse:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Lext/mods/gameserver/enums/skills/ShieldDefense;
  #524 = NameAndType        #525:#526     // calcShldUse:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Lext/mods/gameserver/enums/skills/ShieldDefense;
  #525 = Utf8               calcShldUse
  #526 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Lext/mods/gameserver/enums/skills/ShieldDefense;
  #527 = Methodref          #324.#528     // ext/mods/gameserver/skills/Formulas.calcPhysicalAttackDamage:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/skills/ShieldDefense;ZZ)D
  #528 = NameAndType        #529:#530     // calcPhysicalAttackDamage:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/skills/ShieldDefense;ZZ)D
  #529 = Utf8               calcPhysicalAttackDamage
  #530 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/skills/ShieldDefense;ZZ)D
  #531 = Methodref          #102.#532     // ext/mods/gameserver/model/actor/attack/CreatureAttack$HitHolder."<init>":(Lext/mods/gameserver/model/actor/Creature;IZZLext/mods/gameserver/enums/skills/ShieldDefense;)V
  #532 = NameAndType        #5:#533       // "<init>":(Lext/mods/gameserver/model/actor/Creature;IZZLext/mods/gameserver/enums/skills/ShieldDefense;)V
  #533 = Utf8               (Lext/mods/gameserver/model/actor/Creature;IZZLext/mods/gameserver/enums/skills/ShieldDefense;)V
  #534 = InterfaceMethodref #535.#536     // java/util/concurrent/ScheduledFuture.cancel:(Z)Z
  #535 = Class              #537          // java/util/concurrent/ScheduledFuture
  #536 = NameAndType        #538:#539     // cancel:(Z)Z
  #537 = Utf8               java/util/concurrent/ScheduledFuture
  #538 = Utf8               cancel
  #539 = Utf8               (Z)Z
  #540 = Fieldref           #79.#541      // ext/mods/gameserver/network/SystemMessageId.ATTACK_FAILED:Lext/mods/gameserver/network/SystemMessageId;
  #541 = NameAndType        #542:#83      // ATTACK_FAILED:Lext/mods/gameserver/network/SystemMessageId;
  #542 = Utf8               ATTACK_FAILED
  #543 = Fieldref           #193.#544     // ext/mods/gameserver/enums/items/WeaponType.ETC:Lext/mods/gameserver/enums/items/WeaponType;
  #544 = NameAndType        #545:#191     // ETC:Lext/mods/gameserver/enums/items/WeaponType;
  #545 = Utf8               ETC
  #546 = Methodref          #347.#547     // ext/mods/gameserver/model/item/kind/Weapon.getItemType:()Lext/mods/gameserver/enums/items/WeaponType;
  #547 = NameAndType        #548:#378     // getItemType:()Lext/mods/gameserver/enums/items/WeaponType;
  #548 = Utf8               getItemType
  #549 = Methodref          #347.#550     // ext/mods/gameserver/model/item/kind/Weapon.getCrystalType:()Lext/mods/gameserver/enums/items/CrystalType;
  #550 = NameAndType        #551:#552     // getCrystalType:()Lext/mods/gameserver/enums/items/CrystalType;
  #551 = Utf8               getCrystalType
  #552 = Utf8               ()Lext/mods/gameserver/enums/items/CrystalType;
  #553 = Methodref          #554.#555     // ext/mods/gameserver/enums/items/CrystalType.getId:()I
  #554 = Class              #556          // ext/mods/gameserver/enums/items/CrystalType
  #555 = NameAndType        #557:#38      // getId:()I
  #556 = Utf8               ext/mods/gameserver/enums/items/CrystalType
  #557 = Utf8               getId
  #558 = Fieldref           #102.#559     // ext/mods/gameserver/model/actor/attack/CreatureAttack$HitHolder._flags:I
  #559 = NameAndType        #560:#175     // _flags:I
  #560 = Utf8               _flags
  #561 = Fieldref           #102.#562     // ext/mods/gameserver/model/actor/attack/CreatureAttack$HitHolder._sDef:Lext/mods/gameserver/enums/skills/ShieldDefense;
  #562 = NameAndType        #563:#514     // _sDef:Lext/mods/gameserver/enums/skills/ShieldDefense;
  #563 = Utf8               _sDef
  #564 = Methodref          #8.#565       // ext/mods/gameserver/model/actor/attack/CreatureAttack.onFinishedAttack:(Lext/mods/gameserver/model/actor/Creature;)V
  #565 = NameAndType        #566:#218     // onFinishedAttack:(Lext/mods/gameserver/model/actor/Creature;)V
  #566 = Utf8               onFinishedAttack
  #567 = InvokeDynamic      #5:#225       // #5:run:(Lext/mods/gameserver/model/actor/attack/CreatureAttack;Lext/mods/gameserver/model/actor/Creature;)Ljava/lang/Runnable;
  #568 = Fieldref           #244.#569     // ext/mods/gameserver/enums/AiEventType.BOW_ATTACK_REUSED:Lext/mods/gameserver/enums/AiEventType;
  #569 = NameAndType        #570:#248     // BOW_ATTACK_REUSED:Lext/mods/gameserver/enums/AiEventType;
  #570 = Utf8               BOW_ATTACK_REUSED
  #571 = Methodref          #572.#573     // java/lang/Class.getName:()Ljava/lang/String;
  #572 = Class              #574          // java/lang/Class
  #573 = NameAndType        #575:#576     // getName:()Ljava/lang/String;
  #574 = Utf8               java/lang/Class
  #575 = Utf8               getName
  #576 = Utf8               ()Ljava/lang/String;
  #577 = Methodref          #140.#578     // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #578 = NameAndType        #5:#579       // "<init>":(Ljava/lang/String;)V
  #579 = Utf8               (Ljava/lang/String;)V
  #580 = Utf8               Signature
  #581 = Utf8               TT;
  #582 = Utf8               Ljava/util/concurrent/ScheduledFuture<*>;
  #583 = Utf8               Code
  #584 = Utf8               LineNumberTable
  #585 = Utf8               LocalVariableTable
  #586 = Utf8               this
  #587 = Utf8               Lext/mods/gameserver/model/actor/attack/CreatureAttack;
  #588 = Utf8               actor
  #589 = Utf8               LocalVariableTypeTable
  #590 = Utf8               Lext/mods/gameserver/model/actor/attack/CreatureAttack<TT;>;
  #591 = Utf8               (TT;)V
  #592 = Utf8               isBowCoolingDown
  #593 = Utf8               canAttack
  #594 = Utf8               target
  #595 = Utf8               weaponRange
  #596 = Utf8               distance
  #597 = Utf8               D
  #598 = Utf8               totalAttackRange
  #599 = Utf8               StackMapTable
  #600 = Utf8               onHitTimer
  #601 = Utf8               attackRange
  #602 = Utf8               dist
  #603 = Utf8               hitHolder
  #604 = Utf8               Lext/mods/gameserver/model/actor/attack/CreatureAttack$HitHolder;
  #605 = Utf8               mainTarget
  #606 = Utf8               finalDelay
  #607 = Utf8               J
  #608 = Utf8               tolerance
  #609 = Utf8               reflectedDamage
  #610 = Utf8               absorbPercent
  #611 = Utf8               reflectPercent
  #612 = Utf8               chanceSkills
  #613 = Utf8               Lext/mods/gameserver/model/actor/container/creature/ChanceSkillList;
  #614 = Utf8               activeWeapon
  #615 = Utf8               Lext/mods/gameserver/model/item/kind/Weapon;
  #616 = Utf8               doAttack
  #617 = Utf8               timeAtk
  #618 = Utf8               weaponItem
  #619 = Utf8               isSoulshot
  #620 = Utf8               hits
  #621 = Utf8               p
  #622 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #623 = Utf8               weapon
  #624 = Utf8               sAtk
  #625 = Utf8               infinityArrows
  #626 = Utf8               reuse
  #627 = Utf8               safeAtkTime
  #628 = Utf8               knownCreature
  #629 = Utf8               maxAngleDiff
  #630 = Utf8               hitHolders
  #631 = Utf8               Ljava/util/ArrayList;
  #632 = Utf8               maxAttackedCount
  #633 = Utf8               Ljava/util/ArrayList<Lext/mods/gameserver/model/actor/attack/CreatureAttack$HitHolder;>;
  #634 = Utf8               isSplit
  #635 = Utf8               crit
  #636 = Utf8               shld
  #637 = Utf8               damage
  #638 = Utf8               miss
  #639 = Utf8               interrupt
  #640 = Utf8               hit
  #641 = Utf8               afterAttackDelay
  #642 = Utf8               weaponType
  #643 = Utf8               weaponGrade
  #644 = Utf8               clearBowCooldown
  #645 = Utf8               lambda$onHitTimer$4
  #646 = Utf8               lambda$onHitTimer$3
  #647 = Utf8               lambda$onHitTimer$1
  #648 = Utf8               (Lext/mods/gameserver/model/actor/Creature;J)V
  #649 = Utf8               lambda$onHitTimer$2
  #650 = Utf8               lambda$onHitTimer$0
  #651 = Utf8               <clinit>
  #652 = Utf8               <T:Lext/mods/gameserver/model/actor/Creature;>Ljava/lang/Object;
  #653 = Utf8               SourceFile
  #654 = Utf8               CreatureAttack.java
  #655 = Utf8               NestMembers
  #656 = Utf8               BootstrapMethods
  #657 = MethodType         #6            //  ()V
  #658 = MethodHandle       5:#659        // REF_invokeVirtual ext/mods/gameserver/model/actor/attack/CreatureAttack.lambda$onHitTimer$0:()V
  #659 = Methodref          #8.#660       // ext/mods/gameserver/model/actor/attack/CreatureAttack.lambda$onHitTimer$0:()V
  #660 = NameAndType        #650:#6       // lambda$onHitTimer$0:()V
  #661 = MethodHandle       5:#662        // REF_invokeVirtual ext/mods/gameserver/model/actor/attack/CreatureAttack.lambda$onHitTimer$1:(Lext/mods/gameserver/model/actor/Creature;J)V
  #662 = Methodref          #8.#663       // ext/mods/gameserver/model/actor/attack/CreatureAttack.lambda$onHitTimer$1:(Lext/mods/gameserver/model/actor/Creature;J)V
  #663 = NameAndType        #647:#648     // lambda$onHitTimer$1:(Lext/mods/gameserver/model/actor/Creature;J)V
  #664 = MethodHandle       5:#665        // REF_invokeVirtual ext/mods/gameserver/model/actor/attack/CreatureAttack.lambda$onHitTimer$3:(Lext/mods/gameserver/model/actor/Creature;)V
  #665 = Methodref          #8.#666       // ext/mods/gameserver/model/actor/attack/CreatureAttack.lambda$onHitTimer$3:(Lext/mods/gameserver/model/actor/Creature;)V
  #666 = NameAndType        #646:#218     // lambda$onHitTimer$3:(Lext/mods/gameserver/model/actor/Creature;)V
  #667 = MethodHandle       5:#668        // REF_invokeVirtual ext/mods/gameserver/model/actor/attack/CreatureAttack.lambda$onHitTimer$4:(Lext/mods/gameserver/model/actor/Creature;)V
  #668 = Methodref          #8.#669       // ext/mods/gameserver/model/actor/attack/CreatureAttack.lambda$onHitTimer$4:(Lext/mods/gameserver/model/actor/Creature;)V
  #669 = NameAndType        #645:#218     // lambda$onHitTimer$4:(Lext/mods/gameserver/model/actor/Creature;)V
  #670 = MethodHandle       5:#671        // REF_invokeVirtual ext/mods/gameserver/model/actor/attack/CreatureAttack.onHitTimer:()V
  #671 = Methodref          #8.#672       // ext/mods/gameserver/model/actor/attack/CreatureAttack.onHitTimer:()V
  #672 = NameAndType        #600:#6       // onHitTimer:()V
  #673 = MethodHandle       5:#674        // REF_invokeVirtual ext/mods/gameserver/model/actor/attack/CreatureAttack.lambda$onHitTimer$2:(Lext/mods/gameserver/model/actor/Creature;)V
  #674 = Methodref          #8.#675       // ext/mods/gameserver/model/actor/attack/CreatureAttack.lambda$onHitTimer$2:(Lext/mods/gameserver/model/actor/Creature;)V
  #675 = NameAndType        #649:#218     // lambda$onHitTimer$2:(Lext/mods/gameserver/model/actor/Creature;)V
  #676 = MethodHandle       6:#677        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #677 = Methodref          #678.#679     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #678 = Class              #680          // java/lang/invoke/LambdaMetafactory
  #679 = NameAndType        #681:#682     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #680 = Utf8               java/lang/invoke/LambdaMetafactory
  #681 = Utf8               metafactory
  #682 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #683 = Utf8               InnerClasses
  #684 = Utf8               HitHolder
  #685 = Class              #686          // java/lang/invoke/MethodHandles$Lookup
  #686 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #687 = Class              #688          // java/lang/invoke/MethodHandles
  #688 = Utf8               java/lang/invoke/MethodHandles
  #689 = Utf8               Lookup
{
  public static final ext.mods.commons.logging.CLogger LOGGER;
    descriptor: Lext/mods/commons/logging/CLogger;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL

  protected final T _actor;
    descriptor: Lext/mods/gameserver/model/actor/Creature;
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Signature: #581                         // TT;

  public ext.mods.gameserver.model.actor.attack.CreatureAttack(T);
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
        line 62: 0
        line 63: 4
        line 64: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/actor/attack/CreatureAttack;
            0      10     1 actor   Lext/mods/gameserver/model/actor/Creature;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/actor/attack/CreatureAttack<TT;>;
            0      10     1 actor   TT;
    Signature: #591                         // (TT;)V

  public boolean isAttackingNow();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _isAttackingNow:Z
         4: ireturn
      LineNumberTable:
        line 67: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/attack/CreatureAttack;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/attack/CreatureAttack<TT;>;

  public boolean isBowCoolingDown();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #17                 // Field _isBowCoolingDown:Z
         4: ireturn
      LineNumberTable:
        line 71: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/attack/CreatureAttack;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/attack/CreatureAttack<TT;>;

  public boolean canAttack(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=6, args_size=2
         0: aload_0
         1: getfield      #13                 // Field _isAttackingNow:Z
         4: ifne          14
         7: aload_0
         8: getfield      #17                 // Field _isBowCoolingDown:Z
        11: ifeq          16
        14: iconst_0
        15: ireturn
        16: aload_0
        17: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        20: invokevirtual #20                 // Method ext/mods/gameserver/model/actor/Creature.isAttackingDisabled:()Z
        23: ifne          37
        26: aload_1
        27: ifnull        37
        30: aload_1
        31: invokevirtual #26                 // Method ext/mods/gameserver/model/actor/Creature.isDead:()Z
        34: ifeq          39
        37: iconst_0
        38: ireturn
        39: aload_0
        40: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        43: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
        46: invokevirtual #33                 // Method ext/mods/gameserver/model/actor/status/CreatureStatus.getPhysicalAttackRange:()I
        49: istore_2
        50: aload_0
        51: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        54: aload_1
        55: invokevirtual #39                 // Method ext/mods/gameserver/model/actor/Creature.distance2D:(Lext/mods/gameserver/model/WorldObject;)D
        58: dstore_3
        59: iload_2
        60: i2d
        61: aload_0
        62: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        65: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Creature.getCollisionRadius:()D
        68: dadd
        69: aload_1
        70: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Creature.getCollisionRadius:()D
        73: dadd
        74: d2i
        75: istore        5
        77: dload_3
        78: iload         5
        80: i2d
        81: dcmpl
        82: ifle          98
        85: aload_0
        86: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        89: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/Creature.getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
        92: aload_1
        93: iload_2
        94: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/move/CreatureMove.maybeStartOffensiveFollow:(Lext/mods/gameserver/model/actor/Creature;I)Z
        97: pop
        98: aload_0
        99: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       102: invokevirtual #57                 // Method ext/mods/gameserver/model/actor/Creature.isMovementDisabled:()Z
       105: ifeq          118
       108: dload_3
       109: iload         5
       111: i2d
       112: dcmpl
       113: ifle          118
       116: iconst_0
       117: ireturn
       118: aload_0
       119: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       122: aload_1
       123: invokevirtual #60                 // Method ext/mods/gameserver/model/actor/Creature.knows:(Lext/mods/gameserver/model/WorldObject;)Z
       126: ifeq          140
       129: aload_1
       130: aload_0
       131: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       134: invokevirtual #64                 // Method ext/mods/gameserver/model/actor/Creature.isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
       137: ifne          142
       140: iconst_0
       141: ireturn
       142: aload_0
       143: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       146: instanceof    #68                 // class ext/mods/gameserver/model/actor/Player
       149: ifeq          193
       152: iload_2
       153: sipush        200
       156: if_icmplt     193
       159: dload_3
       160: ldc2_w        #70                 // double 150.0d
       163: dcmpl
       164: ifle          193
       167: aload_0
       168: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       171: aload_1
       172: invokestatic  #72                 // Method ext/mods/gameserver/model/actor/move/MovementIntegration.canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
       175: ifne          193
       178: aload_0
       179: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       182: getstatic     #78                 // Field ext/mods/gameserver/network/SystemMessageId.CANT_SEE_TARGET:Lext/mods/gameserver/network/SystemMessageId;
       185: invokestatic  #84                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       188: invokevirtual #90                 // Method ext/mods/gameserver/model/actor/Creature.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       191: iconst_0
       192: ireturn
       193: iconst_1
       194: ireturn
      LineNumberTable:
        line 78: 0
        line 79: 14
        line 82: 16
        line 83: 37
        line 86: 39
        line 87: 50
        line 91: 59
        line 93: 77
        line 94: 85
        line 98: 98
        line 99: 116
        line 102: 118
        line 103: 140
        line 106: 142
        line 107: 167
        line 108: 178
        line 109: 191
        line 115: 193
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     195     0  this   Lext/mods/gameserver/model/actor/attack/CreatureAttack;
            0     195     1 target   Lext/mods/gameserver/model/actor/Creature;
           50     145     2 weaponRange   I
           59     136     3 distance   D
           77     118     5 totalAttackRange   I
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0     195     0  this   Lext/mods/gameserver/model/actor/attack/CreatureAttack<TT;>;
      StackMapTable: number_of_entries = 9
        frame_type = 14 /* same */
        frame_type = 1 /* same */
        frame_type = 20 /* same */
        frame_type = 1 /* same */
        frame_type = 254 /* append */
          offset_delta = 58
          locals = [ int, double, int ]
        frame_type = 19 /* same */
        frame_type = 21 /* same */
        frame_type = 1 /* same */
        frame_type = 50 /* same */

  protected void onFinishedAttackBow(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: instanceof    #112                // class ext/mods/gameserver/model/actor/Npc
         7: ifeq          51
        10: aload_0
        11: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        14: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
        17: invokevirtual #33                 // Method ext/mods/gameserver/model/actor/status/CreatureStatus.getPhysicalAttackRange:()I
        20: sipush        200
        23: if_icmple     37
        26: aload_0
        27: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        30: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/Creature.getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
        33: aload_1
        34: invokevirtual #231                // Method ext/mods/gameserver/model/actor/move/CreatureMove.repositionAfterAttack:(Lext/mods/gameserver/model/actor/Creature;)V
        37: aload_0
        38: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        41: invokevirtual #234                // Method ext/mods/gameserver/model/actor/Creature.getAI:()Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
        44: checkcast     #238                // class ext/mods/gameserver/model/actor/ai/type/NpcAI
        47: iconst_0
        48: invokevirtual #240                // Method ext/mods/gameserver/model/actor/ai/type/NpcAI.runAI:(Z)V
        51: aload_0
        52: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        55: invokevirtual #234                // Method ext/mods/gameserver/model/actor/Creature.getAI:()Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
        58: getstatic     #243                // Field ext/mods/gameserver/enums/AiEventType.FINISHED_ATTACK_BOW:Lext/mods/gameserver/enums/AiEventType;
        61: aconst_null
        62: aconst_null
        63: invokevirtual #249                // Method ext/mods/gameserver/model/actor/ai/type/CreatureAI.notifyEvent:(Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
        66: return
      LineNumberTable:
        line 211: 0
        line 212: 10
        line 213: 26
        line 216: 37
        line 218: 51
        line 219: 66
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      67     0  this   Lext/mods/gameserver/model/actor/attack/CreatureAttack;
            0      67     1 mainTarget   Lext/mods/gameserver/model/actor/Creature;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      67     0  this   Lext/mods/gameserver/model/actor/attack/CreatureAttack<TT;>;
      StackMapTable: number_of_entries = 2
        frame_type = 37 /* same */
        frame_type = 13 /* same */

  protected void onFinishedAttack(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: iconst_0
         2: invokevirtual #147                // Method clearAttackTask:(Z)V
         5: aload_0
         6: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         9: instanceof    #112                // class ext/mods/gameserver/model/actor/Npc
        12: ifeq          56
        15: aload_0
        16: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        19: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
        22: invokevirtual #33                 // Method ext/mods/gameserver/model/actor/status/CreatureStatus.getPhysicalAttackRange:()I
        25: sipush        200
        28: if_icmple     42
        31: aload_0
        32: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        35: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/Creature.getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
        38: aload_1
        39: invokevirtual #231                // Method ext/mods/gameserver/model/actor/move/CreatureMove.repositionAfterAttack:(Lext/mods/gameserver/model/actor/Creature;)V
        42: aload_0
        43: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        46: invokevirtual #234                // Method ext/mods/gameserver/model/actor/Creature.getAI:()Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
        49: checkcast     #238                // class ext/mods/gameserver/model/actor/ai/type/NpcAI
        52: iconst_0
        53: invokevirtual #240                // Method ext/mods/gameserver/model/actor/ai/type/NpcAI.runAI:(Z)V
        56: aload_0
        57: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        60: invokevirtual #234                // Method ext/mods/gameserver/model/actor/Creature.getAI:()Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
        63: getstatic     #255                // Field ext/mods/gameserver/enums/AiEventType.FINISHED_ATTACK:Lext/mods/gameserver/enums/AiEventType;
        66: aconst_null
        67: aconst_null
        68: invokevirtual #249                // Method ext/mods/gameserver/model/actor/ai/type/CreatureAI.notifyEvent:(Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
        71: return
      LineNumberTable:
        line 222: 0
        line 224: 5
        line 225: 15
        line 226: 31
        line 229: 42
        line 231: 56
        line 232: 71
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      72     0  this   Lext/mods/gameserver/model/actor/attack/CreatureAttack;
            0      72     1 mainTarget   Lext/mods/gameserver/model/actor/Creature;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      72     0  this   Lext/mods/gameserver/model/actor/attack/CreatureAttack<TT;>;
      StackMapTable: number_of_entries = 2
        frame_type = 42 /* same */
        frame_type = 13 /* same */

  public void doAttack(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=6, args_size=2
         0: aload_0
         1: getfield      #13                 // Field _isAttackingNow:Z
         4: ifeq          19
         7: aload_0
         8: getfield      #211                // Field _attackTask:Ljava/util/concurrent/ScheduledFuture;
        11: ifnonnull     19
        14: aload_0
        15: iconst_0
        16: putfield      #13                 // Field _isAttackingNow:Z
        19: aload_0
        20: getfield      #13                 // Field _isAttackingNow:Z
        23: ifne          33
        26: aload_0
        27: getfield      #17                 // Field _isBowCoolingDown:Z
        30: ifeq          34
        33: return
        34: getstatic     #114                // Field ext/mods/Config.DEBUG_MELEE_ATTACK:Z
        37: ifeq          129
        40: aload_0
        41: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        44: instanceof    #112                // class ext/mods/gameserver/model/actor/Npc
        47: ifeq          129
        50: aload_0
        51: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        54: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
        57: invokevirtual #33                 // Method ext/mods/gameserver/model/actor/status/CreatureStatus.getPhysicalAttackRange:()I
        60: sipush        200
        63: if_icmpgt     129
        66: getstatic     #119                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        69: ldc_w         #352                // String [MeleeDebug] doAttack: npc={} target={} moving={} dist={}
        72: iconst_4
        73: anewarray     #2                  // class java/lang/Object
        76: dup
        77: iconst_0
        78: aload_0
        79: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        82: invokevirtual #125                // Method ext/mods/gameserver/model/actor/Creature.getObjectId:()I
        85: invokestatic  #128                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        88: aastore
        89: dup
        90: iconst_1
        91: aload_1
        92: invokevirtual #125                // Method ext/mods/gameserver/model/actor/Creature.getObjectId:()I
        95: invokestatic  #128                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        98: aastore
        99: dup
       100: iconst_2
       101: aload_0
       102: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       105: invokevirtual #354                // Method ext/mods/gameserver/model/actor/Creature.isMoving:()Z
       108: invokestatic  #279                // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
       111: aastore
       112: dup
       113: iconst_3
       114: aload_0
       115: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       118: aload_1
       119: invokevirtual #39                 // Method ext/mods/gameserver/model/actor/Creature.distance2D:(Lext/mods/gameserver/model/WorldObject;)D
       122: invokestatic  #134                // Method java/lang/Double.valueOf:(D)Ljava/lang/Double;
       125: aastore
       126: invokevirtual #139                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
       129: aload_0
       130: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       133: invokestatic  #357                // Method ext/mods/gameserver/skills/Formulas.calculateTimeBetweenAttacks:(Lext/mods/gameserver/model/actor/Creature;)I
       136: istore_2
       137: aload_0
       138: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       141: invokevirtual #342                // Method ext/mods/gameserver/model/actor/Creature.getActiveWeaponItem:()Lext/mods/gameserver/model/item/kind/Weapon;
       144: astore_3
       145: aload_0
       146: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       149: getstatic     #154                // Field ext/mods/gameserver/enums/items/ShotType.SOULSHOT:Lext/mods/gameserver/enums/items/ShotType;
       152: invokevirtual #361                // Method ext/mods/gameserver/model/actor/Creature.isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
       155: istore        4
       157: aload_0
       158: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       161: invokevirtual #365                // Method ext/mods/gameserver/model/actor/Creature.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
       164: aload_1
       165: invokevirtual #369                // Method ext/mods/gameserver/model/location/SpawnLocation.setHeadingTo:(Lext/mods/gameserver/model/WorldObject;)V
       168: getstatic     #182                // Field ext/mods/gameserver/model/actor/attack/CreatureAttack$1.$SwitchMap$ext$mods$gameserver$enums$items$WeaponType:[I
       171: aload_0
       172: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       175: invokevirtual #375                // Method ext/mods/gameserver/model/actor/Creature.getAttackType:()Lext/mods/gameserver/enums/items/WeaponType;
       178: invokevirtual #192                // Method ext/mods/gameserver/enums/items/WeaponType.ordinal:()I
       181: iaload
       182: tableswitch   { // 1 to 4

                       1: 212

                       2: 224

                       3: 224

                       4: 236
                 default: 248
            }
       212: aload_0
       213: aload_1
       214: aload_3
       215: iload_2
       216: iload         4
       218: invokevirtual #379                // Method doAttackHitByBow:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/kind/Weapon;IZ)[Lext/mods/gameserver/model/actor/attack/CreatureAttack$HitHolder;
       221: goto          257
       224: aload_0
       225: aload_1
       226: aload_3
       227: iload_2
       228: iload         4
       230: invokevirtual #383                // Method doAttackHitByDual:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/kind/Weapon;IZ)[Lext/mods/gameserver/model/actor/attack/CreatureAttack$HitHolder;
       233: goto          257
       236: aload_0
       237: aload_1
       238: aload_3
       239: iload_2
       240: iload         4
       242: invokevirtual #386                // Method doAttackHitByPole:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/kind/Weapon;IZ)[Lext/mods/gameserver/model/actor/attack/CreatureAttack$HitHolder;
       245: goto          257
       248: aload_0
       249: aload_1
       250: aload_3
       251: iload_2
       252: iload         4
       254: invokevirtual #389                // Method doAttackHitSimple:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/kind/Weapon;IZ)[Lext/mods/gameserver/model/actor/attack/CreatureAttack$HitHolder;
       257: astore        5
       259: aload         5
       261: ifnull        284
       264: aload_0
       265: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       268: new           #392                // class ext/mods/gameserver/network/serverpackets/Attack
       271: dup
       272: aload_0
       273: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       276: aload         5
       278: invokespecial #394                // Method ext/mods/gameserver/network/serverpackets/Attack."<init>":(Lext/mods/gameserver/model/actor/Creature;[Lext/mods/gameserver/model/actor/attack/CreatureAttack$HitHolder;)V
       281: invokevirtual #397                // Method ext/mods/gameserver/model/actor/Creature.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       284: return
      LineNumberTable:
        line 284: 0
        line 285: 14
        line 288: 19
        line 289: 33
        line 292: 34
        line 293: 66
        line 296: 129
        line 297: 137
        line 298: 145
        line 299: 157
        line 301: 168
        line 302: 212
        line 303: 224
        line 304: 236
        line 305: 248
        line 301: 257
        line 308: 259
        line 310: 264
        line 312: 284
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     285     0  this   Lext/mods/gameserver/model/actor/attack/CreatureAttack;
            0     285     1 target   Lext/mods/gameserver/model/actor/Creature;
          137     148     2 timeAtk   I
          145     140     3 weaponItem   Lext/mods/gameserver/model/item/kind/Weapon;
          157     128     4 isSoulshot   Z
          259      26     5  hits   [Lext/mods/gameserver/model/actor/attack/CreatureAttack$HitHolder;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0     285     0  this   Lext/mods/gameserver/model/actor/attack/CreatureAttack<TT;>;
      StackMapTable: number_of_entries = 10
        frame_type = 19 /* same */
        frame_type = 13 /* same */
        frame_type = 0 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 94
        frame_type = 254 /* append */
          offset_delta = 82
          locals = [ int, class ext/mods/gameserver/model/item/kind/Weapon, int ]
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 72 /* same_locals_1_stack_item */
          stack = [ class "[Lext/mods/gameserver/model/actor/attack/CreatureAttack$HitHolder;" ]
        frame_type = 252 /* append */
          offset_delta = 26
          locals = [ class "[Lext/mods/gameserver/model/actor/attack/CreatureAttack$HitHolder;" ]

  public void stop();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #211                // Field _attackTask:Ljava/util/concurrent/ScheduledFuture;
         4: ifnull        23
         7: aload_0
         8: getfield      #211                // Field _attackTask:Ljava/util/concurrent/ScheduledFuture;
        11: iconst_0
        12: invokeinterface #534,  2          // InterfaceMethod java/util/concurrent/ScheduledFuture.cancel:(Z)Z
        17: pop
        18: aload_0
        19: aconst_null
        20: putfield      #211                // Field _attackTask:Ljava/util/concurrent/ScheduledFuture;
        23: aload_0
        24: iconst_1
        25: invokevirtual #147                // Method clearAttackTask:(Z)V
        28: return
      LineNumberTable:
        line 395: 0
        line 396: 7
        line 397: 18
        line 399: 23
        line 400: 28
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      29     0  this   Lext/mods/gameserver/model/actor/attack/CreatureAttack;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      29     0  this   Lext/mods/gameserver/model/actor/attack/CreatureAttack<TT;>;
      StackMapTable: number_of_entries = 1
        frame_type = 23 /* same */

  public void interrupt();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #94                 // Method isAttackingNow:()Z
         4: ifeq          24
         7: aload_0
         8: invokevirtual #106                // Method stop:()V
        11: aload_0
        12: getfield      #7                  // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        15: getstatic     #540                // Field ext/mods/gameserver/network/SystemMessageId.ATTACK_FAILED:Lext/mods/gameserver/network/SystemMessageId;
        18: invokestatic  #84                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        21: invokevirtual #90                 // Method ext/mods/gameserver/model/actor/Creature.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        24: return
      LineNumberTable:
        line 403: 0
        line 404: 7
        line 405: 11
        line 407: 24
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/gameserver/model/actor/attack/CreatureAttack;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/gameserver/model/actor/attack/CreatureAttack<TT;>;
      StackMapTable: number_of_entries = 1
        frame_type = 24 /* same */

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #140                // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #8                  // class ext/mods/gameserver/model/actor/attack/CreatureAttack
         6: invokevirtual #571                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #577                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #119                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: return
      LineNumberTable:
        line 51: 0
}
Signature: #652                         // <T:Lext/mods/gameserver/model/actor/Creature;>Ljava/lang/Object;
SourceFile: "CreatureAttack.java"
NestMembers:
  ext/mods/gameserver/model/actor/attack/CreatureAttack$1
  ext/mods/gameserver/model/actor/attack/CreatureAttack$HitHolder
BootstrapMethods:
  0: #676 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #657 ()V
      #658 REF_invokeVirtual ext/mods/gameserver/model/actor/attack/CreatureAttack.lambda$onHitTimer$0:()V
      #657 ()V
  1: #676 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #657 ()V
      #661 REF_invokeVirtual ext/mods/gameserver/model/actor/attack/CreatureAttack.lambda$onHitTimer$1:(Lext/mods/gameserver/model/actor/Creature;J)V
      #657 ()V
  2: #676 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #657 ()V
      #664 REF_invokeVirtual ext/mods/gameserver/model/actor/attack/CreatureAttack.lambda$onHitTimer$3:(Lext/mods/gameserver/model/actor/Creature;)V
      #657 ()V
  3: #676 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #657 ()V
      #667 REF_invokeVirtual ext/mods/gameserver/model/actor/attack/CreatureAttack.lambda$onHitTimer$4:(Lext/mods/gameserver/model/actor/Creature;)V
      #657 ()V
  4: #676 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #657 ()V
      #670 REF_invokeVirtual ext/mods/gameserver/model/actor/attack/CreatureAttack.onHitTimer:()V
      #657 ()V
  5: #676 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #657 ()V
      #673 REF_invokeVirtual ext/mods/gameserver/model/actor/attack/CreatureAttack.lambda$onHitTimer$2:(Lext/mods/gameserver/model/actor/Creature;)V
      #657 ()V
InnerClasses:
  public static #684= #102 of #8;         // HitHolder=class ext/mods/gameserver/model/actor/attack/CreatureAttack$HitHolder of class ext/mods/gameserver/model/actor/attack/CreatureAttack
  static #183;                            // class ext/mods/gameserver/model/actor/attack/CreatureAttack$1
  public static final #689= #685 of #687; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
