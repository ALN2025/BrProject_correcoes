// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.integration.GeoEngineBridge$loadL2BREngine$1
// File: ext\mods\gameserver\geoengine\pathfinding\integration\GeoEngineBridge$loadL2BREngine$1.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$loadL2BREngine$1.class
  Last modified 9 de jul de 2026; size 5752 bytes
  MD5 checksum 089402a60796397739d5510700b092c5
  Compiled from "GeoEngineBridge.kt"
final class ext.mods.gameserver.geoengine.pathfinding.integration.GeoEngineBridge$loadL2BREngine$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>
  minor version: 0
  major version: 69
  flags: (0x0030) ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$loadL2BREngine$1
  super_class: #5                         // kotlin/coroutines/jvm/internal/SuspendLambda
  interfaces: 1, fields: 7, methods: 5, attributes: 6
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$loadL2BREngine$1
    #2 = Class              #1            // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$loadL2BREngine$1
    #3 = Utf8               Lkotlin/coroutines/jvm/internal/SuspendLambda;Lkotlin/jvm/functions/Function2<Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Lkotlin/Unit;>;Ljava/lang/Object;>;
    #4 = Utf8               kotlin/coroutines/jvm/internal/SuspendLambda
    #5 = Class              #4            // kotlin/coroutines/jvm/internal/SuspendLambda
    #6 = Utf8               kotlin/jvm/functions/Function2
    #7 = Class              #6            // kotlin/jvm/functions/Function2
    #8 = Utf8               <init>
    #9 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;IILkotlin/coroutines/Continuation;)V
   #10 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;IILkotlin/coroutines/Continuation<-Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$loadL2BREngine$1;>;)V
   #11 = Utf8               $engine
   #12 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;
   #13 = NameAndType        #11:#12       // $engine:Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;
   #14 = Fieldref           #2.#13        // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$loadL2BREngine$1.$engine:Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;
   #15 = Utf8               $storage
   #16 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
   #17 = NameAndType        #15:#16       // $storage:Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
   #18 = Fieldref           #2.#17        // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$loadL2BREngine$1.$storage:Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
   #19 = Utf8               this$0
   #20 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;
   #21 = NameAndType        #19:#20       // this$0:Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;
   #22 = Fieldref           #2.#21        // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$loadL2BREngine$1.this$0:Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;
   #23 = Utf8               $regionX
   #24 = Utf8               I
   #25 = NameAndType        #23:#24       // $regionX:I
   #26 = Fieldref           #2.#25        // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$loadL2BREngine$1.$regionX:I
   #27 = Utf8               $regionY
   #28 = NameAndType        #27:#24       // $regionY:I
   #29 = Fieldref           #2.#28        // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$loadL2BREngine$1.$regionY:I
   #30 = Utf8               (ILkotlin/coroutines/Continuation;)V
   #31 = NameAndType        #8:#30        // "<init>":(ILkotlin/coroutines/Continuation;)V
   #32 = Methodref          #5.#31        // kotlin/coroutines/jvm/internal/SuspendLambda."<init>":(ILkotlin/coroutines/Continuation;)V
   #33 = Utf8               this
   #34 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$loadL2BREngine$1;
   #35 = Utf8               $receiver
   #36 = Utf8               $completion
   #37 = Utf8               Lkotlin/coroutines/Continuation;
   #38 = Utf8               invokeSuspend
   #39 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #40 = Utf8               L$0
   #41 = Utf8               Ljava/lang/Object;
   #42 = Utf8               Lkotlin/coroutines/jvm/internal/DebugMetadata;
   #43 = Utf8               f
   #44 = Utf8               GeoEngineBridge.kt
   #45 = Utf8               l
   #46 = Integer            186
   #47 = Utf8               nl
   #48 = Integer            188
   #49 = Utf8               i
   #50 = Integer            0
   #51 = Utf8               s
   #52 = Utf8               n
   #53 = Utf8               warmUpService
   #54 = Utf8               m
   #55 = Utf8               c
   #56 = Utf8               ext.mods.gameserver.geoengine.pathfinding.integration.GeoEngineBridge$loadL2BREngine$1
   #57 = Utf8               v
   #58 = Integer            2
   #59 = Utf8               kotlin/coroutines/intrinsics/IntrinsicsKt
   #60 = Class              #59           // kotlin/coroutines/intrinsics/IntrinsicsKt
   #61 = Utf8               getCOROUTINE_SUSPENDED
   #62 = Utf8               ()Ljava/lang/Object;
   #63 = NameAndType        #61:#62       // getCOROUTINE_SUSPENDED:()Ljava/lang/Object;
   #64 = Methodref          #60.#63       // kotlin/coroutines/intrinsics/IntrinsicsKt.getCOROUTINE_SUSPENDED:()Ljava/lang/Object;
   #65 = Utf8               label
   #66 = NameAndType        #65:#24       // label:I
   #67 = Fieldref           #2.#66        // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$loadL2BREngine$1.label:I
   #68 = Utf8               kotlin/ResultKt
   #69 = Class              #68           // kotlin/ResultKt
   #70 = Utf8               throwOnFailure
   #71 = Utf8               (Ljava/lang/Object;)V
   #72 = NameAndType        #70:#71       // throwOnFailure:(Ljava/lang/Object;)V
   #73 = Methodref          #69.#72       // kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
   #74 = Utf8               ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService
   #75 = Class              #74           // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService
   #76 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
   #77 = NameAndType        #8:#76        // "<init>":(Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
   #78 = Methodref          #75.#77       // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService."<init>":(Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
   #79 = Utf8               kotlin/coroutines/Continuation
   #80 = Class              #79           // kotlin/coroutines/Continuation
   #81 = Utf8               kotlin/coroutines/jvm/internal/SpillingKt
   #82 = Class              #81           // kotlin/coroutines/jvm/internal/SpillingKt
   #83 = Utf8               nullOutSpilledVariable
   #84 = NameAndType        #83:#39       // nullOutSpilledVariable:(Ljava/lang/Object;)Ljava/lang/Object;
   #85 = Methodref          #82.#84       // kotlin/coroutines/jvm/internal/SpillingKt.nullOutSpilledVariable:(Ljava/lang/Object;)Ljava/lang/Object;
   #86 = NameAndType        #40:#41       // L$0:Ljava/lang/Object;
   #87 = Fieldref           #2.#86        // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$loadL2BREngine$1.L$0:Ljava/lang/Object;
   #88 = Utf8               execute
   #89 = Utf8               (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
   #90 = NameAndType        #88:#89       // execute:(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
   #91 = Methodref          #75.#90       // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService.execute:(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
   #92 = Utf8               ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult
   #93 = Class              #92           // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult
   #94 = Utf8               getFinalLatencyP99
   #95 = Utf8               ()D
   #96 = NameAndType        #94:#95       // getFinalLatencyP99:()D
   #97 = Methodref          #93.#96       // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult.getFinalLatencyP99:()D
   #98 = Double             10.0d
  #100 = Utf8               ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge
  #101 = Class              #100          // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge
  #102 = Utf8               access$getLogger$p
  #103 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;)Ljava/util/logging/Logger;
  #104 = NameAndType        #102:#103     // access$getLogger$p:(Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;)Ljava/util/logging/Logger;
  #105 = Methodref          #101.#104     // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge.access$getLogger$p:(Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;)Ljava/util/logging/Logger;
  #106 = Utf8               [\u0001, \u0001] Warm-up alerta: P99=\u0001?s
  #107 = String             #106          // [\u0001, \u0001] Warm-up alerta: P99=\u0001?s
  #108 = Utf8               java/lang/invoke/StringConcatFactory
  #109 = Class              #108          // java/lang/invoke/StringConcatFactory
  #110 = Utf8               makeConcatWithConstants
  #111 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #112 = NameAndType        #110:#111     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #113 = Methodref          #109.#112     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #114 = MethodHandle       6:#113        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #115 = Utf8               (IID)Ljava/lang/String;
  #116 = NameAndType        #110:#115     // makeConcatWithConstants:(IID)Ljava/lang/String;
  #117 = InvokeDynamic      #0:#116       // #0:makeConcatWithConstants:(IID)Ljava/lang/String;
  #118 = Utf8               java/util/logging/Logger
  #119 = Class              #118          // java/util/logging/Logger
  #120 = Utf8               warning
  #121 = Utf8               (Ljava/lang/String;)V
  #122 = NameAndType        #120:#121     // warning:(Ljava/lang/String;)V
  #123 = Methodref          #119.#122     // java/util/logging/Logger.warning:(Ljava/lang/String;)V
  #124 = Utf8               [\u0001, \u0001] Warm-up OK: P99=\u0001?s
  #125 = String             #124          // [\u0001, \u0001] Warm-up OK: P99=\u0001?s
  #126 = InvokeDynamic      #1:#116       // #1:makeConcatWithConstants:(IID)Ljava/lang/String;
  #127 = Utf8               info
  #128 = NameAndType        #127:#121     // info:(Ljava/lang/String;)V
  #129 = Methodref          #119.#128     // java/util/logging/Logger.info:(Ljava/lang/String;)V
  #130 = Utf8               kotlin/Unit
  #131 = Class              #130          // kotlin/Unit
  #132 = Utf8               INSTANCE
  #133 = Utf8               Lkotlin/Unit;
  #134 = NameAndType        #132:#133     // INSTANCE:Lkotlin/Unit;
  #135 = Fieldref           #131.#134     // kotlin/Unit.INSTANCE:Lkotlin/Unit;
  #136 = Utf8               java/lang/IllegalStateException
  #137 = Class              #136          // java/lang/IllegalStateException
  #138 = Utf8               call to \'resume\' before \'invoke\' with coroutine
  #139 = String             #138          // call to \'resume\' before \'invoke\' with coroutine
  #140 = NameAndType        #8:#121       // "<init>":(Ljava/lang/String;)V
  #141 = Methodref          #137.#140     // java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
  #142 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;
  #143 = Utf8               result
  #144 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult;
  #145 = Utf8               $result
  #146 = Utf8               java/lang/Object
  #147 = Class              #146          // java/lang/Object
  #148 = Utf8               create
  #149 = Utf8               (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
  #150 = Utf8               (Ljava/lang/Object;Lkotlin/coroutines/Continuation<*>;)Lkotlin/coroutines/Continuation<Lkotlin/Unit;>;
  #151 = NameAndType        #8:#9         // "<init>":(Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;IILkotlin/coroutines/Continuation;)V
  #152 = Methodref          #2.#151       // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$loadL2BREngine$1."<init>":(Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;IILkotlin/coroutines/Continuation;)V
  #153 = Utf8               value
  #154 = Utf8               invoke
  #155 = Utf8               (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #156 = Utf8               (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Lkotlin/Unit;>;)Ljava/lang/Object;
  #157 = NameAndType        #148:#149     // create:(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
  #158 = Methodref          #2.#157       // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$loadL2BREngine$1.create:(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
  #159 = NameAndType        #38:#39       // invokeSuspend:(Ljava/lang/Object;)Ljava/lang/Object;
  #160 = Methodref          #2.#159       // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$loadL2BREngine$1.invokeSuspend:(Ljava/lang/Object;)Ljava/lang/Object;
  #161 = Utf8               p1
  #162 = Utf8               Lkotlinx/coroutines/CoroutineScope;
  #163 = Utf8               p2
  #164 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #165 = Utf8               kotlinx/coroutines/CoroutineScope
  #166 = Class              #165          // kotlinx/coroutines/CoroutineScope
  #167 = NameAndType        #154:#155     // invoke:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #168 = Methodref          #2.#167       // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$loadL2BREngine$1.invoke:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #169 = Utf8               Lkotlin/Metadata;
  #170 = Utf8               mv
  #171 = Integer            3
  #172 = Utf8               k
  #173 = Utf8               xi
  #174 = Integer            48
  #175 = Utf8               d1
  #176 = Utf8               \u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n
  #177 = Utf8               d2
  #178 = Utf8               <anonymous>
  #179 = Utf8
  #180 = Utf8               loadL2BREngine
  #181 = Utf8               (IILjava/nio/file/Path;)V
  #182 = NameAndType        #180:#181     // loadL2BREngine:(IILjava/nio/file/Path;)V
  #183 = Utf8               ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig
  #184 = Class              #183          // ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig
  #185 = Utf8               WarmUpConfig
  #186 = Utf8               WarmUpResult
  #187 = Utf8               Code
  #188 = Utf8               LocalVariableTable
  #189 = Utf8               Signature
  #190 = Utf8               StackMapTable
  #191 = Utf8               LineNumberTable
  #192 = Utf8               InnerClasses
  #193 = Utf8               EnclosingMethod
  #194 = Utf8               SourceFile
  #195 = Utf8               RuntimeVisibleAnnotations
  #196 = Utf8               BootstrapMethods
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

  final ext.mods.gameserver.geoengine.pathfinding.integration.GeoEngineBridge this$0;
    descriptor: Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  final int $regionX;
    descriptor: I
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  final int $regionY;
    descriptor: I
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  ext.mods.gameserver.geoengine.pathfinding.integration.GeoEngineBridge$loadL2BREngine$1(ext.mods.gameserver.geoengine.pathfinding.core.L2BREngine, ext.mods.gameserver.geoengine.pathfinding.native.NativeStorage, ext.mods.gameserver.geoengine.pathfinding.integration.GeoEngineBridge, int, int, kotlin.coroutines.Continuation<? super ext.mods.gameserver.geoengine.pathfinding.integration.GeoEngineBridge$loadL2BREngine$1>);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;IILkotlin/coroutines/Continuation;)V
    flags: (0x0000)
    Code:
      stack=3, locals=7, args_size=7
         0: aload_0
         1: aload_1
         2: putfield      #14                 // Field $engine:Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;
         5: aload_0
         6: aload_2
         7: putfield      #18                 // Field $storage:Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
        10: aload_0
        11: aload_3
        12: putfield      #22                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;
        15: aload_0
        16: iload         4
        18: putfield      #26                 // Field $regionX:I
        21: aload_0
        22: iload         5
        24: putfield      #29                 // Field $regionY:I
        27: aload_0
        28: iconst_2
        29: aload         6
        31: invokespecial #32                 // Method kotlin/coroutines/jvm/internal/SuspendLambda."<init>":(ILkotlin/coroutines/Continuation;)V
        34: return
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      35     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$loadL2BREngine$1;
            0      35     1 $engine   Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;
            0      35     2 $storage   Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
            0      35     3 $receiver   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;
            0      35     4 $regionX   I
            0      35     5 $regionY   I
            0      35     6 $completion   Lkotlin/coroutines/Continuation;
    Signature: #10                          // (Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;IILkotlin/coroutines/Continuation<-Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$loadL2BREngine$1;>;)V

  public final java.lang.Object invokeSuspend(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Ljava/lang/Object;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=7, locals=5, args_size=2
         0: invokestatic  #64                 // Method kotlin/coroutines/intrinsics/IntrinsicsKt.getCOROUTINE_SUSPENDED:()Ljava/lang/Object;
         3: astore        4
         5: aload_0
         6: getfield      #67                 // Field label:I
         9: tableswitch   { // 0 to 1

                       0: 32

                       1: 85
                 default: 174
            }
        32: aload_1
        33: invokestatic  #73                 // Method kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
        36: new           #75                 // class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService
        39: dup
        40: aload_0
        41: getfield      #14                 // Field $engine:Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;
        44: aload_0
        45: getfield      #18                 // Field $storage:Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
        48: aconst_null
        49: iconst_4
        50: aconst_null
        51: invokespecial #78                 // Method ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService."<init>":(Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        54: astore_2
        55: aload_2
        56: aload_0
        57: checkcast     #80                 // class kotlin/coroutines/Continuation
        60: aload_0
        61: aload_2
        62: invokestatic  #85                 // Method kotlin/coroutines/jvm/internal/SpillingKt.nullOutSpilledVariable:(Ljava/lang/Object;)Ljava/lang/Object;
        65: putfield      #87                 // Field L$0:Ljava/lang/Object;
        68: aload_0
        69: iconst_1
        70: putfield      #67                 // Field label:I
        73: invokevirtual #91                 // Method ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService.execute:(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
        76: dup
        77: aload         4
        79: if_acmpne     98
        82: aload         4
        84: areturn
        85: aload_0
        86: getfield      #87                 // Field L$0:Ljava/lang/Object;
        89: checkcast     #75                 // class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService
        92: astore_2
        93: aload_1
        94: invokestatic  #73                 // Method kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
        97: aload_1
        98: checkcast     #93                 // class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult
       101: astore_3
       102: aload_3
       103: invokevirtual #97                 // Method ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult.getFinalLatencyP99:()D
       106: ldc2_w        #98                 // double 10.0d
       109: dcmpl
       110: ifle          143
       113: aload_0
       114: getfield      #22                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;
       117: invokestatic  #105                // Method ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge.access$getLogger$p:(Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;)Ljava/util/logging/Logger;
       120: aload_0
       121: getfield      #26                 // Field $regionX:I
       124: aload_0
       125: getfield      #29                 // Field $regionY:I
       128: aload_3
       129: invokevirtual #97                 // Method ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult.getFinalLatencyP99:()D
       132: invokedynamic #117,  0            // InvokeDynamic #0:makeConcatWithConstants:(IID)Ljava/lang/String;
       137: invokevirtual #123                // Method java/util/logging/Logger.warning:(Ljava/lang/String;)V
       140: goto          170
       143: aload_0
       144: getfield      #22                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;
       147: invokestatic  #105                // Method ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge.access$getLogger$p:(Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;)Ljava/util/logging/Logger;
       150: aload_0
       151: getfield      #26                 // Field $regionX:I
       154: aload_0
       155: getfield      #29                 // Field $regionY:I
       158: aload_3
       159: invokevirtual #97                 // Method ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult.getFinalLatencyP99:()D
       162: invokedynamic #126,  0            // InvokeDynamic #1:makeConcatWithConstants:(IID)Ljava/lang/String;
       167: invokevirtual #129                // Method java/util/logging/Logger.info:(Ljava/lang/String;)V
       170: getstatic     #135                // Field kotlin/Unit.INSTANCE:Lkotlin/Unit;
       173: areturn
       174: new           #137                // class java/lang/IllegalStateException
       177: dup
       178: ldc           #139                // String call to \'resume\' before \'invoke\' with coroutine
       180: invokespecial #141                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
       183: athrow
      StackMapTable: number_of_entries = 6
        frame_type = 254 /* append */
          offset_delta = 32
          locals = [ top, top, class java/lang/Object ]
        frame_type = 52 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 12
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$loadL2BREngine$1, class java/lang/Object, class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService, top, class java/lang/Object ]
          stack = [ class java/lang/Object ]
        frame_type = 255 /* full_frame */
          offset_delta = 44
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$loadL2BREngine$1, class java/lang/Object, class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService, class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult, class java/lang/Object ]
          stack = []
        frame_type = 26 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 3
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$loadL2BREngine$1, class java/lang/Object, top, top, class java/lang/Object ]
          stack = []
      LineNumberTable:
        line 184: 3
        line 185: 36
        line 186: 55
        line 184: 82
        line 188: 102
        line 189: 113
        line 191: 143
        line 193: 170
        line 184: 174
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           55      30     2 warmUpService   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;
          102      72     3 result   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult;
            0     184     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$loadL2BREngine$1;
            0     184     1 $result   Ljava/lang/Object;
           93      81     2 warmUpService   Lext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService;

  public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object, kotlin.coroutines.Continuation<?>);
    descriptor: (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=8, locals=3, args_size=3
         0: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$loadL2BREngine$1
         3: dup
         4: aload_0
         5: getfield      #14                 // Field $engine:Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;
         8: aload_0
         9: getfield      #18                 // Field $storage:Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
        12: aload_0
        13: getfield      #22                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;
        16: aload_0
        17: getfield      #26                 // Field $regionX:I
        20: aload_0
        21: getfield      #29                 // Field $regionY:I
        24: aload_2
        25: invokespecial #152                // Method "<init>":(Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;IILkotlin/coroutines/Continuation;)V
        28: checkcast     #80                 // class kotlin/coroutines/Continuation
        31: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      32     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$loadL2BREngine$1;
            0      32     1 value   Ljava/lang/Object;
            0      32     2 $completion   Lkotlin/coroutines/Continuation;
    Signature: #150                         // (Ljava/lang/Object;Lkotlin/coroutines/Continuation<*>;)Lkotlin/coroutines/Continuation<Lkotlin/Unit;>;

  public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>);
    descriptor: (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: aload_2
         3: invokevirtual #158                // Method create:(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
         6: checkcast     #2                  // class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$loadL2BREngine$1
         9: getstatic     #135                // Field kotlin/Unit.INSTANCE:Lkotlin/Unit;
        12: invokevirtual #160                // Method invokeSuspend:(Ljava/lang/Object;)Ljava/lang/Object;
        15: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$loadL2BREngine$1;
            0      16     1    p1   Lkotlinx/coroutines/CoroutineScope;
            0      16     2    p2   Lkotlin/coroutines/Continuation;
    Signature: #156                         // (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Lkotlin/Unit;>;)Ljava/lang/Object;

  public java.lang.Object invoke(java.lang.Object, java.lang.Object);
    descriptor: (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: checkcast     #166                // class kotlinx/coroutines/CoroutineScope
         5: aload_2
         6: checkcast     #80                 // class kotlin/coroutines/Continuation
         9: invokevirtual #168                // Method invoke:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
        12: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$loadL2BREngine$1;
            0      13     1    p1   Ljava/lang/Object;
            0      13     2    p2   Ljava/lang/Object;
}
InnerClasses:
  static final #2;                        // class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$loadL2BREngine$1
  public static final #185= #184 of #75;  // WarmUpConfig=class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpConfig of class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService
  public static final #186= #93 of #75;   // WarmUpResult=class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService$WarmUpResult of class ext/mods/gameserver/geoengine/pathfinding/warmup/L2BRWarmUpService
EnclosingMethod: #101.#182              // ext.mods.gameserver.geoengine.pathfinding.integration.GeoEngineBridge.loadL2BREngine
Signature: #3                           // Lkotlin/coroutines/jvm/internal/SuspendLambda;Lkotlin/jvm/functions/Function2<Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Lkotlin/Unit;>;Ljava/lang/Object;>;
SourceFile: "GeoEngineBridge.kt"
RuntimeVisibleAnnotations:
  0: #42(#43=s#44,#45=[I#46],#47=[I#48],#49=[I#50],#51=[s#40],#52=[s#53],#54=s#38,#55=s#56,#57=I#58)
    kotlin.coroutines.jvm.internal.DebugMetadata(
      f="GeoEngineBridge.kt"
      l=[186]
      nl=[188]
      i=[0]
      s=["L$0"]
      n=["warmUpService"]
      m="invokeSuspend"
      c="ext.mods.gameserver.geoengine.pathfinding.integration.GeoEngineBridge$loadL2BREngine$1"
      v=2
    )
  1: #169(#170=[I#58,I#171,I#50],#172=I#171,#173=I#174,#175=[s#176],#177=[s#178,s#179,s#162])
    kotlin.Metadata(
      mv=[2,3,0]
      k=3
      xi=48
      d1=["\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"]
      d2=["<anonymous>","","Lkotlinx/coroutines/CoroutineScope;"]
    )
BootstrapMethods:
  0: #114 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #107 [\u0001, \u0001] Warm-up alerta: P99=\u0001?s
  1: #114 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #125 [\u0001, \u0001] Warm-up OK: P99=\u0001?s
