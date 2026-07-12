// Bytecode for: ext.mods.gameserver.geoengine.GeoEngine$2
// File: ext\mods\gameserver\geoengine\GeoEngine$2.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/GeoEngine$2.class
  Last modified 9 de jul de 2026; size 9412 bytes
  MD5 checksum f0ab778ac62758ef2f2680555553f2a7
  Compiled from "GeoEngine.kt"
final class ext.mods.gameserver.geoengine.GeoEngine$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Pair<? extends java.lang.Integer, ? extends java.lang.Integer>>, java.lang.Object>
  minor version: 0
  major version: 69
  flags: (0x0030) ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/GeoEngine$2
  super_class: #5                         // kotlin/coroutines/jvm/internal/SuspendLambda
  interfaces: 1, fields: 9, methods: 5, attributes: 8
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/GeoEngine$2
    #2 = Class              #1            // ext/mods/gameserver/geoengine/GeoEngine$2
    #3 = Utf8               Lkotlin/coroutines/jvm/internal/SuspendLambda;Lkotlin/jvm/functions/Function2<Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Lkotlin/Pair<+Ljava/lang/Integer;+Ljava/lang/Integer;>;>;Ljava/lang/Object;>;
    #4 = Utf8               kotlin/coroutines/jvm/internal/SuspendLambda
    #5 = Class              #4            // kotlin/coroutines/jvm/internal/SuspendLambda
    #6 = Utf8               kotlin/jvm/functions/Function2
    #7 = Class              #6            // kotlin/jvm/functions/Function2
    #8 = Utf8               <init>
    #9 = Utf8               (ILext/mods/commons/config/ExProperties;Lext/mods/gameserver/geoengine/GeoEngine;Lkotlin/coroutines/Continuation;)V
   #10 = Utf8               (ILext/mods/commons/config/ExProperties;Lext/mods/gameserver/geoengine/GeoEngine;Lkotlin/coroutines/Continuation<-Lext/mods/gameserver/geoengine/GeoEngine$2;>;)V
   #11 = Utf8               $parallelism
   #12 = Utf8               I
   #13 = NameAndType        #11:#12       // $parallelism:I
   #14 = Fieldref           #2.#13        // ext/mods/gameserver/geoengine/GeoEngine$2.$parallelism:I
   #15 = Utf8               $props
   #16 = Utf8               Lext/mods/commons/config/ExProperties;
   #17 = NameAndType        #15:#16       // $props:Lext/mods/commons/config/ExProperties;
   #18 = Fieldref           #2.#17        // ext/mods/gameserver/geoengine/GeoEngine$2.$props:Lext/mods/commons/config/ExProperties;
   #19 = Utf8               this$0
   #20 = Utf8               Lext/mods/gameserver/geoengine/GeoEngine;
   #21 = NameAndType        #19:#20       // this$0:Lext/mods/gameserver/geoengine/GeoEngine;
   #22 = Fieldref           #2.#21        // ext/mods/gameserver/geoengine/GeoEngine$2.this$0:Lext/mods/gameserver/geoengine/GeoEngine;
   #23 = Utf8               (ILkotlin/coroutines/Continuation;)V
   #24 = NameAndType        #8:#23        // "<init>":(ILkotlin/coroutines/Continuation;)V
   #25 = Methodref          #5.#24        // kotlin/coroutines/jvm/internal/SuspendLambda."<init>":(ILkotlin/coroutines/Continuation;)V
   #26 = Utf8               this
   #27 = Utf8               Lext/mods/gameserver/geoengine/GeoEngine$2;
   #28 = Utf8               $receiver
   #29 = Utf8               $completion
   #30 = Utf8               Lkotlin/coroutines/Continuation;
   #31 = Utf8               invokeSuspend
   #32 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #33 = Utf8               L$1
   #34 = Utf8               Ljava/lang/Object;
   #35 = Utf8               L$2
   #36 = Utf8               L$3
   #37 = Utf8               I$0
   #38 = Utf8               Lkotlin/coroutines/jvm/internal/DebugMetadata;
   #39 = Utf8               f
   #40 = Utf8               GeoEngine.kt
   #41 = Utf8               l
   #42 = Integer            114
   #43 = Utf8               nl
   #44 = Integer            1335
   #45 = Utf8               i
   #46 = Integer            0
   #47 = Utf8               s
   #48 = Utf8               L$0
   #49 = Utf8               n
   #50 = Utf8               $this$runBlocking
   #51 = Utf8               allRegions
   #52 = Utf8               batches
   #53 = Utf8               jobs
   #54 = Utf8               batchSize
   #55 = Utf8               m
   #56 = Utf8               c
   #57 = Utf8               ext.mods.gameserver.geoengine.GeoEngine$2
   #58 = Utf8               v
   #59 = Integer            2
   #60 = NameAndType        #48:#34       // L$0:Ljava/lang/Object;
   #61 = Fieldref           #2.#60        // ext/mods/gameserver/geoengine/GeoEngine$2.L$0:Ljava/lang/Object;
   #62 = Utf8               kotlinx/coroutines/CoroutineScope
   #63 = Class              #62           // kotlinx/coroutines/CoroutineScope
   #64 = Utf8               kotlin/coroutines/intrinsics/IntrinsicsKt
   #65 = Class              #64           // kotlin/coroutines/intrinsics/IntrinsicsKt
   #66 = Utf8               getCOROUTINE_SUSPENDED
   #67 = Utf8               ()Ljava/lang/Object;
   #68 = NameAndType        #66:#67       // getCOROUTINE_SUSPENDED:()Ljava/lang/Object;
   #69 = Methodref          #65.#68       // kotlin/coroutines/intrinsics/IntrinsicsKt.getCOROUTINE_SUSPENDED:()Ljava/lang/Object;
   #70 = Utf8               label
   #71 = NameAndType        #70:#12       // label:I
   #72 = Fieldref           #2.#71        // ext/mods/gameserver/geoengine/GeoEngine$2.label:I
   #73 = Utf8               kotlin/ResultKt
   #74 = Class              #73           // kotlin/ResultKt
   #75 = Utf8               throwOnFailure
   #76 = Utf8               (Ljava/lang/Object;)V
   #77 = NameAndType        #75:#76       // throwOnFailure:(Ljava/lang/Object;)V
   #78 = Methodref          #74.#77       // kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
   #79 = Utf8               kotlin/ranges/IntRange
   #80 = Class              #79           // kotlin/ranges/IntRange
   #81 = Utf8               (II)V
   #82 = NameAndType        #8:#81        // "<init>":(II)V
   #83 = Methodref          #80.#82       // kotlin/ranges/IntRange."<init>":(II)V
   #84 = Utf8               java/lang/Iterable
   #85 = Class              #84           // java/lang/Iterable
   #86 = Utf8               java/util/ArrayList
   #87 = Class              #86           // java/util/ArrayList
   #88 = Utf8               ()V
   #89 = NameAndType        #8:#88        // "<init>":()V
   #90 = Methodref          #87.#89       // java/util/ArrayList."<init>":()V
   #91 = Utf8               java/util/Collection
   #92 = Class              #91           // java/util/Collection
   #93 = Utf8               iterator
   #94 = Utf8               ()Ljava/util/Iterator;
   #95 = NameAndType        #93:#94       // iterator:()Ljava/util/Iterator;
   #96 = InterfaceMethodref #85.#95       // java/lang/Iterable.iterator:()Ljava/util/Iterator;
   #97 = Utf8               java/util/Iterator
   #98 = Class              #97           // java/util/Iterator
   #99 = Utf8               hasNext
  #100 = Utf8               ()Z
  #101 = NameAndType        #99:#100      // hasNext:()Z
  #102 = InterfaceMethodref #98.#101      // java/util/Iterator.hasNext:()Z
  #103 = Utf8               kotlin/collections/IntIterator
  #104 = Class              #103          // kotlin/collections/IntIterator
  #105 = Utf8               nextInt
  #106 = Utf8               ()I
  #107 = NameAndType        #105:#106     // nextInt:()I
  #108 = Methodref          #104.#107     // kotlin/collections/IntIterator.nextInt:()I
  #109 = Utf8               kotlin/collections/CollectionsKt
  #110 = Class              #109          // kotlin/collections/CollectionsKt
  #111 = Utf8               collectionSizeOrDefault
  #112 = Utf8               (Ljava/lang/Iterable;I)I
  #113 = NameAndType        #111:#112     // collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
  #114 = Methodref          #110.#113     // kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
  #115 = Utf8               (I)V
  #116 = NameAndType        #8:#115       // "<init>":(I)V
  #117 = Methodref          #87.#116      // java/util/ArrayList."<init>":(I)V
  #118 = Utf8               kotlin/coroutines/jvm/internal/Boxing
  #119 = Class              #118          // kotlin/coroutines/jvm/internal/Boxing
  #120 = Utf8               boxInt
  #121 = Utf8               (I)Ljava/lang/Integer;
  #122 = NameAndType        #120:#121     // boxInt:(I)Ljava/lang/Integer;
  #123 = Methodref          #119.#122     // kotlin/coroutines/jvm/internal/Boxing.boxInt:(I)Ljava/lang/Integer;
  #124 = Utf8               kotlin/TuplesKt
  #125 = Class              #124          // kotlin/TuplesKt
  #126 = Utf8               to
  #127 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
  #128 = NameAndType        #126:#127     // to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
  #129 = Methodref          #125.#128     // kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
  #130 = Utf8               add
  #131 = Utf8               (Ljava/lang/Object;)Z
  #132 = NameAndType        #130:#131     // add:(Ljava/lang/Object;)Z
  #133 = InterfaceMethodref #92.#132      // java/util/Collection.add:(Ljava/lang/Object;)Z
  #134 = Utf8               java/util/List
  #135 = Class              #134          // java/util/List
  #136 = Utf8               addAll
  #137 = Utf8               (Ljava/util/Collection;Ljava/lang/Iterable;)Z
  #138 = NameAndType        #136:#137     // addAll:(Ljava/util/Collection;Ljava/lang/Iterable;)Z
  #139 = Methodref          #110.#138     // kotlin/collections/CollectionsKt.addAll:(Ljava/util/Collection;Ljava/lang/Iterable;)Z
  #140 = Utf8               size
  #141 = NameAndType        #140:#106     // size:()I
  #142 = InterfaceMethodref #135.#141     // java/util/List.size:()I
  #143 = Utf8               chunked
  #144 = Utf8               (Ljava/lang/Iterable;I)Ljava/util/List;
  #145 = NameAndType        #143:#144     // chunked:(Ljava/lang/Iterable;I)Ljava/util/List;
  #146 = Methodref          #110.#145     // kotlin/collections/CollectionsKt.chunked:(Ljava/lang/Iterable;I)Ljava/util/List;
  #147 = Utf8               ext/mods/gameserver/geoengine/GeoEngine
  #148 = Class              #147          // ext/mods/gameserver/geoengine/GeoEngine
  #149 = Utf8               access$getLOGGER$cp
  #150 = Utf8               ()Lext/mods/commons/logging/CLogger;
  #151 = NameAndType        #149:#150     // access$getLOGGER$cp:()Lext/mods/commons/logging/CLogger;
  #152 = Methodref          #148.#151     // ext/mods/gameserver/geoengine/GeoEngine.access$getLOGGER$cp:()Lext/mods/commons/logging/CLogger;
  #153 = Utf8                Processando \u0001 regioes em \u0001 lotes simultaneos...
  #154 = String             #153          //  Processando \u0001 regioes em \u0001 lotes simultaneos...
  #155 = Utf8               java/lang/invoke/StringConcatFactory
  #156 = Class              #155          // java/lang/invoke/StringConcatFactory
  #157 = Utf8               makeConcatWithConstants
  #158 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #159 = NameAndType        #157:#158     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #160 = Methodref          #156.#159     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #161 = MethodHandle       6:#160        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #162 = Utf8               (II)Ljava/lang/String;
  #163 = NameAndType        #157:#162     // makeConcatWithConstants:(II)Ljava/lang/String;
  #164 = InvokeDynamic      #0:#163       // #0:makeConcatWithConstants:(II)Ljava/lang/String;
  #165 = Utf8               ext/mods/commons/logging/CLogger
  #166 = Class              #165          // ext/mods/commons/logging/CLogger
  #167 = Utf8               info
  #168 = NameAndType        #167:#76      // info:(Ljava/lang/Object;)V
  #169 = Methodref          #166.#168     // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
  #170 = Utf8               next
  #171 = NameAndType        #170:#67      // next:()Ljava/lang/Object;
  #172 = InterfaceMethodref #98.#171      // java/util/Iterator.next:()Ljava/lang/Object;
  #173 = Utf8               throwIndexOverflow
  #174 = NameAndType        #173:#88      // throwIndexOverflow:()V
  #175 = Methodref          #110.#174     // kotlin/collections/CollectionsKt.throwIndexOverflow:()V
  #176 = Utf8               kotlinx/coroutines/Dispatchers
  #177 = Class              #176          // kotlinx/coroutines/Dispatchers
  #178 = Utf8               getIO
  #179 = Utf8               ()Lkotlinx/coroutines/CoroutineDispatcher;
  #180 = NameAndType        #178:#179     // getIO:()Lkotlinx/coroutines/CoroutineDispatcher;
  #181 = Methodref          #177.#180     // kotlinx/coroutines/Dispatchers.getIO:()Lkotlinx/coroutines/CoroutineDispatcher;
  #182 = Utf8               kotlin/coroutines/CoroutineContext
  #183 = Class              #182          // kotlin/coroutines/CoroutineContext
  #184 = Utf8               ext/mods/gameserver/geoengine/GeoEngine$2$jobs$1$1
  #185 = Class              #184          // ext/mods/gameserver/geoengine/GeoEngine$2$jobs$1$1
  #186 = Utf8               (Ljava/util/List;Lext/mods/commons/config/ExProperties;Lext/mods/gameserver/geoengine/GeoEngine;ILkotlin/coroutines/Continuation;)V
  #187 = NameAndType        #8:#186       // "<init>":(Ljava/util/List;Lext/mods/commons/config/ExProperties;Lext/mods/gameserver/geoengine/GeoEngine;ILkotlin/coroutines/Continuation;)V
  #188 = Methodref          #185.#187     // ext/mods/gameserver/geoengine/GeoEngine$2$jobs$1$1."<init>":(Ljava/util/List;Lext/mods/commons/config/ExProperties;Lext/mods/gameserver/geoengine/GeoEngine;ILkotlin/coroutines/Continuation;)V
  #189 = Utf8               kotlinx/coroutines/BuildersKt
  #190 = Class              #189          // kotlinx/coroutines/BuildersKt
  #191 = Utf8               async$default
  #192 = Utf8               (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Deferred;
  #193 = NameAndType        #191:#192     // async$default:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Deferred;
  #194 = Methodref          #190.#193     // kotlinx/coroutines/BuildersKt.async$default:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Deferred;
  #195 = Utf8               kotlin/coroutines/Continuation
  #196 = Class              #195          // kotlin/coroutines/Continuation
  #197 = Utf8               kotlin/coroutines/jvm/internal/SpillingKt
  #198 = Class              #197          // kotlin/coroutines/jvm/internal/SpillingKt
  #199 = Utf8               nullOutSpilledVariable
  #200 = NameAndType        #199:#32      // nullOutSpilledVariable:(Ljava/lang/Object;)Ljava/lang/Object;
  #201 = Methodref          #198.#200     // kotlin/coroutines/jvm/internal/SpillingKt.nullOutSpilledVariable:(Ljava/lang/Object;)Ljava/lang/Object;
  #202 = NameAndType        #33:#34       // L$1:Ljava/lang/Object;
  #203 = Fieldref           #2.#202       // ext/mods/gameserver/geoengine/GeoEngine$2.L$1:Ljava/lang/Object;
  #204 = NameAndType        #35:#34       // L$2:Ljava/lang/Object;
  #205 = Fieldref           #2.#204       // ext/mods/gameserver/geoengine/GeoEngine$2.L$2:Ljava/lang/Object;
  #206 = NameAndType        #36:#34       // L$3:Ljava/lang/Object;
  #207 = Fieldref           #2.#206       // ext/mods/gameserver/geoengine/GeoEngine$2.L$3:Ljava/lang/Object;
  #208 = NameAndType        #37:#12       // I$0:I
  #209 = Fieldref           #2.#208       // ext/mods/gameserver/geoengine/GeoEngine$2.I$0:I
  #210 = Utf8               kotlinx/coroutines/AwaitKt
  #211 = Class              #210          // kotlinx/coroutines/AwaitKt
  #212 = Utf8               awaitAll
  #213 = Utf8               (Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #214 = NameAndType        #212:#213     // awaitAll:(Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #215 = Methodref          #211.#214     // kotlinx/coroutines/AwaitKt.awaitAll:(Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #216 = Utf8               kotlin/Pair
  #217 = Class              #216          // kotlin/Pair
  #218 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)V
  #219 = NameAndType        #8:#218       // "<init>":(Ljava/lang/Object;Ljava/lang/Object;)V
  #220 = Methodref          #217.#219     // kotlin/Pair."<init>":(Ljava/lang/Object;Ljava/lang/Object;)V
  #221 = Utf8               getFirst
  #222 = NameAndType        #221:#67      // getFirst:()Ljava/lang/Object;
  #223 = Methodref          #217.#222     // kotlin/Pair.getFirst:()Ljava/lang/Object;
  #224 = Utf8               java/lang/Number
  #225 = Class              #224          // java/lang/Number
  #226 = Utf8               intValue
  #227 = NameAndType        #226:#106     // intValue:()I
  #228 = Methodref          #225.#227     // java/lang/Number.intValue:()I
  #229 = Utf8               getSecond
  #230 = NameAndType        #229:#67      // getSecond:()Ljava/lang/Object;
  #231 = Methodref          #217.#230     // kotlin/Pair.getSecond:()Ljava/lang/Object;
  #232 = Utf8               java/lang/IllegalStateException
  #233 = Class              #232          // java/lang/IllegalStateException
  #234 = Utf8               call to \'resume\' before \'invoke\' with coroutine
  #235 = String             #234          // call to \'resume\' before \'invoke\' with coroutine
  #236 = Utf8               (Ljava/lang/String;)V
  #237 = NameAndType        #8:#236       // "<init>":(Ljava/lang/String;)V
  #238 = Methodref          #233.#237     // java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
  #239 = Utf8               $i$a$-map-GeoEngine$2$allRegions$1$1
  #240 = Utf8               ry
  #241 = Utf8               item$iv$iv
  #242 = Utf8               $i$f$mapTo
  #243 = Utf8               $this$mapTo$iv$iv
  #244 = Utf8               Ljava/lang/Iterable;
  #245 = Utf8               destination$iv$iv
  #246 = Utf8               Ljava/util/Collection;
  #247 = Utf8               $i$f$map
  #248 = Utf8               $this$map$iv
  #249 = Utf8               $i$a$-flatMap-GeoEngine$2$allRegions$1
  #250 = Utf8               rx
  #251 = Utf8               list$iv$iv
  #252 = Utf8               element$iv$iv
  #253 = Utf8               $i$f$flatMapTo
  #254 = Utf8               $this$flatMapTo$iv$iv
  #255 = Utf8               $i$f$flatMap
  #256 = Utf8               $this$flatMap$iv
  #257 = Utf8               $i$a$-mapIndexed-GeoEngine$2$jobs$1
  #258 = Utf8               index
  #259 = Utf8               batch
  #260 = Utf8               Ljava/util/List;
  #261 = Utf8               $i$f$mapIndexedTo
  #262 = Utf8               index$iv$iv
  #263 = Utf8               $this$mapIndexedTo$iv$iv
  #264 = Utf8               $i$f$mapIndexed
  #265 = Utf8               $this$mapIndexed$iv
  #266 = Utf8               $i$a$-fold-GeoEngine$2$1
  #267 = Utf8               acc
  #268 = Utf8               Lkotlin/Pair;
  #269 = Utf8               pair
  #270 = Utf8               element$iv
  #271 = Utf8               $i$f$fold
  #272 = Utf8               accumulator$iv
  #273 = Utf8               $this$fold$iv
  #274 = Utf8               initial$iv
  #275 = Utf8               $result
  #276 = Utf8               Lkotlinx/coroutines/CoroutineScope;
  #277 = Utf8               java/lang/Object
  #278 = Class              #277          // java/lang/Object
  #279 = Utf8               ext/mods/commons/config/ExProperties
  #280 = Class              #279          // ext/mods/commons/config/ExProperties
  #281 = Utf8               create
  #282 = Utf8               (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
  #283 = Utf8               (Ljava/lang/Object;Lkotlin/coroutines/Continuation<*>;)Lkotlin/coroutines/Continuation<Lkotlin/Unit;>;
  #284 = NameAndType        #8:#9         // "<init>":(ILext/mods/commons/config/ExProperties;Lext/mods/gameserver/geoengine/GeoEngine;Lkotlin/coroutines/Continuation;)V
  #285 = Methodref          #2.#284       // ext/mods/gameserver/geoengine/GeoEngine$2."<init>":(ILext/mods/commons/config/ExProperties;Lext/mods/gameserver/geoengine/GeoEngine;Lkotlin/coroutines/Continuation;)V
  #286 = Utf8               value
  #287 = Utf8               invoke
  #288 = Utf8               (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #289 = Utf8               (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Lkotlin/Pair<Ljava/lang/Integer;Ljava/lang/Integer;>;>;)Ljava/lang/Object;
  #290 = NameAndType        #281:#282     // create:(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
  #291 = Methodref          #2.#290       // ext/mods/gameserver/geoengine/GeoEngine$2.create:(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
  #292 = Utf8               kotlin/Unit
  #293 = Class              #292          // kotlin/Unit
  #294 = Utf8               INSTANCE
  #295 = Utf8               Lkotlin/Unit;
  #296 = NameAndType        #294:#295     // INSTANCE:Lkotlin/Unit;
  #297 = Fieldref           #293.#296     // kotlin/Unit.INSTANCE:Lkotlin/Unit;
  #298 = NameAndType        #31:#32       // invokeSuspend:(Ljava/lang/Object;)Ljava/lang/Object;
  #299 = Methodref          #2.#298       // ext/mods/gameserver/geoengine/GeoEngine$2.invokeSuspend:(Ljava/lang/Object;)Ljava/lang/Object;
  #300 = Utf8               p1
  #301 = Utf8               p2
  #302 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #303 = NameAndType        #287:#288     // invoke:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #304 = Methodref          #2.#303       // ext/mods/gameserver/geoengine/GeoEngine$2.invoke:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #305 = Utf8               Lkotlin/Metadata;
  #306 = Utf8               mv
  #307 = Integer            3
  #308 = Utf8               k
  #309 = Utf8               xi
  #310 = Integer            48
  #311 = Utf8               d1
  #312 = Utf8               \u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n
  #313 = Utf8               d2
  #314 = Utf8               <anonymous>
  #315 = Utf8
  #316 = Utf8               Lkotlin/jvm/internal/SourceDebugExtension;
  #317 = Utf8               SMAP\nGeoEngine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GeoEngine.kt\next/mods/gameserver/geoengine/GeoEngine$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1319:1\n1391#2:1320\n1480#2,2:1321\n1586#2:1323\n1661#2,3:1324\n1482#2,3:1327\n1596#2:1330\n1629#2,4:1331\n1849#2,3:1335\n*S KotlinDebug\n*F\n+ 1 GeoEngine.kt\next/mods/gameserver/geoengine/GeoEngine$2\n*L\n82#1:1320\n82#1:1321,2\n83#1:1323\n83#1:1324,3\n82#1:1327,3\n90#1:1330\n90#1:1331,4\n114#1:1335,3\n*E\n
  #318 = Utf8               Code
  #319 = Utf8               LocalVariableTable
  #320 = Utf8               Signature
  #321 = Utf8               StackMapTable
  #322 = Utf8               LineNumberTable
  #323 = Utf8               InnerClasses
  #324 = Utf8               EnclosingMethod
  #325 = Utf8               SourceFile
  #326 = Utf8               SourceDebugExtension
  #327 = Utf8               RuntimeVisibleAnnotations
  #328 = Utf8               RuntimeInvisibleAnnotations
  #329 = Utf8               BootstrapMethods
{
  java.lang.Object L$1;
    descriptor: Ljava/lang/Object;
    flags: (0x0000)

  java.lang.Object L$2;
    descriptor: Ljava/lang/Object;
    flags: (0x0000)

  java.lang.Object L$3;
    descriptor: Ljava/lang/Object;
    flags: (0x0000)

  int I$0;
    descriptor: I
    flags: (0x0000)

  int label;
    descriptor: I
    flags: (0x0000)

  final int $parallelism;
    descriptor: I
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  final ext.mods.commons.config.ExProperties $props;
    descriptor: Lext/mods/commons/config/ExProperties;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  final ext.mods.gameserver.geoengine.GeoEngine this$0;
    descriptor: Lext/mods/gameserver/geoengine/GeoEngine;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  ext.mods.gameserver.geoengine.GeoEngine$2(int, ext.mods.commons.config.ExProperties, ext.mods.gameserver.geoengine.GeoEngine, kotlin.coroutines.Continuation<? super ext.mods.gameserver.geoengine.GeoEngine$2>);
    descriptor: (ILext/mods/commons/config/ExProperties;Lext/mods/gameserver/geoengine/GeoEngine;Lkotlin/coroutines/Continuation;)V
    flags: (0x0000)
    Code:
      stack=3, locals=5, args_size=5
         0: aload_0
         1: iload_1
         2: putfield      #14                 // Field $parallelism:I
         5: aload_0
         6: aload_2
         7: putfield      #18                 // Field $props:Lext/mods/commons/config/ExProperties;
        10: aload_0
        11: aload_3
        12: putfield      #22                 // Field this$0:Lext/mods/gameserver/geoengine/GeoEngine;
        15: aload_0
        16: iconst_2
        17: aload         4
        19: invokespecial #25                 // Method kotlin/coroutines/jvm/internal/SuspendLambda."<init>":(ILkotlin/coroutines/Continuation;)V
        22: return
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/geoengine/GeoEngine$2;
            0      23     1 $parallelism   I
            0      23     2 $props   Lext/mods/commons/config/ExProperties;
            0      23     3 $receiver   Lext/mods/gameserver/geoengine/GeoEngine;
            0      23     4 $completion   Lkotlin/coroutines/Continuation;
    Signature: #10                          // (ILext/mods/commons/config/ExProperties;Lext/mods/gameserver/geoengine/GeoEngine;Lkotlin/coroutines/Continuation<-Lext/mods/gameserver/geoengine/GeoEngine$2;>;)V

  public final java.lang.Object invokeSuspend(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Ljava/lang/Object;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=10, locals=25, args_size=2
         0: aload_0
         1: getfield      #61                 // Field L$0:Ljava/lang/Object;
         4: checkcast     #63                 // class kotlinx/coroutines/CoroutineScope
         7: astore_2
         8: invokestatic  #69                 // Method kotlin/coroutines/intrinsics/IntrinsicsKt.getCOROUTINE_SUSPENDED:()Ljava/lang/Object;
        11: astore        24
        13: aload_0
        14: getfield      #72                 // Field label:I
        17: tableswitch   { // 0 to 1

                       0: 40

                       1: 539
                 default: 714
            }
        40: aload_1
        41: invokestatic  #78                 // Method kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
        44: new           #80                 // class kotlin/ranges/IntRange
        47: dup
        48: bipush        16
        50: bipush        26
        52: invokespecial #83                 // Method kotlin/ranges/IntRange."<init>":(II)V
        55: checkcast     #85                 // class java/lang/Iterable
        58: astore        4
        60: iconst_0
        61: istore        5
        63: aload         4
        65: astore        6
        67: new           #87                 // class java/util/ArrayList
        70: dup
        71: invokespecial #90                 // Method java/util/ArrayList."<init>":()V
        74: checkcast     #92                 // class java/util/Collection
        77: astore        7
        79: iconst_0
        80: istore        8
        82: aload         6
        84: invokeinterface #96,  1           // InterfaceMethod java/lang/Iterable.iterator:()Ljava/util/Iterator;
        89: astore        9
        91: aload         9
        93: invokeinterface #102,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        98: ifeq          251
       101: aload         9
       103: checkcast     #104                // class kotlin/collections/IntIterator
       106: invokevirtual #108                // Method kotlin/collections/IntIterator.nextInt:()I
       109: istore        10
       111: iload         10
       113: istore        11
       115: iconst_0
       116: istore        12
       118: new           #80                 // class kotlin/ranges/IntRange
       121: dup
       122: bipush        10
       124: bipush        25
       126: invokespecial #83                 // Method kotlin/ranges/IntRange."<init>":(II)V
       129: checkcast     #85                 // class java/lang/Iterable
       132: astore        13
       134: iconst_0
       135: istore        14
       137: aload         13
       139: astore        15
       141: new           #87                 // class java/util/ArrayList
       144: dup
       145: aload         13
       147: bipush        10
       149: invokestatic  #114                // Method kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
       152: invokespecial #117                // Method java/util/ArrayList."<init>":(I)V
       155: checkcast     #92                 // class java/util/Collection
       158: astore        16
       160: iconst_0
       161: istore        17
       163: aload         15
       165: invokeinterface #96,  1           // InterfaceMethod java/lang/Iterable.iterator:()Ljava/util/Iterator;
       170: astore        18
       172: aload         18
       174: invokeinterface #102,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       179: ifeq          228
       182: aload         18
       184: checkcast     #104                // class kotlin/collections/IntIterator
       187: invokevirtual #108                // Method kotlin/collections/IntIterator.nextInt:()I
       190: istore        19
       192: aload         16
       194: iload         19
       196: istore        20
       198: astore        21
       200: iconst_0
       201: istore        22
       203: iload         11
       205: invokestatic  #123                // Method kotlin/coroutines/jvm/internal/Boxing.boxInt:(I)Ljava/lang/Integer;
       208: iload         20
       210: invokestatic  #123                // Method kotlin/coroutines/jvm/internal/Boxing.boxInt:(I)Ljava/lang/Integer;
       213: invokestatic  #129                // Method kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
       216: aload         21
       218: swap
       219: invokeinterface #133,  2          // InterfaceMethod java/util/Collection.add:(Ljava/lang/Object;)Z
       224: pop
       225: goto          172
       228: aload         16
       230: checkcast     #135                // class java/util/List
       233: nop
       234: checkcast     #85                 // class java/lang/Iterable
       237: nop
       238: astore        11
       240: aload         7
       242: aload         11
       244: invokestatic  #139                // Method kotlin/collections/CollectionsKt.addAll:(Ljava/util/Collection;Ljava/lang/Iterable;)Z
       247: pop
       248: goto          91
       251: aload         7
       253: checkcast     #135                // class java/util/List
       256: nop
       257: astore_3
       258: aload_3
       259: invokeinterface #142,  1          // InterfaceMethod java/util/List.size:()I
       264: aload_0
       265: getfield      #14                 // Field $parallelism:I
       268: idiv
       269: iconst_1
       270: iadd
       271: istore        4
       273: aload_3
       274: checkcast     #85                 // class java/lang/Iterable
       277: iload         4
       279: invokestatic  #146                // Method kotlin/collections/CollectionsKt.chunked:(Ljava/lang/Iterable;I)Ljava/util/List;
       282: astore        5
       284: invokestatic  #152                // Method ext/mods/gameserver/geoengine/GeoEngine.access$getLOGGER$cp:()Lext/mods/commons/logging/CLogger;
       287: aload_3
       288: invokeinterface #142,  1          // InterfaceMethod java/util/List.size:()I
       293: aload         5
       295: invokeinterface #142,  1          // InterfaceMethod java/util/List.size:()I
       300: invokedynamic #164,  0            // InvokeDynamic #0:makeConcatWithConstants:(II)Ljava/lang/String;
       305: invokevirtual #169                // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
       308: aload         5
       310: checkcast     #85                 // class java/lang/Iterable
       313: astore        7
       315: aload_0
       316: getfield      #18                 // Field $props:Lext/mods/commons/config/ExProperties;
       319: astore        8
       321: aload_0
       322: getfield      #22                 // Field this$0:Lext/mods/gameserver/geoengine/GeoEngine;
       325: astore        9
       327: iconst_0
       328: istore        10
       330: aload         7
       332: astore        11
       334: new           #87                 // class java/util/ArrayList
       337: dup
       338: aload         7
       340: bipush        10
       342: invokestatic  #114                // Method kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
       345: invokespecial #117                // Method java/util/ArrayList."<init>":(I)V
       348: checkcast     #92                 // class java/util/Collection
       351: astore        12
       353: iconst_0
       354: istore        13
       356: iconst_0
       357: istore        14
       359: aload         11
       361: invokeinterface #96,  1           // InterfaceMethod java/lang/Iterable.iterator:()Ljava/util/Iterator;
       366: astore        15
       368: aload         15
       370: invokeinterface #102,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       375: ifeq          465
       378: aload         15
       380: invokeinterface #172,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       385: astore        16
       387: aload         12
       389: iload         14
       391: iinc          14, 1
       394: istore        17
       396: iload         17
       398: ifge          404
       401: invokestatic  #175                // Method kotlin/collections/CollectionsKt.throwIndexOverflow:()V
       404: iload         17
       406: aload         16
       408: checkcast     #135                // class java/util/List
       411: astore        18
       413: istore        19
       415: astore        23
       417: iconst_0
       418: istore        20
       420: aload_2
       421: invokestatic  #181                // Method kotlinx/coroutines/Dispatchers.getIO:()Lkotlinx/coroutines/CoroutineDispatcher;
       424: checkcast     #183                // class kotlin/coroutines/CoroutineContext
       427: aconst_null
       428: new           #185                // class ext/mods/gameserver/geoengine/GeoEngine$2$jobs$1$1
       431: dup
       432: aload         18
       434: aload         8
       436: aload         9
       438: iload         19
       440: aconst_null
       441: invokespecial #188                // Method ext/mods/gameserver/geoengine/GeoEngine$2$jobs$1$1."<init>":(Ljava/util/List;Lext/mods/commons/config/ExProperties;Lext/mods/gameserver/geoengine/GeoEngine;ILkotlin/coroutines/Continuation;)V
       444: checkcast     #7                  // class kotlin/jvm/functions/Function2
       447: iconst_2
       448: aconst_null
       449: invokestatic  #194                // Method kotlinx/coroutines/BuildersKt.async$default:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Deferred;
       452: nop
       453: aload         23
       455: swap
       456: invokeinterface #133,  2          // InterfaceMethod java/util/Collection.add:(Ljava/lang/Object;)Z
       461: pop
       462: goto          368
       465: aload         12
       467: checkcast     #135                // class java/util/List
       470: nop
       471: astore        6
       473: aload         6
       475: checkcast     #92                 // class java/util/Collection
       478: aload_0
       479: checkcast     #196                // class kotlin/coroutines/Continuation
       482: aload_0
       483: aload_2
       484: invokestatic  #201                // Method kotlin/coroutines/jvm/internal/SpillingKt.nullOutSpilledVariable:(Ljava/lang/Object;)Ljava/lang/Object;
       487: putfield      #61                 // Field L$0:Ljava/lang/Object;
       490: aload_0
       491: aload_3
       492: invokestatic  #201                // Method kotlin/coroutines/jvm/internal/SpillingKt.nullOutSpilledVariable:(Ljava/lang/Object;)Ljava/lang/Object;
       495: putfield      #203                // Field L$1:Ljava/lang/Object;
       498: aload_0
       499: aload         5
       501: invokestatic  #201                // Method kotlin/coroutines/jvm/internal/SpillingKt.nullOutSpilledVariable:(Ljava/lang/Object;)Ljava/lang/Object;
       504: putfield      #205                // Field L$2:Ljava/lang/Object;
       507: aload_0
       508: aload         6
       510: invokestatic  #201                // Method kotlin/coroutines/jvm/internal/SpillingKt.nullOutSpilledVariable:(Ljava/lang/Object;)Ljava/lang/Object;
       513: putfield      #207                // Field L$3:Ljava/lang/Object;
       516: aload_0
       517: iload         4
       519: putfield      #209                // Field I$0:I
       522: aload_0
       523: iconst_1
       524: putfield      #72                 // Field label:I
       527: invokestatic  #215                // Method kotlinx/coroutines/AwaitKt.awaitAll:(Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
       530: dup
       531: aload         24
       533: if_acmpne     576
       536: aload         24
       538: areturn
       539: aload_0
       540: getfield      #209                // Field I$0:I
       543: istore        4
       545: aload_0
       546: getfield      #207                // Field L$3:Ljava/lang/Object;
       549: checkcast     #135                // class java/util/List
       552: astore        6
       554: aload_0
       555: getfield      #205                // Field L$2:Ljava/lang/Object;
       558: checkcast     #135                // class java/util/List
       561: astore        5
       563: aload_0
       564: getfield      #203                // Field L$1:Ljava/lang/Object;
       567: checkcast     #135                // class java/util/List
       570: astore_3
       571: aload_1
       572: invokestatic  #78                 // Method kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
       575: aload_1
       576: checkcast     #85                 // class java/lang/Iterable
       579: astore        7
       581: new           #217                // class kotlin/Pair
       584: dup
       585: iconst_0
       586: invokestatic  #123                // Method kotlin/coroutines/jvm/internal/Boxing.boxInt:(I)Ljava/lang/Integer;
       589: iconst_0
       590: invokestatic  #123                // Method kotlin/coroutines/jvm/internal/Boxing.boxInt:(I)Ljava/lang/Integer;
       593: invokespecial #220                // Method kotlin/Pair."<init>":(Ljava/lang/Object;Ljava/lang/Object;)V
       596: astore        8
       598: iconst_0
       599: istore        9
       601: aload         8
       603: astore        10
       605: aload         7
       607: invokeinterface #96,  1           // InterfaceMethod java/lang/Iterable.iterator:()Ljava/util/Iterator;
       612: astore        11
       614: aload         11
       616: invokeinterface #102,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       621: ifeq          711
       624: aload         11
       626: invokeinterface #172,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       631: astore        12
       633: aload         10
       635: aload         12
       637: checkcast     #217                // class kotlin/Pair
       640: astore        13
       642: astore        14
       644: iconst_0
       645: istore        15
       647: new           #217                // class kotlin/Pair
       650: dup
       651: aload         14
       653: invokevirtual #223                // Method kotlin/Pair.getFirst:()Ljava/lang/Object;
       656: checkcast     #225                // class java/lang/Number
       659: invokevirtual #228                // Method java/lang/Number.intValue:()I
       662: aload         13
       664: invokevirtual #223                // Method kotlin/Pair.getFirst:()Ljava/lang/Object;
       667: checkcast     #225                // class java/lang/Number
       670: invokevirtual #228                // Method java/lang/Number.intValue:()I
       673: iadd
       674: invokestatic  #123                // Method kotlin/coroutines/jvm/internal/Boxing.boxInt:(I)Ljava/lang/Integer;
       677: aload         14
       679: invokevirtual #231                // Method kotlin/Pair.getSecond:()Ljava/lang/Object;
       682: checkcast     #225                // class java/lang/Number
       685: invokevirtual #228                // Method java/lang/Number.intValue:()I
       688: aload         13
       690: invokevirtual #231                // Method kotlin/Pair.getSecond:()Ljava/lang/Object;
       693: checkcast     #225                // class java/lang/Number
       696: invokevirtual #228                // Method java/lang/Number.intValue:()I
       699: iadd
       700: invokestatic  #123                // Method kotlin/coroutines/jvm/internal/Boxing.boxInt:(I)Ljava/lang/Integer;
       703: invokespecial #220                // Method kotlin/Pair."<init>":(Ljava/lang/Object;Ljava/lang/Object;)V
       706: astore        10
       708: goto          614
       711: aload         10
       713: areturn
       714: new           #233                // class java/lang/IllegalStateException
       717: dup
       718: ldc           #235                // String call to \'resume\' before \'invoke\' with coroutine
       720: invokespecial #238                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
       723: athrow
      StackMapTable: number_of_entries = 13
        frame_type = 255 /* full_frame */
          offset_delta = 40
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine$2, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 50
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine$2, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, top, class java/lang/Iterable, int, class java/lang/Iterable, class java/util/Collection, int, class java/util/Iterator, top, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 80
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine$2, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, top, class java/lang/Iterable, int, class java/lang/Iterable, class java/util/Collection, int, class java/util/Iterator, int, int, int, class java/lang/Iterable, int, class java/lang/Iterable, class java/util/Collection, int, class java/util/Iterator, top, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 55 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 22
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine$2, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, top, class java/lang/Iterable, int, class java/lang/Iterable, class java/util/Collection, int, class java/util/Iterator, top, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 116
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine$2, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, class java/util/List, int, class java/util/List, class java/lang/Iterable, class java/lang/Iterable, class ext/mods/commons/config/ExProperties, class ext/mods/gameserver/geoengine/GeoEngine, int, class java/lang/Iterable, class java/util/Collection, int, int, class java/util/Iterator, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 35
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine$2, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, class java/util/List, int, class java/util/List, class java/lang/Iterable, class java/lang/Iterable, class ext/mods/commons/config/ExProperties, class ext/mods/gameserver/geoengine/GeoEngine, int, class java/lang/Iterable, class java/util/Collection, int, int, class java/util/Iterator, class java/lang/Object, int, top, top, top, top, top, top, class java/lang/Object ]
          stack = [ class java/util/Collection ]
        frame_type = 255 /* full_frame */
          offset_delta = 60
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine$2, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, class java/util/List, int, class java/util/List, class java/lang/Iterable, class java/lang/Iterable, class ext/mods/commons/config/ExProperties, class ext/mods/gameserver/geoengine/GeoEngine, int, class java/lang/Iterable, class java/util/Collection, int, int, class java/util/Iterator, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 73
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine$2, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 36
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine$2, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, class java/util/List, int, class java/util/List, class java/util/List, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = [ class java/lang/Object ]
        frame_type = 255 /* full_frame */
          offset_delta = 37
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine$2, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, class java/util/List, int, class java/util/List, class java/util/List, class java/lang/Iterable, class kotlin/Pair, int, class kotlin/Pair, class java/util/Iterator, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 251 /* same_frame_extended */
          offset_delta = 96
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/geoengine/GeoEngine$2, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = []
      LineNumberTable:
        line 81: 11
        line 82: 44
        line 1320: 63
        line 1321: 82
        line 1322: 111
        line 83: 118
        line 1323: 137
        line 1324: 163
        line 1325: 192
        line 83: 203
        line 1325: 219
        line 1326: 228
        line 1323: 233
        line 83: 237
        line 1322: 238
        line 1327: 240
        line 1329: 251
        line 1320: 256
        line 82: 257
        line 86: 258
        line 87: 273
        line 89: 284
        line 90: 308
        line 1330: 330
        line 1331: 356
        line 1332: 359
        line 1333: 387
        line 1333: 406
        line 91: 420
        line 111: 452
        line 1333: 456
        line 1334: 465
        line 1330: 470
        line 90: 471
        line 114: 473
        line 81: 536
        line 114: 576
        line 1335: 601
        line 1336: 605
        line 115: 647
        line 1336: 706
        line 1337: 711
        line 116: 713
        line 81: 714
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          203      13    22 $i$a$-map-GeoEngine$2$allRegions$1$1   I
          200      16    20    ry   I
          192      33    19 item$iv$iv   I
          163      67    17 $i$f$mapTo   I
          160      70    15 $this$mapTo$iv$iv   Ljava/lang/Iterable;
          160      70    16 destination$iv$iv   Ljava/util/Collection;
          137      97    14 $i$f$map   I
          134     100    13 $this$map$iv   Ljava/lang/Iterable;
          118     120    12 $i$a$-flatMap-GeoEngine$2$allRegions$1   I
          115     123    11    rx   I
          240       8    11 list$iv$iv   Ljava/lang/Iterable;
          111     137    10 element$iv$iv   I
           82     171     8 $i$f$flatMapTo   I
           79     174     6 $this$flatMapTo$iv$iv   Ljava/lang/Iterable;
           79     174     7 destination$iv$iv   Ljava/util/Collection;
           63     194     5 $i$f$flatMap   I
           60     197     4 $this$flatMap$iv   Ljava/lang/Iterable;
          420      33    20 $i$a$-mapIndexed-GeoEngine$2$jobs$1   I
          417      36    19 index   I
          417      36    18 batch   Ljava/util/List;
          387      75    16 item$iv$iv   Ljava/lang/Object;
          356     111    13 $i$f$mapIndexedTo   I
          359     108    14 index$iv$iv   I
          353     114    11 $this$mapIndexedTo$iv$iv   Ljava/lang/Iterable;
          353     114    12 destination$iv$iv   Ljava/util/Collection;
          330     141    10 $i$f$mapIndexed   I
          327     144     7 $this$mapIndexed$iv   Ljava/lang/Iterable;
          647      59    15 $i$a$-fold-GeoEngine$2$1   I
          644      62    14   acc   Lkotlin/Pair;
          644      62    13  pair   Lkotlin/Pair;
          633      75    12 element$iv   Ljava/lang/Object;
          601     112     9 $i$f$fold   I
          605     108    10 accumulator$iv   Ljava/lang/Object;
          598     115     7 $this$fold$iv   Ljava/lang/Iterable;
          598     115     8 initial$iv   Ljava/lang/Object;
          258     281     3 allRegions   Ljava/util/List;
          273     266     4 batchSize   I
          284     255     5 batches   Ljava/util/List;
          473      66     6  jobs   Ljava/util/List;
            0     724     0  this   Lext/mods/gameserver/geoengine/GeoEngine$2;
            0     724     1 $result   Ljava/lang/Object;
          571     143     3 allRegions   Ljava/util/List;
          563     151     5 batches   Ljava/util/List;
          554     160     6  jobs   Ljava/util/List;
          545     169     4 batchSize   I
           11     713     2 $this$runBlocking   Lkotlinx/coroutines/CoroutineScope;

  public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object, kotlin.coroutines.Continuation<?>);
    descriptor: (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=6, locals=4, args_size=3
         0: new           #2                  // class ext/mods/gameserver/geoengine/GeoEngine$2
         3: dup
         4: aload_0
         5: getfield      #14                 // Field $parallelism:I
         8: aload_0
         9: getfield      #18                 // Field $props:Lext/mods/commons/config/ExProperties;
        12: aload_0
        13: getfield      #22                 // Field this$0:Lext/mods/gameserver/geoengine/GeoEngine;
        16: aload_2
        17: invokespecial #285                // Method "<init>":(ILext/mods/commons/config/ExProperties;Lext/mods/gameserver/geoengine/GeoEngine;Lkotlin/coroutines/Continuation;)V
        20: astore_3
        21: aload_3
        22: aload_1
        23: putfield      #61                 // Field L$0:Ljava/lang/Object;
        26: aload_3
        27: checkcast     #196                // class kotlin/coroutines/Continuation
        30: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0  this   Lext/mods/gameserver/geoengine/GeoEngine$2;
            0      31     1 value   Ljava/lang/Object;
            0      31     2 $completion   Lkotlin/coroutines/Continuation;
    Signature: #283                         // (Ljava/lang/Object;Lkotlin/coroutines/Continuation<*>;)Lkotlin/coroutines/Continuation<Lkotlin/Unit;>;

  public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Pair<java.lang.Integer, java.lang.Integer>>);
    descriptor: (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: aload_2
         3: invokevirtual #291                // Method create:(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
         6: checkcast     #2                  // class ext/mods/gameserver/geoengine/GeoEngine$2
         9: getstatic     #297                // Field kotlin/Unit.INSTANCE:Lkotlin/Unit;
        12: invokevirtual #299                // Method invokeSuspend:(Ljava/lang/Object;)Ljava/lang/Object;
        15: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/geoengine/GeoEngine$2;
            0      16     1    p1   Lkotlinx/coroutines/CoroutineScope;
            0      16     2    p2   Lkotlin/coroutines/Continuation;
    Signature: #289                         // (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Lkotlin/Pair<Ljava/lang/Integer;Ljava/lang/Integer;>;>;)Ljava/lang/Object;

  public java.lang.Object invoke(java.lang.Object, java.lang.Object);
    descriptor: (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: checkcast     #63                 // class kotlinx/coroutines/CoroutineScope
         5: aload_2
         6: checkcast     #196                // class kotlin/coroutines/Continuation
         9: invokevirtual #304                // Method invoke:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
        12: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/geoengine/GeoEngine$2;
            0      13     1    p1   Ljava/lang/Object;
            0      13     2    p2   Ljava/lang/Object;
}
InnerClasses:
  static final #2;                        // class ext/mods/gameserver/geoengine/GeoEngine$2
  static final #185;                      // class ext/mods/gameserver/geoengine/GeoEngine$2$jobs$1$1
EnclosingMethod: #148.#89               // ext.mods.gameserver.geoengine.GeoEngine.<init>
Signature: #3                           // Lkotlin/coroutines/jvm/internal/SuspendLambda;Lkotlin/jvm/functions/Function2<Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Lkotlin/Pair<+Ljava/lang/Integer;+Ljava/lang/Integer;>;>;Ljava/lang/Object;>;
SourceFile: "GeoEngine.kt"
SourceDebugExtension:
  SMAP
  GeoEngine.kt
  Kotlin
  *S Kotlin
  *F
  + 1 GeoEngine.kt
  ext/mods/gameserver/geoengine/GeoEngine$2
  + 2 _Collections.kt
  kotlin/collections/CollectionsKt___CollectionsKt
  *L
  1#1,1319:1
  1391#2:1320
  1480#2,2:1321
  1586#2:1323
  1661#2,3:1324
  1482#2,3:1327
  1596#2:1330
  1629#2,4:1331
  1849#2,3:1335
  *S KotlinDebug
  *F
  + 1 GeoEngine.kt
  ext/mods/gameserver/geoengine/GeoEngine$2
  *L
  82#1:1320
  82#1:1321,2
  83#1:1323
  83#1:1324,3
  82#1:1327,3
  90#1:1330
  90#1:1331,4
  114#1:1335,3
  *E
RuntimeVisibleAnnotations:
  0: #38(#39=s#40,#41=[I#42],#43=[I#44],#45=[I#46,I#46,I#46,I#46,I#46],#47=[s#48,s#33,s#35,s#36,s#37],#49=[s#50,s#51,s#52,s#53,s#54],#55=s#31,#56=s#57,#58=I#59)
    kotlin.coroutines.jvm.internal.DebugMetadata(
      f="GeoEngine.kt"
      l=[114]
      nl=[1335]
      i=[0,0,0,0,0]
      s=["L$0","L$1","L$2","L$3","I$0"]
      n=["$this$runBlocking","allRegions","batches","jobs","batchSize"]
      m="invokeSuspend"
      c="ext.mods.gameserver.geoengine.GeoEngine$2"
      v=2
    )
  1: #305(#306=[I#59,I#307,I#46],#308=I#307,#309=I#310,#311=[s#312],#313=[s#314,s#268,s#315,s#276])
    kotlin.Metadata(
      mv=[2,3,0]
      k=3
      xi=48
      d1=["\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"]
      d2=["<anonymous>","Lkotlin/Pair;","","Lkotlinx/coroutines/CoroutineScope;"]
    )
RuntimeInvisibleAnnotations:
  0: #316(#286=[s#317])
    kotlin.jvm.internal.SourceDebugExtension(
      value=["SMAP\nGeoEngine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GeoEngine.kt\next/mods/gameserver/geoengine/GeoEngine$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1319:1\n1391#2:1320\n1480#2,2:1321\n1586#2:1323\n1661#2,3:1324\n1482#2,3:1327\n1596#2:1330\n1629#2,4:1331\n1849#2,3:1335\n*S KotlinDebug\n*F\n+ 1 GeoEngine.kt\next/mods/gameserver/geoengine/GeoEngine$2\n*L\n82#1:1320\n82#1:1321,2\n83#1:1323\n83#1:1324,3\n82#1:1327,3\n90#1:1330\n90#1:1331,4\n114#1:1335,3\n*E\n"]
    )
BootstrapMethods:
  0: #161 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #154  Processando \u0001 regioes em \u0001 lotes simultaneos...
