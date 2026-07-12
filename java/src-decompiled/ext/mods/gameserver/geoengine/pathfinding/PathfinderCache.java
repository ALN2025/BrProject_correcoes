// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.PathfinderCache
// File: ext\mods\gameserver\geoengine\pathfinding\PathfinderCache.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/PathfinderCache.class
  Last modified 9 de jul de 2026; size 16498 bytes
  MD5 checksum a5e637ce20090d77aaf4258c3b8fd993
  Compiled from "PathfinderCache.java"
public class ext.mods.gameserver.geoengine.pathfinding.PathfinderCache
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/geoengine/pathfinding/PathfinderCache
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 16, methods: 19, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/concurrent/ConcurrentHashMap
    #8 = Utf8               java/util/concurrent/ConcurrentHashMap
    #9 = Methodref          #7.#3         // java/util/concurrent/ConcurrentHashMap."<init>":()V
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/geoengine/pathfinding/PathfinderCache._pathCache:Ljava/util/Map;
   #11 = Class              #13           // ext/mods/gameserver/geoengine/pathfinding/PathfinderCache
   #12 = NameAndType        #14:#15       // _pathCache:Ljava/util/Map;
   #13 = Utf8               ext/mods/gameserver/geoengine/pathfinding/PathfinderCache
   #14 = Utf8               _pathCache
   #15 = Utf8               Ljava/util/Map;
   #16 = Fieldref           #11.#17       // ext/mods/gameserver/geoengine/pathfinding/PathfinderCache._cacheTimestamps:Ljava/util/Map;
   #17 = NameAndType        #18:#15       // _cacheTimestamps:Ljava/util/Map;
   #18 = Utf8               _cacheTimestamps
   #19 = Class              #20           // java/util/concurrent/ConcurrentLinkedQueue
   #20 = Utf8               java/util/concurrent/ConcurrentLinkedQueue
   #21 = Methodref          #19.#3        // java/util/concurrent/ConcurrentLinkedQueue."<init>":()V
   #22 = Fieldref           #11.#23       // ext/mods/gameserver/geoengine/pathfinding/PathfinderCache._cacheAccessOrder:Ljava/util/Queue;
   #23 = NameAndType        #24:#25       // _cacheAccessOrder:Ljava/util/Queue;
   #24 = Utf8               _cacheAccessOrder
   #25 = Utf8               Ljava/util/Queue;
   #26 = Fieldref           #11.#27       // ext/mods/gameserver/geoengine/pathfinding/PathfinderCache._cacheHits:J
   #27 = NameAndType        #28:#29       // _cacheHits:J
   #28 = Utf8               _cacheHits
   #29 = Utf8               J
   #30 = Fieldref           #11.#31       // ext/mods/gameserver/geoengine/pathfinding/PathfinderCache._cacheMisses:J
   #31 = NameAndType        #32:#29       // _cacheMisses:J
   #32 = Utf8               _cacheMisses
   #33 = Fieldref           #11.#34       // ext/mods/gameserver/geoengine/pathfinding/PathfinderCache._pathsGenerated:J
   #34 = NameAndType        #35:#29       // _pathsGenerated:J
   #35 = Utf8               _pathsGenerated
   #36 = Fieldref           #11.#37       // ext/mods/gameserver/geoengine/pathfinding/PathfinderCache._pathsLoaded:J
   #37 = NameAndType        #38:#29       // _pathsLoaded:J
   #38 = Utf8               _pathsLoaded
   #39 = Fieldref           #11.#40       // ext/mods/gameserver/geoengine/pathfinding/PathfinderCache.ENABLE_PATHFINDER_CACHE:Z
   #40 = NameAndType        #41:#42       // ENABLE_PATHFINDER_CACHE:Z
   #41 = Utf8               ENABLE_PATHFINDER_CACHE
   #42 = Utf8               Z
   #43 = Methodref          #11.#44       // ext/mods/gameserver/geoengine/pathfinding/PathfinderCache.initializeCache:()V
   #44 = NameAndType        #45:#6        // initializeCache:()V
   #45 = Utf8               initializeCache
   #46 = Fieldref           #11.#47       // ext/mods/gameserver/geoengine/pathfinding/PathfinderCache._instance:Lext/mods/gameserver/geoengine/pathfinding/PathfinderCache;
   #47 = NameAndType        #48:#49       // _instance:Lext/mods/gameserver/geoengine/pathfinding/PathfinderCache;
   #48 = Utf8               _instance
   #49 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/PathfinderCache;
   #50 = Methodref          #11.#3        // ext/mods/gameserver/geoengine/pathfinding/PathfinderCache."<init>":()V
   #51 = Fieldref           #11.#52       // ext/mods/gameserver/geoengine/pathfinding/PathfinderCache.CACHE_DIRECTORY:Ljava/lang/String;
   #52 = NameAndType        #53:#54       // CACHE_DIRECTORY:Ljava/lang/String;
   #53 = Utf8               CACHE_DIRECTORY
   #54 = Utf8               Ljava/lang/String;
   #55 = Class              #56           // java/lang/String
   #56 = Utf8               java/lang/String
   #57 = Methodref          #58.#59       // java/nio/file/Paths.get:(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
   #58 = Class              #60           // java/nio/file/Paths
   #59 = NameAndType        #61:#62       // get:(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
   #60 = Utf8               java/nio/file/Paths
   #61 = Utf8               get
   #62 = Utf8               (Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
   #63 = Class              #64           // java/nio/file/LinkOption
   #64 = Utf8               java/nio/file/LinkOption
   #65 = Methodref          #66.#67       // java/nio/file/Files.exists:(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
   #66 = Class              #68           // java/nio/file/Files
   #67 = NameAndType        #69:#70       // exists:(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
   #68 = Utf8               java/nio/file/Files
   #69 = Utf8               exists
   #70 = Utf8               (Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
   #71 = Class              #72           // java/nio/file/attribute/FileAttribute
   #72 = Utf8               java/nio/file/attribute/FileAttribute
   #73 = Methodref          #66.#74       // java/nio/file/Files.createDirectories:(Ljava/nio/file/Path;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;
   #74 = NameAndType        #75:#76       // createDirectories:(Ljava/nio/file/Path;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;
   #75 = Utf8               createDirectories
   #76 = Utf8               (Ljava/nio/file/Path;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;
   #77 = Fieldref           #11.#78       // ext/mods/gameserver/geoengine/pathfinding/PathfinderCache.LOGGER:Lext/mods/commons/logging/CLogger;
   #78 = NameAndType        #79:#80       // LOGGER:Lext/mods/commons/logging/CLogger;
   #79 = Utf8               LOGGER
   #80 = Utf8               Lext/mods/commons/logging/CLogger;
   #81 = String             #82           // Diretório de cache criado: {}
   #82 = Utf8               Diretório de cache criado: {}
   #83 = Methodref          #84.#85       // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #84 = Class              #86           // ext/mods/commons/logging/CLogger
   #85 = NameAndType        #87:#88       // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #86 = Utf8               ext/mods/commons/logging/CLogger
   #87 = Utf8               info
   #88 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
   #89 = Fieldref           #11.#90       // ext/mods/gameserver/geoengine/pathfinding/PathfinderCache.BACKGROUND_GENERATION_THREADS:I
   #90 = NameAndType        #91:#92       // BACKGROUND_GENERATION_THREADS:I
   #91 = Utf8               BACKGROUND_GENERATION_THREADS
   #92 = Utf8               I
   #93 = Methodref          #94.#95       // java/util/concurrent/Executors.newFixedThreadPool:(I)Ljava/util/concurrent/ExecutorService;
   #94 = Class              #96           // java/util/concurrent/Executors
   #95 = NameAndType        #97:#98       // newFixedThreadPool:(I)Ljava/util/concurrent/ExecutorService;
   #96 = Utf8               java/util/concurrent/Executors
   #97 = Utf8               newFixedThreadPool
   #98 = Utf8               (I)Ljava/util/concurrent/ExecutorService;
   #99 = Fieldref           #11.#100      // ext/mods/gameserver/geoengine/pathfinding/PathfinderCache._generationExecutor:Ljava/util/concurrent/ExecutorService;
  #100 = NameAndType        #101:#102     // _generationExecutor:Ljava/util/concurrent/ExecutorService;
  #101 = Utf8               _generationExecutor
  #102 = Utf8               Ljava/util/concurrent/ExecutorService;
  #103 = Methodref          #11.#104      // ext/mods/gameserver/geoengine/pathfinding/PathfinderCache.loadCacheFromFiles:()V
  #104 = NameAndType        #105:#6       // loadCacheFromFiles:()V
  #105 = Utf8               loadCacheFromFiles
  #106 = String             #107          // PathfinderCache inicializado - Cache: {}, Threads: {}
  #107 = Utf8               PathfinderCache inicializado - Cache: {}, Threads: {}
  #108 = Fieldref           #11.#109      // ext/mods/gameserver/geoengine/pathfinding/PathfinderCache.CACHE_SIZE_LIMIT:I
  #109 = NameAndType        #110:#92      // CACHE_SIZE_LIMIT:I
  #110 = Utf8               CACHE_SIZE_LIMIT
  #111 = Methodref          #112.#113     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #112 = Class              #114          // java/lang/Integer
  #113 = NameAndType        #115:#116     // valueOf:(I)Ljava/lang/Integer;
  #114 = Utf8               java/lang/Integer
  #115 = Utf8               valueOf
  #116 = Utf8               (I)Ljava/lang/Integer;
  #117 = Class              #118          // java/lang/Exception
  #118 = Utf8               java/lang/Exception
  #119 = String             #120          // Erro ao inicializar PathfinderCache
  #120 = Utf8               Erro ao inicializar PathfinderCache
  #121 = Methodref          #84.#122      // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #122 = NameAndType        #123:#124     // error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #123 = Utf8               error
  #124 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
  #125 = Methodref          #11.#126      // ext/mods/gameserver/geoengine/pathfinding/PathfinderCache.calculatePathDirectly:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Ljava/util/List;
  #126 = NameAndType        #127:#128     // calculatePathDirectly:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Ljava/util/List;
  #127 = Utf8               calculatePathDirectly
  #128 = Utf8               (Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Ljava/util/List;
  #129 = Methodref          #11.#130      // ext/mods/gameserver/geoengine/pathfinding/PathfinderCache.generateCacheKey:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;Z)Ljava/lang/String;
  #130 = NameAndType        #131:#132     // generateCacheKey:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;Z)Ljava/lang/String;
  #131 = Utf8               generateCacheKey
  #132 = Utf8               (Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;Z)Ljava/lang/String;
  #133 = InterfaceMethodref #134.#135     // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #134 = Class              #136          // java/util/Map
  #135 = NameAndType        #61:#137      // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #136 = Utf8               java/util/Map
  #137 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #138 = Class              #139          // java/util/List
  #139 = Utf8               java/util/List
  #140 = Methodref          #11.#141      // ext/mods/gameserver/geoengine/pathfinding/PathfinderCache.updateAccessOrder:(Ljava/lang/String;)V
  #141 = NameAndType        #142:#143     // updateAccessOrder:(Ljava/lang/String;)V
  #142 = Utf8               updateAccessOrder
  #143 = Utf8               (Ljava/lang/String;)V
  #144 = Class              #145          // java/util/ArrayList
  #145 = Utf8               java/util/ArrayList
  #146 = Methodref          #144.#147     // java/util/ArrayList."<init>":(Ljava/util/Collection;)V
  #147 = NameAndType        #5:#148       // "<init>":(Ljava/util/Collection;)V
  #148 = Utf8               (Ljava/util/Collection;)V
  #149 = Methodref          #11.#150      // ext/mods/gameserver/geoengine/pathfinding/PathfinderCache.loadPathFromFile:(Ljava/lang/String;)Ljava/util/List;
  #150 = NameAndType        #151:#152     // loadPathFromFile:(Ljava/lang/String;)Ljava/util/List;
  #151 = Utf8               loadPathFromFile
  #152 = Utf8               (Ljava/lang/String;)Ljava/util/List;
  #153 = Methodref          #11.#154      // ext/mods/gameserver/geoengine/pathfinding/PathfinderCache.addToMemoryCache:(Ljava/lang/String;Ljava/util/List;)V
  #154 = NameAndType        #155:#156     // addToMemoryCache:(Ljava/lang/String;Ljava/util/List;)V
  #155 = Utf8               addToMemoryCache
  #156 = Utf8               (Ljava/lang/String;Ljava/util/List;)V
  #157 = InterfaceMethodref #138.#158     // java/util/List.isEmpty:()Z
  #158 = NameAndType        #159:#160     // isEmpty:()Z
  #159 = Utf8               isEmpty
  #160 = Utf8               ()Z
  #161 = Methodref          #11.#162      // ext/mods/gameserver/geoengine/pathfinding/PathfinderCache.savePathToFile:(Ljava/lang/String;Ljava/util/List;)V
  #162 = NameAndType        #163:#156     // savePathToFile:(Ljava/lang/String;Ljava/util/List;)V
  #163 = Utf8               savePathToFile
  #164 = String             #165          // Iniciando pré-cálculo de rotas para {} waypoints
  #165 = Utf8               Iniciando pré-cálculo de rotas para {} waypoints
  #166 = InterfaceMethodref #138.#167     // java/util/List.size:()I
  #167 = NameAndType        #168:#169     // size:()I
  #168 = Utf8               size
  #169 = Utf8               ()I
  #170 = InterfaceMethodref #138.#171     // java/util/List.get:(I)Ljava/lang/Object;
  #171 = NameAndType        #61:#172      // get:(I)Ljava/lang/Object;
  #172 = Utf8               (I)Ljava/lang/Object;
  #173 = Class              #174          // ext/mods/gameserver/model/location/Location
  #174 = Utf8               ext/mods/gameserver/model/location/Location
  #175 = Methodref          #173.#176     // ext/mods/gameserver/model/location/Location.distance3D:(Lext/mods/gameserver/model/location/Location;)D
  #176 = NameAndType        #177:#178     // distance3D:(Lext/mods/gameserver/model/location/Location;)D
  #177 = Utf8               distance3D
  #178 = Utf8               (Lext/mods/gameserver/model/location/Location;)D
  #179 = InvokeDynamic      #0:#180       // #0:run:(Lext/mods/gameserver/geoengine/pathfinding/PathfinderCache;Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Ljava/lang/Runnable;
  #180 = NameAndType        #181:#182     // run:(Lext/mods/gameserver/geoengine/pathfinding/PathfinderCache;Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Ljava/lang/Runnable;
  #181 = Utf8               run
  #182 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/PathfinderCache;Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Ljava/lang/Runnable;
  #183 = InterfaceMethodref #184.#185     // java/util/concurrent/ExecutorService.submit:(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
  #184 = Class              #186          // java/util/concurrent/ExecutorService
  #185 = NameAndType        #187:#188     // submit:(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
  #186 = Utf8               java/util/concurrent/ExecutorService
  #187 = Utf8               submit
  #188 = Utf8               (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
  #189 = String             #190          // Submetidas {} rotas para pré-cálculo em background
  #190 = Utf8               Submetidas {} rotas para pré-cálculo em background
  #191 = String             #192          // %d_%d_%d_%d_%d_%d_%s
  #192 = Utf8               %d_%d_%d_%d_%d_%d_%s
  #193 = Methodref          #173.#194     // ext/mods/gameserver/model/location/Location.getX:()I
  #194 = NameAndType        #195:#169     // getX:()I
  #195 = Utf8               getX
  #196 = Methodref          #173.#197     // ext/mods/gameserver/model/location/Location.getY:()I
  #197 = NameAndType        #198:#169     // getY:()I
  #198 = Utf8               getY
  #199 = Methodref          #173.#200     // ext/mods/gameserver/model/location/Location.getZ:()I
  #200 = NameAndType        #201:#169     // getZ:()I
  #201 = Utf8               getZ
  #202 = String             #203          // opt
  #203 = Utf8               opt
  #204 = String             #205          // leg
  #205 = Utf8               leg
  #206 = Methodref          #55.#207      // java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #207 = NameAndType        #208:#209     // format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #208 = Utf8               format
  #209 = Utf8               (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #210 = Methodref          #211.#212     // ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
  #211 = Class              #213          // ext/mods/gameserver/geoengine/GeoEngine
  #212 = NameAndType        #214:#215     // getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
  #213 = Utf8               ext/mods/gameserver/geoengine/GeoEngine
  #214 = Utf8               getInstance
  #215 = Utf8               ()Lext/mods/gameserver/geoengine/GeoEngine;
  #216 = Methodref          #211.#217     // ext/mods/gameserver/geoengine/GeoEngine.findPath:(IIIIIIZLext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
  #217 = NameAndType        #218:#219     // findPath:(IIIIIIZLext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
  #218 = Utf8               findPath
  #219 = Utf8               (IIIIIIZLext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
  #220 = String             #221          // Erro ao calcular rota de {} para {}
  #221 = Utf8               Erro ao calcular rota de {} para {}
  #222 = Methodref          #84.#223      // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #223 = NameAndType        #224:#88      // warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #224 = Utf8               warn
  #225 = InterfaceMethodref #134.#167     // java/util/Map.size:()I
  #226 = InterfaceMethodref #227.#158     // java/util/Queue.isEmpty:()Z
  #227 = Class              #228          // java/util/Queue
  #228 = Utf8               java/util/Queue
  #229 = InterfaceMethodref #227.#230     // java/util/Queue.poll:()Ljava/lang/Object;
  #230 = NameAndType        #231:#232     // poll:()Ljava/lang/Object;
  #231 = Utf8               poll
  #232 = Utf8               ()Ljava/lang/Object;
  #233 = InterfaceMethodref #134.#234     // java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #234 = NameAndType        #235:#137     // remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #235 = Utf8               remove
  #236 = InterfaceMethodref #134.#237     // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #237 = NameAndType        #238:#239     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #238 = Utf8               put
  #239 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #240 = Methodref          #241.#242     // java/lang/System.currentTimeMillis:()J
  #241 = Class              #243          // java/lang/System
  #242 = NameAndType        #244:#245     // currentTimeMillis:()J
  #243 = Utf8               java/lang/System
  #244 = Utf8               currentTimeMillis
  #245 = Utf8               ()J
  #246 = Methodref          #247.#248     // java/lang/Long.valueOf:(J)Ljava/lang/Long;
  #247 = Class              #249          // java/lang/Long
  #248 = NameAndType        #115:#250     // valueOf:(J)Ljava/lang/Long;
  #249 = Utf8               java/lang/Long
  #250 = Utf8               (J)Ljava/lang/Long;
  #251 = InterfaceMethodref #227.#252     // java/util/Queue.remove:(Ljava/lang/Object;)Z
  #252 = NameAndType        #235:#253     // remove:(Ljava/lang/Object;)Z
  #253 = Utf8               (Ljava/lang/Object;)Z
  #254 = InterfaceMethodref #227.#255     // java/util/Queue.offer:(Ljava/lang/Object;)Z
  #255 = NameAndType        #256:#253     // offer:(Ljava/lang/Object;)Z
  #256 = Utf8               offer
  #257 = InvokeDynamic      #1:#258       // #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #258 = NameAndType        #259:#260     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #259 = Utf8               makeConcatWithConstants
  #260 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #261 = Fieldref           #11.#262      // ext/mods/gameserver/geoengine/pathfinding/PathfinderCache.COMPRESS_CACHE_FILES:Z
  #262 = NameAndType        #263:#42      // COMPRESS_CACHE_FILES:Z
  #263 = Utf8               COMPRESS_CACHE_FILES
  #264 = Class              #265          // java/io/FileOutputStream
  #265 = Utf8               java/io/FileOutputStream
  #266 = InterfaceMethodref #267.#268     // java/nio/file/Path.toFile:()Ljava/io/File;
  #267 = Class              #269          // java/nio/file/Path
  #268 = NameAndType        #270:#271     // toFile:()Ljava/io/File;
  #269 = Utf8               java/nio/file/Path
  #270 = Utf8               toFile
  #271 = Utf8               ()Ljava/io/File;
  #272 = Methodref          #264.#273     // java/io/FileOutputStream."<init>":(Ljava/io/File;)V
  #273 = NameAndType        #5:#274       // "<init>":(Ljava/io/File;)V
  #274 = Utf8               (Ljava/io/File;)V
  #275 = Class              #276          // java/util/zip/GZIPOutputStream
  #276 = Utf8               java/util/zip/GZIPOutputStream
  #277 = Methodref          #275.#278     // java/util/zip/GZIPOutputStream."<init>":(Ljava/io/OutputStream;)V
  #278 = NameAndType        #5:#279       // "<init>":(Ljava/io/OutputStream;)V
  #279 = Utf8               (Ljava/io/OutputStream;)V
  #280 = Class              #281          // java/io/ObjectOutputStream
  #281 = Utf8               java/io/ObjectOutputStream
  #282 = Methodref          #280.#278     // java/io/ObjectOutputStream."<init>":(Ljava/io/OutputStream;)V
  #283 = Methodref          #280.#284     // java/io/ObjectOutputStream.writeObject:(Ljava/lang/Object;)V
  #284 = NameAndType        #285:#286     // writeObject:(Ljava/lang/Object;)V
  #285 = Utf8               writeObject
  #286 = Utf8               (Ljava/lang/Object;)V
  #287 = Methodref          #280.#288     // java/io/ObjectOutputStream.close:()V
  #288 = NameAndType        #289:#6       // close:()V
  #289 = Utf8               close
  #290 = Class              #291          // java/lang/Throwable
  #291 = Utf8               java/lang/Throwable
  #292 = Methodref          #290.#293     // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
  #293 = NameAndType        #294:#295     // addSuppressed:(Ljava/lang/Throwable;)V
  #294 = Utf8               addSuppressed
  #295 = Utf8               (Ljava/lang/Throwable;)V
  #296 = Methodref          #275.#288     // java/util/zip/GZIPOutputStream.close:()V
  #297 = Methodref          #264.#288     // java/io/FileOutputStream.close:()V
  #298 = String             #299          // Erro ao salvar rota no arquivo: {}
  #299 = Utf8               Erro ao salvar rota no arquivo: {}
  #300 = Class              #301          // java/io/FileInputStream
  #301 = Utf8               java/io/FileInputStream
  #302 = Methodref          #300.#273     // java/io/FileInputStream."<init>":(Ljava/io/File;)V
  #303 = Class              #304          // java/util/zip/GZIPInputStream
  #304 = Utf8               java/util/zip/GZIPInputStream
  #305 = Methodref          #303.#306     // java/util/zip/GZIPInputStream."<init>":(Ljava/io/InputStream;)V
  #306 = NameAndType        #5:#307       // "<init>":(Ljava/io/InputStream;)V
  #307 = Utf8               (Ljava/io/InputStream;)V
  #308 = Class              #309          // java/io/ObjectInputStream
  #309 = Utf8               java/io/ObjectInputStream
  #310 = Methodref          #308.#306     // java/io/ObjectInputStream."<init>":(Ljava/io/InputStream;)V
  #311 = Methodref          #308.#312     // java/io/ObjectInputStream.readObject:()Ljava/lang/Object;
  #312 = NameAndType        #313:#232     // readObject:()Ljava/lang/Object;
  #313 = Utf8               readObject
  #314 = Methodref          #308.#288     // java/io/ObjectInputStream.close:()V
  #315 = Methodref          #303.#288     // java/util/zip/GZIPInputStream.close:()V
  #316 = Methodref          #300.#288     // java/io/FileInputStream.close:()V
  #317 = String             #318          // Erro ao carregar rota do arquivo: {}
  #318 = Utf8               Erro ao carregar rota do arquivo: {}
  #319 = String             #320          // *.path
  #320 = Utf8               *.path
  #321 = Methodref          #66.#322      // java/nio/file/Files.newDirectoryStream:(Ljava/nio/file/Path;Ljava/lang/String;)Ljava/nio/file/DirectoryStream;
  #322 = NameAndType        #323:#324     // newDirectoryStream:(Ljava/nio/file/Path;Ljava/lang/String;)Ljava/nio/file/DirectoryStream;
  #323 = Utf8               newDirectoryStream
  #324 = Utf8               (Ljava/nio/file/Path;Ljava/lang/String;)Ljava/nio/file/DirectoryStream;
  #325 = InterfaceMethodref #326.#327     // java/nio/file/DirectoryStream.iterator:()Ljava/util/Iterator;
  #326 = Class              #328          // java/nio/file/DirectoryStream
  #327 = NameAndType        #329:#330     // iterator:()Ljava/util/Iterator;
  #328 = Utf8               java/nio/file/DirectoryStream
  #329 = Utf8               iterator
  #330 = Utf8               ()Ljava/util/Iterator;
  #331 = InterfaceMethodref #332.#333     // java/util/Iterator.hasNext:()Z
  #332 = Class              #334          // java/util/Iterator
  #333 = NameAndType        #335:#160     // hasNext:()Z
  #334 = Utf8               java/util/Iterator
  #335 = Utf8               hasNext
  #336 = InterfaceMethodref #332.#337     // java/util/Iterator.next:()Ljava/lang/Object;
  #337 = NameAndType        #338:#232     // next:()Ljava/lang/Object;
  #338 = Utf8               next
  #339 = InterfaceMethodref #267.#340     // java/nio/file/Path.getFileName:()Ljava/nio/file/Path;
  #340 = NameAndType        #341:#342     // getFileName:()Ljava/nio/file/Path;
  #341 = Utf8               getFileName
  #342 = Utf8               ()Ljava/nio/file/Path;
  #343 = InterfaceMethodref #267.#344     // java/nio/file/Path.toString:()Ljava/lang/String;
  #344 = NameAndType        #345:#346     // toString:()Ljava/lang/String;
  #345 = Utf8               toString
  #346 = Utf8               ()Ljava/lang/String;
  #347 = Methodref          #55.#348      // java/lang/String.lastIndexOf:(I)I
  #348 = NameAndType        #349:#350     // lastIndexOf:(I)I
  #349 = Utf8               lastIndexOf
  #350 = Utf8               (I)I
  #351 = Methodref          #55.#352      // java/lang/String.substring:(II)Ljava/lang/String;
  #352 = NameAndType        #353:#354     // substring:(II)Ljava/lang/String;
  #353 = Utf8               substring
  #354 = Utf8               (II)Ljava/lang/String;
  #355 = InterfaceMethodref #326.#288     // java/nio/file/DirectoryStream.close:()V
  #356 = String             #357          // Carregadas {} rotas do cache de arquivos
  #357 = Utf8               Carregadas {} rotas do cache de arquivos
  #358 = String             #359          // Erro ao carregar cache de arquivos
  #359 = Utf8               Erro ao carregar cache de arquivos
  #360 = String             #361          // Salvando cache completo para arquivos...
  #361 = Utf8               Salvando cache completo para arquivos...
  #362 = Methodref          #84.#363      // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
  #363 = NameAndType        #87:#286      // info:(Ljava/lang/Object;)V
  #364 = InterfaceMethodref #134.#365     // java/util/Map.entrySet:()Ljava/util/Set;
  #365 = NameAndType        #366:#367     // entrySet:()Ljava/util/Set;
  #366 = Utf8               entrySet
  #367 = Utf8               ()Ljava/util/Set;
  #368 = InterfaceMethodref #369.#327     // java/util/Set.iterator:()Ljava/util/Iterator;
  #369 = Class              #370          // java/util/Set
  #370 = Utf8               java/util/Set
  #371 = Class              #372          // java/util/Map$Entry
  #372 = Utf8               java/util/Map$Entry
  #373 = InterfaceMethodref #371.#374     // java/util/Map$Entry.getKey:()Ljava/lang/Object;
  #374 = NameAndType        #375:#232     // getKey:()Ljava/lang/Object;
  #375 = Utf8               getKey
  #376 = InterfaceMethodref #371.#377     // java/util/Map$Entry.getValue:()Ljava/lang/Object;
  #377 = NameAndType        #378:#232     // getValue:()Ljava/lang/Object;
  #378 = Utf8               getValue
  #379 = String             #380          // Salvas {} rotas no cache de arquivos
  #380 = Utf8               Salvas {} rotas no cache de arquivos
  #381 = InterfaceMethodref #134.#382     // java/util/Map.clear:()V
  #382 = NameAndType        #383:#6       // clear:()V
  #383 = Utf8               clear
  #384 = InterfaceMethodref #227.#382     // java/util/Queue.clear:()V
  #385 = String             #386          // Cache em memória limpo
  #386 = Utf8               Cache em memória limpo
  #387 = Long               24l
  #389 = Long               60l
  #391 = Long               1000l
  #393 = Methodref          #66.#394      // java/nio/file/Files.getLastModifiedTime:(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/FileTime;
  #394 = NameAndType        #395:#396     // getLastModifiedTime:(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/FileTime;
  #395 = Utf8               getLastModifiedTime
  #396 = Utf8               (Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/FileTime;
  #397 = Methodref          #398.#399     // java/nio/file/attribute/FileTime.toMillis:()J
  #398 = Class              #400          // java/nio/file/attribute/FileTime
  #399 = NameAndType        #401:#245     // toMillis:()J
  #400 = Utf8               java/nio/file/attribute/FileTime
  #401 = Utf8               toMillis
  #402 = Methodref          #66.#403      // java/nio/file/Files.delete:(Ljava/nio/file/Path;)V
  #403 = NameAndType        #404:#405     // delete:(Ljava/nio/file/Path;)V
  #404 = Utf8               delete
  #405 = Utf8               (Ljava/nio/file/Path;)V
  #406 = String             #407          // Removidos {} arquivos de cache antigos
  #407 = Utf8               Removidos {} arquivos de cache antigos
  #408 = String             #409          // Erro ao limpar arquivos de cache antigos
  #409 = Utf8               Erro ao limpar arquivos de cache antigos
  #410 = Class              #411          // ext/mods/gameserver/geoengine/pathfinding/PathfinderCache$CacheStatistics
  #411 = Utf8               ext/mods/gameserver/geoengine/pathfinding/PathfinderCache$CacheStatistics
  #412 = Methodref          #410.#413     // ext/mods/gameserver/geoengine/pathfinding/PathfinderCache$CacheStatistics."<init>":(JJJJII)V
  #413 = NameAndType        #5:#414       // "<init>":(JJJJII)V
  #414 = Utf8               (JJJJII)V
  #415 = InterfaceMethodref #184.#416     // java/util/concurrent/ExecutorService.shutdown:()V
  #416 = NameAndType        #417:#6       // shutdown:()V
  #417 = Utf8               shutdown
  #418 = Long               30l
  #420 = Fieldref           #421.#422     // java/util/concurrent/TimeUnit.SECONDS:Ljava/util/concurrent/TimeUnit;
  #421 = Class              #423          // java/util/concurrent/TimeUnit
  #422 = NameAndType        #424:#425     // SECONDS:Ljava/util/concurrent/TimeUnit;
  #423 = Utf8               java/util/concurrent/TimeUnit
  #424 = Utf8               SECONDS
  #425 = Utf8               Ljava/util/concurrent/TimeUnit;
  #426 = InterfaceMethodref #184.#427     // java/util/concurrent/ExecutorService.awaitTermination:(JLjava/util/concurrent/TimeUnit;)Z
  #427 = NameAndType        #428:#429     // awaitTermination:(JLjava/util/concurrent/TimeUnit;)Z
  #428 = Utf8               awaitTermination
  #429 = Utf8               (JLjava/util/concurrent/TimeUnit;)Z
  #430 = InterfaceMethodref #184.#431     // java/util/concurrent/ExecutorService.shutdownNow:()Ljava/util/List;
  #431 = NameAndType        #432:#433     // shutdownNow:()Ljava/util/List;
  #432 = Utf8               shutdownNow
  #433 = Utf8               ()Ljava/util/List;
  #434 = Class              #435          // java/lang/InterruptedException
  #435 = Utf8               java/lang/InterruptedException
  #436 = Methodref          #437.#438     // java/lang/Thread.currentThread:()Ljava/lang/Thread;
  #437 = Class              #439          // java/lang/Thread
  #438 = NameAndType        #440:#441     // currentThread:()Ljava/lang/Thread;
  #439 = Utf8               java/lang/Thread
  #440 = Utf8               currentThread
  #441 = Utf8               ()Ljava/lang/Thread;
  #442 = Methodref          #437.#443     // java/lang/Thread.interrupt:()V
  #443 = NameAndType        #444:#6       // interrupt:()V
  #444 = Utf8               interrupt
  #445 = Methodref          #11.#446      // ext/mods/gameserver/geoengine/pathfinding/PathfinderCache.saveAllCacheToFiles:()V
  #446 = NameAndType        #447:#6       // saveAllCacheToFiles:()V
  #447 = Utf8               saveAllCacheToFiles
  #448 = String             #449          // PathfinderCache finalizado
  #449 = Utf8               PathfinderCache finalizado
  #450 = Methodref          #11.#451      // ext/mods/gameserver/geoengine/pathfinding/PathfinderCache.getPath:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;Z)Ljava/util/List;
  #451 = NameAndType        #452:#453     // getPath:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;Z)Ljava/util/List;
  #452 = Utf8               getPath
  #453 = Utf8               (Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;Z)Ljava/util/List;
  #454 = Methodref          #455.#456     // java/lang/Class.getName:()Ljava/lang/String;
  #455 = Class              #457          // java/lang/Class
  #456 = NameAndType        #458:#346     // getName:()Ljava/lang/String;
  #457 = Utf8               java/lang/Class
  #458 = Utf8               getName
  #459 = Methodref          #84.#460      // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #460 = NameAndType        #5:#143       // "<init>":(Ljava/lang/String;)V
  #461 = Fieldref           #462.#463     // ext/mods/Config.GEOENGINE_FILE:Ljava/lang/String;
  #462 = Class              #464          // ext/mods/Config
  #463 = NameAndType        #465:#54      // GEOENGINE_FILE:Ljava/lang/String;
  #464 = Utf8               ext/mods/Config
  #465 = Utf8               GEOENGINE_FILE
  #466 = Methodref          #462.#467     // ext/mods/Config.initProperties:(Ljava/lang/String;)Lext/mods/commons/config/ExProperties;
  #467 = NameAndType        #468:#469     // initProperties:(Ljava/lang/String;)Lext/mods/commons/config/ExProperties;
  #468 = Utf8               initProperties
  #469 = Utf8               (Ljava/lang/String;)Lext/mods/commons/config/ExProperties;
  #470 = Fieldref           #11.#471      // ext/mods/gameserver/geoengine/pathfinding/PathfinderCache.GEOENGINE_PROPS:Lext/mods/commons/config/ExProperties;
  #471 = NameAndType        #472:#473     // GEOENGINE_PROPS:Lext/mods/commons/config/ExProperties;
  #472 = Utf8               GEOENGINE_PROPS
  #473 = Utf8               Lext/mods/commons/config/ExProperties;
  #474 = String             #475          // EnablePathfinderCache
  #475 = Utf8               EnablePathfinderCache
  #476 = Methodref          #477.#478     // ext/mods/commons/config/ExProperties.getProperty:(Ljava/lang/String;Z)Z
  #477 = Class              #479          // ext/mods/commons/config/ExProperties
  #478 = NameAndType        #480:#481     // getProperty:(Ljava/lang/String;Z)Z
  #479 = Utf8               ext/mods/commons/config/ExProperties
  #480 = Utf8               getProperty
  #481 = Utf8               (Ljava/lang/String;Z)Z
  #482 = String             #483          // PathfinderCacheSize
  #483 = Utf8               PathfinderCacheSize
  #484 = Methodref          #477.#485     // ext/mods/commons/config/ExProperties.getProperty:(Ljava/lang/String;I)I
  #485 = NameAndType        #480:#486     // getProperty:(Ljava/lang/String;I)I
  #486 = Utf8               (Ljava/lang/String;I)I
  #487 = String             #488          // PathfinderCacheDirectory
  #488 = Utf8               PathfinderCacheDirectory
  #489 = String             #490          // ./data/pathfinder_cache/
  #490 = Utf8               ./data/pathfinder_cache/
  #491 = Methodref          #477.#492     // ext/mods/commons/config/ExProperties.getProperty:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #492 = NameAndType        #480:#493     // getProperty:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #493 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #494 = String             #495          // CompressCacheFiles
  #495 = Utf8               CompressCacheFiles
  #496 = String             #497          // PathfinderGenerationThreads
  #497 = Utf8               PathfinderGenerationThreads
  #498 = Utf8               Signature
  #499 = Utf8               Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;>;
  #500 = Utf8               Ljava/util/Map<Ljava/lang/String;Ljava/lang/Long;>;
  #501 = Utf8               Ljava/util/Queue<Ljava/lang/String;>;
  #502 = Utf8               Code
  #503 = Utf8               LineNumberTable
  #504 = Utf8               LocalVariableTable
  #505 = Utf8               this
  #506 = Utf8               StackMapTable
  #507 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/PathfinderCache;
  #508 = Utf8               cacheDir
  #509 = Utf8               Ljava/nio/file/Path;
  #510 = Utf8               e
  #511 = Utf8               Ljava/lang/Exception;
  #512 = Utf8               from
  #513 = Utf8               Lext/mods/gameserver/model/location/Location;
  #514 = Utf8               to
  #515 = Utf8               useOptimized
  #516 = Utf8               cacheKey
  #517 = Utf8               cachedPath
  #518 = Utf8               Ljava/util/List;
  #519 = Utf8               filePath
  #520 = Utf8               newPath
  #521 = Utf8               LocalVariableTypeTable
  #522 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
  #523 = Utf8               (Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;Z)Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
  #524 = Utf8               preCalculatePaths
  #525 = Utf8               (Ljava/util/List;I)V
  #526 = Utf8               j
  #527 = Utf8               i
  #528 = Utf8               waypoints
  #529 = Utf8               maxDistance
  #530 = Utf8               totalPaths
  #531 = Utf8               (Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;I)V
  #532 = Class              #533          // "[Ljava/lang/Object;"
  #533 = Utf8               [Ljava/lang/Object;
  #534 = Utf8               (Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
  #535 = Utf8               oldestKey
  #536 = Utf8               path
  #537 = Utf8               (Ljava/lang/String;Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;)V
  #538 = Utf8               oos
  #539 = Utf8               Ljava/io/ObjectOutputStream;
  #540 = Utf8               gzos
  #541 = Utf8               Ljava/util/zip/GZIPOutputStream;
  #542 = Utf8               fos
  #543 = Utf8               Ljava/io/FileOutputStream;
  #544 = Utf8               ois
  #545 = Utf8               Ljava/io/ObjectInputStream;
  #546 = Utf8               gzis
  #547 = Utf8               Ljava/util/zip/GZIPInputStream;
  #548 = Utf8               fis
  #549 = Utf8               Ljava/io/FileInputStream;
  #550 = Utf8               (Ljava/lang/String;)Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
  #551 = Utf8               fileName
  #552 = Utf8               stream
  #553 = Utf8               Ljava/nio/file/DirectoryStream;
  #554 = Utf8               loadedCount
  #555 = Utf8               Ljava/nio/file/DirectoryStream<Ljava/nio/file/Path;>;
  #556 = Utf8               entry
  #557 = Utf8               Ljava/util/Map$Entry;
  #558 = Utf8               savedCount
  #559 = Utf8               Ljava/util/Map$Entry<Ljava/lang/String;Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;>;
  #560 = Utf8               clearMemoryCache
  #561 = Utf8               cleanupOldCacheFiles
  #562 = Utf8               (I)V
  #563 = Utf8               fileAge
  #564 = Utf8               maxAgeMillis
  #565 = Utf8               currentTime
  #566 = Utf8               removedCount
  #567 = Utf8               maxAgeDays
  #568 = Utf8               getStatistics
  #569 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/PathfinderCache$CacheStatistics;
  #570 = Utf8               Ljava/lang/InterruptedException;
  #571 = Utf8               lambda$preCalculatePaths$0
  #572 = Utf8               (Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)V
  #573 = Utf8               <clinit>
  #574 = Utf8               SourceFile
  #575 = Utf8               PathfinderCache.java
  #576 = Utf8               NestMembers
  #577 = Utf8               BootstrapMethods
  #578 = MethodType         #6            //  ()V
  #579 = MethodHandle       5:#580        // REF_invokeVirtual ext/mods/gameserver/geoengine/pathfinding/PathfinderCache.lambda$preCalculatePaths$0:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)V
  #580 = Methodref          #11.#581      // ext/mods/gameserver/geoengine/pathfinding/PathfinderCache.lambda$preCalculatePaths$0:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)V
  #581 = NameAndType        #571:#572     // lambda$preCalculatePaths$0:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)V
  #582 = String             #583          // \u0001.path
  #583 = Utf8               \u0001.path
  #584 = MethodHandle       6:#585        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #585 = Methodref          #586.#587     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #586 = Class              #588          // java/lang/invoke/LambdaMetafactory
  #587 = NameAndType        #589:#590     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #588 = Utf8               java/lang/invoke/LambdaMetafactory
  #589 = Utf8               metafactory
  #590 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #591 = MethodHandle       6:#592        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #592 = Methodref          #593.#594     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #593 = Class              #595          // java/lang/invoke/StringConcatFactory
  #594 = NameAndType        #259:#596     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #595 = Utf8               java/lang/invoke/StringConcatFactory
  #596 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #597 = Utf8               InnerClasses
  #598 = Utf8               Entry
  #599 = Utf8               CacheStatistics
  #600 = Class              #601          // java/lang/invoke/MethodHandles$Lookup
  #601 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #602 = Class              #603          // java/lang/invoke/MethodHandles
  #603 = Utf8               java/lang/invoke/MethodHandles
  #604 = Utf8               Lookup
{
  public static ext.mods.gameserver.geoengine.pathfinding.PathfinderCache getInstance();
    descriptor: ()Lext/mods/gameserver/geoengine/pathfinding/PathfinderCache;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=2, args_size=0
         0: getstatic     #46                 // Field _instance:Lext/mods/gameserver/geoengine/pathfinding/PathfinderCache;
         3: ifnonnull     37
         6: ldc           #11                 // class ext/mods/gameserver/geoengine/pathfinding/PathfinderCache
         8: dup
         9: astore_0
        10: monitorenter
        11: getstatic     #46                 // Field _instance:Lext/mods/gameserver/geoengine/pathfinding/PathfinderCache;
        14: ifnonnull     27
        17: new           #11                 // class ext/mods/gameserver/geoengine/pathfinding/PathfinderCache
        20: dup
        21: invokespecial #50                 // Method "<init>":()V
        24: putstatic     #46                 // Field _instance:Lext/mods/gameserver/geoengine/pathfinding/PathfinderCache;
        27: aload_0
        28: monitorexit
        29: goto          37
        32: astore_1
        33: aload_0
        34: monitorexit
        35: aload_1
        36: athrow
        37: getstatic     #46                 // Field _instance:Lext/mods/gameserver/geoengine/pathfinding/PathfinderCache;
        40: areturn
      Exception table:
         from    to  target type
            11    29    32   any
            32    35    32   any
      LineNumberTable:
        line 74: 0
        line 75: 6
        line 76: 11
        line 77: 17
        line 79: 27
        line 81: 37
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 27
          locals = [ class java/lang/Object ]
        frame_type = 68 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 250 /* chop */
          offset_delta = 4

  public java.util.List<ext.mods.gameserver.model.location.Location> getPath(ext.mods.gameserver.model.location.Location, ext.mods.gameserver.model.location.Location, boolean);
    descriptor: (Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;Z)Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=8, args_size=4
         0: getstatic     #39                 // Field ENABLE_PATHFINDER_CACHE:Z
         3: ifne          13
         6: aload_0
         7: aload_1
         8: aload_2
         9: invokevirtual #125                // Method calculatePathDirectly:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Ljava/util/List;
        12: areturn
        13: aload_0
        14: aload_1
        15: aload_2
        16: iconst_0
        17: invokevirtual #129                // Method generateCacheKey:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;Z)Ljava/lang/String;
        20: astore        4
        22: aload_0
        23: getfield      #10                 // Field _pathCache:Ljava/util/Map;
        26: aload         4
        28: invokeinterface #133,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        33: checkcast     #138                // class java/util/List
        36: astore        5
        38: aload         5
        40: ifnull        69
        43: aload_0
        44: dup
        45: getfield      #26                 // Field _cacheHits:J
        48: lconst_1
        49: ladd
        50: putfield      #26                 // Field _cacheHits:J
        53: aload_0
        54: aload         4
        56: invokevirtual #140                // Method updateAccessOrder:(Ljava/lang/String;)V
        59: new           #144                // class java/util/ArrayList
        62: dup
        63: aload         5
        65: invokespecial #146                // Method java/util/ArrayList."<init>":(Ljava/util/Collection;)V
        68: areturn
        69: aload_0
        70: dup
        71: getfield      #30                 // Field _cacheMisses:J
        74: lconst_1
        75: ladd
        76: putfield      #30                 // Field _cacheMisses:J
        79: aload_0
        80: aload         4
        82: invokevirtual #149                // Method loadPathFromFile:(Ljava/lang/String;)Ljava/util/List;
        85: astore        6
        87: aload         6
        89: ifnull        120
        92: aload_0
        93: dup
        94: getfield      #36                 // Field _pathsLoaded:J
        97: lconst_1
        98: ladd
        99: putfield      #36                 // Field _pathsLoaded:J
       102: aload_0
       103: aload         4
       105: aload         6
       107: invokevirtual #153                // Method addToMemoryCache:(Ljava/lang/String;Ljava/util/List;)V
       110: new           #144                // class java/util/ArrayList
       113: dup
       114: aload         6
       116: invokespecial #146                // Method java/util/ArrayList."<init>":(Ljava/util/Collection;)V
       119: areturn
       120: aload_0
       121: aload_1
       122: aload_2
       123: invokevirtual #125                // Method calculatePathDirectly:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Ljava/util/List;
       126: astore        7
       128: aload         7
       130: ifnull        179
       133: aload         7
       135: invokeinterface #157,  1          // InterfaceMethod java/util/List.isEmpty:()Z
       140: ifne          179
       143: aload_0
       144: dup
       145: getfield      #33                 // Field _pathsGenerated:J
       148: lconst_1
       149: ladd
       150: putfield      #33                 // Field _pathsGenerated:J
       153: aload_0
       154: aload         4
       156: aload         7
       158: invokevirtual #153                // Method addToMemoryCache:(Ljava/lang/String;Ljava/util/List;)V
       161: aload_0
       162: aload         4
       164: aload         7
       166: invokevirtual #161                // Method savePathToFile:(Ljava/lang/String;Ljava/util/List;)V
       169: new           #144                // class java/util/ArrayList
       172: dup
       173: aload         7
       175: invokespecial #146                // Method java/util/ArrayList."<init>":(Ljava/util/Collection;)V
       178: areturn
       179: aconst_null
       180: areturn
      LineNumberTable:
        line 116: 0
        line 117: 6
        line 120: 13
        line 122: 22
        line 123: 38
        line 124: 43
        line 125: 53
        line 126: 59
        line 129: 69
        line 131: 79
        line 132: 87
        line 133: 92
        line 134: 102
        line 135: 110
        line 138: 120
        line 139: 128
        line 140: 143
        line 142: 153
        line 143: 161
        line 145: 169
        line 148: 179
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     181     0  this   Lext/mods/gameserver/geoengine/pathfinding/PathfinderCache;
            0     181     1  from   Lext/mods/gameserver/model/location/Location;
            0     181     2    to   Lext/mods/gameserver/model/location/Location;
            0     181     3 useOptimized   Z
           22     159     4 cacheKey   Ljava/lang/String;
           38     143     5 cachedPath   Ljava/util/List;
           87      94     6 filePath   Ljava/util/List;
          128      53     7 newPath   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           38     143     5 cachedPath   Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
           87      94     6 filePath   Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
          128      53     7 newPath   Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
      StackMapTable: number_of_entries = 4
        frame_type = 13 /* same */
        frame_type = 253 /* append */
          offset_delta = 55
          locals = [ class java/lang/String, class java/util/List ]
        frame_type = 252 /* append */
          offset_delta = 50
          locals = [ class java/util/List ]
        frame_type = 252 /* append */
          offset_delta = 58
          locals = [ class java/util/List ]
    Signature: #523                         // (Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;Z)Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;

  public void preCalculatePaths(java.util.List<ext.mods.gameserver.model.location.Location>, int);
    descriptor: (Ljava/util/List;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=8, args_size=3
         0: getstatic     #39                 // Field ENABLE_PATHFINDER_CACHE:Z
         3: ifeq          13
         6: aload_0
         7: getfield      #99                 // Field _generationExecutor:Ljava/util/concurrent/ExecutorService;
        10: ifnonnull     14
        13: return
        14: getstatic     #77                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        17: ldc           #164                // String Iniciando pré-cálculo de rotas para {} waypoints
        19: iconst_1
        20: anewarray     #2                  // class java/lang/Object
        23: dup
        24: iconst_0
        25: aload_1
        26: invokeinterface #166,  1          // InterfaceMethod java/util/List.size:()I
        31: invokestatic  #111                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        34: aastore
        35: invokevirtual #83                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
        38: iconst_0
        39: istore_3
        40: iconst_0
        41: istore        4
        43: iload         4
        45: aload_1
        46: invokeinterface #166,  1          // InterfaceMethod java/util/List.size:()I
        51: if_icmpge     145
        54: iload         4
        56: iconst_1
        57: iadd
        58: istore        5
        60: iload         5
        62: aload_1
        63: invokeinterface #166,  1          // InterfaceMethod java/util/List.size:()I
        68: if_icmpge     139
        71: aload_1
        72: iload         4
        74: invokeinterface #170,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
        79: checkcast     #173                // class ext/mods/gameserver/model/location/Location
        82: astore        6
        84: aload_1
        85: iload         5
        87: invokeinterface #170,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
        92: checkcast     #173                // class ext/mods/gameserver/model/location/Location
        95: astore        7
        97: aload         6
        99: aload         7
       101: invokevirtual #175                // Method ext/mods/gameserver/model/location/Location.distance3D:(Lext/mods/gameserver/model/location/Location;)D
       104: iload_2
       105: i2d
       106: dcmpg
       107: ifgt          133
       110: iinc          3, 1
       113: aload_0
       114: getfield      #99                 // Field _generationExecutor:Ljava/util/concurrent/ExecutorService;
       117: aload_0
       118: aload         6
       120: aload         7
       122: invokedynamic #179,  0            // InvokeDynamic #0:run:(Lext/mods/gameserver/geoengine/pathfinding/PathfinderCache;Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Ljava/lang/Runnable;
       127: invokeinterface #183,  2          // InterfaceMethod java/util/concurrent/ExecutorService.submit:(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
       132: pop
       133: iinc          5, 1
       136: goto          60
       139: iinc          4, 1
       142: goto          43
       145: getstatic     #77                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       148: ldc           #189                // String Submetidas {} rotas para pré-cálculo em background
       150: iconst_1
       151: anewarray     #2                  // class java/lang/Object
       154: dup
       155: iconst_0
       156: iload_3
       157: invokestatic  #111                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       160: aastore
       161: invokevirtual #83                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
       164: return
      LineNumberTable:
        line 158: 0
        line 159: 13
        line 162: 14
        line 164: 38
        line 165: 40
        line 166: 54
        line 167: 71
        line 168: 84
        line 170: 97
        line 171: 110
        line 173: 113
        line 166: 133
        line 165: 139
        line 184: 145
        line 185: 164
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           84      49     6  from   Lext/mods/gameserver/model/location/Location;
           97      36     7    to   Lext/mods/gameserver/model/location/Location;
           60      79     5     j   I
           43     102     4     i   I
            0     165     0  this   Lext/mods/gameserver/geoengine/pathfinding/PathfinderCache;
            0     165     1 waypoints   Ljava/util/List;
            0     165     2 maxDistance   I
           40     125     3 totalPaths   I
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0     165     1 waypoints   Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
      StackMapTable: number_of_entries = 7
        frame_type = 13 /* same */
        frame_type = 0 /* same */
        frame_type = 253 /* append */
          offset_delta = 28
          locals = [ int, int ]
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ int ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 72
        frame_type = 250 /* chop */
          offset_delta = 5
        frame_type = 250 /* chop */
          offset_delta = 5
    Signature: #531                         // (Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;I)V

  public void saveAllCacheToFiles();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=4, args_size=1
         0: getstatic     #39                 // Field ENABLE_PATHFINDER_CACHE:Z
         3: ifne          7
         6: return
         7: getstatic     #77                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        10: ldc_w         #360                // String Salvando cache completo para arquivos...
        13: invokevirtual #362                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
        16: iconst_0
        17: istore_1
        18: aload_0
        19: getfield      #10                 // Field _pathCache:Ljava/util/Map;
        22: invokeinterface #364,  1          // InterfaceMethod java/util/Map.entrySet:()Ljava/util/Set;
        27: invokeinterface #368,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
        32: astore_2
        33: aload_2
        34: invokeinterface #331,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        39: ifeq          80
        42: aload_2
        43: invokeinterface #336,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        48: checkcast     #371                // class java/util/Map$Entry
        51: astore_3
        52: aload_0
        53: aload_3
        54: invokeinterface #373,  1          // InterfaceMethod java/util/Map$Entry.getKey:()Ljava/lang/Object;
        59: checkcast     #55                 // class java/lang/String
        62: aload_3
        63: invokeinterface #376,  1          // InterfaceMethod java/util/Map$Entry.getValue:()Ljava/lang/Object;
        68: checkcast     #138                // class java/util/List
        71: invokevirtual #161                // Method savePathToFile:(Ljava/lang/String;Ljava/util/List;)V
        74: iinc          1, 1
        77: goto          33
        80: getstatic     #77                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        83: ldc_w         #379                // String Salvas {} rotas no cache de arquivos
        86: iconst_1
        87: anewarray     #2                  // class java/lang/Object
        90: dup
        91: iconst_0
        92: iload_1
        93: invokestatic  #111                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        96: aastore
        97: invokevirtual #83                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
       100: return
      LineNumberTable:
        line 333: 0
        line 334: 6
        line 337: 7
        line 339: 16
        line 340: 18
        line 341: 52
        line 342: 74
        line 343: 77
        line 345: 80
        line 346: 100
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           52      25     3 entry   Ljava/util/Map$Entry;
            0     101     0  this   Lext/mods/gameserver/geoengine/pathfinding/PathfinderCache;
           18      83     1 savedCount   I
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           52      25     3 entry   Ljava/util/Map$Entry<Ljava/lang/String;Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;>;
      StackMapTable: number_of_entries = 3
        frame_type = 7 /* same */
        frame_type = 253 /* append */
          offset_delta = 25
          locals = [ int, class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 46

  public void clearMemoryCache();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _pathCache:Ljava/util/Map;
         4: dup
         5: astore_1
         6: monitorenter
         7: aload_0
         8: getfield      #10                 // Field _pathCache:Ljava/util/Map;
        11: invokeinterface #381,  1          // InterfaceMethod java/util/Map.clear:()V
        16: aload_0
        17: getfield      #16                 // Field _cacheTimestamps:Ljava/util/Map;
        20: invokeinterface #381,  1          // InterfaceMethod java/util/Map.clear:()V
        25: aload_0
        26: getfield      #22                 // Field _cacheAccessOrder:Ljava/util/Queue;
        29: invokeinterface #384,  1          // InterfaceMethod java/util/Queue.clear:()V
        34: aload_1
        35: monitorexit
        36: goto          44
        39: astore_2
        40: aload_1
        41: monitorexit
        42: aload_2
        43: athrow
        44: getstatic     #77                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        47: ldc_w         #385                // String Cache em memória limpo
        50: invokevirtual #362                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
        53: return
      Exception table:
         from    to  target type
             7    36    39   any
            39    42    39   any
      LineNumberTable:
        line 352: 0
        line 353: 7
        line 354: 16
        line 355: 25
        line 356: 34
        line 358: 44
        line 359: 53
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      54     0  this   Lext/mods/gameserver/geoengine/pathfinding/PathfinderCache;
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 39
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/PathfinderCache, class java/lang/Object ]
          stack = [ class java/lang/Throwable ]
        frame_type = 250 /* chop */
          offset_delta = 4

  public void cleanupOldCacheFiles(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=13, args_size=2
         0: getstatic     #51                 // Field CACHE_DIRECTORY:Ljava/lang/String;
         3: iconst_0
         4: anewarray     #55                 // class java/lang/String
         7: invokestatic  #57                 // Method java/nio/file/Paths.get:(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
        10: astore_2
        11: aload_2
        12: iconst_0
        13: anewarray     #63                 // class java/nio/file/LinkOption
        16: invokestatic  #65                 // Method java/nio/file/Files.exists:(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
        19: ifne          23
        22: return
        23: iload_1
        24: i2l
        25: ldc2_w        #387                // long 24l
        28: lmul
        29: ldc2_w        #389                // long 60l
        32: lmul
        33: ldc2_w        #389                // long 60l
        36: lmul
        37: ldc2_w        #391                // long 1000l
        40: lmul
        41: lstore_3
        42: invokestatic  #240                // Method java/lang/System.currentTimeMillis:()J
        45: lstore        5
        47: iconst_0
        48: istore        7
        50: aload_2
        51: ldc_w         #319                // String *.path
        54: invokestatic  #321                // Method java/nio/file/Files.newDirectoryStream:(Ljava/nio/file/Path;Ljava/lang/String;)Ljava/nio/file/DirectoryStream;
        57: astore        8
        59: aload         8
        61: invokeinterface #325,  1          // InterfaceMethod java/nio/file/DirectoryStream.iterator:()Ljava/util/Iterator;
        66: astore        9
        68: aload         9
        70: invokeinterface #331,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        75: ifeq          125
        78: aload         9
        80: invokeinterface #336,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        85: checkcast     #267                // class java/nio/file/Path
        88: astore        10
        90: lload         5
        92: aload         10
        94: iconst_0
        95: anewarray     #63                 // class java/nio/file/LinkOption
        98: invokestatic  #393                // Method java/nio/file/Files.getLastModifiedTime:(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/FileTime;
       101: invokevirtual #397                // Method java/nio/file/attribute/FileTime.toMillis:()J
       104: lsub
       105: lstore        11
       107: lload         11
       109: lload_3
       110: lcmp
       111: ifle          122
       114: aload         10
       116: invokestatic  #402                // Method java/nio/file/Files.delete:(Ljava/nio/file/Path;)V
       119: iinc          7, 1
       122: goto          68
       125: aload         8
       127: ifnull        169
       130: aload         8
       132: invokeinterface #355,  1          // InterfaceMethod java/nio/file/DirectoryStream.close:()V
       137: goto          169
       140: astore        9
       142: aload         8
       144: ifnull        166
       147: aload         8
       149: invokeinterface #355,  1          // InterfaceMethod java/nio/file/DirectoryStream.close:()V
       154: goto          166
       157: astore        10
       159: aload         9
       161: aload         10
       163: invokevirtual #292                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       166: aload         9
       168: athrow
       169: getstatic     #77                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       172: ldc_w         #406                // String Removidos {} arquivos de cache antigos
       175: iconst_1
       176: anewarray     #2                  // class java/lang/Object
       179: dup
       180: iconst_0
       181: iload         7
       183: invokestatic  #111                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       186: aastore
       187: invokevirtual #83                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
       190: goto          204
       193: astore_2
       194: getstatic     #77                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       197: ldc_w         #408                // String Erro ao limpar arquivos de cache antigos
       200: aload_2
       201: invokevirtual #121                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       204: return
      Exception table:
         from    to  target type
            59   125   140   Class java/lang/Throwable
           147   154   157   Class java/lang/Throwable
             0    22   193   Class java/lang/Exception
            23   190   193   Class java/lang/Exception
      LineNumberTable:
        line 368: 0
        line 369: 11
        line 370: 22
        line 373: 23
        line 374: 42
        line 376: 47
        line 377: 50
        line 378: 59
        line 379: 90
        line 380: 107
        line 381: 114
        line 382: 119
        line 384: 122
        line 385: 125
        line 377: 140
        line 387: 169
        line 391: 190
        line 389: 193
        line 390: 194
        line 392: 204
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          107      15    11 fileAge   J
           90      32    10 filePath   Ljava/nio/file/Path;
           59     110     8 stream   Ljava/nio/file/DirectoryStream;
           11     179     2 cacheDir   Ljava/nio/file/Path;
           42     148     3 maxAgeMillis   J
           47     143     5 currentTime   J
           50     140     7 removedCount   I
          194      10     2     e   Ljava/lang/Exception;
            0     205     0  this   Lext/mods/gameserver/geoengine/pathfinding/PathfinderCache;
            0     205     1 maxAgeDays   I
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           59     110     8 stream   Ljava/nio/file/DirectoryStream<Ljava/nio/file/Path;>;
      StackMapTable: number_of_entries = 10
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ class java/nio/file/Path ]
        frame_type = 255 /* full_frame */
          offset_delta = 44
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/PathfinderCache, int, class java/nio/file/Path, long, long, int, class java/nio/file/DirectoryStream, class java/util/Iterator ]
          stack = []
        frame_type = 53 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/PathfinderCache, int, class java/nio/file/Path, long, long, int, class java/nio/file/DirectoryStream, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 255 /* full_frame */
          offset_delta = 23
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/PathfinderCache, int ]
          stack = [ class java/lang/Exception ]
        frame_type = 10 /* same */

  public ext.mods.gameserver.geoengine.pathfinding.PathfinderCache$CacheStatistics getStatistics();
    descriptor: ()Lext/mods/gameserver/geoengine/pathfinding/PathfinderCache$CacheStatistics;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=12, locals=1, args_size=1
         0: new           #410                // class ext/mods/gameserver/geoengine/pathfinding/PathfinderCache$CacheStatistics
         3: dup
         4: aload_0
         5: getfield      #26                 // Field _cacheHits:J
         8: aload_0
         9: getfield      #30                 // Field _cacheMisses:J
        12: aload_0
        13: getfield      #33                 // Field _pathsGenerated:J
        16: aload_0
        17: getfield      #36                 // Field _pathsLoaded:J
        20: aload_0
        21: getfield      #10                 // Field _pathCache:Ljava/util/Map;
        24: invokeinterface #225,  1          // InterfaceMethod java/util/Map.size:()I
        29: getstatic     #108                // Field CACHE_SIZE_LIMIT:I
        32: invokespecial #412                // Method ext/mods/gameserver/geoengine/pathfinding/PathfinderCache$CacheStatistics."<init>":(JJJJII)V
        35: areturn
      LineNumberTable:
        line 398: 0
        line 403: 24
        line 398: 35
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      36     0  this   Lext/mods/gameserver/geoengine/pathfinding/PathfinderCache;

  public void shutdown();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=1
         0: aload_0
         1: getfield      #99                 // Field _generationExecutor:Ljava/util/concurrent/ExecutorService;
         4: ifnull        64
         7: aload_0
         8: getfield      #99                 // Field _generationExecutor:Ljava/util/concurrent/ExecutorService;
        11: invokeinterface #415,  1          // InterfaceMethod java/util/concurrent/ExecutorService.shutdown:()V
        16: aload_0
        17: getfield      #99                 // Field _generationExecutor:Ljava/util/concurrent/ExecutorService;
        20: ldc2_w        #418                // long 30l
        23: getstatic     #420                // Field java/util/concurrent/TimeUnit.SECONDS:Ljava/util/concurrent/TimeUnit;
        26: invokeinterface #426,  4          // InterfaceMethod java/util/concurrent/ExecutorService.awaitTermination:(JLjava/util/concurrent/TimeUnit;)Z
        31: ifne          44
        34: aload_0
        35: getfield      #99                 // Field _generationExecutor:Ljava/util/concurrent/ExecutorService;
        38: invokeinterface #430,  1          // InterfaceMethod java/util/concurrent/ExecutorService.shutdownNow:()Ljava/util/List;
        43: pop
        44: goto          64
        47: astore_1
        48: aload_0
        49: getfield      #99                 // Field _generationExecutor:Ljava/util/concurrent/ExecutorService;
        52: invokeinterface #430,  1          // InterfaceMethod java/util/concurrent/ExecutorService.shutdownNow:()Ljava/util/List;
        57: pop
        58: invokestatic  #436                // Method java/lang/Thread.currentThread:()Ljava/lang/Thread;
        61: invokevirtual #442                // Method java/lang/Thread.interrupt:()V
        64: aload_0
        65: invokevirtual #445                // Method saveAllCacheToFiles:()V
        68: getstatic     #77                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        71: ldc_w         #448                // String PathfinderCache finalizado
        74: invokevirtual #362                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
        77: return
      Exception table:
         from    to  target type
            16    44    47   Class java/lang/InterruptedException
      LineNumberTable:
        line 449: 0
        line 450: 7
        line 452: 16
        line 453: 34
        line 458: 44
        line 455: 47
        line 456: 48
        line 457: 58
        line 461: 64
        line 462: 68
        line 463: 77
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           48      16     1     e   Ljava/lang/InterruptedException;
            0      78     0  this   Lext/mods/gameserver/geoengine/pathfinding/PathfinderCache;
      StackMapTable: number_of_entries = 3
        frame_type = 44 /* same */
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/InterruptedException ]
        frame_type = 16 /* same */

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #84                 // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #11                 // class ext/mods/gameserver/geoengine/pathfinding/PathfinderCache
         6: invokevirtual #454                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #459                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #77                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: getstatic     #461                // Field ext/mods/Config.GEOENGINE_FILE:Ljava/lang/String;
        18: invokestatic  #466                // Method ext/mods/Config.initProperties:(Ljava/lang/String;)Lext/mods/commons/config/ExProperties;
        21: putstatic     #470                // Field GEOENGINE_PROPS:Lext/mods/commons/config/ExProperties;
        24: getstatic     #470                // Field GEOENGINE_PROPS:Lext/mods/commons/config/ExProperties;
        27: ldc_w         #474                // String EnablePathfinderCache
        30: iconst_1
        31: invokevirtual #476                // Method ext/mods/commons/config/ExProperties.getProperty:(Ljava/lang/String;Z)Z
        34: putstatic     #39                 // Field ENABLE_PATHFINDER_CACHE:Z
        37: getstatic     #470                // Field GEOENGINE_PROPS:Lext/mods/commons/config/ExProperties;
        40: ldc_w         #482                // String PathfinderCacheSize
        43: sipush        10000
        46: invokevirtual #484                // Method ext/mods/commons/config/ExProperties.getProperty:(Ljava/lang/String;I)I
        49: putstatic     #108                // Field CACHE_SIZE_LIMIT:I
        52: getstatic     #470                // Field GEOENGINE_PROPS:Lext/mods/commons/config/ExProperties;
        55: ldc_w         #487                // String PathfinderCacheDirectory
        58: ldc_w         #489                // String ./data/pathfinder_cache/
        61: invokevirtual #491                // Method ext/mods/commons/config/ExProperties.getProperty:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        64: putstatic     #51                 // Field CACHE_DIRECTORY:Ljava/lang/String;
        67: getstatic     #470                // Field GEOENGINE_PROPS:Lext/mods/commons/config/ExProperties;
        70: ldc_w         #494                // String CompressCacheFiles
        73: iconst_1
        74: invokevirtual #476                // Method ext/mods/commons/config/ExProperties.getProperty:(Ljava/lang/String;Z)Z
        77: putstatic     #261                // Field COMPRESS_CACHE_FILES:Z
        80: getstatic     #470                // Field GEOENGINE_PROPS:Lext/mods/commons/config/ExProperties;
        83: ldc_w         #496                // String PathfinderGenerationThreads
        86: iconst_4
        87: invokevirtual #484                // Method ext/mods/commons/config/ExProperties.getProperty:(Ljava/lang/String;I)I
        90: putstatic     #89                 // Field BACKGROUND_GENERATION_THREADS:I
        93: return
      LineNumberTable:
        line 45: 0
        line 47: 15
        line 48: 24
        line 49: 37
        line 50: 52
        line 51: 67
        line 52: 80
}
SourceFile: "PathfinderCache.java"
NestMembers:
  ext/mods/gameserver/geoengine/pathfinding/PathfinderCache$CacheStatistics
BootstrapMethods:
  0: #584 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #578 ()V
      #579 REF_invokeVirtual ext/mods/gameserver/geoengine/pathfinding/PathfinderCache.lambda$preCalculatePaths$0:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)V
      #578 ()V
  1: #591 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #582 \u0001.path
InnerClasses:
  public static #598= #371 of #134;       // Entry=class java/util/Map$Entry of class java/util/Map
  public static #599= #410 of #11;        // CacheStatistics=class ext/mods/gameserver/geoengine/pathfinding/PathfinderCache$CacheStatistics of class ext/mods/gameserver/geoengine/pathfinding/PathfinderCache
  public static final #604= #600 of #602; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
