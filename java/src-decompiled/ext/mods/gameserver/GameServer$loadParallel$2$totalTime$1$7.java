// Bytecode for: ext.mods.gameserver.GameServer$loadParallel$2$totalTime$1$7
// File: ext\mods\gameserver\GameServer$loadParallel$2$totalTime$1$7.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$7.class
  Last modified 9 de jul de 2026; size 4415 bytes
  MD5 checksum 174f5f08eba6b0b107b7023f51ba8b8f
  Compiled from "GameServer.kt"
final class ext.mods.gameserver.GameServer$loadParallel$2$totalTime$1$7 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Pair<? extends java.lang.String, ? extends java.lang.Long>>, java.lang.Object>
  minor version: 0
  major version: 69
  flags: (0x0030) ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$7
  super_class: #5                         // kotlin/coroutines/jvm/internal/SuspendLambda
  interfaces: 1, fields: 2, methods: 5, attributes: 7
Constant pool:
    #1 = Utf8               ext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$7
    #2 = Class              #1            // ext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$7
    #3 = Utf8               Lkotlin/coroutines/jvm/internal/SuspendLambda;Lkotlin/jvm/functions/Function2<Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Lkotlin/Pair<+Ljava/lang/String;+Ljava/lang/Long;>;>;Ljava/lang/Object;>;
    #4 = Utf8               kotlin/coroutines/jvm/internal/SuspendLambda
    #5 = Class              #4            // kotlin/coroutines/jvm/internal/SuspendLambda
    #6 = Utf8               kotlin/jvm/functions/Function2
    #7 = Class              #6            // kotlin/jvm/functions/Function2
    #8 = Utf8               <init>
    #9 = Utf8               (Lext/mods/gameserver/GameServer;Lkotlin/coroutines/Continuation;)V
   #10 = Utf8               (Lext/mods/gameserver/GameServer;Lkotlin/coroutines/Continuation<-Lext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$7;>;)V
   #11 = Utf8               this$0
   #12 = Utf8               Lext/mods/gameserver/GameServer;
   #13 = NameAndType        #11:#12       // this$0:Lext/mods/gameserver/GameServer;
   #14 = Fieldref           #2.#13        // ext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$7.this$0:Lext/mods/gameserver/GameServer;
   #15 = Utf8               (ILkotlin/coroutines/Continuation;)V
   #16 = NameAndType        #8:#15        // "<init>":(ILkotlin/coroutines/Continuation;)V
   #17 = Methodref          #5.#16        // kotlin/coroutines/jvm/internal/SuspendLambda."<init>":(ILkotlin/coroutines/Continuation;)V
   #18 = Utf8               this
   #19 = Utf8               Lext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$7;
   #20 = Utf8               $receiver
   #21 = Utf8               $completion
   #22 = Utf8               Lkotlin/coroutines/Continuation;
   #23 = Utf8               invokeSuspend
   #24 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #25 = Utf8               Lkotlin/coroutines/jvm/internal/DebugMetadata;
   #26 = Utf8               f
   #27 = Utf8               GameServer.kt
   #28 = Utf8               l
   #29 = Utf8               nl
   #30 = Utf8               i
   #31 = Utf8               s
   #32 = Utf8               n
   #33 = Utf8               m
   #34 = Utf8               c
   #35 = Utf8               ext.mods.gameserver.GameServer$loadParallel$2$totalTime$1$7
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
   #47 = Fieldref           #2.#46        // ext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$7.label:I
   #48 = Utf8               kotlin/ResultKt
   #49 = Class              #48           // kotlin/ResultKt
   #50 = Utf8               throwOnFailure
   #51 = Utf8               (Ljava/lang/Object;)V
   #52 = NameAndType        #50:#51       // throwOnFailure:(Ljava/lang/Object;)V
   #53 = Methodref          #49.#52       // kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
   #54 = Utf8               Admins & Chars
   #55 = String             #54           // Admins & Chars
   #56 = Utf8               java/lang/System
   #57 = Class              #56           // java/lang/System
   #58 = Utf8               currentTimeMillis
   #59 = Utf8               ()J
   #60 = NameAndType        #58:#59       // currentTimeMillis:()J
   #61 = Methodref          #57.#60       // java/lang/System.currentTimeMillis:()J
   #62 = Utf8               ext/mods/gameserver/GameServer
   #63 = Class              #62           // ext/mods/gameserver/GameServer
   #64 = Utf8               access$loadAdminsCharacters
   #65 = Utf8               (Lext/mods/gameserver/GameServer;)V
   #66 = NameAndType        #64:#65       // access$loadAdminsCharacters:(Lext/mods/gameserver/GameServer;)V
   #67 = Methodref          #63.#66       // ext/mods/gameserver/GameServer.access$loadAdminsCharacters:(Lext/mods/gameserver/GameServer;)V
   #68 = Utf8               kotlin/coroutines/jvm/internal/Boxing
   #69 = Class              #68           // kotlin/coroutines/jvm/internal/Boxing
   #70 = Utf8               boxLong
   #71 = Utf8               (J)Ljava/lang/Long;
   #72 = NameAndType        #70:#71       // boxLong:(J)Ljava/lang/Long;
   #73 = Methodref          #69.#72       // kotlin/coroutines/jvm/internal/Boxing.boxLong:(J)Ljava/lang/Long;
   #74 = Utf8               kotlin/TuplesKt
   #75 = Class              #74           // kotlin/TuplesKt
   #76 = Utf8               to
   #77 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
   #78 = NameAndType        #76:#77       // to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
   #79 = Methodref          #75.#78       // kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
   #80 = Utf8               java/lang/IllegalStateException
   #81 = Class              #80           // java/lang/IllegalStateException
   #82 = Utf8               call to \'resume\' before \'invoke\' with coroutine
   #83 = String             #82           // call to \'resume\' before \'invoke\' with coroutine
   #84 = Utf8               (Ljava/lang/String;)V
   #85 = NameAndType        #8:#84        // "<init>":(Ljava/lang/String;)V
   #86 = Methodref          #81.#85       // java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
   #87 = Utf8               $i$a$-measureTimeMillis-GameServer$loadParallel$2$totalTime$1$7$1
   #88 = Utf8               $i$f$measureTimeMillis
   #89 = Utf8               start$iv
   #90 = Utf8               J
   #91 = Utf8               $result
   #92 = Utf8               Ljava/lang/Object;
   #93 = Utf8               create
   #94 = Utf8               (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
   #95 = Utf8               (Ljava/lang/Object;Lkotlin/coroutines/Continuation<*>;)Lkotlin/coroutines/Continuation<Lkotlin/Unit;>;
   #96 = NameAndType        #8:#9         // "<init>":(Lext/mods/gameserver/GameServer;Lkotlin/coroutines/Continuation;)V
   #97 = Methodref          #2.#96        // ext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$7."<init>":(Lext/mods/gameserver/GameServer;Lkotlin/coroutines/Continuation;)V
   #98 = Utf8               kotlin/coroutines/Continuation
   #99 = Class              #98           // kotlin/coroutines/Continuation
  #100 = Utf8               value
  #101 = Utf8               invoke
  #102 = Utf8               (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #103 = Utf8               (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Lkotlin/Pair<Ljava/lang/String;Ljava/lang/Long;>;>;)Ljava/lang/Object;
  #104 = NameAndType        #93:#94       // create:(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
  #105 = Methodref          #2.#104       // ext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$7.create:(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
  #106 = Utf8               kotlin/Unit
  #107 = Class              #106          // kotlin/Unit
  #108 = Utf8               INSTANCE
  #109 = Utf8               Lkotlin/Unit;
  #110 = NameAndType        #108:#109     // INSTANCE:Lkotlin/Unit;
  #111 = Fieldref           #107.#110     // kotlin/Unit.INSTANCE:Lkotlin/Unit;
  #112 = NameAndType        #23:#24       // invokeSuspend:(Ljava/lang/Object;)Ljava/lang/Object;
  #113 = Methodref          #2.#112       // ext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$7.invokeSuspend:(Ljava/lang/Object;)Ljava/lang/Object;
  #114 = Utf8               p1
  #115 = Utf8               Lkotlinx/coroutines/CoroutineScope;
  #116 = Utf8               p2
  #117 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #118 = Utf8               kotlinx/coroutines/CoroutineScope
  #119 = Class              #118          // kotlinx/coroutines/CoroutineScope
  #120 = NameAndType        #101:#102     // invoke:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #121 = Methodref          #2.#120       // ext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$7.invoke:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #122 = Utf8               Lkotlin/Metadata;
  #123 = Utf8               mv
  #124 = Integer            3
  #125 = Integer            0
  #126 = Utf8               k
  #127 = Utf8               xi
  #128 = Integer            48
  #129 = Utf8               d1
  #130 = Utf8               \u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n
  #131 = Utf8               d2
  #132 = Utf8               <anonymous>
  #133 = Utf8               Lkotlin/Pair;
  #134 = Utf8
  #135 = Utf8               ext/mods/gameserver/GameServer$loadParallel$2
  #136 = Class              #135          // ext/mods/gameserver/GameServer$loadParallel$2
  #137 = Utf8               Lkotlin/jvm/internal/SourceDebugExtension;
  #138 = Utf8               SMAP\nGameServer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameServer.kt\next/mods/gameserver/GameServer$loadParallel$2$totalTime$1$7\n+ 2 Timing.kt\nkotlin/system/TimingKt\n*L\n1#1,703:1\n29#2,3:704\n*S KotlinDebug\n*F\n+ 1 GameServer.kt\next/mods/gameserver/GameServer$loadParallel$2$totalTime$1$7\n*L\n410#1:704,3\n*E\n
  #139 = Utf8               Code
  #140 = Utf8               LocalVariableTable
  #141 = Utf8               Signature
  #142 = Utf8               StackMapTable
  #143 = Utf8               LineNumberTable
  #144 = Utf8               InnerClasses
  #145 = Utf8               EnclosingMethod
  #146 = Utf8               SourceFile
  #147 = Utf8               SourceDebugExtension
  #148 = Utf8               RuntimeVisibleAnnotations
  #149 = Utf8               RuntimeInvisibleAnnotations
{
  int label;
    descriptor: I
    flags: (0x0000)

  final ext.mods.gameserver.GameServer this$0;
    descriptor: Lext/mods/gameserver/GameServer;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  ext.mods.gameserver.GameServer$loadParallel$2$totalTime$1$7(ext.mods.gameserver.GameServer, kotlin.coroutines.Continuation<? super ext.mods.gameserver.GameServer$loadParallel$2$totalTime$1$7>);
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
            0      12     0  this   Lext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$7;
            0      12     1 $receiver   Lext/mods/gameserver/GameServer;
            0      12     2 $completion   Lkotlin/coroutines/Continuation;
    Signature: #10                          // (Lext/mods/gameserver/GameServer;Lkotlin/coroutines/Continuation<-Lext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$7;>;)V

  public final java.lang.Object invokeSuspend(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Ljava/lang/Object;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=5, locals=8, args_size=2
         0: invokestatic  #43                 // Method kotlin/coroutines/intrinsics/IntrinsicsKt.getCOROUTINE_SUSPENDED:()Ljava/lang/Object;
         3: pop
         4: aload_0
         5: getfield      #47                 // Field label:I
         8: tableswitch   { // 0 to 0

                       0: 28
                 default: 71
            }
        28: aload_1
        29: invokestatic  #53                 // Method kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
        32: ldc           #55                 // String Admins & Chars
        34: aload_0
        35: getfield      #14                 // Field this$0:Lext/mods/gameserver/GameServer;
        38: astore_2
        39: iconst_0
        40: istore_3
        41: invokestatic  #61                 // Method java/lang/System.currentTimeMillis:()J
        44: lstore        4
        46: astore        7
        48: iconst_0
        49: istore        6
        51: aload_2
        52: invokestatic  #67                 // Method ext/mods/gameserver/GameServer.access$loadAdminsCharacters:(Lext/mods/gameserver/GameServer;)V
        55: aload         7
        57: nop
        58: invokestatic  #61                 // Method java/lang/System.currentTimeMillis:()J
        61: lload         4
        63: lsub
        64: invokestatic  #73                 // Method kotlin/coroutines/jvm/internal/Boxing.boxLong:(J)Ljava/lang/Long;
        67: invokestatic  #79                 // Method kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
        70: areturn
        71: new           #81                 // class java/lang/IllegalStateException
        74: dup
        75: ldc           #83                 // String call to \'resume\' before \'invoke\' with coroutine
        77: invokespecial #86                 // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
        80: athrow
      StackMapTable: number_of_entries = 2
        frame_type = 28 /* same */
        frame_type = 42 /* same */
      LineNumberTable:
        line 410: 3
        line 410: 32
        line 704: 41
        line 705: 46
        line 410: 51
        line 705: 57
        line 706: 58
        line 410: 67
        line 410: 71
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           51       4     6 $i$a$-measureTimeMillis-GameServer$loadParallel$2$totalTime$1$7$1   I
           41      23     3 $i$f$measureTimeMillis   I
           46      18     4 start$iv   J
            0      81     0  this   Lext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$7;
            0      81     1 $result   Ljava/lang/Object;

  public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object, kotlin.coroutines.Continuation<?>);
    descriptor: (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=3, args_size=3
         0: new           #2                  // class ext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$7
         3: dup
         4: aload_0
         5: getfield      #14                 // Field this$0:Lext/mods/gameserver/GameServer;
         8: aload_2
         9: invokespecial #97                 // Method "<init>":(Lext/mods/gameserver/GameServer;Lkotlin/coroutines/Continuation;)V
        12: checkcast     #99                 // class kotlin/coroutines/Continuation
        15: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$7;
            0      16     1 value   Ljava/lang/Object;
            0      16     2 $completion   Lkotlin/coroutines/Continuation;
    Signature: #95                          // (Ljava/lang/Object;Lkotlin/coroutines/Continuation<*>;)Lkotlin/coroutines/Continuation<Lkotlin/Unit;>;

  public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Pair<java.lang.String, java.lang.Long>>);
    descriptor: (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: aload_2
         3: invokevirtual #105                // Method create:(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
         6: checkcast     #2                  // class ext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$7
         9: getstatic     #111                // Field kotlin/Unit.INSTANCE:Lkotlin/Unit;
        12: invokevirtual #113                // Method invokeSuspend:(Ljava/lang/Object;)Ljava/lang/Object;
        15: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$7;
            0      16     1    p1   Lkotlinx/coroutines/CoroutineScope;
            0      16     2    p2   Lkotlin/coroutines/Continuation;
    Signature: #103                         // (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Lkotlin/Pair<Ljava/lang/String;Ljava/lang/Long;>;>;)Ljava/lang/Object;

  public java.lang.Object invoke(java.lang.Object, java.lang.Object);
    descriptor: (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: checkcast     #119                // class kotlinx/coroutines/CoroutineScope
         5: aload_2
         6: checkcast     #99                 // class kotlin/coroutines/Continuation
         9: invokevirtual #121                // Method invoke:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
        12: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$7;
            0      13     1    p1   Ljava/lang/Object;
            0      13     2    p2   Ljava/lang/Object;
}
InnerClasses:
  static final #136;                      // class ext/mods/gameserver/GameServer$loadParallel$2
  static final #2;                        // class ext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$7
EnclosingMethod: #136.#112              // ext.mods.gameserver.GameServer$loadParallel$2.invokeSuspend
Signature: #3                           // Lkotlin/coroutines/jvm/internal/SuspendLambda;Lkotlin/jvm/functions/Function2<Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Lkotlin/Pair<+Ljava/lang/String;+Ljava/lang/Long;>;>;Ljava/lang/Object;>;
SourceFile: "GameServer.kt"
SourceDebugExtension:
  SMAP
  GameServer.kt
  Kotlin
  *S Kotlin
  *F
  + 1 GameServer.kt
  ext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$7
  + 2 Timing.kt
  kotlin/system/TimingKt
  *L
  1#1,703:1
  29#2,3:704
  *S KotlinDebug
  *F
  + 1 GameServer.kt
  ext/mods/gameserver/GameServer$loadParallel$2$totalTime$1$7
  *L
  410#1:704,3
  *E
RuntimeVisibleAnnotations:
  0: #25(#26=s#27,#28=[],#29=[],#30=[],#31=[],#32=[],#33=s#23,#34=s#35,#36=I#37)
    kotlin.coroutines.jvm.internal.DebugMetadata(
      f="GameServer.kt"
      l=[]
      nl=[]
      i=[]
      s=[]
      n=[]
      m="invokeSuspend"
      c="ext.mods.gameserver.GameServer$loadParallel$2$totalTime$1$7"
      v=2
    )
  1: #122(#123=[I#37,I#124,I#125],#126=I#124,#127=I#128,#129=[s#130],#131=[s#132,s#133,s#134,s#134,s#115])
    kotlin.Metadata(
      mv=[2,3,0]
      k=3
      xi=48
      d1=["\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"]
      d2=["<anonymous>","Lkotlin/Pair;","","","Lkotlinx/coroutines/CoroutineScope;"]
    )
RuntimeInvisibleAnnotations:
  0: #137(#100=[s#138])
    kotlin.jvm.internal.SourceDebugExtension(
      value=["SMAP\nGameServer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameServer.kt\next/mods/gameserver/GameServer$loadParallel$2$totalTime$1$7\n+ 2 Timing.kt\nkotlin/system/TimingKt\n*L\n1#1,703:1\n29#2,3:704\n*S KotlinDebug\n*F\n+ 1 GameServer.kt\next/mods/gameserver/GameServer$loadParallel$2$totalTime$1$7\n*L\n410#1:704,3\n*E\n"]
    )
