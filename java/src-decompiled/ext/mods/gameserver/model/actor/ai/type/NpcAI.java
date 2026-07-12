// Bytecode for: ext.mods.gameserver.model.actor.ai.type.NpcAI
// File: ext\mods\gameserver\model\actor\ai\type\NpcAI.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/ai/type/NpcAI.class
  Last modified 9 de jul de 2026; size 37869 bytes
  MD5 checksum 193d7b161563b1bd3333b51855391330
  Compiled from "NpcAI.java"
public class ext.mods.gameserver.model.actor.ai.type.NpcAI<T extends ext.mods.gameserver.model.actor.Npc> extends ext.mods.gameserver.model.actor.ai.type.CreatureAI<T>
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #14                         // ext/mods/gameserver/model/actor/ai/type/NpcAI
  super_class: #2                         // ext/mods/gameserver/model/actor/ai/type/CreatureAI
  interfaces: 0, fields: 17, methods: 69, attributes: 5
Constant pool:
     #1 = Methodref          #2.#3        // ext/mods/gameserver/model/actor/ai/type/CreatureAI."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
     #2 = Class              #4           // ext/mods/gameserver/model/actor/ai/type/CreatureAI
     #3 = NameAndType        #5:#6        // "<init>":(Lext/mods/gameserver/model/actor/Creature;)V
     #4 = Utf8               ext/mods/gameserver/model/actor/ai/type/CreatureAI
     #5 = Utf8               <init>
     #6 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
     #7 = Methodref          #8.#9        // java/util/concurrent/ConcurrentHashMap.newKeySet:()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
     #8 = Class              #10          // java/util/concurrent/ConcurrentHashMap
     #9 = NameAndType        #11:#12      // newKeySet:()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
    #10 = Utf8               java/util/concurrent/ConcurrentHashMap
    #11 = Utf8               newKeySet
    #12 = Utf8               ()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
    #13 = Fieldref           #14.#15      // ext/mods/gameserver/model/actor/ai/type/NpcAI._seenCreatures:Ljava/util/Set;
    #14 = Class              #16          // ext/mods/gameserver/model/actor/ai/type/NpcAI
    #15 = NameAndType        #17:#18      // _seenCreatures:Ljava/util/Set;
    #16 = Utf8               ext/mods/gameserver/model/actor/ai/type/NpcAI
    #17 = Utf8               _seenCreatures
    #18 = Utf8               Ljava/util/Set;
    #19 = Class              #20          // ext/mods/gameserver/model/actor/ai/DesireQueue
    #20 = Utf8               ext/mods/gameserver/model/actor/ai/DesireQueue
    #21 = Methodref          #19.#22      // ext/mods/gameserver/model/actor/ai/DesireQueue."<init>":()V
    #22 = NameAndType        #5:#23       // "<init>":()V
    #23 = Utf8               ()V
    #24 = Fieldref           #14.#25      // ext/mods/gameserver/model/actor/ai/type/NpcAI._desireQueue:Lext/mods/gameserver/model/actor/ai/DesireQueue;
    #25 = NameAndType        #26:#27      // _desireQueue:Lext/mods/gameserver/model/actor/ai/DesireQueue;
    #26 = Utf8               _desireQueue
    #27 = Utf8               Lext/mods/gameserver/model/actor/ai/DesireQueue;
    #28 = InterfaceMethodref #29.#30      // java/util/Set.clear:()V
    #29 = Class              #31          // java/util/Set
    #30 = NameAndType        #32:#23      // clear:()V
    #31 = Utf8               java/util/Set
    #32 = Utf8               clear
    #33 = Class              #34          // ext/mods/gameserver/model/actor/container/attackable/AggroList
    #34 = Utf8               ext/mods/gameserver/model/actor/container/attackable/AggroList
    #35 = Methodref          #33.#36      // ext/mods/gameserver/model/actor/container/attackable/AggroList."<init>":(Lext/mods/gameserver/model/actor/Npc;)V
    #36 = NameAndType        #5:#37       // "<init>":(Lext/mods/gameserver/model/actor/Npc;)V
    #37 = Utf8               (Lext/mods/gameserver/model/actor/Npc;)V
    #38 = Fieldref           #14.#39      // ext/mods/gameserver/model/actor/ai/type/NpcAI._aggroList:Lext/mods/gameserver/model/actor/container/attackable/AggroList;
    #39 = NameAndType        #40:#41      // _aggroList:Lext/mods/gameserver/model/actor/container/attackable/AggroList;
    #40 = Utf8               _aggroList
    #41 = Utf8               Lext/mods/gameserver/model/actor/container/attackable/AggroList;
    #42 = Class              #43          // ext/mods/gameserver/model/actor/container/attackable/HateList
    #43 = Utf8               ext/mods/gameserver/model/actor/container/attackable/HateList
    #44 = Methodref          #42.#36      // ext/mods/gameserver/model/actor/container/attackable/HateList."<init>":(Lext/mods/gameserver/model/actor/Npc;)V
    #45 = Fieldref           #14.#46      // ext/mods/gameserver/model/actor/ai/type/NpcAI._hateList:Lext/mods/gameserver/model/actor/container/attackable/HateList;
    #46 = NameAndType        #47:#48      // _hateList:Lext/mods/gameserver/model/actor/container/attackable/HateList;
    #47 = Utf8               _hateList
    #48 = Utf8               Lext/mods/gameserver/model/actor/container/attackable/HateList;
    #49 = Fieldref           #14.#50      // ext/mods/gameserver/model/actor/ai/type/NpcAI._actor:Lext/mods/gameserver/model/actor/Creature;
    #50 = NameAndType        #51:#52      // _actor:Lext/mods/gameserver/model/actor/Creature;
    #51 = Utf8               _actor
    #52 = Utf8               Lext/mods/gameserver/model/actor/Creature;
    #53 = Class              #54          // ext/mods/gameserver/model/actor/Npc
    #54 = Utf8               ext/mods/gameserver/model/actor/Npc
    #55 = Methodref          #53.#56      // ext/mods/gameserver/model/actor/Npc.denyAiAction:()Z
    #56 = NameAndType        #57:#58      // denyAiAction:()Z
    #57 = Utf8               denyAiAction
    #58 = Utf8               ()Z
    #59 = Fieldref           #14.#60      // ext/mods/gameserver/model/actor/ai/type/NpcAI._currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
    #60 = NameAndType        #61:#62      // _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
    #61 = Utf8               _currentIntention
    #62 = Utf8               Lext/mods/gameserver/model/actor/ai/Intention;
    #63 = Methodref          #64.#65      // ext/mods/gameserver/model/actor/ai/Intention.getFinalTarget:()Lext/mods/gameserver/model/actor/Creature;
    #64 = Class              #66          // ext/mods/gameserver/model/actor/ai/Intention
    #65 = NameAndType        #67:#68      // getFinalTarget:()Lext/mods/gameserver/model/actor/Creature;
    #66 = Utf8               ext/mods/gameserver/model/actor/ai/Intention
    #67 = Utf8               getFinalTarget
    #68 = Utf8               ()Lext/mods/gameserver/model/actor/Creature;
    #69 = Methodref          #70.#71      // ext/mods/gameserver/model/actor/Creature.isAlikeDead:()Z
    #70 = Class              #72          // ext/mods/gameserver/model/actor/Creature
    #71 = NameAndType        #73:#58      // isAlikeDead:()Z
    #72 = Utf8               ext/mods/gameserver/model/actor/Creature
    #73 = Utf8               isAlikeDead
    #74 = Methodref          #70.#75      // ext/mods/gameserver/model/actor/Creature.isVisible:()Z
    #75 = NameAndType        #76:#58      // isVisible:()Z
    #76 = Utf8               isVisible
    #77 = Class              #78          // ext/mods/gameserver/model/actor/Attackable
    #78 = Utf8               ext/mods/gameserver/model/actor/Attackable
    #79 = Methodref          #77.#80      // ext/mods/gameserver/model/actor/Attackable.getAI:()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
    #80 = NameAndType        #81:#82      // getAI:()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
    #81 = Utf8               getAI
    #82 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
    #83 = Methodref          #84.#85      // ext/mods/gameserver/model/actor/ai/type/AttackableAI.getAggroList:()Lext/mods/gameserver/model/actor/container/attackable/AggroList;
    #84 = Class              #86          // ext/mods/gameserver/model/actor/ai/type/AttackableAI
    #85 = NameAndType        #87:#88      // getAggroList:()Lext/mods/gameserver/model/actor/container/attackable/AggroList;
    #86 = Utf8               ext/mods/gameserver/model/actor/ai/type/AttackableAI
    #87 = Utf8               getAggroList
    #88 = Utf8               ()Lext/mods/gameserver/model/actor/container/attackable/AggroList;
    #89 = Methodref          #33.#90      // ext/mods/gameserver/model/actor/container/attackable/AggroList.cleanAllHate:()V
    #90 = NameAndType        #91:#23      // cleanAllHate:()V
    #91 = Utf8               cleanAllHate
    #92 = Methodref          #77.#93      // ext/mods/gameserver/model/actor/Attackable.returnHome:()Z
    #93 = NameAndType        #94:#58      // returnHome:()Z
    #94 = Utf8               returnHome
    #95 = Methodref          #14.#96      // ext/mods/gameserver/model/actor/ai/type/NpcAI.doIdleIntention:()V
    #96 = NameAndType        #97:#23      // doIdleIntention:()V
    #97 = Utf8               doIdleIntention
    #98 = Methodref          #53.#99      // ext/mods/gameserver/model/actor/Npc.distance3D:(Lext/mods/gameserver/model/WorldObject;)D
    #99 = NameAndType        #100:#101    // distance3D:(Lext/mods/gameserver/model/WorldObject;)D
   #100 = Utf8               distance3D
   #101 = Utf8               (Lext/mods/gameserver/model/WorldObject;)D
   #102 = Double             2000.0d
   #104 = Methodref          #53.#105     // ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
   #105 = NameAndType        #106:#107    // getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
   #106 = Utf8               getStatus
   #107 = Utf8               ()Lext/mods/gameserver/model/actor/status/NpcStatus;
   #108 = Methodref          #109.#110    // ext/mods/gameserver/model/actor/status/NpcStatus.getPhysicalAttackRange:()I
   #109 = Class              #111         // ext/mods/gameserver/model/actor/status/NpcStatus
   #110 = NameAndType        #112:#113    // getPhysicalAttackRange:()I
   #111 = Utf8               ext/mods/gameserver/model/actor/status/NpcStatus
   #112 = Utf8               getPhysicalAttackRange
   #113 = Utf8               ()I
   #114 = Methodref          #53.#115     // ext/mods/gameserver/model/actor/Npc.knows:(Lext/mods/gameserver/model/WorldObject;)Z
   #115 = NameAndType        #116:#117    // knows:(Lext/mods/gameserver/model/WorldObject;)Z
   #116 = Utf8               knows
   #117 = Utf8               (Lext/mods/gameserver/model/WorldObject;)Z
   #118 = Methodref          #53.#119     // ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #119 = NameAndType        #120:#121    // getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #120 = Utf8               getTemplate
   #121 = Utf8               ()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #122 = Methodref          #123.#124    // ext/mods/gameserver/model/actor/template/NpcTemplate.getAggroRange:()I
   #123 = Class              #125         // ext/mods/gameserver/model/actor/template/NpcTemplate
   #124 = NameAndType        #126:#113    // getAggroRange:()I
   #125 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
   #126 = Utf8               getAggroRange
   #127 = Methodref          #53.#128     // ext/mods/gameserver/model/actor/Npc.getSeeRange:()I
   #128 = NameAndType        #129:#113    // getSeeRange:()I
   #129 = Utf8               getSeeRange
   #130 = Methodref          #53.#131     // ext/mods/gameserver/model/actor/Npc.isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
   #131 = NameAndType        #132:#133    // isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
   #132 = Utf8               isIn3DRadius
   #133 = Utf8               (Lext/mods/gameserver/model/WorldObject;I)Z
   #134 = Methodref          #135.#136    // ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
   #135 = Class              #137         // ext/mods/gameserver/geoengine/GeoEngine
   #136 = NameAndType        #138:#139    // getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
   #137 = Utf8               ext/mods/gameserver/geoengine/GeoEngine
   #138 = Utf8               getInstance
   #139 = Utf8               ()Lext/mods/gameserver/geoengine/GeoEngine;
   #140 = Methodref          #135.#141    // ext/mods/gameserver/geoengine/GeoEngine.canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
   #141 = NameAndType        #142:#143    // canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
   #142 = Utf8               canSeeTarget
   #143 = Utf8               (Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
   #144 = Methodref          #53.#145     // ext/mods/gameserver/model/actor/Npc.refreshKnownlist:()V
   #145 = NameAndType        #146:#23     // refreshKnownlist:()V
   #146 = Utf8               refreshKnownlist
   #147 = Methodref          #53.#148     // ext/mods/gameserver/model/actor/Npc.getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
   #148 = NameAndType        #149:#150    // getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
   #149 = Utf8               getMove
   #150 = Utf8               ()Lext/mods/gameserver/model/actor/move/CreatureMove;
   #151 = Methodref          #152.#153    // ext/mods/gameserver/model/actor/move/CreatureMove.maybeStartOffensiveFollow:(Lext/mods/gameserver/model/actor/Creature;I)Z
   #152 = Class              #154         // ext/mods/gameserver/model/actor/move/CreatureMove
   #153 = NameAndType        #155:#156    // maybeStartOffensiveFollow:(Lext/mods/gameserver/model/actor/Creature;I)Z
   #154 = Utf8               ext/mods/gameserver/model/actor/move/CreatureMove
   #155 = Utf8               maybeStartOffensiveFollow
   #156 = Utf8               (Lext/mods/gameserver/model/actor/Creature;I)Z
   #157 = Fieldref           #158.#159    // ext/mods/Config.DEBUG_MELEE_ATTACK:Z
   #158 = Class              #160         // ext/mods/Config
   #159 = NameAndType        #161:#162    // DEBUG_MELEE_ATTACK:Z
   #160 = Utf8               ext/mods/Config
   #161 = Utf8               DEBUG_MELEE_ATTACK
   #162 = Utf8               Z
   #163 = Fieldref           #14.#164     // ext/mods/gameserver/model/actor/ai/type/NpcAI.LOGGER:Lext/mods/commons/logging/CLogger;
   #164 = NameAndType        #165:#166    // LOGGER:Lext/mods/commons/logging/CLogger;
   #165 = Utf8               LOGGER
   #166 = Utf8               Lext/mods/commons/logging/CLogger;
   #167 = String             #168         // [MeleeDebug] thinkAttack: refreshKnownlist npc={} target={} dist={}
   #168 = Utf8               [MeleeDebug] thinkAttack: refreshKnownlist npc={} target={} dist={}
   #169 = Class              #170         // java/lang/Object
   #170 = Utf8               java/lang/Object
   #171 = Methodref          #53.#172     // ext/mods/gameserver/model/actor/Npc.getObjectId:()I
   #172 = NameAndType        #173:#113    // getObjectId:()I
   #173 = Utf8               getObjectId
   #174 = Methodref          #175.#176    // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #175 = Class              #177         // java/lang/Integer
   #176 = NameAndType        #178:#179    // valueOf:(I)Ljava/lang/Integer;
   #177 = Utf8               java/lang/Integer
   #178 = Utf8               valueOf
   #179 = Utf8               (I)Ljava/lang/Integer;
   #180 = Methodref          #70.#172     // ext/mods/gameserver/model/actor/Creature.getObjectId:()I
   #181 = Methodref          #182.#183    // java/lang/Double.valueOf:(D)Ljava/lang/Double;
   #182 = Class              #184         // java/lang/Double
   #183 = NameAndType        #178:#185    // valueOf:(D)Ljava/lang/Double;
   #184 = Utf8               java/lang/Double
   #185 = Utf8               (D)Ljava/lang/Double;
   #186 = Methodref          #187.#188    // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #187 = Class              #189         // ext/mods/commons/logging/CLogger
   #188 = NameAndType        #190:#191    // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #189 = Utf8               ext/mods/commons/logging/CLogger
   #190 = Utf8               info
   #191 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
   #192 = InvokeDynamic      #0:#193      // #0:run:(Lext/mods/gameserver/model/actor/ai/type/NpcAI;)Ljava/lang/Runnable;
   #193 = NameAndType        #194:#195    // run:(Lext/mods/gameserver/model/actor/ai/type/NpcAI;)Ljava/lang/Runnable;
   #194 = Utf8               run
   #195 = Utf8               (Lext/mods/gameserver/model/actor/ai/type/NpcAI;)Ljava/lang/Runnable;
   #196 = Long               100l
   #198 = Methodref          #199.#200    // ext/mods/commons/pool/ThreadPool.scheduleIO:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #199 = Class              #201         // ext/mods/commons/pool/ThreadPool
   #200 = NameAndType        #202:#203    // scheduleIO:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #201 = Utf8               ext/mods/commons/pool/ThreadPool
   #202 = Utf8               scheduleIO
   #203 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #204 = String             #205         // [MeleeDebug] thinkAttack: lostKnownlist npc={} target={}
   #205 = Utf8               [MeleeDebug] thinkAttack: lostKnownlist npc={} target={}
   #206 = Methodref          #53.#207     // ext/mods/gameserver/model/actor/Npc.getCollisionRadius:()D
   #207 = NameAndType        #208:#209    // getCollisionRadius:()D
   #208 = Utf8               getCollisionRadius
   #209 = Utf8               ()D
   #210 = Methodref          #70.#207     // ext/mods/gameserver/model/actor/Creature.getCollisionRadius:()D
   #211 = Fieldref           #158.#212    // ext/mods/Config.MONSTER_MAX_RANGE:I
   #212 = NameAndType        #213:#214    // MONSTER_MAX_RANGE:I
   #213 = Utf8               MONSTER_MAX_RANGE
   #214 = Utf8               I
   #215 = String             #216         // [MeleeDebug] thinkAttack: npc={} target={} dist={} maxRange={} moving={} intention={}
   #216 = Utf8               [MeleeDebug] thinkAttack: npc={} target={} dist={} maxRange={} moving={} intention={}
   #217 = Methodref          #53.#218     // ext/mods/gameserver/model/actor/Npc.isMoving:()Z
   #218 = NameAndType        #219:#58     // isMoving:()Z
   #219 = Utf8               isMoving
   #220 = Methodref          #221.#222    // java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
   #221 = Class              #223         // java/lang/Boolean
   #222 = NameAndType        #178:#224    // valueOf:(Z)Ljava/lang/Boolean;
   #223 = Utf8               java/lang/Boolean
   #224 = Utf8               (Z)Ljava/lang/Boolean;
   #225 = Methodref          #64.#226     // ext/mods/gameserver/model/actor/ai/Intention.getType:()Lext/mods/gameserver/enums/IntentionType;
   #226 = NameAndType        #227:#228    // getType:()Lext/mods/gameserver/enums/IntentionType;
   #227 = Utf8               getType
   #228 = Utf8               ()Lext/mods/gameserver/enums/IntentionType;
   #229 = Methodref          #53.#230     // ext/mods/gameserver/model/actor/Npc.getKnownTypeInRadius:(Ljava/lang/Class;I)Ljava/util/List;
   #230 = NameAndType        #231:#232    // getKnownTypeInRadius:(Ljava/lang/Class;I)Ljava/util/List;
   #231 = Utf8               getKnownTypeInRadius
   #232 = Utf8               (Ljava/lang/Class;I)Ljava/util/List;
   #233 = InterfaceMethodref #234.#235    // java/util/List.iterator:()Ljava/util/Iterator;
   #234 = Class              #236         // java/util/List
   #235 = NameAndType        #237:#238    // iterator:()Ljava/util/Iterator;
   #236 = Utf8               java/util/List
   #237 = Utf8               iterator
   #238 = Utf8               ()Ljava/util/Iterator;
   #239 = InterfaceMethodref #240.#241    // java/util/Iterator.hasNext:()Z
   #240 = Class              #242         // java/util/Iterator
   #241 = NameAndType        #243:#58     // hasNext:()Z
   #242 = Utf8               java/util/Iterator
   #243 = Utf8               hasNext
   #244 = InterfaceMethodref #240.#245    // java/util/Iterator.next:()Ljava/lang/Object;
   #245 = NameAndType        #246:#247    // next:()Ljava/lang/Object;
   #246 = Utf8               next
   #247 = Utf8               ()Ljava/lang/Object;
   #248 = Methodref          #70.#249     // ext/mods/gameserver/model/actor/Creature.isDead:()Z
   #249 = NameAndType        #250:#58     // isDead:()Z
   #250 = Utf8               isDead
   #251 = Methodref          #70.#99      // ext/mods/gameserver/model/actor/Creature.distance3D:(Lext/mods/gameserver/model/WorldObject;)D
   #252 = Methodref          #253.#254    // java/lang/Math.abs:(D)D
   #253 = Class              #255         // java/lang/Math
   #254 = NameAndType        #256:#257    // abs:(D)D
   #255 = Utf8               java/lang/Math
   #256 = Utf8               abs
   #257 = Utf8               (D)D
   #258 = Double             35.0d
   #260 = Double             2.0d
   #262 = String             #263         // [MeleeDebug] thinkAttack: startFollow npc={} target={} dist={}
   #263 = Utf8               [MeleeDebug] thinkAttack: startFollow npc={} target={} dist={}
   #264 = Methodref          #53.#265     // ext/mods/gameserver/model/actor/Npc.getAttack:()Lext/mods/gameserver/model/actor/attack/NpcAttack;
   #265 = NameAndType        #266:#267    // getAttack:()Lext/mods/gameserver/model/actor/attack/NpcAttack;
   #266 = Utf8               getAttack
   #267 = Utf8               ()Lext/mods/gameserver/model/actor/attack/NpcAttack;
   #268 = Methodref          #269.#270    // ext/mods/gameserver/model/actor/attack/NpcAttack.isAttackingNow:()Z
   #269 = Class              #271         // ext/mods/gameserver/model/actor/attack/NpcAttack
   #270 = NameAndType        #272:#58     // isAttackingNow:()Z
   #271 = Utf8               ext/mods/gameserver/model/actor/attack/NpcAttack
   #272 = Utf8               isAttackingNow
   #273 = Methodref          #269.#274    // ext/mods/gameserver/model/actor/attack/NpcAttack.isBowCoolingDown:()Z
   #274 = NameAndType        #275:#58     // isBowCoolingDown:()Z
   #275 = Utf8               isBowCoolingDown
   #276 = String             #277         // [MeleeDebug] thinkAttack: cooldown npc={} target={} attackingNow={} bowCooldown={}
   #277 = Utf8               [MeleeDebug] thinkAttack: cooldown npc={} target={} attackingNow={} bowCooldown={}
   #278 = Methodref          #53.#279     // ext/mods/gameserver/model/actor/Npc.getAllSkillsDisabled:()Z
   #279 = NameAndType        #280:#58     // getAllSkillsDisabled:()Z
   #280 = Utf8               getAllSkillsDisabled
   #281 = Methodref          #53.#282     // ext/mods/gameserver/model/actor/Npc.getCast:()Lext/mods/gameserver/model/actor/cast/NpcCast;
   #282 = NameAndType        #283:#284    // getCast:()Lext/mods/gameserver/model/actor/cast/NpcCast;
   #283 = Utf8               getCast
   #284 = Utf8               ()Lext/mods/gameserver/model/actor/cast/NpcCast;
   #285 = Methodref          #286.#287    // ext/mods/gameserver/model/actor/cast/NpcCast.isCastingNow:()Z
   #286 = Class              #288         // ext/mods/gameserver/model/actor/cast/NpcCast
   #287 = NameAndType        #289:#58     // isCastingNow:()Z
   #288 = Utf8               ext/mods/gameserver/model/actor/cast/NpcCast
   #289 = Utf8               isCastingNow
   #290 = Methodref          #291.#292    // ext/mods/commons/random/Rnd.get:(I)I
   #291 = Class              #293         // ext/mods/commons/random/Rnd
   #292 = NameAndType        #294:#295    // get:(I)I
   #293 = Utf8               ext/mods/commons/random/Rnd
   #294 = Utf8               get
   #295 = Utf8               (I)I
   #296 = Methodref          #14.#297     // ext/mods/gameserver/model/actor/ai/type/NpcAI.selectMeleeSkill:()Lext/mods/gameserver/skills/L2Skill;
   #297 = NameAndType        #298:#299    // selectMeleeSkill:()Lext/mods/gameserver/skills/L2Skill;
   #298 = Utf8               selectMeleeSkill
   #299 = Utf8               ()Lext/mods/gameserver/skills/L2Skill;
   #300 = Methodref          #301.#302    // ext/mods/gameserver/skills/L2Skill.isOffensive:()Z
   #301 = Class              #303         // ext/mods/gameserver/skills/L2Skill
   #302 = NameAndType        #304:#58     // isOffensive:()Z
   #303 = Utf8               ext/mods/gameserver/skills/L2Skill
   #304 = Utf8               isOffensive
   #305 = Methodref          #301.#306    // ext/mods/gameserver/skills/L2Skill.isDebuff:()Z
   #306 = NameAndType        #307:#58     // isDebuff:()Z
   #307 = Utf8               isDebuff
   #308 = Methodref          #14.#309     // ext/mods/gameserver/model/actor/ai/type/NpcAI.doCastIntention:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZZIZ)V
   #309 = NameAndType        #310:#311    // doCastIntention:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZZIZ)V
   #310 = Utf8               doCastIntention
   #311 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZZIZ)V
   #312 = String             #313         // [MeleeDebug] thinkAttack: castSkill npc={} skillId={} offensive={}
   #313 = Utf8               [MeleeDebug] thinkAttack: castSkill npc={} skillId={} offensive={}
   #314 = Methodref          #301.#315    // ext/mods/gameserver/skills/L2Skill.getId:()I
   #315 = NameAndType        #316:#113    // getId:()I
   #316 = Utf8               getId
   #317 = Methodref          #269.#318    // ext/mods/gameserver/model/actor/attack/NpcAttack.canAttack:(Lext/mods/gameserver/model/actor/Creature;)Z
   #318 = NameAndType        #319:#320    // canAttack:(Lext/mods/gameserver/model/actor/Creature;)Z
   #319 = Utf8               canAttack
   #320 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
   #321 = Methodref          #152.#322    // ext/mods/gameserver/model/actor/move/CreatureMove.startOffensiveFollow:(Lext/mods/gameserver/model/actor/Creature;I)V
   #322 = NameAndType        #323:#324    // startOffensiveFollow:(Lext/mods/gameserver/model/actor/Creature;I)V
   #323 = Utf8               startOffensiveFollow
   #324 = Utf8               (Lext/mods/gameserver/model/actor/Creature;I)V
   #325 = String             #326         // [MeleeDebug] thinkAttack: canAttack=false npc={} target={} dist={} range={}
   #326 = Utf8               [MeleeDebug] thinkAttack: canAttack=false npc={} target={} dist={} range={}
   #327 = Methodref          #152.#328    // ext/mods/gameserver/model/actor/move/CreatureMove.stop:()V
   #328 = NameAndType        #329:#23     // stop:()V
   #329 = Utf8               stop
   #330 = Methodref          #53.#331     // ext/mods/gameserver/model/actor/Npc.isFacing:(Lext/mods/gameserver/model/WorldObject;I)Z
   #331 = NameAndType        #332:#133    // isFacing:(Lext/mods/gameserver/model/WorldObject;I)Z
   #332 = Utf8               isFacing
   #333 = Methodref          #53.#334     // ext/mods/gameserver/model/actor/Npc.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
   #334 = NameAndType        #335:#336    // getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
   #335 = Utf8               getPosition
   #336 = Utf8               ()Lext/mods/gameserver/model/location/SpawnLocation;
   #337 = Methodref          #338.#339    // ext/mods/gameserver/model/location/SpawnLocation.setHeadingTo:(Lext/mods/gameserver/model/WorldObject;)V
   #338 = Class              #340         // ext/mods/gameserver/model/location/SpawnLocation
   #339 = NameAndType        #341:#342    // setHeadingTo:(Lext/mods/gameserver/model/WorldObject;)V
   #340 = Utf8               ext/mods/gameserver/model/location/SpawnLocation
   #341 = Utf8               setHeadingTo
   #342 = Utf8               (Lext/mods/gameserver/model/WorldObject;)V
   #343 = Methodref          #53.#344     // ext/mods/gameserver/model/actor/Npc.rechargeShots:(ZZ)V
   #344 = NameAndType        #345:#346    // rechargeShots:(ZZ)V
   #345 = Utf8               rechargeShots
   #346 = Utf8               (ZZ)V
   #347 = Methodref          #269.#348    // ext/mods/gameserver/model/actor/attack/NpcAttack.doAttack:(Lext/mods/gameserver/model/actor/Creature;)V
   #348 = NameAndType        #349:#6      // doAttack:(Lext/mods/gameserver/model/actor/Creature;)V
   #349 = Utf8               doAttack
   #350 = String             #351         // [MeleeDebug] thinkAttack: doAttack npc={} target={}
   #351 = Utf8               [MeleeDebug] thinkAttack: doAttack npc={} target={}
   #352 = Methodref          #14.#353     // ext/mods/gameserver/model/actor/ai/type/NpcAI.setNextIntention:(Lext/mods/gameserver/model/actor/ai/Intention;)V
   #353 = NameAndType        #354:#355    // setNextIntention:(Lext/mods/gameserver/model/actor/ai/Intention;)V
   #354 = Utf8               setNextIntention
   #355 = Utf8               (Lext/mods/gameserver/model/actor/ai/Intention;)V
   #356 = Class              #357         // ext/mods/gameserver/enums/actors/NpcSkillType
   #357 = Utf8               ext/mods/gameserver/enums/actors/NpcSkillType
   #358 = Fieldref           #356.#359    // ext/mods/gameserver/enums/actors/NpcSkillType.PHYSICAL_SPECIAL:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #359 = NameAndType        #360:#361    // PHYSICAL_SPECIAL:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #360 = Utf8               PHYSICAL_SPECIAL
   #361 = Utf8               Lext/mods/gameserver/enums/actors/NpcSkillType;
   #362 = Fieldref           #356.#363    // ext/mods/gameserver/enums/actors/NpcSkillType.PHYSICAL_SPECIAL1:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #363 = NameAndType        #364:#361    // PHYSICAL_SPECIAL1:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #364 = Utf8               PHYSICAL_SPECIAL1
   #365 = Fieldref           #356.#366    // ext/mods/gameserver/enums/actors/NpcSkillType.PHYSICAL_SPECIAL2:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #366 = NameAndType        #367:#361    // PHYSICAL_SPECIAL2:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #367 = Utf8               PHYSICAL_SPECIAL2
   #368 = Fieldref           #356.#369    // ext/mods/gameserver/enums/actors/NpcSkillType.PHYSICAL_SPECIAL3:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #369 = NameAndType        #370:#361    // PHYSICAL_SPECIAL3:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #370 = Utf8               PHYSICAL_SPECIAL3
   #371 = Fieldref           #356.#372    // ext/mods/gameserver/enums/actors/NpcSkillType.PHYSICAL_SPECIAL_A:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #372 = NameAndType        #373:#361    // PHYSICAL_SPECIAL_A:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #373 = Utf8               PHYSICAL_SPECIAL_A
   #374 = Fieldref           #356.#375    // ext/mods/gameserver/enums/actors/NpcSkillType.PHYSICAL_SPECIAL_B:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #375 = NameAndType        #376:#361    // PHYSICAL_SPECIAL_B:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #376 = Utf8               PHYSICAL_SPECIAL_B
   #377 = Fieldref           #356.#378    // ext/mods/gameserver/enums/actors/NpcSkillType.PHYSICAL_SPECIAL_RANGE:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #378 = NameAndType        #379:#361    // PHYSICAL_SPECIAL_RANGE:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #379 = Utf8               PHYSICAL_SPECIAL_RANGE
   #380 = Fieldref           #356.#381    // ext/mods/gameserver/enums/actors/NpcSkillType.DD_PHYSIC1:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #381 = NameAndType        #382:#361    // DD_PHYSIC1:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #382 = Utf8               DD_PHYSIC1
   #383 = Fieldref           #356.#384    // ext/mods/gameserver/enums/actors/NpcSkillType.DD_PHYSIC2:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #384 = NameAndType        #385:#361    // DD_PHYSIC2:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #385 = Utf8               DD_PHYSIC2
   #386 = Fieldref           #356.#387    // ext/mods/gameserver/enums/actors/NpcSkillType.DD_PHYSIC3:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #387 = NameAndType        #388:#361    // DD_PHYSIC3:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #388 = Utf8               DD_PHYSIC3
   #389 = Fieldref           #356.#390    // ext/mods/gameserver/enums/actors/NpcSkillType.SPECIAL_ATTACK:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #390 = NameAndType        #391:#361    // SPECIAL_ATTACK:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #391 = Utf8               SPECIAL_ATTACK
   #392 = Fieldref           #356.#393    // ext/mods/gameserver/enums/actors/NpcSkillType.SPECIAL_SKILL:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #393 = NameAndType        #394:#361    // SPECIAL_SKILL:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #394 = Utf8               SPECIAL_SKILL
   #395 = Fieldref           #356.#396    // ext/mods/gameserver/enums/actors/NpcSkillType.RANGE_PHYSICAL_SPECIAL:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #396 = NameAndType        #397:#361    // RANGE_PHYSICAL_SPECIAL:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #397 = Utf8               RANGE_PHYSICAL_SPECIAL
   #398 = Fieldref           #356.#399    // ext/mods/gameserver/enums/actors/NpcSkillType.SELF_RANGE_PHYSICAL_SPECIAL:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #399 = NameAndType        #400:#361    // SELF_RANGE_PHYSICAL_SPECIAL:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #400 = Utf8               SELF_RANGE_PHYSICAL_SPECIAL
   #401 = Fieldref           #356.#402    // ext/mods/gameserver/enums/actors/NpcSkillType.SELF_RANGE_PHYSICAL_SPECIAL_A:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #402 = NameAndType        #403:#361    // SELF_RANGE_PHYSICAL_SPECIAL_A:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #403 = Utf8               SELF_RANGE_PHYSICAL_SPECIAL_A
   #404 = Fieldref           #356.#405    // ext/mods/gameserver/enums/actors/NpcSkillType.MOB_HATE:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #405 = NameAndType        #406:#361    // MOB_HATE:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #406 = Utf8               MOB_HATE
   #407 = Methodref          #123.#408    // ext/mods/gameserver/model/actor/template/NpcTemplate.getSkills:([Lext/mods/gameserver/enums/actors/NpcSkillType;)Ljava/util/List;
   #408 = NameAndType        #409:#410    // getSkills:([Lext/mods/gameserver/enums/actors/NpcSkillType;)Ljava/util/List;
   #409 = Utf8               getSkills
   #410 = Utf8               ([Lext/mods/gameserver/enums/actors/NpcSkillType;)Ljava/util/List;
   #411 = InterfaceMethodref #234.#412    // java/util/List.stream:()Ljava/util/stream/Stream;
   #412 = NameAndType        #413:#414    // stream:()Ljava/util/stream/Stream;
   #413 = Utf8               stream
   #414 = Utf8               ()Ljava/util/stream/Stream;
   #415 = InvokeDynamic      #1:#416      // #1:test:()Ljava/util/function/Predicate;
   #416 = NameAndType        #417:#418    // test:()Ljava/util/function/Predicate;
   #417 = Utf8               test
   #418 = Utf8               ()Ljava/util/function/Predicate;
   #419 = InterfaceMethodref #420.#421    // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #420 = Class              #422         // java/util/stream/Stream
   #421 = NameAndType        #423:#424    // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #422 = Utf8               java/util/stream/Stream
   #423 = Utf8               filter
   #424 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #425 = InterfaceMethodref #420.#426    // java/util/stream/Stream.toList:()Ljava/util/List;
   #426 = NameAndType        #427:#428    // toList:()Ljava/util/List;
   #427 = Utf8               toList
   #428 = Utf8               ()Ljava/util/List;
   #429 = Fieldref           #356.#430    // ext/mods/gameserver/enums/actors/NpcSkillType.BUFF:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #430 = NameAndType        #431:#361    // BUFF:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #431 = Utf8               BUFF
   #432 = Fieldref           #356.#433    // ext/mods/gameserver/enums/actors/NpcSkillType.BUFF1:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #433 = NameAndType        #434:#361    // BUFF1:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #434 = Utf8               BUFF1
   #435 = Fieldref           #356.#436    // ext/mods/gameserver/enums/actors/NpcSkillType.BUFF2:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #436 = NameAndType        #437:#361    // BUFF2:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #437 = Utf8               BUFF2
   #438 = Fieldref           #356.#439    // ext/mods/gameserver/enums/actors/NpcSkillType.BUFF3:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #439 = NameAndType        #440:#361    // BUFF3:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #440 = Utf8               BUFF3
   #441 = Fieldref           #356.#442    // ext/mods/gameserver/enums/actors/NpcSkillType.BUFF4:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #442 = NameAndType        #443:#361    // BUFF4:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #443 = Utf8               BUFF4
   #444 = Fieldref           #356.#445    // ext/mods/gameserver/enums/actors/NpcSkillType.BUFF5:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #445 = NameAndType        #446:#361    // BUFF5:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #446 = Utf8               BUFF5
   #447 = Fieldref           #356.#448    // ext/mods/gameserver/enums/actors/NpcSkillType.BUFF6:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #448 = NameAndType        #449:#361    // BUFF6:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #449 = Utf8               BUFF6
   #450 = Fieldref           #356.#451    // ext/mods/gameserver/enums/actors/NpcSkillType.SELF_BUFF:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #451 = NameAndType        #452:#361    // SELF_BUFF:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #452 = Utf8               SELF_BUFF
   #453 = Fieldref           #356.#454    // ext/mods/gameserver/enums/actors/NpcSkillType.SELF_BUFF1:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #454 = NameAndType        #455:#361    // SELF_BUFF1:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #455 = Utf8               SELF_BUFF1
   #456 = Fieldref           #356.#457    // ext/mods/gameserver/enums/actors/NpcSkillType.SELF_BUFF2:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #457 = NameAndType        #458:#361    // SELF_BUFF2:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #458 = Utf8               SELF_BUFF2
   #459 = Fieldref           #356.#460    // ext/mods/gameserver/enums/actors/NpcSkillType.SELF_BUFF3:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #460 = NameAndType        #461:#361    // SELF_BUFF3:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #461 = Utf8               SELF_BUFF3
   #462 = Fieldref           #356.#463    // ext/mods/gameserver/enums/actors/NpcSkillType.SELF_BUFF4:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #463 = NameAndType        #464:#361    // SELF_BUFF4:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #464 = Utf8               SELF_BUFF4
   #465 = Fieldref           #356.#466    // ext/mods/gameserver/enums/actors/NpcSkillType.SELF_BUFF_A:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #466 = NameAndType        #467:#361    // SELF_BUFF_A:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #467 = Utf8               SELF_BUFF_A
   #468 = Fieldref           #356.#469    // ext/mods/gameserver/enums/actors/NpcSkillType.RANGE_BUFF:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #469 = NameAndType        #470:#361    // RANGE_BUFF:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #470 = Utf8               RANGE_BUFF
   #471 = Fieldref           #356.#472    // ext/mods/gameserver/enums/actors/NpcSkillType.SELF_RANGE_BUFF:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #472 = NameAndType        #473:#361    // SELF_RANGE_BUFF:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #473 = Utf8               SELF_RANGE_BUFF
   #474 = Fieldref           #356.#475    // ext/mods/gameserver/enums/actors/NpcSkillType.SELF_RANGE_BUFF1:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #475 = NameAndType        #476:#361    // SELF_RANGE_BUFF1:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #476 = Utf8               SELF_RANGE_BUFF1
   #477 = Fieldref           #356.#478    // ext/mods/gameserver/enums/actors/NpcSkillType.SELF_RANGE_BUFF_A:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #478 = NameAndType        #479:#361    // SELF_RANGE_BUFF_A:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #479 = Utf8               SELF_RANGE_BUFF_A
   #480 = Fieldref           #356.#481    // ext/mods/gameserver/enums/actors/NpcSkillType.CLAN_BUFF1:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #481 = NameAndType        #482:#361    // CLAN_BUFF1:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #482 = Utf8               CLAN_BUFF1
   #483 = Fieldref           #356.#484    // ext/mods/gameserver/enums/actors/NpcSkillType.W_CLAN_BUFF:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #484 = NameAndType        #485:#361    // W_CLAN_BUFF:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #485 = Utf8               W_CLAN_BUFF
   #486 = Fieldref           #356.#487    // ext/mods/gameserver/enums/actors/NpcSkillType.FURY:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #487 = NameAndType        #488:#361    // FURY:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #488 = Utf8               FURY
   #489 = Fieldref           #356.#490    // ext/mods/gameserver/enums/actors/NpcSkillType.EFFECT_SKILL:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #490 = NameAndType        #491:#361    // EFFECT_SKILL:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #491 = Utf8               EFFECT_SKILL
   #492 = Fieldref           #356.#493    // ext/mods/gameserver/enums/actors/NpcSkillType.EFFECT_SKILL2:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #493 = NameAndType        #494:#361    // EFFECT_SKILL2:Lext/mods/gameserver/enums/actors/NpcSkillType;
   #494 = Utf8               EFFECT_SKILL2
   #495 = InvokeDynamic      #2:#416      // #2:test:()Ljava/util/function/Predicate;
   #496 = InterfaceMethodref #234.#497    // java/util/List.isEmpty:()Z
   #497 = NameAndType        #498:#58     // isEmpty:()Z
   #498 = Utf8               isEmpty
   #499 = InterfaceMethodref #234.#500    // java/util/List.size:()I
   #500 = NameAndType        #501:#113    // size:()I
   #501 = Utf8               size
   #502 = InterfaceMethodref #234.#503    // java/util/List.get:(I)Ljava/lang/Object;
   #503 = NameAndType        #294:#504    // get:(I)Ljava/lang/Object;
   #504 = Utf8               (I)Ljava/lang/Object;
   #505 = Methodref          #70.#506     // ext/mods/gameserver/model/actor/Creature.getX:()I
   #506 = NameAndType        #507:#113    // getX:()I
   #507 = Utf8               getX
   #508 = Methodref          #70.#509     // ext/mods/gameserver/model/actor/Creature.getY:()I
   #509 = NameAndType        #510:#113    // getY:()I
   #510 = Utf8               getY
   #511 = Methodref          #70.#512     // ext/mods/gameserver/model/actor/Creature.getZ:()I
   #512 = NameAndType        #513:#113    // getZ:()I
   #513 = Utf8               getZ
   #514 = Double             40.0d
   #516 = Methodref          #253.#517    // java/lang/Math.toRadians:(D)D
   #517 = NameAndType        #518:#257    // toRadians:(D)D
   #518 = Utf8               toRadians
   #519 = Methodref          #253.#520    // java/lang/Math.cos:(D)D
   #520 = NameAndType        #521:#257    // cos:(D)D
   #521 = Utf8               cos
   #522 = Methodref          #253.#523    // java/lang/Math.sin:(D)D
   #523 = NameAndType        #524:#257    // sin:(D)D
   #524 = Utf8               sin
   #525 = Methodref          #135.#526    // ext/mods/gameserver/geoengine/GeoEngine.canMoveToTarget:(IIIIII)Z
   #526 = NameAndType        #527:#528    // canMoveToTarget:(IIIIII)Z
   #527 = Utf8               canMoveToTarget
   #528 = Utf8               (IIIIII)Z
   #529 = Methodref          #135.#530    // ext/mods/gameserver/geoengine/GeoEngine.getHeight:(III)S
   #530 = NameAndType        #531:#532    // getHeight:(III)S
   #531 = Utf8               getHeight
   #532 = Utf8               (III)S
   #533 = Class              #534         // ext/mods/gameserver/model/location/Location
   #534 = Utf8               ext/mods/gameserver/model/location/Location
   #535 = Methodref          #533.#536    // ext/mods/gameserver/model/location/Location."<init>":(III)V
   #536 = NameAndType        #5:#537      // "<init>":(III)V
   #537 = Utf8               (III)V
   #538 = Fieldref           #539.#540    // ext/mods/gameserver/enums/IntentionType.ATTACK:Lext/mods/gameserver/enums/IntentionType;
   #539 = Class              #541         // ext/mods/gameserver/enums/IntentionType
   #540 = NameAndType        #542:#543    // ATTACK:Lext/mods/gameserver/enums/IntentionType;
   #541 = Utf8               ext/mods/gameserver/enums/IntentionType
   #542 = Utf8               ATTACK
   #543 = Utf8               Lext/mods/gameserver/enums/IntentionType;
   #544 = InvokeDynamic      #3:#193      // #3:run:(Lext/mods/gameserver/model/actor/ai/type/NpcAI;)Ljava/lang/Runnable;
   #545 = Methodref          #199.#546    // ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #546 = NameAndType        #547:#203    // schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #547 = Utf8               schedule
   #548 = Fieldref           #14.#549     // ext/mods/gameserver/model/actor/ai/type/NpcAI._isOnARoute:Z
   #549 = NameAndType        #550:#162    // _isOnARoute:Z
   #550 = Utf8               _isOnARoute
   #551 = Methodref          #2.#552      // ext/mods/gameserver/model/actor/ai/type/CreatureAI.stopAITask:()V
   #552 = NameAndType        #553:#23     // stopAITask:()V
   #553 = Utf8               stopAITask
   #554 = Methodref          #53.#555     // ext/mods/gameserver/model/actor/Npc.abortAll:(Z)V
   #555 = NameAndType        #556:#557    // abortAll:(Z)V
   #556 = Utf8               abortAll
   #557 = Utf8               (Z)V
   #558 = Methodref          #53.#559     // ext/mods/gameserver/model/actor/Npc.forceWalkStance:()V
   #559 = NameAndType        #560:#23     // forceWalkStance:()V
   #560 = Utf8               forceWalkStance
   #561 = Fieldref           #562.#563    // ext/mods/gameserver/enums/EventHandler.NO_DESIRE:Lext/mods/gameserver/enums/EventHandler;
   #562 = Class              #564         // ext/mods/gameserver/enums/EventHandler
   #563 = NameAndType        #565:#566    // NO_DESIRE:Lext/mods/gameserver/enums/EventHandler;
   #564 = Utf8               ext/mods/gameserver/enums/EventHandler
   #565 = Utf8               NO_DESIRE
   #566 = Utf8               Lext/mods/gameserver/enums/EventHandler;
   #567 = Methodref          #123.#568    // ext/mods/gameserver/model/actor/template/NpcTemplate.getEventQuests:(Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
   #568 = NameAndType        #569:#570    // getEventQuests:(Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
   #569 = Utf8               getEventQuests
   #570 = Utf8               (Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
   #571 = Class              #572         // ext/mods/gameserver/scripting/Quest
   #572 = Utf8               ext/mods/gameserver/scripting/Quest
   #573 = Methodref          #571.#574    // ext/mods/gameserver/scripting/Quest.onNoDesire:(Lext/mods/gameserver/model/actor/Npc;)V
   #574 = NameAndType        #575:#37     // onNoDesire:(Lext/mods/gameserver/model/actor/Npc;)V
   #575 = Utf8               onNoDesire
   #576 = Methodref          #14.#577     // ext/mods/gameserver/model/actor/ai/type/NpcAI.clearCurrentDesire:()V
   #577 = NameAndType        #578:#23     // clearCurrentDesire:()V
   #578 = Utf8               clearCurrentDesire
   #579 = Methodref          #580.#581    // java/lang/System.currentTimeMillis:()J
   #580 = Class              #582         // java/lang/System
   #581 = NameAndType        #583:#584    // currentTimeMillis:()J
   #582 = Utf8               java/lang/System
   #583 = Utf8               currentTimeMillis
   #584 = Utf8               ()J
   #585 = Methodref          #64.#586     // ext/mods/gameserver/model/actor/ai/Intention.getTimer:()I
   #586 = NameAndType        #587:#113    // getTimer:()I
   #587 = Utf8               getTimer
   #588 = Fieldref           #14.#589     // ext/mods/gameserver/model/actor/ai/type/NpcAI._lastSocialBroadcast:J
   #589 = NameAndType        #590:#591    // _lastSocialBroadcast:J
   #590 = Utf8               _lastSocialBroadcast
   #591 = Utf8               J
   #592 = Class              #593         // ext/mods/gameserver/network/serverpackets/SocialAction
   #593 = Utf8               ext/mods/gameserver/network/serverpackets/SocialAction
   #594 = Methodref          #64.#595     // ext/mods/gameserver/model/actor/ai/Intention.getItemObjectId:()I
   #595 = NameAndType        #596:#113    // getItemObjectId:()I
   #596 = Utf8               getItemObjectId
   #597 = Methodref          #592.#598    // ext/mods/gameserver/network/serverpackets/SocialAction."<init>":(Lext/mods/gameserver/model/actor/Creature;I)V
   #598 = NameAndType        #5:#324      // "<init>":(Lext/mods/gameserver/model/actor/Creature;I)V
   #599 = Methodref          #53.#600     // ext/mods/gameserver/model/actor/Npc.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #600 = NameAndType        #601:#602    // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #601 = Utf8               broadcastPacket
   #602 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #603 = Fieldref           #14.#604     // ext/mods/gameserver/model/actor/ai/type/NpcAI._runAiStep:I
   #604 = NameAndType        #605:#214    // _runAiStep:I
   #605 = Utf8               _runAiStep
   #606 = Methodref          #53.#607     // ext/mods/gameserver/model/actor/Npc.setWalkOrRun:(Z)V
   #607 = NameAndType        #608:#557    // setWalkOrRun:(Z)V
   #608 = Utf8               setWalkOrRun
   #609 = Methodref          #53.#610     // ext/mods/gameserver/model/actor/Npc.isMovementDisabled:()Z
   #610 = NameAndType        #611:#58     // isMovementDisabled:()Z
   #611 = Utf8               isMovementDisabled
   #612 = Methodref          #152.#613    // ext/mods/gameserver/model/actor/move/CreatureMove.getGeoPathFailCount:()I
   #613 = NameAndType        #614:#113    // getGeoPathFailCount:()I
   #614 = Utf8               getGeoPathFailCount
   #615 = Methodref          #53.#616     // ext/mods/gameserver/model/actor/Npc.hasMaster:()Z
   #616 = NameAndType        #617:#58     // hasMaster:()Z
   #617 = Utf8               hasMaster
   #618 = Methodref          #53.#619     // ext/mods/gameserver/model/actor/Npc.getMaster:()Lext/mods/gameserver/model/actor/Npc;
   #619 = NameAndType        #620:#621    // getMaster:()Lext/mods/gameserver/model/actor/Npc;
   #620 = Utf8               getMaster
   #621 = Utf8               ()Lext/mods/gameserver/model/actor/Npc;
   #622 = Methodref          #53.#623     // ext/mods/gameserver/model/actor/Npc.isIn2DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
   #623 = NameAndType        #624:#133    // isIn2DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
   #624 = Utf8               isIn2DRadius
   #625 = Methodref          #70.#334     // ext/mods/gameserver/model/actor/Creature.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
   #626 = Methodref          #152.#627    // ext/mods/gameserver/model/actor/move/CreatureMove.maybeMoveToLocation:(Lext/mods/gameserver/model/location/Location;IZZ)Z
   #627 = NameAndType        #628:#629    // maybeMoveToLocation:(Lext/mods/gameserver/model/location/Location;IZZ)Z
   #628 = Utf8               maybeMoveToLocation
   #629 = Utf8               (Lext/mods/gameserver/model/location/Location;IZZ)Z
   #630 = Methodref          #631.#632    // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
   #631 = Class              #633         // ext/mods/gameserver/model/World
   #632 = NameAndType        #138:#634    // getInstance:()Lext/mods/gameserver/model/World;
   #633 = Utf8               ext/mods/gameserver/model/World
   #634 = Utf8               ()Lext/mods/gameserver/model/World;
   #635 = Methodref          #631.#636    // ext/mods/gameserver/model/World.getObject:(I)Lext/mods/gameserver/model/WorldObject;
   #636 = NameAndType        #637:#638    // getObject:(I)Lext/mods/gameserver/model/WorldObject;
   #637 = Utf8               getObject
   #638 = Utf8               (I)Lext/mods/gameserver/model/WorldObject;
   #639 = Class              #640         // ext/mods/gameserver/model/item/instance/ItemInstance
   #640 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
   #641 = Methodref          #14.#642     // ext/mods/gameserver/model/actor/ai/type/NpcAI.isTargetLost:(Lext/mods/gameserver/model/WorldObject;)Z
   #642 = NameAndType        #643:#117    // isTargetLost:(Lext/mods/gameserver/model/WorldObject;)Z
   #643 = Utf8               isTargetLost
   #644 = Methodref          #639.#645    // ext/mods/gameserver/model/item/instance/ItemInstance.getLocation:()Lext/mods/gameserver/enums/items/ItemLocation;
   #645 = NameAndType        #646:#647    // getLocation:()Lext/mods/gameserver/enums/items/ItemLocation;
   #646 = Utf8               getLocation
   #647 = Utf8               ()Lext/mods/gameserver/enums/items/ItemLocation;
   #648 = Fieldref           #649.#650    // ext/mods/gameserver/enums/items/ItemLocation.VOID:Lext/mods/gameserver/enums/items/ItemLocation;
   #649 = Class              #651         // ext/mods/gameserver/enums/items/ItemLocation
   #650 = NameAndType        #652:#653    // VOID:Lext/mods/gameserver/enums/items/ItemLocation;
   #651 = Utf8               ext/mods/gameserver/enums/items/ItemLocation
   #652 = Utf8               VOID
   #653 = Utf8               Lext/mods/gameserver/enums/items/ItemLocation;
   #654 = Methodref          #655.#334    // ext/mods/gameserver/model/WorldObject.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
   #655 = Class              #656         // ext/mods/gameserver/model/WorldObject
   #656 = Utf8               ext/mods/gameserver/model/WorldObject
   #657 = Fieldref           #562.#658    // ext/mods/gameserver/enums/EventHandler.PICKED_ITEM:Lext/mods/gameserver/enums/EventHandler;
   #658 = NameAndType        #659:#566    // PICKED_ITEM:Lext/mods/gameserver/enums/EventHandler;
   #659 = Utf8               PICKED_ITEM
   #660 = Methodref          #571.#661    // ext/mods/gameserver/scripting/Quest.onPickedItem:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
   #661 = NameAndType        #662:#663    // onPickedItem:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
   #662 = Utf8               onPickedItem
   #663 = Utf8               (Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
   #664 = Methodref          #665.#666    // ext/mods/gameserver/data/manager/CursedWeaponManager.getInstance:()Lext/mods/gameserver/data/manager/CursedWeaponManager;
   #665 = Class              #667         // ext/mods/gameserver/data/manager/CursedWeaponManager
   #666 = NameAndType        #138:#668    // getInstance:()Lext/mods/gameserver/data/manager/CursedWeaponManager;
   #667 = Utf8               ext/mods/gameserver/data/manager/CursedWeaponManager
   #668 = Utf8               ()Lext/mods/gameserver/data/manager/CursedWeaponManager;
   #669 = Methodref          #639.#670    // ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
   #670 = NameAndType        #671:#113    // getItemId:()I
   #671 = Utf8               getItemId
   #672 = Methodref          #665.#673    // ext/mods/gameserver/data/manager/CursedWeaponManager.getCursedWeapon:(I)Lext/mods/gameserver/model/entity/CursedWeapon;
   #673 = NameAndType        #674:#675    // getCursedWeapon:(I)Lext/mods/gameserver/model/entity/CursedWeapon;
   #674 = Utf8               getCursedWeapon
   #675 = Utf8               (I)Lext/mods/gameserver/model/entity/CursedWeapon;
   #676 = Methodref          #677.#678    // ext/mods/gameserver/model/entity/CursedWeapon.endOfLife:()V
   #677 = Class              #679         // ext/mods/gameserver/model/entity/CursedWeapon
   #678 = NameAndType        #680:#23     // endOfLife:()V
   #679 = Utf8               ext/mods/gameserver/model/entity/CursedWeapon
   #680 = Utf8               endOfLife
   #681 = Methodref          #639.#682    // ext/mods/gameserver/model/item/instance/ItemInstance.decayMe:()V
   #682 = NameAndType        #683:#23     // decayMe:()V
   #683 = Utf8               decayMe
   #684 = Methodref          #53.#685     // ext/mods/gameserver/model/actor/Npc.getNpcId:()I
   #685 = NameAndType        #686:#113    // getNpcId:()I
   #686 = Utf8               getNpcId
   #687 = Methodref          #14.#688     // ext/mods/gameserver/model/actor/ai/type/NpcAI.moveToNextPoint:()V
   #688 = NameAndType        #689:#23     // moveToNextPoint:()V
   #689 = Utf8               moveToNextPoint
   #690 = Methodref          #64.#691     // ext/mods/gameserver/model/actor/ai/Intention.getLoc:()Lext/mods/gameserver/model/location/Location;
   #691 = NameAndType        #692:#693    // getLoc:()Lext/mods/gameserver/model/location/Location;
   #692 = Utf8               getLoc
   #693 = Utf8               ()Lext/mods/gameserver/model/location/Location;
   #694 = Methodref          #338.#695    // ext/mods/gameserver/model/location/SpawnLocation.equals:(Ljava/lang/Object;)Z
   #695 = NameAndType        #696:#697    // equals:(Ljava/lang/Object;)Z
   #696 = Utf8               equals
   #697 = Utf8               (Ljava/lang/Object;)Z
   #698 = Fieldref           #562.#699    // ext/mods/gameserver/enums/EventHandler.MOVE_TO_FINISHED:Lext/mods/gameserver/enums/EventHandler;
   #699 = NameAndType        #700:#566    // MOVE_TO_FINISHED:Lext/mods/gameserver/enums/EventHandler;
   #700 = Utf8               MOVE_TO_FINISHED
   #701 = Methodref          #53.#506     // ext/mods/gameserver/model/actor/Npc.getX:()I
   #702 = Methodref          #53.#509     // ext/mods/gameserver/model/actor/Npc.getY:()I
   #703 = Methodref          #53.#512     // ext/mods/gameserver/model/actor/Npc.getZ:()I
   #704 = Methodref          #571.#705    // ext/mods/gameserver/scripting/Quest.onMoveToFinished:(Lext/mods/gameserver/model/actor/Npc;III)V
   #705 = NameAndType        #706:#707    // onMoveToFinished:(Lext/mods/gameserver/model/actor/Npc;III)V
   #706 = Utf8               onMoveToFinished
   #707 = Utf8               (Lext/mods/gameserver/model/actor/Npc;III)V
   #708 = Methodref          #2.#709      // ext/mods/gameserver/model/actor/ai/type/CreatureAI.thinkMoveTo:()V
   #709 = NameAndType        #710:#23     // thinkMoveTo:()V
   #710 = Utf8               thinkMoveTo
   #711 = Fieldref           #712.#713    // ext/mods/gameserver/enums/AiEventType.THINK:Lext/mods/gameserver/enums/AiEventType;
   #712 = Class              #714         // ext/mods/gameserver/enums/AiEventType
   #713 = NameAndType        #715:#716    // THINK:Lext/mods/gameserver/enums/AiEventType;
   #714 = Utf8               ext/mods/gameserver/enums/AiEventType
   #715 = Utf8               THINK
   #716 = Utf8               Lext/mods/gameserver/enums/AiEventType;
   #717 = Methodref          #14.#718     // ext/mods/gameserver/model/actor/ai/type/NpcAI.notifyEvent:(Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
   #718 = NameAndType        #719:#720    // notifyEvent:(Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
   #719 = Utf8               notifyEvent
   #720 = Utf8               (Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
   #721 = Fieldref           #722.#723    // ext/mods/gameserver/model/actor/ai/type/NpcAI$1.$SwitchMap$ext$mods$gameserver$enums$IntentionType:[I
   #722 = Class              #724         // ext/mods/gameserver/model/actor/ai/type/NpcAI$1
   #723 = NameAndType        #725:#726    // $SwitchMap$ext$mods$gameserver$enums$IntentionType:[I
   #724 = Utf8               ext/mods/gameserver/model/actor/ai/type/NpcAI$1
   #725 = Utf8               $SwitchMap$ext$mods$gameserver$enums$IntentionType
   #726 = Utf8               [I
   #727 = Methodref          #539.#728    // ext/mods/gameserver/enums/IntentionType.ordinal:()I
   #728 = NameAndType        #729:#113    // ordinal:()I
   #729 = Utf8               ordinal
   #730 = Methodref          #53.#731     // ext/mods/gameserver/model/actor/Npc.getSpawnLocation:()Lext/mods/gameserver/model/location/SpawnLocation;
   #731 = NameAndType        #732:#336    // getSpawnLocation:()Lext/mods/gameserver/model/location/SpawnLocation;
   #732 = Utf8               getSpawnLocation
   #733 = Methodref          #338.#734    // ext/mods/gameserver/model/location/SpawnLocation.getHeading:()I
   #734 = NameAndType        #735:#113    // getHeading:()I
   #735 = Utf8               getHeading
   #736 = Methodref          #338.#737    // ext/mods/gameserver/model/location/SpawnLocation.setHeading:(I)V
   #737 = NameAndType        #738:#739    // setHeading:(I)V
   #738 = Utf8               setHeading
   #739 = Utf8               (I)V
   #740 = Methodref          #53.#741     // ext/mods/gameserver/model/actor/Npc.isInMyTerritory:()Z
   #741 = NameAndType        #742:#58     // isInMyTerritory:()Z
   #742 = Utf8               isInMyTerritory
   #743 = Fieldref           #14.#744     // ext/mods/gameserver/model/actor/ai/type/NpcAI._isOOT:Z
   #744 = NameAndType        #745:#162    // _isOOT:Z
   #745 = Utf8               _isOOT
   #746 = Fieldref           #562.#747    // ext/mods/gameserver/enums/EventHandler.OUT_OF_TERRITORY:Lext/mods/gameserver/enums/EventHandler;
   #747 = NameAndType        #748:#566    // OUT_OF_TERRITORY:Lext/mods/gameserver/enums/EventHandler;
   #748 = Utf8               OUT_OF_TERRITORY
   #749 = Methodref          #571.#750    // ext/mods/gameserver/scripting/Quest.onOutOfTerritory:(Lext/mods/gameserver/model/actor/Npc;)V
   #750 = NameAndType        #751:#37     // onOutOfTerritory:(Lext/mods/gameserver/model/actor/Npc;)V
   #751 = Utf8               onOutOfTerritory
   #752 = Fieldref           #14.#753     // ext/mods/gameserver/model/actor/ai/type/NpcAI._clearAggroTask:Ljava/util/concurrent/ScheduledFuture;
   #753 = NameAndType        #754:#755    // _clearAggroTask:Ljava/util/concurrent/ScheduledFuture;
   #754 = Utf8               _clearAggroTask
   #755 = Utf8               Ljava/util/concurrent/ScheduledFuture;
   #756 = InterfaceMethodref #757.#758    // java/util/concurrent/ScheduledFuture.cancel:(Z)Z
   #757 = Class              #759         // java/util/concurrent/ScheduledFuture
   #758 = NameAndType        #760:#761    // cancel:(Z)Z
   #759 = Utf8               java/util/concurrent/ScheduledFuture
   #760 = Utf8               cancel
   #761 = Utf8               (Z)Z
   #762 = InvokeDynamic      #4:#193      // #4:run:(Lext/mods/gameserver/model/actor/ai/type/NpcAI;)Ljava/lang/Runnable;
   #763 = Long               10000l
   #765 = Methodref          #199.#766    // ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #766 = NameAndType        #767:#768    // scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #767 = Utf8               scheduleAtFixedRate
   #768 = Utf8               (Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #769 = Fieldref           #539.#770    // ext/mods/gameserver/enums/IntentionType.MOVE_ROUTE:Lext/mods/gameserver/enums/IntentionType;
   #770 = NameAndType        #771:#543    // MOVE_ROUTE:Lext/mods/gameserver/enums/IntentionType;
   #771 = Utf8               MOVE_ROUTE
   #772 = Methodref          #773.#774    // ext/mods/gameserver/data/xml/WalkerRouteData.getInstance:()Lext/mods/gameserver/data/xml/WalkerRouteData;
   #773 = Class              #775         // ext/mods/gameserver/data/xml/WalkerRouteData
   #774 = NameAndType        #138:#776    // getInstance:()Lext/mods/gameserver/data/xml/WalkerRouteData;
   #775 = Utf8               ext/mods/gameserver/data/xml/WalkerRouteData
   #776 = Utf8               ()Lext/mods/gameserver/data/xml/WalkerRouteData;
   #777 = Methodref          #64.#778     // ext/mods/gameserver/model/actor/ai/Intention.getRouteName:()Ljava/lang/String;
   #778 = NameAndType        #779:#780    // getRouteName:()Ljava/lang/String;
   #779 = Utf8               getRouteName
   #780 = Utf8               ()Ljava/lang/String;
   #781 = Methodref          #123.#782    // ext/mods/gameserver/model/actor/template/NpcTemplate.getAlias:()Ljava/lang/String;
   #782 = NameAndType        #783:#780    // getAlias:()Ljava/lang/String;
   #783 = Utf8               getAlias
   #784 = Methodref          #773.#785    // ext/mods/gameserver/data/xml/WalkerRouteData.getWalkerRoute:(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
   #785 = NameAndType        #786:#787    // getWalkerRoute:(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
   #786 = Utf8               getWalkerRoute
   #787 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
   #788 = Fieldref           #14.#789     // ext/mods/gameserver/model/actor/ai/type/NpcAI._routeIndex:I
   #789 = NameAndType        #790:#214    // _routeIndex:I
   #790 = Utf8               _routeIndex
   #791 = Class              #792         // ext/mods/gameserver/model/location/WalkerLocation
   #792 = Utf8               ext/mods/gameserver/model/location/WalkerLocation
   #793 = Methodref          #791.#794    // ext/mods/gameserver/model/location/WalkerLocation.getNpcStringId:()Lext/mods/gameserver/network/NpcStringId;
   #794 = NameAndType        #795:#796    // getNpcStringId:()Lext/mods/gameserver/network/NpcStringId;
   #795 = Utf8               getNpcStringId
   #796 = Utf8               ()Lext/mods/gameserver/network/NpcStringId;
   #797 = Methodref          #53.#798     // ext/mods/gameserver/model/actor/Npc.broadcastNpcSay:(Lext/mods/gameserver/network/NpcStringId;)V
   #798 = NameAndType        #799:#800    // broadcastNpcSay:(Lext/mods/gameserver/network/NpcStringId;)V
   #799 = Utf8               broadcastNpcSay
   #800 = Utf8               (Lext/mods/gameserver/network/NpcStringId;)V
   #801 = Methodref          #791.#802    // ext/mods/gameserver/model/location/WalkerLocation.getDelay:()I
   #802 = NameAndType        #803:#113    // getDelay:()I
   #803 = Utf8               getDelay
   #804 = Methodref          #791.#805    // ext/mods/gameserver/model/location/WalkerLocation.getSocialId:()I
   #805 = NameAndType        #806:#113    // getSocialId:()I
   #806 = Utf8               getSocialId
   #807 = Methodref          #808.#809    // ext/mods/gameserver/taskmanager/WalkerTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/WalkerTaskManager;
   #808 = Class              #810         // ext/mods/gameserver/taskmanager/WalkerTaskManager
   #809 = NameAndType        #138:#811    // getInstance:()Lext/mods/gameserver/taskmanager/WalkerTaskManager;
   #810 = Utf8               ext/mods/gameserver/taskmanager/WalkerTaskManager
   #811 = Utf8               ()Lext/mods/gameserver/taskmanager/WalkerTaskManager;
   #812 = Methodref          #808.#813    // ext/mods/gameserver/taskmanager/WalkerTaskManager.add:(Lext/mods/gameserver/model/actor/Npc;I)V
   #813 = NameAndType        #814:#815    // add:(Lext/mods/gameserver/model/actor/Npc;I)V
   #814 = Utf8               add
   #815 = Utf8               (Lext/mods/gameserver/model/actor/Npc;I)V
   #816 = Methodref          #2.#817      // ext/mods/gameserver/model/actor/ai/type/CreatureAI.onEvtArrivedBlocked:()V
   #817 = NameAndType        #818:#23     // onEvtArrivedBlocked:()V
   #818 = Utf8               onEvtArrivedBlocked
   #819 = Methodref          #14.#820     // ext/mods/gameserver/model/actor/ai/type/NpcAI.runAI:(Z)V
   #820 = NameAndType        #821:#557    // runAI:(Z)V
   #821 = Utf8               runAI
   #822 = Methodref          #33.#30      // ext/mods/gameserver/model/actor/container/attackable/AggroList.clear:()V
   #823 = Methodref          #42.#30      // ext/mods/gameserver/model/actor/container/attackable/HateList.clear:()V
   #824 = Fieldref           #14.#825     // ext/mods/gameserver/model/actor/ai/type/NpcAI._isReversePath:Z
   #825 = NameAndType        #826:#162    // _isReversePath:Z
   #826 = Utf8               _isReversePath
   #827 = Fieldref           #14.#828     // ext/mods/gameserver/model/actor/ai/type/NpcAI._lifeTime:I
   #828 = NameAndType        #829:#214    // _lifeTime:I
   #829 = Utf8               _lifeTime
   #830 = Fieldref           #14.#831     // ext/mods/gameserver/model/actor/ai/type/NpcAI._topDesireTarget:Lext/mods/gameserver/model/actor/Creature;
   #831 = NameAndType        #832:#52     // _topDesireTarget:Lext/mods/gameserver/model/actor/Creature;
   #832 = Utf8               _topDesireTarget
   #833 = Fieldref           #14.#834     // ext/mods/gameserver/model/actor/ai/type/NpcAI._lastDesire:Lext/mods/gameserver/model/actor/ai/Desire;
   #834 = NameAndType        #835:#836    // _lastDesire:Lext/mods/gameserver/model/actor/ai/Desire;
   #835 = Utf8               _lastDesire
   #836 = Utf8               Lext/mods/gameserver/model/actor/ai/Desire;
   #837 = Methodref          #838.#226    // ext/mods/gameserver/model/actor/ai/Desire.getType:()Lext/mods/gameserver/enums/IntentionType;
   #838 = Class              #839         // ext/mods/gameserver/model/actor/ai/Desire
   #839 = Utf8               ext/mods/gameserver/model/actor/ai/Desire
   #840 = Fieldref           #539.#841    // ext/mods/gameserver/enums/IntentionType.IDLE:Lext/mods/gameserver/enums/IntentionType;
   #841 = NameAndType        #842:#543    // IDLE:Lext/mods/gameserver/enums/IntentionType;
   #842 = Utf8               IDLE
   #843 = Methodref          #14.#844     // ext/mods/gameserver/model/actor/ai/type/NpcAI.getDesires:()Ljava/util/Set;
   #844 = NameAndType        #845:#846    // getDesires:()Ljava/util/Set;
   #845 = Utf8               getDesires
   #846 = Utf8               ()Ljava/util/Set;
   #847 = InterfaceMethodref #29.#848     // java/util/Set.remove:(Ljava/lang/Object;)Z
   #848 = NameAndType        #849:#697    // remove:(Ljava/lang/Object;)Z
   #849 = Utf8               remove
   #850 = Fieldref           #562.#851    // ext/mods/gameserver/enums/EventHandler.SEE_CREATURE:Lext/mods/gameserver/enums/EventHandler;
   #851 = NameAndType        #852:#566    // SEE_CREATURE:Lext/mods/gameserver/enums/EventHandler;
   #852 = Utf8               SEE_CREATURE
   #853 = Class              #854         // ext/mods/gameserver/model/actor/Playable
   #854 = Utf8               ext/mods/gameserver/model/actor/Playable
   #855 = InvokeDynamic      #5:#856      // #5:accept:(Lext/mods/gameserver/model/actor/ai/type/NpcAI;Ljava/util/List;)Ljava/util/function/Consumer;
   #856 = NameAndType        #857:#858    // accept:(Lext/mods/gameserver/model/actor/ai/type/NpcAI;Ljava/util/List;)Ljava/util/function/Consumer;
   #857 = Utf8               accept
   #858 = Utf8               (Lext/mods/gameserver/model/actor/ai/type/NpcAI;Ljava/util/List;)Ljava/util/function/Consumer;
   #859 = Methodref          #53.#860     // ext/mods/gameserver/model/actor/Npc.forEachKnownType:(Ljava/lang/Class;Ljava/util/function/Consumer;)V
   #860 = NameAndType        #861:#862    // forEachKnownType:(Ljava/lang/Class;Ljava/util/function/Consumer;)V
   #861 = Utf8               forEachKnownType
   #862 = Utf8               (Ljava/lang/Class;Ljava/util/function/Consumer;)V
   #863 = Methodref          #19.#844     // ext/mods/gameserver/model/actor/ai/DesireQueue.getDesires:()Ljava/util/Set;
   #864 = InvokeDynamic      #6:#865      // #6:test:(Lext/mods/gameserver/model/actor/ai/type/NpcAI;)Ljava/util/function/Predicate;
   #865 = NameAndType        #417:#866    // test:(Lext/mods/gameserver/model/actor/ai/type/NpcAI;)Ljava/util/function/Predicate;
   #866 = Utf8               (Lext/mods/gameserver/model/actor/ai/type/NpcAI;)Ljava/util/function/Predicate;
   #867 = InterfaceMethodref #29.#868     // java/util/Set.removeIf:(Ljava/util/function/Predicate;)Z
   #868 = NameAndType        #869:#870    // removeIf:(Ljava/util/function/Predicate;)Z
   #869 = Utf8               removeIf
   #870 = Utf8               (Ljava/util/function/Predicate;)Z
   #871 = InvokeDynamic      #7:#865      // #7:test:(Lext/mods/gameserver/model/actor/ai/type/NpcAI;)Ljava/util/function/Predicate;
   #872 = InvokeDynamic      #8:#865      // #8:test:(Lext/mods/gameserver/model/actor/ai/type/NpcAI;)Ljava/util/function/Predicate;
   #873 = Methodref          #53.#874     // ext/mods/gameserver/model/actor/Npc.isOutOfControl:()Z
   #874 = NameAndType        #875:#58     // isOutOfControl:()Z
   #875 = Utf8               isOutOfControl
   #876 = InterfaceMethodref #29.#412     // java/util/Set.stream:()Ljava/util/stream/Stream;
   #877 = InvokeDynamic      #9:#416      // #9:test:()Ljava/util/function/Predicate;
   #878 = InterfaceMethodref #420.#879    // java/util/stream/Stream.anyMatch:(Ljava/util/function/Predicate;)Z
   #879 = NameAndType        #880:#870    // anyMatch:(Ljava/util/function/Predicate;)Z
   #880 = Utf8               anyMatch
   #881 = Fieldref           #539.#882    // ext/mods/gameserver/enums/IntentionType.FLEE:Lext/mods/gameserver/enums/IntentionType;
   #882 = NameAndType        #883:#543    // FLEE:Lext/mods/gameserver/enums/IntentionType;
   #883 = Utf8               FLEE
   #884 = InterfaceMethodref #29.#885     // java/util/Set.contains:(Ljava/lang/Object;)Z
   #885 = NameAndType        #886:#697    // contains:(Ljava/lang/Object;)Z
   #886 = Utf8               contains
   #887 = InterfaceMethodref #29.#497     // java/util/Set.isEmpty:()Z
   #888 = Fieldref           #14.#889     // ext/mods/gameserver/model/actor/ai/type/NpcAI._nextDesire:Lext/mods/gameserver/model/actor/ai/Desire;
   #889 = NameAndType        #890:#836    // _nextDesire:Lext/mods/gameserver/model/actor/ai/Desire;
   #890 = Utf8               _nextDesire
   #891 = Methodref          #19.#892     // ext/mods/gameserver/model/actor/ai/DesireQueue.getLast:()Lext/mods/gameserver/model/actor/ai/Desire;
   #892 = NameAndType        #893:#894    // getLast:()Lext/mods/gameserver/model/actor/ai/Desire;
   #893 = Utf8               getLast
   #894 = Utf8               ()Lext/mods/gameserver/model/actor/ai/Desire;
   #895 = Fieldref           #539.#896    // ext/mods/gameserver/enums/IntentionType.WANDER:Lext/mods/gameserver/enums/IntentionType;
   #896 = NameAndType        #897:#543    // WANDER:Lext/mods/gameserver/enums/IntentionType;
   #897 = Utf8               WANDER
   #898 = Class              #899         // ext/mods/gameserver/model/actor/move/NpcMove
   #899 = Utf8               ext/mods/gameserver/model/actor/move/NpcMove
   #900 = Methodref          #838.#65     // ext/mods/gameserver/model/actor/ai/Desire.getFinalTarget:()Lext/mods/gameserver/model/actor/Creature;
   #901 = Methodref          #14.#902     // ext/mods/gameserver/model/actor/ai/type/NpcAI.doIntention:(Lext/mods/gameserver/model/actor/ai/Intention;)V
   #902 = NameAndType        #903:#355    // doIntention:(Lext/mods/gameserver/model/actor/ai/Intention;)V
   #903 = Utf8               doIntention
   #904 = Methodref          #14.#905     // ext/mods/gameserver/model/actor/ai/type/NpcAI.thinkIdle:()V
   #905 = NameAndType        #906:#23     // thinkIdle:()V
   #906 = Utf8               thinkIdle
   #907 = Methodref          #33.#908     // ext/mods/gameserver/model/actor/container/attackable/AggroList.refresh:()V
   #908 = NameAndType        #909:#23     // refresh:()V
   #909 = Utf8               refresh
   #910 = Methodref          #42.#908     // ext/mods/gameserver/model/actor/container/attackable/HateList.refresh:()V
   #911 = Double             6.6d
   #913 = Methodref          #33.#914     // ext/mods/gameserver/model/actor/container/attackable/AggroList.reduceAllHate:(D)V
   #914 = NameAndType        #915:#916    // reduceAllHate:(D)V
   #915 = Utf8               reduceAllHate
   #916 = Utf8               (D)V
   #917 = Methodref          #19.#918     // ext/mods/gameserver/model/actor/ai/DesireQueue.autoDecreaseWeight:()V
   #918 = NameAndType        #919:#23     // autoDecreaseWeight:()V
   #919 = Utf8               autoDecreaseWeight
   #920 = Fieldref           #539.#921    // ext/mods/gameserver/enums/IntentionType.CAST:Lext/mods/gameserver/enums/IntentionType;
   #921 = NameAndType        #922:#543    // CAST:Lext/mods/gameserver/enums/IntentionType;
   #922 = Utf8               CAST
   #923 = Methodref          #924.#925    // java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #924 = Class              #926         // java/util/Objects
   #925 = NameAndType        #927:#928    // requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #926 = Utf8               java/util/Objects
   #927 = Utf8               requireNonNull
   #928 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #929 = InvokeDynamic      #10:#930     // #10:applyAsDouble:(Lext/mods/gameserver/model/actor/Npc;)Ljava/util/function/ToDoubleFunction;
   #930 = NameAndType        #931:#932    // applyAsDouble:(Lext/mods/gameserver/model/actor/Npc;)Ljava/util/function/ToDoubleFunction;
   #931 = Utf8               applyAsDouble
   #932 = Utf8               (Lext/mods/gameserver/model/actor/Npc;)Ljava/util/function/ToDoubleFunction;
   #933 = InterfaceMethodref #934.#935    // java/util/Comparator.comparingDouble:(Ljava/util/function/ToDoubleFunction;)Ljava/util/Comparator;
   #934 = Class              #936         // java/util/Comparator
   #935 = NameAndType        #937:#938    // comparingDouble:(Ljava/util/function/ToDoubleFunction;)Ljava/util/Comparator;
   #936 = Utf8               java/util/Comparator
   #937 = Utf8               comparingDouble
   #938 = Utf8               (Ljava/util/function/ToDoubleFunction;)Ljava/util/Comparator;
   #939 = InterfaceMethodref #420.#940    // java/util/stream/Stream.min:(Ljava/util/Comparator;)Ljava/util/Optional;
   #940 = NameAndType        #941:#942    // min:(Ljava/util/Comparator;)Ljava/util/Optional;
   #941 = Utf8               min
   #942 = Utf8               (Ljava/util/Comparator;)Ljava/util/Optional;
   #943 = Methodref          #944.#945    // java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
   #944 = Class              #946         // java/util/Optional
   #945 = NameAndType        #947:#928    // orElse:(Ljava/lang/Object;)Ljava/lang/Object;
   #946 = Utf8               java/util/Optional
   #947 = Utf8               orElse
   #948 = InterfaceMethodref #234.#949    // java/util/List.indexOf:(Ljava/lang/Object;)I
   #949 = NameAndType        #950:#951    // indexOf:(Ljava/lang/Object;)I
   #950 = Utf8               indexOf
   #951 = Utf8               (Ljava/lang/Object;)I
   #952 = Methodref          #135.#953    // ext/mods/gameserver/geoengine/GeoEngine.canMoveToTarget:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Z
   #953 = NameAndType        #527:#954    // canMoveToTarget:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Z
   #954 = Utf8               (Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Z
   #955 = Methodref          #53.#956     // ext/mods/gameserver/model/actor/Npc.teleportTo:(Lext/mods/gameserver/model/location/Location;I)V
   #956 = NameAndType        #957:#958    // teleportTo:(Lext/mods/gameserver/model/location/Location;I)V
   #957 = Utf8               teleportTo
   #958 = Utf8               (Lext/mods/gameserver/model/location/Location;I)V
   #959 = Methodref          #14.#960     // ext/mods/gameserver/model/actor/ai/type/NpcAI.addAttackDesire:(Lext/mods/gameserver/model/actor/Creature;IDZZ)V
   #960 = NameAndType        #961:#962    // addAttackDesire:(Lext/mods/gameserver/model/actor/Creature;IDZZ)V
   #961 = Utf8               addAttackDesire
   #962 = Utf8               (Lext/mods/gameserver/model/actor/Creature;IDZZ)V
   #963 = Methodref          #14.#964     // ext/mods/gameserver/model/actor/ai/type/NpcAI.addAttackDesire:(Lext/mods/gameserver/model/actor/Creature;IDZ)V
   #964 = NameAndType        #961:#965    // addAttackDesire:(Lext/mods/gameserver/model/actor/Creature;IDZ)V
   #965 = Utf8               (Lext/mods/gameserver/model/actor/Creature;IDZ)V
   #966 = Methodref          #838.#967    // ext/mods/gameserver/model/actor/ai/Desire."<init>":(D)V
   #967 = NameAndType        #5:#916      // "<init>":(D)V
   #968 = Methodref          #838.#969    // ext/mods/gameserver/model/actor/ai/Desire.updateAsAttack:(Lext/mods/gameserver/model/actor/Creature;ZZZ)V
   #969 = NameAndType        #970:#971    // updateAsAttack:(Lext/mods/gameserver/model/actor/Creature;ZZZ)V
   #970 = Utf8               updateAsAttack
   #971 = Utf8               (Lext/mods/gameserver/model/actor/Creature;ZZZ)V
   #972 = Methodref          #19.#973     // ext/mods/gameserver/model/actor/ai/DesireQueue.addOrUpdate:(Lext/mods/gameserver/model/actor/ai/Desire;)V
   #973 = NameAndType        #974:#975    // addOrUpdate:(Lext/mods/gameserver/model/actor/ai/Desire;)V
   #974 = Utf8               addOrUpdate
   #975 = Utf8               (Lext/mods/gameserver/model/actor/ai/Desire;)V
   #976 = Methodref          #33.#977     // ext/mods/gameserver/model/actor/container/attackable/AggroList.getMostHatedCreature:()Lext/mods/gameserver/model/actor/Creature;
   #977 = NameAndType        #978:#68     // getMostHatedCreature:()Lext/mods/gameserver/model/actor/Creature;
   #978 = Utf8               getMostHatedCreature
   #979 = Class              #980         // ext/mods/gameserver/model/actor/Player
   #980 = Utf8               ext/mods/gameserver/model/actor/Player
   #981 = Methodref          #979.#982    // ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
   #982 = NameAndType        #983:#984    // getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
   #983 = Utf8               getClassId
   #984 = Utf8               ()Lext/mods/gameserver/enums/actors/ClassId;
   #985 = Methodref          #986.#987    // ext/mods/gameserver/enums/actors/ClassId.getType:()Lext/mods/gameserver/enums/actors/ClassType;
   #986 = Class              #988         // ext/mods/gameserver/enums/actors/ClassId
   #987 = NameAndType        #227:#989    // getType:()Lext/mods/gameserver/enums/actors/ClassType;
   #988 = Utf8               ext/mods/gameserver/enums/actors/ClassId
   #989 = Utf8               ()Lext/mods/gameserver/enums/actors/ClassType;
   #990 = Fieldref           #991.#992    // ext/mods/gameserver/enums/actors/ClassType.PRIEST:Lext/mods/gameserver/enums/actors/ClassType;
   #991 = Class              #993         // ext/mods/gameserver/enums/actors/ClassType
   #992 = NameAndType        #994:#995    // PRIEST:Lext/mods/gameserver/enums/actors/ClassType;
   #993 = Utf8               ext/mods/gameserver/enums/actors/ClassType
   #994 = Utf8               PRIEST
   #995 = Utf8               Lext/mods/gameserver/enums/actors/ClassType;
   #996 = Methodref          #33.#997     // ext/mods/gameserver/model/actor/container/attackable/AggroList.addDamageHate:(Lext/mods/gameserver/model/actor/Creature;DD)V
   #997 = NameAndType        #998:#999    // addDamageHate:(Lext/mods/gameserver/model/actor/Creature;DD)V
   #998 = Utf8               addDamageHate
   #999 = Utf8               (Lext/mods/gameserver/model/actor/Creature;DD)V
  #1000 = Methodref          #1001.#1002  // ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
  #1001 = Class              #1003        // ext/mods/gameserver/data/SkillTable
  #1002 = NameAndType        #138:#1004   // getInstance:()Lext/mods/gameserver/data/SkillTable;
  #1003 = Utf8               ext/mods/gameserver/data/SkillTable
  #1004 = Utf8               ()Lext/mods/gameserver/data/SkillTable;
  #1005 = Methodref          #1001.#1006  // ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
  #1006 = NameAndType        #1007:#1008  // getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
  #1007 = Utf8               getInfo
  #1008 = Utf8               (II)Lext/mods/gameserver/skills/L2Skill;
  #1009 = Methodref          #14.#1010    // ext/mods/gameserver/model/actor/ai/type/NpcAI.addCastDesire:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;DZZ)V
  #1010 = NameAndType        #1011:#1012  // addCastDesire:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;DZZ)V
  #1011 = Utf8               addCastDesire
  #1012 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;DZZ)V
  #1013 = Methodref          #14.#1014    // ext/mods/gameserver/model/actor/ai/type/NpcAI.addCastDesire:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;D)V
  #1014 = NameAndType        #1011:#1015  // addCastDesire:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;D)V
  #1015 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;D)V
  #1016 = Methodref          #14.#1017    // ext/mods/gameserver/model/actor/ai/type/NpcAI.addCastDesire:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;DZ)V
  #1017 = NameAndType        #1011:#1018  // addCastDesire:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;DZ)V
  #1018 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;DZ)V
  #1019 = Methodref          #286.#1020   // ext/mods/gameserver/model/actor/cast/NpcCast.canAttemptCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
  #1020 = NameAndType        #1021:#1022  // canAttemptCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
  #1021 = Utf8               canAttemptCast
  #1022 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
  #1023 = Methodref          #109.#1024   // ext/mods/gameserver/model/actor/status/NpcStatus.getMpConsume:(Lext/mods/gameserver/skills/L2Skill;)I
  #1024 = NameAndType        #1025:#1026  // getMpConsume:(Lext/mods/gameserver/skills/L2Skill;)I
  #1025 = Utf8               getMpConsume
  #1026 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)I
  #1027 = Methodref          #109.#1028   // ext/mods/gameserver/model/actor/status/NpcStatus.getMp:()D
  #1028 = NameAndType        #1029:#209   // getMp:()D
  #1029 = Utf8               getMp
  #1030 = Methodref          #301.#1031   // ext/mods/gameserver/skills/L2Skill.getHpConsume:()I
  #1031 = NameAndType        #1032:#113   // getHpConsume:()I
  #1032 = Utf8               getHpConsume
  #1033 = Methodref          #109.#1034   // ext/mods/gameserver/model/actor/status/NpcStatus.getHp:()D
  #1034 = NameAndType        #1035:#209   // getHp:()D
  #1035 = Utf8               getHp
  #1036 = Methodref          #301.#1037   // ext/mods/gameserver/skills/L2Skill.getCastRange:()I
  #1037 = NameAndType        #1038:#113   // getCastRange:()I
  #1038 = Utf8               getCastRange
  #1039 = Methodref          #838.#1040   // ext/mods/gameserver/model/actor/ai/Desire.updateAsCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZZIZ)V
  #1040 = NameAndType        #1041:#1042  // updateAsCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZZIZ)V
  #1041 = Utf8               updateAsCast
  #1042 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZZIZ)V
  #1043 = Methodref          #838.#1044   // ext/mods/gameserver/model/actor/ai/Desire.updateAsFlee:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/location/Location;I)V
  #1044 = NameAndType        #1045:#1046  // updateAsFlee:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/location/Location;I)V
  #1045 = Utf8               updateAsFlee
  #1046 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/location/Location;I)V
  #1047 = Methodref          #838.#1048   // ext/mods/gameserver/model/actor/ai/Desire.updateAsFollow:(Lext/mods/gameserver/model/actor/Creature;Z)V
  #1048 = NameAndType        #1049:#1050  // updateAsFollow:(Lext/mods/gameserver/model/actor/Creature;Z)V
  #1049 = Utf8               updateAsFollow
  #1050 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Z)V
  #1051 = Methodref          #838.#1052   // ext/mods/gameserver/model/actor/ai/Desire.updateAsInteract:(Lext/mods/gameserver/model/WorldObject;ZZ)V
  #1052 = NameAndType        #1053:#1054  // updateAsInteract:(Lext/mods/gameserver/model/WorldObject;ZZ)V
  #1053 = Utf8               updateAsInteract
  #1054 = Utf8               (Lext/mods/gameserver/model/WorldObject;ZZ)V
  #1055 = Methodref          #838.#1056   // ext/mods/gameserver/model/actor/ai/Desire.updateAsMoveRoute:(Ljava/lang/String;)V
  #1056 = NameAndType        #1057:#1058  // updateAsMoveRoute:(Ljava/lang/String;)V
  #1057 = Utf8               updateAsMoveRoute
  #1058 = Utf8               (Ljava/lang/String;)V
  #1059 = Methodref          #838.#1060   // ext/mods/gameserver/model/actor/ai/Desire.updateAsMoveTo:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/actor/Boat;)V
  #1060 = NameAndType        #1061:#1062  // updateAsMoveTo:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/actor/Boat;)V
  #1061 = Utf8               updateAsMoveTo
  #1062 = Utf8               (Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/actor/Boat;)V
  #1063 = Methodref          #53.#1064    // ext/mods/gameserver/model/actor/Npc.isAISleeping:()Z
  #1064 = NameAndType        #1065:#58    // isAISleeping:()Z
  #1065 = Utf8               isAISleeping
  #1066 = Methodref          #838.#1067   // ext/mods/gameserver/model/actor/ai/Desire.updateAsSocial:(II)V
  #1067 = NameAndType        #1068:#1069  // updateAsSocial:(II)V
  #1068 = Utf8               updateAsSocial
  #1069 = Utf8               (II)V
  #1070 = Methodref          #838.#1071   // ext/mods/gameserver/model/actor/ai/Desire.updateAsWander:(I)V
  #1071 = NameAndType        #1072:#739   // updateAsWander:(I)V
  #1072 = Utf8               updateAsWander
  #1073 = Methodref          #838.#1074   // ext/mods/gameserver/model/actor/ai/Desire.updateAsNothing:(I)V
  #1074 = NameAndType        #1075:#739   // updateAsNothing:(I)V
  #1075 = Utf8               updateAsNothing
  #1076 = Methodref          #838.#1077   // ext/mods/gameserver/model/actor/ai/Desire.updateAsPickUp:(IZ)V
  #1077 = NameAndType        #1078:#1079  // updateAsPickUp:(IZ)V
  #1078 = Utf8               updateAsPickUp
  #1079 = Utf8               (IZ)V
  #1080 = Long               12000l
  #1082 = Methodref          #838.#1083   // ext/mods/gameserver/model/actor/ai/Desire.getTarget:()Lext/mods/gameserver/model/WorldObject;
  #1083 = NameAndType        #1084:#1085  // getTarget:()Lext/mods/gameserver/model/WorldObject;
  #1084 = Utf8               getTarget
  #1085 = Utf8               ()Lext/mods/gameserver/model/WorldObject;
  #1086 = Methodref          #838.#1087   // ext/mods/gameserver/model/actor/ai/Desire.getWeight:()D
  #1087 = NameAndType        #1088:#209   // getWeight:()D
  #1088 = Utf8               getWeight
  #1089 = Methodref          #838.#1090   // ext/mods/gameserver/model/actor/ai/Desire.getSkill:()Lext/mods/gameserver/skills/L2Skill;
  #1090 = NameAndType        #1091:#299   // getSkill:()Lext/mods/gameserver/skills/L2Skill;
  #1091 = Utf8               getSkill
  #1092 = Methodref          #286.#1093   // ext/mods/gameserver/model/actor/cast/NpcCast.meetsHpMpDisabledConditions:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
  #1093 = NameAndType        #1094:#1022  // meetsHpMpDisabledConditions:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
  #1094 = Utf8               meetsHpMpDisabledConditions
  #1095 = Fieldref           #158.#1096   // ext/mods/Config.MOB_AGGRO_IN_PEACEZONE:Z
  #1096 = NameAndType        #1097:#162   // MOB_AGGRO_IN_PEACEZONE:Z
  #1097 = Utf8               MOB_AGGRO_IN_PEACEZONE
  #1098 = Class              #1099        // ext/mods/gameserver/model/actor/instance/Monster
  #1099 = Utf8               ext/mods/gameserver/model/actor/instance/Monster
  #1100 = Methodref          #1098.#119   // ext/mods/gameserver/model/actor/instance/Monster.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #1101 = Methodref          #123.#1102   // ext/mods/gameserver/model/actor/template/NpcTemplate.getAggro:()Z
  #1102 = NameAndType        #1103:#58    // getAggro:()Z
  #1103 = Utf8               getAggro
  #1104 = Fieldref           #1105.#1106  // ext/mods/gameserver/enums/ZoneId.PEACE:Lext/mods/gameserver/enums/ZoneId;
  #1105 = Class              #1107        // ext/mods/gameserver/enums/ZoneId
  #1106 = NameAndType        #1108:#1109  // PEACE:Lext/mods/gameserver/enums/ZoneId;
  #1107 = Utf8               ext/mods/gameserver/enums/ZoneId
  #1108 = Utf8               PEACE
  #1109 = Utf8               Lext/mods/gameserver/enums/ZoneId;
  #1110 = Methodref          #853.#1111   // ext/mods/gameserver/model/actor/Playable.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
  #1111 = NameAndType        #1112:#1113  // isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
  #1112 = Utf8               isInsideZone
  #1113 = Utf8               (Lext/mods/gameserver/enums/ZoneId;)Z
  #1114 = Methodref          #1098.#555   // ext/mods/gameserver/model/actor/instance/Monster.abortAll:(Z)V
  #1115 = Methodref          #1098.#1116  // ext/mods/gameserver/model/actor/instance/Monster.removeAllAttackDesire:()V
  #1116 = NameAndType        #1117:#23    // removeAllAttackDesire:()V
  #1117 = Utf8               removeAllAttackDesire
  #1118 = Methodref          #1098.#731   // ext/mods/gameserver/model/actor/instance/Monster.getSpawnLocation:()Lext/mods/gameserver/model/location/SpawnLocation;
  #1119 = Methodref          #1098.#956   // ext/mods/gameserver/model/actor/instance/Monster.teleportTo:(Lext/mods/gameserver/model/location/Location;I)V
  #1120 = Methodref          #853.#1121   // ext/mods/gameserver/model/actor/Playable.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
  #1121 = NameAndType        #1122:#1123  // getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
  #1122 = Utf8               getActingPlayer
  #1123 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #1124 = Methodref          #979.#1125   // ext/mods/gameserver/model/actor/Player.isSpawnProtected:()Z
  #1125 = NameAndType        #1126:#58    // isSpawnProtected:()Z
  #1126 = Utf8               isSpawnProtected
  #1127 = Methodref          #979.#1128   // ext/mods/gameserver/model/actor/Player.isFlying:()Z
  #1128 = NameAndType        #1129:#58    // isFlying:()Z
  #1129 = Utf8               isFlying
  #1130 = Methodref          #979.#1131   // ext/mods/gameserver/model/actor/Player.getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
  #1131 = NameAndType        #1132:#1133  // getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
  #1132 = Utf8               getAppearance
  #1133 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/Appearance;
  #1134 = Methodref          #1135.#75    // ext/mods/gameserver/model/actor/container/player/Appearance.isVisible:()Z
  #1135 = Class              #1136        // ext/mods/gameserver/model/actor/container/player/Appearance
  #1136 = Utf8               ext/mods/gameserver/model/actor/container/player/Appearance
  #1137 = Methodref          #53.#1138    // ext/mods/gameserver/model/actor/Npc.isRaidBoss:()Z
  #1138 = NameAndType        #1139:#58    // isRaidBoss:()Z
  #1139 = Utf8               isRaidBoss
  #1140 = Class              #1141        // ext/mods/gameserver/model/actor/instance/Guard
  #1141 = Utf8               ext/mods/gameserver/model/actor/instance/Guard
  #1142 = Methodref          #853.#512    // ext/mods/gameserver/model/actor/Playable.getZ:()I
  #1143 = Methodref          #253.#1144   // java/lang/Math.abs:(I)I
  #1144 = NameAndType        #256:#295    // abs:(I)I
  #1145 = Methodref          #853.#218    // ext/mods/gameserver/model/actor/Playable.isMoving:()Z
  #1146 = Methodref          #571.#1147   // ext/mods/gameserver/scripting/Quest.onSeeCreature:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;)V
  #1147 = NameAndType        #1148:#1149  // onSeeCreature:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;)V
  #1148 = Utf8               onSeeCreature
  #1149 = Utf8               (Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;)V
  #1150 = Methodref          #853.#1151   // ext/mods/gameserver/model/actor/Playable.isSilentMoving:()Z
  #1151 = NameAndType        #1152:#58    // isSilentMoving:()Z
  #1152 = Utf8               isSilentMoving
  #1153 = Methodref          #123.#1154   // ext/mods/gameserver/model/actor/template/NpcTemplate.canSeeThrough:()Z
  #1154 = NameAndType        #1155:#58    // canSeeThrough:()Z
  #1155 = Utf8               canSeeThrough
  #1156 = InterfaceMethodref #29.#1157    // java/util/Set.add:(Ljava/lang/Object;)Z
  #1157 = NameAndType        #814:#697    // add:(Ljava/lang/Object;)Z
  #1158 = Methodref          #33.#1159    // ext/mods/gameserver/model/actor/container/attackable/AggroList.values:()Ljava/util/Collection;
  #1159 = NameAndType        #1160:#1161  // values:()Ljava/util/Collection;
  #1160 = Utf8               values
  #1161 = Utf8               ()Ljava/util/Collection;
  #1162 = InterfaceMethodref #1163.#235   // java/util/Collection.iterator:()Ljava/util/Iterator;
  #1163 = Class              #1164        // java/util/Collection
  #1164 = Utf8               java/util/Collection
  #1165 = Class              #1166        // ext/mods/gameserver/model/actor/container/npc/AggroInfo
  #1166 = Utf8               ext/mods/gameserver/model/actor/container/npc/AggroInfo
  #1167 = Methodref          #1165.#1168  // ext/mods/gameserver/model/actor/container/npc/AggroInfo.getTimestamp:()J
  #1168 = NameAndType        #1169:#584   // getTimestamp:()J
  #1169 = Utf8               getTimestamp
  #1170 = Long               90000l
  #1172 = Methodref          #1165.#1173  // ext/mods/gameserver/model/actor/container/npc/AggroInfo.stopHate:()V
  #1173 = NameAndType        #1174:#23    // stopHate:()V
  #1174 = Utf8               stopHate
  #1175 = Methodref          #1176.#1177  // java/lang/Class.getName:()Ljava/lang/String;
  #1176 = Class              #1178        // java/lang/Class
  #1177 = NameAndType        #1179:#780   // getName:()Ljava/lang/String;
  #1178 = Utf8               java/lang/Class
  #1179 = Utf8               getName
  #1180 = Methodref          #187.#1181   // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #1181 = NameAndType        #5:#1058     // "<init>":(Ljava/lang/String;)V
  #1182 = Utf8               SOCIAL_INTERVAL
  #1183 = Utf8               ConstantValue
  #1184 = Integer            12000
  #1185 = Utf8               Signature
  #1186 = Utf8               Ljava/util/Set<Lext/mods/gameserver/model/actor/Creature;>;
  #1187 = Utf8               Ljava/util/concurrent/ScheduledFuture<*>;
  #1188 = Utf8               Code
  #1189 = Utf8               LineNumberTable
  #1190 = Utf8               LocalVariableTable
  #1191 = Utf8               this
  #1192 = Utf8               Lext/mods/gameserver/model/actor/ai/type/NpcAI;
  #1193 = Utf8               npc
  #1194 = Utf8               Lext/mods/gameserver/model/actor/Npc;
  #1195 = Utf8               LocalVariableTypeTable
  #1196 = Utf8               Lext/mods/gameserver/model/actor/ai/type/NpcAI<TT;>;
  #1197 = Utf8               TT;
  #1198 = Utf8               (TT;)V
  #1199 = Utf8               thinkAttack
  #1200 = Utf8               attackable
  #1201 = Utf8               Lext/mods/gameserver/model/actor/Attackable;
  #1202 = Utf8               aggroRange
  #1203 = Utf8               adjustedRange
  #1204 = Utf8               D
  #1205 = Utf8               distToBlocker
  #1206 = Utf8               blockerToTarget
  #1207 = Utf8               blocker
  #1208 = Utf8               offensive
  #1209 = Utf8               castTarget
  #1210 = Utf8               skill
  #1211 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #1212 = Utf8               target
  #1213 = Utf8               weaponRange
  #1214 = Utf8               actorCol
  #1215 = Utf8               targetCol
  #1216 = Utf8               totalRange
  #1217 = Utf8               dist
  #1218 = Utf8               attackMargin
  #1219 = Utf8               maxAttackRange
  #1220 = Utf8               inRange
  #1221 = Utf8               StackMapTable
  #1222 = Utf8               offensiveSkills
  #1223 = Utf8               Ljava/util/List;
  #1224 = Utf8               buffSkills
  #1225 = Utf8               preferOffensive
  #1226 = Utf8               Ljava/util/List<Lext/mods/gameserver/skills/L2Skill;>;
  #1227 = Utf8               getZigZagPosition
  #1228 = Utf8               (Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;IZ)Lext/mods/gameserver/model/location/Location;
  #1229 = Utf8               radius
  #1230 = Utf8               destZ
  #1231 = Utf8               actor
  #1232 = Utf8               range
  #1233 = Utf8               isRanged
  #1234 = Utf8               targetX
  #1235 = Utf8               targetY
  #1236 = Utf8               targetZ
  #1237 = Utf8               layerOffset
  #1238 = Utf8               angleDegree
  #1239 = Utf8               angleRadian
  #1240 = Utf8               destX
  #1241 = Utf8               destY
  #1242 = Utf8               stopFollow
  #1243 = Utf8               quest
  #1244 = Utf8               Lext/mods/gameserver/scripting/Quest;
  #1245 = Utf8               thinkSocial
  #1246 = Utf8               thinkFollow
  #1247 = Utf8               thinkNothing
  #1248 = Utf8               thinkPickUp
  #1249 = Utf8               ()Lext/mods/gameserver/model/item/instance/ItemInstance;
  #1250 = Utf8               item
  #1251 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #1252 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #1253 = Utf8               cw
  #1254 = Utf8               Lext/mods/gameserver/model/entity/CursedWeapon;
  #1255 = Utf8               thinkMoveRoute
  #1256 = Utf8               onEvtArrived
  #1257 = Utf8               route
  #1258 = Utf8               node
  #1259 = Utf8               Lext/mods/gameserver/model/location/WalkerLocation;
  #1260 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/location/WalkerLocation;>;
  #1261 = Utf8               onEvtFinishedCasting
  #1262 = Utf8               onEvtTeleported
  #1263 = Utf8               setBackToPeace
  #1264 = Utf8               getHateList
  #1265 = Utf8               ()Lext/mods/gameserver/model/actor/container/attackable/HateList;
  #1266 = Utf8               getRouteIndex
  #1267 = Utf8               isReversePath
  #1268 = Utf8               getLifeTime
  #1269 = Utf8               resetLifeTime
  #1270 = Utf8               getTopDesireTarget
  #1271 = Utf8               setTopDesireTarget
  #1272 = Utf8               scripts
  #1273 = Utf8               npcMove
  #1274 = Utf8               Lext/mods/gameserver/model/actor/move/NpcMove;
  #1275 = Utf8               toDoDesire
  #1276 = Utf8               instantRun
  #1277 = Utf8               updateTick
  #1278 = Utf8               Ljava/util/List<Lext/mods/gameserver/scripting/Quest;>;
  #1279 = Utf8               nextNode
  #1280 = Utf8               ()Ljava/util/Set<Lext/mods/gameserver/model/actor/ai/Desire;>;
  #1281 = Utf8               addAttackDesireHold
  #1282 = Utf8               (Lext/mods/gameserver/model/actor/Creature;D)V
  #1283 = Utf8               weight
  #1284 = Utf8               (Lext/mods/gameserver/model/actor/Creature;ID)V
  #1285 = Utf8               damage
  #1286 = Utf8               updateAggro
  #1287 = Utf8               player
  #1288 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #1289 = Utf8               desire
  #1290 = Utf8               addCastDesireHold
  #1291 = Utf8               (Lext/mods/gameserver/model/actor/Creature;IID)V
  #1292 = Utf8               skillId
  #1293 = Utf8               skillLevel
  #1294 = Utf8               checkConditions
  #1295 = Utf8               (Lext/mods/gameserver/model/actor/Creature;IIDZ)V
  #1296 = Utf8               mpConsume
  #1297 = Utf8               hpConsume
  #1298 = Utf8               addFleeDesire
  #1299 = Utf8               distance
  #1300 = Utf8               addFollowDesire
  #1301 = Utf8               addInteractDesire
  #1302 = Utf8               (Lext/mods/gameserver/model/WorldObject;D)V
  #1303 = Utf8               addMoveRouteDesire
  #1304 = Utf8               (Ljava/lang/String;D)V
  #1305 = Utf8               routeName
  #1306 = Utf8               Ljava/lang/String;
  #1307 = Utf8               addMoveToDesire
  #1308 = Utf8               (Lext/mods/gameserver/model/location/Location;D)V
  #1309 = Utf8               loc
  #1310 = Utf8               Lext/mods/gameserver/model/location/Location;
  #1311 = Utf8               addSocialDesire
  #1312 = Utf8               (IID)V
  #1313 = Utf8               id
  #1314 = Utf8               timer
  #1315 = Utf8               addWanderDesire
  #1316 = Utf8               (ID)V
  #1317 = Utf8               addDoNothingDesire
  #1318 = Utf8               addPickUpDesire
  #1319 = Utf8               itemObjectId
  #1320 = Utf8               onRandomAnimation
  #1321 = Utf8               now
  #1322 = Utf8               stopRoute
  #1323 = Utf8               cleanupForNextSpawn
  #1324 = Utf8               lambda$runAI$4
  #1325 = Utf8               (Lext/mods/gameserver/model/actor/ai/Desire;)Z
  #1326 = Utf8               d
  #1327 = Utf8               lambda$runAI$3
  #1328 = Utf8               lambda$runAI$2
  #1329 = Utf8               patt0$temp
  #1330 = Utf8               lambda$runAI$1
  #1331 = Utf8               lambda$runAI$0
  #1332 = Utf8               (Ljava/util/List;Lext/mods/gameserver/model/actor/Playable;)V
  #1333 = Utf8               monster
  #1334 = Utf8               Lext/mods/gameserver/model/actor/instance/Monster;
  #1335 = Utf8               i$
  #1336 = Utf8               Ljava/util/Iterator;
  #1337 = Utf8               pl
  #1338 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #1339 = Utf8               isInRange
  #1340 = Utf8               lambda$onEvtArrived$0
  #1341 = Utf8               ai
  #1342 = Utf8               Lext/mods/gameserver/model/actor/container/npc/AggroInfo;
  #1343 = Utf8               currentTime
  #1344 = Utf8               lambda$stopFollow$0
  #1345 = Utf8               lambda$selectMeleeSkill$1
  #1346 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)Z
  #1347 = Utf8               s
  #1348 = Utf8               lambda$selectMeleeSkill$0
  #1349 = Utf8               lambda$thinkAttack$0
  #1350 = Utf8               <clinit>
  #1351 = Utf8               <T:Lext/mods/gameserver/model/actor/Npc;>Lext/mods/gameserver/model/actor/ai/type/CreatureAI<TT;>;
  #1352 = Utf8               SourceFile
  #1353 = Utf8               NpcAI.java
  #1354 = Utf8               NestMembers
  #1355 = Utf8               BootstrapMethods
  #1356 = MethodType         #23          //  ()V
  #1357 = MethodHandle       5:#1358      // REF_invokeVirtual ext/mods/gameserver/model/actor/ai/type/NpcAI.lambda$thinkAttack$0:()V
  #1358 = Methodref          #14.#1359    // ext/mods/gameserver/model/actor/ai/type/NpcAI.lambda$thinkAttack$0:()V
  #1359 = NameAndType        #1349:#23    // lambda$thinkAttack$0:()V
  #1360 = MethodType         #697         //  (Ljava/lang/Object;)Z
  #1361 = MethodHandle       6:#1362      // REF_invokeStatic ext/mods/gameserver/model/actor/ai/type/NpcAI.lambda$selectMeleeSkill$0:(Lext/mods/gameserver/skills/L2Skill;)Z
  #1362 = Methodref          #14.#1363    // ext/mods/gameserver/model/actor/ai/type/NpcAI.lambda$selectMeleeSkill$0:(Lext/mods/gameserver/skills/L2Skill;)Z
  #1363 = NameAndType        #1348:#1346  // lambda$selectMeleeSkill$0:(Lext/mods/gameserver/skills/L2Skill;)Z
  #1364 = MethodType         #1346        //  (Lext/mods/gameserver/skills/L2Skill;)Z
  #1365 = MethodHandle       6:#1366      // REF_invokeStatic ext/mods/gameserver/model/actor/ai/type/NpcAI.lambda$selectMeleeSkill$1:(Lext/mods/gameserver/skills/L2Skill;)Z
  #1366 = Methodref          #14.#1367    // ext/mods/gameserver/model/actor/ai/type/NpcAI.lambda$selectMeleeSkill$1:(Lext/mods/gameserver/skills/L2Skill;)Z
  #1367 = NameAndType        #1345:#1346  // lambda$selectMeleeSkill$1:(Lext/mods/gameserver/skills/L2Skill;)Z
  #1368 = MethodHandle       5:#1369      // REF_invokeVirtual ext/mods/gameserver/model/actor/ai/type/NpcAI.lambda$stopFollow$0:()V
  #1369 = Methodref          #14.#1370    // ext/mods/gameserver/model/actor/ai/type/NpcAI.lambda$stopFollow$0:()V
  #1370 = NameAndType        #1344:#23    // lambda$stopFollow$0:()V
  #1371 = MethodHandle       5:#1372      // REF_invokeVirtual ext/mods/gameserver/model/actor/ai/type/NpcAI.lambda$onEvtArrived$0:()V
  #1372 = Methodref          #14.#1373    // ext/mods/gameserver/model/actor/ai/type/NpcAI.lambda$onEvtArrived$0:()V
  #1373 = NameAndType        #1340:#23    // lambda$onEvtArrived$0:()V
  #1374 = MethodType         #1375        //  (Ljava/lang/Object;)V
  #1375 = Utf8               (Ljava/lang/Object;)V
  #1376 = MethodHandle       5:#1377      // REF_invokeVirtual ext/mods/gameserver/model/actor/ai/type/NpcAI.lambda$runAI$0:(Ljava/util/List;Lext/mods/gameserver/model/actor/Playable;)V
  #1377 = Methodref          #14.#1378    // ext/mods/gameserver/model/actor/ai/type/NpcAI.lambda$runAI$0:(Ljava/util/List;Lext/mods/gameserver/model/actor/Playable;)V
  #1378 = NameAndType        #1331:#1332  // lambda$runAI$0:(Ljava/util/List;Lext/mods/gameserver/model/actor/Playable;)V
  #1379 = MethodType         #1380        //  (Lext/mods/gameserver/model/actor/Playable;)V
  #1380 = Utf8               (Lext/mods/gameserver/model/actor/Playable;)V
  #1381 = MethodHandle       5:#1382      // REF_invokeVirtual ext/mods/gameserver/model/actor/ai/type/NpcAI.lambda$runAI$1:(Lext/mods/gameserver/model/actor/ai/Desire;)Z
  #1382 = Methodref          #14.#1383    // ext/mods/gameserver/model/actor/ai/type/NpcAI.lambda$runAI$1:(Lext/mods/gameserver/model/actor/ai/Desire;)Z
  #1383 = NameAndType        #1330:#1325  // lambda$runAI$1:(Lext/mods/gameserver/model/actor/ai/Desire;)Z
  #1384 = MethodType         #1325        //  (Lext/mods/gameserver/model/actor/ai/Desire;)Z
  #1385 = MethodHandle       5:#1386      // REF_invokeVirtual ext/mods/gameserver/model/actor/ai/type/NpcAI.lambda$runAI$2:(Lext/mods/gameserver/model/actor/ai/Desire;)Z
  #1386 = Methodref          #14.#1387    // ext/mods/gameserver/model/actor/ai/type/NpcAI.lambda$runAI$2:(Lext/mods/gameserver/model/actor/ai/Desire;)Z
  #1387 = NameAndType        #1328:#1325  // lambda$runAI$2:(Lext/mods/gameserver/model/actor/ai/Desire;)Z
  #1388 = MethodHandle       5:#1389      // REF_invokeVirtual ext/mods/gameserver/model/actor/ai/type/NpcAI.lambda$runAI$3:(Lext/mods/gameserver/model/actor/ai/Desire;)Z
  #1389 = Methodref          #14.#1390    // ext/mods/gameserver/model/actor/ai/type/NpcAI.lambda$runAI$3:(Lext/mods/gameserver/model/actor/ai/Desire;)Z
  #1390 = NameAndType        #1327:#1325  // lambda$runAI$3:(Lext/mods/gameserver/model/actor/ai/Desire;)Z
  #1391 = MethodHandle       6:#1392      // REF_invokeStatic ext/mods/gameserver/model/actor/ai/type/NpcAI.lambda$runAI$4:(Lext/mods/gameserver/model/actor/ai/Desire;)Z
  #1392 = Methodref          #14.#1393    // ext/mods/gameserver/model/actor/ai/type/NpcAI.lambda$runAI$4:(Lext/mods/gameserver/model/actor/ai/Desire;)Z
  #1393 = NameAndType        #1324:#1325  // lambda$runAI$4:(Lext/mods/gameserver/model/actor/ai/Desire;)Z
  #1394 = MethodType         #1395        //  (Ljava/lang/Object;)D
  #1395 = Utf8               (Ljava/lang/Object;)D
  #1396 = MethodHandle       5:#1397      // REF_invokeVirtual ext/mods/gameserver/model/WorldObject.distance3D:(Lext/mods/gameserver/model/location/Location;)D
  #1397 = Methodref          #655.#1398   // ext/mods/gameserver/model/WorldObject.distance3D:(Lext/mods/gameserver/model/location/Location;)D
  #1398 = NameAndType        #100:#1399   // distance3D:(Lext/mods/gameserver/model/location/Location;)D
  #1399 = Utf8               (Lext/mods/gameserver/model/location/Location;)D
  #1400 = MethodType         #1401        //  (Lext/mods/gameserver/model/location/WalkerLocation;)D
  #1401 = Utf8               (Lext/mods/gameserver/model/location/WalkerLocation;)D
  #1402 = MethodHandle       6:#1403      // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1403 = Methodref          #1404.#1405  // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1404 = Class              #1406        // java/lang/invoke/LambdaMetafactory
  #1405 = NameAndType        #1407:#1408  // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1406 = Utf8               java/lang/invoke/LambdaMetafactory
  #1407 = Utf8               metafactory
  #1408 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1409 = Utf8               InnerClasses
  #1410 = Class              #1411        // java/util/concurrent/ConcurrentHashMap$KeySetView
  #1411 = Utf8               java/util/concurrent/ConcurrentHashMap$KeySetView
  #1412 = Utf8               KeySetView
  #1413 = Class              #1414        // java/lang/invoke/MethodHandles$Lookup
  #1414 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #1415 = Class              #1416        // java/lang/invoke/MethodHandles
  #1416 = Utf8               java/lang/invoke/MethodHandles
  #1417 = Utf8               Lookup
{
  protected final ext.mods.gameserver.model.actor.ai.DesireQueue _desireQueue;
    descriptor: Lext/mods/gameserver/model/actor/ai/DesireQueue;
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL

  protected final java.util.Set<ext.mods.gameserver.model.actor.Creature> _seenCreatures;
    descriptor: Ljava/util/Set;
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Signature: #1186                        // Ljava/util/Set<Lext/mods/gameserver/model/actor/Creature;>;

  protected final ext.mods.gameserver.model.actor.container.attackable.AggroList _aggroList;
    descriptor: Lext/mods/gameserver/model/actor/container/attackable/AggroList;
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL

  protected final ext.mods.gameserver.model.actor.container.attackable.HateList _hateList;
    descriptor: Lext/mods/gameserver/model/actor/container/attackable/HateList;
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL

  protected ext.mods.gameserver.model.actor.ai.Desire _lastDesire;
    descriptor: Lext/mods/gameserver/model/actor/ai/Desire;
    flags: (0x0004) ACC_PROTECTED

  protected ext.mods.gameserver.model.actor.ai.Desire _nextDesire;
    descriptor: Lext/mods/gameserver/model/actor/ai/Desire;
    flags: (0x0004) ACC_PROTECTED

  public ext.mods.gameserver.model.actor.ai.type.NpcAI(T);
    descriptor: (Lext/mods/gameserver/model/actor/Npc;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #1                  // Method ext/mods/gameserver/model/actor/ai/type/CreatureAI."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
         5: aload_0
         6: invokestatic  #7                  // Method java/util/concurrent/ConcurrentHashMap.newKeySet:()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
         9: putfield      #13                 // Field _seenCreatures:Ljava/util/Set;
        12: aload_0
        13: new           #19                 // class ext/mods/gameserver/model/actor/ai/DesireQueue
        16: dup
        17: invokespecial #21                 // Method ext/mods/gameserver/model/actor/ai/DesireQueue."<init>":()V
        20: putfield      #24                 // Field _desireQueue:Lext/mods/gameserver/model/actor/ai/DesireQueue;
        23: aload_0
        24: getfield      #13                 // Field _seenCreatures:Ljava/util/Set;
        27: invokeinterface #28,  1           // InterfaceMethod java/util/Set.clear:()V
        32: aload_0
        33: new           #33                 // class ext/mods/gameserver/model/actor/container/attackable/AggroList
        36: dup
        37: aload_1
        38: invokespecial #35                 // Method ext/mods/gameserver/model/actor/container/attackable/AggroList."<init>":(Lext/mods/gameserver/model/actor/Npc;)V
        41: putfield      #38                 // Field _aggroList:Lext/mods/gameserver/model/actor/container/attackable/AggroList;
        44: aload_0
        45: new           #42                 // class ext/mods/gameserver/model/actor/container/attackable/HateList
        48: dup
        49: aload_1
        50: invokespecial #44                 // Method ext/mods/gameserver/model/actor/container/attackable/HateList."<init>":(Lext/mods/gameserver/model/actor/Npc;)V
        53: putfield      #45                 // Field _hateList:Lext/mods/gameserver/model/actor/container/attackable/HateList;
        56: return
      LineNumberTable:
        line 97: 0
        line 73: 5
        line 99: 12
        line 100: 23
        line 101: 32
        line 102: 44
        line 103: 56
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      57     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI;
            0      57     1   npc   Lext/mods/gameserver/model/actor/Npc;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      57     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI<TT;>;
            0      57     1   npc   TT;
    Signature: #1198                        // (TT;)V

  public void thinkAttack();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=21, args_size=1
         0: aload_0
         1: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
         7: invokevirtual #55                 // Method ext/mods/gameserver/model/actor/Npc.denyAiAction:()Z
        10: ifeq          14
        13: return
        14: aload_0
        15: getfield      #59                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        18: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/ai/Intention.getFinalTarget:()Lext/mods/gameserver/model/actor/Creature;
        21: astore_1
        22: aload_1
        23: ifnull        40
        26: aload_1
        27: invokevirtual #69                 // Method ext/mods/gameserver/model/actor/Creature.isAlikeDead:()Z
        30: ifne          40
        33: aload_1
        34: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Creature.isVisible:()Z
        37: ifne          77
        40: aload_0
        41: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        44: astore_3
        45: aload_3
        46: instanceof    #77                 // class ext/mods/gameserver/model/actor/Attackable
        49: ifeq          72
        52: aload_3
        53: checkcast     #77                 // class ext/mods/gameserver/model/actor/Attackable
        56: astore_2
        57: aload_2
        58: invokevirtual #79                 // Method ext/mods/gameserver/model/actor/Attackable.getAI:()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
        61: invokevirtual #83                 // Method ext/mods/gameserver/model/actor/ai/type/AttackableAI.getAggroList:()Lext/mods/gameserver/model/actor/container/attackable/AggroList;
        64: invokevirtual #89                 // Method ext/mods/gameserver/model/actor/container/attackable/AggroList.cleanAllHate:()V
        67: aload_2
        68: invokevirtual #92                 // Method ext/mods/gameserver/model/actor/Attackable.returnHome:()Z
        71: pop
        72: aload_0
        73: invokevirtual #95                 // Method doIdleIntention:()V
        76: return
        77: aload_0
        78: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        81: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
        84: aload_1
        85: invokevirtual #98                 // Method ext/mods/gameserver/model/actor/Npc.distance3D:(Lext/mods/gameserver/model/WorldObject;)D
        88: ldc2_w        #102                // double 2000.0d
        91: dcmpl
        92: ifle          132
        95: aload_0
        96: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        99: astore_3
       100: aload_3
       101: instanceof    #77                 // class ext/mods/gameserver/model/actor/Attackable
       104: ifeq          127
       107: aload_3
       108: checkcast     #77                 // class ext/mods/gameserver/model/actor/Attackable
       111: astore_2
       112: aload_2
       113: invokevirtual #79                 // Method ext/mods/gameserver/model/actor/Attackable.getAI:()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
       116: invokevirtual #83                 // Method ext/mods/gameserver/model/actor/ai/type/AttackableAI.getAggroList:()Lext/mods/gameserver/model/actor/container/attackable/AggroList;
       119: invokevirtual #89                 // Method ext/mods/gameserver/model/actor/container/attackable/AggroList.cleanAllHate:()V
       122: aload_2
       123: invokevirtual #92                 // Method ext/mods/gameserver/model/actor/Attackable.returnHome:()Z
       126: pop
       127: aload_0
       128: invokevirtual #95                 // Method doIdleIntention:()V
       131: return
       132: aload_0
       133: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       136: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       139: invokevirtual #104                // Method ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
       142: invokevirtual #108                // Method ext/mods/gameserver/model/actor/status/NpcStatus.getPhysicalAttackRange:()I
       145: istore_2
       146: aload_0
       147: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       150: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       153: aload_1
       154: invokevirtual #114                // Method ext/mods/gameserver/model/actor/Npc.knows:(Lext/mods/gameserver/model/WorldObject;)Z
       157: ifne          446
       160: aload_0
       161: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       164: astore        4
       166: aload         4
       168: instanceof    #53                 // class ext/mods/gameserver/model/actor/Npc
       171: ifeq          390
       174: aload         4
       176: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       179: astore_3
       180: aload_3
       181: invokevirtual #118                // Method ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       184: invokevirtual #122                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getAggroRange:()I
       187: ifle          200
       190: aload_3
       191: invokevirtual #118                // Method ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       194: invokevirtual #122                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getAggroRange:()I
       197: goto          204
       200: aload_3
       201: invokevirtual #127                // Method ext/mods/gameserver/model/actor/Npc.getSeeRange:()I
       204: istore        4
       206: aload_0
       207: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       210: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       213: aload_1
       214: iload         4
       216: bipush        100
       218: iadd
       219: invokevirtual #130                // Method ext/mods/gameserver/model/actor/Npc.isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
       222: ifeq          390
       225: invokestatic  #134                // Method ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
       228: aload_0
       229: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       232: aload_1
       233: invokevirtual #140                // Method ext/mods/gameserver/geoengine/GeoEngine.canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
       236: ifne          282
       239: aload_0
       240: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       243: astore        6
       245: aload         6
       247: instanceof    #77                 // class ext/mods/gameserver/model/actor/Attackable
       250: ifeq          277
       253: aload         6
       255: checkcast     #77                 // class ext/mods/gameserver/model/actor/Attackable
       258: astore        5
       260: aload         5
       262: invokevirtual #79                 // Method ext/mods/gameserver/model/actor/Attackable.getAI:()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
       265: invokevirtual #83                 // Method ext/mods/gameserver/model/actor/ai/type/AttackableAI.getAggroList:()Lext/mods/gameserver/model/actor/container/attackable/AggroList;
       268: invokevirtual #89                 // Method ext/mods/gameserver/model/actor/container/attackable/AggroList.cleanAllHate:()V
       271: aload         5
       273: invokevirtual #92                 // Method ext/mods/gameserver/model/actor/Attackable.returnHome:()Z
       276: pop
       277: aload_0
       278: invokevirtual #95                 // Method doIdleIntention:()V
       281: return
       282: aload_0
       283: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       286: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       289: invokevirtual #144                // Method ext/mods/gameserver/model/actor/Npc.refreshKnownlist:()V
       292: aload_0
       293: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       296: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       299: invokevirtual #147                // Method ext/mods/gameserver/model/actor/Npc.getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
       302: aload_1
       303: iload_2
       304: invokevirtual #151                // Method ext/mods/gameserver/model/actor/move/CreatureMove.maybeStartOffensiveFollow:(Lext/mods/gameserver/model/actor/Creature;I)Z
       307: pop
       308: getstatic     #157                // Field ext/mods/Config.DEBUG_MELEE_ATTACK:Z
       311: ifeq          376
       314: iload_2
       315: sipush        200
       318: if_icmpgt     376
       321: getstatic     #163                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       324: ldc           #167                // String [MeleeDebug] thinkAttack: refreshKnownlist npc={} target={} dist={}
       326: iconst_3
       327: anewarray     #169                // class java/lang/Object
       330: dup
       331: iconst_0
       332: aload_0
       333: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       336: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       339: invokevirtual #171                // Method ext/mods/gameserver/model/actor/Npc.getObjectId:()I
       342: invokestatic  #174                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       345: aastore
       346: dup
       347: iconst_1
       348: aload_1
       349: invokevirtual #180                // Method ext/mods/gameserver/model/actor/Creature.getObjectId:()I
       352: invokestatic  #174                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       355: aastore
       356: dup
       357: iconst_2
       358: aload_0
       359: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       362: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       365: aload_1
       366: invokevirtual #98                 // Method ext/mods/gameserver/model/actor/Npc.distance3D:(Lext/mods/gameserver/model/WorldObject;)D
       369: invokestatic  #181                // Method java/lang/Double.valueOf:(D)Ljava/lang/Double;
       372: aastore
       373: invokevirtual #186                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
       376: aload_0
       377: invokedynamic #192,  0            // InvokeDynamic #0:run:(Lext/mods/gameserver/model/actor/ai/type/NpcAI;)Ljava/lang/Runnable;
       382: ldc2_w        #196                // long 100l
       385: invokestatic  #198                // Method ext/mods/commons/pool/ThreadPool.scheduleIO:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
       388: pop
       389: return
       390: getstatic     #157                // Field ext/mods/Config.DEBUG_MELEE_ATTACK:Z
       393: ifeq          441
       396: iload_2
       397: sipush        200
       400: if_icmpgt     441
       403: getstatic     #163                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       406: ldc           #204                // String [MeleeDebug] thinkAttack: lostKnownlist npc={} target={}
       408: iconst_2
       409: anewarray     #169                // class java/lang/Object
       412: dup
       413: iconst_0
       414: aload_0
       415: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       418: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       421: invokevirtual #171                // Method ext/mods/gameserver/model/actor/Npc.getObjectId:()I
       424: invokestatic  #174                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       427: aastore
       428: dup
       429: iconst_1
       430: aload_1
       431: invokevirtual #180                // Method ext/mods/gameserver/model/actor/Creature.getObjectId:()I
       434: invokestatic  #174                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       437: aastore
       438: invokevirtual #186                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
       441: aload_0
       442: invokevirtual #95                 // Method doIdleIntention:()V
       445: return
       446: aload_0
       447: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       450: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       453: invokevirtual #206                // Method ext/mods/gameserver/model/actor/Npc.getCollisionRadius:()D
       456: d2i
       457: istore_3
       458: aload_1
       459: invokevirtual #210                // Method ext/mods/gameserver/model/actor/Creature.getCollisionRadius:()D
       462: d2i
       463: istore        4
       465: iload_2
       466: iload_3
       467: iadd
       468: iload         4
       470: iadd
       471: istore        5
       473: aload_0
       474: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       477: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       480: aload_1
       481: invokevirtual #98                 // Method ext/mods/gameserver/model/actor/Npc.distance3D:(Lext/mods/gameserver/model/WorldObject;)D
       484: dstore        6
       486: getstatic     #211                // Field ext/mods/Config.MONSTER_MAX_RANGE:I
       489: i2d
       490: dstore        8
       492: iload         5
       494: i2d
       495: dload         8
       497: dadd
       498: dstore        10
       500: dload         6
       502: dload         10
       504: dcmpg
       505: ifgt          512
       508: iconst_1
       509: goto          513
       512: iconst_0
       513: istore        12
       515: getstatic     #157                // Field ext/mods/Config.DEBUG_MELEE_ATTACK:Z
       518: ifeq          609
       521: iload_2
       522: sipush        200
       525: if_icmpgt     609
       528: getstatic     #163                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       531: ldc           #215                // String [MeleeDebug] thinkAttack: npc={} target={} dist={} maxRange={} moving={} intention={}
       533: bipush        6
       535: anewarray     #169                // class java/lang/Object
       538: dup
       539: iconst_0
       540: aload_0
       541: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       544: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       547: invokevirtual #171                // Method ext/mods/gameserver/model/actor/Npc.getObjectId:()I
       550: invokestatic  #174                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       553: aastore
       554: dup
       555: iconst_1
       556: aload_1
       557: invokevirtual #180                // Method ext/mods/gameserver/model/actor/Creature.getObjectId:()I
       560: invokestatic  #174                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       563: aastore
       564: dup
       565: iconst_2
       566: dload         6
       568: invokestatic  #181                // Method java/lang/Double.valueOf:(D)Ljava/lang/Double;
       571: aastore
       572: dup
       573: iconst_3
       574: dload         10
       576: invokestatic  #181                // Method java/lang/Double.valueOf:(D)Ljava/lang/Double;
       579: aastore
       580: dup
       581: iconst_4
       582: aload_0
       583: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       586: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       589: invokevirtual #217                // Method ext/mods/gameserver/model/actor/Npc.isMoving:()Z
       592: invokestatic  #220                // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
       595: aastore
       596: dup
       597: iconst_5
       598: aload_0
       599: getfield      #59                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
       602: invokevirtual #225                // Method ext/mods/gameserver/model/actor/ai/Intention.getType:()Lext/mods/gameserver/enums/IntentionType;
       605: aastore
       606: invokevirtual #186                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
       609: iload         12
       611: ifne          763
       614: aload_0
       615: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       618: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       621: ldc           #70                 // class ext/mods/gameserver/model/actor/Creature
       623: dload         6
       625: d2i
       626: invokevirtual #229                // Method ext/mods/gameserver/model/actor/Npc.getKnownTypeInRadius:(Ljava/lang/Class;I)Ljava/util/List;
       629: invokeinterface #233,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       634: astore        13
       636: aload         13
       638: invokeinterface #239,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       643: ifeq          763
       646: aload         13
       648: invokeinterface #244,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       653: checkcast     #70                 // class ext/mods/gameserver/model/actor/Creature
       656: astore        14
       658: aload         14
       660: instanceof    #53                 // class ext/mods/gameserver/model/actor/Npc
       663: ifeq          636
       666: aload         14
       668: aload_0
       669: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       672: if_acmpeq     636
       675: aload         14
       677: aload_1
       678: if_acmpeq     636
       681: aload         14
       683: invokevirtual #248                // Method ext/mods/gameserver/model/actor/Creature.isDead:()Z
       686: ifeq          692
       689: goto          636
       692: aload_0
       693: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       696: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       699: aload         14
       701: invokevirtual #98                 // Method ext/mods/gameserver/model/actor/Npc.distance3D:(Lext/mods/gameserver/model/WorldObject;)D
       704: dstore        15
       706: aload         14
       708: aload_1
       709: invokevirtual #251                // Method ext/mods/gameserver/model/actor/Creature.distance3D:(Lext/mods/gameserver/model/WorldObject;)D
       712: dstore        17
       714: dload         15
       716: dload         17
       718: dadd
       719: dload         6
       721: dsub
       722: invokestatic  #252                // Method java/lang/Math.abs:(D)D
       725: ldc2_w        #258                // double 35.0d
       728: dcmpg
       729: ifge          760
       732: dload         10
       734: aload         14
       736: invokevirtual #210                // Method ext/mods/gameserver/model/actor/Creature.getCollisionRadius:()D
       739: ldc2_w        #260                // double 2.0d
       742: dmul
       743: dadd
       744: dstore        19
       746: dload         6
       748: dload         19
       750: dcmpg
       751: ifgt          760
       754: iconst_1
       755: istore        12
       757: goto          763
       760: goto          636
       763: iload         12
       765: ifne          845
       768: aload_0
       769: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       772: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       775: invokevirtual #147                // Method ext/mods/gameserver/model/actor/Npc.getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
       778: aload_1
       779: iload_2
       780: invokevirtual #151                // Method ext/mods/gameserver/model/actor/move/CreatureMove.maybeStartOffensiveFollow:(Lext/mods/gameserver/model/actor/Creature;I)Z
       783: pop
       784: getstatic     #157                // Field ext/mods/Config.DEBUG_MELEE_ATTACK:Z
       787: ifeq          844
       790: iload_2
       791: sipush        200
       794: if_icmpgt     844
       797: getstatic     #163                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       800: ldc_w         #262                // String [MeleeDebug] thinkAttack: startFollow npc={} target={} dist={}
       803: iconst_3
       804: anewarray     #169                // class java/lang/Object
       807: dup
       808: iconst_0
       809: aload_0
       810: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       813: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       816: invokevirtual #171                // Method ext/mods/gameserver/model/actor/Npc.getObjectId:()I
       819: invokestatic  #174                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       822: aastore
       823: dup
       824: iconst_1
       825: aload_1
       826: invokevirtual #180                // Method ext/mods/gameserver/model/actor/Creature.getObjectId:()I
       829: invokestatic  #174                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       832: aastore
       833: dup
       834: iconst_2
       835: dload         6
       837: invokestatic  #181                // Method java/lang/Double.valueOf:(D)Ljava/lang/Double;
       840: aastore
       841: invokevirtual #186                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
       844: return
       845: aload_0
       846: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       849: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       852: invokevirtual #264                // Method ext/mods/gameserver/model/actor/Npc.getAttack:()Lext/mods/gameserver/model/actor/attack/NpcAttack;
       855: invokevirtual #268                // Method ext/mods/gameserver/model/actor/attack/NpcAttack.isAttackingNow:()Z
       858: ifne          877
       861: aload_0
       862: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       865: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       868: invokevirtual #264                // Method ext/mods/gameserver/model/actor/Npc.getAttack:()Lext/mods/gameserver/model/actor/attack/NpcAttack;
       871: invokevirtual #273                // Method ext/mods/gameserver/model/actor/attack/NpcAttack.isBowCoolingDown:()Z
       874: ifeq          968
       877: getstatic     #157                // Field ext/mods/Config.DEBUG_MELEE_ATTACK:Z
       880: ifeq          967
       883: iload_2
       884: sipush        200
       887: if_icmpgt     967
       890: getstatic     #163                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       893: ldc_w         #276                // String [MeleeDebug] thinkAttack: cooldown npc={} target={} attackingNow={} bowCooldown={}
       896: iconst_4
       897: anewarray     #169                // class java/lang/Object
       900: dup
       901: iconst_0
       902: aload_0
       903: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       906: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       909: invokevirtual #171                // Method ext/mods/gameserver/model/actor/Npc.getObjectId:()I
       912: invokestatic  #174                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       915: aastore
       916: dup
       917: iconst_1
       918: aload_1
       919: invokevirtual #180                // Method ext/mods/gameserver/model/actor/Creature.getObjectId:()I
       922: invokestatic  #174                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       925: aastore
       926: dup
       927: iconst_2
       928: aload_0
       929: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       932: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       935: invokevirtual #264                // Method ext/mods/gameserver/model/actor/Npc.getAttack:()Lext/mods/gameserver/model/actor/attack/NpcAttack;
       938: invokevirtual #268                // Method ext/mods/gameserver/model/actor/attack/NpcAttack.isAttackingNow:()Z
       941: invokestatic  #220                // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
       944: aastore
       945: dup
       946: iconst_3
       947: aload_0
       948: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       951: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       954: invokevirtual #264                // Method ext/mods/gameserver/model/actor/Npc.getAttack:()Lext/mods/gameserver/model/actor/attack/NpcAttack;
       957: invokevirtual #273                // Method ext/mods/gameserver/model/actor/attack/NpcAttack.isBowCoolingDown:()Z
       960: invokestatic  #220                // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
       963: aastore
       964: invokevirtual #186                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
       967: return
       968: iload_2
       969: sipush        200
       972: if_icmpgt     1131
       975: aload_0
       976: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       979: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       982: invokevirtual #278                // Method ext/mods/gameserver/model/actor/Npc.getAllSkillsDisabled:()Z
       985: ifne          1131
       988: aload_0
       989: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       992: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       995: invokevirtual #281                // Method ext/mods/gameserver/model/actor/Npc.getCast:()Lext/mods/gameserver/model/actor/cast/NpcCast;
       998: invokevirtual #285                // Method ext/mods/gameserver/model/actor/cast/NpcCast.isCastingNow:()Z
      1001: ifne          1131
      1004: bipush        100
      1006: invokestatic  #290                // Method ext/mods/commons/random/Rnd.get:(I)I
      1009: bipush        30
      1011: if_icmpge     1131
      1014: aload_0
      1015: invokevirtual #296                // Method selectMeleeSkill:()Lext/mods/gameserver/skills/L2Skill;
      1018: astore        13
      1020: aload         13
      1022: ifnull        1131
      1025: aload         13
      1027: invokevirtual #300                // Method ext/mods/gameserver/skills/L2Skill.isOffensive:()Z
      1030: ifne          1041
      1033: aload         13
      1035: invokevirtual #305                // Method ext/mods/gameserver/skills/L2Skill.isDebuff:()Z
      1038: ifeq          1045
      1041: iconst_1
      1042: goto          1046
      1045: iconst_0
      1046: istore        14
      1048: iload         14
      1050: ifeq          1057
      1053: aload_1
      1054: goto          1061
      1057: aload_0
      1058: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
      1061: astore        15
      1063: aload_0
      1064: aload         15
      1066: aload         13
      1068: iconst_0
      1069: iconst_0
      1070: iconst_0
      1071: iload         14
      1073: invokevirtual #308                // Method doCastIntention:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZZIZ)V
      1076: getstatic     #157                // Field ext/mods/Config.DEBUG_MELEE_ATTACK:Z
      1079: ifeq          1130
      1082: getstatic     #163                // Field LOGGER:Lext/mods/commons/logging/CLogger;
      1085: ldc_w         #312                // String [MeleeDebug] thinkAttack: castSkill npc={} skillId={} offensive={}
      1088: iconst_3
      1089: anewarray     #169                // class java/lang/Object
      1092: dup
      1093: iconst_0
      1094: aload_0
      1095: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
      1098: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
      1101: invokevirtual #171                // Method ext/mods/gameserver/model/actor/Npc.getObjectId:()I
      1104: invokestatic  #174                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      1107: aastore
      1108: dup
      1109: iconst_1
      1110: aload         13
      1112: invokevirtual #314                // Method ext/mods/gameserver/skills/L2Skill.getId:()I
      1115: invokestatic  #174                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      1118: aastore
      1119: dup
      1120: iconst_2
      1121: iload         14
      1123: invokestatic  #220                // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
      1126: aastore
      1127: invokevirtual #186                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
      1130: return
      1131: aload_0
      1132: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
      1135: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
      1138: invokevirtual #264                // Method ext/mods/gameserver/model/actor/Npc.getAttack:()Lext/mods/gameserver/model/actor/attack/NpcAttack;
      1141: aload_1
      1142: invokevirtual #317                // Method ext/mods/gameserver/model/actor/attack/NpcAttack.canAttack:(Lext/mods/gameserver/model/actor/Creature;)Z
      1145: ifne          1263
      1148: dload         6
      1150: iload         5
      1152: bipush        100
      1154: iadd
      1155: i2d
      1156: dcmpg
      1157: ifgt          1178
      1160: aload_0
      1161: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
      1164: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
      1167: invokevirtual #147                // Method ext/mods/gameserver/model/actor/Npc.getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
      1170: aload_1
      1171: iload_2
      1172: invokevirtual #321                // Method ext/mods/gameserver/model/actor/move/CreatureMove.startOffensiveFollow:(Lext/mods/gameserver/model/actor/Creature;I)V
      1175: goto          1194
      1178: aload_0
      1179: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
      1182: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
      1185: invokevirtual #147                // Method ext/mods/gameserver/model/actor/Npc.getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
      1188: aload_1
      1189: iload_2
      1190: invokevirtual #151                // Method ext/mods/gameserver/model/actor/move/CreatureMove.maybeStartOffensiveFollow:(Lext/mods/gameserver/model/actor/Creature;I)Z
      1193: pop
      1194: getstatic     #157                // Field ext/mods/Config.DEBUG_MELEE_ATTACK:Z
      1197: ifeq          1262
      1200: iload_2
      1201: sipush        200
      1204: if_icmpgt     1262
      1207: getstatic     #163                // Field LOGGER:Lext/mods/commons/logging/CLogger;
      1210: ldc_w         #325                // String [MeleeDebug] thinkAttack: canAttack=false npc={} target={} dist={} range={}
      1213: iconst_4
      1214: anewarray     #169                // class java/lang/Object
      1217: dup
      1218: iconst_0
      1219: aload_0
      1220: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
      1223: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
      1226: invokevirtual #171                // Method ext/mods/gameserver/model/actor/Npc.getObjectId:()I
      1229: invokestatic  #174                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      1232: aastore
      1233: dup
      1234: iconst_1
      1235: aload_1
      1236: invokevirtual #180                // Method ext/mods/gameserver/model/actor/Creature.getObjectId:()I
      1239: invokestatic  #174                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      1242: aastore
      1243: dup
      1244: iconst_2
      1245: dload         6
      1247: invokestatic  #181                // Method java/lang/Double.valueOf:(D)Ljava/lang/Double;
      1250: aastore
      1251: dup
      1252: iconst_3
      1253: iload         5
      1255: invokestatic  #174                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      1258: aastore
      1259: invokevirtual #186                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
      1262: return
      1263: aload_0
      1264: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
      1267: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
      1270: invokevirtual #217                // Method ext/mods/gameserver/model/actor/Npc.isMoving:()Z
      1273: ifeq          1289
      1276: aload_0
      1277: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
      1280: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
      1283: invokevirtual #147                // Method ext/mods/gameserver/model/actor/Npc.getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
      1286: invokevirtual #327                // Method ext/mods/gameserver/model/actor/move/CreatureMove.stop:()V
      1289: aload_0
      1290: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
      1293: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
      1296: aload_1
      1297: bipush        35
      1299: invokevirtual #330                // Method ext/mods/gameserver/model/actor/Npc.isFacing:(Lext/mods/gameserver/model/WorldObject;I)Z
      1302: ifne          1319
      1305: aload_0
      1306: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
      1309: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
      1312: invokevirtual #333                // Method ext/mods/gameserver/model/actor/Npc.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
      1315: aload_1
      1316: invokevirtual #337                // Method ext/mods/gameserver/model/location/SpawnLocation.setHeadingTo:(Lext/mods/gameserver/model/WorldObject;)V
      1319: aload_0
      1320: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
      1323: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
      1326: iconst_1
      1327: iconst_0
      1328: invokevirtual #343                // Method ext/mods/gameserver/model/actor/Npc.rechargeShots:(ZZ)V
      1331: aload_0
      1332: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
      1335: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
      1338: invokevirtual #264                // Method ext/mods/gameserver/model/actor/Npc.getAttack:()Lext/mods/gameserver/model/actor/attack/NpcAttack;
      1341: aload_1
      1342: invokevirtual #347                // Method ext/mods/gameserver/model/actor/attack/NpcAttack.doAttack:(Lext/mods/gameserver/model/actor/Creature;)V
      1345: getstatic     #157                // Field ext/mods/Config.DEBUG_MELEE_ATTACK:Z
      1348: ifeq          1397
      1351: iload_2
      1352: sipush        200
      1355: if_icmpgt     1397
      1358: getstatic     #163                // Field LOGGER:Lext/mods/commons/logging/CLogger;
      1361: ldc_w         #350                // String [MeleeDebug] thinkAttack: doAttack npc={} target={}
      1364: iconst_2
      1365: anewarray     #169                // class java/lang/Object
      1368: dup
      1369: iconst_0
      1370: aload_0
      1371: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
      1374: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
      1377: invokevirtual #171                // Method ext/mods/gameserver/model/actor/Npc.getObjectId:()I
      1380: invokestatic  #174                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      1383: aastore
      1384: dup
      1385: iconst_1
      1386: aload_1
      1387: invokevirtual #180                // Method ext/mods/gameserver/model/actor/Creature.getObjectId:()I
      1390: invokestatic  #174                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      1393: aastore
      1394: invokevirtual #186                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
      1397: aload_0
      1398: aload_0
      1399: getfield      #59                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
      1402: invokevirtual #352                // Method setNextIntention:(Lext/mods/gameserver/model/actor/ai/Intention;)V
      1405: return
      LineNumberTable:
        line 108: 0
        line 109: 13
        line 112: 14
        line 114: 22
        line 115: 40
        line 116: 57
        line 117: 67
        line 119: 72
        line 121: 76
        line 124: 77
        line 125: 95
        line 126: 112
        line 127: 122
        line 129: 127
        line 131: 131
        line 134: 132
        line 136: 146
        line 137: 160
        line 138: 180
        line 140: 206
        line 142: 225
        line 143: 239
        line 144: 260
        line 145: 271
        line 147: 277
        line 149: 281
        line 152: 282
        line 153: 292
        line 155: 308
        line 156: 321
        line 159: 376
        line 160: 389
        line 163: 390
        line 164: 403
        line 166: 441
        line 169: 445
        line 188: 446
        line 189: 458
        line 191: 465
        line 192: 473
        line 195: 486
        line 196: 492
        line 197: 500
        line 199: 515
        line 200: 528
        line 203: 609
        line 204: 614
        line 205: 658
        line 207: 692
        line 208: 706
        line 210: 714
        line 211: 732
        line 212: 746
        line 213: 754
        line 214: 757
        line 217: 760
        line 220: 763
        line 221: 768
        line 222: 784
        line 223: 797
        line 225: 844
        line 228: 845
        line 229: 877
        line 230: 890
        line 232: 967
        line 236: 968
        line 237: 1014
        line 238: 1020
        line 239: 1025
        line 240: 1048
        line 241: 1063
        line 242: 1076
        line 243: 1082
        line 245: 1130
        line 249: 1131
        line 250: 1148
        line 251: 1160
        line 253: 1178
        line 255: 1194
        line 256: 1207
        line 258: 1262
        line 261: 1263
        line 262: 1276
        line 264: 1289
        line 265: 1305
        line 267: 1319
        line 268: 1331
        line 269: 1345
        line 270: 1358
        line 273: 1397
        line 275: 1405
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           57      15     2 attackable   Lext/mods/gameserver/model/actor/Attackable;
          112      15     2 attackable   Lext/mods/gameserver/model/actor/Attackable;
          260      17     5 attackable   Lext/mods/gameserver/model/actor/Attackable;
          206     184     4 aggroRange   I
          180     210     3   npc   Lext/mods/gameserver/model/actor/Npc;
          746      14    19 adjustedRange   D
          706      54    15 distToBlocker   D
          714      46    17 blockerToTarget   D
          658     102    14 blocker   Lext/mods/gameserver/model/actor/Creature;
         1048      83    14 offensive   Z
         1063      68    15 castTarget   Lext/mods/gameserver/model/actor/Creature;
         1020     111    13 skill   Lext/mods/gameserver/skills/L2Skill;
            0    1406     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI;
           22    1384     1 target   Lext/mods/gameserver/model/actor/Creature;
          146    1260     2 weaponRange   I
          458     948     3 actorCol   I
          465     941     4 targetCol   I
          473     933     5 totalRange   I
          486     920     6  dist   D
          492     914     8 attackMargin   D
          500     906    10 maxAttackRange   D
          515     891    12 inRange   Z
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0    1406     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI<TT;>;
      StackMapTable: number_of_entries = 40
        frame_type = 14 /* same */
        frame_type = 252 /* append */
          offset_delta = 25
          locals = [ class ext/mods/gameserver/model/actor/Creature ]
        frame_type = 31 /* same */
        frame_type = 4 /* same */
        frame_type = 49 /* same */
        frame_type = 4 /* same */
        frame_type = 253 /* append */
          offset_delta = 67
          locals = [ int, class ext/mods/gameserver/model/actor/Npc ]
        frame_type = 67 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 72
          locals = [ int ]
        frame_type = 4 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 93
        frame_type = 249 /* chop */
          offset_delta = 13
        frame_type = 50 /* same */
        frame_type = 4 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 65
          locals = [ class ext/mods/gameserver/model/actor/ai/type/NpcAI, class ext/mods/gameserver/model/actor/Creature, int, int, int, int, double, double, double ]
          stack = []
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 95
          locals = [ int ]
        frame_type = 252 /* append */
          offset_delta = 26
          locals = [ class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 55
          locals = [ class ext/mods/gameserver/model/actor/Creature ]
        frame_type = 250 /* chop */
          offset_delta = 67
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 251 /* same_frame_extended */
          offset_delta = 80
        frame_type = 0 /* same */
        frame_type = 31 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 89
        frame_type = 0 /* same */
        frame_type = 252 /* append */
          offset_delta = 72
          locals = [ class ext/mods/gameserver/skills/L2Skill ]
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ int ]
        frame_type = 67 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/actor/Creature ]
        frame_type = 252 /* append */
          offset_delta = 68
          locals = [ class ext/mods/gameserver/model/actor/Creature ]
        frame_type = 248 /* chop */
          offset_delta = 0
        frame_type = 46 /* same */
        frame_type = 15 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 67
        frame_type = 0 /* same */
        frame_type = 25 /* same */
        frame_type = 29 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 77

  public void stopFollow();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=1
         0: aload_0
         1: getfield      #59                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
         4: invokevirtual #225                // Method ext/mods/gameserver/model/actor/ai/Intention.getType:()Lext/mods/gameserver/enums/IntentionType;
         7: getstatic     #538                // Field ext/mods/gameserver/enums/IntentionType.ATTACK:Lext/mods/gameserver/enums/IntentionType;
        10: if_acmpne     127
        13: aload_0
        14: getfield      #59                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        17: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/ai/Intention.getFinalTarget:()Lext/mods/gameserver/model/actor/Creature;
        20: astore_1
        21: aload_1
        22: ifnull        127
        25: aload_1
        26: invokevirtual #69                 // Method ext/mods/gameserver/model/actor/Creature.isAlikeDead:()Z
        29: ifne          127
        32: aload_1
        33: invokevirtual #74                 // Method ext/mods/gameserver/model/actor/Creature.isVisible:()Z
        36: ifeq          127
        39: aload_0
        40: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        43: astore_3
        44: aload_3
        45: instanceof    #53                 // class ext/mods/gameserver/model/actor/Npc
        48: ifeq          127
        51: aload_3
        52: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
        55: astore_2
        56: aload_2
        57: invokevirtual #118                // Method ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
        60: invokevirtual #122                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getAggroRange:()I
        63: ifle          76
        66: aload_2
        67: invokevirtual #118                // Method ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
        70: invokevirtual #122                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getAggroRange:()I
        73: goto          80
        76: aload_2
        77: invokevirtual #127                // Method ext/mods/gameserver/model/actor/Npc.getSeeRange:()I
        80: istore_3
        81: aload_0
        82: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        85: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
        88: aload_1
        89: iload_3
        90: bipush        100
        92: iadd
        93: invokevirtual #130                // Method ext/mods/gameserver/model/actor/Npc.isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
        96: ifeq          127
        99: invokestatic  #134                // Method ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
       102: aload_0
       103: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       106: aload_1
       107: invokevirtual #140                // Method ext/mods/gameserver/geoengine/GeoEngine.canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
       110: ifeq          127
       113: aload_0
       114: invokedynamic #544,  0            // InvokeDynamic #3:run:(Lext/mods/gameserver/model/actor/ai/type/NpcAI;)Ljava/lang/Runnable;
       119: ldc2_w        #196                // long 100l
       122: invokestatic  #545                // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
       125: pop
       126: return
       127: aload_0
       128: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       131: astore_2
       132: aload_2
       133: instanceof    #77                 // class ext/mods/gameserver/model/actor/Attackable
       136: ifeq          159
       139: aload_2
       140: checkcast     #77                 // class ext/mods/gameserver/model/actor/Attackable
       143: astore_1
       144: aload_1
       145: invokevirtual #79                 // Method ext/mods/gameserver/model/actor/Attackable.getAI:()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
       148: invokevirtual #83                 // Method ext/mods/gameserver/model/actor/ai/type/AttackableAI.getAggroList:()Lext/mods/gameserver/model/actor/container/attackable/AggroList;
       151: invokevirtual #89                 // Method ext/mods/gameserver/model/actor/container/attackable/AggroList.cleanAllHate:()V
       154: aload_1
       155: invokevirtual #92                 // Method ext/mods/gameserver/model/actor/Attackable.returnHome:()Z
       158: pop
       159: aload_0
       160: invokevirtual #95                 // Method doIdleIntention:()V
       163: return
      LineNumberTable:
        line 366: 0
        line 367: 13
        line 369: 21
        line 371: 56
        line 373: 81
        line 375: 99
        line 376: 113
        line 377: 126
        line 383: 127
        line 384: 144
        line 385: 154
        line 388: 159
        line 389: 163
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           81      46     3 aggroRange   I
           56      71     2   npc   Lext/mods/gameserver/model/actor/Npc;
           21     106     1 target   Lext/mods/gameserver/model/actor/Creature;
          144      15     1 attackable   Lext/mods/gameserver/model/actor/Attackable;
            0     164     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0     164     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI<TT;>;
      StackMapTable: number_of_entries = 4
        frame_type = 253 /* append */
          offset_delta = 76
          locals = [ class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/model/actor/Npc ]
        frame_type = 67 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 249 /* chop */
          offset_delta = 46
        frame_type = 31 /* same */

  public void stopAITask();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: iconst_0
         2: putfield      #548                // Field _isOnARoute:Z
         5: aload_0
         6: invokespecial #551                // Method ext/mods/gameserver/model/actor/ai/type/CreatureAI.stopAITask:()V
         9: return
      LineNumberTable:
        line 395: 0
        line 396: 5
        line 397: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI<TT;>;

  public void thinkIdle();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=1
         0: aload_0
         1: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
         7: iconst_1
         8: invokevirtual #554                // Method ext/mods/gameserver/model/actor/Npc.abortAll:(Z)V
        11: aload_0
        12: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        15: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
        18: invokevirtual #558                // Method ext/mods/gameserver/model/actor/Npc.forceWalkStance:()V
        21: aload_0
        22: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        25: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
        28: invokevirtual #118                // Method ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
        31: getstatic     #561                // Field ext/mods/gameserver/enums/EventHandler.NO_DESIRE:Lext/mods/gameserver/enums/EventHandler;
        34: invokevirtual #567                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getEventQuests:(Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
        37: invokeinterface #233,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        42: astore_1
        43: aload_1
        44: invokeinterface #239,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        49: ifeq          76
        52: aload_1
        53: invokeinterface #244,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        58: checkcast     #571                // class ext/mods/gameserver/scripting/Quest
        61: astore_2
        62: aload_2
        63: aload_0
        64: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        67: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
        70: invokevirtual #573                // Method ext/mods/gameserver/scripting/Quest.onNoDesire:(Lext/mods/gameserver/model/actor/Npc;)V
        73: goto          43
        76: return
      LineNumberTable:
        line 402: 0
        line 403: 11
        line 405: 21
        line 406: 62
        line 407: 76
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           62      11     2 quest   Lext/mods/gameserver/scripting/Quest;
            0      77     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      77     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI<TT;>;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 43
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 32

  protected void thinkSocial();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=5, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #576                // Method clearCurrentDesire:()V
         4: aload_0
         5: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         8: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
        11: invokevirtual #55                 // Method ext/mods/gameserver/model/actor/Npc.denyAiAction:()Z
        14: ifeq          18
        17: return
        18: aload_0
        19: invokestatic  #579                // Method java/lang/System.currentTimeMillis:()J
        22: aload_0
        23: getfield      #59                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        26: invokevirtual #585                // Method ext/mods/gameserver/model/actor/ai/Intention.getTimer:()I
        29: i2l
        30: ladd
        31: putfield      #588                // Field _lastSocialBroadcast:J
        34: aload_0
        35: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        38: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
        41: invokevirtual #147                // Method ext/mods/gameserver/model/actor/Npc.getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
        44: invokevirtual #327                // Method ext/mods/gameserver/model/actor/move/CreatureMove.stop:()V
        47: aload_0
        48: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        51: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
        54: new           #592                // class ext/mods/gameserver/network/serverpackets/SocialAction
        57: dup
        58: aload_0
        59: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        62: aload_0
        63: getfield      #59                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        66: invokevirtual #594                // Method ext/mods/gameserver/model/actor/ai/Intention.getItemObjectId:()I
        69: invokespecial #597                // Method ext/mods/gameserver/network/serverpackets/SocialAction."<init>":(Lext/mods/gameserver/model/actor/Creature;I)V
        72: invokevirtual #599                // Method ext/mods/gameserver/model/actor/Npc.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        75: return
      LineNumberTable:
        line 412: 0
        line 414: 4
        line 415: 17
        line 417: 18
        line 419: 34
        line 420: 47
        line 421: 75
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      76     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      76     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI<TT;>;
      StackMapTable: number_of_entries = 1
        frame_type = 18 /* same */

  protected void thinkFollow();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=5, locals=2, args_size=1
         0: aload_0
         1: getfield      #603                // Field _runAiStep:I
         4: iconst_2
         5: irem
         6: ifne          10
         9: return
        10: aload_0
        11: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        14: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
        17: iconst_1
        18: invokevirtual #606                // Method ext/mods/gameserver/model/actor/Npc.setWalkOrRun:(Z)V
        21: aload_0
        22: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        25: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
        28: invokevirtual #55                 // Method ext/mods/gameserver/model/actor/Npc.denyAiAction:()Z
        31: ifne          47
        34: aload_0
        35: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        38: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
        41: invokevirtual #609                // Method ext/mods/gameserver/model/actor/Npc.isMovementDisabled:()Z
        44: ifeq          48
        47: return
        48: aload_0
        49: getfield      #59                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        52: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/ai/Intention.getFinalTarget:()Lext/mods/gameserver/model/actor/Creature;
        55: astore_1
        56: aload_1
        57: ifnull        75
        60: aload_0
        61: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        64: aload_1
        65: if_acmpeq     75
        68: aload_1
        69: invokevirtual #248                // Method ext/mods/gameserver/model/actor/Creature.isDead:()Z
        72: ifeq          80
        75: aload_0
        76: invokevirtual #576                // Method clearCurrentDesire:()V
        79: return
        80: aload_0
        81: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        84: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
        87: invokevirtual #147                // Method ext/mods/gameserver/model/actor/Npc.getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
        90: invokevirtual #612                // Method ext/mods/gameserver/model/actor/move/CreatureMove.getGeoPathFailCount:()I
        93: bipush        10
        95: if_icmplt     99
        98: return
        99: aload_0
       100: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       103: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       106: invokevirtual #615                // Method ext/mods/gameserver/model/actor/Npc.hasMaster:()Z
       109: ifeq          169
       112: aload_1
       113: aload_0
       114: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       117: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       120: invokevirtual #618                // Method ext/mods/gameserver/model/actor/Npc.getMaster:()Lext/mods/gameserver/model/actor/Npc;
       123: if_acmpne     169
       126: aload_0
       127: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       130: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       133: aload_1
       134: sipush        150
       137: invokevirtual #622                // Method ext/mods/gameserver/model/actor/Npc.isIn2DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
       140: ifeq          144
       143: return
       144: aload_0
       145: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       148: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       151: invokevirtual #147                // Method ext/mods/gameserver/model/actor/Npc.getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
       154: aload_1
       155: invokevirtual #625                // Method ext/mods/gameserver/model/actor/Creature.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
       158: bipush        100
       160: iconst_1
       161: iconst_0
       162: invokevirtual #626                // Method ext/mods/gameserver/model/actor/move/CreatureMove.maybeMoveToLocation:(Lext/mods/gameserver/model/location/Location;IZZ)Z
       165: pop
       166: goto          231
       169: aload_0
       170: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       173: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       176: aload_1
       177: sipush        150
       180: invokevirtual #622                // Method ext/mods/gameserver/model/actor/Npc.isIn2DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
       183: ifne          231
       186: bipush        100
       188: invokestatic  #290                // Method ext/mods/commons/random/Rnd.get:(I)I
       191: bipush        50
       193: if_icmple     231
       196: aload_0
       197: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       200: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       203: invokevirtual #217                // Method ext/mods/gameserver/model/actor/Npc.isMoving:()Z
       206: ifne          231
       209: aload_0
       210: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       213: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       216: invokevirtual #147                // Method ext/mods/gameserver/model/actor/Npc.getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
       219: aload_1
       220: invokevirtual #625                // Method ext/mods/gameserver/model/actor/Creature.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
       223: bipush        100
       225: iconst_1
       226: iconst_0
       227: invokevirtual #626                // Method ext/mods/gameserver/model/actor/move/CreatureMove.maybeMoveToLocation:(Lext/mods/gameserver/model/location/Location;IZZ)Z
       230: pop
       231: return
      LineNumberTable:
        line 426: 0
        line 427: 10
        line 428: 21
        line 430: 48
        line 431: 56
        line 432: 75
        line 433: 79
        line 436: 80
        line 437: 98
        line 440: 99
        line 441: 126
        line 442: 144
        line 443: 169
        line 444: 209
        line 446: 231
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     232     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI;
           56     176     1 target   Lext/mods/gameserver/model/actor/Creature;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0     232     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI<TT;>;
      StackMapTable: number_of_entries = 9
        frame_type = 10 /* same */
        frame_type = 36 /* same */
        frame_type = 0 /* same */
        frame_type = 252 /* append */
          offset_delta = 26
          locals = [ class ext/mods/gameserver/model/actor/Creature ]
        frame_type = 4 /* same */
        frame_type = 18 /* same */
        frame_type = 44 /* same */
        frame_type = 24 /* same */
        frame_type = 61 /* same */

  protected void thinkNothing();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=0, locals=1, args_size=1
         0: return
      LineNumberTable:
        line 449: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI<TT;>;

  protected ext.mods.gameserver.model.item.instance.ItemInstance thinkPickUp();
    descriptor: ()Lext/mods/gameserver/model/item/instance/ItemInstance;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=5, locals=5, args_size=1
         0: aload_0
         1: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
         7: invokevirtual #55                 // Method ext/mods/gameserver/model/actor/Npc.denyAiAction:()Z
        10: ifeq          15
        13: aconst_null
        14: areturn
        15: invokestatic  #630                // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
        18: aload_0
        19: getfield      #59                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        22: invokevirtual #594                // Method ext/mods/gameserver/model/actor/ai/Intention.getItemObjectId:()I
        25: invokevirtual #635                // Method ext/mods/gameserver/model/World.getObject:(I)Lext/mods/gameserver/model/WorldObject;
        28: astore_1
        29: aload_1
        30: instanceof    #639                // class ext/mods/gameserver/model/item/instance/ItemInstance
        33: ifeq          49
        36: aload_1
        37: checkcast     #639                // class ext/mods/gameserver/model/item/instance/ItemInstance
        40: astore_2
        41: aload_0
        42: aload_1
        43: invokevirtual #641                // Method isTargetLost:(Lext/mods/gameserver/model/WorldObject;)Z
        46: ifeq          51
        49: aconst_null
        50: areturn
        51: aload_2
        52: invokevirtual #644                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getLocation:()Lext/mods/gameserver/enums/items/ItemLocation;
        55: getstatic     #648                // Field ext/mods/gameserver/enums/items/ItemLocation.VOID:Lext/mods/gameserver/enums/items/ItemLocation;
        58: if_acmpeq     63
        61: aconst_null
        62: areturn
        63: aload_0
        64: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        67: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
        70: invokevirtual #147                // Method ext/mods/gameserver/model/actor/Npc.getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
        73: aload_1
        74: invokevirtual #654                // Method ext/mods/gameserver/model/WorldObject.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
        77: bipush        36
        79: iconst_0
        80: iconst_0
        81: invokevirtual #626                // Method ext/mods/gameserver/model/actor/move/CreatureMove.maybeMoveToLocation:(Lext/mods/gameserver/model/location/Location;IZZ)Z
        84: ifeq          89
        87: aconst_null
        88: areturn
        89: aload_0
        90: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        93: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
        96: invokevirtual #118                // Method ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
        99: getstatic     #657                // Field ext/mods/gameserver/enums/EventHandler.PICKED_ITEM:Lext/mods/gameserver/enums/EventHandler;
       102: invokevirtual #567                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getEventQuests:(Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
       105: invokeinterface #233,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       110: astore_3
       111: aload_3
       112: invokeinterface #239,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       117: ifeq          147
       120: aload_3
       121: invokeinterface #244,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       126: checkcast     #571                // class ext/mods/gameserver/scripting/Quest
       129: astore        4
       131: aload         4
       133: aload_0
       134: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       137: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       140: aload_2
       141: invokevirtual #660                // Method ext/mods/gameserver/scripting/Quest.onPickedItem:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
       144: goto          111
       147: invokestatic  #664                // Method ext/mods/gameserver/data/manager/CursedWeaponManager.getInstance:()Lext/mods/gameserver/data/manager/CursedWeaponManager;
       150: aload_2
       151: invokevirtual #669                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
       154: invokevirtual #672                // Method ext/mods/gameserver/data/manager/CursedWeaponManager.getCursedWeapon:(I)Lext/mods/gameserver/model/entity/CursedWeapon;
       157: astore_3
       158: aload_3
       159: ifnull        169
       162: aload_3
       163: invokevirtual #676                // Method ext/mods/gameserver/model/entity/CursedWeapon.endOfLife:()V
       166: goto          173
       169: aload_2
       170: invokevirtual #681                // Method ext/mods/gameserver/model/item/instance/ItemInstance.decayMe:()V
       173: aload_0
       174: invokevirtual #576                // Method clearCurrentDesire:()V
       177: aload_2
       178: areturn
      LineNumberTable:
        line 454: 0
        line 455: 15
        line 456: 29
        line 457: 51
        line 458: 63
        line 460: 89
        line 461: 131
        line 463: 147
        line 464: 158
        line 466: 173
        line 467: 177
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           41       8     2  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
          131      13     4 quest   Lext/mods/gameserver/scripting/Quest;
            0     179     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI;
           29     150     1 target   Lext/mods/gameserver/model/WorldObject;
           51     128     2  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
          158      21     3    cw   Lext/mods/gameserver/model/entity/CursedWeapon;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0     179     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI<TT;>;
      StackMapTable: number_of_entries = 9
        frame_type = 15 /* same */
        frame_type = 252 /* append */
          offset_delta = 33
          locals = [ class ext/mods/gameserver/model/WorldObject ]
        frame_type = 252 /* append */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 11 /* same */
        frame_type = 25 /* same */
        frame_type = 252 /* append */
          offset_delta = 21
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 35
        frame_type = 252 /* append */
          offset_delta = 21
          locals = [ class ext/mods/gameserver/model/entity/CursedWeapon ]
        frame_type = 3 /* same */

  protected void thinkMoveRoute();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #548                // Field _isOnARoute:Z
         4: ifeq          23
         7: aload_0
         8: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        11: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
        14: invokevirtual #684                // Method ext/mods/gameserver/model/actor/Npc.getNpcId:()I
        17: sipush        32108
        20: if_icmpne     27
        23: aload_0
        24: invokevirtual #687                // Method moveToNextPoint:()V
        27: return
      LineNumberTable:
        line 473: 0
        line 474: 27
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI<TT;>;
      StackMapTable: number_of_entries = 2
        frame_type = 23 /* same */
        frame_type = 3 /* same */

  protected void thinkMoveTo();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=5, locals=3, args_size=1
         0: aload_0
         1: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
         7: invokevirtual #333                // Method ext/mods/gameserver/model/actor/Npc.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
        10: aload_0
        11: getfield      #59                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        14: invokevirtual #690                // Method ext/mods/gameserver/model/actor/ai/Intention.getLoc:()Lext/mods/gameserver/model/location/Location;
        17: invokevirtual #694                // Method ext/mods/gameserver/model/location/SpawnLocation.equals:(Ljava/lang/Object;)Z
        20: ifeq          113
        23: aload_0
        24: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        27: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
        30: invokevirtual #118                // Method ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
        33: getstatic     #698                // Field ext/mods/gameserver/enums/EventHandler.MOVE_TO_FINISHED:Lext/mods/gameserver/enums/EventHandler;
        36: invokevirtual #567                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getEventQuests:(Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
        39: invokeinterface #233,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        44: astore_1
        45: aload_1
        46: invokeinterface #239,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        51: ifeq          108
        54: aload_1
        55: invokeinterface #244,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        60: checkcast     #571                // class ext/mods/gameserver/scripting/Quest
        63: astore_2
        64: aload_2
        65: aload_0
        66: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        69: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
        72: aload_0
        73: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        76: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
        79: invokevirtual #701                // Method ext/mods/gameserver/model/actor/Npc.getX:()I
        82: aload_0
        83: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        86: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
        89: invokevirtual #702                // Method ext/mods/gameserver/model/actor/Npc.getY:()I
        92: aload_0
        93: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        96: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
        99: invokevirtual #703                // Method ext/mods/gameserver/model/actor/Npc.getZ:()I
       102: invokevirtual #704                // Method ext/mods/gameserver/scripting/Quest.onMoveToFinished:(Lext/mods/gameserver/model/actor/Npc;III)V
       105: goto          45
       108: aload_0
       109: invokevirtual #576                // Method clearCurrentDesire:()V
       112: return
       113: aload_0
       114: invokespecial #708                // Method ext/mods/gameserver/model/actor/ai/type/CreatureAI.thinkMoveTo:()V
       117: return
      LineNumberTable:
        line 479: 0
        line 480: 23
        line 481: 64
        line 482: 108
        line 483: 112
        line 485: 113
        line 486: 117
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           64      41     2 quest   Lext/mods/gameserver/scripting/Quest;
            0     118     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0     118     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI<TT;>;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 45
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 62
        frame_type = 4 /* same */

  protected void onEvtArrived();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=6, locals=3, args_size=1
         0: aload_0
         1: getfield      #59                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
         4: invokevirtual #225                // Method ext/mods/gameserver/model/actor/ai/Intention.getType:()Lext/mods/gameserver/enums/IntentionType;
         7: getstatic     #538                // Field ext/mods/gameserver/enums/IntentionType.ATTACK:Lext/mods/gameserver/enums/IntentionType;
        10: if_acmpne     23
        13: aload_0
        14: getstatic     #711                // Field ext/mods/gameserver/enums/AiEventType.THINK:Lext/mods/gameserver/enums/AiEventType;
        17: aconst_null
        18: aconst_null
        19: invokevirtual #717                // Method notifyEvent:(Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
        22: return
        23: getstatic     #721                // Field ext/mods/gameserver/model/actor/ai/type/NpcAI$1.$SwitchMap$ext$mods$gameserver$enums$IntentionType:[I
        26: aload_0
        27: getfield      #59                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        30: invokevirtual #225                // Method ext/mods/gameserver/model/actor/ai/Intention.getType:()Lext/mods/gameserver/enums/IntentionType;
        33: invokevirtual #727                // Method ext/mods/gameserver/enums/IntentionType.ordinal:()I
        36: iaload
        37: tableswitch   { // 1 to 4

                       1: 68

                       2: 68

                       3: 153

                       4: 160
                 default: 161
            }
        68: aload_0
        69: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        72: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
        75: invokevirtual #118                // Method ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
        78: getstatic     #698                // Field ext/mods/gameserver/enums/EventHandler.MOVE_TO_FINISHED:Lext/mods/gameserver/enums/EventHandler;
        81: invokevirtual #567                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getEventQuests:(Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
        84: invokeinterface #233,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        89: astore_1
        90: aload_1
        91: invokeinterface #239,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        96: ifeq          153
        99: aload_1
       100: invokeinterface #244,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       105: checkcast     #571                // class ext/mods/gameserver/scripting/Quest
       108: astore_2
       109: aload_2
       110: aload_0
       111: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       114: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       117: aload_0
       118: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       121: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       124: invokevirtual #701                // Method ext/mods/gameserver/model/actor/Npc.getX:()I
       127: aload_0
       128: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       131: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       134: invokevirtual #702                // Method ext/mods/gameserver/model/actor/Npc.getY:()I
       137: aload_0
       138: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       141: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       144: invokevirtual #703                // Method ext/mods/gameserver/model/actor/Npc.getZ:()I
       147: invokevirtual #704                // Method ext/mods/gameserver/scripting/Quest.onMoveToFinished:(Lext/mods/gameserver/model/actor/Npc;III)V
       150: goto          90
       153: aload_0
       154: invokevirtual #576                // Method clearCurrentDesire:()V
       157: goto          161
       160: return
       161: aload_0
       162: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       165: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       168: invokevirtual #333                // Method ext/mods/gameserver/model/actor/Npc.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
       171: aload_0
       172: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       175: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       178: invokevirtual #730                // Method ext/mods/gameserver/model/actor/Npc.getSpawnLocation:()Lext/mods/gameserver/model/location/SpawnLocation;
       181: invokevirtual #694                // Method ext/mods/gameserver/model/location/SpawnLocation.equals:(Ljava/lang/Object;)Z
       184: ifeq          213
       187: aload_0
       188: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       191: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       194: invokevirtual #333                // Method ext/mods/gameserver/model/actor/Npc.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
       197: aload_0
       198: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       201: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       204: invokevirtual #730                // Method ext/mods/gameserver/model/actor/Npc.getSpawnLocation:()Lext/mods/gameserver/model/location/SpawnLocation;
       207: invokevirtual #733                // Method ext/mods/gameserver/model/location/SpawnLocation.getHeading:()I
       210: invokevirtual #736                // Method ext/mods/gameserver/model/location/SpawnLocation.setHeading:(I)V
       213: aload_0
       214: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       217: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       220: invokevirtual #740                // Method ext/mods/gameserver/model/actor/Npc.isInMyTerritory:()Z
       223: ifne          338
       226: aload_0
       227: getfield      #743                // Field _isOOT:Z
       230: ifne          366
       233: aload_0
       234: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       237: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       240: invokevirtual #118                // Method ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       243: getstatic     #746                // Field ext/mods/gameserver/enums/EventHandler.OUT_OF_TERRITORY:Lext/mods/gameserver/enums/EventHandler;
       246: invokevirtual #567                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getEventQuests:(Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
       249: invokeinterface #233,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       254: astore_1
       255: aload_1
       256: invokeinterface #239,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       261: ifeq          288
       264: aload_1
       265: invokeinterface #244,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       270: checkcast     #571                // class ext/mods/gameserver/scripting/Quest
       273: astore_2
       274: aload_2
       275: aload_0
       276: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       279: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       282: invokevirtual #749                // Method ext/mods/gameserver/scripting/Quest.onOutOfTerritory:(Lext/mods/gameserver/model/actor/Npc;)V
       285: goto          255
       288: aload_0
       289: getfield      #752                // Field _clearAggroTask:Ljava/util/concurrent/ScheduledFuture;
       292: ifnull        311
       295: aload_0
       296: getfield      #752                // Field _clearAggroTask:Ljava/util/concurrent/ScheduledFuture;
       299: iconst_1
       300: invokeinterface #756,  2          // InterfaceMethod java/util/concurrent/ScheduledFuture.cancel:(Z)Z
       305: pop
       306: aload_0
       307: aconst_null
       308: putfield      #752                // Field _clearAggroTask:Ljava/util/concurrent/ScheduledFuture;
       311: aload_0
       312: aload_0
       313: invokedynamic #762,  0            // InvokeDynamic #4:run:(Lext/mods/gameserver/model/actor/ai/type/NpcAI;)Ljava/lang/Runnable;
       318: ldc2_w        #196                // long 100l
       321: ldc2_w        #763                // long 10000l
       324: invokestatic  #765                // Method ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
       327: putfield      #752                // Field _clearAggroTask:Ljava/util/concurrent/ScheduledFuture;
       330: aload_0
       331: iconst_1
       332: putfield      #743                // Field _isOOT:Z
       335: goto          366
       338: aload_0
       339: iconst_0
       340: putfield      #743                // Field _isOOT:Z
       343: aload_0
       344: getfield      #752                // Field _clearAggroTask:Ljava/util/concurrent/ScheduledFuture;
       347: ifnull        366
       350: aload_0
       351: getfield      #752                // Field _clearAggroTask:Ljava/util/concurrent/ScheduledFuture;
       354: iconst_1
       355: invokeinterface #756,  2          // InterfaceMethod java/util/concurrent/ScheduledFuture.cancel:(Z)Z
       360: pop
       361: aload_0
       362: aconst_null
       363: putfield      #752                // Field _clearAggroTask:Ljava/util/concurrent/ScheduledFuture;
       366: aload_0
       367: getfield      #59                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
       370: invokevirtual #225                // Method ext/mods/gameserver/model/actor/ai/Intention.getType:()Lext/mods/gameserver/enums/IntentionType;
       373: getstatic     #769                // Field ext/mods/gameserver/enums/IntentionType.MOVE_ROUTE:Lext/mods/gameserver/enums/IntentionType;
       376: if_acmpeq     385
       379: aload_0
       380: iconst_0
       381: putfield      #548                // Field _isOnARoute:Z
       384: return
       385: invokestatic  #772                // Method ext/mods/gameserver/data/xml/WalkerRouteData.getInstance:()Lext/mods/gameserver/data/xml/WalkerRouteData;
       388: aload_0
       389: getfield      #59                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
       392: invokevirtual #777                // Method ext/mods/gameserver/model/actor/ai/Intention.getRouteName:()Ljava/lang/String;
       395: aload_0
       396: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       399: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       402: invokevirtual #118                // Method ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       405: invokevirtual #781                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getAlias:()Ljava/lang/String;
       408: invokevirtual #784                // Method ext/mods/gameserver/data/xml/WalkerRouteData.getWalkerRoute:(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
       411: astore_1
       412: aload_1
       413: invokeinterface #496,  1          // InterfaceMethod java/util/List.isEmpty:()Z
       418: ifeq          427
       421: aload_0
       422: iconst_0
       423: putfield      #548                // Field _isOnARoute:Z
       426: return
       427: aload_0
       428: iconst_1
       429: putfield      #548                // Field _isOnARoute:Z
       432: aload_1
       433: aload_0
       434: getfield      #788                // Field _routeIndex:I
       437: invokeinterface #502,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
       442: checkcast     #791                // class ext/mods/gameserver/model/location/WalkerLocation
       445: astore_2
       446: aload_2
       447: invokevirtual #793                // Method ext/mods/gameserver/model/location/WalkerLocation.getNpcStringId:()Lext/mods/gameserver/network/NpcStringId;
       450: ifnull        467
       453: aload_0
       454: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       457: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       460: aload_2
       461: invokevirtual #793                // Method ext/mods/gameserver/model/location/WalkerLocation.getNpcStringId:()Lext/mods/gameserver/network/NpcStringId;
       464: invokevirtual #797                // Method ext/mods/gameserver/model/actor/Npc.broadcastNpcSay:(Lext/mods/gameserver/network/NpcStringId;)V
       467: aload_2
       468: invokevirtual #801                // Method ext/mods/gameserver/model/location/WalkerLocation.getDelay:()I
       471: ifle          526
       474: aload_2
       475: invokevirtual #804                // Method ext/mods/gameserver/model/location/WalkerLocation.getSocialId:()I
       478: ifle          506
       481: aload_0
       482: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       485: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       488: new           #592                // class ext/mods/gameserver/network/serverpackets/SocialAction
       491: dup
       492: aload_0
       493: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       496: aload_2
       497: invokevirtual #804                // Method ext/mods/gameserver/model/location/WalkerLocation.getSocialId:()I
       500: invokespecial #597                // Method ext/mods/gameserver/network/serverpackets/SocialAction."<init>":(Lext/mods/gameserver/model/actor/Creature;I)V
       503: invokevirtual #599                // Method ext/mods/gameserver/model/actor/Npc.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       506: invokestatic  #807                // Method ext/mods/gameserver/taskmanager/WalkerTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/WalkerTaskManager;
       509: aload_0
       510: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       513: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       516: aload_2
       517: invokevirtual #801                // Method ext/mods/gameserver/model/location/WalkerLocation.getDelay:()I
       520: invokevirtual #812                // Method ext/mods/gameserver/taskmanager/WalkerTaskManager.add:(Lext/mods/gameserver/model/actor/Npc;I)V
       523: goto          530
       526: aload_0
       527: invokevirtual #687                // Method moveToNextPoint:()V
       530: return
      LineNumberTable:
        line 491: 0
        line 493: 13
        line 494: 22
        line 497: 23
        line 499: 68
        line 500: 109
        line 502: 153
        line 503: 157
        line 505: 160
        line 508: 161
        line 509: 187
        line 511: 213
        line 512: 226
        line 513: 233
        line 514: 274
        line 516: 288
        line 517: 295
        line 518: 306
        line 521: 311
        line 528: 330
        line 531: 338
        line 532: 343
        line 533: 350
        line 534: 361
        line 538: 366
        line 539: 379
        line 540: 384
        line 543: 385
        line 544: 412
        line 545: 421
        line 546: 426
        line 549: 427
        line 550: 432
        line 551: 446
        line 552: 467
        line 553: 474
        line 554: 506
        line 555: 526
        line 556: 530
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          109      41     2 quest   Lext/mods/gameserver/scripting/Quest;
          274      11     2 quest   Lext/mods/gameserver/scripting/Quest;
            0     531     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI;
          412     119     1 route   Ljava/util/List;
          446      85     2  node   Lext/mods/gameserver/model/location/WalkerLocation;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0     531     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI<TT;>;
          412     119     1 route   Ljava/util/List<Lext/mods/gameserver/model/location/WalkerLocation;>;
      StackMapTable: number_of_entries = 18
        frame_type = 23 /* same */
        frame_type = 44 /* same */
        frame_type = 252 /* append */
          offset_delta = 21
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 62
        frame_type = 6 /* same */
        frame_type = 0 /* same */
        frame_type = 51 /* same */
        frame_type = 252 /* append */
          offset_delta = 41
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 32
        frame_type = 22 /* same */
        frame_type = 26 /* same */
        frame_type = 27 /* same */
        frame_type = 18 /* same */
        frame_type = 252 /* append */
          offset_delta = 41
          locals = [ class java/util/List ]
        frame_type = 252 /* append */
          offset_delta = 39
          locals = [ class ext/mods/gameserver/model/location/WalkerLocation ]
        frame_type = 38 /* same */
        frame_type = 19 /* same */
        frame_type = 3 /* same */

  protected void onEvtArrivedBlocked();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=1, args_size=1
         0: getstatic     #721                // Field ext/mods/gameserver/model/actor/ai/type/NpcAI$1.$SwitchMap$ext$mods$gameserver$enums$IntentionType:[I
         3: aload_0
         4: getfield      #59                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
         7: invokevirtual #225                // Method ext/mods/gameserver/model/actor/ai/Intention.getType:()Lext/mods/gameserver/enums/IntentionType;
        10: invokevirtual #727                // Method ext/mods/gameserver/enums/IntentionType.ordinal:()I
        13: iaload
        14: tableswitch   { // 1 to 3

                       1: 40

                       2: 40

                       3: 40
                 default: 44
            }
        40: aload_0
        41: invokevirtual #576                // Method clearCurrentDesire:()V
        44: aload_0
        45: invokespecial #816                // Method ext/mods/gameserver/model/actor/ai/type/CreatureAI.onEvtArrivedBlocked:()V
        48: return
      LineNumberTable:
        line 561: 0
        line 563: 40
        line 566: 44
        line 567: 48
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      49     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      49     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI<TT;>;
      StackMapTable: number_of_entries = 2
        frame_type = 40 /* same */
        frame_type = 3 /* same */

  protected void onEvtFinishedCasting();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: iconst_0
         2: invokevirtual #819                // Method runAI:(Z)V
         5: return
      LineNumberTable:
        line 572: 0
        line 573: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI<TT;>;

  protected void onEvtTeleported();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=0, locals=1, args_size=1
         0: return
      LineNumberTable:
        line 578: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI<TT;>;

  public void setBackToPeace();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #38                 // Field _aggroList:Lext/mods/gameserver/model/actor/container/attackable/AggroList;
         4: invokevirtual #822                // Method ext/mods/gameserver/model/actor/container/attackable/AggroList.clear:()V
         7: aload_0
         8: getfield      #45                 // Field _hateList:Lext/mods/gameserver/model/actor/container/attackable/HateList;
        11: invokevirtual #823                // Method ext/mods/gameserver/model/actor/container/attackable/HateList.clear:()V
        14: return
      LineNumberTable:
        line 583: 0
        line 584: 7
        line 585: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI<TT;>;

  public final ext.mods.gameserver.model.actor.container.attackable.AggroList getAggroList();
    descriptor: ()Lext/mods/gameserver/model/actor/container/attackable/AggroList;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #38                 // Field _aggroList:Lext/mods/gameserver/model/actor/container/attackable/AggroList;
         4: areturn
      LineNumberTable:
        line 589: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI<TT;>;

  public final ext.mods.gameserver.model.actor.container.attackable.HateList getHateList();
    descriptor: ()Lext/mods/gameserver/model/actor/container/attackable/HateList;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #45                 // Field _hateList:Lext/mods/gameserver/model/actor/container/attackable/HateList;
         4: areturn
      LineNumberTable:
        line 594: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI<TT;>;

  public int getRouteIndex();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #788                // Field _routeIndex:I
         4: ireturn
      LineNumberTable:
        line 599: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI<TT;>;

  public boolean isReversePath();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #824                // Field _isReversePath:Z
         4: ireturn
      LineNumberTable:
        line 604: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI<TT;>;

  public int getLifeTime();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #827                // Field _lifeTime:I
         4: ireturn
      LineNumberTable:
        line 609: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI<TT;>;

  public void resetLifeTime();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: iconst_0
         2: putfield      #827                // Field _lifeTime:I
         5: return
      LineNumberTable:
        line 614: 0
        line 615: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI<TT;>;

  public ext.mods.gameserver.model.actor.Creature getTopDesireTarget();
    descriptor: ()Lext/mods/gameserver/model/actor/Creature;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #830                // Field _topDesireTarget:Lext/mods/gameserver/model/actor/Creature;
         4: areturn
      LineNumberTable:
        line 619: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI<TT;>;

  public void setTopDesireTarget(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #830                // Field _topDesireTarget:Lext/mods/gameserver/model/actor/Creature;
         5: return
      LineNumberTable:
        line 624: 0
        line 625: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI;
            0       6     1 target   Lext/mods/gameserver/model/actor/Creature;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI<TT;>;

  public void runAI();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: iconst_1
         2: invokevirtual #819                // Method runAI:(Z)V
         5: return
      LineNumberTable:
        line 629: 0
        line 630: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI<TT;>;

  public void runAI(boolean);
    descriptor: (Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=7, args_size=2
         0: aload_0
         1: getfield      #833                // Field _lastDesire:Lext/mods/gameserver/model/actor/ai/Desire;
         4: ifnull        34
         7: aload_0
         8: getfield      #833                // Field _lastDesire:Lext/mods/gameserver/model/actor/ai/Desire;
        11: invokevirtual #837                // Method ext/mods/gameserver/model/actor/ai/Desire.getType:()Lext/mods/gameserver/enums/IntentionType;
        14: getstatic     #840                // Field ext/mods/gameserver/enums/IntentionType.IDLE:Lext/mods/gameserver/enums/IntentionType;
        17: if_acmpne     34
        20: aload_0
        21: invokevirtual #843                // Method getDesires:()Ljava/util/Set;
        24: aload_0
        25: getfield      #833                // Field _lastDesire:Lext/mods/gameserver/model/actor/ai/Desire;
        28: invokeinterface #847,  2          // InterfaceMethod java/util/Set.remove:(Ljava/lang/Object;)Z
        33: pop
        34: iload_1
        35: ifeq          84
        38: aload_0
        39: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        42: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
        45: invokevirtual #118                // Method ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
        48: getstatic     #850                // Field ext/mods/gameserver/enums/EventHandler.SEE_CREATURE:Lext/mods/gameserver/enums/EventHandler;
        51: invokevirtual #567                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getEventQuests:(Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
        54: astore_2
        55: aload_2
        56: invokeinterface #496,  1          // InterfaceMethod java/util/List.isEmpty:()Z
        61: ifne          84
        64: aload_0
        65: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        68: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
        71: ldc_w         #853                // class ext/mods/gameserver/model/actor/Playable
        74: aload_0
        75: aload_2
        76: invokedynamic #855,  0            // InvokeDynamic #5:accept:(Lext/mods/gameserver/model/actor/ai/type/NpcAI;Ljava/util/List;)Ljava/util/function/Consumer;
        81: invokevirtual #859                // Method ext/mods/gameserver/model/actor/Npc.forEachKnownType:(Ljava/lang/Class;Ljava/util/function/Consumer;)V
        84: aload_0
        85: getfield      #24                 // Field _desireQueue:Lext/mods/gameserver/model/actor/ai/DesireQueue;
        88: invokevirtual #863                // Method ext/mods/gameserver/model/actor/ai/DesireQueue.getDesires:()Ljava/util/Set;
        91: aload_0
        92: invokedynamic #864,  0            // InvokeDynamic #6:test:(Lext/mods/gameserver/model/actor/ai/type/NpcAI;)Ljava/util/function/Predicate;
        97: invokeinterface #867,  2          // InterfaceMethod java/util/Set.removeIf:(Ljava/util/function/Predicate;)Z
       102: pop
       103: aload_0
       104: getfield      #24                 // Field _desireQueue:Lext/mods/gameserver/model/actor/ai/DesireQueue;
       107: invokevirtual #863                // Method ext/mods/gameserver/model/actor/ai/DesireQueue.getDesires:()Ljava/util/Set;
       110: aload_0
       111: invokedynamic #871,  0            // InvokeDynamic #7:test:(Lext/mods/gameserver/model/actor/ai/type/NpcAI;)Ljava/util/function/Predicate;
       116: invokeinterface #867,  2          // InterfaceMethod java/util/Set.removeIf:(Ljava/util/function/Predicate;)Z
       121: pop
       122: aload_0
       123: getfield      #24                 // Field _desireQueue:Lext/mods/gameserver/model/actor/ai/DesireQueue;
       126: invokevirtual #863                // Method ext/mods/gameserver/model/actor/ai/DesireQueue.getDesires:()Ljava/util/Set;
       129: aload_0
       130: invokedynamic #872,  0            // InvokeDynamic #8:test:(Lext/mods/gameserver/model/actor/ai/type/NpcAI;)Ljava/util/function/Predicate;
       135: invokeinterface #867,  2          // InterfaceMethod java/util/Set.removeIf:(Ljava/util/function/Predicate;)Z
       140: pop
       141: aload_0
       142: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       145: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       148: invokevirtual #873                // Method ext/mods/gameserver/model/actor/Npc.isOutOfControl:()Z
       151: ifne          614
       154: aload_0
       155: getfield      #827                // Field _lifeTime:I
       158: ifne          187
       161: aload_0
       162: invokevirtual #843                // Method getDesires:()Ljava/util/Set;
       165: invokeinterface #876,  1          // InterfaceMethod java/util/Set.stream:()Ljava/util/stream/Stream;
       170: invokedynamic #877,  0            // InvokeDynamic #9:test:()Ljava/util/function/Predicate;
       175: invokeinterface #878,  2          // InterfaceMethod java/util/stream/Stream.anyMatch:(Ljava/util/function/Predicate;)Z
       180: ifeq          187
       183: iconst_1
       184: goto          188
       187: iconst_0
       188: istore_2
       189: aload_0
       190: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       193: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       196: invokevirtual #281                // Method ext/mods/gameserver/model/actor/Npc.getCast:()Lext/mods/gameserver/model/actor/cast/NpcCast;
       199: invokevirtual #285                // Method ext/mods/gameserver/model/actor/cast/NpcCast.isCastingNow:()Z
       202: ifne          614
       205: aload_0
       206: getfield      #827                // Field _lifeTime:I
       209: ifgt          216
       212: iload_2
       213: ifeq          614
       216: aload_0
       217: getfield      #588                // Field _lastSocialBroadcast:J
       220: invokestatic  #579                // Method java/lang/System.currentTimeMillis:()J
       223: lcmp
       224: ifgt          614
       227: aload_0
       228: getfield      #59                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
       231: invokevirtual #225                // Method ext/mods/gameserver/model/actor/ai/Intention.getType:()Lext/mods/gameserver/enums/IntentionType;
       234: getstatic     #881                // Field ext/mods/gameserver/enums/IntentionType.FLEE:Lext/mods/gameserver/enums/IntentionType;
       237: if_acmpne     256
       240: aload_0
       241: invokevirtual #843                // Method getDesires:()Ljava/util/Set;
       244: aload_0
       245: getfield      #59                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
       248: invokeinterface #884,  2          // InterfaceMethod java/util/Set.contains:(Ljava/lang/Object;)Z
       253: ifne          614
       256: aload_0
       257: invokevirtual #843                // Method getDesires:()Ljava/util/Set;
       260: invokeinterface #887,  1          // InterfaceMethod java/util/Set.isEmpty:()Z
       265: ifeq          397
       268: aload_0
       269: getfield      #888                // Field _nextDesire:Lext/mods/gameserver/model/actor/ai/Desire;
       272: ifnonnull     397
       275: aload_0
       276: getfield      #59                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
       279: invokevirtual #225                // Method ext/mods/gameserver/model/actor/ai/Intention.getType:()Lext/mods/gameserver/enums/IntentionType;
       282: getstatic     #538                // Field ext/mods/gameserver/enums/IntentionType.ATTACK:Lext/mods/gameserver/enums/IntentionType;
       285: if_acmpne     377
       288: aload_0
       289: getfield      #59                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
       292: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/ai/Intention.getFinalTarget:()Lext/mods/gameserver/model/actor/Creature;
       295: astore_3
       296: aload_3
       297: ifnull        377
       300: aload_3
       301: invokevirtual #69                 // Method ext/mods/gameserver/model/actor/Creature.isAlikeDead:()Z
       304: ifne          377
       307: aload_0
       308: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       311: astore        5
       313: aload         5
       315: instanceof    #53                 // class ext/mods/gameserver/model/actor/Npc
       318: ifeq          377
       321: aload         5
       323: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       326: astore        4
       328: aload         4
       330: invokevirtual #118                // Method ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       333: invokevirtual #122                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getAggroRange:()I
       336: ifle          350
       339: aload         4
       341: invokevirtual #118                // Method ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       344: invokevirtual #122                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getAggroRange:()I
       347: goto          355
       350: aload         4
       352: invokevirtual #127                // Method ext/mods/gameserver/model/actor/Npc.getSeeRange:()I
       355: istore        5
       357: aload_0
       358: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       361: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       364: aload_3
       365: iload         5
       367: bipush        100
       369: iadd
       370: invokevirtual #130                // Method ext/mods/gameserver/model/actor/Npc.isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
       373: ifeq          377
       376: return
       377: aload_0
       378: getfield      #59                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
       381: invokevirtual #225                // Method ext/mods/gameserver/model/actor/ai/Intention.getType:()Lext/mods/gameserver/enums/IntentionType;
       384: getstatic     #840                // Field ext/mods/gameserver/enums/IntentionType.IDLE:Lext/mods/gameserver/enums/IntentionType;
       387: if_acmpeq     614
       390: aload_0
       391: invokevirtual #95                 // Method doIdleIntention:()V
       394: goto          614
       397: aload_0
       398: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       401: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       404: invokevirtual #264                // Method ext/mods/gameserver/model/actor/Npc.getAttack:()Lext/mods/gameserver/model/actor/attack/NpcAttack;
       407: invokevirtual #268                // Method ext/mods/gameserver/model/actor/attack/NpcAttack.isAttackingNow:()Z
       410: ifne          614
       413: aload_0
       414: getfield      #888                // Field _nextDesire:Lext/mods/gameserver/model/actor/ai/Desire;
       417: ifnull        427
       420: aload_0
       421: getfield      #888                // Field _nextDesire:Lext/mods/gameserver/model/actor/ai/Desire;
       424: goto          434
       427: aload_0
       428: getfield      #24                 // Field _desireQueue:Lext/mods/gameserver/model/actor/ai/DesireQueue;
       431: invokevirtual #891                // Method ext/mods/gameserver/model/actor/ai/DesireQueue.getLast:()Lext/mods/gameserver/model/actor/ai/Desire;
       434: astore_3
       435: aload_3
       436: ifnull        614
       439: aload_0
       440: getfield      #59                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
       443: invokevirtual #225                // Method ext/mods/gameserver/model/actor/ai/Intention.getType:()Lext/mods/gameserver/enums/IntentionType;
       446: getstatic     #895                // Field ext/mods/gameserver/enums/IntentionType.WANDER:Lext/mods/gameserver/enums/IntentionType;
       449: if_acmpne     462
       452: aload_3
       453: invokevirtual #837                // Method ext/mods/gameserver/model/actor/ai/Desire.getType:()Lext/mods/gameserver/enums/IntentionType;
       456: getstatic     #895                // Field ext/mods/gameserver/enums/IntentionType.WANDER:Lext/mods/gameserver/enums/IntentionType;
       459: if_acmpeq     614
       462: aload_3
       463: invokevirtual #837                // Method ext/mods/gameserver/model/actor/ai/Desire.getType:()Lext/mods/gameserver/enums/IntentionType;
       466: getstatic     #538                // Field ext/mods/gameserver/enums/IntentionType.ATTACK:Lext/mods/gameserver/enums/IntentionType;
       469: if_acmpne     525
       472: aload_0
       473: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       476: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       479: invokevirtual #147                // Method ext/mods/gameserver/model/actor/Npc.getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
       482: astore        5
       484: aload         5
       486: instanceof    #898                // class ext/mods/gameserver/model/actor/move/NpcMove
       489: ifeq          525
       492: aload         5
       494: checkcast     #898                // class ext/mods/gameserver/model/actor/move/NpcMove
       497: astore        4
       499: aload_3
       500: invokevirtual #900                // Method ext/mods/gameserver/model/actor/ai/Desire.getFinalTarget:()Lext/mods/gameserver/model/actor/Creature;
       503: astore        5
       505: aload         5
       507: ifnull        525
       510: aload_0
       511: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       514: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       517: invokevirtual #104                // Method ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
       520: invokevirtual #108                // Method ext/mods/gameserver/model/actor/status/NpcStatus.getPhysicalAttackRange:()I
       523: istore        6
       525: aload_3
       526: invokevirtual #837                // Method ext/mods/gameserver/model/actor/ai/Desire.getType:()Lext/mods/gameserver/enums/IntentionType;
       529: getstatic     #538                // Field ext/mods/gameserver/enums/IntentionType.ATTACK:Lext/mods/gameserver/enums/IntentionType;
       532: if_acmpne     576
       535: aload_0
       536: getfield      #833                // Field _lastDesire:Lext/mods/gameserver/model/actor/ai/Desire;
       539: ifnull        568
       542: aload_0
       543: getfield      #833                // Field _lastDesire:Lext/mods/gameserver/model/actor/ai/Desire;
       546: invokevirtual #837                // Method ext/mods/gameserver/model/actor/ai/Desire.getType:()Lext/mods/gameserver/enums/IntentionType;
       549: getstatic     #895                // Field ext/mods/gameserver/enums/IntentionType.WANDER:Lext/mods/gameserver/enums/IntentionType;
       552: if_acmpeq     568
       555: aload_0
       556: getfield      #833                // Field _lastDesire:Lext/mods/gameserver/model/actor/ai/Desire;
       559: invokevirtual #837                // Method ext/mods/gameserver/model/actor/ai/Desire.getType:()Lext/mods/gameserver/enums/IntentionType;
       562: getstatic     #840                // Field ext/mods/gameserver/enums/IntentionType.IDLE:Lext/mods/gameserver/enums/IntentionType;
       565: if_acmpne     576
       568: aload_0
       569: aload_3
       570: putfield      #888                // Field _nextDesire:Lext/mods/gameserver/model/actor/ai/Desire;
       573: goto          581
       576: aload_0
       577: aconst_null
       578: putfield      #888                // Field _nextDesire:Lext/mods/gameserver/model/actor/ai/Desire;
       581: aload_3
       582: invokevirtual #837                // Method ext/mods/gameserver/model/actor/ai/Desire.getType:()Lext/mods/gameserver/enums/IntentionType;
       585: getstatic     #769                // Field ext/mods/gameserver/enums/IntentionType.MOVE_ROUTE:Lext/mods/gameserver/enums/IntentionType;
       588: if_acmpeq     596
       591: aload_0
       592: iconst_0
       593: putfield      #548                // Field _isOnARoute:Z
       596: aload_0
       597: aload_3
       598: invokevirtual #901                // Method doIntention:(Lext/mods/gameserver/model/actor/ai/Intention;)V
       601: aload_0
       602: aload_3
       603: invokevirtual #900                // Method ext/mods/gameserver/model/actor/ai/Desire.getFinalTarget:()Lext/mods/gameserver/model/actor/Creature;
       606: putfield      #830                // Field _topDesireTarget:Lext/mods/gameserver/model/actor/Creature;
       609: aload_0
       610: aload_3
       611: putfield      #833                // Field _lastDesire:Lext/mods/gameserver/model/actor/ai/Desire;
       614: iload_1
       615: ifeq          764
       618: aload_0
       619: invokevirtual #843                // Method getDesires:()Ljava/util/Set;
       622: invokeinterface #887,  1          // InterfaceMethod java/util/Set.isEmpty:()Z
       627: ifeq          662
       630: aload_0
       631: getfield      #827                // Field _lifeTime:I
       634: ifle          662
       637: aload_0
       638: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       641: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       644: invokevirtual #281                // Method ext/mods/gameserver/model/actor/Npc.getCast:()Lext/mods/gameserver/model/actor/cast/NpcCast;
       647: invokevirtual #285                // Method ext/mods/gameserver/model/actor/cast/NpcCast.isCastingNow:()Z
       650: ifne          662
       653: aload_0
       654: invokevirtual #904                // Method thinkIdle:()V
       657: aload_0
       658: aconst_null
       659: putfield      #830                // Field _topDesireTarget:Lext/mods/gameserver/model/actor/Creature;
       662: aload_0
       663: dup
       664: getfield      #603                // Field _runAiStep:I
       667: iconst_1
       668: iadd
       669: putfield      #603                // Field _runAiStep:I
       672: aload_0
       673: dup
       674: getfield      #827                // Field _lifeTime:I
       677: iconst_1
       678: iadd
       679: putfield      #827                // Field _lifeTime:I
       682: aload_0
       683: getfield      #603                // Field _runAiStep:I
       686: iconst_3
       687: irem
       688: ifne          764
       691: aload_0
       692: getfield      #38                 // Field _aggroList:Lext/mods/gameserver/model/actor/container/attackable/AggroList;
       695: invokevirtual #907                // Method ext/mods/gameserver/model/actor/container/attackable/AggroList.refresh:()V
       698: aload_0
       699: getfield      #45                 // Field _hateList:Lext/mods/gameserver/model/actor/container/attackable/HateList;
       702: invokevirtual #910                // Method ext/mods/gameserver/model/actor/container/attackable/HateList.refresh:()V
       705: aload_0
       706: getfield      #38                 // Field _aggroList:Lext/mods/gameserver/model/actor/container/attackable/AggroList;
       709: ldc2_w        #911                // double 6.6d
       712: invokevirtual #913                // Method ext/mods/gameserver/model/actor/container/attackable/AggroList.reduceAllHate:(D)V
       715: aload_0
       716: getfield      #24                 // Field _desireQueue:Lext/mods/gameserver/model/actor/ai/DesireQueue;
       719: invokevirtual #917                // Method ext/mods/gameserver/model/actor/ai/DesireQueue.autoDecreaseWeight:()V
       722: aload_0
       723: getfield      #59                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
       726: invokevirtual #225                // Method ext/mods/gameserver/model/actor/ai/Intention.getType:()Lext/mods/gameserver/enums/IntentionType;
       729: getstatic     #538                // Field ext/mods/gameserver/enums/IntentionType.ATTACK:Lext/mods/gameserver/enums/IntentionType;
       732: if_acmpeq     748
       735: aload_0
       736: getfield      #59                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
       739: invokevirtual #225                // Method ext/mods/gameserver/model/actor/ai/Intention.getType:()Lext/mods/gameserver/enums/IntentionType;
       742: getstatic     #920                // Field ext/mods/gameserver/enums/IntentionType.CAST:Lext/mods/gameserver/enums/IntentionType;
       745: if_acmpne     759
       748: aload_0
       749: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       752: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       755: iconst_1
       756: invokevirtual #606                // Method ext/mods/gameserver/model/actor/Npc.setWalkOrRun:(Z)V
       759: aload_0
       760: iconst_0
       761: putfield      #603                // Field _runAiStep:I
       764: return
      LineNumberTable:
        line 634: 0
        line 635: 20
        line 637: 34
        line 639: 38
        line 640: 55
        line 643: 64
        line 681: 84
        line 682: 103
        line 694: 122
        line 696: 141
        line 697: 154
        line 698: 189
        line 699: 227
        line 700: 256
        line 701: 275
        line 702: 288
        line 703: 296
        line 704: 328
        line 705: 357
        line 706: 376
        line 710: 377
        line 711: 397
        line 712: 413
        line 713: 435
        line 714: 462
        line 715: 499
        line 716: 505
        line 717: 510
        line 720: 525
        line 721: 568
        line 722: 576
        line 723: 581
        line 724: 596
        line 725: 601
        line 726: 609
        line 733: 614
        line 734: 618
        line 735: 653
        line 736: 657
        line 738: 662
        line 739: 672
        line 740: 682
        line 741: 691
        line 742: 698
        line 743: 705
        line 744: 715
        line 745: 722
        line 746: 748
        line 747: 759
        line 750: 764
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           55      29     2 scripts   Ljava/util/List;
          357      20     5 aggroRange   I
          328      49     4   npc   Lext/mods/gameserver/model/actor/Npc;
          296      81     3 target   Lext/mods/gameserver/model/actor/Creature;
          505      20     5 target   Lext/mods/gameserver/model/actor/Creature;
          499      26     4 npcMove   Lext/mods/gameserver/model/actor/move/NpcMove;
          435     179     3 toDoDesire   Lext/mods/gameserver/model/actor/ai/Desire;
          189     425     2 instantRun   Z
            0     765     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI;
            0     765     1 updateTick   Z
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           55      29     2 scripts   Ljava/util/List<Lext/mods/gameserver/scripting/Quest;>;
            0     765     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI<TT;>;
      StackMapTable: number_of_entries = 23
        frame_type = 34 /* same */
        frame_type = 49 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 102
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 27
          locals = [ int ]
        frame_type = 39 /* same */
        frame_type = 253 /* append */
          offset_delta = 93
          locals = [ class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/model/actor/Npc ]
        frame_type = 68 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 249 /* chop */
          offset_delta = 21
        frame_type = 19 /* same */
        frame_type = 29 /* same */
        frame_type = 70 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/actor/ai/Desire ]
        frame_type = 252 /* append */
          offset_delta = 27
          locals = [ class ext/mods/gameserver/model/actor/ai/Desire ]
        frame_type = 62 /* same */
        frame_type = 42 /* same */
        frame_type = 7 /* same */
        frame_type = 4 /* same */
        frame_type = 14 /* same */
        frame_type = 249 /* chop */
          offset_delta = 17
        frame_type = 47 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 85
        frame_type = 10 /* same */
        frame_type = 4 /* same */

  public void moveToNextPoint();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=3, args_size=1
         0: aload_0
         1: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
         7: invokevirtual #684                // Method ext/mods/gameserver/model/actor/Npc.getNpcId:()I
        10: sipush        32108
        13: if_icmpne     285
        16: invokestatic  #772                // Method ext/mods/gameserver/data/xml/WalkerRouteData.getInstance:()Lext/mods/gameserver/data/xml/WalkerRouteData;
        19: aload_0
        20: getfield      #59                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        23: invokevirtual #777                // Method ext/mods/gameserver/model/actor/ai/Intention.getRouteName:()Ljava/lang/String;
        26: aload_0
        27: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        30: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
        33: invokevirtual #118                // Method ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
        36: invokevirtual #781                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getAlias:()Ljava/lang/String;
        39: invokevirtual #784                // Method ext/mods/gameserver/data/xml/WalkerRouteData.getWalkerRoute:(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
        42: astore_1
        43: aload_1
        44: invokeinterface #496,  1          // InterfaceMethod java/util/List.isEmpty:()Z
        49: ifeq          58
        52: aload_0
        53: iconst_0
        54: putfield      #548                // Field _isOnARoute:Z
        57: return
        58: aload_0
        59: getfield      #548                // Field _isOnARoute:Z
        62: ifne          127
        65: aload_1
        66: invokeinterface #411,  1          // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
        71: aload_0
        72: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        75: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
        78: dup
        79: invokestatic  #923                // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        82: pop
        83: invokedynamic #929,  0            // InvokeDynamic #10:applyAsDouble:(Lext/mods/gameserver/model/actor/Npc;)Ljava/util/function/ToDoubleFunction;
        88: invokestatic  #933                // InterfaceMethod java/util/Comparator.comparingDouble:(Ljava/util/function/ToDoubleFunction;)Ljava/util/Comparator;
        91: invokeinterface #939,  2          // InterfaceMethod java/util/stream/Stream.min:(Ljava/util/Comparator;)Ljava/util/Optional;
        96: aconst_null
        97: invokevirtual #943                // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
       100: checkcast     #791                // class ext/mods/gameserver/model/location/WalkerLocation
       103: astore_2
       104: aload_2
       105: ifnull        262
       108: aload_0
       109: iconst_1
       110: putfield      #548                // Field _isOnARoute:Z
       113: aload_0
       114: aload_1
       115: aload_2
       116: invokeinterface #948,  2          // InterfaceMethod java/util/List.indexOf:(Ljava/lang/Object;)I
       121: putfield      #788                // Field _routeIndex:I
       124: goto          262
       127: aload_0
       128: getfield      #824                // Field _isReversePath:Z
       131: ifeq          166
       134: aload_0
       135: getfield      #788                // Field _routeIndex:I
       138: ifle          166
       141: aload_0
       142: dup
       143: getfield      #788                // Field _routeIndex:I
       146: iconst_1
       147: isub
       148: putfield      #788                // Field _routeIndex:I
       151: aload_0
       152: getfield      #788                // Field _routeIndex:I
       155: ifne          248
       158: aload_0
       159: iconst_0
       160: putfield      #824                // Field _isReversePath:Z
       163: goto          248
       166: aload_0
       167: getfield      #788                // Field _routeIndex:I
       170: aload_1
       171: invokeinterface #499,  1          // InterfaceMethod java/util/List.size:()I
       176: iconst_1
       177: isub
       178: if_icmpge     194
       181: aload_0
       182: dup
       183: getfield      #788                // Field _routeIndex:I
       186: iconst_1
       187: iadd
       188: putfield      #788                // Field _routeIndex:I
       191: goto          248
       194: aload_0
       195: iconst_0
       196: putfield      #788                // Field _routeIndex:I
       199: invokestatic  #134                // Method ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
       202: aload_0
       203: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       206: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       209: invokevirtual #333                // Method ext/mods/gameserver/model/actor/Npc.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
       212: aload_1
       213: aload_0
       214: getfield      #788                // Field _routeIndex:I
       217: invokeinterface #502,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
       222: checkcast     #533                // class ext/mods/gameserver/model/location/Location
       225: invokevirtual #952                // Method ext/mods/gameserver/geoengine/GeoEngine.canMoveToTarget:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Z
       228: ifne          248
       231: aload_0
       232: iconst_1
       233: putfield      #824                // Field _isReversePath:Z
       236: aload_0
       237: aload_1
       238: invokeinterface #499,  1          // InterfaceMethod java/util/List.size:()I
       243: iconst_2
       244: isub
       245: putfield      #788                // Field _routeIndex:I
       248: aload_1
       249: aload_0
       250: getfield      #788                // Field _routeIndex:I
       253: invokeinterface #502,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
       258: checkcast     #791                // class ext/mods/gameserver/model/location/WalkerLocation
       261: astore_2
       262: aload_0
       263: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       266: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       269: invokevirtual #147                // Method ext/mods/gameserver/model/actor/Npc.getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
       272: aload_2
       273: sipush        500
       276: iconst_0
       277: iconst_0
       278: invokevirtual #626                // Method ext/mods/gameserver/model/actor/move/CreatureMove.maybeMoveToLocation:(Lext/mods/gameserver/model/location/Location;IZZ)Z
       281: pop
       282: goto          625
       285: aload_0
       286: getfield      #59                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
       289: invokevirtual #225                // Method ext/mods/gameserver/model/actor/ai/Intention.getType:()Lext/mods/gameserver/enums/IntentionType;
       292: getstatic     #769                // Field ext/mods/gameserver/enums/IntentionType.MOVE_ROUTE:Lext/mods/gameserver/enums/IntentionType;
       295: if_acmpeq     304
       298: aload_0
       299: iconst_0
       300: putfield      #548                // Field _isOnARoute:Z
       303: return
       304: invokestatic  #772                // Method ext/mods/gameserver/data/xml/WalkerRouteData.getInstance:()Lext/mods/gameserver/data/xml/WalkerRouteData;
       307: aload_0
       308: getfield      #59                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
       311: invokevirtual #777                // Method ext/mods/gameserver/model/actor/ai/Intention.getRouteName:()Ljava/lang/String;
       314: aload_0
       315: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       318: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       321: invokevirtual #118                // Method ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       324: invokevirtual #781                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getAlias:()Ljava/lang/String;
       327: invokevirtual #784                // Method ext/mods/gameserver/data/xml/WalkerRouteData.getWalkerRoute:(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
       330: astore_1
       331: aload_1
       332: invokeinterface #496,  1          // InterfaceMethod java/util/List.isEmpty:()Z
       337: ifeq          346
       340: aload_0
       341: iconst_0
       342: putfield      #548                // Field _isOnARoute:Z
       345: return
       346: aload_0
       347: getfield      #548                // Field _isOnARoute:Z
       350: ifne          415
       353: aload_1
       354: invokeinterface #411,  1          // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
       359: aload_0
       360: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       363: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       366: dup
       367: invokestatic  #923                // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
       370: pop
       371: invokedynamic #929,  0            // InvokeDynamic #10:applyAsDouble:(Lext/mods/gameserver/model/actor/Npc;)Ljava/util/function/ToDoubleFunction;
       376: invokestatic  #933                // InterfaceMethod java/util/Comparator.comparingDouble:(Ljava/util/function/ToDoubleFunction;)Ljava/util/Comparator;
       379: invokeinterface #939,  2          // InterfaceMethod java/util/stream/Stream.min:(Ljava/util/Comparator;)Ljava/util/Optional;
       384: aconst_null
       385: invokevirtual #943                // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
       388: checkcast     #791                // class ext/mods/gameserver/model/location/WalkerLocation
       391: astore_2
       392: aload_2
       393: ifnull        607
       396: aload_0
       397: iconst_1
       398: putfield      #548                // Field _isOnARoute:Z
       401: aload_0
       402: aload_1
       403: aload_2
       404: invokeinterface #948,  2          // InterfaceMethod java/util/List.indexOf:(Ljava/lang/Object;)I
       409: putfield      #788                // Field _routeIndex:I
       412: goto          607
       415: aload_0
       416: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       419: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       422: invokevirtual #147                // Method ext/mods/gameserver/model/actor/Npc.getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
       425: invokevirtual #612                // Method ext/mods/gameserver/model/actor/move/CreatureMove.getGeoPathFailCount:()I
       428: bipush        10
       430: if_icmplt     472
       433: aload_0
       434: iconst_0
       435: putfield      #788                // Field _routeIndex:I
       438: aload_0
       439: iconst_1
       440: putfield      #548                // Field _isOnARoute:Z
       443: aload_0
       444: iconst_0
       445: putfield      #824                // Field _isReversePath:Z
       448: aload_0
       449: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       452: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       455: aload_1
       456: aload_0
       457: getfield      #788                // Field _routeIndex:I
       460: invokeinterface #502,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
       465: checkcast     #533                // class ext/mods/gameserver/model/location/Location
       468: iconst_0
       469: invokevirtual #955                // Method ext/mods/gameserver/model/actor/Npc.teleportTo:(Lext/mods/gameserver/model/location/Location;I)V
       472: aload_0
       473: getfield      #824                // Field _isReversePath:Z
       476: ifeq          511
       479: aload_0
       480: getfield      #788                // Field _routeIndex:I
       483: ifle          511
       486: aload_0
       487: dup
       488: getfield      #788                // Field _routeIndex:I
       491: iconst_1
       492: isub
       493: putfield      #788                // Field _routeIndex:I
       496: aload_0
       497: getfield      #788                // Field _routeIndex:I
       500: ifne          593
       503: aload_0
       504: iconst_0
       505: putfield      #824                // Field _isReversePath:Z
       508: goto          593
       511: aload_0
       512: getfield      #788                // Field _routeIndex:I
       515: aload_1
       516: invokeinterface #499,  1          // InterfaceMethod java/util/List.size:()I
       521: iconst_1
       522: isub
       523: if_icmpge     539
       526: aload_0
       527: dup
       528: getfield      #788                // Field _routeIndex:I
       531: iconst_1
       532: iadd
       533: putfield      #788                // Field _routeIndex:I
       536: goto          593
       539: aload_0
       540: iconst_0
       541: putfield      #788                // Field _routeIndex:I
       544: invokestatic  #134                // Method ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
       547: aload_0
       548: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       551: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       554: invokevirtual #333                // Method ext/mods/gameserver/model/actor/Npc.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
       557: aload_1
       558: aload_0
       559: getfield      #788                // Field _routeIndex:I
       562: invokeinterface #502,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
       567: checkcast     #533                // class ext/mods/gameserver/model/location/Location
       570: invokevirtual #952                // Method ext/mods/gameserver/geoengine/GeoEngine.canMoveToTarget:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Z
       573: ifne          593
       576: aload_0
       577: iconst_1
       578: putfield      #824                // Field _isReversePath:Z
       581: aload_0
       582: aload_1
       583: invokeinterface #499,  1          // InterfaceMethod java/util/List.size:()I
       588: iconst_2
       589: isub
       590: putfield      #788                // Field _routeIndex:I
       593: aload_1
       594: aload_0
       595: getfield      #788                // Field _routeIndex:I
       598: invokeinterface #502,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
       603: checkcast     #791                // class ext/mods/gameserver/model/location/WalkerLocation
       606: astore_2
       607: aload_0
       608: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       611: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       614: invokevirtual #147                // Method ext/mods/gameserver/model/actor/Npc.getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
       617: aload_2
       618: iconst_0
       619: iconst_1
       620: iconst_0
       621: invokevirtual #626                // Method ext/mods/gameserver/model/actor/move/CreatureMove.maybeMoveToLocation:(Lext/mods/gameserver/model/location/Location;IZZ)Z
       624: pop
       625: return
      LineNumberTable:
        line 754: 0
        line 755: 16
        line 756: 43
        line 758: 58
        line 759: 65
        line 760: 104
        line 762: 127
        line 763: 141
        line 764: 151
        line 765: 166
        line 767: 194
        line 768: 199
        line 769: 231
        line 770: 236
        line 773: 248
        line 775: 262
        line 776: 282
        line 777: 285
        line 778: 304
        line 779: 331
        line 781: 346
        line 782: 353
        line 783: 392
        line 785: 415
        line 786: 433
        line 787: 448
        line 789: 472
        line 790: 486
        line 791: 496
        line 792: 511
        line 794: 539
        line 795: 544
        line 796: 576
        line 797: 581
        line 800: 593
        line 802: 607
        line 804: 625
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          104      23     2 nextNode   Lext/mods/gameserver/model/location/WalkerLocation;
           43     239     1 route   Ljava/util/List;
          262      20     2 nextNode   Lext/mods/gameserver/model/location/WalkerLocation;
          392      23     2 nextNode   Lext/mods/gameserver/model/location/WalkerLocation;
          331     294     1 route   Ljava/util/List;
          607      18     2 nextNode   Lext/mods/gameserver/model/location/WalkerLocation;
            0     626     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           43     239     1 route   Ljava/util/List<Lext/mods/gameserver/model/location/WalkerLocation;>;
          331     294     1 route   Ljava/util/List<Lext/mods/gameserver/model/location/WalkerLocation;>;
            0     626     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI<TT;>;
      StackMapTable: number_of_entries = 16
        frame_type = 252 /* append */
          offset_delta = 58
          locals = [ class java/util/List ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 68
        frame_type = 38 /* same */
        frame_type = 27 /* same */
        frame_type = 53 /* same */
        frame_type = 252 /* append */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/location/WalkerLocation ]
        frame_type = 249 /* chop */
          offset_delta = 22
        frame_type = 18 /* same */
        frame_type = 252 /* append */
          offset_delta = 41
          locals = [ class java/util/List ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 68
        frame_type = 56 /* same */
        frame_type = 38 /* same */
        frame_type = 27 /* same */
        frame_type = 53 /* same */
        frame_type = 252 /* append */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/location/WalkerLocation ]
        frame_type = 249 /* chop */
          offset_delta = 17

  public java.util.Set<ext.mods.gameserver.model.actor.ai.Desire> getDesires();
    descriptor: ()Ljava/util/Set;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #24                 // Field _desireQueue:Lext/mods/gameserver/model/actor/ai/DesireQueue;
         4: invokevirtual #863                // Method ext/mods/gameserver/model/actor/ai/DesireQueue.getDesires:()Ljava/util/Set;
         7: areturn
      LineNumberTable:
        line 809: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI<TT;>;
    Signature: #1280                        // ()Ljava/util/Set<Lext/mods/gameserver/model/actor/ai/Desire;>;

  public void clearCurrentDesire();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #843                // Method getDesires:()Ljava/util/Set;
         4: aload_0
         5: getfield      #59                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
         8: invokeinterface #847,  2          // InterfaceMethod java/util/Set.remove:(Ljava/lang/Object;)Z
        13: pop
        14: return
      LineNumberTable:
        line 814: 0
        line 815: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI<TT;>;

  public void addAttackDesireHold(ext.mods.gameserver.model.actor.Creature, double);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;D)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=4, args_size=3
         0: aload_0
         1: aload_1
         2: iconst_0
         3: dload_2
         4: iconst_1
         5: iconst_0
         6: invokevirtual #959                // Method addAttackDesire:(Lext/mods/gameserver/model/actor/Creature;IDZZ)V
         9: return
      LineNumberTable:
        line 817: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI;
            0      10     1 target   Lext/mods/gameserver/model/actor/Creature;
            0      10     2 weight   D
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI<TT;>;

  public void addAttackDesireHold(ext.mods.gameserver.model.actor.Creature, int, double);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;ID)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=5, args_size=4
         0: aload_0
         1: aload_1
         2: iload_2
         3: dload_3
         4: iconst_1
         5: iconst_0
         6: invokevirtual #959                // Method addAttackDesire:(Lext/mods/gameserver/model/actor/Creature;IDZZ)V
         9: return
      LineNumberTable:
        line 818: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI;
            0      10     1 target   Lext/mods/gameserver/model/actor/Creature;
            0      10     2 damage   I
            0      10     3 weight   D
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI<TT;>;

  public void addAttackDesireHold(ext.mods.gameserver.model.actor.Creature, int, double, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;IDZ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=6, args_size=5
         0: aload_0
         1: aload_1
         2: iload_2
         3: dload_3
         4: iload         5
         6: iconst_0
         7: invokevirtual #959                // Method addAttackDesire:(Lext/mods/gameserver/model/actor/Creature;IDZZ)V
        10: return
      LineNumberTable:
        line 819: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI;
            0      11     1 target   Lext/mods/gameserver/model/actor/Creature;
            0      11     2 damage   I
            0      11     3 weight   D
            0      11     5 updateAggro   Z
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI<TT;>;

  public void addAttackDesire(ext.mods.gameserver.model.actor.Creature, double);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;D)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=4, args_size=3
         0: aload_0
         1: aload_1
         2: iconst_2
         3: dload_2
         4: iconst_1
         5: invokevirtual #963                // Method addAttackDesire:(Lext/mods/gameserver/model/actor/Creature;IDZ)V
         8: return
      LineNumberTable:
        line 820: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI;
            0       9     1 target   Lext/mods/gameserver/model/actor/Creature;
            0       9     2 weight   D
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI<TT;>;

  public void addAttackDesire(ext.mods.gameserver.model.actor.Creature, int, double);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;ID)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=5, args_size=4
         0: aload_0
         1: aload_1
         2: iload_2
         3: dload_3
         4: iconst_1
         5: invokevirtual #963                // Method addAttackDesire:(Lext/mods/gameserver/model/actor/Creature;IDZ)V
         8: return
      LineNumberTable:
        line 821: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI;
            0       9     1 target   Lext/mods/gameserver/model/actor/Creature;
            0       9     2 damage   I
            0       9     3 weight   D
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI<TT;>;

  public void addAttackDesire(ext.mods.gameserver.model.actor.Creature, int, double, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;IDZ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=6, args_size=5
         0: aload_0
         1: aload_1
         2: iload_2
         3: dload_3
         4: iload         5
         6: iconst_1
         7: invokevirtual #959                // Method addAttackDesire:(Lext/mods/gameserver/model/actor/Creature;IDZZ)V
        10: return
      LineNumberTable:
        line 822: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI;
            0      11     1 target   Lext/mods/gameserver/model/actor/Creature;
            0      11     2 damage   I
            0      11     3 weight   D
            0      11     5 updateAggro   Z
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI<TT;>;

  public void addAttackDesire(ext.mods.gameserver.model.actor.Creature, int, double, boolean, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;IDZZ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=9, args_size=6
         0: aload_1
         1: ifnonnull     5
         4: return
         5: new           #838                // class ext/mods/gameserver/model/actor/ai/Desire
         8: dup
         9: dload_3
        10: invokespecial #966                // Method ext/mods/gameserver/model/actor/ai/Desire."<init>":(D)V
        13: astore        7
        15: aload         7
        17: aload_1
        18: iconst_0
        19: iconst_0
        20: iload         6
        22: invokevirtual #968                // Method ext/mods/gameserver/model/actor/ai/Desire.updateAsAttack:(Lext/mods/gameserver/model/actor/Creature;ZZZ)V
        25: aload_0
        26: getfield      #24                 // Field _desireQueue:Lext/mods/gameserver/model/actor/ai/DesireQueue;
        29: aload         7
        31: invokevirtual #972                // Method ext/mods/gameserver/model/actor/ai/DesireQueue.addOrUpdate:(Lext/mods/gameserver/model/actor/ai/Desire;)V
        34: aload_0
        35: getfield      #38                 // Field _aggroList:Lext/mods/gameserver/model/actor/container/attackable/AggroList;
        38: invokevirtual #976                // Method ext/mods/gameserver/model/actor/container/attackable/AggroList.getMostHatedCreature:()Lext/mods/gameserver/model/actor/Creature;
        41: ifnonnull     49
        44: aload_0
        45: iconst_0
        46: invokevirtual #819                // Method runAI:(Z)V
        49: aload_1
        50: instanceof    #979                // class ext/mods/gameserver/model/actor/Player
        53: ifeq          83
        56: aload_1
        57: checkcast     #979                // class ext/mods/gameserver/model/actor/Player
        60: astore        8
        62: aload         8
        64: invokevirtual #981                // Method ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
        67: invokevirtual #985                // Method ext/mods/gameserver/enums/actors/ClassId.getType:()Lext/mods/gameserver/enums/actors/ClassType;
        70: getstatic     #990                // Field ext/mods/gameserver/enums/actors/ClassType.PRIEST:Lext/mods/gameserver/enums/actors/ClassType;
        73: if_acmpne     83
        76: iload_2
        77: ifle          83
        80: iconst_1
        81: istore        5
        83: iload         5
        85: ifeq          99
        88: aload_0
        89: getfield      #38                 // Field _aggroList:Lext/mods/gameserver/model/actor/container/attackable/AggroList;
        92: aload_1
        93: iload_2
        94: i2d
        95: dload_3
        96: invokevirtual #996                // Method ext/mods/gameserver/model/actor/container/attackable/AggroList.addDamageHate:(Lext/mods/gameserver/model/actor/Creature;DD)V
        99: return
      LineNumberTable:
        line 824: 0
        line 825: 5
        line 826: 15
        line 827: 25
        line 828: 34
        line 829: 49
        line 830: 83
        line 831: 99
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           62      21     8 player   Lext/mods/gameserver/model/actor/Player;
            0     100     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI;
            0     100     1 target   Lext/mods/gameserver/model/actor/Creature;
            0     100     2 damage   I
            0     100     3 weight   D
            0     100     5 updateAggro   Z
            0     100     6 canMoveToTarget   Z
           15      85     7 desire   Lext/mods/gameserver/model/actor/ai/Desire;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0     100     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI<TT;>;
      StackMapTable: number_of_entries = 4
        frame_type = 5 /* same */
        frame_type = 252 /* append */
          offset_delta = 43
          locals = [ class ext/mods/gameserver/model/actor/ai/Desire ]
        frame_type = 33 /* same */
        frame_type = 15 /* same */

  public void addCastDesireHold(ext.mods.gameserver.model.actor.Creature, int, int, double);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;IID)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=7, args_size=5
         0: invokestatic  #1000               // Method ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
         3: iload_2
         4: iload_3
         5: invokevirtual #1005               // Method ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
         8: astore        6
        10: aload         6
        12: ifnonnull     16
        15: return
        16: aload_0
        17: aload_1
        18: aload         6
        20: dload         4
        22: iconst_1
        23: iconst_0
        24: invokevirtual #1009               // Method addCastDesire:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;DZZ)V
        27: return
      LineNumberTable:
        line 834: 0
        line 835: 10
        line 836: 16
        line 837: 27
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI;
            0      28     1 target   Lext/mods/gameserver/model/actor/Creature;
            0      28     2 skillId   I
            0      28     3 skillLevel   I
            0      28     4 weight   D
           10      18     6 skill   Lext/mods/gameserver/skills/L2Skill;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI<TT;>;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/skills/L2Skill ]

  public void addCastDesireHold(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill, double);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;D)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=5, args_size=4
         0: aload_0
         1: aload_1
         2: aload_2
         3: dload_3
         4: iconst_1
         5: iconst_0
         6: invokevirtual #1009               // Method addCastDesire:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;DZZ)V
         9: return
      LineNumberTable:
        line 838: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI;
            0      10     1 target   Lext/mods/gameserver/model/actor/Creature;
            0      10     2 skill   Lext/mods/gameserver/skills/L2Skill;
            0      10     3 weight   D
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI<TT;>;

  public void addCastDesireHold(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill, double, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;DZ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=6, args_size=5
         0: aload_0
         1: aload_1
         2: aload_2
         3: dload_3
         4: iload         5
         6: iconst_0
         7: invokevirtual #1009               // Method addCastDesire:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;DZZ)V
        10: return
      LineNumberTable:
        line 839: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI;
            0      11     1 target   Lext/mods/gameserver/model/actor/Creature;
            0      11     2 skill   Lext/mods/gameserver/skills/L2Skill;
            0      11     3 weight   D
            0      11     5 checkConditions   Z
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI<TT;>;

  public void addCastDesire(ext.mods.gameserver.model.actor.Creature, int, int, double);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;IID)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=7, args_size=5
         0: invokestatic  #1000               // Method ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
         3: iload_2
         4: iload_3
         5: invokevirtual #1005               // Method ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
         8: astore        6
        10: aload         6
        12: ifnonnull     16
        15: return
        16: aload_0
        17: aload_1
        18: aload         6
        20: dload         4
        22: invokevirtual #1013               // Method addCastDesire:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;D)V
        25: return
      LineNumberTable:
        line 841: 0
        line 842: 10
        line 843: 16
        line 844: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI;
            0      26     1 target   Lext/mods/gameserver/model/actor/Creature;
            0      26     2 skillId   I
            0      26     3 skillLevel   I
            0      26     4 weight   D
           10      16     6 skill   Lext/mods/gameserver/skills/L2Skill;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI<TT;>;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/skills/L2Skill ]

  public void addCastDesire(ext.mods.gameserver.model.actor.Creature, int, int, double, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;IIDZ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=8, args_size=6
         0: invokestatic  #1000               // Method ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
         3: iload_2
         4: iload_3
         5: invokevirtual #1005               // Method ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
         8: astore        7
        10: aload         7
        12: ifnonnull     16
        15: return
        16: aload_0
        17: aload_1
        18: aload         7
        20: dload         4
        22: iload         6
        24: invokevirtual #1016               // Method addCastDesire:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;DZ)V
        27: return
      LineNumberTable:
        line 846: 0
        line 847: 10
        line 848: 16
        line 849: 27
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI;
            0      28     1 target   Lext/mods/gameserver/model/actor/Creature;
            0      28     2 skillId   I
            0      28     3 skillLevel   I
            0      28     4 weight   D
            0      28     6 checkConditions   Z
           10      18     7 skill   Lext/mods/gameserver/skills/L2Skill;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI<TT;>;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/skills/L2Skill ]

  public void addCastDesire(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill, double);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;D)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=5, args_size=4
         0: aload_0
         1: aload_1
         2: aload_2
         3: dload_3
         4: iconst_1
         5: invokevirtual #1016               // Method addCastDesire:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;DZ)V
         8: return
      LineNumberTable:
        line 850: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI;
            0       9     1 target   Lext/mods/gameserver/model/actor/Creature;
            0       9     2 skill   Lext/mods/gameserver/skills/L2Skill;
            0       9     3 weight   D
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI<TT;>;

  public void addCastDesire(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill, double, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;DZ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=6, args_size=5
         0: aload_0
         1: aload_1
         2: aload_2
         3: dload_3
         4: iload         5
         6: iconst_1
         7: invokevirtual #1009               // Method addCastDesire:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;DZZ)V
        10: return
      LineNumberTable:
        line 851: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI;
            0      11     1 target   Lext/mods/gameserver/model/actor/Creature;
            0      11     2 skill   Lext/mods/gameserver/skills/L2Skill;
            0      11     3 weight   D
            0      11     5 checkConditions   Z
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI<TT;>;

  public void addCastDesire(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill, double, boolean, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;DZZ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=8, locals=11, args_size=6
         0: aload_1
         1: ifnull        8
         4: aload_2
         5: ifnonnull     9
         8: return
         9: iload         5
        11: ifeq          111
        14: aload_0
        15: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        18: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
        21: invokevirtual #281                // Method ext/mods/gameserver/model/actor/Npc.getCast:()Lext/mods/gameserver/model/actor/cast/NpcCast;
        24: aload_1
        25: aload_2
        26: invokevirtual #1019               // Method ext/mods/gameserver/model/actor/cast/NpcCast.canAttemptCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
        29: ifne          33
        32: return
        33: aload_0
        34: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        37: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
        40: invokevirtual #104                // Method ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
        43: aload_2
        44: invokevirtual #1023               // Method ext/mods/gameserver/model/actor/status/NpcStatus.getMpConsume:(Lext/mods/gameserver/skills/L2Skill;)I
        47: i2d
        48: dstore        7
        50: dload         7
        52: dconst_0
        53: dcmpl
        54: ifle          77
        57: dload         7
        59: aload_0
        60: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        63: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
        66: invokevirtual #104                // Method ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
        69: invokevirtual #1027               // Method ext/mods/gameserver/model/actor/status/NpcStatus.getMp:()D
        72: dcmpl
        73: ifle          77
        76: return
        77: aload_2
        78: invokevirtual #1030               // Method ext/mods/gameserver/skills/L2Skill.getHpConsume:()I
        81: i2d
        82: dstore        9
        84: dload         9
        86: dconst_0
        87: dcmpl
        88: ifle          111
        91: dload         9
        93: aload_0
        94: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        97: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       100: invokevirtual #104                // Method ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
       103: invokevirtual #1033               // Method ext/mods/gameserver/model/actor/status/NpcStatus.getHp:()D
       106: dcmpl
       107: ifle          111
       110: return
       111: iload         6
       113: ifne          153
       116: aload_0
       117: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       120: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       123: aload_1
       124: aload_2
       125: invokevirtual #1036               // Method ext/mods/gameserver/skills/L2Skill.getCastRange:()I
       128: i2d
       129: aload_0
       130: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       133: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
       136: invokevirtual #206                // Method ext/mods/gameserver/model/actor/Npc.getCollisionRadius:()D
       139: dadd
       140: aload_1
       141: invokevirtual #210                // Method ext/mods/gameserver/model/actor/Creature.getCollisionRadius:()D
       144: dadd
       145: d2i
       146: invokevirtual #622                // Method ext/mods/gameserver/model/actor/Npc.isIn2DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
       149: ifne          153
       152: return
       153: invokestatic  #134                // Method ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
       156: aload_0
       157: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       160: aload_1
       161: invokevirtual #140                // Method ext/mods/gameserver/geoengine/GeoEngine.canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
       164: ifne          168
       167: return
       168: new           #838                // class ext/mods/gameserver/model/actor/ai/Desire
       171: dup
       172: dload_3
       173: invokespecial #966                // Method ext/mods/gameserver/model/actor/ai/Desire."<init>":(D)V
       176: astore        7
       178: aload         7
       180: aload_0
       181: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       184: aload_1
       185: aload_2
       186: iconst_0
       187: iconst_0
       188: iconst_0
       189: iload         6
       191: invokevirtual #1039               // Method ext/mods/gameserver/model/actor/ai/Desire.updateAsCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZZIZ)V
       194: aload_0
       195: getfield      #24                 // Field _desireQueue:Lext/mods/gameserver/model/actor/ai/DesireQueue;
       198: aload         7
       200: invokevirtual #972                // Method ext/mods/gameserver/model/actor/ai/DesireQueue.addOrUpdate:(Lext/mods/gameserver/model/actor/ai/Desire;)V
       203: return
      LineNumberTable:
        line 853: 0
        line 854: 9
        line 855: 14
        line 856: 33
        line 857: 50
        line 858: 77
        line 859: 84
        line 861: 111
        line 862: 153
        line 863: 168
        line 864: 178
        line 865: 194
        line 866: 203
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           50      61     7 mpConsume   D
           84      27     9 hpConsume   D
            0     204     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI;
            0     204     1 target   Lext/mods/gameserver/model/actor/Creature;
            0     204     2 skill   Lext/mods/gameserver/skills/L2Skill;
            0     204     3 weight   D
            0     204     5 checkConditions   Z
            0     204     6 canMoveToTarget   Z
          178      26     7 desire   Lext/mods/gameserver/model/actor/ai/Desire;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0     204     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI<TT;>;
      StackMapTable: number_of_entries = 7
        frame_type = 8 /* same */
        frame_type = 0 /* same */
        frame_type = 23 /* same */
        frame_type = 252 /* append */
          offset_delta = 43
          locals = [ double ]
        frame_type = 250 /* chop */
          offset_delta = 33
        frame_type = 41 /* same */
        frame_type = 14 /* same */

  public void addFleeDesire(ext.mods.gameserver.model.actor.Creature, int, double);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;ID)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=6, args_size=4
         0: aload_1
         1: ifnull        17
         4: aload_0
         5: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         8: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
        11: invokevirtual #609                // Method ext/mods/gameserver/model/actor/Npc.isMovementDisabled:()Z
        14: ifeq          18
        17: return
        18: new           #838                // class ext/mods/gameserver/model/actor/ai/Desire
        21: dup
        22: dload_3
        23: invokespecial #966                // Method ext/mods/gameserver/model/actor/ai/Desire."<init>":(D)V
        26: astore        5
        28: aload         5
        30: aload_1
        31: aload_0
        32: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        35: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
        38: invokevirtual #333                // Method ext/mods/gameserver/model/actor/Npc.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
        41: iload_2
        42: invokevirtual #1043               // Method ext/mods/gameserver/model/actor/ai/Desire.updateAsFlee:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/location/Location;I)V
        45: aload_0
        46: getfield      #24                 // Field _desireQueue:Lext/mods/gameserver/model/actor/ai/DesireQueue;
        49: aload         5
        51: invokevirtual #972                // Method ext/mods/gameserver/model/actor/ai/DesireQueue.addOrUpdate:(Lext/mods/gameserver/model/actor/ai/Desire;)V
        54: return
      LineNumberTable:
        line 869: 0
        line 870: 18
        line 871: 28
        line 872: 45
        line 873: 54
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      55     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI;
            0      55     1 target   Lext/mods/gameserver/model/actor/Creature;
            0      55     2 distance   I
            0      55     3 weight   D
           28      27     5 desire   Lext/mods/gameserver/model/actor/ai/Desire;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      55     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI<TT;>;
      StackMapTable: number_of_entries = 2
        frame_type = 17 /* same */
        frame_type = 0 /* same */

  public void addFollowDesire(ext.mods.gameserver.model.actor.Creature, double);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;D)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=5, args_size=3
         0: aload_1
         1: ifnonnull     5
         4: return
         5: new           #838                // class ext/mods/gameserver/model/actor/ai/Desire
         8: dup
         9: dload_2
        10: invokespecial #966                // Method ext/mods/gameserver/model/actor/ai/Desire."<init>":(D)V
        13: astore        4
        15: aload         4
        17: aload_1
        18: iconst_0
        19: invokevirtual #1047               // Method ext/mods/gameserver/model/actor/ai/Desire.updateAsFollow:(Lext/mods/gameserver/model/actor/Creature;Z)V
        22: aload_0
        23: getfield      #24                 // Field _desireQueue:Lext/mods/gameserver/model/actor/ai/DesireQueue;
        26: aload         4
        28: invokevirtual #972                // Method ext/mods/gameserver/model/actor/ai/DesireQueue.addOrUpdate:(Lext/mods/gameserver/model/actor/ai/Desire;)V
        31: return
      LineNumberTable:
        line 876: 0
        line 877: 5
        line 878: 15
        line 879: 22
        line 880: 31
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      32     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI;
            0      32     1 target   Lext/mods/gameserver/model/actor/Creature;
            0      32     2 weight   D
           15      17     4 desire   Lext/mods/gameserver/model/actor/ai/Desire;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      32     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI<TT;>;
      StackMapTable: number_of_entries = 1
        frame_type = 5 /* same */

  public void addInteractDesire(ext.mods.gameserver.model.WorldObject, double);
    descriptor: (Lext/mods/gameserver/model/WorldObject;D)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=5, args_size=3
         0: aload_1
         1: ifnonnull     5
         4: return
         5: new           #838                // class ext/mods/gameserver/model/actor/ai/Desire
         8: dup
         9: dload_2
        10: invokespecial #966                // Method ext/mods/gameserver/model/actor/ai/Desire."<init>":(D)V
        13: astore        4
        15: aload         4
        17: aload_1
        18: iconst_0
        19: iconst_0
        20: invokevirtual #1051               // Method ext/mods/gameserver/model/actor/ai/Desire.updateAsInteract:(Lext/mods/gameserver/model/WorldObject;ZZ)V
        23: aload_0
        24: getfield      #24                 // Field _desireQueue:Lext/mods/gameserver/model/actor/ai/DesireQueue;
        27: aload         4
        29: invokevirtual #972                // Method ext/mods/gameserver/model/actor/ai/DesireQueue.addOrUpdate:(Lext/mods/gameserver/model/actor/ai/Desire;)V
        32: return
      LineNumberTable:
        line 883: 0
        line 884: 5
        line 885: 15
        line 886: 23
        line 887: 32
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      33     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI;
            0      33     1 target   Lext/mods/gameserver/model/WorldObject;
            0      33     2 weight   D
           15      18     4 desire   Lext/mods/gameserver/model/actor/ai/Desire;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      33     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI<TT;>;
      StackMapTable: number_of_entries = 1
        frame_type = 5 /* same */

  public void addMoveRouteDesire(java.lang.String, double);
    descriptor: (Ljava/lang/String;D)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=5, args_size=3
         0: new           #838                // class ext/mods/gameserver/model/actor/ai/Desire
         3: dup
         4: dload_2
         5: invokespecial #966                // Method ext/mods/gameserver/model/actor/ai/Desire."<init>":(D)V
         8: astore        4
        10: aload         4
        12: aload_1
        13: invokevirtual #1055               // Method ext/mods/gameserver/model/actor/ai/Desire.updateAsMoveRoute:(Ljava/lang/String;)V
        16: aload_0
        17: getfield      #24                 // Field _desireQueue:Lext/mods/gameserver/model/actor/ai/DesireQueue;
        20: aload         4
        22: invokevirtual #972                // Method ext/mods/gameserver/model/actor/ai/DesireQueue.addOrUpdate:(Lext/mods/gameserver/model/actor/ai/Desire;)V
        25: return
      LineNumberTable:
        line 890: 0
        line 891: 10
        line 892: 16
        line 893: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI;
            0      26     1 routeName   Ljava/lang/String;
            0      26     2 weight   D
           10      16     4 desire   Lext/mods/gameserver/model/actor/ai/Desire;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI<TT;>;

  public void addMoveToDesire(ext.mods.gameserver.model.location.Location, double);
    descriptor: (Lext/mods/gameserver/model/location/Location;D)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=5, args_size=3
         0: aload_1
         1: ifnull        17
         4: aload_0
         5: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         8: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
        11: invokevirtual #609                // Method ext/mods/gameserver/model/actor/Npc.isMovementDisabled:()Z
        14: ifeq          18
        17: return
        18: new           #838                // class ext/mods/gameserver/model/actor/ai/Desire
        21: dup
        22: dload_2
        23: invokespecial #966                // Method ext/mods/gameserver/model/actor/ai/Desire."<init>":(D)V
        26: astore        4
        28: aload         4
        30: aload_1
        31: aconst_null
        32: invokevirtual #1059               // Method ext/mods/gameserver/model/actor/ai/Desire.updateAsMoveTo:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/actor/Boat;)V
        35: aload_0
        36: getfield      #24                 // Field _desireQueue:Lext/mods/gameserver/model/actor/ai/DesireQueue;
        39: aload         4
        41: invokevirtual #972                // Method ext/mods/gameserver/model/actor/ai/DesireQueue.addOrUpdate:(Lext/mods/gameserver/model/actor/ai/Desire;)V
        44: return
      LineNumberTable:
        line 896: 0
        line 897: 18
        line 898: 28
        line 899: 35
        line 900: 44
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      45     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI;
            0      45     1   loc   Lext/mods/gameserver/model/location/Location;
            0      45     2 weight   D
           28      17     4 desire   Lext/mods/gameserver/model/actor/ai/Desire;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      45     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI<TT;>;
      StackMapTable: number_of_entries = 2
        frame_type = 17 /* same */
        frame_type = 0 /* same */

  public void addSocialDesire(int, int, double);
    descriptor: (IID)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=6, args_size=4
         0: aload_0
         1: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
         7: invokevirtual #1063               // Method ext/mods/gameserver/model/actor/Npc.isAISleeping:()Z
        10: ifeq          14
        13: return
        14: new           #838                // class ext/mods/gameserver/model/actor/ai/Desire
        17: dup
        18: dload_3
        19: invokespecial #966                // Method ext/mods/gameserver/model/actor/ai/Desire."<init>":(D)V
        22: astore        5
        24: aload         5
        26: iload_1
        27: iload_2
        28: invokevirtual #1066               // Method ext/mods/gameserver/model/actor/ai/Desire.updateAsSocial:(II)V
        31: aload_0
        32: getfield      #24                 // Field _desireQueue:Lext/mods/gameserver/model/actor/ai/DesireQueue;
        35: aload         5
        37: invokevirtual #972                // Method ext/mods/gameserver/model/actor/ai/DesireQueue.addOrUpdate:(Lext/mods/gameserver/model/actor/ai/Desire;)V
        40: return
      LineNumberTable:
        line 903: 0
        line 904: 14
        line 905: 24
        line 906: 31
        line 907: 40
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      41     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI;
            0      41     1    id   I
            0      41     2 timer   I
            0      41     3 weight   D
           24      17     5 desire   Lext/mods/gameserver/model/actor/ai/Desire;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      41     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI<TT;>;
      StackMapTable: number_of_entries = 1
        frame_type = 14 /* same */

  public void addWanderDesire(int, double);
    descriptor: (ID)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=5, args_size=3
         0: new           #838                // class ext/mods/gameserver/model/actor/ai/Desire
         3: dup
         4: dload_2
         5: invokespecial #966                // Method ext/mods/gameserver/model/actor/ai/Desire."<init>":(D)V
         8: astore        4
        10: aload         4
        12: iload_1
        13: invokevirtual #1070               // Method ext/mods/gameserver/model/actor/ai/Desire.updateAsWander:(I)V
        16: aload_0
        17: getfield      #24                 // Field _desireQueue:Lext/mods/gameserver/model/actor/ai/DesireQueue;
        20: aload         4
        22: invokevirtual #972                // Method ext/mods/gameserver/model/actor/ai/DesireQueue.addOrUpdate:(Lext/mods/gameserver/model/actor/ai/Desire;)V
        25: return
      LineNumberTable:
        line 910: 0
        line 911: 10
        line 912: 16
        line 913: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI;
            0      26     1 timer   I
            0      26     2 weight   D
           10      16     4 desire   Lext/mods/gameserver/model/actor/ai/Desire;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI<TT;>;

  public void addDoNothingDesire(int, double);
    descriptor: (ID)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=5, args_size=3
         0: new           #838                // class ext/mods/gameserver/model/actor/ai/Desire
         3: dup
         4: dload_2
         5: invokespecial #966                // Method ext/mods/gameserver/model/actor/ai/Desire."<init>":(D)V
         8: astore        4
        10: aload         4
        12: iload_1
        13: invokevirtual #1073               // Method ext/mods/gameserver/model/actor/ai/Desire.updateAsNothing:(I)V
        16: aload_0
        17: getfield      #24                 // Field _desireQueue:Lext/mods/gameserver/model/actor/ai/DesireQueue;
        20: aload         4
        22: invokevirtual #972                // Method ext/mods/gameserver/model/actor/ai/DesireQueue.addOrUpdate:(Lext/mods/gameserver/model/actor/ai/Desire;)V
        25: return
      LineNumberTable:
        line 916: 0
        line 917: 10
        line 918: 16
        line 919: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI;
            0      26     1 timer   I
            0      26     2 weight   D
           10      16     4 desire   Lext/mods/gameserver/model/actor/ai/Desire;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI<TT;>;

  public void addPickUpDesire(int, double);
    descriptor: (ID)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=5, args_size=3
         0: iload_1
         1: ifne          5
         4: return
         5: new           #838                // class ext/mods/gameserver/model/actor/ai/Desire
         8: dup
         9: dload_2
        10: invokespecial #966                // Method ext/mods/gameserver/model/actor/ai/Desire."<init>":(D)V
        13: astore        4
        15: aload         4
        17: iload_1
        18: iconst_0
        19: invokevirtual #1076               // Method ext/mods/gameserver/model/actor/ai/Desire.updateAsPickUp:(IZ)V
        22: aload_0
        23: getfield      #24                 // Field _desireQueue:Lext/mods/gameserver/model/actor/ai/DesireQueue;
        26: aload         4
        28: invokevirtual #972                // Method ext/mods/gameserver/model/actor/ai/DesireQueue.addOrUpdate:(Lext/mods/gameserver/model/actor/ai/Desire;)V
        31: return
      LineNumberTable:
        line 922: 0
        line 923: 5
        line 924: 15
        line 925: 22
        line 926: 31
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      32     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI;
            0      32     1 itemObjectId   I
            0      32     2 weight   D
           15      17     4 desire   Lext/mods/gameserver/model/actor/ai/Desire;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      32     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI<TT;>;
      StackMapTable: number_of_entries = 1
        frame_type = 5 /* same */

  public void onRandomAnimation(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=4, args_size=2
         0: aload_0
         1: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
         7: invokevirtual #55                 // Method ext/mods/gameserver/model/actor/Npc.denyAiAction:()Z
        10: ifeq          14
        13: return
        14: invokestatic  #579                // Method java/lang/System.currentTimeMillis:()J
        17: lstore_2
        18: lload_2
        19: aload_0
        20: getfield      #588                // Field _lastSocialBroadcast:J
        23: lsub
        24: ldc2_w        #1080               // long 12000l
        27: lcmp
        28: ifle          58
        31: aload_0
        32: lload_2
        33: putfield      #588                // Field _lastSocialBroadcast:J
        36: aload_0
        37: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        40: checkcast     #53                 // class ext/mods/gameserver/model/actor/Npc
        43: new           #592                // class ext/mods/gameserver/network/serverpackets/SocialAction
        46: dup
        47: aload_0
        48: getfield      #49                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        51: iload_1
        52: invokespecial #597                // Method ext/mods/gameserver/network/serverpackets/SocialAction."<init>":(Lext/mods/gameserver/model/actor/Creature;I)V
        55: invokevirtual #599                // Method ext/mods/gameserver/model/actor/Npc.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        58: return
      LineNumberTable:
        line 929: 0
        line 930: 14
        line 931: 18
        line 932: 31
        line 933: 36
        line 935: 58
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      59     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI;
            0      59     1    id   I
           18      41     2   now   J
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      59     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI<TT;>;
      StackMapTable: number_of_entries = 2
        frame_type = 14 /* same */
        frame_type = 252 /* append */
          offset_delta = 43
          locals = [ long ]

  public void stopRoute();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: iconst_0
         2: putfield      #548                // Field _isOnARoute:Z
         5: return
      LineNumberTable:
        line 937: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI<TT;>;

  public void cleanupForNextSpawn();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #843                // Method getDesires:()Ljava/util/Set;
         4: invokeinterface #28,  1           // InterfaceMethod java/util/Set.clear:()V
         9: aload_0
        10: getfield      #13                 // Field _seenCreatures:Ljava/util/Set;
        13: invokeinterface #28,  1           // InterfaceMethod java/util/Set.clear:()V
        18: aload_0
        19: aconst_null
        20: putfield      #888                // Field _nextDesire:Lext/mods/gameserver/model/actor/ai/Desire;
        23: aload_0
        24: iconst_0
        25: putfield      #548                // Field _isOnARoute:Z
        28: aload_0
        29: aconst_null
        30: putfield      #830                // Field _topDesireTarget:Lext/mods/gameserver/model/actor/Creature;
        33: aload_0
        34: lconst_0
        35: putfield      #588                // Field _lastSocialBroadcast:J
        38: return
      LineNumberTable:
        line 940: 0
        line 941: 9
        line 942: 18
        line 943: 23
        line 944: 28
        line 945: 33
        line 946: 38
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      39     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      39     0  this   Lext/mods/gameserver/model/actor/ai/type/NpcAI<TT;>;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #187                // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #14                 // class ext/mods/gameserver/model/actor/ai/type/NpcAI
         6: invokevirtual #1175               // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #1180               // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #163                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: return
      LineNumberTable:
        line 69: 0
}
Signature: #1351                        // <T:Lext/mods/gameserver/model/actor/Npc;>Lext/mods/gameserver/model/actor/ai/type/CreatureAI<TT;>;
SourceFile: "NpcAI.java"
NestMembers:
  ext/mods/gameserver/model/actor/ai/type/NpcAI$1
