// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.MainKt$runGeneration$1
// File: ext\mods\gameserver\geoengine\pathfinding\MainKt$runGeneration$1.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$1.class
  Last modified 9 de jul de 2026; size 8479 bytes
  MD5 checksum 11d96f072bbfefd1811605fd0fde987f
  Compiled from "Main.kt"
final class ext.mods.gameserver.geoengine.pathfinding.MainKt$runGeneration$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>
  minor version: 0
  major version: 69
  flags: (0x0030) ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$1
  super_class: #5                         // kotlin/coroutines/jvm/internal/SuspendLambda
  interfaces: 1, fields: 5, methods: 7, attributes: 8
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$1
    #2 = Class              #1            // ext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$1
    #3 = Utf8               Lkotlin/coroutines/jvm/internal/SuspendLambda;Lkotlin/jvm/functions/Function2<Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Lkotlin/Unit;>;Ljava/lang/Object;>;
    #4 = Utf8               kotlin/coroutines/jvm/internal/SuspendLambda
    #5 = Class              #4            // kotlin/coroutines/jvm/internal/SuspendLambda
    #6 = Utf8               kotlin/jvm/functions/Function2
    #7 = Class              #6            // kotlin/jvm/functions/Function2
    #8 = Utf8               <init>
    #9 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;IILext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$mockProvider$1;Lkotlin/coroutines/Continuation;)V
   #10 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;IILext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$mockProvider$1;Lkotlin/coroutines/Continuation<-Lext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$1;>;)V
   #11 = Utf8               $indexer
   #12 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;
   #13 = NameAndType        #11:#12       // $indexer:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;
   #14 = Fieldref           #2.#13        // ext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$1.$indexer:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;
   #15 = Utf8               $regionX
   #16 = Utf8               I
   #17 = NameAndType        #15:#16       // $regionX:I
   #18 = Fieldref           #2.#17        // ext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$1.$regionX:I
   #19 = Utf8               $regionY
   #20 = NameAndType        #19:#16       // $regionY:I
   #21 = Fieldref           #2.#20        // ext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$1.$regionY:I
   #22 = Utf8               $mockProvider
   #23 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$mockProvider$1;
   #24 = NameAndType        #22:#23       // $mockProvider:Lext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$mockProvider$1;
   #25 = Fieldref           #2.#24        // ext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$1.$mockProvider:Lext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$mockProvider$1;
   #26 = Utf8               (ILkotlin/coroutines/Continuation;)V
   #27 = NameAndType        #8:#26        // "<init>":(ILkotlin/coroutines/Continuation;)V
   #28 = Methodref          #5.#27        // kotlin/coroutines/jvm/internal/SuspendLambda."<init>":(ILkotlin/coroutines/Continuation;)V
   #29 = Utf8               this
   #30 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$1;
   #31 = Utf8               $completion
   #32 = Utf8               Lkotlin/coroutines/Continuation;
   #33 = Utf8               invokeSuspend
   #34 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #35 = Utf8               Lkotlin/coroutines/jvm/internal/DebugMetadata;
   #36 = Utf8               f
   #37 = Utf8               Main.kt
   #38 = Utf8               l
   #39 = Integer            127
   #40 = Utf8               nl
   #41 = Integer            135
   #42 = Utf8               i
   #43 = Utf8               s
   #44 = Utf8               n
   #45 = Utf8               m
   #46 = Utf8               c
   #47 = Utf8               ext.mods.gameserver.geoengine.pathfinding.MainKt$runGeneration$1
   #48 = Utf8               v
   #49 = Integer            2
   #50 = Utf8               kotlin/coroutines/intrinsics/IntrinsicsKt
   #51 = Class              #50           // kotlin/coroutines/intrinsics/IntrinsicsKt
   #52 = Utf8               getCOROUTINE_SUSPENDED
   #53 = Utf8               ()Ljava/lang/Object;
   #54 = NameAndType        #52:#53       // getCOROUTINE_SUSPENDED:()Ljava/lang/Object;
   #55 = Methodref          #51.#54       // kotlin/coroutines/intrinsics/IntrinsicsKt.getCOROUTINE_SUSPENDED:()Ljava/lang/Object;
   #56 = Utf8               label
   #57 = NameAndType        #56:#16       // label:I
   #58 = Fieldref           #2.#57        // ext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$1.label:I
   #59 = Utf8               kotlin/ResultKt
   #60 = Class              #59           // kotlin/ResultKt
   #61 = Utf8               throwOnFailure
   #62 = Utf8               (Ljava/lang/Object;)V
   #63 = NameAndType        #61:#62       // throwOnFailure:(Ljava/lang/Object;)V
   #64 = Methodref          #60.#63       // kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
   #65 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #66 = MethodType         #65           //  (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #67 = Utf8               invokeSuspend$lambda$0
   #68 = Utf8               (Ljava/lang/String;I)Lkotlin/Unit;
   #69 = NameAndType        #67:#68       // invokeSuspend$lambda$0:(Ljava/lang/String;I)Lkotlin/Unit;
   #70 = Methodref          #2.#69        // ext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$1.invokeSuspend$lambda$0:(Ljava/lang/String;I)Lkotlin/Unit;
   #71 = MethodHandle       6:#70         // REF_invokeStatic ext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$1.invokeSuspend$lambda$0:(Ljava/lang/String;I)Lkotlin/Unit;
   #72 = Utf8               (Ljava/lang/String;Ljava/lang/Integer;)Lkotlin/Unit;
   #73 = MethodType         #72           //  (Ljava/lang/String;Ljava/lang/Integer;)Lkotlin/Unit;
   #74 = Utf8               java/lang/invoke/LambdaMetafactory
   #75 = Class              #74           // java/lang/invoke/LambdaMetafactory
   #76 = Utf8               metafactory
   #77 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
   #78 = NameAndType        #76:#77       // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
   #79 = Methodref          #75.#78       // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
   #80 = MethodHandle       6:#79         // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
   #81 = Utf8               invoke
   #82 = Utf8               ()Lkotlin/jvm/functions/Function2;
   #83 = NameAndType        #81:#82       // invoke:()Lkotlin/jvm/functions/Function2;
   #84 = InvokeDynamic      #0:#83        // #0:invoke:()Lkotlin/jvm/functions/Function2;
   #85 = Utf8               kotlin/coroutines/Continuation
   #86 = Class              #85           // kotlin/coroutines/Continuation
   #87 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
   #88 = Class              #87           // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
   #89 = Utf8               indexRegion$default
   #90 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;IIILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
   #91 = NameAndType        #89:#90       // indexRegion$default:(Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;IIILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
   #92 = Methodref          #88.#91       // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer.indexRegion$default:(Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;IIILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
   #93 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult
   #94 = Class              #93           // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult
   #95 = Utf8               \n[2/4] Indexação concluída!
   #96 = String             #95           // \n[2/4] Indexação concluída!
   #97 = Utf8               java/lang/System
   #98 = Class              #97           // java/lang/System
   #99 = Utf8               out
  #100 = Utf8               Ljava/io/PrintStream;
  #101 = NameAndType        #99:#100      // out:Ljava/io/PrintStream;
  #102 = Fieldref           #98.#101      // java/lang/System.out:Ljava/io/PrintStream;
  #103 = Utf8               java/io/PrintStream
  #104 = Class              #103          // java/io/PrintStream
  #105 = Utf8               println
  #106 = NameAndType        #105:#62      // println:(Ljava/lang/Object;)V
  #107 = Methodref          #104.#106     // java/io/PrintStream.println:(Ljava/lang/Object;)V
  #108 = Utf8               getNodes
  #109 = Utf8               ()Ljava/util/List;
  #110 = NameAndType        #108:#109     // getNodes:()Ljava/util/List;
  #111 = Methodref          #94.#110      // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult.getNodes:()Ljava/util/List;
  #112 = Utf8               java/util/List
  #113 = Class              #112          // java/util/List
  #114 = Utf8               size
  #115 = Utf8               ()I
  #116 = NameAndType        #114:#115     // size:()I
  #117 = InterfaceMethodref #113.#116     // java/util/List.size:()I
  #118 = Utf8                 Nós totais: \u0001
  #119 = String             #118          //   Nós totais: \u0001
  #120 = Utf8               java/lang/invoke/StringConcatFactory
  #121 = Class              #120          // java/lang/invoke/StringConcatFactory
  #122 = Utf8               makeConcatWithConstants
  #123 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #124 = NameAndType        #122:#123     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #125 = Methodref          #121.#124     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #126 = MethodHandle       6:#125        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #127 = Utf8               (I)Ljava/lang/String;
  #128 = NameAndType        #122:#127     // makeConcatWithConstants:(I)Ljava/lang/String;
  #129 = InvokeDynamic      #1:#128       // #1:makeConcatWithConstants:(I)Ljava/lang/String;
  #130 = Utf8               getWalkableCount
  #131 = NameAndType        #130:#115     // getWalkableCount:()I
  #132 = Methodref          #94.#131      // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult.getWalkableCount:()I
  #133 = Utf8                 Nós caminháveis: \u0001
  #134 = String             #133          //   Nós caminháveis: \u0001
  #135 = InvokeDynamic      #2:#128       // #2:makeConcatWithConstants:(I)Ljava/lang/String;
  #136 = Utf8               getMultilayerCount
  #137 = NameAndType        #136:#115     // getMultilayerCount:()I
  #138 = Methodref          #94.#137      // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult.getMultilayerCount:()I
  #139 = Utf8                 Multilayer: \u0001
  #140 = String             #139          //   Multilayer: \u0001
  #141 = InvokeDynamic      #3:#128       // #3:makeConcatWithConstants:(I)Ljava/lang/String;
  #142 = Utf8               getDurationMs
  #143 = Utf8               ()J
  #144 = NameAndType        #142:#143     // getDurationMs:()J
  #145 = Methodref          #94.#144      // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult.getDurationMs:()J
  #146 = Utf8                 Tempo: \u0001ms
  #147 = String             #146          //   Tempo: \u0001ms
  #148 = Utf8               (J)Ljava/lang/String;
  #149 = NameAndType        #122:#148     // makeConcatWithConstants:(J)Ljava/lang/String;
  #150 = InvokeDynamic      #4:#149       // #4:makeConcatWithConstants:(J)Ljava/lang/String;
  #151 = Utf8               getSourceInfo
  #152 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;
  #153 = NameAndType        #151:#152     // getSourceInfo:()Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;
  #154 = Methodref          #94.#153      // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult.getSourceInfo:()Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;
  #155 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo
  #156 = Class              #155          // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo
  #157 = Utf8               getPrimarySource
  #158 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;
  #159 = NameAndType        #157:#158     // getPrimarySource:()Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;
  #160 = Methodref          #156.#159     // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo.getPrimarySource:()Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;
  #161 = Utf8                 Fonte: \u0001
  #162 = String             #161          //   Fonte: \u0001
  #163 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;)Ljava/lang/String;
  #164 = NameAndType        #122:#163     // makeConcatWithConstants:(Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;)Ljava/lang/String;
  #165 = InvokeDynamic      #5:#164       // #5:makeConcatWithConstants:(Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;)Ljava/lang/String;
  #166 = Utf8               \n[3/4] Calculando Jump Points (JPS+)...
  #167 = String             #166          // \n[3/4] Calculando Jump Points (JPS+)...
  #168 = Utf8               currentTimeMillis
  #169 = NameAndType        #168:#143     // currentTimeMillis:()J
  #170 = Methodref          #98.#169      // java/lang/System.currentTimeMillis:()J
  #171 = MethodType         #34           //  (Ljava/lang/Object;)Ljava/lang/Object;
  #172 = Utf8               invokeSuspend$lambda$1$0
  #173 = Utf8               (I)Lkotlin/Unit;
  #174 = NameAndType        #172:#173     // invokeSuspend$lambda$1$0:(I)Lkotlin/Unit;
  #175 = Methodref          #2.#174       // ext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$1.invokeSuspend$lambda$1$0:(I)Lkotlin/Unit;
  #176 = MethodHandle       6:#175        // REF_invokeStatic ext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$1.invokeSuspend$lambda$1$0:(I)Lkotlin/Unit;
  #177 = Utf8               (Ljava/lang/Integer;)Lkotlin/Unit;
  #178 = MethodType         #177          //  (Ljava/lang/Integer;)Lkotlin/Unit;
  #179 = Utf8               ()Lkotlin/jvm/functions/Function1;
  #180 = NameAndType        #81:#179      // invoke:()Lkotlin/jvm/functions/Function1;
  #181 = InvokeDynamic      #6:#180       // #6:invoke:()Lkotlin/jvm/functions/Function1;
  #182 = Utf8               calculateJumpPoints
  #183 = Utf8               (Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;
  #184 = NameAndType        #182:#183     // calculateJumpPoints:(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;
  #185 = Methodref          #88.#184      // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer.calculateJumpPoints:(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;
  #186 = Utf8               java/util/Map
  #187 = Class              #186          // java/util/Map
  #188 = InterfaceMethodref #187.#116     // java/util/Map.size:()I
  #189 = Utf8                 Jump Points calculados para \u0001 nós
  #190 = String             #189          //   Jump Points calculados para \u0001 nós
  #191 = InvokeDynamic      #7:#128       // #7:makeConcatWithConstants:(I)Ljava/lang/String;
  #192 = Utf8                 Tempo JPS: \u0001ms
  #193 = String             #192          //   Tempo JPS: \u0001ms
  #194 = InvokeDynamic      #8:#149       // #8:makeConcatWithConstants:(J)Ljava/lang/String;
  #195 = Utf8               \n[4/4] Serialização (simulada)...
  #196 = String             #195          // \n[4/4] Serialização (simulada)...
  #197 = Utf8                 Em produção: salvar em data/pathfinder/\u0001_\u0001.l2br
  #198 = String             #197          //   Em produção: salvar em data/pathfinder/\u0001_\u0001.l2br
  #199 = Utf8               (II)Ljava/lang/String;
  #200 = NameAndType        #122:#199     // makeConcatWithConstants:(II)Ljava/lang/String;
  #201 = InvokeDynamic      #9:#200       // #9:makeConcatWithConstants:(II)Ljava/lang/String;
  #202 = Utf8               ext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$mockProvider$1
  #203 = Class              #202          // ext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$mockProvider$1
  #204 = Utf8               hasConvDatData
  #205 = Utf8               (II)Z
  #206 = NameAndType        #204:#205     // hasConvDatData:(II)Z
  #207 = Methodref          #203.#206     // ext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$mockProvider$1.hasConvDatData:(II)Z
  #208 = Utf8               Merge L2J+ConvDat
  #209 = String             #208          // Merge L2J+ConvDat
  #210 = Utf8               L2J apenas
  #211 = String             #210          // L2J apenas
  #212 = Utf8                 Fonte utilizada: \u0001
  #213 = String             #212          //   Fonte utilizada: \u0001
  #214 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #215 = NameAndType        #122:#214     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #216 = InvokeDynamic      #10:#215      // #10:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #217 = Utf8               kotlin/Unit
  #218 = Class              #217          // kotlin/Unit
  #219 = Utf8               INSTANCE
  #220 = Utf8               Lkotlin/Unit;
  #221 = NameAndType        #219:#220     // INSTANCE:Lkotlin/Unit;
  #222 = Fieldref           #218.#221     // kotlin/Unit.INSTANCE:Lkotlin/Unit;
  #223 = Utf8               java/lang/IllegalStateException
  #224 = Class              #223          // java/lang/IllegalStateException
  #225 = Utf8               call to \'resume\' before \'invoke\' with coroutine
  #226 = String             #225          // call to \'resume\' before \'invoke\' with coroutine
  #227 = Utf8               (Ljava/lang/String;)V
  #228 = NameAndType        #8:#227       // "<init>":(Ljava/lang/String;)V
  #229 = Methodref          #224.#228     // java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
  #230 = Utf8               $i$a$-measureTimeMillis-MainKt$runGeneration$1$jumpPointTime$1
  #231 = Utf8               jpsData
  #232 = Utf8               Ljava/util/Map;
  #233 = Utf8               $i$f$measureTimeMillis
  #234 = Utf8               start$iv
  #235 = Utf8               J
  #236 = Utf8               result
  #237 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult;
  #238 = Utf8               jumpPointTime
  #239 = Utf8               $result
  #240 = Utf8               Ljava/lang/Object;
  #241 = Utf8               java/lang/Object
  #242 = Class              #241          // java/lang/Object
  #243 = Utf8               java/lang/String
  #244 = Class              #243          // java/lang/String
  #245 = Utf8               create
  #246 = Utf8               (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
  #247 = Utf8               (Ljava/lang/Object;Lkotlin/coroutines/Continuation<*>;)Lkotlin/coroutines/Continuation<Lkotlin/Unit;>;
  #248 = NameAndType        #8:#9         // "<init>":(Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;IILext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$mockProvider$1;Lkotlin/coroutines/Continuation;)V
  #249 = Methodref          #2.#248       // ext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$1."<init>":(Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;IILext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$mockProvider$1;Lkotlin/coroutines/Continuation;)V
  #250 = Utf8               value
  #251 = Utf8               (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #252 = Utf8               (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Lkotlin/Unit;>;)Ljava/lang/Object;
  #253 = NameAndType        #245:#246     // create:(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
  #254 = Methodref          #2.#253       // ext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$1.create:(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
  #255 = NameAndType        #33:#34       // invokeSuspend:(Ljava/lang/Object;)Ljava/lang/Object;
  #256 = Methodref          #2.#255       // ext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$1.invokeSuspend:(Ljava/lang/Object;)Ljava/lang/Object;
  #257 = Utf8               p1
  #258 = Utf8               Lkotlinx/coroutines/CoroutineScope;
  #259 = Utf8               p2
  #260 = Utf8                 JPS Progress: \u0001%
  #261 = String             #260          //   JPS Progress: \u0001%
  #262 = InvokeDynamic      #11:#128      // #11:makeConcatWithConstants:(I)Ljava/lang/String;
  #263 = Utf8               progress
  #264 = Utf8                 [\u0001%] \u0001
  #265 = String             #264          //   [\u0001%] \u0001
  #266 = Utf8               (ILjava/lang/String;)Ljava/lang/String;
  #267 = NameAndType        #122:#266     // makeConcatWithConstants:(ILjava/lang/String;)Ljava/lang/String;
  #268 = InvokeDynamic      #12:#267      // #12:makeConcatWithConstants:(ILjava/lang/String;)Ljava/lang/String;
  #269 = Utf8               phase
  #270 = Utf8               Ljava/lang/String;
  #271 = Utf8               percent
  #272 = Utf8               kotlinx/coroutines/CoroutineScope
  #273 = Class              #272          // kotlinx/coroutines/CoroutineScope
  #274 = NameAndType        #81:#251      // invoke:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #275 = Methodref          #2.#274       // ext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$1.invoke:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #276 = Utf8               Lkotlin/Metadata;
  #277 = Utf8               mv
  #278 = Integer            3
  #279 = Integer            0
  #280 = Utf8               k
  #281 = Utf8               xi
  #282 = Integer            48
  #283 = Utf8               d1
  #284 = Utf8               \u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n
  #285 = Utf8               d2
  #286 = Utf8               <anonymous>
  #287 = Utf8
  #288 = Utf8               ext/mods/gameserver/geoengine/pathfinding/MainKt
  #289 = Class              #288          // ext/mods/gameserver/geoengine/pathfinding/MainKt
  #290 = Utf8               runGeneration
  #291 = Utf8               (II)V
  #292 = NameAndType        #290:#291     // runGeneration:(II)V
  #293 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource
  #294 = Class              #293          // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource
  #295 = Utf8               DataSource
  #296 = Utf8               IndexationResult
  #297 = Utf8               SourceInfo
  #298 = Utf8               Lkotlin/jvm/internal/SourceDebugExtension;
  #299 = Utf8               SMAP\nMain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Main.kt\next/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$1\n+ 2 Timing.kt\nkotlin/system/TimingKt\n*L\n1#1,269:1\n29#2,3:270\n*S KotlinDebug\n*F\n+ 1 Main.kt\next/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$1\n*L\n146#1:270,3\n*E\n
  #300 = Utf8               Code
  #301 = Utf8               LocalVariableTable
  #302 = Utf8               Signature
  #303 = Utf8               StackMapTable
  #304 = Utf8               LineNumberTable
  #305 = Utf8               InnerClasses
  #306 = Utf8               EnclosingMethod
  #307 = Utf8               SourceFile
  #308 = Utf8               SourceDebugExtension
  #309 = Utf8               RuntimeVisibleAnnotations
  #310 = Utf8               RuntimeInvisibleAnnotations
  #311 = Utf8               BootstrapMethods
{
  int label;
    descriptor: I
    flags: (0x0000)

  final ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer $indexer;
    descriptor: Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  final int $regionX;
    descriptor: I
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  final int $regionY;
    descriptor: I
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  final ext.mods.gameserver.geoengine.pathfinding.MainKt$runGeneration$mockProvider$1 $mockProvider;
    descriptor: Lext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$mockProvider$1;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  ext.mods.gameserver.geoengine.pathfinding.MainKt$runGeneration$1(ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer, int, int, ext.mods.gameserver.geoengine.pathfinding.MainKt$runGeneration$mockProvider$1, kotlin.coroutines.Continuation<? super ext.mods.gameserver.geoengine.pathfinding.MainKt$runGeneration$1>);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;IILext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$mockProvider$1;Lkotlin/coroutines/Continuation;)V
    flags: (0x0000)
    Code:
      stack=3, locals=6, args_size=6
         0: aload_0
         1: aload_1
         2: putfield      #14                 // Field $indexer:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;
         5: aload_0
         6: iload_2
         7: putfield      #18                 // Field $regionX:I
        10: aload_0
        11: iload_3
        12: putfield      #21                 // Field $regionY:I
        15: aload_0
        16: aload         4
        18: putfield      #25                 // Field $mockProvider:Lext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$mockProvider$1;
        21: aload_0
        22: iconst_2
        23: aload         5
        25: invokespecial #28                 // Method kotlin/coroutines/jvm/internal/SuspendLambda."<init>":(ILkotlin/coroutines/Continuation;)V
        28: return
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      29     0  this   Lext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$1;
            0      29     1 $indexer   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;
            0      29     2 $regionX   I
            0      29     3 $regionY   I
            0      29     4 $mockProvider   Lext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$mockProvider$1;
            0      29     5 $completion   Lkotlin/coroutines/Continuation;
    Signature: #10                          // (Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;IILext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$mockProvider$1;Lkotlin/coroutines/Continuation<-Lext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$1;>;)V

  public final java.lang.Object invokeSuspend(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Ljava/lang/Object;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=10, locals=12, args_size=2
         0: invokestatic  #55                 // Method kotlin/coroutines/intrinsics/IntrinsicsKt.getCOROUTINE_SUSPENDED:()Ljava/lang/Object;
         3: astore        11
         5: aload_0
         6: getfield      #58                 // Field label:I
         9: tableswitch   { // 0 to 1

                       0: 32

                       1: 77
                 default: 342
            }
        32: aload_1
        33: invokestatic  #64                 // Method kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
        36: aload_0
        37: getfield      #14                 // Field $indexer:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;
        40: aload_0
        41: getfield      #18                 // Field $regionX:I
        44: aload_0
        45: getfield      #21                 // Field $regionY:I
        48: iconst_0
        49: invokedynamic #84,  0             // InvokeDynamic #0:invoke:()Lkotlin/jvm/functions/Function2;
        54: aload_0
        55: checkcast     #86                 // class kotlin/coroutines/Continuation
        58: iconst_4
        59: aconst_null
        60: aload_0
        61: iconst_1
        62: putfield      #58                 // Field label:I
        65: invokestatic  #92                 // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer.indexRegion$default:(Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;IIILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
        68: dup
        69: aload         11
        71: if_acmpne     82
        74: aload         11
        76: areturn
        77: aload_1
        78: invokestatic  #64                 // Method kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
        81: aload_1
        82: checkcast     #94                 // class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult
        85: astore_2
        86: ldc           #96                 // String \n[2/4] Indexação concluída!
        88: getstatic     #102                // Field java/lang/System.out:Ljava/io/PrintStream;
        91: swap
        92: invokevirtual #107                // Method java/io/PrintStream.println:(Ljava/lang/Object;)V
        95: aload_2
        96: invokevirtual #111                // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult.getNodes:()Ljava/util/List;
        99: invokeinterface #117,  1          // InterfaceMethod java/util/List.size:()I
       104: invokedynamic #129,  0            // InvokeDynamic #1:makeConcatWithConstants:(I)Ljava/lang/String;
       109: getstatic     #102                // Field java/lang/System.out:Ljava/io/PrintStream;
       112: swap
       113: invokevirtual #107                // Method java/io/PrintStream.println:(Ljava/lang/Object;)V
       116: aload_2
       117: invokevirtual #132                // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult.getWalkableCount:()I
       120: invokedynamic #135,  0            // InvokeDynamic #2:makeConcatWithConstants:(I)Ljava/lang/String;
       125: getstatic     #102                // Field java/lang/System.out:Ljava/io/PrintStream;
       128: swap
       129: invokevirtual #107                // Method java/io/PrintStream.println:(Ljava/lang/Object;)V
       132: aload_2
       133: invokevirtual #138                // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult.getMultilayerCount:()I
       136: invokedynamic #141,  0            // InvokeDynamic #3:makeConcatWithConstants:(I)Ljava/lang/String;
       141: getstatic     #102                // Field java/lang/System.out:Ljava/io/PrintStream;
       144: swap
       145: invokevirtual #107                // Method java/io/PrintStream.println:(Ljava/lang/Object;)V
       148: aload_2
       149: invokevirtual #145                // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult.getDurationMs:()J
       152: invokedynamic #150,  0            // InvokeDynamic #4:makeConcatWithConstants:(J)Ljava/lang/String;
       157: getstatic     #102                // Field java/lang/System.out:Ljava/io/PrintStream;
       160: swap
       161: invokevirtual #107                // Method java/io/PrintStream.println:(Ljava/lang/Object;)V
       164: aload_2
       165: instanceof    #94                 // class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult
       168: ifeq          190
       171: aload_2
       172: invokevirtual #154                // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult.getSourceInfo:()Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;
       175: invokevirtual #160                // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo.getPrimarySource:()Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;
       178: invokedynamic #165,  0            // InvokeDynamic #5:makeConcatWithConstants:(Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;)Ljava/lang/String;
       183: getstatic     #102                // Field java/lang/System.out:Ljava/io/PrintStream;
       186: swap
       187: invokevirtual #107                // Method java/io/PrintStream.println:(Ljava/lang/Object;)V
       190: ldc           #167                // String \n[3/4] Calculando Jump Points (JPS+)...
       192: getstatic     #102                // Field java/lang/System.out:Ljava/io/PrintStream;
       195: swap
       196: invokevirtual #107                // Method java/io/PrintStream.println:(Ljava/lang/Object;)V
       199: aload_0
       200: getfield      #14                 // Field $indexer:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;
       203: astore        5
       205: iconst_0
       206: istore        6
       208: invokestatic  #170                // Method java/lang/System.currentTimeMillis:()J
       211: lstore        7
       213: iconst_0
       214: istore        9
       216: aload         5
       218: aload_2
       219: invokevirtual #111                // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult.getNodes:()Ljava/util/List;
       222: invokedynamic #181,  0            // InvokeDynamic #6:invoke:()Lkotlin/jvm/functions/Function1;
       227: invokevirtual #185                // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer.calculateJumpPoints:(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;
       230: astore        10
       232: aload         10
       234: invokeinterface #188,  1          // InterfaceMethod java/util/Map.size:()I
       239: invokedynamic #191,  0            // InvokeDynamic #7:makeConcatWithConstants:(I)Ljava/lang/String;
       244: getstatic     #102                // Field java/lang/System.out:Ljava/io/PrintStream;
       247: swap
       248: invokevirtual #107                // Method java/io/PrintStream.println:(Ljava/lang/Object;)V
       251: nop
       252: invokestatic  #170                // Method java/lang/System.currentTimeMillis:()J
       255: lload         7
       257: lsub
       258: lstore_3
       259: lload_3
       260: invokedynamic #194,  0            // InvokeDynamic #8:makeConcatWithConstants:(J)Ljava/lang/String;
       265: getstatic     #102                // Field java/lang/System.out:Ljava/io/PrintStream;
       268: swap
       269: invokevirtual #107                // Method java/io/PrintStream.println:(Ljava/lang/Object;)V
       272: ldc           #196                // String \n[4/4] Serialização (simulada)...
       274: getstatic     #102                // Field java/lang/System.out:Ljava/io/PrintStream;
       277: swap
       278: invokevirtual #107                // Method java/io/PrintStream.println:(Ljava/lang/Object;)V
       281: aload_0
       282: getfield      #18                 // Field $regionX:I
       285: aload_0
       286: getfield      #21                 // Field $regionY:I
       289: invokedynamic #201,  0            // InvokeDynamic #9:makeConcatWithConstants:(II)Ljava/lang/String;
       294: getstatic     #102                // Field java/lang/System.out:Ljava/io/PrintStream;
       297: swap
       298: invokevirtual #107                // Method java/io/PrintStream.println:(Ljava/lang/Object;)V
       301: aload_0
       302: getfield      #25                 // Field $mockProvider:Lext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$mockProvider$1;
       305: aload_0
       306: getfield      #18                 // Field $regionX:I
       309: aload_0
       310: getfield      #21                 // Field $regionY:I
       313: invokevirtual #207                // Method ext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$mockProvider$1.hasConvDatData:(II)Z
       316: ifeq          324
       319: ldc           #209                // String Merge L2J+ConvDat
       321: goto          326
       324: ldc           #211                // String L2J apenas
       326: invokedynamic #216,  0            // InvokeDynamic #10:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       331: getstatic     #102                // Field java/lang/System.out:Ljava/io/PrintStream;
       334: swap
       335: invokevirtual #107                // Method java/io/PrintStream.println:(Ljava/lang/Object;)V
       338: getstatic     #222                // Field kotlin/Unit.INSTANCE:Lkotlin/Unit;
       341: areturn
       342: new           #224                // class java/lang/IllegalStateException
       345: dup
       346: ldc           #226                // String call to \'resume\' before \'invoke\' with coroutine
       348: invokespecial #229                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
       351: athrow
      StackMapTable: number_of_entries = 7
        frame_type = 255 /* full_frame */
          offset_delta = 32
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$1, class java/lang/Object, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 44 /* same */
        frame_type = 68 /* same_locals_1_stack_item */
          stack = [ class java/lang/Object ]
        frame_type = 255 /* full_frame */
          offset_delta = 107
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$1, class java/lang/Object, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 133
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$1, class java/lang/Object, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult, long, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer, int, long, int, class java/util/Map, class java/lang/Object ]
          stack = []
        frame_type = 65 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$1, class java/lang/Object, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = []
      LineNumberTable:
        line 126: 3
        line 127: 36
        line 128: 40
        line 129: 44
        line 127: 48
        line 126: 74
        line 135: 86
        line 136: 95
        line 137: 116
        line 138: 132
        line 139: 148
        line 141: 164
        line 142: 171
        line 145: 190
        line 146: 205
        line 270: 208
        line 271: 213
        line 147: 216
        line 150: 232
        line 151: 251
        line 271: 252
        line 272: 252
        line 146: 258
        line 152: 259
        line 154: 272
        line 155: 281
        line 156: 301
        line 157: 338
        line 126: 342
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          216      36     9 $i$a$-measureTimeMillis-MainKt$runGeneration$1$jumpPointTime$1   I
          232      20    10 jpsData   Ljava/util/Map;
          208      50     6 $i$f$measureTimeMillis   I
          213      45     7 start$iv   J
           86     256     2 result   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult;
          259      83     3 jumpPointTime   J
            0     352     0  this   Lext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$1;
            0     352     1 $result   Ljava/lang/Object;

  public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object, kotlin.coroutines.Continuation<?>);
    descriptor: (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=7, locals=3, args_size=3
         0: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$1
         3: dup
         4: aload_0
         5: getfield      #14                 // Field $indexer:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;
         8: aload_0
         9: getfield      #18                 // Field $regionX:I
        12: aload_0
        13: getfield      #21                 // Field $regionY:I
        16: aload_0
        17: getfield      #25                 // Field $mockProvider:Lext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$mockProvider$1;
        20: aload_2
        21: invokespecial #249                // Method "<init>":(Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;IILext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$mockProvider$1;Lkotlin/coroutines/Continuation;)V
        24: checkcast     #86                 // class kotlin/coroutines/Continuation
        27: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$1;
            0      28     1 value   Ljava/lang/Object;
            0      28     2 $completion   Lkotlin/coroutines/Continuation;
    Signature: #247                         // (Ljava/lang/Object;Lkotlin/coroutines/Continuation<*>;)Lkotlin/coroutines/Continuation<Lkotlin/Unit;>;

  public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>);
    descriptor: (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: aload_2
         3: invokevirtual #254                // Method create:(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
         6: checkcast     #2                  // class ext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$1
         9: getstatic     #222                // Field kotlin/Unit.INSTANCE:Lkotlin/Unit;
        12: invokevirtual #256                // Method invokeSuspend:(Ljava/lang/Object;)Ljava/lang/Object;
        15: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$1;
            0      16     1    p1   Lkotlinx/coroutines/CoroutineScope;
            0      16     2    p2   Lkotlin/coroutines/Continuation;
    Signature: #252                         // (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Lkotlin/Unit;>;)Ljava/lang/Object;

  public java.lang.Object invoke(java.lang.Object, java.lang.Object);
    descriptor: (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: checkcast     #273                // class kotlinx/coroutines/CoroutineScope
         5: aload_2
         6: checkcast     #86                 // class kotlin/coroutines/Continuation
         9: invokevirtual #275                // Method invoke:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
        12: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$1;
            0      13     1    p1   Ljava/lang/Object;
            0      13     2    p2   Ljava/lang/Object;
}
InnerClasses:
  static final #2;                        // class ext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$1
  public static final #203;               // class ext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$mockProvider$1
  public static final #295= #294 of #88;  // DataSource=class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource of class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
  public static final #296= #94 of #88;   // IndexationResult=class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult of class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
  public static final #297= #156 of #88;  // SourceInfo=class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo of class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
EnclosingMethod: #289.#292              // ext.mods.gameserver.geoengine.pathfinding.MainKt.runGeneration
Signature: #3                           // Lkotlin/coroutines/jvm/internal/SuspendLambda;Lkotlin/jvm/functions/Function2<Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Lkotlin/Unit;>;Ljava/lang/Object;>;
SourceFile: "Main.kt"
SourceDebugExtension:
  SMAP
  Main.kt
  Kotlin
  *S Kotlin
  *F
  + 1 Main.kt
  ext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$1
  + 2 Timing.kt
  kotlin/system/TimingKt
  *L
  1#1,269:1
  29#2,3:270
  *S KotlinDebug
  *F
  + 1 Main.kt
  ext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$1
  *L
  146#1:270,3
  *E
RuntimeVisibleAnnotations:
  0: #35(#36=s#37,#38=[I#39],#40=[I#41],#42=[],#43=[],#44=[],#45=s#33,#46=s#47,#48=I#49)
    kotlin.coroutines.jvm.internal.DebugMetadata(
      f="Main.kt"
      l=[127]
      nl=[135]
      i=[]
      s=[]
      n=[]
      m="invokeSuspend"
      c="ext.mods.gameserver.geoengine.pathfinding.MainKt$runGeneration$1"
      v=2
    )
  1: #276(#277=[I#49,I#278,I#279],#280=I#278,#281=I#282,#283=[s#284],#285=[s#286,s#287,s#258])
    kotlin.Metadata(
      mv=[2,3,0]
      k=3
      xi=48
      d1=["\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"]
      d2=["<anonymous>","","Lkotlinx/coroutines/CoroutineScope;"]
    )
RuntimeInvisibleAnnotations:
  0: #298(#250=[s#299])
    kotlin.jvm.internal.SourceDebugExtension(
      value=["SMAP\nMain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Main.kt\next/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$1\n+ 2 Timing.kt\nkotlin/system/TimingKt\n*L\n1#1,269:1\n29#2,3:270\n*S KotlinDebug\n*F\n+ 1 Main.kt\next/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$1\n*L\n146#1:270,3\n*E\n"]
    )
BootstrapMethods:
  0: #80 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #66 (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      #71 REF_invokeStatic ext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$1.invokeSuspend$lambda$0:(Ljava/lang/String;I)Lkotlin/Unit;
      #73 (Ljava/lang/String;Ljava/lang/Integer;)Lkotlin/Unit;
  1: #126 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #119   Nós totais: \u0001
  2: #126 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #134   Nós caminháveis: \u0001
  3: #126 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #140   Multilayer: \u0001
  4: #126 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #147   Tempo: \u0001ms
  5: #126 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #162   Fonte: \u0001
  6: #80 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #171 (Ljava/lang/Object;)Ljava/lang/Object;
      #176 REF_invokeStatic ext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$1.invokeSuspend$lambda$1$0:(I)Lkotlin/Unit;
      #178 (Ljava/lang/Integer;)Lkotlin/Unit;
  7: #126 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #190   Jump Points calculados para \u0001 nós
  8: #126 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #193   Tempo JPS: \u0001ms
  9: #126 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #198   Em produção: salvar em data/pathfinder/\u0001_\u0001.l2br
  10: #126 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #213   Fonte utilizada: \u0001
  11: #126 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #261   JPS Progress: \u0001%
  12: #126 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #265   [\u0001%] \u0001
