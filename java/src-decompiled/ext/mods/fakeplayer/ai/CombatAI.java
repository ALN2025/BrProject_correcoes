// Bytecode for: ext.mods.fakeplayer.ai.CombatAI
// File: ext\mods\fakeplayer\ai\CombatAI.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/fakeplayer/ai/CombatAI.class
  Last modified 9 de jul de 2026; size 18412 bytes
  MD5 checksum 720dd944c774fe69401ad11b077965c8
  Compiled from "CombatAI.java"
public abstract class ext.mods.fakeplayer.ai.CombatAI extends ext.mods.fakeplayer.ai.FakePlayerAI
  minor version: 0
  major version: 69
  flags: (0x0421) ACC_PUBLIC, ACC_SUPER, ACC_ABSTRACT
  this_class: #14                         // ext/mods/fakeplayer/ai/CombatAI
  super_class: #2                         // ext/mods/fakeplayer/ai/FakePlayerAI
  interfaces: 0, fields: 9, methods: 34, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/fakeplayer/ai/FakePlayerAI."<init>":(Lext/mods/fakeplayer/FakePlayer;)V
    #2 = Class              #4            // ext/mods/fakeplayer/ai/FakePlayerAI
    #3 = NameAndType        #5:#6         // "<init>":(Lext/mods/fakeplayer/FakePlayer;)V
    #4 = Utf8               ext/mods/fakeplayer/ai/FakePlayerAI
    #5 = Utf8               <init>
    #6 = Utf8               (Lext/mods/fakeplayer/FakePlayer;)V
    #7 = Methodref          #8.#9         // java/lang/System.currentTimeMillis:()J
    #8 = Class              #10           // java/lang/System
    #9 = NameAndType        #11:#12       // currentTimeMillis:()J
   #10 = Utf8               java/lang/System
   #11 = Utf8               currentTimeMillis
   #12 = Utf8               ()J
   #13 = Fieldref           #14.#15       // ext/mods/fakeplayer/ai/CombatAI.lastActionTime:J
   #14 = Class              #16           // ext/mods/fakeplayer/ai/CombatAI
   #15 = NameAndType        #17:#18       // lastActionTime:J
   #16 = Utf8               ext/mods/fakeplayer/ai/CombatAI
   #17 = Utf8               lastActionTime
   #18 = Utf8               J
   #19 = Long               60000l
   #21 = Fieldref           #14.#22       // ext/mods/fakeplayer/ai/CombatAI.INACTIVITY_TIMEOUT_MS:J
   #22 = NameAndType        #23:#18       // INACTIVITY_TIMEOUT_MS:J
   #23 = Utf8               INACTIVITY_TIMEOUT_MS
   #24 = Fieldref           #14.#25       // ext/mods/fakeplayer/ai/CombatAI.lastPeaceActionTime:J
   #25 = NameAndType        #26:#18       // lastPeaceActionTime:J
   #26 = Utf8               lastPeaceActionTime
   #27 = Long               10000l
   #29 = Fieldref           #14.#30       // ext/mods/fakeplayer/ai/CombatAI.PEACE_ACTION_INTERVAL:J
   #30 = NameAndType        #31:#18       // PEACE_ACTION_INTERVAL:J
   #31 = Utf8               PEACE_ACTION_INTERVAL
   #32 = Fieldref           #14.#33       // ext/mods/fakeplayer/ai/CombatAI.isSitting:Z
   #33 = NameAndType        #34:#35       // isSitting:Z
   #34 = Utf8               isSitting
   #35 = Utf8               Z
   #36 = String             #37           // Giran
   #37 = Utf8               Giran
   #38 = Fieldref           #14.#39       // ext/mods/fakeplayer/ai/CombatAI._fakePlayer:Lext/mods/fakeplayer/FakePlayer;
   #39 = NameAndType        #40:#41       // _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
   #40 = Utf8               _fakePlayer
   #41 = Utf8               Lext/mods/fakeplayer/FakePlayer;
   #42 = Methodref          #14.#43       // ext/mods/fakeplayer/ai/CombatAI.getCityWaypoint:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/location/Location;
   #43 = NameAndType        #44:#45       // getCityWaypoint:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/location/Location;
   #44 = Utf8               getCityWaypoint
   #45 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/location/Location;
   #46 = Fieldref           #14.#47       // ext/mods/fakeplayer/ai/CombatAI.waypoint:Lext/mods/gameserver/model/location/Location;
   #47 = NameAndType        #48:#49       // waypoint:Lext/mods/gameserver/model/location/Location;
   #48 = Utf8               waypoint
   #49 = Utf8               Lext/mods/gameserver/model/location/Location;
   #50 = Methodref          #14.#51       // ext/mods/fakeplayer/ai/CombatAI.handleDeath:()V
   #51 = NameAndType        #52:#53       // handleDeath:()V
   #52 = Utf8               handleDeath
   #53 = Utf8               ()V
   #54 = Methodref          #55.#56       // ext/mods/fakeplayer/FakePlayer.setRunning:(Z)V
   #55 = Class              #57           // ext/mods/fakeplayer/FakePlayer
   #56 = NameAndType        #58:#59       // setRunning:(Z)V
   #57 = Utf8               ext/mods/fakeplayer/FakePlayer
   #58 = Utf8               setRunning
   #59 = Utf8               (Z)V
   #60 = Methodref          #14.#61       // ext/mods/fakeplayer/ai/CombatAI.colision:()Z
   #61 = NameAndType        #62:#63       // colision:()Z
   #62 = Utf8               colision
   #63 = Utf8               ()Z
   #64 = Methodref          #14.#65       // ext/mods/fakeplayer/ai/CombatAI.isPeaceZone:()Z
   #65 = NameAndType        #66:#63       // isPeaceZone:()Z
   #66 = Utf8               isPeaceZone
   #67 = Methodref          #14.#68       // ext/mods/fakeplayer/ai/CombatAI.performPeaceZoneBehavior:()V
   #68 = NameAndType        #69:#53       // performPeaceZoneBehavior:()V
   #69 = Utf8               performPeaceZoneBehavior
   #70 = Methodref          #14.#71       // ext/mods/fakeplayer/ai/CombatAI.isFighting:()Z
   #71 = NameAndType        #72:#63       // isFighting:()Z
   #72 = Utf8               isFighting
   #73 = Methodref          #55.#74       // ext/mods/fakeplayer/FakePlayer.isMoving:()Z
   #74 = NameAndType        #75:#63       // isMoving:()Z
   #75 = Utf8               isMoving
   #76 = Methodref          #14.#77       // ext/mods/fakeplayer/ai/CombatAI.teleportToSafeZone:()V
   #77 = NameAndType        #78:#53       // teleportToSafeZone:()V
   #78 = Utf8               teleportToSafeZone
   #79 = Fieldref           #80.#81       // ext/mods/gameserver/enums/ZoneId.PEACE:Lext/mods/gameserver/enums/ZoneId;
   #80 = Class              #82           // ext/mods/gameserver/enums/ZoneId
   #81 = NameAndType        #83:#84       // PEACE:Lext/mods/gameserver/enums/ZoneId;
   #82 = Utf8               ext/mods/gameserver/enums/ZoneId
   #83 = Utf8               PEACE
   #84 = Utf8               Lext/mods/gameserver/enums/ZoneId;
   #85 = Methodref          #55.#86       // ext/mods/fakeplayer/FakePlayer.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
   #86 = NameAndType        #87:#88       // isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
   #87 = Utf8               isInsideZone
   #88 = Utf8               (Lext/mods/gameserver/enums/ZoneId;)Z
   #89 = Double             120.0d
   #91 = Methodref          #55.#92       // ext/mods/fakeplayer/FakePlayer.getX:()I
   #92 = NameAndType        #93:#94       // getX:()I
   #93 = Utf8               getX
   #94 = Utf8               ()I
   #95 = Methodref          #55.#96       // ext/mods/fakeplayer/FakePlayer.getY:()I
   #96 = NameAndType        #97:#94       // getY:()I
   #97 = Utf8               getY
   #98 = Class              #99           // ext/mods/gameserver/model/actor/Player
   #99 = Utf8               ext/mods/gameserver/model/actor/Player
  #100 = Methodref          #55.#101      // ext/mods/fakeplayer/FakePlayer.getKnownType:(Ljava/lang/Class;)Ljava/util/List;
  #101 = NameAndType        #102:#103     // getKnownType:(Ljava/lang/Class;)Ljava/util/List;
  #102 = Utf8               getKnownType
  #103 = Utf8               (Ljava/lang/Class;)Ljava/util/List;
  #104 = InterfaceMethodref #105.#106     // java/util/List.iterator:()Ljava/util/Iterator;
  #105 = Class              #107          // java/util/List
  #106 = NameAndType        #108:#109     // iterator:()Ljava/util/Iterator;
  #107 = Utf8               java/util/List
  #108 = Utf8               iterator
  #109 = Utf8               ()Ljava/util/Iterator;
  #110 = InterfaceMethodref #111.#112     // java/util/Iterator.hasNext:()Z
  #111 = Class              #113          // java/util/Iterator
  #112 = NameAndType        #114:#63      // hasNext:()Z
  #113 = Utf8               java/util/Iterator
  #114 = Utf8               hasNext
  #115 = InterfaceMethodref #111.#116     // java/util/Iterator.next:()Ljava/lang/Object;
  #116 = NameAndType        #117:#118     // next:()Ljava/lang/Object;
  #117 = Utf8               next
  #118 = Utf8               ()Ljava/lang/Object;
  #119 = Methodref          #98.#120      // ext/mods/gameserver/model/actor/Player.isVisible:()Z
  #120 = NameAndType        #121:#63      // isVisible:()Z
  #121 = Utf8               isVisible
  #122 = Methodref          #98.#123      // ext/mods/gameserver/model/actor/Player.isDead:()Z
  #123 = NameAndType        #124:#63      // isDead:()Z
  #124 = Utf8               isDead
  #125 = Methodref          #98.#92       // ext/mods/gameserver/model/actor/Player.getX:()I
  #126 = Methodref          #98.#96       // ext/mods/gameserver/model/actor/Player.getY:()I
  #127 = Methodref          #128.#129     // java/lang/Math.sqrt:(D)D
  #128 = Class              #130          // java/lang/Math
  #129 = NameAndType        #131:#132     // sqrt:(D)D
  #130 = Utf8               java/lang/Math
  #131 = Utf8               sqrt
  #132 = Utf8               (D)D
  #133 = Methodref          #14.#134      // ext/mods/fakeplayer/ai/CombatAI.findFreeLocationNearby:(Lext/mods/fakeplayer/FakePlayer;D)Lext/mods/gameserver/model/location/Location;
  #134 = NameAndType        #135:#136     // findFreeLocationNearby:(Lext/mods/fakeplayer/FakePlayer;D)Lext/mods/gameserver/model/location/Location;
  #135 = Utf8               findFreeLocationNearby
  #136 = Utf8               (Lext/mods/fakeplayer/FakePlayer;D)Lext/mods/gameserver/model/location/Location;
  #137 = Methodref          #55.#138      // ext/mods/fakeplayer/FakePlayer.getMove:()Lext/mods/gameserver/model/actor/move/PlayerMove;
  #138 = NameAndType        #139:#140     // getMove:()Lext/mods/gameserver/model/actor/move/PlayerMove;
  #139 = Utf8               getMove
  #140 = Utf8               ()Lext/mods/gameserver/model/actor/move/PlayerMove;
  #141 = Methodref          #142.#143     // ext/mods/gameserver/model/actor/move/PlayerMove.maybeMoveToLocation:(Lext/mods/gameserver/model/location/Location;IZZ)Z
  #142 = Class              #144          // ext/mods/gameserver/model/actor/move/PlayerMove
  #143 = NameAndType        #145:#146     // maybeMoveToLocation:(Lext/mods/gameserver/model/location/Location;IZZ)Z
  #144 = Utf8               ext/mods/gameserver/model/actor/move/PlayerMove
  #145 = Utf8               maybeMoveToLocation
  #146 = Utf8               (Lext/mods/gameserver/model/location/Location;IZZ)Z
  #147 = Methodref          #148.#149     // ext/mods/commons/random/Rnd.get:(II)I
  #148 = Class              #150          // ext/mods/commons/random/Rnd
  #149 = NameAndType        #151:#152     // get:(II)I
  #150 = Utf8               ext/mods/commons/random/Rnd
  #151 = Utf8               get
  #152 = Utf8               (II)I
  #153 = Methodref          #55.#154      // ext/mods/fakeplayer/FakePlayer.getZ:()I
  #154 = NameAndType        #155:#94      // getZ:()I
  #155 = Utf8               getZ
  #156 = Methodref          #157.#158     // ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
  #157 = Class              #159          // ext/mods/gameserver/geoengine/GeoEngine
  #158 = NameAndType        #160:#161     // getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
  #159 = Utf8               ext/mods/gameserver/geoengine/GeoEngine
  #160 = Utf8               getInstance
  #161 = Utf8               ()Lext/mods/gameserver/geoengine/GeoEngine;
  #162 = Methodref          #157.#163     // ext/mods/gameserver/geoengine/GeoEngine.canMove:(IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
  #163 = NameAndType        #164:#165     // canMove:(IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
  #164 = Utf8               canMove
  #165 = Utf8               (IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
  #166 = Class              #167          // ext/mods/gameserver/model/location/Location
  #167 = Utf8               ext/mods/gameserver/model/location/Location
  #168 = Methodref          #166.#169     // ext/mods/gameserver/model/location/Location."<init>":(III)V
  #169 = NameAndType        #5:#170       // "<init>":(III)V
  #170 = Utf8               (III)V
  #171 = Methodref          #148.#172     // ext/mods/commons/random/Rnd.get:(I)I
  #172 = NameAndType        #151:#173     // get:(I)I
  #173 = Utf8               (I)I
  #174 = Methodref          #55.#175      // ext/mods/fakeplayer/FakePlayer.isFakePostion:()Lext/mods/gameserver/model/location/Location;
  #175 = NameAndType        #176:#177     // isFakePostion:()Lext/mods/gameserver/model/location/Location;
  #176 = Utf8               isFakePostion
  #177 = Utf8               ()Lext/mods/gameserver/model/location/Location;
  #178 = Methodref          #157.#179     // ext/mods/gameserver/geoengine/GeoEngine.getValidLocation:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/location/Location;
  #179 = NameAndType        #180:#181     // getValidLocation:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/location/Location;
  #180 = Utf8               getValidLocation
  #181 = Utf8               (Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/location/Location;
  #182 = Methodref          #166.#92      // ext/mods/gameserver/model/location/Location.getX:()I
  #183 = Methodref          #166.#96      // ext/mods/gameserver/model/location/Location.getY:()I
  #184 = Methodref          #166.#154     // ext/mods/gameserver/model/location/Location.getZ:()I
  #185 = Methodref          #14.#186      // ext/mods/fakeplayer/ai/CombatAI.getNearestNpc:()Lext/mods/gameserver/model/actor/Npc;
  #186 = NameAndType        #187:#188     // getNearestNpc:()Lext/mods/gameserver/model/actor/Npc;
  #187 = Utf8               getNearestNpc
  #188 = Utf8               ()Lext/mods/gameserver/model/actor/Npc;
  #189 = Methodref          #157.#190     // ext/mods/gameserver/geoengine/GeoEngine.canMoveToTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
  #190 = NameAndType        #191:#192     // canMoveToTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
  #191 = Utf8               canMoveToTarget
  #192 = Utf8               (Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
  #193 = Methodref          #194.#92      // ext/mods/gameserver/model/actor/Npc.getX:()I
  #194 = Class              #195          // ext/mods/gameserver/model/actor/Npc
  #195 = Utf8               ext/mods/gameserver/model/actor/Npc
  #196 = Methodref          #194.#96      // ext/mods/gameserver/model/actor/Npc.getY:()I
  #197 = Methodref          #194.#154     // ext/mods/gameserver/model/actor/Npc.getZ:()I
  #198 = Methodref          #55.#199      // ext/mods/fakeplayer/FakePlayer.getHeading:()I
  #199 = NameAndType        #200:#94      // getHeading:()I
  #200 = Utf8               getHeading
  #201 = Methodref          #55.#202      // ext/mods/fakeplayer/FakePlayer.sitDown:()Z
  #202 = NameAndType        #203:#63      // sitDown:()Z
  #203 = Utf8               sitDown
  #204 = InvokeDynamic      #0:#205       // #0:run:(Lext/mods/fakeplayer/ai/CombatAI;)Ljava/lang/Runnable;
  #205 = NameAndType        #206:#207     // run:(Lext/mods/fakeplayer/ai/CombatAI;)Ljava/lang/Runnable;
  #206 = Utf8               run
  #207 = Utf8               (Lext/mods/fakeplayer/ai/CombatAI;)Ljava/lang/Runnable;
  #208 = Methodref          #209.#210     // ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #209 = Class              #211          // ext/mods/commons/pool/ThreadPool
  #210 = NameAndType        #212:#213     // schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #211 = Utf8               ext/mods/commons/pool/ThreadPool
  #212 = Utf8               schedule
  #213 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #214 = Methodref          #14.#215      // ext/mods/fakeplayer/ai/CombatAI.getNearestTeleportNpc:()Lext/mods/gameserver/model/actor/Npc;
  #215 = NameAndType        #216:#188     // getNearestTeleportNpc:()Lext/mods/gameserver/model/actor/Npc;
  #216 = Utf8               getNearestTeleportNpc
  #217 = Methodref          #55.#218      // ext/mods/fakeplayer/FakePlayer.getFakeSaveLocation:()Lext/mods/gameserver/model/location/Location;
  #218 = NameAndType        #219:#177     // getFakeSaveLocation:()Lext/mods/gameserver/model/location/Location;
  #219 = Utf8               getFakeSaveLocation
  #220 = Methodref          #55.#221      // ext/mods/fakeplayer/FakePlayer.teleportToLocation:(IIII)V
  #221 = NameAndType        #222:#223     // teleportToLocation:(IIII)V
  #222 = Utf8               teleportToLocation
  #223 = Utf8               (IIII)V
  #224 = InterfaceMethodref #105.#225     // java/util/List.stream:()Ljava/util/stream/Stream;
  #225 = NameAndType        #226:#227     // stream:()Ljava/util/stream/Stream;
  #226 = Utf8               stream
  #227 = Utf8               ()Ljava/util/stream/Stream;
  #228 = InvokeDynamic      #1:#229       // #1:applyAsDouble:(Lext/mods/fakeplayer/ai/CombatAI;)Ljava/util/function/ToDoubleFunction;
  #229 = NameAndType        #230:#231     // applyAsDouble:(Lext/mods/fakeplayer/ai/CombatAI;)Ljava/util/function/ToDoubleFunction;
  #230 = Utf8               applyAsDouble
  #231 = Utf8               (Lext/mods/fakeplayer/ai/CombatAI;)Ljava/util/function/ToDoubleFunction;
  #232 = InterfaceMethodref #233.#234     // java/util/Comparator.comparingDouble:(Ljava/util/function/ToDoubleFunction;)Ljava/util/Comparator;
  #233 = Class              #235          // java/util/Comparator
  #234 = NameAndType        #236:#237     // comparingDouble:(Ljava/util/function/ToDoubleFunction;)Ljava/util/Comparator;
  #235 = Utf8               java/util/Comparator
  #236 = Utf8               comparingDouble
  #237 = Utf8               (Ljava/util/function/ToDoubleFunction;)Ljava/util/Comparator;
  #238 = InterfaceMethodref #239.#240     // java/util/stream/Stream.sorted:(Ljava/util/Comparator;)Ljava/util/stream/Stream;
  #239 = Class              #241          // java/util/stream/Stream
  #240 = NameAndType        #242:#243     // sorted:(Ljava/util/Comparator;)Ljava/util/stream/Stream;
  #241 = Utf8               java/util/stream/Stream
  #242 = Utf8               sorted
  #243 = Utf8               (Ljava/util/Comparator;)Ljava/util/stream/Stream;
  #244 = InterfaceMethodref #239.#245     // java/util/stream/Stream.findFirst:()Ljava/util/Optional;
  #245 = NameAndType        #246:#247     // findFirst:()Ljava/util/Optional;
  #246 = Utf8               findFirst
  #247 = Utf8               ()Ljava/util/Optional;
  #248 = Methodref          #249.#250     // java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
  #249 = Class              #251          // java/util/Optional
  #250 = NameAndType        #252:#253     // orElse:(Ljava/lang/Object;)Ljava/lang/Object;
  #251 = Utf8               java/util/Optional
  #252 = Utf8               orElse
  #253 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #254 = InvokeDynamic      #2:#255       // #2:test:()Ljava/util/function/Predicate;
  #255 = NameAndType        #256:#257     // test:()Ljava/util/function/Predicate;
  #256 = Utf8               test
  #257 = Utf8               ()Ljava/util/function/Predicate;
  #258 = InterfaceMethodref #239.#259     // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #259 = NameAndType        #260:#261     // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #260 = Utf8               filter
  #261 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #262 = InvokeDynamic      #3:#229       // #3:applyAsDouble:(Lext/mods/fakeplayer/ai/CombatAI;)Ljava/util/function/ToDoubleFunction;
  #263 = Methodref          #55.#264      // ext/mods/fakeplayer/FakePlayer.getTarget:()Lext/mods/gameserver/model/WorldObject;
  #264 = NameAndType        #265:#266     // getTarget:()Lext/mods/gameserver/model/WorldObject;
  #265 = Utf8               getTarget
  #266 = Utf8               ()Lext/mods/gameserver/model/WorldObject;
  #267 = Class              #268          // ext/mods/gameserver/model/actor/Creature
  #268 = Utf8               ext/mods/gameserver/model/actor/Creature
  #269 = Methodref          #55.#270      // ext/mods/fakeplayer/FakePlayer.forceAutoAttack:(Lext/mods/gameserver/model/actor/Creature;)V
  #270 = NameAndType        #271:#272     // forceAutoAttack:(Lext/mods/gameserver/model/actor/Creature;)V
  #271 = Utf8               forceAutoAttack
  #272 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
  #273 = Methodref          #148.#274     // ext/mods/commons/random/Rnd.nextDouble:()D
  #274 = NameAndType        #275:#276     // nextDouble:()D
  #275 = Utf8               nextDouble
  #276 = Utf8               ()D
  #277 = Methodref          #14.#278      // ext/mods/fakeplayer/ai/CombatAI.changeOfUsingSkill:()D
  #278 = NameAndType        #279:#276     // changeOfUsingSkill:()D
  #279 = Utf8               changeOfUsingSkill
  #280 = Methodref          #14.#281      // ext/mods/fakeplayer/ai/CombatAI.getBestAvailableFighterSkill:()Lext/mods/gameserver/skills/L2Skill;
  #281 = NameAndType        #282:#283     // getBestAvailableFighterSkill:()Lext/mods/gameserver/skills/L2Skill;
  #282 = Utf8               getBestAvailableFighterSkill
  #283 = Utf8               ()Lext/mods/gameserver/skills/L2Skill;
  #284 = Methodref          #14.#285      // ext/mods/fakeplayer/ai/CombatAI.castSpell:(Lext/mods/gameserver/skills/L2Skill;)V
  #285 = NameAndType        #286:#287     // castSpell:(Lext/mods/gameserver/skills/L2Skill;)V
  #286 = Utf8               castSpell
  #287 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)V
  #288 = Methodref          #14.#289      // ext/mods/fakeplayer/ai/CombatAI.getOffensiveSpells:()Ljava/util/List;
  #289 = NameAndType        #290:#291     // getOffensiveSpells:()Ljava/util/List;
  #290 = Utf8               getOffensiveSpells
  #291 = Utf8               ()Ljava/util/List;
  #292 = InterfaceMethodref #105.#293     // java/util/List.isEmpty:()Z
  #293 = NameAndType        #294:#63      // isEmpty:()Z
  #294 = Utf8               isEmpty
  #295 = InvokeDynamic      #4:#296       // #4:applyAsInt:()Ljava/util/function/ToIntFunction;
  #296 = NameAndType        #297:#298     // applyAsInt:()Ljava/util/function/ToIntFunction;
  #297 = Utf8               applyAsInt
  #298 = Utf8               ()Ljava/util/function/ToIntFunction;
  #299 = InterfaceMethodref #233.#300     // java/util/Comparator.comparingInt:(Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;
  #300 = NameAndType        #301:#302     // comparingInt:(Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;
  #301 = Utf8               comparingInt
  #302 = Utf8               (Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;
  #303 = InvokeDynamic      #5:#304       // #5:apply:(Lext/mods/fakeplayer/ai/CombatAI;)Ljava/util/function/Function;
  #304 = NameAndType        #305:#306     // apply:(Lext/mods/fakeplayer/ai/CombatAI;)Ljava/util/function/Function;
  #305 = Utf8               apply
  #306 = Utf8               (Lext/mods/fakeplayer/ai/CombatAI;)Ljava/util/function/Function;
  #307 = InterfaceMethodref #239.#308     // java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
  #308 = NameAndType        #309:#310     // map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
  #309 = Utf8               map
  #310 = Utf8               (Ljava/util/function/Function;)Ljava/util/stream/Stream;
  #311 = InvokeDynamic      #6:#255       // #6:test:()Ljava/util/function/Predicate;
  #312 = InvokeDynamic      #7:#313       // #7:test:(Lext/mods/fakeplayer/ai/CombatAI;)Ljava/util/function/Predicate;
  #313 = NameAndType        #256:#314     // test:(Lext/mods/fakeplayer/ai/CombatAI;)Ljava/util/function/Predicate;
  #314 = Utf8               (Lext/mods/fakeplayer/ai/CombatAI;)Ljava/util/function/Predicate;
  #315 = Class              #316          // ext/mods/gameserver/skills/L2Skill
  #316 = Utf8               ext/mods/gameserver/skills/L2Skill
  #317 = Methodref          #55.#318      // ext/mods/fakeplayer/FakePlayer.getCast:()Lext/mods/gameserver/model/actor/cast/PlayerCast;
  #318 = NameAndType        #319:#320     // getCast:()Lext/mods/gameserver/model/actor/cast/PlayerCast;
  #319 = Utf8               getCast
  #320 = Utf8               ()Lext/mods/gameserver/model/actor/cast/PlayerCast;
  #321 = Methodref          #322.#323     // ext/mods/gameserver/model/actor/cast/PlayerCast.isCastingNow:()Z
  #322 = Class              #324          // ext/mods/gameserver/model/actor/cast/PlayerCast
  #323 = NameAndType        #325:#63      // isCastingNow:()Z
  #324 = Utf8               ext/mods/gameserver/model/actor/cast/PlayerCast
  #325 = Utf8               isCastingNow
  #326 = Methodref          #14.#327      // ext/mods/fakeplayer/ai/CombatAI.getBestAvailableSpellForTarget:()Lext/mods/fakeplayer/model/BotSkill;
  #327 = NameAndType        #328:#329     // getBestAvailableSpellForTarget:()Lext/mods/fakeplayer/model/BotSkill;
  #328 = Utf8               getBestAvailableSpellForTarget
  #329 = Utf8               ()Lext/mods/fakeplayer/model/BotSkill;
  #330 = Methodref          #331.#332     // ext/mods/fakeplayer/model/BotSkill.getSkillId:()I
  #331 = Class              #333          // ext/mods/fakeplayer/model/BotSkill
  #332 = NameAndType        #334:#94      // getSkillId:()I
  #333 = Utf8               ext/mods/fakeplayer/model/BotSkill
  #334 = Utf8               getSkillId
  #335 = Methodref          #55.#336      // ext/mods/fakeplayer/FakePlayer.getSkill:(I)Lext/mods/gameserver/skills/L2Skill;
  #336 = NameAndType        #337:#338     // getSkill:(I)Lext/mods/gameserver/skills/L2Skill;
  #337 = Utf8               getSkill
  #338 = Utf8               (I)Lext/mods/gameserver/skills/L2Skill;
  #339 = InterfaceMethodref #239.#340     // java/util/stream/Stream.toList:()Ljava/util/List;
  #340 = NameAndType        #341:#291     // toList:()Ljava/util/List;
  #341 = Utf8               toList
  #342 = Methodref          #315.#343     // ext/mods/gameserver/skills/L2Skill.getCastRange:()I
  #343 = NameAndType        #344:#94      // getCastRange:()I
  #344 = Utf8               getCastRange
  #345 = Methodref          #157.#346     // ext/mods/gameserver/geoengine/GeoEngine.canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
  #346 = NameAndType        #347:#192     // canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
  #347 = Utf8               canSeeTarget
  #348 = Methodref          #55.#349      // ext/mods/fakeplayer/FakePlayer.checkUseMagicConditions:(Lext/mods/gameserver/skills/L2Skill;ZZ)Z
  #349 = NameAndType        #350:#351     // checkUseMagicConditions:(Lext/mods/gameserver/skills/L2Skill;ZZ)Z
  #350 = Utf8               checkUseMagicConditions
  #351 = Utf8               (Lext/mods/gameserver/skills/L2Skill;ZZ)Z
  #352 = Methodref          #14.#353      // ext/mods/fakeplayer/ai/CombatAI.getHealingSpells:()Ljava/util/List;
  #353 = NameAndType        #354:#291     // getHealingSpells:()Ljava/util/List;
  #354 = Utf8               getHealingSpells
  #355 = InvokeDynamic      #8:#296       // #8:applyAsInt:()Ljava/util/function/ToIntFunction;
  #356 = InvokeDynamic      #9:#313       // #9:test:(Lext/mods/fakeplayer/ai/CombatAI;)Ljava/util/function/Predicate;
  #357 = InvokeDynamic      #10:#358      // #10:apply:()Ljava/util/function/Function;
  #358 = NameAndType        #305:#359     // apply:()Ljava/util/function/Function;
  #359 = Utf8               ()Ljava/util/function/Function;
  #360 = Class              #361          // ext/mods/fakeplayer/model/HealingSpell
  #361 = Utf8               ext/mods/fakeplayer/model/HealingSpell
  #362 = Methodref          #55.#363      // ext/mods/fakeplayer/FakePlayer.getAllEffects:()[Lext/mods/gameserver/skills/AbstractEffect;
  #363 = NameAndType        #364:#365     // getAllEffects:()[Lext/mods/gameserver/skills/AbstractEffect;
  #364 = Utf8               getAllEffects
  #365 = Utf8               ()[Lext/mods/gameserver/skills/AbstractEffect;
  #366 = Methodref          #367.#368     // java/util/Arrays.stream:([Ljava/lang/Object;)Ljava/util/stream/Stream;
  #367 = Class              #369          // java/util/Arrays
  #368 = NameAndType        #226:#370     // stream:([Ljava/lang/Object;)Ljava/util/stream/Stream;
  #369 = Utf8               java/util/Arrays
  #370 = Utf8               ([Ljava/lang/Object;)Ljava/util/stream/Stream;
  #371 = InvokeDynamic      #11:#358      // #11:apply:()Ljava/util/function/Function;
  #372 = Methodref          #373.#374     // java/util/stream/Collectors.toList:()Ljava/util/stream/Collector;
  #373 = Class              #375          // java/util/stream/Collectors
  #374 = NameAndType        #341:#376     // toList:()Ljava/util/stream/Collector;
  #375 = Utf8               java/util/stream/Collectors
  #376 = Utf8               ()Ljava/util/stream/Collector;
  #377 = InterfaceMethodref #239.#378     // java/util/stream/Stream.collect:(Ljava/util/stream/Collector;)Ljava/lang/Object;
  #378 = NameAndType        #379:#380     // collect:(Ljava/util/stream/Collector;)Ljava/lang/Object;
  #379 = Utf8               collect
  #380 = Utf8               (Ljava/util/stream/Collector;)Ljava/lang/Object;
  #381 = Methodref          #14.#382      // ext/mods/fakeplayer/ai/CombatAI.getSelfSupportSpells:()Ljava/util/List;
  #382 = NameAndType        #383:#291     // getSelfSupportSpells:()Ljava/util/List;
  #383 = Utf8               getSelfSupportSpells
  #384 = Class              #385          // ext/mods/fakeplayer/model/SupportSpell
  #385 = Utf8               ext/mods/fakeplayer/model/SupportSpell
  #386 = Methodref          #384.#332     // ext/mods/fakeplayer/model/SupportSpell.getSkillId:()I
  #387 = Methodref          #388.#389     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #388 = Class              #390          // java/lang/Integer
  #389 = NameAndType        #391:#392     // valueOf:(I)Ljava/lang/Integer;
  #390 = Utf8               java/lang/Integer
  #391 = Utf8               valueOf
  #392 = Utf8               (I)Ljava/lang/Integer;
  #393 = InterfaceMethodref #105.#394     // java/util/List.contains:(Ljava/lang/Object;)Z
  #394 = NameAndType        #395:#396     // contains:(Ljava/lang/Object;)Z
  #395 = Utf8               contains
  #396 = Utf8               (Ljava/lang/Object;)Z
  #397 = Methodref          #398.#399     // ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
  #398 = Class              #400          // ext/mods/gameserver/data/SkillTable
  #399 = NameAndType        #160:#401     // getInstance:()Lext/mods/gameserver/data/SkillTable;
  #400 = Utf8               ext/mods/gameserver/data/SkillTable
  #401 = Utf8               ()Lext/mods/gameserver/data/SkillTable;
  #402 = Methodref          #55.#403      // ext/mods/fakeplayer/FakePlayer.getSkillLevel:(I)I
  #403 = NameAndType        #404:#173     // getSkillLevel:(I)I
  #404 = Utf8               getSkillLevel
  #405 = Methodref          #398.#406     // ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
  #406 = NameAndType        #407:#408     // getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
  #407 = Utf8               getInfo
  #408 = Utf8               (II)Lext/mods/gameserver/skills/L2Skill;
  #409 = Fieldref           #410.#411     // ext/mods/fakeplayer/ai/CombatAI$1.$SwitchMap$ext$mods$fakeplayer$model$SpellUsageCondition:[I
  #410 = Class              #412          // ext/mods/fakeplayer/ai/CombatAI$1
  #411 = NameAndType        #413:#414     // $SwitchMap$ext$mods$fakeplayer$model$SpellUsageCondition:[I
  #412 = Utf8               ext/mods/fakeplayer/ai/CombatAI$1
  #413 = Utf8               $SwitchMap$ext$mods$fakeplayer$model$SpellUsageCondition
  #414 = Utf8               [I
  #415 = Methodref          #384.#416     // ext/mods/fakeplayer/model/SupportSpell.getCondition:()Lext/mods/fakeplayer/model/SpellUsageCondition;
  #416 = NameAndType        #417:#418     // getCondition:()Lext/mods/fakeplayer/model/SpellUsageCondition;
  #417 = Utf8               getCondition
  #418 = Utf8               ()Lext/mods/fakeplayer/model/SpellUsageCondition;
  #419 = Methodref          #420.#421     // ext/mods/fakeplayer/model/SpellUsageCondition.ordinal:()I
  #420 = Class              #422          // ext/mods/fakeplayer/model/SpellUsageCondition
  #421 = NameAndType        #423:#94      // ordinal:()I
  #422 = Utf8               ext/mods/fakeplayer/model/SpellUsageCondition
  #423 = Utf8               ordinal
  #424 = Double             100.0d
  #426 = Methodref          #55.#427      // ext/mods/fakeplayer/FakePlayer.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #427 = NameAndType        #428:#429     // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #428 = Utf8               getStatus
  #429 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #430 = Methodref          #431.#432     // ext/mods/gameserver/model/actor/status/PlayerStatus.getMaxHp:()I
  #431 = Class              #433          // ext/mods/gameserver/model/actor/status/PlayerStatus
  #432 = NameAndType        #434:#94      // getMaxHp:()I
  #433 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
  #434 = Utf8               getMaxHp
  #435 = Methodref          #431.#436     // ext/mods/gameserver/model/actor/status/PlayerStatus.getHp:()D
  #436 = NameAndType        #437:#276     // getHp:()D
  #437 = Utf8               getHp
  #438 = Methodref          #128.#439     // java/lang/Math.round:(D)J
  #439 = NameAndType        #440:#441     // round:(D)J
  #440 = Utf8               round
  #441 = Utf8               (D)J
  #442 = Methodref          #384.#443     // ext/mods/fakeplayer/model/SupportSpell.getConditionValue:()I
  #443 = NameAndType        #444:#94      // getConditionValue:()I
  #444 = Utf8               getConditionValue
  #445 = Methodref          #14.#446      // ext/mods/fakeplayer/ai/CombatAI.castSelfSpell:(Lext/mods/gameserver/skills/L2Skill;)V
  #446 = NameAndType        #447:#287     // castSelfSpell:(Lext/mods/gameserver/skills/L2Skill;)V
  #447 = Utf8               castSelfSpell
  #448 = Methodref          #14.#449      // ext/mods/fakeplayer/ai/CombatAI.getMissingHealth:()D
  #449 = NameAndType        #450:#276     // getMissingHealth:()D
  #450 = Utf8               getMissingHealth
  #451 = Methodref          #431.#452     // ext/mods/gameserver/model/actor/status/PlayerStatus.getMaxCp:()I
  #452 = NameAndType        #453:#94      // getMaxCp:()I
  #453 = Utf8               getMaxCp
  #454 = Methodref          #431.#455     // ext/mods/gameserver/model/actor/status/PlayerStatus.getCp:()D
  #455 = NameAndType        #456:#276     // getCp:()D
  #456 = Utf8               getCp
  #457 = Methodref          #431.#458     // ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
  #458 = NameAndType        #459:#94      // getLevel:()I
  #459 = Utf8               getLevel
  #460 = Methodref          #14.#461      // ext/mods/fakeplayer/ai/CombatAI.getShotType:()Lext/mods/gameserver/enums/items/ShotType;
  #461 = NameAndType        #462:#463     // getShotType:()Lext/mods/gameserver/enums/items/ShotType;
  #462 = Utf8               getShotType
  #463 = Utf8               ()Lext/mods/gameserver/enums/items/ShotType;
  #464 = Fieldref           #465.#466     // ext/mods/gameserver/enums/items/ShotType.SOULSHOT:Lext/mods/gameserver/enums/items/ShotType;
  #465 = Class              #467          // ext/mods/gameserver/enums/items/ShotType
  #466 = NameAndType        #468:#469     // SOULSHOT:Lext/mods/gameserver/enums/items/ShotType;
  #467 = Utf8               ext/mods/gameserver/enums/items/ShotType
  #468 = Utf8               SOULSHOT
  #469 = Utf8               Lext/mods/gameserver/enums/items/ShotType;
  #470 = Methodref          #55.#471      // ext/mods/fakeplayer/FakePlayer.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #471 = NameAndType        #472:#473     // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #472 = Utf8               getInventory
  #473 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #474 = Methodref          #14.#475      // ext/mods/fakeplayer/ai/CombatAI.getShotId:()I
  #475 = NameAndType        #476:#94      // getShotId:()I
  #476 = Utf8               getShotId
  #477 = Methodref          #478.#479     // ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #478 = Class              #480          // ext/mods/gameserver/model/itemcontainer/PcInventory
  #479 = NameAndType        #481:#482     // getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #480 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
  #481 = Utf8               getItemByItemId
  #482 = Utf8               (I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #483 = Methodref          #484.#485     // ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
  #484 = Class              #486          // ext/mods/gameserver/model/item/instance/ItemInstance
  #485 = NameAndType        #487:#94      // getCount:()I
  #486 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
  #487 = Utf8               getCount
  #488 = Methodref          #478.#489     // ext/mods/gameserver/model/itemcontainer/PcInventory.addItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #489 = NameAndType        #490:#491     // addItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #490 = Utf8               addItem
  #491 = Utf8               (II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #492 = Methodref          #55.#493      // ext/mods/fakeplayer/FakePlayer.getAutoSoulShot:()Ljava/util/Set;
  #493 = NameAndType        #494:#495     // getAutoSoulShot:()Ljava/util/Set;
  #494 = Utf8               getAutoSoulShot
  #495 = Utf8               ()Ljava/util/Set;
  #496 = InterfaceMethodref #497.#293     // java/util/Set.isEmpty:()Z
  #497 = Class              #498          // java/util/Set
  #498 = Utf8               java/util/Set
  #499 = Methodref          #55.#500      // ext/mods/fakeplayer/FakePlayer.addAutoSoulShot:(I)V
  #500 = NameAndType        #501:#502     // addAutoSoulShot:(I)V
  #501 = Utf8               addAutoSoulShot
  #502 = Utf8               (I)V
  #503 = Methodref          #55.#504      // ext/mods/fakeplayer/FakePlayer.getActiveWeaponInstance:()Lext/mods/gameserver/model/item/instance/ItemInstance;
  #504 = NameAndType        #505:#506     // getActiveWeaponInstance:()Lext/mods/gameserver/model/item/instance/ItemInstance;
  #505 = Utf8               getActiveWeaponInstance
  #506 = Utf8               ()Lext/mods/gameserver/model/item/instance/ItemInstance;
  #507 = Methodref          #484.#508     // ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
  #508 = NameAndType        #509:#510     // getItem:()Lext/mods/gameserver/model/item/kind/Item;
  #509 = Utf8               getItem
  #510 = Utf8               ()Lext/mods/gameserver/model/item/kind/Item;
  #511 = Methodref          #512.#513     // ext/mods/gameserver/model/item/kind/Item.getCrystalType:()Lext/mods/gameserver/enums/items/CrystalType;
  #512 = Class              #514          // ext/mods/gameserver/model/item/kind/Item
  #513 = NameAndType        #515:#516     // getCrystalType:()Lext/mods/gameserver/enums/items/CrystalType;
  #514 = Utf8               ext/mods/gameserver/model/item/kind/Item
  #515 = Utf8               getCrystalType
  #516 = Utf8               ()Lext/mods/gameserver/enums/items/CrystalType;
  #517 = Methodref          #55.#518      // ext/mods/fakeplayer/FakePlayer.getActiveWeaponItem:()Lext/mods/gameserver/model/item/kind/Weapon;
  #518 = NameAndType        #519:#520     // getActiveWeaponItem:()Lext/mods/gameserver/model/item/kind/Weapon;
  #519 = Utf8               getActiveWeaponItem
  #520 = Utf8               ()Lext/mods/gameserver/model/item/kind/Weapon;
  #521 = Methodref          #522.#513     // ext/mods/gameserver/model/item/kind/Weapon.getCrystalType:()Lext/mods/gameserver/enums/items/CrystalType;
  #522 = Class              #523          // ext/mods/gameserver/model/item/kind/Weapon
  #523 = Utf8               ext/mods/gameserver/model/item/kind/Weapon
  #524 = Methodref          #55.#525      // ext/mods/fakeplayer/FakePlayer.rechargeShots:(ZZ)V
  #525 = NameAndType        #526:#527     // rechargeShots:(ZZ)V
  #526 = Utf8               rechargeShots
  #527 = Utf8               (ZZ)V
  #528 = Methodref          #55.#529      // ext/mods/fakeplayer/FakePlayer.getSummon:()Lext/mods/gameserver/model/actor/Summon;
  #529 = NameAndType        #530:#531     // getSummon:()Lext/mods/gameserver/model/actor/Summon;
  #530 = Utf8               getSummon
  #531 = Utf8               ()Lext/mods/gameserver/model/actor/Summon;
  #532 = Methodref          #533.#525     // ext/mods/gameserver/model/actor/Summon.rechargeShots:(ZZ)V
  #533 = Class              #534          // ext/mods/gameserver/model/actor/Summon
  #534 = Utf8               ext/mods/gameserver/model/actor/Summon
  #535 = Methodref          #55.#536      // ext/mods/fakeplayer/FakePlayer.getAttack:()Lext/mods/gameserver/model/actor/attack/PlayerAttack;
  #536 = NameAndType        #537:#538     // getAttack:()Lext/mods/gameserver/model/actor/attack/PlayerAttack;
  #537 = Utf8               getAttack
  #538 = Utf8               ()Lext/mods/gameserver/model/actor/attack/PlayerAttack;
  #539 = Methodref          #540.#541     // ext/mods/gameserver/model/actor/attack/PlayerAttack.isAttackingNow:()Z
  #540 = Class              #542          // ext/mods/gameserver/model/actor/attack/PlayerAttack
  #541 = NameAndType        #543:#63      // isAttackingNow:()Z
  #542 = Utf8               ext/mods/gameserver/model/actor/attack/PlayerAttack
  #543 = Utf8               isAttackingNow
  #544 = Methodref          #55.#545      // ext/mods/fakeplayer/FakePlayer.isFakeLocationRandom:()Lext/mods/gameserver/model/location/Location;
  #545 = NameAndType        #546:#177     // isFakeLocationRandom:()Lext/mods/gameserver/model/location/Location;
  #546 = Utf8               isFakeLocationRandom
  #547 = Methodref          #55.#548      // ext/mods/fakeplayer/FakePlayer.setFakeSaveLocation:(Lext/mods/gameserver/model/location/Location;)V
  #548 = NameAndType        #549:#550     // setFakeSaveLocation:(Lext/mods/gameserver/model/location/Location;)V
  #549 = Utf8               setFakeSaveLocation
  #550 = Utf8               (Lext/mods/gameserver/model/location/Location;)V
  #551 = Integer            83400
  #552 = Integer            147943
  #553 = Fieldref           #8.#554       // java/lang/System.out:Ljava/io/PrintStream;
  #554 = NameAndType        #555:#556     // out:Ljava/io/PrintStream;
  #555 = Utf8               out
  #556 = Utf8               Ljava/io/PrintStream;
  #557 = Methodref          #55.#558      // ext/mods/fakeplayer/FakePlayer.getName:()Ljava/lang/String;
  #558 = NameAndType        #559:#560     // getName:()Ljava/lang/String;
  #559 = Utf8               getName
  #560 = Utf8               ()Ljava/lang/String;
  #561 = InvokeDynamic      #12:#562      // #12:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #562 = NameAndType        #563:#564     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #563 = Utf8               makeConcatWithConstants
  #564 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #565 = Methodref          #566.#567     // java/io/PrintStream.println:(Ljava/lang/String;)V
  #566 = Class              #568          // java/io/PrintStream
  #567 = NameAndType        #569:#570     // println:(Ljava/lang/String;)V
  #568 = Utf8               java/io/PrintStream
  #569 = Utf8               println
  #570 = Utf8               (Ljava/lang/String;)V
  #571 = Methodref          #572.#573     // ext/mods/gameserver/skills/AbstractEffect.getSkill:()Lext/mods/gameserver/skills/L2Skill;
  #572 = Class              #574          // ext/mods/gameserver/skills/AbstractEffect
  #573 = NameAndType        #337:#283     // getSkill:()Lext/mods/gameserver/skills/L2Skill;
  #574 = Utf8               ext/mods/gameserver/skills/AbstractEffect
  #575 = Methodref          #315.#576     // ext/mods/gameserver/skills/L2Skill.getId:()I
  #576 = NameAndType        #577:#94      // getId:()I
  #577 = Utf8               getId
  #578 = Methodref          #579.#332     // ext/mods/fakeplayer/model/OffensiveSpell.getSkillId:()I
  #579 = Class              #580          // ext/mods/fakeplayer/model/OffensiveSpell
  #580 = Utf8               ext/mods/fakeplayer/model/OffensiveSpell
  #581 = Methodref          #582.#583     // ext/mods/commons/math/MathUtil.calculateDistance:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;Z)D
  #582 = Class              #584          // ext/mods/commons/math/MathUtil
  #583 = NameAndType        #585:#586     // calculateDistance:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;Z)D
  #584 = Utf8               ext/mods/commons/math/MathUtil
  #585 = Utf8               calculateDistance
  #586 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;Z)D
  #587 = Methodref          #194.#588     // ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #588 = NameAndType        #589:#590     // getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #589 = Utf8               getTemplate
  #590 = Utf8               ()Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #591 = Methodref          #592.#593     // ext/mods/gameserver/model/actor/template/NpcTemplate.getType:()Ljava/lang/String;
  #592 = Class              #594          // ext/mods/gameserver/model/actor/template/NpcTemplate
  #593 = NameAndType        #595:#560     // getType:()Ljava/lang/String;
  #594 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
  #595 = Utf8               getType
  #596 = String             #597          // Gatekeeper
  #597 = Utf8               Gatekeeper
  #598 = Methodref          #599.#600     // java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
  #599 = Class              #601          // java/lang/String
  #600 = NameAndType        #602:#603     // equalsIgnoreCase:(Ljava/lang/String;)Z
  #601 = Utf8               java/lang/String
  #602 = Utf8               equalsIgnoreCase
  #603 = Utf8               (Ljava/lang/String;)Z
  #604 = Methodref          #55.#605      // ext/mods/fakeplayer/FakePlayer.standUp:()V
  #605 = NameAndType        #606:#53      // standUp:()V
  #606 = Utf8               standUp
  #607 = Utf8               ConstantValue
  #608 = Utf8               RETURN_X
  #609 = Utf8               I
  #610 = Utf8               RETURN_Y
  #611 = Utf8               RETURN_Z
  #612 = Integer            -3400
  #613 = Utf8               Code
  #614 = Utf8               LineNumberTable
  #615 = Utf8               LocalVariableTable
  #616 = Utf8               this
  #617 = Utf8               Lext/mods/fakeplayer/ai/CombatAI;
  #618 = Utf8               character
  #619 = Utf8               thinkAndAct
  #620 = Utf8               StackMapTable
  #621 = Utf8               newLoc
  #622 = Utf8               dx
  #623 = Utf8               D
  #624 = Utf8               dy
  #625 = Utf8               distance
  #626 = Utf8               player
  #627 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #628 = Utf8               minSafeDistance
  #629 = Utf8               fx
  #630 = Utf8               fy
  #631 = Utf8               offsetX
  #632 = Utf8               offsetY
  #633 = Utf8               newX
  #634 = Utf8               newY
  #635 = Utf8               newZ
  #636 = Utf8               i
  #637 = Utf8               fakePlayer
  #638 = Utf8               radius
  #639 = Utf8               tryLimit
  #640 = Utf8               correctedLoc
  #641 = Utf8               locNpc
  #642 = Utf8               nearestNpc
  #643 = Utf8               Lext/mods/gameserver/model/actor/Npc;
  #644 = Utf8               dCx
  #645 = Utf8               dCy
  #646 = Utf8               locMove
  #647 = Utf8               loc
  #648 = Utf8               teleportNpc
  #649 = Utf8               savedLoc
  #650 = Utf8               action
  #651 = Utf8               tryAttackingUsingFighterOffensiveSkill
  #652 = Utf8               skill
  #653 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #654 = Utf8               tryAttackingUsingMageOffensiveSkill
  #655 = Utf8               selectedSkill
  #656 = Utf8               Lext/mods/fakeplayer/model/BotSkill;
  #657 = Utf8               botSkill
  #658 = Utf8               sortedSpells
  #659 = Utf8               Ljava/util/List;
  #660 = Utf8               LocalVariableTypeTable
  #661 = Utf8               Ljava/util/List<Lext/mods/fakeplayer/model/OffensiveSpell;>;
  #662 = Utf8               getBestAvailableHealingSpell
  #663 = Utf8               ()Lext/mods/fakeplayer/model/HealingSpell;
  #664 = Utf8               canCastSkill
  #665 = Utf8               (Lext/mods/fakeplayer/model/BotSkill;)Z
  #666 = Utf8               selfSupportBuffs
  #667 = Utf8               selfBuff
  #668 = Utf8               Lext/mods/fakeplayer/model/SupportSpell;
  #669 = Utf8               activeEffects
  #670 = Utf8               Ljava/util/List<Ljava/lang/Integer;>;
  #671 = Utf8               playerLevel
  #672 = Utf8               getArrowId
  #673 = Utf8               handleShots
  #674 = Utf8               item
  #675 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #676 = Utf8               Signature
  #677 = Utf8               ()Ljava/util/List<Lext/mods/fakeplayer/model/OffensiveSpell;>;
  #678 = Utf8               ()Ljava/util/List<Lext/mods/fakeplayer/model/SupportSpell;>;
  #679 = Utf8               ()Ljava/util/List<Lext/mods/fakeplayer/model/HealingSpell;>;
  #680 = Utf8               lambda$selfSupportBuffs$0
  #681 = Utf8               (Lext/mods/gameserver/skills/AbstractEffect;)Ljava/lang/Integer;
  #682 = Utf8               x
  #683 = Utf8               Lext/mods/gameserver/skills/AbstractEffect;
  #684 = Utf8               lambda$getBestAvailableHealingSpell$0
  #685 = Utf8               (Lext/mods/fakeplayer/model/HealingSpell;)Lext/mods/fakeplayer/model/HealingSpell;
  #686 = Utf8               Lext/mods/fakeplayer/model/HealingSpell;
  #687 = Utf8               lambda$getBestAvailableFighterSkill$1
  #688 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)Z
  #689 = Utf8               lambda$getBestAvailableFighterSkill$0
  #690 = Utf8               (Lext/mods/fakeplayer/model/OffensiveSpell;)Lext/mods/gameserver/skills/L2Skill;
  #691 = Utf8               spell
  #692 = Utf8               Lext/mods/fakeplayer/model/OffensiveSpell;
  #693 = Utf8               lambda$getNearestTeleportNpc$1
  #694 = Utf8               (Lext/mods/gameserver/model/actor/Npc;)D
  #695 = Utf8               n
  #696 = Utf8               lambda$getNearestTeleportNpc$0
  #697 = Utf8               (Lext/mods/gameserver/model/actor/Npc;)Z
  #698 = Utf8               lambda$getNearestNpc$0
  #699 = Utf8               lambda$performPeaceZoneBehavior$0
  #700 = Utf8               SourceFile
  #701 = Utf8               CombatAI.java
  #702 = Utf8               NestMembers
  #703 = Utf8               BootstrapMethods
  #704 = MethodType         #53           //  ()V
  #705 = MethodHandle       5:#706        // REF_invokeVirtual ext/mods/fakeplayer/ai/CombatAI.lambda$performPeaceZoneBehavior$0:()V
  #706 = Methodref          #14.#707      // ext/mods/fakeplayer/ai/CombatAI.lambda$performPeaceZoneBehavior$0:()V
  #707 = NameAndType        #699:#53      // lambda$performPeaceZoneBehavior$0:()V
  #708 = MethodType         #709          //  (Ljava/lang/Object;)D
  #709 = Utf8               (Ljava/lang/Object;)D
  #710 = MethodHandle       5:#711        // REF_invokeVirtual ext/mods/fakeplayer/ai/CombatAI.lambda$getNearestNpc$0:(Lext/mods/gameserver/model/actor/Npc;)D
  #711 = Methodref          #14.#712      // ext/mods/fakeplayer/ai/CombatAI.lambda$getNearestNpc$0:(Lext/mods/gameserver/model/actor/Npc;)D
  #712 = NameAndType        #698:#694     // lambda$getNearestNpc$0:(Lext/mods/gameserver/model/actor/Npc;)D
  #713 = MethodType         #694          //  (Lext/mods/gameserver/model/actor/Npc;)D
  #714 = MethodType         #396          //  (Ljava/lang/Object;)Z
  #715 = MethodHandle       6:#716        // REF_invokeStatic ext/mods/fakeplayer/ai/CombatAI.lambda$getNearestTeleportNpc$0:(Lext/mods/gameserver/model/actor/Npc;)Z
  #716 = Methodref          #14.#717      // ext/mods/fakeplayer/ai/CombatAI.lambda$getNearestTeleportNpc$0:(Lext/mods/gameserver/model/actor/Npc;)Z
  #717 = NameAndType        #696:#697     // lambda$getNearestTeleportNpc$0:(Lext/mods/gameserver/model/actor/Npc;)Z
  #718 = MethodType         #697          //  (Lext/mods/gameserver/model/actor/Npc;)Z
  #719 = MethodHandle       5:#720        // REF_invokeVirtual ext/mods/fakeplayer/ai/CombatAI.lambda$getNearestTeleportNpc$1:(Lext/mods/gameserver/model/actor/Npc;)D
  #720 = Methodref          #14.#721      // ext/mods/fakeplayer/ai/CombatAI.lambda$getNearestTeleportNpc$1:(Lext/mods/gameserver/model/actor/Npc;)D
  #721 = NameAndType        #693:#694     // lambda$getNearestTeleportNpc$1:(Lext/mods/gameserver/model/actor/Npc;)D
  #722 = MethodType         #723          //  (Ljava/lang/Object;)I
  #723 = Utf8               (Ljava/lang/Object;)I
  #724 = MethodHandle       5:#725        // REF_invokeVirtual ext/mods/fakeplayer/model/BotSkill.getPriority:()I
  #725 = Methodref          #331.#726     // ext/mods/fakeplayer/model/BotSkill.getPriority:()I
  #726 = NameAndType        #727:#94      // getPriority:()I
  #727 = Utf8               getPriority
  #728 = MethodType         #729          //  (Lext/mods/fakeplayer/model/OffensiveSpell;)I
  #729 = Utf8               (Lext/mods/fakeplayer/model/OffensiveSpell;)I
  #730 = MethodType         #253          //  (Ljava/lang/Object;)Ljava/lang/Object;
  #731 = MethodHandle       5:#732        // REF_invokeVirtual ext/mods/fakeplayer/ai/CombatAI.lambda$getBestAvailableFighterSkill$0:(Lext/mods/fakeplayer/model/OffensiveSpell;)Lext/mods/gameserver/skills/L2Skill;
  #732 = Methodref          #14.#733      // ext/mods/fakeplayer/ai/CombatAI.lambda$getBestAvailableFighterSkill$0:(Lext/mods/fakeplayer/model/OffensiveSpell;)Lext/mods/gameserver/skills/L2Skill;
  #733 = NameAndType        #689:#690     // lambda$getBestAvailableFighterSkill$0:(Lext/mods/fakeplayer/model/OffensiveSpell;)Lext/mods/gameserver/skills/L2Skill;
  #734 = MethodType         #690          //  (Lext/mods/fakeplayer/model/OffensiveSpell;)Lext/mods/gameserver/skills/L2Skill;
  #735 = MethodHandle       6:#736        // REF_invokeStatic java/util/Objects.nonNull:(Ljava/lang/Object;)Z
  #736 = Methodref          #737.#738     // java/util/Objects.nonNull:(Ljava/lang/Object;)Z
  #737 = Class              #739          // java/util/Objects
  #738 = NameAndType        #740:#396     // nonNull:(Ljava/lang/Object;)Z
  #739 = Utf8               java/util/Objects
  #740 = Utf8               nonNull
  #741 = MethodType         #688          //  (Lext/mods/gameserver/skills/L2Skill;)Z
  #742 = MethodHandle       5:#743        // REF_invokeVirtual ext/mods/fakeplayer/ai/CombatAI.lambda$getBestAvailableFighterSkill$1:(Lext/mods/gameserver/skills/L2Skill;)Z
  #743 = Methodref          #14.#744      // ext/mods/fakeplayer/ai/CombatAI.lambda$getBestAvailableFighterSkill$1:(Lext/mods/gameserver/skills/L2Skill;)Z
  #744 = NameAndType        #687:#688     // lambda$getBestAvailableFighterSkill$1:(Lext/mods/gameserver/skills/L2Skill;)Z
  #745 = MethodType         #746          //  (Lext/mods/fakeplayer/model/HealingSpell;)I
  #746 = Utf8               (Lext/mods/fakeplayer/model/HealingSpell;)I
  #747 = MethodHandle       5:#748        // REF_invokeVirtual ext/mods/fakeplayer/ai/CombatAI.canCastSkill:(Lext/mods/fakeplayer/model/BotSkill;)Z
  #748 = Methodref          #14.#749      // ext/mods/fakeplayer/ai/CombatAI.canCastSkill:(Lext/mods/fakeplayer/model/BotSkill;)Z
  #749 = NameAndType        #664:#665     // canCastSkill:(Lext/mods/fakeplayer/model/BotSkill;)Z
  #750 = MethodType         #751          //  (Lext/mods/fakeplayer/model/HealingSpell;)Z
  #751 = Utf8               (Lext/mods/fakeplayer/model/HealingSpell;)Z
  #752 = MethodHandle       6:#753        // REF_invokeStatic ext/mods/fakeplayer/ai/CombatAI.lambda$getBestAvailableHealingSpell$0:(Lext/mods/fakeplayer/model/HealingSpell;)Lext/mods/fakeplayer/model/HealingSpell;
  #753 = Methodref          #14.#754      // ext/mods/fakeplayer/ai/CombatAI.lambda$getBestAvailableHealingSpell$0:(Lext/mods/fakeplayer/model/HealingSpell;)Lext/mods/fakeplayer/model/HealingSpell;
  #754 = NameAndType        #684:#685     // lambda$getBestAvailableHealingSpell$0:(Lext/mods/fakeplayer/model/HealingSpell;)Lext/mods/fakeplayer/model/HealingSpell;
  #755 = MethodType         #685          //  (Lext/mods/fakeplayer/model/HealingSpell;)Lext/mods/fakeplayer/model/HealingSpell;
  #756 = MethodHandle       6:#757        // REF_invokeStatic ext/mods/fakeplayer/ai/CombatAI.lambda$selfSupportBuffs$0:(Lext/mods/gameserver/skills/AbstractEffect;)Ljava/lang/Integer;
  #757 = Methodref          #14.#758      // ext/mods/fakeplayer/ai/CombatAI.lambda$selfSupportBuffs$0:(Lext/mods/gameserver/skills/AbstractEffect;)Ljava/lang/Integer;
  #758 = NameAndType        #680:#681     // lambda$selfSupportBuffs$0:(Lext/mods/gameserver/skills/AbstractEffect;)Ljava/lang/Integer;
  #759 = MethodType         #681          //  (Lext/mods/gameserver/skills/AbstractEffect;)Ljava/lang/Integer;
  #760 = String             #761          // ?? FakePlayer teleportado por inatividade: \u0001
  #761 = Utf8               ?? FakePlayer teleportado por inatividade: \u0001
  #762 = MethodHandle       6:#763        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #763 = Methodref          #764.#765     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #764 = Class              #766          // java/lang/invoke/LambdaMetafactory
  #765 = NameAndType        #767:#768     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #766 = Utf8               java/lang/invoke/LambdaMetafactory
  #767 = Utf8               metafactory
  #768 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #769 = MethodHandle       6:#770        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #770 = Methodref          #771.#772     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #771 = Class              #773          // java/lang/invoke/StringConcatFactory
  #772 = NameAndType        #563:#774     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #773 = Utf8               java/lang/invoke/StringConcatFactory
  #774 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #775 = Utf8               InnerClasses
  #776 = Class              #777          // java/lang/invoke/MethodHandles$Lookup
  #777 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #778 = Class              #779          // java/lang/invoke/MethodHandles
  #779 = Utf8               java/lang/invoke/MethodHandles
  #780 = Utf8               Lookup
{
  public ext.mods.fakeplayer.ai.CombatAI(ext.mods.fakeplayer.FakePlayer);
    descriptor: (Lext/mods/fakeplayer/FakePlayer;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #1                  // Method ext/mods/fakeplayer/ai/FakePlayerAI."<init>":(Lext/mods/fakeplayer/FakePlayer;)V
         5: aload_0
         6: invokestatic  #7                  // Method java/lang/System.currentTimeMillis:()J
         9: putfield      #13                 // Field lastActionTime:J
        12: aload_0
        13: ldc2_w        #19                 // long 60000l
        16: putfield      #21                 // Field INACTIVITY_TIMEOUT_MS:J
        19: aload_0
        20: lconst_0
        21: putfield      #24                 // Field lastPeaceActionTime:J
        24: aload_0
        25: ldc2_w        #27                 // long 10000l
        28: putfield      #29                 // Field PEACE_ACTION_INTERVAL:J
        31: aload_0
        32: iconst_0
        33: putfield      #32                 // Field isSitting:Z
        36: aload_0
        37: aload_0
        38: ldc           #36                 // String Giran
        40: aload_0
        41: getfield      #38                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
        44: invokevirtual #42                 // Method getCityWaypoint:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/location/Location;
        47: putfield      #46                 // Field waypoint:Lext/mods/gameserver/model/location/Location;
        50: return
      LineNumberTable:
        line 60: 0
        line 47: 5
        line 48: 12
        line 53: 19
        line 54: 24
        line 55: 31
        line 56: 36
        line 61: 50
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      51     0  this   Lext/mods/fakeplayer/ai/CombatAI;
            0      51     1 character   Lext/mods/fakeplayer/FakePlayer;

  public void thinkAndAct();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #50                 // Method handleDeath:()V
         4: aload_0
         5: getfield      #38                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
         8: iconst_1
         9: invokevirtual #54                 // Method ext/mods/fakeplayer/FakePlayer.setRunning:(Z)V
        12: aload_0
        13: invokevirtual #60                 // Method colision:()Z
        16: ifeq          20
        19: return
        20: aload_0
        21: invokevirtual #64                 // Method isPeaceZone:()Z
        24: ifeq          32
        27: aload_0
        28: invokevirtual #67                 // Method performPeaceZoneBehavior:()V
        31: return
        32: aload_0
        33: invokevirtual #70                 // Method isFighting:()Z
        36: ifne          49
        39: aload_0
        40: getfield      #38                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
        43: invokevirtual #73                 // Method ext/mods/fakeplayer/FakePlayer.isMoving:()Z
        46: ifeq          59
        49: aload_0
        50: invokestatic  #7                  // Method java/lang/System.currentTimeMillis:()J
        53: putfield      #13                 // Field lastActionTime:J
        56: goto          85
        59: invokestatic  #7                  // Method java/lang/System.currentTimeMillis:()J
        62: aload_0
        63: getfield      #13                 // Field lastActionTime:J
        66: lsub
        67: ldc2_w        #19                 // long 60000l
        70: lcmp
        71: ifle          85
        74: aload_0
        75: invokevirtual #76                 // Method teleportToSafeZone:()V
        78: aload_0
        79: invokestatic  #7                  // Method java/lang/System.currentTimeMillis:()J
        82: putfield      #13                 // Field lastActionTime:J
        85: return
      LineNumberTable:
        line 66: 0
        line 67: 4
        line 68: 12
        line 70: 19
        line 73: 20
        line 75: 27
        line 76: 31
        line 79: 32
        line 81: 49
        line 83: 59
        line 85: 74
        line 86: 78
        line 88: 85
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      86     0  this   Lext/mods/fakeplayer/ai/CombatAI;
      StackMapTable: number_of_entries = 5
        frame_type = 20 /* same */
        frame_type = 11 /* same */
        frame_type = 16 /* same */
        frame_type = 9 /* same */
        frame_type = 25 /* same */

  protected void tryAttackingUsingFighterOffensiveSkill();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=4, locals=2, args_size=1
         0: aload_0
         1: getfield      #38                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
         4: invokevirtual #263                // Method ext/mods/fakeplayer/FakePlayer.getTarget:()Lext/mods/gameserver/model/WorldObject;
         7: ifnull        23
        10: aload_0
        11: getfield      #38                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
        14: invokevirtual #263                // Method ext/mods/fakeplayer/FakePlayer.getTarget:()Lext/mods/gameserver/model/WorldObject;
        17: instanceof    #267                // class ext/mods/gameserver/model/actor/Creature
        20: ifne          24
        23: return
        24: aload_0
        25: getfield      #38                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
        28: aload_0
        29: getfield      #38                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
        32: invokevirtual #263                // Method ext/mods/fakeplayer/FakePlayer.getTarget:()Lext/mods/gameserver/model/WorldObject;
        35: checkcast     #267                // class ext/mods/gameserver/model/actor/Creature
        38: invokevirtual #269                // Method ext/mods/fakeplayer/FakePlayer.forceAutoAttack:(Lext/mods/gameserver/model/actor/Creature;)V
        41: invokestatic  #273                // Method ext/mods/commons/random/Rnd.nextDouble:()D
        44: aload_0
        45: invokevirtual #277                // Method changeOfUsingSkill:()D
        48: dcmpl
        49: ifle          53
        52: return
        53: aload_0
        54: invokevirtual #280                // Method getBestAvailableFighterSkill:()Lext/mods/gameserver/skills/L2Skill;
        57: astore_1
        58: aload_1
        59: ifnull        67
        62: aload_0
        63: aload_1
        64: invokevirtual #284                // Method castSpell:(Lext/mods/gameserver/skills/L2Skill;)V
        67: return
      LineNumberTable:
        line 267: 0
        line 268: 23
        line 270: 24
        line 272: 41
        line 273: 52
        line 275: 53
        line 277: 58
        line 278: 62
        line 279: 67
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      68     0  this   Lext/mods/fakeplayer/ai/CombatAI;
           58      10     1 skill   Lext/mods/gameserver/skills/L2Skill;
      StackMapTable: number_of_entries = 4
        frame_type = 23 /* same */
        frame_type = 0 /* same */
        frame_type = 28 /* same */
        frame_type = 252 /* append */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/skills/L2Skill ]

  protected ext.mods.gameserver.skills.L2Skill getBestAvailableFighterSkill();
    descriptor: ()Lext/mods/gameserver/skills/L2Skill;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #288                // Method getOffensiveSpells:()Ljava/util/List;
         4: invokeinterface #292,  1          // InterfaceMethod java/util/List.isEmpty:()Z
         9: ifeq          14
        12: aconst_null
        13: areturn
        14: aload_0
        15: invokevirtual #288                // Method getOffensiveSpells:()Ljava/util/List;
        18: invokeinterface #224,  1          // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
        23: invokedynamic #295,  0            // InvokeDynamic #4:applyAsInt:()Ljava/util/function/ToIntFunction;
        28: invokestatic  #299                // InterfaceMethod java/util/Comparator.comparingInt:(Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;
        31: invokeinterface #238,  2          // InterfaceMethod java/util/stream/Stream.sorted:(Ljava/util/Comparator;)Ljava/util/stream/Stream;
        36: aload_0
        37: invokedynamic #303,  0            // InvokeDynamic #5:apply:(Lext/mods/fakeplayer/ai/CombatAI;)Ljava/util/function/Function;
        42: invokeinterface #307,  2          // InterfaceMethod java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
        47: invokedynamic #311,  0            // InvokeDynamic #6:test:()Ljava/util/function/Predicate;
        52: invokeinterface #258,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        57: aload_0
        58: invokedynamic #312,  0            // InvokeDynamic #7:test:(Lext/mods/fakeplayer/ai/CombatAI;)Ljava/util/function/Predicate;
        63: invokeinterface #258,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        68: invokeinterface #244,  1          // InterfaceMethod java/util/stream/Stream.findFirst:()Ljava/util/Optional;
        73: aconst_null
        74: invokevirtual #248                // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        77: checkcast     #315                // class ext/mods/gameserver/skills/L2Skill
        80: areturn
      LineNumberTable:
        line 283: 0
        line 284: 12
        line 286: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      81     0  this   Lext/mods/fakeplayer/ai/CombatAI;
      StackMapTable: number_of_entries = 1
        frame_type = 14 /* same */

  protected void tryAttackingUsingMageOffensiveSkill();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=3, args_size=1
         0: aload_0
         1: getfield      #38                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
         4: invokevirtual #263                // Method ext/mods/fakeplayer/FakePlayer.getTarget:()Lext/mods/gameserver/model/WorldObject;
         7: ifnull        23
        10: aload_0
        11: getfield      #38                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
        14: invokevirtual #317                // Method ext/mods/fakeplayer/FakePlayer.getCast:()Lext/mods/gameserver/model/actor/cast/PlayerCast;
        17: invokevirtual #321                // Method ext/mods/gameserver/model/actor/cast/PlayerCast.isCastingNow:()Z
        20: ifeq          24
        23: return
        24: aload_0
        25: invokevirtual #326                // Method getBestAvailableSpellForTarget:()Lext/mods/fakeplayer/model/BotSkill;
        28: astore_1
        29: aload_1
        30: ifnonnull     34
        33: return
        34: aload_0
        35: getfield      #38                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
        38: aload_1
        39: invokevirtual #330                // Method ext/mods/fakeplayer/model/BotSkill.getSkillId:()I
        42: invokevirtual #335                // Method ext/mods/fakeplayer/FakePlayer.getSkill:(I)Lext/mods/gameserver/skills/L2Skill;
        45: astore_2
        46: aload_2
        47: ifnull        55
        50: aload_0
        51: aload_2
        52: invokevirtual #284                // Method castSpell:(Lext/mods/gameserver/skills/L2Skill;)V
        55: return
      LineNumberTable:
        line 291: 0
        line 292: 23
        line 294: 24
        line 296: 29
        line 297: 33
        line 299: 34
        line 300: 46
        line 301: 50
        line 302: 55
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      56     0  this   Lext/mods/fakeplayer/ai/CombatAI;
           29      27     1 selectedSkill   Lext/mods/fakeplayer/model/BotSkill;
           46      10     2 skill   Lext/mods/gameserver/skills/L2Skill;
      StackMapTable: number_of_entries = 4
        frame_type = 23 /* same */
        frame_type = 0 /* same */
        frame_type = 252 /* append */
          offset_delta = 9
          locals = [ class ext/mods/fakeplayer/model/BotSkill ]
        frame_type = 252 /* append */
          offset_delta = 20
          locals = [ class ext/mods/gameserver/skills/L2Skill ]

  protected ext.mods.fakeplayer.model.BotSkill getBestAvailableSpellForTarget();
    descriptor: ()Lext/mods/fakeplayer/model/BotSkill;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=4, locals=5, args_size=1
         0: aload_0
         1: invokevirtual #288                // Method getOffensiveSpells:()Ljava/util/List;
         4: invokeinterface #224,  1          // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
         9: invokedynamic #295,  0            // InvokeDynamic #4:applyAsInt:()Ljava/util/function/ToIntFunction;
        14: invokestatic  #299                // InterfaceMethod java/util/Comparator.comparingInt:(Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;
        17: invokeinterface #238,  2          // InterfaceMethod java/util/stream/Stream.sorted:(Ljava/util/Comparator;)Ljava/util/stream/Stream;
        22: invokeinterface #339,  1          // InterfaceMethod java/util/stream/Stream.toList:()Ljava/util/List;
        27: astore_1
        28: aload_1
        29: invokeinterface #104,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        34: astore_2
        35: aload_2
        36: invokeinterface #110,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        41: ifeq          125
        44: aload_2
        45: invokeinterface #115,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        50: checkcast     #331                // class ext/mods/fakeplayer/model/BotSkill
        53: astore_3
        54: aload_0
        55: getfield      #38                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
        58: aload_3
        59: invokevirtual #330                // Method ext/mods/fakeplayer/model/BotSkill.getSkillId:()I
        62: invokevirtual #335                // Method ext/mods/fakeplayer/FakePlayer.getSkill:(I)Lext/mods/gameserver/skills/L2Skill;
        65: astore        4
        67: aload         4
        69: ifnonnull     75
        72: goto          35
        75: aload         4
        77: invokevirtual #342                // Method ext/mods/gameserver/skills/L2Skill.getCastRange:()I
        80: ifle          106
        83: invokestatic  #156                // Method ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
        86: aload_0
        87: getfield      #38                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
        90: aload_0
        91: getfield      #38                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
        94: invokevirtual #263                // Method ext/mods/fakeplayer/FakePlayer.getTarget:()Lext/mods/gameserver/model/WorldObject;
        97: invokevirtual #345                // Method ext/mods/gameserver/geoengine/GeoEngine.canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
       100: ifne          106
       103: goto          35
       106: aload_0
       107: getfield      #38                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
       110: aload         4
       112: iconst_1
       113: iconst_0
       114: invokevirtual #348                // Method ext/mods/fakeplayer/FakePlayer.checkUseMagicConditions:(Lext/mods/gameserver/skills/L2Skill;ZZ)Z
       117: ifeq          122
       120: aload_3
       121: areturn
       122: goto          35
       125: aconst_null
       126: areturn
      LineNumberTable:
        line 306: 0
        line 308: 28
        line 310: 54
        line 311: 67
        line 312: 72
        line 314: 75
        line 315: 103
        line 317: 106
        line 318: 120
        line 319: 122
        line 320: 125
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           67      55     4 skill   Lext/mods/gameserver/skills/L2Skill;
           54      68     3 botSkill   Lext/mods/fakeplayer/model/BotSkill;
            0     127     0  this   Lext/mods/fakeplayer/ai/CombatAI;
           28      99     1 sortedSpells   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           28      99     1 sortedSpells   Ljava/util/List<Lext/mods/fakeplayer/model/OffensiveSpell;>;
      StackMapTable: number_of_entries = 5
        frame_type = 253 /* append */
          offset_delta = 35
          locals = [ class java/util/List, class java/util/Iterator ]
        frame_type = 253 /* append */
          offset_delta = 39
          locals = [ class ext/mods/fakeplayer/model/BotSkill, class ext/mods/gameserver/skills/L2Skill ]
        frame_type = 30 /* same */
        frame_type = 249 /* chop */
          offset_delta = 15
        frame_type = 250 /* chop */
          offset_delta = 2

  public ext.mods.fakeplayer.model.HealingSpell getBestAvailableHealingSpell();
    descriptor: ()Lext/mods/fakeplayer/model/HealingSpell;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #352                // Method getHealingSpells:()Ljava/util/List;
         4: invokeinterface #292,  1          // InterfaceMethod java/util/List.isEmpty:()Z
         9: ifne          29
        12: aload_0
        13: getfield      #38                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
        16: ifnull        29
        19: aload_0
        20: getfield      #38                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
        23: invokevirtual #263                // Method ext/mods/fakeplayer/FakePlayer.getTarget:()Lext/mods/gameserver/model/WorldObject;
        26: ifnonnull     31
        29: aconst_null
        30: areturn
        31: aload_0
        32: invokevirtual #352                // Method getHealingSpells:()Ljava/util/List;
        35: invokeinterface #224,  1          // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
        40: invokedynamic #355,  0            // InvokeDynamic #8:applyAsInt:()Ljava/util/function/ToIntFunction;
        45: invokestatic  #299                // InterfaceMethod java/util/Comparator.comparingInt:(Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;
        48: invokeinterface #238,  2          // InterfaceMethod java/util/stream/Stream.sorted:(Ljava/util/Comparator;)Ljava/util/stream/Stream;
        53: aload_0
        54: invokedynamic #356,  0            // InvokeDynamic #9:test:(Lext/mods/fakeplayer/ai/CombatAI;)Ljava/util/function/Predicate;
        59: invokeinterface #258,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        64: invokedynamic #357,  0            // InvokeDynamic #10:apply:()Ljava/util/function/Function;
        69: invokeinterface #307,  2          // InterfaceMethod java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
        74: invokeinterface #244,  1          // InterfaceMethod java/util/stream/Stream.findFirst:()Ljava/util/Optional;
        79: aconst_null
        80: invokevirtual #248                // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        83: checkcast     #360                // class ext/mods/fakeplayer/model/HealingSpell
        86: areturn
      LineNumberTable:
        line 325: 0
        line 326: 29
        line 328: 31
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      87     0  this   Lext/mods/fakeplayer/ai/CombatAI;
      StackMapTable: number_of_entries = 2
        frame_type = 29 /* same */
        frame_type = 1 /* same */

  protected void selfSupportBuffs();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=4, locals=5, args_size=1
         0: aload_0
         1: getfield      #38                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
         4: invokevirtual #362                // Method ext/mods/fakeplayer/FakePlayer.getAllEffects:()[Lext/mods/gameserver/skills/AbstractEffect;
         7: invokestatic  #366                // Method java/util/Arrays.stream:([Ljava/lang/Object;)Ljava/util/stream/Stream;
        10: invokedynamic #371,  0            // InvokeDynamic #11:apply:()Ljava/util/function/Function;
        15: invokeinterface #307,  2          // InterfaceMethod java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
        20: invokestatic  #372                // Method java/util/stream/Collectors.toList:()Ljava/util/stream/Collector;
        23: invokeinterface #377,  2          // InterfaceMethod java/util/stream/Stream.collect:(Ljava/util/stream/Collector;)Ljava/lang/Object;
        28: checkcast     #105                // class java/util/List
        31: astore_1
        32: aload_0
        33: invokevirtual #381                // Method getSelfSupportSpells:()Ljava/util/List;
        36: invokeinterface #104,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        41: astore_2
        42: aload_2
        43: invokeinterface #110,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        48: ifeq          234
        51: aload_2
        52: invokeinterface #115,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        57: checkcast     #384                // class ext/mods/fakeplayer/model/SupportSpell
        60: astore_3
        61: aload_1
        62: aload_3
        63: invokevirtual #386                // Method ext/mods/fakeplayer/model/SupportSpell.getSkillId:()I
        66: invokestatic  #387                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        69: invokeinterface #393,  2          // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
        74: ifeq          80
        77: goto          42
        80: invokestatic  #397                // Method ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
        83: aload_3
        84: invokevirtual #386                // Method ext/mods/fakeplayer/model/SupportSpell.getSkillId:()I
        87: aload_0
        88: getfield      #38                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
        91: aload_3
        92: invokevirtual #386                // Method ext/mods/fakeplayer/model/SupportSpell.getSkillId:()I
        95: invokevirtual #402                // Method ext/mods/fakeplayer/FakePlayer.getSkillLevel:(I)I
        98: invokevirtual #405                // Method ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
       101: astore        4
       103: aload_0
       104: getfield      #38                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
       107: aload         4
       109: iconst_1
       110: iconst_0
       111: invokevirtual #348                // Method ext/mods/fakeplayer/FakePlayer.checkUseMagicConditions:(Lext/mods/gameserver/skills/L2Skill;ZZ)Z
       114: ifne          120
       117: goto          42
       120: getstatic     #409                // Field ext/mods/fakeplayer/ai/CombatAI$1.$SwitchMap$ext$mods$fakeplayer$model$SpellUsageCondition:[I
       123: aload_3
       124: invokevirtual #415                // Method ext/mods/fakeplayer/model/SupportSpell.getCondition:()Lext/mods/fakeplayer/model/SpellUsageCondition;
       127: invokevirtual #419                // Method ext/mods/fakeplayer/model/SpellUsageCondition.ordinal:()I
       130: iaload
       131: tableswitch   { // 1 to 3

                       1: 156

                       2: 203

                       3: 225
                 default: 231
            }
       156: ldc2_w        #424                // double 100.0d
       159: aload_0
       160: getfield      #38                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
       163: invokevirtual #426                // Method ext/mods/fakeplayer/FakePlayer.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       166: invokevirtual #430                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getMaxHp:()I
       169: i2d
       170: ddiv
       171: aload_0
       172: getfield      #38                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
       175: invokevirtual #426                // Method ext/mods/fakeplayer/FakePlayer.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       178: invokevirtual #435                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getHp:()D
       181: dmul
       182: invokestatic  #438                // Method java/lang/Math.round:(D)J
       185: aload_3
       186: invokevirtual #442                // Method ext/mods/fakeplayer/model/SupportSpell.getConditionValue:()I
       189: i2l
       190: lcmp
       191: ifgt          231
       194: aload_0
       195: aload         4
       197: invokevirtual #445                // Method castSelfSpell:(Lext/mods/gameserver/skills/L2Skill;)V
       200: goto          231
       203: aload_0
       204: invokevirtual #448                // Method getMissingHealth:()D
       207: aload_3
       208: invokevirtual #442                // Method ext/mods/fakeplayer/model/SupportSpell.getConditionValue:()I
       211: i2d
       212: dcmpl
       213: iflt          231
       216: aload_0
       217: aload         4
       219: invokevirtual #445                // Method castSelfSpell:(Lext/mods/gameserver/skills/L2Skill;)V
       222: goto          231
       225: aload_0
       226: aload         4
       228: invokevirtual #445                // Method castSelfSpell:(Lext/mods/gameserver/skills/L2Skill;)V
       231: goto          42
       234: return
      LineNumberTable:
        line 345: 0
        line 347: 32
        line 349: 61
        line 350: 77
        line 352: 80
        line 354: 103
        line 355: 117
        line 357: 120
        line 360: 156
        line 362: 194
        line 366: 203
        line 368: 216
        line 372: 225
        line 377: 231
        line 378: 234
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          103     128     4 skill   Lext/mods/gameserver/skills/L2Skill;
           61     170     3 selfBuff   Lext/mods/fakeplayer/model/SupportSpell;
            0     235     0  this   Lext/mods/fakeplayer/ai/CombatAI;
           32     203     1 activeEffects   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           32     203     1 activeEffects   Ljava/util/List<Ljava/lang/Integer;>;
      StackMapTable: number_of_entries = 8
        frame_type = 253 /* append */
          offset_delta = 42
          locals = [ class java/util/List, class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 37
          locals = [ class ext/mods/fakeplayer/model/SupportSpell ]
        frame_type = 252 /* append */
          offset_delta = 39
          locals = [ class ext/mods/gameserver/skills/L2Skill ]
        frame_type = 35 /* same */
        frame_type = 46 /* same */
        frame_type = 21 /* same */
        frame_type = 249 /* chop */
          offset_delta = 5
        frame_type = 250 /* chop */
          offset_delta = 2

  protected double changeOfUsingSkill();
    descriptor: ()D
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=1, args_size=1
         0: dconst_1
         1: dreturn
      LineNumberTable:
        line 387: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/fakeplayer/ai/CombatAI;

  protected int getShotId();
    descriptor: ()I
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=2, args_size=1
         0: aload_0
         1: getfield      #38                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
         4: invokevirtual #426                // Method ext/mods/fakeplayer/FakePlayer.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
         7: invokevirtual #457                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
        10: istore_1
        11: iload_1
        12: bipush        20
        14: if_icmpge     37
        17: aload_0
        18: invokevirtual #460                // Method getShotType:()Lext/mods/gameserver/enums/items/ShotType;
        21: getstatic     #464                // Field ext/mods/gameserver/enums/items/ShotType.SOULSHOT:Lext/mods/gameserver/enums/items/ShotType;
        24: if_acmpne     33
        27: sipush        1835
        30: goto          36
        33: sipush        3947
        36: ireturn
        37: iload_1
        38: bipush        20
        40: if_icmplt     69
        43: iload_1
        44: bipush        40
        46: if_icmpge     69
        49: aload_0
        50: invokevirtual #460                // Method getShotType:()Lext/mods/gameserver/enums/items/ShotType;
        53: getstatic     #464                // Field ext/mods/gameserver/enums/items/ShotType.SOULSHOT:Lext/mods/gameserver/enums/items/ShotType;
        56: if_acmpne     65
        59: sipush        1463
        62: goto          68
        65: sipush        3948
        68: ireturn
        69: iload_1
        70: bipush        40
        72: if_icmplt     101
        75: iload_1
        76: bipush        52
        78: if_icmpge     101
        81: aload_0
        82: invokevirtual #460                // Method getShotType:()Lext/mods/gameserver/enums/items/ShotType;
        85: getstatic     #464                // Field ext/mods/gameserver/enums/items/ShotType.SOULSHOT:Lext/mods/gameserver/enums/items/ShotType;
        88: if_acmpne     97
        91: sipush        1464
        94: goto          100
        97: sipush        3949
       100: ireturn
       101: iload_1
       102: bipush        52
       104: if_icmplt     133
       107: iload_1
       108: bipush        61
       110: if_icmpge     133
       113: aload_0
       114: invokevirtual #460                // Method getShotType:()Lext/mods/gameserver/enums/items/ShotType;
       117: getstatic     #464                // Field ext/mods/gameserver/enums/items/ShotType.SOULSHOT:Lext/mods/gameserver/enums/items/ShotType;
       120: if_acmpne     129
       123: sipush        1465
       126: goto          132
       129: sipush        3950
       132: ireturn
       133: iload_1
       134: bipush        61
       136: if_icmplt     165
       139: iload_1
       140: bipush        76
       142: if_icmpge     165
       145: aload_0
       146: invokevirtual #460                // Method getShotType:()Lext/mods/gameserver/enums/items/ShotType;
       149: getstatic     #464                // Field ext/mods/gameserver/enums/items/ShotType.SOULSHOT:Lext/mods/gameserver/enums/items/ShotType;
       152: if_acmpne     161
       155: sipush        1466
       158: goto          164
       161: sipush        3951
       164: ireturn
       165: iload_1
       166: bipush        76
       168: if_icmplt     191
       171: aload_0
       172: invokevirtual #460                // Method getShotType:()Lext/mods/gameserver/enums/items/ShotType;
       175: getstatic     #464                // Field ext/mods/gameserver/enums/items/ShotType.SOULSHOT:Lext/mods/gameserver/enums/items/ShotType;
       178: if_acmpne     187
       181: sipush        1467
       184: goto          190
       187: sipush        3952
       190: ireturn
       191: iconst_0
       192: ireturn
      LineNumberTable:
        line 392: 0
        line 393: 11
        line 394: 17
        line 395: 37
        line 396: 49
        line 397: 69
        line 398: 81
        line 399: 101
        line 400: 113
        line 401: 133
        line 402: 145
        line 403: 165
        line 404: 171
        line 406: 191
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     193     0  this   Lext/mods/fakeplayer/ai/CombatAI;
           11     182     1 playerLevel   I
      StackMapTable: number_of_entries = 18
        frame_type = 252 /* append */
          offset_delta = 33
          locals = [ int ]
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 0 /* same */
        frame_type = 27 /* same */
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 0 /* same */
        frame_type = 27 /* same */
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 0 /* same */
        frame_type = 27 /* same */
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 0 /* same */
        frame_type = 27 /* same */
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 0 /* same */
        frame_type = 21 /* same */
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 0 /* same */

  protected int getArrowId();
    descriptor: ()I
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=2, args_size=1
         0: aload_0
         1: getfield      #38                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
         4: invokevirtual #426                // Method ext/mods/fakeplayer/FakePlayer.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
         7: invokevirtual #457                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
        10: istore_1
        11: iload_1
        12: bipush        20
        14: if_icmpge     20
        17: bipush        17
        19: ireturn
        20: iload_1
        21: bipush        20
        23: if_icmplt     36
        26: iload_1
        27: bipush        40
        29: if_icmpge     36
        32: sipush        1341
        35: ireturn
        36: iload_1
        37: bipush        40
        39: if_icmplt     52
        42: iload_1
        43: bipush        52
        45: if_icmpge     52
        48: sipush        1342
        51: ireturn
        52: iload_1
        53: bipush        52
        55: if_icmplt     68
        58: iload_1
        59: bipush        61
        61: if_icmpge     68
        64: sipush        1343
        67: ireturn
        68: iload_1
        69: bipush        61
        71: if_icmplt     84
        74: iload_1
        75: bipush        76
        77: if_icmpge     84
        80: sipush        1344
        83: ireturn
        84: iload_1
        85: bipush        76
        87: if_icmplt     94
        90: sipush        1345
        93: ireturn
        94: iconst_0
        95: ireturn
      LineNumberTable:
        line 411: 0
        line 412: 11
        line 413: 17
        line 414: 20
        line 415: 32
        line 416: 36
        line 417: 48
        line 418: 52
        line 419: 64
        line 420: 68
        line 421: 80
        line 422: 84
        line 423: 90
        line 425: 94
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      96     0  this   Lext/mods/fakeplayer/ai/CombatAI;
           11      85     1 playerLevel   I
      StackMapTable: number_of_entries = 6
        frame_type = 252 /* append */
          offset_delta = 20
          locals = [ int ]
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 9 /* same */

  protected void handleShots();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=2, args_size=1
         0: aload_0
         1: getfield      #38                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
         4: invokevirtual #470                // Method ext/mods/fakeplayer/FakePlayer.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
         7: aload_0
         8: invokevirtual #474                // Method getShotId:()I
        11: invokevirtual #477                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
        14: ifnull        60
        17: aload_0
        18: getfield      #38                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
        21: invokevirtual #470                // Method ext/mods/fakeplayer/FakePlayer.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
        24: aload_0
        25: invokevirtual #474                // Method getShotId:()I
        28: invokevirtual #477                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
        31: invokevirtual #483                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
        34: bipush        20
        36: if_icmpgt     78
        39: aload_0
        40: getfield      #38                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
        43: invokevirtual #470                // Method ext/mods/fakeplayer/FakePlayer.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
        46: aload_0
        47: invokevirtual #474                // Method getShotId:()I
        50: sipush        500
        53: invokevirtual #488                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.addItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
        56: pop
        57: goto          78
        60: aload_0
        61: getfield      #38                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
        64: invokevirtual #470                // Method ext/mods/fakeplayer/FakePlayer.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
        67: aload_0
        68: invokevirtual #474                // Method getShotId:()I
        71: sipush        500
        74: invokevirtual #488                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.addItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
        77: pop
        78: aload_0
        79: getfield      #38                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
        82: invokevirtual #492                // Method ext/mods/fakeplayer/FakePlayer.getAutoSoulShot:()Ljava/util/Set;
        85: invokeinterface #496,  1          // InterfaceMethod java/util/Set.isEmpty:()Z
        90: ifeq          185
        93: aload_0
        94: getfield      #38                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
        97: aload_0
        98: invokevirtual #474                // Method getShotId:()I
       101: invokevirtual #499                // Method ext/mods/fakeplayer/FakePlayer.addAutoSoulShot:(I)V
       104: aload_0
       105: getfield      #38                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
       108: invokevirtual #470                // Method ext/mods/fakeplayer/FakePlayer.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       111: aload_0
       112: invokevirtual #474                // Method getShotId:()I
       115: invokevirtual #477                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
       118: astore_1
       119: aload_1
       120: ifnonnull     124
       123: return
       124: aload_0
       125: getfield      #38                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
       128: invokevirtual #503                // Method ext/mods/fakeplayer/FakePlayer.getActiveWeaponInstance:()Lext/mods/gameserver/model/item/instance/ItemInstance;
       131: ifnull        163
       134: aload_1
       135: invokevirtual #507                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
       138: invokevirtual #511                // Method ext/mods/gameserver/model/item/kind/Item.getCrystalType:()Lext/mods/gameserver/enums/items/CrystalType;
       141: aload_0
       142: getfield      #38                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
       145: invokevirtual #517                // Method ext/mods/fakeplayer/FakePlayer.getActiveWeaponItem:()Lext/mods/gameserver/model/item/kind/Weapon;
       148: invokevirtual #521                // Method ext/mods/gameserver/model/item/kind/Weapon.getCrystalType:()Lext/mods/gameserver/enums/items/CrystalType;
       151: if_acmpne     163
       154: aload_0
       155: getfield      #38                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
       158: iconst_1
       159: iconst_1
       160: invokevirtual #524                // Method ext/mods/fakeplayer/FakePlayer.rechargeShots:(ZZ)V
       163: aload_0
       164: getfield      #38                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
       167: invokevirtual #528                // Method ext/mods/fakeplayer/FakePlayer.getSummon:()Lext/mods/gameserver/model/actor/Summon;
       170: ifnull        185
       173: aload_0
       174: getfield      #38                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
       177: invokevirtual #528                // Method ext/mods/fakeplayer/FakePlayer.getSummon:()Lext/mods/gameserver/model/actor/Summon;
       180: iconst_1
       181: iconst_1
       182: invokevirtual #532                // Method ext/mods/gameserver/model/actor/Summon.rechargeShots:(ZZ)V
       185: return
      LineNumberTable:
        line 430: 0
        line 432: 17
        line 434: 39
        line 439: 60
        line 442: 78
        line 444: 93
        line 446: 104
        line 447: 119
        line 448: 123
        line 450: 124
        line 451: 154
        line 453: 163
        line 454: 173
        line 456: 185
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          119      66     1  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0     186     0  this   Lext/mods/fakeplayer/ai/CombatAI;
      StackMapTable: number_of_entries = 5
        frame_type = 60 /* same */
        frame_type = 17 /* same */
        frame_type = 252 /* append */
          offset_delta = 45
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 38 /* same */
        frame_type = 250 /* chop */
          offset_delta = 21

  protected abstract ext.mods.gameserver.enums.items.ShotType getShotType();
    descriptor: ()Lext/mods/gameserver/enums/items/ShotType;
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT

  protected abstract java.util.List<ext.mods.fakeplayer.model.OffensiveSpell> getOffensiveSpells();
    descriptor: ()Ljava/util/List;
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT
    Signature: #677                         // ()Ljava/util/List<Lext/mods/fakeplayer/model/OffensiveSpell;>;

  protected abstract java.util.List<ext.mods.fakeplayer.model.SupportSpell> getSelfSupportSpells();
    descriptor: ()Ljava/util/List;
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT
    Signature: #678                         // ()Ljava/util/List<Lext/mods/fakeplayer/model/SupportSpell;>;

  protected abstract java.util.List<ext.mods.fakeplayer.model.HealingSpell> getHealingSpells();
    descriptor: ()Ljava/util/List;
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT
    Signature: #679                         // ()Ljava/util/List<Lext/mods/fakeplayer/model/HealingSpell;>;
}
SourceFile: "CombatAI.java"
NestMembers:
  ext/mods/fakeplayer/ai/CombatAI$1
BootstrapMethods:
  0: #762 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #704 ()V
      #705 REF_invokeVirtual ext/mods/fakeplayer/ai/CombatAI.lambda$performPeaceZoneBehavior$0:()V
      #704 ()V
  1: #762 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #708 (Ljava/lang/Object;)D
      #710 REF_invokeVirtual ext/mods/fakeplayer/ai/CombatAI.lambda$getNearestNpc$0:(Lext/mods/gameserver/model/actor/Npc;)D
      #713 (Lext/mods/gameserver/model/actor/Npc;)D
  2: #762 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #714 (Ljava/lang/Object;)Z
      #715 REF_invokeStatic ext/mods/fakeplayer/ai/CombatAI.lambda$getNearestTeleportNpc$0:(Lext/mods/gameserver/model/actor/Npc;)Z
      #718 (Lext/mods/gameserver/model/actor/Npc;)Z
  3: #762 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #708 (Ljava/lang/Object;)D
      #719 REF_invokeVirtual ext/mods/fakeplayer/ai/CombatAI.lambda$getNearestTeleportNpc$1:(Lext/mods/gameserver/model/actor/Npc;)D
      #713 (Lext/mods/gameserver/model/actor/Npc;)D
  4: #762 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #722 (Ljava/lang/Object;)I
      #724 REF_invokeVirtual ext/mods/fakeplayer/model/BotSkill.getPriority:()I
      #728 (Lext/mods/fakeplayer/model/OffensiveSpell;)I
  5: #762 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #730 (Ljava/lang/Object;)Ljava/lang/Object;
      #731 REF_invokeVirtual ext/mods/fakeplayer/ai/CombatAI.lambda$getBestAvailableFighterSkill$0:(Lext/mods/fakeplayer/model/OffensiveSpell;)Lext/mods/gameserver/skills/L2Skill;
      #734 (Lext/mods/fakeplayer/model/OffensiveSpell;)Lext/mods/gameserver/skills/L2Skill;
  6: #762 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #714 (Ljava/lang/Object;)Z
      #735 REF_invokeStatic java/util/Objects.nonNull:(Ljava/lang/Object;)Z
      #741 (Lext/mods/gameserver/skills/L2Skill;)Z
  7: #762 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #714 (Ljava/lang/Object;)Z
      #742 REF_invokeVirtual ext/mods/fakeplayer/ai/CombatAI.lambda$getBestAvailableFighterSkill$1:(Lext/mods/gameserver/skills/L2Skill;)Z
      #741 (Lext/mods/gameserver/skills/L2Skill;)Z
  8: #762 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #722 (Ljava/lang/Object;)I
      #724 REF_invokeVirtual ext/mods/fakeplayer/model/BotSkill.getPriority:()I
      #745 (Lext/mods/fakeplayer/model/HealingSpell;)I
  9: #762 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #714 (Ljava/lang/Object;)Z
      #747 REF_invokeVirtual ext/mods/fakeplayer/ai/CombatAI.canCastSkill:(Lext/mods/fakeplayer/model/BotSkill;)Z
      #750 (Lext/mods/fakeplayer/model/HealingSpell;)Z
  10: #762 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #730 (Ljava/lang/Object;)Ljava/lang/Object;
      #752 REF_invokeStatic ext/mods/fakeplayer/ai/CombatAI.lambda$getBestAvailableHealingSpell$0:(Lext/mods/fakeplayer/model/HealingSpell;)Lext/mods/fakeplayer/model/HealingSpell;
      #755 (Lext/mods/fakeplayer/model/HealingSpell;)Lext/mods/fakeplayer/model/HealingSpell;
  11: #762 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #730 (Ljava/lang/Object;)Ljava/lang/Object;
      #756 REF_invokeStatic ext/mods/fakeplayer/ai/CombatAI.lambda$selfSupportBuffs$0:(Lext/mods/gameserver/skills/AbstractEffect;)Ljava/lang/Integer;
      #759 (Lext/mods/gameserver/skills/AbstractEffect;)Ljava/lang/Integer;
  12: #769 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #760 ?? FakePlayer teleportado por inatividade: \u0001
InnerClasses:
  static #410;                            // class ext/mods/fakeplayer/ai/CombatAI$1
  public static final #780= #776 of #778; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
