// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.native.NativeStorage
// File: ext\mods\gameserver\geoengine\pathfinding\native\NativeStorage.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage.class
  Last modified 9 de jul de 2026; size 11097 bytes
  MD5 checksum 1217854a0c4688d755eafe4c89d68551
  Compiled from "NativeStorage.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.native.NativeStorage implements java.lang.AutoCloseable
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage
  super_class: #4                         // java/lang/Object
  interfaces: 1, fields: 9, methods: 23, attributes: 4
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage
    #2 = Class              #1            // ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage
    #3 = Utf8               java/lang/Object
    #4 = Class              #3            // java/lang/Object
    #5 = Utf8               java/lang/AutoCloseable
    #6 = Class              #5            // java/lang/AutoCloseable
    #7 = Utf8               <init>
    #8 = Utf8               (Ljava/lang/foreign/Arena;Ljava/lang/foreign/MemorySegment;Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;Ljava/nio/channels/FileChannel;)V
    #9 = Utf8               ()V
   #10 = NameAndType        #7:#9         // "<init>":()V
   #11 = Methodref          #4.#10        // java/lang/Object."<init>":()V
   #12 = Utf8               arena
   #13 = Utf8               Ljava/lang/foreign/Arena;
   #14 = NameAndType        #12:#13       // arena:Ljava/lang/foreign/Arena;
   #15 = Fieldref           #2.#14        // ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage.arena:Ljava/lang/foreign/Arena;
   #16 = Utf8               segment
   #17 = Utf8               Ljava/lang/foreign/MemorySegment;
   #18 = NameAndType        #16:#17       // segment:Ljava/lang/foreign/MemorySegment;
   #19 = Fieldref           #2.#18        // ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage.segment:Ljava/lang/foreign/MemorySegment;
   #20 = Utf8               header
   #21 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;
   #22 = NameAndType        #20:#21       // header:Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;
   #23 = Fieldref           #2.#22        // ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage.header:Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;
   #24 = Utf8               channel
   #25 = Utf8               Ljava/nio/channels/FileChannel;
   #26 = NameAndType        #24:#25       // channel:Ljava/nio/channels/FileChannel;
   #27 = Fieldref           #2.#26        // ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage.channel:Ljava/nio/channels/FileChannel;
   #28 = Utf8               this
   #29 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
   #30 = Utf8               (Ljava/lang/foreign/Arena;Ljava/lang/foreign/MemorySegment;Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;Ljava/nio/channels/FileChannel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
   #31 = NameAndType        #7:#8         // "<init>":(Ljava/lang/foreign/Arena;Ljava/lang/foreign/MemorySegment;Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;Ljava/nio/channels/FileChannel;)V
   #32 = Methodref          #2.#31        // ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage."<init>":(Ljava/lang/foreign/Arena;Ljava/lang/foreign/MemorySegment;Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;Ljava/nio/channels/FileChannel;)V
   #33 = Utf8               getArena
   #34 = Utf8               ()Ljava/lang/foreign/Arena;
   #35 = Utf8               Lorg/jetbrains/annotations/NotNull;
   #36 = Utf8               getSegment
   #37 = Utf8               ()Ljava/lang/foreign/MemorySegment;
   #38 = Utf8               getHeader
   #39 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;
   #40 = Utf8               getNodeCount
   #41 = Utf8               ()I
   #42 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader
   #43 = Class              #42           // ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader
   #44 = NameAndType        #40:#41       // getNodeCount:()I
   #45 = Methodref          #43.#44       // ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader.getNodeCount:()I
   #46 = Utf8               getMappedSize
   #47 = Utf8               ()J
   #48 = Utf8               java/lang/foreign/MemorySegment
   #49 = Class              #48           // java/lang/foreign/MemorySegment
   #50 = Utf8               byteSize
   #51 = NameAndType        #50:#47       // byteSize:()J
   #52 = InterfaceMethodref #49.#51       // java/lang/foreign/MemorySegment.byteSize:()J
   #53 = Utf8               getNode
   #54 = Utf8               (I)Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;
   #55 = Utf8               java/lang/IndexOutOfBoundsException
   #56 = Class              #55           // java/lang/IndexOutOfBoundsException
   #57 = Utf8               NodeId \u0001 fora do range [0, \u0001)
   #58 = String             #57           // NodeId \u0001 fora do range [0, \u0001)
   #59 = Utf8               java/lang/invoke/StringConcatFactory
   #60 = Class              #59           // java/lang/invoke/StringConcatFactory
   #61 = Utf8               makeConcatWithConstants
   #62 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #63 = NameAndType        #61:#62       // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #64 = Methodref          #60.#63       // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #65 = MethodHandle       6:#64         // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #66 = Utf8               (II)Ljava/lang/String;
   #67 = NameAndType        #61:#66       // makeConcatWithConstants:(II)Ljava/lang/String;
   #68 = InvokeDynamic      #0:#67        // #0:makeConcatWithConstants:(II)Ljava/lang/String;
   #69 = Utf8               (Ljava/lang/String;)V
   #70 = NameAndType        #7:#69        // "<init>":(Ljava/lang/String;)V
   #71 = Methodref          #56.#70       // java/lang/IndexOutOfBoundsException."<init>":(Ljava/lang/String;)V
   #72 = Utf8               getIndexOffset
   #73 = NameAndType        #72:#47       // getIndexOffset:()J
   #74 = Methodref          #43.#73       // ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader.getIndexOffset:()J
   #75 = Long               32l
   #77 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/PathNode
   #78 = Class              #77           // ext/mods/gameserver/geoengine/pathfinding/model/PathNode
   #79 = Utf8               Companion
   #80 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/PathNode$Companion;
   #81 = NameAndType        #79:#80       // Companion:Lext/mods/gameserver/geoengine/pathfinding/model/PathNode$Companion;
   #82 = Fieldref           #78.#81       // ext/mods/gameserver/geoengine/pathfinding/model/PathNode.Companion:Lext/mods/gameserver/geoengine/pathfinding/model/PathNode$Companion;
   #83 = Utf8               asSlice
   #84 = Utf8               (JJ)Ljava/lang/foreign/MemorySegment;
   #85 = NameAndType        #83:#84       // asSlice:(JJ)Ljava/lang/foreign/MemorySegment;
   #86 = InterfaceMethodref #49.#85       // java/lang/foreign/MemorySegment.asSlice:(JJ)Ljava/lang/foreign/MemorySegment;
   #87 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/PathNode$Companion
   #88 = Class              #87           // ext/mods/gameserver/geoengine/pathfinding/model/PathNode$Companion
   #89 = Utf8               fromMemory
   #90 = Utf8               (Ljava/lang/foreign/MemorySegment;I)Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;
   #91 = NameAndType        #89:#90       // fromMemory:(Ljava/lang/foreign/MemorySegment;I)Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;
   #92 = Methodref          #88.#91       // ext/mods/gameserver/geoengine/pathfinding/model/PathNode$Companion.fromMemory:(Ljava/lang/foreign/MemorySegment;I)Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;
   #93 = Utf8               offset
   #94 = Utf8               J
   #95 = Utf8               nodeId
   #96 = Utf8               I
   #97 = Utf8               getNodeSegment
   #98 = Utf8               (I)Ljava/lang/foreign/MemorySegment;
   #99 = Utf8               forEachNode
  #100 = Utf8               (Lkotlin/jvm/functions/Function2;)V
  #101 = Utf8               (Lkotlin/jvm/functions/Function2<-Ljava/lang/Integer;-Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;Lkotlin/Unit;>;)V
  #102 = Utf8               java/lang/IllegalStateException
  #103 = Class              #102          // java/lang/IllegalStateException
  #104 = Utf8               forEachNode iria acessar bytes além do limite. IndexEnd: \u0001, FileSize: \u0001
  #105 = String             #104          // forEachNode iria acessar bytes além do limite. IndexEnd: \u0001, FileSize: \u0001
  #106 = Utf8               (JJ)Ljava/lang/String;
  #107 = NameAndType        #61:#106      // makeConcatWithConstants:(JJ)Ljava/lang/String;
  #108 = InvokeDynamic      #1:#107       // #1:makeConcatWithConstants:(JJ)Ljava/lang/String;
  #109 = Methodref          #103.#70      // java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
  #110 = Utf8               java/lang/Integer
  #111 = Class              #110          // java/lang/Integer
  #112 = Utf8               valueOf
  #113 = Utf8               (I)Ljava/lang/Integer;
  #114 = NameAndType        #112:#113     // valueOf:(I)Ljava/lang/Integer;
  #115 = Methodref          #111.#114     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #116 = Utf8               kotlin/jvm/functions/Function2
  #117 = Class              #116          // kotlin/jvm/functions/Function2
  #118 = Utf8               invoke
  #119 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #120 = NameAndType        #118:#119     // invoke:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #121 = InterfaceMethodref #117.#120     // kotlin/jvm/functions/Function2.invoke:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #122 = Utf8               node
  #123 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;
  #124 = Utf8               i
  #125 = Utf8               maxOffset
  #126 = Utf8               action
  #127 = Utf8               Lkotlin/jvm/functions/Function2;
  #128 = Utf8               forEachNodeParallel
  #129 = Utf8               (ILkotlin/jvm/functions/Function2;)V
  #130 = Utf8               (ILkotlin/jvm/functions/Function2<-Ljava/lang/Integer;-Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;Lkotlin/Unit;>;)V
  #131 = Utf8               kotlin/ranges/RangesKt
  #132 = Class              #131          // kotlin/ranges/RangesKt
  #133 = Utf8               until
  #134 = Utf8               (II)Lkotlin/ranges/IntRange;
  #135 = NameAndType        #133:#134     // until:(II)Lkotlin/ranges/IntRange;
  #136 = Methodref          #132.#135     // kotlin/ranges/RangesKt.until:(II)Lkotlin/ranges/IntRange;
  #137 = Utf8               java/lang/Iterable
  #138 = Class              #137          // java/lang/Iterable
  #139 = Utf8               kotlin/collections/CollectionsKt
  #140 = Class              #139          // kotlin/collections/CollectionsKt
  #141 = Utf8               toList
  #142 = Utf8               (Ljava/lang/Iterable;)Ljava/util/List;
  #143 = NameAndType        #141:#142     // toList:(Ljava/lang/Iterable;)Ljava/util/List;
  #144 = Methodref          #140.#143     // kotlin/collections/CollectionsKt.toList:(Ljava/lang/Iterable;)Ljava/util/List;
  #145 = Utf8               java/util/List
  #146 = Class              #145          // java/util/List
  #147 = Utf8               parallelStream
  #148 = Utf8               ()Ljava/util/stream/Stream;
  #149 = NameAndType        #147:#148     // parallelStream:()Ljava/util/stream/Stream;
  #150 = InterfaceMethodref #146.#149     // java/util/List.parallelStream:()Ljava/util/stream/Stream;
  #151 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #152 = MethodType         #151          //  (Ljava/lang/Object;)Ljava/lang/Object;
  #153 = Utf8               forEachNodeParallel$lambda$0
  #154 = Utf8               (ILext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;Lkotlin/jvm/functions/Function2;Ljava/lang/Integer;)Lkotlin/Unit;
  #155 = NameAndType        #153:#154     // forEachNodeParallel$lambda$0:(ILext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;Lkotlin/jvm/functions/Function2;Ljava/lang/Integer;)Lkotlin/Unit;
  #156 = Methodref          #2.#155       // ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage.forEachNodeParallel$lambda$0:(ILext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;Lkotlin/jvm/functions/Function2;Ljava/lang/Integer;)Lkotlin/Unit;
  #157 = MethodHandle       6:#156        // REF_invokeStatic ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage.forEachNodeParallel$lambda$0:(ILext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;Lkotlin/jvm/functions/Function2;Ljava/lang/Integer;)Lkotlin/Unit;
  #158 = Utf8               (Ljava/lang/Integer;)Lkotlin/Unit;
  #159 = MethodType         #158          //  (Ljava/lang/Integer;)Lkotlin/Unit;
  #160 = Utf8               java/lang/invoke/LambdaMetafactory
  #161 = Class              #160          // java/lang/invoke/LambdaMetafactory
  #162 = Utf8               metafactory
  #163 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #164 = NameAndType        #162:#163     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #165 = Methodref          #161.#164     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #166 = MethodHandle       6:#165        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #167 = Utf8               (ILext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;Lkotlin/jvm/functions/Function2;)Lkotlin/jvm/functions/Function1;
  #168 = NameAndType        #118:#167     // invoke:(ILext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;Lkotlin/jvm/functions/Function2;)Lkotlin/jvm/functions/Function1;
  #169 = InvokeDynamic      #2:#168       // #2:invoke:(ILext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;Lkotlin/jvm/functions/Function2;)Lkotlin/jvm/functions/Function1;
  #170 = Utf8               (Ljava/lang/Object;)V
  #171 = MethodType         #170          //  (Ljava/lang/Object;)V
  #172 = Utf8               forEachNodeParallel$lambda$1
  #173 = Utf8               (Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
  #174 = NameAndType        #172:#173     // forEachNodeParallel$lambda$1:(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
  #175 = Methodref          #2.#174       // ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage.forEachNodeParallel$lambda$1:(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
  #176 = MethodHandle       6:#175        // REF_invokeStatic ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage.forEachNodeParallel$lambda$1:(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
  #177 = Utf8               accept
  #178 = Utf8               (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Consumer;
  #179 = NameAndType        #177:#178     // accept:(Lkotlin/jvm/functions/Function1;)Ljava/util/function/Consumer;
  #180 = InvokeDynamic      #3:#179       // #3:accept:(Lkotlin/jvm/functions/Function1;)Ljava/util/function/Consumer;
  #181 = Utf8               java/util/stream/Stream
  #182 = Class              #181          // java/util/stream/Stream
  #183 = Utf8               forEach
  #184 = Utf8               (Ljava/util/function/Consumer;)V
  #185 = NameAndType        #183:#184     // forEach:(Ljava/util/function/Consumer;)V
  #186 = InterfaceMethodref #182.#185     // java/util/stream/Stream.forEach:(Ljava/util/function/Consumer;)V
  #187 = Utf8               chunks
  #188 = Utf8               chunkSize
  #189 = Utf8               forEachNodeParallel$default
  #190 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;ILkotlin/jvm/functions/Function2;ILjava/lang/Object;)V
  #191 = NameAndType        #128:#129     // forEachNodeParallel:(ILkotlin/jvm/functions/Function2;)V
  #192 = Methodref          #2.#191       // ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage.forEachNodeParallel:(ILkotlin/jvm/functions/Function2;)V
  #193 = Utf8               writeAt
  #194 = Utf8               (JLjava/lang/foreign/MemorySegment;)V
  #195 = Utf8               Write at offset \u0001, size \u0001 exceeds segment size \u0001
  #196 = String             #195          // Write at offset \u0001, size \u0001 exceeds segment size \u0001
  #197 = Utf8               (JJJ)Ljava/lang/String;
  #198 = NameAndType        #61:#197      // makeConcatWithConstants:(JJJ)Ljava/lang/String;
  #199 = InvokeDynamic      #4:#198       // #4:makeConcatWithConstants:(JJJ)Ljava/lang/String;
  #200 = Utf8               copy
  #201 = Utf8               (Ljava/lang/foreign/MemorySegment;JLjava/lang/foreign/MemorySegment;JJ)V
  #202 = NameAndType        #200:#201     // copy:(Ljava/lang/foreign/MemorySegment;JLjava/lang/foreign/MemorySegment;JJ)V
  #203 = InterfaceMethodref #49.#202      // java/lang/foreign/MemorySegment.copy:(Ljava/lang/foreign/MemorySegment;JLjava/lang/foreign/MemorySegment;JJ)V
  #204 = Utf8               data
  #205 = Utf8               writeNode
  #206 = Utf8               (ILext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder;)V
  #207 = Utf8               writeIndexEntry
  #208 = NameAndType        #207:#206     // writeIndexEntry:(ILext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder;)V
  #209 = Methodref          #2.#208       // ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage.writeIndexEntry:(ILext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder;)V
  #210 = Utf8               builder
  #211 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder;
  #212 = Utf8               Cannot write node \u0001
  #213 = String             #212          // Cannot write node \u0001
  #214 = Utf8               (I)Ljava/lang/String;
  #215 = NameAndType        #61:#214      // makeConcatWithConstants:(I)Ljava/lang/String;
  #216 = InvokeDynamic      #5:#215       // #5:makeConcatWithConstants:(I)Ljava/lang/String;
  #217 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder
  #218 = Class              #217          // ext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder
  #219 = Utf8               writeTo
  #220 = Utf8               (Ljava/lang/foreign/MemorySegment;J)V
  #221 = NameAndType        #219:#220     // writeTo:(Ljava/lang/foreign/MemorySegment;J)V
  #222 = Methodref          #218.#221     // ext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder.writeTo:(Ljava/lang/foreign/MemorySegment;J)V
  #223 = Utf8               force
  #224 = NameAndType        #223:#9       // force:()V
  #225 = InterfaceMethodref #49.#224      // java/lang/foreign/MemorySegment.force:()V
  #226 = Utf8               getMemoryStats
  #227 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats;
  #228 = Utf8               ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats
  #229 = Class              #228          // ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats
  #230 = Utf8               getDataOffset
  #231 = NameAndType        #230:#47      // getDataOffset:()J
  #232 = Methodref          #43.#231      // ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader.getDataOffset:()J
  #233 = Long               64l
  #235 = Utf8               (JJIJJJ)V
  #236 = NameAndType        #7:#235       // "<init>":(JJIJJJ)V
  #237 = Methodref          #229.#236     // ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats."<init>":(JJIJJJ)V
  #238 = Utf8               indexSize
  #239 = Utf8               close
  #240 = Utf8               java/lang/Exception
  #241 = Class              #240          // java/lang/Exception
  #242 = Utf8               java/lang/foreign/Arena
  #243 = Class              #242          // java/lang/foreign/Arena
  #244 = NameAndType        #239:#9       // close:()V
  #245 = InterfaceMethodref #243.#244     // java/lang/foreign/Arena.close:()V
  #246 = Utf8               java/nio/channels/FileChannel
  #247 = Class              #246          // java/nio/channels/FileChannel
  #248 = Methodref          #247.#244     // java/nio/channels/FileChannel.close:()V
  #249 = Utf8               intValue
  #250 = NameAndType        #249:#41      // intValue:()I
  #251 = Methodref          #111.#250     // java/lang/Integer.intValue:()I
  #252 = Utf8               java/lang/Math
  #253 = Class              #252          // java/lang/Math
  #254 = Utf8               min
  #255 = Utf8               (II)I
  #256 = NameAndType        #254:#255     // min:(II)I
  #257 = Methodref          #253.#256     // java/lang/Math.min:(II)I
  #258 = Utf8               kotlin/Unit
  #259 = Class              #258          // kotlin/Unit
  #260 = Utf8               INSTANCE
  #261 = Utf8               Lkotlin/Unit;
  #262 = NameAndType        #260:#261     // INSTANCE:Lkotlin/Unit;
  #263 = Fieldref           #259.#262     // kotlin/Unit.INSTANCE:Lkotlin/Unit;
  #264 = Utf8               start
  #265 = Utf8               end
  #266 = Utf8               $chunkSize
  #267 = Utf8               this$0
  #268 = Utf8               $action
  #269 = Utf8               chunkIdx
  #270 = Utf8               Ljava/lang/Integer;
  #271 = Utf8               kotlin/jvm/functions/Function1
  #272 = Class              #271          // kotlin/jvm/functions/Function1
  #273 = NameAndType        #118:#151     // invoke:(Ljava/lang/Object;)Ljava/lang/Object;
  #274 = InterfaceMethodref #272.#273     // kotlin/jvm/functions/Function1.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
  #275 = Utf8               $tmp0
  #276 = Utf8               Lkotlin/jvm/functions/Function1;
  #277 = Utf8               p0
  #278 = Utf8               Ljava/lang/Object;
  #279 = Utf8               access$getLogger$cp
  #280 = Utf8               ()Ljava/util/logging/Logger;
  #281 = Utf8               logger
  #282 = Utf8               Ljava/util/logging/Logger;
  #283 = NameAndType        #281:#282     // logger:Ljava/util/logging/Logger;
  #284 = Fieldref           #2.#283       // ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage.logger:Ljava/util/logging/Logger;
  #285 = Utf8               (Ljava/lang/foreign/Arena;Ljava/lang/foreign/MemorySegment;Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;Ljava/nio/channels/FileChannel;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
  #286 = Utf8               $constructor_marker
  #287 = Utf8               Lkotlin/jvm/internal/DefaultConstructorMarker;
  #288 = Utf8               <clinit>
  #289 = Utf8               ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$Companion
  #290 = Class              #289          // ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$Companion
  #291 = Utf8               (Lkotlin/jvm/internal/DefaultConstructorMarker;)V
  #292 = NameAndType        #7:#291       // "<init>":(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
  #293 = Methodref          #290.#292     // ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$Companion."<init>":(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
  #294 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$Companion;
  #295 = NameAndType        #79:#294      // Companion:Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$Companion;
  #296 = Fieldref           #2.#295       // ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage.Companion:Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$Companion;
  #297 = Utf8               java/lang/Class
  #298 = Class              #297          // java/lang/Class
  #299 = Utf8               getName
  #300 = Utf8               ()Ljava/lang/String;
  #301 = NameAndType        #299:#300     // getName:()Ljava/lang/String;
  #302 = Methodref          #298.#301     // java/lang/Class.getName:()Ljava/lang/String;
  #303 = Utf8               java/util/logging/Logger
  #304 = Class              #303          // java/util/logging/Logger
  #305 = Utf8               getLogger
  #306 = Utf8               (Ljava/lang/String;)Ljava/util/logging/Logger;
  #307 = NameAndType        #305:#306     // getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
  #308 = Methodref          #304.#307     // java/util/logging/Logger.getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
  #309 = Utf8               Lorg/jetbrains/annotations/Nullable;
  #310 = Utf8               INDEX_ENTRY_SIZE
  #311 = Utf8               PREFETCH_PAGES
  #312 = Integer            32
  #313 = Utf8               PAGE_SIZE
  #314 = Integer            4096
  #315 = Utf8               Lkotlin/Metadata;
  #316 = Utf8               mv
  #317 = Integer            2
  #318 = Integer            3
  #319 = Integer            0
  #320 = Utf8               k
  #321 = Integer            1
  #322 = Utf8               xi
  #323 = Integer            48
  #324 = Utf8               d1
  #325 = Utf8               \u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 02\u00060\u0001j\u0002`\u0002:\u000201B-\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0014J\u000e\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0014J \u0010\u001f\u001a\u00020 2\u0018\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020 0\"J*\u0010#\u001a\u00020 2\b\b\u0002\u0010$\u001a\u00020\u00142\u0018\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020 0\"J\u0016\u0010%\u001a\u00020 2\u0006\u0010&\u001a\u00020\u00182\u0006\u0010\'\u001a\u00020\u0006J\u0016\u0010(\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010)\u001a\u00020*J\u0016\u0010+\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010)\u001a\u00020*J\u0006\u0010,\u001a\u00020 J\u0006\u0010-\u001a\u00020.J\b\u0010/\u001a\u00020 H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u00062
  #326 = Utf8               d2
  #327 = Utf8               Ljava/lang/AutoCloseable;
  #328 = Utf8               Lkotlin/AutoCloseable;
  #329 = Utf8               nodeCount
  #330 = Utf8
  #331 = Utf8               mappedSize
  #332 = Utf8               Lkotlin/Function2;
  #333 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats;
  #334 = Utf8               MemoryStats
  #335 = Utf8               Brproject
  #336 = Utf8               NativeStorage.kt
  #337 = Utf8               RuntimeInvisibleAnnotations
  #338 = Utf8               ConstantValue
  #339 = Utf8               Code
  #340 = Utf8               LineNumberTable
  #341 = Utf8               LocalVariableTable
  #342 = Utf8               StackMapTable
  #343 = Utf8               Signature
  #344 = Utf8               RuntimeInvisibleParameterAnnotations
  #345 = Utf8               InnerClasses
  #346 = Utf8               SourceFile
  #347 = Utf8               RuntimeVisibleAnnotations
  #348 = Utf8               BootstrapMethods
{
  public static final ext.mods.gameserver.geoengine.pathfinding.native.NativeStorage$Companion Companion;
    descriptor: Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$Companion;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    RuntimeInvisibleAnnotations:
      0: #35()
        org.jetbrains.annotations.NotNull

  public static final long INDEX_ENTRY_SIZE;
    descriptor: J
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: long 32l

  ext.mods.gameserver.geoengine.pathfinding.native.NativeStorage(java.lang.foreign.Arena, java.lang.foreign.MemorySegment, ext.mods.gameserver.geoengine.pathfinding.model.L2BRHeader, java.nio.channels.FileChannel, int, kotlin.jvm.internal.DefaultConstructorMarker);
    descriptor: (Ljava/lang/foreign/Arena;Ljava/lang/foreign/MemorySegment;Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;Ljava/nio/channels/FileChannel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    flags: (0x1000) ACC_SYNTHETIC
    Code:
      stack=5, locals=7, args_size=7
         0: iload         5
         2: bipush        8
         4: iand
         5: ifeq          11
         8: aconst_null
         9: astore        4
        11: aload_0
        12: aload_1
        13: aload_2
        14: aload_3
        15: aload         4
        17: invokespecial #32                 // Method "<init>":(Ljava/lang/foreign/Arena;Ljava/lang/foreign/MemorySegment;Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;Ljava/nio/channels/FileChannel;)V
        20: return
      StackMapTable: number_of_entries = 1
        frame_type = 11 /* same */
      LineNumberTable:
        line 35: 0
        line 39: 8
        line 35: 11
        line 40: 20

  public final java.lang.foreign.Arena getArena();
    descriptor: ()Ljava/lang/foreign/Arena;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #15                 // Field arena:Ljava/lang/foreign/Arena;
         4: areturn
      LineNumberTable:
        line 36: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
    RuntimeInvisibleAnnotations:
      0: #35()
        org.jetbrains.annotations.NotNull

  public final java.lang.foreign.MemorySegment getSegment();
    descriptor: ()Ljava/lang/foreign/MemorySegment;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field segment:Ljava/lang/foreign/MemorySegment;
         4: areturn
      LineNumberTable:
        line 37: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
    RuntimeInvisibleAnnotations:
      0: #35()
        org.jetbrains.annotations.NotNull

  public final ext.mods.gameserver.geoengine.pathfinding.model.L2BRHeader getHeader();
    descriptor: ()Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #23                 // Field header:Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;
         4: areturn
      LineNumberTable:
        line 38: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
    RuntimeInvisibleAnnotations:
      0: #35()
        org.jetbrains.annotations.NotNull

  public final int getNodeCount();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #23                 // Field header:Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;
         4: invokevirtual #45                 // Method ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader.getNodeCount:()I
         7: ireturn
      LineNumberTable:
        line 151: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;

  public final long getMappedSize();
    descriptor: ()J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field segment:Ljava/lang/foreign/MemorySegment;
         4: invokeinterface #52,  1           // InterfaceMethod java/lang/foreign/MemorySegment.byteSize:()J
         9: lreturn
      LineNumberTable:
        line 152: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;

  public final ext.mods.gameserver.geoengine.pathfinding.model.PathNode getNode(int);
    descriptor: (I)Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=6, locals=4, args_size=2
         0: iload_1
         1: iflt          15
         4: iload_1
         5: aload_0
         6: getfield      #23                 // Field header:Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;
         9: invokevirtual #45                 // Method ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader.getNodeCount:()I
        12: if_icmplt     36
        15: new           #56                 // class java/lang/IndexOutOfBoundsException
        18: dup
        19: iload_1
        20: aload_0
        21: getfield      #23                 // Field header:Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;
        24: invokevirtual #45                 // Method ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader.getNodeCount:()I
        27: invokedynamic #68,  0             // InvokeDynamic #0:makeConcatWithConstants:(II)Ljava/lang/String;
        32: invokespecial #71                 // Method java/lang/IndexOutOfBoundsException."<init>":(Ljava/lang/String;)V
        35: athrow
        36: aload_0
        37: getfield      #23                 // Field header:Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;
        40: invokevirtual #74                 // Method ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader.getIndexOffset:()J
        43: iload_1
        44: i2l
        45: ldc2_w        #75                 // long 32l
        48: lmul
        49: ladd
        50: lstore_2
        51: getstatic     #82                 // Field ext/mods/gameserver/geoengine/pathfinding/model/PathNode.Companion:Lext/mods/gameserver/geoengine/pathfinding/model/PathNode$Companion;
        54: aload_0
        55: getfield      #19                 // Field segment:Ljava/lang/foreign/MemorySegment;
        58: lload_2
        59: ldc2_w        #75                 // long 32l
        62: invokeinterface #86,  5           // InterfaceMethod java/lang/foreign/MemorySegment.asSlice:(JJ)Ljava/lang/foreign/MemorySegment;
        67: iload_1
        68: invokevirtual #92                 // Method ext/mods/gameserver/geoengine/pathfinding/model/PathNode$Companion.fromMemory:(Ljava/lang/foreign/MemorySegment;I)Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;
        71: areturn
      StackMapTable: number_of_entries = 2
        frame_type = 15 /* same */
        frame_type = 20 /* same */
      LineNumberTable:
        line 154: 0
        line 155: 15
        line 156: 19
        line 155: 32
        line 160: 36
        line 161: 51
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           51      21     2 offset   J
            0      72     0  this   Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
            0      72     1 nodeId   I
    RuntimeInvisibleAnnotations:
      0: #35()
        org.jetbrains.annotations.NotNull

  public final java.lang.foreign.MemorySegment getNodeSegment(int);
    descriptor: (I)Ljava/lang/foreign/MemorySegment;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=6, locals=4, args_size=2
         0: iload_1
         1: iflt          15
         4: iload_1
         5: aload_0
         6: getfield      #23                 // Field header:Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;
         9: invokevirtual #45                 // Method ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader.getNodeCount:()I
        12: if_icmplt     36
        15: new           #56                 // class java/lang/IndexOutOfBoundsException
        18: dup
        19: iload_1
        20: aload_0
        21: getfield      #23                 // Field header:Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;
        24: invokevirtual #45                 // Method ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader.getNodeCount:()I
        27: invokedynamic #68,  0             // InvokeDynamic #0:makeConcatWithConstants:(II)Ljava/lang/String;
        32: invokespecial #71                 // Method java/lang/IndexOutOfBoundsException."<init>":(Ljava/lang/String;)V
        35: athrow
        36: aload_0
        37: getfield      #23                 // Field header:Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;
        40: invokevirtual #74                 // Method ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader.getIndexOffset:()J
        43: iload_1
        44: i2l
        45: ldc2_w        #75                 // long 32l
        48: lmul
        49: ladd
        50: lstore_2
        51: aload_0
        52: getfield      #19                 // Field segment:Ljava/lang/foreign/MemorySegment;
        55: lload_2
        56: ldc2_w        #75                 // long 32l
        59: invokeinterface #86,  5           // InterfaceMethod java/lang/foreign/MemorySegment.asSlice:(JJ)Ljava/lang/foreign/MemorySegment;
        64: areturn
      StackMapTable: number_of_entries = 2
        frame_type = 15 /* same */
        frame_type = 20 /* same */
      LineNumberTable:
        line 164: 0
        line 165: 15
        line 168: 36
        line 169: 51
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           51      14     2 offset   J
            0      65     0  this   Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
            0      65     1 nodeId   I
    RuntimeInvisibleAnnotations:
      0: #35()
        org.jetbrains.annotations.NotNull

  public final void forEachNode(kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super ext.mods.gameserver.geoengine.pathfinding.model.PathNode, kotlin.Unit>);
    descriptor: (Lkotlin/jvm/functions/Function2;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=6, locals=9, args_size=2
         0: aload_0
         1: getfield      #23                 // Field header:Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;
         4: invokevirtual #74                 // Method ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader.getIndexOffset:()J
         7: lstore_2
         8: lload_2
         9: aload_0
        10: getfield      #23                 // Field header:Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;
        13: invokevirtual #45                 // Method ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader.getNodeCount:()I
        16: i2l
        17: ldc2_w        #75                 // long 32l
        20: lmul
        21: ladd
        22: lstore        4
        24: lload         4
        26: aload_0
        27: getfield      #19                 // Field segment:Ljava/lang/foreign/MemorySegment;
        30: invokeinterface #52,  1           // InterfaceMethod java/lang/foreign/MemorySegment.byteSize:()J
        35: lcmp
        36: ifle          63
        39: new           #103                // class java/lang/IllegalStateException
        42: dup
        43: lload         4
        45: aload_0
        46: getfield      #19                 // Field segment:Ljava/lang/foreign/MemorySegment;
        49: invokeinterface #52,  1           // InterfaceMethod java/lang/foreign/MemorySegment.byteSize:()J
        54: invokedynamic #108,  0            // InvokeDynamic #1:makeConcatWithConstants:(JJ)Ljava/lang/String;
        59: invokespecial #109                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
        62: athrow
        63: iconst_0
        64: istore        6
        66: aload_0
        67: getfield      #23                 // Field header:Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;
        70: invokevirtual #45                 // Method ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader.getNodeCount:()I
        73: istore        7
        75: iload         6
        77: iload         7
        79: if_icmpge     131
        82: getstatic     #82                 // Field ext/mods/gameserver/geoengine/pathfinding/model/PathNode.Companion:Lext/mods/gameserver/geoengine/pathfinding/model/PathNode$Companion;
        85: aload_0
        86: getfield      #19                 // Field segment:Ljava/lang/foreign/MemorySegment;
        89: lload_2
        90: ldc2_w        #75                 // long 32l
        93: invokeinterface #86,  5           // InterfaceMethod java/lang/foreign/MemorySegment.asSlice:(JJ)Ljava/lang/foreign/MemorySegment;
        98: iload         6
       100: invokevirtual #92                 // Method ext/mods/gameserver/geoengine/pathfinding/model/PathNode$Companion.fromMemory:(Ljava/lang/foreign/MemorySegment;I)Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;
       103: astore        8
       105: aload_1
       106: iload         6
       108: invokestatic  #115                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       111: aload         8
       113: invokeinterface #121,  3          // InterfaceMethod kotlin/jvm/functions/Function2.invoke:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       118: pop
       119: lload_2
       120: ldc2_w        #75                 // long 32l
       123: ladd
       124: lstore_2
       125: iinc          6, 1
       128: goto          75
       131: return
      StackMapTable: number_of_entries = 3
        frame_type = 253 /* append */
          offset_delta = 63
          locals = [ long, long ]
        frame_type = 253 /* append */
          offset_delta = 11
          locals = [ int, int ]
        frame_type = 55 /* same */
      LineNumberTable:
        line 172: 0
        line 173: 8
        line 175: 24
        line 176: 39
        line 178: 43
        line 176: 59
        line 182: 63
        line 183: 82
        line 184: 105
        line 185: 119
        line 182: 125
        line 187: 131
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          105      20     8  node   Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;
           66      65     6     i   I
            8     124     2 offset   J
           24     108     4 maxOffset   J
            0     132     0  this   Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
            0     132     1 action   Lkotlin/jvm/functions/Function2;
    Signature: #101                         // (Lkotlin/jvm/functions/Function2<-Ljava/lang/Integer;-Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;Lkotlin/Unit;>;)V
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #35()
          org.jetbrains.annotations.NotNull

  public final void forEachNodeParallel(int, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super ext.mods.gameserver.geoengine.pathfinding.model.PathNode, kotlin.Unit>);
    descriptor: (ILkotlin/jvm/functions/Function2;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=4, args_size=3
         0: aload_0
         1: getfield      #23                 // Field header:Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;
         4: invokevirtual #45                 // Method ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader.getNodeCount:()I
         7: iload_1
         8: iadd
         9: iconst_1
        10: isub
        11: iload_1
        12: idiv
        13: istore_3
        14: iconst_0
        15: iload_3
        16: invokestatic  #136                // Method kotlin/ranges/RangesKt.until:(II)Lkotlin/ranges/IntRange;
        19: checkcast     #138                // class java/lang/Iterable
        22: invokestatic  #144                // Method kotlin/collections/CollectionsKt.toList:(Ljava/lang/Iterable;)Ljava/util/List;
        25: invokeinterface #150,  1          // InterfaceMethod java/util/List.parallelStream:()Ljava/util/stream/Stream;
        30: iload_1
        31: aload_0
        32: aload_2
        33: invokedynamic #169,  0            // InvokeDynamic #2:invoke:(ILext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;Lkotlin/jvm/functions/Function2;)Lkotlin/jvm/functions/Function1;
        38: invokedynamic #180,  0            // InvokeDynamic #3:accept:(Lkotlin/jvm/functions/Function1;)Ljava/util/function/Consumer;
        43: invokeinterface #186,  2          // InterfaceMethod java/util/stream/Stream.forEach:(Ljava/util/function/Consumer;)V
        48: return
      LineNumberTable:
        line 189: 0
        line 191: 14
        line 203: 48
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           14      35     3 chunks   I
            0      49     0  this   Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
            0      49     1 chunkSize   I
            0      49     2 action   Lkotlin/jvm/functions/Function2;
    Signature: #130                         // (ILkotlin/jvm/functions/Function2<-Ljava/lang/Integer;-Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;Lkotlin/Unit;>;)V
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
      parameter 1:
        0: #35()
          org.jetbrains.annotations.NotNull

  public static void forEachNodeParallel$default(ext.mods.gameserver.geoengine.pathfinding.native.NativeStorage, int, kotlin.jvm.functions.Function2, int, java.lang.Object);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;ILkotlin/jvm/functions/Function2;ILjava/lang/Object;)V
    flags: (0x1009) ACC_PUBLIC, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=3, locals=5, args_size=5
         0: iload_3
         1: iconst_1
         2: iand
         3: ifeq          10
         6: sipush        1024
         9: istore_1
        10: aload_0
        11: iload_1
        12: aload_2
        13: invokevirtual #192                // Method forEachNodeParallel:(ILkotlin/jvm/functions/Function2;)V
        16: return
      StackMapTable: number_of_entries = 1
        frame_type = 10 /* same */
      LineNumberTable:
        line 188: 0

  public final void writeAt(long, java.lang.foreign.MemorySegment);
    descriptor: (JLjava/lang/foreign/MemorySegment;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=8, locals=4, args_size=3
         0: lload_1
         1: lconst_0
         2: lcmp
         3: iflt          27
         6: lload_1
         7: aload_3
         8: invokeinterface #52,  1           // InterfaceMethod java/lang/foreign/MemorySegment.byteSize:()J
        13: ladd
        14: aload_0
        15: getfield      #19                 // Field segment:Ljava/lang/foreign/MemorySegment;
        18: invokeinterface #52,  1           // InterfaceMethod java/lang/foreign/MemorySegment.byteSize:()J
        23: lcmp
        24: ifle          56
        27: new           #56                 // class java/lang/IndexOutOfBoundsException
        30: dup
        31: lload_1
        32: aload_3
        33: invokeinterface #52,  1           // InterfaceMethod java/lang/foreign/MemorySegment.byteSize:()J
        38: aload_0
        39: getfield      #19                 // Field segment:Ljava/lang/foreign/MemorySegment;
        42: invokeinterface #52,  1           // InterfaceMethod java/lang/foreign/MemorySegment.byteSize:()J
        47: invokedynamic #199,  0            // InvokeDynamic #4:makeConcatWithConstants:(JJJ)Ljava/lang/String;
        52: invokespecial #71                 // Method java/lang/IndexOutOfBoundsException."<init>":(Ljava/lang/String;)V
        55: athrow
        56: aload_3
        57: lconst_0
        58: aload_0
        59: getfield      #19                 // Field segment:Ljava/lang/foreign/MemorySegment;
        62: lload_1
        63: aload_3
        64: invokeinterface #52,  1           // InterfaceMethod java/lang/foreign/MemorySegment.byteSize:()J
        69: invokestatic  #203                // InterfaceMethod java/lang/foreign/MemorySegment.copy:(Ljava/lang/foreign/MemorySegment;JLjava/lang/foreign/MemorySegment;JJ)V
        72: return
      StackMapTable: number_of_entries = 2
        frame_type = 27 /* same */
        frame_type = 28 /* same */
      LineNumberTable:
        line 205: 0
        line 206: 27
        line 207: 31
        line 208: 38
        line 206: 52
        line 211: 56
        line 212: 72
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      73     0  this   Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
            0      73     1 offset   J
            0      73     3  data   Ljava/lang/foreign/MemorySegment;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
      parameter 1:
        0: #35()
          org.jetbrains.annotations.NotNull

  public final void writeNode(int, ext.mods.gameserver.geoengine.pathfinding.model.PathNodeBuilder);
    descriptor: (ILext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: iload_1
         2: aload_2
         3: invokevirtual #209                // Method writeIndexEntry:(ILext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder;)V
         6: return
      LineNumberTable:
        line 214: 0
        line 215: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
            0       7     1 nodeId   I
            0       7     2 builder   Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
      parameter 1:
        0: #35()
          org.jetbrains.annotations.NotNull

  public final void writeIndexEntry(int, ext.mods.gameserver.geoengine.pathfinding.model.PathNodeBuilder);
    descriptor: (ILext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=6, locals=5, args_size=3
         0: iload_1
         1: iflt          15
         4: iload_1
         5: aload_0
         6: getfield      #23                 // Field header:Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;
         9: invokevirtual #45                 // Method ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader.getNodeCount:()I
        12: if_icmplt     29
        15: new           #56                 // class java/lang/IndexOutOfBoundsException
        18: dup
        19: iload_1
        20: invokedynamic #216,  0            // InvokeDynamic #5:makeConcatWithConstants:(I)Ljava/lang/String;
        25: invokespecial #71                 // Method java/lang/IndexOutOfBoundsException."<init>":(Ljava/lang/String;)V
        28: athrow
        29: aload_0
        30: getfield      #23                 // Field header:Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;
        33: invokevirtual #74                 // Method ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader.getIndexOffset:()J
        36: iload_1
        37: i2l
        38: ldc2_w        #75                 // long 32l
        41: lmul
        42: ladd
        43: lstore_3
        44: aload_2
        45: aload_0
        46: getfield      #19                 // Field segment:Ljava/lang/foreign/MemorySegment;
        49: lload_3
        50: invokevirtual #222                // Method ext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder.writeTo:(Ljava/lang/foreign/MemorySegment;J)V
        53: return
      StackMapTable: number_of_entries = 2
        frame_type = 15 /* same */
        frame_type = 13 /* same */
      LineNumberTable:
        line 217: 0
        line 218: 15
        line 221: 29
        line 222: 44
        line 223: 53
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           44      10     3 offset   J
            0      54     0  this   Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
            0      54     1 nodeId   I
            0      54     2 builder   Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
      parameter 1:
        0: #35()
          org.jetbrains.annotations.NotNull

  public final void force();
    descriptor: ()V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field segment:Ljava/lang/foreign/MemorySegment;
         4: invokeinterface #225,  1          // InterfaceMethod java/lang/foreign/MemorySegment.force:()V
         9: return
      LineNumberTable:
        line 225: 0
        line 226: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;

  public final ext.mods.gameserver.geoengine.pathfinding.native.NativeStorage$MemoryStats getMemoryStats();
    descriptor: ()Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=13, locals=3, args_size=1
         0: aload_0
         1: getfield      #23                 // Field header:Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;
         4: invokevirtual #45                 // Method ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader.getNodeCount:()I
         7: i2l
         8: ldc2_w        #75                 // long 32l
        11: lmul
        12: lstore_1
        13: new           #229                // class ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats
        16: dup
        17: aload_0
        18: getfield      #19                 // Field segment:Ljava/lang/foreign/MemorySegment;
        21: invokeinterface #52,  1           // InterfaceMethod java/lang/foreign/MemorySegment.byteSize:()J
        26: aload_0
        27: getfield      #19                 // Field segment:Ljava/lang/foreign/MemorySegment;
        30: invokeinterface #52,  1           // InterfaceMethod java/lang/foreign/MemorySegment.byteSize:()J
        35: aload_0
        36: getfield      #23                 // Field header:Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;
        39: invokevirtual #45                 // Method ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader.getNodeCount:()I
        42: lload_1
        43: aload_0
        44: getfield      #23                 // Field header:Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;
        47: invokevirtual #232                // Method ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader.getDataOffset:()J
        50: ldc2_w        #233                // long 64l
        53: invokespecial #237                // Method ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats."<init>":(JJIJJJ)V
        56: areturn
      LineNumberTable:
        line 228: 0
        line 229: 13
        line 230: 17
        line 231: 26
        line 232: 35
        line 233: 42
        line 234: 43
        line 235: 50
        line 229: 53
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           13      44     1 indexSize   J
            0      57     0  this   Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
    RuntimeInvisibleAnnotations:
      0: #35()
        org.jetbrains.annotations.NotNull

  public void close();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=1
         0: nop
         1: aload_0
         2: getfield      #19                 // Field segment:Ljava/lang/foreign/MemorySegment;
         5: invokeinterface #225,  1          // InterfaceMethod java/lang/foreign/MemorySegment.force:()V
        10: goto          14
        13: astore_1
        14: aload_0
        15: getfield      #15                 // Field arena:Ljava/lang/foreign/Arena;
        18: invokeinterface #245,  1          // InterfaceMethod java/lang/foreign/Arena.close:()V
        23: aload_0
        24: getfield      #27                 // Field channel:Ljava/nio/channels/FileChannel;
        27: dup
        28: ifnull        37
        31: invokevirtual #248                // Method java/nio/channels/FileChannel.close:()V
        34: goto          38
        37: pop
        38: return
      Exception table:
         from    to  target type
             0    10    13   Class java/lang/Exception
      StackMapTable: number_of_entries = 4
        frame_type = 77 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 0 /* same */
        frame_type = 86 /* same_locals_1_stack_item */
          stack = [ class java/nio/channels/FileChannel ]
        frame_type = 0 /* same */
      LineNumberTable:
        line 239: 0
        line 240: 1
        line 241: 13
        line 243: 14
        line 244: 23
        line 245: 38
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      39     0  this   Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;

  public static final java.util.logging.Logger access$getLogger$cp();
    descriptor: ()Ljava/util/logging/Logger;
    flags: (0x1019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #284                // Field logger:Ljava/util/logging/Logger;
         3: areturn
      LineNumberTable:
        line 35: 0

  public ext.mods.gameserver.geoengine.pathfinding.native.NativeStorage(java.lang.foreign.Arena, java.lang.foreign.MemorySegment, ext.mods.gameserver.geoengine.pathfinding.model.L2BRHeader, java.nio.channels.FileChannel, kotlin.jvm.internal.DefaultConstructorMarker);
    descriptor: (Ljava/lang/foreign/Arena;Ljava/lang/foreign/MemorySegment;Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;Ljava/nio/channels/FileChannel;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    flags: (0x1001) ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=5, locals=6, args_size=6
         0: aload_0
         1: aload_1
         2: aload_2
         3: aload_3
         4: aload         4
         6: invokespecial #32                 // Method "<init>":(Ljava/lang/foreign/Arena;Ljava/lang/foreign/MemorySegment;Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;Ljava/nio/channels/FileChannel;)V
         9: return
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
            0      10     1 arena   Ljava/lang/foreign/Arena;
            0      10     2 segment   Ljava/lang/foreign/MemorySegment;
            0      10     3 header   Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;
            0      10     4 channel   Ljava/nio/channels/FileChannel;
            0      10     5 $constructor_marker   Lkotlin/jvm/internal/DefaultConstructorMarker;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #290                // class ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$Companion
         3: dup
         4: aconst_null
         5: invokespecial #293                // Method ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$Companion."<init>":(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
         8: putstatic     #296                // Field Companion:Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$Companion;
        11: ldc           #2                  // class ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage
        13: invokevirtual #302                // Method java/lang/Class.getName:()Ljava/lang/String;
        16: invokestatic  #308                // Method java/util/logging/Logger.getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
        19: putstatic     #284                // Field logger:Ljava/util/logging/Logger;
        22: return
      LineNumberTable:
        line 45: 11
}
InnerClasses:
  public static final #79= #88 of #78;    // Companion=class ext/mods/gameserver/geoengine/pathfinding/model/PathNode$Companion of class ext/mods/gameserver/geoengine/pathfinding/model/PathNode
  public static final #79= #290 of #2;    // Companion=class ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$Companion of class ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage
  public static final #334= #229 of #2;   // MemoryStats=class ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats of class ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage
SourceFile: "NativeStorage.kt"
RuntimeVisibleAnnotations:
  0: #315(#316=[I#317,I#318,I#319],#320=I#321,#322=I#323,#324=[s#325],#326=[s#29,s#327,s#328,s#12,s#13,s#16,s#17,s#20,s#21,s#24,s#25,s#7,s#8,s#33,s#34,s#36,s#37,s#38,s#39,s#329,s#330,s#40,s#41,s#331,s#330,s#46,s#47,s#53,s#123,s#95,s#97,s#99,s#330,s#126,s#332,s#128,s#188,s#193,s#93,s#204,s#205,s#210,s#211,s#207,s#223,s#226,s#333,s#239,s#79,s#334,s#335])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 02\u00060\u0001j\u0002`\u0002:\u000201B-\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0014J\u000e\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0014J \u0010\u001f\u001a\u00020 2\u0018\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020 0\"J*\u0010#\u001a\u00020 2\b\b\u0002\u0010$\u001a\u00020\u00142\u0018\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020 0\"J\u0016\u0010%\u001a\u00020 2\u0006\u0010&\u001a\u00020\u00182\u0006\u0010\'\u001a\u00020\u0006J\u0016\u0010(\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010)\u001a\u00020*J\u0016\u0010+\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010)\u001a\u00020*J\u0006\u0010,\u001a\u00020 J\u0006\u0010-\u001a\u00020.J\b\u0010/\u001a\u00020 H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u00062"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;","Ljava/lang/AutoCloseable;","Lkotlin/AutoCloseable;","arena","Ljava/lang/foreign/Arena;","segment","Ljava/lang/foreign/MemorySegment;","header","Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;","channel","Ljava/nio/channels/FileChannel;","<init>","(Ljava/lang/foreign/Arena;Ljava/lang/foreign/MemorySegment;Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;Ljava/nio/channels/FileChannel;)V","getArena","()Ljava/lang/foreign/Arena;","getSegment","()Ljava/lang/foreign/MemorySegment;","getHeader","()Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;","nodeCount","","getNodeCount","()I","mappedSize","","getMappedSize","()J","getNode","Lext/mods/gameserver/geoengine/pathfinding/model/PathNode;","nodeId","getNodeSegment","forEachNode","","action","Lkotlin/Function2;","forEachNodeParallel","chunkSize","writeAt","offset","data","writeNode","builder","Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder;","writeIndexEntry","force","getMemoryStats","Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$MemoryStats;","close","Companion","MemoryStats","Brproject"]
    )
BootstrapMethods:
  0: #65 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #58 NodeId \u0001 fora do range [0, \u0001)
  1: #65 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #105 forEachNode iria acessar bytes além do limite. IndexEnd: \u0001, FileSize: \u0001
  2: #166 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #152 (Ljava/lang/Object;)Ljava/lang/Object;
      #157 REF_invokeStatic ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage.forEachNodeParallel$lambda$0:(ILext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;Lkotlin/jvm/functions/Function2;Ljava/lang/Integer;)Lkotlin/Unit;
      #159 (Ljava/lang/Integer;)Lkotlin/Unit;
  3: #166 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #171 (Ljava/lang/Object;)V
      #176 REF_invokeStatic ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage.forEachNodeParallel$lambda$1:(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
      #171 (Ljava/lang/Object;)V
  4: #65 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #196 Write at offset \u0001, size \u0001 exceeds segment size \u0001
  5: #65 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #213 Cannot write node \u0001
