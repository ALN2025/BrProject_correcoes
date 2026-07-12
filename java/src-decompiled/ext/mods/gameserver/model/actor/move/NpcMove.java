// Bytecode for: ext.mods.gameserver.model.actor.move.NpcMove
// File: ext\mods\gameserver\model\actor\move\NpcMove.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/move/NpcMove.class
  Last modified 9 de jul de 2026; size 17710 bytes
  MD5 checksum 712dde34f0255db066c88c2ece555eaf
  Compiled from "NpcMove.kt"
public final class ext.mods.gameserver.model.actor.move.NpcMove extends ext.mods.gameserver.model.actor.move.CreatureMove<ext.mods.gameserver.model.actor.Npc>
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/model/actor/move/NpcMove
  super_class: #5                         // ext/mods/gameserver/model/actor/move/CreatureMove
  interfaces: 0, fields: 4, methods: 12, attributes: 6
Constant pool:
    #1 = Utf8               ext/mods/gameserver/model/actor/move/NpcMove
    #2 = Class              #1            // ext/mods/gameserver/model/actor/move/NpcMove
    #3 = Utf8               Lext/mods/gameserver/model/actor/move/CreatureMove<Lext/mods/gameserver/model/actor/Npc;>;
    #4 = Utf8               ext/mods/gameserver/model/actor/move/CreatureMove
    #5 = Class              #4            // ext/mods/gameserver/model/actor/move/CreatureMove
    #6 = Utf8               <init>
    #7 = Utf8               (Lext/mods/gameserver/model/actor/Npc;)V
    #8 = Utf8               Lorg/jetbrains/annotations/NotNull;
    #9 = Utf8               ext/mods/gameserver/model/actor/Creature
   #10 = Class              #9            // ext/mods/gameserver/model/actor/Creature
   #11 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
   #12 = NameAndType        #6:#11        // "<init>":(Lext/mods/gameserver/model/actor/Creature;)V
   #13 = Methodref          #5.#12        // ext/mods/gameserver/model/actor/move/CreatureMove."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
   #14 = Utf8               java/lang/Object
   #15 = Class              #14           // java/lang/Object
   #16 = Utf8               ()V
   #17 = NameAndType        #6:#16        // "<init>":()V
   #18 = Methodref          #15.#17       // java/lang/Object."<init>":()V
   #19 = Utf8               frontSlowOwner
   #20 = Utf8               Ljava/lang/Object;
   #21 = NameAndType        #19:#20       // frontSlowOwner:Ljava/lang/Object;
   #22 = Fieldref           #2.#21        // ext/mods/gameserver/model/actor/move/NpcMove.frontSlowOwner:Ljava/lang/Object;
   #23 = Utf8               this
   #24 = Utf8               Lext/mods/gameserver/model/actor/move/NpcMove;
   #25 = Utf8               actor
   #26 = Utf8               Lext/mods/gameserver/model/actor/Npc;
   #27 = Utf8               offensiveFollowTask
   #28 = Utf8               (Lext/mods/gameserver/model/actor/Creature;I)V
   #29 = Utf8               _followTask
   #30 = Utf8               Ljava/util/concurrent/ScheduledFuture;
   #31 = NameAndType        #29:#30       // _followTask:Ljava/util/concurrent/ScheduledFuture;
   #32 = Fieldref           #2.#31        // ext/mods/gameserver/model/actor/move/NpcMove._followTask:Ljava/util/concurrent/ScheduledFuture;
   #33 = Utf8               java/util/concurrent/ScheduledFuture
   #34 = Class              #33           // java/util/concurrent/ScheduledFuture
   #35 = Utf8               isCancelled
   #36 = Utf8               ()Z
   #37 = NameAndType        #35:#36       // isCancelled:()Z
   #38 = InterfaceMethodref #34.#37       // java/util/concurrent/ScheduledFuture.isCancelled:()Z
   #39 = Utf8               isAlikeDead
   #40 = NameAndType        #39:#36       // isAlikeDead:()Z
   #41 = Methodref          #10.#40       // ext/mods/gameserver/model/actor/Creature.isAlikeDead:()Z
   #42 = Utf8               clearFrontSlow
   #43 = NameAndType        #42:#16       // clearFrontSlow:()V
   #44 = Methodref          #2.#43        // ext/mods/gameserver/model/actor/move/NpcMove.clearFrontSlow:()V
   #45 = Utf8               cancelFollowTask
   #46 = NameAndType        #45:#16       // cancelFollowTask:()V
   #47 = Methodref          #2.#46        // ext/mods/gameserver/model/actor/move/NpcMove.cancelFollowTask:()V
   #48 = Utf8               _actor
   #49 = Utf8               Lext/mods/gameserver/model/actor/Creature;
   #50 = NameAndType        #48:#49       // _actor:Lext/mods/gameserver/model/actor/Creature;
   #51 = Fieldref           #2.#50        // ext/mods/gameserver/model/actor/move/NpcMove._actor:Lext/mods/gameserver/model/actor/Creature;
   #52 = Utf8               ext/mods/gameserver/model/actor/Npc
   #53 = Class              #52           // ext/mods/gameserver/model/actor/Npc
   #54 = Utf8               ext/mods/gameserver/model/WorldObject
   #55 = Class              #54           // ext/mods/gameserver/model/WorldObject
   #56 = Utf8               knows
   #57 = Utf8               (Lext/mods/gameserver/model/WorldObject;)Z
   #58 = NameAndType        #56:#57       // knows:(Lext/mods/gameserver/model/WorldObject;)Z
   #59 = Methodref          #53.#58       // ext/mods/gameserver/model/actor/Npc.knows:(Lext/mods/gameserver/model/WorldObject;)Z
   #60 = Utf8               getAI
   #61 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
   #62 = NameAndType        #60:#61       // getAI:()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
   #63 = Methodref          #53.#62       // ext/mods/gameserver/model/actor/Npc.getAI:()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
   #64 = Utf8               ext/mods/gameserver/model/actor/ai/type/NpcAI
   #65 = Class              #64           // ext/mods/gameserver/model/actor/ai/type/NpcAI
   #66 = Utf8               stopFollow
   #67 = NameAndType        #66:#16       // stopFollow:()V
   #68 = Methodref          #65.#67       // ext/mods/gameserver/model/actor/ai/type/NpcAI.stopFollow:()V
   #69 = Utf8               ext/mods/gameserver/network/serverpackets/StopMove
   #70 = Class              #69           // ext/mods/gameserver/network/serverpackets/StopMove
   #71 = Methodref          #70.#12       // ext/mods/gameserver/network/serverpackets/StopMove."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
   #72 = Utf8               ext/mods/gameserver/network/serverpackets/L2GameServerPacket
   #73 = Class              #72           // ext/mods/gameserver/network/serverpackets/L2GameServerPacket
   #74 = Utf8               broadcastPacket
   #75 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #76 = NameAndType        #74:#75       // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #77 = Methodref          #53.#76       // ext/mods/gameserver/model/actor/Npc.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #78 = Utf8               ext/mods/gameserver/enums/AiEventType
   #79 = Class              #78           // ext/mods/gameserver/enums/AiEventType
   #80 = Utf8               THINK
   #81 = Utf8               Lext/mods/gameserver/enums/AiEventType;
   #82 = NameAndType        #80:#81       // THINK:Lext/mods/gameserver/enums/AiEventType;
   #83 = Fieldref           #79.#82       // ext/mods/gameserver/enums/AiEventType.THINK:Lext/mods/gameserver/enums/AiEventType;
   #84 = Utf8               notifyEvent
   #85 = Utf8               (Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
   #86 = NameAndType        #84:#85       // notifyEvent:(Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
   #87 = Methodref          #65.#86       // ext/mods/gameserver/model/actor/ai/type/NpcAI.notifyEvent:(Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
   #88 = Utf8               ext/mods/Config
   #89 = Class              #88           // ext/mods/Config
   #90 = Utf8               DEBUG_MELEE_ATTACK
   #91 = Utf8               Z
   #92 = NameAndType        #90:#91       // DEBUG_MELEE_ATTACK:Z
   #93 = Fieldref           #89.#92       // ext/mods/Config.DEBUG_MELEE_ATTACK:Z
   #94 = Utf8               LOGGER
   #95 = Utf8               Lext/mods/commons/logging/CLogger;
   #96 = NameAndType        #94:#95       // LOGGER:Lext/mods/commons/logging/CLogger;
   #97 = Fieldref           #2.#96        // ext/mods/gameserver/model/actor/move/NpcMove.LOGGER:Lext/mods/commons/logging/CLogger;
   #98 = Utf8               [MeleeDebug] follow: lostKnownlist npc={} target={}
   #99 = String             #98           // [MeleeDebug] follow: lostKnownlist npc={} target={}
  #100 = Utf8               getObjectId
  #101 = Utf8               ()I
  #102 = NameAndType        #100:#101     // getObjectId:()I
  #103 = Methodref          #53.#102      // ext/mods/gameserver/model/actor/Npc.getObjectId:()I
  #104 = Utf8               java/lang/Integer
  #105 = Class              #104          // java/lang/Integer
  #106 = Utf8               valueOf
  #107 = Utf8               (I)Ljava/lang/Integer;
  #108 = NameAndType        #106:#107     // valueOf:(I)Ljava/lang/Integer;
  #109 = Methodref          #105.#108     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #110 = Methodref          #10.#102      // ext/mods/gameserver/model/actor/Creature.getObjectId:()I
  #111 = Utf8               ext/mods/commons/logging/CLogger
  #112 = Class              #111          // ext/mods/commons/logging/CLogger
  #113 = Utf8               info
  #114 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
  #115 = NameAndType        #113:#114     // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #116 = Methodref          #112.#115     // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #117 = Utf8               getPosition
  #118 = Utf8               ()Lext/mods/gameserver/model/location/SpawnLocation;
  #119 = NameAndType        #117:#118     // getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #120 = Methodref          #10.#119      // ext/mods/gameserver/model/actor/Creature.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #121 = Utf8               ext/mods/gameserver/model/location/Location
  #122 = Class              #121          // ext/mods/gameserver/model/location/Location
  #123 = Utf8               distance3D
  #124 = Utf8               (Lext/mods/gameserver/model/location/Location;)D
  #125 = NameAndType        #123:#124     // distance3D:(Lext/mods/gameserver/model/location/Location;)D
  #126 = Methodref          #53.#125      // ext/mods/gameserver/model/actor/Npc.distance3D:(Lext/mods/gameserver/model/location/Location;)D
  #127 = Utf8               applySoftRepulsion
  #128 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
  #129 = NameAndType        #127:#128     // applySoftRepulsion:(Lext/mods/gameserver/model/actor/Creature;)Z
  #130 = Methodref          #2.#129       // ext/mods/gameserver/model/actor/move/NpcMove.applySoftRepulsion:(Lext/mods/gameserver/model/actor/Creature;)Z
  #131 = Double             300.0d
  #133 = Utf8               getAllSkillsDisabled
  #134 = NameAndType        #133:#36      // getAllSkillsDisabled:()Z
  #135 = Methodref          #53.#134      // ext/mods/gameserver/model/actor/Npc.getAllSkillsDisabled:()Z
  #136 = Utf8               getCast
  #137 = Utf8               ()Lext/mods/gameserver/model/actor/cast/NpcCast;
  #138 = NameAndType        #136:#137     // getCast:()Lext/mods/gameserver/model/actor/cast/NpcCast;
  #139 = Methodref          #53.#138      // ext/mods/gameserver/model/actor/Npc.getCast:()Lext/mods/gameserver/model/actor/cast/NpcCast;
  #140 = Utf8               ext/mods/gameserver/model/actor/cast/NpcCast
  #141 = Class              #140          // ext/mods/gameserver/model/actor/cast/NpcCast
  #142 = Utf8               isCastingNow
  #143 = NameAndType        #142:#36      // isCastingNow:()Z
  #144 = Methodref          #141.#143     // ext/mods/gameserver/model/actor/cast/NpcCast.isCastingNow:()Z
  #145 = Utf8               selectMagicSkill
  #146 = Utf8               ()Lext/mods/gameserver/skills/L2Skill;
  #147 = NameAndType        #145:#146     // selectMagicSkill:()Lext/mods/gameserver/skills/L2Skill;
  #148 = Methodref          #2.#147       // ext/mods/gameserver/model/actor/move/NpcMove.selectMagicSkill:()Lext/mods/gameserver/skills/L2Skill;
  #149 = Utf8               getStatus
  #150 = Utf8               ()Lext/mods/gameserver/model/actor/status/NpcStatus;
  #151 = NameAndType        #149:#150     // getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
  #152 = Methodref          #53.#151      // ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
  #153 = Utf8               ext/mods/gameserver/model/actor/status/NpcStatus
  #154 = Class              #153          // ext/mods/gameserver/model/actor/status/NpcStatus
  #155 = Utf8               getMpConsume
  #156 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)I
  #157 = NameAndType        #155:#156     // getMpConsume:(Lext/mods/gameserver/skills/L2Skill;)I
  #158 = Methodref          #154.#157     // ext/mods/gameserver/model/actor/status/NpcStatus.getMpConsume:(Lext/mods/gameserver/skills/L2Skill;)I
  #159 = Utf8               getMp
  #160 = Utf8               ()D
  #161 = NameAndType        #159:#160     // getMp:()D
  #162 = Methodref          #154.#161     // ext/mods/gameserver/model/actor/status/NpcStatus.getMp:()D
  #163 = Utf8               ext/mods/commons/random/Rnd
  #164 = Class              #163          // ext/mods/commons/random/Rnd
  #165 = Utf8               get
  #166 = Utf8               (I)I
  #167 = NameAndType        #165:#166     // get:(I)I
  #168 = Methodref          #164.#167     // ext/mods/commons/random/Rnd.get:(I)I
  #169 = Double             100000.0d
  #171 = Utf8               addCastDesire
  #172 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;DZZ)V
  #173 = NameAndType        #171:#172     // addCastDesire:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;DZZ)V
  #174 = Methodref          #65.#173      // ext/mods/gameserver/model/actor/ai/type/NpcAI.addCastDesire:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;DZZ)V
  #175 = Utf8               kotlin/ranges/RangesKt
  #176 = Class              #175          // kotlin/ranges/RangesKt
  #177 = Utf8               coerceAtLeast
  #178 = Utf8               (II)I
  #179 = NameAndType        #177:#178     // coerceAtLeast:(II)I
  #180 = Methodref          #176.#179     // kotlin/ranges/RangesKt.coerceAtLeast:(II)I
  #181 = Utf8               getCollisionRadius
  #182 = NameAndType        #181:#160     // getCollisionRadius:()D
  #183 = Methodref          #53.#182      // ext/mods/gameserver/model/actor/Npc.getCollisionRadius:()D
  #184 = Methodref          #10.#182      // ext/mods/gameserver/model/actor/Creature.getCollisionRadius:()D
  #185 = Utf8               tryRouteDeviationForFrontBlocker
  #186 = Utf8               (Lext/mods/gameserver/model/actor/Creature;I)Z
  #187 = NameAndType        #185:#186     // tryRouteDeviationForFrontBlocker:(Lext/mods/gameserver/model/actor/Creature;I)Z
  #188 = Methodref          #2.#187       // ext/mods/gameserver/model/actor/move/NpcMove.tryRouteDeviationForFrontBlocker:(Lext/mods/gameserver/model/actor/Creature;I)Z
  #189 = Utf8               updateFrontSlow
  #190 = NameAndType        #189:#28      // updateFrontSlow:(Lext/mods/gameserver/model/actor/Creature;I)V
  #191 = Methodref          #2.#190       // ext/mods/gameserver/model/actor/move/NpcMove.updateFrontSlow:(Lext/mods/gameserver/model/actor/Creature;I)V
  #192 = Utf8               MONSTER_MAX_RANGE
  #193 = Utf8               I
  #194 = NameAndType        #192:#193     // MONSTER_MAX_RANGE:I
  #195 = Fieldref           #89.#194      // ext/mods/Config.MONSTER_MAX_RANGE:I
  #196 = Utf8               (DD)D
  #197 = NameAndType        #177:#196     // coerceAtLeast:(DD)D
  #198 = Methodref          #176.#197     // kotlin/ranges/RangesKt.coerceAtLeast:(DD)D
  #199 = Utf8               getKnownTypeInRadius
  #200 = Utf8               (Ljava/lang/Class;I)Ljava/util/List;
  #201 = NameAndType        #199:#200     // getKnownTypeInRadius:(Ljava/lang/Class;I)Ljava/util/List;
  #202 = Methodref          #53.#201      // ext/mods/gameserver/model/actor/Npc.getKnownTypeInRadius:(Ljava/lang/Class;I)Ljava/util/List;
  #203 = Utf8               java/util/List
  #204 = Class              #203          // java/util/List
  #205 = Utf8               iterator
  #206 = Utf8               ()Ljava/util/Iterator;
  #207 = NameAndType        #205:#206     // iterator:()Ljava/util/Iterator;
  #208 = InterfaceMethodref #204.#207     // java/util/List.iterator:()Ljava/util/Iterator;
  #209 = Utf8               java/util/Iterator
  #210 = Class              #209          // java/util/Iterator
  #211 = Utf8               hasNext
  #212 = NameAndType        #211:#36      // hasNext:()Z
  #213 = InterfaceMethodref #210.#212     // java/util/Iterator.hasNext:()Z
  #214 = Utf8               next
  #215 = Utf8               ()Ljava/lang/Object;
  #216 = NameAndType        #214:#215     // next:()Ljava/lang/Object;
  #217 = InterfaceMethodref #210.#216     // java/util/Iterator.next:()Ljava/lang/Object;
  #218 = Utf8               kotlin/jvm/internal/Intrinsics
  #219 = Class              #218          // kotlin/jvm/internal/Intrinsics
  #220 = Utf8               areEqual
  #221 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Z
  #222 = NameAndType        #220:#221     // areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
  #223 = Methodref          #219.#222     // kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
  #224 = Methodref          #53.#40       // ext/mods/gameserver/model/actor/Npc.isAlikeDead:()Z
  #225 = Utf8               (Lext/mods/gameserver/model/WorldObject;)D
  #226 = NameAndType        #123:#225     // distance3D:(Lext/mods/gameserver/model/WorldObject;)D
  #227 = Methodref          #53.#226      // ext/mods/gameserver/model/actor/Npc.distance3D:(Lext/mods/gameserver/model/WorldObject;)D
  #228 = Utf8               java/lang/Math
  #229 = Class              #228          // java/lang/Math
  #230 = Utf8               abs
  #231 = Utf8               (D)D
  #232 = NameAndType        #230:#231     // abs:(D)D
  #233 = Methodref          #229.#232     // java/lang/Math.abs:(D)D
  #234 = Double             35.0d
  #236 = Double             2.0d
  #238 = Methodref          #53.#119      // ext/mods/gameserver/model/actor/Npc.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #239 = Utf8               ext/mods/gameserver/model/location/SpawnLocation
  #240 = Class              #239          // ext/mods/gameserver/model/location/SpawnLocation
  #241 = Utf8               setHeadingTo
  #242 = Utf8               (Lext/mods/gameserver/model/location/Location;)V
  #243 = NameAndType        #241:#242     // setHeadingTo:(Lext/mods/gameserver/model/location/Location;)V
  #244 = Methodref          #240.#243     // ext/mods/gameserver/model/location/SpawnLocation.setHeadingTo:(Lext/mods/gameserver/model/location/Location;)V
  #245 = Utf8               [MeleeDebug] follow: meleeArrived npc={} target={} dist={} range={}
  #246 = String             #245          // [MeleeDebug] follow: meleeArrived npc={} target={} dist={} range={}
  #247 = Utf8               java/lang/Double
  #248 = Class              #247          // java/lang/Double
  #249 = Utf8               (D)Ljava/lang/Double;
  #250 = NameAndType        #106:#249     // valueOf:(D)Ljava/lang/Double;
  #251 = Methodref          #248.#250     // java/lang/Double.valueOf:(D)Ljava/lang/Double;
  #252 = Utf8               stop
  #253 = NameAndType        #252:#16      // stop:()V
  #254 = Methodref          #2.#253       // ext/mods/gameserver/model/actor/move/NpcMove.stop:()V
  #255 = Utf8               ARRIVED
  #256 = NameAndType        #255:#81      // ARRIVED:Lext/mods/gameserver/enums/AiEventType;
  #257 = Fieldref           #79.#256      // ext/mods/gameserver/enums/AiEventType.ARRIVED:Lext/mods/gameserver/enums/AiEventType;
  #258 = Utf8               _separationForceX
  #259 = Utf8               D
  #260 = NameAndType        #258:#259     // _separationForceX:D
  #261 = Fieldref           #2.#260       // ext/mods/gameserver/model/actor/move/NpcMove._separationForceX:D
  #262 = Double             0.1d
  #264 = Utf8               _separationForceY
  #265 = NameAndType        #264:#259     // _separationForceY:D
  #266 = Fieldref           #2.#265       // ext/mods/gameserver/model/actor/move/NpcMove._separationForceY:D
  #267 = Utf8               wouldCollideInPath
  #268 = Utf8               (Lext/mods/gameserver/model/location/Location;)Z
  #269 = NameAndType        #267:#268     // wouldCollideInPath:(Lext/mods/gameserver/model/location/Location;)Z
  #270 = Methodref          #2.#269       // ext/mods/gameserver/model/actor/move/NpcMove.wouldCollideInPath:(Lext/mods/gameserver/model/location/Location;)Z
  #271 = Utf8               findBestAttackSlot
  #272 = Utf8               (Lext/mods/gameserver/model/actor/Creature;I)Lext/mods/gameserver/model/location/Location;
  #273 = NameAndType        #271:#272     // findBestAttackSlot:(Lext/mods/gameserver/model/actor/Creature;I)Lext/mods/gameserver/model/location/Location;
  #274 = Methodref          #2.#273       // ext/mods/gameserver/model/actor/move/NpcMove.findBestAttackSlot:(Lext/mods/gameserver/model/actor/Creature;I)Lext/mods/gameserver/model/location/Location;
  #275 = Utf8               _destination
  #276 = Utf8               Lext/mods/gameserver/model/location/Location;
  #277 = NameAndType        #275:#276     // _destination:Lext/mods/gameserver/model/location/Location;
  #278 = Fieldref           #2.#277       // ext/mods/gameserver/model/actor/move/NpcMove._destination:Lext/mods/gameserver/model/location/Location;
  #279 = Methodref          #122.#125     // ext/mods/gameserver/model/location/Location.distance3D:(Lext/mods/gameserver/model/location/Location;)D
  #280 = Double             25.0d
  #282 = Utf8               moveToLocation
  #283 = Utf8               (Lext/mods/gameserver/model/location/Location;Z)V
  #284 = NameAndType        #282:#283     // moveToLocation:(Lext/mods/gameserver/model/location/Location;Z)V
  #285 = Methodref          #2.#284       // ext/mods/gameserver/model/actor/move/NpcMove.moveToLocation:(Lext/mods/gameserver/model/location/Location;Z)V
  #286 = Utf8               ai
  #287 = Utf8               Lext/mods/gameserver/model/actor/ai/type/NpcAI;
  #288 = Utf8               mpConsume
  #289 = Utf8               hasMp
  #290 = Utf8               chance
  #291 = Utf8               magicSkill
  #292 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #293 = Utf8               adjustedRange
  #294 = Utf8               distToBlocker
  #295 = Utf8               blockerToTarget
  #296 = Utf8               blocker
  #297 = Utf8               blockers
  #298 = Utf8               Ljava/util/List;
  #299 = Utf8               usePathfinding
  #300 = Utf8               bestSlot
  #301 = Utf8               currentTask
  #302 = Utf8               targetLoc
  #303 = Utf8               Lext/mods/gameserver/model/location/SpawnLocation;
  #304 = Utf8               dist
  #305 = Utf8               layer
  #306 = Utf8               layeredOffset
  #307 = Utf8               totalRange
  #308 = Utf8               attackMargin
  #309 = Utf8               minSafeRange
  #310 = Utf8               maxSafeRange
  #311 = Utf8               isBlocked
  #312 = Utf8               target
  #313 = Utf8               offset
  #314 = Utf8               ext/mods/gameserver/skills/L2Skill
  #315 = Class              #314          // ext/mods/gameserver/skills/L2Skill
  #316 = Utf8               java/util/Collection
  #317 = Class              #316          // java/util/Collection
  #318 = Utf8               isEmpty
  #319 = NameAndType        #318:#36      // isEmpty:()Z
  #320 = InterfaceMethodref #317.#319     // java/util/Collection.isEmpty:()Z
  #321 = Methodref          #10.#226      // ext/mods/gameserver/model/actor/Creature.distance3D:(Lext/mods/gameserver/model/WorldObject;)D
  #322 = Double             15.0d
  #324 = Utf8               getX
  #325 = NameAndType        #324:#101     // getX:()I
  #326 = Methodref          #53.#325      // ext/mods/gameserver/model/actor/Npc.getX:()I
  #327 = Methodref          #10.#325      // ext/mods/gameserver/model/actor/Creature.getX:()I
  #328 = Utf8               getY
  #329 = NameAndType        #328:#101     // getY:()I
  #330 = Methodref          #53.#329      // ext/mods/gameserver/model/actor/Npc.getY:()I
  #331 = Methodref          #10.#329      // ext/mods/gameserver/model/actor/Creature.getY:()I
  #332 = Double             0.5d
  #334 = Utf8               getZ
  #335 = NameAndType        #334:#101     // getZ:()I
  #336 = Methodref          #53.#335      // ext/mods/gameserver/model/actor/Npc.getZ:()I
  #337 = Utf8               (III)V
  #338 = NameAndType        #6:#337       // "<init>":(III)V
  #339 = Methodref          #122.#338     // ext/mods/gameserver/model/location/Location."<init>":(III)V
  #340 = Utf8               overlap
  #341 = Utf8               dx
  #342 = Utf8               dy
  #343 = Utf8               pushForce
  #344 = Utf8               curDist
  #345 = Utf8               minDist
  #346 = Utf8               other
  #347 = Utf8               nx
  #348 = Utf8               ny
  #349 = Utf8               nz
  #350 = Utf8               neighbors
  #351 = Utf8               totalPushX
  #352 = Utf8               totalPushY
  #353 = Utf8               needsMovement
  #354 = Utf8               hasFrontBlocker
  #355 = NameAndType        #354:#128     // hasFrontBlocker:(Lext/mods/gameserver/model/actor/Creature;)Z
  #356 = Methodref          #2.#355       // ext/mods/gameserver/model/actor/move/NpcMove.hasFrontBlocker:(Lext/mods/gameserver/model/actor/Creature;)Z
  #357 = Utf8               frontSlowApplied
  #358 = NameAndType        #357:#91      // frontSlowApplied:Z
  #359 = Fieldref           #2.#358       // ext/mods/gameserver/model/actor/move/NpcMove.frontSlowApplied:Z
  #360 = Utf8               ext/mods/gameserver/skills/basefuncs/FuncMul
  #361 = Class              #360          // ext/mods/gameserver/skills/basefuncs/FuncMul
  #362 = Utf8               ext/mods/gameserver/enums/skills/Stats
  #363 = Class              #362          // ext/mods/gameserver/enums/skills/Stats
  #364 = Utf8               RUN_SPEED
  #365 = Utf8               Lext/mods/gameserver/enums/skills/Stats;
  #366 = NameAndType        #364:#365     // RUN_SPEED:Lext/mods/gameserver/enums/skills/Stats;
  #367 = Fieldref           #363.#366     // ext/mods/gameserver/enums/skills/Stats.RUN_SPEED:Lext/mods/gameserver/enums/skills/Stats;
  #368 = Double             0.9d
  #370 = Utf8               (Ljava/lang/Object;Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/skills/conditions/Condition;)V
  #371 = NameAndType        #6:#370       // "<init>":(Ljava/lang/Object;Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/skills/conditions/Condition;)V
  #372 = Methodref          #361.#371     // ext/mods/gameserver/skills/basefuncs/FuncMul."<init>":(Ljava/lang/Object;Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/skills/conditions/Condition;)V
  #373 = Utf8               ext/mods/gameserver/skills/basefuncs/Func
  #374 = Class              #373          // ext/mods/gameserver/skills/basefuncs/Func
  #375 = Utf8               addStatFunc
  #376 = Utf8               (Lext/mods/gameserver/skills/basefuncs/Func;)V
  #377 = NameAndType        #375:#376     // addStatFunc:(Lext/mods/gameserver/skills/basefuncs/Func;)V
  #378 = Methodref          #53.#377      // ext/mods/gameserver/model/actor/Npc.addStatFunc:(Lext/mods/gameserver/skills/basefuncs/Func;)V
  #379 = Utf8               hasBlocker
  #380 = Utf8               removeStatsByOwner
  #381 = Utf8               (Ljava/lang/Object;)V
  #382 = NameAndType        #380:#381     // removeStatsByOwner:(Ljava/lang/Object;)V
  #383 = Methodref          #53.#382      // ext/mods/gameserver/model/actor/Npc.removeStatsByOwner:(Ljava/lang/Object;)V
  #384 = Methodref          #122.#325     // ext/mods/gameserver/model/location/Location.getX:()I
  #385 = Methodref          #122.#329     // ext/mods/gameserver/model/location/Location.getY:()I
  #386 = Methodref          #10.#335      // ext/mods/gameserver/model/actor/Creature.getZ:()I
  #387 = Utf8               finalLocation
  #388 = Utf8               sqrt
  #389 = NameAndType        #388:#231     // sqrt:(D)D
  #390 = Methodref          #229.#389     // java/lang/Math.sqrt:(D)D
  #391 = Utf8               java/lang/Iterable
  #392 = Class              #391          // java/lang/Iterable
  #393 = InterfaceMethodref #392.#207     // java/lang/Iterable.iterator:()Ljava/util/Iterator;
  #394 = Double             0.7d
  #396 = Utf8               $i$a$-any-NpcMove$hasFrontBlocker$1
  #397 = Utf8               ox
  #398 = Utf8               oy
  #399 = Utf8               oLen
  #400 = Utf8               dot
  #401 = Utf8               closerToTarget
  #402 = Utf8               element$iv
  #403 = Utf8               $i$f$any
  #404 = Utf8               $this$any$iv
  #405 = Utf8               Ljava/lang/Iterable;
  #406 = Utf8               tx
  #407 = Utf8               ty
  #408 = Utf8               tLen
  #409 = Utf8               dirX
  #410 = Utf8               dirY
  #411 = Utf8               getTemplate
  #412 = Utf8               ()Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #413 = NameAndType        #411:#412     // getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #414 = Methodref          #53.#413      // ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #415 = Utf8               ext/mods/gameserver/enums/actors/NpcSkillType
  #416 = Class              #415          // ext/mods/gameserver/enums/actors/NpcSkillType
  #417 = Utf8               DD_MAGIC
  #418 = Utf8               Lext/mods/gameserver/enums/actors/NpcSkillType;
  #419 = NameAndType        #417:#418     // DD_MAGIC:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #420 = Fieldref           #416.#419     // ext/mods/gameserver/enums/actors/NpcSkillType.DD_MAGIC:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #421 = Utf8               DD_MAGIC1
  #422 = NameAndType        #421:#418     // DD_MAGIC1:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #423 = Fieldref           #416.#422     // ext/mods/gameserver/enums/actors/NpcSkillType.DD_MAGIC1:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #424 = Utf8               DD_MAGIC2
  #425 = NameAndType        #424:#418     // DD_MAGIC2:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #426 = Fieldref           #416.#425     // ext/mods/gameserver/enums/actors/NpcSkillType.DD_MAGIC2:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #427 = Utf8               DD_MAGIC3
  #428 = NameAndType        #427:#418     // DD_MAGIC3:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #429 = Fieldref           #416.#428     // ext/mods/gameserver/enums/actors/NpcSkillType.DD_MAGIC3:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #430 = Utf8               DD_MAGIC_SLOW
  #431 = NameAndType        #430:#418     // DD_MAGIC_SLOW:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #432 = Fieldref           #416.#431     // ext/mods/gameserver/enums/actors/NpcSkillType.DD_MAGIC_SLOW:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #433 = Utf8               LONG_RANGE_DD_MAGIC1
  #434 = NameAndType        #433:#418     // LONG_RANGE_DD_MAGIC1:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #435 = Fieldref           #416.#434     // ext/mods/gameserver/enums/actors/NpcSkillType.LONG_RANGE_DD_MAGIC1:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #436 = Utf8               RANGE_DD
  #437 = NameAndType        #436:#418     // RANGE_DD:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #438 = Fieldref           #416.#437     // ext/mods/gameserver/enums/actors/NpcSkillType.RANGE_DD:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #439 = Utf8               RANGE_DD_MAGIC1
  #440 = NameAndType        #439:#418     // RANGE_DD_MAGIC1:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #441 = Fieldref           #416.#440     // ext/mods/gameserver/enums/actors/NpcSkillType.RANGE_DD_MAGIC1:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #442 = Utf8               RANGE_DD_MAGIC_A
  #443 = NameAndType        #442:#418     // RANGE_DD_MAGIC_A:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #444 = Fieldref           #416.#443     // ext/mods/gameserver/enums/actors/NpcSkillType.RANGE_DD_MAGIC_A:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #445 = Utf8               W_LONG_RANGE_DD_MAGIC
  #446 = NameAndType        #445:#418     // W_LONG_RANGE_DD_MAGIC:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #447 = Fieldref           #416.#446     // ext/mods/gameserver/enums/actors/NpcSkillType.W_LONG_RANGE_DD_MAGIC:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #448 = Utf8               W_LONG_RANGE_DD_MAGIC1
  #449 = NameAndType        #448:#418     // W_LONG_RANGE_DD_MAGIC1:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #450 = Fieldref           #416.#449     // ext/mods/gameserver/enums/actors/NpcSkillType.W_LONG_RANGE_DD_MAGIC1:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #451 = Utf8               W_LONG_RANGE_DD_MAGIC2
  #452 = NameAndType        #451:#418     // W_LONG_RANGE_DD_MAGIC2:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #453 = Fieldref           #416.#452     // ext/mods/gameserver/enums/actors/NpcSkillType.W_LONG_RANGE_DD_MAGIC2:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #454 = Utf8               W_MIDDLE_RANGE_DD_MAGIC
  #455 = NameAndType        #454:#418     // W_MIDDLE_RANGE_DD_MAGIC:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #456 = Fieldref           #416.#455     // ext/mods/gameserver/enums/actors/NpcSkillType.W_MIDDLE_RANGE_DD_MAGIC:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #457 = Utf8               W_SHORT_RANGE_DD_MAGIC
  #458 = NameAndType        #457:#418     // W_SHORT_RANGE_DD_MAGIC:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #459 = Fieldref           #416.#458     // ext/mods/gameserver/enums/actors/NpcSkillType.W_SHORT_RANGE_DD_MAGIC:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #460 = Utf8               SELF_RANGE_DD_MAGIC
  #461 = NameAndType        #460:#418     // SELF_RANGE_DD_MAGIC:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #462 = Fieldref           #416.#461     // ext/mods/gameserver/enums/actors/NpcSkillType.SELF_RANGE_DD_MAGIC:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #463 = Utf8               SELF_RANGE_DD_MAGIC1
  #464 = NameAndType        #463:#418     // SELF_RANGE_DD_MAGIC1:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #465 = Fieldref           #416.#464     // ext/mods/gameserver/enums/actors/NpcSkillType.SELF_RANGE_DD_MAGIC1:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #466 = Utf8               SELF_RANGE_DD_MAGIC2
  #467 = NameAndType        #466:#418     // SELF_RANGE_DD_MAGIC2:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #468 = Fieldref           #416.#467     // ext/mods/gameserver/enums/actors/NpcSkillType.SELF_RANGE_DD_MAGIC2:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #469 = Utf8               SELF_RANGE_DD_MAGIC3
  #470 = NameAndType        #469:#418     // SELF_RANGE_DD_MAGIC3:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #471 = Fieldref           #416.#470     // ext/mods/gameserver/enums/actors/NpcSkillType.SELF_RANGE_DD_MAGIC3:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #472 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
  #473 = Class              #472          // ext/mods/gameserver/model/actor/template/NpcTemplate
  #474 = Utf8               getSkills
  #475 = Utf8               ([Lext/mods/gameserver/enums/actors/NpcSkillType;)Ljava/util/List;
  #476 = NameAndType        #474:#475     // getSkills:([Lext/mods/gameserver/enums/actors/NpcSkillType;)Ljava/util/List;
  #477 = Methodref          #473.#476     // ext/mods/gameserver/model/actor/template/NpcTemplate.getSkills:([Lext/mods/gameserver/enums/actors/NpcSkillType;)Ljava/util/List;
  #478 = InterfaceMethodref #204.#319     // java/util/List.isEmpty:()Z
  #479 = Utf8               java/util/ArrayList
  #480 = Class              #479          // java/util/ArrayList
  #481 = Methodref          #480.#17      // java/util/ArrayList."<init>":()V
  #482 = Utf8               isMagic
  #483 = NameAndType        #482:#36      // isMagic:()Z
  #484 = Methodref          #315.#483     // ext/mods/gameserver/skills/L2Skill.isMagic:()Z
  #485 = Utf8               isOffensive
  #486 = NameAndType        #485:#36      // isOffensive:()Z
  #487 = Methodref          #315.#486     // ext/mods/gameserver/skills/L2Skill.isOffensive:()Z
  #488 = Utf8               isDebuff
  #489 = NameAndType        #488:#36      // isDebuff:()Z
  #490 = Methodref          #315.#489     // ext/mods/gameserver/skills/L2Skill.isDebuff:()Z
  #491 = Utf8               add
  #492 = Utf8               (Ljava/lang/Object;)Z
  #493 = NameAndType        #491:#492     // add:(Ljava/lang/Object;)Z
  #494 = InterfaceMethodref #317.#493     // java/util/Collection.add:(Ljava/lang/Object;)Z
  #495 = Utf8               size
  #496 = NameAndType        #495:#101     // size:()I
  #497 = InterfaceMethodref #204.#496     // java/util/List.size:()I
  #498 = Utf8               (I)Ljava/lang/Object;
  #499 = NameAndType        #165:#498     // get:(I)Ljava/lang/Object;
  #500 = InterfaceMethodref #204.#499     // java/util/List.get:(I)Ljava/lang/Object;
  #501 = Utf8               $i$a$-filter-NpcMove$selectMagicSkill$filtered$1
  #502 = Utf8               skill
  #503 = Utf8               element$iv$iv
  #504 = Utf8               $i$f$filterTo
  #505 = Utf8               $this$filterTo$iv$iv
  #506 = Utf8               destination$iv$iv
  #507 = Utf8               Ljava/util/Collection;
  #508 = Utf8               $i$f$filter
  #509 = Utf8               $this$filter$iv
  #510 = Utf8               skills
  #511 = Utf8               filtered
  #512 = Utf8               [Lext/mods/gameserver/enums/actors/NpcSkillType;
  #513 = Class              #512          // "[Lext/mods/gameserver/enums/actors/NpcSkillType;"
  #514 = Double             360.0d
  #516 = Utf8               atan2
  #517 = NameAndType        #516:#196     // atan2:(DD)D
  #518 = Methodref          #229.#517     // java/lang/Math.atan2:(DD)D
  #519 = Utf8               toDegrees
  #520 = NameAndType        #519:#231     // toDegrees:(D)D
  #521 = Methodref          #229.#520     // java/lang/Math.toDegrees:(D)D
  #522 = Double             1.7976931348623157E308d
  #524 = Double             60.0d
  #526 = Utf8               toRadians
  #527 = NameAndType        #526:#231     // toRadians:(D)D
  #528 = Methodref          #229.#527     // java/lang/Math.toRadians:(D)D
  #529 = Utf8               cos
  #530 = NameAndType        #529:#231     // cos:(D)D
  #531 = Methodref          #229.#530     // java/lang/Math.cos:(D)D
  #532 = Utf8               sin
  #533 = NameAndType        #532:#231     // sin:(D)D
  #534 = Methodref          #229.#533     // java/lang/Math.sin:(D)D
  #535 = Utf8               geoEngine
  #536 = Utf8               Lext/mods/gameserver/geoengine/GeoEngine;
  #537 = NameAndType        #535:#536     // geoEngine:Lext/mods/gameserver/geoengine/GeoEngine;
  #538 = Fieldref           #5.#537       // ext/mods/gameserver/model/actor/move/CreatureMove.geoEngine:Lext/mods/gameserver/geoengine/GeoEngine;
  #539 = Utf8               ext/mods/gameserver/geoengine/GeoEngine
  #540 = Class              #539          // ext/mods/gameserver/geoengine/GeoEngine
  #541 = Utf8               getHeight
  #542 = Utf8               (III)S
  #543 = NameAndType        #541:#542     // getHeight:(III)S
  #544 = Methodref          #540.#543     // ext/mods/gameserver/geoengine/GeoEngine.getHeight:(III)S
  #545 = Utf8               canMoveToTarget
  #546 = Utf8               (IIIIII)Z
  #547 = NameAndType        #545:#546     // canMoveToTarget:(IIIIII)Z
  #548 = Methodref          #540.#547     // ext/mods/gameserver/geoengine/GeoEngine.canMoveToTarget:(IIIIII)Z
  #549 = Methodref          #10.#125      // ext/mods/gameserver/model/actor/Creature.distance3D:(Lext/mods/gameserver/model/location/Location;)D
  #550 = Utf8               $i$a$-filter-NpcMove$findBestAttackSlot$potentialBlockers$1
  #551 = Utf8               $i$a$-any-NpcMove$findBestAttackSlot$isOccupied$1
  #552 = Utf8               angleRadians
  #553 = Utf8               jitter
  #554 = Utf8               currentRange
  #555 = Utf8               testX
  #556 = Utf8               testY
  #557 = Utf8               testZ
  #558 = Utf8               testLoc
  #559 = Utf8               isOccupied
  #560 = Utf8               score
  #561 = Utf8               i
  #562 = Utf8               centerX
  #563 = Utf8               centerY
  #564 = Utf8               centerZ
  #565 = Utf8               layeredRange
  #566 = Utf8               angles
  #567 = Utf8               angleStep
  #568 = Utf8               startAngle
  #569 = Utf8               searchRadius
  #570 = Utf8               potentialBlockers
  #571 = Utf8               bestLoc
  #572 = Utf8               minScore
  #573 = Utf8               collisionGap
  #574 = Utf8               baseRange
  #575 = Double             2.2d
  #577 = Utf8               _pawn
  #578 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #579 = NameAndType        #577:#578     // _pawn:Lext/mods/gameserver/model/WorldObject;
  #580 = Fieldref           #2.#579       // ext/mods/gameserver/model/actor/move/NpcMove._pawn:Lext/mods/gameserver/model/WorldObject;
  #581 = Utf8               $i$a$-any-NpcMove$wouldCollideInPath$1
  #582 = Utf8               neighbor
  #583 = Utf8               checkDist
  #584 = Utf8               dest
  #585 = Utf8               handleNextPosition
  #586 = Utf8               (IIILext/mods/gameserver/enums/actors/MoveType;)Z
  #587 = NameAndType        #585:#586     // handleNextPosition:(IIILext/mods/gameserver/enums/actors/MoveType;)Z
  #588 = Methodref          #5.#587       // ext/mods/gameserver/model/actor/move/CreatureMove.handleNextPosition:(IIILext/mods/gameserver/enums/actors/MoveType;)Z
  #589 = Utf8               setXYZ
  #590 = NameAndType        #589:#337     // setXYZ:(III)V
  #591 = Methodref          #53.#590      // ext/mods/gameserver/model/actor/Npc.setXYZ:(III)V
  #592 = Utf8               revalidateZone
  #593 = Utf8               (Z)V
  #594 = NameAndType        #592:#593     // revalidateZone:(Z)V
  #595 = Methodref          #53.#594      // ext/mods/gameserver/model/actor/Npc.revalidateZone:(Z)V
  #596 = Utf8               _blocked
  #597 = NameAndType        #596:#91      // _blocked:Z
  #598 = Fieldref           #2.#597       // ext/mods/gameserver/model/actor/move/NpcMove._blocked:Z
  #599 = Utf8               curX
  #600 = Utf8               curY
  #601 = Utf8               curZ
  #602 = Utf8               nextX
  #603 = Utf8               nextY
  #604 = Utf8               nextZ
  #605 = Utf8               type
  #606 = Utf8               Lext/mods/gameserver/enums/actors/MoveType;
  #607 = Utf8               <clinit>
  #608 = Utf8               ext/mods/gameserver/model/actor/move/NpcMove$Companion
  #609 = Class              #608          // ext/mods/gameserver/model/actor/move/NpcMove$Companion
  #610 = Utf8               (Lkotlin/jvm/internal/DefaultConstructorMarker;)V
  #611 = NameAndType        #6:#610       // "<init>":(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
  #612 = Methodref          #609.#611     // ext/mods/gameserver/model/actor/move/NpcMove$Companion."<init>":(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
  #613 = Utf8               Companion
  #614 = Utf8               Lext/mods/gameserver/model/actor/move/NpcMove$Companion;
  #615 = NameAndType        #613:#614     // Companion:Lext/mods/gameserver/model/actor/move/NpcMove$Companion;
  #616 = Fieldref           #2.#615       // ext/mods/gameserver/model/actor/move/NpcMove.Companion:Lext/mods/gameserver/model/actor/move/NpcMove$Companion;
  #617 = Utf8               java/lang/Class
  #618 = Class              #617          // java/lang/Class
  #619 = Utf8               getName
  #620 = Utf8               ()Ljava/lang/String;
  #621 = NameAndType        #619:#620     // getName:()Ljava/lang/String;
  #622 = Methodref          #618.#621     // java/lang/Class.getName:()Ljava/lang/String;
  #623 = Utf8               (Ljava/lang/String;)V
  #624 = NameAndType        #6:#623       // "<init>":(Ljava/lang/String;)V
  #625 = Methodref          #112.#624     // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #626 = Utf8               Lkotlin/Metadata;
  #627 = Utf8               mv
  #628 = Integer            2
  #629 = Integer            3
  #630 = Integer            0
  #631 = Utf8               k
  #632 = Integer            1
  #633 = Utf8               xi
  #634 = Integer            48
  #635 = Utf8               d1
  #636 = Utf8               \u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0014J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0012\u001a\u00020\u000bH\u0002J\u0018\u0010\u0013\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0002J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002J\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u000fH\u0002J\u0010\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u0018H\u0002J(\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020!H\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#
  #637 = Utf8               d2
  #638 = Utf8               Lext/mods/gameserver/model/actor/move/CreatureMove;
  #639 = Utf8
  #640 = Utf8               Brproject
  #641 = Utf8               NpcMove.kt
  #642 = Utf8               Lkotlin/jvm/internal/SourceDebugExtension;
  #643 = Utf8               value
  #644 = Utf8               SMAP\nNpcMove.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NpcMove.kt\next/mods/gameserver/model/actor/move/NpcMove\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,410:1\n1807#2,3:411\n777#2:414\n873#2,2:415\n777#2:417\n873#2,2:418\n1807#2,3:420\n1807#2,3:423\n*S KotlinDebug\n*F\n+ 1 NpcMove.kt\next/mods/gameserver/model/actor/move/NpcMove\n*L\n282#1:411,3\n318#1:414\n318#1:415,2\n344#1:417\n344#1:418,2\n364#1:420,3\n382#1:423,3\n*E\n
  #645 = Utf8               RuntimeInvisibleAnnotations
  #646 = Utf8               Code
  #647 = Utf8               LineNumberTable
  #648 = Utf8               LocalVariableTable
  #649 = Utf8               RuntimeInvisibleParameterAnnotations
  #650 = Utf8               StackMapTable
  #651 = Utf8               InnerClasses
  #652 = Utf8               Signature
  #653 = Utf8               SourceFile
  #654 = Utf8               SourceDebugExtension
  #655 = Utf8               RuntimeVisibleAnnotations
{
  public static final ext.mods.gameserver.model.actor.move.NpcMove$Companion Companion;
    descriptor: Lext/mods/gameserver/model/actor/move/NpcMove$Companion;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    RuntimeInvisibleAnnotations:
      0: #8()
        org.jetbrains.annotations.NotNull

  public ext.mods.gameserver.model.actor.move.NpcMove(ext.mods.gameserver.model.actor.Npc);
    descriptor: (Lext/mods/gameserver/model/actor/Npc;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: checkcast     #10                 // class ext/mods/gameserver/model/actor/Creature
         5: invokespecial #13                 // Method ext/mods/gameserver/model/actor/move/CreatureMove."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
         8: aload_0
         9: new           #15                 // class java/lang/Object
        12: dup
        13: invokespecial #18                 // Method java/lang/Object."<init>":()V
        16: putfield      #22                 // Field frontSlowOwner:Ljava/lang/Object;
        19: return
      LineNumberTable:
        line 42: 0
        line 47: 8
        line 42: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/model/actor/move/NpcMove;
            0      20     1 actor   Lext/mods/gameserver/model/actor/Npc;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #8()
          org.jetbrains.annotations.NotNull

  protected void offensiveFollowTask(ext.mods.gameserver.model.actor.Creature, int);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;I)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=7, locals=25, args_size=3
         0: aload_0
         1: getfield      #32                 // Field _followTask:Ljava/util/concurrent/ScheduledFuture;
         4: astore_3
         5: aload_3
         6: ifnull        25
         9: aload_3
        10: invokeinterface #38,  1           // InterfaceMethod java/util/concurrent/ScheduledFuture.isCancelled:()Z
        15: ifne          25
        18: aload_1
        19: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Creature.isAlikeDead:()Z
        22: ifeq          34
        25: aload_0
        26: invokespecial #44                 // Method clearFrontSlow:()V
        29: aload_0
        30: invokevirtual #47                 // Method cancelFollowTask:()V
        33: return
        34: aload_0
        35: getfield      #51                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        38: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
        41: aload_1
        42: checkcast     #55                 // class ext/mods/gameserver/model/WorldObject
        45: invokevirtual #59                 // Method ext/mods/gameserver/model/actor/Npc.knows:(Lext/mods/gameserver/model/WorldObject;)Z
        48: ifne          176
        51: aload_0
        52: getfield      #51                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        55: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
        58: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Npc.getAI:()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
        61: astore        4
        63: aload         4
        65: ifnull        76
        68: aload         4
        70: invokevirtual #68                 // Method ext/mods/gameserver/model/actor/ai/type/NpcAI.stopFollow:()V
        73: goto          110
        76: aload_0
        77: getfield      #51                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        80: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
        83: new           #70                 // class ext/mods/gameserver/network/serverpackets/StopMove
        86: dup
        87: aload_0
        88: getfield      #51                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        91: invokespecial #71                 // Method ext/mods/gameserver/network/serverpackets/StopMove."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
        94: checkcast     #73                 // class ext/mods/gameserver/network/serverpackets/L2GameServerPacket
        97: invokevirtual #77                 // Method ext/mods/gameserver/model/actor/Npc.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       100: aload         4
       102: getstatic     #83                 // Field ext/mods/gameserver/enums/AiEventType.THINK:Lext/mods/gameserver/enums/AiEventType;
       105: aconst_null
       106: aconst_null
       107: invokevirtual #87                 // Method ext/mods/gameserver/model/actor/ai/type/NpcAI.notifyEvent:(Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
       110: getstatic     #93                 // Field ext/mods/Config.DEBUG_MELEE_ATTACK:Z
       113: ifeq          167
       116: iload_2
       117: sipush        200
       120: if_icmpgt     167
       123: getstatic     #97                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       126: ldc           #99                 // String [MeleeDebug] follow: lostKnownlist npc={} target={}
       128: iconst_2
       129: anewarray     #15                 // class java/lang/Object
       132: astore        5
       134: aload         5
       136: iconst_0
       137: aload_0
       138: getfield      #51                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       141: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       144: invokevirtual #103                // Method ext/mods/gameserver/model/actor/Npc.getObjectId:()I
       147: invokestatic  #109                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       150: aastore
       151: aload         5
       153: iconst_1
       154: aload_1
       155: invokevirtual #110                // Method ext/mods/gameserver/model/actor/Creature.getObjectId:()I
       158: invokestatic  #109                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       161: aastore
       162: aload         5
       164: invokevirtual #116                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
       167: aload_0
       168: invokespecial #44                 // Method clearFrontSlow:()V
       171: aload_0
       172: invokevirtual #47                 // Method cancelFollowTask:()V
       175: return
       176: aload_1
       177: invokevirtual #120                // Method ext/mods/gameserver/model/actor/Creature.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
       180: astore        4
       182: aload_0
       183: getfield      #51                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       186: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       189: aload         4
       191: checkcast     #122                // class ext/mods/gameserver/model/location/Location
       194: invokevirtual #126                // Method ext/mods/gameserver/model/actor/Npc.distance3D:(Lext/mods/gameserver/model/location/Location;)D
       197: dstore        5
       199: aload_0
       200: aload_1
       201: invokespecial #130                // Method applySoftRepulsion:(Lext/mods/gameserver/model/actor/Creature;)Z
       204: ifeq          208
       207: return
       208: iload_2
       209: sipush        200
       212: if_icmpgt     368
       215: dload         5
       217: ldc2_w        #131                // double 300.0d
       220: dcmpg
       221: ifgt          368
       224: aload_0
       225: getfield      #51                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       228: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       231: invokevirtual #135                // Method ext/mods/gameserver/model/actor/Npc.getAllSkillsDisabled:()Z
       234: ifne          368
       237: aload_0
       238: getfield      #51                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       241: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       244: invokevirtual #139                // Method ext/mods/gameserver/model/actor/Npc.getCast:()Lext/mods/gameserver/model/actor/cast/NpcCast;
       247: invokevirtual #144                // Method ext/mods/gameserver/model/actor/cast/NpcCast.isCastingNow:()Z
       250: ifne          368
       253: aload_0
       254: invokespecial #148                // Method selectMagicSkill:()Lext/mods/gameserver/skills/L2Skill;
       257: astore        7
       259: aload         7
       261: ifnull        368
       264: aload_0
       265: getfield      #51                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       268: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       271: invokevirtual #152                // Method ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
       274: aload         7
       276: invokevirtual #158                // Method ext/mods/gameserver/model/actor/status/NpcStatus.getMpConsume:(Lext/mods/gameserver/skills/L2Skill;)I
       279: istore        8
       281: iload         8
       283: ifle          306
       286: iload         8
       288: i2d
       289: aload_0
       290: getfield      #51                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       293: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       296: invokevirtual #152                // Method ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
       299: invokevirtual #162                // Method ext/mods/gameserver/model/actor/status/NpcStatus.getMp:()D
       302: dcmpg
       303: ifgt          310
       306: iconst_1
       307: goto          311
       310: iconst_0
       311: istore        9
       313: iload         9
       315: ifeq          323
       318: bipush        60
       320: goto          325
       323: bipush        30
       325: istore        10
       327: bipush        100
       329: invokestatic  #168                // Method ext/mods/commons/random/Rnd.get:(I)I
       332: iload         10
       334: if_icmpge     368
       337: aload_0
       338: getfield      #51                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       341: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       344: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Npc.getAI:()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
       347: astore        11
       349: aload         11
       351: ifnull        368
       354: aload         11
       356: aload_1
       357: aload         7
       359: ldc2_w        #169                // double 100000.0d
       362: iconst_1
       363: iconst_1
       364: invokevirtual #174                // Method ext/mods/gameserver/model/actor/ai/type/NpcAI.addCastDesire:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;DZZ)V
       367: return
       368: aload_0
       369: getfield      #51                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       372: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       375: invokevirtual #103                // Method ext/mods/gameserver/model/actor/Npc.getObjectId:()I
       378: iconst_3
       379: irem
       380: istore        7
       382: iload_2
       383: sipush        200
       386: if_icmple     404
       389: iload_2
       390: iload         7
       392: bipush        20
       394: imul
       395: iadd
       396: bipush        100
       398: invokestatic  #180                // Method kotlin/ranges/RangesKt.coerceAtLeast:(II)I
       401: goto          405
       404: iload_2
       405: istore        8
       407: iload         8
       409: i2d
       410: aload_0
       411: getfield      #51                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       414: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       417: invokevirtual #183                // Method ext/mods/gameserver/model/actor/Npc.getCollisionRadius:()D
       420: dadd
       421: aload_1
       422: invokevirtual #184                // Method ext/mods/gameserver/model/actor/Creature.getCollisionRadius:()D
       425: dadd
       426: dstore        9
       428: iload_2
       429: bipush        100
       431: if_icmpgt     444
       434: aload_0
       435: aload_1
       436: iload_2
       437: invokespecial #188                // Method tryRouteDeviationForFrontBlocker:(Lext/mods/gameserver/model/actor/Creature;I)Z
       440: ifeq          444
       443: return
       444: aload_0
       445: aload_1
       446: iload_2
       447: invokespecial #191                // Method updateFrontSlow:(Lext/mods/gameserver/model/actor/Creature;I)V
       450: getstatic     #195                // Field ext/mods/Config.MONSTER_MAX_RANGE:I
       453: istore        11
       455: dload         9
       457: iload         11
       459: i2d
       460: dsub
       461: dconst_0
       462: invokestatic  #198                // Method kotlin/ranges/RangesKt.coerceAtLeast:(DD)D
       465: dstore        12
       467: dload         9
       469: iload         11
       471: i2d
       472: dadd
       473: dstore        14
       475: dload         5
       477: dload         14
       479: dcmpl
       480: ifle          655
       483: aload_0
       484: getfield      #51                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       487: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       490: ldc           #10                 // class ext/mods/gameserver/model/actor/Creature
       492: dload         5
       494: d2i
       495: invokevirtual #202                // Method ext/mods/gameserver/model/actor/Npc.getKnownTypeInRadius:(Ljava/lang/Class;I)Ljava/util/List;
       498: astore        16
       500: aload         16
       502: invokeinterface #208,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       507: astore        17
       509: aload         17
       511: invokeinterface #213,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       516: ifeq          655
       519: aload         17
       521: invokeinterface #217,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       526: checkcast     #10                 // class ext/mods/gameserver/model/actor/Creature
       529: astore        18
       531: aload         18
       533: instanceof    #53                 // class ext/mods/gameserver/model/actor/Npc
       536: ifeq          509
       539: aload         18
       541: aload_0
       542: getfield      #51                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       545: invokestatic  #223                // Method kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
       548: ifne          509
       551: aload         18
       553: aload_1
       554: invokestatic  #223                // Method kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
       557: ifne          509
       560: aload         18
       562: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       565: invokevirtual #224                // Method ext/mods/gameserver/model/actor/Npc.isAlikeDead:()Z
       568: ifeq          574
       571: goto          509
       574: aload_0
       575: getfield      #51                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       578: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       581: aload         18
       583: checkcast     #55                 // class ext/mods/gameserver/model/WorldObject
       586: invokevirtual #227                // Method ext/mods/gameserver/model/actor/Npc.distance3D:(Lext/mods/gameserver/model/WorldObject;)D
       589: dstore        19
       591: aload         18
       593: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       596: aload_1
       597: checkcast     #55                 // class ext/mods/gameserver/model/WorldObject
       600: invokevirtual #227                // Method ext/mods/gameserver/model/actor/Npc.distance3D:(Lext/mods/gameserver/model/WorldObject;)D
       603: dstore        21
       605: dload         19
       607: dload         21
       609: dadd
       610: dload         5
       612: dsub
       613: invokestatic  #233                // Method java/lang/Math.abs:(D)D
       616: ldc2_w        #234                // double 35.0d
       619: dcmpg
       620: ifge          509
       623: dload         14
       625: aload         18
       627: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       630: invokevirtual #183                // Method ext/mods/gameserver/model/actor/Npc.getCollisionRadius:()D
       633: ldc2_w        #236                // double 2.0d
       636: dmul
       637: dadd
       638: dstore        23
       640: dload         5
       642: dload         23
       644: dcmpg
       645: ifgt          509
       648: dload         23
       650: dstore        14
       652: goto          655
       655: dload         12
       657: dload         5
       659: dcmpg
       660: ifgt          679
       663: dload         5
       665: dload         14
       667: dcmpg
       668: ifgt          675
       671: iconst_1
       672: goto          680
       675: iconst_0
       676: goto          680
       679: iconst_0
       680: ifeq          898
       683: aload_0
       684: getfield      #51                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       687: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       690: invokevirtual #238                // Method ext/mods/gameserver/model/actor/Npc.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
       693: aload         4
       695: checkcast     #122                // class ext/mods/gameserver/model/location/Location
       698: invokevirtual #244                // Method ext/mods/gameserver/model/location/SpawnLocation.setHeadingTo:(Lext/mods/gameserver/model/location/Location;)V
       701: iload_2
       702: sipush        200
       705: if_icmpgt     825
       708: getstatic     #93                 // Field ext/mods/Config.DEBUG_MELEE_ATTACK:Z
       711: ifeq          776
       714: getstatic     #97                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       717: ldc           #246                // String [MeleeDebug] follow: meleeArrived npc={} target={} dist={} range={}
       719: iconst_4
       720: anewarray     #15                 // class java/lang/Object
       723: astore        16
       725: aload         16
       727: iconst_0
       728: aload_0
       729: getfield      #51                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       732: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       735: invokevirtual #103                // Method ext/mods/gameserver/model/actor/Npc.getObjectId:()I
       738: invokestatic  #109                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       741: aastore
       742: aload         16
       744: iconst_1
       745: aload_1
       746: invokevirtual #110                // Method ext/mods/gameserver/model/actor/Creature.getObjectId:()I
       749: invokestatic  #109                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       752: aastore
       753: aload         16
       755: iconst_2
       756: dload         5
       758: invokestatic  #251                // Method java/lang/Double.valueOf:(D)Ljava/lang/Double;
       761: aastore
       762: aload         16
       764: iconst_3
       765: dload         9
       767: invokestatic  #251                // Method java/lang/Double.valueOf:(D)Ljava/lang/Double;
       770: aastore
       771: aload         16
       773: invokevirtual #116                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
       776: aload_0
       777: invokespecial #44                 // Method clearFrontSlow:()V
       780: aload_0
       781: invokevirtual #254                // Method stop:()V
       784: aload_0
       785: getfield      #51                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       788: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       791: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Npc.getAI:()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
       794: astore        16
       796: aload         16
       798: ifnull        814
       801: aload         16
       803: getstatic     #257                // Field ext/mods/gameserver/enums/AiEventType.ARRIVED:Lext/mods/gameserver/enums/AiEventType;
       806: aconst_null
       807: aconst_null
       808: invokevirtual #87                 // Method ext/mods/gameserver/model/actor/ai/type/NpcAI.notifyEvent:(Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
       811: goto          824
       814: aload         16
       816: getstatic     #83                 // Field ext/mods/gameserver/enums/AiEventType.THINK:Lext/mods/gameserver/enums/AiEventType;
       819: aconst_null
       820: aconst_null
       821: invokevirtual #87                 // Method ext/mods/gameserver/model/actor/ai/type/NpcAI.notifyEvent:(Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
       824: return
       825: aload_0
       826: getfield      #261                // Field _separationForceX:D
       829: invokestatic  #233                // Method java/lang/Math.abs:(D)D
       832: ldc2_w        #262                // double 0.1d
       835: dcmpg
       836: ifge          898
       839: aload_0
       840: getfield      #266                // Field _separationForceY:D
       843: invokestatic  #233                // Method java/lang/Math.abs:(D)D
       846: ldc2_w        #262                // double 0.1d
       849: dcmpg
       850: ifge          898
       853: aload_0
       854: invokevirtual #254                // Method stop:()V
       857: aload_0
       858: getfield      #51                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       861: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       864: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Npc.getAI:()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
       867: astore        16
       869: aload         16
       871: ifnull        887
       874: aload         16
       876: getstatic     #257                // Field ext/mods/gameserver/enums/AiEventType.ARRIVED:Lext/mods/gameserver/enums/AiEventType;
       879: aconst_null
       880: aconst_null
       881: invokevirtual #87                 // Method ext/mods/gameserver/model/actor/ai/type/NpcAI.notifyEvent:(Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
       884: goto          897
       887: aload         16
       889: getstatic     #83                 // Field ext/mods/gameserver/enums/AiEventType.THINK:Lext/mods/gameserver/enums/AiEventType;
       892: aconst_null
       893: aconst_null
       894: invokevirtual #87                 // Method ext/mods/gameserver/model/actor/ai/type/NpcAI.notifyEvent:(Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
       897: return
       898: aload_0
       899: aload         4
       901: checkcast     #122                // class ext/mods/gameserver/model/location/Location
       904: invokespecial #270                // Method wouldCollideInPath:(Lext/mods/gameserver/model/location/Location;)Z
       907: istore        16
       909: dload         5
       911: dload         14
       913: dcmpl
       914: ifgt          922
       917: iload         16
       919: ifeq          997
       922: aload_0
       923: aload_1
       924: iload_2
       925: invokespecial #274                // Method findBestAttackSlot:(Lext/mods/gameserver/model/actor/Creature;I)Lext/mods/gameserver/model/location/Location;
       928: astore        17
       930: aload         17
       932: ifnull        981
       935: aload_0
       936: getfield      #278                // Field _destination:Lext/mods/gameserver/model/location/Location;
       939: aload         17
       941: invokevirtual #279                // Method ext/mods/gameserver/model/location/Location.distance3D:(Lext/mods/gameserver/model/location/Location;)D
       944: ldc2_w        #280                // double 25.0d
       947: dcmpl
       948: ifle          997
       951: iload         16
       953: ifne          965
       956: dload         5
       958: ldc2_w        #131                // double 300.0d
       961: dcmpl
       962: ifle          969
       965: iconst_1
       966: goto          970
       969: iconst_0
       970: istore        18
       972: aload_0
       973: aload         17
       975: iload         18
       977: invokevirtual #285                // Method moveToLocation:(Lext/mods/gameserver/model/location/Location;Z)V
       980: return
       981: iload         16
       983: ifeq          997
       986: aload_0
       987: aload         4
       989: checkcast     #122                // class ext/mods/gameserver/model/location/Location
       992: iconst_1
       993: invokevirtual #285                // Method moveToLocation:(Lext/mods/gameserver/model/location/Location;Z)V
       996: return
       997: dload         5
       999: dload         14
      1001: dcmpl
      1002: ifle          1016
      1005: aload_0
      1006: aload         4
      1008: checkcast     #122                // class ext/mods/gameserver/model/location/Location
      1011: iconst_1
      1012: invokevirtual #285                // Method moveToLocation:(Lext/mods/gameserver/model/location/Location;Z)V
      1015: return
      1016: return
      StackMapTable: number_of_entries = 36
        frame_type = 252 /* append */
          offset_delta = 25
          locals = [ class java/util/concurrent/ScheduledFuture ]
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 41
          locals = [ class ext/mods/gameserver/model/actor/ai/type/NpcAI ]
        frame_type = 33 /* same */
        frame_type = 56 /* same */
        frame_type = 250 /* chop */
          offset_delta = 8
        frame_type = 253 /* append */
          offset_delta = 31
          locals = [ class ext/mods/gameserver/model/location/SpawnLocation, double ]
        frame_type = 253 /* append */
          offset_delta = 97
          locals = [ class ext/mods/gameserver/skills/L2Skill, int ]
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 11
          locals = [ int ]
        frame_type = 65 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 248 /* chop */
          offset_delta = 42
        frame_type = 252 /* append */
          offset_delta = 35
          locals = [ int ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 253 /* append */
          offset_delta = 38
          locals = [ int, double ]
        frame_type = 255 /* full_frame */
          offset_delta = 64
          locals = [ class ext/mods/gameserver/model/actor/move/NpcMove, class ext/mods/gameserver/model/actor/Creature, int, class java/util/concurrent/ScheduledFuture, class ext/mods/gameserver/model/location/SpawnLocation, double, int, int, double, int, double, double, class java/util/List, class java/util/Iterator ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 64
          locals = [ class ext/mods/gameserver/model/actor/Creature ]
        frame_type = 248 /* chop */
          offset_delta = 80
        frame_type = 19 /* same */
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 95
        frame_type = 252 /* append */
          offset_delta = 37
          locals = [ class ext/mods/gameserver/model/actor/ai/type/NpcAI ]
        frame_type = 9 /* same */
        frame_type = 250 /* chop */
          offset_delta = 0
        frame_type = 252 /* append */
          offset_delta = 61
          locals = [ class ext/mods/gameserver/model/actor/ai/type/NpcAI ]
        frame_type = 9 /* same */
        frame_type = 250 /* chop */
          offset_delta = 0
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ int ]
        frame_type = 252 /* append */
          offset_delta = 42
          locals = [ class ext/mods/gameserver/model/location/Location ]
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 10 /* same */
        frame_type = 250 /* chop */
          offset_delta = 15
        frame_type = 18 /* same */
      LineNumberTable:
        line 50: 0
        line 52: 5
        line 53: 25
        line 54: 29
        line 55: 33
        line 58: 34
        line 59: 51
        line 60: 63
        line 61: 68
        line 63: 76
        line 64: 100
        line 66: 110
        line 67: 123
        line 69: 167
        line 70: 171
        line 71: 175
        line 73: 176
        line 74: 182
        line 76: 199
        line 77: 207
        line 80: 208
        line 81: 253
        line 82: 259
        line 83: 264
        line 84: 281
        line 85: 313
        line 86: 327
        line 87: 337
        line 88: 349
        line 89: 354
        line 90: 367
        line 96: 368
        line 97: 382
        line 98: 389
        line 100: 404
        line 97: 405
        line 103: 407
        line 105: 428
        line 106: 443
        line 109: 444
        line 111: 450
        line 112: 455
        line 113: 467
        line 115: 475
        line 116: 483
        line 117: 500
        line 118: 531
        line 119: 574
        line 120: 591
        line 121: 605
        line 122: 623
        line 123: 640
        line 124: 648
        line 125: 652
        line 130: 655
        line 131: 683
        line 133: 701
        line 134: 708
        line 135: 714
        line 136: 719
        line 135: 773
        line 138: 776
        line 139: 780
        line 141: 784
        line 142: 796
        line 143: 801
        line 145: 814
        line 147: 824
        line 150: 825
        line 151: 853
        line 152: 857
        line 153: 869
        line 154: 874
        line 156: 887
        line 158: 897
        line 162: 898
        line 163: 909
        line 164: 922
        line 166: 930
        line 167: 935
        line 168: 951
        line 169: 972
        line 170: 980
        line 173: 981
        line 174: 986
        line 175: 996
        line 180: 997
        line 181: 1005
        line 182: 1015
        line 185: 1016
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           63     113     4    ai   Lext/mods/gameserver/model/actor/ai/type/NpcAI;
          349      19    11    ai   Lext/mods/gameserver/model/actor/ai/type/NpcAI;
          281      87     8 mpConsume   I
          313      55     9 hasMp   Z
          327      41    10 chance   I
          259     109     7 magicSkill   Lext/mods/gameserver/skills/L2Skill;
          640      15    23 adjustedRange   D
          591      64    19 distToBlocker   D
          605      50    21 blockerToTarget   D
          531     124    18 blocker   Lext/mods/gameserver/model/actor/Creature;
          500     155    16 blockers   Ljava/util/List;
          796      29    16    ai   Lext/mods/gameserver/model/actor/ai/type/NpcAI;
          869      29    16    ai   Lext/mods/gameserver/model/actor/ai/type/NpcAI;
          972       9    18 usePathfinding   Z
          930      67    17 bestSlot   Lext/mods/gameserver/model/location/Location;
            5    1012     3 currentTask   Ljava/util/concurrent/ScheduledFuture;
          182     835     4 targetLoc   Lext/mods/gameserver/model/location/SpawnLocation;
          199     818     5  dist   D
          382     635     7 layer   I
          407     610     8 layeredOffset   I
          428     589     9 totalRange   D
          455     562    11 attackMargin   I
          467     550    12 minSafeRange   D
          475     542    14 maxSafeRange   D
          909     108    16 isBlocked   Z
            0    1017     0  this   Lext/mods/gameserver/model/actor/move/NpcMove;
            0    1017     1 target   Lext/mods/gameserver/model/actor/Creature;
            0    1017     2 offset   I
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #8()
          org.jetbrains.annotations.NotNull
      parameter 1:

  protected boolean handleNextPosition(int, int, int, ext.mods.gameserver.enums.actors.MoveType);
    descriptor: (IIILext/mods/gameserver/enums/actors/MoveType;)Z
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=7, locals=8, args_size=5
         0: aload_0
         1: iload_1
         2: iload_2
         3: iload_3
         4: aload         4
         6: invokespecial #588                // Method ext/mods/gameserver/model/actor/move/CreatureMove.handleNextPosition:(IIILext/mods/gameserver/enums/actors/MoveType;)Z
         9: ifeq          14
        12: iconst_1
        13: ireturn
        14: aload_0
        15: getfield      #51                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        18: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
        21: invokevirtual #326                // Method ext/mods/gameserver/model/actor/Npc.getX:()I
        24: istore        5
        26: aload_0
        27: getfield      #51                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        30: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
        33: invokevirtual #330                // Method ext/mods/gameserver/model/actor/Npc.getY:()I
        36: istore        6
        38: aload_0
        39: getfield      #51                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        42: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
        45: invokevirtual #336                // Method ext/mods/gameserver/model/actor/Npc.getZ:()I
        48: istore        7
        50: getstatic     #538                // Field ext/mods/gameserver/model/actor/move/CreatureMove.geoEngine:Lext/mods/gameserver/geoengine/GeoEngine;
        53: iload         5
        55: iload         6
        57: iload         7
        59: iload_1
        60: iload         6
        62: iload_3
        63: invokevirtual #548                // Method ext/mods/gameserver/geoengine/GeoEngine.canMoveToTarget:(IIIIII)Z
        66: ifeq          96
        69: aload_0
        70: getfield      #51                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        73: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
        76: iload_1
        77: iload         6
        79: iload_3
        80: invokevirtual #591                // Method ext/mods/gameserver/model/actor/Npc.setXYZ:(III)V
        83: aload_0
        84: getfield      #51                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        87: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
        90: iconst_0
        91: invokevirtual #595                // Method ext/mods/gameserver/model/actor/Npc.revalidateZone:(Z)V
        94: iconst_1
        95: ireturn
        96: getstatic     #538                // Field ext/mods/gameserver/model/actor/move/CreatureMove.geoEngine:Lext/mods/gameserver/geoengine/GeoEngine;
        99: iload         5
       101: iload         6
       103: iload         7
       105: iload         5
       107: iload_2
       108: iload_3
       109: invokevirtual #548                // Method ext/mods/gameserver/geoengine/GeoEngine.canMoveToTarget:(IIIIII)Z
       112: ifeq          142
       115: aload_0
       116: getfield      #51                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       119: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       122: iload         5
       124: iload_2
       125: iload_3
       126: invokevirtual #591                // Method ext/mods/gameserver/model/actor/Npc.setXYZ:(III)V
       129: aload_0
       130: getfield      #51                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       133: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       136: iconst_0
       137: invokevirtual #595                // Method ext/mods/gameserver/model/actor/Npc.revalidateZone:(Z)V
       140: iconst_1
       141: ireturn
       142: aload_0
       143: iconst_1
       144: putfield      #598                // Field _blocked:Z
       147: iconst_0
       148: ireturn
      StackMapTable: number_of_entries = 3
        frame_type = 14 /* same */
        frame_type = 254 /* append */
          offset_delta = 81
          locals = [ int, int, int ]
        frame_type = 45 /* same */
      LineNumberTable:
        line 389: 0
        line 391: 14
        line 392: 26
        line 393: 38
        line 395: 50
        line 396: 69
        line 397: 83
        line 398: 94
        line 401: 96
        line 402: 115
        line 403: 129
        line 404: 140
        line 407: 142
        line 408: 147
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           26     123     5  curX   I
           38     111     6  curY   I
           50      99     7  curZ   I
            0     149     0  this   Lext/mods/gameserver/model/actor/move/NpcMove;
            0     149     1 nextX   I
            0     149     2 nextY   I
            0     149     3 nextZ   I
            0     149     4  type   Lext/mods/gameserver/enums/actors/MoveType;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
      parameter 1:
      parameter 2:
      parameter 3:
        0: #8()
          org.jetbrains.annotations.NotNull

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #609                // class ext/mods/gameserver/model/actor/move/NpcMove$Companion
         3: dup
         4: aconst_null
         5: invokespecial #612                // Method ext/mods/gameserver/model/actor/move/NpcMove$Companion."<init>":(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
         8: putstatic     #616                // Field Companion:Lext/mods/gameserver/model/actor/move/NpcMove$Companion;
        11: new           #112                // class ext/mods/commons/logging/CLogger
        14: dup
        15: ldc           #2                  // class ext/mods/gameserver/model/actor/move/NpcMove
        17: invokevirtual #622                // Method java/lang/Class.getName:()Ljava/lang/String;
        20: invokespecial #625                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        23: putstatic     #97                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        26: return
      LineNumberTable:
        line 44: 11
}
InnerClasses:
  public static final #613= #609 of #2;   // Companion=class ext/mods/gameserver/model/actor/move/NpcMove$Companion of class ext/mods/gameserver/model/actor/move/NpcMove
Signature: #3                           // Lext/mods/gameserver/model/actor/move/CreatureMove<Lext/mods/gameserver/model/actor/Npc;>;
SourceFile: "NpcMove.kt"
SourceDebugExtension:
  SMAP
  NpcMove.kt
  Kotlin
  *S Kotlin
  *F
  + 1 NpcMove.kt
  ext/mods/gameserver/model/actor/move/NpcMove
  + 2 _Collections.kt
  kotlin/collections/CollectionsKt___CollectionsKt
  *L
  1#1,410:1
  1807#2,3:411
  777#2:414
  873#2,2:415
  777#2:417
  873#2,2:418
  1807#2,3:420
  1807#2,3:423
  *S KotlinDebug
  *F
  + 1 NpcMove.kt
  ext/mods/gameserver/model/actor/move/NpcMove
  *L
  282#1:411,3
  318#1:414
  318#1:415,2
  344#1:417
  344#1:418,2
  364#1:420,3
  382#1:423,3
  *E
RuntimeVisibleAnnotations:
  0: #626(#627=[I#628,I#629,I#630],#631=I#632,#633=I#634,#635=[s#636],#637=[s#24,s#638,s#26,s#25,s#6,s#7,s#19,s#639,s#357,s#639,s#27,s#639,s#312,s#49,s#313,s#639,s#127,s#189,s#42,s#185,s#354,s#145,s#292,s#271,s#276,s#574,s#267,s#584,s#585,s#602,s#603,s#604,s#605,s#606,s#613,s#640])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0014J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0012\u001a\u00020\u000bH\u0002J\u0018\u0010\u0013\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0002J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002J\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u000fH\u0002J\u0010\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u0018H\u0002J(\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020!H\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"]
      d2=["Lext/mods/gameserver/model/actor/move/NpcMove;","Lext/mods/gameserver/model/actor/move/CreatureMove;","Lext/mods/gameserver/model/actor/Npc;","actor","<init>","(Lext/mods/gameserver/model/actor/Npc;)V","frontSlowOwner","","frontSlowApplied","","offensiveFollowTask","","target","Lext/mods/gameserver/model/actor/Creature;","offset","","applySoftRepulsion","updateFrontSlow","clearFrontSlow","tryRouteDeviationForFrontBlocker","hasFrontBlocker","selectMagicSkill","Lext/mods/gameserver/skills/L2Skill;","findBestAttackSlot","Lext/mods/gameserver/model/location/Location;","baseRange","wouldCollideInPath","dest","handleNextPosition","nextX","nextY","nextZ","type","Lext/mods/gameserver/enums/actors/MoveType;","Companion","Brproject"]
    )
RuntimeInvisibleAnnotations:
  0: #642(#643=[s#644])
    kotlin.jvm.internal.SourceDebugExtension(
      value=["SMAP\nNpcMove.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NpcMove.kt\next/mods/gameserver/model/actor/move/NpcMove\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,410:1\n1807#2,3:411\n777#2:414\n873#2,2:415\n777#2:417\n873#2,2:418\n1807#2,3:420\n1807#2,3:423\n*S KotlinDebug\n*F\n+ 1 NpcMove.kt\next/mods/gameserver/model/actor/move/NpcMove\n*L\n282#1:411,3\n318#1:414\n318#1:415,2\n344#1:417\n344#1:418,2\n364#1:420,3\n382#1:423,3\n*E\n"]
    )
