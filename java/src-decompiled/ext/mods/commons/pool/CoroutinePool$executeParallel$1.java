// Bytecode for: ext.mods.commons.pool.CoroutinePool$executeParallel$1
// File: ext\mods\commons\pool\CoroutinePool$executeParallel$1.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/pool/CoroutinePool$executeParallel$1.class
  Last modified 9 de jul de 2026; size 3670 bytes
  MD5 checksum 1a111925f12bd25b4c23eb8ceb956399
  Compiled from "CoroutinePool.kt"
final class ext.mods.commons.pool.CoroutinePool$executeParallel$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>
  minor version: 0
  major version: 69
  flags: (0x0030) ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/commons/pool/CoroutinePool$executeParallel$1
  super_class: #5                         // kotlin/coroutines/jvm/internal/SuspendLambda
  interfaces: 1, fields: 2, methods: 5, attributes: 6
Constant pool:
    #1 = Utf8               ext/mods/commons/pool/CoroutinePool$executeParallel$1
    #2 = Class              #1            // ext/mods/commons/pool/CoroutinePool$executeParallel$1
    #3 = Utf8               Lkotlin/coroutines/jvm/internal/SuspendLambda;Lkotlin/jvm/functions/Function2<Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Lkotlin/Unit;>;Ljava/lang/Object;>;
    #4 = Utf8               kotlin/coroutines/jvm/internal/SuspendLambda
    #5 = Class              #4            // kotlin/coroutines/jvm/internal/SuspendLambda
    #6 = Utf8               kotlin/jvm/functions/Function2
    #7 = Class              #6            // kotlin/jvm/functions/Function2
    #8 = Utf8               <init>
    #9 = Utf8               (Ljava/lang/Runnable;Lkotlin/coroutines/Continuation;)V
   #10 = Utf8               (Ljava/lang/Runnable;Lkotlin/coroutines/Continuation<-Lext/mods/commons/pool/CoroutinePool$executeParallel$1;>;)V
   #11 = Utf8               $task
   #12 = Utf8               Ljava/lang/Runnable;
   #13 = NameAndType        #11:#12       // $task:Ljava/lang/Runnable;
   #14 = Fieldref           #2.#13        // ext/mods/commons/pool/CoroutinePool$executeParallel$1.$task:Ljava/lang/Runnable;
   #15 = Utf8               (ILkotlin/coroutines/Continuation;)V
   #16 = NameAndType        #8:#15        // "<init>":(ILkotlin/coroutines/Continuation;)V
   #17 = Methodref          #5.#16        // kotlin/coroutines/jvm/internal/SuspendLambda."<init>":(ILkotlin/coroutines/Continuation;)V
   #18 = Utf8               this
   #19 = Utf8               Lext/mods/commons/pool/CoroutinePool$executeParallel$1;
   #20 = Utf8               $completion
   #21 = Utf8               Lkotlin/coroutines/Continuation;
   #22 = Utf8               invokeSuspend
   #23 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #24 = Utf8               Lkotlin/coroutines/jvm/internal/DebugMetadata;
   #25 = Utf8               f
   #26 = Utf8               CoroutinePool.kt
   #27 = Utf8               l
   #28 = Utf8               nl
   #29 = Utf8               i
   #30 = Utf8               s
   #31 = Utf8               n
   #32 = Utf8               m
   #33 = Utf8               c
   #34 = Utf8               ext.mods.commons.pool.CoroutinePool$executeParallel$1
   #35 = Utf8               v
   #36 = Integer            2
   #37 = Utf8               java/lang/Exception
   #38 = Class              #37           // java/lang/Exception
   #39 = Utf8               kotlin/coroutines/intrinsics/IntrinsicsKt
   #40 = Class              #39           // kotlin/coroutines/intrinsics/IntrinsicsKt
   #41 = Utf8               getCOROUTINE_SUSPENDED
   #42 = Utf8               ()Ljava/lang/Object;
   #43 = NameAndType        #41:#42       // getCOROUTINE_SUSPENDED:()Ljava/lang/Object;
   #44 = Methodref          #40.#43       // kotlin/coroutines/intrinsics/IntrinsicsKt.getCOROUTINE_SUSPENDED:()Ljava/lang/Object;
   #45 = Utf8               label
   #46 = Utf8               I
   #47 = NameAndType        #45:#46       // label:I
   #48 = Fieldref           #2.#47        // ext/mods/commons/pool/CoroutinePool$executeParallel$1.label:I
   #49 = Utf8               kotlin/ResultKt
   #50 = Class              #49           // kotlin/ResultKt
   #51 = Utf8               throwOnFailure
   #52 = Utf8               (Ljava/lang/Object;)V
   #53 = NameAndType        #51:#52       // throwOnFailure:(Ljava/lang/Object;)V
   #54 = Methodref          #50.#53       // kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
   #55 = Utf8               java/lang/Runnable
   #56 = Class              #55           // java/lang/Runnable
   #57 = Utf8               run
   #58 = Utf8               ()V
   #59 = NameAndType        #57:#58       // run:()V
   #60 = InterfaceMethodref #56.#59       // java/lang/Runnable.run:()V
   #61 = Utf8               ext/mods/commons/pool/CoroutinePool
   #62 = Class              #61           // ext/mods/commons/pool/CoroutinePool
   #63 = Utf8               access$getLOGGER$p
   #64 = Utf8               ()Ljava/util/logging/Logger;
   #65 = NameAndType        #63:#64       // access$getLOGGER$p:()Ljava/util/logging/Logger;
   #66 = Methodref          #62.#65       // ext/mods/commons/pool/CoroutinePool.access$getLOGGER$p:()Ljava/util/logging/Logger;
   #67 = Utf8               getMessage
   #68 = Utf8               ()Ljava/lang/String;
   #69 = NameAndType        #67:#68       // getMessage:()Ljava/lang/String;
   #70 = Methodref          #38.#69       // java/lang/Exception.getMessage:()Ljava/lang/String;
   #71 = Utf8               Erro executeParallel: \u0001
   #72 = String             #71           // Erro executeParallel: \u0001
   #73 = Utf8               java/lang/invoke/StringConcatFactory
   #74 = Class              #73           // java/lang/invoke/StringConcatFactory
   #75 = Utf8               makeConcatWithConstants
   #76 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #77 = NameAndType        #75:#76       // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #78 = Methodref          #74.#77       // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #79 = MethodHandle       6:#78         // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #80 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #81 = NameAndType        #75:#80       // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #82 = InvokeDynamic      #0:#81        // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #83 = Utf8               java/util/logging/Logger
   #84 = Class              #83           // java/util/logging/Logger
   #85 = Utf8               severe
   #86 = Utf8               (Ljava/lang/String;)V
   #87 = NameAndType        #85:#86       // severe:(Ljava/lang/String;)V
   #88 = Methodref          #84.#87       // java/util/logging/Logger.severe:(Ljava/lang/String;)V
   #89 = Utf8               kotlin/Unit
   #90 = Class              #89           // kotlin/Unit
   #91 = Utf8               INSTANCE
   #92 = Utf8               Lkotlin/Unit;
   #93 = NameAndType        #91:#92       // INSTANCE:Lkotlin/Unit;
   #94 = Fieldref           #90.#93       // kotlin/Unit.INSTANCE:Lkotlin/Unit;
   #95 = Utf8               java/lang/IllegalStateException
   #96 = Class              #95           // java/lang/IllegalStateException
   #97 = Utf8               call to \'resume\' before \'invoke\' with coroutine
   #98 = String             #97           // call to \'resume\' before \'invoke\' with coroutine
   #99 = NameAndType        #8:#86        // "<init>":(Ljava/lang/String;)V
  #100 = Methodref          #96.#99       // java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
  #101 = Utf8               e
  #102 = Utf8               Ljava/lang/Exception;
  #103 = Utf8               $result
  #104 = Utf8               Ljava/lang/Object;
  #105 = Utf8               create
  #106 = Utf8               (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
  #107 = Utf8               (Ljava/lang/Object;Lkotlin/coroutines/Continuation<*>;)Lkotlin/coroutines/Continuation<Lkotlin/Unit;>;
  #108 = NameAndType        #8:#9         // "<init>":(Ljava/lang/Runnable;Lkotlin/coroutines/Continuation;)V
  #109 = Methodref          #2.#108       // ext/mods/commons/pool/CoroutinePool$executeParallel$1."<init>":(Ljava/lang/Runnable;Lkotlin/coroutines/Continuation;)V
  #110 = Utf8               kotlin/coroutines/Continuation
  #111 = Class              #110          // kotlin/coroutines/Continuation
  #112 = Utf8               value
  #113 = Utf8               invoke
  #114 = Utf8               (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #115 = Utf8               (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Lkotlin/Unit;>;)Ljava/lang/Object;
  #116 = NameAndType        #105:#106     // create:(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
  #117 = Methodref          #2.#116       // ext/mods/commons/pool/CoroutinePool$executeParallel$1.create:(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
  #118 = NameAndType        #22:#23       // invokeSuspend:(Ljava/lang/Object;)Ljava/lang/Object;
  #119 = Methodref          #2.#118       // ext/mods/commons/pool/CoroutinePool$executeParallel$1.invokeSuspend:(Ljava/lang/Object;)Ljava/lang/Object;
  #120 = Utf8               p1
  #121 = Utf8               Lkotlinx/coroutines/CoroutineScope;
  #122 = Utf8               p2
  #123 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #124 = Utf8               kotlinx/coroutines/CoroutineScope
  #125 = Class              #124          // kotlinx/coroutines/CoroutineScope
  #126 = NameAndType        #113:#114     // invoke:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #127 = Methodref          #2.#126       // ext/mods/commons/pool/CoroutinePool$executeParallel$1.invoke:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #128 = Utf8               Lkotlin/Metadata;
  #129 = Utf8               mv
  #130 = Integer            3
  #131 = Integer            0
  #132 = Utf8               k
  #133 = Utf8               xi
  #134 = Integer            48
  #135 = Utf8               d1
  #136 = Utf8               \u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n
  #137 = Utf8               d2
  #138 = Utf8               <anonymous>
  #139 = Utf8
  #140 = Utf8               executeParallel
  #141 = Utf8               (Ljava/lang/Runnable;)Lkotlinx/coroutines/Job;
  #142 = NameAndType        #140:#141     // executeParallel:(Ljava/lang/Runnable;)Lkotlinx/coroutines/Job;
  #143 = Utf8               Code
  #144 = Utf8               LocalVariableTable
  #145 = Utf8               Signature
  #146 = Utf8               StackMapTable
  #147 = Utf8               LineNumberTable
  #148 = Utf8               InnerClasses
  #149 = Utf8               EnclosingMethod
  #150 = Utf8               SourceFile
  #151 = Utf8               RuntimeVisibleAnnotations
  #152 = Utf8               BootstrapMethods
{
  int label;
    descriptor: I
    flags: (0x0000)

  final java.lang.Runnable $task;
    descriptor: Ljava/lang/Runnable;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  ext.mods.commons.pool.CoroutinePool$executeParallel$1(java.lang.Runnable, kotlin.coroutines.Continuation<? super ext.mods.commons.pool.CoroutinePool$executeParallel$1>);
    descriptor: (Ljava/lang/Runnable;Lkotlin/coroutines/Continuation;)V
    flags: (0x0000)
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: putfield      #14                 // Field $task:Ljava/lang/Runnable;
         5: aload_0
         6: iconst_2
         7: aload_2
         8: invokespecial #17                 // Method kotlin/coroutines/jvm/internal/SuspendLambda."<init>":(ILkotlin/coroutines/Continuation;)V
        11: return
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/commons/pool/CoroutinePool$executeParallel$1;
            0      12     1 $task   Ljava/lang/Runnable;
            0      12     2 $completion   Lkotlin/coroutines/Continuation;
    Signature: #10                          // (Ljava/lang/Runnable;Lkotlin/coroutines/Continuation<-Lext/mods/commons/pool/CoroutinePool$executeParallel$1;>;)V

  public final java.lang.Object invokeSuspend(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Ljava/lang/Object;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=3, args_size=2
         0: invokestatic  #44                 // Method kotlin/coroutines/intrinsics/IntrinsicsKt.getCOROUTINE_SUSPENDED:()Ljava/lang/Object;
         3: pop
         4: aload_0
         5: getfield      #48                 // Field label:I
         8: tableswitch   { // 0 to 0

                       0: 28
                 default: 65
            }
        28: aload_1
        29: invokestatic  #54                 // Method kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
        32: nop
        33: aload_0
        34: getfield      #14                 // Field $task:Ljava/lang/Runnable;
        37: invokeinterface #60,  1           // InterfaceMethod java/lang/Runnable.run:()V
        42: goto          61
        45: astore_2
        46: invokestatic  #66                 // Method ext/mods/commons/pool/CoroutinePool.access$getLOGGER$p:()Ljava/util/logging/Logger;
        49: aload_2
        50: invokevirtual #70                 // Method java/lang/Exception.getMessage:()Ljava/lang/String;
        53: invokedynamic #82,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        58: invokevirtual #88                 // Method java/util/logging/Logger.severe:(Ljava/lang/String;)V
        61: getstatic     #94                 // Field kotlin/Unit.INSTANCE:Lkotlin/Unit;
        64: areturn
        65: new           #96                 // class java/lang/IllegalStateException
        68: dup
        69: ldc           #98                 // String call to \'resume\' before \'invoke\' with coroutine
        71: invokespecial #100                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
        74: athrow
      Exception table:
         from    to  target type
            32    42    45   Class java/lang/Exception
      StackMapTable: number_of_entries = 4
        frame_type = 28 /* same */
        frame_type = 80 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 15 /* same */
        frame_type = 3 /* same */
      LineNumberTable:
        line 349: 3
        line 350: 32
        line 351: 61
        line 349: 65
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           46      15     2     e   Ljava/lang/Exception;
            0      75     0  this   Lext/mods/commons/pool/CoroutinePool$executeParallel$1;
            0      75     1 $result   Ljava/lang/Object;

  public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object, kotlin.coroutines.Continuation<?>);
    descriptor: (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=3, args_size=3
         0: new           #2                  // class ext/mods/commons/pool/CoroutinePool$executeParallel$1
         3: dup
         4: aload_0
         5: getfield      #14                 // Field $task:Ljava/lang/Runnable;
         8: aload_2
         9: invokespecial #109                // Method "<init>":(Ljava/lang/Runnable;Lkotlin/coroutines/Continuation;)V
        12: checkcast     #111                // class kotlin/coroutines/Continuation
        15: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/commons/pool/CoroutinePool$executeParallel$1;
            0      16     1 value   Ljava/lang/Object;
            0      16     2 $completion   Lkotlin/coroutines/Continuation;
    Signature: #107                         // (Ljava/lang/Object;Lkotlin/coroutines/Continuation<*>;)Lkotlin/coroutines/Continuation<Lkotlin/Unit;>;

  public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>);
    descriptor: (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: aload_2
         3: invokevirtual #117                // Method create:(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
         6: checkcast     #2                  // class ext/mods/commons/pool/CoroutinePool$executeParallel$1
         9: getstatic     #94                 // Field kotlin/Unit.INSTANCE:Lkotlin/Unit;
        12: invokevirtual #119                // Method invokeSuspend:(Ljava/lang/Object;)Ljava/lang/Object;
        15: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/commons/pool/CoroutinePool$executeParallel$1;
            0      16     1    p1   Lkotlinx/coroutines/CoroutineScope;
            0      16     2    p2   Lkotlin/coroutines/Continuation;
    Signature: #115                         // (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Lkotlin/Unit;>;)Ljava/lang/Object;

  public java.lang.Object invoke(java.lang.Object, java.lang.Object);
    descriptor: (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: checkcast     #125                // class kotlinx/coroutines/CoroutineScope
         5: aload_2
         6: checkcast     #111                // class kotlin/coroutines/Continuation
         9: invokevirtual #127                // Method invoke:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
        12: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/commons/pool/CoroutinePool$executeParallel$1;
            0      13     1    p1   Ljava/lang/Object;
            0      13     2    p2   Ljava/lang/Object;
}
InnerClasses:
  static final #2;                        // class ext/mods/commons/pool/CoroutinePool$executeParallel$1
EnclosingMethod: #62.#142               // ext.mods.commons.pool.CoroutinePool.executeParallel
Signature: #3                           // Lkotlin/coroutines/jvm/internal/SuspendLambda;Lkotlin/jvm/functions/Function2<Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Lkotlin/Unit;>;Ljava/lang/Object;>;
SourceFile: "CoroutinePool.kt"
RuntimeVisibleAnnotations:
  0: #24(#25=s#26,#27=[],#28=[],#29=[],#30=[],#31=[],#32=s#22,#33=s#34,#35=I#36)
    kotlin.coroutines.jvm.internal.DebugMetadata(
      f="CoroutinePool.kt"
      l=[]
      nl=[]
      i=[]
      s=[]
      n=[]
      m="invokeSuspend"
      c="ext.mods.commons.pool.CoroutinePool$executeParallel$1"
      v=2
    )
  1: #128(#129=[I#36,I#130,I#131],#132=I#130,#133=I#134,#135=[s#136],#137=[s#138,s#139,s#121])
    kotlin.Metadata(
      mv=[2,3,0]
      k=3
      xi=48
      d1=["\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"]
      d2=["<anonymous>","","Lkotlinx/coroutines/CoroutineScope;"]
    )
BootstrapMethods:
  0: #79 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #72 Erro executeParallel: \u0001
