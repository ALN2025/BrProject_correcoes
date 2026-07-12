// Bytecode for: ext.mods.gameserver.model.actor.move.CreatureMove
// File: ext\mods\gameserver\model\actor\move\CreatureMove.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/move/CreatureMove.class
  Last modified 9 de jul de 2026; size 34692 bytes
  MD5 checksum 861629b5c9ea4fcc4b4c2b6644ae6be6
  Compiled from "CreatureMove.kt"
public class ext.mods.gameserver.model.actor.move.CreatureMove<T extends ext.mods.gameserver.model.actor.Creature> extends java.lang.Object
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/model/actor/move/CreatureMove
  super_class: #5                         // java/lang/Object
  interfaces: 0, fields: 36, methods: 55, attributes: 7
Constant pool:
     #1 = Utf8               ext/mods/gameserver/model/actor/move/CreatureMove
     #2 = Class              #1           // ext/mods/gameserver/model/actor/move/CreatureMove
     #3 = Utf8               <T:Lext/mods/gameserver/model/actor/Creature;>Ljava/lang/Object;
     #4 = Utf8               java/lang/Object
     #5 = Class              #4           // java/lang/Object
     #6 = Utf8               <init>
     #7 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
     #8 = Utf8               (TT;)V
     #9 = Utf8               Lorg/jetbrains/annotations/NotNull;
    #10 = Utf8               ()V
    #11 = NameAndType        #6:#10       // "<init>":()V
    #12 = Methodref          #5.#11       // java/lang/Object."<init>":()V
    #13 = Utf8               _actor
    #14 = Utf8               Lext/mods/gameserver/model/actor/Creature;
    #15 = NameAndType        #13:#14      // _actor:Lext/mods/gameserver/model/actor/Creature;
    #16 = Fieldref           #2.#15       // ext/mods/gameserver/model/actor/move/CreatureMove._actor:Lext/mods/gameserver/model/actor/Creature;
    #17 = Utf8               ext/mods/gameserver/model/location/Location
    #18 = Class              #17          // ext/mods/gameserver/model/location/Location
    #19 = Utf8               (III)V
    #20 = NameAndType        #6:#19       // "<init>":(III)V
    #21 = Methodref          #18.#20      // ext/mods/gameserver/model/location/Location."<init>":(III)V
    #22 = Utf8               _destination
    #23 = Utf8               Lext/mods/gameserver/model/location/Location;
    #24 = NameAndType        #22:#23      // _destination:Lext/mods/gameserver/model/location/Location;
    #25 = Fieldref           #2.#24       // ext/mods/gameserver/model/actor/move/CreatureMove._destination:Lext/mods/gameserver/model/location/Location;
    #26 = Utf8               ext/mods/gameserver/model/WorldObject
    #27 = Class              #26          // ext/mods/gameserver/model/WorldObject
    #28 = Utf8               getZ
    #29 = Utf8               ()I
    #30 = NameAndType        #28:#29      // getZ:()I
    #31 = Methodref          #27.#30      // ext/mods/gameserver/model/WorldObject.getZ:()I
    #32 = Utf8               _zAccurate
    #33 = Utf8               D
    #34 = NameAndType        #32:#33      // _zAccurate:D
    #35 = Fieldref           #2.#34       // ext/mods/gameserver/model/actor/move/CreatureMove._zAccurate:D
    #36 = Utf8               java/util/ArrayDeque
    #37 = Class              #36          // java/util/ArrayDeque
    #38 = Methodref          #37.#11      // java/util/ArrayDeque."<init>":()V
    #39 = Utf8               _geoPath
    #40 = Utf8               Ljava/util/ArrayDeque;
    #41 = NameAndType        #39:#40      // _geoPath:Ljava/util/ArrayDeque;
    #42 = Fieldref           #2.#41       // ext/mods/gameserver/model/actor/move/CreatureMove._geoPath:Ljava/util/ArrayDeque;
    #43 = Utf8               _finalPathDestination
    #44 = NameAndType        #43:#23      // _finalPathDestination:Lext/mods/gameserver/model/location/Location;
    #45 = Fieldref           #2.#44       // ext/mods/gameserver/model/actor/move/CreatureMove._finalPathDestination:Lext/mods/gameserver/model/location/Location;
    #46 = Integer            -2147483648
    #47 = Utf8               _cachedDestinationZ
    #48 = Utf8               I
    #49 = NameAndType        #47:#48      // _cachedDestinationZ:I
    #50 = Fieldref           #2.#49       // ext/mods/gameserver/model/actor/move/CreatureMove._cachedDestinationZ:I
    #51 = Utf8               _cachedDestinationX
    #52 = NameAndType        #51:#48      // _cachedDestinationX:I
    #53 = Fieldref           #2.#52       // ext/mods/gameserver/model/actor/move/CreatureMove._cachedDestinationX:I
    #54 = Utf8               _cachedDestinationY
    #55 = NameAndType        #54:#48      // _cachedDestinationY:I
    #56 = Fieldref           #2.#55       // ext/mods/gameserver/model/actor/move/CreatureMove._cachedDestinationY:I
    #57 = Utf8               _currentSpeedRandomFactor
    #58 = NameAndType        #57:#33      // _currentSpeedRandomFactor:D
    #59 = Fieldref           #2.#58       // ext/mods/gameserver/model/actor/move/CreatureMove._currentSpeedRandomFactor:D
    #60 = Utf8               this
    #61 = Utf8               Lext/mods/gameserver/model/actor/move/CreatureMove;
    #62 = Utf8               getTask
    #63 = Utf8               ()Ljava/util/concurrent/ScheduledFuture;
    #64 = Utf8               ()Ljava/util/concurrent/ScheduledFuture<*>;
    #65 = Utf8               Lorg/jetbrains/annotations/Nullable;
    #66 = Utf8               _task
    #67 = Utf8               Ljava/util/concurrent/ScheduledFuture;
    #68 = NameAndType        #66:#67      // _task:Ljava/util/concurrent/ScheduledFuture;
    #69 = Fieldref           #2.#68       // ext/mods/gameserver/model/actor/move/CreatureMove._task:Ljava/util/concurrent/ScheduledFuture;
    #70 = Utf8               getDestination
    #71 = Utf8               ()Lext/mods/gameserver/model/location/Location;
    #72 = Utf8               describeMovementTo
    #73 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
    #74 = Utf8               ext/mods/gameserver/network/serverpackets/MoveToLocation
    #75 = Class              #74          // ext/mods/gameserver/network/serverpackets/MoveToLocation
    #76 = NameAndType        #6:#7        // "<init>":(Lext/mods/gameserver/model/actor/Creature;)V
    #77 = Methodref          #75.#76      // ext/mods/gameserver/network/serverpackets/MoveToLocation."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
    #78 = Utf8               ext/mods/gameserver/network/serverpackets/L2GameServerPacket
    #79 = Class              #78          // ext/mods/gameserver/network/serverpackets/L2GameServerPacket
    #80 = Utf8               ext/mods/gameserver/model/actor/Player
    #81 = Class              #80          // ext/mods/gameserver/model/actor/Player
    #82 = Utf8               sendPacket
    #83 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
    #84 = NameAndType        #82:#83      // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
    #85 = Methodref          #81.#84      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
    #86 = Utf8               player
    #87 = Utf8               Lext/mods/gameserver/model/actor/Player;
    #88 = Utf8               isDebugMove
    #89 = Utf8               ()Z
    #90 = Utf8               _isDebugMove
    #91 = Utf8               Z
    #92 = NameAndType        #90:#91      // _isDebugMove:Z
    #93 = Fieldref           #2.#92       // ext/mods/gameserver/model/actor/move/CreatureMove._isDebugMove:Z
    #94 = Utf8               setDebugMove
    #95 = Utf8               (Z)V
    #96 = Utf8               debug
    #97 = Utf8               isDebugPath
    #98 = Utf8               _isDebugPath
    #99 = NameAndType        #98:#91      // _isDebugPath:Z
   #100 = Fieldref           #2.#99       // ext/mods/gameserver/model/actor/move/CreatureMove._isDebugPath:Z
   #101 = Utf8               setDebugPath
   #102 = Utf8               getGeoPathFailCount
   #103 = Utf8               _geoPathFailCount
   #104 = NameAndType        #103:#48     // _geoPathFailCount:I
   #105 = Fieldref           #2.#104      // ext/mods/gameserver/model/actor/move/CreatureMove._geoPathFailCount:I
   #106 = Utf8               resetGeoPathFailCount
   #107 = Utf8               addGeoPathFailCount
   #108 = Utf8               ext/mods/Config
   #109 = Class              #108         // ext/mods/Config
   #110 = Utf8               MAX_GEOPATH_FAIL_COUNT
   #111 = NameAndType        #110:#48     // MAX_GEOPATH_FAIL_COUNT:I
   #112 = Fieldref           #109.#111    // ext/mods/Config.MAX_GEOPATH_FAIL_COUNT:I
   #113 = Utf8               isMeleeDebug
   #114 = Utf8               DEBUG_MELEE_ATTACK
   #115 = NameAndType        #114:#91     // DEBUG_MELEE_ATTACK:Z
   #116 = Fieldref           #109.#115    // ext/mods/Config.DEBUG_MELEE_ATTACK:Z
   #117 = Utf8               getStatus
   #118 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #119 = NameAndType        #117:#118    // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #120 = Methodref          #81.#119     // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #121 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
   #122 = Class              #121         // ext/mods/gameserver/model/actor/status/PlayerStatus
   #123 = Utf8               getPhysicalAttackRange
   #124 = NameAndType        #123:#29     // getPhysicalAttackRange:()I
   #125 = Methodref          #122.#124    // ext/mods/gameserver/model/actor/status/PlayerStatus.getPhysicalAttackRange:()I
   #126 = Utf8               syncPlayerLocation
   #127 = Utf8               java/lang/System
   #128 = Class              #127         // java/lang/System
   #129 = Utf8               currentTimeMillis
   #130 = Utf8               ()J
   #131 = NameAndType        #129:#130    // currentTimeMillis:()J
   #132 = Methodref          #128.#131    // java/lang/System.currentTimeMillis:()J
   #133 = Utf8               _lastValidateLocationTime
   #134 = Utf8               J
   #135 = NameAndType        #133:#134    // _lastValidateLocationTime:J
   #136 = Fieldref           #2.#135      // ext/mods/gameserver/model/actor/move/CreatureMove._lastValidateLocationTime:J
   #137 = Long               500l
   #139 = Utf8               ext/mods/gameserver/network/serverpackets/ValidateLocation
   #140 = Class              #139         // ext/mods/gameserver/network/serverpackets/ValidateLocation
   #141 = Utf8               ext/mods/gameserver/model/actor/Creature
   #142 = Class              #141         // ext/mods/gameserver/model/actor/Creature
   #143 = Methodref          #140.#76     // ext/mods/gameserver/network/serverpackets/ValidateLocation."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
   #144 = Utf8               now
   #145 = Utf8               force
   #146 = Utf8               syncPlayerLocation$default
   #147 = Utf8               (Lext/mods/gameserver/model/actor/move/CreatureMove;ZILjava/lang/Object;)V
   #148 = Utf8               java/lang/UnsupportedOperationException
   #149 = Class              #148         // java/lang/UnsupportedOperationException
   #150 = Utf8               Super calls with default arguments not supported in this target, function: syncPlayerLocation
   #151 = String             #150         // Super calls with default arguments not supported in this target, function: syncPlayerLocation
   #152 = Utf8               (Ljava/lang/String;)V
   #153 = NameAndType        #6:#152      // "<init>":(Ljava/lang/String;)V
   #154 = Methodref          #149.#153    // java/lang/UnsupportedOperationException."<init>":(Ljava/lang/String;)V
   #155 = NameAndType        #126:#95     // syncPlayerLocation:(Z)V
   #156 = Methodref          #2.#155      // ext/mods/gameserver/model/actor/move/CreatureMove.syncPlayerLocation:(Z)V
   #157 = Utf8               getMoveType
   #158 = Utf8               ()Lext/mods/gameserver/enums/actors/MoveType;
   #159 = Utf8               _moveTypes
   #160 = Utf8               B
   #161 = NameAndType        #159:#160    // _moveTypes:B
   #162 = Fieldref           #2.#161      // ext/mods/gameserver/model/actor/move/CreatureMove._moveTypes:B
   #163 = Utf8               ext/mods/gameserver/enums/actors/MoveType
   #164 = Class              #163         // ext/mods/gameserver/enums/actors/MoveType
   #165 = Utf8               SWIM
   #166 = Utf8               Lext/mods/gameserver/enums/actors/MoveType;
   #167 = NameAndType        #165:#166    // SWIM:Lext/mods/gameserver/enums/actors/MoveType;
   #168 = Fieldref           #164.#167    // ext/mods/gameserver/enums/actors/MoveType.SWIM:Lext/mods/gameserver/enums/actors/MoveType;
   #169 = Utf8               getMask
   #170 = NameAndType        #169:#29     // getMask:()I
   #171 = Methodref          #164.#170    // ext/mods/gameserver/enums/actors/MoveType.getMask:()I
   #172 = Utf8               FLY
   #173 = NameAndType        #172:#166    // FLY:Lext/mods/gameserver/enums/actors/MoveType;
   #174 = Fieldref           #164.#173    // ext/mods/gameserver/enums/actors/MoveType.FLY:Lext/mods/gameserver/enums/actors/MoveType;
   #175 = Utf8               GROUND
   #176 = NameAndType        #175:#166    // GROUND:Lext/mods/gameserver/enums/actors/MoveType;
   #177 = Fieldref           #164.#176    // ext/mods/gameserver/enums/actors/MoveType.GROUND:Lext/mods/gameserver/enums/actors/MoveType;
   #178 = Utf8               addMoveType
   #179 = Utf8               (Lext/mods/gameserver/enums/actors/MoveType;)V
   #180 = Utf8               type
   #181 = Utf8               removeMoveType
   #182 = Utf8               findAlternativeAttackPosition
   #183 = Utf8               (Lext/mods/gameserver/model/actor/Creature;I)Lext/mods/gameserver/model/location/Location;
   #184 = Utf8               getX
   #185 = NameAndType        #184:#29     // getX:()I
   #186 = Methodref          #142.#185    // ext/mods/gameserver/model/actor/Creature.getX:()I
   #187 = Utf8               getY
   #188 = NameAndType        #187:#29     // getY:()I
   #189 = Methodref          #142.#188    // ext/mods/gameserver/model/actor/Creature.getY:()I
   #190 = Methodref          #142.#30     // ext/mods/gameserver/model/actor/Creature.getZ:()I
   #191 = Utf8               getObjectId
   #192 = NameAndType        #191:#29     // getObjectId:()I
   #193 = Methodref          #27.#192     // ext/mods/gameserver/model/WorldObject.getObjectId:()I
   #194 = Utf8               kotlin/ranges/RangesKt
   #195 = Class              #194         // kotlin/ranges/RangesKt
   #196 = Utf8               coerceAtLeast
   #197 = Utf8               (II)I
   #198 = NameAndType        #196:#197    // coerceAtLeast:(II)I
   #199 = Methodref          #195.#198    // kotlin/ranges/RangesKt.coerceAtLeast:(II)I
   #200 = Methodref          #27.#188     // ext/mods/gameserver/model/WorldObject.getY:()I
   #201 = Methodref          #27.#185     // ext/mods/gameserver/model/WorldObject.getX:()I
   #202 = Utf8               java/lang/Math
   #203 = Class              #202         // java/lang/Math
   #204 = Utf8               atan2
   #205 = Utf8               (DD)D
   #206 = NameAndType        #204:#205    // atan2:(DD)D
   #207 = Methodref          #203.#206    // java/lang/Math.atan2:(DD)D
   #208 = Utf8               toDegrees
   #209 = Utf8               (D)D
   #210 = NameAndType        #208:#209    // toDegrees:(D)D
   #211 = Methodref          #203.#210    // java/lang/Math.toDegrees:(D)D
   #212 = Double             1.7976931348623157E308d
   #214 = Utf8               toRadians
   #215 = NameAndType        #214:#209    // toRadians:(D)D
   #216 = Methodref          #203.#215    // java/lang/Math.toRadians:(D)D
   #217 = Utf8               cos
   #218 = NameAndType        #217:#209    // cos:(D)D
   #219 = Methodref          #203.#218    // java/lang/Math.cos:(D)D
   #220 = Utf8               sin
   #221 = NameAndType        #220:#209    // sin:(D)D
   #222 = Methodref          #203.#221    // java/lang/Math.sin:(D)D
   #223 = Utf8               geoEngine
   #224 = Utf8               Lext/mods/gameserver/geoengine/GeoEngine;
   #225 = NameAndType        #223:#224    // geoEngine:Lext/mods/gameserver/geoengine/GeoEngine;
   #226 = Fieldref           #2.#225      // ext/mods/gameserver/model/actor/move/CreatureMove.geoEngine:Lext/mods/gameserver/geoengine/GeoEngine;
   #227 = Utf8               ext/mods/gameserver/geoengine/GeoEngine
   #228 = Class              #227         // ext/mods/gameserver/geoengine/GeoEngine
   #229 = Utf8               getHeight
   #230 = Utf8               (III)S
   #231 = NameAndType        #229:#230    // getHeight:(III)S
   #232 = Methodref          #228.#231    // ext/mods/gameserver/geoengine/GeoEngine.getHeight:(III)S
   #233 = Utf8               canMoveToTarget
   #234 = Utf8               (IIIIII)Z
   #235 = NameAndType        #233:#234    // canMoveToTarget:(IIIIII)Z
   #236 = Methodref          #228.#235    // ext/mods/gameserver/geoengine/GeoEngine.canMoveToTarget:(IIIIII)Z
   #237 = Double             40.0d
   #239 = Utf8               getKnownTypeInRadius
   #240 = Utf8               (Ljava/lang/Class;I)Ljava/util/List;
   #241 = NameAndType        #239:#240    // getKnownTypeInRadius:(Ljava/lang/Class;I)Ljava/util/List;
   #242 = Methodref          #27.#241     // ext/mods/gameserver/model/WorldObject.getKnownTypeInRadius:(Ljava/lang/Class;I)Ljava/util/List;
   #243 = Utf8               java/lang/Iterable
   #244 = Class              #243         // java/lang/Iterable
   #245 = Utf8               java/util/Collection
   #246 = Class              #245         // java/util/Collection
   #247 = Utf8               isEmpty
   #248 = NameAndType        #247:#89     // isEmpty:()Z
   #249 = InterfaceMethodref #246.#248    // java/util/Collection.isEmpty:()Z
   #250 = Utf8               iterator
   #251 = Utf8               ()Ljava/util/Iterator;
   #252 = NameAndType        #250:#251    // iterator:()Ljava/util/Iterator;
   #253 = InterfaceMethodref #244.#252    // java/lang/Iterable.iterator:()Ljava/util/Iterator;
   #254 = Utf8               java/util/Iterator
   #255 = Class              #254         // java/util/Iterator
   #256 = Utf8               hasNext
   #257 = NameAndType        #256:#89     // hasNext:()Z
   #258 = InterfaceMethodref #255.#257    // java/util/Iterator.hasNext:()Z
   #259 = Utf8               next
   #260 = Utf8               ()Ljava/lang/Object;
   #261 = NameAndType        #259:#260    // next:()Ljava/lang/Object;
   #262 = InterfaceMethodref #255.#261    // java/util/Iterator.next:()Ljava/lang/Object;
   #263 = Utf8               kotlin/jvm/internal/Intrinsics
   #264 = Class              #263         // kotlin/jvm/internal/Intrinsics
   #265 = Utf8               areEqual
   #266 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Z
   #267 = NameAndType        #265:#266    // areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
   #268 = Methodref          #264.#267    // kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
   #269 = Utf8               isAlikeDead
   #270 = NameAndType        #269:#89     // isAlikeDead:()Z
   #271 = Methodref          #142.#270    // ext/mods/gameserver/model/actor/Creature.isAlikeDead:()Z
   #272 = Utf8               distance2D
   #273 = Utf8               (Lext/mods/gameserver/model/location/Location;)D
   #274 = NameAndType        #272:#273    // distance2D:(Lext/mods/gameserver/model/location/Location;)D
   #275 = Methodref          #142.#274    // ext/mods/gameserver/model/actor/Creature.distance2D:(Lext/mods/gameserver/model/location/Location;)D
   #276 = Utf8               getCollisionRadius
   #277 = Utf8               ()D
   #278 = NameAndType        #276:#277    // getCollisionRadius:()D
   #279 = Methodref          #142.#278    // ext/mods/gameserver/model/actor/Creature.getCollisionRadius:()D
   #280 = Methodref          #27.#274     // ext/mods/gameserver/model/WorldObject.distance2D:(Lext/mods/gameserver/model/location/Location;)D
   #281 = Utf8               $i$a$-any-CreatureMove$findAlternativeAttackPosition$isTooCloseToOthers$1
   #282 = Utf8               other
   #283 = Utf8               element$iv
   #284 = Utf8               Ljava/lang/Object;
   #285 = Utf8               $i$f$any
   #286 = Utf8               $this$any$iv
   #287 = Utf8               Ljava/lang/Iterable;
   #288 = Utf8               currentAngle
   #289 = Utf8               jitter
   #290 = Utf8               testX
   #291 = Utf8               testY
   #292 = Utf8               testZ
   #293 = Utf8               testLoc
   #294 = Utf8               collisionGap
   #295 = Utf8               isTooCloseToOthers
   #296 = Utf8               score
   #297 = Utf8               i
   #298 = Utf8               centerX
   #299 = Utf8               centerY
   #300 = Utf8               centerZ
   #301 = Utf8               layer
   #302 = Utf8               layeredRange
   #303 = Utf8               totalAngles
   #304 = Utf8               angleStep
   #305 = Utf8               startAngle
   #306 = Utf8               bestLoc
   #307 = Utf8               bestScore
   #308 = Utf8               target
   #309 = Utf8               baseRange
   #310 = Utf8               moveToLocation
   #311 = Utf8               (Lext/mods/gameserver/model/location/Location;Z)V
   #312 = NameAndType        #113:#89     // isMeleeDebug:()Z
   #313 = Methodref          #2.#312      // ext/mods/gameserver/model/actor/move/CreatureMove.isMeleeDebug:()Z
   #314 = Utf8               LOGGER
   #315 = Utf8               Lext/mods/commons/logging/CLogger;
   #316 = NameAndType        #314:#315    // LOGGER:Lext/mods/commons/logging/CLogger;
   #317 = Fieldref           #2.#316      // ext/mods/gameserver/model/actor/move/CreatureMove.LOGGER:Lext/mods/commons/logging/CLogger;
   #318 = Utf8               [MeleeDebug][CreatureMove][moveToLocation] actor={} dest={} pathfinding={}
   #319 = String             #318         // [MeleeDebug][CreatureMove][moveToLocation] actor={} dest={} pathfinding={}
   #320 = Utf8               java/lang/Integer
   #321 = Class              #320         // java/lang/Integer
   #322 = Utf8               valueOf
   #323 = Utf8               (I)Ljava/lang/Integer;
   #324 = NameAndType        #322:#323    // valueOf:(I)Ljava/lang/Integer;
   #325 = Methodref          #321.#324    // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #326 = Utf8               java/lang/Boolean
   #327 = Class              #326         // java/lang/Boolean
   #328 = Utf8               (Z)Ljava/lang/Boolean;
   #329 = NameAndType        #322:#328    // valueOf:(Z)Ljava/lang/Boolean;
   #330 = Methodref          #327.#329    // java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
   #331 = Utf8               ext/mods/commons/logging/CLogger
   #332 = Class              #331         // ext/mods/commons/logging/CLogger
   #333 = Utf8               info
   #334 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
   #335 = NameAndType        #333:#334    // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #336 = Methodref          #332.#335    // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #337 = Utf8               _pawn
   #338 = Utf8               Lext/mods/gameserver/model/WorldObject;
   #339 = NameAndType        #337:#338    // _pawn:Lext/mods/gameserver/model/WorldObject;
   #340 = Fieldref           #2.#339      // ext/mods/gameserver/model/actor/move/CreatureMove._pawn:Lext/mods/gameserver/model/WorldObject;
   #341 = Utf8               ext/mods/gameserver/model/actor/Npc
   #342 = Class              #341         // ext/mods/gameserver/model/actor/Npc
   #343 = Utf8               wouldCollideInPath
   #344 = Utf8               (Lext/mods/gameserver/model/location/Location;)Z
   #345 = NameAndType        #343:#344    // wouldCollideInPath:(Lext/mods/gameserver/model/location/Location;)Z
   #346 = Methodref          #2.#345      // ext/mods/gameserver/model/actor/move/CreatureMove.wouldCollideInPath:(Lext/mods/gameserver/model/location/Location;)Z
   #347 = Utf8               null cannot be cast to non-null type ext.mods.gameserver.model.actor.Creature
   #348 = String             #347         // null cannot be cast to non-null type ext.mods.gameserver.model.actor.Creature
   #349 = Utf8               checkNotNull
   #350 = Utf8               (Ljava/lang/Object;Ljava/lang/String;)V
   #351 = NameAndType        #349:#350    // checkNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
   #352 = Methodref          #264.#351    // kotlin/jvm/internal/Intrinsics.checkNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
   #353 = Utf8               _offset
   #354 = NameAndType        #353:#48     // _offset:I
   #355 = Fieldref           #2.#354      // ext/mods/gameserver/model/actor/move/CreatureMove._offset:I
   #356 = NameAndType        #182:#183    // findAlternativeAttackPosition:(Lext/mods/gameserver/model/actor/Creature;I)Lext/mods/gameserver/model/location/Location;
   #357 = Methodref          #2.#356      // ext/mods/gameserver/model/actor/move/CreatureMove.findAlternativeAttackPosition:(Lext/mods/gameserver/model/actor/Creature;I)Lext/mods/gameserver/model/location/Location;
   #358 = Utf8               set
   #359 = Utf8               (Lext/mods/gameserver/model/location/Location;)V
   #360 = NameAndType        #358:#359    // set:(Lext/mods/gameserver/model/location/Location;)V
   #361 = Methodref          #18.#360     // ext/mods/gameserver/model/location/Location.set:(Lext/mods/gameserver/model/location/Location;)V
   #362 = Utf8               _lastMoveRequestTime
   #363 = NameAndType        #362:#134    // _lastMoveRequestTime:J
   #364 = Fieldref           #2.#363      // ext/mods/gameserver/model/actor/move/CreatureMove._lastMoveRequestTime:J
   #365 = Long               100l
   #367 = Utf8               ext/mods/gameserver/model/location/Point2D
   #368 = Class              #367         // ext/mods/gameserver/model/location/Point2D
   #369 = Utf8               (Lext/mods/gameserver/model/location/Point2D;)D
   #370 = NameAndType        #272:#369    // distance2D:(Lext/mods/gameserver/model/location/Point2D;)D
   #371 = Methodref          #18.#370     // ext/mods/gameserver/model/location/Location.distance2D:(Lext/mods/gameserver/model/location/Point2D;)D
   #372 = Double             10.0d
   #374 = Utf8               _xAccurate
   #375 = NameAndType        #374:#33     // _xAccurate:D
   #376 = Fieldref           #2.#375      // ext/mods/gameserver/model/actor/move/CreatureMove._xAccurate:D
   #377 = Utf8               _yAccurate
   #378 = NameAndType        #377:#33     // _yAccurate:D
   #379 = Fieldref           #2.#378      // ext/mods/gameserver/model/actor/move/CreatureMove._yAccurate:D
   #380 = Utf8               java/util/concurrent/ThreadLocalRandom
   #381 = Class              #380         // java/util/concurrent/ThreadLocalRandom
   #382 = Utf8               current
   #383 = Utf8               ()Ljava/util/concurrent/ThreadLocalRandom;
   #384 = NameAndType        #382:#383    // current:()Ljava/util/concurrent/ThreadLocalRandom;
   #385 = Methodref          #381.#384    // java/util/concurrent/ThreadLocalRandom.current:()Ljava/util/concurrent/ThreadLocalRandom;
   #386 = Double             -0.05d
   #388 = Double             0.05d
   #390 = Utf8               nextDouble
   #391 = NameAndType        #390:#205    // nextDouble:(DD)D
   #392 = Methodref          #381.#391    // java/util/concurrent/ThreadLocalRandom.nextDouble:(DD)D
   #393 = Utf8               clear
   #394 = NameAndType        #393:#10     // clear:()V
   #395 = Methodref          #37.#394     // java/util/ArrayDeque.clear:()V
   #396 = Utf8               _blocked
   #397 = NameAndType        #396:#91     // _blocked:Z
   #398 = Fieldref           #2.#397      // ext/mods/gameserver/model/actor/move/CreatureMove._blocked:Z
   #399 = Utf8               distance3D
   #400 = NameAndType        #399:#273    // distance3D:(Lext/mods/gameserver/model/location/Location;)D
   #401 = Methodref          #27.#400     // ext/mods/gameserver/model/WorldObject.distance3D:(Lext/mods/gameserver/model/location/Location;)D
   #402 = Double             300.0d
   #404 = Utf8               SISTEMA_PATHFINDING
   #405 = NameAndType        #404:#91     // SISTEMA_PATHFINDING:Z
   #406 = Fieldref           #109.#405    // ext/mods/Config.SISTEMA_PATHFINDING:Z
   #407 = Methodref          #18.#185     // ext/mods/gameserver/model/location/Location.getX:()I
   #408 = Methodref          #18.#188     // ext/mods/gameserver/model/location/Location.getY:()I
   #409 = Methodref          #18.#30      // ext/mods/gameserver/model/location/Location.getZ:()I
   #410 = Utf8               calculatePath
   #411 = Utf8               (IIIIII)Lext/mods/gameserver/model/location/Location;
   #412 = NameAndType        #410:#411    // calculatePath:(IIIIII)Lext/mods/gameserver/model/location/Location;
   #413 = Methodref          #2.#412      // ext/mods/gameserver/model/actor/move/CreatureMove.calculatePath:(IIIIII)Lext/mods/gameserver/model/location/Location;
   #414 = Utf8               getPosition
   #415 = Utf8               ()Lext/mods/gameserver/model/location/SpawnLocation;
   #416 = NameAndType        #414:#415    // getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
   #417 = Methodref          #27.#416     // ext/mods/gameserver/model/WorldObject.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
   #418 = Utf8               ext/mods/gameserver/model/location/SpawnLocation
   #419 = Class              #418         // ext/mods/gameserver/model/location/SpawnLocation
   #420 = Utf8               setHeadingTo
   #421 = NameAndType        #420:#359    // setHeadingTo:(Lext/mods/gameserver/model/location/Location;)V
   #422 = Methodref          #419.#421    // ext/mods/gameserver/model/location/SpawnLocation.setHeadingTo:(Lext/mods/gameserver/model/location/Location;)V
   #423 = Utf8               registerMoveTask
   #424 = NameAndType        #423:#10     // registerMoveTask:()V
   #425 = Methodref          #2.#424      // ext/mods/gameserver/model/actor/move/CreatureMove.registerMoveTask:()V
   #426 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/location/Location;)V
   #427 = NameAndType        #6:#426      // "<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/location/Location;)V
   #428 = Methodref          #75.#427     // ext/mods/gameserver/network/serverpackets/MoveToLocation."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/location/Location;)V
   #429 = Utf8               broadcastPacket
   #430 = NameAndType        #429:#83     // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #431 = Methodref          #142.#430    // ext/mods/gameserver/model/actor/Creature.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #432 = Utf8               _followTask
   #433 = NameAndType        #432:#67     // _followTask:Ljava/util/concurrent/ScheduledFuture;
   #434 = Fieldref           #2.#433      // ext/mods/gameserver/model/actor/move/CreatureMove._followTask:Ljava/util/concurrent/ScheduledFuture;
   #435 = Utf8               altPos
   #436 = Utf8               nextLoc
   #437 = Utf8               dist3D
   #438 = Utf8               destination
   #439 = Utf8               pathfinding
   #440 = Utf8               forceMoveToLocation
   #441 = NameAndType        #310:#311    // moveToLocation:(Lext/mods/gameserver/model/location/Location;Z)V
   #442 = Methodref          #2.#441      // ext/mods/gameserver/model/actor/move/CreatureMove.moveToLocation:(Lext/mods/gameserver/model/location/Location;Z)V
   #443 = Double             2.2d
   #445 = Utf8               $i$a$-any-CreatureMove$wouldCollideInPath$1
   #446 = Utf8               neighbor
   #447 = Utf8               checkDist
   #448 = Utf8               MOVEMENT_UPDATE_INTERVAL
   #449 = NameAndType        #448:#134    // MOVEMENT_UPDATE_INTERVAL:J
   #450 = Fieldref           #2.#449      // ext/mods/gameserver/model/actor/move/CreatureMove.MOVEMENT_UPDATE_INTERVAL:J
   #451 = MethodType         #10          //  ()V
   #452 = Utf8               registerMoveTask$lambda$0
   #453 = Utf8               (Lext/mods/gameserver/model/actor/move/CreatureMove;)V
   #454 = NameAndType        #452:#453    // registerMoveTask$lambda$0:(Lext/mods/gameserver/model/actor/move/CreatureMove;)V
   #455 = Methodref          #2.#454      // ext/mods/gameserver/model/actor/move/CreatureMove.registerMoveTask$lambda$0:(Lext/mods/gameserver/model/actor/move/CreatureMove;)V
   #456 = MethodHandle       6:#455       // REF_invokeStatic ext/mods/gameserver/model/actor/move/CreatureMove.registerMoveTask$lambda$0:(Lext/mods/gameserver/model/actor/move/CreatureMove;)V
   #457 = Utf8               java/lang/invoke/LambdaMetafactory
   #458 = Class              #457         // java/lang/invoke/LambdaMetafactory
   #459 = Utf8               metafactory
   #460 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
   #461 = NameAndType        #459:#460    // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
   #462 = Methodref          #458.#461    // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
   #463 = MethodHandle       6:#462       // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
   #464 = Utf8               run
   #465 = Utf8               (Lext/mods/gameserver/model/actor/move/CreatureMove;)Ljava/lang/Runnable;
   #466 = NameAndType        #464:#465    // run:(Lext/mods/gameserver/model/actor/move/CreatureMove;)Ljava/lang/Runnable;
   #467 = InvokeDynamic      #0:#466      // #0:run:(Lext/mods/gameserver/model/actor/move/CreatureMove;)Ljava/lang/Runnable;
   #468 = Utf8               ext/mods/commons/pool/CoroutinePool
   #469 = Class              #468         // ext/mods/commons/pool/CoroutinePool
   #470 = Utf8               scheduleAtFixedRate
   #471 = Utf8               (Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #472 = NameAndType        #470:#471    // scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #473 = Methodref          #469.#472    // ext/mods/commons/pool/CoroutinePool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #474 = Utf8               interval
   #475 = Utf8               shouldStopMovementTask
   #476 = Utf8               hasVisiblePlayers
   #477 = NameAndType        #476:#89     // hasVisiblePlayers:()Z
   #478 = Methodref          #2.#477      // ext/mods/gameserver/model/actor/move/CreatureMove.hasVisiblePlayers:()Z
   #479 = Utf8               _pausedByNoPlayers
   #480 = NameAndType        #479:#91     // _pausedByNoPlayers:Z
   #481 = Fieldref           #2.#480      // ext/mods/gameserver/model/actor/move/CreatureMove._pausedByNoPlayers:Z
   #482 = NameAndType        #6:#359      // "<init>":(Lext/mods/gameserver/model/location/Location;)V
   #483 = Methodref          #18.#482     // ext/mods/gameserver/model/location/Location."<init>":(Lext/mods/gameserver/model/location/Location;)V
   #484 = Utf8               _pausedDestination
   #485 = NameAndType        #484:#23     // _pausedDestination:Lext/mods/gameserver/model/location/Location;
   #486 = Fieldref           #2.#485      // ext/mods/gameserver/model/actor/move/CreatureMove._pausedDestination:Lext/mods/gameserver/model/location/Location;
   #487 = Utf8               startResumeCheckTask
   #488 = NameAndType        #487:#10     // startResumeCheckTask:()V
   #489 = Methodref          #2.#488      // ext/mods/gameserver/model/actor/move/CreatureMove.startResumeCheckTask:()V
   #490 = Utf8               finishMovement
   #491 = Utf8               cancelMoveTask
   #492 = NameAndType        #491:#10     // cancelMoveTask:()V
   #493 = Methodref          #2.#492      // ext/mods/gameserver/model/actor/move/CreatureMove.cancelMoveTask:()V
   #494 = Utf8               revalidateZone
   #495 = NameAndType        #494:#95     // revalidateZone:(Z)V
   #496 = Methodref          #142.#495    // ext/mods/gameserver/model/actor/Creature.revalidateZone:(Z)V
   #497 = Utf8               ext/mods/gameserver/network/serverpackets/StopMove
   #498 = Class              #497         // ext/mods/gameserver/network/serverpackets/StopMove
   #499 = Methodref          #498.#76     // ext/mods/gameserver/network/serverpackets/StopMove."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
   #500 = Utf8               ext/mods/gameserver/enums/AiEventType
   #501 = Class              #500         // ext/mods/gameserver/enums/AiEventType
   #502 = Utf8               ARRIVED_BLOCKED
   #503 = Utf8               Lext/mods/gameserver/enums/AiEventType;
   #504 = NameAndType        #502:#503    // ARRIVED_BLOCKED:Lext/mods/gameserver/enums/AiEventType;
   #505 = Fieldref           #501.#504    // ext/mods/gameserver/enums/AiEventType.ARRIVED_BLOCKED:Lext/mods/gameserver/enums/AiEventType;
   #506 = Utf8               ARRIVED
   #507 = NameAndType        #506:#503    // ARRIVED:Lext/mods/gameserver/enums/AiEventType;
   #508 = Fieldref           #501.#507    // ext/mods/gameserver/enums/AiEventType.ARRIVED:Lext/mods/gameserver/enums/AiEventType;
   #509 = Utf8               notifyArrived
   #510 = Utf8               (Lext/mods/gameserver/enums/AiEventType;)V
   #511 = NameAndType        #509:#510    // notifyArrived:(Lext/mods/gameserver/enums/AiEventType;)V
   #512 = Methodref          #2.#511      // ext/mods/gameserver/model/actor/move/CreatureMove.notifyArrived:(Lext/mods/gameserver/enums/AiEventType;)V
   #513 = Utf8               getAI
   #514 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
   #515 = NameAndType        #513:#514    // getAI:()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
   #516 = Methodref          #342.#515    // ext/mods/gameserver/model/actor/Npc.getAI:()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
   #517 = Utf8               ext/mods/gameserver/model/actor/ai/type/NpcAI
   #518 = Class              #517         // ext/mods/gameserver/model/actor/ai/type/NpcAI
   #519 = Utf8               getCurrentIntention
   #520 = Utf8               ()Lext/mods/gameserver/model/actor/ai/Intention;
   #521 = NameAndType        #519:#520    // getCurrentIntention:()Lext/mods/gameserver/model/actor/ai/Intention;
   #522 = Methodref          #518.#521    // ext/mods/gameserver/model/actor/ai/type/NpcAI.getCurrentIntention:()Lext/mods/gameserver/model/actor/ai/Intention;
   #523 = Utf8               ext/mods/gameserver/model/actor/ai/Intention
   #524 = Class              #523         // ext/mods/gameserver/model/actor/ai/Intention
   #525 = Utf8               getType
   #526 = Utf8               ()Lext/mods/gameserver/enums/IntentionType;
   #527 = NameAndType        #525:#526    // getType:()Lext/mods/gameserver/enums/IntentionType;
   #528 = Methodref          #524.#527    // ext/mods/gameserver/model/actor/ai/Intention.getType:()Lext/mods/gameserver/enums/IntentionType;
   #529 = Utf8               ext/mods/gameserver/enums/IntentionType
   #530 = Class              #529         // ext/mods/gameserver/enums/IntentionType
   #531 = Utf8               ATTACK
   #532 = Utf8               Lext/mods/gameserver/enums/IntentionType;
   #533 = NameAndType        #531:#532    // ATTACK:Lext/mods/gameserver/enums/IntentionType;
   #534 = Fieldref           #530.#533    // ext/mods/gameserver/enums/IntentionType.ATTACK:Lext/mods/gameserver/enums/IntentionType;
   #535 = Utf8               THINK
   #536 = NameAndType        #535:#503    // THINK:Lext/mods/gameserver/enums/AiEventType;
   #537 = Fieldref           #501.#536    // ext/mods/gameserver/enums/AiEventType.THINK:Lext/mods/gameserver/enums/AiEventType;
   #538 = Utf8               notifyEvent
   #539 = Utf8               (Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
   #540 = NameAndType        #538:#539    // notifyEvent:(Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
   #541 = Methodref          #518.#540    // ext/mods/gameserver/model/actor/ai/type/NpcAI.notifyEvent:(Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
   #542 = Utf8               wasMoving
   #543 = Utf8               _lastArrivedEventTime
   #544 = NameAndType        #543:#134    // _lastArrivedEventTime:J
   #545 = Fieldref           #2.#544      // ext/mods/gameserver/model/actor/move/CreatureMove._lastArrivedEventTime:J
   #546 = Long               200l
   #548 = Utf8               getFinalTarget
   #549 = Utf8               ()Lext/mods/gameserver/model/actor/Creature;
   #550 = NameAndType        #548:#549    // getFinalTarget:()Lext/mods/gameserver/model/actor/Creature;
   #551 = Methodref          #524.#550    // ext/mods/gameserver/model/actor/ai/Intention.getFinalTarget:()Lext/mods/gameserver/model/actor/Creature;
   #552 = Utf8               knows
   #553 = Utf8               (Lext/mods/gameserver/model/WorldObject;)Z
   #554 = NameAndType        #552:#553    // knows:(Lext/mods/gameserver/model/WorldObject;)Z
   #555 = Methodref          #142.#554    // ext/mods/gameserver/model/actor/Creature.knows:(Lext/mods/gameserver/model/WorldObject;)Z
   #556 = Utf8               notifyArrived$lambda$0
   #557 = NameAndType        #556:#453    // notifyArrived$lambda$0:(Lext/mods/gameserver/model/actor/move/CreatureMove;)V
   #558 = Methodref          #2.#557      // ext/mods/gameserver/model/actor/move/CreatureMove.notifyArrived$lambda$0:(Lext/mods/gameserver/model/actor/move/CreatureMove;)V
   #559 = MethodHandle       6:#558       // REF_invokeStatic ext/mods/gameserver/model/actor/move/CreatureMove.notifyArrived$lambda$0:(Lext/mods/gameserver/model/actor/move/CreatureMove;)V
   #560 = InvokeDynamic      #1:#466      // #1:run:(Lext/mods/gameserver/model/actor/move/CreatureMove;)Ljava/lang/Runnable;
   #561 = Long               10l
   #563 = Utf8               schedule
   #564 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #565 = NameAndType        #563:#564    // schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #566 = Methodref          #469.#565    // ext/mods/commons/pool/CoroutinePool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #567 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
   #568 = NameAndType        #513:#567    // getAI:()Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
   #569 = Methodref          #142.#568    // ext/mods/gameserver/model/actor/Creature.getAI:()Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
   #570 = Utf8               ext/mods/gameserver/model/actor/ai/type/CreatureAI
   #571 = Class              #570         // ext/mods/gameserver/model/actor/ai/type/CreatureAI
   #572 = Methodref          #571.#540    // ext/mods/gameserver/model/actor/ai/type/CreatureAI.notifyEvent:(Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
   #573 = Utf8               intention
   #574 = Utf8               Lext/mods/gameserver/model/actor/ai/Intention;
   #575 = Utf8               event
   #576 = Utf8               repositionAfterAttack
   #577 = Utf8               isMovementDisabled
   #578 = NameAndType        #577:#89     // isMovementDisabled:()Z
   #579 = Methodref          #142.#578    // ext/mods/gameserver/model/actor/Creature.isMovementDisabled:()Z
   #580 = Utf8               isParalyzed
   #581 = NameAndType        #580:#89     // isParalyzed:()Z
   #582 = Methodref          #142.#581    // ext/mods/gameserver/model/actor/Creature.isParalyzed:()Z
   #583 = Utf8               (Lext/mods/gameserver/model/WorldObject;)D
   #584 = NameAndType        #272:#583    // distance2D:(Lext/mods/gameserver/model/WorldObject;)D
   #585 = Methodref          #27.#584     // ext/mods/gameserver/model/WorldObject.distance2D:(Lext/mods/gameserver/model/WorldObject;)D
   #586 = Utf8               getCast
   #587 = Utf8               ()Lext/mods/gameserver/model/actor/cast/CreatureCast;
   #588 = NameAndType        #586:#587    // getCast:()Lext/mods/gameserver/model/actor/cast/CreatureCast;
   #589 = Methodref          #142.#588    // ext/mods/gameserver/model/actor/Creature.getCast:()Lext/mods/gameserver/model/actor/cast/CreatureCast;
   #590 = Utf8               ext/mods/gameserver/model/actor/cast/CreatureCast
   #591 = Class              #590         // ext/mods/gameserver/model/actor/cast/CreatureCast
   #592 = Utf8               getCurrentSkill
   #593 = Utf8               ()Lext/mods/gameserver/skills/L2Skill;
   #594 = NameAndType        #592:#593    // getCurrentSkill:()Lext/mods/gameserver/skills/L2Skill;
   #595 = Methodref          #591.#594    // ext/mods/gameserver/model/actor/cast/CreatureCast.getCurrentSkill:()Lext/mods/gameserver/skills/L2Skill;
   #596 = Utf8               ext/mods/gameserver/skills/L2Skill
   #597 = Class              #596         // ext/mods/gameserver/skills/L2Skill
   #598 = Utf8               getCastRange
   #599 = NameAndType        #598:#29     // getCastRange:()I
   #600 = Methodref          #597.#599    // ext/mods/gameserver/skills/L2Skill.getCastRange:()I
   #601 = Utf8               ()Lext/mods/gameserver/model/actor/status/CreatureStatus;
   #602 = NameAndType        #117:#601    // getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
   #603 = Methodref          #142.#602    // ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
   #604 = Utf8               ext/mods/gameserver/model/actor/status/CreatureStatus
   #605 = Class              #604         // ext/mods/gameserver/model/actor/status/CreatureStatus
   #606 = Methodref          #605.#124    // ext/mods/gameserver/model/actor/status/CreatureStatus.getPhysicalAttackRange:()I
   #607 = Double             200.0d
   #609 = Methodref          #419.#30     // ext/mods/gameserver/model/location/SpawnLocation.getZ:()I
   #610 = Methodref          #419.#185    // ext/mods/gameserver/model/location/SpawnLocation.getX:()I
   #611 = Methodref          #419.#188    // ext/mods/gameserver/model/location/SpawnLocation.getY:()I
   #612 = Utf8               wouldCollideWithCreature
   #613 = Utf8               (II)Z
   #614 = NameAndType        #612:#613    // wouldCollideWithCreature:(II)Z
   #615 = Methodref          #2.#614      // ext/mods/gameserver/model/actor/move/CreatureMove.wouldCollideWithCreature:(II)Z
   #616 = Utf8               nextBoolean
   #617 = NameAndType        #616:#89     // nextBoolean:()Z
   #618 = Methodref          #381.#617    // java/util/concurrent/ThreadLocalRandom.nextBoolean:()Z
   #619 = Double             45.0d
   #621 = Double             -45.0d
   #623 = Utf8               getHeading
   #624 = NameAndType        #623:#29     // getHeading:()I
   #625 = Methodref          #419.#624    // ext/mods/gameserver/model/location/SpawnLocation.getHeading:()I
   #626 = Double             0.005493247882810712d
   #628 = Utf8               dx
   #629 = Utf8               dy
   #630 = Utf8               angle
   #631 = Utf8               nextX
   #632 = Utf8               nextY
   #633 = Utf8               nextZ
   #634 = Utf8               escapeDest
   #635 = Utf8               dist
   #636 = Utf8               currentSkill
   #637 = Utf8               Lext/mods/gameserver/skills/L2Skill;
   #638 = Utf8               baseAttackRange
   #639 = Utf8               collisionBuffer
   #640 = Utf8               currentLoc
   #641 = Utf8               Lext/mods/gameserver/model/location/SpawnLocation;
   #642 = Utf8               tooCloseThreshold
   #643 = Utf8               angleOffset
   #644 = Utf8               newAngle
   #645 = Utf8               latX
   #646 = Utf8               latY
   #647 = Utf8               latZ
   #648 = Utf8               lateralDest
   #649 = Utf8               moveToNextRoutePoint
   #650 = Methodref          #37.#248     // java/util/ArrayDeque.isEmpty:()Z
   #651 = Utf8               poll
   #652 = NameAndType        #651:#260    // poll:()Ljava/lang/Object;
   #653 = Methodref          #37.#652     // java/util/ArrayDeque.poll:()Ljava/lang/Object;
   #654 = Utf8               ext/mods/gameserver/model/actor/Playable
   #655 = Class              #654         // ext/mods/gameserver/model/actor/Playable
   #656 = Utf8               updatePosition
   #657 = Utf8               isVisible
   #658 = NameAndType        #657:#89     // isVisible:()Z
   #659 = Methodref          #27.#658     // ext/mods/gameserver/model/WorldObject.isVisible:()Z
   #660 = NameAndType        #157:#158    // getMoveType:()Lext/mods/gameserver/enums/actors/MoveType;
   #661 = Methodref          #2.#660      // ext/mods/gameserver/model/actor/move/CreatureMove.getMoveType:()Lext/mods/gameserver/enums/actors/MoveType;
   #662 = Utf8               setZ
   #663 = Utf8               (I)V
   #664 = NameAndType        #662:#663    // setZ:(I)V
   #665 = Methodref          #18.#664     // ext/mods/gameserver/model/location/Location.setZ:(I)V
   #666 = Utf8               getMoveSpeed
   #667 = Utf8               ()F
   #668 = NameAndType        #666:#667    // getMoveSpeed:()F
   #669 = Methodref          #605.#668    // ext/mods/gameserver/model/actor/status/CreatureStatus.getMoveSpeed:()F
   #670 = Utf8               calculateRepulsion
   #671 = NameAndType        #670:#10     // calculateRepulsion:()V
   #672 = Methodref          #2.#671      // ext/mods/gameserver/model/actor/move/CreatureMove.calculateRepulsion:()V
   #673 = Utf8               handleNextPosition
   #674 = Utf8               (IIILext/mods/gameserver/enums/actors/MoveType;)Z
   #675 = NameAndType        #673:#674    // handleNextPosition:(IIILext/mods/gameserver/enums/actors/MoveType;)Z
   #676 = Methodref          #2.#675      // ext/mods/gameserver/model/actor/move/CreatureMove.handleNextPosition:(IIILext/mods/gameserver/enums/actors/MoveType;)Z
   #677 = Utf8               checkArrival
   #678 = Utf8               (Lext/mods/gameserver/enums/actors/MoveType;)Z
   #679 = NameAndType        #677:#678    // checkArrival:(Lext/mods/gameserver/enums/actors/MoveType;)Z
   #680 = Methodref          #2.#679      // ext/mods/gameserver/model/actor/move/CreatureMove.checkArrival:(Lext/mods/gameserver/enums/actors/MoveType;)Z
   #681 = Utf8               sqrt
   #682 = NameAndType        #681:#209    // sqrt:(D)D
   #683 = Methodref          #203.#682    // java/lang/Math.sqrt:(D)D
   #684 = Utf8               _separationForceX
   #685 = NameAndType        #684:#33     // _separationForceX:D
   #686 = Fieldref           #2.#685      // ext/mods/gameserver/model/actor/move/CreatureMove._separationForceX:D
   #687 = Utf8               _separationForceY
   #688 = NameAndType        #687:#33     // _separationForceY:D
   #689 = Fieldref           #2.#688      // ext/mods/gameserver/model/actor/move/CreatureMove._separationForceY:D
   #690 = Utf8               abs
   #691 = NameAndType        #690:#209    // abs:(D)D
   #692 = Methodref          #203.#691    // java/lang/Math.abs:(D)D
   #693 = Double             0.1d
   #695 = Double             100.0d
   #697 = Double             400.0d
   #699 = Long               300l
   #701 = Utf8               tryRecalculatePathWithoutRetreat
   #702 = NameAndType        #701:#89     // tryRecalculatePathWithoutRetreat:()Z
   #703 = Methodref          #2.#702      // ext/mods/gameserver/model/actor/move/CreatureMove.tryRecalculatePathWithoutRetreat:()Z
   #704 = Utf8               finalZ
   #705 = Utf8               hasRepulsion
   #706 = Utf8               timeSinceLastSync
   #707 = Utf8               driftSq
   #708 = Utf8               curZ
   #709 = Utf8               moveSpeed
   #710 = Utf8               distSq
   #711 = Utf8               fraction
   #712 = Utf8               moveX
   #713 = Utf8               moveY
   #714 = Utf8               nextXAccurate
   #715 = Utf8               nextYAccurate
   #716 = Double             3.0d
   #718 = Utf8               (Ljava/lang/Object;)V
   #719 = MethodType         #718         //  (Ljava/lang/Object;)V
   #720 = Utf8               calculateRepulsion$lambda$0
   #721 = Utf8               (Lext/mods/gameserver/model/actor/move/CreatureMove;IDLext/mods/gameserver/model/actor/Creature;)V
   #722 = NameAndType        #720:#721    // calculateRepulsion$lambda$0:(Lext/mods/gameserver/model/actor/move/CreatureMove;IDLext/mods/gameserver/model/actor/Creature;)V
   #723 = Methodref          #2.#722      // ext/mods/gameserver/model/actor/move/CreatureMove.calculateRepulsion$lambda$0:(Lext/mods/gameserver/model/actor/move/CreatureMove;IDLext/mods/gameserver/model/actor/Creature;)V
   #724 = MethodHandle       6:#723       // REF_invokeStatic ext/mods/gameserver/model/actor/move/CreatureMove.calculateRepulsion$lambda$0:(Lext/mods/gameserver/model/actor/move/CreatureMove;IDLext/mods/gameserver/model/actor/Creature;)V
   #725 = MethodType         #7           //  (Lext/mods/gameserver/model/actor/Creature;)V
   #726 = Utf8               accept
   #727 = Utf8               (Lext/mods/gameserver/model/actor/move/CreatureMove;ID)Ljava/util/function/Consumer;
   #728 = NameAndType        #726:#727    // accept:(Lext/mods/gameserver/model/actor/move/CreatureMove;ID)Ljava/util/function/Consumer;
   #729 = InvokeDynamic      #2:#728      // #2:accept:(Lext/mods/gameserver/model/actor/move/CreatureMove;ID)Ljava/util/function/Consumer;
   #730 = Utf8               forEachKnownTypeInRadius
   #731 = Utf8               (Ljava/lang/Class;ILjava/util/function/Consumer;)V
   #732 = NameAndType        #730:#731    // forEachKnownTypeInRadius:(Ljava/lang/Class;ILjava/util/function/Consumer;)V
   #733 = Methodref          #27.#732     // ext/mods/gameserver/model/WorldObject.forEachKnownTypeInRadius:(Ljava/lang/Class;ILjava/util/function/Consumer;)V
   #734 = Double             8.0d
   #736 = Utf8               scale
   #737 = Utf8               checkRadius
   #738 = Utf8               minSeparationDistance
   #739 = Utf8               totalForce
   #740 = Utf8               maxTotalForce
   #741 = Utf8               setXYZ
   #742 = NameAndType        #741:#19     // setXYZ:(III)V
   #743 = Methodref          #27.#742     // ext/mods/gameserver/model/WorldObject.setXYZ:(III)V
   #744 = Utf8               [MeleeDebug][CreatureMove][calculatePath] actor={} from=({}, {}, {}) to=({}, {}, {})
   #745 = String             #744         // [MeleeDebug][CreatureMove][calculatePath] actor={} from=({}, {}, {}) to=({}, {}, {})
   #746 = Utf8               findPath
   #747 = Utf8               (IIIIIIZLext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
   #748 = NameAndType        #746:#747    // findPath:(IIIIIIZLext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
   #749 = Methodref          #228.#748    // ext/mods/gameserver/geoengine/GeoEngine.findPath:(IIIIIIZLext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
   #750 = Utf8               java/util/List
   #751 = Class              #750         // java/util/List
   #752 = Utf8               size
   #753 = NameAndType        #752:#29     // size:()I
   #754 = InterfaceMethodref #751.#753    // java/util/List.size:()I
   #755 = NameAndType        #107:#10     // addGeoPathFailCount:()V
   #756 = Methodref          #2.#755      // ext/mods/gameserver/model/actor/move/CreatureMove.addGeoPathFailCount:()V
   #757 = NameAndType        #106:#10     // resetGeoPathFailCount:()V
   #758 = Methodref          #2.#757      // ext/mods/gameserver/model/actor/move/CreatureMove.resetGeoPathFailCount:()V
   #759 = Utf8               addAll
   #760 = Utf8               (Ljava/util/Collection;)Z
   #761 = NameAndType        #759:#760    // addAll:(Ljava/util/Collection;)Z
   #762 = Methodref          #37.#761     // java/util/ArrayDeque.addAll:(Ljava/util/Collection;)Z
   #763 = Utf8               path
   #764 = Utf8               Ljava/util/List;
   #765 = Utf8               ox
   #766 = Utf8               oy
   #767 = Utf8               oz
   #768 = Utf8               tx
   #769 = Utf8               ty
   #770 = Utf8               tz
   #771 = Utf8               maybeStartOffensiveFollow
   #772 = Utf8               (Lext/mods/gameserver/model/actor/Creature;I)Z
   #773 = Utf8               [MeleeDebug][CreatureMove][maybeStartOffensiveFollow] actor={} target={} range={} dist={}
   #774 = String             #773         // [MeleeDebug][CreatureMove][maybeStartOffensiveFollow] actor={} target={} range={} dist={}
   #775 = Methodref          #142.#192    // ext/mods/gameserver/model/actor/Creature.getObjectId:()I
   #776 = Utf8               java/lang/Double
   #777 = Class              #776         // java/lang/Double
   #778 = Utf8               (D)Ljava/lang/Double;
   #779 = NameAndType        #322:#778    // valueOf:(D)Ljava/lang/Double;
   #780 = Methodref          #777.#779    // java/lang/Double.valueOf:(D)Ljava/lang/Double;
   #781 = Utf8               isMoving
   #782 = NameAndType        #781:#89     // isMoving:()Z
   #783 = Methodref          #142.#782    // ext/mods/gameserver/model/actor/Creature.isMoving:()Z
   #784 = Utf8               stop
   #785 = NameAndType        #784:#10     // stop:()V
   #786 = Methodref          #2.#785      // ext/mods/gameserver/model/actor/move/CreatureMove.stop:()V
   #787 = Methodref          #571.#521    // ext/mods/gameserver/model/actor/ai/type/CreatureAI.getCurrentIntention:()Lext/mods/gameserver/model/actor/ai/Intention;
   #788 = NameAndType        #233:#89     // canMoveToTarget:()Z
   #789 = Methodref          #524.#788    // ext/mods/gameserver/model/actor/ai/Intention.canMoveToTarget:()Z
   #790 = Double             0.8d
   #792 = Double             0.9d
   #794 = Utf8               startOffensiveFollow
   #795 = Utf8               (Lext/mods/gameserver/model/actor/Creature;I)V
   #796 = NameAndType        #794:#795    // startOffensiveFollow:(Lext/mods/gameserver/model/actor/Creature;I)V
   #797 = Methodref          #2.#796      // ext/mods/gameserver/model/actor/move/CreatureMove.startOffensiveFollow:(Lext/mods/gameserver/model/actor/Creature;I)V
   #798 = Utf8               safetyMargin
   #799 = Utf8               targetOffset
   #800 = Utf8               collision
   #801 = Utf8               totalRange
   #802 = Utf8               range
   #803 = NameAndType        #349:#718    // checkNotNull:(Ljava/lang/Object;)V
   #804 = Methodref          #264.#803    // kotlin/jvm/internal/Intrinsics.checkNotNull:(Ljava/lang/Object;)V
   #805 = Utf8               java/util/concurrent/ScheduledFuture
   #806 = Class              #805         // java/util/concurrent/ScheduledFuture
   #807 = Utf8               isDone
   #808 = NameAndType        #807:#89     // isDone:()Z
   #809 = InterfaceMethodref #806.#808    // java/util/concurrent/ScheduledFuture.isDone:()Z
   #810 = Utf8               isCancelled
   #811 = NameAndType        #810:#89     // isCancelled:()Z
   #812 = InterfaceMethodref #806.#811    // java/util/concurrent/ScheduledFuture.isCancelled:()Z
   #813 = Utf8               [MeleeDebug][CreatureMove][startOffensiveFollow] actor={} target={} offset={}
   #814 = String             #813         // [MeleeDebug][CreatureMove][startOffensiveFollow] actor={} target={} offset={}
   #815 = Utf8               cancelFollowTask
   #816 = NameAndType        #815:#10     // cancelFollowTask:()V
   #817 = Methodref          #2.#816      // ext/mods/gameserver/model/actor/move/CreatureMove.cancelFollowTask:()V
   #818 = Utf8               startOffensiveFollow$lambda$0
   #819 = Utf8               (Lext/mods/gameserver/model/actor/move/CreatureMove;Lext/mods/gameserver/model/actor/Creature;I)V
   #820 = NameAndType        #818:#819    // startOffensiveFollow$lambda$0:(Lext/mods/gameserver/model/actor/move/CreatureMove;Lext/mods/gameserver/model/actor/Creature;I)V
   #821 = Methodref          #2.#820      // ext/mods/gameserver/model/actor/move/CreatureMove.startOffensiveFollow$lambda$0:(Lext/mods/gameserver/model/actor/move/CreatureMove;Lext/mods/gameserver/model/actor/Creature;I)V
   #822 = MethodHandle       6:#821       // REF_invokeStatic ext/mods/gameserver/model/actor/move/CreatureMove.startOffensiveFollow$lambda$0:(Lext/mods/gameserver/model/actor/move/CreatureMove;Lext/mods/gameserver/model/actor/Creature;I)V
   #823 = Utf8               (Lext/mods/gameserver/model/actor/move/CreatureMove;Lext/mods/gameserver/model/actor/Creature;I)Ljava/lang/Runnable;
   #824 = NameAndType        #464:#823    // run:(Lext/mods/gameserver/model/actor/move/CreatureMove;Lext/mods/gameserver/model/actor/Creature;I)Ljava/lang/Runnable;
   #825 = InvokeDynamic      #3:#824      // #3:run:(Lext/mods/gameserver/model/actor/move/CreatureMove;Lext/mods/gameserver/model/actor/Creature;I)Ljava/lang/Runnable;
   #826 = Utf8               pawn
   #827 = Utf8               offset
   #828 = Utf8               offensiveFollowTask
   #829 = Utf8               [MeleeDebug][CreatureMove][offensiveFollowTask] actor={} target={} dist={} range={}
   #830 = String             #829         // [MeleeDebug][CreatureMove][offensiveFollowTask] actor={} target={} dist={} range={}
   #831 = Methodref          #142.#416    // ext/mods/gameserver/model/actor/Creature.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
   #832 = Double             32.0d
   #834 = Utf8               (Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Z
   #835 = NameAndType        #233:#834    // canMoveToTarget:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Z
   #836 = Methodref          #228.#835    // ext/mods/gameserver/geoengine/GeoEngine.canMoveToTarget:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Z
   #837 = Utf8               getValidLocation
   #838 = Utf8               (Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/location/Location;
   #839 = NameAndType        #837:#838    // getValidLocation:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/location/Location;
   #840 = Methodref          #228.#839    // ext/mods/gameserver/geoengine/GeoEngine.getValidLocation:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/location/Location;
   #841 = Utf8               movePos
   #842 = Utf8               currentTask
   #843 = Utf8               targetPos
   #844 = Utf8               startFriendlyFollow
   #845 = Utf8               startFriendlyFollow$lambda$0
   #846 = NameAndType        #845:#819    // startFriendlyFollow$lambda$0:(Lext/mods/gameserver/model/actor/move/CreatureMove;Lext/mods/gameserver/model/actor/Creature;I)V
   #847 = Methodref          #2.#846      // ext/mods/gameserver/model/actor/move/CreatureMove.startFriendlyFollow$lambda$0:(Lext/mods/gameserver/model/actor/move/CreatureMove;Lext/mods/gameserver/model/actor/Creature;I)V
   #848 = MethodHandle       6:#847       // REF_invokeStatic ext/mods/gameserver/model/actor/move/CreatureMove.startFriendlyFollow$lambda$0:(Lext/mods/gameserver/model/actor/move/CreatureMove;Lext/mods/gameserver/model/actor/Creature;I)V
   #849 = InvokeDynamic      #4:#824      // #4:run:(Lext/mods/gameserver/model/actor/move/CreatureMove;Lext/mods/gameserver/model/actor/Creature;I)Ljava/lang/Runnable;
   #850 = Long               1000l
   #852 = Utf8               friendlyFollowTask
   #853 = Double             64.0d
   #855 = Utf8               wasFollowing
   #856 = Utf8               cancel
   #857 = Utf8               (Z)Z
   #858 = NameAndType        #856:#857    // cancel:(Z)Z
   #859 = InterfaceMethodref #806.#858    // java/util/concurrent/ScheduledFuture.cancel:(Z)Z
   #860 = Utf8               isOnLastPawnMoveGeoPath
   #861 = Utf8               avoidAttack
   #862 = Utf8               attacker
   #863 = Utf8               maybeStartFriendlyFollow
   #864 = NameAndType        #844:#795    // startFriendlyFollow:(Lext/mods/gameserver/model/actor/Creature;I)V
   #865 = Methodref          #2.#864      // ext/mods/gameserver/model/actor/move/CreatureMove.startFriendlyFollow:(Lext/mods/gameserver/model/actor/Creature;I)V
   #866 = Utf8               maybeMoveToLocation
   #867 = Utf8               (Lext/mods/gameserver/model/location/Location;IZZ)Z
   #868 = Utf8               isIn3DRadius
   #869 = Utf8               (Lext/mods/gameserver/model/location/Location;I)Z
   #870 = NameAndType        #868:#869    // isIn3DRadius:(Lext/mods/gameserver/model/location/Location;I)Z
   #871 = Methodref          #27.#870     // ext/mods/gameserver/model/WorldObject.isIn3DRadius:(Lext/mods/gameserver/model/location/Location;I)Z
   #872 = Utf8               isShiftPressed
   #873 = Utf8               isIn2DRadius
   #874 = Utf8               (Lext/mods/gameserver/model/WorldObject;I)Z
   #875 = NameAndType        #873:#874    // isIn2DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
   #876 = Methodref          #27.#875     // ext/mods/gameserver/model/WorldObject.isIn2DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
   #877 = Utf8               (I)I
   #878 = NameAndType        #690:#877    // abs:(I)I
   #879 = Methodref          #203.#878    // java/lang/Math.abs:(I)I
   #880 = Utf8               kotlin/collections/CollectionsKt
   #881 = Class              #880         // kotlin/collections/CollectionsKt
   #882 = Utf8               lastOrNull
   #883 = Utf8               (Ljava/lang/Iterable;)Ljava/lang/Object;
   #884 = NameAndType        #882:#883    // lastOrNull:(Ljava/lang/Iterable;)Ljava/lang/Object;
   #885 = Methodref          #881.#884    // kotlin/collections/CollectionsKt.lastOrNull:(Ljava/lang/Iterable;)Ljava/lang/Object;
   #886 = Utf8               first
   #887 = Utf8               (Ljava/util/List;)Ljava/lang/Object;
   #888 = NameAndType        #886:#887    // first:(Ljava/util/List;)Ljava/lang/Object;
   #889 = Methodref          #881.#888    // kotlin/collections/CollectionsKt.first:(Ljava/util/List;)Ljava/lang/Object;
   #890 = Utf8               indexOf
   #891 = Utf8               (Ljava/lang/Object;)I
   #892 = NameAndType        #890:#891    // indexOf:(Ljava/lang/Object;)I
   #893 = InterfaceMethodref #751.#892    // java/util/List.indexOf:(Ljava/lang/Object;)I
   #894 = Utf8               get
   #895 = Utf8               (I)Ljava/lang/Object;
   #896 = NameAndType        #894:#895    // get:(I)Ljava/lang/Object;
   #897 = InterfaceMethodref #751.#896    // java/util/List.get:(I)Ljava/lang/Object;
   #898 = Utf8               add
   #899 = Utf8               (Ljava/lang/Object;)Z
   #900 = NameAndType        #898:#899    // add:(Ljava/lang/Object;)Z
   #901 = Methodref          #37.#900     // java/util/ArrayDeque.add:(Ljava/lang/Object;)Z
   #902 = Utf8               $i$a$-let-CreatureMove$tryRecalculatePathWithoutRetreat$finalTx$1
   #903 = Utf8               it
   #904 = Utf8               $i$a$-let-CreatureMove$tryRecalculatePathWithoutRetreat$finalTy$1
   #905 = Utf8               $i$a$-let-CreatureMove$tryRecalculatePathWithoutRetreat$finalTz$1
   #906 = Utf8               $i$a$-firstOrNull-CreatureMove$tryRecalculatePathWithoutRetreat$nextForward$1
   #907 = Utf8               dxToPoint
   #908 = Utf8               dyToPoint
   #909 = Utf8               dotProduct
   #910 = Utf8               loc
   #911 = Utf8               $i$f$firstOrNull
   #912 = Utf8               $this$firstOrNull$iv
   #913 = Utf8               finalTx
   #914 = Utf8               finalTy
   #915 = Utf8               finalTz
   #916 = Utf8               curX
   #917 = Utf8               curY
   #918 = Utf8               dxToGoal
   #919 = Utf8               dyToGoal
   #920 = Utf8               nextForward
   #921 = Utf8               idx
   #922 = Methodref          #342.#278    // ext/mods/gameserver/model/actor/Npc.getCollisionRadius:()D
   #923 = Utf8               $i$a$-any-CreatureMove$wouldCollideWithCreature$1
   #924 = Utf8               minDist
   #925 = Utf8               radius
   #926 = Utf8               targetX
   #927 = Utf8               targetY
   #928 = Utf8               NPC_MOVEMENT_PLAYER_RANGE
   #929 = NameAndType        #928:#48     // NPC_MOVEMENT_PLAYER_RANGE:I
   #930 = Fieldref           #109.#929    // ext/mods/Config.NPC_MOVEMENT_PLAYER_RANGE:I
   #931 = Utf8               getAppearance
   #932 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/Appearance;
   #933 = NameAndType        #931:#932    // getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
   #934 = Methodref          #81.#933     // ext/mods/gameserver/model/actor/Player.getAppearance:()Lext/mods/gameserver/model/actor/container/player/Appearance;
   #935 = Utf8               ext/mods/gameserver/model/actor/container/player/Appearance
   #936 = Class              #935         // ext/mods/gameserver/model/actor/container/player/Appearance
   #937 = Methodref          #936.#658    // ext/mods/gameserver/model/actor/container/player/Appearance.isVisible:()Z
   #938 = Utf8               $i$a$-any-CreatureMove$hasVisiblePlayers$1
   #939 = Utf8               _pauseCheckTask
   #940 = NameAndType        #939:#67     // _pauseCheckTask:Ljava/util/concurrent/ScheduledFuture;
   #941 = Fieldref           #2.#940      // ext/mods/gameserver/model/actor/move/CreatureMove._pauseCheckTask:Ljava/util/concurrent/ScheduledFuture;
   #942 = Utf8               startResumeCheckTask$lambda$0
   #943 = NameAndType        #942:#453    // startResumeCheckTask$lambda$0:(Lext/mods/gameserver/model/actor/move/CreatureMove;)V
   #944 = Methodref          #2.#943      // ext/mods/gameserver/model/actor/move/CreatureMove.startResumeCheckTask$lambda$0:(Lext/mods/gameserver/model/actor/move/CreatureMove;)V
   #945 = MethodHandle       6:#944       // REF_invokeStatic ext/mods/gameserver/model/actor/move/CreatureMove.startResumeCheckTask$lambda$0:(Lext/mods/gameserver/model/actor/move/CreatureMove;)V
   #946 = InvokeDynamic      #5:#466      // #5:run:(Lext/mods/gameserver/model/actor/move/CreatureMove;)Ljava/lang/Runnable;
   #947 = NameAndType        #475:#89     // shouldStopMovementTask:()Z
   #948 = Methodref          #2.#947      // ext/mods/gameserver/model/actor/move/CreatureMove.shouldStopMovementTask:()Z
   #949 = NameAndType        #490:#10     // finishMovement:()V
   #950 = Methodref          #2.#949      // ext/mods/gameserver/model/actor/move/CreatureMove.finishMovement:()V
   #951 = NameAndType        #656:#89     // updatePosition:()Z
   #952 = Methodref          #2.#951      // ext/mods/gameserver/model/actor/move/CreatureMove.updatePosition:()Z
   #953 = NameAndType        #649:#89     // moveToNextRoutePoint:()Z
   #954 = Methodref          #2.#953      // ext/mods/gameserver/model/actor/move/CreatureMove.moveToNextRoutePoint:()Z
   #955 = Utf8               this$0
   #956 = Utf8               currentTarget
   #957 = Utf8               currentIntention
   #958 = Double             5.0d
   #960 = Double             0.4d
   #962 = Utf8               overlap
   #963 = Utf8               normalizedDist
   #964 = Utf8               combinedRadius
   #965 = Utf8               isTarget
   #966 = Utf8               maxForce
   #967 = Utf8               $checkRadius
   #968 = Utf8               $minSeparationDistance
   #969 = NameAndType        #828:#795    // offensiveFollowTask:(Lext/mods/gameserver/model/actor/Creature;I)V
   #970 = Methodref          #2.#969      // ext/mods/gameserver/model/actor/move/CreatureMove.offensiveFollowTask:(Lext/mods/gameserver/model/actor/Creature;I)V
   #971 = Utf8               $pawn
   #972 = Utf8               $offset
   #973 = NameAndType        #852:#795    // friendlyFollowTask:(Lext/mods/gameserver/model/actor/Creature;I)V
   #974 = Methodref          #2.#973      // ext/mods/gameserver/model/actor/move/CreatureMove.friendlyFollowTask:(Lext/mods/gameserver/model/actor/Creature;I)V
   #975 = Utf8               resumeDest
   #976 = Utf8               <clinit>
   #977 = Utf8               ext/mods/gameserver/model/actor/move/CreatureMove$Companion
   #978 = Class              #977         // ext/mods/gameserver/model/actor/move/CreatureMove$Companion
   #979 = Utf8               (Lkotlin/jvm/internal/DefaultConstructorMarker;)V
   #980 = NameAndType        #6:#979      // "<init>":(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
   #981 = Methodref          #978.#980    // ext/mods/gameserver/model/actor/move/CreatureMove$Companion."<init>":(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
   #982 = Utf8               Companion
   #983 = Utf8               Lext/mods/gameserver/model/actor/move/CreatureMove$Companion;
   #984 = NameAndType        #982:#983    // Companion:Lext/mods/gameserver/model/actor/move/CreatureMove$Companion;
   #985 = Fieldref           #2.#984      // ext/mods/gameserver/model/actor/move/CreatureMove.Companion:Lext/mods/gameserver/model/actor/move/CreatureMove$Companion;
   #986 = Utf8               java/lang/Class
   #987 = Class              #986         // java/lang/Class
   #988 = Utf8               getName
   #989 = Utf8               ()Ljava/lang/String;
   #990 = NameAndType        #988:#989    // getName:()Ljava/lang/String;
   #991 = Methodref          #987.#990    // java/lang/Class.getName:()Ljava/lang/String;
   #992 = Methodref          #332.#153    // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
   #993 = Utf8               Lext/mods/gameserver/geoengine/GeoEngine$Companion;
   #994 = NameAndType        #982:#993    // Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
   #995 = Fieldref           #228.#994    // ext/mods/gameserver/geoengine/GeoEngine.Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
   #996 = Utf8               ext/mods/gameserver/geoengine/GeoEngine$Companion
   #997 = Class              #996         // ext/mods/gameserver/geoengine/GeoEngine$Companion
   #998 = Utf8               getInstance
   #999 = Utf8               ()Lext/mods/gameserver/geoengine/GeoEngine;
  #1000 = NameAndType        #998:#999    // getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
  #1001 = Methodref          #997.#1000   // ext/mods/gameserver/geoengine/GeoEngine$Companion.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
  #1002 = Utf8               GEOENGINE_FILE
  #1003 = Utf8               Ljava/lang/String;
  #1004 = NameAndType        #1002:#1003  // GEOENGINE_FILE:Ljava/lang/String;
  #1005 = Fieldref           #109.#1004   // ext/mods/Config.GEOENGINE_FILE:Ljava/lang/String;
  #1006 = Utf8               initProperties
  #1007 = Utf8               (Ljava/lang/String;)Lext/mods/commons/config/ExProperties;
  #1008 = NameAndType        #1006:#1007  // initProperties:(Ljava/lang/String;)Lext/mods/commons/config/ExProperties;
  #1009 = Methodref          #109.#1008   // ext/mods/Config.initProperties:(Ljava/lang/String;)Lext/mods/commons/config/ExProperties;
  #1010 = Utf8               GEOENGINE_PROPS
  #1011 = Utf8               Lext/mods/commons/config/ExProperties;
  #1012 = NameAndType        #1010:#1011  // GEOENGINE_PROPS:Lext/mods/commons/config/ExProperties;
  #1013 = Fieldref           #2.#1012     // ext/mods/gameserver/model/actor/move/CreatureMove.GEOENGINE_PROPS:Lext/mods/commons/config/ExProperties;
  #1014 = Utf8               MovementUpdateInterval
  #1015 = String             #1014        // MovementUpdateInterval
  #1016 = Long               80l
  #1018 = Utf8               ext/mods/commons/config/ExProperties
  #1019 = Class              #1018        // ext/mods/commons/config/ExProperties
  #1020 = Utf8               getProperty
  #1021 = Utf8               (Ljava/lang/String;J)J
  #1022 = NameAndType        #1020:#1021  // getProperty:(Ljava/lang/String;J)J
  #1023 = Methodref          #1019.#1022  // ext/mods/commons/config/ExProperties.getProperty:(Ljava/lang/String;J)J
  #1024 = Utf8               TT;
  #1025 = Utf8               Lkotlin/jvm/JvmField;
  #1026 = Utf8               Ljava/util/ArrayDeque<Lext/mods/gameserver/model/location/Location;>;
  #1027 = Utf8               Ljava/util/concurrent/ScheduledFuture<*>;
  #1028 = Utf8               MOVE_UPDATE_INTERVAL
  #1029 = Utf8               FOLLOW_INTERVAL
  #1030 = Utf8               ATTACK_FOLLOW_INTERVAL
  #1031 = Utf8               Lkotlin/Metadata;
  #1032 = Utf8               mv
  #1033 = Integer            2
  #1034 = Integer            3
  #1035 = Integer            0
  #1036 = Utf8               k
  #1037 = Integer            1
  #1038 = Utf8               xi
  #1039 = Integer            48
  #1040 = Utf8               d1
  #1041 = Utf8               \u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b)\b\u0016\u0018\u0000 w*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0001wB\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\f\u0010,\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001cJ\u0006\u0010-\u001a\u00020\u0011J\u000e\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201J\u0006\u00102\u001a\u00020\rJ\u000e\u00103\u001a\u00020/2\u0006\u00104\u001a\u00020\rJ\u0006\u00105\u001a\u00020\rJ\u000e\u00106\u001a\u00020/2\u0006\u00104\u001a\u00020\rJ\u0006\u00107\u001a\u00020\u000bJ\u0006\u00108\u001a\u00020/J\u0006\u00109\u001a\u00020/J\b\u0010:\u001a\u00020\rH\u0002J\u0012\u0010;\u001a\u00020/2\b\b\u0002\u0010<\u001a\u00020\rH\u0004J\u0006\u0010=\u001a\u00020>J\u000e\u0010?\u001a\u00020/2\u0006\u0010@\u001a\u00020>J\u000e\u0010A\u001a\u00020/2\u0006\u0010@\u001a\u00020>J\u0018\u0010B\u001a\u0004\u0018\u00010\u00112\u0006\u0010C\u001a\u00020\u00022\u0006\u0010D\u001a\u00020\u000bJ\u0018\u0010E\u001a\u00020/2\u0006\u0010F\u001a\u00020\u00112\u0006\u0010G\u001a\u00020\rH\u0014J\u0016\u0010H\u001a\u00020/2\u0006\u0010F\u001a\u00020\u00112\u0006\u0010G\u001a\u00020\rJ\u0010\u0010I\u001a\u00020\r2\u0006\u0010F\u001a\u00020\u0011H\u0002J\u0006\u0010J\u001a\u00020/J\b\u0010K\u001a\u00020\rH\u0016J\b\u0010L\u001a\u00020/H\u0002J\u0010\u0010M\u001a\u00020/2\u0006\u0010N\u001a\u00020OH\u0002J\u000e\u0010P\u001a\u00020/2\u0006\u0010C\u001a\u00020\u0002J\b\u0010Q\u001a\u00020\rH\u0002J\b\u0010R\u001a\u00020\rH\u0016J\b\u0010S\u001a\u00020/H\u0002J(\u0010T\u001a\u00020\r2\u0006\u0010U\u001a\u00020\u000b2\u0006\u0010V\u001a\u00020\u000b2\u0006\u0010W\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020>H\u0014J:\u0010X\u001a\u0004\u0018\u00010\u00112\u0006\u0010Y\u001a\u00020\u000b2\u0006\u0010Z\u001a\u00020\u000b2\u0006\u0010[\u001a\u00020\u000b2\u0006\u0010\\\u001a\u00020\u000b2\u0006\u0010]\u001a\u00020\u000b2\u0006\u0010^\u001a\u00020\u000bH\u0016J\u0016\u0010_\u001a\u00020\r2\u0006\u0010C\u001a\u00020\u00022\u0006\u0010`\u001a\u00020\u000bJ\u0016\u0010a\u001a\u00020/2\u0006\u0010b\u001a\u00020\u00022\u0006\u0010c\u001a\u00020\u000bJ\u0018\u0010d\u001a\u00020/2\u0006\u0010C\u001a\u00020\u00022\u0006\u0010c\u001a\u00020\u000bH\u0014J\u0016\u0010e\u001a\u00020/2\u0006\u0010b\u001a\u00020\u00022\u0006\u0010c\u001a\u00020\u000bJ\u0018\u0010f\u001a\u00020/2\u0006\u0010C\u001a\u00020\u00022\u0006\u0010c\u001a\u00020\u000bH\u0014J\b\u0010g\u001a\u00020/H\u0016J\b\u0010h\u001a\u00020/H\u0016J\u0006\u0010i\u001a\u00020/J\u0006\u0010j\u001a\u00020\rJ\u0010\u0010k\u001a\u00020/2\u0006\u0010l\u001a\u00020\u0002H\u0016J\u0016\u0010m\u001a\u00020\r2\u0006\u0010C\u001a\u00020\u00022\u0006\u0010`\u001a\u00020\u000bJ&\u0010n\u001a\u00020\r2\u0006\u0010F\u001a\u00020\u00112\u0006\u0010c\u001a\u00020\u000b2\u0006\u0010G\u001a\u00020\r2\u0006\u0010o\u001a\u00020\rJ\u0010\u0010p\u001a\u00020\r2\u0006\u0010@\u001a\u00020>H\u0002J\b\u0010q\u001a\u00020\rH\u0002J\u0018\u0010r\u001a\u00020\r2\u0006\u0010s\u001a\u00020\u000b2\u0006\u0010t\u001a\u00020\u000bH\u0002J\b\u0010u\u001a\u00020\rH\u0002J\b\u0010v\u001a\u00020/H\u0002R\u0012\u0010\u0004\u001a\u00028\u00008\u0004X\u0085\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\u000b8\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\r8\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u00020\u000f8\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u00020\u00118\u0004X\u0085\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u00020\u00138\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0014\u001a\u00020\u00138\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0015\u001a\u00020\u00138\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0016\u001a\u00020\u00138\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0017\u001a\u00020\u00138\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u00198\u0004X\u0085\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u001b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001c8\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u001d\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001c8\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001e\u001a\u00020\u000b8\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001f\u001a\u00020\r8\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R\u0012\u0010 \u001a\u00020\r8\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020&X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020&X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010)\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006x
  #1042 = Utf8               d2
  #1043 = Utf8               T
  #1044 = Utf8
  #1045 = Utf8               Brproject
  #1046 = Utf8               CreatureMove.kt
  #1047 = Utf8               Lkotlin/jvm/internal/SourceDebugExtension;
  #1048 = Utf8               value
  #1049 = Utf8               SMAP\nCreatureMove.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreatureMove.kt\next/mods/gameserver/model/actor/move/CreatureMove\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,745:1\n1807#2,3:746\n1807#2,3:749\n296#2,2:753\n1807#2,3:755\n1807#2,3:758\n1#3:752\n*S KotlinDebug\n*F\n+ 1 CreatureMove.kt\next/mods/gameserver/model/actor/move/CreatureMove\n*L\n160#1:746,3\n239#1:749,3\n694#1:753,2\n715#1:755,3\n726#1:758,3\n*E\n
  #1050 = Utf8               RuntimeInvisibleAnnotations
  #1051 = Utf8               Signature
  #1052 = Utf8               ConstantValue
  #1053 = Utf8               Code
  #1054 = Utf8               LineNumberTable
  #1055 = Utf8               LocalVariableTable
  #1056 = Utf8               RuntimeInvisibleParameterAnnotations
  #1057 = Utf8               StackMapTable
  #1058 = Utf8               InnerClasses
  #1059 = Utf8               SourceFile
  #1060 = Utf8               SourceDebugExtension
  #1061 = Utf8               RuntimeVisibleAnnotations
  #1062 = Utf8               BootstrapMethods
{
  public static final ext.mods.gameserver.model.actor.move.CreatureMove$Companion Companion;
    descriptor: Lext/mods/gameserver/model/actor/move/CreatureMove$Companion;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    RuntimeInvisibleAnnotations:
      0: #9()
        org.jetbrains.annotations.NotNull

  protected final T _actor;
    descriptor: Lext/mods/gameserver/model/actor/Creature;
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Signature: #1024                        // TT;
    RuntimeInvisibleAnnotations:
      0: #1025()
        kotlin.jvm.JvmField
      1: #9()
        org.jetbrains.annotations.NotNull

  protected ext.mods.gameserver.model.WorldObject _pawn;
    descriptor: Lext/mods/gameserver/model/WorldObject;
    flags: (0x0004) ACC_PROTECTED
    RuntimeInvisibleAnnotations:
      0: #1025()
        kotlin.jvm.JvmField
      1: #65()
        org.jetbrains.annotations.Nullable

  protected int _offset;
    descriptor: I
    flags: (0x0004) ACC_PROTECTED
    RuntimeInvisibleAnnotations:
      0: #1025()
        kotlin.jvm.JvmField

  protected boolean _blocked;
    descriptor: Z
    flags: (0x0004) ACC_PROTECTED
    RuntimeInvisibleAnnotations:
      0: #1025()
        kotlin.jvm.JvmField

  protected byte _moveTypes;
    descriptor: B
    flags: (0x0004) ACC_PROTECTED
    RuntimeInvisibleAnnotations:
      0: #1025()
        kotlin.jvm.JvmField

  protected final ext.mods.gameserver.model.location.Location _destination;
    descriptor: Lext/mods/gameserver/model/location/Location;
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    RuntimeInvisibleAnnotations:
      0: #1025()
        kotlin.jvm.JvmField
      1: #9()
        org.jetbrains.annotations.NotNull

  protected double _xAccurate;
    descriptor: D
    flags: (0x0004) ACC_PROTECTED
    RuntimeInvisibleAnnotations:
      0: #1025()
        kotlin.jvm.JvmField

  protected double _yAccurate;
    descriptor: D
    flags: (0x0004) ACC_PROTECTED
    RuntimeInvisibleAnnotations:
      0: #1025()
        kotlin.jvm.JvmField

  protected double _zAccurate;
    descriptor: D
    flags: (0x0004) ACC_PROTECTED
    RuntimeInvisibleAnnotations:
      0: #1025()
        kotlin.jvm.JvmField

  protected double _separationForceX;
    descriptor: D
    flags: (0x0004) ACC_PROTECTED
    RuntimeInvisibleAnnotations:
      0: #1025()
        kotlin.jvm.JvmField

  protected double _separationForceY;
    descriptor: D
    flags: (0x0004) ACC_PROTECTED
    RuntimeInvisibleAnnotations:
      0: #1025()
        kotlin.jvm.JvmField

  protected final java.util.ArrayDeque<ext.mods.gameserver.model.location.Location> _geoPath;
    descriptor: Ljava/util/ArrayDeque;
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Signature: #1026                        // Ljava/util/ArrayDeque<Lext/mods/gameserver/model/location/Location;>;
    RuntimeInvisibleAnnotations:
      0: #1025()
        kotlin.jvm.JvmField
      1: #9()
        org.jetbrains.annotations.NotNull

  protected java.util.concurrent.ScheduledFuture<?> _task;
    descriptor: Ljava/util/concurrent/ScheduledFuture;
    flags: (0x0004) ACC_PROTECTED
    Signature: #1027                        // Ljava/util/concurrent/ScheduledFuture<*>;
    RuntimeInvisibleAnnotations:
      0: #1025()
        kotlin.jvm.JvmField
      1: #65()
        org.jetbrains.annotations.Nullable

  protected java.util.concurrent.ScheduledFuture<?> _followTask;
    descriptor: Ljava/util/concurrent/ScheduledFuture;
    flags: (0x0004) ACC_PROTECTED
    Signature: #1027                        // Ljava/util/concurrent/ScheduledFuture<*>;
    RuntimeInvisibleAnnotations:
      0: #1025()
        kotlin.jvm.JvmField
      1: #65()
        org.jetbrains.annotations.Nullable

  protected int _geoPathFailCount;
    descriptor: I
    flags: (0x0004) ACC_PROTECTED
    RuntimeInvisibleAnnotations:
      0: #1025()
        kotlin.jvm.JvmField

  protected boolean _isDebugMove;
    descriptor: Z
    flags: (0x0004) ACC_PROTECTED
    RuntimeInvisibleAnnotations:
      0: #1025()
        kotlin.jvm.JvmField

  protected boolean _isDebugPath;
    descriptor: Z
    flags: (0x0004) ACC_PROTECTED
    RuntimeInvisibleAnnotations:
      0: #1025()
        kotlin.jvm.JvmField

  protected static final ext.mods.commons.logging.CLogger LOGGER;
    descriptor: Lext/mods/commons/logging/CLogger;
    flags: (0x001c) ACC_PROTECTED, ACC_STATIC, ACC_FINAL
    RuntimeInvisibleAnnotations:
      0: #1025()
        kotlin.jvm.JvmField
      1: #9()
        org.jetbrains.annotations.NotNull

  public static final ext.mods.gameserver.geoengine.GeoEngine geoEngine;
    descriptor: Lext/mods/gameserver/geoengine/GeoEngine;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    RuntimeInvisibleAnnotations:
      0: #1025()
        kotlin.jvm.JvmField
      1: #9()
        org.jetbrains.annotations.NotNull

  public ext.mods.gameserver.model.actor.move.CreatureMove(T);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=2, args_size=2
         0: aload_0
         1: invokespecial #12                 // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         9: aload_0
        10: new           #18                 // class ext/mods/gameserver/model/location/Location
        13: dup
        14: iconst_0
        15: iconst_0
        16: iconst_0
        17: invokespecial #21                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
        20: putfield      #25                 // Field _destination:Lext/mods/gameserver/model/location/Location;
        23: aload_0
        24: aload_0
        25: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        28: checkcast     #27                 // class ext/mods/gameserver/model/WorldObject
        31: invokevirtual #31                 // Method ext/mods/gameserver/model/WorldObject.getZ:()I
        34: i2d
        35: putfield      #35                 // Field _zAccurate:D
        38: aload_0
        39: new           #37                 // class java/util/ArrayDeque
        42: dup
        43: invokespecial #38                 // Method java/util/ArrayDeque."<init>":()V
        46: putfield      #42                 // Field _geoPath:Ljava/util/ArrayDeque;
        49: aload_0
        50: new           #18                 // class ext/mods/gameserver/model/location/Location
        53: dup
        54: iconst_0
        55: iconst_0
        56: iconst_0
        57: invokespecial #21                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
        60: putfield      #45                 // Field _finalPathDestination:Lext/mods/gameserver/model/location/Location;
        63: aload_0
        64: ldc           #46                 // int -2147483648
        66: putfield      #50                 // Field _cachedDestinationZ:I
        69: aload_0
        70: ldc           #46                 // int -2147483648
        72: putfield      #53                 // Field _cachedDestinationX:I
        75: aload_0
        76: ldc           #46                 // int -2147483648
        78: putfield      #56                 // Field _cachedDestinationY:I
        81: aload_0
        82: dconst_1
        83: putfield      #59                 // Field _currentSpeedRandomFactor:D
        86: return
      LineNumberTable:
        line 50: 0
        line 51: 4
        line 66: 9
        line 69: 23
        line 72: 38
        line 74: 49
        line 80: 63
        line 81: 69
        line 82: 75
        line 83: 81
        line 50: 86
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      87     0  this   Lext/mods/gameserver/model/actor/move/CreatureMove;
            0      87     1 _actor   Lext/mods/gameserver/model/actor/Creature;
    Signature: #8                           // (TT;)V
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #9()
          org.jetbrains.annotations.NotNull

  public final java.util.concurrent.ScheduledFuture<?> getTask();
    descriptor: ()Ljava/util/concurrent/ScheduledFuture;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #69                 // Field _task:Ljava/util/concurrent/ScheduledFuture;
         4: areturn
      LineNumberTable:
        line 90: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/move/CreatureMove;
    Signature: #64                          // ()Ljava/util/concurrent/ScheduledFuture<*>;
    RuntimeInvisibleAnnotations:
      0: #65()
        org.jetbrains.annotations.Nullable

  public final ext.mods.gameserver.model.location.Location getDestination();
    descriptor: ()Lext/mods/gameserver/model/location/Location;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #25                 // Field _destination:Lext/mods/gameserver/model/location/Location;
         4: areturn
      LineNumberTable:
        line 91: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/move/CreatureMove;
    RuntimeInvisibleAnnotations:
      0: #9()
        org.jetbrains.annotations.NotNull

  public final void describeMovementTo(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=2, args_size=2
         0: aload_1
         1: new           #75                 // class ext/mods/gameserver/network/serverpackets/MoveToLocation
         4: dup
         5: aload_0
         6: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         9: invokespecial #77                 // Method ext/mods/gameserver/network/serverpackets/MoveToLocation."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
        12: checkcast     #79                 // class ext/mods/gameserver/network/serverpackets/L2GameServerPacket
        15: invokevirtual #85                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        18: return
      LineNumberTable:
        line 94: 0
        line 95: 18
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/actor/move/CreatureMove;
            0      19     1 player   Lext/mods/gameserver/model/actor/Player;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #9()
          org.jetbrains.annotations.NotNull

  public final boolean isDebugMove();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #93                 // Field _isDebugMove:Z
         4: ireturn
      LineNumberTable:
        line 96: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/move/CreatureMove;

  public final void setDebugMove(boolean);
    descriptor: (Z)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #93                 // Field _isDebugMove:Z
         5: return
      LineNumberTable:
        line 97: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/move/CreatureMove;
            0       6     1 debug   Z

  public final boolean isDebugPath();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #100                // Field _isDebugPath:Z
         4: ireturn
      LineNumberTable:
        line 98: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/move/CreatureMove;

  public final void setDebugPath(boolean);
    descriptor: (Z)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #100                // Field _isDebugPath:Z
         5: return
      LineNumberTable:
        line 99: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/move/CreatureMove;
            0       6     1 debug   Z

  public final int getGeoPathFailCount();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #105                // Field _geoPathFailCount:I
         4: ireturn
      LineNumberTable:
        line 100: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/move/CreatureMove;

  public final void resetGeoPathFailCount();
    descriptor: ()V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: iconst_0
         2: putfield      #105                // Field _geoPathFailCount:I
         5: return
      LineNumberTable:
        line 101: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/move/CreatureMove;

  public final void addGeoPathFailCount();
    descriptor: ()V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: aload_0
         2: getfield      #105                // Field _geoPathFailCount:I
         5: iconst_1
         6: iadd
         7: putfield      #105                // Field _geoPathFailCount:I
        10: aload_0
        11: getfield      #105                // Field _geoPathFailCount:I
        14: getstatic     #112                // Field ext/mods/Config.MAX_GEOPATH_FAIL_COUNT:I
        17: if_icmple     25
        20: aload_0
        21: iconst_0
        22: putfield      #105                // Field _geoPathFailCount:I
        25: return
      StackMapTable: number_of_entries = 1
        frame_type = 25 /* same */
      LineNumberTable:
        line 103: 0
        line 104: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/model/actor/move/CreatureMove;

  protected final void syncPlayerLocation(boolean);
    descriptor: (Z)V
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Code:
      stack=4, locals=5, args_size=2
         0: aload_0
         1: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: astore        4
         6: aload         4
         8: instanceof    #81                 // class ext/mods/gameserver/model/actor/Player
        11: ifeq          22
        14: aload         4
        16: checkcast     #81                 // class ext/mods/gameserver/model/actor/Player
        19: goto          23
        22: aconst_null
        23: dup
        24: ifnonnull     29
        27: pop
        28: return
        29: astore_2
        30: invokestatic  #132                // Method java/lang/System.currentTimeMillis:()J
        33: lstore_3
        34: iload_1
        35: ifne          51
        38: lload_3
        39: aload_0
        40: getfield      #136                // Field _lastValidateLocationTime:J
        43: lsub
        44: ldc2_w        #137                // long 500l
        47: lcmp
        48: iflt          74
        51: aload_2
        52: new           #140                // class ext/mods/gameserver/network/serverpackets/ValidateLocation
        55: dup
        56: aload_2
        57: checkcast     #142                // class ext/mods/gameserver/model/actor/Creature
        60: invokespecial #143                // Method ext/mods/gameserver/network/serverpackets/ValidateLocation."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
        63: checkcast     #79                 // class ext/mods/gameserver/network/serverpackets/L2GameServerPacket
        66: invokevirtual #85                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        69: aload_0
        70: lload_3
        71: putfield      #136                // Field _lastValidateLocationTime:J
        74: return
      StackMapTable: number_of_entries = 5
        frame_type = 254 /* append */
          offset_delta = 22
          locals = [ top, top, class ext/mods/gameserver/model/actor/Creature ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 69 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 255 /* full_frame */
          offset_delta = 21
          locals = [ class ext/mods/gameserver/model/actor/move/CreatureMove, int, class ext/mods/gameserver/model/actor/Player, long ]
          stack = []
        frame_type = 22 /* same */
      LineNumberTable:
        line 111: 0
        line 112: 30
        line 113: 34
        line 114: 51
        line 115: 69
        line 117: 74
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           30      45     2 player   Lext/mods/gameserver/model/actor/Player;
           34      41     3   now   J
            0      75     0  this   Lext/mods/gameserver/model/actor/move/CreatureMove;
            0      75     1 force   Z

  public static void syncPlayerLocation$default(ext.mods.gameserver.model.actor.move.CreatureMove, boolean, int, java.lang.Object);
    descriptor: (Lext/mods/gameserver/model/actor/move/CreatureMove;ZILjava/lang/Object;)V
    flags: (0x1009) ACC_PUBLIC, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=3, locals=4, args_size=4
         0: aload_3
         1: ifnull        14
         4: new           #149                // class java/lang/UnsupportedOperationException
         7: dup
         8: ldc           #151                // String Super calls with default arguments not supported in this target, function: syncPlayerLocation
        10: invokespecial #154                // Method java/lang/UnsupportedOperationException."<init>":(Ljava/lang/String;)V
        13: athrow
        14: iload_2
        15: iconst_1
        16: iand
        17: ifeq          22
        20: iconst_0
        21: istore_1
        22: aload_0
        23: iload_1
        24: invokevirtual #156                // Method syncPlayerLocation:(Z)V
        27: return
      StackMapTable: number_of_entries = 2
        frame_type = 14 /* same */
        frame_type = 7 /* same */
      LineNumberTable:
        line 110: 0

  public final ext.mods.gameserver.enums.actors.MoveType getMoveType();
    descriptor: ()Lext/mods/gameserver/enums/actors/MoveType;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: nop
         1: aload_0
         2: getfield      #162                // Field _moveTypes:B
         5: getstatic     #168                // Field ext/mods/gameserver/enums/actors/MoveType.SWIM:Lext/mods/gameserver/enums/actors/MoveType;
         8: invokevirtual #171                // Method ext/mods/gameserver/enums/actors/MoveType.getMask:()I
        11: iand
        12: ifeq          21
        15: getstatic     #168                // Field ext/mods/gameserver/enums/actors/MoveType.SWIM:Lext/mods/gameserver/enums/actors/MoveType;
        18: goto          44
        21: aload_0
        22: getfield      #162                // Field _moveTypes:B
        25: getstatic     #174                // Field ext/mods/gameserver/enums/actors/MoveType.FLY:Lext/mods/gameserver/enums/actors/MoveType;
        28: invokevirtual #171                // Method ext/mods/gameserver/enums/actors/MoveType.getMask:()I
        31: iand
        32: ifeq          41
        35: getstatic     #174                // Field ext/mods/gameserver/enums/actors/MoveType.FLY:Lext/mods/gameserver/enums/actors/MoveType;
        38: goto          44
        41: getstatic     #177                // Field ext/mods/gameserver/enums/actors/MoveType.GROUND:Lext/mods/gameserver/enums/actors/MoveType;
        44: areturn
      StackMapTable: number_of_entries = 3
        frame_type = 21 /* same */
        frame_type = 19 /* same */
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/enums/actors/MoveType ]
      LineNumberTable:
        line 119: 0
        line 120: 1
        line 121: 21
        line 122: 41
        line 119: 44
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      45     0  this   Lext/mods/gameserver/model/actor/move/CreatureMove;
    RuntimeInvisibleAnnotations:
      0: #9()
        org.jetbrains.annotations.NotNull

  public final void addMoveType(ext.mods.gameserver.enums.actors.MoveType);
    descriptor: (Lext/mods/gameserver/enums/actors/MoveType;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_0
         2: getfield      #162                // Field _moveTypes:B
         5: aload_1
         6: invokevirtual #171                // Method ext/mods/gameserver/enums/actors/MoveType.getMask:()I
         9: ior
        10: i2b
        11: putfield      #162                // Field _moveTypes:B
        14: return
      LineNumberTable:
        line 126: 0
        line 127: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/model/actor/move/CreatureMove;
            0      15     1  type   Lext/mods/gameserver/enums/actors/MoveType;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #9()
          org.jetbrains.annotations.NotNull

  public final void removeMoveType(ext.mods.gameserver.enums.actors.MoveType);
    descriptor: (Lext/mods/gameserver/enums/actors/MoveType;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: aload_0
         2: getfield      #162                // Field _moveTypes:B
         5: aload_1
         6: invokevirtual #171                // Method ext/mods/gameserver/enums/actors/MoveType.getMask:()I
         9: iconst_m1
        10: ixor
        11: iand
        12: i2b
        13: putfield      #162                // Field _moveTypes:B
        16: return
      LineNumberTable:
        line 129: 0
        line 130: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/actor/move/CreatureMove;
            0      17     1  type   Lext/mods/gameserver/enums/actors/MoveType;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #9()
          org.jetbrains.annotations.NotNull

  public final ext.mods.gameserver.model.location.Location findAlternativeAttackPosition(ext.mods.gameserver.model.actor.Creature, int);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;I)Lext/mods/gameserver/model/location/Location;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=7, locals=31, args_size=3
         0: aload_1
         1: invokevirtual #186                // Method ext/mods/gameserver/model/actor/Creature.getX:()I
         4: istore_3
         5: aload_1
         6: invokevirtual #189                // Method ext/mods/gameserver/model/actor/Creature.getY:()I
         9: istore        4
        11: aload_1
        12: invokevirtual #190                // Method ext/mods/gameserver/model/actor/Creature.getZ:()I
        15: istore        5
        17: aload_0
        18: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        21: checkcast     #27                 // class ext/mods/gameserver/model/WorldObject
        24: invokevirtual #193                // Method ext/mods/gameserver/model/WorldObject.getObjectId:()I
        27: iconst_3
        28: irem
        29: istore        6
        31: iload_2
        32: iload         6
        34: bipush        20
        36: imul
        37: iadd
        38: bipush        100
        40: invokestatic  #199                // Method kotlin/ranges/RangesKt.coerceAtLeast:(II)I
        43: istore        7
        45: bipush        12
        47: istore        8
        49: sipush        360
        52: iload         8
        54: idiv
        55: istore        9
        57: aload_0
        58: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        61: checkcast     #27                 // class ext/mods/gameserver/model/WorldObject
        64: invokevirtual #200                // Method ext/mods/gameserver/model/WorldObject.getY:()I
        67: iload         4
        69: isub
        70: i2d
        71: aload_0
        72: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        75: checkcast     #27                 // class ext/mods/gameserver/model/WorldObject
        78: invokevirtual #201                // Method ext/mods/gameserver/model/WorldObject.getX:()I
        81: iload_3
        82: isub
        83: i2d
        84: invokestatic  #207                // Method java/lang/Math.atan2:(DD)D
        87: invokestatic  #211                // Method java/lang/Math.toDegrees:(D)D
        90: d2i
        91: istore        10
        93: aconst_null
        94: astore        11
        96: ldc2_w        #212                // double 1.7976931348623157E308d
        99: dstore        12
       101: iconst_0
       102: istore        14
       104: iload         14
       106: iload         8
       108: if_icmpge     457
       111: iload         10
       113: iload         14
       115: iload         9
       117: imul
       118: iadd
       119: i2d
       120: invokestatic  #216                // Method java/lang/Math.toRadians:(D)D
       123: dstore        15
       125: aload_0
       126: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       129: checkcast     #27                 // class ext/mods/gameserver/model/WorldObject
       132: invokevirtual #193                // Method ext/mods/gameserver/model/WorldObject.getObjectId:()I
       135: iconst_5
       136: irem
       137: iconst_4
       138: imul
       139: istore        17
       141: iload_3
       142: i2d
       143: iload         7
       145: iload         17
       147: iadd
       148: i2d
       149: dload         15
       151: invokestatic  #219                // Method java/lang/Math.cos:(D)D
       154: dmul
       155: dadd
       156: d2i
       157: istore        18
       159: iload         4
       161: i2d
       162: iload         7
       164: iload         17
       166: iadd
       167: i2d
       168: dload         15
       170: invokestatic  #222                // Method java/lang/Math.sin:(D)D
       173: dmul
       174: dadd
       175: d2i
       176: istore        19
       178: getstatic     #226                // Field geoEngine:Lext/mods/gameserver/geoengine/GeoEngine;
       181: iload         18
       183: iload         19
       185: iload         5
       187: invokevirtual #232                // Method ext/mods/gameserver/geoengine/GeoEngine.getHeight:(III)S
       190: istore        20
       192: new           #18                 // class ext/mods/gameserver/model/location/Location
       195: dup
       196: iload         18
       198: iload         19
       200: iload         20
       202: invokespecial #21                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       205: astore        21
       207: getstatic     #226                // Field geoEngine:Lext/mods/gameserver/geoengine/GeoEngine;
       210: aload_0
       211: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       214: checkcast     #27                 // class ext/mods/gameserver/model/WorldObject
       217: invokevirtual #201                // Method ext/mods/gameserver/model/WorldObject.getX:()I
       220: aload_0
       221: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       224: checkcast     #27                 // class ext/mods/gameserver/model/WorldObject
       227: invokevirtual #200                // Method ext/mods/gameserver/model/WorldObject.getY:()I
       230: aload_0
       231: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       234: checkcast     #27                 // class ext/mods/gameserver/model/WorldObject
       237: invokevirtual #31                 // Method ext/mods/gameserver/model/WorldObject.getZ:()I
       240: iload         18
       242: iload         19
       244: iload         20
       246: invokevirtual #236                // Method ext/mods/gameserver/geoengine/GeoEngine.canMoveToTarget:(IIIIII)Z
       249: ifeq          451
       252: ldc2_w        #237                // double 40.0d
       255: dstore        22
       257: aload_0
       258: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       261: checkcast     #27                 // class ext/mods/gameserver/model/WorldObject
       264: ldc           #142                // class ext/mods/gameserver/model/actor/Creature
       266: iload         7
       268: bipush        100
       270: iadd
       271: invokevirtual #242                // Method ext/mods/gameserver/model/WorldObject.getKnownTypeInRadius:(Ljava/lang/Class;I)Ljava/util/List;
       274: checkcast     #244                // class java/lang/Iterable
       277: astore        25
       279: iconst_0
       280: istore        26
       282: aload         25
       284: instanceof    #246                // class java/util/Collection
       287: ifeq          307
       290: aload         25
       292: checkcast     #246                // class java/util/Collection
       295: invokeinterface #249,  1          // InterfaceMethod java/util/Collection.isEmpty:()Z
       300: ifeq          307
       303: iconst_0
       304: goto          414
       307: aload         25
       309: invokeinterface #253,  1          // InterfaceMethod java/lang/Iterable.iterator:()Ljava/util/Iterator;
       314: astore        27
       316: aload         27
       318: invokeinterface #258,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       323: ifeq          413
       326: aload         27
       328: invokeinterface #262,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       333: astore        28
       335: aload         28
       337: checkcast     #142                // class ext/mods/gameserver/model/actor/Creature
       340: astore        29
       342: iconst_0
       343: istore        30
       345: aload         29
       347: aload_0
       348: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       351: invokestatic  #268                // Method kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
       354: ifne          405
       357: aload         29
       359: aload_1
       360: invokestatic  #268                // Method kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
       363: ifne          405
       366: aload         29
       368: invokevirtual #271                // Method ext/mods/gameserver/model/actor/Creature.isAlikeDead:()Z
       371: ifne          405
       374: aload         29
       376: aload         21
       378: invokevirtual #275                // Method ext/mods/gameserver/model/actor/Creature.distance2D:(Lext/mods/gameserver/model/location/Location;)D
       381: aload         29
       383: invokevirtual #279                // Method ext/mods/gameserver/model/actor/Creature.getCollisionRadius:()D
       386: aload_0
       387: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       390: invokevirtual #279                // Method ext/mods/gameserver/model/actor/Creature.getCollisionRadius:()D
       393: dadd
       394: dload         22
       396: dadd
       397: dcmpg
       398: ifge          405
       401: iconst_1
       402: goto          406
       405: iconst_0
       406: ifeq          316
       409: iconst_1
       410: goto          414
       413: iconst_0
       414: istore        24
       416: iload         24
       418: ifne          451
       421: aload_0
       422: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       425: checkcast     #27                 // class ext/mods/gameserver/model/WorldObject
       428: aload         21
       430: invokevirtual #280                // Method ext/mods/gameserver/model/WorldObject.distance2D:(Lext/mods/gameserver/model/location/Location;)D
       433: dstore        25
       435: dload         25
       437: dload         12
       439: dcmpg
       440: ifge          451
       443: dload         25
       445: dstore        12
       447: aload         21
       449: astore        11
       451: iinc          14, 1
       454: goto          104
       457: aload         11
       459: areturn
      StackMapTable: number_of_entries = 9
        frame_type = 255 /* full_frame */
          offset_delta = 104
          locals = [ class ext/mods/gameserver/model/actor/move/CreatureMove, class ext/mods/gameserver/model/actor/Creature, int, int, int, int, int, int, int, int, int, class ext/mods/gameserver/model/location/Location, double, int ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 202
          locals = [ class ext/mods/gameserver/model/actor/move/CreatureMove, class ext/mods/gameserver/model/actor/Creature, int, int, int, int, int, int, int, int, int, class ext/mods/gameserver/model/location/Location, double, int, double, int, int, int, int, class ext/mods/gameserver/model/location/Location, double, top, class java/lang/Iterable, int ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 8
          locals = [ class java/util/Iterator ]
        frame_type = 254 /* append */
          offset_delta = 88
          locals = [ class java/lang/Object, class ext/mods/gameserver/model/actor/Creature, int ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 248 /* chop */
          offset_delta = 6
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/move/CreatureMove, class ext/mods/gameserver/model/actor/Creature, int, int, int, int, int, int, int, int, int, class ext/mods/gameserver/model/location/Location, double, int, double, int, int, int, int, class ext/mods/gameserver/model/location/Location, double, top, class java/lang/Iterable, int ]
          stack = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 36
          locals = [ class ext/mods/gameserver/model/actor/move/CreatureMove, class ext/mods/gameserver/model/actor/Creature, int, int, int, int, int, int, int, int, int, class ext/mods/gameserver/model/location/Location, double, int, double, int, int, int, int, class ext/mods/gameserver/model/location/Location ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 5
          locals = [ class ext/mods/gameserver/model/actor/move/CreatureMove, class ext/mods/gameserver/model/actor/Creature, int, int, int, int, int, int, int, int, int, class ext/mods/gameserver/model/location/Location, double, int ]
          stack = []
      LineNumberTable:
        line 132: 0
        line 133: 5
        line 134: 11
        line 136: 17
        line 137: 31
        line 139: 45
        line 140: 49
        line 142: 57
        line 144: 93
        line 145: 96
        line 147: 101
        line 148: 111
        line 150: 125
        line 151: 141
        line 152: 159
        line 153: 178
        line 155: 192
        line 157: 207
        line 159: 252
        line 160: 257
        line 746: 282
        line 747: 307
        line 161: 345
        line 162: 374
        line 747: 406
        line 748: 413
        line 160: 414
        line 165: 416
        line 167: 421
        line 168: 435
        line 169: 443
        line 170: 447
        line 147: 451
        line 174: 457
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          345      61    30 $i$a$-any-CreatureMove$findAlternativeAttackPosition$isTooCloseToOthers$1   I
          342      64    29 other   Lext/mods/gameserver/model/actor/Creature;
          335      78    28 element$iv   Ljava/lang/Object;
          282     132    26 $i$f$any   I
          279     135    25 $this$any$iv   Ljava/lang/Iterable;
          125     326    15 currentAngle   D
          141     310    17 jitter   I
          159     292    18 testX   I
          178     273    19 testY   I
          192     259    20 testZ   I
          207     244    21 testLoc   Lext/mods/gameserver/model/location/Location;
          257     194    22 collisionGap   D
          416      35    24 isTooCloseToOthers   Z
          435      16    25 score   D
          104     353    14     i   I
            5     455     3 centerX   I
           11     449     4 centerY   I
           17     443     5 centerZ   I
           31     429     6 layer   I
           45     415     7 layeredRange   I
           49     411     8 totalAngles   I
           57     403     9 angleStep   I
           93     367    10 startAngle   I
           96     364    11 bestLoc   Lext/mods/gameserver/model/location/Location;
          101     359    12 bestScore   D
            0     460     0  this   Lext/mods/gameserver/model/actor/move/CreatureMove;
            0     460     1 target   Lext/mods/gameserver/model/actor/Creature;
            0     460     2 baseRange   I
    RuntimeInvisibleAnnotations:
      0: #65()
        org.jetbrains.annotations.Nullable
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #9()
          org.jetbrains.annotations.NotNull
      parameter 1:

  protected void moveToLocation(ext.mods.gameserver.model.location.Location, boolean);
    descriptor: (Lext/mods/gameserver/model/location/Location;Z)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=8, locals=8, args_size=3
         0: aload_0
         1: invokespecial #313                // Method isMeleeDebug:()Z
         4: ifeq          49
         7: getstatic     #317                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        10: ldc_w         #319                // String [MeleeDebug][CreatureMove][moveToLocation] actor={} dest={} pathfinding={}
        13: iconst_3
        14: anewarray     #5                  // class java/lang/Object
        17: astore_3
        18: aload_3
        19: iconst_0
        20: aload_0
        21: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        24: checkcast     #27                 // class ext/mods/gameserver/model/WorldObject
        27: invokevirtual #193                // Method ext/mods/gameserver/model/WorldObject.getObjectId:()I
        30: invokestatic  #325                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        33: aastore
        34: aload_3
        35: iconst_1
        36: aload_1
        37: aastore
        38: aload_3
        39: iconst_2
        40: iload_2
        41: invokestatic  #330                // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        44: aastore
        45: aload_3
        46: invokevirtual #336                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
        49: invokestatic  #132                // Method java/lang/System.currentTimeMillis:()J
        52: lstore_3
        53: aload_0
        54: getfield      #340                // Field _pawn:Lext/mods/gameserver/model/WorldObject;
        57: ifnull        141
        60: aload_0
        61: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        64: instanceof    #342                // class ext/mods/gameserver/model/actor/Npc
        67: ifeq          141
        70: aload_0
        71: aload_1
        72: invokespecial #346                // Method wouldCollideInPath:(Lext/mods/gameserver/model/location/Location;)Z
        75: ifeq          130
        78: aload_0
        79: aload_0
        80: getfield      #340                // Field _pawn:Lext/mods/gameserver/model/WorldObject;
        83: dup
        84: ldc_w         #348                // String null cannot be cast to non-null type ext.mods.gameserver.model.actor.Creature
        87: invokestatic  #352                // Method kotlin/jvm/internal/Intrinsics.checkNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
        90: checkcast     #142                // class ext/mods/gameserver/model/actor/Creature
        93: aload_0
        94: getfield      #355                // Field _offset:I
        97: invokevirtual #357                // Method findAlternativeAttackPosition:(Lext/mods/gameserver/model/actor/Creature;I)Lext/mods/gameserver/model/location/Location;
       100: astore        5
       102: aload         5
       104: ifnull        119
       107: aload_0
       108: getfield      #25                 // Field _destination:Lext/mods/gameserver/model/location/Location;
       111: aload         5
       113: invokevirtual #361                // Method ext/mods/gameserver/model/location/Location.set:(Lext/mods/gameserver/model/location/Location;)V
       116: goto          149
       119: aload_0
       120: getfield      #25                 // Field _destination:Lext/mods/gameserver/model/location/Location;
       123: aload_1
       124: invokevirtual #361                // Method ext/mods/gameserver/model/location/Location.set:(Lext/mods/gameserver/model/location/Location;)V
       127: goto          149
       130: aload_0
       131: getfield      #25                 // Field _destination:Lext/mods/gameserver/model/location/Location;
       134: aload_1
       135: invokevirtual #361                // Method ext/mods/gameserver/model/location/Location.set:(Lext/mods/gameserver/model/location/Location;)V
       138: goto          149
       141: aload_0
       142: getfield      #25                 // Field _destination:Lext/mods/gameserver/model/location/Location;
       145: aload_1
       146: invokevirtual #361                // Method ext/mods/gameserver/model/location/Location.set:(Lext/mods/gameserver/model/location/Location;)V
       149: aload_0
       150: getfield      #45                 // Field _finalPathDestination:Lext/mods/gameserver/model/location/Location;
       153: aload_0
       154: getfield      #25                 // Field _destination:Lext/mods/gameserver/model/location/Location;
       157: invokevirtual #361                // Method ext/mods/gameserver/model/location/Location.set:(Lext/mods/gameserver/model/location/Location;)V
       160: lload_3
       161: aload_0
       162: getfield      #364                // Field _lastMoveRequestTime:J
       165: lsub
       166: ldc2_w        #365                // long 100l
       169: lcmp
       170: ifge          192
       173: aload_0
       174: getfield      #25                 // Field _destination:Lext/mods/gameserver/model/location/Location;
       177: aload_1
       178: checkcast     #368                // class ext/mods/gameserver/model/location/Point2D
       181: invokevirtual #371                // Method ext/mods/gameserver/model/location/Location.distance2D:(Lext/mods/gameserver/model/location/Point2D;)D
       184: ldc2_w        #372                // double 10.0d
       187: dcmpg
       188: ifge          192
       191: return
       192: aload_0
       193: lload_3
       194: putfield      #364                // Field _lastMoveRequestTime:J
       197: aload_0
       198: aload_0
       199: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       202: checkcast     #27                 // class ext/mods/gameserver/model/WorldObject
       205: invokevirtual #201                // Method ext/mods/gameserver/model/WorldObject.getX:()I
       208: i2d
       209: putfield      #376                // Field _xAccurate:D
       212: aload_0
       213: aload_0
       214: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       217: checkcast     #27                 // class ext/mods/gameserver/model/WorldObject
       220: invokevirtual #200                // Method ext/mods/gameserver/model/WorldObject.getY:()I
       223: i2d
       224: putfield      #379                // Field _yAccurate:D
       227: aload_0
       228: aload_0
       229: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       232: checkcast     #27                 // class ext/mods/gameserver/model/WorldObject
       235: invokevirtual #31                 // Method ext/mods/gameserver/model/WorldObject.getZ:()I
       238: i2d
       239: putfield      #35                 // Field _zAccurate:D
       242: aload_0
       243: aload_0
       244: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       247: instanceof    #342                // class ext/mods/gameserver/model/actor/Npc
       250: ifeq          270
       253: dconst_1
       254: invokestatic  #385                // Method java/util/concurrent/ThreadLocalRandom.current:()Ljava/util/concurrent/ThreadLocalRandom;
       257: ldc2_w        #386                // double -0.05d
       260: ldc2_w        #388                // double 0.05d
       263: invokevirtual #392                // Method java/util/concurrent/ThreadLocalRandom.nextDouble:(DD)D
       266: dadd
       267: goto          271
       270: dconst_1
       271: putfield      #59                 // Field _currentSpeedRandomFactor:D
       274: aload_0
       275: getfield      #42                 // Field _geoPath:Ljava/util/ArrayDeque;
       278: invokevirtual #395                // Method java/util/ArrayDeque.clear:()V
       281: aload_0
       282: iconst_0
       283: putfield      #398                // Field _blocked:Z
       286: aload_0
       287: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       290: checkcast     #27                 // class ext/mods/gameserver/model/WorldObject
       293: aload_0
       294: getfield      #25                 // Field _destination:Lext/mods/gameserver/model/location/Location;
       297: invokevirtual #401                // Method ext/mods/gameserver/model/WorldObject.distance3D:(Lext/mods/gameserver/model/location/Location;)D
       300: dstore        5
       302: iload_2
       303: ifne          315
       306: dload         5
       308: ldc2_w        #402                // double 300.0d
       311: dcmpl
       312: ifle          403
       315: getstatic     #406                // Field ext/mods/Config.SISTEMA_PATHFINDING:Z
       318: ifeq          403
       321: aload_0
       322: getfield      #45                 // Field _finalPathDestination:Lext/mods/gameserver/model/location/Location;
       325: aload_0
       326: getfield      #25                 // Field _destination:Lext/mods/gameserver/model/location/Location;
       329: invokevirtual #361                // Method ext/mods/gameserver/model/location/Location.set:(Lext/mods/gameserver/model/location/Location;)V
       332: aload_0
       333: aload_0
       334: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       337: checkcast     #27                 // class ext/mods/gameserver/model/WorldObject
       340: invokevirtual #201                // Method ext/mods/gameserver/model/WorldObject.getX:()I
       343: aload_0
       344: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       347: checkcast     #27                 // class ext/mods/gameserver/model/WorldObject
       350: invokevirtual #200                // Method ext/mods/gameserver/model/WorldObject.getY:()I
       353: aload_0
       354: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       357: checkcast     #27                 // class ext/mods/gameserver/model/WorldObject
       360: invokevirtual #31                 // Method ext/mods/gameserver/model/WorldObject.getZ:()I
       363: aload_0
       364: getfield      #25                 // Field _destination:Lext/mods/gameserver/model/location/Location;
       367: invokevirtual #407                // Method ext/mods/gameserver/model/location/Location.getX:()I
       370: aload_0
       371: getfield      #25                 // Field _destination:Lext/mods/gameserver/model/location/Location;
       374: invokevirtual #408                // Method ext/mods/gameserver/model/location/Location.getY:()I
       377: aload_0
       378: getfield      #25                 // Field _destination:Lext/mods/gameserver/model/location/Location;
       381: invokevirtual #409                // Method ext/mods/gameserver/model/location/Location.getZ:()I
       384: invokevirtual #413                // Method calculatePath:(IIIIII)Lext/mods/gameserver/model/location/Location;
       387: astore        7
       389: aload         7
       391: ifnull        403
       394: aload_0
       395: getfield      #25                 // Field _destination:Lext/mods/gameserver/model/location/Location;
       398: aload         7
       400: invokevirtual #361                // Method ext/mods/gameserver/model/location/Location.set:(Lext/mods/gameserver/model/location/Location;)V
       403: aload_0
       404: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       407: checkcast     #27                 // class ext/mods/gameserver/model/WorldObject
       410: invokevirtual #417                // Method ext/mods/gameserver/model/WorldObject.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
       413: aload_0
       414: getfield      #25                 // Field _destination:Lext/mods/gameserver/model/location/Location;
       417: invokevirtual #422                // Method ext/mods/gameserver/model/location/SpawnLocation.setHeadingTo:(Lext/mods/gameserver/model/location/Location;)V
       420: aload_0
       421: invokevirtual #425                // Method registerMoveTask:()V
       424: aload_0
       425: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       428: new           #75                 // class ext/mods/gameserver/network/serverpackets/MoveToLocation
       431: dup
       432: aload_0
       433: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       436: aload_0
       437: getfield      #25                 // Field _destination:Lext/mods/gameserver/model/location/Location;
       440: invokespecial #428                // Method ext/mods/gameserver/network/serverpackets/MoveToLocation."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/location/Location;)V
       443: checkcast     #79                 // class ext/mods/gameserver/network/serverpackets/L2GameServerPacket
       446: invokevirtual #431                // Method ext/mods/gameserver/model/actor/Creature.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       449: aload_0
       450: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       453: instanceof    #81                 // class ext/mods/gameserver/model/actor/Player
       456: ifeq          475
       459: aload_0
       460: aload_0
       461: getfield      #434                // Field _followTask:Ljava/util/concurrent/ScheduledFuture;
       464: ifnull        471
       467: iconst_1
       468: goto          472
       471: iconst_0
       472: invokevirtual #156                // Method syncPlayerLocation:(Z)V
       475: return
      StackMapTable: number_of_entries = 13
        frame_type = 49 /* same */
        frame_type = 253 /* append */
          offset_delta = 69
          locals = [ long, class ext/mods/gameserver/model/location/Location ]
        frame_type = 250 /* chop */
          offset_delta = 10
        frame_type = 10 /* same */
        frame_type = 7 /* same */
        frame_type = 42 /* same */
        frame_type = 247 /* same_locals_1_stack_item_frame_extended */
          offset_delta = 77
          stack = [ class ext/mods/gameserver/model/actor/move/CreatureMove ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/move/CreatureMove, class ext/mods/gameserver/model/location/Location, int, long ]
          stack = [ class ext/mods/gameserver/model/actor/move/CreatureMove, double ]
        frame_type = 252 /* append */
          offset_delta = 43
          locals = [ double ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 87
        frame_type = 247 /* same_locals_1_stack_item_frame_extended */
          offset_delta = 67
          stack = [ class ext/mods/gameserver/model/actor/move/CreatureMove ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/move/CreatureMove, class ext/mods/gameserver/model/location/Location, int, long, double ]
          stack = [ class ext/mods/gameserver/model/actor/move/CreatureMove, int ]
        frame_type = 2 /* same */
      LineNumberTable:
        line 177: 0
        line 178: 7
        line 179: 10
        line 180: 13
        line 178: 46
        line 183: 49
        line 185: 53
        line 186: 70
        line 187: 78
        line 188: 102
        line 189: 107
        line 191: 119
        line 194: 130
        line 197: 141
        line 199: 149
        line 201: 160
        line 202: 191
        line 205: 192
        line 206: 197
        line 207: 212
        line 208: 227
        line 210: 242
        line 211: 253
        line 212: 270
        line 210: 271
        line 214: 274
        line 215: 281
        line 217: 286
        line 218: 302
        line 219: 321
        line 220: 332
        line 221: 389
        line 222: 394
        line 226: 403
        line 227: 420
        line 228: 424
        line 229: 449
        line 230: 459
        line 232: 475
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          102      25     5 altPos   Lext/mods/gameserver/model/location/Location;
          389      14     7 nextLoc   Lext/mods/gameserver/model/location/Location;
           53     423     3   now   J
          302     174     5 dist3D   D
            0     476     0  this   Lext/mods/gameserver/model/actor/move/CreatureMove;
            0     476     1 destination   Lext/mods/gameserver/model/location/Location;
            0     476     2 pathfinding   Z
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #9()
          org.jetbrains.annotations.NotNull
      parameter 1:

  public final void forceMoveToLocation(ext.mods.gameserver.model.location.Location, boolean);
    descriptor: (Lext/mods/gameserver/model/location/Location;Z)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: iload_2
         3: invokevirtual #442                // Method moveToLocation:(Lext/mods/gameserver/model/location/Location;Z)V
         6: return
      LineNumberTable:
        line 234: 0
        line 235: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/actor/move/CreatureMove;
            0       7     1 destination   Lext/mods/gameserver/model/location/Location;
            0       7     2 pathfinding   Z
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #9()
          org.jetbrains.annotations.NotNull
      parameter 1:

  public final void registerMoveTask();
    descriptor: ()V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=6, locals=3, args_size=1
         0: aload_0
         1: getfield      #69                 // Field _task:Ljava/util/concurrent/ScheduledFuture;
         4: ifnull        8
         7: return
         8: aload_0
         9: iconst_0
        10: putfield      #398                // Field _blocked:Z
        13: aload_0
        14: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        17: instanceof    #342                // class ext/mods/gameserver/model/actor/Npc
        20: ifeq          29
        23: getstatic     #450                // Field MOVEMENT_UPDATE_INTERVAL:J
        26: goto          32
        29: ldc2_w        #365                // long 100l
        32: lstore_1
        33: aload_0
        34: aload_0
        35: invokedynamic #467,  0            // InvokeDynamic #0:run:(Lext/mods/gameserver/model/actor/move/CreatureMove;)Ljava/lang/Runnable;
        40: lconst_0
        41: lload_1
        42: invokestatic  #473                // Method ext/mods/commons/pool/CoroutinePool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
        45: putfield      #69                 // Field _task:Ljava/util/concurrent/ScheduledFuture;
        48: return
      StackMapTable: number_of_entries = 3
        frame_type = 8 /* same */
        frame_type = 20 /* same */
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ long ]
      LineNumberTable:
        line 244: 0
        line 245: 8
        line 246: 13
        line 247: 33
        line 255: 40
        line 247: 42
        line 256: 48
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           33      16     1 interval   J
            0      49     0  this   Lext/mods/gameserver/model/actor/move/CreatureMove;

  public boolean shouldStopMovementTask();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: instanceof    #342                // class ext/mods/gameserver/model/actor/Npc
         7: ifeq          50
        10: aload_0
        11: invokespecial #478                // Method hasVisiblePlayers:()Z
        14: ifne          50
        17: aload_0
        18: getfield      #481                // Field _pausedByNoPlayers:Z
        21: ifne          48
        24: aload_0
        25: iconst_1
        26: putfield      #481                // Field _pausedByNoPlayers:Z
        29: aload_0
        30: new           #18                 // class ext/mods/gameserver/model/location/Location
        33: dup
        34: aload_0
        35: getfield      #25                 // Field _destination:Lext/mods/gameserver/model/location/Location;
        38: invokespecial #483                // Method ext/mods/gameserver/model/location/Location."<init>":(Lext/mods/gameserver/model/location/Location;)V
        41: putfield      #486                // Field _pausedDestination:Lext/mods/gameserver/model/location/Location;
        44: aload_0
        45: invokespecial #489                // Method startResumeCheckTask:()V
        48: iconst_1
        49: ireturn
        50: iconst_0
        51: ireturn
      StackMapTable: number_of_entries = 2
        frame_type = 48 /* same */
        frame_type = 1 /* same */
      LineNumberTable:
        line 258: 0
        line 259: 17
        line 260: 24
        line 261: 29
        line 262: 44
        line 264: 48
        line 266: 50
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      52     0  this   Lext/mods/gameserver/model/actor/move/CreatureMove;

  public final void repositionAfterAttack(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=7, locals=21, args_size=2
         0: aload_0
         1: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: invokevirtual #579                // Method ext/mods/gameserver/model/actor/Creature.isMovementDisabled:()Z
         7: ifne          20
        10: aload_0
        11: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        14: invokevirtual #582                // Method ext/mods/gameserver/model/actor/Creature.isParalyzed:()Z
        17: ifeq          21
        20: return
        21: aload_0
        22: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        25: checkcast     #27                 // class ext/mods/gameserver/model/WorldObject
        28: aload_1
        29: checkcast     #27                 // class ext/mods/gameserver/model/WorldObject
        32: invokevirtual #585                // Method ext/mods/gameserver/model/WorldObject.distance2D:(Lext/mods/gameserver/model/WorldObject;)D
        35: dstore_2
        36: aload_0
        37: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        40: invokevirtual #589                // Method ext/mods/gameserver/model/actor/Creature.getCast:()Lext/mods/gameserver/model/actor/cast/CreatureCast;
        43: invokevirtual #595                // Method ext/mods/gameserver/model/actor/cast/CreatureCast.getCurrentSkill:()Lext/mods/gameserver/skills/L2Skill;
        46: astore        4
        48: aload         4
        50: ifnull        69
        53: aload         4
        55: invokevirtual #600                // Method ext/mods/gameserver/skills/L2Skill.getCastRange:()I
        58: ifle          69
        61: aload         4
        63: invokevirtual #600                // Method ext/mods/gameserver/skills/L2Skill.getCastRange:()I
        66: goto          79
        69: aload_0
        70: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        73: invokevirtual #603                // Method ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
        76: invokevirtual #606                // Method ext/mods/gameserver/model/actor/status/CreatureStatus.getPhysicalAttackRange:()I
        79: istore        5
        81: aload_0
        82: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        85: invokevirtual #279                // Method ext/mods/gameserver/model/actor/Creature.getCollisionRadius:()D
        88: aload_1
        89: invokevirtual #279                // Method ext/mods/gameserver/model/actor/Creature.getCollisionRadius:()D
        92: dadd
        93: dstore        6
        95: aload_0
        96: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        99: checkcast     #27                 // class ext/mods/gameserver/model/WorldObject
       102: invokevirtual #417                // Method ext/mods/gameserver/model/WorldObject.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
       105: astore        8
       107: ldc2_w        #607                // double 200.0d
       110: dstore        9
       112: dload_2
       113: dload         9
       115: dcmpg
       116: ifge          283
       119: aload_0
       120: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       123: checkcast     #27                 // class ext/mods/gameserver/model/WorldObject
       126: invokevirtual #201                // Method ext/mods/gameserver/model/WorldObject.getX:()I
       129: aload_1
       130: invokevirtual #186                // Method ext/mods/gameserver/model/actor/Creature.getX:()I
       133: isub
       134: istore        11
       136: aload_0
       137: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       140: checkcast     #27                 // class ext/mods/gameserver/model/WorldObject
       143: invokevirtual #200                // Method ext/mods/gameserver/model/WorldObject.getY:()I
       146: aload_1
       147: invokevirtual #189                // Method ext/mods/gameserver/model/actor/Creature.getY:()I
       150: isub
       151: istore        12
       153: iload         12
       155: i2d
       156: iload         11
       158: i2d
       159: invokestatic  #207                // Method java/lang/Math.atan2:(DD)D
       162: dstore        13
       164: aload_1
       165: invokevirtual #186                // Method ext/mods/gameserver/model/actor/Creature.getX:()I
       168: i2d
       169: sipush        400
       172: i2d
       173: dload         13
       175: invokestatic  #219                // Method java/lang/Math.cos:(D)D
       178: dmul
       179: dadd
       180: d2i
       181: istore        15
       183: aload_1
       184: invokevirtual #189                // Method ext/mods/gameserver/model/actor/Creature.getY:()I
       187: i2d
       188: sipush        400
       191: i2d
       192: dload         13
       194: invokestatic  #222                // Method java/lang/Math.sin:(D)D
       197: dmul
       198: dadd
       199: d2i
       200: istore        16
       202: getstatic     #226                // Field geoEngine:Lext/mods/gameserver/geoengine/GeoEngine;
       205: iload         15
       207: iload         16
       209: aload         8
       211: invokevirtual #609                // Method ext/mods/gameserver/model/location/SpawnLocation.getZ:()I
       214: invokevirtual #232                // Method ext/mods/gameserver/geoengine/GeoEngine.getHeight:(III)S
       217: istore        17
       219: new           #18                 // class ext/mods/gameserver/model/location/Location
       222: dup
       223: iload         15
       225: iload         16
       227: iload         17
       229: invokespecial #21                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       232: astore        18
       234: getstatic     #226                // Field geoEngine:Lext/mods/gameserver/geoengine/GeoEngine;
       237: aload         8
       239: invokevirtual #610                // Method ext/mods/gameserver/model/location/SpawnLocation.getX:()I
       242: aload         8
       244: invokevirtual #611                // Method ext/mods/gameserver/model/location/SpawnLocation.getY:()I
       247: aload         8
       249: invokevirtual #609                // Method ext/mods/gameserver/model/location/SpawnLocation.getZ:()I
       252: iload         15
       254: iload         16
       256: iload         17
       258: invokevirtual #236                // Method ext/mods/gameserver/geoengine/GeoEngine.canMoveToTarget:(IIIIII)Z
       261: ifeq          283
       264: aload_0
       265: iload         15
       267: iload         16
       269: invokespecial #615                // Method wouldCollideWithCreature:(II)Z
       272: ifne          283
       275: aload_0
       276: aload         18
       278: iconst_0
       279: invokevirtual #442                // Method moveToLocation:(Lext/mods/gameserver/model/location/Location;Z)V
       282: return
       283: dload_2
       284: iload         5
       286: i2d
       287: dload         6
       289: dadd
       290: bipush        20
       292: i2d
       293: dadd
       294: dcmpl
       295: ifle          299
       298: return
       299: invokestatic  #385                // Method java/util/concurrent/ThreadLocalRandom.current:()Ljava/util/concurrent/ThreadLocalRandom;
       302: invokevirtual #618                // Method java/util/concurrent/ThreadLocalRandom.nextBoolean:()Z
       305: ifeq          314
       308: ldc2_w        #619                // double 45.0d
       311: goto          317
       314: ldc2_w        #621                // double -45.0d
       317: dstore        11
       319: aload_0
       320: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       323: checkcast     #27                 // class ext/mods/gameserver/model/WorldObject
       326: invokevirtual #417                // Method ext/mods/gameserver/model/WorldObject.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
       329: invokevirtual #625                // Method ext/mods/gameserver/model/location/SpawnLocation.getHeading:()I
       332: i2d
       333: ldc2_w        #626                // double 0.005493247882810712d
       336: dmul
       337: invokestatic  #216                // Method java/lang/Math.toRadians:(D)D
       340: dstore        13
       342: dload         13
       344: dload         11
       346: invokestatic  #216                // Method java/lang/Math.toRadians:(D)D
       349: dadd
       350: dstore        15
       352: aload         8
       354: invokevirtual #610                // Method ext/mods/gameserver/model/location/SpawnLocation.getX:()I
       357: i2d
       358: sipush        150
       361: i2d
       362: dload         15
       364: invokestatic  #222                // Method java/lang/Math.sin:(D)D
       367: dmul
       368: dadd
       369: d2i
       370: istore        17
       372: aload         8
       374: invokevirtual #611                // Method ext/mods/gameserver/model/location/SpawnLocation.getY:()I
       377: i2d
       378: sipush        150
       381: i2d
       382: dload         15
       384: invokestatic  #219                // Method java/lang/Math.cos:(D)D
       387: dmul
       388: dadd
       389: d2i
       390: istore        18
       392: getstatic     #226                // Field geoEngine:Lext/mods/gameserver/geoengine/GeoEngine;
       395: iload         17
       397: iload         18
       399: aload         8
       401: invokevirtual #609                // Method ext/mods/gameserver/model/location/SpawnLocation.getZ:()I
       404: invokevirtual #232                // Method ext/mods/gameserver/geoengine/GeoEngine.getHeight:(III)S
       407: istore        19
       409: new           #18                 // class ext/mods/gameserver/model/location/Location
       412: dup
       413: iload         17
       415: iload         18
       417: iload         19
       419: invokespecial #21                 // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       422: astore        20
       424: getstatic     #226                // Field geoEngine:Lext/mods/gameserver/geoengine/GeoEngine;
       427: aload         8
       429: invokevirtual #610                // Method ext/mods/gameserver/model/location/SpawnLocation.getX:()I
       432: aload         8
       434: invokevirtual #611                // Method ext/mods/gameserver/model/location/SpawnLocation.getY:()I
       437: aload         8
       439: invokevirtual #609                // Method ext/mods/gameserver/model/location/SpawnLocation.getZ:()I
       442: iload         17
       444: iload         18
       446: iload         19
       448: invokevirtual #236                // Method ext/mods/gameserver/geoengine/GeoEngine.canMoveToTarget:(IIIIII)Z
       451: ifeq          472
       454: aload_0
       455: iload         17
       457: iload         18
       459: invokespecial #615                // Method wouldCollideWithCreature:(II)Z
       462: ifne          472
       465: aload_0
       466: aload         20
       468: iconst_0
       469: invokevirtual #442                // Method moveToLocation:(Lext/mods/gameserver/model/location/Location;Z)V
       472: return
      StackMapTable: number_of_entries = 9
        frame_type = 20 /* same */
        frame_type = 0 /* same */
        frame_type = 253 /* append */
          offset_delta = 47
          locals = [ double, class ext/mods/gameserver/skills/L2Skill ]
        frame_type = 73 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 203
          locals = [ class ext/mods/gameserver/model/actor/move/CreatureMove, class ext/mods/gameserver/model/actor/Creature, double, class ext/mods/gameserver/skills/L2Skill, int, double, class ext/mods/gameserver/model/location/SpawnLocation, double ]
          stack = []
        frame_type = 15 /* same */
        frame_type = 14 /* same */
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ double ]
        frame_type = 255 /* full_frame */
          offset_delta = 154
          locals = [ class ext/mods/gameserver/model/actor/move/CreatureMove, class ext/mods/gameserver/model/actor/Creature, double, class ext/mods/gameserver/skills/L2Skill, int, double, class ext/mods/gameserver/model/location/SpawnLocation, double, double, double, double, int, int, int, class ext/mods/gameserver/model/location/Location ]
          stack = []
      LineNumberTable:
        line 311: 0
        line 312: 21
        line 314: 36
        line 315: 48
        line 316: 61
        line 318: 69
        line 315: 79
        line 321: 81
        line 322: 95
        line 323: 107
        line 324: 112
        line 325: 119
        line 326: 136
        line 327: 153
        line 328: 164
        line 329: 183
        line 330: 202
        line 332: 219
        line 333: 234
        line 334: 264
        line 335: 275
        line 336: 282
        line 340: 283
        line 341: 298
        line 343: 299
        line 344: 319
        line 345: 342
        line 346: 352
        line 347: 372
        line 348: 392
        line 349: 409
        line 350: 424
        line 351: 454
        line 352: 465
        line 355: 472
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          136     147    11    dx   I
          153     130    12    dy   I
          164     119    13 angle   D
          183     100    15 nextX   I
          202      81    16 nextY   I
          219      64    17 nextZ   I
          234      49    18 escapeDest   Lext/mods/gameserver/model/location/Location;
           36     437     2  dist   D
           48     425     4 currentSkill   Lext/mods/gameserver/skills/L2Skill;
           81     392     5 baseAttackRange   I
           95     378     6 collisionBuffer   D
          107     366     8 currentLoc   Lext/mods/gameserver/model/location/SpawnLocation;
          112     361     9 tooCloseThreshold   D
          319     154    11 angleOffset   D
          342     131    13 currentAngle   D
          352     121    15 newAngle   D
          372     101    17  latX   I
          392      81    18  latY   I
          409      64    19  latZ   I
          424      49    20 lateralDest   Lext/mods/gameserver/model/location/Location;
            0     473     0  this   Lext/mods/gameserver/model/actor/move/CreatureMove;
            0     473     1 target   Lext/mods/gameserver/model/actor/Creature;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #9()
          org.jetbrains.annotations.NotNull

  public boolean updatePosition();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=32, args_size=1
         0: aload_0
         1: getfield      #69                 // Field _task:Ljava/util/concurrent/ScheduledFuture;
         4: ifnull        20
         7: aload_0
         8: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        11: checkcast     #27                 // class ext/mods/gameserver/model/WorldObject
        14: invokevirtual #659                // Method ext/mods/gameserver/model/WorldObject.isVisible:()Z
        17: ifne          22
        20: iconst_1
        21: ireturn
        22: aload_0
        23: invokevirtual #661                // Method getMoveType:()Lext/mods/gameserver/enums/actors/MoveType;
        26: astore_1
        27: aload_0
        28: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        31: checkcast     #27                 // class ext/mods/gameserver/model/WorldObject
        34: invokevirtual #31                 // Method ext/mods/gameserver/model/WorldObject.getZ:()I
        37: istore_2
        38: aload_1
        39: getstatic     #177                // Field ext/mods/gameserver/enums/actors/MoveType.GROUND:Lext/mods/gameserver/enums/actors/MoveType;
        42: if_acmpne     137
        45: aload_0
        46: getfield      #53                 // Field _cachedDestinationX:I
        49: aload_0
        50: getfield      #25                 // Field _destination:Lext/mods/gameserver/model/location/Location;
        53: invokevirtual #407                // Method ext/mods/gameserver/model/location/Location.getX:()I
        56: if_icmpne     73
        59: aload_0
        60: getfield      #56                 // Field _cachedDestinationY:I
        63: aload_0
        64: getfield      #25                 // Field _destination:Lext/mods/gameserver/model/location/Location;
        67: invokevirtual #408                // Method ext/mods/gameserver/model/location/Location.getY:()I
        70: if_icmpeq     137
        73: aload_0
        74: aload_0
        75: getfield      #25                 // Field _destination:Lext/mods/gameserver/model/location/Location;
        78: invokevirtual #407                // Method ext/mods/gameserver/model/location/Location.getX:()I
        81: putfield      #53                 // Field _cachedDestinationX:I
        84: aload_0
        85: aload_0
        86: getfield      #25                 // Field _destination:Lext/mods/gameserver/model/location/Location;
        89: invokevirtual #408                // Method ext/mods/gameserver/model/location/Location.getY:()I
        92: putfield      #56                 // Field _cachedDestinationY:I
        95: aload_0
        96: getstatic     #226                // Field geoEngine:Lext/mods/gameserver/geoengine/GeoEngine;
        99: aload_0
       100: getfield      #25                 // Field _destination:Lext/mods/gameserver/model/location/Location;
       103: invokevirtual #407                // Method ext/mods/gameserver/model/location/Location.getX:()I
       106: aload_0
       107: getfield      #25                 // Field _destination:Lext/mods/gameserver/model/location/Location;
       110: invokevirtual #408                // Method ext/mods/gameserver/model/location/Location.getY:()I
       113: aload_0
       114: getfield      #25                 // Field _destination:Lext/mods/gameserver/model/location/Location;
       117: invokevirtual #409                // Method ext/mods/gameserver/model/location/Location.getZ:()I
       120: invokevirtual #232                // Method ext/mods/gameserver/geoengine/GeoEngine.getHeight:(III)S
       123: putfield      #50                 // Field _cachedDestinationZ:I
       126: aload_0
       127: getfield      #25                 // Field _destination:Lext/mods/gameserver/model/location/Location;
       130: aload_0
       131: getfield      #50                 // Field _cachedDestinationZ:I
       134: invokevirtual #665                // Method ext/mods/gameserver/model/location/Location.setZ:(I)V
       137: aload_0
       138: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       141: invokevirtual #603                // Method ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
       144: invokevirtual #669                // Method ext/mods/gameserver/model/actor/status/CreatureStatus.getMoveSpeed:()F
       147: f2d
       148: ldc2_w        #372                // double 10.0d
       151: ddiv
       152: aload_0
       153: getfield      #59                 // Field _currentSpeedRandomFactor:D
       156: dmul
       157: dstore_3
       158: aload_0
       159: getfield      #25                 // Field _destination:Lext/mods/gameserver/model/location/Location;
       162: invokevirtual #407                // Method ext/mods/gameserver/model/location/Location.getX:()I
       165: i2d
       166: aload_0
       167: getfield      #376                // Field _xAccurate:D
       170: dsub
       171: dstore        5
       173: aload_0
       174: getfield      #25                 // Field _destination:Lext/mods/gameserver/model/location/Location;
       177: invokevirtual #408                // Method ext/mods/gameserver/model/location/Location.getY:()I
       180: i2d
       181: aload_0
       182: getfield      #379                // Field _yAccurate:D
       185: dsub
       186: dstore        7
       188: dload         5
       190: dload         5
       192: dmul
       193: dload         7
       195: dload         7
       197: dmul
       198: dadd
       199: dstore        9
       201: aload_0
       202: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       205: instanceof    #342                // class ext/mods/gameserver/model/actor/Npc
       208: ifeq          222
       211: aload_1
       212: getstatic     #177                // Field ext/mods/gameserver/enums/actors/MoveType.GROUND:Lext/mods/gameserver/enums/actors/MoveType;
       215: if_acmpne     222
       218: aload_0
       219: invokespecial #672                // Method calculateRepulsion:()V
       222: dload_3
       223: dload_3
       224: dmul
       225: dload         9
       227: dcmpl
       228: iflt          284
       231: aload_1
       232: getstatic     #177                // Field ext/mods/gameserver/enums/actors/MoveType.GROUND:Lext/mods/gameserver/enums/actors/MoveType;
       235: if_acmpne     245
       238: aload_0
       239: getfield      #50                 // Field _cachedDestinationZ:I
       242: goto          252
       245: aload_0
       246: getfield      #25                 // Field _destination:Lext/mods/gameserver/model/location/Location;
       249: invokevirtual #409                // Method ext/mods/gameserver/model/location/Location.getZ:()I
       252: istore        11
       254: aload_0
       255: aload_0
       256: getfield      #25                 // Field _destination:Lext/mods/gameserver/model/location/Location;
       259: invokevirtual #407                // Method ext/mods/gameserver/model/location/Location.getX:()I
       262: aload_0
       263: getfield      #25                 // Field _destination:Lext/mods/gameserver/model/location/Location;
       266: invokevirtual #408                // Method ext/mods/gameserver/model/location/Location.getY:()I
       269: iload         11
       271: aload_1
       272: invokevirtual #676                // Method handleNextPosition:(IIILext/mods/gameserver/enums/actors/MoveType;)Z
       275: ifeq          284
       278: aload_0
       279: aload_1
       280: invokespecial #680                // Method checkArrival:(Lext/mods/gameserver/enums/actors/MoveType;)Z
       283: ireturn
       284: dload         9
       286: invokestatic  #683                // Method java/lang/Math.sqrt:(D)D
       289: dstore        11
       291: dload_3
       292: dload         11
       294: ddiv
       295: dstore        13
       297: dload         5
       299: dload         13
       301: dmul
       302: dstore        15
       304: dload         7
       306: dload         13
       308: dmul
       309: dstore        17
       311: aload_0
       312: getfield      #376                // Field _xAccurate:D
       315: dload         15
       317: dadd
       318: aload_0
       319: getfield      #686                // Field _separationForceX:D
       322: dadd
       323: dstore        19
       325: aload_0
       326: getfield      #379                // Field _yAccurate:D
       329: dload         17
       331: dadd
       332: aload_0
       333: getfield      #689                // Field _separationForceY:D
       336: dadd
       337: dstore        21
       339: dload         19
       341: d2i
       342: istore        23
       344: dload         21
       346: d2i
       347: istore        24
       349: aload_1
       350: getstatic     #177                // Field ext/mods/gameserver/enums/actors/MoveType.GROUND:Lext/mods/gameserver/enums/actors/MoveType;
       353: if_acmpne     370
       356: getstatic     #226                // Field geoEngine:Lext/mods/gameserver/geoengine/GeoEngine;
       359: iload         23
       361: iload         24
       363: iload_2
       364: invokevirtual #232                // Method ext/mods/gameserver/geoengine/GeoEngine.getHeight:(III)S
       367: goto          380
       370: aload_0
       371: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       374: checkcast     #27                 // class ext/mods/gameserver/model/WorldObject
       377: invokevirtual #31                 // Method ext/mods/gameserver/model/WorldObject.getZ:()I
       380: istore        25
       382: aload_0
       383: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       386: instanceof    #342                // class ext/mods/gameserver/model/actor/Npc
       389: ifeq          466
       392: aload_1
       393: getstatic     #177                // Field ext/mods/gameserver/enums/actors/MoveType.GROUND:Lext/mods/gameserver/enums/actors/MoveType;
       396: if_acmpne     466
       399: aload_0
       400: getfield      #686                // Field _separationForceX:D
       403: invokestatic  #692                // Method java/lang/Math.abs:(D)D
       406: ldc2_w        #693                // double 0.1d
       409: dcmpl
       410: ifgt          427
       413: aload_0
       414: getfield      #689                // Field _separationForceY:D
       417: invokestatic  #692                // Method java/lang/Math.abs:(D)D
       420: ldc2_w        #693                // double 0.1d
       423: dcmpl
       424: ifle          431
       427: iconst_1
       428: goto          432
       431: iconst_0
       432: istore        26
       434: iload         26
       436: ifne          466
       439: aload_0
       440: iload         23
       442: iload         24
       444: invokespecial #615                // Method wouldCollideWithCreature:(II)Z
       447: ifeq          466
       450: dload         11
       452: ldc2_w        #695                // double 100.0d
       455: dcmpl
       456: ifle          466
       459: aload_0
       460: iconst_1
       461: putfield      #398                // Field _blocked:Z
       464: iconst_1
       465: ireturn
       466: aload_0
       467: iload         23
       469: iload         24
       471: iload         25
       473: aload_1
       474: invokevirtual #676                // Method handleNextPosition:(IIILext/mods/gameserver/enums/actors/MoveType;)Z
       477: ifeq          634
       480: aload_0
       481: dload         19
       483: putfield      #376                // Field _xAccurate:D
       486: aload_0
       487: dload         21
       489: putfield      #379                // Field _yAccurate:D
       492: invokestatic  #132                // Method java/lang/System.currentTimeMillis:()J
       495: lstore        26
       497: lload         26
       499: aload_0
       500: getfield      #364                // Field _lastMoveRequestTime:J
       503: lsub
       504: lstore        28
       506: aload_0
       507: getfield      #686                // Field _separationForceX:D
       510: aload_0
       511: getfield      #686                // Field _separationForceX:D
       514: dmul
       515: aload_0
       516: getfield      #689                // Field _separationForceY:D
       519: aload_0
       520: getfield      #689                // Field _separationForceY:D
       523: dmul
       524: dadd
       525: dstore        30
       527: dload         30
       529: ldc2_w        #697                // double 400.0d
       532: dcmpl
       533: ifle          596
       536: lload         28
       538: ldc2_w        #699                // long 300l
       541: lcmp
       542: ifle          596
       545: aload_0
       546: lload         26
       548: putfield      #364                // Field _lastMoveRequestTime:J
       551: aload_0
       552: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       555: checkcast     #27                 // class ext/mods/gameserver/model/WorldObject
       558: invokevirtual #417                // Method ext/mods/gameserver/model/WorldObject.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
       561: aload_0
       562: getfield      #25                 // Field _destination:Lext/mods/gameserver/model/location/Location;
       565: invokevirtual #422                // Method ext/mods/gameserver/model/location/SpawnLocation.setHeadingTo:(Lext/mods/gameserver/model/location/Location;)V
       568: aload_0
       569: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       572: new           #75                 // class ext/mods/gameserver/network/serverpackets/MoveToLocation
       575: dup
       576: aload_0
       577: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       580: aload_0
       581: getfield      #25                 // Field _destination:Lext/mods/gameserver/model/location/Location;
       584: invokespecial #428                // Method ext/mods/gameserver/network/serverpackets/MoveToLocation."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/location/Location;)V
       587: checkcast     #79                 // class ext/mods/gameserver/network/serverpackets/L2GameServerPacket
       590: invokevirtual #431                // Method ext/mods/gameserver/model/actor/Creature.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       593: goto          632
       596: lload         28
       598: ldc2_w        #137                // long 500l
       601: lcmp
       602: ifle          632
       605: aload_0
       606: lload         26
       608: putfield      #364                // Field _lastMoveRequestTime:J
       611: aload_0
       612: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       615: new           #140                // class ext/mods/gameserver/network/serverpackets/ValidateLocation
       618: dup
       619: aload_0
       620: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       623: invokespecial #143                // Method ext/mods/gameserver/network/serverpackets/ValidateLocation."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
       626: checkcast     #79                 // class ext/mods/gameserver/network/serverpackets/L2GameServerPacket
       629: invokevirtual #431                // Method ext/mods/gameserver/model/actor/Creature.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       632: iconst_0
       633: ireturn
       634: aload_0
       635: invokespecial #703                // Method tryRecalculatePathWithoutRetreat:()Z
       638: ifeq          643
       641: iconst_0
       642: ireturn
       643: aload_0
       644: iconst_1
       645: putfield      #398                // Field _blocked:Z
       648: iconst_1
       649: ireturn
      StackMapTable: number_of_entries = 18
        frame_type = 20 /* same */
        frame_type = 1 /* same */
        frame_type = 253 /* append */
          offset_delta = 50
          locals = [ class ext/mods/gameserver/enums/actors/MoveType, int ]
        frame_type = 63 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 84
          locals = [ class ext/mods/gameserver/model/actor/move/CreatureMove, class ext/mods/gameserver/enums/actors/MoveType, int, double, double, double, double ]
          stack = []
        frame_type = 22 /* same */
        frame_type = 70 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 31 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 85
          locals = [ class ext/mods/gameserver/model/actor/move/CreatureMove, class ext/mods/gameserver/enums/actors/MoveType, int, double, double, double, double, double, double, double, double, double, double, int, int ]
          stack = []
        frame_type = 73 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 46
          locals = [ int ]
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 33 /* same */
        frame_type = 254 /* append */
          offset_delta = 129
          locals = [ long, long, double ]
        frame_type = 35 /* same */
        frame_type = 248 /* chop */
          offset_delta = 1
        frame_type = 8 /* same */
      LineNumberTable:
        line 372: 0
        line 374: 22
        line 375: 27
        line 377: 38
        line 378: 73
        line 379: 84
        line 380: 95
        line 381: 126
        line 384: 137
        line 385: 158
        line 386: 173
        line 387: 188
        line 389: 201
        line 390: 218
        line 393: 222
        line 394: 231
        line 396: 254
        line 397: 278
        line 401: 284
        line 401: 289
        line 402: 291
        line 403: 297
        line 404: 304
        line 406: 311
        line 407: 325
        line 408: 339
        line 409: 344
        line 410: 349
        line 412: 382
        line 413: 399
        line 413: 406
        line 413: 420
        line 414: 434
        line 415: 459
        line 416: 464
        line 420: 466
        line 421: 480
        line 422: 486
        line 424: 492
        line 425: 497
        line 427: 506
        line 429: 527
        line 430: 545
        line 431: 551
        line 432: 568
        line 434: 596
        line 435: 605
        line 436: 611
        line 439: 632
        line 442: 634
        line 443: 641
        line 445: 643
        line 446: 648
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          254      30    11 finalZ   I
          434      32    26 hasRepulsion   Z
          497     137    26   now   J
          506     128    28 timeSinceLastSync   J
          527     107    30 driftSq   D
           27     623     1  type   Lext/mods/gameserver/enums/actors/MoveType;
           38     612     2  curZ   I
          158     492     3 moveSpeed   D
          173     477     5    dx   D
          188     462     7    dy   D
          201     449     9 distSq   D
          291     359    11  dist   D
          297     353    13 fraction   D
          304     346    15 moveX   D
          311     339    17 moveY   D
          325     325    19 nextXAccurate   D
          339     311    21 nextYAccurate   D
          344     306    23 nextX   I
          349     301    24 nextY   I
          382     268    25 nextZ   I
            0     650     0  this   Lext/mods/gameserver/model/actor/move/CreatureMove;

  protected boolean handleNextPosition(int, int, int, ext.mods.gameserver.enums.actors.MoveType);
    descriptor: (IIILext/mods/gameserver/enums/actors/MoveType;)Z
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=7, locals=5, args_size=5
         0: getstatic     #226                // Field geoEngine:Lext/mods/gameserver/geoengine/GeoEngine;
         3: aload_0
         4: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         7: checkcast     #27                 // class ext/mods/gameserver/model/WorldObject
        10: invokevirtual #201                // Method ext/mods/gameserver/model/WorldObject.getX:()I
        13: aload_0
        14: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        17: checkcast     #27                 // class ext/mods/gameserver/model/WorldObject
        20: invokevirtual #200                // Method ext/mods/gameserver/model/WorldObject.getY:()I
        23: aload_0
        24: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        27: checkcast     #27                 // class ext/mods/gameserver/model/WorldObject
        30: invokevirtual #31                 // Method ext/mods/gameserver/model/WorldObject.getZ:()I
        33: iload_1
        34: iload_2
        35: iload_3
        36: invokevirtual #236                // Method ext/mods/gameserver/geoengine/GeoEngine.canMoveToTarget:(IIIIII)Z
        39: ifne          59
        42: aload_0
        43: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        46: instanceof    #81                 // class ext/mods/gameserver/model/actor/Player
        49: ifeq          57
        52: aload_0
        53: iconst_1
        54: invokevirtual #156                // Method syncPlayerLocation:(Z)V
        57: iconst_0
        58: ireturn
        59: aload_0
        60: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        63: checkcast     #27                 // class ext/mods/gameserver/model/WorldObject
        66: iload_1
        67: iload_2
        68: iload_3
        69: invokevirtual #743                // Method ext/mods/gameserver/model/WorldObject.setXYZ:(III)V
        72: aload_0
        73: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        76: iconst_0
        77: invokevirtual #496                // Method ext/mods/gameserver/model/actor/Creature.revalidateZone:(Z)V
        80: iconst_1
        81: ireturn
      StackMapTable: number_of_entries = 2
        frame_type = 57 /* same */
        frame_type = 1 /* same */
      LineNumberTable:
        line 494: 0
        line 495: 42
        line 496: 52
        line 498: 57
        line 500: 59
        line 501: 72
        line 502: 80
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      82     0  this   Lext/mods/gameserver/model/actor/move/CreatureMove;
            0      82     1 nextX   I
            0      82     2 nextY   I
            0      82     3 nextZ   I
            0      82     4  type   Lext/mods/gameserver/enums/actors/MoveType;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
      parameter 1:
      parameter 2:
      parameter 3:
        0: #9()
          org.jetbrains.annotations.NotNull

  public ext.mods.gameserver.model.location.Location calculatePath(int, int, int, int, int, int);
    descriptor: (IIIIII)Lext/mods/gameserver/model/location/Location;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=9, locals=8, args_size=7
         0: getstatic     #406                // Field ext/mods/Config.SISTEMA_PATHFINDING:Z
         3: ifne          8
         6: aconst_null
         7: areturn
         8: getstatic     #226                // Field geoEngine:Lext/mods/gameserver/geoengine/GeoEngine;
        11: iload_1
        12: iload_2
        13: iload_3
        14: iload         4
        16: iload         5
        18: iload         6
        20: invokevirtual #236                // Method ext/mods/gameserver/geoengine/GeoEngine.canMoveToTarget:(IIIIII)Z
        23: ifeq          28
        26: aconst_null
        27: areturn
        28: aload_0
        29: invokespecial #313                // Method isMeleeDebug:()Z
        32: ifeq          122
        35: getstatic     #317                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        38: ldc_w         #745                // String [MeleeDebug][CreatureMove][calculatePath] actor={} from=({}, {}, {}) to=({}, {}, {})
        41: bipush        7
        43: anewarray     #5                  // class java/lang/Object
        46: astore        7
        48: aload         7
        50: iconst_0
        51: aload_0
        52: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        55: checkcast     #27                 // class ext/mods/gameserver/model/WorldObject
        58: invokevirtual #193                // Method ext/mods/gameserver/model/WorldObject.getObjectId:()I
        61: invokestatic  #325                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        64: aastore
        65: aload         7
        67: iconst_1
        68: iload_1
        69: invokestatic  #325                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        72: aastore
        73: aload         7
        75: iconst_2
        76: iload_2
        77: invokestatic  #325                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        80: aastore
        81: aload         7
        83: iconst_3
        84: iload_3
        85: invokestatic  #325                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        88: aastore
        89: aload         7
        91: iconst_4
        92: iload         4
        94: invokestatic  #325                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        97: aastore
        98: aload         7
       100: iconst_5
       101: iload         5
       103: invokestatic  #325                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       106: aastore
       107: aload         7
       109: bipush        6
       111: iload         6
       113: invokestatic  #325                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       116: aastore
       117: aload         7
       119: invokevirtual #336                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
       122: getstatic     #226                // Field geoEngine:Lext/mods/gameserver/geoengine/GeoEngine;
       125: iload_1
       126: iload_2
       127: iload_3
       128: iload         4
       130: iload         5
       132: iload         6
       134: aload_0
       135: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       138: instanceof    #655                // class ext/mods/gameserver/model/actor/Playable
       141: aconst_null
       142: invokevirtual #749                // Method ext/mods/gameserver/geoengine/GeoEngine.findPath:(IIIIIIZLext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
       145: astore        7
       147: aload         7
       149: invokeinterface #754,  1          // InterfaceMethod java/util/List.size:()I
       154: iconst_2
       155: if_icmpge     164
       158: aload_0
       159: invokevirtual #756                // Method addGeoPathFailCount:()V
       162: aconst_null
       163: areturn
       164: aload_0
       165: invokevirtual #758                // Method resetGeoPathFailCount:()V
       168: aload_0
       169: getfield      #42                 // Field _geoPath:Ljava/util/ArrayDeque;
       172: aload         7
       174: checkcast     #246                // class java/util/Collection
       177: invokevirtual #762                // Method java/util/ArrayDeque.addAll:(Ljava/util/Collection;)Z
       180: pop
       181: aload_0
       182: getfield      #42                 // Field _geoPath:Ljava/util/ArrayDeque;
       185: invokevirtual #653                // Method java/util/ArrayDeque.poll:()Ljava/lang/Object;
       188: checkcast     #18                 // class ext/mods/gameserver/model/location/Location
       191: areturn
      StackMapTable: number_of_entries = 4
        frame_type = 8 /* same */
        frame_type = 19 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 93
        frame_type = 252 /* append */
          offset_delta = 41
          locals = [ class java/util/List ]
      LineNumberTable:
        line 505: 0
        line 506: 8
        line 508: 28
        line 509: 35
        line 510: 38
        line 511: 41
        line 509: 119
        line 514: 122
        line 515: 147
        line 516: 158
        line 517: 162
        line 519: 164
        line 520: 168
        line 521: 181
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          147      45     7  path   Ljava/util/List;
            0     192     0  this   Lext/mods/gameserver/model/actor/move/CreatureMove;
            0     192     1    ox   I
            0     192     2    oy   I
            0     192     3    oz   I
            0     192     4    tx   I
            0     192     5    ty   I
            0     192     6    tz   I
    RuntimeInvisibleAnnotations:
      0: #65()
        org.jetbrains.annotations.Nullable

  public final boolean maybeStartOffensiveFollow(ext.mods.gameserver.model.actor.Creature, int);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;I)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=6, locals=12, args_size=3
         0: iload_2
         1: ifge          6
         4: iconst_0
         5: ireturn
         6: aload_0
         7: invokespecial #313                // Method isMeleeDebug:()Z
        10: ifeq          81
        13: getstatic     #317                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        16: ldc_w         #774                // String [MeleeDebug][CreatureMove][maybeStartOffensiveFollow] actor={} target={} range={} dist={}
        19: iconst_4
        20: anewarray     #5                  // class java/lang/Object
        23: astore_3
        24: aload_3
        25: iconst_0
        26: aload_0
        27: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        30: checkcast     #27                 // class ext/mods/gameserver/model/WorldObject
        33: invokevirtual #193                // Method ext/mods/gameserver/model/WorldObject.getObjectId:()I
        36: invokestatic  #325                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        39: aastore
        40: aload_3
        41: iconst_1
        42: aload_1
        43: invokevirtual #775                // Method ext/mods/gameserver/model/actor/Creature.getObjectId:()I
        46: invokestatic  #325                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        49: aastore
        50: aload_3
        51: iconst_2
        52: iload_2
        53: invokestatic  #325                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        56: aastore
        57: aload_3
        58: iconst_3
        59: aload_0
        60: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        63: checkcast     #27                 // class ext/mods/gameserver/model/WorldObject
        66: aload_1
        67: checkcast     #27                 // class ext/mods/gameserver/model/WorldObject
        70: invokevirtual #585                // Method ext/mods/gameserver/model/WorldObject.distance2D:(Lext/mods/gameserver/model/WorldObject;)D
        73: invokestatic  #780                // Method java/lang/Double.valueOf:(D)Ljava/lang/Double;
        76: aastore
        77: aload_3
        78: invokevirtual #336                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
        81: aload_0
        82: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        85: invokevirtual #279                // Method ext/mods/gameserver/model/actor/Creature.getCollisionRadius:()D
        88: aload_1
        89: invokevirtual #279                // Method ext/mods/gameserver/model/actor/Creature.getCollisionRadius:()D
        92: dadd
        93: dstore_3
        94: iload_2
        95: i2d
        96: dload_3
        97: dadd
        98: dstore        5
       100: aload_0
       101: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       104: checkcast     #27                 // class ext/mods/gameserver/model/WorldObject
       107: aload_1
       108: checkcast     #27                 // class ext/mods/gameserver/model/WorldObject
       111: invokevirtual #585                // Method ext/mods/gameserver/model/WorldObject.distance2D:(Lext/mods/gameserver/model/WorldObject;)D
       114: dstore        7
       116: dload         7
       118: dload         5
       120: dcmpg
       121: ifgt          147
       124: aload_0
       125: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       128: invokevirtual #783                // Method ext/mods/gameserver/model/actor/Creature.isMoving:()Z
       131: ifne          141
       134: aload_0
       135: getfield      #434                // Field _followTask:Ljava/util/concurrent/ScheduledFuture;
       138: ifnull        145
       141: aload_0
       142: invokevirtual #786                // Method stop:()V
       145: iconst_0
       146: ireturn
       147: aload_0
       148: getfield      #340                // Field _pawn:Lext/mods/gameserver/model/WorldObject;
       151: aload_1
       152: invokestatic  #268                // Method kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
       155: ifeq          167
       158: aload_0
       159: getfield      #434                // Field _followTask:Ljava/util/concurrent/ScheduledFuture;
       162: ifnull        167
       165: iconst_1
       166: ireturn
       167: aload_0
       168: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       171: invokevirtual #579                // Method ext/mods/gameserver/model/actor/Creature.isMovementDisabled:()Z
       174: ifne          233
       177: aload_0
       178: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       181: invokevirtual #569                // Method ext/mods/gameserver/model/actor/Creature.getAI:()Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
       184: invokevirtual #787                // Method ext/mods/gameserver/model/actor/ai/type/CreatureAI.getCurrentIntention:()Lext/mods/gameserver/model/actor/ai/Intention;
       187: invokevirtual #789                // Method ext/mods/gameserver/model/actor/ai/Intention.canMoveToTarget:()Z
       190: ifeq          233
       193: iload_2
       194: sipush        200
       197: if_icmple     206
       200: ldc2_w        #790                // double 0.8d
       203: goto          209
       206: ldc2_w        #792                // double 0.9d
       209: dstore        9
       211: iload_2
       212: i2d
       213: dload         9
       215: dmul
       216: d2i
       217: bipush        20
       219: invokestatic  #199                // Method kotlin/ranges/RangesKt.coerceAtLeast:(II)I
       222: istore        11
       224: aload_0
       225: aload_1
       226: iload         11
       228: invokevirtual #797                // Method startOffensiveFollow:(Lext/mods/gameserver/model/actor/Creature;I)V
       231: iconst_1
       232: ireturn
       233: iconst_0
       234: ireturn
      StackMapTable: number_of_entries = 9
        frame_type = 6 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 74
        frame_type = 254 /* append */
          offset_delta = 59
          locals = [ double, double, double ]
        frame_type = 3 /* same */
        frame_type = 1 /* same */
        frame_type = 19 /* same */
        frame_type = 38 /* same */
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ double ]
        frame_type = 23 /* same */
      LineNumberTable:
        line 524: 0
        line 526: 6
        line 527: 13
        line 528: 16
        line 529: 19
        line 527: 78
        line 533: 81
        line 534: 94
        line 535: 100
        line 537: 116
        line 538: 124
        line 539: 141
        line 541: 145
        line 543: 147
        line 544: 165
        line 547: 167
        line 548: 193
        line 549: 211
        line 550: 224
        line 551: 231
        line 553: 233
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          211      22     9 safetyMargin   D
          224       9    11 targetOffset   I
           94     141     3 collision   D
          100     135     5 totalRange   D
          116     119     7  dist   D
            0     235     0  this   Lext/mods/gameserver/model/actor/move/CreatureMove;
            0     235     1 target   Lext/mods/gameserver/model/actor/Creature;
            0     235     2 range   I
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #9()
          org.jetbrains.annotations.NotNull
      parameter 1:

  public final void startOffensiveFollow(ext.mods.gameserver.model.actor.Creature, int);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;I)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=6, locals=4, args_size=3
         0: aload_0
         1: getfield      #340                // Field _pawn:Lext/mods/gameserver/model/WorldObject;
         4: aload_1
         5: invokestatic  #268                // Method kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
         8: ifeq          56
        11: aload_0
        12: getfield      #434                // Field _followTask:Ljava/util/concurrent/ScheduledFuture;
        15: ifnull        56
        18: aload_0
        19: getfield      #434                // Field _followTask:Ljava/util/concurrent/ScheduledFuture;
        22: dup
        23: invokestatic  #804                // Method kotlin/jvm/internal/Intrinsics.checkNotNull:(Ljava/lang/Object;)V
        26: invokeinterface #809,  1          // InterfaceMethod java/util/concurrent/ScheduledFuture.isDone:()Z
        31: ifne          56
        34: aload_0
        35: getfield      #434                // Field _followTask:Ljava/util/concurrent/ScheduledFuture;
        38: dup
        39: invokestatic  #804                // Method kotlin/jvm/internal/Intrinsics.checkNotNull:(Ljava/lang/Object;)V
        42: invokeinterface #812,  1          // InterfaceMethod java/util/concurrent/ScheduledFuture.isCancelled:()Z
        47: ifne          56
        50: aload_0
        51: iload_2
        52: putfield      #355                // Field _offset:I
        55: return
        56: aload_0
        57: invokespecial #313                // Method isMeleeDebug:()Z
        60: ifeq          111
        63: getstatic     #317                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        66: ldc_w         #814                // String [MeleeDebug][CreatureMove][startOffensiveFollow] actor={} target={} offset={}
        69: iconst_3
        70: anewarray     #5                  // class java/lang/Object
        73: astore_3
        74: aload_3
        75: iconst_0
        76: aload_0
        77: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        80: checkcast     #27                 // class ext/mods/gameserver/model/WorldObject
        83: invokevirtual #193                // Method ext/mods/gameserver/model/WorldObject.getObjectId:()I
        86: invokestatic  #325                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        89: aastore
        90: aload_3
        91: iconst_1
        92: aload_1
        93: invokevirtual #775                // Method ext/mods/gameserver/model/actor/Creature.getObjectId:()I
        96: invokestatic  #325                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        99: aastore
       100: aload_3
       101: iconst_2
       102: iload_2
       103: invokestatic  #325                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       106: aastore
       107: aload_3
       108: invokevirtual #336                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
       111: aload_0
       112: invokevirtual #817                // Method cancelFollowTask:()V
       115: aload_0
       116: aload_1
       117: checkcast     #27                 // class ext/mods/gameserver/model/WorldObject
       120: putfield      #340                // Field _pawn:Lext/mods/gameserver/model/WorldObject;
       123: aload_0
       124: iload_2
       125: putfield      #355                // Field _offset:I
       128: aload_0
       129: aload_0
       130: aload_1
       131: iload_2
       132: invokedynamic #825,  0            // InvokeDynamic #3:run:(Lext/mods/gameserver/model/actor/move/CreatureMove;Lext/mods/gameserver/model/actor/Creature;I)Ljava/lang/Runnable;
       137: lconst_0
       138: ldc2_w        #365                // long 100l
       141: invokestatic  #473                // Method ext/mods/commons/pool/CoroutinePool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
       144: putfield      #434                // Field _followTask:Ljava/util/concurrent/ScheduledFuture;
       147: return
      StackMapTable: number_of_entries = 2
        frame_type = 56 /* same */
        frame_type = 54 /* same */
      LineNumberTable:
        line 556: 0
        line 557: 50
        line 558: 55
        line 561: 56
        line 562: 63
        line 563: 66
        line 564: 69
        line 562: 108
        line 568: 111
        line 569: 115
        line 570: 123
        line 572: 128
        line 574: 137
        line 572: 141
        line 575: 147
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     148     0  this   Lext/mods/gameserver/model/actor/move/CreatureMove;
            0     148     1  pawn   Lext/mods/gameserver/model/actor/Creature;
            0     148     2 offset   I
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #9()
          org.jetbrains.annotations.NotNull
      parameter 1:

  protected void offensiveFollowTask(ext.mods.gameserver.model.actor.Creature, int);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;I)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=6, locals=10, args_size=3
         0: aload_0
         1: getfield      #434                // Field _followTask:Ljava/util/concurrent/ScheduledFuture;
         4: astore_3
         5: aload_3
         6: ifnull        39
         9: aload_3
        10: invokeinterface #812,  1          // InterfaceMethod java/util/concurrent/ScheduledFuture.isCancelled:()Z
        15: ifne          39
        18: aload_1
        19: invokevirtual #271                // Method ext/mods/gameserver/model/actor/Creature.isAlikeDead:()Z
        22: ifne          39
        25: aload_0
        26: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        29: aload_1
        30: checkcast     #27                 // class ext/mods/gameserver/model/WorldObject
        33: invokevirtual #555                // Method ext/mods/gameserver/model/actor/Creature.knows:(Lext/mods/gameserver/model/WorldObject;)Z
        36: ifne          48
        39: aload_0
        40: invokevirtual #817                // Method cancelFollowTask:()V
        43: aload_0
        44: invokevirtual #786                // Method stop:()V
        47: return
        48: aload_0
        49: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        52: checkcast     #27                 // class ext/mods/gameserver/model/WorldObject
        55: aload_1
        56: checkcast     #27                 // class ext/mods/gameserver/model/WorldObject
        59: invokevirtual #585                // Method ext/mods/gameserver/model/WorldObject.distance2D:(Lext/mods/gameserver/model/WorldObject;)D
        62: dstore        4
        64: iload_2
        65: i2d
        66: aload_0
        67: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        70: invokevirtual #279                // Method ext/mods/gameserver/model/actor/Creature.getCollisionRadius:()D
        73: dadd
        74: aload_1
        75: invokevirtual #279                // Method ext/mods/gameserver/model/actor/Creature.getCollisionRadius:()D
        78: dadd
        79: dstore        6
        81: aload_0
        82: invokespecial #313                // Method isMeleeDebug:()Z
        85: ifeq          151
        88: getstatic     #317                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        91: ldc_w         #830                // String [MeleeDebug][CreatureMove][offensiveFollowTask] actor={} target={} dist={} range={}
        94: iconst_4
        95: anewarray     #5                  // class java/lang/Object
        98: astore        8
       100: aload         8
       102: iconst_0
       103: aload_0
       104: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       107: checkcast     #27                 // class ext/mods/gameserver/model/WorldObject
       110: invokevirtual #193                // Method ext/mods/gameserver/model/WorldObject.getObjectId:()I
       113: invokestatic  #325                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       116: aastore
       117: aload         8
       119: iconst_1
       120: aload_1
       121: invokevirtual #775                // Method ext/mods/gameserver/model/actor/Creature.getObjectId:()I
       124: invokestatic  #325                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       127: aastore
       128: aload         8
       130: iconst_2
       131: dload         4
       133: invokestatic  #780                // Method java/lang/Double.valueOf:(D)Ljava/lang/Double;
       136: aastore
       137: aload         8
       139: iconst_3
       140: dload         6
       142: invokestatic  #780                // Method java/lang/Double.valueOf:(D)Ljava/lang/Double;
       145: aastore
       146: aload         8
       148: invokevirtual #336                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
       151: dload         4
       153: dload         6
       155: dcmpg
       156: ifgt          164
       159: aload_0
       160: invokevirtual #786                // Method stop:()V
       163: return
       164: aload_1
       165: invokevirtual #831                // Method ext/mods/gameserver/model/actor/Creature.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
       168: astore        8
       170: aload_0
       171: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       174: invokevirtual #783                // Method ext/mods/gameserver/model/actor/Creature.isMoving:()Z
       177: ifeq          199
       180: aload_0
       181: getfield      #25                 // Field _destination:Lext/mods/gameserver/model/location/Location;
       184: aload         8
       186: checkcast     #368                // class ext/mods/gameserver/model/location/Point2D
       189: invokevirtual #371                // Method ext/mods/gameserver/model/location/Location.distance2D:(Lext/mods/gameserver/model/location/Point2D;)D
       192: ldc2_w        #832                // double 32.0d
       195: dcmpl
       196: ifle          321
       199: aload_0
       200: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       203: instanceof    #81                 // class ext/mods/gameserver/model/actor/Player
       206: ifeq          269
       209: getstatic     #406                // Field ext/mods/Config.SISTEMA_PATHFINDING:Z
       212: ifeq          269
       215: getstatic     #226                // Field geoEngine:Lext/mods/gameserver/geoengine/GeoEngine;
       218: aload_0
       219: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       222: checkcast     #27                 // class ext/mods/gameserver/model/WorldObject
       225: invokevirtual #417                // Method ext/mods/gameserver/model/WorldObject.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
       228: checkcast     #18                 // class ext/mods/gameserver/model/location/Location
       231: aload         8
       233: checkcast     #18                 // class ext/mods/gameserver/model/location/Location
       236: invokevirtual #836                // Method ext/mods/gameserver/geoengine/GeoEngine.canMoveToTarget:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Z
       239: ifne          269
       242: getstatic     #226                // Field geoEngine:Lext/mods/gameserver/geoengine/GeoEngine;
       245: aload_0
       246: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       249: checkcast     #27                 // class ext/mods/gameserver/model/WorldObject
       252: invokevirtual #417                // Method ext/mods/gameserver/model/WorldObject.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
       255: checkcast     #18                 // class ext/mods/gameserver/model/location/Location
       258: aload         8
       260: checkcast     #18                 // class ext/mods/gameserver/model/location/Location
       263: invokevirtual #840                // Method ext/mods/gameserver/geoengine/GeoEngine.getValidLocation:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/location/Location;
       266: goto          274
       269: aload         8
       271: checkcast     #18                 // class ext/mods/gameserver/model/location/Location
       274: astore        9
       276: aload_0
       277: aload         9
       279: dload         4
       281: ldc2_w        #402                // double 300.0d
       284: dcmpl
       285: ifle          292
       288: iconst_1
       289: goto          293
       292: iconst_0
       293: invokevirtual #442                // Method moveToLocation:(Lext/mods/gameserver/model/location/Location;Z)V
       296: aload_0
       297: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       300: instanceof    #81                 // class ext/mods/gameserver/model/actor/Player
       303: ifeq          321
       306: aload         9
       308: aload         8
       310: invokestatic  #268                // Method kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
       313: ifne          321
       316: aload_0
       317: iconst_1
       318: invokevirtual #156                // Method syncPlayerLocation:(Z)V
       321: return
      StackMapTable: number_of_entries = 10
        frame_type = 252 /* append */
          offset_delta = 39
          locals = [ class java/util/concurrent/ScheduledFuture ]
        frame_type = 8 /* same */
        frame_type = 253 /* append */
          offset_delta = 102
          locals = [ double, double ]
        frame_type = 12 /* same */
        frame_type = 252 /* append */
          offset_delta = 34
          locals = [ class ext/mods/gameserver/model/location/SpawnLocation ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 69
        frame_type = 68 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/location/Location ]
        frame_type = 255 /* full_frame */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/model/actor/move/CreatureMove, class ext/mods/gameserver/model/actor/Creature, int, class java/util/concurrent/ScheduledFuture, double, double, class ext/mods/gameserver/model/location/SpawnLocation, class ext/mods/gameserver/model/location/Location ]
          stack = [ class ext/mods/gameserver/model/actor/move/CreatureMove, class ext/mods/gameserver/model/location/Location ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/move/CreatureMove, class ext/mods/gameserver/model/actor/Creature, int, class java/util/concurrent/ScheduledFuture, double, double, class ext/mods/gameserver/model/location/SpawnLocation, class ext/mods/gameserver/model/location/Location ]
          stack = [ class ext/mods/gameserver/model/actor/move/CreatureMove, class ext/mods/gameserver/model/location/Location, int ]
        frame_type = 250 /* chop */
          offset_delta = 27
      LineNumberTable:
        line 577: 0
        line 578: 5
        line 579: 39
        line 580: 43
        line 581: 47
        line 583: 48
        line 584: 64
        line 586: 81
        line 587: 88
        line 588: 91
        line 589: 94
        line 587: 148
        line 593: 151
        line 594: 159
        line 595: 163
        line 597: 164
        line 598: 170
        line 599: 199
        line 600: 242
        line 602: 269
        line 599: 274
        line 604: 276
        line 605: 296
        line 606: 316
        line 609: 321
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          276      45     9 movePos   Lext/mods/gameserver/model/location/Location;
            5     317     3 currentTask   Ljava/util/concurrent/ScheduledFuture;
           64     258     4  dist   D
           81     241     6 range   D
          170     152     8 targetPos   Lext/mods/gameserver/model/location/SpawnLocation;
            0     322     0  this   Lext/mods/gameserver/model/actor/move/CreatureMove;
            0     322     1 target   Lext/mods/gameserver/model/actor/Creature;
            0     322     2 offset   I
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #9()
          org.jetbrains.annotations.NotNull
      parameter 1:

  public final void startFriendlyFollow(ext.mods.gameserver.model.actor.Creature, int);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;I)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=6, locals=3, args_size=3
         0: aload_0
         1: getfield      #340                // Field _pawn:Lext/mods/gameserver/model/WorldObject;
         4: aload_1
         5: invokestatic  #268                // Method kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
         8: ifeq          51
        11: aload_0
        12: getfield      #434                // Field _followTask:Ljava/util/concurrent/ScheduledFuture;
        15: ifnull        51
        18: aload_0
        19: getfield      #434                // Field _followTask:Ljava/util/concurrent/ScheduledFuture;
        22: dup
        23: invokestatic  #804                // Method kotlin/jvm/internal/Intrinsics.checkNotNull:(Ljava/lang/Object;)V
        26: invokeinterface #809,  1          // InterfaceMethod java/util/concurrent/ScheduledFuture.isDone:()Z
        31: ifne          51
        34: aload_0
        35: getfield      #434                // Field _followTask:Ljava/util/concurrent/ScheduledFuture;
        38: dup
        39: invokestatic  #804                // Method kotlin/jvm/internal/Intrinsics.checkNotNull:(Ljava/lang/Object;)V
        42: invokeinterface #812,  1          // InterfaceMethod java/util/concurrent/ScheduledFuture.isCancelled:()Z
        47: ifne          51
        50: return
        51: aload_0
        52: invokevirtual #817                // Method cancelFollowTask:()V
        55: aload_0
        56: aload_1
        57: checkcast     #27                 // class ext/mods/gameserver/model/WorldObject
        60: putfield      #340                // Field _pawn:Lext/mods/gameserver/model/WorldObject;
        63: aload_0
        64: iload_2
        65: putfield      #355                // Field _offset:I
        68: aload_0
        69: aload_0
        70: aload_1
        71: iload_2
        72: invokedynamic #849,  0            // InvokeDynamic #4:run:(Lext/mods/gameserver/model/actor/move/CreatureMove;Lext/mods/gameserver/model/actor/Creature;I)Ljava/lang/Runnable;
        77: lconst_0
        78: ldc2_w        #850                // long 1000l
        81: invokestatic  #473                // Method ext/mods/commons/pool/CoroutinePool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
        84: putfield      #434                // Field _followTask:Ljava/util/concurrent/ScheduledFuture;
        87: return
      StackMapTable: number_of_entries = 1
        frame_type = 51 /* same */
      LineNumberTable:
        line 611: 0
        line 612: 50
        line 614: 51
        line 615: 55
        line 616: 63
        line 617: 68
        line 618: 87
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      88     0  this   Lext/mods/gameserver/model/actor/move/CreatureMove;
            0      88     1  pawn   Lext/mods/gameserver/model/actor/Creature;
            0      88     2 offset   I
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #9()
          org.jetbrains.annotations.NotNull
      parameter 1:

  protected void friendlyFollowTask(ext.mods.gameserver.model.actor.Creature, int);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;I)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=4, locals=7, args_size=3
         0: aload_0
         1: getfield      #434                // Field _followTask:Ljava/util/concurrent/ScheduledFuture;
         4: ifnull        21
         7: aload_0
         8: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        11: aload_1
        12: checkcast     #27                 // class ext/mods/gameserver/model/WorldObject
        15: invokevirtual #555                // Method ext/mods/gameserver/model/actor/Creature.knows:(Lext/mods/gameserver/model/WorldObject;)Z
        18: ifne          26
        21: aload_0
        22: invokevirtual #817                // Method cancelFollowTask:()V
        25: return
        26: aload_0
        27: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        30: checkcast     #27                 // class ext/mods/gameserver/model/WorldObject
        33: aload_1
        34: checkcast     #27                 // class ext/mods/gameserver/model/WorldObject
        37: invokevirtual #585                // Method ext/mods/gameserver/model/WorldObject.distance2D:(Lext/mods/gameserver/model/WorldObject;)D
        40: dstore_3
        41: iload_2
        42: i2d
        43: aload_0
        44: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        47: invokevirtual #279                // Method ext/mods/gameserver/model/actor/Creature.getCollisionRadius:()D
        50: dadd
        51: aload_1
        52: invokevirtual #279                // Method ext/mods/gameserver/model/actor/Creature.getCollisionRadius:()D
        55: dadd
        56: dstore        5
        58: dload_3
        59: dload         5
        61: dcmpg
        62: ifgt          66
        65: return
        66: aload_0
        67: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        70: invokevirtual #783                // Method ext/mods/gameserver/model/actor/Creature.isMoving:()Z
        73: ifeq          97
        76: aload_0
        77: getfield      #25                 // Field _destination:Lext/mods/gameserver/model/location/Location;
        80: aload_1
        81: invokevirtual #831                // Method ext/mods/gameserver/model/actor/Creature.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
        84: checkcast     #368                // class ext/mods/gameserver/model/location/Point2D
        87: invokevirtual #371                // Method ext/mods/gameserver/model/location/Location.distance2D:(Lext/mods/gameserver/model/location/Point2D;)D
        90: ldc2_w        #853                // double 64.0d
        93: dcmpl
        94: ifle          109
        97: aload_0
        98: aload_1
        99: invokevirtual #831                // Method ext/mods/gameserver/model/actor/Creature.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
       102: checkcast     #18                 // class ext/mods/gameserver/model/location/Location
       105: iconst_1
       106: invokevirtual #442                // Method moveToLocation:(Lext/mods/gameserver/model/location/Location;Z)V
       109: return
      StackMapTable: number_of_entries = 5
        frame_type = 21 /* same */
        frame_type = 4 /* same */
        frame_type = 253 /* append */
          offset_delta = 39
          locals = [ double, double ]
        frame_type = 30 /* same */
        frame_type = 11 /* same */
      LineNumberTable:
        line 620: 0
        line 621: 21
        line 622: 25
        line 624: 26
        line 625: 41
        line 626: 58
        line 628: 66
        line 629: 97
        line 631: 109
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           41      69     3  dist   D
           58      52     5 range   D
            0     110     0  this   Lext/mods/gameserver/model/actor/move/CreatureMove;
            0     110     1 target   Lext/mods/gameserver/model/actor/Creature;
            0     110     2 offset   I
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #9()
          org.jetbrains.annotations.NotNull
      parameter 1:

  public void stop();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=1
         0: aload_0
         1: getfield      #434                // Field _followTask:Ljava/util/concurrent/ScheduledFuture;
         4: ifnull        11
         7: iconst_1
         8: goto          12
        11: iconst_0
        12: istore_1
        13: aload_0
        14: getfield      #69                 // Field _task:Ljava/util/concurrent/ScheduledFuture;
        17: ifnull        24
        20: iconst_1
        21: goto          25
        24: iconst_0
        25: istore_2
        26: aload_0
        27: invokevirtual #817                // Method cancelFollowTask:()V
        30: iload_2
        31: ifeq          77
        34: aload_0
        35: invokevirtual #493                // Method cancelMoveTask:()V
        38: aload_0
        39: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        42: new           #498                // class ext/mods/gameserver/network/serverpackets/StopMove
        45: dup
        46: aload_0
        47: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        50: invokespecial #499                // Method ext/mods/gameserver/network/serverpackets/StopMove."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
        53: checkcast     #79                 // class ext/mods/gameserver/network/serverpackets/L2GameServerPacket
        56: invokevirtual #431                // Method ext/mods/gameserver/model/actor/Creature.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        59: aload_0
        60: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        63: iconst_1
        64: invokevirtual #496                // Method ext/mods/gameserver/model/actor/Creature.revalidateZone:(Z)V
        67: aload_0
        68: getstatic     #508                // Field ext/mods/gameserver/enums/AiEventType.ARRIVED:Lext/mods/gameserver/enums/AiEventType;
        71: invokespecial #512                // Method notifyArrived:(Lext/mods/gameserver/enums/AiEventType;)V
        74: goto          88
        77: iload_1
        78: ifeq          88
        81: aload_0
        82: getstatic     #508                // Field ext/mods/gameserver/enums/AiEventType.ARRIVED:Lext/mods/gameserver/enums/AiEventType;
        85: invokespecial #512                // Method notifyArrived:(Lext/mods/gameserver/enums/AiEventType;)V
        88: return
      StackMapTable: number_of_entries = 6
        frame_type = 11 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 11
          locals = [ int ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 51
          locals = [ int ]
        frame_type = 10 /* same */
      LineNumberTable:
        line 633: 0
        line 634: 13
        line 636: 26
        line 637: 30
        line 638: 34
        line 639: 38
        line 640: 59
        line 641: 67
        line 642: 77
        line 643: 81
        line 645: 88
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           13      76     1 wasFollowing   Z
           26      63     2 wasMoving   Z
            0      89     0  this   Lext/mods/gameserver/model/actor/move/CreatureMove;

  public void cancelMoveTask();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #69                 // Field _task:Ljava/util/concurrent/ScheduledFuture;
         4: dup
         5: ifnull        18
         8: iconst_1
         9: invokeinterface #859,  2          // InterfaceMethod java/util/concurrent/ScheduledFuture.cancel:(Z)Z
        14: pop
        15: goto          19
        18: pop
        19: aload_0
        20: aconst_null
        21: putfield      #69                 // Field _task:Ljava/util/concurrent/ScheduledFuture;
        24: return
      StackMapTable: number_of_entries = 2
        frame_type = 82 /* same_locals_1_stack_item */
          stack = [ class java/util/concurrent/ScheduledFuture ]
        frame_type = 0 /* same */
      LineNumberTable:
        line 647: 0
        line 648: 19
        line 649: 24
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/gameserver/model/actor/move/CreatureMove;

  public final void cancelFollowTask();
    descriptor: ()V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #434                // Field _followTask:Ljava/util/concurrent/ScheduledFuture;
         4: dup
         5: ifnull        18
         8: iconst_0
         9: invokeinterface #859,  2          // InterfaceMethod java/util/concurrent/ScheduledFuture.cancel:(Z)Z
        14: pop
        15: goto          19
        18: pop
        19: aload_0
        20: aconst_null
        21: putfield      #434                // Field _followTask:Ljava/util/concurrent/ScheduledFuture;
        24: aload_0
        25: aconst_null
        26: putfield      #340                // Field _pawn:Lext/mods/gameserver/model/WorldObject;
        29: return
      StackMapTable: number_of_entries = 2
        frame_type = 82 /* same_locals_1_stack_item */
          stack = [ class java/util/concurrent/ScheduledFuture ]
        frame_type = 0 /* same */
      LineNumberTable:
        line 651: 0
        line 652: 19
        line 653: 24
        line 654: 29
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      30     0  this   Lext/mods/gameserver/model/actor/move/CreatureMove;

  public final boolean isOnLastPawnMoveGeoPath();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #42                 // Field _geoPath:Ljava/util/ArrayDeque;
         4: invokevirtual #650                // Method java/util/ArrayDeque.isEmpty:()Z
         7: ifeq          24
        10: aload_0
        11: getfield      #340                // Field _pawn:Lext/mods/gameserver/model/WorldObject;
        14: instanceof    #142                // class ext/mods/gameserver/model/actor/Creature
        17: ifeq          24
        20: iconst_1
        21: goto          25
        24: iconst_0
        25: ireturn
      StackMapTable: number_of_entries = 2
        frame_type = 24 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
      LineNumberTable:
        line 655: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/model/actor/move/CreatureMove;

  public void avoidAttack(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=2, args_size=2
         0: return
      LineNumberTable:
        line 656: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/move/CreatureMove;
            0       1     1 attacker   Lext/mods/gameserver/model/actor/Creature;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #9()
          org.jetbrains.annotations.NotNull

  public final boolean maybeStartFriendlyFollow(ext.mods.gameserver.model.actor.Creature, int);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;I)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: invokevirtual #579                // Method ext/mods/gameserver/model/actor/Creature.isMovementDisabled:()Z
         7: ifeq          12
        10: iconst_0
        11: ireturn
        12: aload_0
        13: aload_1
        14: iload_2
        15: invokevirtual #865                // Method startFriendlyFollow:(Lext/mods/gameserver/model/actor/Creature;I)V
        18: iconst_1
        19: ireturn
      StackMapTable: number_of_entries = 1
        frame_type = 12 /* same */
      LineNumberTable:
        line 658: 0
        line 659: 12
        line 660: 18
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/model/actor/move/CreatureMove;
            0      20     1 target   Lext/mods/gameserver/model/actor/Creature;
            0      20     2 range   I
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #9()
          org.jetbrains.annotations.NotNull
      parameter 1:

  public final boolean maybeMoveToLocation(ext.mods.gameserver.model.location.Location, int, boolean, boolean);
    descriptor: (Lext/mods/gameserver/model/location/Location;IZZ)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=5, args_size=5
         0: aload_0
         1: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #27                 // class ext/mods/gameserver/model/WorldObject
         7: aload_1
         8: iload_2
         9: invokevirtual #871                // Method ext/mods/gameserver/model/WorldObject.isIn3DRadius:(Lext/mods/gameserver/model/location/Location;I)Z
        12: ifeq          17
        15: iconst_0
        16: ireturn
        17: aload_0
        18: getfield      #16                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        21: invokevirtual #579                // Method ext/mods/gameserver/model/actor/Creature.isMovementDisabled:()Z
        24: ifne          32
        27: iload         4
        29: ifeq          34
        32: iconst_1
        33: ireturn
        34: aload_0
        35: aconst_null
        36: putfield      #340                // Field _pawn:Lext/mods/gameserver/model/WorldObject;
        39: aload_0
        40: iconst_0
        41: putfield      #355                // Field _offset:I
        44: aload_0
        45: aload_1
        46: iload_3
        47: invokevirtual #442                // Method moveToLocation:(Lext/mods/gameserver/model/location/Location;Z)V
        50: iconst_1
        51: ireturn
      StackMapTable: number_of_entries = 3
        frame_type = 17 /* same */
        frame_type = 14 /* same */
        frame_type = 1 /* same */
      LineNumberTable:
        line 663: 0
        line 664: 17
        line 665: 34
        line 666: 39
        line 667: 44
        line 669: 50
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      52     0  this   Lext/mods/gameserver/model/actor/move/CreatureMove;
            0      52     1 destination   Lext/mods/gameserver/model/location/Location;
            0      52     2 offset   I
            0      52     3 pathfinding   Z
            0      52     4 isShiftPressed   Z
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #9()
          org.jetbrains.annotations.NotNull
      parameter 1:
      parameter 2:
      parameter 3:

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: new           #978                // class ext/mods/gameserver/model/actor/move/CreatureMove$Companion
         3: dup
         4: aconst_null
         5: invokespecial #981                // Method ext/mods/gameserver/model/actor/move/CreatureMove$Companion."<init>":(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
         8: putstatic     #985                // Field Companion:Lext/mods/gameserver/model/actor/move/CreatureMove$Companion;
        11: new           #332                // class ext/mods/commons/logging/CLogger
        14: dup
        15: ldc           #2                  // class ext/mods/gameserver/model/actor/move/CreatureMove
        17: invokevirtual #991                // Method java/lang/Class.getName:()Ljava/lang/String;
        20: invokespecial #992                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        23: putstatic     #317                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        26: getstatic     #995                // Field ext/mods/gameserver/geoengine/GeoEngine.Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
        29: invokevirtual #1001               // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
        32: putstatic     #226                // Field geoEngine:Lext/mods/gameserver/geoengine/GeoEngine;
        35: getstatic     #1005               // Field ext/mods/Config.GEOENGINE_FILE:Ljava/lang/String;
        38: invokestatic  #1009               // Method ext/mods/Config.initProperties:(Ljava/lang/String;)Lext/mods/commons/config/ExProperties;
        41: putstatic     #1013               // Field GEOENGINE_PROPS:Lext/mods/commons/config/ExProperties;
        44: getstatic     #1013               // Field GEOENGINE_PROPS:Lext/mods/commons/config/ExProperties;
        47: ldc_w         #1015               // String MovementUpdateInterval
        50: ldc2_w        #1016               // long 80l
        53: invokevirtual #1023               // Method ext/mods/commons/config/ExProperties.getProperty:(Ljava/lang/String;J)J
        56: putstatic     #450                // Field MOVEMENT_UPDATE_INTERVAL:J
        59: return
      LineNumberTable:
        line 54: 11
        line 58: 26
        line 59: 35
        line 60: 44
}
InnerClasses:
  public static final #982= #997 of #228; // Companion=class ext/mods/gameserver/geoengine/GeoEngine$Companion of class ext/mods/gameserver/geoengine/GeoEngine
  public static final #982= #978 of #2;   // Companion=class ext/mods/gameserver/model/actor/move/CreatureMove$Companion of class ext/mods/gameserver/model/actor/move/CreatureMove
