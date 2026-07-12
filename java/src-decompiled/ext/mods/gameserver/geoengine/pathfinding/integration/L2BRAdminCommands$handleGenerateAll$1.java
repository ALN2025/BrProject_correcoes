// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.integration.L2BRAdminCommands$handleGenerateAll$1
// File: ext\mods\gameserver\geoengine\pathfinding\integration\L2BRAdminCommands$handleGenerateAll$1.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerateAll$1.class
  Last modified 9 de jul de 2026; size 13779 bytes
  MD5 checksum 8b70ffa47bd851b0b466d4dd97088b6f
  Compiled from "AdminCommands.kt"
final class ext.mods.gameserver.geoengine.pathfinding.integration.L2BRAdminCommands$handleGenerateAll$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>
  minor version: 0
  major version: 69
  flags: (0x0030) ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerateAll$1
  super_class: #5                         // kotlin/coroutines/jvm/internal/SuspendLambda
  interfaces: 1, fields: 20, methods: 5, attributes: 8
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerateAll$1
    #2 = Class              #1            // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerateAll$1
    #3 = Utf8               Lkotlin/coroutines/jvm/internal/SuspendLambda;Lkotlin/jvm/functions/Function2<Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Lkotlin/Unit;>;Ljava/lang/Object;>;
    #4 = Utf8               kotlin/coroutines/jvm/internal/SuspendLambda
    #5 = Class              #4            // kotlin/coroutines/jvm/internal/SuspendLambda
    #6 = Utf8               kotlin/jvm/functions/Function2
    #7 = Class              #6            // kotlin/jvm/functions/Function2
    #8 = Utf8               <init>
    #9 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;ZLkotlin/coroutines/Continuation;)V
   #10 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;ZLkotlin/coroutines/Continuation<-Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerateAll$1;>;)V
   #11 = Utf8               this$0
   #12 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;
   #13 = NameAndType        #11:#12       // this$0:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;
   #14 = Fieldref           #2.#13        // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerateAll$1.this$0:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;
   #15 = Utf8               $admin
   #16 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;
   #17 = NameAndType        #15:#16       // $admin:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;
   #18 = Fieldref           #2.#17        // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerateAll$1.$admin:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;
   #19 = Utf8               $force
   #20 = Utf8               Z
   #21 = NameAndType        #19:#20       // $force:Z
   #22 = Fieldref           #2.#21        // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerateAll$1.$force:Z
   #23 = Utf8               (ILkotlin/coroutines/Continuation;)V
   #24 = NameAndType        #8:#23        // "<init>":(ILkotlin/coroutines/Continuation;)V
   #25 = Methodref          #5.#24        // kotlin/coroutines/jvm/internal/SuspendLambda."<init>":(ILkotlin/coroutines/Continuation;)V
   #26 = Utf8               this
   #27 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerateAll$1;
   #28 = Utf8               $receiver
   #29 = Utf8               $completion
   #30 = Utf8               Lkotlin/coroutines/Continuation;
   #31 = Utf8               invokeSuspend
   #32 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #33 = Utf8               L$0
   #34 = Utf8               Ljava/lang/Object;
   #35 = Utf8               L$1
   #36 = Utf8               L$2
   #37 = Utf8               L$3
   #38 = Utf8               L$4
   #39 = Utf8               L$5
   #40 = Utf8               L$6
   #41 = Utf8               L$7
   #42 = Utf8               L$8
   #43 = Utf8               I$0
   #44 = Utf8               I
   #45 = Utf8               I$1
   #46 = Utf8               I$2
   #47 = Utf8               I$3
   #48 = Utf8               I$4
   #49 = Utf8               I$5
   #50 = Utf8               I$6
   #51 = Utf8               Lkotlin/coroutines/jvm/internal/DebugMetadata;
   #52 = Utf8               f
   #53 = Utf8               AdminCommands.kt
   #54 = Utf8               l
   #55 = Integer            232
   #56 = Utf8               nl
   #57 = Integer            234
   #58 = Utf8               i
   #59 = Integer            0
   #60 = Utf8               s
   #61 = Utf8               n
   #62 = Utf8               availableRegions
   #63 = Utf8               success
   #64 = Utf8               failed
   #65 = Utf8               $this$forEachIndexed$iv
   #66 = Utf8               item$iv
   #67 = Utf8               indexer
   #68 = Utf8               $i$f$forEachIndexed
   #69 = Utf8               index$iv
   #70 = Utf8               index
   #71 = Utf8               $i$a$-forEachIndexed-L2BRAdminCommands$handleGenerateAll$1$1
   #72 = Utf8               x
   #73 = Utf8               y
   #74 = Utf8               percent
   #75 = Utf8               m
   #76 = Utf8               c
   #77 = Utf8               ext.mods.gameserver.geoengine.pathfinding.integration.L2BRAdminCommands$handleGenerateAll$1
   #78 = Utf8               v
   #79 = Integer            2
   #80 = Utf8               java/lang/Exception
   #81 = Class              #80           // java/lang/Exception
   #82 = Utf8               kotlin/coroutines/intrinsics/IntrinsicsKt
   #83 = Class              #82           // kotlin/coroutines/intrinsics/IntrinsicsKt
   #84 = Utf8               getCOROUTINE_SUSPENDED
   #85 = Utf8               ()Ljava/lang/Object;
   #86 = NameAndType        #84:#85       // getCOROUTINE_SUSPENDED:()Ljava/lang/Object;
   #87 = Methodref          #83.#86       // kotlin/coroutines/intrinsics/IntrinsicsKt.getCOROUTINE_SUSPENDED:()Ljava/lang/Object;
   #88 = Utf8               label
   #89 = NameAndType        #88:#44       // label:I
   #90 = Fieldref           #2.#89        // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerateAll$1.label:I
   #91 = Utf8               kotlin/ResultKt
   #92 = Class              #91           // kotlin/ResultKt
   #93 = Utf8               throwOnFailure
   #94 = Utf8               (Ljava/lang/Object;)V
   #95 = NameAndType        #93:#94       // throwOnFailure:(Ljava/lang/Object;)V
   #96 = Methodref          #92.#95       // kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
   #97 = Utf8               java/util/ArrayList
   #98 = Class              #97           // java/util/ArrayList
   #99 = Utf8               ()V
  #100 = NameAndType        #8:#99        // "<init>":()V
  #101 = Methodref          #98.#100      // java/util/ArrayList."<init>":()V
  #102 = Utf8               java/util/List
  #103 = Class              #102          // java/util/List
  #104 = Utf8               ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands
  #105 = Class              #104          // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands
  #106 = Utf8               access$getGeoDataProvider$p
  #107 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;
  #108 = NameAndType        #106:#107     // access$getGeoDataProvider$p:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;
  #109 = Methodref          #105.#108     // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands.access$getGeoDataProvider$p:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;
  #110 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider
  #111 = Class              #110          // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider
  #112 = Utf8               hasL2JData
  #113 = Utf8               (II)Z
  #114 = NameAndType        #112:#113     // hasL2JData:(II)Z
  #115 = InterfaceMethodref #111.#114     // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider.hasL2JData:(II)Z
  #116 = Utf8               hasConvDatData
  #117 = NameAndType        #116:#113     // hasConvDatData:(II)Z
  #118 = InterfaceMethodref #111.#117     // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider.hasConvDatData:(II)Z
  #119 = Utf8               kotlin/Pair
  #120 = Class              #119          // kotlin/Pair
  #121 = Utf8               kotlin/coroutines/jvm/internal/Boxing
  #122 = Class              #121          // kotlin/coroutines/jvm/internal/Boxing
  #123 = Utf8               boxInt
  #124 = Utf8               (I)Ljava/lang/Integer;
  #125 = NameAndType        #123:#124     // boxInt:(I)Ljava/lang/Integer;
  #126 = Methodref          #122.#125     // kotlin/coroutines/jvm/internal/Boxing.boxInt:(I)Ljava/lang/Integer;
  #127 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)V
  #128 = NameAndType        #8:#127       // "<init>":(Ljava/lang/Object;Ljava/lang/Object;)V
  #129 = Methodref          #120.#128     // kotlin/Pair."<init>":(Ljava/lang/Object;Ljava/lang/Object;)V
  #130 = Utf8               add
  #131 = Utf8               (Ljava/lang/Object;)Z
  #132 = NameAndType        #130:#131     // add:(Ljava/lang/Object;)Z
  #133 = InterfaceMethodref #103.#132     // java/util/List.add:(Ljava/lang/Object;)Z
  #134 = Utf8               isEmpty
  #135 = Utf8               ()Z
  #136 = NameAndType        #134:#135     // isEmpty:()Z
  #137 = InterfaceMethodref #103.#136     // java/util/List.isEmpty:()Z
  #138 = Utf8               Nenhuma região encontrada para gerar!
  #139 = String             #138          // Nenhuma região encontrada para gerar!
  #140 = Utf8               ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface
  #141 = Class              #140          // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface
  #142 = Utf8               sendMessage
  #143 = Utf8               (Ljava/lang/String;)V
  #144 = NameAndType        #142:#143     // sendMessage:(Ljava/lang/String;)V
  #145 = InterfaceMethodref #141.#144     // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface.sendMessage:(Ljava/lang/String;)V
  #146 = Utf8               kotlin/Unit
  #147 = Class              #146          // kotlin/Unit
  #148 = Utf8               INSTANCE
  #149 = Utf8               Lkotlin/Unit;
  #150 = NameAndType        #148:#149     // INSTANCE:Lkotlin/Unit;
  #151 = Fieldref           #147.#150     // kotlin/Unit.INSTANCE:Lkotlin/Unit;
  #152 = Utf8               size
  #153 = Utf8               ()I
  #154 = NameAndType        #152:#153     // size:()I
  #155 = InterfaceMethodref #103.#154     // java/util/List.size:()I
  #156 = Utf8               Encontradas §a\u0001 §7regiões para gerar.
  #157 = String             #156          // Encontradas §a\u0001 §7regiões para gerar.
  #158 = Utf8               java/lang/invoke/StringConcatFactory
  #159 = Class              #158          // java/lang/invoke/StringConcatFactory
  #160 = Utf8               makeConcatWithConstants
  #161 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #162 = NameAndType        #160:#161     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #163 = Methodref          #159.#162     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #164 = MethodHandle       6:#163        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #165 = Utf8               (I)Ljava/lang/String;
  #166 = NameAndType        #160:#165     // makeConcatWithConstants:(I)Ljava/lang/String;
  #167 = InvokeDynamic      #0:#166       // #0:makeConcatWithConstants:(I)Ljava/lang/String;
  #168 = Utf8               Use §a//l2br_generate_all force §7para iniciar.
  #169 = String             #168          // Use §a//l2br_generate_all force §7para iniciar.
  #170 = Utf8               kotlin/jvm/internal/Ref$IntRef
  #171 = Class              #170          // kotlin/jvm/internal/Ref$IntRef
  #172 = Methodref          #171.#100     // kotlin/jvm/internal/Ref$IntRef."<init>":()V
  #173 = Utf8               java/lang/Iterable
  #174 = Class              #173          // java/lang/Iterable
  #175 = Utf8               iterator
  #176 = Utf8               ()Ljava/util/Iterator;
  #177 = NameAndType        #175:#176     // iterator:()Ljava/util/Iterator;
  #178 = InterfaceMethodref #174.#177     // java/lang/Iterable.iterator:()Ljava/util/Iterator;
  #179 = Utf8               java/util/Iterator
  #180 = Class              #179          // java/util/Iterator
  #181 = Utf8               hasNext
  #182 = NameAndType        #181:#135     // hasNext:()Z
  #183 = InterfaceMethodref #180.#182     // java/util/Iterator.hasNext:()Z
  #184 = Utf8               next
  #185 = NameAndType        #184:#85      // next:()Ljava/lang/Object;
  #186 = InterfaceMethodref #180.#185     // java/util/Iterator.next:()Ljava/lang/Object;
  #187 = Utf8               kotlin/collections/CollectionsKt
  #188 = Class              #187          // kotlin/collections/CollectionsKt
  #189 = Utf8               throwIndexOverflow
  #190 = NameAndType        #189:#99      // throwIndexOverflow:()V
  #191 = Methodref          #188.#190     // kotlin/collections/CollectionsKt.throwIndexOverflow:()V
  #192 = Utf8               component1
  #193 = NameAndType        #192:#85      // component1:()Ljava/lang/Object;
  #194 = Methodref          #120.#193     // kotlin/Pair.component1:()Ljava/lang/Object;
  #195 = Utf8               java/lang/Number
  #196 = Class              #195          // java/lang/Number
  #197 = Utf8               intValue
  #198 = NameAndType        #197:#153     // intValue:()I
  #199 = Methodref          #196.#198     // java/lang/Number.intValue:()I
  #200 = Utf8               component2
  #201 = NameAndType        #200:#85      // component2:()Ljava/lang/Object;
  #202 = Methodref          #120.#201     // kotlin/Pair.component2:()Ljava/lang/Object;
  #203 = Utf8               [\u0001%] Processando [\u0001, \u0001] (\u0001/\u0001)...
  #204 = String             #203          // [\u0001%] Processando [\u0001, \u0001] (\u0001/\u0001)...
  #205 = Utf8               (IIIII)Ljava/lang/String;
  #206 = NameAndType        #160:#205     // makeConcatWithConstants:(IIIII)Ljava/lang/String;
  #207 = InvokeDynamic      #1:#206       // #1:makeConcatWithConstants:(IIIII)Ljava/lang/String;
  #208 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
  #209 = Class              #208          // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
  #210 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;)V
  #211 = NameAndType        #8:#210       // "<init>":(Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;)V
  #212 = Methodref          #209.#211     // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer."<init>":(Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;)V
  #213 = NameAndType        #33:#34       // L$0:Ljava/lang/Object;
  #214 = Fieldref           #2.#213       // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerateAll$1.L$0:Ljava/lang/Object;
  #215 = NameAndType        #35:#34       // L$1:Ljava/lang/Object;
  #216 = Fieldref           #2.#215       // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerateAll$1.L$1:Ljava/lang/Object;
  #217 = NameAndType        #36:#34       // L$2:Ljava/lang/Object;
  #218 = Fieldref           #2.#217       // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerateAll$1.L$2:Ljava/lang/Object;
  #219 = Utf8               kotlin/coroutines/jvm/internal/SpillingKt
  #220 = Class              #219          // kotlin/coroutines/jvm/internal/SpillingKt
  #221 = Utf8               nullOutSpilledVariable
  #222 = NameAndType        #221:#32      // nullOutSpilledVariable:(Ljava/lang/Object;)Ljava/lang/Object;
  #223 = Methodref          #220.#222     // kotlin/coroutines/jvm/internal/SpillingKt.nullOutSpilledVariable:(Ljava/lang/Object;)Ljava/lang/Object;
  #224 = NameAndType        #37:#34       // L$3:Ljava/lang/Object;
  #225 = Fieldref           #2.#224       // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerateAll$1.L$3:Ljava/lang/Object;
  #226 = NameAndType        #38:#34       // L$4:Ljava/lang/Object;
  #227 = Fieldref           #2.#226       // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerateAll$1.L$4:Ljava/lang/Object;
  #228 = NameAndType        #39:#34       // L$5:Ljava/lang/Object;
  #229 = Fieldref           #2.#228       // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerateAll$1.L$5:Ljava/lang/Object;
  #230 = NameAndType        #40:#34       // L$6:Ljava/lang/Object;
  #231 = Fieldref           #2.#230       // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerateAll$1.L$6:Ljava/lang/Object;
  #232 = NameAndType        #41:#34       // L$7:Ljava/lang/Object;
  #233 = Fieldref           #2.#232       // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerateAll$1.L$7:Ljava/lang/Object;
  #234 = NameAndType        #42:#34       // L$8:Ljava/lang/Object;
  #235 = Fieldref           #2.#234       // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerateAll$1.L$8:Ljava/lang/Object;
  #236 = NameAndType        #43:#44       // I$0:I
  #237 = Fieldref           #2.#236       // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerateAll$1.I$0:I
  #238 = NameAndType        #45:#44       // I$1:I
  #239 = Fieldref           #2.#238       // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerateAll$1.I$1:I
  #240 = NameAndType        #46:#44       // I$2:I
  #241 = Fieldref           #2.#240       // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerateAll$1.I$2:I
  #242 = NameAndType        #47:#44       // I$3:I
  #243 = Fieldref           #2.#242       // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerateAll$1.I$3:I
  #244 = NameAndType        #48:#44       // I$4:I
  #245 = Fieldref           #2.#244       // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerateAll$1.I$4:I
  #246 = NameAndType        #49:#44       // I$5:I
  #247 = Fieldref           #2.#246       // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerateAll$1.I$5:I
  #248 = NameAndType        #50:#44       // I$6:I
  #249 = Fieldref           #2.#248       // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerateAll$1.I$6:I
  #250 = Utf8               indexRegion$default
  #251 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;IIILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
  #252 = NameAndType        #250:#251     // indexRegion$default:(Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;IIILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
  #253 = Methodref          #209.#252     // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer.indexRegion$default:(Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;IIILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
  #254 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult
  #255 = Class              #254          // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult
  #256 = Utf8               getNodes
  #257 = Utf8               ()Ljava/util/List;
  #258 = NameAndType        #256:#257     // getNodes:()Ljava/util/List;
  #259 = Methodref          #255.#258     // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult.getNodes:()Ljava/util/List;
  #260 = Utf8               collectionSizeOrDefault
  #261 = Utf8               (Ljava/lang/Iterable;I)I
  #262 = NameAndType        #260:#261     // collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
  #263 = Methodref          #188.#262     // kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
  #264 = Utf8               (I)V
  #265 = NameAndType        #8:#264       // "<init>":(I)V
  #266 = Methodref          #98.#265      // java/util/ArrayList."<init>":(I)V
  #267 = Utf8               java/util/Collection
  #268 = Class              #267          // java/util/Collection
  #269 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode
  #270 = Class              #269          // ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode
  #271 = Utf8               access$toSerializationNode
  #272 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;)Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;
  #273 = NameAndType        #271:#272     // access$toSerializationNode:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;)Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;
  #274 = Methodref          #105.#273     // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands.access$toSerializationNode:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;)Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;
  #275 = Utf8               kotlin/TuplesKt
  #276 = Class              #275          // kotlin/TuplesKt
  #277 = Utf8               to
  #278 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
  #279 = NameAndType        #277:#278     // to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
  #280 = Methodref          #276.#279     // kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
  #281 = InterfaceMethodref #268.#132     // java/util/Collection.add:(Ljava/lang/Object;)Z
  #282 = Utf8               kotlin/collections/MapsKt
  #283 = Class              #282          // kotlin/collections/MapsKt
  #284 = Utf8               toMap
  #285 = Utf8               (Ljava/lang/Iterable;)Ljava/util/Map;
  #286 = NameAndType        #284:#285     // toMap:(Ljava/lang/Iterable;)Ljava/util/Map;
  #287 = Methodref          #283.#286     // kotlin/collections/MapsKt.toMap:(Ljava/lang/Iterable;)Ljava/util/Map;
  #288 = Utf8               getWalkableCount
  #289 = NameAndType        #288:#153     // getWalkableCount:()I
  #290 = Methodref          #255.#289     // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult.getWalkableCount:()I
  #291 = Utf8               access$buildSpatialGrid
  #292 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;Ljava/util/List;)Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;
  #293 = NameAndType        #291:#292     // access$buildSpatialGrid:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;Ljava/util/List;)Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;
  #294 = Methodref          #105.#293     // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands.access$buildSpatialGrid:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;Ljava/util/List;)Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;
  #295 = Utf8               access$calculateConnectivity
  #296 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;Ljava/util/List;)Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;
  #297 = NameAndType        #295:#296     // access$calculateConnectivity:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;Ljava/util/List;)Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;
  #298 = Methodref          #105.#297     // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands.access$calculateConnectivity:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;Ljava/util/List;)Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;
  #299 = Utf8               ext/mods/gameserver/geoengine/pathfinding/serialization/SourceType
  #300 = Class              #299          // ext/mods/gameserver/geoengine/pathfinding/serialization/SourceType
  #301 = Utf8               MIXED
  #302 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;
  #303 = NameAndType        #301:#302     // MIXED:Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;
  #304 = Fieldref           #300.#303     // ext/mods/gameserver/geoengine/pathfinding/serialization/SourceType.MIXED:Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;
  #305 = Utf8               getDurationMs
  #306 = Utf8               ()J
  #307 = NameAndType        #305:#306     // getDurationMs:()J
  #308 = Methodref          #255.#307     // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult.getDurationMs:()J
  #309 = Utf8               ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion
  #310 = Class              #309          // ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion
  #311 = Utf8               (IILjava/util/Map;ILext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;J)V
  #312 = NameAndType        #8:#311       // "<init>":(IILjava/util/Map;ILext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;J)V
  #313 = Methodref          #310.#312     // ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion."<init>":(IILjava/util/Map;ILext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;J)V
  #314 = Utf8               access$getSerializer$p
  #315 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;)Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer;
  #316 = NameAndType        #314:#315     // access$getSerializer$p:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;)Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer;
  #317 = Methodref          #105.#316     // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands.access$getSerializer$p:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;)Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer;
  #318 = Utf8               access$getOutputPath$p
  #319 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;)Ljava/nio/file/Path;
  #320 = NameAndType        #318:#319     // access$getOutputPath$p:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;)Ljava/nio/file/Path;
  #321 = Methodref          #105.#320     // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands.access$getOutputPath$p:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;)Ljava/nio/file/Path;
  #322 = Utf8               \u0001_\u0001.l2br
  #323 = String             #322          // \u0001_\u0001.l2br
  #324 = Utf8               (II)Ljava/lang/String;
  #325 = NameAndType        #160:#324     // makeConcatWithConstants:(II)Ljava/lang/String;
  #326 = InvokeDynamic      #2:#325       // #2:makeConcatWithConstants:(II)Ljava/lang/String;
  #327 = Utf8               java/nio/file/Path
  #328 = Class              #327          // java/nio/file/Path
  #329 = Utf8               resolve
  #330 = Utf8               (Ljava/lang/String;)Ljava/nio/file/Path;
  #331 = NameAndType        #329:#330     // resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
  #332 = InterfaceMethodref #328.#331     // java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
  #333 = Utf8               ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer
  #334 = Class              #333          // ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer
  #335 = Utf8               serialize
  #336 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion;Ljava/nio/file/Path;)V
  #337 = NameAndType        #335:#336     // serialize:(Lext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion;Ljava/nio/file/Path;)V
  #338 = Methodref          #334.#337     // ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer.serialize:(Lext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion;Ljava/nio/file/Path;)V
  #339 = Utf8               element
  #340 = NameAndType        #339:#44      // element:I
  #341 = Fieldref           #171.#340     // kotlin/jvm/internal/Ref$IntRef.element:I
  #342 = Utf8               getMessage
  #343 = Utf8               ()Ljava/lang/String;
  #344 = NameAndType        #342:#343     // getMessage:()Ljava/lang/String;
  #345 = Methodref          #81.#344      // java/lang/Exception.getMessage:()Ljava/lang/String;
  #346 = Utf8                 Falha em [\u0001, \u0001]: \u0001
  #347 = String             #346          //   Falha em [\u0001, \u0001]: \u0001
  #348 = Utf8               (IILjava/lang/String;)Ljava/lang/String;
  #349 = NameAndType        #160:#348     // makeConcatWithConstants:(IILjava/lang/String;)Ljava/lang/String;
  #350 = InvokeDynamic      #3:#349       // #3:makeConcatWithConstants:(IILjava/lang/String;)Ljava/lang/String;
  #351 = Utf8               === BATCH CONCLUÍDO ===
  #352 = String             #351          // === BATCH CONCLUÍDO ===
  #353 = Utf8               Sucesso: \u0001 | Falhas: \u0001
  #354 = String             #353          // Sucesso: \u0001 | Falhas: \u0001
  #355 = InvokeDynamic      #4:#325       // #4:makeConcatWithConstants:(II)Ljava/lang/String;
  #356 = Utf8               java/lang/IllegalStateException
  #357 = Class              #356          // java/lang/IllegalStateException
  #358 = Utf8               call to \'resume\' before \'invoke\' with coroutine
  #359 = String             #358          // call to \'resume\' before \'invoke\' with coroutine
  #360 = NameAndType        #8:#143       // "<init>":(Ljava/lang/String;)V
  #361 = Methodref          #357.#360     // java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
  #362 = Utf8               $i$a$-mapIndexed-L2BRAdminCommands$handleGenerateAll$1$1$region$1
  #363 = Utf8               idx
  #364 = Utf8               node
  #365 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;
  #366 = Utf8               item$iv$iv
  #367 = Utf8               $i$f$mapIndexedTo
  #368 = Utf8               index$iv$iv
  #369 = Utf8               $this$mapIndexedTo$iv$iv
  #370 = Utf8               Ljava/lang/Iterable;
  #371 = Utf8               destination$iv$iv
  #372 = Utf8               Ljava/util/Collection;
  #373 = Utf8               $i$f$mapIndexed
  #374 = Utf8               $this$mapIndexed$iv
  #375 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;
  #376 = Utf8               result
  #377 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult;
  #378 = Utf8               region
  #379 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion;
  #380 = Utf8               e
  #381 = Utf8               Ljava/lang/Exception;
  #382 = Utf8               Ljava/util/List;
  #383 = Utf8               Lkotlin/jvm/internal/Ref$IntRef;
  #384 = Utf8               $result
  #385 = Utf8               java/lang/Object
  #386 = Class              #385          // java/lang/Object
  #387 = Utf8               create
  #388 = Utf8               (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
  #389 = Utf8               (Ljava/lang/Object;Lkotlin/coroutines/Continuation<*>;)Lkotlin/coroutines/Continuation<Lkotlin/Unit;>;
  #390 = NameAndType        #8:#9         // "<init>":(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;ZLkotlin/coroutines/Continuation;)V
  #391 = Methodref          #2.#390       // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerateAll$1."<init>":(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;ZLkotlin/coroutines/Continuation;)V
  #392 = Utf8               kotlin/coroutines/Continuation
  #393 = Class              #392          // kotlin/coroutines/Continuation
  #394 = Utf8               value
  #395 = Utf8               invoke
  #396 = Utf8               (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #397 = Utf8               (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Lkotlin/Unit;>;)Ljava/lang/Object;
  #398 = NameAndType        #387:#388     // create:(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
  #399 = Methodref          #2.#398       // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerateAll$1.create:(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
  #400 = NameAndType        #31:#32       // invokeSuspend:(Ljava/lang/Object;)Ljava/lang/Object;
  #401 = Methodref          #2.#400       // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerateAll$1.invokeSuspend:(Ljava/lang/Object;)Ljava/lang/Object;
  #402 = Utf8               p1
  #403 = Utf8               Lkotlinx/coroutines/CoroutineScope;
  #404 = Utf8               p2
  #405 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #406 = Utf8               kotlinx/coroutines/CoroutineScope
  #407 = Class              #406          // kotlinx/coroutines/CoroutineScope
  #408 = NameAndType        #395:#396     // invoke:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #409 = Methodref          #2.#408       // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerateAll$1.invoke:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #410 = Utf8               Lkotlin/Metadata;
  #411 = Utf8               mv
  #412 = Integer            3
  #413 = Utf8               k
  #414 = Utf8               xi
  #415 = Integer            48
  #416 = Utf8               d1
  #417 = Utf8               \u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n
  #418 = Utf8               d2
  #419 = Utf8               <anonymous>
  #420 = Utf8
  #421 = Utf8               handleGenerateAll
  #422 = Utf8               (Ljava/util/StringTokenizer;Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;)Z
  #423 = NameAndType        #421:#422     // handleGenerateAll:(Ljava/util/StringTokenizer;Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;)Z
  #424 = Utf8               GeoDataProvider
  #425 = Utf8               IndexationResult
  #426 = Utf8               AdminInterface
  #427 = Utf8               kotlin/jvm/internal/Ref
  #428 = Class              #427          // kotlin/jvm/internal/Ref
  #429 = Utf8               IntRef
  #430 = Utf8               Lkotlin/jvm/internal/SourceDebugExtension;
  #431 = Utf8               SMAP\nAdminCommands.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdminCommands.kt\next/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerateAll$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,576:1\n1924#2,2:577\n1596#2:579\n1629#2,4:580\n1926#2:584\n*S KotlinDebug\n*F\n+ 1 AdminCommands.kt\next/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerateAll$1\n*L\n226#1:577,2\n237#1:579\n237#1:580,4\n226#1:584\n*E\n
  #432 = Utf8               Code
  #433 = Utf8               LocalVariableTable
  #434 = Utf8               Signature
  #435 = Utf8               StackMapTable
  #436 = Utf8               LineNumberTable
  #437 = Utf8               InnerClasses
  #438 = Utf8               EnclosingMethod
  #439 = Utf8               SourceFile
  #440 = Utf8               SourceDebugExtension
  #441 = Utf8               RuntimeVisibleAnnotations
  #442 = Utf8               RuntimeInvisibleAnnotations
  #443 = Utf8               BootstrapMethods
{
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

  int label;
    descriptor: I
    flags: (0x0000)

  final ext.mods.gameserver.geoengine.pathfinding.integration.L2BRAdminCommands this$0;
    descriptor: Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  final ext.mods.gameserver.geoengine.pathfinding.integration.L2BRAdminCommands$AdminInterface $admin;
    descriptor: Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  final boolean $force;
    descriptor: Z
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  ext.mods.gameserver.geoengine.pathfinding.integration.L2BRAdminCommands$handleGenerateAll$1(ext.mods.gameserver.geoengine.pathfinding.integration.L2BRAdminCommands, ext.mods.gameserver.geoengine.pathfinding.integration.L2BRAdminCommands$AdminInterface, boolean, kotlin.coroutines.Continuation<? super ext.mods.gameserver.geoengine.pathfinding.integration.L2BRAdminCommands$handleGenerateAll$1>);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;ZLkotlin/coroutines/Continuation;)V
    flags: (0x0000)
    Code:
      stack=3, locals=5, args_size=5
         0: aload_0
         1: aload_1
         2: putfield      #14                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;
         5: aload_0
         6: aload_2
         7: putfield      #18                 // Field $admin:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;
        10: aload_0
        11: iload_3
        12: putfield      #22                 // Field $force:Z
        15: aload_0
        16: iconst_2
        17: aload         4
        19: invokespecial #25                 // Method kotlin/coroutines/jvm/internal/SuspendLambda."<init>":(ILkotlin/coroutines/Continuation;)V
        22: return
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerateAll$1;
            0      23     1 $receiver   Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;
            0      23     2 $admin   Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;
            0      23     3 $force   Z
            0      23     4 $completion   Lkotlin/coroutines/Continuation;
    Signature: #10                          // (Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;ZLkotlin/coroutines/Continuation<-Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerateAll$1;>;)V

  public final java.lang.Object invokeSuspend(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Ljava/lang/Object;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=11, locals=47, args_size=2
         0: invokestatic  #87                 // Method kotlin/coroutines/intrinsics/IntrinsicsKt.getCOROUTINE_SUSPENDED:()Ljava/lang/Object;
         3: astore        46
         5: aload_0
         6: getfield      #90                 // Field label:I
         9: tableswitch   { // 0 to 1

                       0: 32

                       1: 519
                 default: 1017
            }
        32: aload_1
        33: invokestatic  #96                 // Method kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
        36: new           #98                 // class java/util/ArrayList
        39: dup
        40: invokespecial #101                // Method java/util/ArrayList."<init>":()V
        43: checkcast     #103                // class java/util/List
        46: astore_2
        47: bipush        16
        49: istore_3
        50: iload_3
        51: bipush        27
        53: if_icmpge     138
        56: bipush        10
        58: istore        4
        60: iload         4
        62: bipush        27
        64: if_icmpge     132
        67: aload_0
        68: getfield      #14                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;
        71: invokestatic  #109                // Method ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands.access$getGeoDataProvider$p:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;
        74: iload_3
        75: iload         4
        77: invokeinterface #115,  3          // InterfaceMethod ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider.hasL2JData:(II)Z
        82: ifne          103
        85: aload_0
        86: getfield      #14                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;
        89: invokestatic  #109                // Method ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands.access$getGeoDataProvider$p:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;
        92: iload_3
        93: iload         4
        95: invokeinterface #118,  3          // InterfaceMethod ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider.hasConvDatData:(II)Z
       100: ifeq          126
       103: aload_2
       104: new           #120                // class kotlin/Pair
       107: dup
       108: iload_3
       109: invokestatic  #126                // Method kotlin/coroutines/jvm/internal/Boxing.boxInt:(I)Ljava/lang/Integer;
       112: iload         4
       114: invokestatic  #126                // Method kotlin/coroutines/jvm/internal/Boxing.boxInt:(I)Ljava/lang/Integer;
       117: invokespecial #129                // Method kotlin/Pair."<init>":(Ljava/lang/Object;Ljava/lang/Object;)V
       120: invokeinterface #133,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       125: pop
       126: iinc          4, 1
       129: goto          60
       132: iinc          3, 1
       135: goto          50
       138: aload_2
       139: invokeinterface #137,  1          // InterfaceMethod java/util/List.isEmpty:()Z
       144: ifeq          162
       147: aload_0
       148: getfield      #18                 // Field $admin:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;
       151: ldc           #139                // String Nenhuma região encontrada para gerar!
       153: invokeinterface #145,  2          // InterfaceMethod ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface.sendMessage:(Ljava/lang/String;)V
       158: getstatic     #151                // Field kotlin/Unit.INSTANCE:Lkotlin/Unit;
       161: areturn
       162: aload_0
       163: getfield      #18                 // Field $admin:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;
       166: aload_2
       167: invokeinterface #155,  1          // InterfaceMethod java/util/List.size:()I
       172: invokedynamic #167,  0            // InvokeDynamic #0:makeConcatWithConstants:(I)Ljava/lang/String;
       177: invokeinterface #145,  2          // InterfaceMethod ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface.sendMessage:(Ljava/lang/String;)V
       182: aload_0
       183: getfield      #22                 // Field $force:Z
       186: ifne          204
       189: aload_0
       190: getfield      #18                 // Field $admin:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;
       193: ldc           #169                // String Use §a//l2br_generate_all force §7para iniciar.
       195: invokeinterface #145,  2          // InterfaceMethod ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface.sendMessage:(Ljava/lang/String;)V
       200: getstatic     #151                // Field kotlin/Unit.INSTANCE:Lkotlin/Unit;
       203: areturn
       204: new           #171                // class kotlin/jvm/internal/Ref$IntRef
       207: dup
       208: invokespecial #172                // Method kotlin/jvm/internal/Ref$IntRef."<init>":()V
       211: astore_3
       212: new           #171                // class kotlin/jvm/internal/Ref$IntRef
       215: dup
       216: invokespecial #172                // Method kotlin/jvm/internal/Ref$IntRef."<init>":()V
       219: astore        4
       221: aload_2
       222: checkcast     #174                // class java/lang/Iterable
       225: astore        5
       227: aload_0
       228: getfield      #18                 // Field $admin:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;
       231: astore        6
       233: aload_0
       234: getfield      #14                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;
       237: astore        7
       239: iconst_0
       240: istore        8
       242: iconst_0
       243: istore        9
       245: aload         5
       247: invokeinterface #178,  1          // InterfaceMethod java/lang/Iterable.iterator:()Ljava/util/Iterator;
       252: astore        10
       254: aload         10
       256: invokeinterface #183,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       261: ifeq          977
       264: aload         10
       266: invokeinterface #186,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       271: astore        11
       273: iload         9
       275: iinc          9, 1
       278: istore        12
       280: iload         12
       282: ifge          288
       285: invokestatic  #191                // Method kotlin/collections/CollectionsKt.throwIndexOverflow:()V
       288: iload         12
       290: aload         11
       292: checkcast     #120                // class kotlin/Pair
       295: astore        13
       297: istore        14
       299: iconst_0
       300: istore        15
       302: aload         13
       304: invokevirtual #194                // Method kotlin/Pair.component1:()Ljava/lang/Object;
       307: checkcast     #196                // class java/lang/Number
       310: invokevirtual #199                // Method java/lang/Number.intValue:()I
       313: istore        16
       315: aload         13
       317: invokevirtual #202                // Method kotlin/Pair.component2:()Ljava/lang/Object;
       320: checkcast     #196                // class java/lang/Number
       323: invokevirtual #199                // Method java/lang/Number.intValue:()I
       326: istore        17
       328: iload         14
       330: iconst_1
       331: iadd
       332: bipush        100
       334: imul
       335: aload_2
       336: invokeinterface #155,  1          // InterfaceMethod java/util/List.size:()I
       341: idiv
       342: istore        18
       344: aload         6
       346: iload         18
       348: iload         16
       350: iload         17
       352: iload         14
       354: iconst_1
       355: iadd
       356: aload_2
       357: invokeinterface #155,  1          // InterfaceMethod java/util/List.size:()I
       362: invokedynamic #207,  0            // InvokeDynamic #1:makeConcatWithConstants:(IIIII)Ljava/lang/String;
       367: invokeinterface #145,  2          // InterfaceMethod ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface.sendMessage:(Ljava/lang/String;)V
       372: nop
       373: new           #209                // class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
       376: dup
       377: aload         7
       379: invokestatic  #109                // Method ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands.access$getGeoDataProvider$p:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;
       382: invokespecial #212                // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer."<init>":(Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;)V
       385: astore        19
       387: aload         19
       389: iload         16
       391: iload         17
       393: iconst_0
       394: aconst_null
       395: aload_0
       396: bipush        12
       398: aconst_null
       399: aload_0
       400: aload_2
       401: putfield      #214                // Field L$0:Ljava/lang/Object;
       404: aload_0
       405: aload_3
       406: putfield      #216                // Field L$1:Ljava/lang/Object;
       409: aload_0
       410: aload         4
       412: putfield      #218                // Field L$2:Ljava/lang/Object;
       415: aload_0
       416: aload         5
       418: invokestatic  #223                // Method kotlin/coroutines/jvm/internal/SpillingKt.nullOutSpilledVariable:(Ljava/lang/Object;)Ljava/lang/Object;
       421: putfield      #225                // Field L$3:Ljava/lang/Object;
       424: aload_0
       425: aload         6
       427: putfield      #227                // Field L$4:Ljava/lang/Object;
       430: aload_0
       431: aload         7
       433: putfield      #229                // Field L$5:Ljava/lang/Object;
       436: aload_0
       437: aload         10
       439: putfield      #231                // Field L$6:Ljava/lang/Object;
       442: aload_0
       443: aload         11
       445: invokestatic  #223                // Method kotlin/coroutines/jvm/internal/SpillingKt.nullOutSpilledVariable:(Ljava/lang/Object;)Ljava/lang/Object;
       448: putfield      #233                // Field L$7:Ljava/lang/Object;
       451: aload_0
       452: aload         19
       454: invokestatic  #223                // Method kotlin/coroutines/jvm/internal/SpillingKt.nullOutSpilledVariable:(Ljava/lang/Object;)Ljava/lang/Object;
       457: putfield      #235                // Field L$8:Ljava/lang/Object;
       460: aload_0
       461: iload         8
       463: putfield      #237                // Field I$0:I
       466: aload_0
       467: iload         9
       469: putfield      #239                // Field I$1:I
       472: aload_0
       473: iload         14
       475: putfield      #241                // Field I$2:I
       478: aload_0
       479: iload         15
       481: putfield      #243                // Field I$3:I
       484: aload_0
       485: iload         16
       487: putfield      #245                // Field I$4:I
       490: aload_0
       491: iload         17
       493: putfield      #247                // Field I$5:I
       496: aload_0
       497: iload         18
       499: putfield      #249                // Field I$6:I
       502: aload_0
       503: iconst_1
       504: putfield      #90                 // Field label:I
       507: invokestatic  #253                // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer.indexRegion$default:(Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;IIILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
       510: dup
       511: aload         46
       513: if_acmpne     643
       516: aload         46
       518: areturn
       519: aload_0
       520: getfield      #249                // Field I$6:I
       523: istore        18
       525: aload_0
       526: getfield      #247                // Field I$5:I
       529: istore        17
       531: aload_0
       532: getfield      #245                // Field I$4:I
       535: istore        16
       537: aload_0
       538: getfield      #243                // Field I$3:I
       541: istore        15
       543: aload_0
       544: getfield      #241                // Field I$2:I
       547: istore        14
       549: aload_0
       550: getfield      #239                // Field I$1:I
       553: istore        9
       555: aload_0
       556: getfield      #237                // Field I$0:I
       559: istore        8
       561: aload_0
       562: getfield      #235                // Field L$8:Ljava/lang/Object;
       565: checkcast     #209                // class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
       568: astore        19
       570: aload_0
       571: getfield      #233                // Field L$7:Ljava/lang/Object;
       574: astore        11
       576: aload_0
       577: getfield      #231                // Field L$6:Ljava/lang/Object;
       580: checkcast     #180                // class java/util/Iterator
       583: astore        10
       585: aload_0
       586: getfield      #229                // Field L$5:Ljava/lang/Object;
       589: checkcast     #105                // class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands
       592: astore        7
       594: aload_0
       595: getfield      #227                // Field L$4:Ljava/lang/Object;
       598: checkcast     #141                // class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface
       601: astore        6
       603: aload_0
       604: getfield      #225                // Field L$3:Ljava/lang/Object;
       607: checkcast     #174                // class java/lang/Iterable
       610: astore        5
       612: aload_0
       613: getfield      #218                // Field L$2:Ljava/lang/Object;
       616: checkcast     #171                // class kotlin/jvm/internal/Ref$IntRef
       619: astore        4
       621: aload_0
       622: getfield      #216                // Field L$1:Ljava/lang/Object;
       625: checkcast     #171                // class kotlin/jvm/internal/Ref$IntRef
       628: astore_3
       629: aload_0
       630: getfield      #214                // Field L$0:Ljava/lang/Object;
       633: checkcast     #103                // class java/util/List
       636: astore_2
       637: nop
       638: aload_1
       639: invokestatic  #96                 // Method kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
       642: aload_1
       643: checkcast     #255                // class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult
       646: astore        20
       648: iload         16
       650: iload         17
       652: aload         20
       654: invokevirtual #259                // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult.getNodes:()Ljava/util/List;
       657: checkcast     #174                // class java/lang/Iterable
       660: astore        21
       662: istore        22
       664: istore        23
       666: iconst_0
       667: istore        24
       669: aload         21
       671: astore        25
       673: new           #98                 // class java/util/ArrayList
       676: dup
       677: aload         21
       679: bipush        10
       681: invokestatic  #263                // Method kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
       684: invokespecial #266                // Method java/util/ArrayList."<init>":(I)V
       687: checkcast     #268                // class java/util/Collection
       690: astore        26
       692: iconst_0
       693: istore        27
       695: iconst_0
       696: istore        28
       698: aload         25
       700: invokeinterface #178,  1          // InterfaceMethod java/lang/Iterable.iterator:()Ljava/util/Iterator;
       705: astore        29
       707: aload         29
       709: invokeinterface #183,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       714: ifeq          786
       717: aload         29
       719: invokeinterface #186,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       724: astore        30
       726: aload         26
       728: iload         28
       730: iinc          28, 1
       733: istore        31
       735: iload         31
       737: ifge          743
       740: invokestatic  #191                // Method kotlin/collections/CollectionsKt.throwIndexOverflow:()V
       743: iload         31
       745: aload         30
       747: checkcast     #270                // class ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode
       750: astore        32
       752: istore        33
       754: astore        34
       756: iconst_0
       757: istore        35
       759: iload         33
       761: invokestatic  #126                // Method kotlin/coroutines/jvm/internal/Boxing.boxInt:(I)Ljava/lang/Integer;
       764: aload         7
       766: aload         32
       768: invokestatic  #274                // Method ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands.access$toSerializationNode:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;)Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;
       771: invokestatic  #280                // Method kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
       774: aload         34
       776: swap
       777: invokeinterface #281,  2          // InterfaceMethod java/util/Collection.add:(Ljava/lang/Object;)Z
       782: pop
       783: goto          707
       786: aload         26
       788: checkcast     #103                // class java/util/List
       791: nop
       792: astore        34
       794: iload         23
       796: iload         22
       798: aload         34
       800: checkcast     #174                // class java/lang/Iterable
       803: invokestatic  #287                // Method kotlin/collections/MapsKt.toMap:(Ljava/lang/Iterable;)Ljava/util/Map;
       806: aload         20
       808: invokevirtual #290                // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult.getWalkableCount:()I
       811: aload         7
       813: aload         20
       815: invokevirtual #259                // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult.getNodes:()Ljava/util/List;
       818: invokestatic  #294                // Method ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands.access$buildSpatialGrid:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;Ljava/util/List;)Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;
       821: aload         7
       823: aload         20
       825: invokevirtual #259                // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult.getNodes:()Ljava/util/List;
       828: invokestatic  #298                // Method ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands.access$calculateConnectivity:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;Ljava/util/List;)Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;
       831: getstatic     #304                // Field ext/mods/gameserver/geoengine/pathfinding/serialization/SourceType.MIXED:Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;
       834: aload         20
       836: invokevirtual #308                // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult.getDurationMs:()J
       839: lstore        37
       841: astore        39
       843: astore        40
       845: astore        41
       847: istore        42
       849: astore        43
       851: istore        44
       853: istore        45
       855: new           #310                // class ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion
       858: dup
       859: iload         45
       861: iload         44
       863: aload         43
       865: iload         42
       867: aload         41
       869: aload         40
       871: aload         39
       873: lload         37
       875: invokespecial #313                // Method ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion."<init>":(IILjava/util/Map;ILext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;J)V
       878: astore        36
       880: aload         7
       882: invokestatic  #317                // Method ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands.access$getSerializer$p:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;)Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer;
       885: aload         36
       887: aload         7
       889: invokestatic  #321                // Method ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands.access$getOutputPath$p:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;)Ljava/nio/file/Path;
       892: iload         16
       894: iload         17
       896: invokedynamic #326,  0            // InvokeDynamic #2:makeConcatWithConstants:(II)Ljava/lang/String;
       901: invokeinterface #332,  2          // InterfaceMethod java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
       906: invokevirtual #338                // Method ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer.serialize:(Lext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion;Ljava/nio/file/Path;)V
       909: aload_3
       910: getfield      #341                // Field kotlin/jvm/internal/Ref$IntRef.element:I
       913: istore        21
       915: aload_3
       916: iload         21
       918: iconst_1
       919: iadd
       920: putfield      #341                // Field kotlin/jvm/internal/Ref$IntRef.element:I
       923: iload         21
       925: istore        19
       927: goto          973
       930: astore        20
       932: aload         6
       934: iload         16
       936: iload         17
       938: aload         20
       940: invokevirtual #345                // Method java/lang/Exception.getMessage:()Ljava/lang/String;
       943: invokedynamic #350,  0            // InvokeDynamic #3:makeConcatWithConstants:(IILjava/lang/String;)Ljava/lang/String;
       948: invokeinterface #145,  2          // InterfaceMethod ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface.sendMessage:(Ljava/lang/String;)V
       953: aload         4
       955: getfield      #341                // Field kotlin/jvm/internal/Ref$IntRef.element:I
       958: istore        36
       960: aload         4
       962: iload         36
       964: iconst_1
       965: iadd
       966: putfield      #341                // Field kotlin/jvm/internal/Ref$IntRef.element:I
       969: iload         36
       971: istore        19
       973: nop
       974: goto          254
       977: nop
       978: aload_0
       979: getfield      #18                 // Field $admin:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;
       982: ldc_w         #352                // String === BATCH CONCLUÍDO ===
       985: invokeinterface #145,  2          // InterfaceMethod ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface.sendMessage:(Ljava/lang/String;)V
       990: aload_0
       991: getfield      #18                 // Field $admin:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;
       994: aload_3
       995: getfield      #341                // Field kotlin/jvm/internal/Ref$IntRef.element:I
       998: aload         4
      1000: getfield      #341                // Field kotlin/jvm/internal/Ref$IntRef.element:I
      1003: invokedynamic #355,  0            // InvokeDynamic #4:makeConcatWithConstants:(II)Ljava/lang/String;
      1008: invokeinterface #145,  2          // InterfaceMethod ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface.sendMessage:(Ljava/lang/String;)V
      1013: getstatic     #151                // Field kotlin/Unit.INSTANCE:Lkotlin/Unit;
      1016: areturn
      1017: new           #357                // class java/lang/IllegalStateException
      1020: dup
      1021: ldc_w         #359                // String call to \'resume\' before \'invoke\' with coroutine
      1024: invokespecial #361                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      1027: athrow
      Exception table:
         from    to  target type
           372   510   930   Class java/lang/Exception
           637   927   930   Class java/lang/Exception
      StackMapTable: number_of_entries = 20
        frame_type = 255 /* full_frame */
          offset_delta = 32
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerateAll$1, class java/lang/Object, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerateAll$1, class java/lang/Object, class java/util/List, int, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 9
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerateAll$1, class java/lang/Object, class java/util/List, int, int, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 42 /* same */
        frame_type = 22 /* same */
        frame_type = 5 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 5
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerateAll$1, class java/lang/Object, class java/util/List, int, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 23 /* same */
        frame_type = 41 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 49
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerateAll$1, class java/lang/Object, class java/util/List, class kotlin/jvm/internal/Ref$IntRef, class kotlin/jvm/internal/Ref$IntRef, class java/lang/Iterable, class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface, class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands, int, int, class java/util/Iterator, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 33
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerateAll$1, class java/lang/Object, class java/util/List, class kotlin/jvm/internal/Ref$IntRef, class kotlin/jvm/internal/Ref$IntRef, class java/lang/Iterable, class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface, class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands, int, int, class java/util/Iterator, class java/lang/Object, int, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 230
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerateAll$1, class java/lang/Object, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 123
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerateAll$1, class java/lang/Object, class java/util/List, class kotlin/jvm/internal/Ref$IntRef, class kotlin/jvm/internal/Ref$IntRef, class java/lang/Iterable, class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface, class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands, int, int, class java/util/Iterator, class java/lang/Object, top, top, int, int, int, int, int, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = [ class java/lang/Object ]
        frame_type = 255 /* full_frame */
          offset_delta = 63
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerateAll$1, class java/lang/Object, class java/util/List, class kotlin/jvm/internal/Ref$IntRef, class kotlin/jvm/internal/Ref$IntRef, class java/lang/Iterable, class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface, class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands, int, int, class java/util/Iterator, class java/lang/Object, top, top, int, int, int, int, int, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult, class java/lang/Iterable, int, int, int, class java/lang/Iterable, class java/util/Collection, int, int, class java/util/Iterator, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 35
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerateAll$1, class java/lang/Object, class java/util/List, class kotlin/jvm/internal/Ref$IntRef, class kotlin/jvm/internal/Ref$IntRef, class java/lang/Iterable, class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface, class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands, int, int, class java/util/Iterator, class java/lang/Object, top, top, int, int, int, int, int, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult, class java/lang/Iterable, int, int, int, class java/lang/Iterable, class java/util/Collection, int, int, class java/util/Iterator, class java/lang/Object, int, top, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = [ class java/util/Collection ]
        frame_type = 255 /* full_frame */
          offset_delta = 42
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerateAll$1, class java/lang/Object, class java/util/List, class kotlin/jvm/internal/Ref$IntRef, class kotlin/jvm/internal/Ref$IntRef, class java/lang/Iterable, class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface, class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands, int, int, class java/util/Iterator, class java/lang/Object, top, top, int, int, int, int, int, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult, class java/lang/Iterable, int, int, int, class java/lang/Iterable, class java/util/Collection, int, int, class java/util/Iterator, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 143
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerateAll$1, class java/lang/Object, class java/util/List, class kotlin/jvm/internal/Ref$IntRef, class kotlin/jvm/internal/Ref$IntRef, class java/lang/Iterable, class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface, class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands, int, int, class java/util/Iterator, class java/lang/Object, top, top, int, int, int, int, int, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = [ class java/lang/Exception ]
        frame_type = 255 /* full_frame */
          offset_delta = 42
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerateAll$1, class java/lang/Object, class java/util/List, class kotlin/jvm/internal/Ref$IntRef, class kotlin/jvm/internal/Ref$IntRef, class java/lang/Iterable, class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface, class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands, int, int, class java/util/Iterator, class java/lang/Object, top, top, int, int, int, int, int, int, class java/lang/Object, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 3
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerateAll$1, class java/lang/Object, class java/util/List, class kotlin/jvm/internal/Ref$IntRef, class kotlin/jvm/internal/Ref$IntRef, class java/lang/Iterable, class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface, class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands, int, int, class java/util/Iterator, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 39
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerateAll$1, class java/lang/Object, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = []
      LineNumberTable:
        line 201: 3
        line 202: 36
        line 202: 46
        line 204: 47
        line 205: 56
        line 206: 67
        line 207: 103
        line 205: 126
        line 204: 132
        line 212: 138
        line 213: 147
        line 214: 158
        line 217: 162
        line 218: 182
        line 219: 189
        line 220: 200
        line 223: 204
        line 224: 212
        line 226: 221
        line 577: 242
        line 578: 245
        line 578: 290
        line 227: 328
        line 228: 344
        line 230: 372
        line 231: 373
        line 232: 387
        line 201: 516
        line 234: 648
        line 235: 648
        line 236: 650
        line 237: 652
        line 579: 669
        line 580: 695
        line 581: 698
        line 582: 726
        line 582: 745
        line 237: 759
        line 582: 777
        line 583: 786
        line 579: 791
        line 237: 803
        line 238: 806
        line 239: 811
        line 240: 821
        line 241: 831
        line 242: 834
        line 234: 839
        line 245: 880
        line 246: 909
        line 247: 930
        line 248: 932
        line 249: 953
        line 251: 973
        line 578: 974
        line 584: 977
        line 253: 978
        line 254: 990
        line 255: 1013
        line 201: 1017
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           60      72     4     y   I
           50      88     3     x   I
          759      15    35 $i$a$-mapIndexed-L2BRAdminCommands$handleGenerateAll$1$1$region$1   I
          756      18    33   idx   I
          756      18    32  node   Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;
          726      57    30 item$iv$iv   Ljava/lang/Object;
          695      93    27 $i$f$mapIndexedTo   I
          698      90    28 index$iv$iv   I
          692      96    25 $this$mapIndexedTo$iv$iv   Ljava/lang/Iterable;
          692      96    26 destination$iv$iv   Ljava/util/Collection;
          669     123    24 $i$f$mapIndexed   I
          666     126    21 $this$mapIndexed$iv   Ljava/lang/Iterable;
          387     132    19 indexer   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;
          648     277    20 result   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult;
          880      45    36 region   Lext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion;
          932      41    20     e   Ljava/lang/Exception;
          344     175    18 percent   I
          302     217    15 $i$a$-forEachIndexed-L2BRAdminCommands$handleGenerateAll$1$1   I
          315     204    16     x   I
          328     191    17     y   I
          299     220    14 index   I
          273     246    11 item$iv   Ljava/lang/Object;
          242     277     8 $i$f$forEachIndexed   I
          245     274     9 index$iv   I
          239     280     5 $this$forEachIndexed$iv   Ljava/lang/Iterable;
           47     472     2 availableRegions   Ljava/util/List;
          212     307     3 success   Lkotlin/jvm/internal/Ref$IntRef;
          221     298     4 failed   Lkotlin/jvm/internal/Ref$IntRef;
            0    1028     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerateAll$1;
            0    1028     1 $result   Ljava/lang/Object;
          637     380     2 availableRegions   Ljava/util/List;
          629     388     3 success   Lkotlin/jvm/internal/Ref$IntRef;
          621     396     4 failed   Lkotlin/jvm/internal/Ref$IntRef;
          612     366     5 $this$forEachIndexed$iv   Ljava/lang/Iterable;
          576     398    11 item$iv   Ljava/lang/Object;
          570     355    19 indexer   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;
          561     417     8 $i$f$forEachIndexed   I
          555     423     9 index$iv   I
          549     425    14 index   I
          543     431    15 $i$a$-forEachIndexed-L2BRAdminCommands$handleGenerateAll$1$1   I
          537     437    16     x   I
          531     443    17     y   I
          525     448    18 percent   I

  public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object, kotlin.coroutines.Continuation<?>);
    descriptor: (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=6, locals=3, args_size=3
         0: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerateAll$1
         3: dup
         4: aload_0
         5: getfield      #14                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;
         8: aload_0
         9: getfield      #18                 // Field $admin:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;
        12: aload_0
        13: getfield      #22                 // Field $force:Z
        16: aload_2
        17: invokespecial #391                // Method "<init>":(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;ZLkotlin/coroutines/Continuation;)V
        20: checkcast     #393                // class kotlin/coroutines/Continuation
        23: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      24     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerateAll$1;
            0      24     1 value   Ljava/lang/Object;
            0      24     2 $completion   Lkotlin/coroutines/Continuation;
    Signature: #389                         // (Ljava/lang/Object;Lkotlin/coroutines/Continuation<*>;)Lkotlin/coroutines/Continuation<Lkotlin/Unit;>;

  public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>);
    descriptor: (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: aload_2
         3: invokevirtual #399                // Method create:(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
         6: checkcast     #2                  // class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerateAll$1
         9: getstatic     #151                // Field kotlin/Unit.INSTANCE:Lkotlin/Unit;
        12: invokevirtual #401                // Method invokeSuspend:(Ljava/lang/Object;)Ljava/lang/Object;
        15: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerateAll$1;
            0      16     1    p1   Lkotlinx/coroutines/CoroutineScope;
            0      16     2    p2   Lkotlin/coroutines/Continuation;
    Signature: #397                         // (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Lkotlin/Unit;>;)Ljava/lang/Object;

  public java.lang.Object invoke(java.lang.Object, java.lang.Object);
    descriptor: (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: checkcast     #407                // class kotlinx/coroutines/CoroutineScope
         5: aload_2
         6: checkcast     #393                // class kotlin/coroutines/Continuation
         9: invokevirtual #409                // Method invoke:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
        12: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerateAll$1;
            0      13     1    p1   Ljava/lang/Object;
            0      13     2    p2   Ljava/lang/Object;
}
InnerClasses:
  public static #424= #111 of #209;       // GeoDataProvider=class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider of class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
  public static final #425= #255 of #209; // IndexationResult=class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult of class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
  public static #426= #141 of #105;       // AdminInterface=class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface of class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands
  static final #2;                        // class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerateAll$1
  public static final #429= #171 of #428; // IntRef=class kotlin/jvm/internal/Ref$IntRef of class kotlin/jvm/internal/Ref
EnclosingMethod: #105.#423              // ext.mods.gameserver.geoengine.pathfinding.integration.L2BRAdminCommands.handleGenerateAll
Signature: #3                           // Lkotlin/coroutines/jvm/internal/SuspendLambda;Lkotlin/jvm/functions/Function2<Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Lkotlin/Unit;>;Ljava/lang/Object;>;
SourceFile: "AdminCommands.kt"
SourceDebugExtension:
  SMAP
  AdminCommands.kt
  Kotlin
  *S Kotlin
  *F
  + 1 AdminCommands.kt
  ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerateAll$1
  + 2 _Collections.kt
  kotlin/collections/CollectionsKt___CollectionsKt
  *L
  1#1,576:1
  1924#2,2:577
  1596#2:579
  1629#2,4:580
  1926#2:584
  *S KotlinDebug
  *F
  + 1 AdminCommands.kt
  ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerateAll$1
  *L
  226#1:577,2
  237#1:579
  237#1:580,4
  226#1:584
  *E
RuntimeVisibleAnnotations:
  0: #51(#52=s#53,#54=[I#55],#56=[I#57],#58=[I#59,I#59,I#59,I#59,I#59,I#59,I#59,I#59,I#59,I#59,I#59,I#59,I#59],#60=[s#33,s#35,s#36,s#37,s#41,s#42,s#43,s#45,s#46,s#47,s#48,s#49,s#50],#61=[s#62,s#63,s#64,s#65,s#66,s#67,s#68,s#69,s#70,s#71,s#72,s#73,s#74],#75=s#31,#76=s#77,#78=I#79)
    kotlin.coroutines.jvm.internal.DebugMetadata(
      f="AdminCommands.kt"
      l=[232]
      nl=[234]
      i=[0,0,0,0,0,0,0,0,0,0,0,0,0]
      s=["L$0","L$1","L$2","L$3","L$7","L$8","I$0","I$1","I$2","I$3","I$4","I$5","I$6"]
      n=["availableRegions","success","failed","$this$forEachIndexed$iv","item$iv","indexer","$i$f$forEachIndexed","index$iv","index","$i$a$-forEachIndexed-L2BRAdminCommands$handleGenerateAll$1$1","x","y","percent"]
      m="invokeSuspend"
      c="ext.mods.gameserver.geoengine.pathfinding.integration.L2BRAdminCommands$handleGenerateAll$1"
      v=2
    )
  1: #410(#411=[I#79,I#412,I#59],#413=I#412,#414=I#415,#416=[s#417],#418=[s#419,s#420,s#403])
    kotlin.Metadata(
      mv=[2,3,0]
      k=3
      xi=48
      d1=["\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"]
      d2=["<anonymous>","","Lkotlinx/coroutines/CoroutineScope;"]
    )
RuntimeInvisibleAnnotations:
  0: #430(#394=[s#431])
    kotlin.jvm.internal.SourceDebugExtension(
      value=["SMAP\nAdminCommands.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdminCommands.kt\next/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerateAll$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,576:1\n1924#2,2:577\n1596#2:579\n1629#2,4:580\n1926#2:584\n*S KotlinDebug\n*F\n+ 1 AdminCommands.kt\next/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerateAll$1\n*L\n226#1:577,2\n237#1:579\n237#1:580,4\n226#1:584\n*E\n"]
    )
BootstrapMethods:
  0: #164 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #157 Encontradas §a\u0001 §7regiões para gerar.
  1: #164 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #204 [\u0001%] Processando [\u0001, \u0001] (\u0001/\u0001)...
  2: #164 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #323 \u0001_\u0001.l2br
  3: #164 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #347   Falha em [\u0001, \u0001]: \u0001
  4: #164 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #354 Sucesso: \u0001 | Falhas: \u0001
