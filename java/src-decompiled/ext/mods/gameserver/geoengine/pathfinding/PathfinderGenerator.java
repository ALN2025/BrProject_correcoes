// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.PathfinderGenerator
// File: ext\mods\gameserver\geoengine\pathfinding\PathfinderGenerator.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator.class
  Last modified 9 de jul de 2026; size 12604 bytes
  MD5 checksum 96de8be5c7141550bf7e19cdc6bc3f36
  Compiled from "PathfinderGenerator.java"
public class ext.mods.gameserver.geoengine.pathfinding.PathfinderGenerator
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 11, methods: 21, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator._totalWaypoints:I
    #8 = Class              #10           // ext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator
    #9 = NameAndType        #11:#12       // _totalWaypoints:I
   #10 = Utf8               ext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator
   #11 = Utf8               _totalWaypoints
   #12 = Utf8               I
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator._totalPaths:I
   #14 = NameAndType        #15:#12       // _totalPaths:I
   #15 = Utf8               _totalPaths
   #16 = Fieldref           #8.#17        // ext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator._generatedPaths:I
   #17 = NameAndType        #18:#12       // _generatedPaths:I
   #18 = Utf8               _generatedPaths
   #19 = Fieldref           #8.#20        // ext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator._failedPaths:I
   #20 = NameAndType        #21:#12       // _failedPaths:I
   #21 = Utf8               _failedPaths
   #22 = Methodref          #23.#24       // ext/mods/gameserver/geoengine/pathfinding/PathfinderCache.getInstance:()Lext/mods/gameserver/geoengine/pathfinding/PathfinderCache;
   #23 = Class              #25           // ext/mods/gameserver/geoengine/pathfinding/PathfinderCache
   #24 = NameAndType        #26:#27       // getInstance:()Lext/mods/gameserver/geoengine/pathfinding/PathfinderCache;
   #25 = Utf8               ext/mods/gameserver/geoengine/pathfinding/PathfinderCache
   #26 = Utf8               getInstance
   #27 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/PathfinderCache;
   #28 = Fieldref           #8.#29        // ext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator._cache:Lext/mods/gameserver/geoengine/pathfinding/PathfinderCache;
   #29 = NameAndType        #30:#31       // _cache:Lext/mods/gameserver/geoengine/pathfinding/PathfinderCache;
   #30 = Utf8               _cache
   #31 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/PathfinderCache;
   #32 = Fieldref           #8.#33        // ext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator._instance:Lext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator;
   #33 = NameAndType        #34:#35       // _instance:Lext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator;
   #34 = Utf8               _instance
   #35 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator;
   #36 = Methodref          #8.#3         // ext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator."<init>":()V
   #37 = Fieldref           #8.#38        // ext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator.ENABLE_AUTO_PRE_CALCULATION:Z
   #38 = NameAndType        #39:#40       // ENABLE_AUTO_PRE_CALCULATION:Z
   #39 = Utf8               ENABLE_AUTO_PRE_CALCULATION
   #40 = Utf8               Z
   #41 = Fieldref           #8.#42        // ext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator.LOGGER:Lext/mods/commons/logging/CLogger;
   #42 = NameAndType        #43:#44       // LOGGER:Lext/mods/commons/logging/CLogger;
   #43 = Utf8               LOGGER
   #44 = Utf8               Lext/mods/commons/logging/CLogger;
   #45 = String             #46           // Pré-cálculo automático de rotas desabilitado
   #46 = Utf8               Pré-cálculo automático de rotas desabilitado
   #47 = Methodref          #48.#49       // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
   #48 = Class              #50           // ext/mods/commons/logging/CLogger
   #49 = NameAndType        #51:#52       // info:(Ljava/lang/Object;)V
   #50 = Utf8               ext/mods/commons/logging/CLogger
   #51 = Utf8               info
   #52 = Utf8               (Ljava/lang/Object;)V
   #53 = String             #54           // Iniciando geração automática de rotas de pathfinding...
   #54 = Utf8               Iniciando geração automática de rotas de pathfinding...
   #55 = InvokeDynamic      #0:#56        // #0:run:(Lext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator;)Ljava/lang/Runnable;
   #56 = NameAndType        #57:#58       // run:(Lext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator;)Ljava/lang/Runnable;
   #57 = Utf8               run
   #58 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator;)Ljava/lang/Runnable;
   #59 = Long               5000l
   #61 = Methodref          #62.#63       // ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #62 = Class              #64           // ext/mods/commons/pool/ThreadPool
   #63 = NameAndType        #65:#66       // schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #64 = Utf8               ext/mods/commons/pool/ThreadPool
   #65 = Utf8               schedule
   #66 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #67 = String             #68           // Gerando waypoints estratégicos...
   #68 = Utf8               Gerando waypoints estratégicos...
   #69 = Methodref          #8.#70        // ext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator.generateWaypoints:()Ljava/util/List;
   #70 = NameAndType        #71:#72       // generateWaypoints:()Ljava/util/List;
   #71 = Utf8               generateWaypoints
   #72 = Utf8               ()Ljava/util/List;
   #73 = InterfaceMethodref #74.#75       // java/util/List.size:()I
   #74 = Class              #76           // java/util/List
   #75 = NameAndType        #77:#78       // size:()I
   #76 = Utf8               java/util/List
   #77 = Utf8               size
   #78 = Utf8               ()I
   #79 = String             #80           // Encontrados {} waypoints estratégicos
   #80 = Utf8               Encontrados {} waypoints estratégicos
   #81 = Methodref          #82.#83       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #82 = Class              #84           // java/lang/Integer
   #83 = NameAndType        #85:#86       // valueOf:(I)Ljava/lang/Integer;
   #84 = Utf8               java/lang/Integer
   #85 = Utf8               valueOf
   #86 = Utf8               (I)Ljava/lang/Integer;
   #87 = Methodref          #48.#88       // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #88 = NameAndType        #51:#89       // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #89 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
   #90 = InterfaceMethodref #74.#91       // java/util/List.isEmpty:()Z
   #91 = NameAndType        #92:#93       // isEmpty:()Z
   #92 = Utf8               isEmpty
   #93 = Utf8               ()Z
   #94 = String             #95           // Nenhum waypoint encontrado - geração cancelada
   #95 = Utf8               Nenhum waypoint encontrado - geração cancelada
   #96 = Methodref          #48.#97       // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;)V
   #97 = NameAndType        #98:#52       // warn:(Ljava/lang/Object;)V
   #98 = Utf8               warn
   #99 = Methodref          #8.#100       // ext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator.calculateTotalPaths:(Ljava/util/List;)I
  #100 = NameAndType        #101:#102     // calculateTotalPaths:(Ljava/util/List;)I
  #101 = Utf8               calculateTotalPaths
  #102 = Utf8               (Ljava/util/List;)I
  #103 = String             #104          // Serão calculadas {} rotas possíveis
  #104 = Utf8               Serão calculadas {} rotas possíveis
  #105 = Methodref          #8.#106       // ext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator.generatePathsParallel:(Ljava/util/List;)V
  #106 = NameAndType        #107:#108     // generatePathsParallel:(Ljava/util/List;)V
  #107 = Utf8               generatePathsParallel
  #108 = Utf8               (Ljava/util/List;)V
  #109 = Methodref          #23.#110      // ext/mods/gameserver/geoengine/pathfinding/PathfinderCache.saveAllCacheToFiles:()V
  #110 = NameAndType        #111:#6       // saveAllCacheToFiles:()V
  #111 = Utf8               saveAllCacheToFiles
  #112 = Methodref          #8.#113       // ext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator.showFinalStatistics:()V
  #113 = NameAndType        #114:#6       // showFinalStatistics:()V
  #114 = Utf8               showFinalStatistics
  #115 = Class              #116          // java/util/ArrayList
  #116 = Utf8               java/util/ArrayList
  #117 = Methodref          #115.#3       // java/util/ArrayList."<init>":()V
  #118 = Class              #119          // ext/mods/gameserver/model/World
  #119 = Utf8               ext/mods/gameserver/model/World
  #120 = Integer            524288
  #121 = Integer            851968
  #122 = Integer            327680
  #123 = Integer            819200
  #124 = Methodref          #8.#125       // ext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator.findValidWaypoint:(II)Lext/mods/gameserver/model/location/Location;
  #125 = NameAndType        #126:#127     // findValidWaypoint:(II)Lext/mods/gameserver/model/location/Location;
  #126 = Utf8               findValidWaypoint
  #127 = Utf8               (II)Lext/mods/gameserver/model/location/Location;
  #128 = InterfaceMethodref #74.#129      // java/util/List.add:(Ljava/lang/Object;)Z
  #129 = NameAndType        #130:#131     // add:(Ljava/lang/Object;)Z
  #130 = Utf8               add
  #131 = Utf8               (Ljava/lang/Object;)Z
  #132 = Methodref          #8.#133       // ext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator.addSpecialWaypoints:(Ljava/util/List;)V
  #133 = NameAndType        #134:#108     // addSpecialWaypoints:(Ljava/util/List;)V
  #134 = Utf8               addSpecialWaypoints
  #135 = Methodref          #136.#137     // java/lang/Math.toRadians:(D)D
  #136 = Class              #138          // java/lang/Math
  #137 = NameAndType        #139:#140     // toRadians:(D)D
  #138 = Utf8               java/lang/Math
  #139 = Utf8               toRadians
  #140 = Utf8               (D)D
  #141 = Methodref          #136.#142     // java/lang/Math.cos:(D)D
  #142 = NameAndType        #143:#140     // cos:(D)D
  #143 = Utf8               cos
  #144 = Methodref          #136.#145     // java/lang/Math.sin:(D)D
  #145 = NameAndType        #146:#140     // sin:(D)D
  #146 = Utf8               sin
  #147 = Methodref          #8.#148       // ext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator.isValidWaypoint:(II)Z
  #148 = NameAndType        #149:#150     // isValidWaypoint:(II)Z
  #149 = Utf8               isValidWaypoint
  #150 = Utf8               (II)Z
  #151 = Methodref          #152.#153     // ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
  #152 = Class              #154          // ext/mods/gameserver/geoengine/GeoEngine
  #153 = NameAndType        #26:#155      // getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
  #154 = Utf8               ext/mods/gameserver/geoengine/GeoEngine
  #155 = Utf8               ()Lext/mods/gameserver/geoengine/GeoEngine;
  #156 = Methodref          #152.#157     // ext/mods/gameserver/geoengine/GeoEngine.getHeight:(III)S
  #157 = NameAndType        #158:#159     // getHeight:(III)S
  #158 = Utf8               getHeight
  #159 = Utf8               (III)S
  #160 = Class              #161          // ext/mods/gameserver/model/location/Location
  #161 = Utf8               ext/mods/gameserver/model/location/Location
  #162 = Methodref          #160.#163     // ext/mods/gameserver/model/location/Location."<init>":(III)V
  #163 = NameAndType        #5:#164       // "<init>":(III)V
  #164 = Utf8               (III)V
  #165 = Methodref          #152.#166     // ext/mods/gameserver/geoengine/GeoEngine.canMoveToTarget:(IIIIII)Z
  #166 = NameAndType        #167:#168     // canMoveToTarget:(IIIIII)Z
  #167 = Utf8               canMoveToTarget
  #168 = Utf8               (IIIIII)Z
  #169 = Class              #170          // java/lang/Exception
  #170 = Utf8               java/lang/Exception
  #171 = Integer            -80826
  #172 = Integer            149775
  #173 = Methodref          #8.#174       // ext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator.addSpecialWaypoint:(Ljava/util/List;III)V
  #174 = NameAndType        #175:#176     // addSpecialWaypoint:(Ljava/util/List;III)V
  #175 = Utf8               addSpecialWaypoint
  #176 = Utf8               (Ljava/util/List;III)V
  #177 = Integer            111409
  #178 = Integer            219364
  #179 = Integer            116819
  #180 = Integer            76994
  #181 = Integer            170178
  #182 = Integer            147963
  #183 = Integer            -55268
  #184 = Integer            105918
  #185 = Integer            109759
  #186 = Integer            170156
  #187 = String             #188          // Adicionados {} waypoints especiais
  #188 = Utf8               Adicionados {} waypoints especiais
  #189 = InterfaceMethodref #74.#190      // java/util/List.get:(I)Ljava/lang/Object;
  #190 = NameAndType        #191:#192     // get:(I)Ljava/lang/Object;
  #191 = Utf8               get
  #192 = Utf8               (I)Ljava/lang/Object;
  #193 = Methodref          #160.#194     // ext/mods/gameserver/model/location/Location.distance3D:(Lext/mods/gameserver/model/location/Location;)D
  #194 = NameAndType        #195:#196     // distance3D:(Lext/mods/gameserver/model/location/Location;)D
  #195 = Utf8               distance3D
  #196 = Utf8               (Lext/mods/gameserver/model/location/Location;)D
  #197 = Fieldref           #8.#198       // ext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator.MAX_PRE_CALCULATION_DISTANCE:I
  #198 = NameAndType        #199:#12      // MAX_PRE_CALCULATION_DISTANCE:I
  #199 = Utf8               MAX_PRE_CALCULATION_DISTANCE
  #200 = Fieldref           #8.#201       // ext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator.GENERATION_THREADS:I
  #201 = NameAndType        #202:#12      // GENERATION_THREADS:I
  #202 = Utf8               GENERATION_THREADS
  #203 = Methodref          #204.#205     // java/util/concurrent/Executors.newFixedThreadPool:(I)Ljava/util/concurrent/ExecutorService;
  #204 = Class              #206          // java/util/concurrent/Executors
  #205 = NameAndType        #207:#208     // newFixedThreadPool:(I)Ljava/util/concurrent/ExecutorService;
  #206 = Utf8               java/util/concurrent/Executors
  #207 = Utf8               newFixedThreadPool
  #208 = Utf8               (I)Ljava/util/concurrent/ExecutorService;
  #209 = String             #210          // Iniciando geração paralela com {} threads
  #210 = Utf8               Iniciando geração paralela com {} threads
  #211 = InvokeDynamic      #1:#212       // #1:call:(Lext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator;Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Ljava/util/concurrent/Callable;
  #212 = NameAndType        #213:#214     // call:(Lext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator;Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Ljava/util/concurrent/Callable;
  #213 = Utf8               call
  #214 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator;Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Ljava/util/concurrent/Callable;
  #215 = InterfaceMethodref #216.#217     // java/util/concurrent/ExecutorService.submit:(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
  #216 = Class              #218          // java/util/concurrent/ExecutorService
  #217 = NameAndType        #219:#220     // submit:(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
  #218 = Utf8               java/util/concurrent/ExecutorService
  #219 = Utf8               submit
  #220 = Utf8               (Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
  #221 = InterfaceMethodref #74.#222      // java/util/List.iterator:()Ljava/util/Iterator;
  #222 = NameAndType        #223:#224     // iterator:()Ljava/util/Iterator;
  #223 = Utf8               iterator
  #224 = Utf8               ()Ljava/util/Iterator;
  #225 = InterfaceMethodref #226.#227     // java/util/Iterator.hasNext:()Z
  #226 = Class              #228          // java/util/Iterator
  #227 = NameAndType        #229:#93      // hasNext:()Z
  #228 = Utf8               java/util/Iterator
  #229 = Utf8               hasNext
  #230 = InterfaceMethodref #226.#231     // java/util/Iterator.next:()Ljava/lang/Object;
  #231 = NameAndType        #232:#233     // next:()Ljava/lang/Object;
  #232 = Utf8               next
  #233 = Utf8               ()Ljava/lang/Object;
  #234 = Class              #235          // java/util/concurrent/Future
  #235 = Utf8               java/util/concurrent/Future
  #236 = InterfaceMethodref #234.#237     // java/util/concurrent/Future.get:()Ljava/lang/Object;
  #237 = NameAndType        #191:#233     // get:()Ljava/lang/Object;
  #238 = String             #239          // Erro durante geração de rota
  #239 = Utf8               Erro durante geração de rota
  #240 = Methodref          #48.#241      // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #241 = NameAndType        #98:#242      // warn:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #242 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
  #243 = InterfaceMethodref #216.#244     // java/util/concurrent/ExecutorService.shutdown:()V
  #244 = NameAndType        #245:#6       // shutdown:()V
  #245 = Utf8               shutdown
  #246 = String             #247          // Geração paralela concluída
  #247 = Utf8               Geração paralela concluída
  #248 = Methodref          #160.#249     // ext/mods/gameserver/model/location/Location.getX:()I
  #249 = NameAndType        #250:#78      // getX:()I
  #250 = Utf8               getX
  #251 = Methodref          #160.#252     // ext/mods/gameserver/model/location/Location.getY:()I
  #252 = NameAndType        #253:#78      // getY:()I
  #253 = Utf8               getY
  #254 = Methodref          #160.#255     // ext/mods/gameserver/model/location/Location.getZ:()I
  #255 = NameAndType        #256:#78      // getZ:()I
  #256 = Utf8               getZ
  #257 = Methodref          #152.#258     // ext/mods/gameserver/geoengine/GeoEngine.findPath:(IIIIIIZLext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
  #258 = NameAndType        #259:#260     // findPath:(IIIIIIZLext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
  #259 = Utf8               findPath
  #260 = Utf8               (IIIIIIZLext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
  #261 = String             #262          // Progresso: {}/{} rotas geradas ({:.1f}%)
  #262 = Utf8               Progresso: {}/{} rotas geradas ({:.1f}%)
  #263 = Double             100.0d
  #265 = Methodref          #266.#267     // java/lang/Double.valueOf:(D)Ljava/lang/Double;
  #266 = Class              #268          // java/lang/Double
  #267 = NameAndType        #85:#269      // valueOf:(D)Ljava/lang/Double;
  #268 = Utf8               java/lang/Double
  #269 = Utf8               (D)Ljava/lang/Double;
  #270 = String             #271          // Erro ao gerar rota de {} para {}
  #271 = Utf8               Erro ao gerar rota de {} para {}
  #272 = Methodref          #48.#273      // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #273 = NameAndType        #98:#89       // warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #274 = String             #275          // %d_%d_%d_%d_%d_%d_%s
  #275 = Utf8               %d_%d_%d_%d_%d_%d_%s
  #276 = String             #277          // opt
  #277 = Utf8               opt
  #278 = String             #279          // leg
  #279 = Utf8               leg
  #280 = Methodref          #281.#282     // java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #281 = Class              #283          // java/lang/String
  #282 = NameAndType        #284:#285     // format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #283 = Utf8               java/lang/String
  #284 = Utf8               format
  #285 = Utf8               (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #286 = String             #287          // === ESTATÍSTICAS DE GERAÇÃO DE ROTAS ===
  #287 = Utf8               === ESTATÍSTICAS DE GERAÇÃO DE ROTAS ===
  #288 = String             #289          // Waypoints gerados: {}
  #289 = Utf8               Waypoints gerados: {}
  #290 = String             #291          // Rotas calculadas: {}
  #291 = Utf8               Rotas calculadas: {}
  #292 = String             #293          // Rotas falharam: {}
  #293 = Utf8               Rotas falharam: {}
  #294 = String             #295          // Taxa de sucesso: {:.1f}%
  #295 = Utf8               Taxa de sucesso: {:.1f}%
  #296 = Methodref          #23.#297      // ext/mods/gameserver/geoengine/pathfinding/PathfinderCache.getStatistics:()Lext/mods/gameserver/geoengine/pathfinding/PathfinderCache$CacheStatistics;
  #297 = NameAndType        #298:#299     // getStatistics:()Lext/mods/gameserver/geoengine/pathfinding/PathfinderCache$CacheStatistics;
  #298 = Utf8               getStatistics
  #299 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/PathfinderCache$CacheStatistics;
  #300 = String             #301          // === ESTATÍSTICAS DO CACHE ===
  #301 = Utf8               === ESTATÍSTICAS DO CACHE ===
  #302 = String             #303          // {}
  #303 = Utf8               {}
  #304 = String             #305          // Geração automática de rotas concluída!
  #305 = Utf8               Geração automática de rotas concluída!
  #306 = String             #307          // Gerando rotas entre {} waypoints (distância máxima: {})
  #307 = Utf8               Gerando rotas entre {} waypoints (distância máxima: {})
  #308 = Class              #309          // ext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator$GenerationStatistics
  #309 = Utf8               ext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator$GenerationStatistics
  #310 = Methodref          #308.#311     // ext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator$GenerationStatistics."<init>":(IIII)V
  #311 = NameAndType        #5:#312       // "<init>":(IIII)V
  #312 = Utf8               (IIII)V
  #313 = Methodref          #8.#314       // ext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator.generateSinglePath:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)V
  #314 = NameAndType        #315:#316     // generateSinglePath:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)V
  #315 = Utf8               generateSinglePath
  #316 = Utf8               (Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)V
  #317 = Methodref          #8.#318       // ext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator.generateStrategicWaypoints:()V
  #318 = NameAndType        #319:#6       // generateStrategicWaypoints:()V
  #319 = Utf8               generateStrategicWaypoints
  #320 = String             #321          // Erro durante geração automática de rotas
  #321 = Utf8               Erro durante geração automática de rotas
  #322 = Methodref          #48.#323      // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #323 = NameAndType        #324:#242     // error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #324 = Utf8               error
  #325 = Methodref          #326.#327     // java/lang/Class.getName:()Ljava/lang/String;
  #326 = Class              #328          // java/lang/Class
  #327 = NameAndType        #329:#330     // getName:()Ljava/lang/String;
  #328 = Utf8               java/lang/Class
  #329 = Utf8               getName
  #330 = Utf8               ()Ljava/lang/String;
  #331 = Methodref          #48.#332      // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #332 = NameAndType        #5:#333       // "<init>":(Ljava/lang/String;)V
  #333 = Utf8               (Ljava/lang/String;)V
  #334 = Fieldref           #335.#336     // ext/mods/Config.GEOENGINE_FILE:Ljava/lang/String;
  #335 = Class              #337          // ext/mods/Config
  #336 = NameAndType        #338:#339     // GEOENGINE_FILE:Ljava/lang/String;
  #337 = Utf8               ext/mods/Config
  #338 = Utf8               GEOENGINE_FILE
  #339 = Utf8               Ljava/lang/String;
  #340 = Methodref          #335.#341     // ext/mods/Config.initProperties:(Ljava/lang/String;)Lext/mods/commons/config/ExProperties;
  #341 = NameAndType        #342:#343     // initProperties:(Ljava/lang/String;)Lext/mods/commons/config/ExProperties;
  #342 = Utf8               initProperties
  #343 = Utf8               (Ljava/lang/String;)Lext/mods/commons/config/ExProperties;
  #344 = Fieldref           #8.#345       // ext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator.GEOENGINE_PROPS:Lext/mods/commons/config/ExProperties;
  #345 = NameAndType        #346:#347     // GEOENGINE_PROPS:Lext/mods/commons/config/ExProperties;
  #346 = Utf8               GEOENGINE_PROPS
  #347 = Utf8               Lext/mods/commons/config/ExProperties;
  #348 = String             #349          // EnableAutoPreCalculation
  #349 = Utf8               EnableAutoPreCalculation
  #350 = Methodref          #351.#352     // ext/mods/commons/config/ExProperties.getProperty:(Ljava/lang/String;Z)Z
  #351 = Class              #353          // ext/mods/commons/config/ExProperties
  #352 = NameAndType        #354:#355     // getProperty:(Ljava/lang/String;Z)Z
  #353 = Utf8               ext/mods/commons/config/ExProperties
  #354 = Utf8               getProperty
  #355 = Utf8               (Ljava/lang/String;Z)Z
  #356 = String             #357          // MaxPreCalculationDistance
  #357 = Utf8               MaxPreCalculationDistance
  #358 = Methodref          #351.#359     // ext/mods/commons/config/ExProperties.getProperty:(Ljava/lang/String;I)I
  #359 = NameAndType        #354:#360     // getProperty:(Ljava/lang/String;I)I
  #360 = Utf8               (Ljava/lang/String;I)I
  #361 = String             #362          // PathfinderGenerationThreads
  #362 = Utf8               PathfinderGenerationThreads
  #363 = Utf8               Code
  #364 = Utf8               LineNumberTable
  #365 = Utf8               LocalVariableTable
  #366 = Utf8               this
  #367 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator;
  #368 = Utf8               StackMapTable
  #369 = Class              #370          // java/lang/Throwable
  #370 = Utf8               java/lang/Throwable
  #371 = Utf8               startAutoGeneration
  #372 = Utf8               waypoints
  #373 = Utf8               Ljava/util/List;
  #374 = Utf8               LocalVariableTypeTable
  #375 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
  #376 = Utf8               waypoint
  #377 = Utf8               Lext/mods/gameserver/model/location/Location;
  #378 = Utf8               y
  #379 = Utf8               x
  #380 = Utf8               gridSize
  #381 = Utf8               minX
  #382 = Utf8               maxX
  #383 = Utf8               minY
  #384 = Utf8               maxY
  #385 = Utf8               Signature
  #386 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
  #387 = Utf8               z
  #388 = Utf8               rad
  #389 = Utf8               D
  #390 = Utf8               testX
  #391 = Utf8               testY
  #392 = Utf8               angle
  #393 = Utf8               radius
  #394 = Utf8               e
  #395 = Utf8               Ljava/lang/Exception;
  #396 = Utf8               (Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;)V
  #397 = Utf8               (Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;III)V
  #398 = Utf8               from
  #399 = Utf8               to
  #400 = Utf8               j
  #401 = Utf8               i
  #402 = Utf8               total
  #403 = Utf8               (Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;)I
  #404 = Utf8               future
  #405 = Utf8               Ljava/util/concurrent/Future;
  #406 = Utf8               executor
  #407 = Utf8               Ljava/util/concurrent/ExecutorService;
  #408 = Utf8               futures
  #409 = Utf8               Ljava/util/concurrent/Future<Ljava/lang/Void;>;
  #410 = Utf8               Ljava/util/List<Ljava/util/concurrent/Future<Ljava/lang/Void;>;>;
  #411 = Utf8               path
  #412 = Utf8               generateCacheKey
  #413 = Utf8               (Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;Z)Ljava/lang/String;
  #414 = Utf8               useOptimized
  #415 = Class              #416          // "[Ljava/lang/Object;"
  #416 = Utf8               [Ljava/lang/Object;
  #417 = Utf8               addToMemoryCache
  #418 = Utf8               (Ljava/lang/String;Ljava/util/List;)V
  #419 = Utf8               cacheKey
  #420 = Utf8               (Ljava/lang/String;Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;)V
  #421 = Utf8               cacheStats
  #422 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/PathfinderCache$CacheStatistics;
  #423 = Utf8               generatePathsBetweenWaypoints
  #424 = Utf8               (Ljava/util/List;I)V
  #425 = Utf8               maxDistance
  #426 = Utf8               (Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;I)V
  #427 = Utf8               clearStatistics
  #428 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator$GenerationStatistics;
  #429 = Utf8               lambda$generatePathsParallel$0
  #430 = Utf8               (Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Ljava/lang/Void;
  #431 = Utf8               Exceptions
  #432 = Utf8               lambda$startAutoGeneration$0
  #433 = Utf8               <clinit>
  #434 = Utf8               SourceFile
  #435 = Utf8               PathfinderGenerator.java
  #436 = Utf8               NestMembers
  #437 = Utf8               BootstrapMethods
  #438 = MethodType         #6            //  ()V
  #439 = MethodHandle       5:#440        // REF_invokeVirtual ext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator.lambda$startAutoGeneration$0:()V
  #440 = Methodref          #8.#441       // ext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator.lambda$startAutoGeneration$0:()V
  #441 = NameAndType        #432:#6       // lambda$startAutoGeneration$0:()V
  #442 = MethodType         #233          //  ()Ljava/lang/Object;
  #443 = MethodHandle       5:#444        // REF_invokeVirtual ext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator.lambda$generatePathsParallel$0:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Ljava/lang/Void;
  #444 = Methodref          #8.#445       // ext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator.lambda$generatePathsParallel$0:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Ljava/lang/Void;
  #445 = NameAndType        #429:#430     // lambda$generatePathsParallel$0:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Ljava/lang/Void;
  #446 = MethodType         #447          //  ()Ljava/lang/Void;
  #447 = Utf8               ()Ljava/lang/Void;
  #448 = MethodHandle       6:#449        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #449 = Methodref          #450.#451     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #450 = Class              #452          // java/lang/invoke/LambdaMetafactory
  #451 = NameAndType        #453:#454     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #452 = Utf8               java/lang/invoke/LambdaMetafactory
  #453 = Utf8               metafactory
  #454 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #455 = Utf8               InnerClasses
  #456 = Class              #457          // ext/mods/gameserver/geoengine/pathfinding/PathfinderCache$CacheStatistics
  #457 = Utf8               ext/mods/gameserver/geoengine/pathfinding/PathfinderCache$CacheStatistics
  #458 = Utf8               CacheStatistics
  #459 = Utf8               GenerationStatistics
  #460 = Class              #461          // java/lang/invoke/MethodHandles$Lookup
  #461 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #462 = Class              #463          // java/lang/invoke/MethodHandles
  #463 = Utf8               java/lang/invoke/MethodHandles
  #464 = Utf8               Lookup
{
  public static ext.mods.gameserver.geoengine.pathfinding.PathfinderGenerator getInstance();
    descriptor: ()Lext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=2, args_size=0
         0: getstatic     #32                 // Field _instance:Lext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator;
         3: ifnonnull     37
         6: ldc           #8                  // class ext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator
         8: dup
         9: astore_0
        10: monitorenter
        11: getstatic     #32                 // Field _instance:Lext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator;
        14: ifnonnull     27
        17: new           #8                  // class ext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator
        20: dup
        21: invokespecial #36                 // Method "<init>":()V
        24: putstatic     #32                 // Field _instance:Lext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator;
        27: aload_0
        28: monitorexit
        29: goto          37
        32: astore_1
        33: aload_0
        34: monitorexit
        35: aload_1
        36: athrow
        37: getstatic     #32                 // Field _instance:Lext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator;
        40: areturn
      Exception table:
         from    to  target type
            11    29    32   any
            32    35    32   any
      LineNumberTable:
        line 64: 0
        line 65: 6
        line 66: 11
        line 67: 17
        line 69: 27
        line 71: 37
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 27
          locals = [ class java/lang/Object ]
        frame_type = 68 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 250 /* chop */
          offset_delta = 4

  public void startAutoGeneration();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: getstatic     #37                 // Field ENABLE_AUTO_PRE_CALCULATION:Z
         3: ifne          15
         6: getstatic     #41                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
         9: ldc           #45                 // String Pré-cálculo automático de rotas desabilitado
        11: invokevirtual #47                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
        14: return
        15: getstatic     #41                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        18: ldc           #53                 // String Iniciando geração automática de rotas de pathfinding...
        20: invokevirtual #47                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
        23: aload_0
        24: invokedynamic #55,  0             // InvokeDynamic #0:run:(Lext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator;)Ljava/lang/Runnable;
        29: ldc2_w        #59                 // long 5000l
        32: invokestatic  #61                 // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
        35: pop
        36: return
      LineNumberTable:
        line 78: 0
        line 79: 6
        line 80: 14
        line 83: 15
        line 85: 23
        line 92: 36
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      37     0  this   Lext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator;
      StackMapTable: number_of_entries = 1
        frame_type = 15 /* same */

  public void generateStrategicWaypoints();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=2, args_size=1
         0: getstatic     #41                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
         3: ldc           #67                 // String Gerando waypoints estratégicos...
         5: invokevirtual #47                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
         8: aload_0
         9: invokevirtual #69                 // Method generateWaypoints:()Ljava/util/List;
        12: astore_1
        13: aload_0
        14: aload_1
        15: invokeinterface #73,  1           // InterfaceMethod java/util/List.size:()I
        20: putfield      #7                  // Field _totalWaypoints:I
        23: getstatic     #41                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        26: ldc           #79                 // String Encontrados {} waypoints estratégicos
        28: iconst_1
        29: anewarray     #2                  // class java/lang/Object
        32: dup
        33: iconst_0
        34: aload_0
        35: getfield      #7                  // Field _totalWaypoints:I
        38: invokestatic  #81                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        41: aastore
        42: invokevirtual #87                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
        45: aload_1
        46: invokeinterface #90,  1           // InterfaceMethod java/util/List.isEmpty:()Z
        51: ifeq          63
        54: getstatic     #41                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        57: ldc           #94                 // String Nenhum waypoint encontrado - geração cancelada
        59: invokevirtual #96                 // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;)V
        62: return
        63: aload_0
        64: aload_0
        65: aload_1
        66: invokevirtual #99                 // Method calculateTotalPaths:(Ljava/util/List;)I
        69: putfield      #13                 // Field _totalPaths:I
        72: getstatic     #41                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        75: ldc           #103                // String Serão calculadas {} rotas possíveis
        77: iconst_1
        78: anewarray     #2                  // class java/lang/Object
        81: dup
        82: iconst_0
        83: aload_0
        84: getfield      #13                 // Field _totalPaths:I
        87: invokestatic  #81                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        90: aastore
        91: invokevirtual #87                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
        94: aload_0
        95: aload_1
        96: invokevirtual #105                // Method generatePathsParallel:(Ljava/util/List;)V
        99: aload_0
       100: getfield      #28                 // Field _cache:Lext/mods/gameserver/geoengine/pathfinding/PathfinderCache;
       103: invokevirtual #109                // Method ext/mods/gameserver/geoengine/pathfinding/PathfinderCache.saveAllCacheToFiles:()V
       106: aload_0
       107: invokevirtual #112                // Method showFinalStatistics:()V
       110: return
      LineNumberTable:
        line 98: 0
        line 100: 8
        line 101: 13
        line 103: 23
        line 105: 45
        line 106: 54
        line 107: 62
        line 110: 63
        line 111: 72
        line 113: 94
        line 115: 99
        line 116: 106
        line 117: 110
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     111     0  this   Lext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator;
           13      98     1 waypoints   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           13      98     1 waypoints   Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 63
          locals = [ class java/util/List ]

  public void addToMemoryCache(java.lang.String, java.util.List<ext.mods.gameserver.model.location.Location>);
    descriptor: (Ljava/lang/String;Ljava/util/List;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=3, args_size=3
         0: return
      LineNumberTable:
        line 313: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator;
            0       1     1 cacheKey   Ljava/lang/String;
            0       1     2  path   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       1     2  path   Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
    Signature: #420                         // (Ljava/lang/String;Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;)V

  public void generatePathsBetweenWaypoints(java.util.List<ext.mods.gameserver.model.location.Location>, int);
    descriptor: (Ljava/util/List;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=3, args_size=3
         0: getstatic     #41                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
         3: ldc_w         #306                // String Gerando rotas entre {} waypoints (distância máxima: {})
         6: iconst_2
         7: anewarray     #2                  // class java/lang/Object
        10: dup
        11: iconst_0
        12: aload_1
        13: invokeinterface #73,  1           // InterfaceMethod java/util/List.size:()I
        18: invokestatic  #81                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        21: aastore
        22: dup
        23: iconst_1
        24: iload_2
        25: invokestatic  #81                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        28: aastore
        29: invokevirtual #87                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
        32: aload_0
        33: aload_1
        34: invokeinterface #73,  1           // InterfaceMethod java/util/List.size:()I
        39: putfield      #7                  // Field _totalWaypoints:I
        42: aload_0
        43: aload_0
        44: aload_1
        45: invokevirtual #99                 // Method calculateTotalPaths:(Ljava/util/List;)I
        48: putfield      #13                 // Field _totalPaths:I
        51: aload_0
        52: iconst_0
        53: putfield      #16                 // Field _generatedPaths:I
        56: aload_0
        57: iconst_0
        58: putfield      #19                 // Field _failedPaths:I
        61: aload_0
        62: aload_1
        63: invokevirtual #105                // Method generatePathsParallel:(Ljava/util/List;)V
        66: aload_0
        67: invokevirtual #112                // Method showFinalStatistics:()V
        70: return
      LineNumberTable:
        line 340: 0
        line 341: 13
        line 340: 29
        line 343: 32
        line 344: 42
        line 345: 51
        line 346: 56
        line 348: 61
        line 349: 66
        line 350: 70
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      71     0  this   Lext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator;
            0      71     1 waypoints   Ljava/util/List;
            0      71     2 maxDistance   I
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      71     1 waypoints   Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
    Signature: #426                         // (Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;I)V

  public void clearStatistics();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: iconst_0
         2: putfield      #7                  // Field _totalWaypoints:I
         5: aload_0
         6: iconst_0
         7: putfield      #13                 // Field _totalPaths:I
        10: aload_0
        11: iconst_0
        12: putfield      #16                 // Field _generatedPaths:I
        15: aload_0
        16: iconst_0
        17: putfield      #19                 // Field _failedPaths:I
        20: return
      LineNumberTable:
        line 356: 0
        line 357: 5
        line 358: 10
        line 359: 15
        line 360: 20
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator;

  public ext.mods.gameserver.geoengine.pathfinding.PathfinderGenerator$GenerationStatistics getStatistics();
    descriptor: ()Lext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator$GenerationStatistics;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: new           #308                // class ext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator$GenerationStatistics
         3: dup
         4: aload_0
         5: getfield      #7                  // Field _totalWaypoints:I
         8: aload_0
         9: getfield      #13                 // Field _totalPaths:I
        12: aload_0
        13: getfield      #16                 // Field _generatedPaths:I
        16: aload_0
        17: getfield      #19                 // Field _failedPaths:I
        20: invokespecial #310                // Method ext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator$GenerationStatistics."<init>":(IIII)V
        23: areturn
      LineNumberTable:
        line 366: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      24     0  this   Lext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #48                 // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #8                  // class ext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator
         6: invokevirtual #325                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #331                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #41                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: getstatic     #334                // Field ext/mods/Config.GEOENGINE_FILE:Ljava/lang/String;
        18: invokestatic  #340                // Method ext/mods/Config.initProperties:(Ljava/lang/String;)Lext/mods/commons/config/ExProperties;
        21: putstatic     #344                // Field GEOENGINE_PROPS:Lext/mods/commons/config/ExProperties;
        24: getstatic     #344                // Field GEOENGINE_PROPS:Lext/mods/commons/config/ExProperties;
        27: ldc_w         #348                // String EnableAutoPreCalculation
        30: iconst_1
        31: invokevirtual #350                // Method ext/mods/commons/config/ExProperties.getProperty:(Ljava/lang/String;Z)Z
        34: putstatic     #37                 // Field ENABLE_AUTO_PRE_CALCULATION:Z
        37: getstatic     #344                // Field GEOENGINE_PROPS:Lext/mods/commons/config/ExProperties;
        40: ldc_w         #356                // String MaxPreCalculationDistance
        43: sipush        2000
        46: invokevirtual #358                // Method ext/mods/commons/config/ExProperties.getProperty:(Ljava/lang/String;I)I
        49: putstatic     #197                // Field MAX_PRE_CALCULATION_DISTANCE:I
        52: getstatic     #344                // Field GEOENGINE_PROPS:Lext/mods/commons/config/ExProperties;
        55: ldc_w         #361                // String PathfinderGenerationThreads
        58: iconst_4
        59: invokevirtual #358                // Method ext/mods/commons/config/ExProperties.getProperty:(Ljava/lang/String;I)I
        62: putstatic     #200                // Field GENERATION_THREADS:I
        65: return
      LineNumberTable:
        line 43: 0
        line 45: 15
        line 46: 24
        line 47: 37
        line 48: 52
}
SourceFile: "PathfinderGenerator.java"
NestMembers:
  ext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator$GenerationStatistics
BootstrapMethods:
  0: #448 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #438 ()V
      #439 REF_invokeVirtual ext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator.lambda$startAutoGeneration$0:()V
      #438 ()V
  1: #448 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #442 ()Ljava/lang/Object;
      #443 REF_invokeVirtual ext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator.lambda$generatePathsParallel$0:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Ljava/lang/Void;
      #446 ()Ljava/lang/Void;
InnerClasses:
  public static #458= #456 of #23;        // CacheStatistics=class ext/mods/gameserver/geoengine/pathfinding/PathfinderCache$CacheStatistics of class ext/mods/gameserver/geoengine/pathfinding/PathfinderCache
  public static #459= #308 of #8;         // GenerationStatistics=class ext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator$GenerationStatistics of class ext/mods/gameserver/geoengine/pathfinding/PathfinderGenerator
  public static final #464= #460 of #462; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
