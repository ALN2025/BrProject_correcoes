// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.core.L2BREngine
// File: ext\mods\gameserver\geoengine\pathfinding\core\L2BREngine.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine.class
  Last modified 9 de jul de 2026; size 19272 bytes
  MD5 checksum 0ff3130f01a8f297c3321eefc74eb07e
  Compiled from "L2BREngine.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.core.L2BREngine implements java.lang.AutoCloseable
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine
  super_class: #4                         // java/lang/Object
  interfaces: 1, fields: 8, methods: 18, attributes: 6
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine
    #2 = Class              #1            // ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine
    #3 = Utf8               java/lang/Object
    #4 = Class              #3            // java/lang/Object
    #5 = Utf8               java/lang/AutoCloseable
    #6 = Class              #5            // java/lang/AutoCloseable
    #7 = Utf8               <init>
    #8 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;)V
    #9 = Utf8               Lorg/jetbrains/annotations/NotNull;
   #10 = Utf8               java/lang/Exception
   #11 = Class              #10           // java/lang/Exception
   #12 = Utf8               ()V
   #13 = NameAndType        #7:#12        // "<init>":()V
   #14 = Methodref          #4.#13        // java/lang/Object."<init>":()V
   #15 = Utf8               storage
   #16 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
   #17 = NameAndType        #15:#16       // storage:Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
   #18 = Fieldref           #2.#17        // ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine.storage:Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
   #19 = Utf8               dynamicLayer
   #20 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;
   #21 = NameAndType        #19:#20       // dynamicLayer:Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;
   #22 = Fieldref           #2.#21        // ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine.dynamicLayer:Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;
   #23 = Utf8               java/lang/Class
   #24 = Class              #23           // java/lang/Class
   #25 = Utf8               getName
   #26 = Utf8               ()Ljava/lang/String;
   #27 = NameAndType        #25:#26       // getName:()Ljava/lang/String;
   #28 = Methodref          #24.#27       // java/lang/Class.getName:()Ljava/lang/String;
   #29 = Utf8               java/util/logging/Logger
   #30 = Class              #29           // java/util/logging/Logger
   #31 = Utf8               getLogger
   #32 = Utf8               (Ljava/lang/String;)Ljava/util/logging/Logger;
   #33 = NameAndType        #31:#32       // getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
   #34 = Methodref          #30.#33       // java/util/logging/Logger.getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
   #35 = Utf8               logger
   #36 = Utf8               Ljava/util/logging/Logger;
   #37 = NameAndType        #35:#36       // logger:Ljava/util/logging/Logger;
   #38 = Fieldref           #2.#37        // ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine.logger:Ljava/util/logging/Logger;
   #39 = Utf8               ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator
   #40 = Class              #39           // ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator
   #41 = NameAndType        #7:#8         // "<init>":(Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;)V
   #42 = Methodref          #40.#41       // ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator."<init>":(Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;)V
   #43 = Utf8               calculator
   #44 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator;
   #45 = NameAndType        #43:#44       // calculator:Lext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator;
   #46 = Fieldref           #2.#45        // ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine.calculator:Lext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator;
   #47 = Utf8               ext/mods/gameserver/geoengine/pathfinding/core/spatial/SpatialIndexAdapter
   #48 = Class              #47           // ext/mods/gameserver/geoengine/pathfinding/core/spatial/SpatialIndexAdapter
   #49 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
   #50 = NameAndType        #7:#49        // "<init>":(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
   #51 = Methodref          #48.#50       // ext/mods/gameserver/geoengine/pathfinding/core/spatial/SpatialIndexAdapter."<init>":(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
   #52 = Utf8               spatialIndex
   #53 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/core/spatial/SpatialIndexAdapter;
   #54 = NameAndType        #52:#53       // spatialIndex:Lext/mods/gameserver/geoengine/pathfinding/core/spatial/SpatialIndexAdapter;
   #55 = Fieldref           #2.#54        // ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine.spatialIndex:Lext/mods/gameserver/geoengine/pathfinding/core/spatial/SpatialIndexAdapter;
   #56 = Utf8               ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetrics
   #57 = Class              #56           // ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetrics
   #58 = Methodref          #57.#13       // ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetrics."<init>":()V
   #59 = Utf8               metrics
   #60 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetrics;
   #61 = NameAndType        #59:#60       // metrics:Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetrics;
   #62 = Fieldref           #2.#61        // ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine.metrics:Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetrics;
   #63 = Utf8               ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage
   #64 = Class              #63           // ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage
   #65 = Utf8               getMemoryStats
   #66 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats;
   #67 = NameAndType        #65:#66       // getMemoryStats:()Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats;
   #68 = Methodref          #64.#67       // ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage.getMemoryStats:()Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats;
   #69 = Utf8               ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats
   #70 = Class              #69           // ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats
   #71 = Utf8               getNodeCount
   #72 = Utf8               ()I
   #73 = NameAndType        #71:#72       // getNodeCount:()I
   #74 = Methodref          #70.#73       // ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats.getNodeCount:()I
   #75 = Utf8               validNodeCount
   #76 = Utf8               I
   #77 = NameAndType        #75:#76       // validNodeCount:I
   #78 = Fieldref           #2.#77        // ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine.validNodeCount:I
   #79 = Utf8               java/lang/IllegalStateException
   #80 = Class              #79           // java/lang/IllegalStateException
   #81 = Utf8               NodeCount inválido no header: \u0001
   #82 = String             #81           // NodeCount inválido no header: \u0001
   #83 = Utf8               java/lang/invoke/StringConcatFactory
   #84 = Class              #83           // java/lang/invoke/StringConcatFactory
   #85 = Utf8               makeConcatWithConstants
   #86 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #87 = NameAndType        #85:#86       // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #88 = Methodref          #84.#87       // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #89 = MethodHandle       6:#88         // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #90 = Utf8               (I)Ljava/lang/String;
   #91 = NameAndType        #85:#90       // makeConcatWithConstants:(I)Ljava/lang/String;
   #92 = InvokeDynamic      #0:#91        // #0:makeConcatWithConstants:(I)Ljava/lang/String;
   #93 = Utf8               (Ljava/lang/String;)V
   #94 = NameAndType        #7:#93        // "<init>":(Ljava/lang/String;)V
   #95 = Methodref          #80.#94       // java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
   #96 = Long               32l
   #98 = Long               64l
  #100 = Utf8               getMappedSize
  #101 = Utf8               ()J
  #102 = NameAndType        #100:#101     // getMappedSize:()J
  #103 = Methodref          #70.#102      // ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats.getMappedSize:()J
  #104 = Utf8               Arquivo mapeado é menor que o esperado. NodeCount: \u0001, Esperado mínimo: \u0001 bytes, Mapeado: \u0001 bytes. Verifique se o NativeStorage está usando DataOffset correto.
  #105 = String             #104          // Arquivo mapeado é menor que o esperado. NodeCount: \u0001, Esperado mínimo: \u0001 bytes, Mapeado: \u0001 bytes. Verifique se o NativeStorage está usando DataOffset correto.
  #106 = Utf8               (IJJ)Ljava/lang/String;
  #107 = NameAndType        #85:#106      // makeConcatWithConstants:(IJJ)Ljava/lang/String;
  #108 = InvokeDynamic      #1:#107       // #1:makeConcatWithConstants:(IJJ)Ljava/lang/String;
  #109 = Utf8               buildSpatialIndex
  #110 = NameAndType        #109:#12      // buildSpatialIndex:()V
  #111 = Methodref          #2.#110       // ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine.buildSpatialIndex:()V
  #112 = Utf8               initialized
  #113 = Utf8               Z
  #114 = NameAndType        #112:#113     // initialized:Z
  #115 = Fieldref           #2.#114       // ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine.initialized:Z
  #116 = Utf8               getMessage
  #117 = NameAndType        #116:#26      // getMessage:()Ljava/lang/String;
  #118 = Methodref          #11.#117      // java/lang/Exception.getMessage:()Ljava/lang/String;
  #119 = Utf8               [L2BR] Falha crítica na inicialização: \u0001
  #120 = String             #119          // [L2BR] Falha crítica na inicialização: \u0001
  #121 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #122 = NameAndType        #85:#121      // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #123 = InvokeDynamic      #2:#122       // #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #124 = Utf8               severe
  #125 = NameAndType        #124:#93      // severe:(Ljava/lang/String;)V
  #126 = Methodref          #30.#125      // java/util/logging/Logger.severe:(Ljava/lang/String;)V
  #127 = Utf8               close
  #128 = NameAndType        #127:#12      // close:()V
  #129 = Methodref          #2.#128       // ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine.close:()V
  #130 = Utf8               stats
  #131 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats;
  #132 = Utf8               expectedIndexSize
  #133 = Utf8               J
  #134 = Utf8               expectedMinFileSize
  #135 = Utf8               e
  #136 = Utf8               Ljava/lang/Exception;
  #137 = Utf8               this
  #138 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;
  #139 = Utf8               ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer
  #140 = Class              #139          // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer
  #141 = Utf8               getStorage
  #142 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
  #143 = Utf8               getDynamicLayer
  #144 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;
  #145 = Utf8               findPath
  #146 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/model/Location;Lext/mods/gameserver/geoengine/pathfinding/model/Location;)Ljava/util/List;
  #147 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/model/Location;Lext/mods/gameserver/geoengine/pathfinding/model/Location;)Ljava/util/List<Lext/mods/gameserver/geoengine/pathfinding/model/Location;>;
  #148 = Utf8               Engine não inicializado
  #149 = String             #148          // Engine não inicializado
  #150 = Utf8               java/lang/System
  #151 = Class              #150          // java/lang/System
  #152 = Utf8               nanoTime
  #153 = NameAndType        #152:#101     // nanoTime:()J
  #154 = Methodref          #151.#153     // java/lang/System.nanoTime:()J
  #155 = Utf8               kotlin/jvm/internal/Intrinsics
  #156 = Class              #155          // kotlin/jvm/internal/Intrinsics
  #157 = Utf8               areEqual
  #158 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Z
  #159 = NameAndType        #157:#158     // areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
  #160 = Methodref          #156.#159     // kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
  #161 = Utf8               kotlin/collections/CollectionsKt
  #162 = Class              #161          // kotlin/collections/CollectionsKt
  #163 = Utf8               listOf
  #164 = Utf8               (Ljava/lang/Object;)Ljava/util/List;
  #165 = NameAndType        #163:#164     // listOf:(Ljava/lang/Object;)Ljava/util/List;
  #166 = Methodref          #162.#165     // kotlin/collections/CollectionsKt.listOf:(Ljava/lang/Object;)Ljava/util/List;
  #167 = Utf8               findNearest
  #168 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/model/Location;)Ljava/lang/Integer;
  #169 = NameAndType        #167:#168     // findNearest:(Lext/mods/gameserver/geoengine/pathfinding/model/Location;)Ljava/lang/Integer;
  #170 = Methodref          #48.#169      // ext/mods/gameserver/geoengine/pathfinding/core/spatial/SpatialIndexAdapter.findNearest:(Lext/mods/gameserver/geoengine/pathfinding/model/Location;)Ljava/lang/Integer;
  #171 = Utf8               recordFailure
  #172 = NameAndType        #171:#12      // recordFailure:()V
  #173 = Methodref          #57.#172      // ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetrics.recordFailure:()V
  #174 = Utf8               emptyList
  #175 = Utf8               ()Ljava/util/List;
  #176 = NameAndType        #174:#175     // emptyList:()Ljava/util/List;
  #177 = Methodref          #162.#176     // kotlin/collections/CollectionsKt.emptyList:()Ljava/util/List;
  #178 = Utf8               java/lang/Integer
  #179 = Class              #178          // java/lang/Integer
  #180 = Utf8               intValue
  #181 = NameAndType        #180:#72      // intValue:()I
  #182 = Methodref          #179.#181     // java/lang/Integer.intValue:()I
  #183 = Utf8               [L2BR] NodeId fora dos limites: start=\u0001, goal=\u0001, max=\u0001
  #184 = String             #183          // [L2BR] NodeId fora dos limites: start=\u0001, goal=\u0001, max=\u0001
  #185 = Utf8               (Ljava/lang/Integer;Ljava/lang/Integer;I)Ljava/lang/String;
  #186 = NameAndType        #85:#185      // makeConcatWithConstants:(Ljava/lang/Integer;Ljava/lang/Integer;I)Ljava/lang/String;
  #187 = InvokeDynamic      #3:#186       // #3:makeConcatWithConstants:(Ljava/lang/Integer;Ljava/lang/Integer;I)Ljava/lang/String;
  #188 = Utf8               warning
  #189 = NameAndType        #188:#93      // warning:(Ljava/lang/String;)V
  #190 = Methodref          #30.#189      // java/util/logging/Logger.warning:(Ljava/lang/String;)V
  #191 = Utf8               isBlocked
  #192 = Utf8               (I)Z
  #193 = NameAndType        #191:#192     // isBlocked:(I)Z
  #194 = Methodref          #140.#193     // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer.isBlocked:(I)Z
  #195 = NameAndType        #145:#146     // findPath:(Lext/mods/gameserver/geoengine/pathfinding/model/Location;Lext/mods/gameserver/geoengine/pathfinding/model/Location;)Ljava/util/List;
  #196 = Methodref          #40.#195      // ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator.findPath:(Lext/mods/gameserver/geoengine/pathfinding/model/Location;Lext/mods/gameserver/geoengine/pathfinding/model/Location;)Ljava/util/List;
  #197 = Utf8               recordSuccess
  #198 = Utf8               (J)V
  #199 = NameAndType        #197:#198     // recordSuccess:(J)V
  #200 = Methodref          #57.#199      // ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetrics.recordSuccess:(J)V
  #201 = Utf8               startTime
  #202 = Utf8               startNodeId
  #203 = Utf8               Ljava/lang/Integer;
  #204 = Utf8               goalNodeId
  #205 = Utf8               path
  #206 = Utf8               Ljava/util/List;
  #207 = Utf8               start
  #208 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/Location;
  #209 = Utf8               goal
  #210 = Utf8               canMove
  #211 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/model/Location;Lext/mods/gameserver/geoengine/pathfinding/model/Location;)Z
  #212 = Utf8               getNode
  #213 = Utf8               (I)Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;
  #214 = NameAndType        #212:#213     // getNode:(I)Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;
  #215 = Methodref          #64.#214      // ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage.getNode:(I)Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;
  #216 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/PathNode
  #217 = Class              #216          // ext/mods/gameserver/geoengine/pathfinding/model/PathNode
  #218 = Utf8               isWalkable
  #219 = Utf8               ()Z
  #220 = NameAndType        #218:#219     // isWalkable:()Z
  #221 = Methodref          #217.#220     // ext/mods/gameserver/geoengine/pathfinding/model/PathNode.isWalkable:()Z
  #222 = Utf8               startNode
  #223 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;
  #224 = Utf8               goalNode
  #225 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/Location
  #226 = Class              #225          // ext/mods/gameserver/geoengine/pathfinding/model/Location
  #227 = Utf8               getHeight
  #228 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/model/Location;)S
  #229 = Utf8               toLocation
  #230 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/model/Location;
  #231 = NameAndType        #229:#230     // toLocation:()Lext/mods/gameserver/geoengine/pathfinding/model/Location;
  #232 = Methodref          #217.#231     // ext/mods/gameserver/geoengine/pathfinding/model/PathNode.toLocation:()Lext/mods/gameserver/geoengine/pathfinding/model/Location;
  #233 = Utf8               getZ
  #234 = NameAndType        #233:#72      // getZ:()I
  #235 = Methodref          #226.#234     // ext/mods/gameserver/geoengine/pathfinding/model/Location.getZ:()I
  #236 = Utf8               nodeId
  #237 = Utf8               location
  #238 = Utf8               canSee
  #239 = Utf8               toGeo
  #240 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;
  #241 = NameAndType        #239:#240     // toGeo:()Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;
  #242 = Methodref          #226.#241     // ext/mods/gameserver/geoengine/pathfinding/model/Location.toGeo:()Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;
  #243 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/GeoLocation
  #244 = Class              #243          // ext/mods/gameserver/geoengine/pathfinding/model/GeoLocation
  #245 = Utf8               getX
  #246 = NameAndType        #245:#72      // getX:()I
  #247 = Methodref          #244.#246     // ext/mods/gameserver/geoengine/pathfinding/model/GeoLocation.getX:()I
  #248 = Utf8               java/lang/Math
  #249 = Class              #248          // java/lang/Math
  #250 = Utf8               abs
  #251 = Utf8               (I)I
  #252 = NameAndType        #250:#251     // abs:(I)I
  #253 = Methodref          #249.#252     // java/lang/Math.abs:(I)I
  #254 = Utf8               getY
  #255 = NameAndType        #254:#72      // getY:()I
  #256 = Methodref          #244.#255     // ext/mods/gameserver/geoengine/pathfinding/model/GeoLocation.getY:()I
  #257 = Utf8               (IIS)V
  #258 = NameAndType        #7:#257       // "<init>":(IIS)V
  #259 = Methodref          #244.#258     // ext/mods/gameserver/geoengine/pathfinding/model/GeoLocation."<init>":(IIS)V
  #260 = Utf8               findAt
  #261 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;)Ljava/lang/Integer;
  #262 = NameAndType        #260:#261     // findAt:(Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;)Ljava/lang/Integer;
  #263 = Methodref          #48.#262      // ext/mods/gameserver/geoengine/pathfinding/core/spatial/SpatialIndexAdapter.findAt:(Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;)Ljava/lang/Integer;
  #264 = Utf8               node
  #265 = Utf8               e2
  #266 = Utf8               fromNodeId
  #267 = Utf8               toNodeId
  #268 = Utf8               fromGeo
  #269 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;
  #270 = Utf8               dx
  #271 = Utf8               dy
  #272 = Utf8               sx
  #273 = Utf8               sy
  #274 = Utf8               err
  #275 = Utf8               x
  #276 = Utf8               y
  #277 = Utf8               from
  #278 = Utf8               to
  #279 = Utf8               registerDynamicObject
  #280 = Utf8               (Ljava/lang/String;Ljava/util/List;Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;)V
  #281 = Utf8               (Ljava/lang/String;Ljava/util/List<Lext/mods/gameserver/geoengine/pathfinding/model/Location;>;Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;)V
  #282 = Utf8               java/lang/Iterable
  #283 = Class              #282          // java/lang/Iterable
  #284 = Utf8               java/util/ArrayList
  #285 = Class              #284          // java/util/ArrayList
  #286 = Methodref          #285.#13      // java/util/ArrayList."<init>":()V
  #287 = Utf8               java/util/Collection
  #288 = Class              #287          // java/util/Collection
  #289 = Utf8               iterator
  #290 = Utf8               ()Ljava/util/Iterator;
  #291 = NameAndType        #289:#290     // iterator:()Ljava/util/Iterator;
  #292 = InterfaceMethodref #283.#291     // java/lang/Iterable.iterator:()Ljava/util/Iterator;
  #293 = Utf8               java/util/Iterator
  #294 = Class              #293          // java/util/Iterator
  #295 = Utf8               hasNext
  #296 = NameAndType        #295:#219     // hasNext:()Z
  #297 = InterfaceMethodref #294.#296     // java/util/Iterator.hasNext:()Z
  #298 = Utf8               next
  #299 = Utf8               ()Ljava/lang/Object;
  #300 = NameAndType        #298:#299     // next:()Ljava/lang/Object;
  #301 = InterfaceMethodref #294.#300     // java/util/Iterator.next:()Ljava/lang/Object;
  #302 = Utf8               add
  #303 = Utf8               (Ljava/lang/Object;)Z
  #304 = NameAndType        #302:#303     // add:(Ljava/lang/Object;)Z
  #305 = InterfaceMethodref #288.#304     // java/util/Collection.add:(Ljava/lang/Object;)Z
  #306 = Utf8               java/util/List
  #307 = Class              #306          // java/util/List
  #308 = Utf8               java/lang/Number
  #309 = Class              #308          // java/lang/Number
  #310 = Methodref          #309.#181     // java/lang/Number.intValue:()I
  #311 = Utf8               toIntArray
  #312 = Utf8               (Ljava/util/Collection;)[I
  #313 = NameAndType        #311:#312     // toIntArray:(Ljava/util/Collection;)[I
  #314 = Methodref          #162.#313     // kotlin/collections/CollectionsKt.toIntArray:(Ljava/util/Collection;)[I
  #315 = Utf8               registerObject
  #316 = Utf8               (Ljava/lang/String;[ILext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;)V
  #317 = NameAndType        #315:#316     // registerObject:(Ljava/lang/String;[ILext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;)V
  #318 = Methodref          #140.#317     // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer.registerObject:(Ljava/lang/String;[ILext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;)V
  #319 = Utf8               $i$a$-mapNotNull-L2BREngine$registerDynamicObject$nodeIds$1
  #320 = Utf8               it
  #321 = Utf8               $i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv
  #322 = Utf8               it$iv$iv
  #323 = Utf8               Ljava/lang/Object;
  #324 = Utf8               $i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv
  #325 = Utf8               element$iv$iv
  #326 = Utf8               element$iv$iv$iv
  #327 = Utf8               $i$f$forEach
  #328 = Utf8               $this$forEach$iv$iv$iv
  #329 = Utf8               Ljava/lang/Iterable;
  #330 = Utf8               $i$f$mapNotNullTo
  #331 = Utf8               $this$mapNotNullTo$iv$iv
  #332 = Utf8               destination$iv$iv
  #333 = Utf8               Ljava/util/Collection;
  #334 = Utf8               $i$f$mapNotNull
  #335 = Utf8               $this$mapNotNull$iv
  #336 = Utf8               $i$a$-filter-L2BREngine$registerDynamicObject$nodeIds$2
  #337 = Utf8               $i$f$filterTo
  #338 = Utf8               $this$filterTo$iv$iv
  #339 = Utf8               $i$f$filter
  #340 = Utf8               $this$filter$iv
  #341 = Utf8               nodeIds
  #342 = Utf8               [I
  #343 = Utf8               objectId
  #344 = Utf8               Ljava/lang/String;
  #345 = Utf8               locations
  #346 = Utf8               type
  #347 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;
  #348 = Utf8               java/lang/String
  #349 = Class              #348          // java/lang/String
  #350 = Utf8               ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType
  #351 = Class              #350          // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType
  #352 = Class              #342          // "[I"
  #353 = Utf8               unregisterDynamicObject
  #354 = Utf8               unregisterObject
  #355 = NameAndType        #354:#93      // unregisterObject:(Ljava/lang/String;)V
  #356 = Methodref          #140.#355     // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer.unregisterObject:(Ljava/lang/String;)V
  #357 = Utf8               toggleDynamicObject
  #358 = Utf8               (Ljava/lang/String;)Z
  #359 = Utf8               toggleObject
  #360 = NameAndType        #359:#358     // toggleObject:(Ljava/lang/String;)Z
  #361 = Methodref          #140.#360     // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer.toggleObject:(Ljava/lang/String;)Z
  #362 = Utf8               getMetrics
  #363 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot;
  #364 = Utf8               snapshot
  #365 = NameAndType        #364:#363     // snapshot:()Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot;
  #366 = Methodref          #57.#365      // ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetrics.snapshot:()Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot;
  #367 = Utf8               getStorageStats
  #368 = Utf8               getDynamicLayerStats
  #369 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$LayerStats;
  #370 = Utf8               getStats
  #371 = NameAndType        #370:#369     // getStats:()Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$LayerStats;
  #372 = Methodref          #140.#371     // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer.getStats:()Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$LayerStats;
  #373 = Utf8               contains
  #374 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/model/Location;)Z
  #375 = Utf8               getNodeDebugInfo
  #376 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/model/Location;)Ljava/lang/String;
  #377 = Utf8               Nó não encontrado
  #378 = String             #377          // Nó não encontrado
  #379 = Utf8               NodeId (\u0001) fora dos limites (max: \u0001)
  #380 = String             #379          // NodeId (\u0001) fora dos limites (max: \u0001)
  #381 = Utf8               (II)Ljava/lang/String;
  #382 = NameAndType        #85:#381      // makeConcatWithConstants:(II)Ljava/lang/String;
  #383 = InvokeDynamic      #4:#382       // #4:makeConcatWithConstants:(II)Ljava/lang/String;
  #384 = Utf8               java/lang/StringBuilder
  #385 = Class              #384          // java/lang/StringBuilder
  #386 = Methodref          #385.#13      // java/lang/StringBuilder."<init>":()V
  #387 = Utf8               Node ID: \u0001 (max válido: \u0001)
  #388 = String             #387          // Node ID: \u0001 (max válido: \u0001)
  #389 = InvokeDynamic      #5:#382       // #5:makeConcatWithConstants:(II)Ljava/lang/String;
  #390 = Utf8               append
  #391 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
  #392 = NameAndType        #390:#391     // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #393 = Methodref          #385.#392     // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #394 = Utf8               (C)Ljava/lang/StringBuilder;
  #395 = NameAndType        #390:#394     // append:(C)Ljava/lang/StringBuilder;
  #396 = Methodref          #385.#395     // java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
  #397 = Methodref          #217.#246     // ext/mods/gameserver/geoengine/pathfinding/model/PathNode.getX:()I
  #398 = Methodref          #217.#255     // ext/mods/gameserver/geoengine/pathfinding/model/PathNode.getY:()I
  #399 = Methodref          #217.#234     // ext/mods/gameserver/geoengine/pathfinding/model/PathNode.getZ:()I
  #400 = Utf8               Position: (\u0001, \u0001, \u0001)
  #401 = String             #400          // Position: (\u0001, \u0001, \u0001)
  #402 = Utf8               (III)Ljava/lang/String;
  #403 = NameAndType        #85:#402      // makeConcatWithConstants:(III)Ljava/lang/String;
  #404 = InvokeDynamic      #6:#403       // #6:makeConcatWithConstants:(III)Ljava/lang/String;
  #405 = Utf8               Walkable: \u0001
  #406 = String             #405          // Walkable: \u0001
  #407 = Utf8               (Z)Ljava/lang/String;
  #408 = NameAndType        #85:#407      // makeConcatWithConstants:(Z)Ljava/lang/String;
  #409 = InvokeDynamic      #7:#408       // #7:makeConcatWithConstants:(Z)Ljava/lang/String;
  #410 = Utf8               getHasDynamicCheck
  #411 = NameAndType        #410:#219     // getHasDynamicCheck:()Z
  #412 = Methodref          #217.#411     // ext/mods/gameserver/geoengine/pathfinding/model/PathNode.getHasDynamicCheck:()Z
  #413 = Utf8               Dynamic: \u0001
  #414 = String             #413          // Dynamic: \u0001
  #415 = InvokeDynamic      #8:#408       // #8:makeConcatWithConstants:(Z)Ljava/lang/String;
  #416 = Utf8               Blocked: \u0001
  #417 = String             #416          // Blocked: \u0001
  #418 = InvokeDynamic      #9:#408       // #9:makeConcatWithConstants:(Z)Ljava/lang/String;
  #419 = Utf8               kotlin/ranges/IntRange
  #420 = Class              #419          // kotlin/ranges/IntRange
  #421 = Utf8               (II)V
  #422 = NameAndType        #7:#421       // "<init>":(II)V
  #423 = Methodref          #420.#422     // kotlin/ranges/IntRange."<init>":(II)V
  #424 = Utf8               collectionSizeOrDefault
  #425 = Utf8               (Ljava/lang/Iterable;I)I
  #426 = NameAndType        #424:#425     // collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
  #427 = Methodref          #162.#426     // kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
  #428 = Utf8               (I)V
  #429 = NameAndType        #7:#428       // "<init>":(I)V
  #430 = Methodref          #285.#429     // java/util/ArrayList."<init>":(I)V
  #431 = Utf8               kotlin/collections/IntIterator
  #432 = Class              #431          // kotlin/collections/IntIterator
  #433 = Utf8               nextInt
  #434 = NameAndType        #433:#72      // nextInt:()I
  #435 = Methodref          #432.#434     // kotlin/collections/IntIterator.nextInt:()I
  #436 = Utf8               getJpsDistance
  #437 = NameAndType        #436:#251     // getJpsDistance:(I)I
  #438 = Methodref          #217.#437     // ext/mods/gameserver/geoengine/pathfinding/model/PathNode.getJpsDistance:(I)I
  #439 = Utf8               valueOf
  #440 = Utf8               (I)Ljava/lang/Integer;
  #441 = NameAndType        #439:#440     // valueOf:(I)Ljava/lang/Integer;
  #442 = Methodref          #179.#441     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #443 = Utf8               JPS Distances: \u0001
  #444 = String             #443          // JPS Distances: \u0001
  #445 = Utf8               (Ljava/util/List;)Ljava/lang/String;
  #446 = NameAndType        #85:#445      // makeConcatWithConstants:(Ljava/util/List;)Ljava/lang/String;
  #447 = InvokeDynamic      #10:#446      // #10:makeConcatWithConstants:(Ljava/util/List;)Ljava/lang/String;
  #448 = Utf8               toString
  #449 = NameAndType        #448:#26      // toString:()Ljava/lang/String;
  #450 = Methodref          #385.#449     // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #451 = Utf8               $i$a$-map-L2BREngine$getNodeDebugInfo$1$1
  #452 = Utf8               item$iv$iv
  #453 = Utf8               $i$f$mapTo
  #454 = Utf8               $this$mapTo$iv$iv
  #455 = Utf8               $i$f$map
  #456 = Utf8               $this$map$iv
  #457 = Utf8               $i$a$-buildString-L2BREngine$getNodeDebugInfo$1
  #458 = Utf8               $this$getNodeDebugInfo_u24lambda_u240
  #459 = Utf8               Ljava/lang/StringBuilder;
  #460 = Utf8               kotlin/jvm/internal/Ref$IntRef
  #461 = Class              #460          // kotlin/jvm/internal/Ref$IntRef
  #462 = Methodref          #461.#13      // kotlin/jvm/internal/Ref$IntRef."<init>":()V
  #463 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #464 = MethodType         #463          //  (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #465 = Utf8               buildSpatialIndex$lambda$0
  #466 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;Lkotlin/jvm/internal/Ref$IntRef;Ljava/util/List;ILext/mods/gameserver/geoengine/pathfinding/model/PathNode;)Lkotlin/Unit;
  #467 = NameAndType        #465:#466     // buildSpatialIndex$lambda$0:(Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;Lkotlin/jvm/internal/Ref$IntRef;Ljava/util/List;ILext/mods/gameserver/geoengine/pathfinding/model/PathNode;)Lkotlin/Unit;
  #468 = Methodref          #2.#467       // ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine.buildSpatialIndex$lambda$0:(Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;Lkotlin/jvm/internal/Ref$IntRef;Ljava/util/List;ILext/mods/gameserver/geoengine/pathfinding/model/PathNode;)Lkotlin/Unit;
  #469 = MethodHandle       6:#468        // REF_invokeStatic ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine.buildSpatialIndex$lambda$0:(Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;Lkotlin/jvm/internal/Ref$IntRef;Ljava/util/List;ILext/mods/gameserver/geoengine/pathfinding/model/PathNode;)Lkotlin/Unit;
  #470 = Utf8               (Ljava/lang/Integer;Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;)Lkotlin/Unit;
  #471 = MethodType         #470          //  (Ljava/lang/Integer;Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;)Lkotlin/Unit;
  #472 = Utf8               java/lang/invoke/LambdaMetafactory
  #473 = Class              #472          // java/lang/invoke/LambdaMetafactory
  #474 = Utf8               metafactory
  #475 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #476 = NameAndType        #474:#475     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #477 = Methodref          #473.#476     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #478 = MethodHandle       6:#477        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #479 = Utf8               invoke
  #480 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;Lkotlin/jvm/internal/Ref$IntRef;Ljava/util/List;)Lkotlin/jvm/functions/Function2;
  #481 = NameAndType        #479:#480     // invoke:(Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;Lkotlin/jvm/internal/Ref$IntRef;Ljava/util/List;)Lkotlin/jvm/functions/Function2;
  #482 = InvokeDynamic      #11:#481      // #11:invoke:(Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;Lkotlin/jvm/internal/Ref$IntRef;Ljava/util/List;)Lkotlin/jvm/functions/Function2;
  #483 = Utf8               forEachNode
  #484 = Utf8               (Lkotlin/jvm/functions/Function2;)V
  #485 = NameAndType        #483:#484     // forEachNode:(Lkotlin/jvm/functions/Function2;)V
  #486 = Methodref          #64.#485      // ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage.forEachNode:(Lkotlin/jvm/functions/Function2;)V
  #487 = Utf8               element
  #488 = NameAndType        #487:#76      // element:I
  #489 = Fieldref           #461.#488     // kotlin/jvm/internal/Ref$IntRef.element:I
  #490 = Utf8               [L2BR] Total de nós inválidos ignorados: \u0001
  #491 = String             #490          // [L2BR] Total de nós inválidos ignorados: \u0001
  #492 = InvokeDynamic      #12:#91       // #12:makeConcatWithConstants:(I)Ljava/lang/String;
  #493 = Utf8               kotlin/Pair
  #494 = Class              #493          // kotlin/Pair
  #495 = Utf8               component1
  #496 = NameAndType        #495:#299     // component1:()Ljava/lang/Object;
  #497 = Methodref          #494.#496     // kotlin/Pair.component1:()Ljava/lang/Object;
  #498 = Utf8               component2
  #499 = NameAndType        #498:#299     // component2:()Ljava/lang/Object;
  #500 = Methodref          #494.#499     // kotlin/Pair.component2:()Ljava/lang/Object;
  #501 = Utf8               insertNode
  #502 = Utf8               (III)V
  #503 = NameAndType        #501:#502     // insertNode:(III)V
  #504 = Methodref          #48.#503      // ext/mods/gameserver/geoengine/pathfinding/core/spatial/SpatialIndexAdapter.insertNode:(III)V
  #505 = Utf8               Falha ao construir índice espacial: \u0001
  #506 = String             #505          // Falha ao construir índice espacial: \u0001
  #507 = InvokeDynamic      #13:#122      // #13:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #508 = Utf8               java/lang/Throwable
  #509 = Class              #508          // java/lang/Throwable
  #510 = Utf8               (Ljava/lang/String;Ljava/lang/Throwable;)V
  #511 = NameAndType        #7:#510       // "<init>":(Ljava/lang/String;Ljava/lang/Throwable;)V
  #512 = Methodref          #80.#511      // java/lang/IllegalStateException."<init>":(Ljava/lang/String;Ljava/lang/Throwable;)V
  #513 = Utf8               $i$a$-forEach-L2BREngine$buildSpatialIndex$2
  #514 = Utf8               id
  #515 = Utf8               geo
  #516 = Utf8               element$iv
  #517 = Utf8               $this$forEach$iv
  #518 = Utf8               entries
  #519 = Utf8               invalidCount
  #520 = Utf8               Lkotlin/jvm/internal/Ref$IntRef;
  #521 = Methodref          #64.#128      // ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage.close:()V
  #522 = Utf8               [L2BR] Erro ao fechar storage: \u0001
  #523 = String             #522          // [L2BR] Erro ao fechar storage: \u0001
  #524 = InvokeDynamic      #14:#122      // #14:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #525 = Utf8               [L2BR] Ignorando nó com ID inválido: \u0001 (fora de 0..\u0001)
  #526 = String             #525          // [L2BR] Ignorando nó com ID inválido: \u0001 (fora de 0..\u0001)
  #527 = InvokeDynamic      #15:#382      // #15:makeConcatWithConstants:(II)Ljava/lang/String;
  #528 = Utf8               kotlin/Unit
  #529 = Class              #528          // kotlin/Unit
  #530 = Utf8               INSTANCE
  #531 = Utf8               Lkotlin/Unit;
  #532 = NameAndType        #530:#531     // INSTANCE:Lkotlin/Unit;
  #533 = Fieldref           #529.#532     // kotlin/Unit.INSTANCE:Lkotlin/Unit;
  #534 = Utf8               toGeoLocation
  #535 = NameAndType        #534:#240     // toGeoLocation:()Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;
  #536 = Methodref          #217.#535     // ext/mods/gameserver/geoengine/pathfinding/model/PathNode.toGeoLocation:()Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;
  #537 = Utf8               kotlin/TuplesKt
  #538 = Class              #537          // kotlin/TuplesKt
  #539 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
  #540 = NameAndType        #278:#539     // to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
  #541 = Methodref          #538.#540     // kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
  #542 = InterfaceMethodref #307.#304     // java/util/List.add:(Ljava/lang/Object;)Z
  #543 = Utf8               [L2BR] Erro ao processar nó \u0001: \u0001
  #544 = String             #543          // [L2BR] Erro ao processar nó \u0001: \u0001
  #545 = Utf8               (ILjava/lang/String;)Ljava/lang/String;
  #546 = NameAndType        #85:#545      // makeConcatWithConstants:(ILjava/lang/String;)Ljava/lang/String;
  #547 = InvokeDynamic      #16:#546      // #16:makeConcatWithConstants:(ILjava/lang/String;)Ljava/lang/String;
  #548 = Utf8               this$0
  #549 = Utf8               $invalidCount
  #550 = Utf8               $entries
  #551 = Utf8               Lkotlin/Metadata;
  #552 = Utf8               mv
  #553 = Integer            2
  #554 = Integer            3
  #555 = Integer            0
  #556 = Utf8               k
  #557 = Integer            1
  #558 = Utf8               xi
  #559 = Integer            48
  #560 = Utf8               d1
  #561 = Utf8               \u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\n\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002:\u00029:B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cJ\u0016\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cJ\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001cJ\u0016\u0010#\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\u001cJ$\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010+\u001a\u00020,J\u000e\u0010-\u001a\u00020\'2\u0006\u0010(\u001a\u00020)J\u000e\u0010.\u001a\u00020\u00172\u0006\u0010(\u001a\u00020)J\u0006\u0010/\u001a\u000200J\u0006\u00101\u001a\u000202J\u0006\u00103\u001a\u000204J\u000e\u00105\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u001cJ\u000e\u00106\u001a\u00020)2\u0006\u0010\"\u001a\u00020\u001cJ\b\u00107\u001a\u00020\'H\u0002J\b\u00108\u001a\u00020\'H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006;
  #562 = Utf8               d2
  #563 = Utf8               Ljava/lang/AutoCloseable;
  #564 = Utf8               Lkotlin/AutoCloseable;
  #565 = Utf8               kotlin.jvm.PlatformType
  #566 = Utf8
  #567 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot;
  #568 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$LayerStats;
  #569 = Utf8               EngineMetrics
  #570 = Utf8               EngineMetricsSnapshot
  #571 = Utf8               Brproject
  #572 = Utf8               ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot
  #573 = Class              #572          // ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot
  #574 = Utf8               ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$LayerStats
  #575 = Class              #574          // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$LayerStats
  #576 = Utf8               LayerStats
  #577 = Utf8               ObjectType
  #578 = Utf8               MemoryStats
  #579 = Utf8               kotlin/jvm/internal/Ref
  #580 = Class              #579          // kotlin/jvm/internal/Ref
  #581 = Utf8               IntRef
  #582 = Utf8               L2BREngine.kt
  #583 = Utf8               Lkotlin/jvm/internal/SourceDebugExtension;
  #584 = Utf8               value
  #585 = Utf8               SMAP\nL2BREngine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 L2BREngine.kt\next/mods/gameserver/geoengine/pathfinding/core/L2BREngine\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,354:1\n1642#2,10:355\n1915#2:365\n1916#2:367\n1652#2:368\n777#2:369\n873#2,2:370\n1586#2:372\n1661#2,3:373\n1915#2,2:376\n1#3:366\n*S KotlinDebug\n*F\n+ 1 L2BREngine.kt\next/mods/gameserver/geoengine/pathfinding/core/L2BREngine\n*L\n182#1:355,10\n182#1:365\n182#1:367\n182#1:368\n183#1:369\n183#1:370,2\n215#1:372\n215#1:373,3\n245#1:376,2\n182#1:366\n*E\n
  #586 = Utf8               RuntimeInvisibleAnnotations
  #587 = Utf8               Code
  #588 = Utf8               StackMapTable
  #589 = Utf8               LineNumberTable
  #590 = Utf8               LocalVariableTable
  #591 = Utf8               RuntimeInvisibleParameterAnnotations
  #592 = Utf8               Signature
  #593 = Utf8               InnerClasses
  #594 = Utf8               SourceFile
  #595 = Utf8               SourceDebugExtension
  #596 = Utf8               RuntimeVisibleAnnotations
  #597 = Utf8               BootstrapMethods
{
  public ext.mods.gameserver.geoengine.pathfinding.core.L2BREngine(ext.mods.gameserver.geoengine.pathfinding.native.NativeStorage, ext.mods.gameserver.geoengine.pathfinding.dynamic.DynamicObstacleLayer);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=8, args_size=3
         0: aload_0
         1: invokespecial #14                 // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #18                 // Field storage:Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
         9: aload_0
        10: aload_2
        11: putfield      #22                 // Field dynamicLayer:Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;
        14: aload_0
        15: ldc           #2                  // class ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine
        17: invokevirtual #28                 // Method java/lang/Class.getName:()Ljava/lang/String;
        20: invokestatic  #34                 // Method java/util/logging/Logger.getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
        23: putfield      #38                 // Field logger:Ljava/util/logging/Logger;
        26: aload_0
        27: new           #40                 // class ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator
        30: dup
        31: aload_0
        32: getfield      #18                 // Field storage:Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
        35: aload_0
        36: getfield      #22                 // Field dynamicLayer:Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;
        39: invokespecial #42                 // Method ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator."<init>":(Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;)V
        42: putfield      #46                 // Field calculator:Lext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator;
        45: aload_0
        46: new           #48                 // class ext/mods/gameserver/geoengine/pathfinding/core/spatial/SpatialIndexAdapter
        49: dup
        50: aconst_null
        51: iconst_1
        52: aconst_null
        53: invokespecial #51                 // Method ext/mods/gameserver/geoengine/pathfinding/core/spatial/SpatialIndexAdapter."<init>":(Lext/mods/gameserver/geoengine/pathfinding/core/spatial/RTreeIndex;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        56: putfield      #55                 // Field spatialIndex:Lext/mods/gameserver/geoengine/pathfinding/core/spatial/SpatialIndexAdapter;
        59: aload_0
        60: new           #57                 // class ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetrics
        63: dup
        64: invokespecial #58                 // Method ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetrics."<init>":()V
        67: putfield      #62                 // Field metrics:Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetrics;
        70: nop
        71: nop
        72: aload_0
        73: getfield      #18                 // Field storage:Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
        76: invokevirtual #68                 // Method ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage.getMemoryStats:()Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats;
        79: astore_3
        80: aload_0
        81: aload_3
        82: invokevirtual #74                 // Method ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats.getNodeCount:()I
        85: putfield      #78                 // Field validNodeCount:I
        88: aload_0
        89: getfield      #78                 // Field validNodeCount:I
        92: ifgt          112
        95: new           #80                 // class java/lang/IllegalStateException
        98: dup
        99: aload_0
       100: getfield      #78                 // Field validNodeCount:I
       103: invokedynamic #92,  0             // InvokeDynamic #0:makeConcatWithConstants:(I)Ljava/lang/String;
       108: invokespecial #95                 // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
       111: athrow
       112: aload_0
       113: getfield      #78                 // Field validNodeCount:I
       116: i2l
       117: ldc2_w        #96                 // long 32l
       120: lmul
       121: lstore        4
       123: ldc2_w        #98                 // long 64l
       126: lload         4
       128: ladd
       129: lstore        6
       131: aload_3
       132: invokevirtual #103                // Method ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats.getMappedSize:()J
       135: lload         6
       137: lcmp
       138: ifge          164
       141: new           #80                 // class java/lang/IllegalStateException
       144: dup
       145: aload_0
       146: getfield      #78                 // Field validNodeCount:I
       149: lload         6
       151: aload_3
       152: invokevirtual #103                // Method ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats.getMappedSize:()J
       155: invokedynamic #108,  0            // InvokeDynamic #1:makeConcatWithConstants:(IJJ)Ljava/lang/String;
       160: invokespecial #95                 // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
       163: athrow
       164: aload_0
       165: invokespecial #111                // Method buildSpatialIndex:()V
       168: aload_0
       169: iconst_1
       170: putfield      #115                // Field initialized:Z
       173: goto          199
       176: astore_3
       177: aload_0
       178: getfield      #38                 // Field logger:Ljava/util/logging/Logger;
       181: aload_3
       182: invokevirtual #118                // Method java/lang/Exception.getMessage:()Ljava/lang/String;
       185: invokedynamic #123,  0            // InvokeDynamic #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       190: invokevirtual #126                // Method java/util/logging/Logger.severe:(Ljava/lang/String;)V
       193: aload_0
       194: invokevirtual #129                // Method close:()V
       197: aload_3
       198: athrow
       199: nop
       200: return
      Exception table:
         from    to  target type
            71   173   176   Class java/lang/Exception
      StackMapTable: number_of_entries = 4
        frame_type = 255 /* full_frame */
          offset_delta = 112
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine, class ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage, class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer, class ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats ]
          stack = []
        frame_type = 253 /* append */
          offset_delta = 51
          locals = [ long, long ]
        frame_type = 255 /* full_frame */
          offset_delta = 11
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine, class ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage, class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer ]
          stack = [ class java/lang/Exception ]
        frame_type = 254 /* append */
          offset_delta = 22
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats, long, long ]
      LineNumberTable:
        line 32: 0
        line 33: 4
        line 34: 9
        line 37: 14
        line 39: 26
        line 40: 45
        line 42: 59
        line 49: 70
        line 50: 71
        line 51: 72
        line 52: 80
        line 54: 88
        line 55: 95
        line 58: 112
        line 59: 123
        line 61: 131
        line 62: 141
        line 64: 145
        line 65: 149
        line 66: 151
        line 62: 160
        line 71: 164
        line 72: 168
        line 74: 176
        line 75: 177
        line 76: 193
        line 77: 197
        line 79: 199
        line 32: 200
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           80      93     3 stats   Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats;
          123      50     4 expectedIndexSize   J
          131      42     6 expectedMinFileSize   J
          177      22     3     e   Ljava/lang/Exception;
            0     201     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;
            0     201     1 storage   Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
            0     201     2 dynamicLayer   Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #9()
          org.jetbrains.annotations.NotNull
      parameter 1:
        0: #9()
          org.jetbrains.annotations.NotNull

  public final ext.mods.gameserver.geoengine.pathfinding.native.NativeStorage getStorage();
    descriptor: ()Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #18                 // Field storage:Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
         4: areturn
      LineNumberTable:
        line 33: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;
    RuntimeInvisibleAnnotations:
      0: #9()
        org.jetbrains.annotations.NotNull

  public final ext.mods.gameserver.geoengine.pathfinding.dynamic.DynamicObstacleLayer getDynamicLayer();
    descriptor: ()Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field dynamicLayer:Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;
         4: areturn
      LineNumberTable:
        line 34: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;
    RuntimeInvisibleAnnotations:
      0: #9()
        org.jetbrains.annotations.NotNull

  public final java.util.List<ext.mods.gameserver.geoengine.pathfinding.model.Location> findPath(ext.mods.gameserver.geoengine.pathfinding.model.Location, ext.mods.gameserver.geoengine.pathfinding.model.Location);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/model/Location;Lext/mods/gameserver/geoengine/pathfinding/model/Location;)Ljava/util/List;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=5, locals=8, args_size=3
         0: aload_0
         1: getfield      #115                // Field initialized:Z
         4: ifne          17
         7: new           #80                 // class java/lang/IllegalStateException
        10: dup
        11: ldc           #149                // String Engine não inicializado
        13: invokespecial #95                 // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
        16: athrow
        17: invokestatic  #154                // Method java/lang/System.nanoTime:()J
        20: lstore_3
        21: aload_1
        22: aload_2
        23: invokestatic  #160                // Method kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        26: ifeq          34
        29: aload_1
        30: invokestatic  #166                // Method kotlin/collections/CollectionsKt.listOf:(Ljava/lang/Object;)Ljava/util/List;
        33: areturn
        34: aload_0
        35: getfield      #55                 // Field spatialIndex:Lext/mods/gameserver/geoengine/pathfinding/core/spatial/SpatialIndexAdapter;
        38: aload_1
        39: invokevirtual #170                // Method ext/mods/gameserver/geoengine/pathfinding/core/spatial/SpatialIndexAdapter.findNearest:(Lext/mods/gameserver/geoengine/pathfinding/model/Location;)Ljava/lang/Integer;
        42: astore        5
        44: aload_0
        45: getfield      #55                 // Field spatialIndex:Lext/mods/gameserver/geoengine/pathfinding/core/spatial/SpatialIndexAdapter;
        48: aload_2
        49: invokevirtual #170                // Method ext/mods/gameserver/geoengine/pathfinding/core/spatial/SpatialIndexAdapter.findNearest:(Lext/mods/gameserver/geoengine/pathfinding/model/Location;)Ljava/lang/Integer;
        52: astore        6
        54: aload         5
        56: ifnull        64
        59: aload         6
        61: ifnonnull     75
        64: aload_0
        65: getfield      #62                 // Field metrics:Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetrics;
        68: invokevirtual #173                // Method ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetrics.recordFailure:()V
        71: invokestatic  #177                // Method kotlin/collections/CollectionsKt.emptyList:()Ljava/util/List;
        74: areturn
        75: aload         5
        77: invokevirtual #182                // Method java/lang/Integer.intValue:()I
        80: aload_0
        81: getfield      #78                 // Field validNodeCount:I
        84: if_icmpge     99
        87: aload         6
        89: invokevirtual #182                // Method java/lang/Integer.intValue:()I
        92: aload_0
        93: getfield      #78                 // Field validNodeCount:I
        96: if_icmplt     130
        99: aload_0
       100: getfield      #38                 // Field logger:Ljava/util/logging/Logger;
       103: aload         5
       105: aload         6
       107: aload_0
       108: getfield      #78                 // Field validNodeCount:I
       111: invokedynamic #187,  0            // InvokeDynamic #3:makeConcatWithConstants:(Ljava/lang/Integer;Ljava/lang/Integer;I)Ljava/lang/String;
       116: invokevirtual #190                // Method java/util/logging/Logger.warning:(Ljava/lang/String;)V
       119: aload_0
       120: getfield      #62                 // Field metrics:Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetrics;
       123: invokevirtual #173                // Method ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetrics.recordFailure:()V
       126: invokestatic  #177                // Method kotlin/collections/CollectionsKt.emptyList:()Ljava/util/List;
       129: areturn
       130: aload_0
       131: getfield      #22                 // Field dynamicLayer:Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;
       134: aload         5
       136: invokevirtual #182                // Method java/lang/Integer.intValue:()I
       139: invokevirtual #194                // Method ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer.isBlocked:(I)Z
       142: ifne          160
       145: aload_0
       146: getfield      #22                 // Field dynamicLayer:Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;
       149: aload         6
       151: invokevirtual #182                // Method java/lang/Integer.intValue:()I
       154: invokevirtual #194                // Method ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer.isBlocked:(I)Z
       157: ifeq          171
       160: aload_0
       161: getfield      #62                 // Field metrics:Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetrics;
       164: invokevirtual #173                // Method ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetrics.recordFailure:()V
       167: invokestatic  #177                // Method kotlin/collections/CollectionsKt.emptyList:()Ljava/util/List;
       170: areturn
       171: aload_0
       172: getfield      #46                 // Field calculator:Lext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator;
       175: aload_1
       176: aload_2
       177: invokevirtual #196                // Method ext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator.findPath:(Lext/mods/gameserver/geoengine/pathfinding/model/Location;Lext/mods/gameserver/geoengine/pathfinding/model/Location;)Ljava/util/List;
       180: astore        7
       182: aload_0
       183: getfield      #62                 // Field metrics:Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetrics;
       186: invokestatic  #154                // Method java/lang/System.nanoTime:()J
       189: lload_3
       190: lsub
       191: invokevirtual #200                // Method ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetrics.recordSuccess:(J)V
       194: aload         7
       196: areturn
      StackMapTable: number_of_entries = 8
        frame_type = 17 /* same */
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ long ]
        frame_type = 253 /* append */
          offset_delta = 29
          locals = [ class java/lang/Integer, class java/lang/Integer ]
        frame_type = 10 /* same */
        frame_type = 23 /* same */
        frame_type = 30 /* same */
        frame_type = 29 /* same */
        frame_type = 10 /* same */
      LineNumberTable:
        line 82: 0
        line 84: 17
        line 86: 21
        line 88: 34
        line 89: 44
        line 91: 54
        line 92: 64
        line 93: 71
        line 96: 75
        line 97: 99
        line 98: 119
        line 99: 126
        line 102: 130
        line 103: 160
        line 104: 167
        line 107: 171
        line 108: 182
        line 110: 194
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           21     176     3 startTime   J
           44     153     5 startNodeId   Ljava/lang/Integer;
           54     143     6 goalNodeId   Ljava/lang/Integer;
          182      15     7  path   Ljava/util/List;
            0     197     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;
            0     197     1 start   Lext/mods/gameserver/geoengine/pathfinding/model/Location;
            0     197     2  goal   Lext/mods/gameserver/geoengine/pathfinding/model/Location;
    Signature: #147                         // (Lext/mods/gameserver/geoengine/pathfinding/model/Location;Lext/mods/gameserver/geoengine/pathfinding/model/Location;)Ljava/util/List<Lext/mods/gameserver/geoengine/pathfinding/model/Location;>;
    RuntimeInvisibleAnnotations:
      0: #9()
        org.jetbrains.annotations.NotNull
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #9()
          org.jetbrains.annotations.NotNull
      parameter 1:
        0: #9()
          org.jetbrains.annotations.NotNull

  public final boolean canMove(ext.mods.gameserver.geoengine.pathfinding.model.Location, ext.mods.gameserver.geoengine.pathfinding.model.Location);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/model/Location;Lext/mods/gameserver/geoengine/pathfinding/model/Location;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=7, args_size=3
         0: aload_0
         1: getfield      #115                // Field initialized:Z
         4: ifne          9
         7: iconst_0
         8: ireturn
         9: aload_0
        10: getfield      #55                 // Field spatialIndex:Lext/mods/gameserver/geoengine/pathfinding/core/spatial/SpatialIndexAdapter;
        13: aload_1
        14: invokevirtual #170                // Method ext/mods/gameserver/geoengine/pathfinding/core/spatial/SpatialIndexAdapter.findNearest:(Lext/mods/gameserver/geoengine/pathfinding/model/Location;)Ljava/lang/Integer;
        17: dup
        18: ifnull        27
        21: invokevirtual #182                // Method java/lang/Integer.intValue:()I
        24: goto          30
        27: pop
        28: iconst_0
        29: ireturn
        30: istore_3
        31: aload_0
        32: getfield      #55                 // Field spatialIndex:Lext/mods/gameserver/geoengine/pathfinding/core/spatial/SpatialIndexAdapter;
        35: aload_2
        36: invokevirtual #170                // Method ext/mods/gameserver/geoengine/pathfinding/core/spatial/SpatialIndexAdapter.findNearest:(Lext/mods/gameserver/geoengine/pathfinding/model/Location;)Ljava/lang/Integer;
        39: dup
        40: ifnull        49
        43: invokevirtual #182                // Method java/lang/Integer.intValue:()I
        46: goto          52
        49: pop
        50: iconst_0
        51: ireturn
        52: istore        4
        54: iload_3
        55: iload         4
        57: if_icmpne     62
        60: iconst_1
        61: ireturn
        62: iload_3
        63: aload_0
        64: getfield      #78                 // Field validNodeCount:I
        67: if_icmpge     79
        70: iload         4
        72: aload_0
        73: getfield      #78                 // Field validNodeCount:I
        76: if_icmplt     81
        79: iconst_0
        80: ireturn
        81: aload_0
        82: getfield      #18                 // Field storage:Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
        85: iload_3
        86: invokevirtual #215                // Method ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage.getNode:(I)Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;
        89: astore        5
        91: aload_0
        92: getfield      #18                 // Field storage:Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
        95: iload         4
        97: invokevirtual #215                // Method ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage.getNode:(I)Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;
       100: astore        6
       102: aload         5
       104: invokevirtual #221                // Method ext/mods/gameserver/geoengine/pathfinding/model/PathNode.isWalkable:()Z
       107: ifeq          118
       110: aload         6
       112: invokevirtual #221                // Method ext/mods/gameserver/geoengine/pathfinding/model/PathNode.isWalkable:()Z
       115: ifne          120
       118: iconst_0
       119: ireturn
       120: aload_0
       121: getfield      #22                 // Field dynamicLayer:Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;
       124: iload_3
       125: invokevirtual #194                // Method ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer.isBlocked:(I)Z
       128: ifne          143
       131: aload_0
       132: getfield      #22                 // Field dynamicLayer:Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;
       135: iload         4
       137: invokevirtual #194                // Method ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer.isBlocked:(I)Z
       140: ifeq          145
       143: iconst_0
       144: ireturn
       145: iconst_1
       146: ireturn
      StackMapTable: number_of_entries = 12
        frame_type = 9 /* same */
        frame_type = 81 /* same_locals_1_stack_item */
          stack = [ class java/lang/Integer ]
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 18
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine, class ext/mods/gameserver/geoengine/pathfinding/model/Location, class ext/mods/gameserver/geoengine/pathfinding/model/Location, int ]
          stack = [ class java/lang/Integer ]
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 9
          locals = [ int ]
        frame_type = 16 /* same */
        frame_type = 1 /* same */
        frame_type = 253 /* append */
          offset_delta = 36
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/model/PathNode, class ext/mods/gameserver/geoengine/pathfinding/model/PathNode ]
        frame_type = 1 /* same */
        frame_type = 22 /* same */
        frame_type = 1 /* same */
      LineNumberTable:
        line 114: 0
        line 116: 9
        line 117: 31
        line 119: 54
        line 121: 62
        line 123: 81
        line 124: 91
        line 126: 102
        line 127: 120
        line 129: 145
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           31     116     3 startNodeId   I
           54      93     4 goalNodeId   I
           91      56     5 startNode   Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;
          102      45     6 goalNode   Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;
            0     147     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;
            0     147     1 start   Lext/mods/gameserver/geoengine/pathfinding/model/Location;
            0     147     2  goal   Lext/mods/gameserver/geoengine/pathfinding/model/Location;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #9()
          org.jetbrains.annotations.NotNull
      parameter 1:
        0: #9()
          org.jetbrains.annotations.NotNull

  public final short getHeight(ext.mods.gameserver.geoengine.pathfinding.model.Location);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/model/Location;)S
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=3, args_size=2
         0: aload_0
         1: getfield      #55                 // Field spatialIndex:Lext/mods/gameserver/geoengine/pathfinding/core/spatial/SpatialIndexAdapter;
         4: aload_1
         5: invokevirtual #170                // Method ext/mods/gameserver/geoengine/pathfinding/core/spatial/SpatialIndexAdapter.findNearest:(Lext/mods/gameserver/geoengine/pathfinding/model/Location;)Ljava/lang/Integer;
         8: dup
         9: ifnull        18
        12: invokevirtual #182                // Method java/lang/Integer.intValue:()I
        15: goto          21
        18: pop
        19: iconst_0
        20: ireturn
        21: istore_2
        22: iload_2
        23: aload_0
        24: getfield      #78                 // Field validNodeCount:I
        27: if_icmplt     32
        30: iconst_0
        31: ireturn
        32: aload_0
        33: getfield      #18                 // Field storage:Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
        36: iload_2
        37: invokevirtual #215                // Method ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage.getNode:(I)Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;
        40: invokevirtual #232                // Method ext/mods/gameserver/geoengine/pathfinding/model/PathNode.toLocation:()Lext/mods/gameserver/geoengine/pathfinding/model/Location;
        43: invokevirtual #235                // Method ext/mods/gameserver/geoengine/pathfinding/model/Location.getZ:()I
        46: i2s
        47: ireturn
      StackMapTable: number_of_entries = 3
        frame_type = 82 /* same_locals_1_stack_item */
          stack = [ class java/lang/Integer ]
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ int ]
      LineNumberTable:
        line 133: 0
        line 134: 22
        line 136: 32
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           22      26     2 nodeId   I
            0      48     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;
            0      48     1 location   Lext/mods/gameserver/geoengine/pathfinding/model/Location;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #9()
          org.jetbrains.annotations.NotNull

  public final boolean canSee(ext.mods.gameserver.geoengine.pathfinding.model.Location, ext.mods.gameserver.geoengine.pathfinding.model.Location);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/model/Location;Lext/mods/gameserver/geoengine/pathfinding/model/Location;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=6, locals=16, args_size=3
         0: aload_0
         1: getfield      #55                 // Field spatialIndex:Lext/mods/gameserver/geoengine/pathfinding/core/spatial/SpatialIndexAdapter;
         4: aload_1
         5: invokevirtual #170                // Method ext/mods/gameserver/geoengine/pathfinding/core/spatial/SpatialIndexAdapter.findNearest:(Lext/mods/gameserver/geoengine/pathfinding/model/Location;)Ljava/lang/Integer;
         8: dup
         9: ifnull        18
        12: invokevirtual #182                // Method java/lang/Integer.intValue:()I
        15: goto          21
        18: pop
        19: iconst_0
        20: ireturn
        21: istore_3
        22: aload_0
        23: getfield      #55                 // Field spatialIndex:Lext/mods/gameserver/geoengine/pathfinding/core/spatial/SpatialIndexAdapter;
        26: aload_2
        27: invokevirtual #170                // Method ext/mods/gameserver/geoengine/pathfinding/core/spatial/SpatialIndexAdapter.findNearest:(Lext/mods/gameserver/geoengine/pathfinding/model/Location;)Ljava/lang/Integer;
        30: dup
        31: ifnull        40
        34: invokevirtual #182                // Method java/lang/Integer.intValue:()I
        37: goto          43
        40: pop
        41: iconst_0
        42: ireturn
        43: istore        4
        45: iload_3
        46: aload_0
        47: getfield      #78                 // Field validNodeCount:I
        50: if_icmpge     62
        53: iload         4
        55: aload_0
        56: getfield      #78                 // Field validNodeCount:I
        59: if_icmplt     64
        62: iconst_0
        63: ireturn
        64: aload_1
        65: invokevirtual #242                // Method ext/mods/gameserver/geoengine/pathfinding/model/Location.toGeo:()Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;
        68: astore        5
        70: aload_2
        71: invokevirtual #242                // Method ext/mods/gameserver/geoengine/pathfinding/model/Location.toGeo:()Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;
        74: astore        6
        76: aload         6
        78: invokevirtual #247                // Method ext/mods/gameserver/geoengine/pathfinding/model/GeoLocation.getX:()I
        81: aload         5
        83: invokevirtual #247                // Method ext/mods/gameserver/geoengine/pathfinding/model/GeoLocation.getX:()I
        86: isub
        87: invokestatic  #253                // Method java/lang/Math.abs:(I)I
        90: istore        7
        92: aload         6
        94: invokevirtual #256                // Method ext/mods/gameserver/geoengine/pathfinding/model/GeoLocation.getY:()I
        97: aload         5
        99: invokevirtual #256                // Method ext/mods/gameserver/geoengine/pathfinding/model/GeoLocation.getY:()I
       102: isub
       103: invokestatic  #253                // Method java/lang/Math.abs:(I)I
       106: istore        8
       108: aload         5
       110: invokevirtual #247                // Method ext/mods/gameserver/geoengine/pathfinding/model/GeoLocation.getX:()I
       113: aload         6
       115: invokevirtual #247                // Method ext/mods/gameserver/geoengine/pathfinding/model/GeoLocation.getX:()I
       118: if_icmpge     125
       121: iconst_1
       122: goto          126
       125: iconst_m1
       126: istore        9
       128: aload         5
       130: invokevirtual #256                // Method ext/mods/gameserver/geoengine/pathfinding/model/GeoLocation.getY:()I
       133: aload         6
       135: invokevirtual #256                // Method ext/mods/gameserver/geoengine/pathfinding/model/GeoLocation.getY:()I
       138: if_icmpge     145
       141: iconst_1
       142: goto          146
       145: iconst_m1
       146: istore        10
       148: iload         7
       150: iload         8
       152: isub
       153: istore        11
       155: aload         5
       157: invokevirtual #247                // Method ext/mods/gameserver/geoengine/pathfinding/model/GeoLocation.getX:()I
       160: istore        12
       162: aload         5
       164: invokevirtual #256                // Method ext/mods/gameserver/geoengine/pathfinding/model/GeoLocation.getY:()I
       167: istore        13
       169: iload         12
       171: aload         6
       173: invokevirtual #247                // Method ext/mods/gameserver/geoengine/pathfinding/model/GeoLocation.getX:()I
       176: if_icmpne     189
       179: iload         13
       181: aload         6
       183: invokevirtual #256                // Method ext/mods/gameserver/geoengine/pathfinding/model/GeoLocation.getY:()I
       186: if_icmpeq     318
       189: aload_0
       190: getfield      #55                 // Field spatialIndex:Lext/mods/gameserver/geoengine/pathfinding/core/spatial/SpatialIndexAdapter;
       193: new           #244                // class ext/mods/gameserver/geoengine/pathfinding/model/GeoLocation
       196: dup
       197: iload         12
       199: iload         13
       201: iconst_0
       202: invokespecial #259                // Method ext/mods/gameserver/geoengine/pathfinding/model/GeoLocation."<init>":(IIS)V
       205: invokevirtual #263                // Method ext/mods/gameserver/geoengine/pathfinding/core/spatial/SpatialIndexAdapter.findAt:(Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;)Ljava/lang/Integer;
       208: astore        14
       210: aload         14
       212: ifnull        266
       215: aload         14
       217: invokevirtual #182                // Method java/lang/Integer.intValue:()I
       220: aload_0
       221: getfield      #78                 // Field validNodeCount:I
       224: if_icmpge     266
       227: aload_0
       228: getfield      #18                 // Field storage:Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
       231: aload         14
       233: invokevirtual #182                // Method java/lang/Integer.intValue:()I
       236: invokevirtual #215                // Method ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage.getNode:(I)Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;
       239: astore        15
       241: aload         15
       243: invokevirtual #221                // Method ext/mods/gameserver/geoengine/pathfinding/model/PathNode.isWalkable:()Z
       246: ifeq          264
       249: aload_0
       250: getfield      #22                 // Field dynamicLayer:Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;
       253: aload         14
       255: invokevirtual #182                // Method java/lang/Integer.intValue:()I
       258: invokevirtual #194                // Method ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer.isBlocked:(I)Z
       261: ifeq          266
       264: iconst_0
       265: ireturn
       266: iconst_2
       267: iload         11
       269: imul
       270: istore        15
       272: iload         15
       274: iload         8
       276: ineg
       277: if_icmple     294
       280: iload         11
       282: iload         8
       284: isub
       285: istore        11
       287: iload         12
       289: iload         9
       291: iadd
       292: istore        12
       294: iload         15
       296: iload         7
       298: if_icmpge     169
       301: iload         11
       303: iload         7
       305: iadd
       306: istore        11
       308: iload         13
       310: iload         10
       312: iadd
       313: istore        13
       315: goto          169
       318: iconst_1
       319: ireturn
      StackMapTable: number_of_entries = 16
        frame_type = 82 /* same_locals_1_stack_item */
          stack = [ class java/lang/Integer ]
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 18
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine, class ext/mods/gameserver/geoengine/pathfinding/model/Location, class ext/mods/gameserver/geoengine/pathfinding/model/Location, int ]
          stack = [ class java/lang/Integer ]
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 18
          locals = [ int ]
        frame_type = 1 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 60
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine, class ext/mods/gameserver/geoengine/pathfinding/model/Location, class ext/mods/gameserver/geoengine/pathfinding/model/Location, int, int, class ext/mods/gameserver/geoengine/pathfinding/model/GeoLocation, class ext/mods/gameserver/geoengine/pathfinding/model/GeoLocation, int, int ]
          stack = []
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 18
          locals = [ int ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 22
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine, class ext/mods/gameserver/geoengine/pathfinding/model/Location, class ext/mods/gameserver/geoengine/pathfinding/model/Location, int, int, class ext/mods/gameserver/geoengine/pathfinding/model/GeoLocation, class ext/mods/gameserver/geoengine/pathfinding/model/GeoLocation, int, int, int, int, int, int, int ]
          stack = []
        frame_type = 19 /* same */
        frame_type = 253 /* append */
          offset_delta = 74
          locals = [ class java/lang/Integer, class ext/mods/gameserver/geoengine/pathfinding/model/PathNode ]
        frame_type = 250 /* chop */
          offset_delta = 1
        frame_type = 252 /* append */
          offset_delta = 27
          locals = [ int ]
        frame_type = 249 /* chop */
          offset_delta = 23
      LineNumberTable:
        line 140: 0
        line 141: 22
        line 143: 45
        line 145: 64
        line 146: 70
        line 148: 76
        line 148: 90
        line 149: 92
        line 149: 106
        line 150: 108
        line 151: 128
        line 152: 148
        line 154: 155
        line 155: 162
        line 157: 169
        line 158: 189
        line 159: 210
        line 160: 215
        line 161: 227
        line 162: 241
        line 163: 264
        line 168: 266
        line 169: 272
        line 170: 280
        line 171: 287
        line 173: 294
        line 174: 301
        line 175: 308
        line 179: 318
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          241      25    15  node   Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;
          210     105    14 nodeId   Ljava/lang/Integer;
          272      43    15    e2   I
           22     298     3 fromNodeId   I
           45     275     4 toNodeId   I
           70     250     5 fromGeo   Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;
           76     244     6 toGeo   Lext/mods/gameserver/geoengine/pathfinding/model/GeoLocation;
           92     228     7    dx   I
          108     212     8    dy   I
          128     192     9    sx   I
          148     172    10    sy   I
          155     165    11   err   I
          162     158    12     x   I
          169     151    13     y   I
            0     320     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;
            0     320     1  from   Lext/mods/gameserver/geoengine/pathfinding/model/Location;
            0     320     2    to   Lext/mods/gameserver/geoengine/pathfinding/model/Location;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #9()
          org.jetbrains.annotations.NotNull
      parameter 1:
        0: #9()
          org.jetbrains.annotations.NotNull

  public final void registerDynamicObject(java.lang.String, java.util.List<ext.mods.gameserver.geoengine.pathfinding.model.Location>, ext.mods.gameserver.geoengine.pathfinding.dynamic.DynamicObstacleLayer$ObjectType);
    descriptor: (Ljava/lang/String;Ljava/util/List;Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=20, args_size=4
         0: aload_2
         1: checkcast     #283                // class java/lang/Iterable
         4: astore        5
         6: iconst_0
         7: istore        6
         9: aload         5
        11: astore        7
        13: new           #285                // class java/util/ArrayList
        16: dup
        17: invokespecial #286                // Method java/util/ArrayList."<init>":()V
        20: checkcast     #288                // class java/util/Collection
        23: astore        8
        25: iconst_0
        26: istore        9
        28: aload         7
        30: astore        10
        32: iconst_0
        33: istore        11
        35: aload         10
        37: invokeinterface #292,  1          // InterfaceMethod java/lang/Iterable.iterator:()Ljava/util/Iterator;
        42: astore        12
        44: aload         12
        46: invokeinterface #297,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        51: ifeq          116
        54: aload         12
        56: invokeinterface #301,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        61: astore        13
        63: aload         13
        65: astore        14
        67: iconst_0
        68: istore        15
        70: aload         14
        72: checkcast     #226                // class ext/mods/gameserver/geoengine/pathfinding/model/Location
        75: astore        16
        77: iconst_0
        78: istore        17
        80: aload_0
        81: getfield      #55                 // Field spatialIndex:Lext/mods/gameserver/geoengine/pathfinding/core/spatial/SpatialIndexAdapter;
        84: aload         16
        86: invokevirtual #170                // Method ext/mods/gameserver/geoengine/pathfinding/core/spatial/SpatialIndexAdapter.findNearest:(Lext/mods/gameserver/geoengine/pathfinding/model/Location;)Ljava/lang/Integer;
        89: dup
        90: ifnull        111
        93: astore        18
        95: iconst_0
        96: istore        19
        98: aload         8
       100: aload         18
       102: invokeinterface #305,  2          // InterfaceMethod java/util/Collection.add:(Ljava/lang/Object;)Z
       107: pop
       108: goto          112
       111: pop
       112: nop
       113: goto          44
       116: nop
       117: aload         8
       119: checkcast     #307                // class java/util/List
       122: nop
       123: checkcast     #283                // class java/lang/Iterable
       126: astore        5
       128: nop
       129: iconst_0
       130: istore        6
       132: aload         5
       134: astore        7
       136: new           #285                // class java/util/ArrayList
       139: dup
       140: invokespecial #286                // Method java/util/ArrayList."<init>":()V
       143: checkcast     #288                // class java/util/Collection
       146: astore        8
       148: iconst_0
       149: istore        9
       151: aload         7
       153: invokeinterface #292,  1          // InterfaceMethod java/lang/Iterable.iterator:()Ljava/util/Iterator;
       158: astore        10
       160: aload         10
       162: invokeinterface #297,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       167: ifeq          222
       170: aload         10
       172: invokeinterface #301,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       177: astore        11
       179: aload         11
       181: checkcast     #309                // class java/lang/Number
       184: invokevirtual #310                // Method java/lang/Number.intValue:()I
       187: istore        12
       189: iconst_0
       190: istore        13
       192: iload         12
       194: aload_0
       195: getfield      #78                 // Field validNodeCount:I
       198: if_icmpge     205
       201: iconst_1
       202: goto          206
       205: iconst_0
       206: ifeq          160
       209: aload         8
       211: aload         11
       213: invokeinterface #305,  2          // InterfaceMethod java/util/Collection.add:(Ljava/lang/Object;)Z
       218: pop
       219: goto          160
       222: aload         8
       224: checkcast     #307                // class java/util/List
       227: nop
       228: checkcast     #288                // class java/util/Collection
       231: invokestatic  #314                // Method kotlin/collections/CollectionsKt.toIntArray:(Ljava/util/Collection;)[I
       234: astore        4
       236: aload         4
       238: arraylength
       239: ifne          246
       242: iconst_1
       243: goto          247
       246: iconst_0
       247: ifne          254
       250: iconst_1
       251: goto          255
       254: iconst_0
       255: ifeq          269
       258: aload_0
       259: getfield      #22                 // Field dynamicLayer:Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;
       262: aload_1
       263: aload         4
       265: aload_3
       266: invokevirtual #318                // Method ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer.registerObject:(Ljava/lang/String;[ILext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;)V
       269: return
      StackMapTable: number_of_entries = 13
        frame_type = 255 /* full_frame */
          offset_delta = 44
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine, class java/lang/String, class java/util/List, class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType, top, class java/lang/Iterable, int, class java/lang/Iterable, class java/util/Collection, int, class java/lang/Iterable, int, class java/util/Iterator ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 66
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine, class java/lang/String, class java/util/List, class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType, top, class java/lang/Iterable, int, class java/lang/Iterable, class java/util/Collection, int, class java/lang/Iterable, int, class java/util/Iterator, class java/lang/Object, class java/lang/Object, int, class ext/mods/gameserver/geoengine/pathfinding/model/Location, int ]
          stack = [ class java/lang/Integer ]
        frame_type = 0 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 3
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine, class java/lang/String, class java/util/List, class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType, top, class java/lang/Iterable, int, class java/lang/Iterable, class java/util/Collection, int, class java/lang/Iterable, int, class java/util/Iterator ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 43
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine, class java/lang/String, class java/util/List, class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType, top, class java/lang/Iterable, int, class java/lang/Iterable, class java/util/Collection, int, class java/util/Iterator ]
          stack = []
        frame_type = 254 /* append */
          offset_delta = 44
          locals = [ class java/lang/Object, int, int ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 248 /* chop */
          offset_delta = 15
        frame_type = 255 /* full_frame */
          offset_delta = 23
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine, class java/lang/String, class java/util/List, class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType, class "[I", class java/lang/Iterable, int, class java/lang/Iterable, class java/util/Collection, int, class java/util/Iterator ]
          stack = []
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 6 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 13 /* same */
      LineNumberTable:
        line 182: 0
        line 355: 9
        line 364: 28
        line 365: 35
        line 364: 70
        line 182: 80
        line 364: 89
        line 366: 95
        line 364: 98
        line 364: 108
        line 364: 111
        line 365: 112
        line 367: 116
        line 368: 117
        line 355: 122
        line 183: 128
        line 369: 132
        line 370: 151
        line 183: 192
        line 370: 206
        line 371: 222
        line 369: 227
        line 184: 231
        line 182: 234
        line 186: 236
        line 186: 255
        line 187: 258
        line 189: 269
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           80       9    17 $i$a$-mapNotNull-L2BREngine$registerDynamicObject$nodeIds$1   I
           77      12    16    it   Lext/mods/gameserver/geoengine/pathfinding/model/Location;
           98      10    19 $i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv   I
           95      13    18 it$iv$iv   Ljava/lang/Object;
           70      42    15 $i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv   I
           67      45    14 element$iv$iv   Ljava/lang/Object;
           63      50    13 element$iv$iv$iv   Ljava/lang/Object;
           35      82    11 $i$f$forEach   I
           32      85    10 $this$forEach$iv$iv$iv   Ljava/lang/Iterable;
           28      91     9 $i$f$mapNotNullTo   I
           25      94     7 $this$mapNotNullTo$iv$iv   Ljava/lang/Iterable;
           25      94     8 destination$iv$iv   Ljava/util/Collection;
            9     114     6 $i$f$mapNotNull   I
            6     117     5 $this$mapNotNull$iv   Ljava/lang/Iterable;
          192      14    13 $i$a$-filter-L2BREngine$registerDynamicObject$nodeIds$2   I
          189      17    12    it   I
          179      40    11 element$iv$iv   Ljava/lang/Object;
          151      73     9 $i$f$filterTo   I
          148      76     7 $this$filterTo$iv$iv   Ljava/lang/Iterable;
          148      76     8 destination$iv$iv   Ljava/util/Collection;
          132      96     6 $i$f$filter   I
          129      99     5 $this$filter$iv   Ljava/lang/Iterable;
          236      34     4 nodeIds   [I
            0     270     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;
            0     270     1 objectId   Ljava/lang/String;
            0     270     2 locations   Ljava/util/List;
            0     270     3  type   Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;
    Signature: #281                         // (Ljava/lang/String;Ljava/util/List<Lext/mods/gameserver/geoengine/pathfinding/model/Location;>;Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;)V
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #9()
          org.jetbrains.annotations.NotNull
      parameter 1:
        0: #9()
          org.jetbrains.annotations.NotNull
      parameter 2:
        0: #9()
          org.jetbrains.annotations.NotNull

  public final void unregisterDynamicObject(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #22                 // Field dynamicLayer:Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;
         4: aload_1
         5: invokevirtual #356                // Method ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer.unregisterObject:(Ljava/lang/String;)V
         8: return
      LineNumberTable:
        line 191: 0
        line 192: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;
            0       9     1 objectId   Ljava/lang/String;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #9()
          org.jetbrains.annotations.NotNull

  public final boolean toggleDynamicObject(java.lang.String);
    descriptor: (Ljava/lang/String;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #22                 // Field dynamicLayer:Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;
         4: aload_1
         5: invokevirtual #361                // Method ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer.toggleObject:(Ljava/lang/String;)Z
         8: ireturn
      LineNumberTable:
        line 194: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;
            0       9     1 objectId   Ljava/lang/String;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #9()
          org.jetbrains.annotations.NotNull

  public final ext.mods.gameserver.geoengine.pathfinding.core.L2BREngine$EngineMetricsSnapshot getMetrics();
    descriptor: ()Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #62                 // Field metrics:Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetrics;
         4: invokevirtual #366                // Method ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetrics.snapshot:()Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot;
         7: areturn
      LineNumberTable:
        line 196: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;
    RuntimeInvisibleAnnotations:
      0: #9()
        org.jetbrains.annotations.NotNull

  public final ext.mods.gameserver.geoengine.pathfinding.native.NativeStorage$MemoryStats getStorageStats();
    descriptor: ()Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #18                 // Field storage:Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
         4: invokevirtual #68                 // Method ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage.getMemoryStats:()Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats;
         7: areturn
      LineNumberTable:
        line 197: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;
    RuntimeInvisibleAnnotations:
      0: #9()
        org.jetbrains.annotations.NotNull

  public final ext.mods.gameserver.geoengine.pathfinding.dynamic.DynamicObstacleLayer$LayerStats getDynamicLayerStats();
    descriptor: ()Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$LayerStats;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field dynamicLayer:Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;
         4: invokevirtual #372                // Method ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer.getStats:()Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$LayerStats;
         7: areturn
      LineNumberTable:
        line 198: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;
    RuntimeInvisibleAnnotations:
      0: #9()
        org.jetbrains.annotations.NotNull

  public final boolean contains(ext.mods.gameserver.geoengine.pathfinding.model.Location);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/model/Location;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=3, args_size=2
         0: aload_0
         1: getfield      #55                 // Field spatialIndex:Lext/mods/gameserver/geoengine/pathfinding/core/spatial/SpatialIndexAdapter;
         4: aload_1
         5: invokevirtual #170                // Method ext/mods/gameserver/geoengine/pathfinding/core/spatial/SpatialIndexAdapter.findNearest:(Lext/mods/gameserver/geoengine/pathfinding/model/Location;)Ljava/lang/Integer;
         8: astore_2
         9: aload_2
        10: ifnull        28
        13: aload_2
        14: invokevirtual #182                // Method java/lang/Integer.intValue:()I
        17: aload_0
        18: getfield      #78                 // Field validNodeCount:I
        21: if_icmpge     28
        24: iconst_1
        25: goto          29
        28: iconst_0
        29: ireturn
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 28
          locals = [ class java/lang/Integer ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
      LineNumberTable:
        line 200: 0
        line 201: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            9      21     2 nodeId   Ljava/lang/Integer;
            0      30     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;
            0      30     1 location   Lext/mods/gameserver/geoengine/pathfinding/model/Location;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #9()
          org.jetbrains.annotations.NotNull

  public final java.lang.String getNodeDebugInfo(ext.mods.gameserver.geoengine.pathfinding.model.Location);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/model/Location;)Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=18, args_size=2
         0: aload_0
         1: getfield      #55                 // Field spatialIndex:Lext/mods/gameserver/geoengine/pathfinding/core/spatial/SpatialIndexAdapter;
         4: aload_1
         5: invokevirtual #170                // Method ext/mods/gameserver/geoengine/pathfinding/core/spatial/SpatialIndexAdapter.findNearest:(Lext/mods/gameserver/geoengine/pathfinding/model/Location;)Ljava/lang/Integer;
         8: dup
         9: ifnull        18
        12: invokevirtual #182                // Method java/lang/Integer.intValue:()I
        15: goto          23
        18: pop
        19: ldc_w         #378                // String Nó não encontrado
        22: areturn
        23: istore_2
        24: iload_2
        25: aload_0
        26: getfield      #78                 // Field validNodeCount:I
        29: if_icmplt     43
        32: iload_2
        33: aload_0
        34: getfield      #78                 // Field validNodeCount:I
        37: invokedynamic #383,  0            // InvokeDynamic #4:makeConcatWithConstants:(II)Ljava/lang/String;
        42: areturn
        43: aload_0
        44: getfield      #18                 // Field storage:Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
        47: iload_2
        48: invokevirtual #215                // Method ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage.getNode:(I)Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;
        51: astore_3
        52: new           #385                // class java/lang/StringBuilder
        55: dup
        56: invokespecial #386                // Method java/lang/StringBuilder."<init>":()V
        59: astore        4
        61: aload         4
        63: astore        5
        65: iconst_0
        66: istore        6
        68: aload         5
        70: iload_2
        71: aload_0
        72: getfield      #78                 // Field validNodeCount:I
        75: iconst_1
        76: isub
        77: invokedynamic #389,  0            // InvokeDynamic #5:makeConcatWithConstants:(II)Ljava/lang/String;
        82: invokevirtual #393                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        85: bipush        10
        87: invokevirtual #396                // Method java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        90: pop
        91: aload         5
        93: aload_3
        94: invokevirtual #397                // Method ext/mods/gameserver/geoengine/pathfinding/model/PathNode.getX:()I
        97: aload_3
        98: invokevirtual #398                // Method ext/mods/gameserver/geoengine/pathfinding/model/PathNode.getY:()I
       101: aload_3
       102: invokevirtual #399                // Method ext/mods/gameserver/geoengine/pathfinding/model/PathNode.getZ:()I
       105: invokedynamic #404,  0            // InvokeDynamic #6:makeConcatWithConstants:(III)Ljava/lang/String;
       110: invokevirtual #393                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       113: bipush        10
       115: invokevirtual #396                // Method java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
       118: pop
       119: aload         5
       121: aload_3
       122: invokevirtual #221                // Method ext/mods/gameserver/geoengine/pathfinding/model/PathNode.isWalkable:()Z
       125: invokedynamic #409,  0            // InvokeDynamic #7:makeConcatWithConstants:(Z)Ljava/lang/String;
       130: invokevirtual #393                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       133: bipush        10
       135: invokevirtual #396                // Method java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
       138: pop
       139: aload         5
       141: aload_3
       142: invokevirtual #412                // Method ext/mods/gameserver/geoengine/pathfinding/model/PathNode.getHasDynamicCheck:()Z
       145: invokedynamic #415,  0            // InvokeDynamic #8:makeConcatWithConstants:(Z)Ljava/lang/String;
       150: invokevirtual #393                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       153: bipush        10
       155: invokevirtual #396                // Method java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
       158: pop
       159: aload         5
       161: aload_0
       162: getfield      #22                 // Field dynamicLayer:Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;
       165: iload_2
       166: invokevirtual #194                // Method ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer.isBlocked:(I)Z
       169: invokedynamic #418,  0            // InvokeDynamic #9:makeConcatWithConstants:(Z)Ljava/lang/String;
       174: invokevirtual #393                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       177: bipush        10
       179: invokevirtual #396                // Method java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
       182: pop
       183: aload         5
       185: astore        7
       187: new           #420                // class kotlin/ranges/IntRange
       190: dup
       191: iconst_0
       192: bipush        7
       194: invokespecial #423                // Method kotlin/ranges/IntRange."<init>":(II)V
       197: checkcast     #283                // class java/lang/Iterable
       200: astore        8
       202: iconst_0
       203: istore        9
       205: aload         8
       207: astore        10
       209: new           #285                // class java/util/ArrayList
       212: dup
       213: aload         8
       215: bipush        10
       217: invokestatic  #427                // Method kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
       220: invokespecial #430                // Method java/util/ArrayList."<init>":(I)V
       223: checkcast     #288                // class java/util/Collection
       226: astore        11
       228: iconst_0
       229: istore        12
       231: aload         10
       233: invokeinterface #292,  1          // InterfaceMethod java/lang/Iterable.iterator:()Ljava/util/Iterator;
       238: astore        13
       240: aload         13
       242: invokeinterface #297,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       247: ifeq          292
       250: aload         13
       252: checkcast     #432                // class kotlin/collections/IntIterator
       255: invokevirtual #435                // Method kotlin/collections/IntIterator.nextInt:()I
       258: istore        14
       260: aload         11
       262: iload         14
       264: istore        15
       266: astore        16
       268: iconst_0
       269: istore        17
       271: aload_3
       272: iload         15
       274: invokevirtual #438                // Method ext/mods/gameserver/geoengine/pathfinding/model/PathNode.getJpsDistance:(I)I
       277: invokestatic  #442                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       280: aload         16
       282: swap
       283: invokeinterface #305,  2          // InterfaceMethod java/util/Collection.add:(Ljava/lang/Object;)Z
       288: pop
       289: goto          240
       292: aload         11
       294: checkcast     #307                // class java/util/List
       297: nop
       298: invokedynamic #447,  0            // InvokeDynamic #10:makeConcatWithConstants:(Ljava/util/List;)Ljava/lang/String;
       303: astore        8
       305: aload         7
       307: aload         8
       309: invokevirtual #393                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       312: bipush        10
       314: invokevirtual #396                // Method java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
       317: pop
       318: nop
       319: aload         4
       321: invokevirtual #450                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
       324: areturn
      StackMapTable: number_of_entries = 5
        frame_type = 82 /* same_locals_1_stack_item */
          stack = [ class java/lang/Integer ]
        frame_type = 68 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 196
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine, class ext/mods/gameserver/geoengine/pathfinding/model/Location, int, class ext/mods/gameserver/geoengine/pathfinding/model/PathNode, class java/lang/StringBuilder, class java/lang/StringBuilder, int, class java/lang/StringBuilder, class java/lang/Iterable, int, class java/lang/Iterable, class java/util/Collection, int, class java/util/Iterator ]
          stack = []
        frame_type = 51 /* same */
      LineNumberTable:
        line 204: 0
        line 205: 24
        line 207: 43
        line 209: 52
        line 210: 68
        line 211: 91
        line 212: 119
        line 213: 139
        line 214: 159
        line 215: 183
        line 372: 205
        line 373: 231
        line 374: 260
        line 215: 271
        line 374: 283
        line 375: 292
        line 372: 297
        line 215: 305
        line 216: 318
        line 209: 319
        line 209: 324
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          271       6    17 $i$a$-map-L2BREngine$getNodeDebugInfo$1$1   I
          268       9    15    it   I
          260      29    14 item$iv$iv   I
          231      63    12 $i$f$mapTo   I
          228      66    10 $this$mapTo$iv$iv   Ljava/lang/Iterable;
          228      66    11 destination$iv$iv   Ljava/util/Collection;
          205      93     9 $i$f$map   I
          202      96     8 $this$map$iv   Ljava/lang/Iterable;
           68     251     6 $i$a$-buildString-L2BREngine$getNodeDebugInfo$1   I
           65     254     5 $this$getNodeDebugInfo_u24lambda_u240   Ljava/lang/StringBuilder;
           24     301     2 nodeId   I
           52     273     3  node   Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;
            0     325     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;
            0     325     1 location   Lext/mods/gameserver/geoengine/pathfinding/model/Location;
    RuntimeInvisibleAnnotations:
      0: #9()
        org.jetbrains.annotations.NotNull
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #9()
          org.jetbrains.annotations.NotNull

  public void close();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=1
         0: aload_0
         1: iconst_0
         2: putfield      #115                // Field initialized:Z
         5: nop
         6: aload_0
         7: getfield      #18                 // Field storage:Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
        10: invokevirtual #521                // Method ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage.close:()V
        13: goto          33
        16: astore_1
        17: aload_0
        18: getfield      #38                 // Field logger:Ljava/util/logging/Logger;
        21: aload_1
        22: invokevirtual #118                // Method java/lang/Exception.getMessage:()Ljava/lang/String;
        25: invokedynamic #524,  0            // InvokeDynamic #14:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        30: invokevirtual #190                // Method java/util/logging/Logger.warning:(Ljava/lang/String;)V
        33: return
      Exception table:
         from    to  target type
             5    13    16   Class java/lang/Exception
      StackMapTable: number_of_entries = 2
        frame_type = 80 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 16 /* same */
      LineNumberTable:
        line 254: 0
        line 255: 5
        line 256: 6
        line 257: 16
        line 258: 17
        line 260: 33
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           17      16     1     e   Ljava/lang/Exception;
            0      34     0  this   Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;
}
InnerClasses:
  public static final #570= #573 of #2;   // EngineMetricsSnapshot=class ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot of class ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine
  public static final #576= #575 of #140; // LayerStats=class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$LayerStats of class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer
  public static final #577= #351 of #140; // ObjectType=class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType of class ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer
  public static final #578= #70 of #64;   // MemoryStats=class ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats of class ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage
  public static final #581= #461 of #580; // IntRef=class kotlin/jvm/internal/Ref$IntRef of class kotlin/jvm/internal/Ref
SourceFile: "L2BREngine.kt"
SourceDebugExtension:
  SMAP
  L2BREngine.kt
  Kotlin
  *S Kotlin
  *F
  + 1 L2BREngine.kt
  ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine
  + 2 _Collections.kt
  kotlin/collections/CollectionsKt___CollectionsKt
  + 3 fake.kt
  kotlin/jvm/internal/FakeKt
  *L
  1#1,354:1
  1642#2,10:355
  1915#2:365
  1916#2:367
  1652#2:368
  777#2:369
  873#2,2:370
  1586#2:372
  1661#2,3:373
  1915#2,2:376
  1#3:366
  *S KotlinDebug
  *F
  + 1 L2BREngine.kt
  ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine
  *L
  182#1:355,10
  182#1:365
  182#1:367
  182#1:368
  183#1:369
  183#1:370,2
  215#1:372
  215#1:373,3
  245#1:376,2
  182#1:366
  *E
RuntimeVisibleAnnotations:
  0: #551(#552=[I#553,I#554,I#555],#556=I#557,#558=I#559,#560=[s#561],#562=[s#138,s#563,s#564,s#15,s#16,s#19,s#20,s#7,s#8,s#141,s#142,s#143,s#144,s#35,s#36,s#565,s#43,s#44,s#52,s#53,s#59,s#60,s#112,s#566,s#75,s#566,s#145,s#566,s#208,s#207,s#209,s#210,s#227,s#566,s#237,s#238,s#277,s#278,s#279,s#566,s#343,s#566,s#345,s#346,s#347,s#353,s#357,s#362,s#567,s#367,s#131,s#368,s#568,s#373,s#375,s#109,s#127,s#569,s#570,s#571])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\n\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002:\u00029:B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cJ\u0016\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cJ\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001cJ\u0016\u0010#\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\u001cJ$\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010+\u001a\u00020,J\u000e\u0010-\u001a\u00020\'2\u0006\u0010(\u001a\u00020)J\u000e\u0010.\u001a\u00020\u00172\u0006\u0010(\u001a\u00020)J\u0006\u0010/\u001a\u000200J\u0006\u00101\u001a\u000202J\u0006\u00103\u001a\u000204J\u000e\u00105\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u001cJ\u000e\u00106\u001a\u00020)2\u0006\u0010\"\u001a\u00020\u001cJ\b\u00107\u001a\u00020\'H\u0002J\b\u00108\u001a\u00020\'H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006;"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;","Ljava/lang/AutoCloseable;","Lkotlin/AutoCloseable;","storage","Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;","dynamicLayer","Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;","<init>","(Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;)V","getStorage","()Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;","getDynamicLayer","()Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;","logger","Ljava/util/logging/Logger;","kotlin.jvm.PlatformType","calculator","Lext/mods/gameserver/geoengine/pathfinding/core/jps/JPSPlusCalculator;","spatialIndex","Lext/mods/gameserver/geoengine/pathfinding/core/spatial/SpatialIndexAdapter;","metrics","Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetrics;","initialized","","validNodeCount","","findPath","","Lext/mods/gameserver/geoengine/pathfinding/model/Location;","start","goal","canMove","getHeight","","location","canSee","from","to","registerDynamicObject","","objectId","","locations","type","Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$ObjectType;","unregisterDynamicObject","toggleDynamicObject","getMetrics","Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot;","getStorageStats","Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats;","getDynamicLayerStats","Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer$LayerStats;","contains","getNodeDebugInfo","buildSpatialIndex","close","EngineMetrics","EngineMetricsSnapshot","Brproject"]
    )
