// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.core.jps.JPSPlusCalculator
// File: ext\mods\gameserver\geoengine\pathfinding\core\jps\JPSPlusCalculator.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator.class
  Last modified 9 de jul de 2026; size 10641 bytes
  MD5 checksum 5791a96f32f58623d3954fc88d020e33
  Compiled from "JPSPlusCalculator.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.core.jps.JPSPlusCalculator
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 8, methods: 12, attributes: 4
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator
    #2 = Class              #1            // ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator
    #3 = Utf8               java/lang/Object
    #4 = Class              #3            // java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;)V
    #7 = Utf8               Lorg/jetbrains/annotations/NotNull;
    #8 = Utf8               ()V
    #9 = NameAndType        #5:#8         // "<init>":()V
   #10 = Methodref          #4.#9         // java/lang/Object."<init>":()V
   #11 = Utf8               storage
   #12 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
   #13 = NameAndType        #11:#12       // storage:Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
   #14 = Fieldref           #2.#13        // ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator.storage:Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
   #15 = Utf8               dynamicLayer
   #16 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;
   #17 = NameAndType        #15:#16       // dynamicLayer:Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;
   #18 = Fieldref           #2.#17        // ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator.dynamicLayer:Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;
   #19 = Utf8               java/util/PriorityQueue
   #20 = Class              #19           // java/util/PriorityQueue
   #21 = Utf8               ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$special$$inlined$compareBy$1
   #22 = Class              #21           // ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$special$$inlined$compareBy$1
   #23 = Methodref          #22.#9        // ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$special$$inlined$compareBy$1."<init>":()V
   #24 = Utf8               java/util/Comparator
   #25 = Class              #24           // java/util/Comparator
   #26 = Utf8               (ILjava/util/Comparator;)V
   #27 = NameAndType        #5:#26        // "<init>":(ILjava/util/Comparator;)V
   #28 = Methodref          #20.#27       // java/util/PriorityQueue."<init>":(ILjava/util/Comparator;)V
   #29 = Utf8               openSet
   #30 = Utf8               Ljava/util/PriorityQueue;
   #31 = NameAndType        #29:#30       // openSet:Ljava/util/PriorityQueue;
   #32 = Fieldref           #2.#31        // ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator.openSet:Ljava/util/PriorityQueue;
   #33 = Utf8               ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage
   #34 = Class              #33           // ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage
   #35 = Utf8               getNodeCount
   #36 = Utf8               ()I
   #37 = NameAndType        #35:#36       // getNodeCount:()I
   #38 = Methodref          #34.#37       // ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage.getNodeCount:()I
   #39 = Integer            2147483647
   #40 = Utf8               gScores
   #41 = Utf8               [I
   #42 = NameAndType        #40:#41       // gScores:[I
   #43 = Fieldref           #2.#42        // ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator.gScores:[I
   #44 = Utf8               fScores
   #45 = NameAndType        #44:#41       // fScores:[I
   #46 = Fieldref           #2.#45        // ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator.fScores:[I
   #47 = Utf8               cameFrom
   #48 = NameAndType        #47:#41       // cameFrom:[I
   #49 = Fieldref           #2.#48        // ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator.cameFrom:[I
   #50 = Utf8               java/util/BitSet
   #51 = Class              #50           // java/util/BitSet
   #52 = Utf8               (I)V
   #53 = NameAndType        #5:#52        // "<init>":(I)V
   #54 = Methodref          #51.#53       // java/util/BitSet."<init>":(I)V
   #55 = Utf8               closedSet
   #56 = Utf8               Ljava/util/BitSet;
   #57 = NameAndType        #55:#56       // closedSet:Ljava/util/BitSet;
   #58 = Fieldref           #2.#57        // ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator.closedSet:Ljava/util/BitSet;
   #59 = Utf8               kotlin/Lazy
   #60 = Class              #59           // kotlin/Lazy
   #61 = Utf8               ()Ljava/lang/Object;
   #62 = MethodType         #61           //  ()Ljava/lang/Object;
   #63 = Utf8               nodeCache$lambda$0
   #64 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator;I)Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;
   #65 = NameAndType        #63:#64       // nodeCache$lambda$0:(Lext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator;I)Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;
   #66 = Methodref          #2.#65        // ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator.nodeCache$lambda$0:(Lext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator;I)Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;
   #67 = MethodHandle       6:#66         // REF_invokeStatic ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator.nodeCache$lambda$0:(Lext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator;I)Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;
   #68 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;
   #69 = MethodType         #68           //  ()Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;
   #70 = Utf8               java/lang/invoke/LambdaMetafactory
   #71 = Class              #70           // java/lang/invoke/LambdaMetafactory
   #72 = Utf8               metafactory
   #73 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
   #74 = NameAndType        #72:#73       // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
   #75 = Methodref          #71.#74       // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
   #76 = MethodHandle       6:#75         // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
   #77 = Utf8               invoke
   #78 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator;I)Lkotlin/jvm/functions/Function0;
   #79 = NameAndType        #77:#78       // invoke:(Lext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator;I)Lkotlin/jvm/functions/Function0;
   #80 = InvokeDynamic      #0:#79        // #0:invoke:(Lext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator;I)Lkotlin/jvm/functions/Function0;
   #81 = Utf8               kotlin/LazyKt
   #82 = Class              #81           // kotlin/LazyKt
   #83 = Utf8               lazy
   #84 = Utf8               (Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;
   #85 = NameAndType        #83:#84       // lazy:(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;
   #86 = Methodref          #82.#85       // kotlin/LazyKt.lazy:(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;
   #87 = Utf8               nodeCache
   #88 = Utf8               [Lkotlin/Lazy;
   #89 = NameAndType        #87:#88       // nodeCache:[Lkotlin/Lazy;
   #90 = Fieldref           #2.#89        // ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator.nodeCache:[Lkotlin/Lazy;
   #91 = Utf8               this
   #92 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator;
   #93 = Utf8               ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer
   #94 = Class              #93           // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer
   #95 = Class              #41           // "[I"
   #96 = Class              #88           // "[Lkotlin/Lazy;"
   #97 = Utf8               findPath
   #98 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/model/Location;Lext/mods/gameserver/geoengine/pathfinding/model/Location;)Ljava/util/List;
   #99 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/model/Location;Lext/mods/gameserver/geoengine/pathfinding/model/Location;)Ljava/util/List<Lext/mods/gameserver/geoengine/pathfinding/model/Location;>;
  #100 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/Location
  #101 = Class              #100          // ext/mods/gameserver/geoengine/pathfinding/model/Location
  #102 = Utf8               toGeo
  #103 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;
  #104 = NameAndType        #102:#103     // toGeo:()Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;
  #105 = Methodref          #101.#104     // ext/mods/gameserver/geoengine/pathfinding/model/Location.toGeo:()Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;
  #106 = Utf8               getNodeId
  #107 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;)I
  #108 = NameAndType        #106:#107     // getNodeId:(Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;)I
  #109 = Methodref          #2.#108       // ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator.getNodeId:(Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;)I
  #110 = Utf8               kotlin/collections/CollectionsKt
  #111 = Class              #110          // kotlin/collections/CollectionsKt
  #112 = Utf8               emptyList
  #113 = Utf8               ()Ljava/util/List;
  #114 = NameAndType        #112:#113     // emptyList:()Ljava/util/List;
  #115 = Methodref          #111.#114     // kotlin/collections/CollectionsKt.emptyList:()Ljava/util/List;
  #116 = Utf8               listOf
  #117 = Utf8               (Ljava/lang/Object;)Ljava/util/List;
  #118 = NameAndType        #116:#117     // listOf:(Ljava/lang/Object;)Ljava/util/List;
  #119 = Methodref          #111.#118     // kotlin/collections/CollectionsKt.listOf:(Ljava/lang/Object;)Ljava/util/List;
  #120 = Utf8               isWalkable
  #121 = Utf8               (I)Z
  #122 = NameAndType        #120:#121     // isWalkable:(I)Z
  #123 = Methodref          #2.#122       // ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator.isWalkable:(I)Z
  #124 = Utf8               resetStructures
  #125 = NameAndType        #124:#8       // resetStructures:()V
  #126 = Methodref          #2.#125       // ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator.resetStructures:()V
  #127 = Utf8               heuristic
  #128 = Utf8               (II)I
  #129 = NameAndType        #127:#128     // heuristic:(II)I
  #130 = Methodref          #2.#129       // ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator.heuristic:(II)I
  #131 = Utf8               ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$NodeEntry
  #132 = Class              #131          // ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$NodeEntry
  #133 = Utf8               (II)V
  #134 = NameAndType        #5:#133       // "<init>":(II)V
  #135 = Methodref          #132.#134     // ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$NodeEntry."<init>":(II)V
  #136 = Utf8               add
  #137 = Utf8               (Ljava/lang/Object;)Z
  #138 = NameAndType        #136:#137     // add:(Ljava/lang/Object;)Z
  #139 = Methodref          #20.#138      // java/util/PriorityQueue.add:(Ljava/lang/Object;)Z
  #140 = Utf8               java/util/Collection
  #141 = Class              #140          // java/util/Collection
  #142 = Utf8               isEmpty
  #143 = Utf8               ()Z
  #144 = NameAndType        #142:#143     // isEmpty:()Z
  #145 = InterfaceMethodref #141.#144     // java/util/Collection.isEmpty:()Z
  #146 = Utf8               poll
  #147 = NameAndType        #146:#61      // poll:()Ljava/lang/Object;
  #148 = Methodref          #20.#147      // java/util/PriorityQueue.poll:()Ljava/lang/Object;
  #149 = NameAndType        #106:#36      // getNodeId:()I
  #150 = Methodref          #132.#149     // ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$NodeEntry.getNodeId:()I
  #151 = Utf8               reconstructPath
  #152 = Utf8               (ILext/mods/gameserver/geoengine/pathfinding/model/Location;Lext/mods/gameserver/geoengine/pathfinding/model/Location;)Ljava/util/List;
  #153 = NameAndType        #151:#152     // reconstructPath:(ILext/mods/gameserver/geoengine/pathfinding/model/Location;Lext/mods/gameserver/geoengine/pathfinding/model/Location;)Ljava/util/List;
  #154 = Methodref          #2.#153       // ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator.reconstructPath:(ILext/mods/gameserver/geoengine/pathfinding/model/Location;Lext/mods/gameserver/geoengine/pathfinding/model/Location;)Ljava/util/List;
  #155 = Utf8               get
  #156 = NameAndType        #155:#121     // get:(I)Z
  #157 = Methodref          #51.#156      // java/util/BitSet.get:(I)Z
  #158 = Utf8               set
  #159 = NameAndType        #158:#52      // set:(I)V
  #160 = Methodref          #51.#159      // java/util/BitSet.set:(I)V
  #161 = Utf8               expandNode
  #162 = NameAndType        #161:#133     // expandNode:(II)V
  #163 = Methodref          #2.#162       // ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator.expandNode:(II)V
  #164 = Utf8               current
  #165 = Utf8               I
  #166 = Utf8               startGeo
  #167 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;
  #168 = Utf8               goalGeo
  #169 = Utf8               startId
  #170 = Utf8               goalId
  #171 = Utf8               iterations
  #172 = Utf8               maxIterations
  #173 = Utf8               start
  #174 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/Location;
  #175 = Utf8               goal
  #176 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/GeoLocation
  #177 = Class              #176          // ext/mods/gameserver/geoengine/pathfinding/model/GeoLocation
  #178 = Utf8               getValue
  #179 = NameAndType        #178:#61      // getValue:()Ljava/lang/Object;
  #180 = InterfaceMethodref #60.#179      // kotlin/Lazy.getValue:()Ljava/lang/Object;
  #181 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/PathNode
  #182 = Class              #181          // ext/mods/gameserver/geoengine/pathfinding/model/PathNode
  #183 = Utf8               getJpsDistance
  #184 = Utf8               (I)I
  #185 = NameAndType        #183:#184     // getJpsDistance:(I)I
  #186 = Methodref          #182.#185     // ext/mods/gameserver/geoengine/pathfinding/model/PathNode.getJpsDistance:(I)I
  #187 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/Direction
  #188 = Class              #187          // ext/mods/gameserver/geoengine/pathfinding/model/Direction
  #189 = Utf8               Companion
  #190 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/Direction$Companion;
  #191 = NameAndType        #189:#190     // Companion:Lext/mods/gameserver/geoengine/pathfinding/model/Direction$Companion;
  #192 = Fieldref           #188.#191     // ext/mods/gameserver/geoengine/pathfinding/model/Direction.Companion:Lext/mods/gameserver/geoengine/pathfinding/model/Direction$Companion;
  #193 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/Direction$Companion
  #194 = Class              #193          // ext/mods/gameserver/geoengine/pathfinding/model/Direction$Companion
  #195 = Utf8               fromIndex
  #196 = Utf8               (I)Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
  #197 = NameAndType        #195:#196     // fromIndex:(I)Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
  #198 = Methodref          #194.#197     // ext/mods/gameserver/geoengine/pathfinding/model/Direction$Companion.fromIndex:(I)Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
  #199 = Utf8               jump
  #200 = Utf8               (ILext/mods/gameserver/geoengine/pathfinding/model/Direction;I)I
  #201 = NameAndType        #199:#200     // jump:(ILext/mods/gameserver/geoengine/pathfinding/model/Direction;I)I
  #202 = Methodref          #2.#201       // ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator.jump:(ILext/mods/gameserver/geoengine/pathfinding/model/Direction;I)I
  #203 = Utf8               isBlocked
  #204 = NameAndType        #203:#121     // isBlocked:(I)Z
  #205 = Methodref          #94.#204      // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer.isBlocked:(I)Z
  #206 = Utf8               getCost
  #207 = NameAndType        #206:#36      // getCost:()I
  #208 = Methodref          #188.#207     // ext/mods/gameserver/geoengine/pathfinding/model/Direction.getCost:()I
  #209 = Utf8               jumpDistance
  #210 = Utf8               direction
  #211 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
  #212 = Utf8               neighborId
  #213 = Utf8               moveCost
  #214 = Utf8               tentativeG
  #215 = Utf8               dirIdx
  #216 = Utf8               currentNode
  #217 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;
  #218 = Utf8               currentG
  #219 = Utf8               currentId
  #220 = Utf8               getNeighborId
  #221 = Utf8               (ILext/mods/gameserver/geoengine/pathfinding/model/Direction;)I
  #222 = NameAndType        #220:#221     // getNeighborId:(ILext/mods/gameserver/geoengine/pathfinding/model/Direction;)I
  #223 = Methodref          #2.#222       // ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator.getNeighborId:(ILext/mods/gameserver/geoengine/pathfinding/model/Direction;)I
  #224 = Utf8               hasForcedNeighbor
  #225 = Utf8               (ILext/mods/gameserver/geoengine/pathfinding/model/Direction;)Z
  #226 = NameAndType        #224:#225     // hasForcedNeighbor:(ILext/mods/gameserver/geoengine/pathfinding/model/Direction;)Z
  #227 = Methodref          #2.#226       // ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator.hasForcedNeighbor:(ILext/mods/gameserver/geoengine/pathfinding/model/Direction;)Z
  #228 = Utf8               node
  #229 = Utf8               nextId
  #230 = Utf8               remaining
  #231 = Utf8               fromId
  #232 = Utf8               maxDistance
  #233 = Utf8               getDx
  #234 = NameAndType        #233:#36      // getDx:()I
  #235 = Methodref          #188.#234     // ext/mods/gameserver/geoengine/pathfinding/model/Direction.getDx:()I
  #236 = Utf8               getDy
  #237 = NameAndType        #236:#36      // getDy:()I
  #238 = Methodref          #188.#237     // ext/mods/gameserver/geoengine/pathfinding/model/Direction.getDy:()I
  #239 = Utf8               fromDelta
  #240 = Utf8               (II)Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
  #241 = NameAndType        #239:#240     // fromDelta:(II)Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
  #242 = Methodref          #194.#241     // ext/mods/gameserver/geoengine/pathfinding/model/Direction$Companion.fromDelta:(II)Lext/mods/gameserver/geoengine/pathfinding/model/Direction;
  #243 = Utf8               ordinal
  #244 = NameAndType        #243:#36      // ordinal:()I
  #245 = Methodref          #188.#244     // ext/mods/gameserver/geoengine/pathfinding/model/Direction.ordinal:()I
  #246 = Utf8               dirX
  #247 = Utf8               dirY
  #248 = Utf8               nodeId
  #249 = Utf8               getX
  #250 = NameAndType        #249:#36      // getX:()I
  #251 = Methodref          #182.#250     // ext/mods/gameserver/geoengine/pathfinding/model/PathNode.getX:()I
  #252 = Utf8               java/lang/Math
  #253 = Class              #252          // java/lang/Math
  #254 = Utf8               abs
  #255 = NameAndType        #254:#184     // abs:(I)I
  #256 = Methodref          #253.#255     // java/lang/Math.abs:(I)I
  #257 = Utf8               getY
  #258 = NameAndType        #257:#36      // getY:()I
  #259 = Methodref          #182.#258     // ext/mods/gameserver/geoengine/pathfinding/model/PathNode.getY:()I
  #260 = Utf8               min
  #261 = NameAndType        #260:#128     // min:(II)I
  #262 = Methodref          #253.#261     // java/lang/Math.min:(II)I
  #263 = Utf8               from
  #264 = Utf8               to
  #265 = Utf8               dx
  #266 = Utf8               dy
  #267 = Utf8               toId
  #268 = Utf8               (ILext/mods/gameserver/geoengine/pathfinding/model/Location;Lext/mods/gameserver/geoengine/pathfinding/model/Location;)Ljava/util/List<Lext/mods/gameserver/geoengine/pathfinding/model/Location;>;
  #269 = Utf8               java/util/LinkedList
  #270 = Class              #269          // java/util/LinkedList
  #271 = Methodref          #270.#9       // java/util/LinkedList."<init>":()V
  #272 = Utf8               addFirst
  #273 = Utf8               (Ljava/lang/Object;)V
  #274 = NameAndType        #272:#273     // addFirst:(Ljava/lang/Object;)V
  #275 = Methodref          #270.#274     // java/util/LinkedList.addFirst:(Ljava/lang/Object;)V
  #276 = Utf8               toLocation
  #277 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/model/Location;
  #278 = NameAndType        #276:#277     // toLocation:()Lext/mods/gameserver/geoengine/pathfinding/model/Location;
  #279 = Methodref          #182.#278     // ext/mods/gameserver/geoengine/pathfinding/model/PathNode.toLocation:()Lext/mods/gameserver/geoengine/pathfinding/model/Location;
  #280 = Utf8               java/util/List
  #281 = Class              #280          // java/util/List
  #282 = Utf8               firstOrNull
  #283 = Utf8               (Ljava/util/List;)Ljava/lang/Object;
  #284 = NameAndType        #282:#283     // firstOrNull:(Ljava/util/List;)Ljava/lang/Object;
  #285 = Methodref          #111.#284     // kotlin/collections/CollectionsKt.firstOrNull:(Ljava/util/List;)Ljava/lang/Object;
  #286 = Utf8               kotlin/jvm/internal/Intrinsics
  #287 = Class              #286          // kotlin/jvm/internal/Intrinsics
  #288 = Utf8               areEqual
  #289 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Z
  #290 = NameAndType        #288:#289     // areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
  #291 = Methodref          #287.#290     // kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
  #292 = Utf8               path
  #293 = Utf8               Ljava/util/LinkedList;
  #294 = Utf8               endId
  #295 = Methodref          #177.#250     // ext/mods/gameserver/geoengine/pathfinding/model/GeoLocation.getX:()I
  #296 = Methodref          #177.#258     // ext/mods/gameserver/geoengine/pathfinding/model/GeoLocation.getY:()I
  #297 = Utf8               localX
  #298 = Utf8               localY
  #299 = Utf8               geo
  #300 = Utf8               newX
  #301 = Utf8               newY
  #302 = NameAndType        #120:#143     // isWalkable:()Z
  #303 = Methodref          #182.#302     // ext/mods/gameserver/geoengine/pathfinding/model/PathNode.isWalkable:()Z
  #304 = Utf8               clear
  #305 = NameAndType        #304:#8       // clear:()V
  #306 = Methodref          #20.#305      // java/util/PriorityQueue.clear:()V
  #307 = Methodref          #51.#305      // java/util/BitSet.clear:()V
  #308 = Utf8               java/util/Arrays
  #309 = Class              #308          // java/util/Arrays
  #310 = Utf8               fill
  #311 = Utf8               ([II)V
  #312 = NameAndType        #310:#311     // fill:([II)V
  #313 = Methodref          #309.#312     // java/util/Arrays.fill:([II)V
  #314 = Utf8               getNode
  #315 = Utf8               (I)Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;
  #316 = NameAndType        #314:#315     // getNode:(I)Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;
  #317 = Methodref          #34.#316      // ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage.getNode:(I)Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;
  #318 = Utf8               this$0
  #319 = Utf8               $tmp
  #320 = Utf8               Ljava/util/PriorityQueue<Lext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$NodeEntry;>;
  #321 = Utf8               [Lkotlin/Lazy<Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;>;
  #322 = Utf8               Lkotlin/Metadata;
  #323 = Utf8               mv
  #324 = Integer            2
  #325 = Integer            3
  #326 = Integer            0
  #327 = Utf8               k
  #328 = Integer            1
  #329 = Utf8               xi
  #330 = Integer            48
  #331 = Utf8               d1
  #332 = Utf8               \u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u000223B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002J \u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001eH\u0002J\u0018\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020#H\u0002J\u0018\u0010(\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020\u001eH\u0002J&\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010+\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0002J\u0010\u0010,\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020.H\u0002J\u0018\u0010/\u001a\u00020\u001e2\u0006\u0010\'\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020#H\u0002J\u0010\u00100\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u001eH\u0002J\b\u00101\u001a\u00020\u001cH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0012X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0015¨\u00064
  #333 = Utf8               d2
  #334 = Utf8
  #335 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$NodeEntry;
  #336 = Utf8               Lkotlin/Lazy;
  #337 = Utf8               NodeEntry
  #338 = Utf8               SearchStats
  #339 = Utf8               Brproject
  #340 = Utf8               ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$SearchStats
  #341 = Class              #340          // ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$SearchStats
  #342 = Utf8               JPSPlusCalculator.kt
  #343 = Utf8               RuntimeInvisibleAnnotations
  #344 = Utf8               Signature
  #345 = Utf8               Code
  #346 = Utf8               StackMapTable
  #347 = Utf8               LineNumberTable
  #348 = Utf8               LocalVariableTable
  #349 = Utf8               RuntimeInvisibleParameterAnnotations
  #350 = Utf8               InnerClasses
  #351 = Utf8               SourceFile
  #352 = Utf8               RuntimeVisibleAnnotations
  #353 = Utf8               BootstrapMethods
{
  public ext.mods.gameserver.geoengine.pathfinding.core.jps.JPSPlusCalculator(ext.mods.gameserver.geoengine.pathfinding.native.NativeStorage, ext.mods.gameserver.geoengine.pathfinding.dynamic.DynamicObstacleLayer);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=8, args_size=3
         0: aload_0
         1: invokespecial #10                 // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #14                 // Field storage:Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
         9: aload_0
        10: aload_2
        11: putfield      #18                 // Field dynamicLayer:Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;
        14: aload_0
        15: new           #20                 // class java/util/PriorityQueue
        18: dup
        19: sipush        1024
        22: new           #22                 // class ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$special$$inlined$compareBy$1
        25: dup
        26: invokespecial #23                 // Method ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$special$$inlined$compareBy$1."<init>":()V
        29: checkcast     #25                 // class java/util/Comparator
        32: invokespecial #28                 // Method java/util/PriorityQueue."<init>":(ILjava/util/Comparator;)V
        35: putfield      #32                 // Field openSet:Ljava/util/PriorityQueue;
        38: aload_0
        39: iconst_0
        40: istore_3
        41: aload_0
        42: getfield      #14                 // Field storage:Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
        45: invokevirtual #38                 // Method ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage.getNodeCount:()I
        48: istore        4
        50: iload         4
        52: newarray       int
        54: astore        5
        56: astore        7
        58: iload_3
        59: iload         4
        61: if_icmpge     80
        64: iload_3
        65: istore        6
        67: aload         5
        69: iload         6
        71: ldc           #39                 // int 2147483647
        73: iastore
        74: iinc          3, 1
        77: goto          58
        80: aload         7
        82: aload         5
        84: putfield      #43                 // Field gScores:[I
        87: aload_0
        88: iconst_0
        89: istore_3
        90: aload_0
        91: getfield      #14                 // Field storage:Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
        94: invokevirtual #38                 // Method ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage.getNodeCount:()I
        97: istore        4
        99: iload         4
       101: newarray       int
       103: astore        5
       105: astore        7
       107: iload_3
       108: iload         4
       110: if_icmpge     129
       113: iload_3
       114: istore        6
       116: aload         5
       118: iload         6
       120: ldc           #39                 // int 2147483647
       122: iastore
       123: iinc          3, 1
       126: goto          107
       129: aload         7
       131: aload         5
       133: putfield      #46                 // Field fScores:[I
       136: aload_0
       137: iconst_0
       138: istore_3
       139: aload_0
       140: getfield      #14                 // Field storage:Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
       143: invokevirtual #38                 // Method ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage.getNodeCount:()I
       146: istore        4
       148: iload         4
       150: newarray       int
       152: astore        5
       154: astore        7
       156: iload_3
       157: iload         4
       159: if_icmpge     177
       162: iload_3
       163: istore        6
       165: aload         5
       167: iload         6
       169: iconst_m1
       170: iastore
       171: iinc          3, 1
       174: goto          156
       177: aload         7
       179: aload         5
       181: putfield      #49                 // Field cameFrom:[I
       184: aload_0
       185: new           #51                 // class java/util/BitSet
       188: dup
       189: aload_0
       190: getfield      #14                 // Field storage:Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
       193: invokevirtual #38                 // Method ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage.getNodeCount:()I
       196: invokespecial #54                 // Method java/util/BitSet."<init>":(I)V
       199: putfield      #58                 // Field closedSet:Ljava/util/BitSet;
       202: aload_0
       203: iconst_0
       204: istore_3
       205: aload_0
       206: getfield      #14                 // Field storage:Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
       209: invokevirtual #38                 // Method ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage.getNodeCount:()I
       212: istore        4
       214: iload         4
       216: anewarray     #60                 // class kotlin/Lazy
       219: astore        5
       221: astore        7
       223: iload_3
       224: iload         4
       226: if_icmpge     254
       229: iload_3
       230: istore        6
       232: aload         5
       234: iload         6
       236: aload_0
       237: iload         6
       239: invokedynamic #80,  0             // InvokeDynamic #0:invoke:(Lext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator;I)Lkotlin/jvm/functions/Function0;
       244: invokestatic  #86                 // Method kotlin/LazyKt.lazy:(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;
       247: aastore
       248: iinc          3, 1
       251: goto          223
       254: aload         7
       256: aload         5
       258: putfield      #90                 // Field nodeCache:[Lkotlin/Lazy;
       261: return
      StackMapTable: number_of_entries = 8
        frame_type = 255 /* full_frame */
          offset_delta = 58
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator, class ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage, class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer, int, int, class "[I", top, class ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator ]
          stack = []
        frame_type = 21 /* same */
        frame_type = 26 /* same */
        frame_type = 21 /* same */
        frame_type = 26 /* same */
        frame_type = 20 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 45
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator, class ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage, class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer, int, int, class "[Lkotlin/Lazy;", top, class ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator ]
          stack = []
        frame_type = 30 /* same */
      LineNumberTable:
        line 29: 0
        line 30: 4
        line 31: 9
        line 33: 14
        line 33: 32
        line 34: 38
        line 35: 87
        line 36: 136
        line 37: 184
        line 39: 202
        line 40: 236
        line 39: 248
        line 29: 261
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     262     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator;
            0     262     1 storage   Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
            0     262     2 dynamicLayer   Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #7()
          org.jetbrains.annotations.NotNull
      parameter 1:
        0: #7()
          org.jetbrains.annotations.NotNull

  public final java.util.List<ext.mods.gameserver.geoengine.pathfinding.model.Location> findPath(ext.mods.gameserver.geoengine.pathfinding.model.Location, ext.mods.gameserver.geoengine.pathfinding.model.Location);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/model/Location;Lext/mods/gameserver/geoengine/pathfinding/model/Location;)Ljava/util/List;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=6, locals=10, args_size=3
         0: aload_1
         1: invokevirtual #105                // Method ext/mods/gameserver/geoengine/pathfinding/model/Location.toGeo:()Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;
         4: astore_3
         5: aload_2
         6: invokevirtual #105                // Method ext/mods/gameserver/geoengine/pathfinding/model/Location.toGeo:()Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;
         9: astore        4
        11: aload_0
        12: aload_3
        13: invokespecial #109                // Method getNodeId:(Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;)I
        16: istore        5
        18: aload_0
        19: aload         4
        21: invokespecial #109                // Method getNodeId:(Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;)I
        24: istore        6
        26: iload         5
        28: iflt          36
        31: iload         6
        33: ifge          40
        36: invokestatic  #115                // Method kotlin/collections/CollectionsKt.emptyList:()Ljava/util/List;
        39: areturn
        40: iload         5
        42: iload         6
        44: if_icmpne     52
        47: aload_1
        48: invokestatic  #119                // Method kotlin/collections/CollectionsKt.listOf:(Ljava/lang/Object;)Ljava/util/List;
        51: areturn
        52: aload_0
        53: iload         6
        55: invokespecial #123                // Method isWalkable:(I)Z
        58: ifne          65
        61: invokestatic  #115                // Method kotlin/collections/CollectionsKt.emptyList:()Ljava/util/List;
        64: areturn
        65: aload_0
        66: invokespecial #126                // Method resetStructures:()V
        69: aload_0
        70: getfield      #43                 // Field gScores:[I
        73: iload         5
        75: iconst_0
        76: iastore
        77: aload_0
        78: getfield      #46                 // Field fScores:[I
        81: iload         5
        83: aload_0
        84: iload         5
        86: iload         6
        88: invokespecial #130                // Method heuristic:(II)I
        91: iastore
        92: aload_0
        93: getfield      #32                 // Field openSet:Ljava/util/PriorityQueue;
        96: new           #132                // class ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$NodeEntry
        99: dup
       100: iload         5
       102: aload_0
       103: getfield      #46                 // Field fScores:[I
       106: iload         5
       108: iaload
       109: invokespecial #135                // Method ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$NodeEntry."<init>":(II)V
       112: invokevirtual #139                // Method java/util/PriorityQueue.add:(Ljava/lang/Object;)Z
       115: pop
       116: iconst_0
       117: istore        7
       119: aload_0
       120: getfield      #14                 // Field storage:Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
       123: invokevirtual #38                 // Method ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage.getNodeCount:()I
       126: iconst_4
       127: idiv
       128: istore        8
       130: aload_0
       131: getfield      #32                 // Field openSet:Ljava/util/PriorityQueue;
       134: checkcast     #141                // class java/util/Collection
       137: invokeinterface #145,  1          // InterfaceMethod java/util/Collection.isEmpty:()Z
       142: ifne          149
       145: iconst_1
       146: goto          150
       149: iconst_0
       150: ifeq          237
       153: iload         7
       155: iload         8
       157: if_icmpge     237
       160: iinc          7, 1
       163: aload_0
       164: getfield      #32                 // Field openSet:Ljava/util/PriorityQueue;
       167: invokevirtual #148                // Method java/util/PriorityQueue.poll:()Ljava/lang/Object;
       170: checkcast     #132                // class ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$NodeEntry
       173: dup
       174: ifnull        183
       177: invokevirtual #150                // Method ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$NodeEntry.getNodeId:()I
       180: goto          187
       183: pop
       184: goto          237
       187: istore        9
       189: iload         9
       191: iload         6
       193: if_icmpne     205
       196: aload_0
       197: iload         9
       199: aload_1
       200: aload_2
       201: invokespecial #154                // Method reconstructPath:(ILext/mods/gameserver/geoengine/pathfinding/model/Location;Lext/mods/gameserver/geoengine/pathfinding/model/Location;)Ljava/util/List;
       204: areturn
       205: aload_0
       206: getfield      #58                 // Field closedSet:Ljava/util/BitSet;
       209: iload         9
       211: invokevirtual #157                // Method java/util/BitSet.get:(I)Z
       214: ifne          130
       217: aload_0
       218: getfield      #58                 // Field closedSet:Ljava/util/BitSet;
       221: iload         9
       223: invokevirtual #160                // Method java/util/BitSet.set:(I)V
       226: aload_0
       227: iload         9
       229: iload         6
       231: invokespecial #163                // Method expandNode:(II)V
       234: goto          130
       237: invokestatic  #115                // Method kotlin/collections/CollectionsKt.emptyList:()Ljava/util/List;
       240: areturn
      StackMapTable: number_of_entries = 11
        frame_type = 255 /* full_frame */
          offset_delta = 36
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator, class ext/mods/gameserver/geoengine/pathfinding/model/Location, class ext/mods/gameserver/geoengine/pathfinding/model/Location, class ext/mods/gameserver/geoengine/pathfinding/model/GeoLocation, class ext/mods/gameserver/geoengine/pathfinding/model/GeoLocation, int, int ]
          stack = []
        frame_type = 3 /* same */
        frame_type = 11 /* same */
        frame_type = 12 /* same */
        frame_type = 253 /* append */
          offset_delta = 64
          locals = [ int, int ]
        frame_type = 18 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 96 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$NodeEntry ]
        frame_type = 67 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 17
          locals = [ int ]
        frame_type = 250 /* chop */
          offset_delta = 31
      LineNumberTable:
        line 44: 0
        line 45: 5
        line 47: 11
        line 48: 18
        line 50: 26
        line 51: 40
        line 52: 52
        line 54: 65
        line 56: 69
        line 57: 77
        line 58: 92
        line 60: 116
        line 61: 119
        line 63: 130
        line 63: 150
        line 64: 160
        line 65: 163
        line 67: 189
        line 68: 196
        line 71: 205
        line 72: 217
        line 74: 226
        line 77: 237
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          189      45     9 current   I
            5     236     3 startGeo   Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;
           11     230     4 goalGeo   Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;
           18     223     5 startId   I
           26     215     6 goalId   I
          119     122     7 iterations   I
          130     111     8 maxIterations   I
            0     241     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator;
            0     241     1 start   Lext/mods/gameserver/geoengine/pathfinding/model/Location;
            0     241     2  goal   Lext/mods/gameserver/geoengine/pathfinding/model/Location;
    Signature: #99                          // (Lext/mods/gameserver/geoengine/pathfinding/model/Location;Lext/mods/gameserver/geoengine/pathfinding/model/Location;)Ljava/util/List<Lext/mods/gameserver/geoengine/pathfinding/model/Location;>;
    RuntimeInvisibleAnnotations:
      0: #7()
        org.jetbrains.annotations.NotNull
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #7()
          org.jetbrains.annotations.NotNull
      parameter 1:
        0: #7()
          org.jetbrains.annotations.NotNull
}
InnerClasses:
  public static final #338= #341 of #2;   // SearchStats=class ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$SearchStats of class ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator
  public static final #189= #194 of #188; // Companion=class ext/mods/gameserver/geoengine/pathfinding/model/Direction$Companion of class ext/mods/gameserver/geoengine/pathfinding/model/Direction
