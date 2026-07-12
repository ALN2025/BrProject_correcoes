// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.MainKt$runBenchmark$2
// File: ext\mods\gameserver\geoengine\pathfinding\MainKt$runBenchmark$2.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/MainKt$runBenchmark$2.class
  Last modified 9 de jul de 2026; size 4593 bytes
  MD5 checksum be0d58ab0ba86d2ef02b901900f00163
  Compiled from "Main.kt"
final class ext.mods.gameserver.geoengine.pathfinding.MainKt$runBenchmark$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService$WarmUpResult>, java.lang.Object>
  minor version: 0
  major version: 69
  flags: (0x0030) ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/MainKt$runBenchmark$2
  super_class: #5                         // kotlin/coroutines/jvm/internal/SuspendLambda
  interfaces: 1, fields: 4, methods: 5, attributes: 5
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/MainKt$runBenchmark$2
    #2 = Class              #1            // ext/mods/gameserver/geoengine/pathfinding/MainKt$runBenchmark$2
    #3 = Utf8               Lkotlin/coroutines/jvm/internal/SuspendLambda;Lkotlin/jvm/functions/Function2<Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult;>;Ljava/lang/Object;>;
    #4 = Utf8               kotlin/coroutines/jvm/internal/SuspendLambda
    #5 = Class              #4            // kotlin/coroutines/jvm/internal/SuspendLambda
    #6 = Utf8               kotlin/jvm/functions/Function2
    #7 = Class              #6            // kotlin/jvm/functions/Function2
    #8 = Utf8               <init>
    #9 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;Lkotlin/coroutines/Continuation;)V
   #10 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;Lkotlin/coroutines/Continuation<-Lext/mods/gameserver/geoengine/pathfinding/MainKt$runBenchmark$2;>;)V
   #11 = Utf8               $engine
   #12 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;
   #13 = NameAndType        #11:#12       // $engine:Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;
   #14 = Fieldref           #2.#13        // ext/mods/gameserver/geoengine/pathfinding/MainKt$runBenchmark$2.$engine:Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;
   #15 = Utf8               $storage
   #16 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
   #17 = NameAndType        #15:#16       // $storage:Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
   #18 = Fieldref           #2.#17        // ext/mods/gameserver/geoengine/pathfinding/MainKt$runBenchmark$2.$storage:Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
   #19 = Utf8               (ILkotlin/coroutines/Continuation;)V
   #20 = NameAndType        #8:#19        // "<init>":(ILkotlin/coroutines/Continuation;)V
   #21 = Methodref          #5.#20        // kotlin/coroutines/jvm/internal/SuspendLambda."<init>":(ILkotlin/coroutines/Continuation;)V
   #22 = Utf8               this
   #23 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/MainKt$runBenchmark$2;
   #24 = Utf8               $completion
   #25 = Utf8               Lkotlin/coroutines/Continuation;
   #26 = Utf8               invokeSuspend
   #27 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #28 = Utf8               L$0
   #29 = Utf8               Ljava/lang/Object;
   #30 = Utf8               Lkotlin/coroutines/jvm/internal/DebugMetadata;
   #31 = Utf8               f
   #32 = Utf8               Main.kt
   #33 = Utf8               l
   #34 = Integer            203
   #35 = Utf8               nl
   #36 = Integer            -1
   #37 = Utf8               i
   #38 = Integer            0
   #39 = Utf8               s
   #40 = Utf8               n
   #41 = Utf8               warmUpService
   #42 = Utf8               m
   #43 = Utf8               c
   #44 = Utf8               ext.mods.gameserver.geoengine.pathfinding.MainKt$runBenchmark$2
   #45 = Utf8               v
   #46 = Integer            2
   #47 = Utf8               kotlin/coroutines/intrinsics/IntrinsicsKt
   #48 = Class              #47           // kotlin/coroutines/intrinsics/IntrinsicsKt
   #49 = Utf8               getCOROUTINE_SUSPENDED
   #50 = Utf8               ()Ljava/lang/Object;
   #51 = NameAndType        #49:#50       // getCOROUTINE_SUSPENDED:()Ljava/lang/Object;
   #52 = Methodref          #48.#51       // kotlin/coroutines/intrinsics/IntrinsicsKt.getCOROUTINE_SUSPENDED:()Ljava/lang/Object;
   #53 = Utf8               label
   #54 = Utf8               I
   #55 = NameAndType        #53:#54       // label:I
   #56 = Fieldref           #2.#55        // ext/mods/gameserver/geoengine/pathfinding/MainKt$runBenchmark$2.label:I
   #57 = Utf8               kotlin/ResultKt
   #58 = Class              #57           // kotlin/ResultKt
   #59 = Utf8               throwOnFailure
   #60 = Utf8               (Ljava/lang/Object;)V
   #61 = NameAndType        #59:#60       // throwOnFailure:(Ljava/lang/Object;)V
   #62 = Methodref          #58.#61       // kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
   #63 = Utf8               ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService
   #64 = Class              #63           // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService
   #65 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
   #66 = NameAndType        #8:#65        // "<init>":(Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
   #67 = Methodref          #64.#66       // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService."<init>":(Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
   #68 = Utf8               kotlin/coroutines/Continuation
   #69 = Class              #68           // kotlin/coroutines/Continuation
   #70 = Utf8               kotlin/coroutines/jvm/internal/SpillingKt
   #71 = Class              #70           // kotlin/coroutines/jvm/internal/SpillingKt
   #72 = Utf8               nullOutSpilledVariable
   #73 = NameAndType        #72:#27       // nullOutSpilledVariable:(Ljava/lang/Object;)Ljava/lang/Object;
   #74 = Methodref          #71.#73       // kotlin/coroutines/jvm/internal/SpillingKt.nullOutSpilledVariable:(Ljava/lang/Object;)Ljava/lang/Object;
   #75 = NameAndType        #28:#29       // L$0:Ljava/lang/Object;
   #76 = Fieldref           #2.#75        // ext/mods/gameserver/geoengine/pathfinding/MainKt$runBenchmark$2.L$0:Ljava/lang/Object;
   #77 = Utf8               execute
   #78 = Utf8               (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
   #79 = NameAndType        #77:#78       // execute:(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
   #80 = Methodref          #64.#79       // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService.execute:(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
   #81 = Utf8               java/lang/IllegalStateException
   #82 = Class              #81           // java/lang/IllegalStateException
   #83 = Utf8               call to \'resume\' before \'invoke\' with coroutine
   #84 = String             #83           // call to \'resume\' before \'invoke\' with coroutine
   #85 = Utf8               (Ljava/lang/String;)V
   #86 = NameAndType        #8:#85        // "<init>":(Ljava/lang/String;)V
   #87 = Methodref          #82.#86       // java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
   #88 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;
   #89 = Utf8               $result
   #90 = Utf8               java/lang/Object
   #91 = Class              #90           // java/lang/Object
   #92 = Utf8               create
   #93 = Utf8               (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
   #94 = Utf8               (Ljava/lang/Object;Lkotlin/coroutines/Continuation<*>;)Lkotlin/coroutines/Continuation<Lkotlin/Unit;>;
   #95 = NameAndType        #8:#9         // "<init>":(Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;Lkotlin/coroutines/Continuation;)V
   #96 = Methodref          #2.#95        // ext/mods/gameserver/geoengine/pathfinding/MainKt$runBenchmark$2."<init>":(Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;Lkotlin/coroutines/Continuation;)V
   #97 = Utf8               value
   #98 = Utf8               invoke
   #99 = Utf8               (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #100 = Utf8               (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult;>;)Ljava/lang/Object;
  #101 = NameAndType        #92:#93       // create:(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
  #102 = Methodref          #2.#101       // ext/mods/gameserver/geoengine/pathfinding/MainKt$runBenchmark$2.create:(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
  #103 = Utf8               kotlin/Unit
  #104 = Class              #103          // kotlin/Unit
  #105 = Utf8               INSTANCE
  #106 = Utf8               Lkotlin/Unit;
  #107 = NameAndType        #105:#106     // INSTANCE:Lkotlin/Unit;
  #108 = Fieldref           #104.#107     // kotlin/Unit.INSTANCE:Lkotlin/Unit;
  #109 = NameAndType        #26:#27       // invokeSuspend:(Ljava/lang/Object;)Ljava/lang/Object;
  #110 = Methodref          #2.#109       // ext/mods/gameserver/geoengine/pathfinding/MainKt$runBenchmark$2.invokeSuspend:(Ljava/lang/Object;)Ljava/lang/Object;
  #111 = Utf8               p1
  #112 = Utf8               Lkotlinx/coroutines/CoroutineScope;
  #113 = Utf8               p2
  #114 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #115 = Utf8               kotlinx/coroutines/CoroutineScope
  #116 = Class              #115          // kotlinx/coroutines/CoroutineScope
  #117 = NameAndType        #98:#99       // invoke:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #118 = Methodref          #2.#117       // ext/mods/gameserver/geoengine/pathfinding/MainKt$runBenchmark$2.invoke:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #119 = Utf8               Lkotlin/Metadata;
  #120 = Utf8               mv
  #121 = Integer            3
  #122 = Utf8               k
  #123 = Utf8               xi
  #124 = Integer            48
  #125 = Utf8               d1
  #126 = Utf8               \u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n
  #127 = Utf8               d2
  #128 = Utf8               <anonymous>
  #129 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult;
  #130 = Utf8               ext/mods/gameserver/geoengine/pathfinding/MainKt
  #131 = Class              #130          // ext/mods/gameserver/geoengine/pathfinding/MainKt
  #132 = Utf8               runBenchmark
  #133 = Utf8               ()V
  #134 = NameAndType        #132:#133     // runBenchmark:()V
  #135 = Utf8               ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig
  #136 = Class              #135          // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig
  #137 = Utf8               WarmUpConfig
  #138 = Utf8               ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult
  #139 = Class              #138          // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult
  #140 = Utf8               WarmUpResult
  #141 = Utf8               Code
  #142 = Utf8               LocalVariableTable
  #143 = Utf8               Signature
  #144 = Utf8               StackMapTable
  #145 = Utf8               LineNumberTable
  #146 = Utf8               InnerClasses
  #147 = Utf8               EnclosingMethod
  #148 = Utf8               SourceFile
  #149 = Utf8               RuntimeVisibleAnnotations
{
  java.lang.Object L$0;
    descriptor: Ljava/lang/Object;
    flags: (0x0000)

  int label;
    descriptor: I
    flags: (0x0000)

  final ext.mods.gameserver.geoengine.pathfinding.core.L2BREngine $engine;
    descriptor: Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  final ext.mods.gameserver.geoengine.pathfinding.native.NativeStorage $storage;
    descriptor: Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  ext.mods.gameserver.geoengine.pathfinding.MainKt$runBenchmark$2(ext.mods.gameserver.geoengine.pathfinding.core.L2BREngine, ext.mods.gameserver.geoengine.pathfinding.native.NativeStorage, kotlin.coroutines.Continuation<? super ext.mods.gameserver.geoengine.pathfinding.MainKt$runBenchmark$2>);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;Lkotlin/coroutines/Continuation;)V
    flags: (0x0000)
    Code:
      stack=3, locals=4, args_size=4
         0: aload_0
         1: aload_1
         2: putfield      #14                 // Field $engine:Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;
         5: aload_0
         6: aload_2
         7: putfield      #18                 // Field $storage:Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
        10: aload_0
        11: iconst_2
        12: aload_3
        13: invokespecial #21                 // Method kotlin/coroutines/jvm/internal/SuspendLambda."<init>":(ILkotlin/coroutines/Continuation;)V
        16: return
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/geoengine/pathfinding/MainKt$runBenchmark$2;
            0      17     1 $engine   Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;
            0      17     2 $storage   Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
            0      17     3 $completion   Lkotlin/coroutines/Continuation;
    Signature: #10                          // (Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;Lkotlin/coroutines/Continuation<-Lext/mods/gameserver/geoengine/pathfinding/MainKt$runBenchmark$2;>;)V

  public final java.lang.Object invokeSuspend(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Ljava/lang/Object;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=7, locals=4, args_size=2
         0: invokestatic  #52                 // Method kotlin/coroutines/intrinsics/IntrinsicsKt.getCOROUTINE_SUSPENDED:()Ljava/lang/Object;
         3: astore_3
         4: aload_0
         5: getfield      #56                 // Field label:I
         8: tableswitch   { // 0 to 1

                       0: 32

                       1: 83
                 default: 97
            }
        32: aload_1
        33: invokestatic  #62                 // Method kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
        36: new           #64                 // class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService
        39: dup
        40: aload_0
        41: getfield      #14                 // Field $engine:Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;
        44: aload_0
        45: getfield      #18                 // Field $storage:Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
        48: aconst_null
        49: iconst_4
        50: aconst_null
        51: invokespecial #67                 // Method ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService."<init>":(Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        54: astore_2
        55: aload_2
        56: aload_0
        57: checkcast     #69                 // class kotlin/coroutines/Continuation
        60: aload_0
        61: aload_2
        62: invokestatic  #74                 // Method kotlin/coroutines/jvm/internal/SpillingKt.nullOutSpilledVariable:(Ljava/lang/Object;)Ljava/lang/Object;
        65: putfield      #76                 // Field L$0:Ljava/lang/Object;
        68: aload_0
        69: iconst_1
        70: putfield      #56                 // Field label:I
        73: invokevirtual #80                 // Method ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService.execute:(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
        76: dup
        77: aload_3
        78: if_acmpne     96
        81: aload_3
        82: areturn
        83: aload_0
        84: getfield      #76                 // Field L$0:Ljava/lang/Object;
        87: checkcast     #64                 // class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService
        90: astore_2
        91: aload_1
        92: invokestatic  #62                 // Method kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
        95: aload_1
        96: areturn
        97: new           #82                 // class java/lang/IllegalStateException
       100: dup
       101: ldc           #84                 // String call to \'resume\' before \'invoke\' with coroutine
       103: invokespecial #87                 // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
       106: athrow
      StackMapTable: number_of_entries = 4
        frame_type = 253 /* append */
          offset_delta = 32
          locals = [ top, class java/lang/Object ]
        frame_type = 50 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 12
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/MainKt$runBenchmark$2, class java/lang/Object, class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService, class java/lang/Object ]
          stack = [ class java/lang/Object ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/MainKt$runBenchmark$2, class java/lang/Object, top, class java/lang/Object ]
          stack = []
      LineNumberTable:
        line 201: 3
        line 202: 36
        line 203: 55
        line 201: 81
        line 203: 96
        line 201: 97
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           55      28     2 warmUpService   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;
            0     107     0  this   Lext/mods/gameserver/geoengine/pathfinding/MainKt$runBenchmark$2;
            0     107     1 $result   Ljava/lang/Object;
           91       6     2 warmUpService   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;

  public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object, kotlin.coroutines.Continuation<?>);
    descriptor: (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=5, locals=3, args_size=3
         0: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/MainKt$runBenchmark$2
         3: dup
         4: aload_0
         5: getfield      #14                 // Field $engine:Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;
         8: aload_0
         9: getfield      #18                 // Field $storage:Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
        12: aload_2
        13: invokespecial #96                 // Method "<init>":(Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;Lkotlin/coroutines/Continuation;)V
        16: checkcast     #69                 // class kotlin/coroutines/Continuation
        19: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/geoengine/pathfinding/MainKt$runBenchmark$2;
            0      20     1 value   Ljava/lang/Object;
            0      20     2 $completion   Lkotlin/coroutines/Continuation;
    Signature: #94                          // (Ljava/lang/Object;Lkotlin/coroutines/Continuation<*>;)Lkotlin/coroutines/Continuation<Lkotlin/Unit;>;

  public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super ext.mods.gameserver.geoengine.pathfinding.warmup.L2BRWarmUpService$WarmUpResult>);
    descriptor: (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: aload_2
         3: invokevirtual #102                // Method create:(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
         6: checkcast     #2                  // class ext/mods/gameserver/geoengine/pathfinding/MainKt$runBenchmark$2
         9: getstatic     #108                // Field kotlin/Unit.INSTANCE:Lkotlin/Unit;
        12: invokevirtual #110                // Method invokeSuspend:(Ljava/lang/Object;)Ljava/lang/Object;
        15: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/geoengine/pathfinding/MainKt$runBenchmark$2;
            0      16     1    p1   Lkotlinx/coroutines/CoroutineScope;
            0      16     2    p2   Lkotlin/coroutines/Continuation;
    Signature: #100                         // (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult;>;)Ljava/lang/Object;

  public java.lang.Object invoke(java.lang.Object, java.lang.Object);
    descriptor: (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: checkcast     #116                // class kotlinx/coroutines/CoroutineScope
         5: aload_2
         6: checkcast     #69                 // class kotlin/coroutines/Continuation
         9: invokevirtual #118                // Method invoke:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
        12: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/geoengine/pathfinding/MainKt$runBenchmark$2;
            0      13     1    p1   Ljava/lang/Object;
            0      13     2    p2   Ljava/lang/Object;
}
InnerClasses:
  static final #2;                        // class ext/mods/gameserver/geoengine/pathfinding/MainKt$runBenchmark$2
  public static final #137= #136 of #64;  // WarmUpConfig=class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig of class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService
  public static final #140= #139 of #64;  // WarmUpResult=class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult of class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService
EnclosingMethod: #131.#134              // ext.mods.gameserver.geoengine.pathfinding.MainKt.runBenchmark
Signature: #3                           // Lkotlin/coroutines/jvm/internal/SuspendLambda;Lkotlin/jvm/functions/Function2<Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult;>;Ljava/lang/Object;>;
SourceFile: "Main.kt"
RuntimeVisibleAnnotations:
  0: #30(#31=s#32,#33=[I#34],#35=[I#36],#37=[I#38],#39=[s#28],#40=[s#41],#42=s#26,#43=s#44,#45=I#46)
    kotlin.coroutines.jvm.internal.DebugMetadata(
      f="Main.kt"
      l=[203]
      nl=[-1]
      i=[0]
      s=["L$0"]
      n=["warmUpService"]
      m="invokeSuspend"
      c="ext.mods.gameserver.geoengine.pathfinding.MainKt$runBenchmark$2"
      v=2
    )
  1: #119(#120=[I#46,I#121,I#38],#122=I#121,#123=I#124,#125=[s#126],#127=[s#128,s#129,s#112])
    kotlin.Metadata(
      mv=[2,3,0]
      k=3
      xi=48
      d1=["\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"]
      d2=["<anonymous>","Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult;","Lkotlinx/coroutines/CoroutineScope;"]
    )
