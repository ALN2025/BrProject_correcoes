// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer
// File: ext\mods\gameserver\geoengine\pathfinding\generation\GeoIndexer.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer.class
  Last modified 9 de jul de 2026; size 10604 bytes
  MD5 checksum 364ee0cc4a4594cf551e6ed55b919c89
  Compiled from "GeoIndexer.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 1, methods: 14, attributes: 4
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
    #2 = Class              #1            // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
    #3 = Utf8               java/lang/Object
    #4 = Class              #3            // java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;)V
    #7 = Utf8               Lorg/jetbrains/annotations/NotNull;
    #8 = Utf8               ()V
    #9 = NameAndType        #5:#8         // "<init>":()V
   #10 = Methodref          #4.#9         // java/lang/Object."<init>":()V
   #11 = Utf8               geoDataProvider
   #12 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;
   #13 = NameAndType        #11:#12       // geoDataProvider:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;
   #14 = Fieldref           #2.#13        // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer.geoDataProvider:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;
   #15 = Utf8               this
   #16 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;
   #17 = Utf8               indexRegion
   #18 = Utf8               (IIILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
   #19 = Utf8               (IIILkotlin/jvm/functions/Function2<-Ljava/lang/String;-Ljava/lang/Integer;Lkotlin/Unit;>;Lkotlin/coroutines/Continuation<-Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult;>;)Ljava/lang/Object;
   #20 = Utf8               Lorg/jetbrains/annotations/Nullable;
   #21 = Utf8               kotlinx/coroutines/Dispatchers
   #22 = Class              #21           // kotlinx/coroutines/Dispatchers
   #23 = Utf8               getDefault
   #24 = Utf8               ()Lkotlinx/coroutines/CoroutineDispatcher;
   #25 = NameAndType        #23:#24       // getDefault:()Lkotlinx/coroutines/CoroutineDispatcher;
   #26 = Methodref          #22.#25       // kotlinx/coroutines/Dispatchers.getDefault:()Lkotlinx/coroutines/CoroutineDispatcher;
   #27 = Utf8               kotlin/coroutines/CoroutineContext
   #28 = Class              #27           // kotlin/coroutines/CoroutineContext
   #29 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3
   #30 = Class              #29           // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3
   #31 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;IILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V
   #32 = NameAndType        #5:#31        // "<init>":(Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;IILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V
   #33 = Methodref          #30.#32       // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3."<init>":(Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;IILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V
   #34 = Utf8               kotlin/jvm/functions/Function2
   #35 = Class              #34           // kotlin/jvm/functions/Function2
   #36 = Utf8               kotlinx/coroutines/BuildersKt
   #37 = Class              #36           // kotlinx/coroutines/BuildersKt
   #38 = Utf8               withContext
   #39 = Utf8               (Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
   #40 = NameAndType        #38:#39       // withContext:(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
   #41 = Methodref          #37.#40       // kotlinx/coroutines/BuildersKt.withContext:(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
   #42 = Utf8               regionX
   #43 = Utf8               I
   #44 = Utf8               regionY
   #45 = Utf8               parallelism
   #46 = Utf8               onProgress
   #47 = Utf8               Lkotlin/jvm/functions/Function2;
   #48 = Utf8               $completion
   #49 = Utf8               Lkotlin/coroutines/Continuation;
   #50 = Utf8               indexRegion$default
   #51 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;IIILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
   #52 = Utf8               java/lang/Runtime
   #53 = Class              #52           // java/lang/Runtime
   #54 = Utf8               getRuntime
   #55 = Utf8               ()Ljava/lang/Runtime;
   #56 = NameAndType        #54:#55       // getRuntime:()Ljava/lang/Runtime;
   #57 = Methodref          #53.#56       // java/lang/Runtime.getRuntime:()Ljava/lang/Runtime;
   #58 = Utf8               availableProcessors
   #59 = Utf8               ()I
   #60 = NameAndType        #58:#59       // availableProcessors:()I
   #61 = Methodref          #53.#60       // java/lang/Runtime.availableProcessors:()I
   #62 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #63 = MethodType         #62           //  (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #64 = Utf8               indexRegion$lambda$0
   #65 = Utf8               (Ljava/lang/String;I)Lkotlin/Unit;
   #66 = NameAndType        #64:#65       // indexRegion$lambda$0:(Ljava/lang/String;I)Lkotlin/Unit;
   #67 = Methodref          #2.#66        // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer.indexRegion$lambda$0:(Ljava/lang/String;I)Lkotlin/Unit;
   #68 = MethodHandle       6:#67         // REF_invokeStatic ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer.indexRegion$lambda$0:(Ljava/lang/String;I)Lkotlin/Unit;
   #69 = Utf8               (Ljava/lang/String;Ljava/lang/Integer;)Lkotlin/Unit;
   #70 = MethodType         #69           //  (Ljava/lang/String;Ljava/lang/Integer;)Lkotlin/Unit;
   #71 = Utf8               java/lang/invoke/LambdaMetafactory
   #72 = Class              #71           // java/lang/invoke/LambdaMetafactory
   #73 = Utf8               metafactory
   #74 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
   #75 = NameAndType        #73:#74       // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
   #76 = Methodref          #72.#75       // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
   #77 = MethodHandle       6:#76         // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
   #78 = Utf8               invoke
   #79 = Utf8               ()Lkotlin/jvm/functions/Function2;
   #80 = NameAndType        #78:#79       // invoke:()Lkotlin/jvm/functions/Function2;
   #81 = InvokeDynamic      #0:#80        // #0:invoke:()Lkotlin/jvm/functions/Function2;
   #82 = NameAndType        #17:#18       // indexRegion:(IIILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
   #83 = Methodref          #2.#82        // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer.indexRegion:(IIILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
   #84 = Utf8               generateChunks
   #85 = Utf8               (IIIII)Ljava/util/List;
   #86 = Utf8               (IIIII)Ljava/util/List<Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk;>;
   #87 = Utf8               java/util/ArrayList
   #88 = Class              #87           // java/util/ArrayList
   #89 = Methodref          #88.#9        // java/util/ArrayList."<init>":()V
   #90 = Utf8               java/util/List
   #91 = Class              #90           // java/util/List
   #92 = Utf8               kotlin/ranges/RangesKt
   #93 = Class              #92           // kotlin/ranges/RangesKt
   #94 = Utf8               until
   #95 = Utf8               (II)Lkotlin/ranges/IntRange;
   #96 = NameAndType        #94:#95       // until:(II)Lkotlin/ranges/IntRange;
   #97 = Methodref          #93.#96       // kotlin/ranges/RangesKt.until:(II)Lkotlin/ranges/IntRange;
   #98 = Utf8               kotlin/ranges/IntProgression
   #99 = Class              #98           // kotlin/ranges/IntProgression
  #100 = Utf8               step
  #101 = Utf8               (Lkotlin/ranges/IntProgression;I)Lkotlin/ranges/IntProgression;
  #102 = NameAndType        #100:#101     // step:(Lkotlin/ranges/IntProgression;I)Lkotlin/ranges/IntProgression;
  #103 = Methodref          #93.#102      // kotlin/ranges/RangesKt.step:(Lkotlin/ranges/IntProgression;I)Lkotlin/ranges/IntProgression;
  #104 = Utf8               getFirst
  #105 = NameAndType        #104:#59      // getFirst:()I
  #106 = Methodref          #99.#105      // kotlin/ranges/IntProgression.getFirst:()I
  #107 = Utf8               getLast
  #108 = NameAndType        #107:#59      // getLast:()I
  #109 = Methodref          #99.#108      // kotlin/ranges/IntProgression.getLast:()I
  #110 = Utf8               getStep
  #111 = NameAndType        #110:#59      // getStep:()I
  #112 = Methodref          #99.#111      // kotlin/ranges/IntProgression.getStep:()I
  #113 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk
  #114 = Class              #113          // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk
  #115 = Utf8               java/lang/Math
  #116 = Class              #115          // java/lang/Math
  #117 = Utf8               min
  #118 = Utf8               (II)I
  #119 = NameAndType        #117:#118     // min:(II)I
  #120 = Methodref          #116.#119     // java/lang/Math.min:(II)I
  #121 = Utf8               (IIII)V
  #122 = NameAndType        #5:#121       // "<init>":(IIII)V
  #123 = Methodref          #114.#122     // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk."<init>":(IIII)V
  #124 = Utf8               add
  #125 = Utf8               (Ljava/lang/Object;)Z
  #126 = NameAndType        #124:#125     // add:(Ljava/lang/Object;)Z
  #127 = InterfaceMethodref #91.#126      // java/util/List.add:(Ljava/lang/Object;)Z
  #128 = Utf8               y
  #129 = Utf8               x
  #130 = Utf8               chunks
  #131 = Utf8               Ljava/util/List;
  #132 = Utf8               baseX
  #133 = Utf8               baseY
  #134 = Utf8               maxX
  #135 = Utf8               maxY
  #136 = Utf8               chunkSize
  #137 = Utf8               createNode
  #138 = Utf8               (IISBILext/mods/gameserver/geoengine/pathfinding/model/BlockType;)Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;
  #139 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode
  #140 = Class              #139          // ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode
  #141 = Utf8               (IIISBILext/mods/gameserver/geoengine/pathfinding/model/BlockType;)V
  #142 = NameAndType        #5:#141       // "<init>":(IIISBILext/mods/gameserver/geoengine/pathfinding/model/BlockType;)V
  #143 = Methodref          #140.#142     // ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode."<init>":(IIISBILext/mods/gameserver/geoengine/pathfinding/model/BlockType;)V
  #144 = Utf8               geoX
  #145 = Utf8               geoY
  #146 = Utf8               height
  #147 = Utf8               S
  #148 = Utf8               nswe
  #149 = Utf8               B
  #150 = Utf8               layer
  #151 = Utf8               blockType
  #152 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
  #153 = Utf8               calculateJumpPoints
  #154 = Utf8               (Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;
  #155 = Utf8               (Ljava/util/List<Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;>;Lkotlin/jvm/functions/Function1<-Ljava/lang/Integer;Lkotlin/Unit;>;)Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;
  #156 = Utf8               ext/mods/gameserver/geoengine/pathfinding/core/jps/JumpPointGenerator
  #157 = Class              #156          // ext/mods/gameserver/geoengine/pathfinding/core/jps/JumpPointGenerator
  #158 = Utf8               (Ljava/util/List;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
  #159 = NameAndType        #5:#158       // "<init>":(Ljava/util/List;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
  #160 = Methodref          #157.#159     // ext/mods/gameserver/geoengine/pathfinding/core/jps/JumpPointGenerator."<init>":(Ljava/util/List;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
  #161 = Utf8               java/util/concurrent/ConcurrentHashMap
  #162 = Class              #161          // java/util/concurrent/ConcurrentHashMap
  #163 = Methodref          #162.#9       // java/util/concurrent/ConcurrentHashMap."<init>":()V
  #164 = Utf8               parallelStream
  #165 = Utf8               ()Ljava/util/stream/Stream;
  #166 = NameAndType        #164:#165     // parallelStream:()Ljava/util/stream/Stream;
  #167 = InterfaceMethodref #91.#166      // java/util/List.parallelStream:()Ljava/util/stream/Stream;
  #168 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #169 = MethodType         #168          //  (Ljava/lang/Object;)Ljava/lang/Object;
  #170 = Utf8               calculateJumpPoints$lambda$1
  #171 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/core/jps/JumpPointGenerator;Ljava/util/concurrent/ConcurrentHashMap;Lkotlin/jvm/functions/Function1;Ljava/util/List;Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;)Lkotlin/Unit;
  #172 = NameAndType        #170:#171     // calculateJumpPoints$lambda$1:(Lext/mods/gameserver/geoengine/pathfinding/core/jps/JumpPointGenerator;Ljava/util/concurrent/ConcurrentHashMap;Lkotlin/jvm/functions/Function1;Ljava/util/List;Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;)Lkotlin/Unit;
  #173 = Methodref          #2.#172       // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer.calculateJumpPoints$lambda$1:(Lext/mods/gameserver/geoengine/pathfinding/core/jps/JumpPointGenerator;Ljava/util/concurrent/ConcurrentHashMap;Lkotlin/jvm/functions/Function1;Ljava/util/List;Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;)Lkotlin/Unit;
  #174 = MethodHandle       6:#173        // REF_invokeStatic ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer.calculateJumpPoints$lambda$1:(Lext/mods/gameserver/geoengine/pathfinding/core/jps/JumpPointGenerator;Ljava/util/concurrent/ConcurrentHashMap;Lkotlin/jvm/functions/Function1;Ljava/util/List;Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;)Lkotlin/Unit;
  #175 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;)Lkotlin/Unit;
  #176 = MethodType         #175          //  (Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;)Lkotlin/Unit;
  #177 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/core/jps/JumpPointGenerator;Ljava/util/concurrent/ConcurrentHashMap;Lkotlin/jvm/functions/Function1;Ljava/util/List;)Lkotlin/jvm/functions/Function1;
  #178 = NameAndType        #78:#177      // invoke:(Lext/mods/gameserver/geoengine/pathfinding/core/jps/JumpPointGenerator;Ljava/util/concurrent/ConcurrentHashMap;Lkotlin/jvm/functions/Function1;Ljava/util/List;)Lkotlin/jvm/functions/Function1;
  #179 = InvokeDynamic      #1:#178       // #1:invoke:(Lext/mods/gameserver/geoengine/pathfinding/core/jps/JumpPointGenerator;Ljava/util/concurrent/ConcurrentHashMap;Lkotlin/jvm/functions/Function1;Ljava/util/List;)Lkotlin/jvm/functions/Function1;
  #180 = Utf8               (Ljava/lang/Object;)V
  #181 = MethodType         #180          //  (Ljava/lang/Object;)V
  #182 = Utf8               calculateJumpPoints$lambda$2
  #183 = Utf8               (Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
  #184 = NameAndType        #182:#183     // calculateJumpPoints$lambda$2:(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
  #185 = Methodref          #2.#184       // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer.calculateJumpPoints$lambda$2:(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
  #186 = MethodHandle       6:#185        // REF_invokeStatic ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer.calculateJumpPoints$lambda$2:(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
  #187 = Utf8               accept
  #188 = Utf8               (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Consumer;
  #189 = NameAndType        #187:#188     // accept:(Lkotlin/jvm/functions/Function1;)Ljava/util/function/Consumer;
  #190 = InvokeDynamic      #2:#189       // #2:accept:(Lkotlin/jvm/functions/Function1;)Ljava/util/function/Consumer;
  #191 = Utf8               java/util/stream/Stream
  #192 = Class              #191          // java/util/stream/Stream
  #193 = Utf8               forEach
  #194 = Utf8               (Ljava/util/function/Consumer;)V
  #195 = NameAndType        #193:#194     // forEach:(Ljava/util/function/Consumer;)V
  #196 = InterfaceMethodref #192.#195     // java/util/stream/Stream.forEach:(Ljava/util/function/Consumer;)V
  #197 = Utf8               java/util/Map
  #198 = Class              #197          // java/util/Map
  #199 = Utf8               kotlin/collections/MapsKt
  #200 = Class              #199          // kotlin/collections/MapsKt
  #201 = Utf8               toMap
  #202 = Utf8               (Ljava/util/Map;)Ljava/util/Map;
  #203 = NameAndType        #201:#202     // toMap:(Ljava/util/Map;)Ljava/util/Map;
  #204 = Methodref          #200.#203     // kotlin/collections/MapsKt.toMap:(Ljava/util/Map;)Ljava/util/Map;
  #205 = Utf8               generator
  #206 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/core/jps/JumpPointGenerator;
  #207 = Utf8               results
  #208 = Utf8               Ljava/util/concurrent/ConcurrentHashMap;
  #209 = Utf8               nodes
  #210 = Utf8               Lkotlin/jvm/functions/Function1;
  #211 = Utf8               calculateJumpPoints$default
  #212 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;Ljava/util/List;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/util/Map;
  #213 = Utf8               calculateJumpPoints$lambda$0
  #214 = Utf8               (I)Lkotlin/Unit;
  #215 = NameAndType        #213:#214     // calculateJumpPoints$lambda$0:(I)Lkotlin/Unit;
  #216 = Methodref          #2.#215       // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer.calculateJumpPoints$lambda$0:(I)Lkotlin/Unit;
  #217 = MethodHandle       6:#216        // REF_invokeStatic ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer.calculateJumpPoints$lambda$0:(I)Lkotlin/Unit;
  #218 = Utf8               (Ljava/lang/Integer;)Lkotlin/Unit;
  #219 = MethodType         #218          //  (Ljava/lang/Integer;)Lkotlin/Unit;
  #220 = Utf8               ()Lkotlin/jvm/functions/Function1;
  #221 = NameAndType        #78:#220      // invoke:()Lkotlin/jvm/functions/Function1;
  #222 = InvokeDynamic      #3:#221       // #3:invoke:()Lkotlin/jvm/functions/Function1;
  #223 = NameAndType        #153:#154     // calculateJumpPoints:(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;
  #224 = Methodref          #2.#223       // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer.calculateJumpPoints:(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;
  #225 = Utf8               kotlin/Unit
  #226 = Class              #225          // kotlin/Unit
  #227 = Utf8               INSTANCE
  #228 = Utf8               Lkotlin/Unit;
  #229 = NameAndType        #227:#228     // INSTANCE:Lkotlin/Unit;
  #230 = Fieldref           #226.#229     // kotlin/Unit.INSTANCE:Lkotlin/Unit;
  #231 = Utf8               it
  #232 = Utf8               isWalkable
  #233 = Utf8               ()Z
  #234 = NameAndType        #232:#233     // isWalkable:()Z
  #235 = Methodref          #140.#234     // ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode.isWalkable:()Z
  #236 = Utf8               calculateJpsDistances
  #237 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;)I
  #238 = NameAndType        #236:#237     // calculateJpsDistances:(Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;)I
  #239 = Methodref          #157.#238     // ext/mods/gameserver/geoengine/pathfinding/core/jps/JumpPointGenerator.calculateJpsDistances:(Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;)I
  #240 = Utf8               getId
  #241 = NameAndType        #240:#59      // getId:()I
  #242 = Methodref          #140.#241     // ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode.getId:()I
  #243 = Utf8               java/lang/Integer
  #244 = Class              #243          // java/lang/Integer
  #245 = Utf8               valueOf
  #246 = Utf8               (I)Ljava/lang/Integer;
  #247 = NameAndType        #245:#246     // valueOf:(I)Ljava/lang/Integer;
  #248 = Methodref          #244.#247     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #249 = Utf8               put
  #250 = NameAndType        #249:#62      // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #251 = InterfaceMethodref #198.#250     // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #252 = Utf8               size
  #253 = NameAndType        #252:#59      // size:()I
  #254 = InterfaceMethodref #91.#253      // java/util/List.size:()I
  #255 = Utf8               coerceAtMost
  #256 = NameAndType        #255:#118     // coerceAtMost:(II)I
  #257 = Methodref          #93.#256      // kotlin/ranges/RangesKt.coerceAtMost:(II)I
  #258 = Utf8               kotlin/jvm/functions/Function1
  #259 = Class              #258          // kotlin/jvm/functions/Function1
  #260 = NameAndType        #78:#168      // invoke:(Ljava/lang/Object;)Ljava/lang/Object;
  #261 = InterfaceMethodref #259.#260     // kotlin/jvm/functions/Function1.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
  #262 = Utf8               packedDistances
  #263 = Utf8               $generator
  #264 = Utf8               $results
  #265 = Utf8               $onProgress
  #266 = Utf8               $nodes
  #267 = Utf8               node
  #268 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;
  #269 = Utf8               $tmp0
  #270 = Utf8               p0
  #271 = Utf8               Ljava/lang/Object;
  #272 = Utf8               access$getGeoDataProvider$p
  #273 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;
  #274 = Utf8               $this
  #275 = Utf8               access$generateChunks
  #276 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;IIIII)Ljava/util/List;
  #277 = NameAndType        #84:#85       // generateChunks:(IIIII)Ljava/util/List;
  #278 = Methodref          #2.#277       // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer.generateChunks:(IIIII)Ljava/util/List;
  #279 = Utf8               access$createNode
  #280 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;IISBILext/mods/gameserver/geoengine/pathfinding/model/BlockType;)Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;
  #281 = NameAndType        #137:#138     // createNode:(IISBILext/mods/gameserver/geoengine/pathfinding/model/BlockType;)Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;
  #282 = Methodref          #2.#281       // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer.createNode:(IISBILext/mods/gameserver/geoengine/pathfinding/model/BlockType;)Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;
  #283 = Utf8               Lkotlin/Metadata;
  #284 = Utf8               mv
  #285 = Integer            2
  #286 = Integer            3
  #287 = Integer            0
  #288 = Utf8               k
  #289 = Integer            1
  #290 = Utf8               xi
  #291 = Integer            48
  #292 = Utf8               d1
  #293 = Utf8               \u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0007()*+,-.B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005JD\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\u001a\b\u0002\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f0\rH\u0086@¢\u0006\u0002\u0010\u0010J6\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0002J8\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020#H\u0002J6\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0%2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00122\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f0\'R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006/
  #294 = Utf8               d2
  #295 = Utf8
  #296 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult;
  #297 = Utf8               Lkotlin/Function2;
  #298 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk;
  #299 = Utf8               Lkotlin/Function1;
  #300 = Utf8               IndexationResult
  #301 = Utf8               SourceInfo
  #302 = Utf8               DataSource
  #303 = Utf8               GeoDataProvider
  #304 = Utf8               MultiSourceGeoProvider
  #305 = Utf8               ConvDatFile
  #306 = Utf8               Chunk
  #307 = Utf8               Brproject
  #308 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$ConvDatFile
  #309 = Class              #308          // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$ConvDatFile
  #310 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource
  #311 = Class              #310          // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource
  #312 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider
  #313 = Class              #312          // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider
  #314 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult
  #315 = Class              #314          // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult
  #316 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$MultiSourceGeoProvider
  #317 = Class              #316          // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$MultiSourceGeoProvider
  #318 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo
  #319 = Class              #318          // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo
  #320 = Utf8               GeoIndexer.kt
  #321 = Utf8               RuntimeInvisibleAnnotations
  #322 = Utf8               Code
  #323 = Utf8               LineNumberTable
  #324 = Utf8               LocalVariableTable
  #325 = Utf8               RuntimeInvisibleParameterAnnotations
  #326 = Utf8               Signature
  #327 = Utf8               StackMapTable
  #328 = Utf8               InnerClasses
  #329 = Utf8               SourceFile
  #330 = Utf8               RuntimeVisibleAnnotations
  #331 = Utf8               BootstrapMethods
{
  public ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer(ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$GeoDataProvider);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokespecial #10                 // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #14                 // Field geoDataProvider:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;
         9: return
      LineNumberTable:
        line 37: 0
        line 38: 4
        line 37: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;
            0      10     1 geoDataProvider   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #7()
          org.jetbrains.annotations.NotNull

  public final java.lang.Object indexRegion(int, int, int, kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Integer, kotlin.Unit>, kotlin.coroutines.Continuation<? super ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$IndexationResult>);
    descriptor: (IIILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=8, locals=6, args_size=6
         0: invokestatic  #26                 // Method kotlinx/coroutines/Dispatchers.getDefault:()Lkotlinx/coroutines/CoroutineDispatcher;
         3: checkcast     #28                 // class kotlin/coroutines/CoroutineContext
         6: new           #30                 // class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3
         9: dup
        10: aload_0
        11: iload_1
        12: iload_2
        13: aload         4
        15: aconst_null
        16: invokespecial #33                 // Method ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3."<init>":(Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;IILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V
        19: checkcast     #35                 // class kotlin/jvm/functions/Function2
        22: aload         5
        24: invokestatic  #41                 // Method kotlinx/coroutines/BuildersKt.withContext:(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
        27: areturn
      LineNumberTable:
        line 247: 0
        line 386: 27
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;
            0      28     1 regionX   I
            0      28     2 regionY   I
            0      28     3 parallelism   I
            0      28     4 onProgress   Lkotlin/jvm/functions/Function2;
            0      28     5 $completion   Lkotlin/coroutines/Continuation;
    Signature: #19                          // (IIILkotlin/jvm/functions/Function2<-Ljava/lang/String;-Ljava/lang/Integer;Lkotlin/Unit;>;Lkotlin/coroutines/Continuation<-Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult;>;)Ljava/lang/Object;
    RuntimeInvisibleAnnotations:
      0: #20()
        org.jetbrains.annotations.Nullable
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
      parameter 1:
      parameter 2:
      parameter 3:
        0: #7()
          org.jetbrains.annotations.NotNull
      parameter 4:
        0: #7()
          org.jetbrains.annotations.NotNull

  public static java.lang.Object indexRegion$default(ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer, int, int, int, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation, int, java.lang.Object);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;IIILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    flags: (0x1009) ACC_PUBLIC, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=6, locals=8, args_size=8
         0: iload         6
         2: iconst_4
         3: iand
         4: ifeq          16
         7: invokestatic  #57                 // Method java/lang/Runtime.getRuntime:()Ljava/lang/Runtime;
        10: invokevirtual #61                 // Method java/lang/Runtime.availableProcessors:()I
        13: iconst_2
        14: idiv
        15: istore_3
        16: iload         6
        18: bipush        8
        20: iand
        21: ifeq          31
        24: invokedynamic #81,  0             // InvokeDynamic #0:invoke:()Lkotlin/jvm/functions/Function2;
        29: astore        4
        31: aload_0
        32: iload_1
        33: iload_2
        34: iload_3
        35: aload         4
        37: aload         5
        39: invokevirtual #83                 // Method indexRegion:(IIILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
        42: areturn
      StackMapTable: number_of_entries = 2
        frame_type = 16 /* same */
        frame_type = 14 /* same */
      LineNumberTable:
        line 242: 0
        line 245: 7
        line 242: 16
        line 246: 24
        line 242: 31

  public final java.util.Map<java.lang.Integer, java.lang.Integer> calculateJumpPoints(java.util.List<ext.mods.gameserver.geoengine.pathfinding.model.IndexedNode>, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit>);
    descriptor: (Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=7, locals=5, args_size=3
         0: new           #157                // class ext/mods/gameserver/geoengine/pathfinding/core/jps/JumpPointGenerator
         3: dup
         4: aload_1
         5: iconst_0
         6: iconst_0
         7: bipush        6
         9: aconst_null
        10: invokespecial #160                // Method ext/mods/gameserver/geoengine/pathfinding/core/jps/JumpPointGenerator."<init>":(Ljava/util/List;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
        13: astore_3
        14: new           #162                // class java/util/concurrent/ConcurrentHashMap
        17: dup
        18: invokespecial #163                // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
        21: astore        4
        23: aload_1
        24: invokeinterface #167,  1          // InterfaceMethod java/util/List.parallelStream:()Ljava/util/stream/Stream;
        29: aload_3
        30: aload         4
        32: aload_2
        33: aload_1
        34: invokedynamic #179,  0            // InvokeDynamic #1:invoke:(Lext/mods/gameserver/geoengine/pathfinding/core/jps/JumpPointGenerator;Ljava/util/concurrent/ConcurrentHashMap;Lkotlin/jvm/functions/Function1;Ljava/util/List;)Lkotlin/jvm/functions/Function1;
        39: invokedynamic #190,  0            // InvokeDynamic #2:accept:(Lkotlin/jvm/functions/Function1;)Ljava/util/function/Consumer;
        44: invokeinterface #196,  2          // InterfaceMethod java/util/stream/Stream.forEach:(Ljava/util/function/Consumer;)V
        49: aload         4
        51: checkcast     #198                // class java/util/Map
        54: invokestatic  #204                // Method kotlin/collections/MapsKt.toMap:(Ljava/util/Map;)Ljava/util/Map;
        57: areturn
      LineNumberTable:
        line 431: 0
        line 432: 14
        line 434: 23
        line 445: 49
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           14      44     3 generator   Lext/mods/gameserver/geoengine/pathfinding/core/jps/JumpPointGenerator;
           23      35     4 results   Ljava/util/concurrent/ConcurrentHashMap;
            0      58     0  this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;
            0      58     1 nodes   Ljava/util/List;
            0      58     2 onProgress   Lkotlin/jvm/functions/Function1;
    Signature: #155                         // (Ljava/util/List<Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;>;Lkotlin/jvm/functions/Function1<-Ljava/lang/Integer;Lkotlin/Unit;>;)Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;
    RuntimeInvisibleAnnotations:
      0: #7()
        org.jetbrains.annotations.NotNull
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #7()
          org.jetbrains.annotations.NotNull
      parameter 1:
        0: #7()
          org.jetbrains.annotations.NotNull

  public static java.util.Map calculateJumpPoints$default(ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer, java.util.List, kotlin.jvm.functions.Function1, int, java.lang.Object);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;Ljava/util/List;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/util/Map;
    flags: (0x1009) ACC_PUBLIC, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=3, locals=5, args_size=5
         0: iload_3
         1: iconst_2
         2: iand
         3: ifeq          12
         6: invokedynamic #222,  0            // InvokeDynamic #3:invoke:()Lkotlin/jvm/functions/Function1;
        11: astore_2
        12: aload_0
        13: aload_1
        14: aload_2
        15: invokevirtual #224                // Method calculateJumpPoints:(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;
        18: areturn
      StackMapTable: number_of_entries = 1
        frame_type = 12 /* same */
      LineNumberTable:
        line 427: 0
        line 429: 6
        line 427: 12

  public static final ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$GeoDataProvider access$getGeoDataProvider$p(ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;
    flags: (0x1019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #14                 // Field geoDataProvider:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;
         4: areturn
      LineNumberTable:
        line 37: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0 $this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;

  public static final java.util.List access$generateChunks(ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer, int, int, int, int, int);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;IIIII)Ljava/util/List;
    flags: (0x1019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC
    Code:
      stack=6, locals=6, args_size=6
         0: aload_0
         1: iload_1
         2: iload_2
         3: iload_3
         4: iload         4
         6: iload         5
         8: invokespecial #278                // Method generateChunks:(IIIII)Ljava/util/List;
        11: areturn
      LineNumberTable:
        line 37: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0 $this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;
            0      12     1 baseX   I
            0      12     2 baseY   I
            0      12     3  maxX   I
            0      12     4  maxY   I
            0      12     5 chunkSize   I

  public static final ext.mods.gameserver.geoengine.pathfinding.model.IndexedNode access$createNode(ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer, int, int, short, byte, int, ext.mods.gameserver.geoengine.pathfinding.model.BlockType);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;IISBILext/mods/gameserver/geoengine/pathfinding/model/BlockType;)Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;
    flags: (0x1019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC
    Code:
      stack=7, locals=7, args_size=7
         0: aload_0
         1: iload_1
         2: iload_2
         3: iload_3
         4: iload         4
         6: iload         5
         8: aload         6
        10: invokespecial #282                // Method createNode:(IISBILext/mods/gameserver/geoengine/pathfinding/model/BlockType;)Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;
        13: areturn
      LineNumberTable:
        line 37: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0 $this   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;
            0      14     1  geoX   I
            0      14     2  geoY   I
            0      14     3 height   S
            0      14     4  nswe   B
            0      14     5 layer   I
            0      14     6 blockType   Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;
}
InnerClasses:
  public static final #305= #309 of #2;   // ConvDatFile=class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$ConvDatFile of class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
  public static final #302= #311 of #2;   // DataSource=class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$DataSource of class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
  public static #303= #313 of #2;         // GeoDataProvider=class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider of class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
  public static final #300= #315 of #2;   // IndexationResult=class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult of class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
  public static #304= #317 of #2;         // MultiSourceGeoProvider=class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$MultiSourceGeoProvider of class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
  public static final #301= #319 of #2;   // SourceInfo=class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$SourceInfo of class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
  static final #30;                       // class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$indexRegion$3
SourceFile: "GeoIndexer.kt"
RuntimeVisibleAnnotations:
  0: #283(#284=[I#285,I#286,I#287],#288=I#289,#290=I#291,#292=[s#293],#294=[s#16,s#295,s#11,s#12,s#5,s#6,s#17,s#296,s#42,s#295,s#44,s#45,s#46,s#297,s#295,s#295,s#18,s#84,s#295,s#298,s#132,s#133,s#134,s#135,s#136,s#137,s#268,s#144,s#145,s#146,s#295,s#148,s#295,s#150,s#151,s#152,s#153,s#295,s#209,s#299,s#300,s#301,s#302,s#303,s#304,s#305,s#306,s#307])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0007()*+,-.B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005JD\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\u001a\b\u0002\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f0\rH\u0086@¢\u0006\u0002\u0010\u0010J6\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0002J8\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020#H\u0002J6\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0%2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00122\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f0\'R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006/"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;","","geoDataProvider","Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;","<init>","(Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;)V","indexRegion","Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$IndexationResult;","regionX","","regionY","parallelism","onProgress","Lkotlin/Function2;","","","(IIILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;","generateChunks","","Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$Chunk;","baseX","baseY","maxX","maxY","chunkSize","createNode","Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;","geoX","geoY","height","","nswe","","layer","blockType","Lext/mods/gameserver/geoengine/pathfinding/model/BlockType;","calculateJumpPoints","","nodes","Lkotlin/Function1;","IndexationResult","SourceInfo","DataSource","GeoDataProvider","MultiSourceGeoProvider","ConvDatFile","Chunk","Brproject"]
    )
BootstrapMethods:
  0: #77 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #63 (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      #68 REF_invokeStatic ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer.indexRegion$lambda$0:(Ljava/lang/String;I)Lkotlin/Unit;
      #70 (Ljava/lang/String;Ljava/lang/Integer;)Lkotlin/Unit;
  1: #77 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #169 (Ljava/lang/Object;)Ljava/lang/Object;
      #174 REF_invokeStatic ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer.calculateJumpPoints$lambda$1:(Lext/mods/gameserver/geoengine/pathfinding/core/jps/JumpPointGenerator;Ljava/util/concurrent/ConcurrentHashMap;Lkotlin/jvm/functions/Function1;Ljava/util/List;Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;)Lkotlin/Unit;
      #176 (Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;)Lkotlin/Unit;
  2: #77 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #181 (Ljava/lang/Object;)V
      #186 REF_invokeStatic ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer.calculateJumpPoints$lambda$2:(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
      #181 (Ljava/lang/Object;)V
  3: #77 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #169 (Ljava/lang/Object;)Ljava/lang/Object;
      #217 REF_invokeStatic ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer.calculateJumpPoints$lambda$0:(I)Lkotlin/Unit;
      #219 (Ljava/lang/Integer;)Lkotlin/Unit;
