// Bytecode for: ext.mods.gameserver.geoengine.GeoEngine
// File: ext\mods\gameserver\geoengine\GeoEngine.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/GeoEngine.class
  Last modified 9 de jul de 2026; size 61840 bytes
  MD5 checksum e06d7586dc5173a810279bb74ad99f58
  Compiled from "GeoEngine.kt"
public final class ext.mods.gameserver.geoengine.GeoEngine
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/GeoEngine
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 15, methods: 68, attributes: 6
Constant pool:
     #1 = Utf8               ext/mods/gameserver/geoengine/GeoEngine
     #2 = Class              #1           // ext/mods/gameserver/geoengine/GeoEngine
     #3 = Utf8               java/lang/Object
     #4 = Class              #3           // java/lang/Object
     #5 = Utf8               <init>
     #6 = Utf8               ()V
     #7 = Utf8               java/lang/Exception
     #8 = Class              #7           // java/lang/Exception
     #9 = NameAndType        #5:#6        // "<init>":()V
    #10 = Methodref          #4.#9        // java/lang/Object."<init>":()V
    #11 = Utf8               kotlinx/coroutines/sync/MutexKt
    #12 = Class              #11          // kotlinx/coroutines/sync/MutexKt
    #13 = Utf8               Mutex$default
    #14 = Utf8               (ZILjava/lang/Object;)Lkotlinx/coroutines/sync/Mutex;
    #15 = NameAndType        #13:#14      // Mutex$default:(ZILjava/lang/Object;)Lkotlinx/coroutines/sync/Mutex;
    #16 = Methodref          #12.#15      // kotlinx/coroutines/sync/MutexKt.Mutex$default:(ZILjava/lang/Object;)Lkotlinx/coroutines/sync/Mutex;
    #17 = Utf8               multilayerMutex
    #18 = Utf8               Lkotlinx/coroutines/sync/Mutex;
    #19 = NameAndType        #17:#18      // multilayerMutex:Lkotlinx/coroutines/sync/Mutex;
    #20 = Fieldref           #2.#19       // ext/mods/gameserver/geoengine/GeoEngine.multilayerMutex:Lkotlinx/coroutines/sync/Mutex;
    #21 = Utf8               REGION_LOCKS
    #22 = Utf8               I
    #23 = NameAndType        #21:#22      // REGION_LOCKS:I
    #24 = Fieldref           #2.#23       // ext/mods/gameserver/geoengine/GeoEngine.REGION_LOCKS:I
    #25 = Utf8               java/util/concurrent/locks/StampedLock
    #26 = Class              #25          // java/util/concurrent/locks/StampedLock
    #27 = Methodref          #26.#9       // java/util/concurrent/locks/StampedLock."<init>":()V
    #28 = Utf8               regionLocks
    #29 = Utf8               [Ljava/util/concurrent/locks/StampedLock;
    #30 = NameAndType        #28:#29      // regionLocks:[Ljava/util/concurrent/locks/StampedLock;
    #31 = Fieldref           #2.#30       // ext/mods/gameserver/geoengine/GeoEngine.regionLocks:[Ljava/util/concurrent/locks/StampedLock;
    #32 = Utf8               PADDING_SHIFT
    #33 = NameAndType        #32:#22      // PADDING_SHIFT:I
    #34 = Fieldref           #2.#33       // ext/mods/gameserver/geoengine/GeoEngine.PADDING_SHIFT:I
    #35 = Integer            65536
    #36 = Utf8               CACHE_CAPACITY
    #37 = NameAndType        #36:#22      // CACHE_CAPACITY:I
    #38 = Fieldref           #2.#37       // ext/mods/gameserver/geoengine/GeoEngine.CACHE_CAPACITY:I
    #39 = Utf8               CACHE_MASK
    #40 = NameAndType        #39:#22      // CACHE_MASK:I
    #41 = Fieldref           #2.#40       // ext/mods/gameserver/geoengine/GeoEngine.CACHE_MASK:I
    #42 = Long               -1l
    #44 = Utf8               heightCacheKeys
    #45 = Utf8               [J
    #46 = NameAndType        #44:#45      // heightCacheKeys:[J
    #47 = Fieldref           #2.#46       // ext/mods/gameserver/geoengine/GeoEngine.heightCacheKeys:[J
    #48 = Utf8               heightCacheVals
    #49 = Utf8               [S
    #50 = NameAndType        #48:#49      // heightCacheVals:[S
    #51 = Fieldref           #2.#50       // ext/mods/gameserver/geoengine/GeoEngine.heightCacheVals:[S
    #52 = Utf8               nsweCacheKeys
    #53 = NameAndType        #52:#45      // nsweCacheKeys:[J
    #54 = Fieldref           #2.#53       // ext/mods/gameserver/geoengine/GeoEngine.nsweCacheKeys:[J
    #55 = Utf8               nsweCacheVals
    #56 = Utf8               [B
    #57 = NameAndType        #55:#56      // nsweCacheVals:[B
    #58 = Fieldref           #2.#57       // ext/mods/gameserver/geoengine/GeoEngine.nsweCacheVals:[B
    #59 = Utf8               [Lext/mods/gameserver/geoengine/geodata/ABlock;
    #60 = Class              #59          // "[Lext/mods/gameserver/geoengine/geodata/ABlock;"
    #61 = Utf8               ext/mods/gameserver/geoengine/geodata/ABlock
    #62 = Class              #61          // ext/mods/gameserver/geoengine/geodata/ABlock
    #63 = Utf8               ext/mods/gameserver/geoengine/geodata/BlockNull
    #64 = Class              #63          // ext/mods/gameserver/geoengine/geodata/BlockNull
    #65 = Utf8               INSTANCE
    #66 = Utf8               Lext/mods/gameserver/geoengine/geodata/BlockNull;
    #67 = NameAndType        #65:#66      // INSTANCE:Lext/mods/gameserver/geoengine/geodata/BlockNull;
    #68 = Fieldref           #64.#67      // ext/mods/gameserver/geoengine/geodata/BlockNull.INSTANCE:Lext/mods/gameserver/geoengine/geodata/BlockNull;
    #69 = Utf8               _blocks
    #70 = Utf8               [[Lext/mods/gameserver/geoengine/geodata/ABlock;
    #71 = NameAndType        #69:#70      // _blocks:[[Lext/mods/gameserver/geoengine/geodata/ABlock;
    #72 = Fieldref           #2.#71       // ext/mods/gameserver/geoengine/GeoEngine._blocks:[[Lext/mods/gameserver/geoengine/geodata/ABlock;
    #73 = Utf8               ext/mods/gameserver/geoengine/geodata/BlockMultilayer
    #74 = Class              #73          // ext/mods/gameserver/geoengine/geodata/BlockMultilayer
    #75 = Utf8               initialize
    #76 = NameAndType        #75:#6       // initialize:()V
    #77 = Methodref          #74.#76      // ext/mods/gameserver/geoengine/geodata/BlockMultilayer.initialize:()V
    #78 = Utf8               ext/mods/Config
    #79 = Class              #78          // ext/mods/Config
    #80 = Utf8               GEOENGINE_FILE
    #81 = Utf8               Ljava/lang/String;
    #82 = NameAndType        #80:#81      // GEOENGINE_FILE:Ljava/lang/String;
    #83 = Fieldref           #79.#82      // ext/mods/Config.GEOENGINE_FILE:Ljava/lang/String;
    #84 = Utf8               java/lang/String
    #85 = Class              #84          // java/lang/String
    #86 = Utf8               toString
    #87 = Utf8               ()Ljava/lang/String;
    #88 = NameAndType        #86:#87      // toString:()Ljava/lang/String;
    #89 = Methodref          #85.#88      // java/lang/String.toString:()Ljava/lang/String;
    #90 = Utf8               initProperties
    #91 = Utf8               (Ljava/lang/String;)Lext/mods/commons/config/ExProperties;
    #92 = NameAndType        #90:#91      // initProperties:(Ljava/lang/String;)Lext/mods/commons/config/ExProperties;
    #93 = Methodref          #79.#92      // ext/mods/Config.initProperties:(Ljava/lang/String;)Lext/mods/commons/config/ExProperties;
    #94 = Utf8               java/lang/Runtime
    #95 = Class              #94          // java/lang/Runtime
    #96 = Utf8               getRuntime
    #97 = Utf8               ()Ljava/lang/Runtime;
    #98 = NameAndType        #96:#97      // getRuntime:()Ljava/lang/Runtime;
    #99 = Methodref          #95.#98      // java/lang/Runtime.getRuntime:()Ljava/lang/Runtime;
   #100 = Utf8               availableProcessors
   #101 = Utf8               ()I
   #102 = NameAndType        #100:#101    // availableProcessors:()I
   #103 = Methodref          #95.#102     // java/lang/Runtime.availableProcessors:()I
   #104 = Utf8               kotlin/ranges/RangesKt
   #105 = Class              #104         // kotlin/ranges/RangesKt
   #106 = Utf8               coerceIn
   #107 = Utf8               (III)I
   #108 = NameAndType        #106:#107    // coerceIn:(III)I
   #109 = Methodref          #105.#108    // kotlin/ranges/RangesKt.coerceIn:(III)I
   #110 = Utf8               LOGGER
   #111 = Utf8               Lext/mods/commons/logging/CLogger;
   #112 = NameAndType        #110:#111    // LOGGER:Lext/mods/commons/logging/CLogger;
   #113 = Fieldref           #2.#112      // ext/mods/gameserver/geoengine/GeoEngine.LOGGER:Lext/mods/commons/logging/CLogger;
   #114 = Utf8               ----------------------------------------------------------------
   #115 = String             #114         // ----------------------------------------------------------------
   #116 = Utf8               ext/mods/commons/logging/CLogger
   #117 = Class              #116         // ext/mods/commons/logging/CLogger
   #118 = Utf8               info
   #119 = Utf8               (Ljava/lang/Object;)V
   #120 = NameAndType        #118:#119    // info:(Ljava/lang/Object;)V
   #121 = Methodref          #117.#120    // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
   #122 = Utf8                GeoEngine: Iniciando V2 (Zero-GC / Lock Striping / Retail Physics)
   #123 = String             #122         //  GeoEngine: Iniciando V2 (Zero-GC / Lock Striping / Retail Physics)
   #124 = Utf8                Threads detectadas: \u0001 | Usando: \u0001 threads para Geodata
   #125 = String             #124         //  Threads detectadas: \u0001 | Usando: \u0001 threads para Geodata
   #126 = Utf8               java/lang/invoke/StringConcatFactory
   #127 = Class              #126         // java/lang/invoke/StringConcatFactory
   #128 = Utf8               makeConcatWithConstants
   #129 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #130 = NameAndType        #128:#129    // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #131 = Methodref          #127.#130    // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #132 = MethodHandle       6:#131       // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #133 = Utf8               (II)Ljava/lang/String;
   #134 = NameAndType        #128:#133    // makeConcatWithConstants:(II)Ljava/lang/String;
   #135 = InvokeDynamic      #0:#134      // #0:makeConcatWithConstants:(II)Ljava/lang/String;
   #136 = Utf8               ext/mods/gameserver/geoengine/GeoEngine$2
   #137 = Class              #136         // ext/mods/gameserver/geoengine/GeoEngine$2
   #138 = Utf8               (ILext/mods/commons/config/ExProperties;Lext/mods/gameserver/geoengine/GeoEngine;Lkotlin/coroutines/Continuation;)V
   #139 = NameAndType        #5:#138      // "<init>":(ILext/mods/commons/config/ExProperties;Lext/mods/gameserver/geoengine/GeoEngine;Lkotlin/coroutines/Continuation;)V
   #140 = Methodref          #137.#139    // ext/mods/gameserver/geoengine/GeoEngine$2."<init>":(ILext/mods/commons/config/ExProperties;Lext/mods/gameserver/geoengine/GeoEngine;Lkotlin/coroutines/Continuation;)V
   #141 = Utf8               kotlin/jvm/functions/Function2
   #142 = Class              #141         // kotlin/jvm/functions/Function2
   #143 = Utf8               kotlinx/coroutines/BuildersKt
   #144 = Class              #143         // kotlinx/coroutines/BuildersKt
   #145 = Utf8               runBlocking$default
   #146 = Utf8               (Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;
   #147 = NameAndType        #145:#146    // runBlocking$default:(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;
   #148 = Methodref          #144.#147    // kotlinx/coroutines/BuildersKt.runBlocking$default:(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;
   #149 = Utf8               kotlin/Pair
   #150 = Class              #149         // kotlin/Pair
   #151 = Utf8               component1
   #152 = Utf8               ()Ljava/lang/Object;
   #153 = NameAndType        #151:#152    // component1:()Ljava/lang/Object;
   #154 = Methodref          #150.#153    // kotlin/Pair.component1:()Ljava/lang/Object;
   #155 = Utf8               java/lang/Number
   #156 = Class              #155         // java/lang/Number
   #157 = Utf8               intValue
   #158 = NameAndType        #157:#101    // intValue:()I
   #159 = Methodref          #156.#158    // java/lang/Number.intValue:()I
   #160 = Utf8               component2
   #161 = NameAndType        #160:#152    // component2:()Ljava/lang/Object;
   #162 = Methodref          #150.#161    // kotlin/Pair.component2:()Ljava/lang/Object;
   #163 = Utf8                Geodata Carregada: \u0001 Sucessos / \u0001 Falhas
   #164 = String             #163         //  Geodata Carregada: \u0001 Sucessos / \u0001 Falhas
   #165 = InvokeDynamic      #1:#134      // #1:makeConcatWithConstants:(II)Ljava/lang/String;
   #166 = Utf8               release
   #167 = NameAndType        #166:#6      // release:()V
   #168 = Methodref          #74.#167     // ext/mods/gameserver/geoengine/geodata/BlockMultilayer.release:()V
   #169 = Utf8               java/io/File
   #170 = Class              #169         // java/io/File
   #171 = Utf8               GEODATA_PATH
   #172 = NameAndType        #171:#81     // GEODATA_PATH:Ljava/lang/String;
   #173 = Fieldref           #79.#172     // ext/mods/Config.GEODATA_PATH:Ljava/lang/String;
   #174 = Utf8               \u0001geo_bugs.txt
   #175 = String             #174         // \u0001geo_bugs.txt
   #176 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #177 = NameAndType        #128:#176    // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #178 = InvokeDynamic      #2:#177      // #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #179 = Utf8               (Ljava/lang/String;)V
   #180 = NameAndType        #5:#179      // "<init>":(Ljava/lang/String;)V
   #181 = Methodref          #170.#180    // java/io/File."<init>":(Ljava/lang/String;)V
   #182 = Utf8               java/io/PrintWriter
   #183 = Class              #182         // java/io/PrintWriter
   #184 = Utf8               java/io/FileOutputStream
   #185 = Class              #184         // java/io/FileOutputStream
   #186 = Utf8               (Ljava/io/File;Z)V
   #187 = NameAndType        #5:#186      // "<init>":(Ljava/io/File;Z)V
   #188 = Methodref          #185.#187    // java/io/FileOutputStream."<init>":(Ljava/io/File;Z)V
   #189 = Utf8               java/io/OutputStream
   #190 = Class              #189         // java/io/OutputStream
   #191 = Utf8               (Ljava/io/OutputStream;Z)V
   #192 = NameAndType        #5:#191      // "<init>":(Ljava/io/OutputStream;Z)V
   #193 = Methodref          #183.#192    // java/io/PrintWriter."<init>":(Ljava/io/OutputStream;Z)V
   #194 = Utf8               Couldn\'t load \"geo_bugs.txt\" file.
   #195 = String             #194         // Couldn\'t load \"geo_bugs.txt\" file.
   #196 = Utf8               java/lang/Throwable
   #197 = Class              #196         // java/lang/Throwable
   #198 = Utf8               error
   #199 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
   #200 = NameAndType        #198:#199    // error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
   #201 = Methodref          #117.#200    // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
   #202 = Utf8               _geoBugReports
   #203 = Utf8               Ljava/io/PrintWriter;
   #204 = NameAndType        #202:#203    // _geoBugReports:Ljava/io/PrintWriter;
   #205 = Fieldref           #2.#204      // ext/mods/gameserver/geoengine/GeoEngine._geoBugReports:Ljava/io/PrintWriter;
   #206 = Utf8               USE_L2BR_PATHFINDING
   #207 = Utf8               Z
   #208 = NameAndType        #206:#207    // USE_L2BR_PATHFINDING:Z
   #209 = Fieldref           #79.#208     // ext/mods/Config.USE_L2BR_PATHFINDING:Z
   #210 = Utf8               ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge
   #211 = Class              #210         // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge
   #212 = Utf8               Companion
   #213 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion;
   #214 = NameAndType        #212:#213    // Companion:Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion;
   #215 = Fieldref           #211.#214    // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge.Companion:Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion;
   #216 = Utf8               ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion
   #217 = Class              #216         // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion
   #218 = Utf8               getInstance
   #219 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;
   #220 = NameAndType        #218:#219    // getInstance:()Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;
   #221 = Methodref          #217.#220    // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion.getInstance:()Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;
   #222 = Utf8               ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineLegacyAdapter
   #223 = Class              #222         // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineLegacyAdapter
   #224 = Utf8               (Lext/mods/gameserver/geoengine/GeoEngine;)V
   #225 = NameAndType        #5:#224      // "<init>":(Lext/mods/gameserver/geoengine/GeoEngine;)V
   #226 = Methodref          #223.#225    // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineLegacyAdapter."<init>":(Lext/mods/gameserver/geoengine/GeoEngine;)V
   #227 = Utf8               ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$GeoEngineInterface
   #228 = Class              #227         // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$GeoEngineInterface
   #229 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$GeoEngineInterface;)V
   #230 = NameAndType        #75:#229     // initialize:(Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$GeoEngineInterface;)V
   #231 = Methodref          #211.#230    // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge.initialize:(Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$GeoEngineInterface;)V
   #232 = Utf8               loadL2BRRegions$default
   #233 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;Ljava/util/List;ILjava/lang/Object;)V
   #234 = NameAndType        #232:#233    // loadL2BRRegions$default:(Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;Ljava/util/List;ILjava/lang/Object;)V
   #235 = Methodref          #211.#234    // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge.loadL2BRRegions$default:(Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;Ljava/util/List;ILjava/lang/Object;)V
   #236 = Utf8               Falha ao inicializar GeoEngineBridge (L2BR)
   #237 = String             #236         // Falha ao inicializar GeoEngineBridge (L2BR)
   #238 = Utf8               bugFile
   #239 = Utf8               Ljava/io/File;
   #240 = Utf8               e
   #241 = Utf8               Ljava/lang/Exception;
   #242 = Utf8               bridge
   #243 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;
   #244 = Utf8               adapter
   #245 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineLegacyAdapter;
   #246 = Utf8               props
   #247 = Utf8               Lext/mods/commons/config/ExProperties;
   #248 = Utf8               cpuCores
   #249 = Utf8               parallelism
   #250 = Utf8               loaded
   #251 = Utf8               failed
   #252 = Utf8               writer
   #253 = Utf8               this
   #254 = Utf8               Lext/mods/gameserver/geoengine/GeoEngine;
   #255 = Class              #29          // "[Ljava/util/concurrent/locks/StampedLock;"
   #256 = Class              #45          // "[J"
   #257 = Class              #70          // "[[Lext/mods/gameserver/geoengine/geodata/ABlock;"
   #258 = Utf8               ext/mods/commons/config/ExProperties
   #259 = Class              #258         // ext/mods/commons/config/ExProperties
   #260 = Utf8               getLockFor
   #261 = Utf8               (II)Ljava/util/concurrent/locks/StampedLock;
   #262 = Utf8               $i$f$getLockFor
   #263 = Utf8               index
   #264 = Utf8               bx
   #265 = Utf8               by
   #266 = Utf8               getGeoKey
   #267 = Utf8               (III)J
   #268 = Long               262143l
   #270 = Utf8               $i$f$getGeoKey
   #271 = Utf8               geoX
   #272 = Utf8               geoY
   #273 = Utf8               z
   #274 = Utf8               hashKeyPadded
   #275 = Utf8               (J)I
   #276 = Integer            -2048144789
   #277 = Integer            -1028477387
   #278 = Utf8               $i$f$hashKeyPadded
   #279 = Utf8               h
   #280 = Utf8               baseIndex
   #281 = Utf8               key
   #282 = Utf8               J
   #283 = Utf8               loadGeoBlocks
   #284 = Utf8               (IILkotlin/coroutines/Continuation;)Ljava/lang/Object;
   #285 = Utf8               (IILkotlin/coroutines/Continuation<-Ljava/lang/Boolean;>;)Ljava/lang/Object;
   #286 = Utf8               ext/mods/gameserver/geoengine/GeoEngine$loadGeoBlocks$1
   #287 = Class              #286         // ext/mods/gameserver/geoengine/GeoEngine$loadGeoBlocks$1
   #288 = Utf8               label
   #289 = NameAndType        #288:#22     // label:I
   #290 = Fieldref           #287.#289    // ext/mods/gameserver/geoengine/GeoEngine$loadGeoBlocks$1.label:I
   #291 = Integer            -2147483648
   #292 = Utf8               (Lext/mods/gameserver/geoengine/GeoEngine;Lkotlin/coroutines/Continuation;)V
   #293 = NameAndType        #5:#292      // "<init>":(Lext/mods/gameserver/geoengine/GeoEngine;Lkotlin/coroutines/Continuation;)V
   #294 = Methodref          #287.#293    // ext/mods/gameserver/geoengine/GeoEngine$loadGeoBlocks$1."<init>":(Lext/mods/gameserver/geoengine/GeoEngine;Lkotlin/coroutines/Continuation;)V
   #295 = Utf8               result
   #296 = Utf8               Ljava/lang/Object;
   #297 = NameAndType        #295:#296    // result:Ljava/lang/Object;
   #298 = Fieldref           #287.#297    // ext/mods/gameserver/geoengine/GeoEngine$loadGeoBlocks$1.result:Ljava/lang/Object;
   #299 = Utf8               kotlin/coroutines/intrinsics/IntrinsicsKt
   #300 = Class              #299         // kotlin/coroutines/intrinsics/IntrinsicsKt
   #301 = Utf8               getCOROUTINE_SUSPENDED
   #302 = NameAndType        #301:#152    // getCOROUTINE_SUSPENDED:()Ljava/lang/Object;
   #303 = Methodref          #300.#302    // kotlin/coroutines/intrinsics/IntrinsicsKt.getCOROUTINE_SUSPENDED:()Ljava/lang/Object;
   #304 = Utf8               kotlin/ResultKt
   #305 = Class              #304         // kotlin/ResultKt
   #306 = Utf8               throwOnFailure
   #307 = NameAndType        #306:#119    // throwOnFailure:(Ljava/lang/Object;)V
   #308 = Methodref          #305.#307    // kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
   #309 = Utf8               kotlin/jvm/internal/StringCompanionObject
   #310 = Class              #309         // kotlin/jvm/internal/StringCompanionObject
   #311 = Utf8               Lkotlin/jvm/internal/StringCompanionObject;
   #312 = NameAndType        #65:#311     // INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;
   #313 = Fieldref           #310.#312    // kotlin/jvm/internal/StringCompanionObject.INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;
   #314 = Utf8               GEODATA_TYPE
   #315 = Utf8               Lext/mods/gameserver/enums/GeoType;
   #316 = NameAndType        #314:#315    // GEODATA_TYPE:Lext/mods/gameserver/enums/GeoType;
   #317 = Fieldref           #79.#316     // ext/mods/Config.GEODATA_TYPE:Lext/mods/gameserver/enums/GeoType;
   #318 = Utf8               ext/mods/gameserver/enums/GeoType
   #319 = Class              #318         // ext/mods/gameserver/enums/GeoType
   #320 = Utf8               getFilename
   #321 = NameAndType        #320:#87     // getFilename:()Ljava/lang/String;
   #322 = Methodref          #319.#321    // ext/mods/gameserver/enums/GeoType.getFilename:()Ljava/lang/String;
   #323 = Utf8               kotlin/coroutines/jvm/internal/Boxing
   #324 = Class              #323         // kotlin/coroutines/jvm/internal/Boxing
   #325 = Utf8               boxInt
   #326 = Utf8               (I)Ljava/lang/Integer;
   #327 = NameAndType        #325:#326    // boxInt:(I)Ljava/lang/Integer;
   #328 = Methodref          #324.#327    // kotlin/coroutines/jvm/internal/Boxing.boxInt:(I)Ljava/lang/Integer;
   #329 = Utf8               java/util/Arrays
   #330 = Class              #329         // java/util/Arrays
   #331 = Utf8               copyOf
   #332 = Utf8               ([Ljava/lang/Object;I)[Ljava/lang/Object;
   #333 = NameAndType        #331:#332    // copyOf:([Ljava/lang/Object;I)[Ljava/lang/Object;
   #334 = Methodref          #330.#333    // java/util/Arrays.copyOf:([Ljava/lang/Object;I)[Ljava/lang/Object;
   #335 = Utf8               format
   #336 = Utf8               (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
   #337 = NameAndType        #335:#336    // format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
   #338 = Methodref          #85.#337     // java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
   #339 = Utf8               format(...)
   #340 = String             #339         // format(...)
   #341 = Utf8               kotlin/jvm/internal/Intrinsics
   #342 = Class              #341         // kotlin/jvm/internal/Intrinsics
   #343 = Utf8               checkNotNullExpressionValue
   #344 = Utf8               (Ljava/lang/Object;Ljava/lang/String;)V
   #345 = NameAndType        #343:#344    // checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
   #346 = Methodref          #342.#345    // kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
   #347 = Utf8               \u0001\u0001
   #348 = String             #347         // \u0001\u0001
   #349 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #350 = NameAndType        #128:#349    // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #351 = InvokeDynamic      #3:#350      // #3:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #352 = Utf8               java/io/RandomAccessFile
   #353 = Class              #352         // java/io/RandomAccessFile
   #354 = Utf8               r
   #355 = String             #354         // r
   #356 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
   #357 = NameAndType        #5:#356      // "<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #358 = Methodref          #353.#357    // java/io/RandomAccessFile."<init>":(Ljava/lang/String;Ljava/lang/String;)V
   #359 = Utf8               java/io/Closeable
   #360 = Class              #359         // java/io/Closeable
   #361 = Utf8               getChannel
   #362 = Utf8               ()Ljava/nio/channels/FileChannel;
   #363 = NameAndType        #361:#362    // getChannel:()Ljava/nio/channels/FileChannel;
   #364 = Methodref          #353.#363    // java/io/RandomAccessFile.getChannel:()Ljava/nio/channels/FileChannel;
   #365 = Utf8               java/nio/channels/FileChannel
   #366 = Class              #365         // java/nio/channels/FileChannel
   #367 = Utf8               java/nio/channels/FileChannel$MapMode
   #368 = Class              #367         // java/nio/channels/FileChannel$MapMode
   #369 = Utf8               READ_ONLY
   #370 = Utf8               Ljava/nio/channels/FileChannel$MapMode;
   #371 = NameAndType        #369:#370    // READ_ONLY:Ljava/nio/channels/FileChannel$MapMode;
   #372 = Fieldref           #368.#371    // java/nio/channels/FileChannel$MapMode.READ_ONLY:Ljava/nio/channels/FileChannel$MapMode;
   #373 = Utf8               size
   #374 = Utf8               ()J
   #375 = NameAndType        #373:#374    // size:()J
   #376 = Methodref          #366.#375    // java/nio/channels/FileChannel.size:()J
   #377 = Utf8               map
   #378 = Utf8               (Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;
   #379 = NameAndType        #377:#378    // map:(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;
   #380 = Methodref          #366.#379    // java/nio/channels/FileChannel.map:(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;
   #381 = Utf8               java/nio/MappedByteBuffer
   #382 = Class              #381         // java/nio/MappedByteBuffer
   #383 = Utf8               load
   #384 = Utf8               ()Ljava/nio/MappedByteBuffer;
   #385 = NameAndType        #383:#384    // load:()Ljava/nio/MappedByteBuffer;
   #386 = Methodref          #382.#385    // java/nio/MappedByteBuffer.load:()Ljava/nio/MappedByteBuffer;
   #387 = Utf8               java/nio/ByteOrder
   #388 = Class              #387         // java/nio/ByteOrder
   #389 = Utf8               LITTLE_ENDIAN
   #390 = Utf8               Ljava/nio/ByteOrder;
   #391 = NameAndType        #389:#390    // LITTLE_ENDIAN:Ljava/nio/ByteOrder;
   #392 = Fieldref           #388.#391    // java/nio/ByteOrder.LITTLE_ENDIAN:Ljava/nio/ByteOrder;
   #393 = Utf8               order
   #394 = Utf8               (Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
   #395 = NameAndType        #393:#394    // order:(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
   #396 = Methodref          #382.#395    // java/nio/MappedByteBuffer.order:(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
   #397 = Utf8               ext/mods/gameserver/geoengine/GeoEngine$WhenMappings
   #398 = Class              #397         // ext/mods/gameserver/geoengine/GeoEngine$WhenMappings
   #399 = Utf8               $EnumSwitchMapping$0
   #400 = Utf8               [I
   #401 = NameAndType        #399:#400    // $EnumSwitchMapping$0:[I
   #402 = Fieldref           #398.#401    // ext/mods/gameserver/geoengine/GeoEngine$WhenMappings.$EnumSwitchMapping$0:[I
   #403 = Utf8               ordinal
   #404 = NameAndType        #403:#101    // ordinal:()I
   #405 = Methodref          #319.#404    // ext/mods/gameserver/enums/GeoType.ordinal:()I
   #406 = Utf8               position
   #407 = NameAndType        #406:#101    // position:()I
   #408 = Methodref          #382.#407    // java/nio/MappedByteBuffer.position:()I
   #409 = Utf8               (I)Ljava/nio/MappedByteBuffer;
   #410 = NameAndType        #406:#409    // position:(I)Ljava/nio/MappedByteBuffer;
   #411 = Methodref          #382.#410    // java/nio/MappedByteBuffer.position:(I)Ljava/nio/MappedByteBuffer;
   #412 = Utf8               kotlin/Unit
   #413 = Class              #412         // kotlin/Unit
   #414 = Utf8               Lkotlin/Unit;
   #415 = NameAndType        #65:#414     // INSTANCE:Lkotlin/Unit;
   #416 = Fieldref           #413.#415    // kotlin/Unit.INSTANCE:Lkotlin/Unit;
   #417 = Utf8               get
   #418 = Utf8               ()B
   #419 = NameAndType        #417:#418    // get:()B
   #420 = Methodref          #382.#419    // java/nio/MappedByteBuffer.get:()B
   #421 = Utf8               ext/mods/gameserver/geoengine/geodata/BlockFlat
   #422 = Class              #421         // ext/mods/gameserver/geoengine/geodata/BlockFlat
   #423 = Utf8               java/nio/ByteBuffer
   #424 = Class              #423         // java/nio/ByteBuffer
   #425 = Utf8               (Ljava/nio/ByteBuffer;Lext/mods/gameserver/enums/GeoType;)V
   #426 = NameAndType        #5:#425      // "<init>":(Ljava/nio/ByteBuffer;Lext/mods/gameserver/enums/GeoType;)V
   #427 = Methodref          #422.#426    // ext/mods/gameserver/geoengine/geodata/BlockFlat."<init>":(Ljava/nio/ByteBuffer;Lext/mods/gameserver/enums/GeoType;)V
   #428 = Utf8               ext/mods/gameserver/geoengine/geodata/BlockComplex
   #429 = Class              #428         // ext/mods/gameserver/geoengine/geodata/BlockComplex
   #430 = Utf8               (Ljava/nio/ByteBuffer;)V
   #431 = NameAndType        #5:#430      // "<init>":(Ljava/nio/ByteBuffer;)V
   #432 = Methodref          #429.#431    // ext/mods/gameserver/geoengine/geodata/BlockComplex."<init>":(Ljava/nio/ByteBuffer;)V
   #433 = Utf8               L$0
   #434 = NameAndType        #433:#296    // L$0:Ljava/lang/Object;
   #435 = Fieldref           #287.#434    // ext/mods/gameserver/geoengine/GeoEngine$loadGeoBlocks$1.L$0:Ljava/lang/Object;
   #436 = Utf8               kotlin/coroutines/jvm/internal/SpillingKt
   #437 = Class              #436         // kotlin/coroutines/jvm/internal/SpillingKt
   #438 = Utf8               nullOutSpilledVariable
   #439 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #440 = NameAndType        #438:#439    // nullOutSpilledVariable:(Ljava/lang/Object;)Ljava/lang/Object;
   #441 = Methodref          #437.#440    // kotlin/coroutines/jvm/internal/SpillingKt.nullOutSpilledVariable:(Ljava/lang/Object;)Ljava/lang/Object;
   #442 = Utf8               L$1
   #443 = NameAndType        #442:#296    // L$1:Ljava/lang/Object;
   #444 = Fieldref           #287.#443    // ext/mods/gameserver/geoengine/GeoEngine$loadGeoBlocks$1.L$1:Ljava/lang/Object;
   #445 = Utf8               L$2
   #446 = NameAndType        #445:#296    // L$2:Ljava/lang/Object;
   #447 = Fieldref           #287.#446    // ext/mods/gameserver/geoengine/GeoEngine$loadGeoBlocks$1.L$2:Ljava/lang/Object;
   #448 = Utf8               L$3
   #449 = NameAndType        #448:#296    // L$3:Ljava/lang/Object;
   #450 = Fieldref           #287.#449    // ext/mods/gameserver/geoengine/GeoEngine$loadGeoBlocks$1.L$3:Ljava/lang/Object;
   #451 = Utf8               L$4
   #452 = NameAndType        #451:#296    // L$4:Ljava/lang/Object;
   #453 = Fieldref           #287.#452    // ext/mods/gameserver/geoengine/GeoEngine$loadGeoBlocks$1.L$4:Ljava/lang/Object;
   #454 = Utf8               L$5
   #455 = NameAndType        #454:#296    // L$5:Ljava/lang/Object;
   #456 = Fieldref           #287.#455    // ext/mods/gameserver/geoengine/GeoEngine$loadGeoBlocks$1.L$5:Ljava/lang/Object;
   #457 = Utf8               L$6
   #458 = NameAndType        #457:#296    // L$6:Ljava/lang/Object;
   #459 = Fieldref           #287.#458    // ext/mods/gameserver/geoengine/GeoEngine$loadGeoBlocks$1.L$6:Ljava/lang/Object;
   #460 = Utf8               L$7
   #461 = NameAndType        #460:#296    // L$7:Ljava/lang/Object;
   #462 = Fieldref           #287.#461    // ext/mods/gameserver/geoengine/GeoEngine$loadGeoBlocks$1.L$7:Ljava/lang/Object;
   #463 = Utf8               L$8
   #464 = NameAndType        #463:#296    // L$8:Ljava/lang/Object;
   #465 = Fieldref           #287.#464    // ext/mods/gameserver/geoengine/GeoEngine$loadGeoBlocks$1.L$8:Ljava/lang/Object;
   #466 = Utf8               I$0
   #467 = NameAndType        #466:#22     // I$0:I
   #468 = Fieldref           #287.#467    // ext/mods/gameserver/geoengine/GeoEngine$loadGeoBlocks$1.I$0:I
   #469 = Utf8               I$1
   #470 = NameAndType        #469:#22     // I$1:I
   #471 = Fieldref           #287.#470    // ext/mods/gameserver/geoengine/GeoEngine$loadGeoBlocks$1.I$1:I
   #472 = Utf8               I$2
   #473 = NameAndType        #472:#22     // I$2:I
   #474 = Fieldref           #287.#473    // ext/mods/gameserver/geoengine/GeoEngine$loadGeoBlocks$1.I$2:I
   #475 = Utf8               I$3
   #476 = NameAndType        #475:#22     // I$3:I
   #477 = Fieldref           #287.#476    // ext/mods/gameserver/geoengine/GeoEngine$loadGeoBlocks$1.I$3:I
   #478 = Utf8               I$4
   #479 = NameAndType        #478:#22     // I$4:I
   #480 = Fieldref           #287.#479    // ext/mods/gameserver/geoengine/GeoEngine$loadGeoBlocks$1.I$4:I
   #481 = Utf8               I$5
   #482 = NameAndType        #481:#22     // I$5:I
   #483 = Fieldref           #287.#482    // ext/mods/gameserver/geoengine/GeoEngine$loadGeoBlocks$1.I$5:I
   #484 = Utf8               I$6
   #485 = NameAndType        #484:#22     // I$6:I
   #486 = Fieldref           #287.#485    // ext/mods/gameserver/geoengine/GeoEngine$loadGeoBlocks$1.I$6:I
   #487 = Utf8               I$7
   #488 = NameAndType        #487:#22     // I$7:I
   #489 = Fieldref           #287.#488    // ext/mods/gameserver/geoengine/GeoEngine$loadGeoBlocks$1.I$7:I
   #490 = Utf8               B$0
   #491 = Utf8               B
   #492 = NameAndType        #490:#491    // B$0:B
   #493 = Fieldref           #287.#492    // ext/mods/gameserver/geoengine/GeoEngine$loadGeoBlocks$1.B$0:B
   #494 = Utf8               I$8
   #495 = NameAndType        #494:#22     // I$8:I
   #496 = Fieldref           #287.#495    // ext/mods/gameserver/geoengine/GeoEngine$loadGeoBlocks$1.I$8:I
   #497 = Utf8               kotlinx/coroutines/sync/Mutex
   #498 = Class              #497         // kotlinx/coroutines/sync/Mutex
   #499 = Utf8               lock
   #500 = Utf8               (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
   #501 = NameAndType        #499:#500    // lock:(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
   #502 = InterfaceMethodref #498.#501    // kotlinx/coroutines/sync/Mutex.lock:(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
   #503 = Methodref          #74.#426     // ext/mods/gameserver/geoengine/geodata/BlockMultilayer."<init>":(Ljava/nio/ByteBuffer;Lext/mods/gameserver/enums/GeoType;)V
   #504 = Utf8               unlock
   #505 = NameAndType        #504:#119    // unlock:(Ljava/lang/Object;)V
   #506 = InterfaceMethodref #498.#505    // kotlinx/coroutines/sync/Mutex.unlock:(Ljava/lang/Object;)V
   #507 = Utf8               java/lang/IllegalArgumentException
   #508 = Class              #507         // java/lang/IllegalArgumentException
   #509 = Utf8               Unknown block type: \u0001
   #510 = String             #509         // Unknown block type: \u0001
   #511 = Utf8               (B)Ljava/lang/String;
   #512 = NameAndType        #128:#511    // makeConcatWithConstants:(B)Ljava/lang/String;
   #513 = InvokeDynamic      #4:#512      // #4:makeConcatWithConstants:(B)Ljava/lang/String;
   #514 = Methodref          #508.#180    // java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
   #515 = Utf8               getShort
   #516 = Utf8               ()S
   #517 = NameAndType        #515:#516    // getShort:()S
   #518 = Methodref          #382.#517    // java/nio/MappedByteBuffer.getShort:()S
   #519 = Utf8               S$0
   #520 = Utf8               S
   #521 = NameAndType        #519:#520    // S$0:S
   #522 = Fieldref           #287.#521    // ext/mods/gameserver/geoengine/GeoEngine$loadGeoBlocks$1.S$0:S
   #523 = Utf8               remaining
   #524 = NameAndType        #523:#101    // remaining:()I
   #525 = Methodref          #382.#524    // java/nio/MappedByteBuffer.remaining:()I
   #526 = Utf8               Region file {} can be corrupted.
   #527 = String             #526         // Region file {} can be corrupted.
   #528 = Utf8               warn
   #529 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
   #530 = NameAndType        #528:#529    // warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #531 = Methodref          #117.#530    // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #532 = Utf8               boxBoolean
   #533 = Utf8               (Z)Ljava/lang/Boolean;
   #534 = NameAndType        #532:#533    // boxBoolean:(Z)Ljava/lang/Boolean;
   #535 = Methodref          #324.#534    // kotlin/coroutines/jvm/internal/Boxing.boxBoolean:(Z)Ljava/lang/Boolean;
   #536 = Utf8               kotlin/io/CloseableKt
   #537 = Class              #536         // kotlin/io/CloseableKt
   #538 = Utf8               closeFinally
   #539 = Utf8               (Ljava/io/Closeable;Ljava/lang/Throwable;)V
   #540 = NameAndType        #538:#539    // closeFinally:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
   #541 = Methodref          #537.#540    // kotlin/io/CloseableKt.closeFinally:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
   #542 = Utf8               Error loading {} region file.
   #543 = String             #542         // Error loading {} region file.
   #544 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
   #545 = NameAndType        #198:#544    // error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
   #546 = Methodref          #117.#545    // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
   #547 = Utf8               loadNullBlocks
   #548 = Utf8               (II)V
   #549 = NameAndType        #547:#548    // loadNullBlocks:(II)V
   #550 = Methodref          #2.#549      // ext/mods/gameserver/geoengine/GeoEngine.loadNullBlocks:(II)V
   #551 = Utf8               java/lang/IllegalStateException
   #552 = Class              #551         // java/lang/IllegalStateException
   #553 = Utf8               call to \'resume\' before \'invoke\' with coroutine
   #554 = String             #553         // call to \'resume\' before \'invoke\' with coroutine
   #555 = Methodref          #552.#180    // java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
   #556 = Utf8               $i$a$-withLock$default-GeoEngine$loadGeoBlocks$2$1$block$1
   #557 = Utf8               $i$f$withLock
   #558 = Utf8               $this$withLock_u24default$iv
   #559 = Utf8               owner$iv
   #560 = Utf8               $completion$iv
   #561 = Utf8               Lkotlin/coroutines/Continuation;
   #562 = Utf8               type
   #563 = Utf8               $i$a$-withLock$default-GeoEngine$loadGeoBlocks$2$1$block$2
   #564 = Utf8               block
   #565 = Utf8               Lext/mods/gameserver/geoengine/geodata/ABlock;
   #566 = Utf8               iy
   #567 = Utf8               ix
   #568 = Utf8               $i$a$-use-GeoEngine$loadGeoBlocks$2$1
   #569 = Utf8               buffer
   #570 = Utf8               Ljava/nio/MappedByteBuffer;
   #571 = Utf8               blockX
   #572 = Utf8               blockY
   #573 = Utf8               fc
   #574 = Utf8               Ljava/nio/channels/FileChannel;
   #575 = Utf8               $i$a$-use-GeoEngine$loadGeoBlocks$2
   #576 = Utf8               raf
   #577 = Utf8               Ljava/io/RandomAccessFile;
   #578 = Utf8               filename
   #579 = Utf8               filepath
   #580 = Utf8               regionX
   #581 = Utf8               regionY
   #582 = Utf8               $completion
   #583 = Utf8               $continuation
   #584 = Utf8               $result
   #585 = Utf8               kotlin/coroutines/Continuation
   #586 = Class              #585         // kotlin/coroutines/Continuation
   #587 = Utf8               getBlockRaw
   #588 = Utf8               (II)Lext/mods/gameserver/geoengine/geodata/ABlock;
   #589 = Utf8               tryOptimisticRead
   #590 = NameAndType        #589:#374    // tryOptimisticRead:()J
   #591 = Methodref          #26.#590     // java/util/concurrent/locks/StampedLock.tryOptimisticRead:()J
   #592 = Utf8               validate
   #593 = Utf8               (J)Z
   #594 = NameAndType        #592:#593    // validate:(J)Z
   #595 = Methodref          #26.#594     // java/util/concurrent/locks/StampedLock.validate:(J)Z
   #596 = Utf8               readLock
   #597 = NameAndType        #596:#374    // readLock:()J
   #598 = Methodref          #26.#597     // java/util/concurrent/locks/StampedLock.readLock:()J
   #599 = Utf8               unlockRead
   #600 = Utf8               (J)V
   #601 = NameAndType        #599:#600    // unlockRead:(J)V
   #602 = Methodref          #26.#601     // java/util/concurrent/locks/StampedLock.unlockRead:(J)V
   #603 = Utf8               index$iv
   #604 = Utf8               this_$iv
   #605 = Utf8               bx$iv
   #606 = Utf8               by$iv
   #607 = Utf8               readStamp
   #608 = Utf8               Ljava/util/concurrent/locks/StampedLock;
   #609 = Utf8               stamp
   #610 = Utf8               getBlock
   #611 = Utf8               Lorg/jetbrains/annotations/NotNull;
   #612 = NameAndType        #587:#588    // getBlockRaw:(II)Lext/mods/gameserver/geoengine/geodata/ABlock;
   #613 = Methodref          #2.#612      // ext/mods/gameserver/geoengine/GeoEngine.getBlockRaw:(II)Lext/mods/gameserver/geoengine/geodata/ABlock;
   #614 = Utf8               hasGeoPos
   #615 = Utf8               (II)Z
   #616 = Utf8               ()Z
   #617 = NameAndType        #614:#616    // hasGeoPos:()Z
   #618 = Methodref          #62.#617     // ext/mods/gameserver/geoengine/geodata/ABlock.hasGeoPos:()Z
   #619 = Utf8               getHeightNearest
   #620 = Utf8               (III)S
   #621 = Utf8               (IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)S
   #622 = NameAndType        #619:#621    // getHeightNearest:(IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)S
   #623 = Methodref          #62.#622     // ext/mods/gameserver/geoengine/geodata/ABlock.getHeightNearest:(IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)S
   #624 = Utf8               geoX$iv
   #625 = Utf8               geoY$iv
   #626 = Utf8               z$iv
   #627 = Utf8               h$iv
   #628 = Utf8               baseIndex$iv
   #629 = Utf8               key$iv
   #630 = Utf8               height
   #631 = Utf8               worldZ
   #632 = Utf8               Lorg/jetbrains/annotations/Nullable;
   #633 = NameAndType        #619:#620    // getHeightNearest:(III)S
   #634 = Methodref          #2.#633      // ext/mods/gameserver/geoengine/GeoEngine.getHeightNearest:(III)S
   #635 = Utf8               ignore
   #636 = Utf8               Lext/mods/gameserver/geoengine/geodata/IGeoObject;
   #637 = Utf8               getNsweNearest
   #638 = Utf8               (III)B
   #639 = Utf8               (IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)B
   #640 = NameAndType        #637:#639    // getNsweNearest:(IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)B
   #641 = Methodref          #62.#640     // ext/mods/gameserver/geoengine/geodata/ABlock.getNsweNearest:(IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)B
   #642 = Utf8               nswe
   #643 = NameAndType        #637:#638    // getNsweNearest:(III)B
   #644 = Methodref          #2.#643      // ext/mods/gameserver/geoengine/GeoEngine.getNsweNearest:(III)B
   #645 = Utf8               hasGeo
   #646 = Utf8               Lext/mods/gameserver/geoengine/GeoEngine$Companion;
   #647 = NameAndType        #212:#646    // Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
   #648 = Fieldref           #2.#647      // ext/mods/gameserver/geoengine/GeoEngine.Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
   #649 = Utf8               ext/mods/gameserver/geoengine/GeoEngine$Companion
   #650 = Class              #649         // ext/mods/gameserver/geoengine/GeoEngine$Companion
   #651 = Utf8               getGeoX
   #652 = Utf8               (I)I
   #653 = NameAndType        #651:#652    // getGeoX:(I)I
   #654 = Methodref          #650.#653    // ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoX:(I)I
   #655 = Utf8               getGeoY
   #656 = NameAndType        #655:#652    // getGeoY:(I)I
   #657 = Methodref          #650.#656    // ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoY:(I)I
   #658 = NameAndType        #614:#615    // hasGeoPos:(II)Z
   #659 = Methodref          #2.#658      // ext/mods/gameserver/geoengine/GeoEngine.hasGeoPos:(II)Z
   #660 = Utf8               worldX
   #661 = Utf8               worldY
   #662 = Utf8               getHeight
   #663 = Utf8               (Lext/mods/gameserver/model/location/Location;)S
   #664 = Utf8               ext/mods/gameserver/model/location/Location
   #665 = Class              #664         // ext/mods/gameserver/model/location/Location
   #666 = Utf8               getX
   #667 = NameAndType        #666:#101    // getX:()I
   #668 = Methodref          #665.#667    // ext/mods/gameserver/model/location/Location.getX:()I
   #669 = Utf8               getY
   #670 = NameAndType        #669:#101    // getY:()I
   #671 = Methodref          #665.#670    // ext/mods/gameserver/model/location/Location.getY:()I
   #672 = Utf8               getZ
   #673 = NameAndType        #672:#101    // getZ:()I
   #674 = Methodref          #665.#673    // ext/mods/gameserver/model/location/Location.getZ:()I
   #675 = Utf8               loc
   #676 = Utf8               Lext/mods/gameserver/model/location/Location;
   #677 = Utf8               getNswe
   #678 = Utf8               getBoundaryRadiusCells
   #679 = Utf8               BOUNDARY_BUFFER
   #680 = NameAndType        #679:#22     // BOUNDARY_BUFFER:I
   #681 = Fieldref           #79.#680     // ext/mods/Config.BOUNDARY_BUFFER:I
   #682 = Utf8               coerceAtLeast
   #683 = Utf8               (II)I
   #684 = NameAndType        #682:#683    // coerceAtLeast:(II)I
   #685 = Methodref          #105.#684    // kotlin/ranges/RangesKt.coerceAtLeast:(II)I
   #686 = Utf8               hasBlockedNeighborAtSameLevel
   #687 = Utf8               (III)Z
   #688 = NameAndType        #678:#101    // getBoundaryRadiusCells:()I
   #689 = Methodref          #2.#688      // ext/mods/gameserver/geoengine/GeoEngine.getBoundaryRadiusCells:()I
   #690 = Integer            32768
   #691 = NameAndType        #610:#588    // getBlock:(II)Lext/mods/gameserver/geoengine/geodata/ABlock;
   #692 = Methodref          #2.#691      // ext/mods/gameserver/geoengine/GeoEngine.getBlock:(II)Lext/mods/gameserver/geoengine/geodata/ABlock;
   #693 = Utf8               getIndexBelow
   #694 = Utf8               (IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)I
   #695 = NameAndType        #693:#694    // getIndexBelow:(IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)I
   #696 = Methodref          #62.#695     // ext/mods/gameserver/geoengine/geodata/ABlock.getIndexBelow:(IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)I
   #697 = Utf8               (ILext/mods/gameserver/geoengine/geodata/IGeoObject;)S
   #698 = NameAndType        #662:#697    // getHeight:(ILext/mods/gameserver/geoengine/geodata/IGeoObject;)S
   #699 = Methodref          #62.#698     // ext/mods/gameserver/geoengine/geodata/ABlock.getHeight:(ILext/mods/gameserver/geoengine/geodata/IGeoObject;)S
   #700 = Utf8               java/lang/Math
   #701 = Class              #700         // java/lang/Math
   #702 = Utf8               abs
   #703 = NameAndType        #702:#652    // abs:(I)I
   #704 = Methodref          #701.#703    // java/lang/Math.abs:(I)I
   #705 = Utf8               (ILext/mods/gameserver/geoengine/geodata/IGeoObject;)B
   #706 = NameAndType        #677:#705    // getNswe:(ILext/mods/gameserver/geoengine/geodata/IGeoObject;)B
   #707 = Methodref          #62.#706     // ext/mods/gameserver/geoengine/geodata/ABlock.getNswe:(ILext/mods/gameserver/geoengine/geodata/IGeoObject;)B
   #708 = Utf8               nz
   #709 = Utf8               nx
   #710 = Utf8               ny
   #711 = Utf8               dy
   #712 = Utf8               dx
   #713 = Utf8               checkZ
   #714 = Utf8               radius
   #715 = Utf8               invalidateCacheForObject
   #716 = Utf8               (Lext/mods/gameserver/geoengine/geodata/IGeoObject;)V
   #717 = Utf8               ext/mods/gameserver/geoengine/geodata/IGeoObject
   #718 = Class              #717         // ext/mods/gameserver/geoengine/geodata/IGeoObject
   #719 = NameAndType        #651:#101    // getGeoX:()I
   #720 = InterfaceMethodref #718.#719    // ext/mods/gameserver/geoengine/geodata/IGeoObject.getGeoX:()I
   #721 = NameAndType        #655:#101    // getGeoY:()I
   #722 = InterfaceMethodref #718.#721    // ext/mods/gameserver/geoengine/geodata/IGeoObject.getGeoY:()I
   #723 = Utf8               getObjectGeoData
   #724 = Utf8               ()[[B
   #725 = NameAndType        #723:#724    // getObjectGeoData:()[[B
   #726 = InterfaceMethodref #718.#725    // ext/mods/gameserver/geoengine/geodata/IGeoObject.getObjectGeoData:()[[B
   #727 = Utf8               [Ljava/lang/Object;
   #728 = Class              #727         // "[Ljava/lang/Object;"
   #729 = Utf8               kotlin/internal/ProgressionUtilKt
   #730 = Class              #729         // kotlin/internal/ProgressionUtilKt
   #731 = Utf8               getProgressionLastElement
   #732 = NameAndType        #731:#107    // getProgressionLastElement:(III)I
   #733 = Methodref          #730.#732    // kotlin/internal/ProgressionUtilKt.getProgressionLastElement:(III)I
   #734 = Utf8               gy
   #735 = Utf8               gx
   #736 = Utf8               minGX
   #737 = Utf8               minGY
   #738 = Utf8               geoData
   #739 = Utf8               [[B
   #740 = Utf8               maxGX
   #741 = Utf8               maxGY
   #742 = Utf8               obj
   #743 = Class              #739         // "[[B"
   #744 = Utf8               addGeoObject
   #745 = Utf8               toggleGeoObject
   #746 = Utf8               (Lext/mods/gameserver/geoengine/geodata/IGeoObject;Z)V
   #747 = NameAndType        #745:#746    // toggleGeoObject:(Lext/mods/gameserver/geoengine/geodata/IGeoObject;Z)V
   #748 = Methodref          #2.#747      // ext/mods/gameserver/geoengine/GeoEngine.toggleGeoObject:(Lext/mods/gameserver/geoengine/geodata/IGeoObject;Z)V
   #749 = Utf8               removeGeoObject
   #750 = Utf8               writeLock
   #751 = NameAndType        #750:#374    // writeLock:()J
   #752 = Methodref          #26.#751     // java/util/concurrent/locks/StampedLock.writeLock:()J
   #753 = Utf8               ext/mods/gameserver/geoengine/geodata/IBlockDynamic
   #754 = Class              #753         // ext/mods/gameserver/geoengine/geodata/IBlockDynamic
   #755 = Utf8               unlockWrite
   #756 = NameAndType        #755:#600    // unlockWrite:(J)V
   #757 = Methodref          #26.#756     // java/util/concurrent/locks/StampedLock.unlockWrite:(J)V
   #758 = Utf8               ext/mods/gameserver/geoengine/geodata/BlockComplexDynamic
   #759 = Class              #758         // ext/mods/gameserver/geoengine/geodata/BlockComplexDynamic
   #760 = Utf8               (IILext/mods/gameserver/geoengine/geodata/BlockFlat;)V
   #761 = NameAndType        #5:#760      // "<init>":(IILext/mods/gameserver/geoengine/geodata/BlockFlat;)V
   #762 = Methodref          #759.#761    // ext/mods/gameserver/geoengine/geodata/BlockComplexDynamic."<init>":(IILext/mods/gameserver/geoengine/geodata/BlockFlat;)V
   #763 = Utf8               (IILext/mods/gameserver/geoengine/geodata/BlockComplex;)V
   #764 = NameAndType        #5:#763      // "<init>":(IILext/mods/gameserver/geoengine/geodata/BlockComplex;)V
   #765 = Methodref          #759.#764    // ext/mods/gameserver/geoengine/geodata/BlockComplexDynamic."<init>":(IILext/mods/gameserver/geoengine/geodata/BlockComplex;)V
   #766 = Utf8               ext/mods/gameserver/geoengine/geodata/BlockMultilayerDynamic
   #767 = Class              #766         // ext/mods/gameserver/geoengine/geodata/BlockMultilayerDynamic
   #768 = Utf8               (IILext/mods/gameserver/geoengine/geodata/BlockMultilayer;)V
   #769 = NameAndType        #5:#768      // "<init>":(IILext/mods/gameserver/geoengine/geodata/BlockMultilayer;)V
   #770 = Methodref          #767.#769    // ext/mods/gameserver/geoengine/geodata/BlockMultilayerDynamic."<init>":(IILext/mods/gameserver/geoengine/geodata/BlockMultilayer;)V
   #771 = Utf8               null cannot be cast to non-null type ext.mods.gameserver.geoengine.geodata.IBlockDynamic
   #772 = String             #771         // null cannot be cast to non-null type ext.mods.gameserver.geoengine.geodata.IBlockDynamic
   #773 = Utf8               checkNotNull
   #774 = NameAndType        #773:#344    // checkNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
   #775 = Methodref          #342.#774    // kotlin/jvm/internal/Intrinsics.checkNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
   #776 = NameAndType        #744:#716    // addGeoObject:(Lext/mods/gameserver/geoengine/geodata/IGeoObject;)V
   #777 = InterfaceMethodref #754.#776    // ext/mods/gameserver/geoengine/geodata/IBlockDynamic.addGeoObject:(Lext/mods/gameserver/geoengine/geodata/IGeoObject;)V
   #778 = NameAndType        #749:#716    // removeGeoObject:(Lext/mods/gameserver/geoengine/geodata/IGeoObject;)V
   #779 = InterfaceMethodref #754.#778    // ext/mods/gameserver/geoengine/geodata/IBlockDynamic.removeGeoObject:(Lext/mods/gameserver/geoengine/geodata/IGeoObject;)V
   #780 = NameAndType        #715:#716    // invalidateCacheForObject:(Lext/mods/gameserver/geoengine/geodata/IGeoObject;)V
   #781 = Methodref          #2.#780      // ext/mods/gameserver/geoengine/GeoEngine.invalidateCacheForObject:(Lext/mods/gameserver/geoengine/geodata/IGeoObject;)V
   #782 = Utf8               minBX
   #783 = Utf8               maxBX
   #784 = Utf8               minBY
   #785 = Utf8               maxBY
   #786 = Utf8               add
   #787 = Utf8               canMoveAround
   #788 = Utf8               canMoveWithCollisionBox
   #789 = Utf8               (IIIIIIDLext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
   #790 = Utf8               canMove
   #791 = Utf8               (IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
   #792 = NameAndType        #790:#791    // canMove:(IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
   #793 = Methodref          #2.#792      // ext/mods/gameserver/geoengine/GeoEngine.canMove:(IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
   #794 = Double             8.0d
   #796 = Utf8               max
   #797 = NameAndType        #796:#683    // max:(II)I
   #798 = Methodref          #701.#797    // java/lang/Math.max:(II)I
   #799 = Utf8               testX
   #800 = Utf8               testY
   #801 = Utf8               offsetY
   #802 = Utf8               offsetX
   #803 = Utf8               factor
   #804 = Utf8               D
   #805 = Utf8               checkX
   #806 = Utf8               checkY
   #807 = Utf8               i
   #808 = Utf8               steps
   #809 = Utf8               ox
   #810 = Utf8               oy
   #811 = Utf8               oz
   #812 = Utf8               tx
   #813 = Utf8               ty
   #814 = Utf8               tz
   #815 = Utf8               collisionRadius
   #816 = Utf8               debug
   #817 = Utf8               Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
   #818 = Utf8               ext/mods/gameserver/network/serverpackets/ExServerPrimitive
   #819 = Class              #818         // ext/mods/gameserver/network/serverpackets/ExServerPrimitive
   #820 = Utf8               isInWater
   #821 = NameAndType        #662:#620    // getHeight:(III)S
   #822 = Methodref          #2.#821      // ext/mods/gameserver/geoengine/GeoEngine.getHeight:(III)S
   #823 = Utf8               groundZ
   #824 = Utf8               x
   #825 = Utf8               y
   #826 = Utf8               getWaterLevel
   #827 = Utf8               getValidSwimLocationAdvanced
   #828 = Utf8               (IIIIIILext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/location/Location;
   #829 = NameAndType        #820:#687    // isInWater:(III)Z
   #830 = Methodref          #2.#829      // ext/mods/gameserver/geoengine/GeoEngine.isInWater:(III)Z
   #831 = NameAndType        #826:#683    // getWaterLevel:(II)I
   #832 = Methodref          #2.#831      // ext/mods/gameserver/geoengine/GeoEngine.getWaterLevel:(II)I
   #833 = Utf8               (III)V
   #834 = NameAndType        #5:#833      // "<init>":(III)V
   #835 = Methodref          #665.#834    // ext/mods/gameserver/model/location/Location."<init>":(III)V
   #836 = Utf8               ext/mods/gameserver/model/actor/Creature
   #837 = Class              #836         // ext/mods/gameserver/model/actor/Creature
   #838 = Utf8               getCollisionRadius
   #839 = Utf8               ()D
   #840 = NameAndType        #838:#839    // getCollisionRadius:()D
   #841 = Methodref          #837.#840    // ext/mods/gameserver/model/actor/Creature.getCollisionRadius:()D
   #842 = Utf8               kotlin/ranges/IntRange
   #843 = Class              #842         // kotlin/ranges/IntRange
   #844 = NameAndType        #5:#548      // "<init>":(II)V
   #845 = Methodref          #843.#844    // kotlin/ranges/IntRange."<init>":(II)V
   #846 = Utf8               java/lang/Iterable
   #847 = Class              #846         // java/lang/Iterable
   #848 = Utf8               iterator
   #849 = Utf8               ()Ljava/util/Iterator;
   #850 = NameAndType        #848:#849    // iterator:()Ljava/util/Iterator;
   #851 = InterfaceMethodref #847.#850    // java/lang/Iterable.iterator:()Ljava/util/Iterator;
   #852 = Utf8               java/util/Iterator
   #853 = Class              #852         // java/util/Iterator
   #854 = Utf8               hasNext
   #855 = NameAndType        #854:#616    // hasNext:()Z
   #856 = InterfaceMethodref #853.#855    // java/util/Iterator.hasNext:()Z
   #857 = Utf8               kotlin/collections/IntIterator
   #858 = Class              #857         // kotlin/collections/IntIterator
   #859 = Utf8               nextInt
   #860 = NameAndType        #859:#101    // nextInt:()I
   #861 = Methodref          #858.#860    // kotlin/collections/IntIterator.nextInt:()I
   #862 = Utf8               java/util/ArrayList
   #863 = Class              #862         // java/util/ArrayList
   #864 = Methodref          #863.#9      // java/util/ArrayList."<init>":()V
   #865 = Utf8               java/util/Collection
   #866 = Class              #865         // java/util/Collection
   #867 = Utf8               java/lang/Boolean
   #868 = Class              #867         // java/lang/Boolean
   #869 = Utf8               valueOf
   #870 = NameAndType        #869:#533    // valueOf:(Z)Ljava/lang/Boolean;
   #871 = Methodref          #868.#870    // java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
   #872 = Utf8               (Ljava/lang/Object;)Z
   #873 = NameAndType        #786:#872    // add:(Ljava/lang/Object;)Z
   #874 = InterfaceMethodref #866.#873    // java/util/Collection.add:(Ljava/lang/Object;)Z
   #875 = Utf8               java/util/List
   #876 = Class              #875         // java/util/List
   #877 = Utf8               kotlin/collections/CollectionsKt
   #878 = Class              #877         // kotlin/collections/CollectionsKt
   #879 = Utf8               addAll
   #880 = Utf8               (Ljava/util/Collection;Ljava/lang/Iterable;)Z
   #881 = NameAndType        #879:#880    // addAll:(Ljava/util/Collection;Ljava/lang/Iterable;)Z
   #882 = Methodref          #878.#881    // kotlin/collections/CollectionsKt.addAll:(Ljava/util/Collection;Ljava/lang/Iterable;)Z
   #883 = Utf8               isEmpty
   #884 = NameAndType        #883:#616    // isEmpty:()Z
   #885 = InterfaceMethodref #866.#884    // java/util/Collection.isEmpty:()Z
   #886 = Utf8               next
   #887 = NameAndType        #886:#152    // next:()Ljava/lang/Object;
   #888 = InterfaceMethodref #853.#887    // java/util/Iterator.next:()Ljava/lang/Object;
   #889 = Utf8               booleanValue
   #890 = NameAndType        #889:#616    // booleanValue:()Z
   #891 = Methodref          #868.#890    // java/lang/Boolean.booleanValue:()Z
   #892 = Utf8               getValidSwimLocation
   #893 = Utf8               (IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Lext/mods/gameserver/model/location/Location;
   #894 = NameAndType        #892:#893    // getValidSwimLocation:(IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Lext/mods/gameserver/model/location/Location;
   #895 = Methodref          #2.#894      // ext/mods/gameserver/geoengine/GeoEngine.getValidSwimLocation:(IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Lext/mods/gameserver/model/location/Location;
   #896 = Utf8               waterLevel
   #897 = Utf8               landLevel
   #898 = Utf8               heightDifference
   #899 = Utf8               wasInWater
   #900 = Utf8               willBeOnLand
   #901 = Utf8               $i$a$-mapNotNull-GeoEngine$getValidSwimLocationAdvanced$1$hasCollision$1$1
   #902 = Utf8               $i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv
   #903 = Utf8               it$iv$iv
   #904 = Utf8               $i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv
   #905 = Utf8               element$iv$iv
   #906 = Utf8               element$iv$iv$iv
   #907 = Utf8               $i$f$forEach
   #908 = Utf8               $this$forEach$iv$iv$iv
   #909 = Utf8               Ljava/lang/Iterable;
   #910 = Utf8               $i$f$mapNotNullTo
   #911 = Utf8               $this$mapNotNullTo$iv$iv
   #912 = Utf8               destination$iv$iv
   #913 = Utf8               Ljava/util/Collection;
   #914 = Utf8               $i$f$mapNotNull
   #915 = Utf8               $this$mapNotNull$iv
   #916 = Utf8               $i$a$-flatMap-GeoEngine$getValidSwimLocationAdvanced$1$hasCollision$1
   #917 = Utf8               list$iv$iv
   #918 = Utf8               $i$f$flatMapTo
   #919 = Utf8               $this$flatMapTo$iv$iv
   #920 = Utf8               $i$f$flatMap
   #921 = Utf8               $this$flatMap$iv
   #922 = Utf8               $i$a$-any-GeoEngine$getValidSwimLocationAdvanced$1$hasCollision$2
   #923 = Utf8               it
   #924 = Utf8               element$iv
   #925 = Utf8               $i$f$any
   #926 = Utf8               $this$any$iv
   #927 = Utf8               $i$a$-forEach-GeoEngine$getValidSwimLocationAdvanced$1
   #928 = Utf8               hasCollision
   #929 = Utf8               $this$forEach$iv
   #930 = Utf8               advancedPhysics
   #931 = Utf8               collisionPathfinding
   #932 = Utf8               creature
   #933 = Utf8               Lext/mods/gameserver/model/actor/Creature;
   #934 = Utf8               canSeeTarget
   #935 = Utf8               (Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
   #936 = Utf8               ext/mods/gameserver/model/WorldObject
   #937 = Class              #936         // ext/mods/gameserver/model/WorldObject
   #938 = Methodref          #937.#667    // ext/mods/gameserver/model/WorldObject.getX:()I
   #939 = Methodref          #937.#670    // ext/mods/gameserver/model/WorldObject.getY:()I
   #940 = Methodref          #937.#673    // ext/mods/gameserver/model/WorldObject.getZ:()I
   #941 = Utf8               getCollisionHeight
   #942 = NameAndType        #941:#839    // getCollisionHeight:()D
   #943 = Methodref          #837.#942    // ext/mods/gameserver/model/actor/Creature.getCollisionHeight:()D
   #944 = Utf8               PART_OF_CHARACTER_HEIGHT
   #945 = NameAndType        #944:#22     // PART_OF_CHARACTER_HEIGHT:I
   #946 = Fieldref           #79.#945     // ext/mods/Config.PART_OF_CHARACTER_HEIGHT:I
   #947 = Utf8               canSee
   #948 = Utf8               (IIIDIIIDLext/mods/gameserver/geoengine/geodata/IGeoObject;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
   #949 = NameAndType        #947:#948    // canSee:(IIIDIIIDLext/mods/gameserver/geoengine/geodata/IGeoObject;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
   #950 = Methodref          #2.#949      // ext/mods/gameserver/geoengine/GeoEngine.canSee:(IIIDIIIDLext/mods/gameserver/geoengine/geodata/IGeoObject;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
   #951 = Utf8               oheight
   #952 = Utf8               theight
   #953 = Utf8               Lext/mods/gameserver/model/WorldObject;
   #954 = Utf8               target
   #955 = Utf8               canSeeLocation
   #956 = Utf8               (Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/location/Location;)Z
   #957 = Utf8               ext/mods/gameserver/model/World
   #958 = Class              #957         // ext/mods/gameserver/model/World
   #959 = Utf8               isOutOfWorld
   #960 = NameAndType        #959:#615    // isOutOfWorld:(II)Z
   #961 = Methodref          #958.#960    // ext/mods/gameserver/model/World.isOutOfWorld:(II)Z
   #962 = Utf8               sqrt
   #963 = Utf8               (D)D
   #964 = NameAndType        #962:#963    // sqrt:(D)D
   #965 = Methodref          #701.#964    // java/lang/Math.sqrt:(D)D
   #966 = Utf8               ext/mods/gameserver/enums/MoveDirectionType
   #967 = Class              #966         // ext/mods/gameserver/enums/MoveDirectionType
   #968 = Utf8               getDirection
   #969 = Utf8               (II)Lext/mods/gameserver/enums/MoveDirectionType;
   #970 = NameAndType        #968:#969    // getDirection:(II)Lext/mods/gameserver/enums/MoveDirectionType;
   #971 = Methodref          #967.#970    // ext/mods/gameserver/enums/MoveDirectionType.getDirection:(II)Lext/mods/gameserver/enums/MoveDirectionType;
   #972 = Utf8               java/awt/Color
   #973 = Class              #972         // java/awt/Color
   #974 = Utf8               BLUE
   #975 = Utf8               Ljava/awt/Color;
   #976 = NameAndType        #974:#975    // BLUE:Ljava/awt/Color;
   #977 = Fieldref           #973.#976    // java/awt/Color.BLUE:Ljava/awt/Color;
   #978 = Utf8               addSquare
   #979 = Utf8               (Ljava/awt/Color;IIII)V
   #980 = NameAndType        #978:#979    // addSquare:(Ljava/awt/Color;IIII)V
   #981 = Methodref          #819.#980    // ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addSquare:(Ljava/awt/Color;IIII)V
   #982 = Utf8               getOffsetX
   #983 = NameAndType        #982:#101    // getOffsetX:()I
   #984 = Methodref          #967.#983    // ext/mods/gameserver/enums/MoveDirectionType.getOffsetX:()I
   #985 = Utf8               getStepX
   #986 = NameAndType        #985:#101    // getStepX:()I
   #987 = Methodref          #967.#986    // ext/mods/gameserver/enums/MoveDirectionType.getStepX:()I
   #988 = Utf8               getSymbolX
   #989 = NameAndType        #988:#87     // getSymbolX:()Ljava/lang/String;
   #990 = Methodref          #967.#989    // ext/mods/gameserver/enums/MoveDirectionType.getSymbolX:()Ljava/lang/String;
   #991 = Utf8               CYAN
   #992 = NameAndType        #991:#975    // CYAN:Ljava/awt/Color;
   #993 = Fieldref           #973.#992    // java/awt/Color.CYAN:Ljava/awt/Color;
   #994 = Utf8               addPoint
   #995 = Utf8               (Ljava/lang/String;Ljava/awt/Color;ZIII)V
   #996 = NameAndType        #994:#995    // addPoint:(Ljava/lang/String;Ljava/awt/Color;ZIII)V
   #997 = Methodref          #819.#996    // ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addPoint:(Ljava/lang/String;Ljava/awt/Color;ZIII)V
   #998 = Utf8               GREEN
   #999 = NameAndType        #998:#975    // GREEN:Ljava/awt/Color;
  #1000 = Fieldref           #973.#999    // java/awt/Color.GREEN:Ljava/awt/Color;
  #1001 = Utf8               getSignumX
  #1002 = NameAndType        #1001:#101   // getSignumX:()I
  #1003 = Methodref          #967.#1002   // ext/mods/gameserver/enums/MoveDirectionType.getSignumX:()I
  #1004 = Utf8               getDirectionX
  #1005 = NameAndType        #1004:#418   // getDirectionX:()B
  #1006 = Methodref          #967.#1005   // ext/mods/gameserver/enums/MoveDirectionType.getDirectionX:()B
  #1007 = Utf8               getOffsetY
  #1008 = NameAndType        #1007:#101   // getOffsetY:()I
  #1009 = Methodref          #967.#1008   // ext/mods/gameserver/enums/MoveDirectionType.getOffsetY:()I
  #1010 = Utf8               min
  #1011 = NameAndType        #1010:#683   // min:(II)I
  #1012 = Methodref          #701.#1011   // java/lang/Math.min:(II)I
  #1013 = Utf8               getSymbolY
  #1014 = NameAndType        #1013:#87    // getSymbolY:()Ljava/lang/String;
  #1015 = Methodref          #967.#1014   // ext/mods/gameserver/enums/MoveDirectionType.getSymbolY:()Ljava/lang/String;
  #1016 = Utf8               YELLOW
  #1017 = NameAndType        #1016:#975   // YELLOW:Ljava/awt/Color;
  #1018 = Fieldref           #973.#1017   // java/awt/Color.YELLOW:Ljava/awt/Color;
  #1019 = Utf8               getStepY
  #1020 = NameAndType        #1019:#101   // getStepY:()I
  #1021 = Methodref          #967.#1020   // ext/mods/gameserver/enums/MoveDirectionType.getStepY:()I
  #1022 = Utf8               getSignumY
  #1023 = NameAndType        #1022:#101   // getSignumY:()I
  #1024 = Methodref          #967.#1023   // ext/mods/gameserver/enums/MoveDirectionType.getSignumY:()I
  #1025 = Utf8               getDirectionY
  #1026 = NameAndType        #1025:#418   // getDirectionY:()B
  #1027 = Methodref          #967.#1026   // ext/mods/gameserver/enums/MoveDirectionType.getDirectionY:()B
  #1028 = Utf8               MAX_OBSTACLE_HEIGHT
  #1029 = NameAndType        #1028:#22    // MAX_OBSTACLE_HEIGHT:I
  #1030 = Fieldref           #79.#1029    // ext/mods/Config.MAX_OBSTACLE_HEIGHT:I
  #1031 = Utf8               getIndexAbove
  #1032 = NameAndType        #1031:#694   // getIndexAbove:(IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)I
  #1033 = Methodref          #62.#1032    // ext/mods/gameserver/geoengine/geodata/ABlock.getIndexAbove:(IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)I
  #1034 = Utf8               RED
  #1035 = NameAndType        #1034:#975   // RED:Ljava/awt/Color;
  #1036 = Fieldref           #973.#1035   // java/awt/Color.RED:Ljava/awt/Color;
  #1037 = Utf8               (Ljava/awt/Color;III)V
  #1038 = NameAndType        #994:#1037   // addPoint:(Ljava/awt/Color;III)V
  #1039 = Methodref          #819.#1038   // ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addPoint:(Ljava/awt/Color;III)V
  #1040 = Utf8               $i$a$-let-GeoEngine$canSee$1
  #1041 = Utf8               $i$a$-let-GeoEngine$canSee$2
  #1042 = Utf8               $i$a$-let-GeoEngine$canSee$3
  #1043 = Utf8               losz
  #1044 = Utf8               dz
  #1045 = Utf8               mz
  #1046 = Utf8               mdt
  #1047 = Utf8               Lext/mods/gameserver/enums/MoveDirectionType;
  #1048 = Utf8               m
  #1049 = Utf8               gridX
  #1050 = Utf8               gridY
  #1051 = Utf8               dir
  #1052 = Utf8               gox
  #1053 = Utf8               goy
  #1054 = Utf8               gtx
  #1055 = Utf8               gty
  #1056 = Utf8               raycast
  #1057 = Utf8               (IIIIIILext/mods/gameserver/geoengine/geodata/IGeoObject;)Lext/mods/gameserver/model/location/Location;
  #1058 = Utf8               collisionZ
  #1059 = Utf8               distance
  #1060 = Utf8               canFindPathToTarget
  #1061 = Utf8               getPosition
  #1062 = Utf8               ()Lext/mods/gameserver/model/location/SpawnLocation;
  #1063 = NameAndType        #1061:#1062  // getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #1064 = Methodref          #937.#1063   // ext/mods/gameserver/model/WorldObject.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #1065 = Utf8               canMoveToTarget
  #1066 = Utf8               (Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Z
  #1067 = NameAndType        #1065:#1066  // canMoveToTarget:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Z
  #1068 = Methodref          #2.#1067     // ext/mods/gameserver/geoengine/GeoEngine.canMoveToTarget:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Z
  #1069 = Utf8               ext/mods/gameserver/model/actor/Playable
  #1070 = Class              #1069        // ext/mods/gameserver/model/actor/Playable
  #1071 = Utf8               findPath
  #1072 = Utf8               (IIIIIIZLext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
  #1073 = NameAndType        #1071:#1072  // findPath:(IIIIIIZLext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
  #1074 = Methodref          #2.#1073     // ext/mods/gameserver/geoengine/GeoEngine.findPath:(IIIIIIZLext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
  #1075 = NameAndType        #373:#101    // size:()I
  #1076 = InterfaceMethodref #876.#1075   // java/util/List.size:()I
  #1077 = Utf8               origin
  #1078 = Utf8               (IIIIII)Z
  #1079 = Methodref          #2.#640      // ext/mods/gameserver/geoengine/GeoEngine.getNsweNearest:(IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)B
  #1080 = Utf8               goz
  #1081 = Utf8               canMoveClear
  #1082 = Utf8               $i$a$-let-GeoEngine$canMoveClear$1
  #1083 = Utf8               $i$a$-let-GeoEngine$canMoveClear$2
  #1084 = Utf8               $i$a$-let-GeoEngine$canMoveClear$3
  #1085 = Utf8               getValidLocation
  #1086 = Utf8               (Lext/mods/gameserver/model/WorldObject;III)Lext/mods/gameserver/model/location/Location;
  #1087 = NameAndType        #1085:#893   // getValidLocation:(IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Lext/mods/gameserver/model/location/Location;
  #1088 = Methodref          #2.#1087     // ext/mods/gameserver/geoengine/GeoEngine.getValidLocation:(IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Lext/mods/gameserver/model/location/Location;
  #1089 = Utf8               (Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Lext/mods/gameserver/model/location/Location;
  #1090 = Utf8               (Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/location/Location;
  #1091 = NameAndType        #1085:#1090  // getValidLocation:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/location/Location;
  #1092 = Methodref          #2.#1091     // ext/mods/gameserver/geoengine/GeoEngine.getValidLocation:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/location/Location;
  #1093 = Utf8               follower
  #1094 = Utf8               pawn
  #1095 = Utf8               (Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/location/Location;
  #1096 = Utf8               $i$a$-let-GeoEngine$getValidLocation$1
  #1097 = Utf8               $i$a$-let-GeoEngine$getValidLocation$2
  #1098 = Utf8               $i$a$-let-GeoEngine$getValidLocation$3
  #1099 = Utf8               gtz
  #1100 = Utf8               computeLegacyPathRaw
  #1101 = Utf8               (IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
  #1102 = Utf8               (IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
  #1103 = Utf8               ext/mods/gameserver/geoengine/pathfinding/PathFinder
  #1104 = Class              #1103        // ext/mods/gameserver/geoengine/pathfinding/PathFinder
  #1105 = Methodref          #1104.#9     // ext/mods/gameserver/geoengine/pathfinding/PathFinder."<init>":()V
  #1106 = NameAndType        #1071:#1101  // findPath:(IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
  #1107 = Methodref          #1104.#1106  // ext/mods/gameserver/geoengine/pathfinding/PathFinder.findPath:(IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
  #1108 = Utf8               toMutableList
  #1109 = Utf8               (Ljava/util/Collection;)Ljava/util/List;
  #1110 = NameAndType        #1108:#1109  // toMutableList:(Ljava/util/Collection;)Ljava/util/List;
  #1111 = Methodref          #878.#1110   // kotlin/collections/CollectionsKt.toMutableList:(Ljava/util/Collection;)Ljava/util/List;
  #1112 = Utf8               pf
  #1113 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/PathFinder;
  #1114 = Utf8               (IIIIIIZLext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
  #1115 = Utf8               (IIIIIIZILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
  #1116 = NameAndType        #1071:#1115  // findPath:(IIIIIIZILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
  #1117 = Methodref          #2.#1116     // ext/mods/gameserver/geoengine/GeoEngine.findPath:(IIIIIIZILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
  #1118 = Utf8               playable
  #1119 = Utf8               (IIIIIIZILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
  #1120 = Utf8               emptyList
  #1121 = Utf8               ()Ljava/util/List;
  #1122 = NameAndType        #1120:#1121  // emptyList:()Ljava/util/List;
  #1123 = Methodref          #878.#1122   // kotlin/collections/CollectionsKt.emptyList:()Ljava/util/List;
  #1124 = MethodType         #152         //  ()Ljava/lang/Object;
  #1125 = Utf8               findPath$lambda$0
  #1126 = Utf8               (IIIIIIZLext/mods/gameserver/network/serverpackets/ExServerPrimitive;Lext/mods/gameserver/geoengine/GeoEngine;IIIIII)Ljava/util/List;
  #1127 = NameAndType        #1125:#1126  // findPath$lambda$0:(IIIIIIZLext/mods/gameserver/network/serverpackets/ExServerPrimitive;Lext/mods/gameserver/geoengine/GeoEngine;IIIIII)Ljava/util/List;
  #1128 = Methodref          #2.#1127     // ext/mods/gameserver/geoengine/GeoEngine.findPath$lambda$0:(IIIIIIZLext/mods/gameserver/network/serverpackets/ExServerPrimitive;Lext/mods/gameserver/geoengine/GeoEngine;IIIIII)Ljava/util/List;
  #1129 = MethodHandle       6:#1128      // REF_invokeStatic ext/mods/gameserver/geoengine/GeoEngine.findPath$lambda$0:(IIIIIIZLext/mods/gameserver/network/serverpackets/ExServerPrimitive;Lext/mods/gameserver/geoengine/GeoEngine;IIIIII)Ljava/util/List;
  #1130 = MethodType         #1121        //  ()Ljava/util/List;
  #1131 = Utf8               java/lang/invoke/LambdaMetafactory
  #1132 = Class              #1131        // java/lang/invoke/LambdaMetafactory
  #1133 = Utf8               metafactory
  #1134 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1135 = NameAndType        #1133:#1134  // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1136 = Methodref          #1132.#1135  // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1137 = MethodHandle       6:#1136      // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1138 = Utf8               invoke
  #1139 = Utf8               (IIIIIIZLext/mods/gameserver/network/serverpackets/ExServerPrimitive;Lext/mods/gameserver/geoengine/GeoEngine;IIIIII)Lkotlin/jvm/functions/Function0;
  #1140 = NameAndType        #1138:#1139  // invoke:(IIIIIIZLext/mods/gameserver/network/serverpackets/ExServerPrimitive;Lext/mods/gameserver/geoengine/GeoEngine;IIIIII)Lkotlin/jvm/functions/Function0;
  #1141 = InvokeDynamic      #5:#1140     // #5:invoke:(IIIIIIZLext/mods/gameserver/network/serverpackets/ExServerPrimitive;Lext/mods/gameserver/geoengine/GeoEngine;IIIIII)Lkotlin/jvm/functions/Function0;
  #1142 = Utf8               USE_PATHFINDING_POOL
  #1143 = NameAndType        #1142:#207   // USE_PATHFINDING_POOL:Z
  #1144 = Fieldref           #79.#1143    // ext/mods/Config.USE_PATHFINDING_POOL:Z
  #1145 = Utf8               ext/mods/commons/pool/CoroutinePool
  #1146 = Class              #1145        // ext/mods/commons/pool/CoroutinePool
  #1147 = Utf8               runPathfindingBlocking
  #1148 = Utf8               (Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;
  #1149 = NameAndType        #1147:#1148  // runPathfindingBlocking:(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;
  #1150 = Methodref          #1146.#1149  // ext/mods/commons/pool/CoroutinePool.runPathfindingBlocking:(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;
  #1151 = Utf8               kotlin/jvm/functions/Function0
  #1152 = Class              #1151        // kotlin/jvm/functions/Function0
  #1153 = NameAndType        #1138:#152   // invoke:()Ljava/lang/Object;
  #1154 = InterfaceMethodref #1152.#1153  // kotlin/jvm/functions/Function0.invoke:()Ljava/lang/Object;
  #1155 = Utf8               computePath
  #1156 = Utf8               Lkotlin/jvm/functions/Function0;
  #1157 = Utf8               path
  #1158 = Utf8               Ljava/util/List;
  #1159 = Utf8               nearestZLimit
  #1160 = Utf8               $i$a$-let-GeoEngine$getValidSwimLocation$1
  #1161 = Utf8               $i$a$-let-GeoEngine$getValidSwimLocation$2
  #1162 = Utf8               $i$a$-let-GeoEngine$getValidSwimLocation$3
  #1163 = Utf8               $i$a$-let-GeoEngine$getValidSwimLocation$4
  #1164 = Utf8               swimZ
  #1165 = Utf8               canFlyToTarget
  #1166 = Utf8               (Lext/mods/gameserver/model/WorldObject;DLext/mods/gameserver/model/WorldObject;)Z
  #1167 = Utf8               (Lext/mods/gameserver/model/location/Location;DLext/mods/gameserver/model/location/Location;)Z
  #1168 = NameAndType        #1165:#1167  // canFlyToTarget:(Lext/mods/gameserver/model/location/Location;DLext/mods/gameserver/model/location/Location;)Z
  #1169 = Methodref          #2.#1168     // ext/mods/gameserver/geoengine/GeoEngine.canFlyToTarget:(Lext/mods/gameserver/model/location/Location;DLext/mods/gameserver/model/location/Location;)Z
  #1170 = Utf8               (Lext/mods/gameserver/model/WorldObject;DLext/mods/gameserver/model/location/Location;)Z
  #1171 = Utf8               (IIIDIII)Z
  #1172 = NameAndType        #1165:#1171  // canFlyToTarget:(IIIDIII)Z
  #1173 = Methodref          #2.#1172     // ext/mods/gameserver/geoengine/GeoEngine.canFlyToTarget:(IIIDIII)Z
  #1174 = Utf8               canFly
  #1175 = Utf8               (IIIDIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
  #1176 = NameAndType        #1174:#1175  // canFly:(IIIDIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
  #1177 = Methodref          #2.#1176     // ext/mods/gameserver/geoengine/GeoEngine.canFly:(IIIDIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
  #1178 = Utf8               nextZ
  #1179 = Utf8               getValidFlyLocation
  #1180 = Utf8               (IIIDIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Lext/mods/gameserver/model/location/Location;
  #1181 = Utf8               bottomZ
  #1182 = Utf8               topZ
  #1183 = Utf8               addGeoBug
  #1184 = Utf8               (Lext/mods/gameserver/model/location/Location;Ljava/lang/String;)Z
  #1185 = Utf8               %d;%d;%d;%d;%d;%d;%d;%s\r\n
  #1186 = String             #1185        // %d;%d;%d;%d;%d;%d;%d;%s\r\n
  #1187 = Utf8               java/lang/Integer
  #1188 = Class              #1187        // java/lang/Integer
  #1189 = NameAndType        #869:#326    // valueOf:(I)Ljava/lang/Integer;
  #1190 = Methodref          #1188.#1189  // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #1191 = Utf8               ;
  #1192 = String             #1191        // ;
  #1193 = Utf8               :
  #1194 = String             #1193        // :
  #1195 = Utf8               kotlin/text/StringsKt
  #1196 = Class              #1195        // kotlin/text/StringsKt
  #1197 = Utf8               replace$default
  #1198 = Utf8               (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;
  #1199 = NameAndType        #1197:#1198  // replace$default:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;
  #1200 = Methodref          #1196.#1199  // kotlin/text/StringsKt.replace$default:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;
  #1201 = Utf8               printf
  #1202 = Utf8               (Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintWriter;
  #1203 = NameAndType        #1201:#1202  // printf:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintWriter;
  #1204 = Methodref          #183.#1203   // java/io/PrintWriter.printf:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintWriter;
  #1205 = Utf8               Couldn\'t save new entry to \"geo_bugs.txt\" file.
  #1206 = String             #1205        // Couldn\'t save new entry to \"geo_bugs.txt\" file.
  #1207 = Utf8               rx
  #1208 = Utf8               ry
  #1209 = Utf8               cx
  #1210 = Utf8               cy
  #1211 = Utf8               comment
  #1212 = Utf8               isInitialized
  #1213 = NameAndType        #1212:#616   // isInitialized:()Z
  #1214 = Methodref          #211.#1213   // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge.isInitialized:()Z
  #1215 = Utf8               (IIIIIIZLjava/lang/Object;)Ljava/util/List;
  #1216 = NameAndType        #1071:#1215  // findPath:(IIIIIIZLjava/lang/Object;)Ljava/util/List;
  #1217 = Methodref          #211.#1216   // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge.findPath:(IIIIIIZLjava/lang/Object;)Ljava/util/List;
  #1218 = Utf8               collectionSizeOrDefault
  #1219 = Utf8               (Ljava/lang/Iterable;I)I
  #1220 = NameAndType        #1218:#1219  // collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
  #1221 = Methodref          #878.#1220   // kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
  #1222 = Utf8               (I)V
  #1223 = NameAndType        #5:#1222     // "<init>":(I)V
  #1224 = Methodref          #863.#1223   // java/util/ArrayList."<init>":(I)V
  #1225 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/Location
  #1226 = Class              #1225        // ext/mods/gameserver/geoengine/pathfinding/model/Location
  #1227 = Methodref          #1226.#667   // ext/mods/gameserver/geoengine/pathfinding/model/Location.getX:()I
  #1228 = Methodref          #1226.#670   // ext/mods/gameserver/geoengine/pathfinding/model/Location.getY:()I
  #1229 = Methodref          #1226.#673   // ext/mods/gameserver/geoengine/pathfinding/model/Location.getZ:()I
  #1230 = NameAndType        #1100:#1101  // computeLegacyPathRaw:(IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
  #1231 = Methodref          #2.#1230     // ext/mods/gameserver/geoengine/GeoEngine.computeLegacyPathRaw:(IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
  #1232 = InterfaceMethodref #876.#884    // java/util/List.isEmpty:()Z
  #1233 = Utf8               listIterator
  #1234 = Utf8               ()Ljava/util/ListIterator;
  #1235 = NameAndType        #1233:#1234  // listIterator:()Ljava/util/ListIterator;
  #1236 = InterfaceMethodref #876.#1235   // java/util/List.listIterator:()Ljava/util/ListIterator;
  #1237 = Utf8               java/util/ListIterator
  #1238 = Class              #1237        // java/util/ListIterator
  #1239 = InterfaceMethodref #1238.#855   // java/util/ListIterator.hasNext:()Z
  #1240 = InterfaceMethodref #1238.#887   // java/util/ListIterator.next:()Ljava/lang/Object;
  #1241 = Utf8               nextIndex
  #1242 = NameAndType        #1241:#101   // nextIndex:()I
  #1243 = InterfaceMethodref #1238.#1242  // java/util/ListIterator.nextIndex:()I
  #1244 = Utf8               (I)Ljava/lang/Object;
  #1245 = NameAndType        #417:#1244   // get:(I)Ljava/lang/Object;
  #1246 = InterfaceMethodref #876.#1245   // java/util/List.get:(I)Ljava/lang/Object;
  #1247 = NameAndType        #1081:#791   // canMoveClear:(IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
  #1248 = Methodref          #2.#1247     // ext/mods/gameserver/geoengine/GeoEngine.canMoveClear:(IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
  #1249 = Utf8               remove
  #1250 = NameAndType        #1249:#6     // remove:()V
  #1251 = InterfaceMethodref #1238.#1250  // java/util/ListIterator.remove:()V
  #1252 = Utf8               throwIndexOverflow
  #1253 = NameAndType        #1252:#6     // throwIndexOverflow:()V
  #1254 = Methodref          #878.#1253   // kotlin/collections/CollectionsKt.throwIndexOverflow:()V
  #1255 = Utf8               Segment #\u0001
  #1256 = String             #1255        // Segment #\u0001
  #1257 = Utf8               (I)Ljava/lang/String;
  #1258 = NameAndType        #128:#1257   // makeConcatWithConstants:(I)Ljava/lang/String;
  #1259 = InvokeDynamic      #6:#1258     // #6:makeConcatWithConstants:(I)Ljava/lang/String;
  #1260 = Utf8               addLine
  #1261 = Utf8               (Ljava/lang/String;Ljava/awt/Color;ZLext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)V
  #1262 = NameAndType        #1260:#1261  // addLine:(Ljava/lang/String;Ljava/awt/Color;ZLext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)V
  #1263 = Methodref          #819.#1262   // ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addLine:(Ljava/lang/String;Ljava/awt/Color;ZLext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)V
  #1264 = Utf8               $i$a$-map-GeoEngine$findPath$computePath$1$rawPath$1
  #1265 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/Location;
  #1266 = Utf8               item$iv$iv
  #1267 = Utf8               $i$f$mapTo
  #1268 = Utf8               $this$mapTo$iv$iv
  #1269 = Utf8               $i$f$map
  #1270 = Utf8               $this$map$iv
  #1271 = Utf8               l2brPath
  #1272 = Utf8               nodeC
  #1273 = Utf8               nodeB
  #1274 = Utf8               $i$a$-forEachIndexed-GeoEngine$findPath$computePath$1$1$1
  #1275 = Utf8               item$iv
  #1276 = Utf8               $i$f$forEachIndexed
  #1277 = Utf8               $this$forEachIndexed$iv
  #1278 = Utf8               $i$a$-let-GeoEngine$findPath$computePath$1$1
  #1279 = Utf8               prev
  #1280 = Utf8               dbg
  #1281 = Utf8               pointIterator
  #1282 = Utf8               Ljava/util/ListIterator;
  #1283 = Utf8               nodeAx
  #1284 = Utf8               nodeAy
  #1285 = Utf8               nodeAz
  #1286 = Utf8               rawPath
  #1287 = Utf8               $ox
  #1288 = Utf8               $oy
  #1289 = Utf8               $oz
  #1290 = Utf8               $tx
  #1291 = Utf8               $ty
  #1292 = Utf8               $tz
  #1293 = Utf8               $playable
  #1294 = Utf8               $debug
  #1295 = Utf8               this$0
  #1296 = Utf8               $gox
  #1297 = Utf8               $goy
  #1298 = Utf8               $goz
  #1299 = Utf8               $gtx
  #1300 = Utf8               $gty
  #1301 = Utf8               $gtz
  #1302 = Utf8               _instance_delegate$lambda$0
  #1303 = Utf8               ()Lext/mods/gameserver/geoengine/GeoEngine;
  #1304 = Methodref          #2.#9        // ext/mods/gameserver/geoengine/GeoEngine."<init>":()V
  #1305 = Utf8               Lkotlin/jvm/JvmStatic;
  #1306 = NameAndType        #218:#1303   // getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
  #1307 = Methodref          #650.#1306   // ext/mods/gameserver/geoengine/GeoEngine$Companion.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
  #1308 = Utf8               getWorldX
  #1309 = NameAndType        #1308:#652   // getWorldX:(I)I
  #1310 = Methodref          #650.#1309   // ext/mods/gameserver/geoengine/GeoEngine$Companion.getWorldX:(I)I
  #1311 = Utf8               getWorldY
  #1312 = NameAndType        #1311:#652   // getWorldY:(I)I
  #1313 = Methodref          #650.#1312   // ext/mods/gameserver/geoengine/GeoEngine$Companion.getWorldY:(I)I
  #1314 = Utf8               calculateGeoObject
  #1315 = Utf8               ([[Z)[[B
  #1316 = NameAndType        #1314:#1315  // calculateGeoObject:([[Z)[[B
  #1317 = Methodref          #650.#1316   // ext/mods/gameserver/geoengine/GeoEngine$Companion.calculateGeoObject:([[Z)[[B
  #1318 = Utf8               inside
  #1319 = Utf8               [[Z
  #1320 = Utf8               access$loadGeoBlocks
  #1321 = Utf8               (Lext/mods/gameserver/geoengine/GeoEngine;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #1322 = NameAndType        #283:#284    // loadGeoBlocks:(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #1323 = Methodref          #2.#1322     // ext/mods/gameserver/geoengine/GeoEngine.loadGeoBlocks:(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #1324 = Utf8               $this
  #1325 = Utf8               access$get_instance$delegate$cp
  #1326 = Utf8               ()Lkotlin/Lazy;
  #1327 = Utf8               _instance$delegate
  #1328 = Utf8               Lkotlin/Lazy;
  #1329 = NameAndType        #1327:#1328  // _instance$delegate:Lkotlin/Lazy;
  #1330 = Fieldref           #2.#1329     // ext/mods/gameserver/geoengine/GeoEngine._instance$delegate:Lkotlin/Lazy;
  #1331 = Utf8               access$getLOGGER$cp
  #1332 = Utf8               ()Lext/mods/commons/logging/CLogger;
  #1333 = Utf8               access$loadNullBlocks
  #1334 = Utf8               (Lext/mods/gameserver/geoengine/GeoEngine;II)V
  #1335 = Utf8               <clinit>
  #1336 = Utf8               (Lkotlin/jvm/internal/DefaultConstructorMarker;)V
  #1337 = NameAndType        #5:#1336     // "<init>":(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
  #1338 = Methodref          #650.#1337   // ext/mods/gameserver/geoengine/GeoEngine$Companion."<init>":(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
  #1339 = Utf8               java/lang/Class
  #1340 = Class              #1339        // java/lang/Class
  #1341 = Utf8               getName
  #1342 = NameAndType        #1341:#87    // getName:()Ljava/lang/String;
  #1343 = Methodref          #1340.#1342  // java/lang/Class.getName:()Ljava/lang/String;
  #1344 = Methodref          #117.#180    // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #1345 = NameAndType        #1302:#1303  // _instance_delegate$lambda$0:()Lext/mods/gameserver/geoengine/GeoEngine;
  #1346 = Methodref          #2.#1345     // ext/mods/gameserver/geoengine/GeoEngine._instance_delegate$lambda$0:()Lext/mods/gameserver/geoengine/GeoEngine;
  #1347 = MethodHandle       6:#1346      // REF_invokeStatic ext/mods/gameserver/geoengine/GeoEngine._instance_delegate$lambda$0:()Lext/mods/gameserver/geoengine/GeoEngine;
  #1348 = MethodType         #1303        //  ()Lext/mods/gameserver/geoengine/GeoEngine;
  #1349 = Utf8               ()Lkotlin/jvm/functions/Function0;
  #1350 = NameAndType        #1138:#1349  // invoke:()Lkotlin/jvm/functions/Function0;
  #1351 = InvokeDynamic      #7:#1350     // #7:invoke:()Lkotlin/jvm/functions/Function0;
  #1352 = Utf8               kotlin/LazyKt
  #1353 = Class              #1352        // kotlin/LazyKt
  #1354 = Utf8               lazy
  #1355 = Utf8               (Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;
  #1356 = NameAndType        #1354:#1355  // lazy:(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;
  #1357 = Methodref          #1353.#1356  // kotlin/LazyKt.lazy:(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;
  #1358 = Utf8               Lkotlin/Lazy<Lext/mods/gameserver/geoengine/GeoEngine;>;
  #1359 = Utf8               Lkotlin/Metadata;
  #1360 = Utf8               mv
  #1361 = Integer            2
  #1362 = Integer            3
  #1363 = Integer            0
  #1364 = Utf8               k
  #1365 = Integer            1
  #1366 = Utf8               xi
  #1367 = Integer            48
  #1368 = Utf8               d1
  #1369 = Utf8               \u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0017\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 |2\u00020\u0001:\u0001|B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\rH\u0082\bJ!\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\rH\u0082\bJ\u0011\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020\u001fH\u0082\bJ\u001e\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\r2\u0006\u0010(\u001a\u00020\rH\u0082@¢\u0006\u0002\u0010)J\u0018\u0010*\u001a\u00020+2\u0006\u0010\'\u001a\u00020\r2\u0006\u0010(\u001a\u00020\rH\u0002J\u0018\u0010,\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\rH\u0002J\u0016\u0010-\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\rJ\u0016\u0010.\u001a\u00020&2\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\rJ\u001e\u0010/\u001a\u0002002\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\r2\u0006\u00101\u001a\u00020\rJ(\u0010/\u001a\u0002002\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\r2\u0006\u00101\u001a\u00020\r2\b\u00102\u001a\u0004\u0018\u000103J\u001e\u00104\u001a\u0002052\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\r2\u0006\u00101\u001a\u00020\rJ(\u00104\u001a\u0002052\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\r2\u0006\u00101\u001a\u00020\r2\b\u00102\u001a\u0004\u0018\u000103J\u0016\u00106\u001a\u00020&2\u0006\u00107\u001a\u00020\r2\u0006\u00108\u001a\u00020\rJ\u000e\u00109\u001a\u0002002\u0006\u0010:\u001a\u00020;J\u001e\u00109\u001a\u0002002\u0006\u00107\u001a\u00020\r2\u0006\u00108\u001a\u00020\r2\u0006\u00101\u001a\u00020\rJ\u001e\u0010<\u001a\u0002052\u0006\u00107\u001a\u00020\r2\u0006\u00108\u001a\u00020\r2\u0006\u00101\u001a\u00020\rJ\b\u0010=\u001a\u00020\rH\u0002J\u001e\u0010>\u001a\u00020&2\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\rJ\u0010\u0010?\u001a\u00020+2\u0006\u0010@\u001a\u000203H\u0002J\u000e\u0010A\u001a\u00020+2\u0006\u0010@\u001a\u000203J\u000e\u0010B\u001a\u00020+2\u0006\u0010@\u001a\u000203J\u0018\u0010C\u001a\u00020+2\u0006\u0010@\u001a\u0002032\u0006\u0010D\u001a\u00020&H\u0002J\u001e\u0010E\u001a\u00020&2\u0006\u00107\u001a\u00020\r2\u0006\u00108\u001a\u00020\r2\u0006\u00101\u001a\u00020\rJH\u0010F\u001a\u00020&2\u0006\u0010G\u001a\u00020\r2\u0006\u0010H\u001a\u00020\r2\u0006\u0010I\u001a\u00020\r2\u0006\u0010J\u001a\u00020\r2\u0006\u0010K\u001a\u00020\r2\u0006\u0010L\u001a\u00020\r2\u0006\u0010M\u001a\u00020N2\b\u0010O\u001a\u0004\u0018\u00010PJ\u001e\u0010Q\u001a\u00020&2\u0006\u0010R\u001a\u00020\r2\u0006\u0010S\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\rJ\u0016\u0010T\u001a\u00020\r2\u0006\u0010R\u001a\u00020\r2\u0006\u0010S\u001a\u00020\rJ@\u0010U\u001a\u00020;2\u0006\u0010G\u001a\u00020\r2\u0006\u0010H\u001a\u00020\r2\u0006\u0010I\u001a\u00020\r2\u0006\u0010J\u001a\u00020\r2\u0006\u0010K\u001a\u00020\r2\u0006\u0010L\u001a\u00020\r2\b\u0010V\u001a\u0004\u0018\u00010WJ\u0016\u0010X\u001a\u00020&2\u0006\u0010@\u001a\u00020Y2\u0006\u0010Z\u001a\u00020YJ\u0016\u0010[\u001a\u00020&2\u0006\u0010@\u001a\u00020Y2\u0006\u0010\\\u001a\u00020;JZ\u0010]\u001a\u00020&2\u0006\u0010G\u001a\u00020\r2\u0006\u0010H\u001a\u00020\r2\u0006\u0010I\u001a\u00020\r2\u0006\u0010^\u001a\u00020N2\u0006\u0010J\u001a\u00020\r2\u0006\u0010K\u001a\u00020\r2\u0006\u0010L\u001a\u00020\r2\u0006\u0010_\u001a\u00020N2\b\u00102\u001a\u0004\u0018\u0001032\b\u0010O\u001a\u0004\u0018\u00010PJB\u0010`\u001a\u0004\u0018\u00010;2\u0006\u0010G\u001a\u00020\r2\u0006\u0010H\u001a\u00020\r2\u0006\u0010I\u001a\u00020\r2\u0006\u0010J\u001a\u00020\r2\u0006\u0010K\u001a\u00020\r2\u0006\u0010L\u001a\u00020\r2\b\u00102\u001a\u0004\u0018\u000103J\u0016\u0010a\u001a\u00020&2\u0006\u0010@\u001a\u00020Y2\u0006\u0010Z\u001a\u00020YJ\u0016\u0010b\u001a\u00020&2\u0006\u0010@\u001a\u00020Y2\u0006\u0010Z\u001a\u00020YJ\u0016\u0010b\u001a\u00020&2\u0006\u0010@\u001a\u00020Y2\u0006\u0010\\\u001a\u00020;J\u0016\u0010b\u001a\u00020&2\u0006\u0010c\u001a\u00020;2\u0006\u0010Z\u001a\u00020;J6\u0010b\u001a\u00020&2\u0006\u0010G\u001a\u00020\r2\u0006\u0010H\u001a\u00020\r2\u0006\u0010I\u001a\u00020\r2\u0006\u0010J\u001a\u00020\r2\u0006\u0010K\u001a\u00020\r2\u0006\u0010L\u001a\u00020\rJ@\u0010d\u001a\u00020&2\u0006\u0010G\u001a\u00020\r2\u0006\u0010H\u001a\u00020\r2\u0006\u0010I\u001a\u00020\r2\u0006\u0010J\u001a\u00020\r2\u0006\u0010K\u001a\u00020\r2\u0006\u0010L\u001a\u00020\r2\b\u0010O\u001a\u0004\u0018\u00010PJ@\u0010e\u001a\u00020&2\u0006\u0010G\u001a\u00020\r2\u0006\u0010H\u001a\u00020\r2\u0006\u0010I\u001a\u00020\r2\u0006\u0010J\u001a\u00020\r2\u0006\u0010K\u001a\u00020\r2\u0006\u0010L\u001a\u00020\r2\b\u0010O\u001a\u0004\u0018\u00010PJ&\u0010f\u001a\u00020;2\u0006\u0010@\u001a\u00020Y2\u0006\u0010J\u001a\u00020\r2\u0006\u0010K\u001a\u00020\r2\u0006\u0010L\u001a\u00020\rJ\u0016\u0010f\u001a\u00020;2\u0006\u0010g\u001a\u00020Y2\u0006\u0010h\u001a\u00020YJ\u0016\u0010f\u001a\u00020;2\u0006\u0010@\u001a\u00020Y2\u0006\u0010\\\u001a\u00020;J\u0016\u0010f\u001a\u00020;2\u0006\u0010c\u001a\u00020;2\u0006\u0010Z\u001a\u00020;J@\u0010f\u001a\u00020;2\u0006\u0010G\u001a\u00020\r2\u0006\u0010H\u001a\u00020\r2\u0006\u0010I\u001a\u00020\r2\u0006\u0010J\u001a\u00020\r2\u0006\u0010K\u001a\u00020\r2\u0006\u0010L\u001a\u00020\r2\b\u0010O\u001a\u0004\u0018\u00010PJF\u0010i\u001a\b\u0012\u0004\u0012\u00020;0j2\u0006\u0010k\u001a\u00020\r2\u0006\u0010l\u001a\u00020\r2\u0006\u0010m\u001a\u00020\r2\u0006\u0010n\u001a\u00020\r2\u0006\u0010o\u001a\u00020\r2\u0006\u0010p\u001a\u00020\r2\b\u0010O\u001a\u0004\u0018\u00010PJN\u0010q\u001a\b\u0012\u0004\u0012\u00020;0r2\u0006\u0010G\u001a\u00020\r2\u0006\u0010H\u001a\u00020\r2\u0006\u0010I\u001a\u00020\r2\u0006\u0010J\u001a\u00020\r2\u0006\u0010K\u001a\u00020\r2\u0006\u0010L\u001a\u00020\r2\u0006\u0010s\u001a\u00020&2\b\u0010O\u001a\u0004\u0018\u00010PJV\u0010q\u001a\b\u0012\u0004\u0012\u00020;0r2\u0006\u0010G\u001a\u00020\r2\u0006\u0010H\u001a\u00020\r2\u0006\u0010I\u001a\u00020\r2\u0006\u0010J\u001a\u00020\r2\u0006\u0010K\u001a\u00020\r2\u0006\u0010L\u001a\u00020\r2\u0006\u0010s\u001a\u00020&2\u0006\u0010t\u001a\u00020\r2\b\u0010O\u001a\u0004\u0018\u00010PJ@\u0010u\u001a\u00020;2\u0006\u0010G\u001a\u00020\r2\u0006\u0010H\u001a\u00020\r2\u0006\u0010I\u001a\u00020\r2\u0006\u0010J\u001a\u00020\r2\u0006\u0010K\u001a\u00020\r2\u0006\u0010L\u001a\u00020\r2\b\u0010O\u001a\u0004\u0018\u00010PJ\u001e\u0010v\u001a\u00020&2\u0006\u0010@\u001a\u00020Y2\u0006\u0010^\u001a\u00020N2\u0006\u0010Z\u001a\u00020YJ\u001e\u0010v\u001a\u00020&2\u0006\u0010@\u001a\u00020Y2\u0006\u0010^\u001a\u00020N2\u0006\u0010\\\u001a\u00020;J\u001e\u0010v\u001a\u00020&2\u0006\u0010c\u001a\u00020;2\u0006\u0010^\u001a\u00020N2\u0006\u0010Z\u001a\u00020;J>\u0010v\u001a\u00020&2\u0006\u0010G\u001a\u00020\r2\u0006\u0010H\u001a\u00020\r2\u0006\u0010I\u001a\u00020\r2\u0006\u0010^\u001a\u00020N2\u0006\u0010J\u001a\u00020\r2\u0006\u0010K\u001a\u00020\r2\u0006\u0010L\u001a\u00020\rJH\u0010w\u001a\u00020&2\u0006\u0010G\u001a\u00020\r2\u0006\u0010H\u001a\u00020\r2\u0006\u0010I\u001a\u00020\r2\u0006\u0010^\u001a\u00020N2\u0006\u0010J\u001a\u00020\r2\u0006\u0010K\u001a\u00020\r2\u0006\u0010L\u001a\u00020\r2\b\u0010O\u001a\u0004\u0018\u00010PJH\u0010x\u001a\u00020;2\u0006\u0010G\u001a\u00020\r2\u0006\u0010H\u001a\u00020\r2\u0006\u0010I\u001a\u00020\r2\u0006\u0010^\u001a\u00020N2\u0006\u0010J\u001a\u00020\r2\u0006\u0010K\u001a\u00020\r2\u0006\u0010L\u001a\u00020\r2\b\u0010O\u001a\u0004\u0018\u00010PJ\u0016\u0010y\u001a\u00020&2\u0006\u0010:\u001a\u00020;2\u0006\u0010z\u001a\u00020{R\u001c\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082D¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\rX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\rX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006}
  #1370 = Utf8               d2
  #1371 = Utf8
  #1372 = Utf8               Brproject
  #1373 = Utf8               WhenMappings
  #1374 = Utf8               GeoEngineInterface
  #1375 = Utf8               MapMode
  #1376 = Utf8               kotlin/jvm/internal/Ref$DoubleRef
  #1377 = Class              #1376        // kotlin/jvm/internal/Ref$DoubleRef
  #1378 = Utf8               kotlin/jvm/internal/Ref
  #1379 = Class              #1378        // kotlin/jvm/internal/Ref
  #1380 = Utf8               DoubleRef
  #1381 = Utf8               kotlin/jvm/internal/Ref$IntRef
  #1382 = Class              #1381        // kotlin/jvm/internal/Ref$IntRef
  #1383 = Utf8               IntRef
  #1384 = Utf8               kotlin/jvm/internal/Ref$ObjectRef
  #1385 = Class              #1384        // kotlin/jvm/internal/Ref$ObjectRef
  #1386 = Utf8               ObjectRef
  #1387 = Utf8               GeoEngine.kt
  #1388 = Utf8               Lkotlin/jvm/internal/SourceDebugExtension;
  #1389 = Utf8               value
  #1390 = Utf8               SMAP\nGeoEngine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GeoEngine.kt\next/mods/gameserver/geoengine/GeoEngine\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1319:1\n147#1,2:1342\n153#1,3:1344\n160#1,7:1347\n153#1,3:1354\n160#1,7:1357\n153#1,3:1364\n160#1,7:1367\n147#1,2:1374\n116#2,11:1320\n116#2,11:1331\n1915#3:1376\n1391#3:1377\n1480#3,2:1378\n1642#3,10:1380\n1915#3:1390\n1916#3:1392\n1652#3:1393\n1482#3,3:1394\n1807#3,3:1397\n1916#3:1400\n1586#3:1401\n1661#3,3:1402\n1924#3,3:1405\n1#4:1391\n*S KotlinDebug\n*F\n+ 1 GeoEngine.kt\next/mods/gameserver/geoengine/GeoEngine\n*L\n233#1:1342,2\n250#1:1344,3\n251#1:1347,7\n265#1:1354,3\n266#1:1357,7\n317#1:1364,3\n318#1:1367,7\n342#1:1374,2\n192#1:1320,11\n201#1:1331,11\n447#1:1376\n452#1:1377\n452#1:1378,2\n453#1:1380,10\n453#1:1390\n453#1:1392\n453#1:1393\n452#1:1394,3\n463#1:1397,3\n447#1:1400\n966#1:1401\n966#1:1402,3\n1003#1:1405,3\n453#1:1391\n*E\n
  #1391 = Utf8               RuntimeInvisibleAnnotations
  #1392 = Utf8               Signature
  #1393 = Utf8               Code
  #1394 = Utf8               StackMapTable
  #1395 = Utf8               LineNumberTable
  #1396 = Utf8               LocalVariableTable
  #1397 = Utf8               RuntimeInvisibleParameterAnnotations
  #1398 = Utf8               RuntimeVisibleAnnotations
  #1399 = Utf8               InnerClasses
  #1400 = Utf8               SourceFile
  #1401 = Utf8               SourceDebugExtension
  #1402 = Utf8               BootstrapMethods
{
  public static final ext.mods.gameserver.geoengine.GeoEngine$Companion Companion;
    descriptor: Lext/mods/gameserver/geoengine/GeoEngine$Companion;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    RuntimeInvisibleAnnotations:
      0: #611()
        org.jetbrains.annotations.NotNull

  public final ext.mods.gameserver.geoengine.geodata.ABlock getBlock(int, int);
    descriptor: (II)Lext/mods/gameserver/geoengine/geodata/ABlock;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: iload_1
         2: iload_2
         3: invokespecial #613                // Method getBlockRaw:(II)Lext/mods/gameserver/geoengine/geodata/ABlock;
         6: areturn
      LineNumberTable:
        line 247: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/geoengine/GeoEngine;
            0       7     1  geoX   I
            0       7     2  geoY   I
    RuntimeInvisibleAnnotations:
      0: #611()
        org.jetbrains.annotations.NotNull

  public final boolean hasGeoPos(int, int);
    descriptor: (II)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: iload_1
         2: iload_2
         3: invokespecial #613                // Method getBlockRaw:(II)Lext/mods/gameserver/geoengine/geodata/ABlock;
         6: invokevirtual #618                // Method ext/mods/gameserver/geoengine/geodata/ABlock.hasGeoPos:()Z
         9: ireturn
      LineNumberTable:
        line 248: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/geoengine/GeoEngine;
            0      10     1  geoX   I
            0      10     2  geoY   I

  public final short getHeightNearest(int, int, int);
    descriptor: (III)S
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=6, locals=13, args_size=4
         0: aload_0
         1: astore        6
         3: iload_1
         4: istore        7
         6: iload_2
         7: istore        8
         9: iload_3
        10: istore        9
        12: iconst_0
        13: istore        10
        15: iload         7
        17: i2l
        18: bipush        36
        20: lshl
        21: iload         8
        23: i2l
        24: bipush        18
        26: lshl
        27: lor
        28: iload         9
        30: iconst_4
        31: ishr
        32: i2l
        33: ldc2_w        #268                // long 262143l
        36: land
        37: lor
        38: lstore        4
        40: aload_0
        41: astore        7
        43: lload         4
        45: lstore        8
        47: iconst_0
        48: istore        10
        50: lload         8
        52: lload         8
        54: bipush        32
        56: lushr
        57: lxor
        58: l2i
        59: istore        11
        61: iload         11
        63: iload         11
        65: bipush        16
        67: iushr
        68: ixor
        69: istore        11
        71: iload         11
        73: ldc_w         #276                // int -2048144789
        76: imul
        77: istore        11
        79: iload         11
        81: iload         11
        83: bipush        13
        85: iushr
        86: ixor
        87: istore        11
        89: iload         11
        91: ldc_w         #277                // int -1028477387
        94: imul
        95: istore        11
        97: iload         11
        99: iload         11
       101: bipush        16
       103: iushr
       104: ixor
       105: aload         7
       107: getfield      #41                 // Field CACHE_MASK:I
       110: iand
       111: istore        12
       113: iload         12
       115: aload         7
       117: getfield      #34                 // Field PADDING_SHIFT:I
       120: ishl
       121: istore        6
       123: aload_0
       124: getfield      #47                 // Field heightCacheKeys:[J
       127: iload         6
       129: laload
       130: lload         4
       132: lcmp
       133: ifne          144
       136: aload_0
       137: getfield      #51                 // Field heightCacheVals:[S
       140: iload         6
       142: saload
       143: ireturn
       144: aload_0
       145: iload_1
       146: iload_2
       147: invokespecial #613                // Method getBlockRaw:(II)Lext/mods/gameserver/geoengine/geodata/ABlock;
       150: iload_1
       151: iload_2
       152: iload_3
       153: aconst_null
       154: invokevirtual #623                // Method ext/mods/gameserver/geoengine/geodata/ABlock.getHeightNearest:(IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)S
       157: istore        7
       159: aload_0
       160: getfield      #47                 // Field heightCacheKeys:[J
       163: iload         6
       165: lload         4
       167: lastore
       168: aload_0
       169: getfield      #51                 // Field heightCacheVals:[S
       172: iload         6
       174: iload         7
       176: sastore
       177: iload         7
       179: ireturn
      StackMapTable: number_of_entries = 1
        frame_type = 255 /* full_frame */
          offset_delta = 144
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine, int, int, int, long, int, class ext/mods/gameserver/geoengine/GeoEngine, long, int, int, int ]
          stack = []
      LineNumberTable:
        line 250: 0
        line 1344: 15
        line 1345: 21
        line 1344: 27
        line 1346: 28
        line 1344: 37
        line 250: 38
        line 251: 40
        line 1347: 50
        line 1348: 61
        line 1349: 71
        line 1350: 79
        line 1351: 89
        line 1352: 97
        line 1353: 113
        line 251: 121
        line 253: 123
        line 255: 144
        line 256: 159
        line 257: 168
        line 258: 177
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           15      23    10 $i$f$getGeoKey   I
           12      26     6 this_$iv   Lext/mods/gameserver/geoengine/GeoEngine;
           12      26     7 geoX$iv   I
           12      26     8 geoY$iv   I
           12      26     9  z$iv   I
           50      71    10 $i$f$hashKeyPadded   I
           61      60    11  h$iv   I
          113       8    12 baseIndex$iv   I
           47      74     7 this_$iv   Lext/mods/gameserver/geoengine/GeoEngine;
           47      74     8 key$iv   J
           40     140     4   key   J
          123      57     6 index   I
          159      21     7 height   S
            0     180     0  this   Lext/mods/gameserver/geoengine/GeoEngine;
            0     180     1  geoX   I
            0     180     2  geoY   I
            0     180     3 worldZ   I

  public final short getHeightNearest(int, int, int, ext.mods.gameserver.geoengine.geodata.IGeoObject);
    descriptor: (IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)S
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=5, locals=5, args_size=5
         0: aload         4
         2: ifnull        20
         5: aload_0
         6: iload_1
         7: iload_2
         8: invokespecial #613                // Method getBlockRaw:(II)Lext/mods/gameserver/geoengine/geodata/ABlock;
        11: iload_1
        12: iload_2
        13: iload_3
        14: aload         4
        16: invokevirtual #623                // Method ext/mods/gameserver/geoengine/geodata/ABlock.getHeightNearest:(IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)S
        19: ireturn
        20: aload_0
        21: iload_1
        22: iload_2
        23: iload_3
        24: invokevirtual #634                // Method getHeightNearest:(III)S
        27: ireturn
      StackMapTable: number_of_entries = 1
        frame_type = 20 /* same */
      LineNumberTable:
        line 261: 0
        line 262: 20
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lext/mods/gameserver/geoengine/GeoEngine;
            0      28     1  geoX   I
            0      28     2  geoY   I
            0      28     3 worldZ   I
            0      28     4 ignore   Lext/mods/gameserver/geoengine/geodata/IGeoObject;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
      parameter 1:
      parameter 2:
      parameter 3:
        0: #632()
          org.jetbrains.annotations.Nullable

  public final byte getNsweNearest(int, int, int);
    descriptor: (III)B
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=6, locals=13, args_size=4
         0: aload_0
         1: astore        6
         3: iload_1
         4: istore        7
         6: iload_2
         7: istore        8
         9: iload_3
        10: istore        9
        12: iconst_0
        13: istore        10
        15: iload         7
        17: i2l
        18: bipush        36
        20: lshl
        21: iload         8
        23: i2l
        24: bipush        18
        26: lshl
        27: lor
        28: iload         9
        30: iconst_4
        31: ishr
        32: i2l
        33: ldc2_w        #268                // long 262143l
        36: land
        37: lor
        38: lstore        4
        40: aload_0
        41: astore        7
        43: lload         4
        45: lstore        8
        47: iconst_0
        48: istore        10
        50: lload         8
        52: lload         8
        54: bipush        32
        56: lushr
        57: lxor
        58: l2i
        59: istore        11
        61: iload         11
        63: iload         11
        65: bipush        16
        67: iushr
        68: ixor
        69: istore        11
        71: iload         11
        73: ldc_w         #276                // int -2048144789
        76: imul
        77: istore        11
        79: iload         11
        81: iload         11
        83: bipush        13
        85: iushr
        86: ixor
        87: istore        11
        89: iload         11
        91: ldc_w         #277                // int -1028477387
        94: imul
        95: istore        11
        97: iload         11
        99: iload         11
       101: bipush        16
       103: iushr
       104: ixor
       105: aload         7
       107: getfield      #41                 // Field CACHE_MASK:I
       110: iand
       111: istore        12
       113: iload         12
       115: aload         7
       117: getfield      #34                 // Field PADDING_SHIFT:I
       120: ishl
       121: istore        6
       123: aload_0
       124: getfield      #54                 // Field nsweCacheKeys:[J
       127: iload         6
       129: laload
       130: lload         4
       132: lcmp
       133: ifne          144
       136: aload_0
       137: getfield      #58                 // Field nsweCacheVals:[B
       140: iload         6
       142: baload
       143: ireturn
       144: aload_0
       145: iload_1
       146: iload_2
       147: invokespecial #613                // Method getBlockRaw:(II)Lext/mods/gameserver/geoengine/geodata/ABlock;
       150: iload_1
       151: iload_2
       152: iload_3
       153: aconst_null
       154: invokevirtual #641                // Method ext/mods/gameserver/geoengine/geodata/ABlock.getNsweNearest:(IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)B
       157: istore        7
       159: aload_0
       160: getfield      #54                 // Field nsweCacheKeys:[J
       163: iload         6
       165: lload         4
       167: lastore
       168: aload_0
       169: getfield      #58                 // Field nsweCacheVals:[B
       172: iload         6
       174: iload         7
       176: bastore
       177: iload         7
       179: ireturn
      StackMapTable: number_of_entries = 1
        frame_type = 255 /* full_frame */
          offset_delta = 144
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine, int, int, int, long, int, class ext/mods/gameserver/geoengine/GeoEngine, long, int, int, int ]
          stack = []
      LineNumberTable:
        line 265: 0
        line 1354: 15
        line 1355: 21
        line 1354: 27
        line 1356: 28
        line 1354: 37
        line 265: 38
        line 266: 40
        line 1357: 50
        line 1358: 61
        line 1359: 71
        line 1360: 79
        line 1361: 89
        line 1362: 97
        line 1363: 113
        line 266: 121
        line 268: 123
        line 270: 144
        line 271: 159
        line 272: 168
        line 273: 177
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           15      23    10 $i$f$getGeoKey   I
           12      26     6 this_$iv   Lext/mods/gameserver/geoengine/GeoEngine;
           12      26     7 geoX$iv   I
           12      26     8 geoY$iv   I
           12      26     9  z$iv   I
           50      71    10 $i$f$hashKeyPadded   I
           61      60    11  h$iv   I
          113       8    12 baseIndex$iv   I
           47      74     7 this_$iv   Lext/mods/gameserver/geoengine/GeoEngine;
           47      74     8 key$iv   J
           40     140     4   key   J
          123      57     6 index   I
          159      21     7  nswe   B
            0     180     0  this   Lext/mods/gameserver/geoengine/GeoEngine;
            0     180     1  geoX   I
            0     180     2  geoY   I
            0     180     3 worldZ   I

  public final byte getNsweNearest(int, int, int, ext.mods.gameserver.geoengine.geodata.IGeoObject);
    descriptor: (IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)B
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=5, locals=5, args_size=5
         0: aload         4
         2: ifnull        20
         5: aload_0
         6: iload_1
         7: iload_2
         8: invokespecial #613                // Method getBlockRaw:(II)Lext/mods/gameserver/geoengine/geodata/ABlock;
        11: iload_1
        12: iload_2
        13: iload_3
        14: aload         4
        16: invokevirtual #641                // Method ext/mods/gameserver/geoengine/geodata/ABlock.getNsweNearest:(IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)B
        19: ireturn
        20: aload_0
        21: iload_1
        22: iload_2
        23: iload_3
        24: invokevirtual #644                // Method getNsweNearest:(III)B
        27: ireturn
      StackMapTable: number_of_entries = 1
        frame_type = 20 /* same */
      LineNumberTable:
        line 276: 0
        line 277: 20
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lext/mods/gameserver/geoengine/GeoEngine;
            0      28     1  geoX   I
            0      28     2  geoY   I
            0      28     3 worldZ   I
            0      28     4 ignore   Lext/mods/gameserver/geoengine/geodata/IGeoObject;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
      parameter 1:
      parameter 2:
      parameter 3:
        0: #632()
          org.jetbrains.annotations.Nullable

  public final boolean hasGeo(int, int);
    descriptor: (II)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: getstatic     #648                // Field Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
         4: iload_1
         5: invokevirtual #654                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoX:(I)I
         8: getstatic     #648                // Field Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
        11: iload_2
        12: invokevirtual #657                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoY:(I)I
        15: invokevirtual #659                // Method hasGeoPos:(II)Z
        18: ireturn
      LineNumberTable:
        line 279: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/geoengine/GeoEngine;
            0      19     1 worldX   I
            0      19     2 worldY   I

  public final short getHeight(ext.mods.gameserver.model.location.Location);
    descriptor: (Lext/mods/gameserver/model/location/Location;)S
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: getstatic     #648                // Field Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
         4: aload_1
         5: invokevirtual #668                // Method ext/mods/gameserver/model/location/Location.getX:()I
         8: invokevirtual #654                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoX:(I)I
        11: getstatic     #648                // Field Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
        14: aload_1
        15: invokevirtual #671                // Method ext/mods/gameserver/model/location/Location.getY:()I
        18: invokevirtual #657                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoY:(I)I
        21: aload_1
        22: invokevirtual #674                // Method ext/mods/gameserver/model/location/Location.getZ:()I
        25: invokevirtual #634                // Method getHeightNearest:(III)S
        28: ireturn
      LineNumberTable:
        line 280: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      29     0  this   Lext/mods/gameserver/geoengine/GeoEngine;
            0      29     1   loc   Lext/mods/gameserver/model/location/Location;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #611()
          org.jetbrains.annotations.NotNull

  public final short getHeight(int, int, int);
    descriptor: (III)S
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=4, args_size=4
         0: aload_0
         1: getstatic     #648                // Field Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
         4: iload_1
         5: invokevirtual #654                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoX:(I)I
         8: getstatic     #648                // Field Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
        11: iload_2
        12: invokevirtual #657                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoY:(I)I
        15: iload_3
        16: invokevirtual #634                // Method getHeightNearest:(III)S
        19: ireturn
      LineNumberTable:
        line 281: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/geoengine/GeoEngine;
            0      20     1 worldX   I
            0      20     2 worldY   I
            0      20     3 worldZ   I

  public final byte getNswe(int, int, int);
    descriptor: (III)B
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=4, args_size=4
         0: aload_0
         1: getstatic     #648                // Field Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
         4: iload_1
         5: invokevirtual #654                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoX:(I)I
         8: getstatic     #648                // Field Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
        11: iload_2
        12: invokevirtual #657                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoY:(I)I
        15: iload_3
        16: invokevirtual #644                // Method getNsweNearest:(III)B
        19: ireturn
      LineNumberTable:
        line 282: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/geoengine/GeoEngine;
            0      20     1 worldX   I
            0      20     2 worldY   I
            0      20     3 worldZ   I

  public final boolean hasBlockedNeighborAtSameLevel(int, int, int);
    descriptor: (III)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=5, locals=14, args_size=4
         0: iload_3
         1: bipush        48
         3: iadd
         4: istore        4
         6: aload_0
         7: invokespecial #689                // Method getBoundaryRadiusCells:()I
        10: istore        5
        12: iload         5
        14: ineg
        15: istore        6
        17: iload         6
        19: iload         5
        21: if_icmpgt     181
        24: iload         5
        26: ineg
        27: istore        7
        29: iload         7
        31: iload         5
        33: if_icmpgt     168
        36: iload         6
        38: ifne          46
        41: iload         7
        43: ifeq          155
        46: iload_1
        47: iload         6
        49: iadd
        50: istore        8
        52: iload_2
        53: iload         7
        55: iadd
        56: istore        9
        58: iload         8
        60: iflt          155
        63: iload         8
        65: sipush        22528
        68: if_icmpge     155
        71: iload         9
        73: iflt          155
        76: iload         9
        78: ldc_w         #690                // int 32768
        81: if_icmplt     87
        84: goto          155
        87: aload_0
        88: iload         8
        90: iload         9
        92: invokevirtual #692                // Method getBlock:(II)Lext/mods/gameserver/geoengine/geodata/ABlock;
        95: astore        10
        97: aload         10
        99: iload         8
       101: iload         9
       103: iload         4
       105: aconst_null
       106: invokevirtual #696                // Method ext/mods/gameserver/geoengine/geodata/ABlock.getIndexBelow:(IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)I
       109: istore        11
       111: iload         11
       113: iflt          155
       116: aload         10
       118: iload         11
       120: aconst_null
       121: invokevirtual #699                // Method ext/mods/gameserver/geoengine/geodata/ABlock.getHeight:(ILext/mods/gameserver/geoengine/geodata/IGeoObject;)S
       124: istore        12
       126: iload         12
       128: iload_3
       129: isub
       130: invokestatic  #704                // Method java/lang/Math.abs:(I)I
       133: bipush        48
       135: if_icmpgt     155
       138: aload         10
       140: iload         11
       142: aconst_null
       143: invokevirtual #707                // Method ext/mods/gameserver/geoengine/geodata/ABlock.getNswe:(ILext/mods/gameserver/geoengine/geodata/IGeoObject;)B
       146: istore        13
       148: iload         13
       150: ifne          155
       153: iconst_1
       154: ireturn
       155: iload         7
       157: iload         5
       159: if_icmpeq     168
       162: iinc          7, 1
       165: goto          36
       168: iload         6
       170: iload         5
       172: if_icmpeq     181
       175: iinc          6, 1
       178: goto          24
       181: iconst_0
       182: ireturn
      StackMapTable: number_of_entries = 7
        frame_type = 254 /* append */
          offset_delta = 24
          locals = [ int, int, int ]
        frame_type = 252 /* append */
          offset_delta = 11
          locals = [ int ]
        frame_type = 9 /* same */
        frame_type = 253 /* append */
          offset_delta = 40
          locals = [ int, int ]
        frame_type = 249 /* chop */
          offset_delta = 67
        frame_type = 12 /* same */
        frame_type = 250 /* chop */
          offset_delta = 12
      LineNumberTable:
        line 286: 0
        line 287: 6
        line 288: 12
        line 289: 24
        line 290: 36
        line 291: 46
        line 292: 52
        line 293: 58
        line 294: 87
        line 295: 97
        line 296: 111
        line 297: 116
        line 298: 126
        line 298: 133
        line 299: 138
        line 300: 148
        line 289: 155
        line 288: 168
        line 305: 181
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          148       7    13  nswe   B
          126      29    12    nz   I
           52     103     8    nx   I
           58      97     9    ny   I
           97      58    10 block   Lext/mods/gameserver/geoengine/geodata/ABlock;
          111      44    11 index   I
           29     139     7    dy   I
           17     164     6    dx   I
            6     177     4 checkZ   I
           12     171     5 radius   I
            0     183     0  this   Lext/mods/gameserver/geoengine/GeoEngine;
            0     183     1  geoX   I
            0     183     2  geoY   I
            0     183     3     z   I

  public final void addGeoObject(ext.mods.gameserver.geoengine.geodata.IGeoObject);
    descriptor: (Lext/mods/gameserver/geoengine/geodata/IGeoObject;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: iconst_1
         3: invokespecial #748                // Method toggleGeoObject:(Lext/mods/gameserver/geoengine/geodata/IGeoObject;Z)V
         6: return
      LineNumberTable:
        line 326: 0
        line 327: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/geoengine/GeoEngine;
            0       7     1   obj   Lext/mods/gameserver/geoengine/geodata/IGeoObject;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #611()
          org.jetbrains.annotations.NotNull

  public final void removeGeoObject(ext.mods.gameserver.geoengine.geodata.IGeoObject);
    descriptor: (Lext/mods/gameserver/geoengine/geodata/IGeoObject;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: iconst_0
         3: invokespecial #748                // Method toggleGeoObject:(Lext/mods/gameserver/geoengine/geodata/IGeoObject;Z)V
         6: return
      LineNumberTable:
        line 329: 0
        line 330: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/geoengine/GeoEngine;
            0       7     1   obj   Lext/mods/gameserver/geoengine/geodata/IGeoObject;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #611()
          org.jetbrains.annotations.NotNull

  public final boolean canMoveAround(int, int, int);
    descriptor: (III)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=10, args_size=4
         0: getstatic     #648                // Field Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
         3: iload_1
         4: invokevirtual #654                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoX:(I)I
         7: istore        4
         9: getstatic     #648                // Field Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
        12: iload_2
        13: invokevirtual #657                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoY:(I)I
        16: istore        5
        18: iconst_m1
        19: istore        6
        21: iload         6
        23: iconst_2
        24: if_icmpge     78
        27: iconst_m1
        28: istore        7
        30: iload         7
        32: iconst_2
        33: if_icmpge     72
        36: iload         4
        38: iload         6
        40: iadd
        41: istore        8
        43: iload         5
        45: iload         7
        47: iadd
        48: istore        9
        50: aload_0
        51: iload         8
        53: iload         9
        55: iload_3
        56: invokevirtual #644                // Method getNsweNearest:(III)B
        59: bipush        15
        61: if_icmpeq     66
        64: iconst_0
        65: ireturn
        66: iinc          7, 1
        69: goto          30
        72: iinc          6, 1
        75: goto          21
        78: iconst_1
        79: ireturn
      StackMapTable: number_of_entries = 5
        frame_type = 254 /* append */
          offset_delta = 21
          locals = [ int, int, int ]
        frame_type = 252 /* append */
          offset_delta = 8
          locals = [ int ]
        frame_type = 253 /* append */
          offset_delta = 35
          locals = [ int, int ]
        frame_type = 249 /* chop */
          offset_delta = 5
        frame_type = 250 /* chop */
          offset_delta = 5
      LineNumberTable:
        line 369: 0
        line 370: 9
        line 371: 18
        line 372: 27
        line 373: 36
        line 374: 43
        line 375: 50
        line 372: 66
        line 371: 72
        line 378: 78
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           43      23     8    gx   I
           50      16     9    gy   I
           30      42     7    iy   I
           21      57     6    ix   I
            9      71     4  geoX   I
           18      62     5  geoY   I
            0      80     0  this   Lext/mods/gameserver/geoengine/GeoEngine;
            0      80     1 worldX   I
            0      80     2 worldY   I
            0      80     3 worldZ   I

  public final boolean canMoveWithCollisionBox(int, int, int, int, int, int, double, ext.mods.gameserver.network.serverpackets.ExServerPrimitive);
    descriptor: (IIIIIIDLext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=8, locals=21, args_size=9
         0: dload         7
         2: dconst_0
         3: dcmpg
         4: ifgt          23
         7: aload_0
         8: iload_1
         9: iload_2
        10: iload_3
        11: iload         4
        13: iload         5
        15: iload         6
        17: aload         9
        19: invokevirtual #793                // Method canMove:(IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
        22: ireturn
        23: iconst_1
        24: dload         7
        26: ldc2_w        #794                // double 8.0d
        29: ddiv
        30: d2i
        31: invokestatic  #798                // Method java/lang/Math.max:(II)I
        34: istore        10
        36: iconst_0
        37: istore        11
        39: iload         11
        41: iload         10
        43: if_icmpgt     197
        46: iload         11
        48: i2d
        49: iload         10
        51: i2d
        52: ddiv
        53: dstore        12
        55: iload_1
        56: i2d
        57: iload         4
        59: iload_1
        60: isub
        61: i2d
        62: dload         12
        64: dmul
        65: dadd
        66: d2i
        67: istore        14
        69: iload_2
        70: i2d
        71: iload         5
        73: iload_2
        74: isub
        75: i2d
        76: dload         12
        78: dmul
        79: dadd
        80: d2i
        81: istore        15
        83: iload_3
        84: i2d
        85: iload         6
        87: iload_3
        88: isub
        89: i2d
        90: dload         12
        92: dmul
        93: dadd
        94: d2i
        95: istore        16
        97: iconst_m1
        98: istore        17
       100: iload         17
       102: iconst_2
       103: if_icmpge     184
       106: iconst_m1
       107: istore        18
       109: iload         18
       111: iconst_2
       112: if_icmpge     178
       115: iload         17
       117: ifne          125
       120: iload         18
       122: ifeq          172
       125: iload         14
       127: iload         17
       129: i2d
       130: dload         7
       132: dmul
       133: d2i
       134: iadd
       135: istore        19
       137: iload         15
       139: iload         18
       141: i2d
       142: dload         7
       144: dmul
       145: d2i
       146: iadd
       147: istore        20
       149: aload_0
       150: iload         19
       152: iload         20
       154: iload         16
       156: iload         19
       158: iload         20
       160: iload         16
       162: aload         9
       164: invokevirtual #793                // Method canMove:(IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
       167: ifne          172
       170: iconst_0
       171: ireturn
       172: iinc          18, 1
       175: goto          109
       178: iinc          17, 1
       181: goto          100
       184: iload         11
       186: iload         10
       188: if_icmpeq     197
       191: iinc          11, 1
       194: goto          46
       197: aload_0
       198: iload_1
       199: iload_2
       200: iload_3
       201: iload         4
       203: iload         5
       205: iload         6
       207: aload         9
       209: invokevirtual #793                // Method canMove:(IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
       212: ireturn
      StackMapTable: number_of_entries = 9
        frame_type = 23 /* same */
        frame_type = 253 /* append */
          offset_delta = 22
          locals = [ int, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 53
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine, int, int, int, int, int, int, double, class ext/mods/gameserver/network/serverpackets/ExServerPrimitive, int, int, double, int, int, int, int ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 8
          locals = [ int ]
        frame_type = 15 /* same */
        frame_type = 46 /* same */
        frame_type = 5 /* same */
        frame_type = 250 /* chop */
          offset_delta = 5
        frame_type = 255 /* full_frame */
          offset_delta = 12
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine, int, int, int, int, int, int, double, class ext/mods/gameserver/network/serverpackets/ExServerPrimitive, int, int ]
          stack = []
      LineNumberTable:
        line 386: 0
        line 387: 7
        line 389: 23
        line 389: 34
        line 391: 36
        line 392: 46
        line 393: 55
        line 394: 69
        line 395: 83
        line 396: 97
        line 397: 106
        line 398: 115
        line 399: 125
        line 400: 137
        line 401: 149
        line 402: 170
        line 397: 172
        line 396: 178
        line 391: 184
        line 407: 197
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          137      35    19 testX   I
          149      23    20 testY   I
          109      69    18 offsetY   I
          100      84    17 offsetX   I
           55     129    12 factor   D
           69     115    14 checkX   I
           83     101    15 checkY   I
           97      87    16 checkZ   I
           39     158    11     i   I
           36     177    10 steps   I
            0     213     0  this   Lext/mods/gameserver/geoengine/GeoEngine;
            0     213     1    ox   I
            0     213     2    oy   I
            0     213     3    oz   I
            0     213     4    tx   I
            0     213     5    ty   I
            0     213     6    tz   I
            0     213     7 collisionRadius   D
            0     213     9 debug   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
      parameter 1:
      parameter 2:
      parameter 3:
      parameter 4:
      parameter 5:
      parameter 6:
      parameter 7:
        0: #632()
          org.jetbrains.annotations.Nullable

  public final boolean isInWater(int, int, int);
    descriptor: (III)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=5, args_size=4
         0: aload_0
         1: iload_1
         2: iload_2
         3: iload_3
         4: invokevirtual #822                // Method getHeight:(III)S
         7: istore        4
         9: iload_3
        10: iload         4
        12: bipush        10
        14: isub
        15: if_icmpge     22
        18: iconst_1
        19: goto          23
        22: iconst_0
        23: ireturn
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ int ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
      LineNumberTable:
        line 410: 0
        line 411: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            9      15     4 groundZ   I
            0      24     0  this   Lext/mods/gameserver/geoengine/GeoEngine;
            0      24     1     x   I
            0      24     2     y   I
            0      24     3     z   I

  public final int getWaterLevel(int, int);
    descriptor: (II)I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=4, args_size=3
         0: aload_0
         1: iload_1
         2: iload_2
         3: iconst_0
         4: invokevirtual #822                // Method getHeight:(III)S
         7: istore_3
         8: iload_3
         9: bipush        10
        11: isub
        12: ireturn
      LineNumberTable:
        line 414: 0
        line 415: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            8       5     3 groundZ   I
            0      13     0  this   Lext/mods/gameserver/geoengine/GeoEngine;
            0      13     1     x   I
            0      13     2     y   I

  public final ext.mods.gameserver.model.location.Location getValidSwimLocationAdvanced(int, int, int, int, int, int, ext.mods.gameserver.model.actor.Creature);
    descriptor: (IIIIIILext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/location/Location;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=8, locals=52, args_size=8
         0: iconst_1
         1: istore        8
         3: nop
         4: nop
         5: aload_0
         6: iload_1
         7: iload_2
         8: iload_3
         9: invokevirtual #830                // Method isInWater:(III)Z
        12: istore        9
        14: aload_0
        15: iload         4
        17: iload         5
        19: iload         6
        21: invokevirtual #830                // Method isInWater:(III)Z
        24: ifne          31
        27: iconst_1
        28: goto          32
        31: iconst_0
        32: istore        10
        34: nop
        35: iload         9
        37: ifeq          91
        40: iload         10
        42: ifeq          91
        45: aload_0
        46: iload_1
        47: iload_2
        48: invokevirtual #832                // Method getWaterLevel:(II)I
        51: istore        11
        53: aload_0
        54: iload         4
        56: iload         5
        58: iload         6
        60: invokevirtual #822                // Method getHeight:(III)S
        63: istore        12
        65: iload         12
        67: iload         11
        69: isub
        70: istore        13
        72: nop
        73: iload         13
        75: bipush        50
        77: if_icmple     91
        80: new           #665                // class ext/mods/gameserver/model/location/Location
        83: dup
        84: iload_1
        85: iload_2
        86: iload_3
        87: invokespecial #835                // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
        90: areturn
        91: iconst_1
        92: istore        9
        94: nop
        95: aload         7
        97: ifnull        625
       100: aload         7
       102: invokevirtual #841                // Method ext/mods/gameserver/model/actor/Creature.getCollisionRadius:()D
       105: dstore        10
       107: nop
       108: dload         10
       110: dconst_0
       111: dcmpl
       112: ifle          625
       115: iconst_1
       116: dload         10
       118: ldc2_w        #794                // double 8.0d
       121: ddiv
       122: d2i
       123: invokestatic  #798                // Method java/lang/Math.max:(II)I
       126: istore        12
       128: new           #843                // class kotlin/ranges/IntRange
       131: dup
       132: iconst_0
       133: iload         12
       135: invokespecial #845                // Method kotlin/ranges/IntRange."<init>":(II)V
       138: checkcast     #847                // class java/lang/Iterable
       141: astore        13
       143: iconst_0
       144: istore        14
       146: aload         13
       148: invokeinterface #851,  1          // InterfaceMethod java/lang/Iterable.iterator:()Ljava/util/Iterator;
       153: astore        15
       155: aload         15
       157: invokeinterface #856,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       162: ifeq          624
       165: aload         15
       167: checkcast     #858                // class kotlin/collections/IntIterator
       170: invokevirtual #861                // Method kotlin/collections/IntIterator.nextInt:()I
       173: istore        16
       175: iload         16
       177: istore        17
       179: iconst_0
       180: istore        18
       182: iload         17
       184: i2d
       185: iload         12
       187: i2d
       188: ddiv
       189: dstore        19
       191: iload_1
       192: i2d
       193: iload         4
       195: iload_1
       196: isub
       197: i2d
       198: dload         19
       200: dmul
       201: dadd
       202: d2i
       203: istore        21
       205: iload_2
       206: i2d
       207: iload         5
       209: iload_2
       210: isub
       211: i2d
       212: dload         19
       214: dmul
       215: dadd
       216: d2i
       217: istore        22
       219: iload_3
       220: i2d
       221: iload         6
       223: iload_3
       224: isub
       225: i2d
       226: dload         19
       228: dmul
       229: dadd
       230: d2i
       231: istore        23
       233: new           #843                // class kotlin/ranges/IntRange
       236: dup
       237: iconst_m1
       238: iconst_1
       239: invokespecial #845                // Method kotlin/ranges/IntRange."<init>":(II)V
       242: checkcast     #847                // class java/lang/Iterable
       245: astore        24
       247: iconst_0
       248: istore        25
       250: aload         24
       252: astore        26
       254: new           #863                // class java/util/ArrayList
       257: dup
       258: invokespecial #864                // Method java/util/ArrayList."<init>":()V
       261: checkcast     #866                // class java/util/Collection
       264: astore        27
       266: iconst_0
       267: istore        28
       269: aload         26
       271: invokeinterface #851,  1          // InterfaceMethod java/lang/Iterable.iterator:()Ljava/util/Iterator;
       276: astore        29
       278: aload         29
       280: invokeinterface #856,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       285: ifeq          510
       288: aload         29
       290: checkcast     #858                // class kotlin/collections/IntIterator
       293: invokevirtual #861                // Method kotlin/collections/IntIterator.nextInt:()I
       296: istore        30
       298: iload         30
       300: istore        31
       302: iconst_0
       303: istore        32
       305: new           #843                // class kotlin/ranges/IntRange
       308: dup
       309: iconst_m1
       310: iconst_1
       311: invokespecial #845                // Method kotlin/ranges/IntRange."<init>":(II)V
       314: checkcast     #847                // class java/lang/Iterable
       317: astore        33
       319: iconst_0
       320: istore        34
       322: aload         33
       324: astore        35
       326: new           #863                // class java/util/ArrayList
       329: dup
       330: invokespecial #864                // Method java/util/ArrayList."<init>":()V
       333: checkcast     #866                // class java/util/Collection
       336: astore        36
       338: iconst_0
       339: istore        37
       341: aload         35
       343: astore        38
       345: iconst_0
       346: istore        39
       348: aload         38
       350: invokeinterface #851,  1          // InterfaceMethod java/lang/Iterable.iterator:()Ljava/util/Iterator;
       355: astore        40
       357: aload         40
       359: invokeinterface #856,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       364: ifeq          486
       367: aload         40
       369: checkcast     #858                // class kotlin/collections/IntIterator
       372: invokevirtual #861                // Method kotlin/collections/IntIterator.nextInt:()I
       375: istore        41
       377: iload         41
       379: istore        42
       381: iconst_0
       382: istore        43
       384: iload         42
       386: istore        44
       388: iconst_0
       389: istore        45
       391: nop
       392: iload         31
       394: ifne          406
       397: iload         44
       399: ifne          406
       402: aconst_null
       403: goto          458
       406: iload         21
       408: iload         31
       410: i2d
       411: dload         10
       413: dmul
       414: d2i
       415: iadd
       416: istore        46
       418: iload         22
       420: iload         44
       422: i2d
       423: dload         10
       425: dmul
       426: d2i
       427: iadd
       428: istore        47
       430: aload_0
       431: iload         46
       433: iload         47
       435: iload         23
       437: iload         46
       439: iload         47
       441: iload         23
       443: aconst_null
       444: invokevirtual #793                // Method canMove:(IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
       447: ifne          454
       450: iconst_1
       451: goto          455
       454: iconst_0
       455: invokestatic  #871                // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
       458: nop
       459: dup
       460: ifnull        481
       463: astore        48
       465: iconst_0
       466: istore        49
       468: aload         36
       470: aload         48
       472: invokeinterface #874,  2          // InterfaceMethod java/util/Collection.add:(Ljava/lang/Object;)Z
       477: pop
       478: goto          482
       481: pop
       482: nop
       483: goto          357
       486: nop
       487: aload         36
       489: checkcast     #876                // class java/util/List
       492: nop
       493: checkcast     #847                // class java/lang/Iterable
       496: nop
       497: astore        50
       499: aload         27
       501: aload         50
       503: invokestatic  #882                // Method kotlin/collections/CollectionsKt.addAll:(Ljava/util/Collection;Ljava/lang/Iterable;)Z
       506: pop
       507: goto          278
       510: aload         27
       512: checkcast     #876                // class java/util/List
       515: nop
       516: checkcast     #847                // class java/lang/Iterable
       519: astore        24
       521: nop
       522: iconst_0
       523: istore        25
       525: aload         24
       527: instanceof    #866                // class java/util/Collection
       530: ifeq          550
       533: aload         24
       535: checkcast     #866                // class java/util/Collection
       538: invokeinterface #885,  1          // InterfaceMethod java/util/Collection.isEmpty:()Z
       543: ifeq          550
       546: iconst_0
       547: goto          601
       550: aload         24
       552: invokeinterface #851,  1          // InterfaceMethod java/lang/Iterable.iterator:()Ljava/util/Iterator;
       557: astore        26
       559: aload         26
       561: invokeinterface #856,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       566: ifeq          600
       569: aload         26
       571: invokeinterface #888,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       576: astore        27
       578: aload         27
       580: checkcast     #868                // class java/lang/Boolean
       583: invokevirtual #891                // Method java/lang/Boolean.booleanValue:()Z
       586: istore        28
       588: iconst_0
       589: istore        29
       591: iload         28
       593: ifeq          559
       596: iconst_1
       597: goto          601
       600: iconst_0
       601: istore        51
       603: iload         51
       605: ifeq          619
       608: new           #665                // class ext/mods/gameserver/model/location/Location
       611: dup
       612: iload_1
       613: iload_2
       614: iload_3
       615: invokespecial #835                // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       618: areturn
       619: nop
       620: nop
       621: goto          155
       624: nop
       625: aload_0
       626: iload_1
       627: iload_2
       628: iload_3
       629: iload         4
       631: iload         5
       633: iload         6
       635: aconst_null
       636: invokevirtual #895                // Method getValidSwimLocation:(IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Lext/mods/gameserver/model/location/Location;
       639: areturn
      StackMapTable: number_of_entries = 21
        frame_type = 253 /* append */
          offset_delta = 31
          locals = [ int, int ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 58
          locals = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 63
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine, int, int, int, int, int, int, class ext/mods/gameserver/model/actor/Creature, int, int, double, int, class java/lang/Iterable, int, class java/util/Iterator ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 122
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine, int, int, int, int, int, int, class ext/mods/gameserver/model/actor/Creature, int, int, double, int, class java/lang/Iterable, int, class java/util/Iterator, int, int, int, double, int, int, int, class java/lang/Iterable, int, class java/lang/Iterable, class java/util/Collection, int, class java/util/Iterator ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 78
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine, int, int, int, int, int, int, class ext/mods/gameserver/model/actor/Creature, int, int, double, int, class java/lang/Iterable, int, class java/util/Iterator, int, int, int, double, int, int, int, class java/lang/Iterable, int, class java/lang/Iterable, class java/util/Collection, int, class java/util/Iterator, int, int, int, class java/lang/Iterable, int, class java/lang/Iterable, class java/util/Collection, int, class java/lang/Iterable, int, class java/util/Iterator ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 48
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine, int, int, int, int, int, int, class ext/mods/gameserver/model/actor/Creature, int, int, double, int, class java/lang/Iterable, int, class java/util/Iterator, int, int, int, double, int, int, int, class java/lang/Iterable, int, class java/lang/Iterable, class java/util/Collection, int, class java/util/Iterator, int, int, int, class java/lang/Iterable, int, class java/lang/Iterable, class java/util/Collection, int, class java/lang/Iterable, int, class java/util/Iterator, int, int, int, int, int ]
          stack = []
        frame_type = 253 /* append */
          offset_delta = 47
          locals = [ int, int ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine, int, int, int, int, int, int, class ext/mods/gameserver/model/actor/Creature, int, int, double, int, class java/lang/Iterable, int, class java/util/Iterator, int, int, int, double, int, int, int, class java/lang/Iterable, int, class java/lang/Iterable, class java/util/Collection, int, class java/util/Iterator, int, int, int, class java/lang/Iterable, int, class java/lang/Iterable, class java/util/Collection, int, class java/lang/Iterable, int, class java/util/Iterator, int, int, int, int, int ]
          stack = [ class java/lang/Boolean ]
        frame_type = 86 /* same_locals_1_stack_item */
          stack = [ class java/lang/Boolean ]
        frame_type = 0 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 3
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine, int, int, int, int, int, int, class ext/mods/gameserver/model/actor/Creature, int, int, double, int, class java/lang/Iterable, int, class java/util/Iterator, int, int, int, double, int, int, int, class java/lang/Iterable, int, class java/lang/Iterable, class java/util/Collection, int, class java/util/Iterator, int, int, int, class java/lang/Iterable, int, class java/lang/Iterable, class java/util/Collection, int, class java/lang/Iterable, int, class java/util/Iterator ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 23
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine, int, int, int, int, int, int, class ext/mods/gameserver/model/actor/Creature, int, int, double, int, class java/lang/Iterable, int, class java/util/Iterator, int, int, int, double, int, int, int, class java/lang/Iterable, int, class java/lang/Iterable, class java/util/Collection, int, class java/util/Iterator ]
          stack = []
        frame_type = 39 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 8
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine, int, int, int, int, int, int, class ext/mods/gameserver/model/actor/Creature, int, int, double, int, class java/lang/Iterable, int, class java/util/Iterator, int, int, int, double, int, int, int, class java/lang/Iterable, int, class java/util/Iterator, class java/lang/Object, int ]
          stack = []
        frame_type = 40 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine, int, int, int, int, int, int, class ext/mods/gameserver/model/actor/Creature, int, int, double, int, class java/lang/Iterable, int, class java/util/Iterator, int, int, int, double, int, int, int, class java/lang/Iterable, int, class java/lang/Object, class java/lang/Object, int ]
          stack = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine, int, int, int, int, int, int, class ext/mods/gameserver/model/actor/Creature, int, int, double, int, class java/lang/Iterable, int, class java/util/Iterator, int, int, int, double, int, int, int, class java/lang/Iterable, int, class java/lang/Object, class java/lang/Object, int, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, int ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 4
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine, int, int, int, int, int, int, class ext/mods/gameserver/model/actor/Creature, int, int, double, int, class java/lang/Iterable, int, class java/util/Iterator ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine, int, int, int, int, int, int, class ext/mods/gameserver/model/actor/Creature, int, int ]
          stack = []
      LineNumberTable:
        line 422: 0
        line 423: 3
        line 424: 4
        line 425: 5
        line 426: 14
        line 427: 34
        line 428: 35
        line 429: 45
        line 430: 53
        line 431: 65
        line 432: 72
        line 433: 73
        line 440: 91
        line 441: 94
        line 442: 95
        line 443: 100
        line 444: 107
        line 445: 108
        line 446: 115
        line 446: 126
        line 447: 128
        line 1376: 146
        line 448: 182
        line 449: 191
        line 450: 205
        line 451: 219
        line 452: 233
        line 1377: 250
        line 1378: 269
        line 1379: 298
        line 453: 305
        line 1380: 322
        line 1389: 341
        line 1390: 348
        line 1389: 384
        line 454: 391
        line 455: 392
        line 457: 406
        line 458: 418
        line 459: 430
        line 461: 458
        line 1389: 459
        line 1391: 465
        line 1389: 468
        line 1389: 478
        line 1389: 481
        line 1390: 482
        line 1392: 486
        line 1393: 487
        line 1380: 492
        line 462: 496
        line 1379: 497
        line 1394: 499
        line 1396: 510
        line 1377: 515
        line 463: 521
        line 1397: 525
        line 1398: 550
        line 463: 591
        line 1398: 593
        line 1399: 600
        line 463: 601
        line 452: 601
        line 464: 603
        line 465: 619
        line 1376: 620
        line 1400: 624
        line 470: 625
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           53      38    11 waterLevel   I
           65      26    12 landLevel   I
           72      19    13 heightDifference   I
           14      77     9 wasInWater   Z
           34      57    10 willBeOnLand   Z
          418      37    46 testX   I
          430      25    47 testY   I
          391      68    45 $i$a$-mapNotNull-GeoEngine$getValidSwimLocationAdvanced$1$hasCollision$1$1   I
          388      71    44 offsetY   I
          468      10    49 $i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv   I
          465      13    48 it$iv$iv   Ljava/lang/Object;
          384      98    43 $i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv   I
          381     101    42 element$iv$iv   I
          377     106    41 element$iv$iv$iv   I
          348     139    39 $i$f$forEach   I
          345     142    38 $this$forEach$iv$iv$iv   Ljava/lang/Iterable;
          341     148    37 $i$f$mapNotNullTo   I
          338     151    35 $this$mapNotNullTo$iv$iv   Ljava/lang/Iterable;
          338     151    36 destination$iv$iv   Ljava/util/Collection;
          322     171    34 $i$f$mapNotNull   I
          319     174    33 $this$mapNotNull$iv   Ljava/lang/Iterable;
          305     192    32 $i$a$-flatMap-GeoEngine$getValidSwimLocationAdvanced$1$hasCollision$1   I
          302     195    31 offsetX   I
          499       8    50 list$iv$iv   Ljava/lang/Iterable;
          298     209    30 element$iv$iv   I
          269     243    28 $i$f$flatMapTo   I
          266     246    26 $this$flatMapTo$iv$iv   Ljava/lang/Iterable;
          266     246    27 destination$iv$iv   Ljava/util/Collection;
          250     266    25 $i$f$flatMap   I
          247     269    24 $this$flatMap$iv   Ljava/lang/Iterable;
          591       2    29 $i$a$-any-GeoEngine$getValidSwimLocationAdvanced$1$hasCollision$2   I
          588       5    28    it   Z
          578      22    27 element$iv   Ljava/lang/Object;
          525      76    25 $i$f$any   I
          522      79    24 $this$any$iv   Ljava/lang/Iterable;
          182     438    18 $i$a$-forEach-GeoEngine$getValidSwimLocationAdvanced$1   I
          191     429    19 factor   D
          205     415    21 checkX   I
          219     401    22 checkY   I
          233     387    23 checkZ   I
          603      17    51 hasCollision   Z
          179     441    17     i   I
          175     446    16 element$iv   I
          146     479    14 $i$f$forEach   I
          143     482    13 $this$forEach$iv   Ljava/lang/Iterable;
          128     497    12 steps   I
          107     518    10 collisionRadius   D
            3     637     8 advancedPhysics   Z
           94     546     9 collisionPathfinding   Z
            0     640     0  this   Lext/mods/gameserver/geoengine/GeoEngine;
            0     640     1    ox   I
            0     640     2    oy   I
            0     640     3    oz   I
            0     640     4    tx   I
            0     640     5    ty   I
            0     640     6    tz   I
            0     640     7 creature   Lext/mods/gameserver/model/actor/Creature;
    RuntimeInvisibleAnnotations:
      0: #611()
        org.jetbrains.annotations.NotNull
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
      parameter 1:
      parameter 2:
      parameter 3:
      parameter 4:
      parameter 5:
      parameter 6:
        0: #632()
          org.jetbrains.annotations.Nullable

  public final boolean canSeeTarget(ext.mods.gameserver.model.WorldObject, ext.mods.gameserver.model.WorldObject);
    descriptor: (Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=13, locals=14, args_size=3
         0: aload_1
         1: invokevirtual #938                // Method ext/mods/gameserver/model/WorldObject.getX:()I
         4: istore_3
         5: aload_1
         6: invokevirtual #939                // Method ext/mods/gameserver/model/WorldObject.getY:()I
         9: istore        4
        11: aload_1
        12: invokevirtual #940                // Method ext/mods/gameserver/model/WorldObject.getZ:()I
        15: istore        5
        17: aload_2
        18: invokevirtual #938                // Method ext/mods/gameserver/model/WorldObject.getX:()I
        21: istore        6
        23: aload_2
        24: invokevirtual #939                // Method ext/mods/gameserver/model/WorldObject.getY:()I
        27: istore        7
        29: aload_2
        30: invokevirtual #940                // Method ext/mods/gameserver/model/WorldObject.getZ:()I
        33: istore        8
        35: dconst_0
        36: dstore        9
        38: aload_1
        39: instanceof    #837                // class ext/mods/gameserver/model/actor/Creature
        42: ifeq          69
        45: dload         9
        47: aload_1
        48: checkcast     #837                // class ext/mods/gameserver/model/actor/Creature
        51: invokevirtual #943                // Method ext/mods/gameserver/model/actor/Creature.getCollisionHeight:()D
        54: iconst_2
        55: i2d
        56: dmul
        57: getstatic     #946                // Field ext/mods/Config.PART_OF_CHARACTER_HEIGHT:I
        60: i2d
        61: dmul
        62: bipush        100
        64: i2d
        65: ddiv
        66: dadd
        67: dstore        9
        69: dconst_0
        70: dstore        11
        72: aload_2
        73: instanceof    #837                // class ext/mods/gameserver/model/actor/Creature
        76: ifeq          103
        79: dload         11
        81: aload_2
        82: checkcast     #837                // class ext/mods/gameserver/model/actor/Creature
        85: invokevirtual #943                // Method ext/mods/gameserver/model/actor/Creature.getCollisionHeight:()D
        88: iconst_2
        89: i2d
        90: dmul
        91: getstatic     #946                // Field ext/mods/Config.PART_OF_CHARACTER_HEIGHT:I
        94: i2d
        95: dmul
        96: bipush        100
        98: i2d
        99: ddiv
       100: dadd
       101: dstore        11
       103: aload_2
       104: instanceof    #718                // class ext/mods/gameserver/geoengine/geodata/IGeoObject
       107: ifeq          114
       110: aload_2
       111: goto          115
       114: aconst_null
       115: astore        13
       117: aload_0
       118: iload_3
       119: iload         4
       121: iload         5
       123: dload         9
       125: iload         6
       127: iload         7
       129: iload         8
       131: dload         11
       133: aload         13
       135: checkcast     #718                // class ext/mods/gameserver/geoengine/geodata/IGeoObject
       138: aconst_null
       139: invokevirtual #950                // Method canSee:(IIIDIIIDLext/mods/gameserver/geoengine/geodata/IGeoObject;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
       142: ifeq          177
       145: aload_0
       146: iload         6
       148: iload         7
       150: iload         8
       152: dload         11
       154: iload_3
       155: iload         4
       157: iload         5
       159: dload         9
       161: aload         13
       163: checkcast     #718                // class ext/mods/gameserver/geoengine/geodata/IGeoObject
       166: aconst_null
       167: invokevirtual #950                // Method canSee:(IIIDIIIDLext/mods/gameserver/geoengine/geodata/IGeoObject;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
       170: ifeq          177
       173: iconst_1
       174: goto          178
       177: iconst_0
       178: ireturn
      StackMapTable: number_of_entries = 6
        frame_type = 255 /* full_frame */
          offset_delta = 69
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine, class ext/mods/gameserver/model/WorldObject, class ext/mods/gameserver/model/WorldObject, int, int, int, int, int, int, double ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 33
          locals = [ double ]
        frame_type = 10 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/WorldObject ]
        frame_type = 252 /* append */
          offset_delta = 61
          locals = [ class ext/mods/gameserver/model/WorldObject ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
      LineNumberTable:
        line 473: 0
        line 474: 5
        line 475: 11
        line 476: 17
        line 477: 23
        line 478: 29
        line 479: 35
        line 480: 38
        line 481: 45
        line 483: 69
        line 484: 72
        line 485: 79
        line 487: 103
        line 488: 117
        line 489: 145
        line 488: 178
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            5     174     3    ox   I
           11     168     4    oy   I
           17     162     5    oz   I
           23     156     6    tx   I
           29     150     7    ty   I
           35     144     8    tz   I
           38     141     9 oheight   D
           72     107    11 theight   D
          117      62    13 ignore   Ljava/lang/Object;
            0     179     0  this   Lext/mods/gameserver/geoengine/GeoEngine;
            0     179     1   obj   Lext/mods/gameserver/model/WorldObject;
            0     179     2 target   Lext/mods/gameserver/model/WorldObject;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #611()
          org.jetbrains.annotations.NotNull
      parameter 1:
        0: #611()
          org.jetbrains.annotations.NotNull

  public final boolean canSeeLocation(ext.mods.gameserver.model.WorldObject, ext.mods.gameserver.model.location.Location);
    descriptor: (Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/location/Location;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=13, locals=11, args_size=3
         0: aload_1
         1: invokevirtual #938                // Method ext/mods/gameserver/model/WorldObject.getX:()I
         4: istore_3
         5: aload_1
         6: invokevirtual #939                // Method ext/mods/gameserver/model/WorldObject.getY:()I
         9: istore        4
        11: aload_1
        12: invokevirtual #940                // Method ext/mods/gameserver/model/WorldObject.getZ:()I
        15: istore        5
        17: aload_2
        18: invokevirtual #668                // Method ext/mods/gameserver/model/location/Location.getX:()I
        21: istore        6
        23: aload_2
        24: invokevirtual #671                // Method ext/mods/gameserver/model/location/Location.getY:()I
        27: istore        7
        29: aload_2
        30: invokevirtual #674                // Method ext/mods/gameserver/model/location/Location.getZ:()I
        33: istore        8
        35: dconst_0
        36: dstore        9
        38: aload_1
        39: instanceof    #837                // class ext/mods/gameserver/model/actor/Creature
        42: ifeq          69
        45: dload         9
        47: aload_1
        48: checkcast     #837                // class ext/mods/gameserver/model/actor/Creature
        51: invokevirtual #943                // Method ext/mods/gameserver/model/actor/Creature.getCollisionHeight:()D
        54: iconst_2
        55: i2d
        56: dmul
        57: getstatic     #946                // Field ext/mods/Config.PART_OF_CHARACTER_HEIGHT:I
        60: i2d
        61: dmul
        62: bipush        100
        64: i2d
        65: ddiv
        66: dadd
        67: dstore        9
        69: aload_0
        70: iload_3
        71: iload         4
        73: iload         5
        75: dload         9
        77: iload         6
        79: iload         7
        81: iload         8
        83: dconst_0
        84: aconst_null
        85: aconst_null
        86: invokevirtual #950                // Method canSee:(IIIDIIIDLext/mods/gameserver/geoengine/geodata/IGeoObject;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
        89: ifeq          119
        92: aload_0
        93: iload         6
        95: iload         7
        97: iload         8
        99: dconst_0
       100: iload_3
       101: iload         4
       103: iload         5
       105: dload         9
       107: aconst_null
       108: aconst_null
       109: invokevirtual #950                // Method canSee:(IIIDIIIDLext/mods/gameserver/geoengine/geodata/IGeoObject;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
       112: ifeq          119
       115: iconst_1
       116: goto          120
       119: iconst_0
       120: ireturn
      StackMapTable: number_of_entries = 3
        frame_type = 255 /* full_frame */
          offset_delta = 69
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine, class ext/mods/gameserver/model/WorldObject, class ext/mods/gameserver/model/location/Location, int, int, int, int, int, int, double ]
          stack = []
        frame_type = 49 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
      LineNumberTable:
        line 492: 0
        line 493: 5
        line 494: 11
        line 495: 17
        line 496: 23
        line 497: 29
        line 498: 35
        line 499: 38
        line 500: 45
        line 502: 69
        line 503: 92
        line 502: 120
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            5     116     3    ox   I
           11     110     4    oy   I
           17     104     5    oz   I
           23      98     6    tx   I
           29      92     7    ty   I
           35      86     8    tz   I
           38      83     9 oheight   D
            0     121     0  this   Lext/mods/gameserver/geoengine/GeoEngine;
            0     121     1   obj   Lext/mods/gameserver/model/WorldObject;
            0     121     2 position   Lext/mods/gameserver/model/location/Location;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #611()
          org.jetbrains.annotations.NotNull
      parameter 1:
        0: #611()
          org.jetbrains.annotations.NotNull

  public final boolean canSee(int, int, int, double, int, int, int, double, ext.mods.gameserver.geoengine.geodata.IGeoObject, ext.mods.gameserver.network.serverpackets.ExServerPrimitive);
    descriptor: (IIIDIIIDLext/mods/gameserver/geoengine/geodata/IGeoObject;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=8, locals=41, args_size=11
         0: nop
         1: iload_1
         2: iload_2
         3: invokestatic  #961                // Method ext/mods/gameserver/model/World.isOutOfWorld:(II)Z
         6: ifeq          13
         9: iconst_0
        10: goto          822
        13: iload         6
        15: iload         7
        17: invokestatic  #961                // Method ext/mods/gameserver/model/World.isOutOfWorld:(II)Z
        20: ifeq          27
        23: iconst_0
        24: goto          822
        27: getstatic     #648                // Field Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
        30: iload_1
        31: invokevirtual #654                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoX:(I)I
        34: istore        13
        36: getstatic     #648                // Field Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
        39: iload_2
        40: invokevirtual #657                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoY:(I)I
        43: istore        14
        45: getstatic     #648                // Field Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
        48: iload         6
        50: invokevirtual #654                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoX:(I)I
        53: istore        15
        55: getstatic     #648                // Field Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
        58: iload         7
        60: invokevirtual #657                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoY:(I)I
        63: istore        16
        65: aload_0
        66: iload         13
        68: iload         14
        70: invokevirtual #692                // Method getBlock:(II)Lext/mods/gameserver/geoengine/geodata/ABlock;
        73: astore        17
        75: aload         17
        77: iload         13
        79: iload         14
        81: iload_3
        82: bipush        8
        84: iadd
        85: aload         11
        87: invokevirtual #696                // Method ext/mods/gameserver/geoengine/geodata/ABlock.getIndexBelow:(IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)I
        90: istore        18
        92: nop
        93: iload         18
        95: ifge          102
        98: iconst_0
        99: goto          822
       102: iload         13
       104: iload         15
       106: if_icmpne     145
       109: iload         14
       111: iload         16
       113: if_icmpne     145
       116: iload         18
       118: aload         17
       120: iload         15
       122: iload         16
       124: iload         8
       126: bipush        8
       128: iadd
       129: aload         11
       131: invokevirtual #696                // Method ext/mods/gameserver/geoengine/geodata/ABlock.getIndexBelow:(IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)I
       134: if_icmpne     141
       137: iconst_1
       138: goto          822
       141: iconst_0
       142: goto          822
       145: iconst_0
       146: istore        19
       148: aload         17
       150: iload         18
       152: aload         11
       154: invokevirtual #699                // Method ext/mods/gameserver/geoengine/geodata/ABlock.getHeight:(ILext/mods/gameserver/geoengine/geodata/IGeoObject;)S
       157: istore        19
       159: aload         17
       161: iload         18
       163: aload         11
       165: invokevirtual #707                // Method ext/mods/gameserver/geoengine/geodata/ABlock.getNswe:(ILext/mods/gameserver/geoengine/geodata/IGeoObject;)B
       168: istore        20
       170: iload         6
       172: iload_1
       173: isub
       174: istore        21
       176: iload         7
       178: iload_2
       179: isub
       180: istore        22
       182: iload         8
       184: i2d
       185: dload         9
       187: dadd
       188: iload_3
       189: i2d
       190: dload         4
       192: dadd
       193: dsub
       194: dstore        23
       196: dload         23
       198: iload         21
       200: iload         21
       202: imul
       203: iload         22
       205: iload         22
       207: imul
       208: iadd
       209: i2d
       210: invokestatic  #965                // Method java/lang/Math.sqrt:(D)D
       213: ddiv
       214: dstore        25
       216: iload         15
       218: iload         13
       220: isub
       221: iload         16
       223: iload         14
       225: isub
       226: invokestatic  #971                // Method ext/mods/gameserver/enums/MoveDirectionType.getDirection:(II)Lext/mods/gameserver/enums/MoveDirectionType;
       229: astore        27
       231: iload         21
       233: ifne          240
       236: dconst_0
       237: goto          247
       240: iload         22
       242: i2d
       243: iload         21
       245: i2d
       246: ddiv
       247: dstore        28
       249: iconst_0
       250: istore        30
       252: iload_1
       253: bipush        -16
       255: iand
       256: istore        30
       258: iconst_0
       259: istore        31
       261: iload_2
       262: bipush        -16
       264: iand
       265: istore        31
       267: aload         12
       269: ifnull        312
       272: aload         12
       274: getstatic     #977                // Field java/awt/Color.BLUE:Ljava/awt/Color;
       277: iload         30
       279: iload         31
       281: iload         19
       283: iconst_1
       284: iadd
       285: bipush        15
       287: invokevirtual #981                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addSquare:(Ljava/awt/Color;IIII)V
       290: aload         12
       292: getstatic     #977                // Field java/awt/Color.BLUE:Ljava/awt/Color;
       295: iload         6
       297: bipush        -16
       299: iand
       300: iload         7
       302: bipush        -16
       304: iand
       305: iload         8
       307: bipush        15
       309: invokevirtual #981                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addSquare:(Ljava/awt/Color;IIII)V
       312: iconst_0
       313: istore        32
       315: iload         13
       317: iload         15
       319: if_icmpne     329
       322: iload         14
       324: iload         16
       326: if_icmpeq     821
       329: iconst_0
       330: istore        33
       332: iload         30
       334: aload         27
       336: invokevirtual #984                // Method ext/mods/gameserver/enums/MoveDirectionType.getOffsetX:()I
       339: iadd
       340: istore        33
       342: iconst_0
       343: istore        34
       345: iload_2
       346: i2d
       347: dload         28
       349: iload         33
       351: iload_1
       352: isub
       353: i2d
       354: dmul
       355: dadd
       356: d2i
       357: istore        34
       359: nop
       360: aload         27
       362: invokevirtual #987                // Method ext/mods/gameserver/enums/MoveDirectionType.getStepX:()I
       365: ifeq          464
       368: getstatic     #648                // Field Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
       371: iload         34
       373: invokevirtual #657                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoY:(I)I
       376: iload         14
       378: if_icmpne     464
       381: aload         12
       383: dup
       384: ifnull        432
       387: astore        35
       389: iconst_0
       390: istore        36
       392: aload         35
       394: aload         27
       396: invokevirtual #990                // Method ext/mods/gameserver/enums/MoveDirectionType.getSymbolX:()Ljava/lang/String;
       399: getstatic     #993                // Field java/awt/Color.CYAN:Ljava/awt/Color;
       402: iconst_1
       403: iload         33
       405: iload         34
       407: iload         19
       409: invokevirtual #997                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addPoint:(Ljava/lang/String;Ljava/awt/Color;ZIII)V
       412: aload         35
       414: getstatic     #1000               // Field java/awt/Color.GREEN:Ljava/awt/Color;
       417: iload         30
       419: iload         31
       421: iload         19
       423: bipush        15
       425: invokevirtual #981                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addSquare:(Ljava/awt/Color;IIII)V
       428: nop
       429: goto          434
       432: pop
       433: nop
       434: iload         30
       436: aload         27
       438: invokevirtual #987                // Method ext/mods/gameserver/enums/MoveDirectionType.getStepX:()I
       441: iadd
       442: istore        30
       444: iload         13
       446: aload         27
       448: invokevirtual #1003               // Method ext/mods/gameserver/enums/MoveDirectionType.getSignumX:()I
       451: iadd
       452: istore        13
       454: aload         27
       456: invokevirtual #1006               // Method ext/mods/gameserver/enums/MoveDirectionType.getDirectionX:()B
       459: istore        32
       461: goto          586
       464: iload         31
       466: aload         27
       468: invokevirtual #1009               // Method ext/mods/gameserver/enums/MoveDirectionType.getOffsetY:()I
       471: iadd
       472: istore        34
       474: iload_1
       475: i2d
       476: iload         34
       478: iload_2
       479: isub
       480: i2d
       481: dload         28
       483: ddiv
       484: dadd
       485: d2i
       486: istore        33
       488: nop
       489: iload         30
       491: iload         30
       493: bipush        15
       495: iadd
       496: iload         33
       498: invokestatic  #1012               // Method java/lang/Math.min:(II)I
       501: invokestatic  #798                // Method java/lang/Math.max:(II)I
       504: istore        33
       506: aload         12
       508: dup
       509: ifnull        557
       512: astore        35
       514: iconst_0
       515: istore        36
       517: aload         35
       519: aload         27
       521: invokevirtual #1015               // Method ext/mods/gameserver/enums/MoveDirectionType.getSymbolY:()Ljava/lang/String;
       524: getstatic     #1018               // Field java/awt/Color.YELLOW:Ljava/awt/Color;
       527: iconst_1
       528: iload         33
       530: iload         34
       532: iload         19
       534: invokevirtual #997                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addPoint:(Ljava/lang/String;Ljava/awt/Color;ZIII)V
       537: aload         35
       539: getstatic     #1000               // Field java/awt/Color.GREEN:Ljava/awt/Color;
       542: iload         30
       544: iload         31
       546: iload         19
       548: bipush        15
       550: invokevirtual #981                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addSquare:(Ljava/awt/Color;IIII)V
       553: nop
       554: goto          559
       557: pop
       558: nop
       559: iload         31
       561: aload         27
       563: invokevirtual #1021               // Method ext/mods/gameserver/enums/MoveDirectionType.getStepY:()I
       566: iadd
       567: istore        31
       569: iload         14
       571: aload         27
       573: invokevirtual #1024               // Method ext/mods/gameserver/enums/MoveDirectionType.getSignumY:()I
       576: iadd
       577: istore        14
       579: aload         27
       581: invokevirtual #1027               // Method ext/mods/gameserver/enums/MoveDirectionType.getDirectionY:()B
       584: istore        32
       586: aload_0
       587: iload         13
       589: iload         14
       591: invokevirtual #692                // Method getBlock:(II)Lext/mods/gameserver/geoengine/geodata/ABlock;
       594: astore        17
       596: dconst_0
       597: dstore        39
       599: iload_3
       600: i2d
       601: dload         4
       603: dadd
       604: getstatic     #1030               // Field ext/mods/Config.MAX_OBSTACLE_HEIGHT:I
       607: i2d
       608: dadd
       609: dstore        39
       611: dload         39
       613: dload         25
       615: iload         33
       617: iload_1
       618: isub
       619: iload         33
       621: iload_1
       622: isub
       623: imul
       624: iload         34
       626: iload_2
       627: isub
       628: iload         34
       630: iload_2
       631: isub
       632: imul
       633: iadd
       634: i2d
       635: invokestatic  #965                // Method java/lang/Math.sqrt:(D)D
       638: dmul
       639: dadd
       640: dstore        39
       642: iload         20
       644: iload         32
       646: iand
       647: ifeq          654
       650: iconst_1
       651: goto          655
       654: iconst_0
       655: istore        35
       657: nop
       658: iload         35
       660: ifeq          682
       663: aload         17
       665: iload         13
       667: iload         14
       669: iload         19
       671: bipush        48
       673: iadd
       674: aload         11
       676: invokevirtual #696                // Method ext/mods/gameserver/geoengine/geodata/ABlock.getIndexBelow:(IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)I
       679: goto          698
       682: aload         17
       684: iload         13
       686: iload         14
       688: iload         19
       690: bipush        16
       692: isub
       693: aload         11
       695: invokevirtual #1033               // Method ext/mods/gameserver/geoengine/geodata/ABlock.getIndexAbove:(IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)I
       698: istore        18
       700: nop
       701: iload         18
       703: ifge          732
       706: aload         12
       708: dup
       709: ifnull        729
       712: getstatic     #1036               // Field java/awt/Color.RED:Ljava/awt/Color;
       715: iload         30
       717: iload         31
       719: iload         19
       721: bipush        15
       723: invokevirtual #981                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addSquare:(Ljava/awt/Color;IIII)V
       726: goto          730
       729: pop
       730: iconst_0
       731: ireturn
       732: aload         17
       734: iload         18
       736: aload         11
       738: invokevirtual #699                // Method ext/mods/gameserver/geoengine/geodata/ABlock.getHeight:(ILext/mods/gameserver/geoengine/geodata/IGeoObject;)S
       741: istore        36
       743: nop
       744: iload         36
       746: i2d
       747: dload         39
       749: dcmpl
       750: ifle          803
       753: aload         12
       755: dup
       756: ifnull        799
       759: astore        37
       761: iconst_0
       762: istore        38
       764: aload         37
       766: getstatic     #1036               // Field java/awt/Color.RED:Ljava/awt/Color;
       769: iload         33
       771: iload         34
       773: dload         39
       775: d2i
       776: invokevirtual #1039               // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addPoint:(Ljava/awt/Color;III)V
       779: aload         37
       781: getstatic     #1036               // Field java/awt/Color.RED:Ljava/awt/Color;
       784: iload         30
       786: iload         31
       788: iload         36
       790: bipush        15
       792: invokevirtual #981                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addSquare:(Ljava/awt/Color;IIII)V
       795: nop
       796: goto          801
       799: pop
       800: nop
       801: iconst_0
       802: ireturn
       803: iload         36
       805: istore        19
       807: aload         17
       809: iload         18
       811: aload         11
       813: invokevirtual #707                // Method ext/mods/gameserver/geoengine/geodata/ABlock.getNswe:(ILext/mods/gameserver/geoengine/geodata/IGeoObject;)B
       816: istore        20
       818: goto          315
       821: iconst_1
       822: ireturn
      StackMapTable: number_of_entries = 28
        frame_type = 13 /* same */
        frame_type = 13 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 74
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine, int, int, int, double, int, int, int, double, class ext/mods/gameserver/geoengine/geodata/IGeoObject, class ext/mods/gameserver/network/serverpackets/ExServerPrimitive, int, int, int, int, class ext/mods/gameserver/geoengine/geodata/ABlock, int ]
          stack = []
        frame_type = 38 /* same */
        frame_type = 3 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 94
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine, int, int, int, double, int, int, int, double, class ext/mods/gameserver/geoengine/geodata/IGeoObject, class ext/mods/gameserver/network/serverpackets/ExServerPrimitive, int, int, int, int, class ext/mods/gameserver/geoengine/geodata/ABlock, int, int, int, int, int, double, double, class ext/mods/gameserver/enums/MoveDirectionType ]
          stack = []
        frame_type = 70 /* same_locals_1_stack_item */
          stack = [ double ]
        frame_type = 254 /* append */
          offset_delta = 64
          locals = [ double, int, int ]
        frame_type = 252 /* append */
          offset_delta = 2
          locals = [ int ]
        frame_type = 13 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 102
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine, int, int, int, double, int, int, int, double, class ext/mods/gameserver/geoengine/geodata/IGeoObject, class ext/mods/gameserver/network/serverpackets/ExServerPrimitive, int, int, int, int, class ext/mods/gameserver/geoengine/geodata/ABlock, int, int, int, int, int, double, double, class ext/mods/gameserver/enums/MoveDirectionType, double, int, int, int, int, int ]
          stack = [ class ext/mods/gameserver/network/serverpackets/ExServerPrimitive ]
        frame_type = 1 /* same */
        frame_type = 29 /* same */
        frame_type = 247 /* same_locals_1_stack_item_frame_extended */
          offset_delta = 92
          stack = [ class ext/mods/gameserver/network/serverpackets/ExServerPrimitive ]
        frame_type = 1 /* same */
        frame_type = 26 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 67
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine, int, int, int, double, int, int, int, double, class ext/mods/gameserver/geoengine/geodata/IGeoObject, class ext/mods/gameserver/network/serverpackets/ExServerPrimitive, int, int, int, int, class ext/mods/gameserver/geoengine/geodata/ABlock, int, int, int, int, int, double, double, class ext/mods/gameserver/enums/MoveDirectionType, double, int, int, int, int, int, top, top, top, top, double ]
          stack = []
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 26
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine, int, int, int, double, int, int, int, double, class ext/mods/gameserver/geoengine/geodata/IGeoObject, class ext/mods/gameserver/network/serverpackets/ExServerPrimitive, int, int, int, int, class ext/mods/gameserver/geoengine/geodata/ABlock, int, int, int, int, int, double, double, class ext/mods/gameserver/enums/MoveDirectionType, double, int, int, int, int, int, int, top, top, top, double ]
          stack = []
        frame_type = 79 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 94 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/network/serverpackets/ExServerPrimitive ]
        frame_type = 0 /* same */
        frame_type = 1 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 66
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine, int, int, int, double, int, int, int, double, class ext/mods/gameserver/geoengine/geodata/IGeoObject, class ext/mods/gameserver/network/serverpackets/ExServerPrimitive, int, int, int, int, class ext/mods/gameserver/geoengine/geodata/ABlock, int, int, int, int, int, double, double, class ext/mods/gameserver/enums/MoveDirectionType, double, int, int, int, int, int, int, int, top, top, double ]
          stack = [ class ext/mods/gameserver/network/serverpackets/ExServerPrimitive ]
        frame_type = 1 /* same */
        frame_type = 1 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine, int, int, int, double, int, int, int, double, class ext/mods/gameserver/geoengine/geodata/IGeoObject, class ext/mods/gameserver/network/serverpackets/ExServerPrimitive, int, int, int, int, class ext/mods/gameserver/geoengine/geodata/ABlock, int, int, int, int, int, double, double, class ext/mods/gameserver/enums/MoveDirectionType, double, int, int, int ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine, int, int, int, double, int, int, int, double, class ext/mods/gameserver/geoengine/geodata/IGeoObject, class ext/mods/gameserver/network/serverpackets/ExServerPrimitive ]
          stack = [ int ]
      LineNumberTable:
        line 510: 0
        line 511: 1
        line 512: 13
        line 514: 27
        line 515: 36
        line 516: 45
        line 517: 55
        line 519: 65
        line 520: 75
        line 521: 92
        line 522: 93
        line 523: 102
        line 524: 116
        line 527: 145
        line 528: 159
        line 529: 170
        line 530: 176
        line 531: 182
        line 533: 196
        line 533: 213
        line 534: 216
        line 536: 231
        line 537: 249
        line 538: 258
        line 539: 267
        line 540: 272
        line 541: 290
        line 543: 312
        line 544: 315
        line 545: 329
        line 546: 342
        line 547: 359
        line 548: 360
        line 549: 381
        line 550: 392
        line 551: 412
        line 552: 428
        line 549: 429
        line 549: 432
        line 553: 434
        line 554: 444
        line 555: 454
        line 558: 464
        line 559: 474
        line 560: 488
        line 560: 489
        line 560: 504
        line 561: 506
        line 562: 517
        line 563: 537
        line 564: 553
        line 561: 554
        line 561: 557
        line 565: 559
        line 566: 569
        line 567: 579
        line 570: 586
        line 571: 596
        line 572: 611
        line 572: 638
        line 573: 642
        line 574: 657
        line 575: 658
        line 576: 682
        line 574: 698
        line 578: 700
        line 579: 701
        line 580: 706
        line 581: 730
        line 584: 732
        line 585: 743
        line 586: 744
        line 587: 753
        line 588: 764
        line 589: 779
        line 590: 795
        line 587: 796
        line 587: 799
        line 591: 801
        line 594: 803
        line 595: 807
        line 597: 821
        line 510: 822
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          392      37    36 $i$a$-let-GeoEngine$canSee$1   I
          389      40    35    it   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
          517      37    36 $i$a$-let-GeoEngine$canSee$2   I
          514      40    35    it   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
          764      32    38 $i$a$-let-GeoEngine$canSee$3   I
          761      35    37    it   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
          332     486    33 checkX   I
          345     473    34 checkY   I
          599     219    39  losz   D
          657     161    35 canMove   Z
          743      75    36     z   I
          148     674    19 groundZ   I
          170     652    20  nswe   B
          176     646    21    dx   I
          182     640    22    dy   I
          196     626    23    dz   D
          216     606    25    mz   D
          231     591    27   mdt   Lext/mods/gameserver/enums/MoveDirectionType;
          249     573    28     m   D
          252     570    30 gridX   I
          261     561    31 gridY   I
          315     507    32   dir   B
           36     786    13   gox   I
           45     777    14   goy   I
           55     767    15   gtx   I
           65     757    16   gty   I
           75     747    17 block   Lext/mods/gameserver/geoengine/geodata/ABlock;
           92     730    18 index   I
            0     823     0  this   Lext/mods/gameserver/geoengine/GeoEngine;
            0     823     1    ox   I
            0     823     2    oy   I
            0     823     3    oz   I
            0     823     4 oheight   D
            0     823     6    tx   I
            0     823     7    ty   I
            0     823     8    tz   I
            0     823     9 theight   D
            0     823    11 ignore   Lext/mods/gameserver/geoengine/geodata/IGeoObject;
            0     823    12 debug   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
      parameter 1:
      parameter 2:
      parameter 3:
      parameter 4:
      parameter 5:
      parameter 6:
      parameter 7:
      parameter 8:
        0: #632()
          org.jetbrains.annotations.Nullable
      parameter 9:
        0: #632()
          org.jetbrains.annotations.Nullable

  public final ext.mods.gameserver.model.location.Location raycast(int, int, int, int, int, int, ext.mods.gameserver.geoengine.geodata.IGeoObject);
    descriptor: (IIIIIILext/mods/gameserver/geoengine/geodata/IGeoObject;)Lext/mods/gameserver/model/location/Location;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=6, locals=33, args_size=8
         0: nop
         1: iload_1
         2: iload_2
         3: invokestatic  #961                // Method ext/mods/gameserver/model/World.isOutOfWorld:(II)Z
         6: ifeq          13
         9: aconst_null
        10: goto          643
        13: iload         4
        15: iload         5
        17: invokestatic  #961                // Method ext/mods/gameserver/model/World.isOutOfWorld:(II)Z
        20: ifeq          27
        23: aconst_null
        24: goto          643
        27: getstatic     #648                // Field Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
        30: iload_1
        31: invokevirtual #654                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoX:(I)I
        34: istore        8
        36: getstatic     #648                // Field Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
        39: iload_2
        40: invokevirtual #657                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoY:(I)I
        43: istore        9
        45: getstatic     #648                // Field Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
        48: iload         4
        50: invokevirtual #654                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoX:(I)I
        53: istore        10
        55: getstatic     #648                // Field Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
        58: iload         5
        60: invokevirtual #657                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoY:(I)I
        63: istore        11
        65: aload_0
        66: iload         8
        68: iload         9
        70: invokevirtual #692                // Method getBlock:(II)Lext/mods/gameserver/geoengine/geodata/ABlock;
        73: astore        12
        75: aload         12
        77: iload         8
        79: iload         9
        81: iload_3
        82: bipush        8
        84: iadd
        85: aload         7
        87: invokevirtual #696                // Method ext/mods/gameserver/geoengine/geodata/ABlock.getIndexBelow:(IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)I
        90: istore        13
        92: nop
        93: iload         13
        95: ifge          102
        98: aconst_null
        99: goto          643
       102: iload         8
       104: iload         10
       106: if_icmpne     158
       109: iload         9
       111: iload         11
       113: if_icmpne     158
       116: nop
       117: iload         13
       119: aload         12
       121: iload         10
       123: iload         11
       125: iload         6
       127: bipush        8
       129: iadd
       130: aload         7
       132: invokevirtual #696                // Method ext/mods/gameserver/geoengine/geodata/ABlock.getIndexBelow:(IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)I
       135: if_icmpne     142
       138: aconst_null
       139: goto          643
       142: new           #665                // class ext/mods/gameserver/model/location/Location
       145: dup
       146: iload         4
       148: iload         5
       150: iload         6
       152: invokespecial #835                // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       155: goto          643
       158: aload         12
       160: iload         13
       162: aload         7
       164: invokevirtual #699                // Method ext/mods/gameserver/geoengine/geodata/ABlock.getHeight:(ILext/mods/gameserver/geoengine/geodata/IGeoObject;)S
       167: istore        14
       169: aload         12
       171: iload         13
       173: aload         7
       175: invokevirtual #707                // Method ext/mods/gameserver/geoengine/geodata/ABlock.getNswe:(ILext/mods/gameserver/geoengine/geodata/IGeoObject;)B
       178: istore        15
       180: iload         6
       182: iload_3
       183: isub
       184: i2d
       185: iload         4
       187: iload_1
       188: isub
       189: iload         4
       191: iload_1
       192: isub
       193: imul
       194: iload         5
       196: iload_2
       197: isub
       198: iload         5
       200: iload_2
       201: isub
       202: imul
       203: iadd
       204: i2d
       205: invokestatic  #965                // Method java/lang/Math.sqrt:(D)D
       208: ddiv
       209: dstore        16
       211: iload         10
       213: iload         8
       215: isub
       216: iload         11
       218: iload         9
       220: isub
       221: invokestatic  #971                // Method ext/mods/gameserver/enums/MoveDirectionType.getDirection:(II)Lext/mods/gameserver/enums/MoveDirectionType;
       224: astore        18
       226: nop
       227: iload         4
       229: iload_1
       230: if_icmpne     237
       233: dconst_0
       234: goto          248
       237: iload         5
       239: iload_2
       240: isub
       241: i2d
       242: iload         4
       244: iload_1
       245: isub
       246: i2d
       247: ddiv
       248: dstore        19
       250: iload_1
       251: bipush        -16
       253: iand
       254: istore        21
       256: iload_2
       257: bipush        -16
       259: iand
       260: istore        22
       262: iconst_0
       263: istore        23
       265: iload         8
       267: iload         10
       269: if_icmpne     279
       272: iload         9
       274: iload         11
       276: if_icmpeq     630
       279: iload         21
       281: aload         18
       283: invokevirtual #984                // Method ext/mods/gameserver/enums/MoveDirectionType.getOffsetX:()I
       286: iadd
       287: istore        24
       289: iload_2
       290: i2d
       291: dload         19
       293: iload         24
       295: iload_1
       296: isub
       297: i2d
       298: dmul
       299: dadd
       300: d2i
       301: istore        25
       303: nop
       304: aload         18
       306: invokevirtual #987                // Method ext/mods/gameserver/enums/MoveDirectionType.getStepX:()I
       309: ifeq          355
       312: getstatic     #648                // Field Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
       315: iload         25
       317: invokevirtual #657                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoY:(I)I
       320: iload         9
       322: if_icmpne     355
       325: iload         21
       327: aload         18
       329: invokevirtual #987                // Method ext/mods/gameserver/enums/MoveDirectionType.getStepX:()I
       332: iadd
       333: istore        21
       335: iload         8
       337: aload         18
       339: invokevirtual #1003               // Method ext/mods/gameserver/enums/MoveDirectionType.getSignumX:()I
       342: iadd
       343: istore        8
       345: aload         18
       347: invokevirtual #1006               // Method ext/mods/gameserver/enums/MoveDirectionType.getDirectionX:()B
       350: istore        23
       352: goto          423
       355: iload         22
       357: aload         18
       359: invokevirtual #1009               // Method ext/mods/gameserver/enums/MoveDirectionType.getOffsetY:()I
       362: iadd
       363: istore        25
       365: iload_1
       366: i2d
       367: iload         25
       369: iload_2
       370: isub
       371: i2d
       372: dload         19
       374: ddiv
       375: dadd
       376: d2i
       377: istore        24
       379: iload         21
       381: iload         21
       383: bipush        15
       385: iadd
       386: iload         24
       388: invokestatic  #1012               // Method java/lang/Math.min:(II)I
       391: invokestatic  #798                // Method java/lang/Math.max:(II)I
       394: istore        24
       396: iload         22
       398: aload         18
       400: invokevirtual #1021               // Method ext/mods/gameserver/enums/MoveDirectionType.getStepY:()I
       403: iadd
       404: istore        22
       406: iload         9
       408: aload         18
       410: invokevirtual #1024               // Method ext/mods/gameserver/enums/MoveDirectionType.getSignumY:()I
       413: iadd
       414: istore        9
       416: aload         18
       418: invokevirtual #1027               // Method ext/mods/gameserver/enums/MoveDirectionType.getDirectionY:()B
       421: istore        23
       423: aload_0
       424: iload         8
       426: iload         9
       428: invokevirtual #692                // Method getBlock:(II)Lext/mods/gameserver/geoengine/geodata/ABlock;
       431: astore        12
       433: iload_3
       434: i2d
       435: getstatic     #1030               // Field ext/mods/Config.MAX_OBSTACLE_HEIGHT:I
       438: i2d
       439: dadd
       440: dstore        26
       442: iload         24
       444: iload_1
       445: isub
       446: iload         24
       448: iload_1
       449: isub
       450: imul
       451: iload         25
       453: iload_2
       454: isub
       455: iload         25
       457: iload_2
       458: isub
       459: imul
       460: iadd
       461: i2d
       462: invokestatic  #965                // Method java/lang/Math.sqrt:(D)D
       465: dstore        28
       467: dload         26
       469: dload         16
       471: dload         28
       473: dmul
       474: dadd
       475: dstore        26
       477: iload         15
       479: iload         23
       481: iand
       482: ifeq          489
       485: iconst_1
       486: goto          490
       489: iconst_0
       490: istore        30
       492: nop
       493: iload         30
       495: ifeq          517
       498: aload         12
       500: iload         8
       502: iload         9
       504: iload         14
       506: bipush        48
       508: iadd
       509: aload         7
       511: invokevirtual #696                // Method ext/mods/gameserver/geoengine/geodata/ABlock.getIndexBelow:(IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)I
       514: goto          533
       517: aload         12
       519: iload         8
       521: iload         9
       523: iload         14
       525: bipush        16
       527: isub
       528: aload         7
       530: invokevirtual #1033               // Method ext/mods/gameserver/geoengine/geodata/ABlock.getIndexAbove:(IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)I
       533: istore        13
       535: nop
       536: iload         13
       538: ifge          566
       541: iload_3
       542: i2d
       543: dload         16
       545: dload         28
       547: dmul
       548: dadd
       549: d2i
       550: istore        31
       552: new           #665                // class ext/mods/gameserver/model/location/Location
       555: dup
       556: iload         24
       558: iload         25
       560: iload         31
       562: invokespecial #835                // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       565: areturn
       566: aload         12
       568: iload         13
       570: aload         7
       572: invokevirtual #699                // Method ext/mods/gameserver/geoengine/geodata/ABlock.getHeight:(ILext/mods/gameserver/geoengine/geodata/IGeoObject;)S
       575: istore        31
       577: nop
       578: iload         31
       580: i2d
       581: dload         26
       583: dcmpl
       584: ifle          612
       587: iload_3
       588: i2d
       589: dload         16
       591: dload         28
       593: dmul
       594: dadd
       595: d2i
       596: istore        32
       598: new           #665                // class ext/mods/gameserver/model/location/Location
       601: dup
       602: iload         24
       604: iload         25
       606: iload         32
       608: invokespecial #835                // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       611: areturn
       612: iload         31
       614: istore        14
       616: aload         12
       618: iload         13
       620: aload         7
       622: invokevirtual #707                // Method ext/mods/gameserver/geoengine/geodata/ABlock.getNswe:(ILext/mods/gameserver/geoengine/geodata/IGeoObject;)B
       625: istore        15
       627: goto          265
       630: new           #665                // class ext/mods/gameserver/model/location/Location
       633: dup
       634: iload         4
       636: iload         5
       638: iload         6
       640: invokespecial #835                // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       643: areturn
      StackMapTable: number_of_entries = 19
        frame_type = 13 /* same */
        frame_type = 13 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 74
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine, int, int, int, int, int, int, class ext/mods/gameserver/geoengine/geodata/IGeoObject, int, int, int, int, class ext/mods/gameserver/geoengine/geodata/ABlock, int ]
          stack = []
        frame_type = 39 /* same */
        frame_type = 15 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 78
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine, int, int, int, int, int, int, class ext/mods/gameserver/geoengine/geodata/IGeoObject, int, int, int, int, class ext/mods/gameserver/geoengine/geodata/ABlock, int, int, int, double, class ext/mods/gameserver/enums/MoveDirectionType ]
          stack = []
        frame_type = 74 /* same_locals_1_stack_item */
          stack = [ double ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine, int, int, int, int, int, int, class ext/mods/gameserver/geoengine/geodata/IGeoObject, int, int, int, int, class ext/mods/gameserver/geoengine/geodata/ABlock, int, int, int, double, class ext/mods/gameserver/enums/MoveDirectionType, double, int, int, int ]
          stack = []
        frame_type = 13 /* same */
        frame_type = 253 /* append */
          offset_delta = 75
          locals = [ int, int ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 67
        frame_type = 253 /* append */
          offset_delta = 65
          locals = [ double, double ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 26
          locals = [ int ]
        frame_type = 79 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 32 /* same */
        frame_type = 252 /* append */
          offset_delta = 45
          locals = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine, int, int, int, int, int, int, class ext/mods/gameserver/geoengine/geodata/IGeoObject, int, int, int, int, class ext/mods/gameserver/geoengine/geodata/ABlock, int, int, int, double, class ext/mods/gameserver/enums/MoveDirectionType, double, int, int, int ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 12
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine, int, int, int, int, int, int, class ext/mods/gameserver/geoengine/geodata/IGeoObject ]
          stack = [ class ext/mods/gameserver/model/location/Location ]
      LineNumberTable:
        line 604: 0
        line 605: 1
        line 606: 13
        line 608: 27
        line 609: 36
        line 610: 45
        line 611: 55
        line 613: 65
        line 614: 75
        line 615: 92
        line 616: 93
        line 617: 102
        line 618: 116
        line 619: 117
        line 620: 142
        line 624: 158
        line 625: 169
        line 626: 180
        line 626: 208
        line 627: 211
        line 629: 226
        line 630: 227
        line 631: 237
        line 629: 248
        line 633: 250
        line 634: 256
        line 635: 262
        line 636: 265
        line 637: 279
        line 638: 289
        line 639: 303
        line 640: 304
        line 641: 325
        line 642: 335
        line 643: 345
        line 646: 355
        line 647: 365
        line 648: 379
        line 648: 379
        line 648: 394
        line 649: 396
        line 650: 406
        line 651: 416
        line 654: 423
        line 656: 433
        line 657: 442
        line 657: 465
        line 658: 467
        line 659: 477
        line 660: 492
        line 661: 493
        line 662: 517
        line 660: 533
        line 664: 535
        line 665: 536
        line 666: 541
        line 667: 552
        line 670: 566
        line 671: 577
        line 672: 578
        line 673: 587
        line 674: 598
        line 677: 612
        line 678: 616
        line 680: 630
        line 604: 643
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          552      14    31 collisionZ   I
          598      14    32 collisionZ   I
          289     338    24 checkX   I
          303     324    25 checkY   I
          442     185    26  losz   D
          467     160    28 distance   D
          492     135    30 canMove   Z
          577      50    31     z   I
          169     474    14 groundZ   I
          180     463    15  nswe   B
          211     432    16    mz   D
          226     417    18   mdt   Lext/mods/gameserver/enums/MoveDirectionType;
          250     393    19     m   D
          256     387    21 gridX   I
          262     381    22 gridY   I
          265     378    23   dir   B
           36     607     8   gox   I
           45     598     9   goy   I
           55     588    10   gtx   I
           65     578    11   gty   I
           75     568    12 block   Lext/mods/gameserver/geoengine/geodata/ABlock;
           92     551    13 index   I
            0     644     0  this   Lext/mods/gameserver/geoengine/GeoEngine;
            0     644     1    ox   I
            0     644     2    oy   I
            0     644     3    oz   I
            0     644     4    tx   I
            0     644     5    ty   I
            0     644     6    tz   I
            0     644     7 ignore   Lext/mods/gameserver/geoengine/geodata/IGeoObject;
    RuntimeInvisibleAnnotations:
      0: #632()
        org.jetbrains.annotations.Nullable
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
      parameter 1:
      parameter 2:
      parameter 3:
      parameter 4:
      parameter 5:
      parameter 6:
        0: #632()
          org.jetbrains.annotations.Nullable

  public final boolean canFindPathToTarget(ext.mods.gameserver.model.WorldObject, ext.mods.gameserver.model.WorldObject);
    descriptor: (Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=9, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: invokevirtual #1064               // Method ext/mods/gameserver/model/WorldObject.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
         5: checkcast     #665                // class ext/mods/gameserver/model/location/Location
         8: aload_2
         9: invokevirtual #1064               // Method ext/mods/gameserver/model/WorldObject.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
        12: checkcast     #665                // class ext/mods/gameserver/model/location/Location
        15: invokevirtual #1068               // Method canMoveToTarget:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Z
        18: ifeq          23
        21: iconst_1
        22: ireturn
        23: aload_0
        24: aload_1
        25: invokevirtual #938                // Method ext/mods/gameserver/model/WorldObject.getX:()I
        28: aload_1
        29: invokevirtual #939                // Method ext/mods/gameserver/model/WorldObject.getY:()I
        32: aload_1
        33: invokevirtual #940                // Method ext/mods/gameserver/model/WorldObject.getZ:()I
        36: aload_2
        37: invokevirtual #938                // Method ext/mods/gameserver/model/WorldObject.getX:()I
        40: aload_2
        41: invokevirtual #939                // Method ext/mods/gameserver/model/WorldObject.getY:()I
        44: aload_2
        45: invokevirtual #940                // Method ext/mods/gameserver/model/WorldObject.getZ:()I
        48: aload_1
        49: instanceof    #1070               // class ext/mods/gameserver/model/actor/Playable
        52: aconst_null
        53: invokevirtual #1074               // Method findPath:(IIIIIIZLext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
        56: invokeinterface #1076,  1         // InterfaceMethod java/util/List.size:()I
        61: iconst_2
        62: if_icmplt     69
        65: iconst_1
        66: goto          70
        69: iconst_0
        70: ireturn
      StackMapTable: number_of_entries = 3
        frame_type = 23 /* same */
        frame_type = 45 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
      LineNumberTable:
        line 687: 0
        line 688: 23
        line 689: 24
        line 690: 48
        line 688: 53
        line 691: 56
        line 688: 62
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      71     0  this   Lext/mods/gameserver/geoengine/GeoEngine;
            0      71     1   obj   Lext/mods/gameserver/model/WorldObject;
            0      71     2 target   Lext/mods/gameserver/model/WorldObject;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #611()
          org.jetbrains.annotations.NotNull
      parameter 1:
        0: #611()
          org.jetbrains.annotations.NotNull

  public final boolean canMoveToTarget(ext.mods.gameserver.model.WorldObject, ext.mods.gameserver.model.WorldObject);
    descriptor: (Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: invokevirtual #1064               // Method ext/mods/gameserver/model/WorldObject.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
         5: checkcast     #665                // class ext/mods/gameserver/model/location/Location
         8: aload_2
         9: invokevirtual #1064               // Method ext/mods/gameserver/model/WorldObject.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
        12: checkcast     #665                // class ext/mods/gameserver/model/location/Location
        15: invokevirtual #1068               // Method canMoveToTarget:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Z
        18: ireturn
      LineNumberTable:
        line 694: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/geoengine/GeoEngine;
            0      19     1   obj   Lext/mods/gameserver/model/WorldObject;
            0      19     2 target   Lext/mods/gameserver/model/WorldObject;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #611()
          org.jetbrains.annotations.NotNull
      parameter 1:
        0: #611()
          org.jetbrains.annotations.NotNull

  public final boolean canMoveToTarget(ext.mods.gameserver.model.WorldObject, ext.mods.gameserver.model.location.Location);
    descriptor: (Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/location/Location;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: invokevirtual #1064               // Method ext/mods/gameserver/model/WorldObject.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
         5: checkcast     #665                // class ext/mods/gameserver/model/location/Location
         8: aload_2
         9: invokevirtual #1068               // Method canMoveToTarget:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Z
        12: ireturn
      LineNumberTable:
        line 696: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/geoengine/GeoEngine;
            0      13     1   obj   Lext/mods/gameserver/model/WorldObject;
            0      13     2 position   Lext/mods/gameserver/model/location/Location;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #611()
          org.jetbrains.annotations.NotNull
      parameter 1:
        0: #611()
          org.jetbrains.annotations.NotNull

  public final boolean canMoveToTarget(ext.mods.gameserver.model.location.Location, ext.mods.gameserver.model.location.Location);
    descriptor: (Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=8, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: invokevirtual #668                // Method ext/mods/gameserver/model/location/Location.getX:()I
         5: aload_1
         6: invokevirtual #671                // Method ext/mods/gameserver/model/location/Location.getY:()I
         9: aload_1
        10: invokevirtual #674                // Method ext/mods/gameserver/model/location/Location.getZ:()I
        13: aload_2
        14: invokevirtual #668                // Method ext/mods/gameserver/model/location/Location.getX:()I
        17: aload_2
        18: invokevirtual #671                // Method ext/mods/gameserver/model/location/Location.getY:()I
        21: aload_2
        22: invokevirtual #674                // Method ext/mods/gameserver/model/location/Location.getZ:()I
        25: aconst_null
        26: invokevirtual #793                // Method canMove:(IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
        29: ireturn
      LineNumberTable:
        line 698: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      30     0  this   Lext/mods/gameserver/geoengine/GeoEngine;
            0      30     1 origin   Lext/mods/gameserver/model/location/Location;
            0      30     2 target   Lext/mods/gameserver/model/location/Location;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #611()
          org.jetbrains.annotations.NotNull
      parameter 1:
        0: #611()
          org.jetbrains.annotations.NotNull

  public final boolean canMoveToTarget(int, int, int, int, int, int);
    descriptor: (IIIIII)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=8, locals=7, args_size=7
         0: aload_0
         1: iload_1
         2: iload_2
         3: iload_3
         4: iload         4
         6: iload         5
         8: iload         6
        10: aconst_null
        11: invokevirtual #793                // Method canMove:(IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
        14: ireturn
      LineNumberTable:
        line 700: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/geoengine/GeoEngine;
            0      15     1    ox   I
            0      15     2    oy   I
            0      15     3    oz   I
            0      15     4    tx   I
            0      15     5    ty   I
            0      15     6    tz   I

  public final boolean canMove(int, int, int, int, int, int, ext.mods.gameserver.network.serverpackets.ExServerPrimitive);
    descriptor: (IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=7, locals=26, args_size=8
         0: iload         4
         2: iload         5
         4: invokestatic  #961                // Method ext/mods/gameserver/model/World.isOutOfWorld:(II)Z
         7: ifeq          12
        10: iconst_0
        11: ireturn
        12: getstatic     #648                // Field Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
        15: iload_1
        16: invokevirtual #654                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoX:(I)I
        19: istore        8
        21: getstatic     #648                // Field Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
        24: iload_2
        25: invokevirtual #657                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoY:(I)I
        28: istore        9
        30: aload_0
        31: iload         8
        33: iload         9
        35: iload_3
        36: invokevirtual #634                // Method getHeightNearest:(III)S
        39: istore        10
        41: getstatic     #648                // Field Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
        44: iload         4
        46: invokevirtual #654                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoX:(I)I
        49: istore        11
        51: getstatic     #648                // Field Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
        54: iload         5
        56: invokevirtual #657                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoY:(I)I
        59: istore        12
        61: iload         8
        63: iload         11
        65: if_icmpne     96
        68: iload         9
        70: iload         12
        72: if_icmpne     96
        75: iload         10
        77: aload_0
        78: iload         4
        80: iload         5
        82: iload         6
        84: invokevirtual #822                // Method getHeight:(III)S
        87: if_icmpne     94
        90: iconst_1
        91: goto          95
        94: iconst_0
        95: ireturn
        96: aload_0
        97: iload         8
        99: iload         9
       101: iload         10
       103: aconst_null
       104: invokevirtual #1079               // Method getNsweNearest:(IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)B
       107: istore        13
       109: iload         4
       111: iload_1
       112: if_icmpne     119
       115: dconst_0
       116: goto          130
       119: iload         5
       121: iload_2
       122: isub
       123: i2d
       124: iload         4
       126: iload_1
       127: isub
       128: i2d
       129: ddiv
       130: dstore        14
       132: iload         11
       134: iload         8
       136: isub
       137: iload         12
       139: iload         9
       141: isub
       142: invokestatic  #971                // Method ext/mods/gameserver/enums/MoveDirectionType.getDirection:(II)Lext/mods/gameserver/enums/MoveDirectionType;
       145: astore        16
       147: iload_1
       148: bipush        -16
       150: iand
       151: istore        17
       153: iload_2
       154: bipush        -16
       156: iand
       157: istore        18
       159: aload         7
       161: ifnull        204
       164: aload         7
       166: getstatic     #977                // Field java/awt/Color.BLUE:Ljava/awt/Color;
       169: iload         17
       171: iload         18
       173: iload         10
       175: iconst_1
       176: iadd
       177: bipush        15
       179: invokevirtual #981                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addSquare:(Ljava/awt/Color;IIII)V
       182: aload         7
       184: getstatic     #977                // Field java/awt/Color.BLUE:Ljava/awt/Color;
       187: iload         4
       189: bipush        -16
       191: iand
       192: iload         5
       194: bipush        -16
       196: iand
       197: iload         6
       199: bipush        15
       201: invokevirtual #981                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addSquare:(Ljava/awt/Color;IIII)V
       204: iconst_0
       205: istore        19
       207: iload         8
       209: istore        20
       211: iload         9
       213: istore        21
       215: iload         8
       217: iload         11
       219: if_icmpne     229
       222: iload         9
       224: iload         12
       226: if_icmpeq     571
       229: iload         17
       231: aload         16
       233: invokevirtual #984                // Method ext/mods/gameserver/enums/MoveDirectionType.getOffsetX:()I
       236: iadd
       237: istore        22
       239: iload_2
       240: i2d
       241: dload         14
       243: iload         22
       245: iload_1
       246: isub
       247: i2d
       248: dmul
       249: dadd
       250: d2i
       251: istore        23
       253: aload         16
       255: invokevirtual #987                // Method ext/mods/gameserver/enums/MoveDirectionType.getStepX:()I
       258: ifeq          345
       261: getstatic     #648                // Field Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
       264: iload         23
       266: invokevirtual #657                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoY:(I)I
       269: iload         9
       271: if_icmpne     345
       274: aload         7
       276: ifnull        315
       279: aload         7
       281: aload         16
       283: invokevirtual #990                // Method ext/mods/gameserver/enums/MoveDirectionType.getSymbolX:()Ljava/lang/String;
       286: getstatic     #993                // Field java/awt/Color.CYAN:Ljava/awt/Color;
       289: iconst_1
       290: iload         22
       292: iload         23
       294: iload         10
       296: invokevirtual #997                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addPoint:(Ljava/lang/String;Ljava/awt/Color;ZIII)V
       299: aload         7
       301: getstatic     #1000               // Field java/awt/Color.GREEN:Ljava/awt/Color;
       304: iload         17
       306: iload         18
       308: iload         10
       310: bipush        15
       312: invokevirtual #981                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addSquare:(Ljava/awt/Color;IIII)V
       315: iload         17
       317: aload         16
       319: invokevirtual #987                // Method ext/mods/gameserver/enums/MoveDirectionType.getStepX:()I
       322: iadd
       323: istore        17
       325: iload         20
       327: aload         16
       329: invokevirtual #1003               // Method ext/mods/gameserver/enums/MoveDirectionType.getSignumX:()I
       332: iadd
       333: istore        20
       335: aload         16
       337: invokevirtual #1006               // Method ext/mods/gameserver/enums/MoveDirectionType.getDirectionX:()B
       340: istore        19
       342: goto          454
       345: iload         18
       347: aload         16
       349: invokevirtual #1009               // Method ext/mods/gameserver/enums/MoveDirectionType.getOffsetY:()I
       352: iadd
       353: istore        23
       355: iload_1
       356: i2d
       357: iload         23
       359: iload_2
       360: isub
       361: i2d
       362: dload         14
       364: ddiv
       365: dadd
       366: d2i
       367: istore        22
       369: iload         17
       371: iload         17
       373: bipush        15
       375: iadd
       376: iload         22
       378: invokestatic  #1012               // Method java/lang/Math.min:(II)I
       381: invokestatic  #798                // Method java/lang/Math.max:(II)I
       384: istore        22
       386: aload         7
       388: ifnull        427
       391: aload         7
       393: aload         16
       395: invokevirtual #1015               // Method ext/mods/gameserver/enums/MoveDirectionType.getSymbolY:()Ljava/lang/String;
       398: getstatic     #1018               // Field java/awt/Color.YELLOW:Ljava/awt/Color;
       401: iconst_1
       402: iload         22
       404: iload         23
       406: iload         10
       408: invokevirtual #997                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addPoint:(Ljava/lang/String;Ljava/awt/Color;ZIII)V
       411: aload         7
       413: getstatic     #1000               // Field java/awt/Color.GREEN:Ljava/awt/Color;
       416: iload         17
       418: iload         18
       420: iload         10
       422: bipush        15
       424: invokevirtual #981                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addSquare:(Ljava/awt/Color;IIII)V
       427: iload         18
       429: aload         16
       431: invokevirtual #1021               // Method ext/mods/gameserver/enums/MoveDirectionType.getStepY:()I
       434: iadd
       435: istore        18
       437: iload         21
       439: aload         16
       441: invokevirtual #1024               // Method ext/mods/gameserver/enums/MoveDirectionType.getSignumY:()I
       444: iadd
       445: istore        21
       447: aload         16
       449: invokevirtual #1027               // Method ext/mods/gameserver/enums/MoveDirectionType.getDirectionY:()B
       452: istore        19
       454: iload         13
       456: iload         19
       458: iand
       459: ifne          485
       462: aload         7
       464: ifnull        483
       467: aload         7
       469: getstatic     #1036               // Field java/awt/Color.RED:Ljava/awt/Color;
       472: iload         17
       474: iload         18
       476: iload         10
       478: bipush        15
       480: invokevirtual #981                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addSquare:(Ljava/awt/Color;IIII)V
       483: iconst_0
       484: ireturn
       485: aload_0
       486: iload         20
       488: iload         21
       490: invokevirtual #692                // Method getBlock:(II)Lext/mods/gameserver/geoengine/geodata/ABlock;
       493: astore        24
       495: aload         24
       497: iload         20
       499: iload         21
       501: iload         10
       503: bipush        48
       505: iadd
       506: aconst_null
       507: invokevirtual #696                // Method ext/mods/gameserver/geoengine/geodata/ABlock.getIndexBelow:(IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)I
       510: istore        25
       512: iload         25
       514: ifge          540
       517: aload         7
       519: ifnull        538
       522: aload         7
       524: getstatic     #1036               // Field java/awt/Color.RED:Ljava/awt/Color;
       527: iload         17
       529: iload         18
       531: iload         10
       533: bipush        15
       535: invokevirtual #981                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addSquare:(Ljava/awt/Color;IIII)V
       538: iconst_0
       539: ireturn
       540: iload         20
       542: istore        8
       544: iload         21
       546: istore        9
       548: aload         24
       550: iload         25
       552: aconst_null
       553: invokevirtual #699                // Method ext/mods/gameserver/geoengine/geodata/ABlock.getHeight:(ILext/mods/gameserver/geoengine/geodata/IGeoObject;)S
       556: istore        10
       558: aload         24
       560: iload         25
       562: aconst_null
       563: invokevirtual #707                // Method ext/mods/gameserver/geoengine/geodata/ABlock.getNswe:(ILext/mods/gameserver/geoengine/geodata/IGeoObject;)B
       566: istore        13
       568: goto          215
       571: iload         10
       573: aload_0
       574: iload         4
       576: iload         5
       578: iload         6
       580: invokevirtual #822                // Method getHeight:(III)S
       583: if_icmpne     590
       586: iconst_1
       587: goto          591
       590: iconst_0
       591: ireturn
      StackMapTable: number_of_entries = 20
        frame_type = 12 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 81
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine, int, int, int, int, int, int, class ext/mods/gameserver/network/serverpackets/ExServerPrimitive, int, int, int, int, int ]
          stack = []
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 0 /* same */
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ int ]
        frame_type = 74 /* same_locals_1_stack_item */
          stack = [ double ]
        frame_type = 255 /* full_frame */
          offset_delta = 73
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine, int, int, int, int, int, int, class ext/mods/gameserver/network/serverpackets/ExServerPrimitive, int, int, int, int, int, int, double, class ext/mods/gameserver/enums/MoveDirectionType, int, int ]
          stack = []
        frame_type = 254 /* append */
          offset_delta = 10
          locals = [ int, int, int ]
        frame_type = 13 /* same */
        frame_type = 253 /* append */
          offset_delta = 85
          locals = [ int, int ]
        frame_type = 29 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 81
        frame_type = 26 /* same */
        frame_type = 28 /* same */
        frame_type = 1 /* same */
        frame_type = 253 /* append */
          offset_delta = 52
          locals = [ class ext/mods/gameserver/geoengine/geodata/ABlock, int ]
        frame_type = 1 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 30
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine, int, int, int, int, int, int, class ext/mods/gameserver/network/serverpackets/ExServerPrimitive, int, int, int, int, int, int, double, class ext/mods/gameserver/enums/MoveDirectionType, int, int, int, int, int ]
          stack = []
        frame_type = 18 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
      LineNumberTable:
        line 702: 0
        line 703: 12
        line 704: 21
        line 705: 30
        line 706: 41
        line 707: 51
        line 708: 61
        line 709: 96
        line 710: 109
        line 711: 132
        line 712: 147
        line 713: 153
        line 714: 159
        line 715: 164
        line 716: 182
        line 718: 204
        line 719: 207
        line 720: 211
        line 721: 215
        line 722: 229
        line 723: 239
        line 724: 253
        line 725: 274
        line 726: 279
        line 727: 299
        line 729: 315
        line 730: 325
        line 731: 335
        line 733: 345
        line 734: 355
        line 735: 369
        line 735: 369
        line 735: 384
        line 736: 386
        line 737: 391
        line 738: 411
        line 740: 427
        line 741: 437
        line 742: 447
        line 744: 454
        line 745: 462
        line 746: 483
        line 748: 485
        line 749: 495
        line 750: 512
        line 751: 517
        line 752: 538
        line 754: 540
        line 755: 544
        line 756: 548
        line 757: 558
        line 759: 571
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          239     329    22 checkX   I
          253     315    23 checkY   I
          495      73    24 block   Lext/mods/gameserver/geoengine/geodata/ABlock;
          512      56    25     i   I
           21     571     8   gox   I
           30     562     9   goy   I
           41     551    10   goz   I
           51     541    11   gtx   I
           61     531    12   gty   I
          109     483    13  nswe   B
          132     460    14     m   D
          147     445    16   mdt   Lext/mods/gameserver/enums/MoveDirectionType;
          153     439    17 gridX   I
          159     433    18 gridY   I
          207     385    19   dir   B
          211     381    20    nx   I
          215     377    21    ny   I
            0     592     0  this   Lext/mods/gameserver/geoengine/GeoEngine;
            0     592     1    ox   I
            0     592     2    oy   I
            0     592     3    oz   I
            0     592     4    tx   I
            0     592     5    ty   I
            0     592     6    tz   I
            0     592     7 debug   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
      parameter 1:
      parameter 2:
      parameter 3:
      parameter 4:
      parameter 5:
      parameter 6:
        0: #632()
          org.jetbrains.annotations.Nullable

  public final boolean canMoveClear(int, int, int, int, int, int, ext.mods.gameserver.network.serverpackets.ExServerPrimitive);
    descriptor: (IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=7, locals=26, args_size=8
         0: nop
         1: iload         4
         3: iload         5
         5: invokestatic  #961                // Method ext/mods/gameserver/model/World.isOutOfWorld:(II)Z
         8: ifeq          15
        11: iconst_0
        12: goto          641
        15: getstatic     #648                // Field Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
        18: iload_1
        19: invokevirtual #654                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoX:(I)I
        22: istore        8
        24: getstatic     #648                // Field Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
        27: iload_2
        28: invokevirtual #657                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoY:(I)I
        31: istore        9
        33: iconst_0
        34: istore        10
        36: aload_0
        37: iload         8
        39: iload         9
        41: iload_3
        42: invokevirtual #634                // Method getHeightNearest:(III)S
        45: istore        10
        47: getstatic     #648                // Field Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
        50: iload         4
        52: invokevirtual #654                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoX:(I)I
        55: istore        11
        57: getstatic     #648                // Field Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
        60: iload         5
        62: invokevirtual #657                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoY:(I)I
        65: istore        12
        67: nop
        68: iload         8
        70: iload         11
        72: if_icmpne     105
        75: iload         9
        77: iload         12
        79: if_icmpne     105
        82: iload         10
        84: aload_0
        85: iload         4
        87: iload         5
        89: iload         6
        91: invokevirtual #822                // Method getHeight:(III)S
        94: if_icmpne     101
        97: iconst_1
        98: goto          641
       101: iconst_0
       102: goto          641
       105: aload_0
       106: iload         8
       108: iload         9
       110: iload         10
       112: aconst_null
       113: invokevirtual #1079               // Method getNsweNearest:(IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)B
       116: istore        13
       118: nop
       119: iload         4
       121: iload_1
       122: if_icmpne     129
       125: dconst_0
       126: goto          140
       129: iload         5
       131: iload_2
       132: isub
       133: i2d
       134: iload         4
       136: iload_1
       137: isub
       138: i2d
       139: ddiv
       140: dstore        14
       142: iload         11
       144: iload         8
       146: isub
       147: iload         12
       149: iload         9
       151: isub
       152: invokestatic  #971                // Method ext/mods/gameserver/enums/MoveDirectionType.getDirection:(II)Lext/mods/gameserver/enums/MoveDirectionType;
       155: astore        16
       157: iconst_0
       158: istore        17
       160: iload_1
       161: bipush        -16
       163: iand
       164: istore        17
       166: iconst_0
       167: istore        18
       169: iload_2
       170: bipush        -16
       172: iand
       173: istore        18
       175: aload         7
       177: dup
       178: ifnull        230
       181: astore        20
       183: iconst_0
       184: istore        21
       186: aload         20
       188: getstatic     #977                // Field java/awt/Color.BLUE:Ljava/awt/Color;
       191: iload         17
       193: iload         18
       195: iload         10
       197: iconst_1
       198: iadd
       199: bipush        15
       201: invokevirtual #981                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addSquare:(Ljava/awt/Color;IIII)V
       204: aload         20
       206: getstatic     #977                // Field java/awt/Color.BLUE:Ljava/awt/Color;
       209: iload         4
       211: bipush        -16
       213: iand
       214: iload         5
       216: bipush        -16
       218: iand
       219: iload         6
       221: bipush        15
       223: invokevirtual #981                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addSquare:(Ljava/awt/Color;IIII)V
       226: nop
       227: goto          232
       230: pop
       231: nop
       232: iload         8
       234: istore        19
       236: iload         9
       238: istore        20
       240: iload         8
       242: iload         11
       244: if_icmpne     254
       247: iload         9
       249: iload         12
       251: if_icmpeq     621
       254: iconst_0
       255: istore        21
       257: iload         17
       259: aload         16
       261: invokevirtual #984                // Method ext/mods/gameserver/enums/MoveDirectionType.getOffsetX:()I
       264: iadd
       265: istore        21
       267: iconst_0
       268: istore        22
       270: iload_2
       271: i2d
       272: dload         14
       274: iload         21
       276: iload_1
       277: isub
       278: i2d
       279: dmul
       280: dadd
       281: d2i
       282: istore        22
       284: nop
       285: aload         16
       287: invokevirtual #987                // Method ext/mods/gameserver/enums/MoveDirectionType.getStepX:()I
       290: ifeq          382
       293: getstatic     #648                // Field Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
       296: iload         22
       298: invokevirtual #657                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoY:(I)I
       301: iload         9
       303: if_icmpne     382
       306: aload         7
       308: dup
       309: ifnull        357
       312: astore        24
       314: iconst_0
       315: istore        25
       317: aload         24
       319: aload         16
       321: invokevirtual #990                // Method ext/mods/gameserver/enums/MoveDirectionType.getSymbolX:()Ljava/lang/String;
       324: getstatic     #993                // Field java/awt/Color.CYAN:Ljava/awt/Color;
       327: iconst_1
       328: iload         21
       330: iload         22
       332: iload         10
       334: invokevirtual #997                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addPoint:(Ljava/lang/String;Ljava/awt/Color;ZIII)V
       337: aload         24
       339: getstatic     #1000               // Field java/awt/Color.GREEN:Ljava/awt/Color;
       342: iload         17
       344: iload         18
       346: iload         10
       348: bipush        15
       350: invokevirtual #981                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addSquare:(Ljava/awt/Color;IIII)V
       353: nop
       354: goto          359
       357: pop
       358: nop
       359: iload         17
       361: aload         16
       363: invokevirtual #987                // Method ext/mods/gameserver/enums/MoveDirectionType.getStepX:()I
       366: iadd
       367: istore        17
       369: iload         19
       371: aload         16
       373: invokevirtual #1003               // Method ext/mods/gameserver/enums/MoveDirectionType.getSignumX:()I
       376: iadd
       377: istore        19
       379: goto          497
       382: iload         18
       384: aload         16
       386: invokevirtual #1009               // Method ext/mods/gameserver/enums/MoveDirectionType.getOffsetY:()I
       389: iadd
       390: istore        22
       392: iload_1
       393: i2d
       394: iload         22
       396: iload_2
       397: isub
       398: i2d
       399: dload         14
       401: ddiv
       402: dadd
       403: d2i
       404: istore        21
       406: nop
       407: iload         17
       409: iload         17
       411: bipush        15
       413: iadd
       414: iload         21
       416: invokestatic  #1012               // Method java/lang/Math.min:(II)I
       419: invokestatic  #798                // Method java/lang/Math.max:(II)I
       422: istore        21
       424: aload         7
       426: dup
       427: ifnull        475
       430: astore        24
       432: iconst_0
       433: istore        25
       435: aload         24
       437: aload         16
       439: invokevirtual #1015               // Method ext/mods/gameserver/enums/MoveDirectionType.getSymbolY:()Ljava/lang/String;
       442: getstatic     #1018               // Field java/awt/Color.YELLOW:Ljava/awt/Color;
       445: iconst_1
       446: iload         21
       448: iload         22
       450: iload         10
       452: invokevirtual #997                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addPoint:(Ljava/lang/String;Ljava/awt/Color;ZIII)V
       455: aload         24
       457: getstatic     #1000               // Field java/awt/Color.GREEN:Ljava/awt/Color;
       460: iload         17
       462: iload         18
       464: iload         10
       466: bipush        15
       468: invokevirtual #981                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addSquare:(Ljava/awt/Color;IIII)V
       471: nop
       472: goto          477
       475: pop
       476: nop
       477: iload         18
       479: aload         16
       481: invokevirtual #1021               // Method ext/mods/gameserver/enums/MoveDirectionType.getStepY:()I
       484: iadd
       485: istore        18
       487: iload         20
       489: aload         16
       491: invokevirtual #1024               // Method ext/mods/gameserver/enums/MoveDirectionType.getSignumY:()I
       494: iadd
       495: istore        20
       497: nop
       498: iload         13
       500: bipush        15
       502: if_icmpeq     531
       505: aload         7
       507: dup
       508: ifnull        528
       511: getstatic     #1036               // Field java/awt/Color.RED:Ljava/awt/Color;
       514: iload         17
       516: iload         18
       518: iload         10
       520: bipush        15
       522: invokevirtual #981                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addSquare:(Ljava/awt/Color;IIII)V
       525: goto          529
       528: pop
       529: iconst_0
       530: ireturn
       531: aload_0
       532: iload         19
       534: iload         20
       536: invokevirtual #692                // Method getBlock:(II)Lext/mods/gameserver/geoengine/geodata/ABlock;
       539: astore        23
       541: aload         23
       543: iload         19
       545: iload         20
       547: iload         10
       549: bipush        48
       551: iadd
       552: aconst_null
       553: invokevirtual #696                // Method ext/mods/gameserver/geoengine/geodata/ABlock.getIndexBelow:(IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)I
       556: istore        24
       558: nop
       559: iload         24
       561: ifge          590
       564: aload         7
       566: dup
       567: ifnull        587
       570: getstatic     #1036               // Field java/awt/Color.RED:Ljava/awt/Color;
       573: iload         17
       575: iload         18
       577: iload         10
       579: bipush        15
       581: invokevirtual #981                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addSquare:(Ljava/awt/Color;IIII)V
       584: goto          588
       587: pop
       588: iconst_0
       589: ireturn
       590: iload         19
       592: istore        8
       594: iload         20
       596: istore        9
       598: aload         23
       600: iload         24
       602: aconst_null
       603: invokevirtual #699                // Method ext/mods/gameserver/geoengine/geodata/ABlock.getHeight:(ILext/mods/gameserver/geoengine/geodata/IGeoObject;)S
       606: istore        10
       608: aload         23
       610: iload         24
       612: aconst_null
       613: invokevirtual #707                // Method ext/mods/gameserver/geoengine/geodata/ABlock.getNswe:(ILext/mods/gameserver/geoengine/geodata/IGeoObject;)B
       616: istore        13
       618: goto          240
       621: iload         10
       623: aload_0
       624: iload         4
       626: iload         5
       628: iload         6
       630: invokevirtual #822                // Method getHeight:(III)S
       633: if_icmpne     640
       636: iconst_1
       637: goto          641
       640: iconst_0
       641: ireturn
      StackMapTable: number_of_entries = 24
        frame_type = 15 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 85
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine, int, int, int, int, int, int, class ext/mods/gameserver/network/serverpackets/ExServerPrimitive, int, int, int, int, int ]
          stack = []
        frame_type = 3 /* same */
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ int ]
        frame_type = 74 /* same_locals_1_stack_item */
          stack = [ double ]
        frame_type = 255 /* full_frame */
          offset_delta = 89
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine, int, int, int, int, int, int, class ext/mods/gameserver/network/serverpackets/ExServerPrimitive, int, int, int, int, int, int, double, class ext/mods/gameserver/enums/MoveDirectionType, int, int ]
          stack = [ class ext/mods/gameserver/network/serverpackets/ExServerPrimitive ]
        frame_type = 1 /* same */
        frame_type = 253 /* append */
          offset_delta = 7
          locals = [ int, int ]
        frame_type = 13 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 102
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine, int, int, int, int, int, int, class ext/mods/gameserver/network/serverpackets/ExServerPrimitive, int, int, int, int, int, int, double, class ext/mods/gameserver/enums/MoveDirectionType, int, int, int, int, int, int ]
          stack = [ class ext/mods/gameserver/network/serverpackets/ExServerPrimitive ]
        frame_type = 1 /* same */
        frame_type = 22 /* same */
        frame_type = 247 /* same_locals_1_stack_item_frame_extended */
          offset_delta = 92
          stack = [ class ext/mods/gameserver/network/serverpackets/ExServerPrimitive ]
        frame_type = 1 /* same */
        frame_type = 19 /* same */
        frame_type = 94 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/network/serverpackets/ExServerPrimitive ]
        frame_type = 0 /* same */
        frame_type = 1 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 55
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine, int, int, int, int, int, int, class ext/mods/gameserver/network/serverpackets/ExServerPrimitive, int, int, int, int, int, int, double, class ext/mods/gameserver/enums/MoveDirectionType, int, int, int, int, int, int, class ext/mods/gameserver/geoengine/geodata/ABlock, int ]
          stack = [ class ext/mods/gameserver/network/serverpackets/ExServerPrimitive ]
        frame_type = 0 /* same */
        frame_type = 1 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 30
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine, int, int, int, int, int, int, class ext/mods/gameserver/network/serverpackets/ExServerPrimitive, int, int, int, int, int, int, double, class ext/mods/gameserver/enums/MoveDirectionType, int, int, int, int ]
          stack = []
        frame_type = 18 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine, int, int, int, int, int, int, class ext/mods/gameserver/network/serverpackets/ExServerPrimitive ]
          stack = [ int ]
      LineNumberTable:
        line 762: 0
        line 763: 1
        line 765: 15
        line 766: 24
        line 767: 33
        line 768: 47
        line 769: 57
        line 770: 67
        line 771: 68
        line 773: 105
        line 774: 118
        line 775: 119
        line 776: 129
        line 774: 140
        line 778: 142
        line 779: 157
        line 780: 166
        line 781: 175
        line 782: 186
        line 783: 204
        line 784: 226
        line 781: 227
        line 781: 230
        line 785: 232
        line 786: 236
        line 787: 240
        line 788: 254
        line 789: 267
        line 790: 284
        line 791: 285
        line 792: 306
        line 793: 317
        line 794: 337
        line 795: 353
        line 792: 354
        line 792: 357
        line 796: 359
        line 797: 369
        line 800: 382
        line 801: 392
        line 802: 406
        line 802: 407
        line 802: 422
        line 803: 424
        line 804: 435
        line 805: 455
        line 806: 471
        line 803: 472
        line 803: 475
        line 807: 477
        line 808: 487
        line 811: 497
        line 812: 498
        line 813: 505
        line 814: 529
        line 817: 531
        line 818: 541
        line 819: 558
        line 820: 559
        line 821: 564
        line 822: 588
        line 825: 590
        line 826: 594
        line 827: 598
        line 828: 608
        line 830: 621
        line 762: 641
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          186      41    21 $i$a$-let-GeoEngine$canMoveClear$1   I
          183      44    20    it   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
          317      37    25 $i$a$-let-GeoEngine$canMoveClear$2   I
          314      40    24    it   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
          435      37    25 $i$a$-let-GeoEngine$canMoveClear$3   I
          432      40    24    it   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
          257     361    21 checkX   I
          270     348    22 checkY   I
          541      77    23 block   Lext/mods/gameserver/geoengine/geodata/ABlock;
          558      60    24     i   I
          118     523    13  nswe   B
          142     499    14     m   D
          157     484    16   mdt   Lext/mods/gameserver/enums/MoveDirectionType;
          160     481    17 gridX   I
          169     472    18 gridY   I
          236     405    19    nx   I
          240     401    20    ny   I
           24     617     8   gox   I
           33     608     9   goy   I
           36     605    10   goz   I
           57     584    11   gtx   I
           67     574    12   gty   I
            0     642     0  this   Lext/mods/gameserver/geoengine/GeoEngine;
            0     642     1    ox   I
            0     642     2    oy   I
            0     642     3    oz   I
            0     642     4    tx   I
            0     642     5    ty   I
            0     642     6    tz   I
            0     642     7 debug   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
      parameter 1:
      parameter 2:
      parameter 3:
      parameter 4:
      parameter 5:
      parameter 6:
        0: #632()
          org.jetbrains.annotations.Nullable

  public final ext.mods.gameserver.model.location.Location getValidLocation(ext.mods.gameserver.model.WorldObject, int, int, int);
    descriptor: (Lext/mods/gameserver/model/WorldObject;III)Lext/mods/gameserver/model/location/Location;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=8, locals=5, args_size=5
         0: aload_0
         1: aload_1
         2: invokevirtual #938                // Method ext/mods/gameserver/model/WorldObject.getX:()I
         5: aload_1
         6: invokevirtual #939                // Method ext/mods/gameserver/model/WorldObject.getY:()I
         9: aload_1
        10: invokevirtual #940                // Method ext/mods/gameserver/model/WorldObject.getZ:()I
        13: iload_2
        14: iload_3
        15: iload         4
        17: aconst_null
        18: invokevirtual #1088               // Method getValidLocation:(IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Lext/mods/gameserver/model/location/Location;
        21: areturn
      LineNumberTable:
        line 837: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/gameserver/geoengine/GeoEngine;
            0      22     1   obj   Lext/mods/gameserver/model/WorldObject;
            0      22     2    tx   I
            0      22     3    ty   I
            0      22     4    tz   I
    RuntimeInvisibleAnnotations:
      0: #611()
        org.jetbrains.annotations.NotNull
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #611()
          org.jetbrains.annotations.NotNull
      parameter 1:
      parameter 2:
      parameter 3:

  public final ext.mods.gameserver.model.location.Location getValidLocation(ext.mods.gameserver.model.WorldObject, ext.mods.gameserver.model.WorldObject);
    descriptor: (Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Lext/mods/gameserver/model/location/Location;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: invokevirtual #1064               // Method ext/mods/gameserver/model/WorldObject.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
         5: checkcast     #665                // class ext/mods/gameserver/model/location/Location
         8: aload_2
         9: invokevirtual #1064               // Method ext/mods/gameserver/model/WorldObject.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
        12: checkcast     #665                // class ext/mods/gameserver/model/location/Location
        15: invokevirtual #1092               // Method getValidLocation:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/location/Location;
        18: areturn
      LineNumberTable:
        line 839: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/geoengine/GeoEngine;
            0      19     1 follower   Lext/mods/gameserver/model/WorldObject;
            0      19     2  pawn   Lext/mods/gameserver/model/WorldObject;
    RuntimeInvisibleAnnotations:
      0: #611()
        org.jetbrains.annotations.NotNull
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #611()
          org.jetbrains.annotations.NotNull
      parameter 1:
        0: #611()
          org.jetbrains.annotations.NotNull

  public final ext.mods.gameserver.model.location.Location getValidLocation(ext.mods.gameserver.model.WorldObject, ext.mods.gameserver.model.location.Location);
    descriptor: (Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/location/Location;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: invokevirtual #1064               // Method ext/mods/gameserver/model/WorldObject.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
         5: checkcast     #665                // class ext/mods/gameserver/model/location/Location
         8: aload_2
         9: invokevirtual #1092               // Method getValidLocation:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/location/Location;
        12: areturn
      LineNumberTable:
        line 841: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/geoengine/GeoEngine;
            0      13     1   obj   Lext/mods/gameserver/model/WorldObject;
            0      13     2 position   Lext/mods/gameserver/model/location/Location;
    RuntimeInvisibleAnnotations:
      0: #611()
        org.jetbrains.annotations.NotNull
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #611()
          org.jetbrains.annotations.NotNull
      parameter 1:
        0: #611()
          org.jetbrains.annotations.NotNull

  public final ext.mods.gameserver.model.location.Location getValidLocation(ext.mods.gameserver.model.location.Location, ext.mods.gameserver.model.location.Location);
    descriptor: (Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/location/Location;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=8, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: invokevirtual #668                // Method ext/mods/gameserver/model/location/Location.getX:()I
         5: aload_1
         6: invokevirtual #671                // Method ext/mods/gameserver/model/location/Location.getY:()I
         9: aload_1
        10: invokevirtual #674                // Method ext/mods/gameserver/model/location/Location.getZ:()I
        13: aload_2
        14: invokevirtual #668                // Method ext/mods/gameserver/model/location/Location.getX:()I
        17: aload_2
        18: invokevirtual #671                // Method ext/mods/gameserver/model/location/Location.getY:()I
        21: aload_2
        22: invokevirtual #674                // Method ext/mods/gameserver/model/location/Location.getZ:()I
        25: aconst_null
        26: invokevirtual #1088               // Method getValidLocation:(IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Lext/mods/gameserver/model/location/Location;
        29: areturn
      LineNumberTable:
        line 843: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      30     0  this   Lext/mods/gameserver/geoengine/GeoEngine;
            0      30     1 origin   Lext/mods/gameserver/model/location/Location;
            0      30     2 target   Lext/mods/gameserver/model/location/Location;
    RuntimeInvisibleAnnotations:
      0: #611()
        org.jetbrains.annotations.NotNull
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #611()
          org.jetbrains.annotations.NotNull
      parameter 1:
        0: #611()
          org.jetbrains.annotations.NotNull

  public final ext.mods.gameserver.model.location.Location getValidLocation(int, int, int, int, int, int, ext.mods.gameserver.network.serverpackets.ExServerPrimitive);
    descriptor: (IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Lext/mods/gameserver/model/location/Location;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=7, locals=28, args_size=8
         0: getstatic     #648                // Field Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
         3: iload_1
         4: invokevirtual #654                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoX:(I)I
         7: istore        8
         9: getstatic     #648                // Field Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
        12: iload_2
        13: invokevirtual #657                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoY:(I)I
        16: istore        9
        18: iconst_0
        19: istore        10
        21: aload_0
        22: iload         8
        24: iload         9
        26: iload_3
        27: invokevirtual #634                // Method getHeightNearest:(III)S
        30: istore        10
        32: aload_0
        33: iload         8
        35: iload         9
        37: iload         10
        39: aconst_null
        40: invokevirtual #1079               // Method getNsweNearest:(IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)B
        43: istore        11
        45: getstatic     #648                // Field Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
        48: iload         4
        50: invokevirtual #654                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoX:(I)I
        53: istore        12
        55: getstatic     #648                // Field Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
        58: iload         5
        60: invokevirtual #657                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoY:(I)I
        63: istore        13
        65: aload_0
        66: iload         12
        68: iload         13
        70: iload         6
        72: invokevirtual #634                // Method getHeightNearest:(III)S
        75: istore        14
        77: nop
        78: iload         4
        80: iload_1
        81: if_icmpne     88
        84: dconst_0
        85: goto          99
        88: iload         5
        90: iload_2
        91: isub
        92: i2d
        93: iload         4
        95: iload_1
        96: isub
        97: i2d
        98: ddiv
        99: dstore        15
       101: iload         12
       103: iload         8
       105: isub
       106: iload         13
       108: iload         9
       110: isub
       111: invokestatic  #971                // Method ext/mods/gameserver/enums/MoveDirectionType.getDirection:(II)Lext/mods/gameserver/enums/MoveDirectionType;
       114: astore        17
       116: iconst_0
       117: istore        18
       119: iload_1
       120: bipush        -16
       122: iand
       123: istore        18
       125: iconst_0
       126: istore        19
       128: iload_2
       129: bipush        -16
       131: iand
       132: istore        19
       134: aload         7
       136: dup
       137: ifnull        191
       140: astore        21
       142: iconst_0
       143: istore        22
       145: aload         21
       147: getstatic     #977                // Field java/awt/Color.BLUE:Ljava/awt/Color;
       150: iload         18
       152: iload         19
       154: iload         10
       156: iconst_1
       157: iadd
       158: bipush        15
       160: invokevirtual #981                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addSquare:(Ljava/awt/Color;IIII)V
       163: aload         21
       165: getstatic     #977                // Field java/awt/Color.BLUE:Ljava/awt/Color;
       168: iload         4
       170: bipush        -16
       172: iand
       173: iload         5
       175: bipush        -16
       177: iand
       178: iload         14
       180: iconst_1
       181: iadd
       182: bipush        15
       184: invokevirtual #981                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addSquare:(Ljava/awt/Color;IIII)V
       187: nop
       188: goto          193
       191: pop
       192: nop
       193: iconst_0
       194: istore        20
       196: iload         8
       198: istore        21
       200: iload         9
       202: istore        22
       204: iload         8
       206: iload         12
       208: if_icmpne     218
       211: iload         9
       213: iload         13
       215: if_icmpeq     688
       218: iconst_0
       219: istore        23
       221: iload         18
       223: aload         17
       225: invokevirtual #984                // Method ext/mods/gameserver/enums/MoveDirectionType.getOffsetX:()I
       228: iadd
       229: istore        23
       231: iconst_0
       232: istore        24
       234: iload_2
       235: i2d
       236: dload         15
       238: iload         23
       240: iload_1
       241: isub
       242: i2d
       243: dmul
       244: dadd
       245: d2i
       246: istore        24
       248: nop
       249: aload         17
       251: invokevirtual #987                // Method ext/mods/gameserver/enums/MoveDirectionType.getStepX:()I
       254: ifeq          353
       257: getstatic     #648                // Field Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
       260: iload         24
       262: invokevirtual #657                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoY:(I)I
       265: iload         9
       267: if_icmpne     353
       270: aload         7
       272: dup
       273: ifnull        321
       276: astore        26
       278: iconst_0
       279: istore        27
       281: aload         26
       283: aload         17
       285: invokevirtual #990                // Method ext/mods/gameserver/enums/MoveDirectionType.getSymbolX:()Ljava/lang/String;
       288: getstatic     #993                // Field java/awt/Color.CYAN:Ljava/awt/Color;
       291: iconst_1
       292: iload         23
       294: iload         24
       296: iload         10
       298: invokevirtual #997                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addPoint:(Ljava/lang/String;Ljava/awt/Color;ZIII)V
       301: aload         26
       303: getstatic     #1000               // Field java/awt/Color.GREEN:Ljava/awt/Color;
       306: iload         18
       308: iload         19
       310: iload         10
       312: bipush        15
       314: invokevirtual #981                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addSquare:(Ljava/awt/Color;IIII)V
       317: nop
       318: goto          323
       321: pop
       322: nop
       323: iload         18
       325: aload         17
       327: invokevirtual #987                // Method ext/mods/gameserver/enums/MoveDirectionType.getStepX:()I
       330: iadd
       331: istore        18
       333: iload         21
       335: aload         17
       337: invokevirtual #1003               // Method ext/mods/gameserver/enums/MoveDirectionType.getSignumX:()I
       340: iadd
       341: istore        21
       343: aload         17
       345: invokevirtual #1006               // Method ext/mods/gameserver/enums/MoveDirectionType.getDirectionX:()B
       348: istore        20
       350: goto          475
       353: iload         19
       355: aload         17
       357: invokevirtual #1009               // Method ext/mods/gameserver/enums/MoveDirectionType.getOffsetY:()I
       360: iadd
       361: istore        24
       363: iload_1
       364: i2d
       365: iload         24
       367: iload_2
       368: isub
       369: i2d
       370: dload         15
       372: ddiv
       373: dadd
       374: d2i
       375: istore        23
       377: nop
       378: iload         18
       380: iload         18
       382: bipush        15
       384: iadd
       385: iload         23
       387: invokestatic  #1012               // Method java/lang/Math.min:(II)I
       390: invokestatic  #798                // Method java/lang/Math.max:(II)I
       393: istore        23
       395: aload         7
       397: dup
       398: ifnull        446
       401: astore        26
       403: iconst_0
       404: istore        27
       406: aload         26
       408: aload         17
       410: invokevirtual #1015               // Method ext/mods/gameserver/enums/MoveDirectionType.getSymbolY:()Ljava/lang/String;
       413: getstatic     #1018               // Field java/awt/Color.YELLOW:Ljava/awt/Color;
       416: iconst_1
       417: iload         23
       419: iload         24
       421: iload         10
       423: invokevirtual #997                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addPoint:(Ljava/lang/String;Ljava/awt/Color;ZIII)V
       426: aload         26
       428: getstatic     #1000               // Field java/awt/Color.GREEN:Ljava/awt/Color;
       431: iload         18
       433: iload         19
       435: iload         10
       437: bipush        15
       439: invokevirtual #981                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addSquare:(Ljava/awt/Color;IIII)V
       442: nop
       443: goto          448
       446: pop
       447: nop
       448: iload         19
       450: aload         17
       452: invokevirtual #1021               // Method ext/mods/gameserver/enums/MoveDirectionType.getStepY:()I
       455: iadd
       456: istore        19
       458: iload         22
       460: aload         17
       462: invokevirtual #1024               // Method ext/mods/gameserver/enums/MoveDirectionType.getSignumY:()I
       465: iadd
       466: istore        22
       468: aload         17
       470: invokevirtual #1027               // Method ext/mods/gameserver/enums/MoveDirectionType.getDirectionY:()B
       473: istore        20
       475: nop
       476: iload         21
       478: iflt          502
       481: iload         21
       483: sipush        22528
       486: if_icmpge     502
       489: iload         22
       491: iflt          502
       494: iload         22
       496: ldc_w         #690                // int 32768
       499: if_icmplt     540
       502: aload         7
       504: dup
       505: ifnull        525
       508: getstatic     #1036               // Field java/awt/Color.RED:Ljava/awt/Color;
       511: iload         18
       513: iload         19
       515: iload         10
       517: bipush        15
       519: invokevirtual #981                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addSquare:(Ljava/awt/Color;IIII)V
       522: goto          526
       525: pop
       526: new           #665                // class ext/mods/gameserver/model/location/Location
       529: dup
       530: iload         23
       532: iload         24
       534: iload         10
       536: invokespecial #835                // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       539: areturn
       540: iload         11
       542: iload         20
       544: iand
       545: ifne          586
       548: aload         7
       550: dup
       551: ifnull        571
       554: getstatic     #1036               // Field java/awt/Color.RED:Ljava/awt/Color;
       557: iload         18
       559: iload         19
       561: iload         10
       563: bipush        15
       565: invokevirtual #981                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addSquare:(Ljava/awt/Color;IIII)V
       568: goto          572
       571: pop
       572: new           #665                // class ext/mods/gameserver/model/location/Location
       575: dup
       576: iload         23
       578: iload         24
       580: iload         10
       582: invokespecial #835                // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       585: areturn
       586: aload_0
       587: iload         21
       589: iload         22
       591: invokevirtual #692                // Method getBlock:(II)Lext/mods/gameserver/geoengine/geodata/ABlock;
       594: astore        25
       596: aload         25
       598: iload         21
       600: iload         22
       602: iload         10
       604: bipush        48
       606: iadd
       607: aconst_null
       608: invokevirtual #696                // Method ext/mods/gameserver/geoengine/geodata/ABlock.getIndexBelow:(IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)I
       611: istore        26
       613: nop
       614: iload         26
       616: ifge          657
       619: aload         7
       621: dup
       622: ifnull        642
       625: getstatic     #1036               // Field java/awt/Color.RED:Ljava/awt/Color;
       628: iload         18
       630: iload         19
       632: iload         10
       634: bipush        15
       636: invokevirtual #981                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addSquare:(Ljava/awt/Color;IIII)V
       639: goto          643
       642: pop
       643: new           #665                // class ext/mods/gameserver/model/location/Location
       646: dup
       647: iload         23
       649: iload         24
       651: iload         10
       653: invokespecial #835                // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       656: areturn
       657: iload         21
       659: istore        8
       661: iload         22
       663: istore        9
       665: aload         25
       667: iload         26
       669: aconst_null
       670: invokevirtual #699                // Method ext/mods/gameserver/geoengine/geodata/ABlock.getHeight:(ILext/mods/gameserver/geoengine/geodata/IGeoObject;)S
       673: istore        10
       675: aload         25
       677: iload         26
       679: aconst_null
       680: invokevirtual #707                // Method ext/mods/gameserver/geoengine/geodata/ABlock.getNswe:(ILext/mods/gameserver/geoengine/geodata/IGeoObject;)B
       683: istore        11
       685: goto          204
       688: iload         10
       690: iload         14
       692: if_icmpne     711
       695: new           #665                // class ext/mods/gameserver/model/location/Location
       698: dup
       699: iload         4
       701: iload         5
       703: iload         14
       705: invokespecial #835                // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       708: goto          721
       711: new           #665                // class ext/mods/gameserver/model/location/Location
       714: dup
       715: iload_1
       716: iload_2
       717: iload_3
       718: invokespecial #835                // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       721: areturn
      StackMapTable: number_of_entries = 25
        frame_type = 255 /* full_frame */
          offset_delta = 88
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine, int, int, int, int, int, int, class ext/mods/gameserver/network/serverpackets/ExServerPrimitive, int, int, int, int, int, int, int ]
          stack = []
        frame_type = 74 /* same_locals_1_stack_item */
          stack = [ double ]
        frame_type = 255 /* full_frame */
          offset_delta = 91
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine, int, int, int, int, int, int, class ext/mods/gameserver/network/serverpackets/ExServerPrimitive, int, int, int, int, int, int, int, double, class ext/mods/gameserver/enums/MoveDirectionType, int, int ]
          stack = [ class ext/mods/gameserver/network/serverpackets/ExServerPrimitive ]
        frame_type = 1 /* same */
        frame_type = 254 /* append */
          offset_delta = 10
          locals = [ int, int, int ]
        frame_type = 13 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 102
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine, int, int, int, int, int, int, class ext/mods/gameserver/network/serverpackets/ExServerPrimitive, int, int, int, int, int, int, int, double, class ext/mods/gameserver/enums/MoveDirectionType, int, int, int, int, int, int, int ]
          stack = [ class ext/mods/gameserver/network/serverpackets/ExServerPrimitive ]
        frame_type = 1 /* same */
        frame_type = 29 /* same */
        frame_type = 247 /* same_locals_1_stack_item_frame_extended */
          offset_delta = 92
          stack = [ class ext/mods/gameserver/network/serverpackets/ExServerPrimitive ]
        frame_type = 1 /* same */
        frame_type = 26 /* same */
        frame_type = 26 /* same */
        frame_type = 86 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/network/serverpackets/ExServerPrimitive ]
        frame_type = 0 /* same */
        frame_type = 13 /* same */
        frame_type = 94 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/network/serverpackets/ExServerPrimitive ]
        frame_type = 0 /* same */
        frame_type = 13 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 55
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine, int, int, int, int, int, int, class ext/mods/gameserver/network/serverpackets/ExServerPrimitive, int, int, int, int, int, int, int, double, class ext/mods/gameserver/enums/MoveDirectionType, int, int, int, int, int, int, int, class ext/mods/gameserver/geoengine/geodata/ABlock, int ]
          stack = [ class ext/mods/gameserver/network/serverpackets/ExServerPrimitive ]
        frame_type = 0 /* same */
        frame_type = 13 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 30
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine, int, int, int, int, int, int, class ext/mods/gameserver/network/serverpackets/ExServerPrimitive, int, int, int, int, int, int, int, double, class ext/mods/gameserver/enums/MoveDirectionType, int, int, int, int, int ]
          stack = []
        frame_type = 22 /* same */
        frame_type = 73 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/location/Location ]
      LineNumberTable:
        line 850: 0
        line 851: 9
        line 852: 18
        line 853: 32
        line 854: 45
        line 855: 55
        line 856: 65
        line 857: 77
        line 858: 78
        line 859: 88
        line 857: 99
        line 861: 101
        line 862: 116
        line 863: 125
        line 864: 134
        line 865: 145
        line 866: 163
        line 867: 187
        line 864: 188
        line 864: 191
        line 868: 193
        line 869: 196
        line 870: 200
        line 871: 204
        line 872: 218
        line 873: 231
        line 874: 248
        line 875: 249
        line 876: 270
        line 877: 281
        line 878: 301
        line 879: 317
        line 876: 318
        line 876: 321
        line 880: 323
        line 881: 333
        line 882: 343
        line 885: 353
        line 886: 363
        line 887: 377
        line 887: 378
        line 887: 393
        line 888: 395
        line 889: 406
        line 890: 426
        line 891: 442
        line 888: 443
        line 888: 446
        line 892: 448
        line 893: 458
        line 894: 468
        line 897: 475
        line 898: 476
        line 899: 502
        line 900: 526
        line 902: 540
        line 903: 548
        line 904: 572
        line 907: 586
        line 908: 596
        line 909: 613
        line 910: 614
        line 911: 619
        line 912: 643
        line 915: 657
        line 916: 661
        line 917: 665
        line 918: 675
        line 920: 688
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          145      43    22 $i$a$-let-GeoEngine$getValidLocation$1   I
          142      46    21    it   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
          281      37    27 $i$a$-let-GeoEngine$getValidLocation$2   I
          278      40    26    it   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
          406      37    27 $i$a$-let-GeoEngine$getValidLocation$3   I
          403      40    26    it   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
          221     464    23 checkX   I
          234     451    24 checkY   I
          596      89    25 block   Lext/mods/gameserver/geoengine/geodata/ABlock;
          613      72    26     i   I
            9     713     8   gox   I
           18     704     9   goy   I
           21     701    10   goz   I
           45     677    11  nswe   B
           55     667    12   gtx   I
           65     657    13   gty   I
           77     645    14   gtz   I
          101     621    15     m   D
          116     606    17   mdt   Lext/mods/gameserver/enums/MoveDirectionType;
          119     603    18 gridX   I
          128     594    19 gridY   I
          196     526    20   dir   B
          200     522    21    nx   I
          204     518    22    ny   I
            0     722     0  this   Lext/mods/gameserver/geoengine/GeoEngine;
            0     722     1    ox   I
            0     722     2    oy   I
            0     722     3    oz   I
            0     722     4    tx   I
            0     722     5    ty   I
            0     722     6    tz   I
            0     722     7 debug   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
    RuntimeInvisibleAnnotations:
      0: #611()
        org.jetbrains.annotations.NotNull
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
      parameter 1:
      parameter 2:
      parameter 3:
      parameter 4:
      parameter 5:
      parameter 6:
        0: #632()
          org.jetbrains.annotations.Nullable

  public final java.util.List<ext.mods.gameserver.model.location.Location> computeLegacyPathRaw(int, int, int, int, int, int, ext.mods.gameserver.network.serverpackets.ExServerPrimitive);
    descriptor: (IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=8, locals=9, args_size=8
         0: new           #1104               // class ext/mods/gameserver/geoengine/pathfinding/PathFinder
         3: dup
         4: invokespecial #1105               // Method ext/mods/gameserver/geoengine/pathfinding/PathFinder."<init>":()V
         7: astore        8
         9: aload         8
        11: iload_1
        12: iload_2
        13: iload_3
        14: iload         4
        16: iload         5
        18: iload         6
        20: aload         7
        22: invokevirtual #1107               // Method ext/mods/gameserver/geoengine/pathfinding/PathFinder.findPath:(IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
        25: checkcast     #866                // class java/util/Collection
        28: invokestatic  #1111               // Method kotlin/collections/CollectionsKt.toMutableList:(Ljava/util/Collection;)Ljava/util/List;
        31: areturn
      LineNumberTable:
        line 928: 0
        line 929: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            9      23     8    pf   Lext/mods/gameserver/geoengine/pathfinding/PathFinder;
            0      32     0  this   Lext/mods/gameserver/geoengine/GeoEngine;
            0      32     1   gox   I
            0      32     2   goy   I
            0      32     3   goz   I
            0      32     4   gtx   I
            0      32     5   gty   I
            0      32     6   gtz   I
            0      32     7 debug   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
    Signature: #1102                        // (IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
    RuntimeInvisibleAnnotations:
      0: #611()
        org.jetbrains.annotations.NotNull
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
      parameter 1:
      parameter 2:
      parameter 3:
      parameter 4:
      parameter 5:
      parameter 6:
        0: #632()
          org.jetbrains.annotations.Nullable

  public final java.util.List<ext.mods.gameserver.model.location.Location> findPath(int, int, int, int, int, int, boolean, ext.mods.gameserver.network.serverpackets.ExServerPrimitive);
    descriptor: (IIIIIIZLext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=10, locals=9, args_size=9
         0: aload_0
         1: iload_1
         2: iload_2
         3: iload_3
         4: iload         4
         6: iload         5
         8: iload         6
        10: iload         7
        12: sipush        500
        15: aload         8
        17: invokevirtual #1117               // Method findPath:(IIIIIIZILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
        20: areturn
      LineNumberTable:
        line 936: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/gameserver/geoengine/GeoEngine;
            0      21     1    ox   I
            0      21     2    oy   I
            0      21     3    oz   I
            0      21     4    tx   I
            0      21     5    ty   I
            0      21     6    tz   I
            0      21     7 playable   Z
            0      21     8 debug   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
    Signature: #1114                        // (IIIIIIZLext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
    RuntimeInvisibleAnnotations:
      0: #611()
        org.jetbrains.annotations.NotNull
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
      parameter 1:
      parameter 2:
      parameter 3:
      parameter 4:
      parameter 5:
      parameter 6:
      parameter 7:
        0: #632()
          org.jetbrains.annotations.Nullable

  public final java.util.List<ext.mods.gameserver.model.location.Location> findPath(int, int, int, int, int, int, boolean, int, ext.mods.gameserver.network.serverpackets.ExServerPrimitive);
    descriptor: (IIIIIIZILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=15, locals=18, args_size=10
         0: nop
         1: iload         4
         3: iload         5
         5: invokestatic  #961                // Method ext/mods/gameserver/model/World.isOutOfWorld:(II)Z
         8: ifeq          17
        11: invokestatic  #1123               // Method kotlin/collections/CollectionsKt.emptyList:()Ljava/util/List;
        14: goto          198
        17: getstatic     #648                // Field Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
        20: iload_1
        21: invokevirtual #654                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoX:(I)I
        24: istore        10
        26: getstatic     #648                // Field Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
        29: iload_2
        30: invokevirtual #657                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoY:(I)I
        33: istore        11
        35: nop
        36: aload_0
        37: iload         10
        39: iload         11
        41: invokevirtual #659                // Method hasGeoPos:(II)Z
        44: ifne          53
        47: invokestatic  #1123               // Method kotlin/collections/CollectionsKt.emptyList:()Ljava/util/List;
        50: goto          198
        53: aload_0
        54: iload         10
        56: iload         11
        58: iload_3
        59: invokevirtual #634                // Method getHeightNearest:(III)S
        62: istore        12
        64: getstatic     #648                // Field Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
        67: iload         4
        69: invokevirtual #654                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoX:(I)I
        72: istore        13
        74: getstatic     #648                // Field Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
        77: iload         5
        79: invokevirtual #657                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoY:(I)I
        82: istore        14
        84: nop
        85: aload_0
        86: iload         13
        88: iload         14
        90: invokevirtual #659                // Method hasGeoPos:(II)Z
        93: ifne          102
        96: invokestatic  #1123               // Method kotlin/collections/CollectionsKt.emptyList:()Ljava/util/List;
        99: goto          198
       102: aload_0
       103: iload         13
       105: iload         14
       107: iload         6
       109: invokevirtual #634                // Method getHeightNearest:(III)S
       112: istore        15
       114: nop
       115: iload         15
       117: iload         6
       119: isub
       120: invokestatic  #704                // Method java/lang/Math.abs:(I)I
       123: iload         8
       125: if_icmple     134
       128: invokestatic  #1123               // Method kotlin/collections/CollectionsKt.emptyList:()Ljava/util/List;
       131: goto          198
       134: iload_1
       135: iload_2
       136: iload_3
       137: iload         4
       139: iload         5
       141: iload         6
       143: iload         7
       145: aload         9
       147: aload_0
       148: iload         10
       150: iload         11
       152: iload         12
       154: iload         13
       156: iload         14
       158: iload         15
       160: invokedynamic #1141,  0           // InvokeDynamic #5:invoke:(IIIIIIZLext/mods/gameserver/network/serverpackets/ExServerPrimitive;Lext/mods/gameserver/geoengine/GeoEngine;IIIIII)Lkotlin/jvm/functions/Function0;
       165: astore        16
       167: getstatic     #1144               // Field ext/mods/Config.USE_PATHFINDING_POOL:Z
       170: ifeq          184
       173: aload         16
       175: invokestatic  #1150               // Method ext/mods/commons/pool/CoroutinePool.runPathfindingBlocking:(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;
       178: checkcast     #876                // class java/util/List
       181: goto          194
       184: aload         16
       186: invokeinterface #1154,  1         // InterfaceMethod kotlin/jvm/functions/Function0.invoke:()Ljava/lang/Object;
       191: checkcast     #876                // class java/util/List
       194: astore        17
       196: aload         17
       198: areturn
      StackMapTable: number_of_entries = 7
        frame_type = 17 /* same */
        frame_type = 253 /* append */
          offset_delta = 35
          locals = [ int, int ]
        frame_type = 254 /* append */
          offset_delta = 48
          locals = [ int, int, int ]
        frame_type = 252 /* append */
          offset_delta = 31
          locals = [ int ]
        frame_type = 252 /* append */
          offset_delta = 49
          locals = [ class kotlin/jvm/functions/Function0 ]
        frame_type = 73 /* same_locals_1_stack_item */
          stack = [ class java/util/List ]
        frame_type = 255 /* full_frame */
          offset_delta = 3
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine, int, int, int, int, int, int, int, int, class ext/mods/gameserver/network/serverpackets/ExServerPrimitive ]
          stack = [ class java/util/List ]
      LineNumberTable:
        line 943: 0
        line 944: 1
        line 946: 17
        line 947: 26
        line 948: 35
        line 949: 36
        line 951: 53
        line 952: 64
        line 953: 74
        line 954: 84
        line 955: 85
        line 957: 102
        line 958: 114
        line 959: 115
        line 959: 123
        line 961: 134
        line 1012: 167
        line 1013: 173
        line 1015: 184
        line 1012: 194
        line 1017: 196
        line 943: 198
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          167      31    16 computePath   Lkotlin/jvm/functions/Function0;
          196       2    17  path   Ljava/util/List;
          114      84    15   gtz   I
           64     134    12   goz   I
           74     124    13   gtx   I
           84     114    14   gty   I
           26     172    10   gox   I
           35     163    11   goy   I
            0     199     0  this   Lext/mods/gameserver/geoengine/GeoEngine;
            0     199     1    ox   I
            0     199     2    oy   I
            0     199     3    oz   I
            0     199     4    tx   I
            0     199     5    ty   I
            0     199     6    tz   I
            0     199     7 playable   Z
            0     199     8 nearestZLimit   I
            0     199     9 debug   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
    Signature: #1119                        // (IIIIIIZILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
    RuntimeInvisibleAnnotations:
      0: #611()
        org.jetbrains.annotations.NotNull
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
      parameter 1:
      parameter 2:
      parameter 3:
      parameter 4:
      parameter 5:
      parameter 6:
      parameter 7:
      parameter 8:
        0: #632()
          org.jetbrains.annotations.Nullable

  public final ext.mods.gameserver.model.location.Location getValidSwimLocation(int, int, int, int, int, int, ext.mods.gameserver.network.serverpackets.ExServerPrimitive);
    descriptor: (IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Lext/mods/gameserver/model/location/Location;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=8, locals=35, args_size=8
         0: nop
         1: iload         4
         3: iload         5
         5: invokestatic  #961                // Method ext/mods/gameserver/model/World.isOutOfWorld:(II)Z
         8: ifeq          24
        11: new           #665                // class ext/mods/gameserver/model/location/Location
        14: dup
        15: iload_1
        16: iload_2
        17: iload_3
        18: invokespecial #835                // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
        21: goto          928
        24: getstatic     #648                // Field Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
        27: iload_1
        28: invokevirtual #654                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoX:(I)I
        31: istore        8
        33: getstatic     #648                // Field Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
        36: iload_2
        37: invokevirtual #657                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoY:(I)I
        40: istore        9
        42: aload_0
        43: iload         8
        45: iload         9
        47: invokevirtual #692                // Method getBlock:(II)Lext/mods/gameserver/geoengine/geodata/ABlock;
        50: astore        10
        52: aload         10
        54: iload         8
        56: iload         9
        58: iload_3
        59: bipush        8
        61: iadd
        62: aconst_null
        63: invokevirtual #696                // Method ext/mods/gameserver/geoengine/geodata/ABlock.getIndexBelow:(IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)I
        66: istore        11
        68: nop
        69: iload         8
        71: getstatic     #648                // Field Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
        74: iload         4
        76: invokevirtual #654                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoX:(I)I
        79: if_icmpne     145
        82: iload         9
        84: getstatic     #648                // Field Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
        87: iload         5
        89: invokevirtual #657                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoY:(I)I
        92: if_icmpne     145
        95: nop
        96: iload         11
        98: aload         10
       100: iload         8
       102: iload         9
       104: iload         6
       106: bipush        8
       108: iadd
       109: aconst_null
       110: invokevirtual #696                // Method ext/mods/gameserver/geoengine/geodata/ABlock.getIndexBelow:(IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)I
       113: if_icmpne     132
       116: new           #665                // class ext/mods/gameserver/model/location/Location
       119: dup
       120: iload         4
       122: iload         5
       124: iload         6
       126: invokespecial #835                // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       129: goto          928
       132: new           #665                // class ext/mods/gameserver/model/location/Location
       135: dup
       136: iload_1
       137: iload_2
       138: iload_3
       139: invokespecial #835                // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       142: goto          928
       145: iconst_0
       146: istore        12
       148: aload         10
       150: iload         11
       152: aconst_null
       153: invokevirtual #699                // Method ext/mods/gameserver/geoengine/geodata/ABlock.getHeight:(ILext/mods/gameserver/geoengine/geodata/IGeoObject;)S
       156: istore        12
       158: aload         10
       160: iload         11
       162: aconst_null
       163: invokevirtual #707                // Method ext/mods/gameserver/geoengine/geodata/ABlock.getNswe:(ILext/mods/gameserver/geoengine/geodata/IGeoObject;)B
       166: istore        13
       168: iload         4
       170: iload_1
       171: isub
       172: istore        14
       174: iload         5
       176: iload_2
       177: isub
       178: istore        15
       180: iload         6
       182: iload_3
       183: isub
       184: istore        16
       186: nop
       187: iload         4
       189: iload_1
       190: if_icmpne     197
       193: dconst_0
       194: goto          204
       197: iload         15
       199: i2d
       200: iload         14
       202: i2d
       203: ddiv
       204: dstore        17
       206: iload         16
       208: i2d
       209: iload         14
       211: iload         14
       213: imul
       214: iload         15
       216: iload         15
       218: imul
       219: iadd
       220: i2d
       221: invokestatic  #965                // Method java/lang/Math.sqrt:(D)D
       224: ddiv
       225: dstore        19
       227: getstatic     #648                // Field Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
       230: iload         4
       232: invokevirtual #654                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoX:(I)I
       235: istore        21
       237: getstatic     #648                // Field Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
       240: iload         5
       242: invokevirtual #657                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoY:(I)I
       245: istore        22
       247: iload         21
       249: iload         8
       251: isub
       252: iload         22
       254: iload         9
       256: isub
       257: invokestatic  #971                // Method ext/mods/gameserver/enums/MoveDirectionType.getDirection:(II)Lext/mods/gameserver/enums/MoveDirectionType;
       260: astore        23
       262: iconst_0
       263: istore        24
       265: iload_1
       266: bipush        -16
       268: iand
       269: istore        24
       271: iconst_0
       272: istore        25
       274: iload_2
       275: bipush        -16
       277: iand
       278: istore        25
       280: aload         7
       282: dup
       283: ifnull        339
       286: astore        27
       288: iconst_0
       289: istore        28
       291: aload         27
       293: getstatic     #977                // Field java/awt/Color.BLUE:Ljava/awt/Color;
       296: iload         24
       298: iload         25
       300: iload         12
       302: bipush        32
       304: isub
       305: bipush        15
       307: invokevirtual #981                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addSquare:(Ljava/awt/Color;IIII)V
       310: aload         27
       312: getstatic     #977                // Field java/awt/Color.BLUE:Ljava/awt/Color;
       315: iload         4
       317: bipush        -16
       319: iand
       320: iload         5
       322: bipush        -16
       324: iand
       325: iload         6
       327: bipush        32
       329: isub
       330: bipush        15
       332: invokevirtual #981                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addSquare:(Ljava/awt/Color;IIII)V
       335: nop
       336: goto          341
       339: pop
       340: nop
       341: iload         8
       343: iload         21
       345: if_icmpne     355
       348: iload         9
       350: iload         22
       352: if_icmpeq     915
       355: iconst_0
       356: istore        26
       358: iconst_0
       359: istore        27
       361: iload         24
       363: aload         23
       365: invokevirtual #984                // Method ext/mods/gameserver/enums/MoveDirectionType.getOffsetX:()I
       368: iadd
       369: istore        27
       371: iconst_0
       372: istore        28
       374: iload_2
       375: i2d
       376: dload         17
       378: iload         27
       380: iload_1
       381: isub
       382: i2d
       383: dmul
       384: dadd
       385: d2i
       386: istore        28
       388: nop
       389: aload         23
       391: invokevirtual #987                // Method ext/mods/gameserver/enums/MoveDirectionType.getStepX:()I
       394: ifeq          493
       397: getstatic     #648                // Field Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
       400: iload         28
       402: invokevirtual #657                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoY:(I)I
       405: iload         9
       407: if_icmpne     493
       410: aload         7
       412: dup
       413: ifnull        461
       416: astore        30
       418: iconst_0
       419: istore        31
       421: aload         30
       423: aload         23
       425: invokevirtual #990                // Method ext/mods/gameserver/enums/MoveDirectionType.getSymbolX:()Ljava/lang/String;
       428: getstatic     #993                // Field java/awt/Color.CYAN:Ljava/awt/Color;
       431: iconst_1
       432: iload         27
       434: iload         28
       436: iload         12
       438: invokevirtual #997                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addPoint:(Ljava/lang/String;Ljava/awt/Color;ZIII)V
       441: aload         30
       443: getstatic     #1000               // Field java/awt/Color.GREEN:Ljava/awt/Color;
       446: iload         24
       448: iload         25
       450: iload         12
       452: bipush        15
       454: invokevirtual #981                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addSquare:(Ljava/awt/Color;IIII)V
       457: nop
       458: goto          463
       461: pop
       462: nop
       463: iload         24
       465: aload         23
       467: invokevirtual #987                // Method ext/mods/gameserver/enums/MoveDirectionType.getStepX:()I
       470: iadd
       471: istore        24
       473: iload         8
       475: aload         23
       477: invokevirtual #1003               // Method ext/mods/gameserver/enums/MoveDirectionType.getSignumX:()I
       480: iadd
       481: istore        8
       483: aload         23
       485: invokevirtual #1006               // Method ext/mods/gameserver/enums/MoveDirectionType.getDirectionX:()B
       488: istore        26
       490: goto          615
       493: iload         25
       495: aload         23
       497: invokevirtual #1009               // Method ext/mods/gameserver/enums/MoveDirectionType.getOffsetY:()I
       500: iadd
       501: istore        28
       503: iload_1
       504: i2d
       505: iload         28
       507: iload_2
       508: isub
       509: i2d
       510: dload         17
       512: ddiv
       513: dadd
       514: d2i
       515: istore        27
       517: nop
       518: iload         24
       520: iload         24
       522: bipush        15
       524: iadd
       525: iload         27
       527: invokestatic  #1012               // Method java/lang/Math.min:(II)I
       530: invokestatic  #798                // Method java/lang/Math.max:(II)I
       533: istore        27
       535: aload         7
       537: dup
       538: ifnull        586
       541: astore        30
       543: iconst_0
       544: istore        31
       546: aload         30
       548: aload         23
       550: invokevirtual #1015               // Method ext/mods/gameserver/enums/MoveDirectionType.getSymbolY:()Ljava/lang/String;
       553: getstatic     #1018               // Field java/awt/Color.YELLOW:Ljava/awt/Color;
       556: iconst_1
       557: iload         27
       559: iload         28
       561: iload         12
       563: invokevirtual #997                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addPoint:(Ljava/lang/String;Ljava/awt/Color;ZIII)V
       566: aload         30
       568: getstatic     #1000               // Field java/awt/Color.GREEN:Ljava/awt/Color;
       571: iload         24
       573: iload         25
       575: iload         12
       577: bipush        15
       579: invokevirtual #981                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addSquare:(Ljava/awt/Color;IIII)V
       582: nop
       583: goto          588
       586: pop
       587: nop
       588: iload         25
       590: aload         23
       592: invokevirtual #1021               // Method ext/mods/gameserver/enums/MoveDirectionType.getStepY:()I
       595: iadd
       596: istore        25
       598: iload         9
       600: aload         23
       602: invokevirtual #1024               // Method ext/mods/gameserver/enums/MoveDirectionType.getSignumY:()I
       605: iadd
       606: istore        9
       608: aload         23
       610: invokevirtual #1027               // Method ext/mods/gameserver/enums/MoveDirectionType.getDirectionY:()B
       613: istore        26
       615: aload_0
       616: iload         8
       618: iload         9
       620: invokevirtual #692                // Method getBlock:(II)Lext/mods/gameserver/geoengine/geodata/ABlock;
       623: astore        10
       625: iload_3
       626: i2d
       627: dload         19
       629: iload         27
       631: iload_1
       632: isub
       633: iload         27
       635: iload_1
       636: isub
       637: imul
       638: iload         28
       640: iload_2
       641: isub
       642: iload         28
       644: iload_2
       645: isub
       646: imul
       647: iadd
       648: i2d
       649: invokestatic  #965                // Method java/lang/Math.sqrt:(D)D
       652: dmul
       653: dadd
       654: dstore        29
       656: iload         13
       658: iload         26
       660: iand
       661: ifeq          668
       664: iconst_1
       665: goto          669
       668: iconst_0
       669: istore        31
       671: nop
       672: iload         31
       674: ifeq          695
       677: aload         10
       679: iload         8
       681: iload         9
       683: iload         12
       685: bipush        48
       687: iadd
       688: aconst_null
       689: invokevirtual #696                // Method ext/mods/gameserver/geoengine/geodata/ABlock.getIndexBelow:(IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)I
       692: goto          710
       695: aload         10
       697: iload         8
       699: iload         9
       701: iload         12
       703: bipush        16
       705: isub
       706: aconst_null
       707: invokevirtual #1033               // Method ext/mods/gameserver/geoengine/geodata/ABlock.getIndexAbove:(IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)I
       710: istore        11
       712: nop
       713: iload         11
       715: ifge          758
       718: aload         7
       720: dup
       721: ifnull        742
       724: getstatic     #1036               // Field java/awt/Color.RED:Ljava/awt/Color;
       727: iload         24
       729: iload         25
       731: dload         29
       733: d2i
       734: bipush        15
       736: invokevirtual #981                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addSquare:(Ljava/awt/Color;IIII)V
       739: goto          743
       742: pop
       743: new           #665                // class ext/mods/gameserver/model/location/Location
       746: dup
       747: iload         24
       749: iload         25
       751: dload         29
       753: d2i
       754: invokespecial #835                // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       757: areturn
       758: aload         10
       760: iload         11
       762: aconst_null
       763: invokevirtual #699                // Method ext/mods/gameserver/geoengine/geodata/ABlock.getHeight:(ILext/mods/gameserver/geoengine/geodata/IGeoObject;)S
       766: istore        32
       768: nop
       769: iload         31
       771: ifeq          800
       774: iload         32
       776: i2d
       777: dload         29
       779: dcmpl
       780: iflt          800
       783: iload         32
       785: istore        12
       787: aload         10
       789: iload         11
       791: aconst_null
       792: invokevirtual #707                // Method ext/mods/gameserver/geoengine/geodata/ABlock.getNswe:(ILext/mods/gameserver/geoengine/geodata/IGeoObject;)B
       795: istore        13
       797: goto          877
       800: iload         31
       802: ifne          877
       805: iload         32
       807: i2d
       808: dload         29
       810: dcmpl
       811: ifle          877
       814: aload         7
       816: dup
       817: ifnull        860
       820: astore        33
       822: iconst_0
       823: istore        34
       825: aload         33
       827: getstatic     #1036               // Field java/awt/Color.RED:Ljava/awt/Color;
       830: iload         27
       832: iload         28
       834: dload         29
       836: d2i
       837: invokevirtual #1039               // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addPoint:(Ljava/awt/Color;III)V
       840: aload         33
       842: getstatic     #1036               // Field java/awt/Color.RED:Ljava/awt/Color;
       845: iload         24
       847: iload         25
       849: iload         32
       851: bipush        15
       853: invokevirtual #981                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addSquare:(Ljava/awt/Color;IIII)V
       856: nop
       857: goto          862
       860: pop
       861: nop
       862: new           #665                // class ext/mods/gameserver/model/location/Location
       865: dup
       866: iload         27
       868: iload         28
       870: dload         29
       872: d2i
       873: invokespecial #835                // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       876: areturn
       877: aload         10
       879: iload         8
       881: iload         9
       883: dload         29
       885: d2i
       886: aconst_null
       887: invokevirtual #696                // Method ext/mods/gameserver/geoengine/geodata/ABlock.getIndexBelow:(IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)I
       890: istore        11
       892: aload         10
       894: iload         11
       896: aconst_null
       897: invokevirtual #699                // Method ext/mods/gameserver/geoengine/geodata/ABlock.getHeight:(ILext/mods/gameserver/geoengine/geodata/IGeoObject;)S
       900: istore        12
       902: aload         10
       904: iload         11
       906: aconst_null
       907: invokevirtual #707                // Method ext/mods/gameserver/geoengine/geodata/ABlock.getNswe:(ILext/mods/gameserver/geoengine/geodata/IGeoObject;)B
       910: istore        13
       912: goto          341
       915: new           #665                // class ext/mods/gameserver/model/location/Location
       918: dup
       919: iload         4
       921: iload         5
       923: iload         6
       925: invokespecial #835                // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       928: areturn
      StackMapTable: number_of_entries = 27
        frame_type = 24 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 107
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine, int, int, int, int, int, int, class ext/mods/gameserver/network/serverpackets/ExServerPrimitive, int, int, class ext/mods/gameserver/geoengine/geodata/ABlock, int ]
          stack = []
        frame_type = 12 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 51
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine, int, int, int, int, int, int, class ext/mods/gameserver/network/serverpackets/ExServerPrimitive, int, int, class ext/mods/gameserver/geoengine/geodata/ABlock, int, int, int, int, int, int ]
          stack = []
        frame_type = 70 /* same_locals_1_stack_item */
          stack = [ double ]
        frame_type = 255 /* full_frame */
          offset_delta = 134
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine, int, int, int, int, int, int, class ext/mods/gameserver/network/serverpackets/ExServerPrimitive, int, int, class ext/mods/gameserver/geoengine/geodata/ABlock, int, int, int, int, int, int, double, double, int, int, class ext/mods/gameserver/enums/MoveDirectionType, int, int ]
          stack = [ class ext/mods/gameserver/network/serverpackets/ExServerPrimitive ]
        frame_type = 1 /* same */
        frame_type = 13 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 105
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine, int, int, int, int, int, int, class ext/mods/gameserver/network/serverpackets/ExServerPrimitive, int, int, class ext/mods/gameserver/geoengine/geodata/ABlock, int, int, int, int, int, int, double, double, int, int, class ext/mods/gameserver/enums/MoveDirectionType, int, int, int, int, int ]
          stack = [ class ext/mods/gameserver/network/serverpackets/ExServerPrimitive ]
        frame_type = 1 /* same */
        frame_type = 29 /* same */
        frame_type = 247 /* same_locals_1_stack_item_frame_extended */
          offset_delta = 92
          stack = [ class ext/mods/gameserver/network/serverpackets/ExServerPrimitive ]
        frame_type = 1 /* same */
        frame_type = 26 /* same */
        frame_type = 252 /* append */
          offset_delta = 52
          locals = [ double ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 25
          locals = [ int ]
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 95 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/network/serverpackets/ExServerPrimitive ]
        frame_type = 0 /* same */
        frame_type = 14 /* same */
        frame_type = 252 /* append */
          offset_delta = 41
          locals = [ int ]
        frame_type = 123 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/network/serverpackets/ExServerPrimitive ]
        frame_type = 1 /* same */
        frame_type = 14 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 37
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine, int, int, int, int, int, int, class ext/mods/gameserver/network/serverpackets/ExServerPrimitive, int, int, class ext/mods/gameserver/geoengine/geodata/ABlock, int, int, int, int, int, int, double, double, int, int, class ext/mods/gameserver/enums/MoveDirectionType, int, int ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 12
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine, int, int, int, int, int, int, class ext/mods/gameserver/network/serverpackets/ExServerPrimitive ]
          stack = [ class ext/mods/gameserver/model/location/Location ]
      LineNumberTable:
        line 1029: 0
        line 1030: 1
        line 1032: 24
        line 1033: 33
        line 1034: 42
        line 1035: 52
        line 1037: 68
        line 1038: 69
        line 1039: 95
        line 1040: 96
        line 1041: 132
        line 1045: 145
        line 1046: 158
        line 1047: 168
        line 1048: 174
        line 1049: 180
        line 1050: 186
        line 1051: 187
        line 1052: 197
        line 1050: 204
        line 1054: 206
        line 1054: 224
        line 1055: 227
        line 1056: 237
        line 1057: 247
        line 1059: 262
        line 1060: 271
        line 1062: 280
        line 1063: 291
        line 1064: 310
        line 1065: 335
        line 1062: 336
        line 1062: 339
        line 1067: 341
        line 1068: 355
        line 1069: 358
        line 1070: 371
        line 1071: 388
        line 1072: 389
        line 1073: 410
        line 1074: 421
        line 1075: 441
        line 1076: 457
        line 1073: 458
        line 1073: 461
        line 1077: 463
        line 1078: 473
        line 1079: 483
        line 1082: 493
        line 1083: 503
        line 1084: 517
        line 1084: 518
        line 1084: 533
        line 1085: 535
        line 1086: 546
        line 1087: 566
        line 1088: 582
        line 1085: 583
        line 1085: 586
        line 1089: 588
        line 1090: 598
        line 1091: 608
        line 1095: 615
        line 1096: 625
        line 1096: 652
        line 1097: 656
        line 1099: 671
        line 1100: 672
        line 1101: 695
        line 1099: 710
        line 1104: 712
        line 1105: 713
        line 1106: 718
        line 1107: 743
        line 1111: 758
        line 1113: 768
        line 1114: 769
        line 1115: 783
        line 1116: 787
        line 1118: 800
        line 1119: 814
        line 1120: 825
        line 1121: 840
        line 1122: 856
        line 1119: 857
        line 1119: 860
        line 1123: 862
        line 1127: 877
        line 1128: 892
        line 1129: 902
        line 1132: 915
        line 1029: 928
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          291      45    28 $i$a$-let-GeoEngine$getValidSwimLocation$1   I
          288      48    27    it   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
          421      37    31 $i$a$-let-GeoEngine$getValidSwimLocation$2   I
          418      40    30    it   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
          546      37    31 $i$a$-let-GeoEngine$getValidSwimLocation$3   I
          543      40    30    it   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
          825      32    34 $i$a$-let-GeoEngine$getValidSwimLocation$4   I
          822      35    33    it   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
          358     554    26   dir   B
          361     551    27 checkX   I
          374     538    28 checkY   I
          656     256    29 swimZ   D
          671     241    31 canMove   Z
          768     144    32     z   I
          148     780    12 groundZ   I
          168     760    13  nswe   B
          174     754    14    dx   I
          180     748    15    dy   I
          186     742    16    dz   I
          206     722    17     m   D
          227     701    19    mz   D
          237     691    21   gtx   I
          247     681    22   gty   I
          262     666    23   mdt   Lext/mods/gameserver/enums/MoveDirectionType;
          265     663    24 gridX   I
          274     654    25 gridY   I
           33     895     8   gox   I
           42     886     9   goy   I
           52     876    10 block   Lext/mods/gameserver/geoengine/geodata/ABlock;
           68     860    11 index   I
            0     929     0  this   Lext/mods/gameserver/geoengine/GeoEngine;
            0     929     1    ox   I
            0     929     2    oy   I
            0     929     3    oz   I
            0     929     4    tx   I
            0     929     5    ty   I
            0     929     6    tz   I
            0     929     7 debug   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
    RuntimeInvisibleAnnotations:
      0: #611()
        org.jetbrains.annotations.NotNull
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
      parameter 1:
      parameter 2:
      parameter 3:
      parameter 4:
      parameter 5:
      parameter 6:
        0: #632()
          org.jetbrains.annotations.Nullable

  public final boolean canFlyToTarget(ext.mods.gameserver.model.WorldObject, double, ext.mods.gameserver.model.WorldObject);
    descriptor: (Lext/mods/gameserver/model/WorldObject;DLext/mods/gameserver/model/WorldObject;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=5, locals=5, args_size=4
         0: aload_0
         1: aload_1
         2: invokevirtual #1064               // Method ext/mods/gameserver/model/WorldObject.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
         5: checkcast     #665                // class ext/mods/gameserver/model/location/Location
         8: dload_2
         9: aload         4
        11: invokevirtual #1064               // Method ext/mods/gameserver/model/WorldObject.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
        14: checkcast     #665                // class ext/mods/gameserver/model/location/Location
        17: invokevirtual #1169               // Method canFlyToTarget:(Lext/mods/gameserver/model/location/Location;DLext/mods/gameserver/model/location/Location;)Z
        20: ireturn
      LineNumberTable:
        line 1139: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/gameserver/geoengine/GeoEngine;
            0      21     1   obj   Lext/mods/gameserver/model/WorldObject;
            0      21     2 oheight   D
            0      21     4 target   Lext/mods/gameserver/model/WorldObject;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #611()
          org.jetbrains.annotations.NotNull
      parameter 1:
      parameter 2:
        0: #611()
          org.jetbrains.annotations.NotNull

  public final boolean canFlyToTarget(ext.mods.gameserver.model.WorldObject, double, ext.mods.gameserver.model.location.Location);
    descriptor: (Lext/mods/gameserver/model/WorldObject;DLext/mods/gameserver/model/location/Location;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=5, locals=5, args_size=4
         0: aload_0
         1: aload_1
         2: invokevirtual #1064               // Method ext/mods/gameserver/model/WorldObject.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
         5: checkcast     #665                // class ext/mods/gameserver/model/location/Location
         8: dload_2
         9: aload         4
        11: invokevirtual #1169               // Method canFlyToTarget:(Lext/mods/gameserver/model/location/Location;DLext/mods/gameserver/model/location/Location;)Z
        14: ireturn
      LineNumberTable:
        line 1141: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/geoengine/GeoEngine;
            0      15     1   obj   Lext/mods/gameserver/model/WorldObject;
            0      15     2 oheight   D
            0      15     4 position   Lext/mods/gameserver/model/location/Location;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #611()
          org.jetbrains.annotations.NotNull
      parameter 1:
      parameter 2:
        0: #611()
          org.jetbrains.annotations.NotNull

  public final boolean canFlyToTarget(ext.mods.gameserver.model.location.Location, double, ext.mods.gameserver.model.location.Location);
    descriptor: (Lext/mods/gameserver/model/location/Location;DLext/mods/gameserver/model/location/Location;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=9, locals=5, args_size=4
         0: aload_0
         1: aload_1
         2: invokevirtual #668                // Method ext/mods/gameserver/model/location/Location.getX:()I
         5: aload_1
         6: invokevirtual #671                // Method ext/mods/gameserver/model/location/Location.getY:()I
         9: aload_1
        10: invokevirtual #674                // Method ext/mods/gameserver/model/location/Location.getZ:()I
        13: dload_2
        14: aload         4
        16: invokevirtual #668                // Method ext/mods/gameserver/model/location/Location.getX:()I
        19: aload         4
        21: invokevirtual #671                // Method ext/mods/gameserver/model/location/Location.getY:()I
        24: aload         4
        26: invokevirtual #674                // Method ext/mods/gameserver/model/location/Location.getZ:()I
        29: invokevirtual #1173               // Method canFlyToTarget:(IIIDIII)Z
        32: ireturn
      LineNumberTable:
        line 1143: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      33     0  this   Lext/mods/gameserver/geoengine/GeoEngine;
            0      33     1 origin   Lext/mods/gameserver/model/location/Location;
            0      33     2 oheight   D
            0      33     4 target   Lext/mods/gameserver/model/location/Location;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #611()
          org.jetbrains.annotations.NotNull
      parameter 1:
      parameter 2:
        0: #611()
          org.jetbrains.annotations.NotNull

  public final boolean canFlyToTarget(int, int, int, double, int, int, int);
    descriptor: (IIIDIII)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=10, locals=9, args_size=8
         0: aload_0
         1: iload_1
         2: iload_2
         3: iload_3
         4: dload         4
         6: iload         6
         8: iload         7
        10: iload         8
        12: aconst_null
        13: invokevirtual #1177               // Method canFly:(IIIDIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
        16: ireturn
      LineNumberTable:
        line 1145: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/geoengine/GeoEngine;
            0      17     1    ox   I
            0      17     2    oy   I
            0      17     3    oz   I
            0      17     4 oheight   D
            0      17     6    tx   I
            0      17     7    ty   I
            0      17     8    tz   I

  public final boolean canFly(int, int, int, double, int, int, int, ext.mods.gameserver.network.serverpackets.ExServerPrimitive);
    descriptor: (IIIDIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=7, locals=27, args_size=9
         0: iload         6
         2: iload         7
         4: invokestatic  #961                // Method ext/mods/gameserver/model/World.isOutOfWorld:(II)Z
         7: ifeq          12
        10: iconst_0
        11: ireturn
        12: getstatic     #648                // Field Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
        15: iload_1
        16: invokevirtual #654                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoX:(I)I
        19: istore        10
        21: getstatic     #648                // Field Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
        24: iload_2
        25: invokevirtual #657                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoY:(I)I
        28: istore        11
        30: getstatic     #648                // Field Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
        33: iload         6
        35: invokevirtual #654                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoX:(I)I
        38: istore        12
        40: getstatic     #648                // Field Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
        43: iload         7
        45: invokevirtual #657                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoY:(I)I
        48: istore        13
        50: aload_0
        51: iload         10
        53: iload         11
        55: iload_3
        56: invokevirtual #634                // Method getHeightNearest:(III)S
        59: istore        14
        61: iload         6
        63: iload_1
        64: if_icmpne     71
        67: dconst_0
        68: goto          82
        71: iload         7
        73: iload_2
        74: isub
        75: i2d
        76: iload         6
        78: iload_1
        79: isub
        80: i2d
        81: ddiv
        82: dstore        15
        84: iload         8
        86: iload_3
        87: isub
        88: i2d
        89: iload         6
        91: iload_1
        92: isub
        93: iload         6
        95: iload_1
        96: isub
        97: imul
        98: iload         7
       100: iload_2
       101: isub
       102: iload         7
       104: iload_2
       105: isub
       106: imul
       107: iadd
       108: i2d
       109: invokestatic  #965                // Method java/lang/Math.sqrt:(D)D
       112: ddiv
       113: dstore        17
       115: iload         12
       117: iload         10
       119: isub
       120: iload         13
       122: iload         11
       124: isub
       125: invokestatic  #971                // Method ext/mods/gameserver/enums/MoveDirectionType.getDirection:(II)Lext/mods/gameserver/enums/MoveDirectionType;
       128: astore        19
       130: iload_1
       131: bipush        -16
       133: iand
       134: istore        20
       136: iload_2
       137: bipush        -16
       139: iand
       140: istore        21
       142: aload         9
       144: ifnull        191
       147: aload         9
       149: getstatic     #977                // Field java/awt/Color.BLUE:Ljava/awt/Color;
       152: iload         20
       154: iload         21
       156: iload         14
       158: bipush        32
       160: isub
       161: bipush        15
       163: invokevirtual #981                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addSquare:(Ljava/awt/Color;IIII)V
       166: aload         9
       168: getstatic     #977                // Field java/awt/Color.BLUE:Ljava/awt/Color;
       171: iload         6
       173: bipush        -16
       175: iand
       176: iload         7
       178: bipush        -16
       180: iand
       181: iload         8
       183: bipush        32
       185: isub
       186: bipush        15
       188: invokevirtual #981                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addSquare:(Ljava/awt/Color;IIII)V
       191: iload         10
       193: iload         12
       195: if_icmpne     205
       198: iload         11
       200: iload         13
       202: if_icmpeq     564
       205: iload         20
       207: aload         19
       209: invokevirtual #984                // Method ext/mods/gameserver/enums/MoveDirectionType.getOffsetX:()I
       212: iadd
       213: istore        22
       215: iload_2
       216: i2d
       217: dload         15
       219: iload         22
       221: iload_1
       222: isub
       223: i2d
       224: dmul
       225: dadd
       226: d2i
       227: istore        23
       229: aload         19
       231: invokevirtual #987                // Method ext/mods/gameserver/enums/MoveDirectionType.getStepX:()I
       234: ifeq          273
       237: getstatic     #648                // Field Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
       240: iload         23
       242: invokevirtual #657                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoY:(I)I
       245: iload         11
       247: if_icmpne     273
       250: iload         20
       252: aload         19
       254: invokevirtual #987                // Method ext/mods/gameserver/enums/MoveDirectionType.getStepX:()I
       257: iadd
       258: istore        20
       260: iload         10
       262: aload         19
       264: invokevirtual #1003               // Method ext/mods/gameserver/enums/MoveDirectionType.getSignumX:()I
       267: iadd
       268: istore        10
       270: goto          334
       273: iload         21
       275: aload         19
       277: invokevirtual #1009               // Method ext/mods/gameserver/enums/MoveDirectionType.getOffsetY:()I
       280: iadd
       281: istore        23
       283: iload_1
       284: i2d
       285: iload         23
       287: iload_2
       288: isub
       289: i2d
       290: dload         15
       292: ddiv
       293: dadd
       294: d2i
       295: istore        22
       297: iload         20
       299: iload         20
       301: bipush        15
       303: iadd
       304: iload         22
       306: invokestatic  #1012               // Method java/lang/Math.min:(II)I
       309: invokestatic  #798                // Method java/lang/Math.max:(II)I
       312: istore        22
       314: iload         21
       316: aload         19
       318: invokevirtual #1021               // Method ext/mods/gameserver/enums/MoveDirectionType.getStepY:()I
       321: iadd
       322: istore        21
       324: iload         11
       326: aload         19
       328: invokevirtual #1024               // Method ext/mods/gameserver/enums/MoveDirectionType.getSignumY:()I
       331: iadd
       332: istore        11
       334: aload_0
       335: iload         10
       337: iload         11
       339: invokevirtual #692                // Method getBlock:(II)Lext/mods/gameserver/geoengine/geodata/ABlock;
       342: astore        24
       344: iload_3
       345: dload         17
       347: iload         22
       349: iload_1
       350: isub
       351: iload         22
       353: iload_1
       354: isub
       355: imul
       356: iload         23
       358: iload_2
       359: isub
       360: iload         23
       362: iload_2
       363: isub
       364: imul
       365: iadd
       366: i2d
       367: invokestatic  #965                // Method java/lang/Math.sqrt:(D)D
       370: dmul
       371: d2i
       372: iadd
       373: istore        25
       375: aload         24
       377: iload         10
       379: iload         11
       381: iload         25
       383: dload         4
       385: d2i
       386: iadd
       387: aconst_null
       388: invokevirtual #696                // Method ext/mods/gameserver/geoengine/geodata/ABlock.getIndexBelow:(IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)I
       391: istore        26
       393: iload         26
       395: ifge          424
       398: aload         9
       400: ifnull        422
       403: aload         9
       405: getstatic     #1036               // Field java/awt/Color.RED:Ljava/awt/Color;
       408: iload         20
       410: iload         21
       412: iload         25
       414: bipush        32
       416: isub
       417: bipush        15
       419: invokevirtual #981                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addSquare:(Ljava/awt/Color;IIII)V
       422: iconst_0
       423: ireturn
       424: aload         24
       426: iload         26
       428: aconst_null
       429: invokevirtual #699                // Method ext/mods/gameserver/geoengine/geodata/ABlock.getHeight:(ILext/mods/gameserver/geoengine/geodata/IGeoObject;)S
       432: istore        14
       434: iload         14
       436: iload         25
       438: if_icmple     467
       441: aload         9
       443: ifnull        465
       446: aload         9
       448: getstatic     #1036               // Field java/awt/Color.RED:Ljava/awt/Color;
       451: iload         20
       453: iload         21
       455: iload         25
       457: bipush        32
       459: isub
       460: bipush        15
       462: invokevirtual #981                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addSquare:(Ljava/awt/Color;IIII)V
       465: iconst_0
       466: ireturn
       467: aload         24
       469: iload         10
       471: iload         11
       473: iload         25
       475: aconst_null
       476: invokevirtual #1033               // Method ext/mods/gameserver/geoengine/geodata/ABlock.getIndexAbove:(IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)I
       479: istore        26
       481: iload         25
       483: dload         4
       485: d2i
       486: iadd
       487: istore        25
       489: iload         26
       491: iflt          537
       494: aload         24
       496: iload         26
       498: aconst_null
       499: invokevirtual #699                // Method ext/mods/gameserver/geoengine/geodata/ABlock.getHeight:(ILext/mods/gameserver/geoengine/geodata/IGeoObject;)S
       502: istore        14
       504: iload         14
       506: iload         25
       508: if_icmpge     537
       511: aload         9
       513: ifnull        535
       516: aload         9
       518: getstatic     #1036               // Field java/awt/Color.RED:Ljava/awt/Color;
       521: iload         20
       523: iload         21
       525: iload         25
       527: bipush        32
       529: isub
       530: bipush        15
       532: invokevirtual #981                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addSquare:(Ljava/awt/Color;IIII)V
       535: iconst_0
       536: ireturn
       537: aload         9
       539: ifnull        191
       542: aload         9
       544: getstatic     #1000               // Field java/awt/Color.GREEN:Ljava/awt/Color;
       547: iload         20
       549: iload         21
       551: iload         25
       553: bipush        32
       555: isub
       556: bipush        15
       558: invokevirtual #981                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addSquare:(Ljava/awt/Color;IIII)V
       561: goto          191
       564: iconst_1
       565: ireturn
      StackMapTable: number_of_entries = 14
        frame_type = 12 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 58
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine, int, int, int, double, int, int, int, class ext/mods/gameserver/network/serverpackets/ExServerPrimitive, int, int, int, int, int ]
          stack = []
        frame_type = 74 /* same_locals_1_stack_item */
          stack = [ double ]
        frame_type = 255 /* full_frame */
          offset_delta = 108
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine, int, int, int, double, int, int, int, class ext/mods/gameserver/network/serverpackets/ExServerPrimitive, int, int, int, int, int, double, double, class ext/mods/gameserver/enums/MoveDirectionType, int, int ]
          stack = []
        frame_type = 13 /* same */
        frame_type = 253 /* append */
          offset_delta = 67
          locals = [ int, int ]
        frame_type = 60 /* same */
        frame_type = 254 /* append */
          offset_delta = 87
          locals = [ class ext/mods/gameserver/geoengine/geodata/ABlock, int, int ]
        frame_type = 1 /* same */
        frame_type = 40 /* same */
        frame_type = 1 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 67
        frame_type = 1 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 26
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine, int, int, int, double, int, int, int, class ext/mods/gameserver/network/serverpackets/ExServerPrimitive, int, int, int, int, int, double, double, class ext/mods/gameserver/enums/MoveDirectionType, int, int ]
          stack = []
      LineNumberTable:
        line 1147: 0
        line 1148: 12
        line 1149: 21
        line 1150: 30
        line 1151: 40
        line 1152: 50
        line 1153: 61
        line 1154: 84
        line 1154: 112
        line 1155: 115
        line 1156: 130
        line 1157: 136
        line 1158: 142
        line 1159: 147
        line 1160: 166
        line 1162: 191
        line 1163: 205
        line 1164: 215
        line 1165: 229
        line 1166: 250
        line 1167: 260
        line 1169: 273
        line 1170: 283
        line 1171: 297
        line 1171: 297
        line 1171: 312
        line 1172: 314
        line 1173: 324
        line 1175: 334
        line 1176: 344
        line 1176: 370
        line 1177: 375
        line 1178: 393
        line 1179: 398
        line 1180: 422
        line 1182: 424
        line 1183: 434
        line 1184: 441
        line 1185: 465
        line 1187: 467
        line 1188: 481
        line 1189: 489
        line 1190: 494
        line 1191: 504
        line 1192: 511
        line 1193: 535
        line 1196: 537
        line 1198: 564
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          215     346    22 checkX   I
          229     332    23 checkY   I
          344     217    24 block   Lext/mods/gameserver/geoengine/geodata/ABlock;
          375     186    25 nextZ   I
          393     168    26 index   I
           21     545    10   gox   I
           30     536    11   goy   I
           40     526    12   gtx   I
           50     516    13   gty   I
           61     505    14   goz   I
           84     482    15     m   D
          115     451    17    mz   D
          130     436    19   mdt   Lext/mods/gameserver/enums/MoveDirectionType;
          136     430    20 gridX   I
          142     424    21 gridY   I
            0     566     0  this   Lext/mods/gameserver/geoengine/GeoEngine;
            0     566     1    ox   I
            0     566     2    oy   I
            0     566     3    oz   I
            0     566     4 oheight   D
            0     566     6    tx   I
            0     566     7    ty   I
            0     566     8    tz   I
            0     566     9 debug   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
      parameter 1:
      parameter 2:
      parameter 3:
      parameter 4:
      parameter 5:
      parameter 6:
      parameter 7:
        0: #632()
          org.jetbrains.annotations.Nullable

  public final ext.mods.gameserver.model.location.Location getValidFlyLocation(int, int, int, double, int, int, int, ext.mods.gameserver.network.serverpackets.ExServerPrimitive);
    descriptor: (IIIDIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Lext/mods/gameserver/model/location/Location;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=7, locals=29, args_size=9
         0: getstatic     #648                // Field Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
         3: iload_1
         4: invokevirtual #654                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoX:(I)I
         7: istore        10
         9: getstatic     #648                // Field Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
        12: iload_2
        13: invokevirtual #657                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoY:(I)I
        16: istore        11
        18: aload_0
        19: iload         10
        21: iload         11
        23: iload_3
        24: invokevirtual #634                // Method getHeightNearest:(III)S
        27: istore        12
        29: getstatic     #648                // Field Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
        32: iload         6
        34: invokevirtual #654                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoX:(I)I
        37: istore        13
        39: getstatic     #648                // Field Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
        42: iload         7
        44: invokevirtual #657                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoY:(I)I
        47: istore        14
        49: iload         6
        51: iload_1
        52: if_icmpne     59
        55: dconst_0
        56: goto          70
        59: iload         7
        61: iload_2
        62: isub
        63: i2d
        64: iload         6
        66: iload_1
        67: isub
        68: i2d
        69: ddiv
        70: dstore        15
        72: iload         8
        74: iload_3
        75: isub
        76: i2d
        77: iload         6
        79: iload_1
        80: isub
        81: iload         6
        83: iload_1
        84: isub
        85: imul
        86: iload         7
        88: iload_2
        89: isub
        90: iload         7
        92: iload_2
        93: isub
        94: imul
        95: iadd
        96: i2d
        97: invokestatic  #965                // Method java/lang/Math.sqrt:(D)D
       100: ddiv
       101: dstore        17
       103: iload         13
       105: iload         10
       107: isub
       108: iload         14
       110: iload         11
       112: isub
       113: invokestatic  #971                // Method ext/mods/gameserver/enums/MoveDirectionType.getDirection:(II)Lext/mods/gameserver/enums/MoveDirectionType;
       116: astore        19
       118: iload_1
       119: bipush        -16
       121: iand
       122: istore        20
       124: iload_2
       125: bipush        -16
       127: iand
       128: istore        21
       130: aload         9
       132: ifnull        179
       135: aload         9
       137: getstatic     #977                // Field java/awt/Color.BLUE:Ljava/awt/Color;
       140: iload         20
       142: iload         21
       144: iload         12
       146: bipush        32
       148: isub
       149: bipush        15
       151: invokevirtual #981                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addSquare:(Ljava/awt/Color;IIII)V
       154: aload         9
       156: getstatic     #977                // Field java/awt/Color.BLUE:Ljava/awt/Color;
       159: iload         6
       161: bipush        -16
       163: iand
       164: iload         7
       166: bipush        -16
       168: iand
       169: iload         8
       171: bipush        32
       173: isub
       174: bipush        15
       176: invokevirtual #981                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addSquare:(Ljava/awt/Color;IIII)V
       179: iload_3
       180: istore        22
       182: iload         10
       184: iload         13
       186: if_icmpne     196
       189: iload         11
       191: iload         14
       193: if_icmpeq     656
       196: iload         20
       198: aload         19
       200: invokevirtual #984                // Method ext/mods/gameserver/enums/MoveDirectionType.getOffsetX:()I
       203: iadd
       204: istore        23
       206: iload_2
       207: i2d
       208: dload         15
       210: iload         23
       212: iload_1
       213: isub
       214: i2d
       215: dmul
       216: dadd
       217: d2i
       218: istore        24
       220: aload         19
       222: invokevirtual #987                // Method ext/mods/gameserver/enums/MoveDirectionType.getStepX:()I
       225: ifeq          264
       228: getstatic     #648                // Field Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
       231: iload         24
       233: invokevirtual #657                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoY:(I)I
       236: iload         11
       238: if_icmpne     264
       241: iload         20
       243: aload         19
       245: invokevirtual #987                // Method ext/mods/gameserver/enums/MoveDirectionType.getStepX:()I
       248: iadd
       249: istore        20
       251: iload         10
       253: aload         19
       255: invokevirtual #1003               // Method ext/mods/gameserver/enums/MoveDirectionType.getSignumX:()I
       258: iadd
       259: istore        10
       261: goto          325
       264: iload         21
       266: aload         19
       268: invokevirtual #1009               // Method ext/mods/gameserver/enums/MoveDirectionType.getOffsetY:()I
       271: iadd
       272: istore        24
       274: iload_1
       275: i2d
       276: iload         24
       278: iload_2
       279: isub
       280: i2d
       281: dload         15
       283: ddiv
       284: dadd
       285: d2i
       286: istore        23
       288: iload         20
       290: iload         20
       292: bipush        15
       294: iadd
       295: iload         23
       297: invokestatic  #1012               // Method java/lang/Math.min:(II)I
       300: invokestatic  #798                // Method java/lang/Math.max:(II)I
       303: istore        23
       305: iload         21
       307: aload         19
       309: invokevirtual #1021               // Method ext/mods/gameserver/enums/MoveDirectionType.getStepY:()I
       312: iadd
       313: istore        21
       315: iload         11
       317: aload         19
       319: invokevirtual #1024               // Method ext/mods/gameserver/enums/MoveDirectionType.getSignumY:()I
       322: iadd
       323: istore        11
       325: iload         10
       327: iflt          351
       330: iload         10
       332: sipush        22528
       335: if_icmpge     351
       338: iload         11
       340: iflt          351
       343: iload         11
       345: ldc_w         #690                // int 32768
       348: if_icmplt     386
       351: aload         9
       353: ifnull        372
       356: aload         9
       358: getstatic     #1036               // Field java/awt/Color.RED:Ljava/awt/Color;
       361: iload         20
       363: iload         21
       365: iload         12
       367: bipush        15
       369: invokevirtual #981                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addSquare:(Ljava/awt/Color;IIII)V
       372: new           #665                // class ext/mods/gameserver/model/location/Location
       375: dup
       376: iload         23
       378: iload         24
       380: iload         12
       382: invokespecial #835                // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       385: areturn
       386: aload_0
       387: iload         10
       389: iload         11
       391: invokevirtual #692                // Method getBlock:(II)Lext/mods/gameserver/geoengine/geodata/ABlock;
       394: astore        25
       396: iload_3
       397: dload         17
       399: iload         23
       401: iload_1
       402: isub
       403: iload         23
       405: iload_1
       406: isub
       407: imul
       408: iload         24
       410: iload_2
       411: isub
       412: iload         24
       414: iload_2
       415: isub
       416: imul
       417: iadd
       418: i2d
       419: invokestatic  #965                // Method java/lang/Math.sqrt:(D)D
       422: dmul
       423: d2i
       424: iadd
       425: istore        26
       427: aload         25
       429: iload         10
       431: iload         11
       433: iload         26
       435: dload         4
       437: d2i
       438: iadd
       439: aconst_null
       440: invokevirtual #696                // Method ext/mods/gameserver/geoengine/geodata/ABlock.getIndexBelow:(IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)I
       443: istore        27
       445: iload         27
       447: ifge          488
       450: aload         9
       452: ifnull        474
       455: aload         9
       457: getstatic     #1036               // Field java/awt/Color.RED:Ljava/awt/Color;
       460: iload         20
       462: iload         21
       464: iload         26
       466: bipush        32
       468: isub
       469: bipush        15
       471: invokevirtual #981                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addSquare:(Ljava/awt/Color;IIII)V
       474: new           #665                // class ext/mods/gameserver/model/location/Location
       477: dup
       478: iload         23
       480: iload         24
       482: iload         22
       484: invokespecial #835                // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       487: areturn
       488: aload         25
       490: iload         27
       492: aconst_null
       493: invokevirtual #699                // Method ext/mods/gameserver/geoengine/geodata/ABlock.getHeight:(ILext/mods/gameserver/geoengine/geodata/IGeoObject;)S
       496: istore        12
       498: iload         12
       500: iload         26
       502: if_icmple     543
       505: aload         9
       507: ifnull        529
       510: aload         9
       512: getstatic     #1036               // Field java/awt/Color.RED:Ljava/awt/Color;
       515: iload         20
       517: iload         21
       519: iload         26
       521: bipush        32
       523: isub
       524: bipush        15
       526: invokevirtual #981                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addSquare:(Ljava/awt/Color;IIII)V
       529: new           #665                // class ext/mods/gameserver/model/location/Location
       532: dup
       533: iload         23
       535: iload         24
       537: iload         22
       539: invokespecial #835                // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       542: areturn
       543: aload         25
       545: iload         10
       547: iload         11
       549: iload         26
       551: aconst_null
       552: invokevirtual #1033               // Method ext/mods/gameserver/geoengine/geodata/ABlock.getIndexAbove:(IIILext/mods/gameserver/geoengine/geodata/IGeoObject;)I
       555: istore        27
       557: iload         26
       559: dload         4
       561: d2i
       562: iadd
       563: istore        28
       565: iload         27
       567: iflt          625
       570: aload         25
       572: iload         27
       574: aconst_null
       575: invokevirtual #699                // Method ext/mods/gameserver/geoengine/geodata/ABlock.getHeight:(ILext/mods/gameserver/geoengine/geodata/IGeoObject;)S
       578: istore        12
       580: iload         12
       582: iload         28
       584: if_icmpge     625
       587: aload         9
       589: ifnull        611
       592: aload         9
       594: getstatic     #1036               // Field java/awt/Color.RED:Ljava/awt/Color;
       597: iload         20
       599: iload         21
       601: iload         28
       603: bipush        32
       605: isub
       606: bipush        15
       608: invokevirtual #981                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addSquare:(Ljava/awt/Color;IIII)V
       611: new           #665                // class ext/mods/gameserver/model/location/Location
       614: dup
       615: iload         23
       617: iload         24
       619: iload         22
       621: invokespecial #835                // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       624: areturn
       625: aload         9
       627: ifnull        649
       630: aload         9
       632: getstatic     #1000               // Field java/awt/Color.GREEN:Ljava/awt/Color;
       635: iload         20
       637: iload         21
       639: iload         28
       641: bipush        32
       643: isub
       644: bipush        15
       646: invokevirtual #981                // Method ext/mods/gameserver/network/serverpackets/ExServerPrimitive.addSquare:(Ljava/awt/Color;IIII)V
       649: iload         26
       651: istore        22
       653: goto          182
       656: new           #665                // class ext/mods/gameserver/model/location/Location
       659: dup
       660: iload         6
       662: iload         7
       664: iload         8
       666: invokespecial #835                // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
       669: areturn
      StackMapTable: number_of_entries = 18
        frame_type = 255 /* full_frame */
          offset_delta = 59
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine, int, int, int, double, int, int, int, class ext/mods/gameserver/network/serverpackets/ExServerPrimitive, int, int, int, int, int ]
          stack = []
        frame_type = 74 /* same_locals_1_stack_item */
          stack = [ double ]
        frame_type = 255 /* full_frame */
          offset_delta = 108
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine, int, int, int, double, int, int, int, class ext/mods/gameserver/network/serverpackets/ExServerPrimitive, int, int, int, int, int, double, double, class ext/mods/gameserver/enums/MoveDirectionType, int, int ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 2
          locals = [ int ]
        frame_type = 13 /* same */
        frame_type = 253 /* append */
          offset_delta = 67
          locals = [ int, int ]
        frame_type = 60 /* same */
        frame_type = 25 /* same */
        frame_type = 20 /* same */
        frame_type = 13 /* same */
        frame_type = 254 /* append */
          offset_delta = 87
          locals = [ class ext/mods/gameserver/geoengine/geodata/ABlock, int, int ]
        frame_type = 13 /* same */
        frame_type = 40 /* same */
        frame_type = 13 /* same */
        frame_type = 252 /* append */
          offset_delta = 67
          locals = [ int ]
        frame_type = 13 /* same */
        frame_type = 23 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 6
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine, int, int, int, double, int, int, int, class ext/mods/gameserver/network/serverpackets/ExServerPrimitive, int, int, int, int, int, double, double, class ext/mods/gameserver/enums/MoveDirectionType, int, int, int ]
          stack = []
      LineNumberTable:
        line 1205: 0
        line 1206: 9
        line 1207: 18
        line 1208: 29
        line 1209: 39
        line 1210: 49
        line 1211: 72
        line 1211: 100
        line 1212: 103
        line 1213: 118
        line 1214: 124
        line 1215: 130
        line 1216: 135
        line 1217: 154
        line 1219: 179
        line 1220: 182
        line 1221: 196
        line 1222: 206
        line 1223: 220
        line 1224: 241
        line 1225: 251
        line 1227: 264
        line 1228: 274
        line 1229: 288
        line 1229: 288
        line 1229: 303
        line 1230: 305
        line 1231: 315
        line 1233: 325
        line 1234: 351
        line 1235: 372
        line 1237: 386
        line 1238: 396
        line 1238: 422
        line 1239: 427
        line 1240: 445
        line 1241: 450
        line 1242: 474
        line 1244: 488
        line 1245: 498
        line 1246: 505
        line 1247: 529
        line 1249: 543
        line 1250: 557
        line 1251: 565
        line 1252: 570
        line 1253: 580
        line 1254: 587
        line 1255: 611
        line 1258: 625
        line 1259: 649
        line 1261: 656
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          206     447    23 checkX   I
          220     433    24 checkY   I
          396     257    25 block   Lext/mods/gameserver/geoengine/geodata/ABlock;
          427     226    26 bottomZ   I
          445     208    27 index   I
          565      88    28  topZ   I
            9     661    10   gox   I
           18     652    11   goy   I
           29     641    12   goz   I
           39     631    13   gtx   I
           49     621    14   gty   I
           72     598    15     m   D
          103     567    17    mz   D
          118     552    19   mdt   Lext/mods/gameserver/enums/MoveDirectionType;
          124     546    20 gridX   I
          130     540    21 gridY   I
          182     488    22 checkZ   I
            0     670     0  this   Lext/mods/gameserver/geoengine/GeoEngine;
            0     670     1    ox   I
            0     670     2    oy   I
            0     670     3    oz   I
            0     670     4 oheight   D
            0     670     6    tx   I
            0     670     7    ty   I
            0     670     8    tz   I
            0     670     9 debug   Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;
    RuntimeInvisibleAnnotations:
      0: #611()
        org.jetbrains.annotations.NotNull
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
      parameter 1:
      parameter 2:
      parameter 3:
      parameter 4:
      parameter 5:
      parameter 6:
      parameter 7:
        0: #632()
          org.jetbrains.annotations.Nullable

  public final boolean addGeoBug(ext.mods.gameserver.model.location.Location, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/location/Location;Ljava/lang/String;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=10, locals=14, args_size=3
         0: getstatic     #648                // Field Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
         3: aload_1
         4: invokevirtual #668                // Method ext/mods/gameserver/model/location/Location.getX:()I
         7: invokevirtual #654                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoX:(I)I
        10: istore_3
        11: getstatic     #648                // Field Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
        14: aload_1
        15: invokevirtual #671                // Method ext/mods/gameserver/model/location/Location.getY:()I
        18: invokevirtual #657                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoY:(I)I
        21: istore        4
        23: aload_1
        24: invokevirtual #674                // Method ext/mods/gameserver/model/location/Location.getZ:()I
        27: istore        5
        29: iload_3
        30: sipush        2048
        33: idiv
        34: bipush        16
        36: iadd
        37: istore        6
        39: iload         4
        41: sipush        2048
        44: idiv
        45: bipush        10
        47: iadd
        48: istore        7
        50: iload_3
        51: bipush        8
        53: idiv
        54: sipush        256
        57: irem
        58: istore        8
        60: iload         4
        62: bipush        8
        64: idiv
        65: sipush        256
        68: irem
        69: istore        9
        71: iload_3
        72: bipush        8
        74: irem
        75: istore        10
        77: iload         4
        79: bipush        8
        81: irem
        82: istore        11
        84: nop
        85: aload_0
        86: getfield      #205                // Field _geoBugReports:Ljava/io/PrintWriter;
        89: dup
        90: ifnull        194
        93: ldc_w         #1186               // String %d;%d;%d;%d;%d;%d;%d;%s\r\n
        96: bipush        8
        98: anewarray     #4                  // class java/lang/Object
       101: astore        13
       103: aload         13
       105: iconst_0
       106: iload         6
       108: invokestatic  #1190               // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       111: aastore
       112: aload         13
       114: iconst_1
       115: iload         7
       117: invokestatic  #1190               // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       120: aastore
       121: aload         13
       123: iconst_2
       124: iload         8
       126: invokestatic  #1190               // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       129: aastore
       130: aload         13
       132: iconst_3
       133: iload         9
       135: invokestatic  #1190               // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       138: aastore
       139: aload         13
       141: iconst_4
       142: iload         10
       144: invokestatic  #1190               // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       147: aastore
       148: aload         13
       150: iconst_5
       151: iload         11
       153: invokestatic  #1190               // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       156: aastore
       157: aload         13
       159: bipush        6
       161: iload         5
       163: invokestatic  #1190               // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       166: aastore
       167: aload         13
       169: bipush        7
       171: aload_2
       172: ldc_w         #1192               // String ;
       175: ldc_w         #1194               // String :
       178: iconst_0
       179: iconst_4
       180: aconst_null
       181: invokestatic  #1200               // Method kotlin/text/StringsKt.replace$default:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;
       184: aastore
       185: aload         13
       187: invokevirtual #1204               // Method java/io/PrintWriter.printf:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintWriter;
       190: pop
       191: goto          195
       194: pop
       195: iconst_1
       196: istore        12
       198: goto          220
       201: astore        13
       203: getstatic     #113                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       206: ldc_w         #1206               // String Couldn\'t save new entry to \"geo_bugs.txt\" file.
       209: aload         13
       211: checkcast     #197                // class java/lang/Throwable
       214: invokevirtual #201                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       217: iconst_0
       218: istore        12
       220: iload         12
       222: ireturn
      Exception table:
         from    to  target type
            84   198   201   Class java/lang/Exception
      StackMapTable: number_of_entries = 4
        frame_type = 255 /* full_frame */
          offset_delta = 194
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine, class ext/mods/gameserver/model/location/Location, class java/lang/String, int, int, int, int, int, int, int, int, int ]
          stack = [ class java/io/PrintWriter ]
        frame_type = 0 /* same */
        frame_type = 69 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 252 /* append */
          offset_delta = 18
          locals = [ int ]
      LineNumberTable:
        line 1264: 0
        line 1265: 11
        line 1266: 23
        line 1267: 29
        line 1268: 39
        line 1269: 50
        line 1270: 60
        line 1271: 71
        line 1272: 77
        line 1273: 84
        line 1274: 85
        line 1275: 195
        line 1276: 201
        line 1277: 203
        line 1278: 217
        line 1273: 222
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          203      17    13     e   Ljava/lang/Exception;
           11     212     3   gox   I
           23     200     4   goy   I
           29     194     5   goz   I
           39     184     6    rx   I
           50     173     7    ry   I
           60     163     8    bx   I
           71     152     9    by   I
           77     146    10    cx   I
           84     139    11    cy   I
            0     223     0  this   Lext/mods/gameserver/geoengine/GeoEngine;
            0     223     1   loc   Lext/mods/gameserver/model/location/Location;
            0     223     2 comment   Ljava/lang/String;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #611()
          org.jetbrains.annotations.NotNull
      parameter 1:
        0: #611()
          org.jetbrains.annotations.NotNull

  public static final ext.mods.gameserver.geoengine.GeoEngine getInstance();
    descriptor: ()Lext/mods/gameserver/geoengine/GeoEngine;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #648                // Field Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
         3: invokevirtual #1307               // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
         6: areturn
      LineNumberTable:
        line 1287: 6
    RuntimeVisibleAnnotations:
      0: #1305()
        kotlin.jvm.JvmStatic
    RuntimeInvisibleAnnotations:
      0: #611()
        org.jetbrains.annotations.NotNull

  public static final int getGeoX(int);
    descriptor: (I)I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: getstatic     #648                // Field Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
         3: iload_0
         4: invokevirtual #654                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoX:(I)I
         7: ireturn
      LineNumberTable:
        line 1290: 7
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0 worldX   I
    RuntimeVisibleAnnotations:
      0: #1305()
        kotlin.jvm.JvmStatic

  public static final int getGeoY(int);
    descriptor: (I)I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: getstatic     #648                // Field Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
         3: iload_0
         4: invokevirtual #657                // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getGeoY:(I)I
         7: ireturn
      LineNumberTable:
        line 1292: 7
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0 worldY   I
    RuntimeVisibleAnnotations:
      0: #1305()
        kotlin.jvm.JvmStatic

  public static final int getWorldX(int);
    descriptor: (I)I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: getstatic     #648                // Field Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
         3: iload_0
         4: invokevirtual #1310               // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getWorldX:(I)I
         7: ireturn
      LineNumberTable:
        line 1294: 7
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  geoX   I
    RuntimeVisibleAnnotations:
      0: #1305()
        kotlin.jvm.JvmStatic

  public static final int getWorldY(int);
    descriptor: (I)I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: getstatic     #648                // Field Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
         3: iload_0
         4: invokevirtual #1313               // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.getWorldY:(I)I
         7: ireturn
      LineNumberTable:
        line 1296: 7
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  geoY   I
    RuntimeVisibleAnnotations:
      0: #1305()
        kotlin.jvm.JvmStatic

  public static final byte[][] calculateGeoObject(boolean[][]);
    descriptor: ([[Z)[[B
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: getstatic     #648                // Field Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
         3: aload_0
         4: invokevirtual #1317               // Method ext/mods/gameserver/geoengine/GeoEngine$Companion.calculateGeoObject:([[Z)[[B
         7: areturn
      LineNumberTable:
        line 1317: 7
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0 inside   [[Z
    RuntimeVisibleAnnotations:
      0: #1305()
        kotlin.jvm.JvmStatic
    RuntimeInvisibleAnnotations:
      0: #611()
        org.jetbrains.annotations.NotNull
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #611()
          org.jetbrains.annotations.NotNull

  public static final java.lang.Object access$loadGeoBlocks(ext.mods.gameserver.geoengine.GeoEngine, int, int, kotlin.coroutines.Continuation);
    descriptor: (Lext/mods/gameserver/geoengine/GeoEngine;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;
    flags: (0x1019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC
    Code:
      stack=4, locals=4, args_size=4
         0: aload_0
         1: iload_1
         2: iload_2
         3: aload_3
         4: invokespecial #1323               // Method loadGeoBlocks:(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;
         7: areturn
      LineNumberTable:
        line 53: 4
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0 $this   Lext/mods/gameserver/geoengine/GeoEngine;
            0       8     1 regionX   I
            0       8     2 regionY   I
            0       8     3 $completion   Lkotlin/coroutines/Continuation;

  public static final kotlin.Lazy access$get_instance$delegate$cp();
    descriptor: ()Lkotlin/Lazy;
    flags: (0x1019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #1330               // Field _instance$delegate:Lkotlin/Lazy;
         3: areturn
      LineNumberTable:
        line 53: 0

  public static final ext.mods.commons.logging.CLogger access$getLOGGER$cp();
    descriptor: ()Lext/mods/commons/logging/CLogger;
    flags: (0x1019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #113                // Field LOGGER:Lext/mods/commons/logging/CLogger;
         3: areturn
      LineNumberTable:
        line 53: 0

  public static final void access$loadNullBlocks(ext.mods.gameserver.geoengine.GeoEngine, int, int);
    descriptor: (Lext/mods/gameserver/geoengine/GeoEngine;II)V
    flags: (0x1019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: iload_1
         2: iload_2
         3: invokespecial #550                // Method loadNullBlocks:(II)V
         6: return
      LineNumberTable:
        line 53: 3
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0 $this   Lext/mods/gameserver/geoengine/GeoEngine;
            0       7     1 regionX   I
            0       7     2 regionY   I

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #650                // class ext/mods/gameserver/geoengine/GeoEngine$Companion
         3: dup
         4: aconst_null
         5: invokespecial #1338               // Method ext/mods/gameserver/geoengine/GeoEngine$Companion."<init>":(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
         8: putstatic     #648                // Field Companion:Lext/mods/gameserver/geoengine/GeoEngine$Companion;
        11: new           #117                // class ext/mods/commons/logging/CLogger
        14: dup
        15: ldc           #2                  // class ext/mods/gameserver/geoengine/GeoEngine
        17: invokevirtual #1343               // Method java/lang/Class.getName:()Ljava/lang/String;
        20: invokespecial #1344               // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        23: putstatic     #113                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        26: invokedynamic #1351,  0           // InvokeDynamic #7:invoke:()Lkotlin/jvm/functions/Function0;
        31: invokestatic  #1357               // Method kotlin/LazyKt.lazy:(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;
        34: putstatic     #1330               // Field _instance$delegate:Lkotlin/Lazy;
        37: return
      LineNumberTable:
        line 1282: 11
        line 1284: 26
}
InnerClasses:
  static final #137;                      // class ext/mods/gameserver/geoengine/GeoEngine$2
  public static final #212= #650 of #2;   // Companion=class ext/mods/gameserver/geoengine/GeoEngine$Companion of class ext/mods/gameserver/geoengine/GeoEngine
  public static final #1373= #398 of #2;  // WhenMappings=class ext/mods/gameserver/geoengine/GeoEngine$WhenMappings of class ext/mods/gameserver/geoengine/GeoEngine
  static final #287;                      // class ext/mods/gameserver/geoengine/GeoEngine$loadGeoBlocks$1
  public static final #212= #217 of #211; // Companion=class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$Companion of class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge
  public static #1374= #228 of #211;      // GeoEngineInterface=class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$GeoEngineInterface of class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge
  public static #1375= #368 of #366;      // MapMode=class java/nio/channels/FileChannel$MapMode of class java/nio/channels/FileChannel
  public static final #1380= #1377 of #1379; // DoubleRef=class kotlin/jvm/internal/Ref$DoubleRef of class kotlin/jvm/internal/Ref
  public static final #1383= #1382 of #1379; // IntRef=class kotlin/jvm/internal/Ref$IntRef of class kotlin/jvm/internal/Ref
  public static final #1386= #1385 of #1379; // ObjectRef=class kotlin/jvm/internal/Ref$ObjectRef of class kotlin/jvm/internal/Ref
SourceFile: "GeoEngine.kt"
SourceDebugExtension:
  SMAP
  GeoEngine.kt
  Kotlin
  *S Kotlin
  *F
  + 1 GeoEngine.kt
  ext/mods/gameserver/geoengine/GeoEngine
  + 2 Mutex.kt
  kotlinx/coroutines/sync/MutexKt
  + 3 _Collections.kt
  kotlin/collections/CollectionsKt___CollectionsKt
  + 4 fake.kt
  kotlin/jvm/internal/FakeKt
  *L
  1#1,1319:1
  147#1,2:1342
  153#1,3:1344
  160#1,7:1347
  153#1,3:1354
  160#1,7:1357
  153#1,3:1364
  160#1,7:1367
  147#1,2:1374
  116#2,11:1320
  116#2,11:1331
  1915#3:1376
  1391#3:1377
  1480#3,2:1378
  1642#3,10:1380
  1915#3:1390
  1916#3:1392
  1652#3:1393
  1482#3,3:1394
  1807#3,3:1397
  1916#3:1400
  1586#3:1401
  1661#3,3:1402
  1924#3,3:1405
  1#4:1391
  *S KotlinDebug
  *F
  + 1 GeoEngine.kt
  ext/mods/gameserver/geoengine/GeoEngine
  *L
  233#1:1342,2
  250#1:1344,3
  251#1:1347,7
  265#1:1354,3
  266#1:1357,7
  317#1:1364,3
  318#1:1367,7
  342#1:1374,2
  192#1:1320,11
  201#1:1331,11
  447#1:1376
  452#1:1377
  452#1:1378,2
  453#1:1380,10
  453#1:1390
  453#1:1392
  453#1:1393
  452#1:1394,3
  463#1:1397,3
  447#1:1400
  966#1:1401
  966#1:1402,3
  1003#1:1405,3
  453#1:1391
  *E
RuntimeVisibleAnnotations:
  0: #1359(#1360=[I#1361,I#1362,I#1363],#1364=I#1365,#1366=I#1367,#1368=[s#1369],#1370=[s#254,s#1371,s#5,s#6,s#69,s#1371,s#565,s#70,s#202,s#203,s#17,s#18,s#21,s#1371,s#28,s#608,s#29,s#32,s#36,s#39,s#44,s#1371,s#48,s#1371,s#52,s#55,s#1371,s#260,s#264,s#265,s#266,s#1371,s#271,s#272,s#273,s#274,s#281,s#283,s#1371,s#580,s#581,s#284,s#547,s#1371,s#587,s#610,s#614,s#619,s#1371,s#631,s#635,s#636,s#637,s#1371,s#645,s#660,s#661,s#662,s#675,s#676,s#677,s#678,s#686,s#715,s#742,s#744,s#749,s#745,s#786,s#787,s#788,s#809,s#810,s#811,s#812,s#813,s#814,s#815,s#1371,s#816,s#817,s#820,s#824,s#825,s#826,s#827,s#932,s#933,s#934,s#953,s#954,s#955,s#406,s#947,s#951,s#952,s#1056,s#1060,s#1065,s#1077,s#790,s#1081,s#1085,s#1093,s#1094,s#1100,s#1371,s#1052,s#1053,s#1080,s#1054,s#1055,s#1099,s#1071,s#1371,s#1118,s#1159,s#892,s#1165,s#1174,s#1179,s#1183,s#1211,s#1371,s#212,s#1372])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0017\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 |2\u00020\u0001:\u0001|B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\rH\u0082\bJ!\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\rH\u0082\bJ\u0011\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020\u001fH\u0082\bJ\u001e\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\r2\u0006\u0010(\u001a\u00020\rH\u0082@¢\u0006\u0002\u0010)J\u0018\u0010*\u001a\u00020+2\u0006\u0010\'\u001a\u00020\r2\u0006\u0010(\u001a\u00020\rH\u0002J\u0018\u0010,\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\rH\u0002J\u0016\u0010-\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\rJ\u0016\u0010.\u001a\u00020&2\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\rJ\u001e\u0010/\u001a\u0002002\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\r2\u0006\u00101\u001a\u00020\rJ(\u0010/\u001a\u0002002\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\r2\u0006\u00101\u001a\u00020\r2\b\u00102\u001a\u0004\u0018\u000103J\u001e\u00104\u001a\u0002052\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\r2\u0006\u00101\u001a\u00020\rJ(\u00104\u001a\u0002052\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\r2\u0006\u00101\u001a\u00020\r2\b\u00102\u001a\u0004\u0018\u000103J\u0016\u00106\u001a\u00020&2\u0006\u00107\u001a\u00020\r2\u0006\u00108\u001a\u00020\rJ\u000e\u00109\u001a\u0002002\u0006\u0010:\u001a\u00020;J\u001e\u00109\u001a\u0002002\u0006\u00107\u001a\u00020\r2\u0006\u00108\u001a\u00020\r2\u0006\u00101\u001a\u00020\rJ\u001e\u0010<\u001a\u0002052\u0006\u00107\u001a\u00020\r2\u0006\u00108\u001a\u00020\r2\u0006\u00101\u001a\u00020\rJ\b\u0010=\u001a\u00020\rH\u0002J\u001e\u0010>\u001a\u00020&2\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\rJ\u0010\u0010?\u001a\u00020+2\u0006\u0010@\u001a\u000203H\u0002J\u000e\u0010A\u001a\u00020+2\u0006\u0010@\u001a\u000203J\u000e\u0010B\u001a\u00020+2\u0006\u0010@\u001a\u000203J\u0018\u0010C\u001a\u00020+2\u0006\u0010@\u001a\u0002032\u0006\u0010D\u001a\u00020&H\u0002J\u001e\u0010E\u001a\u00020&2\u0006\u00107\u001a\u00020\r2\u0006\u00108\u001a\u00020\r2\u0006\u00101\u001a\u00020\rJH\u0010F\u001a\u00020&2\u0006\u0010G\u001a\u00020\r2\u0006\u0010H\u001a\u00020\r2\u0006\u0010I\u001a\u00020\r2\u0006\u0010J\u001a\u00020\r2\u0006\u0010K\u001a\u00020\r2\u0006\u0010L\u001a\u00020\r2\u0006\u0010M\u001a\u00020N2\b\u0010O\u001a\u0004\u0018\u00010PJ\u001e\u0010Q\u001a\u00020&2\u0006\u0010R\u001a\u00020\r2\u0006\u0010S\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\rJ\u0016\u0010T\u001a\u00020\r2\u0006\u0010R\u001a\u00020\r2\u0006\u0010S\u001a\u00020\rJ@\u0010U\u001a\u00020;2\u0006\u0010G\u001a\u00020\r2\u0006\u0010H\u001a\u00020\r2\u0006\u0010I\u001a\u00020\r2\u0006\u0010J\u001a\u00020\r2\u0006\u0010K\u001a\u00020\r2\u0006\u0010L\u001a\u00020\r2\b\u0010V\u001a\u0004\u0018\u00010WJ\u0016\u0010X\u001a\u00020&2\u0006\u0010@\u001a\u00020Y2\u0006\u0010Z\u001a\u00020YJ\u0016\u0010[\u001a\u00020&2\u0006\u0010@\u001a\u00020Y2\u0006\u0010\\\u001a\u00020;JZ\u0010]\u001a\u00020&2\u0006\u0010G\u001a\u00020\r2\u0006\u0010H\u001a\u00020\r2\u0006\u0010I\u001a\u00020\r2\u0006\u0010^\u001a\u00020N2\u0006\u0010J\u001a\u00020\r2\u0006\u0010K\u001a\u00020\r2\u0006\u0010L\u001a\u00020\r2\u0006\u0010_\u001a\u00020N2\b\u00102\u001a\u0004\u0018\u0001032\b\u0010O\u001a\u0004\u0018\u00010PJB\u0010`\u001a\u0004\u0018\u00010;2\u0006\u0010G\u001a\u00020\r2\u0006\u0010H\u001a\u00020\r2\u0006\u0010I\u001a\u00020\r2\u0006\u0010J\u001a\u00020\r2\u0006\u0010K\u001a\u00020\r2\u0006\u0010L\u001a\u00020\r2\b\u00102\u001a\u0004\u0018\u000103J\u0016\u0010a\u001a\u00020&2\u0006\u0010@\u001a\u00020Y2\u0006\u0010Z\u001a\u00020YJ\u0016\u0010b\u001a\u00020&2\u0006\u0010@\u001a\u00020Y2\u0006\u0010Z\u001a\u00020YJ\u0016\u0010b\u001a\u00020&2\u0006\u0010@\u001a\u00020Y2\u0006\u0010\\\u001a\u00020;J\u0016\u0010b\u001a\u00020&2\u0006\u0010c\u001a\u00020;2\u0006\u0010Z\u001a\u00020;J6\u0010b\u001a\u00020&2\u0006\u0010G\u001a\u00020\r2\u0006\u0010H\u001a\u00020\r2\u0006\u0010I\u001a\u00020\r2\u0006\u0010J\u001a\u00020\r2\u0006\u0010K\u001a\u00020\r2\u0006\u0010L\u001a\u00020\rJ@\u0010d\u001a\u00020&2\u0006\u0010G\u001a\u00020\r2\u0006\u0010H\u001a\u00020\r2\u0006\u0010I\u001a\u00020\r2\u0006\u0010J\u001a\u00020\r2\u0006\u0010K\u001a\u00020\r2\u0006\u0010L\u001a\u00020\r2\b\u0010O\u001a\u0004\u0018\u00010PJ@\u0010e\u001a\u00020&2\u0006\u0010G\u001a\u00020\r2\u0006\u0010H\u001a\u00020\r2\u0006\u0010I\u001a\u00020\r2\u0006\u0010J\u001a\u00020\r2\u0006\u0010K\u001a\u00020\r2\u0006\u0010L\u001a\u00020\r2\b\u0010O\u001a\u0004\u0018\u00010PJ&\u0010f\u001a\u00020;2\u0006\u0010@\u001a\u00020Y2\u0006\u0010J\u001a\u00020\r2\u0006\u0010K\u001a\u00020\r2\u0006\u0010L\u001a\u00020\rJ\u0016\u0010f\u001a\u00020;2\u0006\u0010g\u001a\u00020Y2\u0006\u0010h\u001a\u00020YJ\u0016\u0010f\u001a\u00020;2\u0006\u0010@\u001a\u00020Y2\u0006\u0010\\\u001a\u00020;J\u0016\u0010f\u001a\u00020;2\u0006\u0010c\u001a\u00020;2\u0006\u0010Z\u001a\u00020;J@\u0010f\u001a\u00020;2\u0006\u0010G\u001a\u00020\r2\u0006\u0010H\u001a\u00020\r2\u0006\u0010I\u001a\u00020\r2\u0006\u0010J\u001a\u00020\r2\u0006\u0010K\u001a\u00020\r2\u0006\u0010L\u001a\u00020\r2\b\u0010O\u001a\u0004\u0018\u00010PJF\u0010i\u001a\b\u0012\u0004\u0012\u00020;0j2\u0006\u0010k\u001a\u00020\r2\u0006\u0010l\u001a\u00020\r2\u0006\u0010m\u001a\u00020\r2\u0006\u0010n\u001a\u00020\r2\u0006\u0010o\u001a\u00020\r2\u0006\u0010p\u001a\u00020\r2\b\u0010O\u001a\u0004\u0018\u00010PJN\u0010q\u001a\b\u0012\u0004\u0012\u00020;0r2\u0006\u0010G\u001a\u00020\r2\u0006\u0010H\u001a\u00020\r2\u0006\u0010I\u001a\u00020\r2\u0006\u0010J\u001a\u00020\r2\u0006\u0010K\u001a\u00020\r2\u0006\u0010L\u001a\u00020\r2\u0006\u0010s\u001a\u00020&2\b\u0010O\u001a\u0004\u0018\u00010PJV\u0010q\u001a\b\u0012\u0004\u0012\u00020;0r2\u0006\u0010G\u001a\u00020\r2\u0006\u0010H\u001a\u00020\r2\u0006\u0010I\u001a\u00020\r2\u0006\u0010J\u001a\u00020\r2\u0006\u0010K\u001a\u00020\r2\u0006\u0010L\u001a\u00020\r2\u0006\u0010s\u001a\u00020&2\u0006\u0010t\u001a\u00020\r2\b\u0010O\u001a\u0004\u0018\u00010PJ@\u0010u\u001a\u00020;2\u0006\u0010G\u001a\u00020\r2\u0006\u0010H\u001a\u00020\r2\u0006\u0010I\u001a\u00020\r2\u0006\u0010J\u001a\u00020\r2\u0006\u0010K\u001a\u00020\r2\u0006\u0010L\u001a\u00020\r2\b\u0010O\u001a\u0004\u0018\u00010PJ\u001e\u0010v\u001a\u00020&2\u0006\u0010@\u001a\u00020Y2\u0006\u0010^\u001a\u00020N2\u0006\u0010Z\u001a\u00020YJ\u001e\u0010v\u001a\u00020&2\u0006\u0010@\u001a\u00020Y2\u0006\u0010^\u001a\u00020N2\u0006\u0010\\\u001a\u00020;J\u001e\u0010v\u001a\u00020&2\u0006\u0010c\u001a\u00020;2\u0006\u0010^\u001a\u00020N2\u0006\u0010Z\u001a\u00020;J>\u0010v\u001a\u00020&2\u0006\u0010G\u001a\u00020\r2\u0006\u0010H\u001a\u00020\r2\u0006\u0010I\u001a\u00020\r2\u0006\u0010^\u001a\u00020N2\u0006\u0010J\u001a\u00020\r2\u0006\u0010K\u001a\u00020\r2\u0006\u0010L\u001a\u00020\rJH\u0010w\u001a\u00020&2\u0006\u0010G\u001a\u00020\r2\u0006\u0010H\u001a\u00020\r2\u0006\u0010I\u001a\u00020\r2\u0006\u0010^\u001a\u00020N2\u0006\u0010J\u001a\u00020\r2\u0006\u0010K\u001a\u00020\r2\u0006\u0010L\u001a\u00020\r2\b\u0010O\u001a\u0004\u0018\u00010PJH\u0010x\u001a\u00020;2\u0006\u0010G\u001a\u00020\r2\u0006\u0010H\u001a\u00020\r2\u0006\u0010I\u001a\u00020\r2\u0006\u0010^\u001a\u00020N2\u0006\u0010J\u001a\u00020\r2\u0006\u0010K\u001a\u00020\r2\u0006\u0010L\u001a\u00020\r2\b\u0010O\u001a\u0004\u0018\u00010PJ\u0016\u0010y\u001a\u00020&2\u0006\u0010:\u001a\u00020;2\u0006\u0010z\u001a\u00020{R\u001c\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082D¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\rX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\rX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006}"]
      d2=["Lext/mods/gameserver/geoengine/GeoEngine;","","<init>","()V","_blocks","","Lext/mods/gameserver/geoengine/geodata/ABlock;","[[Lext/mods/gameserver/geoengine/geodata/ABlock;","_geoBugReports","Ljava/io/PrintWriter;","multilayerMutex","Lkotlinx/coroutines/sync/Mutex;","REGION_LOCKS","","regionLocks","Ljava/util/concurrent/locks/StampedLock;","[Ljava/util/concurrent/locks/StampedLock;","PADDING_SHIFT","CACHE_CAPACITY","CACHE_MASK","heightCacheKeys","","heightCacheVals","","nsweCacheKeys","nsweCacheVals","","getLockFor","bx","by","getGeoKey","","geoX","geoY","z","hashKeyPadded","key","loadGeoBlocks","","regionX","regionY","(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;","loadNullBlocks","","getBlockRaw","getBlock","hasGeoPos","getHeightNearest","","worldZ","ignore","Lext/mods/gameserver/geoengine/geodata/IGeoObject;","getNsweNearest","","hasGeo","worldX","worldY","getHeight","loc","Lext/mods/gameserver/model/location/Location;","getNswe","getBoundaryRadiusCells","hasBlockedNeighborAtSameLevel","invalidateCacheForObject","obj","addGeoObject","removeGeoObject","toggleGeoObject","add","canMoveAround","canMoveWithCollisionBox","ox","oy","oz","tx","ty","tz","collisionRadius","","debug","Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;","isInWater","x","y","getWaterLevel","getValidSwimLocationAdvanced","creature","Lext/mods/gameserver/model/actor/Creature;","canSeeTarget","Lext/mods/gameserver/model/WorldObject;","target","canSeeLocation","position","canSee","oheight","theight","raycast","canFindPathToTarget","canMoveToTarget","origin","canMove","canMoveClear","getValidLocation","follower","pawn","computeLegacyPathRaw","","gox","goy","goz","gtx","gty","gtz","findPath","","playable","nearestZLimit","getValidSwimLocation","canFlyToTarget","canFly","getValidFlyLocation","addGeoBug","comment","","Companion","Brproject"]
    )
RuntimeInvisibleAnnotations:
  0: #1388(#1389=[s#1390])
    kotlin.jvm.internal.SourceDebugExtension(
      value=["SMAP\nGeoEngine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GeoEngine.kt\next/mods/gameserver/geoengine/GeoEngine\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1319:1\n147#1,2:1342\n153#1,3:1344\n160#1,7:1347\n153#1,3:1354\n160#1,7:1357\n153#1,3:1364\n160#1,7:1367\n147#1,2:1374\n116#2,11:1320\n116#2,11:1331\n1915#3:1376\n1391#3:1377\n1480#3,2:1378\n1642#3,10:1380\n1915#3:1390\n1916#3:1392\n1652#3:1393\n1482#3,3:1394\n1807#3,3:1397\n1916#3:1400\n1586#3:1401\n1661#3,3:1402\n1924#3,3:1405\n1#4:1391\n*S KotlinDebug\n*F\n+ 1 GeoEngine.kt\next/mods/gameserver/geoengine/GeoEngine\n*L\n233#1:1342,2\n250#1:1344,3\n251#1:1347,7\n265#1:1354,3\n266#1:1357,7\n317#1:1364,3\n318#1:1367,7\n342#1:1374,2\n192#1:1320,11\n201#1:1331,11\n447#1:1376\n452#1:1377\n452#1:1378,2\n453#1:1380,10\n453#1:1390\n453#1:1392\n453#1:1393\n452#1:1394,3\n463#1:1397,3\n447#1:1400\n966#1:1401\n966#1:1402,3\n1003#1:1405,3\n453#1:1391\n*E\n"]
    )
BootstrapMethods:
  0: #132 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #125  Threads detectadas: \u0001 | Usando: \u0001 threads para Geodata
  1: #132 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #164  Geodata Carregada: \u0001 Sucessos / \u0001 Falhas
  2: #132 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #175 \u0001geo_bugs.txt
  3: #132 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #348 \u0001\u0001
  4: #132 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #510 Unknown block type: \u0001
  5: #1137 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1124 ()Ljava/lang/Object;
      #1129 REF_invokeStatic ext/mods/gameserver/geoengine/GeoEngine.findPath$lambda$0:(IIIIIIZLext/mods/gameserver/network/serverpackets/ExServerPrimitive;Lext/mods/gameserver/geoengine/GeoEngine;IIIIII)Ljava/util/List;
      #1130 ()Ljava/util/List;
  6: #132 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1256 Segment #\u0001
  7: #1137 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1124 ()Ljava/lang/Object;
      #1347 REF_invokeStatic ext/mods/gameserver/geoengine/GeoEngine._instance_delegate$lambda$0:()Lext/mods/gameserver/geoengine/GeoEngine;
      #1348 ()Lext/mods/gameserver/geoengine/GeoEngine;
