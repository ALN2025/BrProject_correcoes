// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.integration.L2BRAdminCommands$handleBenchmark$1
// File: ext\mods\gameserver\geoengine\pathfinding\integration\L2BRAdminCommands$handleBenchmark$1.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleBenchmark$1.class
  Last modified 9 de jul de 2026; size 6549 bytes
  MD5 checksum 189a62a2f747da1e21fbe684e7f027a4
  Compiled from "AdminCommands.kt"
final class ext.mods.gameserver.geoengine.pathfinding.integration.L2BRAdminCommands$handleBenchmark$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>
  minor version: 0
  major version: 69
  flags: (0x0030) ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleBenchmark$1
  super_class: #5                         // kotlin/coroutines/jvm/internal/SuspendLambda
  interfaces: 1, fields: 3, methods: 5, attributes: 6
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleBenchmark$1
    #2 = Class              #1            // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleBenchmark$1
    #3 = Utf8               Lkotlin/coroutines/jvm/internal/SuspendLambda;Lkotlin/jvm/functions/Function2<Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Lkotlin/Unit;>;Ljava/lang/Object;>;
    #4 = Utf8               kotlin/coroutines/jvm/internal/SuspendLambda
    #5 = Class              #4            // kotlin/coroutines/jvm/internal/SuspendLambda
    #6 = Utf8               kotlin/jvm/functions/Function2
    #7 = Class              #6            // kotlin/jvm/functions/Function2
    #8 = Utf8               <init>
    #9 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;Lkotlin/coroutines/Continuation;)V
   #10 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;Lkotlin/coroutines/Continuation<-Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleBenchmark$1;>;)V
   #11 = Utf8               $admin
   #12 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;
   #13 = NameAndType        #11:#12       // $admin:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;
   #14 = Fieldref           #2.#13        // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleBenchmark$1.$admin:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;
   #15 = Utf8               this$0
   #16 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;
   #17 = NameAndType        #15:#16       // this$0:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;
   #18 = Fieldref           #2.#17        // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleBenchmark$1.this$0:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;
   #19 = Utf8               (ILkotlin/coroutines/Continuation;)V
   #20 = NameAndType        #8:#19        // "<init>":(ILkotlin/coroutines/Continuation;)V
   #21 = Methodref          #5.#20        // kotlin/coroutines/jvm/internal/SuspendLambda."<init>":(ILkotlin/coroutines/Continuation;)V
   #22 = Utf8               this
   #23 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleBenchmark$1;
   #24 = Utf8               $receiver
   #25 = Utf8               $completion
   #26 = Utf8               Lkotlin/coroutines/Continuation;
   #27 = Utf8               invokeSuspend
   #28 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #29 = Utf8               Lkotlin/coroutines/jvm/internal/DebugMetadata;
   #30 = Utf8               f
   #31 = Utf8               AdminCommands.kt
   #32 = Utf8               l
   #33 = Utf8               nl
   #34 = Utf8               i
   #35 = Utf8               s
   #36 = Utf8               n
   #37 = Utf8               m
   #38 = Utf8               c
   #39 = Utf8               ext.mods.gameserver.geoengine.pathfinding.integration.L2BRAdminCommands$handleBenchmark$1
   #40 = Utf8               v
   #41 = Integer            2
   #42 = Utf8               kotlin/coroutines/intrinsics/IntrinsicsKt
   #43 = Class              #42           // kotlin/coroutines/intrinsics/IntrinsicsKt
   #44 = Utf8               getCOROUTINE_SUSPENDED
   #45 = Utf8               ()Ljava/lang/Object;
   #46 = NameAndType        #44:#45       // getCOROUTINE_SUSPENDED:()Ljava/lang/Object;
   #47 = Methodref          #43.#46       // kotlin/coroutines/intrinsics/IntrinsicsKt.getCOROUTINE_SUSPENDED:()Ljava/lang/Object;
   #48 = Utf8               label
   #49 = Utf8               I
   #50 = NameAndType        #48:#49       // label:I
   #51 = Fieldref           #2.#50        // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleBenchmark$1.label:I
   #52 = Utf8               kotlin/ResultKt
   #53 = Class              #52           // kotlin/ResultKt
   #54 = Utf8               throwOnFailure
   #55 = Utf8               (Ljava/lang/Object;)V
   #56 = NameAndType        #54:#55       // throwOnFailure:(Ljava/lang/Object;)V
   #57 = Methodref          #53.#56       // kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
   #58 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/PerformanceMetrics
   #59 = Class              #58           // ext/mods/gameserver/geoengine/pathfinding/model/PerformanceMetrics
   #60 = Utf8               ()V
   #61 = NameAndType        #8:#60        // "<init>":()V
   #62 = Methodref          #59.#61       // ext/mods/gameserver/geoengine/pathfinding/model/PerformanceMetrics."<init>":()V
   #63 = Utf8               java/util/concurrent/ThreadLocalRandom
   #64 = Class              #63           // java/util/concurrent/ThreadLocalRandom
   #65 = Utf8               current
   #66 = Utf8               ()Ljava/util/concurrent/ThreadLocalRandom;
   #67 = NameAndType        #65:#66       // current:()Ljava/util/concurrent/ThreadLocalRandom;
   #68 = Methodref          #64.#67       // java/util/concurrent/ThreadLocalRandom.current:()Ljava/util/concurrent/ThreadLocalRandom;
   #69 = Integer            100000
   #70 = Integer            200000
   #71 = Utf8               nextInt
   #72 = Utf8               (II)I
   #73 = NameAndType        #71:#72       // nextInt:(II)I
   #74 = Methodref          #64.#73       // java/util/concurrent/ThreadLocalRandom.nextInt:(II)I
   #75 = Utf8               java/lang/System
   #76 = Class              #75           // java/lang/System
   #77 = Utf8               nanoTime
   #78 = Utf8               ()J
   #79 = NameAndType        #77:#78       // nanoTime:()J
   #80 = Methodref          #76.#79       // java/lang/System.nanoTime:()J
   #81 = Utf8               ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands
   #82 = Class              #81           // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands
   #83 = Utf8               access$getBridge$p
   #84 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;)Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;
   #85 = NameAndType        #83:#84       // access$getBridge$p:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;)Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;
   #86 = Methodref          #82.#85       // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands.access$getBridge$p:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;)Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;
   #87 = Utf8               ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge
   #88 = Class              #87           // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge
   #89 = Utf8               findPath$default
   #90 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;IIIIIIZLjava/lang/Object;ILjava/lang/Object;)Ljava/util/List;
   #91 = NameAndType        #89:#90       // findPath$default:(Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;IIIIIIZLjava/lang/Object;ILjava/lang/Object;)Ljava/util/List;
   #92 = Methodref          #88.#91       // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge.findPath$default:(Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;IIIIIIZLjava/lang/Object;ILjava/lang/Object;)Ljava/util/List;
   #93 = Utf8               record
   #94 = Utf8               (J)V
   #95 = NameAndType        #93:#94       // record:(J)V
   #96 = Methodref          #59.#95       // ext/mods/gameserver/geoengine/pathfinding/model/PerformanceMetrics.record:(J)V
   #97 = Utf8                 Progresso: \u0001/\u0001
   #98 = String             #97           //   Progresso: \u0001/\u0001
   #99 = Utf8               java/lang/invoke/StringConcatFactory
  #100 = Class              #99           // java/lang/invoke/StringConcatFactory
  #101 = Utf8               makeConcatWithConstants
  #102 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #103 = NameAndType        #101:#102     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #104 = Methodref          #100.#103     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #105 = MethodHandle       6:#104        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #106 = Utf8               (II)Ljava/lang/String;
  #107 = NameAndType        #101:#106     // makeConcatWithConstants:(II)Ljava/lang/String;
  #108 = InvokeDynamic      #0:#107       // #0:makeConcatWithConstants:(II)Ljava/lang/String;
  #109 = Utf8               ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface
  #110 = Class              #109          // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface
  #111 = Utf8               sendMessage
  #112 = Utf8               (Ljava/lang/String;)V
  #113 = NameAndType        #111:#112     // sendMessage:(Ljava/lang/String;)V
  #114 = InterfaceMethodref #110.#113     // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface.sendMessage:(Ljava/lang/String;)V
  #115 = Double             50.0d
  #117 = Utf8               getPercentile
  #118 = Utf8               (D)D
  #119 = NameAndType        #117:#118     // getPercentile:(D)D
  #120 = Methodref          #59.#119      // ext/mods/gameserver/geoengine/pathfinding/model/PerformanceMetrics.getPercentile:(D)D
  #121 = Double             1000.0d
  #123 = Double             99.0d
  #125 = Utf8               getAverage
  #126 = Utf8               ()D
  #127 = NameAndType        #125:#126     // getAverage:()D
  #128 = Methodref          #59.#127      // ext/mods/gameserver/geoengine/pathfinding/model/PerformanceMetrics.getAverage:()D
  #129 = Utf8               getMin
  #130 = NameAndType        #129:#78      // getMin:()J
  #131 = Methodref          #59.#130      // ext/mods/gameserver/geoengine/pathfinding/model/PerformanceMetrics.getMin:()J
  #132 = Utf8               getMax
  #133 = NameAndType        #132:#78      // getMax:()J
  #134 = Methodref          #59.#133      // ext/mods/gameserver/geoengine/pathfinding/model/PerformanceMetrics.getMax:()J
  #135 = Utf8               === Resultados do Benchmark ===
  #136 = String             #135          // === Resultados do Benchmark ===
  #137 = Utf8               Iterações: \u0001
  #138 = String             #137          // Iterações: \u0001
  #139 = Utf8               (I)Ljava/lang/String;
  #140 = NameAndType        #101:#139     // makeConcatWithConstants:(I)Ljava/lang/String;
  #141 = InvokeDynamic      #1:#140       // #1:makeConcatWithConstants:(I)Ljava/lang/String;
  #142 = Utf8               access$format
  #143 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;DI)Ljava/lang/String;
  #144 = NameAndType        #142:#143     // access$format:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;DI)Ljava/lang/String;
  #145 = Methodref          #82.#144      // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands.access$format:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;DI)Ljava/lang/String;
  #146 = Utf8               Mín: \u0001?s | Máx: \u0001?s
  #147 = String             #146          // Mín: \u0001?s | Máx: \u0001?s
  #148 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #149 = NameAndType        #101:#148     // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #150 = InvokeDynamic      #2:#149       // #2:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #151 = Utf8               Média: \u0001?s
  #152 = String             #151          // Média: \u0001?s
  #153 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #154 = NameAndType        #101:#153     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #155 = InvokeDynamic      #3:#154       // #3:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #156 = Utf8               P50: \u0001?s | P99: \u0001?s
  #157 = String             #156          // P50: \u0001?s | P99: \u0001?s
  #158 = InvokeDynamic      #4:#149       // #4:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #159 = Utf8               kotlin/Unit
  #160 = Class              #159          // kotlin/Unit
  #161 = Utf8               INSTANCE
  #162 = Utf8               Lkotlin/Unit;
  #163 = NameAndType        #161:#162     // INSTANCE:Lkotlin/Unit;
  #164 = Fieldref           #160.#163     // kotlin/Unit.INSTANCE:Lkotlin/Unit;
  #165 = Utf8               java/lang/IllegalStateException
  #166 = Class              #165          // java/lang/IllegalStateException
  #167 = Utf8               call to \'resume\' before \'invoke\' with coroutine
  #168 = String             #167          // call to \'resume\' before \'invoke\' with coroutine
  #169 = NameAndType        #8:#112       // "<init>":(Ljava/lang/String;)V
  #170 = Methodref          #166.#169     // java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
  #171 = Utf8               $i$a$-repeat-L2BRAdminCommands$handleBenchmark$1$1
  #172 = Utf8               x1
  #173 = Utf8               y1
  #174 = Utf8               x2
  #175 = Utf8               y2
  #176 = Utf8               start
  #177 = Utf8               J
  #178 = Utf8               path
  #179 = Utf8               Ljava/util/List;
  #180 = Utf8               duration
  #181 = Utf8               iterations
  #182 = Utf8               metrics
  #183 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/PerformanceMetrics;
  #184 = Utf8               random
  #185 = Utf8               Ljava/util/concurrent/ThreadLocalRandom;
  #186 = Utf8               p50
  #187 = Utf8               D
  #188 = Utf8               p99
  #189 = Utf8               avg
  #190 = Utf8               minVal
  #191 = Utf8               maxVal
  #192 = Utf8               $result
  #193 = Utf8               Ljava/lang/Object;
  #194 = Utf8               java/lang/Object
  #195 = Class              #194          // java/lang/Object
  #196 = Utf8               java/util/List
  #197 = Class              #196          // java/util/List
  #198 = Utf8               create
  #199 = Utf8               (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
  #200 = Utf8               (Ljava/lang/Object;Lkotlin/coroutines/Continuation<*>;)Lkotlin/coroutines/Continuation<Lkotlin/Unit;>;
  #201 = NameAndType        #8:#9         // "<init>":(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;Lkotlin/coroutines/Continuation;)V
  #202 = Methodref          #2.#201       // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleBenchmark$1."<init>":(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;Lkotlin/coroutines/Continuation;)V
  #203 = Utf8               kotlin/coroutines/Continuation
  #204 = Class              #203          // kotlin/coroutines/Continuation
  #205 = Utf8               value
  #206 = Utf8               invoke
  #207 = Utf8               (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #208 = Utf8               (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Lkotlin/Unit;>;)Ljava/lang/Object;
  #209 = NameAndType        #198:#199     // create:(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
  #210 = Methodref          #2.#209       // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleBenchmark$1.create:(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
  #211 = NameAndType        #27:#28       // invokeSuspend:(Ljava/lang/Object;)Ljava/lang/Object;
  #212 = Methodref          #2.#211       // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleBenchmark$1.invokeSuspend:(Ljava/lang/Object;)Ljava/lang/Object;
  #213 = Utf8               p1
  #214 = Utf8               Lkotlinx/coroutines/CoroutineScope;
  #215 = Utf8               p2
  #216 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #217 = Utf8               kotlinx/coroutines/CoroutineScope
  #218 = Class              #217          // kotlinx/coroutines/CoroutineScope
  #219 = NameAndType        #206:#207     // invoke:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #220 = Methodref          #2.#219       // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleBenchmark$1.invoke:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #221 = Utf8               Lkotlin/Metadata;
  #222 = Utf8               mv
  #223 = Integer            3
  #224 = Integer            0
  #225 = Utf8               k
  #226 = Utf8               xi
  #227 = Integer            48
  #228 = Utf8               d1
  #229 = Utf8               \u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n
  #230 = Utf8               d2
  #231 = Utf8               <anonymous>
  #232 = Utf8
  #233 = Utf8               handleBenchmark
  #234 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;)Z
  #235 = NameAndType        #233:#234     // handleBenchmark:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;)Z
  #236 = Utf8               AdminInterface
  #237 = Utf8               Code
  #238 = Utf8               LocalVariableTable
  #239 = Utf8               Signature
  #240 = Utf8               StackMapTable
  #241 = Utf8               LineNumberTable
  #242 = Utf8               InnerClasses
  #243 = Utf8               EnclosingMethod
  #244 = Utf8               SourceFile
  #245 = Utf8               RuntimeVisibleAnnotations
  #246 = Utf8               BootstrapMethods
{
  int label;
    descriptor: I
    flags: (0x0000)

  final ext.mods.gameserver.geoengine.pathfinding.integration.L2BRAdminCommands$AdminInterface $admin;
    descriptor: Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  final ext.mods.gameserver.geoengine.pathfinding.integration.L2BRAdminCommands this$0;
    descriptor: Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  ext.mods.gameserver.geoengine.pathfinding.integration.L2BRAdminCommands$handleBenchmark$1(ext.mods.gameserver.geoengine.pathfinding.integration.L2BRAdminCommands$AdminInterface, ext.mods.gameserver.geoengine.pathfinding.integration.L2BRAdminCommands, kotlin.coroutines.Continuation<? super ext.mods.gameserver.geoengine.pathfinding.integration.L2BRAdminCommands$handleBenchmark$1>);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;Lkotlin/coroutines/Continuation;)V
    flags: (0x0000)
    Code:
      stack=3, locals=4, args_size=4
         0: aload_0
         1: aload_1
         2: putfield      #14                 // Field $admin:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;
         5: aload_0
         6: aload_2
         7: putfield      #18                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;
        10: aload_0
        11: iconst_2
        12: aload_3
        13: invokespecial #21                 // Method kotlin/coroutines/jvm/internal/SuspendLambda."<init>":(ILkotlin/coroutines/Continuation;)V
        16: return
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleBenchmark$1;
            0      17     1 $admin   Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;
            0      17     2 $receiver   Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;
            0      17     3 $completion   Lkotlin/coroutines/Continuation;
    Signature: #10                          // (Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;Lkotlin/coroutines/Continuation<-Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleBenchmark$1;>;)V

  public final java.lang.Object invokeSuspend(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Ljava/lang/Object;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=11, locals=19, args_size=2
         0: invokestatic  #47                 // Method kotlin/coroutines/intrinsics/IntrinsicsKt.getCOROUTINE_SUSPENDED:()Ljava/lang/Object;
         3: pop
         4: aload_0
         5: getfield      #51                 // Field label:I
         8: tableswitch   { // 0 to 0

                       0: 28
                 default: 376
            }
        28: aload_1
        29: invokestatic  #57                 // Method kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
        32: sipush        1000
        35: istore_2
        36: new           #59                 // class ext/mods/gameserver/geoengine/pathfinding/model/PerformanceMetrics
        39: dup
        40: invokespecial #62                 // Method ext/mods/gameserver/geoengine/pathfinding/model/PerformanceMetrics."<init>":()V
        43: astore_3
        44: invokestatic  #68                 // Method java/util/concurrent/ThreadLocalRandom.current:()Ljava/util/concurrent/ThreadLocalRandom;
        47: astore        4
        49: aload_0
        50: getfield      #18                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;
        53: astore        5
        55: aload_0
        56: getfield      #14                 // Field $admin:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;
        59: astore        6
        61: iconst_0
        62: istore        7
        64: iload         7
        66: iload_2
        67: if_icmpge     196
        70: iload         7
        72: istore        8
        74: iconst_0
        75: istore        9
        77: aload         4
        79: ldc           #69                 // int 100000
        81: ldc           #70                 // int 200000
        83: invokevirtual #74                 // Method java/util/concurrent/ThreadLocalRandom.nextInt:(II)I
        86: istore        10
        88: aload         4
        90: ldc           #69                 // int 100000
        92: ldc           #70                 // int 200000
        94: invokevirtual #74                 // Method java/util/concurrent/ThreadLocalRandom.nextInt:(II)I
        97: istore        11
        99: aload         4
       101: ldc           #69                 // int 100000
       103: ldc           #70                 // int 200000
       105: invokevirtual #74                 // Method java/util/concurrent/ThreadLocalRandom.nextInt:(II)I
       108: istore        12
       110: aload         4
       112: ldc           #69                 // int 100000
       114: ldc           #70                 // int 200000
       116: invokevirtual #74                 // Method java/util/concurrent/ThreadLocalRandom.nextInt:(II)I
       119: istore        13
       121: invokestatic  #80                 // Method java/lang/System.nanoTime:()J
       124: lstore        14
       126: aload         5
       128: invokestatic  #86                 // Method ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands.access$getBridge$p:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;)Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;
       131: iload         10
       133: iload         11
       135: iconst_0
       136: iload         12
       138: iload         13
       140: iconst_0
       141: iconst_0
       142: aconst_null
       143: sipush        192
       146: aconst_null
       147: invokestatic  #92                 // Method ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge.findPath$default:(Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;IIIIIIZLjava/lang/Object;ILjava/lang/Object;)Ljava/util/List;
       150: astore        16
       152: invokestatic  #80                 // Method java/lang/System.nanoTime:()J
       155: lload         14
       157: lsub
       158: lstore        17
       160: aload_3
       161: lload         17
       163: invokevirtual #96                 // Method ext/mods/gameserver/geoengine/pathfinding/model/PerformanceMetrics.record:(J)V
       166: iload         8
       168: bipush        100
       170: irem
       171: ifne          189
       174: aload         6
       176: iload         8
       178: iload_2
       179: invokedynamic #108,  0            // InvokeDynamic #0:makeConcatWithConstants:(II)Ljava/lang/String;
       184: invokeinterface #114,  2          // InterfaceMethod ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface.sendMessage:(Ljava/lang/String;)V
       189: nop
       190: iinc          7, 1
       193: goto          64
       196: aload_3
       197: ldc2_w        #115                // double 50.0d
       200: invokevirtual #120                // Method ext/mods/gameserver/geoengine/pathfinding/model/PerformanceMetrics.getPercentile:(D)D
       203: ldc2_w        #121                // double 1000.0d
       206: ddiv
       207: dstore        5
       209: aload_3
       210: ldc2_w        #123                // double 99.0d
       213: invokevirtual #120                // Method ext/mods/gameserver/geoengine/pathfinding/model/PerformanceMetrics.getPercentile:(D)D
       216: ldc2_w        #121                // double 1000.0d
       219: ddiv
       220: dstore        7
       222: aload_3
       223: invokevirtual #128                // Method ext/mods/gameserver/geoengine/pathfinding/model/PerformanceMetrics.getAverage:()D
       226: ldc2_w        #121                // double 1000.0d
       229: ddiv
       230: dstore        9
       232: aload_3
       233: invokevirtual #131                // Method ext/mods/gameserver/geoengine/pathfinding/model/PerformanceMetrics.getMin:()J
       236: l2d
       237: ldc2_w        #121                // double 1000.0d
       240: ddiv
       241: dstore        11
       243: aload_3
       244: invokevirtual #134                // Method ext/mods/gameserver/geoengine/pathfinding/model/PerformanceMetrics.getMax:()J
       247: l2d
       248: ldc2_w        #121                // double 1000.0d
       251: ddiv
       252: dstore        13
       254: aload_0
       255: getfield      #14                 // Field $admin:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;
       258: ldc           #136                // String === Resultados do Benchmark ===
       260: invokeinterface #114,  2          // InterfaceMethod ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface.sendMessage:(Ljava/lang/String;)V
       265: aload_0
       266: getfield      #14                 // Field $admin:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;
       269: iload_2
       270: invokedynamic #141,  0            // InvokeDynamic #1:makeConcatWithConstants:(I)Ljava/lang/String;
       275: invokeinterface #114,  2          // InterfaceMethod ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface.sendMessage:(Ljava/lang/String;)V
       280: aload_0
       281: getfield      #14                 // Field $admin:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;
       284: aload_0
       285: getfield      #18                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;
       288: dload         11
       290: iconst_2
       291: invokestatic  #145                // Method ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands.access$format:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;DI)Ljava/lang/String;
       294: aload_0
       295: getfield      #18                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;
       298: dload         13
       300: iconst_2
       301: invokestatic  #145                // Method ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands.access$format:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;DI)Ljava/lang/String;
       304: invokedynamic #150,  0            // InvokeDynamic #2:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       309: invokeinterface #114,  2          // InterfaceMethod ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface.sendMessage:(Ljava/lang/String;)V
       314: aload_0
       315: getfield      #14                 // Field $admin:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;
       318: aload_0
       319: getfield      #18                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;
       322: dload         9
       324: iconst_2
       325: invokestatic  #145                // Method ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands.access$format:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;DI)Ljava/lang/String;
       328: invokedynamic #155,  0            // InvokeDynamic #3:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       333: invokeinterface #114,  2          // InterfaceMethod ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface.sendMessage:(Ljava/lang/String;)V
       338: aload_0
       339: getfield      #14                 // Field $admin:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;
       342: aload_0
       343: getfield      #18                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;
       346: dload         5
       348: iconst_2
       349: invokestatic  #145                // Method ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands.access$format:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;DI)Ljava/lang/String;
       352: aload_0
       353: getfield      #18                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;
       356: dload         7
       358: iconst_2
       359: invokestatic  #145                // Method ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands.access$format:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;DI)Ljava/lang/String;
       362: invokedynamic #158,  0            // InvokeDynamic #4:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       367: invokeinterface #114,  2          // InterfaceMethod ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface.sendMessage:(Ljava/lang/String;)V
       372: getstatic     #164                // Field kotlin/Unit.INSTANCE:Lkotlin/Unit;
       375: areturn
       376: new           #166                // class java/lang/IllegalStateException
       379: dup
       380: ldc           #168                // String call to \'resume\' before \'invoke\' with coroutine
       382: invokespecial #170                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
       385: athrow
      StackMapTable: number_of_entries = 5
        frame_type = 28 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 35
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleBenchmark$1, class java/lang/Object, int, class ext/mods/gameserver/geoengine/pathfinding/model/PerformanceMetrics, class java/util/concurrent/ThreadLocalRandom, class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands, class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface, int ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 124
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleBenchmark$1, class java/lang/Object, int, class ext/mods/gameserver/geoengine/pathfinding/model/PerformanceMetrics, class java/util/concurrent/ThreadLocalRandom, class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands, class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface, int, int, int, int, int, int, int, long, class java/util/List, long ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 6
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleBenchmark$1, class java/lang/Object, int, class ext/mods/gameserver/geoengine/pathfinding/model/PerformanceMetrics, class java/util/concurrent/ThreadLocalRandom, class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands, class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface, int ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 179
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleBenchmark$1, class java/lang/Object ]
          stack = []
      LineNumberTable:
        line 422: 3
        line 423: 32
        line 424: 36
        line 425: 44
        line 427: 61
        line 428: 77
        line 429: 88
        line 430: 99
        line 431: 110
        line 433: 121
        line 434: 126
        line 435: 152
        line 437: 160
        line 439: 166
        line 440: 174
        line 442: 189
        line 427: 190
        line 444: 196
        line 445: 209
        line 446: 222
        line 447: 232
        line 448: 243
        line 450: 254
        line 451: 265
        line 452: 280
        line 453: 314
        line 454: 338
        line 455: 372
        line 422: 376
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           77     113     9 $i$a$-repeat-L2BRAdminCommands$handleBenchmark$1$1   I
           88     102    10    x1   I
           99      91    11    y1   I
          110      80    12    x2   I
          121      69    13    y2   I
          126      64    14 start   J
          152      38    16  path   Ljava/util/List;
          160      30    17 duration   J
           74     116     8     i   I
           36     340     2 iterations   I
           44     332     3 metrics   Lext/mods/gameserver/geoengine/pathfinding/model/PerformanceMetrics;
           49     327     4 random   Ljava/util/concurrent/ThreadLocalRandom;
          209     167     5   p50   D
          222     154     7   p99   D
          232     144     9   avg   D
          243     133    11 minVal   D
          254     122    13 maxVal   D
            0     386     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleBenchmark$1;
            0     386     1 $result   Ljava/lang/Object;

  public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object, kotlin.coroutines.Continuation<?>);
    descriptor: (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=5, locals=3, args_size=3
         0: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleBenchmark$1
         3: dup
         4: aload_0
         5: getfield      #14                 // Field $admin:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;
         8: aload_0
         9: getfield      #18                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;
        12: aload_2
        13: invokespecial #202                // Method "<init>":(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;Lkotlin/coroutines/Continuation;)V
        16: checkcast     #204                // class kotlin/coroutines/Continuation
        19: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleBenchmark$1;
            0      20     1 value   Ljava/lang/Object;
            0      20     2 $completion   Lkotlin/coroutines/Continuation;
    Signature: #200                         // (Ljava/lang/Object;Lkotlin/coroutines/Continuation<*>;)Lkotlin/coroutines/Continuation<Lkotlin/Unit;>;

  public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>);
    descriptor: (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: aload_2
         3: invokevirtual #210                // Method create:(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
         6: checkcast     #2                  // class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleBenchmark$1
         9: getstatic     #164                // Field kotlin/Unit.INSTANCE:Lkotlin/Unit;
        12: invokevirtual #212                // Method invokeSuspend:(Ljava/lang/Object;)Ljava/lang/Object;
        15: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleBenchmark$1;
            0      16     1    p1   Lkotlinx/coroutines/CoroutineScope;
            0      16     2    p2   Lkotlin/coroutines/Continuation;
    Signature: #208                         // (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Lkotlin/Unit;>;)Ljava/lang/Object;

  public java.lang.Object invoke(java.lang.Object, java.lang.Object);
    descriptor: (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: checkcast     #218                // class kotlinx/coroutines/CoroutineScope
         5: aload_2
         6: checkcast     #204                // class kotlin/coroutines/Continuation
         9: invokevirtual #220                // Method invoke:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
        12: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleBenchmark$1;
            0      13     1    p1   Ljava/lang/Object;
            0      13     2    p2   Ljava/lang/Object;
}
InnerClasses:
  public static #236= #110 of #82;        // AdminInterface=class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface of class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands
  static final #2;                        // class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleBenchmark$1
EnclosingMethod: #82.#235               // ext.mods.gameserver.geoengine.pathfinding.integration.L2BRAdminCommands.handleBenchmark
Signature: #3                           // Lkotlin/coroutines/jvm/internal/SuspendLambda;Lkotlin/jvm/functions/Function2<Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Lkotlin/Unit;>;Ljava/lang/Object;>;
SourceFile: "AdminCommands.kt"
RuntimeVisibleAnnotations:
  0: #29(#30=s#31,#32=[],#33=[],#34=[],#35=[],#36=[],#37=s#27,#38=s#39,#40=I#41)
    kotlin.coroutines.jvm.internal.DebugMetadata(
      f="AdminCommands.kt"
      l=[]
      nl=[]
      i=[]
      s=[]
      n=[]
      m="invokeSuspend"
      c="ext.mods.gameserver.geoengine.pathfinding.integration.L2BRAdminCommands$handleBenchmark$1"
      v=2
    )
  1: #221(#222=[I#41,I#223,I#224],#225=I#223,#226=I#227,#228=[s#229],#230=[s#231,s#232,s#214])
    kotlin.Metadata(
      mv=[2,3,0]
      k=3
      xi=48
      d1=["\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"]
      d2=["<anonymous>","","Lkotlinx/coroutines/CoroutineScope;"]
    )
BootstrapMethods:
  0: #105 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #98   Progresso: \u0001/\u0001
  1: #105 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #138 Iterações: \u0001
  2: #105 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #147 Mín: \u0001?s | Máx: \u0001?s
  3: #105 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #152 Média: \u0001?s
  4: #105 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #157 P50: \u0001?s | P99: \u0001?s
