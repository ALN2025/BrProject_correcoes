// Bytecode for: ext.mods.gameserver.GameServer$1
// File: ext\mods\gameserver\GameServer$1.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/GameServer$1.class
  Last modified 9 de jul de 2026; size 3131 bytes
  MD5 checksum c12354b3c5fbc1e011a828fbf63f7ec5
  Compiled from "GameServer.kt"
final class ext.mods.gameserver.GameServer$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>
  minor version: 0
  major version: 69
  flags: (0x0030) ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/GameServer$1
  super_class: #5                         // kotlin/coroutines/jvm/internal/SuspendLambda
  interfaces: 1, fields: 2, methods: 5, attributes: 5
Constant pool:
    #1 = Utf8               ext/mods/gameserver/GameServer$1
    #2 = Class              #1            // ext/mods/gameserver/GameServer$1
    #3 = Utf8               Lkotlin/coroutines/jvm/internal/SuspendLambda;Lkotlin/jvm/functions/Function2<Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Lkotlin/Unit;>;Ljava/lang/Object;>;
    #4 = Utf8               kotlin/coroutines/jvm/internal/SuspendLambda
    #5 = Class              #4            // kotlin/coroutines/jvm/internal/SuspendLambda
    #6 = Utf8               kotlin/jvm/functions/Function2
    #7 = Class              #6            // kotlin/jvm/functions/Function2
    #8 = Utf8               <init>
    #9 = Utf8               (Lext/mods/gameserver/GameServer;Lkotlin/coroutines/Continuation;)V
   #10 = Utf8               (Lext/mods/gameserver/GameServer;Lkotlin/coroutines/Continuation<-Lext/mods/gameserver/GameServer$1;>;)V
   #11 = Utf8               this$0
   #12 = Utf8               Lext/mods/gameserver/GameServer;
   #13 = NameAndType        #11:#12       // this$0:Lext/mods/gameserver/GameServer;
   #14 = Fieldref           #2.#13        // ext/mods/gameserver/GameServer$1.this$0:Lext/mods/gameserver/GameServer;
   #15 = Utf8               (ILkotlin/coroutines/Continuation;)V
   #16 = NameAndType        #8:#15        // "<init>":(ILkotlin/coroutines/Continuation;)V
   #17 = Methodref          #5.#16        // kotlin/coroutines/jvm/internal/SuspendLambda."<init>":(ILkotlin/coroutines/Continuation;)V
   #18 = Utf8               this
   #19 = Utf8               Lext/mods/gameserver/GameServer$1;
   #20 = Utf8               $receiver
   #21 = Utf8               $completion
   #22 = Utf8               Lkotlin/coroutines/Continuation;
   #23 = Utf8               invokeSuspend
   #24 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #25 = Utf8               Lkotlin/coroutines/jvm/internal/DebugMetadata;
   #26 = Utf8               f
   #27 = Utf8               GameServer.kt
   #28 = Utf8               l
   #29 = Integer            342
   #30 = Utf8               nl
   #31 = Integer            343
   #32 = Utf8               i
   #33 = Utf8               s
   #34 = Utf8               n
   #35 = Utf8               m
   #36 = Utf8               c
   #37 = Utf8               ext.mods.gameserver.GameServer$1
   #38 = Utf8               v
   #39 = Integer            2
   #40 = Utf8               kotlin/coroutines/intrinsics/IntrinsicsKt
   #41 = Class              #40           // kotlin/coroutines/intrinsics/IntrinsicsKt
   #42 = Utf8               getCOROUTINE_SUSPENDED
   #43 = Utf8               ()Ljava/lang/Object;
   #44 = NameAndType        #42:#43       // getCOROUTINE_SUSPENDED:()Ljava/lang/Object;
   #45 = Methodref          #41.#44       // kotlin/coroutines/intrinsics/IntrinsicsKt.getCOROUTINE_SUSPENDED:()Ljava/lang/Object;
   #46 = Utf8               label
   #47 = Utf8               I
   #48 = NameAndType        #46:#47       // label:I
   #49 = Fieldref           #2.#48        // ext/mods/gameserver/GameServer$1.label:I
   #50 = Utf8               kotlin/ResultKt
   #51 = Class              #50           // kotlin/ResultKt
   #52 = Utf8               throwOnFailure
   #53 = Utf8               (Ljava/lang/Object;)V
   #54 = NameAndType        #52:#53       // throwOnFailure:(Ljava/lang/Object;)V
   #55 = Methodref          #51.#54       // kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
   #56 = Utf8               kotlin/coroutines/Continuation
   #57 = Class              #56           // kotlin/coroutines/Continuation
   #58 = Utf8               ext/mods/gameserver/GameServer
   #59 = Class              #58           // ext/mods/gameserver/GameServer
   #60 = Utf8               access$loadParallel
   #61 = Utf8               (Lext/mods/gameserver/GameServer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
   #62 = NameAndType        #60:#61       // access$loadParallel:(Lext/mods/gameserver/GameServer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
   #63 = Methodref          #59.#62       // ext/mods/gameserver/GameServer.access$loadParallel:(Lext/mods/gameserver/GameServer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
   #64 = Utf8               kotlin/Unit
   #65 = Class              #64           // kotlin/Unit
   #66 = Utf8               INSTANCE
   #67 = Utf8               Lkotlin/Unit;
   #68 = NameAndType        #66:#67       // INSTANCE:Lkotlin/Unit;
   #69 = Fieldref           #65.#68       // kotlin/Unit.INSTANCE:Lkotlin/Unit;
   #70 = Utf8               java/lang/IllegalStateException
   #71 = Class              #70           // java/lang/IllegalStateException
   #72 = Utf8               call to \'resume\' before \'invoke\' with coroutine
   #73 = String             #72           // call to \'resume\' before \'invoke\' with coroutine
   #74 = Utf8               (Ljava/lang/String;)V
   #75 = NameAndType        #8:#74        // "<init>":(Ljava/lang/String;)V
   #76 = Methodref          #71.#75       // java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
   #77 = Utf8               $result
   #78 = Utf8               Ljava/lang/Object;
   #79 = Utf8               java/lang/Object
   #80 = Class              #79           // java/lang/Object
   #81 = Utf8               create
   #82 = Utf8               (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
   #83 = Utf8               (Ljava/lang/Object;Lkotlin/coroutines/Continuation<*>;)Lkotlin/coroutines/Continuation<Lkotlin/Unit;>;
   #84 = NameAndType        #8:#9         // "<init>":(Lext/mods/gameserver/GameServer;Lkotlin/coroutines/Continuation;)V
   #85 = Methodref          #2.#84        // ext/mods/gameserver/GameServer$1."<init>":(Lext/mods/gameserver/GameServer;Lkotlin/coroutines/Continuation;)V
   #86 = Utf8               value
   #87 = Utf8               invoke
   #88 = Utf8               (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
   #89 = Utf8               (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Lkotlin/Unit;>;)Ljava/lang/Object;
   #90 = NameAndType        #81:#82       // create:(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
   #91 = Methodref          #2.#90        // ext/mods/gameserver/GameServer$1.create:(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
   #92 = NameAndType        #23:#24       // invokeSuspend:(Ljava/lang/Object;)Ljava/lang/Object;
   #93 = Methodref          #2.#92        // ext/mods/gameserver/GameServer$1.invokeSuspend:(Ljava/lang/Object;)Ljava/lang/Object;
   #94 = Utf8               p1
   #95 = Utf8               Lkotlinx/coroutines/CoroutineScope;
   #96 = Utf8               p2
   #97 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #98 = Utf8               kotlinx/coroutines/CoroutineScope
   #99 = Class              #98           // kotlinx/coroutines/CoroutineScope
  #100 = NameAndType        #87:#88       // invoke:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #101 = Methodref          #2.#100       // ext/mods/gameserver/GameServer$1.invoke:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #102 = Utf8               Lkotlin/Metadata;
  #103 = Utf8               mv
  #104 = Integer            3
  #105 = Integer            0
  #106 = Utf8               k
  #107 = Utf8               xi
  #108 = Integer            48
  #109 = Utf8               d1
  #110 = Utf8               \u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n
  #111 = Utf8               d2
  #112 = Utf8               <anonymous>
  #113 = Utf8
  #114 = Utf8               ([Ljava/lang/String;)V
  #115 = NameAndType        #8:#114       // "<init>":([Ljava/lang/String;)V
  #116 = Utf8               Code
  #117 = Utf8               LocalVariableTable
  #118 = Utf8               Signature
  #119 = Utf8               StackMapTable
  #120 = Utf8               LineNumberTable
  #121 = Utf8               InnerClasses
  #122 = Utf8               EnclosingMethod
  #123 = Utf8               SourceFile
  #124 = Utf8               RuntimeVisibleAnnotations
{
  int label;
    descriptor: I
    flags: (0x0000)

  final ext.mods.gameserver.GameServer this$0;
    descriptor: Lext/mods/gameserver/GameServer;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  ext.mods.gameserver.GameServer$1(ext.mods.gameserver.GameServer, kotlin.coroutines.Continuation<? super ext.mods.gameserver.GameServer$1>);
    descriptor: (Lext/mods/gameserver/GameServer;Lkotlin/coroutines/Continuation;)V
    flags: (0x0000)
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: putfield      #14                 // Field this$0:Lext/mods/gameserver/GameServer;
         5: aload_0
         6: iconst_2
         7: aload_2
         8: invokespecial #17                 // Method kotlin/coroutines/jvm/internal/SuspendLambda."<init>":(ILkotlin/coroutines/Continuation;)V
        11: return
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/GameServer$1;
            0      12     1 $receiver   Lext/mods/gameserver/GameServer;
            0      12     2 $completion   Lkotlin/coroutines/Continuation;
    Signature: #10                          // (Lext/mods/gameserver/GameServer;Lkotlin/coroutines/Continuation<-Lext/mods/gameserver/GameServer$1;>;)V

  public final java.lang.Object invokeSuspend(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Ljava/lang/Object;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=3, args_size=2
         0: invokestatic  #45                 // Method kotlin/coroutines/intrinsics/IntrinsicsKt.getCOROUTINE_SUSPENDED:()Ljava/lang/Object;
         3: astore_2
         4: aload_0
         5: getfield      #49                 // Field label:I
         8: tableswitch   { // 0 to 1

                       0: 32

                       1: 59
                 default: 69
            }
        32: aload_1
        33: invokestatic  #55                 // Method kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
        36: aload_0
        37: getfield      #14                 // Field this$0:Lext/mods/gameserver/GameServer;
        40: aload_0
        41: checkcast     #57                 // class kotlin/coroutines/Continuation
        44: aload_0
        45: iconst_1
        46: putfield      #49                 // Field label:I
        49: invokestatic  #63                 // Method ext/mods/gameserver/GameServer.access$loadParallel:(Lext/mods/gameserver/GameServer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
        52: dup
        53: aload_2
        54: if_acmpne     64
        57: aload_2
        58: areturn
        59: aload_1
        60: invokestatic  #55                 // Method kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
        63: aload_1
        64: pop
        65: getstatic     #69                 // Field kotlin/Unit.INSTANCE:Lkotlin/Unit;
        68: areturn
        69: new           #71                 // class java/lang/IllegalStateException
        72: dup
        73: ldc           #73                 // String call to \'resume\' before \'invoke\' with coroutine
        75: invokespecial #76                 // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
        78: athrow
      StackMapTable: number_of_entries = 4
        frame_type = 252 /* append */
          offset_delta = 32
          locals = [ class java/lang/Object ]
        frame_type = 26 /* same */
        frame_type = 68 /* same_locals_1_stack_item */
          stack = [ class java/lang/Object ]
        frame_type = 4 /* same */
      LineNumberTable:
        line 341: 3
        line 342: 36
        line 341: 57
        line 343: 64
        line 341: 69
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      79     0  this   Lext/mods/gameserver/GameServer$1;
            0      79     1 $result   Ljava/lang/Object;

  public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object, kotlin.coroutines.Continuation<?>);
    descriptor: (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=3, args_size=3
         0: new           #2                  // class ext/mods/gameserver/GameServer$1
         3: dup
         4: aload_0
         5: getfield      #14                 // Field this$0:Lext/mods/gameserver/GameServer;
         8: aload_2
         9: invokespecial #85                 // Method "<init>":(Lext/mods/gameserver/GameServer;Lkotlin/coroutines/Continuation;)V
        12: checkcast     #57                 // class kotlin/coroutines/Continuation
        15: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/GameServer$1;
            0      16     1 value   Ljava/lang/Object;
            0      16     2 $completion   Lkotlin/coroutines/Continuation;
    Signature: #83                          // (Ljava/lang/Object;Lkotlin/coroutines/Continuation<*>;)Lkotlin/coroutines/Continuation<Lkotlin/Unit;>;

  public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>);
    descriptor: (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: aload_2
         3: invokevirtual #91                 // Method create:(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
         6: checkcast     #2                  // class ext/mods/gameserver/GameServer$1
         9: getstatic     #69                 // Field kotlin/Unit.INSTANCE:Lkotlin/Unit;
        12: invokevirtual #93                 // Method invokeSuspend:(Ljava/lang/Object;)Ljava/lang/Object;
        15: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/GameServer$1;
            0      16     1    p1   Lkotlinx/coroutines/CoroutineScope;
            0      16     2    p2   Lkotlin/coroutines/Continuation;
    Signature: #89                          // (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Lkotlin/Unit;>;)Ljava/lang/Object;

  public java.lang.Object invoke(java.lang.Object, java.lang.Object);
    descriptor: (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: checkcast     #99                 // class kotlinx/coroutines/CoroutineScope
         5: aload_2
         6: checkcast     #57                 // class kotlin/coroutines/Continuation
         9: invokevirtual #101                // Method invoke:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
        12: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/GameServer$1;
            0      13     1    p1   Ljava/lang/Object;
            0      13     2    p2   Ljava/lang/Object;
}
InnerClasses:
  static final #2;                        // class ext/mods/gameserver/GameServer$1
EnclosingMethod: #59.#115               // ext.mods.gameserver.GameServer.<init>
Signature: #3                           // Lkotlin/coroutines/jvm/internal/SuspendLambda;Lkotlin/jvm/functions/Function2<Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Lkotlin/Unit;>;Ljava/lang/Object;>;
SourceFile: "GameServer.kt"
RuntimeVisibleAnnotations:
  0: #25(#26=s#27,#28=[I#29],#30=[I#31],#32=[],#33=[],#34=[],#35=s#23,#36=s#37,#38=I#39)
    kotlin.coroutines.jvm.internal.DebugMetadata(
      f="GameServer.kt"
      l=[342]
      nl=[343]
      i=[]
      s=[]
      n=[]
      m="invokeSuspend"
      c="ext.mods.gameserver.GameServer$1"
      v=2
    )
  1: #102(#103=[I#39,I#104,I#105],#106=I#104,#107=I#108,#109=[s#110],#111=[s#112,s#113,s#95])
    kotlin.Metadata(
      mv=[2,3,0]
      k=3
      xi=48
      d1=["\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"]
      d2=["<anonymous>","","Lkotlinx/coroutines/CoroutineScope;"]
    )