Signature: #3                           // <T:Lext/mods/gameserver/model/actor/Creature;>Ljava/lang/Object;
SourceFile: "CreatureMove.kt"
SourceDebugExtension:
  SMAP
  CreatureMove.kt
  Kotlin
  *S Kotlin
  *F
  + 1 CreatureMove.kt
  ext/mods/gameserver/model/actor/move/CreatureMove
  + 2 _Collections.kt
  kotlin/collections/CollectionsKt___CollectionsKt
  + 3 fake.kt
  kotlin/jvm/internal/FakeKt
  *L
  1#1,745:1
  1807#2,3:746
  1807#2,3:749
  296#2,2:753
  1807#2,3:755
  1807#2,3:758
  1#3:752
  *S KotlinDebug
  *F
  + 1 CreatureMove.kt
  ext/mods/gameserver/model/actor/move/CreatureMove
  *L
  160#1:746,3
  239#1:749,3
  694#1:753,2
  715#1:755,3
  726#1:758,3
  *E
RuntimeVisibleAnnotations:
  0: #1031(#1032=[I#1033,I#1034,I#1035],#1036=I#1037,#1038=I#1039,#1040=[s#1041],#1042=[s#61,s#1043,s#14,s#1044,s#13,s#6,s#7,s#14,s#337,s#338,s#353,s#1044,s#396,s#1044,s#159,s#1044,s#22,s#23,s#374,s#1044,s#377,s#32,s#684,s#687,s#39,s#40,s#43,s#66,s#67,s#432,s#103,s#90,s#98,s#47,s#51,s#54,s#57,s#362,s#1044,s#543,s#133,s#939,s#479,s#484,s#62,s#70,s#72,s#1044,s#86,s#87,s#88,s#94,s#96,s#97,s#101,s#102,s#106,s#107,s#113,s#126,s#145,s#157,s#166,s#178,s#180,s#181,s#182,s#308,s#309,s#310,s#438,s#439,s#440,s#343,s#423,s#475,s#490,s#509,s#575,s#503,s#576,s#649,s#656,s#670,s#673,s#631,s#632,s#633,s#410,s#765,s#766,s#767,s#768,s#769,s#770,s#771,s#802,s#794,s#826,s#827,s#828,s#844,s#852,s#784,s#491,s#815,s#860,s#861,s#862,s#863,s#866,s#872,s#677,s#701,s#612,s#926,s#927,s#476,s#487,s#982,s#1045])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b)\b\u0016\u0018\u0000 w*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0001wB\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\f\u0010,\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001cJ\u0006\u0010-\u001a\u00020\u0011J\u000e\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201J\u0006\u00102\u001a\u00020\rJ\u000e\u00103\u001a\u00020/2\u0006\u00104\u001a\u00020\rJ\u0006\u00105\u001a\u00020\rJ\u000e\u00106\u001a\u00020/2\u0006\u00104\u001a\u00020\rJ\u0006\u00107\u001a\u00020\u000bJ\u0006\u00108\u001a\u00020/J\u0006\u00109\u001a\u00020/J\b\u0010:\u001a\u00020\rH\u0002J\u0012\u0010;\u001a\u00020/2\b\b\u0002\u0010<\u001a\u00020\rH\u0004J\u0006\u0010=\u001a\u00020>J\u000e\u0010?\u001a\u00020/2\u0006\u0010@\u001a\u00020>J\u000e\u0010A\u001a\u00020/2\u0006\u0010@\u001a\u00020>J\u0018\u0010B\u001a\u0004\u0018\u00010\u00112\u0006\u0010C\u001a\u00020\u00022\u0006\u0010D\u001a\u00020\u000bJ\u0018\u0010E\u001a\u00020/2\u0006\u0010F\u001a\u00020\u00112\u0006\u0010G\u001a\u00020\rH\u0014J\u0016\u0010H\u001a\u00020/2\u0006\u0010F\u001a\u00020\u00112\u0006\u0010G\u001a\u00020\rJ\u0010\u0010I\u001a\u00020\r2\u0006\u0010F\u001a\u00020\u0011H\u0002J\u0006\u0010J\u001a\u00020/J\b\u0010K\u001a\u00020\rH\u0016J\b\u0010L\u001a\u00020/H\u0002J\u0010\u0010M\u001a\u00020/2\u0006\u0010N\u001a\u00020OH\u0002J\u000e\u0010P\u001a\u00020/2\u0006\u0010C\u001a\u00020\u0002J\b\u0010Q\u001a\u00020\rH\u0002J\b\u0010R\u001a\u00020\rH\u0016J\b\u0010S\u001a\u00020/H\u0002J(\u0010T\u001a\u00020\r2\u0006\u0010U\u001a\u00020\u000b2\u0006\u0010V\u001a\u00020\u000b2\u0006\u0010W\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020>H\u0014J:\u0010X\u001a\u0004\u0018\u00010\u00112\u0006\u0010Y\u001a\u00020\u000b2\u0006\u0010Z\u001a\u00020\u000b2\u0006\u0010[\u001a\u00020\u000b2\u0006\u0010\\\u001a\u00020\u000b2\u0006\u0010]\u001a\u00020\u000b2\u0006\u0010^\u001a\u00020\u000bH\u0016J\u0016\u0010_\u001a\u00020\r2\u0006\u0010C\u001a\u00020\u00022\u0006\u0010`\u001a\u00020\u000bJ\u0016\u0010a\u001a\u00020/2\u0006\u0010b\u001a\u00020\u00022\u0006\u0010c\u001a\u00020\u000bJ\u0018\u0010d\u001a\u00020/2\u0006\u0010C\u001a\u00020\u00022\u0006\u0010c\u001a\u00020\u000bH\u0014J\u0016\u0010e\u001a\u00020/2\u0006\u0010b\u001a\u00020\u00022\u0006\u0010c\u001a\u00020\u000bJ\u0018\u0010f\u001a\u00020/2\u0006\u0010C\u001a\u00020\u00022\u0006\u0010c\u001a\u00020\u000bH\u0014J\b\u0010g\u001a\u00020/H\u0016J\b\u0010h\u001a\u00020/H\u0016J\u0006\u0010i\u001a\u00020/J\u0006\u0010j\u001a\u00020\rJ\u0010\u0010k\u001a\u00020/2\u0006\u0010l\u001a\u00020\u0002H\u0016J\u0016\u0010m\u001a\u00020\r2\u0006\u0010C\u001a\u00020\u00022\u0006\u0010`\u001a\u00020\u000bJ&\u0010n\u001a\u00020\r2\u0006\u0010F\u001a\u00020\u00112\u0006\u0010c\u001a\u00020\u000b2\u0006\u0010G\u001a\u00020\r2\u0006\u0010o\u001a\u00020\rJ\u0010\u0010p\u001a\u00020\r2\u0006\u0010@\u001a\u00020>H\u0002J\b\u0010q\u001a\u00020\rH\u0002J\u0018\u0010r\u001a\u00020\r2\u0006\u0010s\u001a\u00020\u000b2\u0006\u0010t\u001a\u00020\u000bH\u0002J\b\u0010u\u001a\u00020\rH\u0002J\b\u0010v\u001a\u00020/H\u0002R\u0012\u0010\u0004\u001a\u00028\u00008\u0004X\u0085\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\u000b8\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\r8\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u00020\u000f8\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u00020\u00118\u0004X\u0085\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u00020\u00138\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0014\u001a\u00020\u00138\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0015\u001a\u00020\u00138\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0016\u001a\u00020\u00138\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0017\u001a\u00020\u00138\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u00198\u0004X\u0085\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u001b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001c8\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u001d\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001c8\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001e\u001a\u00020\u000b8\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001f\u001a\u00020\r8\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R\u0012\u0010 \u001a\u00020\r8\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020&X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020&X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010)\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006x"]
      d2=["Lext/mods/gameserver/model/actor/move/CreatureMove;","T","Lext/mods/gameserver/model/actor/Creature;","","_actor","<init>","(Lext/mods/gameserver/model/actor/Creature;)V","Lext/mods/gameserver/model/actor/Creature;","_pawn","Lext/mods/gameserver/model/WorldObject;","_offset","","_blocked","","_moveTypes","","_destination","Lext/mods/gameserver/model/location/Location;","_xAccurate","","_yAccurate","_zAccurate","_separationForceX","_separationForceY","_geoPath","Ljava/util/ArrayDeque;","_finalPathDestination","_task","Ljava/util/concurrent/ScheduledFuture;","_followTask","_geoPathFailCount","_isDebugMove","_isDebugPath","_cachedDestinationZ","_cachedDestinationX","_cachedDestinationY","_currentSpeedRandomFactor","_lastMoveRequestTime","","_lastArrivedEventTime","_lastValidateLocationTime","_pauseCheckTask","_pausedByNoPlayers","_pausedDestination","getTask","getDestination","describeMovementTo","","player","Lext/mods/gameserver/model/actor/Player;","isDebugMove","setDebugMove","debug","isDebugPath","setDebugPath","getGeoPathFailCount","resetGeoPathFailCount","addGeoPathFailCount","isMeleeDebug","syncPlayerLocation","force","getMoveType","Lext/mods/gameserver/enums/actors/MoveType;","addMoveType","type","removeMoveType","findAlternativeAttackPosition","target","baseRange","moveToLocation","destination","pathfinding","forceMoveToLocation","wouldCollideInPath","registerMoveTask","shouldStopMovementTask","finishMovement","notifyArrived","event","Lext/mods/gameserver/enums/AiEventType;","repositionAfterAttack","moveToNextRoutePoint","updatePosition","calculateRepulsion","handleNextPosition","nextX","nextY","nextZ","calculatePath","ox","oy","oz","tx","ty","tz","maybeStartOffensiveFollow","range","startOffensiveFollow","pawn","offset","offensiveFollowTask","startFriendlyFollow","friendlyFollowTask","stop","cancelMoveTask","cancelFollowTask","isOnLastPawnMoveGeoPath","avoidAttack","attacker","maybeStartFriendlyFollow","maybeMoveToLocation","isShiftPressed","checkArrival","tryRecalculatePathWithoutRetreat","wouldCollideWithCreature","targetX","targetY","hasVisiblePlayers","startResumeCheckTask","Companion","Brproject"]
    )
