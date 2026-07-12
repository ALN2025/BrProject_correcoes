// Bytecode for: ext.mods.gameserver.geoengine.pathfinding.integration.L2BRAdminCommands
// File: ext\mods\gameserver\geoengine\pathfinding\integration\L2BRAdminCommands.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands.class
  Last modified 9 de jul de 2026; size 30508 bytes
  MD5 checksum 42781167a51ac3458023b5aaa8c5b953
  Compiled from "AdminCommands.kt"
public final class ext.mods.gameserver.geoengine.pathfinding.integration.L2BRAdminCommands
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #2                          // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 6, methods: 28, attributes: 6
Constant pool:
    #1 = Utf8               ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands
    #2 = Class              #1            // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands
    #3 = Utf8               java/lang/Object
    #4 = Class              #3            // java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;Ljava/nio/file/Path;)V
    #7 = Utf8               Lorg/jetbrains/annotations/NotNull;
    #8 = Utf8               ()V
    #9 = NameAndType        #5:#8         // "<init>":()V
   #10 = Methodref          #4.#9         // java/lang/Object."<init>":()V
   #11 = Utf8               bridge
   #12 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;
   #13 = NameAndType        #11:#12       // bridge:Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;
   #14 = Fieldref           #2.#13        // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands.bridge:Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;
   #15 = Utf8               geoDataProvider
   #16 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;
   #17 = NameAndType        #15:#16       // geoDataProvider:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;
   #18 = Fieldref           #2.#17        // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands.geoDataProvider:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;
   #19 = Utf8               outputPath
   #20 = Utf8               Ljava/nio/file/Path;
   #21 = NameAndType        #19:#20       // outputPath:Ljava/nio/file/Path;
   #22 = Fieldref           #2.#21        // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands.outputPath:Ljava/nio/file/Path;
   #23 = Utf8               java/util/concurrent/ConcurrentHashMap
   #24 = Class              #23           // java/util/concurrent/ConcurrentHashMap
   #25 = Methodref          #24.#9        // java/util/concurrent/ConcurrentHashMap."<init>":()V
   #26 = Utf8               activeGenerations
   #27 = Utf8               Ljava/util/concurrent/ConcurrentHashMap;
   #28 = NameAndType        #26:#27       // activeGenerations:Ljava/util/concurrent/ConcurrentHashMap;
   #29 = Fieldref           #2.#28        // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands.activeGenerations:Ljava/util/concurrent/ConcurrentHashMap;
   #30 = Utf8               ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer
   #31 = Class              #30           // ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer
   #32 = Methodref          #31.#9        // ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer."<init>":()V
   #33 = Utf8               serializer
   #34 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer;
   #35 = NameAndType        #33:#34       // serializer:Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer;
   #36 = Fieldref           #2.#35        // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands.serializer:Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer;
   #37 = Utf8               this
   #38 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;
   #39 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;Ljava/nio/file/Path;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
   #40 = Utf8               data/pathfinder/
   #41 = String             #40           // data/pathfinder/
   #42 = Utf8               java/lang/String
   #43 = Class              #42           // java/lang/String
   #44 = Utf8               java/nio/file/Paths
   #45 = Class              #44           // java/nio/file/Paths
   #46 = Utf8               get
   #47 = Utf8               (Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
   #48 = NameAndType        #46:#47       // get:(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
   #49 = Methodref          #45.#48       // java/nio/file/Paths.get:(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
   #50 = NameAndType        #5:#6         // "<init>":(Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;Ljava/nio/file/Path;)V
   #51 = Methodref          #2.#50        // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands."<init>":(Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;Ljava/nio/file/Path;)V
   #52 = Utf8               processCommand
   #53 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;)Z
   #54 = Utf8               java/util/StringTokenizer
   #55 = Class              #54           // java/util/StringTokenizer
   #56 = Utf8               (Ljava/lang/String;)V
   #57 = NameAndType        #5:#56        // "<init>":(Ljava/lang/String;)V
   #58 = Methodref          #55.#57       // java/util/StringTokenizer."<init>":(Ljava/lang/String;)V
   #59 = Utf8               hasMoreTokens
   #60 = Utf8               ()Z
   #61 = NameAndType        #59:#60       // hasMoreTokens:()Z
   #62 = Methodref          #55.#61       // java/util/StringTokenizer.hasMoreTokens:()Z
   #63 = Utf8               nextToken
   #64 = Utf8               ()Ljava/lang/String;
   #65 = NameAndType        #63:#64       // nextToken:()Ljava/lang/String;
   #66 = Methodref          #55.#65       // java/util/StringTokenizer.nextToken:()Ljava/lang/String;
   #67 = Utf8               java/util/Locale
   #68 = Class              #67           // java/util/Locale
   #69 = Utf8               ROOT
   #70 = Utf8               Ljava/util/Locale;
   #71 = NameAndType        #69:#70       // ROOT:Ljava/util/Locale;
   #72 = Fieldref           #68.#71       // java/util/Locale.ROOT:Ljava/util/Locale;
   #73 = Utf8               toLowerCase
   #74 = Utf8               (Ljava/util/Locale;)Ljava/lang/String;
   #75 = NameAndType        #73:#74       // toLowerCase:(Ljava/util/Locale;)Ljava/lang/String;
   #76 = Methodref          #43.#75       // java/lang/String.toLowerCase:(Ljava/util/Locale;)Ljava/lang/String;
   #77 = Utf8               toLowerCase(...)
   #78 = String             #77           // toLowerCase(...)
   #79 = Utf8               kotlin/jvm/internal/Intrinsics
   #80 = Class              #79           // kotlin/jvm/internal/Intrinsics
   #81 = Utf8               checkNotNullExpressionValue
   #82 = Utf8               (Ljava/lang/Object;Ljava/lang/String;)V
   #83 = NameAndType        #81:#82       // checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
   #84 = Methodref          #80.#83       // kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
   #85 = Utf8               hashCode
   #86 = Utf8               ()I
   #87 = NameAndType        #85:#86       // hashCode:()I
   #88 = Methodref          #43.#87       // java/lang/String.hashCode:()I
   #89 = Utf8               //l2br_reload
   #90 = String             #89           // //l2br_reload
   #91 = Utf8               equals
   #92 = Utf8               (Ljava/lang/Object;)Z
   #93 = NameAndType        #91:#92       // equals:(Ljava/lang/Object;)Z
   #94 = Methodref          #43.#93       // java/lang/String.equals:(Ljava/lang/Object;)Z
   #95 = Utf8               //l2br_benchmark
   #96 = String             #95           // //l2br_benchmark
   #97 = Utf8               //l2br_help
   #98 = String             #97           // //l2br_help
   #99 = Utf8               //l2br_unload
  #100 = String             #99           // //l2br_unload
  #101 = Utf8               //l2br_generate
  #102 = String             #101          // //l2br_generate
  #103 = Utf8               //l2br_generate_all
  #104 = String             #103          // //l2br_generate_all
  #105 = Utf8               //l2br_config
  #106 = String             #105          // //l2br_config
  #107 = Utf8               //l2br_info
  #108 = String             #107          // //l2br_info
  #109 = Utf8               //l2br_status
  #110 = String             #109          // //l2br_status
  #111 = Utf8               handleGenerate
  #112 = Utf8               (Ljava/util/StringTokenizer;Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;)Z
  #113 = NameAndType        #111:#112     // handleGenerate:(Ljava/util/StringTokenizer;Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;)Z
  #114 = Methodref          #2.#113       // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands.handleGenerate:(Ljava/util/StringTokenizer;Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;)Z
  #115 = Utf8               handleGenerateAll
  #116 = NameAndType        #115:#112     // handleGenerateAll:(Ljava/util/StringTokenizer;Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;)Z
  #117 = Methodref          #2.#116       // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands.handleGenerateAll:(Ljava/util/StringTokenizer;Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;)Z
  #118 = Utf8               handleInfo
  #119 = NameAndType        #118:#112     // handleInfo:(Ljava/util/StringTokenizer;Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;)Z
  #120 = Methodref          #2.#119       // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands.handleInfo:(Ljava/util/StringTokenizer;Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;)Z
  #121 = Utf8               handleStatus
  #122 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;)Z
  #123 = NameAndType        #121:#122     // handleStatus:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;)Z
  #124 = Methodref          #2.#123       // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands.handleStatus:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;)Z
  #125 = Utf8               handleReload
  #126 = NameAndType        #125:#112     // handleReload:(Ljava/util/StringTokenizer;Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;)Z
  #127 = Methodref          #2.#126       // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands.handleReload:(Ljava/util/StringTokenizer;Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;)Z
  #128 = Utf8               handleUnload
  #129 = NameAndType        #128:#112     // handleUnload:(Ljava/util/StringTokenizer;Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;)Z
  #130 = Methodref          #2.#129       // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands.handleUnload:(Ljava/util/StringTokenizer;Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;)Z
  #131 = Utf8               handleBenchmark
  #132 = NameAndType        #131:#122     // handleBenchmark:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;)Z
  #133 = Methodref          #2.#132       // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands.handleBenchmark:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;)Z
  #134 = Utf8               handleConfig
  #135 = NameAndType        #134:#112     // handleConfig:(Ljava/util/StringTokenizer;Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;)Z
  #136 = Methodref          #2.#135       // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands.handleConfig:(Ljava/util/StringTokenizer;Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;)Z
  #137 = Utf8               handleHelp
  #138 = NameAndType        #137:#122     // handleHelp:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;)Z
  #139 = Methodref          #2.#138       // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands.handleHelp:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;)Z
  #140 = Utf8               st
  #141 = Utf8               Ljava/util/StringTokenizer;
  #142 = Utf8               cmd
  #143 = Utf8               Ljava/lang/String;
  #144 = Utf8               command
  #145 = Utf8               admin
  #146 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;
  #147 = Utf8               countTokens
  #148 = NameAndType        #147:#86      // countTokens:()I
  #149 = Methodref          #55.#148      // java/util/StringTokenizer.countTokens:()I
  #150 = Utf8               Uso: //l2br_generate <regionX> <regionY> [jps]
  #151 = String             #150          // Uso: //l2br_generate <regionX> <regionY> [jps]
  #152 = Utf8               ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface
  #153 = Class              #152          // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface
  #154 = Utf8               sendMessage
  #155 = NameAndType        #154:#56      // sendMessage:(Ljava/lang/String;)V
  #156 = InterfaceMethodref #153.#155     // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface.sendMessage:(Ljava/lang/String;)V
  #157 = Utf8               Exemplo: //l2br_generate 20 22 jps
  #158 = String             #157          // Exemplo: //l2br_generate 20 22 jps
  #159 = Utf8               kotlin/text/StringsKt
  #160 = Class              #159          // kotlin/text/StringsKt
  #161 = Utf8               toIntOrNull
  #162 = Utf8               (Ljava/lang/String;)Ljava/lang/Integer;
  #163 = NameAndType        #161:#162     // toIntOrNull:(Ljava/lang/String;)Ljava/lang/Integer;
  #164 = Methodref          #160.#163     // kotlin/text/StringsKt.toIntOrNull:(Ljava/lang/String;)Ljava/lang/Integer;
  #165 = Utf8               jps
  #166 = String             #165          // jps
  #167 = Utf8               (Ljava/lang/String;Ljava/lang/String;Z)Z
  #168 = NameAndType        #91:#167      // equals:(Ljava/lang/String;Ljava/lang/String;Z)Z
  #169 = Methodref          #160.#168     // kotlin/text/StringsKt.equals:(Ljava/lang/String;Ljava/lang/String;Z)Z
  #170 = Utf8               Coordenadas inválidas
  #171 = String             #170          // Coordenadas inválidas
  #172 = Utf8               java/lang/Integer
  #173 = Class              #172          // java/lang/Integer
  #174 = Utf8               intValue
  #175 = NameAndType        #174:#86      // intValue:()I
  #176 = Methodref          #173.#175     // java/lang/Integer.intValue:()I
  #177 = Utf8               Coordenadas fora dos limites válidos (16..26, 10..26)
  #178 = String             #177          // Coordenadas fora dos limites válidos (16..26, 10..26)
  #179 = Utf8               kotlin/Pair
  #180 = Class              #179          // kotlin/Pair
  #181 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)V
  #182 = NameAndType        #5:#181       // "<init>":(Ljava/lang/Object;Ljava/lang/Object;)V
  #183 = Methodref          #180.#182     // kotlin/Pair."<init>":(Ljava/lang/Object;Ljava/lang/Object;)V
  #184 = Utf8               java/lang/Boolean
  #185 = Class              #184          // java/lang/Boolean
  #186 = Utf8               valueOf
  #187 = Utf8               (Z)Ljava/lang/Boolean;
  #188 = NameAndType        #186:#187     // valueOf:(Z)Ljava/lang/Boolean;
  #189 = Methodref          #185.#188     // java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
  #190 = Utf8               putIfAbsent
  #191 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #192 = NameAndType        #190:#191     // putIfAbsent:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #193 = Methodref          #24.#192      // java/util/concurrent/ConcurrentHashMap.putIfAbsent:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #194 = Utf8               Geração para [\u0001, \u0001] já está em andamento...
  #195 = String             #194          // Geração para [\u0001, \u0001] já está em andamento...
  #196 = Utf8               java/lang/invoke/StringConcatFactory
  #197 = Class              #196          // java/lang/invoke/StringConcatFactory
  #198 = Utf8               makeConcatWithConstants
  #199 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #200 = NameAndType        #198:#199     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #201 = Methodref          #197.#200     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #202 = MethodHandle       6:#201        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #203 = Utf8               (Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/String;
  #204 = NameAndType        #198:#203     // makeConcatWithConstants:(Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/String;
  #205 = InvokeDynamic      #0:#204       // #0:makeConcatWithConstants:(Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/String;
  #206 = Utf8               Iniciando geração L2BR para região §e[\u0001, \u0001]§7...
  #207 = String             #206          // Iniciando geração L2BR para região §e[\u0001, \u0001]§7...
  #208 = InvokeDynamic      #1:#204       // #1:makeConcatWithConstants:(Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/String;
  #209 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider
  #210 = Class              #209          // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider
  #211 = Utf8               hasL2JData
  #212 = Utf8               (II)Z
  #213 = NameAndType        #211:#212     // hasL2JData:(II)Z
  #214 = InterfaceMethodref #210.#213     // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider.hasL2JData:(II)Z
  #215 = Utf8               hasConvDatData
  #216 = NameAndType        #215:#212     // hasConvDatData:(II)Z
  #217 = InterfaceMethodref #210.#216     // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider.hasConvDatData:(II)Z
  #218 = Utf8               Fontes detectadas: §a.l2j §7+ §a_conv.dat §7(Mesclando...)
  #219 = String             #218          // Fontes detectadas: §a.l2j §7+ §a_conv.dat §7(Mesclando...)
  #220 = Utf8               Fonte: §a.l2j
  #221 = String             #220          // Fonte: §a.l2j
  #222 = Utf8               Fonte: §a_conv.dat
  #223 = String             #222          // Fonte: §a_conv.dat
  #224 = Utf8               Nenhuma fonte de dados encontrada para esta região!
  #225 = String             #224          // Nenhuma fonte de dados encontrada para esta região!
  #226 = Utf8               remove
  #227 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #228 = NameAndType        #226:#227     // remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #229 = Methodref          #24.#228      // java/util/concurrent/ConcurrentHashMap.remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #230 = Utf8               kotlinx/coroutines/GlobalScope
  #231 = Class              #230          // kotlinx/coroutines/GlobalScope
  #232 = Utf8               INSTANCE
  #233 = Utf8               Lkotlinx/coroutines/GlobalScope;
  #234 = NameAndType        #232:#233     // INSTANCE:Lkotlinx/coroutines/GlobalScope;
  #235 = Fieldref           #231.#234     // kotlinx/coroutines/GlobalScope.INSTANCE:Lkotlinx/coroutines/GlobalScope;
  #236 = Utf8               kotlinx/coroutines/CoroutineScope
  #237 = Class              #236          // kotlinx/coroutines/CoroutineScope
  #238 = Utf8               ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerate$1
  #239 = Class              #238          // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerate$1
  #240 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;Ljava/lang/Integer;Ljava/lang/Integer;ZLkotlin/Pair;Lkotlin/coroutines/Continuation;)V
  #241 = NameAndType        #5:#240       // "<init>":(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;Ljava/lang/Integer;Ljava/lang/Integer;ZLkotlin/Pair;Lkotlin/coroutines/Continuation;)V
  #242 = Methodref          #239.#241     // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerate$1."<init>":(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;Ljava/lang/Integer;Ljava/lang/Integer;ZLkotlin/Pair;Lkotlin/coroutines/Continuation;)V
  #243 = Utf8               kotlin/jvm/functions/Function2
  #244 = Class              #243          // kotlin/jvm/functions/Function2
  #245 = Utf8               kotlinx/coroutines/BuildersKt
  #246 = Class              #245          // kotlinx/coroutines/BuildersKt
  #247 = Utf8               launch$default
  #248 = Utf8               (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;
  #249 = NameAndType        #247:#248     // launch$default:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;
  #250 = Methodref          #246.#249     // kotlinx/coroutines/BuildersKt.launch$default:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;
  #251 = Utf8               regionX
  #252 = Utf8               Ljava/lang/Integer;
  #253 = Utf8               regionY
  #254 = Utf8               generateJps
  #255 = Utf8               Z
  #256 = Utf8               key
  #257 = Utf8               Lkotlin/Pair;
  #258 = Utf8               hasL2J
  #259 = Utf8               hasConv
  #260 = Utf8               force
  #261 = String             #260          // force
  #262 = Utf8               ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerateAll$1
  #263 = Class              #262          // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerateAll$1
  #264 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;ZLkotlin/coroutines/Continuation;)V
  #265 = NameAndType        #5:#264       // "<init>":(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;ZLkotlin/coroutines/Continuation;)V
  #266 = Methodref          #263.#265     // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerateAll$1."<init>":(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;ZLkotlin/coroutines/Continuation;)V
  #267 = Utf8               Uso: //l2br_info <regionX> <regionY>
  #268 = String             #267          // Uso: //l2br_info <regionX> <regionY>
  #269 = Utf8               \u0001_\u0001.l2br
  #270 = String             #269          // \u0001_\u0001.l2br
  #271 = InvokeDynamic      #2:#204       // #2:makeConcatWithConstants:(Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/String;
  #272 = Utf8               java/nio/file/Path
  #273 = Class              #272          // java/nio/file/Path
  #274 = Utf8               resolve
  #275 = Utf8               (Ljava/lang/String;)Ljava/nio/file/Path;
  #276 = NameAndType        #274:#275     // resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
  #277 = InterfaceMethodref #273.#276     // java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
  #278 = Utf8               toFile
  #279 = Utf8               ()Ljava/io/File;
  #280 = NameAndType        #278:#279     // toFile:()Ljava/io/File;
  #281 = InterfaceMethodref #273.#280     // java/nio/file/Path.toFile:()Ljava/io/File;
  #282 = Utf8               java/io/File
  #283 = Class              #282          // java/io/File
  #284 = Utf8               exists
  #285 = NameAndType        #284:#60      // exists:()Z
  #286 = Methodref          #283.#285     // java/io/File.exists:()Z
  #287 = Utf8               === Info Região [\u0001, \u0001] ===
  #288 = String             #287          // === Info Região [\u0001, \u0001] ===
  #289 = InvokeDynamic      #3:#204       // #3:makeConcatWithConstants:(Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/String;
  #290 = Utf8               Disponível
  #291 = String             #290          // Disponível
  #292 = Utf8               Indisponível
  #293 = String             #292          // Indisponível
  #294 = Utf8               Fonte .l2j: \u0001
  #295 = String             #294          // Fonte .l2j: \u0001
  #296 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #297 = NameAndType        #198:#296     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #298 = InvokeDynamic      #4:#297       // #4:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #299 = Utf8               Fonte _conv.dat: \u0001
  #300 = String             #299          // Fonte _conv.dat: \u0001
  #301 = InvokeDynamic      #5:#297       // #5:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #302 = Utf8               length
  #303 = Utf8               ()J
  #304 = NameAndType        #302:#303     // length:()J
  #305 = Methodref          #283.#304     // java/io/File.length:()J
  #306 = Utf8               Existe (\u0001 KB)
  #307 = String             #306          // Existe (\u0001 KB)
  #308 = Utf8               (J)Ljava/lang/String;
  #309 = NameAndType        #198:#308     // makeConcatWithConstants:(J)Ljava/lang/String;
  #310 = InvokeDynamic      #6:#309       // #6:makeConcatWithConstants:(J)Ljava/lang/String;
  #311 = Utf8               Não gerado
  #312 = String             #311          // Não gerado
  #313 = Utf8               Cache .l2br: \u0001
  #314 = String             #313          // Cache .l2br: \u0001
  #315 = InvokeDynamic      #7:#297       // #7:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #316 = Utf8               Modo: Mesclado (ConvDat prioridade)
  #317 = String             #316          // Modo: Mesclado (ConvDat prioridade)
  #318 = Utf8               Modo: Apenas L2J
  #319 = String             #318          // Modo: Apenas L2J
  #320 = Utf8               Modo: Apenas ConvDat
  #321 = String             #320          // Modo: Apenas ConvDat
  #322 = Utf8               ERRO: Nenhuma fonte disponível!
  #323 = String             #322          // ERRO: Nenhuma fonte disponível!
  #324 = Utf8               l2brFile
  #325 = Utf8               Ljava/io/File;
  #326 = Utf8               hasL2BR
  #327 = Utf8               ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge
  #328 = Class              #327          // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge
  #329 = Utf8               getMetrics
  #330 = Utf8               ()Ljava/util/Map;
  #331 = NameAndType        #329:#330     // getMetrics:()Ljava/util/Map;
  #332 = Methodref          #328.#331     // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge.getMetrics:()Ljava/util/Map;
  #333 = Utf8               === L2BR Pathfinder Status ===
  #334 = String             #333          // === L2BR Pathfinder Status ===
  #335 = Utf8               l2brRegions
  #336 = String             #335          // l2brRegions
  #337 = Utf8               java/util/Map
  #338 = Class              #337          // java/util/Map
  #339 = NameAndType        #46:#227      // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #340 = InterfaceMethodref #338.#339     // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #341 = Utf8               (I)Ljava/lang/Integer;
  #342 = NameAndType        #186:#341     // valueOf:(I)Ljava/lang/Integer;
  #343 = Methodref          #173.#342     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #344 = Utf8               Regiões ativas: \u0001
  #345 = String             #344          // Regiões ativas: \u0001
  #346 = Utf8               (Ljava/lang/Object;)Ljava/lang/String;
  #347 = NameAndType        #198:#346     // makeConcatWithConstants:(Ljava/lang/Object;)Ljava/lang/String;
  #348 = InvokeDynamic      #8:#347       // #8:makeConcatWithConstants:(Ljava/lang/Object;)Ljava/lang/String;
  #349 = Utf8               size
  #350 = NameAndType        #349:#86      // size:()I
  #351 = Methodref          #24.#350      // java/util/concurrent/ConcurrentHashMap.size:()I
  #352 = Utf8               Gerações ativas: \u0001
  #353 = String             #352          // Gerações ativas: \u0001
  #354 = Utf8               (I)Ljava/lang/String;
  #355 = NameAndType        #198:#354     // makeConcatWithConstants:(I)Ljava/lang/String;
  #356 = InvokeDynamic      #9:#355       // #9:makeConcatWithConstants:(I)Ljava/lang/String;
  #357 = Utf8
  #358 = String             #357          //
  #359 = Utf8               l2brCalls
  #360 = String             #359          // l2brCalls
  #361 = Utf8               Chamadas L2BR: \u0001
  #362 = String             #361          // Chamadas L2BR: \u0001
  #363 = InvokeDynamic      #10:#347      // #10:makeConcatWithConstants:(Ljava/lang/Object;)Ljava/lang/String;
  #364 = Utf8               legacyCalls
  #365 = String             #364          // legacyCalls
  #366 = Utf8               Chamadas Legacy: \u0001
  #367 = String             #366          // Chamadas Legacy: \u0001
  #368 = InvokeDynamic      #11:#347      // #11:makeConcatWithConstants:(Ljava/lang/Object;)Ljava/lang/String;
  #369 = Utf8               fallbackCalls
  #370 = String             #369          // fallbackCalls
  #371 = Utf8               Fallbacks: \u0001
  #372 = String             #371          // Fallbacks: \u0001
  #373 = InvokeDynamic      #12:#347      // #12:makeConcatWithConstants:(Ljava/lang/Object;)Ljava/lang/String;
  #374 = Utf8               l2brPercentage
  #375 = String             #374          // l2brPercentage
  #376 = Utf8               Uso L2BR: \u0001%
  #377 = String             #376          // Uso L2BR: \u0001%
  #378 = InvokeDynamic      #13:#347      // #13:makeConcatWithConstants:(Ljava/lang/Object;)Ljava/lang/String;
  #379 = Utf8               avgL2BRTimeUs
  #380 = String             #379          // avgL2BRTimeUs
  #381 = Utf8               Latência média L2BR: \u0001?s
  #382 = String             #381          // Latência média L2BR: \u0001?s
  #383 = InvokeDynamic      #14:#347      // #14:makeConcatWithConstants:(Ljava/lang/Object;)Ljava/lang/String;
  #384 = Utf8               avgLegacyTimeUs
  #385 = String             #384          // avgLegacyTimeUs
  #386 = Utf8               Latência média Legacy: \u0001?s
  #387 = String             #386          // Latência média Legacy: \u0001?s
  #388 = InvokeDynamic      #15:#347      // #15:makeConcatWithConstants:(Ljava/lang/Object;)Ljava/lang/String;
  #389 = Utf8               engines
  #390 = String             #389          // engines
  #391 = Utf8               java/util/List
  #392 = Class              #391          // java/util/List
  #393 = Utf8               java/util/Collection
  #394 = Class              #393          // java/util/Collection
  #395 = Utf8               isEmpty
  #396 = NameAndType        #395:#60      // isEmpty:()Z
  #397 = InterfaceMethodref #394.#396     // java/util/Collection.isEmpty:()Z
  #398 = Utf8               Detalhes por região:
  #399 = String             #398          // Detalhes por região:
  #400 = Utf8               java/lang/Iterable
  #401 = Class              #400          // java/lang/Iterable
  #402 = Utf8               kotlin/collections/CollectionsKt
  #403 = Class              #402          // kotlin/collections/CollectionsKt
  #404 = Utf8               take
  #405 = Utf8               (Ljava/lang/Iterable;I)Ljava/util/List;
  #406 = NameAndType        #404:#405     // take:(Ljava/lang/Iterable;I)Ljava/util/List;
  #407 = Methodref          #403.#406     // kotlin/collections/CollectionsKt.take:(Ljava/lang/Iterable;I)Ljava/util/List;
  #408 = Utf8               iterator
  #409 = Utf8               ()Ljava/util/Iterator;
  #410 = NameAndType        #408:#409     // iterator:()Ljava/util/Iterator;
  #411 = InterfaceMethodref #401.#410     // java/lang/Iterable.iterator:()Ljava/util/Iterator;
  #412 = Utf8               java/util/Iterator
  #413 = Class              #412          // java/util/Iterator
  #414 = Utf8               hasNext
  #415 = NameAndType        #414:#60      // hasNext:()Z
  #416 = InterfaceMethodref #413.#415     // java/util/Iterator.hasNext:()Z
  #417 = Utf8               next
  #418 = Utf8               ()Ljava/lang/Object;
  #419 = NameAndType        #417:#418     // next:()Ljava/lang/Object;
  #420 = InterfaceMethodref #413.#419     // java/util/Iterator.next:()Ljava/lang/Object;
  #421 = Utf8               region
  #422 = String             #421          // region
  #423 = Utf8               nodes
  #424 = String             #423          // nodes
  #425 = Utf8               source
  #426 = String             #425          // source
  #427 = Utf8               Unknown
  #428 = String             #427          // Unknown
  #429 = Utf8                 \u0001: \u0001 nós (\u0001)
  #430 = String             #429          //   \u0001: \u0001 nós (\u0001)
  #431 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
  #432 = NameAndType        #198:#431     // makeConcatWithConstants:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
  #433 = InvokeDynamic      #16:#432      // #16:makeConcatWithConstants:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
  #434 = InterfaceMethodref #392.#350     // java/util/List.size:()I
  #435 = Utf8                 ... e \u0001 outras
  #436 = String             #435          //   ... e \u0001 outras
  #437 = InvokeDynamic      #17:#355      // #17:makeConcatWithConstants:(I)Ljava/lang/String;
  #438 = Utf8               $i$a$-forEach-L2BRAdminCommands$handleStatus$1
  #439 = Utf8               I
  #440 = Utf8               Ljava/lang/Object;
  #441 = Utf8               engine
  #442 = Utf8               Ljava/util/Map;
  #443 = Utf8               element$iv
  #444 = Utf8               $i$f$forEach
  #445 = Utf8               $this$forEach$iv
  #446 = Utf8               Ljava/lang/Iterable;
  #447 = Utf8               metrics
  #448 = Utf8               Ljava/util/List;
  #449 = Utf8               java/lang/Exception
  #450 = Class              #449          // java/lang/Exception
  #451 = Utf8               Uso: //l2br_reload <regionX> <regionY>
  #452 = String             #451          // Uso: //l2br_reload <regionX> <regionY>
  #453 = Utf8               getFileName
  #454 = Utf8               ()Ljava/nio/file/Path;
  #455 = NameAndType        #453:#454     // getFileName:()Ljava/nio/file/Path;
  #456 = InterfaceMethodref #273.#455     // java/nio/file/Path.getFileName:()Ljava/nio/file/Path;
  #457 = Utf8               Verificando arquivo: \u0001
  #458 = String             #457          // Verificando arquivo: \u0001
  #459 = Utf8               (Ljava/nio/file/Path;)Ljava/lang/String;
  #460 = NameAndType        #198:#459     // makeConcatWithConstants:(Ljava/nio/file/Path;)Ljava/lang/String;
  #461 = InvokeDynamic      #18:#460      // #18:makeConcatWithConstants:(Ljava/nio/file/Path;)Ljava/lang/String;
  #462 = Utf8               toAbsolutePath
  #463 = NameAndType        #462:#454     // toAbsolutePath:()Ljava/nio/file/Path;
  #464 = InterfaceMethodref #273.#463     // java/nio/file/Path.toAbsolutePath:()Ljava/nio/file/Path;
  #465 = Utf8               Arquivo não encontrado: \u0001
  #466 = String             #465          // Arquivo não encontrado: \u0001
  #467 = InvokeDynamic      #19:#460      // #19:makeConcatWithConstants:(Ljava/nio/file/Path;)Ljava/lang/String;
  #468 = Utf8               Use //l2br_generate \u0001 \u0001 primeiro
  #469 = String             #468          // Use //l2br_generate \u0001 \u0001 primeiro
  #470 = InvokeDynamic      #20:#204      // #20:makeConcatWithConstants:(Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/String;
  #471 = Utf8               Arquivo encontrado: \u0001KB
  #472 = String             #471          // Arquivo encontrado: \u0001KB
  #473 = InvokeDynamic      #21:#309      // #21:makeConcatWithConstants:(J)Ljava/lang/String;
  #474 = Utf8               readHeaderDebug
  #475 = Utf8               (Ljava/nio/file/Path;)Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$HeaderInfo;
  #476 = NameAndType        #474:#475     // readHeaderDebug:(Ljava/nio/file/Path;)Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$HeaderInfo;
  #477 = Methodref          #2.#476       // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands.readHeaderDebug:(Ljava/nio/file/Path;)Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$HeaderInfo;
  #478 = Utf8               ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$HeaderInfo
  #479 = Class              #478          // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$HeaderInfo
  #480 = Utf8               getNodes
  #481 = NameAndType        #480:#86      // getNodes:()I
  #482 = Methodref          #479.#481     // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$HeaderInfo.getNodes:()I
  #483 = Utf8               getVersion
  #484 = NameAndType        #483:#86      // getVersion:()I
  #485 = Methodref          #479.#484     // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$HeaderInfo.getVersion:()I
  #486 = Utf8               Header: \u0001 nós, versão \u0001
  #487 = String             #486          // Header: \u0001 nós, versão \u0001
  #488 = Utf8               (II)Ljava/lang/String;
  #489 = NameAndType        #198:#488     // makeConcatWithConstants:(II)Ljava/lang/String;
  #490 = InvokeDynamic      #22:#489      // #22:makeConcatWithConstants:(II)Ljava/lang/String;
  #491 = Utf8               getMessage
  #492 = NameAndType        #491:#64      // getMessage:()Ljava/lang/String;
  #493 = Methodref          #450.#492     // java/lang/Exception.getMessage:()Ljava/lang/String;
  #494 = Utf8               Erro ao ler header: \u0001
  #495 = String             #494          // Erro ao ler header: \u0001
  #496 = InvokeDynamic      #23:#297      // #23:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #497 = Utf8               Carregando no pathfinder...
  #498 = String             #497          // Carregando no pathfinder...
  #499 = Utf8               reloadRegion
  #500 = Utf8               (II)V
  #501 = NameAndType        #499:#500     // reloadRegion:(II)V
  #502 = Methodref          #328.#501     // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge.reloadRegion:(II)V
  #503 = Utf8               ? Região [\u0001, \u0001] carregada com sucesso!
  #504 = String             #503          // ? Região [\u0001, \u0001] carregada com sucesso!
  #505 = InvokeDynamic      #24:#204      // #24:makeConcatWithConstants:(Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/String;
  #506 = Utf8               ? Falha ao carregar: \u0001
  #507 = String             #506          // ? Falha ao carregar: \u0001
  #508 = InvokeDynamic      #25:#297      // #25:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #509 = Utf8               getStackTrace
  #510 = Utf8               ()[Ljava/lang/StackTraceElement;
  #511 = NameAndType        #509:#510     // getStackTrace:()[Ljava/lang/StackTraceElement;
  #512 = Methodref          #450.#511     // java/lang/Exception.getStackTrace:()[Ljava/lang/StackTraceElement;
  #513 = Utf8               kotlin/collections/ArraysKt
  #514 = Class              #513          // kotlin/collections/ArraysKt
  #515 = Utf8               ([Ljava/lang/Object;I)Ljava/util/List;
  #516 = NameAndType        #404:#515     // take:([Ljava/lang/Object;I)Ljava/util/List;
  #517 = Methodref          #514.#516     // kotlin/collections/ArraysKt.take:([Ljava/lang/Object;I)Ljava/util/List;
  #518 = Utf8               joinToString$default
  #519 = Utf8               (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
  #520 = NameAndType        #518:#519     // joinToString$default:(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
  #521 = Methodref          #403.#520     // kotlin/collections/CollectionsKt.joinToString$default:(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
  #522 = Utf8               Stack: \u0001
  #523 = String             #522          // Stack: \u0001
  #524 = InvokeDynamic      #26:#297      // #26:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #525 = Utf8               header
  #526 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$HeaderInfo;
  #527 = Utf8               e
  #528 = Utf8               Ljava/lang/Exception;
  #529 = Utf8               filePath
  #530 = Utf8               fileSize
  #531 = Utf8               J
  #532 = Utf8               java/lang/Throwable
  #533 = Class              #532          // java/lang/Throwable
  #534 = Utf8               java/io/FileInputStream
  #535 = Class              #534          // java/io/FileInputStream
  #536 = Utf8               (Ljava/io/File;)V
  #537 = NameAndType        #5:#536       // "<init>":(Ljava/io/File;)V
  #538 = Methodref          #535.#537     // java/io/FileInputStream."<init>":(Ljava/io/File;)V
  #539 = Utf8               java/io/Closeable
  #540 = Class              #539          // java/io/Closeable
  #541 = Utf8               read
  #542 = Utf8               ([B)I
  #543 = NameAndType        #541:#542     // read:([B)I
  #544 = Methodref          #535.#543     // java/io/FileInputStream.read:([B)I
  #545 = Utf8               java/nio/ByteBuffer
  #546 = Class              #545          // java/nio/ByteBuffer
  #547 = Utf8               wrap
  #548 = Utf8               ([B)Ljava/nio/ByteBuffer;
  #549 = NameAndType        #547:#548     // wrap:([B)Ljava/nio/ByteBuffer;
  #550 = Methodref          #546.#549     // java/nio/ByteBuffer.wrap:([B)Ljava/nio/ByteBuffer;
  #551 = Utf8               java/nio/ByteOrder
  #552 = Class              #551          // java/nio/ByteOrder
  #553 = Utf8               LITTLE_ENDIAN
  #554 = Utf8               Ljava/nio/ByteOrder;
  #555 = NameAndType        #553:#554     // LITTLE_ENDIAN:Ljava/nio/ByteOrder;
  #556 = Fieldref           #552.#555     // java/nio/ByteOrder.LITTLE_ENDIAN:Ljava/nio/ByteOrder;
  #557 = Utf8               order
  #558 = Utf8               (Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
  #559 = NameAndType        #557:#558     // order:(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
  #560 = Methodref          #546.#559     // java/nio/ByteBuffer.order:(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
  #561 = Utf8               position
  #562 = Utf8               (I)Ljava/nio/ByteBuffer;
  #563 = NameAndType        #561:#562     // position:(I)Ljava/nio/ByteBuffer;
  #564 = Methodref          #546.#563     // java/nio/ByteBuffer.position:(I)Ljava/nio/ByteBuffer;
  #565 = Utf8               getInt
  #566 = NameAndType        #565:#86      // getInt:()I
  #567 = Methodref          #546.#566     // java/nio/ByteBuffer.getInt:()I
  #568 = Utf8               (IIIII)V
  #569 = NameAndType        #5:#568       // "<init>":(IIIII)V
  #570 = Methodref          #479.#569     // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$HeaderInfo."<init>":(IIIII)V
  #571 = Utf8               kotlin/io/CloseableKt
  #572 = Class              #571          // kotlin/io/CloseableKt
  #573 = Utf8               closeFinally
  #574 = Utf8               (Ljava/io/Closeable;Ljava/lang/Throwable;)V
  #575 = NameAndType        #573:#574     // closeFinally:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
  #576 = Methodref          #572.#575     // kotlin/io/CloseableKt.closeFinally:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
  #577 = Utf8               $i$a$-use-L2BRAdminCommands$readHeaderDebug$1
  #578 = Utf8               [B
  #579 = Utf8               buf
  #580 = Utf8               Ljava/nio/ByteBuffer;
  #581 = Utf8               fis
  #582 = Utf8               Ljava/io/FileInputStream;
  #583 = Utf8               path
  #584 = Utf8               Descarregando todas as regiões L2BR...
  #585 = String             #584          // Descarregando todas as regiões L2BR...
  #586 = Utf8               unloadAll
  #587 = NameAndType        #586:#8       // unloadAll:()V
  #588 = Methodref          #328.#587     // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge.unloadAll:()V
  #589 = Utf8               Todas as regiões descarregadas
  #590 = String             #589          // Todas as regiões descarregadas
  #591 = Utf8               Descarregando região [\u0001, \u0001]...
  #592 = String             #591          // Descarregando região [\u0001, \u0001]...
  #593 = InvokeDynamic      #27:#204      // #27:makeConcatWithConstants:(Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/String;
  #594 = Utf8               unloadRegion
  #595 = NameAndType        #594:#500     // unloadRegion:(II)V
  #596 = Methodref          #328.#595     // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge.unloadRegion:(II)V
  #597 = Utf8               Região descarregada
  #598 = String             #597          // Região descarregada
  #599 = Utf8               Erro: \u0001
  #600 = String             #599          // Erro: \u0001
  #601 = InvokeDynamic      #28:#297      // #28:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #602 = Utf8               Executando benchmark...
  #603 = String             #602          // Executando benchmark...
  #604 = Utf8               ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleBenchmark$1
  #605 = Class              #604          // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleBenchmark$1
  #606 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;Lkotlin/coroutines/Continuation;)V
  #607 = NameAndType        #5:#606       // "<init>":(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;Lkotlin/coroutines/Continuation;)V
  #608 = Methodref          #605.#607     // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleBenchmark$1."<init>":(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;Lkotlin/coroutines/Continuation;)V
  #609 = Utf8               getConfig
  #610 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig;
  #611 = NameAndType        #609:#610     // getConfig:()Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig;
  #612 = Methodref          #328.#611     // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge.getConfig:()Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig;
  #613 = Utf8               === Configuração L2BR ===
  #614 = String             #613          // === Configuração L2BR ===
  #615 = Utf8               ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig
  #616 = Class              #615          // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig
  #617 = Utf8               getGlobalEnabled
  #618 = NameAndType        #617:#60      // getGlobalEnabled:()Z
  #619 = Methodref          #616.#618     // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig.getGlobalEnabled:()Z
  #620 = Utf8               Global enabled: \u0001
  #621 = String             #620          // Global enabled: \u0001
  #622 = Utf8               (Z)Ljava/lang/String;
  #623 = NameAndType        #198:#622     // makeConcatWithConstants:(Z)Ljava/lang/String;
  #624 = InvokeDynamic      #29:#623      // #29:makeConcatWithConstants:(Z)Ljava/lang/String;
  #625 = Utf8               getFallbackToLegacy
  #626 = NameAndType        #625:#60      // getFallbackToLegacy:()Z
  #627 = Methodref          #616.#626     // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig.getFallbackToLegacy:()Z
  #628 = Utf8               Fallback to legacy: \u0001
  #629 = String             #628          // Fallback to legacy: \u0001
  #630 = InvokeDynamic      #30:#623      // #30:makeConcatWithConstants:(Z)Ljava/lang/String;
  #631 = Utf8               getMetricsEnabled
  #632 = NameAndType        #631:#60      // getMetricsEnabled:()Z
  #633 = Methodref          #616.#632     // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig.getMetricsEnabled:()Z
  #634 = Utf8               Metrics enabled: \u0001
  #635 = String             #634          // Metrics enabled: \u0001
  #636 = InvokeDynamic      #31:#623      // #31:makeConcatWithConstants:(Z)Ljava/lang/String;
  #637 = Utf8               getWarmupOnLoad
  #638 = NameAndType        #637:#60      // getWarmupOnLoad:()Z
  #639 = Methodref          #616.#638     // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig.getWarmupOnLoad:()Z
  #640 = Utf8               Warmup on load: \u0001
  #641 = String             #640          // Warmup on load: \u0001
  #642 = InvokeDynamic      #32:#623      // #32:makeConcatWithConstants:(Z)Ljava/lang/String;
  #643 = Utf8               getMaxPathfindingTimeMicros
  #644 = NameAndType        #643:#303     // getMaxPathfindingTimeMicros:()J
  #645 = Methodref          #616.#644     // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig.getMaxPathfindingTimeMicros:()J
  #646 = Utf8               Max pathfinding time: \u0001?s
  #647 = String             #646          // Max pathfinding time: \u0001?s
  #648 = InvokeDynamic      #33:#309      // #33:makeConcatWithConstants:(J)Ljava/lang/String;
  #649 = Utf8               Output path: \u0001
  #650 = String             #649          // Output path: \u0001
  #651 = InvokeDynamic      #34:#460      // #34:makeConcatWithConstants:(Ljava/nio/file/Path;)Ljava/lang/String;
  #652 = Utf8               Uso: //l2br_config <key> <value>
  #653 = String             #652          // Uso: //l2br_config <key> <value>
  #654 = Utf8               Keys: global, fallback, metrics, warmup
  #655 = String             #654          // Keys: global, fallback, metrics, warmup
  #656 = Utf8               global
  #657 = String             #656          // global
  #658 = String             #447          // metrics
  #659 = Utf8               fallback
  #660 = String             #659          // fallback
  #661 = Utf8               warmup
  #662 = String             #661          // warmup
  #663 = Utf8               toBooleanStrict
  #664 = Utf8               (Ljava/lang/String;)Z
  #665 = NameAndType        #663:#664     // toBooleanStrict:(Ljava/lang/String;)Z
  #666 = Methodref          #160.#665     // kotlin/text/StringsKt.toBooleanStrict:(Ljava/lang/String;)Z
  #667 = Utf8               copy$default
  #668 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig;ZZZZZJILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig;
  #669 = NameAndType        #667:#668     // copy$default:(Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig;ZZZZZJILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig;
  #670 = Methodref          #616.#669     // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig.copy$default:(Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig;ZZZZZJILjava/lang/Object;)Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig;
  #671 = Utf8               Configuração desconhecida: \u0001
  #672 = String             #671          // Configuração desconhecida: \u0001
  #673 = InvokeDynamic      #35:#297      // #35:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #674 = Utf8               updateConfig
  #675 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig;)V
  #676 = NameAndType        #674:#675     // updateConfig:(Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig;)V
  #677 = Methodref          #328.#676     // ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge.updateConfig:(Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig;)V
  #678 = Utf8               Configuração \'\u0001\' atualizada para: \u0001
  #679 = String             #678          // Configuração \'\u0001\' atualizada para: \u0001
  #680 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #681 = NameAndType        #198:#680     // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #682 = InvokeDynamic      #36:#681      // #36:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #683 = Utf8               config
  #684 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig;
  #685 = Utf8               value
  #686 = Utf8               currentConfig
  #687 = Utf8               newConfig
  #688 = Utf8               === Comandos L2BR Pathfinder ===
  #689 = String             #688          // === Comandos L2BR Pathfinder ===
  #690 = Utf8               //l2br_generate <x> <y> [jps] - Gera .l2br (com JPS opcional)
  #691 = String             #690          // //l2br_generate <x> <y> [jps] - Gera .l2br (com JPS opcional)
  #692 = Utf8               //l2br_generate_all [force] - Gera todas as regiões
  #693 = String             #692          // //l2br_generate_all [force] - Gera todas as regiões
  #694 = Utf8               //l2br_info <x> <y> - Verifica fontes disponíveis
  #695 = String             #694          // //l2br_info <x> <y> - Verifica fontes disponíveis
  #696 = Utf8               //l2br_status - Status e métricas
  #697 = String             #696          // //l2br_status - Status e métricas
  #698 = Utf8               //l2br_reload <x> <y> - Recarrega região
  #699 = String             #698          // //l2br_reload <x> <y> - Recarrega região
  #700 = Utf8               //l2br_unload [x] [y] - Descarrega (todas ou específica)
  #701 = String             #700          // //l2br_unload [x] [y] - Descarrega (todas ou específica)
  #702 = Utf8               //l2br_benchmark - Teste de performance
  #703 = String             #702          // //l2br_benchmark - Teste de performance
  #704 = Utf8               //l2br_config [key] [value] - Configurações
  #705 = String             #704          // //l2br_config [key] [value] - Configurações
  #706 = Utf8               //l2br_help - Esta ajuda
  #707 = String             #706          // //l2br_help - Esta ajuda
  #708 = Utf8               format
  #709 = Utf8               (DI)Ljava/lang/String;
  #710 = Utf8               kotlin/jvm/internal/StringCompanionObject
  #711 = Class              #710          // kotlin/jvm/internal/StringCompanionObject
  #712 = Utf8               Lkotlin/jvm/internal/StringCompanionObject;
  #713 = NameAndType        #232:#712     // INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;
  #714 = Fieldref           #711.#713     // kotlin/jvm/internal/StringCompanionObject.INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;
  #715 = Utf8               %.\u0001f
  #716 = String             #715          // %.\u0001f
  #717 = InvokeDynamic      #37:#355      // #37:makeConcatWithConstants:(I)Ljava/lang/String;
  #718 = Utf8               java/lang/Double
  #719 = Class              #718          // java/lang/Double
  #720 = Utf8               (D)Ljava/lang/Double;
  #721 = NameAndType        #186:#720     // valueOf:(D)Ljava/lang/Double;
  #722 = Methodref          #719.#721     // java/lang/Double.valueOf:(D)Ljava/lang/Double;
  #723 = Utf8               java/util/Arrays
  #724 = Class              #723          // java/util/Arrays
  #725 = Utf8               copyOf
  #726 = Utf8               ([Ljava/lang/Object;I)[Ljava/lang/Object;
  #727 = NameAndType        #725:#726     // copyOf:([Ljava/lang/Object;I)[Ljava/lang/Object;
  #728 = Methodref          #724.#727     // java/util/Arrays.copyOf:([Ljava/lang/Object;I)[Ljava/lang/Object;
  #729 = Utf8               (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #730 = NameAndType        #708:#729     // format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #731 = Methodref          #43.#730      // java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #732 = Utf8               format(...)
  #733 = String             #732          // format(...)
  #734 = Utf8               $this$format
  #735 = Utf8               D
  #736 = Utf8               decimals
  #737 = Utf8               toSerializationNode
  #738 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;)Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;
  #739 = Utf8               ext/mods/gameserver/geoengine/pathfinding/serialization/Node
  #740 = Class              #739          // ext/mods/gameserver/geoengine/pathfinding/serialization/Node
  #741 = Utf8               ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode
  #742 = Class              #741          // ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode
  #743 = Utf8               getGeoX
  #744 = NameAndType        #743:#86      // getGeoX:()I
  #745 = Methodref          #742.#744     // ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode.getGeoX:()I
  #746 = Utf8               getGeoY
  #747 = NameAndType        #746:#86      // getGeoY:()I
  #748 = Methodref          #742.#747     // ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode.getGeoY:()I
  #749 = Utf8               getWorldZ
  #750 = Utf8               ()S
  #751 = NameAndType        #749:#750     // getWorldZ:()S
  #752 = Methodref          #742.#751     // ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode.getWorldZ:()S
  #753 = Utf8               getId
  #754 = NameAndType        #753:#86      // getId:()I
  #755 = Methodref          #742.#754     // ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode.getId:()I
  #756 = Utf8               isWalkable
  #757 = NameAndType        #756:#60      // isWalkable:()Z
  #758 = Methodref          #742.#757     // ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode.isWalkable:()Z
  #759 = Utf8               getNswe
  #760 = Utf8               ()B
  #761 = NameAndType        #759:#760     // getNswe:()B
  #762 = Methodref          #742.#761     // ext/mods/gameserver/geoengine/pathfinding/model/IndexedNode.getNswe:()B
  #763 = Utf8               (IIIIZZLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
  #764 = NameAndType        #5:#763       // "<init>":(IIIIZZLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
  #765 = Methodref          #740.#764     // ext/mods/gameserver/geoengine/pathfinding/serialization/Node."<init>":(IIIIZZLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
  #766 = Utf8               $this$toSerializationNode
  #767 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;
  #768 = Utf8               buildSpatialGrid
  #769 = Utf8               (Ljava/util/List;)Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;
  #770 = Utf8               (Ljava/util/List<Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;>;)Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;
  #771 = InterfaceMethodref #392.#396     // java/util/List.isEmpty:()Z
  #772 = Utf8               ext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid
  #773 = Class              #772          // ext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid
  #774 = Utf8               (III)V
  #775 = NameAndType        #5:#774       // "<init>":(III)V
  #776 = Methodref          #773.#775     // ext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid."<init>":(III)V
  #777 = Utf8               java/util/NoSuchElementException
  #778 = Class              #777          // java/util/NoSuchElementException
  #779 = Methodref          #778.#9       // java/util/NoSuchElementException."<init>":()V
  #780 = Utf8               kotlin/ranges/RangesKt
  #781 = Class              #780          // kotlin/ranges/RangesKt
  #782 = Utf8               coerceAtLeast
  #783 = Utf8               (II)I
  #784 = NameAndType        #782:#783     // coerceAtLeast:(II)I
  #785 = Methodref          #781.#784     // kotlin/ranges/RangesKt.coerceAtLeast:(II)I
  #786 = Utf8               throwIndexOverflow
  #787 = NameAndType        #786:#8       // throwIndexOverflow:()V
  #788 = Methodref          #403.#787     // kotlin/collections/CollectionsKt.throwIndexOverflow:()V
  #789 = Utf8               coerceIn
  #790 = Utf8               (III)I
  #791 = NameAndType        #789:#790     // coerceIn:(III)I
  #792 = Methodref          #781.#791     // kotlin/ranges/RangesKt.coerceIn:(III)I
  #793 = Utf8               addNode
  #794 = NameAndType        #793:#774     // addNode:(III)V
  #795 = Methodref          #773.#794     // ext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid.addNode:(III)V
  #796 = Utf8               $i$a$-minOf-L2BRAdminCommands$buildSpatialGrid$minX$1
  #797 = Utf8               it
  #798 = Utf8               $i$a$-maxOf-L2BRAdminCommands$buildSpatialGrid$maxX$1
  #799 = Utf8               $i$a$-minOf-L2BRAdminCommands$buildSpatialGrid$minY$1
  #800 = Utf8               $i$a$-maxOf-L2BRAdminCommands$buildSpatialGrid$maxY$1
  #801 = Utf8               $i$a$-forEachIndexed-L2BRAdminCommands$buildSpatialGrid$1
  #802 = Utf8               cx
  #803 = Utf8               cy
  #804 = Utf8               index
  #805 = Utf8               node
  #806 = Utf8               item$iv
  #807 = Utf8               $i$f$forEachIndexed
  #808 = Utf8               index$iv
  #809 = Utf8               $this$forEachIndexed$iv
  #810 = Utf8               minX
  #811 = Utf8               maxX
  #812 = Utf8               minY
  #813 = Utf8               maxY
  #814 = Utf8               cellSize
  #815 = Utf8               width
  #816 = Utf8               height
  #817 = Utf8               grid
  #818 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;
  #819 = Utf8               calculateConnectivity
  #820 = Utf8               (Ljava/util/List;)Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;
  #821 = Utf8               (Ljava/util/List<Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;>;)Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;
  #822 = Utf8               java/util/ArrayList
  #823 = Class              #822          // java/util/ArrayList
  #824 = Methodref          #823.#9       // java/util/ArrayList."<init>":()V
  #825 = Utf8               collectionSizeOrDefault
  #826 = Utf8               (Ljava/lang/Iterable;I)I
  #827 = NameAndType        #825:#826     // collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
  #828 = Methodref          #403.#827     // kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
  #829 = Utf8               kotlin/collections/MapsKt
  #830 = Class              #829          // kotlin/collections/MapsKt
  #831 = Utf8               mapCapacity
  #832 = Utf8               (I)I
  #833 = NameAndType        #831:#832     // mapCapacity:(I)I
  #834 = Methodref          #830.#833     // kotlin/collections/MapsKt.mapCapacity:(I)I
  #835 = Utf8               java/util/LinkedHashMap
  #836 = Class              #835          // java/util/LinkedHashMap
  #837 = Utf8               (I)V
  #838 = NameAndType        #5:#837       // "<init>":(I)V
  #839 = Methodref          #836.#838     // java/util/LinkedHashMap."<init>":(I)V
  #840 = Utf8               put
  #841 = NameAndType        #840:#191     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #842 = InterfaceMethodref #338.#841     // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #843 = Utf8               kotlin/TuplesKt
  #844 = Class              #843          // kotlin/TuplesKt
  #845 = Utf8               to
  #846 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
  #847 = NameAndType        #845:#846     // to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
  #848 = Methodref          #844.#847     // kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
  #849 = Utf8               listOf
  #850 = Utf8               ([Ljava/lang/Object;)Ljava/util/List;
  #851 = NameAndType        #849:#850     // listOf:([Ljava/lang/Object;)Ljava/util/List;
  #852 = Methodref          #403.#851     // kotlin/collections/CollectionsKt.listOf:([Ljava/lang/Object;)Ljava/util/List;
  #853 = Utf8               component1
  #854 = NameAndType        #853:#418     // component1:()Ljava/lang/Object;
  #855 = Methodref          #180.#854     // kotlin/Pair.component1:()Ljava/lang/Object;
  #856 = Utf8               java/lang/Number
  #857 = Class              #856          // java/lang/Number
  #858 = Methodref          #857.#175     // java/lang/Number.intValue:()I
  #859 = Utf8               component2
  #860 = NameAndType        #859:#418     // component2:()Ljava/lang/Object;
  #861 = Methodref          #180.#860     // kotlin/Pair.component2:()Ljava/lang/Object;
  #862 = Utf8               ext/mods/gameserver/geoengine/pathfinding/serialization/Connection
  #863 = Class              #862          // ext/mods/gameserver/geoengine/pathfinding/serialization/Connection
  #864 = Double             16.0d
  #866 = Utf8               ext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType
  #867 = Class              #866          // ext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType
  #868 = Utf8               WALK
  #869 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
  #870 = NameAndType        #868:#869     // WALK:Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
  #871 = Fieldref           #867.#870     // ext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType.WALK:Lext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;
  #872 = Utf8               (IIDLext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;)V
  #873 = NameAndType        #5:#872       // "<init>":(IIDLext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;)V
  #874 = Methodref          #863.#873     // ext/mods/gameserver/geoengine/pathfinding/serialization/Connection."<init>":(IIDLext/mods/gameserver/geoengine/pathfinding/serialization/EdgeType;)V
  #875 = Utf8               add
  #876 = NameAndType        #875:#92      // add:(Ljava/lang/Object;)Z
  #877 = InterfaceMethodref #392.#876     // java/util/List.add:(Ljava/lang/Object;)Z
  #878 = Utf8               ext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity
  #879 = Class              #878          // ext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity
  #880 = Utf8               (Ljava/util/List;)V
  #881 = NameAndType        #5:#880       // "<init>":(Ljava/util/List;)V
  #882 = Methodref          #879.#881     // ext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity."<init>":(Ljava/util/List;)V
  #883 = Utf8               $i$a$-associateBy-L2BRAdminCommands$calculateConnectivity$nodeMap$1
  #884 = Utf8               element$iv$iv
  #885 = Utf8               $i$f$associateByTo
  #886 = Utf8               $this$associateByTo$iv$iv
  #887 = Utf8               destination$iv$iv
  #888 = Utf8               $i$f$associateBy
  #889 = Utf8               capacity$iv
  #890 = Utf8               $this$associateBy$iv
  #891 = Utf8               neighbor
  #892 = Utf8               $i$a$-forEach-L2BRAdminCommands$calculateConnectivity$1$1
  #893 = Utf8               dx
  #894 = Utf8               dy
  #895 = Utf8               $i$a$-forEachIndexed-L2BRAdminCommands$calculateConnectivity$1
  #896 = Utf8               dirs
  #897 = Utf8               connections
  #898 = Utf8               nodeMap
  #899 = Utf8               createAdminInterface
  #900 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;
  #901 = Utf8               Lkotlin/jvm/JvmStatic;
  #902 = Utf8               Companion
  #903 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$Companion;
  #904 = NameAndType        #902:#903     // Companion:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$Companion;
  #905 = Fieldref           #2.#904       // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands.Companion:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$Companion;
  #906 = Utf8               ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$Companion
  #907 = Class              #906          // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$Companion
  #908 = NameAndType        #899:#900     // createAdminInterface:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;
  #909 = Methodref          #907.#908     // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$Companion.createAdminInterface:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;
  #910 = Utf8               player
  #911 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #912 = Utf8               access$getGeoDataProvider$p
  #913 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;
  #914 = Utf8               $this
  #915 = Utf8               access$getOutputPath$p
  #916 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;)Ljava/nio/file/Path;
  #917 = Utf8               access$toSerializationNode
  #918 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;)Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;
  #919 = NameAndType        #737:#738     // toSerializationNode:(Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;)Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;
  #920 = Methodref          #2.#919       // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands.toSerializationNode:(Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;)Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;
  #921 = Utf8               $receiver
  #922 = Utf8               access$buildSpatialGrid
  #923 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;Ljava/util/List;)Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;
  #924 = NameAndType        #768:#769     // buildSpatialGrid:(Ljava/util/List;)Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;
  #925 = Methodref          #2.#924       // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands.buildSpatialGrid:(Ljava/util/List;)Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;
  #926 = Utf8               access$calculateConnectivity
  #927 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;Ljava/util/List;)Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;
  #928 = NameAndType        #819:#820     // calculateConnectivity:(Ljava/util/List;)Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;
  #929 = Methodref          #2.#928       // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands.calculateConnectivity:(Ljava/util/List;)Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;
  #930 = Utf8               access$getSerializer$p
  #931 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;)Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer;
  #932 = Utf8               access$getBridge$p
  #933 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;)Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;
  #934 = Utf8               access$getActiveGenerations$p
  #935 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;)Ljava/util/concurrent/ConcurrentHashMap;
  #936 = Utf8               access$format
  #937 = Utf8               (Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;DI)Ljava/lang/String;
  #938 = NameAndType        #708:#709     // format:(DI)Ljava/lang/String;
  #939 = Methodref          #2.#938       // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands.format:(DI)Ljava/lang/String;
  #940 = Utf8               <clinit>
  #941 = Utf8               (Lkotlin/jvm/internal/DefaultConstructorMarker;)V
  #942 = NameAndType        #5:#941       // "<init>":(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
  #943 = Methodref          #907.#942     // ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$Companion."<init>":(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
  #944 = Utf8               Ljava/util/concurrent/ConcurrentHashMap<Lkotlin/Pair<Ljava/lang/Integer;Ljava/lang/Integer;>;Ljava/lang/Boolean;>;
  #945 = Utf8               Lkotlin/Metadata;
  #946 = Utf8               mv
  #947 = Integer            2
  #948 = Integer            3
  #949 = Integer            0
  #950 = Utf8               k
  #951 = Integer            1
  #952 = Utf8               xi
  #953 = Integer            48
  #954 = Utf8               d1
  #955 = Utf8               \u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 22\u00020\u0001:\u0003012B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0018\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0018\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0018\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0018\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0007H\u0002J\u0018\u0010 \u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010!\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0018\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010#\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0014\u0010$\u001a\u00020\u0013*\u00020%2\u0006\u0010&\u001a\u00020\rH\u0002J\f\u0010\'\u001a\u00020(*\u00020)H\u0002J\u0016\u0010*\u001a\u00020+2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020)0-H\u0002J\u0016\u0010.\u001a\u00020/2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020)0-H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\n\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u000e0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00063
  #956 = Utf8               d2
  #957 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;
  #958 = Utf8               Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;
  #959 = Utf8               HeaderInfo
  #960 = Utf8               AdminInterface
  #961 = Utf8               Brproject
  #962 = Utf8               ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
  #963 = Class              #962          // ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
  #964 = Utf8               GeoDataProvider
  #965 = Utf8               BridgeConfig
  #966 = Utf8               AdminCommands.kt
  #967 = Utf8               Lkotlin/jvm/internal/SourceDebugExtension;
  #968 = Utf8               SMAP\nAdminCommands.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdminCommands.kt\next/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,576:1\n1915#2,2:577\n1924#2,3:580\n1220#2,2:583\n1249#2,4:585\n1924#2,2:589\n1915#2,2:591\n1926#2:593\n1#3:579\n*S KotlinDebug\n*F\n+ 1 AdminCommands.kt\next/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands\n*L\n314#1:577,2\n538#1:580,3\n548#1:583,2\n548#1:585,4\n550#1:589,2\n553#1:591,2\n550#1:593\n*E\n
  #969 = Utf8               RuntimeInvisibleAnnotations
  #970 = Utf8               Signature
  #971 = Utf8               Code
  #972 = Utf8               LineNumberTable
  #973 = Utf8               LocalVariableTable
  #974 = Utf8               RuntimeInvisibleParameterAnnotations
  #975 = Utf8               StackMapTable
  #976 = Utf8               RuntimeVisibleAnnotations
  #977 = Utf8               InnerClasses
  #978 = Utf8               SourceFile
  #979 = Utf8               SourceDebugExtension
  #980 = Utf8               BootstrapMethods
{
  public static final ext.mods.gameserver.geoengine.pathfinding.integration.L2BRAdminCommands$Companion Companion;
    descriptor: Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$Companion;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    RuntimeInvisibleAnnotations:
      0: #7()
        org.jetbrains.annotations.NotNull

  public ext.mods.gameserver.geoengine.pathfinding.integration.L2BRAdminCommands(ext.mods.gameserver.geoengine.pathfinding.integration.GeoEngineBridge, ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$GeoDataProvider, java.nio.file.Path);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;Ljava/nio/file/Path;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=4
         0: aload_0
         1: invokespecial #10                 // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #14                 // Field bridge:Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;
         9: aload_0
        10: aload_2
        11: putfield      #18                 // Field geoDataProvider:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;
        14: aload_0
        15: aload_3
        16: putfield      #22                 // Field outputPath:Ljava/nio/file/Path;
        19: aload_0
        20: new           #24                 // class java/util/concurrent/ConcurrentHashMap
        23: dup
        24: invokespecial #25                 // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
        27: putfield      #29                 // Field activeGenerations:Ljava/util/concurrent/ConcurrentHashMap;
        30: aload_0
        31: new           #31                 // class ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer
        34: dup
        35: invokespecial #32                 // Method ext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer."<init>":()V
        38: putfield      #36                 // Field serializer:Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer;
        41: return
      LineNumberTable:
        line 42: 0
        line 43: 4
        line 44: 9
        line 45: 14
        line 48: 19
        line 49: 30
        line 42: 41
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      42     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;
            0      42     1 bridge   Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;
            0      42     2 geoDataProvider   Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;
            0      42     3 outputPath   Ljava/nio/file/Path;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #7()
          org.jetbrains.annotations.NotNull
      parameter 1:
        0: #7()
          org.jetbrains.annotations.NotNull
      parameter 2:
        0: #7()
          org.jetbrains.annotations.NotNull

  public ext.mods.gameserver.geoengine.pathfinding.integration.L2BRAdminCommands(ext.mods.gameserver.geoengine.pathfinding.integration.GeoEngineBridge, ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$GeoDataProvider, java.nio.file.Path, int, kotlin.jvm.internal.DefaultConstructorMarker);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;Ljava/nio/file/Path;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    flags: (0x1001) ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=4, locals=6, args_size=6
         0: iload         4
         2: iconst_4
         3: iand
         4: ifeq          17
         7: ldc           #41                 // String data/pathfinder/
         9: iconst_0
        10: anewarray     #43                 // class java/lang/String
        13: invokestatic  #49                 // Method java/nio/file/Paths.get:(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
        16: astore_3
        17: aload_0
        18: aload_1
        19: aload_2
        20: aload_3
        21: invokespecial #51                 // Method "<init>":(Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;Ljava/nio/file/Path;)V
        24: return
      StackMapTable: number_of_entries = 1
        frame_type = 17 /* same */
      LineNumberTable:
        line 42: 0
        line 45: 7
        line 42: 17
        line 46: 24

  public final boolean processCommand(java.lang.String, ext.mods.gameserver.geoengine.pathfinding.integration.L2BRAdminCommands$AdminInterface);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=6, args_size=3
         0: new           #55                 // class java/util/StringTokenizer
         3: dup
         4: aload_1
         5: invokespecial #58                 // Method java/util/StringTokenizer."<init>":(Ljava/lang/String;)V
         8: astore_3
         9: aload_3
        10: invokevirtual #62                 // Method java/util/StringTokenizer.hasMoreTokens:()Z
        13: ifne          18
        16: iconst_0
        17: ireturn
        18: aload_3
        19: invokevirtual #66                 // Method java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        22: getstatic     #72                 // Field java/util/Locale.ROOT:Ljava/util/Locale;
        25: invokevirtual #76                 // Method java/lang/String.toLowerCase:(Ljava/util/Locale;)Ljava/lang/String;
        28: dup
        29: ldc           #78                 // String toLowerCase(...)
        31: invokestatic  #84                 // Method kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        34: astore        4
        36: aload         4
        38: astore        5
        40: aload         5
        42: invokevirtual #88                 // Method java/lang/String.hashCode:()I
        45: lookupswitch  { // 9

              -754167936: 193

              -685410828: 141

               241753066: 154

               241791319: 219

               262605227: 206

               682756098: 128

               724915803: 232

               776955240: 167

              1351067038: 180
                 default: 323
            }
       128: aload         5
       130: ldc           #90                 // String //l2br_reload
       132: invokevirtual #94                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       135: ifne          280
       138: goto          323
       141: aload         5
       143: ldc           #96                 // String //l2br_benchmark
       145: invokevirtual #94                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       148: ifne          298
       151: goto          323
       154: aload         5
       156: ldc           #98                 // String //l2br_help
       158: invokevirtual #94                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       161: ifne          315
       164: goto          323
       167: aload         5
       169: ldc           #100                // String //l2br_unload
       171: invokevirtual #94                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       174: ifne          289
       177: goto          323
       180: aload         5
       182: ldc           #102                // String //l2br_generate
       184: invokevirtual #94                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       187: ifne          245
       190: goto          323
       193: aload         5
       195: ldc           #104                // String //l2br_generate_all
       197: invokevirtual #94                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       200: ifne          254
       203: goto          323
       206: aload         5
       208: ldc           #106                // String //l2br_config
       210: invokevirtual #94                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       213: ifne          306
       216: goto          323
       219: aload         5
       221: ldc           #108                // String //l2br_info
       223: invokevirtual #94                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       226: ifne          263
       229: goto          323
       232: aload         5
       234: ldc           #110                // String //l2br_status
       236: invokevirtual #94                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       239: ifne          272
       242: goto          323
       245: aload_0
       246: aload_3
       247: aload_2
       248: invokespecial #114                // Method handleGenerate:(Ljava/util/StringTokenizer;Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;)Z
       251: goto          324
       254: aload_0
       255: aload_3
       256: aload_2
       257: invokespecial #117                // Method handleGenerateAll:(Ljava/util/StringTokenizer;Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;)Z
       260: goto          324
       263: aload_0
       264: aload_3
       265: aload_2
       266: invokespecial #120                // Method handleInfo:(Ljava/util/StringTokenizer;Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;)Z
       269: goto          324
       272: aload_0
       273: aload_2
       274: invokespecial #124                // Method handleStatus:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;)Z
       277: goto          324
       280: aload_0
       281: aload_3
       282: aload_2
       283: invokespecial #127                // Method handleReload:(Ljava/util/StringTokenizer;Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;)Z
       286: goto          324
       289: aload_0
       290: aload_3
       291: aload_2
       292: invokespecial #130                // Method handleUnload:(Ljava/util/StringTokenizer;Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;)Z
       295: goto          324
       298: aload_0
       299: aload_2
       300: invokespecial #133                // Method handleBenchmark:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;)Z
       303: goto          324
       306: aload_0
       307: aload_3
       308: aload_2
       309: invokespecial #136                // Method handleConfig:(Ljava/util/StringTokenizer;Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;)Z
       312: goto          324
       315: aload_0
       316: aload_2
       317: invokespecial #139                // Method handleHelp:(Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;)Z
       320: goto          324
       323: iconst_0
       324: ireturn
      StackMapTable: number_of_entries = 21
        frame_type = 252 /* append */
          offset_delta = 18
          locals = [ class java/util/StringTokenizer ]
        frame_type = 253 /* append */
          offset_delta = 109
          locals = [ class java/lang/String, class java/lang/String ]
        frame_type = 12 /* same */
        frame_type = 12 /* same */
        frame_type = 12 /* same */
        frame_type = 12 /* same */
        frame_type = 12 /* same */
        frame_type = 12 /* same */
        frame_type = 12 /* same */
        frame_type = 12 /* same */
        frame_type = 12 /* same */
        frame_type = 8 /* same */
        frame_type = 8 /* same */
        frame_type = 8 /* same */
        frame_type = 7 /* same */
        frame_type = 8 /* same */
        frame_type = 8 /* same */
        frame_type = 7 /* same */
        frame_type = 8 /* same */
        frame_type = 7 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
      LineNumberTable:
        line 52: 0
        line 53: 9
        line 55: 18
        line 55: 34
        line 57: 36
        line 58: 245
        line 59: 254
        line 60: 263
        line 61: 272
        line 62: 280
        line 63: 289
        line 64: 298
        line 65: 306
        line 66: 315
        line 67: 323
        line 57: 324
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            9     316     3    st   Ljava/util/StringTokenizer;
           36     289     4   cmd   Ljava/lang/String;
            0     325     0  this   Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;
            0     325     1 command   Ljava/lang/String;
            0     325     2 admin   Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #7()
          org.jetbrains.annotations.NotNull
      parameter 1:
        0: #7()
          org.jetbrains.annotations.NotNull

  public static final ext.mods.gameserver.geoengine.pathfinding.integration.L2BRAdminCommands$AdminInterface createAdminInterface(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: getstatic     #905                // Field Companion:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$Companion;
         3: aload_0
         4: invokevirtual #909                // Method ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$Companion.createAdminInterface:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;
         7: areturn
      LineNumberTable:
        line 574: 7
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0 player   Lext/mods/gameserver/model/actor/Player;
    RuntimeVisibleAnnotations:
      0: #901()
        kotlin.jvm.JvmStatic
    RuntimeInvisibleAnnotations:
      0: #7()
        org.jetbrains.annotations.NotNull
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #7()
          org.jetbrains.annotations.NotNull

  public static final ext.mods.gameserver.geoengine.pathfinding.generation.GeoIndexer$GeoDataProvider access$getGeoDataProvider$p(ext.mods.gameserver.geoengine.pathfinding.integration.L2BRAdminCommands);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;)Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;
    flags: (0x1019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #18                 // Field geoDataProvider:Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;
         4: areturn
      LineNumberTable:
        line 42: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0 $this   Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;

  public static final java.nio.file.Path access$getOutputPath$p(ext.mods.gameserver.geoengine.pathfinding.integration.L2BRAdminCommands);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;)Ljava/nio/file/Path;
    flags: (0x1019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field outputPath:Ljava/nio/file/Path;
         4: areturn
      LineNumberTable:
        line 42: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0 $this   Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;

  public static final ext.mods.gameserver.geoengine.pathfinding.serialization.Node access$toSerializationNode(ext.mods.gameserver.geoengine.pathfinding.integration.L2BRAdminCommands, ext.mods.gameserver.geoengine.pathfinding.model.IndexedNode);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;)Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;
    flags: (0x1019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #920                // Method toSerializationNode:(Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;)Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;
         5: areturn
      LineNumberTable:
        line 42: 2
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0 $this   Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;
            0       6     1 $receiver   Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;

  public static final ext.mods.gameserver.geoengine.pathfinding.serialization.SpatialGrid access$buildSpatialGrid(ext.mods.gameserver.geoengine.pathfinding.integration.L2BRAdminCommands, java.util.List);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;Ljava/util/List;)Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;
    flags: (0x1019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #925                // Method buildSpatialGrid:(Ljava/util/List;)Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;
         5: areturn
      LineNumberTable:
        line 42: 2
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0 $this   Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;
            0       6     1 nodes   Ljava/util/List;

  public static final ext.mods.gameserver.geoengine.pathfinding.serialization.NodeConnectivity access$calculateConnectivity(ext.mods.gameserver.geoengine.pathfinding.integration.L2BRAdminCommands, java.util.List);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;Ljava/util/List;)Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;
    flags: (0x1019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #929                // Method calculateConnectivity:(Ljava/util/List;)Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;
         5: areturn
      LineNumberTable:
        line 42: 2
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0 $this   Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;
            0       6     1 nodes   Ljava/util/List;

  public static final ext.mods.gameserver.geoengine.pathfinding.serialization.L2BRSerializer access$getSerializer$p(ext.mods.gameserver.geoengine.pathfinding.integration.L2BRAdminCommands);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;)Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer;
    flags: (0x1019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #36                 // Field serializer:Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer;
         4: areturn
      LineNumberTable:
        line 42: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0 $this   Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;

  public static final ext.mods.gameserver.geoengine.pathfinding.integration.GeoEngineBridge access$getBridge$p(ext.mods.gameserver.geoengine.pathfinding.integration.L2BRAdminCommands);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;)Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;
    flags: (0x1019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #14                 // Field bridge:Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;
         4: areturn
      LineNumberTable:
        line 42: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0 $this   Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;

  public static final java.util.concurrent.ConcurrentHashMap access$getActiveGenerations$p(ext.mods.gameserver.geoengine.pathfinding.integration.L2BRAdminCommands);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;)Ljava/util/concurrent/ConcurrentHashMap;
    flags: (0x1019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #29                 // Field activeGenerations:Ljava/util/concurrent/ConcurrentHashMap;
         4: areturn
      LineNumberTable:
        line 42: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0 $this   Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;

  public static final java.lang.String access$format(ext.mods.gameserver.geoengine.pathfinding.integration.L2BRAdminCommands, double, int);
    descriptor: (Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;DI)Ljava/lang/String;
    flags: (0x1019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC
    Code:
      stack=4, locals=4, args_size=3
         0: aload_0
         1: dload_1
         2: iload_3
         3: invokespecial #939                // Method format:(DI)Ljava/lang/String;
         6: areturn
      LineNumberTable:
        line 42: 3
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0 $this   Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;
            0       7     1 $receiver   D
            0       7     3 decimals   I

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #907                // class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$Companion
         3: dup
         4: aconst_null
         5: invokespecial #943                // Method ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$Companion."<init>":(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
         8: putstatic     #905                // Field Companion:Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$Companion;
        11: return
}
InnerClasses:
  public static #964= #210 of #963;       // GeoDataProvider=class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider of class ext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer
  public static final #965= #616 of #328; // BridgeConfig=class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge$BridgeConfig of class ext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge
  public static #960= #153 of #2;         // AdminInterface=class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface of class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands
  public static final #902= #907 of #2;   // Companion=class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$Companion of class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands
  public static final #959= #479 of #2;   // HeaderInfo=class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$HeaderInfo of class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands
  static final #605;                      // class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleBenchmark$1
  static final #239;                      // class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerate$1
  static final #263;                      // class ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$handleGenerateAll$1
SourceFile: "AdminCommands.kt"
SourceDebugExtension:
  SMAP
  AdminCommands.kt
  Kotlin
  *S Kotlin
  *F
  + 1 AdminCommands.kt
  ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands
  + 2 _Collections.kt
  kotlin/collections/CollectionsKt___CollectionsKt
  + 3 fake.kt
  kotlin/jvm/internal/FakeKt
  *L
  1#1,576:1
  1915#2,2:577
  1924#2,3:580
  1220#2,2:583
  1249#2,4:585
  1924#2,2:589
  1915#2,2:591
  1926#2:593
  1#3:579
  *S KotlinDebug
  *F
  + 1 AdminCommands.kt
  ext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands
  *L
  314#1:577,2
  538#1:580,3
  548#1:583,2
  548#1:585,4
  550#1:589,2
  553#1:591,2
  550#1:593
  *E
RuntimeVisibleAnnotations:
  0: #945(#946=[I#947,I#948,I#949],#950=I#951,#952=I#953,#954=[s#955],#956=[s#38,s#357,s#11,s#12,s#15,s#16,s#19,s#20,s#5,s#6,s#26,s#27,s#257,s#357,s#357,s#33,s#34,s#52,s#144,s#357,s#145,s#146,s#111,s#140,s#141,s#115,s#118,s#121,s#125,s#474,s#526,s#583,s#128,s#131,s#134,s#137,s#708,s#357,s#736,s#737,s#957,s#767,s#768,s#818,s#423,s#357,s#819,s#958,s#959,s#960,s#902,s#961])
    kotlin.Metadata(
      mv=[2,3,0]
      k=1
      xi=48
      d1=["\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 22\u00020\u0001:\u0003012B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0018\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0018\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0018\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0018\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0007H\u0002J\u0018\u0010 \u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010!\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0018\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010#\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0014\u0010$\u001a\u00020\u0013*\u00020%2\u0006\u0010&\u001a\u00020\rH\u0002J\f\u0010\'\u001a\u00020(*\u00020)H\u0002J\u0016\u0010*\u001a\u00020+2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020)0-H\u0002J\u0016\u0010.\u001a\u00020/2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020)0-H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\n\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u000e0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00063"]
      d2=["Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands;","","bridge","Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;","geoDataProvider","Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;","outputPath","Ljava/nio/file/Path;","<init>","(Lext/mods/gameserver/geoengine/pathfinding/integration/GeoEngineBridge;Lext/mods/gameserver/geoengine/pathfinding/generation/GeoIndexer$GeoDataProvider;Ljava/nio/file/Path;)V","activeGenerations","Ljava/util/concurrent/ConcurrentHashMap;","Lkotlin/Pair;","","","serializer","Lext/mods/gameserver/geoengine/pathfinding/serialization/L2BRSerializer;","processCommand","command","","admin","Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$AdminInterface;","handleGenerate","st","Ljava/util/StringTokenizer;","handleGenerateAll","handleInfo","handleStatus","handleReload","readHeaderDebug","Lext/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands$HeaderInfo;","path","handleUnload","handleBenchmark","handleConfig","handleHelp","format","","decimals","toSerializationNode","Lext/mods/gameserver/geoengine/pathfinding/serialization/Node;","Lext/mods/gameserver/geoengine/pathfinding/model/IndexedNode;","buildSpatialGrid","Lext/mods/gameserver/geoengine/pathfinding/serialization/SpatialGrid;","nodes","","calculateConnectivity","Lext/mods/gameserver/geoengine/pathfinding/serialization/NodeConnectivity;","HeaderInfo","AdminInterface","Companion","Brproject"]
    )
RuntimeInvisibleAnnotations:
  0: #967(#685=[s#968])
    kotlin.jvm.internal.SourceDebugExtension(
      value=["SMAP\nAdminCommands.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdminCommands.kt\next/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,576:1\n1915#2,2:577\n1924#2,3:580\n1220#2,2:583\n1249#2,4:585\n1924#2,2:589\n1915#2,2:591\n1926#2:593\n1#3:579\n*S KotlinDebug\n*F\n+ 1 AdminCommands.kt\next/mods/gameserver/geoengine/pathfinding/integration/L2BRAdminCommands\n*L\n314#1:577,2\n538#1:580,3\n548#1:583,2\n548#1:585,4\n550#1:589,2\n553#1:591,2\n550#1:593\n*E\n"]
    )
BootstrapMethods:
  0: #202 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #195 Geração para [\u0001, \u0001] já está em andamento...
  1: #202 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #207 Iniciando geração L2BR para região §e[\u0001, \u0001]§7...
  2: #202 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #270 \u0001_\u0001.l2br
  3: #202 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #288 === Info Região [\u0001, \u0001] ===
  4: #202 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #295 Fonte .l2j: \u0001
  5: #202 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #300 Fonte _conv.dat: \u0001
  6: #202 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #307 Existe (\u0001 KB)
  7: #202 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #314 Cache .l2br: \u0001
  8: #202 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #345 Regiões ativas: \u0001
  9: #202 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #353 Gerações ativas: \u0001
  10: #202 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #362 Chamadas L2BR: \u0001
  11: #202 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #367 Chamadas Legacy: \u0001
  12: #202 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #372 Fallbacks: \u0001
  13: #202 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #377 Uso L2BR: \u0001%
  14: #202 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #382 Latência média L2BR: \u0001?s
  15: #202 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #387 Latência média Legacy: \u0001?s
  16: #202 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #430   \u0001: \u0001 nós (\u0001)
  17: #202 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #436   ... e \u0001 outras
  18: #202 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #458 Verificando arquivo: \u0001
  19: #202 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #466 Arquivo não encontrado: \u0001
  20: #202 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #469 Use //l2br_generate \u0001 \u0001 primeiro
  21: #202 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #472 Arquivo encontrado: \u0001KB
  22: #202 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #487 Header: \u0001 nós, versão \u0001
  23: #202 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #495 Erro ao ler header: \u0001
  24: #202 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #504 ? Região [\u0001, \u0001] carregada com sucesso!
  25: #202 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #507 ? Falha ao carregar: \u0001
  26: #202 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #523 Stack: \u0001
  27: #202 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #592 Descarregando região [\u0001, \u0001]...
  28: #202 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #600 Erro: \u0001
  29: #202 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #621 Global enabled: \u0001
  30: #202 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #629 Fallback to legacy: \u0001
  31: #202 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #635 Metrics enabled: \u0001
  32: #202 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #641 Warmup on load: \u0001
  33: #202 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #647 Max pathfinding time: \u0001?s
  34: #202 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #650 Output path: \u0001
  35: #202 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #672 Configuração desconhecida: \u0001
  36: #202 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #679 Configuração \'\u0001\' atualizada para: \u0001
  37: #202 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #716 %.\u0001f
