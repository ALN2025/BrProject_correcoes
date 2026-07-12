// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService$executeParallel$2
// File: ext\mods\gameserver\geoengine\pathfinding\warmup\L2BRWarmUpService$executeParallel$2.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2.class
  Last modified 9 de jul de 2026; size 8925 bytes
  MD5 checksum 2b87bfe978b7873e59cfbc7eb2d1fdcd
  Compiled from "L2BRWarmUpService.kt"
final class ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService$executeParallel$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService$WarmUpResult>, java.lang.Object>
  minor version: 0
  major version: 69
  flags: (0x0030) ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2
  super_class: #5                         // kotlin/coroutines/jvm/internal/SuspendLambda
  interfaces: 1, fields: 5, methods: 5, attributes: 8
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2
    #2 = Class              #1            // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2
    #3 = Utf8               Lkotlin/coroutines/jvm/internal/SuspendLambda;Lkotlin/jvm/functions/Function2<Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult;>;Ljava/lang/Object;>;
    #4 = Utf8               kotlin/coroutines/jvm/internal/SuspendLambda
    #5 = Class              #4            // kotlin/coroutines/jvm/internal/SuspendLambda
    #6 = Utf8               kotlin/jvm/functions/Function2
    #7 = Class              #6            // kotlin/jvm/functions/Function2
    #8 = Utf8               <init>
    #9 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;Lkotlin/coroutines/Continuation;)V
   #10 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;Lkotlin/coroutines/Continuation<-Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2;>;)V
   #11 = Utf8               this$0
   #12 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;
   #13 = NameAndType        #11:#12       // this$0:Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;
   #14 = Fieldref           #2.#13        // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2.this$0:Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;
   #15 = Utf8               (ILkotlin/coroutines/Continuation;)V
   #16 = NameAndType        #8:#15        // "<init>":(ILkotlin/coroutines/Continuation;)V
   #17 = Methodref          #5.#16        // kotlin/coroutines/jvm/internal/SuspendLambda."<init>":(ILkotlin/coroutines/Continuation;)V
   #18 = Utf8               this
   #19 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2;
   #20 = Utf8               $receiver
   #21 = Utf8               $completion
   #22 = Utf8               Lkotlin/coroutines/Continuation;
   #23 = Utf8               invokeSuspend
   #24 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #25 = Utf8               L$1
   #26 = Utf8               Ljava/lang/Object;
   #27 = Utf8               I$0
   #28 = Utf8               I
   #29 = Utf8               Lkotlin/coroutines/jvm/internal/DebugMetadata;
   #30 = Utf8               f
   #31 = Utf8               L2BRWarmUpService.kt
   #32 = Utf8               l
   #33 = Integer            185
   #34 = Utf8               nl
   #35 = Integer            187
   #36 = Utf8               i
   #37 = Integer            0
   #38 = Utf8               s
   #39 = Utf8               L$0
   #40 = Utf8               n
   #41 = Utf8               $this$coroutineScope
   #42 = Utf8               jobs
   #43 = Utf8               workers
   #44 = Utf8               m
   #45 = Utf8               c
   #46 = Utf8               ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService$executeParallel$2
   #47 = Utf8               v
   #48 = Integer            2
   #49 = NameAndType        #39:#26       // L$0:Ljava/lang/Object;
   #50 = Fieldref           #2.#49        // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2.L$0:Ljava/lang/Object;
   #51 = Utf8               kotlinx/coroutines/CoroutineScope
   #52 = Class              #51           // kotlinx/coroutines/CoroutineScope
   #53 = Utf8               kotlin/coroutines/intrinsics/IntrinsicsKt
   #54 = Class              #53           // kotlin/coroutines/intrinsics/IntrinsicsKt
   #55 = Utf8               getCOROUTINE_SUSPENDED
   #56 = Utf8               ()Ljava/lang/Object;
   #57 = NameAndType        #55:#56       // getCOROUTINE_SUSPENDED:()Ljava/lang/Object;
   #58 = Methodref          #54.#57       // kotlin/coroutines/intrinsics/IntrinsicsKt.getCOROUTINE_SUSPENDED:()Ljava/lang/Object;
   #59 = Utf8               label
   #60 = NameAndType        #59:#28       // label:I
   #61 = Fieldref           #2.#60        // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2.label:I
   #62 = Utf8               kotlin/ResultKt
   #63 = Class              #62           // kotlin/ResultKt
   #64 = Utf8               throwOnFailure
   #65 = Utf8               (Ljava/lang/Object;)V
   #66 = NameAndType        #64:#65       // throwOnFailure:(Ljava/lang/Object;)V
   #67 = Methodref          #63.#66       // kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
   #68 = Utf8               ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService
   #69 = Class              #68           // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService
   #70 = Utf8               access$getConfig$p
   #71 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;
   #72 = NameAndType        #70:#71       // access$getConfig$p:(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;
   #73 = Methodref          #69.#72       // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService.access$getConfig$p:(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;
   #74 = Utf8               ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig
   #75 = Class              #74           // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig
   #76 = Utf8               getParallelWorkers
   #77 = Utf8               ()I
   #78 = NameAndType        #76:#77       // getParallelWorkers:()I
   #79 = Methodref          #75.#78       // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig.getParallelWorkers:()I
   #80 = Utf8               access$getLogger$p
   #81 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)Ljava/util/logging/Logger;
   #82 = NameAndType        #80:#81       // access$getLogger$p:(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)Ljava/util/logging/Logger;
   #83 = Methodref          #69.#82       // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService.access$getLogger$p:(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)Ljava/util/logging/Logger;
   #84 = Utf8               [WarmUp] Warm-up paralelo com \u0001 workers...
   #85 = String             #84           // [WarmUp] Warm-up paralelo com \u0001 workers...
   #86 = Utf8               java/lang/invoke/StringConcatFactory
   #87 = Class              #86           // java/lang/invoke/StringConcatFactory
   #88 = Utf8               makeConcatWithConstants
   #89 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #90 = NameAndType        #88:#89       // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #91 = Methodref          #87.#90       // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #92 = MethodHandle       6:#91         // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #93 = Utf8               (I)Ljava/lang/String;
   #94 = NameAndType        #88:#93       // makeConcatWithConstants:(I)Ljava/lang/String;
   #95 = InvokeDynamic      #0:#94        // #0:makeConcatWithConstants:(I)Ljava/lang/String;
   #96 = Utf8               java/util/logging/Logger
   #97 = Class              #96           // java/util/logging/Logger
   #98 = Utf8               info
   #99 = Utf8               (Ljava/lang/String;)V
  #100 = NameAndType        #98:#99       // info:(Ljava/lang/String;)V
  #101 = Methodref          #97.#100      // java/util/logging/Logger.info:(Ljava/lang/String;)V
  #102 = Utf8               kotlin/ranges/RangesKt
  #103 = Class              #102          // kotlin/ranges/RangesKt
  #104 = Utf8               until
  #105 = Utf8               (II)Lkotlin/ranges/IntRange;
  #106 = NameAndType        #104:#105     // until:(II)Lkotlin/ranges/IntRange;
  #107 = Methodref          #103.#106     // kotlin/ranges/RangesKt.until:(II)Lkotlin/ranges/IntRange;
  #108 = Utf8               java/lang/Iterable
  #109 = Class              #108          // java/lang/Iterable
  #110 = Utf8               java/util/ArrayList
  #111 = Class              #110          // java/util/ArrayList
  #112 = Utf8               kotlin/collections/CollectionsKt
  #113 = Class              #112          // kotlin/collections/CollectionsKt
  #114 = Utf8               collectionSizeOrDefault
  #115 = Utf8               (Ljava/lang/Iterable;I)I
  #116 = NameAndType        #114:#115     // collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
  #117 = Methodref          #113.#116     // kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
  #118 = Utf8               (I)V
  #119 = NameAndType        #8:#118       // "<init>":(I)V
  #120 = Methodref          #111.#119     // java/util/ArrayList."<init>":(I)V
  #121 = Utf8               java/util/Collection
  #122 = Class              #121          // java/util/Collection
  #123 = Utf8               iterator
  #124 = Utf8               ()Ljava/util/Iterator;
  #125 = NameAndType        #123:#124     // iterator:()Ljava/util/Iterator;
  #126 = InterfaceMethodref #109.#125     // java/lang/Iterable.iterator:()Ljava/util/Iterator;
  #127 = Utf8               java/util/Iterator
  #128 = Class              #127          // java/util/Iterator
  #129 = Utf8               hasNext
  #130 = Utf8               ()Z
  #131 = NameAndType        #129:#130     // hasNext:()Z
  #132 = InterfaceMethodref #128.#131     // java/util/Iterator.hasNext:()Z
  #133 = Utf8               kotlin/collections/IntIterator
  #134 = Class              #133          // kotlin/collections/IntIterator
  #135 = Utf8               nextInt
  #136 = NameAndType        #135:#77      // nextInt:()I
  #137 = Methodref          #134.#136     // kotlin/collections/IntIterator.nextInt:()I
  #138 = Utf8               kotlinx/coroutines/Dispatchers
  #139 = Class              #138          // kotlinx/coroutines/Dispatchers
  #140 = Utf8               getDefault
  #141 = Utf8               ()Lkotlinx/coroutines/CoroutineDispatcher;
  #142 = NameAndType        #140:#141     // getDefault:()Lkotlinx/coroutines/CoroutineDispatcher;
  #143 = Methodref          #139.#142     // kotlinx/coroutines/Dispatchers.getDefault:()Lkotlinx/coroutines/CoroutineDispatcher;
  #144 = Utf8               kotlin/coroutines/CoroutineContext
  #145 = Class              #144          // kotlin/coroutines/CoroutineContext
  #146 = Utf8               ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2$jobs$1$1
  #147 = Class              #146          // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2$jobs$1$1
  #148 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;IILkotlin/coroutines/Continuation;)V
  #149 = NameAndType        #8:#148       // "<init>":(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;IILkotlin/coroutines/Continuation;)V
  #150 = Methodref          #147.#149     // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2$jobs$1$1."<init>":(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;IILkotlin/coroutines/Continuation;)V
  #151 = Utf8               kotlinx/coroutines/BuildersKt
  #152 = Class              #151          // kotlinx/coroutines/BuildersKt
  #153 = Utf8               async$default
  #154 = Utf8               (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Deferred;
  #155 = NameAndType        #153:#154     // async$default:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Deferred;
  #156 = Methodref          #152.#155     // kotlinx/coroutines/BuildersKt.async$default:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Deferred;
  #157 = Utf8               add
  #158 = Utf8               (Ljava/lang/Object;)Z
  #159 = NameAndType        #157:#158     // add:(Ljava/lang/Object;)Z
  #160 = InterfaceMethodref #122.#159     // java/util/Collection.add:(Ljava/lang/Object;)Z
  #161 = Utf8               java/util/List
  #162 = Class              #161          // java/util/List
  #163 = Utf8               kotlin/coroutines/Continuation
  #164 = Class              #163          // kotlin/coroutines/Continuation
  #165 = Utf8               kotlin/coroutines/jvm/internal/SpillingKt
  #166 = Class              #165          // kotlin/coroutines/jvm/internal/SpillingKt
  #167 = Utf8               nullOutSpilledVariable
  #168 = NameAndType        #167:#24      // nullOutSpilledVariable:(Ljava/lang/Object;)Ljava/lang/Object;
  #169 = Methodref          #166.#168     // kotlin/coroutines/jvm/internal/SpillingKt.nullOutSpilledVariable:(Ljava/lang/Object;)Ljava/lang/Object;
  #170 = NameAndType        #25:#26       // L$1:Ljava/lang/Object;
  #171 = Fieldref           #2.#170       // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2.L$1:Ljava/lang/Object;
  #172 = NameAndType        #27:#28       // I$0:I
  #173 = Fieldref           #2.#172       // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2.I$0:I
  #174 = Utf8               kotlinx/coroutines/AwaitKt
  #175 = Class              #174          // kotlinx/coroutines/AwaitKt
  #176 = Utf8               awaitAll
  #177 = Utf8               (Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #178 = NameAndType        #176:#177     // awaitAll:(Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #179 = Methodref          #175.#178     // kotlinx/coroutines/AwaitKt.awaitAll:(Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #180 = Utf8               access$executeValidation
  #181 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)V
  #182 = NameAndType        #180:#181     // access$executeValidation:(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)V
  #183 = Methodref          #69.#182      // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService.access$executeValidation:(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)V
  #184 = Utf8               access$getEngine$p
  #185 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;
  #186 = NameAndType        #184:#185     // access$getEngine$p:(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;
  #187 = Methodref          #69.#186      // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService.access$getEngine$p:(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;
  #188 = Utf8               ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine
  #189 = Class              #188          // ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine
  #190 = Utf8               getMetrics
  #191 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot;
  #192 = NameAndType        #190:#191     // getMetrics:()Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot;
  #193 = Methodref          #189.#192     // ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine.getMetrics:()Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot;
  #194 = Utf8               ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult
  #195 = Class              #194          // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult
  #196 = Utf8               ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot
  #197 = Class              #196          // ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot
  #198 = Utf8               getP50Estimate
  #199 = Utf8               ()J
  #200 = NameAndType        #198:#199     // getP50Estimate:()J
  #201 = Methodref          #197.#200     // ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot.getP50Estimate:()J
  #202 = Utf8               getP99Estimate
  #203 = NameAndType        #202:#199     // getP99Estimate:()J
  #204 = Methodref          #197.#203     // ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot.getP99Estimate:()J
  #205 = Utf8               access$calculateP999
  #206 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)D
  #207 = NameAndType        #205:#206     // access$calculateP999:(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)D
  #208 = Methodref          #69.#207      // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService.access$calculateP999:(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)D
  #209 = Utf8               getTargetLatencyP99Micros
  #210 = Utf8               ()D
  #211 = NameAndType        #209:#210     // getTargetLatencyP99Micros:()D
  #212 = Methodref          #75.#211      // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig.getTargetLatencyP99Micros:()D
  #213 = Utf8               (JJJJDDDZ)V
  #214 = NameAndType        #8:#213       // "<init>":(JJJJDDDZ)V
  #215 = Methodref          #195.#214     // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult."<init>":(JJJJDDDZ)V
  #216 = Utf8               java/lang/IllegalStateException
  #217 = Class              #216          // java/lang/IllegalStateException
  #218 = Utf8               call to \'resume\' before \'invoke\' with coroutine
  #219 = String             #218          // call to \'resume\' before \'invoke\' with coroutine
  #220 = NameAndType        #8:#99        // "<init>":(Ljava/lang/String;)V
  #221 = Methodref          #217.#220     // java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
  #222 = Utf8               $i$a$-map-L2BRWarmUpService$executeParallel$2$jobs$1
  #223 = Utf8               workerId
  #224 = Utf8               item$iv$iv
  #225 = Utf8               $i$f$mapTo
  #226 = Utf8               $this$mapTo$iv$iv
  #227 = Utf8               Ljava/lang/Iterable;
  #228 = Utf8               destination$iv$iv
  #229 = Utf8               Ljava/util/Collection;
  #230 = Utf8               $i$f$map
  #231 = Utf8               $this$map$iv
  #232 = Utf8               Ljava/util/List;
  #233 = Utf8               metrics
  #234 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot;
  #235 = Utf8               $result
  #236 = Utf8               Lkotlinx/coroutines/CoroutineScope;
  #237 = Utf8               java/lang/Object
  #238 = Class              #237          // java/lang/Object
  #239 = Utf8               create
  #240 = Utf8               (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
  #241 = Utf8               (Ljava/lang/Object;Lkotlin/coroutines/Continuation<*>;)Lkotlin/coroutines/Continuation<Lkotlin/Unit;>;
  #242 = NameAndType        #8:#9         // "<init>":(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;Lkotlin/coroutines/Continuation;)V
  #243 = Methodref          #2.#242       // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2."<init>":(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;Lkotlin/coroutines/Continuation;)V
  #244 = Utf8               value
  #245 = Utf8               invoke
  #246 = Utf8               (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #247 = Utf8               (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult;>;)Ljava/lang/Object;
  #248 = NameAndType        #239:#240     // create:(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
  #249 = Methodref          #2.#248       // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2.create:(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
  #250 = Utf8               kotlin/Unit
  #251 = Class              #250          // kotlin/Unit
  #252 = Utf8               INSTANCE
  #253 = Utf8               Lkotlin/Unit;
  #254 = NameAndType        #252:#253     // INSTANCE:Lkotlin/Unit;
  #255 = Fieldref           #251.#254     // kotlin/Unit.INSTANCE:Lkotlin/Unit;
  #256 = NameAndType        #23:#24       // invokeSuspend:(Ljava/lang/Object;)Ljava/lang/Object;
  #257 = Methodref          #2.#256       // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2.invokeSuspend:(Ljava/lang/Object;)Ljava/lang/Object;
  #258 = Utf8               p1
  #259 = Utf8               p2
  #260 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #261 = NameAndType        #245:#246     // invoke:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #262 = Methodref          #2.#261       // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2.invoke:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #263 = Utf8               Lkotlin/Metadata;
  #264 = Utf8               mv
  #265 = Integer            3
  #266 = Utf8               k
  #267 = Utf8               xi
  #268 = Integer            48
  #269 = Utf8               d1
  #270 = Utf8               \u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n
  #271 = Utf8               d2
  #272 = Utf8               <anonymous>
  #273 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult;
  #274 = Utf8               executeParallel
  #275 = Utf8               (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #276 = NameAndType        #274:#275     // executeParallel:(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #277 = Utf8               EngineMetricsSnapshot
  #278 = Utf8               WarmUpConfig
  #279 = Utf8               WarmUpResult
  #280 = Utf8               Lkotlin/jvm/internal/SourceDebugExtension;
  #281 = Utf8               SMAP\nL2BRWarmUpService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 L2BRWarmUpService.kt\next/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,262:1\n1586#2:263\n1661#2,3:264\n*S KotlinDebug\n*F\n+ 1 L2BRWarmUpService.kt\next/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2\n*L\n169#1:263\n169#1:264,3\n*E\n
  #282 = Utf8               Code
  #283 = Utf8               LocalVariableTable
  #284 = Utf8               Signature
  #285 = Utf8               StackMapTable
  #286 = Utf8               LineNumberTable
  #287 = Utf8               InnerClasses
  #288 = Utf8               EnclosingMethod
  #289 = Utf8               SourceFile
  #290 = Utf8               SourceDebugExtension
  #291 = Utf8               RuntimeVisibleAnnotations
  #292 = Utf8               RuntimeInvisibleAnnotations
  #293 = Utf8               BootstrapMethods
{
  java.lang.Object L$1;
    descriptor: Ljava/lang/Object;
    flags: (0x0000)

  int I$0;
    descriptor: I
    flags: (0x0000)

  int label;
    descriptor: I
    flags: (0x0000)

  final ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService this$0;
    descriptor: Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService$executeParallel$2(ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService, kotlin.coroutines.Continuation<? super ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService$executeParallel$2>);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;Lkotlin/coroutines/Continuation;)V
    flags: (0x0000)
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: putfield      #14                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;
         5: aload_0
         6: iconst_2
         7: aload_2
         8: invokespecial #17                 // Method kotlin/coroutines/jvm/internal/SuspendLambda."<init>":(ILkotlin/coroutines/Continuation;)V
        11: return
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2;
            0      12     1 $receiver   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;
            0      12     2 $completion   Lkotlin/coroutines/Continuation;
    Signature: #10                          // (Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;Lkotlin/coroutines/Continuation<-Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2;>;)V

  public final java.lang.Object invokeSuspend(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Ljava/lang/Object;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=20, locals=17, args_size=2
         0: aload_0
         1: getfield      #50                 // Field L$0:Ljava/lang/Object;
         4: checkcast     #52                 // class kotlinx/coroutines/CoroutineScope
         7: astore_2
         8: invokestatic  #58                 // Method kotlin/coroutines/intrinsics/IntrinsicsKt.getCOROUTINE_SUSPENDED:()Ljava/lang/Object;
        11: astore        16
        13: aload_0
        14: getfield      #61                 // Field label:I
        17: tableswitch   { // 0 to 1

                       0: 40

                       1: 254
                 default: 349
            }
        40: aload_1
        41: invokestatic  #67                 // Method kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
        44: aload_0
        45: getfield      #14                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;
        48: invokestatic  #73                 // Method ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService.access$getConfig$p:(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;
        51: invokevirtual #79                 // Method ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig.getParallelWorkers:()I
        54: istore_3
        55: aload_0
        56: getfield      #14                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;
        59: invokestatic  #83                 // Method ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService.access$getLogger$p:(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)Ljava/util/logging/Logger;
        62: iload_3
        63: invokedynamic #95,  0             // InvokeDynamic #0:makeConcatWithConstants:(I)Ljava/lang/String;
        68: invokevirtual #101                // Method java/util/logging/Logger.info:(Ljava/lang/String;)V
        71: iconst_0
        72: iload_3
        73: invokestatic  #107                // Method kotlin/ranges/RangesKt.until:(II)Lkotlin/ranges/IntRange;
        76: checkcast     #109                // class java/lang/Iterable
        79: astore        5
        81: aload_0
        82: getfield      #14                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;
        85: astore        6
        87: iconst_0
        88: istore        7
        90: aload         5
        92: astore        8
        94: new           #111                // class java/util/ArrayList
        97: dup
        98: aload         5
       100: bipush        10
       102: invokestatic  #117                // Method kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
       105: invokespecial #120                // Method java/util/ArrayList."<init>":(I)V
       108: checkcast     #122                // class java/util/Collection
       111: astore        9
       113: iconst_0
       114: istore        10
       116: aload         8
       118: invokeinterface #126,  1          // InterfaceMethod java/lang/Iterable.iterator:()Ljava/util/Iterator;
       123: astore        11
       125: aload         11
       127: invokeinterface #132,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       132: ifeq          198
       135: aload         11
       137: checkcast     #134                // class kotlin/collections/IntIterator
       140: invokevirtual #137                // Method kotlin/collections/IntIterator.nextInt:()I
       143: istore        12
       145: aload         9
       147: iload         12
       149: istore        13
       151: astore        15
       153: iconst_0
       154: istore        14
       156: aload_2
       157: invokestatic  #143                // Method kotlinx/coroutines/Dispatchers.getDefault:()Lkotlinx/coroutines/CoroutineDispatcher;
       160: checkcast     #145                // class kotlin/coroutines/CoroutineContext
       163: aconst_null
       164: new           #147                // class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2$jobs$1$1
       167: dup
       168: aload         6
       170: iload_3
       171: iload         13
       173: aconst_null
       174: invokespecial #150                // Method ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2$jobs$1$1."<init>":(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;IILkotlin/coroutines/Continuation;)V
       177: checkcast     #7                  // class kotlin/jvm/functions/Function2
       180: iconst_2
       181: aconst_null
       182: invokestatic  #156                // Method kotlinx/coroutines/BuildersKt.async$default:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Deferred;
       185: nop
       186: aload         15
       188: swap
       189: invokeinterface #160,  2          // InterfaceMethod java/util/Collection.add:(Ljava/lang/Object;)Z
       194: pop
       195: goto          125
       198: aload         9
       200: checkcast     #162                // class java/util/List
       203: nop
       204: astore        4
       206: aload         4
       208: checkcast     #122                // class java/util/Collection
       211: aload_0
       212: checkcast     #164                // class kotlin/coroutines/Continuation
       215: aload_0
       216: aload_2
       217: invokestatic  #169                // Method kotlin/coroutines/jvm/internal/SpillingKt.nullOutSpilledVariable:(Ljava/lang/Object;)Ljava/lang/Object;
       220: putfield      #50                 // Field L$0:Ljava/lang/Object;
       223: aload_0
       224: aload         4
       226: invokestatic  #169                // Method kotlin/coroutines/jvm/internal/SpillingKt.nullOutSpilledVariable:(Ljava/lang/Object;)Ljava/lang/Object;
       229: putfield      #171                // Field L$1:Ljava/lang/Object;
       232: aload_0
       233: iload_3
       234: putfield      #173                // Field I$0:I
       237: aload_0
       238: iconst_1
       239: putfield      #61                 // Field label:I
       242: invokestatic  #179                // Method kotlinx/coroutines/AwaitKt.awaitAll:(Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
       245: dup
       246: aload         16
       248: if_acmpne     273
       251: aload         16
       253: areturn
       254: aload_0
       255: getfield      #173                // Field I$0:I
       258: istore_3
       259: aload_0
       260: getfield      #171                // Field L$1:Ljava/lang/Object;
       263: checkcast     #162                // class java/util/List
       266: astore        4
       268: aload_1
       269: invokestatic  #67                 // Method kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
       272: aload_1
       273: pop
       274: aload_0
       275: getfield      #14                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;
       278: invokestatic  #183                // Method ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService.access$executeValidation:(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)V
       281: aload_0
       282: getfield      #14                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;
       285: invokestatic  #187                // Method ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService.access$getEngine$p:(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;
       288: invokevirtual #193                // Method ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine.getMetrics:()Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot;
       291: astore        5
       293: new           #195                // class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult
       296: dup
       297: lconst_0
       298: lconst_0
       299: lconst_0
       300: lconst_0
       301: aload         5
       303: invokevirtual #201                // Method ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot.getP50Estimate:()J
       306: l2d
       307: aload         5
       309: invokevirtual #204                // Method ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot.getP99Estimate:()J
       312: l2d
       313: aload_0
       314: getfield      #14                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;
       317: invokestatic  #208                // Method ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService.access$calculateP999:(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)D
       320: aload         5
       322: invokevirtual #204                // Method ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot.getP99Estimate:()J
       325: l2d
       326: aload_0
       327: getfield      #14                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;
       330: invokestatic  #73                 // Method ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService.access$getConfig$p:(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;
       333: invokevirtual #212                // Method ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig.getTargetLatencyP99Micros:()D
       336: dcmpg
       337: ifgt          344
       340: iconst_1
       341: goto          345
       344: iconst_0
       345: invokespecial #215                // Method ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult."<init>":(JJJJDDDZ)V
       348: areturn
       349: new           #217                // class java/lang/IllegalStateException
       352: dup
       353: ldc           #219                // String call to \'resume\' before \'invoke\' with coroutine
       355: invokespecial #221                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
       358: athrow
      StackMapTable: number_of_entries = 8
        frame_type = 255 /* full_frame */
          offset_delta = 40
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 84
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, int, top, class java/lang/Iterable, class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService, int, class java/lang/Iterable, class java/util/Collection, int, class java/util/Iterator, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 251 /* same_frame_extended */
          offset_delta = 72
        frame_type = 255 /* full_frame */
          offset_delta = 55
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 18
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, int, class java/util/List, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = [ class java/lang/Object ]
        frame_type = 255 /* full_frame */
          offset_delta = 70
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, int, class java/util/List, class ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = [ uninitialized 293, uninitialized 293, long, long, long, long, double, double, double ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, int, class java/util/List, class ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = [ uninitialized 293, uninitialized 293, long, long, long, long, double, double, double, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 3
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = []
      LineNumberTable:
        line 165: 11
        line 166: 44
        line 167: 55
        line 169: 71
        line 263: 90
        line 264: 116
        line 265: 145
        line 170: 156
        line 182: 185
        line 265: 189
        line 266: 198
        line 263: 203
        line 169: 204
        line 185: 206
        line 165: 251
        line 187: 273
        line 189: 281
        line 190: 293
        line 191: 297
        line 192: 298
        line 193: 299
        line 194: 300
        line 195: 301
        line 196: 307
        line 197: 313
        line 198: 320
        line 190: 345
        line 199: 348
        line 165: 349
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          156      30    14 $i$a$-map-L2BRWarmUpService$executeParallel$2$jobs$1   I
          153      33    13 workerId   I
          145      50    12 item$iv$iv   I
          116      84    10 $i$f$mapTo   I
          113      87     8 $this$mapTo$iv$iv   Ljava/lang/Iterable;
          113      87     9 destination$iv$iv   Ljava/util/Collection;
           90     114     7 $i$f$map   I
           87     117     5 $this$map$iv   Ljava/lang/Iterable;
           55     199     3 workers   I
          206      48     4  jobs   Ljava/util/List;
          293      56     5 metrics   Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot;
            0     359     0  this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2;
            0     359     1 $result   Ljava/lang/Object;
          268      81     4  jobs   Ljava/util/List;
          259      90     3 workers   I
           11     348     2 $this$coroutineScope   Lkotlinx/coroutines/CoroutineScope;

  public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object, kotlin.coroutines.Continuation<?>);
    descriptor: (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=4, args_size=3
         0: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2
         3: dup
         4: aload_0
         5: getfield      #14                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;
         8: aload_2
         9: invokespecial #243                // Method "<init>":(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;Lkotlin/coroutines/Continuation;)V
        12: astore_3
        13: aload_3
        14: aload_1
        15: putfield      #50                 // Field L$0:Ljava/lang/Object;
        18: aload_3
        19: checkcast     #164                // class kotlin/coroutines/Continuation
        22: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2;
            0      23     1 value   Ljava/lang/Object;
            0      23     2 $completion   Lkotlin/coroutines/Continuation;
    Signature: #241                         // (Ljava/lang/Object;Lkotlin/coroutines/Continuation<*>;)Lkotlin/coroutines/Continuation<Lkotlin/Unit;>;

  public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService$WarmUpResult>);
    descriptor: (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: aload_2
         3: invokevirtual #249                // Method create:(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
         6: checkcast     #2                  // class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2
         9: getstatic     #255                // Field kotlin/Unit.INSTANCE:Lkotlin/Unit;
        12: invokevirtual #257                // Method invokeSuspend:(Ljava/lang/Object;)Ljava/lang/Object;
        15: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2;
            0      16     1    p1   Lkotlinx/coroutines/CoroutineScope;
            0      16     2    p2   Lkotlin/coroutines/Continuation;
    Signature: #247                         // (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult;>;)Ljava/lang/Object;

  public java.lang.Object invoke(java.lang.Object, java.lang.Object);
    descriptor: (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: checkcast     #52                 // class kotlinx/coroutines/CoroutineScope
         5: aload_2
         6: checkcast     #164                // class kotlin/coroutines/Continuation
         9: invokevirtual #262                // Method invoke:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
        12: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2;
            0      13     1    p1   Ljava/lang/Object;
            0      13     2    p2   Ljava/lang/Object;
}
InnerClasses:
  public static final #277= #197 of #189; // EngineMetricsSnapshot=class ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot of class ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine
  public static final #278= #75 of #69;   // WarmUpConfig=class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig of class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService
  public static final #279= #195 of #69;  // WarmUpResult=class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult of class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService
  static final #2;                        // class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2
  static final #147;                      // class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2$jobs$1$1
EnclosingMethod: #69.#276               // ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService.executeParallel
Signature: #3                           // Lkotlin/coroutines/jvm/internal/SuspendLambda;Lkotlin/jvm/functions/Function2<Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult;>;Ljava/lang/Object;>;
SourceFile: "L2BRWarmUpService.kt"
SourceDebugExtension:
  SMAP
  L2BRWarmUpService.kt
  Kotlin
  *S Kotlin
  *F
  + 1 L2BRWarmUpService.kt
  ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2
  + 2 _Collections.kt
  kotlin/collections/CollectionsKt___CollectionsKt
  *L
  1#1,262:1
  1586#2:263
  1661#2,3:264
  *S KotlinDebug
  *F
  + 1 L2BRWarmUpService.kt
  ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2
  *L
  169#1:263
  169#1:264,3
  *E
RuntimeVisibleAnnotations:
  0: #29(#30=s#31,#32=[I#33],#34=[I#35],#36=[I#37,I#37,I#37],#38=[s#39,s#25,s#27],#40=[s#41,s#42,s#43],#44=s#23,#45=s#46,#47=I#48)
    kotlin.coroutines.jvm.internal.DebugMetadata(
      f="L2BRWarmUpService.kt"
      l=[185]
      nl=[187]
      i=[0,0,0]
      s=["L$0","L$1","I$0"]
      n=["$this$coroutineScope","jobs","workers"]
      m="invokeSuspend"
      c="ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService$executeParallel$2"
      v=2
    )
  1: #263(#264=[I#48,I#265,I#37],#266=I#265,#267=I#268,#269=[s#270],#271=[s#272,s#273,s#236])
    kotlin.Metadata(
      mv=[2,3,0]
      k=3
      xi=48
      d1=["\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"]
      d2=["<anonymous>","Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult;","Lkotlinx/coroutines/CoroutineScope;"]
    )
RuntimeInvisibleAnnotations:
  0: #280(#244=[s#281])
    kotlin.jvm.internal.SourceDebugExtension(
      value=["SMAP\nL2BRWarmUpService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 L2BRWarmUpService.kt\next/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,262:1\n1586#2:263\n1661#2,3:264\n*S KotlinDebug\n*F\n+ 1 L2BRWarmUpService.kt\next/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2\n*L\n169#1:263\n169#1:264,3\n*E\n"]
    )
BootstrapMethods:
  0: #92 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #85 [WarmUp] Warm-up paralelo com \u0001 workers...