RuntimeInvisibleAnnotations:
  0: #1047(#1048=[s#1049])
    kotlin.jvm.internal.SourceDebugExtension(
      value=["SMAP\nCreatureMove.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreatureMove.kt\next/mods/gameserver/model/actor/move/CreatureMove\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,745:1\n1807#2,3:746\n1807#2,3:749\n296#2,2:753\n1807#2,3:755\n1807#2,3:758\n1#3:752\n*S KotlinDebug\n*F\n+ 1 CreatureMove.kt\next/mods/gameserver/model/actor/move/CreatureMove\n*L\n160#1:746,3\n239#1:749,3\n694#1:753,2\n715#1:755,3\n726#1:758,3\n*E\n"]
    )
BootstrapMethods:
  0: #463 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #451 ()V
      #456 REF_invokeStatic ext/mods/gameserver/model/actor/move/CreatureMove.registerMoveTask$lambda$0:(Lext/mods/gameserver/model/actor/move/CreatureMove;)V
      #451 ()V
  1: #463 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #451 ()V
      #559 REF_invokeStatic ext/mods/gameserver/model/actor/move/CreatureMove.notifyArrived$lambda$0:(Lext/mods/gameserver/model/actor/move/CreatureMove;)V
      #451 ()V
  2: #463 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #719 (Ljava/lang/Object;)V
      #724 REF_invokeStatic ext/mods/gameserver/model/actor/move/CreatureMove.calculateRepulsion$lambda$0:(Lext/mods/gameserver/model/actor/move/CreatureMove;IDLext/mods/gameserver/model/actor/Creature;)V
      #725 (Lext/mods/gameserver/model/actor/Creature;)V
  3: #463 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #451 ()V
      #822 REF_invokeStatic ext/mods/gameserver/model/actor/move/CreatureMove.startOffensiveFollow$lambda$0:(Lext/mods/gameserver/model/actor/move/CreatureMove;Lext/mods/gameserver/model/actor/Creature;I)V
      #451 ()V
  4: #463 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #451 ()V
      #848 REF_invokeStatic ext/mods/gameserver/model/actor/move/CreatureMove.startFriendlyFollow$lambda$0:(Lext/mods/gameserver/model/actor/move/CreatureMove;Lext/mods/gameserver/model/actor/Creature;I)V
      #451 ()V
  5: #463 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #451 ()V
      #945 REF_invokeStatic ext/mods/gameserver/model/actor/move/CreatureMove.startResumeCheckTask$lambda$0:(Lext/mods/gameserver/model/actor/move/CreatureMove;)V
      #451 ()V