BootstrapMethods:
  0: #1402 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1356 ()V
      #1357 REF_invokeVirtual ext/mods/gameserver/model/actor/ai/type/NpcAI.lambda$thinkAttack$0:()V
      #1356 ()V
  1: #1402 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1360 (Ljava/lang/Object;)Z
      #1361 REF_invokeStatic ext/mods/gameserver/model/actor/ai/type/NpcAI.lambda$selectMeleeSkill$0:(Lext/mods/gameserver/skills/L2Skill;)Z
      #1364 (Lext/mods/gameserver/skills/L2Skill;)Z
  2: #1402 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1360 (Ljava/lang/Object;)Z
      #1365 REF_invokeStatic ext/mods/gameserver/model/actor/ai/type/NpcAI.lambda$selectMeleeSkill$1:(Lext/mods/gameserver/skills/L2Skill;)Z
      #1364 (Lext/mods/gameserver/skills/L2Skill;)Z
  3: #1402 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1356 ()V
      #1368 REF_invokeVirtual ext/mods/gameserver/model/actor/ai/type/NpcAI.lambda$stopFollow$0:()V
      #1356 ()V
  4: #1402 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1356 ()V
      #1371 REF_invokeVirtual ext/mods/gameserver/model/actor/ai/type/NpcAI.lambda$onEvtArrived$0:()V
      #1356 ()V
  5: #1402 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1374 (Ljava/lang/Object;)V
      #1376 REF_invokeVirtual ext/mods/gameserver/model/actor/ai/type/NpcAI.lambda$runAI$0:(Ljava/util/List;Lext/mods/gameserver/model/actor/Playable;)V
      #1379 (Lext/mods/gameserver/model/actor/Playable;)V
  6: #1402 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1360 (Ljava/lang/Object;)Z
      #1381 REF_invokeVirtual ext/mods/gameserver/model/actor/ai/type/NpcAI.lambda$runAI$1:(Lext/mods/gameserver/model/actor/ai/Desire;)Z
      #1384 (Lext/mods/gameserver/model/actor/ai/Desire;)Z
  7: #1402 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1360 (Ljava/lang/Object;)Z
      #1385 REF_invokeVirtual ext/mods/gameserver/model/actor/ai/type/NpcAI.lambda$runAI$2:(Lext/mods/gameserver/model/actor/ai/Desire;)Z
      #1384 (Lext/mods/gameserver/model/actor/ai/Desire;)Z
  8: #1402 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1360 (Ljava/lang/Object;)Z
      #1388 REF_invokeVirtual ext/mods/gameserver/model/actor/ai/type/NpcAI.lambda$runAI$3:(Lext/mods/gameserver/model/actor/ai/Desire;)Z
      #1384 (Lext/mods/gameserver/model/actor/ai/Desire;)Z
  9: #1402 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1360 (Ljava/lang/Object;)Z
      #1391 REF_invokeStatic ext/mods/gameserver/model/actor/ai/type/NpcAI.lambda$runAI$4:(Lext/mods/gameserver/model/actor/ai/Desire;)Z
      #1384 (Lext/mods/gameserver/model/actor/ai/Desire;)Z
  10: #1402 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1394 (Ljava/lang/Object;)D
      #1396 REF_invokeVirtual ext/mods/gameserver/model/WorldObject.distance3D:(Lext/mods/gameserver/model/location/Location;)D
      #1400 (Lext/mods/gameserver/model/location/WalkerLocation;)D
InnerClasses:
  public static final #1412= #1410 of #8; // KeySetView=class java/util/concurrent/ConcurrentHashMap$KeySetView of class java/util/concurrent/ConcurrentHashMap
  static #722;                            // class ext/mods/gameserver/model/actor/ai/type/NpcAI$1
  public static final #1417= #1413 of #1415; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
