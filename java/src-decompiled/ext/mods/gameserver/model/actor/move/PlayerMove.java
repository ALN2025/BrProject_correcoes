// Bytecode for: ext.mods.gameserver.model.actor.move.PlayerMove
// File: ext\mods\gameserver\model\actor\move\PlayerMove.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/move/PlayerMove.class
  Last modified 9 de jul de 2026; size 34108 bytes
  MD5 checksum 39f48a3ec463f8c2b9acf011c525adfa
  Compiled from "PlayerMove.kt"
public final class ext.mods.gameserver.model.actor.move.PlayerMove extends ext.mods.gameserver.model.actor.move.CreatureMove<ext.mods.gameserver.model.actor.Player>
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/model/actor/move/PlayerMove
  super_class: #5                         // ext/mods/gameserver/model/actor/move/CreatureMove
  interfaces: 0, fields: 7, methods: 26, attributes: 7
Constant pool:
     #1 = Utf8               ext/mods/gameserver/model/actor/move/PlayerMove
     #2 = Class              #1           // ext/mods/gameserver/model/actor/move/PlayerMove
     #3 = Utf8               Lext/mods/gameserver/model/actor/move/CreatureMove<Lext/mods/gameserver/model/actor/Player;>;
     #4 = Utf8               ext/mods/gameserver/model/actor/move/CreatureMove
     #5 = Class              #4           // ext/mods/gameserver/model/actor/move/CreatureMove
     #6 = Utf8               <init>
     #7 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
     #8 = Utf8               Lorg/jetbrains/annotations/NotNull;
     #9 = Utf8               ext/mods/gameserver/model/actor/Creature
    #10 = Class              #9           // ext/mods/gameserver/model/actor/Creature
    #11 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
    #12 = NameAndType        #6:#11       // "<init>":(Lext/mods/gameserver/model/actor/Creature;)V
    #13 = Methodref          #5.#12       // ext/mods/gameserver/model/actor/move/CreatureMove."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
    #14 = Utf8               java/time/Instant
    #15 = Class              #14          // java/time/Instant
    #16 = Utf8               now
    #17 = Utf8               ()Ljava/time/Instant;
    #18 = NameAndType        #16:#17      // now:()Ljava/time/Instant;
    #19 = Methodref          #15.#18      // java/time/Instant.now:()Ljava/time/Instant;
    #20 = Utf8               _instant
    #21 = Utf8               Ljava/time/Instant;
    #22 = NameAndType        #20:#21      // _instant:Ljava/time/Instant;
    #23 = Fieldref           #2.#22       // ext/mods/gameserver/model/actor/move/PlayerMove._instant:Ljava/time/Instant;
    #24 = Integer            -2147483648
    #25 = Utf8               _lastStuckX
    #26 = Utf8               I
    #27 = NameAndType        #25:#26      // _lastStuckX:I
    #28 = Fieldref           #2.#27       // ext/mods/gameserver/model/actor/move/PlayerMove._lastStuckX:I
    #29 = Utf8               _lastStuckY
    #30 = NameAndType        #29:#26      // _lastStuckY:I
    #31 = Fieldref           #2.#30       // ext/mods/gameserver/model/actor/move/PlayerMove._lastStuckY:I
    #32 = Double             1.7976931348623157E308d
    #34 = Utf8               _lastStuckDist
    #35 = Utf8               D
    #36 = NameAndType        #34:#35      // _lastStuckDist:D
    #37 = Fieldref           #2.#36       // ext/mods/gameserver/model/actor/move/PlayerMove._lastStuckDist:D
    #38 = Utf8               ext/mods/gameserver/model/actor/Player
    #39 = Class              #38          // ext/mods/gameserver/model/actor/Player
    #40 = Utf8               getZ
    #41 = Utf8               ()I
    #42 = NameAndType        #40:#41      // getZ:()I
    #43 = Methodref          #39.#42      // ext/mods/gameserver/model/actor/Player.getZ:()I
    #44 = Utf8               _zAccurate
    #45 = NameAndType        #44:#35      // _zAccurate:D
    #46 = Fieldref           #2.#45       // ext/mods/gameserver/model/actor/move/PlayerMove._zAccurate:D
    #47 = Utf8               this
    #48 = Utf8               Lext/mods/gameserver/model/actor/move/PlayerMove;
    #49 = Utf8               actor
    #50 = Utf8               Lext/mods/gameserver/model/actor/Player;
    #51 = Utf8               cancelMoveTask
    #52 = Utf8               ()V
    #53 = NameAndType        #51:#52      // cancelMoveTask:()V
    #54 = Methodref          #5.#53       // ext/mods/gameserver/model/actor/move/CreatureMove.cancelMoveTask:()V
    #55 = Utf8               _moveTimeStamp
    #56 = NameAndType        #55:#26      // _moveTimeStamp:I
    #57 = Fieldref           #2.#56       // ext/mods/gameserver/model/actor/move/PlayerMove._moveTimeStamp:I
    #58 = Utf8               isMeleeDebug
    #59 = Utf8               ()Z
    #60 = Utf8               ext/mods/Config
    #61 = Class              #60          // ext/mods/Config
    #62 = Utf8               DEBUG_MELEE_ATTACK
    #63 = Utf8               Z
    #64 = NameAndType        #62:#63      // DEBUG_MELEE_ATTACK:Z
    #65 = Fieldref           #61.#64      // ext/mods/Config.DEBUG_MELEE_ATTACK:Z
    #66 = Utf8               _actor
    #67 = Utf8               Lext/mods/gameserver/model/actor/Creature;
    #68 = NameAndType        #66:#67      // _actor:Lext/mods/gameserver/model/actor/Creature;
    #69 = Fieldref           #2.#68       // ext/mods/gameserver/model/actor/move/PlayerMove._actor:Lext/mods/gameserver/model/actor/Creature;
    #70 = Utf8               getStatus
    #71 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
    #72 = NameAndType        #70:#71      // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
    #73 = Methodref          #39.#72      // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
    #74 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
    #75 = Class              #74          // ext/mods/gameserver/model/actor/status/PlayerStatus
    #76 = Utf8               getPhysicalAttackRange
    #77 = NameAndType        #76:#41      // getPhysicalAttackRange:()I
    #78 = Methodref          #75.#77      // ext/mods/gameserver/model/actor/status/PlayerStatus.getPhysicalAttackRange:()I
    #79 = Utf8               moveToPawn
    #80 = Utf8               (Lext/mods/gameserver/model/WorldObject;I)V
    #81 = Utf8               ext/mods/gameserver/model/WorldObject
    #82 = Class              #81          // ext/mods/gameserver/model/WorldObject
    #83 = Utf8               getX
    #84 = NameAndType        #83:#41      // getX:()I
    #85 = Methodref          #82.#84      // ext/mods/gameserver/model/WorldObject.getX:()I
    #86 = Utf8               getY
    #87 = NameAndType        #86:#41      // getY:()I
    #88 = Methodref          #82.#87      // ext/mods/gameserver/model/WorldObject.getY:()I
    #89 = Methodref          #82.#42      // ext/mods/gameserver/model/WorldObject.getZ:()I
    #90 = NameAndType        #58:#59      // isMeleeDebug:()Z
    #91 = Methodref          #2.#90       // ext/mods/gameserver/model/actor/move/PlayerMove.isMeleeDebug:()Z
    #92 = Utf8               LOGGER
    #93 = Utf8               Lext/mods/commons/logging/CLogger;
    #94 = NameAndType        #92:#93      // LOGGER:Lext/mods/commons/logging/CLogger;
    #95 = Fieldref           #5.#94       // ext/mods/gameserver/model/actor/move/CreatureMove.LOGGER:Lext/mods/commons/logging/CLogger;
    #96 = Utf8               [MeleeDebug][PlayerMove][moveToPawn] actor={} pawn={} offset={} dest=({}, {}, {})
    #97 = String             #96          // [MeleeDebug][PlayerMove][moveToPawn] actor={} pawn={} offset={} dest=({}, {}, {})
    #98 = Utf8               java/lang/Object
    #99 = Class              #98          // java/lang/Object
   #100 = Utf8               getObjectId
   #101 = NameAndType        #100:#41     // getObjectId:()I
   #102 = Methodref          #39.#101     // ext/mods/gameserver/model/actor/Player.getObjectId:()I
   #103 = Utf8               java/lang/Integer
   #104 = Class              #103         // java/lang/Integer
   #105 = Utf8               valueOf
   #106 = Utf8               (I)Ljava/lang/Integer;
   #107 = NameAndType        #105:#106    // valueOf:(I)Ljava/lang/Integer;
   #108 = Methodref          #104.#107    // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #109 = Methodref          #82.#101     // ext/mods/gameserver/model/WorldObject.getObjectId:()I
   #110 = Utf8               ext/mods/commons/logging/CLogger
   #111 = Class              #110         // ext/mods/commons/logging/CLogger
   #112 = Utf8               info
   #113 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
   #114 = NameAndType        #112:#113    // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #115 = Methodref          #111.#114    // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #116 = Utf8               _pawn
   #117 = Utf8               Lext/mods/gameserver/model/WorldObject;
   #118 = NameAndType        #116:#117    // _pawn:Lext/mods/gameserver/model/WorldObject;
   #119 = Fieldref           #2.#118      // ext/mods/gameserver/model/actor/move/PlayerMove._pawn:Lext/mods/gameserver/model/WorldObject;
   #120 = Utf8               _offset
   #121 = NameAndType        #120:#26     // _offset:I
   #122 = Fieldref           #2.#121      // ext/mods/gameserver/model/actor/move/PlayerMove._offset:I
   #123 = Utf8               _task
   #124 = Utf8               Ljava/util/concurrent/ScheduledFuture;
   #125 = NameAndType        #123:#124    // _task:Ljava/util/concurrent/ScheduledFuture;
   #126 = Fieldref           #2.#125      // ext/mods/gameserver/model/actor/move/PlayerMove._task:Ljava/util/concurrent/ScheduledFuture;
   #127 = Utf8               updatePosition
   #128 = NameAndType        #127:#59     // updatePosition:()Z
   #129 = Methodref          #2.#128      // ext/mods/gameserver/model/actor/move/PlayerMove.updatePosition:()Z
   #130 = Methodref          #39.#84      // ext/mods/gameserver/model/actor/Player.getX:()I
   #131 = Methodref          #39.#87      // ext/mods/gameserver/model/actor/Player.getY:()I
   #132 = Utf8               _xAccurate
   #133 = NameAndType        #132:#35     // _xAccurate:D
   #134 = Fieldref           #2.#133      // ext/mods/gameserver/model/actor/move/PlayerMove._xAccurate:D
   #135 = Utf8               _yAccurate
   #136 = NameAndType        #135:#35     // _yAccurate:D
   #137 = Fieldref           #2.#136      // ext/mods/gameserver/model/actor/move/PlayerMove._yAccurate:D
   #138 = Utf8               SISTEMA_PATHFINDING
   #139 = NameAndType        #138:#63     // SISTEMA_PATHFINDING:Z
   #140 = Fieldref           #61.#139     // ext/mods/Config.SISTEMA_PATHFINDING:Z
   #141 = Utf8               calculatePath
   #142 = Utf8               (IIIIII)Lext/mods/gameserver/model/location/Location;
   #143 = NameAndType        #141:#142    // calculatePath:(IIIIII)Lext/mods/gameserver/model/location/Location;
   #144 = Methodref          #2.#143      // ext/mods/gameserver/model/actor/move/PlayerMove.calculatePath:(IIIIII)Lext/mods/gameserver/model/location/Location;
   #145 = Utf8               _destination
   #146 = Utf8               Lext/mods/gameserver/model/location/Location;
   #147 = NameAndType        #145:#146    // _destination:Lext/mods/gameserver/model/location/Location;
   #148 = Fieldref           #2.#147      // ext/mods/gameserver/model/actor/move/PlayerMove._destination:Lext/mods/gameserver/model/location/Location;
   #149 = Utf8               ext/mods/gameserver/model/location/Location
   #150 = Class              #149         // ext/mods/gameserver/model/location/Location
   #151 = Utf8               set
   #152 = Utf8               (Lext/mods/gameserver/model/location/Location;)V
   #153 = NameAndType        #151:#152    // set:(Lext/mods/gameserver/model/location/Location;)V
   #154 = Methodref          #150.#153    // ext/mods/gameserver/model/location/Location.set:(Lext/mods/gameserver/model/location/Location;)V
   #155 = Utf8               getPosition
   #156 = Utf8               ()Lext/mods/gameserver/model/location/SpawnLocation;
   #157 = NameAndType        #155:#156    // getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
   #158 = Methodref          #39.#157     // ext/mods/gameserver/model/actor/Player.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
   #159 = Utf8               ext/mods/gameserver/model/location/SpawnLocation
   #160 = Class              #159         // ext/mods/gameserver/model/location/SpawnLocation
   #161 = Utf8               setHeadingTo
   #162 = NameAndType        #161:#152    // setHeadingTo:(Lext/mods/gameserver/model/location/Location;)V
   #163 = Methodref          #160.#162    // ext/mods/gameserver/model/location/SpawnLocation.setHeadingTo:(Lext/mods/gameserver/model/location/Location;)V
   #164 = Utf8               registerMoveTask
   #165 = NameAndType        #164:#52     // registerMoveTask:()V
   #166 = Methodref          #2.#165      // ext/mods/gameserver/model/actor/move/PlayerMove.registerMoveTask:()V
   #167 = Utf8               ext/mods/gameserver/network/serverpackets/MoveToPawn
   #168 = Class              #167         // ext/mods/gameserver/network/serverpackets/MoveToPawn
   #169 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/WorldObject;I)V
   #170 = NameAndType        #6:#169      // "<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/WorldObject;I)V
   #171 = Methodref          #168.#170    // ext/mods/gameserver/network/serverpackets/MoveToPawn."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/WorldObject;I)V
   #172 = Utf8               ext/mods/gameserver/network/serverpackets/L2GameServerPacket
   #173 = Class              #172         // ext/mods/gameserver/network/serverpackets/L2GameServerPacket
   #174 = Utf8               broadcastPacket
   #175 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #176 = NameAndType        #174:#175    // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #177 = Methodref          #39.#176     // ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #178 = Utf8               syncPlayerLocation
   #179 = Utf8               (Z)V
   #180 = NameAndType        #178:#179    // syncPlayerLocation:(Z)V
   #181 = Methodref          #2.#180      // ext/mods/gameserver/model/actor/move/PlayerMove.syncPlayerLocation:(Z)V
   #182 = Utf8               _geoPath
   #183 = Utf8               Ljava/util/ArrayDeque;
   #184 = NameAndType        #182:#183    // _geoPath:Ljava/util/ArrayDeque;
   #185 = Fieldref           #2.#184      // ext/mods/gameserver/model/actor/move/PlayerMove._geoPath:Ljava/util/ArrayDeque;
   #186 = Utf8               java/util/ArrayDeque
   #187 = Class              #186         // java/util/ArrayDeque
   #188 = Utf8               clear
   #189 = NameAndType        #188:#52     // clear:()V
   #190 = Methodref          #187.#189    // java/util/ArrayDeque.clear:()V
   #191 = Utf8               _isDebugMove
   #192 = NameAndType        #191:#63     // _isDebugMove:Z
   #193 = Fieldref           #2.#192      // ext/mods/gameserver/model/actor/move/PlayerMove._isDebugMove:Z
   #194 = Utf8               (Ljava/lang/Object;)V
   #195 = MethodType         #194         //  (Ljava/lang/Object;)V
   #196 = Utf8               moveToPawn$lambda$0
   #197 = Utf8               (Lext/mods/gameserver/model/actor/move/PlayerMove;IIIIIIILext/mods/gameserver/model/actor/Player;)V
   #198 = NameAndType        #196:#197    // moveToPawn$lambda$0:(Lext/mods/gameserver/model/actor/move/PlayerMove;IIIIIIILext/mods/gameserver/model/actor/Player;)V
   #199 = Methodref          #2.#198      // ext/mods/gameserver/model/actor/move/PlayerMove.moveToPawn$lambda$0:(Lext/mods/gameserver/model/actor/move/PlayerMove;IIIIIIILext/mods/gameserver/model/actor/Player;)V
   #200 = MethodHandle       6:#199       // REF_invokeStatic ext/mods/gameserver/model/actor/move/PlayerMove.moveToPawn$lambda$0:(Lext/mods/gameserver/model/actor/move/PlayerMove;IIIIIIILext/mods/gameserver/model/actor/Player;)V
   #201 = MethodType         #7           //  (Lext/mods/gameserver/model/actor/Player;)V
   #202 = Utf8               java/lang/invoke/LambdaMetafactory
   #203 = Class              #202         // java/lang/invoke/LambdaMetafactory
   #204 = Utf8               metafactory
   #205 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
   #206 = NameAndType        #204:#205    // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
   #207 = Methodref          #203.#206    // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
   #208 = MethodHandle       6:#207       // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
   #209 = Utf8               accept
   #210 = Utf8               (Lext/mods/gameserver/model/actor/move/PlayerMove;IIIIIII)Ljava/util/function/Consumer;
   #211 = NameAndType        #209:#210    // accept:(Lext/mods/gameserver/model/actor/move/PlayerMove;IIIIIII)Ljava/util/function/Consumer;
   #212 = InvokeDynamic      #0:#211      // #0:accept:(Lext/mods/gameserver/model/actor/move/PlayerMove;IIIIIII)Ljava/util/function/Consumer;
   #213 = Utf8               forEachKnownGM
   #214 = Utf8               (Ljava/util/function/Consumer;)V
   #215 = NameAndType        #213:#214    // forEachKnownGM:(Ljava/util/function/Consumer;)V
   #216 = Methodref          #39.#215     // ext/mods/gameserver/model/actor/Player.forEachKnownGM:(Ljava/util/function/Consumer;)V
   #217 = Utf8               (III)V
   #218 = NameAndType        #151:#217    // set:(III)V
   #219 = Methodref          #150.#218    // ext/mods/gameserver/model/location/Location.set:(III)V
   #220 = Utf8               (II)V
   #221 = NameAndType        #161:#220    // setHeadingTo:(II)V
   #222 = Methodref          #160.#221    // ext/mods/gameserver/model/location/SpawnLocation.setHeadingTo:(II)V
   #223 = Utf8               pathStart
   #224 = Utf8               tx
   #225 = Utf8               ty
   #226 = Utf8               tz
   #227 = Utf8               ox
   #228 = Utf8               oy
   #229 = Utf8               oz
   #230 = Utf8               pawn
   #231 = Utf8               offset
   #232 = Utf8               moveToLocation
   #233 = Utf8               (Lext/mods/gameserver/model/location/Location;Z)V
   #234 = Utf8               [MeleeDebug][PlayerMove][moveToLocation] actor={} dest={} pathfinding={}
   #235 = String             #234         // [MeleeDebug][PlayerMove][moveToLocation] actor={} dest={} pathfinding={}
   #236 = Utf8               java/lang/Boolean
   #237 = Class              #236         // java/lang/Boolean
   #238 = Utf8               (Z)Ljava/lang/Boolean;
   #239 = NameAndType        #105:#238    // valueOf:(Z)Ljava/lang/Boolean;
   #240 = Methodref          #237.#239    // java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
   #241 = Utf8               ext/mods/gameserver/model/entity/autofarm/AutoFarmManager
   #242 = Class              #241         // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager
   #243 = Utf8               getInstance
   #244 = Utf8               ()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
   #245 = NameAndType        #243:#244    // getInstance:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
   #246 = Methodref          #242.#245    // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.getInstance:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
   #247 = Utf8               isRouteFarmActive
   #248 = Utf8               (I)Z
   #249 = NameAndType        #247:#248    // isRouteFarmActive:(I)Z
   #250 = Methodref          #242.#249    // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.isRouteFarmActive:(I)Z
   #251 = Utf8               handleAutoFarmMovement
   #252 = NameAndType        #251:#152    // handleAutoFarmMovement:(Lext/mods/gameserver/model/location/Location;)V
   #253 = Methodref          #2.#252      // ext/mods/gameserver/model/actor/move/PlayerMove.handleAutoFarmMovement:(Lext/mods/gameserver/model/location/Location;)V
   #254 = Utf8               clone
   #255 = NameAndType        #254:#156    // clone:()Lext/mods/gameserver/model/location/SpawnLocation;
   #256 = Methodref          #160.#255    // ext/mods/gameserver/model/location/SpawnLocation.clone:()Lext/mods/gameserver/model/location/SpawnLocation;
   #257 = Methodref          #160.#84     // ext/mods/gameserver/model/location/SpawnLocation.getX:()I
   #258 = Methodref          #160.#87     // ext/mods/gameserver/model/location/SpawnLocation.getY:()I
   #259 = Methodref          #160.#42     // ext/mods/gameserver/model/location/SpawnLocation.getZ:()I
   #260 = Methodref          #150.#84     // ext/mods/gameserver/model/location/Location.getX:()I
   #261 = Methodref          #150.#87     // ext/mods/gameserver/model/location/Location.getY:()I
   #262 = Methodref          #150.#42     // ext/mods/gameserver/model/location/Location.getZ:()I
   #263 = Utf8               moveToLocation$lambda$1
   #264 = Utf8               (Lext/mods/gameserver/model/actor/move/PlayerMove;Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/SpawnLocation;Lext/mods/gameserver/model/actor/Player;)V
   #265 = NameAndType        #263:#264    // moveToLocation$lambda$1:(Lext/mods/gameserver/model/actor/move/PlayerMove;Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/SpawnLocation;Lext/mods/gameserver/model/actor/Player;)V
   #266 = Methodref          #2.#265      // ext/mods/gameserver/model/actor/move/PlayerMove.moveToLocation$lambda$1:(Lext/mods/gameserver/model/actor/move/PlayerMove;Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/SpawnLocation;Lext/mods/gameserver/model/actor/Player;)V
   #267 = MethodHandle       6:#266       // REF_invokeStatic ext/mods/gameserver/model/actor/move/PlayerMove.moveToLocation$lambda$1:(Lext/mods/gameserver/model/actor/move/PlayerMove;Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/SpawnLocation;Lext/mods/gameserver/model/actor/Player;)V
   #268 = Utf8               (Lext/mods/gameserver/model/actor/move/PlayerMove;Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/SpawnLocation;)Ljava/util/function/Consumer;
   #269 = NameAndType        #209:#268    // accept:(Lext/mods/gameserver/model/actor/move/PlayerMove;Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/SpawnLocation;)Ljava/util/function/Consumer;
   #270 = InvokeDynamic      #1:#269      // #1:accept:(Lext/mods/gameserver/model/actor/move/PlayerMove;Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/SpawnLocation;)Ljava/util/function/Consumer;
   #271 = Utf8               ext/mods/gameserver/network/serverpackets/MoveToLocation
   #272 = Class              #271         // ext/mods/gameserver/network/serverpackets/MoveToLocation
   #273 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/location/Location;)V
   #274 = NameAndType        #6:#273      // "<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/location/Location;)V
   #275 = Methodref          #272.#274    // ext/mods/gameserver/network/serverpackets/MoveToLocation."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/location/Location;)V
   #276 = Utf8               $i$a$-let-PlayerMove$moveToLocation$1
   #277 = Utf8               it
   #278 = Utf8               loc
   #279 = Utf8               position
   #280 = Utf8               Lext/mods/gameserver/model/location/SpawnLocation;
   #281 = Utf8               destination
   #282 = Utf8               pathfinding
   #283 = Utf8               distance3D
   #284 = Utf8               (Lext/mods/gameserver/model/location/Location;)D
   #285 = NameAndType        #283:#284    // distance3D:(Lext/mods/gameserver/model/location/Location;)D
   #286 = Methodref          #160.#285    // ext/mods/gameserver/model/location/SpawnLocation.distance3D:(Lext/mods/gameserver/model/location/Location;)D
   #287 = Utf8               GEOENGINE_FILE
   #288 = Utf8               Ljava/lang/String;
   #289 = NameAndType        #287:#288    // GEOENGINE_FILE:Ljava/lang/String;
   #290 = Fieldref           #61.#289     // ext/mods/Config.GEOENGINE_FILE:Ljava/lang/String;
   #291 = Utf8               initProperties
   #292 = Utf8               (Ljava/lang/String;)Lext/mods/commons/config/ExProperties;
   #293 = NameAndType        #291:#292    // initProperties:(Ljava/lang/String;)Lext/mods/commons/config/ExProperties;
   #294 = Methodref          #61.#293     // ext/mods/Config.initProperties:(Ljava/lang/String;)Lext/mods/commons/config/ExProperties;
   #295 = Utf8               MovementStepSize
   #296 = String             #295         // MovementStepSize
   #297 = Utf8               ext/mods/commons/config/ExProperties
   #298 = Class              #297         // ext/mods/commons/config/ExProperties
   #299 = Utf8               getProperty
   #300 = Utf8               (Ljava/lang/String;I)I
   #301 = NameAndType        #299:#300    // getProperty:(Ljava/lang/String;I)I
   #302 = Methodref          #298.#301    // ext/mods/commons/config/ExProperties.getProperty:(Ljava/lang/String;I)I
   #303 = Utf8               ext/mods/gameserver/geoengine/GeoEngine
   #304 = Class              #303         // ext/mods/gameserver/geoengine/GeoEngine
   #305 = Utf8               Companion
   #306 = Utf8               Lext/mods/gameserver/geoengine/GeoEngine$Companion;
   #307 = NameAndType        #305:#306    // Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
   #308 = Fieldref           #304.#307    // ext/mods/gameserver/geoengine/GeoEngine.Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
   #309 = Utf8               ext/mods/gameserver/geoengine/GeoEngine$Companion
   #310 = Class              #309         // ext/mods/gameserver/geoengine/GeoEngine$Companion
   #311 = Utf8               ()Lext/mods/gameserver/geoengine/GeoEngine;
   #312 = NameAndType        #243:#311    // getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
   #313 = Methodref          #310.#312    // ext/mods/gameserver/geoengine/GeoEngine$Companion.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
   #314 = Utf8               findPath
   #315 = Utf8               (IIIIIIZLext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
   #316 = NameAndType        #314:#315    // findPath:(IIIIIIZLext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
   #317 = Methodref          #304.#316    // ext/mods/gameserver/geoengine/GeoEngine.findPath:(IIIIIIZLext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
   #318 = Utf8               java/util/Collection
   #319 = Class              #318         // java/util/Collection
   #320 = Utf8               isEmpty
   #321 = NameAndType        #320:#59     // isEmpty:()Z
   #322 = InterfaceMethodref #319.#321    // java/util/Collection.isEmpty:()Z
   #323 = Utf8               java/util/List
   #324 = Class              #323         // java/util/List
   #325 = Utf8               get
   #326 = Utf8               (I)Ljava/lang/Object;
   #327 = NameAndType        #325:#326    // get:(I)Ljava/lang/Object;
   #328 = InterfaceMethodref #324.#327    // java/util/List.get:(I)Ljava/lang/Object;
   #329 = Utf8               setXYZ
   #330 = NameAndType        #329:#217    // setXYZ:(III)V
   #331 = Methodref          #39.#330     // ext/mods/gameserver/model/actor/Player.setXYZ:(III)V
   #332 = Utf8               revalidateZone
   #333 = NameAndType        #332:#179    // revalidateZone:(Z)V
   #334 = Methodref          #39.#333     // ext/mods/gameserver/model/actor/Player.revalidateZone:(Z)V
   #335 = Utf8               startAutoFarmMove
   #336 = NameAndType        #335:#152    // startAutoFarmMove:(Lext/mods/gameserver/model/location/Location;)V
   #337 = Methodref          #2.#336      // ext/mods/gameserver/model/actor/move/PlayerMove.startAutoFarmMove:(Lext/mods/gameserver/model/location/Location;)V
   #338 = Utf8               path
   #339 = Utf8               Ljava/util/List;
   #340 = Utf8               currentPos
   #341 = Utf8               distance
   #342 = Utf8               stepSize
   #343 = Utf8               nextDestination
   #344 = Utf8               isVisible
   #345 = NameAndType        #344:#59     // isVisible:()Z
   #346 = Methodref          #39.#345     // ext/mods/gameserver/model/actor/Player.isVisible:()Z
   #347 = Utf8               knows
   #348 = Utf8               (Lext/mods/gameserver/model/WorldObject;)Z
   #349 = NameAndType        #347:#348    // knows:(Lext/mods/gameserver/model/WorldObject;)Z
   #350 = Methodref          #39.#349     // ext/mods/gameserver/model/actor/Player.knows:(Lext/mods/gameserver/model/WorldObject;)Z
   #351 = Utf8               java/time/temporal/Temporal
   #352 = Class              #351         // java/time/temporal/Temporal
   #353 = Utf8               java/time/Duration
   #354 = Class              #353         // java/time/Duration
   #355 = Utf8               between
   #356 = Utf8               (Ljava/time/temporal/Temporal;Ljava/time/temporal/Temporal;)Ljava/time/Duration;
   #357 = NameAndType        #355:#356    // between:(Ljava/time/temporal/Temporal;Ljava/time/temporal/Temporal;)Ljava/time/Duration;
   #358 = Methodref          #354.#357    // java/time/Duration.between:(Ljava/time/temporal/Temporal;Ljava/time/temporal/Temporal;)Ljava/time/Duration;
   #359 = Utf8               toMillis
   #360 = Utf8               ()J
   #361 = NameAndType        #359:#360    // toMillis:()J
   #362 = Methodref          #354.#361    // java/time/Duration.toMillis:()J
   #363 = Utf8               getMoveType
   #364 = Utf8               ()Lext/mods/gameserver/enums/actors/MoveType;
   #365 = NameAndType        #363:#364    // getMoveType:()Lext/mods/gameserver/enums/actors/MoveType;
   #366 = Methodref          #2.#365      // ext/mods/gameserver/model/actor/move/PlayerMove.getMoveType:()Lext/mods/gameserver/enums/actors/MoveType;
   #367 = Utf8               getBoatInfo
   #368 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/BoatInfo;
   #369 = NameAndType        #367:#368    // getBoatInfo:()Lext/mods/gameserver/model/actor/container/player/BoatInfo;
   #370 = Methodref          #39.#369     // ext/mods/gameserver/model/actor/Player.getBoatInfo:()Lext/mods/gameserver/model/actor/container/player/BoatInfo;
   #371 = Utf8               ext/mods/gameserver/model/actor/container/player/BoatInfo
   #372 = Class              #371         // ext/mods/gameserver/model/actor/container/player/BoatInfo
   #373 = Utf8               getBoat
   #374 = Utf8               ()Lext/mods/gameserver/model/actor/Boat;
   #375 = NameAndType        #373:#374    // getBoat:()Lext/mods/gameserver/model/actor/Boat;
   #376 = Methodref          #372.#375    // ext/mods/gameserver/model/actor/container/player/BoatInfo.getBoat:()Lext/mods/gameserver/model/actor/Boat;
   #377 = Utf8               ext/mods/gameserver/enums/actors/MoveType
   #378 = Class              #377         // ext/mods/gameserver/enums/actors/MoveType
   #379 = Utf8               FLY
   #380 = Utf8               Lext/mods/gameserver/enums/actors/MoveType;
   #381 = NameAndType        #379:#380    // FLY:Lext/mods/gameserver/enums/actors/MoveType;
   #382 = Fieldref           #378.#381    // ext/mods/gameserver/enums/actors/MoveType.FLY:Lext/mods/gameserver/enums/actors/MoveType;
   #383 = Utf8               SWIM
   #384 = NameAndType        #383:#380    // SWIM:Lext/mods/gameserver/enums/actors/MoveType;
   #385 = Fieldref           #378.#384    // ext/mods/gameserver/enums/actors/MoveType.SWIM:Lext/mods/gameserver/enums/actors/MoveType;
   #386 = Utf8               kotlin/jvm/internal/Intrinsics
   #387 = Class              #386         // kotlin/jvm/internal/Intrinsics
   #388 = Utf8               checkNotNull
   #389 = NameAndType        #388:#194    // checkNotNull:(Ljava/lang/Object;)V
   #390 = Methodref          #387.#389    // kotlin/jvm/internal/Intrinsics.checkNotNull:(Ljava/lang/Object;)V
   #391 = Methodref          #82.#157     // ext/mods/gameserver/model/WorldObject.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
   #392 = Utf8               ext/mods/gameserver/data/manager/ZoneManager
   #393 = Class              #392         // ext/mods/gameserver/data/manager/ZoneManager
   #394 = Utf8               ()Lext/mods/gameserver/data/manager/ZoneManager;
   #395 = NameAndType        #243:#394    // getInstance:()Lext/mods/gameserver/data/manager/ZoneManager;
   #396 = Methodref          #393.#395    // ext/mods/gameserver/data/manager/ZoneManager.getInstance:()Lext/mods/gameserver/data/manager/ZoneManager;
   #397 = Utf8               ext/mods/gameserver/model/zone/type/WaterZone
   #398 = Class              #397         // ext/mods/gameserver/model/zone/type/WaterZone
   #399 = Utf8               getZone
   #400 = Utf8               (IIILjava/lang/Class;)Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
   #401 = NameAndType        #399:#400    // getZone:(IIILjava/lang/Class;)Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
   #402 = Methodref          #393.#401    // ext/mods/gameserver/data/manager/ZoneManager.getZone:(IIILjava/lang/Class;)Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
   #403 = Utf8               GROUND
   #404 = NameAndType        #403:#380    // GROUND:Lext/mods/gameserver/enums/actors/MoveType;
   #405 = Fieldref           #378.#404    // ext/mods/gameserver/enums/actors/MoveType.GROUND:Lext/mods/gameserver/enums/actors/MoveType;
   #406 = Utf8               getHeight
   #407 = Utf8               (Lext/mods/gameserver/model/location/Location;)S
   #408 = NameAndType        #406:#407    // getHeight:(Lext/mods/gameserver/model/location/Location;)S
   #409 = Methodref          #304.#408    // ext/mods/gameserver/geoengine/GeoEngine.getHeight:(Lext/mods/gameserver/model/location/Location;)S
   #410 = Utf8               setZ
   #411 = Utf8               (I)V
   #412 = NameAndType        #410:#411    // setZ:(I)V
   #413 = Methodref          #150.#412    // ext/mods/gameserver/model/location/Location.setZ:(I)V
   #414 = Utf8               java/lang/Math
   #415 = Class              #414         // java/lang/Math
   #416 = Utf8               sqrt
   #417 = Utf8               (D)D
   #418 = NameAndType        #416:#417    // sqrt:(D)D
   #419 = Methodref          #415.#418    // java/lang/Math.sqrt:(D)D
   #420 = Utf8               getRealMoveSpeed
   #421 = Utf8               (Z)F
   #422 = NameAndType        #420:#421    // getRealMoveSpeed:(Z)F
   #423 = Methodref          #75.#422     // ext/mods/gameserver/model/actor/status/PlayerStatus.getRealMoveSpeed:(Z)F
   #424 = Double             1000.0d
   #426 = Utf8               (III)S
   #427 = NameAndType        #406:#426    // getHeight:(III)S
   #428 = Methodref          #304.#427    // ext/mods/gameserver/geoengine/GeoEngine.getHeight:(III)S
   #429 = Utf8               getWaterZ
   #430 = NameAndType        #429:#41     // getWaterZ:()I
   #431 = Methodref          #398.#430    // ext/mods/gameserver/model/zone/type/WaterZone.getWaterZ:()I
   #432 = Utf8               rint
   #433 = NameAndType        #432:#417    // rint:(D)D
   #434 = Methodref          #415.#433    // java/lang/Math.rint:(D)D
   #435 = Utf8               isInWater
   #436 = NameAndType        #435:#59     // isInWater:()Z
   #437 = Methodref          #39.#436     // ext/mods/gameserver/model/actor/Player.isInWater:()Z
   #438 = Utf8               min
   #439 = Utf8               (II)I
   #440 = NameAndType        #438:#439    // min:(II)I
   #441 = Methodref          #415.#440    // java/lang/Math.min:(II)I
   #442 = Utf8               validateMovement
   #443 = Utf8               (III)Z
   #444 = NameAndType        #442:#443    // validateMovement:(III)Z
   #445 = Methodref          #2.#444      // ext/mods/gameserver/model/actor/move/PlayerMove.validateMovement:(III)Z
   #446 = Utf8               _blocked
   #447 = NameAndType        #446:#63     // _blocked:Z
   #448 = Fieldref           #2.#447      // ext/mods/gameserver/model/actor/move/PlayerMove._blocked:Z
   #449 = Utf8               raycast
   #450 = Utf8               (IIIIIILext/mods/gameserver/geoengine/geodata/IGeoObject;)Lext/mods/gameserver/model/location/Location;
   #451 = NameAndType        #449:#450    // raycast:(IIIIIILext/mods/gameserver/geoengine/geodata/IGeoObject;)Lext/mods/gameserver/model/location/Location;
   #452 = Methodref          #304.#451    // ext/mods/gameserver/geoengine/GeoEngine.raycast:(IIIIIILext/mods/gameserver/geoengine/geodata/IGeoObject;)Lext/mods/gameserver/model/location/Location;
   #453 = Utf8               (III)D
   #454 = NameAndType        #283:#453    // distance3D:(III)D
   #455 = Methodref          #150.#454    // ext/mods/gameserver/model/location/Location.distance3D:(III)D
   #456 = Utf8               canMoveToTarget
   #457 = Utf8               (IIIIII)Z
   #458 = NameAndType        #456:#457    // canMoveToTarget:(IIIIII)Z
   #459 = Methodref          #304.#458    // ext/mods/gameserver/geoengine/GeoEngine.canMoveToTarget:(IIIIII)Z
   #460 = Utf8               temporaryFixPagan
   #461 = NameAndType        #460:#59     // temporaryFixPagan:()Z
   #462 = Methodref          #39.#461     // ext/mods/gameserver/model/actor/Player.temporaryFixPagan:()Z
   #463 = Utf8               getHeading
   #464 = NameAndType        #463:#41     // getHeading:()I
   #465 = Methodref          #39.#464     // ext/mods/gameserver/model/actor/Player.getHeading:()I
   #466 = Utf8               java/lang/String
   #467 = Class              #466         // java/lang/String
   #468 = Utf8               (I)Ljava/lang/String;
   #469 = NameAndType        #105:#468    // valueOf:(I)Ljava/lang/String;
   #470 = Methodref          #467.#469    // java/lang/String.valueOf:(I)Ljava/lang/String;
   #471 = Utf8               updatePosition$lambda$1
   #472 = Utf8               (Lext/mods/gameserver/model/actor/move/PlayerMove;Ljava/lang/String;Lext/mods/gameserver/enums/actors/MoveType;IIILext/mods/gameserver/model/actor/Player;)V
   #473 = NameAndType        #471:#472    // updatePosition$lambda$1:(Lext/mods/gameserver/model/actor/move/PlayerMove;Ljava/lang/String;Lext/mods/gameserver/enums/actors/MoveType;IIILext/mods/gameserver/model/actor/Player;)V
   #474 = Methodref          #2.#473      // ext/mods/gameserver/model/actor/move/PlayerMove.updatePosition$lambda$1:(Lext/mods/gameserver/model/actor/move/PlayerMove;Ljava/lang/String;Lext/mods/gameserver/enums/actors/MoveType;IIILext/mods/gameserver/model/actor/Player;)V
   #475 = MethodHandle       6:#474       // REF_invokeStatic ext/mods/gameserver/model/actor/move/PlayerMove.updatePosition$lambda$1:(Lext/mods/gameserver/model/actor/move/PlayerMove;Ljava/lang/String;Lext/mods/gameserver/enums/actors/MoveType;IIILext/mods/gameserver/model/actor/Player;)V
   #476 = Utf8               (Lext/mods/gameserver/model/actor/move/PlayerMove;Ljava/lang/String;Lext/mods/gameserver/enums/actors/MoveType;III)Ljava/util/function/Consumer;
   #477 = NameAndType        #209:#476    // accept:(Lext/mods/gameserver/model/actor/move/PlayerMove;Ljava/lang/String;Lext/mods/gameserver/enums/actors/MoveType;III)Ljava/util/function/Consumer;
   #478 = InvokeDynamic      #2:#477      // #2:accept:(Lext/mods/gameserver/model/actor/move/PlayerMove;Ljava/lang/String;Lext/mods/gameserver/enums/actors/MoveType;III)Ljava/util/function/Consumer;
   #479 = Utf8               isOnLastPawnMoveGeoPath
   #480 = NameAndType        #479:#59     // isOnLastPawnMoveGeoPath:()Z
   #481 = Methodref          #2.#480      // ext/mods/gameserver/model/actor/move/PlayerMove.isOnLastPawnMoveGeoPath:()Z
   #482 = Utf8               isIn2DRadius
   #483 = Utf8               (Lext/mods/gameserver/model/WorldObject;I)Z
   #484 = NameAndType        #482:#483    // isIn2DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
   #485 = Methodref          #39.#484     // ext/mods/gameserver/model/actor/Player.isIn2DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
   #486 = Utf8               isIn3DRadius
   #487 = NameAndType        #486:#483    // isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
   #488 = Methodref          #39.#487     // ext/mods/gameserver/model/actor/Player.isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
   #489 = Double             -8.0d
   #491 = Utf8               waterZone
   #492 = Utf8               Lext/mods/gameserver/model/zone/type/WaterZone;
   #493 = Utf8               $i$a$-let-PlayerMove$updatePosition$1
   #494 = Utf8               waterZDiff
   #495 = Utf8               fraction
   #496 = Utf8               isNearGroundUnderWater
   #497 = Utf8               shouldCheckForGround
   #498 = Utf8               raycasted
   #499 = Utf8               heading
   #500 = Utf8               inRange
   #501 = Utf8               instant
   #502 = Utf8               timePassed
   #503 = Utf8               J
   #504 = Utf8               type
   #505 = Utf8               canBypassZCheck
   #506 = Utf8               curX
   #507 = Utf8               curY
   #508 = Utf8               curZ
   #509 = Utf8               isTargetInWater
   #510 = Utf8               dx
   #511 = Utf8               dy
   #512 = Utf8               dz
   #513 = Utf8               leftDistance
   #514 = Utf8               passedDistance
   #515 = Utf8               maxZ
   #516 = Utf8               nextX
   #517 = Utf8               nextY
   #518 = Utf8               nextZ
   #519 = Utf8               calculatePathForAttack
   #520 = Utf8               getGeoX
   #521 = Utf8               (I)I
   #522 = NameAndType        #520:#521    // getGeoX:(I)I
   #523 = Methodref          #310.#522    // ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoX:(I)I
   #524 = Utf8               getGeoY
   #525 = NameAndType        #524:#521    // getGeoY:(I)I
   #526 = Methodref          #310.#525    // ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoY:(I)I
   #527 = Utf8               getHeightNearest
   #528 = NameAndType        #527:#426    // getHeightNearest:(III)S
   #529 = Methodref          #304.#528    // ext/mods/gameserver/geoengine/GeoEngine.getHeightNearest:(III)S
   #530 = Utf8               ext/mods/gameserver/geoengine/pathfinding/PathFinder
   #531 = Class              #530         // ext/mods/gameserver/geoengine/pathfinding/PathFinder
   #532 = NameAndType        #6:#52       // "<init>":()V
   #533 = Methodref          #531.#532    // ext/mods/gameserver/geoengine/pathfinding/PathFinder."<init>":()V
   #534 = Utf8               _isDebugPath
   #535 = NameAndType        #534:#63     // _isDebugPath:Z
   #536 = Fieldref           #2.#535      // ext/mods/gameserver/model/actor/move/PlayerMove._isDebugPath:Z
   #537 = Utf8               ext/mods/gameserver/network/serverpackets/ExServerPrimitive
   #538 = Class              #537         // ext/mods/gameserver/network/serverpackets/ExServerPrimitive
   #539 = Methodref          #538.#532    // ext/mods/gameserver/network/serverpackets/ExServerPrimitive."<init>":()V
   #540 = Utf8               ()Ljava/lang/Object;
   #541 = MethodType         #540         //  ()Ljava/lang/Object;
   #542 = Utf8               calculatePathForAttack$lambda$0
   #543 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/PathFinder;Lext/mods/gameserver/model/actor/move/PlayerMove;IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
   #544 = NameAndType        #542:#543    // calculatePathForAttack$lambda$0:(Lext/mods/gameserver/geoengine/pathfinding/PathFinder;Lext/mods/gameserver/model/actor/move/PlayerMove;IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
   #545 = Methodref          #2.#544      // ext/mods/gameserver/model/actor/move/PlayerMove.calculatePathForAttack$lambda$0:(Lext/mods/gameserver/geoengine/pathfinding/PathFinder;Lext/mods/gameserver/model/actor/move/PlayerMove;IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
   #546 = MethodHandle       6:#545       // REF_invokeStatic ext/mods/gameserver/model/actor/move/PlayerMove.calculatePathForAttack$lambda$0:(Lext/mods/gameserver/geoengine/pathfinding/PathFinder;Lext/mods/gameserver/model/actor/move/PlayerMove;IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
   #547 = Utf8               ()Ljava/util/List;
   #548 = MethodType         #547         //  ()Ljava/util/List;
   #549 = Utf8               invoke
   #550 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/PathFinder;Lext/mods/gameserver/model/actor/move/PlayerMove;IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Lkotlin/jvm/functions/Function0;
   #551 = NameAndType        #549:#550    // invoke:(Lext/mods/gameserver/geoengine/pathfinding/PathFinder;Lext/mods/gameserver/model/actor/move/PlayerMove;IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Lkotlin/jvm/functions/Function0;
   #552 = InvokeDynamic      #3:#551      // #3:invoke:(Lext/mods/gameserver/geoengine/pathfinding/PathFinder;Lext/mods/gameserver/model/actor/move/PlayerMove;IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Lkotlin/jvm/functions/Function0;
   #553 = Utf8               USE_PATHFINDING_POOL
   #554 = NameAndType        #553:#63     // USE_PATHFINDING_POOL:Z
   #555 = Fieldref           #61.#554     // ext/mods/Config.USE_PATHFINDING_POOL:Z
   #556 = Utf8               ext/mods/commons/pool/CoroutinePool
   #557 = Class              #556         // ext/mods/commons/pool/CoroutinePool
   #558 = Utf8               runPathfindingBlocking
   #559 = Utf8               (Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;
   #560 = NameAndType        #558:#559    // runPathfindingBlocking:(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;
   #561 = Methodref          #557.#560    // ext/mods/commons/pool/CoroutinePool.runPathfindingBlocking:(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;
   #562 = Utf8               kotlin/jvm/functions/Function0
   #563 = Class              #562         // kotlin/jvm/functions/Function0
   #564 = NameAndType        #549:#540    // invoke:()Ljava/lang/Object;
   #565 = InterfaceMethodref #563.#564    // kotlin/jvm/functions/Function0.invoke:()Ljava/lang/Object;
   #566 = Utf8               calculatePathForAttack$lambda$1
   #567 = Utf8               (Lext/mods/gameserver/model/actor/move/PlayerMove;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;Lext/mods/gameserver/model/actor/Player;)V
   #568 = NameAndType        #566:#567    // calculatePathForAttack$lambda$1:(Lext/mods/gameserver/model/actor/move/PlayerMove;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;Lext/mods/gameserver/model/actor/Player;)V
   #569 = Methodref          #2.#568      // ext/mods/gameserver/model/actor/move/PlayerMove.calculatePathForAttack$lambda$1:(Lext/mods/gameserver/model/actor/move/PlayerMove;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;Lext/mods/gameserver/model/actor/Player;)V
   #570 = MethodHandle       6:#569       // REF_invokeStatic ext/mods/gameserver/model/actor/move/PlayerMove.calculatePathForAttack$lambda$1:(Lext/mods/gameserver/model/actor/move/PlayerMove;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;Lext/mods/gameserver/model/actor/Player;)V
   #571 = Utf8               (Lext/mods/gameserver/model/actor/move/PlayerMove;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/function/Consumer;
   #572 = NameAndType        #209:#571    // accept:(Lext/mods/gameserver/model/actor/move/PlayerMove;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/function/Consumer;
   #573 = InvokeDynamic      #4:#572      // #4:accept:(Lext/mods/gameserver/model/actor/move/PlayerMove;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/function/Consumer;
   #574 = Utf8               processPathForAttack
   #575 = Utf8               (Ljava/util/List;Lext/mods/gameserver/geoengine/GeoEngine;)Lext/mods/gameserver/model/location/Location;
   #576 = NameAndType        #574:#575    // processPathForAttack:(Ljava/util/List;Lext/mods/gameserver/geoengine/GeoEngine;)Lext/mods/gameserver/model/location/Location;
   #577 = Methodref          #2.#576      // ext/mods/gameserver/model/actor/move/PlayerMove.processPathForAttack:(Ljava/util/List;Lext/mods/gameserver/geoengine/GeoEngine;)Lext/mods/gameserver/model/location/Location;
   #578 = Utf8               geoEngine
   #579 = Utf8               Lext/mods/gameserver/geoengine/GeoEngine;
   #580 = Utf8               gox
   #581 = Utf8               goy
   #582 = Utf8               goz
   #583 = Utf8               gtx
   #584 = Utf8               gty
   #585 = Utf8               gtz
   #586 = Utf8               pathFinder
   #587 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/PathFinder;
   #588 = Utf8               dummy
   #589 = Utf8               Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
   #590 = Utf8               computePath
   #591 = Utf8               Lkotlin/jvm/functions/Function0;
   #592 = Utf8               (Ljava/util/List<+Lext/mods/gameserver/model/location/Location;>;Lext/mods/gameserver/geoengine/GeoEngine;)Lext/mods/gameserver/model/location/Location;
   #593 = InterfaceMethodref #324.#321    // java/util/List.isEmpty:()Z
   #594 = Utf8               getValidLocation
   #595 = Utf8               (IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Lext/mods/gameserver/model/location/Location;
   #596 = NameAndType        #594:#595    // getValidLocation:(IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Lext/mods/gameserver/model/location/Location;
   #597 = Methodref          #304.#596    // ext/mods/gameserver/geoengine/GeoEngine.getValidLocation:(IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Lext/mods/gameserver/model/location/Location;
   #598 = Utf8               _geoPathFailCount
   #599 = NameAndType        #598:#26     // _geoPathFailCount:I
   #600 = Fieldref           #2.#599      // ext/mods/gameserver/model/actor/move/PlayerMove._geoPathFailCount:I
   #601 = Utf8               addAll
   #602 = Utf8               (Ljava/util/Collection;)Z
   #603 = NameAndType        #601:#602    // addAll:(Ljava/util/Collection;)Z
   #604 = Methodref          #187.#603    // java/util/ArrayDeque.addAll:(Ljava/util/Collection;)Z
   #605 = Utf8               poll
   #606 = NameAndType        #605:#540    // poll:()Ljava/lang/Object;
   #607 = Methodref          #187.#606    // java/util/ArrayDeque.poll:()Ljava/lang/Object;
   #608 = Utf8               valid
   #609 = Utf8               isStunned
   #610 = NameAndType        #609:#59     // isStunned:()Z
   #611 = Methodref          #39.#610     // ext/mods/gameserver/model/actor/Player.isStunned:()Z
   #612 = Utf8               isRooted
   #613 = NameAndType        #612:#59     // isRooted:()Z
   #614 = Methodref          #39.#613     // ext/mods/gameserver/model/actor/Player.isRooted:()Z
   #615 = Double             0.2d
   #617 = Utf8               distance2D
   #618 = Utf8               (II)D
   #619 = NameAndType        #617:#618    // distance2D:(II)D
   #620 = Methodref          #160.#619    // ext/mods/gameserver/model/location/SpawnLocation.distance2D:(II)D
   #621 = Utf8               DEVELOPER
   #622 = NameAndType        #621:#63     // DEVELOPER:Z
   #623 = Fieldref           #61.#622     // ext/mods/Config.DEVELOPER:Z
   #624 = Utf8               Player {} tentou mover {} unidades em um tick (max: {})
   #625 = String             #624         // Player {} tentou mover {} unidades em um tick (max: {})
   #626 = Utf8               getName
   #627 = Utf8               ()Ljava/lang/String;
   #628 = NameAndType        #626:#627    // getName:()Ljava/lang/String;
   #629 = Methodref          #39.#628     // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
   #630 = Utf8               java/lang/Double
   #631 = Class              #630         // java/lang/Double
   #632 = Utf8               (D)Ljava/lang/Double;
   #633 = NameAndType        #105:#632    // valueOf:(D)Ljava/lang/Double;
   #634 = Methodref          #631.#633    // java/lang/Double.valueOf:(D)Ljava/lang/Double;
   #635 = Utf8               warn
   #636 = NameAndType        #635:#113    // warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #637 = Methodref          #111.#636    // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #638 = Utf8               maxMovePerTick
   #639 = Utf8               actualMove
   #640 = Utf8               maybeMoveToPawn
   #641 = Utf8               (Lext/mods/gameserver/model/WorldObject;IZ)Z
   #642 = Utf8               areEqual
   #643 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Z
   #644 = NameAndType        #642:#643    // areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
   #645 = Methodref          #387.#644    // kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
   #646 = Utf8               getCollisionRadius
   #647 = Utf8               ()D
   #648 = NameAndType        #646:#647    // getCollisionRadius:()D
   #649 = Methodref          #10.#648     // ext/mods/gameserver/model/actor/Creature.getCollisionRadius:()D
   #650 = Methodref          #39.#648     // ext/mods/gameserver/model/actor/Player.getCollisionRadius:()D
   #651 = Utf8               isMovementDisabled
   #652 = NameAndType        #651:#59     // isMovementDisabled:()Z
   #653 = Methodref          #39.#652     // ext/mods/gameserver/model/actor/Player.isMovementDisabled:()Z
   #654 = NameAndType        #79:#80      // moveToPawn:(Lext/mods/gameserver/model/WorldObject;I)V
   #655 = Methodref          #2.#654      // ext/mods/gameserver/model/actor/move/PlayerMove.moveToPawn:(Lext/mods/gameserver/model/WorldObject;I)V
   #656 = Utf8               targetRadius
   #657 = Utf8               target
   #658 = Utf8               isShiftPressed
   #659 = Utf8               offensiveFollowTask
   #660 = Utf8               (Lext/mods/gameserver/model/actor/Creature;I)V
   #661 = Utf8               _followTask
   #662 = NameAndType        #661:#124    // _followTask:Ljava/util/concurrent/ScheduledFuture;
   #663 = Fieldref           #2.#662      // ext/mods/gameserver/model/actor/move/PlayerMove._followTask:Ljava/util/concurrent/ScheduledFuture;
   #664 = Utf8               getAI
   #665 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
   #666 = NameAndType        #664:#665    // getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
   #667 = Methodref          #39.#666     // ext/mods/gameserver/model/actor/Player.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
   #668 = Utf8               ext/mods/gameserver/model/actor/ai/type/PlayerAI
   #669 = Class              #668         // ext/mods/gameserver/model/actor/ai/type/PlayerAI
   #670 = Utf8               tryToIdle
   #671 = NameAndType        #670:#52     // tryToIdle:()V
   #672 = Methodref          #669.#671    // ext/mods/gameserver/model/actor/ai/type/PlayerAI.tryToIdle:()V
   #673 = Utf8               (Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Lext/mods/gameserver/model/location/Location;
   #674 = NameAndType        #594:#673    // getValidLocation:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Lext/mods/gameserver/model/location/Location;
   #675 = Methodref          #304.#674    // ext/mods/gameserver/geoengine/GeoEngine.getValidLocation:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Lext/mods/gameserver/model/location/Location;
   #676 = Utf8               isInStrictRadius
   #677 = Utf8               (Lext/mods/gameserver/model/location/Location;I)Z
   #678 = NameAndType        #676:#677    // isInStrictRadius:(Lext/mods/gameserver/model/location/Location;I)Z
   #679 = Methodref          #10.#678     // ext/mods/gameserver/model/actor/Creature.isInStrictRadius:(Lext/mods/gameserver/model/location/Location;I)Z
   #680 = NameAndType        #232:#233    // moveToLocation:(Lext/mods/gameserver/model/location/Location;Z)V
   #681 = Methodref          #2.#680      // ext/mods/gameserver/model/actor/move/PlayerMove.moveToLocation:(Lext/mods/gameserver/model/location/Location;Z)V
   #682 = Utf8               realOffset
   #683 = Utf8               moveOk
   #684 = Utf8               isPathClear
   #685 = Utf8               friendlyFollowTask
   #686 = Utf8               NEW_FOLLOW
   #687 = NameAndType        #686:#63     // NEW_FOLLOW:Z
   #688 = Fieldref           #61.#687     // ext/mods/Config.NEW_FOLLOW:Z
   #689 = Methodref          #10.#157     // ext/mods/gameserver/model/actor/Creature.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
   #690 = Utf8               setLocationMinusOffset
   #691 = Utf8               (Lext/mods/gameserver/model/location/Location;D)V
   #692 = NameAndType        #690:#691    // setLocationMinusOffset:(Lext/mods/gameserver/model/location/Location;D)V
   #693 = Methodref          #160.#692    // ext/mods/gameserver/model/location/SpawnLocation.setLocationMinusOffset:(Lext/mods/gameserver/model/location/Location;D)V
   #694 = NameAndType        #482:#677    // isIn2DRadius:(Lext/mods/gameserver/model/location/Location;I)Z
   #695 = Methodref          #39.#694     // ext/mods/gameserver/model/actor/Player.isIn2DRadius:(Lext/mods/gameserver/model/location/Location;I)Z
   #696 = NameAndType        #486:#677    // isIn3DRadius:(Lext/mods/gameserver/model/location/Location;I)Z
   #697 = Methodref          #39.#696     // ext/mods/gameserver/model/actor/Player.isIn3DRadius:(Lext/mods/gameserver/model/location/Location;I)Z
   #698 = Utf8               targetLoc
   #699 = Utf8               Lorg/jetbrains/annotations/Nullable;
   #700 = Utf8               ATTACK_USE_PATHFINDER
   #701 = NameAndType        #700:#63     // ATTACK_USE_PATHFINDER:Z
   #702 = Fieldref           #61.#701     // ext/mods/Config.ATTACK_USE_PATHFINDER:Z
   #703 = NameAndType        #519:#142    // calculatePathForAttack:(IIIIII)Lext/mods/gameserver/model/location/Location;
   #704 = Methodref          #2.#703      // ext/mods/gameserver/model/actor/move/PlayerMove.calculatePathForAttack:(IIIIII)Lext/mods/gameserver/model/location/Location;
   #705 = Utf8               canSee
   #706 = Utf8               (IIIDIIIDLext/mods/gameserver/geoengine/geodata/IGeoObject;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
   #707 = NameAndType        #705:#706    // canSee:(IIIDIIIDLext/mods/gameserver/geoengine/geodata/IGeoObject;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
   #708 = Methodref          #304.#707    // ext/mods/gameserver/geoengine/GeoEngine.canSee:(IIIDIIIDLext/mods/gameserver/geoengine/geodata/IGeoObject;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
   #709 = NameAndType        #6:#217      // "<init>":(III)V
   #710 = Methodref          #150.#709    // ext/mods/gameserver/model/location/Location."<init>":(III)V
   #711 = Double             32.0d
   #713 = Utf8               canFlyToTarget
   #714 = Utf8               (IIIDIII)Z
   #715 = NameAndType        #713:#714    // canFlyToTarget:(IIIDIII)Z
   #716 = Methodref          #304.#715    // ext/mods/gameserver/geoengine/GeoEngine.canFlyToTarget:(IIIDIII)Z
   #717 = Utf8               getValidFlyLocation
   #718 = Utf8               (IIIDIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Lext/mods/gameserver/model/location/Location;
   #719 = NameAndType        #717:#718    // getValidFlyLocation:(IIIDIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Lext/mods/gameserver/model/location/Location;
   #720 = Methodref          #304.#719    // ext/mods/gameserver/geoengine/GeoEngine.getValidFlyLocation:(IIIDIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Lext/mods/gameserver/model/location/Location;
   #721 = Utf8               (IIIIIIZILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
   #722 = NameAndType        #314:#721    // findPath:(IIIIIIZILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
   #723 = Methodref          #304.#722    // ext/mods/gameserver/geoengine/GeoEngine.findPath:(IIIIIIZILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
   #724 = Utf8               size
   #725 = NameAndType        #724:#41     // size:()I
   #726 = InterfaceMethodref #324.#725    // java/util/List.size:()I
   #727 = Utf8               calculatePath$lambda$0
   #728 = NameAndType        #727:#567    // calculatePath$lambda$0:(Lext/mods/gameserver/model/actor/move/PlayerMove;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;Lext/mods/gameserver/model/actor/Player;)V
   #729 = Methodref          #2.#728      // ext/mods/gameserver/model/actor/move/PlayerMove.calculatePath$lambda$0:(Lext/mods/gameserver/model/actor/move/PlayerMove;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;Lext/mods/gameserver/model/actor/Player;)V
   #730 = MethodHandle       6:#729       // REF_invokeStatic ext/mods/gameserver/model/actor/move/PlayerMove.calculatePath$lambda$0:(Lext/mods/gameserver/model/actor/move/PlayerMove;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;Lext/mods/gameserver/model/actor/Player;)V
   #731 = InvokeDynamic      #5:#572      // #5:accept:(Lext/mods/gameserver/model/actor/move/PlayerMove;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/function/Consumer;
   #732 = Utf8               moveType
   #733 = Utf8               isWaterRelated
   #734 = Utf8               maybePlayerMoveToLocation
   #735 = Utf8               (Lext/mods/gameserver/model/location/Location;IZZ)Z
   #736 = Utf8               ext/mods/gameserver/model/location/Point2D
   #737 = Class              #736         // ext/mods/gameserver/model/location/Point2D
   #738 = Utf8               (Lext/mods/gameserver/model/location/Point2D;)D
   #739 = NameAndType        #617:#738    // distance2D:(Lext/mods/gameserver/model/location/Point2D;)D
   #740 = Methodref          #160.#739    // ext/mods/gameserver/model/location/SpawnLocation.distance2D:(Lext/mods/gameserver/model/location/Point2D;)D
   #741 = Double             20.0d
   #743 = Utf8               ENABLE_REAL_TIME_OBSTACLE_AVOIDANCE
   #744 = NameAndType        #743:#63     // ENABLE_REAL_TIME_OBSTACLE_AVOIDANCE:Z
   #745 = Fieldref           #61.#744     // ext/mods/Config.ENABLE_REAL_TIME_OBSTACLE_AVOIDANCE:Z
   #746 = Utf8               ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance
   #747 = Class              #746         // ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance
   #748 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance;
   #749 = NameAndType        #243:#748    // getInstance:()Lext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance;
   #750 = Methodref          #747.#749    // ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance.getInstance:()Lext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance;
   #751 = Utf8               shouldAvoidObstacle
   #752 = Utf8               (Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Z
   #753 = NameAndType        #751:#752    // shouldAvoidObstacle:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Z
   #754 = Methodref          #747.#753    // ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance.shouldAvoidObstacle:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Z
   #755 = Utf8               ext/mods/gameserver/model/actor/move/MovementIntegration
   #756 = Class              #755         // ext/mods/gameserver/model/actor/move/MovementIntegration
   #757 = Methodref          #756.#458    // ext/mods/gameserver/model/actor/move/MovementIntegration.canMoveToTarget:(IIIIII)Z
   #758 = Utf8               ENABLE_SMOOTH_OBSTACLE_AVOIDANCE
   #759 = NameAndType        #758:#63     // ENABLE_SMOOTH_OBSTACLE_AVOIDANCE:Z
   #760 = Fieldref           #61.#759     // ext/mods/Config.ENABLE_SMOOTH_OBSTACLE_AVOIDANCE:Z
   #761 = Utf8               createSmoothPath
   #762 = Utf8               (Ljava/util/List;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
   #763 = NameAndType        #761:#762    // createSmoothPath:(Ljava/util/List;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
   #764 = Methodref          #747.#763    // ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance.createSmoothPath:(Ljava/util/List;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
   #765 = Utf8               kotlin/collections/CollectionsKt
   #766 = Class              #765         // kotlin/collections/CollectionsKt
   #767 = Utf8               firstOrNull
   #768 = Utf8               (Ljava/util/List;)Ljava/lang/Object;
   #769 = NameAndType        #767:#768    // firstOrNull:(Ljava/util/List;)Ljava/lang/Object;
   #770 = Methodref          #766.#769    // kotlin/collections/CollectionsKt.firstOrNull:(Ljava/util/List;)Ljava/lang/Object;
   #771 = Utf8               smoothPath
   #772 = Utf8               dist2D
   #773 = Utf8               hasObstacle
   #774 = Utf8               finalDestination
   #775 = Utf8               startPlayerOffensiveFollow
   #776 = Utf8               [MeleeDebug][PlayerMove][startPlayerOffensiveFollow] actor={} target={} offset={}
   #777 = String             #776         // [MeleeDebug][PlayerMove][startPlayerOffensiveFollow] actor={} target={} offset={}
   #778 = Methodref          #10.#101     // ext/mods/gameserver/model/actor/Creature.getObjectId:()I
   #779 = Utf8               cancelFollowTask
   #780 = NameAndType        #779:#52     // cancelFollowTask:()V
   #781 = Methodref          #2.#780      // ext/mods/gameserver/model/actor/move/PlayerMove.cancelFollowTask:()V
   #782 = MethodType         #52          //  ()V
   #783 = Utf8               startPlayerOffensiveFollow$lambda$0
   #784 = Utf8               (Lext/mods/gameserver/model/actor/move/PlayerMove;Lext/mods/gameserver/model/actor/Creature;I)V
   #785 = NameAndType        #783:#784    // startPlayerOffensiveFollow$lambda$0:(Lext/mods/gameserver/model/actor/move/PlayerMove;Lext/mods/gameserver/model/actor/Creature;I)V
   #786 = Methodref          #2.#785      // ext/mods/gameserver/model/actor/move/PlayerMove.startPlayerOffensiveFollow$lambda$0:(Lext/mods/gameserver/model/actor/move/PlayerMove;Lext/mods/gameserver/model/actor/Creature;I)V
   #787 = MethodHandle       6:#786       // REF_invokeStatic ext/mods/gameserver/model/actor/move/PlayerMove.startPlayerOffensiveFollow$lambda$0:(Lext/mods/gameserver/model/actor/move/PlayerMove;Lext/mods/gameserver/model/actor/Creature;I)V
   #788 = Utf8               run
   #789 = Utf8               (Lext/mods/gameserver/model/actor/move/PlayerMove;Lext/mods/gameserver/model/actor/Creature;I)Ljava/lang/Runnable;
   #790 = NameAndType        #788:#789    // run:(Lext/mods/gameserver/model/actor/move/PlayerMove;Lext/mods/gameserver/model/actor/Creature;I)Ljava/lang/Runnable;
   #791 = InvokeDynamic      #6:#790      // #6:run:(Lext/mods/gameserver/model/actor/move/PlayerMove;Lext/mods/gameserver/model/actor/Creature;I)Ljava/lang/Runnable;
   #792 = Long               5l
   #794 = Long               500l
   #796 = Utf8               scheduleAtFixedRate
   #797 = Utf8               (Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #798 = NameAndType        #796:#797    // scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #799 = Methodref          #557.#798    // ext/mods/commons/pool/CoroutinePool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #800 = Utf8               maybeStartPlayerOffensiveFollow
   #801 = Utf8               (Lext/mods/gameserver/model/actor/Creature;I)Z
   #802 = Utf8               [MeleeDebug][PlayerMove][maybeStartPlayerOffensiveFollow] actor={} target={} range={} dist={}
   #803 = String             #802         // [MeleeDebug][PlayerMove][maybeStartPlayerOffensiveFollow] actor={} target={} range={} dist={}
   #804 = Utf8               (Lext/mods/gameserver/model/WorldObject;)D
   #805 = NameAndType        #617:#804    // distance2D:(Lext/mods/gameserver/model/WorldObject;)D
   #806 = Methodref          #39.#805     // ext/mods/gameserver/model/actor/Player.distance2D:(Lext/mods/gameserver/model/WorldObject;)D
   #807 = Utf8               canSeeTarget
   #808 = Utf8               (Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
   #809 = NameAndType        #807:#808    // canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
   #810 = Methodref          #756.#809    // ext/mods/gameserver/model/actor/move/MovementIntegration.canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
   #811 = Utf8               getCurrentIntention
   #812 = Utf8               ()Lext/mods/gameserver/model/actor/ai/Intention;
   #813 = NameAndType        #811:#812    // getCurrentIntention:()Lext/mods/gameserver/model/actor/ai/Intention;
   #814 = Methodref          #669.#813    // ext/mods/gameserver/model/actor/ai/type/PlayerAI.getCurrentIntention:()Lext/mods/gameserver/model/actor/ai/Intention;
   #815 = Utf8               ext/mods/gameserver/model/actor/ai/Intention
   #816 = Class              #815         // ext/mods/gameserver/model/actor/ai/Intention
   #817 = NameAndType        #456:#59     // canMoveToTarget:()Z
   #818 = Methodref          #816.#817    // ext/mods/gameserver/model/actor/ai/Intention.canMoveToTarget:()Z
   #819 = NameAndType        #775:#660    // startPlayerOffensiveFollow:(Lext/mods/gameserver/model/actor/Creature;I)V
   #820 = Methodref          #2.#819      // ext/mods/gameserver/model/actor/move/PlayerMove.startPlayerOffensiveFollow:(Lext/mods/gameserver/model/actor/Creature;I)V
   #821 = Utf8               java/lang/System
   #822 = Class              #821         // java/lang/System
   #823 = Utf8               currentTimeMillis
   #824 = NameAndType        #823:#360    // currentTimeMillis:()J
   #825 = Methodref          #822.#824    // java/lang/System.currentTimeMillis:()J
   #826 = Utf8               _lastStuckCheckTime
   #827 = NameAndType        #826:#503    // _lastStuckCheckTime:J
   #828 = Fieldref           #2.#827      // ext/mods/gameserver/model/actor/move/PlayerMove._lastStuckCheckTime:J
   #829 = Long               800l
   #831 = Utf8               abs
   #832 = NameAndType        #831:#521    // abs:(I)I
   #833 = Methodref          #415.#832    // java/lang/Math.abs:(I)I
   #834 = NameAndType        #831:#417    // abs:(D)D
   #835 = Methodref          #415.#834    // java/lang/Math.abs:(D)D
   #836 = Double             5.0d
   #838 = Utf8               isMoving
   #839 = NameAndType        #838:#59     // isMoving:()Z
   #840 = Methodref          #39.#839     // ext/mods/gameserver/model/actor/Player.isMoving:()Z
   #841 = NameAndType        #578:#579    // geoEngine:Lext/mods/gameserver/geoengine/GeoEngine;
   #842 = Fieldref           #5.#841      // ext/mods/gameserver/model/actor/move/CreatureMove.geoEngine:Lext/mods/gameserver/geoengine/GeoEngine;
   #843 = Methodref          #10.#84      // ext/mods/gameserver/model/actor/Creature.getX:()I
   #844 = Methodref          #10.#87      // ext/mods/gameserver/model/actor/Creature.getY:()I
   #845 = Methodref          #10.#42      // ext/mods/gameserver/model/actor/Creature.getZ:()I
   #846 = Utf8               java/lang/Iterable
   #847 = Class              #846         // java/lang/Iterable
   #848 = Utf8               iterator
   #849 = Utf8               ()Ljava/util/Iterator;
   #850 = NameAndType        #848:#849    // iterator:()Ljava/util/Iterator;
   #851 = InterfaceMethodref #847.#850    // java/lang/Iterable.iterator:()Ljava/util/Iterator;
   #852 = Utf8               java/util/Iterator
   #853 = Class              #852         // java/util/Iterator
   #854 = Utf8               hasNext
   #855 = NameAndType        #854:#59     // hasNext:()Z
   #856 = InterfaceMethodref #853.#855    // java/util/Iterator.hasNext:()Z
   #857 = Utf8               next
   #858 = NameAndType        #857:#540    // next:()Ljava/lang/Object;
   #859 = InterfaceMethodref #853.#858    // java/util/Iterator.next:()Ljava/lang/Object;
   #860 = NameAndType        #617:#284    // distance2D:(Lext/mods/gameserver/model/location/Location;)D
   #861 = Methodref          #39.#860     // ext/mods/gameserver/model/actor/Player.distance2D:(Lext/mods/gameserver/model/location/Location;)D
   #862 = Double             40.0d
   #864 = Utf8               [MeleeDebug][PlayerMove][maybeStartPlayerOffensiveFollow] stuckRepath actor={} target={} next={}
   #865 = String             #864         // [MeleeDebug][PlayerMove][maybeStartPlayerOffensiveFollow] stuckRepath actor={} target={} next={}
   #866 = Utf8               atan2
   #867 = Utf8               (DD)D
   #868 = NameAndType        #866:#867    // atan2:(DD)D
   #869 = Methodref          #415.#868    // java/lang/Math.atan2:(DD)D
   #870 = Double             1.5707963267948966d
   #872 = Double             -1.5707963267948966d
   #874 = Utf8               cos
   #875 = NameAndType        #874:#417    // cos:(D)D
   #876 = Methodref          #415.#875    // java/lang/Math.cos:(D)D
   #877 = Utf8               sin
   #878 = NameAndType        #877:#417    // sin:(D)D
   #879 = Methodref          #415.#878    // java/lang/Math.sin:(D)D
   #880 = Utf8               [MeleeDebug][PlayerMove][maybeStartPlayerOffensiveFollow] stuckBypass actor={} target={} dest={} step={} side={}
   #881 = String             #880         // [MeleeDebug][PlayerMove][maybeStartPlayerOffensiveFollow] stuckBypass actor={} target={} dest={} step={} side={}
   #882 = Utf8               primary
   #883 = String             #882         // primary
   #884 = Utf8               secondary
   #885 = String             #884         // secondary
   #886 = Utf8               [MeleeDebug][PlayerMove][maybeStartPlayerOffensiveFollow] forcedPath actor={} target={} next={}
   #887 = String             #886         // [MeleeDebug][PlayerMove][maybeStartPlayerOffensiveFollow] forcedPath actor={} target={} next={}
   #888 = Utf8               $i$a$-firstOrNull-PlayerMove$maybeStartPlayerOffensiveFollow$next$1
   #889 = Utf8               element$iv
   #890 = Utf8               Ljava/lang/Object;
   #891 = Utf8               $i$f$firstOrNull
   #892 = Utf8               $this$firstOrNull$iv
   #893 = Utf8               Ljava/lang/Iterable;
   #894 = Utf8               candidatePath
   #895 = Utf8               bypassLoc
   #896 = Utf8               bypassX
   #897 = Utf8               bypassY
   #898 = Utf8               bypassZ
   #899 = Utf8               step
   #900 = Utf8               angle
   #901 = Utf8               primaryOffset
   #902 = Utf8               offsets
   #903 = Utf8               [D
   #904 = Utf8               bypassSteps
   #905 = Utf8               [I
   #906 = Utf8               curDist
   #907 = Utf8               movedTooLittle
   #908 = Utf8               stuck
   #909 = Utf8               totalRadius
   #910 = Utf8               shouldFollow
   #911 = Utf8               weaponAttackRange
   #912 = Class              #903         // "[D"
   #913 = Class              #905         // "[I"
   #914 = Utf8               [Ljava/lang/Object;
   #915 = Class              #914         // "[Ljava/lang/Object;"
   #916 = Utf8               MOVE\u0001
   #917 = String             #916         // MOVE\u0001
   #918 = Utf8               java/lang/invoke/StringConcatFactory
   #919 = Class              #918         // java/lang/invoke/StringConcatFactory
   #920 = Utf8               makeConcatWithConstants
   #921 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #922 = NameAndType        #920:#921    // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #923 = Methodref          #919.#922    // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #924 = MethodHandle       6:#923       // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #925 = NameAndType        #920:#468    // makeConcatWithConstants:(I)Ljava/lang/String;
   #926 = InvokeDynamic      #7:#925      // #7:makeConcatWithConstants:(I)Ljava/lang/String;
   #927 = Utf8               getDebugPacket
   #928 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
   #929 = NameAndType        #927:#928    // getDebugPacket:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
   #930 = Methodref          #39.#929     // ext/mods/gameserver/model/actor/Player.getDebugPacket:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
   #931 = Utf8               reset
   #932 = NameAndType        #931:#52     // reset:()V
   #933 = Methodref          #538.#932    // ext/mods/gameserver/network/serverpackets/ExServerPrimitive.reset:()V
   #934 = Utf8               java/awt/Color
   #935 = Class              #934         // java/awt/Color
   #936 = Utf8               RED
   #937 = Utf8               Ljava/awt/Color;
   #938 = NameAndType        #936:#937    // RED:Ljava/awt/Color;
   #939 = Fieldref           #935.#938    // java/awt/Color.RED:Ljava/awt/Color;
   #940 = Utf8               addPoint
   #941 = Utf8               (Ljava/awt/Color;III)V
   #942 = NameAndType        #940:#941    // addPoint:(Ljava/awt/Color;III)V
   #943 = Methodref          #538.#942    // ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addPoint:(Ljava/awt/Color;III)V
   #944 = Utf8               MoveToPawn (\u0001): \u0001 \u0001 \u0001
   #945 = String             #944         // MoveToPawn (\u0001): \u0001 \u0001 \u0001
   #946 = Utf8               (IIII)Ljava/lang/String;
   #947 = NameAndType        #920:#946    // makeConcatWithConstants:(IIII)Ljava/lang/String;
   #948 = InvokeDynamic      #8:#947      // #8:makeConcatWithConstants:(IIII)Ljava/lang/String;
   #949 = Utf8               WHITE
   #950 = NameAndType        #949:#937    // WHITE:Ljava/awt/Color;
   #951 = Fieldref           #935.#950    // java/awt/Color.WHITE:Ljava/awt/Color;
   #952 = Utf8               addLine
   #953 = Utf8               (Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
   #954 = NameAndType        #952:#953    // addLine:(Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
   #955 = Methodref          #538.#954    // ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
   #956 = Utf8               Moving from \u0001 \u0001 \u0001 to \u0001 \u0001 \u0001
   #957 = String             #956         // Moving from \u0001 \u0001 \u0001 to \u0001 \u0001 \u0001
   #958 = Utf8               (IIIIII)Ljava/lang/String;
   #959 = NameAndType        #920:#958    // makeConcatWithConstants:(IIIIII)Ljava/lang/String;
   #960 = InvokeDynamic      #9:#959      // #9:makeConcatWithConstants:(IIIIII)Ljava/lang/String;
   #961 = Utf8               sendMessage
   #962 = Utf8               (Ljava/lang/String;)V
   #963 = NameAndType        #961:#962    // sendMessage:(Ljava/lang/String;)V
   #964 = Methodref          #39.#963     // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
   #965 = Utf8               debug
   #966 = Utf8               this$0
   #967 = Utf8               $ox
   #968 = Utf8               $oy
   #969 = Utf8               $oz
   #970 = Utf8               $offset
   #971 = Utf8               $tx
   #972 = Utf8               $ty
   #973 = Utf8               $tz
   #974 = Utf8               p
   #975 = Utf8               MoveToLocation: \u0001
   #976 = String             #975         // MoveToLocation: \u0001
   #977 = Utf8               (Lext/mods/gameserver/model/location/Location;)Ljava/lang/String;
   #978 = NameAndType        #920:#977    // makeConcatWithConstants:(Lext/mods/gameserver/model/location/Location;)Ljava/lang/String;
   #979 = InvokeDynamic      #10:#978     // #10:makeConcatWithConstants:(Lext/mods/gameserver/model/location/Location;)Ljava/lang/String;
   #980 = Utf8               (Ljava/lang/String;Ljava/awt/Color;ZLext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)V
   #981 = NameAndType        #952:#980    // addLine:(Ljava/lang/String;Ljava/awt/Color;ZLext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)V
   #982 = Methodref          #538.#981    // ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/lang/String;Ljava/awt/Color;ZLext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)V
   #983 = Utf8               getDockedBoat
   #984 = NameAndType        #983:#374    // getDockedBoat:()Lext/mods/gameserver/model/actor/Boat;
   #985 = Methodref          #39.#984     // ext/mods/gameserver/model/actor/Player.getDockedBoat:()Lext/mods/gameserver/model/actor/Boat;
   #986 = Utf8               Boat Entrance
   #987 = String             #986         // Boat Entrance
   #988 = Utf8               ext/mods/gameserver/model/actor/Boat
   #989 = Class              #988         // ext/mods/gameserver/model/actor/Boat
   #990 = Utf8               getEngine
   #991 = Utf8               ()Lext/mods/gameserver/model/boat/BoatEngine;
   #992 = NameAndType        #990:#991    // getEngine:()Lext/mods/gameserver/model/boat/BoatEngine;
   #993 = Methodref          #989.#992    // ext/mods/gameserver/model/actor/Boat.getEngine:()Lext/mods/gameserver/model/boat/BoatEngine;
   #994 = Utf8               ext/mods/gameserver/model/boat/BoatEngine
   #995 = Class              #994         // ext/mods/gameserver/model/boat/BoatEngine
   #996 = Utf8               getDock
   #997 = Utf8               ()Lext/mods/gameserver/enums/boats/BoatDock;
   #998 = NameAndType        #996:#997    // getDock:()Lext/mods/gameserver/enums/boats/BoatDock;
   #999 = Methodref          #995.#998    // ext/mods/gameserver/model/boat/BoatEngine.getDock:()Lext/mods/gameserver/enums/boats/BoatDock;
  #1000 = Utf8               ext/mods/gameserver/enums/boats/BoatDock
  #1001 = Class              #1000        // ext/mods/gameserver/enums/boats/BoatDock
  #1002 = Utf8               getBoatEntrance
  #1003 = Utf8               ()Lext/mods/commons/geometry/basic/Line2D;
  #1004 = NameAndType        #1002:#1003  // getBoatEntrance:()Lext/mods/commons/geometry/basic/Line2D;
  #1005 = Methodref          #1001.#1004  // ext/mods/gameserver/enums/boats/BoatDock.getBoatEntrance:()Lext/mods/commons/geometry/basic/Line2D;
  #1006 = Utf8               (Ljava/lang/String;Ljava/awt/Color;ZLext/mods/commons/geometry/basic/Line2D;I)V
  #1007 = NameAndType        #952:#1006   // addLine:(Ljava/lang/String;Ljava/awt/Color;ZLext/mods/commons/geometry/basic/Line2D;I)V
  #1008 = Methodref          #538.#1007   // ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/lang/String;Ljava/awt/Color;ZLext/mods/commons/geometry/basic/Line2D;I)V
  #1009 = Utf8               Boat Exit
  #1010 = String             #1009        // Boat Exit
  #1011 = Utf8               getBoatExit
  #1012 = NameAndType        #1011:#1003  // getBoatExit:()Lext/mods/commons/geometry/basic/Line2D;
  #1013 = Methodref          #1001.#1012  // ext/mods/gameserver/enums/boats/BoatDock.getBoatExit:()Lext/mods/commons/geometry/basic/Line2D;
  #1014 = Utf8               (Ljava/awt/Color;Lext/mods/gameserver/model/location/Location;)V
  #1015 = NameAndType        #940:#1014   // addPoint:(Ljava/awt/Color;Lext/mods/gameserver/model/location/Location;)V
  #1016 = Methodref          #538.#1015   // ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addPoint:(Ljava/awt/Color;Lext/mods/gameserver/model/location/Location;)V
  #1017 = Utf8               Segment #1
  #1018 = String             #1017        // Segment #1
  #1019 = Utf8               YELLOW
  #1020 = NameAndType        #1019:#937   // YELLOW:Ljava/awt/Color;
  #1021 = Fieldref           #935.#1020   // java/awt/Color.YELLOW:Ljava/awt/Color;
  #1022 = NameAndType        #6:#152      // "<init>":(Lext/mods/gameserver/model/location/Location;)V
  #1023 = Methodref          #150.#1022   // ext/mods/gameserver/model/location/Location."<init>":(Lext/mods/gameserver/model/location/Location;)V
  #1024 = Methodref          #187.#850    // java/util/ArrayDeque.iterator:()Ljava/util/Iterator;
  #1025 = Utf8               Segment #\u0001
  #1026 = String             #1025        // Segment #\u0001
  #1027 = InvokeDynamic      #11:#925     // #11:makeConcatWithConstants:(I)Ljava/lang/String;
  #1028 = Utf8               No geopath
  #1029 = String             #1028        // No geopath
  #1030 = Utf8               Moving from \u0001 to \u0001
  #1031 = String             #1030        // Moving from \u0001 to \u0001
  #1032 = Utf8               (Lext/mods/gameserver/model/location/SpawnLocation;Lext/mods/gameserver/model/location/Location;)Ljava/lang/String;
  #1033 = NameAndType        #920:#1032   // makeConcatWithConstants:(Lext/mods/gameserver/model/location/SpawnLocation;Lext/mods/gameserver/model/location/Location;)Ljava/lang/String;
  #1034 = InvokeDynamic      #12:#1033    // #12:makeConcatWithConstants:(Lext/mods/gameserver/model/location/SpawnLocation;Lext/mods/gameserver/model/location/Location;)Ljava/lang/String;
  #1035 = Utf8               $i$a$-let-PlayerMove$moveToLocation$2$1
  #1036 = Utf8               Lext/mods/gameserver/model/actor/Boat;
  #1037 = Utf8               geoPos
  #1038 = Utf8               curPos
  #1039 = Utf8               i
  #1040 = Utf8               boat
  #1041 = Utf8               $destination
  #1042 = Utf8               $position
  #1043 = Utf8               (Ljava/lang/String;Ljava/awt/Color;ZLext/mods/gameserver/model/location/Location;)V
  #1044 = NameAndType        #940:#1043   // addPoint:(Ljava/lang/String;Ljava/awt/Color;ZLext/mods/gameserver/model/location/Location;)V
  #1045 = Methodref          #538.#1044   // ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addPoint:(Ljava/lang/String;Ljava/awt/Color;ZLext/mods/gameserver/model/location/Location;)V
  #1046 = Utf8               sendTo
  #1047 = NameAndType        #1046:#7     // sendTo:(Lext/mods/gameserver/model/actor/Player;)V
  #1048 = Methodref          #538.#1047   // ext/mods/gameserver/network/serverpackets/ExServerPrimitive.sendTo:(Lext/mods/gameserver/model/actor/Player;)V
  #1049 = Utf8               Falling/Climb bug found when moving from \u0001, \u0001, \u0001 to \u0001
  #1050 = String             #1049        // Falling/Climb bug found when moving from \u0001, \u0001, \u0001 to \u0001
  #1051 = Utf8               (IIILext/mods/gameserver/model/location/SpawnLocation;)Ljava/lang/String;
  #1052 = NameAndType        #920:#1051   // makeConcatWithConstants:(IIILext/mods/gameserver/model/location/SpawnLocation;)Ljava/lang/String;
  #1053 = InvokeDynamic      #13:#1052    // #13:makeConcatWithConstants:(IIILext/mods/gameserver/model/location/SpawnLocation;)Ljava/lang/String;
  #1054 = Utf8               $heading
  #1055 = Utf8               $type
  #1056 = Utf8               $curZ
  #1057 = Utf8               $curX
  #1058 = Utf8               $curY
  #1059 = Utf8               (Lext/mods/gameserver/model/actor/Creature;IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
  #1060 = NameAndType        #314:#1059   // findPath:(Lext/mods/gameserver/model/actor/Creature;IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
  #1061 = Methodref          #531.#1060   // ext/mods/gameserver/geoengine/pathfinding/PathFinder.findPath:(Lext/mods/gameserver/model/actor/Creature;IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
  #1062 = Utf8               $pathFinder
  #1063 = Utf8               $gox
  #1064 = Utf8               $goy
  #1065 = Utf8               $goz
  #1066 = Utf8               $gtx
  #1067 = Utf8               $gty
  #1068 = Utf8               $gtz
  #1069 = Utf8               $dummy
  #1070 = Utf8               PATH\u0001
  #1071 = String             #1070        // PATH\u0001
  #1072 = InvokeDynamic      #14:#925     // #14:makeConcatWithConstants:(I)Ljava/lang/String;
  #1073 = Utf8               (Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)V
  #1074 = NameAndType        #601:#1073   // addAll:(Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)V
  #1075 = Methodref          #538.#1074   // ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addAll:(Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)V
  #1076 = NameAndType        #659:#660    // offensiveFollowTask:(Lext/mods/gameserver/model/actor/Creature;I)V
  #1077 = Methodref          #2.#1076     // ext/mods/gameserver/model/actor/move/PlayerMove.offensiveFollowTask:(Lext/mods/gameserver/model/actor/Creature;I)V
  #1078 = Utf8               $target
  #1079 = Utf8               <clinit>
  #1080 = Utf8               ext/mods/gameserver/model/actor/move/PlayerMove$Companion
  #1081 = Class              #1080        // ext/mods/gameserver/model/actor/move/PlayerMove$Companion
  #1082 = Utf8               (Lkotlin/jvm/internal/DefaultConstructorMarker;)V
  #1083 = NameAndType        #6:#1082     // "<init>":(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
  #1084 = Methodref          #1081.#1083  // ext/mods/gameserver/model/actor/move/PlayerMove$Companion."<init>":(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
  #1085 = Utf8               Lext/mods/gameserver/model/actor/move/PlayerMove$Companion;
  #1086 = NameAndType        #305:#1085   // Companion:Lext/mods/gameserver/model/actor/move/PlayerMove$Companion;
  #1087 = Fieldref           #2.#1086     // ext/mods/gameserver/model/actor/move/PlayerMove.Companion:Lext/mods/gameserver/model/actor/move/PlayerMove$Companion;
  #1088 = Utf8               Lkotlin/Metadata;
  #1089 = Utf8               mv
  #1090 = Integer            2
  #1091 = Integer            3
  #1092 = Integer            0
  #1093 = Utf8               k
  #1094 = Integer            1
  #1095 = Utf8               xi
  #1096 = Integer            48
  #1097 = Utf8               d1
  #1098 = Utf8               \u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 :2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001:B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\tH\u0002J\u0018\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0013H\u0014J\u0010\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001e\u001a\u00020\u0013H\u0016J:\u0010\u001f\u001a\u0004\u0018\u00010\u001a2\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\t2\u0006\u0010$\u001a\u00020\t2\u0006\u0010%\u001a\u00020\tH\u0002J\"\u0010&\u001a\u0004\u0018\u00010\u001a2\u000e\u0010\'\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010(2\u0006\u0010)\u001a\u00020*H\u0002J \u0010+\u001a\u00020\u00132\u0006\u0010,\u001a\u00020\t2\u0006\u0010-\u001a\u00020\t2\u0006\u0010.\u001a\u00020\tH\u0002J\u001e\u0010/\u001a\u00020\u00132\u0006\u00100\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\t2\u0006\u00101\u001a\u00020\u0013J\u0018\u00102\u001a\u00020\u00112\u0006\u00100\u001a\u0002032\u0006\u0010\u0017\u001a\u00020\tH\u0014J\u0018\u00104\u001a\u00020\u00112\u0006\u00100\u001a\u0002032\u0006\u0010\u0017\u001a\u00020\tH\u0014J:\u00105\u001a\u0004\u0018\u00010\u001a2\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\t2\u0006\u0010$\u001a\u00020\t2\u0006\u0010%\u001a\u00020\tH\u0016J&\u00106\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u00101\u001a\u00020\u0013J\u0016\u00107\u001a\u00020\u00112\u0006\u00100\u001a\u0002032\u0006\u0010\u0017\u001a\u00020\tJ\u0016\u00108\u001a\u00020\u00132\u0006\u00100\u001a\u0002032\u0006\u00109\u001a\u00020\tR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006;
  #1099 = Utf8               d2
  #1100 = Utf8               Lext/mods/gameserver/model/actor/move/CreatureMove;
  #1101 = Utf8
  #1102 = Utf8               Brproject
  #1103 = Utf8               kotlin/jvm/internal/Ref$BooleanRef
  #1104 = Class              #1103        // kotlin/jvm/internal/Ref$BooleanRef
  #1105 = Utf8               kotlin/jvm/internal/Ref
  #1106 = Class              #1105        // kotlin/jvm/internal/Ref
  #1107 = Utf8               BooleanRef
  #1108 = Utf8               kotlin/jvm/internal/Ref$IntRef
  #1109 = Class              #1108        // kotlin/jvm/internal/Ref$IntRef
  #1110 = Utf8               IntRef
  #1111 = Utf8               PlayerMove.kt
  #1112 = Utf8               Lkotlin/jvm/internal/SourceDebugExtension;
  #1113 = Utf8               value
  #1114 = Utf8               SMAP\nPlayerMove.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlayerMove.kt\next/mods/gameserver/model/actor/move/PlayerMove\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,854:1\n1#2:855\n296#3,2:856\n*S KotlinDebug\n*F\n+ 1 PlayerMove.kt\next/mods/gameserver/model/actor/move/PlayerMove\n*L\n768#1:856,2\n*E\n
  #1115 = Utf8               RuntimeInvisibleAnnotations
  #1116 = Utf8               Code
  #1117 = Utf8               LineNumberTable
  #1118 = Utf8               LocalVariableTable
  #1119 = Utf8               RuntimeInvisibleParameterAnnotations
  #1120 = Utf8               StackMapTable
  #1121 = Utf8               Signature
  #1122 = Utf8               InnerClasses
  #1123 = Utf8               SourceFile
  #1124 = Utf8               SourceDebugExtension
  #1125 = Utf8               RuntimeVisibleAnnotations
  #1126 = Utf8               BootstrapMethods
{
  public static final ext.mods.gameserver.model.actor.move.PlayerMove$Companion Companion;
    descriptor: Lext/mods/gameserver/model/actor/move/PlayerMove$Companion;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    RuntimeInvisibleAnnotations:
      0: #8()
        org.jetbrains.annotations.NotNull

  public ext.mods.gameserver.model.actor.move.PlayerMove(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: checkcast     #10                 // class ext/mods/gameserver/model/actor/Creature
         5: invokespecial #13                 // Method ext/mods/gameserver/model/actor/move/CreatureMove."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
         8: aload_0
         9: invokestatic  #19                 // Method java/time/Instant.now:()Ljava/time/Instant;
        12: putfield      #23                 // Field _instant:Ljava/time/Instant;
        15: aload_0
        16: ldc           #24                 // int -2147483648
        18: putfield      #28                 // Field _lastStuckX:I
        21: aload_0
        22: ldc           #24                 // int -2147483648
        24: putfield      #31                 // Field _lastStuckY:I
        27: aload_0
        28: ldc2_w        #32                 // double 1.7976931348623157E308d
        31: putfield      #37                 // Field _lastStuckDist:D
        34: nop
        35: aload_0
        36: aload_1
        37: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Player.getZ:()I
        40: i2d
        41: putfield      #46                 // Field _zAccurate:D
        44: nop
        45: return
      LineNumberTable:
        line 54: 0
        line 60: 8
        line 64: 15
        line 65: 21
        line 66: 27
        line 68: 34
        line 69: 35
        line 70: 44
        line 54: 45
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      46     0  this   Lext/mods/gameserver/model/actor/move/PlayerMove;
            0      46     1 actor   Lext/mods/gameserver/model/actor/Player;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #8()
          org.jetbrains.annotations.NotNull

  public void cancelMoveTask();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokespecial #54                 // Method ext/mods/gameserver/model/actor/move/CreatureMove.cancelMoveTask:()V
         4: aload_0
         5: iconst_0
         6: putfield      #57                 // Field _moveTimeStamp:I
         9: return
      LineNumberTable:
        line 73: 0
        line 74: 4
        line 75: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/actor/move/PlayerMove;

  protected void moveToLocation(ext.mods.gameserver.model.location.Location, boolean);
    descriptor: (Lext/mods/gameserver/model/location/Location;Z)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=7, locals=7, args_size=3
         0: aload_0
         1: invokespecial #91                 // Method isMeleeDebug:()Z
         4: ifeq          48
         7: getstatic     #95                 // Field ext/mods/gameserver/model/actor/move/CreatureMove.LOGGER:Lext/mods/commons/logging/CLogger;
        10: ldc           #235                // String [MeleeDebug][PlayerMove][moveToLocation] actor={} dest={} pathfinding={}
        12: iconst_3
        13: anewarray     #99                 // class java/lang/Object
        16: astore_3
        17: aload_3
        18: iconst_0
        19: aload_0
        20: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        23: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
        26: invokevirtual #102                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        29: invokestatic  #108                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        32: aastore
        33: aload_3
        34: iconst_1
        35: aload_1
        36: aastore
        37: aload_3
        38: iconst_2
        39: iload_2
        40: invokestatic  #240                // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        43: aastore
        44: aload_3
        45: invokevirtual #115                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
        48: invokestatic  #246                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.getInstance:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
        51: aload_0
        52: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        55: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
        58: invokevirtual #102                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        61: invokevirtual #250                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.isRouteFarmActive:(I)Z
        64: ifeq          73
        67: aload_0
        68: aload_1
        69: invokespecial #253                // Method handleAutoFarmMovement:(Lext/mods/gameserver/model/location/Location;)V
        72: return
        73: aload_0
        74: getfield      #126                // Field _task:Ljava/util/concurrent/ScheduledFuture;
        77: ifnull        85
        80: aload_0
        81: invokevirtual #129                // Method updatePosition:()Z
        84: pop
        85: aload_0
        86: invokestatic  #19                 // Method java/time/Instant.now:()Ljava/time/Instant;
        89: putfield      #23                 // Field _instant:Ljava/time/Instant;
        92: aload_0
        93: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        96: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
        99: invokevirtual #158                // Method ext/mods/gameserver/model/actor/Player.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
       102: invokevirtual #256                // Method ext/mods/gameserver/model/location/SpawnLocation.clone:()Lext/mods/gameserver/model/location/SpawnLocation;
       105: astore_3
       106: aload_0
       107: aload_3
       108: invokevirtual #257                // Method ext/mods/gameserver/model/location/SpawnLocation.getX:()I
       111: i2d
       112: putfield      #134                // Field _xAccurate:D
       115: aload_0
       116: aload_3
       117: invokevirtual #258                // Method ext/mods/gameserver/model/location/SpawnLocation.getY:()I
       120: i2d
       121: putfield      #137                // Field _yAccurate:D
       124: aload_0
       125: aload_3
       126: invokevirtual #259                // Method ext/mods/gameserver/model/location/SpawnLocation.getZ:()I
       129: i2d
       130: putfield      #46                 // Field _zAccurate:D
       133: aload_0
       134: getfield      #185                // Field _geoPath:Ljava/util/ArrayDeque;
       137: invokevirtual #190                // Method java/util/ArrayDeque.clear:()V
       140: iload_2
       141: ifeq          202
       144: getstatic     #140                // Field ext/mods/Config.SISTEMA_PATHFINDING:Z
       147: ifeq          202
       150: aload_0
       151: aload_3
       152: invokevirtual #257                // Method ext/mods/gameserver/model/location/SpawnLocation.getX:()I
       155: aload_3
       156: invokevirtual #258                // Method ext/mods/gameserver/model/location/SpawnLocation.getY:()I
       159: aload_3
       160: invokevirtual #259                // Method ext/mods/gameserver/model/location/SpawnLocation.getZ:()I
       163: aload_1
       164: invokevirtual #260                // Method ext/mods/gameserver/model/location/Location.getX:()I
       167: aload_1
       168: invokevirtual #261                // Method ext/mods/gameserver/model/location/Location.getY:()I
       171: aload_1
       172: invokevirtual #262                // Method ext/mods/gameserver/model/location/Location.getZ:()I
       175: invokevirtual #144                // Method calculatePath:(IIIIII)Lext/mods/gameserver/model/location/Location;
       178: astore        4
       180: aload         4
       182: dup
       183: ifnull        200
       186: astore        5
       188: iconst_0
       189: istore        6
       191: aload_1
       192: aload         5
       194: invokevirtual #154                // Method ext/mods/gameserver/model/location/Location.set:(Lext/mods/gameserver/model/location/Location;)V
       197: goto          202
       200: pop
       201: nop
       202: aload_0
       203: getfield      #193                // Field _isDebugMove:Z
       206: ifeq          227
       209: aload_0
       210: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       213: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
       216: aload_0
       217: aload_1
       218: aload_3
       219: invokedynamic #270,  0            // InvokeDynamic #1:accept:(Lext/mods/gameserver/model/actor/move/PlayerMove;Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/SpawnLocation;)Ljava/util/function/Consumer;
       224: invokevirtual #216                // Method ext/mods/gameserver/model/actor/Player.forEachKnownGM:(Ljava/util/function/Consumer;)V
       227: aload_0
       228: getfield      #148                // Field _destination:Lext/mods/gameserver/model/location/Location;
       231: aload_1
       232: invokevirtual #154                // Method ext/mods/gameserver/model/location/Location.set:(Lext/mods/gameserver/model/location/Location;)V
       235: aload_0
       236: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       239: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
       242: invokevirtual #158                // Method ext/mods/gameserver/model/actor/Player.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
       245: aload_1
       246: invokevirtual #163                // Method ext/mods/gameserver/model/location/SpawnLocation.setHeadingTo:(Lext/mods/gameserver/model/location/Location;)V
       249: aload_0
       250: invokevirtual #166                // Method registerMoveTask:()V
       253: aload_0
       254: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       257: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
       260: new           #272                // class ext/mods/gameserver/network/serverpackets/MoveToLocation
       263: dup
       264: aload_0
       265: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       268: aload_1
       269: invokespecial #275                // Method ext/mods/gameserver/network/serverpackets/MoveToLocation."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/location/Location;)V
       272: checkcast     #173                // class ext/mods/gameserver/network/serverpackets/L2GameServerPacket
       275: invokevirtual #177                // Method ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       278: return
      StackMapTable: number_of_entries = 6
        frame_type = 48 /* same */
        frame_type = 24 /* same */
        frame_type = 11 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 114
          locals = [ class ext/mods/gameserver/model/actor/move/PlayerMove, class ext/mods/gameserver/model/location/Location, int, class ext/mods/gameserver/model/location/SpawnLocation, class ext/mods/gameserver/model/location/Location ]
          stack = [ class ext/mods/gameserver/model/location/Location ]
        frame_type = 250 /* chop */
          offset_delta = 1
        frame_type = 24 /* same */
      LineNumberTable:
        line 140: 0
        line 141: 7
        line 142: 12
        line 141: 45
        line 144: 48
        line 145: 67
        line 146: 72
        line 149: 73
        line 150: 80
        line 153: 85
        line 155: 92
        line 157: 106
        line 158: 115
        line 159: 124
        line 161: 133
        line 163: 140
        line 164: 150
        line 165: 163
        line 164: 175
        line 166: 180
        line 855: 188
        line 166: 191
        line 166: 197
        line 166: 200
        line 169: 202
        line 170: 209
        line 202: 227
        line 203: 235
        line 204: 249
        line 205: 253
        line 206: 278
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          191       6     6 $i$a$-let-PlayerMove$moveToLocation$1   I
          188       9     5    it   Lext/mods/gameserver/model/location/Location;
          180      22     4   loc   Lext/mods/gameserver/model/location/Location;
          106     173     3 position   Lext/mods/gameserver/model/location/SpawnLocation;
            0     279     0  this   Lext/mods/gameserver/model/actor/move/PlayerMove;
            0     279     1 destination   Lext/mods/gameserver/model/location/Location;
            0     279     2 pathfinding   Z
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #8()
          org.jetbrains.annotations.NotNull
      parameter 1:

  public boolean updatePosition();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=8, locals=31, args_size=1
         0: aload_0
         1: getfield      #126                // Field _task:Ljava/util/concurrent/ScheduledFuture;
         4: ifnull        20
         7: aload_0
         8: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        11: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
        14: invokevirtual #346                // Method ext/mods/gameserver/model/actor/Player.isVisible:()Z
        17: ifne          22
        20: iconst_1
        21: ireturn
        22: aload_0
        23: getfield      #119                // Field _pawn:Lext/mods/gameserver/model/WorldObject;
        26: ifnull        48
        29: aload_0
        30: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        33: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
        36: aload_0
        37: getfield      #119                // Field _pawn:Lext/mods/gameserver/model/WorldObject;
        40: invokevirtual #350                // Method ext/mods/gameserver/model/actor/Player.knows:(Lext/mods/gameserver/model/WorldObject;)Z
        43: ifne          48
        46: iconst_1
        47: ireturn
        48: invokestatic  #19                 // Method java/time/Instant.now:()Ljava/time/Instant;
        51: astore_1
        52: aload_0
        53: getfield      #23                 // Field _instant:Ljava/time/Instant;
        56: checkcast     #352                // class java/time/temporal/Temporal
        59: aload_1
        60: checkcast     #352                // class java/time/temporal/Temporal
        63: invokestatic  #358                // Method java/time/Duration.between:(Ljava/time/temporal/Temporal;Ljava/time/temporal/Temporal;)Ljava/time/Duration;
        66: invokevirtual #362                // Method java/time/Duration.toMillis:()J
        69: lstore_2
        70: lload_2
        71: lconst_0
        72: lcmp
        73: ifne          78
        76: lconst_1
        77: lstore_2
        78: aload_0
        79: aload_1
        80: putfield      #23                 // Field _instant:Ljava/time/Instant;
        83: aload_0
        84: invokevirtual #366                // Method getMoveType:()Lext/mods/gameserver/enums/actors/MoveType;
        87: astore        4
        89: aload_0
        90: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        93: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
        96: invokevirtual #370                // Method ext/mods/gameserver/model/actor/Player.getBoatInfo:()Lext/mods/gameserver/model/actor/container/player/BoatInfo;
        99: invokevirtual #376                // Method ext/mods/gameserver/model/actor/container/player/BoatInfo.getBoat:()Lext/mods/gameserver/model/actor/Boat;
       102: ifnonnull     121
       105: aload         4
       107: getstatic     #382                // Field ext/mods/gameserver/enums/actors/MoveType.FLY:Lext/mods/gameserver/enums/actors/MoveType;
       110: if_acmpeq     121
       113: aload         4
       115: getstatic     #385                // Field ext/mods/gameserver/enums/actors/MoveType.SWIM:Lext/mods/gameserver/enums/actors/MoveType;
       118: if_acmpne     125
       121: iconst_1
       122: goto          126
       125: iconst_0
       126: istore        5
       128: aload_0
       129: getfield      #57                 // Field _moveTimeStamp:I
       132: istore        6
       134: aload_0
       135: iload         6
       137: iconst_1
       138: iadd
       139: putfield      #57                 // Field _moveTimeStamp:I
       142: aload_0
       143: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       146: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
       149: invokevirtual #130                // Method ext/mods/gameserver/model/actor/Player.getX:()I
       152: istore        6
       154: aload_0
       155: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       158: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
       161: invokevirtual #131                // Method ext/mods/gameserver/model/actor/Player.getY:()I
       164: istore        7
       166: aload_0
       167: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       170: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
       173: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Player.getZ:()I
       176: istore        8
       178: aload_0
       179: getfield      #119                // Field _pawn:Lext/mods/gameserver/model/WorldObject;
       182: ifnull        206
       185: aload_0
       186: getfield      #148                // Field _destination:Lext/mods/gameserver/model/location/Location;
       189: aload_0
       190: getfield      #119                // Field _pawn:Lext/mods/gameserver/model/WorldObject;
       193: dup
       194: invokestatic  #390                // Method kotlin/jvm/internal/Intrinsics.checkNotNull:(Ljava/lang/Object;)V
       197: invokevirtual #391                // Method ext/mods/gameserver/model/WorldObject.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
       200: checkcast     #150                // class ext/mods/gameserver/model/location/Location
       203: invokevirtual #154                // Method ext/mods/gameserver/model/location/Location.set:(Lext/mods/gameserver/model/location/Location;)V
       206: invokestatic  #396                // Method ext/mods/gameserver/data/manager/ZoneManager.getInstance:()Lext/mods/gameserver/data/manager/ZoneManager;
       209: aload_0
       210: getfield      #148                // Field _destination:Lext/mods/gameserver/model/location/Location;
       213: invokevirtual #260                // Method ext/mods/gameserver/model/location/Location.getX:()I
       216: aload_0
       217: getfield      #148                // Field _destination:Lext/mods/gameserver/model/location/Location;
       220: invokevirtual #261                // Method ext/mods/gameserver/model/location/Location.getY:()I
       223: aload_0
       224: getfield      #148                // Field _destination:Lext/mods/gameserver/model/location/Location;
       227: invokevirtual #262                // Method ext/mods/gameserver/model/location/Location.getZ:()I
       230: ldc_w         #398                // class ext/mods/gameserver/model/zone/type/WaterZone
       233: invokevirtual #402                // Method ext/mods/gameserver/data/manager/ZoneManager.getZone:(IIILjava/lang/Class;)Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
       236: ifnull        243
       239: iconst_1
       240: goto          244
       243: iconst_0
       244: istore        9
       246: aload         4
       248: getstatic     #405                // Field ext/mods/gameserver/enums/actors/MoveType.GROUND:Lext/mods/gameserver/enums/actors/MoveType;
       251: if_acmpne     279
       254: iload         9
       256: ifne          279
       259: aload_0
       260: getfield      #148                // Field _destination:Lext/mods/gameserver/model/location/Location;
       263: getstatic     #308                // Field ext/mods/gameserver/geoengine/GeoEngine.Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
       266: invokevirtual #313                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
       269: aload_0
       270: getfield      #148                // Field _destination:Lext/mods/gameserver/model/location/Location;
       273: invokevirtual #409                // Method ext/mods/gameserver/geoengine/GeoEngine.getHeight:(Lext/mods/gameserver/model/location/Location;)S
       276: invokevirtual #413                // Method ext/mods/gameserver/model/location/Location.setZ:(I)V
       279: aload_0
       280: getfield      #148                // Field _destination:Lext/mods/gameserver/model/location/Location;
       283: invokevirtual #260                // Method ext/mods/gameserver/model/location/Location.getX:()I
       286: iload         6
       288: isub
       289: i2d
       290: dstore        10
       292: aload_0
       293: getfield      #148                // Field _destination:Lext/mods/gameserver/model/location/Location;
       296: invokevirtual #261                // Method ext/mods/gameserver/model/location/Location.getY:()I
       299: iload         7
       301: isub
       302: i2d
       303: dstore        12
       305: aload_0
       306: getfield      #148                // Field _destination:Lext/mods/gameserver/model/location/Location;
       309: invokevirtual #262                // Method ext/mods/gameserver/model/location/Location.getZ:()I
       312: iload         8
       314: isub
       315: i2d
       316: dstore        14
       318: aload         4
       320: getstatic     #405                // Field ext/mods/gameserver/enums/actors/MoveType.GROUND:Lext/mods/gameserver/enums/actors/MoveType;
       323: if_acmpne     343
       326: dload         10
       328: dload         10
       330: dmul
       331: dload         12
       333: dload         12
       335: dmul
       336: dadd
       337: invokestatic  #419                // Method java/lang/Math.sqrt:(D)D
       340: goto          363
       343: dload         10
       345: dload         10
       347: dmul
       348: dload         12
       350: dload         12
       352: dmul
       353: dadd
       354: dload         14
       356: dload         14
       358: dmul
       359: dadd
       360: invokestatic  #419                // Method java/lang/Math.sqrt:(D)D
       363: dstore        16
       365: aload_0
       366: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       369: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
       372: invokevirtual #73                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       375: aload         4
       377: getstatic     #382                // Field ext/mods/gameserver/enums/actors/MoveType.FLY:Lext/mods/gameserver/enums/actors/MoveType;
       380: if_acmpeq     395
       383: aload_0
       384: getfield      #57                 // Field _moveTimeStamp:I
       387: iconst_2
       388: if_icmpgt     395
       391: iconst_1
       392: goto          396
       395: iconst_0
       396: invokevirtual #423                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getRealMoveSpeed:(Z)F
       399: f2d
       400: ldc2_w        #424                // double 1000.0d
       403: lload_2
       404: l2d
       405: ddiv
       406: ddiv
       407: dstore        18
       409: iconst_0
       410: istore        20
       412: sipush        16410
       415: istore        20
       417: iload         5
       419: ifeq          480
       422: invokestatic  #396                // Method ext/mods/gameserver/data/manager/ZoneManager.getInstance:()Lext/mods/gameserver/data/manager/ZoneManager;
       425: iload         6
       427: iload         7
       429: iload         8
       431: ldc_w         #398                // class ext/mods/gameserver/model/zone/type/WaterZone
       434: invokevirtual #402                // Method ext/mods/gameserver/data/manager/ZoneManager.getZone:(IIILjava/lang/Class;)Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
       437: checkcast     #398                // class ext/mods/gameserver/model/zone/type/WaterZone
       440: astore        21
       442: aload         21
       444: ifnull        480
       447: getstatic     #308                // Field ext/mods/gameserver/geoengine/GeoEngine.Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
       450: invokevirtual #313                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
       453: iload         6
       455: iload         7
       457: iload         8
       459: invokevirtual #428                // Method ext/mods/gameserver/geoengine/GeoEngine.getHeight:(III)S
       462: aload         21
       464: invokevirtual #431                // Method ext/mods/gameserver/model/zone/type/WaterZone.getWaterZ:()I
       467: isub
       468: bipush        -20
       470: if_icmpge     480
       473: aload         21
       475: invokevirtual #431                // Method ext/mods/gameserver/model/zone/type/WaterZone.getWaterZ:()I
       478: istore        20
       480: iconst_0
       481: istore        21
       483: iconst_0
       484: istore        22
       486: iconst_0
       487: istore        23
       489: dload         18
       491: dload         16
       493: dcmpg
       494: ifge          742
       497: dload         18
       499: dload         16
       501: ddiv
       502: dstore        24
       504: aload_0
       505: aload_0
       506: getfield      #134                // Field _xAccurate:D
       509: dload         10
       511: dload         24
       513: dmul
       514: dadd
       515: putfield      #134                // Field _xAccurate:D
       518: aload_0
       519: aload_0
       520: getfield      #137                // Field _yAccurate:D
       523: dload         12
       525: dload         24
       527: dmul
       528: dadd
       529: putfield      #137                // Field _yAccurate:D
       532: aload_0
       533: aload_0
       534: getfield      #46                 // Field _zAccurate:D
       537: dload         14
       539: dload         24
       541: dmul
       542: dadd
       543: putfield      #46                 // Field _zAccurate:D
       546: aload_0
       547: getfield      #134                // Field _xAccurate:D
       550: invokestatic  #434                // Method java/lang/Math.rint:(D)D
       553: d2i
       554: istore        21
       556: aload_0
       557: getfield      #137                // Field _yAccurate:D
       560: invokestatic  #434                // Method java/lang/Math.rint:(D)D
       563: d2i
       564: istore        22
       566: iconst_0
       567: istore        26
       569: aload_0
       570: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       573: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
       576: invokevirtual #437                // Method ext/mods/gameserver/model/actor/Player.isInWater:()Z
       579: ifeq          669
       582: invokestatic  #396                // Method ext/mods/gameserver/data/manager/ZoneManager.getInstance:()Lext/mods/gameserver/data/manager/ZoneManager;
       585: iload         6
       587: iload         7
       589: iload         8
       591: ldc_w         #398                // class ext/mods/gameserver/model/zone/type/WaterZone
       594: invokevirtual #402                // Method ext/mods/gameserver/data/manager/ZoneManager.getZone:(IIILjava/lang/Class;)Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
       597: checkcast     #398                // class ext/mods/gameserver/model/zone/type/WaterZone
       600: astore        27
       602: aload         27
       604: dup
       605: ifnull        667
       608: astore        28
       610: iconst_0
       611: istore        29
       613: aload         28
       615: invokevirtual #431                // Method ext/mods/gameserver/model/zone/type/WaterZone.getWaterZ:()I
       618: getstatic     #308                // Field ext/mods/gameserver/geoengine/GeoEngine.Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
       621: invokevirtual #313                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
       624: iload         21
       626: iload         22
       628: iload         8
       630: invokevirtual #428                // Method ext/mods/gameserver/geoengine/GeoEngine.getHeight:(III)S
       633: isub
       634: istore        30
       636: iload         30
       638: bipush        16
       640: if_icmpgt     656
       643: iload         30
       645: bipush        -64
       647: if_icmple     656
       650: iconst_1
       651: istore        26
       653: goto          663
       656: aload         28
       658: invokevirtual #431                // Method ext/mods/gameserver/model/zone/type/WaterZone.getWaterZ:()I
       661: istore        20
       663: nop
       664: goto          669
       667: pop
       668: nop
       669: aload         4
       671: getstatic     #405                // Field ext/mods/gameserver/enums/actors/MoveType.GROUND:Lext/mods/gameserver/enums/actors/MoveType;
       674: if_acmpeq     690
       677: aload         4
       679: getstatic     #385                // Field ext/mods/gameserver/enums/actors/MoveType.SWIM:Lext/mods/gameserver/enums/actors/MoveType;
       682: if_acmpne     694
       685: iload         26
       687: ifeq          694
       690: iconst_1
       691: goto          695
       694: iconst_0
       695: istore        27
       697: nop
       698: iload         27
       700: ifeq          724
       703: getstatic     #308                // Field ext/mods/gameserver/geoengine/GeoEngine.Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
       706: invokevirtual #313                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
       709: iload         21
       711: iload         22
       713: iload         8
       715: bipush        16
       717: iadd
       718: invokevirtual #428                // Method ext/mods/gameserver/geoengine/GeoEngine.getHeight:(III)S
       721: goto          732
       724: aload_0
       725: getfield      #46                 // Field _zAccurate:D
       728: invokestatic  #434                // Method java/lang/Math.rint:(D)D
       731: d2i
       732: iload         20
       734: invokestatic  #441                // Method java/lang/Math.min:(II)I
       737: istore        23
       739: goto          774
       742: aload_0
       743: getfield      #148                // Field _destination:Lext/mods/gameserver/model/location/Location;
       746: invokevirtual #260                // Method ext/mods/gameserver/model/location/Location.getX:()I
       749: istore        21
       751: aload_0
       752: getfield      #148                // Field _destination:Lext/mods/gameserver/model/location/Location;
       755: invokevirtual #261                // Method ext/mods/gameserver/model/location/Location.getY:()I
       758: istore        22
       760: aload_0
       761: getfield      #148                // Field _destination:Lext/mods/gameserver/model/location/Location;
       764: invokevirtual #262                // Method ext/mods/gameserver/model/location/Location.getZ:()I
       767: iload         20
       769: invokestatic  #441                // Method java/lang/Math.min:(II)I
       772: istore        23
       774: aload_0
       775: iload         21
       777: iload         22
       779: iload         23
       781: invokespecial #445                // Method validateMovement:(III)Z
       784: ifne          799
       787: aload_0
       788: iconst_1
       789: putfield      #448                // Field _blocked:Z
       792: aload_0
       793: iconst_1
       794: invokevirtual #181                // Method syncPlayerLocation:(Z)V
       797: iconst_1
       798: ireturn
       799: aload_0
       800: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       803: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
       806: invokevirtual #437                // Method ext/mods/gameserver/model/actor/Player.isInWater:()Z
       809: ifne          820
       812: aload         4
       814: getstatic     #382                // Field ext/mods/gameserver/enums/actors/MoveType.FLY:Lext/mods/gameserver/enums/actors/MoveType;
       817: if_acmpne     880
       820: getstatic     #308                // Field ext/mods/gameserver/geoengine/GeoEngine.Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
       823: invokevirtual #313                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
       826: iload         6
       828: iload         7
       830: iload         8
       832: bipush        16
       834: iadd
       835: iload         21
       837: iload         22
       839: iload         23
       841: aconst_null
       842: invokevirtual #452                // Method ext/mods/gameserver/geoengine/GeoEngine.raycast:(IIIIIILext/mods/gameserver/geoengine/geodata/IGeoObject;)Lext/mods/gameserver/model/location/Location;
       845: astore        24
       847: aload         24
       849: ifnull        937
       852: aload         24
       854: iload         21
       856: iload         22
       858: iload         23
       860: invokevirtual #455                // Method ext/mods/gameserver/model/location/Location.distance3D:(III)D
       863: dconst_0
       864: dcmpl
       865: ifle          937
       868: aload_0
       869: iconst_1
       870: putfield      #448                // Field _blocked:Z
       873: aload_0
       874: iconst_1
       875: invokevirtual #181                // Method syncPlayerLocation:(Z)V
       878: iconst_1
       879: ireturn
       880: aload         4
       882: getstatic     #405                // Field ext/mods/gameserver/enums/actors/MoveType.GROUND:Lext/mods/gameserver/enums/actors/MoveType;
       885: if_acmpne     937
       888: getstatic     #308                // Field ext/mods/gameserver/geoengine/GeoEngine.Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
       891: invokevirtual #313                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
       894: iload         6
       896: iload         7
       898: iload         8
       900: iload         21
       902: iload         22
       904: iload         23
       906: invokevirtual #459                // Method ext/mods/gameserver/geoengine/GeoEngine.canMoveToTarget:(IIIIII)Z
       909: ifne          937
       912: aload_0
       913: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       916: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
       919: invokevirtual #462                // Method ext/mods/gameserver/model/actor/Player.temporaryFixPagan:()Z
       922: ifne          937
       925: aload_0
       926: iconst_1
       927: putfield      #448                // Field _blocked:Z
       930: aload_0
       931: iconst_1
       932: invokevirtual #181                // Method syncPlayerLocation:(Z)V
       935: iconst_1
       936: ireturn
       937: aload_0
       938: getfield      #119                // Field _pawn:Lext/mods/gameserver/model/WorldObject;
       941: ifnull        961
       944: aload_0
       945: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       948: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
       951: invokevirtual #158                // Method ext/mods/gameserver/model/actor/Player.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
       954: iload         21
       956: iload         22
       958: invokevirtual #222                // Method ext/mods/gameserver/model/location/SpawnLocation.setHeadingTo:(II)V
       961: aload_0
       962: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       965: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
       968: iload         21
       970: iload         22
       972: iload         23
       974: invokevirtual #331                // Method ext/mods/gameserver/model/actor/Player.setXYZ:(III)V
       977: aload_0
       978: getfield      #193                // Field _isDebugMove:Z
       981: ifeq          1025
       984: aload_0
       985: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       988: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
       991: invokevirtual #465                // Method ext/mods/gameserver/model/actor/Player.getHeading:()I
       994: invokestatic  #470                // Method java/lang/String.valueOf:(I)Ljava/lang/String;
       997: astore        24
       999: aload_0
      1000: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
      1003: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
      1006: aload_0
      1007: aload         24
      1009: aload         4
      1011: iload         8
      1013: iload         6
      1015: iload         7
      1017: invokedynamic #478,  0            // InvokeDynamic #2:accept:(Lext/mods/gameserver/model/actor/move/PlayerMove;Ljava/lang/String;Lext/mods/gameserver/enums/actors/MoveType;III)Ljava/util/function/Consumer;
      1022: invokevirtual #216                // Method ext/mods/gameserver/model/actor/Player.forEachKnownGM:(Ljava/util/function/Consumer;)V
      1025: aload_0
      1026: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
      1029: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
      1032: iconst_0
      1033: invokevirtual #334                // Method ext/mods/gameserver/model/actor/Player.revalidateZone:(Z)V
      1036: aload_0
      1037: invokevirtual #481                // Method isOnLastPawnMoveGeoPath:()Z
      1040: ifeq          1107
      1043: aload         4
      1045: getstatic     #405                // Field ext/mods/gameserver/enums/actors/MoveType.GROUND:Lext/mods/gameserver/enums/actors/MoveType;
      1048: if_acmpne     1076
      1051: aload_0
      1052: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
      1055: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
      1058: aload_0
      1059: getfield      #119                // Field _pawn:Lext/mods/gameserver/model/WorldObject;
      1062: dup
      1063: invokestatic  #390                // Method kotlin/jvm/internal/Intrinsics.checkNotNull:(Ljava/lang/Object;)V
      1066: aload_0
      1067: getfield      #122                // Field _offset:I
      1070: invokevirtual #485                // Method ext/mods/gameserver/model/actor/Player.isIn2DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
      1073: goto          1098
      1076: aload_0
      1077: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
      1080: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
      1083: aload_0
      1084: getfield      #119                // Field _pawn:Lext/mods/gameserver/model/WorldObject;
      1087: dup
      1088: invokestatic  #390                // Method kotlin/jvm/internal/Intrinsics.checkNotNull:(Ljava/lang/Object;)V
      1091: aload_0
      1092: getfield      #122                // Field _offset:I
      1095: invokevirtual #488                // Method ext/mods/gameserver/model/actor/Player.isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
      1098: istore        24
      1100: iload         24
      1102: ifeq          1107
      1105: iconst_1
      1106: ireturn
      1107: aload_0
      1108: getfield      #185                // Field _geoPath:Ljava/util/ArrayDeque;
      1111: checkcast     #319                // class java/util/Collection
      1114: invokeinterface #322,  1          // InterfaceMethod java/util/Collection.isEmpty:()Z
      1119: ifne          1126
      1122: iconst_1
      1123: goto          1127
      1126: iconst_0
      1127: ifeq          1175
      1130: dload         18
      1132: dload         16
      1134: dsub
      1135: ldc2_w        #489                // double -8.0d
      1138: dcmpl
      1139: iflt          1175
      1142: aload_0
      1143: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
      1146: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
      1149: aload_0
      1150: getfield      #148                // Field _destination:Lext/mods/gameserver/model/location/Location;
      1153: invokevirtual #260                // Method ext/mods/gameserver/model/location/Location.getX:()I
      1156: aload_0
      1157: getfield      #148                // Field _destination:Lext/mods/gameserver/model/location/Location;
      1160: invokevirtual #261                // Method ext/mods/gameserver/model/location/Location.getY:()I
      1163: aload_0
      1164: getfield      #148                // Field _destination:Lext/mods/gameserver/model/location/Location;
      1167: invokevirtual #262                // Method ext/mods/gameserver/model/location/Location.getZ:()I
      1170: invokevirtual #331                // Method ext/mods/gameserver/model/actor/Player.setXYZ:(III)V
      1173: iconst_1
      1174: ireturn
      1175: dload         18
      1177: dload         16
      1179: dcmpl
      1180: iflt          1187
      1183: iconst_1
      1184: goto          1188
      1187: iconst_0
      1188: ireturn
      StackMapTable: number_of_entries = 41
        frame_type = 20 /* same */
        frame_type = 1 /* same */
        frame_type = 25 /* same */
        frame_type = 253 /* append */
          offset_delta = 29
          locals = [ class java/time/Instant, long ]
        frame_type = 252 /* append */
          offset_delta = 42
          locals = [ class ext/mods/gameserver/enums/actors/MoveType ]
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 79
          locals = [ class ext/mods/gameserver/model/actor/move/PlayerMove, class java/time/Instant, long, class ext/mods/gameserver/enums/actors/MoveType, int, int, int, int ]
          stack = []
        frame_type = 36 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 34
          locals = [ int ]
        frame_type = 254 /* append */
          offset_delta = 63
          locals = [ double, double, double ]
        frame_type = 83 /* same_locals_1_stack_item */
          stack = [ double ]
        frame_type = 255 /* full_frame */
          offset_delta = 31
          locals = [ class ext/mods/gameserver/model/actor/move/PlayerMove, class java/time/Instant, long, class ext/mods/gameserver/enums/actors/MoveType, int, int, int, int, int, double, double, double, double ]
          stack = [ class ext/mods/gameserver/model/actor/status/PlayerStatus ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/move/PlayerMove, class java/time/Instant, long, class ext/mods/gameserver/enums/actors/MoveType, int, int, int, int, int, double, double, double, double ]
          stack = [ class ext/mods/gameserver/model/actor/status/PlayerStatus, int ]
        frame_type = 253 /* append */
          offset_delta = 83
          locals = [ double, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 175
          locals = [ class ext/mods/gameserver/model/actor/move/PlayerMove, class java/time/Instant, long, class ext/mods/gameserver/enums/actors/MoveType, int, int, int, int, int, double, double, double, double, double, int, int, int, int, double, int, class ext/mods/gameserver/model/zone/type/WaterZone, class ext/mods/gameserver/model/zone/type/WaterZone, int, int ]
          stack = []
        frame_type = 6 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 3
          locals = [ class ext/mods/gameserver/model/actor/move/PlayerMove, class java/time/Instant, long, class ext/mods/gameserver/enums/actors/MoveType, int, int, int, int, int, double, double, double, double, double, int, int, int, int, double, int, class ext/mods/gameserver/model/zone/type/WaterZone ]
          stack = [ class ext/mods/gameserver/model/zone/type/WaterZone ]
        frame_type = 250 /* chop */
          offset_delta = 1
        frame_type = 20 /* same */
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 28
          locals = [ int ]
        frame_type = 71 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 248 /* chop */
          offset_delta = 9
        frame_type = 31 /* same */
        frame_type = 24 /* same */
        frame_type = 20 /* same */
        frame_type = 59 /* same */
        frame_type = 56 /* same */
        frame_type = 23 /* same */
        frame_type = 63 /* same */
        frame_type = 50 /* same */
        frame_type = 85 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 8 /* same */
        frame_type = 18 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 47 /* same */
        frame_type = 11 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
      LineNumberTable:
        line 253: 0
        line 254: 20
        line 257: 22
        line 258: 46
        line 261: 48
        line 263: 52
        line 264: 70
        line 265: 76
        line 268: 78
        line 270: 83
        line 271: 89
        line 273: 128
        line 275: 142
        line 276: 154
        line 277: 166
        line 279: 178
        line 280: 185
        line 283: 206
        line 284: 246
        line 285: 259
        line 288: 279
        line 289: 292
        line 290: 305
        line 292: 318
        line 293: 326
        line 295: 343
        line 292: 363
        line 298: 365
        line 300: 409
        line 301: 417
        line 302: 422
        line 303: 442
        line 304: 473
        line 308: 480
        line 309: 483
        line 310: 486
        line 312: 489
        line 313: 497
        line 315: 504
        line 316: 518
        line 317: 532
        line 319: 546
        line 319: 553
        line 320: 556
        line 320: 563
        line 322: 566
        line 323: 569
        line 324: 582
        line 325: 602
        line 326: 613
        line 327: 636
        line 328: 650
        line 330: 656
        line 332: 663
        line 325: 664
        line 325: 667
        line 335: 669
        line 336: 697
        line 336: 697
        line 337: 698
        line 338: 703
        line 340: 724
        line 340: 731
        line 342: 732
        line 336: 737
        line 345: 742
        line 346: 751
        line 347: 760
        line 347: 772
        line 350: 774
        line 351: 787
        line 352: 792
        line 353: 797
        line 356: 799
        line 357: 820
        line 358: 847
        line 359: 868
        line 360: 873
        line 361: 878
        line 363: 880
        line 364: 925
        line 365: 930
        line 366: 935
        line 369: 937
        line 370: 944
        line 373: 961
        line 375: 977
        line 376: 984
        line 378: 999
        line 389: 1025
        line 391: 1036
        line 392: 1043
        line 393: 1051
        line 395: 1076
        line 392: 1098
        line 397: 1100
        line 398: 1105
        line 402: 1107
        line 402: 1127
        line 403: 1142
        line 404: 1173
        line 407: 1175
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          442      38    21 waterZone   Lext/mods/gameserver/model/zone/type/WaterZone;
          613      51    29 $i$a$-let-PlayerMove$updatePosition$1   I
          636      28    30 waterZDiff   I
          610      54    28    it   Lext/mods/gameserver/model/zone/type/WaterZone;
          602      67    27 waterZone   Lext/mods/gameserver/model/zone/type/WaterZone;
          504     235    24 fraction   D
          569     170    26 isNearGroundUnderWater   Z
          697      42    27 shouldCheckForGround   Z
          847      33    24 raycasted   Lext/mods/gameserver/model/location/Location;
          999      26    24 heading   Ljava/lang/String;
         1100       7    24 inRange   Z
           52    1137     1 instant   Ljava/time/Instant;
           70    1119     2 timePassed   J
           89    1100     4  type   Lext/mods/gameserver/enums/actors/MoveType;
          128    1061     5 canBypassZCheck   Z
          154    1035     6  curX   I
          166    1023     7  curY   I
          178    1011     8  curZ   I
          246     943     9 isTargetInWater   Z
          292     897    10    dx   D
          305     884    12    dy   D
          318     871    14    dz   D
          365     824    16 leftDistance   D
          409     780    18 passedDistance   D
          412     777    20  maxZ   I
          483     706    21 nextX   I
          486     703    22 nextY   I
          489     700    23 nextZ   I
            0    1189     0  this   Lext/mods/gameserver/model/actor/move/PlayerMove;

  public final boolean maybeMoveToPawn(ext.mods.gameserver.model.WorldObject, int, boolean);
    descriptor: (Lext/mods/gameserver/model/WorldObject;IZ)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=6, locals=6, args_size=4
         0: iload_2
         1: iflt          15
         4: aload_0
         5: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         8: aload_1
         9: invokestatic  #645                // Method kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        12: ifeq          17
        15: iconst_0
        16: ireturn
        17: aload_1
        18: instanceof    #10                 // class ext/mods/gameserver/model/actor/Creature
        21: ifeq          34
        24: aload_1
        25: checkcast     #10                 // class ext/mods/gameserver/model/actor/Creature
        28: invokevirtual #649                // Method ext/mods/gameserver/model/actor/Creature.getCollisionRadius:()D
        31: goto          35
        34: dconst_0
        35: dstore        4
        37: aload_0
        38: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        41: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
        44: aload_1
        45: iload_2
        46: i2d
        47: aload_0
        48: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        51: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
        54: invokevirtual #650                // Method ext/mods/gameserver/model/actor/Player.getCollisionRadius:()D
        57: dadd
        58: dload         4
        60: dadd
        61: d2i
        62: invokevirtual #488                // Method ext/mods/gameserver/model/actor/Player.isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
        65: ifeq          70
        68: iconst_0
        69: ireturn
        70: aload_0
        71: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        74: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
        77: invokevirtual #653                // Method ext/mods/gameserver/model/actor/Player.isMovementDisabled:()Z
        80: ifne          103
        83: iload_3
        84: ifne          103
        87: aload_0
        88: aload_1
        89: putfield      #119                // Field _pawn:Lext/mods/gameserver/model/WorldObject;
        92: aload_0
        93: iload_2
        94: putfield      #122                // Field _offset:I
        97: aload_0
        98: aload_1
        99: iload_2
       100: invokespecial #655                // Method moveToPawn:(Lext/mods/gameserver/model/WorldObject;I)V
       103: iconst_1
       104: ireturn
      StackMapTable: number_of_entries = 6
        frame_type = 15 /* same */
        frame_type = 1 /* same */
        frame_type = 16 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ double ]
        frame_type = 252 /* append */
          offset_delta = 34
          locals = [ double ]
        frame_type = 32 /* same */
      LineNumberTable:
        line 490: 0
        line 491: 15
        line 494: 17
        line 495: 37
        line 496: 68
        line 499: 70
        line 500: 87
        line 501: 92
        line 502: 97
        line 505: 103
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           37      68     4 targetRadius   D
            0     105     0  this   Lext/mods/gameserver/model/actor/move/PlayerMove;
            0     105     1 target   Lext/mods/gameserver/model/WorldObject;
            0     105     2 offset   I
            0     105     3 isShiftPressed   Z
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #8()
          org.jetbrains.annotations.NotNull
      parameter 1:
      parameter 2:

  protected void offensiveFollowTask(ext.mods.gameserver.model.actor.Creature, int);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;I)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=4, locals=6, args_size=3
         0: aload_0
         1: getfield      #663                // Field _followTask:Ljava/util/concurrent/ScheduledFuture;
         4: ifnonnull     8
         7: return
         8: aload_0
         9: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        12: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
        15: aload_1
        16: checkcast     #82                 // class ext/mods/gameserver/model/WorldObject
        19: invokevirtual #350                // Method ext/mods/gameserver/model/actor/Player.knows:(Lext/mods/gameserver/model/WorldObject;)Z
        22: ifne          39
        25: aload_0
        26: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        29: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
        32: invokevirtual #667                // Method ext/mods/gameserver/model/actor/Player.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
        35: invokevirtual #672                // Method ext/mods/gameserver/model/actor/ai/type/PlayerAI.tryToIdle:()V
        38: return
        39: iload_2
        40: i2d
        41: aload_0
        42: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        45: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
        48: invokevirtual #650                // Method ext/mods/gameserver/model/actor/Player.getCollisionRadius:()D
        51: dadd
        52: aload_1
        53: invokevirtual #649                // Method ext/mods/gameserver/model/actor/Creature.getCollisionRadius:()D
        56: dadd
        57: d2i
        58: istore_3
        59: aload_0
        60: invokevirtual #366                // Method getMoveType:()Lext/mods/gameserver/enums/actors/MoveType;
        63: getstatic     #405                // Field ext/mods/gameserver/enums/actors/MoveType.GROUND:Lext/mods/gameserver/enums/actors/MoveType;
        66: if_acmpne     87
        69: aload_0
        70: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        73: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
        76: aload_1
        77: checkcast     #82                 // class ext/mods/gameserver/model/WorldObject
        80: iload_3
        81: invokevirtual #485                // Method ext/mods/gameserver/model/actor/Player.isIn2DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
        84: goto          102
        87: aload_0
        88: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        91: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
        94: aload_1
        95: checkcast     #82                 // class ext/mods/gameserver/model/WorldObject
        98: iload_3
        99: invokevirtual #488                // Method ext/mods/gameserver/model/actor/Player.isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
       102: ifeq          106
       105: return
       106: getstatic     #308                // Field ext/mods/gameserver/geoengine/GeoEngine.Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
       109: invokevirtual #313                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
       112: aload_0
       113: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       116: checkcast     #82                 // class ext/mods/gameserver/model/WorldObject
       119: aload_1
       120: checkcast     #82                 // class ext/mods/gameserver/model/WorldObject
       123: invokevirtual #675                // Method ext/mods/gameserver/geoengine/GeoEngine.getValidLocation:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Lext/mods/gameserver/model/location/Location;
       126: astore        4
       128: aload_1
       129: aload         4
       131: iload_2
       132: invokevirtual #679                // Method ext/mods/gameserver/model/actor/Creature.isInStrictRadius:(Lext/mods/gameserver/model/location/Location;I)Z
       135: istore        5
       137: iload         5
       139: ifeq          167
       142: aload_0
       143: aload_1
       144: checkcast     #82                 // class ext/mods/gameserver/model/WorldObject
       147: putfield      #119                // Field _pawn:Lext/mods/gameserver/model/WorldObject;
       150: aload_0
       151: iload_2
       152: putfield      #122                // Field _offset:I
       155: aload_0
       156: aload_1
       157: checkcast     #82                 // class ext/mods/gameserver/model/WorldObject
       160: iload_2
       161: invokespecial #655                // Method moveToPawn:(Lext/mods/gameserver/model/WorldObject;I)V
       164: goto          191
       167: aload_0
       168: aconst_null
       169: putfield      #119                // Field _pawn:Lext/mods/gameserver/model/WorldObject;
       172: aload_0
       173: iconst_0
       174: putfield      #122                // Field _offset:I
       177: aload_0
       178: aload         4
       180: getstatic     #140                // Field ext/mods/Config.SISTEMA_PATHFINDING:Z
       183: invokevirtual #681                // Method moveToLocation:(Lext/mods/gameserver/model/location/Location;Z)V
       186: aload_0
       187: iconst_1
       188: invokevirtual #181                // Method syncPlayerLocation:(Z)V
       191: return
      StackMapTable: number_of_entries = 7
        frame_type = 8 /* same */
        frame_type = 30 /* same */
        frame_type = 252 /* append */
          offset_delta = 47
          locals = [ int ]
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 3 /* same */
        frame_type = 253 /* append */
          offset_delta = 60
          locals = [ class ext/mods/gameserver/model/location/Location, int ]
        frame_type = 23 /* same */
      LineNumberTable:
        line 509: 0
        line 510: 7
        line 513: 8
        line 514: 25
        line 515: 38
        line 518: 39
        line 519: 59
        line 520: 105
        line 523: 106
        line 524: 128
        line 525: 137
        line 526: 142
        line 527: 150
        line 528: 155
        line 530: 167
        line 531: 172
        line 532: 177
        line 533: 186
        line 535: 191
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           59     133     3 realOffset   I
          128      64     4 moveOk   Lext/mods/gameserver/model/location/Location;
          137      55     5 isPathClear   Z
            0     192     0  this   Lext/mods/gameserver/model/actor/move/PlayerMove;
            0     192     1 target   Lext/mods/gameserver/model/actor/Creature;
            0     192     2 offset   I
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #8()
          org.jetbrains.annotations.NotNull
      parameter 1:

  protected void friendlyFollowTask(ext.mods.gameserver.model.actor.Creature, int);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;I)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=6, locals=4, args_size=3
         0: getstatic     #688                // Field ext/mods/Config.NEW_FOLLOW:Z
         3: ifne          124
         6: aload_0
         7: getfield      #663                // Field _followTask:Ljava/util/concurrent/ScheduledFuture;
        10: ifnonnull     14
        13: return
        14: aload_0
        15: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        18: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
        21: aload_1
        22: checkcast     #82                 // class ext/mods/gameserver/model/WorldObject
        25: invokevirtual #350                // Method ext/mods/gameserver/model/actor/Player.knows:(Lext/mods/gameserver/model/WorldObject;)Z
        28: ifne          45
        31: aload_0
        32: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        35: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
        38: invokevirtual #667                // Method ext/mods/gameserver/model/actor/Player.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
        41: invokevirtual #672                // Method ext/mods/gameserver/model/actor/ai/type/PlayerAI.tryToIdle:()V
        44: return
        45: aload_0
        46: invokevirtual #366                // Method getMoveType:()Lext/mods/gameserver/enums/actors/MoveType;
        49: getstatic     #405                // Field ext/mods/gameserver/enums/actors/MoveType.GROUND:Lext/mods/gameserver/enums/actors/MoveType;
        52: if_acmpne     73
        55: aload_0
        56: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        59: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
        62: aload_1
        63: checkcast     #82                 // class ext/mods/gameserver/model/WorldObject
        66: iload_2
        67: invokevirtual #485                // Method ext/mods/gameserver/model/actor/Player.isIn2DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
        70: goto          88
        73: aload_0
        74: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        77: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
        80: aload_1
        81: checkcast     #82                 // class ext/mods/gameserver/model/WorldObject
        84: iload_2
        85: invokevirtual #488                // Method ext/mods/gameserver/model/actor/Player.isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
        88: ifeq          92
        91: return
        92: aload_0
        93: getfield      #126                // Field _task:Ljava/util/concurrent/ScheduledFuture;
        96: ifnonnull     287
        99: aload_0
       100: aload_1
       101: checkcast     #82                 // class ext/mods/gameserver/model/WorldObject
       104: putfield      #119                // Field _pawn:Lext/mods/gameserver/model/WorldObject;
       107: aload_0
       108: iload_2
       109: putfield      #122                // Field _offset:I
       112: aload_0
       113: aload_1
       114: checkcast     #82                 // class ext/mods/gameserver/model/WorldObject
       117: iload_2
       118: invokespecial #655                // Method moveToPawn:(Lext/mods/gameserver/model/WorldObject;I)V
       121: goto          287
       124: aload_0
       125: getfield      #663                // Field _followTask:Ljava/util/concurrent/ScheduledFuture;
       128: ifnull        144
       131: aload_0
       132: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       135: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
       138: invokevirtual #653                // Method ext/mods/gameserver/model/actor/Player.isMovementDisabled:()Z
       141: ifeq          145
       144: return
       145: aload_0
       146: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       149: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
       152: aload_1
       153: checkcast     #82                 // class ext/mods/gameserver/model/WorldObject
       156: invokevirtual #350                // Method ext/mods/gameserver/model/actor/Player.knows:(Lext/mods/gameserver/model/WorldObject;)Z
       159: ifne          176
       162: aload_0
       163: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       166: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
       169: invokevirtual #667                // Method ext/mods/gameserver/model/actor/Player.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
       172: invokevirtual #672                // Method ext/mods/gameserver/model/actor/ai/type/PlayerAI.tryToIdle:()V
       175: return
       176: aload_0
       177: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       180: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
       183: invokevirtual #158                // Method ext/mods/gameserver/model/actor/Player.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
       186: invokevirtual #256                // Method ext/mods/gameserver/model/location/SpawnLocation.clone:()Lext/mods/gameserver/model/location/SpawnLocation;
       189: astore_3
       190: aload_3
       191: aload_1
       192: invokevirtual #689                // Method ext/mods/gameserver/model/actor/Creature.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
       195: checkcast     #150                // class ext/mods/gameserver/model/location/Location
       198: iload_2
       199: i2d
       200: aload_1
       201: invokevirtual #649                // Method ext/mods/gameserver/model/actor/Creature.getCollisionRadius:()D
       204: dadd
       205: aload_0
       206: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       209: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
       212: invokevirtual #650                // Method ext/mods/gameserver/model/actor/Player.getCollisionRadius:()D
       215: dadd
       216: invokevirtual #693                // Method ext/mods/gameserver/model/location/SpawnLocation.setLocationMinusOffset:(Lext/mods/gameserver/model/location/Location;D)V
       219: aload_0
       220: invokevirtual #366                // Method getMoveType:()Lext/mods/gameserver/enums/actors/MoveType;
       223: getstatic     #405                // Field ext/mods/gameserver/enums/actors/MoveType.GROUND:Lext/mods/gameserver/enums/actors/MoveType;
       226: if_acmpne     247
       229: aload_0
       230: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       233: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
       236: aload_3
       237: checkcast     #150                // class ext/mods/gameserver/model/location/Location
       240: iload_2
       241: invokevirtual #695                // Method ext/mods/gameserver/model/actor/Player.isIn2DRadius:(Lext/mods/gameserver/model/location/Location;I)Z
       244: goto          262
       247: aload_0
       248: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       251: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
       254: aload_3
       255: checkcast     #150                // class ext/mods/gameserver/model/location/Location
       258: iload_2
       259: invokevirtual #697                // Method ext/mods/gameserver/model/actor/Player.isIn3DRadius:(Lext/mods/gameserver/model/location/Location;I)Z
       262: ifeq          266
       265: return
       266: aload_0
       267: aconst_null
       268: putfield      #119                // Field _pawn:Lext/mods/gameserver/model/WorldObject;
       271: aload_0
       272: iconst_0
       273: putfield      #122                // Field _offset:I
       276: aload_0
       277: aload_3
       278: checkcast     #150                // class ext/mods/gameserver/model/location/Location
       281: getstatic     #140                // Field ext/mods/Config.SISTEMA_PATHFINDING:Z
       284: invokevirtual #681                // Method moveToLocation:(Lext/mods/gameserver/model/location/Location;Z)V
       287: return
      StackMapTable: number_of_entries = 13
        frame_type = 14 /* same */
        frame_type = 30 /* same */
        frame_type = 27 /* same */
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 3 /* same */
        frame_type = 31 /* same */
        frame_type = 19 /* same */
        frame_type = 0 /* same */
        frame_type = 30 /* same */
        frame_type = 252 /* append */
          offset_delta = 70
          locals = [ class ext/mods/gameserver/model/location/SpawnLocation ]
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 3 /* same */
        frame_type = 250 /* chop */
          offset_delta = 20
      LineNumberTable:
        line 538: 0
        line 539: 6
        line 540: 13
        line 543: 14
        line 544: 31
        line 545: 44
        line 548: 45
        line 549: 91
        line 552: 92
        line 553: 99
        line 554: 107
        line 555: 112
        line 558: 124
        line 559: 144
        line 562: 145
        line 563: 162
        line 564: 175
        line 567: 176
        line 568: 190
        line 570: 219
        line 571: 265
        line 574: 266
        line 575: 271
        line 576: 276
        line 578: 287
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          190      97     3 targetLoc   Lext/mods/gameserver/model/location/SpawnLocation;
            0     288     0  this   Lext/mods/gameserver/model/actor/move/PlayerMove;
            0     288     1 target   Lext/mods/gameserver/model/actor/Creature;
            0     288     2 offset   I
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #8()
          org.jetbrains.annotations.NotNull
      parameter 1:

  public ext.mods.gameserver.model.location.Location calculatePath(int, int, int, int, int, int);
    descriptor: (IIIIII)Lext/mods/gameserver/model/location/Location;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=13, locals=12, args_size=7
         0: getstatic     #140                // Field ext/mods/Config.SISTEMA_PATHFINDING:Z
         3: ifne          8
         6: aconst_null
         7: areturn
         8: getstatic     #702                // Field ext/mods/Config.ATTACK_USE_PATHFINDER:Z
        11: ifeq          38
        14: aload_0
        15: getfield      #119                // Field _pawn:Lext/mods/gameserver/model/WorldObject;
        18: instanceof    #10                 // class ext/mods/gameserver/model/actor/Creature
        21: ifeq          38
        24: aload_0
        25: iload_1
        26: iload_2
        27: iload_3
        28: iload         4
        30: iload         5
        32: iload         6
        34: invokespecial #704                // Method calculatePathForAttack:(IIIIII)Lext/mods/gameserver/model/location/Location;
        37: areturn
        38: aload_0
        39: invokevirtual #366                // Method getMoveType:()Lext/mods/gameserver/enums/actors/MoveType;
        42: astore        7
        44: invokestatic  #396                // Method ext/mods/gameserver/data/manager/ZoneManager.getInstance:()Lext/mods/gameserver/data/manager/ZoneManager;
        47: iload         4
        49: iload         5
        51: iload         6
        53: ldc_w         #398                // class ext/mods/gameserver/model/zone/type/WaterZone
        56: invokevirtual #402                // Method ext/mods/gameserver/data/manager/ZoneManager.getZone:(IIILjava/lang/Class;)Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
        59: ifnonnull     70
        62: aload         7
        64: getstatic     #385                // Field ext/mods/gameserver/enums/actors/MoveType.SWIM:Lext/mods/gameserver/enums/actors/MoveType;
        67: if_acmpne     74
        70: iconst_1
        71: goto          75
        74: iconst_0
        75: istore        8
        77: iload         8
        79: ifeq          121
        82: getstatic     #308                // Field ext/mods/gameserver/geoengine/GeoEngine.Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
        85: invokevirtual #313                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
        88: iload_1
        89: iload_2
        90: iload_3
        91: dconst_0
        92: iload         4
        94: iload         5
        96: iload         6
        98: dconst_0
        99: aconst_null
       100: aconst_null
       101: invokevirtual #708                // Method ext/mods/gameserver/geoengine/GeoEngine.canSee:(IIIDIIIDLext/mods/gameserver/geoengine/geodata/IGeoObject;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
       104: ifeq          121
       107: new           #150                // class ext/mods/gameserver/model/location/Location
       110: dup
       111: iload         4
       113: iload         5
       115: iload         6
       117: invokespecial #710                // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       120: areturn
       121: aload         7
       123: getstatic     #382                // Field ext/mods/gameserver/enums/actors/MoveType.FLY:Lext/mods/gameserver/enums/actors/MoveType;
       126: if_acmpne     155
       129: getstatic     #308                // Field ext/mods/gameserver/geoengine/GeoEngine.Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
       132: invokevirtual #313                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
       135: iload_1
       136: iload_2
       137: iload_3
       138: ldc2_w        #711                // double 32.0d
       141: iload         4
       143: iload         5
       145: iload         6
       147: invokevirtual #716                // Method ext/mods/gameserver/geoengine/GeoEngine.canFlyToTarget:(IIIDIII)Z
       150: ifeq          155
       153: aconst_null
       154: areturn
       155: getstatic     #308                // Field ext/mods/gameserver/geoengine/GeoEngine.Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
       158: invokevirtual #313                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
       161: iload_1
       162: iload_2
       163: iload_3
       164: iload         4
       166: iload         5
       168: iload         6
       170: invokevirtual #459                // Method ext/mods/gameserver/geoengine/GeoEngine.canMoveToTarget:(IIIIII)Z
       173: ifeq          178
       176: aconst_null
       177: areturn
       178: aload_0
       179: getfield      #536                // Field _isDebugPath:Z
       182: ifeq          195
       185: new           #538                // class ext/mods/gameserver/network/serverpackets/ExServerPrimitive
       188: dup
       189: invokespecial #539                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive."<init>":()V
       192: goto          196
       195: aconst_null
       196: astore        9
       198: aload         7
       200: getstatic     #405                // Field ext/mods/gameserver/enums/actors/MoveType.GROUND:Lext/mods/gameserver/enums/actors/MoveType;
       203: if_acmpeq     214
       206: aload         7
       208: getstatic     #385                // Field ext/mods/gameserver/enums/actors/MoveType.SWIM:Lext/mods/gameserver/enums/actors/MoveType;
       211: if_acmpne     227
       214: aload_0
       215: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       218: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
       221: invokevirtual #462                // Method ext/mods/gameserver/model/actor/Player.temporaryFixPagan:()Z
       224: ifeq          251
       227: getstatic     #308                // Field ext/mods/gameserver/geoengine/GeoEngine.Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
       230: invokevirtual #313                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
       233: iload_1
       234: iload_2
       235: iload_3
       236: ldc2_w        #711                // double 32.0d
       239: iload         4
       241: iload         5
       243: iload         6
       245: aload         9
       247: invokevirtual #720                // Method ext/mods/gameserver/geoengine/GeoEngine.getValidFlyLocation:(IIIDIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Lext/mods/gameserver/model/location/Location;
       250: areturn
       251: getstatic     #308                // Field ext/mods/gameserver/geoengine/GeoEngine.Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
       254: invokevirtual #313                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
       257: iload_1
       258: iload_2
       259: iload_3
       260: iload         4
       262: iload         5
       264: iload         6
       266: iconst_1
       267: iload         8
       269: ifeq          277
       272: bipush        32
       274: goto          280
       277: sipush        500
       280: aload         9
       282: invokevirtual #723                // Method ext/mods/gameserver/geoengine/GeoEngine.findPath:(IIIIIIZILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
       285: astore        10
       287: aload         10
       289: invokeinterface #593,  1          // InterfaceMethod java/util/List.isEmpty:()Z
       294: ifne          308
       297: aload         10
       299: invokeinterface #726,  1          // InterfaceMethod java/util/List.size:()I
       304: iconst_2
       305: if_icmpge     376
       308: nop
       309: iload         8
       311: ifeq          330
       314: new           #150                // class ext/mods/gameserver/model/location/Location
       317: dup
       318: iload         4
       320: iload         5
       322: iload         6
       324: invokespecial #710                // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       327: goto          375
       330: getstatic     #308                // Field ext/mods/gameserver/geoengine/GeoEngine.Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
       333: invokevirtual #313                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
       336: iload_1
       337: iload_2
       338: iload_3
       339: iload         4
       341: iload         5
       343: iload         6
       345: aconst_null
       346: invokevirtual #597                // Method ext/mods/gameserver/geoengine/GeoEngine.getValidLocation:(IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Lext/mods/gameserver/model/location/Location;
       349: astore        11
       351: aload         11
       353: invokevirtual #260                // Method ext/mods/gameserver/model/location/Location.getX:()I
       356: iload_1
       357: if_icmpne     373
       360: aload         11
       362: invokevirtual #261                // Method ext/mods/gameserver/model/location/Location.getY:()I
       365: iload_2
       366: if_icmpne     373
       369: aconst_null
       370: goto          375
       373: aload         11
       375: areturn
       376: aload_0
       377: getfield      #536                // Field _isDebugPath:Z
       380: ifeq          406
       383: aload         9
       385: ifnull        406
       388: aload_0
       389: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       392: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
       395: aload_0
       396: aload         9
       398: invokedynamic #731,  0            // InvokeDynamic #5:accept:(Lext/mods/gameserver/model/actor/move/PlayerMove;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/function/Consumer;
       403: invokevirtual #216                // Method ext/mods/gameserver/model/actor/Player.forEachKnownGM:(Ljava/util/function/Consumer;)V
       406: aload_0
       407: getfield      #185                // Field _geoPath:Ljava/util/ArrayDeque;
       410: aload         10
       412: checkcast     #319                // class java/util/Collection
       415: invokevirtual #604                // Method java/util/ArrayDeque.addAll:(Ljava/util/Collection;)Z
       418: pop
       419: aload_0
       420: getfield      #185                // Field _geoPath:Ljava/util/ArrayDeque;
       423: invokevirtual #607                // Method java/util/ArrayDeque.poll:()Ljava/lang/Object;
       426: checkcast     #150                // class ext/mods/gameserver/model/location/Location
       429: areturn
      StackMapTable: number_of_entries = 21
        frame_type = 8 /* same */
        frame_type = 29 /* same */
        frame_type = 252 /* append */
          offset_delta = 31
          locals = [ class ext/mods/gameserver/enums/actors/MoveType ]
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 45
          locals = [ int ]
        frame_type = 33 /* same */
        frame_type = 22 /* same */
        frame_type = 16 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/network/serverpackets/ExServerPrimitive ]
        frame_type = 252 /* append */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/network/serverpackets/ExServerPrimitive ]
        frame_type = 12 /* same */
        frame_type = 23 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 25
          locals = [ class ext/mods/gameserver/model/actor/move/PlayerMove, int, int, int, int, int, int, class ext/mods/gameserver/enums/actors/MoveType, int, class ext/mods/gameserver/network/serverpackets/ExServerPrimitive ]
          stack = [ class ext/mods/gameserver/geoengine/GeoEngine, int, int, int, int, int, int, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/actor/move/PlayerMove, int, int, int, int, int, int, class ext/mods/gameserver/enums/actors/MoveType, int, class ext/mods/gameserver/network/serverpackets/ExServerPrimitive ]
          stack = [ class ext/mods/gameserver/geoengine/GeoEngine, int, int, int, int, int, int, int, int ]
        frame_type = 252 /* append */
          offset_delta = 27
          locals = [ class java/util/List ]
        frame_type = 21 /* same */
        frame_type = 252 /* append */
          offset_delta = 42
          locals = [ class ext/mods/gameserver/model/location/Location ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/model/actor/move/PlayerMove, int, int, int, int, int, int, class ext/mods/gameserver/enums/actors/MoveType, int, class ext/mods/gameserver/network/serverpackets/ExServerPrimitive, class java/util/List ]
          stack = [ class ext/mods/gameserver/model/location/Location ]
        frame_type = 0 /* same */
        frame_type = 29 /* same */
      LineNumberTable:
        line 581: 0
        line 582: 6
        line 585: 8
        line 586: 24
        line 589: 38
        line 591: 44
        line 593: 77
        line 594: 107
        line 595: 121
        line 596: 153
        line 599: 155
        line 600: 176
        line 603: 178
        line 605: 198
        line 606: 227
        line 609: 251
        line 611: 287
        line 612: 308
        line 613: 309
        line 615: 330
        line 616: 351
        line 612: 375
        line 621: 376
        line 622: 388
        line 630: 406
        line 631: 419
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          351      24    11 valid   Lext/mods/gameserver/model/location/Location;
           44     386     7 moveType   Lext/mods/gameserver/enums/actors/MoveType;
           77     353     8 isWaterRelated   Z
          198     232     9 dummy   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
          287     143    10  path   Ljava/util/List;
            0     430     0  this   Lext/mods/gameserver/model/actor/move/PlayerMove;
            0     430     1    ox   I
            0     430     2    oy   I
            0     430     3    oz   I
            0     430     4    tx   I
            0     430     5    ty   I
            0     430     6    tz   I
    RuntimeInvisibleAnnotations:
      0: #699()
        org.jetbrains.annotations.Nullable

  public final boolean maybePlayerMoveToLocation(ext.mods.gameserver.model.location.Location, int, boolean, boolean);
    descriptor: (Lext/mods/gameserver/model/location/Location;IZZ)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=9, locals=12, args_size=5
         0: aload_0
         1: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
         7: aload_1
         8: iload_2
         9: invokevirtual #697                // Method ext/mods/gameserver/model/actor/Player.isIn3DRadius:(Lext/mods/gameserver/model/location/Location;I)Z
        12: ifeq          17
        15: iconst_0
        16: ireturn
        17: aload_0
        18: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        21: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
        24: invokevirtual #653                // Method ext/mods/gameserver/model/actor/Player.isMovementDisabled:()Z
        27: ifne          35
        30: iload         4
        32: ifeq          37
        35: iconst_1
        36: ireturn
        37: aload_0
        38: aconst_null
        39: putfield      #119                // Field _pawn:Lext/mods/gameserver/model/WorldObject;
        42: aload_0
        43: iconst_0
        44: putfield      #122                // Field _offset:I
        47: aload_0
        48: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        51: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
        54: invokevirtual #158                // Method ext/mods/gameserver/model/actor/Player.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
        57: astore        5
        59: aload         5
        61: aload_1
        62: checkcast     #737                // class ext/mods/gameserver/model/location/Point2D
        65: invokevirtual #740                // Method ext/mods/gameserver/model/location/SpawnLocation.distance2D:(Lext/mods/gameserver/model/location/Point2D;)D
        68: dstore        6
        70: nop
        71: getstatic     #140                // Field ext/mods/Config.SISTEMA_PATHFINDING:Z
        74: ifeq          163
        77: dload         6
        79: ldc2_w        #741                // double 20.0d
        82: dcmpl
        83: ifle          163
        86: getstatic     #745                // Field ext/mods/Config.ENABLE_REAL_TIME_OBSTACLE_AVOIDANCE:Z
        89: ifeq          107
        92: invokestatic  #750                // Method ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance.getInstance:()Lext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance;
        95: aload         5
        97: checkcast     #150                // class ext/mods/gameserver/model/location/Location
       100: aload_1
       101: invokevirtual #754                // Method ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance.shouldAvoidObstacle:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Z
       104: goto          164
       107: aload_0
       108: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       111: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
       114: invokevirtual #130                // Method ext/mods/gameserver/model/actor/Player.getX:()I
       117: aload_0
       118: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       121: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
       124: invokevirtual #131                // Method ext/mods/gameserver/model/actor/Player.getY:()I
       127: aload_0
       128: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       131: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
       134: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Player.getZ:()I
       137: aload_1
       138: invokevirtual #260                // Method ext/mods/gameserver/model/location/Location.getX:()I
       141: aload_1
       142: invokevirtual #261                // Method ext/mods/gameserver/model/location/Location.getY:()I
       145: aload_1
       146: invokevirtual #262                // Method ext/mods/gameserver/model/location/Location.getZ:()I
       149: invokestatic  #757                // Method ext/mods/gameserver/model/actor/move/MovementIntegration.canMoveToTarget:(IIIIII)Z
       152: ifne          159
       155: iconst_1
       156: goto          164
       159: iconst_0
       160: goto          164
       163: iconst_0
       164: istore        8
       166: aload_1
       167: astore        9
       169: iload         8
       171: ifeq          374
       174: iload_3
       175: ifeq          374
       178: getstatic     #140                // Field ext/mods/Config.SISTEMA_PATHFINDING:Z
       181: ifeq          374
       184: getstatic     #308                // Field ext/mods/gameserver/geoengine/GeoEngine.Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
       187: invokevirtual #313                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
       190: aload_0
       191: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       194: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
       197: invokevirtual #130                // Method ext/mods/gameserver/model/actor/Player.getX:()I
       200: aload_0
       201: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       204: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
       207: invokevirtual #131                // Method ext/mods/gameserver/model/actor/Player.getY:()I
       210: aload_0
       211: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       214: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
       217: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Player.getZ:()I
       220: aload_1
       221: invokevirtual #260                // Method ext/mods/gameserver/model/location/Location.getX:()I
       224: aload_1
       225: invokevirtual #261                // Method ext/mods/gameserver/model/location/Location.getY:()I
       228: aload_1
       229: invokevirtual #262                // Method ext/mods/gameserver/model/location/Location.getZ:()I
       232: iconst_1
       233: aconst_null
       234: invokevirtual #317                // Method ext/mods/gameserver/geoengine/GeoEngine.findPath:(IIIIIIZLext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
       237: astore        10
       239: aload         10
       241: checkcast     #319                // class java/util/Collection
       244: invokeinterface #322,  1          // InterfaceMethod java/util/Collection.isEmpty:()Z
       249: ifne          256
       252: iconst_1
       253: goto          257
       256: iconst_0
       257: ifeq          320
       260: getstatic     #760                // Field ext/mods/Config.ENABLE_SMOOTH_OBSTACLE_AVOIDANCE:Z
       263: ifeq          304
       266: invokestatic  #750                // Method ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance.getInstance:()Lext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance;
       269: aload         10
       271: aconst_null
       272: invokevirtual #764                // Method ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance.createSmoothPath:(Ljava/util/List;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
       275: astore        11
       277: aload         11
       279: invokestatic  #770                // Method kotlin/collections/CollectionsKt.firstOrNull:(Ljava/util/List;)Ljava/lang/Object;
       282: checkcast     #150                // class ext/mods/gameserver/model/location/Location
       285: dup
       286: ifnonnull     315
       289: pop
       290: aload         10
       292: iconst_0
       293: invokeinterface #328,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
       298: checkcast     #150                // class ext/mods/gameserver/model/location/Location
       301: goto          315
       304: aload         10
       306: iconst_0
       307: invokeinterface #328,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
       312: checkcast     #150                // class ext/mods/gameserver/model/location/Location
       315: astore        9
       317: goto          374
       320: getstatic     #308                // Field ext/mods/gameserver/geoengine/GeoEngine.Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
       323: invokevirtual #313                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
       326: aload_0
       327: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       330: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
       333: invokevirtual #130                // Method ext/mods/gameserver/model/actor/Player.getX:()I
       336: aload_0
       337: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       340: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
       343: invokevirtual #131                // Method ext/mods/gameserver/model/actor/Player.getY:()I
       346: aload_0
       347: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       350: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
       353: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Player.getZ:()I
       356: aload_1
       357: invokevirtual #260                // Method ext/mods/gameserver/model/location/Location.getX:()I
       360: aload_1
       361: invokevirtual #261                // Method ext/mods/gameserver/model/location/Location.getY:()I
       364: aload_1
       365: invokevirtual #262                // Method ext/mods/gameserver/model/location/Location.getZ:()I
       368: aconst_null
       369: invokevirtual #597                // Method ext/mods/gameserver/geoengine/GeoEngine.getValidLocation:(IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Lext/mods/gameserver/model/location/Location;
       372: astore        9
       374: aload_0
       375: aload         9
       377: iload_3
       378: invokevirtual #681                // Method moveToLocation:(Lext/mods/gameserver/model/location/Location;Z)V
       381: iconst_1
       382: ireturn
      StackMapTable: number_of_entries = 13
        frame_type = 17 /* same */
        frame_type = 17 /* same */
        frame_type = 1 /* same */
        frame_type = 253 /* append */
          offset_delta = 69
          locals = [ class ext/mods/gameserver/model/location/SpawnLocation, double ]
        frame_type = 51 /* same */
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 254 /* append */
          offset_delta = 91
          locals = [ int, class ext/mods/gameserver/model/location/Location, class java/util/List ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 46 /* same */
        frame_type = 74 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/location/Location ]
        frame_type = 4 /* same */
        frame_type = 250 /* chop */
          offset_delta = 53
      LineNumberTable:
        line 635: 0
        line 636: 15
        line 639: 17
        line 640: 35
        line 643: 37
        line 644: 42
        line 646: 47
        line 647: 59
        line 649: 70
        line 650: 71
        line 651: 86
        line 652: 92
        line 654: 107
        line 655: 107
        line 656: 137
        line 654: 149
        line 660: 163
        line 649: 164
        line 663: 166
        line 664: 169
        line 665: 184
        line 666: 190
        line 667: 220
        line 668: 232
        line 665: 234
        line 671: 239
        line 671: 257
        line 672: 260
        line 673: 266
        line 674: 277
        line 676: 304
        line 672: 315
        line 679: 320
        line 680: 326
        line 681: 356
        line 679: 369
        line 686: 374
        line 687: 381
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          277      24    11 smoothPath   Ljava/util/List;
          239     135    10  path   Ljava/util/List;
           59     324     5 currentPos   Lext/mods/gameserver/model/location/SpawnLocation;
           70     313     6 dist2D   D
          166     217     8 hasObstacle   Z
          169     214     9 finalDestination   Lext/mods/gameserver/model/location/Location;
            0     383     0  this   Lext/mods/gameserver/model/actor/move/PlayerMove;
            0     383     1 destination   Lext/mods/gameserver/model/location/Location;
            0     383     2 offset   I
            0     383     3 pathfinding   Z
            0     383     4 isShiftPressed   Z
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #8()
          org.jetbrains.annotations.NotNull
      parameter 1:
      parameter 2:
      parameter 3:

  public final void startPlayerOffensiveFollow(ext.mods.gameserver.model.actor.Creature, int);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;I)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=6, locals=4, args_size=3
         0: aload_0
         1: invokespecial #91                 // Method isMeleeDebug:()Z
         4: ifeq          55
         7: getstatic     #95                 // Field ext/mods/gameserver/model/actor/move/CreatureMove.LOGGER:Lext/mods/commons/logging/CLogger;
        10: ldc_w         #777                // String [MeleeDebug][PlayerMove][startPlayerOffensiveFollow] actor={} target={} offset={}
        13: iconst_3
        14: anewarray     #99                 // class java/lang/Object
        17: astore_3
        18: aload_3
        19: iconst_0
        20: aload_0
        21: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        24: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
        27: invokevirtual #102                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        30: invokestatic  #108                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        33: aastore
        34: aload_3
        35: iconst_1
        36: aload_1
        37: invokevirtual #778                // Method ext/mods/gameserver/model/actor/Creature.getObjectId:()I
        40: invokestatic  #108                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        43: aastore
        44: aload_3
        45: iconst_2
        46: iload_2
        47: invokestatic  #108                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        50: aastore
        51: aload_3
        52: invokevirtual #115                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
        55: aload_0
        56: invokevirtual #781                // Method cancelFollowTask:()V
        59: aload_0
        60: aload_0
        61: aload_1
        62: iload_2
        63: invokedynamic #791,  0            // InvokeDynamic #6:run:(Lext/mods/gameserver/model/actor/move/PlayerMove;Lext/mods/gameserver/model/actor/Creature;I)Ljava/lang/Runnable;
        68: ldc2_w        #792                // long 5l
        71: ldc2_w        #794                // long 500l
        74: invokestatic  #799                // Method ext/mods/commons/pool/CoroutinePool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
        77: putfield      #663                // Field _followTask:Ljava/util/concurrent/ScheduledFuture;
        80: return
      StackMapTable: number_of_entries = 1
        frame_type = 55 /* same */
      LineNumberTable:
        line 691: 0
        line 692: 7
        line 693: 13
        line 692: 52
        line 695: 55
        line 696: 59
        line 697: 80
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      81     0  this   Lext/mods/gameserver/model/actor/move/PlayerMove;
            0      81     1 target   Lext/mods/gameserver/model/actor/Creature;
            0      81     2 offset   I
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #8()
          org.jetbrains.annotations.NotNull
      parameter 1:

  public final boolean maybeStartPlayerOffensiveFollow(ext.mods.gameserver.model.actor.Creature, int);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;I)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=9, locals=32, args_size=3
         0: iload_2
         1: ifge          6
         4: iconst_0
         5: ireturn
         6: aload_0
         7: invokespecial #91                 // Method isMeleeDebug:()Z
        10: ifeq          81
        13: getstatic     #95                 // Field ext/mods/gameserver/model/actor/move/CreatureMove.LOGGER:Lext/mods/commons/logging/CLogger;
        16: ldc_w         #803                // String [MeleeDebug][PlayerMove][maybeStartPlayerOffensiveFollow] actor={} target={} range={} dist={}
        19: iconst_4
        20: anewarray     #99                 // class java/lang/Object
        23: astore_3
        24: aload_3
        25: iconst_0
        26: aload_0
        27: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        30: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
        33: invokevirtual #102                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        36: invokestatic  #108                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        39: aastore
        40: aload_3
        41: iconst_1
        42: aload_1
        43: invokevirtual #778                // Method ext/mods/gameserver/model/actor/Creature.getObjectId:()I
        46: invokestatic  #108                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        49: aastore
        50: aload_3
        51: iconst_2
        52: iload_2
        53: invokestatic  #108                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        56: aastore
        57: aload_3
        58: iconst_3
        59: aload_0
        60: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        63: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
        66: aload_1
        67: checkcast     #82                 // class ext/mods/gameserver/model/WorldObject
        70: invokevirtual #806                // Method ext/mods/gameserver/model/actor/Player.distance2D:(Lext/mods/gameserver/model/WorldObject;)D
        73: invokestatic  #634                // Method java/lang/Double.valueOf:(D)Ljava/lang/Double;
        76: aastore
        77: aload_3
        78: invokevirtual #115                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
        81: iload_2
        82: i2d
        83: aload_0
        84: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        87: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
        90: invokevirtual #650                // Method ext/mods/gameserver/model/actor/Player.getCollisionRadius:()D
        93: dadd
        94: aload_1
        95: invokevirtual #649                // Method ext/mods/gameserver/model/actor/Creature.getCollisionRadius:()D
        98: dadd
        99: d2i
       100: istore_3
       101: aload_0
       102: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       105: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
       108: aload_1
       109: checkcast     #82                 // class ext/mods/gameserver/model/WorldObject
       112: iload_3
       113: invokevirtual #485                // Method ext/mods/gameserver/model/actor/Player.isIn2DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
       116: ifne          123
       119: iconst_1
       120: goto          124
       123: iconst_0
       124: istore        4
       126: iload         4
       128: ifne          285
       131: aload_0
       132: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       135: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
       138: aload_1
       139: checkcast     #82                 // class ext/mods/gameserver/model/WorldObject
       142: invokevirtual #806                // Method ext/mods/gameserver/model/actor/Player.distance2D:(Lext/mods/gameserver/model/WorldObject;)D
       145: dstore        5
       147: getstatic     #140                // Field ext/mods/Config.SISTEMA_PATHFINDING:Z
       150: ifeq          283
       153: nop
       154: dload         5
       156: ldc2_w        #741                // double 20.0d
       159: dcmpl
       160: ifle          223
       163: getstatic     #745                // Field ext/mods/Config.ENABLE_REAL_TIME_OBSTACLE_AVOIDANCE:Z
       166: ifeq          198
       169: invokestatic  #750                // Method ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance.getInstance:()Lext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance;
       172: aload_0
       173: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       176: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
       179: invokevirtual #158                // Method ext/mods/gameserver/model/actor/Player.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
       182: checkcast     #150                // class ext/mods/gameserver/model/location/Location
       185: aload_1
       186: invokevirtual #689                // Method ext/mods/gameserver/model/actor/Creature.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
       189: checkcast     #150                // class ext/mods/gameserver/model/location/Location
       192: invokevirtual #754                // Method ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance.shouldAvoidObstacle:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Z
       195: goto          224
       198: aload_0
       199: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       202: checkcast     #82                 // class ext/mods/gameserver/model/WorldObject
       205: aload_1
       206: checkcast     #82                 // class ext/mods/gameserver/model/WorldObject
       209: invokestatic  #810                // Method ext/mods/gameserver/model/actor/move/MovementIntegration.canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
       212: ifne          219
       215: iconst_1
       216: goto          224
       219: iconst_0
       220: goto          224
       223: iconst_0
       224: istore        7
       226: nop
       227: iload         7
       229: ifeq          276
       232: aload_0
       233: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       236: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
       239: invokevirtual #653                // Method ext/mods/gameserver/model/actor/Player.isMovementDisabled:()Z
       242: ifne          276
       245: aload_0
       246: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       249: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
       252: invokevirtual #667                // Method ext/mods/gameserver/model/actor/Player.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
       255: invokevirtual #814                // Method ext/mods/gameserver/model/actor/ai/type/PlayerAI.getCurrentIntention:()Lext/mods/gameserver/model/actor/ai/Intention;
       258: invokevirtual #818                // Method ext/mods/gameserver/model/actor/ai/Intention.canMoveToTarget:()Z
       261: ifeq          276
       264: aload_0
       265: aload_1
       266: aload_1
       267: invokevirtual #649                // Method ext/mods/gameserver/model/actor/Creature.getCollisionRadius:()D
       270: d2i
       271: invokevirtual #820                // Method startPlayerOffensiveFollow:(Lext/mods/gameserver/model/actor/Creature;I)V
       274: iconst_1
       275: ireturn
       276: iload         7
       278: ifeq          283
       281: iconst_0
       282: ireturn
       283: iconst_0
       284: ireturn
       285: invokestatic  #825                // Method java/lang/System.currentTimeMillis:()J
       288: lstore        5
       290: lload         5
       292: aload_0
       293: getfield      #828                // Field _lastStuckCheckTime:J
       296: lsub
       297: ldc2_w        #829                // long 800l
       300: lcmp
       301: iflt          1097
       304: aload_0
       305: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       308: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
       311: invokevirtual #130                // Method ext/mods/gameserver/model/actor/Player.getX:()I
       314: istore        7
       316: aload_0
       317: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       320: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
       323: invokevirtual #131                // Method ext/mods/gameserver/model/actor/Player.getY:()I
       326: istore        8
       328: aload_0
       329: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       332: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
       335: aload_1
       336: checkcast     #82                 // class ext/mods/gameserver/model/WorldObject
       339: invokevirtual #806                // Method ext/mods/gameserver/model/actor/Player.distance2D:(Lext/mods/gameserver/model/WorldObject;)D
       342: dstore        9
       344: aload_0
       345: getfield      #28                 // Field _lastStuckX:I
       348: ldc           #24                 // int -2147483648
       350: if_icmpeq     404
       353: iload         7
       355: aload_0
       356: getfield      #28                 // Field _lastStuckX:I
       359: isub
       360: invokestatic  #833                // Method java/lang/Math.abs:(I)I
       363: bipush        10
       365: if_icmpge     404
       368: iload         8
       370: aload_0
       371: getfield      #31                 // Field _lastStuckY:I
       374: isub
       375: invokestatic  #833                // Method java/lang/Math.abs:(I)I
       378: bipush        10
       380: if_icmpge     404
       383: dload         9
       385: aload_0
       386: getfield      #37                 // Field _lastStuckDist:D
       389: dsub
       390: invokestatic  #835                // Method java/lang/Math.abs:(D)D
       393: ldc2_w        #836                // double 5.0d
       396: dcmpg
       397: ifge          404
       400: iconst_1
       401: goto          405
       404: iconst_0
       405: istore        11
       407: iload         11
       409: ifeq          429
       412: aload_0
       413: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       416: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
       419: invokevirtual #840                // Method ext/mods/gameserver/model/actor/Player.isMoving:()Z
       422: ifne          429
       425: iconst_1
       426: goto          430
       429: iconst_0
       430: istore        12
       432: aload_0
       433: lload         5
       435: putfield      #828                // Field _lastStuckCheckTime:J
       438: aload_0
       439: iload         7
       441: putfield      #28                 // Field _lastStuckX:I
       444: aload_0
       445: iload         8
       447: putfield      #31                 // Field _lastStuckY:I
       450: aload_0
       451: dload         9
       453: putfield      #37                 // Field _lastStuckDist:D
       456: iload         12
       458: ifeq          1097
       461: getstatic     #842                // Field ext/mods/gameserver/model/actor/move/CreatureMove.geoEngine:Lext/mods/gameserver/geoengine/GeoEngine;
       464: aload_0
       465: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       468: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
       471: invokevirtual #130                // Method ext/mods/gameserver/model/actor/Player.getX:()I
       474: aload_0
       475: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       478: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
       481: invokevirtual #131                // Method ext/mods/gameserver/model/actor/Player.getY:()I
       484: aload_0
       485: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       488: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
       491: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Player.getZ:()I
       494: aload_1
       495: invokevirtual #843                // Method ext/mods/gameserver/model/actor/Creature.getX:()I
       498: aload_1
       499: invokevirtual #844                // Method ext/mods/gameserver/model/actor/Creature.getY:()I
       502: aload_1
       503: invokevirtual #845                // Method ext/mods/gameserver/model/actor/Creature.getZ:()I
       506: iconst_1
       507: aconst_null
       508: invokevirtual #317                // Method ext/mods/gameserver/geoengine/GeoEngine.findPath:(IIIIIIZLext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
       511: astore        13
       513: aload         13
       515: checkcast     #319                // class java/util/Collection
       518: invokeinterface #322,  1          // InterfaceMethod java/util/Collection.isEmpty:()Z
       523: ifne          530
       526: iconst_1
       527: goto          531
       530: iconst_0
       531: ifeq          725
       534: getstatic     #760                // Field ext/mods/Config.ENABLE_SMOOTH_OBSTACLE_AVOIDANCE:Z
       537: ifeq          552
       540: invokestatic  #750                // Method ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance.getInstance:()Lext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance;
       543: aload         13
       545: aconst_null
       546: invokevirtual #764                // Method ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance.createSmoothPath:(Ljava/util/List;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
       549: goto          554
       552: aload         13
       554: astore        14
       556: aload         14
       558: checkcast     #847                // class java/lang/Iterable
       561: astore        17
       563: iconst_0
       564: istore        18
       566: aload         17
       568: invokeinterface #851,  1          // InterfaceMethod java/lang/Iterable.iterator:()Ljava/util/Iterator;
       573: astore        19
       575: aload         19
       577: invokeinterface #856,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       582: ifeq          636
       585: aload         19
       587: invokeinterface #859,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       592: astore        20
       594: aload         20
       596: checkcast     #150                // class ext/mods/gameserver/model/location/Location
       599: astore        21
       601: iconst_0
       602: istore        22
       604: aload_0
       605: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       608: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
       611: aload         21
       613: invokevirtual #861                // Method ext/mods/gameserver/model/actor/Player.distance2D:(Lext/mods/gameserver/model/location/Location;)D
       616: ldc2_w        #862                // double 40.0d
       619: dcmpl
       620: ifle          627
       623: iconst_1
       624: goto          628
       627: iconst_0
       628: ifeq          575
       631: aload         20
       633: goto          637
       636: aconst_null
       637: checkcast     #150                // class ext/mods/gameserver/model/location/Location
       640: dup
       641: ifnonnull     656
       644: pop
       645: aload         14
       647: iconst_0
       648: invokeinterface #328,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
       653: checkcast     #150                // class ext/mods/gameserver/model/location/Location
       656: astore        15
       658: aload_0
       659: invokespecial #91                 // Method isMeleeDebug:()Z
       662: ifeq          716
       665: getstatic     #95                 // Field ext/mods/gameserver/model/actor/move/CreatureMove.LOGGER:Lext/mods/commons/logging/CLogger;
       668: ldc_w         #865                // String [MeleeDebug][PlayerMove][maybeStartPlayerOffensiveFollow] stuckRepath actor={} target={} next={}
       671: iconst_3
       672: anewarray     #99                 // class java/lang/Object
       675: astore        16
       677: aload         16
       679: iconst_0
       680: aload_0
       681: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       684: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
       687: invokevirtual #102                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       690: invokestatic  #108                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       693: aastore
       694: aload         16
       696: iconst_1
       697: aload_1
       698: invokevirtual #778                // Method ext/mods/gameserver/model/actor/Creature.getObjectId:()I
       701: invokestatic  #108                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       704: aastore
       705: aload         16
       707: iconst_2
       708: aload         15
       710: aastore
       711: aload         16
       713: invokevirtual #115                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
       716: aload_0
       717: aload         15
       719: iconst_1
       720: invokevirtual #681                // Method moveToLocation:(Lext/mods/gameserver/model/location/Location;Z)V
       723: iconst_1
       724: ireturn
       725: aload_1
       726: invokevirtual #844                // Method ext/mods/gameserver/model/actor/Creature.getY:()I
       729: iload         8
       731: isub
       732: i2d
       733: aload_1
       734: invokevirtual #843                // Method ext/mods/gameserver/model/actor/Creature.getX:()I
       737: iload         7
       739: isub
       740: i2d
       741: invokestatic  #869                // Method java/lang/Math.atan2:(DD)D
       744: dstore        14
       746: aload_1
       747: invokevirtual #778                // Method ext/mods/gameserver/model/actor/Creature.getObjectId:()I
       750: iconst_1
       751: iand
       752: ifne          761
       755: ldc2_w        #870                // double 1.5707963267948966d
       758: goto          764
       761: ldc2_w        #872                // double -1.5707963267948966d
       764: dstore        16
       766: iconst_2
       767: newarray       double
       769: astore        19
       771: aload         19
       773: iconst_0
       774: dload         16
       776: dastore
       777: aload         19
       779: iconst_1
       780: dload         16
       782: dneg
       783: dastore
       784: aload         19
       786: astore        18
       788: iconst_5
       789: newarray       int
       791: astore        20
       793: aload         20
       795: iconst_0
       796: sipush        180
       799: iastore
       800: aload         20
       802: iconst_1
       803: sipush        260
       806: iastore
       807: aload         20
       809: iconst_2
       810: sipush        340
       813: iastore
       814: aload         20
       816: iconst_3
       817: sipush        420
       820: iastore
       821: aload         20
       823: iconst_4
       824: sipush        520
       827: iastore
       828: aload         20
       830: astore        19
       832: iconst_0
       833: istore        20
       835: aload         18
       837: arraylength
       838: istore        21
       840: iload         20
       842: iload         21
       844: if_icmpge     1097
       847: aload         18
       849: iload         20
       851: daload
       852: dstore        22
       854: iconst_0
       855: istore        24
       857: aload         19
       859: arraylength
       860: istore        25
       862: iload         24
       864: iload         25
       866: if_icmpge     1091
       869: aload         19
       871: iload         24
       873: iaload
       874: istore        26
       876: iload         7
       878: i2d
       879: iload         26
       881: i2d
       882: dload         14
       884: dload         22
       886: dadd
       887: invokestatic  #876                // Method java/lang/Math.cos:(D)D
       890: dmul
       891: dadd
       892: d2i
       893: istore        27
       895: iload         8
       897: i2d
       898: iload         26
       900: i2d
       901: dload         14
       903: dload         22
       905: dadd
       906: invokestatic  #879                // Method java/lang/Math.sin:(D)D
       909: dmul
       910: dadd
       911: d2i
       912: istore        28
       914: getstatic     #842                // Field ext/mods/gameserver/model/actor/move/CreatureMove.geoEngine:Lext/mods/gameserver/geoengine/GeoEngine;
       917: iload         27
       919: iload         28
       921: aload_0
       922: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       925: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
       928: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Player.getZ:()I
       931: invokevirtual #428                // Method ext/mods/gameserver/geoengine/GeoEngine.getHeight:(III)S
       934: istore        29
       936: getstatic     #842                // Field ext/mods/gameserver/model/actor/move/CreatureMove.geoEngine:Lext/mods/gameserver/geoengine/GeoEngine;
       939: iload         7
       941: iload         8
       943: aload_0
       944: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       947: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
       950: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Player.getZ:()I
       953: iload         27
       955: iload         28
       957: iload         29
       959: invokevirtual #459                // Method ext/mods/gameserver/geoengine/GeoEngine.canMoveToTarget:(IIIIII)Z
       962: ifeq          1085
       965: new           #150                // class ext/mods/gameserver/model/location/Location
       968: dup
       969: iload         27
       971: iload         28
       973: iload         29
       975: invokespecial #710                // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       978: astore        30
       980: aload_0
       981: invokespecial #91                 // Method isMeleeDebug:()Z
       984: ifeq          1076
       987: getstatic     #95                 // Field ext/mods/gameserver/model/actor/move/CreatureMove.LOGGER:Lext/mods/commons/logging/CLogger;
       990: ldc_w         #881                // String [MeleeDebug][PlayerMove][maybeStartPlayerOffensiveFollow] stuckBypass actor={} target={} dest={} step={} side={}
       993: iconst_5
       994: anewarray     #99                 // class java/lang/Object
       997: astore        31
       999: aload         31
      1001: iconst_0
      1002: aload_0
      1003: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
      1006: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
      1009: invokevirtual #102                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
      1012: invokestatic  #108                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      1015: aastore
      1016: aload         31
      1018: iconst_1
      1019: aload_1
      1020: invokevirtual #778                // Method ext/mods/gameserver/model/actor/Creature.getObjectId:()I
      1023: invokestatic  #108                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      1026: aastore
      1027: aload         31
      1029: iconst_2
      1030: aload         30
      1032: aastore
      1033: aload         31
      1035: iconst_3
      1036: iload         26
      1038: invokestatic  #108                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      1041: aastore
      1042: aload         31
      1044: iconst_4
      1045: dload         22
      1047: dload         16
      1049: dcmpg
      1050: ifne          1057
      1053: iconst_1
      1054: goto          1058
      1057: iconst_0
      1058: ifeq          1067
      1061: ldc_w         #883                // String primary
      1064: goto          1070
      1067: ldc_w         #885                // String secondary
      1070: aastore
      1071: aload         31
      1073: invokevirtual #115                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
      1076: aload_0
      1077: aload         30
      1079: iconst_1
      1080: invokevirtual #681                // Method moveToLocation:(Lext/mods/gameserver/model/location/Location;Z)V
      1083: iconst_1
      1084: ireturn
      1085: iinc          24, 1
      1088: goto          862
      1091: iinc          20, 1
      1094: goto          840
      1097: getstatic     #140                // Field ext/mods/Config.SISTEMA_PATHFINDING:Z
      1100: ifeq          1364
      1103: getstatic     #760                // Field ext/mods/Config.ENABLE_SMOOTH_OBSTACLE_AVOIDANCE:Z
      1106: ifeq          1138
      1109: invokestatic  #750                // Method ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance.getInstance:()Lext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance;
      1112: aload_0
      1113: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
      1116: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
      1119: invokevirtual #158                // Method ext/mods/gameserver/model/actor/Player.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
      1122: checkcast     #150                // class ext/mods/gameserver/model/location/Location
      1125: aload_1
      1126: invokevirtual #689                // Method ext/mods/gameserver/model/actor/Creature.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
      1129: checkcast     #150                // class ext/mods/gameserver/model/location/Location
      1132: invokevirtual #754                // Method ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance.shouldAvoidObstacle:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Z
      1135: goto          1160
      1138: aload_0
      1139: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
      1142: checkcast     #82                 // class ext/mods/gameserver/model/WorldObject
      1145: aload_1
      1146: checkcast     #82                 // class ext/mods/gameserver/model/WorldObject
      1149: invokestatic  #810                // Method ext/mods/gameserver/model/actor/move/MovementIntegration.canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
      1152: ifne          1159
      1155: iconst_1
      1156: goto          1160
      1159: iconst_0
      1160: istore        7
      1162: iload         7
      1164: ifeq          1364
      1167: getstatic     #842                // Field ext/mods/gameserver/model/actor/move/CreatureMove.geoEngine:Lext/mods/gameserver/geoengine/GeoEngine;
      1170: aload_0
      1171: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
      1174: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
      1177: invokevirtual #130                // Method ext/mods/gameserver/model/actor/Player.getX:()I
      1180: aload_0
      1181: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
      1184: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
      1187: invokevirtual #131                // Method ext/mods/gameserver/model/actor/Player.getY:()I
      1190: aload_0
      1191: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
      1194: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
      1197: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Player.getZ:()I
      1200: aload_1
      1201: invokevirtual #843                // Method ext/mods/gameserver/model/actor/Creature.getX:()I
      1204: aload_1
      1205: invokevirtual #844                // Method ext/mods/gameserver/model/actor/Creature.getY:()I
      1208: aload_1
      1209: invokevirtual #845                // Method ext/mods/gameserver/model/actor/Creature.getZ:()I
      1212: iconst_1
      1213: aconst_null
      1214: invokevirtual #317                // Method ext/mods/gameserver/geoengine/GeoEngine.findPath:(IIIIIIZLext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
      1217: astore        8
      1219: aload         8
      1221: checkcast     #319                // class java/util/Collection
      1224: invokeinterface #322,  1          // InterfaceMethod java/util/Collection.isEmpty:()Z
      1229: ifne          1236
      1232: iconst_1
      1233: goto          1237
      1236: iconst_0
      1237: ifeq          1364
      1240: getstatic     #760                // Field ext/mods/Config.ENABLE_SMOOTH_OBSTACLE_AVOIDANCE:Z
      1243: ifeq          1284
      1246: invokestatic  #750                // Method ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance.getInstance:()Lext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance;
      1249: aload         8
      1251: aconst_null
      1252: invokevirtual #764                // Method ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance.createSmoothPath:(Ljava/util/List;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
      1255: astore        10
      1257: aload         10
      1259: invokestatic  #770                // Method kotlin/collections/CollectionsKt.firstOrNull:(Ljava/util/List;)Ljava/lang/Object;
      1262: checkcast     #150                // class ext/mods/gameserver/model/location/Location
      1265: dup
      1266: ifnonnull     1295
      1269: pop
      1270: aload         8
      1272: iconst_0
      1273: invokeinterface #328,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      1278: checkcast     #150                // class ext/mods/gameserver/model/location/Location
      1281: goto          1295
      1284: aload         8
      1286: iconst_0
      1287: invokeinterface #328,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      1292: checkcast     #150                // class ext/mods/gameserver/model/location/Location
      1295: astore        9
      1297: aload_0
      1298: invokespecial #91                 // Method isMeleeDebug:()Z
      1301: ifeq          1355
      1304: getstatic     #95                 // Field ext/mods/gameserver/model/actor/move/CreatureMove.LOGGER:Lext/mods/commons/logging/CLogger;
      1307: ldc_w         #887                // String [MeleeDebug][PlayerMove][maybeStartPlayerOffensiveFollow] forcedPath actor={} target={} next={}
      1310: iconst_3
      1311: anewarray     #99                 // class java/lang/Object
      1314: astore        10
      1316: aload         10
      1318: iconst_0
      1319: aload_0
      1320: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
      1323: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
      1326: invokevirtual #102                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
      1329: invokestatic  #108                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      1332: aastore
      1333: aload         10
      1335: iconst_1
      1336: aload_1
      1337: invokevirtual #778                // Method ext/mods/gameserver/model/actor/Creature.getObjectId:()I
      1340: invokestatic  #108                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      1343: aastore
      1344: aload         10
      1346: iconst_2
      1347: aload         9
      1349: aastore
      1350: aload         10
      1352: invokevirtual #115                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
      1355: aload_0
      1356: aload         9
      1358: iconst_1
      1359: invokevirtual #681                // Method moveToLocation:(Lext/mods/gameserver/model/location/Location;Z)V
      1362: iconst_1
      1363: ireturn
      1364: aload_0
      1365: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
      1368: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
      1371: invokevirtual #653                // Method ext/mods/gameserver/model/actor/Player.isMovementDisabled:()Z
      1374: ifne          1404
      1377: aload_0
      1378: getfield      #69                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
      1381: checkcast     #39                 // class ext/mods/gameserver/model/actor/Player
      1384: invokevirtual #667                // Method ext/mods/gameserver/model/actor/Player.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
      1387: invokevirtual #814                // Method ext/mods/gameserver/model/actor/ai/type/PlayerAI.getCurrentIntention:()Lext/mods/gameserver/model/actor/ai/Intention;
      1390: invokevirtual #818                // Method ext/mods/gameserver/model/actor/ai/Intention.canMoveToTarget:()Z
      1393: ifeq          1404
      1396: aload_0
      1397: aload_1
      1398: iload_2
      1399: invokevirtual #820                // Method startPlayerOffensiveFollow:(Lext/mods/gameserver/model/actor/Creature;I)V
      1402: iconst_1
      1403: ireturn
      1404: iconst_1
      1405: ireturn
      StackMapTable: number_of_entries = 49
        frame_type = 6 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 74
        frame_type = 252 /* append */
          offset_delta = 41
          locals = [ int ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 253 /* append */
          offset_delta = 73
          locals = [ int, double ]
        frame_type = 20 /* same */
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 51
          locals = [ int ]
        frame_type = 250 /* chop */
          offset_delta = 6
        frame_type = 250 /* chop */
          offset_delta = 1
        frame_type = 255 /* full_frame */
          offset_delta = 118
          locals = [ class ext/mods/gameserver/model/actor/move/PlayerMove, class ext/mods/gameserver/model/actor/Creature, int, int, int, long, int, int, double ]
          stack = []
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ int ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 253 /* append */
          offset_delta = 99
          locals = [ int, class java/util/List ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 20 /* same */
        frame_type = 65 /* same_locals_1_stack_item */
          stack = [ class java/util/List ]
        frame_type = 255 /* full_frame */
          offset_delta = 20
          locals = [ class ext/mods/gameserver/model/actor/move/PlayerMove, class ext/mods/gameserver/model/actor/Creature, int, int, int, long, int, int, double, int, int, class java/util/List, class java/util/List, top, top, class java/lang/Iterable, int, class java/util/Iterator ]
          stack = []
        frame_type = 254 /* append */
          offset_delta = 51
          locals = [ class java/lang/Object, class ext/mods/gameserver/model/location/Location, int ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 248 /* chop */
          offset_delta = 7
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ class java/lang/Object ]
        frame_type = 82 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/location/Location ]
        frame_type = 255 /* full_frame */
          offset_delta = 59
          locals = [ class ext/mods/gameserver/model/actor/move/PlayerMove, class ext/mods/gameserver/model/actor/Creature, int, int, int, long, int, int, double, int, int, class java/util/List, class java/util/List, class ext/mods/gameserver/model/location/Location, top, class java/lang/Iterable, int, class java/util/Iterator ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 8
          locals = [ class ext/mods/gameserver/model/actor/move/PlayerMove, class ext/mods/gameserver/model/actor/Creature, int, int, int, long, int, int, double, int, int, class java/util/List ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 35
          locals = [ double ]
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ double ]
        frame_type = 255 /* full_frame */
          offset_delta = 75
          locals = [ class ext/mods/gameserver/model/actor/move/PlayerMove, class ext/mods/gameserver/model/actor/Creature, int, int, int, long, int, int, double, int, int, class java/util/List, double, double, class "[D", class "[I", int, int ]
          stack = []
        frame_type = 254 /* append */
          offset_delta = 21
          locals = [ double, int, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 194
          locals = [ class ext/mods/gameserver/model/actor/move/PlayerMove, class ext/mods/gameserver/model/actor/Creature, int, int, int, long, int, int, double, int, int, class java/util/List, double, double, class "[D", class "[I", int, int, double, int, int, int, int, int, int, class ext/mods/gameserver/model/location/Location, class "[Ljava/lang/Object;" ]
          stack = [ class ext/mods/commons/logging/CLogger, class java/lang/String, class "[Ljava/lang/Object;", int ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/move/PlayerMove, class ext/mods/gameserver/model/actor/Creature, int, int, int, long, int, int, double, int, int, class java/util/List, double, double, class "[D", class "[I", int, int, double, int, int, int, int, int, int, class ext/mods/gameserver/model/location/Location, class "[Ljava/lang/Object;" ]
          stack = [ class ext/mods/commons/logging/CLogger, class java/lang/String, class "[Ljava/lang/Object;", int, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 8
          locals = [ class ext/mods/gameserver/model/actor/move/PlayerMove, class ext/mods/gameserver/model/actor/Creature, int, int, int, long, int, int, double, int, int, class java/util/List, double, double, class "[D", class "[I", int, int, double, int, int, int, int, int, int, class ext/mods/gameserver/model/location/Location, class "[Ljava/lang/Object;" ]
          stack = [ class ext/mods/commons/logging/CLogger, class java/lang/String, class "[Ljava/lang/Object;", int ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/actor/move/PlayerMove, class ext/mods/gameserver/model/actor/Creature, int, int, int, long, int, int, double, int, int, class java/util/List, double, double, class "[D", class "[I", int, int, double, int, int, int, int, int, int, class ext/mods/gameserver/model/location/Location, class "[Ljava/lang/Object;" ]
          stack = [ class ext/mods/commons/logging/CLogger, class java/lang/String, class "[Ljava/lang/Object;", int, class java/lang/String ]
        frame_type = 250 /* chop */
          offset_delta = 5
        frame_type = 250 /* chop */
          offset_delta = 8
        frame_type = 255 /* full_frame */
          offset_delta = 5
          locals = [ class ext/mods/gameserver/model/actor/move/PlayerMove, class ext/mods/gameserver/model/actor/Creature, int, int, int, long, int, int, double, int, int, class java/util/List, double, double, class "[D", class "[I", int, int, double, int, int ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 5
          locals = [ class ext/mods/gameserver/model/actor/move/PlayerMove, class ext/mods/gameserver/model/actor/Creature, int, int, int, long ]
          stack = []
        frame_type = 40 /* same */
        frame_type = 20 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 253 /* append */
          offset_delta = 75
          locals = [ int, class java/util/List ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 46 /* same */
        frame_type = 74 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/location/Location ]
        frame_type = 252 /* append */
          offset_delta = 59
          locals = [ class ext/mods/gameserver/model/location/Location ]
        frame_type = 248 /* chop */
          offset_delta = 8
        frame_type = 39 /* same */
      LineNumberTable:
        line 700: 0
        line 701: 4
        line 704: 6
        line 705: 13
        line 706: 19
        line 705: 78
        line 709: 81
        line 710: 101
        line 712: 126
        line 713: 131
        line 715: 147
        line 716: 153
        line 717: 154
        line 718: 163
        line 719: 169
        line 720: 172
        line 721: 185
        line 719: 192
        line 724: 198
        line 727: 223
        line 716: 224
        line 730: 226
        line 731: 227
        line 732: 264
        line 733: 274
        line 735: 276
        line 739: 283
        line 741: 285
        line 742: 290
        line 743: 304
        line 744: 316
        line 745: 328
        line 746: 344
        line 747: 353
        line 747: 363
        line 748: 368
        line 748: 378
        line 749: 383
        line 749: 393
        line 746: 405
        line 750: 407
        line 751: 432
        line 752: 438
        line 753: 444
        line 754: 450
        line 755: 456
        line 756: 461
        line 757: 464
        line 758: 494
        line 759: 506
        line 756: 508
        line 762: 513
        line 762: 531
        line 763: 534
        line 764: 540
        line 766: 552
        line 763: 554
        line 768: 556
        line 856: 566
        line 768: 604
        line 856: 628
        line 857: 636
        line 768: 637
        line 770: 658
        line 771: 665
        line 772: 668
        line 773: 671
        line 771: 713
        line 777: 716
        line 778: 723
        line 781: 725
        line 782: 746
        line 783: 766
        line 784: 788
        line 785: 832
        line 786: 854
        line 787: 876
        line 788: 895
        line 789: 914
        line 791: 936
        line 792: 965
        line 793: 980
        line 794: 987
        line 795: 990
        line 796: 993
        line 797: 1045
        line 796: 1071
        line 794: 1073
        line 800: 1076
        line 801: 1083
        line 786: 1085
        line 785: 1091
        line 808: 1097
        line 809: 1103
        line 810: 1109
        line 811: 1112
        line 812: 1125
        line 810: 1132
        line 815: 1138
        line 809: 1160
        line 818: 1162
        line 819: 1167
        line 820: 1170
        line 821: 1200
        line 822: 1212
        line 819: 1214
        line 825: 1219
        line 825: 1237
        line 826: 1240
        line 827: 1246
        line 828: 1257
        line 830: 1284
        line 826: 1295
        line 833: 1297
        line 834: 1304
        line 835: 1307
        line 836: 1310
        line 834: 1352
        line 840: 1355
        line 841: 1362
        line 846: 1364
        line 847: 1396
        line 848: 1402
        line 851: 1404
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          226      57     7 hasObstacle   Z
          147     138     5 distance   D
          604      24    22 $i$a$-firstOrNull-PlayerMove$maybeStartPlayerOffensiveFollow$next$1   I
          601      27    21    it   Lext/mods/gameserver/model/location/Location;
          594      42    20 element$iv   Ljava/lang/Object;
          566      71    18 $i$f$firstOrNull   I
          563      74    17 $this$firstOrNull$iv   Ljava/lang/Iterable;
          556     169    14 candidatePath   Ljava/util/List;
          658      67    15  next   Lext/mods/gameserver/model/location/Location;
          980     105    30 bypassLoc   Lext/mods/gameserver/model/location/Location;
          895     190    27 bypassX   I
          914     171    28 bypassY   I
          936     149    29 bypassZ   I
          876     209    26  step   I
          854     237    22 offset   D
          513     584    13  path   Ljava/util/List;
          746     351    14 angle   D
          766     331    16 primaryOffset   D
          788     309    18 offsets   [D
          832     265    19 bypassSteps   [I
          316     781     7  curX   I
          328     769     8  curY   I
          344     753     9 curDist   D
          407     690    11 movedTooLittle   Z
          432     665    12 stuck   Z
         1257      24    10 smoothPath   Ljava/util/List;
         1297      67     9  next   Lext/mods/gameserver/model/location/Location;
         1219     145     8  path   Ljava/util/List;
         1162     202     7 hasObstacle   Z
          101    1305     3 totalRadius   I
          126    1280     4 shouldFollow   Z
          290    1116     5   now   J
            0    1406     0  this   Lext/mods/gameserver/model/actor/move/PlayerMove;
            0    1406     1 target   Lext/mods/gameserver/model/actor/Creature;
            0    1406     2 weaponAttackRange   I
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #8()
          org.jetbrains.annotations.NotNull
      parameter 1:

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #1081               // class ext/mods/gameserver/model/actor/move/PlayerMove$Companion
         3: dup
         4: aconst_null
         5: invokespecial #1084               // Method ext/mods/gameserver/model/actor/move/PlayerMove$Companion."<init>":(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
         8: putstatic     #1087               // Field Companion:Lext/mods/gameserver/model/actor/move/PlayerMove$Companion;
        11: return
}
InnerClasses:
  public static final #305= #310 of #304; // Companion=class ext/mods/gameserver/geoengine/GeoEngine$Companion of class ext/mods/gameserver/geoengine/GeoEngine
  public static final #305= #1081 of #2;  // Companion=class ext/mods/gameserver/model/actor/move/PlayerMove$Companion of class ext/mods/gameserver/model/actor/move/PlayerMove
  public static final #1107= #1104 of #1106; // BooleanRef=class kotlin/jvm/internal/Ref$BooleanRef of class kotlin/jvm/internal/Ref
  public static final #1110= #1109 of #1106; // IntRef=class kotlin/jvm/internal/Ref$IntRef of class kotlin/jvm/internal/Ref
Signature: #3                           // Lext/mods/gameserver/model/actor/move/CreatureMove<Lext/mods/gameserver/model/actor/Player;>;
SourceFile: "PlayerMove.kt"
SourceDebugExtension:
  SMAP
  PlayerMove.kt
  Kotlin
  *S Kotlin
  *F
  + 1 PlayerMove.kt
  ext/mods/gameserver/model/actor/move/PlayerMove
  + 2 fake.kt
  kotlin/jvm/internal/FakeKt
  + 3 _Collections.kt
  kotlin/collections/CollectionsKt___CollectionsKt
  *L
  1#1,854:1
  1#2:855
  296#3,2:856
  *S KotlinDebug
  *F
  + 1 PlayerMove.kt
  ext/mods/gameserver/model/actor/move/PlayerMove
  *L
  768#1:856,2
  *E
RuntimeVisibleAnnotations:
  0: #1088(#1089=[I#1090,I#1091,I#1092],#1093=I#1094,#1095=I#1096,#1097=[s#1098],#1099=[s#48,s#1100,s#50,s#49,s#6,s#7,s#20,s#21,s#55,s#1101,s#826,s#1101,s#25,s#29,s#34,s#1101,s#51,s#1101,s#58,s#1101,s#79,s#230,s#117,s#231,s#232,s#281,s#146,s#282,s#251,s#335,s#127,s#519,s#227,s#228,s#229,s#224,s#225,s#226,s#574,s#338,s#1101,s#578,s#579,s#442,s#516,s#517,s#518,s#640,s#657,s#658,s#659,s#67,s#685,s#141,s#734,s#775,s#800,s#911,s#305,s#1102])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 :2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001:B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\tH\u0002J\u0018\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0013H\u0014J\u0010\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001e\u001a\u00020\u0013H\u0016J:\u0010\u001f\u001a\u0004\u0018\u00010\u001a2\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\t2\u0006\u0010$\u001a\u00020\t2\u0006\u0010%\u001a\u00020\tH\u0002J\"\u0010&\u001a\u0004\u0018\u00010\u001a2\u000e\u0010\'\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010(2\u0006\u0010)\u001a\u00020*H\u0002J \u0010+\u001a\u00020\u00132\u0006\u0010,\u001a\u00020\t2\u0006\u0010-\u001a\u00020\t2\u0006\u0010.\u001a\u00020\tH\u0002J\u001e\u0010/\u001a\u00020\u00132\u0006\u00100\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\t2\u0006\u00101\u001a\u00020\u0013J\u0018\u00102\u001a\u00020\u00112\u0006\u00100\u001a\u0002032\u0006\u0010\u0017\u001a\u00020\tH\u0014J\u0018\u00104\u001a\u00020\u00112\u0006\u00100\u001a\u0002032\u0006\u0010\u0017\u001a\u00020\tH\u0014J:\u00105\u001a\u0004\u0018\u00010\u001a2\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\t2\u0006\u0010$\u001a\u00020\t2\u0006\u0010%\u001a\u00020\tH\u0016J&\u00106\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u00101\u001a\u00020\u0013J\u0016\u00107\u001a\u00020\u00112\u0006\u00100\u001a\u0002032\u0006\u0010\u0017\u001a\u00020\tJ\u0016\u00108\u001a\u00020\u00132\u0006\u00100\u001a\u0002032\u0006\u00109\u001a\u00020\tR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006;"]
      d2=["Lext/mods/gameserver/model/actor/move/PlayerMove;","Lext/mods/gameserver/model/actor/move/CreatureMove;","Lext/mods/gameserver/model/actor/Player;","actor","<init>","(Lext/mods/gameserver/model/actor/Player;)V","_instant","Ljava/time/Instant;","_moveTimeStamp","","_lastStuckCheckTime","","_lastStuckX","_lastStuckY","_lastStuckDist","","cancelMoveTask","","isMeleeDebug","","moveToPawn","pawn","Lext/mods/gameserver/model/WorldObject;","offset","moveToLocation","destination","Lext/mods/gameserver/model/location/Location;","pathfinding","handleAutoFarmMovement","startAutoFarmMove","updatePosition","calculatePathForAttack","ox","oy","oz","tx","ty","tz","processPathForAttack","path","","geoEngine","Lext/mods/gameserver/geoengine/GeoEngine;","validateMovement","nextX","nextY","nextZ","maybeMoveToPawn","target","isShiftPressed","offensiveFollowTask","Lext/mods/gameserver/model/actor/Creature;","friendlyFollowTask","calculatePath","maybePlayerMoveToLocation","startPlayerOffensiveFollow","maybeStartPlayerOffensiveFollow","weaponAttackRange","Companion","Brproject"]
    )
RuntimeInvisibleAnnotations:
  0: #1112(#1113=[s#1114])
    kotlin.jvm.internal.SourceDebugExtension(
      value=["SMAP\nPlayerMove.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlayerMove.kt\next/mods/gameserver/model/actor/move/PlayerMove\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,854:1\n1#2:855\n296#3,2:856\n*S KotlinDebug\n*F\n+ 1 PlayerMove.kt\next/mods/gameserver/model/actor/move/PlayerMove\n*L\n768#1:856,2\n*E\n"]
    )
BootstrapMethods:
  0: #208 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #195 (Ljava/lang/Object;)V
      #200 REF_invokeStatic ext/mods/gameserver/model/actor/move/PlayerMove.moveToPawn$lambda$0:(Lext/mods/gameserver/model/actor/move/PlayerMove;IIIIIIILext/mods/gameserver/model/actor/Player;)V
      #201 (Lext/mods/gameserver/model/actor/Player;)V
  1: #208 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #195 (Ljava/lang/Object;)V
      #267 REF_invokeStatic ext/mods/gameserver/model/actor/move/PlayerMove.moveToLocation$lambda$1:(Lext/mods/gameserver/model/actor/move/PlayerMove;Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/SpawnLocation;Lext/mods/gameserver/model/actor/Player;)V
      #201 (Lext/mods/gameserver/model/actor/Player;)V
  2: #208 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #195 (Ljava/lang/Object;)V
      #475 REF_invokeStatic ext/mods/gameserver/model/actor/move/PlayerMove.updatePosition$lambda$1:(Lext/mods/gameserver/model/actor/move/PlayerMove;Ljava/lang/String;Lext/mods/gameserver/enums/actors/MoveType;IIILext/mods/gameserver/model/actor/Player;)V
      #201 (Lext/mods/gameserver/model/actor/Player;)V
  3: #208 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #541 ()Ljava/lang/Object;
      #546 REF_invokeStatic ext/mods/gameserver/model/actor/move/PlayerMove.calculatePathForAttack$lambda$0:(Lext/mods/gameserver/geoengine/pathfinding/PathFinder;Lext/mods/gameserver/model/actor/move/PlayerMove;IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
      #548 ()Ljava/util/List;
  4: #208 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #195 (Ljava/lang/Object;)V
      #570 REF_invokeStatic ext/mods/gameserver/model/actor/move/PlayerMove.calculatePathForAttack$lambda$1:(Lext/mods/gameserver/model/actor/move/PlayerMove;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;Lext/mods/gameserver/model/actor/Player;)V
      #201 (Lext/mods/gameserver/model/actor/Player;)V
  5: #208 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #195 (Ljava/lang/Object;)V
      #730 REF_invokeStatic ext/mods/gameserver/model/actor/move/PlayerMove.calculatePath$lambda$0:(Lext/mods/gameserver/model/actor/move/PlayerMove;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;Lext/mods/gameserver/model/actor/Player;)V
      #201 (Lext/mods/gameserver/model/actor/Player;)V
  6: #208 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #782 ()V
      #787 REF_invokeStatic ext/mods/gameserver/model/actor/move/PlayerMove.startPlayerOffensiveFollow$lambda$0:(Lext/mods/gameserver/model/actor/move/PlayerMove;Lext/mods/gameserver/model/actor/Creature;I)V
      #782 ()V
  7: #924 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #917 MOVE\u0001
  8: #924 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #945 MoveToPawn (\u0001): \u0001 \u0001 \u0001
  9: #924 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #957 Moving from \u0001 \u0001 \u0001 to \u0001 \u0001 \u0001
  10: #924 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #976 MoveToLocation: \u0001
  11: #924 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1026 Segment #\u0001
  12: #924 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1031 Moving from \u0001 to \u0001
  13: #924 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1050 Falling/Climb bug found when moving from \u0001, \u0001, \u0001 to \u0001
  14: #924 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1071 PATH\u0001
