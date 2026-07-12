// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService$execute$2
// File: ext\mods\gameserver\geoengine\pathfinding\warmup\L2BRWarmUpService$execute$2.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$execute$2.class
  Last modified 9 de jul de 2026; size 8029 bytes
  MD5 checksum 2859f2dda37f25acb2d5771d8a12716e
  Compiled from "L2BRWarmUpService.kt"
final class ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService$execute$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService$WarmUpResult>, java.lang.Object>
  minor version: 0
  major version: 69
  flags: (0x0030) ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$execute$2
  super_class: #5                         // kotlin/coroutines/jvm/internal/SuspendLambda
  interfaces: 1, fields: 2, methods: 5, attributes: 8
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$execute$2
    #2 = Class              #1            // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$execute$2
    #3 = Utf8               Lkotlin/coroutines/jvm/internal/SuspendLambda;Lkotlin/jvm/functions/Function2<Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult;>;Ljava/lang/Object;>;
    #4 = Utf8               kotlin/coroutines/jvm/internal/SuspendLambda
    #5 = Class              #4            // kotlin/coroutines/jvm/internal/SuspendLambda
    #6 = Utf8               kotlin/jvm/functions/Function2
    #7 = Class              #6            // kotlin/jvm/functions/Function2
    #8 = Utf8               <init>
    #9 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;Lkotlin/coroutines/Continuation;)V
   #10 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;Lkotlin/coroutines/Continuation<-Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$execute$2;>;)V
   #11 = Utf8               this$0
   #12 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;
   #13 = NameAndType        #11:#12       // this$0:Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;
   #14 = Fieldref           #2.#13        // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$execute$2.this$0:Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;
   #15 = Utf8               (ILkotlin/coroutines/Continuation;)V
   #16 = NameAndType        #8:#15        // "<init>":(ILkotlin/coroutines/Continuation;)V
   #17 = Methodref          #5.#16        // kotlin/coroutines/jvm/internal/SuspendLambda."<init>":(ILkotlin/coroutines/Continuation;)V
   #18 = Utf8               this
   #19 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$execute$2;
   #20 = Utf8               $receiver
   #21 = Utf8               $completion
   #22 = Utf8               Lkotlin/coroutines/Continuation;
   #23 = Utf8               invokeSuspend
   #24 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #25 = Utf8               Lkotlin/coroutines/jvm/internal/DebugMetadata;
   #26 = Utf8               f
   #27 = Utf8               L2BRWarmUpService.kt
   #28 = Utf8               l
   #29 = Utf8               nl
   #30 = Utf8               i
   #31 = Utf8               s
   #32 = Utf8               n
   #33 = Utf8               m
   #34 = Utf8               c
   #35 = Utf8               ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService$execute$2
   #36 = Utf8               v
   #37 = Integer            2
   #38 = Utf8               kotlin/coroutines/intrinsics/IntrinsicsKt
   #39 = Class              #38           // kotlin/coroutines/intrinsics/IntrinsicsKt
   #40 = Utf8               getCOROUTINE_SUSPENDED
   #41 = Utf8               ()Ljava/lang/Object;
   #42 = NameAndType        #40:#41       // getCOROUTINE_SUSPENDED:()Ljava/lang/Object;
   #43 = Methodref          #39.#42       // kotlin/coroutines/intrinsics/IntrinsicsKt.getCOROUTINE_SUSPENDED:()Ljava/lang/Object;
   #44 = Utf8               label
   #45 = Utf8               I
   #46 = NameAndType        #44:#45       // label:I
   #47 = Fieldref           #2.#46        // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$execute$2.label:I
   #48 = Utf8               kotlin/ResultKt
   #49 = Class              #48           // kotlin/ResultKt
   #50 = Utf8               throwOnFailure
   #51 = Utf8               (Ljava/lang/Object;)V
   #52 = NameAndType        #50:#51       // throwOnFailure:(Ljava/lang/Object;)V
   #53 = Methodref          #49.#52       // kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
   #54 = Utf8               java/lang/System
   #55 = Class              #54           // java/lang/System
   #56 = Utf8               currentTimeMillis
   #57 = Utf8               ()J
   #58 = NameAndType        #56:#57       // currentTimeMillis:()J
   #59 = Methodref          #55.#58       // java/lang/System.currentTimeMillis:()J
   #60 = Utf8               ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService
   #61 = Class              #60           // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService
   #62 = Utf8               access$getLogger$p
   #63 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)Ljava/util/logging/Logger;
   #64 = NameAndType        #62:#63       // access$getLogger$p:(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)Ljava/util/logging/Logger;
   #65 = Methodref          #61.#64       // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService.access$getLogger$p:(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)Ljava/util/logging/Logger;
   #66 = Utf8               [WarmUp] Iniciando warm-up para região...
   #67 = String             #66           // [WarmUp] Iniciando warm-up para região...
   #68 = Utf8               java/util/logging/Logger
   #69 = Class              #68           // java/util/logging/Logger
   #70 = Utf8               info
   #71 = Utf8               (Ljava/lang/String;)V
   #72 = NameAndType        #70:#71       // info:(Ljava/lang/String;)V
   #73 = Methodref          #69.#72       // java/util/logging/Logger.info:(Ljava/lang/String;)V
   #74 = Utf8               access$getConfig$p
   #75 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;
   #76 = NameAndType        #74:#75       // access$getConfig$p:(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;
   #77 = Methodref          #61.#76       // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService.access$getConfig$p:(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;
   #78 = Utf8               ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig
   #79 = Class              #78           // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig
   #80 = Utf8               getMemoryPrefetchEnabled
   #81 = Utf8               ()Z
   #82 = NameAndType        #80:#81       // getMemoryPrefetchEnabled:()Z
   #83 = Methodref          #79.#82       // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig.getMemoryPrefetchEnabled:()Z
   #84 = Utf8               [WarmUp] Fase 1/3: Memory prefetch...
   #85 = String             #84           // [WarmUp] Fase 1/3: Memory prefetch...
   #86 = Utf8               access$executeMemoryPrefetch
   #87 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)V
   #88 = NameAndType        #86:#87       // access$executeMemoryPrefetch:(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)V
   #89 = Methodref          #61.#88       // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService.access$executeMemoryPrefetch:(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)V
   #90 = Utf8               getJitIterations
   #91 = Utf8               ()I
   #92 = NameAndType        #90:#91       // getJitIterations:()I
   #93 = Methodref          #79.#92       // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig.getJitIterations:()I
   #94 = Utf8               [WarmUp] Fase 2/3: JIT compilation (\u0001 iterações)...
   #95 = String             #94           // [WarmUp] Fase 2/3: JIT compilation (\u0001 iterações)...
   #96 = Utf8               java/lang/invoke/StringConcatFactory
   #97 = Class              #96           // java/lang/invoke/StringConcatFactory
   #98 = Utf8               makeConcatWithConstants
   #99 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #100 = NameAndType        #98:#99       // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #101 = Methodref          #97.#100      // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #102 = MethodHandle       6:#101        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #103 = Utf8               (I)Ljava/lang/String;
  #104 = NameAndType        #98:#103      // makeConcatWithConstants:(I)Ljava/lang/String;
  #105 = InvokeDynamic      #0:#104       // #0:makeConcatWithConstants:(I)Ljava/lang/String;
  #106 = Utf8               access$executeJitWarmUp
  #107 = NameAndType        #106:#87      // access$executeJitWarmUp:(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)V
  #108 = Methodref          #61.#107      // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService.access$executeJitWarmUp:(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)V
  #109 = Utf8               [WarmUp] Fase 3/3: Validação de performance...
  #110 = String             #109          // [WarmUp] Fase 3/3: Validação de performance...
  #111 = Utf8               access$executeValidation
  #112 = NameAndType        #111:#87      // access$executeValidation:(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)V
  #113 = Methodref          #61.#112      // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService.access$executeValidation:(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)V
  #114 = Utf8               access$getEngine$p
  #115 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;
  #116 = NameAndType        #114:#115     // access$getEngine$p:(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;
  #117 = Methodref          #61.#116      // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService.access$getEngine$p:(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;
  #118 = Utf8               ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine
  #119 = Class              #118          // ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine
  #120 = Utf8               getMetrics
  #121 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot;
  #122 = NameAndType        #120:#121     // getMetrics:()Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot;
  #123 = Methodref          #119.#122     // ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine.getMetrics:()Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot;
  #124 = Utf8               ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot
  #125 = Class              #124          // ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot
  #126 = Utf8               getP50Estimate
  #127 = NameAndType        #126:#57      // getP50Estimate:()J
  #128 = Methodref          #125.#127     // ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot.getP50Estimate:()J
  #129 = Utf8               getP99Estimate
  #130 = NameAndType        #129:#57      // getP99Estimate:()J
  #131 = Methodref          #125.#130     // ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot.getP99Estimate:()J
  #132 = Utf8               access$calculateP999
  #133 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)D
  #134 = NameAndType        #132:#133     // access$calculateP999:(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)D
  #135 = Methodref          #61.#134      // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService.access$calculateP999:(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)D
  #136 = Utf8               getTargetLatencyP99Micros
  #137 = Utf8               ()D
  #138 = NameAndType        #136:#137     // getTargetLatencyP99Micros:()D
  #139 = Methodref          #79.#138      // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig.getTargetLatencyP99Micros:()D
  #140 = Utf8               ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult
  #141 = Class              #140          // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult
  #142 = Utf8               (JJJJDDDZ)V
  #143 = NameAndType        #8:#142       // "<init>":(JJJJDDDZ)V
  #144 = Methodref          #141.#143     // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult."<init>":(JJJJDDDZ)V
  #145 = Utf8               access$logResult
  #146 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult;)V
  #147 = NameAndType        #145:#146     // access$logResult:(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult;)V
  #148 = Methodref          #61.#147      // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService.access$logResult:(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult;)V
  #149 = Utf8               java/lang/IllegalStateException
  #150 = Class              #149          // java/lang/IllegalStateException
  #151 = Utf8               call to \'resume\' before \'invoke\' with coroutine
  #152 = String             #151          // call to \'resume\' before \'invoke\' with coroutine
  #153 = NameAndType        #8:#71        // "<init>":(Ljava/lang/String;)V
  #154 = Methodref          #150.#153     // java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
  #155 = Utf8               $i$a$-measureTimeMillis-L2BRWarmUpService$execute$2$memoryTime$1
  #156 = Utf8               $i$f$measureTimeMillis
  #157 = Utf8               start$iv
  #158 = Utf8               J
  #159 = Utf8               this_$iv
  #160 = Utf8               $i$a$-measureTimeMillis-L2BRWarmUpService$execute$2$jitTime$1
  #161 = Utf8               $i$a$-measureTimeMillis-L2BRWarmUpService$execute$2$validationTime$1
  #162 = Utf8               totalStart
  #163 = Utf8               memoryTime
  #164 = Utf8               jitTime
  #165 = Utf8               validationTime
  #166 = Utf8               totalTime
  #167 = Utf8               metrics
  #168 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot;
  #169 = Utf8               p50
  #170 = Utf8               D
  #171 = Utf8               p99
  #172 = Utf8               p999
  #173 = Utf8               success
  #174 = Utf8               Z
  #175 = Utf8               result
  #176 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult;
  #177 = Utf8               $result
  #178 = Utf8               Ljava/lang/Object;
  #179 = Utf8               java/lang/Object
  #180 = Class              #179          // java/lang/Object
  #181 = Utf8               create
  #182 = Utf8               (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
  #183 = Utf8               (Ljava/lang/Object;Lkotlin/coroutines/Continuation<*>;)Lkotlin/coroutines/Continuation<Lkotlin/Unit;>;
  #184 = NameAndType        #8:#9         // "<init>":(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;Lkotlin/coroutines/Continuation;)V
  #185 = Methodref          #2.#184       // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$execute$2."<init>":(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;Lkotlin/coroutines/Continuation;)V
  #186 = Utf8               kotlin/coroutines/Continuation
  #187 = Class              #186          // kotlin/coroutines/Continuation
  #188 = Utf8               value
  #189 = Utf8               invoke
  #190 = Utf8               (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #191 = Utf8               (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult;>;)Ljava/lang/Object;
  #192 = NameAndType        #181:#182     // create:(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
  #193 = Methodref          #2.#192       // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$execute$2.create:(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
  #194 = Utf8               kotlin/Unit
  #195 = Class              #194          // kotlin/Unit
  #196 = Utf8               INSTANCE
  #197 = Utf8               Lkotlin/Unit;
  #198 = NameAndType        #196:#197     // INSTANCE:Lkotlin/Unit;
  #199 = Fieldref           #195.#198     // kotlin/Unit.INSTANCE:Lkotlin/Unit;
  #200 = NameAndType        #23:#24       // invokeSuspend:(Ljava/lang/Object;)Ljava/lang/Object;
  #201 = Methodref          #2.#200       // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$execute$2.invokeSuspend:(Ljava/lang/Object;)Ljava/lang/Object;
  #202 = Utf8               p1
  #203 = Utf8               Lkotlinx/coroutines/CoroutineScope;
  #204 = Utf8               p2
  #205 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #206 = Utf8               kotlinx/coroutines/CoroutineScope
  #207 = Class              #206          // kotlinx/coroutines/CoroutineScope
  #208 = NameAndType        #189:#190     // invoke:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #209 = Methodref          #2.#208       // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$execute$2.invoke:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #210 = Utf8               Lkotlin/Metadata;
  #211 = Utf8               mv
  #212 = Integer            3
  #213 = Integer            0
  #214 = Utf8               k
  #215 = Utf8               xi
  #216 = Integer            48
  #217 = Utf8               d1
  #218 = Utf8               \u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n
  #219 = Utf8               d2
  #220 = Utf8               <anonymous>
  #221 = Utf8               execute
  #222 = Utf8               (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #223 = NameAndType        #221:#222     // execute:(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #224 = Utf8               EngineMetricsSnapshot
  #225 = Utf8               WarmUpConfig
  #226 = Utf8               WarmUpResult
  #227 = Utf8               Lkotlin/jvm/internal/SourceDebugExtension;
  #228 = Utf8               SMAP\nL2BRWarmUpService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 L2BRWarmUpService.kt\next/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$execute$2\n+ 2 L2BRWarmUpService.kt\next/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService\n*L\n1#1,262:1\n252#2,3:263\n252#2,3:266\n252#2,3:269\n*S KotlinDebug\n*F\n+ 1 L2BRWarmUpService.kt\next/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$execute$2\n*L\n70#1:263,3\n74#1:266,3\n77#1:269,3\n*E\n
  #229 = Utf8               Code
  #230 = Utf8               LocalVariableTable
  #231 = Utf8               Signature
  #232 = Utf8               StackMapTable
  #233 = Utf8               LineNumberTable
  #234 = Utf8               InnerClasses
  #235 = Utf8               EnclosingMethod
  #236 = Utf8               SourceFile
  #237 = Utf8               SourceDebugExtension
  #238 = Utf8               RuntimeVisibleAnnotations
  #239 = Utf8               RuntimeInvisibleAnnotations
  #240 = Utf8               BootstrapMethods
{
  int label;
    descriptor: I
    flags: (0x0000)

  final ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService this$0;
    descriptor: Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService$execute$2(ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService, kotlin.coroutines.Continuation<? super ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService$execute$2>);
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
            0      12     0  this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$execute$2;
            0      12     1 $receiver   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;
            0      12     2 $completion   Lkotlin/coroutines/Continuation;
    Signature: #10                          // (Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;Lkotlin/coroutines/Continuation<-Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$execute$2;>;)V

  public final java.lang.Object invokeSuspend(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Ljava/lang/Object;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=17, locals=21, args_size=2
         0: invokestatic  #43                 // Method kotlin/coroutines/intrinsics/IntrinsicsKt.getCOROUTINE_SUSPENDED:()Ljava/lang/Object;
         3: pop
         4: aload_0
         5: getfield      #47                 // Field label:I
         8: tableswitch   { // 0 to 0

                       0: 28
                 default: 326
            }
        28: aload_1
        29: invokestatic  #53                 // Method kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
        32: invokestatic  #59                 // Method java/lang/System.currentTimeMillis:()J
        35: lstore_2
        36: aload_0
        37: getfield      #14                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;
        40: invokestatic  #65                 // Method ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService.access$getLogger$p:(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)Ljava/util/logging/Logger;
        43: ldc           #67                 // String [WarmUp] Iniciando warm-up para região...
        45: invokevirtual #73                 // Method java/util/logging/Logger.info:(Ljava/lang/String;)V
        48: aload_0
        49: getfield      #14                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;
        52: invokestatic  #77                 // Method ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService.access$getConfig$p:(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;
        55: invokevirtual #83                 // Method ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig.getMemoryPrefetchEnabled:()Z
        58: ifeq          110
        61: aload_0
        62: getfield      #14                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;
        65: invokestatic  #65                 // Method ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService.access$getLogger$p:(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)Ljava/util/logging/Logger;
        68: ldc           #85                 // String [WarmUp] Fase 1/3: Memory prefetch...
        70: invokevirtual #73                 // Method java/util/logging/Logger.info:(Ljava/lang/String;)V
        73: aload_0
        74: getfield      #14                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;
        77: astore        6
        79: aload_0
        80: getfield      #14                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;
        83: astore        7
        85: iconst_0
        86: istore        8
        88: invokestatic  #59                 // Method java/lang/System.currentTimeMillis:()J
        91: lstore        9
        93: iconst_0
        94: istore        11
        96: aload         7
        98: invokestatic  #89                 // Method ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService.access$executeMemoryPrefetch:(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)V
       101: invokestatic  #59                 // Method java/lang/System.currentTimeMillis:()J
       104: lload         9
       106: lsub
       107: goto          111
       110: lconst_0
       111: lstore        4
       113: aload_0
       114: getfield      #14                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;
       117: invokestatic  #65                 // Method ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService.access$getLogger$p:(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)Ljava/util/logging/Logger;
       120: aload_0
       121: getfield      #14                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;
       124: invokestatic  #77                 // Method ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService.access$getConfig$p:(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;
       127: invokevirtual #93                 // Method ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig.getJitIterations:()I
       130: invokedynamic #105,  0            // InvokeDynamic #0:makeConcatWithConstants:(I)Ljava/lang/String;
       135: invokevirtual #73                 // Method java/util/logging/Logger.info:(Ljava/lang/String;)V
       138: aload_0
       139: getfield      #14                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;
       142: astore        8
       144: aload_0
       145: getfield      #14                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;
       148: astore        9
       150: iconst_0
       151: istore        10
       153: invokestatic  #59                 // Method java/lang/System.currentTimeMillis:()J
       156: lstore        11
       158: iconst_0
       159: istore        13
       161: aload         9
       163: invokestatic  #108                // Method ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService.access$executeJitWarmUp:(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)V
       166: invokestatic  #59                 // Method java/lang/System.currentTimeMillis:()J
       169: lload         11
       171: lsub
       172: lstore        6
       174: aload_0
       175: getfield      #14                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;
       178: invokestatic  #65                 // Method ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService.access$getLogger$p:(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)Ljava/util/logging/Logger;
       181: ldc           #110                // String [WarmUp] Fase 3/3: Validação de performance...
       183: invokevirtual #73                 // Method java/util/logging/Logger.info:(Ljava/lang/String;)V
       186: aload_0
       187: getfield      #14                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;
       190: astore        10
       192: aload_0
       193: getfield      #14                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;
       196: astore        11
       198: iconst_0
       199: istore        12
       201: invokestatic  #59                 // Method java/lang/System.currentTimeMillis:()J
       204: lstore        13
       206: iconst_0
       207: istore        15
       209: aload         11
       211: invokestatic  #113                // Method ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService.access$executeValidation:(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)V
       214: invokestatic  #59                 // Method java/lang/System.currentTimeMillis:()J
       217: lload         13
       219: lsub
       220: lstore        8
       222: invokestatic  #59                 // Method java/lang/System.currentTimeMillis:()J
       225: lload_2
       226: lsub
       227: lstore        10
       229: aload_0
       230: getfield      #14                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;
       233: invokestatic  #117                // Method ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService.access$getEngine$p:(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;
       236: invokevirtual #123                // Method ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine.getMetrics:()Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot;
       239: astore        12
       241: aload         12
       243: invokevirtual #128                // Method ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot.getP50Estimate:()J
       246: l2d
       247: dstore        13
       249: aload         12
       251: invokevirtual #131                // Method ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot.getP99Estimate:()J
       254: l2d
       255: dstore        15
       257: aload_0
       258: getfield      #14                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;
       261: invokestatic  #135                // Method ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService.access$calculateP999:(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)D
       264: dstore        17
       266: dload         15
       268: aload_0
       269: getfield      #14                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;
       272: invokestatic  #77                 // Method ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService.access$getConfig$p:(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;
       275: invokevirtual #139                // Method ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig.getTargetLatencyP99Micros:()D
       278: dcmpg
       279: ifgt          286
       282: iconst_1
       283: goto          287
       286: iconst_0
       287: istore        19
       289: new           #141                // class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult
       292: dup
       293: lload         10
       295: lload         4
       297: lload         6
       299: lload         8
       301: dload         13
       303: dload         15
       305: dload         17
       307: iload         19
       309: invokespecial #144                // Method ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult."<init>":(JJJJDDDZ)V
       312: astore        20
       314: aload_0
       315: getfield      #14                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;
       318: aload         20
       320: invokestatic  #148                // Method ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService.access$logResult:(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult;)V
       323: aload         20
       325: areturn
       326: new           #150                // class java/lang/IllegalStateException
       329: dup
       330: ldc           #152                // String call to \'resume\' before \'invoke\' with coroutine
       332: invokespecial #154                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
       335: athrow
      StackMapTable: number_of_entries = 6
        frame_type = 28 /* same */
        frame_type = 252 /* append */
          offset_delta = 81
          locals = [ long ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ long ]
        frame_type = 255 /* full_frame */
          offset_delta = 174
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$execute$2, class java/lang/Object, long, long, long, long, long, class ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot, double, double, double ]
          stack = []
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 38
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$execute$2, class java/lang/Object ]
          stack = []
      LineNumberTable:
        line 64: 3
        line 65: 32
        line 66: 36
        line 68: 48
        line 69: 61
        line 70: 73
        line 263: 88
        line 264: 93
        line 70: 96
        line 264: 101
        line 265: 101
        line 71: 110
        line 68: 111
        line 73: 113
        line 74: 138
        line 266: 153
        line 267: 158
        line 74: 161
        line 267: 166
        line 268: 166
        line 74: 172
        line 76: 174
        line 77: 186
        line 269: 201
        line 270: 206
        line 77: 209
        line 270: 214
        line 271: 214
        line 77: 220
        line 79: 222
        line 81: 229
        line 82: 241
        line 83: 249
        line 84: 257
        line 86: 266
        line 88: 289
        line 89: 293
        line 90: 295
        line 91: 297
        line 92: 299
        line 93: 301
        line 94: 303
        line 95: 305
        line 96: 307
        line 88: 309
        line 99: 314
        line 100: 323
        line 64: 326
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           96       5    11 $i$a$-measureTimeMillis-L2BRWarmUpService$execute$2$memoryTime$1   I
           88      19     8 $i$f$measureTimeMillis   I
           93      14     9 start$iv   J
           85      22     6 this_$iv   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;
          161       5    13 $i$a$-measureTimeMillis-L2BRWarmUpService$execute$2$jitTime$1   I
          153      19    10 $i$f$measureTimeMillis   I
          158      14    11 start$iv   J
          150      22     8 this_$iv   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;
          209       5    15 $i$a$-measureTimeMillis-L2BRWarmUpService$execute$2$validationTime$1   I
          201      19    12 $i$f$measureTimeMillis   I
          206      14    13 start$iv   J
          198      22    10 this_$iv   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;
           36     290     2 totalStart   J
          113     213     4 memoryTime   J
          174     152     6 jitTime   J
          222     104     8 validationTime   J
          229      97    10 totalTime   J
          241      85    12 metrics   Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot;
          249      77    13   p50   D
          257      69    15   p99   D
          266      60    17  p999   D
          289      37    19 success   Z
          314      12    20 result   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult;
            0     336     0  this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$execute$2;
            0     336     1 $result   Ljava/lang/Object;

  public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object, kotlin.coroutines.Continuation<?>);
    descriptor: (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=3, args_size=3
         0: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$execute$2
         3: dup
         4: aload_0
         5: getfield      #14                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;
         8: aload_2
         9: invokespecial #185                // Method "<init>":(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;Lkotlin/coroutines/Continuation;)V
        12: checkcast     #187                // class kotlin/coroutines/Continuation
        15: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$execute$2;
            0      16     1 value   Ljava/lang/Object;
            0      16     2 $completion   Lkotlin/coroutines/Continuation;
    Signature: #183                         // (Ljava/lang/Object;Lkotlin/coroutines/Continuation<*>;)Lkotlin/coroutines/Continuation<Lkotlin/Unit;>;

  public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService$WarmUpResult>);
    descriptor: (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: aload_2
         3: invokevirtual #193                // Method create:(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
         6: checkcast     #2                  // class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$execute$2
         9: getstatic     #199                // Field kotlin/Unit.INSTANCE:Lkotlin/Unit;
        12: invokevirtual #201                // Method invokeSuspend:(Ljava/lang/Object;)Ljava/lang/Object;
        15: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$execute$2;
            0      16     1    p1   Lkotlinx/coroutines/CoroutineScope;
            0      16     2    p2   Lkotlin/coroutines/Continuation;
    Signature: #191                         // (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult;>;)Ljava/lang/Object;

  public java.lang.Object invoke(java.lang.Object, java.lang.Object);
    descriptor: (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: checkcast     #207                // class kotlinx/coroutines/CoroutineScope
         5: aload_2
         6: checkcast     #187                // class kotlin/coroutines/Continuation
         9: invokevirtual #209                // Method invoke:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
        12: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$execute$2;
            0      13     1    p1   Ljava/lang/Object;
            0      13     2    p2   Ljava/lang/Object;
}
InnerClasses:
  public static final #224= #125 of #119; // EngineMetricsSnapshot=class ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine$EngineMetricsSnapshot of class ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine
  public static final #225= #79 of #61;   // WarmUpConfig=class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig of class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService
  public static final #226= #141 of #61;  // WarmUpResult=class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult of class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService
  static final #2;                        // class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$execute$2
EnclosingMethod: #61.#223               // ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService.execute
Signature: #3                           // Lkotlin/coroutines/jvm/internal/SuspendLambda;Lkotlin/jvm/functions/Function2<Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult;>;Ljava/lang/Object;>;
SourceFile: "L2BRWarmUpService.kt"
SourceDebugExtension:
  SMAP
  L2BRWarmUpService.kt
  Kotlin
  *S Kotlin
  *F
  + 1 L2BRWarmUpService.kt
  ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$execute$2
  + 2 L2BRWarmUpService.kt
  ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService
  *L
  1#1,262:1
  252#2,3:263
  252#2,3:266
  252#2,3:269
  *S KotlinDebug
  *F
  + 1 L2BRWarmUpService.kt
  ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$execute$2
  *L
  70#1:263,3
  74#1:266,3
  77#1:269,3
  *E
RuntimeVisibleAnnotations:
  0: #25(#26=s#27,#28=[],#29=[],#30=[],#31=[],#32=[],#33=s#23,#34=s#35,#36=I#37)
    kotlin.coroutines.jvm.internal.DebugMetadata(
      f="L2BRWarmUpService.kt"
      l=[]
      nl=[]
      i=[]
      s=[]
      n=[]
      m="invokeSuspend"
      c="ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService$execute$2"
      v=2
    )
  1: #210(#211=[I#37,I#212,I#213],#214=I#212,#215=I#216,#217=[s#218],#219=[s#220,s#176,s#203])
    kotlin.Metadata(
      mv=[2,3,0]
      k=3
      xi=48
      d1=["\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"]
      d2=["<anonymous>","Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult;","Lkotlinx/coroutines/CoroutineScope;"]
    )
RuntimeInvisibleAnnotations:
  0: #227(#188=[s#228])
    kotlin.jvm.internal.SourceDebugExtension(
      value=["SMAP\nL2BRWarmUpService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 L2BRWarmUpService.kt\next/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$execute$2\n+ 2 L2BRWarmUpService.kt\next/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService\n*L\n1#1,262:1\n252#2,3:263\n252#2,3:266\n252#2,3:269\n*S KotlinDebug\n*F\n+ 1 L2BRWarmUpService.kt\next/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$execute$2\n*L\n70#1:263,3\n74#1:266,3\n77#1:269,3\n*E\n"]
    )
BootstrapMethods:
  0: #102 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #95 [WarmUp] Fase 2/3: JIT compilation (\u0001 iterações)...
