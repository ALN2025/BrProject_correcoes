// Bytecode for: ext.mods.gameserver.geoengine.GeoEngine$2$jobs$1$1
// File: ext\mods\gameserver\geoengine\GeoEngine$2$jobs$1$1.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/GeoEngine$2$jobs$1$1.class
  Last modified 9 de jul de 2026; size 6113 bytes
  MD5 checksum ab89f1a56c23dbf2221d6058f15127e0
  Compiled from "GeoEngine.kt"
final class ext.mods.gameserver.geoengine.GeoEngine$2$jobs$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Pair<? extends java.lang.Integer, ? extends java.lang.Integer>>, java.lang.Object>
  minor version: 0
  major version: 69
  flags: (0x0030) ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/GeoEngine$2$jobs$1$1
  super_class: #5                         // kotlin/coroutines/jvm/internal/SuspendLambda
  interfaces: 1, fields: 11, methods: 5, attributes: 6
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/GeoEngine$2$jobs$1$1
    #2 = Class              #1            // ext/mods/gameserver/geoengine/GeoEngine$2$jobs$1$1
    #3 = Utf8               Lkotlin/coroutines/jvm/internal/SuspendLambda;Lkotlin/jvm/functions/Function2<Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Lkotlin/Pair<+Ljava/lang/Integer;+Ljava/lang/Integer;>;>;Ljava/lang/Object;>;
    #4 = Utf8               kotlin/coroutines/jvm/internal/SuspendLambda
    #5 = Class              #4            // kotlin/coroutines/jvm/internal/SuspendLambda
    #6 = Utf8               kotlin/jvm/functions/Function2
    #7 = Class              #6            // kotlin/jvm/functions/Function2
    #8 = Utf8               <init>
    #9 = Utf8               (Ljava/util/List;Lext/mods/commons/config/ExProperties;Lext/mods/gameserver/geoengine/GeoEngine;ILkotlin/coroutines/Continuation;)V
   #10 = Utf8               (Ljava/util/List<Lkotlin/Pair<Ljava/lang/Integer;Ljava/lang/Integer;>;>;Lext/mods/commons/config/ExProperties;Lext/mods/gameserver/geoengine/GeoEngine;ILkotlin/coroutines/Continuation<-Lext/mods/gameserver/geoengine/GeoEngine$2$jobs$1$1;>;)V
   #11 = Utf8               $batch
   #12 = Utf8               Ljava/util/List;
   #13 = NameAndType        #11:#12       // $batch:Ljava/util/List;
   #14 = Fieldref           #2.#13        // ext/mods/gameserver/geoengine/GeoEngine$2$jobs$1$1.$batch:Ljava/util/List;
   #15 = Utf8               $props
   #16 = Utf8               Lext/mods/commons/config/ExProperties;
   #17 = NameAndType        #15:#16       // $props:Lext/mods/commons/config/ExProperties;
   #18 = Fieldref           #2.#17        // ext/mods/gameserver/geoengine/GeoEngine$2$jobs$1$1.$props:Lext/mods/commons/config/ExProperties;
   #19 = Utf8               this$0
   #20 = Utf8               Lext/mods/gameserver/geoengine/GeoEngine;
   #21 = NameAndType        #19:#20       // this$0:Lext/mods/gameserver/geoengine/GeoEngine;
   #22 = Fieldref           #2.#21        // ext/mods/gameserver/geoengine/GeoEngine$2$jobs$1$1.this$0:Lext/mods/gameserver/geoengine/GeoEngine;
   #23 = Utf8               $index
   #24 = Utf8               I
   #25 = NameAndType        #23:#24       // $index:I
   #26 = Fieldref           #2.#25        // ext/mods/gameserver/geoengine/GeoEngine$2$jobs$1$1.$index:I
   #27 = Utf8               (ILkotlin/coroutines/Continuation;)V
   #28 = NameAndType        #8:#27        // "<init>":(ILkotlin/coroutines/Continuation;)V
   #29 = Methodref          #5.#28        // kotlin/coroutines/jvm/internal/SuspendLambda."<init>":(ILkotlin/coroutines/Continuation;)V
   #30 = Utf8               this
   #31 = Utf8               Lext/mods/gameserver/geoengine/GeoEngine$2$jobs$1$1;
   #32 = Utf8               $receiver
   #33 = Utf8               $completion
   #34 = Utf8               Lkotlin/coroutines/Continuation;
   #35 = Utf8               invokeSuspend
   #36 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #37 = Utf8               I$0
   #38 = Utf8               I$1
   #39 = Utf8               I$2
   #40 = Utf8               I$3
   #41 = Utf8               J$0
   #42 = Utf8               J
   #43 = Utf8               L$0
   #44 = Utf8               Ljava/lang/Object;
   #45 = Utf8               Lkotlin/coroutines/jvm/internal/DebugMetadata;
   #46 = Utf8               f
   #47 = Utf8               GeoEngine.kt
   #48 = Utf8               l
   #49 = Integer            98
   #50 = Utf8               nl
   #51 = Integer            100
   #52 = Utf8               i
   #53 = Integer            0
   #54 = Utf8               s
   #55 = Utf8               n
   #56 = Utf8               start
   #57 = Utf8               rx
   #58 = Utf8               ry
   #59 = Utf8               m
   #60 = Utf8               c
   #61 = Utf8               ext.mods.gameserver.geoengine.GeoEngine$2$jobs$1$1
   #62 = Utf8               v
   #63 = Integer            2
   #64 = Utf8               java/lang/Exception
   #65 = Class              #64           // java/lang/Exception
   #66 = Utf8               kotlin/coroutines/intrinsics/IntrinsicsKt
   #67 = Class              #66           // kotlin/coroutines/intrinsics/IntrinsicsKt
   #68 = Utf8               getCOROUTINE_SUSPENDED
   #69 = Utf8               ()Ljava/lang/Object;
   #70 = NameAndType        #68:#69       // getCOROUTINE_SUSPENDED:()Ljava/lang/Object;
   #71 = Methodref          #67.#70       // kotlin/coroutines/intrinsics/IntrinsicsKt.getCOROUTINE_SUSPENDED:()Ljava/lang/Object;
   #72 = Utf8               label
   #73 = NameAndType        #72:#24       // label:I
   #74 = Fieldref           #2.#73        // ext/mods/gameserver/geoengine/GeoEngine$2$jobs$1$1.label:I
   #75 = Utf8               kotlin/ResultKt
   #76 = Class              #75           // kotlin/ResultKt
   #77 = Utf8               throwOnFailure
   #78 = Utf8               (Ljava/lang/Object;)V
   #79 = NameAndType        #77:#78       // throwOnFailure:(Ljava/lang/Object;)V
   #80 = Methodref          #76.#79       // kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
   #81 = Utf8               java/lang/System
   #82 = Class              #81           // java/lang/System
   #83 = Utf8               currentTimeMillis
   #84 = Utf8               ()J
   #85 = NameAndType        #83:#84       // currentTimeMillis:()J
   #86 = Methodref          #82.#85       // java/lang/System.currentTimeMillis:()J
   #87 = Utf8               java/util/List
   #88 = Class              #87           // java/util/List
   #89 = Utf8               iterator
   #90 = Utf8               ()Ljava/util/Iterator;
   #91 = NameAndType        #89:#90       // iterator:()Ljava/util/Iterator;
   #92 = InterfaceMethodref #88.#91       // java/util/List.iterator:()Ljava/util/Iterator;
   #93 = Utf8               java/util/Iterator
   #94 = Class              #93           // java/util/Iterator
   #95 = Utf8               hasNext
   #96 = Utf8               ()Z
   #97 = NameAndType        #95:#96       // hasNext:()Z
   #98 = InterfaceMethodref #94.#97       // java/util/Iterator.hasNext:()Z
   #99 = Utf8               next
  #100 = NameAndType        #99:#69       // next:()Ljava/lang/Object;
  #101 = InterfaceMethodref #94.#100      // java/util/Iterator.next:()Ljava/lang/Object;
  #102 = Utf8               kotlin/Pair
  #103 = Class              #102          // kotlin/Pair
  #104 = Utf8               component1
  #105 = NameAndType        #104:#69      // component1:()Ljava/lang/Object;
  #106 = Methodref          #103.#105     // kotlin/Pair.component1:()Ljava/lang/Object;
  #107 = Utf8               java/lang/Number
  #108 = Class              #107          // java/lang/Number
  #109 = Utf8               intValue
  #110 = Utf8               ()I
  #111 = NameAndType        #109:#110     // intValue:()I
  #112 = Methodref          #108.#111     // java/lang/Number.intValue:()I
  #113 = Utf8               component2
  #114 = NameAndType        #113:#69      // component2:()Ljava/lang/Object;
  #115 = Methodref          #103.#114     // kotlin/Pair.component2:()Ljava/lang/Object;
  #116 = Utf8               \u0001_\u0001
  #117 = String             #116          // \u0001_\u0001
  #118 = Utf8               java/lang/invoke/StringConcatFactory
  #119 = Class              #118          // java/lang/invoke/StringConcatFactory
  #120 = Utf8               makeConcatWithConstants
  #121 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #122 = NameAndType        #120:#121     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #123 = Methodref          #119.#122     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #124 = MethodHandle       6:#123        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #125 = Utf8               (II)Ljava/lang/String;
  #126 = NameAndType        #120:#125     // makeConcatWithConstants:(II)Ljava/lang/String;
  #127 = InvokeDynamic      #0:#126       // #0:makeConcatWithConstants:(II)Ljava/lang/String;
  #128 = Utf8               ext/mods/commons/config/ExProperties
  #129 = Class              #128          // ext/mods/commons/config/ExProperties
  #130 = Utf8               containsKey
  #131 = Utf8               (Ljava/lang/Object;)Z
  #132 = NameAndType        #130:#131     // containsKey:(Ljava/lang/Object;)Z
  #133 = Methodref          #129.#132     // ext/mods/commons/config/ExProperties.containsKey:(Ljava/lang/Object;)Z
  #134 = Utf8               kotlin/coroutines/Continuation
  #135 = Class              #134          // kotlin/coroutines/Continuation
  #136 = NameAndType        #43:#44       // L$0:Ljava/lang/Object;
  #137 = Fieldref           #2.#136       // ext/mods/gameserver/geoengine/GeoEngine$2$jobs$1$1.L$0:Ljava/lang/Object;
  #138 = NameAndType        #37:#24       // I$0:I
  #139 = Fieldref           #2.#138       // ext/mods/gameserver/geoengine/GeoEngine$2$jobs$1$1.I$0:I
  #140 = NameAndType        #38:#24       // I$1:I
  #141 = Fieldref           #2.#140       // ext/mods/gameserver/geoengine/GeoEngine$2$jobs$1$1.I$1:I
  #142 = NameAndType        #41:#42       // J$0:J
  #143 = Fieldref           #2.#142       // ext/mods/gameserver/geoengine/GeoEngine$2$jobs$1$1.J$0:J
  #144 = NameAndType        #39:#24       // I$2:I
  #145 = Fieldref           #2.#144       // ext/mods/gameserver/geoengine/GeoEngine$2$jobs$1$1.I$2:I
  #146 = NameAndType        #40:#24       // I$3:I
  #147 = Fieldref           #2.#146       // ext/mods/gameserver/geoengine/GeoEngine$2$jobs$1$1.I$3:I
  #148 = Utf8               ext/mods/gameserver/geoengine/GeoEngine
  #149 = Class              #148          // ext/mods/gameserver/geoengine/GeoEngine
  #150 = Utf8               access$loadGeoBlocks
  #151 = Utf8               (Lext/mods/gameserver/geoengine/GeoEngine;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #152 = NameAndType        #150:#151     // access$loadGeoBlocks:(Lext/mods/gameserver/geoengine/GeoEngine;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #153 = Methodref          #149.#152     // ext/mods/gameserver/geoengine/GeoEngine.access$loadGeoBlocks:(Lext/mods/gameserver/geoengine/GeoEngine;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #154 = Utf8               java/lang/Boolean
  #155 = Class              #154          // java/lang/Boolean
  #156 = Utf8               booleanValue
  #157 = NameAndType        #156:#96      // booleanValue:()Z
  #158 = Methodref          #155.#157     // java/lang/Boolean.booleanValue:()Z
  #159 = Utf8               kotlin/coroutines/jvm/internal/Boxing
  #160 = Class              #159          // kotlin/coroutines/jvm/internal/Boxing
  #161 = Utf8               boxInt
  #162 = Utf8               (I)Ljava/lang/Integer;
  #163 = NameAndType        #161:#162     // boxInt:(I)Ljava/lang/Integer;
  #164 = Methodref          #160.#163     // kotlin/coroutines/jvm/internal/Boxing.boxInt:(I)Ljava/lang/Integer;
  #165 = Utf8               access$loadNullBlocks
  #166 = Utf8               (Lext/mods/gameserver/geoengine/GeoEngine;II)V
  #167 = NameAndType        #165:#166     // access$loadNullBlocks:(Lext/mods/gameserver/geoengine/GeoEngine;II)V
  #168 = Methodref          #149.#167     // ext/mods/gameserver/geoengine/GeoEngine.access$loadNullBlocks:(Lext/mods/gameserver/geoengine/GeoEngine;II)V
  #169 = Utf8               access$getLOGGER$cp
  #170 = Utf8               ()Lext/mods/commons/logging/CLogger;
  #171 = NameAndType        #169:#170     // access$getLOGGER$cp:()Lext/mods/commons/logging/CLogger;
  #172 = Methodref          #149.#171     // ext/mods/gameserver/geoengine/GeoEngine.access$getLOGGER$cp:()Lext/mods/commons/logging/CLogger;
  #173 = Utf8               Erro na regiao \u0001_\u0001
  #174 = String             #173          // Erro na regiao \u0001_\u0001
  #175 = InvokeDynamic      #1:#126       // #1:makeConcatWithConstants:(II)Ljava/lang/String;
  #176 = Utf8               java/lang/Throwable
  #177 = Class              #176          // java/lang/Throwable
  #178 = Utf8               ext/mods/commons/logging/CLogger
  #179 = Class              #178          // ext/mods/commons/logging/CLogger
  #180 = Utf8               error
  #181 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
  #182 = NameAndType        #180:#181     // error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #183 = Methodref          #179.#182     // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #184 = Utf8                -> Lote #\u0001 finalizado: \u0001 carregados em \u0001ms
  #185 = String             #184          //  -> Lote #\u0001 finalizado: \u0001 carregados em \u0001ms
  #186 = Utf8               (IIJ)Ljava/lang/String;
  #187 = NameAndType        #120:#186     // makeConcatWithConstants:(IIJ)Ljava/lang/String;
  #188 = InvokeDynamic      #2:#187       // #2:makeConcatWithConstants:(IIJ)Ljava/lang/String;
  #189 = Utf8               info
  #190 = NameAndType        #189:#78      // info:(Ljava/lang/Object;)V
  #191 = Methodref          #179.#190     // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
  #192 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)V
  #193 = NameAndType        #8:#192       // "<init>":(Ljava/lang/Object;Ljava/lang/Object;)V
  #194 = Methodref          #103.#193     // kotlin/Pair."<init>":(Ljava/lang/Object;Ljava/lang/Object;)V
  #195 = Utf8               java/lang/IllegalStateException
  #196 = Class              #195          // java/lang/IllegalStateException
  #197 = Utf8               call to \'resume\' before \'invoke\' with coroutine
  #198 = String             #197          // call to \'resume\' before \'invoke\' with coroutine
  #199 = Utf8               (Ljava/lang/String;)V
  #200 = NameAndType        #8:#199       // "<init>":(Ljava/lang/String;)V
  #201 = Methodref          #196.#200     // java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
  #202 = Utf8               e
  #203 = Utf8               Ljava/lang/Exception;
  #204 = Utf8               time
  #205 = Utf8               $result
  #206 = Utf8               java/lang/Object
  #207 = Class              #206          // java/lang/Object
  #208 = Utf8               create
  #209 = Utf8               (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
  #210 = Utf8               (Ljava/lang/Object;Lkotlin/coroutines/Continuation<*>;)Lkotlin/coroutines/Continuation<Lkotlin/Unit;>;
  #211 = NameAndType        #8:#9         // "<init>":(Ljava/util/List;Lext/mods/commons/config/ExProperties;Lext/mods/gameserver/geoengine/GeoEngine;ILkotlin/coroutines/Continuation;)V
  #212 = Methodref          #2.#211       // ext/mods/gameserver/geoengine/GeoEngine$2$jobs$1$1."<init>":(Ljava/util/List;Lext/mods/commons/config/ExProperties;Lext/mods/gameserver/geoengine/GeoEngine;ILkotlin/coroutines/Continuation;)V
  #213 = Utf8               value
  #214 = Utf8               invoke
  #215 = Utf8               (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #216 = Utf8               (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Lkotlin/Pair<Ljava/lang/Integer;Ljava/lang/Integer;>;>;)Ljava/lang/Object;
  #217 = NameAndType        #208:#209     // create:(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
  #218 = Methodref          #2.#217       // ext/mods/gameserver/geoengine/GeoEngine$2$jobs$1$1.create:(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
  #219 = Utf8               kotlin/Unit
  #220 = Class              #219          // kotlin/Unit
  #221 = Utf8               INSTANCE
  #222 = Utf8               Lkotlin/Unit;
  #223 = NameAndType        #221:#222     // INSTANCE:Lkotlin/Unit;
  #224 = Fieldref           #220.#223     // kotlin/Unit.INSTANCE:Lkotlin/Unit;
  #225 = NameAndType        #35:#36       // invokeSuspend:(Ljava/lang/Object;)Ljava/lang/Object;
  #226 = Methodref          #2.#225       // ext/mods/gameserver/geoengine/GeoEngine$2$jobs$1$1.invokeSuspend:(Ljava/lang/Object;)Ljava/lang/Object;
  #227 = Utf8               p1
  #228 = Utf8               Lkotlinx/coroutines/CoroutineScope;
  #229 = Utf8               p2
  #230 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #231 = Utf8               kotlinx/coroutines/CoroutineScope
  #232 = Class              #231          // kotlinx/coroutines/CoroutineScope
  #233 = NameAndType        #214:#215     // invoke:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #234 = Methodref          #2.#233       // ext/mods/gameserver/geoengine/GeoEngine$2$jobs$1$1.invoke:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #235 = Utf8               Ljava/util/List<Lkotlin/Pair<Ljava/lang/Integer;Ljava/lang/Integer;>;>;
  #236 = Utf8               Lkotlin/Metadata;
  #237 = Utf8               mv
  #238 = Integer            3
  #239 = Utf8               k
  #240 = Utf8               xi
  #241 = Integer            48
  #242 = Utf8               d1
  #243 = Utf8               \u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n
  #244 = Utf8               d2
  #245 = Utf8               <anonymous>
  #246 = Utf8               Lkotlin/Pair;
  #247 = Utf8
  #248 = Utf8               ext/mods/gameserver/geoengine/GeoEngine$2
  #249 = Class              #248          // ext/mods/gameserver/geoengine/GeoEngine$2
  #250 = Utf8               Signature
  #251 = Utf8               Code
  #252 = Utf8               LocalVariableTable
  #253 = Utf8               StackMapTable
  #254 = Utf8               LineNumberTable
  #255 = Utf8               InnerClasses
  #256 = Utf8               EnclosingMethod
  #257 = Utf8               SourceFile
  #258 = Utf8               RuntimeVisibleAnnotations
  #259 = Utf8               BootstrapMethods
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

  long J$0;
    descriptor: J
    flags: (0x0000)

  java.lang.Object L$0;
    descriptor: Ljava/lang/Object;
    flags: (0x0000)

  int label;
    descriptor: I
    flags: (0x0000)

  final java.util.List<kotlin.Pair<java.lang.Integer, java.lang.Integer>> $batch;
    descriptor: Ljava/util/List;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC
    Signature: #235                         // Ljava/util/List<Lkotlin/Pair<Ljava/lang/Integer;Ljava/lang/Integer;>;>;

  final ext.mods.commons.config.ExProperties $props;
    descriptor: Lext/mods/commons/config/ExProperties;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  final ext.mods.gameserver.geoengine.GeoEngine this$0;
    descriptor: Lext/mods/gameserver/geoengine/GeoEngine;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  final int $index;
    descriptor: I
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  ext.mods.gameserver.geoengine.GeoEngine$2$jobs$1$1(java.util.List<kotlin.Pair<java.lang.Integer, java.lang.Integer>>, ext.mods.commons.config.ExProperties, ext.mods.gameserver.geoengine.GeoEngine, int, kotlin.coroutines.Continuation<? super ext.mods.gameserver.geoengine.GeoEngine$2$jobs$1$1>);
    descriptor: (Ljava/util/List;Lext/mods/commons/config/ExProperties;Lext/mods/gameserver/geoengine/GeoEngine;ILkotlin/coroutines/Continuation;)V
    flags: (0x0000)
    Code:
      stack=3, locals=6, args_size=6
         0: aload_0
         1: aload_1
         2: putfield      #14                 // Field $batch:Ljava/util/List;
         5: aload_0
         6: aload_2
         7: putfield      #18                 // Field $props:Lext/mods/commons/config/ExProperties;
        10: aload_0
        11: aload_3
        12: putfield      #22                 // Field this$0:Lext/mods/gameserver/geoengine/GeoEngine;
        15: aload_0
        16: iload         4
        18: putfield      #26                 // Field $index:I
        21: aload_0
        22: iconst_2
        23: aload         5
        25: invokespecial #29                 // Method kotlin/coroutines/jvm/internal/SuspendLambda."<init>":(ILkotlin/coroutines/Continuation;)V
        28: return
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      29     0  this   Lext/mods/gameserver/geoengine/GeoEngine$2$jobs$1$1;
            0      29     1 $batch   Ljava/util/List;
            0      29     2 $props   Lext/mods/commons/config/ExProperties;
            0      29     3 $receiver   Lext/mods/gameserver/geoengine/GeoEngine;
            0      29     4 $index   I
            0      29     5 $completion   Lkotlin/coroutines/Continuation;
    Signature: #10                          // (Ljava/util/List<Lkotlin/Pair<Ljava/lang/Integer;Ljava/lang/Integer;>;>;Lext/mods/commons/config/ExProperties;Lext/mods/gameserver/geoengine/GeoEngine;ILkotlin/coroutines/Continuation<-Lext/mods/gameserver/geoengine/GeoEngine$2$jobs$1$1;>;)V

  public final java.lang.Object invokeSuspend(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Ljava/lang/Object;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=7, locals=12, args_size=2
         0: invokestatic  #71                 // Method kotlin/coroutines/intrinsics/IntrinsicsKt.getCOROUTINE_SUSPENDED:()Ljava/lang/Object;
         3: astore        11
         5: aload_0
         6: getfield      #74                 // Field label:I
         9: tableswitch   { // 0 to 1

                       0: 32

                       1: 187
                 default: 359
            }
        32: aload_1
        33: invokestatic  #80                 // Method kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
        36: iconst_0
        37: istore_2
        38: iconst_0
        39: istore_3
        40: invokestatic  #86                 // Method java/lang/System.currentTimeMillis:()J
        43: lstore        4
        45: aload_0
        46: getfield      #14                 // Field $batch:Ljava/util/List;
        49: invokeinterface #92,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        54: astore        6
        56: aload         6
        58: invokeinterface #98,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        63: ifeq          315
        66: aload         6
        68: invokeinterface #101,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        73: checkcast     #103                // class kotlin/Pair
        76: astore        7
        78: aload         7
        80: invokevirtual #106                // Method kotlin/Pair.component1:()Ljava/lang/Object;
        83: checkcast     #108                // class java/lang/Number
        86: invokevirtual #112                // Method java/lang/Number.intValue:()I
        89: istore        8
        91: aload         7
        93: invokevirtual #115                // Method kotlin/Pair.component2:()Ljava/lang/Object;
        96: checkcast     #108                // class java/lang/Number
        99: invokevirtual #112                // Method java/lang/Number.intValue:()I
       102: istore        9
       104: nop
       105: aload_0
       106: getfield      #18                 // Field $props:Lext/mods/commons/config/ExProperties;
       109: iload         8
       111: iload         9
       113: invokedynamic #127,  0            // InvokeDynamic #0:makeConcatWithConstants:(II)Ljava/lang/String;
       118: invokevirtual #133                // Method ext/mods/commons/config/ExProperties.containsKey:(Ljava/lang/Object;)Z
       121: ifeq          257
       124: aload_0
       125: getfield      #22                 // Field this$0:Lext/mods/gameserver/geoengine/GeoEngine;
       128: iload         8
       130: iload         9
       132: aload_0
       133: checkcast     #135                // class kotlin/coroutines/Continuation
       136: aload_0
       137: aload         6
       139: putfield      #137                // Field L$0:Ljava/lang/Object;
       142: aload_0
       143: iload_2
       144: putfield      #139                // Field I$0:I
       147: aload_0
       148: iload_3
       149: putfield      #141                // Field I$1:I
       152: aload_0
       153: lload         4
       155: putfield      #143                // Field J$0:J
       158: aload_0
       159: iload         8
       161: putfield      #145                // Field I$2:I
       164: aload_0
       165: iload         9
       167: putfield      #147                // Field I$3:I
       170: aload_0
       171: iconst_1
       172: putfield      #74                 // Field label:I
       175: invokestatic  #153                // Method ext/mods/gameserver/geoengine/GeoEngine.access$loadGeoBlocks:(Lext/mods/gameserver/geoengine/GeoEngine;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;
       178: dup
       179: aload         11
       181: if_acmpne     230
       184: aload         11
       186: areturn
       187: aload_0
       188: getfield      #147                // Field I$3:I
       191: istore        9
       193: aload_0
       194: getfield      #145                // Field I$2:I
       197: istore        8
       199: aload_0
       200: getfield      #143                // Field J$0:J
       203: lstore        4
       205: aload_0
       206: getfield      #141                // Field I$1:I
       209: istore_3
       210: aload_0
       211: getfield      #139                // Field I$0:I
       214: istore_2
       215: aload_0
       216: getfield      #137                // Field L$0:Ljava/lang/Object;
       219: checkcast     #94                 // class java/util/Iterator
       222: astore        6
       224: nop
       225: aload_1
       226: invokestatic  #80                 // Method kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
       229: aload_1
       230: checkcast     #155                // class java/lang/Boolean
       233: invokevirtual #158                // Method java/lang/Boolean.booleanValue:()Z
       236: ifeq          246
       239: iload_2
       240: iinc          2, 1
       243: goto          250
       246: iload_3
       247: iinc          3, 1
       250: invokestatic  #164                // Method kotlin/coroutines/jvm/internal/Boxing.boxInt:(I)Ljava/lang/Integer;
       253: pop
       254: goto          56
       257: aload_0
       258: getfield      #22                 // Field this$0:Lext/mods/gameserver/geoengine/GeoEngine;
       261: iload         8
       263: iload         9
       265: invokestatic  #168                // Method ext/mods/gameserver/geoengine/GeoEngine.access$loadNullBlocks:(Lext/mods/gameserver/geoengine/GeoEngine;II)V
       268: goto          56
       271: astore        10
       273: invokestatic  #172                // Method ext/mods/gameserver/geoengine/GeoEngine.access$getLOGGER$cp:()Lext/mods/commons/logging/CLogger;
       276: iload         8
       278: iload         9
       280: invokedynamic #175,  0            // InvokeDynamic #1:makeConcatWithConstants:(II)Ljava/lang/String;
       285: aload         10
       287: checkcast     #177                // class java/lang/Throwable
       290: invokevirtual #183                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
       293: aload_0
       294: getfield      #22                 // Field this$0:Lext/mods/gameserver/geoengine/GeoEngine;
       297: iload         8
       299: iload         9
       301: invokestatic  #168                // Method ext/mods/gameserver/geoengine/GeoEngine.access$loadNullBlocks:(Lext/mods/gameserver/geoengine/GeoEngine;II)V
       304: iload_3
       305: iinc          3, 1
       308: invokestatic  #164                // Method kotlin/coroutines/jvm/internal/Boxing.boxInt:(I)Ljava/lang/Integer;
       311: pop
       312: goto          56
       315: invokestatic  #86                 // Method java/lang/System.currentTimeMillis:()J
       318: lload         4
       320: lsub
       321: lstore        6
       323: invokestatic  #172                // Method ext/mods/gameserver/geoengine/GeoEngine.access$getLOGGER$cp:()Lext/mods/commons/logging/CLogger;
       326: aload_0
       327: getfield      #26                 // Field $index:I
       330: iconst_1
       331: iadd
       332: iload_2
       333: lload         6
       335: invokedynamic #188,  0            // InvokeDynamic #2:makeConcatWithConstants:(IIJ)Ljava/lang/String;
       340: invokevirtual #191                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
       343: new           #103                // class kotlin/Pair
       346: dup
       347: iload_2
       348: invokestatic  #164                // Method kotlin/coroutines/jvm/internal/Boxing.boxInt:(I)Ljava/lang/Integer;
       351: iload_3
       352: invokestatic  #164                // Method kotlin/coroutines/jvm/internal/Boxing.boxInt:(I)Ljava/lang/Integer;
       355: invokespecial #194                // Method kotlin/Pair."<init>":(Ljava/lang/Object;Ljava/lang/Object;)V
       358: areturn
       359: new           #196                // class java/lang/IllegalStateException
       362: dup
       363: ldc           #198                // String call to \'resume\' before \'invoke\' with coroutine
       365: invokespecial #201                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
       368: athrow
      Exception table:
         from    to  target type
           104   178   271   Class java/lang/Exception
           224   268   271   Class java/lang/Exception
      StackMapTable: number_of_entries = 10
        frame_type = 255 /* full_frame */
          offset_delta = 32
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine$2$jobs$1$1, class java/lang/Object, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 23
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine$2$jobs$1$1, class java/lang/Object, int, int, long, class java/util/Iterator, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 130
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine$2$jobs$1$1, class java/lang/Object, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 42
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine$2$jobs$1$1, class java/lang/Object, int, int, long, class java/util/Iterator, top, int, int, top, class java/lang/Object ]
          stack = [ class java/lang/Object ]
        frame_type = 15 /* same */
        frame_type = 67 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 6
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine$2$jobs$1$1, class java/lang/Object, int, int, long, class java/util/Iterator, class kotlin/Pair, int, int, top, class java/lang/Object ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine$2$jobs$1$1, class java/lang/Object, int, int, long, class java/util/Iterator, top, int, int, top, class java/lang/Object ]
          stack = [ class java/lang/Exception ]
        frame_type = 255 /* full_frame */
          offset_delta = 43
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine$2$jobs$1$1, class java/lang/Object, int, int, long, class java/util/Iterator, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 43
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine$2$jobs$1$1, class java/lang/Object, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = []
      LineNumberTable:
        line 91: 3
        line 92: 36
        line 93: 38
        line 94: 40
        line 95: 45
        line 96: 104
        line 97: 105
        line 98: 124
        line 91: 184
        line 98: 230
        line 100: 257
        line 102: 271
        line 103: 273
        line 104: 293
        line 105: 304
        line 108: 315
        line 109: 323
        line 110: 343
        line 91: 359
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          273      39    10     e   Ljava/lang/Exception;
           91      96     8    rx   I
          104      83     9    ry   I
           38     149     2     l   I
           40     147     3     f   I
           45     142     4 start   J
          323      36     6  time   J
            0     369     0  this   Lext/mods/gameserver/geoengine/GeoEngine$2$jobs$1$1;
            0     369     1 $result   Ljava/lang/Object;
          215     144     2     l   I
          210     149     3     f   I
          205     154     4 start   J
          199     113     8    rx   I
          193     119     9    ry   I

  public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object, kotlin.coroutines.Continuation<?>);
    descriptor: (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=7, locals=3, args_size=3
         0: new           #2                  // class ext/mods/gameserver/geoengine/GeoEngine$2$jobs$1$1
         3: dup
         4: aload_0
         5: getfield      #14                 // Field $batch:Ljava/util/List;
         8: aload_0
         9: getfield      #18                 // Field $props:Lext/mods/commons/config/ExProperties;
        12: aload_0
        13: getfield      #22                 // Field this$0:Lext/mods/gameserver/geoengine/GeoEngine;
        16: aload_0
        17: getfield      #26                 // Field $index:I
        20: aload_2
        21: invokespecial #212                // Method "<init>":(Ljava/util/List;Lext/mods/commons/config/ExProperties;Lext/mods/gameserver/geoengine/GeoEngine;ILkotlin/coroutines/Continuation;)V
        24: checkcast     #135                // class kotlin/coroutines/Continuation
        27: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lext/mods/gameserver/geoengine/GeoEngine$2$jobs$1$1;
            0      28     1 value   Ljava/lang/Object;
            0      28     2 $completion   Lkotlin/coroutines/Continuation;
    Signature: #210                         // (Ljava/lang/Object;Lkotlin/coroutines/Continuation<*>;)Lkotlin/coroutines/Continuation<Lkotlin/Unit;>;

  public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Pair<java.lang.Integer, java.lang.Integer>>);
    descriptor: (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: aload_2
         3: invokevirtual #218                // Method create:(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
         6: checkcast     #2                  // class ext/mods/gameserver/geoengine/GeoEngine$2$jobs$1$1
         9: getstatic     #224                // Field kotlin/Unit.INSTANCE:Lkotlin/Unit;
        12: invokevirtual #226                // Method invokeSuspend:(Ljava/lang/Object;)Ljava/lang/Object;
        15: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/geoengine/GeoEngine$2$jobs$1$1;
            0      16     1    p1   Lkotlinx/coroutines/CoroutineScope;
            0      16     2    p2   Lkotlin/coroutines/Continuation;
    Signature: #216                         // (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Lkotlin/Pair<Ljava/lang/Integer;Ljava/lang/Integer;>;>;)Ljava/lang/Object;

  public java.lang.Object invoke(java.lang.Object, java.lang.Object);
    descriptor: (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: checkcast     #232                // class kotlinx/coroutines/CoroutineScope
         5: aload_2
         6: checkcast     #135                // class kotlin/coroutines/Continuation
         9: invokevirtual #234                // Method invoke:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
        12: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/geoengine/GeoEngine$2$jobs$1$1;
            0      13     1    p1   Ljava/lang/Object;
            0      13     2    p2   Ljava/lang/Object;
}
InnerClasses:
  static final #249;                      // class ext/mods/gameserver/geoengine/GeoEngine$2
  static final #2;                        // class ext/mods/gameserver/geoengine/GeoEngine$2$jobs$1$1
EnclosingMethod: #249.#225              // ext.mods.gameserver.geoengine.GeoEngine$2.invokeSuspend
Signature: #3                           // Lkotlin/coroutines/jvm/internal/SuspendLambda;Lkotlin/jvm/functions/Function2<Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Lkotlin/Pair<+Ljava/lang/Integer;+Ljava/lang/Integer;>;>;Ljava/lang/Object;>;
SourceFile: "GeoEngine.kt"
RuntimeVisibleAnnotations:
  0: #45(#46=s#47,#48=[I#49],#50=[I#51],#52=[I#53,I#53,I#53,I#53,I#53],#54=[s#37,s#38,s#41,s#39,s#40],#55=[s#48,s#46,s#56,s#57,s#58],#59=s#35,#60=s#61,#62=I#63)
    kotlin.coroutines.jvm.internal.DebugMetadata(
      f="GeoEngine.kt"
      l=[98]
      nl=[100]
      i=[0,0,0,0,0]
      s=["I$0","I$1","J$0","I$2","I$3"]
      n=["l","f","start","rx","ry"]
      m="invokeSuspend"
      c="ext.mods.gameserver.geoengine.GeoEngine$2$jobs$1$1"
      v=2
    )
  1: #236(#237=[I#63,I#238,I#53],#239=I#238,#240=I#241,#242=[s#243],#244=[s#245,s#246,s#247,s#228])
    kotlin.Metadata(
      mv=[2,3,0]
      k=3
      xi=48
      d1=["\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"]
      d2=["<anonymous>","Lkotlin/Pair;","","Lkotlinx/coroutines/CoroutineScope;"]
    )
BootstrapMethods:
  0: #124 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #117 \u0001_\u0001
  1: #124 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #174 Erro na regiao \u0001_\u0001
  2: #124 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #185  -> Lote #\u0001 finalizado: \u0001 carregados em \u0001ms
