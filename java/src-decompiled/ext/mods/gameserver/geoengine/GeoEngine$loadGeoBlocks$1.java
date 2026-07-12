// Bytecode for: ext.mods.gameserver.geoengine.GeoEngine$loadGeoBlocks$1
// File: ext\mods\gameserver\geoengine\GeoEngine$loadGeoBlocks$1.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/GeoEngine$loadGeoBlocks$1.class
  Last modified 9 de jul de 2026; size 2678 bytes
  MD5 checksum c1c9db1451957c7c204310ddb4b3643c
  Compiled from "GeoEngine.kt"
final class ext.mods.gameserver.geoengine.GeoEngine$loadGeoBlocks$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl
  minor version: 0
  major version: 69
  flags: (0x0030) ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/GeoEngine$loadGeoBlocks$1
  super_class: #4                         // kotlin/coroutines/jvm/internal/ContinuationImpl
  interfaces: 0, fields: 23, methods: 2, attributes: 4
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/GeoEngine$loadGeoBlocks$1
    #2 = Class              #1            // ext/mods/gameserver/geoengine/GeoEngine$loadGeoBlocks$1
    #3 = Utf8               kotlin/coroutines/jvm/internal/ContinuationImpl
    #4 = Class              #3            // kotlin/coroutines/jvm/internal/ContinuationImpl
    #5 = Utf8               I$0
    #6 = Utf8               I
    #7 = Utf8               I$1
    #8 = Utf8               I$2
    #9 = Utf8               I$3
   #10 = Utf8               I$4
   #11 = Utf8               I$5
   #12 = Utf8               I$6
   #13 = Utf8               I$7
   #14 = Utf8               I$8
   #15 = Utf8               L$0
   #16 = Utf8               Ljava/lang/Object;
   #17 = Utf8               L$1
   #18 = Utf8               L$2
   #19 = Utf8               L$3
   #20 = Utf8               L$4
   #21 = Utf8               L$5
   #22 = Utf8               L$6
   #23 = Utf8               L$7
   #24 = Utf8               L$8
   #25 = Utf8               B$0
   #26 = Utf8               B
   #27 = Utf8               S$0
   #28 = Utf8               S
   #29 = Utf8               Lkotlin/coroutines/jvm/internal/DebugMetadata;
   #30 = Utf8               f
   #31 = Utf8               GeoEngine.kt
   #32 = Utf8               l
   #33 = Integer            1325
   #34 = Integer            1336
   #35 = Utf8               nl
   #36 = Integer            1326
   #37 = Integer            1337
   #38 = Utf8               i
   #39 = Integer            0
   #40 = Integer            1
   #41 = Utf8               s
   #42 = Utf8               n
   #43 = Utf8               filename
   #44 = Utf8               filepath
   #45 = Utf8               raf
   #46 = Utf8               fc
   #47 = Utf8               buffer
   #48 = Utf8               $this$withLock_u24default$iv
   #49 = Utf8               $completion$iv
   #50 = Utf8               regionX
   #51 = Utf8               regionY
   #52 = Utf8               $i$a$-use-GeoEngine$loadGeoBlocks$2
   #53 = Utf8               $i$a$-use-GeoEngine$loadGeoBlocks$2$1
   #54 = Utf8               blockX
   #55 = Utf8               blockY
   #56 = Utf8               ix
   #57 = Utf8               iy
   #58 = Utf8               type
   #59 = Utf8               $i$f$withLock
   #60 = Utf8               m
   #61 = Utf8               loadGeoBlocks
   #62 = Utf8               c
   #63 = Utf8               ext.mods.gameserver.geoengine.GeoEngine
   #64 = Utf8               v
   #65 = Integer            2
   #66 = Utf8               <init>
   #67 = Utf8               (Lext/mods/gameserver/geoengine/GeoEngine;Lkotlin/coroutines/Continuation;)V
   #68 = Utf8               (Lext/mods/gameserver/geoengine/GeoEngine;Lkotlin/coroutines/Continuation<-Lext/mods/gameserver/geoengine/GeoEngine$loadGeoBlocks$1;>;)V
   #69 = Utf8               this$0
   #70 = Utf8               Lext/mods/gameserver/geoengine/GeoEngine;
   #71 = NameAndType        #69:#70       // this$0:Lext/mods/gameserver/geoengine/GeoEngine;
   #72 = Fieldref           #2.#71        // ext/mods/gameserver/geoengine/GeoEngine$loadGeoBlocks$1.this$0:Lext/mods/gameserver/geoengine/GeoEngine;
   #73 = Utf8               (Lkotlin/coroutines/Continuation;)V
   #74 = NameAndType        #66:#73       // "<init>":(Lkotlin/coroutines/Continuation;)V
   #75 = Methodref          #4.#74        // kotlin/coroutines/jvm/internal/ContinuationImpl."<init>":(Lkotlin/coroutines/Continuation;)V
   #76 = Utf8               this
   #77 = Utf8               Lext/mods/gameserver/geoengine/GeoEngine$loadGeoBlocks$1;
   #78 = Utf8               $completion
   #79 = Utf8               Lkotlin/coroutines/Continuation;
   #80 = Utf8               invokeSuspend
   #81 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #82 = Utf8               Lorg/jetbrains/annotations/Nullable;
   #83 = Utf8               Lorg/jetbrains/annotations/NotNull;
   #84 = Utf8               result
   #85 = NameAndType        #84:#16       // result:Ljava/lang/Object;
   #86 = Fieldref           #2.#85        // ext/mods/gameserver/geoengine/GeoEngine$loadGeoBlocks$1.result:Ljava/lang/Object;
   #87 = Utf8               label
   #88 = NameAndType        #87:#6        // label:I
   #89 = Fieldref           #2.#88        // ext/mods/gameserver/geoengine/GeoEngine$loadGeoBlocks$1.label:I
   #90 = Integer            -2147483648
   #91 = Utf8               kotlin/coroutines/Continuation
   #92 = Class              #91           // kotlin/coroutines/Continuation
   #93 = Utf8               ext/mods/gameserver/geoengine/GeoEngine
   #94 = Class              #93           // ext/mods/gameserver/geoengine/GeoEngine
   #95 = Utf8               access$loadGeoBlocks
   #96 = Utf8               (Lext/mods/gameserver/geoengine/GeoEngine;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;
   #97 = NameAndType        #95:#96       // access$loadGeoBlocks:(Lext/mods/gameserver/geoengine/GeoEngine;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;
   #98 = Methodref          #94.#97       // ext/mods/gameserver/geoengine/GeoEngine.access$loadGeoBlocks:(Lext/mods/gameserver/geoengine/GeoEngine;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;
   #99 = Utf8               $result
  #100 = Utf8               Lkotlin/Metadata;
  #101 = Utf8               mv
  #102 = Integer            3
  #103 = Utf8               k
  #104 = Utf8               xi
  #105 = Integer            48
  #106 = Utf8               (IILkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #107 = NameAndType        #61:#106      // loadGeoBlocks:(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #108 = Utf8               Code
  #109 = Utf8               LocalVariableTable
  #110 = Utf8               Signature
  #111 = Utf8               RuntimeInvisibleAnnotations
  #112 = Utf8               RuntimeInvisibleParameterAnnotations
  #113 = Utf8               InnerClasses
  #114 = Utf8               EnclosingMethod
  #115 = Utf8               SourceFile
  #116 = Utf8               RuntimeVisibleAnnotations
{
  int I$0;
    descriptor: I
    flags: (0x0000)

  int I$1;
    descriptor: I
    flags: (0x0000)

  int I$2;
    descriptor: I
    flags: (0x0000)

  int I$3;
    descriptor: I
    flags: (0x0000)

  int I$4;
    descriptor: I
    flags: (0x0000)

  int I$5;
    descriptor: I
    flags: (0x0000)

  int I$6;
    descriptor: I
    flags: (0x0000)

  int I$7;
    descriptor: I
    flags: (0x0000)

  int I$8;
    descriptor: I
    flags: (0x0000)

  java.lang.Object L$0;
    descriptor: Ljava/lang/Object;
    flags: (0x0000)

  java.lang.Object L$1;
    descriptor: Ljava/lang/Object;
    flags: (0x0000)

  java.lang.Object L$2;
    descriptor: Ljava/lang/Object;
    flags: (0x0000)

  java.lang.Object L$3;
    descriptor: Ljava/lang/Object;
    flags: (0x0000)

  java.lang.Object L$4;
    descriptor: Ljava/lang/Object;
    flags: (0x0000)

  java.lang.Object L$5;
    descriptor: Ljava/lang/Object;
    flags: (0x0000)

  java.lang.Object L$6;
    descriptor: Ljava/lang/Object;
    flags: (0x0000)

  java.lang.Object L$7;
    descriptor: Ljava/lang/Object;
    flags: (0x0000)

  java.lang.Object L$8;
    descriptor: Ljava/lang/Object;
    flags: (0x0000)

  byte B$0;
    descriptor: B
    flags: (0x0000)

  short S$0;
    descriptor: S
    flags: (0x0000)

  java.lang.Object result;
    descriptor: Ljava/lang/Object;
    flags: (0x1000) ACC_SYNTHETIC

  final ext.mods.gameserver.geoengine.GeoEngine this$0;
    descriptor: Lext/mods/gameserver/geoengine/GeoEngine;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  int label;
    descriptor: I
    flags: (0x0000)

  ext.mods.gameserver.geoengine.GeoEngine$loadGeoBlocks$1(ext.mods.gameserver.geoengine.GeoEngine, kotlin.coroutines.Continuation<? super ext.mods.gameserver.geoengine.GeoEngine$loadGeoBlocks$1>);
    descriptor: (Lext/mods/gameserver/geoengine/GeoEngine;Lkotlin/coroutines/Continuation;)V
    flags: (0x0000)
    Code:
      stack=2, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: putfield      #72                 // Field this$0:Lext/mods/gameserver/geoengine/GeoEngine;
         5: aload_0
         6: aload_2
         7: invokespecial #75                 // Method kotlin/coroutines/jvm/internal/ContinuationImpl."<init>":(Lkotlin/coroutines/Continuation;)V
        10: return
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/geoengine/GeoEngine$loadGeoBlocks$1;
            0      11     1 this$0   Lext/mods/gameserver/geoengine/GeoEngine;
            0      11     2 $completion   Lkotlin/coroutines/Continuation;
    Signature: #68                          // (Lext/mods/gameserver/geoengine/GeoEngine;Lkotlin/coroutines/Continuation<-Lext/mods/gameserver/geoengine/GeoEngine$loadGeoBlocks$1;>;)V

  public final java.lang.Object invokeSuspend(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Ljava/lang/Object;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #86                 // Field result:Ljava/lang/Object;
         5: aload_0
         6: aload_0
         7: getfield      #89                 // Field label:I
        10: ldc           #90                 // int -2147483648
        12: ior
        13: putfield      #89                 // Field label:I
        16: aload_0
        17: getfield      #72                 // Field this$0:Lext/mods/gameserver/geoengine/GeoEngine;
        20: iconst_0
        21: iconst_0
        22: aload_0
        23: checkcast     #92                 // class kotlin/coroutines/Continuation
        26: invokestatic  #98                 // Method ext/mods/gameserver/geoengine/GeoEngine.access$loadGeoBlocks:(Lext/mods/gameserver/geoengine/GeoEngine;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;
        29: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      30     0  this   Lext/mods/gameserver/geoengine/GeoEngine$loadGeoBlocks$1;
            0      30     1 $result   Ljava/lang/Object;
    RuntimeInvisibleAnnotations:
      0: #82()
        org.jetbrains.annotations.Nullable
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #83()
          org.jetbrains.annotations.NotNull
}
InnerClasses:
  static final #2;                        // class ext/mods/gameserver/geoengine/GeoEngine$loadGeoBlocks$1
EnclosingMethod: #94.#107               // ext.mods.gameserver.geoengine.GeoEngine.loadGeoBlocks
SourceFile: "GeoEngine.kt"
RuntimeVisibleAnnotations:
  0: #29(#30=s#31,#32=[I#33,I#34],#35=[I#36,I#37],#38=[I#39,I#39,I#39,I#39,I#39,I#39,I#39,I#39,I#39,I#39,I#39,I#39,I#39,I#39,I#39,I#39,I#39,I#40,I#40,I#40,I#40,I#40,I#40,I#40,I#40,I#40,I#40,I#40,I#40,I#40,I#40,I#40,I#40,I#40],#41=[s#15,s#17,s#19,s#21,s#22,s#23,s#24,s#5,s#7,s#8,s#9,s#10,s#11,s#12,s#13,s#25,s#14,s#15,s#17,s#19,s#21,s#22,s#23,s#24,s#5,s#7,s#8,s#9,s#10,s#11,s#12,s#13,s#27,s#14],#42=[s#43,s#44,s#45,s#46,s#47,s#48,s#49,s#50,s#51,s#52,s#53,s#54,s#55,s#56,s#57,s#58,s#59,s#43,s#44,s#45,s#46,s#47,s#48,s#49,s#50,s#51,s#52,s#53,s#54,s#55,s#56,s#57,s#58,s#59],#60=s#61,#62=s#63,#64=I#65)
    kotlin.coroutines.jvm.internal.DebugMetadata(
      f="GeoEngine.kt"
      l=[1325,1336]
      nl=[1326,1337]
      i=[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1]
      s=["L$0","L$1","L$3","L$5","L$6","L$7","L$8","I$0","I$1","I$2","I$3","I$4","I$5","I$6","I$7","B$0","I$8","L$0","L$1","L$3","L$5","L$6","L$7","L$8","I$0","I$1","I$2","I$3","I$4","I$5","I$6","I$7","S$0","I$8"]
      n=["filename","filepath","raf","fc","buffer","$this$withLock_u24default$iv","$completion$iv","regionX","regionY","$i$a$-use-GeoEngine$loadGeoBlocks$2","$i$a$-use-GeoEngine$loadGeoBlocks$2$1","blockX","blockY","ix","iy","type","$i$f$withLock","filename","filepath","raf","fc","buffer","$this$withLock_u24default$iv","$completion$iv","regionX","regionY","$i$a$-use-GeoEngine$loadGeoBlocks$2","$i$a$-use-GeoEngine$loadGeoBlocks$2$1","blockX","blockY","ix","iy","type","$i$f$withLock"]
      m="loadGeoBlocks"
      c="ext.mods.gameserver.geoengine.GeoEngine"
      v=2
    )
  1: #100(#101=[I#65,I#102,I#39],#103=I#102,#104=I#105)
    kotlin.Metadata(
      mv=[2,3,0]
      k=3
      xi=48
    )
