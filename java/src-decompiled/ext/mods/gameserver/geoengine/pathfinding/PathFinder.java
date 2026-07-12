// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.PathFinder
// File: ext\mods\gameserver\geoengine\pathfinding\PathFinder.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/PathFinder.class
  Last modified 9 de jul de 2026; size 17549 bytes
  MD5 checksum aab5122b38a3dfd48d8ce1c0e028e855
  Compiled from "PathFinder.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.PathFinder
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/PathFinder
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 8, methods: 17, attributes: 6
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/PathFinder
    #2 = Class              #1            // ext/mods/gameserver/geoengine/pathfinding/PathFinder
    #3 = Utf8               java/lang/Object
    #4 = Class              #3            // java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = NameAndType        #5:#6         // "<init>":()V
    #8 = Methodref          #4.#7         // java/lang/Object."<init>":()V
    #9 = Utf8               ext/mods/commons/util/PriorityQueueSet
   #10 = Class              #9            // ext/mods/commons/util/PriorityQueueSet
   #11 = Methodref          #10.#7        // ext/mods/commons/util/PriorityQueueSet."<init>":()V
   #12 = Utf8               _opened
   #13 = Utf8               Lext/mods/commons/util/PriorityQueueSet;
   #14 = NameAndType        #12:#13       // _opened:Lext/mods/commons/util/PriorityQueueSet;
   #15 = Fieldref           #2.#14        // ext/mods/gameserver/geoengine/pathfinding/PathFinder._opened:Lext/mods/commons/util/PriorityQueueSet;
   #16 = Utf8               java/util/HashSet
   #17 = Class              #16           // java/util/HashSet
   #18 = Methodref          #17.#7        // java/util/HashSet."<init>":()V
   #19 = Utf8               _closed
   #20 = Utf8               Ljava/util/HashSet;
   #21 = NameAndType        #19:#20       // _closed:Ljava/util/HashSet;
   #22 = Fieldref           #2.#21        // ext/mods/gameserver/geoengine/pathfinding/PathFinder._closed:Ljava/util/HashSet;
   #23 = Utf8               java/lang/System
   #24 = Class              #23           // java/lang/System
   #25 = Utf8               currentTimeMillis
   #26 = Utf8               ()J
   #27 = NameAndType        #25:#26       // currentTimeMillis:()J
   #28 = Methodref          #24.#27       // java/lang/System.currentTimeMillis:()J
   #29 = Utf8               _currentTime
   #30 = Utf8               J
   #31 = NameAndType        #29:#30       // _currentTime:J
   #32 = Fieldref           #2.#31        // ext/mods/gameserver/geoengine/pathfinding/PathFinder._currentTime:J
   #33 = Utf8               ext/mods/gameserver/geoengine/GeoEngine
   #34 = Class              #33           // ext/mods/gameserver/geoengine/GeoEngine
   #35 = Utf8               Companion
   #36 = Utf8               Lext/mods/gameserver/geoengine/GeoEngine$Companion;
   #37 = NameAndType        #35:#36       // Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
   #38 = Fieldref           #34.#37       // ext/mods/gameserver/geoengine/GeoEngine.Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
   #39 = Utf8               ext/mods/gameserver/geoengine/GeoEngine$Companion
   #40 = Class              #39           // ext/mods/gameserver/geoengine/GeoEngine$Companion
   #41 = Utf8               getInstance
   #42 = Utf8               ()Lext/mods/gameserver/geoengine/GeoEngine;
   #43 = NameAndType        #41:#42       // getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
   #44 = Methodref          #40.#43       // ext/mods/gameserver/geoengine/GeoEngine$Companion.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
   #45 = Utf8               _geoEngine
   #46 = Utf8               Lext/mods/gameserver/geoengine/GeoEngine;
   #47 = NameAndType        #45:#46       // _geoEngine:Lext/mods/gameserver/geoengine/GeoEngine;
   #48 = Fieldref           #2.#47        // ext/mods/gameserver/geoengine/pathfinding/PathFinder._geoEngine:Lext/mods/gameserver/geoengine/GeoEngine;
   #49 = Utf8               this
   #50 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/PathFinder;
   #51 = Utf8               findPath
   #52 = Utf8               (IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
   #53 = Utf8               (IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
   #54 = Utf8               Lorg/jetbrains/annotations/NotNull;
   #55 = Utf8               Lorg/jetbrains/annotations/Nullable;
   #56 = Utf8               findPathLegacy
   #57 = NameAndType        #56:#52       // findPathLegacy:(IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
   #58 = Methodref          #2.#57        // ext/mods/gameserver/geoengine/pathfinding/PathFinder.findPathLegacy:(IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
   #59 = Utf8               gox
   #60 = Utf8               I
   #61 = Utf8               goy
   #62 = Utf8               goz
   #63 = Utf8               gtx
   #64 = Utf8               gty
   #65 = Utf8               gtz
   #66 = Utf8               debug
   #67 = Utf8               Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
   #68 = Utf8               (Lext/mods/gameserver/model/actor/Creature;IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
   #69 = Utf8               (Lext/mods/gameserver/model/actor/Creature;IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
   #70 = Utf8               ext/mods/gameserver/geoengine/PeaceZoneCollisionManager
   #71 = Class              #70           // ext/mods/gameserver/geoengine/PeaceZoneCollisionManager
   #72 = Utf8               INSTANCE
   #73 = Utf8               Lext/mods/gameserver/geoengine/PeaceZoneCollisionManager;
   #74 = NameAndType        #72:#73       // INSTANCE:Lext/mods/gameserver/geoengine/PeaceZoneCollisionManager;
   #75 = Fieldref           #71.#74       // ext/mods/gameserver/geoengine/PeaceZoneCollisionManager.INSTANCE:Lext/mods/gameserver/geoengine/PeaceZoneCollisionManager;
   #76 = Utf8               canIgnoreCreatureCollision
   #77 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
   #78 = NameAndType        #76:#77       // canIgnoreCreatureCollision:(Lext/mods/gameserver/model/actor/Creature;)Z
   #79 = Methodref          #71.#78       // ext/mods/gameserver/geoengine/PeaceZoneCollisionManager.canIgnoreCreatureCollision:(Lext/mods/gameserver/model/actor/Creature;)Z
   #80 = Utf8               findSimplifiedPath
   #81 = NameAndType        #80:#52       // findSimplifiedPath:(IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
   #82 = Methodref          #2.#81        // ext/mods/gameserver/geoengine/pathfinding/PathFinder.findSimplifiedPath:(IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
   #83 = Utf8               java/util/List
   #84 = Class              #83           // java/util/List
   #85 = Utf8               isEmpty
   #86 = Utf8               ()Z
   #87 = NameAndType        #85:#86       // isEmpty:()Z
   #88 = InterfaceMethodref #84.#87       // java/util/List.isEmpty:()Z
   #89 = Utf8               size
   #90 = Utf8               ()I
   #91 = NameAndType        #89:#90       // size:()I
   #92 = InterfaceMethodref #84.#91       // java/util/List.size:()I
   #93 = Utf8               applyPathOptimizations
   #94 = Utf8               (Ljava/util/List;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
   #95 = NameAndType        #93:#94       // applyPathOptimizations:(Ljava/util/List;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
   #96 = Methodref          #2.#95        // ext/mods/gameserver/geoengine/pathfinding/PathFinder.applyPathOptimizations:(Ljava/util/List;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
   #97 = Utf8               rawPath
   #98 = Utf8               Ljava/util/List;
   #99 = Utf8               creature
  #100 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #101 = Utf8               canMove
  #102 = Utf8               (IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
  #103 = NameAndType        #101:#102     // canMove:(IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
  #104 = Methodref          #34.#103      // ext/mods/gameserver/geoengine/GeoEngine.canMove:(IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
  #105 = Utf8               Simplified Path (Direct)
  #106 = String             #105          // Simplified Path (Direct)
  #107 = Utf8               java/awt/Color
  #108 = Class              #107          // java/awt/Color
  #109 = Utf8               CYAN
  #110 = Utf8               Ljava/awt/Color;
  #111 = NameAndType        #109:#110     // CYAN:Ljava/awt/Color;
  #112 = Fieldref           #108.#111     // java/awt/Color.CYAN:Ljava/awt/Color;
  #113 = Utf8               ext/mods/gameserver/network/serverpackets/ExServerPrimitive
  #114 = Class              #113          // ext/mods/gameserver/network/serverpackets/ExServerPrimitive
  #115 = Utf8               addLine
  #116 = Utf8               (Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
  #117 = NameAndType        #115:#116     // addLine:(Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
  #118 = Methodref          #114.#117     // ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/lang/String;Ljava/awt/Color;ZIIIIII)V
  #119 = Utf8               ext/mods/gameserver/model/location/Location
  #120 = Class              #119          // ext/mods/gameserver/model/location/Location
  #121 = Utf8               (III)V
  #122 = NameAndType        #5:#121       // "<init>":(III)V
  #123 = Methodref          #120.#122     // ext/mods/gameserver/model/location/Location."<init>":(III)V
  #124 = Utf8               kotlin/collections/CollectionsKt
  #125 = Class              #124          // kotlin/collections/CollectionsKt
  #126 = Utf8               listOf
  #127 = Utf8               (Ljava/lang/Object;)Ljava/util/List;
  #128 = NameAndType        #126:#127     // listOf:(Ljava/lang/Object;)Ljava/util/List;
  #129 = Methodref          #125.#128     // kotlin/collections/CollectionsKt.listOf:(Ljava/lang/Object;)Ljava/util/List;
  #130 = Utf8               findPathWithCollisionBox
  #131 = Utf8               ext/mods/gameserver/model/actor/Creature
  #132 = Class              #131          // ext/mods/gameserver/model/actor/Creature
  #133 = Utf8               getCollisionRadius
  #134 = Utf8               ()D
  #135 = NameAndType        #133:#134     // getCollisionRadius:()D
  #136 = Methodref          #132.#135     // ext/mods/gameserver/model/actor/Creature.getCollisionRadius:()D
  #137 = Utf8               canMoveWithCollisionBox
  #138 = Utf8               (IIIIIIDLext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
  #139 = NameAndType        #137:#138     // canMoveWithCollisionBox:(IIIIIIDLext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
  #140 = Methodref          #34.#139      // ext/mods/gameserver/geoengine/GeoEngine.canMoveWithCollisionBox:(IIIIIIDLext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
  #141 = Utf8               java/util/Collection
  #142 = Class              #141          // java/util/Collection
  #143 = Utf8               toMutableList
  #144 = Utf8               (Ljava/util/Collection;)Ljava/util/List;
  #145 = NameAndType        #143:#144     // toMutableList:(Ljava/util/Collection;)Ljava/util/List;
  #146 = Methodref          #125.#145     // kotlin/collections/CollectionsKt.toMutableList:(Ljava/util/Collection;)Ljava/util/List;
  #147 = Utf8               optimizePathWithCollisionBox
  #148 = Utf8               (Ljava/util/List;DLext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
  #149 = NameAndType        #147:#148     // optimizePathWithCollisionBox:(Ljava/util/List;DLext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
  #150 = Methodref          #2.#149       // ext/mods/gameserver/geoengine/pathfinding/PathFinder.optimizePathWithCollisionBox:(Ljava/util/List;DLext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
  #151 = Utf8               collisionRadius
  #152 = Utf8               D
  #153 = Utf8               path
  #154 = Utf8               (Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;DLext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
  #155 = Utf8               java/util/ArrayList
  #156 = Class              #155          // java/util/ArrayList
  #157 = Methodref          #156.#7       // java/util/ArrayList."<init>":()V
  #158 = Utf8               get
  #159 = Utf8               (I)Ljava/lang/Object;
  #160 = NameAndType        #158:#159     // get:(I)Ljava/lang/Object;
  #161 = InterfaceMethodref #84.#160      // java/util/List.get:(I)Ljava/lang/Object;
  #162 = Utf8               add
  #163 = Utf8               (Ljava/lang/Object;)Z
  #164 = NameAndType        #162:#163     // add:(Ljava/lang/Object;)Z
  #165 = InterfaceMethodref #84.#164      // java/util/List.add:(Ljava/lang/Object;)Z
  #166 = Utf8               getX
  #167 = NameAndType        #166:#90      // getX:()I
  #168 = Methodref          #120.#167     // ext/mods/gameserver/model/location/Location.getX:()I
  #169 = Utf8               getY
  #170 = NameAndType        #169:#90      // getY:()I
  #171 = Methodref          #120.#170     // ext/mods/gameserver/model/location/Location.getY:()I
  #172 = Utf8               getZ
  #173 = NameAndType        #172:#90      // getZ:()I
  #174 = Methodref          #120.#173     // ext/mods/gameserver/model/location/Location.getZ:()I
  #175 = Utf8               RED
  #176 = NameAndType        #175:#110     // RED:Ljava/awt/Color;
  #177 = Fieldref           #108.#176     // java/awt/Color.RED:Ljava/awt/Color;
  #178 = Utf8               addPoint
  #179 = Utf8               (Ljava/awt/Color;III)V
  #180 = NameAndType        #178:#179     // addPoint:(Ljava/awt/Color;III)V
  #181 = Methodref          #114.#180     // ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addPoint:(Ljava/awt/Color;III)V
  #182 = Utf8               GREEN
  #183 = NameAndType        #182:#110     // GREEN:Ljava/awt/Color;
  #184 = Fieldref           #108.#183     // java/awt/Color.GREEN:Ljava/awt/Color;
  #185 = Utf8               nodeC
  #186 = Utf8               Lext/mods/gameserver/model/location/Location;
  #187 = Utf8               i
  #188 = Utf8               nodeB
  #189 = Utf8               farthestIndex
  #190 = Utf8               optimized
  #191 = Utf8               nodeA
  #192 = Utf8               nodeBIndex
  #193 = Utf8               (Ljava/util/List<+Lext/mods/gameserver/model/location/Location;>;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
  #194 = Utf8               smoothPath
  #195 = NameAndType        #194:#94      // smoothPath:(Ljava/util/List;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
  #196 = Methodref          #2.#195       // ext/mods/gameserver/geoengine/pathfinding/PathFinder.smoothPath:(Ljava/util/List;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
  #197 = Utf8               ext/mods/Config
  #198 = Class              #197          // ext/mods/Config
  #199 = Utf8               ENABLE_PATH_SMOOTHING
  #200 = Utf8               Z
  #201 = NameAndType        #199:#200     // ENABLE_PATH_SMOOTHING:Z
  #202 = Fieldref           #198.#201     // ext/mods/Config.ENABLE_PATH_SMOOTHING:Z
  #203 = Utf8               applyCurveInterpolation
  #204 = Utf8               (Ljava/util/List;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
  #205 = NameAndType        #203:#204     // applyCurveInterpolation:(Ljava/util/List;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
  #206 = Methodref          #2.#205       // ext/mods/gameserver/geoengine/pathfinding/PathFinder.applyCurveInterpolation:(Ljava/util/List;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
  #207 = Utf8               smoothed
  #208 = Utf8               java/lang/Math
  #209 = Class              #208          // java/lang/Math
  #210 = Utf8               abs
  #211 = Utf8               (I)I
  #212 = NameAndType        #210:#211     // abs:(I)I
  #213 = Methodref          #209.#212     // java/lang/Math.abs:(I)I
  #214 = Utf8               canMoveToTarget
  #215 = Utf8               (IIIIII)Z
  #216 = NameAndType        #214:#215     // canMoveToTarget:(IIIIII)Z
  #217 = Methodref          #34.#216      // ext/mods/gameserver/geoengine/GeoEngine.canMoveToTarget:(IIIIII)Z
  #218 = Utf8               lastOrNull
  #219 = Utf8               (Ljava/util/List;)Ljava/lang/Object;
  #220 = NameAndType        #218:#219     // lastOrNull:(Ljava/util/List;)Ljava/lang/Object;
  #221 = Methodref          #125.#220     // kotlin/collections/CollectionsKt.lastOrNull:(Ljava/util/List;)Ljava/lang/Object;
  #222 = Utf8               kotlin/jvm/internal/Intrinsics
  #223 = Class              #222          // kotlin/jvm/internal/Intrinsics
  #224 = Utf8               areEqual
  #225 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Z
  #226 = NameAndType        #224:#225     // areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
  #227 = Methodref          #223.#226     // kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
  #228 = Utf8               last
  #229 = NameAndType        #228:#219     // last:(Ljava/util/List;)Ljava/lang/Object;
  #230 = Methodref          #125.#229     // kotlin/collections/CollectionsKt.last:(Ljava/util/List;)Ljava/lang/Object;
  #231 = Utf8               current
  #232 = Utf8               target
  #233 = Utf8               heightDiff
  #234 = Utf8               currentIndex
  #235 = Utf8               (Ljava/util/List<+Lext/mods/gameserver/model/location/Location;>;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
  #236 = Utf8               distance3D
  #237 = Utf8               (Lext/mods/gameserver/model/location/Location;)D
  #238 = NameAndType        #236:#237     // distance3D:(Lext/mods/gameserver/model/location/Location;)D
  #239 = Methodref          #120.#238     // ext/mods/gameserver/model/location/Location.distance3D:(Lext/mods/gameserver/model/location/Location;)D
  #240 = Utf8               OBSTACLE_SMOOTHING_DISTANCE
  #241 = NameAndType        #240:#60      // OBSTACLE_SMOOTHING_DISTANCE:I
  #242 = Fieldref           #198.#241     // ext/mods/Config.OBSTACLE_SMOOTHING_DISTANCE:I
  #243 = Utf8               kotlin/ranges/RangesKt
  #244 = Class              #243          // kotlin/ranges/RangesKt
  #245 = Utf8               coerceAtMost
  #246 = Utf8               (II)I
  #247 = NameAndType        #245:#246     // coerceAtMost:(II)I
  #248 = Methodref          #244.#247     // kotlin/ranges/RangesKt.coerceAtMost:(II)I
  #249 = Utf8               catmullRomSpline
  #250 = Utf8               (Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;D)Lext/mods/gameserver/model/location/Location;
  #251 = NameAndType        #249:#250     // catmullRomSpline:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;D)Lext/mods/gameserver/model/location/Location;
  #252 = Methodref          #2.#251       // ext/mods/gameserver/geoengine/pathfinding/PathFinder.catmullRomSpline:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;D)Lext/mods/gameserver/model/location/Location;
  #253 = Utf8               BLUE
  #254 = NameAndType        #253:#110     // BLUE:Ljava/awt/Color;
  #255 = Fieldref           #108.#254     // java/awt/Color.BLUE:Ljava/awt/Color;
  #256 = Utf8               t
  #257 = Utf8               interpolatedPoint
  #258 = Utf8               j
  #259 = Utf8               p0
  #260 = Utf8               p1
  #261 = Utf8               p2
  #262 = Utf8               p3
  #263 = Utf8               distance
  #264 = Utf8               calculatedSteps
  #265 = Utf8               steps
  #266 = Utf8               stepsDouble
  #267 = Utf8               interpolated
  #268 = Double             0.5d
  #270 = Utf8               getHeight
  #271 = Utf8               (III)S
  #272 = NameAndType        #270:#271     // getHeight:(III)S
  #273 = Methodref          #34.#272      // ext/mods/gameserver/geoengine/GeoEngine.getHeight:(III)S
  #274 = Utf8               t2
  #275 = Utf8               t3
  #276 = Utf8               x
  #277 = Utf8               y
  #278 = Utf8               z
  #279 = Utf8               zInt
  #280 = Utf8               xInt
  #281 = Utf8               yInt
  #282 = Utf8               finalZ
  #283 = Utf8               _gtx
  #284 = NameAndType        #283:#60      // _gtx:I
  #285 = Fieldref           #2.#284       // ext/mods/gameserver/geoengine/pathfinding/PathFinder._gtx:I
  #286 = Utf8               _gty
  #287 = NameAndType        #286:#60      // _gty:I
  #288 = Fieldref           #2.#287       // ext/mods/gameserver/geoengine/pathfinding/PathFinder._gty:I
  #289 = Utf8               _gtz
  #290 = NameAndType        #289:#60      // _gtz:I
  #291 = Fieldref           #2.#290       // ext/mods/gameserver/geoengine/pathfinding/PathFinder._gtz:I
  #292 = Utf8               clear
  #293 = NameAndType        #292:#6       // clear:()V
  #294 = Methodref          #10.#293      // ext/mods/commons/util/PriorityQueueSet.clear:()V
  #295 = Methodref          #17.#293      // java/util/HashSet.clear:()V
  #296 = Utf8               getNsweNearest
  #297 = Utf8               (III)B
  #298 = NameAndType        #296:#297     // getNsweNearest:(III)B
  #299 = Methodref          #34.#298      // ext/mods/gameserver/geoengine/GeoEngine.getNsweNearest:(III)B
  #300 = Utf8               ext/mods/gameserver/geoengine/pathfinding/Node
  #301 = Class              #300          // ext/mods/gameserver/geoengine/pathfinding/Node
  #302 = Utf8               (IIIB)V
  #303 = NameAndType        #5:#302       // "<init>":(IIIB)V
  #304 = Methodref          #301.#303     // ext/mods/gameserver/geoengine/pathfinding/Node."<init>":(IIIB)V
  #305 = Utf8               _current
  #306 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/Node;
  #307 = NameAndType        #305:#306     // _current:Lext/mods/gameserver/geoengine/pathfinding/Node;
  #308 = Fieldref           #2.#307       // ext/mods/gameserver/geoengine/pathfinding/PathFinder._current:Lext/mods/gameserver/geoengine/pathfinding/Node;
  #309 = Utf8               checkNotNull
  #310 = Utf8               (Ljava/lang/Object;)V
  #311 = NameAndType        #309:#310     // checkNotNull:(Ljava/lang/Object;)V
  #312 = Methodref          #223.#311     // kotlin/jvm/internal/Intrinsics.checkNotNull:(Ljava/lang/Object;)V
  #313 = Utf8               getCostH
  #314 = Utf8               (III)I
  #315 = NameAndType        #313:#314     // getCostH:(III)I
  #316 = Methodref          #2.#315       // ext/mods/gameserver/geoengine/pathfinding/PathFinder.getCostH:(III)I
  #317 = Utf8               setCost
  #318 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/Node;II)V
  #319 = NameAndType        #317:#318     // setCost:(Lext/mods/gameserver/geoengine/pathfinding/Node;II)V
  #320 = Methodref          #301.#319     // ext/mods/gameserver/geoengine/pathfinding/Node.setCost:(Lext/mods/gameserver/geoengine/pathfinding/Node;II)V
  #321 = Methodref          #10.#164      // ext/mods/commons/util/PriorityQueueSet.add:(Ljava/lang/Object;)Z
  #322 = Methodref          #10.#87       // ext/mods/commons/util/PriorityQueueSet.isEmpty:()Z
  #323 = Utf8               MAX_ITERATIONS
  #324 = NameAndType        #323:#60      // MAX_ITERATIONS:I
  #325 = Fieldref           #198.#324     // ext/mods/Config.MAX_ITERATIONS:I
  #326 = Utf8               poll
  #327 = Utf8               ()Ljava/lang/Object;
  #328 = NameAndType        #326:#327     // poll:()Ljava/lang/Object;
  #329 = Methodref          #10.#328      // ext/mods/commons/util/PriorityQueueSet.poll:()Ljava/lang/Object;
  #330 = Utf8               getGeoX
  #331 = NameAndType        #330:#90      // getGeoX:()I
  #332 = Methodref          #301.#331     // ext/mods/gameserver/geoengine/pathfinding/Node.getGeoX:()I
  #333 = Utf8               getGeoY
  #334 = NameAndType        #333:#90      // getGeoY:()I
  #335 = Methodref          #301.#334     // ext/mods/gameserver/geoengine/pathfinding/Node.getGeoY:()I
  #336 = Methodref          #301.#173     // ext/mods/gameserver/geoengine/pathfinding/Node.getZ:()I
  #337 = Utf8               constructPath
  #338 = Utf8               (Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
  #339 = NameAndType        #337:#338     // constructPath:(Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
  #340 = Methodref          #2.#339       // ext/mods/gameserver/geoengine/pathfinding/PathFinder.constructPath:(Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
  #341 = Methodref          #17.#164      // java/util/HashSet.add:(Ljava/lang/Object;)Z
  #342 = Utf8               expand
  #343 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/Node;)V
  #344 = NameAndType        #342:#343     // expand:(Lext/mods/gameserver/geoengine/pathfinding/Node;)V
  #345 = Methodref          #2.#344       // ext/mods/gameserver/geoengine/pathfinding/PathFinder.expand:(Lext/mods/gameserver/geoengine/pathfinding/Node;)V
  #346 = Utf8               emptyList
  #347 = Utf8               ()Ljava/util/List;
  #348 = NameAndType        #346:#347     // emptyList:()Ljava/util/List;
  #349 = Methodref          #125.#348     // kotlin/collections/CollectionsKt.emptyList:()Ljava/util/List;
  #350 = Utf8               startNswe
  #351 = Utf8               B
  #352 = Utf8               count
  #353 = Utf8               (Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
  #354 = Utf8               java/util/LinkedList
  #355 = Class              #354          // java/util/LinkedList
  #356 = Methodref          #355.#7       // java/util/LinkedList."<init>":()V
  #357 = Utf8               getParent
  #358 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/Node;
  #359 = NameAndType        #357:#358     // getParent:()Lext/mods/gameserver/geoengine/pathfinding/Node;
  #360 = Methodref          #301.#359     // ext/mods/gameserver/geoengine/pathfinding/Node.getParent:()Lext/mods/gameserver/geoengine/pathfinding/Node;
  #361 = Utf8               getWorldX
  #362 = NameAndType        #361:#211     // getWorldX:(I)I
  #363 = Methodref          #40.#362      // ext/mods/gameserver/geoengine/GeoEngine$Companion.getWorldX:(I)I
  #364 = Utf8               getWorldY
  #365 = NameAndType        #364:#211     // getWorldY:(I)I
  #366 = Methodref          #40.#365      // ext/mods/gameserver/geoengine/GeoEngine$Companion.getWorldY:(I)I
  #367 = Utf8               addFirst
  #368 = NameAndType        #367:#310     // addFirst:(Ljava/lang/Object;)V
  #369 = Methodref          #355.#368     // java/util/LinkedList.addFirst:(Ljava/lang/Object;)V
  #370 = Utf8               \u0001ms
  #371 = String             #370          // \u0001ms
  #372 = Utf8               java/lang/invoke/StringConcatFactory
  #373 = Class              #372          // java/lang/invoke/StringConcatFactory
  #374 = Utf8               makeConcatWithConstants
  #375 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #376 = NameAndType        #374:#375     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #377 = Methodref          #373.#376     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #378 = MethodHandle       6:#377        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #379 = Utf8               (J)Ljava/lang/String;
  #380 = NameAndType        #374:#379     // makeConcatWithConstants:(J)Ljava/lang/String;
  #381 = InvokeDynamic      #0:#380       // #0:makeConcatWithConstants:(J)Ljava/lang/String;
  #382 = Utf8               (Ljava/lang/String;Ljava/awt/Color;ZIII)V
  #383 = NameAndType        #178:#382     // addPoint:(Ljava/lang/String;Ljava/awt/Color;ZIII)V
  #384 = Methodref          #114.#383     // ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addPoint:(Ljava/lang/String;Ljava/awt/Color;ZIII)V
  #385 = Utf8               worldX
  #386 = Utf8               worldY
  #387 = Utf8               nx
  #388 = Utf8               ny
  #389 = Utf8               Ljava/util/LinkedList;
  #390 = Utf8               dx
  #391 = Utf8               dy
  #392 = Utf8               node
  #393 = Utf8               parent
  #394 = Utf8               getNswe
  #395 = Utf8               ()B
  #396 = NameAndType        #394:#395     // getNswe:()B
  #397 = Methodref          #301.#396     // ext/mods/gameserver/geoengine/pathfinding/Node.getNswe:()B
  #398 = Utf8               addDirectionalNode
  #399 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/Node;IIIBIIB)B
  #400 = NameAndType        #398:#399     // addDirectionalNode:(Lext/mods/gameserver/geoengine/pathfinding/Node;IIIBIIB)B
  #401 = Methodref          #2.#400       // ext/mods/gameserver/geoengine/pathfinding/PathFinder.addDirectionalNode:(Lext/mods/gameserver/geoengine/pathfinding/Node;IIIBIIB)B
  #402 = Utf8               addCornerNode
  #403 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/Node;IIIBIIBBBB)V
  #404 = NameAndType        #402:#403     // addCornerNode:(Lext/mods/gameserver/geoengine/pathfinding/Node;IIIBIIBBBB)V
  #405 = Methodref          #2.#404       // ext/mods/gameserver/geoengine/pathfinding/PathFinder.addCornerNode:(Lext/mods/gameserver/geoengine/pathfinding/Node;IIIBIIBBBB)V
  #406 = Utf8               nswe
  #407 = Utf8               nsweN
  #408 = Utf8               nsweS
  #409 = Utf8               nsweW
  #410 = Utf8               nsweE
  #411 = Utf8               addNode
  #412 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/Node;IIIZ)B
  #413 = NameAndType        #411:#412     // addNode:(Lext/mods/gameserver/geoengine/pathfinding/Node;IIIZ)B
  #414 = Methodref          #2.#413       // ext/mods/gameserver/geoengine/pathfinding/PathFinder.addNode:(Lext/mods/gameserver/geoengine/pathfinding/Node;IIIZ)B
  #415 = Utf8               directionFlag
  #416 = Utf8               dirFlagX
  #417 = Utf8               dirFlagY
  #418 = Utf8               nsweX
  #419 = Utf8               nsweY
  #420 = Integer            32768
  #421 = Utf8               getBlock
  #422 = Utf8               (II)Lext/mods/gameserver/geoengine/geodata/ABlock;
  #423 = NameAndType        #421:#422     // getBlock:(II)Lext/mods/gameserver/geoengine/geodata/ABlock;
  #424 = Methodref          #34.#423      // ext/mods/gameserver/geoengine/GeoEngine.getBlock:(II)Lext/mods/gameserver/geoengine/geodata/ABlock;
  #425 = Utf8               ext/mods/gameserver/geoengine/geodata/ABlock
  #426 = Class              #425          // ext/mods/gameserver/geoengine/geodata/ABlock
  #427 = Utf8               getIndexBelow
  #428 = Utf8               (IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)I
  #429 = NameAndType        #427:#428     // getIndexBelow:(IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)I
  #430 = Methodref          #426.#429     // ext/mods/gameserver/geoengine/geodata/ABlock.getIndexBelow:(IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)I
  #431 = Utf8               (ILext/mods/gameserver/geoengine/geodata/IGeoObject;)S
  #432 = NameAndType        #270:#431     // getHeight:(ILext/mods/gameserver/geoengine/geodata/IGeoObject;)S
  #433 = Methodref          #426.#432     // ext/mods/gameserver/geoengine/geodata/ABlock.getHeight:(ILext/mods/gameserver/geoengine/geodata/IGeoObject;)S
  #434 = Utf8               (ILext/mods/gameserver/geoengine/geodata/IGeoObject;)B
  #435 = NameAndType        #394:#434     // getNswe:(ILext/mods/gameserver/geoengine/geodata/IGeoObject;)B
  #436 = Methodref          #426.#435     // ext/mods/gameserver/geoengine/geodata/ABlock.getNswe:(ILext/mods/gameserver/geoengine/geodata/IGeoObject;)B
  #437 = Utf8               contains
  #438 = NameAndType        #437:#163     // contains:(Ljava/lang/Object;)Z
  #439 = Methodref          #17.#438      // java/util/HashSet.contains:(Ljava/lang/Object;)Z
  #440 = Utf8               MOVE_WEIGHT_DIAG
  #441 = NameAndType        #440:#60      // MOVE_WEIGHT_DIAG:I
  #442 = Fieldref           #198.#441     // ext/mods/Config.MOVE_WEIGHT_DIAG:I
  #443 = Utf8               MOVE_WEIGHT
  #444 = NameAndType        #443:#60      // MOVE_WEIGHT:I
  #445 = Fieldref           #198.#444     // ext/mods/Config.MOVE_WEIGHT:I
  #446 = Utf8               OBSTACLE_WEIGHT_DIAG
  #447 = NameAndType        #446:#60      // OBSTACLE_WEIGHT_DIAG:I
  #448 = Fieldref           #198.#447     // ext/mods/Config.OBSTACLE_WEIGHT_DIAG:I
  #449 = Utf8               OBSTACLE_WEIGHT
  #450 = NameAndType        #449:#60      // OBSTACLE_WEIGHT:I
  #451 = Fieldref           #198.#450     // ext/mods/Config.OBSTACLE_WEIGHT:I
  #452 = Utf8               ENABLE_BOUNDARY_CELL_PENALTY
  #453 = NameAndType        #452:#200     // ENABLE_BOUNDARY_CELL_PENALTY:Z
  #454 = Fieldref           #198.#453     // ext/mods/Config.ENABLE_BOUNDARY_CELL_PENALTY:Z
  #455 = Utf8               hasBlockedNeighborAtSameLevel
  #456 = Utf8               (III)Z
  #457 = NameAndType        #455:#456     // hasBlockedNeighborAtSameLevel:(III)Z
  #458 = Methodref          #34.#457      // ext/mods/gameserver/geoengine/GeoEngine.hasBlockedNeighborAtSameLevel:(III)Z
  #459 = Utf8               BOUNDARY_CELL_PENALTY
  #460 = NameAndType        #459:#60      // BOUNDARY_CELL_PENALTY:I
  #461 = Fieldref           #198.#460     // ext/mods/Config.BOUNDARY_CELL_PENALTY:I
  #462 = Utf8               java/lang/Iterable
  #463 = Class              #462          // java/lang/Iterable
  #464 = Utf8               iterator
  #465 = Utf8               ()Ljava/util/Iterator;
  #466 = NameAndType        #464:#465     // iterator:()Ljava/util/Iterator;
  #467 = InterfaceMethodref #463.#466     // java/lang/Iterable.iterator:()Ljava/util/Iterator;
  #468 = Utf8               java/util/Iterator
  #469 = Class              #468          // java/util/Iterator
  #470 = Utf8               hasNext
  #471 = NameAndType        #470:#86      // hasNext:()Z
  #472 = InterfaceMethodref #469.#471     // java/util/Iterator.hasNext:()Z
  #473 = Utf8               next
  #474 = NameAndType        #473:#327     // next:()Ljava/lang/Object;
  #475 = InterfaceMethodref #469.#474     // java/util/Iterator.next:()Ljava/lang/Object;
  #476 = Utf8               getCostG
  #477 = NameAndType        #476:#90      // getCostG:()I
  #478 = Methodref          #301.#477     // ext/mods/gameserver/geoengine/pathfinding/Node.getCostG:()I
  #479 = Utf8               remove
  #480 = NameAndType        #479:#163     // remove:(Ljava/lang/Object;)Z
  #481 = Methodref          #10.#480      // ext/mods/commons/util/PriorityQueueSet.remove:(Ljava/lang/Object;)Z
  #482 = Utf8               $i$a$-find-PathFinder$addNode$existingNode$1
  #483 = Utf8               it
  #484 = Utf8               block
  #485 = Utf8               Lext/mods/gameserver/geoengine/geodata/ABlock;
  #486 = Utf8               index
  #487 = Utf8               newZ
  #488 = Utf8               weight
  #489 = Utf8               hCost
  #490 = Utf8               existingNode
  #491 = Utf8               gx
  #492 = Utf8               gy
  #493 = Utf8               checkZ
  #494 = Utf8               diagonal
  #495 = Utf8               sqrt
  #496 = Utf8               (D)D
  #497 = NameAndType        #495:#496     // sqrt:(D)D
  #498 = Methodref          #209.#497     // java/lang/Math.sqrt:(D)D
  #499 = Utf8               HEURISTIC_WEIGHT
  #500 = NameAndType        #499:#60      // HEURISTIC_WEIGHT:I
  #501 = Fieldref           #198.#500     // ext/mods/Config.HEURISTIC_WEIGHT:I
  #502 = Utf8               dz
  #503 = Utf8               gz
  #504 = Utf8               Lext/mods/commons/util/PriorityQueueSet<Lext/mods/gameserver/geoengine/pathfinding/Node;>;
  #505 = Utf8               Ljava/util/HashSet<Lext/mods/gameserver/geoengine/pathfinding/Node;>;
  #506 = Utf8               Lkotlin/Metadata;
  #507 = Utf8               mv
  #508 = Integer            2
  #509 = Integer            3
  #510 = Integer            0
  #511 = Utf8               k
  #512 = Integer            1
  #513 = Utf8               xi
  #514 = Integer            48
  #515 = Utf8               d1
  #516 = Utf8               \u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JF\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dJP\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dJH\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002JP\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J.\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00150$2\u0006\u0010%\u001a\u00020&2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J0\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J0\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J&\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J0\u0010*\u001a\u00020\u00152\u0006\u0010+\u001a\u00020\u00152\u0006\u0010,\u001a\u00020\u00152\u0006\u0010-\u001a\u00020\u00152\u0006\u0010.\u001a\u00020\u00152\u0006\u0010/\u001a\u00020&H\u0002JH\u00100\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J\u0018\u00101\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J\u0010\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u0006H\u0002JH\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u00062\u0006\u00108\u001a\u00020\u000b2\u0006\u00109\u001a\u00020\u000b2\u0006\u0010:\u001a\u00020\u000b2\u0006\u0010;\u001a\u0002062\u0006\u0010<\u001a\u00020\u000b2\u0006\u0010=\u001a\u00020\u000b2\u0006\u0010>\u001a\u000206H\u0002J`\u0010?\u001a\u0002032\u0006\u00107\u001a\u00020\u00062\u0006\u00108\u001a\u00020\u000b2\u0006\u00109\u001a\u00020\u000b2\u0006\u0010:\u001a\u00020\u000b2\u0006\u0010;\u001a\u0002062\u0006\u0010<\u001a\u00020\u000b2\u0006\u0010=\u001a\u00020\u000b2\u0006\u0010@\u001a\u0002062\u0006\u0010A\u001a\u0002062\u0006\u0010B\u001a\u0002062\u0006\u0010C\u001a\u000206H\u0002J0\u0010D\u001a\u0002062\u0006\u00107\u001a\u00020\u00062\u0006\u0010E\u001a\u00020\u000b2\u0006\u0010F\u001a\u00020\u000b2\u0006\u0010G\u001a\u00020\u000b2\u0006\u0010H\u001a\u00020IH\u0002J \u0010J\u001a\u00020\u000b2\u0006\u0010E\u001a\u00020\u000b2\u0006\u0010F\u001a\u00020\u000b2\u0006\u0010K\u001a\u00020\u000bH\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00060\bj\b\u0012\u0004\u0012\u00020\u0006`\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006L
  #517 = Utf8               d2
  #518 = Utf8
  #519 = Utf8               Lkotlin/collections/HashSet;
  #520 = Utf8               Brproject
  #521 = Utf8               PathFinder.kt
  #522 = Utf8               Lkotlin/jvm/internal/SourceDebugExtension;
  #523 = Utf8               value
  #524 = Utf8               SMAP\nPathFinder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathFinder.kt\next/mods/gameserver/geoengine/pathfinding/PathFinder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,426:1\n1#2:427\n*E\n
  #525 = Utf8               Signature
  #526 = Utf8               RuntimeInvisibleAnnotations
  #527 = Utf8               Code
  #528 = Utf8               LineNumberTable
  #529 = Utf8               LocalVariableTable
  #530 = Utf8               RuntimeInvisibleParameterAnnotations
  #531 = Utf8               StackMapTable
  #532 = Utf8               InnerClasses
  #533 = Utf8               SourceFile
  #534 = Utf8               SourceDebugExtension
  #535 = Utf8               RuntimeVisibleAnnotations
  #536 = Utf8               BootstrapMethods
{
  public ext.mods.gameserver.geoengine.pathfinding.PathFinder();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: invokespecial #8                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #10                 // class ext/mods/commons/util/PriorityQueueSet
         8: dup
         9: invokespecial #11                 // Method ext/mods/commons/util/PriorityQueueSet."<init>":()V
        12: putfield      #15                 // Field _opened:Lext/mods/commons/util/PriorityQueueSet;
        15: aload_0
        16: new           #17                 // class java/util/HashSet
        19: dup
        20: invokespecial #18                 // Method java/util/HashSet."<init>":()V
        23: putfield      #22                 // Field _closed:Ljava/util/HashSet;
        26: aload_0
        27: invokestatic  #28                 // Method java/lang/System.currentTimeMillis:()J
        30: putfield      #32                 // Field _currentTime:J
        33: aload_0
        34: getstatic     #38                 // Field ext/mods/gameserver/geoengine/GeoEngine.Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
        37: invokevirtual #44                 // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
        40: putfield      #48                 // Field _geoEngine:Lext/mods/gameserver/geoengine/GeoEngine;
        43: return
      LineNumberTable:
        line 41: 0
        line 42: 4
        line 43: 15
        line 51: 26
        line 52: 33
        line 41: 43
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      44     0  this   Lext/mods/gameserver/geoengine/pathfinding/PathFinder;

  public final java.util.List<ext.mods.gameserver.model.location.Location> findPath(int, int, int, int, int, int, ext.mods.gameserver.network.serverpackets.ExServerPrimitive);
    descriptor: (IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=8, locals=8, args_size=8
         0: aload_0
         1: iload_1
         2: iload_2
         3: iload_3
         4: iload         4
         6: iload         5
         8: iload         6
        10: aload         7
        12: invokespecial #58                 // Method findPathLegacy:(IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
        15: areturn
      LineNumberTable:
        line 59: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/geoengine/pathfinding/PathFinder;
            0      16     1   gox   I
            0      16     2   goy   I
            0      16     3   goz   I
            0      16     4   gtx   I
            0      16     5   gty   I
            0      16     6   gtz   I
            0      16     7 debug   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
    Signature: #53                          // (IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
    RuntimeInvisibleAnnotations:
      0: #54()
        org.jetbrains.annotations.NotNull
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
      parameter 1:
      parameter 2:
      parameter 3:
      parameter 4:
      parameter 5:
      parameter 6:
        0: #55()
          org.jetbrains.annotations.Nullable

  public final java.util.List<ext.mods.gameserver.model.location.Location> findPath(ext.mods.gameserver.model.actor.Creature, int, int, int, int, int, int, ext.mods.gameserver.network.serverpackets.ExServerPrimitive);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=8, locals=10, args_size=9
         0: aload_1
         1: ifnonnull     21
         4: aload_0
         5: iload_2
         6: iload_3
         7: iload         4
         9: iload         5
        11: iload         6
        13: iload         7
        15: aload         8
        17: invokespecial #58                 // Method findPathLegacy:(IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
        20: areturn
        21: getstatic     #75                 // Field ext/mods/gameserver/geoengine/PeaceZoneCollisionManager.INSTANCE:Lext/mods/gameserver/geoengine/PeaceZoneCollisionManager;
        24: aload_1
        25: invokevirtual #79                 // Method ext/mods/gameserver/geoengine/PeaceZoneCollisionManager.canIgnoreCreatureCollision:(Lext/mods/gameserver/model/actor/Creature;)Z
        28: ifeq          48
        31: aload_0
        32: iload_2
        33: iload_3
        34: iload         4
        36: iload         5
        38: iload         6
        40: iload         7
        42: aload         8
        44: invokespecial #82                 // Method findSimplifiedPath:(IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
        47: areturn
        48: aload_0
        49: iload_2
        50: iload_3
        51: iload         4
        53: iload         5
        55: iload         6
        57: iload         7
        59: aload         8
        61: invokespecial #58                 // Method findPathLegacy:(IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
        64: astore        9
        66: aload         9
        68: invokeinterface #88,  1           // InterfaceMethod java/util/List.isEmpty:()Z
        73: ifne          87
        76: aload         9
        78: invokeinterface #92,  1           // InterfaceMethod java/util/List.size:()I
        83: iconst_2
        84: if_icmpge     90
        87: aload         9
        89: areturn
        90: aload_0
        91: aload         9
        93: aload_1
        94: aload         8
        96: invokespecial #96                 // Method applyPathOptimizations:(Ljava/util/List;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
        99: areturn
      StackMapTable: number_of_entries = 4
        frame_type = 21 /* same */
        frame_type = 26 /* same */
        frame_type = 252 /* append */
          offset_delta = 38
          locals = [ class java/util/List ]
        frame_type = 2 /* same */
      LineNumberTable:
        line 68: 0
        line 69: 4
        line 71: 21
        line 72: 31
        line 74: 48
        line 76: 66
        line 77: 87
        line 79: 90
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           66      34     9 rawPath   Ljava/util/List;
            0     100     0  this   Lext/mods/gameserver/geoengine/pathfinding/PathFinder;
            0     100     1 creature   Lext/mods/gameserver/model/actor/Creature;
            0     100     2   gox   I
            0     100     3   goy   I
            0     100     4   goz   I
            0     100     5   gtx   I
            0     100     6   gty   I
            0     100     7   gtz   I
            0     100     8 debug   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
    Signature: #69                          // (Lext/mods/gameserver/model/actor/Creature;IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
    RuntimeInvisibleAnnotations:
      0: #54()
        org.jetbrains.annotations.NotNull
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #55()
          org.jetbrains.annotations.Nullable
      parameter 1:
      parameter 2:
      parameter 3:
      parameter 4:
      parameter 5:
      parameter 6:
      parameter 7:
        0: #55()
          org.jetbrains.annotations.Nullable
}
InnerClasses:
  public static final #35= #40 of #34;    // Companion=class ext/mods/gameserver/geoengine/GeoEngine$Companion of class ext/mods/gameserver/geoengine/GeoEngine
SourceFile: "PathFinder.kt"
SourceDebugExtension:
  SMAP
  PathFinder.kt
  Kotlin
  *S Kotlin
  *F
  + 1 PathFinder.kt
  ext/mods/gameserver/geoengine/pathfinding/PathFinder
  + 2 fake.kt
  kotlin/jvm/internal/FakeKt
  *L
  1#1,426:1
  1#2:427
  *E
RuntimeVisibleAnnotations:
  0: #506(#507=[I#508,I#509,I#510],#511=I#512,#513=I#514,#515=[s#516],#517=[s#50,s#518,s#5,s#6,s#12,s#13,s#306,s#19,s#20,s#519,s#283,s#518,s#286,s#289,s#305,s#29,s#518,s#45,s#46,s#51,s#518,s#186,s#59,s#61,s#62,s#63,s#64,s#65,s#66,s#67,s#99,s#100,s#80,s#130,s#147,s#153,s#518,s#151,s#518,s#93,s#194,s#203,s#249,s#259,s#260,s#261,s#262,s#256,s#56,s#337,s#342,s#518,s#231,s#398,s#518,s#393,s#276,s#277,s#278,s#406,s#390,s#391,s#415,s#402,s#416,s#417,s#418,s#419,s#411,s#491,s#492,s#493,s#494,s#518,s#313,s#503,s#520])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JF\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dJP\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dJH\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002JP\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J.\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00150$2\u0006\u0010%\u001a\u00020&2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J0\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J0\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J&\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J0\u0010*\u001a\u00020\u00152\u0006\u0010+\u001a\u00020\u00152\u0006\u0010,\u001a\u00020\u00152\u0006\u0010-\u001a\u00020\u00152\u0006\u0010.\u001a\u00020\u00152\u0006\u0010/\u001a\u00020&H\u0002JH\u00100\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J\u0018\u00101\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J\u0010\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u0006H\u0002JH\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u00062\u0006\u00108\u001a\u00020\u000b2\u0006\u00109\u001a\u00020\u000b2\u0006\u0010:\u001a\u00020\u000b2\u0006\u0010;\u001a\u0002062\u0006\u0010<\u001a\u00020\u000b2\u0006\u0010=\u001a\u00020\u000b2\u0006\u0010>\u001a\u000206H\u0002J`\u0010?\u001a\u0002032\u0006\u00107\u001a\u00020\u00062\u0006\u00108\u001a\u00020\u000b2\u0006\u00109\u001a\u00020\u000b2\u0006\u0010:\u001a\u00020\u000b2\u0006\u0010;\u001a\u0002062\u0006\u0010<\u001a\u00020\u000b2\u0006\u0010=\u001a\u00020\u000b2\u0006\u0010@\u001a\u0002062\u0006\u0010A\u001a\u0002062\u0006\u0010B\u001a\u0002062\u0006\u0010C\u001a\u000206H\u0002J0\u0010D\u001a\u0002062\u0006\u00107\u001a\u00020\u00062\u0006\u0010E\u001a\u00020\u000b2\u0006\u0010F\u001a\u00020\u000b2\u0006\u0010G\u001a\u00020\u000b2\u0006\u0010H\u001a\u00020IH\u0002J \u0010J\u001a\u00020\u000b2\u0006\u0010E\u001a\u00020\u000b2\u0006\u0010F\u001a\u00020\u000b2\u0006\u0010K\u001a\u00020\u000bH\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00060\bj\b\u0012\u0004\u0012\u00020\u0006`\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006L"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/PathFinder;","","<init>","()V","_opened","Lext/mods/commons/util/PriorityQueueSet;","Lext/mods/gameserver/geoengine/pathfinding/Node;","_closed","Ljava/util/HashSet;","Lkotlin/collections/HashSet;","_gtx","","_gty","_gtz","_current","_currentTime","","_geoEngine","Lext/mods/gameserver/geoengine/GeoEngine;","findPath","","Lext/mods/gameserver/model/location/Location;","gox","goy","goz","gtx","gty","gtz","debug","Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;","creature","Lext/mods/gameserver/model/actor/Creature;","findSimplifiedPath","findPathWithCollisionBox","optimizePathWithCollisionBox","path","","collisionRadius","","applyPathOptimizations","smoothPath","applyCurveInterpolation","catmullRomSpline","p0","p1","p2","p3","t","findPathLegacy","constructPath","expand","","current","addDirectionalNode","","parent","x","y","z","nswe","dx","dy","directionFlag","addCornerNode","dirFlagX","dirFlagY","nsweX","nsweY","addNode","gx","gy","checkZ","diagonal","","getCostH","gz","Brproject"]
    )
RuntimeInvisibleAnnotations:
  0: #522(#523=[s#524])
    kotlin.jvm.internal.SourceDebugExtension(
      value=["SMAP\nPathFinder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathFinder.kt\next/mods/gameserver/geoengine/pathfinding/PathFinder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,426:1\n1#2:427\n*E\n"]
    )
BootstrapMethods:
  0: #378 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #371 \u0001ms
