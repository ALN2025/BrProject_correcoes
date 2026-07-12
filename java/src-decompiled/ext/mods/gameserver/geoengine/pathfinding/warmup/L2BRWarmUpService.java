// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService
// File: ext\mods\gameserver\geoengine\pathfinding\warmup\L2BRWarmUpService.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService.class
  Last modified 9 de jul de 2026; size 15560 bytes
  MD5 checksum 577662789fb99a53a74571c48c143357
  Compiled from "L2BRWarmUpService.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 4, methods: 24, attributes: 6
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService
    #2 = Class              #1            // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService
    #3 = Utf8               java/lang/Object
    #4 = Class              #3            // java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;)V
    #7 = Utf8               Lorg/jetbrains/annotations/NotNull;
    #8 = Utf8               ()V
    #9 = NameAndType        #5:#8         // "<init>":()V
   #10 = Methodref          #4.#9         // java/lang/Object."<init>":()V
   #11 = Utf8               engine
   #12 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;
   #13 = NameAndType        #11:#12       // engine:Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;
   #14 = Fieldref           #2.#13        // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService.engine:Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;
   #15 = Utf8               storage
   #16 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
   #17 = NameAndType        #15:#16       // storage:Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
   #18 = Fieldref           #2.#17        // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService.storage:Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
   #19 = Utf8               config
   #20 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;
   #21 = NameAndType        #19:#20       // config:Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;
   #22 = Fieldref           #2.#21        // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService.config:Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;
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
   #38 = Fieldref           #2.#37        // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService.logger:Ljava/util/logging/Logger;
   #39 = Utf8               this
   #40 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;
   #41 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
   #42 = Utf8               ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig
   #43 = Class              #42           // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig
   #44 = Utf8               Companion
   #45 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig$Companion;
   #46 = NameAndType        #44:#45       // Companion:Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig$Companion;
   #47 = Fieldref           #43.#46       // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig.Companion:Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig$Companion;
   #48 = Utf8               ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig$Companion
   #49 = Class              #48           // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig$Companion
   #50 = Utf8               getDEFAULT
   #51 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;
   #52 = NameAndType        #50:#51       // getDEFAULT:()Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;
   #53 = Methodref          #49.#52       // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig$Companion.getDEFAULT:()Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;
   #54 = NameAndType        #5:#6         // "<init>":(Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;)V
   #55 = Methodref          #2.#54        // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService."<init>":(Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;)V
   #56 = Utf8               execute
   #57 = Utf8               (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
   #58 = Utf8               (Lkotlin/coroutines/Continuation<-Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult;>;)Ljava/lang/Object;
   #59 = Utf8               Lorg/jetbrains/annotations/Nullable;
   #60 = Utf8               kotlinx/coroutines/Dispatchers
   #61 = Class              #60           // kotlinx/coroutines/Dispatchers
   #62 = Utf8               getDefault
   #63 = Utf8               ()Lkotlinx/coroutines/CoroutineDispatcher;
   #64 = NameAndType        #62:#63       // getDefault:()Lkotlinx/coroutines/CoroutineDispatcher;
   #65 = Methodref          #61.#64       // kotlinx/coroutines/Dispatchers.getDefault:()Lkotlinx/coroutines/CoroutineDispatcher;
   #66 = Utf8               kotlin/coroutines/CoroutineContext
   #67 = Class              #66           // kotlin/coroutines/CoroutineContext
   #68 = Utf8               ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$execute$2
   #69 = Class              #68           // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$execute$2
   #70 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;Lkotlin/coroutines/Continuation;)V
   #71 = NameAndType        #5:#70        // "<init>":(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;Lkotlin/coroutines/Continuation;)V
   #72 = Methodref          #69.#71       // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$execute$2."<init>":(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;Lkotlin/coroutines/Continuation;)V
   #73 = Utf8               kotlin/jvm/functions/Function2
   #74 = Class              #73           // kotlin/jvm/functions/Function2
   #75 = Utf8               kotlinx/coroutines/BuildersKt
   #76 = Class              #75           // kotlinx/coroutines/BuildersKt
   #77 = Utf8               withContext
   #78 = Utf8               (Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
   #79 = NameAndType        #77:#78       // withContext:(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
   #80 = Methodref          #76.#79       // kotlinx/coroutines/BuildersKt.withContext:(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
   #81 = Utf8               $completion
   #82 = Utf8               Lkotlin/coroutines/Continuation;
   #83 = Utf8               executeMemoryPrefetch
   #84 = Utf8               ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage
   #85 = Class              #84           // ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage
   #86 = Utf8               getNodeCount
   #87 = Utf8               ()I
   #88 = NameAndType        #86:#87       // getNodeCount:()I
   #89 = Methodref          #85.#88       // ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage.getNodeCount:()I
   #90 = Utf8               kotlin/ranges/RangesKt
   #91 = Class              #90           // kotlin/ranges/RangesKt
   #92 = Utf8               until
   #93 = Utf8               (II)Lkotlin/ranges/IntRange;
   #94 = NameAndType        #92:#93       // until:(II)Lkotlin/ranges/IntRange;
   #95 = Methodref          #91.#94       // kotlin/ranges/RangesKt.until:(II)Lkotlin/ranges/IntRange;
   #96 = Utf8               kotlin/ranges/IntProgression
   #97 = Class              #96           // kotlin/ranges/IntProgression
   #98 = Utf8               step
   #99 = Utf8               (Lkotlin/ranges/IntProgression;I)Lkotlin/ranges/IntProgression;
  #100 = NameAndType        #98:#99       // step:(Lkotlin/ranges/IntProgression;I)Lkotlin/ranges/IntProgression;
  #101 = Methodref          #91.#100      // kotlin/ranges/RangesKt.step:(Lkotlin/ranges/IntProgression;I)Lkotlin/ranges/IntProgression;
  #102 = Utf8               getFirst
  #103 = NameAndType        #102:#87      // getFirst:()I
  #104 = Methodref          #97.#103      // kotlin/ranges/IntProgression.getFirst:()I
  #105 = Utf8               getLast
  #106 = NameAndType        #105:#87      // getLast:()I
  #107 = Methodref          #97.#106      // kotlin/ranges/IntProgression.getLast:()I
  #108 = Utf8               getStep
  #109 = NameAndType        #108:#87      // getStep:()I
  #110 = Methodref          #97.#109      // kotlin/ranges/IntProgression.getStep:()I
  #111 = Utf8               getNodeSegment
  #112 = Utf8               (I)Ljava/lang/foreign/MemorySegment;
  #113 = NameAndType        #111:#112     // getNodeSegment:(I)Ljava/lang/foreign/MemorySegment;
  #114 = Methodref          #85.#113      // ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage.getNodeSegment:(I)Ljava/lang/foreign/MemorySegment;
  #115 = Utf8               java/lang/foreign/ValueLayout
  #116 = Class              #115          // java/lang/foreign/ValueLayout
  #117 = Utf8               JAVA_BYTE
  #118 = Utf8               Ljava/lang/foreign/ValueLayout$OfByte;
  #119 = NameAndType        #117:#118     // JAVA_BYTE:Ljava/lang/foreign/ValueLayout$OfByte;
  #120 = Fieldref           #116.#119     // java/lang/foreign/ValueLayout.JAVA_BYTE:Ljava/lang/foreign/ValueLayout$OfByte;
  #121 = Utf8               java/lang/foreign/MemorySegment
  #122 = Class              #121          // java/lang/foreign/MemorySegment
  #123 = Utf8               get
  #124 = Utf8               (Ljava/lang/foreign/ValueLayout$OfByte;J)B
  #125 = NameAndType        #123:#124     // get:(Ljava/lang/foreign/ValueLayout$OfByte;J)B
  #126 = InterfaceMethodref #122.#125     // java/lang/foreign/MemorySegment.get:(Ljava/lang/foreign/ValueLayout$OfByte;J)B
  #127 = Utf8               [WarmUp] Memory prefetch: \u0001 páginas tocadas
  #128 = String             #127          // [WarmUp] Memory prefetch: \u0001 páginas tocadas
  #129 = Utf8               java/lang/invoke/StringConcatFactory
  #130 = Class              #129          // java/lang/invoke/StringConcatFactory
  #131 = Utf8               makeConcatWithConstants
  #132 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #133 = NameAndType        #131:#132     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #134 = Methodref          #130.#133     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #135 = MethodHandle       6:#134        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #136 = Utf8               (I)Ljava/lang/String;
  #137 = NameAndType        #131:#136     // makeConcatWithConstants:(I)Ljava/lang/String;
  #138 = InvokeDynamic      #0:#137       // #0:makeConcatWithConstants:(I)Ljava/lang/String;
  #139 = Utf8               info
  #140 = Utf8               (Ljava/lang/String;)V
  #141 = NameAndType        #139:#140     // info:(Ljava/lang/String;)V
  #142 = Methodref          #30.#141      // java/util/logging/Logger.info:(Ljava/lang/String;)V
  #143 = Utf8               segment
  #144 = Utf8               Ljava/lang/foreign/MemorySegment;
  #145 = Utf8               i
  #146 = Utf8               I
  #147 = Utf8               nodeCount
  #148 = Utf8               pageSize
  #149 = Utf8               nodesPerPage
  #150 = Utf8               touched
  #151 = Utf8               executeJitWarmUp
  #152 = Utf8               java/util/concurrent/ThreadLocalRandom
  #153 = Class              #152          // java/util/concurrent/ThreadLocalRandom
  #154 = Utf8               current
  #155 = Utf8               ()Ljava/util/concurrent/ThreadLocalRandom;
  #156 = NameAndType        #154:#155     // current:()Ljava/util/concurrent/ThreadLocalRandom;
  #157 = Methodref          #153.#156     // java/util/concurrent/ThreadLocalRandom.current:()Ljava/util/concurrent/ThreadLocalRandom;
  #158 = Utf8               calculateMapBounds
  #159 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds;
  #160 = NameAndType        #158:#159     // calculateMapBounds:()Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds;
  #161 = Methodref          #2.#160       // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService.calculateMapBounds:()Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds;
  #162 = Utf8               getJitIterations
  #163 = NameAndType        #162:#87      // getJitIterations:()I
  #164 = Methodref          #43.#163      // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig.getJitIterations:()I
  #165 = Utf8               randomLocation
  #166 = Utf8               (Ljava/util/concurrent/ThreadLocalRandom;Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds;)Lext/mods/gameserver/geoengine/pathfinding/model/Location;
  #167 = NameAndType        #165:#166     // randomLocation:(Ljava/util/concurrent/ThreadLocalRandom;Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds;)Lext/mods/gameserver/geoengine/pathfinding/model/Location;
  #168 = Methodref          #2.#167       // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService.randomLocation:(Ljava/util/concurrent/ThreadLocalRandom;Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds;)Lext/mods/gameserver/geoengine/pathfinding/model/Location;
  #169 = Utf8               ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine
  #170 = Class              #169          // ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine
  #171 = Utf8               findPath
  #172 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/model/Location;Lext/mods/gameserver/geoengine/pathfinding/model/Location;)Ljava/util/List;
  #173 = NameAndType        #171:#172     // findPath:(Lext/mods/gameserver/geoengine/pathfinding/model/Location;Lext/mods/gameserver/geoengine/pathfinding/model/Location;)Ljava/util/List;
  #174 = Methodref          #170.#173     // ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine.findPath:(Lext/mods/gameserver/geoengine/pathfinding/model/Location;Lext/mods/gameserver/geoengine/pathfinding/model/Location;)Ljava/util/List;
  #175 = Utf8               [WarmUp] JIT progress: \u0001%
  #176 = String             #175          // [WarmUp] JIT progress: \u0001%
  #177 = InvokeDynamic      #1:#137       // #1:makeConcatWithConstants:(I)Ljava/lang/String;
  #178 = Utf8               fine
  #179 = NameAndType        #178:#140     // fine:(Ljava/lang/String;)V
  #180 = Methodref          #30.#179      // java/util/logging/Logger.fine:(Ljava/lang/String;)V
  #181 = Utf8               java/lang/System
  #182 = Class              #181          // java/lang/System
  #183 = Utf8               gc
  #184 = NameAndType        #183:#8       // gc:()V
  #185 = Methodref          #182.#184     // java/lang/System.gc:()V
  #186 = Long               100l
  #188 = Utf8               java/lang/Thread
  #189 = Class              #188          // java/lang/Thread
  #190 = Utf8               sleep
  #191 = Utf8               (J)V
  #192 = NameAndType        #190:#191     // sleep:(J)V
  #193 = Methodref          #189.#192     // java/lang/Thread.sleep:(J)V
  #194 = Utf8               progress
  #195 = Utf8               $i$a$-repeat-L2BRWarmUpService$executeJitWarmUp$1
  #196 = Utf8               start
  #197 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/Location;
  #198 = Utf8               end
  #199 = Utf8               random
  #200 = Utf8               Ljava/util/concurrent/ThreadLocalRandom;
  #201 = Utf8               bounds
  #202 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds;
  #203 = Utf8               iterations
  #204 = Utf8               progressInterval
  #205 = Utf8               ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds
  #206 = Class              #205          // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds
  #207 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/Location
  #208 = Class              #207          // ext/mods/gameserver/geoengine/pathfinding/model/Location
  #209 = Utf8               executeValidation
  #210 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/PerformanceMetrics
  #211 = Class              #210          // ext/mods/gameserver/geoengine/pathfinding/model/PerformanceMetrics
  #212 = Methodref          #211.#9       // ext/mods/gameserver/geoengine/pathfinding/model/PerformanceMetrics."<init>":()V
  #213 = Utf8               getValidationIterations
  #214 = NameAndType        #213:#87      // getValidationIterations:()I
  #215 = Methodref          #43.#214      // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig.getValidationIterations:()I
  #216 = Utf8               nanoTime
  #217 = Utf8               ()J
  #218 = NameAndType        #216:#217     // nanoTime:()J
  #219 = Methodref          #182.#218     // java/lang/System.nanoTime:()J
  #220 = Utf8               record
  #221 = NameAndType        #220:#191     // record:(J)V
  #222 = Methodref          #211.#221     // ext/mods/gameserver/geoengine/pathfinding/model/PerformanceMetrics.record:(J)V
  #223 = Double             50.0d
  #225 = Utf8               getPercentile
  #226 = Utf8               (D)D
  #227 = NameAndType        #225:#226     // getPercentile:(D)D
  #228 = Methodref          #211.#227     // ext/mods/gameserver/geoengine/pathfinding/model/PerformanceMetrics.getPercentile:(D)D
  #229 = Double             1000.0d
  #231 = Double             99.0d
  #233 = Double             99.9d
  #235 = Utf8               [WarmUp] Validação - P50: \u0001?s, P99: \u0001?s, P99.9: \u0001?s
  #236 = String             #235          // [WarmUp] Validação - P50: \u0001?s, P99: \u0001?s, P99.9: \u0001?s
  #237 = Utf8               (DDD)Ljava/lang/String;
  #238 = NameAndType        #131:#237     // makeConcatWithConstants:(DDD)Ljava/lang/String;
  #239 = InvokeDynamic      #2:#238       // #2:makeConcatWithConstants:(DDD)Ljava/lang/String;
  #240 = Utf8               $i$a$-measureNanoTime-L2BRWarmUpService$executeValidation$1$latency$1
  #241 = Utf8               $i$f$measureNanoTime
  #242 = Utf8               start$iv
  #243 = Utf8               J
  #244 = Utf8               this_$iv
  #245 = Utf8               $i$a$-repeat-L2BRWarmUpService$executeValidation$1
  #246 = Utf8               latency
  #247 = Utf8               it
  #248 = Utf8               metrics
  #249 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/PerformanceMetrics;
  #250 = Utf8               p50
  #251 = Utf8               D
  #252 = Utf8               p99
  #253 = Utf8               p999
  #254 = Utf8               executeParallel
  #255 = Utf8               ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2
  #256 = Class              #255          // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2
  #257 = Methodref          #256.#71      // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2."<init>":(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;Lkotlin/coroutines/Continuation;)V
  #258 = Utf8               kotlinx/coroutines/CoroutineScopeKt
  #259 = Class              #258          // kotlinx/coroutines/CoroutineScopeKt
  #260 = Utf8               coroutineScope
  #261 = Utf8               (Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #262 = NameAndType        #260:#261     // coroutineScope:(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #263 = Methodref          #259.#262     // kotlinx/coroutines/CoroutineScopeKt.coroutineScope:(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #264 = Utf8               kotlin/jvm/internal/Ref$IntRef
  #265 = Class              #264          // kotlin/jvm/internal/Ref$IntRef
  #266 = Methodref          #265.#9       // kotlin/jvm/internal/Ref$IntRef."<init>":()V
  #267 = Integer            2147483647
  #268 = Utf8               element
  #269 = NameAndType        #268:#146     // element:I
  #270 = Fieldref           #265.#269     // kotlin/jvm/internal/Ref$IntRef.element:I
  #271 = Integer            -2147483648
  #272 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #273 = MethodType         #272          //  (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #274 = Utf8               calculateMapBounds$lambda$0
  #275 = Utf8               (Lkotlin/jvm/internal/Ref$IntRef;Lkotlin/jvm/internal/Ref$IntRef;Lkotlin/jvm/internal/Ref$IntRef;Lkotlin/jvm/internal/Ref$IntRef;ILext/mods/gameserver/geoengine/pathfinding/model/PathNode;)Lkotlin/Unit;
  #276 = NameAndType        #274:#275     // calculateMapBounds$lambda$0:(Lkotlin/jvm/internal/Ref$IntRef;Lkotlin/jvm/internal/Ref$IntRef;Lkotlin/jvm/internal/Ref$IntRef;Lkotlin/jvm/internal/Ref$IntRef;ILext/mods/gameserver/geoengine/pathfinding/model/PathNode;)Lkotlin/Unit;
  #277 = Methodref          #2.#276       // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService.calculateMapBounds$lambda$0:(Lkotlin/jvm/internal/Ref$IntRef;Lkotlin/jvm/internal/Ref$IntRef;Lkotlin/jvm/internal/Ref$IntRef;Lkotlin/jvm/internal/Ref$IntRef;ILext/mods/gameserver/geoengine/pathfinding/model/PathNode;)Lkotlin/Unit;
  #278 = MethodHandle       6:#277        // REF_invokeStatic ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService.calculateMapBounds$lambda$0:(Lkotlin/jvm/internal/Ref$IntRef;Lkotlin/jvm/internal/Ref$IntRef;Lkotlin/jvm/internal/Ref$IntRef;Lkotlin/jvm/internal/Ref$IntRef;ILext/mods/gameserver/geoengine/pathfinding/model/PathNode;)Lkotlin/Unit;
  #279 = Utf8               (Ljava/lang/Integer;Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;)Lkotlin/Unit;
  #280 = MethodType         #279          //  (Ljava/lang/Integer;Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;)Lkotlin/Unit;
  #281 = Utf8               java/lang/invoke/LambdaMetafactory
  #282 = Class              #281          // java/lang/invoke/LambdaMetafactory
  #283 = Utf8               metafactory
  #284 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #285 = NameAndType        #283:#284     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #286 = Methodref          #282.#285     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #287 = MethodHandle       6:#286        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #288 = Utf8               invoke
  #289 = Utf8               (Lkotlin/jvm/internal/Ref$IntRef;Lkotlin/jvm/internal/Ref$IntRef;Lkotlin/jvm/internal/Ref$IntRef;Lkotlin/jvm/internal/Ref$IntRef;)Lkotlin/jvm/functions/Function2;
  #290 = NameAndType        #288:#289     // invoke:(Lkotlin/jvm/internal/Ref$IntRef;Lkotlin/jvm/internal/Ref$IntRef;Lkotlin/jvm/internal/Ref$IntRef;Lkotlin/jvm/internal/Ref$IntRef;)Lkotlin/jvm/functions/Function2;
  #291 = InvokeDynamic      #3:#290       // #3:invoke:(Lkotlin/jvm/internal/Ref$IntRef;Lkotlin/jvm/internal/Ref$IntRef;Lkotlin/jvm/internal/Ref$IntRef;Lkotlin/jvm/internal/Ref$IntRef;)Lkotlin/jvm/functions/Function2;
  #292 = Utf8               forEachNode
  #293 = Utf8               (Lkotlin/jvm/functions/Function2;)V
  #294 = NameAndType        #292:#293     // forEachNode:(Lkotlin/jvm/functions/Function2;)V
  #295 = Methodref          #85.#294      // ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage.forEachNode:(Lkotlin/jvm/functions/Function2;)V
  #296 = Utf8               (IIII)V
  #297 = NameAndType        #5:#296       // "<init>":(IIII)V
  #298 = Methodref          #206.#297     // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds."<init>":(IIII)V
  #299 = Utf8               minX
  #300 = Utf8               Lkotlin/jvm/internal/Ref$IntRef;
  #301 = Utf8               minY
  #302 = Utf8               maxX
  #303 = Utf8               maxY
  #304 = Utf8               getMinX
  #305 = NameAndType        #304:#87      // getMinX:()I
  #306 = Methodref          #206.#305     // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds.getMinX:()I
  #307 = Utf8               getMaxX
  #308 = NameAndType        #307:#87      // getMaxX:()I
  #309 = Methodref          #206.#308     // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds.getMaxX:()I
  #310 = Utf8               nextInt
  #311 = Utf8               (II)I
  #312 = NameAndType        #310:#311     // nextInt:(II)I
  #313 = Methodref          #153.#312     // java/util/concurrent/ThreadLocalRandom.nextInt:(II)I
  #314 = Utf8               getMinY
  #315 = NameAndType        #314:#87      // getMinY:()I
  #316 = Methodref          #206.#315     // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds.getMinY:()I
  #317 = Utf8               getMaxY
  #318 = NameAndType        #317:#87      // getMaxY:()I
  #319 = Methodref          #206.#318     // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds.getMaxY:()I
  #320 = Utf8               (III)V
  #321 = NameAndType        #5:#320       // "<init>":(III)V
  #322 = Methodref          #208.#321     // ext/mods/gameserver/geoengine/pathfinding/model/Location."<init>":(III)V
  #323 = Utf8               calculateP999
  #324 = Utf8               ()D
  #325 = Utf8               getMetrics
  #326 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot;
  #327 = NameAndType        #325:#326     // getMetrics:()Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot;
  #328 = Methodref          #170.#327     // ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine.getMetrics:()Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot;
  #329 = Utf8               ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot
  #330 = Class              #329          // ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot
  #331 = Utf8               getP99Estimate
  #332 = NameAndType        #331:#217     // getP99Estimate:()J
  #333 = Methodref          #330.#332     // ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot.getP99Estimate:()J
  #334 = Double             1.5d
  #336 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot;
  #337 = Utf8               logResult
  #338 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult;)V
  #339 = Utf8               ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult
  #340 = Class              #339          // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult
  #341 = Utf8               getSuccess
  #342 = Utf8               ()Z
  #343 = NameAndType        #341:#342     // getSuccess:()Z
  #344 = Methodref          #340.#343     // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult.getSuccess:()Z
  #345 = Utf8               getFinalLatencyP99
  #346 = NameAndType        #345:#324     // getFinalLatencyP99:()D
  #347 = Methodref          #340.#346     // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult.getFinalLatencyP99:()D
  #348 = Utf8               getTargetLatencyP99Micros
  #349 = NameAndType        #348:#324     // getTargetLatencyP99Micros:()D
  #350 = Methodref          #43.#349      // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig.getTargetLatencyP99Micros:()D
  #351 = Utf8               [WarmUp] SUCESSO - P99: \u0001?s (target: \u0001?s)
  #352 = String             #351          // [WarmUp] SUCESSO - P99: \u0001?s (target: \u0001?s)
  #353 = Utf8               (DD)Ljava/lang/String;
  #354 = NameAndType        #131:#353     // makeConcatWithConstants:(DD)Ljava/lang/String;
  #355 = InvokeDynamic      #4:#354       // #4:makeConcatWithConstants:(DD)Ljava/lang/String;
  #356 = Utf8               [WarmUp] ALERTA - P99: \u0001?s excede target (\u0001?s)
  #357 = String             #356          // [WarmUp] ALERTA - P99: \u0001?s excede target (\u0001?s)
  #358 = InvokeDynamic      #5:#354       // #5:makeConcatWithConstants:(DD)Ljava/lang/String;
  #359 = Utf8               warning
  #360 = NameAndType        #359:#140     // warning:(Ljava/lang/String;)V
  #361 = Methodref          #30.#360      // java/util/logging/Logger.warning:(Ljava/lang/String;)V
  #362 = Utf8               getTotalTimeMs
  #363 = NameAndType        #362:#217     // getTotalTimeMs:()J
  #364 = Methodref          #340.#363     // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult.getTotalTimeMs:()J
  #365 = Utf8               getMemoryPhaseMs
  #366 = NameAndType        #365:#217     // getMemoryPhaseMs:()J
  #367 = Methodref          #340.#366     // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult.getMemoryPhaseMs:()J
  #368 = Utf8               getJitPhaseMs
  #369 = NameAndType        #368:#217     // getJitPhaseMs:()J
  #370 = Methodref          #340.#369     // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult.getJitPhaseMs:()J
  #371 = Utf8               [WarmUp] Tempo total: \u0001ms (Memory: \u0001ms, JIT: \u0001ms)
  #372 = String             #371          // [WarmUp] Tempo total: \u0001ms (Memory: \u0001ms, JIT: \u0001ms)
  #373 = Utf8               (JJJ)Ljava/lang/String;
  #374 = NameAndType        #131:#373     // makeConcatWithConstants:(JJJ)Ljava/lang/String;
  #375 = InvokeDynamic      #6:#374       // #6:makeConcatWithConstants:(JJJ)Ljava/lang/String;
  #376 = Utf8               result
  #377 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult;
  #378 = Utf8               measureTimeMillis
  #379 = Utf8               (Lkotlin/jvm/functions/Function0;)J
  #380 = Utf8               (Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;)J
  #381 = Utf8               currentTimeMillis
  #382 = NameAndType        #381:#217     // currentTimeMillis:()J
  #383 = Methodref          #182.#382     // java/lang/System.currentTimeMillis:()J
  #384 = Utf8               kotlin/jvm/functions/Function0
  #385 = Class              #384          // kotlin/jvm/functions/Function0
  #386 = Utf8               ()Ljava/lang/Object;
  #387 = NameAndType        #288:#386     // invoke:()Ljava/lang/Object;
  #388 = InterfaceMethodref #385.#387     // kotlin/jvm/functions/Function0.invoke:()Ljava/lang/Object;
  #389 = Utf8               $i$f$measureTimeMillis
  #390 = Utf8               block
  #391 = Utf8               Lkotlin/jvm/functions/Function0;
  #392 = Utf8               measureNanoTime
  #393 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/PathNode
  #394 = Class              #393          // ext/mods/gameserver/geoengine/pathfinding/model/PathNode
  #395 = Utf8               toLocation
  #396 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/model/Location;
  #397 = NameAndType        #395:#396     // toLocation:()Lext/mods/gameserver/geoengine/pathfinding/model/Location;
  #398 = Methodref          #394.#397     // ext/mods/gameserver/geoengine/pathfinding/model/PathNode.toLocation:()Lext/mods/gameserver/geoengine/pathfinding/model/Location;
  #399 = Utf8               getX
  #400 = NameAndType        #399:#87      // getX:()I
  #401 = Methodref          #208.#400     // ext/mods/gameserver/geoengine/pathfinding/model/Location.getX:()I
  #402 = Utf8               java/lang/Math
  #403 = Class              #402          // java/lang/Math
  #404 = Utf8               min
  #405 = NameAndType        #404:#311     // min:(II)I
  #406 = Methodref          #403.#405     // java/lang/Math.min:(II)I
  #407 = Utf8               getY
  #408 = NameAndType        #407:#87      // getY:()I
  #409 = Methodref          #208.#408     // ext/mods/gameserver/geoengine/pathfinding/model/Location.getY:()I
  #410 = Utf8               max
  #411 = NameAndType        #410:#311     // max:(II)I
  #412 = Methodref          #403.#411     // java/lang/Math.max:(II)I
  #413 = Utf8               kotlin/Unit
  #414 = Class              #413          // kotlin/Unit
  #415 = Utf8               INSTANCE
  #416 = Utf8               Lkotlin/Unit;
  #417 = NameAndType        #415:#416     // INSTANCE:Lkotlin/Unit;
  #418 = Fieldref           #414.#417     // kotlin/Unit.INSTANCE:Lkotlin/Unit;
  #419 = Utf8               loc
  #420 = Utf8               $minX
  #421 = Utf8               $minY
  #422 = Utf8               $maxX
  #423 = Utf8               $maxY
  #424 = Utf8               node
  #425 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;
  #426 = Utf8               access$getLogger$p
  #427 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)Ljava/util/logging/Logger;
  #428 = Utf8               $this
  #429 = Utf8               access$getConfig$p
  #430 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;
  #431 = Utf8               access$executeMemoryPrefetch
  #432 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)V
  #433 = NameAndType        #83:#8        // executeMemoryPrefetch:()V
  #434 = Methodref          #2.#433       // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService.executeMemoryPrefetch:()V
  #435 = Utf8               access$executeJitWarmUp
  #436 = NameAndType        #151:#8       // executeJitWarmUp:()V
  #437 = Methodref          #2.#436       // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService.executeJitWarmUp:()V
  #438 = Utf8               access$executeValidation
  #439 = NameAndType        #209:#8       // executeValidation:()V
  #440 = Methodref          #2.#439       // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService.executeValidation:()V
  #441 = Utf8               access$getEngine$p
  #442 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;
  #443 = Utf8               access$calculateP999
  #444 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)D
  #445 = NameAndType        #323:#324     // calculateP999:()D
  #446 = Methodref          #2.#445       // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService.calculateP999:()D
  #447 = Utf8               access$logResult
  #448 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult;)V
  #449 = NameAndType        #337:#338     // logResult:(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult;)V
  #450 = Methodref          #2.#449       // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService.logResult:(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult;)V
  #451 = Utf8               access$calculateMapBounds
  #452 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds;
  #453 = Utf8               access$randomLocation
  #454 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;Ljava/util/concurrent/ThreadLocalRandom;Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds;)Lext/mods/gameserver/geoengine/pathfinding/model/Location;
  #455 = Utf8               Lkotlin/Metadata;
  #456 = Utf8               mv
  #457 = Integer            2
  #458 = Integer            3
  #459 = Integer            0
  #460 = Utf8               k
  #461 = Integer            1
  #462 = Utf8               xi
  #463 = Integer            48
  #464 = Utf8               d1
  #465 = Utf8               \u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0003%&\'B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\r\u001a\u00020\u000eH\u0086@¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\b\u0010\u0013\u001a\u00020\u0011H\u0002J\u000e\u0010\u0014\u001a\u00020\u000eH\u0086@¢\u0006\u0002\u0010\u000fJ\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0016H\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u000eH\u0002J\u0017\u0010 \u001a\u00020!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00110#H\u0082\bJ\u0017\u0010$\u001a\u00020!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00110#H\u0082\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006(
  #466 = Utf8               d2
  #467 = Utf8
  #468 = Utf8               kotlin.jvm.PlatformType
  #469 = Utf8               Lkotlin/Function0;
  #470 = Utf8               WarmUpConfig
  #471 = Utf8               WarmUpResult
  #472 = Utf8               MapBounds
  #473 = Utf8               Brproject
  #474 = Utf8               EngineMetricsSnapshot
  #475 = Utf8               java/lang/foreign/ValueLayout$OfByte
  #476 = Class              #475          // java/lang/foreign/ValueLayout$OfByte
  #477 = Utf8               OfByte
  #478 = Utf8               kotlin/jvm/internal/Ref
  #479 = Class              #478          // kotlin/jvm/internal/Ref
  #480 = Utf8               IntRef
  #481 = Utf8               L2BRWarmUpService.kt
  #482 = Utf8               Lkotlin/jvm/internal/SourceDebugExtension;
  #483 = Utf8               value
  #484 = Utf8               SMAP\nL2BRWarmUpService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 L2BRWarmUpService.kt\next/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService\n*L\n1#1,262:1\n258#1,3:263\n*S KotlinDebug\n*F\n+ 1 L2BRWarmUpService.kt\next/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService\n*L\n151#1:263,3\n*E\n
  #485 = Utf8               RuntimeInvisibleAnnotations
  #486 = Utf8               Code
  #487 = Utf8               LineNumberTable
  #488 = Utf8               LocalVariableTable
  #489 = Utf8               RuntimeInvisibleParameterAnnotations
  #490 = Utf8               StackMapTable
  #491 = Utf8               Signature
  #492 = Utf8               InnerClasses
  #493 = Utf8               SourceFile
  #494 = Utf8               SourceDebugExtension
  #495 = Utf8               RuntimeVisibleAnnotations
  #496 = Utf8               BootstrapMethods
{
  public ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService(ext.mods.gameserver.geoengine.pathfinding.core.L2BREngine, ext.mods.gameserver.geoengine.pathfinding.native.NativeStorage, ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService$WarmUpConfig);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=4
         0: aload_0
         1: invokespecial #10                 // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #14                 // Field engine:Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;
         9: aload_0
        10: aload_2
        11: putfield      #18                 // Field storage:Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
        14: aload_0
        15: aload_3
        16: putfield      #22                 // Field config:Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;
        19: aload_0
        20: ldc           #2                  // class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService
        22: invokevirtual #28                 // Method java/lang/Class.getName:()Ljava/lang/String;
        25: invokestatic  #34                 // Method java/util/logging/Logger.getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
        28: putfield      #38                 // Field logger:Ljava/util/logging/Logger;
        31: return
      LineNumberTable:
        line 33: 0
        line 34: 4
        line 35: 9
        line 36: 14
        line 38: 19
        line 33: 31
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      32     0  this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;
            0      32     1 engine   Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;
            0      32     2 storage   Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
            0      32     3 config   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #7()
          org.jetbrains.annotations.NotNull
      parameter 1:
        0: #7()
          org.jetbrains.annotations.NotNull
      parameter 2:
        0: #7()
          org.jetbrains.annotations.NotNull

  public ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService(ext.mods.gameserver.geoengine.pathfinding.core.L2BREngine, ext.mods.gameserver.geoengine.pathfinding.native.NativeStorage, ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService$WarmUpConfig, int, kotlin.jvm.internal.DefaultConstructorMarker);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    flags: (0x1001) ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=4, locals=6, args_size=6
         0: iload         4
         2: iconst_4
         3: iand
         4: ifeq          14
         7: getstatic     #47                 // Field ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig.Companion:Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig$Companion;
        10: invokevirtual #53                 // Method ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig$Companion.getDEFAULT:()Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;
        13: astore_3
        14: aload_0
        15: aload_1
        16: aload_2
        17: aload_3
        18: invokespecial #55                 // Method "<init>":(Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;)V
        21: return
      StackMapTable: number_of_entries = 1
        frame_type = 14 /* same */
      LineNumberTable:
        line 33: 0
        line 36: 7
        line 33: 14
        line 37: 21

  public final java.lang.Object execute(kotlin.coroutines.Continuation<? super ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService$WarmUpResult>);
    descriptor: (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=5, locals=2, args_size=2
         0: invokestatic  #65                 // Method kotlinx/coroutines/Dispatchers.getDefault:()Lkotlinx/coroutines/CoroutineDispatcher;
         3: checkcast     #67                 // class kotlin/coroutines/CoroutineContext
         6: new           #69                 // class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$execute$2
         9: dup
        10: aload_0
        11: aconst_null
        12: invokespecial #72                 // Method ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$execute$2."<init>":(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;Lkotlin/coroutines/Continuation;)V
        15: checkcast     #74                 // class kotlin/jvm/functions/Function2
        18: aload_1
        19: invokestatic  #80                 // Method kotlinx/coroutines/BuildersKt.withContext:(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
        22: areturn
      LineNumberTable:
        line 64: 0
        line 101: 22
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;
            0      23     1 $completion   Lkotlin/coroutines/Continuation;
    Signature: #58                          // (Lkotlin/coroutines/Continuation<-Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult;>;)Ljava/lang/Object;
    RuntimeInvisibleAnnotations:
      0: #59()
        org.jetbrains.annotations.Nullable
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #7()
          org.jetbrains.annotations.NotNull

  public final java.lang.Object executeParallel(kotlin.coroutines.Continuation<? super ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService$WarmUpResult>);
    descriptor: (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=2, args_size=2
         0: new           #256                // class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2
         3: dup
         4: aload_0
         5: aconst_null
         6: invokespecial #257                // Method ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2."<init>":(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;Lkotlin/coroutines/Continuation;)V
         9: checkcast     #74                 // class kotlin/jvm/functions/Function2
        12: aload_1
        13: invokestatic  #263                // Method kotlinx/coroutines/CoroutineScopeKt.coroutineScope:(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
        16: areturn
      LineNumberTable:
        line 165: 0
        line 200: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;
            0      17     1 $completion   Lkotlin/coroutines/Continuation;
    Signature: #58                          // (Lkotlin/coroutines/Continuation<-Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult;>;)Ljava/lang/Object;
    RuntimeInvisibleAnnotations:
      0: #59()
        org.jetbrains.annotations.Nullable
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #7()
          org.jetbrains.annotations.NotNull

  public static final java.util.logging.Logger access$getLogger$p(ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)Ljava/util/logging/Logger;
    flags: (0x1019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #38                 // Field logger:Ljava/util/logging/Logger;
         4: areturn
      LineNumberTable:
        line 33: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0 $this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;

  public static final ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService$WarmUpConfig access$getConfig$p(ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;
    flags: (0x1019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field config:Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;
         4: areturn
      LineNumberTable:
        line 33: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0 $this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;

  public static final void access$executeMemoryPrefetch(ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)V
    flags: (0x1019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #434                // Method executeMemoryPrefetch:()V
         4: return
      LineNumberTable:
        line 33: 1
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0 $this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;

  public static final void access$executeJitWarmUp(ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)V
    flags: (0x1019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #437                // Method executeJitWarmUp:()V
         4: return
      LineNumberTable:
        line 33: 1
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0 $this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;

  public static final void access$executeValidation(ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)V
    flags: (0x1019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #440                // Method executeValidation:()V
         4: return
      LineNumberTable:
        line 33: 1
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0 $this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;

  public static final ext.mods.gameserver.geoengine.pathfinding.core.L2BREngine access$getEngine$p(ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;
    flags: (0x1019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #14                 // Field engine:Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;
         4: areturn
      LineNumberTable:
        line 33: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0 $this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;

  public static final double access$calculateP999(ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)D
    flags: (0x1019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokespecial #446                // Method calculateP999:()D
         4: dreturn
      LineNumberTable:
        line 33: 1
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0 $this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;

  public static final void access$logResult(ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService, ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService$WarmUpResult);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult;)V
    flags: (0x1019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #450                // Method logResult:(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult;)V
         5: return
      LineNumberTable:
        line 33: 2
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0 $this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;
            0       6     1 result   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult;

  public static final ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService$MapBounds access$calculateMapBounds(ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds;
    flags: (0x1019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #161                // Method calculateMapBounds:()Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds;
         4: areturn
      LineNumberTable:
        line 33: 1
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0 $this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;

  public static final ext.mods.gameserver.geoengine.pathfinding.model.Location access$randomLocation(ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService, java.util.concurrent.ThreadLocalRandom, ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService$MapBounds);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;Ljava/util/concurrent/ThreadLocalRandom;Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds;)Lext/mods/gameserver/geoengine/pathfinding/model/Location;
    flags: (0x1019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: aload_2
         3: invokespecial #168                // Method randomLocation:(Ljava/util/concurrent/ThreadLocalRandom;Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds;)Lext/mods/gameserver/geoengine/pathfinding/model/Location;
         6: areturn
      LineNumberTable:
        line 33: 3
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0 $this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;
            0       7     1 random   Ljava/util/concurrent/ThreadLocalRandom;
            0       7     2 bounds   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds;
}
InnerClasses:
  public static final #474= #330 of #170; // EngineMetricsSnapshot=class ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot of class ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine
  public static final #470= #43 of #2;    // WarmUpConfig=class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig of class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService
  public static final #44= #49 of #43;    // Companion=class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig$Companion of class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig
  public static final #471= #340 of #2;   // WarmUpResult=class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult of class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService
  static final #69;                       // class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$execute$2
  static final #256;                      // class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2
  public static #477= #476 of #116;       // OfByte=class java/lang/foreign/ValueLayout$OfByte of class java/lang/foreign/ValueLayout
  public static final #480= #265 of #479; // IntRef=class kotlin/jvm/internal/Ref$IntRef of class kotlin/jvm/internal/Ref
SourceFile: "L2BRWarmUpService.kt"
SourceDebugExtension:
  SMAP
  L2BRWarmUpService.kt
  Kotlin
  *S Kotlin
  *F
  + 1 L2BRWarmUpService.kt
  ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService
  *L
  1#1,262:1
  258#1,3:263
  *S KotlinDebug
  *F
  + 1 L2BRWarmUpService.kt
  ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService
  *L
  151#1:263,3
  *E
RuntimeVisibleAnnotations:
  0: #455(#456=[I#457,I#458,I#459],#460=I#461,#462=I#463,#464=[s#465],#466=[s#40,s#467,s#11,s#12,s#15,s#16,s#19,s#20,s#5,s#6,s#35,s#36,s#468,s#56,s#377,s#57,s#83,s#467,s#151,s#209,s#254,s#158,s#202,s#165,s#197,s#199,s#200,s#201,s#323,s#467,s#337,s#376,s#378,s#467,s#390,s#469,s#392,s#470,s#471,s#472,s#473])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0003%&\'B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\r\u001a\u00020\u000eH\u0086@¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\b\u0010\u0013\u001a\u00020\u0011H\u0002J\u000e\u0010\u0014\u001a\u00020\u000eH\u0086@¢\u0006\u0002\u0010\u000fJ\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0016H\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u000eH\u0002J\u0017\u0010 \u001a\u00020!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00110#H\u0082\bJ\u0017\u0010$\u001a\u00020!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00110#H\u0082\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;","","engine","Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;","storage","Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;","config","Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;","<init>","(Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;)V","logger","Ljava/util/logging/Logger;","kotlin.jvm.PlatformType","execute","Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult;","(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;","executeMemoryPrefetch","","executeJitWarmUp","executeValidation","executeParallel","calculateMapBounds","Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds;","randomLocation","Lext/mods/gameserver/geoengine/pathfinding/model/Location;","random","Ljava/util/concurrent/ThreadLocalRandom;","bounds","calculateP999","","logResult","result","measureTimeMillis","","block","Lkotlin/Function0;","measureNanoTime","WarmUpConfig","WarmUpResult","MapBounds","Brproject"]
    )
RuntimeInvisibleAnnotations:
  0: #482(#483=[s#484])
    kotlin.jvm.internal.SourceDebugExtension(
      value=["SMAP\nL2BRWarmUpService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 L2BRWarmUpService.kt\next/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService\n*L\n1#1,262:1\n258#1,3:263\n*S KotlinDebug\n*F\n+ 1 L2BRWarmUpService.kt\next/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService\n*L\n151#1:263,3\n*E\n"]
    )
BootstrapMethods:
  0: #135 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #128 [WarmUp] Memory prefetch: \u0001 páginas tocadas
  1: #135 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #176 [WarmUp] JIT progress: \u0001%
  2: #135 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #236 [WarmUp] Validação - P50: \u0001?s, P99: \u0001?s, P99.9: \u0001?s
  3: #287 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #273 (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      #278 REF_invokeStatic ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService.calculateMapBounds$lambda$0:(Lkotlin/jvm/internal/Ref$IntRef;Lkotlin/jvm/internal/Ref$IntRef;Lkotlin/jvm/internal/Ref$IntRef;Lkotlin/jvm/internal/Ref$IntRef;ILext/mods/gameserver/geoengine/pathfinding/model/PathNode;)Lkotlin/Unit;
      #280 (Ljava/lang/Integer;Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;)Lkotlin/Unit;
  4: #135 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #352 [WarmUp] SUCESSO - P99: \u0001?s (target: \u0001?s)
  5: #135 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #357 [WarmUp] ALERTA - P99: \u0001?s excede target (\u0001?s)
  6: #135 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #372 [WarmUp] Tempo total: \u0001ms (Memory: \u0001ms, JIT: \u0001ms)