RuntimeInvisibleAnnotations:
  0: #583(#584=[s#585])
    kotlin.jvm.internal.SourceDebugExtension(
      value=["SMAP\nL2BREngine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 L2BREngine.kt\next/mods/gameserver/geoengine/pathfinding/core/L2BREngine\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,354:1\n1642#2,10:355\n1915#2:365\n1916#2:367\n1652#2:368\n777#2:369\n873#2,2:370\n1586#2:372\n1661#2,3:373\n1915#2,2:376\n1#3:366\n*S KotlinDebug\n*F\n+ 1 L2BREngine.kt\next/mods/gameserver/geoengine/pathfinding/core/L2BREngine\n*L\n182#1:355,10\n182#1:365\n182#1:367\n182#1:368\n183#1:369\n183#1:370,2\n215#1:372\n215#1:373,3\n245#1:376,2\n182#1:366\n*E\n"]
    )
BootstrapMethods:
  0: #89 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #82 NodeCount inválido no header: \u0001
  1: #89 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #105 Arquivo mapeado é menor que o esperado. NodeCount: \u0001, Esperado mínimo: \u0001 bytes, Mapeado: \u0001 bytes. Verifique se o NativeStorage está usando DataOffset correto.
  2: #89 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #120 [L2BR] Falha crítica na inicialização: \u0001
  3: #89 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #184 [L2BR] NodeId fora dos limites: start=\u0001, goal=\u0001, max=\u0001
  4: #89 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #380 NodeId (\u0001) fora dos limites (max: \u0001)
  5: #89 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #388 Node ID: \u0001 (max válido: \u0001)
  6: #89 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #401 Position: (\u0001, \u0001, \u0001)
  7: #89 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #406 Walkable: \u0001
  8: #89 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #414 Dynamic: \u0001
  9: #89 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #417 Blocked: \u0001
  10: #89 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #444 JPS Distances: \u0001
  11: #478 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #464 (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      #469 REF_invokeStatic ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine.buildSpatialIndex$lambda$0:(Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;Lkotlin/jvm/internal/Ref$IntRef;Ljava/util/List;ILext/mods/gameserver/geoengine/pathfinding/model/PathNode;)Lkotlin/Unit;
      #471 (Ljava/lang/Integer;Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;)Lkotlin/Unit;
  12: #89 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #491 [L2BR] Total de nós inválidos ignorados: \u0001
  13: #89 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #506 Falha ao construir índice espacial: \u0001
  14: #89 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #523 [L2BR] Erro ao fechar storage: \u0001
  15: #89 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #526 [L2BR] Ignorando nó com ID inválido: \u0001 (fora de 0..\u0001)
  16: #89 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #544 [L2BR] Erro ao processar nó \u0001: \u0001
