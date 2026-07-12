// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.integration.L2BRAdminCommands$handleGenerate$1
// File: ext\mods\gameserver\geoengine\pathfinding\integration\L2BRAdminCommands$handleGenerate$1.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerate$1.class
  Last modified 9 de jul de 2026; size 16524 bytes
  MD5 checksum c55a27b7b89d14ea5ef56e4097a2db65
  Compiled from "AdminCommands.kt"
final class ext.mods.gameserver.geoengine.pathfinding.integration.L2BRAdminCommands$handleGenerate$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>
  minor version: 0
  major version: 69
  flags: (0x0030) ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerate$1
  super_class: #5                         // kotlin/coroutines/jvm/internal/SuspendLambda
  interfaces: 1, fields: 8, methods: 7, attributes: 8
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerate$1
    #2 = Class              #1            // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerate$1
    #3 = Utf8               Lkotlin/coroutines/jvm/internal/SuspendLambda;Lkotlin/jvm/functions/Function2<Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Lkotlin/Unit;>;Ljava/lang/Object;>;
    #4 = Utf8               kotlin/coroutines/jvm/internal/SuspendLambda
    #5 = Class              #4            // kotlin/coroutines/jvm/internal/SuspendLambda
    #6 = Utf8               kotlin/jvm/functions/Function2
    #7 = Class              #6            // kotlin/jvm/functions/Function2
    #8 = Utf8               <init>
    #9 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;Ljava/lang/Integer;Ljava/lang/Integer;ZLkotlin/Pair;Lkotlin/coroutines/Continuation;)V
   #10 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;Ljava/lang/Integer;Ljava/lang/Integer;ZLkotlin/Pair<Ljava/lang/Integer;Ljava/lang/Integer;>;Lkotlin/coroutines/Continuation<-Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerate$1;>;)V
   #11 = Utf8               this$0
   #12 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;
   #13 = NameAndType        #11:#12       // this$0:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;
   #14 = Fieldref           #2.#13        // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerate$1.this$0:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;
   #15 = Utf8               $admin
   #16 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;
   #17 = NameAndType        #15:#16       // $admin:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;
   #18 = Fieldref           #2.#17        // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerate$1.$admin:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;
   #19 = Utf8               $regionX
   #20 = Utf8               Ljava/lang/Integer;
   #21 = NameAndType        #19:#20       // $regionX:Ljava/lang/Integer;
   #22 = Fieldref           #2.#21        // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerate$1.$regionX:Ljava/lang/Integer;
   #23 = Utf8               $regionY
   #24 = NameAndType        #23:#20       // $regionY:Ljava/lang/Integer;
   #25 = Fieldref           #2.#24        // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerate$1.$regionY:Ljava/lang/Integer;
   #26 = Utf8               $generateJps
   #27 = Utf8               Z
   #28 = NameAndType        #26:#27       // $generateJps:Z
   #29 = Fieldref           #2.#28        // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerate$1.$generateJps:Z
   #30 = Utf8               $key
   #31 = Utf8               Lkotlin/Pair;
   #32 = NameAndType        #30:#31       // $key:Lkotlin/Pair;
   #33 = Fieldref           #2.#32        // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerate$1.$key:Lkotlin/Pair;
   #34 = Utf8               (ILkotlin/coroutines/Continuation;)V
   #35 = NameAndType        #8:#34        // "<init>":(ILkotlin/coroutines/Continuation;)V
   #36 = Methodref          #5.#35        // kotlin/coroutines/jvm/internal/SuspendLambda."<init>":(ILkotlin/coroutines/Continuation;)V
   #37 = Utf8               this
   #38 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerate$1;
   #39 = Utf8               $receiver
   #40 = Utf8               $completion
   #41 = Utf8               Lkotlin/coroutines/Continuation;
   #42 = Utf8               invokeSuspend
   #43 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #44 = Utf8               L$0
   #45 = Utf8               Ljava/lang/Object;
   #46 = Utf8               Lkotlin/coroutines/jvm/internal/DebugMetadata;
   #47 = Utf8               f
   #48 = Utf8               AdminCommands.kt
   #49 = Utf8               l
   #50 = Integer            120
   #51 = Utf8               nl
   #52 = Integer            128
   #53 = Utf8               i
   #54 = Integer            0
   #55 = Utf8               s
   #56 = Utf8               n
   #57 = Utf8               indexer
   #58 = Utf8               m
   #59 = Utf8               c
   #60 = Utf8               ext.mods.gameserver.geoengine.pathfinding.integration.L2BRAdminCommands$handleGenerate$1
   #61 = Utf8               v
   #62 = Integer            2
   #63 = Utf8               java/lang/Exception
   #64 = Class              #63           // java/lang/Exception
   #65 = Utf8               kotlin/coroutines/intrinsics/IntrinsicsKt
   #66 = Class              #65           // kotlin/coroutines/intrinsics/IntrinsicsKt
   #67 = Utf8               getCOROUTINE_SUSPENDED
   #68 = Utf8               ()Ljava/lang/Object;
   #69 = NameAndType        #67:#68       // getCOROUTINE_SUSPENDED:()Ljava/lang/Object;
   #70 = Methodref          #66.#69       // kotlin/coroutines/intrinsics/IntrinsicsKt.getCOROUTINE_SUSPENDED:()Ljava/lang/Object;
   #71 = Utf8               label
   #72 = Utf8               I
   #73 = NameAndType        #71:#72       // label:I
   #74 = Fieldref           #2.#73        // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerate$1.label:I
   #75 = Utf8               kotlin/ResultKt
   #76 = Class              #75           // kotlin/ResultKt
   #77 = Utf8               throwOnFailure
   #78 = Utf8               (Ljava/lang/Object;)V
   #79 = NameAndType        #77:#78       // throwOnFailure:(Ljava/lang/Object;)V
   #80 = Methodref          #76.#79       // kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
   #81 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
   #82 = Class              #81           // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
   #83 = Utf8               ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands
   #84 = Class              #83           // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands
   #85 = Utf8               access$getGeoDataProvider$p
   #86 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;
   #87 = NameAndType        #85:#86       // access$getGeoDataProvider$p:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;
   #88 = Methodref          #84.#87       // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands.access$getGeoDataProvider$p:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;
   #89 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;)V
   #90 = NameAndType        #8:#89        // "<init>":(Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;)V
   #91 = Methodref          #82.#90       // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer."<init>":(Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;)V
   #92 = Utf8               [Fase 1/3] Indexando geometria...
   #93 = String             #92           // [Fase 1/3] Indexando geometria...
   #94 = Utf8               ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface
   #95 = Class              #94           // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface
   #96 = Utf8               sendMessage
   #97 = Utf8               (Ljava/lang/String;)V
   #98 = NameAndType        #96:#97       // sendMessage:(Ljava/lang/String;)V
   #99 = InterfaceMethodref #95.#98       // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface.sendMessage:(Ljava/lang/String;)V
  #100 = Utf8               java/lang/Integer
  #101 = Class              #100          // java/lang/Integer
  #102 = Utf8               intValue
  #103 = Utf8               ()I
  #104 = NameAndType        #102:#103     // intValue:()I
  #105 = Methodref          #101.#104     // java/lang/Integer.intValue:()I
  #106 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #107 = MethodType         #106          //  (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #108 = Utf8               invokeSuspend$lambda$0
  #109 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;Ljava/lang/String;I)Lkotlin/Unit;
  #110 = NameAndType        #108:#109     // invokeSuspend$lambda$0:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;Ljava/lang/String;I)Lkotlin/Unit;
  #111 = Methodref          #2.#110       // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerate$1.invokeSuspend$lambda$0:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;Ljava/lang/String;I)Lkotlin/Unit;
  #112 = MethodHandle       6:#111        // REF_invokeStatic ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerate$1.invokeSuspend$lambda$0:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;Ljava/lang/String;I)Lkotlin/Unit;
  #113 = Utf8               (Ljava/lang/String;Ljava/lang/Integer;)Lkotlin/Unit;
  #114 = MethodType         #113          //  (Ljava/lang/String;Ljava/lang/Integer;)Lkotlin/Unit;
  #115 = Utf8               java/lang/invoke/LambdaMetafactory
  #116 = Class              #115          // java/lang/invoke/LambdaMetafactory
  #117 = Utf8               metafactory
  #118 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #119 = NameAndType        #117:#118     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #120 = Methodref          #116.#119     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #121 = MethodHandle       6:#120        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #122 = Utf8               invoke
  #123 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;)Lkotlin/jvm/functions/Function2;
  #124 = NameAndType        #122:#123     // invoke:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;)Lkotlin/jvm/functions/Function2;
  #125 = InvokeDynamic      #0:#124       // #0:invoke:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;)Lkotlin/jvm/functions/Function2;
  #126 = Utf8               kotlin/coroutines/Continuation
  #127 = Class              #126          // kotlin/coroutines/Continuation
  #128 = NameAndType        #44:#45       // L$0:Ljava/lang/Object;
  #129 = Fieldref           #2.#128       // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerate$1.L$0:Ljava/lang/Object;
  #130 = Utf8               indexRegion$default
  #131 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;IIILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
  #132 = NameAndType        #130:#131     // indexRegion$default:(Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;IIILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
  #133 = Methodref          #82.#132      // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer.indexRegion$default:(Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;IIILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
  #134 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult
  #135 = Class              #134          // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult
  #136 = Utf8               getSourceInfo
  #137 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;
  #138 = NameAndType        #136:#137     // getSourceInfo:()Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;
  #139 = Methodref          #135.#138     // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult.getSourceInfo:()Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;
  #140 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo
  #141 = Class              #140          // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo
  #142 = Utf8               getPrimarySource
  #143 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;
  #144 = NameAndType        #142:#143     // getPrimarySource:()Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;
  #145 = Methodref          #141.#144     // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo.getPrimarySource:()Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;
  #146 = Utf8               ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerate$1$WhenMappings
  #147 = Class              #146          // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerate$1$WhenMappings
  #148 = Utf8               $EnumSwitchMapping$0
  #149 = Utf8               [I
  #150 = NameAndType        #148:#149     // $EnumSwitchMapping$0:[I
  #151 = Fieldref           #147.#150     // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerate$1$WhenMappings.$EnumSwitchMapping$0:[I
  #152 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource
  #153 = Class              #152          // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource
  #154 = Utf8               ordinal
  #155 = NameAndType        #154:#103     // ordinal:()I
  #156 = Methodref          #153.#155     // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource.ordinal:()I
  #157 = Utf8               §aL2J
  #158 = String             #157          // §aL2J
  #159 = Utf8               §aConvDat
  #160 = String             #159          // §aConvDat
  #161 = Utf8               §aMesclado §7(L2J+ConvDat)
  #162 = String             #161          // §aMesclado §7(L2J+ConvDat)
  #163 = Utf8               §cDesconhecido
  #164 = String             #163          // §cDesconhecido
  #165 = Utf8               Fonte utilizada: \u0001
  #166 = String             #165          // Fonte utilizada: \u0001
  #167 = Utf8               java/lang/invoke/StringConcatFactory
  #168 = Class              #167          // java/lang/invoke/StringConcatFactory
  #169 = Utf8               makeConcatWithConstants
  #170 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #171 = NameAndType        #169:#170     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #172 = Methodref          #168.#171     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #173 = MethodHandle       6:#172        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #174 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #175 = NameAndType        #169:#174     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #176 = InvokeDynamic      #1:#175       // #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #177 = Utf8               [Fase 2/3] Calculando Jump Points...
  #178 = String             #177          // [Fase 2/3] Calculando Jump Points...
  #179 = Utf8               getNodes
  #180 = Utf8               ()Ljava/util/List;
  #181 = NameAndType        #179:#180     // getNodes:()Ljava/util/List;
  #182 = Methodref          #135.#181     // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult.getNodes:()Ljava/util/List;
  #183 = MethodType         #43           //  (Ljava/lang/Object;)Ljava/lang/Object;
  #184 = Utf8               invokeSuspend$lambda$1
  #185 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;I)Lkotlin/Unit;
  #186 = NameAndType        #184:#185     // invokeSuspend$lambda$1:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;I)Lkotlin/Unit;
  #187 = Methodref          #2.#186       // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerate$1.invokeSuspend$lambda$1:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;I)Lkotlin/Unit;
  #188 = MethodHandle       6:#187        // REF_invokeStatic ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerate$1.invokeSuspend$lambda$1:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;I)Lkotlin/Unit;
  #189 = Utf8               (Ljava/lang/Integer;)Lkotlin/Unit;
  #190 = MethodType         #189          //  (Ljava/lang/Integer;)Lkotlin/Unit;
  #191 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;)Lkotlin/jvm/functions/Function1;
  #192 = NameAndType        #122:#191     // invoke:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;)Lkotlin/jvm/functions/Function1;
  #193 = InvokeDynamic      #2:#192       // #2:invoke:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;)Lkotlin/jvm/functions/Function1;
  #194 = Utf8               calculateJumpPoints
  #195 = Utf8               (Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;
  #196 = NameAndType        #194:#195     // calculateJumpPoints:(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;
  #197 = Methodref          #82.#196      // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer.calculateJumpPoints:(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;
  #198 = Utf8               java/util/Map
  #199 = Class              #198          // java/util/Map
  #200 = Utf8               size
  #201 = NameAndType        #200:#103     // size:()I
  #202 = InterfaceMethodref #199.#201     // java/util/Map.size:()I
  #203 = Utf8                 Jump Points calculados: §a\u0001
  #204 = String             #203          //   Jump Points calculados: §a\u0001
  #205 = Utf8               (I)Ljava/lang/String;
  #206 = NameAndType        #169:#205     // makeConcatWithConstants:(I)Ljava/lang/String;
  #207 = InvokeDynamic      #3:#206       // #3:makeConcatWithConstants:(I)Ljava/lang/String;
  #208 = Utf8               [Fase 3/3] Serializando para .l2br...
  #209 = String             #208          // [Fase 3/3] Serializando para .l2br...
  #210 = Utf8               access$getOutputPath$p
  #211 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;)Ljava/nio/file/Path;
  #212 = NameAndType        #210:#211     // access$getOutputPath$p:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;)Ljava/nio/file/Path;
  #213 = Methodref          #84.#212      // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands.access$getOutputPath$p:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;)Ljava/nio/file/Path;
  #214 = Utf8               java/nio/file/Path
  #215 = Class              #214          // java/nio/file/Path
  #216 = Utf8               toFile
  #217 = Utf8               ()Ljava/io/File;
  #218 = NameAndType        #216:#217     // toFile:()Ljava/io/File;
  #219 = InterfaceMethodref #215.#218     // java/nio/file/Path.toFile:()Ljava/io/File;
  #220 = Utf8               java/io/File
  #221 = Class              #220          // java/io/File
  #222 = Utf8               mkdirs
  #223 = Utf8               ()Z
  #224 = NameAndType        #222:#223     // mkdirs:()Z
  #225 = Methodref          #221.#224     // java/io/File.mkdirs:()Z
  #226 = Utf8               \u0001_\u0001.l2br
  #227 = String             #226          // \u0001_\u0001.l2br
  #228 = Utf8               (Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/String;
  #229 = NameAndType        #169:#228     // makeConcatWithConstants:(Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/String;
  #230 = InvokeDynamic      #4:#229       // #4:makeConcatWithConstants:(Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/String;
  #231 = Utf8               resolve
  #232 = Utf8               (Ljava/lang/String;)Ljava/nio/file/Path;
  #233 = NameAndType        #231:#232     // resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
  #234 = InterfaceMethodref #215.#233     // java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
  #235 = Utf8               java/lang/Iterable
  #236 = Class              #235          // java/lang/Iterable
  #237 = Utf8               java/util/ArrayList
  #238 = Class              #237          // java/util/ArrayList
  #239 = Utf8               kotlin/collections/CollectionsKt
  #240 = Class              #239          // kotlin/collections/CollectionsKt
  #241 = Utf8               collectionSizeOrDefault
  #242 = Utf8               (Ljava/lang/Iterable;I)I
  #243 = NameAndType        #241:#242     // collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
  #244 = Methodref          #240.#243     // kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
  #245 = Utf8               (I)V
  #246 = NameAndType        #8:#245       // "<init>":(I)V
  #247 = Methodref          #238.#246     // java/util/ArrayList."<init>":(I)V
  #248 = Utf8               java/util/Collection
  #249 = Class              #248          // java/util/Collection
  #250 = Utf8               iterator
  #251 = Utf8               ()Ljava/util/Iterator;
  #252 = NameAndType        #250:#251     // iterator:()Ljava/util/Iterator;
  #253 = InterfaceMethodref #236.#252     // java/lang/Iterable.iterator:()Ljava/util/Iterator;
  #254 = Utf8               java/util/Iterator
  #255 = Class              #254          // java/util/Iterator
  #256 = Utf8               hasNext
  #257 = NameAndType        #256:#223     // hasNext:()Z
  #258 = InterfaceMethodref #255.#257     // java/util/Iterator.hasNext:()Z
  #259 = Utf8               next
  #260 = NameAndType        #259:#68      // next:()Ljava/lang/Object;
  #261 = InterfaceMethodref #255.#260     // java/util/Iterator.next:()Ljava/lang/Object;
  #262 = Utf8               throwIndexOverflow
  #263 = Utf8               ()V
  #264 = NameAndType        #262:#263     // throwIndexOverflow:()V
  #265 = Methodref          #240.#264     // kotlin/collections/CollectionsKt.throwIndexOverflow:()V
  #266 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode
  #267 = Class              #266          // ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode
  #268 = Utf8               kotlin/coroutines/jvm/internal/Boxing
  #269 = Class              #268          // kotlin/coroutines/jvm/internal/Boxing
  #270 = Utf8               boxInt
  #271 = Utf8               (I)Ljava/lang/Integer;
  #272 = NameAndType        #270:#271     // boxInt:(I)Ljava/lang/Integer;
  #273 = Methodref          #269.#272     // kotlin/coroutines/jvm/internal/Boxing.boxInt:(I)Ljava/lang/Integer;
  #274 = Utf8               access$toSerializationNode
  #275 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;)Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;
  #276 = NameAndType        #274:#275     // access$toSerializationNode:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;)Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;
  #277 = Methodref          #84.#276      // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands.access$toSerializationNode:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;)Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;
  #278 = Utf8               kotlin/TuplesKt
  #279 = Class              #278          // kotlin/TuplesKt
  #280 = Utf8               to
  #281 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
  #282 = NameAndType        #280:#281     // to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
  #283 = Methodref          #279.#282     // kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
  #284 = Utf8               add
  #285 = Utf8               (Ljava/lang/Object;)Z
  #286 = NameAndType        #284:#285     // add:(Ljava/lang/Object;)Z
  #287 = InterfaceMethodref #249.#286     // java/util/Collection.add:(Ljava/lang/Object;)Z
  #288 = Utf8               java/util/List
  #289 = Class              #288          // java/util/List
  #290 = Utf8               kotlin/collections/MapsKt
  #291 = Class              #290          // kotlin/collections/MapsKt
  #292 = Utf8               toMap
  #293 = Utf8               (Ljava/lang/Iterable;)Ljava/util/Map;
  #294 = NameAndType        #292:#293     // toMap:(Ljava/lang/Iterable;)Ljava/util/Map;
  #295 = Methodref          #291.#294     // kotlin/collections/MapsKt.toMap:(Ljava/lang/Iterable;)Ljava/util/Map;
  #296 = Utf8               getWalkableCount
  #297 = NameAndType        #296:#103     // getWalkableCount:()I
  #298 = Methodref          #135.#297     // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult.getWalkableCount:()I
  #299 = Utf8               access$buildSpatialGrid
  #300 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;Ljava/util/List;)Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;
  #301 = NameAndType        #299:#300     // access$buildSpatialGrid:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;Ljava/util/List;)Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;
  #302 = Methodref          #84.#301      // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands.access$buildSpatialGrid:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;Ljava/util/List;)Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;
  #303 = Utf8               access$calculateConnectivity
  #304 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;Ljava/util/List;)Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;
  #305 = NameAndType        #303:#304     // access$calculateConnectivity:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;Ljava/util/List;)Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;
  #306 = Methodref          #84.#305      // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands.access$calculateConnectivity:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;Ljava/util/List;)Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;
  #307 = Utf8               ext/mods/gameserver/geoengine/pathfinding/serialization/SourceType
  #308 = Class              #307          // ext/mods/gameserver/geoengine/pathfinding/serialization/SourceType
  #309 = Utf8               L2J
  #310 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;
  #311 = NameAndType        #309:#310     // L2J:Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;
  #312 = Fieldref           #308.#311     // ext/mods/gameserver/geoengine/pathfinding/serialization/SourceType.L2J:Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;
  #313 = Utf8               CONV_DAT
  #314 = NameAndType        #313:#310     // CONV_DAT:Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;
  #315 = Fieldref           #308.#314     // ext/mods/gameserver/geoengine/pathfinding/serialization/SourceType.CONV_DAT:Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;
  #316 = Utf8               MIXED
  #317 = NameAndType        #316:#310     // MIXED:Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;
  #318 = Fieldref           #308.#317     // ext/mods/gameserver/geoengine/pathfinding/serialization/SourceType.MIXED:Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;
  #319 = Utf8               getDurationMs
  #320 = Utf8               ()J
  #321 = NameAndType        #319:#320     // getDurationMs:()J
  #322 = Methodref          #135.#321     // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult.getDurationMs:()J
  #323 = Utf8               ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion
  #324 = Class              #323          // ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion
  #325 = Utf8               (IILjava/util/Map;ILext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;J)V
  #326 = NameAndType        #8:#325       // "<init>":(IILjava/util/Map;ILext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;J)V
  #327 = Methodref          #324.#326     // ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion."<init>":(IILjava/util/Map;ILext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;J)V
  #328 = Utf8               access$getSerializer$p
  #329 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;)Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer;
  #330 = NameAndType        #328:#329     // access$getSerializer$p:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;)Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer;
  #331 = Methodref          #84.#330      // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands.access$getSerializer$p:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;)Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer;
  #332 = Utf8               ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer
  #333 = Class              #332          // ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer
  #334 = Utf8               serialize
  #335 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion;Ljava/nio/file/Path;)V
  #336 = NameAndType        #334:#335     // serialize:(Lext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion;Ljava/nio/file/Path;)V
  #337 = Methodref          #333.#336     // ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer.serialize:(Lext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion;Ljava/nio/file/Path;)V
  #338 = Utf8
  #339 = String             #338          //
  #340 = Utf8               === GERAÇÃO CONCLUÍDA ===
  #341 = String             #340          // === GERAÇÃO CONCLUÍDA ===
  #342 = Utf8               Região: §a[\u0001, \u0001]
  #343 = String             #342          // Região: §a[\u0001, \u0001]
  #344 = InvokeDynamic      #5:#229       // #5:makeConcatWithConstants:(Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/String;
  #345 = InterfaceMethodref #289.#201     // java/util/List.size:()I
  #346 = Utf8               Total de nós: \u0001
  #347 = String             #346          // Total de nós: \u0001
  #348 = InvokeDynamic      #6:#206       // #6:makeConcatWithConstants:(I)Ljava/lang/String;
  #349 = Utf8               kotlin/math/MathKt
  #350 = Class              #349          // kotlin/math/MathKt
  #351 = Utf8               roundToInt
  #352 = Utf8               (D)I
  #353 = NameAndType        #351:#352     // roundToInt:(D)I
  #354 = Methodref          #350.#353     // kotlin/math/MathKt.roundToInt:(D)I
  #355 = Utf8               Nós walkable: \u0001 §7(\u0001%)
  #356 = String             #355          // Nós walkable: \u0001 §7(\u0001%)
  #357 = Utf8               (II)Ljava/lang/String;
  #358 = NameAndType        #169:#357     // makeConcatWithConstants:(II)Ljava/lang/String;
  #359 = InvokeDynamic      #7:#358       // #7:makeConcatWithConstants:(II)Ljava/lang/String;
  #360 = Utf8               getMultilayerCount
  #361 = NameAndType        #360:#103     // getMultilayerCount:()I
  #362 = Methodref          #135.#361     // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult.getMultilayerCount:()I
  #363 = Utf8               Multi-layer: \u0001
  #364 = String             #363          // Multi-layer: \u0001
  #365 = InvokeDynamic      #8:#206       // #8:makeConcatWithConstants:(I)Ljava/lang/String;
  #366 = Utf8               Tempo total: \u0001ms
  #367 = String             #366          // Tempo total: \u0001ms
  #368 = Utf8               (J)Ljava/lang/String;
  #369 = NameAndType        #169:#368     // makeConcatWithConstants:(J)Ljava/lang/String;
  #370 = InvokeDynamic      #9:#369       // #9:makeConcatWithConstants:(J)Ljava/lang/String;
  #371 = Utf8               getFileName
  #372 = Utf8               ()Ljava/nio/file/Path;
  #373 = NameAndType        #371:#372     // getFileName:()Ljava/nio/file/Path;
  #374 = InterfaceMethodref #215.#373     // java/nio/file/Path.getFileName:()Ljava/nio/file/Path;
  #375 = Utf8               length
  #376 = NameAndType        #375:#320     // length:()J
  #377 = Methodref          #221.#376     // java/io/File.length:()J
  #378 = Utf8               Arquivo: \u0001 (\u0001 KB)
  #379 = String             #378          // Arquivo: \u0001 (\u0001 KB)
  #380 = Utf8               (Ljava/nio/file/Path;J)Ljava/lang/String;
  #381 = NameAndType        #169:#380     // makeConcatWithConstants:(Ljava/nio/file/Path;J)Ljava/lang/String;
  #382 = InvokeDynamic      #10:#381      // #10:makeConcatWithConstants:(Ljava/nio/file/Path;J)Ljava/lang/String;
  #383 = Utf8               JPS: Ativado (\u0001 jump points)
  #384 = String             #383          // JPS: Ativado (\u0001 jump points)
  #385 = InvokeDynamic      #11:#206      // #11:makeConcatWithConstants:(I)Ljava/lang/String;
  #386 = Utf8               access$getBridge$p
  #387 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;)Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;
  #388 = NameAndType        #386:#387     // access$getBridge$p:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;)Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;
  #389 = Methodref          #84.#388      // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands.access$getBridge$p:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;)Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;
  #390 = Utf8               ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge
  #391 = Class              #390          // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge
  #392 = Utf8               reloadRegion
  #393 = Utf8               (II)V
  #394 = NameAndType        #392:#393     // reloadRegion:(II)V
  #395 = Methodref          #391.#394     // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge.reloadRegion:(II)V
  #396 = Utf8               Região carregada no pathfinder automaticamente!
  #397 = String             #396          // Região carregada no pathfinder automaticamente!
  #398 = Utf8               Use //l2br_reload \u0001 \u0001 para carregar.
  #399 = String             #398          // Use //l2br_reload \u0001 \u0001 para carregar.
  #400 = InvokeDynamic      #12:#229      // #12:makeConcatWithConstants:(Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/String;
  #401 = Utf8               access$getActiveGenerations$p
  #402 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;)Ljava/util/concurrent/ConcurrentHashMap;
  #403 = NameAndType        #401:#402     // access$getActiveGenerations$p:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;)Ljava/util/concurrent/ConcurrentHashMap;
  #404 = Methodref          #84.#403      // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands.access$getActiveGenerations$p:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;)Ljava/util/concurrent/ConcurrentHashMap;
  #405 = Utf8               java/util/concurrent/ConcurrentHashMap
  #406 = Class              #405          // java/util/concurrent/ConcurrentHashMap
  #407 = Utf8               remove
  #408 = NameAndType        #407:#43      // remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #409 = Methodref          #406.#408     // java/util/concurrent/ConcurrentHashMap.remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #410 = Utf8               getMessage
  #411 = Utf8               ()Ljava/lang/String;
  #412 = NameAndType        #410:#411     // getMessage:()Ljava/lang/String;
  #413 = Methodref          #64.#412      // java/lang/Exception.getMessage:()Ljava/lang/String;
  #414 = Utf8               [ERRO] \u0001
  #415 = String             #414          // [ERRO] \u0001
  #416 = InvokeDynamic      #13:#175      // #13:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #417 = Utf8               printStackTrace
  #418 = NameAndType        #417:#263     // printStackTrace:()V
  #419 = Methodref          #64.#418      // java/lang/Exception.printStackTrace:()V
  #420 = Utf8               kotlin/Unit
  #421 = Class              #420          // kotlin/Unit
  #422 = Utf8               INSTANCE
  #423 = Utf8               Lkotlin/Unit;
  #424 = NameAndType        #422:#423     // INSTANCE:Lkotlin/Unit;
  #425 = Fieldref           #421.#424     // kotlin/Unit.INSTANCE:Lkotlin/Unit;
  #426 = Utf8               java/lang/IllegalStateException
  #427 = Class              #426          // java/lang/IllegalStateException
  #428 = Utf8               call to \'resume\' before \'invoke\' with coroutine
  #429 = String             #428          // call to \'resume\' before \'invoke\' with coroutine
  #430 = NameAndType        #8:#97        // "<init>":(Ljava/lang/String;)V
  #431 = Methodref          #427.#430     // java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
  #432 = Utf8               jps
  #433 = Utf8               Ljava/util/Map;
  #434 = Utf8               $i$a$-mapIndexed-L2BRAdminCommands$handleGenerate$1$region$1
  #435 = Utf8               idx
  #436 = Utf8               node
  #437 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;
  #438 = Utf8               item$iv$iv
  #439 = Utf8               $i$f$mapIndexedTo
  #440 = Utf8               index$iv$iv
  #441 = Utf8               $this$mapIndexedTo$iv$iv
  #442 = Utf8               Ljava/lang/Iterable;
  #443 = Utf8               destination$iv$iv
  #444 = Utf8               Ljava/util/Collection;
  #445 = Utf8               $i$f$mapIndexed
  #446 = Utf8               $this$mapIndexed$iv
  #447 = Utf8               e
  #448 = Utf8               Ljava/lang/Exception;
  #449 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;
  #450 = Utf8               result
  #451 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult;
  #452 = Utf8               sourceMsg
  #453 = Utf8               Ljava/lang/String;
  #454 = Utf8               jumpPoints
  #455 = Utf8               outputFile
  #456 = Utf8               Ljava/nio/file/Path;
  #457 = Utf8               region
  #458 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion;
  #459 = Utf8               $result
  #460 = Utf8               java/lang/Object
  #461 = Class              #460          // java/lang/Object
  #462 = Utf8               java/lang/String
  #463 = Class              #462          // java/lang/String
  #464 = Utf8               ext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid
  #465 = Class              #464          // ext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid
  #466 = Utf8               ext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity
  #467 = Class              #466          // ext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity
  #468 = Utf8               java/lang/Throwable
  #469 = Class              #468          // java/lang/Throwable
  #470 = Utf8               create
  #471 = Utf8               (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
  #472 = Utf8               (Ljava/lang/Object;Lkotlin/coroutines/Continuation<*>;)Lkotlin/coroutines/Continuation<Lkotlin/Unit;>;
  #473 = NameAndType        #8:#9         // "<init>":(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;Ljava/lang/Integer;Ljava/lang/Integer;ZLkotlin/Pair;Lkotlin/coroutines/Continuation;)V
  #474 = Methodref          #2.#473       // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerate$1."<init>":(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;Ljava/lang/Integer;Ljava/lang/Integer;ZLkotlin/Pair;Lkotlin/coroutines/Continuation;)V
  #475 = Utf8               value
  #476 = Utf8               (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #477 = Utf8               (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Lkotlin/Unit;>;)Ljava/lang/Object;
  #478 = NameAndType        #470:#471     // create:(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
  #479 = Methodref          #2.#478       // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerate$1.create:(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
  #480 = NameAndType        #42:#43       // invokeSuspend:(Ljava/lang/Object;)Ljava/lang/Object;
  #481 = Methodref          #2.#480       // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerate$1.invokeSuspend:(Ljava/lang/Object;)Ljava/lang/Object;
  #482 = Utf8               p1
  #483 = Utf8               Lkotlinx/coroutines/CoroutineScope;
  #484 = Utf8               p2
  #485 = Utf8                 §8[\u0001%] \u0001
  #486 = String             #485          //   §8[\u0001%] \u0001
  #487 = Utf8               (ILjava/lang/String;)Ljava/lang/String;
  #488 = NameAndType        #169:#487     // makeConcatWithConstants:(ILjava/lang/String;)Ljava/lang/String;
  #489 = InvokeDynamic      #14:#488      // #14:makeConcatWithConstants:(ILjava/lang/String;)Ljava/lang/String;
  #490 = Utf8               phase
  #491 = Utf8               percent
  #492 = Utf8                 §8[JPS \u0001%]
  #493 = String             #492          //   §8[JPS \u0001%]
  #494 = InvokeDynamic      #15:#206      // #15:makeConcatWithConstants:(I)Ljava/lang/String;
  #495 = Utf8               kotlinx/coroutines/CoroutineScope
  #496 = Class              #495          // kotlinx/coroutines/CoroutineScope
  #497 = NameAndType        #122:#476     // invoke:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #498 = Methodref          #2.#497       // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerate$1.invoke:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #499 = Utf8               Lkotlin/Pair<Ljava/lang/Integer;Ljava/lang/Integer;>;
  #500 = Utf8               Lkotlin/Metadata;
  #501 = Utf8               mv
  #502 = Integer            3
  #503 = Utf8               k
  #504 = Utf8               xi
  #505 = Integer            48
  #506 = Utf8               d1
  #507 = Utf8               \u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n
  #508 = Utf8               d2
  #509 = Utf8               <anonymous>
  #510 = Utf8               handleGenerate
  #511 = Utf8               (Ljava/util/StringTokenizer;Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;)Z
  #512 = NameAndType        #510:#511     // handleGenerate:(Ljava/util/StringTokenizer;Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;)Z
  #513 = Utf8               DataSource
  #514 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider
  #515 = Class              #514          // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider
  #516 = Utf8               GeoDataProvider
  #517 = Utf8               IndexationResult
  #518 = Utf8               SourceInfo
  #519 = Utf8               AdminInterface
  #520 = Utf8               WhenMappings
  #521 = Utf8               Lkotlin/jvm/internal/SourceDebugExtension;
  #522 = Utf8               SMAP\nAdminCommands.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdminCommands.kt\next/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerate$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,576:1\n1596#2:577\n1629#2,4:578\n*S KotlinDebug\n*F\n+ 1 AdminCommands.kt\next/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerate$1\n*L\n153#1:577\n153#1:578,4\n*E\n
  #523 = Utf8               Signature
  #524 = Utf8               Code
  #525 = Utf8               LocalVariableTable
  #526 = Utf8               StackMapTable
  #527 = Utf8               LineNumberTable
  #528 = Utf8               InnerClasses
  #529 = Utf8               EnclosingMethod
  #530 = Utf8               SourceFile
  #531 = Utf8               SourceDebugExtension
  #532 = Utf8               RuntimeVisibleAnnotations
  #533 = Utf8               RuntimeInvisibleAnnotations
  #534 = Utf8               BootstrapMethods
{
  java.lang.Object L$0;
    descriptor: Ljava/lang/Object;
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

  final java.lang.Integer $regionX;
    descriptor: Ljava/lang/Integer;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  final java.lang.Integer $regionY;
    descriptor: Ljava/lang/Integer;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  final boolean $generateJps;
    descriptor: Z
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  final kotlin.Pair<java.lang.Integer, java.lang.Integer> $key;
    descriptor: Lkotlin/Pair;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC
    Signature: #499                         // Lkotlin/Pair<Ljava/lang/Integer;Ljava/lang/Integer;>;

  ext.mods.gameserver.geoengine.pathfinding.integration.L2BRAdminCommands$handleGenerate$1(ext.mods.gameserver.geoengine.pathfinding.integration.L2BRAdminCommands, ext.mods.gameserver.geoengine.pathfinding.integration.L2BRAdminCommands$AdminInterface, java.lang.Integer, java.lang.Integer, boolean, kotlin.Pair<java.lang.Integer, java.lang.Integer>, kotlin.coroutines.Continuation<? super ext.mods.gameserver.geoengine.pathfinding.integration.L2BRAdminCommands$handleGenerate$1>);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;Ljava/lang/Integer;Ljava/lang/Integer;ZLkotlin/Pair;Lkotlin/coroutines/Continuation;)V
    flags: (0x0000)
    Code:
      stack=3, locals=8, args_size=8
         0: aload_0
         1: aload_1
         2: putfield      #14                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;
         5: aload_0
         6: aload_2
         7: putfield      #18                 // Field $admin:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;
        10: aload_0
        11: aload_3
        12: putfield      #22                 // Field $regionX:Ljava/lang/Integer;
        15: aload_0
        16: aload         4
        18: putfield      #25                 // Field $regionY:Ljava/lang/Integer;
        21: aload_0
        22: iload         5
        24: putfield      #29                 // Field $generateJps:Z
        27: aload_0
        28: aload         6
        30: putfield      #33                 // Field $key:Lkotlin/Pair;
        33: aload_0
        34: iconst_2
        35: aload         7
        37: invokespecial #36                 // Method kotlin/coroutines/jvm/internal/SuspendLambda."<init>":(ILkotlin/coroutines/Continuation;)V
        40: return
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      41     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerate$1;
            0      41     1 $receiver   Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;
            0      41     2 $admin   Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;
            0      41     3 $regionX   Ljava/lang/Integer;
            0      41     4 $regionY   Ljava/lang/Integer;
            0      41     5 $generateJps   Z
            0      41     6  $key   Lkotlin/Pair;
            0      41     7 $completion   Lkotlin/coroutines/Continuation;
    Signature: #10                          // (Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;Ljava/lang/Integer;Ljava/lang/Integer;ZLkotlin/Pair<Ljava/lang/Integer;Ljava/lang/Integer;>;Lkotlin/coroutines/Continuation<-Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerate$1;>;)V

  public final java.lang.Object invokeSuspend(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Ljava/lang/Object;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=11, locals=34, args_size=2
         0: invokestatic  #70                 // Method kotlin/coroutines/intrinsics/IntrinsicsKt.getCOROUTINE_SUSPENDED:()Ljava/lang/Object;
         3: astore        33
         5: aload_0
         6: getfield      #74                 // Field label:I
         9: tableswitch   { // 0 to 1

                       0: 32

                       1: 116
                 default: 1006
            }
        32: aload_1
        33: invokestatic  #80                 // Method kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
        36: nop
        37: new           #82                 // class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
        40: dup
        41: aload_0
        42: getfield      #14                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;
        45: invokestatic  #88                 // Method ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands.access$getGeoDataProvider$p:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;
        48: invokespecial #91                 // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer."<init>":(Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;)V
        51: astore_2
        52: aload_0
        53: getfield      #18                 // Field $admin:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;
        56: ldc           #93                 // String [Fase 1/3] Indexando geometria...
        58: invokeinterface #99,  2           // InterfaceMethod ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface.sendMessage:(Ljava/lang/String;)V
        63: aload_2
        64: aload_0
        65: getfield      #22                 // Field $regionX:Ljava/lang/Integer;
        68: invokevirtual #105                // Method java/lang/Integer.intValue:()I
        71: aload_0
        72: getfield      #25                 // Field $regionY:Ljava/lang/Integer;
        75: invokevirtual #105                // Method java/lang/Integer.intValue:()I
        78: iconst_0
        79: aload_0
        80: getfield      #18                 // Field $admin:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;
        83: invokedynamic #125,  0            // InvokeDynamic #0:invoke:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;)Lkotlin/jvm/functions/Function2;
        88: aload_0
        89: checkcast     #127                // class kotlin/coroutines/Continuation
        92: iconst_4
        93: aconst_null
        94: aload_0
        95: aload_2
        96: putfield      #129                // Field L$0:Ljava/lang/Object;
        99: aload_0
       100: iconst_1
       101: putfield      #74                 // Field label:I
       104: invokestatic  #133                // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer.indexRegion$default:(Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;IIILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
       107: dup
       108: aload         33
       110: if_acmpne     130
       113: aload         33
       115: areturn
       116: aload_0
       117: getfield      #129                // Field L$0:Ljava/lang/Object;
       120: checkcast     #82                 // class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
       123: astore_2
       124: nop
       125: aload_1
       126: invokestatic  #80                 // Method kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
       129: aload_1
       130: checkcast     #135                // class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult
       133: astore_3
       134: aload_3
       135: invokevirtual #139                // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult.getSourceInfo:()Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;
       138: invokevirtual #145                // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo.getPrimarySource:()Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;
       141: getstatic     #151                // Field ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerate$1$WhenMappings.$EnumSwitchMapping$0:[I
       144: swap
       145: invokevirtual #156                // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource.ordinal:()I
       148: iaload
       149: tableswitch   { // 1 to 3

                       1: 176

                       2: 181

                       3: 186
                 default: 191
            }
       176: ldc           #158                // String §aL2J
       178: goto          193
       181: ldc           #160                // String §aConvDat
       183: goto          193
       186: ldc           #162                // String §aMesclado §7(L2J+ConvDat)
       188: goto          193
       191: ldc           #164                // String §cDesconhecido
       193: astore        4
       195: aload_0
       196: getfield      #18                 // Field $admin:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;
       199: aload         4
       201: invokedynamic #176,  0            // InvokeDynamic #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       206: invokeinterface #99,  2           // InterfaceMethod ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface.sendMessage:(Ljava/lang/String;)V
       211: aload_0
       212: getfield      #29                 // Field $generateJps:Z
       215: ifeq          274
       218: aload_0
       219: getfield      #18                 // Field $admin:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;
       222: ldc           #178                // String [Fase 2/3] Calculando Jump Points...
       224: invokeinterface #99,  2           // InterfaceMethod ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface.sendMessage:(Ljava/lang/String;)V
       229: aload_2
       230: aload_3
       231: invokevirtual #182                // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult.getNodes:()Ljava/util/List;
       234: aload_0
       235: getfield      #18                 // Field $admin:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;
       238: invokedynamic #193,  0            // InvokeDynamic #2:invoke:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;)Lkotlin/jvm/functions/Function1;
       243: invokevirtual #197                // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer.calculateJumpPoints:(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;
       246: astore        6
       248: aload_0
       249: getfield      #18                 // Field $admin:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;
       252: aload         6
       254: invokeinterface #202,  1          // InterfaceMethod java/util/Map.size:()I
       259: invokedynamic #207,  0            // InvokeDynamic #3:makeConcatWithConstants:(I)Ljava/lang/String;
       264: invokeinterface #99,  2           // InterfaceMethod ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface.sendMessage:(Ljava/lang/String;)V
       269: aload         6
       271: goto          275
       274: aconst_null
       275: astore        5
       277: aload_0
       278: getfield      #18                 // Field $admin:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;
       281: ldc           #209                // String [Fase 3/3] Serializando para .l2br...
       283: invokeinterface #99,  2           // InterfaceMethod ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface.sendMessage:(Ljava/lang/String;)V
       288: aload_0
       289: getfield      #14                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;
       292: invokestatic  #213                // Method ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands.access$getOutputPath$p:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;)Ljava/nio/file/Path;
       295: invokeinterface #219,  1          // InterfaceMethod java/nio/file/Path.toFile:()Ljava/io/File;
       300: invokevirtual #225                // Method java/io/File.mkdirs:()Z
       303: pop
       304: aload_0
       305: getfield      #14                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;
       308: invokestatic  #213                // Method ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands.access$getOutputPath$p:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;)Ljava/nio/file/Path;
       311: aload_0
       312: getfield      #22                 // Field $regionX:Ljava/lang/Integer;
       315: aload_0
       316: getfield      #25                 // Field $regionY:Ljava/lang/Integer;
       319: invokedynamic #230,  0            // InvokeDynamic #4:makeConcatWithConstants:(Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/String;
       324: invokeinterface #234,  2          // InterfaceMethod java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
       329: astore        6
       331: aload_0
       332: getfield      #22                 // Field $regionX:Ljava/lang/Integer;
       335: invokevirtual #105                // Method java/lang/Integer.intValue:()I
       338: aload_0
       339: getfield      #25                 // Field $regionY:Ljava/lang/Integer;
       342: invokevirtual #105                // Method java/lang/Integer.intValue:()I
       345: aload_3
       346: invokevirtual #182                // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult.getNodes:()Ljava/util/List;
       349: checkcast     #236                // class java/lang/Iterable
       352: astore        8
       354: aload_0
       355: getfield      #14                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;
       358: astore        9
       360: istore        22
       362: istore        21
       364: iconst_0
       365: istore        10
       367: aload         8
       369: astore        11
       371: new           #238                // class java/util/ArrayList
       374: dup
       375: aload         8
       377: bipush        10
       379: invokestatic  #244                // Method kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
       382: invokespecial #247                // Method java/util/ArrayList."<init>":(I)V
       385: checkcast     #249                // class java/util/Collection
       388: astore        12
       390: iconst_0
       391: istore        13
       393: iconst_0
       394: istore        14
       396: aload         11
       398: invokeinterface #253,  1          // InterfaceMethod java/lang/Iterable.iterator:()Ljava/util/Iterator;
       403: astore        15
       405: aload         15
       407: invokeinterface #258,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       412: ifeq          484
       415: aload         15
       417: invokeinterface #261,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       422: astore        16
       424: aload         12
       426: iload         14
       428: iinc          14, 1
       431: istore        17
       433: iload         17
       435: ifge          441
       438: invokestatic  #265                // Method kotlin/collections/CollectionsKt.throwIndexOverflow:()V
       441: iload         17
       443: aload         16
       445: checkcast     #267                // class ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode
       448: astore        18
       450: istore        19
       452: astore        23
       454: iconst_0
       455: istore        20
       457: iload         19
       459: invokestatic  #273                // Method kotlin/coroutines/jvm/internal/Boxing.boxInt:(I)Ljava/lang/Integer;
       462: aload         9
       464: aload         18
       466: invokestatic  #277                // Method ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands.access$toSerializationNode:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;)Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;
       469: invokestatic  #283                // Method kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
       472: aload         23
       474: swap
       475: invokeinterface #287,  2          // InterfaceMethod java/util/Collection.add:(Ljava/lang/Object;)Z
       480: pop
       481: goto          405
       484: aload         12
       486: checkcast     #289                // class java/util/List
       489: nop
       490: astore        23
       492: iload         21
       494: iload         22
       496: aload         23
       498: checkcast     #236                // class java/lang/Iterable
       501: invokestatic  #295                // Method kotlin/collections/MapsKt.toMap:(Ljava/lang/Iterable;)Ljava/util/Map;
       504: aload_3
       505: invokevirtual #298                // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult.getWalkableCount:()I
       508: aload_0
       509: getfield      #14                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;
       512: aload_3
       513: invokevirtual #182                // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult.getNodes:()Ljava/util/List;
       516: invokestatic  #302                // Method ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands.access$buildSpatialGrid:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;Ljava/util/List;)Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;
       519: aload_0
       520: getfield      #14                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;
       523: aload_3
       524: invokevirtual #182                // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult.getNodes:()Ljava/util/List;
       527: invokestatic  #306                // Method ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands.access$calculateConnectivity:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;Ljava/util/List;)Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;
       530: aload_3
       531: invokevirtual #139                // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult.getSourceInfo:()Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;
       534: invokevirtual #145                // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo.getPrimarySource:()Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;
       537: getstatic     #151                // Field ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerate$1$WhenMappings.$EnumSwitchMapping$0:[I
       540: swap
       541: invokevirtual #156                // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource.ordinal:()I
       544: iaload
       545: tableswitch   { // 1 to 2

                       1: 568

                       2: 574
                 default: 580
            }
       568: getstatic     #312                // Field ext/mods/gameserver/geoengine/pathfinding/serialization/SourceType.L2J:Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;
       571: goto          583
       574: getstatic     #315                // Field ext/mods/gameserver/geoengine/pathfinding/serialization/SourceType.CONV_DAT:Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;
       577: goto          583
       580: getstatic     #318                // Field ext/mods/gameserver/geoengine/pathfinding/serialization/SourceType.MIXED:Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;
       583: aload_3
       584: invokevirtual #322                // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult.getDurationMs:()J
       587: lstore        24
       589: astore        26
       591: astore        27
       593: astore        28
       595: istore        29
       597: astore        30
       599: istore        31
       601: istore        32
       603: new           #324                // class ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion
       606: dup
       607: iload         32
       609: iload         31
       611: aload         30
       613: iload         29
       615: aload         28
       617: aload         27
       619: aload         26
       621: lload         24
       623: invokespecial #327                // Method ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion."<init>":(IILjava/util/Map;ILext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;Lext/mods/gameserver/geoengine/pathfinding/serialization/SourceType;J)V
       626: astore        7
       628: aload_0
       629: getfield      #14                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;
       632: invokestatic  #331                // Method ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands.access$getSerializer$p:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;)Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer;
       635: aload         7
       637: aload         6
       639: invokevirtual #337                // Method ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer.serialize:(Lext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion;Ljava/nio/file/Path;)V
       642: aload_0
       643: getfield      #18                 // Field $admin:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;
       646: ldc_w         #339                // String
       649: invokeinterface #99,  2           // InterfaceMethod ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface.sendMessage:(Ljava/lang/String;)V
       654: aload_0
       655: getfield      #18                 // Field $admin:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;
       658: ldc_w         #341                // String === GERAÇÃO CONCLUÍDA ===
       661: invokeinterface #99,  2           // InterfaceMethod ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface.sendMessage:(Ljava/lang/String;)V
       666: aload_0
       667: getfield      #18                 // Field $admin:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;
       670: aload_0
       671: getfield      #22                 // Field $regionX:Ljava/lang/Integer;
       674: aload_0
       675: getfield      #25                 // Field $regionY:Ljava/lang/Integer;
       678: invokedynamic #344,  0            // InvokeDynamic #5:makeConcatWithConstants:(Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/String;
       683: invokeinterface #99,  2           // InterfaceMethod ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface.sendMessage:(Ljava/lang/String;)V
       688: aload_0
       689: getfield      #18                 // Field $admin:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;
       692: aload_3
       693: invokevirtual #182                // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult.getNodes:()Ljava/util/List;
       696: invokeinterface #345,  1          // InterfaceMethod java/util/List.size:()I
       701: invokedynamic #348,  0            // InvokeDynamic #6:makeConcatWithConstants:(I)Ljava/lang/String;
       706: invokeinterface #99,  2           // InterfaceMethod ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface.sendMessage:(Ljava/lang/String;)V
       711: aload_0
       712: getfield      #18                 // Field $admin:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;
       715: aload_3
       716: invokevirtual #298                // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult.getWalkableCount:()I
       719: aload_3
       720: invokevirtual #298                // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult.getWalkableCount:()I
       723: i2d
       724: aload_3
       725: invokevirtual #182                // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult.getNodes:()Ljava/util/List;
       728: invokeinterface #345,  1          // InterfaceMethod java/util/List.size:()I
       733: i2d
       734: ddiv
       735: bipush        100
       737: i2d
       738: dmul
       739: invokestatic  #354                // Method kotlin/math/MathKt.roundToInt:(D)I
       742: invokedynamic #359,  0            // InvokeDynamic #7:makeConcatWithConstants:(II)Ljava/lang/String;
       747: invokeinterface #99,  2           // InterfaceMethod ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface.sendMessage:(Ljava/lang/String;)V
       752: aload_0
       753: getfield      #18                 // Field $admin:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;
       756: aload_3
       757: invokevirtual #362                // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult.getMultilayerCount:()I
       760: invokedynamic #365,  0            // InvokeDynamic #8:makeConcatWithConstants:(I)Ljava/lang/String;
       765: invokeinterface #99,  2           // InterfaceMethod ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface.sendMessage:(Ljava/lang/String;)V
       770: aload_0
       771: getfield      #18                 // Field $admin:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;
       774: aload_3
       775: invokevirtual #322                // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult.getDurationMs:()J
       778: invokedynamic #370,  0            // InvokeDynamic #9:makeConcatWithConstants:(J)Ljava/lang/String;
       783: invokeinterface #99,  2           // InterfaceMethod ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface.sendMessage:(Ljava/lang/String;)V
       788: aload_0
       789: getfield      #18                 // Field $admin:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;
       792: aload         6
       794: invokeinterface #374,  1          // InterfaceMethod java/nio/file/Path.getFileName:()Ljava/nio/file/Path;
       799: aload         6
       801: invokeinterface #219,  1          // InterfaceMethod java/nio/file/Path.toFile:()Ljava/io/File;
       806: invokevirtual #377                // Method java/io/File.length:()J
       809: sipush        1024
       812: i2l
       813: ldiv
       814: invokedynamic #382,  0            // InvokeDynamic #10:makeConcatWithConstants:(Ljava/nio/file/Path;J)Ljava/lang/String;
       819: invokeinterface #99,  2           // InterfaceMethod ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface.sendMessage:(Ljava/lang/String;)V
       824: aload_0
       825: getfield      #29                 // Field $generateJps:Z
       828: ifeq          861
       831: aload_0
       832: getfield      #18                 // Field $admin:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;
       835: aload         5
       837: dup
       838: ifnull        849
       841: invokeinterface #202,  1          // InterfaceMethod java/util/Map.size:()I
       846: goto          851
       849: pop
       850: iconst_0
       851: invokedynamic #385,  0            // InvokeDynamic #11:makeConcatWithConstants:(I)Ljava/lang/String;
       856: invokeinterface #99,  2           // InterfaceMethod ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface.sendMessage:(Ljava/lang/String;)V
       861: nop
       862: aload_0
       863: getfield      #14                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;
       866: invokestatic  #389                // Method ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands.access$getBridge$p:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;)Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;
       869: aload_0
       870: getfield      #22                 // Field $regionX:Ljava/lang/Integer;
       873: invokevirtual #105                // Method java/lang/Integer.intValue:()I
       876: aload_0
       877: getfield      #25                 // Field $regionY:Ljava/lang/Integer;
       880: invokevirtual #105                // Method java/lang/Integer.intValue:()I
       883: invokevirtual #395                // Method ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge.reloadRegion:(II)V
       886: aload_0
       887: getfield      #18                 // Field $admin:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;
       890: ldc_w         #397                // String Região carregada no pathfinder automaticamente!
       893: invokeinterface #99,  2           // InterfaceMethod ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface.sendMessage:(Ljava/lang/String;)V
       898: goto          925
       901: astore        8
       903: aload_0
       904: getfield      #18                 // Field $admin:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;
       907: aload_0
       908: getfield      #22                 // Field $regionX:Ljava/lang/Integer;
       911: aload_0
       912: getfield      #25                 // Field $regionY:Ljava/lang/Integer;
       915: invokedynamic #400,  0            // InvokeDynamic #12:makeConcatWithConstants:(Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/String;
       920: invokeinterface #99,  2           // InterfaceMethod ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface.sendMessage:(Ljava/lang/String;)V
       925: aload_0
       926: getfield      #14                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;
       929: invokestatic  #404                // Method ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands.access$getActiveGenerations$p:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;)Ljava/util/concurrent/ConcurrentHashMap;
       932: aload_0
       933: getfield      #33                 // Field $key:Lkotlin/Pair;
       936: invokevirtual #409                // Method java/util/concurrent/ConcurrentHashMap.remove:(Ljava/lang/Object;)Ljava/lang/Object;
       939: pop
       940: goto          1002
       943: astore_2
       944: aload_0
       945: getfield      #18                 // Field $admin:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;
       948: aload_2
       949: invokevirtual #413                // Method java/lang/Exception.getMessage:()Ljava/lang/String;
       952: invokedynamic #416,  0            // InvokeDynamic #13:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
       957: invokeinterface #99,  2           // InterfaceMethod ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface.sendMessage:(Ljava/lang/String;)V
       962: aload_2
       963: invokevirtual #419                // Method java/lang/Exception.printStackTrace:()V
       966: aload_0
       967: getfield      #14                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;
       970: invokestatic  #404                // Method ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands.access$getActiveGenerations$p:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;)Ljava/util/concurrent/ConcurrentHashMap;
       973: aload_0
       974: getfield      #33                 // Field $key:Lkotlin/Pair;
       977: invokevirtual #409                // Method java/util/concurrent/ConcurrentHashMap.remove:(Ljava/lang/Object;)Ljava/lang/Object;
       980: pop
       981: goto          1002
       984: astore_2
       985: aload_0
       986: getfield      #14                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;
       989: invokestatic  #404                // Method ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands.access$getActiveGenerations$p:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;)Ljava/util/concurrent/ConcurrentHashMap;
       992: aload_0
       993: getfield      #33                 // Field $key:Lkotlin/Pair;
       996: invokevirtual #409                // Method java/util/concurrent/ConcurrentHashMap.remove:(Ljava/lang/Object;)Ljava/lang/Object;
       999: pop
      1000: aload_2
      1001: athrow
      1002: getstatic     #425                // Field kotlin/Unit.INSTANCE:Lkotlin/Unit;
      1005: areturn
      1006: new           #427                // class java/lang/IllegalStateException
      1009: dup
      1010: ldc_w         #429                // String call to \'resume\' before \'invoke\' with coroutine
      1013: invokespecial #431                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      1016: athrow
      Exception table:
         from    to  target type
           861   898   901   Class java/lang/Exception
            36   107   943   Class java/lang/Exception
           124   925   943   Class java/lang/Exception
            36   107   984   any
           124   925   984   any
           943   966   984   any
           984   985   984   any
      StackMapTable: number_of_entries = 26
        frame_type = 255 /* full_frame */
          offset_delta = 32
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerate$1, class java/lang/Object, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 251 /* same_frame_extended */
          offset_delta = 83
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerate$1, class java/lang/Object, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = [ class java/lang/Object ]
        frame_type = 255 /* full_frame */
          offset_delta = 45
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerate$1, class java/lang/Object, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 4 /* same */
        frame_type = 4 /* same */
        frame_type = 4 /* same */
        frame_type = 65 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 80
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerate$1, class java/lang/Object, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult, class java/lang/String, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ class java/util/Map ]
        frame_type = 255 /* full_frame */
          offset_delta = 129
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerate$1, class java/lang/Object, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult, class java/lang/String, class java/util/Map, class java/nio/file/Path, top, class java/lang/Iterable, class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands, int, class java/lang/Iterable, class java/util/Collection, int, int, class java/util/Iterator, top, top, top, top, top, int, int, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 35
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerate$1, class java/lang/Object, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult, class java/lang/String, class java/util/Map, class java/nio/file/Path, top, class java/lang/Iterable, class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands, int, class java/lang/Iterable, class java/util/Collection, int, int, class java/util/Iterator, class java/lang/Object, int, top, top, top, int, int, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = [ class java/util/Collection ]
        frame_type = 255 /* full_frame */
          offset_delta = 42
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerate$1, class java/lang/Object, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult, class java/lang/String, class java/util/Map, class java/nio/file/Path, top, class java/lang/Iterable, class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands, int, class java/lang/Iterable, class java/util/Collection, int, int, class java/util/Iterator, top, top, top, top, top, int, int, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 83
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerate$1, class java/lang/Object, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult, class java/lang/String, class java/util/Map, class java/nio/file/Path, top, class java/lang/Iterable, class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands, int, class java/lang/Iterable, class java/util/Collection, int, int, class java/util/Iterator, top, top, top, top, top, int, int, class java/util/List, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = [ int, int, class java/util/Map, int, class ext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid, class ext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity ]
        frame_type = 255 /* full_frame */
          offset_delta = 5
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerate$1, class java/lang/Object, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult, class java/lang/String, class java/util/Map, class java/nio/file/Path, top, class java/lang/Iterable, class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands, int, class java/lang/Iterable, class java/util/Collection, int, int, class java/util/Iterator, top, top, top, top, top, int, int, class java/util/List, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = [ int, int, class java/util/Map, int, class ext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid, class ext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity ]
        frame_type = 255 /* full_frame */
          offset_delta = 5
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerate$1, class java/lang/Object, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult, class java/lang/String, class java/util/Map, class java/nio/file/Path, top, class java/lang/Iterable, class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands, int, class java/lang/Iterable, class java/util/Collection, int, int, class java/util/Iterator, top, top, top, top, top, int, int, class java/util/List, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = [ int, int, class java/util/Map, int, class ext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid, class ext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerate$1, class java/lang/Object, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult, class java/lang/String, class java/util/Map, class java/nio/file/Path, top, class java/lang/Iterable, class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands, int, class java/lang/Iterable, class java/util/Collection, int, int, class java/util/Iterator, top, top, top, top, top, int, int, class java/util/List, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = [ int, int, class java/util/Map, int, class ext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid, class ext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity, class ext/mods/gameserver/geoengine/pathfinding/serialization/SourceType ]
        frame_type = 255 /* full_frame */
          offset_delta = 265
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerate$1, class java/lang/Object, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult, class java/lang/String, class java/util/Map, class java/nio/file/Path, class ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion, class java/lang/Iterable, class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands, int, class java/lang/Iterable, class java/util/Collection, int, int, class java/util/Iterator, top, top, top, top, top, int, int, class java/util/List, long, class ext/mods/gameserver/geoengine/pathfinding/serialization/SourceType, class ext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity, class ext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid, int, class java/util/Map, int, int, class java/lang/Object ]
          stack = [ class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface, class java/util/Map ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerate$1, class java/lang/Object, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult, class java/lang/String, class java/util/Map, class java/nio/file/Path, class ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion, class java/lang/Iterable, class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands, int, class java/lang/Iterable, class java/util/Collection, int, int, class java/util/Iterator, top, top, top, top, top, int, int, class java/util/List, long, class ext/mods/gameserver/geoengine/pathfinding/serialization/SourceType, class ext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity, class ext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid, int, class java/util/Map, int, int, class java/lang/Object ]
          stack = [ class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface, int ]
        frame_type = 9 /* same */
        frame_type = 103 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 255 /* full_frame */
          offset_delta = 23
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerate$1, class java/lang/Object, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult, class java/lang/String, class java/util/Map, class java/nio/file/Path, class ext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion, class java/lang/Object, class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands, int, class java/lang/Iterable, class java/util/Collection, int, int, class java/util/Iterator, top, top, top, top, top, int, int, class java/util/List, long, class ext/mods/gameserver/geoengine/pathfinding/serialization/SourceType, class ext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity, class ext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid, int, class java/util/Map, int, int, class java/lang/Object ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerate$1, class java/lang/Object, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = [ class java/lang/Exception ]
        frame_type = 104 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerate$1, class java/lang/Object, class java/lang/Object, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 3
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerate$1, class java/lang/Object, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = []
      LineNumberTable:
        line 115: 3
        line 116: 36
        line 117: 37
        line 119: 52
        line 120: 63
        line 121: 64
        line 122: 71
        line 120: 78
        line 115: 113
        line 128: 134
        line 129: 176
        line 130: 181
        line 131: 186
        line 132: 191
        line 128: 193
        line 134: 195
        line 136: 211
        line 137: 218
        line 138: 229
        line 141: 248
        line 142: 269
        line 143: 274
        line 136: 275
        line 145: 277
        line 147: 288
        line 148: 304
        line 150: 331
        line 151: 331
        line 152: 338
        line 153: 345
        line 577: 367
        line 578: 393
        line 579: 396
        line 580: 424
        line 580: 443
        line 153: 457
        line 580: 475
        line 581: 484
        line 577: 489
        line 153: 501
        line 154: 504
        line 155: 508
        line 156: 519
        line 157: 530
        line 158: 568
        line 159: 574
        line 160: 580
        line 162: 583
        line 150: 587
        line 165: 628
        line 167: 642
        line 168: 654
        line 169: 666
        line 170: 688
        line 171: 711
        line 172: 752
        line 173: 770
        line 174: 788
        line 176: 824
        line 177: 831
        line 180: 861
        line 181: 862
        line 182: 886
        line 183: 901
        line 184: 903
        line 191: 925
        line 192: 940
        line 187: 943
        line 188: 944
        line 189: 962
        line 191: 966
        line 192: 981
        line 191: 984
        line 193: 1002
        line 115: 1006
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          248      23     6   jps   Ljava/util/Map;
          457      15    20 $i$a$-mapIndexed-L2BRAdminCommands$handleGenerate$1$region$1   I
          454      18    19   idx   I
          454      18    18  node   Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;
          424      57    16 item$iv$iv   Ljava/lang/Object;
          393      93    13 $i$f$mapIndexedTo   I
          396      90    14 index$iv$iv   I
          390      96    11 $this$mapIndexedTo$iv$iv   Ljava/lang/Iterable;
          390      96    12 destination$iv$iv   Ljava/util/Collection;
          367     123    10 $i$f$mapIndexed   I
          364     126     8 $this$mapIndexed$iv   Ljava/lang/Iterable;
          903      22     8     e   Ljava/lang/Exception;
           52      64     2 indexer   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;
          134     791     3 result   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult;
          195     730     4 sourceMsg   Ljava/lang/String;
          277     648     5 jumpPoints   Ljava/util/Map;
          331     594     6 outputFile   Ljava/nio/file/Path;
          628     297     7 region   Lext/mods/gameserver/geoengine/pathfinding/serialization/IndexedRegion;
          944      22     2     e   Ljava/lang/Exception;
            0    1017     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerate$1;
            0    1017     1 $result   Ljava/lang/Object;
          124     801     2 indexer   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;

  public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object, kotlin.coroutines.Continuation<?>);
    descriptor: (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=9, locals=3, args_size=3
         0: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerate$1
         3: dup
         4: aload_0
         5: getfield      #14                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;
         8: aload_0
         9: getfield      #18                 // Field $admin:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;
        12: aload_0
        13: getfield      #22                 // Field $regionX:Ljava/lang/Integer;
        16: aload_0
        17: getfield      #25                 // Field $regionY:Ljava/lang/Integer;
        20: aload_0
        21: getfield      #29                 // Field $generateJps:Z
        24: aload_0
        25: getfield      #33                 // Field $key:Lkotlin/Pair;
        28: aload_2
        29: invokespecial #474                // Method "<init>":(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;Ljava/lang/Integer;Ljava/lang/Integer;ZLkotlin/Pair;Lkotlin/coroutines/Continuation;)V
        32: checkcast     #127                // class kotlin/coroutines/Continuation
        35: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      36     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerate$1;
            0      36     1 value   Ljava/lang/Object;
            0      36     2 $completion   Lkotlin/coroutines/Continuation;
    Signature: #472                         // (Ljava/lang/Object;Lkotlin/coroutines/Continuation<*>;)Lkotlin/coroutines/Continuation<Lkotlin/Unit;>;

  public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>);
    descriptor: (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: aload_2
         3: invokevirtual #479                // Method create:(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
         6: checkcast     #2                  // class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerate$1
         9: getstatic     #425                // Field kotlin/Unit.INSTANCE:Lkotlin/Unit;
        12: invokevirtual #481                // Method invokeSuspend:(Ljava/lang/Object;)Ljava/lang/Object;
        15: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerate$1;
            0      16     1    p1   Lkotlinx/coroutines/CoroutineScope;
            0      16     2    p2   Lkotlin/coroutines/Continuation;
    Signature: #477                         // (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Lkotlin/Unit;>;)Ljava/lang/Object;

  public java.lang.Object invoke(java.lang.Object, java.lang.Object);
    descriptor: (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: checkcast     #496                // class kotlinx/coroutines/CoroutineScope
         5: aload_2
         6: checkcast     #127                // class kotlin/coroutines/Continuation
         9: invokevirtual #498                // Method invoke:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
        12: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerate$1;
            0      13     1    p1   Ljava/lang/Object;
            0      13     2    p2   Ljava/lang/Object;
}
InnerClasses:
  public static final #513= #153 of #82;  // DataSource=class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource of class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
  public static #516= #515 of #82;        // GeoDataProvider=class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider of class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
  public static final #517= #135 of #82;  // IndexationResult=class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult of class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
  public static final #518= #141 of #82;  // SourceInfo=class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo of class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
  public static #519= #95 of #84;         // AdminInterface=class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface of class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands
  static final #2;                        // class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerate$1
  public static final #520= #147 of #2;   // WhenMappings=class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerate$1$WhenMappings of class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerate$1
EnclosingMethod: #84.#512               // ext.mods.gameserver.geoengine.pathfinding.integration.L2BRAdminCommands.handleGenerate
Signature: #3                           // Lkotlin/coroutines/jvm/internal/SuspendLambda;Lkotlin/jvm/functions/Function2<Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Lkotlin/Unit;>;Ljava/lang/Object;>;
SourceFile: "AdminCommands.kt"
SourceDebugExtension:
  SMAP
  AdminCommands.kt
  Kotlin
  *S Kotlin
  *F
  + 1 AdminCommands.kt
  ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerate$1
  + 2 _Collections.kt
  kotlin/collections/CollectionsKt___CollectionsKt
  *L
  1#1,576:1
  1596#2:577
  1629#2,4:578
  *S KotlinDebug
  *F
  + 1 AdminCommands.kt
  ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerate$1
  *L
  153#1:577
  153#1:578,4
  *E
RuntimeVisibleAnnotations:
  0: #46(#47=s#48,#49=[I#50],#51=[I#52],#53=[I#54],#55=[s#44],#56=[s#57],#58=s#42,#59=s#60,#61=I#62)
    kotlin.coroutines.jvm.internal.DebugMetadata(
      f="AdminCommands.kt"
      l=[120]
      nl=[128]
      i=[0]
      s=["L$0"]
      n=["indexer"]
      m="invokeSuspend"
      c="ext.mods.gameserver.geoengine.pathfinding.integration.L2BRAdminCommands$handleGenerate$1"
      v=2
    )
  1: #500(#501=[I#62,I#502,I#54],#503=I#502,#504=I#505,#506=[s#507],#508=[s#509,s#338,s#483])
    kotlin.Metadata(
      mv=[2,3,0]
      k=3
      xi=48
      d1=["\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"]
      d2=["<anonymous>","","Lkotlinx/coroutines/CoroutineScope;"]
    )
RuntimeInvisibleAnnotations:
  0: #521(#475=[s#522])
    kotlin.jvm.internal.SourceDebugExtension(
      value=["SMAP\nAdminCommands.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdminCommands.kt\next/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerate$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,576:1\n1596#2:577\n1629#2,4:578\n*S KotlinDebug\n*F\n+ 1 AdminCommands.kt\next/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerate$1\n*L\n153#1:577\n153#1:578,4\n*E\n"]
    )
BootstrapMethods:
  0: #121 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #107 (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      #112 REF_invokeStatic ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerate$1.invokeSuspend$lambda$0:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;Ljava/lang/String;I)Lkotlin/Unit;
      #114 (Ljava/lang/String;Ljava/lang/Integer;)Lkotlin/Unit;
  1: #173 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #166 Fonte utilizada: \u0001
  2: #121 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #183 (Ljava/lang/Object;)Ljava/lang/Object;
      #188 REF_invokeStatic ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerate$1.invokeSuspend$lambda$1:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;I)Lkotlin/Unit;
      #190 (Ljava/lang/Integer;)Lkotlin/Unit;
  3: #173 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #204   Jump Points calculados: §a\u0001
  4: #173 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #227 \u0001_\u0001.l2br
  5: #173 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #343 Região: §a[\u0001, \u0001]
  6: #173 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #347 Total de nós: \u0001
  7: #173 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #356 Nós walkable: \u0001 §7(\u0001%)
  8: #173 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #364 Multi-layer: \u0001
  9: #173 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #367 Tempo total: \u0001ms
  10: #173 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #379 Arquivo: \u0001 (\u0001 KB)
  11: #173 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #384 JPS: Ativado (\u0001 jump points)
  12: #173 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #399 Use //l2br_reload \u0001 \u0001 para carregar.
  13: #173 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #415 [ERRO] \u0001
  14: #173 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #486   §8[\u0001%] \u0001
  15: #173 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #493   §8[JPS \u0001%]
