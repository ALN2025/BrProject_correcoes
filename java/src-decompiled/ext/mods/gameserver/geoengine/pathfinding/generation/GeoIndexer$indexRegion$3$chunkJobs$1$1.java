// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$indexRegion$3$chunkJobs$1$1
// File: ext\mods\gameserver\geoengine\pathfinding\generation\GeoIndexer$indexRegion$3$chunkJobs$1$1.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1.class
  Last modified 9 de jul de 2026; size 11462 bytes
  MD5 checksum 566744481135afc6d16d045e437238d6
  Compiled from "GeoIndexer.kt"
final class ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$indexRegion$3$chunkJobs$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>
  minor version: 0
  major version: 69
  flags: (0x0030) ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1
  super_class: #5                         // kotlin/coroutines/jvm/internal/SuspendLambda
  interfaces: 1, fields: 17, methods: 5, attributes: 8
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1
    #2 = Class              #1            // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1
    #3 = Utf8               Lkotlin/coroutines/jvm/internal/SuspendLambda;Lkotlin/jvm/functions/Function2<Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Lkotlin/Unit;>;Ljava/lang/Object;>;
    #4 = Utf8               kotlin/coroutines/jvm/internal/SuspendLambda
    #5 = Class              #4            // kotlin/coroutines/jvm/internal/SuspendLambda
    #6 = Utf8               kotlin/jvm/functions/Function2
    #7 = Class              #6            // kotlin/jvm/functions/Function2
    #8 = Utf8               <init>
    #9 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk;Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;ZLjava/util/concurrent/atomic/AtomicInteger;ILkotlin/jvm/functions/Function2;Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;Lkotlinx/coroutines/channels/Channel;Lkotlin/coroutines/Continuation;)V
   #10 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk;Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;ZLjava/util/concurrent/atomic/AtomicInteger;ILkotlin/jvm/functions/Function2<-Ljava/lang/String;-Ljava/lang/Integer;Lkotlin/Unit;>;Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;Lkotlinx/coroutines/channels/Channel<Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;>;Lkotlin/coroutines/Continuation<-Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1;>;)V
   #11 = Utf8               $chunk
   #12 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk;
   #13 = NameAndType        #11:#12       // $chunk:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk;
   #14 = Fieldref           #2.#13        // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1.$chunk:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk;
   #15 = Utf8               this$0
   #16 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;
   #17 = NameAndType        #15:#16       // this$0:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;
   #18 = Fieldref           #2.#17        // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1.this$0:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;
   #19 = Utf8               $hasConvDat
   #20 = Utf8               Z
   #21 = NameAndType        #19:#20       // $hasConvDat:Z
   #22 = Fieldref           #2.#21        // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1.$hasConvDat:Z
   #23 = Utf8               $processed
   #24 = Utf8               Ljava/util/concurrent/atomic/AtomicInteger;
   #25 = NameAndType        #23:#24       // $processed:Ljava/util/concurrent/atomic/AtomicInteger;
   #26 = Fieldref           #2.#25        // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1.$processed:Ljava/util/concurrent/atomic/AtomicInteger;
   #27 = Utf8               $totalCells
   #28 = Utf8               I
   #29 = NameAndType        #27:#28       // $totalCells:I
   #30 = Fieldref           #2.#29        // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1.$totalCells:I
   #31 = Utf8               $onProgress
   #32 = Utf8               Lkotlin/jvm/functions/Function2;
   #33 = NameAndType        #31:#32       // $onProgress:Lkotlin/jvm/functions/Function2;
   #34 = Fieldref           #2.#33        // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1.$onProgress:Lkotlin/jvm/functions/Function2;
   #35 = Utf8               $sourceInfo
   #36 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;
   #37 = NameAndType        #35:#36       // $sourceInfo:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;
   #38 = Fieldref           #2.#37        // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1.$sourceInfo:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;
   #39 = Utf8               $nodeChannel
   #40 = Utf8               Lkotlinx/coroutines/channels/Channel;
   #41 = NameAndType        #39:#40       // $nodeChannel:Lkotlinx/coroutines/channels/Channel;
   #42 = Fieldref           #2.#41        // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1.$nodeChannel:Lkotlinx/coroutines/channels/Channel;
   #43 = Utf8               (ILkotlin/coroutines/Continuation;)V
   #44 = NameAndType        #8:#43        // "<init>":(ILkotlin/coroutines/Continuation;)V
   #45 = Methodref          #5.#44        // kotlin/coroutines/jvm/internal/SuspendLambda."<init>":(ILkotlin/coroutines/Continuation;)V
   #46 = Utf8               this
   #47 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1;
   #48 = Utf8               $receiver
   #49 = Utf8               $completion
   #50 = Utf8               Lkotlin/coroutines/Continuation;
   #51 = Utf8               invokeSuspend
   #52 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #53 = Utf8               L$0
   #54 = Utf8               Ljava/lang/Object;
   #55 = Utf8               L$1
   #56 = Utf8               L$2
   #57 = Utf8               L$3
   #58 = Utf8               L$4
   #59 = Utf8               L$5
   #60 = Utf8               I$0
   #61 = Utf8               I$1
   #62 = Utf8               Lkotlin/coroutines/jvm/internal/DebugMetadata;
   #63 = Utf8               f
   #64 = Utf8               GeoIndexer.kt
   #65 = Utf8               l
   #66 = Integer            357
   #67 = Utf8               nl
   #68 = Integer            476
   #69 = Utf8               i
   #70 = Integer            0
   #71 = Utf8               s
   #72 = Utf8               n
   #73 = Utf8               localNodes
   #74 = Utf8               $this$forEach$iv
   #75 = Utf8               element$iv
   #76 = Utf8               it
   #77 = Utf8               $i$f$forEach
   #78 = Utf8               $i$a$-forEach-GeoIndexer$indexRegion$3$chunkJobs$1$1$2
   #79 = Utf8               m
   #80 = Utf8               c
   #81 = Utf8               ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$indexRegion$3$chunkJobs$1$1
   #82 = Utf8               v
   #83 = Integer            2
   #84 = Utf8               kotlin/coroutines/intrinsics/IntrinsicsKt
   #85 = Class              #84           // kotlin/coroutines/intrinsics/IntrinsicsKt
   #86 = Utf8               getCOROUTINE_SUSPENDED
   #87 = Utf8               ()Ljava/lang/Object;
   #88 = NameAndType        #86:#87       // getCOROUTINE_SUSPENDED:()Ljava/lang/Object;
   #89 = Methodref          #85.#88       // kotlin/coroutines/intrinsics/IntrinsicsKt.getCOROUTINE_SUSPENDED:()Ljava/lang/Object;
   #90 = Utf8               label
   #91 = NameAndType        #90:#28       // label:I
   #92 = Fieldref           #2.#91        // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1.label:I
   #93 = Utf8               kotlin/ResultKt
   #94 = Class              #93           // kotlin/ResultKt
   #95 = Utf8               throwOnFailure
   #96 = Utf8               (Ljava/lang/Object;)V
   #97 = NameAndType        #95:#96       // throwOnFailure:(Ljava/lang/Object;)V
   #98 = Methodref          #94.#97       // kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
   #99 = Utf8               java/util/ArrayList
  #100 = Class              #99           // java/util/ArrayList
  #101 = Utf8               ()V
  #102 = NameAndType        #8:#101       // "<init>":()V
  #103 = Methodref          #100.#102     // java/util/ArrayList."<init>":()V
  #104 = Utf8               java/util/List
  #105 = Class              #104          // java/util/List
  #106 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk
  #107 = Class              #106          // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk
  #108 = Utf8               getStartX
  #109 = Utf8               ()I
  #110 = NameAndType        #108:#109     // getStartX:()I
  #111 = Methodref          #107.#110     // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk.getStartX:()I
  #112 = Utf8               getEndX
  #113 = NameAndType        #112:#109     // getEndX:()I
  #114 = Methodref          #107.#113     // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk.getEndX:()I
  #115 = Utf8               getStartY
  #116 = NameAndType        #115:#109     // getStartY:()I
  #117 = Methodref          #107.#116     // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk.getStartY:()I
  #118 = Utf8               getEndY
  #119 = NameAndType        #118:#109     // getEndY:()I
  #120 = Methodref          #107.#119     // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk.getEndY:()I
  #121 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
  #122 = Class              #121          // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
  #123 = Utf8               access$getGeoDataProvider$p
  #124 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;
  #125 = NameAndType        #123:#124     // access$getGeoDataProvider$p:(Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;
  #126 = Methodref          #122.#125     // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer.access$getGeoDataProvider$p:(Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;
  #127 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider
  #128 = Class              #127          // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider
  #129 = Utf8               isLoaded
  #130 = Utf8               (II)Z
  #131 = NameAndType        #129:#130     // isLoaded:(II)Z
  #132 = InterfaceMethodref #128.#131     // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider.isLoaded:(II)Z
  #133 = Utf8               getBlockType
  #134 = Utf8               (II)Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
  #135 = NameAndType        #133:#134     // getBlockType:(II)Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
  #136 = InterfaceMethodref #128.#135     // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider.getBlockType:(II)Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
  #137 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1$WhenMappings
  #138 = Class              #137          // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1$WhenMappings
  #139 = Utf8               $EnumSwitchMapping$0
  #140 = Utf8               [I
  #141 = NameAndType        #139:#140     // $EnumSwitchMapping$0:[I
  #142 = Fieldref           #138.#141     // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1$WhenMappings.$EnumSwitchMapping$0:[I
  #143 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/BlockType
  #144 = Class              #143          // ext/mods/gameserver/geoengine/pathfinding/model/BlockType
  #145 = Utf8               ordinal
  #146 = NameAndType        #145:#109     // ordinal:()I
  #147 = Methodref          #144.#146     // ext/mods/gameserver/geoengine/pathfinding/model/BlockType.ordinal:()I
  #148 = Utf8               getHeight
  #149 = Utf8               (II)S
  #150 = NameAndType        #148:#149     // getHeight:(II)S
  #151 = InterfaceMethodref #128.#150     // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider.getHeight:(II)S
  #152 = Utf8               getNswe
  #153 = Utf8               (II)B
  #154 = NameAndType        #152:#153     // getNswe:(II)B
  #155 = InterfaceMethodref #128.#154     // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider.getNswe:(II)B
  #156 = Utf8               access$createNode
  #157 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;IISBILext/mods/gameserver/geoengine/pathfinding/model/BlockType;)Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;
  #158 = NameAndType        #156:#157     // access$createNode:(Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;IISBILext/mods/gameserver/geoengine/pathfinding/model/BlockType;)Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;
  #159 = Methodref          #122.#158     // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer.access$createNode:(Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;IISBILext/mods/gameserver/geoengine/pathfinding/model/BlockType;)Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;
  #160 = Utf8               add
  #161 = Utf8               (Ljava/lang/Object;)Z
  #162 = NameAndType        #160:#161     // add:(Ljava/lang/Object;)Z
  #163 = InterfaceMethodref #105.#162     // java/util/List.add:(Ljava/lang/Object;)Z
  #164 = Utf8               kotlin/coroutines/jvm/internal/Boxing
  #165 = Class              #164          // kotlin/coroutines/jvm/internal/Boxing
  #166 = Utf8               boxBoolean
  #167 = Utf8               (Z)Ljava/lang/Boolean;
  #168 = NameAndType        #166:#167     // boxBoolean:(Z)Ljava/lang/Boolean;
  #169 = Methodref          #165.#168     // kotlin/coroutines/jvm/internal/Boxing.boxBoolean:(Z)Ljava/lang/Boolean;
  #170 = Utf8               getLayers
  #171 = Utf8               (II)Ljava/util/List;
  #172 = NameAndType        #170:#171     // getLayers:(II)Ljava/util/List;
  #173 = InterfaceMethodref #128.#172     // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider.getLayers:(II)Ljava/util/List;
  #174 = Utf8               java/lang/Iterable
  #175 = Class              #174          // java/lang/Iterable
  #176 = Utf8               iterator
  #177 = Utf8               ()Ljava/util/Iterator;
  #178 = NameAndType        #176:#177     // iterator:()Ljava/util/Iterator;
  #179 = InterfaceMethodref #175.#178     // java/lang/Iterable.iterator:()Ljava/util/Iterator;
  #180 = Utf8               java/util/Iterator
  #181 = Class              #180          // java/util/Iterator
  #182 = Utf8               hasNext
  #183 = Utf8               ()Z
  #184 = NameAndType        #182:#183     // hasNext:()Z
  #185 = InterfaceMethodref #181.#184     // java/util/Iterator.hasNext:()Z
  #186 = Utf8               next
  #187 = NameAndType        #186:#87      // next:()Ljava/lang/Object;
  #188 = InterfaceMethodref #181.#187     // java/util/Iterator.next:()Ljava/lang/Object;
  #189 = Utf8               kotlin/collections/CollectionsKt
  #190 = Class              #189          // kotlin/collections/CollectionsKt
  #191 = Utf8               throwIndexOverflow
  #192 = NameAndType        #191:#101     // throwIndexOverflow:()V
  #193 = Methodref          #190.#192     // kotlin/collections/CollectionsKt.throwIndexOverflow:()V
  #194 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo
  #195 = Class              #194          // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo
  #196 = Utf8               ()S
  #197 = NameAndType        #148:#196     // getHeight:()S
  #198 = Methodref          #195.#197     // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo.getHeight:()S
  #199 = Utf8               ()B
  #200 = NameAndType        #152:#199     // getNswe:()B
  #201 = Methodref          #195.#200     // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo.getNswe:()B
  #202 = Utf8               kotlin/Unit
  #203 = Class              #202          // kotlin/Unit
  #204 = Utf8               INSTANCE
  #205 = Utf8               Lkotlin/Unit;
  #206 = NameAndType        #204:#205     // INSTANCE:Lkotlin/Unit;
  #207 = Fieldref           #203.#206     // kotlin/Unit.INSTANCE:Lkotlin/Unit;
  #208 = Utf8               kotlin/NoWhenBranchMatchedException
  #209 = Class              #208          // kotlin/NoWhenBranchMatchedException
  #210 = Methodref          #209.#102     // kotlin/NoWhenBranchMatchedException."<init>":()V
  #211 = Utf8               java/util/concurrent/atomic/AtomicInteger
  #212 = Class              #211          // java/util/concurrent/atomic/AtomicInteger
  #213 = Utf8               incrementAndGet
  #214 = NameAndType        #213:#109     // incrementAndGet:()I
  #215 = Methodref          #212.#214     // java/util/concurrent/atomic/AtomicInteger.incrementAndGet:()I
  #216 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo
  #217 = Class              #216          // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo
  #218 = Utf8               getPrimarySource
  #219 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;
  #220 = NameAndType        #218:#219     // getPrimarySource:()Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;
  #221 = Methodref          #217.#220     // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo.getPrimarySource:()Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;
  #222 = Utf8               Processando células (\u0001/\u0001) [\u0001]
  #223 = String             #222          // Processando células (\u0001/\u0001) [\u0001]
  #224 = Utf8               java/lang/invoke/StringConcatFactory
  #225 = Class              #224          // java/lang/invoke/StringConcatFactory
  #226 = Utf8               makeConcatWithConstants
  #227 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #228 = NameAndType        #226:#227     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #229 = Methodref          #225.#228     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #230 = MethodHandle       6:#229        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #231 = Utf8               (IILext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;)Ljava/lang/String;
  #232 = NameAndType        #226:#231     // makeConcatWithConstants:(IILext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;)Ljava/lang/String;
  #233 = InvokeDynamic      #0:#232       // #0:makeConcatWithConstants:(IILext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;)Ljava/lang/String;
  #234 = Utf8               kotlin/ranges/RangesKt
  #235 = Class              #234          // kotlin/ranges/RangesKt
  #236 = Utf8               coerceAtMost
  #237 = Utf8               (II)I
  #238 = NameAndType        #236:#237     // coerceAtMost:(II)I
  #239 = Methodref          #235.#238     // kotlin/ranges/RangesKt.coerceAtMost:(II)I
  #240 = Utf8               boxInt
  #241 = Utf8               (I)Ljava/lang/Integer;
  #242 = NameAndType        #240:#241     // boxInt:(I)Ljava/lang/Integer;
  #243 = Methodref          #165.#242     // kotlin/coroutines/jvm/internal/Boxing.boxInt:(I)Ljava/lang/Integer;
  #244 = Utf8               invoke
  #245 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #246 = NameAndType        #244:#245     // invoke:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #247 = InterfaceMethodref #7.#246       // kotlin/jvm/functions/Function2.invoke:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #248 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode
  #249 = Class              #248          // ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode
  #250 = Utf8               kotlin/coroutines/jvm/internal/SpillingKt
  #251 = Class              #250          // kotlin/coroutines/jvm/internal/SpillingKt
  #252 = Utf8               nullOutSpilledVariable
  #253 = NameAndType        #252:#52      // nullOutSpilledVariable:(Ljava/lang/Object;)Ljava/lang/Object;
  #254 = Methodref          #251.#253     // kotlin/coroutines/jvm/internal/SpillingKt.nullOutSpilledVariable:(Ljava/lang/Object;)Ljava/lang/Object;
  #255 = NameAndType        #53:#54       // L$0:Ljava/lang/Object;
  #256 = Fieldref           #2.#255       // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1.L$0:Ljava/lang/Object;
  #257 = NameAndType        #55:#54       // L$1:Ljava/lang/Object;
  #258 = Fieldref           #2.#257       // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1.L$1:Ljava/lang/Object;
  #259 = NameAndType        #56:#54       // L$2:Ljava/lang/Object;
  #260 = Fieldref           #2.#259       // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1.L$2:Ljava/lang/Object;
  #261 = NameAndType        #57:#54       // L$3:Ljava/lang/Object;
  #262 = Fieldref           #2.#261       // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1.L$3:Ljava/lang/Object;
  #263 = NameAndType        #58:#54       // L$4:Ljava/lang/Object;
  #264 = Fieldref           #2.#263       // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1.L$4:Ljava/lang/Object;
  #265 = NameAndType        #59:#54       // L$5:Ljava/lang/Object;
  #266 = Fieldref           #2.#265       // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1.L$5:Ljava/lang/Object;
  #267 = NameAndType        #60:#28       // I$0:I
  #268 = Fieldref           #2.#267       // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1.I$0:I
  #269 = NameAndType        #61:#28       // I$1:I
  #270 = Fieldref           #2.#269       // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1.I$1:I
  #271 = Utf8               kotlinx/coroutines/channels/Channel
  #272 = Class              #271          // kotlinx/coroutines/channels/Channel
  #273 = Utf8               send
  #274 = Utf8               (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #275 = NameAndType        #273:#274     // send:(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #276 = InterfaceMethodref #272.#275     // kotlinx/coroutines/channels/Channel.send:(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #277 = Utf8               java/lang/IllegalStateException
  #278 = Class              #277          // java/lang/IllegalStateException
  #279 = Utf8               call to \'resume\' before \'invoke\' with coroutine
  #280 = String             #279          // call to \'resume\' before \'invoke\' with coroutine
  #281 = Utf8               (Ljava/lang/String;)V
  #282 = NameAndType        #8:#281       // "<init>":(Ljava/lang/String;)V
  #283 = Methodref          #278.#282     // java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
  #284 = Utf8               height
  #285 = Utf8               S
  #286 = Utf8               nswe
  #287 = Utf8               B
  #288 = Utf8               $i$a$-forEachIndexed-GeoIndexer$indexRegion$3$chunkJobs$1$1$1
  #289 = Utf8               layerIdx
  #290 = Utf8               layer
  #291 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo;
  #292 = Utf8               item$iv
  #293 = Utf8               $i$f$forEachIndexed
  #294 = Utf8               index$iv
  #295 = Utf8               $this$forEachIndexed$iv
  #296 = Utf8               Ljava/lang/Iterable;
  #297 = Utf8               layers
  #298 = Utf8               Ljava/util/List;
  #299 = Utf8               percent
  #300 = Utf8               blockType
  #301 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
  #302 = Utf8               count
  #303 = Utf8               geoY
  #304 = Utf8               geoX
  #305 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;
  #306 = Utf8               $result
  #307 = Utf8               java/lang/Object
  #308 = Class              #307          // java/lang/Object
  #309 = Utf8               create
  #310 = Utf8               (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
  #311 = Utf8               (Ljava/lang/Object;Lkotlin/coroutines/Continuation<*>;)Lkotlin/coroutines/Continuation<Lkotlin/Unit;>;
  #312 = NameAndType        #8:#9         // "<init>":(Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk;Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;ZLjava/util/concurrent/atomic/AtomicInteger;ILkotlin/jvm/functions/Function2;Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;Lkotlinx/coroutines/channels/Channel;Lkotlin/coroutines/Continuation;)V
  #313 = Methodref          #2.#312       // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1."<init>":(Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk;Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;ZLjava/util/concurrent/atomic/AtomicInteger;ILkotlin/jvm/functions/Function2;Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;Lkotlinx/coroutines/channels/Channel;Lkotlin/coroutines/Continuation;)V
  #314 = Utf8               kotlin/coroutines/Continuation
  #315 = Class              #314          // kotlin/coroutines/Continuation
  #316 = Utf8               value
  #317 = Utf8               (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #318 = Utf8               (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Lkotlin/Unit;>;)Ljava/lang/Object;
  #319 = NameAndType        #309:#310     // create:(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
  #320 = Methodref          #2.#319       // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1.create:(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
  #321 = NameAndType        #51:#52       // invokeSuspend:(Ljava/lang/Object;)Ljava/lang/Object;
  #322 = Methodref          #2.#321       // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1.invokeSuspend:(Ljava/lang/Object;)Ljava/lang/Object;
  #323 = Utf8               p1
  #324 = Utf8               Lkotlinx/coroutines/CoroutineScope;
  #325 = Utf8               p2
  #326 = Utf8               kotlinx/coroutines/CoroutineScope
  #327 = Class              #326          // kotlinx/coroutines/CoroutineScope
  #328 = NameAndType        #244:#317     // invoke:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #329 = Methodref          #2.#328       // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1.invoke:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
  #330 = Utf8               Lkotlin/jvm/functions/Function2<Ljava/lang/String;Ljava/lang/Integer;Lkotlin/Unit;>;
  #331 = Utf8               Lkotlinx/coroutines/channels/Channel<Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;>;
  #332 = Utf8               Lkotlin/Metadata;
  #333 = Utf8               mv
  #334 = Integer            3
  #335 = Utf8               k
  #336 = Utf8               xi
  #337 = Integer            48
  #338 = Utf8               d1
  #339 = Utf8               \u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n
  #340 = Utf8               d2
  #341 = Utf8               <anonymous>
  #342 = Utf8
  #343 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3
  #344 = Class              #343          // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3
  #345 = Utf8               Chunk
  #346 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource
  #347 = Class              #346          // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource
  #348 = Utf8               DataSource
  #349 = Utf8               GeoDataProvider
  #350 = Utf8               LayerInfo
  #351 = Utf8               SourceInfo
  #352 = Utf8               WhenMappings
  #353 = Utf8               Lkotlin/jvm/internal/SourceDebugExtension;
  #354 = Utf8               SMAP\nGeoIndexer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GeoIndexer.kt\next/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,472:1\n1924#2,3:473\n1915#2,2:476\n*S KotlinDebug\n*F\n+ 1 GeoIndexer.kt\next/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1\n*L\n332#1:473,3\n357#1:476,2\n*E\n
  #355 = Utf8               Signature
  #356 = Utf8               Code
  #357 = Utf8               LocalVariableTable
  #358 = Utf8               StackMapTable
  #359 = Utf8               LineNumberTable
  #360 = Utf8               InnerClasses
  #361 = Utf8               EnclosingMethod
  #362 = Utf8               SourceFile
  #363 = Utf8               SourceDebugExtension
  #364 = Utf8               RuntimeVisibleAnnotations
  #365 = Utf8               RuntimeInvisibleAnnotations
  #366 = Utf8               BootstrapMethods
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

  int I$0;
    descriptor: I
    flags: (0x0000)

  int I$1;
    descriptor: I
    flags: (0x0000)

  int label;
    descriptor: I
    flags: (0x0000)

  final ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$Chunk $chunk;
    descriptor: Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  final ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer this$0;
    descriptor: Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  final boolean $hasConvDat;
    descriptor: Z
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  final java.util.concurrent.atomic.AtomicInteger $processed;
    descriptor: Ljava/util/concurrent/atomic/AtomicInteger;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  final int $totalCells;
    descriptor: I
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  final kotlin.jvm.functions.Function2<java.lang.String, java.lang.Integer, kotlin.Unit> $onProgress;
    descriptor: Lkotlin/jvm/functions/Function2;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC
    Signature: #330                         // Lkotlin/jvm/functions/Function2<Ljava/lang/String;Ljava/lang/Integer;Lkotlin/Unit;>;

  final ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$SourceInfo $sourceInfo;
    descriptor: Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  final kotlinx.coroutines.channels.Channel<ext.mods.gameserver.geoengine.pathfinding.model.IndexedNode> $nodeChannel;
    descriptor: Lkotlinx/coroutines/channels/Channel;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC
    Signature: #331                         // Lkotlinx/coroutines/channels/Channel<Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;>;

  ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$indexRegion$3$chunkJobs$1$1(ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$Chunk, ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer, boolean, java.util.concurrent.atomic.AtomicInteger, int, kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Integer, kotlin.Unit>, ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$SourceInfo, kotlinx.coroutines.channels.Channel<ext.mods.gameserver.geoengine.pathfinding.model.IndexedNode>, kotlin.coroutines.Continuation<? super ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$indexRegion$3$chunkJobs$1$1>);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk;Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;ZLjava/util/concurrent/atomic/AtomicInteger;ILkotlin/jvm/functions/Function2;Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;Lkotlinx/coroutines/channels/Channel;Lkotlin/coroutines/Continuation;)V
    flags: (0x0000)
    Code:
      stack=3, locals=10, args_size=10
         0: aload_0
         1: aload_1
         2: putfield      #14                 // Field $chunk:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk;
         5: aload_0
         6: aload_2
         7: putfield      #18                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;
        10: aload_0
        11: iload_3
        12: putfield      #22                 // Field $hasConvDat:Z
        15: aload_0
        16: aload         4
        18: putfield      #26                 // Field $processed:Ljava/util/concurrent/atomic/AtomicInteger;
        21: aload_0
        22: iload         5
        24: putfield      #30                 // Field $totalCells:I
        27: aload_0
        28: aload         6
        30: putfield      #34                 // Field $onProgress:Lkotlin/jvm/functions/Function2;
        33: aload_0
        34: aload         7
        36: putfield      #38                 // Field $sourceInfo:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;
        39: aload_0
        40: aload         8
        42: putfield      #42                 // Field $nodeChannel:Lkotlinx/coroutines/channels/Channel;
        45: aload_0
        46: iconst_2
        47: aload         9
        49: invokespecial #45                 // Method kotlin/coroutines/jvm/internal/SuspendLambda."<init>":(ILkotlin/coroutines/Continuation;)V
        52: return
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      53     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1;
            0      53     1 $chunk   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk;
            0      53     2 $receiver   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;
            0      53     3 $hasConvDat   Z
            0      53     4 $processed   Ljava/util/concurrent/atomic/AtomicInteger;
            0      53     5 $totalCells   I
            0      53     6 $onProgress   Lkotlin/jvm/functions/Function2;
            0      53     7 $sourceInfo   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;
            0      53     8 $nodeChannel   Lkotlinx/coroutines/channels/Channel;
            0      53     9 $completion   Lkotlin/coroutines/Continuation;
    Signature: #10                          // (Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk;Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;ZLjava/util/concurrent/atomic/AtomicInteger;ILkotlin/jvm/functions/Function2<-Ljava/lang/String;-Ljava/lang/Integer;Lkotlin/Unit;>;Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;Lkotlinx/coroutines/channels/Channel<Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;>;Lkotlin/coroutines/Continuation<-Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1;>;)V

  public final java.lang.Object invokeSuspend(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Ljava/lang/Object;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=8, locals=22, args_size=2
         0: invokestatic  #89                 // Method kotlin/coroutines/intrinsics/IntrinsicsKt.getCOROUTINE_SUSPENDED:()Ljava/lang/Object;
         3: astore        21
         5: aload_0
         6: getfield      #92                 // Field label:I
         9: tableswitch   { // 0 to 1

                       0: 32

                       1: 660
                 default: 735
            }
        32: aload_1
        33: invokestatic  #98                 // Method kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
        36: new           #100                // class java/util/ArrayList
        39: dup
        40: invokespecial #103                // Method java/util/ArrayList."<init>":()V
        43: checkcast     #105                // class java/util/List
        46: astore_2
        47: aload_0
        48: getfield      #14                 // Field $chunk:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk;
        51: invokevirtual #111                // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk.getStartX:()I
        54: istore_3
        55: aload_0
        56: getfield      #14                 // Field $chunk:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk;
        59: invokevirtual #114                // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk.getEndX:()I
        62: istore        4
        64: iload_3
        65: iload         4
        67: if_icmpge     527
        70: aload_0
        71: getfield      #14                 // Field $chunk:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk;
        74: invokevirtual #117                // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk.getStartY:()I
        77: istore        5
        79: aload_0
        80: getfield      #14                 // Field $chunk:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk;
        83: invokevirtual #120                // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk.getEndY:()I
        86: istore        6
        88: iload         5
        90: iload         6
        92: if_icmpge     521
        95: aload_0
        96: getfield      #18                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;
        99: invokestatic  #126                // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer.access$getGeoDataProvider$p:(Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;
       102: iload_3
       103: iload         5
       105: invokeinterface #132,  3          // InterfaceMethod ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider.isLoaded:(II)Z
       110: ifne          120
       113: aload_0
       114: getfield      #22                 // Field $hasConvDat:Z
       117: ifeq          515
       120: aload_0
       121: getfield      #18                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;
       124: invokestatic  #126                // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer.access$getGeoDataProvider$p:(Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;
       127: iload_3
       128: iload         5
       130: invokeinterface #136,  3          // InterfaceMethod ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider.getBlockType:(II)Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
       135: astore        7
       137: aload         7
       139: getstatic     #142                // Field ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1$WhenMappings.$EnumSwitchMapping$0:[I
       142: swap
       143: invokevirtual #147                // Method ext/mods/gameserver/geoengine/pathfinding/model/BlockType.ordinal:()I
       146: iaload
       147: tableswitch   { // 1 to 3

                       1: 172

                       2: 237

                       3: 302
                 default: 435
            }
       172: aload_0
       173: getfield      #18                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;
       176: invokestatic  #126                // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer.access$getGeoDataProvider$p:(Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;
       179: iload_3
       180: iload         5
       182: invokeinterface #151,  3          // InterfaceMethod ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider.getHeight:(II)S
       187: istore        10
       189: aload_0
       190: getfield      #18                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;
       193: invokestatic  #126                // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer.access$getGeoDataProvider$p:(Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;
       196: iload_3
       197: iload         5
       199: invokeinterface #155,  3          // InterfaceMethod ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider.getNswe:(II)B
       204: istore        11
       206: aload_2
       207: aload_0
       208: getfield      #18                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;
       211: iload_3
       212: iload         5
       214: iload         10
       216: i2s
       217: iload         11
       219: i2b
       220: iconst_0
       221: aload         7
       223: invokestatic  #159                // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer.access$createNode:(Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;IISBILext/mods/gameserver/geoengine/pathfinding/model/BlockType;)Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;
       226: invokeinterface #163,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       231: invokestatic  #169                // Method kotlin/coroutines/jvm/internal/Boxing.boxBoolean:(Z)Ljava/lang/Boolean;
       234: goto          443
       237: aload_0
       238: getfield      #18                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;
       241: invokestatic  #126                // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer.access$getGeoDataProvider$p:(Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;
       244: iload_3
       245: iload         5
       247: invokeinterface #151,  3          // InterfaceMethod ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider.getHeight:(II)S
       252: istore        10
       254: aload_0
       255: getfield      #18                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;
       258: invokestatic  #126                // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer.access$getGeoDataProvider$p:(Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;
       261: iload_3
       262: iload         5
       264: invokeinterface #155,  3          // InterfaceMethod ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider.getNswe:(II)B
       269: istore        11
       271: aload_2
       272: aload_0
       273: getfield      #18                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;
       276: iload_3
       277: iload         5
       279: iload         10
       281: i2s
       282: iload         11
       284: i2b
       285: iconst_0
       286: aload         7
       288: invokestatic  #159                // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer.access$createNode:(Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;IISBILext/mods/gameserver/geoengine/pathfinding/model/BlockType;)Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;
       291: invokeinterface #163,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       296: invokestatic  #169                // Method kotlin/coroutines/jvm/internal/Boxing.boxBoolean:(Z)Ljava/lang/Boolean;
       299: goto          443
       302: aload_0
       303: getfield      #18                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;
       306: invokestatic  #126                // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer.access$getGeoDataProvider$p:(Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;
       309: iload_3
       310: iload         5
       312: invokeinterface #173,  3          // InterfaceMethod ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider.getLayers:(II)Ljava/util/List;
       317: astore        10
       319: aload         10
       321: checkcast     #175                // class java/lang/Iterable
       324: astore        11
       326: aload_0
       327: getfield      #18                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;
       330: astore        12
       332: iconst_0
       333: istore        13
       335: iconst_0
       336: istore        14
       338: aload         11
       340: invokeinterface #179,  1          // InterfaceMethod java/lang/Iterable.iterator:()Ljava/util/Iterator;
       345: astore        15
       347: aload         15
       349: invokeinterface #185,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       354: ifeq          428
       357: aload         15
       359: invokeinterface #188,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       364: astore        16
       366: iload         14
       368: iinc          14, 1
       371: istore        17
       373: iload         17
       375: ifge          381
       378: invokestatic  #193                // Method kotlin/collections/CollectionsKt.throwIndexOverflow:()V
       381: iload         17
       383: aload         16
       385: checkcast     #195                // class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo
       388: astore        18
       390: istore        19
       392: iconst_0
       393: istore        20
       395: aload_2
       396: aload         12
       398: iload_3
       399: iload         5
       401: aload         18
       403: invokevirtual #198                // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo.getHeight:()S
       406: aload         18
       408: invokevirtual #201                // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo.getNswe:()B
       411: iload         19
       413: aload         7
       415: invokestatic  #159                // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer.access$createNode:(Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;IISBILext/mods/gameserver/geoengine/pathfinding/model/BlockType;)Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;
       418: invokeinterface #163,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       423: pop
       424: nop
       425: goto          347
       428: nop
       429: getstatic     #207                // Field kotlin/Unit.INSTANCE:Lkotlin/Unit;
       432: goto          443
       435: new           #209                // class kotlin/NoWhenBranchMatchedException
       438: dup
       439: invokespecial #210                // Method kotlin/NoWhenBranchMatchedException."<init>":()V
       442: athrow
       443: pop
       444: aload_0
       445: getfield      #26                 // Field $processed:Ljava/util/concurrent/atomic/AtomicInteger;
       448: invokevirtual #215                // Method java/util/concurrent/atomic/AtomicInteger.incrementAndGet:()I
       451: istore        8
       453: iload         8
       455: sipush        1000
       458: irem
       459: ifne          515
       462: bipush        10
       464: iload         8
       466: bipush        80
       468: imul
       469: aload_0
       470: getfield      #30                 // Field $totalCells:I
       473: idiv
       474: iadd
       475: istore        9
       477: aload_0
       478: getfield      #34                 // Field $onProgress:Lkotlin/jvm/functions/Function2;
       481: iload         8
       483: aload_0
       484: getfield      #30                 // Field $totalCells:I
       487: aload_0
       488: getfield      #38                 // Field $sourceInfo:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;
       491: invokevirtual #221                // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo.getPrimarySource:()Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;
       494: invokedynamic #233,  0            // InvokeDynamic #0:makeConcatWithConstants:(IILext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource;)Ljava/lang/String;
       499: iload         9
       501: bipush        85
       503: invokestatic  #239                // Method kotlin/ranges/RangesKt.coerceAtMost:(II)I
       506: invokestatic  #243                // Method kotlin/coroutines/jvm/internal/Boxing.boxInt:(I)Ljava/lang/Integer;
       509: invokeinterface #247,  3          // InterfaceMethod kotlin/jvm/functions/Function2.invoke:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       514: pop
       515: iinc          5, 1
       518: goto          88
       521: iinc          3, 1
       524: goto          64
       527: aload_2
       528: checkcast     #175                // class java/lang/Iterable
       531: astore_3
       532: aload_0
       533: getfield      #42                 // Field $nodeChannel:Lkotlinx/coroutines/channels/Channel;
       536: astore        4
       538: iconst_0
       539: istore        5
       541: aload_3
       542: invokeinterface #179,  1          // InterfaceMethod java/lang/Iterable.iterator:()Ljava/util/Iterator;
       547: astore        6
       549: aload         6
       551: invokeinterface #185,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       556: ifeq          730
       559: aload         6
       561: invokeinterface #188,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       566: astore        7
       568: aload         7
       570: checkcast     #249                // class ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode
       573: astore        8
       575: iconst_0
       576: istore        9
       578: aload         4
       580: aload         8
       582: aload_0
       583: aload_0
       584: aload_2
       585: invokestatic  #254                // Method kotlin/coroutines/jvm/internal/SpillingKt.nullOutSpilledVariable:(Ljava/lang/Object;)Ljava/lang/Object;
       588: putfield      #256                // Field L$0:Ljava/lang/Object;
       591: aload_0
       592: aload_3
       593: invokestatic  #254                // Method kotlin/coroutines/jvm/internal/SpillingKt.nullOutSpilledVariable:(Ljava/lang/Object;)Ljava/lang/Object;
       596: putfield      #258                // Field L$1:Ljava/lang/Object;
       599: aload_0
       600: aload         4
       602: putfield      #260                // Field L$2:Ljava/lang/Object;
       605: aload_0
       606: aload         6
       608: putfield      #262                // Field L$3:Ljava/lang/Object;
       611: aload_0
       612: aload         7
       614: invokestatic  #254                // Method kotlin/coroutines/jvm/internal/SpillingKt.nullOutSpilledVariable:(Ljava/lang/Object;)Ljava/lang/Object;
       617: putfield      #264                // Field L$4:Ljava/lang/Object;
       620: aload_0
       621: aload         8
       623: invokestatic  #254                // Method kotlin/coroutines/jvm/internal/SpillingKt.nullOutSpilledVariable:(Ljava/lang/Object;)Ljava/lang/Object;
       626: putfield      #266                // Field L$5:Ljava/lang/Object;
       629: aload_0
       630: iload         5
       632: putfield      #268                // Field I$0:I
       635: aload_0
       636: iload         9
       638: putfield      #270                // Field I$1:I
       641: aload_0
       642: iconst_1
       643: putfield      #92                 // Field label:I
       646: invokeinterface #276,  3          // InterfaceMethod kotlinx/coroutines/channels/Channel.send:(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
       651: dup
       652: aload         21
       654: if_acmpne     726
       657: aload         21
       659: areturn
       660: aload_0
       661: getfield      #270                // Field I$1:I
       664: istore        9
       666: aload_0
       667: getfield      #268                // Field I$0:I
       670: istore        5
       672: aload_0
       673: getfield      #266                // Field L$5:Ljava/lang/Object;
       676: checkcast     #249                // class ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode
       679: astore        8
       681: aload_0
       682: getfield      #264                // Field L$4:Ljava/lang/Object;
       685: astore        7
       687: aload_0
       688: getfield      #262                // Field L$3:Ljava/lang/Object;
       691: checkcast     #181                // class java/util/Iterator
       694: astore        6
       696: aload_0
       697: getfield      #260                // Field L$2:Ljava/lang/Object;
       700: checkcast     #272                // class kotlinx/coroutines/channels/Channel
       703: astore        4
       705: aload_0
       706: getfield      #258                // Field L$1:Ljava/lang/Object;
       709: checkcast     #175                // class java/lang/Iterable
       712: astore_3
       713: aload_0
       714: getfield      #256                // Field L$0:Ljava/lang/Object;
       717: checkcast     #105                // class java/util/List
       720: astore_2
       721: aload_1
       722: invokestatic  #98                 // Method kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
       725: aload_1
       726: pop
       727: goto          549
       730: nop
       731: getstatic     #207                // Field kotlin/Unit.INSTANCE:Lkotlin/Unit;
       734: areturn
       735: new           #278                // class java/lang/IllegalStateException
       738: dup
       739: ldc_w         #280                // String call to \'resume\' before \'invoke\' with coroutine
       742: invokespecial #283                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
       745: athrow
      StackMapTable: number_of_entries = 20
        frame_type = 255 /* full_frame */
          offset_delta = 32
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1, class java/lang/Object, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 31
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1, class java/lang/Object, class java/util/List, int, int, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 23
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1, class java/lang/Object, class java/util/List, int, int, int, int, top, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 31 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 51
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1, class java/lang/Object, class java/util/List, int, int, int, int, class ext/mods/gameserver/geoengine/pathfinding/model/BlockType, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 251 /* same_frame_extended */
          offset_delta = 64
        frame_type = 251 /* same_frame_extended */
          offset_delta = 64
        frame_type = 255 /* full_frame */
          offset_delta = 44
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1, class java/lang/Object, class java/util/List, int, int, int, int, class ext/mods/gameserver/geoengine/pathfinding/model/BlockType, top, top, class java/util/List, class java/lang/Iterable, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer, int, int, class java/util/Iterator, top, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 33
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1, class java/lang/Object, class java/util/List, int, int, int, int, class ext/mods/gameserver/geoengine/pathfinding/model/BlockType, top, top, class java/util/List, class java/lang/Iterable, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer, int, int, class java/util/Iterator, class java/lang/Object, int, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 46
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1, class java/lang/Object, class java/util/List, int, int, int, int, class ext/mods/gameserver/geoengine/pathfinding/model/BlockType, top, top, class java/util/List, class java/lang/Iterable, class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer, int, int, class java/util/Iterator, top, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 6
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1, class java/lang/Object, class java/util/List, int, int, int, int, class ext/mods/gameserver/geoengine/pathfinding/model/BlockType, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 71 /* same_locals_1_stack_item */
          stack = [ class java/lang/Object ]
        frame_type = 255 /* full_frame */
          offset_delta = 71
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1, class java/lang/Object, class java/util/List, int, int, int, int, top, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 5 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 5
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1, class java/lang/Object, class java/util/List, int, int, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 21
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1, class java/lang/Object, class java/util/List, class java/lang/Iterable, class kotlinx/coroutines/channels/Channel, int, class java/util/Iterator, top, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 110
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1, class java/lang/Object, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 65
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1, class java/lang/Object, class java/util/List, class java/lang/Iterable, class kotlinx/coroutines/channels/Channel, int, class java/util/Iterator, class java/lang/Object, class ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode, int, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = [ class java/lang/Object ]
        frame_type = 255 /* full_frame */
          offset_delta = 3
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1, class java/lang/Object, class java/util/List, class java/lang/Iterable, class kotlinx/coroutines/channels/Channel, int, class java/util/Iterator, top, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 4
          locals = [ class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1, class java/lang/Object, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, top, class java/lang/Object ]
          stack = []
      LineNumberTable:
        line 306: 3
        line 307: 36
        line 307: 46
        line 309: 47
        line 310: 70
        line 311: 95
        line 312: 113
        line 315: 120
        line 317: 137
        line 319: 172
        line 320: 189
        line 322: 206
        line 325: 237
        line 326: 254
        line 328: 271
        line 331: 302
        line 332: 319
        line 473: 335
        line 474: 338
        line 474: 383
        line 333: 395
        line 334: 396
        line 335: 398
        line 336: 401
        line 337: 406
        line 338: 411
        line 339: 413
        line 334: 415
        line 333: 418
        line 342: 424
        line 474: 425
        line 475: 428
        line 317: 435
        line 346: 444
        line 347: 453
        line 348: 462
        line 349: 477
        line 350: 481
        line 351: 499
        line 349: 509
        line 310: 515
        line 309: 521
        line 357: 527
        line 476: 541
        line 357: 578
        line 306: 657
        line 357: 726
        line 476: 727
        line 477: 730
        line 358: 731
        line 306: 735
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          189      42    10 height   S
          206      25    11  nswe   B
          254      42    10 height   S
          271      25    11  nswe   B
          395      30    20 $i$a$-forEachIndexed-GeoIndexer$indexRegion$3$chunkJobs$1$1$1   I
          392      33    19 layerIdx   I
          392      33    18 layer   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo;
          366      59    16 item$iv   Ljava/lang/Object;
          335      94    13 $i$f$forEachIndexed   I
          338      91    14 index$iv   I
          332      97    11 $this$forEachIndexed$iv   Ljava/lang/Iterable;
          319     110    10 layers   Ljava/util/List;
          477      38     9 percent   I
          137     378     7 blockType   Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
          453      62     8 count   I
           79     442     5  geoY   I
           55     472     3  geoX   I
          578      82     9 $i$a$-forEach-GeoIndexer$indexRegion$3$chunkJobs$1$1$2   I
          575      85     8    it   Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;
          568      92     7 element$iv   Ljava/lang/Object;
          541     119     5 $i$f$forEach   I
          538     122     3 $this$forEach$iv   Ljava/lang/Iterable;
           47     613     2 localNodes   Ljava/util/List;
            0     746     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1;
            0     746     1 $result   Ljava/lang/Object;
          721      14     2 localNodes   Ljava/util/List;
          713      18     3 $this$forEach$iv   Ljava/lang/Iterable;
          687      40     7 element$iv   Ljava/lang/Object;
          681      46     8    it   Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;
          672      59     5 $i$f$forEach   I
          666      61     9 $i$a$-forEach-GeoIndexer$indexRegion$3$chunkJobs$1$1$2   I

  public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object, kotlin.coroutines.Continuation<?>);
    descriptor: (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=11, locals=3, args_size=3
         0: new           #2                  // class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1
         3: dup
         4: aload_0
         5: getfield      #14                 // Field $chunk:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk;
         8: aload_0
         9: getfield      #18                 // Field this$0:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;
        12: aload_0
        13: getfield      #22                 // Field $hasConvDat:Z
        16: aload_0
        17: getfield      #26                 // Field $processed:Ljava/util/concurrent/atomic/AtomicInteger;
        20: aload_0
        21: getfield      #30                 // Field $totalCells:I
        24: aload_0
        25: getfield      #34                 // Field $onProgress:Lkotlin/jvm/functions/Function2;
        28: aload_0
        29: getfield      #38                 // Field $sourceInfo:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;
        32: aload_0
        33: getfield      #42                 // Field $nodeChannel:Lkotlinx/coroutines/channels/Channel;
        36: aload_2
        37: invokespecial #313                // Method "<init>":(Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk;Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;ZLjava/util/concurrent/atomic/AtomicInteger;ILkotlin/jvm/functions/Function2;Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo;Lkotlinx/coroutines/channels/Channel;Lkotlin/coroutines/Continuation;)V
        40: checkcast     #315                // class kotlin/coroutines/Continuation
        43: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      44     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1;
            0      44     1 value   Ljava/lang/Object;
            0      44     2 $completion   Lkotlin/coroutines/Continuation;
    Signature: #311                         // (Ljava/lang/Object;Lkotlin/coroutines/Continuation<*>;)Lkotlin/coroutines/Continuation<Lkotlin/Unit;>;

  public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>);
    descriptor: (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: aload_2
         3: invokevirtual #320                // Method create:(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
         6: checkcast     #2                  // class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1
         9: getstatic     #207                // Field kotlin/Unit.INSTANCE:Lkotlin/Unit;
        12: invokevirtual #322                // Method invokeSuspend:(Ljava/lang/Object;)Ljava/lang/Object;
        15: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1;
            0      16     1    p1   Lkotlinx/coroutines/CoroutineScope;
            0      16     2    p2   Lkotlin/coroutines/Continuation;
    Signature: #318                         // (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Lkotlin/Unit;>;)Ljava/lang/Object;

  public java.lang.Object invoke(java.lang.Object, java.lang.Object);
    descriptor: (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: checkcast     #327                // class kotlinx/coroutines/CoroutineScope
         5: aload_2
         6: checkcast     #315                // class kotlin/coroutines/Continuation
         9: invokevirtual #329                // Method invoke:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
        12: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1;
            0      13     1    p1   Ljava/lang/Object;
            0      13     2    p2   Ljava/lang/Object;
}
InnerClasses:
  public static final #348= #347 of #122; // DataSource=class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource of class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
  public static #349= #128 of #122;       // GeoDataProvider=class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider of class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
  public static final #350= #195 of #128; // LayerInfo=class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider$LayerInfo of class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider
  public static final #351= #217 of #122; // SourceInfo=class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo of class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
  static final #344;                      // class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3
  static final #2;                        // class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1
  public static final #352= #138 of #2;   // WhenMappings=class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1$WhenMappings of class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1
EnclosingMethod: #344.#321              // ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$indexRegion$3.invokeSuspend
Signature: #3                           // Lkotlin/coroutines/jvm/internal/SuspendLambda;Lkotlin/jvm/functions/Function2<Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation<-Lkotlin/Unit;>;Ljava/lang/Object;>;
SourceFile: "GeoIndexer.kt"
SourceDebugExtension:
  SMAP
  GeoIndexer.kt
  Kotlin
  *S Kotlin
  *F
  + 1 GeoIndexer.kt
  ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1
  + 2 _Collections.kt
  kotlin/collections/CollectionsKt___CollectionsKt
  *L
  1#1,472:1
  1924#2,3:473
  1915#2,2:476
  *S KotlinDebug
  *F
  + 1 GeoIndexer.kt
  ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1
  *L
  332#1:473,3
  357#1:476,2
  *E
RuntimeVisibleAnnotations:
  0: #62(#63=s#64,#65=[I#66],#67=[I#68],#69=[I#70,I#70,I#70,I#70,I#70,I#70],#71=[s#53,s#55,s#58,s#59,s#60,s#61],#72=[s#73,s#74,s#75,s#76,s#77,s#78],#79=s#51,#80=s#81,#82=I#83)
    kotlin.coroutines.jvm.internal.DebugMetadata(
      f="GeoIndexer.kt"
      l=[357]
      nl=[476]
      i=[0,0,0,0,0,0]
      s=["L$0","L$1","L$4","L$5","I$0","I$1"]
      n=["localNodes","$this$forEach$iv","element$iv","it","$i$f$forEach","$i$a$-forEach-GeoIndexer$indexRegion$3$chunkJobs$1$1$2"]
      m="invokeSuspend"
      c="ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$indexRegion$3$chunkJobs$1$1"
      v=2
    )
  1: #332(#333=[I#83,I#334,I#70],#335=I#334,#336=I#337,#338=[s#339],#340=[s#341,s#342,s#324])
    kotlin.Metadata(
      mv=[2,3,0]
      k=3
      xi=48
      d1=["\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"]
      d2=["<anonymous>","","Lkotlinx/coroutines/CoroutineScope;"]
    )
RuntimeInvisibleAnnotations:
  0: #353(#316=[s#354])
    kotlin.jvm.internal.SourceDebugExtension(
      value=["SMAP\nGeoIndexer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GeoIndexer.kt\next/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,472:1\n1924#2,3:473\n1915#2,2:476\n*S KotlinDebug\n*F\n+ 1 GeoIndexer.kt\next/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3$chunkJobs$1$1\n*L\n332#1:473,3\n357#1:476,2\n*E\n"]
    )
BootstrapMethods:
  0: #230 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #223 Processando células (\u0001/\u0001) [\u0001]
