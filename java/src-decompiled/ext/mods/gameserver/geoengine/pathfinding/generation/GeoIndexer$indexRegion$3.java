// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$indexRegion$3
// File: ext\mods\gameserver\geoengine\pathfinding\generation\GeoIndexer$indexRegion$3.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3.class
  Last modified 9 de jul de 2026; size 18034 bytes
  MD5 checksum 74227c7b5fa64271261c7e7d4493b906
  Compiled from "GeoIndexer.kt"
final class ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$indexRegion$3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$IndexationResult>, java.lang.Object>
  minor version: 0
  major version: 69
  flags: (0x0030) ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3
  super_class: #5                         // kotlin/coroutines/jvm/internal/SuspendLambda
  interfaces: 1, fields: 27, methods: 5, attributes: 8
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3
    #2 = Class              #1            // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3
    #3 = Utf8               Lkotlin/coroutines/jvm/internal/SuspendLambda;Lkotlin/jvm/functions/Function2<Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult;>;Ljava/lang/Object;>;
    #4 = Utf8               kotlin/coroutines/jvm/internal/SuspendLambda
    #5 = Class              #4            // kotlin/coroutines/jvm/internal/SuspendLambda
    #6 = Utf8               kotlin/jvm/functions/Function2
    #7 = Class              #6            // kotlin/jvm/functions/Function2
    #8 = Utf8               <init>
    #9 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;IILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V
   #10 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;IILkotlin/jvm/functions/Function2<-Ljava/lang/String;-Ljava/lang/Integer;Lkotlin/Unit;>;Lkotlin/coroutines/Continuation<-Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3;>;)V
   #11 = Utf8               this$0
   #12 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;
   #13 = NameAndType        #11:#12       // this$0:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;
   #14 = Fieldref           #2.#13        // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3.this$0:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;
   #15 = Utf8               $regionX
   #16 = Utf8               I
   #17 = NameAndType        #15:#16       // $regionX:I
   #18 = Fieldref           #2.#17        // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3.$regionX:I
   #19 = Utf8               $regionY
   #20 = NameAndType        #19:#16       // $regionY:I
   #21 = Fieldref           #2.#20        // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3.$regionY:I
   #22 = Utf8               $onProgress
   #23 = Utf8               Lkotlin/jvm/functions/Function2;
   #24 = NameAndType        #22:#23       // $onProgress:Lkotlin/jvm/functions/Function2;
   #25 = Fieldref           #2.#24        // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3.$onProgress:Lkotlin/jvm/functions/Function2;
   #26 = Utf8               (ILkotlin/coroutines/Continuation;)V
   #27 = NameAndType        #8:#26        // "<init>":(ILkotlin/coroutines/Continuation;)V
   #28 = Methodref          #5.#27        // kotlin/coroutines/jvm/internal/SuspendLambda."<init>":(ILkotlin/coroutines/Continuation;)V
   #29 = Utf8               this
   #30 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3;
   #31 = Utf8               $receiver
   #32 = Utf8               $completion
   #33 = Utf8               Lkotlin/coroutines/Continuation;
   #34 = Utf8               invokeSuspend
   #35 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #36 = Utf8               L$1
   #37 = Utf8               Ljava/lang/Object;
   #38 = Utf8               L$2
   #39 = Utf8               L$3
   #40 = Utf8               L$4
   #41 = Utf8               L$5
   #42 = Utf8               L$6
   #43 = Utf8               L$7
   #44 = Utf8               L$8
   #45 = Utf8               L$9
   #46 = Utf8               L$10
   #47 = Utf8               J$0
   #48 = Utf8               J
   #49 = Utf8               Z$0
   #50 = Utf8               Z
   #51 = Utf8               Z$1
   #52 = Utf8               I$0
   #53 = Utf8               I$1
   #54 = Utf8               I$2
   #55 = Utf8               I$3
   #56 = Utf8               I$4
   #57 = Utf8               I$5
   #58 = Utf8               I$6
   #59 = Utf8               I$7
   #60 = Utf8               Lkotlin/coroutines/jvm/internal/DebugMetadata;
   #61 = Utf8               f
   #62 = Utf8               GeoIndexer.kt
   #63 = Utf8               l
   #64 = Integer            361
   #65 = Integer            366
   #66 = Utf8               nl
   #67 = Integer            477
   #68 = Integer            368
   #69 = Utf8               i
   #70 = Integer            0
   #71 = Integer            1
   #72 = Utf8               s
   #73 = Utf8               L$0
   #74 = Utf8               n
   #75 = Utf8               $this$withContext
   #76 = Utf8               sourceInfo
   #77 = Utf8               processed
   #78 = Utf8               chunks
   #79 = Utf8               nodeChannel
   #80 = Utf8               collectorDeferred
   #81 = Utf8               chunkJobs
   #82 = Utf8               $this$forEach$iv
   #83 = Utf8               element$iv
   #84 = Utf8               it
   #85 = Utf8               startTime
   #86 = Utf8               hasL2J
   #87 = Utf8               hasConvDat
   #88 = Utf8               baseGeoX
   #89 = Utf8               baseGeoY
   #90 = Utf8               maxGeoX
   #91 = Utf8               maxGeoY
   #92 = Utf8               totalCells
   #93 = Utf8               chunkSize
   #94 = Utf8               $i$f$forEach
   #95 = Utf8               $i$a$-forEach-GeoIndexer$indexRegion$3$1
   #96 = Utf8               m
   #97 = Utf8               c
   #98 = Utf8               ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$indexRegion$3
   #99 = Utf8               v
  #100 = Integer            2
  #101 = NameAndType        #73:#37       // L$0:Ljava/lang/Object;
  #102 = Fieldref           #2.#101       // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3.L$0:Ljava/lang/Object;
  #103 = Utf8               kotlinx/coroutines/CoroutineScope
  #104 = Class              #103          // kotlinx/coroutines/CoroutineScope
  #105 = Utf8               kotlin/coroutines/intrinsics/IntrinsicsKt
  #106 = Class              #105          // kotlin/coroutines/intrinsics/IntrinsicsKt
  #107 = Utf8               getCOROUTINE_SUSPENDED
  #108 = Utf8               ()Ljava/lang/Object;
  #109 = NameAndType        #107:#108     // getCOROUTINE_SUSPENDED:()Ljava/lang/Object;
  #110 = Methodref          #106.#109     // kotlin/coroutines/intrinsics/IntrinsicsKt.getCOROUTINE_SUSPENDED:()Ljava/lang/Object;
  #111 = Utf8               label
  #112 = NameAndType        #111:#16      // label:I
  #113 = Fieldref           #2.#112       // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3.label:I
  #114 = Utf8               kotlin/ResultKt
  #115 = Class              #114          // kotlin/ResultKt
  #116 = Utf8               throwOnFailure
  #117 = Utf8               (Ljava/lang/Object;)V
  #118 = NameAndType        #116:#117     // throwOnFailure:(Ljava/lang/Object;)V
  #119 = Methodref          #115.#118     // kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
  #120 = Utf8               java/lang/System
  #121 = Class              #120          // java/lang/System
  #122 = Utf8               currentTimeMillis
  #123 = Utf8               ()J
  #124 = NameAndType        #122:#123     // currentTimeMillis:()J
  #125 = Methodref          #121.#124     // java/lang/System.currentTimeMillis:()J
  #126 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
  #127 = Class              #126          // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
  #128 = Utf8               access$getGeoDataProvider$p
  #129 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;
  #130 = NameAndType        #128:#129     // access$getGeoDataProvider$p:(Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;
  #131 = Methodref          #127.#130     // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer.access$getGeoDataProvider$p:(Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;
  #132 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider
  #133 = Class              #132          // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider
  #134 = Utf8               hasL2JData
  #135 = Utf8               (II)Z
  #136 = NameAndType        #134:#135     // hasL2JData:(II)Z
  #137 = InterfaceMethodref #133.#136     // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider.hasL2JData:(II)Z
  #138 = Utf8               hasConvDatData
  #139 = NameAndType        #138:#135     // hasConvDatData:(II)Z
  #140 = InterfaceMethodref #133.#139     // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider.hasConvDatData:(II)Z
  #141 = Utf8               java/lang/IllegalStateException
  #142 = Class              #141          // java/lang/IllegalStateException
  #143 = Utf8               Nenhuma fonte de dados encontrada para região [\u0001, \u0001]. Procure por: \u0001_\u0001.l2j ou \u0001_\u0001_conv.dat
  #144 = String             #143          // Nenhuma fonte de dados encontrada para região [\u0001, \u0001]. Procure por: \u0001_\u0001.l2j ou \u0001_\u0001_conv.dat
  #145 = Utf8               java/lang/invoke/StringConcatFactory
  #146 = Class              #145          // java/lang/invoke/StringConcatFactory
  #147 = Utf8               makeConcatWithConstants
  #148 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #149 = NameAndType        #147:#148     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #150 = Methodref          #146.#149     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #151 = MethodHandle       6:#150        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #152 = Utf8               (IIIIII)Ljava/lang/String;
  #153 = NameAndType        #147:#152     // makeConcatWithConstants:(IIIIII)Ljava/lang/String;
  #154 = InvokeDynamic      #0:#153       // #0:makeConcatWithConstants:(IIIIII)Ljava/lang/String;
  #155 = Utf8               (Ljava/lang/String;)V
  #156 = NameAndType        #8:#155       // "<init>":(Ljava/lang/String;)V
  #157 = Methodref          #142.#156     // java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
  #158 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo
  #159 = Class              #158          // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo
  #160 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource
  #161 = Class              #160          // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource
  #162 = Utf8               MERGED
  #163 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;
  #164 = NameAndType        #162:#163     // MERGED:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;
  #165 = Fieldref           #161.#164     // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource.MERGED:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;
  #166 = Utf8               L2J_ONLY
  #167 = NameAndType        #166:#163     // L2J_ONLY:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;
  #168 = Fieldref           #161.#167     // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource.L2J_ONLY:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;
  #169 = Utf8               CONV_DAT_ONLY
  #170 = NameAndType        #169:#163     // CONV_DAT_ONLY:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;
  #171 = Fieldref           #161.#170     // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource.CONV_DAT_ONLY:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;
  #172 = Utf8               NONE
  #173 = NameAndType        #172:#163     // NONE:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;
  #174 = Fieldref           #161.#173     // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource.NONE:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;
  #175 = Utf8               getSourcePriority
  #176 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;
  #177 = NameAndType        #175:#176     // getSourcePriority:()Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;
  #178 = InterfaceMethodref #133.#177     // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider.getSourcePriority:()Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;
  #179 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority
  #180 = Class              #179          // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority
  #181 = Utf8               MERGE
  #182 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;
  #183 = NameAndType        #181:#182     // MERGE:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;
  #184 = Fieldref           #180.#183     // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority.MERGE:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;
  #185 = Utf8               (ZZLext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;Z)V
  #186 = NameAndType        #8:#185       // "<init>":(ZZLext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;Z)V
  #187 = Methodref          #159.#186     // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo."<init>":(ZZLext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;Z)V
  #188 = Utf8               Fontes detectadas: L2J=\u0001, ConvDat=\u0001
  #189 = String             #188          // Fontes detectadas: L2J=\u0001, ConvDat=\u0001
  #190 = Utf8               (ZZ)Ljava/lang/String;
  #191 = NameAndType        #147:#190     // makeConcatWithConstants:(ZZ)Ljava/lang/String;
  #192 = InvokeDynamic      #1:#191       // #1:makeConcatWithConstants:(ZZ)Ljava/lang/String;
  #193 = Utf8               kotlin/coroutines/jvm/internal/Boxing
  #194 = Class              #193          // kotlin/coroutines/jvm/internal/Boxing
  #195 = Utf8               boxInt
  #196 = Utf8               (I)Ljava/lang/Integer;
  #197 = NameAndType        #195:#196     // boxInt:(I)Ljava/lang/Integer;
  #198 = Methodref          #194.#197     // kotlin/coroutines/jvm/internal/Boxing.boxInt:(I)Ljava/lang/Integer;
  #199 = Utf8               invoke
  #200 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #201 = NameAndType        #199:#200     // invoke:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #202 = InterfaceMethodref #7.#201       // kotlin/jvm/functions/Function2.invoke:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #203 = Integer            32768
  #204 = Utf8               java/lang/Math
  #205 = Class              #204          // java/lang/Math
  #206 = Utf8               min
  #207 = Utf8               (II)I
  #208 = NameAndType        #206:#207     // min:(II)I
  #209 = Methodref          #205.#208     // java/lang/Math.min:(II)I
  #210 = Utf8               java/util/concurrent/atomic/AtomicInteger
  #211 = Class              #210          // java/util/concurrent/atomic/AtomicInteger
  #212 = Utf8               (I)V
  #213 = NameAndType        #8:#212       // "<init>":(I)V
  #214 = Methodref          #211.#213     // java/util/concurrent/atomic/AtomicInteger."<init>":(I)V
  #215 = Utf8               Preparando chunks
  #216 = String             #215          // Preparando chunks
  #217 = Utf8               access$generateChunks
  #218 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;IIIII)Ljava/util/List;
  #219 = NameAndType        #217:#218     // access$generateChunks:(Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;IIIII)Ljava/util/List;
  #220 = Methodref          #127.#219     // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer.access$generateChunks:(Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;IIIII)Ljava/util/List;
  #221 = Utf8               java/util/List
  #222 = Class              #221          // java/util/List
  #223 = Utf8               size
  #224 = Utf8               ()I
  #225 = NameAndType        #223:#224     // size:()I
  #226 = InterfaceMethodref #222.#225     // java/util/List.size:()I
  #227 = Utf8               Indexando \u0001 chunks
  #228 = String             #227          // Indexando \u0001 chunks
  #229 = Utf8               (I)Ljava/lang/String;
  #230 = NameAndType        #147:#229     // makeConcatWithConstants:(I)Ljava/lang/String;
  #231 = InvokeDynamic      #2:#230       // #2:makeConcatWithConstants:(I)Ljava/lang/String;
  #232 = Integer            2147483647
  #233 = Utf8               kotlinx/coroutines/channels/ChannelKt
  #234 = Class              #233          // kotlinx/coroutines/channels/ChannelKt
  #235 = Utf8               Channel$default
  #236 = Utf8               (ILkotlinx/coroutines/channels/BufferOverflow;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lkotlinx/coroutines/channels/Channel;
  #237 = NameAndType        #235:#236     // Channel$default:(ILkotlinx/coroutines/channels/BufferOverflow;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lkotlinx/coroutines/channels/Channel;
  #238 = Methodref          #234.#237     // kotlinx/coroutines/channels/ChannelKt.Channel$default:(ILkotlinx/coroutines/channels/BufferOverflow;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lkotlinx/coroutines/channels/Channel;
  #239 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$collectorDeferred$1
  #240 = Class              #239          // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$collectorDeferred$1
  #241 = Utf8               (Lkotlinx/coroutines/channels/Channel;Lkotlin/coroutines/Continuation;)V
  #242 = NameAndType        #8:#241       // "<init>":(Lkotlinx/coroutines/channels/Channel;Lkotlin/coroutines/Continuation;)V
  #243 = Methodref          #240.#242     // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$collectorDeferred$1."<init>":(Lkotlinx/coroutines/channels/Channel;Lkotlin/coroutines/Continuation;)V
  #244 = Utf8               kotlinx/coroutines/BuildersKt
  #245 = Class              #244          // kotlinx/coroutines/BuildersKt
  #246 = Utf8               async$default
  #247 = Utf8               (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Deferred;
  #248 = NameAndType        #246:#247     // async$default:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Deferred;
  #249 = Methodref          #245.#248     // kotlinx/coroutines/BuildersKt.async$default:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Deferred;
  #250 = Utf8               java/lang/Iterable
  #251 = Class              #250          // java/lang/Iterable
  #252 = Utf8               java/util/ArrayList
  #253 = Class              #252          // java/util/ArrayList
  #254 = Utf8               kotlin/collections/CollectionsKt
  #255 = Class              #254          // kotlin/collections/CollectionsKt
  #256 = Utf8               collectionSizeOrDefault
  #257 = Utf8               (Ljava/lang/Iterable;I)I
  #258 = NameAndType        #256:#257     // collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
  #259 = Methodref          #255.#258     // kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
  #260 = Methodref          #253.#213     // java/util/ArrayList."<init>":(I)V
  #261 = Utf8               java/util/Collection
  #262 = Class              #261          // java/util/Collection
  #263 = Utf8               iterator
  #264 = Utf8               ()Ljava/util/Iterator;
  #265 = NameAndType        #263:#264     // iterator:()Ljava/util/Iterator;
  #266 = InterfaceMethodref #251.#265     // java/lang/Iterable.iterator:()Ljava/util/Iterator;
  #267 = Utf8               java/util/Iterator
  #268 = Class              #267          // java/util/Iterator
  #269 = Utf8               hasNext
  #270 = Utf8               ()Z
  #271 = NameAndType        #269:#270     // hasNext:()Z
  #272 = InterfaceMethodref #268.#271     // java/util/Iterator.hasNext:()Z
  #273 = Utf8               next
  #274 = NameAndType        #273:#108     // next:()Ljava/lang/Object;
  #275 = InterfaceMethodref #268.#274     // java/util/Iterator.next:()Ljava/lang/Object;
  #276 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk
  #277 = Class              #276          // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk
  #278 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1
  #279 = Class              #278          // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1
  #280 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk;Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;ZLjava/util/concurrent/atomic/AtomicInteger;ILkotlin/jvm/functions/Function2;Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;Lkotlinx/coroutines/channels/Channel;Lkotlin/coroutines/Continuation;)V
  #281 = NameAndType        #8:#280       // "<init>":(Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk;Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;ZLjava/util/concurrent/atomic/AtomicInteger;ILkotlin/jvm/functions/Function2;Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;Lkotlinx/coroutines/channels/Channel;Lkotlin/coroutines/Continuation;)V
  #282 = Methodref          #279.#281     // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1."<init>":(Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk;Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;ZLjava/util/concurrent/atomic/AtomicInteger;ILkotlin/jvm/functions/Function2;Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;Lkotlinx/coroutines/channels/Channel;Lkotlin/coroutines/Continuation;)V
  #283 = Utf8               add
  #284 = Utf8               (Ljava/lang/Object;)Z
  #285 = NameAndType        #283:#284     // add:(Ljava/lang/Object;)Z
  #286 = InterfaceMethodref #262.#285     // java/util/Collection.add:(Ljava/lang/Object;)Z
  #287 = Utf8               kotlinx/coroutines/Deferred
  #288 = Class              #287          // kotlinx/coroutines/Deferred
  #289 = Utf8               kotlin/coroutines/jvm/internal/SpillingKt
  #290 = Class              #289          // kotlin/coroutines/jvm/internal/SpillingKt
  #291 = Utf8               nullOutSpilledVariable
  #292 = NameAndType        #291:#35      // nullOutSpilledVariable:(Ljava/lang/Object;)Ljava/lang/Object;
  #293 = Methodref          #290.#292     // kotlin/coroutines/jvm/internal/SpillingKt.nullOutSpilledVariable:(Ljava/lang/Object;)Ljava/lang/Object;
  #294 = NameAndType        #36:#37       // L$1:Ljava/lang/Object;
  #295 = Fieldref           #2.#294       // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3.L$1:Ljava/lang/Object;
  #296 = NameAndType        #38:#37       // L$2:Ljava/lang/Object;
  #297 = Fieldref           #2.#296       // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3.L$2:Ljava/lang/Object;
  #298 = NameAndType        #39:#37       // L$3:Ljava/lang/Object;
  #299 = Fieldref           #2.#298       // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3.L$3:Ljava/lang/Object;
  #300 = NameAndType        #40:#37       // L$4:Ljava/lang/Object;
  #301 = Fieldref           #2.#300       // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3.L$4:Ljava/lang/Object;
  #302 = NameAndType        #41:#37       // L$5:Ljava/lang/Object;
  #303 = Fieldref           #2.#302       // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3.L$5:Ljava/lang/Object;
  #304 = NameAndType        #42:#37       // L$6:Ljava/lang/Object;
  #305 = Fieldref           #2.#304       // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3.L$6:Ljava/lang/Object;
  #306 = NameAndType        #43:#37       // L$7:Ljava/lang/Object;
  #307 = Fieldref           #2.#306       // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3.L$7:Ljava/lang/Object;
  #308 = NameAndType        #44:#37       // L$8:Ljava/lang/Object;
  #309 = Fieldref           #2.#308       // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3.L$8:Ljava/lang/Object;
  #310 = NameAndType        #45:#37       // L$9:Ljava/lang/Object;
  #311 = Fieldref           #2.#310       // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3.L$9:Ljava/lang/Object;
  #312 = NameAndType        #46:#37       // L$10:Ljava/lang/Object;
  #313 = Fieldref           #2.#312       // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3.L$10:Ljava/lang/Object;
  #314 = NameAndType        #47:#48       // J$0:J
  #315 = Fieldref           #2.#314       // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3.J$0:J
  #316 = NameAndType        #49:#50       // Z$0:Z
  #317 = Fieldref           #2.#316       // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3.Z$0:Z
  #318 = NameAndType        #51:#50       // Z$1:Z
  #319 = Fieldref           #2.#318       // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3.Z$1:Z
  #320 = NameAndType        #52:#16       // I$0:I
  #321 = Fieldref           #2.#320       // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3.I$0:I
  #322 = NameAndType        #53:#16       // I$1:I
  #323 = Fieldref           #2.#322       // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3.I$1:I
  #324 = NameAndType        #54:#16       // I$2:I
  #325 = Fieldref           #2.#324       // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3.I$2:I
  #326 = NameAndType        #55:#16       // I$3:I
  #327 = Fieldref           #2.#326       // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3.I$3:I
  #328 = NameAndType        #56:#16       // I$4:I
  #329 = Fieldref           #2.#328       // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3.I$4:I
  #330 = NameAndType        #57:#16       // I$5:I
  #331 = Fieldref           #2.#330       // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3.I$5:I
  #332 = NameAndType        #58:#16       // I$6:I
  #333 = Fieldref           #2.#332       // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3.I$6:I
  #334 = NameAndType        #59:#16       // I$7:I
  #335 = Fieldref           #2.#334       // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3.I$7:I
  #336 = Utf8               await
  #337 = Utf8               (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #338 = NameAndType        #336:#337     // await:(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #339 = InterfaceMethodref #288.#338     // kotlinx/coroutines/Deferred.await:(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #340 = Utf8               kotlinx/coroutines/channels/Channel
  #341 = Class              #340          // kotlinx/coroutines/channels/Channel
  #342 = Utf8               kotlinx/coroutines/channels/SendChannel
  #343 = Class              #342          // kotlinx/coroutines/channels/SendChannel
  #344 = Utf8               kotlinx/coroutines/channels/SendChannel$DefaultImpls
  #345 = Class              #344          // kotlinx/coroutines/channels/SendChannel$DefaultImpls
  #346 = Utf8               close$default
  #347 = Utf8               (Lkotlinx/coroutines/channels/SendChannel;Ljava/lang/Throwable;ILjava/lang/Object;)Z
  #348 = NameAndType        #346:#347     // close$default:(Lkotlinx/coroutines/channels/SendChannel;Ljava/lang/Throwable;ILjava/lang/Object;)Z
  #349 = Methodref          #345.#348     // kotlinx/coroutines/channels/SendChannel$DefaultImpls.close$default:(Lkotlinx/coroutines/channels/SendChannel;Ljava/lang/Throwable;ILjava/lang/Object;)Z
  #350 = Utf8               Finalizando coleta
  #351 = String             #350          // Finalizando coleta
  #352 = Utf8               kotlin/coroutines/Continuation
  #353 = Class              #352          // kotlin/coroutines/Continuation
  #354 = Utf8               throwIndexOverflow
  #355 = Utf8               ()V
  #356 = NameAndType        #354:#355     // throwIndexOverflow:()V
  #357 = Methodref          #255.#356     // kotlin/collections/CollectionsKt.throwIndexOverflow:()V
  #358 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode
  #359 = Class              #358          // ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode
  #360 = Utf8               copy$default
  #361 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;IIISBILext/mods/gameserver/geoengine/pathfinding/model/BlockType;ILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;
  #362 = NameAndType        #360:#361     // copy$default:(Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;IIISBILext/mods/gameserver/geoengine/pathfinding/model/BlockType;ILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;
  #363 = Methodref          #359.#362     // ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode.copy$default:(Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;IIISBILext/mods/gameserver/geoengine/pathfinding/model/BlockType;ILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;
  #364 = Utf8               isEmpty
  #365 = NameAndType        #364:#270     // isEmpty:()Z
  #366 = InterfaceMethodref #262.#365     // java/util/Collection.isEmpty:()Z
  #367 = Utf8               isWalkable
  #368 = NameAndType        #367:#270     // isWalkable:()Z
  #369 = Methodref          #359.#368     // ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode.isWalkable:()Z
  #370 = Utf8               throwCountOverflow
  #371 = NameAndType        #370:#355     // throwCountOverflow:()V
  #372 = Methodref          #255.#371     // kotlin/collections/CollectionsKt.throwCountOverflow:()V
  #373 = Utf8               getBlockType
  #374 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
  #375 = NameAndType        #373:#374     // getBlockType:()Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
  #376 = Methodref          #359.#375     // ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode.getBlockType:()Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
  #377 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/BlockType
  #378 = Class              #377          // ext/mods/gameserver/geoengine/pathfinding/model/BlockType
  #379 = Utf8               MULTILAYER
  #380 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
  #381 = NameAndType        #379:#380     // MULTILAYER:Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
  #382 = Fieldref           #378.#381     // ext/mods/gameserver/geoengine/pathfinding/model/BlockType.MULTILAYER:Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
  #383 = Utf8               getPrimarySource
  #384 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;
  #385 = NameAndType        #383:#384     // getPrimarySource:()Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;
  #386 = Methodref          #159.#385     // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo.getPrimarySource:()Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;
  #387 = Utf8               Indexação concluída (\u0001)
  #388 = String             #387          // Indexação concluída (\u0001)
  #389 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;)Ljava/lang/String;
  #390 = NameAndType        #147:#389     // makeConcatWithConstants:(Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;)Ljava/lang/String;
  #391 = InvokeDynamic      #3:#390       // #3:makeConcatWithConstants:(Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;)Ljava/lang/String;
  #392 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult
  #393 = Class              #392          // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult
  #394 = Utf8               (IILjava/util/List;IIJLext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;)V
  #395 = NameAndType        #8:#394       // "<init>":(IILjava/util/List;IIJLext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;)V
  #396 = Methodref          #393.#395     // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult."<init>":(IILjava/util/List;IIJLext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;)V
  #397 = Utf8               call to \'resume\' before \'invoke\' with coroutine
  #398 = String             #397          // call to \'resume\' before \'invoke\' with coroutine
  #399 = Utf8               $i$a$-map-GeoIndexer$indexRegion$3$chunkJobs$1
  #400 = Utf8               chunk
  #401 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk;
  #402 = Utf8               item$iv$iv
  #403 = Utf8               $i$f$mapTo
  #404 = Utf8               $this$mapTo$iv$iv
  #405 = Utf8               Ljava/lang/Iterable;
  #406 = Utf8               destination$iv$iv
  #407 = Utf8               Ljava/util/Collection;
  #408 = Utf8               $i$f$map
  #409 = Utf8               $this$map$iv
  #410 = Utf8               Lkotlinx/coroutines/Deferred;
  #411 = Utf8               $i$a$-mapIndexed-GeoIndexer$indexRegion$3$nodesWithIds$1
  #412 = Utf8               index
  #413 = Utf8               node
  #414 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;
  #415 = Utf8               $i$f$mapIndexedTo
  #416 = Utf8               index$iv$iv
  #417 = Utf8               $this$mapIndexedTo$iv$iv
  #418 = Utf8               $i$f$mapIndexed
  #419 = Utf8               $this$mapIndexed$iv
  #420 = Utf8               $i$a$-count-GeoIndexer$indexRegion$3$walkableCount$1
  #421 = Utf8               $i$f$count
  #422 = Utf8               count$iv
  #423 = Utf8               $this$count$iv
  #424 = Utf8               $i$a$-count-GeoIndexer$indexRegion$3$multilayerCount$1
  #425 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;
  #426 = Utf8               Ljava/util/concurrent/atomic/AtomicInteger;
  #427 = Utf8               Ljava/util/List;
  #428 = Utf8               Lkotlinx/coroutines/channels/Channel;
  #429 = Utf8               allNodes
  #430 = Utf8               nodesWithIds
  #431 = Utf8               walkableCount
  #432 = Utf8               multilayerCount
  #433 = Utf8               $result
  #434 = Utf8               Lkotlinx/coroutines/CoroutineScope;
  #435 = Utf8               java/lang/Object
  #436 = Class              #435          // java/lang/Object
  #437 = Utf8               create
  #438 = Utf8               (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
  #439 = Utf8               (Ljava/lang/Object;Lkotlin/coroutines/Continuation<*>;)Lkotlin/coroutines/Continuation<Lkotlin/Unit;>;
  #440 = NameAndType        #8:#9         // "<init>":(Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;IILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V
  #441 = Methodref          #2.#440       // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3."<init>":(Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;IILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V
  #442 = Utf8               value
  #443 = Utf8               (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #444 = Utf8               (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult;>;)Ljava/lang/Object;
  #445 = NameAndType        #437:#438     // create:(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
  #446 = Methodref          #2.#445       // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3.create:(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
  #447 = Utf8               kotlin/Unit
  #448 = Class              #447          // kotlin/Unit
  #449 = Utf8               INSTANCE
  #450 = Utf8               Lkotlin/Unit;
  #451 = NameAndType        #449:#450     // INSTANCE:Lkotlin/Unit;
  #452 = Fieldref           #448.#451     // kotlin/Unit.INSTANCE:Lkotlin/Unit;
  #453 = NameAndType        #34:#35       // invokeSuspend:(Ljava/lang/Object;)Ljava/lang/Object;
  #454 = Methodref          #2.#453       // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3.invokeSuspend:(Ljava/lang/Object;)Ljava/lang/Object;
  #455 = Utf8               p1
  #456 = Utf8               p2
  #457 = NameAndType        #199:#443     // invoke:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #458 = Methodref          #2.#457       // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3.invoke:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #459 = Utf8               Lkotlin/jvm/functions/Function2<Ljava/lang/String;Ljava/lang/Integer;Lkotlin/Unit;>;
  #460 = Utf8               Lkotlin/Metadata;
  #461 = Utf8               mv
  #462 = Integer            3
  #463 = Utf8               k
  #464 = Utf8               xi
  #465 = Integer            48
  #466 = Utf8               d1
  #467 = Utf8               \u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n
  #468 = Utf8               d2
  #469 = Utf8               <anonymous>
  #470 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult;
  #471 = Utf8               indexRegion
  #472 = Utf8               (IIILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #473 = NameAndType        #471:#472     // indexRegion:(IIILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #474 = Utf8               Chunk
  #475 = Utf8               DataSource
  #476 = Utf8               GeoDataProvider
  #477 = Utf8               SourcePriority
  #478 = Utf8               IndexationResult
  #479 = Utf8               SourceInfo
  #480 = Utf8               DefaultImpls
  #481 = Utf8               Lkotlin/jvm/internal/SourceDebugExtension;
  #482 = Utf8               SMAP\nGeoIndexer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GeoIndexer.kt\next/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,472:1\n1586#2:473\n1661#2,3:474\n1915#2,2:477\n1596#2:479\n1629#2,4:480\n1834#2,4:484\n1834#2,4:488\n*S KotlinDebug\n*F\n+ 1 GeoIndexer.kt\next/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3\n*L\n305#1:473\n305#1:474,3\n361#1:477,2\n368#1:479\n368#1:480,4\n372#1:484,4\n373#1:488,4\n*E\n
  #483 = Utf8               Signature
  #484 = Utf8               Code
  #485 = Utf8               LocalVariableTable
  #486 = Utf8               StackMapTable
  #487 = Utf8               LineNumberTable
  #488 = Utf8               InnerClasses
  #489 = Utf8               EnclosingMethod
  #490 = Utf8               SourceFile
  #491 = Utf8               SourceDebugExtension
  #492 = Utf8               RuntimeVisibleAnnotations
  #493 = Utf8               RuntimeInvisibleAnnotations
  #494 = Utf8               BootstrapMethods
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

  java.lang.Object L$9;
    descriptor: Ljava/lang/Object;
    flags: (0x0000)

  java.lang.Object L$10;
    descriptor: Ljava/lang/Object;
    flags: (0x0000)

  long J$0;
    descriptor: J
    flags: (0x0000)

  boolean Z$0;
    descriptor: Z
    flags: (0x0000)

  boolean Z$1;
    descriptor: Z
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

  int I$7;
    descriptor: I
    flags: (0x0000)

  int label;
    descriptor: I
    flags: (0x0000)

  final ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer this$0;
    descriptor: Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  final int $regionX;
    descriptor: I
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  final int $regionY;
    descriptor: I
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  final kotlin.jvm.functions.Function2<java.lang.String, java.lang.Integer, kotlin.Unit> $onProgress;
    descriptor: Lkotlin/jvm/functions/Function2;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC
    Signature: #459                         // Lkotlin/jvm/functions/Function2<Ljava/lang/String;Ljava/lang/Integer;Lkotlin/Unit;>;

  ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$indexRegion$3(ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer, int, int, kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Integer, kotlin.Unit>, kotlin.coroutines.Continuation<? super ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$indexRegion$3>);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;IILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V
    flags: (0x0000)
    Code:
      stack=3, locals=6, args_size=6
         0: aload_0
         1: aload_1
         2: putfield      #14                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;
         5: aload_0
         6: iload_2
         7: putfield      #18                 // Field $regionX:I
        10: aload_0
        11: iload_3
        12: putfield      #21                 // Field $regionY:I
        15: aload_0
        16: aload         4
        18: putfield      #25                 // Field $onProgress:Lkotlin/jvm/functions/Function2;
        21: aload_0
        22: iconst_2
        23: aload         5
        25: invokespecial #28                 // Method kotlin/coroutines/jvm/internal/SuspendLambda."<init>":(ILkotlin/coroutines/Continuation;)V
        28: return
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      29     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3;
            0      29     1 $receiver   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;
            0      29     2 $regionX   I
            0      29     3 $regionY   I
            0      29     4 $onProgress   Lkotlin/jvm/functions/Function2;
            0      29     5 $completion   Lkotlin/coroutines/Continuation;
    Signature: #10                          // (Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;IILkotlin/jvm/functions/Function2<-Ljava/lang/String;-Ljava/lang/Integer;Lkotlin/Unit;>;Lkotlin/coroutines/Continuation<-Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3;>;)V

  public final java.lang.Object invokeSuspend(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Ljava/lang/Object;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=14, locals=35, args_size=2
         0: aload_0
         1: getfield      #102                // Field L$0:Ljava/lang/Object;
         4: checkcast     #104                // class kotlinx/coroutines/CoroutineScope
         7: astore_2
         8: invokestatic  #110                // Method kotlin/coroutines/intrinsics/IntrinsicsKt.getCOROUTINE_SUSPENDED:()Ljava/lang/Object;
        11: astore        34
        13: aload_0
        14: getfield      #113                // Field label:I
        17: tableswitch   { // 0 to 2

                       0: 44

                       1: 837

                       2: 1186
                 default: 1708
            }
        44: aload_1
        45: invokestatic  #119                // Method kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
        48: invokestatic  #125                // Method java/lang/System.currentTimeMillis:()J
        51: lstore_3
        52: aload_0
        53: getfield      #14                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;
        56: invokestatic  #131                // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer.access$getGeoDataProvider$p:(Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;
        59: aload_0
        60: getfield      #18                 // Field $regionX:I
        63: aload_0
        64: getfield      #21                 // Field $regionY:I
        67: invokeinterface #137,  3          // InterfaceMethod ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider.hasL2JData:(II)Z
        72: istore        5
        74: aload_0
        75: getfield      #14                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;
        78: invokestatic  #131                // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer.access$getGeoDataProvider$p:(Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;
        81: aload_0
        82: getfield      #18                 // Field $regionX:I
        85: aload_0
        86: getfield      #21                 // Field $regionY:I
        89: invokeinterface #140,  3          // InterfaceMethod ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider.hasConvDatData:(II)Z
        94: istore        6
        96: iload         5
        98: ifne          143
       101: iload         6
       103: ifne          143
       106: new           #142                // class java/lang/IllegalStateException
       109: dup
       110: aload_0
       111: getfield      #18                 // Field $regionX:I
       114: aload_0
       115: getfield      #21                 // Field $regionY:I
       118: aload_0
       119: getfield      #18                 // Field $regionX:I
       122: aload_0
       123: getfield      #21                 // Field $regionY:I
       126: aload_0
       127: getfield      #18                 // Field $regionX:I
       130: aload_0
       131: getfield      #21                 // Field $regionY:I
       134: invokedynamic #154,  0            // InvokeDynamic #0:makeConcatWithConstants:(IIIIII)Ljava/lang/String;
       139: invokespecial #157                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
       142: athrow
       143: new           #159                // class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo
       146: dup
       147: iload         5
       149: ifeq          156
       152: iconst_1
       153: goto          157
       156: iconst_0
       157: iload         6
       159: ifeq          166
       162: iconst_1
       163: goto          167
       166: iconst_0
       167: nop
       168: iload         5
       170: ifeq          184
       173: iload         6
       175: ifeq          184
       178: getstatic     #165                // Field ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource.MERGED:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;
       181: goto          209
       184: iload         5
       186: ifeq          195
       189: getstatic     #168                // Field ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource.L2J_ONLY:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;
       192: goto          209
       195: iload         6
       197: ifeq          206
       200: getstatic     #171                // Field ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource.CONV_DAT_ONLY:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;
       203: goto          209
       206: getstatic     #174                // Field ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource.NONE:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;
       209: iload         5
       211: ifeq          241
       214: iload         6
       216: ifeq          241
       219: aload_0
       220: getfield      #14                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;
       223: invokestatic  #131                // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer.access$getGeoDataProvider$p:(Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;
       226: invokeinterface #178,  1          // InterfaceMethod ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider.getSourcePriority:()Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;
       231: getstatic     #184                // Field ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority.MERGE:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority;
       234: if_acmpne     241
       237: iconst_1
       238: goto          242
       241: iconst_0
       242: invokespecial #187                // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo."<init>":(ZZLext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;Z)V
       245: astore        7
       247: aload_0
       248: getfield      #25                 // Field $onProgress:Lkotlin/jvm/functions/Function2;
       251: iload         5
       253: ifeq          260
       256: iconst_1
       257: goto          261
       260: iconst_0
       261: iload         6
       263: ifeq          270
       266: iconst_1
       267: goto          271
       270: iconst_0
       271: invokedynamic #192,  0            // InvokeDynamic #1:makeConcatWithConstants:(ZZ)Ljava/lang/String;
       276: iconst_0
       277: invokestatic  #198                // Method kotlin/coroutines/jvm/internal/Boxing.boxInt:(I)Ljava/lang/Integer;
       280: invokeinterface #202,  3          // InterfaceMethod kotlin/jvm/functions/Function2.invoke:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       285: pop
       286: aload_0
       287: getfield      #18                 // Field $regionX:I
       290: bipush        16
       292: isub
       293: sipush        256
       296: imul
       297: istore        8
       299: aload_0
       300: getfield      #21                 // Field $regionY:I
       303: bipush        10
       305: isub
       306: sipush        256
       309: imul
       310: istore        9
       312: iload         8
       314: sipush        256
       317: iadd
       318: ldc           #203                // int 32768
       320: invokestatic  #209                // Method java/lang/Math.min:(II)I
       323: istore        10
       325: iload         9
       327: sipush        256
       330: iadd
       331: ldc           #203                // int 32768
       333: invokestatic  #209                // Method java/lang/Math.min:(II)I
       336: istore        11
       338: iload         10
       340: iload         8
       342: isub
       343: iload         11
       345: iload         9
       347: isub
       348: imul
       349: istore        12
       351: new           #211                // class java/util/concurrent/atomic/AtomicInteger
       354: dup
       355: iconst_0
       356: invokespecial #214                // Method java/util/concurrent/atomic/AtomicInteger."<init>":(I)V
       359: astore        13
       361: aload_0
       362: getfield      #25                 // Field $onProgress:Lkotlin/jvm/functions/Function2;
       365: ldc           #216                // String Preparando chunks
       367: iconst_5
       368: invokestatic  #198                // Method kotlin/coroutines/jvm/internal/Boxing.boxInt:(I)Ljava/lang/Integer;
       371: invokeinterface #202,  3          // InterfaceMethod kotlin/jvm/functions/Function2.invoke:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       376: pop
       377: bipush        32
       379: istore        14
       381: aload_0
       382: getfield      #14                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;
       385: iload         8
       387: iload         9
       389: iload         10
       391: iload         11
       393: iload         14
       395: invokestatic  #220                // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer.access$generateChunks:(Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;IIIII)Ljava/util/List;
       398: astore        15
       400: aload_0
       401: getfield      #25                 // Field $onProgress:Lkotlin/jvm/functions/Function2;
       404: aload         15
       406: invokeinterface #226,  1          // InterfaceMethod java/util/List.size:()I
       411: invokedynamic #231,  0            // InvokeDynamic #2:makeConcatWithConstants:(I)Ljava/lang/String;
       416: bipush        10
       418: invokestatic  #198                // Method kotlin/coroutines/jvm/internal/Boxing.boxInt:(I)Ljava/lang/Integer;
       421: invokeinterface #202,  3          // InterfaceMethod kotlin/jvm/functions/Function2.invoke:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       426: pop
       427: ldc           #232                // int 2147483647
       429: aconst_null
       430: aconst_null
       431: bipush        6
       433: aconst_null
       434: invokestatic  #238                // Method kotlinx/coroutines/channels/ChannelKt.Channel$default:(ILkotlinx/coroutines/channels/BufferOverflow;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lkotlinx/coroutines/channels/Channel;
       437: astore        16
       439: aload_2
       440: aconst_null
       441: aconst_null
       442: new           #240                // class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$collectorDeferred$1
       445: dup
       446: aload         16
       448: aconst_null
       449: invokespecial #243                // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$collectorDeferred$1."<init>":(Lkotlinx/coroutines/channels/Channel;Lkotlin/coroutines/Continuation;)V
       452: checkcast     #7                  // class kotlin/jvm/functions/Function2
       455: iconst_3
       456: aconst_null
       457: invokestatic  #249                // Method kotlinx/coroutines/BuildersKt.async$default:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Deferred;
       460: astore        17
       462: aload         15
       464: checkcast     #251                // class java/lang/Iterable
       467: astore        19
       469: aload_0
       470: getfield      #14                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;
       473: astore        20
       475: aload_0
       476: getfield      #25                 // Field $onProgress:Lkotlin/jvm/functions/Function2;
       479: astore        21
       481: iconst_0
       482: istore        22
       484: aload         19
       486: astore        23
       488: new           #253                // class java/util/ArrayList
       491: dup
       492: aload         19
       494: bipush        10
       496: invokestatic  #259                // Method kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
       499: invokespecial #260                // Method java/util/ArrayList."<init>":(I)V
       502: checkcast     #262                // class java/util/Collection
       505: astore        24
       507: iconst_0
       508: istore        25
       510: aload         23
       512: invokeinterface #266,  1          // InterfaceMethod java/lang/Iterable.iterator:()Ljava/util/Iterator;
       517: astore        26
       519: aload         26
       521: invokeinterface #272,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       526: ifeq          608
       529: aload         26
       531: invokeinterface #275,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       536: astore        27
       538: aload         24
       540: aload         27
       542: checkcast     #277                // class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk
       545: astore        28
       547: astore        33
       549: iconst_0
       550: istore        29
       552: aload_2
       553: aconst_null
       554: aconst_null
       555: new           #279                // class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1
       558: dup
       559: aload         28
       561: aload         20
       563: iload         6
       565: ifeq          572
       568: iconst_1
       569: goto          573
       572: iconst_0
       573: aload         13
       575: iload         12
       577: aload         21
       579: aload         7
       581: aload         16
       583: aconst_null
       584: invokespecial #282                // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1."<init>":(Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk;Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;ZLjava/util/concurrent/atomic/AtomicInteger;ILkotlin/jvm/functions/Function2;Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;Lkotlinx/coroutines/channels/Channel;Lkotlin/coroutines/Continuation;)V
       587: checkcast     #7                  // class kotlin/jvm/functions/Function2
       590: iconst_3
       591: aconst_null
       592: invokestatic  #249                // Method kotlinx/coroutines/BuildersKt.async$default:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Deferred;
       595: nop
       596: aload         33
       598: swap
       599: invokeinterface #286,  2          // InterfaceMethod java/util/Collection.add:(Ljava/lang/Object;)Z
       604: pop
       605: goto          519
       608: aload         24
       610: checkcast     #222                // class java/util/List
       613: nop
       614: astore        18
       616: aload         18
       618: checkcast     #251                // class java/lang/Iterable
       621: astore        19
       623: iconst_0
       624: istore        20
       626: aload         19
       628: invokeinterface #266,  1          // InterfaceMethod java/lang/Iterable.iterator:()Ljava/util/Iterator;
       633: astore        21
       635: aload         21
       637: invokeinterface #272,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       642: ifeq          998
       645: aload         21
       647: invokeinterface #275,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       652: astore        22
       654: aload         22
       656: checkcast     #288                // class kotlinx/coroutines/Deferred
       659: astore        23
       661: iconst_0
       662: istore        24
       664: aload         23
       666: aload_0
       667: aload_0
       668: aload_2
       669: invokestatic  #293                // Method kotlin/coroutines/jvm/internal/SpillingKt.nullOutSpilledVariable:(Ljava/lang/Object;)Ljava/lang/Object;
       672: putfield      #102                // Field L$0:Ljava/lang/Object;
       675: aload_0
       676: aload         7
       678: putfield      #295                // Field L$1:Ljava/lang/Object;
       681: aload_0
       682: aload         13
       684: invokestatic  #293                // Method kotlin/coroutines/jvm/internal/SpillingKt.nullOutSpilledVariable:(Ljava/lang/Object;)Ljava/lang/Object;
       687: putfield      #297                // Field L$2:Ljava/lang/Object;
       690: aload_0
       691: aload         15
       693: invokestatic  #293                // Method kotlin/coroutines/jvm/internal/SpillingKt.nullOutSpilledVariable:(Ljava/lang/Object;)Ljava/lang/Object;
       696: putfield      #299                // Field L$3:Ljava/lang/Object;
       699: aload_0
       700: aload         16
       702: putfield      #301                // Field L$4:Ljava/lang/Object;
       705: aload_0
       706: aload         17
       708: putfield      #303                // Field L$5:Ljava/lang/Object;
       711: aload_0
       712: aload         18
       714: invokestatic  #293                // Method kotlin/coroutines/jvm/internal/SpillingKt.nullOutSpilledVariable:(Ljava/lang/Object;)Ljava/lang/Object;
       717: putfield      #305                // Field L$6:Ljava/lang/Object;
       720: aload_0
       721: aload         19
       723: invokestatic  #293                // Method kotlin/coroutines/jvm/internal/SpillingKt.nullOutSpilledVariable:(Ljava/lang/Object;)Ljava/lang/Object;
       726: putfield      #307                // Field L$7:Ljava/lang/Object;
       729: aload_0
       730: aload         21
       732: putfield      #309                // Field L$8:Ljava/lang/Object;
       735: aload_0
       736: aload         22
       738: invokestatic  #293                // Method kotlin/coroutines/jvm/internal/SpillingKt.nullOutSpilledVariable:(Ljava/lang/Object;)Ljava/lang/Object;
       741: putfield      #311                // Field L$9:Ljava/lang/Object;
       744: aload_0
       745: aload         23
       747: invokestatic  #293                // Method kotlin/coroutines/jvm/internal/SpillingKt.nullOutSpilledVariable:(Ljava/lang/Object;)Ljava/lang/Object;
       750: putfield      #313                // Field L$10:Ljava/lang/Object;
       753: aload_0
       754: lload_3
       755: putfield      #315                // Field J$0:J
       758: aload_0
       759: iload         5
       761: putfield      #317                // Field Z$0:Z
       764: aload_0
       765: iload         6
       767: putfield      #319                // Field Z$1:Z
       770: aload_0
       771: iload         8
       773: putfield      #321                // Field I$0:I
       776: aload_0
       777: iload         9
       779: putfield      #323                // Field I$1:I
       782: aload_0
       783: iload         10
       785: putfield      #325                // Field I$2:I
       788: aload_0
       789: iload         11
       791: putfield      #327                // Field I$3:I
       794: aload_0
       795: iload         12
       797: putfield      #329                // Field I$4:I
       800: aload_0
       801: iload         14
       803: putfield      #331                // Field I$5:I
       806: aload_0
       807: iload         20
       809: putfield      #333                // Field I$6:I
       812: aload_0
       813: iload         24
       815: putfield      #335                // Field I$7:I
       818: aload_0
       819: iconst_1
       820: putfield      #113                // Field label:I
       823: invokeinterface #339,  2          // InterfaceMethod kotlinx/coroutines/Deferred.await:(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
       828: dup
       829: aload         34
       831: if_acmpne     994
       834: aload         34
       836: areturn
       837: aload_0
       838: getfield      #335                // Field I$7:I
       841: istore        24
       843: aload_0
       844: getfield      #333                // Field I$6:I
       847: istore        20
       849: aload_0
       850: getfield      #331                // Field I$5:I
       853: istore        14
       855: aload_0
       856: getfield      #329                // Field I$4:I
       859: istore        12
       861: aload_0
       862: getfield      #327                // Field I$3:I
       865: istore        11
       867: aload_0
       868: getfield      #325                // Field I$2:I
       871: istore        10
       873: aload_0
       874: getfield      #323                // Field I$1:I
       877: istore        9
       879: aload_0
       880: getfield      #321                // Field I$0:I
       883: istore        8
       885: aload_0
       886: getfield      #319                // Field Z$1:Z
       889: istore        6
       891: aload_0
       892: getfield      #317                // Field Z$0:Z
       895: istore        5
       897: aload_0
       898: getfield      #315                // Field J$0:J
       901: lstore_3
       902: aload_0
       903: getfield      #313                // Field L$10:Ljava/lang/Object;
       906: checkcast     #288                // class kotlinx/coroutines/Deferred
       909: astore        23
       911: aload_0
       912: getfield      #311                // Field L$9:Ljava/lang/Object;
       915: astore        22
       917: aload_0
       918: getfield      #309                // Field L$8:Ljava/lang/Object;
       921: checkcast     #268                // class java/util/Iterator
       924: astore        21
       926: aload_0
       927: getfield      #307                // Field L$7:Ljava/lang/Object;
       930: checkcast     #251                // class java/lang/Iterable
       933: astore        19
       935: aload_0
       936: getfield      #305                // Field L$6:Ljava/lang/Object;
       939: checkcast     #222                // class java/util/List
       942: astore        18
       944: aload_0
       945: getfield      #303                // Field L$5:Ljava/lang/Object;
       948: checkcast     #288                // class kotlinx/coroutines/Deferred
       951: astore        17
       953: aload_0
       954: getfield      #301                // Field L$4:Ljava/lang/Object;
       957: checkcast     #341                // class kotlinx/coroutines/channels/Channel
       960: astore        16
       962: aload_0
       963: getfield      #299                // Field L$3:Ljava/lang/Object;
       966: checkcast     #222                // class java/util/List
       969: astore        15
       971: aload_0
       972: getfield      #297                // Field L$2:Ljava/lang/Object;
       975: checkcast     #211                // class java/util/concurrent/atomic/AtomicInteger
       978: astore        13
       980: aload_0
       981: getfield      #295                // Field L$1:Ljava/lang/Object;
       984: checkcast     #159                // class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo
       987: astore        7
       989: aload_1
       990: invokestatic  #119                // Method kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
       993: aload_1
       994: pop
       995: goto          635
       998: nop
       999: aload         16
      1001: checkcast     #343                // class kotlinx/coroutines/channels/SendChannel
      1004: aconst_null
      1005: iconst_1
      1006: aconst_null
      1007: invokestatic  #349                // Method kotlinx/coroutines/channels/SendChannel$DefaultImpls.close$default:(Lkotlinx/coroutines/channels/SendChannel;Ljava/lang/Throwable;ILjava/lang/Object;)Z
      1010: pop
      1011: aload_0
      1012: getfield      #25                 // Field $onProgress:Lkotlin/jvm/functions/Function2;
      1015: ldc_w         #351                // String Finalizando coleta
      1018: bipush        90
      1020: invokestatic  #198                // Method kotlin/coroutines/jvm/internal/Boxing.boxInt:(I)Ljava/lang/Integer;
      1023: invokeinterface #202,  3          // InterfaceMethod kotlin/jvm/functions/Function2.invoke:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      1028: pop
      1029: aload         17
      1031: aload_0
      1032: checkcast     #353                // class kotlin/coroutines/Continuation
      1035: aload_0
      1036: aload_2
      1037: invokestatic  #293                // Method kotlin/coroutines/jvm/internal/SpillingKt.nullOutSpilledVariable:(Ljava/lang/Object;)Ljava/lang/Object;
      1040: putfield      #102                // Field L$0:Ljava/lang/Object;
      1043: aload_0
      1044: aload         7
      1046: putfield      #295                // Field L$1:Ljava/lang/Object;
      1049: aload_0
      1050: aload         13
      1052: invokestatic  #293                // Method kotlin/coroutines/jvm/internal/SpillingKt.nullOutSpilledVariable:(Ljava/lang/Object;)Ljava/lang/Object;
      1055: putfield      #297                // Field L$2:Ljava/lang/Object;
      1058: aload_0
      1059: aload         15
      1061: invokestatic  #293                // Method kotlin/coroutines/jvm/internal/SpillingKt.nullOutSpilledVariable:(Ljava/lang/Object;)Ljava/lang/Object;
      1064: putfield      #299                // Field L$3:Ljava/lang/Object;
      1067: aload_0
      1068: aload         16
      1070: invokestatic  #293                // Method kotlin/coroutines/jvm/internal/SpillingKt.nullOutSpilledVariable:(Ljava/lang/Object;)Ljava/lang/Object;
      1073: putfield      #301                // Field L$4:Ljava/lang/Object;
      1076: aload_0
      1077: aload         17
      1079: invokestatic  #293                // Method kotlin/coroutines/jvm/internal/SpillingKt.nullOutSpilledVariable:(Ljava/lang/Object;)Ljava/lang/Object;
      1082: putfield      #303                // Field L$5:Ljava/lang/Object;
      1085: aload_0
      1086: aload         18
      1088: invokestatic  #293                // Method kotlin/coroutines/jvm/internal/SpillingKt.nullOutSpilledVariable:(Ljava/lang/Object;)Ljava/lang/Object;
      1091: putfield      #305                // Field L$6:Ljava/lang/Object;
      1094: aload_0
      1095: aconst_null
      1096: putfield      #307                // Field L$7:Ljava/lang/Object;
      1099: aload_0
      1100: aconst_null
      1101: putfield      #309                // Field L$8:Ljava/lang/Object;
      1104: aload_0
      1105: aconst_null
      1106: putfield      #311                // Field L$9:Ljava/lang/Object;
      1109: aload_0
      1110: aconst_null
      1111: putfield      #313                // Field L$10:Ljava/lang/Object;
      1114: aload_0
      1115: lload_3
      1116: putfield      #315                // Field J$0:J
      1119: aload_0
      1120: iload         5
      1122: putfield      #317                // Field Z$0:Z
      1125: aload_0
      1126: iload         6
      1128: putfield      #319                // Field Z$1:Z
      1131: aload_0
      1132: iload         8
      1134: putfield      #321                // Field I$0:I
      1137: aload_0
      1138: iload         9
      1140: putfield      #323                // Field I$1:I
      1143: aload_0
      1144: iload         10
      1146: putfield      #325                // Field I$2:I
      1149: aload_0
      1150: iload         11
      1152: putfield      #327                // Field I$3:I
      1155: aload_0
      1156: iload         12
      1158: putfield      #329                // Field I$4:I
      1161: aload_0
      1162: iload         14
      1164: putfield      #331                // Field I$5:I
      1167: aload_0
      1168: iconst_2
      1169: putfield      #113                // Field label:I
      1172: invokeinterface #339,  2          // InterfaceMethod kotlinx/coroutines/Deferred.await:(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
      1177: dup
      1178: aload         34
      1180: if_acmpne     1298
      1183: aload         34
      1185: areturn
      1186: aload_0
      1187: getfield      #331                // Field I$5:I
      1190: istore        14
      1192: aload_0
      1193: getfield      #329                // Field I$4:I
      1196: istore        12
      1198: aload_0
      1199: getfield      #327                // Field I$3:I
      1202: istore        11
      1204: aload_0
      1205: getfield      #325                // Field I$2:I
      1208: istore        10
      1210: aload_0
      1211: getfield      #323                // Field I$1:I
      1214: istore        9
      1216: aload_0
      1217: getfield      #321                // Field I$0:I
      1220: istore        8
      1222: aload_0
      1223: getfield      #319                // Field Z$1:Z
      1226: istore        6
      1228: aload_0
      1229: getfield      #317                // Field Z$0:Z
      1232: istore        5
      1234: aload_0
      1235: getfield      #315                // Field J$0:J
      1238: lstore_3
      1239: aload_0
      1240: getfield      #305                // Field L$6:Ljava/lang/Object;
      1243: checkcast     #222                // class java/util/List
      1246: astore        18
      1248: aload_0
      1249: getfield      #303                // Field L$5:Ljava/lang/Object;
      1252: checkcast     #288                // class kotlinx/coroutines/Deferred
      1255: astore        17
      1257: aload_0
      1258: getfield      #301                // Field L$4:Ljava/lang/Object;
      1261: checkcast     #341                // class kotlinx/coroutines/channels/Channel
      1264: astore        16
      1266: aload_0
      1267: getfield      #299                // Field L$3:Ljava/lang/Object;
      1270: checkcast     #222                // class java/util/List
      1273: astore        15
      1275: aload_0
      1276: getfield      #297                // Field L$2:Ljava/lang/Object;
      1279: checkcast     #211                // class java/util/concurrent/atomic/AtomicInteger
      1282: astore        13
      1284: aload_0
      1285: getfield      #295                // Field L$1:Ljava/lang/Object;
      1288: checkcast     #159                // class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo
      1291: astore        7
      1293: aload_1
      1294: invokestatic  #119                // Method kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
      1297: aload_1
      1298: checkcast     #222                // class java/util/List
      1301: astore        19
      1303: aload         19
      1305: checkcast     #251                // class java/lang/Iterable
      1308: astore        21
      1310: iconst_0
      1311: istore        22
      1313: aload         21
      1315: astore        23
      1317: new           #253                // class java/util/ArrayList
      1320: dup
      1321: aload         21
      1323: bipush        10
      1325: invokestatic  #259                // Method kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
      1328: invokespecial #260                // Method java/util/ArrayList."<init>":(I)V
      1331: checkcast     #262                // class java/util/Collection
      1334: astore        24
      1336: iconst_0
      1337: istore        25
      1339: iconst_0
      1340: istore        26
      1342: aload         23
      1344: invokeinterface #266,  1          // InterfaceMethod java/lang/Iterable.iterator:()Ljava/util/Iterator;
      1349: astore        27
      1351: aload         27
      1353: invokeinterface #272,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
      1358: ifeq          1431
      1361: aload         27
      1363: invokeinterface #275,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      1368: astore        28
      1370: aload         24
      1372: iload         26
      1374: iinc          26, 1
      1377: istore        29
      1379: iload         29
      1381: ifge          1387
      1384: invokestatic  #357                // Method kotlin/collections/CollectionsKt.throwIndexOverflow:()V
      1387: iload         29
      1389: aload         28
      1391: checkcast     #359                // class ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode
      1394: astore        30
      1396: istore        31
      1398: astore        33
      1400: iconst_0
      1401: istore        32
      1403: aload         30
      1405: iload         31
      1407: iconst_0
      1408: iconst_0
      1409: iconst_0
      1410: iconst_0
      1411: iconst_0
      1412: aconst_null
      1413: bipush        126
      1415: aconst_null
      1416: invokestatic  #363                // Method ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode.copy$default:(Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;IIISBILext/mods/gameserver/geoengine/pathfinding/model/BlockType;ILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;
      1419: aload         33
      1421: swap
      1422: invokeinterface #286,  2          // InterfaceMethod java/util/Collection.add:(Ljava/lang/Object;)Z
      1427: pop
      1428: goto          1351
      1431: aload         24
      1433: checkcast     #222                // class java/util/List
      1436: nop
      1437: astore        20
      1439: aload         20
      1441: checkcast     #251                // class java/lang/Iterable
      1444: astore        22
      1446: iconst_0
      1447: istore        23
      1449: aload         22
      1451: instanceof    #262                // class java/util/Collection
      1454: ifeq          1474
      1457: aload         22
      1459: checkcast     #262                // class java/util/Collection
      1462: invokeinterface #366,  1          // InterfaceMethod java/util/Collection.isEmpty:()Z
      1467: ifeq          1474
      1470: iconst_0
      1471: goto          1539
      1474: iconst_0
      1475: istore        24
      1477: aload         22
      1479: invokeinterface #266,  1          // InterfaceMethod java/lang/Iterable.iterator:()Ljava/util/Iterator;
      1484: astore        25
      1486: aload         25
      1488: invokeinterface #272,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
      1493: ifeq          1537
      1496: aload         25
      1498: invokeinterface #275,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      1503: astore        26
      1505: aload         26
      1507: checkcast     #359                // class ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode
      1510: astore        27
      1512: iconst_0
      1513: istore        28
      1515: aload         27
      1517: invokevirtual #369                // Method ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode.isWalkable:()Z
      1520: ifeq          1486
      1523: iinc          24, 1
      1526: iload         24
      1528: ifge          1486
      1531: invokestatic  #372                // Method kotlin/collections/CollectionsKt.throwCountOverflow:()V
      1534: goto          1486
      1537: iload         24
      1539: istore        21
      1541: aload         20
      1543: checkcast     #251                // class java/lang/Iterable
      1546: astore        23
      1548: iconst_0
      1549: istore        24
      1551: aload         23
      1553: instanceof    #262                // class java/util/Collection
      1556: ifeq          1576
      1559: aload         23
      1561: checkcast     #262                // class java/util/Collection
      1564: invokeinterface #366,  1          // InterfaceMethod java/util/Collection.isEmpty:()Z
      1569: ifeq          1576
      1572: iconst_0
      1573: goto          1652
      1576: iconst_0
      1577: istore        25
      1579: aload         23
      1581: invokeinterface #266,  1          // InterfaceMethod java/lang/Iterable.iterator:()Ljava/util/Iterator;
      1586: astore        26
      1588: aload         26
      1590: invokeinterface #272,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
      1595: ifeq          1650
      1598: aload         26
      1600: invokeinterface #275,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      1605: astore        27
      1607: aload         27
      1609: checkcast     #359                // class ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode
      1612: astore        28
      1614: iconst_0
      1615: istore        29
      1617: aload         28
      1619: invokevirtual #376                // Method ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode.getBlockType:()Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
      1622: getstatic     #382                // Field ext/mods/gameserver/geoengine/pathfinding/model/BlockType.MULTILAYER:Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
      1625: if_acmpne     1632
      1628: iconst_1
      1629: goto          1633
      1632: iconst_0
      1633: ifeq          1588
      1636: iinc          25, 1
      1639: iload         25
      1641: ifge          1588
      1644: invokestatic  #372                // Method kotlin/collections/CollectionsKt.throwCountOverflow:()V
      1647: goto          1588
      1650: iload         25
      1652: istore        22
      1654: aload_0
      1655: getfield      #25                 // Field $onProgress:Lkotlin/jvm/functions/Function2;
      1658: aload         7
      1660: invokevirtual #386                // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo.getPrimarySource:()Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;
      1663: invokedynamic #391,  0            // InvokeDynamic #3:makeConcatWithConstants:(Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;)Ljava/lang/String;
      1668: bipush        100
      1670: invokestatic  #198                // Method kotlin/coroutines/jvm/internal/Boxing.boxInt:(I)Ljava/lang/Integer;
      1673: invokeinterface #202,  3          // InterfaceMethod kotlin/jvm/functions/Function2.invoke:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      1678: pop
      1679: new           #393                // class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult
      1682: dup
      1683: aload_0
      1684: getfield      #18                 // Field $regionX:I
      1687: aload_0
      1688: getfield      #21                 // Field $regionY:I
      1691: aload         20
      1693: iload         21
      1695: iload         22
      1697: invokestatic  #125                // Method java/lang/System.currentTimeMillis:()J
      1700: lload_3
      1701: lsub
      1702: aload         7
      1704: invokespecial #396                // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult."<init>":(IILjava/util/List;IIJLext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;)V
      1707: areturn
      1708: new           #142                // class java/lang/IllegalStateException
      1711: dup
      1712: ldc_w         #398                // String call to \'resume\' before \'invoke\' with coroutine
      1715: invokespecial #157                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      1718: athrow
      StackMapTable: number_of_entries = 40
        frame_type = 255 /* full_frame */
          offset_delta = 44
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 98
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, long, int, int, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 12
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, long, int, int, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = [ uninitialized 143, uninitialized 143 ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, long, int, int, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = [ uninitialized 143, uninitialized 143, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 8
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, long, int, int, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = [ uninitialized 143, uninitialized 143, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, long, int, int, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = [ uninitialized 143, uninitialized 143, int, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, long, int, int, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = [ uninitialized 143, uninitialized 143, int, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 10
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, long, int, int, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = [ uninitialized 143, uninitialized 143, int, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 10
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, long, int, int, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = [ uninitialized 143, uninitialized 143, int, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, long, int, int, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = [ uninitialized 143, uninitialized 143, int, int, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource ]
        frame_type = 255 /* full_frame */
          offset_delta = 31
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, long, int, int, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = [ uninitialized 143, uninitialized 143, int, int, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, long, int, int, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = [ uninitialized 143, uninitialized 143, int, int, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, long, int, int, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = [ class kotlin/jvm/functions/Function2 ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, long, int, int, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = [ class kotlin/jvm/functions/Function2, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 8
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, long, int, int, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = [ class kotlin/jvm/functions/Function2, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, long, int, int, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = [ class kotlin/jvm/functions/Function2, int, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 247
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, long, int, int, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo, int, int, int, int, int, class java/util/concurrent/atomic/AtomicInteger, int, class java/util/List, class kotlinx/coroutines/channels/Channel, class kotlinx/coroutines/Deferred, top, class java/lang/Iterable, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer, class kotlin/jvm/functions/Function2, int, class java/lang/Iterable, class java/util/Collection, int, class java/util/Iterator, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 52
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, long, int, int, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo, int, int, int, int, int, class java/util/concurrent/atomic/AtomicInteger, int, class java/util/List, class kotlinx/coroutines/channels/Channel, class kotlinx/coroutines/Deferred, top, class java/lang/Iterable, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer, class kotlin/jvm/functions/Function2, int, class java/lang/Iterable, class java/util/Collection, int, class java/util/Iterator, class java/lang/Object, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk, int, top, top, top, class java/util/Collection, class java/lang/Object ]
          stack = [ class kotlinx/coroutines/CoroutineScope, null, null, uninitialized 555, uninitialized 555, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, long, int, int, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo, int, int, int, int, int, class java/util/concurrent/atomic/AtomicInteger, int, class java/util/List, class kotlinx/coroutines/channels/Channel, class kotlinx/coroutines/Deferred, top, class java/lang/Iterable, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer, class kotlin/jvm/functions/Function2, int, class java/lang/Iterable, class java/util/Collection, int, class java/util/Iterator, class java/lang/Object, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk, int, top, top, top, class java/util/Collection, class java/lang/Object ]
          stack = [ class kotlinx/coroutines/CoroutineScope, null, null, uninitialized 555, uninitialized 555, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 34
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, long, int, int, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo, int, int, int, int, int, class java/util/concurrent/atomic/AtomicInteger, int, class java/util/List, class kotlinx/coroutines/channels/Channel, class kotlinx/coroutines/Deferred, top, class java/lang/Iterable, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer, class kotlin/jvm/functions/Function2, int, class java/lang/Iterable, class java/util/Collection, int, class java/util/Iterator, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 26
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, long, int, int, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo, int, int, int, int, int, class java/util/concurrent/atomic/AtomicInteger, int, class java/util/List, class kotlinx/coroutines/channels/Channel, class kotlinx/coroutines/Deferred, class java/util/List, class java/lang/Iterable, int, class java/util/Iterator, top, class java/lang/Object, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 201
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 156
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, long, int, int, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo, int, int, int, int, int, class java/util/concurrent/atomic/AtomicInteger, int, class java/util/List, class kotlinx/coroutines/channels/Channel, class kotlinx/coroutines/Deferred, class java/util/List, class java/lang/Iterable, int, class java/util/Iterator, class java/lang/Object, class kotlinx/coroutines/Deferred, int, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = [ class java/lang/Object ]
        frame_type = 255 /* full_frame */
          offset_delta = 3
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, long, int, int, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo, int, int, int, int, int, class java/util/concurrent/atomic/AtomicInteger, int, class java/util/List, class kotlinx/coroutines/channels/Channel, class kotlinx/coroutines/Deferred, class java/util/List, class java/lang/Iterable, int, class java/util/Iterator, top, class java/lang/Object, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 187
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 111
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, long, int, int, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo, int, int, int, int, int, class java/util/concurrent/atomic/AtomicInteger, int, class java/util/List, class kotlinx/coroutines/channels/Channel, class kotlinx/coroutines/Deferred, class java/util/List, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = [ class java/lang/Object ]
        frame_type = 255 /* full_frame */
          offset_delta = 52
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, long, int, int, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo, int, int, int, int, int, class java/util/concurrent/atomic/AtomicInteger, int, class java/util/List, class kotlinx/coroutines/channels/Channel, class kotlinx/coroutines/Deferred, class java/util/List, class java/util/List, top, class java/lang/Iterable, int, class java/lang/Iterable, class java/util/Collection, int, int, class java/util/Iterator, top, top, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 35
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, long, int, int, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo, int, int, int, int, int, class java/util/concurrent/atomic/AtomicInteger, int, class java/util/List, class kotlinx/coroutines/channels/Channel, class kotlinx/coroutines/Deferred, class java/util/List, class java/util/List, top, class java/lang/Iterable, int, class java/lang/Iterable, class java/util/Collection, int, int, class java/util/Iterator, class java/lang/Object, int, top, top, top, top, class java/lang/Object ]
          stack = [ class java/util/Collection ]
        frame_type = 255 /* full_frame */
          offset_delta = 43
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, long, int, int, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo, int, int, int, int, int, class java/util/concurrent/atomic/AtomicInteger, int, class java/util/List, class kotlinx/coroutines/channels/Channel, class kotlinx/coroutines/Deferred, class java/util/List, class java/util/List, top, class java/lang/Iterable, int, class java/lang/Iterable, class java/util/Collection, int, int, class java/util/Iterator, top, top, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 42
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, long, int, int, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo, int, int, int, int, int, class java/util/concurrent/atomic/AtomicInteger, int, class java/util/List, class kotlinx/coroutines/channels/Channel, class kotlinx/coroutines/Deferred, class java/util/List, class java/util/List, class java/util/List, class java/lang/Iterable, class java/lang/Iterable, int, class java/util/Collection, int, int, class java/util/Iterator, top, top, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 11
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, long, int, int, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo, int, int, int, int, int, class java/util/concurrent/atomic/AtomicInteger, int, class java/util/List, class kotlinx/coroutines/channels/Channel, class kotlinx/coroutines/Deferred, class java/util/List, class java/util/List, class java/util/List, class java/lang/Iterable, class java/lang/Iterable, int, int, class java/util/Iterator, top, class java/lang/Object, top, top, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 50 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, long, int, int, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo, int, int, int, int, int, class java/util/concurrent/atomic/AtomicInteger, int, class java/util/List, class kotlinx/coroutines/channels/Channel, class kotlinx/coroutines/Deferred, class java/util/List, class java/util/List, class java/util/List, class java/lang/Iterable, class java/lang/Iterable, int, top, top, top, class java/lang/Object, top, top, top, top, top, top, class java/lang/Object ]
          stack = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 36
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, long, int, int, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo, int, int, int, int, int, class java/util/concurrent/atomic/AtomicInteger, int, class java/util/List, class kotlinx/coroutines/channels/Channel, class kotlinx/coroutines/Deferred, class java/util/List, class java/util/List, class java/util/List, int, class java/lang/Iterable, class java/lang/Iterable, int, top, top, class java/lang/Object, top, top, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 11
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, long, int, int, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo, int, int, int, int, int, class java/util/concurrent/atomic/AtomicInteger, int, class java/util/List, class kotlinx/coroutines/channels/Channel, class kotlinx/coroutines/Deferred, class java/util/List, class java/util/List, class java/util/List, int, class java/lang/Iterable, class java/lang/Iterable, int, int, class java/util/Iterator, class java/lang/Object, top, top, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 43
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, long, int, int, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo, int, int, int, int, int, class java/util/concurrent/atomic/AtomicInteger, int, class java/util/List, class kotlinx/coroutines/channels/Channel, class kotlinx/coroutines/Deferred, class java/util/List, class java/util/List, class java/util/List, int, class java/lang/Iterable, class java/lang/Iterable, int, int, class java/util/Iterator, class java/lang/Object, class ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode, int, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, long, int, int, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo, int, int, int, int, int, class java/util/concurrent/atomic/AtomicInteger, int, class java/util/List, class kotlinx/coroutines/channels/Channel, class kotlinx/coroutines/Deferred, class java/util/List, class java/util/List, class java/util/List, int, class java/lang/Iterable, class java/lang/Iterable, int, int, class java/util/Iterator, class java/lang/Object, top, top, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, long, int, int, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo, int, int, int, int, int, class java/util/concurrent/atomic/AtomicInteger, int, class java/util/List, class kotlinx/coroutines/channels/Channel, class kotlinx/coroutines/Deferred, class java/util/List, class java/util/List, class java/util/List, int, class java/lang/Iterable, class java/lang/Iterable, int, top, top, class java/lang/Object, top, top, top, top, top, top, class java/lang/Object ]
          stack = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 55
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3, class java/lang/Object, class kotlinx/coroutines/CoroutineScope, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = []
      LineNumberTable:
        line 247: 11
        line 249: 48
        line 251: 52
        line 252: 74
        line 254: 96
        line 255: 106
        line 256: 110
        line 257: 118
        line 255: 139
        line 261: 143
        line 262: 147
        line 263: 157
        line 264: 167
        line 265: 168
        line 266: 184
        line 267: 195
        line 268: 206
        line 270: 209
        line 271: 219
        line 261: 242
        line 274: 247
        line 275: 251
        line 276: 276
        line 274: 280
        line 279: 286
        line 280: 299
        line 282: 312
        line 282: 323
        line 283: 325
        line 283: 336
        line 285: 338
        line 286: 351
        line 288: 361
        line 290: 377
        line 291: 381
        line 293: 400
        line 295: 427
        line 297: 439
        line 305: 462
        line 473: 484
        line 474: 510
        line 475: 538
        line 306: 552
        line 358: 595
        line 475: 599
        line 476: 608
        line 473: 613
        line 305: 614
        line 361: 616
        line 477: 626
        line 361: 664
        line 247: 834
        line 361: 994
        line 477: 995
        line 478: 998
        line 362: 999
        line 364: 1011
        line 366: 1029
        line 247: 1183
        line 368: 1303
        line 479: 1313
        line 480: 1339
        line 481: 1342
        line 482: 1370
        line 482: 1389
        line 369: 1403
        line 482: 1422
        line 483: 1431
        line 479: 1436
        line 368: 1437
        line 372: 1439
        line 484: 1449
        line 485: 1474
        line 486: 1477
        line 372: 1515
        line 486: 1520
        line 487: 1537
        line 372: 1539
        line 373: 1541
        line 488: 1551
        line 489: 1576
        line 490: 1579
        line 373: 1617
        line 490: 1633
        line 491: 1650
        line 373: 1652
        line 375: 1654
        line 377: 1679
        line 378: 1683
        line 379: 1687
        line 380: 1691
        line 381: 1693
        line 382: 1695
        line 383: 1697
        line 384: 1702
        line 377: 1704
        line 385: 1707
        line 247: 1708
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          552      44    29 $i$a$-map-GeoIndexer$indexRegion$3$chunkJobs$1   I
          549      47    28 chunk   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk;
          538      67    27 item$iv$iv   Ljava/lang/Object;
          510     100    25 $i$f$mapTo   I
          507     103    23 $this$mapTo$iv$iv   Ljava/lang/Iterable;
          507     103    24 destination$iv$iv   Ljava/util/Collection;
          484     130    22 $i$f$map   I
          481     133    19 $this$map$iv   Ljava/lang/Iterable;
          664     173    24 $i$a$-forEach-GeoIndexer$indexRegion$3$1   I
          661     176    23    it   Lkotlinx/coroutines/Deferred;
          654     183    22 element$iv   Ljava/lang/Object;
          626     211    20 $i$f$forEach   I
          623     214    19 $this$forEach$iv   Ljava/lang/Iterable;
         1403      16    32 $i$a$-mapIndexed-GeoIndexer$indexRegion$3$nodesWithIds$1   I
         1400      19    31 index   I
         1400      19    30  node   Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;
         1370      58    28 item$iv$iv   Ljava/lang/Object;
         1339      94    25 $i$f$mapIndexedTo   I
         1342      91    26 index$iv$iv   I
         1336      97    23 $this$mapIndexedTo$iv$iv   Ljava/lang/Iterable;
         1336      97    24 destination$iv$iv   Ljava/util/Collection;
         1313     124    22 $i$f$mapIndexed   I
         1310     127    21 $this$mapIndexed$iv   Ljava/lang/Iterable;
         1515       5    28 $i$a$-count-GeoIndexer$indexRegion$3$walkableCount$1   I
         1512       8    27    it   Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;
         1505      29    26 element$iv   Ljava/lang/Object;
         1449      90    23 $i$f$count   I
         1477      62    24 count$iv   I
         1446      93    22 $this$count$iv   Ljava/lang/Iterable;
         1617      16    29 $i$a$-count-GeoIndexer$indexRegion$3$multilayerCount$1   I
         1614      19    28    it   Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;
         1607      40    27 element$iv   Ljava/lang/Object;
         1551     101    24 $i$f$count   I
         1579      73    25 count$iv   I
         1548     104    23 $this$count$iv   Ljava/lang/Iterable;
           52     785     3 startTime   J
           74     763     5 hasL2J   Z
           96     741     6 hasConvDat   Z
          247     590     7 sourceInfo   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;
          299     538     8 baseGeoX   I
          312     525     9 baseGeoY   I
          325     512    10 maxGeoX   I
          338     499    11 maxGeoY   I
          351     486    12 totalCells   I
          361     476    13 processed   Ljava/util/concurrent/atomic/AtomicInteger;
          381     456    14 chunkSize   I
          400     437    15 chunks   Ljava/util/List;
          439     398    16 nodeChannel   Lkotlinx/coroutines/channels/Channel;
          462     375    17 collectorDeferred   Lkotlinx/coroutines/Deferred;
          616     221    18 chunkJobs   Ljava/util/List;
         1303     405    19 allNodes   Ljava/util/List;
         1439     269    20 nodesWithIds   Ljava/util/List;
         1541     167    21 walkableCount   I
         1654      54    22 multilayerCount   I
            0    1719     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3;
            0    1719     1 $result   Ljava/lang/Object;
          989     197     7 sourceInfo   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;
          980     206    13 processed   Ljava/util/concurrent/atomic/AtomicInteger;
          971     215    15 chunks   Ljava/util/List;
          962     224    16 nodeChannel   Lkotlinx/coroutines/channels/Channel;
          953     233    17 collectorDeferred   Lkotlinx/coroutines/Deferred;
          944     242    18 chunkJobs   Ljava/util/List;
          935      64    19 $this$forEach$iv   Ljava/lang/Iterable;
          917      78    22 element$iv   Ljava/lang/Object;
          911      84    23    it   Lkotlinx/coroutines/Deferred;
          902     284     3 startTime   J
          897     289     5 hasL2J   Z
          891     295     6 hasConvDat   Z
          885     301     8 baseGeoX   I
          879     307     9 baseGeoY   I
          873     313    10 maxGeoX   I
          867     319    11 maxGeoY   I
          861     325    12 totalCells   I
          855     331    14 chunkSize   I
          849     150    20 $i$f$forEach   I
          843     152    24 $i$a$-forEach-GeoIndexer$indexRegion$3$1   I
         1293     415     7 sourceInfo   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;
         1284     424    13 processed   Ljava/util/concurrent/atomic/AtomicInteger;
         1275     433    15 chunks   Ljava/util/List;
         1266     442    16 nodeChannel   Lkotlinx/coroutines/channels/Channel;
         1257     451    17 collectorDeferred   Lkotlinx/coroutines/Deferred;
         1248     460    18 chunkJobs   Ljava/util/List;
         1239     469     3 startTime   J
         1234     474     5 hasL2J   Z
         1228     480     6 hasConvDat   Z
         1222     486     8 baseGeoX   I
         1216     492     9 baseGeoY   I
         1210     498    10 maxGeoX   I
         1204     504    11 maxGeoY   I
         1198     510    12 totalCells   I
         1192     516    14 chunkSize   I
           11    1708     2 $this$withContext   Lkotlinx/coroutines/CoroutineScope;

  public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object, kotlin.coroutines.Continuation<?>);
    descriptor: (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=7, locals=4, args_size=3
         0: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3
         3: dup
         4: aload_0
         5: getfield      #14                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;
         8: aload_0
         9: getfield      #18                 // Field $regionX:I
        12: aload_0
        13: getfield      #21                 // Field $regionY:I
        16: aload_0
        17: getfield      #25                 // Field $onProgress:Lkotlin/jvm/functions/Function2;
        20: aload_2
        21: invokespecial #441                // Method "<init>":(Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;IILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V
        24: astore_3
        25: aload_3
        26: aload_1
        27: putfield      #102                // Field L$0:Ljava/lang/Object;
        30: aload_3
        31: checkcast     #353                // class kotlin/coroutines/Continuation
        34: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      35     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3;
            0      35     1 value   Ljava/lang/Object;
            0      35     2 $completion   Lkotlin/coroutines/Continuation;
    Signature: #439                         // (Ljava/lang/Object;Lkotlin/coroutines/Continuation<*>;)Lkotlin/coroutines/Continuation<Lkotlin/Unit;>;

  public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$IndexationResult>);
    descriptor: (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: aload_2
         3: invokevirtual #446                // Method create:(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
         6: checkcast     #2                  // class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3
         9: getstatic     #452                // Field kotlin/Unit.INSTANCE:Lkotlin/Unit;
        12: invokevirtual #454                // Method invokeSuspend:(Ljava/lang/Object;)Ljava/lang/Object;
        15: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3;
            0      16     1    p1   Lkotlinx/coroutines/CoroutineScope;
            0      16     2    p2   Lkotlin/coroutines/Continuation;
    Signature: #444                         // (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult;>;)Ljava/lang/Object;

  public java.lang.Object invoke(java.lang.Object, java.lang.Object);
    descriptor: (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: checkcast     #104                // class kotlinx/coroutines/CoroutineScope
         5: aload_2
         6: checkcast     #353                // class kotlin/coroutines/Continuation
         9: invokevirtual #458                // Method invoke:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
        12: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3;
            0      13     1    p1   Ljava/lang/Object;
            0      13     2    p2   Ljava/lang/Object;
}
InnerClasses:
  public static final #475= #161 of #127; // DataSource=class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource of class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
  public static #476= #133 of #127;       // GeoDataProvider=class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider of class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
  public static final #477= #180 of #133; // SourcePriority=class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$SourcePriority of class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider
  public static final #478= #393 of #127; // IndexationResult=class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult of class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
  public static final #479= #159 of #127; // SourceInfo=class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo of class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
  static final #2;                        // class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3
  static final #240;                      // class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$collectorDeferred$1
  static final #279;                      // class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1
  public static final #480= #345 of #343; // DefaultImpls=class kotlinx/coroutines/channels/SendChannel$DefaultImpls of class kotlinx/coroutines/channels/SendChannel
EnclosingMethod: #127.#473              // ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer.indexRegion
Signature: #3                           // Lkotlin/coroutines/jvm/internal/SuspendLambda;Lkotlin/jvm/functions/Function2<Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult;>;Ljava/lang/Object;>;
SourceFile: "GeoIndexer.kt"
SourceDebugExtension:
  SMAP
  GeoIndexer.kt
  Kotlin
  *S Kotlin
  *F
  + 1 GeoIndexer.kt
  ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3
  + 2 _Collections.kt
  kotlin/collections/CollectionsKt___CollectionsKt
  *L
  1#1,472:1
  1586#2:473
  1661#2,3:474
  1915#2,2:477
  1596#2:479
  1629#2,4:480
  1834#2,4:484
  1834#2,4:488
  *S KotlinDebug
  *F
  + 1 GeoIndexer.kt
  ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3
  *L
  305#1:473
  305#1:474,3
  361#1:477,2
  368#1:479
  368#1:480,4
  372#1:484,4
  373#1:488,4
  *E
RuntimeVisibleAnnotations:
  0: #60(#61=s#62,#63=[I#64,I#65],#66=[I#67,I#68],#69=[I#70,I#70,I#70,I#70,I#70,I#70,I#70,I#70,I#70,I#70,I#70,I#70,I#70,I#70,I#70,I#70,I#70,I#70,I#70,I#70,I#70,I#71,I#71,I#71,I#71,I#71,I#71,I#71,I#71,I#71,I#71,I#71,I#71,I#71,I#71,I#71,I#71],#72=[s#73,s#36,s#38,s#39,s#40,s#41,s#42,s#43,s#45,s#46,s#47,s#49,s#51,s#52,s#53,s#54,s#55,s#56,s#57,s#58,s#59,s#73,s#36,s#38,s#39,s#40,s#41,s#42,s#47,s#49,s#51,s#52,s#53,s#54,s#55,s#56,s#57],#74=[s#75,s#76,s#77,s#78,s#79,s#80,s#81,s#82,s#83,s#84,s#85,s#86,s#87,s#88,s#89,s#90,s#91,s#92,s#93,s#94,s#95,s#75,s#76,s#77,s#78,s#79,s#80,s#81,s#85,s#86,s#87,s#88,s#89,s#90,s#91,s#92,s#93],#96=s#34,#97=s#98,#99=I#100)
    kotlin.coroutines.jvm.internal.DebugMetadata(
      f="GeoIndexer.kt"
      l=[361,366]
      nl=[477,368]
      i=[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1]
      s=["L$0","L$1","L$2","L$3","L$4","L$5","L$6","L$7","L$9","L$10","J$0","Z$0","Z$1","I$0","I$1","I$2","I$3","I$4","I$5","I$6","I$7","L$0","L$1","L$2","L$3","L$4","L$5","L$6","J$0","Z$0","Z$1","I$0","I$1","I$2","I$3","I$4","I$5"]
      n=["$this$withContext","sourceInfo","processed","chunks","nodeChannel","collectorDeferred","chunkJobs","$this$forEach$iv","element$iv","it","startTime","hasL2J","hasConvDat","baseGeoX","baseGeoY","maxGeoX","maxGeoY","totalCells","chunkSize","$i$f$forEach","$i$a$-forEach-GeoIndexer$indexRegion$3$1","$this$withContext","sourceInfo","processed","chunks","nodeChannel","collectorDeferred","chunkJobs","startTime","hasL2J","hasConvDat","baseGeoX","baseGeoY","maxGeoX","maxGeoY","totalCells","chunkSize"]
      m="invokeSuspend"
      c="ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$indexRegion$3"
      v=2
    )
  1: #460(#461=[I#100,I#462,I#70],#463=I#462,#464=I#465,#466=[s#467],#468=[s#469,s#470,s#434])
    kotlin.Metadata(
      mv=[2,3,0]
      k=3
      xi=48
      d1=["\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"]
      d2=["<anonymous>","Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult;","Lkotlinx/coroutines/CoroutineScope;"]
    )
RuntimeInvisibleAnnotations:
  0: #481(#442=[s#482])
    kotlin.jvm.internal.SourceDebugExtension(
      value=["SMAP\nGeoIndexer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GeoIndexer.kt\next/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,472:1\n1586#2:473\n1661#2,3:474\n1915#2,2:477\n1596#2:479\n1629#2,4:480\n1834#2,4:484\n1834#2,4:488\n*S KotlinDebug\n*F\n+ 1 GeoIndexer.kt\next/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3\n*L\n305#1:473\n305#1:474,3\n361#1:477,2\n368#1:479\n368#1:480,4\n372#1:484,4\n373#1:488,4\n*E\n"]
    )
BootstrapMethods:
  0: #151 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #144 Nenhuma fonte de dados encontrada para região [\u0001, \u0001]. Procure por: \u0001_\u0001.l2j ou \u0001_\u0001_conv.dat
  1: #151 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #189 Fontes detectadas: L2J=\u0001, ConvDat=\u0001
  2: #151 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #228 Indexando \u0001 chunks
  3: #151 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #388 Indexação concluída (\u0001)
