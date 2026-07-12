// Bytecode for: ext.mods.gameserver.model.actor.ai.type.AttackableAI
// File: ext\mods\gameserver\model\actor\ai\type\AttackableAI.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/ai/type/AttackableAI.class
  Last modified 9 de jul de 2026; size 8041 bytes
  MD5 checksum ccdffc4b87729fe866699b652b786d14
  Compiled from "AttackableAI.java"
public class ext.mods.gameserver.model.actor.ai.type.AttackableAI<T extends ext.mods.gameserver.model.actor.Attackable> extends ext.mods.gameserver.model.actor.ai.type.NpcAI<T>
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/actor/ai/type/AttackableAI
  super_class: #2                         // ext/mods/gameserver/model/actor/ai/type/NpcAI
  interfaces: 0, fields: 1, methods: 9, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/actor/ai/type/NpcAI."<init>":(Lext/mods/gameserver/model/actor/Npc;)V
    #2 = Class              #4            // ext/mods/gameserver/model/actor/ai/type/NpcAI
    #3 = NameAndType        #5:#6         // "<init>":(Lext/mods/gameserver/model/actor/Npc;)V
    #4 = Utf8               ext/mods/gameserver/model/actor/ai/type/NpcAI
    #5 = Utf8               <init>
    #6 = Utf8               (Lext/mods/gameserver/model/actor/Npc;)V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/actor/ai/type/AttackableAI._currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
    #8 = Class              #10           // ext/mods/gameserver/model/actor/ai/type/AttackableAI
    #9 = NameAndType        #11:#12       // _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
   #10 = Utf8               ext/mods/gameserver/model/actor/ai/type/AttackableAI
   #11 = Utf8               _currentIntention
   #12 = Utf8               Lext/mods/gameserver/model/actor/ai/Intention;
   #13 = Methodref          #14.#15       // ext/mods/gameserver/model/actor/ai/Intention.getType:()Lext/mods/gameserver/enums/IntentionType;
   #14 = Class              #16           // ext/mods/gameserver/model/actor/ai/Intention
   #15 = NameAndType        #17:#18       // getType:()Lext/mods/gameserver/enums/IntentionType;
   #16 = Utf8               ext/mods/gameserver/model/actor/ai/Intention
   #17 = Utf8               getType
   #18 = Utf8               ()Lext/mods/gameserver/enums/IntentionType;
   #19 = Fieldref           #20.#21       // ext/mods/gameserver/enums/IntentionType.WANDER:Lext/mods/gameserver/enums/IntentionType;
   #20 = Class              #22           // ext/mods/gameserver/enums/IntentionType
   #21 = NameAndType        #23:#24       // WANDER:Lext/mods/gameserver/enums/IntentionType;
   #22 = Utf8               ext/mods/gameserver/enums/IntentionType
   #23 = Utf8               WANDER
   #24 = Utf8               Lext/mods/gameserver/enums/IntentionType;
   #25 = Fieldref           #8.#26        // ext/mods/gameserver/model/actor/ai/type/AttackableAI._actor:Lext/mods/gameserver/model/actor/Creature;
   #26 = NameAndType        #27:#28       // _actor:Lext/mods/gameserver/model/actor/Creature;
   #27 = Utf8               _actor
   #28 = Utf8               Lext/mods/gameserver/model/actor/Creature;
   #29 = Class              #30           // ext/mods/gameserver/model/actor/Attackable
   #30 = Utf8               ext/mods/gameserver/model/actor/Attackable
   #31 = Methodref          #29.#32       // ext/mods/gameserver/model/actor/Attackable.setWalkOrRun:(Z)V
   #32 = NameAndType        #33:#34       // setWalkOrRun:(Z)V
   #33 = Utf8               setWalkOrRun
   #34 = Utf8               (Z)V
   #35 = Methodref          #29.#36       // ext/mods/gameserver/model/actor/Attackable.isMoving:()Z
   #36 = NameAndType        #37:#38       // isMoving:()Z
   #37 = Utf8               isMoving
   #38 = Utf8               ()Z
   #39 = Fieldref           #8.#40        // ext/mods/gameserver/model/actor/ai/type/AttackableAI._lastDesire:Lext/mods/gameserver/model/actor/ai/Desire;
   #40 = NameAndType        #41:#42       // _lastDesire:Lext/mods/gameserver/model/actor/ai/Desire;
   #41 = Utf8               _lastDesire
   #42 = Utf8               Lext/mods/gameserver/model/actor/ai/Desire;
   #43 = Methodref          #44.#15       // ext/mods/gameserver/model/actor/ai/Desire.getType:()Lext/mods/gameserver/enums/IntentionType;
   #44 = Class              #45           // ext/mods/gameserver/model/actor/ai/Desire
   #45 = Utf8               ext/mods/gameserver/model/actor/ai/Desire
   #46 = Fieldref           #8.#47        // ext/mods/gameserver/model/actor/ai/type/AttackableAI._wanderTask:Ljava/util/concurrent/ScheduledFuture;
   #47 = NameAndType        #48:#49       // _wanderTask:Ljava/util/concurrent/ScheduledFuture;
   #48 = Utf8               _wanderTask
   #49 = Utf8               Ljava/util/concurrent/ScheduledFuture;
   #50 = InterfaceMethodref #51.#52       // java/util/concurrent/ScheduledFuture.cancel:(Z)Z
   #51 = Class              #53           // java/util/concurrent/ScheduledFuture
   #52 = NameAndType        #54:#55       // cancel:(Z)Z
   #53 = Utf8               java/util/concurrent/ScheduledFuture
   #54 = Utf8               cancel
   #55 = Utf8               (Z)Z
   #56 = Methodref          #29.#57       // ext/mods/gameserver/model/actor/Attackable.returnHome:()Z
   #57 = NameAndType        #58:#38       // returnHome:()Z
   #58 = Utf8               returnHome
   #59 = Methodref          #29.#60       // ext/mods/gameserver/model/actor/Attackable.isInMyTerritory:()Z
   #60 = NameAndType        #61:#38       // isInMyTerritory:()Z
   #61 = Utf8               isInMyTerritory
   #62 = Methodref          #8.#63        // ext/mods/gameserver/model/actor/ai/type/AttackableAI.clearCurrentDesire:()V
   #63 = NameAndType        #64:#65       // clearCurrentDesire:()V
   #64 = Utf8               clearCurrentDesire
   #65 = Utf8               ()V
   #66 = Methodref          #29.#67       // ext/mods/gameserver/model/actor/Attackable.getStatus:()Lext/mods/gameserver/model/actor/status/AttackableStatus;
   #67 = NameAndType        #68:#69       // getStatus:()Lext/mods/gameserver/model/actor/status/AttackableStatus;
   #68 = Utf8               getStatus
   #69 = Utf8               ()Lext/mods/gameserver/model/actor/status/AttackableStatus;
   #70 = Methodref          #71.#72       // ext/mods/gameserver/model/actor/status/AttackableStatus.getRealMoveSpeed:(Z)F
   #71 = Class              #73           // ext/mods/gameserver/model/actor/status/AttackableStatus
   #72 = NameAndType        #74:#75       // getRealMoveSpeed:(Z)F
   #73 = Utf8               ext/mods/gameserver/model/actor/status/AttackableStatus
   #74 = Utf8               getRealMoveSpeed
   #75 = Utf8               (Z)F
   #76 = Methodref          #29.#77       // ext/mods/gameserver/model/actor/Attackable.moveFromSpawnPointUsingRandomOffset:(I)V
   #77 = NameAndType        #78:#79       // moveFromSpawnPointUsingRandomOffset:(I)V
   #78 = Utf8               moveFromSpawnPointUsingRandomOffset
   #79 = Utf8               (I)V
   #80 = InvokeDynamic      #0:#81        // #0:run:(Lext/mods/gameserver/model/actor/ai/type/AttackableAI;)Ljava/lang/Runnable;
   #81 = NameAndType        #82:#83       // run:(Lext/mods/gameserver/model/actor/ai/type/AttackableAI;)Ljava/lang/Runnable;
   #82 = Utf8               run
   #83 = Utf8               (Lext/mods/gameserver/model/actor/ai/type/AttackableAI;)Ljava/lang/Runnable;
   #84 = Methodref          #14.#85       // ext/mods/gameserver/model/actor/ai/Intention.getTimer:()I
   #85 = NameAndType        #86:#87       // getTimer:()I
   #86 = Utf8               getTimer
   #87 = Utf8               ()I
   #88 = Long               1000l
   #90 = Methodref          #91.#92       // ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #91 = Class              #93           // ext/mods/commons/pool/ThreadPool
   #92 = NameAndType        #94:#95       // schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #93 = Utf8               ext/mods/commons/pool/ThreadPool
   #94 = Utf8               schedule
   #95 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #96 = Fieldref           #8.#97        // ext/mods/gameserver/model/actor/ai/type/AttackableAI._nextIntention:Lext/mods/gameserver/model/actor/ai/Intention;
   #97 = NameAndType        #98:#12       // _nextIntention:Lext/mods/gameserver/model/actor/ai/Intention;
   #98 = Utf8               _nextIntention
   #99 = Methodref          #14.#100      // ext/mods/gameserver/model/actor/ai/Intention.isBlank:()Z
  #100 = NameAndType        #101:#38      // isBlank:()Z
  #101 = Utf8               isBlank
  #102 = Fieldref           #103.#104     // ext/mods/gameserver/enums/AiEventType.THINK:Lext/mods/gameserver/enums/AiEventType;
  #103 = Class              #105          // ext/mods/gameserver/enums/AiEventType
  #104 = NameAndType        #106:#107     // THINK:Lext/mods/gameserver/enums/AiEventType;
  #105 = Utf8               ext/mods/gameserver/enums/AiEventType
  #106 = Utf8               THINK
  #107 = Utf8               Lext/mods/gameserver/enums/AiEventType;
  #108 = Methodref          #8.#109       // ext/mods/gameserver/model/actor/ai/type/AttackableAI.notifyEvent:(Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
  #109 = NameAndType        #110:#111     // notifyEvent:(Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
  #110 = Utf8               notifyEvent
  #111 = Utf8               (Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
  #112 = Methodref          #8.#113       // ext/mods/gameserver/model/actor/ai/type/AttackableAI.doIntention:(Lext/mods/gameserver/model/actor/ai/Intention;)V
  #113 = NameAndType        #114:#115     // doIntention:(Lext/mods/gameserver/model/actor/ai/Intention;)V
  #114 = Utf8               doIntention
  #115 = Utf8               (Lext/mods/gameserver/model/actor/ai/Intention;)V
  #116 = Methodref          #29.#117      // ext/mods/gameserver/model/actor/Attackable.addAttacker:(Lext/mods/gameserver/model/actor/Creature;)V
  #117 = NameAndType        #118:#119     // addAttacker:(Lext/mods/gameserver/model/actor/Creature;)V
  #118 = Utf8               addAttacker
  #119 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
  #120 = Methodref          #2.#121       // ext/mods/gameserver/model/actor/ai/type/NpcAI.onEvtAttacked:(Lext/mods/gameserver/model/actor/Creature;)V
  #121 = NameAndType        #122:#119     // onEvtAttacked:(Lext/mods/gameserver/model/actor/Creature;)V
  #122 = Utf8               onEvtAttacked
  #123 = Methodref          #29.#124      // ext/mods/gameserver/model/actor/Attackable.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #124 = NameAndType        #125:#126     // getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #125 = Utf8               getTemplate
  #126 = Utf8               ()Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #127 = Fieldref           #128.#129     // ext/mods/gameserver/enums/EventHandler.ATTACKED:Lext/mods/gameserver/enums/EventHandler;
  #128 = Class              #130          // ext/mods/gameserver/enums/EventHandler
  #129 = NameAndType        #131:#132     // ATTACKED:Lext/mods/gameserver/enums/EventHandler;
  #130 = Utf8               ext/mods/gameserver/enums/EventHandler
  #131 = Utf8               ATTACKED
  #132 = Utf8               Lext/mods/gameserver/enums/EventHandler;
  #133 = Methodref          #134.#135     // ext/mods/gameserver/model/actor/template/NpcTemplate.getEventQuests:(Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
  #134 = Class              #136          // ext/mods/gameserver/model/actor/template/NpcTemplate
  #135 = NameAndType        #137:#138     // getEventQuests:(Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
  #136 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
  #137 = Utf8               getEventQuests
  #138 = Utf8               (Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
  #139 = InterfaceMethodref #140.#141     // java/util/List.iterator:()Ljava/util/Iterator;
  #140 = Class              #142          // java/util/List
  #141 = NameAndType        #143:#144     // iterator:()Ljava/util/Iterator;
  #142 = Utf8               java/util/List
  #143 = Utf8               iterator
  #144 = Utf8               ()Ljava/util/Iterator;
  #145 = InterfaceMethodref #146.#147     // java/util/Iterator.hasNext:()Z
  #146 = Class              #148          // java/util/Iterator
  #147 = NameAndType        #149:#38      // hasNext:()Z
  #148 = Utf8               java/util/Iterator
  #149 = Utf8               hasNext
  #150 = InterfaceMethodref #146.#151     // java/util/Iterator.next:()Ljava/lang/Object;
  #151 = NameAndType        #152:#153     // next:()Ljava/lang/Object;
  #152 = Utf8               next
  #153 = Utf8               ()Ljava/lang/Object;
  #154 = Class              #155          // ext/mods/gameserver/scripting/Quest
  #155 = Utf8               ext/mods/gameserver/scripting/Quest
  #156 = Class              #157          // ext/mods/gameserver/model/actor/Npc
  #157 = Utf8               ext/mods/gameserver/model/actor/Npc
  #158 = Methodref          #154.#159     // ext/mods/gameserver/scripting/Quest.onAttacked:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;ILext/mods/gameserver/skills/L2Skill;)V
  #159 = NameAndType        #160:#161     // onAttacked:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;ILext/mods/gameserver/skills/L2Skill;)V
  #160 = Utf8               onAttacked
  #161 = Utf8               (Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;ILext/mods/gameserver/skills/L2Skill;)V
  #162 = Methodref          #29.#163      // ext/mods/gameserver/model/actor/Attackable.isMaster:()Z
  #163 = NameAndType        #164:#38      // isMaster:()Z
  #164 = Utf8               isMaster
  #165 = Methodref          #29.#166      // ext/mods/gameserver/model/actor/Attackable.hasMaster:()Z
  #166 = NameAndType        #167:#38      // hasMaster:()Z
  #167 = Utf8               hasMaster
  #168 = Fieldref           #128.#169     // ext/mods/gameserver/enums/EventHandler.PARTY_ATTACKED:Lext/mods/gameserver/enums/EventHandler;
  #169 = NameAndType        #170:#132     // PARTY_ATTACKED:Lext/mods/gameserver/enums/EventHandler;
  #170 = Utf8               PARTY_ATTACKED
  #171 = Methodref          #154.#172     // ext/mods/gameserver/scripting/Quest.onPartyAttacked:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;I)V
  #172 = NameAndType        #173:#174     // onPartyAttacked:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;I)V
  #173 = Utf8               onPartyAttacked
  #174 = Utf8               (Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;I)V
  #175 = Methodref          #29.#176      // ext/mods/gameserver/model/actor/Attackable.getMaster:()Lext/mods/gameserver/model/actor/Npc;
  #176 = NameAndType        #177:#178     // getMaster:()Lext/mods/gameserver/model/actor/Npc;
  #177 = Utf8               getMaster
  #178 = Utf8               ()Lext/mods/gameserver/model/actor/Npc;
  #179 = Methodref          #156.#180     // ext/mods/gameserver/model/actor/Npc.isDead:()Z
  #180 = NameAndType        #181:#38      // isDead:()Z
  #181 = Utf8               isDead
  #182 = Methodref          #156.#124     // ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #183 = Methodref          #29.#184      // ext/mods/gameserver/model/actor/Attackable.getMinions:()Ljava/util/Set;
  #184 = NameAndType        #185:#186     // getMinions:()Ljava/util/Set;
  #185 = Utf8               getMinions
  #186 = Utf8               ()Ljava/util/Set;
  #187 = InterfaceMethodref #188.#141     // java/util/Set.iterator:()Ljava/util/Iterator;
  #188 = Class              #189          // java/util/Set
  #189 = Utf8               java/util/Set
  #190 = Methodref          #134.#191     // ext/mods/gameserver/model/actor/template/NpcTemplate.getClans:()[Ljava/lang/String;
  #191 = NameAndType        #192:#193     // getClans:()[Ljava/lang/String;
  #192 = Utf8               getClans
  #193 = Utf8               ()[Ljava/lang/String;
  #194 = Methodref          #134.#195     // ext/mods/gameserver/model/actor/template/NpcTemplate.getClanRange:()I
  #195 = NameAndType        #196:#87      // getClanRange:()I
  #196 = Utf8               getClanRange
  #197 = Fieldref           #128.#198     // ext/mods/gameserver/enums/EventHandler.CLAN_ATTACKED:Lext/mods/gameserver/enums/EventHandler;
  #198 = NameAndType        #199:#132     // CLAN_ATTACKED:Lext/mods/gameserver/enums/EventHandler;
  #199 = Utf8               CLAN_ATTACKED
  #200 = Methodref          #154.#201     // ext/mods/gameserver/scripting/Quest.onClanAttacked:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;ILext/mods/gameserver/skills/L2Skill;)V
  #201 = NameAndType        #202:#203     // onClanAttacked:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;ILext/mods/gameserver/skills/L2Skill;)V
  #202 = Utf8               onClanAttacked
  #203 = Utf8               (Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;ILext/mods/gameserver/skills/L2Skill;)V
  #204 = InvokeDynamic      #1:#205       // #1:accept:(Lext/mods/gameserver/model/actor/ai/type/AttackableAI;[Ljava/lang/String;Lext/mods/gameserver/model/actor/Creature;I)Ljava/util/function/Consumer;
  #205 = NameAndType        #206:#207     // accept:(Lext/mods/gameserver/model/actor/ai/type/AttackableAI;[Ljava/lang/String;Lext/mods/gameserver/model/actor/Creature;I)Ljava/util/function/Consumer;
  #206 = Utf8               accept
  #207 = Utf8               (Lext/mods/gameserver/model/actor/ai/type/AttackableAI;[Ljava/lang/String;Lext/mods/gameserver/model/actor/Creature;I)Ljava/util/function/Consumer;
  #208 = Methodref          #29.#209      // ext/mods/gameserver/model/actor/Attackable.forEachKnownTypeInRadius:(Ljava/lang/Class;ILjava/util/function/Consumer;)V
  #209 = NameAndType        #210:#211     // forEachKnownTypeInRadius:(Ljava/lang/Class;ILjava/util/function/Consumer;)V
  #210 = Utf8               forEachKnownTypeInRadius
  #211 = Utf8               (Ljava/lang/Class;ILjava/util/function/Consumer;)V
  #212 = Methodref          #29.#180      // ext/mods/gameserver/model/actor/Attackable.isDead:()Z
  #213 = Methodref          #214.#215     // ext/mods/commons/util/ArraysUtil.contains:([Ljava/lang/Object;[Ljava/lang/Object;)Z
  #214 = Class              #216          // ext/mods/commons/util/ArraysUtil
  #215 = NameAndType        #217:#218     // contains:([Ljava/lang/Object;[Ljava/lang/Object;)Z
  #216 = Utf8               ext/mods/commons/util/ArraysUtil
  #217 = Utf8               contains
  #218 = Utf8               ([Ljava/lang/Object;[Ljava/lang/Object;)Z
  #219 = Methodref          #134.#220     // ext/mods/gameserver/model/actor/template/NpcTemplate.getIgnoredIds:()[I
  #220 = NameAndType        #221:#222     // getIgnoredIds:()[I
  #221 = Utf8               getIgnoredIds
  #222 = Utf8               ()[I
  #223 = Methodref          #29.#224      // ext/mods/gameserver/model/actor/Attackable.getNpcId:()I
  #224 = NameAndType        #225:#87      // getNpcId:()I
  #225 = Utf8               getNpcId
  #226 = Methodref          #214.#227     // ext/mods/commons/util/ArraysUtil.contains:([II)Z
  #227 = NameAndType        #217:#228     // contains:([II)Z
  #228 = Utf8               ([II)Z
  #229 = Methodref          #230.#231     // ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
  #230 = Class              #232          // ext/mods/gameserver/geoengine/GeoEngine
  #231 = NameAndType        #233:#234     // getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
  #232 = Utf8               ext/mods/gameserver/geoengine/GeoEngine
  #233 = Utf8               getInstance
  #234 = Utf8               ()Lext/mods/gameserver/geoengine/GeoEngine;
  #235 = Methodref          #230.#236     // ext/mods/gameserver/geoengine/GeoEngine.canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
  #236 = NameAndType        #237:#238     // canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
  #237 = Utf8               canSeeTarget
  #238 = Utf8               (Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
  #239 = Fieldref           #240.#241     // ext/mods/Config.RANDOM_WALK_RATE:I
  #240 = Class              #242          // ext/mods/Config
  #241 = NameAndType        #243:#244     // RANDOM_WALK_RATE:I
  #242 = Utf8               ext/mods/Config
  #243 = Utf8               RANDOM_WALK_RATE
  #244 = Utf8               I
  #245 = Methodref          #246.#247     // ext/mods/commons/random/Rnd.get:(I)I
  #246 = Class              #248          // ext/mods/commons/random/Rnd
  #247 = NameAndType        #249:#250     // get:(I)I
  #248 = Utf8               ext/mods/commons/random/Rnd
  #249 = Utf8               get
  #250 = Utf8               (I)I
  #251 = Methodref          #8.#252       // ext/mods/gameserver/model/actor/ai/type/AttackableAI.thinkWander:()V
  #252 = NameAndType        #253:#65      // thinkWander:()V
  #253 = Utf8               thinkWander
  #254 = Utf8               Signature
  #255 = Utf8               Ljava/util/concurrent/ScheduledFuture<*>;
  #256 = Utf8               (Lext/mods/gameserver/model/actor/Attackable;)V
  #257 = Utf8               Code
  #258 = Utf8               LineNumberTable
  #259 = Utf8               LocalVariableTable
  #260 = Utf8               this
  #261 = Utf8               Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
  #262 = Utf8               attackable
  #263 = Utf8               Lext/mods/gameserver/model/actor/Attackable;
  #264 = Utf8               LocalVariableTypeTable
  #265 = Utf8               Lext/mods/gameserver/model/actor/ai/type/AttackableAI<TT;>;
  #266 = Utf8               TT;
  #267 = Utf8               (TT;)V
  #268 = Utf8               StackMapTable
  #269 = Utf8               onEvtFinishedAttackBow
  #270 = Utf8               onEvtBowAttackReuse
  #271 = Utf8               attacker
  #272 = Utf8               onEvtAggression
  #273 = Utf8               (Lext/mods/gameserver/model/actor/Creature;I)V
  #274 = Utf8               quest
  #275 = Utf8               Lext/mods/gameserver/scripting/Quest;
  #276 = Utf8               minion
  #277 = Utf8               Lext/mods/gameserver/model/actor/Npc;
  #278 = Utf8               master
  #279 = Utf8               target
  #280 = Utf8               aggro
  #281 = Utf8               actorClans
  #282 = Utf8               [Ljava/lang/String;
  #283 = Class              #282          // "[Ljava/lang/String;"
  #284 = Utf8               canScheduleAfter
  #285 = Utf8               (Lext/mods/gameserver/enums/IntentionType;Lext/mods/gameserver/enums/IntentionType;)Z
  #286 = Utf8               oldIntention
  #287 = Utf8               newIntention
  #288 = Utf8               lambda$onEvtAggression$0
  #289 = Utf8               ([Ljava/lang/String;Lext/mods/gameserver/model/actor/Creature;ILext/mods/gameserver/model/actor/Attackable;)V
  #290 = Utf8               i$
  #291 = Utf8               Ljava/util/Iterator;
  #292 = Utf8               called
  #293 = Utf8               lambda$thinkWander$0
  #294 = Utf8               <T:Lext/mods/gameserver/model/actor/Attackable;>Lext/mods/gameserver/model/actor/ai/type/NpcAI<TT;>;
  #295 = Utf8               SourceFile
  #296 = Utf8               AttackableAI.java
  #297 = Utf8               BootstrapMethods
  #298 = MethodType         #65           //  ()V
  #299 = MethodHandle       5:#300        // REF_invokeVirtual ext/mods/gameserver/model/actor/ai/type/AttackableAI.lambda$thinkWander$0:()V
  #300 = Methodref          #8.#301       // ext/mods/gameserver/model/actor/ai/type/AttackableAI.lambda$thinkWander$0:()V
  #301 = NameAndType        #293:#65      // lambda$thinkWander$0:()V
  #302 = MethodType         #303          //  (Ljava/lang/Object;)V
  #303 = Utf8               (Ljava/lang/Object;)V
  #304 = MethodHandle       5:#305        // REF_invokeVirtual ext/mods/gameserver/model/actor/ai/type/AttackableAI.lambda$onEvtAggression$0:([Ljava/lang/String;Lext/mods/gameserver/model/actor/Creature;ILext/mods/gameserver/model/actor/Attackable;)V
  #305 = Methodref          #8.#306       // ext/mods/gameserver/model/actor/ai/type/AttackableAI.lambda$onEvtAggression$0:([Ljava/lang/String;Lext/mods/gameserver/model/actor/Creature;ILext/mods/gameserver/model/actor/Attackable;)V
  #306 = NameAndType        #288:#289     // lambda$onEvtAggression$0:([Ljava/lang/String;Lext/mods/gameserver/model/actor/Creature;ILext/mods/gameserver/model/actor/Attackable;)V
  #307 = MethodType         #256          //  (Lext/mods/gameserver/model/actor/Attackable;)V
  #308 = MethodHandle       6:#309        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #309 = Methodref          #310.#311     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #310 = Class              #312          // java/lang/invoke/LambdaMetafactory
  #311 = NameAndType        #313:#314     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #312 = Utf8               java/lang/invoke/LambdaMetafactory
  #313 = Utf8               metafactory
  #314 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #315 = Utf8               InnerClasses
  #316 = Class              #317          // java/lang/invoke/MethodHandles$Lookup
  #317 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #318 = Class              #319          // java/lang/invoke/MethodHandles
  #319 = Utf8               java/lang/invoke/MethodHandles
  #320 = Utf8               Lookup
{
  public ext.mods.gameserver.model.actor.ai.type.AttackableAI(T);
    descriptor: (Lext/mods/gameserver/model/actor/Attackable;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #1                  // Method ext/mods/gameserver/model/actor/ai/type/NpcAI."<init>":(Lext/mods/gameserver/model/actor/Npc;)V
         5: return
      LineNumberTable:
        line 42: 0
        line 43: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
            0       6     1 attackable   Lext/mods/gameserver/model/actor/Attackable;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/ai/type/AttackableAI<TT;>;
            0       6     1 attackable   TT;
    Signature: #267                         // (TT;)V

  protected void thinkWander();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
         4: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/ai/Intention.getType:()Lext/mods/gameserver/enums/IntentionType;
         7: getstatic     #19                 // Field ext/mods/gameserver/enums/IntentionType.WANDER:Lext/mods/gameserver/enums/IntentionType;
        10: if_acmpeq     14
        13: return
        14: aload_0
        15: getfield      #25                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        18: checkcast     #29                 // class ext/mods/gameserver/model/actor/Attackable
        21: iconst_0
        22: invokevirtual #31                 // Method ext/mods/gameserver/model/actor/Attackable.setWalkOrRun:(Z)V
        25: aload_0
        26: getfield      #25                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        29: checkcast     #29                 // class ext/mods/gameserver/model/actor/Attackable
        32: invokevirtual #35                 // Method ext/mods/gameserver/model/actor/Attackable.isMoving:()Z
        35: ifeq          39
        38: return
        39: aload_0
        40: getfield      #39                 // Field _lastDesire:Lext/mods/gameserver/model/actor/ai/Desire;
        43: ifnull        59
        46: aload_0
        47: getfield      #39                 // Field _lastDesire:Lext/mods/gameserver/model/actor/ai/Desire;
        50: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/ai/Desire.getType:()Lext/mods/gameserver/enums/IntentionType;
        53: getstatic     #19                 // Field ext/mods/gameserver/enums/IntentionType.WANDER:Lext/mods/gameserver/enums/IntentionType;
        56: if_acmpeq     139
        59: aload_0
        60: getfield      #46                 // Field _wanderTask:Ljava/util/concurrent/ScheduledFuture;
        63: ifnull        77
        66: aload_0
        67: getfield      #46                 // Field _wanderTask:Ljava/util/concurrent/ScheduledFuture;
        70: iconst_0
        71: invokeinterface #50,  2           // InterfaceMethod java/util/concurrent/ScheduledFuture.cancel:(Z)Z
        76: pop
        77: aload_0
        78: getfield      #25                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        81: checkcast     #29                 // class ext/mods/gameserver/model/actor/Attackable
        84: invokevirtual #56                 // Method ext/mods/gameserver/model/actor/Attackable.returnHome:()Z
        87: ifeq          91
        90: return
        91: aload_0
        92: getfield      #25                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        95: checkcast     #29                 // class ext/mods/gameserver/model/actor/Attackable
        98: invokevirtual #59                 // Method ext/mods/gameserver/model/actor/Attackable.isInMyTerritory:()Z
       101: ifne          109
       104: aload_0
       105: invokevirtual #62                 // Method clearCurrentDesire:()V
       108: return
       109: aload_0
       110: getfield      #25                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       113: checkcast     #29                 // class ext/mods/gameserver/model/actor/Attackable
       116: aload_0
       117: getfield      #25                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       120: checkcast     #29                 // class ext/mods/gameserver/model/actor/Attackable
       123: invokevirtual #66                 // Method ext/mods/gameserver/model/actor/Attackable.getStatus:()Lext/mods/gameserver/model/actor/status/AttackableStatus;
       126: iconst_1
       127: invokevirtual #70                 // Method ext/mods/gameserver/model/actor/status/AttackableStatus.getRealMoveSpeed:(Z)F
       130: f2i
       131: iconst_3
       132: imul
       133: invokevirtual #76                 // Method ext/mods/gameserver/model/actor/Attackable.moveFromSpawnPointUsingRandomOffset:(I)V
       136: goto          164
       139: aload_0
       140: aload_0
       141: invokedynamic #80,  0             // InvokeDynamic #0:run:(Lext/mods/gameserver/model/actor/ai/type/AttackableAI;)Ljava/lang/Runnable;
       146: aload_0
       147: getfield      #7                  // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
       150: invokevirtual #84                 // Method ext/mods/gameserver/model/actor/ai/Intention.getTimer:()I
       153: i2l
       154: ldc2_w        #88                 // long 1000l
       157: lmul
       158: invokestatic  #90                 // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
       161: putfield      #46                 // Field _wanderTask:Ljava/util/concurrent/ScheduledFuture;
       164: return
      LineNumberTable:
        line 48: 0
        line 49: 13
        line 51: 14
        line 53: 25
        line 54: 38
        line 56: 39
        line 58: 59
        line 59: 66
        line 61: 77
        line 62: 90
        line 64: 91
        line 66: 104
        line 67: 108
        line 70: 109
        line 74: 139
        line 100: 150
        line 74: 158
        line 102: 164
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     165     0  this   Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0     165     0  this   Lext/mods/gameserver/model/actor/ai/type/AttackableAI<TT;>;
      StackMapTable: number_of_entries = 8
        frame_type = 14 /* same */
        frame_type = 24 /* same */
        frame_type = 19 /* same */
        frame_type = 17 /* same */
        frame_type = 13 /* same */
        frame_type = 17 /* same */
        frame_type = 29 /* same */
        frame_type = 24 /* same */

  protected void onEvtFinishedAttackBow();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=0, locals=1, args_size=1
         0: return
      LineNumberTable:
        line 107: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/ai/type/AttackableAI<TT;>;

  protected void onEvtBowAttackReuse();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: getfield      #96                 // Field _nextIntention:Lext/mods/gameserver/model/actor/ai/Intention;
         4: invokevirtual #99                 // Method ext/mods/gameserver/model/actor/ai/Intention.isBlank:()Z
         7: ifeq          22
        10: aload_0
        11: getstatic     #102                // Field ext/mods/gameserver/enums/AiEventType.THINK:Lext/mods/gameserver/enums/AiEventType;
        14: aconst_null
        15: aconst_null
        16: invokevirtual #108                // Method notifyEvent:(Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
        19: goto          30
        22: aload_0
        23: aload_0
        24: getfield      #96                 // Field _nextIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        27: invokevirtual #112                // Method doIntention:(Lext/mods/gameserver/model/actor/ai/Intention;)V
        30: return
      LineNumberTable:
        line 112: 0
        line 113: 10
        line 115: 22
        line 116: 30
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0  this   Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      31     0  this   Lext/mods/gameserver/model/actor/ai/type/AttackableAI<TT;>;
      StackMapTable: number_of_entries = 2
        frame_type = 22 /* same */
        frame_type = 7 /* same */

  protected void onEvtAttacked(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #25                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #29                 // class ext/mods/gameserver/model/actor/Attackable
         7: aload_1
         8: invokevirtual #116                // Method ext/mods/gameserver/model/actor/Attackable.addAttacker:(Lext/mods/gameserver/model/actor/Creature;)V
        11: aload_0
        12: aload_1
        13: invokespecial #120                // Method ext/mods/gameserver/model/actor/ai/type/NpcAI.onEvtAttacked:(Lext/mods/gameserver/model/actor/Creature;)V
        16: return
      LineNumberTable:
        line 121: 0
        line 123: 11
        line 124: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
            0      17     1 attacker   Lext/mods/gameserver/model/actor/Creature;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/actor/ai/type/AttackableAI<TT;>;

  protected void onEvtAggression(ext.mods.gameserver.model.actor.Creature, int);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;I)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=7, locals=8, args_size=3
         0: aload_0
         1: getfield      #25                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #29                 // class ext/mods/gameserver/model/actor/Attackable
         7: invokevirtual #123                // Method ext/mods/gameserver/model/actor/Attackable.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
        10: getstatic     #127                // Field ext/mods/gameserver/enums/EventHandler.ATTACKED:Lext/mods/gameserver/enums/EventHandler;
        13: invokevirtual #133                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getEventQuests:(Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
        16: invokeinterface #139,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        21: astore_3
        22: aload_3
        23: invokeinterface #145,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        28: ifeq          60
        31: aload_3
        32: invokeinterface #150,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        37: checkcast     #154                // class ext/mods/gameserver/scripting/Quest
        40: astore        4
        42: aload         4
        44: aload_0
        45: getfield      #25                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        48: checkcast     #156                // class ext/mods/gameserver/model/actor/Npc
        51: aload_1
        52: iload_2
        53: aconst_null
        54: invokevirtual #158                // Method ext/mods/gameserver/scripting/Quest.onAttacked:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;ILext/mods/gameserver/skills/L2Skill;)V
        57: goto          22
        60: aload_0
        61: getfield      #25                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        64: checkcast     #29                 // class ext/mods/gameserver/model/actor/Attackable
        67: invokevirtual #162                // Method ext/mods/gameserver/model/actor/Attackable.isMaster:()Z
        70: ifne          86
        73: aload_0
        74: getfield      #25                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        77: checkcast     #29                 // class ext/mods/gameserver/model/actor/Attackable
        80: invokevirtual #165                // Method ext/mods/gameserver/model/actor/Attackable.hasMaster:()Z
        83: ifeq          343
        86: aload_0
        87: getfield      #25                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        90: checkcast     #29                 // class ext/mods/gameserver/model/actor/Attackable
        93: invokevirtual #123                // Method ext/mods/gameserver/model/actor/Attackable.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
        96: getstatic     #168                // Field ext/mods/gameserver/enums/EventHandler.PARTY_ATTACKED:Lext/mods/gameserver/enums/EventHandler;
        99: invokevirtual #133                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getEventQuests:(Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
       102: invokeinterface #139,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       107: astore_3
       108: aload_3
       109: invokeinterface #145,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       114: ifeq          152
       117: aload_3
       118: invokeinterface #150,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       123: checkcast     #154                // class ext/mods/gameserver/scripting/Quest
       126: astore        4
       128: aload         4
       130: aload_0
       131: getfield      #25                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       134: checkcast     #156                // class ext/mods/gameserver/model/actor/Npc
       137: aload_0
       138: getfield      #25                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       141: checkcast     #156                // class ext/mods/gameserver/model/actor/Npc
       144: aload_1
       145: iload_2
       146: invokevirtual #171                // Method ext/mods/gameserver/scripting/Quest.onPartyAttacked:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;I)V
       149: goto          108
       152: aload_0
       153: getfield      #25                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       156: checkcast     #29                 // class ext/mods/gameserver/model/actor/Attackable
       159: invokevirtual #175                // Method ext/mods/gameserver/model/actor/Attackable.getMaster:()Lext/mods/gameserver/model/actor/Npc;
       162: astore_3
       163: aload_3
       164: ifnull        231
       167: aload_3
       168: invokevirtual #179                // Method ext/mods/gameserver/model/actor/Npc.isDead:()Z
       171: ifne          231
       174: aload_3
       175: invokevirtual #182                // Method ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       178: getstatic     #168                // Field ext/mods/gameserver/enums/EventHandler.PARTY_ATTACKED:Lext/mods/gameserver/enums/EventHandler;
       181: invokevirtual #133                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getEventQuests:(Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
       184: invokeinterface #139,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       189: astore        4
       191: aload         4
       193: invokeinterface #145,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       198: ifeq          231
       201: aload         4
       203: invokeinterface #150,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       208: checkcast     #154                // class ext/mods/gameserver/scripting/Quest
       211: astore        5
       213: aload         5
       215: aload_0
       216: getfield      #25                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       219: checkcast     #156                // class ext/mods/gameserver/model/actor/Npc
       222: aload_3
       223: aload_1
       224: iload_2
       225: invokevirtual #171                // Method ext/mods/gameserver/scripting/Quest.onPartyAttacked:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;I)V
       228: goto          191
       231: aload_0
       232: getfield      #25                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       235: checkcast     #29                 // class ext/mods/gameserver/model/actor/Attackable
       238: invokevirtual #183                // Method ext/mods/gameserver/model/actor/Attackable.getMinions:()Ljava/util/Set;
       241: invokeinterface #187,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
       246: astore        4
       248: aload         4
       250: invokeinterface #145,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       255: ifeq          343
       258: aload         4
       260: invokeinterface #150,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       265: checkcast     #156                // class ext/mods/gameserver/model/actor/Npc
       268: astore        5
       270: aload         5
       272: invokevirtual #179                // Method ext/mods/gameserver/model/actor/Npc.isDead:()Z
       275: ifeq          281
       278: goto          248
       281: aload         5
       283: invokevirtual #182                // Method ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       286: getstatic     #168                // Field ext/mods/gameserver/enums/EventHandler.PARTY_ATTACKED:Lext/mods/gameserver/enums/EventHandler;
       289: invokevirtual #133                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getEventQuests:(Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
       292: invokeinterface #139,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       297: astore        6
       299: aload         6
       301: invokeinterface #145,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       306: ifeq          340
       309: aload         6
       311: invokeinterface #150,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       316: checkcast     #154                // class ext/mods/gameserver/scripting/Quest
       319: astore        7
       321: aload         7
       323: aload_0
       324: getfield      #25                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       327: checkcast     #156                // class ext/mods/gameserver/model/actor/Npc
       330: aload         5
       332: aload_1
       333: iload_2
       334: invokevirtual #171                // Method ext/mods/gameserver/scripting/Quest.onPartyAttacked:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;I)V
       337: goto          299
       340: goto          248
       343: aload_0
       344: getfield      #25                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       347: checkcast     #29                 // class ext/mods/gameserver/model/actor/Attackable
       350: invokevirtual #123                // Method ext/mods/gameserver/model/actor/Attackable.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       353: invokevirtual #190                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getClans:()[Ljava/lang/String;
       356: astore_3
       357: aload_3
       358: ifnull        481
       361: aload_0
       362: getfield      #25                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       365: checkcast     #29                 // class ext/mods/gameserver/model/actor/Attackable
       368: invokevirtual #123                // Method ext/mods/gameserver/model/actor/Attackable.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       371: invokevirtual #194                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getClanRange:()I
       374: ifle          481
       377: aload_0
       378: getfield      #25                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       381: checkcast     #29                 // class ext/mods/gameserver/model/actor/Attackable
       384: invokevirtual #123                // Method ext/mods/gameserver/model/actor/Attackable.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       387: getstatic     #197                // Field ext/mods/gameserver/enums/EventHandler.CLAN_ATTACKED:Lext/mods/gameserver/enums/EventHandler;
       390: invokevirtual #133                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getEventQuests:(Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
       393: invokeinterface #139,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       398: astore        4
       400: aload         4
       402: invokeinterface #145,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       407: ifeq          447
       410: aload         4
       412: invokeinterface #150,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       417: checkcast     #154                // class ext/mods/gameserver/scripting/Quest
       420: astore        5
       422: aload         5
       424: aload_0
       425: getfield      #25                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       428: checkcast     #156                // class ext/mods/gameserver/model/actor/Npc
       431: aload_0
       432: getfield      #25                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       435: checkcast     #156                // class ext/mods/gameserver/model/actor/Npc
       438: aload_1
       439: iload_2
       440: aconst_null
       441: invokevirtual #200                // Method ext/mods/gameserver/scripting/Quest.onClanAttacked:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;ILext/mods/gameserver/skills/L2Skill;)V
       444: goto          400
       447: aload_0
       448: getfield      #25                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       451: checkcast     #29                 // class ext/mods/gameserver/model/actor/Attackable
       454: ldc           #29                 // class ext/mods/gameserver/model/actor/Attackable
       456: aload_0
       457: getfield      #25                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       460: checkcast     #29                 // class ext/mods/gameserver/model/actor/Attackable
       463: invokevirtual #123                // Method ext/mods/gameserver/model/actor/Attackable.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
       466: invokevirtual #194                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getClanRange:()I
       469: aload_0
       470: aload_3
       471: aload_1
       472: iload_2
       473: invokedynamic #204,  0            // InvokeDynamic #1:accept:(Lext/mods/gameserver/model/actor/ai/type/AttackableAI;[Ljava/lang/String;Lext/mods/gameserver/model/actor/Creature;I)Ljava/util/function/Consumer;
       478: invokevirtual #208                // Method ext/mods/gameserver/model/actor/Attackable.forEachKnownTypeInRadius:(Ljava/lang/Class;ILjava/util/function/Consumer;)V
       481: return
      LineNumberTable:
        line 129: 0
        line 130: 42
        line 132: 60
        line 134: 86
        line 135: 128
        line 137: 152
        line 138: 163
        line 140: 174
        line 141: 213
        line 144: 231
        line 146: 270
        line 147: 278
        line 149: 281
        line 150: 321
        line 151: 340
        line 154: 343
        line 155: 357
        line 157: 377
        line 158: 422
        line 160: 447
        line 178: 481
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           42      15     4 quest   Lext/mods/gameserver/scripting/Quest;
          128      21     4 quest   Lext/mods/gameserver/scripting/Quest;
          213      15     5 quest   Lext/mods/gameserver/scripting/Quest;
          321      16     7 quest   Lext/mods/gameserver/scripting/Quest;
          270      70     5 minion   Lext/mods/gameserver/model/actor/Npc;
          163     180     3 master   Lext/mods/gameserver/model/actor/Npc;
          422      22     5 quest   Lext/mods/gameserver/scripting/Quest;
            0     482     0  this   Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
            0     482     1 target   Lext/mods/gameserver/model/actor/Creature;
            0     482     2 aggro   I
          357     125     3 actorClans   [Ljava/lang/String;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0     482     0  this   Lext/mods/gameserver/model/actor/ai/type/AttackableAI<TT;>;
      StackMapTable: number_of_entries = 15
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 37
        frame_type = 25 /* same */
        frame_type = 252 /* append */
          offset_delta = 21
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 43
        frame_type = 253 /* append */
          offset_delta = 38
          locals = [ class ext/mods/gameserver/model/actor/Npc, class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 39
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 32
          locals = [ class ext/mods/gameserver/model/actor/Npc ]
        frame_type = 252 /* append */
          offset_delta = 17
          locals = [ class java/util/Iterator ]
        frame_type = 249 /* chop */
          offset_delta = 40
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 253 /* append */
          offset_delta = 56
          locals = [ class "[Ljava/lang/String;", class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 46
        frame_type = 33 /* same */

  public boolean canScheduleAfter(ext.mods.gameserver.enums.IntentionType, ext.mods.gameserver.enums.IntentionType);
    descriptor: (Lext/mods/gameserver/enums/IntentionType;Lext/mods/gameserver/enums/IntentionType;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=3, args_size=3
         0: iconst_0
         1: ireturn
      LineNumberTable:
        line 192: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
            0       2     1 oldIntention   Lext/mods/gameserver/enums/IntentionType;
            0       2     2 newIntention   Lext/mods/gameserver/enums/IntentionType;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/ai/type/AttackableAI<TT;>;
}
Signature: #294                         // <T:Lext/mods/gameserver/model/actor/Attackable;>Lext/mods/gameserver/model/actor/ai/type/NpcAI<TT;>;
SourceFile: "AttackableAI.java"
BootstrapMethods:
  0: #308 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #298 ()V
      #299 REF_invokeVirtual ext/mods/gameserver/model/actor/ai/type/AttackableAI.lambda$thinkWander$0:()V
      #298 ()V
  1: #308 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #302 (Ljava/lang/Object;)V
      #304 REF_invokeVirtual ext/mods/gameserver/model/actor/ai/type/AttackableAI.lambda$onEvtAggression$0:([Ljava/lang/String;Lext/mods/gameserver/model/actor/Creature;ILext/mods/gameserver/model/actor/Attackable;)V
      #307 (Lext/mods/gameserver/model/actor/Attackable;)V
InnerClasses:
  public static final #320= #316 of #318; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
