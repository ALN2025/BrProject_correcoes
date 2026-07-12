// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService$executeParallel$2$jobs$1$1
// File: ext\mods\gameserver\geoengine\pathfinding\warmup\L2BRWarmUpService$executeParallel$2$jobs$1$1.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2$jobs$1$1.class
  Last modified 9 de jul de 2026; size 5547 bytes
  MD5 checksum 43d60ef05fefa14b88a8fdc11d6c2aec
  Compiled from "L2BRWarmUpService.kt"
final class ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService$executeParallel$2$jobs$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.lang.Integer>, java.lang.Object>
  minor version: 0
  major version: 69
  flags: (0x0030) ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2$jobs$1$1
  super_class: #5                         // kotlin/coroutines/jvm/internal/SuspendLambda
  interfaces: 1, fields: 4, methods: 5, attributes: 5
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2$jobs$1$1
    #2 = Class              #1            // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2$jobs$1$1
    #3 = Utf8               Lkotlin/coroutines/jvm/internal/SuspendLambda;Lkotlin/jvm/functions/Function2<Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Ljava/lang/Integer;>;Ljava/lang/Object;>;
    #4 = Utf8               kotlin/coroutines/jvm/internal/SuspendLambda
    #5 = Class              #4            // kotlin/coroutines/jvm/internal/SuspendLambda
    #6 = Utf8               kotlin/jvm/functions/Function2
    #7 = Class              #6            // kotlin/jvm/functions/Function2
    #8 = Utf8               <init>
    #9 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;IILkotlin/coroutines/Continuation;)V
   #10 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;IILkotlin/coroutines/Continuation<-Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2$jobs$1$1;>;)V
   #11 = Utf8               this$0
   #12 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;
   #13 = NameAndType        #11:#12       // this$0:Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;
   #14 = Fieldref           #2.#13        // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2$jobs$1$1.this$0:Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;
   #15 = Utf8               $workers
   #16 = Utf8               I
   #17 = NameAndType        #15:#16       // $workers:I
   #18 = Fieldref           #2.#17        // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2$jobs$1$1.$workers:I
   #19 = Utf8               $workerId
   #20 = NameAndType        #19:#16       // $workerId:I
   #21 = Fieldref           #2.#20        // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2$jobs$1$1.$workerId:I
   #22 = Utf8               (ILkotlin/coroutines/Continuation;)V
   #23 = NameAndType        #8:#22        // "<init>":(ILkotlin/coroutines/Continuation;)V
   #24 = Methodref          #5.#23        // kotlin/coroutines/jvm/internal/SuspendLambda."<init>":(ILkotlin/coroutines/Continuation;)V
   #25 = Utf8               this
   #26 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2$jobs$1$1;
   #27 = Utf8               $receiver
   #28 = Utf8               $completion
   #29 = Utf8               Lkotlin/coroutines/Continuation;
   #30 = Utf8               invokeSuspend
   #31 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #32 = Utf8               Lkotlin/coroutines/jvm/internal/DebugMetadata;
   #33 = Utf8               f
   #34 = Utf8               L2BRWarmUpService.kt
   #35 = Utf8               l
   #36 = Utf8               nl
   #37 = Utf8               i
   #38 = Utf8               s
   #39 = Utf8               n
   #40 = Utf8               m
   #41 = Utf8               c
   #42 = Utf8               ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService$executeParallel$2$jobs$1$1
   #43 = Utf8               v
   #44 = Integer            2
   #45 = Utf8               kotlin/coroutines/intrinsics/IntrinsicsKt
   #46 = Class              #45           // kotlin/coroutines/intrinsics/IntrinsicsKt
   #47 = Utf8               getCOROUTINE_SUSPENDED
   #48 = Utf8               ()Ljava/lang/Object;
   #49 = NameAndType        #47:#48       // getCOROUTINE_SUSPENDED:()Ljava/lang/Object;
   #50 = Methodref          #46.#49       // kotlin/coroutines/intrinsics/IntrinsicsKt.getCOROUTINE_SUSPENDED:()Ljava/lang/Object;
   #51 = Utf8               label
   #52 = NameAndType        #51:#16       // label:I
   #53 = Fieldref           #2.#52        // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2$jobs$1$1.label:I
   #54 = Utf8               kotlin/ResultKt
   #55 = Class              #54           // kotlin/ResultKt
   #56 = Utf8               throwOnFailure
   #57 = Utf8               (Ljava/lang/Object;)V
   #58 = NameAndType        #56:#57       // throwOnFailure:(Ljava/lang/Object;)V
   #59 = Methodref          #55.#58       // kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
   #60 = Utf8               java/util/concurrent/ThreadLocalRandom
   #61 = Class              #60           // java/util/concurrent/ThreadLocalRandom
   #62 = Utf8               current
   #63 = Utf8               ()Ljava/util/concurrent/ThreadLocalRandom;
   #64 = NameAndType        #62:#63       // current:()Ljava/util/concurrent/ThreadLocalRandom;
   #65 = Methodref          #61.#64       // java/util/concurrent/ThreadLocalRandom.current:()Ljava/util/concurrent/ThreadLocalRandom;
   #66 = Utf8               ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService
   #67 = Class              #66           // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService
   #68 = Utf8               access$calculateMapBounds
   #69 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds;
   #70 = NameAndType        #68:#69       // access$calculateMapBounds:(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds;
   #71 = Methodref          #67.#70       // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService.access$calculateMapBounds:(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds;
   #72 = Utf8               access$getConfig$p
   #73 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;
   #74 = NameAndType        #72:#73       // access$getConfig$p:(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;
   #75 = Methodref          #67.#74       // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService.access$getConfig$p:(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;
   #76 = Utf8               ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig
   #77 = Class              #76           // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig
   #78 = Utf8               getJitIterations
   #79 = Utf8               ()I
   #80 = NameAndType        #78:#79       // getJitIterations:()I
   #81 = Methodref          #77.#80       // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig.getJitIterations:()I
   #82 = Utf8               access$randomLocation
   #83 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;Ljava/util/concurrent/ThreadLocalRandom;Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds;)Lext/mods/gameserver/geoengine/pathfinding/model/Location;
   #84 = NameAndType        #82:#83       // access$randomLocation:(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;Ljava/util/concurrent/ThreadLocalRandom;Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds;)Lext/mods/gameserver/geoengine/pathfinding/model/Location;
   #85 = Methodref          #67.#84       // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService.access$randomLocation:(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;Ljava/util/concurrent/ThreadLocalRandom;Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds;)Lext/mods/gameserver/geoengine/pathfinding/model/Location;
   #86 = Utf8               access$getEngine$p
   #87 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;
   #88 = NameAndType        #86:#87       // access$getEngine$p:(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;
   #89 = Methodref          #67.#88       // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService.access$getEngine$p:(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;
   #90 = Utf8               ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine
   #91 = Class              #90           // ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine
   #92 = Utf8               findPath
   #93 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/model/Location;Lext/mods/gameserver/geoengine/pathfinding/model/Location;)Ljava/util/List;
   #94 = NameAndType        #92:#93       // findPath:(Lext/mods/gameserver/geoengine/pathfinding/model/Location;Lext/mods/gameserver/geoengine/pathfinding/model/Location;)Ljava/util/List;
   #95 = Methodref          #91.#94       // ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine.findPath:(Lext/mods/gameserver/geoengine/pathfinding/model/Location;Lext/mods/gameserver/geoengine/pathfinding/model/Location;)Ljava/util/List;
   #96 = Utf8               kotlin/coroutines/jvm/internal/Boxing
   #97 = Class              #96           // kotlin/coroutines/jvm/internal/Boxing
   #98 = Utf8               boxInt
   #99 = Utf8               (I)Ljava/lang/Integer;
  #100 = NameAndType        #98:#99       // boxInt:(I)Ljava/lang/Integer;
  #101 = Methodref          #97.#100      // kotlin/coroutines/jvm/internal/Boxing.boxInt:(I)Ljava/lang/Integer;
  #102 = Utf8               java/lang/IllegalStateException
  #103 = Class              #102          // java/lang/IllegalStateException
  #104 = Utf8               call to \'resume\' before \'invoke\' with coroutine
  #105 = String             #104          // call to \'resume\' before \'invoke\' with coroutine
  #106 = Utf8               (Ljava/lang/String;)V
  #107 = NameAndType        #8:#106       // "<init>":(Ljava/lang/String;)V
  #108 = Methodref          #103.#107     // java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
  #109 = Utf8               $i$a$-repeat-L2BRWarmUpService$executeParallel$2$jobs$1$1$1
  #110 = Utf8               start
  #111 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/Location;
  #112 = Utf8               end
  #113 = Utf8               it
  #114 = Utf8               random
  #115 = Utf8               Ljava/util/concurrent/ThreadLocalRandom;
  #116 = Utf8               bounds
  #117 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds;
  #118 = Utf8               iterationsPerWorker
  #119 = Utf8               $result
  #120 = Utf8               Ljava/lang/Object;
  #121 = Utf8               java/lang/Object
  #122 = Class              #121          // java/lang/Object
  #123 = Utf8               ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds
  #124 = Class              #123          // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds
  #125 = Utf8               create
  #126 = Utf8               (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
  #127 = Utf8               (Ljava/lang/Object;Lkotlin/coroutines/Continuation<*>;)Lkotlin/coroutines/Continuation<Lkotlin/Unit;>;
  #128 = NameAndType        #8:#9         // "<init>":(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;IILkotlin/coroutines/Continuation;)V
  #129 = Methodref          #2.#128       // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2$jobs$1$1."<init>":(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;IILkotlin/coroutines/Continuation;)V
  #130 = Utf8               kotlin/coroutines/Continuation
  #131 = Class              #130          // kotlin/coroutines/Continuation
  #132 = Utf8               value
  #133 = Utf8               invoke
  #134 = Utf8               (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #135 = Utf8               (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Ljava/lang/Integer;>;)Ljava/lang/Object;
  #136 = NameAndType        #125:#126     // create:(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
  #137 = Methodref          #2.#136       // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2$jobs$1$1.create:(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
  #138 = Utf8               kotlin/Unit
  #139 = Class              #138          // kotlin/Unit
  #140 = Utf8               INSTANCE
  #141 = Utf8               Lkotlin/Unit;
  #142 = NameAndType        #140:#141     // INSTANCE:Lkotlin/Unit;
  #143 = Fieldref           #139.#142     // kotlin/Unit.INSTANCE:Lkotlin/Unit;
  #144 = NameAndType        #30:#31       // invokeSuspend:(Ljava/lang/Object;)Ljava/lang/Object;
  #145 = Methodref          #2.#144       // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2$jobs$1$1.invokeSuspend:(Ljava/lang/Object;)Ljava/lang/Object;
  #146 = Utf8               p1
  #147 = Utf8               Lkotlinx/coroutines/CoroutineScope;
  #148 = Utf8               p2
  #149 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #150 = Utf8               kotlinx/coroutines/CoroutineScope
  #151 = Class              #150          // kotlinx/coroutines/CoroutineScope
  #152 = NameAndType        #133:#134     // invoke:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #153 = Methodref          #2.#152       // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2$jobs$1$1.invoke:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #154 = Utf8               Lkotlin/Metadata;
  #155 = Utf8               mv
  #156 = Integer            3
  #157 = Integer            0
  #158 = Utf8               k
  #159 = Utf8               xi
  #160 = Integer            48
  #161 = Utf8               d1
  #162 = Utf8               \u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n
  #163 = Utf8               d2
  #164 = Utf8               <anonymous>
  #165 = Utf8
  #166 = Utf8               ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2
  #167 = Class              #166          // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2
  #168 = Utf8               MapBounds
  #169 = Utf8               WarmUpConfig
  #170 = Utf8               Code
  #171 = Utf8               LocalVariableTable
  #172 = Utf8               Signature
  #173 = Utf8               StackMapTable
  #174 = Utf8               LineNumberTable
  #175 = Utf8               InnerClasses
  #176 = Utf8               EnclosingMethod
  #177 = Utf8               SourceFile
  #178 = Utf8               RuntimeVisibleAnnotations
{
  int label;
    descriptor: I
    flags: (0x0000)

  final ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService this$0;
    descriptor: Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  final int $workers;
    descriptor: I
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  final int $workerId;
    descriptor: I
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService$executeParallel$2$jobs$1$1(ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService, int, int, kotlin.coroutines.Continuation<? super ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService$executeParallel$2$jobs$1$1>);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;IILkotlin/coroutines/Continuation;)V
    flags: (0x0000)
    Code:
      stack=3, locals=5, args_size=5
         0: aload_0
         1: aload_1
         2: putfield      #14                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;
         5: aload_0
         6: iload_2
         7: putfield      #18                 // Field $workers:I
        10: aload_0
        11: iload_3
        12: putfield      #21                 // Field $workerId:I
        15: aload_0
        16: iconst_2
        17: aload         4
        19: invokespecial #24                 // Method kotlin/coroutines/jvm/internal/SuspendLambda."<init>":(ILkotlin/coroutines/Continuation;)V
        22: return
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2$jobs$1$1;
            0      23     1 $receiver   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;
            0      23     2 $workers   I
            0      23     3 $workerId   I
            0      23     4 $completion   Lkotlin/coroutines/Continuation;
    Signature: #10                          // (Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;IILkotlin/coroutines/Continuation<-Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2$jobs$1$1;>;)V

  public final java.lang.Object invokeSuspend(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Ljava/lang/Object;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=11, args_size=2
         0: invokestatic  #50                 // Method kotlin/coroutines/intrinsics/IntrinsicsKt.getCOROUTINE_SUSPENDED:()Ljava/lang/Object;
         3: pop
         4: aload_0
         5: getfield      #53                 // Field label:I
         8: tableswitch   { // 0 to 0

                       0: 28
                 default: 130
            }
        28: aload_1
        29: invokestatic  #59                 // Method kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
        32: invokestatic  #65                 // Method java/util/concurrent/ThreadLocalRandom.current:()Ljava/util/concurrent/ThreadLocalRandom;
        35: astore_2
        36: aload_0
        37: getfield      #14                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;
        40: invokestatic  #71                 // Method ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService.access$calculateMapBounds:(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds;
        43: astore_3
        44: aload_0
        45: getfield      #14                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;
        48: invokestatic  #75                 // Method ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService.access$getConfig$p:(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;
        51: invokevirtual #81                 // Method ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig.getJitIterations:()I
        54: aload_0
        55: getfield      #18                 // Field $workers:I
        58: idiv
        59: istore        4
        61: aload_0
        62: getfield      #14                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;
        65: astore        5
        67: iconst_0
        68: istore        6
        70: iload         6
        72: iload         4
        74: if_icmpge     122
        77: iload         6
        79: istore        7
        81: iconst_0
        82: istore        8
        84: aload         5
        86: aload_2
        87: aload_3
        88: invokestatic  #85                 // Method ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService.access$randomLocation:(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;Ljava/util/concurrent/ThreadLocalRandom;Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds;)Lext/mods/gameserver/geoengine/pathfinding/model/Location;
        91: astore        9
        93: aload         5
        95: aload_2
        96: aload_3
        97: invokestatic  #85                 // Method ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService.access$randomLocation:(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;Ljava/util/concurrent/ThreadLocalRandom;Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds;)Lext/mods/gameserver/geoengine/pathfinding/model/Location;
       100: astore        10
       102: aload         5
       104: invokestatic  #89                 // Method ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService.access$getEngine$p:(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;)Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;
       107: aload         9
       109: aload         10
       111: invokevirtual #95                 // Method ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine.findPath:(Lext/mods/gameserver/geoengine/pathfinding/model/Location;Lext/mods/gameserver/geoengine/pathfinding/model/Location;)Ljava/util/List;
       114: pop
       115: nop
       116: iinc          6, 1
       119: goto          70
       122: aload_0
       123: getfield      #21                 // Field $workerId:I
       126: invokestatic  #101                // Method kotlin/coroutines/jvm/internal/Boxing.boxInt:(I)Ljava/lang/Integer;
       129: areturn
       130: new           #103                // class java/lang/IllegalStateException
       133: dup
       134: ldc           #105                // String call to \'resume\' before \'invoke\' with coroutine
       136: invokespecial #108                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
       139: athrow
      StackMapTable: number_of_entries = 4
        frame_type = 28 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 41
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2$jobs$1$1, class java/lang/Object, class java/util/concurrent/ThreadLocalRandom, class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds, int, class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService, int ]
          stack = []
        frame_type = 51 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 7
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2$jobs$1$1, class java/lang/Object ]
          stack = []
      LineNumberTable:
        line 170: 3
        line 171: 32
        line 172: 36
        line 173: 44
        line 175: 67
        line 176: 84
        line 177: 93
        line 178: 102
        line 179: 115
        line 175: 116
        line 181: 122
        line 170: 130
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           84      32     8 $i$a$-repeat-L2BRWarmUpService$executeParallel$2$jobs$1$1$1   I
           93      23     9 start   Lext/mods/gameserver/geoengine/pathfinding/model/Location;
          102      14    10   end   Lext/mods/gameserver/geoengine/pathfinding/model/Location;
           81      35     7    it   I
           36      94     2 random   Ljava/util/concurrent/ThreadLocalRandom;
           44      86     3 bounds   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$MapBounds;
           61      69     4 iterationsPerWorker   I
            0     140     0  this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2$jobs$1$1;
            0     140     1 $result   Ljava/lang/Object;

  public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object, kotlin.coroutines.Continuation<?>);
    descriptor: (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=6, locals=3, args_size=3
         0: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2$jobs$1$1
         3: dup
         4: aload_0
         5: getfield      #14                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;
         8: aload_0
         9: getfield      #18                 // Field $workers:I
        12: aload_0
        13: getfield      #21                 // Field $workerId:I
        16: aload_2
        17: invokespecial #129                // Method "<init>":(Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;IILkotlin/coroutines/Continuation;)V
        20: checkcast     #131                // class kotlin/coroutines/Continuation
        23: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      24     0  this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2$jobs$1$1;
            0      24     1 value   Ljava/lang/Object;
            0      24     2 $completion   Lkotlin/coroutines/Continuation;
    Signature: #127                         // (Ljava/lang/Object;Lkotlin/coroutines/Continuation<*>;)Lkotlin/coroutines/Continuation<Lkotlin/Unit;>;

  public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.lang.Integer>);
    descriptor: (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: aload_2
         3: invokevirtual #137                // Method create:(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
         6: checkcast     #2                  // class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2$jobs$1$1
         9: getstatic     #143                // Field kotlin/Unit.INSTANCE:Lkotlin/Unit;
        12: invokevirtual #145                // Method invokeSuspend:(Ljava/lang/Object;)Ljava/lang/Object;
        15: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2$jobs$1$1;
            0      16     1    p1   Lkotlinx/coroutines/CoroutineScope;
            0      16     2    p2   Lkotlin/coroutines/Continuation;
    Signature: #135                         // (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Ljava/lang/Integer;>;)Ljava/lang/Object;

  public java.lang.Object invoke(java.lang.Object, java.lang.Object);
    descriptor: (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: checkcast     #151                // class kotlinx/coroutines/CoroutineScope
         5: aload_2
         6: checkcast     #131                // class kotlin/coroutines/Continuation
         9: invokevirtual #153                // Method invoke:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
        12: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2$jobs$1$1;
            0      13     1    p1   Ljava/lang/Object;
            0      13     2    p2   Ljava/lang/Object;
}
InnerClasses:
  public static final #169= #77 of #67;   // WarmUpConfig=class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig of class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService
  static final #167;                      // class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2
  static final #2;                        // class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$executeParallel$2$jobs$1$1
EnclosingMethod: #167.#144              // ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService$executeParallel$2.invokeSuspend
Signature: #3                           // Lkotlin/coroutines/jvm/internal/SuspendLambda;Lkotlin/jvm/functions/Function2<Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Ljava/lang/Integer;>;Ljava/lang/Object;>;
SourceFile: "L2BRWarmUpService.kt"
RuntimeVisibleAnnotations:
  0: #32(#33=s#34,#35=[],#36=[],#37=[],#38=[],#39=[],#40=s#30,#41=s#42,#43=I#44)
    kotlin.coroutines.jvm.internal.DebugMetadata(
      f="L2BRWarmUpService.kt"
      l=[]
      nl=[]
      i=[]
      s=[]
      n=[]
      m="invokeSuspend"
      c="ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService$executeParallel$2$jobs$1$1"
      v=2
    )
  1: #154(#155=[I#44,I#156,I#157],#158=I#156,#159=I#160,#161=[s#162],#163=[s#164,s#165,s#147])
    kotlin.Metadata(
      mv=[2,3,0]
      k=3
      xi=48
      d1=["\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"]
      d2=["<anonymous>","","Lkotlinx/coroutines/CoroutineScope;"]
    )