SourceFile: "JPSPlusCalculator.kt"
RuntimeVisibleAnnotations:
  0: #322(#323=[I#324,I#325,I#326],#327=I#328,#329=I#330,#331=[s#332],#333=[s#92,s#334,s#11,s#12,s#15,s#16,s#5,s#6,s#29,s#30,s#335,s#40,s#334,s#44,s#47,s#55,s#56,s#87,s#334,s#336,s#217,s#88,s#97,s#334,s#174,s#173,s#175,s#161,s#334,s#219,s#334,s#170,s#199,s#231,s#210,s#211,s#232,s#224,s#334,s#248,s#127,s#267,s#151,s#294,s#106,s#299,s#167,s#220,s#120,s#124,s#337,s#338,s#339])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u000223B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002J \u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001eH\u0002J\u0018\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020#H\u0002J\u0018\u0010(\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020\u001eH\u0002J&\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010+\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0002J\u0010\u0010,\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020.H\u0002J\u0018\u0010/\u001a\u00020\u001e2\u0006\u0010\'\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020#H\u0002J\u0010\u00100\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u001eH\u0002J\b\u00101\u001a\u00020\u001cH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0012X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0015¨\u00064"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator;","","storage","Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;","dynamicLayer","Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;","<init>","(Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;)V","openSet","Ljava/util/PriorityQueue;","Lext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator$NodeEntry;","gScores","","fScores","cameFrom","closedSet","Ljava/util/BitSet;","nodeCache","","Lkotlin/Lazy;","Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;","[Lkotlin/Lazy;","findPath","","Lext/mods/gameserver/geoengine/pathfinding/model/Location;","start","goal","expandNode","","currentId","","goalId","jump","fromId","direction","Lext/mods/gameserver/geoengine/pathfinding/model/Direction;","maxDistance","hasForcedNeighbor","","nodeId","heuristic","toId","reconstructPath","endId","getNodeId","geo","Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;","getNeighborId","isWalkable","resetStructures","NodeEntry","SearchStats","Brproject"]
    )
BootstrapMethods:
  0: #76 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #62 ()Ljava/lang/Object;
      #67 REF_invokeStatic ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator.nodeCache$lambda$0:(Lext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator;I)Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;
      #69 ()Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;
