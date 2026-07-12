// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.MainKt
// File: ext\mods\gameserver\geoengine\pathfinding\MainKt.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/MainKt.class
  Last modified 9 de jul de 2026; size 13548 bytes
  MD5 checksum cdb79f6e971b9837e4e74ef43934b87a
  Compiled from "Main.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.MainKt
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/MainKt
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 6, attributes: 6
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/MainKt
    #2 = Class              #1            // ext/mods/gameserver/geoengine/pathfinding/MainKt
    #3 = Utf8               java/lang/Object
    #4 = Class              #3            // java/lang/Object
    #5 = Utf8               main
    #6 = Utf8               ([Ljava/lang/String;)V
    #7 = Utf8               Lorg/jetbrains/annotations/NotNull;
    #8 = Utf8               ????????????????????????????????????????????????????????????????\n?           L2BR Pathfinder V5 - Demonstração                   ?\n?     Ultra-Scale Pathfinding for Lineage 2 Java Servers       ?\n????????????????????????????????????????????????????????????????
    #9 = String             #8            // ????????????????????????????????????????????????????????????????\n?           L2BR Pathfinder V5 - Demonstração                   ?\n?     Ultra-Scale Pathfinding for Lineage 2 Java Servers       ?\n????????????????????????????????????????????????????????????????
   #10 = Utf8               java/lang/System
   #11 = Class              #10           // java/lang/System
   #12 = Utf8               out
   #13 = Utf8               Ljava/io/PrintStream;
   #14 = NameAndType        #12:#13       // out:Ljava/io/PrintStream;
   #15 = Fieldref           #11.#14       // java/lang/System.out:Ljava/io/PrintStream;
   #16 = Utf8               java/io/PrintStream
   #17 = Class              #16           // java/io/PrintStream
   #18 = Utf8               println
   #19 = Utf8               (Ljava/lang/Object;)V
   #20 = NameAndType        #18:#19       // println:(Ljava/lang/Object;)V
   #21 = Methodref          #17.#20       // java/io/PrintStream.println:(Ljava/lang/Object;)V
   #22 = Utf8               kotlin/collections/ArraysKt
   #23 = Class              #22           // kotlin/collections/ArraysKt
   #24 = Utf8               firstOrNull
   #25 = Utf8               ([Ljava/lang/Object;)Ljava/lang/Object;
   #26 = NameAndType        #24:#25       // firstOrNull:([Ljava/lang/Object;)Ljava/lang/Object;
   #27 = Methodref          #23.#26       // kotlin/collections/ArraysKt.firstOrNull:([Ljava/lang/Object;)Ljava/lang/Object;
   #28 = Utf8               java/lang/String
   #29 = Class              #28           // java/lang/String
   #30 = Utf8               hashCode
   #31 = Utf8               ()I
   #32 = NameAndType        #30:#31       // hashCode:()I
   #33 = Methodref          #29.#32       // java/lang/String.hashCode:()I
   #34 = Utf8               help
   #35 = String             #34           // help
   #36 = Utf8               equals
   #37 = Utf8               (Ljava/lang/Object;)Z
   #38 = NameAndType        #36:#37       // equals:(Ljava/lang/Object;)Z
   #39 = Methodref          #29.#38       // java/lang/String.equals:(Ljava/lang/Object;)Z
   #40 = Utf8               --help
   #41 = String             #40           // --help
   #42 = Utf8               -h
   #43 = String             #42           // -h
   #44 = Utf8               generate
   #45 = String             #44           // generate
   #46 = Utf8               warmup
   #47 = String             #46           // warmup
   #48 = Utf8               benchmark
   #49 = String             #48           // benchmark
   #50 = Utf8               getOrNull
   #51 = Utf8               ([Ljava/lang/Object;I)Ljava/lang/Object;
   #52 = NameAndType        #50:#51       // getOrNull:([Ljava/lang/Object;I)Ljava/lang/Object;
   #53 = Methodref          #23.#52       // kotlin/collections/ArraysKt.getOrNull:([Ljava/lang/Object;I)Ljava/lang/Object;
   #54 = Utf8               kotlin/text/StringsKt
   #55 = Class              #54           // kotlin/text/StringsKt
   #56 = Utf8               toIntOrNull
   #57 = Utf8               (Ljava/lang/String;)Ljava/lang/Integer;
   #58 = NameAndType        #56:#57       // toIntOrNull:(Ljava/lang/String;)Ljava/lang/Integer;
   #59 = Methodref          #55.#58       // kotlin/text/StringsKt.toIntOrNull:(Ljava/lang/String;)Ljava/lang/Integer;
   #60 = Utf8               java/lang/Integer
   #61 = Class              #60           // java/lang/Integer
   #62 = Utf8               intValue
   #63 = NameAndType        #62:#31       // intValue:()I
   #64 = Methodref          #61.#63       // java/lang/Integer.intValue:()I
   #65 = Utf8               runGeneration
   #66 = Utf8               (II)V
   #67 = NameAndType        #65:#66       // runGeneration:(II)V
   #68 = Methodref          #2.#67        // ext/mods/gameserver/geoengine/pathfinding/MainKt.runGeneration:(II)V
   #69 = Utf8               runBenchmark
   #70 = Utf8               ()V
   #71 = NameAndType        #69:#70       // runBenchmark:()V
   #72 = Methodref          #2.#71        // ext/mods/gameserver/geoengine/pathfinding/MainKt.runBenchmark:()V
   #73 = Utf8               runWarmUpDemo
   #74 = NameAndType        #73:#70       // runWarmUpDemo:()V
   #75 = Methodref          #2.#74        // ext/mods/gameserver/geoengine/pathfinding/MainKt.runWarmUpDemo:()V
   #76 = Utf8               printHelp
   #77 = NameAndType        #76:#70       // printHelp:()V
   #78 = Methodref          #2.#77        // ext/mods/gameserver/geoengine/pathfinding/MainKt.printHelp:()V
   #79 = Utf8               args
   #80 = Utf8               [Ljava/lang/String;
   #81 = Class              #80           // "[Ljava/lang/String;"
   #82 = Utf8               Uso: java -jar l2br-pathfinder.jar <comando> [opções]\n\nComandos:\n  generate <x> <y>    Gera arquivo .l2br para região especificada\n  benchmark           Executa benchmark de performance\n  warmup              Demonstra warm-up determinístico\n  help                Mostra esta ajuda\n\nExemplos:\n  java -jar l2br-pathfinder.jar generate 20 25\n  java -jar l2br-pathfinder.jar benchmark
   #83 = String             #82           // Uso: java -jar l2br-pathfinder.jar <comando> [opções]\n\nComandos:\n  generate <x> <y>    Gera arquivo .l2br para região especificada\n  benchmark           Executa benchmark de performance\n  warmup              Demonstra warm-up determinístico\n  help                Mostra esta ajuda\n\nExemplos:\n  java -jar l2br-pathfinder.jar generate 20 25\n  java -jar l2br-pathfinder.jar benchmark
   #84 = Utf8               \n[1/4] Iniciando geração para região [\u0001, \u0001]...
   #85 = String             #84           // \n[1/4] Iniciando geração para região [\u0001, \u0001]...
   #86 = Utf8               java/lang/invoke/StringConcatFactory
   #87 = Class              #86           // java/lang/invoke/StringConcatFactory
   #88 = Utf8               makeConcatWithConstants
   #89 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #90 = NameAndType        #88:#89       // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #91 = Methodref          #87.#90       // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #92 = MethodHandle       6:#91         // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #93 = Utf8               (II)Ljava/lang/String;
   #94 = NameAndType        #88:#93       // makeConcatWithConstants:(II)Ljava/lang/String;
   #95 = InvokeDynamic      #0:#94        // #0:makeConcatWithConstants:(II)Ljava/lang/String;
   #96 = Utf8               ext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$mockProvider$1
   #97 = Class              #96           // ext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$mockProvider$1
   #98 = Utf8               <init>
   #99 = NameAndType        #98:#70       // "<init>":()V
  #100 = Methodref          #97.#99       // ext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$mockProvider$1."<init>":()V
  #101 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
  #102 = Class              #101          // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
  #103 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider
  #104 = Class              #103          // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider
  #105 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;)V
  #106 = NameAndType        #98:#105      // "<init>":(Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;)V
  #107 = Methodref          #102.#106     // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer."<init>":(Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;)V
  #108 = Utf8               ext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$1
  #109 = Class              #108          // ext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$1
  #110 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;IILext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$mockProvider$1;Lkotlin/coroutines/Continuation;)V
  #111 = NameAndType        #98:#110      // "<init>":(Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;IILext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$mockProvider$1;Lkotlin/coroutines/Continuation;)V
  #112 = Methodref          #109.#111     // ext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$1."<init>":(Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;IILext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$mockProvider$1;Lkotlin/coroutines/Continuation;)V
  #113 = Utf8               kotlin/jvm/functions/Function2
  #114 = Class              #113          // kotlin/jvm/functions/Function2
  #115 = Utf8               kotlinx/coroutines/BuildersKt
  #116 = Class              #115          // kotlinx/coroutines/BuildersKt
  #117 = Utf8               runBlocking$default
  #118 = Utf8               (Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;
  #119 = NameAndType        #117:#118     // runBlocking$default:(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;
  #120 = Methodref          #116.#119     // kotlinx/coroutines/BuildersKt.runBlocking$default:(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;
  #121 = Utf8               \n? Geração concluída com sucesso!
  #122 = String             #121          // \n? Geração concluída com sucesso!
  #123 = Utf8               mockProvider
  #124 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$mockProvider$1;
  #125 = Utf8               indexer
  #126 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer;
  #127 = Utf8               regionX
  #128 = Utf8               I
  #129 = Utf8               regionY
  #130 = Utf8               \n[Benchmark] Preparando ambiente de teste...
  #131 = String             #130          // \n[Benchmark] Preparando ambiente de teste...
  #132 = Utf8               l2br_benchmark
  #133 = String             #132          // l2br_benchmark
  #134 = Utf8               .l2br
  #135 = String             #134          // .l2br
  #136 = Utf8               java/nio/file/attribute/FileAttribute
  #137 = Class              #136          // java/nio/file/attribute/FileAttribute
  #138 = Utf8               java/util/Arrays
  #139 = Class              #138          // java/util/Arrays
  #140 = Utf8               copyOf
  #141 = Utf8               ([Ljava/lang/Object;I)[Ljava/lang/Object;
  #142 = NameAndType        #140:#141     // copyOf:([Ljava/lang/Object;I)[Ljava/lang/Object;
  #143 = Methodref          #139.#142     // java/util/Arrays.copyOf:([Ljava/lang/Object;I)[Ljava/lang/Object;
  #144 = Utf8               [Ljava/nio/file/attribute/FileAttribute;
  #145 = Class              #144          // "[Ljava/nio/file/attribute/FileAttribute;"
  #146 = Utf8               java/nio/file/Files
  #147 = Class              #146          // java/nio/file/Files
  #148 = Utf8               createTempFile
  #149 = Utf8               (Ljava/lang/String;Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;
  #150 = NameAndType        #148:#149     // createTempFile:(Ljava/lang/String;Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;
  #151 = Methodref          #147.#150     // java/nio/file/Files.createTempFile:(Ljava/lang/String;Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;
  #152 = Utf8               createTempFile(...)
  #153 = String             #152          // createTempFile(...)
  #154 = Utf8               kotlin/jvm/internal/Intrinsics
  #155 = Class              #154          // kotlin/jvm/internal/Intrinsics
  #156 = Utf8               checkNotNullExpressionValue
  #157 = Utf8               (Ljava/lang/Object;Ljava/lang/String;)V
  #158 = NameAndType        #156:#157     // checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
  #159 = Methodref          #155.#158     // kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
  #160 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader
  #161 = Class              #160          // ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader
  #162 = Integer            65536
  #163 = Long               64l
  #165 = Long               262208l
  #167 = Utf8               (JSSSIJJJILkotlin/jvm/internal/DefaultConstructorMarker;)V
  #168 = NameAndType        #98:#167      // "<init>":(JSSSIJJJILkotlin/jvm/internal/DefaultConstructorMarker;)V
  #169 = Methodref          #161.#168     // ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader."<init>":(JSSSIJJJILkotlin/jvm/internal/DefaultConstructorMarker;)V
  #170 = Utf8               ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage
  #171 = Class              #170          // ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage
  #172 = Utf8               Companion
  #173 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$Companion;
  #174 = NameAndType        #172:#173     // Companion:Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$Companion;
  #175 = Fieldref           #171.#174     // ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage.Companion:Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$Companion;
  #176 = Long               10000000l
  #178 = Utf8               java/lang/Long
  #179 = Class              #178          // java/lang/Long
  #180 = Utf8               valueOf
  #181 = Utf8               (J)Ljava/lang/Long;
  #182 = NameAndType        #180:#181     // valueOf:(J)Ljava/lang/Long;
  #183 = Methodref          #179.#182     // java/lang/Long.valueOf:(J)Ljava/lang/Long;
  #184 = Utf8               ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$Companion
  #185 = Class              #184          // ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$Companion
  #186 = Utf8               create
  #187 = Utf8               (Ljava/nio/file/Path;Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;Ljava/lang/Long;)Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
  #188 = NameAndType        #186:#187     // create:(Ljava/nio/file/Path;Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;Ljava/lang/Long;)Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
  #189 = Methodref          #185.#188     // ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$Companion.create:(Ljava/nio/file/Path;Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;Ljava/lang/Long;)Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
  #190 = Utf8               getNodeCount
  #191 = NameAndType        #190:#31      // getNodeCount:()I
  #192 = Methodref          #161.#191     // ext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader.getNodeCount:()I
  #193 = Utf8                 Preenchendo \u0001 nós de teste...
  #194 = String             #193          //   Preenchendo \u0001 nós de teste...
  #195 = Utf8               (I)Ljava/lang/String;
  #196 = NameAndType        #88:#195      // makeConcatWithConstants:(I)Ljava/lang/String;
  #197 = InvokeDynamic      #1:#196       // #1:makeConcatWithConstants:(I)Ljava/lang/String;
  #198 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder
  #199 = Class              #198          // ext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder
  #200 = Methodref          #199.#99      // ext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder."<init>":()V
  #201 = Utf8               setPosition
  #202 = Utf8               (IIS)V
  #203 = NameAndType        #201:#202     // setPosition:(IIS)V
  #204 = Methodref          #199.#203     // ext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder.setPosition:(IIS)V
  #205 = Utf8               setWalkable
  #206 = Utf8               (Z)V
  #207 = NameAndType        #205:#206     // setWalkable:(Z)V
  #208 = Methodref          #199.#207     // ext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder.setWalkable:(Z)V
  #209 = Utf8               setDynamic
  #210 = NameAndType        #209:#206     // setDynamic:(Z)V
  #211 = Methodref          #199.#210     // ext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder.setDynamic:(Z)V
  #212 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/Direction
  #213 = Class              #212          // ext/mods/gameserver/geoengine/pathfinding/model/Direction
  #214 = Utf8               getEntries
  #215 = Utf8               ()Lkotlin/enums/EnumEntries;
  #216 = NameAndType        #214:#215     // getEntries:()Lkotlin/enums/EnumEntries;
  #217 = Methodref          #213.#216     // ext/mods/gameserver/geoengine/pathfinding/model/Direction.getEntries:()Lkotlin/enums/EnumEntries;
  #218 = Utf8               java/lang/Iterable
  #219 = Class              #218          // java/lang/Iterable
  #220 = Utf8               iterator
  #221 = Utf8               ()Ljava/util/Iterator;
  #222 = NameAndType        #220:#221     // iterator:()Ljava/util/Iterator;
  #223 = InterfaceMethodref #219.#222     // java/lang/Iterable.iterator:()Ljava/util/Iterator;
  #224 = Utf8               java/util/Iterator
  #225 = Class              #224          // java/util/Iterator
  #226 = Utf8               hasNext
  #227 = Utf8               ()Z
  #228 = NameAndType        #226:#227     // hasNext:()Z
  #229 = InterfaceMethodref #225.#228     // java/util/Iterator.hasNext:()Z
  #230 = Utf8               next
  #231 = Utf8               ()Ljava/lang/Object;
  #232 = NameAndType        #230:#231     // next:()Ljava/lang/Object;
  #233 = InterfaceMethodref #225.#232     // java/util/Iterator.next:()Ljava/lang/Object;
  #234 = Utf8               kotlin/collections/CollectionsKt
  #235 = Class              #234          // kotlin/collections/CollectionsKt
  #236 = Utf8               throwIndexOverflow
  #237 = NameAndType        #236:#70      // throwIndexOverflow:()V
  #238 = Methodref          #235.#237     // kotlin/collections/CollectionsKt.throwIndexOverflow:()V
  #239 = Utf8               setJpsDistance
  #240 = NameAndType        #239:#66      // setJpsDistance:(II)V
  #241 = Methodref          #199.#240     // ext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder.setJpsDistance:(II)V
  #242 = Utf8               writeNode
  #243 = Utf8               (ILext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder;)V
  #244 = NameAndType        #242:#243     // writeNode:(ILext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder;)V
  #245 = Methodref          #171.#244     // ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage.writeNode:(ILext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder;)V
  #246 = Utf8               force
  #247 = NameAndType        #246:#70      // force:()V
  #248 = Methodref          #171.#247     // ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage.force:()V
  #249 = Utf8               ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer
  #250 = Class              #249          // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer
  #251 = Utf8               (IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
  #252 = NameAndType        #98:#251      // "<init>":(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
  #253 = Methodref          #250.#252     // ext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer."<init>":(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
  #254 = Utf8               ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine
  #255 = Class              #254          // ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine
  #256 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;)V
  #257 = NameAndType        #98:#256      // "<init>":(Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;)V
  #258 = Methodref          #255.#257     // ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine."<init>":(Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;)V
  #259 = Utf8               \n[Benchmark] Executando warm-up...
  #260 = String             #259          // \n[Benchmark] Executando warm-up...
  #261 = Utf8               ext/mods/gameserver/geoengine/pathfinding/MainKt$runBenchmark$2
  #262 = Class              #261          // ext/mods/gameserver/geoengine/pathfinding/MainKt$runBenchmark$2
  #263 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;Lkotlin/coroutines/Continuation;)V
  #264 = NameAndType        #98:#263      // "<init>":(Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;Lkotlin/coroutines/Continuation;)V
  #265 = Methodref          #262.#264     // ext/mods/gameserver/geoengine/pathfinding/MainKt$runBenchmark$2."<init>":(Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;Lkotlin/coroutines/Continuation;)V
  #266 = Utf8               \n[Benchmark] Executando testes de performance...
  #267 = String             #266          // \n[Benchmark] Executando testes de performance...
  #268 = Integer            100000
  #269 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/PerformanceMetrics
  #270 = Class              #269          // ext/mods/gameserver/geoengine/pathfinding/model/PerformanceMetrics
  #271 = Methodref          #270.#99      // ext/mods/gameserver/geoengine/pathfinding/model/PerformanceMetrics."<init>":()V
  #272 = Utf8               java/util/concurrent/ThreadLocalRandom
  #273 = Class              #272          // java/util/concurrent/ThreadLocalRandom
  #274 = Utf8               current
  #275 = Utf8               ()Ljava/util/concurrent/ThreadLocalRandom;
  #276 = NameAndType        #274:#275     // current:()Ljava/util/concurrent/ThreadLocalRandom;
  #277 = Methodref          #273.#276     // java/util/concurrent/ThreadLocalRandom.current:()Ljava/util/concurrent/ThreadLocalRandom;
  #278 = Utf8               currentTimeMillis
  #279 = Utf8               ()J
  #280 = NameAndType        #278:#279     // currentTimeMillis:()J
  #281 = Methodref          #11.#280      // java/lang/System.currentTimeMillis:()J
  #282 = Integer            110000
  #283 = Utf8               nextInt
  #284 = Utf8               (II)I
  #285 = NameAndType        #283:#284     // nextInt:(II)I
  #286 = Methodref          #273.#285     // java/util/concurrent/ThreadLocalRandom.nextInt:(II)I
  #287 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/Location
  #288 = Class              #287          // ext/mods/gameserver/geoengine/pathfinding/model/Location
  #289 = Utf8               (III)V
  #290 = NameAndType        #98:#289      // "<init>":(III)V
  #291 = Methodref          #288.#290     // ext/mods/gameserver/geoengine/pathfinding/model/Location."<init>":(III)V
  #292 = Utf8               nanoTime
  #293 = NameAndType        #292:#279     // nanoTime:()J
  #294 = Methodref          #11.#293      // java/lang/System.nanoTime:()J
  #295 = Utf8               findPath
  #296 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/model/Location;Lext/mods/gameserver/geoengine/pathfinding/model/Location;)Ljava/util/List;
  #297 = NameAndType        #295:#296     // findPath:(Lext/mods/gameserver/geoengine/pathfinding/model/Location;Lext/mods/gameserver/geoengine/pathfinding/model/Location;)Ljava/util/List;
  #298 = Methodref          #255.#297     // ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine.findPath:(Lext/mods/gameserver/geoengine/pathfinding/model/Location;Lext/mods/gameserver/geoengine/pathfinding/model/Location;)Ljava/util/List;
  #299 = Utf8               record
  #300 = Utf8               (J)V
  #301 = NameAndType        #299:#300     // record:(J)V
  #302 = Methodref          #270.#301     // ext/mods/gameserver/geoengine/pathfinding/model/PerformanceMetrics.record:(J)V
  #303 = Utf8               \n=== Resultados do Benchmark ===
  #304 = String             #303          // \n=== Resultados do Benchmark ===
  #305 = Utf8               Iterações: \u0001
  #306 = String             #305          // Iterações: \u0001
  #307 = InvokeDynamic      #2:#196       // #2:makeConcatWithConstants:(I)Ljava/lang/String;
  #308 = Utf8               Tempo total: \u0001ms
  #309 = String             #308          // Tempo total: \u0001ms
  #310 = Utf8               (J)Ljava/lang/String;
  #311 = NameAndType        #88:#310      // makeConcatWithConstants:(J)Ljava/lang/String;
  #312 = InvokeDynamic      #3:#311       // #3:makeConcatWithConstants:(J)Ljava/lang/String;
  #313 = Double             1000.0d
  #315 = Utf8               Throughput: \u0001 pathfindings/segundo
  #316 = String             #315          // Throughput: \u0001 pathfindings/segundo
  #317 = Utf8               (D)Ljava/lang/String;
  #318 = NameAndType        #88:#317      // makeConcatWithConstants:(D)Ljava/lang/String;
  #319 = InvokeDynamic      #4:#318       // #4:makeConcatWithConstants:(D)Ljava/lang/String;
  #320 = Utf8
  #321 = String             #320          //
  #322 = Utf8               Latências:
  #323 = String             #322          // Latências:
  #324 = Utf8               getAverage
  #325 = Utf8               ()D
  #326 = NameAndType        #324:#325     // getAverage:()D
  #327 = Methodref          #270.#326     // ext/mods/gameserver/geoengine/pathfinding/model/PerformanceMetrics.getAverage:()D
  #328 = Utf8                 Média: \u0001?s
  #329 = String             #328          //   Média: \u0001?s
  #330 = InvokeDynamic      #5:#318       // #5:makeConcatWithConstants:(D)Ljava/lang/String;
  #331 = Double             50.0d
  #333 = Utf8               getPercentile
  #334 = Utf8               (D)D
  #335 = NameAndType        #333:#334     // getPercentile:(D)D
  #336 = Methodref          #270.#335     // ext/mods/gameserver/geoengine/pathfinding/model/PerformanceMetrics.getPercentile:(D)D
  #337 = Utf8                 P50:   \u0001?s
  #338 = String             #337          //   P50:   \u0001?s
  #339 = InvokeDynamic      #6:#318       // #6:makeConcatWithConstants:(D)Ljava/lang/String;
  #340 = Double             90.0d
  #342 = Utf8                 P90:   \u0001?s
  #343 = String             #342          //   P90:   \u0001?s
  #344 = InvokeDynamic      #7:#318       // #7:makeConcatWithConstants:(D)Ljava/lang/String;
  #345 = Double             99.0d
  #347 = Utf8                 P99:   \u0001?s
  #348 = String             #347          //   P99:   \u0001?s
  #349 = InvokeDynamic      #8:#318       // #8:makeConcatWithConstants:(D)Ljava/lang/String;
  #350 = Double             99.9d
  #352 = Utf8                 P99.9: \u0001?s
  #353 = String             #352          //   P99.9: \u0001?s
  #354 = InvokeDynamic      #9:#318       // #9:makeConcatWithConstants:(D)Ljava/lang/String;
  #355 = Utf8               getMax
  #356 = NameAndType        #355:#279     // getMax:()J
  #357 = Methodref          #270.#356     // ext/mods/gameserver/geoengine/pathfinding/model/PerformanceMetrics.getMax:()J
  #358 = Utf8                 Max:   \u0001?s
  #359 = String             #358          //   Max:   \u0001?s
  #360 = InvokeDynamic      #10:#318      // #10:makeConcatWithConstants:(D)Ljava/lang/String;
  #361 = Utf8               close
  #362 = NameAndType        #361:#70      // close:()V
  #363 = Methodref          #255.#362     // ext/mods/gameserver/geoengine/pathfinding/core/L2BREngine.close:()V
  #364 = Utf8               java/nio/file/Path
  #365 = Class              #364          // java/nio/file/Path
  #366 = Utf8               toFile
  #367 = Utf8               ()Ljava/io/File;
  #368 = NameAndType        #366:#367     // toFile:()Ljava/io/File;
  #369 = InterfaceMethodref #365.#368     // java/nio/file/Path.toFile:()Ljava/io/File;
  #370 = Utf8               java/io/File
  #371 = Class              #370          // java/io/File
  #372 = Utf8               delete
  #373 = NameAndType        #372:#227     // delete:()Z
  #374 = Methodref          #371.#373     // java/io/File.delete:()Z
  #375 = Utf8               \n? Benchmark concluído!
  #376 = String             #375          // \n? Benchmark concluído!
  #377 = Utf8               $i$a$-forEachIndexed-MainKt$runBenchmark$1
  #378 = Utf8               idx
  #379 = Utf8               item$iv
  #380 = Utf8               Ljava/lang/Object;
  #381 = Utf8               $i$f$forEachIndexed
  #382 = Utf8               index$iv
  #383 = Utf8               $this$forEachIndexed$iv
  #384 = Utf8               Ljava/lang/Iterable;
  #385 = Utf8               x
  #386 = Utf8               y
  #387 = Utf8               i
  #388 = Utf8               $i$a$-measureNanoTime-MainKt$runBenchmark$benchmarkTime$1$1$duration$1
  #389 = Utf8               $i$f$measureNanoTime
  #390 = Utf8               start$iv
  #391 = Utf8               J
  #392 = Utf8               $i$a$-repeat-MainKt$runBenchmark$benchmarkTime$1$1
  #393 = Utf8               startX
  #394 = Utf8               startY
  #395 = Utf8               endX
  #396 = Utf8               endY
  #397 = Utf8               start
  #398 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/Location;
  #399 = Utf8               end
  #400 = Utf8               duration
  #401 = Utf8               it
  #402 = Utf8               $i$a$-measureTimeMillis-MainKt$runBenchmark$benchmarkTime$1
  #403 = Utf8               $i$f$measureTimeMillis
  #404 = Utf8               tempFile
  #405 = Utf8               Ljava/nio/file/Path;
  #406 = Utf8               header
  #407 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/L2BRHeader;
  #408 = Utf8               storage
  #409 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/native/NativeStorage;
  #410 = Utf8               builder
  #411 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/PathNodeBuilder;
  #412 = Utf8               dynamicLayer
  #413 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/dynamic/DynamicObstacleLayer;
  #414 = Utf8               engine
  #415 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/core/L2BREngine;
  #416 = Utf8               iterations
  #417 = Utf8               metrics
  #418 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/PerformanceMetrics;
  #419 = Utf8               random
  #420 = Utf8               Ljava/util/concurrent/ThreadLocalRandom;
  #421 = Utf8               benchmarkTime
  #422 = Utf8               \n[WarmUp] Demonstração do sistema de warm-up...
  #423 = String             #422          // \n[WarmUp] Demonstração do sistema de warm-up...
  #424 = Utf8               Este sistema elimina cold start garantindo <5?s desde o primeiro pathfinding.\n
  #425 = String             #424          // Este sistema elimina cold start garantindo <5?s desde o primeiro pathfinding.\n
  #426 = Utf8               Fase 1: Simulando cold start (sem warm-up)
  #427 = String             #426          // Fase 1: Simulando cold start (sem warm-up)
  #428 = Utf8                 - Primeiras iterações: 50-200?s (compilação JIT)
  #429 = String             #428          //   - Primeiras iterações: 50-200?s (compilação JIT)
  #430 = Utf8                 - Page faults: Alto (memória não carregada)
  #431 = String             #430          //   - Page faults: Alto (memória não carregada)
  #432 = Utf8                 - Branch misses: Alto (preditor não treinado)
  #433 = String             #432          //   - Branch misses: Alto (preditor não treinado)
  #434 = Utf8               \nFase 2: Executando warm-up determinístico
  #435 = String             #434          // \nFase 2: Executando warm-up determinístico
  #436 = Utf8                 1. Memory prefetch: Carrega páginas para RAM
  #437 = String             #436          //   1. Memory prefetch: Carrega páginas para RAM
  #438 = Utf8                 2. JIT compilation: Força compilação C2
  #439 = String             #438          //   2. JIT compilation: Força compilação C2
  #440 = Utf8                 3. Branch training: Treina preditor de CPU
  #441 = String             #440          //   3. Branch training: Treina preditor de CPU
  #442 = Utf8                 4. Cache warming: Preenche caches de aplicação
  #443 = String             #442          //   4. Cache warming: Preenche caches de aplicação
  #444 = Utf8               \nFase 3: Resultado
  #445 = String             #444          // \nFase 3: Resultado
  #446 = Utf8                 - Latência estável desde a primeira requisição real
  #447 = String             #446          //   - Latência estável desde a primeira requisição real
  #448 = Utf8                 - P99 < 5?s garantido
  #449 = String             #448          //   - P99 < 5?s garantido
  #450 = Utf8                 - Zero lag perceptível para jogadores
  #451 = String             #450          //   - Zero lag perceptível para jogadores
  #452 = Utf8               \n? Warm-up é essencial para produção!
  #453 = String             #452          // \n? Warm-up é essencial para produção!
  #454 = Utf8               getGEO_CELLS_X
  #455 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/model/GeoStructure;)I
  #456 = Integer            32768
  #457 = Utf8               $this$GEO_CELLS_X
  #458 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/GeoStructure;
  #459 = Utf8               Lkotlin/Metadata;
  #460 = Utf8               mv
  #461 = Integer            2
  #462 = Integer            3
  #463 = Integer            0
  #464 = Utf8               k
  #465 = Utf8               xi
  #466 = Integer            48
  #467 = Utf8               d1
  #468 = Utf8               \u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005\u001a\b\u0010\u0006\u001a\u00020\u0001H\u0002\u001a\u0018\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002\u001a\b\u0010\u000b\u001a\u00020\u0001H\u0002\u001a\b\u0010\f\u001a\u00020\u0001H\u0002\"\u0015\u0010\r\u001a\u00020\t*\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011
  #469 = Utf8               d2
  #470 = Utf8               GEO_CELLS_X
  #471 = Utf8               Brproject
  #472 = Utf8               GeoDataProvider
  #473 = Utf8               Main.kt
  #474 = Utf8               Lkotlin/jvm/internal/SourceDebugExtension;
  #475 = Utf8               value
  #476 = Utf8               SMAP\nMain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Main.kt\next/mods/gameserver/geoengine/pathfinding/MainKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Timing.kt\nkotlin/system/TimingKt\n*L\n1#1,269:1\n1924#2,3:270\n29#3,2:273\n45#3,3:275\n31#3:278\n*S KotlinDebug\n*F\n+ 1 Main.kt\next/mods/gameserver/geoengine/pathfinding/MainKt\n*L\n188#1:270,3\n211#1:273,2\n221#1:275,3\n211#1:278\n*E\n
  #477 = Utf8               Code
  #478 = Utf8               StackMapTable
  #479 = Utf8               LineNumberTable
  #480 = Utf8               LocalVariableTable
  #481 = Utf8               RuntimeInvisibleParameterAnnotations
  #482 = Utf8               InnerClasses
  #483 = Utf8               SourceFile
  #484 = Utf8               SourceDebugExtension
  #485 = Utf8               RuntimeVisibleAnnotations
  #486 = Utf8               RuntimeInvisibleAnnotations
  #487 = Utf8               BootstrapMethods
{
  public static final void main(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=3, locals=2, args_size=1
         0: ldc           #9                  // String ????????????????????????????????????????????????????????????????\n?           L2BR Pathfinder V5 - Demonstração                   ?\n?     Ultra-Scale Pathfinding for Lineage 2 Java Servers       ?\n????????????????????????????????????????????????????????????????
         2: astore_1
         3: getstatic     #15                 // Field java/lang/System.out:Ljava/io/PrintStream;
         6: aload_1
         7: invokevirtual #21                 // Method java/io/PrintStream.println:(Ljava/lang/Object;)V
        10: aload_0
        11: invokestatic  #27                 // Method kotlin/collections/ArraysKt.firstOrNull:([Ljava/lang/Object;)Ljava/lang/Object;
        14: checkcast     #29                 // class java/lang/String
        17: astore_1
        18: aload_1
        19: ifnull        236
        22: aload_1
        23: invokevirtual #33                 // Method java/lang/String.hashCode:()I
        26: lookupswitch  { // 6

              -795012128: 132

                    1499: 108

                 3198785: 84

               668139773: 144

              1333069025: 96

              1810371957: 120
                 default: 236
            }
        84: aload_1
        85: ldc           #35                 // String help
        87: invokevirtual #39                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
        90: ifne          230
        93: goto          236
        96: aload_1
        97: ldc           #41                 // String --help
        99: invokevirtual #39                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       102: ifne          230
       105: goto          236
       108: aload_1
       109: ldc           #43                 // String -h
       111: invokevirtual #39                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       114: ifne          230
       117: goto          236
       120: aload_1
       121: ldc           #45                 // String generate
       123: invokevirtual #39                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       126: ifne          156
       129: goto          236
       132: aload_1
       133: ldc           #47                 // String warmup
       135: invokevirtual #39                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       138: ifne          224
       141: goto          236
       144: aload_1
       145: ldc           #49                 // String benchmark
       147: invokevirtual #39                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       150: ifne          218
       153: goto          236
       156: aload_0
       157: iconst_1
       158: invokestatic  #53                 // Method kotlin/collections/ArraysKt.getOrNull:([Ljava/lang/Object;I)Ljava/lang/Object;
       161: checkcast     #29                 // class java/lang/String
       164: dup
       165: ifnull        181
       168: invokestatic  #59                 // Method kotlin/text/StringsKt.toIntOrNull:(Ljava/lang/String;)Ljava/lang/Integer;
       171: dup
       172: ifnull        181
       175: invokevirtual #64                 // Method java/lang/Integer.intValue:()I
       178: goto          184
       181: pop
       182: bipush        20
       184: aload_0
       185: iconst_2
       186: invokestatic  #53                 // Method kotlin/collections/ArraysKt.getOrNull:([Ljava/lang/Object;I)Ljava/lang/Object;
       189: checkcast     #29                 // class java/lang/String
       192: dup
       193: ifnull        209
       196: invokestatic  #59                 // Method kotlin/text/StringsKt.toIntOrNull:(Ljava/lang/String;)Ljava/lang/Integer;
       199: dup
       200: ifnull        209
       203: invokevirtual #64                 // Method java/lang/Integer.intValue:()I
       206: goto          212
       209: pop
       210: bipush        25
       212: invokestatic  #68                 // Method runGeneration:(II)V
       215: goto          239
       218: invokestatic  #72                 // Method runBenchmark:()V
       221: goto          239
       224: invokestatic  #75                 // Method runWarmUpDemo:()V
       227: goto          239
       230: invokestatic  #78                 // Method printHelp:()V
       233: goto          239
       236: invokestatic  #78                 // Method printHelp:()V
       239: return
      StackMapTable: number_of_entries = 16
        frame_type = 252 /* append */
          offset_delta = 84
          locals = [ class java/lang/String ]
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 88 /* same_locals_1_stack_item */
          stack = [ class java/lang/Object ]
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 24
          locals = [ class "[Ljava/lang/String;", class java/lang/String ]
          stack = [ int, class java/lang/Object ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class "[Ljava/lang/String;", class java/lang/String ]
          stack = [ int, int ]
        frame_type = 5 /* same */
        frame_type = 5 /* same */
        frame_type = 5 /* same */
        frame_type = 5 /* same */
        frame_type = 2 /* same */
      LineNumberTable:
        line 42: 0
        line 37: 3
        line 44: 10
        line 45: 156
        line 46: 184
        line 45: 212
        line 47: 218
        line 48: 224
        line 49: 230
        line 50: 236
        line 52: 239
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     240     0  args   [Ljava/lang/String;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #7()
          org.jetbrains.annotations.NotNull

  public static final int getGEO_CELLS_X(ext.mods.gameserver.geoengine.pathfinding.model.GeoStructure);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/model/GeoStructure;)I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: ldc_w         #456                // int 32768
         3: ireturn
      LineNumberTable:
        line 269: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0 $this$GEO_CELLS_X   Lext/mods/gameserver/geoengine/pathfinding/model/GeoStructure;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #7()
          org.jetbrains.annotations.NotNull
}
InnerClasses:
  static final #262;                      // class ext/mods/gameserver/geoengine/pathfinding/MainKt$runBenchmark$2
  public static final #97;                // class ext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$mockProvider$1
  static final #109;                      // class ext/mods/gameserver/geoengine/pathfinding/MainKt$runGeneration$1
  public static #472= #104 of #102;       // GeoDataProvider=class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider of class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
  public static final #172= #185 of #171; // Companion=class ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage$Companion of class ext/mods/gameserver/geoengine/pathfinding/native/NativeStorage
SourceFile: "Main.kt"
SourceDebugExtension:
  SMAP
  Main.kt
  Kotlin
  *S Kotlin
  *F
  + 1 Main.kt
  ext/mods/gameserver/geoengine/pathfinding/MainKt
  + 2 _Collections.kt
  kotlin/collections/CollectionsKt___CollectionsKt
  + 3 Timing.kt
  kotlin/system/TimingKt
  *L
  1#1,269:1
  1924#2,3:270
  29#3,2:273
  45#3,3:275
  31#3:278
  *S KotlinDebug
  *F
  + 1 Main.kt
  ext/mods/gameserver/geoengine/pathfinding/MainKt
  *L
  188#1:270,3
  211#1:273,2
  221#1:275,3
  211#1:278
  *E
RuntimeVisibleAnnotations:
  0: #459(#460=[I#461,I#462,I#463],#464=I#461,#465=I#466,#467=[s#468],#469=[s#5,s#320,s#79,s#320,s#320,s#6,s#76,s#65,s#127,s#320,s#129,s#69,s#73,s#470,s#458,s#454,s#455,s#471])
    kotlin.Metadata(
      mv=[2,3,0]
      k=2
      xi=48
      d1=["\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005\u001a\b\u0010\u0006\u001a\u00020\u0001H\u0002\u001a\u0018\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002\u001a\b\u0010\u000b\u001a\u00020\u0001H\u0002\u001a\b\u0010\f\u001a\u00020\u0001H\u0002\"\u0015\u0010\r\u001a\u00020\t*\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"]
      d2=["main","","args","","","([Ljava/lang/String;)V","printHelp","runGeneration","regionX","","regionY","runBenchmark","runWarmUpDemo","GEO_CELLS_X","Lext/mods/gameserver/geoengine/pathfinding/model/GeoStructure;","getGEO_CELLS_X","(Lext/mods/gameserver/geoengine/pathfinding/model/GeoStructure;)I","Brproject"]
    )
RuntimeInvisibleAnnotations:
  0: #474(#475=[s#476])
    kotlin.jvm.internal.SourceDebugExtension(
      value=["SMAP\nMain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Main.kt\next/mods/gameserver/geoengine/pathfinding/MainKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Timing.kt\nkotlin/system/TimingKt\n*L\n1#1,269:1\n1924#2,3:270\n29#3,2:273\n45#3,3:275\n31#3:278\n*S KotlinDebug\n*F\n+ 1 Main.kt\next/mods/gameserver/geoengine/pathfinding/MainKt\n*L\n188#1:270,3\n211#1:273,2\n221#1:275,3\n211#1:278\n*E\n"]
    )
BootstrapMethods:
  0: #92 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #85 \n[1/4] Iniciando geração para região [\u0001, \u0001]...
  1: #92 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #194   Preenchendo \u0001 nós de teste...
  2: #92 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #306 Iterações: \u0001
  3: #92 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #309 Tempo total: \u0001ms
  4: #92 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #316 Throughput: \u0001 pathfindings/segundo
  5: #92 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #329   Média: \u0001?s
  6: #92 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #338   P50:   \u0001?s
  7: #92 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #343   P90:   \u0001?s
  8: #92 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #348   P99:   \u0001?s
  9: #92 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #353   P99.9: \u0001?s
  10: #92 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #359   Max:   \u0001?s
